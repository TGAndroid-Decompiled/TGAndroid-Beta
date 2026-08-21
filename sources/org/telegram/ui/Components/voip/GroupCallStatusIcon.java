package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;

public class GroupCallStatusIcon {
    Callback callback;
    RLottieImageView iconView;
    boolean isSpeaking;
    boolean lastMuted;
    boolean lastRaisedHand;
    RLottieDrawable micDrawable;
    private boolean mutedByMe;
    TLRPC.GroupCallParticipant participant;
    RLottieDrawable shakeHandDrawable;
    boolean updateRunnableScheduled;
    private Runnable shakeHandCallback = new Runnable() {
        @Override
        public final void run() {
            GroupCallStatusIcon.m2988$r8$lambda$iUSg5CwNgobxBuUEf7sm5Zp0xU(this.f$0);
        }
    };
    private Runnable raiseHandCallback = new Runnable() {
        @Override
        public final void run() {
            GroupCallStatusIcon.m2986$r8$lambda$Q2X7GT50hFIASvkVcIe9D0_jHs(this.f$0);
        }
    };
    private Runnable updateRunnable = new Runnable() {
        @Override
        public final void run() {
            GroupCallStatusIcon.$r8$lambda$5W5cJ9LLa8sbsY36SfVA9SZh7Jk(this.f$0);
        }
    };
    private Runnable checkRaiseRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.updateIcon(true);
        }
    };

    public interface Callback {
        void onStatusChanged();
    }

    public static void m2988$r8$lambda$iUSg5CwNgobxBuUEf7sm5Zp0xU(GroupCallStatusIcon groupCallStatusIcon) {
        groupCallStatusIcon.shakeHandDrawable.setOnFinishCallback(null, 0);
        groupCallStatusIcon.micDrawable.setOnFinishCallback(null, 0);
        RLottieImageView rLottieImageView = groupCallStatusIcon.iconView;
        if (rLottieImageView != null) {
            rLottieImageView.setAnimation(groupCallStatusIcon.micDrawable);
        }
    }

    public static void m2986$r8$lambda$Q2X7GT50hFIASvkVcIe9D0_jHs(GroupCallStatusIcon groupCallStatusIcon) {
        int i;
        groupCallStatusIcon.getClass();
        int iNextInt = Utilities.random.nextInt(100);
        int i2 = 120;
        if (iNextInt < 32) {
            i = 0;
        } else {
            i = 240;
            if (iNextInt < 64) {
                i2 = 240;
                i = 120;
            } else {
                i2 = 420;
                if (iNextInt >= 97) {
                    i = 540;
                    if (iNextInt == 98) {
                        i2 = 540;
                        i = 420;
                    } else {
                        i2 = 720;
                    }
                }
            }
        }
        groupCallStatusIcon.shakeHandDrawable.setCustomEndFrame(i2);
        groupCallStatusIcon.shakeHandDrawable.setOnFinishCallback(groupCallStatusIcon.shakeHandCallback, i2 - 1);
        groupCallStatusIcon.shakeHandDrawable.setCurrentFrame(i);
        RLottieImageView rLottieImageView = groupCallStatusIcon.iconView;
        if (rLottieImageView != null) {
            rLottieImageView.setAnimation(groupCallStatusIcon.shakeHandDrawable);
            groupCallStatusIcon.iconView.playAnimation();
        }
    }

    public GroupCallStatusIcon() {
        int i = R.raw.voice_mini;
        this.micDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        int i2 = R.raw.hand_2;
        this.shakeHandDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    }

    public static void $r8$lambda$5W5cJ9LLa8sbsY36SfVA9SZh7Jk(GroupCallStatusIcon groupCallStatusIcon) {
        groupCallStatusIcon.isSpeaking = false;
        Callback callback = groupCallStatusIcon.callback;
        if (callback != null) {
            callback.onStatusChanged();
        }
        groupCallStatusIcon.updateRunnableScheduled = false;
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

    public void setImageView(RLottieImageView rLottieImageView) {
        this.iconView = rLottieImageView;
        updateIcon(false);
    }

    public void setParticipant(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        this.participant = groupCallParticipant;
        updateIcon(z);
    }

    public void updateIcon(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z2;
        boolean customEndFrame;
        boolean z3;
        if (this.iconView == null || (groupCallParticipant = this.participant) == null || this.micDrawable == null) {
            return;
        }
        boolean z4 = groupCallParticipant.muted_by_you && !groupCallParticipant.self;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.participant;
        if (jElapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500) {
            z2 = groupCallParticipant2.hasVoiceDelayed;
        } else {
            z2 = groupCallParticipant2.hasVoice;
        }
        boolean z5 = !groupCallParticipant2.self ? (!groupCallParticipant2.muted || (this.isSpeaking && z2)) && !z4 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.isSpeaking && z2);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.participant;
        boolean z6 = ((groupCallParticipant3.muted && !this.isSpeaking) || z4) && !(((z3 = groupCallParticipant3.can_self_unmute) && !z4) || z3 || groupCallParticipant3.raise_hand_rating == 0);
        if (z6) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = this.participant.lastRaiseHandDate;
            long j2 = jElapsedRealtime2 - j;
            if (j != 0 && j2 <= 5000) {
                AndroidUtilities.runOnUIThread(this.checkRaiseRunnable, 5000 - j2);
            }
            customEndFrame = this.micDrawable.setCustomEndFrame(136);
        } else {
            this.iconView.setAnimation(this.micDrawable);
            this.micDrawable.setOnFinishCallback(null, 0);
            if (z5 && this.lastRaisedHand) {
                customEndFrame = this.micDrawable.setCustomEndFrame(36);
            } else {
                customEndFrame = this.micDrawable.setCustomEndFrame(z5 ? 99 : 69);
            }
        }
        if (!z) {
            RLottieDrawable rLottieDrawable = this.micDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
            this.iconView.invalidate();
        } else if (customEndFrame) {
            if (z6) {
                this.micDrawable.setCurrentFrame(99);
                this.micDrawable.setCustomEndFrame(136);
            } else if (z5 && this.lastRaisedHand && !z6) {
                this.micDrawable.setCurrentFrame(0);
                this.micDrawable.setCustomEndFrame(36);
            } else if (z5) {
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
        this.lastMuted = z5;
        this.lastRaisedHand = z6;
        if (this.mutedByMe != z4) {
            this.mutedByMe = z4;
            Callback callback = this.callback;
            if (callback != null) {
                callback.onStatusChanged();
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
        TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
        return (groupCallParticipant == null || !groupCallParticipant.muted || groupCallParticipant.can_self_unmute) ? false : true;
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
