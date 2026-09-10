package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class lv0 extends FrameLayout {
    public float f34786a;
    public boolean f34787b;
    public boolean f34788c;
    public boolean d;
    public int e;
    public int f34789f;
    public int h;
    public final o1.j f34790n;
    public final o1.k f34791r;
    public final PhotoViewer f34792s;

    public lv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f34792s = photoViewer;
        this.f34786a = 1.0f;
        this.f34788c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f34790n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f14134u = org.telegram.ui.Cells.r6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 3));
        this.f34791r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f34792s;
        photoViewer.f30138o3.setAlpha(f7);
        photoViewer.f30147p3.setAlpha(f7);
        if (this.f34787b) {
            org.telegram.ui.ActionBar.l5 l5Var = photoViewer.f30138o3;
            l5Var.setPivotX(l5Var.getWidth());
            org.telegram.ui.ActionBar.l5 l5Var2 = photoViewer.f30138o3;
            l5Var2.setPivotY(l5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f30138o3.setScaleX(f11);
            photoViewer.f30138o3.setScaleY(f11);
            org.telegram.ui.Components.v71 v71Var = photoViewer.f30155q3;
            if (v71Var.f27869y != f10) {
                v71Var.f27869y = f10;
                v71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f34788c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f30164r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f34786a != f7) {
            this.f34786a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f34787b != z10) {
            this.f34787b = z10;
            PhotoViewer photoViewer = this.f34792s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f30164r3.setAlpha(1.0f);
            } else {
                photoViewer.f30138o3.setScaleX(1.0f);
                photoViewer.f30138o3.setScaleY(1.0f);
                org.telegram.ui.Components.v71 v71Var = photoViewer.f30155q3;
                if (v71Var.f27869y != 0.0f) {
                    v71Var.f27869y = 0.0f;
                    v71Var.v.invalidate();
                }
            }
            a(this.f34786a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34790n.f14133a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f34792s;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var != null) {
            f7 = ((float) t71Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f30155q3.h(f7, false);
        }
        photoViewer.R7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f34792s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f30138o3.getLayoutParams();
        if (this.e > this.f34789f) {
            if (photoViewer.f30147p3.getVisibility() != 0) {
                photoViewer.f30147p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f30147p3.getVisibility() != 4) {
                photoViewer.f30147p3.setVisibility(4);
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
            hu0 hu0Var = photoViewer.f30058f0;
            if (hu0Var != null && hu0Var.f29666x) {
                j3 = hu0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f30138o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f34791r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f34790n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f14133a != f7) {
                kVar.f14134u.f14140i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.v71 v71Var = photoViewer.f30155q3;
        int measuredHeight = getMeasuredHeight();
        v71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        v71Var.f27854i = measuredHeight;
        View view = v71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f14133a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f34786a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f34792s;
        if (photoViewer.f30155q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f30164r3.invalidate();
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
