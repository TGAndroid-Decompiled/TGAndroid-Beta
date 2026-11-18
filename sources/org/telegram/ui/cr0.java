package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
public final class cr0 extends FrameLayout {
    public float f46619a;
    public boolean f46620b;
    public boolean f46621c;
    public boolean d;
    public int f46622e;
    public int f46623f;
    public int h;
    public final r1.f f46624n;
    public final r1.g f46625r;
    public final PhotoViewer f46626s;

    public cr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f46626s = photoViewer;
        this.f46619a = 1.0f;
        this.f46621c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f46624n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.f56323m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        gVar.b(new ab0(this, 3));
        this.f46625r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f46626s;
        photoViewer.f43287o3.setAlpha(f10);
        photoViewer.f43295p3.setAlpha(f10);
        if (this.f46620b) {
            org.telegram.ui.ActionBar.n5 n5Var = photoViewer.f43287o3;
            n5Var.setPivotX(n5Var.getWidth());
            org.telegram.ui.ActionBar.n5 n5Var2 = photoViewer.f43287o3;
            n5Var2.setPivotY(n5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f43287o3.setScaleX(f12);
            photoViewer.f43287o3.setScaleY(f12);
            org.telegram.ui.Components.h61 h61Var = photoViewer.f43304q3;
            if (h61Var.f35781y != f11) {
                h61Var.f35781y = f11;
                h61Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f46621c) {
            setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
        }
        photoViewer.f43314r3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f46619a != f10) {
            this.f46619a = f10;
            a(f10);
        }
    }

    public final void c(boolean z10) {
        if (this.f46620b != z10) {
            this.f46620b = z10;
            PhotoViewer photoViewer = this.f46626s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f43314r3.setAlpha(1.0f);
            } else {
                photoViewer.f43287o3.setScaleX(1.0f);
                photoViewer.f43287o3.setScaleY(1.0f);
                org.telegram.ui.Components.h61 h61Var = photoViewer.f43304q3;
                if (h61Var.f35781y != 0.0f) {
                    h61Var.f35781y = 0.0f;
                    h61Var.v.invalidate();
                }
            }
            a(this.f46619a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46624n.f56305a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.f46626s;
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        if (f61Var != null) {
            f10 = ((float) f61Var.S()) / ((float) photoViewer.G2.U());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f43304q3.h(false, f10);
        }
        photoViewer.S7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f46626s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f43287o3.getLayoutParams();
        if (this.f46622e > this.f46623f) {
            if (photoViewer.f43295p3.getVisibility() != 0) {
                photoViewer.f43295p3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.f43295p3.getVisibility() != 4) {
                photoViewer.f43295p3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i7, i10);
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        long j3 = 0;
        if (f61Var != null) {
            long U = f61Var.U();
            if (U != -9223372036854775807L) {
                j3 = U;
            }
        } else {
            dq0 dq0Var = photoViewer.f43217g0;
            if (dq0Var != null && dq0Var.f36753y) {
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
        int ceil = (int) Math.ceil(photoViewer.f43287o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        r1.g gVar = this.f46625r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.f46624n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.f56305a != f10) {
                gVar.f56323m.f56331i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.f43304q3;
        int measuredHeight = getMeasuredHeight();
        h61Var.h = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        h61Var.f35766i = measuredHeight;
        View view = h61Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.f56305a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f46619a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f46626s;
        if (photoViewer.f43304q3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f43314r3.invalidate();
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
