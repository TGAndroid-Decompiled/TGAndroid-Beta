package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextBlockCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.GroupCallFullscreenAdapter;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;

public final class ChannelCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    public final ArrayList adminedChannelCells;
    public TextInfoPrivacyCell adminedInfoCell;
    public LinearLayout adminnedChannelsLayout;
    public TLRPC.FileLocation avatar;
    public AnimatorSet avatarAnimation;
    public TLRPC.FileLocation avatarBig;
    public final AvatarDrawable avatarDrawable;
    public AnonymousClass5 avatarEditor;
    public UserCell.AnonymousClass2 avatarImage;
    public ChatActivity.AnonymousClass27 avatarOverlay;
    public AnonymousClass6 avatarProgressView;
    public RLottieDrawable cameraDrawable;
    public boolean canCreatePublic;
    public AlertDialog cancelDialog;
    public final long chatId;
    public int checkReqId;
    public ChatActivity$$ExternalSyntheticLambda7 checkRunnable;
    public CheckBoxCell.AnonymousClass2 checkTextView;
    public boolean createAfterUpload;
    public final int currentStep;
    public EditTextBoldCursor descriptionTextView;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public ValueAnimator doneButtonDrawableAnimator;
    public boolean donePressed;
    public Integer doneRequestId;
    public EditTextBoldCursor editText;
    public final ChannelCreateActivity$$ExternalSyntheticLambda1 enableDoneLoading;
    public final Boolean forcePublic;
    public HeaderCell headerCell;
    public HeaderCell headerCell2;
    public TextView helpTextView;
    public final ImageUpdater imageUpdater;
    public TLRPC.VideoSize inputEmojiMarkup;
    public TLRPC.InputFile inputPhoto;
    public TLRPC.InputFile inputVideo;
    public String inputVideoPath;
    public TLRPC.TL_chatInviteExported invite;
    public boolean isGroup;
    public boolean isPrivate;
    public String lastCheckName;
    public boolean lastNameAvailable;
    public LinearLayout linearLayout;
    public LinearLayout linearLayout2;
    public LinearLayout linkContainer;
    public LoadingCell loadingAdminedCell;
    public boolean loadingAdminedChannels;
    public boolean loadingInvite;
    public EditTextEmoji nameTextView;
    public String nameToSet;
    public Utilities.Callback2 onFinishListener;
    public LinkActionView permanentLinkView;
    public LinearLayout privateContainer;
    public LinearLayout publicContainer;
    public RadioButtonCell radioButtonCell1;
    public RadioButtonCell radioButtonCell2;
    public ShadowSectionCell sectionCell;
    public TextInfoPrivacyCell typeInfoCell;
    public double videoTimestamp;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        @Override
        public final void onItemClick(int i) {
            ChannelCreateActivity channelCreateActivity = ChannelCreateActivity.this;
            if (i == -1) {
                if (channelCreateActivity.donePressed) {
                    channelCreateActivity.showDoneCancelDialog();
                    return;
                } else {
                    channelCreateActivity.finishFragment();
                    return;
                }
            }
            if (i == 1) {
                ChannelCreateActivity$$ExternalSyntheticLambda1 channelCreateActivity$$ExternalSyntheticLambda1 = channelCreateActivity.enableDoneLoading;
                int i2 = channelCreateActivity.currentStep;
                if (i2 == 0) {
                    if (channelCreateActivity.getParentActivity() == null) {
                        return;
                    }
                    if (channelCreateActivity.donePressed) {
                        channelCreateActivity.showDoneCancelDialog();
                        return;
                    }
                    if (channelCreateActivity.nameTextView.editText.length() == 0) {
                        Vibrator vibrator = (Vibrator) channelCreateActivity.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(channelCreateActivity.nameTextView);
                        return;
                    }
                    channelCreateActivity.donePressed = true;
                    AndroidUtilities.runOnUIThread(channelCreateActivity$$ExternalSyntheticLambda1, 200L);
                    if (channelCreateActivity.imageUpdater.isUploadingImage()) {
                        channelCreateActivity.createAfterUpload = true;
                        return;
                    } else {
                        channelCreateActivity.doneRequestId = Integer.valueOf(MessagesController.getInstance(((BaseFragment) channelCreateActivity).currentAccount).createChat(channelCreateActivity.nameTextView.getText().toString(), new ArrayList<>(), channelCreateActivity.descriptionTextView.getText().toString(), 2, false, null, null, -1, channelCreateActivity));
                        return;
                    }
                }
                if (i2 == 1) {
                    boolean z = channelCreateActivity.isPrivate;
                    long j = channelCreateActivity.chatId;
                    if (z) {
                        Utilities.Callback2 callback2 = channelCreateActivity.onFinishListener;
                        if (callback2 != null) {
                            callback2.run(channelCreateActivity, Long.valueOf(j));
                        }
                    } else {
                        if (channelCreateActivity.descriptionTextView.length() == 0) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(channelCreateActivity.getParentActivity(), 0, null);
                            String string = LocaleController.getString(R.string.ChannelPublicEmptyUsernameTitle);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string;
                            alertDialog.message = LocaleController.getString(R.string.ChannelPublicEmptyUsername);
                            builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
                            channelCreateActivity.showDialog(alertDialog);
                            return;
                        }
                        if (!channelCreateActivity.lastNameAvailable) {
                            Vibrator vibrator2 = (Vibrator) channelCreateActivity.getParentActivity().getSystemService("vibrator");
                            if (vibrator2 != null) {
                                vibrator2.vibrate(200L);
                            }
                            AndroidUtilities.shakeView(channelCreateActivity.checkTextView);
                            return;
                        }
                        AndroidUtilities.runOnUIThread(channelCreateActivity$$ExternalSyntheticLambda1, 200L);
                        MessagesController messagesController = MessagesController.getInstance(((BaseFragment) channelCreateActivity).currentAccount);
                        String str = channelCreateActivity.lastCheckName;
                        final int i3 = 0;
                        Runnable runnable = new Runnable(this) {
                            public final ChannelCreateActivity.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        ChannelCreateActivity channelCreateActivity2 = ChannelCreateActivity.this;
                                        channelCreateActivity2.updateDoneProgress(false);
                                        Utilities.Callback2 callback3 = channelCreateActivity2.onFinishListener;
                                        if (callback3 != null) {
                                            callback3.run(channelCreateActivity2, Long.valueOf(channelCreateActivity2.chatId));
                                        }
                                        break;
                                    default:
                                        ChannelCreateActivity channelCreateActivity3 = ChannelCreateActivity.this;
                                        channelCreateActivity3.updateDoneProgress(false);
                                        Utilities.Callback2 callback4 = channelCreateActivity3.onFinishListener;
                                        if (callback4 != null) {
                                            callback4.run(channelCreateActivity3, Long.valueOf(channelCreateActivity3.chatId));
                                        }
                                        break;
                                }
                            }
                        };
                        final int i4 = 1;
                        messagesController.updateChannelUserName(channelCreateActivity, channelCreateActivity.chatId, str, runnable, new Runnable(this) {
                            public final ChannelCreateActivity.AnonymousClass1 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        ChannelCreateActivity channelCreateActivity2 = ChannelCreateActivity.this;
                                        channelCreateActivity2.updateDoneProgress(false);
                                        Utilities.Callback2 callback3 = channelCreateActivity2.onFinishListener;
                                        if (callback3 != null) {
                                            callback3.run(channelCreateActivity2, Long.valueOf(channelCreateActivity2.chatId));
                                        }
                                        break;
                                    default:
                                        ChannelCreateActivity channelCreateActivity3 = ChannelCreateActivity.this;
                                        channelCreateActivity3.updateDoneProgress(false);
                                        Utilities.Callback2 callback4 = channelCreateActivity3.onFinishListener;
                                        if (callback4 != null) {
                                            callback4.run(channelCreateActivity3, Long.valueOf(channelCreateActivity3.chatId));
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (channelCreateActivity.onFinishListener == null) {
                        Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(2, "step");
                        bundleM.putLong("chatId", j);
                        bundleM.putInt("chatType", 2);
                        channelCreateActivity.presentFragment(new GroupCreateActivity(bundleM), true);
                    }
                }
            }
        }
    }

    public final class AnonymousClass6 extends RadialProgressView {
        public AnonymousClass6(Context context) {
            super(context, null);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            ChannelCreateActivity.this.avatarOverlay.invalidate();
        }
    }

    public ChannelCreateActivity(Bundle bundle) {
        super(bundle);
        this.adminedChannelCells = new ArrayList();
        this.canCreatePublic = true;
        this.enableDoneLoading = new ChannelCreateActivity$$ExternalSyntheticLambda1(this, 0);
        int i = bundle.getInt("step", 0);
        this.currentStep = i;
        if (bundle.containsKey("forcePublic")) {
            this.forcePublic = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i == 0) {
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.imageUpdater = new ImageUpdater(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new ChannelCreateActivity$$ExternalSyntheticLambda2(this, 0));
            return;
        }
        if (i == 1) {
            boolean z = bundle.getBoolean("canCreatePublic", true);
            this.canCreatePublic = z;
            this.isPrivate = !z;
            if (!z && !this.loadingAdminedChannels) {
                this.loadingAdminedChannels = true;
                updatePrivatePublic();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ChannelCreateActivity$$ExternalSyntheticLambda2(this, 1));
            }
        }
        this.chatId = bundle.getLong("chat_id", 0L);
    }

    @Override
    public final boolean canFinishFragment() {
        return true;
    }

    public final void checkUserName$1(String str) {
        if (str == null || str.length() <= 0) {
            this.checkTextView.setVisibility(8);
        } else {
            this.checkTextView.setVisibility(0);
        }
        ChatActivity$$ExternalSyntheticLambda7 chatActivity$$ExternalSyntheticLambda7 = this.checkRunnable;
        if (chatActivity$$ExternalSyntheticLambda7 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda7);
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
                CheckBoxCell.AnonymousClass2 anonymousClass2 = this.checkTextView;
                int i = Theme.key_text_RedRegular;
                anonymousClass2.setTag(Integer.valueOf(i));
                this.checkTextView.setTextColor(Theme.getColor(null, i, false));
                return;
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (i2 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    CheckBoxCell.AnonymousClass2 anonymousClass3 = this.checkTextView;
                    int i3 = Theme.key_text_RedRegular;
                    anonymousClass3.setTag(Integer.valueOf(i3));
                    this.checkTextView.setTextColor(Theme.getColor(null, i3, false));
                    return;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                    CheckBoxCell.AnonymousClass2 anonymousClass4 = this.checkTextView;
                    int i4 = Theme.key_text_RedRegular;
                    anonymousClass4.setTag(Integer.valueOf(i4));
                    this.checkTextView.setTextColor(Theme.getColor(null, i4, false));
                    return;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidShort));
            CheckBoxCell.AnonymousClass2 anonymousClass5 = this.checkTextView;
            int i5 = Theme.key_text_RedRegular;
            anonymousClass5.setTag(Integer.valueOf(i5));
            this.checkTextView.setTextColor(Theme.getColor(null, i5, false));
            return;
        }
        if (str.length() > 32) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidLong));
            CheckBoxCell.AnonymousClass2 anonymousClass6 = this.checkTextView;
            int i6 = Theme.key_text_RedRegular;
            anonymousClass6.setTag(Integer.valueOf(i6));
            this.checkTextView.setTextColor(Theme.getColor(null, i6, false));
            return;
        }
        this.checkTextView.setText(LocaleController.getString(R.string.LinkChecking));
        CheckBoxCell.AnonymousClass2 anonymousClass7 = this.checkTextView;
        int i7 = Theme.key_windowBackgroundWhiteGrayText8;
        anonymousClass7.setTag(Integer.valueOf(i7));
        this.checkTextView.setTextColor(Theme.getColor(null, i7, false));
        this.lastCheckName = str;
        ChatActivity$$ExternalSyntheticLambda7 chatActivity$$ExternalSyntheticLambda8 = new ChatActivity$$ExternalSyntheticLambda7(11, this, str);
        this.checkRunnable = chatActivity$$ExternalSyntheticLambda8;
        AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda8, 300L);
    }

    @Override
    public final View createView(Context context) {
        final ChannelCreateActivity channelCreateActivity = this;
        int i = 4;
        int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        EditTextEmoji editTextEmoji = channelCreateActivity.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        channelCreateActivity.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        channelCreateActivity.actionBar.setAllowOverlayTitle(true);
        channelCreateActivity.actionBar.setActionBarMenuOnItemClick(channelCreateActivity.new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateMenu = channelCreateActivity.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i5 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i5, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i5, false)));
        channelCreateActivity.doneButtonDrawable = crossfadeDrawable;
        channelCreateActivity.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        int i6 = channelCreateActivity.currentStep;
        if (i6 == 0) {
            channelCreateActivity.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            ChatEditActivity.AnonymousClass3 anonymousClass3 = new ChatEditActivity.AnonymousClass3(i4, context, channelCreateActivity);
            anonymousClass3.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
            channelCreateActivity.fragmentView = anonymousClass3;
            int i7 = Theme.key_windowBackgroundWhite;
            anonymousClass3.setTag(Integer.valueOf(i7));
            channelCreateActivity.fragmentView.setBackgroundColor(Theme.getColor(null, i7, false));
            LinearLayout linearLayout = new LinearLayout(context);
            channelCreateActivity.linearLayout = linearLayout;
            linearLayout.setOrientation(1);
            anonymousClass3.addView(channelCreateActivity.linearLayout, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            channelCreateActivity.linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
            UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(channelCreateActivity, context, i);
            channelCreateActivity.avatarImage = anonymousClass2;
            anonymousClass2.setRoundRadius(AndroidUtilities.dp(32.0f));
            AvatarDrawable avatarDrawable = channelCreateActivity.avatarDrawable;
            avatarDrawable.setInfo(5L, null, null, null, null);
            channelCreateActivity.avatarImage.setImageDrawable(avatarDrawable);
            UserCell.AnonymousClass2 anonymousClass4 = channelCreateActivity.avatarImage;
            boolean z = LocaleController.isRTL;
            frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 12.0f, z ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(channelCreateActivity, context, paint, i4);
            channelCreateActivity.avatarOverlay = anonymousClass27;
            anonymousClass27.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ChatActivity.AnonymousClass27 anonymousClass28 = channelCreateActivity.avatarOverlay;
            boolean z2 = LocaleController.isRTL;
            frameLayout.addView(anonymousClass28, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 12.0f, z2 ? 16.0f : 0.0f, 12.0f));
            channelCreateActivity.avatarOverlay.setOnClickListener(new ChannelCreateActivity$$ExternalSyntheticLambda5(channelCreateActivity, i3));
            int i8 = R.raw.camera;
            channelCreateActivity.cameraDrawable = new RLottieDrawable(i8, SurfaceContainer$$ExternalSyntheticOutline0.m(i8, ""), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(channelCreateActivity, context, i3);
            channelCreateActivity.avatarEditor = anonymousClass5;
            anonymousClass5.setScaleType(ImageView.ScaleType.CENTER);
            channelCreateActivity.avatarEditor.setAnimation(channelCreateActivity.cameraDrawable);
            channelCreateActivity.avatarEditor.setEnabled(false);
            channelCreateActivity.avatarEditor.setClickable(false);
            channelCreateActivity.avatarEditor.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            AnonymousClass5 anonymousClass6 = channelCreateActivity.avatarEditor;
            boolean z3 = LocaleController.isRTL;
            frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 15.0f, 12.0f, z3 ? 15.0f : 0.0f, 12.0f));
            AnonymousClass6 anonymousClass7 = channelCreateActivity.new AnonymousClass6(context);
            channelCreateActivity.avatarProgressView = anonymousClass7;
            anonymousClass7.setSize(AndroidUtilities.dp(30.0f));
            channelCreateActivity.avatarProgressView.setProgressColor(-1);
            channelCreateActivity.avatarProgressView.setNoProgress(false);
            AnonymousClass6 anonymousClass8 = channelCreateActivity.avatarProgressView;
            boolean z4 = LocaleController.isRTL;
            frameLayout.addView(anonymousClass8, LayoutHelper.createFrame(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 12.0f, z4 ? 16.0f : 0.0f, 12.0f));
            channelCreateActivity.showAvatarProgress(false, false);
            EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, anonymousClass3, this, 0, false, null);
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
                public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
                    switch (i3) {
                        case 0:
                            ChannelCreateActivity channelCreateActivity2 = this.f$0;
                            if (i9 != 5) {
                                channelCreateActivity2.getClass();
                            } else if (!TextUtils.isEmpty(channelCreateActivity2.nameTextView.getEditText().getText())) {
                                channelCreateActivity2.descriptionTextView.requestFocus();
                                return true;
                            }
                            return false;
                        default:
                            ChannelCreateActivity channelCreateActivity3 = this.f$0;
                            if (i9 == 6) {
                                ActionBarMenuItem actionBarMenuItem = channelCreateActivity3.doneButton;
                                if (actionBarMenuItem != null) {
                                    actionBarMenuItem.performClick();
                                    return true;
                                }
                            } else {
                                channelCreateActivity3.getClass();
                            }
                            return false;
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
            int i9 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor2.setTextColor(Theme.getColor(null, i9, false));
            channelCreateActivity.descriptionTextView.setBackgroundDrawable(null);
            channelCreateActivity.descriptionTextView.setLineColors(channelCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteInputField), channelCreateActivity.getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated), channelCreateActivity.getThemedColor(Theme.key_text_RedRegular));
            channelCreateActivity.descriptionTextView.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            channelCreateActivity.descriptionTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.descriptionTextView.setInputType(180225);
            channelCreateActivity.descriptionTextView.setImeOptions(6);
            channelCreateActivity.descriptionTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            channelCreateActivity.descriptionTextView.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            channelCreateActivity.descriptionTextView.setCursorColor(Theme.getColor(null, i9, false));
            channelCreateActivity.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
            channelCreateActivity.descriptionTextView.setCursorWidth(1.5f);
            channelCreateActivity.linearLayout.addView(channelCreateActivity.descriptionTextView, LayoutHelper.createLinear(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            channelCreateActivity.descriptionTextView.setOnEditorActionListener(new TextView.OnEditorActionListener(channelCreateActivity) {
                public final ChannelCreateActivity f$0;

                {
                    this.f$0 = channelCreateActivity;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                    switch (i4) {
                        case 0:
                            ChannelCreateActivity channelCreateActivity2 = this.f$0;
                            if (i10 != 5) {
                                channelCreateActivity2.getClass();
                            } else if (!TextUtils.isEmpty(channelCreateActivity2.nameTextView.getEditText().getText())) {
                                channelCreateActivity2.descriptionTextView.requestFocus();
                                return true;
                            }
                            return false;
                        default:
                            ChannelCreateActivity channelCreateActivity3 = this.f$0;
                            if (i10 == 6) {
                                ActionBarMenuItem actionBarMenuItem = channelCreateActivity3.doneButton;
                                if (actionBarMenuItem != null) {
                                    actionBarMenuItem.performClick();
                                    return true;
                                }
                            } else {
                                channelCreateActivity3.getClass();
                            }
                            return false;
                    }
                }
            });
            channelCreateActivity.descriptionTextView.addTextChangedListener(new ChatEditActivity.AnonymousClass8(i4));
            TextView textView = new TextView(context);
            channelCreateActivity.helpTextView = textView;
            textView.setTextSize(1, 15.0f);
            channelCreateActivity.helpTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText8, false));
            channelCreateActivity.helpTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.helpTextView.setText(LocaleController.getString(R.string.DescriptionInfo));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.helpTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i6 == 1) {
            ScrollView scrollView = new ScrollView(context);
            channelCreateActivity.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            channelCreateActivity.linearLayout = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(channelCreateActivity.linearLayout, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = channelCreateActivity.getMessagesController();
            long j = channelCreateActivity.chatId;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
            boolean z6 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            channelCreateActivity.isGroup = z6;
            channelCreateActivity.actionBar.setTitle(LocaleController.getString(z6 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = channelCreateActivity.fragmentView;
            int i10 = Theme.key_windowBackgroundGray;
            view.setTag(Integer.valueOf(i10));
            channelCreateActivity.fragmentView.setBackgroundColor(Theme.getColor(null, i10, false));
            HeaderCell headerCell = new HeaderCell(context, 23);
            channelCreateActivity.headerCell2 = headerCell;
            headerCell.setHeight(46);
            HeaderCell headerCell2 = channelCreateActivity.headerCell2;
            int i11 = Theme.key_windowBackgroundWhite;
            headerCell2.setBackgroundColor(Theme.getColor(null, i11, false));
            channelCreateActivity.headerCell2.setText(LocaleController.getString(channelCreateActivity.isGroup ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.headerCell2);
            LinearLayout linearLayout3 = new LinearLayout(context);
            channelCreateActivity.linearLayout2 = linearLayout3;
            linearLayout3.setOrientation(1);
            channelCreateActivity.linearLayout2.setBackgroundColor(Theme.getColor(null, i11, false));
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
            channelCreateActivity.radioButtonCell1.setOnClickListener(new ChannelCreateActivity$$ExternalSyntheticLambda5(channelCreateActivity, i2));
            if (bool == null || bool.booleanValue()) {
                channelCreateActivity.linearLayout2.addView(channelCreateActivity.radioButtonCell1, LayoutHelper.createLinear(-1, -2));
            }
            RadioButtonCell radioButtonCell2 = new RadioButtonCell(context, false);
            channelCreateActivity.radioButtonCell2 = radioButtonCell2;
            radioButtonCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            if (bool != null && bool.booleanValue()) {
                channelCreateActivity.isPrivate = false;
            }
            if (channelCreateActivity.isGroup) {
                channelCreateActivity.radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, channelCreateActivity.isPrivate);
            } else {
                channelCreateActivity.radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, channelCreateActivity.isPrivate);
            }
            channelCreateActivity.radioButtonCell2.setOnClickListener(new ChannelCreateActivity$$ExternalSyntheticLambda5(channelCreateActivity, 3));
            if (bool == null || !bool.booleanValue()) {
                channelCreateActivity.linearLayout2.addView(channelCreateActivity.radioButtonCell2, LayoutHelper.createLinear(-1, -2));
            }
            ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, (Object) null);
            channelCreateActivity.sectionCell = shadowSectionCell;
            channelCreateActivity.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            channelCreateActivity.linkContainer = linearLayout4;
            linearLayout4.setOrientation(1);
            channelCreateActivity.linkContainer.setBackgroundColor(Theme.getColor(null, i11, false));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.linkContainer, LayoutHelper.createLinear(-1, -2));
            HeaderCell headerCell3 = new HeaderCell(context);
            channelCreateActivity.headerCell = headerCell3;
            channelCreateActivity.linkContainer.addView(headerCell3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            channelCreateActivity.publicContainer = linearLayout5;
            linearLayout5.setOrientation(0);
            channelCreateActivity.linkContainer.addView(channelCreateActivity.publicContainer, LayoutHelper.createLinear(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            channelCreateActivity.editText = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(channelCreateActivity.currentAccount).linkPrefix + "/");
            channelCreateActivity.editText.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = channelCreateActivity.editText;
            int i12 = Theme.key_windowBackgroundWhiteHintText;
            editTextBoldCursor4.setHintTextColor(Theme.getColor(null, i12, false));
            EditTextBoldCursor editTextBoldCursor5 = channelCreateActivity.editText;
            int i13 = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor5.setTextColor(Theme.getColor(null, i13, false));
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
            channelCreateActivity.descriptionTextView.setHintTextColor(Theme.getColor(null, i12, false));
            channelCreateActivity.descriptionTextView.setTextColor(Theme.getColor(null, i13, false));
            channelCreateActivity.descriptionTextView.setMaxLines(1);
            channelCreateActivity.descriptionTextView.setLines(1);
            channelCreateActivity.descriptionTextView.setBackgroundDrawable(null);
            channelCreateActivity.descriptionTextView.setPadding(0, 0, 0, 0);
            channelCreateActivity.descriptionTextView.setSingleLine(true);
            channelCreateActivity.descriptionTextView.setInputType(163872);
            channelCreateActivity.descriptionTextView.setImeOptions(6);
            channelCreateActivity.descriptionTextView.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            channelCreateActivity.descriptionTextView.setCursorColor(Theme.getColor(null, i13, false));
            channelCreateActivity.descriptionTextView.setCursorSize(AndroidUtilities.dp(20.0f));
            channelCreateActivity.descriptionTextView.setCursorWidth(1.5f);
            channelCreateActivity.publicContainer.addView(channelCreateActivity.descriptionTextView, LayoutHelper.createLinear(-1, 36));
            channelCreateActivity.descriptionTextView.addTextChangedListener(new ArticleViewer.AnonymousClass16(channelCreateActivity, 4));
            LinearLayout linearLayout6 = new LinearLayout(context);
            channelCreateActivity.privateContainer = linearLayout6;
            linearLayout6.setOrientation(1);
            channelCreateActivity.linkContainer.addView(channelCreateActivity.privateContainer, LayoutHelper.createLinear(-1, -2));
            LinkActionView linkActionView = new LinkActionView(context, channelCreateActivity, null, true, ChatObject.isChannel(channelCreateActivity.getMessagesController().getChat(Long.valueOf(j))));
            channelCreateActivity.permanentLinkView = linkActionView;
            linkActionView.hideRevokeOption(true);
            channelCreateActivity.permanentLinkView.setUsers(0, null, false);
            channelCreateActivity.privateContainer.addView(channelCreateActivity.permanentLinkView);
            CheckBoxCell.AnonymousClass2 anonymousClass9 = new CheckBoxCell.AnonymousClass2(channelCreateActivity, context, 3);
            channelCreateActivity.checkTextView = anonymousClass9;
            anonymousClass9.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            channelCreateActivity.checkTextView.setHighlightColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkSelection, false));
            channelCreateActivity.checkTextView.setTextSize(1, 15.0f);
            channelCreateActivity.checkTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            channelCreateActivity.checkTextView.setVisibility(8);
            channelCreateActivity.checkTextView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            channelCreateActivity.linkContainer.addView(channelCreateActivity.checkTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
            channelCreateActivity.typeInfoCell = textInfoPrivacyCell;
            int i14 = R.drawable.greydivider_bottom;
            int i15 = Theme.key_windowBackgroundGrayShadow;
            textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i14, i15));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.typeInfoCell, LayoutHelper.createLinear(-1, -2));
            LoadingCell loadingCell = new LoadingCell(context);
            channelCreateActivity.loadingAdminedCell = loadingCell;
            channelCreateActivity.linearLayout.addView(loadingCell, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            channelCreateActivity.adminnedChannelsLayout = linearLayout7;
            linearLayout7.setBackgroundColor(Theme.getColor(null, i11, false));
            channelCreateActivity.adminnedChannelsLayout.setOrientation(1);
            channelCreateActivity.linearLayout.addView(channelCreateActivity.adminnedChannelsLayout, LayoutHelper.createLinear(-1, -2));
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
            channelCreateActivity.adminedInfoCell = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i14, i15));
            channelCreateActivity.linearLayout.addView(channelCreateActivity.adminedInfoCell, LayoutHelper.createLinear(-1, -2));
            channelCreateActivity.updatePrivatePublic();
        }
        return channelCreateActivity.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
            channelCreateActivity.onFinishListener = this.onFinishListener;
            presentFragment(channelCreateActivity, true);
        }
    }

    @Override
    public final void didStartUpload(boolean z, boolean z2) {
        AnonymousClass6 anonymousClass6 = this.avatarProgressView;
        if (anonymousClass6 == null) {
            return;
        }
        anonymousClass6.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
    }

    @Override
    public final void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda76(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override
    public final void dismissCurrentDialog() {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || !imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        ImageUpdater imageUpdater = this.imageUpdater;
        return (imageUpdater == null || dialog != imageUpdater.chatAttachAlert) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.nameTextView.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 5);
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
        CheckBoxCell.AnonymousClass2 anonymousClass2 = this.checkTextView;
        int i9 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(anonymousClass2, 262148, null, null, null, null, i9));
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
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public final void lambda$checkUserName$24(String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new BoostsActivity$$ExternalSyntheticLambda7(this, str, tL_channels_checkUsername, 9), 2);
    }

    public final void lambda$loadAdminedChannels$18(TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new ChannelCreateActivity$$ExternalSyntheticLambda2(this, 2), 64);
    }

    public final void lambda$loadAdminedChannels$19(View view) {
        TLRPC.Chat currentChannel = ((AdminedChannelCell) view.getParent()).getCurrentChannel();
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        if (currentChannel.megagroup) {
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new ArticleViewer$$ExternalSyntheticLambda16(27, this, currentChannel));
        showDialog(alertDialog);
    }

    public final void lambda$showDoneCancelDialog$2(AlertDialog alertDialog) {
        this.donePressed = false;
        this.createAfterUpload = false;
        if (this.doneRequestId != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.doneRequestId.intValue(), true);
            this.doneRequestId = null;
        }
        updateDoneProgress(false);
        alertDialog.dismiss();
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji == null || !editTextEmoji.emojiViewVisible) {
            return true;
        }
        if (!z) {
            return false;
        }
        editTextEmoji.hidePopup(true);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.currentStep == 1 && !this.loadingInvite && this.invite == null) {
            MessagesController messagesController = getMessagesController();
            long j = this.chatId;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j);
            if (chatFull != null) {
                this.invite = chatFull.exported_invite;
            }
            if (this.invite == null) {
                this.loadingInvite = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new ChannelCreateActivity$$ExternalSyntheticLambda2(this, 3));
            }
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.parentFragment = this;
            imageUpdater.delegate = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.doneRequestId != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.doneRequestId.intValue(), true);
            this.doneRequestId = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear$1();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public final void onPause() {
        ChatAttachAlert chatAttachAlert;
        super.onPause();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onPause();
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || (chatAttachAlert = imageUpdater.chatAttachAlert) == null) {
            return;
        }
        chatAttachAlert.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        ChatAttachAlert chatAttachAlert;
        super.onResume();
        EditTextEmoji editTextEmoji = this.nameTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || (chatAttachAlert = imageUpdater.chatAttachAlert) == null) {
            return;
        }
        chatAttachAlert.onResume();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.currentStep == 1) {
            return;
        }
        this.nameTextView.requestFocus();
        EditTextEmoji editTextEmoji = this.nameTextView;
        editTextEmoji.editText.requestFocus();
        AndroidUtilities.showKeyboard(editTextEmoji.editText);
    }

    @Override
    public final void onUploadProgressChanged(float f) {
        AnonymousClass6 anonymousClass6 = this.avatarProgressView;
        if (anonymousClass6 == null) {
            return;
        }
        anonymousClass6.setProgress(f);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
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
    public final void saveSelfArgs(Bundle bundle) {
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

    public final void showAvatarProgress(boolean z, boolean z2) {
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
            AnonymousClass5 anonymousClass5 = this.avatarEditor;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<AnonymousClass6, Float>) property, 1.0f));
        } else {
            if (this.avatarEditor.getVisibility() != 0) {
                this.avatarEditor.setAlpha(0.0f);
            }
            this.avatarEditor.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            AnonymousClass5 anonymousClass6 = this.avatarEditor;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<AnonymousClass6, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new ChatActivity.AnonymousClass77(11, this, z));
        this.avatarAnimation.start();
    }

    public final void showDoneCancelDialog() {
        if (this.cancelDialog != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.StopLoadingTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.StopLoading);
        builder.setPositiveButton(LocaleController.getString(R.string.WaitMore), null);
        builder.setNegativeButton(LocaleController.getString(R.string.Stop), new ChatActivity$$ExternalSyntheticLambda356(this, 9));
        this.cancelDialog = builder.show();
    }

    public final void showPremiumIncreaseLimitDialog() {
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(2, this.currentAccount, getParentActivity(), this, null);
        limitReachedBottomSheet.parentIsChannel = true;
        limitReachedBottomSheet.onSuccessRunnable = new ChannelCreateActivity$$ExternalSyntheticLambda1(this, 1);
        showDialog(limitReachedBottomSheet);
    }

    @Override
    public final boolean supportsBulletin() {
        return false;
    }

    public final void updateDoneProgress(boolean z) {
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.enableDoneLoading);
        }
        if (this.doneButtonDrawable != null) {
            ValueAnimator valueAnimator = this.doneButtonDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.doneButtonDrawable.progress, z ? 1.0f : 0.0f);
            this.doneButtonDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 14));
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.progress - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    public final void updatePrivatePublic() {
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
            CheckBoxCell.AnonymousClass2 anonymousClass2 = this.checkTextView;
            if (!this.isPrivate && anonymousClass2.length() != 0) {
                i = 0;
            }
            anonymousClass2.setVisibility(i);
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

    public final class AnonymousClass5 extends RLottieImageView {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass5(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    super.invalidate(i, i2, i3, i4);
                    ((ChannelCreateActivity) this.this$0).avatarOverlay.invalidate();
                    break;
                case 1:
                default:
                    super.invalidate(i, i2, i3, i4);
                    break;
                case 2:
                    super.invalidate(i, i2, i3, i4);
                    ((GroupCreateFinalActivity) this.this$0).avatarOverlay.invalidate();
                    break;
                case 3:
                    super.invalidate(i, i2, i3, i4);
                    ((LoginActivity.LoginActivityRegisterView) this.this$0).avatarOverlay.invalidate();
                    break;
            }
        }

        @Override
        public final void invalidate() {
            switch (this.$r8$classId) {
                case 0:
                    super.invalidate();
                    ((ChannelCreateActivity) this.this$0).avatarOverlay.invalidate();
                    break;
                case 1:
                    super.invalidate();
                    ((GroupCallFullscreenAdapter.GroupCallUserCell) this.this$0).invalidate();
                    break;
                case 2:
                    super.invalidate();
                    ((GroupCreateFinalActivity) this.this$0).avatarOverlay.invalidate();
                    break;
                default:
                    super.invalidate();
                    ((LoginActivity.LoginActivityRegisterView) this.this$0).avatarOverlay.invalidate();
                    break;
            }
        }
    }
}
