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
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xj0;
public final class o0 {
    public xj0 f31642c;
    public boolean d;
    public boolean e;
    public boolean f31643f;
    public FrameLayout f31644g;
    public TLRPC.GroupCallParticipant h;
    public boolean f31647k;
    public final m0 f31645i = new Runnable(this) {
        public final o0 f31598b;

        {
            this.f31598b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31598b;
                    o0Var.f31641b.S(0, null);
                    uj0 uj0Var = o0Var.f31640a;
                    uj0Var.S(0, null);
                    xj0 xj0Var = o0Var.f31642c;
                    if (xj0Var != null) {
                        xj0Var.setAnimation(uj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31598b;
                    uj0 uj0Var2 = o0Var2.f31641b;
                    int nextInt = Utilities.random.nextInt(100);
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
                    uj0Var2.P(i11);
                    uj0Var2.S(i11 - 1, o0Var2.f31645i);
                    uj0Var2.M(i10);
                    xj0 xj0Var2 = o0Var2.f31642c;
                    if (xj0Var2 != null) {
                        xj0Var2.setAnimation(uj0Var2);
                        o0Var2.f31642c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31598b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f31644g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31598b.c(true);
                    return;
            }
        }
    };
    public final m0 f31646j = new Runnable(this) {
        public final o0 f31598b;

        {
            this.f31598b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31598b;
                    o0Var.f31641b.S(0, null);
                    uj0 uj0Var = o0Var.f31640a;
                    uj0Var.S(0, null);
                    xj0 xj0Var = o0Var.f31642c;
                    if (xj0Var != null) {
                        xj0Var.setAnimation(uj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31598b;
                    uj0 uj0Var2 = o0Var2.f31641b;
                    int nextInt = Utilities.random.nextInt(100);
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
                    uj0Var2.P(i11);
                    uj0Var2.S(i11 - 1, o0Var2.f31645i);
                    uj0Var2.M(i10);
                    xj0 xj0Var2 = o0Var2.f31642c;
                    if (xj0Var2 != null) {
                        xj0Var2.setAnimation(uj0Var2);
                        o0Var2.f31642c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31598b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f31644g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31598b.c(true);
                    return;
            }
        }
    };
    public final m0 f31648l = new Runnable(this) {
        public final o0 f31598b;

        {
            this.f31598b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31598b;
                    o0Var.f31641b.S(0, null);
                    uj0 uj0Var = o0Var.f31640a;
                    uj0Var.S(0, null);
                    xj0 xj0Var = o0Var.f31642c;
                    if (xj0Var != null) {
                        xj0Var.setAnimation(uj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31598b;
                    uj0 uj0Var2 = o0Var2.f31641b;
                    int nextInt = Utilities.random.nextInt(100);
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
                    uj0Var2.P(i11);
                    uj0Var2.S(i11 - 1, o0Var2.f31645i);
                    uj0Var2.M(i10);
                    xj0 xj0Var2 = o0Var2.f31642c;
                    if (xj0Var2 != null) {
                        xj0Var2.setAnimation(uj0Var2);
                        o0Var2.f31642c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31598b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f31644g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31598b.c(true);
                    return;
            }
        }
    };
    public final m0 f31649m = new Runnable(this) {
        public final o0 f31598b;

        {
            this.f31598b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f31598b;
                    o0Var.f31641b.S(0, null);
                    uj0 uj0Var = o0Var.f31640a;
                    uj0Var.S(0, null);
                    xj0 xj0Var = o0Var.f31642c;
                    if (xj0Var != null) {
                        xj0Var.setAnimation(uj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f31598b;
                    uj0 uj0Var2 = o0Var2.f31641b;
                    int nextInt = Utilities.random.nextInt(100);
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
                    uj0Var2.P(i11);
                    uj0Var2.S(i11 - 1, o0Var2.f31645i);
                    uj0Var2.M(i10);
                    xj0 xj0Var2 = o0Var2.f31642c;
                    if (xj0Var2 != null) {
                        xj0Var2.setAnimation(uj0Var2);
                        o0Var2.f31642c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f31598b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f31644g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f31598b.c(true);
                    return;
            }
        }
    };
    public final uj0 f31640a = new uj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final uj0 f31641b = new uj0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            m0 m0Var = this.f31648l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f31644g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f31644g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f31648l);
        AndroidUtilities.cancelRunOnUIThread(this.f31646j);
        AndroidUtilities.cancelRunOnUIThread(this.f31649m);
        this.f31640a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        uj0 uj0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f31642c != null && (groupCallParticipant = this.h) != null && (uj0Var = this.f31640a) != null) {
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
                    AndroidUtilities.runOnUIThread(this.f31649m, 5000 - j11);
                }
                P = uj0Var.P(136);
            } else {
                this.f31642c.setAnimation(uj0Var);
                uj0Var.S(0, null);
                if (z13 && this.f31643f) {
                    P = uj0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = uj0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        uj0Var.M(99);
                        uj0Var.P(136);
                    } else if (z13 && this.f31643f && !z14) {
                        uj0Var.M(0);
                        uj0Var.P(36);
                    } else if (z13) {
                        uj0Var.M(69);
                        uj0Var.P(99);
                    } else {
                        uj0Var.M(36);
                        uj0Var.P(69);
                    }
                    this.f31642c.d();
                    this.f31642c.invalidate();
                }
            } else {
                uj0Var.N(uj0Var.f31008f - 1, false, true);
                this.f31642c.invalidate();
            }
            this.f31642c.setAnimation(uj0Var);
            this.f31643f = z14;
            if (this.f31647k != z11) {
                this.f31647k = z11;
                ?? r12 = this.f31644g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
