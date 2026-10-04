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
public abstract class e61 extends org.telegram.ui.Components.zl0 {
    public final SparseArray f35948e3;
    public final ArrayList f35949f3;
    public final ArrayList f35950g3;
    public final ArrayList f35951h3;
    public final ArrayList f35952i3;
    public boolean j3;
    public final LongSparseArray f35953k3;
    public final c71 f35954l3;

    public e61(c71 c71Var, Context context) {
        super(context, null);
        this.f35954l3 = c71Var;
        this.f35948e3 = new SparseArray();
        this.f35949f3 = new ArrayList();
        this.f35950g3 = new ArrayList();
        this.f35951h3 = new ArrayList();
        this.f35952i3 = new ArrayList();
        this.f35953k3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20913i6, this.f33552p2));
    }

    public static void y1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((d61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean I0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e61.I0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        d61 d61Var;
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
            this.j3 = false;
            int saveCount = canvas2.getSaveCount();
            c71 c71Var = this.f35954l3;
            int i11 = c71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.G1;
                if (!rect.isEmpty()) {
                    this.D1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f33550o2;
                    if (aVar != null) {
                        aVar.accept(canvas2);
                    }
                    this.D1.draw(canvas2);
                    canvas2.restore();
                }
            }
            int i13 = 0;
            while (true) {
                sparseArray = this.f35948e3;
                int size = sparseArray.size();
                arrayList = this.f35949f3;
                if (i13 >= size) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
                arrayList4.clear();
                arrayList.add(arrayList4);
                i13++;
            }
            sparseArray.clear();
            if (c71Var.P1 > 0 && SystemClock.elapsedRealtime() - c71Var.P1 < c71Var.g() && c71Var.M1 != null && c71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f35953k3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof l61) {
                        l61 l61Var = (l61) childAt;
                        c71 c71Var2 = l61Var.V;
                        int i15 = c71Var2.W;
                        if (l61Var.isPressed()) {
                            float f13 = l61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                l61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                l61Var.invalidate();
                            }
                        }
                        int i16 = l61Var.f38178c;
                        if (c71Var.f35353w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(l61Var.getX(), l61Var.getY());
                        if (l61Var.f38184w != null) {
                            yh.j8 collectionParticles = c71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, l61Var.getWidth(), l61Var.getHeight());
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
                            canvas2.scale(f11, f12, l61Var.getWidth() / 2.0f, l61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, l61Var.getWidth() / 2.0f, l61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, l61Var.f38184w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = l61Var.L;
                        if ((z15 || l61Var.M || l61Var.S > 0.0f) && !l61Var.f38177b) {
                            if (z15 || l61Var.M) {
                                float f14 = l61Var.R;
                                if (f14 < 1.0f) {
                                    l61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!l61Var.L && !l61Var.M) {
                                float f15 = l61Var.R;
                                if (f15 > 0.0f) {
                                    l61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (l61Var.L) {
                                interpolation = org.telegram.ui.Components.tr.h.getInterpolation(l61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.tr.h.getInterpolation(1.0f - l61Var.R);
                            }
                            l61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, l61Var.getMeasuredWidth(), l61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!l61Var.f38176a) {
                                Drawable drawable = l61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.q5) || !((org.telegram.ui.Components.q5) drawable).c()) {
                                    paint = c71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (l61Var.getAlpha() * alpha * l61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = c71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (l61Var.getAlpha() * alpha2 * l61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (l61Var.getBackground() != null) {
                            l61Var.getBackground().setBounds((int) l61Var.getX(), (int) l61Var.getY(), l61Var.getWidth() + ((int) l61Var.getX()), l61Var.getHeight() + ((int) l61Var.getY()));
                            l61Var.getBackground().setAlpha((int) (l61Var.getAlpha() * 255));
                            l61Var.getBackground().draw(canvas2);
                            l61Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) hg.c.w(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(l61Var);
                        k61 k61Var = l61Var.J;
                        if (k61Var != null && k61Var.getVisibility() == 0 && l61Var.J.getImageReceiver() == null && (imageReceiver2 = l61Var.f38182r) != null) {
                            l61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = c71Var.N1;
                        List list = c71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.tr.f31148g.getInterpolation(w7.q.a(((float) (SystemClock.elapsedRealtime() - c71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                c71Var.M1.draw(canvas2);
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
            ArrayList arrayList6 = this.f35952i3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f35951h3;
            arrayList6.addAll(arrayList7);
            arrayList7.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i19 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.f35950g3;
                if (i19 >= size2) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
                l61 l61Var2 = (l61) arrayList8.get(0);
                int R2 = RecyclerView.R(l61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((d61) arrayList6.get(i20)).M == R2) {
                            d61Var = (d61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        d61Var = null;
                        break;
                    }
                }
                if (d61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        d61Var = (d61) hg.c.w(1, arrayList2);
                    } else {
                        d61Var = new d61(this);
                        d61Var.l(7);
                    }
                    d61Var.M = R2;
                    d61Var.e();
                }
                arrayList7.add(d61Var);
                d61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(l61Var2.getLeft(), l61Var2.getY());
                d61Var.N = l61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (l61Var2.getLeft() * 2);
                int measuredHeight = l61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    d61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((d61) arrayList6.get(i21));
                    ((d61) arrayList6.get(i21)).O = null;
                    ((d61) arrayList6.get(i21)).k();
                } else {
                    ((d61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof l61) {
                    l61 l61Var3 = (l61) childAt2;
                    k61 k61Var2 = l61Var3.J;
                    if (k61Var2 != null && k61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((l61Var3.getX() + l61Var3.getMeasuredWidth()) - l61Var3.J.getMeasuredWidth()), (int) ((l61Var3.getY() + l61Var3.getMeasuredHeight()) - l61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = l61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.q5) {
                            imageReceiver = ((org.telegram.ui.Components.q5) drawable2).f29914k;
                        } else {
                            imageReceiver = l61Var3.h;
                        }
                        k61 k61Var3 = l61Var3.J;
                        if (!k61Var3.h) {
                            k61Var3.setImageReceiver(imageReceiver);
                        }
                        l61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (l61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((l61Var3.getX() + l61Var3.getMeasuredWidth()) - f20), (int) ((l61Var3.getY() + l61Var3.getMeasuredHeight()) - f20));
                        l61Var3.K.setBounds(0, 0, dp3, dp3);
                        l61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != c71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = zg.e0.f53373c;
            if (runnable != null) {
                runnable.run();
                zg.e0.f53373c = null;
            }
        }
    }

    @Override
    public final void h1() {
        if (zg.e0.b(this)) {
            return;
        }
        super.h1();
    }

    @Override
    public final void invalidate() {
        if (zg.e0.b(this) || this.j3) {
            return;
        }
        this.j3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c71 c71Var = this.f35954l3;
        if (this == c71Var.f35320h0) {
            c71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c71 c71Var = this.f35954l3;
        if (this == c71Var.f35320h0) {
            c71Var.V0.onDetachedFromWindow();
        }
        y1(this.f35950g3);
        y1(this.f35951h3);
        y1(this.f35952i3);
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
