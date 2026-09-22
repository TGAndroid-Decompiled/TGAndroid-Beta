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
public final class p0 {
    public aj0 f29148c;
    public boolean d;
    public boolean e;
    public boolean f29149f;
    public FrameLayout f29150g;
    public TLRPC.GroupCallParticipant h;
    public boolean f29153k;
    public final n0 f29151i = new Runnable(this) {
        public final p0 f29103b;

        {
            this.f29103b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29103b;
                    p0Var.f29147b.S(0, null);
                    xi0 xi0Var = p0Var.f29146a;
                    xi0Var.S(0, null);
                    aj0 aj0Var = p0Var.f29148c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29103b;
                    xi0 xi0Var2 = p0Var2.f29147b;
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
                    xi0Var2.P(i11);
                    xi0Var2.S(i11 - 1, p0Var2.f29151i);
                    xi0Var2.M(i10);
                    aj0 aj0Var2 = p0Var2.f29148c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        p0Var2.f29148c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29103b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29150g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29103b.c(true);
                    return;
            }
        }
    };
    public final n0 f29152j = new Runnable(this) {
        public final p0 f29103b;

        {
            this.f29103b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29103b;
                    p0Var.f29147b.S(0, null);
                    xi0 xi0Var = p0Var.f29146a;
                    xi0Var.S(0, null);
                    aj0 aj0Var = p0Var.f29148c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29103b;
                    xi0 xi0Var2 = p0Var2.f29147b;
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
                    xi0Var2.P(i11);
                    xi0Var2.S(i11 - 1, p0Var2.f29151i);
                    xi0Var2.M(i10);
                    aj0 aj0Var2 = p0Var2.f29148c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        p0Var2.f29148c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29103b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29150g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29103b.c(true);
                    return;
            }
        }
    };
    public final n0 f29154l = new Runnable(this) {
        public final p0 f29103b;

        {
            this.f29103b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29103b;
                    p0Var.f29147b.S(0, null);
                    xi0 xi0Var = p0Var.f29146a;
                    xi0Var.S(0, null);
                    aj0 aj0Var = p0Var.f29148c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29103b;
                    xi0 xi0Var2 = p0Var2.f29147b;
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
                    xi0Var2.P(i11);
                    xi0Var2.S(i11 - 1, p0Var2.f29151i);
                    xi0Var2.M(i10);
                    aj0 aj0Var2 = p0Var2.f29148c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        p0Var2.f29148c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29103b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29150g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29103b.c(true);
                    return;
            }
        }
    };
    public final n0 f29155m = new Runnable(this) {
        public final p0 f29103b;

        {
            this.f29103b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29103b;
                    p0Var.f29147b.S(0, null);
                    xi0 xi0Var = p0Var.f29146a;
                    xi0Var.S(0, null);
                    aj0 aj0Var = p0Var.f29148c;
                    if (aj0Var != null) {
                        aj0Var.setAnimation(xi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29103b;
                    xi0 xi0Var2 = p0Var2.f29147b;
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
                    xi0Var2.P(i11);
                    xi0Var2.S(i11 - 1, p0Var2.f29151i);
                    xi0Var2.M(i10);
                    aj0 aj0Var2 = p0Var2.f29148c;
                    if (aj0Var2 != null) {
                        aj0Var2.setAnimation(xi0Var2);
                        p0Var2.f29148c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29103b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29150g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29103b.c(true);
                    return;
            }
        }
    };
    public final xi0 f29146a = new xi0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final xi0 f29147b = new xi0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.f29154l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f29150g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f29150g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f29154l);
        AndroidUtilities.cancelRunOnUIThread(this.f29152j);
        AndroidUtilities.cancelRunOnUIThread(this.f29155m);
        this.f29146a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        xi0 xi0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f29148c != null && (groupCallParticipant = this.h) != null && (xi0Var = this.f29146a) != null) {
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
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f29155m, 5000 - j10);
                }
                P = xi0Var.P(136);
            } else {
                this.f29148c.setAnimation(xi0Var);
                xi0Var.S(0, null);
                if (z13 && this.f29149f) {
                    P = xi0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = xi0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        xi0Var.M(99);
                        xi0Var.P(136);
                    } else if (z13 && this.f29149f && !z14) {
                        xi0Var.M(0);
                        xi0Var.P(36);
                    } else if (z13) {
                        xi0Var.M(69);
                        xi0Var.P(99);
                    } else {
                        xi0Var.M(36);
                        xi0Var.P(69);
                    }
                    this.f29148c.d();
                    this.f29148c.invalidate();
                }
            } else {
                xi0Var.N(xi0Var.f29950f - 1, false, true);
                this.f29148c.invalidate();
            }
            this.f29148c.setAnimation(xi0Var);
            this.f29149f = z14;
            if (this.f29153k != z11) {
                this.f29153k = z11;
                ?? r12 = this.f29150g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
