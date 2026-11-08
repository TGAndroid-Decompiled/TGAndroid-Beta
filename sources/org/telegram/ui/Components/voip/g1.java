package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
import org.webrtc.VideoFrame;
public final class g1 implements ti.m, ls {
    public static g1 f39217w;
    public ti.o f39218a;
    public TLRPC.GroupCallParticipant f39220c;
    public boolean d;
    public q0 f39221e;
    public f1 f39222f;
    public e1 h;
    public final int f39224r;
    public long f39225s;
    public final d1 f39219b = new d1(this);
    public final et f39223n = new et(this, 20);

    public g1(int i7) {
        this.f39224r = i7;
        qs.f(i7).b(this, qs.f25099w2);
        qs.f(i7).b(this, qs.B2);
    }

    public static r3 d() {
        r3 r3Var;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            r3Var = sharedInstance.groupCall;
        } else {
            r3Var = null;
        }
        if (sharedInstance == null || r3Var == null || (groupCall = r3Var.f25222b) == null || !groupCall.rtmp_stream || sharedInstance.isHangingUp()) {
            return null;
        }
        return r3Var;
    }

    public static boolean i() {
        ti.o oVar;
        g1 g1Var = f39217w;
        if (g1Var != null && (oVar = g1Var.f39218a) != null && oVar.e()) {
            return true;
        }
        return false;
    }

    public static void k(Activity activity) {
        ti.p g10;
        int i7;
        if (d() != null) {
            if (f39217w == null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    i7 = sharedInstance.getAccount();
                } else {
                    i7 = p10.f24470s0;
                }
                f39217w = new g1(i7);
            }
            g1 g1Var = f39217w;
            ti.o oVar = g1Var.f39218a;
            if (oVar == null || !oVar.d()) {
                g1Var.f39218a = l2.i.d().k(g1Var);
            }
            ti.o oVar2 = g1Var.f39218a;
            if (oVar2.f56125c != 0 || (g10 = oVar2.g(activity, null, true)) == null) {
                return;
            }
            q0 q0Var = new q0(g10);
            g1Var.f39221e = q0Var;
            g1Var.f39219b.f39140a = q0Var;
            g1Var.a();
            g1Var.f39225s = SystemClock.elapsedRealtime();
            et etVar = g1Var.f39223n;
            org.telegram.messenger.g0.r(etVar);
            org.telegram.messenger.g0.i3(etVar, 700L);
            c40 c40Var = c40.f44542u5;
            if (c40Var != null) {
                c40Var.dismiss();
            }
            org.telegram.messenger.g0.h3(new vs(13));
        }
    }

    public static void n(boolean z9) {
        int i7;
        c40 c40Var = c40.f44542u5;
        if (c40Var != null && c40Var.getWindow() != null) {
            View decorView = c40Var.getWindow().getDecorView();
            if (z9) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            decorView.setVisibility(i7);
        }
    }

    public static void o() {
        int i7;
        if (d() == null) {
            g1 g1Var = f39217w;
            if (g1Var != null) {
                f39217w = null;
                int i10 = g1Var.f39224r;
                qs.f(i10).n(g1Var, qs.f25099w2);
                qs.f(i10).n(g1Var, qs.B2);
                ti.o oVar = g1Var.f39218a;
                if (oVar != null) {
                    g1Var.f39218a = null;
                    oVar.f();
                }
                g1Var.m();
                return;
            }
            return;
        }
        if (f39217w == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                i7 = sharedInstance.getAccount();
            } else {
                i7 = p10.f24470s0;
            }
            f39217w = new g1(i7);
        }
        g1 g1Var2 = f39217w;
        ti.o oVar2 = g1Var2.f39218a;
        if (oVar2 == null || !oVar2.d()) {
            g1Var2.f39218a = l2.i.d().k(g1Var2);
        }
        f39217w.a();
        f39217w.f39218a.c();
    }

    @Override
    public final void B(View view) {
        n(true);
    }

    @Override
    public final void C(SurfaceTexture surfaceTexture) {
        q0 q0Var = this.f39221e;
        this.f39221e = null;
        this.f39219b.f39140a = null;
        a();
        if (q0Var != null) {
            q0Var.a();
        }
        surfaceTexture.release();
    }

    @Override
    public final View D() {
        return null;
    }

    @Override
    public final boolean E() {
        c40 c40Var = c40.f44542u5;
        if (c40Var != null && c40.f44543v5 && c40Var.u1()) {
            return true;
        }
        return false;
    }

    @Override
    public final int I() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.g1.I():int");
    }

    @Override
    public final boolean K() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final e2.c1 M() {
        return null;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void Q() {
        this.f39218a = null;
        if (this.f39222f != null) {
            n(false);
        }
        m();
        org.telegram.messenger.g0.h3(new vs(13));
        org.telegram.messenger.g0.h3(new vs(12));
    }

    @Override
    public final boolean R(boolean z9, float f10, qm0 qm0Var) {
        return false;
    }

    @Override
    public final void S(View view) {
        f1 f1Var = (f1) view;
        this.f39222f = f1Var;
        if (!f1Var.f39189b) {
            f1Var.f39189b = true;
            org.telegram.messenger.g0.i3(f1Var.f39191e, 500L);
        }
        f1Var.a();
        this.f39219b.f39141b = this.f39222f.f39188a.d;
        a();
    }

    @Override
    public final void T() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (sharedInstance != null && launchActivity != null && d() != null) {
            if (c40.f44542u5 == null) {
                c40.e1(launchActivity, org.telegram.messenger.c.a(sharedInstance.getAccount()), null, null, false, null);
            }
            if (this.f39218a != null) {
                q0 q0Var = this.f39221e;
                this.f39221e = null;
                this.f39219b.f39140a = null;
                this.f39218a.a(new fx(7, this, q0Var));
                org.telegram.messenger.g0.h3(new vs(13));
                return;
            }
            return;
        }
        ti.o oVar = this.f39218a;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override
    public final int U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.g1.U():int");
    }

    @Override
    public final float V() {
        return 0.0f;
    }

    public final void a() {
        boolean z9;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        r3 d = d();
        boolean z10 = false;
        if (this.f39219b.f39140a == null && this.f39219b.f39141b == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9 && d != null && !d.f25225f.isEmpty()) {
            s3 s3Var = (s3) d.f25225f.get(0);
            groupCallParticipant = s3Var.f25409a;
            z10 = s3Var.f25410b;
        } else {
            groupCallParticipant = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = this.f39220c;
        if (groupCallParticipant != groupCallParticipant2 || z10 != this.d) {
            if (groupCallParticipant2 != null) {
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null) {
                    sharedInstance2.removeExtraRemoteSink(this.f39220c, this.d, this.f39219b);
                }
                this.f39220c = null;
            }
            if (groupCallParticipant != null && sharedInstance != null && sharedInstance.addExtraRemoteSink(groupCallParticipant, z10, this.f39219b)) {
                this.f39220c = groupCallParticipant;
                this.d = z10;
                StringBuilder sb2 = new StringBuilder("bound ");
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                if (org.telegram.messenger.r2.f25212a) {
                    a8.b("rtmp pip: " + sb3);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25099w2 || i7 == qs.B2) {
            a();
            f1 f1Var = this.f39222f;
            if (f1Var != null) {
                f1Var.a();
            }
        }
    }

    @Override
    public final void e(View view) {
        n(false);
        f1 f1Var = this.f39222f;
        if (view == f1Var) {
            f1Var.f39189b = false;
            org.telegram.messenger.g0.r(f1Var.f39191e);
            this.f39222f = null;
            this.f39219b.f39141b = null;
            a();
        }
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void g(ti.p pVar) {
        q0 q0Var = new q0(pVar);
        this.f39221e = q0Var;
        this.f39219b.f39140a = q0Var;
        a();
        this.f39225s = SystemClock.elapsedRealtime();
        et etVar = this.f39223n;
        org.telegram.messenger.g0.r(etVar);
        org.telegram.messenger.g0.i3(etVar, 700L);
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
    public final int j() {
        return 10;
    }

    @Override
    public final long l() {
        return 0L;
    }

    public final void m() {
        org.telegram.messenger.g0.r(this.f39223n);
        e1 e1Var = this.h;
        if (e1Var != null) {
            e1Var.f39169a.R();
            VideoFrame videoFrame = e1Var.f39170b;
            if (videoFrame != null) {
                videoFrame.release();
                e1Var.f39170b = null;
            }
            this.h = null;
        }
        this.f39219b.f39140a = null;
        this.f39219b.f39141b = null;
        q0 q0Var = this.f39221e;
        if (q0Var != null) {
            q0Var.a();
            this.f39221e = null;
        }
        if (this.f39220c != null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraRemoteSink(this.f39220c, this.d, this.f39219b);
            }
            this.f39220c = null;
        }
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void v(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View x(LaunchActivity launchActivity) {
        return new f1(this, launchActivity);
    }

    @Override
    public final void y(View view) {
        if (view == this.f39222f) {
            n(false);
        }
        f1 f1Var = this.f39222f;
        if (view == f1Var) {
            f1Var.f39189b = false;
            org.telegram.messenger.g0.r(f1Var.f39191e);
            this.f39222f = null;
            this.f39219b.f39141b = null;
            a();
        }
        f1 f1Var2 = (f1) view;
        f1Var2.f39189b = false;
        org.telegram.messenger.g0.r(f1Var2.f39191e);
        f1Var2.f39188a.d.release();
    }

    @Override
    public final void J(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void f0(int i7) {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void Z(int i7, ArrayList arrayList) {
    }

    @Override
    public final void c0(Canvas canvas, int i7, int i10) {
    }
}
