package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextBlockCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TypefaceSpan;

public class ChannelCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    private ArrayList adminedChannelCells;
    private TextInfoPrivacyCell adminedInfoCell;
    private LinearLayout adminnedChannelsLayout;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private TLRPC.FileLocation avatarBig;
    private AvatarDrawable avatarDrawable;
    private RLottieImageView avatarEditor;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private RLottieDrawable cameraDrawable;
    private boolean canCreatePublic;
    private AlertDialog cancelDialog;
    private long chatId;
    private int checkReqId;
    private Runnable checkRunnable;
    private TextView checkTextView;
    private boolean createAfterUpload;
    private int currentStep;
    private EditTextBoldCursor descriptionTextView;
    private View doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private ValueAnimator doneButtonDrawableAnimator;
    private boolean donePressed;
    private Integer doneRequestId;
    private EditTextBoldCursor editText;
    private Runnable enableDoneLoading;
    private Boolean forcePublic;
    private HeaderCell headerCell;
    private HeaderCell headerCell2;
    private TextView helpTextView;
    private ImageUpdater imageUpdater;
    private TLRPC.VideoSize inputEmojiMarkup;
    private TLRPC.InputFile inputPhoto;
    private TLRPC.InputFile inputVideo;
    private String inputVideoPath;
    private TLRPC.TL_chatInviteExported invite;
    private boolean isGroup;
    private boolean isPrivate;
    private String lastCheckName;
    private boolean lastNameAvailable;
    private LinearLayout linearLayout;
    private LinearLayout linearLayout2;
    private LinearLayout linkContainer;
    private LoadingCell loadingAdminedCell;
    private boolean loadingAdminedChannels;
    private boolean loadingInvite;
    private EditTextEmoji nameTextView;
    private String nameToSet;
    private Utilities.Callback2 onFinishListener;
    private LinkActionView permanentLinkView;
    private LinearLayout privateContainer;
    private LinearLayout publicContainer;
    private RadioButtonCell radioButtonCell1;
    private RadioButtonCell radioButtonCell2;
    private ShadowSectionCell sectionCell;
    private TextInfoPrivacyCell typeInfoCell;
    private double videoTimestamp;

    public static boolean $r8$lambda$YoicgIBJAfSh8idBObzovhQu3_Q(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public ChannelCreateActivity(Bundle bundle) {
        super(bundle);
        this.adminedChannelCells = new ArrayList();
        this.canCreatePublic = true;
        this.enableDoneLoading = new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateDoneProgress(true);
            }
        };
        this.currentStep = bundle.getInt("step", 0);
        if (bundle.containsKey("forcePublic")) {
            this.forcePublic = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        int i = this.currentStep;
        if (i == 0) {
            this.avatarDrawable = new AvatarDrawable();
            this.imageUpdater = new ImageUpdater(true, 1, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ChannelCreateActivity.m1563$r8$lambda$jLBJIy0iI3PrAmxZ3GtkrqUIn4(this.f$0, tLObject, tL_error);
                }
            });
            return;
        }
        if (i == 1) {
            boolean z = bundle.getBoolean("canCreatePublic", true);
            this.canCreatePublic = z;
            this.isPrivate = !z;
            if (!z) {
                loadAdminedChannels();
            }
        }
        this.chatId = bundle.getLong("chat_id", 0L);
    }

    public static void $r8$lambda$SCUQaTk4bMG5AEpstdG2CyPCElM(ChannelCreateActivity channelCreateActivity, TLRPC.TL_error tL_error) {
        boolean z;
        if (tL_error != null) {
            channelCreateActivity.getClass();
            if (tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        channelCreateActivity.canCreatePublic = z;
    }

    public static void m1563$r8$lambda$jLBJIy0iI3PrAmxZ3GtkrqUIn4(final ChannelCreateActivity channelCreateActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        channelCreateActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.$r8$lambda$SCUQaTk4bMG5AEpstdG2CyPCElM(this.f$0, tL_error);
            }
        });
    }

    public void setOnFinishListener(Utilities.Callback2 callback2) {
        this.onFinishListener = callback2;
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.currentStep == 1) {
            generateLink();
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.parentFragment = this;
            imageUpdater.setDelegate(this);
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.doneRequestId != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.doneRequestId.intValue(), true);
            this.doneRequestId = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onPause();
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onPause();
        }
    }

    @Override
    public void dismissCurrentDialog() {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || !imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        ImageUpdater imageUpdater = this.imageUpdater;
        return (imageUpdater == null || imageUpdater.dismissDialogOnPause(dialog)) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji == null || !editTextEmoji.isPopupShowing()) {
            return true;
        }
        if (!z) {
            return false;
        }
        this.nameTextView.hidePopup(true);
        return false;
    }

    public void showDoneCancelDialog() {
        if (this.cancelDialog != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.StopLoadingTitle));
        builder.setMessage(LocaleController.getString(R.string.StopLoading));
        builder.setPositiveButton(LocaleController.getString(R.string.WaitMore), null);
        builder.setNegativeButton(LocaleController.getString(R.string.Stop), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                ChannelCreateActivity.$r8$lambda$aN3NYLBaZ5bt6mFs24xmzt46_Wk(this.f$0, alertDialog, i);
            }
        });
        this.cancelDialog = builder.show();
    }

    public static void $r8$lambda$aN3NYLBaZ5bt6mFs24xmzt46_Wk(ChannelCreateActivity channelCreateActivity, AlertDialog alertDialog, int i) {
        channelCreateActivity.donePressed = false;
        channelCreateActivity.createAfterUpload = false;
        if (channelCreateActivity.doneRequestId != null) {
            ConnectionsManager.getInstance(channelCreateActivity.currentAccount).cancelRequest(channelCreateActivity.doneRequestId.intValue(), true);
            channelCreateActivity.doneRequestId = null;
        }
        channelCreateActivity.updateDoneProgress(false);
        alertDialog.dismiss();
    }

    public void updateDoneProgress(boolean z) {
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.enableDoneLoading);
        }
        if (this.doneButtonDrawable != null) {
            ValueAnimator valueAnimator = this.doneButtonDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.doneButtonDrawable.getProgress(), z ? 1.0f : 0.0f);
            this.doneButtonDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChannelCreateActivity.$r8$lambda$s763zpbnZiWckAxZT6QS6r8A7F0(this.f$0, valueAnimator2);
                }
            });
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.getProgress() - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    public static void $r8$lambda$s763zpbnZiWckAxZT6QS6r8A7F0(ChannelCreateActivity channelCreateActivity, ValueAnimator valueAnimator) {
        channelCreateActivity.doneButtonDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        channelCreateActivity.doneButtonDrawable.invalidateSelf();
    }

    @Override
    public View createView(Context context) {
        final ChannelCreateActivity channelCreateActivity = this;
        EditTextEmoji editTextEmoji = channelCreateActivity.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        channelCreateActivity.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        channelCreateActivity.actionBar.setAllowOverlayTitle(true);
        channelCreateActivity.actionBar.setActionBarMenuOnItemClick(channelCreateActivity.new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateMenu = channelCreateActivity.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i)));
        channelCreateActivity.doneButtonDrawable = crossfadeDrawable;
        channelCreateActivity.doneButton = actionBarMenuCreateMenu.addItemWithWidth(1, crossfadeDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        int i2 = channelCreateActivity.currentStep;
        if (i2 == 0) {
            channelCreateActivity.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                private boolean ignoreLayout;

                @Override
                protected void onMeasure(int i3, int i4) {
                    int size = View.MeasureSpec.getSize(i3);
                    int size2 = View.MeasureSpec.getSize(i4);
                    setMeasuredDimension(size, size2);
                    int paddingTop = size2 - getPaddingTop();
                    measureChildWithMargins(((BaseFragment) ChannelCreateActivity.this).actionBar, i3, 0, i4, 0);
                    if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                        this.ignoreLayout = true;
                        ChannelCreateActivity.this.nameTextView.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                    int childCount = getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) ChannelCreateActivity.this).actionBar) {
                            if (ChannelCreateActivity.this.nameTextView != null && ChannelCreateActivity.this.nameTextView.isPopupView(childAt)) {
                                if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((paddingTop - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else {
                                measureChildWithMargins(childAt, i3, 0, i4, 0);
                            }
                        }
                    }
                }

                @Override
                protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int paddingTop;
                    int measuredHeight;
                    int measuredHeight2;
                    int childCount = getChildCount();
                    int iMeasureKeyboardHeight = measureKeyboardHeight();
                    int emojiPadding = (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : ChannelCreateActivity.this.nameTextView.getEmojiPadding();
                    setBottomClip(emojiPadding);
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = getChildAt(i12);
                        if (childAt.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth = childAt.getMeasuredWidth();
                            int measuredHeight3 = childAt.getMeasuredHeight();
                            int i13 = layoutParams.gravity;
                            if (i13 == -1) {
                                i13 = 51;
                            }
                            int i14 = i13 & 112;
                            int i15 = i13 & 7;
                            if (i15 != 1) {
                                if (i15 == 5) {
                                    i7 = i5 - measuredWidth;
                                    i8 = layoutParams.rightMargin;
                                } else {
                                    i9 = layoutParams.leftMargin;
                                }
                                if (i14 != 16) {
                                    if (i14 != 48) {
                                        paddingTop = layoutParams.topMargin + getPaddingTop();
                                    } else if (i14 != 80) {
                                        i10 = ((i6 - emojiPadding) - i4) - measuredHeight3;
                                        i11 = layoutParams.bottomMargin;
                                    } else {
                                        paddingTop = layoutParams.topMargin;
                                    }
                                    if (ChannelCreateActivity.this.nameTextView != null && ChannelCreateActivity.this.nameTextView.isPopupView(childAt)) {
                                        if (AndroidUtilities.isTablet()) {
                                            measuredHeight = getMeasuredHeight();
                                            measuredHeight2 = childAt.getMeasuredHeight();
                                        } else {
                                            measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                            measuredHeight2 = childAt.getMeasuredHeight();
                                        }
                                        paddingTop = measuredHeight - measuredHeight2;
                                    }
                                    childAt.layout(i9, paddingTop, measuredWidth + i9, measuredHeight3 + paddingTop);
                                } else {
                                    i10 = ((((i6 - emojiPadding) - i4) - measuredHeight3) / 2) + layoutParams.topMargin;
                                    i11 = layoutParams.bottomMargin;
                                }
                                paddingTop = i10 - i11;
                                if (ChannelCreateActivity.this.nameTextView != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i9, paddingTop, measuredWidth + i9, measuredHeight3 + paddingTop);
                            } else {
                                i7 = (((i5 - i3) - measuredWidth) / 2) + layoutParams.leftMargin;
                                i8 = layoutParams.rightMargin;
                            }
                            i9 = i7 - i8;
                            if (i14 != 16) {
                                if (i14 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i14 != 80) {
                                    i10 = ((i6 - emojiPadding) - i4) - measuredHeight3;
                                    i11 = layoutParams.bottomMargin;
                                } else {
                                    paddingTop = layoutParams.topMargin;
                                }
                                if (ChannelCreateActivity.this.nameTextView != null) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i9, paddingTop, measuredWidth + i9, measuredHeight3 + paddingTop);
                            } else {
                                i10 = ((((i6 - emojiPadding) - i4) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i11 = layoutParams.bottomMargin;
                            }
                            paddingTop = i10 - i11;
                            if (ChannelCreateActivity.this.nameTextView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i9, paddingTop, measuredWidth + i9, measuredHeight3 + paddingTop);
                        }
                    }
                    notifyHeightChanged();
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            sizeNotifierFrameLayout.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ChannelCreateActivity.$r8$lambda$YoicgIBJAfSh8idBObzovhQu3_Q(view, motionEvent);
                }
            });
            channelCreateActivity.fragmentView = sizeNotifierFrameLayout;
            int i3 = Theme.key_windowBackgroundWhite;
            sizeNotifierFrameLayout.setTag(Integer.valueOf(i3));
            channelCreateActivity.fragmentView.setBackgroundColor(Theme.getColor(i3));
            LinearLayout linearLayout = new LinearLayout(context);
            channelCreateActivity.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            sizeNotifierFrameLayout.addView(channelCreateActivity.linearLayout, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            channelCreateActivity.linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
            BackupImageView backupImageView = new BackupImageView(context) {
                @Override
                public void invalidate() {
                    if (ChannelCreateActivity.this.avatarOverlay != null) {
                        ChannelCreateActivity.this.avatarOverlay.invalidate();
                    }
                    super.invalidate();
                }

                @Override
                public void invalidate(int i4, int i5, int i6, int i7) {
                    if (ChannelCreateActivity.this.avatarOverlay != null) {
                        ChannelCreateActivity.this.avatarOverlay.invalidate();
                    }
                    super.invalidate(i4, i5, i6, i7);
                }
            };
            channelCreateActivity.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
            channelCreateActivity.avatarDrawable.setInfo(5L, null, null);
            channelCreateActivity.avatarImage.setImageDrawable(channelCreateActivity.avatarDrawable);
            BackupImageView backupImageView2 = channelCreateActivity.avatarImage;
            boolean z = LocaleController.isRTL;
            frameLayout.addView(backupImageView2, LayoutHelper.createFrame(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 12.0f, z ? 16.0f : 0.0f, 12.0f));
            final Paint paint = new Paint(1);
            paint.setColor(1426063360);
            View view = new View(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    if (ChannelCreateActivity.this.avatarImage == null || !ChannelCreateActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                        return;
                    }
                    paint.setAlpha((int) (ChannelCreateActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f * ChannelCreateActivity.this.avatarProgressView.getAlpha()));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            };
            channelCreateActivity.avatarOverlay = view;
            view.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            View view2 = channelCreateActivity.avatarOverlay;
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(view2, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 12.0f));
            channelCreateActivity.avatarOverlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    ChannelCreateActivity.m1562$r8$lambda$UTM0UiGYGiLTWCDwSgugPpYsS4(this.f$0, view3);
                }
            });
            int i4 = R.raw.camera;
            channelCreateActivity.cameraDrawable = new RLottieDrawable(i4, "" + i4, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            RLottieImageView rLottieImageView = new RLottieImageView(context) {
                @Override
                public void invalidate(int i5, int i6, int i7, int i8) {
                    super.invalidate(i5, i6, i7, i8);
                    ChannelCreateActivity.this.avatarOverlay.invalidate();
                }

                @Override
                public void invalidate() {
                    super.invalidate();
                    ChannelCreateActivity.this.avatarOverlay.invalidate();
                }
            };
            channelCreateActivity.avatarEditor = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            channelCreateActivity.avatarEditor.setAnimation(channelCreateActivity.cameraDrawable);
            channelCreateActivity.avatarEditor.setEnabled(false);
            channelCreateActivity.avatarEditor.setClickable(false);
            channelCreateActivity.avatarEditor.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            RLottieImageView rLottieImageView2 = channelCreateActivity.avatarEditor;
            boolean z3 = LocaleController.isRTL;
            frameLayout.addView(rLottieImageView2, LayoutHelper.createFrame(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 15.0f, 12.0f, z3 ? 15.0f : 0.0f, 12.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context) {
                @Override
                public void setAlpha(float f) {
                    super.setAlpha(f);
                    ChannelCreateActivity.this.avatarOverlay.invalidate();
                }
            };
            channelCreateActivity.avatarProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            channelCreateActivity.avatarProgressView.setProgressColor(-1);
            channelCreateActivity.avatarProgressView.setNoProgress(false);
            RadialProgressView radialProgressView2 = channelCreateActivity.avatarProgressView;
            boolean z4 = LocaleController.isRTL;
            frameLayout.addView(radialProgressView2, LayoutHelper.createFrame(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 12.0f));
            channelCreateActivity.showAvatarProgress(false, false);
            EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, sizeNotifierFrameLayout, this, 0, false);
            channelCreateActivity = this;
            channelCreateActivity.nameTextView = editTextEmoji2;
            editTextEmoji2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = channelCreateActivity.nameToSet;
            if (str != null) {
                channelCreateActivity.nameTextView.setText(str);
                channelCreateActivity.nameToSet = null;
            }
            channelCreateActivity.nameTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            channelCreateActivity.nameTextView.getEditText().setSingleLine(true);
            channelCreateActivity.nameTextView.getEditText().setImeOptions(5);
            channelCreateActivity.nameTextView.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                    return ChannelCreateActivity.$r8$lambda$2UBGXsXNTVjcBw_M0KNUOT5gPvI(this.f$0, textView, i5, keyEvent);
                }
            });
            EditTextEmoji editTextEmoji3 = channelCreateActivity.nameTextView;
            boolean z5 = LocaleController.isRTL;
            frameLayout.addView(editTextEmoji3, LayoutHelper.createFrame(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            channelCreateActivity.descriptionTextView = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            channelCreateActivity.descriptionTextView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
            EditTextBoldCursor editTextBoldCursor2 = channelCreateActivity.descriptionTextView;
            int i5 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor2.setTextColor(Theme.getColor(i5));
            channelCreateActivity.descriptionTextView.setBackgroundDrawable(null);
            channelCreateActivity.descriptionTextView.setLineColors(channelCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteInputField), channelCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated), channelCreateActivity.getThemedColor(Theme.key_text_RedRegular));
            channelCreateActivity.descriptionTextView.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            channelCreateActivity.descriptionTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.descriptionTextView.setInputType(180225);
            channelCreateActivity.descriptionTextView.setImeOptions(6);
            channelCreateActivity.descriptionTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            channelCreateActivity.descriptionTextView.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            channelCreateActivity.descriptionTextView.setCursorColor(Theme.getColor(i5));
            channelCreateActivity.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
            channelCreateActivity.descriptionTextView.setCursorWidth(1.5f);
            channelCreateActivity.linearLayout.addView(channelCreateActivity.descriptionTextView, LayoutHelper.createLinear(-1, -2, 24.0f, 18.0f, 24.0f, 0.0f));
            channelCreateActivity.descriptionTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                    return ChannelCreateActivity.m1558$r8$lambda$MzIiRW4anGWKajiO55sQn2H8ek(this.f$0, textView, i6, keyEvent);
                }
            });
            channelCreateActivity.descriptionTextView.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }
            });
            TextView textView = new TextView(context);
            channelCreateActivity.helpTextView = textView;
            textView.setTextSize(1, 15.0f);
            channelCreateActivity.helpTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText8));
            channelCreateActivity.helpTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.helpTextView.setText(LocaleController.getString(R.string.DescriptionInfo));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.helpTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i2 == 1) {
            ScrollView scrollView = new ScrollView(context);
            channelCreateActivity.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            channelCreateActivity.linearLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(channelCreateActivity.linearLayout, new FrameLayout.LayoutParams(-1, -2));
            TLRPC.Chat chat = channelCreateActivity.getMessagesController().getChat(Long.valueOf(channelCreateActivity.chatId));
            boolean z6 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            channelCreateActivity.isGroup = z6;
            channelCreateActivity.actionBar.setTitle(LocaleController.getString(z6 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view3 = channelCreateActivity.fragmentView;
            int i6 = Theme.key_windowBackgroundGray;
            view3.setTag(Integer.valueOf(i6));
            channelCreateActivity.fragmentView.setBackgroundColor(Theme.getColor(i6));
            HeaderCell headerCell = new HeaderCell(context, 23);
            channelCreateActivity.headerCell2 = headerCell;
            headerCell.setHeight(46);
            HeaderCell headerCell2 = channelCreateActivity.headerCell2;
            int i7 = Theme.key_windowBackgroundWhite;
            headerCell2.setBackgroundColor(Theme.getColor(i7));
            channelCreateActivity.headerCell2.setText(LocaleController.getString(channelCreateActivity.isGroup ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.headerCell2);
            LinearLayout linearLayout3 = new LinearLayout(context);
            channelCreateActivity.linearLayout2 = linearLayout3;
            linearLayout3.setOrientation(1);
            channelCreateActivity.linearLayout2.setBackgroundColor(Theme.getColor(i7));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.linearLayout2, LayoutHelper.createLinear(-1, -2));
            RadioButtonCell radioButtonCell = new RadioButtonCell(context);
            channelCreateActivity.radioButtonCell1 = radioButtonCell;
            radioButtonCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            Boolean bool = channelCreateActivity.forcePublic;
            if (bool != null && !bool.booleanValue()) {
                channelCreateActivity.isPrivate = true;
            }
            if (channelCreateActivity.isGroup) {
                channelCreateActivity.radioButtonCell1.setTextAndValue(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !channelCreateActivity.isPrivate);
            } else {
                channelCreateActivity.radioButtonCell1.setTextAndValue(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !channelCreateActivity.isPrivate);
            }
            channelCreateActivity.radioButtonCell1.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    ChannelCreateActivity.$r8$lambda$DWf0zWwbYF397DNxEoyJJDgedt4(this.f$0, view4);
                }
            });
            Boolean bool2 = channelCreateActivity.forcePublic;
            if (bool2 == null || bool2.booleanValue()) {
                channelCreateActivity.linearLayout2.addView(channelCreateActivity.radioButtonCell1, LayoutHelper.createLinear(-1, -2));
            }
            RadioButtonCell radioButtonCell2 = new RadioButtonCell(context);
            channelCreateActivity.radioButtonCell2 = radioButtonCell2;
            radioButtonCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            Boolean bool3 = channelCreateActivity.forcePublic;
            if (bool3 != null && bool3.booleanValue()) {
                channelCreateActivity.isPrivate = false;
            }
            if (channelCreateActivity.isGroup) {
                channelCreateActivity.radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, channelCreateActivity.isPrivate);
            } else {
                channelCreateActivity.radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, channelCreateActivity.isPrivate);
            }
            channelCreateActivity.radioButtonCell2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    ChannelCreateActivity.$r8$lambda$BP5IMgkiCuH7tWXiMbKGtU8aVXU(this.f$0, view4);
                }
            });
            Boolean bool4 = channelCreateActivity.forcePublic;
            if (bool4 == null || !bool4.booleanValue()) {
                channelCreateActivity.linearLayout2.addView(channelCreateActivity.radioButtonCell2, LayoutHelper.createLinear(-1, -2));
            }
            ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context);
            channelCreateActivity.sectionCell = shadowSectionCell;
            channelCreateActivity.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            channelCreateActivity.linkContainer = linearLayout4;
            linearLayout4.setOrientation(1);
            channelCreateActivity.linkContainer.setBackgroundColor(Theme.getColor(i7));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.linkContainer, LayoutHelper.createLinear(-1, -2));
            HeaderCell headerCell3 = new HeaderCell(context);
            channelCreateActivity.headerCell = headerCell3;
            channelCreateActivity.linkContainer.addView(headerCell3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            channelCreateActivity.publicContainer = linearLayout5;
            linearLayout5.setOrientation(0);
            channelCreateActivity.linkContainer.addView(channelCreateActivity.publicContainer, LayoutHelper.createLinear(-1, 36, 21.0f, 7.0f, 21.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            channelCreateActivity.editText = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(channelCreateActivity.currentAccount).linkPrefix + "/");
            channelCreateActivity.editText.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = channelCreateActivity.editText;
            int i8 = Theme.key_windowBackgroundWhiteHintText;
            editTextBoldCursor4.setHintTextColor(Theme.getColor(i8));
            EditTextBoldCursor editTextBoldCursor5 = channelCreateActivity.editText;
            int i9 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor5.setTextColor(Theme.getColor(i9));
            channelCreateActivity.editText.setMaxLines(1);
            channelCreateActivity.editText.setLines(1);
            channelCreateActivity.editText.setEnabled(false);
            channelCreateActivity.editText.setBackgroundDrawable(null);
            channelCreateActivity.editText.setPadding(0, 0, 0, 0);
            channelCreateActivity.editText.setSingleLine(true);
            channelCreateActivity.editText.setInputType(163840);
            channelCreateActivity.editText.setImeOptions(6);
            channelCreateActivity.publicContainer.addView(channelCreateActivity.editText, LayoutHelper.createLinear(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            channelCreateActivity.descriptionTextView = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            channelCreateActivity.descriptionTextView.setHintTextColor(Theme.getColor(i8));
            channelCreateActivity.descriptionTextView.setTextColor(Theme.getColor(i9));
            channelCreateActivity.descriptionTextView.setMaxLines(1);
            channelCreateActivity.descriptionTextView.setLines(1);
            channelCreateActivity.descriptionTextView.setBackgroundDrawable(null);
            channelCreateActivity.descriptionTextView.setPadding(0, 0, 0, 0);
            channelCreateActivity.descriptionTextView.setSingleLine(true);
            channelCreateActivity.descriptionTextView.setInputType(163872);
            channelCreateActivity.descriptionTextView.setImeOptions(6);
            channelCreateActivity.descriptionTextView.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            channelCreateActivity.descriptionTextView.setCursorColor(Theme.getColor(i9));
            channelCreateActivity.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
            channelCreateActivity.descriptionTextView.setCursorWidth(1.5f);
            channelCreateActivity.publicContainer.addView(channelCreateActivity.descriptionTextView, LayoutHelper.createLinear(-1, 36));
            channelCreateActivity.descriptionTextView.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                    ChannelCreateActivity channelCreateActivity2 = ChannelCreateActivity.this;
                    channelCreateActivity2.checkUserName(channelCreateActivity2.descriptionTextView.getText().toString());
                }
            });
            LinearLayout linearLayout6 = new LinearLayout(context);
            channelCreateActivity.privateContainer = linearLayout6;
            linearLayout6.setOrientation(1);
            channelCreateActivity.linkContainer.addView(channelCreateActivity.privateContainer, LayoutHelper.createLinear(-1, -2));
            LinkActionView linkActionView = new LinkActionView(context, channelCreateActivity, null, channelCreateActivity.chatId, true, ChatObject.isChannel(channelCreateActivity.getMessagesController().getChat(Long.valueOf(channelCreateActivity.chatId))));
            channelCreateActivity.permanentLinkView = linkActionView;
            linkActionView.hideRevokeOption(true);
            channelCreateActivity.permanentLinkView.setUsers(0, null);
            channelCreateActivity.privateContainer.addView(channelCreateActivity.permanentLinkView);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context) {
                @Override
                public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                    if (charSequence != 0) {
                        charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                        int iIndexOf = charSequence.toString().indexOf(10);
                        if (iIndexOf >= 0) {
                            charSequence.replace(iIndexOf, iIndexOf + 1, " ");
                            charSequence.setSpan(new ForegroundColorSpan(ChannelCreateActivity.this.getThemedColor(Theme.key_text_RedRegular)), 0, iIndexOf, 33);
                        }
                        TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) charSequence.getSpans(0, charSequence.length(), TypefaceSpan.class);
                        final String string = (ChannelCreateActivity.this.descriptionTextView == null || ChannelCreateActivity.this.descriptionTextView.getText() == null) ? "" : ChannelCreateActivity.this.descriptionTextView.getText().toString();
                        for (int i10 = 0; i10 < typefaceSpanArr.length; i10++) {
                            charSequence.setSpan(new ClickableSpan() {
                                @Override
                                public void onClick(View view4) {
                                    Browser.openUrl(getContext(), "https://fragment.com/username/" + string);
                                }

                                @Override
                                public void updateDrawState(TextPaint textPaint) {
                                    super.updateDrawState(textPaint);
                                    textPaint.setUnderlineText(false);
                                }
                            }, charSequence.getSpanStart(typefaceSpanArr[i10]), charSequence.getSpanEnd(typefaceSpanArr[i10]), 33);
                            charSequence.removeSpan(typefaceSpanArr[i10]);
                        }
                    }
                    super.setText(charSequence, bufferType);
                }
            };
            channelCreateActivity.checkTextView = linksTextView;
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText));
            channelCreateActivity.checkTextView.setHighlightColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkSelection));
            channelCreateActivity.checkTextView.setTextSize(1, 15.0f);
            channelCreateActivity.checkTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.checkTextView.setVisibility(8);
            channelCreateActivity.checkTextView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            channelCreateActivity.linkContainer.addView(channelCreateActivity.checkTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
            channelCreateActivity.typeInfoCell = textInfoPrivacyCell;
            int i10 = R.drawable.greydivider_bottom;
            int i11 = Theme.key_windowBackgroundGrayShadow;
            textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.typeInfoCell, LayoutHelper.createLinear(-1, -2));
            LoadingCell loadingCell = new LoadingCell(context);
            channelCreateActivity.loadingAdminedCell = loadingCell;
            channelCreateActivity.linearLayout.addView(loadingCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            channelCreateActivity.adminnedChannelsLayout = linearLayout7;
            linearLayout7.setBackgroundColor(Theme.getColor(i7));
            channelCreateActivity.adminnedChannelsLayout.setOrientation(1);
            channelCreateActivity.linearLayout.addView(channelCreateActivity.adminnedChannelsLayout, LayoutHelper.createLinear(-1, -2));
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
            channelCreateActivity.adminedInfoCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i10, i11));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.adminedInfoCell, LayoutHelper.createLinear(-1, -2));
            channelCreateActivity.updatePrivatePublic();
        }
        return channelCreateActivity.fragmentView;
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (ChannelCreateActivity.this.donePressed) {
                    ChannelCreateActivity.this.showDoneCancelDialog();
                    return;
                } else {
                    ChannelCreateActivity.this.finishFragment();
                    return;
                }
            }
            if (i == 1) {
                if (ChannelCreateActivity.this.currentStep != 0) {
                    if (ChannelCreateActivity.this.currentStep == 1) {
                        if (!ChannelCreateActivity.this.isPrivate) {
                            if (ChannelCreateActivity.this.descriptionTextView.length() != 0) {
                                if (ChannelCreateActivity.this.lastNameAvailable) {
                                    AndroidUtilities.runOnUIThread(ChannelCreateActivity.this.enableDoneLoading, 200L);
                                    MessagesController messagesController = MessagesController.getInstance(((BaseFragment) ChannelCreateActivity.this).currentAccount);
                                    ChannelCreateActivity channelCreateActivity = ChannelCreateActivity.this;
                                    messagesController.updateChannelUserName(channelCreateActivity, channelCreateActivity.chatId, ChannelCreateActivity.this.lastCheckName, new Runnable() {
                                        @Override
                                        public final void run() {
                                            ChannelCreateActivity.AnonymousClass1.$r8$lambda$CWSx4FfX9NNXGbpsut5kXMEw54U(this.f$0);
                                        }
                                    }, new Runnable() {
                                        @Override
                                        public final void run() {
                                            ChannelCreateActivity.AnonymousClass1.$r8$lambda$3vwSwhVK87rMUv0TthC5s3jeZKM(this.f$0);
                                        }
                                    });
                                } else {
                                    Vibrator vibrator = (Vibrator) ChannelCreateActivity.this.getParentActivity().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                    AndroidUtilities.shakeView(ChannelCreateActivity.this.checkTextView);
                                    return;
                                }
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(ChannelCreateActivity.this.getParentActivity());
                                builder.setTitle(LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle));
                                builder.setMessage(LocaleController.getString(R.string.ChannelPublicEmptyUsername));
                                builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
                                ChannelCreateActivity.this.showDialog(builder.create());
                                return;
                            }
                        } else if (ChannelCreateActivity.this.onFinishListener != null) {
                            Utilities.Callback2 callback2 = ChannelCreateActivity.this.onFinishListener;
                            ChannelCreateActivity channelCreateActivity2 = ChannelCreateActivity.this;
                            callback2.run(channelCreateActivity2, Long.valueOf(channelCreateActivity2.chatId));
                        }
                        if (ChannelCreateActivity.this.onFinishListener == null) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 2);
                            bundle.putLong("chatId", ChannelCreateActivity.this.chatId);
                            bundle.putInt("chatType", 2);
                            ChannelCreateActivity.this.presentFragment(new GroupCreateActivity(bundle), true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ChannelCreateActivity.this.getParentActivity() == null) {
                    return;
                }
                if (ChannelCreateActivity.this.donePressed) {
                    ChannelCreateActivity.this.showDoneCancelDialog();
                    return;
                }
                if (ChannelCreateActivity.this.nameTextView.length() != 0) {
                    ChannelCreateActivity.this.donePressed = true;
                    AndroidUtilities.runOnUIThread(ChannelCreateActivity.this.enableDoneLoading, 200L);
                    if (ChannelCreateActivity.this.imageUpdater.isUploadingImage()) {
                        ChannelCreateActivity.this.createAfterUpload = true;
                        return;
                    } else {
                        ChannelCreateActivity channelCreateActivity3 = ChannelCreateActivity.this;
                        channelCreateActivity3.doneRequestId = Integer.valueOf(MessagesController.getInstance(((BaseFragment) channelCreateActivity3).currentAccount).createChat(ChannelCreateActivity.this.nameTextView.getText().toString(), new ArrayList<>(), ChannelCreateActivity.this.descriptionTextView.getText().toString(), 2, false, null, null, -1, ChannelCreateActivity.this));
                        return;
                    }
                }
                Vibrator vibrator2 = (Vibrator) ChannelCreateActivity.this.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(ChannelCreateActivity.this.nameTextView);
            }
        }

        public static void $r8$lambda$CWSx4FfX9NNXGbpsut5kXMEw54U(AnonymousClass1 anonymousClass1) {
            ChannelCreateActivity.this.updateDoneProgress(false);
            if (ChannelCreateActivity.this.onFinishListener != null) {
                Utilities.Callback2 callback2 = ChannelCreateActivity.this.onFinishListener;
                ChannelCreateActivity channelCreateActivity = ChannelCreateActivity.this;
                callback2.run(channelCreateActivity, Long.valueOf(channelCreateActivity.chatId));
            }
        }

        public static void $r8$lambda$3vwSwhVK87rMUv0TthC5s3jeZKM(AnonymousClass1 anonymousClass1) {
            ChannelCreateActivity.this.updateDoneProgress(false);
            if (ChannelCreateActivity.this.onFinishListener != null) {
                Utilities.Callback2 callback2 = ChannelCreateActivity.this.onFinishListener;
                ChannelCreateActivity channelCreateActivity = ChannelCreateActivity.this;
                callback2.run(channelCreateActivity, Long.valueOf(channelCreateActivity.chatId));
            }
        }
    }

    public static void m1562$r8$lambda$UTM0UiGYGiLTWCDwSgugPpYsS4(final ChannelCreateActivity channelCreateActivity, View view) {
        channelCreateActivity.imageUpdater.openMenu(channelCreateActivity.avatar != null, new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.$r8$lambda$BZ4VhDqZPCo1OWbxYQ4opcNWESQ(this.f$0);
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ChannelCreateActivity.m1557$r8$lambda$6fiDIkBXgbYwVJOBpZ18cefwlQ(this.f$0, dialogInterface);
            }
        }, 0);
        channelCreateActivity.cameraDrawable.setCurrentFrame(0);
        channelCreateActivity.cameraDrawable.setCustomEndFrame(43);
        channelCreateActivity.avatarEditor.playAnimation();
    }

    public static void $r8$lambda$BZ4VhDqZPCo1OWbxYQ4opcNWESQ(ChannelCreateActivity channelCreateActivity) {
        channelCreateActivity.avatar = null;
        channelCreateActivity.avatarBig = null;
        channelCreateActivity.inputPhoto = null;
        channelCreateActivity.inputVideo = null;
        channelCreateActivity.inputVideoPath = null;
        channelCreateActivity.inputEmojiMarkup = null;
        channelCreateActivity.videoTimestamp = 0.0d;
        channelCreateActivity.showAvatarProgress(false, true);
        channelCreateActivity.avatarImage.setImage((ImageLocation) null, (String) null, channelCreateActivity.avatarDrawable, (Object) null);
        channelCreateActivity.avatarEditor.setAnimation(channelCreateActivity.cameraDrawable);
        channelCreateActivity.cameraDrawable.setCurrentFrame(0);
    }

    public static void m1557$r8$lambda$6fiDIkBXgbYwVJOBpZ18cefwlQ(ChannelCreateActivity channelCreateActivity, DialogInterface dialogInterface) {
        if (!channelCreateActivity.imageUpdater.isUploadingImage()) {
            channelCreateActivity.cameraDrawable.setCustomEndFrame(86);
            channelCreateActivity.avatarEditor.playAnimation();
        } else {
            channelCreateActivity.cameraDrawable.setCurrentFrame(0, false);
        }
    }

    public static boolean $r8$lambda$2UBGXsXNTVjcBw_M0KNUOT5gPvI(ChannelCreateActivity channelCreateActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            channelCreateActivity.getClass();
            return false;
        }
        if (TextUtils.isEmpty(channelCreateActivity.nameTextView.getEditText().getText())) {
            return false;
        }
        channelCreateActivity.descriptionTextView.requestFocus();
        return true;
    }

    public static boolean m1558$r8$lambda$MzIiRW4anGWKajiO55sQn2H8ek(ChannelCreateActivity channelCreateActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            channelCreateActivity.getClass();
            return false;
        }
        View view = channelCreateActivity.doneButton;
        if (view == null) {
            return false;
        }
        view.performClick();
        return true;
    }

    public static void $r8$lambda$DWf0zWwbYF397DNxEoyJJDgedt4(ChannelCreateActivity channelCreateActivity, View view) {
        if (!channelCreateActivity.canCreatePublic) {
            channelCreateActivity.showPremiumIncreaseLimitDialog();
        } else if (channelCreateActivity.isPrivate) {
            channelCreateActivity.isPrivate = false;
            channelCreateActivity.updatePrivatePublic();
        }
    }

    public static void $r8$lambda$BP5IMgkiCuH7tWXiMbKGtU8aVXU(ChannelCreateActivity channelCreateActivity, View view) {
        if (channelCreateActivity.isPrivate) {
            return;
        }
        channelCreateActivity.isPrivate = true;
        channelCreateActivity.updatePrivatePublic();
    }

    private void generateLink() {
        if (this.loadingInvite || this.invite != null) {
            return;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
        if (chatFull != null) {
            this.invite = chatFull.exported_invite;
        }
        if (this.invite != null) {
            return;
        }
        this.loadingInvite = true;
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.chatId);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChannelCreateActivity.m1561$r8$lambda$SmIx06omrcZ6UK4PdeKUR3BGno(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m1561$r8$lambda$SmIx06omrcZ6UK4PdeKUR3BGno(final ChannelCreateActivity channelCreateActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        channelCreateActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.$r8$lambda$s829EyEomYhaopbhUbxk5bq6GtM(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$s829EyEomYhaopbhUbxk5bq6GtM(ChannelCreateActivity channelCreateActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            channelCreateActivity.getClass();
            channelCreateActivity.invite = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject).invites.get(0);
        }
        channelCreateActivity.loadingInvite = false;
        LinkActionView linkActionView = channelCreateActivity.permanentLinkView;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = channelCreateActivity.invite;
        linkActionView.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
    }

    private void updatePrivatePublic() {
        if (this.sectionCell == null) {
            return;
        }
        int i = 8;
        if (!this.isPrivate && !this.canCreatePublic) {
            this.typeInfoCell.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            TextInfoPrivacyCell textInfoPrivacyCell = this.typeInfoCell;
            int i2 = Theme.key_text_RedRegular;
            textInfoPrivacyCell.setTag(Integer.valueOf(i2));
            this.typeInfoCell.setTextColor(Theme.getColor(i2));
            this.linkContainer.setVisibility(8);
            this.sectionCell.setVisibility(8);
            if (this.loadingAdminedChannels) {
                this.loadingAdminedCell.setVisibility(0);
                this.adminnedChannelsLayout.setVisibility(8);
                TextInfoPrivacyCell textInfoPrivacyCell2 = this.typeInfoCell;
                textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(textInfoPrivacyCell2.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.adminedInfoCell.setVisibility(8);
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell3 = this.typeInfoCell;
                textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(textInfoPrivacyCell3.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                this.loadingAdminedCell.setVisibility(8);
                this.adminnedChannelsLayout.setVisibility(0);
                this.adminedInfoCell.setVisibility(0);
            }
        } else {
            TextInfoPrivacyCell textInfoPrivacyCell4 = this.typeInfoCell;
            int i3 = Theme.key_windowBackgroundWhiteGrayText4;
            textInfoPrivacyCell4.setTag(Integer.valueOf(i3));
            this.typeInfoCell.setTextColor(Theme.getColor(i3));
            this.sectionCell.setVisibility(0);
            this.adminedInfoCell.setVisibility(8);
            this.adminnedChannelsLayout.setVisibility(8);
            TextInfoPrivacyCell textInfoPrivacyCell5 = this.typeInfoCell;
            textInfoPrivacyCell5.setBackgroundDrawable(Theme.getThemedDrawableByKey(textInfoPrivacyCell5.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linkContainer.setVisibility(0);
            this.loadingAdminedCell.setVisibility(8);
            if (this.isGroup) {
                this.typeInfoCell.setText(LocaleController.getString(this.isPrivate ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.headerCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.typeInfoCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.headerCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.publicContainer.setVisibility(this.isPrivate ? 8 : 0);
            this.privateContainer.setVisibility(this.isPrivate ? 0 : 8);
            this.linkContainer.setPadding(0, 0, 0, this.isPrivate ? 0 : AndroidUtilities.dp(7.0f));
            LinkActionView linkActionView = this.permanentLinkView;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            linkActionView.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            TextView textView = this.checkTextView;
            if (!this.isPrivate && textView.length() != 0) {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.radioButtonCell1.setChecked(!this.isPrivate, true);
        this.radioButtonCell2.setChecked(this.isPrivate, true);
        this.descriptionTextView.clearFocus();
        AndroidUtilities.hideKeyboard(this.descriptionTextView);
    }

    @Override
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.$r8$lambda$GQvqU8JAbh_bzpaYJW18QABSzDU(this.f$0, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize);
            }
        });
    }

    public static void $r8$lambda$GQvqU8JAbh_bzpaYJW18QABSzDU(ChannelCreateActivity channelCreateActivity, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        channelCreateActivity.getClass();
        if (inputFile != null || inputFile2 != null) {
            channelCreateActivity.inputPhoto = inputFile;
            channelCreateActivity.inputVideo = inputFile2;
            channelCreateActivity.inputEmojiMarkup = videoSize;
            channelCreateActivity.inputVideoPath = str;
            channelCreateActivity.videoTimestamp = d;
            if (channelCreateActivity.createAfterUpload) {
                AlertDialog alertDialog = channelCreateActivity.cancelDialog;
                if (alertDialog != null) {
                    try {
                        alertDialog.dismiss();
                        channelCreateActivity.cancelDialog = null;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                channelCreateActivity.updateDoneProgress(false);
                channelCreateActivity.donePressed = false;
                channelCreateActivity.doneButton.performClick();
            }
            channelCreateActivity.showAvatarProgress(false, true);
            channelCreateActivity.avatarEditor.setImageDrawable(null);
            return;
        }
        TLRPC.FileLocation fileLocation = photoSize.location;
        channelCreateActivity.avatar = fileLocation;
        channelCreateActivity.avatarBig = photoSize2.location;
        channelCreateActivity.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", channelCreateActivity.avatarDrawable, (Object) null);
        channelCreateActivity.showAvatarProgress(true, false);
    }

    @Override
    public String getInitialSearchString() {
        return this.nameTextView.getText().toString();
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarEditor == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.avatarAnimation.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarEditor.setAlpha(1.0f);
                this.avatarEditor.setVisibility(4);
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                return;
            }
            this.avatarEditor.setAlpha(1.0f);
            this.avatarEditor.setVisibility(0);
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            return;
        }
        this.avatarAnimation = new AnimatorSet();
        if (z) {
            this.avatarProgressView.setVisibility(0);
            AnimatorSet animatorSet2 = this.avatarAnimation;
            RLottieImageView rLottieImageView = this.avatarEditor;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property, 1.0f));
        } else {
            if (this.avatarEditor.getVisibility() != 0) {
                this.avatarEditor.setAlpha(0.0f);
            }
            this.avatarEditor.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            RLottieImageView rLottieImageView2 = this.avatarEditor;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ChannelCreateActivity.this.avatarAnimation == null || ChannelCreateActivity.this.avatarEditor == null) {
                    return;
                }
                if (z) {
                    ChannelCreateActivity.this.avatarEditor.setVisibility(4);
                } else {
                    ChannelCreateActivity.this.avatarProgressView.setVisibility(4);
                }
                ChannelCreateActivity.this.avatarAnimation = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                ChannelCreateActivity.this.avatarAnimation = null;
            }
        });
        this.avatarAnimation.start();
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.currentStep == 0) {
            ImageUpdater imageUpdater = this.imageUpdater;
            if (imageUpdater != null && (str = imageUpdater.currentPicturePath) != null) {
                bundle.putString("path", str);
            }
            EditTextEmoji editTextEmoji = this.nameTextView;
            if (editTextEmoji != null) {
                String string = editTextEmoji.getText().toString();
                if (string.length() != 0) {
                    bundle.putString("nameTextView", string);
                }
            }
        }
    }

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        if (this.currentStep == 0) {
            ImageUpdater imageUpdater = this.imageUpdater;
            if (imageUpdater != null) {
                imageUpdater.currentPicturePath = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                EditTextEmoji editTextEmoji = this.nameTextView;
                if (editTextEmoji != null) {
                    editTextEmoji.setText(string);
                } else {
                    this.nameToSet = string;
                }
            }
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.currentStep == 1) {
            return;
        }
        this.nameTextView.requestFocus();
        this.nameTextView.openKeyboard();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatDidFailCreate) {
            AlertDialog alertDialog = this.cancelDialog;
            if (alertDialog != null) {
                try {
                    alertDialog.dismiss();
                    this.cancelDialog = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            updateDoneProgress(false);
            this.donePressed = false;
            return;
        }
        if (i == NotificationCenter.chatDidCreated) {
            AlertDialog alertDialog2 = this.cancelDialog;
            if (alertDialog2 != null) {
                try {
                    alertDialog2.dismiss();
                    this.cancelDialog = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            long jLongValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", jLongValue);
            bundle.putBoolean("canCreatePublic", this.canCreatePublic);
            Boolean bool = this.forcePublic;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.inputPhoto != null || this.inputVideo != null || this.inputEmojiMarkup != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(jLongValue, null, this.inputPhoto, this.inputVideo, this.inputEmojiMarkup, this.videoTimestamp, this.inputVideoPath, this.avatar, this.avatarBig, null);
            }
            ChannelCreateActivity channelCreateActivity = new ChannelCreateActivity(bundle);
            channelCreateActivity.setOnFinishListener(this.onFinishListener);
            presentFragment(channelCreateActivity, true);
        }
    }

    private void loadAdminedChannels() {
        if (this.loadingAdminedChannels) {
            return;
        }
        this.loadingAdminedChannels = true;
        updatePrivatePublic();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChannelCreateActivity.m1564$r8$lambda$yYHjkypD92tbX8xMZ5MwPAf3l8(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m1564$r8$lambda$yYHjkypD92tbX8xMZ5MwPAf3l8(final ChannelCreateActivity channelCreateActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        channelCreateActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.$r8$lambda$BzLgmdV_q5hZ4ZC_15_WQpqvu_c(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$BzLgmdV_q5hZ4ZC_15_WQpqvu_c(final ChannelCreateActivity channelCreateActivity, TLObject tLObject) {
        channelCreateActivity.loadingAdminedChannels = false;
        if (tLObject == null || channelCreateActivity.getParentActivity() == null) {
            return;
        }
        for (int i = 0; i < channelCreateActivity.adminedChannelCells.size(); i++) {
            channelCreateActivity.linearLayout.removeView((View) channelCreateActivity.adminedChannelCells.get(i));
        }
        channelCreateActivity.adminedChannelCells.clear();
        TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
        for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
            AdminedChannelCell adminedChannelCell = new AdminedChannelCell(channelCreateActivity.getParentActivity(), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChannelCreateActivity.$r8$lambda$kqPTYtEoK5WfZ0nYG0tHZh6E17U(this.f$0, view);
                }
            }, false, 0);
            TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
            boolean z = true;
            if (i2 != tL_messages_chats.chats.size() - 1) {
                z = false;
            }
            adminedChannelCell.setChannel(chat, z);
            channelCreateActivity.adminedChannelCells.add(adminedChannelCell);
            channelCreateActivity.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
        }
        channelCreateActivity.updatePrivatePublic();
    }

    public static void $r8$lambda$kqPTYtEoK5WfZ0nYG0tHZh6E17U(final ChannelCreateActivity channelCreateActivity, View view) {
        channelCreateActivity.getClass();
        final TLRPC.Chat currentChannel = ((AdminedChannelCell) view.getParent()).getCurrentChannel();
        AlertDialog.Builder builder = new AlertDialog.Builder(channelCreateActivity.getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.AppName));
        if (currentChannel.megagroup) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(channelCreateActivity.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(channelCreateActivity.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title)));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                ChannelCreateActivity.$r8$lambda$eqzVwC9tIlP4c80iu1AbTBA8ee8(this.f$0, currentChannel, alertDialog, i);
            }
        });
        channelCreateActivity.showDialog(builder.create());
    }

    public static void $r8$lambda$eqzVwC9tIlP4c80iu1AbTBA8ee8(final ChannelCreateActivity channelCreateActivity, TLRPC.Chat chat, AlertDialog alertDialog, int i) {
        channelCreateActivity.getClass();
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(channelCreateActivity.currentAccount).sendRequest(tL_channels_updateUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChannelCreateActivity.$r8$lambda$xVB9jZPfoX97RutenqQV6uGKhZI(this.f$0, tLObject, tL_error);
            }
        }, 64);
    }

    public static void $r8$lambda$xVB9jZPfoX97RutenqQV6uGKhZI(final ChannelCreateActivity channelCreateActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        channelCreateActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChannelCreateActivity.$r8$lambda$AZ2w1_4hvuefFjT_JQ4Yu3b9Eoo(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$AZ2w1_4hvuefFjT_JQ4Yu3b9Eoo(ChannelCreateActivity channelCreateActivity) {
        channelCreateActivity.canCreatePublic = true;
        if (channelCreateActivity.descriptionTextView.length() > 0) {
            channelCreateActivity.checkUserName(channelCreateActivity.descriptionTextView.getText().toString());
        }
        channelCreateActivity.updatePrivatePublic();
    }

    public boolean checkUserName(final String str) {
        if (str != null && str.length() > 0) {
            this.checkTextView.setVisibility(0);
        } else {
            this.checkTextView.setVisibility(8);
        }
        Runnable runnable = this.checkRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.checkRunnable = null;
            this.lastCheckName = null;
            if (this.checkReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkReqId, true);
            }
        }
        this.lastNameAvailable = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                TextView textView = this.checkTextView;
                int i = Theme.key_text_RedRegular;
                textView.setTag(Integer.valueOf(i));
                this.checkTextView.setTextColor(Theme.getColor(i));
                return false;
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (i2 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    TextView textView2 = this.checkTextView;
                    int i3 = Theme.key_text_RedRegular;
                    textView2.setTag(Integer.valueOf(i3));
                    this.checkTextView.setTextColor(Theme.getColor(i3));
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                    TextView textView3 = this.checkTextView;
                    int i4 = Theme.key_text_RedRegular;
                    textView3.setTag(Integer.valueOf(i4));
                    this.checkTextView.setTextColor(Theme.getColor(i4));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidShort));
            TextView textView4 = this.checkTextView;
            int i5 = Theme.key_text_RedRegular;
            textView4.setTag(Integer.valueOf(i5));
            this.checkTextView.setTextColor(Theme.getColor(i5));
            return false;
        }
        if (str.length() > 32) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidLong));
            TextView textView5 = this.checkTextView;
            int i6 = Theme.key_text_RedRegular;
            textView5.setTag(Integer.valueOf(i6));
            this.checkTextView.setTextColor(Theme.getColor(i6));
            return false;
        }
        this.checkTextView.setText(LocaleController.getString(R.string.LinkChecking));
        TextView textView6 = this.checkTextView;
        int i7 = Theme.key_windowBackgroundWhiteGrayText8;
        textView6.setTag(Integer.valueOf(i7));
        this.checkTextView.setTextColor(Theme.getColor(i7));
        this.lastCheckName = str;
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.$r8$lambda$jy3AtlWVrS0GnK_KY_5TJWobjxM(this.f$0, str);
            }
        };
        this.checkRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 300L);
        return true;
    }

    public static void $r8$lambda$jy3AtlWVrS0GnK_KY_5TJWobjxM(final ChannelCreateActivity channelCreateActivity, final String str) {
        channelCreateActivity.getClass();
        final TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(channelCreateActivity.currentAccount).getInputChannel(channelCreateActivity.chatId);
        channelCreateActivity.checkReqId = ConnectionsManager.getInstance(channelCreateActivity.currentAccount).sendRequest(tL_channels_checkUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChannelCreateActivity.$r8$lambda$tWDkuYUykvbKnrTTKtAwCLAVAyM(this.f$0, str, tL_channels_checkUsername, tLObject, tL_error);
            }
        }, 2);
    }

    public static void $r8$lambda$tWDkuYUykvbKnrTTKtAwCLAVAyM(final ChannelCreateActivity channelCreateActivity, final String str, final TLRPC.TL_channels_checkUsername tL_channels_checkUsername, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        channelCreateActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.$r8$lambda$jQJxibOlqEZxxGzthIIg84U9Eoo(this.f$0, str, tL_error, tLObject, tL_channels_checkUsername);
            }
        });
    }

    public static void $r8$lambda$jQJxibOlqEZxxGzthIIg84U9Eoo(ChannelCreateActivity channelCreateActivity, String str, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_checkUsername tL_channels_checkUsername) {
        channelCreateActivity.checkReqId = 0;
        String str2 = channelCreateActivity.lastCheckName;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            channelCreateActivity.checkTextView.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            TextView textView = channelCreateActivity.checkTextView;
            int i = Theme.key_windowBackgroundWhiteGreenText;
            textView.setTag(Integer.valueOf(i));
            channelCreateActivity.checkTextView.setTextColor(Theme.getColor(i));
            channelCreateActivity.lastNameAvailable = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            channelCreateActivity.checkTextView.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            channelCreateActivity.checkTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText8));
        } else if (tL_error != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            channelCreateActivity.checkTextView.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            channelCreateActivity.canCreatePublic = false;
            channelCreateActivity.showPremiumIncreaseLimitDialog();
        } else {
            channelCreateActivity.checkTextView.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            channelCreateActivity.checkTextView.setText(LocaleController.getString(R.string.LinkInUse));
        }
        channelCreateActivity.lastNameAvailable = false;
    }

    private void showPremiumIncreaseLimitDialog() {
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getParentActivity(), 2, this.currentAccount, null);
        limitReachedBottomSheet.parentIsChannel = true;
        limitReachedBottomSheet.onSuccessRunnable = new Runnable() {
            @Override
            public final void run() {
                ChannelCreateActivity.m1560$r8$lambda$R96TD3rqXcLO4fK_fZ2FGPCck(this.f$0);
            }
        };
        showDialog(limitReachedBottomSheet);
    }

    public static void m1560$r8$lambda$R96TD3rqXcLO4fK_fZ2FGPCck(ChannelCreateActivity channelCreateActivity) {
        channelCreateActivity.canCreatePublic = true;
        channelCreateActivity.updatePrivatePublic();
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChannelCreateActivity.m1559$r8$lambda$Pn9Ahmnr68U1cnAGgtWoJEr6gk(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        EditTextEmoji editTextEmoji = this.nameTextView;
        int i3 = ThemeDescription.FLAG_TEXTCOLOR;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(editTextEmoji, i3, null, null, null, null, i4));
        EditTextEmoji editTextEmoji2 = this.nameTextView;
        int i5 = ThemeDescription.FLAG_HINTTEXTCOLOR;
        int i6 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextEmoji2, i5, null, null, null, null, i6));
        EditTextEmoji editTextEmoji3 = this.nameTextView;
        int i7 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i8 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(editTextEmoji3, i7, null, null, null, null, i8));
        EditTextEmoji editTextEmoji4 = this.nameTextView;
        int i9 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i10 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(editTextEmoji4, i9, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.descriptionTextView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i10));
        TextView textView = this.helpTextView;
        int i11 = ThemeDescription.FLAG_TEXTCOLOR;
        int i12 = Theme.key_windowBackgroundWhiteGrayText8;
        arrayList.add(new ThemeDescription(textView, i11, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.linkContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
        ShadowSectionCell shadowSectionCell = this.sectionCell;
        int i13 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i14 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(shadowSectionCell, i13, null, null, null, null, i14));
        int i15 = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        arrayList.add(new ThemeDescription(this.headerCell2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i6));
        TextView textView2 = this.checkTextView;
        int i16 = ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG;
        int i17 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(textView2, i16, null, null, null, null, i17));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, Theme.key_windowBackgroundWhiteGreenText));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i14));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.typeInfoCell, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
        arrayList.add(new ThemeDescription(this.adminedInfoCell, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i14));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
        LinearLayout linearLayout = this.privateContainer;
        int i18 = ThemeDescription.FLAG_SELECTOR;
        int i19 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(linearLayout, i18, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.privateContainer, 0, new Class[]{TextBlockCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.loadingAdminedCell, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i19));
        int i20 = Theme.key_radioBackground;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i20));
        int i21 = Theme.key_radioBackgroundChecked;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i21));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        int i22 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_SELECTOR, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i20));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i21));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        int i23 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_LINKCOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{AdminedChannelCell.class}, new String[]{"deleteButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public static void m1559$r8$lambda$Pn9Ahmnr68U1cnAGgtWoJEr6gk(ChannelCreateActivity channelCreateActivity) {
        LinearLayout linearLayout = channelCreateActivity.adminnedChannelsLayout;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = channelCreateActivity.adminnedChannelsLayout.getChildAt(i);
                if (childAt instanceof AdminedChannelCell) {
                    ((AdminedChannelCell) childAt).update();
                }
            }
        }
    }
}
