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
public abstract class j21 extends org.telegram.ui.Components.uk0 {
    public final SparseArray f38257e3;
    public final ArrayList f38258f3;
    public final ArrayList f38259g3;
    public final ArrayList f38260h3;
    public final ArrayList f38261i3;
    public boolean f38262j3;
    public final LongSparseArray f38263k3;
    public final g31 f38264l3;

    public j21(g31 g31Var, Context context) {
        super(context, null);
        this.f38264l3 = g31Var;
        this.f38257e3 = new SparseArray();
        this.f38258f3 = new ArrayList();
        this.f38259g3 = new ArrayList();
        this.f38260h3 = new ArrayList();
        this.f38261i3 = new ArrayList();
        this.f38263k3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.i0.L(4.0f));
        org.telegram.ui.ActionBar.a7.m(this, 20, org.telegram.ui.ActionBar.t6.f21021i6, this.f31008n2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((i21) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j21.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        i21 i21Var;
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
            this.f38262j3 = false;
            int saveCount = canvas2.getSaveCount();
            g31 g31Var = this.f38264l3;
            int i11 = g31Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f31006m2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.B1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.f38257e3;
                int size = sparseArray.size();
                arrayList = this.f38258f3;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (g31Var.Q1 > 0 && SystemClock.elapsedRealtime() - g31Var.Q1 < g31Var.g() && g31Var.N1 != null && g31Var.O1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f38263k3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof q21) {
                        q21 q21Var = (q21) childAt;
                        g31 g31Var2 = q21Var.V;
                        int i15 = g31Var2.W;
                        if (q21Var.isPressed()) {
                            float f13 = q21Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                q21Var.N = Utilities.i(f13 + 0.16f, 1.0f, 0.0f);
                                q21Var.invalidate();
                            }
                        }
                        int i16 = q21Var.f40664c;
                        if (g31Var.f37341x1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(q21Var.getX(), q21Var.getY());
                        if (q21Var.f40670x != null) {
                            rh.s8 collectionParticles = g31Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, q21Var.getWidth(), q21Var.getHeight());
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
                            canvas2.scale(f11, f12, q21Var.getWidth() / 2.0f, q21Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, q21Var.getWidth() / 2.0f, q21Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, q21Var.f40670x.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = q21Var.L;
                        if ((z15 || q21Var.M || q21Var.S > 0.0f) && !q21Var.f40663b) {
                            if (z15 || q21Var.M) {
                                float f14 = q21Var.R;
                                if (f14 < 1.0f) {
                                    q21Var.R = ((1000.0f / org.telegram.messenger.i0.f16173r) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!q21Var.L && !q21Var.M) {
                                float f15 = q21Var.R;
                                if (f15 > 0.0f) {
                                    q21Var.R = f15 - ((1000.0f / org.telegram.messenger.i0.f16173r) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (q21Var.L) {
                                interpolation = org.telegram.ui.Components.gr.h.getInterpolation(q21Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - q21Var.R);
                            }
                            q21Var.S = Utilities.i(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, q21Var.getMeasuredWidth(), q21Var.getMeasuredHeight());
                            float f16 = L;
                            rectF.inset(f16, f16);
                            if (!q21Var.f40662a) {
                                Drawable drawable = q21Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.f5) || !((org.telegram.ui.Components.f5) drawable).c()) {
                                    paint = g31Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (q21Var.getAlpha() * alpha * q21Var.S));
                                    float f17 = L2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = g31Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (q21Var.getAlpha() * alpha2 * q21Var.S));
                            float f172 = L2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (q21Var.getBackground() != null) {
                            q21Var.getBackground().setBounds((int) q21Var.getX(), (int) q21Var.getY(), q21Var.getWidth() + ((int) q21Var.getX()), q21Var.getHeight() + ((int) q21Var.getY()));
                            q21Var.getBackground().setAlpha((int) (q21Var.getAlpha() * 255));
                            q21Var.getBackground().draw(canvas2);
                            q21Var.getBackground().setAlpha(255);
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
                        arrayList3.add(q21Var);
                        p21 p21Var = q21Var.J;
                        if (p21Var != null && p21Var.getVisibility() == 0 && q21Var.J.getImageReceiver() == null && (imageReceiver2 = q21Var.f40667r) != null) {
                            q21Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = g31Var.O1;
                        List list = g31.a2;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.gr.f26524g.getInterpolation(w7.u.a(((float) (SystemClock.elapsedRealtime() - g31Var.Q1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                g31Var.N1.draw(canvas2);
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
            ArrayList arrayList6 = this.f38261i3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f38260h3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f38259g3;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                q21 q21Var2 = (q21) arrayList8.get(0);
                int R2 = RecyclerView.R(q21Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((i21) arrayList6.get(i20)).M == R2) {
                            i21Var = (i21) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        i21Var = null;
                        break;
                    }
                }
                if (i21Var == null) {
                    if (!arrayList2.isEmpty()) {
                        i21Var = (i21) i0.a.v(1, arrayList2);
                    } else {
                        i21Var = new i21(this);
                        i21Var.l(7);
                    }
                    i21Var.M = R2;
                    i21Var.e();
                }
                arrayList7.add(i21Var);
                i21Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(q21Var2.getLeft(), q21Var2.getY());
                i21Var.N = q21Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (q21Var2.getLeft() * 2);
                int measuredHeight = q21Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    i21Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((i21) arrayList6.get(i21));
                    ((i21) arrayList6.get(i21)).O = null;
                    ((i21) arrayList6.get(i21)).k();
                } else {
                    ((i21) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof q21) {
                    q21 q21Var3 = (q21) childAt2;
                    p21 p21Var2 = q21Var3.J;
                    if (p21Var2 != null && p21Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((q21Var3.getX() + q21Var3.getMeasuredWidth()) - q21Var3.J.getMeasuredWidth()), (int) ((q21Var3.getY() + q21Var3.getMeasuredHeight()) - q21Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = q21Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.f5) {
                            imageReceiver = ((org.telegram.ui.Components.f5) drawable2).f26070k;
                        } else {
                            imageReceiver = q21Var3.h;
                        }
                        p21 p21Var3 = q21Var3.J;
                        if (!p21Var3.h) {
                            p21Var3.setImageReceiver(imageReceiver);
                        }
                        q21Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (q21Var3.K != null) {
                        canvas2.save();
                        int L3 = org.telegram.messenger.i0.L(17.0f);
                        float f20 = L3;
                        canvas2.translate((int) ((q21Var3.getX() + q21Var3.getMeasuredWidth()) - f20), (int) ((q21Var3.getY() + q21Var3.getMeasuredHeight()) - f20));
                        q21Var3.K.setBounds(0, 0, L3, L3);
                        q21Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != g31Var.N1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = sg.e0.f48332c;
            if (runnable != null) {
                runnable.run();
                sg.e0.f48332c = null;
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
        if (sg.e0.b(this) || this.f38262j3) {
            return;
        }
        this.f38262j3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g31 g31Var = this.f38264l3;
        if (this == g31Var.f37305h0) {
            g31Var.V0.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g31 g31Var = this.f38264l3;
        if (this == g31Var.f37305h0) {
            g31Var.V0.R();
        }
        z1(this.f38259g3);
        z1(this.f38260h3);
        z1(this.f38261i3);
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
