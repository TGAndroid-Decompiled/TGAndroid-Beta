package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class cr0 extends FrameLayout {
    public float f44882a;
    public boolean f44883b;
    public boolean f44884c;
    public boolean d;
    public int f44885e;
    public int f44886f;
    public int h;
    public final r1.f f44887n;
    public final r1.g f44888r;
    public final PhotoViewer f44889s;

    public cr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f44889s = photoViewer;
        this.f44882a = 1.0f;
        this.f44884c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f44887n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f54268m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new ab0(this, 3));
        this.f44888r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f44889s;
        photoViewer.f41464n3.setAlpha(f10);
        photoViewer.f41473o3.setAlpha(f10);
        if (this.f44883b) {
            org.telegram.ui.ActionBar.k5 k5Var = photoViewer.f41464n3;
            k5Var.setPivotX(k5Var.getWidth());
            org.telegram.ui.ActionBar.k5 k5Var2 = photoViewer.f41464n3;
            k5Var2.setPivotY(k5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f41464n3.setScaleX(f12);
            photoViewer.f41464n3.setScaleY(f12);
            org.telegram.ui.Components.v51 v51Var = photoViewer.f41481p3;
            if (v51Var.f38917y != f11) {
                v51Var.f38917y = f11;
                v51Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f44884c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f41490q3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f44882a != f10) {
            this.f44882a = f10;
            a(f10);
        }
    }

    public final void c(boolean z9) {
        if (this.f44883b != z9) {
            this.f44883b = z9;
            PhotoViewer photoViewer = this.f44889s;
            if (z9) {
                setTranslationY(0.0f);
                photoViewer.f41490q3.setAlpha(1.0f);
            } else {
                photoViewer.f41464n3.setScaleX(1.0f);
                photoViewer.f41464n3.setScaleY(1.0f);
                org.telegram.ui.Components.v51 v51Var = photoViewer.f41481p3;
                if (v51Var.f38917y != 0.0f) {
                    v51Var.f38917y = 0.0f;
                    v51Var.v.invalidate();
                }
            }
            a(this.f44882a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44887n.f54250a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.f44889s;
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null) {
            f10 = ((float) t51Var.S()) / ((float) photoViewer.F2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.V2) {
            photoViewer.f41481p3.h(false, f10);
        }
        photoViewer.R7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f44889s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f41464n3.getLayoutParams();
        if (this.f44885e > this.f44886f) {
            if (photoViewer.f41473o3.getVisibility() != 0) {
                photoViewer.f41473o3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f41473o3.getVisibility() != 4) {
                photoViewer.f41473o3.setVisibility(4);
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
            cq0 cq0Var = photoViewer.f41394f0;
            if (cq0Var != null && cq0Var.f31802y) {
                j3 = cq0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f41464n3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        r1.g gVar = this.f44888r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.f44887n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f54250a != f10) {
                gVar.f54268m.f54276i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.v51 v51Var = photoViewer.f41481p3;
        int measuredHeight = getMeasuredHeight();
        v51Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        v51Var.f38902i = measuredHeight;
        View view = v51Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f54250a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44882a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f44889s;
        if (photoViewer.f41481p3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f41490q3.invalidate();
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
