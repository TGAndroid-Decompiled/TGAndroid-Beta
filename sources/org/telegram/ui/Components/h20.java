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
public final class h20 extends FrameLayout implements le.d {
    public final le.b f23494a;
    public final le.b f23495b;
    public final kj0 f23496c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.f6 e;
    public ArrayList f23497f;
    public final boolean h;
    public final eh.c f23498n;
    public final bh.f f23499r;
    public final bi.f f23500s;
    public float v;
    public float f23501w;
    public boolean f23502x;

    public h20(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.a6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.a6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
            this.f23502x = true;
            super.setTranslationY(this.f23501w + f7);
            this.f23502x = false;
            this.v = f7;
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
            d(this.f23496c, f12);
            ArrayList arrayList = this.f23497f;
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
        if (this.f23497f == null) {
            this.f23497f = new ArrayList();
        }
        this.f23497f.add(view);
        d(view, 1.0f - this.f23495b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        bh.f fVar = this.f23499r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f23494a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f23495b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        kj0 kj0Var = this.f23496c;
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.f18256v8;
            kj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            this.f23498n.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            this.f23500s.b();
            this.f23499r.u();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.j6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.O9;
        kj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var)));
    }

    public boolean getButtonVisible() {
        return this.f23494a.f12870f;
    }

    public boolean getProgressVisible() {
        return this.f23495b.f12870f;
    }

    @Override
    public float getTranslationY() {
        if (this.f23502x) {
            return super.getTranslationY();
        }
        return this.f23501w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        bh.f fVar = this.f23499r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f23496c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f23501w != f7) {
            this.f23502x = true;
            super.setTranslationY(this.v + f7);
            this.f23502x = false;
            this.f23501w = f7;
        }
    }

    public h20(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        wr wrVar = wr.h;
        this.f23494a = new le.b(0, this, wrVar, 380L, true);
        this.f23495b = new le.b(1, this, wrVar, 380L, false);
        this.e = f6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f23496c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.a6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.a6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.c6.a(this);
        if (!z10) {
            setOutlineProvider(xf.k0.f45156a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            bi.f fVar = new bi.f(org.telegram.ui.ActionBar.j6.f17998h5, null);
            this.f23500s = fVar;
            eh.c cVar = new eh.c();
            this.f23498n = cVar;
            bh.f fVar2 = new bh.f(cVar);
            this.f23499r = fVar2;
            fVar2.n(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            bh.c cVar2 = fVar2.h;
            cVar2.f2262i = dpf2;
            cVar2.f2263j = dpf22;
            fVar2.p(AndroidUtilities.dp(18.0f));
            fVar2.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
