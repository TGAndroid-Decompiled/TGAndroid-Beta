package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class br0 extends FrameLayout {
    public float f44450a;
    public boolean f44451b;
    public boolean f44452c;
    public boolean d;
    public int f44453e;
    public int f44454f;
    public int h;
    public final r1.f f44455n;
    public final r1.g f44456r;
    public final PhotoViewer f44457s;

    public br0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f44457s = photoViewer;
        this.f44450a = 1.0f;
        this.f44452c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f44455n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f54150m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new ab0(this, 3));
        this.f44456r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f44457s;
        photoViewer.f41436n3.setAlpha(f10);
        photoViewer.f41445o3.setAlpha(f10);
        if (this.f44451b) {
            org.telegram.ui.ActionBar.k5 k5Var = photoViewer.f41436n3;
            k5Var.setPivotX(k5Var.getWidth());
            org.telegram.ui.ActionBar.k5 k5Var2 = photoViewer.f41436n3;
            k5Var2.setPivotY(k5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f41436n3.setScaleX(f12);
            photoViewer.f41436n3.setScaleY(f12);
            org.telegram.ui.Components.q51 q51Var = photoViewer.f41453p3;
            if (q51Var.f37272y != f11) {
                q51Var.f37272y = f11;
                q51Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f44452c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f41462q3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f44450a != f10) {
            this.f44450a = f10;
            a(f10);
        }
    }

    public final void c(boolean z9) {
        if (this.f44451b != z9) {
            this.f44451b = z9;
            PhotoViewer photoViewer = this.f44457s;
            if (z9) {
                setTranslationY(0.0f);
                photoViewer.f41462q3.setAlpha(1.0f);
            } else {
                photoViewer.f41436n3.setScaleX(1.0f);
                photoViewer.f41436n3.setScaleY(1.0f);
                org.telegram.ui.Components.q51 q51Var = photoViewer.f41453p3;
                if (q51Var.f37272y != 0.0f) {
                    q51Var.f37272y = 0.0f;
                    q51Var.v.invalidate();
                }
            }
            a(this.f44450a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44455n.f54132a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.f44457s;
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        if (n51Var != null) {
            f10 = ((float) n51Var.S()) / ((float) photoViewer.F2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.V2) {
            photoViewer.f41453p3.h(false, f10);
        }
        photoViewer.R7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f44457s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f41436n3.getLayoutParams();
        if (this.f44453e > this.f44454f) {
            if (photoViewer.f41445o3.getVisibility() != 0) {
                photoViewer.f41445o3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f41445o3.getVisibility() != 4) {
                photoViewer.f41445o3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i7, i10);
        org.telegram.ui.Components.n51 n51Var = photoViewer.F2;
        long j3 = 0;
        if (n51Var != null) {
            long U = n51Var.U();
            if (U != -9223372036854775807L) {
                j3 = U;
            }
        } else {
            bq0 bq0Var = photoViewer.f41366f0;
            if (bq0Var != null && bq0Var.f31785y) {
                j3 = bq0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f41436n3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        r1.g gVar = this.f44456r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.f44455n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f54132a != f10) {
                gVar.f54150m.f54158i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.q51 q51Var = photoViewer.f41453p3;
        int measuredHeight = getMeasuredHeight();
        q51Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        q51Var.f37257i = measuredHeight;
        View view = q51Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f54132a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f44450a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f44457s;
        if (photoViewer.f41453p3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f41462q3.invalidate();
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
