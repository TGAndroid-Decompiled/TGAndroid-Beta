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
public abstract class m61 extends org.telegram.ui.Components.qm0 {
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public boolean f39776a3;
    public final LongSparseArray f39777b3;
    public final k71 f39778c3;

    public m61(k71 k71Var, Context context) {
        super(context, null);
        this.f39778c3 = k71Var;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f39777b3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, this.f30216n2));
    }

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((l61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m61.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        l61 l61Var;
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
            this.f39776a3 = false;
            int saveCount = canvas2.getSaveCount();
            k71 k71Var = this.f39778c3;
            int i11 = k71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f30214m2;
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
            if (k71Var.P1 > 0 && SystemClock.elapsedRealtime() - k71Var.P1 < k71Var.g() && k71Var.M1 != null && k71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f39777b3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof t61) {
                        t61 t61Var = (t61) childAt;
                        k71 k71Var2 = t61Var.V;
                        int i15 = k71Var2.W;
                        if (t61Var.isPressed()) {
                            float f13 = t61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                t61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                t61Var.invalidate();
                            }
                        }
                        int i16 = t61Var.f41870c;
                        if (k71Var.f39163w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(t61Var.getX(), t61Var.getY());
                        if (t61Var.f41876w != null) {
                            yh.b8 collectionParticles = k71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, t61Var.getWidth(), t61Var.getHeight());
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
                            canvas2.scale(f11, f12, t61Var.getWidth() / 2.0f, t61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, t61Var.getWidth() / 2.0f, t61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, t61Var.f41876w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = t61Var.L;
                        if ((z15 || t61Var.M || t61Var.S > 0.0f) && !t61Var.f41869b) {
                            if (z15 || t61Var.M) {
                                float f14 = t61Var.R;
                                if (f14 < 1.0f) {
                                    t61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!t61Var.L && !t61Var.M) {
                                float f15 = t61Var.R;
                                if (f15 > 0.0f) {
                                    t61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (t61Var.L) {
                                interpolation = org.telegram.ui.Components.hs.h.getInterpolation(t61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.hs.h.getInterpolation(1.0f - t61Var.R);
                            }
                            t61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, t61Var.getMeasuredWidth(), t61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!t61Var.f41868a) {
                                Drawable drawable = t61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.s5) || !((org.telegram.ui.Components.s5) drawable).c()) {
                                    paint = k71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (t61Var.getAlpha() * alpha * t61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = k71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (t61Var.getAlpha() * alpha2 * t61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (t61Var.getBackground() != null) {
                            t61Var.getBackground().setBounds((int) t61Var.getX(), (int) t61Var.getY(), t61Var.getWidth() + ((int) t61Var.getX()), t61Var.getHeight() + ((int) t61Var.getY()));
                            t61Var.getBackground().setAlpha((int) (t61Var.getAlpha() * 255));
                            t61Var.getBackground().draw(canvas2);
                            t61Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) hg.c.x(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(t61Var);
                        s61 s61Var = t61Var.J;
                        if (s61Var != null && s61Var.getVisibility() == 0 && t61Var.J.getImageReceiver() == null && (imageReceiver2 = t61Var.f41874r) != null) {
                            t61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = k71Var.N1;
                        List list = k71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.hs.f27119g.getInterpolation(w7.o.a(((float) (SystemClock.elapsedRealtime() - k71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                k71Var.M1.draw(canvas2);
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
                t61 t61Var2 = (t61) arrayList8.get(0);
                int R2 = RecyclerView.R(t61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((l61) arrayList6.get(i20)).M == R2) {
                            l61Var = (l61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        l61Var = null;
                        break;
                    }
                }
                if (l61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        l61Var = (l61) hg.c.x(1, arrayList2);
                    } else {
                        l61Var = new l61(this);
                        l61Var.l(7);
                    }
                    l61Var.M = R2;
                    l61Var.e();
                }
                arrayList7.add(l61Var);
                l61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(t61Var2.getLeft(), t61Var2.getY());
                l61Var.N = t61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (t61Var2.getLeft() * 2);
                int measuredHeight = t61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    l61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((l61) arrayList6.get(i21));
                    ((l61) arrayList6.get(i21)).O = null;
                    ((l61) arrayList6.get(i21)).k();
                } else {
                    ((l61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof t61) {
                    t61 t61Var3 = (t61) childAt2;
                    s61 s61Var2 = t61Var3.J;
                    if (s61Var2 != null && s61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((t61Var3.getX() + t61Var3.getMeasuredWidth()) - t61Var3.J.getMeasuredWidth()), (int) ((t61Var3.getY() + t61Var3.getMeasuredHeight()) - t61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = t61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            imageReceiver = ((org.telegram.ui.Components.s5) drawable2).f30654k;
                        } else {
                            imageReceiver = t61Var3.h;
                        }
                        s61 s61Var3 = t61Var3.J;
                        if (!s61Var3.h) {
                            s61Var3.setImageReceiver(imageReceiver);
                        }
                        t61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (t61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((t61Var3.getX() + t61Var3.getMeasuredWidth()) - f20), (int) ((t61Var3.getY() + t61Var3.getMeasuredHeight()) - f20));
                        t61Var3.K.setBounds(0, 0, dp3, dp3);
                        t61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != k71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = zg.d0.f54501c;
            if (runnable != null) {
                runnable.run();
                zg.d0.f54501c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (zg.d0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (zg.d0.b(this) || this.f39776a3) {
            return;
        }
        this.f39776a3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k71 k71Var = this.f39778c3;
        if (this == k71Var.f39130h0) {
            k71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k71 k71Var = this.f39778c3;
        if (this == k71Var.f39130h0) {
            k71Var.V0.onDetachedFromWindow();
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
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
