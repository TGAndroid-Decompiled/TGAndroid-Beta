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
    public final oe.b f29482a;
    public final oe.b f29483b;
    public final bk0 f29484c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.u6 e;
    public ArrayList f29485f;
    public final boolean h;
    public final hh.c f29486n;
    public final eh.f f29487r;
    public final fi.f f29488s;
    public org.telegram.ui.Cells.y v;
    public int f29489w;
    public boolean f29490x;
    public int f29491y;

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
        return kb1.h(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return kb1.h(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
            d(this.f29484c, f12);
            ArrayList arrayList = this.f29485f;
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
        if (this.f29485f == null) {
            this.f29485f = new ArrayList();
        }
        this.f29485f.add(view);
        d(view, 1.0f - this.f29483b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        eh.f fVar = this.f29487r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f29482a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f29483b.a(z10, z11);
    }

    public boolean getButtonVisible() {
        return this.f29482a.f19326f;
    }

    public boolean getProgressVisible() {
        return this.f29483b.f19326f;
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
        eh.f fVar = this.f29487r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f29484c.setImageResource(i10);
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
        bk0 bk0Var = this.f29484c;
        if (bk0Var != null && (radialProgressView = this.d) != null) {
            if (this.v != null && getBackground() == this.v) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.h;
            org.telegram.ui.ActionBar.u6 u6Var = this.e;
            if (z11) {
                int i10 = org.telegram.ui.ActionBar.y6.f23695v8;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
                if (w02 != this.f29489w || !this.f29490x) {
                    this.f29489w = w02;
                    this.f29490x = true;
                    bk0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                hh.c cVar = this.f29486n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
                }
                fi.f fVar = this.f29488s;
                if (fVar != null) {
                    fVar.c();
                }
                eh.f fVar2 = this.f29487r;
                if (fVar2 != null) {
                    fVar2.updateColors();
                }
                invalidate();
                int dp = AndroidUtilities.dp(18.0f);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, u6Var);
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
            if (w04 != this.f29489w || !this.f29490x) {
                this.f29489w = w04;
                this.f29490x = true;
                bk0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            int w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
            int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Qh, u6Var);
            if (z10) {
                if (w05 != this.f29491y || w06 != this.E) {
                    this.f29491y = w05;
                    this.E = w06;
                    org.telegram.ui.ActionBar.y6.E1(this.v, w05, false);
                    org.telegram.ui.ActionBar.y6.E1(this.v, w06, true);
                    this.v.invalidateSelf();
                    return;
                }
                return;
            }
            this.f29491y = w05;
            this.E = w06;
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(48.0f), w05, w06);
            this.v = i02;
            setBackground(i02);
        }
    }

    public j20(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        ds dsVar = ds.h;
        this.f29482a = new oe.b(0, this, dsVar, 380L, true);
        this.f29483b = new oe.b(1, this, dsVar, 380L, false);
        this.e = u6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f29484c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, kb1.g(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, kb1.g(-1.0f, -1));
        d(radialProgressView, 0.0f);
        kb1.b(this);
        if (!z10) {
            setOutlineProvider(ag.z0.f1400a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            fi.f fVar = new fi.f(org.telegram.ui.ActionBar.y6.f23428h5, null);
            this.f29488s = fVar;
            hh.c cVar = new hh.c();
            this.f29486n = cVar;
            eh.f fVar2 = new eh.f(cVar);
            this.f29487r = fVar2;
            fVar2.v(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            eh.c cVar2 = fVar2.f9965x;
            cVar2.f9953i = dpf2;
            cVar2.f9954j = dpf22;
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
