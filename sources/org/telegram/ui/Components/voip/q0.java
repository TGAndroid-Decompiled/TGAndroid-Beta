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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.ik0;
public final class q0 {
    public ik0 f31897c;
    public boolean d;
    public boolean f31898e;
    public boolean f31899f;
    public FrameLayout f31900g;
    public TLRPC.GroupCallParticipant h;
    public boolean f31903k;
    public final o0 f31901i = new Runnable(this) {
        public final q0 f31849b;

        {
            this.f31849b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f31849b;
                    q0Var.f31896b.S(0, null);
                    fk0 fk0Var = q0Var.f31895a;
                    fk0Var.S(0, null);
                    ik0 ik0Var = q0Var.f31897c;
                    if (ik0Var != null) {
                        ik0Var.setAnimation(fk0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f31849b;
                    fk0 fk0Var2 = q0Var2.f31896b;
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
                    fk0Var2.P(i11);
                    fk0Var2.S(i11 - 1, q0Var2.f31901i);
                    fk0Var2.M(i10);
                    ik0 ik0Var2 = q0Var2.f31897c;
                    if (ik0Var2 != null) {
                        ik0Var2.setAnimation(fk0Var2);
                        q0Var2.f31897c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f31849b;
                    q0Var3.f31898e = false;
                    ?? r22 = q0Var3.f31900g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f31849b.c(true);
                    return;
            }
        }
    };
    public final o0 f31902j = new Runnable(this) {
        public final q0 f31849b;

        {
            this.f31849b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f31849b;
                    q0Var.f31896b.S(0, null);
                    fk0 fk0Var = q0Var.f31895a;
                    fk0Var.S(0, null);
                    ik0 ik0Var = q0Var.f31897c;
                    if (ik0Var != null) {
                        ik0Var.setAnimation(fk0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f31849b;
                    fk0 fk0Var2 = q0Var2.f31896b;
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
                    fk0Var2.P(i11);
                    fk0Var2.S(i11 - 1, q0Var2.f31901i);
                    fk0Var2.M(i10);
                    ik0 ik0Var2 = q0Var2.f31897c;
                    if (ik0Var2 != null) {
                        ik0Var2.setAnimation(fk0Var2);
                        q0Var2.f31897c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f31849b;
                    q0Var3.f31898e = false;
                    ?? r22 = q0Var3.f31900g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f31849b.c(true);
                    return;
            }
        }
    };
    public final o0 f31904l = new Runnable(this) {
        public final q0 f31849b;

        {
            this.f31849b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f31849b;
                    q0Var.f31896b.S(0, null);
                    fk0 fk0Var = q0Var.f31895a;
                    fk0Var.S(0, null);
                    ik0 ik0Var = q0Var.f31897c;
                    if (ik0Var != null) {
                        ik0Var.setAnimation(fk0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f31849b;
                    fk0 fk0Var2 = q0Var2.f31896b;
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
                    fk0Var2.P(i11);
                    fk0Var2.S(i11 - 1, q0Var2.f31901i);
                    fk0Var2.M(i10);
                    ik0 ik0Var2 = q0Var2.f31897c;
                    if (ik0Var2 != null) {
                        ik0Var2.setAnimation(fk0Var2);
                        q0Var2.f31897c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f31849b;
                    q0Var3.f31898e = false;
                    ?? r22 = q0Var3.f31900g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f31849b.c(true);
                    return;
            }
        }
    };
    public final o0 f31905m = new Runnable(this) {
        public final q0 f31849b;

        {
            this.f31849b = this;
        }

        @Override
        public final void run() {
            int i10;
            switch (r2) {
                case 0:
                    q0 q0Var = this.f31849b;
                    q0Var.f31896b.S(0, null);
                    fk0 fk0Var = q0Var.f31895a;
                    fk0Var.S(0, null);
                    ik0 ik0Var = q0Var.f31897c;
                    if (ik0Var != null) {
                        ik0Var.setAnimation(fk0Var);
                        return;
                    }
                    return;
                case 1:
                    q0 q0Var2 = this.f31849b;
                    fk0 fk0Var2 = q0Var2.f31896b;
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
                    fk0Var2.P(i11);
                    fk0Var2.S(i11 - 1, q0Var2.f31901i);
                    fk0Var2.M(i10);
                    ik0 ik0Var2 = q0Var2.f31897c;
                    if (ik0Var2 != null) {
                        ik0Var2.setAnimation(fk0Var2);
                        q0Var2.f31897c.d();
                        return;
                    }
                    return;
                case 2:
                    q0 q0Var3 = this.f31849b;
                    q0Var3.f31898e = false;
                    ?? r22 = q0Var3.f31900g;
                    if (r22 != 0) {
                        r22.a();
                    }
                    q0Var3.d = false;
                    return;
                default:
                    this.f31849b.c(true);
                    return;
            }
        }
    };
    public final fk0 f31895a = new fk0(R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
    public final fk0 f31896b = new fk0(R.raw.hand_2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), true, null);

    public final void a(double d) {
        if (d > 1.5d) {
            boolean z10 = this.d;
            o0 o0Var = this.f31904l;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(o0Var);
            }
            if (!this.f31898e) {
                this.f31898e = true;
                ?? r42 = this.f31900g;
                if (r42 != 0) {
                    r42.a();
                }
            }
            AndroidUtilities.runOnUIThread(o0Var, 500L);
            this.d = true;
        }
    }

    public final void b() {
        this.f31900g = null;
        this.f31898e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f31904l);
        AndroidUtilities.cancelRunOnUIThread(this.f31902j);
        AndroidUtilities.cancelRunOnUIThread(this.f31905m);
        this.f31895a.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
    }

    public final void c(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        fk0 fk0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean P;
        boolean z15;
        if (this.f31897c != null && (groupCallParticipant = this.h) != null && (fk0Var = this.f31895a) != null) {
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
            if (!groupCallParticipant2.self ? !((!groupCallParticipant2.muted || (this.f31898e && z12)) && !z11) : !(VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute() || (this.f31898e && z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant3 = this.h;
            if (((groupCallParticipant3.muted && !this.f31898e) || z11) && ((!(z15 = groupCallParticipant3.can_self_unmute) || z11) && !z15 && groupCallParticipant3.raise_hand_rating != 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = this.h.lastRaiseHandDate;
                long j10 = elapsedRealtime2 - j3;
                if (j3 != 0 && j10 <= 5000) {
                    AndroidUtilities.runOnUIThread(this.f31905m, 5000 - j10);
                }
                P = fk0Var.P(136);
            } else {
                this.f31897c.setAnimation(fk0Var);
                fk0Var.S(0, null);
                if (z13 && this.f31899f) {
                    P = fk0Var.P(36);
                } else {
                    if (z13) {
                        i10 = 99;
                    } else {
                        i10 = 69;
                    }
                    P = fk0Var.P(i10);
                }
            }
            if (z10) {
                if (P) {
                    if (z14) {
                        fk0Var.M(99);
                        fk0Var.P(136);
                    } else if (z13 && this.f31899f && !z14) {
                        fk0Var.M(0);
                        fk0Var.P(36);
                    } else if (z13) {
                        fk0Var.M(69);
                        fk0Var.P(99);
                    } else {
                        fk0Var.M(36);
                        fk0Var.P(69);
                    }
                    this.f31897c.d();
                    this.f31897c.invalidate();
                }
            } else {
                fk0Var.N(fk0Var.f26111f - 1, false, true);
                this.f31897c.invalidate();
            }
            this.f31897c.setAnimation(fk0Var);
            this.f31899f = z14;
            if (this.f31903k != z11) {
                this.f31903k = z11;
                ?? r12 = this.f31900g;
                if (r12 != 0) {
                    r12.a();
                }
            }
        }
    }
}
