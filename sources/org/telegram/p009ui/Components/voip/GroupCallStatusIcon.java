package org.telegram.p009ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;

public class GroupCallStatusIcon {
    Callback callback;
    RLottieImageView iconView;
    boolean isSpeaking;
    boolean lastRaisedHand;
    private boolean mutedByMe;
    TLRPC$TL_groupCallParticipant participant;
    boolean updateRunnableScheduled;
    private Runnable shakeHandCallback = new Runnable() {
        @Override
        public final void run() {
            GroupCallStatusIcon.this.lambda$new$0();
        }
    };
    private Runnable raiseHandCallback = new Runnable() {
        @Override
        public final void run() {
            GroupCallStatusIcon.this.lambda$new$1();
        }
    };
    private Runnable updateRunnable = new Runnable() {
        @Override
        public final void run() {
            GroupCallStatusIcon.this.lambda$new$2();
        }
    };
    private Runnable checkRaiseRunnable = new Runnable() {
        @Override
        public final void run() {
            GroupCallStatusIcon.this.lambda$new$3();
        }
    };
    RLottieDrawable micDrawable = new RLottieDrawable(C0890R.raw.voice_mini, "2131558556", AndroidUtilities.m34dp(24.0f), AndroidUtilities.m34dp(24.0f), true, null);
    RLottieDrawable shakeHandDrawable = new RLottieDrawable(C0890R.raw.hand_2, "2131558456", AndroidUtilities.m34dp(15.0f), AndroidUtilities.m34dp(15.0f), true, null);

    public interface Callback {
        void onStatusChanged();
    }

    public void lambda$new$0() {
        this.shakeHandDrawable.setOnFinishCallback(null, 0);
        this.micDrawable.setOnFinishCallback(null, 0);
        RLottieImageView rLottieImageView = this.iconView;
        if (rLottieImageView != null) {
            rLottieImageView.setAnimation(this.micDrawable);
        }
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
        this.shakeHandDrawable.setCurrentFrame(i2);
        RLottieImageView rLottieImageView = this.iconView;
        if (rLottieImageView != null) {
            rLottieImageView.setAnimation(this.shakeHandDrawable);
            this.iconView.playAnimation();
        }
    }

    public void lambda$new$2() {
        this.isSpeaking = false;
        Callback callback = this.callback;
        if (callback != null) {
            callback.onStatusChanged();
        }
        this.updateRunnableScheduled = false;
    }

    public void setAmplitude(double d) {
        if (d > 1.5d) {
            if (this.updateRunnableScheduled) {
                AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            }
            if (!this.isSpeaking) {
                this.isSpeaking = true;
                Callback callback = this.callback;
                if (callback != null) {
                    callback.onStatusChanged();
                }
            }
            AndroidUtilities.runOnUIThread(this.updateRunnable, 500L);
            this.updateRunnableScheduled = true;
        }
    }

    public void lambda$new$3() {
        updateIcon(true);
    }

    public void setImageView(RLottieImageView rLottieImageView) {
        this.iconView = rLottieImageView;
        updateIcon(false);
    }

    public void setParticipant(TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant, boolean z) {
        this.participant = tLRPC$TL_groupCallParticipant;
        updateIcon(z);
    }

    public void updateIcon(boolean z) {
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.iconView != null && (tLRPC$TL_groupCallParticipant = this.participant) != null && this.micDrawable != null) {
            boolean z5 = tLRPC$TL_groupCallParticipant.muted_by_you && !tLRPC$TL_groupCallParticipant.self;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant2 = this.participant;
            if (elapsedRealtime - tLRPC$TL_groupCallParticipant2.lastVoiceUpdateTime < 500) {
                z2 = tLRPC$TL_groupCallParticipant2.hasVoiceDelayed;
            } else {
                z2 = tLRPC$TL_groupCallParticipant2.hasVoice;
            }
            boolean z6 = !tLRPC$TL_groupCallParticipant2.self ? !((!tLRPC$TL_groupCallParticipant2.muted || (this.isSpeaking && z2)) && !z5) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.isSpeaking && z2));
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant3 = this.participant;
            boolean z7 = ((tLRPC$TL_groupCallParticipant3.muted && !this.isSpeaking) || z5) && (!(z4 = tLRPC$TL_groupCallParticipant3.can_self_unmute) || z5) && !z4 && tLRPC$TL_groupCallParticipant3.raise_hand_rating != 0;
            if (z7) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j = this.participant.lastRaiseHandDate;
                long j2 = elapsedRealtime2 - j;
                if (j != 0 && j2 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.checkRaiseRunnable, 5000 - j2);
                }
                z3 = this.micDrawable.setCustomEndFrame(136);
            } else {
                this.iconView.setAnimation(this.micDrawable);
                this.micDrawable.setOnFinishCallback(null, 0);
                if (!z6 || !this.lastRaisedHand) {
                    z3 = this.micDrawable.setCustomEndFrame(z6 ? 99 : 69);
                } else {
                    z3 = this.micDrawable.setCustomEndFrame(36);
                }
            }
            if (!z) {
                RLottieDrawable rLottieDrawable = this.micDrawable;
                rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
                this.iconView.invalidate();
            } else if (z3) {
                if (z7) {
                    this.micDrawable.setCurrentFrame(99);
                    this.micDrawable.setCustomEndFrame(136);
                } else if (z6 && this.lastRaisedHand && !z7) {
                    this.micDrawable.setCurrentFrame(0);
                    this.micDrawable.setCustomEndFrame(36);
                } else if (z6) {
                    this.micDrawable.setCurrentFrame(69);
                    this.micDrawable.setCustomEndFrame(99);
                } else {
                    this.micDrawable.setCurrentFrame(36);
                    this.micDrawable.setCustomEndFrame(69);
                }
                this.iconView.playAnimation();
                this.iconView.invalidate();
            }
            this.iconView.setAnimation(this.micDrawable);
            this.lastRaisedHand = z7;
            if (this.mutedByMe != z5) {
                this.mutedByMe = z5;
                Callback callback = this.callback;
                if (callback != null) {
                    callback.onStatusChanged();
                }
            }
        }
    }

    public boolean isSpeaking() {
        return this.isSpeaking;
    }

    public boolean isMutedByMe() {
        return this.mutedByMe;
    }

    public boolean isMutedByAdmin() {
        TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = this.participant;
        return tLRPC$TL_groupCallParticipant != null && tLRPC$TL_groupCallParticipant.muted && !tLRPC$TL_groupCallParticipant.can_self_unmute;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
        if (callback == null) {
            this.isSpeaking = false;
            AndroidUtilities.cancelRunOnUIThread(this.updateRunnable);
            AndroidUtilities.cancelRunOnUIThread(this.raiseHandCallback);
            AndroidUtilities.cancelRunOnUIThread(this.checkRaiseRunnable);
            this.micDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
    }
}
