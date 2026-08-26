package org.telegram.ui.Business;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.ChatGreetingsView$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.VoIPFragment;

public final class BusinessIntroActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    public ChatActivity.AnonymousClass78 chatAttachAlert;
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
    public ChatAttachAlert.AnonymousClass18 previewContainer;
    public AnonymousClass4 titleEdit;
    public boolean valueSet;
    public final BusinessIntroActivity$$ExternalSyntheticLambda3 updateRandomStickerRunnable = new BusinessIntroActivity$$ExternalSyntheticLambda3(this, 0);
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
        UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
        if (anonymousClass3 == null || anonymousClass3.adapter == null || this.clearVisible == (!isEmpty())) {
            return;
        }
        UniversalFragment.AnonymousClass3 anonymousClass4 = this.listView;
        if (anonymousClass4 != null && anonymousClass4.getChildCount() > 0) {
            View view = null;
            int top = Integer.MAX_VALUE;
            int i = -1;
            for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(this.listView.getChildAt(i2));
                View childAt = this.listView.getChildAt(i2);
                if (childAdapterPosition != -1 && childAt.getTop() < top) {
                    top = childAt.getTop();
                    i = childAdapterPosition;
                    view = childAt;
                }
            }
            if (view != null) {
                this.savedScrollPosition = i;
                int top2 = view.getTop();
                this.savedScrollOffset = top2;
                if (this.savedScrollPosition == 0 && top2 > AndroidUtilities.dp(88.0f)) {
                    this.savedScrollOffset = AndroidUtilities.dp(88.0f);
                }
                this.listView.layoutManager.scrollToPositionWithOffset(i, view.getTop() - this.listView.getPaddingTop());
            }
        }
        this.listView.adapter.update(true);
        int i3 = this.savedScrollPosition;
        if (i3 >= 0) {
            UniversalFragment.AnonymousClass3 anonymousClass5 = this.listView;
            anonymousClass5.layoutManager.scrollToPositionWithOffset(i3, this.savedScrollOffset - anonymousClass5.getPaddingTop());
        }
    }

    @Override
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.greetingsView = new AnonymousClass1(context, this.currentAccount, this.sticker, getResourceProvider());
        ChatAttachAlert.AnonymousClass18 anonymousClass18 = new ChatAttachAlert.AnonymousClass18(this, context);
        this.previewContainer = anonymousClass18;
        anonymousClass18.setWillNotDraw(false);
        this.greetingsViewBackground = new Theme.AnonymousClass7(this.greetingsView, this.previewContainer, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.greetingsView.setBackground(new ColorDrawable(0));
        VoIPFragment.AnonymousClass9 anonymousClass9 = new VoIPFragment.AnonymousClass9(context, 1);
        anonymousClass9.setScaleType(ImageView.ScaleType.MATRIX);
        anonymousClass9.setImageDrawable(PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, getUserConfig().getClientUserId(), Theme.currentTheme.isDark()));
        this.previewContainer.addView(anonymousClass9, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.addView(this.greetingsView, LayoutHelper.createFrame(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        ?? r0 = new EditTextCell(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0) {
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
                UniversalFragment.AnonymousClass3 anonymousClass3;
                UniversalFragment.AnonymousClass3 anonymousClass4;
                switch (this.$r8$classId) {
                    case 0:
                        if (z && (anonymousClass3 = this.this$0.listView) != null) {
                            anonymousClass3.smoothScrollToPosition(2);
                            break;
                        }
                        break;
                    default:
                        if (z && (anonymousClass4 = this.this$0.listView) != null) {
                            anonymousClass4.smoothScrollToPosition(3);
                            break;
                        }
                        break;
                }
            }

            @Override
            public final void onTextChanged(Editable editable) {
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
        this.titleEdit = r0;
        r0.autofocused = true;
        r0.setShowLimitOnFocus(true);
        AnonymousClass4 anonymousClass4 = this.titleEdit;
        int i = Theme.key_windowBackgroundWhite;
        anonymousClass4.setBackgroundColor(getThemedColor(i));
        setDivider(true);
        hideKeyboardOnEnter();
        ?? r1 = new EditTextCell(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1) {
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
                UniversalFragment.AnonymousClass3 anonymousClass3;
                UniversalFragment.AnonymousClass3 anonymousClass5;
                switch (this.$r8$classId) {
                    case 0:
                        if (z && (anonymousClass3 = this.this$0.listView) != null) {
                            anonymousClass3.smoothScrollToPosition(2);
                            break;
                        }
                        break;
                    default:
                        if (z && (anonymousClass5 = this.this$0.listView) != null) {
                            anonymousClass5.smoothScrollToPosition(3);
                            break;
                        }
                        break;
                }
            }

            @Override
            public final void onTextChanged(Editable editable) {
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
        this.messageEdit = r1;
        r1.setShowLimitOnFocus(true);
        setBackgroundColor(getThemedColor(i));
        setDivider(true);
        hideKeyboardOnEnter();
        this.greetingsView.setPreview("", "");
        super.createView(context);
        this.listView.setSections();
        UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
        anonymousClass3.adapter.applyBackground = false;
        this.actionBar.setAdaptiveBackground(anonymousClass3);
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 6));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i2, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$1(false);
        this.listView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 1));
        this.listView.addOnScrollListener(new ChatActivity.AnonymousClass53(this, 5));
        UniversalFragment.AnonymousClass3 anonymousClass5 = this.listView;
        anonymousClass5.doNotDetachViews = true;
        anonymousClass5.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        setValue$1$1();
        new KeyboardNotifier(this.fragmentView, false, new DialogCell$$ExternalSyntheticLambda6(this, 4));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue$1$1();
        }
    }

    @Override
    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.previewContainer));
        String string = LocaleController.getString(R.string.BusinessIntroHeader);
        UItem uItem = new UItem(0);
        uItem.text = string;
        arrayList.add(uItem);
        arrayList.add(UItem.asCustom(this.titleEdit));
        arrayList.add(UItem.asCustom(this.messageEdit));
        if (this.stickerRandom) {
            arrayList.add(UItem.asButton(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.inputStickerPath != null) {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.inputStickerPath;
            UItem uItem2 = new UItem(3);
            uItem2.id = 1;
            uItem2.text = string2;
            uItem2.object = str;
            arrayList.add(uItem2);
        } else {
            String string3 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.sticker;
            UItem uItem3 = new UItem(3);
            uItem3.id = 1;
            uItem3.text = string3;
            uItem3.object = document;
            arrayList.add(uItem3);
        }
        String string4 = LocaleController.getString(R.string.BusinessIntroInfo);
        UItem uItem4 = new UItem(7);
        uItem4.text = string4;
        arrayList.add(uItem4);
        boolean zIsEmpty = isEmpty();
        this.clearVisible = !zIsEmpty;
        if (!zIsEmpty) {
            UItem uItem5 = new UItem(7);
            uItem5.text = null;
            arrayList.add(uItem5);
            UItem uItemAsButton = UItem.asButton(2, LocaleController.getString(R.string.BusinessIntroReset));
            uItemAsButton.red = true;
            arrayList.add(uItemAsButton);
        }
        UItem uItem6 = new UItem(8);
        uItem6.text = null;
        arrayList.add(uItem6);
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
            String string = LocaleController.getString(R.string.UnsavedChanges);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
            final int i = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
                public final BusinessIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    switch (i) {
                        case 0:
                            this.f$0.processDone$1();
                            break;
                        default:
                            this.f$0.lambda$onBackPressed$6(alertDialog2, i2);
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
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.processDone$1();
                            break;
                        default:
                            this.f$0.lambda$onBackPressed$6(alertDialog2, i3);
                            break;
                    }
                }
            });
            showDialog(alertDialog);
        }
        return false;
    }

    @Override
    public final void onClick$1(UItem uItem, View view) {
        int i = uItem.id;
        if (i == 1) {
            EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getParentActivity(), getResourceProvider(), true, true);
            emojiBottomSheet.onDocumentSelected = new ArticleViewer$$ExternalSyntheticLambda16(20, this, view);
            emojiBottomSheet.onPlusSelected = new BusinessIntroActivity$$ExternalSyntheticLambda3(this, 1);
            for (View view2 : emojiBottomSheet.viewPager.getViewPages()) {
                if (view2 instanceof EmojiBottomSheet.Page) {
                    EmojiBottomSheet.Page.Adapter adapter = ((EmojiBottomSheet.Page) view2).adapter;
                    if (adapter.query == null) {
                        adapter.updateItems$1(null);
                    }
                }
            }
            showDialog(emojiBottomSheet);
            return;
        }
        if (i == 2) {
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
            BusinessIntroActivity$$ExternalSyntheticLambda3 businessIntroActivity$$ExternalSyntheticLambda3 = this.updateRandomStickerRunnable;
            AndroidUtilities.cancelRunOnUIThread(businessIntroActivity$$ExternalSyntheticLambda3);
            AndroidUtilities.runOnUIThread(businessIntroActivity$$ExternalSyntheticLambda3, 5000L);
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
    public final boolean onLongClick(UItem uItem, View view) {
        return false;
    }

    public final void openCustomStickerEditor() {
        BusinessIntroActivity businessIntroActivity;
        ContentPreviewViewer.getInstance().stickerSetForCustomSticker = null;
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity() == null || getParentActivity() == null || this.chatAttachAlert != null) {
            businessIntroActivity = this;
        } else {
            businessIntroActivity = this;
            ChatActivity.AnonymousClass78 anonymousClass78 = new ChatActivity.AnonymousClass78(businessIntroActivity, getParentActivity(), this, this.resourceProvider, 1);
            businessIntroActivity.chatAttachAlert = anonymousClass78;
            ((ChatAttachAlert) anonymousClass78).delegate = new ChatActivity.AnonymousClass1(this, 18);
        }
        businessIntroActivity.chatAttachAlert.photoLayout.loadGalleryPhotos();
        businessIntroActivity.chatAttachAlert.setMaxSelectedPhotos(1, false);
        ChatActivity.AnonymousClass78 anonymousClass79 = businessIntroActivity.chatAttachAlert;
        anonymousClass79.openWithFrontFaceCamera = true;
        anonymousClass79.enableStickerMode(new CallLogActivity$$ExternalSyntheticLambda3(this, 4));
        businessIntroActivity.chatAttachAlert.init();
        ChatActivity.AnonymousClass78 anonymousClass710 = businessIntroActivity.chatAttachAlert;
        anonymousClass710.parentThemeDelegate = null;
        if (businessIntroActivity.visibleDialog != null) {
            anonymousClass710.show();
        } else {
            showDialog(anonymousClass710);
        }
    }

    public final void processDone$1() {
        TLRPC.Document document;
        CrossfadeDrawable crossfadeDrawable = this.doneButtonDrawable;
        if (crossfadeDrawable.progress > 0.0f) {
            return;
        }
        crossfadeDrawable.animateToProgress(1.0f);
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
        getConnectionsManager().sendRequest(updatebusinessintro, new CallLogActivity$$ExternalSyntheticLambda1(this, 8));
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
            BusinessIntroActivity$$ExternalSyntheticLambda3 businessIntroActivity$$ExternalSyntheticLambda3 = this.updateRandomStickerRunnable;
            AndroidUtilities.cancelRunOnUIThread(businessIntroActivity$$ExternalSyntheticLambda3);
            AndroidUtilities.runOnUIThread(businessIntroActivity$$ExternalSyntheticLambda3, 5000L);
        }
        UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
        if (anonymousClass3 != null && (universalAdapter = anonymousClass3.adapter) != null) {
            universalAdapter.update(true);
        }
        this.valueSet = true;
    }

    public final void updateRandomSticker() {
        AnonymousClass1 anonymousClass1 = this.greetingsView;
        if (anonymousClass1 != null && anonymousClass1.isAttachedToWindow() && this.stickerRandom) {
            AnonymousClass1 anonymousClass2 = this.greetingsView;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            BusinessIntroActivity$$ExternalSyntheticLambda3 businessIntroActivity$$ExternalSyntheticLambda3 = new BusinessIntroActivity$$ExternalSyntheticLambda3(this, 2);
            if (greetingsSticker == null) {
                anonymousClass2.getClass();
                return;
            }
            AnimatorSet animatorSet = anonymousClass2.togglingStickersAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            anonymousClass2.nextStickerToSendView.getImageReceiver().setDelegate(new ChatGreetingsView.AnonymousClass2(anonymousClass2, businessIntroActivity$$ExternalSyntheticLambda3));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, Theme.key_chat_serviceBackground, 1.0f);
            if (svgThumb != null) {
                anonymousClass2.nextStickerToSendView.setImage$1(ImageLocation.getForDocument(greetingsSticker), ChatGreetingsView.createFilter(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                anonymousClass2.nextStickerToSendView.setImage(ImageLocation.getForDocument(greetingsSticker), ChatGreetingsView.createFilter(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, null, null, 0, greetingsSticker);
            }
            anonymousClass2.nextStickerToSendView.setOnClickListener(new ChatGreetingsView$$ExternalSyntheticLambda2(anonymousClass2, greetingsSticker, 1));
        }
    }
}
