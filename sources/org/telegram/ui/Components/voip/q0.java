package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hk0;
public final class q0 {
    public hk0 f32211c;
    public boolean d;
    public boolean f32212e;
    public boolean f32213f;
    public FrameLayout f32214g;
    public TLRPC.GroupCallParticipant h;
    public boolean f32217k;
    public final o0 f32215i = new Runnable(this) {
        public final q0 f32164b;

        {
            this.f32164b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f32164b;
                    q0Var.f32210b.S(0, null);
                    ek0 ek0Var = q0Var.f32209a;
                    ek0Var.S(0, null);
                    hk0 hk0Var = q0Var.f32211c;
                    if (hk0Var != null) {
                        hk0Var.setAnimation(ek0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f32164b;
                    ek0 ek0Var2 = q0Var2.f32210b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt >= 64) {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt != 98) {
                                    i11 = 720;
                                }
                            }
                        }
                        int i12 = i10;
                        i10 = i11;
                        i11 = i12;
                    }
                    ek0Var2.P(i11);
                    ek0Var2.S(i11 - 1, q0Var2.f32215i);
                    ek0Var2.M(i10);
                    hk0 hk0Var2 = q0Var2.f32211c;
                    if (hk0Var2 != null) {
                        hk0Var2.setAnimation(ek0Var2);
                        q0Var2.f32211c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f32164b;
                    q0Var3.f32212e = false;
                    ?? r22 = q0Var3.f32214g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f32164b.c(true);
                    return;
            }
        }
    };
    public final o0 f32216j = new Runnable(this) {
        public final q0 f32164b;

        {
            this.f32164b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f32164b;
                    q0Var.f32210b.S(0, null);
                    ek0 ek0Var = q0Var.f32209a;
                    ek0Var.S(0, null);
                    hk0 hk0Var = q0Var.f32211c;
                    if (hk0Var != null) {
                        hk0Var.setAnimation(ek0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f32164b;
                    ek0 ek0Var2 = q0Var2.f32210b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt >= 64) {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt != 98) {
                                    i11 = 720;
                                }
                            }
                        }
                        int i12 = i10;
                        i10 = i11;
                        i11 = i12;
                    }
                    ek0Var2.P(i11);
                    ek0Var2.S(i11 - 1, q0Var2.f32215i);
                    ek0Var2.M(i10);
                    hk0 hk0Var2 = q0Var2.f32211c;
                    if (hk0Var2 != null) {
                        hk0Var2.setAnimation(ek0Var2);
                        q0Var2.f32211c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f32164b;
                    q0Var3.f32212e = false;
                    ?? r22 = q0Var3.f32214g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f32164b.c(true);
                    return;
            }
        }
    };
    public final o0 f32218l = new Runnable(this) {
        public final q0 f32164b;

        {
            this.f32164b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f32164b;
                    q0Var.f32210b.S(0, null);
                    ek0 ek0Var = q0Var.f32209a;
                    ek0Var.S(0, null);
                    hk0 hk0Var = q0Var.f32211c;
                    if (hk0Var != null) {
                        hk0Var.setAnimation(ek0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f32164b;
                    ek0 ek0Var2 = q0Var2.f32210b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt >= 64) {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt != 98) {
                                    i11 = 720;
                                }
                            }
                        }
                        int i12 = i10;
                        i10 = i11;
                        i11 = i12;
                    }
                    ek0Var2.P(i11);
                    ek0Var2.S(i11 - 1, q0Var2.f32215i);
                    ek0Var2.M(i10);
                    hk0 hk0Var2 = q0Var2.f32211c;
                    if (hk0Var2 != null) {
                        hk0Var2.setAnimation(ek0Var2);
                        q0Var2.f32211c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f32164b;
                    q0Var3.f32212e = false;
                    ?? r22 = q0Var3.f32214g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f32164b.c(true);
                    return;
            }
        }
    };
    public final o0 f32219m = new Runnable(this) {
        public final q0 f32164b;

        {
            this.f32164b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f32164b;
                    q0Var.f32210b.S(0, null);
                    ek0 ek0Var = q0Var.f32209a;
                    ek0Var.S(0, null);
                    hk0 hk0Var = q0Var.f32211c;
                    if (hk0Var != null) {
                        hk0Var.setAnimation(ek0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f32164b;
                    ek0 ek0Var2 = q0Var2.f32210b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt >= 64) {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt != 98) {
                                    i11 = 720;
                                }
                            }
                        }
                        int i12 = i10;
                        i10 = i11;
                        i11 = i12;
                    }
                    ek0Var2.P(i11);
                    ek0Var2.S(i11 - 1, q0Var2.f32215i);
                    ek0Var2.M(i10);
                    hk0 hk0Var2 = q0Var2.f32211c;
                    if (hk0Var2 != null) {
                        hk0Var2.setAnimation(ek0Var2);
                        q0Var2.f32211c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f32164b;
                    q0Var3.f32212e = false;
                    ?? r22 = q0Var3.f32214g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f32164b.c(true);
                    return;
            }
        }
    };
    public final ek0 f32209a = new ek0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final ek0 f32210b = new ek0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            o0 o0Var = this.f32218l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(o0Var);
            }
            if (!this.f32212e) {
                this.f32212e = true;
                ?? r42 = this.f32214g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(o0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f32214g = null;
        this.f32212e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f32218l);
        AndroidUtilities.cancelRunOnUIThread(this.f32216j);
        AndroidUtilities.cancelRunOnUIThread(this.f32219m);
        this.f32209a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ek0 ek0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f32211c != null && (groupCallParticipant = this.h) != null && (ek0Var = this.f32209a) != null) {
            if (groupCallParticipant.muted_by_you && !groupCallParticipant.self) {
                z11 = true;
            } else {
                z11 = false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.GroupCallParticipant groupCallParticipant2 = this.h;
            if (elapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500) {
                z12 = groupCallParticipant2.hasVoiceDelayed;
            } else {
                z12 = groupCallParticipant2.hasVoice;
            }
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f32212e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f32212e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f32212e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f32219m, 5000 - j10);
                }
                P = ek0Var.P(136);
            } else {
                this.f32211c.setAnimation(ek0Var);
                ek0Var.S(0, null);
                if (z13 && this.f32213f) {
                    P = ek0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = ek0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        ek0Var.M(99);
                        ek0Var.P(136);
                    } else if (z13 && this.f32213f && !z14) {
                        ek0Var.M(0);
                        ek0Var.P(36);
                    } else if (z13) {
                        ek0Var.M(69);
                        ek0Var.P(99);
                    } else {
                        ek0Var.M(36);
                        ek0Var.P(69);
                    }
                    this.f32211c.d();
                    this.f32211c.invalidate();
                }
            } else {
                ek0Var.N(ek0Var.f26045f - 1, false, true);
                this.f32211c.invalidate();
            }
            this.f32211c.setAnimation(ek0Var);
            this.f32213f = z14;
            if (this.f32217k != z11) {
                this.f32217k = z11;
                ?? r12 = this.f32214g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
