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
public final class j10 extends FrameLayout implements td.b {
    public final td.a f29577a;
    public final td.a f29578b;
    public final pi0 f29579c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.b6 f29580e;
    public ArrayList f29581f;
    public final boolean h;
    public final ng.c f29582n;
    public final kg.f f29583r;
    public final kh.f f29584s;
    public float v;
    public float f29585w;
    public boolean f29586x;

    public j10(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, b6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i9;
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        return g7.e6.d(48, 48.0f, i9 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i9;
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        return g7.e6.d(48, 48.0f, i9 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        int i9;
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        if (f10 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view.setVisibility(i9);
    }

    private void setAdditionalTranslationY(float f10) {
        if (this.v != f10) {
            this.f29586x = true;
            super.setTranslationY(this.f29585w + f10);
            this.f29586x = false;
            this.v = f10;
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        float f12;
        int i10 = 0;
        boolean z10 = false;
        if (i9 == 0) {
            d(this, f10);
            if (f10 >= 0.99f) {
                z10 = true;
            }
            setClickable(z10);
            if (this.h) {
                f12 = 64.0f;
            } else {
                f12 = 40.0f;
            }
            setAdditionalTranslationY((1.0f - f10) * AndroidUtilities.dp(f12));
        } else if (i9 == 1) {
            d(this.d, f10);
            float f13 = 1.0f - f10;
            d(this.f29579c, f13);
            ArrayList arrayList = this.f29581f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    d((View) obj, f13);
                }
            }
        }
    }

    public final void a(View view) {
        if (this.f29581f == null) {
            this.f29581f = new ArrayList();
        }
        this.f29581f.add(view);
        d(view, 1.0f - this.f29578b.f47775e);
    }

    @Override
    public final void draw(Canvas canvas) {
        kg.f fVar = this.f29583r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f29577a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f29578b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        pi0 pi0Var = this.f29579c;
        org.telegram.ui.ActionBar.b6 b6Var = this.f29580e;
        if (z10) {
            int i9 = org.telegram.ui.ActionBar.f6.f23321v8;
            pi0Var.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            this.f29582n.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            this.f29584s.b();
            this.f29583r.u();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.f6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i10 = org.telegram.ui.ActionBar.f6.O9;
        pi0Var.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var)));
    }

    public boolean getButtonVisible() {
        return this.f29577a.f47776f;
    }

    public boolean getProgressVisible() {
        return this.f29578b.f47776f;
    }

    @Override
    public float getTranslationY() {
        if (this.f29586x) {
            return super.getTranslationY();
        }
        return this.f29585w;
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        kg.f fVar = this.f29583r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i9, i10);
        }
    }

    public void setImageResource(int i9) {
        this.f29579c.setImageResource(i9);
    }

    @Override
    public void setTranslationY(float f10) {
        if (this.f29585w != f10) {
            this.f29586x = true;
            super.setTranslationY(this.v + f10);
            this.f29586x = false;
            this.f29585w = f10;
        }
    }

    public j10(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        gr grVar = gr.h;
        this.f29577a = new td.a(0, this, grVar, 380L, true);
        this.f29578b = new td.a(1, this, grVar, 380L, false);
        this.f29580e = b6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f29579c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, g7.e6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, g7.e6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        g7.g6.a(this);
        if (!z10) {
            setOutlineProvider(ff.r0.f6254a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            kh.f fVar = new kh.f(org.telegram.ui.ActionBar.f6.f23072h5, null);
            this.f29584s = fVar;
            ng.c cVar = new ng.c();
            this.f29582n = cVar;
            kg.f fVar2 = new kg.f(cVar);
            this.f29583r = fVar2;
            fVar2.n(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            kg.c cVar2 = fVar2.h;
            cVar2.f14808i = dpf2;
            cVar2.f14809j = dpf22;
            fVar2.p(AndroidUtilities.dp(18.0f));
            fVar2.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
