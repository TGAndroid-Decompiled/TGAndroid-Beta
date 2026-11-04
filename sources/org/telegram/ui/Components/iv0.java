package org.telegram.ui.Components;

import android.net.Uri;
import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iv0 implements Runnable {
    public final int f34834a;
    public final Object f34835b;
    public final Object f34836c;
    public final Object d;

    public iv0(Object obj, Object obj2, Object obj3, int i3) {
        this.f34834a = i3;
        this.f34835b = obj;
        this.f34836c = obj2;
        this.d = obj3;
    }

    private final void a() {
        File file = (File) this.d;
        m2.t tVar = ((vi.j) this.f34835b).f56986g;
        long j10 = ((vi.i) this.f34836c).f56977a;
        synchronized (((e0.g) tVar.f19007c).f9237f) {
            ((HashMap) ((e0.g) tVar.f19007c).f9238g).put(Long.valueOf(j10), file);
        }
        ((Handler) ((e0.g) tVar.f19007c).d).post(new org.telegram.messenger.u0(tVar, j10, (org.telegram.messenger.ge) tVar.f19006b, file, 1));
    }

    private final void b() {
        Exception runtimeException;
        byte[] bArr;
        vi.j jVar = (vi.j) this.f34835b;
        byte[] bArr2 = (byte[]) this.d;
        File file = ((vi.i) this.f34836c).f56978b;
        if (jVar.G != 4) {
            return;
        }
        jVar.B = bArr2;
        try {
            jVar.p();
            if (jVar.f56984e) {
                k2.i0 a10 = new k2.n(jVar.f56981a).a();
                jVar.A = a10;
                a10.u0(jVar.F);
                jVar.A.v0(d2.n0.b(Uri.fromFile(file)));
                jVar.A.a();
            }
            jVar.s(5);
            mi.h0 h0Var = jVar.f56985f;
            long j10 = jVar.j();
            byte[] bArr3 = jVar.B;
            if (bArr3 == null) {
                bArr = null;
            } else {
                bArr = (byte[]) bArr3.clone();
            }
            h0Var.Q(j10, bArr);
        } catch (Throwable th2) {
            if (th2 instanceof Exception) {
                runtimeException = th2;
            } else {
                runtimeException = new RuntimeException(th2);
            }
            jVar.g(runtimeException);
        }
    }

    private final void c() {
        wi.t0 t0Var = (wi.t0) this.f34835b;
        wi.w wVar = (wi.w) this.f34836c;
        File file = (File) this.d;
        Handler handler = t0Var.f58060i;
        try {
            wVar.c(file);
            t0Var.g();
            long h = wVar.h();
            wi.n nVar = t0Var.f58064m;
            nVar.b("preview snapshot completed: durationMs=" + h + ", size=" + file.length() + ", elapsedMs=" + wi.t0.f(t0Var.M));
            handler.post(new wi.e0(t0Var, h, 1));
        } catch (Exception e10) {
            handler.post(new wi.d0(t0Var, e10, 3));
        }
    }

    private final void e() {
        File file = (File) this.d;
        wi.q0 q0Var = ((wi.t0) this.f34835b).f58057e;
        long j10 = ((wi.p0) this.f34836c).f57992a;
        gy0 gy0Var = (gy0) q0Var;
        synchronized (gy0Var) {
            if (gy0Var.d) {
                return;
            }
            gy0Var.f34232c.put(Long.valueOf(j10), new ey0(file));
        }
    }

    private final void f() {
        TLRPC.User a22;
        TLObject tLObject = (TLObject) this.f34835b;
        org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) this.f34836c;
        xg.u0 u0Var = (xg.u0) this.d;
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            hpVar.Y3(tL_channels_channelParticipants.users, false);
            hpVar.S3(tL_channels_channelParticipants.chats, false);
            long e10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).e();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < tL_channels_channelParticipants.participants.size(); i3++) {
                TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i3).peer;
                if (peer != null && org.telegram.messenger.zi.C1(peer) != e10 && (a22 = hpVar.a2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.l10.x(a22) && !a22.bot) {
                    arrayList.add(hpVar.m1(peer));
                }
            }
            u0Var.a(arrayList);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.run():void");
    }

    public iv0(org.telegram.messenger.u10 u10Var, HashMap hashMap, ArrayList arrayList, int i3) {
        this.f34834a = i3;
        this.f34835b = u10Var;
        this.d = hashMap;
        this.f34836c = arrayList;
    }
}
