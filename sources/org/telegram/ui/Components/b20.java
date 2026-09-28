package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class b20 extends FrameLayout implements le.e {
    public final le.c f22843a;
    public final le.c f22844b;
    public final nj0 f22845c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.d6 e;
    public ArrayList f22846f;
    public final boolean h;
    public final fh.c f22847n;
    public final ch.f f22848r;
    public final ci.f f22849s;
    public float v;
    public float f22850w;
    public boolean f22851x;

    public b20(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.y5.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.y5.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f7) {
        int i10;
        if (view == null) {
            return;
        }
        view.setAlpha(f7);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private void setAdditionalTranslationY(float f7) {
        if (this.v != f7) {
            this.f22851x = true;
            super.setTranslationY(this.f22850w + f7);
            this.f22851x = false;
            this.v = f7;
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        float f11;
        int i11 = 0;
        boolean z10 = false;
        if (i10 == 0) {
            d(this, f7);
            if (f7 >= 0.99f) {
                z10 = true;
            }
            setClickable(z10);
            if (this.h) {
                f11 = 64.0f;
            } else {
                f11 = 40.0f;
            }
            setAdditionalTranslationY((1.0f - f7) * AndroidUtilities.dp(f11));
        } else if (i10 == 1) {
            d(this.d, f7);
            float f12 = 1.0f - f7;
            d(this.f22845c, f12);
            ArrayList arrayList = this.f22846f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    d((View) obj, f12);
                }
            }
        }
    }

    public final void a(View view) {
        if (this.f22846f == null) {
            this.f22846f = new ArrayList();
        }
        this.f22846f.add(view);
        d(view, 1.0f - this.f22844b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        ch.f fVar = this.f22848r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f22843a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f22844b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        nj0 nj0Var = this.f22845c;
        org.telegram.ui.ActionBar.d6 d6Var = this.e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.h6.f19393v8;
            nj0Var.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
            this.f22847n.a(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
            this.f22849s.d();
            this.f22848r.v();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19149i6, d6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.h6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.O9;
        nj0Var.setColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Qh, d6Var)));
    }

    public boolean getButtonVisible() {
        return this.f22843a.f14202f;
    }

    public boolean getProgressVisible() {
        return this.f22844b.f14202f;
    }

    @Override
    public float getTranslationY() {
        if (this.f22851x) {
            return super.getTranslationY();
        }
        return this.f22850w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ch.f fVar = this.f22848r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f22845c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f22850w != f7) {
            this.f22851x = true;
            super.setTranslationY(this.v + f7);
            this.f22851x = false;
            this.f22850w = f7;
        }
    }

    public b20(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        sr srVar = sr.h;
        this.f22843a = new le.c(0, this, srVar, 380L, true);
        this.f22844b = new le.c(1, this, srVar, 380L, false);
        this.e = d6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f22845c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.y5.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.a6.a(this);
        if (!z10) {
            setOutlineProvider(yf.i0.f47112a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ci.f fVar = new ci.f(org.telegram.ui.ActionBar.h6.f19130h5, null);
            this.f22849s = fVar;
            fh.c cVar = new fh.c();
            this.f22847n = cVar;
            ch.f fVar2 = new ch.f(cVar);
            this.f22848r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            ch.c cVar2 = fVar2.f4280j;
            cVar2.f4267i = dpf2;
            cVar2.f4268j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
