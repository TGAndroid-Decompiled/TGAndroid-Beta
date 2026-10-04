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
public final class c20 extends FrameLayout implements le.d {
    public final le.b f25162a;
    public final le.b f25163b;
    public final nj0 f25164c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.d6 f25165e;
    public ArrayList f25166f;
    public final boolean h;
    public final fh.c f25167n;
    public final ch.f f25168r;
    public final ci.f f25169s;
    public float v;
    public float f25170w;
    public boolean f25171x;

    public c20(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.z5.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.z5.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
            this.f25171x = true;
            super.setTranslationY(this.f25170w + f7);
            this.f25171x = false;
            this.v = f7;
        }
    }

    public final void a(View view) {
        if (this.f25166f == null) {
            this.f25166f = new ArrayList();
        }
        this.f25166f.add(view);
        d(view, 1.0f - this.f25163b.f15434e);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
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
            d(this.f25164c, f12);
            ArrayList arrayList = this.f25166f;
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
    public final void draw(Canvas canvas) {
        ch.f fVar = this.f25168r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f25162a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f25163b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        nj0 nj0Var = this.f25164c;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25165e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.i6.f21154v8;
            nj0Var.setColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
            this.f25167n.a(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20817d6, false));
            this.f25169s.d();
            this.f25168r.k();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, d6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.i6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.i6.O9;
        nj0Var.setColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        setBackground(org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Qh, d6Var)));
    }

    public boolean getButtonVisible() {
        return this.f25162a.f15435f;
    }

    public boolean getProgressVisible() {
        return this.f25163b.f15435f;
    }

    @Override
    public float getTranslationY() {
        if (this.f25171x) {
            return super.getTranslationY();
        }
        return this.f25170w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ch.f fVar = this.f25168r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f25164c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f25170w != f7) {
            this.f25171x = true;
            super.setTranslationY(this.v + f7);
            this.f25171x = false;
            this.f25170w = f7;
        }
    }

    public c20(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        tr trVar = tr.h;
        this.f25162a = new le.b(0, this, trVar, 380L, true);
        this.f25163b = new le.b(1, this, trVar, 380L, false);
        this.f25165e = d6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f25164c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.z5.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.b6.a(this);
        if (!z10) {
            setOutlineProvider(yf.f0.f50979a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ci.f fVar = new ci.f(org.telegram.ui.ActionBar.i6.f20889h5, null);
            this.f25169s = fVar;
            fh.c cVar = new fh.c();
            this.f25167n = cVar;
            ch.f fVar2 = new ch.f(cVar);
            this.f25168r = fVar2;
            fVar2.x(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            ch.c cVar2 = fVar2.f4632l;
            cVar2.f4619i = dpf2;
            cVar2.f4620j = dpf22;
            fVar2.z(AndroidUtilities.dp(18.0f));
            fVar2.y(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
