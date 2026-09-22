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
    public final le.b f30482a;
    public final le.b f30483b;
    public final nj0 f30484c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.f6 e;
    public ArrayList f30485f;
    public final boolean h;
    public final fh.c f30486n;
    public final ch.f f30487r;
    public final ci.f f30488s;
    public float v;
    public float f30489w;
    public boolean f30490x;

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
            this.f30490x = true;
            super.setTranslationY(this.f30489w + f7);
            this.f30490x = false;
            this.v = f7;
        }
    }

    @Override
    public final void H(int i10, float f7, float f10, le.e eVar) {
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
            d(this.f30484c, f12);
            ArrayList arrayList = this.f30485f;
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
        if (this.f30485f == null) {
            this.f30485f = new ArrayList();
        }
        this.f30485f.add(view);
        d(view, 1.0f - this.f30483b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        ch.f fVar = this.f30487r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f30482a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f30483b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        nj0 nj0Var = this.f30484c;
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.f19442v8;
            nj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            this.f30486n.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
            this.f30488s.c();
            this.f30487r.v();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19199i6, f6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.j6.W(dp, v02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.j6.O9;
        nj0Var.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var)));
    }

    public boolean getButtonVisible() {
        return this.f30482a.f14185f;
    }

    public boolean getProgressVisible() {
        return this.f30483b.f14185f;
    }

    @Override
    public float getTranslationY() {
        if (this.f30490x) {
            return super.getTranslationY();
        }
        return this.f30489w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ch.f fVar = this.f30487r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f30484c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f30489w != f7) {
            this.f30490x = true;
            super.setTranslationY(this.v + f7);
            this.f30490x = false;
            this.f30489w = f7;
        }
    }

    public y10(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        qr qrVar = qr.h;
        this.f30482a = new le.b(0, this, qrVar, 380L, true);
        this.f30483b = new le.b(1, this, qrVar, 380L, false);
        this.e = f6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f30484c = imageView;
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
            setOutlineProvider(yf.j0.f47161a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ci.f fVar = new ci.f(org.telegram.ui.ActionBar.j6.f19180h5, null);
            this.f30488s = fVar;
            fh.c cVar = new fh.c();
            this.f30486n = cVar;
            ch.f fVar2 = new ch.f(cVar);
            this.f30487r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            ch.c cVar2 = fVar2.f4287j;
            cVar2.f4274i = dpf2;
            cVar2.f4275j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
