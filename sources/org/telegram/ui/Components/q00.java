package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
public final class q00 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public float F;
    public float G;
    public boolean H;
    public final te.a f37138a;
    public final te.a f37139b;
    public final ch0 f37140c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.f6 f37141e;
    public ArrayList f37142f;
    public final boolean h;
    public final ri.c f37143n;
    public final fh.g f37144r;
    public final fi.f f37145s;
    public org.telegram.ui.Cells.y f37146w;
    public int f37147x;
    public boolean f37148y;

    public q00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        int i7;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        return c8.ha.d(48, 48.0f, i7 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        int i7;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        return c8.ha.d(48, 48.0f, i7 | 80, 20.0f, 0.0f, 20.0f, 14.0f);
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
        if (this.F != f10) {
            this.H = true;
            super.setTranslationY(this.G + f10);
            this.H = false;
            this.F = f10;
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        float f12;
        int i10 = 0;
        boolean z9 = false;
        if (i7 == 0) {
            d(this, f10);
            if (f10 >= 0.99f) {
                z9 = true;
            }
            setClickable(z9);
            if (this.h) {
                f12 = 64.0f;
            } else {
                f12 = 40.0f;
            }
            setAdditionalTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(f12));
        } else if (i7 == 1) {
            d(this.d, f10);
            float f13 = 1.0f - f10;
            d(this.f37140c, f13);
            ArrayList arrayList = this.f37142f;
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
        if (this.f37142f == null) {
            this.f37142f = new ArrayList();
        }
        this.f37142f.add(view);
        d(view, 1.0f - this.f37139b.f55486e);
    }

    @Override
    public final void draw(Canvas canvas) {
        fh.g gVar = this.f37144r;
        if (gVar != null) {
            gVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        this.f37138a.a(z9, z10);
    }

    public final void f(boolean z9, boolean z10) {
        this.f37139b.a(z9, z10);
    }

    public boolean getButtonVisible() {
        return this.f37138a.f55487f;
    }

    public boolean getProgressVisible() {
        return this.f37139b.f55487f;
    }

    @Override
    public float getTranslationY() {
        if (this.H) {
            return super.getTranslationY();
        }
        return this.G;
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        fh.g gVar = this.f37144r;
        if (gVar != null) {
            gVar.setBounds(0, 0, i7, i10);
        }
    }

    public void setImageResource(int i7) {
        this.f37140c.setImageResource(i7);
    }

    @Override
    public void setTranslationY(float f10) {
        if (this.G != f10) {
            this.H = true;
            super.setTranslationY(this.F + f10);
            this.H = false;
            this.G = f10;
        }
    }

    @Override
    public final void updateColors() {
        RadialProgressView radialProgressView;
        boolean z9;
        ch0 ch0Var = this.f37140c;
        if (ch0Var != null && (radialProgressView = this.d) != null) {
            if (this.f37146w != null && getBackground() == this.f37146w) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = this.h;
            org.telegram.ui.ActionBar.f6 f6Var = this.f37141e;
            if (z10) {
                int i7 = org.telegram.ui.ActionBar.k6.f28189v8;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                if (w02 != this.f37147x || !this.f37148y) {
                    this.f37147x = w02;
                    this.f37148y = true;
                    ch0Var.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
                ri.c cVar = this.f37143n;
                if (cVar != null) {
                    cVar.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
                }
                fi.f fVar = this.f37145s;
                if (fVar != null) {
                    fVar.d();
                }
                fh.g gVar = this.f37144r;
                if (gVar != null) {
                    gVar.updateColors();
                }
                invalidate();
                int L = org.telegram.messenger.g0.L(18.0f);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27944i6, f6Var);
                if (z9) {
                    if (w03 != this.E) {
                        this.E = w03;
                        org.telegram.ui.ActionBar.k6.H1(this.f37146w, w03, true);
                        return;
                    }
                    return;
                }
                this.E = w03;
                int L2 = org.telegram.messenger.g0.L(6.0f);
                org.telegram.ui.Cells.y Y = org.telegram.ui.ActionBar.k6.Y(L, w03, L2, L2, L2, L2);
                this.f37146w = Y;
                setBackground(Y);
                return;
            }
            int i10 = org.telegram.ui.ActionBar.k6.O9;
            int w04 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            if (w04 != this.f37147x || !this.f37148y) {
                this.f37147x = w04;
                this.f37148y = true;
                ch0Var.setColorFilter(w04, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
            int w06 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ei, f6Var);
            if (z9) {
                if (w05 != this.D || w06 != this.E) {
                    this.D = w05;
                    this.E = w06;
                    org.telegram.ui.ActionBar.k6.H1(this.f37146w, w05, false);
                    org.telegram.ui.ActionBar.k6.H1(this.f37146w, w06, true);
                    this.f37146w.invalidateSelf();
                    return;
                }
                return;
            }
            this.D = w05;
            this.E = w06;
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(48.0f), w05, w06);
            this.f37146w = j02;
            setBackground(j02);
        }
    }

    public q00(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        xq xqVar = xq.h;
        this.f37138a = new te.a(0, this, xqVar, 380L, true);
        this.f37139b = new te.a(1, this, xqVar, 380L, false);
        this.f37141e = f6Var;
        this.h = z9;
        ?? imageView = new ImageView(context);
        this.f37140c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, c8.ha.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        c8.ka.a(this);
        if (!z9) {
            setOutlineProvider(bg.u0.f3380a);
            setTranslationZ(org.telegram.messenger.g0.N(0.5f));
        }
        if (z9) {
            fi.f fVar = new fi.f(org.telegram.ui.ActionBar.k6.f27925h5, null);
            this.f37145s = fVar;
            ri.c cVar = new ri.c();
            this.f37143n = cVar;
            fh.g gVar = new fh.g(cVar, cVar, cVar);
            this.f37144r = gVar;
            gVar.p(fVar);
            float N = org.telegram.messenger.g0.N(0.4f);
            float N2 = org.telegram.messenger.g0.N(0.4f);
            fh.f fVar2 = gVar.Q;
            fVar2.f11511i = N;
            fVar2.f11512j = N2;
            gVar.O = null;
            org.telegram.messenger.camera.q.p(gVar, org.telegram.messenger.g0.L(18.0f), 5.66f);
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
