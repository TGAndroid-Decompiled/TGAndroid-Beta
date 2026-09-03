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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
public final class o0 {
    public kj0 f32223c;
    public boolean d;
    public boolean f32224e;
    public boolean f32225f;
    public FrameLayout f32226g;
    public TLRPC.GroupCallParticipant h;
    public boolean f32229k;
    public final m0 f32227i = new Runnable(this) {
        public final o0 f32193b;

        {
            this.f32193b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32193b;
                    o0Var.f32222b.P(0, null);
                    hj0 hj0Var = o0Var.f32221a;
                    hj0Var.P(0, null);
                    kj0 kj0Var = o0Var.f32223c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32193b;
                    hj0 hj0Var2 = o0Var2.f32222b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt < 64) {
                            i11 = 240;
                            i10 = 120;
                        } else {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt == 98) {
                                    i11 = 540;
                                    i10 = 420;
                                } else {
                                    i11 = 720;
                                }
                            }
                        }
                    }
                    hj0Var2.N(i11);
                    hj0Var2.P(i11 - 1, o0Var2.f32227i);
                    hj0Var2.K(i10);
                    kj0 kj0Var2 = o0Var2.f32223c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        o0Var2.f32223c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32193b;
                    o0Var3.f32224e = false;
                    ?? r22 = o0Var3.f32226g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32193b.c(true);
                    return;
            }
        }
    };
    public final m0 f32228j = new Runnable(this) {
        public final o0 f32193b;

        {
            this.f32193b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32193b;
                    o0Var.f32222b.P(0, null);
                    hj0 hj0Var = o0Var.f32221a;
                    hj0Var.P(0, null);
                    kj0 kj0Var = o0Var.f32223c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32193b;
                    hj0 hj0Var2 = o0Var2.f32222b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt < 64) {
                            i11 = 240;
                            i10 = 120;
                        } else {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt == 98) {
                                    i11 = 540;
                                    i10 = 420;
                                } else {
                                    i11 = 720;
                                }
                            }
                        }
                    }
                    hj0Var2.N(i11);
                    hj0Var2.P(i11 - 1, o0Var2.f32227i);
                    hj0Var2.K(i10);
                    kj0 kj0Var2 = o0Var2.f32223c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        o0Var2.f32223c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32193b;
                    o0Var3.f32224e = false;
                    ?? r22 = o0Var3.f32226g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32193b.c(true);
                    return;
            }
        }
    };
    public final m0 f32230l = new Runnable(this) {
        public final o0 f32193b;

        {
            this.f32193b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32193b;
                    o0Var.f32222b.P(0, null);
                    hj0 hj0Var = o0Var.f32221a;
                    hj0Var.P(0, null);
                    kj0 kj0Var = o0Var.f32223c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32193b;
                    hj0 hj0Var2 = o0Var2.f32222b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt < 64) {
                            i11 = 240;
                            i10 = 120;
                        } else {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt == 98) {
                                    i11 = 540;
                                    i10 = 420;
                                } else {
                                    i11 = 720;
                                }
                            }
                        }
                    }
                    hj0Var2.N(i11);
                    hj0Var2.P(i11 - 1, o0Var2.f32227i);
                    hj0Var2.K(i10);
                    kj0 kj0Var2 = o0Var2.f32223c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        o0Var2.f32223c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32193b;
                    o0Var3.f32224e = false;
                    ?? r22 = o0Var3.f32226g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32193b.c(true);
                    return;
            }
        }
    };
    public final m0 f32231m = new Runnable(this) {
        public final o0 f32193b;

        {
            this.f32193b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32193b;
                    o0Var.f32222b.P(0, null);
                    hj0 hj0Var = o0Var.f32221a;
                    hj0Var.P(0, null);
                    kj0 kj0Var = o0Var.f32223c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32193b;
                    hj0 hj0Var2 = o0Var2.f32222b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i11 = 120;
                    if (nextInt < 32) {
                        i10 = 0;
                    } else {
                        i10 = 240;
                        if (nextInt < 64) {
                            i11 = 240;
                            i10 = 120;
                        } else {
                            i11 = 420;
                            if (nextInt >= 97) {
                                i10 = 540;
                                if (nextInt == 98) {
                                    i11 = 540;
                                    i10 = 420;
                                } else {
                                    i11 = 720;
                                }
                            }
                        }
                    }
                    hj0Var2.N(i11);
                    hj0Var2.P(i11 - 1, o0Var2.f32227i);
                    hj0Var2.K(i10);
                    kj0 kj0Var2 = o0Var2.f32223c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        o0Var2.f32223c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32193b;
                    o0Var3.f32224e = false;
                    ?? r22 = o0Var3.f32226g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32193b.c(true);
                    return;
            }
        }
    };
    public final hj0 f32221a = new hj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final hj0 f32222b = new hj0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z4 = this.d;
            m0 m0Var = this.f32230l;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
            }
            if (!this.f32224e) {
                this.f32224e = true;
                ?? r42 = this.f32226g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f32226g = null;
        this.f32224e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f32230l);
        AndroidUtilities.cancelRunOnUIThread(this.f32228j);
        AndroidUtilities.cancelRunOnUIThread(this.f32231m);
        this.f32221a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z4) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        hj0 hj0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean N;
        boolean z14;
        if (this.f32223c != null && (groupCallParticipant = this.h) != null && (hj0Var = this.f32221a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f32224e && z11)) && !z10) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f32224e && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f32224e) || z10) && ((!(z14 = groupCallParticipant3.can_self_unmute) || z10) && !z14 && groupCallParticipant3.raise_hand_rating != 0)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j10 = this.h.lastRaiseHandDate;
                long j11 = elapsedRealtime2 - j10;
                if (j10 != 0 && j11 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f32231m, 5000 - j11);
                }
                N = hj0Var.N(136);
            } else {
                this.f32223c.setAnimation(hj0Var);
                hj0Var.P(0, null);
                if (z12 && this.f32225f) {
                    N = hj0Var.N(36);
                } else {
                    if (z12) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    N = hj0Var.N(i10);
                }
            }
            if (z4) {
                if (N) {
                    if (z13) {
                        hj0Var.K(99);
                        hj0Var.N(136);
                    } else if (z12 && this.f32225f && !z13) {
                        hj0Var.K(0);
                        hj0Var.N(36);
                    } else if (z12) {
                        hj0Var.K(69);
                        hj0Var.N(99);
                    } else {
                        hj0Var.K(36);
                        hj0Var.N(69);
                    }
                    this.f32223c.d();
                    this.f32223c.invalidate();
                }
            } else {
                hj0Var.L(hj0Var.f27526f - 1, false, true);
                this.f32223c.invalidate();
            }
            this.f32223c.setAnimation(hj0Var);
            this.f32225f = z13;
            if (this.f32229k != z10) {
                this.f32229k = z10;
                ?? r12 = this.f32226g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
