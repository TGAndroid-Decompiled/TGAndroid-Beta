package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
public final class t00 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final te.a f39465a;
    public final te.a f39466b;
    public final fh0 f39467c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.e6 f39468e;
    public ArrayList f39469f;
    public final boolean h;
    public final ui.c f39470n;
    public final fh.g f39471r;
    public final hi.f f39472s;
    public org.telegram.ui.Cells.y f39473w;
    public int f39474x;
    public boolean f39475y;

    public t00(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i7;
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        return c8.ja.d(48, 48.0f, i7 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i7;
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        return c8.ja.d(48, 48.0f, i7 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
    public final void G(int i7, float f10, float f11, te.c cVar) {
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
            d(this.f39467c, f13);
            ArrayList arrayList = this.f39469f;
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
        if (this.f39469f == null) {
            this.f39469f = new ArrayList();
        }
        this.f39469f.add(view);
        d(view, 1.0f - this.f39466b.f57081e);
    }

    @Override
    public final void draw(Canvas canvas) {
        fh.g gVar = this.f39471r;
        if (gVar != null) {
            gVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f39465a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f39466b.a(z10, z11);
    }

    public boolean getButtonVisible() {
        return this.f39465a.f57082f;
    }

    public boolean getProgressVisible() {
        return this.f39466b.f57082f;
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
        fh.g gVar = this.f39471r;
        if (gVar != null) {
            gVar.setBounds(0, 0, i7, i10);
        }
    }

    public void setImageResource(int i7) {
        this.f39467c.setImageResource(i7);
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
        fh0 fh0Var = this.f39467c;
        if (fh0Var != null && (radialProgressView = this.d) != null) {
            if (this.f39473w != null && getBackground() == this.f39473w) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.h;
            org.telegram.ui.ActionBar.e6 e6Var = this.f39468e;
            if (z11) {
                int i7 = org.telegram.ui.ActionBar.j6.f29186v8;
                int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
                if (w02 != this.f39474x || !this.f39475y) {
                    this.f39474x = w02;
                    this.f39475y = true;
                    fh0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
                ui.c cVar = this.f39470n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                }
                hi.f fVar = this.f39472s;
                if (fVar != null) {
                    fVar.d();
                }
                fh.g gVar = this.f39471r;
                if (gVar != null) {
                    gVar.updateColors();
                }
                invalidate();
                int L = org.telegram.messenger.g0.L(18.0f);
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var);
                if (z10) {
                    if (w03 != this.F) {
                        this.F = w03;
                        org.telegram.ui.ActionBar.j6.H1(this.f39473w, w03, true);
                        return;
                    }
                    return;
                }
                this.F = w03;
                int L2 = org.telegram.messenger.g0.L(6.0f);
                org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.j6.Y(L, w03, L2, L2, L2, L2);
                this.f39473w = Y;
                setBackground(Y);
                return;
            }
            int i10 = org.telegram.ui.ActionBar.j6.O9;
            int w04 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
            if (w04 != this.f39474x || !this.f39475y) {
                this.f39474x = w04;
                this.f39475y = true;
                fh0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            int w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var);
            int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Hi, e6Var);
            if (z10) {
                if (w05 != this.E || w06 != this.F) {
                    this.E = w05;
                    this.F = w06;
                    org.telegram.ui.ActionBar.j6.H1(this.f39473w, w05, false);
                    org.telegram.ui.ActionBar.j6.H1(this.f39473w, w06, true);
                    this.f39473w.invalidateSelf();
                    return;
                }
                return;
            }
            this.E = w05;
            this.F = w06;
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(48.0f), w05, w06);
            this.f39473w = j02;
            setBackground(j02);
        }
    }

    public t00(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        er erVar = er.h;
        this.f39465a = new te.a(0, this, erVar, 380L, true);
        this.f39466b = new te.a(1, this, erVar, 380L, false);
        this.f39468e = e6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f39467c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ja.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, c8.ja.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        c8.na.a(this);
        if (!z10) {
            setOutlineProvider(bg.t0.f3332a);
            setTranslationZ(org.telegram.messenger.g0.N(0.5f));
        }
        if (z10) {
            hi.f fVar = new hi.f(org.telegram.ui.ActionBar.j6.f28922h5, null);
            this.f39472s = fVar;
            ui.c cVar = new ui.c();
            this.f39470n = cVar;
            fh.g gVar = new fh.g(cVar, cVar, cVar);
            this.f39471r = gVar;
            gVar.p(fVar);
            float N = org.telegram.messenger.g0.N(0.4f);
            float N2 = org.telegram.messenger.g0.N(0.4f);
            fh.f fVar2 = gVar.R;
            fVar2.f11325i = N;
            fVar2.f11326j = N2;
            gVar.P = null;
            org.telegram.messenger.i20.r(gVar, org.telegram.messenger.g0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
