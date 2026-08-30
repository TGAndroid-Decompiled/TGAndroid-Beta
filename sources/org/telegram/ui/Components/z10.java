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
public final class z10 extends FrameLayout implements xd.b {
    public final xd.a f31205a;
    public final xd.a f31206b;
    public final jj0 f31207c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.f6 e;
    public ArrayList f31208f;
    public final boolean h;
    public final sg.c f31209n;
    public final pg.d f31210r;
    public final y10 f31211s;
    public float v;
    public float f31212w;
    public boolean f31213x;

    public z10(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return k7.b6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return k7.b6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        int i10;
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private void setAdditionalTranslationY(float f10) {
        if (this.v != f10) {
            this.f31213x = true;
            super.setTranslationY(this.f31212w + f10);
            this.f31213x = false;
            this.v = f10;
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        float f12;
        int i11 = 0;
        boolean z4 = false;
        if (i10 == 0) {
            d(this, f10);
            if (f10 >= 0.99f) {
                z4 = true;
            }
            setClickable(z4);
            if (this.h) {
                f12 = 64.0f;
            } else {
                f12 = 40.0f;
            }
            setAdditionalTranslationY((1.0f - f10) * AndroidUtilities.dp(f12));
        } else if (i10 == 1) {
            d(this.d, f10);
            float f13 = 1.0f - f10;
            d(this.f31207c, f13);
            ArrayList arrayList = this.f31208f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    d((View) obj, f13);
                }
            }
        }
    }

    public final void a(View view) {
        if (this.f31208f == null) {
            this.f31208f = new ArrayList();
        }
        this.f31208f.add(view);
        d(view, 1.0f - this.f31206b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        pg.d dVar = this.f31210r;
        if (dVar != null) {
            dVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        this.f31205a.a(z4, z10);
    }

    public final void f(boolean z4, boolean z10) {
        this.f31206b.a(z4, z10);
    }

    public final void g() {
        boolean z4 = this.h;
        RadialProgressView radialProgressView = this.d;
        jj0 jj0Var = this.f31207c;
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        if (z4) {
            int i10 = org.telegram.ui.ActionBar.j6.f20227v8;
            jj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            this.f31209n.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            this.f31211s.b();
            this.f31210r.u();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.j6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.O9;
        jj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var)));
    }

    public boolean getButtonVisible() {
        return this.f31205a.f46893f;
    }

    public boolean getProgressVisible() {
        return this.f31206b.f46893f;
    }

    @Override
    public float getTranslationY() {
        if (this.f31213x) {
            return super.getTranslationY();
        }
        return this.f31212w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        pg.d dVar = this.f31210r;
        if (dVar != null) {
            dVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f31207c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f10) {
        if (this.f31212w != f10) {
            this.f31213x = true;
            super.setTranslationY(this.v + f10);
            this.f31213x = false;
            this.f31212w = f10;
        }
    }

    public z10(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        nr nrVar = nr.h;
        this.f31205a = new xd.a(0, this, nrVar, 380L, true);
        this.f31206b = new xd.a(1, this, nrVar, 380L, false);
        this.e = f6Var;
        this.h = z4;
        ?? imageView = new ImageView(context);
        this.f31207c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.b6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, k7.b6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        k7.d6.a(this);
        if (!z4) {
            setOutlineProvider(lf.q0.f12053a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z4) {
            y10 y10Var = new y10(org.telegram.ui.ActionBar.j6.f19977h5, null);
            this.f31211s = y10Var;
            sg.c cVar = new sg.c();
            this.f31209n = cVar;
            pg.d dVar = new pg.d(cVar);
            this.f31210r = dVar;
            dVar.n(y10Var);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            pg.a aVar = dVar.h;
            aVar.f41208i = dpf2;
            aVar.f41209j = dpf22;
            dVar.p(AndroidUtilities.dp(18.0f));
            dVar.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
