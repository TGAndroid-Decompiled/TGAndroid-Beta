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
public final class a20 extends FrameLayout implements xd.b {
    public final xd.a f25130a;
    public final xd.a f25131b;
    public final kj0 f25132c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.g6 f25133e;
    public ArrayList f25134f;
    public final boolean h;
    public final tg.c f25135n;
    public final qg.d f25136r;
    public final z10 f25137s;
    public float v;
    public float f25138w;
    public boolean f25139x;

    public a20(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return k7.c6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return k7.c6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
            this.f25139x = true;
            super.setTranslationY(this.f25138w + f10);
            this.f25139x = false;
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
            d(this.f25132c, f13);
            ArrayList arrayList = this.f25134f;
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
        if (this.f25134f == null) {
            this.f25134f = new ArrayList();
        }
        this.f25134f.add(view);
        d(view, 1.0f - this.f25131b.f50541e);
    }

    @Override
    public final void draw(Canvas canvas) {
        qg.d dVar = this.f25136r;
        if (dVar != null) {
            dVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z4, boolean z10) {
        this.f25130a.a(z4, z10);
    }

    public final void f(boolean z4, boolean z10) {
        this.f25131b.a(z4, z10);
    }

    public final void g() {
        boolean z4 = this.h;
        RadialProgressView radialProgressView = this.d;
        kj0 kj0Var = this.f25132c;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25133e;
        if (z4) {
            int i10 = org.telegram.ui.ActionBar.k6.f21983v8;
            kj0Var.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            this.f25135n.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
            this.f25137s.b();
            this.f25136r.u();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.k6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.k6.O9;
        kj0Var.setColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Qh, g6Var)));
    }

    public boolean getButtonVisible() {
        return this.f25130a.f50542f;
    }

    public boolean getProgressVisible() {
        return this.f25131b.f50542f;
    }

    @Override
    public float getTranslationY() {
        if (this.f25139x) {
            return super.getTranslationY();
        }
        return this.f25138w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        qg.d dVar = this.f25136r;
        if (dVar != null) {
            dVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f25132c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f10) {
        if (this.f25138w != f10) {
            this.f25139x = true;
            super.setTranslationY(this.v + f10);
            this.f25139x = false;
            this.f25138w = f10;
        }
    }

    public a20(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        pr prVar = pr.h;
        this.f25130a = new xd.a(0, this, prVar, 380L, true);
        this.f25131b = new xd.a(1, this, prVar, 380L, false);
        this.f25133e = g6Var;
        this.h = z4;
        ?? imageView = new ImageView(context);
        this.f25132c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.c6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, k7.c6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        k7.e6.a(this);
        if (!z4) {
            setOutlineProvider(lf.q0.f12504a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z4) {
            z10 z10Var = new z10(org.telegram.ui.ActionBar.k6.f21733h5, null);
            this.f25137s = z10Var;
            tg.c cVar = new tg.c();
            this.f25135n = cVar;
            qg.d dVar = new qg.d(cVar);
            this.f25136r = dVar;
            dVar.n(z10Var);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            qg.a aVar = dVar.h;
            aVar.f44873i = dpf2;
            aVar.f44874j = dpf22;
            dVar.p(AndroidUtilities.dp(18.0f));
            dVar.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
