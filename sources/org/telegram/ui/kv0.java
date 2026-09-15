package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class kv0 extends FrameLayout {
    public float f35271a;
    public boolean f35272b;
    public boolean f35273c;
    public boolean d;
    public int e;
    public int f35274f;
    public int h;
    public final o1.j f35275n;
    public final o1.k f35276r;
    public final PhotoViewer f35277s;

    public kv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35277s = photoViewer;
        this.f35271a = 1.0f;
        this.f35273c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f35275n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.f15351u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 3));
        this.f35276r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.f35277s;
        photoViewer.f31025o3.setAlpha(f7);
        photoViewer.f31034p3.setAlpha(f7);
        if (this.f35272b) {
            org.telegram.ui.ActionBar.j5 j5Var = photoViewer.f31025o3;
            j5Var.setPivotX(j5Var.getWidth());
            org.telegram.ui.ActionBar.j5 j5Var2 = photoViewer.f31025o3;
            j5Var2.setPivotY(j5Var2.getHeight());
            float f10 = 1.0f - f7;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f31025o3.setScaleX(f11);
            photoViewer.f31025o3.setScaleY(f11);
            org.telegram.ui.Components.i71 i71Var = photoViewer.f31042q3;
            if (i71Var.f24936y != f10) {
                i71Var.f24936y = f10;
                i71Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f35273c) {
            setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f31051r3.setAlpha(f7);
    }

    public final void b(float f7) {
        if (this.f35271a != f7) {
            this.f35271a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.f35272b != z10) {
            this.f35272b = z10;
            PhotoViewer photoViewer = this.f35277s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f31051r3.setAlpha(1.0f);
            } else {
                photoViewer.f31025o3.setScaleX(1.0f);
                photoViewer.f31025o3.setScaleY(1.0f);
                org.telegram.ui.Components.i71 i71Var = photoViewer.f31042q3;
                if (i71Var.f24936y != 0.0f) {
                    i71Var.f24936y = 0.0f;
                    i71Var.v.invalidate();
                }
            }
            a(this.f35271a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35275n.f15350a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f35277s;
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        if (g71Var != null) {
            f7 = ((float) g71Var.n()) / ((float) photoViewer.F2.p());
        } else {
            f7 = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.f31042q3.h(f7, false);
        }
        photoViewer.R7.setProgress(f7);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f35277s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f31025o3.getLayoutParams();
        if (this.e > this.f35274f) {
            if (photoViewer.f31034p3.getVisibility() != 0) {
                photoViewer.f31034p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f31034p3.getVisibility() != 4) {
                photoViewer.f31034p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        long j3 = 0;
        if (g71Var != null) {
            long p5 = g71Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            iu0 iu0Var = photoViewer.f30945f0;
            if (iu0Var != null && iu0Var.f27330x) {
                j3 = iu0Var.getVideoDuration();
            }
        }
        long j10 = j3 / 1000;
        long j11 = j10 / 60;
        if (j11 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f31025o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f35276r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.f35275n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.f15350a != f7) {
                kVar.f15351u.f15357i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.i71 i71Var = photoViewer.f31042q3;
        int measuredHeight = getMeasuredHeight();
        i71Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        i71Var.f24921i = measuredHeight;
        View view = i71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.f15350a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f35271a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f35277s;
        if (photoViewer.f31042q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f31051r3.invalidate();
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
