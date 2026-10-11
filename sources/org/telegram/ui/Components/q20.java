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
public final class q20 extends FrameLayout implements me.d {
    public final me.b f29957a;
    public final me.b f29958b;
    public final hk0 f29959c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.d6 f29960e;
    public ArrayList f29961f;
    public final boolean h;
    public final fh.c f29962n;
    public final ch.f f29963r;
    public final ci.f f29964s;
    public float v;
    public float f29965w;
    public boolean f29966x;

    public q20(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.x5.a(48.0f, 20.0f, 0.0f, 20.0f, 14.0f, 48, i10 | 80);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.x5.a(48.0f, 20.0f, 0.0f, 20.0f, 14.0f, 48, i10 | 80);
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
            this.f29966x = true;
            super.setTranslationY(this.f29965w + f7);
            this.f29966x = false;
            this.v = f7;
        }
    }

    public final void a(View view) {
        if (this.f29961f == null) {
            this.f29961f = new ArrayList();
        }
        this.f29961f.add(view);
        d(view, 1.0f - this.f29958b.f16365e);
    }

    @Override
    public final void draw(Canvas canvas) {
        ch.f fVar = this.f29963r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f29957a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f29958b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        hk0 hk0Var = this.f29959c;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29960e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.h6.f21120v8;
            hk0Var.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
            this.f29962n.a(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
            this.f29964s.b();
            this.f29963r.v();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.h6.X(dp, w02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.O9;
        hk0Var.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Qh, d6Var)));
    }

    public boolean getButtonVisible() {
        return this.f29957a.f16366f;
    }

    public boolean getProgressVisible() {
        return this.f29958b.f16366f;
    }

    @Override
    public float getTranslationY() {
        if (this.f29966x) {
            return super.getTranslationY();
        }
        return this.f29965w;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
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
            d(this.f29959c, f12);
            ArrayList arrayList = this.f29961f;
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

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ch.f fVar = this.f29963r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f29959c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f29965w != f7) {
            this.f29966x = true;
            super.setTranslationY(this.v + f7);
            this.f29966x = false;
            this.f29965w = f7;
        }
    }

    public q20(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        is isVar = is.h;
        this.f29957a = new me.b(0, this, isVar, 380L, true);
        this.f29958b = new me.b(1, this, isVar, 380L, false);
        this.f29960e = d6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f29959c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.d(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.x5.d(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.z5.a(this);
        if (!z10) {
            setOutlineProvider(yf.i0.f52258a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ci.f fVar = new ci.f(org.telegram.ui.ActionBar.h6.f20857h5, null);
            this.f29964s = fVar;
            fh.c cVar = new fh.c();
            this.f29962n = cVar;
            ch.f fVar2 = new ch.f(cVar);
            this.f29963r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            ch.c cVar2 = fVar2.f4684j;
            cVar2.f4670i = dpf2;
            cVar2.f4671j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
