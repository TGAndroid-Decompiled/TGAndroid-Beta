package org.telegram.ui.Components.voip;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
public final class z {
    public ei0 f31785c;
    public boolean d;
    public boolean e;
    public boolean f31786f;
    public FrameLayout f31787g;
    public TLRPC.GroupCallParticipant h;
    public boolean f31790k;
    public final x f31788i = new Runnable(this) {
        public final z f31752b;

        {
            this.f31752b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    z zVar = this.f31752b;
                    zVar.f31784b.S(0, null);
                    bi0 bi0Var = zVar.f31783a;
                    bi0Var.S(0, null);
                    ei0 ei0Var = zVar.f31785c;
                    if (ei0Var != null) {
                        ei0Var.setAnimation(bi0Var);
                        return;
                    }
                    return;
                case 1:
                    z zVar2 = this.f31752b;
                    bi0 bi0Var2 = zVar2.f31784b;
                    int nextInt = Utilities.f14519b.nextInt(100);
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
                    bi0Var2.P(i11);
                    bi0Var2.S(i11 - 1, zVar2.f31788i);
                    bi0Var2.M(i10);
                    ei0 ei0Var2 = zVar2.f31785c;
                    if (ei0Var2 != null) {
                        ei0Var2.setAnimation(bi0Var2);
                        zVar2.f31785c.d();
                        return;
                    }
                    return;
                case 2:
                    z zVar3 = this.f31752b;
                    zVar3.e = false;
                    ?? r22 = zVar3.f31787g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    zVar3.d = false;
                    return;
                default:
                    this.f31752b.c(true);
                    return;
            }
        }
    };
    public final x f31789j = new Runnable(this) {
        public final z f31752b;

        {
            this.f31752b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    z zVar = this.f31752b;
                    zVar.f31784b.S(0, null);
                    bi0 bi0Var = zVar.f31783a;
                    bi0Var.S(0, null);
                    ei0 ei0Var = zVar.f31785c;
                    if (ei0Var != null) {
                        ei0Var.setAnimation(bi0Var);
                        return;
                    }
                    return;
                case 1:
                    z zVar2 = this.f31752b;
                    bi0 bi0Var2 = zVar2.f31784b;
                    int nextInt = Utilities.f14519b.nextInt(100);
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
                    bi0Var2.P(i11);
                    bi0Var2.S(i11 - 1, zVar2.f31788i);
                    bi0Var2.M(i10);
                    ei0 ei0Var2 = zVar2.f31785c;
                    if (ei0Var2 != null) {
                        ei0Var2.setAnimation(bi0Var2);
                        zVar2.f31785c.d();
                        return;
                    }
                    return;
                case 2:
                    z zVar3 = this.f31752b;
                    zVar3.e = false;
                    ?? r22 = zVar3.f31787g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    zVar3.d = false;
                    return;
                default:
                    this.f31752b.c(true);
                    return;
            }
        }
    };
    public final x f31791l = new Runnable(this) {
        public final z f31752b;

        {
            this.f31752b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    z zVar = this.f31752b;
                    zVar.f31784b.S(0, null);
                    bi0 bi0Var = zVar.f31783a;
                    bi0Var.S(0, null);
                    ei0 ei0Var = zVar.f31785c;
                    if (ei0Var != null) {
                        ei0Var.setAnimation(bi0Var);
                        return;
                    }
                    return;
                case 1:
                    z zVar2 = this.f31752b;
                    bi0 bi0Var2 = zVar2.f31784b;
                    int nextInt = Utilities.f14519b.nextInt(100);
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
                    bi0Var2.P(i11);
                    bi0Var2.S(i11 - 1, zVar2.f31788i);
                    bi0Var2.M(i10);
                    ei0 ei0Var2 = zVar2.f31785c;
                    if (ei0Var2 != null) {
                        ei0Var2.setAnimation(bi0Var2);
                        zVar2.f31785c.d();
                        return;
                    }
                    return;
                case 2:
                    z zVar3 = this.f31752b;
                    zVar3.e = false;
                    ?? r22 = zVar3.f31787g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    zVar3.d = false;
                    return;
                default:
                    this.f31752b.c(true);
                    return;
            }
        }
    };
    public final x f31792m = new Runnable(this) {
        public final z f31752b;

        {
            this.f31752b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    z zVar = this.f31752b;
                    zVar.f31784b.S(0, null);
                    bi0 bi0Var = zVar.f31783a;
                    bi0Var.S(0, null);
                    ei0 ei0Var = zVar.f31785c;
                    if (ei0Var != null) {
                        ei0Var.setAnimation(bi0Var);
                        return;
                    }
                    return;
                case 1:
                    z zVar2 = this.f31752b;
                    bi0 bi0Var2 = zVar2.f31784b;
                    int nextInt = Utilities.f14519b.nextInt(100);
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
                    bi0Var2.P(i11);
                    bi0Var2.S(i11 - 1, zVar2.f31788i);
                    bi0Var2.M(i10);
                    ei0 ei0Var2 = zVar2.f31785c;
                    if (ei0Var2 != null) {
                        ei0Var2.setAnimation(bi0Var2);
                        zVar2.f31785c.d();
                        return;
                    }
                    return;
                case 2:
                    z zVar3 = this.f31752b;
                    zVar3.e = false;
                    ?? r22 = zVar3.f31787g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    zVar3.d = false;
                    return;
                default:
                    this.f31752b.c(true);
                    return;
            }
        }
    };
    public final bi0 f31783a = new bi0(2131624329, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
    public final bi0 f31784b = new bi0(2131624043, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            x xVar = this.f31791l;
            if (z10) {
                org.telegram.messenger.i0.r(xVar);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f31787g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            org.telegram.messenger.i0.h3(xVar, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f31787g = null;
        this.e = false;
        org.telegram.messenger.i0.r(this.f31791l);
        org.telegram.messenger.i0.r(this.f31789j);
        org.telegram.messenger.i0.r(this.f31792m);
        this.f31783a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        bi0 bi0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f31785c != null && (groupCallParticipant = this.h) != null && (bi0Var = this.f31783a) != null) {
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
                    org.telegram.messenger.i0.h3(this.f31792m, 5000 - j11);
                }
                P = bi0Var.P(136);
            } else {
                this.f31785c.setAnimation(bi0Var);
                bi0Var.S(0, null);
                if (z13 && this.f31786f) {
                    P = bi0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = bi0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        bi0Var.M(99);
                        bi0Var.P(136);
                    } else if (z13 && this.f31786f && !z14) {
                        bi0Var.M(0);
                        bi0Var.P(36);
                    } else if (z13) {
                        bi0Var.M(69);
                        bi0Var.P(99);
                    } else {
                        bi0Var.M(36);
                        bi0Var.P(69);
                    }
                    this.f31785c.d();
                    this.f31785c.invalidate();
                }
            } else {
                bi0Var.N(bi0Var.f24759f - 1, false, true);
                this.f31785c.invalidate();
            }
            this.f31785c.setAnimation(bi0Var);
            this.f31786f = z14;
            if (this.f31790k != z11) {
                this.f31790k = z11;
                ?? r12 = this.f31787g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
