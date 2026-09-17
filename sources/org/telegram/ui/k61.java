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
public abstract class k61 extends org.telegram.ui.Components.ml0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f35119a3;
    public final ArrayList f35120b3;
    public boolean f35121c3;
    public final LongSparseArray f35122d3;
    public final i71 f35123e3;

    public k61(i71 i71Var, Context context) {
        super(context, null);
        this.f35123e3 = i71Var;
        this.X2 = new SparseArray();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f35119a3 = new ArrayList();
        this.f35120b3 = new ArrayList();
        this.f35122d3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i6, this.f26191p2));
    }

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    @Override
    public final boolean I0(android.view.View r1, float r2, float r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k61.I0(android.view.View, float, float):boolean");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        ImageReceiver imageReceiver;
        j61 j61Var;
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
            this.f35121c3 = false;
            int saveCount = canvas2.getSaveCount();
            i71 i71Var = this.f35123e3;
            int i11 = i71Var.W;
            int i12 = 14;
            if (i11 != 6 && i11 != 14 && i11 != 13) {
                Rect rect = this.G1;
                if (!rect.isEmpty()) {
                    this.D1.setBounds(rect);
                    canvas2.save();
                    q0.a aVar = this.f26189o2;
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
            if (i71Var.P1 > 0 && SystemClock.elapsedRealtime() - i71Var.P1 < i71Var.g() && i71Var.M1 != null && i71Var.N1 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f35122d3 != null) {
                int i14 = 0;
                boolean z12 = false;
                while (i14 < getChildCount()) {
                    View childAt = getChildAt(i14);
                    if (childAt instanceof r61) {
                        r61 r61Var = (r61) childAt;
                        i71 i71Var2 = r61Var.V;
                        int i15 = i71Var2.W;
                        if (r61Var.isPressed()) {
                            float f13 = r61Var.N;
                            if (f13 != 1.0f && i15 != i12) {
                                r61Var.N = Utilities.clamp(f13 + 0.16f, 1.0f, 0.0f);
                                r61Var.invalidate();
                            }
                        }
                        int i16 = r61Var.f37095c;
                        if (i71Var.f34494w1) {
                            top = (int) childAt.getY();
                        } else {
                            top = childAt.getTop();
                        }
                        ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                        canvas2.save();
                        canvas2.translate(r61Var.getX(), r61Var.getY());
                        if (r61Var.f37100w != null) {
                            yh.k8 collectionParticles = i71Var.getCollectionParticles();
                            i10 = i14;
                            boolean z13 = z12;
                            collectionParticles.f(0, 0, r61Var.getWidth(), r61Var.getHeight());
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
                            canvas2.scale(f11, f12, r61Var.getWidth() / 2.0f, r61Var.getHeight() / 2.0f);
                            canvas2.rotate((i16 % 4) * 90, r61Var.getWidth() / 2.0f, r61Var.getHeight() / 2.0f);
                            collectionParticles.a(canvas2, r61Var.f37100w.intValue());
                            canvas2.restore();
                            z12 = z14;
                        } else {
                            i10 = i14;
                            view = childAt;
                        }
                        boolean z15 = r61Var.L;
                        if ((z15 || r61Var.M || r61Var.S > 0.0f) && !r61Var.f37094b) {
                            if (z15 || r61Var.M) {
                                float f14 = r61Var.R;
                                if (f14 < 1.0f) {
                                    r61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f14;
                                    invalidate();
                                }
                            }
                            if (!r61Var.L && !r61Var.M) {
                                float f15 = r61Var.R;
                                if (f15 > 0.0f) {
                                    r61Var.R = f15 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                    invalidate();
                                }
                            }
                            if (r61Var.L) {
                                interpolation = org.telegram.ui.Components.qr.h.getInterpolation(r61Var.R);
                            } else {
                                interpolation = 1.0f - org.telegram.ui.Components.qr.h.getInterpolation(1.0f - r61Var.R);
                            }
                            r61Var.S = Utilities.clamp(interpolation, 1.0f, 0.0f);
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
                            rectF.set(0.0f, 0.0f, r61Var.getMeasuredWidth(), r61Var.getMeasuredHeight());
                            float f16 = dp;
                            rectF.inset(f16, f16);
                            if (!r61Var.f37093a) {
                                Drawable drawable = r61Var.E;
                                if (!(drawable instanceof org.telegram.ui.Components.o5) || !((org.telegram.ui.Components.o5) drawable).c()) {
                                    paint = i71Var2.L;
                                    int alpha = paint.getAlpha();
                                    paint.setAlpha((int) (r61Var.getAlpha() * alpha * r61Var.S));
                                    float f17 = dp2;
                                    canvas2.drawRoundRect(rectF, f17, f17, paint);
                                    paint.setAlpha(alpha);
                                }
                            }
                            paint = i71Var2.M;
                            int alpha2 = paint.getAlpha();
                            paint.setAlpha((int) (r61Var.getAlpha() * alpha2 * r61Var.S));
                            float f172 = dp2;
                            canvas2.drawRoundRect(rectF, f172, f172, paint);
                            paint.setAlpha(alpha2);
                        }
                        canvas2.restore();
                        if (r61Var.getBackground() != null) {
                            r61Var.getBackground().setBounds((int) r61Var.getX(), (int) r61Var.getY(), r61Var.getWidth() + ((int) r61Var.getX()), r61Var.getHeight() + ((int) r61Var.getY()));
                            r61Var.getBackground().setAlpha((int) (r61Var.getAlpha() * 255));
                            r61Var.getBackground().draw(canvas2);
                            r61Var.getBackground().setAlpha(255);
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
                        arrayList3.add(r61Var);
                        q61 q61Var = r61Var.J;
                        if (q61Var != null && q61Var.getVisibility() == 0 && r61Var.J.getImageReceiver() == null && (imageReceiver2 = r61Var.f37098r) != null) {
                            r61Var.J.setImageReceiver(imageReceiver2);
                        }
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z16 = z12;
                    if (z10 && view != null) {
                        int S = RecyclerView.S(view);
                        int i18 = i71Var.N1;
                        List list = i71.Z1;
                        if (S == i18 - 1) {
                            float interpolation2 = org.telegram.ui.Components.qr.f27381g.getInterpolation(w7.p.a(((float) (SystemClock.elapsedRealtime() - i71Var.P1)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation2 < 1.0f) {
                                float f18 = 1.0f - interpolation2;
                                canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f18), 31);
                                canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                                float f19 = (f18 * 0.5f) + 0.5f;
                                canvas2.scale(f19, f19, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                                i71Var.M1.draw(canvas2);
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
            ArrayList arrayList6 = this.f35120b3;
            arrayList6.clear();
            ArrayList arrayList7 = this.f35119a3;
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
                r61 r61Var2 = (r61) arrayList8.get(0);
                int S2 = RecyclerView.S(r61Var2);
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList6.size()) {
                        if (((j61) arrayList6.get(i20)).M == S2) {
                            j61Var = (j61) arrayList6.get(i20);
                            arrayList6.remove(i20);
                            break;
                        }
                        i20++;
                    } else {
                        j61Var = null;
                        break;
                    }
                }
                if (j61Var == null) {
                    if (!arrayList2.isEmpty()) {
                        j61Var = (j61) hg.k0.z(1, arrayList2);
                    } else {
                        j61Var = new j61(this);
                        j61Var.l(7);
                    }
                    j61Var.M = S2;
                    j61Var.e();
                }
                arrayList7.add(j61Var);
                j61Var.O = arrayList8;
                canvas2.save();
                canvas2.translate(r61Var2.getLeft(), r61Var2.getY());
                j61Var.N = r61Var2.getLeft();
                int measuredWidth = getMeasuredWidth() - (r61Var2.getLeft() * 2);
                int measuredHeight = r61Var2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    Canvas canvas3 = canvas2;
                    j61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                    canvas2 = canvas3;
                }
                canvas2.restore();
                i19++;
            }
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((j61) arrayList6.get(i21));
                    ((j61) arrayList6.get(i21)).O = null;
                    ((j61) arrayList6.get(i21)).k();
                } else {
                    ((j61) arrayList6.get(i21)).f();
                }
            }
            arrayList6.clear();
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof r61) {
                    r61 r61Var3 = (r61) childAt2;
                    q61 q61Var2 = r61Var3.J;
                    if (q61Var2 != null && q61Var2.getVisibility() == 0) {
                        canvas2.save();
                        canvas2.translate((int) ((r61Var3.getX() + r61Var3.getMeasuredWidth()) - r61Var3.J.getMeasuredWidth()), (int) ((r61Var3.getY() + r61Var3.getMeasuredHeight()) - r61Var3.J.getMeasuredHeight()));
                        Drawable drawable2 = r61Var3.E;
                        if (drawable2 instanceof org.telegram.ui.Components.o5) {
                            imageReceiver = ((org.telegram.ui.Components.o5) drawable2).f26636k;
                        } else {
                            imageReceiver = r61Var3.h;
                        }
                        q61 q61Var3 = r61Var3.J;
                        if (!q61Var3.h) {
                            q61Var3.setImageReceiver(imageReceiver);
                        }
                        r61Var3.J.draw(canvas2);
                        canvas2.restore();
                    }
                    if (r61Var3.K != null) {
                        canvas2.save();
                        int dp3 = AndroidUtilities.dp(17.0f);
                        float f20 = dp3;
                        canvas2.translate((int) ((r61Var3.getX() + r61Var3.getMeasuredWidth()) - f20), (int) ((r61Var3.getY() + r61Var3.getMeasuredHeight()) - f20));
                        r61Var3.K.setBounds(0, 0, dp3, dp3);
                        r61Var3.K.draw(canvas2);
                        canvas2.restore();
                    }
                } else if (childAt2 != null && childAt2 != i71Var.M1) {
                    canvas2.save();
                    canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas2);
                    canvas2.restore();
                }
            }
            canvas2.restoreToCount(saveCount);
            Runnable runnable = zg.f0.f49047c;
            if (runnable != null) {
                runnable.run();
                zg.f0.f49047c = null;
            }
        }
    }

    @Override
    public final void g1() {
        if (zg.f0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override
    public final void invalidate() {
        if (zg.f0.b(this) || this.f35121c3) {
            return;
        }
        this.f35121c3 = true;
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i71 i71Var = this.f35123e3;
        if (this == i71Var.f34461h0) {
            i71Var.V0.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i71 i71Var = this.f35123e3;
        if (this == i71Var.f34461h0) {
            i71Var.V0.onDetachedFromWindow();
        }
        x1(this.Z2);
        x1(this.f35119a3);
        x1(this.f35120b3);
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
