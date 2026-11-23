package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class dr0 extends FrameLayout {
    public float f46996a;
    public boolean f46997b;
    public boolean f46998c;
    public boolean d;
    public int f46999e;
    public int f47000f;
    public int h;
    public final r1.f f47001n;
    public final r1.g f47002r;
    public final PhotoViewer f47003s;

    public dr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f47003s = photoViewer;
        this.f46996a = 1.0f;
        this.f46998c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f47001n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f56333m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        gVar.b(new bb0(this, 3));
        this.f47002r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f47003s;
        photoViewer.f43297o3.setAlpha(f10);
        photoViewer.f43305p3.setAlpha(f10);
        if (this.f46997b) {
            org.telegram.ui.ActionBar.m5 m5Var = photoViewer.f43297o3;
            m5Var.setPivotX(m5Var.getWidth());
            org.telegram.ui.ActionBar.m5 m5Var2 = photoViewer.f43297o3;
            m5Var2.setPivotY(m5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f43297o3.setScaleX(f12);
            photoViewer.f43297o3.setScaleY(f12);
            org.telegram.ui.Components.k61 k61Var = photoViewer.f43314q3;
            if (k61Var.f36806y != f11) {
                k61Var.f36806y = f11;
                k61Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f46998c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f43324r3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f46996a != f10) {
            this.f46996a = f10;
            a(f10);
        }
    }

    public final void c(boolean z10) {
        if (this.f46997b != z10) {
            this.f46997b = z10;
            PhotoViewer photoViewer = this.f47003s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f43324r3.setAlpha(1.0f);
            } else {
                photoViewer.f43297o3.setScaleX(1.0f);
                photoViewer.f43297o3.setScaleY(1.0f);
                org.telegram.ui.Components.k61 k61Var = photoViewer.f43314q3;
                if (k61Var.f36806y != 0.0f) {
                    k61Var.f36806y = 0.0f;
                    k61Var.v.invalidate();
                }
            }
            a(this.f46996a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47001n.f56315a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.f47003s;
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            f10 = ((float) i61Var.S()) / ((float) photoViewer.G2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f43314q3.h(false, f10);
        }
        photoViewer.S7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f47003s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f43297o3.getLayoutParams();
        if (this.f46999e > this.f47000f) {
            if (photoViewer.f43305p3.getVisibility() != 0) {
                photoViewer.f43305p3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f43305p3.getVisibility() != 4) {
                photoViewer.f43305p3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i7, i10);
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        long j3 = 0;
        if (i61Var != null) {
            long U = i61Var.U();
            if (U != -9223372036854775807L) {
                j3 = U;
            }
        } else {
            eq0 eq0Var = photoViewer.f43227g0;
            if (eq0Var != null && eq0Var.f37134y) {
                j3 = eq0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f43297o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        r1.g gVar = this.f47002r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.f47001n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f56315a != f10) {
                gVar.f56333m.f56341i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.k61 k61Var = photoViewer.f43314q3;
        int measuredHeight = getMeasuredHeight();
        k61Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        k61Var.f36791i = measuredHeight;
        View view = k61Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f56315a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f46996a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f47003s;
        if (photoViewer.f43314q3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f43324r3.invalidate();
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
