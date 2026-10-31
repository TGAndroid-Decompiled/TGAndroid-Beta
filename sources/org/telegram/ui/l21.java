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
public abstract class l21 extends org.telegram.ui.Components.tk0 {
    public final SparseArray f39029e3;
    public final ArrayList f39030f3;
    public final ArrayList f39031g3;
    public final ArrayList f39032h3;
    public final ArrayList f39033i3;
    public boolean f39034j3;
    public final LongSparseArray f39035k3;
    public final i31 f39036l3;

    public l21(i31 i31Var, Context context) {
        super(context, null);
        this.f39036l3 = i31Var;
        this.f39029e3 = new SparseArray();
        this.f39030f3 = new ArrayList();
        this.f39031g3 = new ArrayList();
        this.f39032h3 = new ArrayList();
        this.f39033i3 = new ArrayList();
        this.f39035k3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.i0.L(4.0f));
        org.telegram.ui.ActionBar.a7.m(this, 20, org.telegram.ui.ActionBar.t6.f21020i6, this.f30625n2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((k21) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l21.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        k21 k21Var;
        int i10;
        View view;
        int top;
        float interpolation;
        float f7;
        float f10;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver2;
        boolean z11;
        float f11;
        float f12;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.f39034j3 = false;
            int saveCount = canvas2.getSaveCount();
            i31 i31Var = this.f39036l3;
            int i11 = i31Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f30623m2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.B1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.f39029e3;
                int size = sparseArray.size();
                arrayList = this.f39030f3;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (i31Var.Q1 > 0 && SystemClock.elapsedRealtime() - i31Var.Q1 < i31Var.g() && i31Var.N1 != null && i31Var.O1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f39035k3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof s21) {
                        s21 s21Var = (s21) childAt;
                        i31 i31Var2 = s21Var.V;
                        int i15 = i31Var2.W;
                        if (s21Var.isPressed()) {
                            float f13 = s21Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                s21Var.N = Utilities.i(f13 + 0.16f, 1.0f, 0.0f);
                                s21Var.invalidate();
                            }
                        }
                        int i16 = s21Var.f41358c;
                        if (i31Var.f38165x1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(s21Var.getX(), s21Var.getY());
                        if (s21Var.f41364x != null) {
                            rh.s8 collectionParticles = i31Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, s21Var.getWidth(), s21Var.getHeight());
                            if (!z13) {
                                collectionParticles.d();
                                z11 = true;
                            } else {
                                z11 = z13;
                            }
                            canvas2.save();
                            int i17 = i16 % 6;
                            boolean z14 = z11;
                            if (i17 == 2) {
                                f11 = -1.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            if (i17 == 2) {
                                f12 = -1.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            view = childAt;
                            canvas2.scale(f11, f12, s21Var.getWidth() / 2.0f, s21Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, s21Var.getWidth() / 2.0f, s21Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, s21Var.f41364x.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = s21Var.L;
                        if ((z15 || s21Var.M || s21Var.S > 0.0f) && !s21Var.f41357b) {
                            if (z15 || s21Var.M) {
                                float f14 = s21Var.R;
                                if (f14 < 1.0f) {
                                    s21Var.R = ((1000.0f / org.telegram.messenger.i0.f16027r) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!s21Var.L && !s21Var.M) {
                                float f15 = s21Var.R;
                                if (f15 > 0.0f) {
                                    s21Var.R = f15 - ((1000.0f / org.telegram.messenger.i0.f16027r) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (s21Var.L) {
                                interpolation = org.telegram.ui.Components.gr.h.getInterpolation(s21Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - s21Var.R);
                            }
                            s21Var.S = Utilities.i(interpolation, 1.0f, 0.0f);
                            if (i15 == 6) {
                                f7 = 1.5f;
                            } else {
                                f7 = 1.0f;
                            }
                            int L = org.telegram.messenger.i0.L(f7);
                            if (i15 == 6) {
                                f10 = 6.0f;
                            } else {
                                f10 = 4.0f;
                            }
                            int L2 = org.telegram.messenger.i0.L(f10);
                            RectF rectF = org.telegram.messenger.i0.P;
                            rectF.set(0.0f, 0.0f, s21Var.getMeasuredWidth(), s21Var.getMeasuredHeight());
                            float f16 = L;
                            rectF.inset(f16, f16);
                            if (!s21Var.f41356a) {
                                Drawable drawable = s21Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.f5) || !((org.telegram.ui.Components.f5) drawable).c()) {
                                    paint = i31Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (s21Var.getAlpha() * alpha * s21Var.S));
                                    float f17 = L2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = i31Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (s21Var.getAlpha() * alpha2 * s21Var.S));
                            float f172 = L2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (s21Var.getBackground() != null) {
                            s21Var.getBackground().setBounds((int) s21Var.getX(), (int) s21Var.getY(), s21Var.getWidth() + ((int) s21Var.getX()), s21Var.getHeight() + ((int) s21Var.getY()));
                            s21Var.getBackground().setAlpha((int) (s21Var.getAlpha() * 255));
                            s21Var.getBackground().draw(canvas2);
                            s21Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) i0.a.v(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(s21Var);
                        r21 r21Var = s21Var.J;
                        if (r21Var != null && r21Var.getVisibility() == 0 && s21Var.J.getImageReceiver() == null && (imageReceiver2 = s21Var.f41361r) != null) {
                            s21Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = i31Var.O1;
                        List list = i31.a2;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.gr.f26496g.getInterpolation(w7.u.a(((float) (SystemClock.elapsedRealtime() - i31Var.Q1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                i31Var.N1.draw(canvas2);
                                canvas2.restore();
                                i14 = i10 + 1;
                                z12 = z16;
                                i12 = 14;
                            }
                        }
                    }
                    i14 = i10 + 1;
                    z12 = z16;
                    i12 = 14;
                }
            }
            ArrayList arrayList6 = this.f39033i3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f39032h3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f39031g3;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                s21 s21Var2 = (s21) arrayList8.get(0);
                int R2 = RecyclerView.R(s21Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((k21) arrayList6.get(i20)).M == R2) {
                            k21Var = (k21) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        k21Var = null;
                        break;
                    }
                }
                if (k21Var == null) {
                    if (!arrayList2.isEmpty()) {
                        k21Var = (k21) i0.a.v(1, arrayList2);
                    } else {
                        k21Var = new k21(this);
                        k21Var.l(7);
                    }
                    k21Var.M = R2;
                    k21Var.e();
                }
                arrayList7.add(k21Var);
                k21Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(s21Var2.getLeft(), s21Var2.getY());
                k21Var.N = s21Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (s21Var2.getLeft() * 2);
                int measuredHeight = s21Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    k21Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((k21) arrayList6.get(i21));
                    ((k21) arrayList6.get(i21)).O = null;
                    ((k21) arrayList6.get(i21)).k();
                } else {
                    ((k21) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof s21) {
                    s21 s21Var3 = (s21) childAt2;
                    r21 r21Var2 = s21Var3.J;
                    if (r21Var2 != null && r21Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((s21Var3.getX() + s21Var3.getMeasuredWidth()) - s21Var3.J.getMeasuredWidth()), (int) ((s21Var3.getY() + s21Var3.getMeasuredHeight()) - s21Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = s21Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.f5) {
                            imageReceiver = ((org.telegram.ui.Components.f5) drawable2).f25975k;
                        } else {
                            imageReceiver = s21Var3.h;
                        }
                        r21 r21Var3 = s21Var3.J;
                        if (!r21Var3.h) {
                            r21Var3.setImageReceiver(imageReceiver);
                        }
                        s21Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (s21Var3.K != null) {
                        canvas2.save();
                        int L3 = org.telegram.messenger.i0.L(17.0f);
                        float f20 = L3;
                        canvas2.translate((int) ((s21Var3.getX() + s21Var3.getMeasuredWidth()) - f20), (int) ((s21Var3.getY() + s21Var3.getMeasuredHeight()) - f20));
                        s21Var3.K.setBounds(0, 0, L3, L3);
                        s21Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != i31Var.N1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = sg.e0.f48321c;
            if (runnable != null) {
                runnable.run();
                sg.e0.f48321c = null;
            }
        }
    }

    @Override
    public final void g1() {
        if (sg.e0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override
    public final void invalidate() {
        if (sg.e0.b(this) || this.f39034j3) {
            return;
        }
        this.f39034j3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i31 i31Var = this.f39036l3;
        if (this == i31Var.f38129h0) {
            i31Var.V0.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i31 i31Var = this.f39036l3;
        if (this == i31Var.f38129h0) {
            i31Var.V0.R();
        }
        z1(this.f39031g3);
        z1(this.f39032h3);
        z1(this.f39033i3);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
