package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class q01 extends org.telegram.ui.Components.uj0 {
    public final SparseArray f50412f3;
    public final ArrayList f50413g3;
    public final ArrayList f50414h3;
    public final ArrayList f50415i3;
    public final ArrayList j3;
    public boolean f50416k3;
    public final LongSparseArray f50417l3;
    public final n11 f50418m3;

    public q01(n11 n11Var, Context context) {
        super(context, null);
        this.f50418m3 = n11Var;
        this.f50412f3 = new SparseArray();
        this.f50413g3 = new ArrayList();
        this.f50414h3 = new ArrayList();
        this.f50415i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f50417l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.q6.l(this, 20, org.telegram.ui.ActionBar.j6.f28941i6, this.f40069o2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((p01) arrayList.get(i7)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q01.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        p01 p01Var;
        int i7;
        View view;
        int top;
        float interpolation;
        float f10;
        float f11;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver2;
        boolean z11;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.f50416k3 = false;
            int saveCount = canvas2.getSaveCount();
            n11 n11Var = this.f50418m3;
            int i10 = n11Var.f49364a0;
            int i11 = 14;
            if (i10 != 6 && i10 != 14 && i10 != 13) {
                Rect rect = this.F1;
                if (!rect.isEmpty()) {
                    this.C1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f40067n2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.C1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i12 = 0;
            while (true) {
                sparseArray = this.f50412f3;
                int size = sparseArray.size();
                arrayList = this.f50413g3;
                if (i12 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i12);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i12++;
            }
            sparseArray.clear();
            if (n11Var.R1 > 0 && SystemClock.elapsedRealtime() - n11Var.R1 < n11Var.g() && n11Var.O1 != null && n11Var.P1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f50417l3 != null) {
                int i13 = 0;
                boolean z12 = false;
                while (i13 < getChildCount()) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof x01) {
                        x01 x01Var = (x01) childAt;
                        n11 n11Var2 = x01Var.W;
                        int i14 = n11Var2.f49364a0;
                        if (x01Var.isPressed()) {
                            float f14 = x01Var.O;
                            if (f14 != 1.0f && i14 != i11) {
                                x01Var.O = Utilities.i(f14 + 0.16f, 1.0f, 0.0f);
                                x01Var.invalidate();
                            }
                        }
                        int i15 = x01Var.f53055c;
                        if (n11Var.f49421y1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(x01Var.getX(), x01Var.getY());
                        if (x01Var.f53062x != null) {
                            di.ac collectionParticles = n11Var.getCollectionParticles();
                            i7 = i13;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, x01Var.getWidth(), x01Var.getHeight());
                            if (!z13) {
                                collectionParticles.d();
                                z11 = true;
                            } else {
                                z11 = z13;
                            }
                            canvas2.save();
                            int i16 = i15 % 6;
                            boolean z14 = z11;
                            if (i16 == 2) {
                                f12 = -1.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            if (i16 == 2) {
                                f13 = -1.0f;
                            } else {
                                f13 = 1.0f;
                            }
                            view = childAt;
                            canvas2.scale(f12, f13, x01Var.getWidth() / 2.0f, x01Var.getHeight() / 2.0f);
                            canvas2.rotate((i15 % 4) * 90, x01Var.getWidth() / 2.0f, x01Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, x01Var.f53062x.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i7 = i13;
                            view = childAt;
                        }
                        boolean z15 = x01Var.M;
                        if ((z15 || x01Var.N || x01Var.T > 0.0f) && !x01Var.f53054b) {
                            if (z15 || x01Var.N) {
                                float f15 = x01Var.S;
                                if (f15 < 1.0f) {
                                    x01Var.S = ((1000.0f / org.telegram.messenger.g0.f23612r) / 240.0f) + f15;
                                    invalidate();
                                }
                            }
                            if (!x01Var.M && !x01Var.N) {
                                float f16 = x01Var.S;
                                if (f16 > 0.0f) {
                                    x01Var.S = f16 - ((1000.0f / org.telegram.messenger.g0.f23612r) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (x01Var.M) {
                                interpolation = org.telegram.ui.Components.er.h.getInterpolation(x01Var.S);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - x01Var.S);
                            }
                            x01Var.T = Utilities.i(interpolation, 1.0f, 0.0f);
                            if (i14 == 6) {
                                f10 = 1.5f;
                            } else {
                                f10 = 1.0f;
                            }
                            int L = org.telegram.messenger.g0.L(f10);
                            if (i14 == 6) {
                                f11 = 6.0f;
                            } else {
                                f11 = 4.0f;
                            }
                            int L2 = org.telegram.messenger.g0.L(f11);
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(0.0f, 0.0f, x01Var.getMeasuredWidth(), x01Var.getMeasuredHeight());
                            float f17 = L;
                            rectF.inset(f17, f17);
                            if (!x01Var.f53053a) {
                                Drawable drawable = x01Var.F;
                                if (!(drawable instanceof org.telegram.ui.Components.g5) || !((org.telegram.ui.Components.g5) drawable).c()) {
                                    paint = n11Var2.M;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (x01Var.getAlpha() * alpha * x01Var.T));
                                    float f18 = L2;
                                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = n11Var2.N;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (x01Var.getAlpha() * alpha2 * x01Var.T));
                            float f182 = L2;
                            canvas2.drawRoundRect(rectF, f182, f182, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (x01Var.getBackground() != null) {
                            x01Var.getBackground().setBounds((int) x01Var.getX(), (int) x01Var.getY(), x01Var.getWidth() + ((int) x01Var.getX()), x01Var.getHeight() + ((int) x01Var.getY()));
                            x01Var.getBackground().setAlpha((int) (x01Var.getAlpha() * 255));
                            x01Var.getBackground().draw(canvas2);
                            x01Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) r.b.g(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(x01Var);
                        w01 w01Var = x01Var.K;
                        if (w01Var != null && w01Var.getVisibility() == 0 && x01Var.K.getImageReceiver() == null && (imageReceiver2 = x01Var.f53059r) != null) {
                            x01Var.K.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i7 = i13;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i17 = n11Var.P1;
                        List list = n11.f49360b2;
                        if (R == i17 - 1) {
                            float interpolation2 = org.telegram.ui.Components.er.f34420g.getInterpolation(c8.i9.a(((float) (SystemClock.elapsedRealtime() - n11Var.R1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f19 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f19), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f20 = (f19 * 0.5f) + 0.5f;
                                canvas2.scale(f20, f20, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                n11Var.O1.draw(canvas2);
                                canvas2.restore();
                                i13 = i7 + 1;
                                z12 = z16;
                                i11 = 14;
                            }
                        }
                    }
                    i13 = i7 + 1;
                    z12 = z16;
                    i11 = 14;
                }
            }
            ArrayList arrayList6 = this.j3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f50415i3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i18 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f50414h3;
                if (i18 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
                x01 x01Var2 = (x01) arrayList8.get(0);
                int R2 = RecyclerView.R(x01Var2);
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList6.size()) {
                        if (((p01) arrayList6.get(i19)).N == R2) {
                            p01Var = (p01) arrayList6.get(i19);
                            arrayList6.remove(i19);
                            break;
                        }
                        i19++;
                    } else {
                        p01Var = null;
                        break;
                    }
                }
                if (p01Var == null) {
                    if (!arrayList2.isEmpty()) {
                        p01Var = (p01) r.b.g(1, arrayList2);
                    } else {
                        p01Var = new p01(this);
                        p01Var.l(7);
                    }
                    p01Var.N = R2;
                    p01Var.e();
                }
                arrayList7.add(p01Var);
                p01Var.P = arrayList8;
                canvas2.save();
                canvas2.translate(x01Var2.getLeft(), x01Var2.getY());
                p01Var.O = x01Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (x01Var2.getLeft() * 2);
                int measuredHeight = x01Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    p01Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i18++;
            }
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((p01) arrayList6.get(i20));
                    ((p01) arrayList6.get(i20)).P = null;
                    ((p01) arrayList6.get(i20)).k();
                } else {
                    ((p01) arrayList6.get(i20)).f();
                }
            }
            arrayList6.clear();
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 instanceof x01) {
                    x01 x01Var3 = (x01) childAt2;
                    w01 w01Var2 = x01Var3.K;
                    if (w01Var2 != null && w01Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((x01Var3.getX() + x01Var3.getMeasuredWidth()) - x01Var3.K.getMeasuredWidth()), (int) ((x01Var3.getY() + x01Var3.getMeasuredHeight()) - x01Var3.K.getMeasuredHeight()));
                        Drawable drawable2 = x01Var3.F;
                        if (drawable2 instanceof org.telegram.ui.Components.g5) {
                            imageReceiver = ((org.telegram.ui.Components.g5) drawable2).f34813k;
                        } else {
                            imageReceiver = x01Var3.h;
                        }
                        w01 w01Var3 = x01Var3.K;
                        if (!w01Var3.h) {
                            w01Var3.setImageReceiver(imageReceiver);
                        }
                        x01Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                    if (x01Var3.L != null) {
                        canvas2.save();
                        int L3 = org.telegram.messenger.g0.L(17.0f);
                        float f21 = L3;
                        canvas2.translate((int) ((x01Var3.getX() + x01Var3.getMeasuredWidth()) - f21), (int) ((x01Var3.getY() + x01Var3.getMeasuredHeight()) - f21));
                        x01Var3.L.setBounds(0, 0, L3, L3);
                        x01Var3.L.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != n11Var.O1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ch.f0.f5069c;
            if (runnable != null) {
                runnable.run();
                ch.f0.f5069c = null;
            }
        }
    }

    @Override
    public final void g1() {
        if (ch.f0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override
    public final void invalidate() {
        if (ch.f0.b(this) || this.f50416k3) {
            return;
        }
        this.f50416k3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n11 n11Var = this.f50418m3;
        if (this == n11Var.f49385i0) {
            n11Var.W0.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n11 n11Var = this.f50418m3;
        if (this == n11Var.f49385i0) {
            n11Var.W0.R();
        }
        z1(this.f50414h3);
        z1(this.f50415i3);
        z1(this.j3);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
