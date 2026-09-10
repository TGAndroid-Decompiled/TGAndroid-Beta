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
public final class p0 {
    public kj0 f28330c;
    public boolean d;
    public boolean e;
    public boolean f28331f;
    public FrameLayout f28332g;
    public TLRPC.GroupCallParticipant h;
    public boolean f28335k;
    public final n0 f28333i = new Runnable(this) {
        public final p0 f28286b;

        {
            this.f28286b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f28286b;
                    p0Var.f28329b.R(0, null);
                    hj0 hj0Var = p0Var.f28328a;
                    hj0Var.R(0, null);
                    kj0 kj0Var = p0Var.f28330c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f28286b;
                    hj0 hj0Var2 = p0Var2.f28329b;
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
                    hj0Var2.P(i11);
                    hj0Var2.R(i11 - 1, p0Var2.f28333i);
                    hj0Var2.M(i10);
                    kj0 kj0Var2 = p0Var2.f28330c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        p0Var2.f28330c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f28286b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f28332g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f28286b.c(true);
                    return;
            }
        }
    };
    public final n0 f28334j = new Runnable(this) {
        public final p0 f28286b;

        {
            this.f28286b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f28286b;
                    p0Var.f28329b.R(0, null);
                    hj0 hj0Var = p0Var.f28328a;
                    hj0Var.R(0, null);
                    kj0 kj0Var = p0Var.f28330c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f28286b;
                    hj0 hj0Var2 = p0Var2.f28329b;
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
                    hj0Var2.P(i11);
                    hj0Var2.R(i11 - 1, p0Var2.f28333i);
                    hj0Var2.M(i10);
                    kj0 kj0Var2 = p0Var2.f28330c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        p0Var2.f28330c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f28286b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f28332g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f28286b.c(true);
                    return;
            }
        }
    };
    public final n0 f28336l = new Runnable(this) {
        public final p0 f28286b;

        {
            this.f28286b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f28286b;
                    p0Var.f28329b.R(0, null);
                    hj0 hj0Var = p0Var.f28328a;
                    hj0Var.R(0, null);
                    kj0 kj0Var = p0Var.f28330c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f28286b;
                    hj0 hj0Var2 = p0Var2.f28329b;
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
                    hj0Var2.P(i11);
                    hj0Var2.R(i11 - 1, p0Var2.f28333i);
                    hj0Var2.M(i10);
                    kj0 kj0Var2 = p0Var2.f28330c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        p0Var2.f28330c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f28286b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f28332g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f28286b.c(true);
                    return;
            }
        }
    };
    public final n0 f28337m = new Runnable(this) {
        public final p0 f28286b;

        {
            this.f28286b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f28286b;
                    p0Var.f28329b.R(0, null);
                    hj0 hj0Var = p0Var.f28328a;
                    hj0Var.R(0, null);
                    kj0 kj0Var = p0Var.f28330c;
                    if (kj0Var != null) {
                        kj0Var.setAnimation(hj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f28286b;
                    hj0 hj0Var2 = p0Var2.f28329b;
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
                    hj0Var2.P(i11);
                    hj0Var2.R(i11 - 1, p0Var2.f28333i);
                    hj0Var2.M(i10);
                    kj0 kj0Var2 = p0Var2.f28330c;
                    if (kj0Var2 != null) {
                        kj0Var2.setAnimation(hj0Var2);
                        p0Var2.f28330c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f28286b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f28332g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f28286b.c(true);
                    return;
            }
        }
    };
    public final hj0 f28328a = new hj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final hj0 f28329b = new hj0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.f28336l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f28332g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f28332g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f28336l);
        AndroidUtilities.cancelRunOnUIThread(this.f28334j);
        AndroidUtilities.cancelRunOnUIThread(this.f28337m);
        this.f28328a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        hj0 hj0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f28330c != null && (groupCallParticipant = this.h) != null && (hj0Var = this.f28328a) != null) {
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
                    AndroidUtilities.runOnUIThread(this.f28337m, 5000 - j10);
                }
                P = hj0Var.P(136);
            } else {
                this.f28330c.setAnimation(hj0Var);
                hj0Var.R(0, null);
                if (z13 && this.f28331f) {
                    P = hj0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = hj0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        hj0Var.M(99);
                        hj0Var.P(136);
                    } else if (z13 && this.f28331f && !z14) {
                        hj0Var.M(0);
                        hj0Var.P(36);
                    } else if (z13) {
                        hj0Var.M(69);
                        hj0Var.P(99);
                    } else {
                        hj0Var.M(36);
                        hj0Var.P(69);
                    }
                    this.f28330c.d();
                    this.f28330c.invalidate();
                }
            } else {
                hj0Var.N(hj0Var.f23653f - 1, false, true);
                this.f28330c.invalidate();
            }
            this.f28330c.setAnimation(hj0Var);
            this.f28331f = z14;
            if (this.f28335k != z11) {
                this.f28335k = z11;
                ?? r12 = this.f28332g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
