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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nj0;
public final class p0 {
    public nj0 f29516c;
    public boolean d;
    public boolean e;
    public boolean f29517f;
    public FrameLayout f29518g;
    public TLRPC.GroupCallParticipant h;
    public boolean f29521k;
    public final n0 f29519i = new Runnable(this) {
        public final p0 f29471b;

        {
            this.f29471b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29471b;
                    p0Var.f29515b.S(0, null);
                    kj0 kj0Var = p0Var.f29514a;
                    kj0Var.S(0, null);
                    nj0 nj0Var = p0Var.f29516c;
                    if (nj0Var != null) {
                        nj0Var.setAnimation(kj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29471b;
                    kj0 kj0Var2 = p0Var2.f29515b;
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
                    kj0Var2.P(i11);
                    kj0Var2.S(i11 - 1, p0Var2.f29519i);
                    kj0Var2.M(i10);
                    nj0 nj0Var2 = p0Var2.f29516c;
                    if (nj0Var2 != null) {
                        nj0Var2.setAnimation(kj0Var2);
                        p0Var2.f29516c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29471b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29518g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29471b.c(true);
                    return;
            }
        }
    };
    public final n0 f29520j = new Runnable(this) {
        public final p0 f29471b;

        {
            this.f29471b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29471b;
                    p0Var.f29515b.S(0, null);
                    kj0 kj0Var = p0Var.f29514a;
                    kj0Var.S(0, null);
                    nj0 nj0Var = p0Var.f29516c;
                    if (nj0Var != null) {
                        nj0Var.setAnimation(kj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29471b;
                    kj0 kj0Var2 = p0Var2.f29515b;
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
                    kj0Var2.P(i11);
                    kj0Var2.S(i11 - 1, p0Var2.f29519i);
                    kj0Var2.M(i10);
                    nj0 nj0Var2 = p0Var2.f29516c;
                    if (nj0Var2 != null) {
                        nj0Var2.setAnimation(kj0Var2);
                        p0Var2.f29516c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29471b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29518g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29471b.c(true);
                    return;
            }
        }
    };
    public final n0 f29522l = new Runnable(this) {
        public final p0 f29471b;

        {
            this.f29471b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29471b;
                    p0Var.f29515b.S(0, null);
                    kj0 kj0Var = p0Var.f29514a;
                    kj0Var.S(0, null);
                    nj0 nj0Var = p0Var.f29516c;
                    if (nj0Var != null) {
                        nj0Var.setAnimation(kj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29471b;
                    kj0 kj0Var2 = p0Var2.f29515b;
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
                    kj0Var2.P(i11);
                    kj0Var2.S(i11 - 1, p0Var2.f29519i);
                    kj0Var2.M(i10);
                    nj0 nj0Var2 = p0Var2.f29516c;
                    if (nj0Var2 != null) {
                        nj0Var2.setAnimation(kj0Var2);
                        p0Var2.f29516c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29471b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29518g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29471b.c(true);
                    return;
            }
        }
    };
    public final n0 f29523m = new Runnable(this) {
        public final p0 f29471b;

        {
            this.f29471b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29471b;
                    p0Var.f29515b.S(0, null);
                    kj0 kj0Var = p0Var.f29514a;
                    kj0Var.S(0, null);
                    nj0 nj0Var = p0Var.f29516c;
                    if (nj0Var != null) {
                        nj0Var.setAnimation(kj0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29471b;
                    kj0 kj0Var2 = p0Var2.f29515b;
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
                    kj0Var2.P(i11);
                    kj0Var2.S(i11 - 1, p0Var2.f29519i);
                    kj0Var2.M(i10);
                    nj0 nj0Var2 = p0Var2.f29516c;
                    if (nj0Var2 != null) {
                        nj0Var2.setAnimation(kj0Var2);
                        p0Var2.f29516c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29471b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29518g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29471b.c(true);
                    return;
            }
        }
    };
    public final kj0 f29514a = new kj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final kj0 f29515b = new kj0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.f29522l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f29518g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f29518g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f29522l);
        AndroidUtilities.cancelRunOnUIThread(this.f29520j);
        AndroidUtilities.cancelRunOnUIThread(this.f29523m);
        this.f29514a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        kj0 kj0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f29516c != null && (groupCallParticipant = this.h) != null && (kj0Var = this.f29514a) != null) {
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
                    AndroidUtilities.runOnUIThread(this.f29523m, 5000 - j10);
                }
                P = kj0Var.P(136);
            } else {
                this.f29516c.setAnimation(kj0Var);
                kj0Var.S(0, null);
                if (z13 && this.f29517f) {
                    P = kj0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = kj0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        kj0Var.M(99);
                        kj0Var.P(136);
                    } else if (z13 && this.f29517f && !z14) {
                        kj0Var.M(0);
                        kj0Var.P(36);
                    } else if (z13) {
                        kj0Var.M(69);
                        kj0Var.P(99);
                    } else {
                        kj0Var.M(36);
                        kj0Var.P(69);
                    }
                    this.f29516c.d();
                    this.f29516c.invalidate();
                }
            } else {
                kj0Var.N(kj0Var.f25718f - 1, false, true);
                this.f29516c.invalidate();
            }
            this.f29516c.setAnimation(kj0Var);
            this.f29517f = z14;
            if (this.f29521k != z11) {
                this.f29521k = z11;
                ?? r12 = this.f29518g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
