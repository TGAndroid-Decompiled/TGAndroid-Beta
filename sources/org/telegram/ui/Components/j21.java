package org.telegram.ui.Components;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
public abstract class j21 {
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
    public int f36360a;
    public int f36361b;
    public int f36362c;
    public int d;
    public float f36363e;
    public Paint f36364f;
    public Paint f36365g;
    public Path h;
    public boolean f36366i;
    public final d6 f36367j;
    public boolean f36368k;
    public final d6 f36369l;
    public int f36370m;
    public final oh0 f36371n;
    public int f36372o;
    public final oh0 f36373p;
    public org.telegram.ui.Cells.y f36374q;
    public final org.telegram.ui.Cells.r1 f36375r;
    public final en0 f36376s;
    public final Rect f36378u;
    public final Rect v;
    public final boolean f36380x;
    public boolean f36381y;
    public boolean f36382z;
    public static final int[] N = {16842910, 16842919};
    public static final HashMap R = new HashMap();
    public static final HashMap S = new HashMap();
    public boolean f36379w = false;
    public boolean A = false;
    public final x1.a B = new x1.a();
    public long f36377t = SystemClock.elapsedRealtime();

    public j21(org.telegram.ui.Cells.r1 r1Var, en0 en0Var) {
        boolean z10 = false;
        this.f36375r = r1Var;
        this.f36376s = en0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.f36378u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        oh0 oh0Var = new oh0(2131624302, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f36373p = oh0Var;
        oh0Var.M(0);
        oh0Var.setCallback(r1Var);
        oh0Var.S(19, new Runnable(this) {
            public final j21 f34667b;

            {
                this.f34667b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j21 j21Var = this.f34667b;
                        j21Var.f36373p.stop();
                        oh0 oh0Var2 = j21Var.f36371n;
                        oh0Var2.stop();
                        j21Var.f36382z = true;
                        j21Var.f36381y = true;
                        oh0Var2.M(0);
                        return;
                    default:
                        j21 j21Var2 = this.f34667b;
                        j21Var2.f36371n.stop();
                        oh0 oh0Var3 = j21Var2.f36373p;
                        oh0Var3.stop();
                        j21Var2.f36382z = false;
                        j21Var2.f36381y = false;
                        oh0Var3.M(0);
                        return;
                }
            }
        });
        oh0Var.J(true);
        oh0 oh0Var2 = new oh0(2131624301, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f36371n = oh0Var2;
        oh0Var2.M(0);
        oh0Var2.setCallback(r1Var);
        oh0Var2.R(r1Var);
        oh0Var2.S(19, new Runnable(this) {
            public final j21 f34667b;

            {
                this.f34667b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j21 j21Var = this.f34667b;
                        j21Var.f36373p.stop();
                        oh0 oh0Var22 = j21Var.f36371n;
                        oh0Var22.stop();
                        j21Var.f36382z = true;
                        j21Var.f36381y = true;
                        oh0Var22.M(0);
                        return;
                    default:
                        j21 j21Var2 = this.f34667b;
                        j21Var2.f36371n.stop();
                        oh0 oh0Var3 = j21Var2.f36373p;
                        oh0Var3.stop();
                        j21Var2.f36382z = false;
                        j21Var2.f36381y = false;
                        oh0Var3.M(0);
                        return;
                }
            }
        });
        oh0Var2.J(true);
        this.f36381y = false;
        this.f36382z = false;
        if (r1Var.getMessageObject() != null && org.telegram.messenger.k10.i(r1Var.getMessageObject().K1).q()) {
            z10 = true;
        }
        this.f36380x = z10;
        nr nrVar = nr.h;
        this.f36369l = new d6(r1Var, 250L, nrVar);
        this.f36367j = new d6(r1Var, 250L, nrVar);
    }

    public static boolean A(org.telegram.messenger.gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (org.telegram.messenger.gj.R4(gjVar.f24213k) && ((j(gjVar) || DictationAsr.B(i7)) && DictationAsr.w(i7) && ai.m1.h() && gjVar.L0() * 16000.0d * 4.0d < 3.145728E8d)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Path path, int i7, int i10, int i11, int i12, float f10, float f11) {
        float a10 = c8.l9.a(f10, 0.0f, 1.0f);
        float a11 = c8.l9.a(f11, 0.0f, 1.0f) - a10;
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
            float a10 = c8.l9.a(f10, 0.0f, 1.0f);
            float a11 = c8.l9.a(f11, 0.0f, 1.0f);
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
            if (gjVar.f24213k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
                if (i(gjVar)) {
                    return true;
                }
                if (u12.f25983v4 > 0 && gjVar.L0() <= u12.f25993w4) {
                    if (u12.f26003x4 != 0 && connectionsManager.getCurrentTime() <= u12.f26003x4 && u12.f26013y4 <= 0) {
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
            if (gjVar3 != null && gjVar3.f24213k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(r(gjVar3)));
                }
                TLRPC.Message message = gjVar3.f24213k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(gjVar3.K1);
                a02.f27250a.c(new org.telegram.messenger.z1(a02, gjVar3.e1(), org.telegram.messenger.gj.B0(gjVar3.f24213k), gjVar3.f24213k, str, 2));
                org.telegram.messenger.g0.g3(new b21(gjVar3, j3, str, 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i7) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        if (u12.f25983v4 <= 0) {
            return 0;
        }
        if (u12.f26003x4 != 0 && connectionsManager.getCurrentTime() <= u12.f26003x4) {
            return u12.f26013y4;
        }
        return u12.f25983v4;
    }

    public static boolean i(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && gjVar.f24213k != null) {
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(gjVar.K1);
            TLRPC.Chat O0 = u12.O0(Long.valueOf(gjVar.x0()));
            if (org.telegram.messenger.v3.n0(O0) && O0.level >= u12.D5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && org.telegram.messenger.n5.C(org.telegram.messenger.gj.B0(gjVar.f24213k))) {
            return true;
        }
        return false;
    }

    public static boolean k(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        if (gjVar != null && (message = gjVar.f24213k) != null && org.telegram.messenger.gj.R4(message) && gjVar.q4()) {
            TLRPC.Message message2 = gjVar.f24213k;
            if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal && message2.voiceTranscription != null && message2.voiceTranscriptionLocal && !A(gjVar)) {
                if ((org.telegram.messenger.k10.i(gjVar.K1).q() || e(gjVar)) && !l(gjVar)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean l(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(gjVar) && !P.containsKey(Integer.valueOf(r(gjVar))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && gjVar != null && (message = gjVar.f24213k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean m(org.telegram.messenger.gj gjVar) {
        if (Q != null) {
            if (!gjVar.h4() || Q.contains(Integer.valueOf(r(gjVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void n(org.telegram.messenger.gj gjVar) {
        R.remove(Integer.valueOf(r(gjVar)));
        S.remove(Integer.valueOf(r(gjVar)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(r(gjVar)));
        }
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " failed");
        }
        org.telegram.messenger.ls.f(gjVar.K1).k(org.telegram.messenger.ls.A1, gjVar);
    }

    public static void o(org.telegram.messenger.gj gjVar) {
        n(gjVar);
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + ": no model and no auto-download, opening speech settings");
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(new ai.a3());
        }
    }

    public static void q(org.telegram.messenger.gj gjVar) {
        if (gjVar != null && !m(gjVar)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(r(gjVar)));
        }
    }

    public static int r(org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(gjVar.K1), Long.valueOf(org.telegram.messenger.gj.B0(gjVar.f24213k)), Integer.valueOf(gjVar.e1()));
    }

    public static void v(org.telegram.messenger.gj gjVar, boolean z10) {
        TLRPC.Message message = gjVar.f24213k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(gjVar.K1);
            long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
            a02.f27250a.c(new org.telegram.messenger.fk(a02, gjVar.e1(), B0, gjVar.f24213k, 6));
            if (z10) {
                org.telegram.messenger.g0.g3(new cp0(gjVar, 21));
            }
        }
    }

    public static boolean w(org.telegram.messenger.gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (gjVar.f24213k == null || i(gjVar) || A(gjVar) || !TextUtils.isEmpty(gjVar.f24213k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
            if (!org.telegram.messenger.k10.i(i7).q() && u12.f26003x4 != 0 && connectionsManager.getCurrentTime() <= u12.f26003x4 && u12.f26013y4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void x(org.telegram.messenger.gj gjVar) {
        Integer valueOf = Integer.valueOf(r(gjVar));
        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) R.remove(valueOf);
        Runnable runnable = (Runnable) S.remove(valueOf);
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
            TLRPC.Message message = gjVarArr[i7].f24213k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " stopped");
        }
        org.telegram.messenger.ls.f(gjVar2.K1).k(org.telegram.messenger.ls.A1, gjVar2);
    }

    public static void y(org.telegram.messenger.gj gjVar, String str) {
        ArrayList arrayList;
        int i7 = gjVar.K1;
        long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = (ArrayList) ai.w0.f1600a.get(Long.valueOf(B0));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        android.support.v4.media.session.a0 T = DictationAsr.T(arrayList, false);
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + gjVar.e1() + " with " + T);
        }
        Integer valueOf = Integer.valueOf(r(gjVar));
        HashMap hashMap = S;
        h21 h21Var = new h21(valueOf, gjVar, i7, B0, elapsedRealtime);
        boolean[] zArr = {false};
        DictationLid.d(org.telegram.messenger.t0.f26931b);
        new Thread(new ai.r(str, zArr, h21Var, T, 0), "DictationAsrFile").start();
        hashMap.put(valueOf, new ai.s(0, zArr));
    }

    public static void z(final org.telegram.messenger.gj gjVar, boolean z10, final org.telegram.ui.Cells.m1 m1Var) {
        ArrayList arrayList;
        ai.t tVar;
        if (gjVar != null && gjVar.f24213k != null && gjVar.q4()) {
            final int i7 = gjVar.K1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer o12 = org.telegram.messenger.np.u1(i7).o1(gjVar.f24213k.peer_id);
            final long n10 = org.telegram.messenger.n5.n(o12);
            TLRPC.Message message = gjVar.f24213k;
            final int i10 = message.f28455id;
            int i11 = 0;
            if (z10) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal && (!message.voiceTranscriptionLocal || A(gjVar))) {
                    q(gjVar);
                    gjVar.f24213k.voiceTranscriptionOpen = true;
                    org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i7);
                    a02.f27250a.c(new org.telegram.messenger.fk(a02, i10, n10, gjVar.f24213k, 6));
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            int i12 = r2;
                            org.telegram.messenger.gj gjVar2 = gjVar;
                            int i13 = i7;
                            switch (i12) {
                                case 0:
                                    org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(i13);
                                    Boolean bool = Boolean.TRUE;
                                    f10.k(115, gjVar2, null, null, bool, bool);
                                    return;
                                default:
                                    org.telegram.messenger.ls.f(i13).k(115, gjVar2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (A(gjVar)) {
                    ArrayList arrayList2 = (ArrayList) ai.w0.f1600a.get(Long.valueOf(org.telegram.messenger.gj.B0(gjVar.f24213k)));
                    if (arrayList2 != null) {
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    android.support.v4.media.session.a0 T = DictationAsr.T(arrayList, false);
                    if (T != null && ((tVar = (ai.t) T.f1724b) == null || tVar.f1520f != 0 || DictationAsr.y(tVar) || ai.m1.b())) {
                        int i12 = gjVar.K1;
                        if (P == null) {
                            P = new HashMap();
                        }
                        Integer valueOf = Integer.valueOf(r(gjVar));
                        P.put(valueOf, gjVar);
                        R.put(valueOf, gjVar);
                        org.telegram.messenger.w7.G(i12);
                        File M = org.telegram.messenger.w7.M(gjVar.f24213k, false, true);
                        if (M != null && M.exists()) {
                            y(gjVar, M.getAbsolutePath());
                            return;
                        }
                        String r10 = org.telegram.messenger.w7.r(null, gjVar.F0());
                        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(i12);
                        g21 g21Var = new g21(r10, f10, gjVar, m1Var);
                        f10.b(g21Var, org.telegram.messenger.ls.Y1);
                        f10.b(g21Var, org.telegram.messenger.ls.Z1);
                        S.put(valueOf, new fm0(16, f10, g21Var));
                        org.telegram.messenger.w7.G(i12).W(gjVar.F0(), gjVar, 3, 0);
                        return;
                    }
                    o(gjVar);
                    return;
                } else if (j(gjVar)) {
                    n(gjVar);
                    return;
                } else {
                    if (org.telegram.messenger.s2.f26730a) {
                        org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n10);
                    }
                    TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                    tL_messages_transcribeAudio.peer = o12;
                    tL_messages_transcribeAudio.msg_id = i10;
                    if (P == null) {
                        P = new HashMap();
                    }
                    P.put(Integer.valueOf(r(gjVar)), gjVar);
                    if (!org.telegram.messenger.k10.i(i7).q()) {
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
                            org.telegram.ui.Cells.m1 m1Var2 = m1Var;
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
                                    org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i13);
                                    int i14 = tL_messages_transcribedAudio.trial_remains_num;
                                    if (i14 != u12.f26013y4) {
                                        u12.f26013y4 = i14;
                                        u12.h7.edit().putInt("transcribeAudioTrialCurrentNumber", u12.f26013y4).apply();
                                    }
                                    org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(i13);
                                    int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                                    if (i15 != u13.f26003x4) {
                                        u13.f26003x4 = i15;
                                        u13.h7.edit().putInt("transcribeAudioTrialCooldownUntil", u13.f26003x4).apply();
                                        org.telegram.messenger.g0.g3(new org.telegram.messenger.sj(u13, 3));
                                    }
                                    org.telegram.messenger.g0.g3(new fm0(15, m1Var2, tL_messages_transcribedAudio));
                                }
                                if (j21.O == null) {
                                    j21.O = new HashMap();
                                }
                                j21.O.put(Long.valueOf(j3), gjVar2);
                                gjVar2.f24213k.voiceTranscriptionId = j3;
                            } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                                org.telegram.messenger.np u14 = org.telegram.messenger.np.u1(i13);
                                if (u14.f26013y4 != 0) {
                                    u14.f26013y4 = 0;
                                    u14.h7.edit().putInt("transcribeAudioTrialCurrentNumber", u14.f26013y4).apply();
                                }
                                org.telegram.messenger.np u15 = org.telegram.messenger.np.u1(i13);
                                int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                                if (intValue != u15.f26003x4) {
                                    u15.f26003x4 = intValue;
                                    u15.h7.edit().putInt("transcribeAudioTrialCooldownUntil", u15.f26003x4).apply();
                                    org.telegram.messenger.g0.g3(new org.telegram.messenger.sj(u15, 3));
                                }
                                org.telegram.messenger.g0.g3(new f21(gjVar2, m1Var2, i13, 0));
                                return;
                            } else {
                                z11 = true;
                                j3 = 0;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            j21.q(gjVar2);
                            TLRPC.Message message2 = gjVar2.f24213k;
                            message2.voiceTranscriptionOpen = true;
                            message2.voiceTranscriptionFinal = z11;
                            message2.voiceTranscriptionLocal = false;
                            message2.voiceTranscriptionWords = null;
                            if (org.telegram.messenger.s2.f26730a) {
                                org.telegram.messenger.a8.b("Transcription request sent, received final=" + z11 + " id=" + j3 + " text=" + str2);
                            }
                            org.telegram.messenger.ur a03 = org.telegram.messenger.ur.a0(i13);
                            String str4 = str2;
                            a03.f27250a.c(new org.telegram.messenger.z1(a03, i10, n10, gjVar2.f24213k, str4, 2));
                            if (z11) {
                                org.telegram.messenger.g0.h3(new b21(gjVar2, j3, str4, 1), Math.max(0L, 350 - elapsedRealtime2));
                            }
                        }
                    }, i11);
                    return;
                }
            }
            x(gjVar);
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(r(gjVar)));
            }
            gjVar.f24213k.voiceTranscriptionOpen = false;
            org.telegram.messenger.ur a03 = org.telegram.messenger.ur.a0(i7);
            a03.f27250a.c(new org.telegram.messenger.fk(a03, i10, n10, gjVar.f24213k, 6));
            org.telegram.messenger.g0.g3(new Runnable() {
                @Override
                public final void run() {
                    int i122 = r2;
                    org.telegram.messenger.gj gjVar2 = gjVar;
                    int i13 = i7;
                    switch (i122) {
                        case 0:
                            org.telegram.messenger.ls f102 = org.telegram.messenger.ls.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f102.k(115, gjVar2, null, null, bool, bool);
                            return;
                        default:
                            org.telegram.messenger.ls.f(i13).k(115, gjVar2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final int B() {
        return this.f36378u.width();
    }

    public final int h() {
        return this.f36378u.height();
    }

    public final void p() {
        boolean z10;
        org.telegram.ui.Cells.r1 r1Var = this.f36375r;
        if (r1Var != null) {
            this.f36379w = false;
            boolean z11 = this.f36382z;
            boolean z12 = !z11;
            boolean z13 = this.f36380x;
            if (!z11) {
                z10 = !this.f36368k;
                if ((z13 || e(r1Var.getMessageObject()) || A(r1Var.getMessageObject())) && r1Var.getMessageObject().q4()) {
                    s(true, true);
                }
            } else {
                u(false, true);
                s(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.y yVar = this.f36374q;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
                r1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(r1Var.getMessageObject()) && !A(r1Var.getMessageObject()) && (r1Var.getMessageObject() == null || r1Var.getMessageObject().f24213k == null || TextUtils.isEmpty(r1Var.getMessageObject().f24213k.voiceTranscription))) {
                        if (r1Var.getDelegate() != null) {
                            if (org.telegram.messenger.np.u1(r1Var.f31361a6).f25983v4 > 0) {
                                r1Var.getDelegate().h0(3);
                                return;
                            } else {
                                r1Var.getDelegate().h0(0);
                                return;
                            }
                        }
                        return;
                    }
                    z(r1Var.getMessageObject(), z12, r1Var.getDelegate());
                    return;
                }
                if (!z11) {
                    this.f36379w = true;
                }
                z(r1Var.getMessageObject(), z12, r1Var.getDelegate());
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        this.f36368k = z10;
        en0 en0Var = this.f36376s;
        if (!en0Var.f34938z && z10 && en0Var.B.f34386c <= 0.0f) {
            en0Var.A = SystemClock.elapsedRealtime();
        }
        en0Var.f34938z = z10;
        org.telegram.ui.Cells.r1 r1Var = en0Var.f34927n;
        if (r1Var != null) {
            r1Var.invalidate();
        }
        d6 d6Var = this.f36369l;
        if (!z11) {
            d6Var.f(this.f36368k, true);
        } else if (d6Var.f34386c <= 0.0f) {
            this.f36377t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.r1 r1Var2 = this.f36375r;
        if (r1Var2 != null) {
            r1Var2.invalidate();
        }
    }

    public final void t(boolean z10, boolean z11) {
        org.telegram.ui.Cells.r1 r1Var;
        if (this.f36366i != z10 && (r1Var = this.f36375r) != null) {
            r1Var.invalidate();
        }
        this.f36366i = z10;
        if (!z11) {
            this.f36367j.f(z10, true);
        }
    }

    public final void u(boolean z10, boolean z11) {
        boolean z12 = this.f36382z;
        if (!z12 && z10 && this.f36379w) {
            this.f36379w = false;
            ((org.telegram.ui.Cells.c1) this).T.f30550a.T2 = true;
        }
        this.f36382z = z10;
        oh0 oh0Var = this.f36373p;
        oh0 oh0Var2 = this.f36371n;
        if (z11) {
            if (z10 && !z12) {
                this.f36381y = false;
                oh0Var2.M(0);
                oh0Var.M(0);
                oh0Var.start();
            } else if (!z10 && z12) {
                this.f36381y = true;
                oh0Var.M(0);
                oh0Var2.M(0);
                oh0Var2.start();
            }
        } else {
            this.f36381y = z10;
            oh0Var2.stop();
            oh0Var.stop();
            oh0Var2.M(0);
            oh0Var.M(0);
        }
        org.telegram.ui.Cells.r1 r1Var = this.f36375r;
        if (r1Var != null) {
            r1Var.invalidate();
        }
    }
}
