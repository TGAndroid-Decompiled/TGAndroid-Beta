package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;

public class GroupCallUserCell extends FrameLayout {
    private AccountInstance accountInstance;
    private AnimatorSet animatorSet;
    private BackupImageView avatarImageView;
    private RadialProgressView avatarProgressView;
    private AvatarWavesDrawable avatarWavesDrawable;
    private ChatObject.Call currentCall;
    private TLRPC$Chat currentChat;
    private boolean currentIconGray;
    private int currentStatus;
    private TLRPC$User currentUser;
    private Paint dividerPaint;
    private SimpleTextView fullAboutTextView;
    private boolean hasAvatar;
    private boolean isSpeaking;
    private int lastMuteColor;
    private boolean lastMuted;
    private boolean lastRaisedHand;
    private RLottieImageView muteButton;
    private RLottieDrawable muteDrawable;
    private SimpleTextView nameTextView;
    private boolean needDivider;
    private TLRPC$TL_groupCallParticipant participant;
    private float progressToAvatarPreview;
    private long selfId;
    private RLottieDrawable shakeHandDrawable;
    private Drawable speakingDrawable;
    private boolean updateRunnableScheduled;
    private boolean updateVoiceRunnableScheduled;
    private SimpleTextView[] statusTextView = new SimpleTextView[5];
    private Runnable shakeHandCallback = new Runnable() {
        @Override
        public final void run() {
            GroupCallUserCell.this.lambda$new$0();
        }
    };
    private Runnable raiseHandCallback = new Runnable() {
        @Override
        public final void run() {
            GroupCallUserCell.this.lambda$new$1();
        }
    };
    private String grayIconColor = "voipgroup_mutedIcon";
    private Runnable checkRaiseRunnable = new Runnable() {
        @Override
        public final void run() {
            GroupCallUserCell.this.lambda$new$2();
        }
    };
    private Runnable updateRunnable = new Runnable() {
        @Override
        public final void run() {
            GroupCallUserCell.this.lambda$new$3();
        }
    };
    private Runnable updateVoiceRunnable = new Runnable() {
        @Override
        public final void run() {
            GroupCallUserCell.this.lambda$new$4();
        }
    };
    private AvatarDrawable avatarDrawable = new AvatarDrawable();

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void lambda$new$5(GroupCallUserCell groupCallUserCell) {
    }

    public void lambda$new$0() {
        this.shakeHandDrawable.setOnFinishCallback(null, 0);
        this.muteDrawable.setOnFinishCallback(null, 0);
        this.muteButton.setAnimation(this.muteDrawable);
    }

    public void lambda$new$1() {
        int nextInt = Utilities.random.nextInt(100);
        int i = 540;
        int i2 = 420;
        if (nextInt < 32) {
            i = 120;
            i2 = 0;
        } else if (nextInt < 64) {
            i = 240;
            i2 = 120;
        } else if (nextInt < 97) {
            i = 420;
            i2 = 240;
        } else if (nextInt != 98) {
            i = 720;
            i2 = 540;
        }
        this.shakeHandDrawable.setCustomEndFrame(i);
        this.shakeHandDrawable.setOnFinishCallback(this.shakeHandCallback, i - 1);
        this.muteButton.setAnimation(this.shakeHandDrawable);
        this.shakeHandDrawable.setCurrentFrame(i2);
        this.muteButton.playAnimation();
    }

    public void lambda$new$2() {
        applyParticipantChanges(true, true);
    }

    public void lambda$new$3() {
        this.isSpeaking = false;
        applyParticipantChanges(true, true);
        this.avatarWavesDrawable.setAmplitude(0.0d);
        this.updateRunnableScheduled = false;
    }

    public void lambda$new$4() {
        applyParticipantChanges(true, true);
        this.updateVoiceRunnableScheduled = false;
    }

    public void setProgressToAvatarPreview(float f) {
        this.progressToAvatarPreview = f;
        this.nameTextView.setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f);
        boolean z = true;
        if (!isSelfUser() || f <= 0.0f) {
            this.fullAboutTextView.setVisibility(8);
            int i = 0;
            while (true) {
                SimpleTextView[] simpleTextViewArr = this.statusTextView;
                if (i >= simpleTextViewArr.length) {
                    break;
                }
                if (TextUtils.isEmpty(simpleTextViewArr[4].getText()) || this.statusTextView[4].getLineCount() <= 1) {
                    this.statusTextView[i].setTranslationX((LocaleController.isRTL ? AndroidUtilities.dp(53.0f) : -AndroidUtilities.dp(53.0f)) * f);
                    this.statusTextView[i].setFullLayoutAdditionalWidth(0, 0);
                } else {
                    this.statusTextView[i].setFullLayoutAdditionalWidth(AndroidUtilities.dp(92.0f), LocaleController.isRTL ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(53.0f));
                    this.statusTextView[i].setFullAlpha(f);
                    this.statusTextView[i].setTranslationX(0.0f);
                    this.statusTextView[i].invalidate();
                }
                i++;
            }
        } else {
            float f2 = 1.0f - f;
            this.fullAboutTextView.setTranslationX((LocaleController.isRTL ? -AndroidUtilities.dp(53.0f) : AndroidUtilities.dp(53.0f)) * f2);
            this.fullAboutTextView.setVisibility(0);
            this.fullAboutTextView.setAlpha(f);
            this.statusTextView[4].setAlpha(f2);
            SimpleTextView simpleTextView = this.statusTextView[4];
            boolean z2 = LocaleController.isRTL;
            int dp = AndroidUtilities.dp(53.0f);
            if (!z2) {
                dp = -dp;
            }
            simpleTextView.setTranslationX(dp * f);
        }
        this.avatarImageView.setAlpha(f == 0.0f ? 1.0f : 0.0f);
        AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
        if (!this.isSpeaking || f != 0.0f) {
            z = false;
        }
        avatarWavesDrawable.setShowWaves(z, this);
        float f3 = 1.0f - f;
        this.muteButton.setAlpha(f3);
        float f4 = (f3 * 0.4f) + 0.6f;
        this.muteButton.setScaleX(f4);
        this.muteButton.setScaleY(f4);
        invalidate();
    }

    public AvatarWavesDrawable getAvatarWavesDrawable() {
        return this.avatarWavesDrawable;
    }

    public void setUploadProgress(float f, boolean z) {
        this.avatarProgressView.setProgress(f);
        if (f < 1.0f) {
            AndroidUtilities.updateViewVisibilityAnimated(this.avatarProgressView, true, 1.0f, z);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.avatarProgressView, false, 1.0f, z);
        }
    }

    public void setDrawAvatar(boolean z) {
        if (this.avatarImageView.getImageReceiver().getVisible() != z) {
            this.avatarImageView.getImageReceiver().setVisible(z, true);
        }
    }

    private static class VerifiedDrawable extends Drawable {
        private Drawable[] drawables;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public VerifiedDrawable(Context context) {
            Drawable[] drawableArr = new Drawable[2];
            this.drawables = drawableArr;
            drawableArr[0] = context.getResources().getDrawable(R.drawable.verified_area).mutate();
            this.drawables[0].setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
            this.drawables[1] = context.getResources().getDrawable(R.drawable.verified_check).mutate();
        }

        @Override
        public int getIntrinsicWidth() {
            return this.drawables[0].getIntrinsicWidth();
        }

        @Override
        public int getIntrinsicHeight() {
            return this.drawables[0].getIntrinsicHeight();
        }

        @Override
        public void draw(Canvas canvas) {
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.drawables;
                if (i < drawableArr.length) {
                    drawableArr[i].setBounds(getBounds());
                    this.drawables[i].draw(canvas);
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override
        public void setAlpha(int i) {
            int i2 = 0;
            while (true) {
                Drawable[] drawableArr = this.drawables;
                if (i2 < drawableArr.length) {
                    drawableArr[i2].setAlpha(i);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public GroupCallUserCell(Context context) {
        super(context);
        int i = 5;
        Paint paint = new Paint();
        this.dividerPaint = paint;
        paint.setColor(Theme.getColor("voipgroup_actionBar"));
        setClipChildren(false);
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        BackupImageView backupImageView2 = this.avatarImageView;
        boolean z = LocaleController.isRTL;
        float f = 11.0f;
        addView(backupImageView2, LayoutHelper.createFrame(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context) {
            private Paint paint;

            {
                Paint paint2 = new Paint(1);
                this.paint = paint2;
                paint2.setColor(1426063360);
            }

            @Override
            public void onDraw(Canvas canvas) {
                if (GroupCallUserCell.this.avatarImageView.getImageReceiver().hasNotThumb() && GroupCallUserCell.this.avatarImageView.getAlpha() > 0.0f) {
                    this.paint.setAlpha((int) (GroupCallUserCell.this.avatarImageView.getImageReceiver().getCurrentAlpha() * 85.0f * GroupCallUserCell.this.avatarImageView.getAlpha()));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, this.paint);
                }
                GroupCallUserCell.this.avatarProgressView.setProgressColor(ColorUtils.setAlphaComponent(-1, (int) (GroupCallUserCell.this.avatarImageView.getImageReceiver().getCurrentAlpha() * 255.0f * GroupCallUserCell.this.avatarImageView.getAlpha())));
                super.onDraw(canvas);
            }
        };
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(26.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        RadialProgressView radialProgressView2 = this.avatarProgressView;
        boolean z2 = LocaleController.isRTL;
        addView(radialProgressView2, LayoutHelper.createFrame(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 11.0f, 6.0f, !z2 ? 0.0f : f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.avatarProgressView, false, 1.0f, false);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor("voipgroup_nameText"));
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.nameTextView.setTextSize(16);
        this.nameTextView.setDrawablePadding(AndroidUtilities.dp(6.0f));
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView2 = this.nameTextView;
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 10.0f, z3 ? 67.0f : 54.0f, 0.0f));
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.speakingDrawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("voipgroup_speakingText"), PorterDuff.Mode.MULTIPLY));
        final int i2 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.statusTextView;
            if (i2 >= simpleTextViewArr.length) {
                break;
            }
            simpleTextViewArr[i2] = new SimpleTextView(context) {
                float originalAlpha;

                @Override
                public void setAlpha(float f2) {
                    this.originalAlpha = f2;
                    if (i2 == 4) {
                        float fullAlpha = GroupCallUserCell.this.statusTextView[4].getFullAlpha();
                        if (GroupCallUserCell.this.isSelfUser() && GroupCallUserCell.this.progressToAvatarPreview > 0.0f) {
                            super.setAlpha(1.0f - GroupCallUserCell.this.progressToAvatarPreview);
                        } else if (fullAlpha > 0.0f) {
                            super.setAlpha(Math.max(f2, fullAlpha));
                        } else {
                            super.setAlpha(f2);
                        }
                    } else {
                        super.setAlpha(f2 * (1.0f - GroupCallUserCell.this.statusTextView[4].getFullAlpha()));
                    }
                }

                @Override
                public void setTranslationY(float f2) {
                    if (i2 == 4 && getFullAlpha() > 0.0f) {
                        f2 = 0.0f;
                    }
                    super.setTranslationY(f2);
                }

                @Override
                public float getAlpha() {
                    return this.originalAlpha;
                }

                @Override
                public void setFullAlpha(float f2) {
                    super.setFullAlpha(f2);
                    for (int i3 = 0; i3 < GroupCallUserCell.this.statusTextView.length; i3++) {
                        GroupCallUserCell.this.statusTextView[i3].setAlpha(GroupCallUserCell.this.statusTextView[i3].getAlpha());
                    }
                }
            };
            this.statusTextView[i2].setTextSize(15);
            this.statusTextView[i2].setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (i2 == 4) {
                this.statusTextView[i2].setBuildFullLayout(true);
                this.statusTextView[i2].setTextColor(Theme.getColor("voipgroup_mutedIcon"));
                SimpleTextView simpleTextView3 = this.statusTextView[i2];
                boolean z4 = LocaleController.isRTL;
                addView(simpleTextView3, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 54.0f : 67.0f, 32.0f, z4 ? 67.0f : 54.0f, 0.0f));
            } else {
                if (i2 == 0) {
                    this.statusTextView[i2].setTextColor(Theme.getColor("voipgroup_listeningText"));
                    this.statusTextView[i2].setText(LocaleController.getString("Listening", R.string.Listening));
                } else if (i2 == 1) {
                    this.statusTextView[i2].setTextColor(Theme.getColor("voipgroup_speakingText"));
                    this.statusTextView[i2].setText(LocaleController.getString("Speaking", R.string.Speaking));
                    this.statusTextView[i2].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i2 == 2) {
                    this.statusTextView[i2].setTextColor(Theme.getColor("voipgroup_mutedByAdminIcon"));
                    this.statusTextView[i2].setText(LocaleController.getString("VoipGroupMutedForMe", R.string.VoipGroupMutedForMe));
                } else if (i2 == 3) {
                    this.statusTextView[i2].setTextColor(Theme.getColor("voipgroup_listeningText"));
                    this.statusTextView[i2].setText(LocaleController.getString("WantsToSpeak", R.string.WantsToSpeak));
                }
                SimpleTextView simpleTextView4 = this.statusTextView[i2];
                boolean z5 = LocaleController.isRTL;
                addView(simpleTextView4, LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, z5 ? 54.0f : 67.0f, 32.0f, z5 ? 67.0f : 54.0f, 0.0f));
            }
            i2++;
        }
        SimpleTextView simpleTextView5 = new SimpleTextView(context);
        this.fullAboutTextView = simpleTextView5;
        simpleTextView5.setMaxLines(3);
        this.fullAboutTextView.setTextSize(15);
        this.fullAboutTextView.setTextColor(Theme.getColor("voipgroup_mutedIcon"));
        this.fullAboutTextView.setVisibility(8);
        addView(this.fullAboutTextView, LayoutHelper.createFrame(-1, 60.0f, (LocaleController.isRTL ? 5 : 3) | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        this.muteDrawable = new RLottieDrawable(R.raw.voice_outlined2, "2131558576", AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.shakeHandDrawable = new RLottieDrawable(R.raw.hand_1, "2131558458", AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteButton = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.muteButton.setAnimation(this.muteDrawable);
        if (Build.VERSION.SDK_INT >= 21) {
            RippleDrawable rippleDrawable = (RippleDrawable) Theme.createSelectorDrawable(Theme.getColor(this.grayIconColor) & 620756991);
            Theme.setRippleDrawableForceSoftware(rippleDrawable);
            this.muteButton.setBackground(rippleDrawable);
        }
        this.muteButton.setImportantForAccessibility(2);
        addView(this.muteButton, LayoutHelper.createFrame(48, -1.0f, (LocaleController.isRTL ? 3 : i) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallUserCell.this.lambda$new$5(view);
            }
        });
        this.avatarWavesDrawable = new AvatarWavesDrawable(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public int getClipHeight() {
        SimpleTextView simpleTextView;
        if (TextUtils.isEmpty(this.fullAboutTextView.getText()) || !this.hasAvatar) {
            simpleTextView = this.statusTextView[4];
        } else {
            simpleTextView = this.fullAboutTextView;
        }
        if (simpleTextView.getLineCount() <= 1) {
            return getMeasuredHeight();
        }
        return simpleTextView.getTop() + simpleTextView.getTextHeight() + AndroidUtilities.dp(8.0f);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.updateRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            this.updateRunnableScheduled = false;
        }
        if (this.updateVoiceRunnableScheduled) {
            AndroidUtilities.cancelRunOnUIThread(this.updateVoiceRunnable);
            this.updateVoiceRunnableScheduled = false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public boolean isSelfUser() {
        long j = this.selfId;
        if (j > 0) {
            TLRPC$User tLRPC$User = this.currentUser;
            return tLRPC$User != null && tLRPC$User.id == j;
        }
        TLRPC$Chat tLRPC$Chat = this.currentChat;
        return tLRPC$Chat != null && tLRPC$Chat.id == (-j);
    }

    public boolean isHandRaised() {
        return this.lastRaisedHand;
    }

    public CharSequence getName() {
        return this.nameTextView.getText();
    }

    public boolean hasAvatarSet() {
        return this.avatarImageView.getImageReceiver().hasNotThumb();
    }

    public void setData(AccountInstance accountInstance, TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant, ChatObject.Call call, long j, TLRPC$FileLocation tLRPC$FileLocation, boolean z) {
        this.currentCall = call;
        this.accountInstance = accountInstance;
        this.selfId = j;
        this.participant = tLRPC$TL_groupCallParticipant;
        long peerId = MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer);
        boolean z2 = false;
        if (peerId > 0) {
            TLRPC$User user = this.accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            this.currentUser = user;
            this.currentChat = null;
            this.avatarDrawable.setInfo(user);
            this.nameTextView.setText(UserObject.getUserName(this.currentUser));
            SimpleTextView simpleTextView = this.nameTextView;
            TLRPC$User tLRPC$User = this.currentUser;
            simpleTextView.setRightDrawable((tLRPC$User == null || !tLRPC$User.verified) ? null : new VerifiedDrawable(getContext()));
            this.avatarImageView.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (tLRPC$FileLocation != null) {
                this.hasAvatar = true;
                this.avatarImageView.setImage(ImageLocation.getForLocal(tLRPC$FileLocation), "50_50", this.avatarDrawable, (Object) null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(this.currentUser, 1);
                if (forUser != null) {
                    z2 = true;
                }
                this.hasAvatar = z2;
                this.avatarImageView.setImage(forUser, "50_50", this.avatarDrawable, this.currentUser);
            }
        } else {
            TLRPC$Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            this.currentChat = chat;
            this.currentUser = null;
            this.avatarDrawable.setInfo(chat);
            TLRPC$Chat tLRPC$Chat = this.currentChat;
            if (tLRPC$Chat != null) {
                this.nameTextView.setText(tLRPC$Chat.title);
                this.nameTextView.setRightDrawable(this.currentChat.verified ? new VerifiedDrawable(getContext()) : null);
                this.avatarImageView.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (tLRPC$FileLocation != null) {
                    this.hasAvatar = true;
                    this.avatarImageView.setImage(ImageLocation.getForLocal(tLRPC$FileLocation), "50_50", this.avatarDrawable, (Object) null);
                } else {
                    ImageLocation forChat = ImageLocation.getForChat(this.currentChat, 1);
                    if (forChat != null) {
                        z2 = true;
                    }
                    this.hasAvatar = z2;
                    this.avatarImageView.setImage(forChat, "50_50", this.avatarDrawable, this.currentChat);
                }
            }
        }
        applyParticipantChanges(z);
    }

    public void setDrawDivider(boolean z) {
        this.needDivider = z;
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyParticipantChanges(false);
    }

    public TLRPC$TL_groupCallParticipant getParticipant() {
        return this.participant;
    }

    public void setAmplitude(double d) {
        if (d > 1.5d) {
            if (this.updateRunnableScheduled) {
                AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            }
            if (!this.isSpeaking) {
                this.isSpeaking = true;
                applyParticipantChanges(true);
            }
            this.avatarWavesDrawable.setAmplitude(d);
            AndroidUtilities.runOnUIThread(this.updateRunnable, 500L);
            this.updateRunnableScheduled = true;
            return;
        }
        this.avatarWavesDrawable.setAmplitude(0.0d);
    }

    public boolean clickMuteButton() {
        if (!this.muteButton.isEnabled()) {
            return false;
        }
        this.muteButton.callOnClick();
        return true;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void applyParticipantChanges(boolean z) {
        applyParticipantChanges(z, false);
    }

    public void setGrayIconColor(String str, int i) {
        if (!this.grayIconColor.equals(str)) {
            if (this.currentIconGray) {
                this.lastMuteColor = Theme.getColor(str);
            }
            this.grayIconColor = str;
        }
        if (this.currentIconGray) {
            this.muteButton.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            Theme.setSelectorDrawableColor(this.muteButton.getDrawable(), i & 620756991, true);
        }
    }

    public void setAboutVisibleProgress(int i, float f) {
        if (TextUtils.isEmpty(this.statusTextView[4].getText())) {
            f = 0.0f;
        }
        this.statusTextView[4].setFullAlpha(f);
        this.statusTextView[4].setFullLayoutAdditionalWidth(0, 0);
        invalidate();
    }

    public void setAboutVisible(boolean z) {
        if (z) {
            this.statusTextView[4].setTranslationY(0.0f);
        } else {
            this.statusTextView[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    private void applyParticipantChanges(boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.GroupCallUserCell.applyParticipantChanges(boolean, boolean):void");
    }

    public void lambda$applyParticipantChanges$6(int i, int i2, ValueAnimator valueAnimator) {
        int offsetColor = AndroidUtilities.getOffsetColor(i, i2, valueAnimator.getAnimatedFraction(), 1.0f);
        this.muteButton.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
        Theme.setSelectorDrawableColor(this.muteButton.getDrawable(), offsetColor & 620756991, true);
    }

    public void applyStatus(int i) {
        float f;
        int i2 = 0;
        if (i == 0) {
            while (true) {
                SimpleTextView[] simpleTextViewArr = this.statusTextView;
                if (i2 < simpleTextViewArr.length) {
                    simpleTextViewArr[i2].setTranslationY(i2 == i ? 0.0f : AndroidUtilities.dp(-2.0f));
                    this.statusTextView[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                SimpleTextView[] simpleTextViewArr2 = this.statusTextView;
                if (i2 < simpleTextViewArr2.length) {
                    SimpleTextView simpleTextView = simpleTextViewArr2[i2];
                    if (i2 == i) {
                        f = 0.0f;
                    } else {
                        f = AndroidUtilities.dp(i2 == 0 ? 2.0f : -2.0f);
                    }
                    simpleTextView.setTranslationY(f);
                    this.statusTextView[i2].setAlpha(i2 == i ? 1.0f : 0.0f);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.needDivider) {
            float f = this.progressToAvatarPreview;
            if (f != 0.0f) {
                this.dividerPaint.setAlpha((int) ((1.0f - f) * 255.0f));
            } else {
                this.dividerPaint.setAlpha((int) ((1.0f - this.statusTextView[4].getFullAlpha()) * 255.0f));
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.dividerPaint);
        }
        int left = this.avatarImageView.getLeft() + (this.avatarImageView.getMeasuredWidth() / 2);
        int top = this.avatarImageView.getTop() + (this.avatarImageView.getMeasuredHeight() / 2);
        this.avatarWavesDrawable.update();
        if (this.progressToAvatarPreview == 0.0f) {
            this.avatarWavesDrawable.draw(canvas, left, top, this);
        }
        this.avatarImageView.setScaleX(this.avatarWavesDrawable.getAvatarScale());
        this.avatarImageView.setScaleY(this.avatarWavesDrawable.getAvatarScale());
        this.avatarProgressView.setScaleX(this.avatarWavesDrawable.getAvatarScale());
        this.avatarProgressView.setScaleY(this.avatarWavesDrawable.getAvatarScale());
        super.dispatchDraw(canvas);
    }

    public static class AvatarWavesDrawable {
        float amplitude;
        float animateAmplitudeDiff;
        float animateToAmplitude;
        private BlobDrawable blobDrawable2;
        private boolean hasCustomColor;
        private int isMuted;
        boolean showWaves;
        float wavesEnter = 0.0f;
        private float progressToMuted = 0.0f;
        boolean invalidateColor = true;
        private BlobDrawable blobDrawable = new BlobDrawable(6);

        public AvatarWavesDrawable(int i, int i2) {
            BlobDrawable blobDrawable = new BlobDrawable(8);
            this.blobDrawable2 = blobDrawable;
            BlobDrawable blobDrawable2 = this.blobDrawable;
            float f = i;
            blobDrawable2.minRadius = f;
            float f2 = i2;
            blobDrawable2.maxRadius = f2;
            blobDrawable.minRadius = f;
            blobDrawable.maxRadius = f2;
            blobDrawable2.generateBlob();
            this.blobDrawable2.generateBlob();
            this.blobDrawable.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor("voipgroup_speakingText"), 38));
            this.blobDrawable2.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor("voipgroup_speakingText"), 38));
        }

        public void update() {
            float f = this.animateToAmplitude;
            float f2 = this.amplitude;
            if (f != f2) {
                float f3 = this.animateAmplitudeDiff;
                float f4 = f2 + (16.0f * f3);
                this.amplitude = f4;
                if (f3 > 0.0f) {
                    if (f4 > f) {
                        this.amplitude = f;
                    }
                } else if (f4 < f) {
                    this.amplitude = f;
                }
            }
            boolean z = this.showWaves;
            if (z) {
                float f5 = this.wavesEnter;
                if (f5 != 1.0f) {
                    float f6 = f5 + 0.045714285f;
                    this.wavesEnter = f6;
                    if (f6 > 1.0f) {
                        this.wavesEnter = 1.0f;
                        return;
                    }
                    return;
                }
            }
            if (!z) {
                float f7 = this.wavesEnter;
                if (f7 != 0.0f) {
                    float f8 = f7 - 0.045714285f;
                    this.wavesEnter = f8;
                    if (f8 < 0.0f) {
                        this.wavesEnter = 0.0f;
                    }
                }
            }
        }

        public void draw(android.graphics.Canvas r8, float r9, float r10, android.view.View r11) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.GroupCallUserCell.AvatarWavesDrawable.draw(android.graphics.Canvas, float, float, android.view.View):void");
        }

        public float getAvatarScale() {
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.wavesEnter);
            return (((this.amplitude * 0.2f) + 0.9f) * interpolation) + ((1.0f - interpolation) * 1.0f);
        }

        public void setShowWaves(boolean z, View view) {
            if (this.showWaves != z) {
                view.invalidate();
            }
            this.showWaves = z;
        }

        public void setAmplitude(double d) {
            float f = ((float) d) / 80.0f;
            float f2 = 0.0f;
            if (!this.showWaves) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f2 = 1.0f;
            } else if (f >= 0.0f) {
                f2 = f;
            }
            this.animateToAmplitude = f2;
            this.animateAmplitudeDiff = (f2 - this.amplitude) / 200.0f;
        }

        public void setColor(int i) {
            this.hasCustomColor = true;
            this.blobDrawable.paint.setColor(i);
        }

        public void setMuted(int i, boolean z) {
            this.isMuted = i;
            if (!z) {
                this.progressToMuted = i != 1 ? 1.0f : 0.0f;
            }
            this.invalidateColor = true;
        }
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled() && Build.VERSION.SDK_INT >= 21) {
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.participant;
            if (!tLRPC$TL_groupCallParticipant.muted || tLRPC$TL_groupCallParticipant.can_self_unmute) {
                i = R.string.VoipMute;
                str = "VoipMute";
            } else {
                i = R.string.VoipUnmute;
                str = "VoipUnmute";
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(str, i)));
        }
    }

    public long getPeerId() {
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.participant;
        if (tLRPC$TL_groupCallParticipant == null) {
            return 0L;
        }
        return MessageObject.getPeerId(tLRPC$TL_groupCallParticipant.peer);
    }
}
