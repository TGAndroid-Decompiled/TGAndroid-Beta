package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class iu0 extends FrameLayout {
    public float f39285a;
    public boolean f39286b;
    public boolean f39287c;
    public boolean d;
    public int f39288e;
    public int f39289f;
    public int h;
    public final gb.a f39290n;
    public final o1.j f39291r;
    public final PhotoViewer f39292s;

    public iu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39292s = photoViewer;
        this.f39285a = 1.0f;
        this.f39287c = true;
        gb.a aVar = new gb.a(0.0f);
        this.f39290n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f18800u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        jVar.b(new ad0(this, 3));
        this.f39291r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f39292s;
        photoViewer.f35675k3.setAlpha(f10);
        photoViewer.f35683l3.setAlpha(f10);
        if (this.f39286b) {
            org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f35675k3;
            h5Var.setPivotX(h5Var.getWidth());
            org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f35675k3;
            h5Var2.setPivotY(h5Var2.getHeight());
            float f11 = 1.0f - f10;
            float f12 = 1.0f - (0.1f * f11);
            photoViewer.f35675k3.setScaleX(f12);
            photoViewer.f35675k3.setScaleY(f12);
            org.telegram.ui.Components.m61 m61Var = photoViewer.f35691m3;
            if (m61Var.f30728y != f11) {
                m61Var.f30728y = f11;
                m61Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f39287c) {
            setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f35701n3.setAlpha(f10);
    }

    public final void b(float f10) {
        if (this.f39285a != f10) {
            this.f39285a = f10;
            a(f10);
        }
    }

    public final void c(boolean z10) {
        if (this.f39286b != z10) {
            this.f39286b = z10;
            PhotoViewer photoViewer = this.f39292s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f35701n3.setAlpha(1.0f);
            } else {
                photoViewer.f35675k3.setScaleX(1.0f);
                photoViewer.f35675k3.setScaleY(1.0f);
                org.telegram.ui.Components.m61 m61Var = photoViewer.f35691m3;
                if (m61Var.f30728y != 0.0f) {
                    m61Var.f30728y = 0.0f;
                    m61Var.v.invalidate();
                }
            }
            a(this.f39285a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39290n.f7689a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i9, i10, i11, i12);
        PhotoViewer photoViewer = this.f39292s;
        org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
        if (k61Var != null) {
            f10 = ((float) k61Var.o()) / ((float) photoViewer.B2.q());
        } else {
            f10 = 0.0f;
        }
        if (photoViewer.S2) {
            photoViewer.f35691m3.h(f10, false);
        }
        photoViewer.N7.setProgress(f10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f39292s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f35675k3.getLayoutParams();
        if (this.f39288e > this.f39289f) {
            if (photoViewer.f35683l3.getVisibility() != 0) {
                photoViewer.f35683l3.setVisibility(0);
            }
            i11 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f35683l3.getVisibility() != 4) {
                photoViewer.f35683l3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i9, i10);
        org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
        long j10 = 0;
        if (k61Var != null) {
            long q10 = k61Var.q();
            if (q10 != -9223372036854775807L) {
                j10 = q10;
            }
        } else {
            gt0 gt0Var = photoViewer.f35588b0;
            if (gt0Var != null && gt0Var.f35295x) {
                j10 = gt0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f35675k3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.j jVar = this.f39291r;
        jVar.c();
        int i12 = this.h;
        gb.a aVar = this.f39290n;
        if (i12 != 0) {
            float f10 = ceil;
            if (aVar.f7689a != f10) {
                jVar.f18800u.f18807i = f10;
                jVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.m61 m61Var = photoViewer.f35691m3;
        int measuredHeight = getMeasuredHeight();
        m61Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i11;
        m61Var.f30713i = measuredHeight;
        View view = m61Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.f7689a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39285a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f39292s;
        if (photoViewer.f35691m3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f35701n3.invalidate();
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
