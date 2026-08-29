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
public final class u10 extends FrameLayout implements vd.b {
    public final vd.a f33088a;
    public final vd.a f33089b;
    public final aj0 f33090c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.c6 f33091e;
    public ArrayList f33092f;
    public final boolean h;
    public final qg.c f33093n;
    public final ng.f f33094r;
    public final nh.f f33095s;
    public float v;
    public float f33096w;
    public boolean f33097x;

    public u10(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return i7.f6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return i7.f6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f9) {
        int i10;
        if (view == null) {
            return;
        }
        view.setAlpha(f9);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f9));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f9));
        if (f9 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private void setAdditionalTranslationY(float f9) {
        if (this.v != f9) {
            this.f33097x = true;
            super.setTranslationY(this.f33096w + f9);
            this.f33097x = false;
            this.v = f9;
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        float f11;
        int i11 = 0;
        boolean z10 = false;
        if (i10 == 0) {
            d(this, f9);
            if (f9 >= 0.99f) {
                z10 = true;
            }
            setClickable(z10);
            if (this.h) {
                f11 = 64.0f;
            } else {
                f11 = 40.0f;
            }
            setAdditionalTranslationY((1.0f - f9) * AndroidUtilities.dp(f11));
        } else if (i10 == 1) {
            d(this.d, f9);
            float f12 = 1.0f - f9;
            d(this.f33090c, f12);
            ArrayList arrayList = this.f33092f;
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
        if (this.f33092f == null) {
            this.f33092f = new ArrayList();
        }
        this.f33092f.add(view);
        d(view, 1.0f - this.f33089b.f49505e);
    }

    @Override
    public final void draw(Canvas canvas) {
        ng.f fVar = this.f33094r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f33088a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f33089b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        aj0 aj0Var = this.f33090c;
        org.telegram.ui.ActionBar.c6 c6Var = this.f33091e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.f23385v8;
            aj0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            this.f33093n.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            this.f33095s.b();
            this.f33094r.u();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.g6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.O9;
        aj0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var)));
    }

    public boolean getButtonVisible() {
        return this.f33088a.f49506f;
    }

    public boolean getProgressVisible() {
        return this.f33089b.f49506f;
    }

    @Override
    public float getTranslationY() {
        if (this.f33097x) {
            return super.getTranslationY();
        }
        return this.f33096w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ng.f fVar = this.f33094r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f33090c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f9) {
        if (this.f33096w != f9) {
            this.f33097x = true;
            super.setTranslationY(this.v + f9);
            this.f33097x = false;
            this.f33096w = f9;
        }
    }

    public u10(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        jr jrVar = jr.h;
        this.f33088a = new vd.a(0, this, jrVar, 380L, true);
        this.f33089b = new vd.a(1, this, jrVar, 380L, false);
        this.f33091e = c6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f33090c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, i7.f6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, i7.f6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        i7.h6.a(this);
        if (!z10) {
            setOutlineProvider(jf.q0.f11668a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            nh.f fVar = new nh.f(org.telegram.ui.ActionBar.g6.f23133h5, null);
            this.f33095s = fVar;
            qg.c cVar = new qg.c();
            this.f33093n = cVar;
            ng.f fVar2 = new ng.f(cVar);
            this.f33094r = fVar2;
            fVar2.n(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            ng.c cVar2 = fVar2.h;
            cVar2.f17332i = dpf2;
            cVar2.f17333j = dpf22;
            fVar2.p(AndroidUtilities.dp(18.0f));
            fVar2.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
