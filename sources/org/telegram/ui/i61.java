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
public abstract class i61 extends org.telegram.ui.Components.ll0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f34517a3;
    public final ArrayList f34518b3;
    public boolean f34519c3;
    public final LongSparseArray f34520d3;
    public final g71 f34521e3;

    public i61(g71 g71Var, Context context) {
        super(context, null);
        this.f34521e3 = g71Var;
        this.X2 = new SparseArray();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f34517a3 = new ArrayList();
        this.f34518b3 = new ArrayList();
        this.f34520d3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18926i6, this.f25966p2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((h61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i61.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        h61 h61Var;
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
            this.f34519c3 = false;
            int saveCount = canvas2.getSaveCount();
            g71 g71Var = this.f34521e3;
            int i11 = g71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.G1;
                if (!rect.isEmpty()) {
                    this.D1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f25964o2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.D1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.X2;
                int size = sparseArray.size();
                arrayList = this.Y2;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (g71Var.P1 > 0 && SystemClock.elapsedRealtime() - g71Var.P1 < g71Var.g() && g71Var.M1 != null && g71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f34520d3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof p61) {
                        p61 p61Var = (p61) childAt;
                        g71 g71Var2 = p61Var.V;
                        int i15 = g71Var2.W;
                        if (p61Var.isPressed()) {
                            float f13 = p61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                p61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                p61Var.invalidate();
                            }
                        }
                        int i16 = p61Var.f36446c;
                        if (g71Var.f33829w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(p61Var.getX(), p61Var.getY());
                        if (p61Var.f36451w != null) {
                            yh.k8 collectionParticles = g71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, p61Var.getWidth(), p61Var.getHeight());
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
                            canvas2.scale(f11, f12, p61Var.getWidth() / 2.0f, p61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, p61Var.getWidth() / 2.0f, p61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, p61Var.f36451w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = p61Var.L;
                        if ((z15 || p61Var.M || p61Var.S > 0.0f) && !p61Var.f36445b) {
                            if (z15 || p61Var.M) {
                                float f14 = p61Var.R;
                                if (f14 < 1.0f) {
                                    p61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!p61Var.L && !p61Var.M) {
                                float f15 = p61Var.R;
                                if (f15 > 0.0f) {
                                    p61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (p61Var.L) {
                                interpolation = org.telegram.ui.Components.qr.h.getInterpolation(p61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.qr.h.getInterpolation(1.0f - p61Var.R);
                            }
                            p61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, p61Var.getMeasuredWidth(), p61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!p61Var.f36444a) {
                                Drawable drawable = p61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.o5) || !((org.telegram.ui.Components.o5) drawable).c()) {
                                    paint = g71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (p61Var.getAlpha() * alpha * p61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = g71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (p61Var.getAlpha() * alpha2 * p61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (p61Var.getBackground() != null) {
                            p61Var.getBackground().setBounds((int) p61Var.getX(), (int) p61Var.getY(), p61Var.getWidth() + ((int) p61Var.getX()), p61Var.getHeight() + ((int) p61Var.getY()));
                            p61Var.getBackground().setAlpha((int) (p61Var.getAlpha() * 255));
                            p61Var.getBackground().draw(canvas2);
                            p61Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) hg.k0.z(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(p61Var);
                        o61 o61Var = p61Var.J;
                        if (o61Var != null && o61Var.getVisibility() == 0 && p61Var.J.getImageReceiver() == null && (imageReceiver2 = p61Var.f36449r) != null) {
                            p61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = g71Var.N1;
                        List list = g71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.qr.f27424g.getInterpolation(w7.p.a(((float) (SystemClock.elapsedRealtime() - g71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                g71Var.M1.draw(canvas2);
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
            ArrayList arrayList6 = this.f34518b3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f34517a3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.Z2;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                p61 p61Var2 = (p61) arrayList8.get(0);
                int R2 = RecyclerView.R(p61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((h61) arrayList6.get(i20)).M == R2) {
                            h61Var = (h61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        h61Var = null;
                        break;
                    }
                }
                if (h61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        h61Var = (h61) hg.k0.z(1, arrayList2);
                    } else {
                        h61Var = new h61(this);
                        h61Var.l(7);
                    }
                    h61Var.M = R2;
                    h61Var.e();
                }
                arrayList7.add(h61Var);
                h61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(p61Var2.getLeft(), p61Var2.getY());
                h61Var.N = p61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (p61Var2.getLeft() * 2);
                int measuredHeight = p61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    h61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((h61) arrayList6.get(i21));
                    ((h61) arrayList6.get(i21)).O = null;
                    ((h61) arrayList6.get(i21)).k();
                } else {
                    ((h61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof p61) {
                    p61 p61Var3 = (p61) childAt2;
                    o61 o61Var2 = p61Var3.J;
                    if (o61Var2 != null && o61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((p61Var3.getX() + p61Var3.getMeasuredWidth()) - p61Var3.J.getMeasuredWidth()), (int) ((p61Var3.getY() + p61Var3.getMeasuredHeight()) - p61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = p61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            imageReceiver = ((org.telegram.ui.Components.o5) drawable2).f26692k;
                        } else {
                            imageReceiver = p61Var3.h;
                        }
                        o61 o61Var3 = p61Var3.J;
                        if (!o61Var3.h) {
                            o61Var3.setImageReceiver(imageReceiver);
                        }
                        p61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (p61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((p61Var3.getX() + p61Var3.getMeasuredWidth()) - f20), (int) ((p61Var3.getY() + p61Var3.getMeasuredHeight()) - f20));
                        p61Var3.K.setBounds(0, 0, dp3, dp3);
                        p61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != g71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = zg.f0.f49024c;
            if (runnable != null) {
                runnable.run();
                zg.f0.f49024c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (zg.f0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (zg.f0.b(this) || this.f34519c3) {
            return;
        }
        this.f34519c3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g71 g71Var = this.f34521e3;
        if (this == g71Var.f33796h0) {
            g71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g71 g71Var = this.f34521e3;
        if (this == g71Var.f33796h0) {
            g71Var.V0.onDetachedFromWindow();
        }
        w1(this.Z2);
        w1(this.f34517a3);
        w1(this.f34518b3);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
