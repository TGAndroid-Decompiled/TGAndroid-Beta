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
public final class j20 extends FrameLayout implements oe.d, org.telegram.ui.ActionBar.p6 {
    public int E;
    public float F;
    public float G;
    public boolean H;
    public final oe.b f29455a;
    public final oe.b f29456b;
    public final ak0 f29457c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.u6 e;
    public ArrayList f29458f;
    public final boolean h;
    public final hh.c f29459n;
    public final eh.f f29460r;
    public final fi.f f29461s;
    public org.telegram.ui.Cells.y v;
    public int f29462w;
    public boolean f29463x;
    public int f29464y;

    public j20(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, u6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return gb1.h(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return gb1.h(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
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
            d(this.f29457c, f12);
            ArrayList arrayList = this.f29458f;
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
        if (this.f29458f == null) {
            this.f29458f = new ArrayList();
        }
        this.f29458f.add(view);
        d(view, 1.0f - this.f29456b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        eh.f fVar = this.f29460r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f29455a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f29456b.a(z10, z11);
    }

    public boolean getButtonVisible() {
        return this.f29455a.f19327f;
    }

    public boolean getProgressVisible() {
        return this.f29456b.f19327f;
    }

    @Override
    public float getTranslationY() {
        if (this.H) {
            return super.getTranslationY();
        }
        return this.G;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        eh.f fVar = this.f29460r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f29457c.setImageResource(i10);
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
        ak0 ak0Var = this.f29457c;
        if (ak0Var != null && (radialProgressView = this.d) != null) {
            if (this.v != null && getBackground() == this.v) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.h;
            org.telegram.ui.ActionBar.u6 u6Var = this.e;
            if (z11) {
                int i10 = org.telegram.ui.ActionBar.y6.f23694v8;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                if (w02 != this.f29462w || !this.f29463x) {
                    this.f29462w = w02;
                    this.f29463x = true;
                    ak0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                hh.c cVar = this.f29459n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false));
                }
                fi.f fVar = this.f29461s;
                if (fVar != null) {
                    fVar.c();
                }
                eh.f fVar2 = this.f29460r;
                if (fVar2 != null) {
                    fVar2.updateColors();
                }
                invalidate();
                int dp = AndroidUtilities.dp(18.0f);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i6, u6Var);
                if (z10) {
                    if (w03 != this.E) {
                        this.E = w03;
                        org.telegram.ui.ActionBar.y6.E1(this.v, w03, true);
                        return;
                    }
                    return;
                }
                this.E = w03;
                int dp2 = AndroidUtilities.dp(6.0f);
                org.telegram.ui.Cells.y X = org.telegram.ui.ActionBar.y6.X(dp, w03, dp2, dp2, dp2, dp2);
                this.v = X;
                setBackground(X);
                return;
            }
            int i11 = org.telegram.ui.ActionBar.y6.O9;
            int w04 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
            if (w04 != this.f29462w || !this.f29463x) {
                this.f29462w = w04;
                this.f29463x = true;
                ak0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
            int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Qh, u6Var);
            if (z10) {
                if (w05 != this.f29464y || w06 != this.E) {
                    this.f29464y = w05;
                    this.E = w06;
                    org.telegram.ui.ActionBar.y6.E1(this.v, w05, false);
                    org.telegram.ui.ActionBar.y6.E1(this.v, w06, true);
                    this.v.invalidateSelf();
                    return;
                }
                return;
            }
            this.f29464y = w05;
            this.E = w06;
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(48.0f), w05, w06);
            this.v = i02;
            setBackground(i02);
        }
    }

    public j20(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        ds dsVar = ds.h;
        this.f29455a = new oe.b(0, this, dsVar, 380L, true);
        this.f29456b = new oe.b(1, this, dsVar, 380L, false);
        this.e = u6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f29457c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, gb1.g(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, gb1.g(-1.0f, -1));
        d(radialProgressView, 0.0f);
        gb1.b(this);
        if (!z10) {
            setOutlineProvider(ag.z0.f1400a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            fi.f fVar = new fi.f(org.telegram.ui.ActionBar.y6.f23427h5, null);
            this.f29461s = fVar;
            hh.c cVar = new hh.c();
            this.f29459n = cVar;
            eh.f fVar2 = new eh.f(cVar);
            this.f29460r = fVar2;
            fVar2.v(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            eh.c cVar2 = fVar2.f9966x;
            cVar2.f9954i = dpf2;
            cVar2.f9955j = dpf22;
            fVar2.x(AndroidUtilities.dp(18.0f));
            fVar2.w(AndroidUtilities.dp(5.66f));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
