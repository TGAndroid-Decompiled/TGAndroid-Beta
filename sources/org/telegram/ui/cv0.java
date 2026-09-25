package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class cv0 extends FrameLayout {
    public float f32802a;
    public boolean f32803b;
    public boolean f32804c;
    public boolean d;
    public int e;
    public int f32805f;
    public int h;
    public final o1.j f32806n;
    public final o1.k f32807r;
    public final PhotoViewer f32808s;

    public cv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f32808s = photoViewer;
        this.f32802a = 1.0f;
        this.f32804c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f32806n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15533u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new nd0(this, 3));
        this.f32807r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f32808s;
        photoViewer.f31313o3.setAlpha(f7);
        photoViewer.f31322p3.setAlpha(f7);
        if (this.f32803b) {
            org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f31313o3;
            h5Var.setPivotX(h5Var.getWidth());
            org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f31313o3;
            h5Var2.setPivotY(h5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f31313o3.setScaleX(f11);
            photoViewer.f31313o3.setScaleY(f11);
            org.telegram.ui.Components.u71 u71Var = photoViewer.f31330q3;
            if (u71Var.f28756y != f10) {
                u71Var.f28756y = f10;
                u71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f32804c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f31339r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f32802a != f7) {
            this.f32802a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f32803b != z10) {
            this.f32803b = z10;
            PhotoViewer photoViewer = this.f32808s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f31339r3.setAlpha(1.0f);
            } else {
                photoViewer.f31313o3.setScaleX(1.0f);
                photoViewer.f31313o3.setScaleY(1.0f);
                org.telegram.ui.Components.u71 u71Var = photoViewer.f31330q3;
                if (u71Var.f28756y != 0.0f) {
                    u71Var.f28756y = 0.0f;
                    u71Var.v.invalidate();
                }
            }
            a(this.f32802a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32806n.f15532a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f32808s;
        org.telegram.ui.Components.s71 s71Var = photoViewer.F2;
        if (s71Var != null) {
            f7 = ((float) s71Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f31330q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f32808s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f31313o3.getLayoutParams();
        if (this.e > this.f32805f) {
            if (photoViewer.f31322p3.getVisibility() != 0) {
                photoViewer.f31322p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f31322p3.getVisibility() != 4) {
                photoViewer.f31322p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.s71 s71Var = photoViewer.F2;
        long j3 = 0;
        if (s71Var != null) {
            long p5 = s71Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            au0 au0Var = photoViewer.f31233f0;
            if (au0Var != null && au0Var.f22684x) {
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
        int ceil = (int) Math.ceil(photoViewer.f31313o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f32807r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f32806n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f15532a != f7) {
                kVar.f15533u.f15539i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.u71 u71Var = photoViewer.f31330q3;
        int measuredHeight = getMeasuredHeight();
        u71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        u71Var.f28741i = measuredHeight;
        View view = u71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f15532a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32802a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f32808s;
        if (photoViewer.f31330q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f31339r3.invalidate();
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
