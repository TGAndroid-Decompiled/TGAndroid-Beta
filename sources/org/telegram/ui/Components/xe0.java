package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class xe0 implements zf.d {
    public final int f33056a;
    public final FrameLayout f33057b;

    public xe0(int i10, FrameLayout frameLayout) {
        this.f33056a = i10;
        this.f33057b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f33056a;
        FrameLayout frameLayout = this.f33057b;
        switch (i10) {
            case 0:
                ze0 ze0Var = ((af0) frameLayout).f25247a;
                if (ze0Var != null) {
                    PhotoViewer photoViewer = ((org.telegram.ui.zr0) ze0Var).f43983a;
                    Drawable[] drawableArr = PhotoViewer.Q8;
                    return photoViewer.N0();
                }
                return false;
            case 1:
                qh.c0 c0Var = (qh.c0) frameLayout;
                c0Var.d.invalidate();
                return c0Var.f45037f.j();
            default:
                qh.f0 f0Var = (qh.f0) frameLayout;
                f0Var.f45275e.invalidate();
                return f0Var.h.j();
        }
    }

    @Override
    public final void b() {
        switch (this.f33056a) {
            case 0:
                ((af0) this.f33057b).f25248b.o();
                return;
            case 1:
                ((qh.c0) this.f33057b).f45037f.o();
                return;
            default:
                ((qh.f0) this.f33057b).h.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f33056a) {
            case 0:
                ((af0) this.f33057b).f25248b.f51166a.g(1, true);
                return;
            case 1:
                ((qh.c0) this.f33057b).f45037f.f51166a.g(1, true);
                return;
            default:
                ((qh.f0) this.f33057b).h.f51166a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f33056a;
        FrameLayout frameLayout = this.f33057b;
        switch (i10) {
            case 0:
                ze0 ze0Var = ((af0) frameLayout).f25247a;
                if (ze0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.zr0) ze0Var).f43983a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.O0(-90.0f, false, null);
            case 1:
                qh.c0 c0Var = (qh.c0) frameLayout;
                qh.a0 a0Var = c0Var.f45037f;
                boolean m9 = a0Var.m(-90.0f);
                a0Var.i();
                c0Var.d.invalidate();
                return m9;
            default:
                qh.f0 f0Var = (qh.f0) frameLayout;
                qh.a0 a0Var2 = f0Var.h;
                boolean m10 = a0Var2.m(-90.0f);
                a0Var2.i();
                f0Var.f45275e.invalidate();
                return m10;
        }
    }

    @Override
    public final void e() {
        switch (this.f33056a) {
            case 0:
                ((af0) this.f33057b).f25248b.k();
                return;
            case 1:
                ((qh.c0) this.f33057b).f45037f.k();
                return;
            default:
                ((qh.f0) this.f33057b).h.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f33056a) {
            case 0:
                af0 af0Var = (af0) this.f33057b;
                af0Var.f25248b.setRotation(f10);
                af0Var.getClass();
                ze0 ze0Var = af0Var.f25247a;
                if (ze0Var != null) {
                    ((org.telegram.ui.zr0) ze0Var).a(false);
                    return;
                }
                return;
            case 1:
                ((qh.c0) this.f33057b).f45037f.setRotation(f10);
                return;
            default:
                ((qh.f0) this.f33057b).h.setRotation(f10);
                return;
        }
    }
}
