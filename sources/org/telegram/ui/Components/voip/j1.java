package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.rh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f40;
import org.webrtc.VideoFrame;
public final class j1 implements wi.l, gs {
    public static j1 f41047w;
    public wi.n f41048a;
    public TLRPC.GroupCallParticipant f41050c;
    public boolean d;
    public t0 f41051e;
    public i1 f41052f;
    public h1 h;
    public final int f41054r;
    public long f41055s;
    public final g1 f41049b = new g1(this);
    public final ik f41053n = new ik(this, 23);

    public j1(int i7) {
        this.f41054r = i7;
        ls.f(i7).b(this, ls.f25371w2);
        ls.f(i7).b(this, ls.B2);
    }

    public static t3 g() {
        t3 t3Var;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            t3Var = sharedInstance.groupCall;
        } else {
            t3Var = null;
        }
        if (sharedInstance == null || t3Var == null || (groupCall = t3Var.f26914b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return t3Var;
    }

    public static boolean j() {
        wi.n nVar;
        j1 j1Var = f41047w;
        if (j1Var != null && (nVar = j1Var.f41048a) != null && nVar.e()) {
            return true;
        }
        return false;
    }

    public static void k(Activity activity) {
        wi.o g10;
        int i7;
        if (g() != null) {
            if (f41047w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    i7 = sharedInstance.getAccount();
                } else {
                    i7 = k10.f24932t0;
                }
                f41047w = new j1(i7);
            }
            j1 j1Var = f41047w;
            wi.n nVar = j1Var.f41048a;
            if (nVar == null || !nVar.d()) {
                j1Var.f41048a = l2.i.d().k(j1Var);
            }
            wi.n nVar2 = j1Var.f41048a;
            if (nVar2.f59999c != 0 || (g10 = nVar2.g(activity, null, true)) == null) {
                return;
            }
            t0 t0Var = new t0(g10);
            j1Var.f41051e = t0Var;
            j1Var.f41049b.f40972a = t0Var;
            j1Var.a();
            j1Var.f41055s = SystemClock.elapsedRealtime();
            ik ikVar = j1Var.f41053n;
            org.telegram.messenger.g0.r(ikVar);
            org.telegram.messenger.g0.h3(ikVar, 700L);
            f40 f40Var = f40.C5;
            if (f40Var != null) {
                f40Var.dismiss();
            }
            org.telegram.messenger.g0.g3(new me(19));
        }
    }

    public static void n(boolean z10) {
        int i7;
        f40 f40Var = f40.C5;
        if (f40Var != null && f40Var.getWindow() != null) {
            View decorView = f40Var.getWindow().getDecorView();
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
            j1 j1Var = f41047w;
            if (j1Var != null) {
                f41047w = null;
                int i10 = j1Var.f41054r;
                ls.f(i10).n(j1Var, ls.f25371w2);
                ls.f(i10).n(j1Var, ls.B2);
                wi.n nVar = j1Var.f41048a;
                if (nVar != null) {
                    j1Var.f41048a = null;
                    nVar.f();
                }
                j1Var.m();
                return;
            }
            return;
        }
        if (f41047w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                i7 = sharedInstance.getAccount();
            } else {
                i7 = k10.f24932t0;
            }
            f41047w = new j1(i7);
        }
        j1 j1Var2 = f41047w;
        wi.n nVar2 = j1Var2.f41048a;
        if (nVar2 == null || !nVar2.d()) {
            j1Var2.f41048a = l2.i.d().k(j1Var2);
        }
        f41047w.a();
        f41047w.f41048a.c();
    }

    @Override
    public final void B(View view) {
        n(true);
    }

    @Override
    public final void D(SurfaceTexture surfaceTexture) {
        t0 t0Var = this.f41051e;
        this.f41051e = null;
        this.f41049b.f40972a = null;
        a();
        if (t0Var != null) {
            t0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final View E() {
        return null;
    }

    @Override
    public final boolean G() {
        f40 f40Var = f40.C5;
        if (f40Var != null && f40.D5 && f40Var.v1()) {
            return true;
        }
        return false;
    }

    @Override
    public final int J() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j1.J():int");
    }

    @Override
    public final boolean N() {
        if (g() != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final e2.c1 Q() {
        return null;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void U() {
        this.f41048a = null;
        if (this.f41052f != null) {
            n(false);
        }
        m();
        org.telegram.messenger.g0.g3(new me(19));
        org.telegram.messenger.g0.g3(new me(18));
    }

    @Override
    public final boolean V(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override
    public final void X(View view) {
        i1 i1Var = (i1) view;
        this.f41052f = i1Var;
        if (!i1Var.f41018b) {
            i1Var.f41018b = true;
            org.telegram.messenger.g0.h3(i1Var.f41020e, 500L);
        }
        i1Var.a();
        this.f41049b.f40973b = this.f41052f.f41017a.d;
        a();
    }

    @Override
    public final void Z() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (sharedInstance != null && launchActivity != null && g() != null) {
            if (f40.C5 == null) {
                f40.f1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
            }
            if (this.f41048a != null) {
                t0 t0Var = this.f41051e;
                this.f41051e = null;
                this.f41049b.f40972a = null;
                this.f41048a.a(new rh(11, this, t0Var));
                org.telegram.messenger.g0.g3(new me(19));
                return;
            }
            return;
        }
        wi.n nVar = this.f41048a;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final void a() {
        boolean z10;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t3 g10 = g();
        boolean z11 = false;
        if (this.f41049b.f40972a == null && this.f41049b.f40973b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && g10 != null && !g10.f26917f.isEmpty()) {
            u3 u3Var = (u3) g10.f26917f.get(0);
            groupCallParticipant = u3Var.f27119a;
            z11 = u3Var.f27120b;
        } else {
            groupCallParticipant = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.f41050c;
        if (groupCallParticipant != groupCallParticipant2 || z11 != this.d) {
            if (groupCallParticipant2 != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null) {
                    sharedInstance2.removeExtraRemoteSink(this.f41050c, this.d, this.f41049b);
                }
                this.f41050c = null;
            }
            if (groupCallParticipant != null && sharedInstance != null && sharedInstance.addExtraRemoteSink(groupCallParticipant, z11, this.f41049b)) {
                this.f41050c = groupCallParticipant;
                this.d = z11;
                StringBuilder sb2 = new StringBuilder("bound ");
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                if (org.telegram.messenger.s2.f26694a) {
                    a8.b("rtmp pip: " + sb3);
                }
            }
        }
    }

    @Override
    public final int a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.j1.a0():int");
    }

    @Override
    public final float b0() {
        return 0.0f;
    }

    @Override
    public final void d(View view) {
        n(false);
        i1 i1Var = this.f41052f;
        if (view == i1Var) {
            i1Var.f41018b = false;
            org.telegram.messenger.g0.r(i1Var.f41020e);
            this.f41052f = null;
            this.f41049b.f40973b = null;
            a();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25371w2 || i7 == ls.B2) {
            a();
            i1 i1Var = this.f41052f;
            if (i1Var != null) {
                i1Var.a();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
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
    public final void i(wi.o oVar) {
        t0 t0Var = new t0(oVar);
        this.f41051e = t0Var;
        this.f41049b.f40972a = t0Var;
        a();
        this.f41055s = SystemClock.elapsedRealtime();
        ik ikVar = this.f41053n;
        org.telegram.messenger.g0.r(ikVar);
        org.telegram.messenger.g0.h3(ikVar, 700L);
    }

    @Override
    public final long l() {
        return 0L;
    }

    public final void m() {
        org.telegram.messenger.g0.r(this.f41053n);
        h1 h1Var = this.h;
        if (h1Var != null) {
            h1Var.f40998a.R();
            VideoFrame videoFrame = h1Var.f40999b;
            if (videoFrame != null) {
                videoFrame.release();
                h1Var.f40999b = null;
            }
            this.h = null;
        }
        this.f41049b.f40972a = null;
        this.f41049b.f40973b = null;
        t0 t0Var = this.f41051e;
        if (t0Var != null) {
            t0Var.a();
            this.f41051e = null;
        }
        if (this.f41050c != null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraRemoteSink(this.f41050c, this.d, this.f41049b);
            }
            this.f41050c = null;
        }
    }

    @Override
    public final boolean o0() {
        return false;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void u(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View v(LaunchActivity launchActivity) {
        return new i1(this, launchActivity);
    }

    @Override
    public final void w(View view) {
        if (view == this.f41052f) {
            n(false);
        }
        i1 i1Var = this.f41052f;
        if (view == i1Var) {
            i1Var.f41018b = false;
            org.telegram.messenger.g0.r(i1Var.f41020e);
            this.f41052f = null;
            this.f41049b.f40973b = null;
            a();
        }
        i1 i1Var2 = (i1) view;
        i1Var2.f41018b = false;
        org.telegram.messenger.g0.r(i1Var2.f41020e);
        i1Var2.f41017a.d.release();
    }

    @Override
    public final void L(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void p0(int i7) {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h0(int i7, ArrayList arrayList) {
    }

    @Override
    public final void j0(Canvas canvas, int i7, int i10) {
    }
}
