package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class xe0 implements zf.d {
    public final int f33050a;
    public final FrameLayout f33051b;

    public xe0(int i10, FrameLayout frameLayout) {
        this.f33050a = i10;
        this.f33051b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f33050a;
        FrameLayout frameLayout = this.f33051b;
        switch (i10) {
            case 0:
                ze0 ze0Var = ((af0) frameLayout).f25239a;
                if (ze0Var != null) {
                    PhotoViewer photoViewer = ((org.telegram.ui.es0) ze0Var).f36577a;
                    Drawable[] drawableArr = PhotoViewer.Q8;
                    return photoViewer.N0();
                }
                return false;
            case 1:
                qh.c0 c0Var = (qh.c0) frameLayout;
                c0Var.d.invalidate();
                return c0Var.f45132f.j();
            default:
                qh.f0 f0Var = (qh.f0) frameLayout;
                f0Var.f45323e.invalidate();
                return f0Var.h.j();
        }
    }

    @Override
    public final void b() {
        switch (this.f33050a) {
            case 0:
                ((af0) this.f33051b).f25240b.o();
                return;
            case 1:
                ((qh.c0) this.f33051b).f45132f.o();
                return;
            default:
                ((qh.f0) this.f33051b).h.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f33050a) {
            case 0:
                ((af0) this.f33051b).f25240b.f51201a.g(1, true);
                return;
            case 1:
                ((qh.c0) this.f33051b).f45132f.f51201a.g(1, true);
                return;
            default:
                ((qh.f0) this.f33051b).h.f51201a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f33050a;
        FrameLayout frameLayout = this.f33051b;
        switch (i10) {
            case 0:
                ze0 ze0Var = ((af0) frameLayout).f25239a;
                if (ze0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.es0) ze0Var).f36577a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.O0(-90.0f, false, null);
            case 1:
                qh.c0 c0Var = (qh.c0) frameLayout;
                qh.a0 a0Var = c0Var.f45132f;
                boolean m9 = a0Var.m(-90.0f);
                a0Var.i();
                c0Var.d.invalidate();
                return m9;
            default:
                qh.f0 f0Var = (qh.f0) frameLayout;
                qh.a0 a0Var2 = f0Var.h;
                boolean m10 = a0Var2.m(-90.0f);
                a0Var2.i();
                f0Var.f45323e.invalidate();
                return m10;
        }
    }

    @Override
    public final void e() {
        switch (this.f33050a) {
            case 0:
                ((af0) this.f33051b).f25240b.k();
                return;
            case 1:
                ((qh.c0) this.f33051b).f45132f.k();
                return;
            default:
                ((qh.f0) this.f33051b).h.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f33050a) {
            case 0:
                af0 af0Var = (af0) this.f33051b;
                af0Var.f25240b.setRotation(f10);
                af0Var.getClass();
                ze0 ze0Var = af0Var.f25239a;
                if (ze0Var != null) {
                    ((org.telegram.ui.es0) ze0Var).a(false);
                    return;
                }
                return;
            case 1:
                ((qh.c0) this.f33051b).f45132f.setRotation(f10);
                return;
            default:
                ((qh.f0) this.f33051b).h.setRotation(f10);
                return;
        }
    }
}
