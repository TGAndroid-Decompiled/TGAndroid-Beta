package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import bi.x5;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ec1;
import org.telegram.ui.xb1;
public final class f2 implements ti.m {
    public static f2 h;
    public ti.o f39137a;
    public m f39138b;
    public long f39139c;
    public boolean d;
    public final dt f39140e = new dt(this, 22);
    public boolean f39141f;

    public static void d() {
        boolean z9;
        ?? r52;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = true;
        if (ec1.l1 == null && e2.d() == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        e2 e2Var = null;
        if (sharedInstance != null && z9) {
            if (h == null) {
                h = new f2();
            }
            f2 f2Var = h;
            ti.o oVar = f2Var.f39137a;
            if (oVar == null || !oVar.d()) {
                f2Var.f39137a = l2.i.d().k(f2Var);
            }
            ti.o oVar2 = f2Var.f39137a;
            if (oVar2.f56033c == 2) {
                oVar2.c();
                return;
            }
            if (ec1.l1 == null) {
                e2Var = e2.d();
            }
            ti.o oVar3 = f2Var.f39137a;
            if (e2Var != null) {
                r52 = 1;
            } else {
                r52 = 0;
            }
            if (e2Var == null || !e2Var.f39118e) {
                z10 = false;
            }
            int i7 = oVar3.f56033c;
            if (i7 != 3) {
                oVar3.f56035f = r52;
                oVar3.f56036g = z10;
                if (i7 == 2) {
                    oVar3.d = r52;
                } else {
                    oVar3.f56033c = r52;
                }
                oVar3.f56032b.f();
            }
            f2Var.f39137a.c();
            return;
        }
        f2 f2Var2 = h;
        if (f2Var2 != null) {
            h = null;
            ti.o oVar4 = f2Var2.f39137a;
            if (oVar4 != null) {
                f2Var2.f39137a = null;
                oVar4.f();
            }
        }
    }

    @Override
    public final void B(View view) {
        m mVar;
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null && (mVar = this.f39138b) == view && !this.f39141f) {
            this.f39141f = true;
            mVar.getClass();
            mVar.f39311r = SystemClock.elapsedRealtime();
            mVar.b();
            ec1Var.f45296j1 = this.f39138b.f39305a;
            ec1Var.f45298k1 = true;
            ec1Var.y();
            try {
                ((WindowManager) ec1Var.f45275b.getSystemService("window")).removeView(ec1Var.f45309t0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void C(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
    }

    @Override
    public final View D() {
        return null;
    }

    @Override
    public final boolean E() {
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null && ec1Var.f45279c0.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    @Override
    public final int I() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        j2 a10 = a();
        if (a10 != null && (i7 = a10.rotatedFrameWidth) > 0) {
            return i7;
        }
        return 9;
    }

    @Override
    public final boolean K() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && !sharedInstance.isHangingUp() && sharedInstance.getCallState() != 11 && sharedInstance.getCallState() != 10) {
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
        this.f39137a = null;
        if (h == this) {
            h = null;
        }
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null) {
            ec1Var.F0 = true;
            ec1Var.f45279c0.d.release();
            ec1Var.f45281d0.d.release();
            ec1Var.f45276b0.release();
            ec1Var.c();
            ec1Var.f45309t0.d();
            ec1.l1 = null;
            d();
        }
        e2.b();
    }

    @Override
    public final boolean R(boolean z9, float f10, qm0 qm0Var) {
        return false;
    }

    @Override
    public final void S(View view) {
        boolean z9;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getVideoState(false) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        g.f39158a = z9;
        m mVar = (m) view;
        this.f39138b = mVar;
        mVar.b();
        this.f39139c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        dt dtVar = this.f39140e;
        org.telegram.messenger.g0.r(dtVar);
        org.telegram.messenger.g0.i3(dtVar, 500L);
        this.f39141f = false;
        if (ec1.l1 == null && e2.d() != null) {
            e2 d = e2.d();
            k2 k2Var = this.f39138b.f39305a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.f39121r.d, k2Var.d);
            }
            try {
                d.f39117c.removeView(d.f39115a);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final int U() {
        int i7;
        if (!m.a(VoIPService.getSharedInstance())) {
            return 1;
        }
        j2 a10 = a();
        if (a10 != null && (i7 = a10.rotatedFrameHeight) > 0) {
            return i7;
        }
        return 16;
    }

    @Override
    public final float V() {
        return 0.0f;
    }

    @Override
    public final void Z(int i7, ArrayList arrayList) {
        g.a(i7, arrayList, false);
    }

    public final j2 a() {
        k2 k2Var;
        m mVar = this.f39138b;
        if (mVar != null) {
            j2 j2Var = mVar.f39305a.d;
            if (j2Var.rotatedFrameWidth > 0) {
                return j2Var;
            }
        }
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null && (k2Var = ec1Var.f45279c0) != null) {
            return k2Var.d;
        }
        e2 d = e2.d();
        if (d != null) {
            return d.f39122s.d;
        }
        return null;
    }

    @Override
    public final void e(View view) {
        g.f39158a = false;
        org.telegram.messenger.g0.r(this.f39140e);
        this.f39138b = null;
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null) {
            try {
                if (ec1Var.f45309t0.getParent() == null) {
                    xb1 xb1Var = ec1Var.f45309t0;
                    xb1Var.getClass();
                    ((WindowManager) ec1Var.f45275b.getSystemService("window")).addView(xb1Var, o2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            ec1Var.f45298k1 = false;
            ec1Var.f45296j1 = null;
            ec1Var.y();
            ec1Var.f45309t0.invalidate();
        } else if (e2.d() != null) {
            e2 d = e2.d();
            x5 x5Var = d.f39115a;
            try {
                if (x5Var.getParent() == null) {
                    d.f39117c.addView(x5Var, d.d);
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.f39121r.d, d.f39122s.d);
            }
        }
    }

    @Override
    public final boolean e0() {
        return true;
    }

    @Override
    public final void f0(int i7) {
        g.b(i7, false);
        org.telegram.messenger.g0.i3(new l10(13), 300L);
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
        return new m(launchActivity);
    }

    @Override
    public final void y(View view) {
        org.telegram.messenger.g0.r(this.f39140e);
        if (this.f39138b == view) {
            this.f39138b = null;
        }
        m mVar = (m) view;
        mVar.f39309f.b();
        mVar.f39305a.d.release();
    }

    @Override
    public final void J(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void g(ti.q qVar) {
    }

    @Override
    public final void F() {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void c0(Canvas canvas, int i7, int i10) {
    }
}
