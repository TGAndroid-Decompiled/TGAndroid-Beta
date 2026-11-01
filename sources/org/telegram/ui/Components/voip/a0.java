package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;
public final class a0 {
    public fi0 f31365c;
    public boolean d;
    public boolean e;
    public boolean f31366f;
    public FrameLayout f31367g;
    public TLRPC.GroupCallParticipant h;
    public boolean f31370k;
    public final y f31368i = new Runnable(this) {
        public final a0 f31832b;

        {
            this.f31832b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f31832b;
                    a0Var.f31364b.S(0, null);
                    ci0 ci0Var = a0Var.f31363a;
                    ci0Var.S(0, null);
                    fi0 fi0Var = a0Var.f31365c;
                    if (fi0Var != null) {
                        fi0Var.setAnimation(ci0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f31832b;
                    ci0 ci0Var2 = a0Var2.f31364b;
                    int nextInt = Utilities.f14520b.nextInt(100);
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
                    ci0Var2.P(i11);
                    ci0Var2.S(i11 - 1, a0Var2.f31368i);
                    ci0Var2.M(i10);
                    fi0 fi0Var2 = a0Var2.f31365c;
                    if (fi0Var2 != null) {
                        fi0Var2.setAnimation(ci0Var2);
                        a0Var2.f31365c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f31832b;
                    a0Var3.e = false;
                    ?? r22 = a0Var3.f31367g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f31832b.c(true);
                    return;
            }
        }
    };
    public final y f31369j = new Runnable(this) {
        public final a0 f31832b;

        {
            this.f31832b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f31832b;
                    a0Var.f31364b.S(0, null);
                    ci0 ci0Var = a0Var.f31363a;
                    ci0Var.S(0, null);
                    fi0 fi0Var = a0Var.f31365c;
                    if (fi0Var != null) {
                        fi0Var.setAnimation(ci0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f31832b;
                    ci0 ci0Var2 = a0Var2.f31364b;
                    int nextInt = Utilities.f14520b.nextInt(100);
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
                    ci0Var2.P(i11);
                    ci0Var2.S(i11 - 1, a0Var2.f31368i);
                    ci0Var2.M(i10);
                    fi0 fi0Var2 = a0Var2.f31365c;
                    if (fi0Var2 != null) {
                        fi0Var2.setAnimation(ci0Var2);
                        a0Var2.f31365c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f31832b;
                    a0Var3.e = false;
                    ?? r22 = a0Var3.f31367g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f31832b.c(true);
                    return;
            }
        }
    };
    public final y f31371l = new Runnable(this) {
        public final a0 f31832b;

        {
            this.f31832b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f31832b;
                    a0Var.f31364b.S(0, null);
                    ci0 ci0Var = a0Var.f31363a;
                    ci0Var.S(0, null);
                    fi0 fi0Var = a0Var.f31365c;
                    if (fi0Var != null) {
                        fi0Var.setAnimation(ci0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f31832b;
                    ci0 ci0Var2 = a0Var2.f31364b;
                    int nextInt = Utilities.f14520b.nextInt(100);
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
                    ci0Var2.P(i11);
                    ci0Var2.S(i11 - 1, a0Var2.f31368i);
                    ci0Var2.M(i10);
                    fi0 fi0Var2 = a0Var2.f31365c;
                    if (fi0Var2 != null) {
                        fi0Var2.setAnimation(ci0Var2);
                        a0Var2.f31365c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f31832b;
                    a0Var3.e = false;
                    ?? r22 = a0Var3.f31367g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f31832b.c(true);
                    return;
            }
        }
    };
    public final y f31372m = new Runnable(this) {
        public final a0 f31832b;

        {
            this.f31832b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f31832b;
                    a0Var.f31364b.S(0, null);
                    ci0 ci0Var = a0Var.f31363a;
                    ci0Var.S(0, null);
                    fi0 fi0Var = a0Var.f31365c;
                    if (fi0Var != null) {
                        fi0Var.setAnimation(ci0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f31832b;
                    ci0 ci0Var2 = a0Var2.f31364b;
                    int nextInt = Utilities.f14520b.nextInt(100);
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
                    ci0Var2.P(i11);
                    ci0Var2.S(i11 - 1, a0Var2.f31368i);
                    ci0Var2.M(i10);
                    fi0 fi0Var2 = a0Var2.f31365c;
                    if (fi0Var2 != null) {
                        fi0Var2.setAnimation(ci0Var2);
                        a0Var2.f31365c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f31832b;
                    a0Var3.e = false;
                    ?? r22 = a0Var3.f31367g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f31832b.c(true);
                    return;
            }
        }
    };
    public final ci0 f31363a = new ci0(2131624329, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
    public final ci0 f31364b = new ci0(2131624043, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            y yVar = this.f31371l;
            if (z10) {
                org.telegram.messenger.i0.r(yVar);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f31367g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.i0.h3(yVar, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f31367g = null;
        this.e = false;
        org.telegram.messenger.i0.r(this.f31371l);
        org.telegram.messenger.i0.r(this.f31369j);
        org.telegram.messenger.i0.r(this.f31372m);
        this.f31363a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ci0 ci0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f31365c != null && (groupCallParticipant = this.h) != null && (ci0Var = this.f31363a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j10 = this.h.lastRaiseHandDate;
                long j11 = elapsedRealtime2 - j10;
                if (j10 != 0 && j11 <= 5000) {
                    org.telegram.messenger.i0.h3(this.f31372m, 5000 - j11);
                }
                P = ci0Var.P(136);
            } else {
                this.f31365c.setAnimation(ci0Var);
                ci0Var.S(0, null);
                if (z13 && this.f31366f) {
                    P = ci0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = ci0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        ci0Var.M(99);
                        ci0Var.P(136);
                    } else if (z13 && this.f31366f && !z14) {
                        ci0Var.M(0);
                        ci0Var.P(36);
                    } else if (z13) {
                        ci0Var.M(69);
                        ci0Var.P(99);
                    } else {
                        ci0Var.M(36);
                        ci0Var.P(69);
                    }
                    this.f31365c.d();
                    this.f31365c.invalidate();
                }
            } else {
                ci0Var.N(ci0Var.f25138f - 1, false, true);
                this.f31365c.invalidate();
            }
            this.f31365c.setAnimation(ci0Var);
            this.f31366f = z14;
            if (this.f31370k != z11) {
                this.f31370k = z11;
                ?? r12 = this.f31367g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
