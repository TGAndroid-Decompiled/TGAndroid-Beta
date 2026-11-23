package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class cr0 extends FrameLayout {
    public float f46658a;
    public boolean f46659b;
    public boolean f46660c;
    public boolean d;
    public int f46661e;
    public int f46662f;
    public int h;
    public final r1.f f46663n;
    public final r1.g f46664r;
    public final PhotoViewer f46665s;

    public cr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f46665s = photoViewer;
        this.f46658a = 1.0f;
        this.f46660c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f46663n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f56368m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        gVar.b(new bb0(this, 3));
        this.f46664r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f46665s;
        photoViewer.f43332o3.setAlpha(f10);
        photoViewer.f43340p3.setAlpha(f10);
        if (this.f46659b) {
            org.telegram.ui.ActionBar.m5 m5Var = photoViewer.f43332o3;
            m5Var.setPivotX(m5Var.getWidth());
            org.telegram.ui.ActionBar.m5 m5Var2 = photoViewer.f43332o3;
            m5Var2.setPivotY(m5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f43332o3.setScaleX(f12);
            photoViewer.f43332o3.setScaleY(f12);
            org.telegram.ui.Components.k61 k61Var = photoViewer.f43349q3;
            if (k61Var.f36841y != f11) {
                k61Var.f36841y = f11;
                k61Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f46660c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f43359r3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f46658a != f10) {
            this.f46658a = f10;
            a(f10);
        }
    }

    public final void c(boolean z10) {
        if (this.f46659b != z10) {
            this.f46659b = z10;
            PhotoViewer photoViewer = this.f46665s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f43359r3.setAlpha(1.0f);
            } else {
                photoViewer.f43332o3.setScaleX(1.0f);
                photoViewer.f43332o3.setScaleY(1.0f);
                org.telegram.ui.Components.k61 k61Var = photoViewer.f43349q3;
                if (k61Var.f36841y != 0.0f) {
                    k61Var.f36841y = 0.0f;
                    k61Var.v.invalidate();
                }
            }
            a(this.f46658a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46663n.f56350a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.f46665s;
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null) {
            f10 = ((float) i61Var.S()) / ((float) photoViewer.G2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f43349q3.h(false, f10);
        }
        photoViewer.S7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f46665s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f43332o3.getLayoutParams();
        if (this.f46661e > this.f46662f) {
            if (photoViewer.f43340p3.getVisibility() != 0) {
                photoViewer.f43340p3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f43340p3.getVisibility() != 4) {
                photoViewer.f43340p3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i7, i10);
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        long j3 = 0;
        if (i61Var != null) {
            long U = i61Var.U();
            if (U != -9223372036854775807L) {
                j3 = U;
            }
        } else {
            dq0 dq0Var = photoViewer.f43262g0;
            if (dq0Var != null && dq0Var.f37178y) {
                j3 = dq0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f43332o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        r1.g gVar = this.f46664r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.f46663n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f56350a != f10) {
                gVar.f56368m.f56376i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.k61 k61Var = photoViewer.f43349q3;
        int measuredHeight = getMeasuredHeight();
        k61Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        k61Var.f36826i = measuredHeight;
        View view = k61Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f56350a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f46658a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f46665s;
        if (photoViewer.f43349q3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f43359r3.invalidate();
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
