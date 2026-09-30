package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class cv0 extends FrameLayout {
    public float f32879a;
    public boolean f32880b;
    public boolean f32881c;
    public boolean d;
    public int e;
    public int f32882f;
    public int h;
    public final o1.j f32883n;
    public final o1.k f32884r;
    public final PhotoViewer f32885s;

    public cv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f32885s = photoViewer;
        this.f32879a = 1.0f;
        this.f32881c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f32883n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15549u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new nd0(this, 3));
        this.f32884r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f32885s;
        photoViewer.f31386o3.setAlpha(f7);
        photoViewer.f31395p3.setAlpha(f7);
        if (this.f32880b) {
            org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f31386o3;
            h5Var.setPivotX(h5Var.getWidth());
            org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f31386o3;
            h5Var2.setPivotY(h5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f31386o3.setScaleX(f11);
            photoViewer.f31386o3.setScaleY(f11);
            org.telegram.ui.Components.x71 x71Var = photoViewer.f31403q3;
            if (x71Var.f30173y != f10) {
                x71Var.f30173y = f10;
                x71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f32881c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f31412r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f32879a != f7) {
            this.f32879a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f32880b != z10) {
            this.f32880b = z10;
            PhotoViewer photoViewer = this.f32885s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f31412r3.setAlpha(1.0f);
            } else {
                photoViewer.f31386o3.setScaleX(1.0f);
                photoViewer.f31386o3.setScaleY(1.0f);
                org.telegram.ui.Components.x71 x71Var = photoViewer.f31403q3;
                if (x71Var.f30173y != 0.0f) {
                    x71Var.f30173y = 0.0f;
                    x71Var.v.invalidate();
                }
            }
            a(this.f32879a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32883n.f15548a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f32885s;
        org.telegram.ui.Components.v71 v71Var = photoViewer.F2;
        if (v71Var != null) {
            f7 = ((float) v71Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f31403q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f32885s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f31386o3.getLayoutParams();
        if (this.e > this.f32882f) {
            if (photoViewer.f31395p3.getVisibility() != 0) {
                photoViewer.f31395p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f31395p3.getVisibility() != 4) {
                photoViewer.f31395p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.v71 v71Var = photoViewer.F2;
        long j3 = 0;
        if (v71Var != null) {
            long p5 = v71Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            au0 au0Var = photoViewer.f31306f0;
            if (au0Var != null && au0Var.f23637x) {
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
        int ceil = (int) Math.ceil(photoViewer.f31386o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f32884r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f32883n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f15548a != f7) {
                kVar.f15549u.f15555i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.x71 x71Var = photoViewer.f31403q3;
        int measuredHeight = getMeasuredHeight();
        x71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        x71Var.f30158i = measuredHeight;
        View view = x71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f15548a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32879a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f32885s;
        if (photoViewer.f31403q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f31412r3.invalidate();
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
