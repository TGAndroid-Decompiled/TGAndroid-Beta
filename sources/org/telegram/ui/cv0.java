package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class cv0 extends FrameLayout {
    public float f32800a;
    public boolean f32801b;
    public boolean f32802c;
    public boolean d;
    public int e;
    public int f32803f;
    public int h;
    public final o1.j f32804n;
    public final o1.k f32805r;
    public final PhotoViewer f32806s;

    public cv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f32806s = photoViewer;
        this.f32800a = 1.0f;
        this.f32802c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f32804n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15533u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new nd0(this, 3));
        this.f32805r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f32806s;
        photoViewer.f31311o3.setAlpha(f7);
        photoViewer.f31320p3.setAlpha(f7);
        if (this.f32801b) {
            org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f31311o3;
            h5Var.setPivotX(h5Var.getWidth());
            org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f31311o3;
            h5Var2.setPivotY(h5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f31311o3.setScaleX(f11);
            photoViewer.f31311o3.setScaleY(f11);
            org.telegram.ui.Components.v71 v71Var = photoViewer.f31328q3;
            if (v71Var.f29038y != f10) {
                v71Var.f29038y = f10;
                v71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f32802c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f31337r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f32800a != f7) {
            this.f32800a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f32801b != z10) {
            this.f32801b = z10;
            PhotoViewer photoViewer = this.f32806s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f31337r3.setAlpha(1.0f);
            } else {
                photoViewer.f31311o3.setScaleX(1.0f);
                photoViewer.f31311o3.setScaleY(1.0f);
                org.telegram.ui.Components.v71 v71Var = photoViewer.f31328q3;
                if (v71Var.f29038y != 0.0f) {
                    v71Var.f29038y = 0.0f;
                    v71Var.v.invalidate();
                }
            }
            a(this.f32800a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32804n.f15532a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f32806s;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var != null) {
            f7 = ((float) t71Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f31328q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f32806s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f31311o3.getLayoutParams();
        if (this.e > this.f32803f) {
            if (photoViewer.f31320p3.getVisibility() != 0) {
                photoViewer.f31320p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f31320p3.getVisibility() != 4) {
                photoViewer.f31320p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        long j3 = 0;
        if (t71Var != null) {
            long p5 = t71Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            au0 au0Var = photoViewer.f31231f0;
            if (au0Var != null && au0Var.f23012x) {
                j3 = au0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f31311o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f32805r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f32804n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f15532a != f7) {
                kVar.f15533u.f15539i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.v71 v71Var = photoViewer.f31328q3;
        int measuredHeight = getMeasuredHeight();
        v71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        v71Var.f29023i = measuredHeight;
        View view = v71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f15532a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32800a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f32806s;
        if (photoViewer.f31328q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f31337r3.invalidate();
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
