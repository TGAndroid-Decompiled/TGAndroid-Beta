package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
public final class gu0 extends FrameLayout {
    public float f38666a;
    public boolean f38667b;
    public boolean f38668c;
    public boolean d;
    public int f38669e;
    public int f38670f;
    public int h;
    public final ib.a f38671n;
    public final o1.k f38672r;
    public final PhotoViewer f38673s;

    public gu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f38673s = photoViewer;
        this.f38666a = 1.0f;
        this.f38668c = true;
        ib.a aVar = new ib.a(0.0f);
        this.f38671n = aVar;
        o1.k kVar = new o1.k(aVar);
        kVar.f19045u = th.l(0.0f, 750.0f, 1.0f);
        kVar.b(new cd0(this, 3));
        this.f38672r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f9) {
        PhotoViewer photoViewer = this.f38673s;
        photoViewer.f35741k3.setAlpha(f9);
        photoViewer.f35749l3.setAlpha(f9);
        if (this.f38667b) {
            org.telegram.ui.ActionBar.h5 h5Var = photoViewer.f35741k3;
            h5Var.setPivotX(h5Var.getWidth());
            org.telegram.ui.ActionBar.h5 h5Var2 = photoViewer.f35741k3;
            h5Var2.setPivotY(h5Var2.getHeight());
            float f10 = 1.0f - f9;
            float f11 = 1.0f - (0.1f * f10);
            photoViewer.f35741k3.setScaleX(f11);
            photoViewer.f35741k3.setScaleY(f11);
            org.telegram.ui.Components.z61 z61Var = photoViewer.f35757m3;
            if (z61Var.f35250y != f10) {
                z61Var.f35250y = f10;
                z61Var.v.invalidate();
                return;
            }
            return;
        }
        if (this.f38668c) {
            setTranslationY((1.0f - f9) * AndroidUtilities.dpf2(24.0f));
        }
        photoViewer.f35767n3.setAlpha(f9);
    }

    public final void b(float f9) {
        if (this.f38666a != f9) {
            this.f38666a = f9;
            a(f9);
        }
    }

    public final void c(boolean z10) {
        if (this.f38667b != z10) {
            this.f38667b = z10;
            PhotoViewer photoViewer = this.f38673s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.f35767n3.setAlpha(1.0f);
            } else {
                photoViewer.f35741k3.setScaleX(1.0f);
                photoViewer.f35741k3.setScaleY(1.0f);
                org.telegram.ui.Components.z61 z61Var = photoViewer.f35757m3;
                if (z61Var.f35250y != 0.0f) {
                    z61Var.f35250y = 0.0f;
                    z61Var.v.invalidate();
                }
            }
            a(this.f38666a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38671n.f8824a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f9;
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.f38673s;
        org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
        if (x61Var != null) {
            f9 = ((float) x61Var.o()) / ((float) photoViewer.B2.q());
        } else {
            f9 = 0.0f;
        }
        if (photoViewer.S2) {
            photoViewer.f35757m3.h(f9, false);
        }
        photoViewer.N7.setProgress(f9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.f38673s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.f35741k3.getLayoutParams();
        if (this.f38669e > this.f38670f) {
            if (photoViewer.f35749l3.getVisibility() != 0) {
                photoViewer.f35749l3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.f35749l3.getVisibility() != 4) {
                photoViewer.f35749l3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
        long j10 = 0;
        if (x61Var != null) {
            long q6 = x61Var.q();
            if (q6 != -9223372036854775807L) {
                j10 = q6;
            }
        } else {
            et0 et0Var = photoViewer.f35656b0;
            if (et0Var != null && et0Var.f30680x) {
                j10 = et0Var.getVideoDuration();
            }
        }
        long j11 = j10 / 1000;
        long j12 = j11 / 60;
        if (j12 > 60) {
            format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j12 / 60), Long.valueOf(j12 % 60), Long.valueOf(j11 % 60));
        } else {
            format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j11 % 60));
        }
        int ceil = (int) Math.ceil(photoViewer.f35741k3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
        o1.k kVar = this.f38672r;
        kVar.c();
        int i13 = this.h;
        ib.a aVar = this.f38671n;
        if (i13 != 0) {
            float f9 = ceil;
            if (aVar.f8824a != f9) {
                kVar.f19045u.f19052i = f9;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.z61 z61Var = photoViewer.f35757m3;
        int measuredHeight = getMeasuredHeight();
        z61Var.h = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        z61Var.f35235i = measuredHeight;
        View view = z61Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.f8824a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38666a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.f38673s;
        if (photoViewer.f35757m3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.f35767n3.invalidate();
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
