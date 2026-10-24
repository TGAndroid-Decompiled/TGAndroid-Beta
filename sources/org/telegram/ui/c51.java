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
public abstract class c51 extends org.telegram.ui.Components.lm0 {
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList f36222a3;
    public final ArrayList f36223b3;
    public final ArrayList f36224c3;
    public boolean f36225d3;
    public final LongSparseArray f36226e3;
    public final a61 f36227f3;

    public c51(a61 a61Var, Context context) {
        super(context, null);
        this.f36227f3 = a61Var;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.f36222a3 = new ArrayList();
        this.f36223b3 = new ArrayList();
        this.f36224c3 = new ArrayList();
        this.f36226e3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.f21273i6, this.f28396n2);
    }

    public static void C1(ArrayList arrayList) {
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
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        b51 b51Var;
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
            this.f36225d3 = false;
            int saveCount = canvas2.getSaveCount();
            a61 a61Var = this.f36227f3;
            int i11 = a61Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f28394m2;
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
            if (a61Var.Q1 > 0 && SystemClock.elapsedRealtime() - a61Var.Q1 < a61Var.g() && a61Var.N1 != null && a61Var.O1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f36226e3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof j51) {
                        j51 j51Var = (j51) childAt;
                        a61 a61Var2 = j51Var.V;
                        int i15 = a61Var2.W;
                        if (j51Var.isPressed()) {
                            float f13 = j51Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                j51Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                j51Var.invalidate();
                            }
                        }
                        int i16 = j51Var.f38464c;
                        if (a61Var.f35658x1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(j51Var.getX(), j51Var.getY());
                        if (j51Var.f38469w != null) {
                            ai.ee collectionParticles = a61Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, j51Var.getWidth(), j51Var.getHeight());
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
                            canvas2.scale(f11, f12, j51Var.getWidth() / 2.0f, j51Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, j51Var.getWidth() / 2.0f, j51Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, j51Var.f38469w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = j51Var.L;
                        if ((z15 || j51Var.M || j51Var.S > 0.0f) && !j51Var.f38463b) {
                            if (z15 || j51Var.M) {
                                float f14 = j51Var.R;
                                if (f14 < 1.0f) {
                                    j51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!j51Var.L && !j51Var.M) {
                                float f15 = j51Var.R;
                                if (f15 > 0.0f) {
                                    j51Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (j51Var.L) {
                                interpolation = org.telegram.ui.Components.zr.h.getInterpolation(j51Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.zr.h.getInterpolation(1.0f - j51Var.R);
                            }
                            j51Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, j51Var.getMeasuredWidth(), j51Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!j51Var.f38462a) {
                                Drawable drawable = j51Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.p5) || !((org.telegram.ui.Components.p5) drawable).c()) {
                                    paint = a61Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (j51Var.getAlpha() * alpha * j51Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = a61Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (j51Var.getAlpha() * alpha2 * j51Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (j51Var.getBackground() != null) {
                            j51Var.getBackground().setBounds((int) j51Var.getX(), (int) j51Var.getY(), j51Var.getWidth() + ((int) j51Var.getX()), j51Var.getHeight() + ((int) j51Var.getY()));
                            j51Var.getBackground().setAlpha((int) (j51Var.getAlpha() * 255));
                            j51Var.getBackground().draw(canvas2);
                            j51Var.getBackground().setAlpha(255);
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
                        arrayList3.add(j51Var);
                        i51 i51Var = j51Var.J;
                        if (i51Var != null && i51Var.getVisibility() == 0 && j51Var.J.getImageReceiver() == null && (imageReceiver2 = j51Var.f38467r) != null) {
                            j51Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = a61Var.O1;
                        List list = a61.a2;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.zr.f33338g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - a61Var.Q1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                a61Var.N1.draw(canvas2);
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
            ArrayList arrayList6 = this.f36224c3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f36223b3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f36222a3;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                j51 j51Var2 = (j51) arrayList8.get(0);
                int R2 = RecyclerView.R(j51Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((b51) arrayList6.get(i20)).M == R2) {
                            b51Var = (b51) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        b51Var = null;
                        break;
                    }
                }
                if (b51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        b51Var = (b51) i2.o1.A(1, arrayList2);
                    } else {
                        b51Var = new b51(this);
                        b51Var.l(7);
                    }
                    b51Var.M = R2;
                    b51Var.e();
                }
                arrayList7.add(b51Var);
                b51Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(j51Var2.getLeft(), j51Var2.getY());
                b51Var.N = j51Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (j51Var2.getLeft() * 2);
                int measuredHeight = j51Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    b51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((b51) arrayList6.get(i21));
                    ((b51) arrayList6.get(i21)).O = null;
                    ((b51) arrayList6.get(i21)).k();
                } else {
                    ((b51) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof j51) {
                    j51 j51Var3 = (j51) childAt2;
                    i51 i51Var2 = j51Var3.J;
                    if (i51Var2 != null && i51Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((j51Var3.getX() + j51Var3.getMeasuredWidth()) - j51Var3.J.getMeasuredWidth()), (int) ((j51Var3.getY() + j51Var3.getMeasuredHeight()) - j51Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = j51Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            imageReceiver = ((org.telegram.ui.Components.p5) drawable2).f29484k;
                        } else {
                            imageReceiver = j51Var3.h;
                        }
                        i51 i51Var3 = j51Var3.J;
                        if (!i51Var3.h) {
                            i51Var3.setImageReceiver(imageReceiver);
                        }
                        j51Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (j51Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((j51Var3.getX() + j51Var3.getMeasuredWidth()) - f20), (int) ((j51Var3.getY() + j51Var3.getMeasuredHeight()) - f20));
                        j51Var3.K.setBounds(0, 0, dp3, dp3);
                        j51Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != a61Var.N1) {
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
        if (ah.x0.b(this) || this.f36225d3) {
            return;
        }
        this.f36225d3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a61 a61Var = this.f36227f3;
        if (this == a61Var.f35622h0) {
            a61Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a61 a61Var = this.f36227f3;
        if (this == a61Var.f35622h0) {
            a61Var.V0.onDetachedFromWindow();
        }
        C1(this.f36222a3);
        C1(this.f36223b3);
        C1(this.f36224c3);
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
