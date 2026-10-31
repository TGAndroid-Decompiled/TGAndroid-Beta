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
public abstract class u21 {
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
    public int f30769a;
    public int f30770b;
    public int f30771c;
    public int d;
    public float e;
    public Paint f30772f;
    public Paint f30773g;
    public Path h;
    public boolean f30774i;
    public final t5 f30775j;
    public boolean f30776k;
    public final t5 f30777l;
    public int f30778m;
    public final bi0 f30779n;
    public int f30780o;
    public final bi0 f30781p;
    public org.telegram.ui.Cells.y f30782q;
    public final org.telegram.ui.Cells.q1 f30783r;
    public final qn0 f30784s;
    public final Rect f30786u;
    public final Rect v;
    public final boolean f30788x;
    public boolean f30789y;
    public boolean f30790z;
    public boolean f30787w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();
    public long f30785t = SystemClock.elapsedRealtime();

    public u21(org.telegram.ui.Cells.q1 q1Var, qn0 qn0Var) {
        boolean z10 = false;
        this.f30783r = q1Var;
        this.f30784s = qn0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
        this.f30786u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        bi0 bi0Var = new bi0(2131624299, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f));
        this.f30781p = bi0Var;
        bi0Var.M(0);
        bi0Var.setCallback(q1Var);
        bi0Var.S(19, new Runnable(this) {
            public final u21 f29809b;

            {
                this.f29809b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u21 u21Var = this.f29809b;
                        u21Var.f30781p.stop();
                        bi0 bi0Var2 = u21Var.f30779n;
                        bi0Var2.stop();
                        u21Var.f30790z = true;
                        u21Var.f30789y = true;
                        bi0Var2.M(0);
                        return;
                    default:
                        u21 u21Var2 = this.f29809b;
                        u21Var2.f30779n.stop();
                        bi0 bi0Var3 = u21Var2.f30781p;
                        bi0Var3.stop();
                        u21Var2.f30790z = false;
                        u21Var2.f30789y = false;
                        bi0Var3.M(0);
                        return;
                }
            }
        });
        bi0Var.J(true);
        bi0 bi0Var2 = new bi0(2131624298, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f));
        this.f30779n = bi0Var2;
        bi0Var2.M(0);
        bi0Var2.setCallback(q1Var);
        bi0Var2.R(q1Var);
        bi0Var2.S(19, new Runnable(this) {
            public final u21 f29809b;

            {
                this.f29809b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u21 u21Var = this.f29809b;
                        u21Var.f30781p.stop();
                        bi0 bi0Var22 = u21Var.f30779n;
                        bi0Var22.stop();
                        u21Var.f30790z = true;
                        u21Var.f30789y = true;
                        bi0Var22.M(0);
                        return;
                    default:
                        u21 u21Var2 = this.f29809b;
                        u21Var2.f30779n.stop();
                        bi0 bi0Var3 = u21Var2.f30781p;
                        bi0Var3.stop();
                        u21Var2.f30790z = false;
                        u21Var2.f30789y = false;
                        bi0Var3.M(0);
                        return;
                }
            }
        });
        bi0Var2.J(true);
        this.f30789y = false;
        this.f30790z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.d20.i(q1Var.getMessageObject().I1).q()) {
            z10 = true;
        }
        this.f30788x = z10;
        gr grVar = gr.h;
        this.f30777l = new t5(q1Var, 250L, grVar);
        this.f30775j = new t5(q1Var, 250L, grVar);
    }

    public static void a(Path path, int i10, int i11, int i12, int i13, float f7, float f10) {
        float a2 = w7.u.a(f7, 0.0f, 1.0f);
        float a10 = w7.u.a(f10, 0.0f, 1.0f) - a2;
        if (a10 <= 0.0f) {
            return;
        }
        if (i13 == 1) {
            org.telegram.messenger.i0.P.set(i10 - i12, i11, i10, i11 + i12);
        } else if (i13 == 2) {
            org.telegram.messenger.i0.P.set(i10 - i12, i11 - i12, i10, i11);
        } else if (i13 == 3) {
            org.telegram.messenger.i0.P.set(i10, i11 - i12, i10 + i12, i11);
        } else if (i13 == 4) {
            org.telegram.messenger.i0.P.set(i10, i11, i10 + i12, i11 + i12);
        }
        path.addArc(org.telegram.messenger.i0.P, (a2 * 90.0f) + ((i13 * 90) - 180), a10 * 90.0f);
    }

    public static void b(Path path, int i10, int i11, int i12, int i13, float f7, float f10, float f11, float f12) {
        if (f7 > f10) {
            float f13 = f12 - f11;
            a(path, i10, i11, i12, i13, (f7 - f11) / f13, 1.0f);
            a(path, i10, i11, i12, i13, 0.0f, (f10 - f11) / f13);
            return;
        }
        float f14 = f12 - f11;
        a(path, i10, i11, i12, i13, Math.max(0.0f, f7 - f11) / f14, (Math.min(f10, f12) - f11) / f14);
    }

    public static void c(Path path, int i10, int i11, int i12, int i13, float f7, float f10) {
        if (i10 != i12 || i11 != i13) {
            float a2 = w7.u.a(f7, 0.0f, 1.0f);
            float a10 = w7.u.a(f10, 0.0f, 1.0f);
            if (a10 - a2 <= 0.0f) {
                return;
            }
            path.moveTo(org.telegram.messenger.i0.W1(a2, i10, i12), org.telegram.messenger.i0.W1(a2, i11, i13));
            path.lineTo(org.telegram.messenger.i0.W1(a10, i10, i12), org.telegram.messenger.i0.W1(a10, i11, i13));
        }
    }

    public static void d(Path path, int i10, int i11, int i12, int i13, float f7, float f10, float f11, float f12) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        if (f7 > f10) {
            float f13 = f12 - f11;
            c(path, i10, i11, i12, i13, (f7 - f11) / f13, 1.0f);
            c(path, i10, i11, i12, i13, 0.0f, (f10 - f11) / f13);
            return;
        }
        float f14 = f12 - f11;
        c(path, i10, i11, i12, i13, Math.max(0.0f, f7 - f11) / f14, (Math.min(f10, f12) - f11) / f14);
    }

    public static boolean e(org.telegram.messenger.jj jjVar) {
        if (jjVar != null) {
            int i10 = jjVar.I1;
            if (jjVar.f16337k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
                if (i(jjVar)) {
                    return true;
                }
                if (r12.f18907t4 > 0 && jjVar.L0() <= r12.f18916u4) {
                    if (r12.f18925v4 != 0 && connectionsManager.getCurrentTime() <= r12.f18925v4 && r12.f18935w4 <= 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.jj jjVar, long j10, String str) {
        org.telegram.messenger.jj jjVar2;
        org.telegram.messenger.jj jjVar3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j10))) {
                jjVar2 = (org.telegram.messenger.jj) O.remove(Long.valueOf(j10));
            } else {
                jjVar2 = null;
            }
            if (jjVar == null) {
                jjVar3 = jjVar2;
            } else {
                jjVar3 = jjVar;
            }
            if (jjVar3 != null && jjVar3.f16337k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(n(jjVar3)));
                }
                jjVar3.f16337k.voiceTranscriptionFinal = true;
                org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(jjVar3.I1);
                long B0 = org.telegram.messenger.jj.B0(jjVar3.f16337k);
                a02.f15938a.c(new org.telegram.messenger.d2(a02, jjVar3.f1(), B0, jjVar3.f16337k, str, 2));
                org.telegram.messenger.i0.g3(new s21(jjVar3, j10, str, 1));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g(int i10) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        if (r12.f18907t4 <= 0) {
            return 0;
        }
        if (r12.f18925v4 != 0 && connectionsManager.getCurrentTime() <= r12.f18925v4) {
            return r12.f18935w4;
        }
        return r12.f18907t4;
    }

    public static boolean i(org.telegram.messenger.jj jjVar) {
        if (jjVar != null && jjVar.f16337k != null) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(jjVar.I1);
            TLRPC.Chat L0 = r12.L0(Long.valueOf(jjVar.x0()));
            if (org.telegram.messenger.w3.n0(L0) && L0.level >= r12.B5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.jj jjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(jjVar) && !P.containsKey(Integer.valueOf(n(jjVar))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && jjVar != null && (message = jjVar.f16337k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean k(org.telegram.messenger.jj jjVar) {
        if (Q != null) {
            if (!jjVar.h4() || Q.contains(Integer.valueOf(n(jjVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(org.telegram.messenger.jj jjVar) {
        if (jjVar != null && !k(jjVar)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(n(jjVar)));
        }
    }

    public static int n(org.telegram.messenger.jj jjVar) {
        if (jjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(jjVar.I1), Long.valueOf(org.telegram.messenger.jj.B0(jjVar.f16337k)), Integer.valueOf(jjVar.f1()));
    }

    public static void r(org.telegram.messenger.jj jjVar, boolean z10) {
        TLRPC.Message message = jjVar.f16337k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(jjVar.I1);
            long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
            a02.f15938a.c(new org.telegram.messenger.rk(a02, jjVar.f1(), B0, jjVar.f16337k, 7));
            if (z10) {
                org.telegram.messenger.i0.g3(new uo0(jjVar, 23));
            }
        }
    }

    public static boolean s(org.telegram.messenger.jj jjVar) {
        if (jjVar != null) {
            int i10 = jjVar.I1;
            if (jjVar.f16337k == null || i(jjVar) || !TextUtils.isEmpty(jjVar.f16337k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
            if (!org.telegram.messenger.d20.i(i10).q() && r12.f18925v4 != 0 && connectionsManager.getCurrentTime() <= r12.f18925v4 && r12.f18935w4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void t(final org.telegram.messenger.jj jjVar, boolean z10, final org.telegram.ui.Cells.l1 l1Var) {
        if (jjVar != null && jjVar.f16337k != null && jjVar.q4()) {
            final int i10 = jjVar.I1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer l1 = org.telegram.messenger.vp.r1(i10).l1(jjVar.f16337k.peer_id);
            final long n10 = org.telegram.messenger.o5.n(l1);
            TLRPC.Message message = jjVar.f16337k;
            final int i11 = message.f19814id;
            int i12 = 0;
            if (z10) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
                    m(jjVar);
                    jjVar.f16337k.voiceTranscriptionOpen = true;
                    org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i10);
                    a02.f15938a.c(new org.telegram.messenger.rk(a02, i11, n10, jjVar.f16337k, 7));
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            int i13 = r2;
                            org.telegram.messenger.jj jjVar2 = jjVar;
                            int i14 = i10;
                            switch (i13) {
                                case 0:
                                    org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i14);
                                    Boolean bool = Boolean.TRUE;
                                    f7.k(115, jjVar2, null, null, bool, bool);
                                    return;
                                default:
                                    org.telegram.messenger.zs.f(i14).k(115, jjVar2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                }
                if (org.telegram.messenger.v2.f18448a) {
                    org.telegram.messenger.f8.b("sending Transcription request, msg_id=" + i11 + " dialog_id=" + n10);
                }
                TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                tL_messages_transcribeAudio.peer = l1;
                tL_messages_transcribeAudio.msg_id = i11;
                if (P == null) {
                    P = new HashMap();
                }
                P.put(Integer.valueOf(n(jjVar)), jjVar);
                if (!org.telegram.messenger.d20.i(i10).q()) {
                    i12 = 1024;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z11;
                        long j10;
                        String str;
                        boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                        int i13 = i10;
                        org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                        org.telegram.messenger.jj jjVar2 = jjVar;
                        String str2 = "";
                        if (z12) {
                            TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                            String str3 = tL_messages_transcribedAudio.text;
                            long j11 = tL_messages_transcribedAudio.transcription_id;
                            boolean z13 = tL_messages_transcribedAudio.pending;
                            z11 = !z13;
                            if (TextUtils.isEmpty(str3)) {
                                if (z13) {
                                    str2 = null;
                                }
                            } else {
                                str2 = str3;
                            }
                            if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                                org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i13);
                                int i14 = tL_messages_transcribedAudio.trial_remains_num;
                                if (i14 != r12.f18935w4) {
                                    r12.f18935w4 = i14;
                                    r12.f7.edit().putInt("transcribeAudioTrialCurrentNumber", r12.f18935w4).apply();
                                }
                                org.telegram.messenger.vp r13 = org.telegram.messenger.vp.r1(i13);
                                int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                                if (i15 != r13.f18925v4) {
                                    r13.f18925v4 = i15;
                                    r13.f7.edit().putInt("transcribeAudioTrialCooldownUntil", r13.f18925v4).apply();
                                    org.telegram.messenger.i0.g3(new org.telegram.messenger.zj(r13, 3));
                                }
                                org.telegram.messenger.i0.g3(new gi0(17, l1Var2, tL_messages_transcribedAudio));
                            }
                            if (u21.O == null) {
                                u21.O = new HashMap();
                            }
                            u21.O.put(Long.valueOf(j11), jjVar2);
                            jjVar2.f16337k.voiceTranscriptionId = j11;
                            j10 = j11;
                        } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.vp r14 = org.telegram.messenger.vp.r1(i13);
                            if (r14.f18935w4 != 0) {
                                r14.f18935w4 = 0;
                                r14.f7.edit().putInt("transcribeAudioTrialCurrentNumber", r14.f18935w4).apply();
                            }
                            org.telegram.messenger.vp r15 = org.telegram.messenger.vp.r1(i13);
                            int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                            if (intValue != r15.f18925v4) {
                                r15.f18925v4 = intValue;
                                r15.f7.edit().putInt("transcribeAudioTrialCooldownUntil", r15.f18925v4).apply();
                                org.telegram.messenger.i0.g3(new org.telegram.messenger.zj(r15, 3));
                            }
                            org.telegram.messenger.i0.g3(new ji0(jjVar2, l1Var2, i13, 14));
                            return;
                        } else {
                            z11 = true;
                            j10 = 0;
                        }
                        String str4 = str2;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        u21.m(jjVar2);
                        TLRPC.Message message2 = jjVar2.f16337k;
                        message2.voiceTranscriptionOpen = true;
                        message2.voiceTranscriptionFinal = z11;
                        if (org.telegram.messenger.v2.f18448a) {
                            org.telegram.messenger.f8.b("Transcription request sent, received final=" + z11 + " id=" + j10 + " text=" + str4);
                        }
                        org.telegram.messenger.hs a03 = org.telegram.messenger.hs.a0(i13);
                        a03.f15938a.c(new org.telegram.messenger.d2(a03, i11, n10, jjVar2.f16337k, str4, 2));
                        if (z11) {
                            org.telegram.messenger.i0.h3(new s21(jjVar2, j10, str4, 0), Math.max(0L, 350 - elapsedRealtime2));
                        }
                    }
                }, i12);
                return;
            }
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(n(jjVar)));
            }
            jjVar.f16337k.voiceTranscriptionOpen = false;
            org.telegram.messenger.hs a03 = org.telegram.messenger.hs.a0(i10);
            a03.f15938a.c(new org.telegram.messenger.rk(a03, i11, n10, jjVar.f16337k, 7));
            org.telegram.messenger.i0.g3(new Runnable() {
                @Override
                public final void run() {
                    int i13 = r2;
                    org.telegram.messenger.jj jjVar2 = jjVar;
                    int i14 = i10;
                    switch (i13) {
                        case 0:
                            org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i14);
                            Boolean bool = Boolean.TRUE;
                            f7.k(115, jjVar2, null, null, bool, bool);
                            return;
                        default:
                            org.telegram.messenger.zs.f(i14).k(115, jjVar2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final int h() {
        return this.f30786u.height();
    }

    public final void l() {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var = this.f30783r;
        if (q1Var != null) {
            this.f30787w = false;
            boolean z11 = this.f30790z;
            boolean z12 = !z11;
            boolean z13 = this.f30788x;
            if (!z11) {
                z10 = !this.f30776k;
                if ((z13 || e(q1Var.getMessageObject())) && q1Var.getMessageObject().q4()) {
                    o(true, true);
                }
            } else {
                q(false, true);
                o(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.y yVar = this.f30782q;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
                q1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(q1Var.getMessageObject()) && (q1Var.getMessageObject() == null || q1Var.getMessageObject().f16337k == null || TextUtils.isEmpty(q1Var.getMessageObject().f16337k.voiceTranscription))) {
                        if (q1Var.getDelegate() != null) {
                            if (org.telegram.messenger.vp.r1(q1Var.Y5).f18907t4 > 0) {
                                q1Var.getDelegate().c0(3);
                                return;
                            } else {
                                q1Var.getDelegate().c0(0);
                                return;
                            }
                        }
                        return;
                    }
                    t(q1Var.getMessageObject(), z12, q1Var.getDelegate());
                    return;
                }
                if (!z11) {
                    this.f30787w = true;
                }
                t(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        this.f30776k = z10;
        qn0 qn0Var = this.f30784s;
        if (!qn0Var.f29709z && z10 && qn0Var.B.f30445c <= 0.0f) {
            qn0Var.A = SystemClock.elapsedRealtime();
        }
        qn0Var.f29709z = z10;
        org.telegram.ui.Cells.q1 q1Var = qn0Var.f29698n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        t5 t5Var = this.f30777l;
        if (!z11) {
            t5Var.f(this.f30776k, true);
        } else if (t5Var.f30445c <= 0.0f) {
            this.f30785t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.f30783r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void p(boolean z10, boolean z11) {
        org.telegram.ui.Cells.q1 q1Var;
        if (this.f30774i != z10 && (q1Var = this.f30783r) != null) {
            q1Var.invalidate();
        }
        this.f30774i = z10;
        if (!z11) {
            this.f30775j.f(z10, true);
        }
    }

    public final void q(boolean z10, boolean z11) {
        boolean z12 = this.f30790z;
        if (!z12 && z10 && this.f30787w) {
            this.f30787w = false;
            ((org.telegram.ui.Cells.z0) this).R.f21658a.R2 = true;
        }
        this.f30790z = z10;
        bi0 bi0Var = this.f30781p;
        bi0 bi0Var2 = this.f30779n;
        if (z11) {
            if (z10 && !z12) {
                this.f30789y = false;
                bi0Var2.M(0);
                bi0Var.M(0);
                bi0Var.start();
            } else if (!z10 && z12) {
                this.f30789y = true;
                bi0Var.M(0);
                bi0Var2.M(0);
                bi0Var2.start();
            }
        } else {
            this.f30789y = z10;
            bi0Var2.stop();
            bi0Var.stop();
            bi0Var2.M(0);
            bi0Var.M(0);
        }
        org.telegram.ui.Cells.q1 q1Var = this.f30783r;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    public final int u() {
        return this.f30786u.width();
    }
}
