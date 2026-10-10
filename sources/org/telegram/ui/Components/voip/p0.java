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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gk0;
public final class p0 {
    public gk0 f32217c;
    public boolean d;
    public boolean f32218e;
    public boolean f32219f;
    public FrameLayout f32220g;
    public TLRPC.GroupCallParticipant h;
    public boolean f32223k;
    public final n0 f32221i = new Runnable(this) {
        public final p0 f32170b;

        {
            this.f32170b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32170b;
                    p0Var.f32216b.S(0, null);
                    dk0 dk0Var = p0Var.f32215a;
                    dk0Var.S(0, null);
                    gk0 gk0Var = p0Var.f32217c;
                    if (gk0Var != null) {
                        gk0Var.setAnimation(dk0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32170b;
                    dk0 dk0Var2 = p0Var2.f32216b;
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
                    dk0Var2.P(i11);
                    dk0Var2.S(i11 - 1, p0Var2.f32221i);
                    dk0Var2.M(i10);
                    gk0 gk0Var2 = p0Var2.f32217c;
                    if (gk0Var2 != null) {
                        gk0Var2.setAnimation(dk0Var2);
                        p0Var2.f32217c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32170b;
                    p0Var3.f32218e = false;
                    ?? r22 = p0Var3.f32220g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32170b.c(true);
                    return;
            }
        }
    };
    public final n0 f32222j = new Runnable(this) {
        public final p0 f32170b;

        {
            this.f32170b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32170b;
                    p0Var.f32216b.S(0, null);
                    dk0 dk0Var = p0Var.f32215a;
                    dk0Var.S(0, null);
                    gk0 gk0Var = p0Var.f32217c;
                    if (gk0Var != null) {
                        gk0Var.setAnimation(dk0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32170b;
                    dk0 dk0Var2 = p0Var2.f32216b;
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
                    dk0Var2.P(i11);
                    dk0Var2.S(i11 - 1, p0Var2.f32221i);
                    dk0Var2.M(i10);
                    gk0 gk0Var2 = p0Var2.f32217c;
                    if (gk0Var2 != null) {
                        gk0Var2.setAnimation(dk0Var2);
                        p0Var2.f32217c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32170b;
                    p0Var3.f32218e = false;
                    ?? r22 = p0Var3.f32220g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32170b.c(true);
                    return;
            }
        }
    };
    public final n0 f32224l = new Runnable(this) {
        public final p0 f32170b;

        {
            this.f32170b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32170b;
                    p0Var.f32216b.S(0, null);
                    dk0 dk0Var = p0Var.f32215a;
                    dk0Var.S(0, null);
                    gk0 gk0Var = p0Var.f32217c;
                    if (gk0Var != null) {
                        gk0Var.setAnimation(dk0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32170b;
                    dk0 dk0Var2 = p0Var2.f32216b;
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
                    dk0Var2.P(i11);
                    dk0Var2.S(i11 - 1, p0Var2.f32221i);
                    dk0Var2.M(i10);
                    gk0 gk0Var2 = p0Var2.f32217c;
                    if (gk0Var2 != null) {
                        gk0Var2.setAnimation(dk0Var2);
                        p0Var2.f32217c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32170b;
                    p0Var3.f32218e = false;
                    ?? r22 = p0Var3.f32220g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32170b.c(true);
                    return;
            }
        }
    };
    public final n0 f32225m = new Runnable(this) {
        public final p0 f32170b;

        {
            this.f32170b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    p0 p0Var = this.f32170b;
                    p0Var.f32216b.S(0, null);
                    dk0 dk0Var = p0Var.f32215a;
                    dk0Var.S(0, null);
                    gk0 gk0Var = p0Var.f32217c;
                    if (gk0Var != null) {
                        gk0Var.setAnimation(dk0Var);
                        return;
                    }
                    return;
                case 1:
                    p0 p0Var2 = this.f32170b;
                    dk0 dk0Var2 = p0Var2.f32216b;
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
                    dk0Var2.P(i11);
                    dk0Var2.S(i11 - 1, p0Var2.f32221i);
                    dk0Var2.M(i10);
                    gk0 gk0Var2 = p0Var2.f32217c;
                    if (gk0Var2 != null) {
                        gk0Var2.setAnimation(dk0Var2);
                        p0Var2.f32217c.d();
                        return;
                    }
                    return;
                case 2:
                    p0 p0Var3 = this.f32170b;
                    p0Var3.f32218e = false;
                    ?? r22 = p0Var3.f32220g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    p0Var3.d = false;
                    return;
                default:
                    this.f32170b.c(true);
                    return;
            }
        }
    };
    public final dk0 f32215a = new dk0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final dk0 f32216b = new dk0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            n0 n0Var = this.f32224l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(n0Var);
            }
            if (!this.f32218e) {
                this.f32218e = true;
                ?? r42 = this.f32220g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(n0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f32220g = null;
        this.f32218e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f32224l);
        AndroidUtilities.cancelRunOnUIThread(this.f32222j);
        AndroidUtilities.cancelRunOnUIThread(this.f32225m);
        this.f32215a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        dk0 dk0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f32217c != null && (groupCallParticipant = this.h) != null && (dk0Var = this.f32215a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f32218e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f32218e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f32218e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f32225m, 5000 - j10);
                }
                P = dk0Var.P(136);
            } else {
                this.f32217c.setAnimation(dk0Var);
                dk0Var.S(0, null);
                if (z13 && this.f32219f) {
                    P = dk0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = dk0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        dk0Var.M(99);
                        dk0Var.P(136);
                    } else if (z13 && this.f32219f && !z14) {
                        dk0Var.M(0);
                        dk0Var.P(36);
                    } else if (z13) {
                        dk0Var.M(69);
                        dk0Var.P(99);
                    } else {
                        dk0Var.M(36);
                        dk0Var.P(69);
                    }
                    this.f32217c.d();
                    this.f32217c.invalidate();
                }
            } else {
                dk0Var.N(dk0Var.f25734f - 1, false, true);
                this.f32217c.invalidate();
            }
            this.f32217c.setAnimation(dk0Var);
            this.f32219f = z14;
            if (this.f32223k != z11) {
                this.f32223k = z11;
                ?? r12 = this.f32220g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
