package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
public final class n0 {
    public ph0 f41062c;
    public boolean d;
    public boolean f41063e;
    public boolean f41064f;
    public FrameLayout f41065g;
    public TLRPC.GroupCallParticipant h;
    public boolean f41068k;
    public final l0 f41066i = new Runnable(this) {
        public final n0 f41017b;

        {
            this.f41017b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41017b;
                    n0Var.f41061b.S(0, null);
                    mh0 mh0Var = n0Var.f41060a;
                    mh0Var.S(0, null);
                    ph0 ph0Var = n0Var.f41062c;
                    if (ph0Var != null) {
                        ph0Var.setAnimation(mh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41017b;
                    mh0 mh0Var2 = n0Var2.f41061b;
                    int nextInt = Utilities.f22777b.nextInt(100);
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
                    mh0Var2.P(i10);
                    mh0Var2.S(i10 - 1, n0Var2.f41066i);
                    mh0Var2.M(i7);
                    ph0 ph0Var2 = n0Var2.f41062c;
                    if (ph0Var2 != null) {
                        ph0Var2.setAnimation(mh0Var2);
                        n0Var2.f41062c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41017b;
                    n0Var3.f41063e = false;
                    ?? r22 = n0Var3.f41065g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41017b.c(true);
                    return;
            }
        }
    };
    public final l0 f41067j = new Runnable(this) {
        public final n0 f41017b;

        {
            this.f41017b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41017b;
                    n0Var.f41061b.S(0, null);
                    mh0 mh0Var = n0Var.f41060a;
                    mh0Var.S(0, null);
                    ph0 ph0Var = n0Var.f41062c;
                    if (ph0Var != null) {
                        ph0Var.setAnimation(mh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41017b;
                    mh0 mh0Var2 = n0Var2.f41061b;
                    int nextInt = Utilities.f22777b.nextInt(100);
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
                    mh0Var2.P(i10);
                    mh0Var2.S(i10 - 1, n0Var2.f41066i);
                    mh0Var2.M(i7);
                    ph0 ph0Var2 = n0Var2.f41062c;
                    if (ph0Var2 != null) {
                        ph0Var2.setAnimation(mh0Var2);
                        n0Var2.f41062c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41017b;
                    n0Var3.f41063e = false;
                    ?? r22 = n0Var3.f41065g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41017b.c(true);
                    return;
            }
        }
    };
    public final l0 f41069l = new Runnable(this) {
        public final n0 f41017b;

        {
            this.f41017b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41017b;
                    n0Var.f41061b.S(0, null);
                    mh0 mh0Var = n0Var.f41060a;
                    mh0Var.S(0, null);
                    ph0 ph0Var = n0Var.f41062c;
                    if (ph0Var != null) {
                        ph0Var.setAnimation(mh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41017b;
                    mh0 mh0Var2 = n0Var2.f41061b;
                    int nextInt = Utilities.f22777b.nextInt(100);
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
                    mh0Var2.P(i10);
                    mh0Var2.S(i10 - 1, n0Var2.f41066i);
                    mh0Var2.M(i7);
                    ph0 ph0Var2 = n0Var2.f41062c;
                    if (ph0Var2 != null) {
                        ph0Var2.setAnimation(mh0Var2);
                        n0Var2.f41062c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41017b;
                    n0Var3.f41063e = false;
                    ?? r22 = n0Var3.f41065g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41017b.c(true);
                    return;
            }
        }
    };
    public final l0 f41070m = new Runnable(this) {
        public final n0 f41017b;

        {
            this.f41017b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f41017b;
                    n0Var.f41061b.S(0, null);
                    mh0 mh0Var = n0Var.f41060a;
                    mh0Var.S(0, null);
                    ph0 ph0Var = n0Var.f41062c;
                    if (ph0Var != null) {
                        ph0Var.setAnimation(mh0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f41017b;
                    mh0 mh0Var2 = n0Var2.f41061b;
                    int nextInt = Utilities.f22777b.nextInt(100);
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
                    mh0Var2.P(i10);
                    mh0Var2.S(i10 - 1, n0Var2.f41066i);
                    mh0Var2.M(i7);
                    ph0 ph0Var2 = n0Var2.f41062c;
                    if (ph0Var2 != null) {
                        ph0Var2.setAnimation(mh0Var2);
                        n0Var2.f41062c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f41017b;
                    n0Var3.f41063e = false;
                    ?? r22 = n0Var3.f41065g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f41017b.c(true);
                    return;
            }
        }
    };
    public final mh0 f41060a = new mh0(2131624332, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final mh0 f41061b = new mh0(2131624045, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            l0 l0Var = this.f41069l;
            if (z10) {
                org.telegram.messenger.g0.r(l0Var);
            }
            if (!this.f41063e) {
                this.f41063e = true;
                ?? r42 = this.f41065g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.h3(l0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f41065g = null;
        this.f41063e = false;
        org.telegram.messenger.g0.r(this.f41069l);
        org.telegram.messenger.g0.r(this.f41067j);
        org.telegram.messenger.g0.r(this.f41070m);
        this.f41060a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        mh0 mh0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        boolean P;
        boolean z15;
        if (this.f41062c != null && (groupCallParticipant = this.h) != null && (mh0Var = this.f41060a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f41063e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f41063e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f41063e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    org.telegram.messenger.g0.h3(this.f41070m, 5000 - j10);
                }
                P = mh0Var.P(136);
            } else {
                this.f41062c.setAnimation(mh0Var);
                mh0Var.S(0, null);
                if (z13 && this.f41064f) {
                    P = mh0Var.P(36);
                } else {
                    if (z13) {
                        i7 = 99;
                    } else {
                        i7 = 69;
                    }
                    P = mh0Var.P(i7);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        mh0Var.M(99);
                        mh0Var.P(136);
                    } else if (z13 && this.f41064f && !z14) {
                        mh0Var.M(0);
                        mh0Var.P(36);
                    } else if (z13) {
                        mh0Var.M(69);
                        mh0Var.P(99);
                    } else {
                        mh0Var.M(36);
                        mh0Var.P(69);
                    }
                    this.f41062c.d();
                    this.f41062c.invalidate();
                }
            } else {
                mh0Var.N(mh0Var.f37488f - 1, false, true);
                this.f41062c.invalidate();
            }
            this.f41062c.setAnimation(mh0Var);
            this.f41064f = z14;
            if (this.f41068k != z11) {
                this.f41068k = z11;
                ?? r12 = this.f41065g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
