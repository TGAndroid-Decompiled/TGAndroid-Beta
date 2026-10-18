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
public abstract class b51 extends org.telegram.ui.Components.im0 {
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public boolean f35551a3;
    public final LongSparseArray f35552b3;
    public final z51 f35553c3;

    public b51(z51 z51Var, Context context) {
        super(context, null);
        this.f35553c3 = z51Var;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f35552b3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, this.f27284n2));
    }

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((a51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b51.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        a51 a51Var;
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
            this.f35551a3 = false;
            int saveCount = canvas2.getSaveCount();
            z51 z51Var = this.f35553c3;
            int i11 = z51Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f27282m2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.B1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.V2;
                int size = sparseArray.size();
                arrayList = this.W2;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (z51Var.P1 > 0 && SystemClock.elapsedRealtime() - z51Var.P1 < z51Var.g() && z51Var.M1 != null && z51Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f35552b3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof i51) {
                        i51 i51Var = (i51) childAt;
                        z51 z51Var2 = i51Var.V;
                        int i15 = z51Var2.W;
                        if (i51Var.isPressed()) {
                            float f13 = i51Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                i51Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                i51Var.invalidate();
                            }
                        }
                        int i16 = i51Var.f37726c;
                        if (z51Var.f43619w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(i51Var.getX(), i51Var.getY());
                        if (i51Var.f37731w != null) {
                            ai.de collectionParticles = z51Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, i51Var.getWidth(), i51Var.getHeight());
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
                            canvas2.scale(f11, f12, i51Var.getWidth() / 2.0f, i51Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, i51Var.getWidth() / 2.0f, i51Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, i51Var.f37731w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = i51Var.L;
                        if ((z15 || i51Var.M || i51Var.S > 0.0f) && !i51Var.f37725b) {
                            if (z15 || i51Var.M) {
                                float f14 = i51Var.R;
                                if (f14 < 1.0f) {
                                    i51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!i51Var.L && !i51Var.M) {
                                float f15 = i51Var.R;
                                if (f15 > 0.0f) {
                                    i51Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (i51Var.L) {
                                interpolation = org.telegram.ui.Components.bs.h.getInterpolation(i51Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - i51Var.R);
                            }
                            i51Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, i51Var.getMeasuredWidth(), i51Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!i51Var.f37724a) {
                                Drawable drawable = i51Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.r5) || !((org.telegram.ui.Components.r5) drawable).c()) {
                                    paint = z51Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (i51Var.getAlpha() * alpha * i51Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = z51Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (i51Var.getAlpha() * alpha2 * i51Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (i51Var.getBackground() != null) {
                            i51Var.getBackground().setBounds((int) i51Var.getX(), (int) i51Var.getY(), i51Var.getWidth() + ((int) i51Var.getX()), i51Var.getHeight() + ((int) i51Var.getY()));
                            i51Var.getBackground().setAlpha((int) (i51Var.getAlpha() * 255));
                            i51Var.getBackground().draw(canvas2);
                            i51Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) i2.d.A(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(i51Var);
                        h51 h51Var = i51Var.J;
                        if (h51Var != null && h51Var.getVisibility() == 0 && i51Var.J.getImageReceiver() == null && (imageReceiver2 = i51Var.f37729r) != null) {
                            i51Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = z51Var.N1;
                        List list = z51.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.bs.f25031g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - z51Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                z51Var.M1.draw(canvas2);
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
            ArrayList arrayList6 = this.Z2;
            arrayList6.clear();
            ArrayList arrayList7 = this.Y2;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.X2;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                i51 i51Var2 = (i51) arrayList8.get(0);
                int R2 = RecyclerView.R(i51Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((a51) arrayList6.get(i20)).M == R2) {
                            a51Var = (a51) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        a51Var = null;
                        break;
                    }
                }
                if (a51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        a51Var = (a51) i2.d.A(1, arrayList2);
                    } else {
                        a51Var = new a51(this);
                        a51Var.l(7);
                    }
                    a51Var.M = R2;
                    a51Var.e();
                }
                arrayList7.add(a51Var);
                a51Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(i51Var2.getLeft(), i51Var2.getY());
                a51Var.N = i51Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (i51Var2.getLeft() * 2);
                int measuredHeight = i51Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    a51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((a51) arrayList6.get(i21));
                    ((a51) arrayList6.get(i21)).O = null;
                    ((a51) arrayList6.get(i21)).k();
                } else {
                    ((a51) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof i51) {
                    i51 i51Var3 = (i51) childAt2;
                    h51 h51Var2 = i51Var3.J;
                    if (h51Var2 != null && h51Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((i51Var3.getX() + i51Var3.getMeasuredWidth()) - i51Var3.J.getMeasuredWidth()), (int) ((i51Var3.getY() + i51Var3.getMeasuredHeight()) - i51Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = i51Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.r5) {
                            imageReceiver = ((org.telegram.ui.Components.r5) drawable2).f29842k;
                        } else {
                            imageReceiver = i51Var3.h;
                        }
                        h51 h51Var3 = i51Var3.J;
                        if (!h51Var3.h) {
                            h51Var3.setImageReceiver(imageReceiver);
                        }
                        i51Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (i51Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((i51Var3.getX() + i51Var3.getMeasuredWidth()) - f20), (int) ((i51Var3.getY() + i51Var3.getMeasuredHeight()) - f20));
                        i51Var3.K.setBounds(0, 0, dp3, dp3);
                        i51Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != z51Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = ah.x0.f904c;
            if (runnable != null) {
                runnable.run();
                ah.x0.f904c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (ah.x0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (ah.x0.b(this) || this.f35551a3) {
            return;
        }
        this.f35551a3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z51 z51Var = this.f35553c3;
        if (this == z51Var.f43586h0) {
            z51Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z51 z51Var = this.f35553c3;
        if (this == z51Var.f43586h0) {
            z51Var.V0.onDetachedFromWindow();
        }
        x1(this.X2);
        x1(this.Y2);
        x1(this.Z2);
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
