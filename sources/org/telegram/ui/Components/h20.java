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
public final class h20 extends FrameLayout implements ne.d {
    public final ne.b f26718a;
    public final ne.b f26719b;
    public final yj0 f26720c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.d6 e;
    public ArrayList f26721f;
    public final boolean h;
    public final gh.c f26722n;
    public final dh.f f26723r;
    public final ei.f f26724s;
    public float v;
    public float f26725w;
    public boolean f26726x;

    public h20(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
            this.f26726x = true;
            super.setTranslationY(this.f26725w + f7);
            this.f26726x = false;
            this.v = f7;
        }
    }

    public final void a(View view) {
        if (this.f26721f == null) {
            this.f26721f = new ArrayList();
        }
        this.f26721f.add(view);
        d(view, 1.0f - this.f26719b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        dh.f fVar = this.f26723r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f26718a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f26719b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        yj0 yj0Var = this.f26720c;
        org.telegram.ui.ActionBar.d6 d6Var = this.e;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.h6.f21328v8;
            yj0Var.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
            this.f26722n.a(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
            this.f26724s.b();
            this.f26723r.v();
            invalidate();
            int dp = AndroidUtilities.dp(18.0f);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, d6Var);
            int dp2 = AndroidUtilities.dp(6.0f);
            setBackground(org.telegram.ui.ActionBar.h6.X(dp, w02, dp2, dp2, dp2, dp2));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.h6.O9;
        yj0Var.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Qh, d6Var)));
    }

    public boolean getButtonVisible() {
        return this.f26718a.f17384f;
    }

    public boolean getProgressVisible() {
        return this.f26719b.f17384f;
    }

    @Override
    public float getTranslationY() {
        if (this.f26726x) {
            return super.getTranslationY();
        }
        return this.f26725w;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dh.f fVar = this.f26723r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
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
            d(this.f26720c, f12);
            ArrayList arrayList = this.f26721f;
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
        this.f26720c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.f26725w != f7) {
            this.f26726x = true;
            super.setTranslationY(this.v + f7);
            this.f26726x = false;
            this.f26725w = f7;
        }
    }

    public h20(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        bs bsVar = bs.h;
        this.f26718a = new ne.b(0, this, bsVar, 380L, true);
        this.f26719b = new ne.b(1, this, bsVar, 380L, false);
        this.e = d6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f26720c = imageView;
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
            setOutlineProvider(zf.j0.f51584a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ei.f fVar = new ei.f(org.telegram.ui.ActionBar.h6.f21064h5, null);
            this.f26724s = fVar;
            gh.c cVar = new gh.c();
            this.f26722n = cVar;
            dh.f fVar2 = new dh.f(cVar);
            this.f26723r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            dh.c cVar2 = fVar2.f8014j;
            cVar2.f8001i = dpf2;
            cVar2.f8002j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
