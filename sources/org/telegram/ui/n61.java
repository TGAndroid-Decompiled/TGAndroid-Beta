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
public abstract class n61 extends org.telegram.ui.Components.vl0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f35138a3;
    public final ArrayList f35139b3;
    public boolean f35140c3;
    public final LongSparseArray f35141d3;
    public final l71 f35142e3;

    public n61(l71 l71Var, Context context) {
        super(context, null);
        this.f35142e3 = l71Var;
        this.X2 = new SparseArray();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f35138a3 = new ArrayList();
        this.f35139b3 = new ArrayList();
        this.f35141d3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, this.f27987p2));
    }

    public static void v1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((m61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n61.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        m61 m61Var;
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
            this.f35140c3 = false;
            int saveCount = canvas2.getSaveCount();
            l71 l71Var = this.f35142e3;
            int i11 = l71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.G1;
                if (!rect.isEmpty()) {
                    this.D1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f27985o2;
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
            if (l71Var.P1 > 0 && SystemClock.elapsedRealtime() - l71Var.P1 < l71Var.g() && l71Var.M1 != null && l71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f35141d3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof u61) {
                        u61 u61Var = (u61) childAt;
                        l71 l71Var2 = u61Var.V;
                        int i15 = l71Var2.W;
                        if (u61Var.isPressed()) {
                            float f13 = u61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                u61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                u61Var.invalidate();
                            }
                        }
                        int i16 = u61Var.f37129c;
                        if (l71Var.f34603w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(u61Var.getX(), u61Var.getY());
                        if (u61Var.f37134w != null) {
                            xh.l8 collectionParticles = l71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, u61Var.getWidth(), u61Var.getHeight());
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
                            canvas2.scale(f11, f12, u61Var.getWidth() / 2.0f, u61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, u61Var.getWidth() / 2.0f, u61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, u61Var.f37134w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = u61Var.L;
                        if ((z15 || u61Var.M || u61Var.S > 0.0f) && !u61Var.f37128b) {
                            if (z15 || u61Var.M) {
                                float f14 = u61Var.R;
                                if (f14 < 1.0f) {
                                    u61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!u61Var.L && !u61Var.M) {
                                float f15 = u61Var.R;
                                if (f15 > 0.0f) {
                                    u61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (u61Var.L) {
                                interpolation = org.telegram.ui.Components.wr.h.getInterpolation(u61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.wr.h.getInterpolation(1.0f - u61Var.R);
                            }
                            u61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, u61Var.getMeasuredWidth(), u61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!u61Var.f37127a) {
                                Drawable drawable = u61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.p5) || !((org.telegram.ui.Components.p5) drawable).c()) {
                                    paint = l71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (u61Var.getAlpha() * alpha * u61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = l71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (u61Var.getAlpha() * alpha2 * u61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (u61Var.getBackground() != null) {
                            u61Var.getBackground().setBounds((int) u61Var.getX(), (int) u61Var.getY(), u61Var.getWidth() + ((int) u61Var.getX()), u61Var.getHeight() + ((int) u61Var.getY()));
                            u61Var.getBackground().setAlpha((int) (u61Var.getAlpha() * 255));
                            u61Var.getBackground().draw(canvas2);
                            u61Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) hc.b.z(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(u61Var);
                        t61 t61Var = u61Var.J;
                        if (t61Var != null && t61Var.getVisibility() == 0 && u61Var.J.getImageReceiver() == null && (imageReceiver2 = u61Var.f37132r) != null) {
                            u61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = l71Var.N1;
                        List list = l71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.wr.f28820g.getInterpolation(w7.q.a(((float) (SystemClock.elapsedRealtime() - l71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                l71Var.M1.draw(canvas2);
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
            ArrayList arrayList6 = this.f35139b3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f35138a3;
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
                u61 u61Var2 = (u61) arrayList8.get(0);
                int R2 = RecyclerView.R(u61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((m61) arrayList6.get(i20)).M == R2) {
                            m61Var = (m61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        m61Var = null;
                        break;
                    }
                }
                if (m61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        m61Var = (m61) hc.b.z(1, arrayList2);
                    } else {
                        m61Var = new m61(this);
                        m61Var.l(7);
                    }
                    m61Var.M = R2;
                    m61Var.e();
                }
                arrayList7.add(m61Var);
                m61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(u61Var2.getLeft(), u61Var2.getY());
                m61Var.N = u61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (u61Var2.getLeft() * 2);
                int measuredHeight = u61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    m61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((m61) arrayList6.get(i21));
                    ((m61) arrayList6.get(i21)).O = null;
                    ((m61) arrayList6.get(i21)).k();
                } else {
                    ((m61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof u61) {
                    u61 u61Var3 = (u61) childAt2;
                    t61 t61Var2 = u61Var3.J;
                    if (t61Var2 != null && t61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((u61Var3.getX() + u61Var3.getMeasuredWidth()) - u61Var3.J.getMeasuredWidth()), (int) ((u61Var3.getY() + u61Var3.getMeasuredHeight()) - u61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = u61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            imageReceiver = ((org.telegram.ui.Components.p5) drawable2).f26033k;
                        } else {
                            imageReceiver = u61Var3.h;
                        }
                        t61 t61Var3 = u61Var3.J;
                        if (!t61Var3.h) {
                            t61Var3.setImageReceiver(imageReceiver);
                        }
                        u61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (u61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((u61Var3.getX() + u61Var3.getMeasuredWidth()) - f20), (int) ((u61Var3.getY() + u61Var3.getMeasuredHeight()) - f20));
                        u61Var3.K.setBounds(0, 0, dp3, dp3);
                        u61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != l71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = yg.f0.f46997c;
            if (runnable != null) {
                runnable.run();
                yg.f0.f46997c = null;
            }
        }
    }

    @Override
    public final void e1() {
        if (yg.f0.b(this)) {
            return;
        }
        super.e1();
    }

    @Override
    public final void invalidate() {
        if (yg.f0.b(this) || this.f35140c3) {
            return;
        }
        this.f35140c3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l71 l71Var = this.f35142e3;
        if (this == l71Var.f34570h0) {
            l71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l71 l71Var = this.f35142e3;
        if (this == l71Var.f34570h0) {
            l71Var.V0.onDetachedFromWindow();
        }
        v1(this.Z2);
        v1(this.f35138a3);
        v1(this.f35139b3);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
