package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
public final class a10 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.c6 {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final te.a f33306a;
    public final te.a f33307b;
    public final qh0 f33308c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.i6 f33309e;
    public ArrayList f33310f;
    public final boolean h;
    public final ui.c f33311n;
    public final fh.g f33312r;
    public final hi.g f33313s;
    public org.telegram.ui.Cells.y f33314w;
    public int f33315x;
    public boolean f33316y;

    public a10(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i7;
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        return c8.na.d(48, 48.0f, i7 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i7;
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        return c8.na.d(48, 48.0f, i7 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        int i7;
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        view.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        view.setVisibility(i7);
    }

    private void setAdditionalTranslationY(float f10) {
        if (this.G != f10) {
            this.I = true;
            super.setTranslationY(this.H + f10);
            this.I = false;
            this.G = f10;
        }
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        float f12;
        int i10 = 0;
        boolean z10 = false;
        if (i7 == 0) {
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
            setAdditionalTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(f12));
        } else if (i7 == 1) {
            d(this.d, f10);
            float f13 = 1.0f - f10;
            d(this.f33308c, f13);
            ArrayList arrayList = this.f33310f;
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
        if (this.f33310f == null) {
            this.f33310f = new ArrayList();
        }
        this.f33310f.add(view);
        d(view, 1.0f - this.f33307b.f57779e);
    }

    @Override
    public final void draw(Canvas canvas) {
        fh.g gVar = this.f33312r;
        if (gVar != null) {
            gVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f33306a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f33307b.a(z10, z11);
    }

    public boolean getButtonVisible() {
        return this.f33306a.f57780f;
    }

    public boolean getProgressVisible() {
        return this.f33307b.f57780f;
    }

    @Override
    public float getTranslationY() {
        if (this.I) {
            return super.getTranslationY();
        }
        return this.H;
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        fh.g gVar = this.f33312r;
        if (gVar != null) {
            gVar.setBounds(0, 0, i7, i10);
        }
    }

    public void setImageResource(int i7) {
        this.f33308c.setImageResource(i7);
    }

    @Override
    public void setTranslationY(float f10) {
        if (this.H != f10) {
            this.I = true;
            super.setTranslationY(this.G + f10);
            this.I = false;
            this.H = f10;
        }
    }

    @Override
    public final void updateColors() {
        RadialProgressView radialProgressView;
        boolean z10;
        qh0 qh0Var = this.f33308c;
        if (qh0Var != null && (radialProgressView = this.d) != null) {
            if (this.f33314w != null && getBackground() == this.f33314w) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.h;
            org.telegram.ui.ActionBar.i6 i6Var = this.f33309e;
            if (z11) {
                int i7 = org.telegram.ui.ActionBar.n6.f29788v8;
                int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
                if (w02 != this.f33315x || !this.f33316y) {
                    this.f33315x = w02;
                    this.f33316y = true;
                    qh0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                ui.c cVar = this.f33311n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
                }
                hi.g gVar = this.f33313s;
                if (gVar != null) {
                    gVar.d();
                }
                fh.g gVar2 = this.f33312r;
                if (gVar2 != null) {
                    gVar2.updateColors();
                }
                invalidate();
                int L = org.telegram.messenger.g0.L(18.0f);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var);
                if (z10) {
                    if (w03 != this.F) {
                        this.F = w03;
                        org.telegram.ui.ActionBar.n6.H1(this.f33314w, w03, true);
                        return;
                    }
                    return;
                }
                this.F = w03;
                int L2 = org.telegram.messenger.g0.L(6.0f);
                org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.n6.Y(L, w03, L2, L2, L2, L2);
                this.f33314w = Y;
                setBackground(Y);
                return;
            }
            int i10 = org.telegram.ui.ActionBar.n6.O9;
            int w04 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
            if (w04 != this.f33315x || !this.f33316y) {
                this.f33315x = w04;
                this.f33316y = true;
                qh0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
            int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
            int w06 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Hi, i6Var);
            if (z10) {
                if (w05 != this.E || w06 != this.F) {
                    this.E = w05;
                    this.F = w06;
                    org.telegram.ui.ActionBar.n6.H1(this.f33314w, w05, false);
                    org.telegram.ui.ActionBar.n6.H1(this.f33314w, w06, true);
                    this.f33314w.invalidateSelf();
                    return;
                }
                return;
            }
            this.E = w05;
            this.F = w06;
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(48.0f), w05, w06);
            this.f33314w = j02;
            setBackground(j02);
        }
    }

    public a10(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        kr krVar = kr.h;
        this.f33306a = new te.a(0, this, krVar, 380L, true);
        this.f33307b = new te.a(1, this, krVar, 380L, false);
        this.f33309e = i6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f33308c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.na.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, c8.na.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        c8.sa.a(this);
        if (!z10) {
            setOutlineProvider(bg.u0.f3313a);
            setTranslationZ(org.telegram.messenger.g0.N(0.5f));
        }
        if (z10) {
            hi.g gVar = new hi.g(org.telegram.ui.ActionBar.n6.f29524h5, null);
            this.f33313s = gVar;
            ui.c cVar = new ui.c();
            this.f33311n = cVar;
            fh.g gVar2 = new fh.g(cVar, cVar, cVar);
            this.f33312r = gVar2;
            gVar2.p(gVar);
            float N = org.telegram.messenger.g0.N(0.4f);
            float N2 = org.telegram.messenger.g0.N(0.4f);
            fh.f fVar = gVar2.R;
            fVar.f11636i = N;
            fVar.f11637j = N2;
            gVar2.P = null;
            org.telegram.messenger.m10.s(gVar2, org.telegram.messenger.g0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
