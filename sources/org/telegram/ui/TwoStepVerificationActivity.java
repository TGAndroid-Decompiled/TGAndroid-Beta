package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.StoriesController$$ExternalSyntheticLambda5;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.WebActionBar;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class TwoStepVerificationActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public SimpleTextView bottomButton;
    public TextView bottomTextView;
    public TextView cancelResetButton;
    public int changePasswordRow;
    public int changeRecoveryEmailRow;
    public TL_account.Password currentPassword;
    public byte[] currentPasswordHash;
    public byte[] currentSecret;
    public long currentSecretId;
    public TwoStepVerificationActivityDelegate delegate;
    public int delegateType;
    public String delegateTypeString;
    public boolean destroyed;
    public EmptyTextProgressView emptyView;
    public final TwoStepVerificationActivity$$ExternalSyntheticLambda4 errorColorTimeout;
    public FragmentFloatingButton floatingButton;
    public TransformableLoginButtonView floatingButtonIcon;
    public boolean forgotPasswordOnShow;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public boolean loading;
    public RLottieImageView lockImageView;
    public int otherwiseReloginDays;
    public EditTextBoldCursor passwordEditText;
    public int passwordEnabledDetailRow;
    public boolean passwordEntered;
    public OutlineTextContainerView passwordOutlineView;
    public boolean postedErrorColorTimeout;
    public AlertDialog progressDialog;
    public AnonymousClass3 radialProgressView;
    public boolean resetPasswordOnShow;
    public TextView resetWaitView;
    public int rowCount;
    public ScrollView scrollView;
    public int setPasswordDetailRow;
    public int setPasswordRow;
    public int setRecoveryEmailRow;
    public TextView subtitleTextView;
    public TextView titleTextView;
    public int turnPasswordOffRow;
    public final TwoStepVerificationActivity$$ExternalSyntheticLambda4 updateTimeRunnable;

    public final class AnonymousClass3 extends RadialProgressView {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight / 2;
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            TwoStepVerificationActivity twoStepVerificationActivity = TwoStepVerificationActivity.this;
            if (twoStepVerificationActivity.loading || twoStepVerificationActivity.currentPassword == null) {
                return 0;
            }
            return twoStepVerificationActivity.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            TwoStepVerificationActivity twoStepVerificationActivity = TwoStepVerificationActivity.this;
            return (i == twoStepVerificationActivity.setPasswordDetailRow || i == twoStepVerificationActivity.passwordEnabledDetailRow) ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            TwoStepVerificationActivity twoStepVerificationActivity = TwoStepVerificationActivity.this;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == twoStepVerificationActivity.setPasswordDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else {
                    if (i == twoStepVerificationActivity.passwordEnabledDetailRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.EnabledPasswordText));
                        return;
                    }
                    return;
                }
            }
            TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i3));
            textSettingsCell.setTextColor(Theme.getColor(null, i3, false));
            if (i == twoStepVerificationActivity.changePasswordRow) {
                textSettingsCell.setText(LocaleController.getString(R.string.ChangePassword), true);
                return;
            }
            if (i == twoStepVerificationActivity.setPasswordRow) {
                textSettingsCell.setText(LocaleController.getString(R.string.SetAdditionalPassword), true);
                return;
            }
            if (i == twoStepVerificationActivity.turnPasswordOffRow) {
                textSettingsCell.setText(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i == twoStepVerificationActivity.changeRecoveryEmailRow) {
                textSettingsCell.setText(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i == twoStepVerificationActivity.setRecoveryEmailRow) {
                textSettingsCell.setText(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textSettingsCell;
            Context context = this.mContext;
            if (i != 0) {
                textSettingsCell = new TextInfoPrivacyCell(context, 24, null);
            } else {
                textSettingsCell = new TextSettingsCell(context, 0, null);
                textSettingsCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
            return new RecyclerListView.Holder(textSettingsCell);
        }
    }

    public interface TwoStepVerificationActivityDelegate {
        void didEnterPassword(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP);
    }

    public TwoStepVerificationActivity() {
        super(null);
        this.passwordEntered = true;
        this.currentPasswordHash = new byte[0];
        this.errorColorTimeout = new TwoStepVerificationActivity$$ExternalSyntheticLambda4(this, 1);
        this.otherwiseReloginDays = -1;
        this.updateTimeRunnable = new TwoStepVerificationActivity$$ExternalSyntheticLambda4(this, 2);
    }

    public static boolean canHandleCurrentPassword(TL_account.Password password, boolean z) {
        if (z) {
            return !(password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown);
        }
        return ((password.new_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.current_algo instanceof TLRPC.TL_passwordKdfAlgoUnknown) || (password.new_secure_algo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown)) ? false : true;
    }

    public static void initPasswordNewAlgo(TL_account.Password password) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.new_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow = (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo;
            byte[] bArr = new byte[tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1.length + 32];
            Utilities.random.nextBytes(bArr);
            byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1 = bArr;
        }
        TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password.new_secure_algo;
        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
            byte[] bArr3 = new byte[tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt.length + 32];
            Utilities.random.nextBytes(bArr3);
            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt = bArr3;
        }
    }

    public final void cancelPasswordReset() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.CancelPasswordResetYes), new TwoStepVerificationActivity$$ExternalSyntheticLambda0(this, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.CancelPasswordResetNo), null);
        String string = LocaleController.getString(R.string.CancelReset);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.CancelPasswordReset);
        showDialog(alertDialog);
    }

    public final void clearPassword() {
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        byte[] bArr = this.currentPasswordHash;
        if (bArr == null || bArr.length == 0) {
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
        UserConfig.getInstance(this.currentAccount).resetSavedPassword();
        this.currentSecret = null;
        TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
        passwordinputsettings.flags = 3;
        passwordinputsettings.hint = "";
        passwordinputsettings.new_password_hash = new byte[0];
        passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
        updatepasswordsettings.new_settings.email = "";
        needShowProgress(false);
        Utilities.globalQueue.postRunnable(new TodoItemMenu$$ExternalSyntheticLambda9(18, this, updatepasswordsettings));
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2 = 24;
        final int i3 = 1;
        int i4 = 2;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i5 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        if (!this.passwordEntered || this.delegate != null) {
            this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            ActionBar actionBar = this.actionBar;
            int i6 = Theme.key_windowBackgroundWhiteBlackText;
            actionBar.setTitleColor(Theme.getColor(null, i6, false));
            this.actionBar.setItemsColor(Theme.getColor(null, i6, false), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
            this.actionBar.setCastShadows(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, i4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = Theme.key_windowBackgroundWhite;
        frameLayout.setBackgroundColor(Theme.getColor(null, i7, false));
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setFillViewport(true);
        frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        this.scrollView.addView(linearLayout, LayoutHelper.createScroll(-1, -2, 51));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.lockImageView = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.tsv_setup_intro, 100, 100, null);
        this.lockImageView.playAnimation();
        RLottieImageView rLottieImageView2 = this.lockImageView;
        if (AndroidUtilities.isSmallScreen()) {
            i = 8;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i = 0;
            } else {
                i = 8;
            }
        }
        rLottieImageView2.setVisibility(i);
        linearLayout.addView(this.lockImageView, LayoutHelper.createLinear(100, 100, 1));
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i8, false));
        this.titleTextView.setTextSize(1, 18.0f);
        this.titleTextView.setGravity(1);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 24, 8, 24, 0), context);
        this.subtitleTextView = textViewM;
        int i9 = Theme.key_windowBackgroundWhiteGrayText6;
        textViewM.setTextColor(Theme.getColor(null, i9, false));
        this.subtitleTextView.setTextSize(1, 15.0f);
        this.subtitleTextView.setGravity(1);
        this.subtitleTextView.setVisibility(8);
        linearLayout.addView(this.subtitleTextView, LayoutHelper.createLinear(-2, -2, 1, 42, 8, 42, 0));
        OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
        this.passwordOutlineView = outlineTextContainerView;
        int i10 = R.string.EnterPassword;
        outlineTextContainerView.setText(LocaleController.getString(i10));
        this.passwordOutlineView.animateSelection(1.0f, 1.0f, false);
        linearLayout.addView(this.passwordOutlineView, LayoutHelper.createLinear(-1, -2, 1, 24, 24, 24, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.passwordEditText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        this.passwordEditText.setTextColor(Theme.getColor(null, i8, false));
        this.passwordEditText.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        this.passwordEditText.setBackground(null);
        this.passwordEditText.setSingleLine(true);
        this.passwordEditText.setInputType(129);
        this.passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.passwordEditText.setTypeface(Typeface.DEFAULT);
        EditTextBoldCursor editTextBoldCursor2 = this.passwordEditText;
        int i11 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        editTextBoldCursor2.setCursorColor(Theme.getColor(null, i11, false));
        this.passwordEditText.setCursorWidth(1.5f);
        this.passwordEditText.setContentDescription(LocaleController.getString(i10));
        int iDp = AndroidUtilities.dp(16.0f);
        this.passwordEditText.setPadding(iDp, iDp, iDp, iDp);
        this.passwordOutlineView.addView(this.passwordEditText, LayoutHelper.createFrame(-2.0f, -1));
        OutlineTextContainerView outlineTextContainerView2 = this.passwordOutlineView;
        outlineTextContainerView2.attachedEditText = this.passwordEditText;
        outlineTextContainerView2.invalidate();
        this.passwordEditText.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 20));
        this.passwordEditText.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, i2));
        this.passwordEditText.addTextChangedListener(new WebActionBar.AnonymousClass5(this, 6));
        TextView textView2 = new TextView(context);
        this.bottomTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, i9, false));
        this.bottomTextView.setTextSize(1, 14.0f);
        this.bottomTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.bottomTextView.setText(LocaleController.getString(R.string.YourEmailInfo));
        TextView textViewM2 = ArticleViewer.IBlock.CC.m(linearLayout, this.bottomTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 40, 30, 40, 0), context);
        this.resetWaitView = textViewM2;
        textViewM2.setTextColor(Theme.getColor(null, i9, false));
        this.resetWaitView.setTextSize(1, 12.0f);
        this.resetWaitView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        linearLayout.addView(this.resetWaitView, LayoutHelper.createLinear(40.0f, 8.0f, 40.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(80);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(1.0f, -1, 0));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.bottomButton = simpleTextView;
        simpleTextView.setTextSize(15);
        this.bottomButton.setGravity(19);
        this.bottomButton.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        frameLayout.addView(this.bottomButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.bottomButton.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f$0.onPasswordForgot();
                        break;
                    case 1:
                        this.f$0.cancelPasswordReset();
                        break;
                    default:
                        this.f$0.processDone$12();
                        break;
                }
            }
        });
        new PhotoViewer.AnonymousClass14(this.bottomButton);
        TextView textView3 = new TextView(context);
        this.cancelResetButton = textView3;
        textView3.setTextSize(1, 15.0f);
        this.cancelResetButton.setGravity(19);
        this.cancelResetButton.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.cancelResetButton.setText(LocaleController.getString(R.string.CancelReset));
        this.cancelResetButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
        this.cancelResetButton.setVisibility(8);
        frameLayout.addView(this.cancelResetButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        this.cancelResetButton.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.onPasswordForgot();
                        break;
                    case 1:
                        this.f$0.cancelPasswordReset();
                        break;
                    default:
                        this.f$0.processDone$12();
                        break;
                }
            }
        });
        new PhotoViewer.AnonymousClass14(this.cancelResetButton);
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        new PhotoViewer.AnonymousClass14(fragmentFloatingButton);
        final int i12 = 2;
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f$0.onPasswordForgot();
                        break;
                    case 1:
                        this.f$0.cancelPasswordReset();
                        break;
                    default:
                        this.f$0.processDone$12();
                        break;
                }
            }
        });
        TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView;
        transformableLoginButtonView.setTransformType(1);
        this.floatingButtonIcon.setProgress(0.0f);
        this.floatingButtonIcon.setColor(Theme.getColor(null, Theme.key_chats_actionIcon, false));
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.floatingButton.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56, 17));
        this.floatingButton.addAdditionalView(this.floatingButtonIcon);
        frameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections(true);
        zzku.m(this.listView);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, i2));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, null);
        this.radialProgressView = anonymousClass3;
        anonymousClass3.setSize(AndroidUtilities.dp(20.0f));
        this.radialProgressView.setAlpha(0.0f);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.radialProgressView.setProgressColor(Theme.getColor(null, i11, false));
        this.actionBar.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        updateRows$18();
        if (this.passwordEntered && this.delegate == null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle));
        } else {
            this.actionBar.setTitle(null);
        }
        if (this.delegate != null) {
            this.titleTextView.setText(LocaleController.getString(R.string.YourPassword));
            int i13 = this.delegateType;
            if (i13 == 1) {
                this.subtitleTextView.setText(LocaleController.getString(R.string.PleaseEnterCurrentPasswordWithdraw));
            } else if (i13 == 2) {
                zzko.m(R.string.PleaseEnterCurrentPasswordGiftTransfer, new Object[]{this.delegateTypeString}, this.subtitleTextView);
            } else {
                this.subtitleTextView.setText(LocaleController.getString(R.string.PleaseEnterCurrentPasswordTransfer));
            }
            this.subtitleTextView.setVisibility(0);
        } else {
            this.titleTextView.setText(LocaleController.getString(R.string.YourPassword));
            this.subtitleTextView.setVisibility(0);
            this.subtitleTextView.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
        }
        if (this.passwordEntered) {
            View view = this.fragmentView;
            int i14 = Theme.key_windowBackgroundGray;
            view.setBackgroundColor(Theme.getColor(null, i14, false));
            this.fragmentView.setTag(Integer.valueOf(i14));
        } else {
            this.fragmentView.setBackgroundColor(Theme.getColor(null, i7, false));
            this.fragmentView.setTag(Integer.valueOf(i7));
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Object obj;
        if (i == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                this.currentPasswordHash = (byte[]) obj;
            }
            loadPasswordInfo(false, false, null);
            updateRows$18();
        }
    }

    @Override
    public final void finishFragment() {
        if (this.otherwiseReloginDays < 0) {
            super.finishFragment();
            return;
        }
        Bundle bundleM = zzkw.m("afterSignup", true);
        MainTabsActivity mainTabsActivity = new MainTabsActivity();
        mainTabsActivity.prepareDialogsActivity(bundleM);
        presentFragment(mainTabsActivity, true);
    }

    public final TLRPC.TL_inputCheckPasswordSRP getNewSrpPassword() {
        TL_account.Password password = this.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return SRPHelper.startCheck(this.currentPasswordHash, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, EditTextSettingsCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        int i4 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        TextView textView = this.titleTextView;
        int i5 = Theme.key_windowBackgroundWhiteGrayText6;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.bottomTextView, 4, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.bottomButton, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.passwordEditText, 4, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.passwordEditText, 8388608, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.passwordEditText, 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.passwordEditText, 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    public final void lambda$clearPassword$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            initPasswordNewAlgo(password);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
            clearPassword();
        }
    }

    public final void lambda$clearPassword$23(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            initPasswordNewAlgo(password);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
            clearPassword();
        }
    }

    public final void lambda$clearPassword$25(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationActivity$$ExternalSyntheticLambda1(this, 6), 8);
            return;
        }
        needHideProgress();
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            this.currentPassword = null;
            this.currentPasswordHash = new byte[0];
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            finishFragment();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                showAlertWithText$2(LocaleController.getString(R.string.AppName), tL_error.text);
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                showAlertWithText$2(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
            }
        }
    }

    public final void lambda$clearPassword$27(TL_account.updatePasswordSettings updatepasswordsettings) {
        if (updatepasswordsettings.password == null) {
            if (this.currentPassword.current_algo == null) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationActivity$$ExternalSyntheticLambda1(this, 3), 8);
                return;
            }
            updatepasswordsettings.password = getNewSrpPassword();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new TwoStepVerificationActivity$$ExternalSyntheticLambda1(this, 4), 10);
    }

    public final void lambda$createView$7$1(int i) {
        if (i == this.setPasswordRow || i == this.changePasswordRow) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 0, this.currentPassword);
            twoStepVerificationSetupActivity.fragmentsToClose.add(this);
            byte[] bArr = this.currentPasswordHash;
            long j = this.currentSecretId;
            byte[] bArr2 = this.currentSecret;
            twoStepVerificationSetupActivity.currentPasswordHash = bArr;
            twoStepVerificationSetupActivity.currentSecret = bArr2;
            twoStepVerificationSetupActivity.currentSecretId = j;
            twoStepVerificationSetupActivity.emailOnly = false;
            presentFragment(twoStepVerificationSetupActivity);
            return;
        }
        if (i == this.setRecoveryEmailRow || i == this.changeRecoveryEmailRow) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(this.currentAccount, 3, this.currentPassword);
            twoStepVerificationSetupActivity2.fragmentsToClose.add(this);
            byte[] bArr3 = this.currentPasswordHash;
            long j2 = this.currentSecretId;
            byte[] bArr4 = this.currentSecret;
            twoStepVerificationSetupActivity2.currentPasswordHash = bArr3;
            twoStepVerificationSetupActivity2.currentSecret = bArr4;
            twoStepVerificationSetupActivity2.currentSecretId = j2;
            twoStepVerificationSetupActivity2.emailOnly = true;
            presentFragment(twoStepVerificationSetupActivity2);
            return;
        }
        if (i == this.turnPasswordOffRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
            if (this.currentPassword.has_secure_values) {
                string = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(string, "\n\n"), R.string.TurnPasswordOffPassport);
            }
            String string2 = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
            String string3 = LocaleController.getString(R.string.Disable);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.message = string;
            alertDialog.title = string2;
            builder.setPositiveButton(string3, new TwoStepVerificationActivity$$ExternalSyntheticLambda0(this, 1));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog);
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public final void lambda$loadPasswordInfo$18(TLRPC.TL_error tL_error, TLObject tLObject, boolean z, boolean z2, Runnable runnable) {
        if (tL_error == null) {
            this.loading = false;
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            if (!canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            if (!z || z2) {
                byte[] bArr = this.currentPasswordHash;
                this.passwordEntered = (bArr != null && bArr.length > 0) || !this.currentPassword.has_password;
            }
            initPasswordNewAlgo(this.currentPassword);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
        if (runnable != null) {
            runnable.run();
        }
        updateRows$18();
    }

    public final void lambda$onPasswordForgot$14(TLObject tLObject, TLRPC.TL_error tL_error) {
        needHideProgress();
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                showAlertWithText$2(LocaleController.getString(R.string.AppName), tL_error.text);
                return;
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                showAlertWithText$2(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                return;
            }
        }
        TL_account.Password password = this.currentPassword;
        password.email_unconfirmed_pattern = ((TLRPC.TL_auth_passwordRecovery) tLObject).email_pattern;
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, password) {
            @Override
            public final void onReset() {
                TwoStepVerificationActivity.this.resetPasswordOnShow = true;
            }
        };
        twoStepVerificationSetupActivity.fragmentsToClose.add(this);
        byte[] bArr = this.currentPasswordHash;
        long j = this.currentSecretId;
        byte[] bArr2 = this.currentSecret;
        twoStepVerificationSetupActivity.currentPasswordHash = bArr;
        twoStepVerificationSetupActivity.currentSecret = bArr2;
        twoStepVerificationSetupActivity.currentSecretId = j;
        twoStepVerificationSetupActivity.emailOnly = false;
        presentFragment(twoStepVerificationSetupActivity);
    }

    public final void lambda$processDone$29(byte[] bArr, boolean z) {
        if (this.delegate == null || !z) {
            needHideProgress();
        }
        if (!z) {
            AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
            return;
        }
        this.currentPasswordHash = bArr;
        this.passwordEntered = true;
        if (this.delegate != null) {
            AndroidUtilities.hideKeyboard(this.passwordEditText);
            this.delegate.didEnterPassword(getNewSrpPassword());
            return;
        }
        if (TextUtils.isEmpty(this.currentPassword.email_unconfirmed_pattern)) {
            AndroidUtilities.hideKeyboard(this.passwordEditText);
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            twoStepVerificationActivity.passwordEntered = true;
            twoStepVerificationActivity.currentPasswordHash = this.currentPasswordHash;
            twoStepVerificationActivity.currentPassword = this.currentPassword;
            twoStepVerificationActivity.currentSecret = this.currentSecret;
            twoStepVerificationActivity.currentSecretId = this.currentSecretId;
            presentFragment(twoStepVerificationActivity, true);
            return;
        }
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 5, this.currentPassword);
        byte[] bArr2 = this.currentPasswordHash;
        long j = this.currentSecretId;
        byte[] bArr3 = this.currentSecret;
        twoStepVerificationSetupActivity.currentPasswordHash = bArr2;
        twoStepVerificationSetupActivity.currentSecret = bArr3;
        twoStepVerificationSetupActivity.currentSecretId = j;
        twoStepVerificationSetupActivity.emailOnly = true;
        presentFragment(twoStepVerificationSetupActivity, true);
    }

    public final void lambda$processDone$30(byte[] bArr, TLObject tLObject, byte[] bArr2) {
        boolean z;
        byte[] bArrComputeSHA512;
        TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject;
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
        if (tL_secureSecretSettings != null) {
            this.currentSecret = tL_secureSecretSettings.secure_secret;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
            z = false;
            if (!(securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000)) {
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                    byte[] bArr3 = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                    bArrComputeSHA512 = Utilities.computeSHA512(bArr3, bArr, bArr3);
                }
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8(this, z, bArr2, 9));
            }
            bArrComputeSHA512 = Utilities.computePBKDF2(bArr, ((TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo).salt);
            this.currentSecretId = passwordsettings.secure_settings.secure_secret_id;
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArrComputeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(bArrComputeSHA512, 32, bArr5, 0, 16);
            byte[] bArr6 = this.currentSecret;
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, bArr6.length, 0, 0);
            TLRPC.TL_secureSecretSettings tL_secureSecretSettings2 = passwordsettings.secure_settings;
            if (!PassportActivity.checkSecret(tL_secureSecretSettings2.secure_secret, Long.valueOf(tL_secureSecretSettings2.secure_secret_id))) {
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                updatepasswordsettings.password = getNewSrpPassword();
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                updatepasswordsettings.new_settings = passwordinputsettings;
                passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings3 = updatepasswordsettings.new_settings.new_secure_settings;
                tL_secureSecretSettings3.secure_secret = new byte[0];
                tL_secureSecretSettings3.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
                TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
                passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
                passwordinputsettings2.flags |= 4;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, new PassportActivity$$ExternalSyntheticLambda1(1));
                this.currentSecret = null;
                this.currentSecretId = 0L;
            }
        } else {
            this.currentSecret = null;
            this.currentSecretId = 0L;
        }
        z = true;
        AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8(this, z, bArr2, 9));
    }

    public final void lambda$processDone$31(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            initPasswordNewAlgo(password);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
            processDone$12();
        }
    }

    public final void lambda$processDone$33(TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationActivity$$ExternalSyntheticLambda1(this, 5), 8);
            return;
        }
        needHideProgress();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            onFieldError(this.passwordOutlineView, this.passwordEditText, true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            showAlertWithText$2(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            showAlertWithText$2(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public final void lambda$processDone$35(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.current_algo;
        byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        StarGiftSheet$$ExternalSyntheticLambda7 starGiftSheet$$ExternalSyntheticLambda7 = new StarGiftSheet$$ExternalSyntheticLambda7(this, bArr, x, 8);
        TL_account.Password password = this.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            starGiftSheet$$ExternalSyntheticLambda7.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, starGiftSheet$$ExternalSyntheticLambda7, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        starGiftSheet$$ExternalSyntheticLambda7.run(null, tL_error2);
    }

    public final void loadPasswordInfo(boolean z, boolean z2, Runnable runnable) {
        if (!z2) {
            this.loading = true;
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.mObservable.notifyChanged();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new StoriesController$$ExternalSyntheticLambda5(this, z2, z, runnable), 10);
    }

    public final void needHideProgress() {
        if (!this.passwordEntered) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.radialProgressView, (Property<AnonymousClass3, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.radialProgressView, (Property<AnonymousClass3, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.radialProgressView, (Property<AnonymousClass3, Float>) View.SCALE_Y, 0.1f));
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.start();
            return;
        }
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog == null) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.progressDialog = null;
    }

    public final void needShowProgress(boolean z) {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.progressDialog != null) {
            return;
        }
        if (!this.passwordEntered) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.radialProgressView, (Property<AnonymousClass3, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.radialProgressView, (Property<AnonymousClass3, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.radialProgressView, (Property<AnonymousClass3, Float>) View.SCALE_Y, 1.0f));
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.start();
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        this.progressDialog = alertDialog;
        alertDialog.canCacnel = false;
        if (!z) {
            alertDialog.show();
            return;
        }
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 300L);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.otherwiseReloginDays < 0) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        showSetForcePasswordAlert();
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        RLottieImageView rLottieImageView = this.lockImageView;
        if (AndroidUtilities.isSmallScreen()) {
            i = 8;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i = 0;
            } else {
                i = 8;
            }
        }
        rLottieImageView.setVisibility(i);
    }

    public final void onFieldError(OutlineTextContainerView outlineTextContainerView, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            editTextBoldCursor.setText("");
        }
        OutlineTextContainerView.animateSpring(outlineTextContainerView.errorSpring, 1.0f);
        AndroidUtilities.shakeViewSpring(outlineTextContainerView, 5.0f, new TwoStepVerificationActivity$$ExternalSyntheticLambda4(this, 3));
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        preload(null);
        updateRows$18();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.updateTimeRunnable);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        this.destroyed = true;
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.progressDialog = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void onPasswordForgot() {
        TL_account.Password password = this.currentPassword;
        if (password.pending_reset_date == 0 && password.has_recovery) {
            needShowProgress(true);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new TwoStepVerificationActivity$$ExternalSyntheticLambda1(this, 0), 10);
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.currentPassword.pending_reset_date == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationActivity$$ExternalSyntheticLambda0(this, 4));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            String string = LocaleController.getString(R.string.ResetPassword);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.RestorePasswordNoEmailText2);
            showDialog(alertDialog);
            return;
        }
        if (getConnectionsManager().getCurrentTime() <= this.currentPassword.pending_reset_date) {
            cancelPasswordReset();
            return;
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder2.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationActivity$$ExternalSyntheticLambda0(this, 3));
        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        String string2 = LocaleController.getString(R.string.ResetPassword);
        AlertDialog alertDialog2 = builder2.alertDialog;
        alertDialog2.title = string2;
        alertDialog2.message = LocaleController.getString(R.string.RestorePasswordResetPasswordText);
        showDialog(alertDialog2);
        TextView textView = (TextView) alertDialog2.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            if (this.forgotPasswordOnShow) {
                onPasswordForgot();
                this.forgotPasswordOnShow = false;
            } else if (this.resetPasswordOnShow) {
                resetPassword();
                this.resetPasswordOnShow = false;
            }
        }
    }

    public final void preload(Runnable runnable) {
        byte[] bArr;
        TL_account.Password password = this.currentPassword;
        if (password == null || password.current_algo == null || (bArr = this.currentPasswordHash) == null || bArr.length <= 0) {
            loadPasswordInfo(true, password != null, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void processDone$12() {
        if (this.passwordEntered) {
            return;
        }
        String string = this.passwordEditText.getText().toString();
        if (string.length() == 0) {
            onFieldError(this.passwordOutlineView, this.passwordEditText, false);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(string);
        needShowProgress(false);
        Utilities.globalQueue.postRunnable(new TodoItemMenu$$ExternalSyntheticLambda9(17, this, stringBytes));
    }

    public final void resetPassword() {
        needShowProgress(true);
        getConnectionsManager().sendRequest(new TL_account.resetPassword(), new TwoStepVerificationActivity$$ExternalSyntheticLambda1(this, 1));
    }

    public final void setCurrentPasswordParams(TL_account.Password password, byte[] bArr, long j, byte[] bArr2) {
        this.currentPassword = password;
        this.currentPasswordHash = bArr;
        this.currentSecret = bArr2;
        this.currentSecretId = j;
        this.passwordEntered = (bArr != null && bArr.length > 0) || !password.has_password;
    }

    public final void showAlertWithText$2(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        alertDialog.message = str2;
        showDialog(alertDialog);
    }

    public final void showSetForcePasswordAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.Warning);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.otherwiseReloginDays, new Object[0]);
        builder.setPositiveButton(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        builder.setNegativeButton(LocaleController.getString(R.string.ForceSetPasswordCancel), new TwoStepVerificationActivity$$ExternalSyntheticLambda0(this, 0));
        ((TextView) builder.show().getButton(-2)).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
    }

    public final void updateBottomButton() {
        String pluralString;
        if (this.passwordEntered) {
            return;
        }
        int i = this.currentPassword.pending_reset_date;
        TwoStepVerificationActivity$$ExternalSyntheticLambda4 twoStepVerificationActivity$$ExternalSyntheticLambda4 = this.updateTimeRunnable;
        if (i != 0) {
            int currentTime = getConnectionsManager().getCurrentTime();
            int i2 = this.currentPassword.pending_reset_date;
            if (currentTime > i2) {
                if (this.resetWaitView.getVisibility() != 8) {
                    this.resetWaitView.setVisibility(8);
                }
                if (this.currentPassword.pending_reset_date == 0) {
                    this.bottomButton.setText(LocaleController.getString(R.string.ForgotPassword), false);
                    this.cancelResetButton.setVisibility(8);
                    this.bottomButton.setVisibility(0);
                } else {
                    this.bottomButton.setText(LocaleController.getString(R.string.ResetPassword), false);
                    this.cancelResetButton.setVisibility(0);
                    this.bottomButton.setVisibility(0);
                }
                this.bottomButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
                AndroidUtilities.cancelRunOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4);
            } else {
                int iMax = Math.max(1, i2 - getConnectionsManager().getCurrentTime());
                if (iMax > 86400) {
                    pluralString = LocaleController.formatPluralString("Days", iMax / 86400, new Object[0]);
                } else {
                    pluralString = iMax >= 3600 ? LocaleController.formatPluralString("Hours", iMax / 3600, new Object[0]) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(iMax / 60), Integer.valueOf(iMax % 60));
                }
                this.resetWaitView.setText(LocaleController.formatString("RestorePasswordResetIn", R.string.RestorePasswordResetIn, pluralString));
                this.resetWaitView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
                if (this.bottomButton.getVisibility() != 8) {
                    this.bottomButton.setVisibility(8);
                }
                if (this.resetWaitView.getVisibility() != 0) {
                    this.resetWaitView.setVisibility(0);
                }
                this.cancelResetButton.setVisibility(0);
                AndroidUtilities.cancelRunOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4);
                AndroidUtilities.runOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4, 1000L);
            }
        } else {
            if (this.resetWaitView.getVisibility() != 8) {
                this.resetWaitView.setVisibility(8);
            }
            if (this.currentPassword.pending_reset_date == 0) {
                this.bottomButton.setText(LocaleController.getString(R.string.ForgotPassword), false);
                this.cancelResetButton.setVisibility(8);
                this.bottomButton.setVisibility(0);
            } else {
                this.bottomButton.setText(LocaleController.getString(R.string.ResetPassword), false);
                this.cancelResetButton.setVisibility(0);
                this.bottomButton.setVisibility(0);
            }
            this.bottomButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            AndroidUtilities.cancelRunOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4);
        }
        if (this.currentPassword == null || this.bottomButton == null || this.resetWaitView.getVisibility() != 0) {
            AndroidUtilities.cancelRunOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4);
            TextView textView = this.cancelResetButton;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public final void updateRows$18() {
        TL_account.Password password;
        StringBuilder sb = new StringBuilder();
        sb.append(this.setPasswordRow);
        sb.append(this.setPasswordDetailRow);
        sb.append(this.changePasswordRow);
        sb.append(this.turnPasswordOffRow);
        sb.append(this.setRecoveryEmailRow);
        sb.append(this.changeRecoveryEmailRow);
        sb.append(this.passwordEnabledDetailRow);
        sb.append(this.rowCount);
        this.rowCount = 0;
        this.setPasswordRow = -1;
        this.setPasswordDetailRow = -1;
        this.changePasswordRow = -1;
        this.turnPasswordOffRow = -1;
        this.setRecoveryEmailRow = -1;
        this.changeRecoveryEmailRow = -1;
        this.passwordEnabledDetailRow = -1;
        if (!this.loading && (password = this.currentPassword) != null && this.passwordEntered) {
            if (password.has_password) {
                this.changePasswordRow = 0;
                this.rowCount = 2;
                this.turnPasswordOffRow = 1;
                if (password.has_recovery) {
                    this.rowCount = 3;
                    this.changeRecoveryEmailRow = 2;
                } else {
                    this.rowCount = 3;
                    this.setRecoveryEmailRow = 2;
                }
                int i = this.rowCount;
                this.rowCount = i + 1;
                this.passwordEnabledDetailRow = i;
            } else {
                this.setPasswordRow = 0;
                this.rowCount = 2;
                this.setPasswordDetailRow = 1;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.setPasswordRow);
        sb2.append(this.setPasswordDetailRow);
        sb2.append(this.changePasswordRow);
        sb2.append(this.turnPasswordOffRow);
        sb2.append(this.setRecoveryEmailRow);
        sb2.append(this.changeRecoveryEmailRow);
        sb2.append(this.passwordEnabledDetailRow);
        sb2.append(this.rowCount);
        if (this.listAdapter != null && !sb.toString().equals(sb2.toString())) {
            this.listAdapter.mObservable.notifyChanged();
        }
        if (this.fragmentView != null) {
            if (this.loading || this.passwordEntered) {
                RecyclerListView recyclerListView = this.listView;
                if (recyclerListView != null) {
                    recyclerListView.setVisibility(0);
                    this.scrollView.setVisibility(4);
                    this.listView.setEmptyView(this.emptyView);
                }
                if (this.passwordEditText != null) {
                    this.floatingButton.animatorButtonVisible.setValue(false, false);
                    this.passwordEditText.setVisibility(4);
                    this.titleTextView.setVisibility(4);
                    this.bottomTextView.setVisibility(8);
                    this.bottomButton.setVisibility(4);
                    updateBottomButton();
                }
                View view = this.fragmentView;
                int i2 = Theme.key_windowBackgroundGray;
                view.setBackgroundColor(Theme.getColor(null, i2, false));
                this.fragmentView.setTag(Integer.valueOf(i2));
                return;
            }
            RecyclerListView recyclerListView2 = this.listView;
            if (recyclerListView2 != null) {
                recyclerListView2.setEmptyView(null);
                this.listView.setVisibility(4);
                this.scrollView.setVisibility(0);
                this.emptyView.setVisibility(4);
            }
            if (this.passwordEditText != null) {
                this.floatingButton.animatorButtonVisible.setValue(true, false);
                this.passwordEditText.setVisibility(0);
                View view2 = this.fragmentView;
                int i3 = Theme.key_windowBackgroundWhite;
                view2.setBackgroundColor(Theme.getColor(null, i3, false));
                this.fragmentView.setTag(Integer.valueOf(i3));
                this.titleTextView.setVisibility(0);
                this.bottomButton.setVisibility(0);
                updateBottomButton();
                this.bottomTextView.setVisibility(8);
                if (TextUtils.isEmpty(this.currentPassword.hint)) {
                    this.passwordEditText.setHint((CharSequence) null);
                } else {
                    this.passwordEditText.setHint(this.currentPassword.hint);
                }
                AndroidUtilities.runOnUIThread(new TwoStepVerificationActivity$$ExternalSyntheticLambda4(this, 0), 200L);
            }
        }
    }
}
