package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class nv0 extends FrameLayout {
    public float f40484a;
    public boolean f40485b;
    public boolean f40486c;
    public boolean d;
    public int f40487e;
    public int f40488f;
    public int h;
    public final o1.j f40489n;
    public final o1.k f40490r;
    public final PhotoViewer f40491s;

    public nv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40491s = photoViewer;
        this.f40484a = 1.0f;
        this.f40486c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f40489n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16690u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 3));
        this.f40490r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f40491s;
        photoViewer.f33830o3.setAlpha(f7);
        photoViewer.f33839p3.setAlpha(f7);
        if (this.f40485b) {
            org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f33830o3;
            h5Var.setPivotX(h5Var.getWidth());
            org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f33830o3;
            h5Var2.setPivotY(h5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f33830o3.setScaleX(f11);
            photoViewer.f33830o3.setScaleY(f11);
            org.telegram.ui.Components.s81 s81Var = photoViewer.f33847q3;
            if (s81Var.f30500y != f10) {
                s81Var.f30500y = f10;
                s81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f40486c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f33856r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f40484a != f7) {
            this.f40484a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f40485b != z10) {
            this.f40485b = z10;
            PhotoViewer photoViewer = this.f40491s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f33856r3.setAlpha(1.0f);
            } else {
                photoViewer.f33830o3.setScaleX(1.0f);
                photoViewer.f33830o3.setScaleY(1.0f);
                org.telegram.ui.Components.s81 s81Var = photoViewer.f33847q3;
                if (s81Var.f30500y != 0.0f) {
                    s81Var.f30500y = 0.0f;
                    s81Var.v.invalidate();
                }
            }
            a(this.f40484a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40489n.f16689a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f40491s;
        org.telegram.ui.Components.q81 q81Var = photoViewer.F2;
        if (q81Var != null) {
            f7 = ((float) q81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f33847q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f40491s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f33830o3.getLayoutParams();
        if (this.f40487e > this.f40488f) {
            if (photoViewer.f33839p3.getVisibility() != 0) {
                photoViewer.f33839p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f33839p3.getVisibility() != 4) {
                photoViewer.f33839p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.q81 q81Var = photoViewer.F2;
        long j3 = 0;
        if (q81Var != null) {
            long p5 = q81Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            lu0 lu0Var = photoViewer.f33750f0;
            if (lu0Var != null && lu0Var.f31512x) {
                j3 = lu0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f33830o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f40490r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f40489n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f16689a != f7) {
                kVar.f16690u.f16697i = f7;
                kVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.s81 s81Var = photoViewer.f33847q3;
        int measuredHeight = getMeasuredHeight();
        s81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        s81Var.f30485i = measuredHeight;
        View view = s81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f16689a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f40484a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f40491s;
        if (photoViewer.f33847q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f33856r3.invalidate();
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
