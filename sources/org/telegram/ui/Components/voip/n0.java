package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.zg0;
public final class n0 {
    public ch0 f39351c;
    public boolean d;
    public boolean f39352e;
    public boolean f39353f;
    public FrameLayout f39354g;
    public TLRPC.GroupCallParticipant h;
    public boolean f39357k;
    public final l0 f39355i = new Runnable(this) {
        public final n0 f39314b;

        {
            this.f39314b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39314b;
                    n0Var.f39350b.S(0, null);
                    zg0 zg0Var = n0Var.f39349a;
                    zg0Var.S(0, null);
                    ch0 ch0Var = n0Var.f39351c;
                    if (ch0Var != null) {
                        ch0Var.setAnimation(zg0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39314b;
                    zg0 zg0Var2 = n0Var2.f39350b;
                    int nextInt = Utilities.f21331b.nextInt(100);
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
                    zg0Var2.P(i10);
                    zg0Var2.S(i10 - 1, n0Var2.f39355i);
                    zg0Var2.M(i7);
                    ch0 ch0Var2 = n0Var2.f39351c;
                    if (ch0Var2 != null) {
                        ch0Var2.setAnimation(zg0Var2);
                        n0Var2.f39351c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39314b;
                    n0Var3.f39352e = false;
                    ?? r22 = n0Var3.f39354g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39314b.c(true);
                    return;
            }
        }
    };
    public final l0 f39356j = new Runnable(this) {
        public final n0 f39314b;

        {
            this.f39314b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39314b;
                    n0Var.f39350b.S(0, null);
                    zg0 zg0Var = n0Var.f39349a;
                    zg0Var.S(0, null);
                    ch0 ch0Var = n0Var.f39351c;
                    if (ch0Var != null) {
                        ch0Var.setAnimation(zg0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39314b;
                    zg0 zg0Var2 = n0Var2.f39350b;
                    int nextInt = Utilities.f21331b.nextInt(100);
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
                    zg0Var2.P(i10);
                    zg0Var2.S(i10 - 1, n0Var2.f39355i);
                    zg0Var2.M(i7);
                    ch0 ch0Var2 = n0Var2.f39351c;
                    if (ch0Var2 != null) {
                        ch0Var2.setAnimation(zg0Var2);
                        n0Var2.f39351c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39314b;
                    n0Var3.f39352e = false;
                    ?? r22 = n0Var3.f39354g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39314b.c(true);
                    return;
            }
        }
    };
    public final l0 f39358l = new Runnable(this) {
        public final n0 f39314b;

        {
            this.f39314b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39314b;
                    n0Var.f39350b.S(0, null);
                    zg0 zg0Var = n0Var.f39349a;
                    zg0Var.S(0, null);
                    ch0 ch0Var = n0Var.f39351c;
                    if (ch0Var != null) {
                        ch0Var.setAnimation(zg0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39314b;
                    zg0 zg0Var2 = n0Var2.f39350b;
                    int nextInt = Utilities.f21331b.nextInt(100);
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
                    zg0Var2.P(i10);
                    zg0Var2.S(i10 - 1, n0Var2.f39355i);
                    zg0Var2.M(i7);
                    ch0 ch0Var2 = n0Var2.f39351c;
                    if (ch0Var2 != null) {
                        ch0Var2.setAnimation(zg0Var2);
                        n0Var2.f39351c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39314b;
                    n0Var3.f39352e = false;
                    ?? r22 = n0Var3.f39354g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39314b.c(true);
                    return;
            }
        }
    };
    public final l0 f39359m = new Runnable(this) {
        public final n0 f39314b;

        {
            this.f39314b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f39314b;
                    n0Var.f39350b.S(0, null);
                    zg0 zg0Var = n0Var.f39349a;
                    zg0Var.S(0, null);
                    ch0 ch0Var = n0Var.f39351c;
                    if (ch0Var != null) {
                        ch0Var.setAnimation(zg0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f39314b;
                    zg0 zg0Var2 = n0Var2.f39350b;
                    int nextInt = Utilities.f21331b.nextInt(100);
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
                    zg0Var2.P(i10);
                    zg0Var2.S(i10 - 1, n0Var2.f39355i);
                    zg0Var2.M(i7);
                    ch0 ch0Var2 = n0Var2.f39351c;
                    if (ch0Var2 != null) {
                        ch0Var2.setAnimation(zg0Var2);
                        n0Var2.f39351c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f39314b;
                    n0Var3.f39352e = false;
                    ?? r22 = n0Var3.f39354g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f39314b.c(true);
                    return;
            }
        }
    };
    public final zg0 f39349a = new zg0(2131624331, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final zg0 f39350b = new zg0(2131624044, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z9 = this.d;
            l0 l0Var = this.f39358l;
            if (z9) {
                org.telegram.messenger.g0.r(l0Var);
            }
            if (!this.f39352e) {
                this.f39352e = true;
                ?? r42 = this.f39354g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.i3(l0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f39354g = null;
        this.f39352e = false;
        org.telegram.messenger.g0.r(this.f39358l);
        org.telegram.messenger.g0.r(this.f39356j);
        org.telegram.messenger.g0.r(this.f39359m);
        this.f39349a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z9) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        zg0 zg0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean P;
        boolean z14;
        if (this.f39351c != null && (groupCallParticipant = this.h) != null && (zg0Var = this.f39349a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f39352e && z11)) && !z10) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f39352e && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f39352e) || z10) && ((!(z14 = groupCallParticipant3.can_self_unmute) || z10) && !z14 && groupCallParticipant3.raise_hand_rating != 0)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    org.telegram.messenger.g0.i3(this.f39359m, 5000 - j10);
                }
                P = zg0Var.P(136);
            } else {
                this.f39351c.setAnimation(zg0Var);
                zg0Var.S(0, null);
                if (z12 && this.f39353f) {
                    P = zg0Var.P(36);
                } else {
                    if (z12) {
                        i7 = 99;
                    } else {
                        i7 = 69;
                    }
                    P = zg0Var.P(i7);
                }
            }
            if (z9) {
                if (P) {
                    if (z13) {
                        zg0Var.M(99);
                        zg0Var.P(136);
                    } else if (z12 && this.f39353f && !z13) {
                        zg0Var.M(0);
                        zg0Var.P(36);
                    } else if (z12) {
                        zg0Var.M(69);
                        zg0Var.P(99);
                    } else {
                        zg0Var.M(36);
                        zg0Var.P(69);
                    }
                    this.f39351c.d();
                    this.f39351c.invalidate();
                }
            } else {
                zg0Var.N(zg0Var.f40978f - 1, false, true);
                this.f39351c.invalidate();
            }
            this.f39351c.setAnimation(zg0Var);
            this.f39353f = z13;
            if (this.f39357k != z10) {
                this.f39357k = z10;
                ?? r12 = this.f39354g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
