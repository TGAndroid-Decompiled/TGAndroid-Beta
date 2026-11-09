package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class t11 {
    public static final int[] N = {16842910, 16842919};
    public static HashMap O;
    public static HashMap P;
    public static ArrayList Q;
    public Path C;
    public int D;
    public int E;
    public float F;
    public float G;
    public Paint H;
    public Paint I;
    public Paint J;
    public float K;
    public Path L;
    public float[] M;
    public int f38233a;
    public int f38234b;
    public int f38235c;
    public int d;
    public float f38236e;
    public Paint f38237f;
    public Paint f38238g;
    public Path h;
    public boolean f38239i;
    public final w5 f38240j;
    public boolean f38241k;
    public final w5 f38242l;
    public int f38243m;
    public final ah0 f38244n;
    public int f38245o;
    public final ah0 f38246p;
    public org.telegram.ui.Cells.y f38247q;
    public final org.telegram.ui.Cells.q1 f38248r;
    public final qm0 f38249s;
    public final Rect f38251u;
    public final Rect v;
    public final boolean f38253x;
    public boolean f38254y;
    public boolean f38255z;
    public boolean f38252w = false;
    public boolean A = false;
    public final x1.a B = new x1.a();
    public long f38250t = SystemClock.elapsedRealtime();

    public t11(org.telegram.ui.Cells.q1 q1Var, qm0 qm0Var) {
        boolean z9 = false;
        this.f38248r = q1Var;
        this.f38249s = qm0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.f38251u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        ah0 ah0Var = new ah0(2131624301, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f38246p = ah0Var;
        ah0Var.M(0);
        ah0Var.setCallback(q1Var);
        ah0Var.S(19, new Runnable(this) {
            public final t11 f37180b;

            {
                this.f37180b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t11 t11Var = this.f37180b;
                        t11Var.f38246p.stop();
                        ah0 ah0Var2 = t11Var.f38244n;
                        ah0Var2.stop();
                        t11Var.f38255z = true;
                        t11Var.f38254y = true;
                        ah0Var2.M(0);
                        return;
                    default:
                        t11 t11Var2 = this.f37180b;
                        t11Var2.f38244n.stop();
                        ah0 ah0Var3 = t11Var2.f38246p;
                        ah0Var3.stop();
                        t11Var2.f38255z = false;
                        t11Var2.f38254y = false;
                        ah0Var3.M(0);
                        return;
                }
            }
        });
        ah0Var.J(true);
        ah0 ah0Var2 = new ah0(2131624300, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f38244n = ah0Var2;
        ah0Var2.M(0);
        ah0Var2.setCallback(q1Var);
        ah0Var2.R(q1Var);
        ah0Var2.S(19, new Runnable(this) {
            public final t11 f37180b;

            {
                this.f37180b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        t11 t11Var = this.f37180b;
                        t11Var.f38246p.stop();
                        ah0 ah0Var22 = t11Var.f38244n;
                        ah0Var22.stop();
                        t11Var.f38255z = true;
                        t11Var.f38254y = true;
                        ah0Var22.M(0);
                        return;
                    default:
                        t11 t11Var2 = this.f37180b;
                        t11Var2.f38244n.stop();
                        ah0 ah0Var3 = t11Var2.f38246p;
                        ah0Var3.stop();
                        t11Var2.f38255z = false;
                        t11Var2.f38254y = false;
                        ah0Var3.M(0);
                        return;
                }
            }
        });
        ah0Var2.J(true);
        this.f38254y = false;
        this.f38255z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.p10.i(q1Var.getMessageObject().I1).q()) {
            z9 = true;
        }
        this.f38253x = z9;
        xq xqVar = xq.h;
        this.f38242l = new w5(q1Var, 250L, xqVar);
        this.f38240j = new w5(q1Var, 250L, xqVar);
    }

    public static void a(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        float a10 = c8.j9.a(f10, 0.0f, 1.0f);
        float a11 = c8.j9.a(f11, 0.0f, 1.0f) - a10;
        if (a11 <= 0.0f) {
            return;
        }
        if (i12 == 1) {
            org.telegram.messenger.g0.P.set(i7 - i11, i10, i7, i10 + i11);
        } else if (i12 == 2) {
            org.telegram.messenger.g0.P.set(i7 - i11, i10 - i11, i7, i10);
        } else if (i12 == 3) {
            org.telegram.messenger.g0.P.set(i7, i10 - i11, i7 + i11, i10);
        } else if (i12 == 4) {
            org.telegram.messenger.g0.P.set(i7, i10, i7 + i11, i10 + i11);
        }
        path.addArc(org.telegram.messenger.g0.P, (a10 * 90.0f) + ((i12 * 90) - 180), a11 * 90.0f);
    }

    public static void b(Path path, int i7, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (f10 > f11) {
            float f14 = f13 - f12;
            a(path, i7, i10, i11, i12, (f10 - f12) / f14, 1.0f);
            a(path, i7, i10, i11, i12, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        a(path, i7, i10, i11, i12, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
    }

    public static void c(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        if (i7 != i11 || i10 != i12) {
            float a10 = c8.j9.a(f10, 0.0f, 1.0f);
            float a11 = c8.j9.a(f11, 0.0f, 1.0f);
            if (a11 - a10 <= 0.0f) {
                return;
            }
            path.moveTo(org.telegram.messenger.g0.W1(a10, i7, i11), org.telegram.messenger.g0.W1(a10, i10, i12));
            path.lineTo(org.telegram.messenger.g0.W1(a11, i7, i11), org.telegram.messenger.g0.W1(a11, i10, i12));
        }
    }

    public static void d(Path path, int i7, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (i7 == i11 && i10 == i12) {
            return;
        }
        if (f10 > f11) {
            float f14 = f13 - f12;
            c(path, i7, i10, i11, i12, (f10 - f12) / f14, 1.0f);
            c(path, i7, i10, i11, i12, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        c(path, i7, i10, i11, i12, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
    }

    public static boolean e(org.telegram.messenger.ij ijVar) {
        if (ijVar != null) {
            int i7 = ijVar.I1;
            if (ijVar.f23262k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                if (i(ijVar)) {
                    return true;
                }
                if (s12.f24894s4 > 0 && ijVar.L0() <= s12.f24902t4) {
                    if (s12.f24910u4 != 0 && connectionsManager.getCurrentTime() <= s12.f24910u4 && s12.f24919v4 <= 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.ij ijVar, long j3, String str) {
        org.telegram.messenger.ij ijVar2;
        org.telegram.messenger.ij ijVar3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j3))) {
                ijVar2 = (org.telegram.messenger.ij) O.remove(Long.valueOf(j3));
            } else {
                ijVar2 = null;
            }
            if (ijVar == null) {
                ijVar3 = ijVar2;
            } else {
                ijVar3 = ijVar;
            }
            if (ijVar3 != null && ijVar3.f23262k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(n(ijVar3)));
                }
                ijVar3.f23262k.voiceTranscriptionFinal = true;
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(ijVar3.I1);
                long B0 = org.telegram.messenger.ij.B0(ijVar3.f23262k);
                a02.f26719a.c(new org.telegram.messenger.z1(a02, ijVar3.e1(), B0, ijVar3.f23262k, str, 2));
                org.telegram.messenger.g0.h3(new r11(ijVar3, j3, str, 1));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g(int i7) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        if (s12.f24894s4 <= 0) {
            return 0;
        }
        if (s12.f24910u4 != 0 && connectionsManager.getCurrentTime() <= s12.f24910u4) {
            return s12.f24919v4;
        }
        return s12.f24894s4;
    }

    public static boolean i(org.telegram.messenger.ij ijVar) {
        if (ijVar != null && ijVar.f23262k != null) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(ijVar.I1);
            TLRPC.Chat M0 = s12.M0(Long.valueOf(ijVar.x0()));
            if (org.telegram.messenger.t3.n0(M0) && M0.level >= s12.A5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.ij ijVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(ijVar) && !P.containsKey(Integer.valueOf(n(ijVar))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && ijVar != null && (message = ijVar.f23262k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean k(org.telegram.messenger.ij ijVar) {
        if (Q != null) {
            if (!ijVar.h4() || Q.contains(Integer.valueOf(n(ijVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(org.telegram.messenger.ij ijVar) {
        if (ijVar != null && !k(ijVar)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(n(ijVar)));
        }
    }

    public static int n(org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(ijVar.I1), Long.valueOf(org.telegram.messenger.ij.B0(ijVar.f23262k)), Integer.valueOf(ijVar.e1()));
    }

    public static void r(org.telegram.messenger.ij ijVar, boolean z9) {
        TLRPC.Message message = ijVar.f23262k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(ijVar.I1);
            long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
            a02.f26719a.c(new org.telegram.messenger.hk(a02, ijVar.e1(), B0, ijVar.f23262k, 6));
            if (z9) {
                org.telegram.messenger.g0.h3(new kr0(ijVar, 19));
            }
        }
    }

    public static boolean s(org.telegram.messenger.ij ijVar) {
        if (ijVar != null) {
            int i7 = ijVar.I1;
            if (ijVar.f23262k == null || i(ijVar) || !TextUtils.isEmpty(ijVar.f23262k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            if (!org.telegram.messenger.p10.i(i7).q() && s12.f24910u4 != 0 && connectionsManager.getCurrentTime() <= s12.f24910u4 && s12.f24919v4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void t(final org.telegram.messenger.ij ijVar, boolean z9, final org.telegram.ui.Cells.l1 l1Var) {
        if (ijVar != null && ijVar.f23262k != null && ijVar.q4()) {
            final int i7 = ijVar.I1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer m12 = org.telegram.messenger.qp.s1(i7).m1(ijVar.f23262k.peer_id);
            final long n10 = org.telegram.messenger.m5.n(m12);
            TLRPC.Message message = ijVar.f23262k;
            final int i10 = message.f26977id;
            int i11 = 0;
            if (z9) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
                    m(ijVar);
                    ijVar.f23262k.voiceTranscriptionOpen = true;
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
                    a02.f26719a.c(new org.telegram.messenger.hk(a02, i10, n10, ijVar.f23262k, 6));
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            int i12 = r2;
                            org.telegram.messenger.ij ijVar2 = ijVar;
                            int i13 = i7;
                            switch (i12) {
                                case 0:
                                    org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i13);
                                    Boolean bool = Boolean.TRUE;
                                    f10.k(115, ijVar2, null, null, bool, bool);
                                    return;
                                default:
                                    org.telegram.messenger.qs.f(i13).k(115, ijVar2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                }
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n10);
                }
                TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                tL_messages_transcribeAudio.peer = m12;
                tL_messages_transcribeAudio.msg_id = i10;
                if (P == null) {
                    P = new HashMap();
                }
                P.put(Integer.valueOf(n(ijVar)), ijVar);
                if (!org.telegram.messenger.p10.i(i7).q()) {
                    i11 = 1024;
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z10;
                        long j3;
                        String str;
                        boolean z11 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                        int i12 = i7;
                        org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                        org.telegram.messenger.ij ijVar2 = ijVar;
                        String str2 = "";
                        if (z11) {
                            TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                            String str3 = tL_messages_transcribedAudio.text;
                            long j10 = tL_messages_transcribedAudio.transcription_id;
                            boolean z12 = tL_messages_transcribedAudio.pending;
                            z10 = !z12;
                            if (TextUtils.isEmpty(str3)) {
                                if (z12) {
                                    str2 = null;
                                }
                            } else {
                                str2 = str3;
                            }
                            if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                                org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i12);
                                int i13 = tL_messages_transcribedAudio.trial_remains_num;
                                if (i13 != s12.f24919v4) {
                                    s12.f24919v4 = i13;
                                    s12.f24774e7.edit().putInt("transcribeAudioTrialCurrentNumber", s12.f24919v4).apply();
                                }
                                org.telegram.messenger.qp s13 = org.telegram.messenger.qp.s1(i12);
                                int i14 = tL_messages_transcribedAudio.trial_remains_until_date;
                                if (i14 != s13.f24910u4) {
                                    s13.f24910u4 = i14;
                                    s13.f24774e7.edit().putInt("transcribeAudioTrialCooldownUntil", s13.f24910u4).apply();
                                    org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(s13, 3));
                                }
                                org.telegram.messenger.g0.h3(new w80(24, l1Var2, tL_messages_transcribedAudio));
                            }
                            if (t11.O == null) {
                                t11.O = new HashMap();
                            }
                            t11.O.put(Long.valueOf(j10), ijVar2);
                            ijVar2.f23262k.voiceTranscriptionId = j10;
                            j3 = j10;
                        } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.qp s14 = org.telegram.messenger.qp.s1(i12);
                            if (s14.f24919v4 != 0) {
                                s14.f24919v4 = 0;
                                s14.f24774e7.edit().putInt("transcribeAudioTrialCurrentNumber", s14.f24919v4).apply();
                            }
                            org.telegram.messenger.qp s15 = org.telegram.messenger.qp.s1(i12);
                            int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i12).getCurrentTime();
                            if (intValue != s15.f24910u4) {
                                s15.f24910u4 = intValue;
                                s15.f24774e7.edit().putInt("transcribeAudioTrialCooldownUntil", s15.f24910u4).apply();
                                org.telegram.messenger.g0.h3(new org.telegram.messenger.vj(s15, 3));
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.ui.q8(ijVar2, l1Var2, i12, 27));
                            return;
                        } else {
                            z10 = true;
                            j3 = 0;
                        }
                        String str4 = str2;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        t11.m(ijVar2);
                        TLRPC.Message message2 = ijVar2.f23262k;
                        message2.voiceTranscriptionOpen = true;
                        message2.voiceTranscriptionFinal = z10;
                        if (org.telegram.messenger.r2.f25212a) {
                            org.telegram.messenger.a8.b("Transcription request sent, received final=" + z10 + " id=" + j3 + " text=" + str4);
                        }
                        org.telegram.messenger.yr a03 = org.telegram.messenger.yr.a0(i12);
                        a03.f26719a.c(new org.telegram.messenger.z1(a03, i10, n10, ijVar2.f23262k, str4, 2));
                        if (z10) {
                            org.telegram.messenger.g0.i3(new r11(ijVar2, j3, str4, 0), Math.max(0L, 350 - elapsedRealtime2));
                        }
                    }
                }, i11);
                return;
            }
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(n(ijVar)));
            }
            ijVar.f23262k.voiceTranscriptionOpen = false;
            org.telegram.messenger.yr a03 = org.telegram.messenger.yr.a0(i7);
            a03.f26719a.c(new org.telegram.messenger.hk(a03, i10, n10, ijVar.f23262k, 6));
            org.telegram.messenger.g0.h3(new Runnable() {
                @Override
                public final void run() {
                    int i12 = r2;
                    org.telegram.messenger.ij ijVar2 = ijVar;
                    int i13 = i7;
                    switch (i12) {
                        case 0:
                            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(115, ijVar2, null, null, bool, bool);
                            return;
                        default:
                            org.telegram.messenger.qs.f(i13).k(115, ijVar2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final int h() {
        return this.f38251u.height();
    }

    public final void l() {
        boolean z9;
        org.telegram.ui.Cells.q1 q1Var = this.f38248r;
        if (q1Var != null) {
            this.f38252w = false;
            boolean z10 = this.f38255z;
            boolean z11 = !z10;
            boolean z12 = this.f38253x;
            if (!z10) {
                z9 = !this.f38241k;
                if ((z12 || e(q1Var.getMessageObject())) && q1Var.getMessageObject().q4()) {
                    o(true, true);
                }
            } else {
                q(false, true);
                o(false, true);
                z9 = true;
            }
            org.telegram.ui.Cells.y yVar = this.f38247q;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
                q1Var.invalidate();
            }
            this.A = false;
            if (z9) {
                if (!z12 && !z10) {
                    if (!e(q1Var.getMessageObject()) && (q1Var.getMessageObject() == null || q1Var.getMessageObject().f23262k == null || TextUtils.isEmpty(q1Var.getMessageObject().f23262k.voiceTranscription))) {
                        if (q1Var.getDelegate() != null) {
                            if (org.telegram.messenger.qp.s1(q1Var.Z5).f24894s4 > 0) {
                                q1Var.getDelegate().d0(3);
                                return;
                            } else {
                                q1Var.getDelegate().d0(0);
                                return;
                            }
                        }
                        return;
                    }
                    t(q1Var.getMessageObject(), z11, q1Var.getDelegate());
                    return;
                }
                if (!z10) {
                    this.f38252w = true;
                }
                t(q1Var.getMessageObject(), z11, q1Var.getDelegate());
            }
        }
    }

    public final void o(boolean z9, boolean z10) {
        this.f38241k = z9;
        qm0 qm0Var = this.f38249s;
        if (!qm0Var.f37440z && z9 && qm0Var.B.f39910c <= 0.0f) {
            qm0Var.A = SystemClock.elapsedRealtime();
        }
        qm0Var.f37440z = z9;
        org.telegram.ui.Cells.q1 q1Var = qm0Var.f37429n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        w5 w5Var = this.f38242l;
        if (!z10) {
            w5Var.f(this.f38241k, true);
        } else if (w5Var.f39910c <= 0.0f) {
            this.f38250t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.f38248r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void p(boolean z9, boolean z10) {
        org.telegram.ui.Cells.q1 q1Var;
        if (this.f38239i != z9 && (q1Var = this.f38248r) != null) {
            q1Var.invalidate();
        }
        this.f38239i = z9;
        if (!z10) {
            this.f38240j.f(z9, true);
        }
    }

    public final void q(boolean z9, boolean z10) {
        boolean z11 = this.f38255z;
        if (!z11 && z9 && this.f38252w) {
            this.f38252w = false;
            ((org.telegram.ui.Cells.a1) this).R.f28924a.S2 = true;
        }
        this.f38255z = z9;
        ah0 ah0Var = this.f38246p;
        ah0 ah0Var2 = this.f38244n;
        if (z10) {
            if (z9 && !z11) {
                this.f38254y = false;
                ah0Var2.M(0);
                ah0Var.M(0);
                ah0Var.start();
            } else if (!z9 && z11) {
                this.f38254y = true;
                ah0Var.M(0);
                ah0Var2.M(0);
                ah0Var2.start();
            }
        } else {
            this.f38254y = z9;
            ah0Var2.stop();
            ah0Var.stop();
            ah0Var2.M(0);
            ah0Var.M(0);
        }
        org.telegram.ui.Cells.q1 q1Var = this.f38248r;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    public final int u() {
        return this.f38251u.width();
    }
}
