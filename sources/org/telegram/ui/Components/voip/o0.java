package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
public final class o0 {
    public qh0 f41094c;
    public boolean d;
    public boolean f41095e;
    public boolean f41096f;
    public FrameLayout f41097g;
    public TLRPC.GroupCallParticipant h;
    public boolean f41100k;
    public final m0 f41098i = new Runnable(this) {
        public final o0 f41053b;

        {
            this.f41053b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f41053b;
                    o0Var.f41093b.S(0, null);
                    nh0 nh0Var = o0Var.f41092a;
                    nh0Var.S(0, null);
                    qh0 qh0Var = o0Var.f41094c;
                    if (qh0Var != null) {
                        qh0Var.setAnimation(nh0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f41053b;
                    nh0 nh0Var2 = o0Var2.f41093b;
                    int nextInt = Utilities.f22875b.nextInt(100);
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
                    nh0Var2.P(i10);
                    nh0Var2.S(i10 - 1, o0Var2.f41098i);
                    nh0Var2.M(i7);
                    qh0 qh0Var2 = o0Var2.f41094c;
                    if (qh0Var2 != null) {
                        qh0Var2.setAnimation(nh0Var2);
                        o0Var2.f41094c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f41053b;
                    o0Var3.f41095e = false;
                    ?? r22 = o0Var3.f41097g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f41053b.c(true);
                    return;
            }
        }
    };
    public final m0 f41099j = new Runnable(this) {
        public final o0 f41053b;

        {
            this.f41053b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f41053b;
                    o0Var.f41093b.S(0, null);
                    nh0 nh0Var = o0Var.f41092a;
                    nh0Var.S(0, null);
                    qh0 qh0Var = o0Var.f41094c;
                    if (qh0Var != null) {
                        qh0Var.setAnimation(nh0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f41053b;
                    nh0 nh0Var2 = o0Var2.f41093b;
                    int nextInt = Utilities.f22875b.nextInt(100);
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
                    nh0Var2.P(i10);
                    nh0Var2.S(i10 - 1, o0Var2.f41098i);
                    nh0Var2.M(i7);
                    qh0 qh0Var2 = o0Var2.f41094c;
                    if (qh0Var2 != null) {
                        qh0Var2.setAnimation(nh0Var2);
                        o0Var2.f41094c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f41053b;
                    o0Var3.f41095e = false;
                    ?? r22 = o0Var3.f41097g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f41053b.c(true);
                    return;
            }
        }
    };
    public final m0 f41101l = new Runnable(this) {
        public final o0 f41053b;

        {
            this.f41053b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f41053b;
                    o0Var.f41093b.S(0, null);
                    nh0 nh0Var = o0Var.f41092a;
                    nh0Var.S(0, null);
                    qh0 qh0Var = o0Var.f41094c;
                    if (qh0Var != null) {
                        qh0Var.setAnimation(nh0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f41053b;
                    nh0 nh0Var2 = o0Var2.f41093b;
                    int nextInt = Utilities.f22875b.nextInt(100);
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
                    nh0Var2.P(i10);
                    nh0Var2.S(i10 - 1, o0Var2.f41098i);
                    nh0Var2.M(i7);
                    qh0 qh0Var2 = o0Var2.f41094c;
                    if (qh0Var2 != null) {
                        qh0Var2.setAnimation(nh0Var2);
                        o0Var2.f41094c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f41053b;
                    o0Var3.f41095e = false;
                    ?? r22 = o0Var3.f41097g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f41053b.c(true);
                    return;
            }
        }
    };
    public final m0 f41102m = new Runnable(this) {
        public final o0 f41053b;

        {
            this.f41053b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f41053b;
                    o0Var.f41093b.S(0, null);
                    nh0 nh0Var = o0Var.f41092a;
                    nh0Var.S(0, null);
                    qh0 qh0Var = o0Var.f41094c;
                    if (qh0Var != null) {
                        qh0Var.setAnimation(nh0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f41053b;
                    nh0 nh0Var2 = o0Var2.f41093b;
                    int nextInt = Utilities.f22875b.nextInt(100);
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
                    nh0Var2.P(i10);
                    nh0Var2.S(i10 - 1, o0Var2.f41098i);
                    nh0Var2.M(i7);
                    qh0 qh0Var2 = o0Var2.f41094c;
                    if (qh0Var2 != null) {
                        qh0Var2.setAnimation(nh0Var2);
                        o0Var2.f41094c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f41053b;
                    o0Var3.f41095e = false;
                    ?? r22 = o0Var3.f41097g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f41053b.c(true);
                    return;
            }
        }
    };
    public final nh0 f41092a = new nh0(2131624332, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final nh0 f41093b = new nh0(2131624045, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            m0 m0Var = this.f41101l;
            if (z10) {
                org.telegram.messenger.g0.r(m0Var);
            }
            if (!this.f41095e) {
                this.f41095e = true;
                ?? r42 = this.f41097g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.h3(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f41097g = null;
        this.f41095e = false;
        org.telegram.messenger.g0.r(this.f41101l);
        org.telegram.messenger.g0.r(this.f41099j);
        org.telegram.messenger.g0.r(this.f41102m);
        this.f41092a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        nh0 nh0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        boolean P;
        boolean z15;
        if (this.f41094c != null && (groupCallParticipant = this.h) != null && (nh0Var = this.f41092a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f41095e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f41095e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f41095e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    org.telegram.messenger.g0.h3(this.f41102m, 5000 - j10);
                }
                P = nh0Var.P(136);
            } else {
                this.f41094c.setAnimation(nh0Var);
                nh0Var.S(0, null);
                if (z13 && this.f41096f) {
                    P = nh0Var.P(36);
                } else {
                    if (z13) {
                        i7 = 99;
                    } else {
                        i7 = 69;
                    }
                    P = nh0Var.P(i7);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        nh0Var.M(99);
                        nh0Var.P(136);
                    } else if (z13 && this.f41096f && !z14) {
                        nh0Var.M(0);
                        nh0Var.P(36);
                    } else if (z13) {
                        nh0Var.M(69);
                        nh0Var.P(99);
                    } else {
                        nh0Var.M(36);
                        nh0Var.P(69);
                    }
                    this.f41094c.d();
                    this.f41094c.invalidate();
                }
            } else {
                nh0Var.N(nh0Var.f37807f - 1, false, true);
                this.f41094c.invalidate();
            }
            this.f41094c.setAnimation(nh0Var);
            this.f41096f = z14;
            if (this.f41100k != z11) {
                this.f41100k = z11;
                ?? r12 = this.f41097g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
