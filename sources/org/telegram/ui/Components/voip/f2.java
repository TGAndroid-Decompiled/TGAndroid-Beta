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
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bc1;
import org.telegram.ui.ic1;
public final class f2 implements ti.m {
    public static f2 h;
    public ti.o f39282a;
    public m f39283b;
    public long f39284c;
    public boolean d;
    public final et f39285e = new et(this, 22);
    public boolean f39286f;

    public static void d() {
        boolean z9;
        ?? r52;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z10 = true;
        if (ic1.l1 == null && e2.d() == null) {
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
            ti.o oVar = f2Var.f39282a;
            if (oVar == null || !oVar.d()) {
                f2Var.f39282a = l2.i.d().k(f2Var);
            }
            ti.o oVar2 = f2Var.f39282a;
            if (oVar2.f56137c == 2) {
                oVar2.c();
                return;
            }
            if (ic1.l1 == null) {
                e2Var = e2.d();
            }
            ti.o oVar3 = f2Var.f39282a;
            if (e2Var != null) {
                r52 = 1;
            } else {
                r52 = 0;
            }
            if (e2Var == null || !e2Var.f39263e) {
                z10 = false;
            }
            int i7 = oVar3.f56137c;
            if (i7 != 3) {
                oVar3.f56139f = r52;
                oVar3.f56140g = z10;
                if (i7 == 2) {
                    oVar3.d = r52;
                } else {
                    oVar3.f56137c = r52;
                }
                oVar3.f56136b.f();
            }
            f2Var.f39282a.c();
            return;
        }
        f2 f2Var2 = h;
        if (f2Var2 != null) {
            h = null;
            ti.o oVar4 = f2Var2.f39282a;
            if (oVar4 != null) {
                f2Var2.f39282a = null;
                oVar4.f();
            }
        }
    }

    @Override
    public final void B(View view) {
        m mVar;
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null && (mVar = this.f39283b) == view && !this.f39286f) {
            this.f39286f = true;
            mVar.getClass();
            mVar.f39456r = SystemClock.elapsedRealtime();
            mVar.b();
            ic1Var.f46595j1 = this.f39283b.f39450a;
            ic1Var.f46597k1 = true;
            ic1Var.y();
            try {
                ((WindowManager) ic1Var.f46574b.getSystemService("window")).removeView(ic1Var.f46608t0);
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
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null && ic1Var.f46578c0.isAttachedToWindow()) {
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
        this.f39282a = null;
        if (h == this) {
            h = null;
        }
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null) {
            ic1Var.F0 = true;
            ic1Var.f46578c0.d.release();
            ic1Var.f46580d0.d.release();
            ic1Var.f46575b0.release();
            ic1Var.c();
            ic1Var.f46608t0.d();
            ic1.l1 = null;
            d();
        }
        e2.b();
    }

    @Override
    public final boolean R(boolean z9, float f10, rm0 rm0Var) {
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
        g.f39303a = z9;
        m mVar = (m) view;
        this.f39283b = mVar;
        mVar.b();
        this.f39284c = g.c();
        this.d = m.a(VoIPService.getSharedInstance());
        et etVar = this.f39285e;
        org.telegram.messenger.g0.r(etVar);
        org.telegram.messenger.g0.i3(etVar, 500L);
        this.f39286f = false;
        if (ic1.l1 == null && e2.d() != null) {
            e2 d = e2.d();
            k2 k2Var = this.f39283b.f39450a;
            d.getClass();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setSinks(d.f39266r.d, k2Var.d);
            }
            try {
                d.f39262c.removeView(d.f39260a);
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
        m mVar = this.f39283b;
        if (mVar != null) {
            j2 j2Var = mVar.f39450a.d;
            if (j2Var.rotatedFrameWidth > 0) {
                return j2Var;
            }
        }
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null && (k2Var = ic1Var.f46578c0) != null) {
            return k2Var.d;
        }
        e2 d = e2.d();
        if (d != null) {
            return d.f39267s.d;
        }
        return null;
    }

    @Override
    public final void e(View view) {
        g.f39303a = false;
        org.telegram.messenger.g0.r(this.f39285e);
        this.f39283b = null;
        ic1 ic1Var = ic1.l1;
        if (ic1Var != null) {
            try {
                if (ic1Var.f46608t0.getParent() == null) {
                    bc1 bc1Var = ic1Var.f46608t0;
                    bc1Var.getClass();
                    ((WindowManager) ic1Var.f46574b.getSystemService("window")).addView(bc1Var, o2.a());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            ic1Var.f46597k1 = false;
            ic1Var.f46595j1 = null;
            ic1Var.y();
            ic1Var.f46608t0.invalidate();
        } else if (e2.d() != null) {
            e2 d = e2.d();
            x5 x5Var = d.f39260a;
            try {
                if (x5Var.getParent() == null) {
                    d.f39262c.addView(x5Var, d.d);
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.setSinks(d.f39266r.d, d.f39267s.d);
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
        org.telegram.messenger.g0.i3(new vs(15), 300L);
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
        org.telegram.messenger.g0.r(this.f39285e);
        if (this.f39283b == view) {
            this.f39283b = null;
        }
        m mVar = (m) view;
        mVar.f39454f.b();
        mVar.f39450a.d.release();
    }

    @Override
    public final void J(float f10) {
    }

    @Override
    public final void c(long j3) {
    }

    @Override
    public final void g(ti.p pVar) {
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
