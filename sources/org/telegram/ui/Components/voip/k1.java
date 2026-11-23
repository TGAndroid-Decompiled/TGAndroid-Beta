package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e40;
import org.webrtc.VideoFrame;
public final class k1 implements wi.l, fs {
    public static k1 f40989w;
    public wi.n f40990a;
    public TLRPC.GroupCallParticipant f40992c;
    public boolean d;
    public u0 f40993e;
    public j1 f40994f;
    public i1 h;
    public final int f40996r;
    public long f40997s;
    public final h1 f40991b = new h1(this);
    public final rc f40995n = new rc(this, 26);

    public k1(int i7) {
        this.f40996r = i7;
        ks.f(i7).b(this, ks.f25312w2);
        ks.f(i7).b(this, ks.B2);
    }

    public static t3 d() {
        t3 t3Var;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            t3Var = sharedInstance.groupCall;
        } else {
            t3Var = null;
        }
        if (sharedInstance == null || t3Var == null || (groupCall = t3Var.f27034b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return t3Var;
    }

    public static boolean e() {
        wi.n nVar;
        k1 k1Var = f40989w;
        if (k1Var != null && (nVar = k1Var.f40990a) != null && nVar.e()) {
            return true;
        }
        return false;
    }

    public static void g(Activity activity) {
        wi.o g10;
        int i7;
        if (d() != null) {
            if (f40989w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    i7 = sharedInstance.getAccount();
                } else {
                    i7 = i10.f24637t0;
                }
                f40989w = new k1(i7);
            }
            k1 k1Var = f40989w;
            wi.n nVar = k1Var.f40990a;
            if (nVar == null || !nVar.d()) {
                k1Var.f40990a = l2.j.d().j(k1Var);
            }
            wi.n nVar2 = k1Var.f40990a;
            if (nVar2.f60117c != 0 || (g10 = nVar2.g(activity, null, true)) == null) {
                return;
            }
            u0 u0Var = new u0(g10);
            k1Var.f40993e = u0Var;
            k1Var.f40991b.f40913a = u0Var;
            k1Var.a();
            k1Var.f40997s = SystemClock.elapsedRealtime();
            rc rcVar = k1Var.f40995n;
            org.telegram.messenger.g0.r(rcVar);
            org.telegram.messenger.g0.h3(rcVar, 700L);
            e40 e40Var = e40.C5;
            if (e40Var != null) {
                e40Var.dismiss();
            }
            org.telegram.messenger.g0.g3(new ne(19));
        }
    }

    public static void i(boolean z10) {
        int i7;
        e40 e40Var = e40.C5;
        if (e40Var != null && e40Var.getWindow() != null) {
            View decorView = e40Var.getWindow().getDecorView();
            if (z10) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            decorView.setVisibility(i7);
        }
    }

    public static void k() {
        int i7;
        if (d() == null) {
            k1 k1Var = f40989w;
            if (k1Var != null) {
                f40989w = null;
                int i10 = k1Var.f40996r;
                ks.f(i10).n(k1Var, ks.f25312w2);
                ks.f(i10).n(k1Var, ks.B2);
                wi.n nVar = k1Var.f40990a;
                if (nVar != null) {
                    k1Var.f40990a = null;
                    nVar.f();
                }
                k1Var.h();
                return;
            }
            return;
        }
        if (f40989w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                i7 = sharedInstance.getAccount();
            } else {
                i7 = i10.f24637t0;
            }
            f40989w = new k1(i7);
        }
        k1 k1Var2 = f40989w;
        wi.n nVar2 = k1Var2.f40990a;
        if (nVar2 == null || !nVar2.d()) {
            k1Var2.f40990a = l2.j.d().j(k1Var2);
        }
        f40989w.a();
        f40989w.f40990a.c();
    }

    @Override
    public final boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override
    public final void B0(View view) {
        i(true);
    }

    @Override
    public final boolean C2() {
        return false;
    }

    @Override
    public final void D1(View view) {
        j1 j1Var = (j1) view;
        this.f40994f = j1Var;
        if (!j1Var.f40951b) {
            j1Var.f40951b = true;
            org.telegram.messenger.g0.h3(j1Var.f40953e, 500L);
        }
        j1Var.a();
        this.f40991b.f40914b = this.f40994f.f40950a.d;
        a();
    }

    @Override
    public final void E0(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.f40993e;
        this.f40993e = null;
        this.f40991b.f40913a = null;
        a();
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final void I(wi.o oVar) {
        u0 u0Var = new u0(oVar);
        this.f40993e = u0Var;
        this.f40991b.f40913a = u0Var;
        a();
        this.f40997s = SystemClock.elapsedRealtime();
        rc rcVar = this.f40995n;
        org.telegram.messenger.g0.r(rcVar);
        org.telegram.messenger.g0.h3(rcVar, 700L);
    }

    @Override
    public final View K0() {
        return null;
    }

    @Override
    public final boolean O0() {
        e40 e40Var = e40.C5;
        if (e40Var != null && e40.D5 && e40Var.v1()) {
            return true;
        }
        return false;
    }

    @Override
    public final void P1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance != null && launchActivity != null && d() != null) {
            if (e40.C5 == null) {
                e40.f1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
            }
            if (this.f40990a != null) {
                u0 u0Var = this.f40993e;
                this.f40993e = null;
                this.f40991b.f40913a = null;
                this.f40990a.a(new ph(12, this, u0Var));
                org.telegram.messenger.g0.g3(new ne(19));
                return;
            }
            return;
        }
        wi.n nVar = this.f40990a;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override
    public final int V1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k1.V1():int");
    }

    public final void a() {
        boolean z10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 d = d();
        boolean z11 = false;
        if (this.f40991b.f40913a == null && this.f40991b.f40914b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && d != null && !d.f27037f.isEmpty()) {
            u3 u3Var = (u3) d.f27037f.get(0);
            groupCallParticipant = u3Var.f27215a;
            z11 = u3Var.f27216b;
        } else {
            groupCallParticipant = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.f40992c;
        if (groupCallParticipant != groupCallParticipant2 || z11 != this.d) {
            if (groupCallParticipant2 != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null) {
                    sharedInstance2.removeExtraRemoteSink(this.f40992c, this.d, this.f40991b);
                }
                this.f40992c = null;
            }
            if (groupCallParticipant != null && sharedInstance != null && sharedInstance.addExtraRemoteSink(groupCallParticipant, z11, this.f40991b)) {
                this.f40992c = groupCallParticipant;
                this.d = z11;
                StringBuilder sb2 = new StringBuilder("bound ");
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                if (org.telegram.messenger.s2.f26829a) {
                    a8.b("rtmp pip: " + sb3);
                }
            }
        }
    }

    @Override
    public final int b1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k1.b1():int");
    }

    @Override
    public final float d2() {
        return 0.0f;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25312w2 || i7 == ks.B2) {
            a();
            j1 j1Var = this.f40994f;
            if (j1Var != null) {
                j1Var.a();
            }
        }
    }

    @Override
    public final boolean f0() {
        return true;
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    public final void h() {
        org.telegram.messenger.g0.r(this.f40995n);
        i1 i1Var = this.h;
        if (i1Var != null) {
            i1Var.f40931a.S();
            VideoFrame videoFrame = i1Var.f40932b;
            if (videoFrame != null) {
                videoFrame.release();
                i1Var.f40932b = null;
            }
            this.h = null;
        }
        this.f40991b.f40913a = null;
        this.f40991b.f40914b = null;
        u0 u0Var = this.f40993e;
        if (u0Var != null) {
            u0Var.a();
            this.f40993e = null;
        }
        if (this.f40992c != null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraRemoteSink(this.f40992c, this.d, this.f40991b);
            }
            this.f40992c = null;
        }
    }

    @Override
    public final boolean h1() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final void l(View view) {
        i(false);
        j1 j1Var = this.f40994f;
        if (view == j1Var) {
            j1Var.f40951b = false;
            org.telegram.messenger.g0.r(j1Var.f40953e);
            this.f40994f = null;
            this.f40991b.f40914b = null;
            a();
        }
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final long n() {
        return 0L;
    }

    @Override
    public final e2.c1 n1() {
        return null;
    }

    @Override
    public final boolean o1() {
        return false;
    }

    @Override
    public final void v1() {
        this.f40990a = null;
        if (this.f40994f != null) {
            i(false);
        }
        h();
        org.telegram.messenger.g0.g3(new ne(19));
        org.telegram.messenger.g0.g3(new ne(18));
    }

    @Override
    public final void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final int y() {
        return 10;
    }

    @Override
    public final View y0(LaunchActivity launchActivity) {
        return new j1(this, launchActivity);
    }

    @Override
    public final void z0(View view) {
        if (view == this.f40994f) {
            i(false);
        }
        j1 j1Var = this.f40994f;
        if (view == j1Var) {
            j1Var.f40951b = false;
            org.telegram.messenger.g0.r(j1Var.f40953e);
            this.f40994f = null;
            this.f40991b.f40914b = null;
            a();
        }
        j1 j1Var2 = (j1) view;
        j1Var2.f40951b = false;
        org.telegram.messenger.g0.r(j1Var2.f40953e);
        j1Var2.f40950a.d.release();
    }

    @Override
    public final void D2(int i7) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void d1(float f10) {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void n2(int i7, ArrayList arrayList) {
    }

    @Override
    public final void t2(Canvas canvas, int i7, int i10) {
    }
}
