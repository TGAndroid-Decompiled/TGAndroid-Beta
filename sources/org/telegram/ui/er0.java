package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class er0 extends FrameLayout {
    public float f45492a;
    public boolean f45493b;
    public boolean f45494c;
    public boolean d;
    public int f45495e;
    public int f45496f;
    public int h;
    public final r1.f f45497n;
    public final r1.g f45498r;
    public final PhotoViewer f45499s;

    public er0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f45499s = photoViewer;
        this.f45492a = 1.0f;
        this.f45494c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f45497n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f54280m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new cb0(this, 3));
        this.f45498r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f45499s;
        photoViewer.f41471n3.setAlpha(f10);
        photoViewer.f41480o3.setAlpha(f10);
        if (this.f45493b) {
            org.telegram.ui.ActionBar.l5 l5Var = photoViewer.f41471n3;
            l5Var.setPivotX(l5Var.getWidth());
            org.telegram.ui.ActionBar.l5 l5Var2 = photoViewer.f41471n3;
            l5Var2.setPivotY(l5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f41471n3.setScaleX(f12);
            photoViewer.f41471n3.setScaleY(f12);
            org.telegram.ui.Components.w51 w51Var = photoViewer.f41488p3;
            if (w51Var.f39941y != f11) {
                w51Var.f39941y = f11;
                w51Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f45494c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f41497q3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f45492a != f10) {
            this.f45492a = f10;
            a(f10);
        }
    }

    public final void c(boolean z9) {
        if (this.f45493b != z9) {
            this.f45493b = z9;
            PhotoViewer photoViewer = this.f45499s;
            if (z9) {
                setTranslationY(0.0f);
                photoViewer.f41497q3.setAlpha(1.0f);
            } else {
                photoViewer.f41471n3.setScaleX(1.0f);
                photoViewer.f41471n3.setScaleY(1.0f);
                org.telegram.ui.Components.w51 w51Var = photoViewer.f41488p3;
                if (w51Var.f39941y != 0.0f) {
                    w51Var.f39941y = 0.0f;
                    w51Var.v.invalidate();
                }
            }
            a(this.f45492a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45497n.f54262a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.f45499s;
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null) {
            f10 = ((float) u51Var.S()) / ((float) photoViewer.F2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.V2) {
            photoViewer.f41488p3.h(false, f10);
        }
        photoViewer.R7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f45499s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f41471n3.getLayoutParams();
        if (this.f45495e > this.f45496f) {
            if (photoViewer.f41480o3.getVisibility() != 0) {
                photoViewer.f41480o3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f41480o3.getVisibility() != 4) {
                photoViewer.f41480o3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i7, i10);
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        long j3 = 0;
        if (u51Var != null) {
            long U = u51Var.U();
            if (U != -9223372036854775807L) {
                j3 = U;
            }
        } else {
            eq0 eq0Var = photoViewer.f41401f0;
            if (eq0Var != null && eq0Var.f32248y) {
                j3 = eq0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f41471n3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        r1.g gVar = this.f45498r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.f45497n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f54262a != f10) {
                gVar.f54280m.f54288i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.w51 w51Var = photoViewer.f41488p3;
        int measuredHeight = getMeasuredHeight();
        w51Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        w51Var.f39926i = measuredHeight;
        View view = w51Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f54262a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45492a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f45499s;
        if (photoViewer.f41488p3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f41497q3.invalidate();
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
