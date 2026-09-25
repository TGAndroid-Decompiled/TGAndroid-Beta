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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
public final class p0 {
    public lj0 f29541c;
    public boolean d;
    public boolean e;
    public boolean f29542f;
    public FrameLayout f29543g;
    public TLRPC.GroupCallParticipant h;
    public boolean f29546k;
    public final n0 f29544i = new Runnable(this) {
        public final p0 f29504b;

        {
            this.f29504b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29504b;
                    p0Var.f29540b.S(0, null);
                    ij0 ij0Var = p0Var.f29539a;
                    ij0Var.S(0, null);
                    lj0 lj0Var = p0Var.f29541c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29504b;
                    ij0 ij0Var2 = p0Var2.f29540b;
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
                    ij0Var2.P(i11);
                    ij0Var2.S(i11 - 1, p0Var2.f29544i);
                    ij0Var2.M(i10);
                    lj0 lj0Var2 = p0Var2.f29541c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        p0Var2.f29541c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29504b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29543g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29504b.c(true);
                    return;
            }
        }
    };
    public final n0 f29545j = new Runnable(this) {
        public final p0 f29504b;

        {
            this.f29504b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29504b;
                    p0Var.f29540b.S(0, null);
                    ij0 ij0Var = p0Var.f29539a;
                    ij0Var.S(0, null);
                    lj0 lj0Var = p0Var.f29541c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29504b;
                    ij0 ij0Var2 = p0Var2.f29540b;
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
                    ij0Var2.P(i11);
                    ij0Var2.S(i11 - 1, p0Var2.f29544i);
                    ij0Var2.M(i10);
                    lj0 lj0Var2 = p0Var2.f29541c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        p0Var2.f29541c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29504b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29543g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29504b.c(true);
                    return;
            }
        }
    };
    public final n0 f29547l = new Runnable(this) {
        public final p0 f29504b;

        {
            this.f29504b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29504b;
                    p0Var.f29540b.S(0, null);
                    ij0 ij0Var = p0Var.f29539a;
                    ij0Var.S(0, null);
                    lj0 lj0Var = p0Var.f29541c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29504b;
                    ij0 ij0Var2 = p0Var2.f29540b;
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
                    ij0Var2.P(i11);
                    ij0Var2.S(i11 - 1, p0Var2.f29544i);
                    ij0Var2.M(i10);
                    lj0 lj0Var2 = p0Var2.f29541c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        p0Var2.f29541c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29504b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29543g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29504b.c(true);
                    return;
            }
        }
    };
    public final n0 f29548m = new Runnable(this) {
        public final p0 f29504b;

        {
            this.f29504b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f29504b;
                    p0Var.f29540b.S(0, null);
                    ij0 ij0Var = p0Var.f29539a;
                    ij0Var.S(0, null);
                    lj0 lj0Var = p0Var.f29541c;
                    if (lj0Var != null) {
                        lj0Var.setAnimation(ij0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f29504b;
                    ij0 ij0Var2 = p0Var2.f29540b;
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
                    ij0Var2.P(i11);
                    ij0Var2.S(i11 - 1, p0Var2.f29544i);
                    ij0Var2.M(i10);
                    lj0 lj0Var2 = p0Var2.f29541c;
                    if (lj0Var2 != null) {
                        lj0Var2.setAnimation(ij0Var2);
                        p0Var2.f29541c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f29504b;
                    p0Var3.e = false;
                    ?? r22 = p0Var3.f29543g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f29504b.c(true);
                    return;
            }
        }
    };
    public final ij0 f29539a = new ij0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final ij0 f29540b = new ij0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.f29547l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f29543g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f29543g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f29547l);
        AndroidUtilities.cancelRunOnUIThread(this.f29545j);
        AndroidUtilities.cancelRunOnUIThread(this.f29548m);
        this.f29539a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ij0 ij0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f29541c != null && (groupCallParticipant = this.h) != null && (ij0Var = this.f29539a) != null) {
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
                    AndroidUtilities.runOnUIThread(this.f29548m, 5000 - j10);
                }
                P = ij0Var.P(136);
            } else {
                this.f29541c.setAnimation(ij0Var);
                ij0Var.S(0, null);
                if (z13 && this.f29542f) {
                    P = ij0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = ij0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        ij0Var.M(99);
                        ij0Var.P(136);
                    } else if (z13 && this.f29542f && !z14) {
                        ij0Var.M(0);
                        ij0Var.P(36);
                    } else if (z13) {
                        ij0Var.M(69);
                        ij0Var.P(99);
                    } else {
                        ij0Var.M(36);
                        ij0Var.P(69);
                    }
                    this.f29541c.d();
                    this.f29541c.invalidate();
                }
            } else {
                ij0Var.N(ij0Var.f25076f - 1, false, true);
                this.f29541c.invalidate();
            }
            this.f29541c.setAnimation(ij0Var);
            this.f29542f = z14;
            if (this.f29546k != z11) {
                this.f29546k = z11;
                ?? r12 = this.f29543g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
