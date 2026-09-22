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
public abstract class j61 extends org.telegram.ui.Components.ll0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f34801a3;
    public final ArrayList f34802b3;
    public boolean f34803c3;
    public final LongSparseArray f34804d3;
    public final h71 f34805e3;

    public j61(h71 h71Var, Context context) {
        super(context, null);
        this.f34805e3 = h71Var;
        this.X2 = new SparseArray();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f34801a3 = new ArrayList();
        this.f34802b3 = new ArrayList();
        this.f34804d3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18923i6, this.f25969p2));
    }

    public static void w1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((i61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean H0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j61.H0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        i61 i61Var;
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
            this.f34803c3 = false;
            int saveCount = canvas2.getSaveCount();
            h71 h71Var = this.f34805e3;
            int i11 = h71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.G1;
                if (!rect.isEmpty()) {
                    this.D1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f25967o2;
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
            if (h71Var.P1 > 0 && SystemClock.elapsedRealtime() - h71Var.P1 < h71Var.g() && h71Var.M1 != null && h71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f34804d3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof q61) {
                        q61 q61Var = (q61) childAt;
                        h71 h71Var2 = q61Var.V;
                        int i15 = h71Var2.W;
                        if (q61Var.isPressed()) {
                            float f13 = q61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                q61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                q61Var.invalidate();
                            }
                        }
                        int i16 = q61Var.f36770c;
                        if (h71Var.f34165w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(q61Var.getX(), q61Var.getY());
                        if (q61Var.f36775w != null) {
                            yh.j8 collectionParticles = h71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, q61Var.getWidth(), q61Var.getHeight());
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
                            canvas2.scale(f11, f12, q61Var.getWidth() / 2.0f, q61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, q61Var.getWidth() / 2.0f, q61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, q61Var.f36775w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = q61Var.L;
                        if ((z15 || q61Var.M || q61Var.S > 0.0f) && !q61Var.f36769b) {
                            if (z15 || q61Var.M) {
                                float f14 = q61Var.R;
                                if (f14 < 1.0f) {
                                    q61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!q61Var.L && !q61Var.M) {
                                float f15 = q61Var.R;
                                if (f15 > 0.0f) {
                                    q61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (q61Var.L) {
                                interpolation = org.telegram.ui.Components.qr.h.getInterpolation(q61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.qr.h.getInterpolation(1.0f - q61Var.R);
                            }
                            q61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, q61Var.getMeasuredWidth(), q61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!q61Var.f36768a) {
                                Drawable drawable = q61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.o5) || !((org.telegram.ui.Components.o5) drawable).c()) {
                                    paint = h71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (q61Var.getAlpha() * alpha * q61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = h71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (q61Var.getAlpha() * alpha2 * q61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (q61Var.getBackground() != null) {
                            q61Var.getBackground().setBounds((int) q61Var.getX(), (int) q61Var.getY(), q61Var.getWidth() + ((int) q61Var.getX()), q61Var.getHeight() + ((int) q61Var.getY()));
                            q61Var.getBackground().setAlpha((int) (q61Var.getAlpha() * 255));
                            q61Var.getBackground().draw(canvas2);
                            q61Var.getBackground().setAlpha(255);
                        }
                        if (arrayList5 == null) {
                            if (!arrayList.isEmpty()) {
                                arrayList3 = (ArrayList) hg.c.z(1, arrayList);
                            } else {
                                arrayList3 = new ArrayList();
                            }
                            sparseArray.put(top, arrayList3);
                        } else {
                            arrayList3 = arrayList5;
                        }
                        arrayList3.add(q61Var);
                        p61 p61Var = q61Var.J;
                        if (p61Var != null && p61Var.getVisibility() == 0 && q61Var.J.getImageReceiver() == null && (imageReceiver2 = q61Var.f36773r) != null) {
                            q61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int R = RecyclerView.R(view);
                        int i18 = h71Var.N1;
                        List list = h71.Z1;
                        if (R == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.qr.f27421g.getInterpolation(w7.p.a(((float) (SystemClock.elapsedRealtime() - h71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                h71Var.M1.draw(canvas2);
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
            ArrayList arrayList6 = this.f34802b3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f34801a3;
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
                q61 q61Var2 = (q61) arrayList8.get(0);
                int R2 = RecyclerView.R(q61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((i61) arrayList6.get(i20)).M == R2) {
                            i61Var = (i61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        i61Var = null;
                        break;
                    }
                }
                if (i61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        i61Var = (i61) hg.c.z(1, arrayList2);
                    } else {
                        i61Var = new i61(this);
                        i61Var.l(7);
                    }
                    i61Var.M = R2;
                    i61Var.e();
                }
                arrayList7.add(i61Var);
                i61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(q61Var2.getLeft(), q61Var2.getY());
                i61Var.N = q61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (q61Var2.getLeft() * 2);
                int measuredHeight = q61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    i61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((i61) arrayList6.get(i21));
                    ((i61) arrayList6.get(i21)).O = null;
                    ((i61) arrayList6.get(i21)).k();
                } else {
                    ((i61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof q61) {
                    q61 q61Var3 = (q61) childAt2;
                    p61 p61Var2 = q61Var3.J;
                    if (p61Var2 != null && p61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((q61Var3.getX() + q61Var3.getMeasuredWidth()) - q61Var3.J.getMeasuredWidth()), (int) ((q61Var3.getY() + q61Var3.getMeasuredHeight()) - q61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = q61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            imageReceiver = ((org.telegram.ui.Components.o5) drawable2).f26689k;
                        } else {
                            imageReceiver = q61Var3.h;
                        }
                        p61 p61Var3 = q61Var3.J;
                        if (!p61Var3.h) {
                            p61Var3.setImageReceiver(imageReceiver);
                        }
                        q61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (q61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((q61Var3.getX() + q61Var3.getMeasuredWidth()) - f20), (int) ((q61Var3.getY() + q61Var3.getMeasuredHeight()) - f20));
                        q61Var3.K.setBounds(0, 0, dp3, dp3);
                        q61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != h71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = zg.f0.f49017c;
            if (runnable != null) {
                runnable.run();
                zg.f0.f49017c = null;
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
        if (zg.f0.b(this) || this.f34803c3) {
            return;
        }
        this.f34803c3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h71 h71Var = this.f34805e3;
        if (this == h71Var.f34132h0) {
            h71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h71 h71Var = this.f34805e3;
        if (this == h71Var.f34132h0) {
            h71Var.V0.onDetachedFromWindow();
        }
        w1(this.Z2);
        w1(this.f34801a3);
        w1(this.f34802b3);
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
