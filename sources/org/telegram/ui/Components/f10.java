package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
public final class f10 extends FrameLayout implements fe.e, org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public float F;
    public float G;
    public boolean H;
    public final fe.b f26020a;
    public final fe.b f26021b;
    public final fi0 f26022c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.p6 e;
    public ArrayList f26023f;
    public final boolean h;
    public final hi.c f26024n;
    public final vg.f f26025r;
    public final e10 f26026s;
    public org.telegram.ui.Cells.y f26027w;
    public int f26028x;
    public boolean f26029y;

    public f10(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, p6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i10;
        if (org.telegram.messenger.dd.X) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.b6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i10;
        if (org.telegram.messenger.dd.X) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        return w7.b6.d(48, 48.0f, i10 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f7) {
        int i10;
        if (view == null) {
            return;
        }
        view.setAlpha(f7);
        view.setScaleX(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
        view.setScaleY(org.telegram.messenger.i0.T1(0.4f, 1.0f, f7));
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
        if (this.f26023f == null) {
            this.f26023f = new ArrayList();
        }
        this.f26023f.add(view);
        d(view, 1.0f - this.f26021b.e);
    }

    @Override
    public final void draw(Canvas canvas) {
        vg.f fVar = this.f26025r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.f26020a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.f26021b.a(z10, z11);
    }

    public boolean getButtonVisible() {
        return this.f26020a.f7022f;
    }

    public boolean getProgressVisible() {
        return this.f26021b.f7022f;
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
        vg.f fVar = this.f26025r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.f26022c.setImageResource(i10);
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
        fi0 fi0Var = this.f26022c;
        if (fi0Var != null && (radialProgressView = this.d) != null) {
            if (this.f26027w != null && getBackground() == this.f26027w) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = this.h;
            org.telegram.ui.ActionBar.p6 p6Var = this.e;
            if (z11) {
                int i10 = org.telegram.ui.ActionBar.t6.f21262v8;
                int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                if (w02 != this.f26028x || !this.f26029y) {
                    this.f26028x = w02;
                    this.f26029y = true;
                    fi0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
                hi.c cVar = this.f26024n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                }
                e10 e10Var = this.f26026s;
                if (e10Var != null) {
                    e10Var.d();
                }
                vg.f fVar = this.f26025r;
                if (fVar != null) {
                    fVar.updateColors();
                }
                invalidate();
                int L = org.telegram.messenger.i0.L(18.0f);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var);
                if (z10) {
                    if (w03 != this.E) {
                        this.E = w03;
                        org.telegram.ui.ActionBar.t6.H1(this.f26027w, w03, true);
                        return;
                    }
                    return;
                }
                this.E = w03;
                int L2 = org.telegram.messenger.i0.L(6.0f);
                org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.t6.Y(L, w03, L2, L2, L2, L2);
                this.f26027w = Y;
                setBackground(Y);
                return;
            }
            int i11 = org.telegram.ui.ActionBar.t6.O9;
            int w04 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            if (w04 != this.f26028x || !this.f26029y) {
                this.f26028x = w04;
                this.f26029y = true;
                fi0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ei, p6Var);
            if (z10) {
                if (w05 != this.D || w06 != this.E) {
                    this.D = w05;
                    this.E = w06;
                    org.telegram.ui.ActionBar.t6.H1(this.f26027w, w05, false);
                    org.telegram.ui.ActionBar.t6.H1(this.f26027w, w06, true);
                    this.f26027w.invalidateSelf();
                    return;
                }
                return;
            }
            this.D = w05;
            this.E = w06;
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(48.0f), w05, w06);
            this.f26027w = j02;
            setBackground(j02);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
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
            setAdditionalTranslationY((1.0f - f7) * org.telegram.messenger.i0.L(f11));
        } else if (i10 == 1) {
            d(this.d, f7);
            float f12 = 1.0f - f7;
            d(this.f26022c, f12);
            ArrayList arrayList = this.f26023f;
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

    public f10(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        gr grVar = gr.h;
        this.f26020a = new fe.b(0, this, grVar, 380L, true);
        this.f26021b = new fe.b(1, this, grVar, 380L, false);
        this.e = p6Var;
        this.h = z10;
        ?? imageView = new ImageView(context);
        this.f26022c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.b6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, w7.b6.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        w7.e6.a(this);
        if (!z10) {
            setOutlineProvider(rf.e0.f46537a);
            setTranslationZ(org.telegram.messenger.i0.N(0.5f));
        }
        if (z10) {
            e10 e10Var = new e10(org.telegram.ui.ActionBar.t6.f21002h5, null);
            this.f26026s = e10Var;
            hi.c cVar = new hi.c();
            this.f26024n = cVar;
            vg.f fVar = new vg.f(cVar, cVar, cVar);
            this.f26025r = fVar;
            fVar.o(e10Var);
            float N = org.telegram.messenger.i0.N(0.4f);
            float N2 = org.telegram.messenger.i0.N(0.4f);
            vg.e eVar = fVar.P;
            eVar.f50850i = N;
            eVar.f50851j = N2;
            fVar.O = null;
            org.telegram.messenger.a30.u(fVar, org.telegram.messenger.i0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
