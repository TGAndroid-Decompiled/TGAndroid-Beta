package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
public final class a0 {
    public fh0 f39208c;
    public boolean d;
    public boolean f39209e;
    public boolean f39210f;
    public FrameLayout f39211g;
    public TLRPC.GroupCallParticipant h;
    public boolean f39214k;
    public final y f39212i = new Runnable(this) {
        public final a0 f39721b;

        {
            this.f39721b = this;
        }

        @Override
        public final void run() {
            int i3;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f39721b;
                    a0Var.f39207b.S(0, null);
                    ch0 ch0Var = a0Var.f39206a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = a0Var.f39208c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f39721b;
                    ch0 ch0Var2 = a0Var2.f39207b;
                    int nextInt = Utilities.f21385b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i3 = 0;
                    } else {
                        i3 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i3;
                        i3 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, a0Var2.f39212i);
                    ch0Var2.M(i3);
                    fh0 fh0Var2 = a0Var2.f39208c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        a0Var2.f39208c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f39721b;
                    a0Var3.f39209e = false;
                    ?? r22 = a0Var3.f39211g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f39721b.c(true);
                    return;
            }
        }
    };
    public final y f39213j = new Runnable(this) {
        public final a0 f39721b;

        {
            this.f39721b = this;
        }

        @Override
        public final void run() {
            int i3;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f39721b;
                    a0Var.f39207b.S(0, null);
                    ch0 ch0Var = a0Var.f39206a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = a0Var.f39208c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f39721b;
                    ch0 ch0Var2 = a0Var2.f39207b;
                    int nextInt = Utilities.f21385b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i3 = 0;
                    } else {
                        i3 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i3;
                        i3 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, a0Var2.f39212i);
                    ch0Var2.M(i3);
                    fh0 fh0Var2 = a0Var2.f39208c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        a0Var2.f39208c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f39721b;
                    a0Var3.f39209e = false;
                    ?? r22 = a0Var3.f39211g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f39721b.c(true);
                    return;
            }
        }
    };
    public final y f39215l = new Runnable(this) {
        public final a0 f39721b;

        {
            this.f39721b = this;
        }

        @Override
        public final void run() {
            int i3;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f39721b;
                    a0Var.f39207b.S(0, null);
                    ch0 ch0Var = a0Var.f39206a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = a0Var.f39208c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f39721b;
                    ch0 ch0Var2 = a0Var2.f39207b;
                    int nextInt = Utilities.f21385b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i3 = 0;
                    } else {
                        i3 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i3;
                        i3 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, a0Var2.f39212i);
                    ch0Var2.M(i3);
                    fh0 fh0Var2 = a0Var2.f39208c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        a0Var2.f39208c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f39721b;
                    a0Var3.f39209e = false;
                    ?? r22 = a0Var3.f39211g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f39721b.c(true);
                    return;
            }
        }
    };
    public final y f39216m = new Runnable(this) {
        public final a0 f39721b;

        {
            this.f39721b = this;
        }

        @Override
        public final void run() {
            int i3;
            switch (r2) {
                case 0:
                    a0 a0Var = this.f39721b;
                    a0Var.f39207b.S(0, null);
                    ch0 ch0Var = a0Var.f39206a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = a0Var.f39208c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    a0 a0Var2 = this.f39721b;
                    ch0 ch0Var2 = a0Var2.f39207b;
                    int nextInt = Utilities.f21385b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i3 = 0;
                    } else {
                        i3 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i3 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i3;
                        i3 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, a0Var2.f39212i);
                    ch0Var2.M(i3);
                    fh0 fh0Var2 = a0Var2.f39208c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        a0Var2.f39208c.d();
                        return;
                    }
                    return;
                case 2:
                    a0 a0Var3 = this.f39721b;
                    a0Var3.f39209e = false;
                    ?? r22 = a0Var3.f39211g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    a0Var3.d = false;
                    return;
                default:
                    this.f39721b.c(true);
                    return;
            }
        }
    };
    public final ch0 f39206a = new ch0(2131624331, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final ch0 f39207b = new ch0(2131624044, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            y yVar = this.f39215l;
            if (z10) {
                org.telegram.messenger.g0.r(yVar);
            }
            if (!this.f39209e) {
                this.f39209e = true;
                ?? r42 = this.f39211g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.i3(yVar, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f39211g = null;
        this.f39209e = false;
        org.telegram.messenger.g0.r(this.f39215l);
        org.telegram.messenger.g0.r(this.f39213j);
        org.telegram.messenger.g0.r(this.f39216m);
        this.f39206a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ch0 ch0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
        boolean P;
        boolean z15;
        if (this.f39208c != null && (groupCallParticipant = this.h) != null && (ch0Var = this.f39206a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f39209e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f39209e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f39209e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j10 = this.h.lastRaiseHandDate;
                long j11 = elapsedRealtime2 - j10;
                if (j10 != 0 && j11 <= 5000) {
                    org.telegram.messenger.g0.i3(this.f39216m, 5000 - j11);
                }
                P = ch0Var.P(136);
            } else {
                this.f39208c.setAnimation(ch0Var);
                ch0Var.S(0, null);
                if (z13 && this.f39210f) {
                    P = ch0Var.P(36);
                } else {
                    if (z13) {
                        i3 = 99;
                    } else {
                        i3 = 69;
                    }
                    P = ch0Var.P(i3);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        ch0Var.M(99);
                        ch0Var.P(136);
                    } else if (z13 && this.f39210f && !z14) {
                        ch0Var.M(0);
                        ch0Var.P(36);
                    } else if (z13) {
                        ch0Var.M(69);
                        ch0Var.P(99);
                    } else {
                        ch0Var.M(36);
                        ch0Var.P(69);
                    }
                    this.f39208c.d();
                    this.f39208c.invalidate();
                }
            } else {
                ch0Var.N(ch0Var.f32727f - 1, false, true);
                this.f39208c.invalidate();
            }
            this.f39208c.setAnimation(ch0Var);
            this.f39210f = z14;
            if (this.f39214k != z11) {
                this.f39214k = z11;
                ?? r12 = this.f39211g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
