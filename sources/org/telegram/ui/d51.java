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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class d51 extends org.telegram.ui.Components.mm0 {
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList f36511a3;
    public final ArrayList f36512b3;
    public final ArrayList f36513c3;
    public boolean f36514d3;
    public final LongSparseArray f36515e3;
    public final b61 f36516f3;

    public d51(b61 b61Var, Context context) {
        super(context, null);
        this.f36516f3 = b61Var;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.f36511a3 = new ArrayList();
        this.f36512b3 = new ArrayList();
        this.f36513c3 = new ArrayList();
        this.f36515e3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.f21272i6, this.f28705n2);
    }

    public static void C1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((c51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d51.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        c51 c51Var;
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
            this.f36514d3 = false;
            int saveCount = canvas2.getSaveCount();
            b61 b61Var = this.f36516f3;
            int i11 = b61Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f28703m2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.B1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.Y2;
                int size = sparseArray.size();
                arrayList = this.Z2;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (b61Var.Q1 > 0 && SystemClock.elapsedRealtime() - b61Var.Q1 < b61Var.g() && b61Var.N1 != null && b61Var.O1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f36515e3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof k51) {
                        k51 k51Var = (k51) childAt;
                        b61 b61Var2 = k51Var.V;
                        int i15 = b61Var2.W;
                        if (k51Var.isPressed()) {
                            float f13 = k51Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                k51Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                k51Var.invalidate();
                            }
                        }
                        int i16 = k51Var.f38824c;
                        if (b61Var.f35941x1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(k51Var.getX(), k51Var.getY());
                        if (k51Var.f38829w != null) {
                            ai.ee collectionParticles = b61Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, k51Var.getWidth(), k51Var.getHeight());
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
                            canvas2.scale(f11, f12, k51Var.getWidth() / 2.0f, k51Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, k51Var.getWidth() / 2.0f, k51Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, k51Var.f38829w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = k51Var.L;
                        if ((z15 || k51Var.M || k51Var.S > 0.0f) && !k51Var.f38823b) {
                            if (z15 || k51Var.M) {
                                float f14 = k51Var.R;
                                if (f14 < 1.0f) {
                                    k51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!k51Var.L && !k51Var.M) {
                                float f15 = k51Var.R;
                                if (f15 > 0.0f) {
                                    k51Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (k51Var.L) {
                                interpolation = org.telegram.ui.Components.bs.h.getInterpolation(k51Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - k51Var.R);
                            }
                            k51Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
                            if (i15 == 6) {
                                f7 = 1.5f;
                            } else {
                                f7 = 1.0f;
                            }
                            int dp = AndroidUtilities.dp(f7);
                            if (i15 == 6) {
                                f10 = 6.0f;
                            } else {
                                f10 = 4.0f;
                            }
                            int dp2 = AndroidUtilities.dp(f10);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, k51Var.getMeasuredWidth(), k51Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!k51Var.f38822a) {
                                Drawable drawable = k51Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.r5) || !((org.telegram.ui.Components.r5) drawable).c()) {
                                    paint = b61Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (k51Var.getAlpha() * alpha * k51Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = b61Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (k51Var.getAlpha() * alpha2 * k51Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (k51Var.getBackground() != null) {
                            k51Var.getBackground().setBounds((int) k51Var.getX(), (int) k51Var.getY(), k51Var.getWidth() + ((int) k51Var.getX()), k51Var.getHeight() + ((int) k51Var.getY()));
                            k51Var.getBackground().setAlpha((int) (k51Var.getAlpha() * 255));
                            k51Var.getBackground().draw(canvas2);
                            k51Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) i2.o1.A(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(k51Var);
                        j51 j51Var = k51Var.J;
                        if (j51Var != null && j51Var.getVisibility() == 0 && k51Var.J.getImageReceiver() == null && (imageReceiver2 = k51Var.f38827r) != null) {
                            k51Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = b61Var.O1;
                        List list = b61.a2;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.bs.f25134g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - b61Var.Q1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                b61Var.N1.draw(canvas2);
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
            ArrayList arrayList6 = this.f36513c3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f36512b3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f36511a3;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                k51 k51Var2 = (k51) arrayList8.get(0);
                int R2 = RecyclerView.R(k51Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((c51) arrayList6.get(i20)).M == R2) {
                            c51Var = (c51) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        c51Var = null;
                        break;
                    }
                }
                if (c51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        c51Var = (c51) i2.o1.A(1, arrayList2);
                    } else {
                        c51Var = new c51(this);
                        c51Var.l(7);
                    }
                    c51Var.M = R2;
                    c51Var.e();
                }
                arrayList7.add(c51Var);
                c51Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(k51Var2.getLeft(), k51Var2.getY());
                c51Var.N = k51Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (k51Var2.getLeft() * 2);
                int measuredHeight = k51Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    c51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((c51) arrayList6.get(i21));
                    ((c51) arrayList6.get(i21)).O = null;
                    ((c51) arrayList6.get(i21)).k();
                } else {
                    ((c51) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof k51) {
                    k51 k51Var3 = (k51) childAt2;
                    j51 j51Var2 = k51Var3.J;
                    if (j51Var2 != null && j51Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((k51Var3.getX() + k51Var3.getMeasuredWidth()) - k51Var3.J.getMeasuredWidth()), (int) ((k51Var3.getY() + k51Var3.getMeasuredHeight()) - k51Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = k51Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.r5) {
                            imageReceiver = ((org.telegram.ui.Components.r5) drawable2).f30098k;
                        } else {
                            imageReceiver = k51Var3.h;
                        }
                        j51 j51Var3 = k51Var3.J;
                        if (!j51Var3.h) {
                            j51Var3.setImageReceiver(imageReceiver);
                        }
                        k51Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (k51Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((k51Var3.getX() + k51Var3.getMeasuredWidth()) - f20), (int) ((k51Var3.getY() + k51Var3.getMeasuredHeight()) - f20));
                        k51Var3.K.setBounds(0, 0, dp3, dp3);
                        k51Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != b61Var.N1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ah.x0.f903c;
            if (runnable != null) {
                runnable.run();
                ah.x0.f903c = null;
            }
        }
    }

    @Override
    public final void g1() {
        if (ah.x0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override
    public final void invalidate() {
        if (ah.x0.b(this) || this.f36514d3) {
            return;
        }
        this.f36514d3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b61 b61Var = this.f36516f3;
        if (this == b61Var.f35905h0) {
            b61Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b61 b61Var = this.f36516f3;
        if (this == b61Var.f35905h0) {
            b61Var.V0.onDetachedFromWindow();
        }
        C1(this.f36511a3);
        C1(this.f36512b3);
        C1(this.f36513c3);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
