package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class ls0 extends FrameLayout {
    public float f39366a;
    public boolean f39367b;
    public boolean f39368c;
    public boolean d;
    public int e;
    public int f39369f;
    public int h;
    public final o1.i f39370n;
    public final o1.j f39371r;
    public final PhotoViewer f39372s;

    public ls0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39372s = photoViewer;
        this.f39366a = 1.0f;
        this.f39368c = true;
        o1.i iVar = new o1.i(0.0f);
        this.f39370n = iVar;
        o1.j jVar = new o1.j(iVar);
        jVar.f13958m = org.telegram.ui.Cells.f1.p(0.0f, 750.0f, 1.0f);
        jVar.b(new ic0(this, 3));
        this.f39371r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f39372s;
        photoViewer.f33567o3.setAlpha(f7);
        photoViewer.f33576p3.setAlpha(f7);
        if (this.f39367b) {
            org.telegram.ui.ActionBar.u5 u5Var = photoViewer.f33567o3;
            u5Var.setPivotX(u5Var.getWidth());
            org.telegram.ui.ActionBar.u5 u5Var2 = photoViewer.f33567o3;
            u5Var2.setPivotY(u5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f33567o3.setScaleX(f11);
            photoViewer.f33567o3.setScaleY(f11);
            org.telegram.ui.Components.x61 x61Var = photoViewer.f33584q3;
            if (x61Var.f32472y != f10) {
                x61Var.f32472y = f10;
                x61Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f39368c) {
            setTranslationY((1.0f - f7) * org.telegram.messenger.i0.N(24.0f));
        }
        photoViewer.f33593r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f39366a != f7) {
            this.f39366a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f39367b != z10) {
            this.f39367b = z10;
            PhotoViewer photoViewer = this.f39372s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f33593r3.setAlpha(1.0f);
            } else {
                photoViewer.f33567o3.setScaleX(1.0f);
                photoViewer.f33567o3.setScaleY(1.0f);
                org.telegram.ui.Components.x61 x61Var = photoViewer.f33584q3;
                if (x61Var.f32472y != 0.0f) {
                    x61Var.f32472y = 0.0f;
                    x61Var.v.invalidate();
                }
            }
            a(this.f39366a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39370n.f13941a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f39372s;
        org.telegram.ui.Components.v61 v61Var = photoViewer.F2;
        if (v61Var != null) {
            f7 = ((float) v61Var.S()) / ((float) photoViewer.F2.U());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f33584q3.h(false, f7);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f39372s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f33567o3.getLayoutParams();
        if (this.e > this.f39369f) {
            if (photoViewer.f33576p3.getVisibility() != 0) {
                photoViewer.f33576p3.setVisibility(0);
            }
            i12 = org.telegram.messenger.i0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.i0.L(47.0f);
        } else {
            if (photoViewer.f33576p3.getVisibility() != 4) {
                photoViewer.f33576p3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.i0.L(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.v61 v61Var = photoViewer.F2;
        long j10 = 0;
        if (v61Var != null) {
            long U = v61Var.U();
            if (U != -9223372036854775807L) {
                j10 = U;
            }
        } else {
            lr0 lr0Var = photoViewer.f33486f0;
            if (lr0Var != null && lr0Var.f31278y) {
                j10 = lr0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f33567o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.j jVar = this.f39371r;
        jVar.d();
        int i13 = this.h;
        o1.i iVar = this.f39370n;
        if (i13 != 0) {
            float f7 = ceil;
            if (iVar.f13941a != f7) {
                jVar.f13958m.f13965i = f7;
                jVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.x61 x61Var = photoViewer.f33584q3;
        int measuredHeight = getMeasuredHeight();
        x61Var.h = ((getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - ceil) - i12;
        x61Var.f32457i = measuredHeight;
        View view = x61Var.v;
        if (view != null) {
            view.invalidate();
        }
        iVar.f13941a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39366a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f39372s;
        if (photoViewer.f33584q3.e(motionEvent.getX() - org.telegram.messenger.i0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f33593r3.invalidate();
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
