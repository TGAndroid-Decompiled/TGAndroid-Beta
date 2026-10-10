package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class lv0 extends FrameLayout {
    public float f39730a;
    public boolean f39731b;
    public boolean f39732c;
    public boolean d;
    public int f39733e;
    public int f39734f;
    public int h;
    public final o1.j f39735n;
    public final o1.k f39736r;
    public final PhotoViewer f39737s;

    public lv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39737s = photoViewer;
        this.f39730a = 1.0f;
        this.f39732c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f39735n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16942u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        kVar.b(new sd0(this, 3));
        this.f39736r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f39737s;
        photoViewer.f34031o3.setAlpha(f7);
        photoViewer.f34040p3.setAlpha(f7);
        if (this.f39731b) {
            org.telegram.ui.ActionBar.j5 j5Var = photoViewer.f34031o3;
            j5Var.setPivotX(j5Var.getWidth());
            org.telegram.ui.ActionBar.j5 j5Var2 = photoViewer.f34031o3;
            j5Var2.setPivotY(j5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f34031o3.setScaleX(f11);
            photoViewer.f34031o3.setScaleY(f11);
            org.telegram.ui.Components.n81 n81Var = photoViewer.f34048q3;
            if (n81Var.f29067y != f10) {
                n81Var.f29067y = f10;
                n81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f39732c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f34057r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f39730a != f7) {
            this.f39730a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f39731b != z10) {
            this.f39731b = z10;
            PhotoViewer photoViewer = this.f39737s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f34057r3.setAlpha(1.0f);
            } else {
                photoViewer.f34031o3.setScaleX(1.0f);
                photoViewer.f34031o3.setScaleY(1.0f);
                org.telegram.ui.Components.n81 n81Var = photoViewer.f34048q3;
                if (n81Var.f29067y != 0.0f) {
                    n81Var.f29067y = 0.0f;
                    n81Var.v.invalidate();
                }
            }
            a(this.f39730a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39735n.f16941a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f39737s;
        org.telegram.ui.Components.l81 l81Var = photoViewer.F2;
        if (l81Var != null) {
            f7 = ((float) l81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f34048q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f39737s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f34031o3.getLayoutParams();
        if (this.f39733e > this.f39734f) {
            if (photoViewer.f34040p3.getVisibility() != 0) {
                photoViewer.f34040p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f34040p3.getVisibility() != 4) {
                photoViewer.f34040p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.l81 l81Var = photoViewer.F2;
        long j3 = 0;
        if (l81Var != null) {
            long p5 = l81Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            ju0 ju0Var = photoViewer.f33951f0;
            if (ju0Var != null && ju0Var.f31129x) {
                j3 = ju0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f34031o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f39736r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f39735n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f16941a != f7) {
                kVar.f16942u.f16949i = f7;
                kVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.n81 n81Var = photoViewer.f34048q3;
        int measuredHeight = getMeasuredHeight();
        n81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        n81Var.f29052i = measuredHeight;
        View view = n81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f16941a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39730a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f39737s;
        if (photoViewer.f34048q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f34057r3.invalidate();
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
