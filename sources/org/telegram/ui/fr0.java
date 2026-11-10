package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class fr0 extends FrameLayout {
    public float f45829a;
    public boolean f45830b;
    public boolean f45831c;
    public boolean d;
    public int f45832e;
    public int f45833f;
    public int h;
    public final r1.f f45834n;
    public final r1.g f45835r;
    public final PhotoViewer f45836s;

    public fr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f45836s = photoViewer;
        this.f45829a = 1.0f;
        this.f45831c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f45834n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f54279m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new db0(this, 3));
        this.f45835r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f45836s;
        photoViewer.f41462n3.setAlpha(f10);
        photoViewer.f41471o3.setAlpha(f10);
        if (this.f45830b) {
            org.telegram.ui.ActionBar.m5 m5Var = photoViewer.f41462n3;
            m5Var.setPivotX(m5Var.getWidth());
            org.telegram.ui.ActionBar.m5 m5Var2 = photoViewer.f41462n3;
            m5Var2.setPivotY(m5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f41462n3.setScaleX(f12);
            photoViewer.f41462n3.setScaleY(f12);
            org.telegram.ui.Components.v51 v51Var = photoViewer.f41479p3;
            if (v51Var.f38885y != f11) {
                v51Var.f38885y = f11;
                v51Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f45831c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f41488q3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f45829a != f10) {
            this.f45829a = f10;
            a(f10);
        }
    }

    public final void c(boolean z9) {
        if (this.f45830b != z9) {
            this.f45830b = z9;
            PhotoViewer photoViewer = this.f45836s;
            if (z9) {
                setTranslationY(0.0f);
                photoViewer.f41488q3.setAlpha(1.0f);
            } else {
                photoViewer.f41462n3.setScaleX(1.0f);
                photoViewer.f41462n3.setScaleY(1.0f);
                org.telegram.ui.Components.v51 v51Var = photoViewer.f41479p3;
                if (v51Var.f38885y != 0.0f) {
                    v51Var.f38885y = 0.0f;
                    v51Var.v.invalidate();
                }
            }
            a(this.f45829a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45834n.f54261a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.f45836s;
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null) {
            f10 = ((float) t51Var.S()) / ((float) photoViewer.F2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.V2) {
            photoViewer.f41479p3.h(false, f10);
        }
        photoViewer.R7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f45836s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f41462n3.getLayoutParams();
        if (this.f45832e > this.f45833f) {
            if (photoViewer.f41471o3.getVisibility() != 0) {
                photoViewer.f41471o3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f41471o3.getVisibility() != 4) {
                photoViewer.f41471o3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i7, i10);
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        long j3 = 0;
        if (t51Var != null) {
            long U = t51Var.U();
            if (U != -9223372036854775807L) {
                j3 = U;
            }
        } else {
            fq0 fq0Var = photoViewer.f41392f0;
            if (fq0Var != null && fq0Var.f31851y) {
                j3 = fq0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f41462n3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        r1.g gVar = this.f45835r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.f45834n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f54261a != f10) {
                gVar.f54279m.f54287i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.v51 v51Var = photoViewer.f41479p3;
        int measuredHeight = getMeasuredHeight();
        v51Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        v51Var.f38870i = measuredHeight;
        View view = v51Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f54261a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45829a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f45836s;
        if (photoViewer.f41479p3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f41488q3.invalidate();
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
