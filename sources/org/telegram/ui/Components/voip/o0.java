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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.yj0;
public final class o0 {
    public bk0 f30040c;
    public boolean d;
    public boolean e;
    public boolean f30041f;
    public FrameLayout f30042g;
    public TLRPC.GroupCallParticipant h;
    public boolean f30045k;
    public final m0 f30043i = new Runnable(this) {
        public final o0 f29995b;

        {
            this.f29995b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f29995b;
                    o0Var.f30039b.S(0, null);
                    yj0 yj0Var = o0Var.f30038a;
                    yj0Var.S(0, null);
                    bk0 bk0Var = o0Var.f30040c;
                    if (bk0Var != null) {
                        bk0Var.setAnimation(yj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f29995b;
                    yj0 yj0Var2 = o0Var2.f30039b;
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
                    yj0Var2.P(i11);
                    yj0Var2.S(i11 - 1, o0Var2.f30043i);
                    yj0Var2.M(i10);
                    bk0 bk0Var2 = o0Var2.f30040c;
                    if (bk0Var2 != null) {
                        bk0Var2.setAnimation(yj0Var2);
                        o0Var2.f30040c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f29995b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f30042g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f29995b.c(true);
                    return;
            }
        }
    };
    public final m0 f30044j = new Runnable(this) {
        public final o0 f29995b;

        {
            this.f29995b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f29995b;
                    o0Var.f30039b.S(0, null);
                    yj0 yj0Var = o0Var.f30038a;
                    yj0Var.S(0, null);
                    bk0 bk0Var = o0Var.f30040c;
                    if (bk0Var != null) {
                        bk0Var.setAnimation(yj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f29995b;
                    yj0 yj0Var2 = o0Var2.f30039b;
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
                    yj0Var2.P(i11);
                    yj0Var2.S(i11 - 1, o0Var2.f30043i);
                    yj0Var2.M(i10);
                    bk0 bk0Var2 = o0Var2.f30040c;
                    if (bk0Var2 != null) {
                        bk0Var2.setAnimation(yj0Var2);
                        o0Var2.f30040c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f29995b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f30042g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f29995b.c(true);
                    return;
            }
        }
    };
    public final m0 f30046l = new Runnable(this) {
        public final o0 f29995b;

        {
            this.f29995b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f29995b;
                    o0Var.f30039b.S(0, null);
                    yj0 yj0Var = o0Var.f30038a;
                    yj0Var.S(0, null);
                    bk0 bk0Var = o0Var.f30040c;
                    if (bk0Var != null) {
                        bk0Var.setAnimation(yj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f29995b;
                    yj0 yj0Var2 = o0Var2.f30039b;
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
                    yj0Var2.P(i11);
                    yj0Var2.S(i11 - 1, o0Var2.f30043i);
                    yj0Var2.M(i10);
                    bk0 bk0Var2 = o0Var2.f30040c;
                    if (bk0Var2 != null) {
                        bk0Var2.setAnimation(yj0Var2);
                        o0Var2.f30040c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f29995b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f30042g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f29995b.c(true);
                    return;
            }
        }
    };
    public final m0 f30047m = new Runnable(this) {
        public final o0 f29995b;

        {
            this.f29995b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    o0 o0Var = this.f29995b;
                    o0Var.f30039b.S(0, null);
                    yj0 yj0Var = o0Var.f30038a;
                    yj0Var.S(0, null);
                    bk0 bk0Var = o0Var.f30040c;
                    if (bk0Var != null) {
                        bk0Var.setAnimation(yj0Var);
                        return;
                    }
                    return;
                case 1:
                    o0 o0Var2 = this.f29995b;
                    yj0 yj0Var2 = o0Var2.f30039b;
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
                    yj0Var2.P(i11);
                    yj0Var2.S(i11 - 1, o0Var2.f30043i);
                    yj0Var2.M(i10);
                    bk0 bk0Var2 = o0Var2.f30040c;
                    if (bk0Var2 != null) {
                        bk0Var2.setAnimation(yj0Var2);
                        o0Var2.f30040c.d();
                        return;
                    }
                    return;
                case 2:
                    o0 o0Var3 = this.f29995b;
                    o0Var3.e = false;
                    ?? r22 = o0Var3.f30042g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    o0Var3.d = false;
                    return;
                default:
                    this.f29995b.c(true);
                    return;
            }
        }
    };
    public final yj0 f30038a = new yj0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final yj0 f30039b = new yj0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            m0 m0Var = this.f30046l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(m0Var);
            }
            if (!this.e) {
                this.e = true;
                ?? r42 = this.f30042g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(m0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f30042g = null;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f30046l);
        AndroidUtilities.cancelRunOnUIThread(this.f30044j);
        AndroidUtilities.cancelRunOnUIThread(this.f30047m);
        this.f30038a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        yj0 yj0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f30040c != null && (groupCallParticipant = this.h) != null && (yj0Var = this.f30038a) != null) {
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
                    AndroidUtilities.runOnUIThread(this.f30047m, 5000 - j11);
                }
                P = yj0Var.P(136);
            } else {
                this.f30040c.setAnimation(yj0Var);
                yj0Var.S(0, null);
                if (z13 && this.f30041f) {
                    P = yj0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = yj0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        yj0Var.M(99);
                        yj0Var.P(136);
                    } else if (z13 && this.f30041f && !z14) {
                        yj0Var.M(0);
                        yj0Var.P(36);
                    } else if (z13) {
                        yj0Var.M(69);
                        yj0Var.P(99);
                    } else {
                        yj0Var.M(36);
                        yj0Var.P(69);
                    }
                    this.f30040c.d();
                    this.f30040c.invalidate();
                }
            } else {
                yj0Var.N(yj0Var.f31292f - 1, false, true);
                this.f30040c.invalidate();
            }
            this.f30040c.setAnimation(yj0Var);
            this.f30041f = z14;
            if (this.f30045k != z11) {
                this.f30045k = z11;
                ?? r12 = this.f30042g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
