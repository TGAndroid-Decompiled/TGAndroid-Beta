package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.PhotoViewer;
public final class yd0 implements eg.e {
    public final int f32814a;
    public final FrameLayout f32815b;

    public yd0(int i10, FrameLayout frameLayout) {
        this.f32814a = i10;
        this.f32815b = frameLayout;
    }

    @Override
    public final boolean a() {
        int i10 = this.f32814a;
        FrameLayout frameLayout = this.f32815b;
        switch (i10) {
            case 0:
                ae0 ae0Var = ((be0) frameLayout).f24714a;
                if (ae0Var != null) {
                    PhotoViewer photoViewer = ((org.telegram.ui.zp0) ae0Var).f44037a;
                    Drawable[] drawableArr = PhotoViewer.U8;
                    return photoViewer.O0();
                }
                return false;
            case 1:
                vh.b0 b0Var = (vh.b0) frameLayout;
                b0Var.d.invalidate();
                return b0Var.f50940f.j();
            default:
                vh.g0 g0Var = (vh.g0) frameLayout;
                g0Var.e.invalidate();
                return g0Var.h.j();
        }
    }

    @Override
    public final void b() {
        switch (this.f32814a) {
            case 0:
                ((be0) this.f32815b).f24715b.o();
                return;
            case 1:
                ((vh.b0) this.f32815b).f50940f.o();
                return;
            default:
                ((vh.g0) this.f32815b).h.o();
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f32814a) {
            case 0:
                ((be0) this.f32815b).f24715b.f6583a.g(1, true);
                return;
            case 1:
                ((vh.b0) this.f32815b).f50940f.f6583a.g(1, true);
                return;
            default:
                ((vh.g0) this.f32815b).h.f6583a.g(1, true);
                return;
        }
    }

    @Override
    public final boolean d() {
        int i10 = this.f32814a;
        FrameLayout frameLayout = this.f32815b;
        switch (i10) {
            case 0:
                ae0 ae0Var = ((be0) frameLayout).f24714a;
                if (ae0Var == null) {
                    return false;
                }
                PhotoViewer photoViewer = ((org.telegram.ui.zp0) ae0Var).f44037a;
                Drawable[] drawableArr = PhotoViewer.U8;
                return photoViewer.P0(-90.0f, false, null);
            case 1:
                vh.b0 b0Var = (vh.b0) frameLayout;
                vh.z zVar = b0Var.f50940f;
                boolean m10 = zVar.m(-90.0f);
                zVar.i();
                b0Var.d.invalidate();
                return m10;
            default:
                vh.g0 g0Var = (vh.g0) frameLayout;
                vh.z zVar2 = g0Var.h;
                boolean m11 = zVar2.m(-90.0f);
                zVar2.i();
                g0Var.e.invalidate();
                return m11;
        }
    }

    @Override
    public final void e() {
        switch (this.f32814a) {
            case 0:
                ((be0) this.f32815b).f24715b.k();
                return;
            case 1:
                ((vh.b0) this.f32815b).f50940f.k();
                return;
            default:
                ((vh.g0) this.f32815b).h.k();
                return;
        }
    }

    @Override
    public final void f(float f7) {
        switch (this.f32814a) {
            case 0:
                be0 be0Var = (be0) this.f32815b;
                be0Var.f24715b.setRotation(f7);
                be0Var.getClass();
                ae0 ae0Var = be0Var.f24714a;
                if (ae0Var != null) {
                    ((org.telegram.ui.zp0) ae0Var).b(false);
                    return;
                }
                return;
            case 1:
                ((vh.b0) this.f32815b).f50940f.setRotation(f7);
                return;
            default:
                ((vh.g0) this.f32815b).h.setRotation(f7);
                return;
        }
    }
}
