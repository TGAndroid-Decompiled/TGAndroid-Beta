package org.telegram.ui.Business;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Matrix;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$TL_account_updateBusinessIntro;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_businessIntro;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputBusinessIntro;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
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
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.Stories.recorder.PreviewView;
public class BusinessIntroActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    private ChatAttachAlert chatAttachAlert;
    private String currentMessage;
    private long currentSticker;
    private String currentTitle;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private ChatGreetingsView greetingsView;
    private Drawable greetingsViewBackground;
    private TLRPC$InputDocument inputSticker;
    private String inputStickerPath;
    private boolean keyboardVisible;
    private EditTextCell messageEdit;
    private FrameLayout previewContainer;
    private EditTextCell titleEdit;
    private boolean valueSet;
    private final Runnable updateRandomStickerRunnable = new Runnable() {
        @Override
        public final void run() {
            BusinessIntroActivity.this.updateRandomSticker();
        }
    };
    private boolean stickerRandom = true;
    private TLRPC$Document sticker = getMediaDataController().getGreetingsSticker();
    private boolean clearVisible = isEmpty();

    @Override
    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    public void updateRandomSticker() {
        ChatGreetingsView chatGreetingsView = this.greetingsView;
        if (chatGreetingsView != null && chatGreetingsView.isAttachedToWindow() && this.stickerRandom) {
            this.greetingsView.setNextSticker(MediaDataController.getInstance(this.currentAccount).getGreetingsSticker(), new Runnable() {
                @Override
                public final void run() {
                    BusinessIntroActivity.this.lambda$updateRandomSticker$0();
                }
            });
        }
    }

    public void lambda$updateRandomSticker$0() {
        AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
        AndroidUtilities.runOnUIThread(this.updateRandomStickerRunnable, 5000L);
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override
    public View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.greetingsView = new ChatGreetingsView(this, context, getUserConfig().getCurrentUser(), 1, this.currentAccount, this.sticker, getResourceProvider()) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth() / 2.0f);
                setPivotY(getMeasuredHeight());
            }
        };
        FrameLayout frameLayout = new FrameLayout(context) {
            int minHeight = -1;
            private final Rect bg = new Rect();
            private final AnimatedFloat width = new AnimatedFloat(this, 220, CubicBezierInterpolator.EASE_OUT_QUINT);

            @Override
            protected void onMeasure(int i, int i2) {
                BusinessIntroActivity.this.greetingsView.measure(i, i2);
                invalidate();
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(this.minHeight, BusinessIntroActivity.this.greetingsView.getMeasuredHeight() + AndroidUtilities.dp(36.0f)), 1073741824));
                if (this.minHeight < 0) {
                    this.minHeight = getMeasuredHeight();
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                float width = getWidth() / 2.0f;
                float f = this.width.set(BusinessIntroActivity.this.greetingsView.getWidth()) / 2.0f;
                this.bg.set((int) (width - (BusinessIntroActivity.this.greetingsView.getScaleX() * f)), (int) (BusinessIntroActivity.this.greetingsView.getY() + (BusinessIntroActivity.this.greetingsView.getHeight() * (1.0f - BusinessIntroActivity.this.greetingsView.getScaleY()))), (int) (width + (f * BusinessIntroActivity.this.greetingsView.getScaleX())), (int) (BusinessIntroActivity.this.greetingsView.getY() + BusinessIntroActivity.this.greetingsView.getHeight()));
                BusinessIntroActivity.this.greetingsViewBackground.setBounds(this.bg);
                BusinessIntroActivity.this.greetingsViewBackground.draw(canvas);
                return super.drawChild(canvas, view, j);
            }
        };
        this.previewContainer = frameLayout;
        frameLayout.setWillNotDraw(false);
        this.greetingsViewBackground = Theme.createServiceDrawable(AndroidUtilities.dp(16.0f), this.greetingsView, this.previewContainer, getThemedPaint("paintChatActionBackground"));
        this.greetingsView.setBackground(new ColorDrawable(0));
        ImageView imageView = new ImageView(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
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
        };
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageDrawable(PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, getUserConfig().getClientUserId(), Theme.isCurrentThemeDark()));
        this.previewContainer.addView(imageView, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.addView(this.greetingsView, LayoutHelper.createFrame(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.BusinessIntroTitleHint), false, getMessagesController().introTitleLengthLimit, this.resourceProvider) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                BusinessIntroActivity.this.greetingsView.setPreview(BusinessIntroActivity.this.titleEdit.getText().toString(), BusinessIntroActivity.this.messageEdit.getText().toString());
                BusinessIntroActivity.this.checkDone(true, true);
            }

            @Override
            protected void onFocusChanged(boolean z) {
                UniversalRecyclerView universalRecyclerView;
                if (!z || (universalRecyclerView = BusinessIntroActivity.this.listView) == null) {
                    return;
                }
                universalRecyclerView.smoothScrollToPosition(2);
            }
        };
        this.titleEdit = editTextCell;
        editTextCell.autofocused = true;
        editTextCell.setShowLimitOnFocus(true);
        EditTextCell editTextCell2 = this.titleEdit;
        int i = Theme.key_windowBackgroundWhite;
        editTextCell2.setBackgroundColor(getThemedColor(i));
        this.titleEdit.setDivider(true);
        this.titleEdit.hideKeyboardOnEnter();
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.BusinessIntroMessageHint), true, getMessagesController().introDescriptionLengthLimit, this.resourceProvider) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                BusinessIntroActivity.this.greetingsView.setPreview(BusinessIntroActivity.this.titleEdit.getText().toString(), BusinessIntroActivity.this.messageEdit.getText().toString());
                BusinessIntroActivity.this.checkDone(true, true);
            }

            @Override
            protected void onFocusChanged(boolean z) {
                UniversalRecyclerView universalRecyclerView;
                if (!z || (universalRecyclerView = BusinessIntroActivity.this.listView) == null) {
                    return;
                }
                universalRecyclerView.smoothScrollToPosition(3);
            }
        };
        this.messageEdit = editTextCell3;
        editTextCell3.setShowLimitOnFocus(true);
        this.messageEdit.setBackgroundColor(getThemedColor(i));
        this.messageEdit.setDivider(true);
        this.messageEdit.hideKeyboardOnEnter();
        this.greetingsView.setPreview("", "");
        super.createView(context);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (BusinessIntroActivity.this.onBackPressed()) {
                        BusinessIntroActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    BusinessIntroActivity.this.processDone();
                }
            }
        });
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor(i2)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        checkDone(false, true);
        this.listView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                BusinessIntroActivity.this.updateGreetingScale();
            }
        });
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                BusinessIntroActivity.this.updateGreetingScale();
            }
        });
        this.listView.doNotDetachViews();
        this.listView.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        setValue();
        new KeyboardNotifier(this.fragmentView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BusinessIntroActivity.this.lambda$createView$1((Integer) obj);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$1(Integer num) {
        boolean z = num.intValue() > AndroidUtilities.dp(20.0f);
        if (this.keyboardVisible == z) {
            return;
        }
        this.keyboardVisible = z;
        if (z) {
            return;
        }
        this.listView.smoothScrollToPosition(0);
    }

    public void updateGreetingScale() {
        if (this.previewContainer.getParent() instanceof View) {
            int top = ((View) this.previewContainer.getParent()).getTop();
            int measuredHeight = this.previewContainer.getMeasuredHeight() - AndroidUtilities.dp(36.0f);
            float clamp = Utilities.clamp((top + measuredHeight) / measuredHeight, 1.0f, 0.65f);
            this.greetingsView.setScaleX(clamp);
            this.greetingsView.setScaleY(clamp);
            this.greetingsView.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            this.previewContainer.invalidate();
        }
    }

    @Override
    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.previewContainer));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BusinessIntroHeader)));
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
        boolean z = !isEmpty();
        this.clearVisible = z;
        if (z) {
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asButton(2, LocaleController.getString(R.string.BusinessIntroReset)).red());
        }
        arrayList.add(UItem.asLargeShadow(null));
    }

    public boolean isEmpty() {
        EditTextCell editTextCell = this.titleEdit;
        if (editTextCell == null || this.messageEdit == null) {
            return true;
        }
        return TextUtils.isEmpty(editTextCell.getText()) && TextUtils.isEmpty(this.messageEdit.getText()) && this.stickerRandom;
    }

    private void setValue() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC$TL_businessIntro tLRPC$TL_businessIntro = userFull.business_intro;
        if (tLRPC$TL_businessIntro != null) {
            EditTextCell editTextCell = this.titleEdit;
            String str = tLRPC$TL_businessIntro.title;
            this.currentTitle = str;
            editTextCell.setText(str);
            EditTextCell editTextCell2 = this.messageEdit;
            String str2 = userFull.business_intro.description;
            this.currentMessage = str2;
            editTextCell2.setText(str2);
            this.sticker = userFull.business_intro.sticker;
        } else {
            EditTextCell editTextCell3 = this.titleEdit;
            this.currentTitle = "";
            editTextCell3.setText("");
            EditTextCell editTextCell4 = this.messageEdit;
            this.currentMessage = "";
            editTextCell4.setText("");
            this.inputSticker = null;
            this.sticker = null;
        }
        TLRPC$Document tLRPC$Document = this.sticker;
        this.currentSticker = tLRPC$Document == null ? 0L : tLRPC$Document.id;
        this.stickerRandom = tLRPC$Document == null;
        ChatGreetingsView chatGreetingsView = this.greetingsView;
        if (chatGreetingsView != null) {
            chatGreetingsView.setPreview(this.titleEdit.getText().toString(), this.messageEdit.getText().toString());
            ChatGreetingsView chatGreetingsView2 = this.greetingsView;
            TLRPC$Document tLRPC$Document2 = this.sticker;
            if (tLRPC$Document2 == null || this.stickerRandom) {
                tLRPC$Document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            chatGreetingsView2.setSticker(tLRPC$Document2);
        }
        if (this.stickerRandom) {
            AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
            AndroidUtilities.runOnUIThread(this.updateRandomStickerRunnable, 5000L);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        this.valueSet = true;
    }

    @Override
    public void onClick(UItem uItem, final View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 1) {
            EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getContext(), true, getResourceProvider(), true);
            emojiBottomSheet.whenDocumentSelected(new Utilities.Callback3Return() {
                @Override
                public final Object run(Object obj, Object obj2, Object obj3) {
                    Boolean lambda$onClick$2;
                    lambda$onClick$2 = BusinessIntroActivity.this.lambda$onClick$2(view, obj, (TLRPC$Document) obj2, (Boolean) obj3);
                    return lambda$onClick$2;
                }
            });
            emojiBottomSheet.whenPlusSelected(new Runnable() {
                @Override
                public final void run() {
                    BusinessIntroActivity.this.openCustomStickerEditor();
                }
            });
            showDialog(emojiBottomSheet);
        } else if (i2 == 2) {
            this.titleEdit.setText("");
            this.messageEdit.setText("");
            AndroidUtilities.hideKeyboard(this.titleEdit.editText);
            AndroidUtilities.hideKeyboard(this.messageEdit.editText);
            this.stickerRandom = true;
            this.greetingsView.setPreview("", "");
            ChatGreetingsView chatGreetingsView = this.greetingsView;
            TLRPC$Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.sticker = greetingsSticker;
            chatGreetingsView.setSticker(greetingsSticker);
            AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
            AndroidUtilities.runOnUIThread(this.updateRandomStickerRunnable, 5000L);
            checkDone(true, false);
        }
    }

    public Boolean lambda$onClick$2(View view, Object obj, TLRPC$Document tLRPC$Document, Boolean bool) {
        this.stickerRandom = false;
        AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
        ChatGreetingsView chatGreetingsView = this.greetingsView;
        this.sticker = tLRPC$Document;
        chatGreetingsView.setSticker(tLRPC$Document);
        ((TextCell) view).setValueSticker(tLRPC$Document);
        checkDone(true, false);
        return Boolean.TRUE;
    }

    public boolean hasChanges() {
        TLRPC$Document tLRPC$Document;
        String charSequence = this.titleEdit.getText().toString();
        String str = this.currentTitle;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(charSequence, str)) {
            String charSequence2 = this.messageEdit.getText().toString();
            String str2 = this.currentMessage;
            if (TextUtils.equals(charSequence2, str2 != null ? str2 : "")) {
                boolean z = this.stickerRandom;
                if (((z || (tLRPC$Document = this.sticker) == null) ? 0L : tLRPC$Document.id) == this.currentSticker && (z || this.inputSticker == null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void checkDone(boolean z, boolean z2) {
        if (this.doneButton == null) {
            return;
        }
        boolean hasChanges = hasChanges();
        this.doneButton.setEnabled(hasChanges);
        if (z) {
            this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f).scaleY(hasChanges ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.doneButton.setAlpha(hasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleX(hasChanges ? 1.0f : 0.0f);
            this.doneButton.setScaleY(hasChanges ? 1.0f : 0.0f);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || universalRecyclerView.adapter == null || this.clearVisible == (!isEmpty())) {
            return;
        }
        saveScrollPosition();
        this.listView.adapter.update(true);
        applyScrolledPosition();
    }

    public void processDone() {
        TLRPC$Document tLRPC$Document;
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TLRPC$TL_account_updateBusinessIntro tLRPC$TL_account_updateBusinessIntro = new TLRPC$TL_account_updateBusinessIntro();
        if (!isEmpty()) {
            tLRPC$TL_account_updateBusinessIntro.flags |= 1;
            TLRPC$TL_inputBusinessIntro tLRPC$TL_inputBusinessIntro = new TLRPC$TL_inputBusinessIntro();
            tLRPC$TL_account_updateBusinessIntro.intro = tLRPC$TL_inputBusinessIntro;
            tLRPC$TL_inputBusinessIntro.title = this.titleEdit.getText().toString();
            tLRPC$TL_account_updateBusinessIntro.intro.description = this.messageEdit.getText().toString();
            if (!this.stickerRandom && (this.sticker != null || this.inputSticker != null)) {
                TLRPC$TL_inputBusinessIntro tLRPC$TL_inputBusinessIntro2 = tLRPC$TL_account_updateBusinessIntro.intro;
                tLRPC$TL_inputBusinessIntro2.flags |= 1;
                TLRPC$InputDocument tLRPC$InputDocument = this.inputSticker;
                if (tLRPC$InputDocument != null) {
                    tLRPC$TL_inputBusinessIntro2.sticker = tLRPC$InputDocument;
                } else {
                    tLRPC$TL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.sticker);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TLRPC$TL_businessIntro tLRPC$TL_businessIntro = new TLRPC$TL_businessIntro();
                userFull.business_intro = tLRPC$TL_businessIntro;
                TLRPC$TL_inputBusinessIntro tLRPC$TL_inputBusinessIntro3 = tLRPC$TL_account_updateBusinessIntro.intro;
                tLRPC$TL_businessIntro.title = tLRPC$TL_inputBusinessIntro3.title;
                tLRPC$TL_businessIntro.description = tLRPC$TL_inputBusinessIntro3.description;
                if (!this.stickerRandom && (tLRPC$Document = this.sticker) != null) {
                    tLRPC$TL_businessIntro.flags |= 1;
                    tLRPC$TL_businessIntro.sticker = tLRPC$Document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateBusinessIntro, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BusinessIntroActivity.this.lambda$processDone$4(tLObject, tLRPC$TL_error);
            }
        });
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public void lambda$processDone$4(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BusinessIntroActivity.this.lambda$processDone$3(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$processDone$3(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        } else {
            if (this.inputSticker != null) {
                getMessagesController().loadFullUser(getUserConfig().getCurrentUser(), 0, true);
            }
            finishFragment();
        }
    }

    @Override
    public boolean onBackPressed() {
        if (hasChanges()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
            builder.setMessage(LocaleController.getString(R.string.BusinessIntroUnsavedChanges));
            builder.setPositiveButton(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BusinessIntroActivity.this.lambda$onBackPressed$5(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BusinessIntroActivity.this.lambda$onBackPressed$6(dialogInterface, i);
                }
            });
            showDialog(builder.create());
            return false;
        }
        return super.onBackPressed();
    }

    public void lambda$onBackPressed$5(DialogInterface dialogInterface, int i) {
        processDone();
    }

    public void lambda$onBackPressed$6(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    public void openCustomStickerEditor() {
        ContentPreviewViewer.getInstance().setStickerSetForCustomSticker(null);
        if (getParentActivity() == null) {
            return;
        }
        createChatAttachView();
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        this.chatAttachAlert.setMaxSelectedPhotos(1, false);
        this.chatAttachAlert.setOpenWithFrontFaceCamera(true);
        this.chatAttachAlert.enableStickerMode(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BusinessIntroActivity.this.setCustomSticker((String) obj, (TLRPC$InputDocument) obj2);
            }
        });
        this.chatAttachAlert.init();
        ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
        chatAttachAlert.parentThemeDelegate = null;
        if (this.visibleDialog != null) {
            chatAttachAlert.show();
        } else {
            showDialog(chatAttachAlert);
        }
    }

    private void createChatAttachView() {
        if (getParentActivity() == null || getContext() == null || this.chatAttachAlert != null) {
            return;
        }
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getParentActivity(), this, false, false, true, this.resourceProvider) {
            @Override
            public void dismissInternal() {
                if (BusinessIntroActivity.this.chatAttachAlert != null && BusinessIntroActivity.this.chatAttachAlert.isShowing()) {
                    AndroidUtilities.requestAdjustResize(BusinessIntroActivity.this.getParentActivity(), ((BaseFragment) BusinessIntroActivity.this).classGuid);
                }
                super.dismissInternal();
            }

            @Override
            public void onDismissAnimationStart() {
                if (BusinessIntroActivity.this.chatAttachAlert != null) {
                    BusinessIntroActivity.this.chatAttachAlert.setFocusable(false);
                }
                if (BusinessIntroActivity.this.chatAttachAlert == null || !BusinessIntroActivity.this.chatAttachAlert.isShowing()) {
                    return;
                }
                AndroidUtilities.requestAdjustResize(BusinessIntroActivity.this.getParentActivity(), ((BaseFragment) BusinessIntroActivity.this).classGuid);
            }
        };
        this.chatAttachAlert = chatAttachAlert;
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public void didPressedButton(int i, boolean z, boolean z2, int i2, long j, boolean z3, boolean z4) {
            }

            @Override
            public void didSelectBot(TLRPC$User tLRPC$User) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, tLRPC$User);
            }

            @Override
            public boolean needEnterComment() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
            }

            @Override
            public void onCameraOpened() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
            }

            @Override
            public void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
            }

            @Override
            public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, long j, boolean z2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, j, z2);
            }

            @Override
            public void doOnIdle(Runnable runnable) {
                NotificationCenter.getInstance(((BaseFragment) BusinessIntroActivity.this).currentAccount).doOnIdle(runnable);
            }
        });
    }

    public void setCustomSticker(String str, TLRPC$InputDocument tLRPC$InputDocument) {
        UniversalAdapter universalAdapter;
        this.chatAttachAlert.dismiss();
        this.inputStickerPath = str;
        this.inputSticker = tLRPC$InputDocument;
        this.stickerRandom = false;
        AndroidUtilities.cancelRunOnUIThread(this.updateRandomStickerRunnable);
        this.greetingsView.setSticker(this.inputStickerPath);
        checkDone(true, false);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue();
        }
    }
}
