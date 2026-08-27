package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

public final class ju0 extends FrameLayout {

    public float f39502a;

    public boolean f39503b;

    public boolean f39504c;
    public boolean d;

    public int f39505e;

    public int f39506f;
    public int h;

    public final hb.a f39507n;

    public final o1.j f39508r;

    public final PhotoViewer f39509s;

    public ju0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39509s = photoViewer;
        this.f39502a = 1.0f;
        this.f39504c = true;
        hb.a aVar = new hb.a(0.0f);
        this.f39507n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.f19147u = org.telegram.ui.Cells.pa.k(0.0f, 750.0f, 1.0f);
        jVar.b(new ed0(this, 3));
        this.f39508r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.f39509s;
        photoViewer.f35678k3.setAlpha(f10);
        photoViewer.f35686l3.setAlpha(f10);
        if (!this.f39503b) {
            if (this.f39504c) {
                setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
            }
            photoViewer.f35704n3.setAlpha(f10);
            return;
        }
        org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f35678k3;
        h5Var.setPivotX(h5Var.getWidth());
        org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f35678k3;
        h5Var2.setPivotY(h5Var2.getHeight());
        float f11 = 1.0f - f10;
        float f12 = 1.0f - (0.1f * f11);
        photoViewer.f35678k3.setScaleX(f12);
        photoViewer.f35678k3.setScaleY(f12);
        org.telegram.ui.Components.o61 o61Var = photoViewer.f35694m3;
        if (o61Var.f31198y != f11) {
            o61Var.f31198y = f11;
            o61Var.v.invalidate();
        }
    }

    public final void b(float f10) {
        if (this.f39502a != f10) {
            this.f39502a = f10;
            a(f10);
        }
    }

    public final void c(boolean z10) {
        if (this.f39503b != z10) {
            this.f39503b = z10;
            PhotoViewer photoViewer = this.f39509s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f35704n3.setAlpha(1.0f);
            } else {
                photoViewer.f35678k3.setScaleX(1.0f);
                photoViewer.f35678k3.setScaleY(1.0f);
                org.telegram.ui.Components.o61 o61Var = photoViewer.f35694m3;
                if (o61Var.f31198y != 0.0f) {
                    o61Var.f31198y = 0.0f;
                    o61Var.v.invalidate();
                }
            }
            a(this.f39502a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39507n.f8860a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f39509s;
        org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
        float fO = m61Var != null ? m61Var.o() / photoViewer.B2.q() : 0.0f;
        if (photoViewer.S2) {
            photoViewer.f35694m3.h(fO, false);
        }
        photoViewer.N7.setProgress(fO);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        View view;
        this.d = true;
        PhotoViewer photoViewer = this.f39509s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f35678k3.getLayoutParams();
        if (this.f39505e > this.f39506f) {
            if (photoViewer.f35686l3.getVisibility() != 0) {
                photoViewer.f35686l3.setVisibility(0);
            }
            iDp = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f35686l3.getVisibility() != 4) {
                photoViewer.f35686l3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            iDp = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
        long videoDuration = 0;
        if (m61Var != null) {
            long jQ = m61Var.q();
            if (jQ != -9223372036854775807L) {
                videoDuration = jQ;
            }
        } else {
            ht0 ht0Var = photoViewer.f35591b0;
            if (ht0Var != null && ht0Var.f27746x) {
                videoDuration = ht0Var.getVideoDuration();
            }
        }
        long j10 = videoDuration / 1000;
        long j11 = j10 / 60;
        int iCeil = (int) Math.ceil(photoViewer.f35678k3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", j11 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60), Long.valueOf(j10 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j11), Long.valueOf(j10 % 60)))));
        o1.j jVar = this.f39508r;
        jVar.c();
        int i12 = this.h;
        hb.a aVar = this.f39507n;
        if (i12 != 0) {
            float f10 = iCeil;
            if (aVar.f8860a != f10) {
                jVar.f19147u.f19154i = f10;
                jVar.f();
            } else {
                org.telegram.ui.Components.o61 o61Var = photoViewer.f35694m3;
                int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - iCeil) - iDp;
                int measuredHeight = getMeasuredHeight();
                o61Var.h = measuredWidth;
                o61Var.f31183i = measuredHeight;
                view = o61Var.v;
                if (view != null) {
                    view.invalidate();
                }
                aVar.f8860a = iCeil;
            }
        } else {
            org.telegram.ui.Components.o61 o61Var2 = photoViewer.f35694m3;
            int measuredWidth2 = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - iCeil) - iDp;
            int measuredHeight2 = getMeasuredHeight();
            o61Var2.h = measuredWidth2;
            o61Var2.f31183i = measuredHeight2;
            view = o61Var2.v;
            if (view != null) {
                view.invalidate();
            }
            aVar.f8860a = iCeil;
        }
        this.h = iCeil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f39502a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f39509s;
        if (photoViewer.f35694m3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f35704n3.invalidate();
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
