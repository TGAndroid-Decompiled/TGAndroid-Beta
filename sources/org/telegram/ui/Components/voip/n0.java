package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
public final class n0 {
    public dh0 f39475c;
    public boolean d;
    public boolean f39476e;
    public boolean f39477f;
    public FrameLayout f39478g;
    public TLRPC.GroupCallParticipant h;
    public boolean f39481k;
    public final l0 f39479i = new Runnable(this) {
        public final n0 f39438b;

        {
            this.f39438b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39438b;
                    n0Var.f39474b.S(0, null);
                    ah0 ah0Var = n0Var.f39473a;
                    ah0Var.S(0, null);
                    dh0 dh0Var = n0Var.f39475c;
                    if (dh0Var != null) {
                        dh0Var.setAnimation(ah0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39438b;
                    ah0 ah0Var2 = n0Var2.f39474b;
                    int nextInt = Utilities.f21334b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ah0Var2.P(i10);
                    ah0Var2.S(i10 - 1, n0Var2.f39479i);
                    ah0Var2.M(i7);
                    dh0 dh0Var2 = n0Var2.f39475c;
                    if (dh0Var2 != null) {
                        dh0Var2.setAnimation(ah0Var2);
                        n0Var2.f39475c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39438b;
                    n0Var3.f39476e = false;
                    ?? r22 = n0Var3.f39478g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39438b.c(true);
                    return;
            }
        }
    };
    public final l0 f39480j = new Runnable(this) {
        public final n0 f39438b;

        {
            this.f39438b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39438b;
                    n0Var.f39474b.S(0, null);
                    ah0 ah0Var = n0Var.f39473a;
                    ah0Var.S(0, null);
                    dh0 dh0Var = n0Var.f39475c;
                    if (dh0Var != null) {
                        dh0Var.setAnimation(ah0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39438b;
                    ah0 ah0Var2 = n0Var2.f39474b;
                    int nextInt = Utilities.f21334b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ah0Var2.P(i10);
                    ah0Var2.S(i10 - 1, n0Var2.f39479i);
                    ah0Var2.M(i7);
                    dh0 dh0Var2 = n0Var2.f39475c;
                    if (dh0Var2 != null) {
                        dh0Var2.setAnimation(ah0Var2);
                        n0Var2.f39475c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39438b;
                    n0Var3.f39476e = false;
                    ?? r22 = n0Var3.f39478g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39438b.c(true);
                    return;
            }
        }
    };
    public final l0 f39482l = new Runnable(this) {
        public final n0 f39438b;

        {
            this.f39438b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39438b;
                    n0Var.f39474b.S(0, null);
                    ah0 ah0Var = n0Var.f39473a;
                    ah0Var.S(0, null);
                    dh0 dh0Var = n0Var.f39475c;
                    if (dh0Var != null) {
                        dh0Var.setAnimation(ah0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39438b;
                    ah0 ah0Var2 = n0Var2.f39474b;
                    int nextInt = Utilities.f21334b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ah0Var2.P(i10);
                    ah0Var2.S(i10 - 1, n0Var2.f39479i);
                    ah0Var2.M(i7);
                    dh0 dh0Var2 = n0Var2.f39475c;
                    if (dh0Var2 != null) {
                        dh0Var2.setAnimation(ah0Var2);
                        n0Var2.f39475c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39438b;
                    n0Var3.f39476e = false;
                    ?? r22 = n0Var3.f39478g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39438b.c(true);
                    return;
            }
        }
    };
    public final l0 f39483m = new Runnable(this) {
        public final n0 f39438b;

        {
            this.f39438b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39438b;
                    n0Var.f39474b.S(0, null);
                    ah0 ah0Var = n0Var.f39473a;
                    ah0Var.S(0, null);
                    dh0 dh0Var = n0Var.f39475c;
                    if (dh0Var != null) {
                        dh0Var.setAnimation(ah0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39438b;
                    ah0 ah0Var2 = n0Var2.f39474b;
                    int nextInt = Utilities.f21334b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ah0Var2.P(i10);
                    ah0Var2.S(i10 - 1, n0Var2.f39479i);
                    ah0Var2.M(i7);
                    dh0 dh0Var2 = n0Var2.f39475c;
                    if (dh0Var2 != null) {
                        dh0Var2.setAnimation(ah0Var2);
                        n0Var2.f39475c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39438b;
                    n0Var3.f39476e = false;
                    ?? r22 = n0Var3.f39478g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39438b.c(true);
                    return;
            }
        }
    };
    public final ah0 f39473a = new ah0(2131624331, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final ah0 f39474b = new ah0(2131624044, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z9 = this.d;
            l0 l0Var = this.f39482l;
            if (z9) {
                org.telegram.messenger.g0.r(l0Var);
            }
            if (!this.f39476e) {
                this.f39476e = true;
                ?? r42 = this.f39478g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.i3(l0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f39478g = null;
        this.f39476e = false;
        org.telegram.messenger.g0.r(this.f39482l);
        org.telegram.messenger.g0.r(this.f39480j);
        org.telegram.messenger.g0.r(this.f39483m);
        this.f39473a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z9) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ah0 ah0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean P;
        boolean z14;
        if (this.f39475c != null && (groupCallParticipant = this.h) != null && (ah0Var = this.f39473a) != null) {
            if (groupCallParticipant.muted_by_you && !groupCallParticipant.self) {
                z10 = true;
            } else {
                z10 = false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.GroupCallParticipant groupCallParticipant2 = this.h;
            if (elapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500) {
                z11 = groupCallParticipant2.hasVoiceDelayed;
            } else {
                z11 = groupCallParticipant2.hasVoice;
            }
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f39476e && z11)) && !z10) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f39476e && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f39476e) || z10) && ((!(z14 = groupCallParticipant3.can_self_unmute) || z10) && !z14 && groupCallParticipant3.raise_hand_rating != 0)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    org.telegram.messenger.g0.i3(this.f39483m, 5000 - j10);
                }
                P = ah0Var.P(136);
            } else {
                this.f39475c.setAnimation(ah0Var);
                ah0Var.S(0, null);
                if (z12 && this.f39477f) {
                    P = ah0Var.P(36);
                } else {
                    if (z12) {
                        i7 = 99;
                    } else {
                        i7 = 69;
                    }
                    P = ah0Var.P(i7);
                }
            }
            if (z9) {
                if (P) {
                    if (z13) {
                        ah0Var.M(99);
                        ah0Var.P(136);
                    } else if (z12 && this.f39477f && !z13) {
                        ah0Var.M(0);
                        ah0Var.P(36);
                    } else if (z12) {
                        ah0Var.M(69);
                        ah0Var.P(99);
                    } else {
                        ah0Var.M(36);
                        ah0Var.P(69);
                    }
                    this.f39475c.d();
                    this.f39475c.invalidate();
                }
            } else {
                ah0Var.N(ah0Var.f31828f - 1, false, true);
                this.f39475c.invalidate();
            }
            this.f39475c.setAnimation(ah0Var);
            this.f39477f = z13;
            if (this.f39481k != z10) {
                this.f39481k = z10;
                ?? r12 = this.f39478g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
