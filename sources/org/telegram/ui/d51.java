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
public abstract class d51 extends org.telegram.ui.Components.wk0 {
    public final SparseArray T2;
    public final ArrayList U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public boolean Y2;
    public final LongSparseArray Z2;
    public final b61 a3;

    public d51(b61 b61Var, Context context) {
        super(context, null);
        this.a3 = b61Var;
        this.T2 = new SparseArray();
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Z2 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, this.f34260l2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((c51) arrayList.get(i9)).f();
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
        int i9;
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
            this.Y2 = false;
            int saveCount = canvas2.getSaveCount();
            b61 b61Var = this.a3;
            int i10 = b61Var.S;
            int i11 = 14;
            if (i10 != 6 && i10 != 14 && i10 != 13) {
                Rect rect = this.C1;
                if (!rect.isEmpty()) {
                    this.f34287z1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f34259k2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.f34287z1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i12 = 0;
            while (true) {
                sparseArray = this.T2;
                int size = sparseArray.size();
                arrayList = this.U2;
                if (i12 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i12);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i12++;
            }
            sparseArray.clear();
            if (b61Var.L1 > 0 && SystemClock.elapsedRealtime() - b61Var.L1 < b61Var.g() && b61Var.I1 != null && b61Var.J1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.Z2 != null) {
                int i13 = 0;
                boolean z12 = false;
                while (i13 < getChildCount()) {
                    View childAt = getChildAt(i13);
                    if (childAt instanceof k51) {
                        k51 k51Var = (k51) childAt;
                        b61 b61Var2 = k51Var.R;
                        int i14 = b61Var2.S;
                        if (k51Var.isPressed()) {
                            float f14 = k51Var.J;
                            if (f14 != 1.0f && i14 != i11) {
                                k51Var.J = Utilities.clamp(f14 + 0.16f, 1.0f, 0.0f);
                                k51Var.invalidate();
                            }
                        }
                        int i15 = k51Var.f39712c;
                        if (b61Var.f36703s1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(k51Var.getX(), k51Var.getY());
                        if (k51Var.f39718w != null) {
                            gh.bb collectionParticles = b61Var.getCollectionParticles();
                            i9 = i13;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, k51Var.getWidth(), k51Var.getHeight());
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
                            canvas2.scale(f12, f13, k51Var.getWidth() / 2.0f, k51Var.getHeight() / 2.0f);
                            canvas2.rotate((i15 % 4) * 90, k51Var.getWidth() / 2.0f, k51Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, k51Var.f39718w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i9 = i13;
                            view = childAt;
                        }
                        boolean z15 = k51Var.H;
                        if ((z15 || k51Var.I || k51Var.O > 0.0f) && !k51Var.f39711b) {
                            if (z15 || k51Var.I) {
                                float f15 = k51Var.N;
                                if (f15 < 1.0f) {
                                    k51Var.N = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f15;
                                    invalidate();
                                }
                            }
                            if (!k51Var.H && !k51Var.I) {
                                float f16 = k51Var.N;
                                if (f16 > 0.0f) {
                                    k51Var.N = f16 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (k51Var.H) {
                                interpolation = org.telegram.ui.Components.gr.h.getInterpolation(k51Var.N);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - k51Var.N);
                            }
                            k51Var.O = Utilities.clamp(interpolation, 1.0f, 0.0f);
                            if (i14 == 6) {
                                f10 = 1.5f;
                            } else {
                                f10 = 1.0f;
                            }
                            int dp = AndroidUtilities.dp(f10);
                            if (i14 == 6) {
                                f11 = 6.0f;
                            } else {
                                f11 = 4.0f;
                            }
                            int dp2 = AndroidUtilities.dp(f11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, k51Var.getMeasuredWidth(), k51Var.getMeasuredHeight());
                            float f17 = dp;
                            rectF.inset(f17, f17);
                            if (!k51Var.f39710a) {
                                Drawable drawable = k51Var.A;
                                if (!(drawable instanceof org.telegram.ui.Components.k5) || !((org.telegram.ui.Components.k5) drawable).c()) {
                                    paint = b61Var2.H;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (k51Var.getAlpha() * alpha * k51Var.O));
                                    float f18 = dp2;
                                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = b61Var2.I;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (k51Var.getAlpha() * alpha2 * k51Var.O));
                            float f182 = dp2;
                            canvas2.drawRoundRect(rectF, f182, f182, paint);
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
                                arrayList3 = (ArrayList) e2.c.k(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(k51Var);
                        j51 j51Var = k51Var.F;
                        if (j51Var != null && j51Var.getVisibility() == 0 && k51Var.F.getImageReceiver() == null && (imageReceiver2 = k51Var.f39716r) != null) {
                            k51Var.F.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i9 = i13;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i17 = b61Var.J1;
                        List list = b61.V1;
                        if (R == i17 - 1) {
                            float interpolation2 = org.telegram.ui.Components.gr.f28845g.getInterpolation(g7.n.a(((float) (SystemClock.elapsedRealtime() - b61Var.L1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f19 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f19), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f20 = (f19 * 0.5f) + 0.5f;
                                canvas2.scale(f20, f20, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                b61Var.I1.draw(canvas2);
                                canvas2.restore();
                                i13 = i9 + 1;
                                z12 = z16;
                                i11 = 14;
                            }
                        }
                    }
                    i13 = i9 + 1;
                    z12 = z16;
                    i11 = 14;
                }
            }
            ArrayList arrayList6 = this.X2;
            arrayList6.clear();
            ArrayList arrayList7 = this.W2;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i18 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.V2;
                if (i18 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
                k51 k51Var2 = (k51) arrayList8.get(0);
                int R2 = RecyclerView.R(k51Var2);
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList6.size()) {
                        if (((c51) arrayList6.get(i19)).I == R2) {
                            c51Var = (c51) arrayList6.get(i19);
                            arrayList6.remove(i19);
                            break;
                        }
                        i19++;
                    } else {
                        c51Var = null;
                        break;
                    }
                }
                if (c51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        c51Var = (c51) e2.c.k(1, arrayList2);
                    } else {
                        c51Var = new c51(this);
                        c51Var.l(7);
                    }
                    c51Var.I = R2;
                    c51Var.e();
                }
                arrayList7.add(c51Var);
                c51Var.K = arrayList8;
                canvas2.save();
                canvas2.translate(k51Var2.getLeft(), k51Var2.getY());
                c51Var.J = k51Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (k51Var2.getLeft() * 2);
                int measuredHeight = k51Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    c51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i18++;
            }
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((c51) arrayList6.get(i20));
                    ((c51) arrayList6.get(i20)).K = null;
                    ((c51) arrayList6.get(i20)).k();
                } else {
                    ((c51) arrayList6.get(i20)).f();
                }
            }
            arrayList6.clear();
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 instanceof k51) {
                    k51 k51Var3 = (k51) childAt2;
                    j51 j51Var2 = k51Var3.F;
                    if (j51Var2 != null && j51Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((k51Var3.getX() + k51Var3.getMeasuredWidth()) - k51Var3.F.getMeasuredWidth()), (int) ((k51Var3.getY() + k51Var3.getMeasuredHeight()) - k51Var3.F.getMeasuredHeight()));
                        Drawable drawable2 = k51Var3.A;
                        if (drawable2 instanceof org.telegram.ui.Components.k5) {
                            imageReceiver = ((org.telegram.ui.Components.k5) drawable2).f29951k;
                        } else {
                            imageReceiver = k51Var3.h;
                        }
                        j51 j51Var3 = k51Var3.F;
                        if (!j51Var3.h) {
                            j51Var3.setImageReceiver(imageReceiver);
                        }
                        k51Var3.F.draw(canvas2);
                        canvas2.restore();
                    }
                    if (k51Var3.G != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f21 = dp3;
                        canvas2.translate((int) ((k51Var3.getX() + k51Var3.getMeasuredWidth()) - f21), (int) ((k51Var3.getY() + k51Var3.getMeasuredHeight()) - f21));
                        k51Var3.G.setBounds(0, 0, dp3, dp3);
                        k51Var3.G.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != b61Var.I1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = hg.h0.f10610c;
            if (runnable != null) {
                runnable.run();
                hg.h0.f10610c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (hg.h0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (hg.h0.b(this) || this.Y2) {
            return;
        }
        this.Y2 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b61 b61Var = this.a3;
        if (this == b61Var.f36669d0) {
            b61Var.R0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b61 b61Var = this.a3;
        if (this == b61Var.f36669d0) {
            b61Var.R0.onDetachedFromWindow();
        }
        w1(this.V2);
        w1(this.W2);
        w1(this.X2);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate(i9, i10, i11, i12);
    }
}
