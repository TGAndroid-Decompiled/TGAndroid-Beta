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
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
public final class n0 {
    public final mi0 f33675a;
    public final mi0 f33676b;
    public pi0 f33677c;
    public boolean d;
    public boolean f33678e;
    public boolean f33679f;
    public FrameLayout f33680g;
    public TLRPC.GroupCallParticipant h;
    public boolean f33683k;
    public final l0 f33681i = new Runnable(this) {
        public final n0 f33648b;

        {
            this.f33648b = this;
        }

        @Override
        public final void run() {
            int i9;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f33648b;
                    n0Var.f33676b.P(0, null);
                    mi0 mi0Var = n0Var.f33675a;
                    mi0Var.P(0, null);
                    pi0 pi0Var = n0Var.f33677c;
                    if (pi0Var != null) {
                        pi0Var.setAnimation(mi0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f33648b;
                    mi0 mi0Var2 = n0Var2.f33676b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i9 = 0;
                    } else {
                        i9 = 240;
                        if (nextInt < 64) {
                            i10 = 240;
                            i9 = 120;
                        } else {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i9 = 540;
                                if (nextInt == 98) {
                                    i10 = 540;
                                    i9 = 420;
                                } else {
                                    i10 = 720;
                                }
                            }
                        }
                    }
                    mi0Var2.N(i10);
                    mi0Var2.P(i10 - 1, n0Var2.f33681i);
                    mi0Var2.K(i9);
                    pi0 pi0Var2 = n0Var2.f33677c;
                    if (pi0Var2 != null) {
                        pi0Var2.setAnimation(mi0Var2);
                        n0Var2.f33677c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f33648b;
                    n0Var3.f33678e = false;
                    ?? r22 = n0Var3.f33680g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f33648b.c(true);
                    return;
            }
        }
    };
    public final l0 f33682j = new Runnable(this) {
        public final n0 f33648b;

        {
            this.f33648b = this;
        }

        @Override
        public final void run() {
            int i9;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f33648b;
                    n0Var.f33676b.P(0, null);
                    mi0 mi0Var = n0Var.f33675a;
                    mi0Var.P(0, null);
                    pi0 pi0Var = n0Var.f33677c;
                    if (pi0Var != null) {
                        pi0Var.setAnimation(mi0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f33648b;
                    mi0 mi0Var2 = n0Var2.f33676b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i9 = 0;
                    } else {
                        i9 = 240;
                        if (nextInt < 64) {
                            i10 = 240;
                            i9 = 120;
                        } else {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i9 = 540;
                                if (nextInt == 98) {
                                    i10 = 540;
                                    i9 = 420;
                                } else {
                                    i10 = 720;
                                }
                            }
                        }
                    }
                    mi0Var2.N(i10);
                    mi0Var2.P(i10 - 1, n0Var2.f33681i);
                    mi0Var2.K(i9);
                    pi0 pi0Var2 = n0Var2.f33677c;
                    if (pi0Var2 != null) {
                        pi0Var2.setAnimation(mi0Var2);
                        n0Var2.f33677c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f33648b;
                    n0Var3.f33678e = false;
                    ?? r22 = n0Var3.f33680g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f33648b.c(true);
                    return;
            }
        }
    };
    public final l0 f33684l = new Runnable(this) {
        public final n0 f33648b;

        {
            this.f33648b = this;
        }

        @Override
        public final void run() {
            int i9;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f33648b;
                    n0Var.f33676b.P(0, null);
                    mi0 mi0Var = n0Var.f33675a;
                    mi0Var.P(0, null);
                    pi0 pi0Var = n0Var.f33677c;
                    if (pi0Var != null) {
                        pi0Var.setAnimation(mi0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f33648b;
                    mi0 mi0Var2 = n0Var2.f33676b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i9 = 0;
                    } else {
                        i9 = 240;
                        if (nextInt < 64) {
                            i10 = 240;
                            i9 = 120;
                        } else {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i9 = 540;
                                if (nextInt == 98) {
                                    i10 = 540;
                                    i9 = 420;
                                } else {
                                    i10 = 720;
                                }
                            }
                        }
                    }
                    mi0Var2.N(i10);
                    mi0Var2.P(i10 - 1, n0Var2.f33681i);
                    mi0Var2.K(i9);
                    pi0 pi0Var2 = n0Var2.f33677c;
                    if (pi0Var2 != null) {
                        pi0Var2.setAnimation(mi0Var2);
                        n0Var2.f33677c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f33648b;
                    n0Var3.f33678e = false;
                    ?? r22 = n0Var3.f33680g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f33648b.c(true);
                    return;
            }
        }
    };
    public final l0 f33685m = new Runnable(this) {
        public final n0 f33648b;

        {
            this.f33648b = this;
        }

        @Override
        public final void run() {
            int i9;
            switch (r2) {
                case 0:
                    n0 n0Var = this.f33648b;
                    n0Var.f33676b.P(0, null);
                    mi0 mi0Var = n0Var.f33675a;
                    mi0Var.P(0, null);
                    pi0 pi0Var = n0Var.f33677c;
                    if (pi0Var != null) {
                        pi0Var.setAnimation(mi0Var);
                        return;
                    }
                    return;
                case 1:
                    n0 n0Var2 = this.f33648b;
                    mi0 mi0Var2 = n0Var2.f33676b;
                    int nextInt = Utilities.random.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i9 = 0;
                    } else {
                        i9 = 240;
                        if (nextInt < 64) {
                            i10 = 240;
                            i9 = 120;
                        } else {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i9 = 540;
                                if (nextInt == 98) {
                                    i10 = 540;
                                    i9 = 420;
                                } else {
                                    i10 = 720;
                                }
                            }
                        }
                    }
                    mi0Var2.N(i10);
                    mi0Var2.P(i10 - 1, n0Var2.f33681i);
                    mi0Var2.K(i9);
                    pi0 pi0Var2 = n0Var2.f33677c;
                    if (pi0Var2 != null) {
                        pi0Var2.setAnimation(mi0Var2);
                        n0Var2.f33677c.d();
                        return;
                    }
                    return;
                case 2:
                    n0 n0Var3 = this.f33648b;
                    n0Var3.f33678e = false;
                    ?? r22 = n0Var3.f33680g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    n0Var3.d = false;
                    return;
                default:
                    this.f33648b.c(true);
                    return;
            }
        }
    };

    public n0() {
        int i9 = R.raw.voice_mini;
        this.f33675a = new mi0(i9, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        int i10 = R.raw.hand_2;
        this.f33676b = new mi0(i10, "" + R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);
    }

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            l0 l0Var = this.f33684l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(l0Var);
            }
            if (!this.f33678e) {
                this.f33678e = true;
                ?? r42 = this.f33680g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(l0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f33680g = null;
        this.f33678e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f33684l);
        AndroidUtilities.cancelRunOnUIThread(this.f33682j);
        AndroidUtilities.cancelRunOnUIThread(this.f33685m);
        this.f33675a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        mi0 mi0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i9;
        boolean N;
        boolean z15;
        if (this.f33677c != null && (groupCallParticipant = this.h) != null && (mi0Var = this.f33675a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f33678e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f33678e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f33678e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j10 = this.h.lastRaiseHandDate;
                long j11 = elapsedRealtime2 - j10;
                if (j10 != 0 && j11 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f33685m, 5000 - j11);
                }
                N = mi0Var.N(136);
            } else {
                this.f33677c.setAnimation(mi0Var);
                mi0Var.P(0, null);
                if (z13 && this.f33679f) {
                    N = mi0Var.N(36);
                } else {
                    if (z13) {
                        i9 = 99;
                    } else {
                        i9 = 69;
                    }
                    N = mi0Var.N(i9);
                }
            }
            if (z10) {
                if (N) {
                    if (z14) {
                        mi0Var.K(99);
                        mi0Var.N(136);
                    } else if (z13 && this.f33679f && !z14) {
                        mi0Var.K(0);
                        mi0Var.N(36);
                    } else if (z13) {
                        mi0Var.K(69);
                        mi0Var.N(99);
                    } else {
                        mi0Var.K(36);
                        mi0Var.N(69);
                    }
                    this.f33677c.d();
                    this.f33677c.invalidate();
                }
            } else {
                mi0Var.L(mi0Var.f30849f - 1, false, true);
                this.f33677c.invalidate();
            }
            this.f33677c.setAnimation(mi0Var);
            this.f33679f = z14;
            if (this.f33683k != z11) {
                this.f33683k = z11;
                ?? r12 = this.f33680g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
