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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
public final class o0 {
    public final ij0 f32216a;
    public final ij0 f32217b;
    public lj0 f32218c;
    public boolean d;
    public boolean f32219e;
    public boolean f32220f;
    public FrameLayout f32221g;
    public TLRPC.GroupCallParticipant h;
    public boolean f32224k;
    public final m0 f32222i = new Runnable(this) {
        public final o0 f32188b;

        {
            this.f32188b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32188b;
                    o0Var.f32217b.P(0, null);
                    ij0 ij0Var = o0Var.f32216a;
                    ij0Var.P(0, null);
                    lj0 lj0Var = o0Var.f32218c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32188b;
                    ij0 ij0Var2 = o0Var2.f32217b;
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
                    ij0Var2.N(i11);
                    ij0Var2.P(i11 - 1, o0Var2.f32222i);
                    ij0Var2.K(i10);
                    lj0 lj0Var2 = o0Var2.f32218c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        o0Var2.f32218c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32188b;
                    o0Var3.f32219e = false;
                    ?? r22 = o0Var3.f32221g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32188b.c(true);
                    return;
            }
        }
    };
    public final m0 f32223j = new Runnable(this) {
        public final o0 f32188b;

        {
            this.f32188b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32188b;
                    o0Var.f32217b.P(0, null);
                    ij0 ij0Var = o0Var.f32216a;
                    ij0Var.P(0, null);
                    lj0 lj0Var = o0Var.f32218c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32188b;
                    ij0 ij0Var2 = o0Var2.f32217b;
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
                    ij0Var2.N(i11);
                    ij0Var2.P(i11 - 1, o0Var2.f32222i);
                    ij0Var2.K(i10);
                    lj0 lj0Var2 = o0Var2.f32218c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        o0Var2.f32218c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32188b;
                    o0Var3.f32219e = false;
                    ?? r22 = o0Var3.f32221g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32188b.c(true);
                    return;
            }
        }
    };
    public final m0 f32225l = new Runnable(this) {
        public final o0 f32188b;

        {
            this.f32188b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32188b;
                    o0Var.f32217b.P(0, null);
                    ij0 ij0Var = o0Var.f32216a;
                    ij0Var.P(0, null);
                    lj0 lj0Var = o0Var.f32218c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32188b;
                    ij0 ij0Var2 = o0Var2.f32217b;
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
                    ij0Var2.N(i11);
                    ij0Var2.P(i11 - 1, o0Var2.f32222i);
                    ij0Var2.K(i10);
                    lj0 lj0Var2 = o0Var2.f32218c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        o0Var2.f32218c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32188b;
                    o0Var3.f32219e = false;
                    ?? r22 = o0Var3.f32221g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32188b.c(true);
                    return;
            }
        }
    };
    public final m0 f32226m = new Runnable(this) {
        public final o0 f32188b;

        {
            this.f32188b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f32188b;
                    o0Var.f32217b.P(0, null);
                    ij0 ij0Var = o0Var.f32216a;
                    ij0Var.P(0, null);
                    lj0 lj0Var = o0Var.f32218c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f32188b;
                    ij0 ij0Var2 = o0Var2.f32217b;
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
                    ij0Var2.N(i11);
                    ij0Var2.P(i11 - 1, o0Var2.f32222i);
                    ij0Var2.K(i10);
                    lj0 lj0Var2 = o0Var2.f32218c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        o0Var2.f32218c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f32188b;
                    o0Var3.f32219e = false;
                    ?? r22 = o0Var3.f32221g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f32188b.c(true);
                    return;
            }
        }
    };

    public o0() {
        int i10 = R.raw.voice_mini;
        this.f32216a = new ij0(i10, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        int i11 = R.raw.hand_2;
        this.f32217b = new ij0(i11, "" + R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    }

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z4 = this.d;
            m0 m0Var = this.f32225l;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
            }
            if (!this.f32219e) {
                this.f32219e = true;
                ?? r42 = this.f32221g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f32221g = null;
        this.f32219e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f32225l);
        AndroidUtilities.cancelRunOnUIThread(this.f32223j);
        AndroidUtilities.cancelRunOnUIThread(this.f32226m);
        this.f32216a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z4) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ij0 ij0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean N;
        boolean z14;
        if (this.f32218c != null && (groupCallParticipant = this.h) != null && (ij0Var = this.f32216a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f32219e && z11)) && !z10) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f32219e && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f32219e) || z10) && ((!(z14 = groupCallParticipant3.can_self_unmute) || z10) && !z14 && groupCallParticipant3.raise_hand_rating != 0)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j10 = this.h.lastRaiseHandDate;
                long j11 = elapsedRealtime2 - j10;
                if (j10 != 0 && j11 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f32226m, 5000 - j11);
                }
                N = ij0Var.N(136);
            } else {
                this.f32218c.setAnimation(ij0Var);
                ij0Var.P(0, null);
                if (z12 && this.f32220f) {
                    N = ij0Var.N(36);
                } else {
                    if (z12) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    N = ij0Var.N(i10);
                }
            }
            if (z4) {
                if (N) {
                    if (z13) {
                        ij0Var.K(99);
                        ij0Var.N(136);
                    } else if (z12 && this.f32220f && !z13) {
                        ij0Var.K(0);
                        ij0Var.N(36);
                    } else if (z12) {
                        ij0Var.K(69);
                        ij0Var.N(99);
                    } else {
                        ij0Var.K(36);
                        ij0Var.N(69);
                    }
                    this.f32218c.d();
                    this.f32218c.invalidate();
                }
            } else {
                ij0Var.L(ij0Var.f27819f - 1, false, true);
                this.f32218c.invalidate();
            }
            this.f32218c.setAnimation(ij0Var);
            this.f32220f = z13;
            if (this.f32224k != z10) {
                this.f32224k = z10;
                ?? r12 = this.f32221g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
