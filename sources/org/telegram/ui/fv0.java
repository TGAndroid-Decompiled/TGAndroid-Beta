package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class fv0 extends FrameLayout {
    public float f36405a;
    public boolean f36406b;
    public boolean f36407c;
    public boolean d;
    public int f36408e;
    public int f36409f;
    public int h;
    public final o1.j f36410n;
    public final o1.k f36411r;
    public final PhotoViewer f36412s;

    public fv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36412s = photoViewer;
        this.f36405a = 1.0f;
        this.f36407c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f36410n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f16983u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        kVar.b(new rd0(this, 3));
        this.f36411r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f36412s;
        photoViewer.f33983o3.setAlpha(f7);
        photoViewer.f33992p3.setAlpha(f7);
        if (this.f36406b) {
            org.telegram.ui.ActionBar.i5 i5Var = photoViewer.f33983o3;
            i5Var.setPivotX(i5Var.getWidth());
            org.telegram.ui.ActionBar.i5 i5Var2 = photoViewer.f33983o3;
            i5Var2.setPivotY(i5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f33983o3.setScaleX(f11);
            photoViewer.f33983o3.setScaleY(f11);
            org.telegram.ui.Components.f81 f81Var = photoViewer.f34000q3;
            if (f81Var.f26384y != f10) {
                f81Var.f26384y = f10;
                f81Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f36407c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f34009r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f36405a != f7) {
            this.f36405a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f36406b != z10) {
            this.f36406b = z10;
            PhotoViewer photoViewer = this.f36412s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f34009r3.setAlpha(1.0f);
            } else {
                photoViewer.f33983o3.setScaleX(1.0f);
                photoViewer.f33983o3.setScaleY(1.0f);
                org.telegram.ui.Components.f81 f81Var = photoViewer.f34000q3;
                if (f81Var.f26384y != 0.0f) {
                    f81Var.f26384y = 0.0f;
                    f81Var.v.invalidate();
                }
            }
            a(this.f36405a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36410n.f16982a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f36412s;
        org.telegram.ui.Components.d81 d81Var = photoViewer.F2;
        if (d81Var != null) {
            f7 = ((float) d81Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f34000q3.h(f7, false);
        }
        photoViewer.S7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f36412s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f33983o3.getLayoutParams();
        if (this.f36408e > this.f36409f) {
            if (photoViewer.f33992p3.getVisibility() != 0) {
                photoViewer.f33992p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f33992p3.getVisibility() != 4) {
                photoViewer.f33992p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.d81 d81Var = photoViewer.F2;
        long j3 = 0;
        if (d81Var != null) {
            long p5 = d81Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            du0 du0Var = photoViewer.f33903f0;
            if (du0Var != null && du0Var.f25723x) {
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
        int ceil = (int) Math.ceil(photoViewer.f33983o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f36411r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f36410n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f16982a != f7) {
                kVar.f16983u.f16990i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.f81 f81Var = photoViewer.f34000q3;
        int measuredHeight = getMeasuredHeight();
        f81Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        f81Var.f26369i = measuredHeight;
        View view = f81Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f16982a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36405a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f36412s;
        if (photoViewer.f34000q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f34009r3.invalidate();
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
