package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class f20 extends FrameLayout implements ne.d, org.telegram.ui.ActionBar.b6 {
    public int E;
    public float F;
    public float G;
    public boolean H;
    public final ne.b f26168a;
    public final ne.b f26169b;
    public final ak0 f26170c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.g6 e;
    public ArrayList f26171f;
    public final boolean h;
    public final gh.c f26172n;
    public final dh.f f26173r;
    public final ei.f f26174s;
    public org.telegram.ui.Cells.y v;
    public int f26175w;
    public boolean f26176x;
    public int f26177y;

    public f20(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var, false);
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
        if (this.F != f7) {
            this.H = true;
            super.setTranslationY(this.G + f7);
            this.H = false;
            this.F = f7;
        }
    }

    public final void a(View view) {
        if (this.f26171f == null) {
            this.f26171f = new ArrayList();
        }
        this.f26171f.add(view);
        d(view, 1.0f - this.f26169b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        dh.f fVar = this.f26173r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f26168a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f26169b.a(z10, z11);
    }

    public boolean getButtonVisible() {
        return this.f26168a.f17447f;
    }

    public boolean getProgressVisible() {
        return this.f26169b.f17447f;
    }

    @Override
    public float getTranslationY() {
        if (this.H) {
            return super.getTranslationY();
        }
        return this.G;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
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
            d(this.f26170c, f12);
            ArrayList arrayList = this.f26171f;
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
        dh.f fVar = this.f26173r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f26170c.setImageResource(i10);
    }

    @Override
    public void setTranslationY(float f7) {
        if (this.G != f7) {
            this.H = true;
            super.setTranslationY(this.F + f7);
            this.H = false;
            this.G = f7;
        }
    }

    @Override
    public final void updateColors() {
        RadialProgressView radialProgressView;
        boolean z10;
        ak0 ak0Var = this.f26170c;
        if (ak0Var != null && (radialProgressView = this.d) != null) {
            if (this.v != null && getBackground() == this.v) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.h;
            org.telegram.ui.ActionBar.g6 g6Var = this.e;
            if (z11) {
                int i10 = org.telegram.ui.ActionBar.k6.f21519v8;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                if (w02 != this.f26175w || !this.f26176x) {
                    this.f26175w = w02;
                    this.f26176x = true;
                    ak0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                gh.c cVar = this.f26172n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
                }
                ei.f fVar = this.f26174s;
                if (fVar != null) {
                    fVar.c();
                }
                dh.f fVar2 = this.f26173r;
                if (fVar2 != null) {
                    fVar2.updateColors();
                }
                invalidate();
                int dp = AndroidUtilities.dp(18.0f);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var);
                if (z10) {
                    if (w03 != this.E) {
                        this.E = w03;
                        org.telegram.ui.ActionBar.k6.E1(this.v, w03, true);
                        return;
                    }
                    return;
                }
                this.E = w03;
                int dp2 = AndroidUtilities.dp(6.0f);
                org.telegram.ui.Cells.y X = org.telegram.ui.ActionBar.k6.X(dp, w03, dp2, dp2, dp2, dp2);
                this.v = X;
                setBackground(X);
                return;
            }
            int i11 = org.telegram.ui.ActionBar.k6.O9;
            int w04 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
            if (w04 != this.f26175w || !this.f26176x) {
                this.f26175w = w04;
                this.f26176x = true;
                ak0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
            int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
            int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qh, g6Var);
            if (z10) {
                if (w05 != this.f26177y || w06 != this.E) {
                    this.f26177y = w05;
                    this.E = w06;
                    org.telegram.ui.ActionBar.k6.E1(this.v, w05, false);
                    org.telegram.ui.ActionBar.k6.E1(this.v, w06, true);
                    this.v.invalidateSelf();
                    return;
                }
                return;
            }
            this.f26177y = w05;
            this.E = w06;
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(48.0f), w05, w06);
            this.v = i02;
            setBackground(i02);
        }
    }

    public f20(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        zr zrVar = zr.h;
        this.f26168a = new ne.b(0, this, zrVar, 380L, true);
        this.f26169b = new ne.b(1, this, zrVar, 380L, false);
        this.e = g6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f26170c = imageView;
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
            setOutlineProvider(zf.j0.f52046a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            ei.f fVar = new ei.f(org.telegram.ui.ActionBar.k6.f21255h5, null);
            this.f26174s = fVar;
            gh.c cVar = new gh.c();
            this.f26172n = cVar;
            dh.f fVar2 = new dh.f(cVar);
            this.f26173r = fVar2;
            fVar2.o(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            dh.c cVar2 = fVar2.v;
            cVar2.f8013i = dpf2;
            cVar2.f8014j = dpf22;
            fVar2.q(AndroidUtilities.dp(18.0f));
            fVar2.p(AndroidUtilities.dp(5.66f));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
