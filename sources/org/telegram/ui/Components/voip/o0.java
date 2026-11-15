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
public final class o0 {
    public fh0 f40817c;
    public boolean d;
    public boolean f40818e;
    public boolean f40819f;
    public FrameLayout f40820g;
    public TLRPC.GroupCallParticipant h;
    public boolean f40823k;
    public final m0 f40821i = new Runnable(this) {
        public final o0 f40777b;

        {
            this.f40777b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f40777b;
                    o0Var.f40816b.S(0, null);
                    ch0 ch0Var = o0Var.f40815a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = o0Var.f40817c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f40777b;
                    ch0 ch0Var2 = o0Var2.f40816b;
                    int nextInt = Utilities.f22414b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, o0Var2.f40821i);
                    ch0Var2.M(i7);
                    fh0 fh0Var2 = o0Var2.f40817c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        o0Var2.f40817c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f40777b;
                    o0Var3.f40818e = false;
                    ?? r22 = o0Var3.f40820g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f40777b.c(true);
                    return;
            }
        }
    };
    public final m0 f40822j = new Runnable(this) {
        public final o0 f40777b;

        {
            this.f40777b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f40777b;
                    o0Var.f40816b.S(0, null);
                    ch0 ch0Var = o0Var.f40815a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = o0Var.f40817c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f40777b;
                    ch0 ch0Var2 = o0Var2.f40816b;
                    int nextInt = Utilities.f22414b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, o0Var2.f40821i);
                    ch0Var2.M(i7);
                    fh0 fh0Var2 = o0Var2.f40817c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        o0Var2.f40817c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f40777b;
                    o0Var3.f40818e = false;
                    ?? r22 = o0Var3.f40820g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f40777b.c(true);
                    return;
            }
        }
    };
    public final m0 f40824l = new Runnable(this) {
        public final o0 f40777b;

        {
            this.f40777b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f40777b;
                    o0Var.f40816b.S(0, null);
                    ch0 ch0Var = o0Var.f40815a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = o0Var.f40817c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f40777b;
                    ch0 ch0Var2 = o0Var2.f40816b;
                    int nextInt = Utilities.f22414b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, o0Var2.f40821i);
                    ch0Var2.M(i7);
                    fh0 fh0Var2 = o0Var2.f40817c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        o0Var2.f40817c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f40777b;
                    o0Var3.f40818e = false;
                    ?? r22 = o0Var3.f40820g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f40777b.c(true);
                    return;
            }
        }
    };
    public final m0 f40825m = new Runnable(this) {
        public final o0 f40777b;

        {
            this.f40777b = this;
        }

        @Override
        public final void run() {
            int i7;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f40777b;
                    o0Var.f40816b.S(0, null);
                    ch0 ch0Var = o0Var.f40815a;
                    ch0Var.S(0, null);
                    fh0 fh0Var = o0Var.f40817c;
                    if (fh0Var != null) {
                        fh0Var.setAnimation(ch0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f40777b;
                    ch0 ch0Var2 = o0Var2.f40816b;
                    int nextInt = Utilities.f22414b.nextInt(100);
                    int i10 = 120;
                    if (nextInt < 32) {
                        i7 = 0;
                    } else {
                        i7 = 240;
                        if (nextInt >= 64) {
                            i10 = 420;
                            if (nextInt >= 97) {
                                i7 = 540;
                                if (nextInt != 98) {
                                    i10 = 720;
                                }
                            }
                        }
                        int i11 = i7;
                        i7 = i10;
                        i10 = i11;
                    }
                    ch0Var2.P(i10);
                    ch0Var2.S(i10 - 1, o0Var2.f40821i);
                    ch0Var2.M(i7);
                    fh0 fh0Var2 = o0Var2.f40817c;
                    if (fh0Var2 != null) {
                        fh0Var2.setAnimation(ch0Var2);
                        o0Var2.f40817c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f40777b;
                    o0Var3.f40818e = false;
                    ?? r22 = o0Var3.f40820g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f40777b.c(true);
                    return;
            }
        }
    };
    public final ch0 f40815a = new ch0(2131624332, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
    public final ch0 f40816b = new ch0(2131624045, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            m0 m0Var = this.f40824l;
            if (z10) {
                org.telegram.messenger.g0.r(m0Var);
            }
            if (!this.f40818e) {
                this.f40818e = true;
                ?? r42 = this.f40820g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.g0.i3(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f40820g = null;
        this.f40818e = false;
        org.telegram.messenger.g0.r(this.f40824l);
        org.telegram.messenger.g0.r(this.f40822j);
        org.telegram.messenger.g0.r(this.f40825m);
        this.f40815a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ch0 ch0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        boolean P;
        boolean z15;
        if (this.f40817c != null && (groupCallParticipant = this.h) != null && (ch0Var = this.f40815a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f40818e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f40818e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f40818e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    org.telegram.messenger.g0.i3(this.f40825m, 5000 - j10);
                }
                P = ch0Var.P(136);
            } else {
                this.f40817c.setAnimation(ch0Var);
                ch0Var.S(0, null);
                if (z13 && this.f40819f) {
                    P = ch0Var.P(36);
                } else {
                    if (z13) {
                        i7 = 99;
                    } else {
                        i7 = 69;
                    }
                    P = ch0Var.P(i7);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        ch0Var.M(99);
                        ch0Var.P(136);
                    } else if (z13 && this.f40819f && !z14) {
                        ch0Var.M(0);
                        ch0Var.P(36);
                    } else if (z13) {
                        ch0Var.M(69);
                        ch0Var.P(99);
                    } else {
                        ch0Var.M(36);
                        ch0Var.P(69);
                    }
                    this.f40817c.d();
                    this.f40817c.invalidate();
                }
            } else {
                ch0Var.N(ch0Var.f33581f - 1, false, true);
                this.f40817c.invalidate();
            }
            this.f40817c.setAnimation(ch0Var);
            this.f40819f = z14;
            if (this.f40823k != z11) {
                this.f40823k = z11;
                ?? r12 = this.f40820g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
