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
public abstract class f51 extends org.telegram.ui.Components.jl0 {
    public final SparseArray T2;
    public final ArrayList U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public boolean Y2;
    public final LongSparseArray Z2;
    public final d61 f38001a3;

    public f51(d61 d61Var, Context context) {
        super(context, null);
        this.f38001a3 = d61Var;
        this.T2 = new SparseArray();
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Z2 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, this.f29709l2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((e51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f51.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        e51 e51Var;
        int i10;
        View view;
        int top;
        float interpolation;
        float f9;
        float f10;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver2;
        boolean z11;
        float f11;
        float f12;
        Canvas canvas2 = canvas;
        if (getVisibility() == 0) {
            this.Y2 = false;
            int saveCount = canvas2.getSaveCount();
            d61 d61Var = this.f38001a3;
            int i11 = d61Var.S;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.C1;
                if (!rect.isEmpty()) {
                    this.f29736z1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f29708k2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.f29736z1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.T2;
                int size = sparseArray.size();
                arrayList = this.U2;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (d61Var.L1 > 0 && SystemClock.elapsedRealtime() - d61Var.L1 < d61Var.g() && d61Var.I1 != null && d61Var.J1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.Z2 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof m51) {
                        m51 m51Var = (m51) childAt;
                        d61 d61Var2 = m51Var.R;
                        int i15 = d61Var2.S;
                        if (m51Var.isPressed()) {
                            float f13 = m51Var.J;
                            if (f13 != 1.0f && i15 != i12) {
                                m51Var.J = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                m51Var.invalidate();
                            }
                        }
                        int i16 = m51Var.f40428c;
                        if (d61Var.f37360s1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(m51Var.getX(), m51Var.getY());
                        if (m51Var.f40434w != null) {
                            jh.va collectionParticles = d61Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, m51Var.getWidth(), m51Var.getHeight());
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
                            canvas2.scale(f11, f12, m51Var.getWidth() / 2.0f, m51Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, m51Var.getWidth() / 2.0f, m51Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, m51Var.f40434w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = m51Var.H;
                        if ((z15 || m51Var.I || m51Var.O > 0.0f) && !m51Var.f40427b) {
                            if (z15 || m51Var.I) {
                                float f14 = m51Var.N;
                                if (f14 < 1.0f) {
                                    m51Var.N = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!m51Var.H && !m51Var.I) {
                                float f15 = m51Var.N;
                                if (f15 > 0.0f) {
                                    m51Var.N = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (m51Var.H) {
                                interpolation = org.telegram.ui.Components.jr.h.getInterpolation(m51Var.N);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.jr.h.getInterpolation(1.0f - m51Var.N);
                            }
                            m51Var.O = Utilities.clamp(interpolation, 1.0f, 0.0f);
                            if (i15 == 6) {
                                f9 = 1.5f;
                            } else {
                                f9 = 1.0f;
                            }
                            int dp = AndroidUtilities.dp(f9);
                            if (i15 == 6) {
                                f10 = 6.0f;
                            } else {
                                f10 = 4.0f;
                            }
                            int dp2 = AndroidUtilities.dp(f10);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, m51Var.getMeasuredWidth(), m51Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!m51Var.f40426a) {
                                Drawable drawable = m51Var.A;
                                if (!(drawable instanceof org.telegram.ui.Components.p5) || !((org.telegram.ui.Components.p5) drawable).c()) {
                                    paint = d61Var2.H;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (m51Var.getAlpha() * alpha * m51Var.O));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = d61Var2.I;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (m51Var.getAlpha() * alpha2 * m51Var.O));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (m51Var.getBackground() != null) {
                            m51Var.getBackground().setBounds((int) m51Var.getX(), (int) m51Var.getY(), m51Var.getWidth() + ((int) m51Var.getX()), m51Var.getHeight() + ((int) m51Var.getY()));
                            m51Var.getBackground().setAlpha((int) (m51Var.getAlpha() * 255));
                            m51Var.getBackground().draw(canvas2);
                            m51Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) com.google.android.recaptcha.internal.a.j(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(m51Var);
                        l51 l51Var = m51Var.F;
                        if (l51Var != null && l51Var.getVisibility() == 0 && m51Var.F.getImageReceiver() == null && (imageReceiver2 = m51Var.f40432r) != null) {
                            m51Var.F.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = d61Var.J1;
                        List list = d61.V1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.jr.f29801g.getInterpolation(i7.w.a(((float) (SystemClock.elapsedRealtime() - d61Var.L1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                d61Var.I1.draw(canvas2);
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
            ArrayList arrayList6 = this.X2;
            arrayList6.clear();
            ArrayList arrayList7 = this.W2;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.V2;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                m51 m51Var2 = (m51) arrayList8.get(0);
                int R2 = RecyclerView.R(m51Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((e51) arrayList6.get(i20)).I == R2) {
                            e51Var = (e51) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        e51Var = null;
                        break;
                    }
                }
                if (e51Var == null) {
                    if (!arrayList2.isEmpty()) {
                        e51Var = (e51) com.google.android.recaptcha.internal.a.j(1, arrayList2);
                    } else {
                        e51Var = new e51(this);
                        e51Var.l(7);
                    }
                    e51Var.I = R2;
                    e51Var.e();
                }
                arrayList7.add(e51Var);
                e51Var.K = arrayList8;
                canvas2.save();
                canvas2.translate(m51Var2.getLeft(), m51Var2.getY());
                e51Var.J = m51Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (m51Var2.getLeft() * 2);
                int measuredHeight = m51Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    e51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((e51) arrayList6.get(i21));
                    ((e51) arrayList6.get(i21)).K = null;
                    ((e51) arrayList6.get(i21)).k();
                } else {
                    ((e51) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof m51) {
                    m51 m51Var3 = (m51) childAt2;
                    l51 l51Var2 = m51Var3.F;
                    if (l51Var2 != null && l51Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((m51Var3.getX() + m51Var3.getMeasuredWidth()) - m51Var3.F.getMeasuredWidth()), (int) ((m51Var3.getY() + m51Var3.getMeasuredHeight()) - m51Var3.F.getMeasuredHeight()));
                        Drawable drawable2 = m51Var3.A;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            imageReceiver = ((org.telegram.ui.Components.p5) drawable2).f31593k;
                        } else {
                            imageReceiver = m51Var3.h;
                        }
                        l51 l51Var3 = m51Var3.F;
                        if (!l51Var3.h) {
                            l51Var3.setImageReceiver(imageReceiver);
                        }
                        m51Var3.F.draw(canvas2);
                        canvas2.restore();
                    }
                    if (m51Var3.G != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((m51Var3.getX() + m51Var3.getMeasuredWidth()) - f20), (int) ((m51Var3.getY() + m51Var3.getMeasuredHeight()) - f20));
                        m51Var3.G.setBounds(0, 0, dp3, dp3);
                        m51Var3.G.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != d61Var.I1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = kg.g0.f13717c;
            if (runnable != null) {
                runnable.run();
                kg.g0.f13717c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (kg.g0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (kg.g0.b(this) || this.Y2) {
            return;
        }
        this.Y2 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d61 d61Var = this.f38001a3;
        if (this == d61Var.f37326d0) {
            d61Var.R0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d61 d61Var = this.f38001a3;
        if (this == d61Var.f37326d0) {
            d61Var.R0.onDetachedFromWindow();
        }
        w1(this.V2);
        w1(this.W2);
        w1(this.X2);
    }

    @Override
    public void setAlpha(float f9) {
        super.setAlpha(f9);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
