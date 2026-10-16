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
public final class l20 extends FrameLayout implements ne.d {
    public final ne.b f26583a;
    public final ne.b f26584b;
    public final bk0 f26585c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.c6 e;
    public ArrayList f26586f;
    public final boolean h;
    public final gh.c f26587n;
    public final dh.f f26588r;
    public final di.f f26589s;
    public float v;
    public float f26590w;
    public boolean f26591x;

    public l20(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.z5.a(48.0f, 20.0f, 0.0f, 20.0f, 14.0f, 48, i10 | 80);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.z5.a(48.0f, 20.0f, 0.0f, 20.0f, 14.0f, 48, i10 | 80);
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
            this.f26591x = true;
            super.setTranslationY(this.f26590w + f7);
            this.f26591x = false;
            this.v = f7;
        }
    }

    public final void a(View view) {
        if (this.f26586f == null) {
            this.f26586f = new ArrayList();
        }
        this.f26586f.add(view);
        d(view, 1.0f - this.f26584b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        dh.f fVar = this.f26588r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f26583a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f26584b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        bk0 bk0Var = this.f26585c;
        org.telegram.ui.ActionBar.c6 c6Var = this.e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.f19935v8;
            bk0Var.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
            this.f26587n.a(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            this.f26589s.b();
            this.f26588r.v();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.g6.X(dp, w02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.O9;
        bk0Var.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        setBackground(org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Qh, c6Var)));
    }

    public boolean getButtonVisible() {
        return this.f26583a.f16004f;
    }

    public boolean getProgressVisible() {
        return this.f26584b.f16004f;
    }

    @Override
    public float getTranslationY() {
        if (this.f26591x) {
            return super.getTranslationY();
        }
        return this.f26590w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dh.f fVar = this.f26588r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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
            d(this.f26585c, f12);
            ArrayList arrayList = this.f26586f;
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

    public void setImageResource(int i10) {
        this.f26585c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f26590w != f7) {
            this.f26591x = true;
            super.setTranslationY(this.v + f7);
            this.f26591x = false;
            this.f26590w = f7;
        }
    }

    public l20(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        es esVar = es.h;
        this.f26583a = new ne.b(0, this, esVar, 380L, true);
        this.f26584b = new ne.b(1, this, esVar, 380L, false);
        this.e = c6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f26585c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.d(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.z5.d(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.b6.a(this);
        if (!z10) {
            setOutlineProvider(zf.j0.f50192a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            di.f fVar = new di.f(org.telegram.ui.ActionBar.g6.f19672h5, null);
            this.f26589s = fVar;
            gh.c cVar = new gh.c();
            this.f26587n = cVar;
            dh.f fVar2 = new dh.f(cVar);
            this.f26588r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            dh.c cVar2 = fVar2.f6561j;
            cVar2.f6548i = dpf2;
            cVar2.f6549j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
