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
public abstract class v21 {
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
    public int f31145a;
    public int f31146b;
    public int f31147c;
    public int d;
    public float e;
    public Paint f31148f;
    public Paint f31149g;
    public Path h;
    public boolean f31150i;
    public final t5 f31151j;
    public boolean f31152k;
    public final t5 f31153l;
    public int f31154m;
    public final ci0 f31155n;
    public int f31156o;
    public final ci0 f31157p;
    public org.telegram.ui.Cells.y f31158q;
    public final org.telegram.ui.Cells.q1 f31159r;
    public final rn0 f31160s;
    public final Rect f31162u;
    public final Rect v;
    public final boolean f31164x;
    public boolean f31165y;
    public boolean f31166z;
    public boolean f31163w = false;
    public boolean A = false;
    public final u1.a B = new u1.a();
    public long f31161t = SystemClock.elapsedRealtime();

    public v21(org.telegram.ui.Cells.q1 q1Var, rn0 rn0Var) {
        boolean z10 = false;
        this.f31159r = q1Var;
        this.f31160s = rn0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
        this.f31162u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        ci0 ci0Var = new ci0(2131624299, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f));
        this.f31157p = ci0Var;
        ci0Var.M(0);
        ci0Var.setCallback(q1Var);
        ci0Var.S(19, new Runnable(this) {
            public final v21 f30171b;

            {
                this.f30171b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v21 v21Var = this.f30171b;
                        v21Var.f31157p.stop();
                        ci0 ci0Var2 = v21Var.f31155n;
                        ci0Var2.stop();
                        v21Var.f31166z = true;
                        v21Var.f31165y = true;
                        ci0Var2.M(0);
                        return;
                    default:
                        v21 v21Var2 = this.f30171b;
                        v21Var2.f31155n.stop();
                        ci0 ci0Var3 = v21Var2.f31157p;
                        ci0Var3.stop();
                        v21Var2.f31166z = false;
                        v21Var2.f31165y = false;
                        ci0Var3.M(0);
                        return;
                }
            }
        });
        ci0Var.J(true);
        ci0 ci0Var2 = new ci0(2131624298, org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f));
        this.f31155n = ci0Var2;
        ci0Var2.M(0);
        ci0Var2.setCallback(q1Var);
        ci0Var2.R(q1Var);
        ci0Var2.S(19, new Runnable(this) {
            public final v21 f30171b;

            {
                this.f30171b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v21 v21Var = this.f30171b;
                        v21Var.f31157p.stop();
                        ci0 ci0Var22 = v21Var.f31155n;
                        ci0Var22.stop();
                        v21Var.f31166z = true;
                        v21Var.f31165y = true;
                        ci0Var22.M(0);
                        return;
                    default:
                        v21 v21Var2 = this.f30171b;
                        v21Var2.f31155n.stop();
                        ci0 ci0Var3 = v21Var2.f31157p;
                        ci0Var3.stop();
                        v21Var2.f31166z = false;
                        v21Var2.f31165y = false;
                        ci0Var3.M(0);
                        return;
                }
            }
        });
        ci0Var2.J(true);
        this.f31165y = false;
        this.f31166z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.e20.i(q1Var.getMessageObject().I1).q()) {
            z10 = true;
        }
        this.f31164x = z10;
        gr grVar = gr.h;
        this.f31153l = new t5(q1Var, 250L, grVar);
        this.f31151j = new t5(q1Var, 250L, grVar);
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

    public static boolean e(org.telegram.messenger.kj kjVar) {
        if (kjVar != null) {
            int i10 = kjVar.I1;
            if (kjVar.f16690k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
                if (i(kjVar)) {
                    return true;
                }
                if (r12.f19250t4 > 0 && kjVar.L0() <= r12.f19259u4) {
                    if (r12.f19268v4 != 0 && connectionsManager.getCurrentTime() <= r12.f19268v4 && r12.f19278w4 <= 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.kj kjVar, long j10, String str) {
        org.telegram.messenger.kj kjVar2;
        org.telegram.messenger.kj kjVar3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j10))) {
                kjVar2 = (org.telegram.messenger.kj) O.remove(Long.valueOf(j10));
            } else {
                kjVar2 = null;
            }
            if (kjVar == null) {
                kjVar3 = kjVar2;
            } else {
                kjVar3 = kjVar;
            }
            if (kjVar3 != null && kjVar3.f16690k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(n(kjVar3)));
                }
                kjVar3.f16690k.voiceTranscriptionFinal = true;
                org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(kjVar3.I1);
                long B0 = org.telegram.messenger.kj.B0(kjVar3.f16690k);
                a02.f16331a.c(new org.telegram.messenger.d2(a02, kjVar3.f1(), B0, kjVar3.f16690k, str, 2));
                org.telegram.messenger.i0.g3(new t21(kjVar3, j10, str, 1));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g(int i10) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        if (r12.f19250t4 <= 0) {
            return 0;
        }
        if (r12.f19268v4 != 0 && connectionsManager.getCurrentTime() <= r12.f19268v4) {
            return r12.f19278w4;
        }
        return r12.f19250t4;
    }

    public static boolean i(org.telegram.messenger.kj kjVar) {
        if (kjVar != null && kjVar.f16690k != null) {
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(kjVar.I1);
            TLRPC.Chat L0 = r12.L0(Long.valueOf(kjVar.x0()));
            if (org.telegram.messenger.w3.n0(L0) && L0.level >= r12.B5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.kj kjVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(kjVar) && !P.containsKey(Integer.valueOf(n(kjVar))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && kjVar != null && (message = kjVar.f16690k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean k(org.telegram.messenger.kj kjVar) {
        if (Q != null) {
            if (!kjVar.h4() || Q.contains(Integer.valueOf(n(kjVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(org.telegram.messenger.kj kjVar) {
        if (kjVar != null && !k(kjVar)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(n(kjVar)));
        }
    }

    public static int n(org.telegram.messenger.kj kjVar) {
        if (kjVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(kjVar.I1), Long.valueOf(org.telegram.messenger.kj.B0(kjVar.f16690k)), Integer.valueOf(kjVar.f1()));
    }

    public static void r(org.telegram.messenger.kj kjVar, boolean z10) {
        TLRPC.Message message = kjVar.f16690k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(kjVar.I1);
            long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
            a02.f16331a.c(new org.telegram.messenger.sk(a02, kjVar.f1(), B0, kjVar.f16690k, 7));
            if (z10) {
                org.telegram.messenger.i0.g3(new vo0(kjVar, 23));
            }
        }
    }

    public static boolean s(org.telegram.messenger.kj kjVar) {
        if (kjVar != null) {
            int i10 = kjVar.I1;
            if (kjVar.f16690k == null || i(kjVar) || !TextUtils.isEmpty(kjVar.f16690k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
            if (!org.telegram.messenger.e20.i(i10).q() && r12.f19268v4 != 0 && connectionsManager.getCurrentTime() <= r12.f19268v4 && r12.f19278w4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void t(final org.telegram.messenger.kj kjVar, boolean z10, final org.telegram.ui.Cells.l1 l1Var) {
        if (kjVar != null && kjVar.f16690k != null && kjVar.q4()) {
            final int i10 = kjVar.I1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer l1 = org.telegram.messenger.wp.r1(i10).l1(kjVar.f16690k.peer_id);
            final long n10 = org.telegram.messenger.o5.n(l1);
            TLRPC.Message message = kjVar.f16690k;
            final int i11 = message.f19815id;
            int i12 = 0;
            if (z10) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
                    m(kjVar);
                    kjVar.f16690k.voiceTranscriptionOpen = true;
                    org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i10);
                    a02.f16331a.c(new org.telegram.messenger.sk(a02, i11, n10, kjVar.f16690k, 7));
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            int i13 = r2;
                            org.telegram.messenger.kj kjVar2 = kjVar;
                            int i14 = i10;
                            switch (i13) {
                                case 0:
                                    org.telegram.messenger.at f7 = org.telegram.messenger.at.f(i14);
                                    Boolean bool = Boolean.TRUE;
                                    f7.k(115, kjVar2, null, null, bool, bool);
                                    return;
                                default:
                                    org.telegram.messenger.at.f(i14).k(115, kjVar2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                }
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("sending Transcription request, msg_id=" + i11 + " dialog_id=" + n10);
                }
                TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                tL_messages_transcribeAudio.peer = l1;
                tL_messages_transcribeAudio.msg_id = i11;
                if (P == null) {
                    P = new HashMap();
                }
                P.put(Integer.valueOf(n(kjVar)), kjVar);
                if (!org.telegram.messenger.e20.i(i10).q()) {
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
                        org.telegram.messenger.kj kjVar2 = kjVar;
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
                                org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i13);
                                int i14 = tL_messages_transcribedAudio.trial_remains_num;
                                if (i14 != r12.f19278w4) {
                                    r12.f19278w4 = i14;
                                    r12.f7.edit().putInt("transcribeAudioTrialCurrentNumber", r12.f19278w4).apply();
                                }
                                org.telegram.messenger.wp r13 = org.telegram.messenger.wp.r1(i13);
                                int i15 = tL_messages_transcribedAudio.trial_remains_until_date;
                                if (i15 != r13.f19268v4) {
                                    r13.f19268v4 = i15;
                                    r13.f7.edit().putInt("transcribeAudioTrialCooldownUntil", r13.f19268v4).apply();
                                    org.telegram.messenger.i0.g3(new org.telegram.messenger.ak(r13, 3));
                                }
                                org.telegram.messenger.i0.g3(new hi0(18, l1Var2, tL_messages_transcribedAudio));
                            }
                            if (v21.O == null) {
                                v21.O = new HashMap();
                            }
                            v21.O.put(Long.valueOf(j11), kjVar2);
                            kjVar2.f16690k.voiceTranscriptionId = j11;
                            j10 = j11;
                        } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.wp r14 = org.telegram.messenger.wp.r1(i13);
                            if (r14.f19278w4 != 0) {
                                r14.f19278w4 = 0;
                                r14.f7.edit().putInt("transcribeAudioTrialCurrentNumber", r14.f19278w4).apply();
                            }
                            org.telegram.messenger.wp r15 = org.telegram.messenger.wp.r1(i13);
                            int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i13).getCurrentTime();
                            if (intValue != r15.f19268v4) {
                                r15.f19268v4 = intValue;
                                r15.f7.edit().putInt("transcribeAudioTrialCooldownUntil", r15.f19268v4).apply();
                                org.telegram.messenger.i0.g3(new org.telegram.messenger.ak(r15, 3));
                            }
                            org.telegram.messenger.i0.g3(new ki0(kjVar2, l1Var2, i13, 14));
                            return;
                        } else {
                            z11 = true;
                            j10 = 0;
                        }
                        String str4 = str2;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        v21.m(kjVar2);
                        TLRPC.Message message2 = kjVar2.f16690k;
                        message2.voiceTranscriptionOpen = true;
                        message2.voiceTranscriptionFinal = z11;
                        if (org.telegram.messenger.v2.f18578a) {
                            org.telegram.messenger.f8.b("Transcription request sent, received final=" + z11 + " id=" + j10 + " text=" + str4);
                        }
                        org.telegram.messenger.is a03 = org.telegram.messenger.is.a0(i13);
                        a03.f16331a.c(new org.telegram.messenger.d2(a03, i11, n10, kjVar2.f16690k, str4, 2));
                        if (z11) {
                            org.telegram.messenger.i0.h3(new t21(kjVar2, j10, str4, 0), Math.max(0L, 350 - elapsedRealtime2));
                        }
                    }
                }, i12);
                return;
            }
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(n(kjVar)));
            }
            kjVar.f16690k.voiceTranscriptionOpen = false;
            org.telegram.messenger.is a03 = org.telegram.messenger.is.a0(i10);
            a03.f16331a.c(new org.telegram.messenger.sk(a03, i11, n10, kjVar.f16690k, 7));
            org.telegram.messenger.i0.g3(new Runnable() {
                @Override
                public final void run() {
                    int i13 = r2;
                    org.telegram.messenger.kj kjVar2 = kjVar;
                    int i14 = i10;
                    switch (i13) {
                        case 0:
                            org.telegram.messenger.at f7 = org.telegram.messenger.at.f(i14);
                            Boolean bool = Boolean.TRUE;
                            f7.k(115, kjVar2, null, null, bool, bool);
                            return;
                        default:
                            org.telegram.messenger.at.f(i14).k(115, kjVar2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final int h() {
        return this.f31162u.height();
    }

    public final void l() {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var = this.f31159r;
        if (q1Var != null) {
            this.f31163w = false;
            boolean z11 = this.f31166z;
            boolean z12 = !z11;
            boolean z13 = this.f31164x;
            if (!z11) {
                z10 = !this.f31152k;
                if ((z13 || e(q1Var.getMessageObject())) && q1Var.getMessageObject().q4()) {
                    o(true, true);
                }
            } else {
                q(false, true);
                o(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.y yVar = this.f31158q;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
                q1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(q1Var.getMessageObject()) && (q1Var.getMessageObject() == null || q1Var.getMessageObject().f16690k == null || TextUtils.isEmpty(q1Var.getMessageObject().f16690k.voiceTranscription))) {
                        if (q1Var.getDelegate() != null) {
                            if (org.telegram.messenger.wp.r1(q1Var.Y5).f19250t4 > 0) {
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
                    this.f31163w = true;
                }
                t(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        this.f31152k = z10;
        rn0 rn0Var = this.f31160s;
        if (!rn0Var.f30048z && z10 && rn0Var.B.f30530c <= 0.0f) {
            rn0Var.A = SystemClock.elapsedRealtime();
        }
        rn0Var.f30048z = z10;
        org.telegram.ui.Cells.q1 q1Var = rn0Var.f30037n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        t5 t5Var = this.f31153l;
        if (!z11) {
            t5Var.f(this.f31152k, true);
        } else if (t5Var.f30530c <= 0.0f) {
            this.f31161t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.f31159r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void p(boolean z10, boolean z11) {
        org.telegram.ui.Cells.q1 q1Var;
        if (this.f31150i != z10 && (q1Var = this.f31159r) != null) {
            q1Var.invalidate();
        }
        this.f31150i = z10;
        if (!z11) {
            this.f31151j.f(z10, true);
        }
    }

    public final void q(boolean z10, boolean z11) {
        boolean z12 = this.f31166z;
        if (!z12 && z10 && this.f31163w) {
            this.f31163w = false;
            ((org.telegram.ui.Cells.z0) this).R.f21659a.R2 = true;
        }
        this.f31166z = z10;
        ci0 ci0Var = this.f31157p;
        ci0 ci0Var2 = this.f31155n;
        if (z11) {
            if (z10 && !z12) {
                this.f31165y = false;
                ci0Var2.M(0);
                ci0Var.M(0);
                ci0Var.start();
            } else if (!z10 && z12) {
                this.f31165y = true;
                ci0Var.M(0);
                ci0Var2.M(0);
                ci0Var2.start();
            }
        } else {
            this.f31165y = z10;
            ci0Var2.stop();
            ci0Var.stop();
            ci0Var2.M(0);
            ci0Var.M(0);
        }
        org.telegram.ui.Cells.q1 q1Var = this.f31159r;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    public final int u() {
        return this.f31162u.width();
    }
}
