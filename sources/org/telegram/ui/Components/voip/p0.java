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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fk0;
public final class p0 {
    public fk0 f32152c;
    public boolean d;
    public boolean f32153e;
    public boolean f32154f;
    public FrameLayout f32155g;
    public TLRPC.GroupCallParticipant h;
    public boolean f32158k;
    public final n0 f32156i = new Runnable(this) {
        public final p0 f32105b;

        {
            this.f32105b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32105b;
                    p0Var.f32151b.S(0, null);
                    ck0 ck0Var = p0Var.f32150a;
                    ck0Var.S(0, null);
                    fk0 fk0Var = p0Var.f32152c;
                    if (fk0Var != null) {
                        fk0Var.setAnimation(ck0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32105b;
                    ck0 ck0Var2 = p0Var2.f32151b;
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
                    ck0Var2.P(i11);
                    ck0Var2.S(i11 - 1, p0Var2.f32156i);
                    ck0Var2.M(i10);
                    fk0 fk0Var2 = p0Var2.f32152c;
                    if (fk0Var2 != null) {
                        fk0Var2.setAnimation(ck0Var2);
                        p0Var2.f32152c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32105b;
                    p0Var3.f32153e = false;
                    ?? r22 = p0Var3.f32155g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32105b.c(true);
                    return;
            }
        }
    };
    public final n0 f32157j = new Runnable(this) {
        public final p0 f32105b;

        {
            this.f32105b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32105b;
                    p0Var.f32151b.S(0, null);
                    ck0 ck0Var = p0Var.f32150a;
                    ck0Var.S(0, null);
                    fk0 fk0Var = p0Var.f32152c;
                    if (fk0Var != null) {
                        fk0Var.setAnimation(ck0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32105b;
                    ck0 ck0Var2 = p0Var2.f32151b;
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
                    ck0Var2.P(i11);
                    ck0Var2.S(i11 - 1, p0Var2.f32156i);
                    ck0Var2.M(i10);
                    fk0 fk0Var2 = p0Var2.f32152c;
                    if (fk0Var2 != null) {
                        fk0Var2.setAnimation(ck0Var2);
                        p0Var2.f32152c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32105b;
                    p0Var3.f32153e = false;
                    ?? r22 = p0Var3.f32155g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32105b.c(true);
                    return;
            }
        }
    };
    public final n0 f32159l = new Runnable(this) {
        public final p0 f32105b;

        {
            this.f32105b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32105b;
                    p0Var.f32151b.S(0, null);
                    ck0 ck0Var = p0Var.f32150a;
                    ck0Var.S(0, null);
                    fk0 fk0Var = p0Var.f32152c;
                    if (fk0Var != null) {
                        fk0Var.setAnimation(ck0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32105b;
                    ck0 ck0Var2 = p0Var2.f32151b;
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
                    ck0Var2.P(i11);
                    ck0Var2.S(i11 - 1, p0Var2.f32156i);
                    ck0Var2.M(i10);
                    fk0 fk0Var2 = p0Var2.f32152c;
                    if (fk0Var2 != null) {
                        fk0Var2.setAnimation(ck0Var2);
                        p0Var2.f32152c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32105b;
                    p0Var3.f32153e = false;
                    ?? r22 = p0Var3.f32155g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32105b.c(true);
                    return;
            }
        }
    };
    public final n0 f32160m = new Runnable(this) {
        public final p0 f32105b;

        {
            this.f32105b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32105b;
                    p0Var.f32151b.S(0, null);
                    ck0 ck0Var = p0Var.f32150a;
                    ck0Var.S(0, null);
                    fk0 fk0Var = p0Var.f32152c;
                    if (fk0Var != null) {
                        fk0Var.setAnimation(ck0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32105b;
                    ck0 ck0Var2 = p0Var2.f32151b;
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
                    ck0Var2.P(i11);
                    ck0Var2.S(i11 - 1, p0Var2.f32156i);
                    ck0Var2.M(i10);
                    fk0 fk0Var2 = p0Var2.f32152c;
                    if (fk0Var2 != null) {
                        fk0Var2.setAnimation(ck0Var2);
                        p0Var2.f32152c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32105b;
                    p0Var3.f32153e = false;
                    ?? r22 = p0Var3.f32155g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32105b.c(true);
                    return;
            }
        }
    };
    public final ck0 f32150a = new ck0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final ck0 f32151b = new ck0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.f32159l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.f32153e) {
                this.f32153e = true;
                ?? r42 = this.f32155g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f32155g = null;
        this.f32153e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f32159l);
        AndroidUtilities.cancelRunOnUIThread(this.f32157j);
        AndroidUtilities.cancelRunOnUIThread(this.f32160m);
        this.f32150a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ck0 ck0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f32152c != null && (groupCallParticipant = this.h) != null && (ck0Var = this.f32150a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f32153e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f32153e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f32153e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f32160m, 5000 - j10);
                }
                P = ck0Var.P(136);
            } else {
                this.f32152c.setAnimation(ck0Var);
                ck0Var.S(0, null);
                if (z13 && this.f32154f) {
                    P = ck0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = ck0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        ck0Var.M(99);
                        ck0Var.P(136);
                    } else if (z13 && this.f32154f && !z14) {
                        ck0Var.M(0);
                        ck0Var.P(36);
                    } else if (z13) {
                        ck0Var.M(69);
                        ck0Var.P(99);
                    } else {
                        ck0Var.M(36);
                        ck0Var.P(69);
                    }
                    this.f32152c.d();
                    this.f32152c.invalidate();
                }
            } else {
                ck0Var.N(ck0Var.f25403f - 1, false, true);
                this.f32152c.invalidate();
            }
            this.f32152c.setAnimation(ck0Var);
            this.f32154f = z14;
            if (this.f32158k != z11) {
                this.f32158k = z11;
                ?? r12 = this.f32155g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
