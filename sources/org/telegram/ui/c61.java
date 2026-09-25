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
public abstract class c61 extends org.telegram.ui.Components.wl0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f32582a3;
    public final ArrayList f32583b3;
    public boolean f32584c3;
    public final LongSparseArray f32585d3;
    public final a71 f32586e3;

    public c61(a71 a71Var, Context context) {
        super(context, null);
        this.f32586e3 = a71Var;
        this.X2 = new SparseArray();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f32582a3 = new ArrayList();
        this.f32583b3 = new ArrayList();
        this.f32585d3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19149i6, this.f30115p2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((b61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c61.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        b61 b61Var;
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
            this.f32584c3 = false;
            int saveCount = canvas2.getSaveCount();
            a71 a71Var = this.f32586e3;
            int i11 = a71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.G1;
                if (!rect.isEmpty()) {
                    this.D1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f30113o2;
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
            if (a71Var.P1 > 0 && SystemClock.elapsedRealtime() - a71Var.P1 < a71Var.g() && a71Var.M1 != null && a71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f32585d3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof j61) {
                        j61 j61Var = (j61) childAt;
                        a71 a71Var2 = j61Var.V;
                        int i15 = a71Var2.W;
                        if (j61Var.isPressed()) {
                            float f13 = j61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                j61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                j61Var.invalidate();
                            }
                        }
                        int i16 = j61Var.f34665c;
                        if (a71Var.f32061w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(j61Var.getX(), j61Var.getY());
                        if (j61Var.f34670w != null) {
                            yh.i8 collectionParticles = a71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, j61Var.getWidth(), j61Var.getHeight());
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
                            canvas2.scale(f11, f12, j61Var.getWidth() / 2.0f, j61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, j61Var.getWidth() / 2.0f, j61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, j61Var.f34670w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = j61Var.L;
                        if ((z15 || j61Var.M || j61Var.S > 0.0f) && !j61Var.f34664b) {
                            if (z15 || j61Var.M) {
                                float f14 = j61Var.R;
                                if (f14 < 1.0f) {
                                    j61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!j61Var.L && !j61Var.M) {
                                float f15 = j61Var.R;
                                if (f15 > 0.0f) {
                                    j61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (j61Var.L) {
                                interpolation = org.telegram.ui.Components.rr.h.getInterpolation(j61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.rr.h.getInterpolation(1.0f - j61Var.R);
                            }
                            j61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, j61Var.getMeasuredWidth(), j61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!j61Var.f34663a) {
                                Drawable drawable = j61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.q5) || !((org.telegram.ui.Components.q5) drawable).c()) {
                                    paint = a71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (j61Var.getAlpha() * alpha * j61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = a71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (j61Var.getAlpha() * alpha2 * j61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (j61Var.getBackground() != null) {
                            j61Var.getBackground().setBounds((int) j61Var.getX(), (int) j61Var.getY(), j61Var.getWidth() + ((int) j61Var.getX()), j61Var.getHeight() + ((int) j61Var.getY()));
                            j61Var.getBackground().setAlpha((int) (j61Var.getAlpha() * 255));
                            j61Var.getBackground().draw(canvas2);
                            j61Var.getBackground().setAlpha(255);
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
                        arrayList3.add(j61Var);
                        i61 i61Var = j61Var.J;
                        if (i61Var != null && i61Var.getVisibility() == 0 && j61Var.J.getImageReceiver() == null && (imageReceiver2 = j61Var.f34668r) != null) {
                            j61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = a71Var.N1;
                        List list = a71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.rr.f28032g.getInterpolation(w7.q.a(((float) (SystemClock.elapsedRealtime() - a71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                a71Var.M1.draw(canvas2);
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
            ArrayList arrayList6 = this.f32583b3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f32582a3;
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
                j61 j61Var2 = (j61) arrayList8.get(0);
                int R2 = RecyclerView.R(j61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((b61) arrayList6.get(i20)).M == R2) {
                            b61Var = (b61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        b61Var = null;
                        break;
                    }
                }
                if (b61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        b61Var = (b61) hg.c.x(1, arrayList2);
                    } else {
                        b61Var = new b61(this);
                        b61Var.l(7);
                    }
                    b61Var.M = R2;
                    b61Var.e();
                }
                arrayList7.add(b61Var);
                b61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(j61Var2.getLeft(), j61Var2.getY());
                b61Var.N = j61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (j61Var2.getLeft() * 2);
                int measuredHeight = j61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    b61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((b61) arrayList6.get(i21));
                    ((b61) arrayList6.get(i21)).O = null;
                    ((b61) arrayList6.get(i21)).k();
                } else {
                    ((b61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof j61) {
                    j61 j61Var3 = (j61) childAt2;
                    i61 i61Var2 = j61Var3.J;
                    if (i61Var2 != null && i61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((j61Var3.getX() + j61Var3.getMeasuredWidth()) - j61Var3.J.getMeasuredWidth()), (int) ((j61Var3.getY() + j61Var3.getMeasuredHeight()) - j61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = j61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.q5) {
                            imageReceiver = ((org.telegram.ui.Components.q5) drawable2).f27505k;
                        } else {
                            imageReceiver = j61Var3.h;
                        }
                        i61 i61Var3 = j61Var3.J;
                        if (!i61Var3.h) {
                            i61Var3.setImageReceiver(imageReceiver);
                        }
                        j61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (j61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((j61Var3.getX() + j61Var3.getMeasuredWidth()) - f20), (int) ((j61Var3.getY() + j61Var3.getMeasuredHeight()) - f20));
                        j61Var3.K.setBounds(0, 0, dp3, dp3);
                        j61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != a71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = zg.e0.f49293c;
            if (runnable != null) {
                runnable.run();
                zg.e0.f49293c = null;
            }
        }
    }

    @Override
    public final void f1() {
        if (zg.e0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override
    public final void invalidate() {
        if (zg.e0.b(this) || this.f32584c3) {
            return;
        }
        this.f32584c3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a71 a71Var = this.f32586e3;
        if (this == a71Var.f32028h0) {
            a71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a71 a71Var = this.f32586e3;
        if (this == a71Var.f32028h0) {
            a71Var.V0.onDetachedFromWindow();
        }
        w1(this.Z2);
        w1(this.f32582a3);
        w1(this.f32583b3);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
