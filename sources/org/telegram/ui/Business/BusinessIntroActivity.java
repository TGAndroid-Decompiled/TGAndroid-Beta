package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.PhotoEditToolCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.HistoryFragment;

public final class BusinessIntroActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    public PeerStoriesView.AnonymousClass23 chatAttachAlert;
    public String currentMessage;
    public long currentSticker;
    public String currentTitle;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public AnonymousClass1 greetingsView;
    public Theme.AnonymousClass7 greetingsViewBackground;
    public TLRPC.InputDocument inputSticker;
    public String inputStickerPath;
    public boolean keyboardVisible;
    public AnonymousClass4 messageEdit;
    public AnonymousClass2 previewContainer;
    public AnonymousClass4 titleEdit;
    public boolean valueSet;
    public final BusinessIntroActivity$$ExternalSyntheticLambda2 updateRandomStickerRunnable = new BusinessIntroActivity$$ExternalSyntheticLambda2(this, 1);
    public boolean stickerRandom = true;
    public TLRPC.Document sticker = getMediaDataController().getGreetingsSticker();
    public boolean clearVisible = isEmpty();

    public final class AnonymousClass1 extends ChatGreetingsView {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setPivotX(getMeasuredWidth() / 2.0f);
            setPivotY(getMeasuredHeight());
        }
    }

    public final class AnonymousClass3 extends ImageView {
        @Override
        public final void onMeasure(int i, int i2) {
            float f;
            float f2;
            super.onMeasure(i, i2);
            Matrix imageMatrix = getImageMatrix();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                f = measuredHeight;
                f2 = intrinsicHeight;
            } else {
                f = measuredWidth;
                f2 = intrinsicWidth;
            }
            float f3 = f / f2;
            imageMatrix.setScale(f3, f3);
            setImageMatrix(imageMatrix);
        }
    }

    public static void access$600(BusinessIntroActivity businessIntroActivity) {
        if (businessIntroActivity.previewContainer.getParent() instanceof View) {
            int top = ((View) businessIntroActivity.previewContainer.getParent()).getTop();
            int measuredHeight = businessIntroActivity.previewContainer.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
            float fClamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
            businessIntroActivity.greetingsView.setScaleX(fClamp);
            businessIntroActivity.greetingsView.setScaleY(fClamp);
            businessIntroActivity.greetingsView.setAlpha(Utilities.clamp(fClamp * 2.0f, 1.0f, 0.0f));
            businessIntroActivity.previewContainer.invalidate();
        }
    }

    public final void checkDone$1(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || universalRecyclerView.adapter == null || this.clearVisible == (!isEmpty())) {
            return;
        }
        saveScrollPosition();
        this.listView.adapter.update(true);
        applyScrolledPosition();
    }

    @Override
    public final View createView(Context context) {
        int i = 3;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.greetingsView = new AnonymousClass1(context, getUserConfig().getCurrentUser(), this.currentAccount, this.sticker, getResourceProvider());
        ?? r0 = new FrameLayout(context) {
            public int minHeight = -1;
            public final Rect bg = new Rect();
            public final AnimatedFloat width = new AnimatedFloat(this, 220, CubicBezierInterpolator.EASE_OUT_QUINT);

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                float width = getWidth() / 2.0f;
                BusinessIntroActivity businessIntroActivity = BusinessIntroActivity.this;
                float f = this.width.set(businessIntroActivity.greetingsView.getWidth()) / 2.0f;
                int scaleX = (int) (width - (businessIntroActivity.greetingsView.getScaleX() * f));
                int scaleY = (int) (((1.0f - businessIntroActivity.greetingsView.getScaleY()) * businessIntroActivity.greetingsView.getHeight()) + businessIntroActivity.greetingsView.getY());
                int scaleX2 = (int) ((businessIntroActivity.greetingsView.getScaleX() * f) + width);
                int y = (int) (businessIntroActivity.greetingsView.getY() + businessIntroActivity.greetingsView.getHeight());
                Rect rect = this.bg;
                rect.set(scaleX, scaleY, scaleX2, y);
                businessIntroActivity.greetingsViewBackground.setBounds(rect);
                businessIntroActivity.greetingsViewBackground.draw(canvas);
                return super.drawChild(canvas, view, j);
            }

            @Override
            public final void onMeasure(int i2, int i3) {
                BusinessIntroActivity businessIntroActivity = BusinessIntroActivity.this;
                businessIntroActivity.greetingsView.measure(i2, i3);
                invalidate();
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(this.minHeight, AndroidUtilities.dp(36.0f) + businessIntroActivity.greetingsView.getMeasuredHeight()), 1073741824));
                if (this.minHeight < 0) {
                    this.minHeight = getMeasuredHeight();
                }
            }
        };
        this.previewContainer = r0;
        r0.setWillNotDraw(false);
        int iDp = AndroidUtilities.dp(16.0f);
        AnonymousClass1 anonymousClass1 = this.greetingsView;
        AnonymousClass2 anonymousClass2 = this.previewContainer;
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        int i2 = Theme.default_shadow_color;
        this.greetingsViewBackground = new Theme.AnonymousClass7(anonymousClass1, anonymousClass2, iDp, themedPaint);
        this.greetingsView.setBackground(new ColorDrawable(0));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context);
        anonymousClass3.setScaleType(ImageView.ScaleType.MATRIX);
        anonymousClass3.setImageDrawable(PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, getUserConfig().getClientUserId(), Theme.currentTheme.isDark()));
        addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 119));
        addView(this.greetingsView, LayoutHelper.createFrame(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        ?? r1 = new EditTextCell(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0) {
            public final int $r8$classId;
            public final BusinessIntroActivity this$0;

            {
                super(context, str, false, false, i, resourcesProvider);
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$0 = this;
                        super(context, str, true, false, i, resourcesProvider);
                        break;
                    default:
                        this.this$0 = this;
                        break;
                }
            }

            @Override
            public final void onFocusChanged(boolean z) {
                UniversalRecyclerView universalRecyclerView;
                UniversalRecyclerView universalRecyclerView2;
                switch (this.$r8$classId) {
                    case 0:
                        if (z && (universalRecyclerView = this.this$0.listView) != null) {
                            universalRecyclerView.smoothScrollToPosition(2);
                            break;
                        }
                        break;
                    default:
                        if (z && (universalRecyclerView2 = this.this$0.listView) != null) {
                            universalRecyclerView2.smoothScrollToPosition(3);
                            break;
                        }
                        break;
                }
            }

            @Override
            public final void onTextChanged(CharSequence charSequence) {
                switch (this.$r8$classId) {
                    case 0:
                        BusinessIntroActivity businessIntroActivity = this.this$0;
                        businessIntroActivity.greetingsView.setPreview(businessIntroActivity.titleEdit.getText().toString(), businessIntroActivity.messageEdit.getText().toString());
                        businessIntroActivity.checkDone$1(true);
                        break;
                    default:
                        BusinessIntroActivity businessIntroActivity2 = this.this$0;
                        businessIntroActivity2.greetingsView.setPreview(businessIntroActivity2.titleEdit.getText().toString(), businessIntroActivity2.messageEdit.getText().toString());
                        businessIntroActivity2.checkDone$1(true);
                        break;
                }
            }
        };
        this.titleEdit = r1;
        r1.autofocused = true;
        r1.setShowLimitOnFocus(true);
        AnonymousClass4 anonymousClass4 = this.titleEdit;
        int i3 = Theme.key_windowBackgroundWhite;
        anonymousClass4.setBackgroundColor(getThemedColor(i3));
        setDivider(true);
        hideKeyboardOnEnter();
        ?? r2 = new EditTextCell(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1) {
            public final int $r8$classId;
            public final BusinessIntroActivity this$0;

            {
                super(context, str, false, false, i, resourcesProvider);
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$0 = this;
                        super(context, str, true, false, i, resourcesProvider);
                        break;
                    default:
                        this.this$0 = this;
                        break;
                }
            }

            @Override
            public final void onFocusChanged(boolean z) {
                UniversalRecyclerView universalRecyclerView;
                UniversalRecyclerView universalRecyclerView2;
                switch (this.$r8$classId) {
                    case 0:
                        if (z && (universalRecyclerView = this.this$0.listView) != null) {
                            universalRecyclerView.smoothScrollToPosition(2);
                            break;
                        }
                        break;
                    default:
                        if (z && (universalRecyclerView2 = this.this$0.listView) != null) {
                            universalRecyclerView2.smoothScrollToPosition(3);
                            break;
                        }
                        break;
                }
            }

            @Override
            public final void onTextChanged(CharSequence charSequence) {
                switch (this.$r8$classId) {
                    case 0:
                        BusinessIntroActivity businessIntroActivity = this.this$0;
                        businessIntroActivity.greetingsView.setPreview(businessIntroActivity.titleEdit.getText().toString(), businessIntroActivity.messageEdit.getText().toString());
                        businessIntroActivity.checkDone$1(true);
                        break;
                    default:
                        BusinessIntroActivity businessIntroActivity2 = this.this$0;
                        businessIntroActivity2.greetingsView.setPreview(businessIntroActivity2.titleEdit.getText().toString(), businessIntroActivity2.messageEdit.getText().toString());
                        businessIntroActivity2.checkDone$1(true);
                        break;
                }
            }
        };
        this.messageEdit = r2;
        r2.setShowLimitOnFocus(true);
        setBackgroundColor(getThemedColor(i3));
        setDivider(true);
        hideKeyboardOnEnter();
        this.greetingsView.setPreview("", "");
        super.createView(context);
        this.listView.setSections();
        this.listView.adapter.setApplyBackground(false);
        this.actionBar.setAdaptiveBackground(this.listView);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 2));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i4 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i4, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i4, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$1(false);
        this.listView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 1));
        this.listView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, i));
        this.listView.doNotDetachViews();
        this.listView.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        setValue$1$1();
        new KeyboardNotifier(this.fragmentView, false, new DialogCell$$ExternalSyntheticLambda6(this, i));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue$1$1();
        }
    }

    @Override
    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.previewContainer));
        zzke.m(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(UItem.asCustom(this.titleEdit));
        arrayList.add(UItem.asCustom(this.messageEdit));
        if (this.stickerRandom) {
            arrayList.add(UItem.asButton(1, LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom)));
        } else if (this.inputStickerPath != null) {
            arrayList.add(UItem.asStickerButton(1, LocaleController.getString(R.string.BusinessIntroSticker), this.inputStickerPath));
        } else {
            arrayList.add(UItem.asStickerButton(1, LocaleController.getString(R.string.BusinessIntroSticker), this.sticker));
        }
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean zIsEmpty = isEmpty();
        this.clearVisible = !zIsEmpty;
        if (!zIsEmpty) {
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asButton(2, LocaleController.getString(R.string.BusinessIntroReset)).red());
        }
        arrayList.add(UItem.asLargeShadow(null));
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    public final boolean hasChanges() {
        TLRPC.Document document;
        String string = getText().toString();
        String str = this.currentTitle;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(string, str)) {
            return true;
        }
        String string2 = getText().toString();
        String str2 = this.currentMessage;
        if (!TextUtils.equals(string2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z = this.stickerRandom;
        if (((z || (document = this.sticker) == null) ? 0L : document.id) == this.currentSticker) {
            return (z || this.inputSticker == null) ? false : true;
        }
        return true;
    }

    public final boolean isEmpty() {
        AnonymousClass4 anonymousClass4 = this.titleEdit;
        if (anonymousClass4 == null || this.messageEdit == null) {
            return true;
        }
        return TextUtils.isEmpty(anonymousClass4.getText()) && TextUtils.isEmpty(getText()) && this.stickerRandom;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!hasChanges()) {
            return super.onBackPressed(z);
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessIntroUnsavedChanges));
            final int i = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
                public final BusinessIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    switch (i) {
                        case 0:
                            this.f$0.processDone$1();
                            break;
                        default:
                            this.f$0.lambda$onBackPressed$6(alertDialog, i2);
                            break;
                    }
                }
            });
            final int i2 = 1;
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener(this) {
                public final BusinessIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.processDone$1();
                            break;
                        default:
                            this.f$0.lambda$onBackPressed$6(alertDialog, i3);
                            break;
                    }
                }
            });
            showDialog(builder.create());
        }
        return false;
    }

    @Override
    public final void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 1) {
            EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getContext(), true, true, getResourceProvider());
            emojiBottomSheet.onDocumentSelected = new PhotoEditToolCell$$ExternalSyntheticLambda0(26, this, view);
            int i3 = 0;
            emojiBottomSheet.onPlusSelected = new BusinessIntroActivity$$ExternalSyntheticLambda2(this, i3);
            View[] viewPages = emojiBottomSheet.viewPager.getViewPages();
            while (i3 < viewPages.length) {
                View view2 = viewPages[i3];
                if (view2 instanceof EmojiBottomSheet.Page) {
                    EmojiBottomSheet.Page.Adapter adapter = ((EmojiBottomSheet.Page) view2).adapter;
                    if (adapter.query == null) {
                        adapter.updateItems$1(null);
                    }
                }
                i3++;
            }
            showDialog(emojiBottomSheet);
            return;
        }
        if (i2 == 2) {
            setText("");
            setText("");
            AndroidUtilities.hideKeyboard(this.titleEdit.editText);
            AndroidUtilities.hideKeyboard(this.messageEdit.editText);
            this.stickerRandom = true;
            this.greetingsView.setPreview("", "");
            AnonymousClass1 anonymousClass1 = this.greetingsView;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.sticker = greetingsSticker;
            anonymousClass1.setSticker(greetingsSticker);
            BusinessIntroActivity$$ExternalSyntheticLambda2 businessIntroActivity$$ExternalSyntheticLambda2 = this.updateRandomStickerRunnable;
            AndroidUtilities.cancelRunOnUIThread(businessIntroActivity$$ExternalSyntheticLambda2);
            AndroidUtilities.runOnUIThread(businessIntroActivity$$ExternalSyntheticLambda2, 5000L);
            checkDone$1(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    public final void openCustomStickerEditor() {
        ContentPreviewViewer.getInstance().setStickerSetForCustomSticker(null);
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity() != null && getContext() != null && this.chatAttachAlert == null) {
            PeerStoriesView.AnonymousClass23 anonymousClass23 = new PeerStoriesView.AnonymousClass23(this, getParentActivity(), this, this.resourceProvider);
            this.chatAttachAlert = anonymousClass23;
            anonymousClass23.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                }

                @Override
                public final void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
                }

                @Override
                public final void doOnIdle(Runnable runnable) {
                    NotificationCenter.getInstance(((BaseFragment) BusinessIntroActivity.this).currentAccount).doOnIdle(runnable);
                }

                @Override
                public final View getRevealView() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
                }

                @Override
                public final boolean needEnterComment() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
                }

                @Override
                public final void onCameraOpened() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
                }

                @Override
                public final void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
                }

                @Override
                public final void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
                }

                @Override
                public final boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
                }

                @Override
                public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
                }
            });
        }
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        this.chatAttachAlert.setMaxSelectedPhotos(1, false);
        this.chatAttachAlert.setOpenWithFrontFaceCamera(true);
        this.chatAttachAlert.enableStickerMode(new GiftSheet$$ExternalSyntheticLambda8(this, 3));
        this.chatAttachAlert.init();
        PeerStoriesView.AnonymousClass23 anonymousClass24 = this.chatAttachAlert;
        anonymousClass24.parentThemeDelegate = null;
        if (this.visibleDialog != null) {
            anonymousClass24.show();
        } else {
            showDialog(anonymousClass24);
        }
    }

    public final void processDone$1() {
        TLRPC.Document document;
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!isEmpty()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = getText().toString();
            updatebusinessintro.intro.description = getText().toString();
            if (!this.stickerRandom && (this.sticker != null || this.inputSticker != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.inputSticker;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.sticker);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.stickerRandom && (document = this.sticker) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new RichMediaUploader$$ExternalSyntheticLambda0(this, 7));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void setValue$1$1() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            AnonymousClass4 anonymousClass4 = this.titleEdit;
            String str = tL_businessIntro.title;
            this.currentTitle = str;
            anonymousClass4.setText(str);
            AnonymousClass4 anonymousClass5 = this.messageEdit;
            String str2 = userFull.business_intro.description;
            this.currentMessage = str2;
            anonymousClass5.setText(str2);
            this.sticker = userFull.business_intro.sticker;
        } else {
            AnonymousClass4 anonymousClass6 = this.titleEdit;
            this.currentTitle = "";
            anonymousClass6.setText("");
            AnonymousClass4 anonymousClass7 = this.messageEdit;
            this.currentMessage = "";
            anonymousClass7.setText("");
            this.inputSticker = null;
            this.sticker = null;
        }
        TLRPC.Document document = this.sticker;
        this.currentSticker = document == null ? 0L : document.id;
        this.stickerRandom = document == null;
        AnonymousClass1 anonymousClass1 = this.greetingsView;
        if (anonymousClass1 != null) {
            anonymousClass1.setPreview(getText().toString(), getText().toString());
            AnonymousClass1 anonymousClass2 = this.greetingsView;
            TLRPC.Document greetingsSticker = this.sticker;
            if (greetingsSticker == null || this.stickerRandom) {
                greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            anonymousClass2.setSticker(greetingsSticker);
        }
        if (this.stickerRandom) {
            BusinessIntroActivity$$ExternalSyntheticLambda2 businessIntroActivity$$ExternalSyntheticLambda2 = this.updateRandomStickerRunnable;
            AndroidUtilities.cancelRunOnUIThread(businessIntroActivity$$ExternalSyntheticLambda2);
            AndroidUtilities.runOnUIThread(businessIntroActivity$$ExternalSyntheticLambda2, 5000L);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        this.valueSet = true;
    }

    public final void updateRandomSticker() {
        AnonymousClass1 anonymousClass1 = this.greetingsView;
        if (anonymousClass1 != null && anonymousClass1.isAttachedToWindow() && this.stickerRandom) {
            this.greetingsView.setNextSticker(MediaDataController.getInstance(this.currentAccount).getGreetingsSticker(), new BusinessIntroActivity$$ExternalSyntheticLambda2(this, 2));
        }
    }
}
