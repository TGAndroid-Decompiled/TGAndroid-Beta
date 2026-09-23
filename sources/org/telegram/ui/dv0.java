package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class dv0 extends FrameLayout {
    public float f32725a;
    public boolean f32726b;
    public boolean f32727c;
    public boolean d;
    public int e;
    public int f32728f;
    public int h;
    public final o1.j f32729n;
    public final o1.k f32730r;
    public final PhotoViewer f32731s;

    public dv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f32731s = photoViewer;
        this.f32725a = 1.0f;
        this.f32727c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f32729n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15326u = org.telegram.ui.Cells.q3.l(0.0f, 750.0f, 1.0f);
        kVar.b(new od0(this, 3));
        this.f32730r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f32731s;
        photoViewer.f30997o3.setAlpha(f7);
        photoViewer.f31006p3.setAlpha(f7);
        if (this.f32726b) {
            org.telegram.ui.ActionBar.i5 i5Var = photoViewer.f30997o3;
            i5Var.setPivotX(i5Var.getWidth());
            org.telegram.ui.ActionBar.i5 i5Var2 = photoViewer.f30997o3;
            i5Var2.setPivotY(i5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f30997o3.setScaleX(f11);
            photoViewer.f30997o3.setScaleY(f11);
            org.telegram.ui.Components.h71 h71Var = photoViewer.f31014q3;
            if (h71Var.f24558y != f10) {
                h71Var.f24558y = f10;
                h71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f32727c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f31023r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f32725a != f7) {
            this.f32725a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f32726b != z10) {
            this.f32726b = z10;
            PhotoViewer photoViewer = this.f32731s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f31023r3.setAlpha(1.0f);
            } else {
                photoViewer.f30997o3.setScaleX(1.0f);
                photoViewer.f30997o3.setScaleY(1.0f);
                org.telegram.ui.Components.h71 h71Var = photoViewer.f31014q3;
                if (h71Var.f24558y != 0.0f) {
                    h71Var.f24558y = 0.0f;
                    h71Var.v.invalidate();
                }
            }
            a(this.f32725a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32729n.f15325a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f32731s;
        org.telegram.ui.Components.f71 f71Var = photoViewer.F2;
        if (f71Var != null) {
            f7 = ((float) f71Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f31014q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f32731s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f30997o3.getLayoutParams();
        if (this.e > this.f32728f) {
            if (photoViewer.f31006p3.getVisibility() != 0) {
                photoViewer.f31006p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f31006p3.getVisibility() != 4) {
                photoViewer.f31006p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.f71 f71Var = photoViewer.F2;
        long j3 = 0;
        if (f71Var != null) {
            long p5 = f71Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            bu0 bu0Var = photoViewer.f30917f0;
            if (bu0Var != null && bu0Var.f27337x) {
                j3 = bu0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f30997o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f32730r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f32729n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f15325a != f7) {
                kVar.f15326u.f15332i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.h71 h71Var = photoViewer.f31014q3;
        int measuredHeight = getMeasuredHeight();
        h71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        h71Var.f24543i = measuredHeight;
        View view = h71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f15325a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32725a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f32731s;
        if (photoViewer.f31014q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f31023r3.invalidate();
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
