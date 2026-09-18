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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.yi0;
public final class p0 {
    public bj0 f29131c;
    public boolean d;
    public boolean e;
    public boolean f29132f;
    public FrameLayout f29133g;
    public TLRPC.GroupCallParticipant h;
    public boolean f29136k;
    public final n0 f29134i = new Runnable(this) {
        public final p0 f29086b;

        {
            this.f29086b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29086b;
                    p0Var.f29130b.S(0, null);
                    yi0 yi0Var = p0Var.f29129a;
                    yi0Var.S(0, null);
                    bj0 bj0Var = p0Var.f29131c;
                    if (bj0Var != null) {
                        bj0Var.setAnimation(yi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29086b;
                    yi0 yi0Var2 = p0Var2.f29130b;
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
                    yi0Var2.P(i11);
                    yi0Var2.S(i11 - 1, p0Var2.f29134i);
                    yi0Var2.M(i10);
                    bj0 bj0Var2 = p0Var2.f29131c;
                    if (bj0Var2 != null) {
                        bj0Var2.setAnimation(yi0Var2);
                        p0Var2.f29131c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29086b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29133g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29086b.c(true);
                    return;
            }
        }
    };
    public final n0 f29135j = new Runnable(this) {
        public final p0 f29086b;

        {
            this.f29086b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29086b;
                    p0Var.f29130b.S(0, null);
                    yi0 yi0Var = p0Var.f29129a;
                    yi0Var.S(0, null);
                    bj0 bj0Var = p0Var.f29131c;
                    if (bj0Var != null) {
                        bj0Var.setAnimation(yi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29086b;
                    yi0 yi0Var2 = p0Var2.f29130b;
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
                    yi0Var2.P(i11);
                    yi0Var2.S(i11 - 1, p0Var2.f29134i);
                    yi0Var2.M(i10);
                    bj0 bj0Var2 = p0Var2.f29131c;
                    if (bj0Var2 != null) {
                        bj0Var2.setAnimation(yi0Var2);
                        p0Var2.f29131c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29086b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29133g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29086b.c(true);
                    return;
            }
        }
    };
    public final n0 f29137l = new Runnable(this) {
        public final p0 f29086b;

        {
            this.f29086b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29086b;
                    p0Var.f29130b.S(0, null);
                    yi0 yi0Var = p0Var.f29129a;
                    yi0Var.S(0, null);
                    bj0 bj0Var = p0Var.f29131c;
                    if (bj0Var != null) {
                        bj0Var.setAnimation(yi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29086b;
                    yi0 yi0Var2 = p0Var2.f29130b;
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
                    yi0Var2.P(i11);
                    yi0Var2.S(i11 - 1, p0Var2.f29134i);
                    yi0Var2.M(i10);
                    bj0 bj0Var2 = p0Var2.f29131c;
                    if (bj0Var2 != null) {
                        bj0Var2.setAnimation(yi0Var2);
                        p0Var2.f29131c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29086b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29133g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29086b.c(true);
                    return;
            }
        }
    };
    public final n0 f29138m = new Runnable(this) {
        public final p0 f29086b;

        {
            this.f29086b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29086b;
                    p0Var.f29130b.S(0, null);
                    yi0 yi0Var = p0Var.f29129a;
                    yi0Var.S(0, null);
                    bj0 bj0Var = p0Var.f29131c;
                    if (bj0Var != null) {
                        bj0Var.setAnimation(yi0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29086b;
                    yi0 yi0Var2 = p0Var2.f29130b;
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
                    yi0Var2.P(i11);
                    yi0Var2.S(i11 - 1, p0Var2.f29134i);
                    yi0Var2.M(i10);
                    bj0 bj0Var2 = p0Var2.f29131c;
                    if (bj0Var2 != null) {
                        bj0Var2.setAnimation(yi0Var2);
                        p0Var2.f29131c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29086b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29133g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29086b.c(true);
                    return;
            }
        }
    };
    public final yi0 f29129a = new yi0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final yi0 f29130b = new yi0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.f29137l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f29133g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f29133g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f29137l);
        AndroidUtilities.cancelRunOnUIThread(this.f29135j);
        AndroidUtilities.cancelRunOnUIThread(this.f29138m);
        this.f29129a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        yi0 yi0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f29131c != null && (groupCallParticipant = this.h) != null && (yi0Var = this.f29129a) != null) {
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
                    AndroidUtilities.runOnUIThread(this.f29138m, 5000 - j10);
                }
                P = yi0Var.P(136);
            } else {
                this.f29131c.setAnimation(yi0Var);
                yi0Var.S(0, null);
                if (z13 && this.f29132f) {
                    P = yi0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = yi0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        yi0Var.M(99);
                        yi0Var.P(136);
                    } else if (z13 && this.f29132f && !z14) {
                        yi0Var.M(0);
                        yi0Var.P(36);
                    } else if (z13) {
                        yi0Var.M(69);
                        yi0Var.P(99);
                    } else {
                        yi0Var.M(36);
                        yi0Var.P(69);
                    }
                    this.f29131c.d();
                    this.f29131c.invalidate();
                }
            } else {
                yi0Var.N(yi0Var.f30229f - 1, false, true);
                this.f29131c.invalidate();
            }
            this.f29131c.setAnimation(yi0Var);
            this.f29132f = z14;
            if (this.f29136k != z11) {
                this.f29136k = z11;
                ?? r12 = this.f29133g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
