package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.webrtc.VideoFrame;
public final class k1 implements wi.l, is {
    public static k1 f40710w;
    public wi.n f40711a;
    public TLRPC.GroupCallParticipant f40713c;
    public boolean d;
    public u0 f40714e;
    public j1 f40715f;
    public i1 h;
    public final int f40717r;
    public long f40718s;
    public final h1 f40712b = new h1(this);
    public final zj f40716n = new zj(this, 23);

    public k1(int i7) {
        this.f40717r = i7;
        ns.f(i7).b(this, ns.f25595w2);
        ns.f(i7).b(this, ns.B2);
    }

    public static r3 g() {
        r3 r3Var;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            r3Var = sharedInstance.groupCall;
        } else {
            r3Var = null;
        }
        if (sharedInstance == null || r3Var == null || (groupCall = r3Var.f26208b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return r3Var;
    }

    public static boolean i() {
        wi.n nVar;
        k1 k1Var = f40710w;
        if (k1Var != null && (nVar = k1Var.f40711a) != null && nVar.e()) {
            return true;
        }
        return false;
    }

    public static void k(Activity activity) {
        wi.o g10;
        int i7;
        if (g() != null) {
            if (f40710w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    i7 = sharedInstance.getAccount();
                } else {
                    i7 = m10.f24934t0;
                }
                f40710w = new k1(i7);
            }
            k1 k1Var = f40710w;
            wi.n nVar = k1Var.f40711a;
            if (nVar == null || !nVar.d()) {
                k1Var.f40711a = l2.i.d().k(k1Var);
            }
            wi.n nVar2 = k1Var.f40711a;
            if (nVar2.f59424c != 0 || (g10 = nVar2.g(activity, null, true)) == null) {
                return;
            }
            u0 u0Var = new u0(g10);
            k1Var.f40714e = u0Var;
            k1Var.f40712b.f40634a = u0Var;
            k1Var.e();
            k1Var.f40718s = SystemClock.elapsedRealtime();
            zj zjVar = k1Var.f40716n;
            org.telegram.messenger.g0.r(zjVar);
            org.telegram.messenger.g0.i3(zjVar, 700L);
            c40 c40Var = c40.C5;
            if (c40Var != null) {
                c40Var.dismiss();
            }
            org.telegram.messenger.g0.h3(new ih(17));
        }
    }

    public static void n(boolean z10) {
        int i7;
        c40 c40Var = c40.C5;
        if (c40Var != null && c40Var.getWindow() != null) {
            View decorView = c40Var.getWindow().getDecorView();
            if (z10) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            decorView.setVisibility(i7);
        }
    }

    public static void o() {
        int i7;
        if (g() == null) {
            k1 k1Var = f40710w;
            if (k1Var != null) {
                f40710w = null;
                int i10 = k1Var.f40717r;
                ns.f(i10).n(k1Var, ns.f25595w2);
                ns.f(i10).n(k1Var, ns.B2);
                wi.n nVar = k1Var.f40711a;
                if (nVar != null) {
                    k1Var.f40711a = null;
                    nVar.f();
                }
                k1Var.m();
                return;
            }
            return;
        }
        if (f40710w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                i7 = sharedInstance.getAccount();
            } else {
                i7 = m10.f24934t0;
            }
            f40710w = new k1(i7);
        }
        k1 k1Var2 = f40710w;
        wi.n nVar2 = k1Var2.f40711a;
        if (nVar2 == null || !nVar2.d()) {
            k1Var2.f40711a = l2.i.d().k(k1Var2);
        }
        f40710w.e();
        f40710w.f40711a.c();
    }

    @Override
    public final void A(View view) {
        n(true);
    }

    @Override
    public final void C(SurfaceTexture surfaceTexture) {
        u0 u0Var = this.f40714e;
        this.f40714e = null;
        this.f40712b.f40634a = null;
        e();
        if (u0Var != null) {
            u0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final View D() {
        return null;
    }

    @Override
    public final boolean F() {
        c40 c40Var = c40.C5;
        if (c40Var != null && c40.D5 && c40Var.u1()) {
            return true;
        }
        return false;
    }

    @Override
    public final int L() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k1.L():int");
    }

    @Override
    public final boolean N() {
        if (g() != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final e2.c1 R() {
        return null;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void V() {
        this.f40711a = null;
        if (this.f40715f != null) {
            n(false);
        }
        m();
        org.telegram.messenger.g0.h3(new ih(17));
        org.telegram.messenger.g0.h3(new ih(16));
    }

    @Override
    public final boolean X(boolean z10, float f10, um0 um0Var) {
        return false;
    }

    @Override
    public final void Y(View view) {
        j1 j1Var = (j1) view;
        this.f40715f = j1Var;
        if (!j1Var.f40672b) {
            j1Var.f40672b = true;
            org.telegram.messenger.g0.i3(j1Var.f40674e, 500L);
        }
        j1Var.a();
        this.f40712b.f40635b = this.f40715f.f40671a.d;
        e();
    }

    @Override
    public final void Z() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance != null && launchActivity != null && g() != null) {
            if (c40.C5 == null) {
                c40.e1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
            }
            if (this.f40711a != null) {
                u0 u0Var = this.f40714e;
                this.f40714e = null;
                this.f40712b.f40634a = null;
                this.f40711a.a(new gh(12, this, u0Var));
                org.telegram.messenger.g0.h3(new ih(17));
                return;
            }
            return;
        }
        wi.n nVar = this.f40711a;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override
    public final void a(View view) {
        n(false);
        j1 j1Var = this.f40715f;
        if (view == j1Var) {
            j1Var.f40672b = false;
            org.telegram.messenger.g0.r(j1Var.f40674e);
            this.f40715f = null;
            this.f40712b.f40635b = null;
            e();
        }
    }

    @Override
    public final int b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.k1.b0():int");
    }

    @Override
    public final float c0() {
        return 0.0f;
    }

    @Override
    public final int d() {
        return 10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25595w2 || i7 == ns.B2) {
            e();
            j1 j1Var = this.f40715f;
            if (j1Var != null) {
                j1Var.a();
            }
        }
    }

    public final void e() {
        boolean z10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 g10 = g();
        boolean z11 = false;
        if (this.f40712b.f40634a == null && this.f40712b.f40635b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && g10 != null && !g10.f26211f.isEmpty()) {
            s3 s3Var = (s3) g10.f26211f.get(0);
            groupCallParticipant = s3Var.f26393a;
            z11 = s3Var.f26394b;
        } else {
            groupCallParticipant = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.f40713c;
        if (groupCallParticipant != groupCallParticipant2 || z11 != this.d) {
            if (groupCallParticipant2 != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null) {
                    sharedInstance2.removeExtraRemoteSink(this.f40713c, this.d, this.f40712b);
                }
                this.f40713c = null;
            }
            if (groupCallParticipant != null && sharedInstance != null && sharedInstance.addExtraRemoteSink(groupCallParticipant, z11, this.f40712b)) {
                this.f40713c = groupCallParticipant;
                this.d = z11;
                StringBuilder sb2 = new StringBuilder("bound ");
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                if (org.telegram.messenger.r2.f26198a) {
                    a8.b("rtmp pip: " + sb3);
                }
            }
        }
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void j(wi.o oVar) {
        u0 u0Var = new u0(oVar);
        this.f40714e = u0Var;
        this.f40712b.f40634a = u0Var;
        e();
        this.f40718s = SystemClock.elapsedRealtime();
        zj zjVar = this.f40716n;
        org.telegram.messenger.g0.r(zjVar);
        org.telegram.messenger.g0.i3(zjVar, 700L);
    }

    @Override
    public final long l() {
        return 0L;
    }

    public final void m() {
        org.telegram.messenger.g0.r(this.f40716n);
        i1 i1Var = this.h;
        if (i1Var != null) {
            i1Var.f40652a.R();
            VideoFrame videoFrame = i1Var.f40653b;
            if (videoFrame != null) {
                videoFrame.release();
                i1Var.f40653b = null;
            }
            this.h = null;
        }
        this.f40712b.f40634a = null;
        this.f40712b.f40635b = null;
        u0 u0Var = this.f40714e;
        if (u0Var != null) {
            u0Var.a();
            this.f40714e = null;
        }
        if (this.f40713c != null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraRemoteSink(this.f40713c, this.d, this.f40712b);
            }
            this.f40713c = null;
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View w(LaunchActivity launchActivity) {
        return new j1(this, launchActivity);
    }

    @Override
    public final void x(View view) {
        if (view == this.f40715f) {
            n(false);
        }
        j1 j1Var = this.f40715f;
        if (view == j1Var) {
            j1Var.f40672b = false;
            org.telegram.messenger.g0.r(j1Var.f40674e);
            this.f40715f = null;
            this.f40712b.f40635b = null;
            e();
        }
        j1 j1Var2 = (j1) view;
        j1Var2.f40672b = false;
        org.telegram.messenger.g0.r(j1Var2.f40674e);
        j1Var2.f40671a.d.release();
    }

    @Override
    public final void M(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void u0(int i7) {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void j0(int i7, ArrayList arrayList) {
    }

    @Override
    public final void o0(Canvas canvas, int i7, int i10) {
    }
}
