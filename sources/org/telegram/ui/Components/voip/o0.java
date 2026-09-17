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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.xi0;
public final class o0 {
    public aj0 f31717c;
    public boolean d;
    public boolean f31718e;
    public boolean f31719f;
    public FrameLayout f31720g;
    public TLRPC.GroupCallParticipant h;
    public boolean f31723k;
    public final m0 f31721i = new Runnable(this) {
        public final o0 f31671b;

        {
            this.f31671b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31671b;
                    o0Var.f31716b.P(0, null);
                    xi0 xi0Var = o0Var.f31715a;
                    xi0Var.P(0, null);
                    aj0 aj0Var = o0Var.f31717c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31671b;
                    xi0 xi0Var2 = o0Var2.f31716b;
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
                    xi0Var2.N(i11);
                    xi0Var2.P(i11 - 1, o0Var2.f31721i);
                    xi0Var2.K(i10);
                    aj0 aj0Var2 = o0Var2.f31717c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        o0Var2.f31717c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31671b;
                    o0Var3.f31718e = false;
                    ?? r22 = o0Var3.f31720g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31671b.c(true);
                    return;
            }
        }
    };
    public final m0 f31722j = new Runnable(this) {
        public final o0 f31671b;

        {
            this.f31671b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31671b;
                    o0Var.f31716b.P(0, null);
                    xi0 xi0Var = o0Var.f31715a;
                    xi0Var.P(0, null);
                    aj0 aj0Var = o0Var.f31717c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31671b;
                    xi0 xi0Var2 = o0Var2.f31716b;
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
                    xi0Var2.N(i11);
                    xi0Var2.P(i11 - 1, o0Var2.f31721i);
                    xi0Var2.K(i10);
                    aj0 aj0Var2 = o0Var2.f31717c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        o0Var2.f31717c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31671b;
                    o0Var3.f31718e = false;
                    ?? r22 = o0Var3.f31720g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31671b.c(true);
                    return;
            }
        }
    };
    public final m0 f31724l = new Runnable(this) {
        public final o0 f31671b;

        {
            this.f31671b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31671b;
                    o0Var.f31716b.P(0, null);
                    xi0 xi0Var = o0Var.f31715a;
                    xi0Var.P(0, null);
                    aj0 aj0Var = o0Var.f31717c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31671b;
                    xi0 xi0Var2 = o0Var2.f31716b;
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
                    xi0Var2.N(i11);
                    xi0Var2.P(i11 - 1, o0Var2.f31721i);
                    xi0Var2.K(i10);
                    aj0 aj0Var2 = o0Var2.f31717c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        o0Var2.f31717c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31671b;
                    o0Var3.f31718e = false;
                    ?? r22 = o0Var3.f31720g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31671b.c(true);
                    return;
            }
        }
    };
    public final m0 f31725m = new Runnable(this) {
        public final o0 f31671b;

        {
            this.f31671b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31671b;
                    o0Var.f31716b.P(0, null);
                    xi0 xi0Var = o0Var.f31715a;
                    xi0Var.P(0, null);
                    aj0 aj0Var = o0Var.f31717c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31671b;
                    xi0 xi0Var2 = o0Var2.f31716b;
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
                    xi0Var2.N(i11);
                    xi0Var2.P(i11 - 1, o0Var2.f31721i);
                    xi0Var2.K(i10);
                    aj0 aj0Var2 = o0Var2.f31717c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        o0Var2.f31717c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31671b;
                    o0Var3.f31718e = false;
                    ?? r22 = o0Var3.f31720g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31671b.c(true);
                    return;
            }
        }
    };
    public final xi0 f31715a = new xi0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final xi0 f31716b = new xi0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            m0 m0Var = this.f31724l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
            }
            if (!this.f31718e) {
                this.f31718e = true;
                ?? r42 = this.f31720g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f31720g = null;
        this.f31718e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f31724l);
        AndroidUtilities.cancelRunOnUIThread(this.f31722j);
        AndroidUtilities.cancelRunOnUIThread(this.f31725m);
        this.f31715a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        xi0 xi0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean N;
        boolean z15;
        if (this.f31717c != null && (groupCallParticipant = this.h) != null && (xi0Var = this.f31715a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f31718e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f31718e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f31718e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f31725m, 5000 - j10);
                }
                N = xi0Var.N(136);
            } else {
                this.f31717c.setAnimation(xi0Var);
                xi0Var.P(0, null);
                if (z13 && this.f31719f) {
                    N = xi0Var.N(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    N = xi0Var.N(i10);
                }
            }
            if (z10) {
                if (N) {
                    if (z14) {
                        xi0Var.K(99);
                        xi0Var.N(136);
                    } else if (z13 && this.f31719f && !z14) {
                        xi0Var.K(0);
                        xi0Var.N(36);
                    } else if (z13) {
                        xi0Var.K(69);
                        xi0Var.N(99);
                    } else {
                        xi0Var.K(36);
                        xi0Var.N(69);
                    }
                    this.f31717c.d();
                    this.f31717c.invalidate();
                }
            } else {
                xi0Var.L(xi0Var.f32587f - 1, false, true);
                this.f31717c.invalidate();
            }
            this.f31717c.setAnimation(xi0Var);
            this.f31719f = z14;
            if (this.f31723k != z11) {
                this.f31723k = z11;
                ?? r12 = this.f31720g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
