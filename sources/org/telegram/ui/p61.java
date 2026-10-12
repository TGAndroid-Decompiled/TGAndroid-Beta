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
public abstract class p61 extends org.telegram.ui.Components.wm0 {
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public boolean f40865a3;
    public final LongSparseArray f40866b3;
    public final n71 f40867c3;

    public p61(n71 n71Var, Context context) {
        super(context, null);
        this.f40867c3 = n71Var;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f40866b3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, this.f32467n2));
    }

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((o61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p61.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        o61 o61Var;
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
            this.f40865a3 = false;
            int saveCount = canvas2.getSaveCount();
            n71 n71Var = this.f40867c3;
            int i11 = n71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f32465m2;
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
            if (n71Var.P1 > 0 && SystemClock.elapsedRealtime() - n71Var.P1 < n71Var.g() && n71Var.M1 != null && n71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f40866b3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof w61) {
                        w61 w61Var = (w61) childAt;
                        n71 n71Var2 = w61Var.V;
                        int i15 = n71Var2.W;
                        if (w61Var.isPressed()) {
                            float f13 = w61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                w61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                w61Var.invalidate();
                            }
                        }
                        int i16 = w61Var.f43056c;
                        if (n71Var.f40308w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(w61Var.getX(), w61Var.getY());
                        if (w61Var.f43062w != null) {
                            yh.b8 collectionParticles = n71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, w61Var.getWidth(), w61Var.getHeight());
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
                            canvas2.scale(f11, f12, w61Var.getWidth() / 2.0f, w61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, w61Var.getWidth() / 2.0f, w61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, w61Var.f43062w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = w61Var.L;
                        if ((z15 || w61Var.M || w61Var.S > 0.0f) && !w61Var.f43055b) {
                            if (z15 || w61Var.M) {
                                float f14 = w61Var.R;
                                if (f14 < 1.0f) {
                                    w61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!w61Var.L && !w61Var.M) {
                                float f15 = w61Var.R;
                                if (f15 > 0.0f) {
                                    w61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (w61Var.L) {
                                interpolation = org.telegram.ui.Components.js.h.getInterpolation(w61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.js.h.getInterpolation(1.0f - w61Var.R);
                            }
                            w61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, w61Var.getMeasuredWidth(), w61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!w61Var.f43054a) {
                                Drawable drawable = w61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.s5) || !((org.telegram.ui.Components.s5) drawable).c()) {
                                    paint = n71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (w61Var.getAlpha() * alpha * w61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = n71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (w61Var.getAlpha() * alpha2 * w61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (w61Var.getBackground() != null) {
                            w61Var.getBackground().setBounds((int) w61Var.getX(), (int) w61Var.getY(), w61Var.getWidth() + ((int) w61Var.getX()), w61Var.getHeight() + ((int) w61Var.getY()));
                            w61Var.getBackground().setAlpha((int) (w61Var.getAlpha() * 255));
                            w61Var.getBackground().draw(canvas2);
                            w61Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) hg.c.A(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(w61Var);
                        v61 v61Var = w61Var.J;
                        if (v61Var != null && v61Var.getVisibility() == 0 && w61Var.J.getImageReceiver() == null && (imageReceiver2 = w61Var.f43060r) != null) {
                            w61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = n71Var.N1;
                        List list = n71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.js.f27635g.getInterpolation(w7.n.a(((float) (SystemClock.elapsedRealtime() - n71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                n71Var.M1.draw(canvas2);
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
                w61 w61Var2 = (w61) arrayList8.get(0);
                int R2 = RecyclerView.R(w61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((o61) arrayList6.get(i20)).M == R2) {
                            o61Var = (o61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        o61Var = null;
                        break;
                    }
                }
                if (o61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        o61Var = (o61) hg.c.A(1, arrayList2);
                    } else {
                        o61Var = new o61(this);
                        o61Var.l(7);
                    }
                    o61Var.M = R2;
                    o61Var.e();
                }
                arrayList7.add(o61Var);
                o61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(w61Var2.getLeft(), w61Var2.getY());
                o61Var.N = w61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (w61Var2.getLeft() * 2);
                int measuredHeight = w61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    o61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((o61) arrayList6.get(i21));
                    ((o61) arrayList6.get(i21)).O = null;
                    ((o61) arrayList6.get(i21)).k();
                } else {
                    ((o61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof w61) {
                    w61 w61Var3 = (w61) childAt2;
                    v61 v61Var2 = w61Var3.J;
                    if (v61Var2 != null && v61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((w61Var3.getX() + w61Var3.getMeasuredWidth()) - w61Var3.J.getMeasuredWidth()), (int) ((w61Var3.getY() + w61Var3.getMeasuredHeight()) - w61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = w61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            imageReceiver = ((org.telegram.ui.Components.s5) drawable2).f30402k;
                        } else {
                            imageReceiver = w61Var3.h;
                        }
                        v61 v61Var3 = w61Var3.J;
                        if (!v61Var3.h) {
                            v61Var3.setImageReceiver(imageReceiver);
                        }
                        w61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (w61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((w61Var3.getX() + w61Var3.getMeasuredWidth()) - f20), (int) ((w61Var3.getY() + w61Var3.getMeasuredHeight()) - f20));
                        w61Var3.K.setBounds(0, 0, dp3, dp3);
                        w61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != n71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = zg.d0.f54735c;
            if (runnable != null) {
                runnable.run();
                zg.d0.f54735c = null;
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
        if (zg.d0.b(this) || this.f40865a3) {
            return;
        }
        this.f40865a3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n71 n71Var = this.f40867c3;
        if (this == n71Var.f40275h0) {
            n71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n71 n71Var = this.f40867c3;
        if (this == n71Var.f40275h0) {
            n71Var.V0.onDetachedFromWindow();
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
