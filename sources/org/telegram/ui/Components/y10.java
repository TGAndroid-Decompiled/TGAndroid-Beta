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
public final class y10 extends FrameLayout implements le.d {
    public final le.b f32811a;
    public final le.b f32812b;
    public final aj0 f32813c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.f6 f32814e;
    public ArrayList f32815f;
    public final boolean h;
    public final gh.c f32816n;
    public final dh.f f32817r;
    public final di.f f32818s;
    public float v;
    public float f32819w;
    public boolean f32820x;

    public y10(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.x5.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.x5.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
            this.f32820x = true;
            super.setTranslationY(this.f32819w + f7);
            this.f32820x = false;
            this.v = f7;
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
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
            d(this.f32813c, f12);
            ArrayList arrayList = this.f32815f;
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
        if (this.f32815f == null) {
            this.f32815f = new ArrayList();
        }
        this.f32815f.add(view);
        d(view, 1.0f - this.f32812b.f15368e);
    }

    @Override
    public final void draw(Canvas canvas) {
        dh.f fVar = this.f32817r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f32811a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f32812b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        aj0 aj0Var = this.f32813c;
        org.telegram.ui.ActionBar.f6 f6Var = this.f32814e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.f20993v8;
            aj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            this.f32816n.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
            this.f32818s.b();
            this.f32817r.u();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20754i6, f6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.j6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.O9;
        aj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var)));
    }

    public boolean getButtonVisible() {
        return this.f32811a.f15369f;
    }

    public boolean getProgressVisible() {
        return this.f32812b.f15369f;
    }

    @Override
    public float getTranslationY() {
        if (this.f32820x) {
            return super.getTranslationY();
        }
        return this.f32819w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dh.f fVar = this.f32817r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f32813c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f32819w != f7) {
            this.f32820x = true;
            super.setTranslationY(this.v + f7);
            this.f32820x = false;
            this.f32819w = f7;
        }
    }

    public y10(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        pr prVar = pr.h;
        this.f32811a = new le.b(0, this, prVar, 380L, true);
        this.f32812b = new le.b(1, this, prVar, 380L, false);
        this.f32814e = f6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f32813c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.x5.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.z5.a(this);
        if (!z10) {
            setOutlineProvider(yf.j0.f50113a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            di.f fVar = new di.f(org.telegram.ui.ActionBar.j6.f20735h5, null);
            this.f32818s = fVar;
            gh.c cVar = new gh.c();
            this.f32816n = cVar;
            dh.f fVar2 = new dh.f(cVar);
            this.f32817r = fVar2;
            fVar2.n(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            dh.c cVar2 = fVar2.h;
            cVar2.f6824i = dpf2;
            cVar2.f6825j = dpf22;
            fVar2.p(AndroidUtilities.dp(18.0f));
            fVar2.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
