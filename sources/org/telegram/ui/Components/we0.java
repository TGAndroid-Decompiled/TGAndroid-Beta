package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class we0 implements yf.d {
    public final int f30235a;
    public final FrameLayout f30236b;

    public we0(int i10, FrameLayout frameLayout) {
        this.f30235a = i10;
        this.f30236b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f30235a;
        FrameLayout frameLayout = this.f30236b;
        switch (i10) {
            case 0:
                ye0 ye0Var = ((ze0) frameLayout).f31371a;
                if (ye0Var != null) {
                    PhotoViewer photoViewer = ((org.telegram.ui.es0) ye0Var).f33848a;
                    Drawable[] drawableArr = PhotoViewer.Q8;
                    return photoViewer.N0();
                }
                return false;
            case 1:
                ph.c0 c0Var = (ph.c0) frameLayout;
                c0Var.d.invalidate();
                return c0Var.f41348f.j();
            default:
                ph.f0 f0Var = (ph.f0) frameLayout;
                f0Var.e.invalidate();
                return f0Var.h.j();
        }
    }

    @Override
    public final void b() {
        switch (this.f30235a) {
            case 0:
                ((ze0) this.f30236b).f31372b.o();
                return;
            case 1:
                ((ph.c0) this.f30236b).f41348f.o();
                return;
            default:
                ((ph.f0) this.f30236b).h.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f30235a) {
            case 0:
                ((ze0) this.f30236b).f31372b.f47310a.g(1, true);
                return;
            case 1:
                ((ph.c0) this.f30236b).f41348f.f47310a.g(1, true);
                return;
            default:
                ((ph.f0) this.f30236b).h.f47310a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f30235a;
        FrameLayout frameLayout = this.f30236b;
        switch (i10) {
            case 0:
                ye0 ye0Var = ((ze0) frameLayout).f31371a;
                if (ye0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.es0) ye0Var).f33848a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.O0(-90.0f, false, null);
            case 1:
                ph.c0 c0Var = (ph.c0) frameLayout;
                ph.a0 a0Var = c0Var.f41348f;
                boolean m9 = a0Var.m(-90.0f);
                a0Var.i();
                c0Var.d.invalidate();
                return m9;
            default:
                ph.f0 f0Var = (ph.f0) frameLayout;
                ph.a0 a0Var2 = f0Var.h;
                boolean m10 = a0Var2.m(-90.0f);
                a0Var2.i();
                f0Var.e.invalidate();
                return m10;
        }
    }

    @Override
    public final void e() {
        switch (this.f30235a) {
            case 0:
                ((ze0) this.f30236b).f31372b.k();
                return;
            case 1:
                ((ph.c0) this.f30236b).f41348f.k();
                return;
            default:
                ((ph.f0) this.f30236b).h.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f30235a) {
            case 0:
                ze0 ze0Var = (ze0) this.f30236b;
                ze0Var.f31372b.setRotation(f10);
                ze0Var.getClass();
                ye0 ye0Var = ze0Var.f31371a;
                if (ye0Var != null) {
                    ((org.telegram.ui.es0) ye0Var).a(false);
                    return;
                }
                return;
            case 1:
                ((ph.c0) this.f30236b).f41348f.setRotation(f10);
                return;
            default:
                ((ph.f0) this.f30236b).h.setRotation(f10);
                return;
        }
    }
}
