package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class ve0 implements yf.d {
    public final int f29443a;
    public final FrameLayout f29444b;

    public ve0(int i10, FrameLayout frameLayout) {
        this.f29443a = i10;
        this.f29444b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f29443a;
        FrameLayout frameLayout = this.f29444b;
        switch (i10) {
            case 0:
                xe0 xe0Var = ((ye0) frameLayout).f31003a;
                if (xe0Var != null) {
                    PhotoViewer photoViewer = ((org.telegram.ui.xr0) xe0Var).f40298a;
                    Drawable[] drawableArr = PhotoViewer.Q8;
                    return photoViewer.N0();
                }
                return false;
            case 1:
                ph.c0 c0Var = (ph.c0) frameLayout;
                c0Var.d.invalidate();
                return c0Var.f41308f.j();
            default:
                ph.f0 f0Var = (ph.f0) frameLayout;
                f0Var.e.invalidate();
                return f0Var.h.j();
        }
    }

    @Override
    public final void b() {
        switch (this.f29443a) {
            case 0:
                ((ye0) this.f29444b).f31004b.o();
                return;
            case 1:
                ((ph.c0) this.f29444b).f41308f.o();
                return;
            default:
                ((ph.f0) this.f29444b).h.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f29443a) {
            case 0:
                ((ye0) this.f29444b).f31004b.f47246a.g(1, true);
                return;
            case 1:
                ((ph.c0) this.f29444b).f41308f.f47246a.g(1, true);
                return;
            default:
                ((ph.f0) this.f29444b).h.f47246a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f29443a;
        FrameLayout frameLayout = this.f29444b;
        switch (i10) {
            case 0:
                xe0 xe0Var = ((ye0) frameLayout).f31003a;
                if (xe0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.xr0) xe0Var).f40298a;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return photoViewer.O0(-90.0f, false, null);
            case 1:
                ph.c0 c0Var = (ph.c0) frameLayout;
                ph.a0 a0Var = c0Var.f41308f;
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
        switch (this.f29443a) {
            case 0:
                ((ye0) this.f29444b).f31004b.k();
                return;
            case 1:
                ((ph.c0) this.f29444b).f41308f.k();
                return;
            default:
                ((ph.f0) this.f29444b).h.k();
                return;
        }
    }

    @Override
    public final void f(float f10) {
        switch (this.f29443a) {
            case 0:
                ye0 ye0Var = (ye0) this.f29444b;
                ye0Var.f31004b.setRotation(f10);
                ye0Var.getClass();
                xe0 xe0Var = ye0Var.f31003a;
                if (xe0Var != null) {
                    ((org.telegram.ui.xr0) xe0Var).a(false);
                    return;
                }
                return;
            case 1:
                ((ph.c0) this.f29444b).f41308f.setRotation(f10);
                return;
            default:
                ((ph.f0) this.f29444b).h.setRotation(f10);
                return;
        }
    }
}
