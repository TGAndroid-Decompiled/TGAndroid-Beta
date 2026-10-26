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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public abstract class e51 extends org.telegram.ui.Components.mm0 {
    public final SparseArray f38998f3;
    public final ArrayList f38999g3;
    public final ArrayList f39000h3;
    public final ArrayList f39001i3;
    public final ArrayList f39002j3;
    public boolean f39003k3;
    public final LongSparseArray f39004l3;
    public final c61 f39005m3;

    public e51(c61 c61Var, Context context) {
        super(context, null);
        this.f39005m3 = c61Var;
        this.f38998f3 = new SparseArray();
        this.f38999g3 = new ArrayList();
        this.f39000h3 = new ArrayList();
        this.f39001i3 = new ArrayList();
        this.f39002j3 = new ArrayList();
        this.f39004l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.f23448i6, this.f30646n2);
    }

    public static void C1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((d51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e51.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        d51 d51Var;
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
            this.f39003k3 = false;
            int saveCount = canvas2.getSaveCount();
            c61 c61Var = this.f39005m3;
            int i11 = c61Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.E1;
                if (!rect.isEmpty()) {
                    this.B1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f30644m2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.B1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.f38998f3;
                int size = sparseArray.size();
                arrayList = this.f38999g3;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (c61Var.Q1 > 0 && SystemClock.elapsedRealtime() - c61Var.Q1 < c61Var.g() && c61Var.N1 != null && c61Var.O1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f39004l3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof l51) {
                        l51 l51Var = (l51) childAt;
                        c61 c61Var2 = l51Var.V;
                        int i15 = c61Var2.W;
                        if (l51Var.isPressed()) {
                            float f13 = l51Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                l51Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                l51Var.invalidate();
                            }
                        }
                        int i16 = l51Var.f41143c;
                        if (c61Var.f38335x1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(l51Var.getX(), l51Var.getY());
                        if (l51Var.f41148w != null) {
                            bi.td collectionParticles = c61Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, l51Var.getWidth(), l51Var.getHeight());
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
                            canvas2.scale(f11, f12, l51Var.getWidth() / 2.0f, l51Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, l51Var.getWidth() / 2.0f, l51Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, l51Var.f41148w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = l51Var.L;
                        if ((z15 || l51Var.M || l51Var.S > 0.0f) && !l51Var.f41142b) {
                            if (z15 || l51Var.M) {
                                float f14 = l51Var.R;
                                if (f14 < 1.0f) {
                                    l51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!l51Var.L && !l51Var.M) {
                                float f15 = l51Var.R;
                                if (f15 > 0.0f) {
                                    l51Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (l51Var.L) {
                                interpolation = org.telegram.ui.Components.ds.h.getInterpolation(l51Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.ds.h.getInterpolation(1.0f - l51Var.R);
                            }
                            l51Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, l51Var.getMeasuredWidth(), l51Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!l51Var.f41141a) {
                                Drawable drawable = l51Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.t5) || !((org.telegram.ui.Components.t5) drawable).c()) {
                                    paint = c61Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (l51Var.getAlpha() * alpha * l51Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = c61Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (l51Var.getAlpha() * alpha2 * l51Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (l51Var.getBackground() != null) {
                            l51Var.getBackground().setBounds((int) l51Var.getX(), (int) l51Var.getY(), l51Var.getWidth() + ((int) l51Var.getX()), l51Var.getHeight() + ((int) l51Var.getY()));
                            l51Var.getBackground().setAlpha((int) (l51Var.getAlpha() * 255));
                            l51Var.getBackground().draw(canvas2);
                            l51Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) ic.a.y(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(l51Var);
                        k51 k51Var = l51Var.J;
                        if (k51Var != null && k51Var.getVisibility() == 0 && l51Var.J.getImageReceiver() == null && (imageReceiver2 = l51Var.f41146r) != null) {
                            l51Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null && RecyclerView.R(view) == c61Var.O1 - 1) {
                        float interpolation2 = org.telegram.ui.Components.ds.f27587g.getInterpolation(a8.ee.a(((float) (SystemClock.elapsedRealtime() - c61Var.Q1)) / 200.0f, 0.0f, 1.0f));
                        if (interpolation2 < 1.0f) {
                            float f18 = 1.0f - interpolation2;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f19 = (f18 * 0.5f) + 0.5f;
                            canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            c61Var.N1.draw(canvas2);
                            canvas2.restore();
                            i14 = i10 + 1;
                            z12 = z16;
                            i12 = 14;
                        }
                    }
                    i14 = i10 + 1;
                    z12 = z16;
                    i12 = 14;
                }
            }
            ArrayList arrayList6 = this.f39002j3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f39001i3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i18 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f39000h3;
                if (i18 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
                l51 l51Var2 = (l51) arrayList8.get(0);
                int R = RecyclerView.R(l51Var2);
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList6.size()) {
                        if (((d51) arrayList6.get(i19)).M == R) {
                            d51Var = (d51) arrayList6.get(i19);
                            arrayList6.remove(i19);
                            break;
                        }
                        i19++;
                    } else {
                        d51Var = null;
                        break;
                    }
                }
                if (d51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        d51Var = (d51) ic.a.y(1, arrayList2);
                    } else {
                        d51Var = new d51(this);
                        d51Var.l(7);
                    }
                    d51Var.M = R;
                    d51Var.e();
                }
                arrayList7.add(d51Var);
                d51Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(l51Var2.getLeft(), l51Var2.getY());
                d51Var.N = l51Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (l51Var2.getLeft() * 2);
                int measuredHeight = l51Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    d51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i18++;
            }
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((d51) arrayList6.get(i20));
                    ((d51) arrayList6.get(i20)).O = null;
                    ((d51) arrayList6.get(i20)).k();
                } else {
                    ((d51) arrayList6.get(i20)).f();
                }
            }
            arrayList6.clear();
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 instanceof l51) {
                    l51 l51Var3 = (l51) childAt2;
                    k51 k51Var2 = l51Var3.J;
                    if (k51Var2 != null && k51Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((l51Var3.getX() + l51Var3.getMeasuredWidth()) - l51Var3.J.getMeasuredWidth()), (int) ((l51Var3.getY() + l51Var3.getMeasuredHeight()) - l51Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = l51Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.t5) {
                            imageReceiver = ((org.telegram.ui.Components.t5) drawable2).f32852k;
                        } else {
                            imageReceiver = l51Var3.h;
                        }
                        k51 k51Var3 = l51Var3.J;
                        if (!k51Var3.h) {
                            k51Var3.setImageReceiver(imageReceiver);
                        }
                        l51Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (l51Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((l51Var3.getX() + l51Var3.getMeasuredWidth()) - f20), (int) ((l51Var3.getY() + l51Var3.getMeasuredHeight()) - f20));
                        l51Var3.K.setBounds(0, 0, dp3, dp3);
                        l51Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != c61Var.N1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = bh.m0.f4083c;
            if (runnable != null) {
                runnable.run();
                bh.m0.f4083c = null;
            }
        }
    }

    @Override
    public final void g1() {
        if (bh.m0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override
    public final void invalidate() {
        if (bh.m0.b(this) || this.f39003k3) {
            return;
        }
        this.f39003k3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c61 c61Var = this.f39005m3;
        if (this == c61Var.f38299h0) {
            c61Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c61 c61Var = this.f39005m3;
        if (this == c61Var.f38299h0) {
            c61Var.V0.onDetachedFromWindow();
        }
        C1(this.f39000h3);
        C1(this.f39001i3);
        C1(this.f39002j3);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
