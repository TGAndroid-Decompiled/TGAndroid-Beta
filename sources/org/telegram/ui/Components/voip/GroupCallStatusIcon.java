package org.telegram.ui.Components.voip;

import android.os.SystemClock;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;

public final class GroupCallStatusIcon {
    public FrameLayout callback;
    public final GroupCallStatusIcon$$ExternalSyntheticLambda0 checkRaiseRunnable;
    public RLottieImageView iconView;
    public boolean isSpeaking;
    public boolean lastRaisedHand;
    public final RLottieDrawable micDrawable;
    public boolean mutedByMe;
    public TLRPC.GroupCallParticipant participant;
    public final GroupCallStatusIcon$$ExternalSyntheticLambda0 raiseHandCallback;
    public final GroupCallStatusIcon$$ExternalSyntheticLambda0 shakeHandCallback;
    public final RLottieDrawable shakeHandDrawable;
    public final GroupCallStatusIcon$$ExternalSyntheticLambda0 updateRunnable;
    public boolean updateRunnableScheduled;

    public interface Callback {
        void onStatusChanged();
    }

    public GroupCallStatusIcon() {
        final int i = 0;
        this.shakeHandCallback = new Runnable(this) {
            public final GroupCallStatusIcon f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                int i2;
                switch (i) {
                    case 0:
                        GroupCallStatusIcon groupCallStatusIcon = this.f$0;
                        groupCallStatusIcon.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallStatusIcon.micDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        RLottieImageView rLottieImageView = groupCallStatusIcon.iconView;
                        if (rLottieImageView != null) {
                            rLottieImageView.setAnimation(rLottieDrawable);
                        }
                        break;
                    case 1:
                        GroupCallStatusIcon groupCallStatusIcon2 = this.f$0;
                        groupCallStatusIcon2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i3 = 120;
                        if (iNextInt < 32) {
                            i2 = 0;
                        } else {
                            i2 = 240;
                            if (iNextInt < 64) {
                                i3 = 240;
                                i2 = 120;
                            } else {
                                i3 = 420;
                                if (iNextInt >= 97) {
                                    i2 = 540;
                                    if (iNextInt == 98) {
                                        i3 = 540;
                                        i2 = 420;
                                    } else {
                                        i3 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallStatusIcon2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i3);
                        rLottieDrawable2.setOnFinishCallback(i3 - 1, groupCallStatusIcon2.shakeHandCallback);
                        rLottieDrawable2.setCurrentFrame(i2, true, false);
                        RLottieImageView rLottieImageView2 = groupCallStatusIcon2.iconView;
                        if (rLottieImageView2 != null) {
                            rLottieImageView2.setAnimation(rLottieDrawable2);
                            groupCallStatusIcon2.iconView.playAnimation();
                        }
                        break;
                    case 2:
                        GroupCallStatusIcon groupCallStatusIcon3 = this.f$0;
                        groupCallStatusIcon3.isSpeaking = false;
                        ?? r2 = groupCallStatusIcon3.callback;
                        if (r2 != 0) {
                            r2.onStatusChanged();
                        }
                        groupCallStatusIcon3.updateRunnableScheduled = false;
                        break;
                    default:
                        this.f$0.updateIcon(true);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.raiseHandCallback = new Runnable(this) {
            public final GroupCallStatusIcon f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                int i3;
                switch (i2) {
                    case 0:
                        GroupCallStatusIcon groupCallStatusIcon = this.f$0;
                        groupCallStatusIcon.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallStatusIcon.micDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        RLottieImageView rLottieImageView = groupCallStatusIcon.iconView;
                        if (rLottieImageView != null) {
                            rLottieImageView.setAnimation(rLottieDrawable);
                        }
                        break;
                    case 1:
                        GroupCallStatusIcon groupCallStatusIcon2 = this.f$0;
                        groupCallStatusIcon2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i4 = 120;
                        if (iNextInt < 32) {
                            i3 = 0;
                        } else {
                            i3 = 240;
                            if (iNextInt < 64) {
                                i4 = 240;
                                i3 = 120;
                            } else {
                                i4 = 420;
                                if (iNextInt >= 97) {
                                    i3 = 540;
                                    if (iNextInt == 98) {
                                        i4 = 540;
                                        i3 = 420;
                                    } else {
                                        i4 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallStatusIcon2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i4);
                        rLottieDrawable2.setOnFinishCallback(i4 - 1, groupCallStatusIcon2.shakeHandCallback);
                        rLottieDrawable2.setCurrentFrame(i3, true, false);
                        RLottieImageView rLottieImageView2 = groupCallStatusIcon2.iconView;
                        if (rLottieImageView2 != null) {
                            rLottieImageView2.setAnimation(rLottieDrawable2);
                            groupCallStatusIcon2.iconView.playAnimation();
                        }
                        break;
                    case 2:
                        GroupCallStatusIcon groupCallStatusIcon3 = this.f$0;
                        groupCallStatusIcon3.isSpeaking = false;
                        ?? r2 = groupCallStatusIcon3.callback;
                        if (r2 != 0) {
                            r2.onStatusChanged();
                        }
                        groupCallStatusIcon3.updateRunnableScheduled = false;
                        break;
                    default:
                        this.f$0.updateIcon(true);
                        break;
                }
            }
        };
        final int i3 = 2;
        this.updateRunnable = new Runnable(this) {
            public final GroupCallStatusIcon f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                int i4;
                switch (i3) {
                    case 0:
                        GroupCallStatusIcon groupCallStatusIcon = this.f$0;
                        groupCallStatusIcon.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallStatusIcon.micDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        RLottieImageView rLottieImageView = groupCallStatusIcon.iconView;
                        if (rLottieImageView != null) {
                            rLottieImageView.setAnimation(rLottieDrawable);
                        }
                        break;
                    case 1:
                        GroupCallStatusIcon groupCallStatusIcon2 = this.f$0;
                        groupCallStatusIcon2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i5 = 120;
                        if (iNextInt < 32) {
                            i4 = 0;
                        } else {
                            i4 = 240;
                            if (iNextInt < 64) {
                                i5 = 240;
                                i4 = 120;
                            } else {
                                i5 = 420;
                                if (iNextInt >= 97) {
                                    i4 = 540;
                                    if (iNextInt == 98) {
                                        i5 = 540;
                                        i4 = 420;
                                    } else {
                                        i5 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallStatusIcon2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i5);
                        rLottieDrawable2.setOnFinishCallback(i5 - 1, groupCallStatusIcon2.shakeHandCallback);
                        rLottieDrawable2.setCurrentFrame(i4, true, false);
                        RLottieImageView rLottieImageView2 = groupCallStatusIcon2.iconView;
                        if (rLottieImageView2 != null) {
                            rLottieImageView2.setAnimation(rLottieDrawable2);
                            groupCallStatusIcon2.iconView.playAnimation();
                        }
                        break;
                    case 2:
                        GroupCallStatusIcon groupCallStatusIcon3 = this.f$0;
                        groupCallStatusIcon3.isSpeaking = false;
                        ?? r2 = groupCallStatusIcon3.callback;
                        if (r2 != 0) {
                            r2.onStatusChanged();
                        }
                        groupCallStatusIcon3.updateRunnableScheduled = false;
                        break;
                    default:
                        this.f$0.updateIcon(true);
                        break;
                }
            }
        };
        final int i4 = 3;
        this.checkRaiseRunnable = new Runnable(this) {
            public final GroupCallStatusIcon f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                int i5;
                switch (i4) {
                    case 0:
                        GroupCallStatusIcon groupCallStatusIcon = this.f$0;
                        groupCallStatusIcon.shakeHandDrawable.setOnFinishCallback(0, null);
                        RLottieDrawable rLottieDrawable = groupCallStatusIcon.micDrawable;
                        rLottieDrawable.setOnFinishCallback(0, null);
                        RLottieImageView rLottieImageView = groupCallStatusIcon.iconView;
                        if (rLottieImageView != null) {
                            rLottieImageView.setAnimation(rLottieDrawable);
                        }
                        break;
                    case 1:
                        GroupCallStatusIcon groupCallStatusIcon2 = this.f$0;
                        groupCallStatusIcon2.getClass();
                        int iNextInt = Utilities.random.nextInt(100);
                        int i6 = 120;
                        if (iNextInt < 32) {
                            i5 = 0;
                        } else {
                            i5 = 240;
                            if (iNextInt < 64) {
                                i6 = 240;
                                i5 = 120;
                            } else {
                                i6 = 420;
                                if (iNextInt >= 97) {
                                    i5 = 540;
                                    if (iNextInt == 98) {
                                        i6 = 540;
                                        i5 = 420;
                                    } else {
                                        i6 = 720;
                                    }
                                }
                            }
                        }
                        RLottieDrawable rLottieDrawable2 = groupCallStatusIcon2.shakeHandDrawable;
                        rLottieDrawable2.setCustomEndFrame(i6);
                        rLottieDrawable2.setOnFinishCallback(i6 - 1, groupCallStatusIcon2.shakeHandCallback);
                        rLottieDrawable2.setCurrentFrame(i5, true, false);
                        RLottieImageView rLottieImageView2 = groupCallStatusIcon2.iconView;
                        if (rLottieImageView2 != null) {
                            rLottieImageView2.setAnimation(rLottieDrawable2);
                            groupCallStatusIcon2.iconView.playAnimation();
                        }
                        break;
                    case 2:
                        GroupCallStatusIcon groupCallStatusIcon3 = this.f$0;
                        groupCallStatusIcon3.isSpeaking = false;
                        ?? r2 = groupCallStatusIcon3.callback;
                        if (r2 != 0) {
                            r2.onStatusChanged();
                        }
                        groupCallStatusIcon3.updateRunnableScheduled = false;
                        break;
                    default:
                        this.f$0.updateIcon(true);
                        break;
                }
            }
        };
        int i5 = R.raw.voice_mini;
        this.micDrawable = new RLottieDrawable(i5, SurfaceContainer$$ExternalSyntheticOutline0.m(i5, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        int i6 = R.raw.hand_2;
        this.shakeHandDrawable = new RLottieDrawable(i6, SurfaceContainer$$ExternalSyntheticOutline0.m(i6, ""), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    }

    public final void updateIcon(boolean z) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        RLottieDrawable rLottieDrawable;
        boolean customEndFrame;
        boolean z2;
        if (this.iconView == null || (groupCallParticipant = this.participant) == null || (rLottieDrawable = this.micDrawable) == null) {
            return;
        }
        boolean z3 = groupCallParticipant.muted_by_you && !groupCallParticipant.self;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.participant;
        boolean z4 = jElapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500 ? groupCallParticipant2.hasVoiceDelayed : groupCallParticipant2.hasVoice;
        boolean z5 = !groupCallParticipant2.self ? (!groupCallParticipant2.muted || (this.isSpeaking && z4)) && !z3 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.isSpeaking && z4);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.participant;
        boolean z6 = ((groupCallParticipant3.muted && !this.isSpeaking) || z3) && !(((z2 = groupCallParticipant3.can_self_unmute) && !z3) || z2 || groupCallParticipant3.raise_hand_rating == 0);
        if (z6) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = this.participant.lastRaiseHandDate;
            long j2 = jElapsedRealtime2 - j;
            if (j != 0 && j2 <= 5000) {
                AndroidUtilities.runOnUIThread(this.checkRaiseRunnable, 5000 - j2);
            }
            customEndFrame = rLottieDrawable.setCustomEndFrame(136);
        } else {
            this.iconView.setAnimation(rLottieDrawable);
            rLottieDrawable.setOnFinishCallback(0, null);
            if (z5 && this.lastRaisedHand) {
                customEndFrame = rLottieDrawable.setCustomEndFrame(36);
            } else {
                customEndFrame = rLottieDrawable.setCustomEndFrame(z5 ? 99 : 69);
            }
        }
        if (!z) {
            rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
            this.iconView.invalidate();
        } else if (customEndFrame) {
            if (z6) {
                rLottieDrawable.setCurrentFrame(99, true, false);
                rLottieDrawable.setCustomEndFrame(136);
            } else if (z5 && this.lastRaisedHand && !z6) {
                rLottieDrawable.setCurrentFrame(0, true, false);
                rLottieDrawable.setCustomEndFrame(36);
            } else if (z5) {
                rLottieDrawable.setCurrentFrame(69, true, false);
                rLottieDrawable.setCustomEndFrame(99);
            } else {
                rLottieDrawable.setCurrentFrame(36, true, false);
                rLottieDrawable.setCustomEndFrame(69);
            }
            this.iconView.playAnimation();
            this.iconView.invalidate();
        }
        this.iconView.setAnimation(rLottieDrawable);
        this.lastRaisedHand = z6;
        if (this.mutedByMe != z3) {
            this.mutedByMe = z3;
            ?? r1 = this.callback;
            if (r1 != 0) {
                r1.onStatusChanged();
            }
        }
    }
}
