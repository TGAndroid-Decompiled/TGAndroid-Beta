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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
public final class n0 {
    public final gj0 f29786a;
    public final gj0 f29787b;
    public jj0 f29788c;
    public boolean d;
    public boolean e;
    public boolean f29789f;
    public FrameLayout f29790g;
    public TLRPC.GroupCallParticipant h;
    public boolean f29793k;
    public final l0 f29791i = new Runnable(this) {
        public final n0 f29760b;

        {
            this.f29760b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f29760b;
                    n0Var.f29787b.P(0, null);
                    gj0 gj0Var = n0Var.f29786a;
                    gj0Var.P(0, null);
                    jj0 jj0Var = n0Var.f29788c;
                    if (jj0Var != null) {
                        jj0Var.setAnimation(gj0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f29760b;
                    gj0 gj0Var2 = n0Var2.f29787b;
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
                    gj0Var2.N(i11);
                    gj0Var2.P(i11 - 1, n0Var2.f29791i);
                    gj0Var2.K(i10);
                    jj0 jj0Var2 = n0Var2.f29788c;
                    if (jj0Var2 != null) {
                        jj0Var2.setAnimation(gj0Var2);
                        n0Var2.f29788c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f29760b;
                    n0Var3.e = false;
                    ?? r22 = n0Var3.f29790g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f29760b.c(true);
                    return;
            }
        }
    };
    public final l0 f29792j = new Runnable(this) {
        public final n0 f29760b;

        {
            this.f29760b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f29760b;
                    n0Var.f29787b.P(0, null);
                    gj0 gj0Var = n0Var.f29786a;
                    gj0Var.P(0, null);
                    jj0 jj0Var = n0Var.f29788c;
                    if (jj0Var != null) {
                        jj0Var.setAnimation(gj0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f29760b;
                    gj0 gj0Var2 = n0Var2.f29787b;
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
                    gj0Var2.N(i11);
                    gj0Var2.P(i11 - 1, n0Var2.f29791i);
                    gj0Var2.K(i10);
                    jj0 jj0Var2 = n0Var2.f29788c;
                    if (jj0Var2 != null) {
                        jj0Var2.setAnimation(gj0Var2);
                        n0Var2.f29788c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f29760b;
                    n0Var3.e = false;
                    ?? r22 = n0Var3.f29790g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f29760b.c(true);
                    return;
            }
        }
    };
    public final l0 f29794l = new Runnable(this) {
        public final n0 f29760b;

        {
            this.f29760b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f29760b;
                    n0Var.f29787b.P(0, null);
                    gj0 gj0Var = n0Var.f29786a;
                    gj0Var.P(0, null);
                    jj0 jj0Var = n0Var.f29788c;
                    if (jj0Var != null) {
                        jj0Var.setAnimation(gj0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f29760b;
                    gj0 gj0Var2 = n0Var2.f29787b;
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
                    gj0Var2.N(i11);
                    gj0Var2.P(i11 - 1, n0Var2.f29791i);
                    gj0Var2.K(i10);
                    jj0 jj0Var2 = n0Var2.f29788c;
                    if (jj0Var2 != null) {
                        jj0Var2.setAnimation(gj0Var2);
                        n0Var2.f29788c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f29760b;
                    n0Var3.e = false;
                    ?? r22 = n0Var3.f29790g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f29760b.c(true);
                    return;
            }
        }
    };
    public final l0 f29795m = new Runnable(this) {
        public final n0 f29760b;

        {
            this.f29760b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f29760b;
                    n0Var.f29787b.P(0, null);
                    gj0 gj0Var = n0Var.f29786a;
                    gj0Var.P(0, null);
                    jj0 jj0Var = n0Var.f29788c;
                    if (jj0Var != null) {
                        jj0Var.setAnimation(gj0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f29760b;
                    gj0 gj0Var2 = n0Var2.f29787b;
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
                    gj0Var2.N(i11);
                    gj0Var2.P(i11 - 1, n0Var2.f29791i);
                    gj0Var2.K(i10);
                    jj0 jj0Var2 = n0Var2.f29788c;
                    if (jj0Var2 != null) {
                        jj0Var2.setAnimation(gj0Var2);
                        n0Var2.f29788c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f29760b;
                    n0Var3.e = false;
                    ?? r22 = n0Var3.f29790g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f29760b.c(true);
                    return;
            }
        }
    };

    public n0() {
        int i10 = R.raw.voice_mini;
        this.f29786a = new gj0(i10, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        int i11 = R.raw.hand_2;
        this.f29787b = new gj0(i11, "" + R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    }

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z4 = this.d;
            l0 l0Var = this.f29794l;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(l0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f29790g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(l0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f29790g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f29794l);
        AndroidUtilities.cancelRunOnUIThread(this.f29792j);
        AndroidUtilities.cancelRunOnUIThread(this.f29795m);
        this.f29786a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z4) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        gj0 gj0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean N;
        boolean z14;
        if (this.f29788c != null && (groupCallParticipant = this.h) != null && (gj0Var = this.f29786a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.e && z11)) && !z10) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.e && z11))) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.e) || z10) && ((!(z14 = groupCallParticipant3.can_self_unmute) || z10) && !z14 && groupCallParticipant3.raise_hand_rating != 0)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j10 = this.h.lastRaiseHandDate;
                long j11 = elapsedRealtime2 - j10;
                if (j10 != 0 && j11 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f29795m, 5000 - j11);
                }
                N = gj0Var.N(136);
            } else {
                this.f29788c.setAnimation(gj0Var);
                gj0Var.P(0, null);
                if (z12 && this.f29789f) {
                    N = gj0Var.N(36);
                } else {
                    if (z12) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    N = gj0Var.N(i10);
                }
            }
            if (z4) {
                if (N) {
                    if (z13) {
                        gj0Var.K(99);
                        gj0Var.N(136);
                    } else if (z12 && this.f29789f && !z13) {
                        gj0Var.K(0);
                        gj0Var.N(36);
                    } else if (z12) {
                        gj0Var.K(69);
                        gj0Var.N(99);
                    } else {
                        gj0Var.K(36);
                        gj0Var.N(69);
                    }
                    this.f29788c.d();
                    this.f29788c.invalidate();
                }
            } else {
                gj0Var.L(gj0Var.f25154f - 1, false, true);
                this.f29788c.invalidate();
            }
            this.f29788c.setAnimation(gj0Var);
            this.f29789f = z13;
            if (this.f29793k != z10) {
                this.f29793k = z10;
                ?? r12 = this.f29790g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
