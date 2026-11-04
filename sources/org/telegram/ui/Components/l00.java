package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
public final class l00 extends FrameLayout implements qe.b, org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final qe.a f35528a;
    public final qe.a f35529b;
    public final fh0 f35530c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.e6 f35531e;
    public ArrayList f35532f;
    public final boolean h;
    public final si.c f35533n;
    public final gh.g f35534r;
    public final gi.f f35535s;
    public org.telegram.ui.Cells.y f35536w;
    public int f35537x;
    public boolean f35538y;

    public l00(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i3;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        return b8.mf.d(48, 48.0f, i3 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i3;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        return b8.mf.d(48, 48.0f, i3 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        int i3;
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        view.setScaleY(org.telegram.messenger.g0.T1(0.4f, 1.0f, f10));
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view.setVisibility(i3);
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
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        float f12;
        int i10 = 0;
        boolean z10 = false;
        if (i3 == 0) {
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
        } else if (i3 == 1) {
            d(this.d, f10);
            float f13 = 1.0f - f10;
            d(this.f35530c, f13);
            ArrayList arrayList = this.f35532f;
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
        if (this.f35532f == null) {
            this.f35532f = new ArrayList();
        }
        this.f35532f.add(view);
        d(view, 1.0f - this.f35529b.f53840e);
    }

    @Override
    public final void draw(Canvas canvas) {
        gh.g gVar = this.f35534r;
        if (gVar != null) {
            gVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f35528a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f35529b.a(z10, z11);
    }

    public boolean getButtonVisible() {
        return this.f35528a.f53841f;
    }

    public boolean getProgressVisible() {
        return this.f35529b.f53841f;
    }

    @Override
    public float getTranslationY() {
        if (this.I) {
            return super.getTranslationY();
        }
        return this.H;
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        gh.g gVar = this.f35534r;
        if (gVar != null) {
            gVar.setBounds(0, 0, i3, i10);
        }
    }

    public void setImageResource(int i3) {
        this.f35530c.setImageResource(i3);
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
        fh0 fh0Var = this.f35530c;
        if (fh0Var != null && (radialProgressView = this.d) != null) {
            if (this.f35536w != null && getBackground() == this.f35536w) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.h;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35531e;
            if (z11) {
                int i3 = org.telegram.ui.ActionBar.k6.f28216v8;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
                if (w02 != this.f35537x || !this.f35538y) {
                    this.f35537x = w02;
                    this.f35538y = true;
                    fh0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                si.c cVar = this.f35533n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                }
                gi.f fVar = this.f35535s;
                if (fVar != null) {
                    fVar.d();
                }
                gh.g gVar = this.f35534r;
                if (gVar != null) {
                    gVar.updateColors();
                }
                invalidate();
                int L = org.telegram.messenger.g0.L(18.0f);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var);
                if (z10) {
                    if (w03 != this.F) {
                        this.F = w03;
                        org.telegram.ui.ActionBar.k6.H1(this.f35536w, w03, true);
                        return;
                    }
                    return;
                }
                this.F = w03;
                int L2 = org.telegram.messenger.g0.L(6.0f);
                org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.k6.Y(L, w03, L2, L2, L2, L2);
                this.f35536w = Y;
                setBackground(Y);
                return;
            }
            int i10 = org.telegram.ui.ActionBar.k6.O9;
            int w04 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            if (w04 != this.f35537x || !this.f35538y) {
                this.f35537x = w04;
                this.f35538y = true;
                fh0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
            int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ei, e6Var);
            if (z10) {
                if (w05 != this.E || w06 != this.F) {
                    this.E = w05;
                    this.F = w06;
                    org.telegram.ui.ActionBar.k6.H1(this.f35536w, w05, false);
                    org.telegram.ui.ActionBar.k6.H1(this.f35536w, w06, true);
                    this.f35536w.invalidateSelf();
                    return;
                }
                return;
            }
            this.E = w05;
            this.F = w06;
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(48.0f), w05, w06);
            this.f35536w = j02;
            setBackground(j02);
        }
    }

    public l00(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        xq xqVar = xq.h;
        this.f35528a = new qe.a(0, this, xqVar, 380L, true);
        this.f35529b = new qe.a(1, this, xqVar, 380L, false);
        this.f35531e = e6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f35530c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, b8.mf.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, b8.mf.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        b8.pf.a(this);
        if (!z10) {
            setOutlineProvider(cg.t0.f4745a);
            setTranslationZ(org.telegram.messenger.g0.N(0.5f));
        }
        if (z10) {
            gi.f fVar = new gi.f(org.telegram.ui.ActionBar.k6.f27954h5, null);
            this.f35535s = fVar;
            si.c cVar = new si.c();
            this.f35533n = cVar;
            gh.g gVar = new gh.g(cVar, cVar, cVar);
            this.f35534r = gVar;
            gVar.p(fVar);
            float N = org.telegram.messenger.g0.N(0.4f);
            float N2 = org.telegram.messenger.g0.N(0.4f);
            gh.f fVar2 = gVar.R;
            fVar2.f12305i = N;
            fVar2.f12306j = N2;
            gVar.P = null;
            org.telegram.messenger.camera.q.p(gVar, org.telegram.messenger.g0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
