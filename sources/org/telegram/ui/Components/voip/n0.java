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
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;

public final class n0 {

    public final oi0 f33725a = new oi0(R.raw.voice_mini, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);

    public final oi0 f33726b = new oi0(R.raw.hand_2, "" + R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public ri0 f33727c;
    public boolean d;

    public boolean f33728e;

    public boolean f33729f;

    public FrameLayout f33730g;
    public TLRPC.GroupCallParticipant h;

    public final l0 f33731i;

    public final l0 f33732j;

    public boolean f33733k;

    public final l0 f33734l;

    public final l0 f33735m;

    public n0() {
        final int i10 = 0;
        this.f33731i = new Runnable(this) {

            public final n0 f33698b;

            {
                this.f33698b = this;
            }

            @Override
            public final void run() {
                int i11;
                switch (i10) {
                    case 0:
                        n0 n0Var = this.f33698b;
                        n0Var.f33726b.P(0, null);
                        oi0 oi0Var = n0Var.f33725a;
                        oi0Var.P(0, null);
                        ri0 ri0Var = n0Var.f33727c;
                        if (ri0Var != null) {
                            ri0Var.setAnimation(oi0Var);
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.f33698b;
                        oi0 oi0Var2 = n0Var2.f33726b;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i12 = 120;
                        if (iNextInt < 32) {
                            i11 = 0;
                        } else {
                            i11 = 240;
                            if (iNextInt < 64) {
                                i12 = 240;
                                i11 = 120;
                            } else {
                                i12 = 420;
                                if (iNextInt >= 97) {
                                    i11 = 540;
                                    if (iNextInt == 98) {
                                        i12 = 540;
                                        i11 = 420;
                                    } else {
                                        i12 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i12);
                        oi0Var2.P(i12 - 1, n0Var2.f33731i);
                        oi0Var2.K(i11);
                        ri0 ri0Var2 = n0Var2.f33727c;
                        if (ri0Var2 != null) {
                            ri0Var2.setAnimation(oi0Var2);
                            n0Var2.f33727c.d();
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.f33698b;
                        n0Var3.f33728e = false;
                        ?? r10 = n0Var3.f33730g;
                        if (r10 != 0) {
                            r10.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.f33698b.c(true);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f33732j = new Runnable(this) {

            public final n0 f33698b;

            {
                this.f33698b = this;
            }

            @Override
            public final void run() {
                int i12;
                switch (i11) {
                    case 0:
                        n0 n0Var = this.f33698b;
                        n0Var.f33726b.P(0, null);
                        oi0 oi0Var = n0Var.f33725a;
                        oi0Var.P(0, null);
                        ri0 ri0Var = n0Var.f33727c;
                        if (ri0Var != null) {
                            ri0Var.setAnimation(oi0Var);
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.f33698b;
                        oi0 oi0Var2 = n0Var2.f33726b;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i13 = 120;
                        if (iNextInt < 32) {
                            i12 = 0;
                        } else {
                            i12 = 240;
                            if (iNextInt < 64) {
                                i13 = 240;
                                i12 = 120;
                            } else {
                                i13 = 420;
                                if (iNextInt >= 97) {
                                    i12 = 540;
                                    if (iNextInt == 98) {
                                        i13 = 540;
                                        i12 = 420;
                                    } else {
                                        i13 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i13);
                        oi0Var2.P(i13 - 1, n0Var2.f33731i);
                        oi0Var2.K(i12);
                        ri0 ri0Var2 = n0Var2.f33727c;
                        if (ri0Var2 != null) {
                            ri0Var2.setAnimation(oi0Var2);
                            n0Var2.f33727c.d();
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.f33698b;
                        n0Var3.f33728e = false;
                        ?? r10 = n0Var3.f33730g;
                        if (r10 != 0) {
                            r10.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.f33698b.c(true);
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f33734l = new Runnable(this) {

            public final n0 f33698b;

            {
                this.f33698b = this;
            }

            @Override
            public final void run() {
                int i13;
                switch (i12) {
                    case 0:
                        n0 n0Var = this.f33698b;
                        n0Var.f33726b.P(0, null);
                        oi0 oi0Var = n0Var.f33725a;
                        oi0Var.P(0, null);
                        ri0 ri0Var = n0Var.f33727c;
                        if (ri0Var != null) {
                            ri0Var.setAnimation(oi0Var);
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.f33698b;
                        oi0 oi0Var2 = n0Var2.f33726b;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i14 = 120;
                        if (iNextInt < 32) {
                            i13 = 0;
                        } else {
                            i13 = 240;
                            if (iNextInt < 64) {
                                i14 = 240;
                                i13 = 120;
                            } else {
                                i14 = 420;
                                if (iNextInt >= 97) {
                                    i13 = 540;
                                    if (iNextInt == 98) {
                                        i14 = 540;
                                        i13 = 420;
                                    } else {
                                        i14 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i14);
                        oi0Var2.P(i14 - 1, n0Var2.f33731i);
                        oi0Var2.K(i13);
                        ri0 ri0Var2 = n0Var2.f33727c;
                        if (ri0Var2 != null) {
                            ri0Var2.setAnimation(oi0Var2);
                            n0Var2.f33727c.d();
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.f33698b;
                        n0Var3.f33728e = false;
                        ?? r10 = n0Var3.f33730g;
                        if (r10 != 0) {
                            r10.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.f33698b.c(true);
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f33735m = new Runnable(this) {

            public final n0 f33698b;

            {
                this.f33698b = this;
            }

            @Override
            public final void run() {
                int i14;
                switch (i13) {
                    case 0:
                        n0 n0Var = this.f33698b;
                        n0Var.f33726b.P(0, null);
                        oi0 oi0Var = n0Var.f33725a;
                        oi0Var.P(0, null);
                        ri0 ri0Var = n0Var.f33727c;
                        if (ri0Var != null) {
                            ri0Var.setAnimation(oi0Var);
                        }
                        break;
                    case 1:
                        n0 n0Var2 = this.f33698b;
                        oi0 oi0Var2 = n0Var2.f33726b;
                        int iNextInt = Utilities.random.nextInt(100);
                        int i15 = 120;
                        if (iNextInt < 32) {
                            i14 = 0;
                        } else {
                            i14 = 240;
                            if (iNextInt < 64) {
                                i15 = 240;
                                i14 = 120;
                            } else {
                                i15 = 420;
                                if (iNextInt >= 97) {
                                    i14 = 540;
                                    if (iNextInt == 98) {
                                        i15 = 540;
                                        i14 = 420;
                                    } else {
                                        i15 = 720;
                                    }
                                }
                            }
                        }
                        oi0Var2.N(i15);
                        oi0Var2.P(i15 - 1, n0Var2.f33731i);
                        oi0Var2.K(i14);
                        ri0 ri0Var2 = n0Var2.f33727c;
                        if (ri0Var2 != null) {
                            ri0Var2.setAnimation(oi0Var2);
                            n0Var2.f33727c.d();
                        }
                        break;
                    case 2:
                        n0 n0Var3 = this.f33698b;
                        n0Var3.f33728e = false;
                        ?? r10 = n0Var3.f33730g;
                        if (r10 != 0) {
                            r10.a();
                        }
                        n0Var3.d = false;
                        break;
                    default:
                        this.f33698b.c(true);
                        break;
                }
            }
        };
    }

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            l0 l0Var = this.f33734l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(l0Var);
            }
            if (!this.f33728e) {
                this.f33728e = true;
                ?? r10 = this.f33730g;
                if (r10 != 0) {
                    r10.a();
                }
            }
            AndroidUtilities.runOnUIThread(l0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f33730g = null;
        this.f33728e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f33734l);
        AndroidUtilities.cancelRunOnUIThread(this.f33732j);
        AndroidUtilities.cancelRunOnUIThread(this.f33735m);
        this.f33725a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        oi0 oi0Var;
        boolean zN;
        boolean z11;
        if (this.f33727c == null || (groupCallParticipant = this.h) == null || (oi0Var = this.f33725a) == null) {
            return;
        }
        boolean z12 = groupCallParticipant.muted_by_you && !groupCallParticipant.self;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.h;
        boolean z13 = jElapsedRealtime - groupCallParticipant2.lastVoiceUpdateTime < 500 ? groupCallParticipant2.hasVoiceDelayed : groupCallParticipant2.hasVoice;
        boolean z14 = !groupCallParticipant2.self ? (!groupCallParticipant2.muted || (this.f33728e && z13)) && !z12 : VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f33728e && z13);
        TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
        boolean z15 = ((groupCallParticipant3.muted && !this.f33728e) || z12) && !(((z11 = groupCallParticipant3.can_self_unmute) && !z12) || z11 || groupCallParticipant3.raise_hand_rating == 0);
        if (z15) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = this.h.lastRaiseHandDate;
            long j11 = jElapsedRealtime2 - j10;
            if (j10 != 0 && j11 <= 5000) {
                AndroidUtilities.runOnUIThread(this.f33735m, 5000 - j11);
            }
            zN = oi0Var.N(136);
        } else {
            this.f33727c.setAnimation(oi0Var);
            oi0Var.P(0, null);
            if (z14 && this.f33729f) {
                zN = oi0Var.N(36);
            } else {
                zN = oi0Var.N(z14 ? 99 : 69);
            }
        }
        if (!z10) {
            oi0Var.L(oi0Var.f31314f - 1, false, true);
            this.f33727c.invalidate();
        } else if (zN) {
            if (z15) {
                oi0Var.K(99);
                oi0Var.N(136);
            } else if (z14 && this.f33729f && !z15) {
                oi0Var.K(0);
                oi0Var.N(36);
            } else if (z14) {
                oi0Var.K(69);
                oi0Var.N(99);
            } else {
                oi0Var.K(36);
                oi0Var.N(69);
            }
            this.f33727c.d();
            this.f33727c.invalidate();
        }
        this.f33727c.setAnimation(oi0Var);
        this.f33729f = z15;
        if (this.f33733k != z12) {
            this.f33733k = z12;
            ?? r10 = this.f33730g;
            if (r10 != 0) {
                r10.a();
            }
        }
    }
}
