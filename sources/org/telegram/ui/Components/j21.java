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
    public int f36366a;
    public int f36367b;
    public int f36368c;
    public int d;
    public float f36369e;
    public Paint f36370f;
    public Paint f36371g;
    public Path h;
    public boolean f36372i;
    public final d6 f36373j;
    public boolean f36374k;
    public final d6 f36375l;
    public int f36376m;
    public final oh0 f36377n;
    public int f36378o;
    public final oh0 f36379p;
    public org.telegram.ui.Cells.y f36380q;
    public final org.telegram.ui.Cells.r1 f36381r;
    public final en0 f36382s;
    public final Rect f36384u;
    public final Rect v;
    public final boolean f36386x;
    public boolean f36387y;
    public boolean f36388z;
    public static final int[] N = {16842910, 16842919};
    public static final HashMap R = new HashMap();
    public static final HashMap S = new HashMap();
    public boolean f36385w = false;
    public boolean A = false;
    public final x1.a B = new x1.a();
    public long f36383t = SystemClock.elapsedRealtime();

    public j21(org.telegram.ui.Cells.r1 r1Var, en0 en0Var) {
        boolean z10 = false;
        this.f36381r = r1Var;
        this.f36382s = en0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.f36384u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        oh0 oh0Var = new oh0(2131624302, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f36379p = oh0Var;
        oh0Var.M(0);
        oh0Var.setCallback(r1Var);
        oh0Var.S(19, new Runnable(this) {
            public final j21 f35065b;

            {
                this.f35065b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j21 j21Var = this.f35065b;
                        j21Var.f36379p.stop();
                        oh0 oh0Var2 = j21Var.f36377n;
                        oh0Var2.stop();
                        j21Var.f36388z = true;
                        j21Var.f36387y = true;
                        oh0Var2.M(0);
                        return;
                    default:
                        j21 j21Var2 = this.f35065b;
                        j21Var2.f36377n.stop();
                        oh0 oh0Var3 = j21Var2.f36379p;
                        oh0Var3.stop();
                        j21Var2.f36388z = false;
                        j21Var2.f36387y = false;
                        oh0Var3.M(0);
                        return;
                }
            }
        });
        oh0Var.J(true);
        oh0 oh0Var2 = new oh0(2131624301, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f36377n = oh0Var2;
        oh0Var2.M(0);
        oh0Var2.setCallback(r1Var);
        oh0Var2.R(r1Var);
        oh0Var2.S(19, new Runnable(this) {
            public final j21 f35065b;

            {
                this.f35065b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j21 j21Var = this.f35065b;
                        j21Var.f36379p.stop();
                        oh0 oh0Var22 = j21Var.f36377n;
                        oh0Var22.stop();
                        j21Var.f36388z = true;
                        j21Var.f36387y = true;
                        oh0Var22.M(0);
                        return;
                    default:
                        j21 j21Var2 = this.f35065b;
                        j21Var2.f36377n.stop();
                        oh0 oh0Var3 = j21Var2.f36379p;
                        oh0Var3.stop();
                        j21Var2.f36388z = false;
                        j21Var2.f36387y = false;
                        oh0Var3.M(0);
                        return;
                }
            }
        });
        oh0Var2.J(true);
        this.f36387y = false;
        this.f36388z = false;
        if (r1Var.getMessageObject() != null && org.telegram.messenger.j10.i(r1Var.getMessageObject().K1).q()) {
            z10 = true;
        }
        this.f36386x = z10;
        nr nrVar = nr.h;
        this.f36375l = new d6(r1Var, 250L, nrVar);
        this.f36373j = new d6(r1Var, 250L, nrVar);
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

    public static boolean e(org.telegram.messenger.fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (fjVar.f23993k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                if (i(fjVar)) {
                    return true;
                }
                if (u12.f25812v4 > 0 && fjVar.L0() <= u12.f25822w4) {
                    if (u12.f25832x4 != 0 && connectionsManager.getCurrentTime() <= u12.f25832x4 && u12.f25842y4 <= 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.fj fjVar, long j3, String str) {
        org.telegram.messenger.fj fjVar2;
        org.telegram.messenger.fj fjVar3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j3))) {
                fjVar2 = (org.telegram.messenger.fj) O.remove(Long.valueOf(j3));
            } else {
                fjVar2 = null;
            }
            if (fjVar == null) {
                fjVar3 = fjVar2;
            } else {
                fjVar3 = fjVar;
            }
            if (fjVar3 != null && fjVar3.f23993k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(q(fjVar3)));
                }
                TLRPC.Message message = fjVar3.f23993k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(fjVar3.K1);
                a02.f27080a.c(new org.telegram.messenger.z1(a02, fjVar3.e1(), org.telegram.messenger.fj.B0(fjVar3.f23993k), fjVar3.f23993k, str, 2));
                org.telegram.messenger.g0.g3(new c21(fjVar3, j3, str, 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i7) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        if (u12.f25812v4 <= 0) {
            return 0;
        }
        if (u12.f25832x4 != 0 && connectionsManager.getCurrentTime() <= u12.f25832x4) {
            return u12.f25842y4;
        }
        return u12.f25812v4;
    }

    public static boolean i(org.telegram.messenger.fj fjVar) {
        if (fjVar != null && fjVar.f23993k != null) {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(fjVar.K1);
            TLRPC.Chat O0 = u12.O0(Long.valueOf(fjVar.x0()));
            if (org.telegram.messenger.v3.n0(O0) && O0.level >= u12.D5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.fj fjVar) {
        TLRPC.Message message;
        if (fjVar != null && (message = fjVar.f23993k) != null && org.telegram.messenger.fj.R4(message) && fjVar.q4()) {
            TLRPC.Message message2 = fjVar.f23993k;
            if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal && message2.voiceTranscription != null && message2.voiceTranscriptionLocal && !z(fjVar)) {
                if ((org.telegram.messenger.j10.i(fjVar.K1).q() || e(fjVar)) && !k(fjVar)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean k(org.telegram.messenger.fj fjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(fjVar) && !P.containsKey(Integer.valueOf(q(fjVar))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && fjVar != null && (message = fjVar.f23993k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean l(org.telegram.messenger.fj fjVar) {
        if (Q != null) {
            if (!fjVar.h4() || Q.contains(Integer.valueOf(q(fjVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(org.telegram.messenger.fj fjVar) {
        R.remove(Integer.valueOf(q(fjVar)));
        S.remove(Integer.valueOf(q(fjVar)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(q(fjVar)));
        }
        if (org.telegram.messenger.s2.f26749a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + " failed");
        }
        org.telegram.messenger.ks.f(fjVar.K1).k(org.telegram.messenger.ks.A1, fjVar);
    }

    public static void n(org.telegram.messenger.fj fjVar) {
        m(fjVar);
        if (org.telegram.messenger.s2.f26749a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + ": no model and no auto-download, opening speech settings");
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(new ai.z2());
        }
    }

    public static void p(org.telegram.messenger.fj fjVar) {
        if (fjVar != null && !l(fjVar)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(q(fjVar)));
        }
    }

    public static int q(org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(fjVar.K1), Long.valueOf(org.telegram.messenger.fj.B0(fjVar.f23993k)), Integer.valueOf(fjVar.e1()));
    }

    public static void u(org.telegram.messenger.fj fjVar, boolean z10) {
        TLRPC.Message message = fjVar.f23993k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(fjVar.K1);
            long B0 = org.telegram.messenger.fj.B0(fjVar.f23993k);
            a02.f27080a.c(new org.telegram.messenger.ek(a02, fjVar.e1(), B0, fjVar.f23993k, 6));
            if (z10) {
                org.telegram.messenger.g0.g3(new cp0(fjVar, 21));
            }
        }
    }

    public static boolean v(org.telegram.messenger.fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (fjVar.f23993k == null || i(fjVar) || z(fjVar) || !TextUtils.isEmpty(fjVar.f23993k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            if (!org.telegram.messenger.j10.i(i7).q() && u12.f25832x4 != 0 && connectionsManager.getCurrentTime() <= u12.f25832x4 && u12.f25842y4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void w(org.telegram.messenger.fj fjVar) {
        Integer valueOf = Integer.valueOf(q(fjVar));
        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) R.remove(valueOf);
        Runnable runnable = (Runnable) S.remove(valueOf);
        if (fjVar2 == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(valueOf);
        }
        org.telegram.messenger.fj[] fjVarArr = {fjVar2, fjVar};
        for (int i7 = 0; i7 < 2; i7++) {
            TLRPC.Message message = fjVarArr[i7].f23993k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (org.telegram.messenger.s2.f26749a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + " stopped");
        }
        org.telegram.messenger.ks.f(fjVar2.K1).k(org.telegram.messenger.ks.A1, fjVar2);
    }

    public static void x(org.telegram.messenger.fj fjVar, String str) {
        ArrayList arrayList;
        int i7 = fjVar.K1;
        long B0 = org.telegram.messenger.fj.B0(fjVar.f23993k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = (ArrayList) ai.w0.f1589a.get(Long.valueOf(B0));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        android.support.v4.media.session.a0 T = DictationAsr.T(arrayList, false);
        if (org.telegram.messenger.s2.f26749a) {
            org.telegram.messenger.a8.b("local transcription of msg_id=" + fjVar.e1() + " with " + T);
        }
        Integer valueOf = Integer.valueOf(q(fjVar));
        HashMap hashMap = S;
        h21 h21Var = new h21(valueOf, fjVar, i7, B0, elapsedRealtime);
        boolean[] zArr = {false};
        DictationLid.d(org.telegram.messenger.t0.f26941b);
        new Thread(new ai.r(str, zArr, h21Var, T, 0), "DictationAsrFile").start();
        hashMap.put(valueOf, new ai.s(0, zArr));
    }

    public static void y(final org.telegram.messenger.fj fjVar, boolean z10, final org.telegram.ui.Cells.m1 m1Var) {
        ArrayList arrayList;
        ai.t tVar;
        if (fjVar != null && fjVar.f23993k != null && fjVar.q4()) {
            final int i7 = fjVar.K1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer o12 = org.telegram.messenger.mp.u1(i7).o1(fjVar.f23993k.peer_id);
            final long n10 = org.telegram.messenger.n5.n(o12);
            TLRPC.Message message = fjVar.f23993k;
            final int i10 = message.f28452id;
            int i11 = 0;
            if (z10) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal && (!message.voiceTranscriptionLocal || z(fjVar))) {
                    p(fjVar);
                    fjVar.f23993k.voiceTranscriptionOpen = true;
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                    a02.f27080a.c(new org.telegram.messenger.ek(a02, i10, n10, fjVar.f23993k, 6));
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            int i12 = r2;
                            org.telegram.messenger.fj fjVar2 = fjVar;
                            int i13 = i7;
                            switch (i12) {
                                case 0:
                                    org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i13);
                                    Boolean bool = Boolean.TRUE;
                                    f10.k(115, fjVar2, null, null, bool, bool);
                                    return;
                                default:
                                    org.telegram.messenger.ks.f(i13).k(115, fjVar2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (z(fjVar)) {
                    ArrayList arrayList2 = (ArrayList) ai.w0.f1589a.get(Long.valueOf(org.telegram.messenger.fj.B0(fjVar.f23993k)));
                    if (arrayList2 != null) {
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    android.support.v4.media.session.a0 T = DictationAsr.T(arrayList, false);
                    if (T != null && ((tVar = (ai.t) T.f1717b) == null || tVar.f1512f != 0 || DictationAsr.y(tVar) || ai.l1.b())) {
                        int i12 = fjVar.K1;
                        if (P == null) {
                            P = new HashMap();
                        }
                        Integer valueOf = Integer.valueOf(q(fjVar));
                        P.put(valueOf, fjVar);
                        R.put(valueOf, fjVar);
                        org.telegram.messenger.w7.G(i12);
                        File M = org.telegram.messenger.w7.M(fjVar.f23993k, false, true);
                        if (M != null && M.exists()) {
                            x(fjVar, M.getAbsolutePath());
                            return;
                        }
                        String r10 = org.telegram.messenger.w7.r(null, fjVar.F0());
                        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i12);
                        g21 g21Var = new g21(r10, f10, fjVar);
                        f10.b(g21Var, org.telegram.messenger.ks.Y1);
                        f10.b(g21Var, org.telegram.messenger.ks.Z1);
                        S.put(valueOf, new fm0(15, f10, g21Var));
                        org.telegram.messenger.w7.G(i12).W(fjVar.F0(), fjVar, 3, 0);
                        return;
                    }
                    n(fjVar);
                    return;
                } else {
                    if (org.telegram.messenger.s2.f26749a) {
                        org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n10);
                    }
                    TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                    tL_messages_transcribeAudio.peer = o12;
                    tL_messages_transcribeAudio.msg_id = i10;
                    if (P == null) {
                        P = new HashMap();
                    }
                    P.put(Integer.valueOf(q(fjVar)), fjVar);
                    if (!org.telegram.messenger.j10.i(i7).q()) {
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
                            org.telegram.messenger.fj fjVar2 = fjVar;
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
                                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i13);
                                    int i14 = tL_messages_transcribedAudio.trial_remains_num;
                                    if (i14 != u12.f25842y4) {
                                        u12.f25842y4 = i14;
                                        u12.h7.edit().putInt("transcribeAudioTrialCurrentNumber", u12.f25842y4).apply();
                                    }
                                    org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(i13);
                                    int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                                    if (i15 != u13.f25832x4) {
                                        u13.f25832x4 = i15;
                                        u13.h7.edit().putInt("transcribeAudioTrialCooldownUntil", u13.f25832x4).apply();
                                        org.telegram.messenger.g0.g3(new org.telegram.messenger.rj(u13, 3));
                                    }
                                    org.telegram.messenger.g0.g3(new fm0(16, m1Var2, tL_messages_transcribedAudio));
                                }
                                if (j21.O == null) {
                                    j21.O = new HashMap();
                                }
                                j21.O.put(Long.valueOf(j3), fjVar2);
                                fjVar2.f23993k.voiceTranscriptionId = j3;
                            } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                                org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(i13);
                                if (u14.f25842y4 != 0) {
                                    u14.f25842y4 = 0;
                                    u14.h7.edit().putInt("transcribeAudioTrialCurrentNumber", u14.f25842y4).apply();
                                }
                                org.telegram.messenger.mp u15 = org.telegram.messenger.mp.u1(i13);
                                int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                                if (intValue != u15.f25832x4) {
                                    u15.f25832x4 = intValue;
                                    u15.h7.edit().putInt("transcribeAudioTrialCooldownUntil", u15.f25832x4).apply();
                                    org.telegram.messenger.g0.g3(new org.telegram.messenger.rj(u15, 3));
                                }
                                org.telegram.messenger.g0.g3(new j01(fjVar2, m1Var2, i13, 1));
                                return;
                            } else {
                                z11 = true;
                                j3 = 0;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            j21.p(fjVar2);
                            TLRPC.Message message2 = fjVar2.f23993k;
                            message2.voiceTranscriptionOpen = true;
                            message2.voiceTranscriptionFinal = z11;
                            message2.voiceTranscriptionLocal = false;
                            message2.voiceTranscriptionWords = null;
                            if (org.telegram.messenger.s2.f26749a) {
                                org.telegram.messenger.a8.b("Transcription request sent, received final=" + z11 + " id=" + j3 + " text=" + str2);
                            }
                            org.telegram.messenger.tr a03 = org.telegram.messenger.tr.a0(i13);
                            String str4 = str2;
                            a03.f27080a.c(new org.telegram.messenger.z1(a03, i10, n10, fjVar2.f23993k, str4, 2));
                            if (z11) {
                                org.telegram.messenger.g0.h3(new c21(fjVar2, j3, str4, 1), Math.max(0L, 350 - elapsedRealtime2));
                            }
                        }
                    }, i11);
                    return;
                }
            }
            w(fjVar);
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(q(fjVar)));
            }
            fjVar.f23993k.voiceTranscriptionOpen = false;
            org.telegram.messenger.tr a03 = org.telegram.messenger.tr.a0(i7);
            a03.f27080a.c(new org.telegram.messenger.ek(a03, i10, n10, fjVar.f23993k, 6));
            org.telegram.messenger.g0.g3(new Runnable() {
                @Override
                public final void run() {
                    int i122 = r2;
                    org.telegram.messenger.fj fjVar2 = fjVar;
                    int i13 = i7;
                    switch (i122) {
                        case 0:
                            org.telegram.messenger.ks f102 = org.telegram.messenger.ks.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f102.k(115, fjVar2, null, null, bool, bool);
                            return;
                        default:
                            org.telegram.messenger.ks.f(i13).k(115, fjVar2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public static boolean z(org.telegram.messenger.fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (org.telegram.messenger.fj.R4(fjVar.f23993k) && DictationAsr.w(i7) && ai.l1.h() && DictationAsr.B(i7) && fjVar.L0() * 16000.0d * 4.0d < 3.145728E8d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int A() {
        return this.f36384u.width();
    }

    public final int h() {
        return this.f36384u.height();
    }

    public final void o() {
        boolean z10;
        org.telegram.ui.Cells.r1 r1Var = this.f36381r;
        if (r1Var != null) {
            this.f36385w = false;
            boolean z11 = this.f36388z;
            boolean z12 = !z11;
            boolean z13 = this.f36386x;
            if (!z11) {
                z10 = !this.f36374k;
                if ((z13 || e(r1Var.getMessageObject()) || z(r1Var.getMessageObject())) && r1Var.getMessageObject().q4()) {
                    r(true, true);
                }
            } else {
                t(false, true);
                r(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.y yVar = this.f36380q;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
                r1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(r1Var.getMessageObject()) && !z(r1Var.getMessageObject()) && (r1Var.getMessageObject() == null || r1Var.getMessageObject().f23993k == null || TextUtils.isEmpty(r1Var.getMessageObject().f23993k.voiceTranscription))) {
                        if (r1Var.getDelegate() != null) {
                            if (org.telegram.messenger.mp.u1(r1Var.f31358a6).f25812v4 > 0) {
                                r1Var.getDelegate().h0(3);
                                return;
                            } else {
                                r1Var.getDelegate().h0(0);
                                return;
                            }
                        }
                        return;
                    }
                    y(r1Var.getMessageObject(), z12, r1Var.getDelegate());
                    return;
                }
                if (!z11) {
                    this.f36385w = true;
                }
                y(r1Var.getMessageObject(), z12, r1Var.getDelegate());
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        this.f36374k = z10;
        en0 en0Var = this.f36382s;
        if (!en0Var.f34940z && z10 && en0Var.B.f34391c <= 0.0f) {
            en0Var.A = SystemClock.elapsedRealtime();
        }
        en0Var.f34940z = z10;
        org.telegram.ui.Cells.r1 r1Var = en0Var.f34929n;
        if (r1Var != null) {
            r1Var.invalidate();
        }
        d6 d6Var = this.f36375l;
        if (!z11) {
            d6Var.f(this.f36374k, true);
        } else if (d6Var.f34391c <= 0.0f) {
            this.f36383t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.r1 r1Var2 = this.f36381r;
        if (r1Var2 != null) {
            r1Var2.invalidate();
        }
    }

    public final void s(boolean z10, boolean z11) {
        org.telegram.ui.Cells.r1 r1Var;
        if (this.f36372i != z10 && (r1Var = this.f36381r) != null) {
            r1Var.invalidate();
        }
        this.f36372i = z10;
        if (!z11) {
            this.f36373j.f(z10, true);
        }
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12 = this.f36388z;
        if (!z12 && z10 && this.f36385w) {
            this.f36385w = false;
            ((org.telegram.ui.Cells.c1) this).T.f30547a.T2 = true;
        }
        this.f36388z = z10;
        oh0 oh0Var = this.f36379p;
        oh0 oh0Var2 = this.f36377n;
        if (z11) {
            if (z10 && !z12) {
                this.f36387y = false;
                oh0Var2.M(0);
                oh0Var.M(0);
                oh0Var.start();
            } else if (!z10 && z12) {
                this.f36387y = true;
                oh0Var.M(0);
                oh0Var2.M(0);
                oh0Var2.start();
            }
        } else {
            this.f36387y = z10;
            oh0Var2.stop();
            oh0Var.stop();
            oh0Var2.M(0);
            oh0Var.M(0);
        }
        org.telegram.ui.Cells.r1 r1Var = this.f36381r;
        if (r1Var != null) {
            r1Var.invalidate();
        }
    }
}
