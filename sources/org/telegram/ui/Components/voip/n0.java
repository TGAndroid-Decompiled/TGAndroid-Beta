package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
public final class n0 {
    public rh0 f41160c;
    public boolean d;
    public boolean f41161e;
    public boolean f41162f;
    public FrameLayout f41163g;
    public TLRPC.GroupCallParticipant h;
    public boolean f41166k;
    public final l0 f41164i = new Runnable(this) {
        public final n0 f41115b;

        {
            this.f41115b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41115b;
                    n0Var.f41159b.S(0, null);
                    oh0 oh0Var = n0Var.f41158a;
                    oh0Var.S(0, null);
                    rh0 rh0Var = n0Var.f41160c;
                    if (rh0Var != null) {
                        rh0Var.setAnimation(oh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41115b;
                    oh0 oh0Var2 = n0Var2.f41159b;
                    int nextInt = Utilities.f22772b.nextInt(100);
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
                    oh0Var2.P(i10);
                    oh0Var2.S(i10 - 1, n0Var2.f41164i);
                    oh0Var2.M(i7);
                    rh0 rh0Var2 = n0Var2.f41160c;
                    if (rh0Var2 != null) {
                        rh0Var2.setAnimation(oh0Var2);
                        n0Var2.f41160c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41115b;
                    n0Var3.f41161e = false;
                    ?? r22 = n0Var3.f41163g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41115b.c(true);
                    return;
            }
        }
    };
    public final l0 f41165j = new Runnable(this) {
        public final n0 f41115b;

        {
            this.f41115b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41115b;
                    n0Var.f41159b.S(0, null);
                    oh0 oh0Var = n0Var.f41158a;
                    oh0Var.S(0, null);
                    rh0 rh0Var = n0Var.f41160c;
                    if (rh0Var != null) {
                        rh0Var.setAnimation(oh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41115b;
                    oh0 oh0Var2 = n0Var2.f41159b;
                    int nextInt = Utilities.f22772b.nextInt(100);
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
                    oh0Var2.P(i10);
                    oh0Var2.S(i10 - 1, n0Var2.f41164i);
                    oh0Var2.M(i7);
                    rh0 rh0Var2 = n0Var2.f41160c;
                    if (rh0Var2 != null) {
                        rh0Var2.setAnimation(oh0Var2);
                        n0Var2.f41160c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41115b;
                    n0Var3.f41161e = false;
                    ?? r22 = n0Var3.f41163g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41115b.c(true);
                    return;
            }
        }
    };
    public final l0 f41167l = new Runnable(this) {
        public final n0 f41115b;

        {
            this.f41115b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41115b;
                    n0Var.f41159b.S(0, null);
                    oh0 oh0Var = n0Var.f41158a;
                    oh0Var.S(0, null);
                    rh0 rh0Var = n0Var.f41160c;
                    if (rh0Var != null) {
                        rh0Var.setAnimation(oh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41115b;
                    oh0 oh0Var2 = n0Var2.f41159b;
                    int nextInt = Utilities.f22772b.nextInt(100);
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
                    oh0Var2.P(i10);
                    oh0Var2.S(i10 - 1, n0Var2.f41164i);
                    oh0Var2.M(i7);
                    rh0 rh0Var2 = n0Var2.f41160c;
                    if (rh0Var2 != null) {
                        rh0Var2.setAnimation(oh0Var2);
                        n0Var2.f41160c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41115b;
                    n0Var3.f41161e = false;
                    ?? r22 = n0Var3.f41163g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41115b.c(true);
                    return;
            }
        }
    };
    public final l0 f41168m = new Runnable(this) {
        public final n0 f41115b;

        {
            this.f41115b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41115b;
                    n0Var.f41159b.S(0, null);
                    oh0 oh0Var = n0Var.f41158a;
                    oh0Var.S(0, null);
                    rh0 rh0Var = n0Var.f41160c;
                    if (rh0Var != null) {
                        rh0Var.setAnimation(oh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41115b;
                    oh0 oh0Var2 = n0Var2.f41159b;
                    int nextInt = Utilities.f22772b.nextInt(100);
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
                    oh0Var2.P(i10);
                    oh0Var2.S(i10 - 1, n0Var2.f41164i);
                    oh0Var2.M(i7);
                    rh0 rh0Var2 = n0Var2.f41160c;
                    if (rh0Var2 != null) {
                        rh0Var2.setAnimation(oh0Var2);
                        n0Var2.f41160c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41115b;
                    n0Var3.f41161e = false;
                    ?? r22 = n0Var3.f41163g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41115b.c(true);
                    return;
            }
        }
    };
    public final oh0 f41158a = new oh0(2131624332, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final oh0 f41159b = new oh0(2131624045, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            l0 l0Var = this.f41167l;
            if (z10) {
                org.telegram.messenger.g0.r(l0Var);
            }
            if (!this.f41161e) {
                this.f41161e = true;
                ?? r42 = this.f41163g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.h3(l0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f41163g = null;
        this.f41161e = false;
        org.telegram.messenger.g0.r(this.f41167l);
        org.telegram.messenger.g0.r(this.f41165j);
        org.telegram.messenger.g0.r(this.f41168m);
        this.f41158a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        oh0 oh0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        boolean P;
        boolean z15;
        if (this.f41160c != null && (groupCallParticipant = this.h) != null && (oh0Var = this.f41158a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f41161e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f41161e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f41161e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    org.telegram.messenger.g0.h3(this.f41168m, 5000 - j10);
                }
                P = oh0Var.P(136);
            } else {
                this.f41160c.setAnimation(oh0Var);
                oh0Var.S(0, null);
                if (z13 && this.f41162f) {
                    P = oh0Var.P(36);
                } else {
                    if (z13) {
                        i7 = 99;
                    } else {
                        i7 = 69;
                    }
                    P = oh0Var.P(i7);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        oh0Var.M(99);
                        oh0Var.P(136);
                    } else if (z13 && this.f41162f && !z14) {
                        oh0Var.M(0);
                        oh0Var.P(36);
                    } else if (z13) {
                        oh0Var.M(69);
                        oh0Var.P(99);
                    } else {
                        oh0Var.M(36);
                        oh0Var.P(69);
                    }
                    this.f41160c.d();
                    this.f41160c.invalidate();
                }
            } else {
                oh0Var.N(oh0Var.f38181f - 1, false, true);
                this.f41160c.invalidate();
            }
            this.f41160c.setAnimation(oh0Var);
            this.f41162f = z14;
            if (this.f41166k != z11) {
                this.f41166k = z11;
                ?? r12 = this.f41163g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
