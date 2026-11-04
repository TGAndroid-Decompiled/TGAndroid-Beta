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
public abstract class m11 {
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
    public int f35956a;
    public int f35957b;
    public int f35958c;
    public int d;
    public float f35959e;
    public Paint f35960f;
    public Paint f35961g;
    public Path h;
    public boolean f35962i;
    public final u5 f35963j;
    public boolean f35964k;
    public final u5 f35965l;
    public int f35966m;
    public final ch0 f35967n;
    public int f35968o;
    public final ch0 f35969p;
    public org.telegram.ui.Cells.y f35970q;
    public final org.telegram.ui.Cells.q1 f35971r;
    public final sm0 f35972s;
    public final Rect f35974u;
    public final Rect v;
    public final boolean f35976x;
    public boolean f35977y;
    public boolean f35978z;
    public boolean f35975w = false;
    public boolean A = false;
    public final w1.a B = new w1.a();
    public long f35973t = SystemClock.elapsedRealtime();

    public m11(org.telegram.ui.Cells.q1 q1Var, sm0 sm0Var) {
        boolean z10 = false;
        this.f35971r = q1Var;
        this.f35972s = sm0Var;
        Rect rect = new Rect(0, 0, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        this.f35974u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        ch0 ch0Var = new ch0(2131624301, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f35969p = ch0Var;
        ch0Var.M(0);
        ch0Var.setCallback(q1Var);
        ch0Var.S(19, new Runnable(this) {
            public final m11 f34917b;

            {
                this.f34917b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m11 m11Var = this.f34917b;
                        m11Var.f35969p.stop();
                        ch0 ch0Var2 = m11Var.f35967n;
                        ch0Var2.stop();
                        m11Var.f35978z = true;
                        m11Var.f35977y = true;
                        ch0Var2.M(0);
                        return;
                    default:
                        m11 m11Var2 = this.f34917b;
                        m11Var2.f35967n.stop();
                        ch0 ch0Var3 = m11Var2.f35969p;
                        ch0Var3.stop();
                        m11Var2.f35978z = false;
                        m11Var2.f35977y = false;
                        ch0Var3.M(0);
                        return;
                }
            }
        });
        ch0Var.J(true);
        ch0 ch0Var2 = new ch0(2131624300, org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f));
        this.f35967n = ch0Var2;
        ch0Var2.M(0);
        ch0Var2.setCallback(q1Var);
        ch0Var2.R(q1Var);
        ch0Var2.S(19, new Runnable(this) {
            public final m11 f34917b;

            {
                this.f34917b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m11 m11Var = this.f34917b;
                        m11Var.f35969p.stop();
                        ch0 ch0Var22 = m11Var.f35967n;
                        ch0Var22.stop();
                        m11Var.f35978z = true;
                        m11Var.f35977y = true;
                        ch0Var22.M(0);
                        return;
                    default:
                        m11 m11Var2 = this.f34917b;
                        m11Var2.f35967n.stop();
                        ch0 ch0Var3 = m11Var2.f35969p;
                        ch0Var3.stop();
                        m11Var2.f35978z = false;
                        m11Var2.f35977y = false;
                        ch0Var3.M(0);
                        return;
                }
            }
        });
        ch0Var2.J(true);
        this.f35977y = false;
        this.f35978z = false;
        if (q1Var.getMessageObject() != null && org.telegram.messenger.h10.i(q1Var.getMessageObject().I1).q()) {
            z10 = true;
        }
        this.f35976x = z10;
        xq xqVar = xq.h;
        this.f35965l = new u5(q1Var, 250L, xqVar);
        this.f35963j = new u5(q1Var, 250L, xqVar);
    }

    public static void a(Path path, int i3, int i10, int i11, int i12, float f10, float f11) {
        float a10 = b8.be.a(f10, 0.0f, 1.0f);
        float a11 = b8.be.a(f11, 0.0f, 1.0f) - a10;
        if (a11 <= 0.0f) {
            return;
        }
        if (i12 == 1) {
            org.telegram.messenger.g0.P.set(i3 - i11, i10, i3, i10 + i11);
        } else if (i12 == 2) {
            org.telegram.messenger.g0.P.set(i3 - i11, i10 - i11, i3, i10);
        } else if (i12 == 3) {
            org.telegram.messenger.g0.P.set(i3, i10 - i11, i3 + i11, i10);
        } else if (i12 == 4) {
            org.telegram.messenger.g0.P.set(i3, i10, i3 + i11, i10 + i11);
        }
        path.addArc(org.telegram.messenger.g0.P, (a10 * 90.0f) + ((i12 * 90) - 180), a11 * 90.0f);
    }

    public static void b(Path path, int i3, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (f10 > f11) {
            float f14 = f13 - f12;
            a(path, i3, i10, i11, i12, (f10 - f12) / f14, 1.0f);
            a(path, i3, i10, i11, i12, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        a(path, i3, i10, i11, i12, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
    }

    public static void c(Path path, int i3, int i10, int i11, int i12, float f10, float f11) {
        if (i3 != i11 || i10 != i12) {
            float a10 = b8.be.a(f10, 0.0f, 1.0f);
            float a11 = b8.be.a(f11, 0.0f, 1.0f);
            if (a11 - a10 <= 0.0f) {
                return;
            }
            path.moveTo(org.telegram.messenger.g0.W1(a10, i3, i11), org.telegram.messenger.g0.W1(a10, i10, i12));
            path.lineTo(org.telegram.messenger.g0.W1(a11, i3, i11), org.telegram.messenger.g0.W1(a11, i10, i12));
        }
    }

    public static void d(Path path, int i3, int i10, int i11, int i12, float f10, float f11, float f12, float f13) {
        if (i3 == i11 && i10 == i12) {
            return;
        }
        if (f10 > f11) {
            float f14 = f13 - f12;
            c(path, i3, i10, i11, i12, (f10 - f12) / f14, 1.0f);
            c(path, i3, i10, i11, i12, 0.0f, (f11 - f12) / f14);
            return;
        }
        float f15 = f13 - f12;
        c(path, i3, i10, i11, i12, Math.max(0.0f, f10 - f12) / f15, (Math.min(f11, f13) - f12) / f15);
    }

    public static boolean e(org.telegram.messenger.zi ziVar) {
        if (ziVar != null) {
            int i3 = ziVar.I1;
            if (ziVar.f26868k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
                if (i(ziVar)) {
                    return true;
                }
                if (s12.f23118s4 > 0 && ziVar.L0() <= s12.f23126t4) {
                    if (s12.f23135u4 != 0 && connectionsManager.getCurrentTime() <= s12.f23135u4 && s12.f23144v4 <= 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(org.telegram.messenger.zi ziVar, long j10, String str) {
        org.telegram.messenger.zi ziVar2;
        org.telegram.messenger.zi ziVar3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j10))) {
                ziVar2 = (org.telegram.messenger.zi) O.remove(Long.valueOf(j10));
            } else {
                ziVar2 = null;
            }
            if (ziVar == null) {
                ziVar3 = ziVar2;
            } else {
                ziVar3 = ziVar;
            }
            if (ziVar3 != null && ziVar3.f26868k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(n(ziVar3)));
                }
                ziVar3.f26868k.voiceTranscriptionFinal = true;
                org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(ziVar3.I1);
                long B0 = org.telegram.messenger.zi.B0(ziVar3.f26868k);
                a02.f24934a.c(new org.telegram.messenger.z1(a02, ziVar3.f1(), B0, ziVar3.f26868k, str, 2));
                org.telegram.messenger.g0.h3(new k11(ziVar3, j10, str, 1));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int g(int i3) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        if (s12.f23118s4 <= 0) {
            return 0;
        }
        if (s12.f23135u4 != 0 && connectionsManager.getCurrentTime() <= s12.f23135u4) {
            return s12.f23144v4;
        }
        return s12.f23118s4;
    }

    public static boolean i(org.telegram.messenger.zi ziVar) {
        if (ziVar != null && ziVar.f26868k != null) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(ziVar.I1);
            TLRPC.Chat M0 = s12.M0(Long.valueOf(ziVar.x0()));
            if (org.telegram.messenger.t3.n0(M0) && M0.level >= s12.A5) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(org.telegram.messenger.zi ziVar) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(ziVar) && !P.containsKey(Integer.valueOf(n(ziVar))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && ziVar != null && (message = ziVar.f26868k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean k(org.telegram.messenger.zi ziVar) {
        if (Q != null) {
            if (!ziVar.i4() || Q.contains(Integer.valueOf(n(ziVar)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void m(org.telegram.messenger.zi ziVar) {
        if (ziVar != null && !k(ziVar)) {
            if (Q == null) {
                Q = new ArrayList(1);
            }
            Q.add(Integer.valueOf(n(ziVar)));
        }
    }

    public static int n(org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(ziVar.I1), Long.valueOf(org.telegram.messenger.zi.B0(ziVar.f26868k)), Integer.valueOf(ziVar.f1()));
    }

    public static void r(org.telegram.messenger.zi ziVar, boolean z10) {
        TLRPC.Message message = ziVar.f26868k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(ziVar.I1);
            long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
            a02.f24934a.c(new org.telegram.messenger.yj(a02, ziVar.f1(), B0, ziVar.f26868k, 6));
            if (z10) {
                org.telegram.messenger.g0.h3(new sp0(ziVar, 20));
            }
        }
    }

    public static boolean s(org.telegram.messenger.zi ziVar) {
        if (ziVar != null) {
            int i3 = ziVar.I1;
            if (ziVar.f26868k == null || i(ziVar) || !TextUtils.isEmpty(ziVar.f26868k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            if (!org.telegram.messenger.h10.i(i3).q() && s12.f23135u4 != 0 && connectionsManager.getCurrentTime() <= s12.f23135u4 && s12.f23144v4 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void t(final org.telegram.messenger.zi ziVar, boolean z10, final org.telegram.ui.Cells.l1 l1Var) {
        if (ziVar != null && ziVar.f26868k != null && ziVar.r4()) {
            final int i3 = ziVar.I1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer m1 = org.telegram.messenger.hp.s1(i3).m1(ziVar.f26868k.peer_id);
            final long n4 = org.telegram.messenger.m5.n(m1);
            TLRPC.Message message = ziVar.f26868k;
            final int i10 = message.f27022id;
            int i11 = 0;
            if (z10) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
                    m(ziVar);
                    ziVar.f26868k.voiceTranscriptionOpen = true;
                    org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i3);
                    a02.f24934a.c(new org.telegram.messenger.yj(a02, i10, n4, ziVar.f26868k, 6));
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            int i12 = r2;
                            org.telegram.messenger.zi ziVar2 = ziVar;
                            int i13 = i3;
                            switch (i12) {
                                case 0:
                                    org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(i13);
                                    Boolean bool = Boolean.TRUE;
                                    f10.k(115, ziVar2, null, null, bool, bool);
                                    return;
                                default:
                                    org.telegram.messenger.hs.f(i13).k(115, ziVar2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                }
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("sending Transcription request, msg_id=" + i10 + " dialog_id=" + n4);
                }
                TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                tL_messages_transcribeAudio.peer = m1;
                tL_messages_transcribeAudio.msg_id = i10;
                if (P == null) {
                    P = new HashMap();
                }
                P.put(Integer.valueOf(n(ziVar)), ziVar);
                if (!org.telegram.messenger.h10.i(i3).q()) {
                    i11 = 1024;
                }
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z11;
                        long j10;
                        String str;
                        boolean z12 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                        int i12 = i3;
                        org.telegram.ui.Cells.l1 l1Var2 = l1Var;
                        org.telegram.messenger.zi ziVar2 = ziVar;
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
                                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i12);
                                int i13 = tL_messages_transcribedAudio.trial_remains_num;
                                if (i13 != s12.f23144v4) {
                                    s12.f23144v4 = i13;
                                    s12.f22999e7.edit().putInt("transcribeAudioTrialCurrentNumber", s12.f23144v4).apply();
                                }
                                org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(i12);
                                int i14 = tL_messages_transcribedAudio.trial_remains_until_date;
                                if (i14 != s13.f23135u4) {
                                    s13.f23135u4 = i14;
                                    s13.f22999e7.edit().putInt("transcribeAudioTrialCooldownUntil", s13.f23135u4).apply();
                                    org.telegram.messenger.g0.h3(new org.telegram.messenger.mj(s13, 3));
                                }
                                org.telegram.messenger.g0.h3(new j50(29, l1Var2, tL_messages_transcribedAudio));
                            }
                            if (m11.O == null) {
                                m11.O = new HashMap();
                            }
                            m11.O.put(Long.valueOf(j11), ziVar2);
                            ziVar2.f26868k.voiceTranscriptionId = j11;
                            j10 = j11;
                        } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(i12);
                            if (s14.f23144v4 != 0) {
                                s14.f23144v4 = 0;
                                s14.f22999e7.edit().putInt("transcribeAudioTrialCurrentNumber", s14.f23144v4).apply();
                            }
                            org.telegram.messenger.hp s15 = org.telegram.messenger.hp.s1(i12);
                            int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i12).getCurrentTime();
                            if (intValue != s15.f23135u4) {
                                s15.f23135u4 = intValue;
                                s15.f22999e7.edit().putInt("transcribeAudioTrialCooldownUntil", s15.f23135u4).apply();
                                org.telegram.messenger.g0.h3(new org.telegram.messenger.mj(s15, 3));
                            }
                            org.telegram.messenger.g0.h3(new org.telegram.ui.f4(ziVar2, l1Var2, i12, 28));
                            return;
                        } else {
                            z11 = true;
                            j10 = 0;
                        }
                        String str4 = str2;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        m11.m(ziVar2);
                        TLRPC.Message message2 = ziVar2.f26868k;
                        message2.voiceTranscriptionOpen = true;
                        message2.voiceTranscriptionFinal = z11;
                        if (org.telegram.messenger.r2.f25040a) {
                            org.telegram.messenger.a8.b("Transcription request sent, received final=" + z11 + " id=" + j10 + " text=" + str4);
                        }
                        org.telegram.messenger.qr a03 = org.telegram.messenger.qr.a0(i12);
                        a03.f24934a.c(new org.telegram.messenger.z1(a03, i10, n4, ziVar2.f26868k, str4, 2));
                        if (z11) {
                            org.telegram.messenger.g0.i3(new k11(ziVar2, j10, str4, 0), Math.max(0L, 350 - elapsedRealtime2));
                        }
                    }
                }, i11);
                return;
            }
            HashMap hashMap = P;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(n(ziVar)));
            }
            ziVar.f26868k.voiceTranscriptionOpen = false;
            org.telegram.messenger.qr a03 = org.telegram.messenger.qr.a0(i3);
            a03.f24934a.c(new org.telegram.messenger.yj(a03, i10, n4, ziVar.f26868k, 6));
            org.telegram.messenger.g0.h3(new Runnable() {
                @Override
                public final void run() {
                    int i12 = r2;
                    org.telegram.messenger.zi ziVar2 = ziVar;
                    int i13 = i3;
                    switch (i12) {
                        case 0:
                            org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(i13);
                            Boolean bool = Boolean.TRUE;
                            f10.k(115, ziVar2, null, null, bool, bool);
                            return;
                        default:
                            org.telegram.messenger.hs.f(i13).k(115, ziVar2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final int h() {
        return this.f35974u.height();
    }

    public final void l() {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var = this.f35971r;
        if (q1Var != null) {
            this.f35975w = false;
            boolean z11 = this.f35978z;
            boolean z12 = !z11;
            boolean z13 = this.f35976x;
            if (!z11) {
                z10 = !this.f35964k;
                if ((z13 || e(q1Var.getMessageObject())) && q1Var.getMessageObject().r4()) {
                    o(true, true);
                }
            } else {
                q(false, true);
                o(false, true);
                z10 = true;
            }
            org.telegram.ui.Cells.y yVar = this.f35970q;
            if (yVar != null) {
                yVar.setState(StateSet.NOTHING);
                q1Var.invalidate();
            }
            this.A = false;
            if (z10) {
                if (!z13 && !z11) {
                    if (!e(q1Var.getMessageObject()) && (q1Var.getMessageObject() == null || q1Var.getMessageObject().f26868k == null || TextUtils.isEmpty(q1Var.getMessageObject().f26868k.voiceTranscription))) {
                        if (q1Var.getDelegate() != null) {
                            if (org.telegram.messenger.hp.s1(q1Var.Z5).f23118s4 > 0) {
                                q1Var.getDelegate().e0(3);
                                return;
                            } else {
                                q1Var.getDelegate().e0(0);
                                return;
                            }
                        }
                        return;
                    }
                    t(q1Var.getMessageObject(), z12, q1Var.getDelegate());
                    return;
                }
                if (!z11) {
                    this.f35975w = true;
                }
                t(q1Var.getMessageObject(), z12, q1Var.getDelegate());
            }
        }
    }

    public final void o(boolean z10, boolean z11) {
        this.f35964k = z10;
        sm0 sm0Var = this.f35972s;
        if (!sm0Var.f38087z && z10 && sm0Var.B.f38645c <= 0.0f) {
            sm0Var.A = SystemClock.elapsedRealtime();
        }
        sm0Var.f38087z = z10;
        org.telegram.ui.Cells.q1 q1Var = sm0Var.f38076n;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        u5 u5Var = this.f35965l;
        if (!z11) {
            u5Var.f(this.f35964k, true);
        } else if (u5Var.f38645c <= 0.0f) {
            this.f35973t = SystemClock.elapsedRealtime();
        }
        org.telegram.ui.Cells.q1 q1Var2 = this.f35971r;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void p(boolean z10, boolean z11) {
        org.telegram.ui.Cells.q1 q1Var;
        if (this.f35962i != z10 && (q1Var = this.f35971r) != null) {
            q1Var.invalidate();
        }
        this.f35962i = z10;
        if (!z11) {
            this.f35963j.f(z10, true);
        }
    }

    public final void q(boolean z10, boolean z11) {
        boolean z12 = this.f35978z;
        if (!z12 && z10 && this.f35975w) {
            this.f35975w = false;
            ((org.telegram.ui.Cells.a1) this).R.f28976a.S2 = true;
        }
        this.f35978z = z10;
        ch0 ch0Var = this.f35969p;
        ch0 ch0Var2 = this.f35967n;
        if (z11) {
            if (z10 && !z12) {
                this.f35977y = false;
                ch0Var2.M(0);
                ch0Var.M(0);
                ch0Var.start();
            } else if (!z10 && z12) {
                this.f35977y = true;
                ch0Var.M(0);
                ch0Var2.M(0);
                ch0Var2.start();
            }
        } else {
            this.f35977y = z10;
            ch0Var2.stop();
            ch0Var.stop();
            ch0Var2.M(0);
            ch0Var.M(0);
        }
        org.telegram.ui.Cells.q1 q1Var = this.f35971r;
        if (q1Var != null) {
            q1Var.invalidate();
        }
    }

    public final int u() {
        return this.f35974u.width();
    }
}
