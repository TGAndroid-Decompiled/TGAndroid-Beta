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

public abstract class c51 extends org.telegram.ui.Components.zk0 {
    public final SparseArray T2;
    public final ArrayList U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public boolean Y2;
    public final LongSparseArray Z2;
    public final a61 a3;

    public c51(a61 a61Var, Context context) {
        super(context, null);
        this.a3 = a61Var;
        this.T2 = new SparseArray();
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Z2 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, this.f35277l2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((b51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c51.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        b51 b51Var;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver;
        boolean z10;
        Canvas canvas2 = canvas;
        if (getVisibility() != 0) {
            return;
        }
        this.Y2 = false;
        int saveCount = canvas2.getSaveCount();
        a61 a61Var = this.a3;
        int i10 = a61Var.S;
        int i11 = 14;
        if (i10 != 6 && i10 != 14 && i10 != 13) {
            Rect rect = this.C1;
            if (!rect.isEmpty()) {
                this.f35304z1.setBounds(rect);
                canvas2.save();
                q0.a aVar = this.f35276k2;
                if (aVar != null) {
                    aVar.accept(canvas2);
                }
                this.f35304z1.draw(canvas2);
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
        boolean z11 = a61Var.L1 > 0 && SystemClock.elapsedRealtime() - a61Var.L1 < a61Var.g() && a61Var.I1 != null && a61Var.J1 >= 0;
        if (this.Z2 != null) {
            int i13 = 0;
            boolean z12 = false;
            while (i13 < getChildCount()) {
                View childAt = getChildAt(i13);
                if (childAt instanceof j51) {
                    j51 j51Var = (j51) childAt;
                    a61 a61Var2 = j51Var.R;
                    int i14 = a61Var2.S;
                    if (j51Var.isPressed()) {
                        float f10 = j51Var.J;
                        if (f10 != 1.0f && i14 != i11) {
                            j51Var.J = Utilities.clamp(f10 + 0.16f, 1.0f, 0.0f);
                            j51Var.invalidate();
                        }
                    }
                    int i15 = j51Var.f39258c;
                    int y10 = a61Var.f36426s1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y10);
                    canvas2.save();
                    canvas2.translate(j51Var.getX(), j51Var.getY());
                    if (j51Var.f39264w != null) {
                        hh.bb collectionParticles = a61Var.getCollectionParticles();
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, j51Var.getWidth(), j51Var.getHeight());
                        if (z13) {
                            z10 = z13;
                        } else {
                            collectionParticles.d();
                            z10 = true;
                        }
                        canvas2.save();
                        int i16 = i15 % 6;
                        boolean z14 = z10;
                        canvas2.scale(i16 == 2 ? -1.0f : 1.0f, i16 == 2 ? -1.0f : 1.0f, j51Var.getWidth() / 2.0f, j51Var.getHeight() / 2.0f);
                        canvas2.rotate((i15 % 4) * 90, j51Var.getWidth() / 2.0f, j51Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, j51Var.f39264w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    }
                    boolean z15 = j51Var.H;
                    if ((z15 || j51Var.I || j51Var.O > 0.0f) && !j51Var.f39257b) {
                        if (z15 || j51Var.I) {
                            float f11 = j51Var.N;
                            if (f11 < 1.0f) {
                                j51Var.N = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f11;
                                invalidate();
                            }
                        }
                        if (!j51Var.H && !j51Var.I) {
                            float f12 = j51Var.N;
                            if (f12 > 0.0f) {
                                j51Var.N = f12 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        j51Var.O = Utilities.clamp(j51Var.H ? org.telegram.ui.Components.er.h.getInterpolation(j51Var.N) : 1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - j51Var.N), 1.0f, 0.0f);
                        int iDp = AndroidUtilities.dp(i14 == 6 ? 1.5f : 1.0f);
                        int iDp2 = AndroidUtilities.dp(i14 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, j51Var.getMeasuredWidth(), j51Var.getMeasuredHeight());
                        float f13 = iDp;
                        rectF.inset(f13, f13);
                        if (j51Var.f39256a) {
                            paint = a61Var2.I;
                        } else {
                            Drawable drawable = j51Var.A;
                            if ((drawable instanceof org.telegram.ui.Components.k5) && ((org.telegram.ui.Components.k5) drawable).c()) {
                                paint = a61Var2.I;
                            } else {
                                paint = a61Var2.H;
                            }
                        }
                        int alpha = paint.getAlpha();
                        paint.setAlpha((int) (j51Var.getAlpha() * alpha * j51Var.O));
                        float f14 = iDp2;
                        canvas2.drawRoundRect(rectF, f14, f14, paint);
                        paint.setAlpha(alpha);
                    }
                    canvas2.restore();
                    if (j51Var.getBackground() != null) {
                        j51Var.getBackground().setBounds((int) j51Var.getX(), (int) j51Var.getY(), j51Var.getWidth() + ((int) j51Var.getX()), j51Var.getHeight() + ((int) j51Var.getY()));
                        j51Var.getBackground().setAlpha((int) (j51Var.getAlpha() * 255));
                        j51Var.getBackground().draw(canvas2);
                        j51Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) com.google.android.recaptcha.internal.a.k(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(j51Var);
                    i51 i51Var = j51Var.F;
                    if (i51Var != null && i51Var.getVisibility() == 0 && j51Var.F.getImageReceiver() == null && (imageReceiver = j51Var.f39262r) != null) {
                        j51Var.F.setImageReceiver(imageReceiver);
                    }
                } else {
                    i13 = i13;
                    childAt = childAt;
                }
                boolean z16 = z12;
                if (z11 && childAt != null) {
                    int iR = RecyclerView.R(childAt);
                    int i17 = a61Var.J1;
                    List list = a61.V1;
                    if (iR == i17 - 1) {
                        float interpolation = org.telegram.ui.Components.er.f28123g.getInterpolation(h7.n.a((SystemClock.elapsedRealtime() - a61Var.L1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f15 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f15), 31);
                            canvas2.translate(childAt.getLeft(), childAt.getTop() + 0.0f);
                            float f16 = (f15 * 0.5f) + 0.5f;
                            canvas2.scale(f16, f16, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                            a61Var.I1.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                i13++;
                z12 = z16;
                i11 = 14;
            }
        }
        ArrayList arrayList6 = this.X2;
        arrayList6.clear();
        ArrayList arrayList7 = this.W2;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i18 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.V2;
            if (i18 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
            j51 j51Var2 = (j51) arrayList8.get(0);
            int iR2 = RecyclerView.R(j51Var2);
            int i19 = 0;
            while (true) {
                if (i19 >= arrayList6.size()) {
                    b51Var = null;
                    break;
                } else {
                    if (((b51) arrayList6.get(i19)).I == iR2) {
                        b51Var = (b51) arrayList6.get(i19);
                        arrayList6.remove(i19);
                        break;
                    }
                    i19++;
                }
            }
            if (b51Var == null) {
                if (arrayList2.isEmpty()) {
                    b51Var = new b51(this);
                    b51Var.l(7);
                } else {
                    b51Var = (b51) com.google.android.recaptcha.internal.a.k(1, arrayList2);
                }
                b51Var.I = iR2;
                b51Var.e();
            }
            arrayList7.add(b51Var);
            b51Var.K = arrayList8;
            canvas2.save();
            canvas2.translate(j51Var2.getLeft(), j51Var2.getY());
            b51Var.J = j51Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (j51Var2.getLeft() * 2);
            int measuredHeight = j51Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                b51Var.a(canvas3, jCurrentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i18++;
        }
        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((b51) arrayList6.get(i20));
                ((b51) arrayList6.get(i20)).K = null;
                ((b51) arrayList6.get(i20)).k();
            } else {
                ((b51) arrayList6.get(i20)).f();
            }
        }
        arrayList6.clear();
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2 instanceof j51) {
                j51 j51Var3 = (j51) childAt2;
                i51 i51Var2 = j51Var3.F;
                if (i51Var2 != null && i51Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((j51Var3.getX() + j51Var3.getMeasuredWidth()) - j51Var3.F.getMeasuredWidth()), (int) ((j51Var3.getY() + j51Var3.getMeasuredHeight()) - j51Var3.F.getMeasuredHeight()));
                    Drawable drawable2 = j51Var3.A;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.k5 ? ((org.telegram.ui.Components.k5) drawable2).f29961k : j51Var3.h;
                    i51 i51Var3 = j51Var3.F;
                    if (!i51Var3.h) {
                        i51Var3.setImageReceiver(imageReceiver2);
                    }
                    j51Var3.F.draw(canvas2);
                    canvas2.restore();
                }
                if (j51Var3.G != null) {
                    canvas2.save();
                    int iDp3 = AndroidUtilities.dp(17.0f);
                    float f17 = iDp3;
                    canvas2.translate((int) ((j51Var3.getX() + j51Var3.getMeasuredWidth()) - f17), (int) ((j51Var3.getY() + j51Var3.getMeasuredHeight()) - f17));
                    j51Var3.G.setBounds(0, 0, iDp3, iDp3);
                    j51Var3.G.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != a61Var.I1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = ig.g0.f11304c;
        if (runnable != null) {
            runnable.run();
            ig.g0.f11304c = null;
        }
    }

    @Override
    public final void f1() {
        if (ig.g0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (ig.g0.b(this) || this.Y2) {
            return;
        }
        this.Y2 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a61 a61Var = this.a3;
        if (this == a61Var.f36392d0) {
            a61Var.R0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a61 a61Var = this.a3;
        if (this == a61Var.f36392d0) {
            a61Var.R0.onDetachedFromWindow();
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
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
