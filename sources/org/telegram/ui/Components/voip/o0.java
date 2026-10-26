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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.xj0;
public final class o0 {
    public ak0 f33982c;
    public boolean d;
    public boolean e;
    public boolean f33983f;
    public FrameLayout f33984g;
    public TLRPC.GroupCallParticipant h;
    public boolean f33987k;
    public final m0 f33985i = new Runnable(this) {
        public final o0 f33947b;

        {
            this.f33947b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f33947b;
                    o0Var.f33981b.S(0, null);
                    xj0 xj0Var = o0Var.f33980a;
                    xj0Var.S(0, null);
                    ak0 ak0Var = o0Var.f33982c;
                    if (ak0Var != null) {
                        ak0Var.setAnimation(xj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f33947b;
                    xj0 xj0Var2 = o0Var2.f33981b;
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
                    xj0Var2.P(i11);
                    xj0Var2.S(i11 - 1, o0Var2.f33985i);
                    xj0Var2.M(i10);
                    ak0 ak0Var2 = o0Var2.f33982c;
                    if (ak0Var2 != null) {
                        ak0Var2.setAnimation(xj0Var2);
                        o0Var2.f33982c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f33947b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f33984g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f33947b.c(true);
                    return;
            }
        }
    };
    public final m0 f33986j = new Runnable(this) {
        public final o0 f33947b;

        {
            this.f33947b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f33947b;
                    o0Var.f33981b.S(0, null);
                    xj0 xj0Var = o0Var.f33980a;
                    xj0Var.S(0, null);
                    ak0 ak0Var = o0Var.f33982c;
                    if (ak0Var != null) {
                        ak0Var.setAnimation(xj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f33947b;
                    xj0 xj0Var2 = o0Var2.f33981b;
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
                    xj0Var2.P(i11);
                    xj0Var2.S(i11 - 1, o0Var2.f33985i);
                    xj0Var2.M(i10);
                    ak0 ak0Var2 = o0Var2.f33982c;
                    if (ak0Var2 != null) {
                        ak0Var2.setAnimation(xj0Var2);
                        o0Var2.f33982c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f33947b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f33984g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f33947b.c(true);
                    return;
            }
        }
    };
    public final m0 f33988l = new Runnable(this) {
        public final o0 f33947b;

        {
            this.f33947b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f33947b;
                    o0Var.f33981b.S(0, null);
                    xj0 xj0Var = o0Var.f33980a;
                    xj0Var.S(0, null);
                    ak0 ak0Var = o0Var.f33982c;
                    if (ak0Var != null) {
                        ak0Var.setAnimation(xj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f33947b;
                    xj0 xj0Var2 = o0Var2.f33981b;
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
                    xj0Var2.P(i11);
                    xj0Var2.S(i11 - 1, o0Var2.f33985i);
                    xj0Var2.M(i10);
                    ak0 ak0Var2 = o0Var2.f33982c;
                    if (ak0Var2 != null) {
                        ak0Var2.setAnimation(xj0Var2);
                        o0Var2.f33982c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f33947b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f33984g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f33947b.c(true);
                    return;
            }
        }
    };
    public final m0 f33989m = new Runnable(this) {
        public final o0 f33947b;

        {
            this.f33947b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f33947b;
                    o0Var.f33981b.S(0, null);
                    xj0 xj0Var = o0Var.f33980a;
                    xj0Var.S(0, null);
                    ak0 ak0Var = o0Var.f33982c;
                    if (ak0Var != null) {
                        ak0Var.setAnimation(xj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f33947b;
                    xj0 xj0Var2 = o0Var2.f33981b;
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
                    xj0Var2.P(i11);
                    xj0Var2.S(i11 - 1, o0Var2.f33985i);
                    xj0Var2.M(i10);
                    ak0 ak0Var2 = o0Var2.f33982c;
                    if (ak0Var2 != null) {
                        ak0Var2.setAnimation(xj0Var2);
                        o0Var2.f33982c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f33947b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f33984g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f33947b.c(true);
                    return;
            }
        }
    };
    public final xj0 f33980a = new xj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final xj0 f33981b = new xj0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            m0 m0Var = this.f33988l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f33984g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f33984g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f33988l);
        AndroidUtilities.cancelRunOnUIThread(this.f33986j);
        AndroidUtilities.cancelRunOnUIThread(this.f33989m);
        this.f33980a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        xj0 xj0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f33982c != null && (groupCallParticipant = this.h) != null && (xj0Var = this.f33980a) != null) {
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
                    AndroidUtilities.runOnUIThread(this.f33989m, 5000 - j11);
                }
                P = xj0Var.P(136);
            } else {
                this.f33982c.setAnimation(xj0Var);
                xj0Var.S(0, null);
                if (z13 && this.f33983f) {
                    P = xj0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = xj0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        xj0Var.M(99);
                        xj0Var.P(136);
                    } else if (z13 && this.f33983f && !z14) {
                        xj0Var.M(0);
                        xj0Var.P(36);
                    } else if (z13) {
                        xj0Var.M(69);
                        xj0Var.P(99);
                    } else {
                        xj0Var.M(36);
                        xj0Var.P(69);
                    }
                    this.f33982c.d();
                    this.f33982c.invalidate();
                }
            } else {
                xj0Var.N(xj0Var.f34743f - 1, false, true);
                this.f33982c.invalidate();
            }
            this.f33982c.setAnimation(xj0Var);
            this.f33983f = z14;
            if (this.f33987k != z11) {
                this.f33987k = z11;
                ?? r12 = this.f33984g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
