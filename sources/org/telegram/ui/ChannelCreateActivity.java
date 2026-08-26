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
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
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
    private static final int done_button = 1;
    private ArrayList<AdminedChannelCell> adminedChannelCells;
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
    private Utilities.Callback2<BaseFragment, Long> onFinishListener;
    private LinkActionView permanentLinkView;
    private LinearLayout privateContainer;
    private LinearLayout publicContainer;
    private RadioButtonCell radioButtonCell1;
    private RadioButtonCell radioButtonCell2;
    private ShadowSectionCell sectionCell;
    private TextInfoPrivacyCell typeInfoCell;
    private double videoTimestamp;

    public class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        public void lambda$onItemClick$0() {
            ChannelCreateActivity.this.updateDoneProgress(false);
            if (ChannelCreateActivity.this.onFinishListener != null) {
                Utilities.Callback2 callback2 = ChannelCreateActivity.this.onFinishListener;
                ChannelCreateActivity channelCreateActivity = ChannelCreateActivity.this;
                callback2.run(channelCreateActivity, Long.valueOf(channelCreateActivity.chatId));
            }
        }

        public void lambda$onItemClick$1() {
            ChannelCreateActivity.this.updateDoneProgress(false);
            if (ChannelCreateActivity.this.onFinishListener != null) {
                Utilities.Callback2 callback2 = ChannelCreateActivity.this.onFinishListener;
                ChannelCreateActivity channelCreateActivity = ChannelCreateActivity.this;
                callback2.run(channelCreateActivity, Long.valueOf(channelCreateActivity.chatId));
            }
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
                if (ChannelCreateActivity.this.currentStep == 0) {
                    if (ChannelCreateActivity.this.getParentActivity() == null) {
                        return;
                    }
                    if (ChannelCreateActivity.this.donePressed) {
                        ChannelCreateActivity.this.showDoneCancelDialog();
                        return;
                    }
                    if (ChannelCreateActivity.this.nameTextView.length() == 0) {
                        Vibrator vibrator = (Vibrator) ChannelCreateActivity.this.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ChannelCreateActivity.this.nameTextView);
                        return;
                    }
                    ChannelCreateActivity.this.donePressed = true;
                    AndroidUtilities.runOnUIThread(ChannelCreateActivity.this.enableDoneLoading, 200L);
                    if (ChannelCreateActivity.this.imageUpdater.isUploadingImage()) {
                        ChannelCreateActivity.this.createAfterUpload = true;
                        return;
                    } else {
                        ChannelCreateActivity channelCreateActivity = ChannelCreateActivity.this;
                        channelCreateActivity.doneRequestId = Integer.valueOf(MessagesController.getInstance(((BaseFragment) channelCreateActivity).currentAccount).createChat(ChannelCreateActivity.this.nameTextView.getText().toString(), new ArrayList<>(), ChannelCreateActivity.this.descriptionTextView.getText().toString(), 2, false, null, null, -1, ChannelCreateActivity.this));
                        return;
                    }
                }
                if (ChannelCreateActivity.this.currentStep == 1) {
                    if (ChannelCreateActivity.this.isPrivate) {
                        if (ChannelCreateActivity.this.onFinishListener != null) {
                            Utilities.Callback2 callback2 = ChannelCreateActivity.this.onFinishListener;
                            ChannelCreateActivity channelCreateActivity2 = ChannelCreateActivity.this;
                            callback2.run(channelCreateActivity2, Long.valueOf(channelCreateActivity2.chatId));
                        }
                    } else {
                        if (ChannelCreateActivity.this.descriptionTextView.length() == 0) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(ChannelCreateActivity.this.getParentActivity(), 0, null);
                            builder.setTitle(LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle));
                            builder.setMessage(LocaleController.getString(R.string.ChannelPublicEmptyUsername));
                            builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
                            ChannelCreateActivity.this.showDialog(builder.create());
                            return;
                        }
                        if (!ChannelCreateActivity.this.lastNameAvailable) {
                            Vibrator vibrator2 = (Vibrator) ChannelCreateActivity.this.getParentActivity().getSystemService("vibrator");
                            if (vibrator2 != null) {
                                vibrator2.vibrate(200L);
                            }
                            AndroidUtilities.shakeView(ChannelCreateActivity.this.checkTextView);
                            return;
                        }
                        AndroidUtilities.runOnUIThread(ChannelCreateActivity.this.enableDoneLoading, 200L);
                        MessagesController messagesController = MessagesController.getInstance(((BaseFragment) ChannelCreateActivity.this).currentAccount);
                        ChannelCreateActivity channelCreateActivity3 = ChannelCreateActivity.this;
                        long j = channelCreateActivity3.chatId;
                        String str = ChannelCreateActivity.this.lastCheckName;
                        final int i2 = 0;
                        Runnable runnable = new Runnable(this) {
                            public final ChannelCreateActivity.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        this.f$0.lambda$onItemClick$0();
                                        break;
                                    default:
                                        this.f$0.lambda$onItemClick$1();
                                        break;
                                }
                            }
                        };
                        final int i3 = 1;
                        messagesController.updateChannelUserName(channelCreateActivity3, j, str, runnable, new Runnable(this) {
                            public final ChannelCreateActivity.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        this.f$0.lambda$onItemClick$0();
                                        break;
                                    default:
                                        this.f$0.lambda$onItemClick$1();
                                        break;
                                }
                            }
                        });
                    }
                    if (ChannelCreateActivity.this.onFinishListener == null) {
                        Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(2, "step");
                        bundleM.putLong("chatId", ChannelCreateActivity.this.chatId);
                        bundleM.putInt("chatType", 2);
                        ChannelCreateActivity.this.presentFragment(new GroupCreateActivity(bundleM), true);
                    }
                }
            }
        }
    }

    public ChannelCreateActivity(Bundle bundle) {
        super(bundle);
        this.adminedChannelCells = new ArrayList<>();
        this.canCreatePublic = true;
        this.enableDoneLoading = new ChannelCreateActivity$$ExternalSyntheticLambda3(this, 3);
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new ChannelCreateActivity$$ExternalSyntheticLambda6(this, 0));
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

    public boolean checkUserName(String str) {
        if (str == null || str.length() <= 0) {
            this.checkTextView.setVisibility(8);
        } else {
            this.checkTextView.setVisibility(0);
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
                this.checkTextView.setTextColor(Theme.getColor(null, i, false));
                return false;
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (i2 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    TextView textView2 = this.checkTextView;
                    int i3 = Theme.key_text_RedRegular;
                    textView2.setTag(Integer.valueOf(i3));
                    this.checkTextView.setTextColor(Theme.getColor(null, i3, false));
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                    TextView textView3 = this.checkTextView;
                    int i4 = Theme.key_text_RedRegular;
                    textView3.setTag(Integer.valueOf(i4));
                    this.checkTextView.setTextColor(Theme.getColor(null, i4, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidShort));
            TextView textView4 = this.checkTextView;
            int i5 = Theme.key_text_RedRegular;
            textView4.setTag(Integer.valueOf(i5));
            this.checkTextView.setTextColor(Theme.getColor(null, i5, false));
            return false;
        }
        if (str.length() > 32) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidLong));
            TextView textView5 = this.checkTextView;
            int i6 = Theme.key_text_RedRegular;
            textView5.setTag(Integer.valueOf(i6));
            this.checkTextView.setTextColor(Theme.getColor(null, i6, false));
            return false;
        }
        this.checkTextView.setText(LocaleController.getString(R.string.LinkChecking));
        TextView textView6 = this.checkTextView;
        int i7 = Theme.key_windowBackgroundWhiteGrayText8;
        textView6.setTag(Integer.valueOf(i7));
        this.checkTextView.setTextColor(Theme.getColor(null, i7, false));
        this.lastCheckName = str;
        PhotoViewer$7$$ExternalSyntheticLambda0 photoViewer$7$$ExternalSyntheticLambda0 = new PhotoViewer$7$$ExternalSyntheticLambda0(29, this, str);
        this.checkRunnable = photoViewer$7$$ExternalSyntheticLambda0;
        AndroidUtilities.runOnUIThread(photoViewer$7$$ExternalSyntheticLambda0, 300L);
        return true;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new ChannelCreateActivity$$ExternalSyntheticLambda6(this, 1));
    }

    public void lambda$checkUserName$22(String str, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_checkUsername tL_channels_checkUsername) {
        this.checkReqId = 0;
        String str2 = this.lastCheckName;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            this.checkTextView.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            TextView textView = this.checkTextView;
            int i = Theme.key_windowBackgroundWhiteGreenText;
            textView.setTag(Integer.valueOf(i));
            this.checkTextView.setTextColor(Theme.getColor(null, i, false));
            this.lastNameAvailable = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            this.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            this.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                this.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                this.checkTextView.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            this.checkTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText8, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            this.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInUse));
        } else {
            this.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            this.canCreatePublic = false;
            showPremiumIncreaseLimitDialog();
        }
        this.lastNameAvailable = false;
    }

    public void lambda$checkUserName$23(String str, TLRPC.TL_channels_checkUsername tL_channels_checkUsername, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((BaseFragment) this, str, tL_error, tLObject, (TLObject) tL_channels_checkUsername, 11));
    }

    public void lambda$checkUserName$24(String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new LinkManager$$ExternalSyntheticLambda0((Object) this, str, (Object) tL_channels_checkUsername, 10), 2);
    }

    public boolean lambda$createView$10(TextView textView, int i, KeyEvent keyEvent) {
        View view;
        if (i != 6 || (view = this.doneButton) == null) {
            return false;
        }
        view.performClick();
        return true;
    }

    public void lambda$createView$11(View view) {
        if (!this.canCreatePublic) {
            showPremiumIncreaseLimitDialog();
        } else if (this.isPrivate) {
            this.isPrivate = false;
            updatePrivatePublic();
        }
    }

    public void lambda$createView$12(View view) {
        if (this.isPrivate) {
            return;
        }
        this.isPrivate = true;
        updatePrivatePublic();
    }

    public static boolean lambda$createView$5(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$6() {
        this.avatar = null;
        this.avatarBig = null;
        this.inputPhoto = null;
        this.inputVideo = null;
        this.inputVideoPath = null;
        this.inputEmojiMarkup = null;
        this.videoTimestamp = 0.0d;
        showAvatarProgress(false, true);
        this.avatarImage.setImage((ImageLocation) null, (String) null, this.avatarDrawable, (Object) null);
        this.avatarEditor.setAnimation(this.cameraDrawable);
        this.cameraDrawable.setCurrentFrame(0);
    }

    public void lambda$createView$7(DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCurrentFrame(0, false);
        } else {
            this.cameraDrawable.setCustomEndFrame(86);
            this.avatarEditor.playAnimation();
        }
    }

    public void lambda$createView$8(View view) {
        this.imageUpdater.openMenu(this.avatar != null, new ChannelCreateActivity$$ExternalSyntheticLambda3(this, 2), new OAuthSheet$$ExternalSyntheticLambda18(this, 4), 0);
        this.cameraDrawable.setCurrentFrame(0);
        this.cameraDrawable.setCustomEndFrame(43);
        this.avatarEditor.playAnimation();
    }

    public boolean lambda$createView$9(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 || TextUtils.isEmpty(this.nameTextView.getEditText().getText())) {
            return false;
        }
        this.descriptionTextView.requestFocus();
        return true;
    }

    public void lambda$didUploadPhoto$15(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.avatar = fileLocation;
            this.avatarBig = photoSize2.location;
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, (Object) null);
            showAvatarProgress(true, false);
            return;
        }
        this.inputPhoto = inputFile;
        this.inputVideo = inputFile2;
        this.inputEmojiMarkup = videoSize;
        this.inputVideoPath = str;
        this.videoTimestamp = d;
        if (this.createAfterUpload) {
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
            this.doneButton.performClick();
        }
        showAvatarProgress(false, true);
        this.avatarEditor.setImageDrawable(null);
    }

    public void lambda$generateLink$13(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            this.invite = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject).invites.get(0);
        }
        this.loadingInvite = false;
        LinkActionView linkActionView = this.permanentLinkView;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
        linkActionView.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
    }

    public void lambda$generateLink$14(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda30(this, tL_error, tLObject, 2));
    }

    public void lambda$getThemeDescriptions$26() {
        LinearLayout linearLayout = this.adminnedChannelsLayout;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.adminnedChannelsLayout.getChildAt(i);
                if (childAt instanceof AdminedChannelCell) {
                    AdminedChannelCell adminedChannelCell = (AdminedChannelCell) childAt;
                    adminedChannelCell.avatarDrawable.setInfo(adminedChannelCell.currentAccount, adminedChannelCell.currentChannel);
                    adminedChannelCell.avatarImageView.invalidate();
                }
            }
        }
    }

    public void lambda$loadAdminedChannels$16() {
        this.canCreatePublic = true;
        if (this.descriptionTextView.length() > 0) {
            checkUserName(this.descriptionTextView.getText().toString());
        }
        updatePrivatePublic();
    }

    public void lambda$loadAdminedChannels$17(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            AndroidUtilities.runOnUIThread(new ChannelCreateActivity$$ExternalSyntheticLambda3(this, 0));
        }
    }

    public void lambda$loadAdminedChannels$18(TLRPC.Chat chat, AlertDialog alertDialog, int i) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new ChannelCreateActivity$$ExternalSyntheticLambda6(this, 2), 64);
    }

    public void lambda$loadAdminedChannels$19(View view) {
        TLRPC.Chat currentChannel = ((AdminedChannelCell) view.getParent()).getCurrentChannel();
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        if (currentChannel.megagroup) {
            SendMessagesHelper$$ExternalSyntheticOutline0.m("RevokeLinkAlert", R.string.RevokeLinkAlert, new Object[]{MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title}, builder);
        } else {
            SendMessagesHelper$$ExternalSyntheticOutline0.m("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, new Object[]{MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title}, builder);
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new WearAuthSheet$$ExternalSyntheticLambda3(23, this, currentChannel));
        showDialog(builder.create());
    }

    public void lambda$loadAdminedChannels$20(TLObject tLObject) {
        this.loadingAdminedChannels = false;
        if (tLObject == null || getParentActivity() == null) {
            return;
        }
        for (int i = 0; i < this.adminedChannelCells.size(); i++) {
            this.linearLayout.removeView(this.adminedChannelCells.get(i));
        }
        this.adminedChannelCells.clear();
        TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
        for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
            AdminedChannelCell adminedChannelCell = new AdminedChannelCell(getParentActivity(), new ChannelCreateActivity$$ExternalSyntheticLambda17(this, 3), false, 0);
            TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
            boolean z = true;
            if (i2 != tL_messages_chats.chats.size() - 1) {
                z = false;
            }
            adminedChannelCell.setChannel(chat, z);
            this.adminedChannelCells.add(adminedChannelCell);
            this.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
        }
        updatePrivatePublic();
    }

    public void lambda$loadAdminedChannels$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda80(1, this, tLObject));
    }

    public void lambda$new$0(TLRPC.TL_error tL_error) {
        this.canCreatePublic = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
    }

    public void lambda$new$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda80(2, this, tL_error));
    }

    public void lambda$new$3() {
        updateDoneProgress(true);
    }

    public void lambda$showDoneCancelDialog$2(AlertDialog alertDialog, int i) {
        this.donePressed = false;
        this.createAfterUpload = false;
        if (this.doneRequestId != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.doneRequestId.intValue(), true);
            this.doneRequestId = null;
        }
        updateDoneProgress(false);
        alertDialog.dismiss();
    }

    public void lambda$showPremiumIncreaseLimitDialog$25() {
        this.canCreatePublic = true;
        updatePrivatePublic();
    }

    public void lambda$updateDoneProgress$4(ValueAnimator valueAnimator) {
        this.doneButtonDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.doneButtonDrawable.invalidateSelf();
    }

    private void loadAdminedChannels() {
        if (this.loadingAdminedChannels) {
            return;
        }
        this.loadingAdminedChannels = true;
        updatePrivatePublic();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ChannelCreateActivity$$ExternalSyntheticLambda6(this, 3));
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
            public void onAnimationCancel(Animator animator) {
                ChannelCreateActivity.this.avatarAnimation = null;
            }

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
        });
        this.avatarAnimation.start();
    }

    public void showDoneCancelDialog() {
        if (this.cancelDialog != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.StopLoadingTitle));
        builder.setMessage(LocaleController.getString(R.string.StopLoading));
        builder.setPositiveButton(LocaleController.getString(R.string.WaitMore), null);
        builder.setNegativeButton(LocaleController.getString(R.string.Stop), new BoostsActivity$$ExternalSyntheticLambda4(this, 6));
        this.cancelDialog = builder.show();
    }

    private void showErrorAlert(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        str.getClass();
        if (str.equals("USERNAME_INVALID")) {
            builder.setMessage(LocaleController.getString(R.string.LinkInvalid));
        } else if (str.equals("USERNAME_OCCUPIED")) {
            builder.setMessage(LocaleController.getString(R.string.LinkInUse));
        } else {
            builder.setMessage(LocaleController.getString(R.string.ErrorOccurred));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    private void showPremiumIncreaseLimitDialog() {
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(2, this, getParentActivity(), this.currentAccount, null);
        limitReachedBottomSheet.parentIsChannel = true;
        limitReachedBottomSheet.onSuccessRunnable = new ChannelCreateActivity$$ExternalSyntheticLambda3(this, 1);
        showDialog(limitReachedBottomSheet);
    }

    public void updateDoneProgress(boolean z) {
        int i = 1;
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
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, i));
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.getProgress() - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    private void updatePrivatePublic() {
        if (this.sectionCell == null) {
            return;
        }
        int i = 8;
        if (this.isPrivate || this.canCreatePublic) {
            TextInfoPrivacyCell textInfoPrivacyCell = this.typeInfoCell;
            int i2 = Theme.key_windowBackgroundWhiteGrayText4;
            textInfoPrivacyCell.setTag(Integer.valueOf(i2));
            this.typeInfoCell.setTextColor(Theme.getColor(null, i2, false));
            this.sectionCell.setVisibility(0);
            this.adminedInfoCell.setVisibility(8);
            this.adminnedChannelsLayout.setVisibility(8);
            TextInfoPrivacyCell textInfoPrivacyCell2 = this.typeInfoCell;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(textInfoPrivacyCell2.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
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
        } else {
            this.typeInfoCell.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            TextInfoPrivacyCell textInfoPrivacyCell3 = this.typeInfoCell;
            int i3 = Theme.key_text_RedRegular;
            textInfoPrivacyCell3.setTag(Integer.valueOf(i3));
            this.typeInfoCell.setTextColor(Theme.getColor(null, i3, false));
            this.linkContainer.setVisibility(8);
            this.sectionCell.setVisibility(8);
            if (this.loadingAdminedChannels) {
                this.loadingAdminedCell.setVisibility(0);
                this.adminnedChannelsLayout.setVisibility(8);
                TextInfoPrivacyCell textInfoPrivacyCell4 = this.typeInfoCell;
                textInfoPrivacyCell4.setBackgroundDrawable(Theme.getThemedDrawableByKey(textInfoPrivacyCell4.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                this.adminedInfoCell.setVisibility(8);
            } else {
                TextInfoPrivacyCell textInfoPrivacyCell5 = this.typeInfoCell;
                textInfoPrivacyCell5.setBackgroundDrawable(Theme.getThemedDrawableByKey(textInfoPrivacyCell5.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                this.loadingAdminedCell.setVisibility(8);
                this.adminnedChannelsLayout.setVisibility(0);
                this.adminedInfoCell.setVisibility(0);
            }
        }
        this.radioButtonCell1.radioButton.setChecked(!this.isPrivate, true);
        this.radioButtonCell2.radioButton.setChecked(this.isPrivate, true);
        this.descriptionTextView.clearFocus();
        AndroidUtilities.hideKeyboard(this.descriptionTextView);
    }

    @Override
    public final boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public View createView(Context context) {
        final ChannelCreateActivity channelCreateActivity = this;
        final int i = 0;
        final int i2 = 1;
        EditTextEmoji editTextEmoji = channelCreateActivity.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        channelCreateActivity.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        channelCreateActivity.actionBar.setAllowOverlayTitle(true);
        channelCreateActivity.actionBar.setActionBarMenuOnItemClick(channelCreateActivity.new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateMenu = channelCreateActivity.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i3 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i3, false)));
        channelCreateActivity.doneButtonDrawable = crossfadeDrawable;
        channelCreateActivity.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        int i4 = channelCreateActivity.currentStep;
        if (i4 == 0) {
            channelCreateActivity.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                private boolean ignoreLayout;

                @Override
                public void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int paddingTop;
                    int measuredHeight;
                    int measuredHeight2;
                    int childCount = getChildCount();
                    int iMeasureKeyboardHeight = measureKeyboardHeight();
                    int emojiPadding = (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : ChannelCreateActivity.this.nameTextView.getEmojiPadding();
                    setBottomClip(emojiPadding);
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = getChildAt(i14);
                        if (childAt.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth = childAt.getMeasuredWidth();
                            int measuredHeight3 = childAt.getMeasuredHeight();
                            int i15 = layoutParams.gravity;
                            if (i15 == -1) {
                                i15 = 51;
                            }
                            int i16 = i15 & 112;
                            int i17 = i15 & 7;
                            if (i17 != 1) {
                                if (i17 != 5) {
                                    i11 = layoutParams.leftMargin;
                                } else {
                                    i9 = i7 - measuredWidth;
                                    i10 = layoutParams.rightMargin;
                                }
                                if (i16 != 16) {
                                    if (i16 != 48) {
                                        paddingTop = layoutParams.topMargin + getPaddingTop();
                                    } else if (i16 != 80) {
                                        paddingTop = layoutParams.topMargin;
                                    } else {
                                        i12 = ((i8 - emojiPadding) - i6) - measuredHeight3;
                                        i13 = layoutParams.bottomMargin;
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
                                    childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                                } else {
                                    i12 = ((((i8 - emojiPadding) - i6) - measuredHeight3) / 2) + layoutParams.topMargin;
                                    i13 = layoutParams.bottomMargin;
                                }
                                paddingTop = i12 - i13;
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
                                childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                            } else {
                                i9 = (((i7 - i5) - measuredWidth) / 2) + layoutParams.leftMargin;
                                i10 = layoutParams.rightMargin;
                            }
                            i11 = i9 - i10;
                            if (i16 != 16) {
                                if (i16 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i16 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i12 = ((i8 - emojiPadding) - i6) - measuredHeight3;
                                    i13 = layoutParams.bottomMargin;
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
                                childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                            } else {
                                i12 = ((((i8 - emojiPadding) - i6) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i13 = layoutParams.bottomMargin;
                            }
                            paddingTop = i12 - i13;
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
                            childAt.layout(i11, paddingTop, measuredWidth + i11, measuredHeight3 + paddingTop);
                        }
                    }
                    notifyHeightChanged();
                }

                @Override
                public void onMeasure(int i5, int i6) {
                    int size = View.MeasureSpec.getSize(i5);
                    int size2 = View.MeasureSpec.getSize(i6);
                    setMeasuredDimension(size, size2);
                    int paddingTop = size2 - getPaddingTop();
                    measureChildWithMargins(((BaseFragment) ChannelCreateActivity.this).actionBar, i5, 0, i6, 0);
                    if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                        this.ignoreLayout = true;
                        ChannelCreateActivity.this.nameTextView.hideEmojiView();
                        this.ignoreLayout = false;
                    }
                    int childCount = getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) ChannelCreateActivity.this).actionBar) {
                            if (ChannelCreateActivity.this.nameTextView == null || !ChannelCreateActivity.this.nameTextView.isPopupView(childAt)) {
                                measureChildWithMargins(childAt, i5, 0, i6, 0);
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), 1073741824));
                            }
                        }
                    }
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            sizeNotifierFrameLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(10));
            channelCreateActivity.fragmentView = sizeNotifierFrameLayout;
            int i5 = Theme.key_windowBackgroundWhite;
            sizeNotifierFrameLayout.setTag(Integer.valueOf(i5));
            channelCreateActivity.fragmentView.setBackgroundColor(Theme.getColor(null, i5, false));
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
                public void invalidate(int i6, int i7, int i8, int i9) {
                    if (ChannelCreateActivity.this.avatarOverlay != null) {
                        ChannelCreateActivity.this.avatarOverlay.invalidate();
                    }
                    super.invalidate(i6, i7, i8, i9);
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
                public void onDraw(Canvas canvas) {
                    if (ChannelCreateActivity.this.avatarImage == null || !ChannelCreateActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                        return;
                    }
                    paint.setAlpha((int) (ChannelCreateActivity.this.avatarProgressView.getAlpha() * ChannelCreateActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            };
            channelCreateActivity.avatarOverlay = view;
            view.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            View view2 = channelCreateActivity.avatarOverlay;
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(view2, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 12.0f));
            channelCreateActivity.avatarOverlay.setOnClickListener(new ChannelCreateActivity$$ExternalSyntheticLambda17(channelCreateActivity, i));
            int i6 = R.raw.camera;
            channelCreateActivity.cameraDrawable = new RLottieDrawable(i6, Fragment$$ExternalSyntheticOutline0.m(i6, ""), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            RLottieImageView rLottieImageView = new RLottieImageView(context) {
                @Override
                public void invalidate(int i7, int i8, int i9, int i10) {
                    super.invalidate(i7, i8, i9, i10);
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
            channelCreateActivity.nameTextView.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(channelCreateActivity) {
                public final ChannelCreateActivity f$0;

                {
                    this.f$0 = channelCreateActivity;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                    switch (i) {
                        case 0:
                            return this.f$0.lambda$createView$9(textView, i7, keyEvent);
                        default:
                            return this.f$0.lambda$createView$10(textView, i7, keyEvent);
                    }
                }
            });
            EditTextEmoji editTextEmoji3 = channelCreateActivity.nameTextView;
            boolean z5 = LocaleController.isRTL;
            frameLayout.addView(editTextEmoji3, LayoutHelper.createFrame(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            channelCreateActivity.descriptionTextView = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            channelCreateActivity.descriptionTextView.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            EditTextBoldCursor editTextBoldCursor2 = channelCreateActivity.descriptionTextView;
            int i7 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor2.setTextColor(Theme.getColor(null, i7, false));
            channelCreateActivity.descriptionTextView.setBackgroundDrawable(null);
            channelCreateActivity.descriptionTextView.setLineColors(channelCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteInputField), channelCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated), channelCreateActivity.getThemedColor(Theme.key_text_RedRegular));
            channelCreateActivity.descriptionTextView.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            channelCreateActivity.descriptionTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.descriptionTextView.setInputType(180225);
            channelCreateActivity.descriptionTextView.setImeOptions(6);
            channelCreateActivity.descriptionTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            channelCreateActivity.descriptionTextView.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            channelCreateActivity.descriptionTextView.setCursorColor(Theme.getColor(null, i7, false));
            channelCreateActivity.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
            channelCreateActivity.descriptionTextView.setCursorWidth(1.5f);
            channelCreateActivity.linearLayout.addView(channelCreateActivity.descriptionTextView, LayoutHelper.createLinear(-1, -2, 24.0f, 18.0f, 24.0f, 0.0f));
            channelCreateActivity.descriptionTextView.setOnEditorActionListener(new TextView.OnEditorActionListener(channelCreateActivity) {
                public final ChannelCreateActivity f$0;

                {
                    this.f$0 = channelCreateActivity;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                    switch (i2) {
                        case 0:
                            return this.f$0.lambda$createView$9(textView, i8, keyEvent);
                        default:
                            return this.f$0.lambda$createView$10(textView, i8, keyEvent);
                    }
                }
            });
            channelCreateActivity.descriptionTextView.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                }
            });
            TextView textView = new TextView(context);
            channelCreateActivity.helpTextView = textView;
            textView.setTextSize(1, 15.0f);
            channelCreateActivity.helpTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText8, false));
            channelCreateActivity.helpTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.helpTextView.setText(LocaleController.getString(R.string.DescriptionInfo));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.helpTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i4 == 1) {
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
            int i8 = Theme.key_windowBackgroundGray;
            view3.setTag(Integer.valueOf(i8));
            channelCreateActivity.fragmentView.setBackgroundColor(Theme.getColor(null, i8, false));
            HeaderCell headerCell = new HeaderCell(context, 23);
            channelCreateActivity.headerCell2 = headerCell;
            headerCell.setHeight(46);
            HeaderCell headerCell2 = channelCreateActivity.headerCell2;
            int i9 = Theme.key_windowBackgroundWhite;
            headerCell2.setBackgroundColor(Theme.getColor(null, i9, false));
            channelCreateActivity.headerCell2.setText(LocaleController.getString(channelCreateActivity.isGroup ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.headerCell2);
            LinearLayout linearLayout3 = new LinearLayout(context);
            channelCreateActivity.linearLayout2 = linearLayout3;
            linearLayout3.setOrientation(1);
            channelCreateActivity.linearLayout2.setBackgroundColor(Theme.getColor(null, i9, false));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.linearLayout2, LayoutHelper.createLinear(-1, -2));
            RadioButtonCell radioButtonCell = new RadioButtonCell(context, false);
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
            channelCreateActivity.radioButtonCell1.setOnClickListener(new ChannelCreateActivity$$ExternalSyntheticLambda17(channelCreateActivity, i2));
            Boolean bool2 = channelCreateActivity.forcePublic;
            if (bool2 == null || bool2.booleanValue()) {
                channelCreateActivity.linearLayout2.addView(channelCreateActivity.radioButtonCell1, LayoutHelper.createLinear(-1, -2));
            }
            RadioButtonCell radioButtonCell2 = new RadioButtonCell(context, false);
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
            channelCreateActivity.radioButtonCell2.setOnClickListener(new ChannelCreateActivity$$ExternalSyntheticLambda17(channelCreateActivity, 2));
            Boolean bool4 = channelCreateActivity.forcePublic;
            if (bool4 == null || !bool4.booleanValue()) {
                channelCreateActivity.linearLayout2.addView(channelCreateActivity.radioButtonCell2, LayoutHelper.createLinear(-1, -2));
            }
            ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, null, 0);
            channelCreateActivity.sectionCell = shadowSectionCell;
            channelCreateActivity.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            channelCreateActivity.linkContainer = linearLayout4;
            linearLayout4.setOrientation(1);
            channelCreateActivity.linkContainer.setBackgroundColor(Theme.getColor(null, i9, false));
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
            int i10 = Theme.key_windowBackgroundWhiteHintText;
            editTextBoldCursor4.setHintTextColor(Theme.getColor(null, i10, false));
            EditTextBoldCursor editTextBoldCursor5 = channelCreateActivity.editText;
            int i11 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor5.setTextColor(Theme.getColor(null, i11, false));
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
            channelCreateActivity.descriptionTextView.setHintTextColor(Theme.getColor(null, i10, false));
            channelCreateActivity.descriptionTextView.setTextColor(Theme.getColor(null, i11, false));
            channelCreateActivity.descriptionTextView.setMaxLines(1);
            channelCreateActivity.descriptionTextView.setLines(1);
            channelCreateActivity.descriptionTextView.setBackgroundDrawable(null);
            channelCreateActivity.descriptionTextView.setPadding(0, 0, 0, 0);
            channelCreateActivity.descriptionTextView.setSingleLine(true);
            channelCreateActivity.descriptionTextView.setInputType(163872);
            channelCreateActivity.descriptionTextView.setImeOptions(6);
            channelCreateActivity.descriptionTextView.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            channelCreateActivity.descriptionTextView.setCursorColor(Theme.getColor(null, i11, false));
            channelCreateActivity.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
            channelCreateActivity.descriptionTextView.setCursorWidth(1.5f);
            channelCreateActivity.publicContainer.addView(channelCreateActivity.descriptionTextView, LayoutHelper.createLinear(-1, 36));
            channelCreateActivity.descriptionTextView.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
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
                        for (int i12 = 0; i12 < typefaceSpanArr.length; i12++) {
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
                            }, charSequence.getSpanStart(typefaceSpanArr[i12]), charSequence.getSpanEnd(typefaceSpanArr[i12]), 33);
                            charSequence.removeSpan(typefaceSpanArr[i12]);
                        }
                    }
                    super.setText(charSequence, bufferType);
                }
            };
            channelCreateActivity.checkTextView = linksTextView;
            linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            channelCreateActivity.checkTextView.setHighlightColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkSelection, false));
            channelCreateActivity.checkTextView.setTextSize(1, 15.0f);
            channelCreateActivity.checkTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.checkTextView.setVisibility(8);
            channelCreateActivity.checkTextView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            channelCreateActivity.linkContainer.addView(channelCreateActivity.checkTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
            channelCreateActivity.typeInfoCell = textInfoPrivacyCell;
            int i12 = R.drawable.greydivider_bottom;
            int i13 = Theme.key_windowBackgroundGrayShadow;
            textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i12, i13));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.typeInfoCell, LayoutHelper.createLinear(-1, -2));
            LoadingCell loadingCell = new LoadingCell(context);
            channelCreateActivity.loadingAdminedCell = loadingCell;
            channelCreateActivity.linearLayout.addView(loadingCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            channelCreateActivity.adminnedChannelsLayout = linearLayout7;
            linearLayout7.setBackgroundColor(Theme.getColor(null, i9, false));
            channelCreateActivity.adminnedChannelsLayout.setOrientation(1);
            channelCreateActivity.linearLayout.addView(channelCreateActivity.adminnedChannelsLayout, LayoutHelper.createLinear(-1, -2));
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
            channelCreateActivity.adminedInfoCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i12, i13));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.adminedInfoCell, LayoutHelper.createLinear(-1, -2));
            channelCreateActivity.updatePrivatePublic();
        }
        return channelCreateActivity.fragmentView;
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

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda50(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 2));
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
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return this.nameTextView.getText().toString();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 4);
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 262145, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        EditTextEmoji editTextEmoji = this.nameTextView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(editTextEmoji, 4, null, null, null, null, i2));
        EditTextEmoji editTextEmoji2 = this.nameTextView;
        int i3 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextEmoji2, 8388608, null, null, null, null, i3));
        EditTextEmoji editTextEmoji3 = this.nameTextView;
        int i4 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(editTextEmoji3, 32, null, null, null, null, i4));
        EditTextEmoji editTextEmoji4 = this.nameTextView;
        int i5 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(editTextEmoji4, 65568, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.descriptionTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionTextView, 8388608, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.descriptionTextView, 32, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionTextView, 65568, null, null, null, null, i5));
        TextView textView = this.helpTextView;
        int i6 = Theme.key_windowBackgroundWhiteGrayText8;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.linearLayout2, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.linkContainer, 1, null, null, null, null, i));
        ShadowSectionCell shadowSectionCell = this.sectionCell;
        int i7 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(shadowSectionCell, 32, null, null, null, null, i7));
        int i8 = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.headerCell2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.editText, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.editText, 8388608, null, null, null, null, i3));
        TextView textView2 = this.checkTextView;
        int i9 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(textView2, 262148, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.checkTextView, 262148, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.checkTextView, 262148, null, null, null, null, Theme.key_windowBackgroundWhiteGreenText));
        arrayList.add(new ThemeDescription(this.typeInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.typeInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.typeInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.adminedInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 1, null, null, null, null, i));
        LinearLayout linearLayout = this.privateContainer;
        int i10 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(linearLayout, 4096, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.privateContainer, 0, new Class[]{TextBlockCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.loadingAdminedCell, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 4096, null, null, null, null, i10));
        int i11 = Theme.key_radioBackground;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 8192, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i11));
        int i12 = Theme.key_radioBackgroundChecked;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 16384, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i12));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 4, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        int i13 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 4, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 4096, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 8192, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i11));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 16384, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i12));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 4, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 4, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 4, new Class[]{AdminedChannelCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        int i14 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 4, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, null, null, -1, null, i14));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 2, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 8, new Class[]{AdminedChannelCell.class}, new String[]{"deleteButton"}, null, null, -1, null, i14));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onActivityResult(i, i2, intent);
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
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
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
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.currentStep == 1) {
            return;
        }
        this.nameTextView.requestFocus();
        this.nameTextView.openKeyboard();
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

    public void setOnFinishListener(Utilities.Callback2<BaseFragment, Long> callback2) {
        this.onFinishListener = callback2;
    }

    @Override
    public final boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }
}
