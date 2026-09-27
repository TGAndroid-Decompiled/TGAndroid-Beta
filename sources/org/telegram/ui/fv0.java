package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class fv0 extends FrameLayout {
    public float f33637a;
    public boolean f33638b;
    public boolean f33639c;
    public boolean d;
    public int e;
    public int f33640f;
    public int h;
    public final o1.j f33641n;
    public final o1.k f33642r;
    public final PhotoViewer f33643s;

    public fv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f33643s = photoViewer;
        this.f33637a = 1.0f;
        this.f33639c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f33641n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15572u = org.telegram.ui.Cells.c1.m(0.0f, 750.0f, 1.0f);
        kVar.b(new qd0(this, 3));
        this.f33642r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f33643s;
        photoViewer.f31314o3.setAlpha(f7);
        photoViewer.f31323p3.setAlpha(f7);
        if (this.f33638b) {
            org.telegram.ui.ActionBar.j5 j5Var = photoViewer.f31314o3;
            j5Var.setPivotX(j5Var.getWidth());
            org.telegram.ui.ActionBar.j5 j5Var2 = photoViewer.f31314o3;
            j5Var2.setPivotY(j5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f31314o3.setScaleX(f11);
            photoViewer.f31314o3.setScaleY(f11);
            org.telegram.ui.Components.w71 w71Var = photoViewer.f31331q3;
            if (w71Var.f29885y != f10) {
                w71Var.f29885y = f10;
                w71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f33639c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f31340r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f33637a != f7) {
            this.f33637a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f33638b != z10) {
            this.f33638b = z10;
            PhotoViewer photoViewer = this.f33643s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f31340r3.setAlpha(1.0f);
            } else {
                photoViewer.f31314o3.setScaleX(1.0f);
                photoViewer.f31314o3.setScaleY(1.0f);
                org.telegram.ui.Components.w71 w71Var = photoViewer.f31331q3;
                if (w71Var.f29885y != 0.0f) {
                    w71Var.f29885y = 0.0f;
                    w71Var.v.invalidate();
                }
            }
            a(this.f33637a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33641n.f15571a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f33643s;
        org.telegram.ui.Components.u71 u71Var = photoViewer.F2;
        if (u71Var != null) {
            f7 = ((float) u71Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f31331q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f33643s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f31314o3.getLayoutParams();
        if (this.e > this.f33640f) {
            if (photoViewer.f31323p3.getVisibility() != 0) {
                photoViewer.f31323p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f31323p3.getVisibility() != 4) {
                photoViewer.f31323p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.u71 u71Var = photoViewer.F2;
        long j3 = 0;
        if (u71Var != null) {
            long p5 = u71Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            du0 du0Var = photoViewer.f31234f0;
            if (du0Var != null && du0Var.f23018x) {
                j3 = du0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f31314o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f33642r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f33641n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f15571a != f7) {
                kVar.f15572u.f15578i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.w71 w71Var = photoViewer.f31331q3;
        int measuredHeight = getMeasuredHeight();
        w71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        w71Var.f29870i = measuredHeight;
        View view = w71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f15571a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33637a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f33643s;
        if (photoViewer.f31331q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f31340r3.invalidate();
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
