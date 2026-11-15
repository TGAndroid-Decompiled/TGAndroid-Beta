package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public abstract class x11 {
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
    public int f41511a;
    public int f41512b;
    public int f41513c;
    public int d;
    public float f41514e;
    public Paint f41515f;
    public Paint f41516g;
    public Path h;
    public boolean f41517i;
    public final u5 f41518j;
    public boolean f41519k;
    public final u5 f41520l;
    public int f41521m;
    public final ch0 f41522n;
    public int f41523o;
    public final ch0 f41524p;
    public org.telegram.ui.Cells.y f41525q;
    public final org.telegram.ui.Cells.q1 f41526r;
    public final tm0 f41527s;
    public final Rect f41529u;
    public final Rect v;
    public final boolean f41531x;
    public boolean f41532y;
    public boolean f41533z;
    public static final int[] N = {16842910, 16842919};
    public static final HashSet R = new HashSet();
    public static final HashMap S = new HashMap();
    public static final HashMap T = new HashMap();
    public boolean f41530w = false;
    public boolean A = false;
    public final x1.a B = new x1.a();
    public long f41528t = SystemClock.elapsedRealtime();

    public x11(org.telegram.ui.Cells.q1 q1Var, tm0 tm0Var) {
        boolean z10 = false;
        this.f41526r = q1Var;
        this.f41527s = tm0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.f41529u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        ch0 ch0Var = new ch0(2131624302, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f41524p = ch0Var;
        ch0Var.M(0);
        ch0Var.setCallback(q1Var);
        ch0Var.S(19, new Runnable(this) {
            public final x11 f39492b;

            {
                this.f39492b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x11 x11Var = this.f39492b;
                        x11Var.f41524p.stop();
                        ch0 ch0Var2 = x11Var.f41522n;
                        ch0Var2.stop();
                        x11Var.f41533z = true;
                        x11Var.f41532y = true;
                        ch0Var2.M(0);
                        return;
                    default:
                        x11 x11Var2 = this.f39492b;
                        x11Var2.f41522n.stop();
                        ch0 ch0Var3 = x11Var2.f41524p;
                        ch0Var3.stop();
                        x11Var2.f41533z = false;
                        x11Var2.f41532y = false;
                        ch0Var3.M(0);
                        return;
                }
            }
        });
        ch0Var.J(true);
        ch0 ch0Var2 = new ch0(2131624301, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f41522n = ch0Var2;
        ch0Var2.M(0);
        ch0Var2.setCallback(q1Var);
        ch0Var2.R(q1Var);
        ch0Var2.S(19, new Runnable(this) {
            public final x11 f39492b;

            {
                this.f39492b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x11 x11Var = this.f39492b;
                        x11Var.f41524p.stop();
                        ch0 ch0Var22 = x11Var.f41522n;
                        ch0Var22.stop();
                        x11Var.f41533z = true;
                        x11Var.f41532y = true;
                        ch0Var22.M(0);
                        return;
                    default:
                        x11 x11Var2 = this.f39492b;
                        x11Var2.f41522n.stop();
                        ch0 ch0Var3 = x11Var2.f41524p;
                        ch0Var3.stop();
                        x11Var2.f41533z = false;
                        x11Var2.f41532y = false;
                        ch0Var3.M(0);
                        return;
                }
            }
        });
        ch0Var2.J(true);
        this.f41532y = false;
        this.f41533z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.m10.i(q1Var.getMessageObject().K1).q()) {
            z10 = true;
        }
        this.f41531x = z10;
        er erVar = er.h;
        this.f41520l = new u5(q1Var, 250L, erVar);
        this.f41518j = new u5(q1Var, 250L, erVar);
    }

    public static void a(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        float a10 = c8.i9.a(f10, 0.0f, 1.0f);
        float a11 = c8.i9.a(f11, 0.0f, 1.0f) - a10;
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
            float a10 = c8.i9.a(f10, 0.0f, 1.0f);
            float a11 = c8.i9.a(f11, 0.0f, 1.0f);
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

    public static boolean e(org.telegram.messenger.gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (gjVar.f23817k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
                if (i(gjVar)) {
                    return true;
                }
                if (s12.f25398t4 > 0 && gjVar.L0() <= s12.f25406u4) {
                    if (s12.f25415v4 != 0 && connectionsManager.getCurrentTime() <= s12.f25415v4 && s12.f25425w4 <= 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.gj gjVar, long j3, String str) {
        org.telegram.messenger.gj gjVar2;
        org.telegram.messenger.gj gjVar3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j3))) {
                gjVar2 = (org.telegram.messenger.gj) O.remove(Long.valueOf(j3));
            } else {
                gjVar2 = null;
            }
            if (gjVar == null) {
                gjVar3 = gjVar2;
            } else {
                gjVar3 = gjVar;
            }
            if (gjVar3 != null && gjVar3.f23817k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(p(gjVar3)));
                }
                TLRPC.Message message = gjVar3.f23817k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(gjVar3.K1);
                a02.f27220a.c(new org.telegram.messenger.z1(a02, gjVar3.e1(), org.telegram.messenger.gj.B0(gjVar3.f23817k), gjVar3.f23817k, str, 2));
                org.telegram.messenger.g0.h3(new q11(gjVar3, j3, str, 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i7) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        if (s12.f25398t4 <= 0) {
            return 0;
        }
        if (s12.f25415v4 != 0 && connectionsManager.getCurrentTime() <= s12.f25415v4) {
            return s12.f25425w4;
        }
        return s12.f25398t4;
    }

    public static boolean i(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && gjVar.f23817k != null) {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(gjVar.K1);
            TLRPC.Chat M0 = s12.M0(Long.valueOf(gjVar.x0()));
            if (org.telegram.messenger.t3.n0(M0) && M0.level >= s12.B5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        if (gjVar != null && (message = gjVar.f23817k) != null && org.telegram.messenger.gj.R4(message) && gjVar.q4()) {
            TLRPC.Message message2 = gjVar.f23817k;
            if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal && message2.voiceTranscription != null && message2.voiceTranscriptionLocal != y(gjVar)) {
                if (y(gjVar)) {
                    if (R.contains(Integer.valueOf(p(gjVar)))) {
                        return false;
                    }
                }
                if ((y(gjVar) || org.telegram.messenger.m10.i(gjVar.K1).q() || e(gjVar)) && !k(gjVar)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean k(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(gjVar) && !P.containsKey(Integer.valueOf(p(gjVar))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && gjVar != null && (message = gjVar.f23817k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean l(org.telegram.messenger.gj gjVar) {
        if (Q != null) {
            if (!gjVar.h4() || Q.contains(Integer.valueOf(p(gjVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(org.telegram.messenger.gj gjVar) {
        R.add(Integer.valueOf(p(gjVar)));
        S.remove(Integer.valueOf(p(gjVar)));
        T.remove(Integer.valueOf(p(gjVar)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(p(gjVar)));
        }
        if (org.telegram.messenger.r2.f26198a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " failed");
        }
        org.telegram.messenger.ns.f(gjVar.K1).k(org.telegram.messenger.ns.A1, gjVar);
    }

    public static void o(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && !l(gjVar)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(p(gjVar)));
        }
    }

    public static int p(org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(gjVar.K1), Long.valueOf(org.telegram.messenger.gj.B0(gjVar.f23817k)), Integer.valueOf(gjVar.e1()));
    }

    public static void t(org.telegram.messenger.gj gjVar, boolean z10) {
        TLRPC.Message message = gjVar.f23817k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(gjVar.K1);
            long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
            a02.f27220a.c(new org.telegram.messenger.fk(a02, gjVar.e1(), B0, gjVar.f23817k, 6));
            if (z10) {
                org.telegram.messenger.g0.h3(new ro0(gjVar, 22));
            }
        }
    }

    public static boolean u(org.telegram.messenger.gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (gjVar.f23817k == null || i(gjVar) || y(gjVar) || !TextUtils.isEmpty(gjVar.f23817k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            if (!org.telegram.messenger.m10.i(i7).q() && s12.f25415v4 != 0 && connectionsManager.getCurrentTime() <= s12.f25415v4 && s12.f25425w4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void v(org.telegram.messenger.gj gjVar) {
        Integer valueOf = Integer.valueOf(p(gjVar));
        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) S.remove(valueOf);
        Runnable runnable = (Runnable) T.remove(valueOf);
        if (gjVar2 == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(valueOf);
        }
        org.telegram.messenger.gj[] gjVarArr = {gjVar2, gjVar};
        for (int i7 = 0; i7 < 2; i7++) {
            TLRPC.Message message = gjVarArr[i7].f23817k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (org.telegram.messenger.r2.f26198a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " stopped");
        }
        org.telegram.messenger.ns.f(gjVar2.K1).k(org.telegram.messenger.ns.A1, gjVar2);
    }

    public static void w(org.telegram.messenger.gj gjVar, String str) {
        ArrayList arrayList;
        boolean z10;
        int i7 = gjVar.K1;
        long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = (ArrayList) ai.t0.f1549a.get(Long.valueOf(B0));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        android.support.v4.media.session.a0 P2 = DictationAsr.P(arrayList, false);
        if (org.telegram.messenger.r2.f26198a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " with " + P2);
        }
        Integer valueOf = Integer.valueOf(p(gjVar));
        HashMap hashMap = T;
        ki.r1 r1Var = new ki.r1(valueOf, gjVar, i7, B0, elapsedRealtime);
        boolean[] zArr = {false};
        if (!DictationAsr.v() && DictationAsr.U() != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Context context = org.telegram.messenger.t0.f26600b;
            ExecutorService executorService = DictationLid.f42585a;
            if (DictationAsr.v()) {
                DictationLid.d(context);
            }
        }
        new Thread(new ai.j(str, zArr, r1Var, z10, P2), "DictationAsrFile").start();
        hashMap.put(valueOf, new ai.r(0, zArr));
    }

    public static void x(final org.telegram.messenger.gj gjVar, boolean z10, final org.telegram.ui.Cells.l1 l1Var) {
        if (gjVar != null && gjVar.f23817k != null && gjVar.q4()) {
            final int i7 = gjVar.K1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer m12 = org.telegram.messenger.np.s1(i7).m1(gjVar.f23817k.peer_id);
            final long n10 = org.telegram.messenger.m5.n(m12);
            TLRPC.Message message = gjVar.f23817k;
            final int i10 = message.f28072id;
            int i11 = 0;
            if (z10) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionLocal == y(gjVar)) {
                    o(gjVar);
                    gjVar.f23817k.voiceTranscriptionOpen = true;
                    org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i7);
                    a02.f27220a.c(new org.telegram.messenger.fk(a02, i10, n10, gjVar.f23817k, 6));
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            int i12 = r2;
                            org.telegram.messenger.gj gjVar2 = gjVar;
                            int i13 = i7;
                            switch (i12) {
                                case 0:
                                    org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i13);
                                    Boolean bool = Boolean.TRUE;
                                    f10.k(115, gjVar2, null, null, bool, bool);
                                    return;
                                default:
                                    org.telegram.messenger.ns.f(i13).k(115, gjVar2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (y(gjVar)) {
                    int i12 = gjVar.K1;
                    if (P == null) {
                        P = new HashMap();
                    }
                    Integer valueOf = Integer.valueOf(p(gjVar));
                    P.put(valueOf, gjVar);
                    S.put(valueOf, gjVar);
                    org.telegram.messenger.w7.G(i12);
                    File M = org.telegram.messenger.w7.M(gjVar.f23817k, false, true);
                    if (M != null && M.exists()) {
                        w(gjVar, M.getAbsolutePath());
                        return;
                    }
                    String r10 = org.telegram.messenger.w7.r(null, gjVar.F0());
                    org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(i12);
                    v11 v11Var = new v11(r10, f10, gjVar);
                    f10.b(v11Var, org.telegram.messenger.ns.Y1);
                    f10.b(v11Var, org.telegram.messenger.ns.Z1);
                    T.put(valueOf, new hh0(18, f10, v11Var));
                    org.telegram.messenger.w7.G(i12).W(gjVar.F0(), gjVar, 3, 0);
                    return;
                } else {
                    if (org.telegram.messenger.r2.f26198a) {
                        org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n10);
                    }
                    TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                    tL_messages_transcribeAudio.peer = m12;
                    tL_messages_transcribeAudio.msg_id = i10;
                    if (P == null) {
                        P = new HashMap();
                    }
                    P.put(Integer.valueOf(p(gjVar)), gjVar);
                    if (!org.telegram.messenger.m10.i(i7).q()) {
                        i11 = 1024;
                    }
                    ConnectionsManager.getInstance(i7).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            boolean z11;
                            long j3;
                            String str;
                            boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                            int i13 = i7;
                            org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                            org.telegram.messenger.gj gjVar2 = gjVar;
                            String str2 = "";
                            if (z12) {
                                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                                String str3 = tL_messages_transcribedAudio.text;
                                j3 = tL_messages_transcribedAudio.transcription_id;
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
                                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i13);
                                    int i14 = tL_messages_transcribedAudio.trial_remains_num;
                                    if (i14 != s12.f25425w4) {
                                        s12.f25425w4 = i14;
                                        s12.f25280f7.edit().putInt("transcribeAudioTrialCurrentNumber", s12.f25425w4).apply();
                                    }
                                    org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(i13);
                                    int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                                    if (i15 != s13.f25415v4) {
                                        s13.f25415v4 = i15;
                                        s13.f25280f7.edit().putInt("transcribeAudioTrialCooldownUntil", s13.f25415v4).apply();
                                        org.telegram.messenger.g0.h3(new org.telegram.messenger.tj(s13, 3));
                                    }
                                    org.telegram.messenger.g0.h3(new hh0(19, l1Var2, tL_messages_transcribedAudio));
                                }
                                if (x11.O == null) {
                                    x11.O = new HashMap();
                                }
                                x11.O.put(Long.valueOf(j3), gjVar2);
                                gjVar2.f23817k.voiceTranscriptionId = j3;
                            } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                                org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(i13);
                                if (s14.f25425w4 != 0) {
                                    s14.f25425w4 = 0;
                                    s14.f25280f7.edit().putInt("transcribeAudioTrialCurrentNumber", s14.f25425w4).apply();
                                }
                                org.telegram.messenger.np s15 = org.telegram.messenger.np.s1(i13);
                                int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                                if (intValue != s15.f25415v4) {
                                    s15.f25415v4 = intValue;
                                    s15.f25280f7.edit().putInt("transcribeAudioTrialCooldownUntil", s15.f25415v4).apply();
                                    org.telegram.messenger.g0.h3(new org.telegram.messenger.tj(s15, 3));
                                }
                                org.telegram.messenger.g0.h3(new u11(gjVar2, l1Var2, i13, 0));
                                return;
                            } else {
                                z11 = true;
                                j3 = 0;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            x11.o(gjVar2);
                            TLRPC.Message message2 = gjVar2.f23817k;
                            message2.voiceTranscriptionOpen = true;
                            message2.voiceTranscriptionFinal = z11;
                            message2.voiceTranscriptionLocal = false;
                            message2.voiceTranscriptionWords = null;
                            if (org.telegram.messenger.r2.f26198a) {
                                org.telegram.messenger.a8.b("Transcription request sent, received final=" + z11 + " id=" + j3 + " text=" + str2);
                            }
                            org.telegram.messenger.vr a03 = org.telegram.messenger.vr.a0(i13);
                            String str4 = str2;
                            a03.f27220a.c(new org.telegram.messenger.z1(a03, i10, n10, gjVar2.f23817k, str4, 2));
                            if (z11) {
                                org.telegram.messenger.g0.i3(new q11(gjVar2, j3, str4, 1), Math.max(0L, 350 - elapsedRealtime2));
                            }
                        }
                    }, i11);
                    return;
                }
            }
            v(gjVar);
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(p(gjVar)));
            }
            gjVar.f23817k.voiceTranscriptionOpen = false;
            org.telegram.messenger.vr a03 = org.telegram.messenger.vr.a0(i7);
            a03.f27220a.c(new org.telegram.messenger.fk(a03, i10, n10, gjVar.f23817k, 6));
            org.telegram.messenger.g0.h3(new Runnable() {
                @Override
                public final void run() {
                    int i122 = r2;
                    org.telegram.messenger.gj gjVar2 = gjVar;
                    int i13 = i7;
                    switch (i122) {
                        case 0:
                            org.telegram.messenger.ns f102 = org.telegram.messenger.ns.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f102.k(115, gjVar2, null, null, bool, bool);
                            return;
                        default:
                            org.telegram.messenger.ns.f(i13).k(115, gjVar2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public static boolean y(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && org.telegram.messenger.gj.R4(gjVar.f23817k) && DictationAsr.A() && DictationAsr.z(gjVar.K1)) {
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f41529u.height();
    }

    public final void n() {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var = this.f41526r;
        if (q1Var != null) {
            this.f41530w = false;
            boolean z11 = this.f41533z;
            boolean z12 = !z11;
            boolean z13 = this.f41531x;
            if (!z11) {
                z10 = !this.f41519k;
                if ((z13 || e(q1Var.getMessageObject()) || y(q1Var.getMessageObject())) && q1Var.getMessageObject().q4()) {
                    q(true, true);
                }
            } else {
                s(false, true);
                q(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.y yVar = this.f41525q;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
                q1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(q1Var.getMessageObject()) && !y(q1Var.getMessageObject()) && (q1Var.getMessageObject() == null || q1Var.getMessageObject().f23817k == null || TextUtils.isEmpty(q1Var.getMessageObject().f23817k.voiceTranscription))) {
                        if (q1Var.getDelegate() != null) {
                            if (org.telegram.messenger.np.s1(q1Var.f30908a6).f25398t4 > 0) {
                                q1Var.getDelegate().e0(3);
                                return;
                            } else {
                                q1Var.getDelegate().e0(0);
                                return;
                            }
                        }
                        return;
                    }
                    x(q1Var.getMessageObject(), z12, q1Var.getDelegate());
                    return;
                }
                if (!z11) {
                    this.f41530w = true;
                }
                x(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            }
        }
    }

    public final void q(boolean z10, boolean z11) {
        this.f41519k = z10;
        tm0 tm0Var = this.f41527s;
        if (!tm0Var.f39747z && z10 && tm0Var.B.f39903c <= 0.0f) {
            tm0Var.A = SystemClock.elapsedRealtime();
        }
        tm0Var.f39747z = z10;
        org.telegram.ui.Cells.q1 q1Var = tm0Var.f39736n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        u5 u5Var = this.f41520l;
        if (!z11) {
            u5Var.f(this.f41519k, true);
        } else if (u5Var.f39903c <= 0.0f) {
            this.f41528t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.f41526r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void r(boolean z10, boolean z11) {
        org.telegram.ui.Cells.q1 q1Var;
        if (this.f41517i != z10 && (q1Var = this.f41526r) != null) {
            q1Var.invalidate();
        }
        this.f41517i = z10;
        if (!z11) {
            this.f41518j.f(z10, true);
        }
    }

    public final void s(boolean z10, boolean z11) {
        boolean z12 = this.f41533z;
        if (!z12 && z10 && this.f41530w) {
            this.f41530w = false;
            ((org.telegram.ui.Cells.b1) this).U.f30083a.T2 = true;
        }
        this.f41533z = z10;
        ch0 ch0Var = this.f41524p;
        ch0 ch0Var2 = this.f41522n;
        if (z11) {
            if (z10 && !z12) {
                this.f41532y = false;
                ch0Var2.M(0);
                ch0Var.M(0);
                ch0Var.start();
            } else if (!z10 && z12) {
                this.f41532y = true;
                ch0Var.M(0);
                ch0Var2.M(0);
                ch0Var2.start();
            }
        } else {
            this.f41532y = z10;
            ch0Var2.stop();
            ch0Var.stop();
            ch0Var2.M(0);
            ch0Var.M(0);
        }
        org.telegram.ui.Cells.q1 q1Var = this.f41526r;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    public final int z() {
        return this.f41529u.width();
    }
}
