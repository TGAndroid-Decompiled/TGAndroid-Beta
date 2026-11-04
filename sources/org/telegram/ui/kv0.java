package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
public final class kv0 extends org.telegram.ui.Components.qt0 implements r0.l {
    public final d2.t0 f47028g0;
    public final ProfileActivity f47029h0;
    public boolean f47030i0;
    public final Paint f47031j0;
    public boolean f47032k0;
    public final ArrayList f47033l0;
    public final org.telegram.ui.Components.d80 m0;
    public final ProfileActivity f47034n0;

    public kv0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.f47034n0 = profileActivity;
        this.f47029h0 = profileActivity;
        this.f47028g0 = new Object();
        this.f47031j0 = new Paint();
        this.f47033l0 = new ArrayList();
        this.m0 = new org.telegram.ui.Components.d80(18);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.f47034n0;
        org.telegram.ui.Components.p30 p30Var = profileActivity.f41890y0;
        Paint paint = profileActivity.f41833q2;
        Paint paint2 = profileActivity.f41897z0;
        float f11 = 0.0f;
        int i3 = (profileActivity.B5 > 0.0f ? 1 : (profileActivity.B5 == 0.0f ? 0 : -1));
        Paint paint3 = this.f47031j0;
        if (i3 > 0) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, profileActivity.A0));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ProfileActivity.J0(profileActivity), paint3);
        }
        int i10 = org.telegram.ui.ActionBar.k6.f27824a7;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0));
        if (profileActivity.f41719a.getVisibility() == 0) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0));
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.f41719a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.f41719a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f41719a.getChildCount();
            ArrayList arrayList = this.f47033l0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f41719a.getChildAt(i11);
                profileActivity.f41719a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f41719a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.m0);
            profileActivity.f41719a.getY();
            int size = arrayList.size();
            if (!profileActivity.G1 && size > 0 && !z11) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z12 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
                if (view.getBackground() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                profileActivity.f41719a.getY();
                view.getY();
                if (z12 == z10) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z12 = z10;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (p30Var.getAlpha() > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f41890y0);
        } else {
            canvas2 = canvas;
        }
        if (profileActivity.f41882x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f41882x0.getLeft(), profileActivity.f41882x0.getTop());
            View view2 = profileActivity.f41882x0;
            kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((p30Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f41882x0.getMeasuredWidth(), profileActivity.f41882x0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f41882x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        org.telegram.ui.Components.voip.r0 r0Var = profileActivity.U;
        if (r0Var != null && r0Var.getVisibility() == 0) {
            if (profileActivity.U.getAlpha() != 1.0f) {
                if (profileActivity.U.getAlpha() != 0.0f) {
                    canvas2.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
                    canvas.translate(profileActivity.U.getLeft(), profileActivity.U.getTop());
                    profileActivity.U.draw(canvas);
                    canvas.restore();
                }
            } else {
                profileActivity.U.draw(canvas);
            }
        }
        if (!profileActivity.J0) {
            canvas.save();
            hu0 hu0Var = profileActivity.f41719a;
            if (hu0Var != null) {
                f10 = hu0Var.getTranslationX();
            } else {
                f10 = 0.0f;
            }
            canvas.translate(f10, 0.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, profileActivity.A0);
            int i13 = profileActivity.J6;
            hu0 hu0Var2 = profileActivity.f41719a;
            if (hu0Var2 != null) {
                f11 = hu0Var2.getAlpha();
            }
            org.telegram.messenger.g0.O(canvas, this, w02, i13, f11);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.rr0[] rr0VarArr;
        org.telegram.ui.Components.rr0 rr0Var;
        ProfileActivity profileActivity = this.f47034n0;
        vu0 vu0Var = profileActivity.W4;
        if (vu0Var.f50591n) {
            return vu0Var.g(motionEvent);
        }
        mv0 mv0Var = profileActivity.O;
        if (mv0Var != null && (rr0Var = (rr0VarArr = mv0Var.f40108n0)[0]) != null && rr0Var.h.getFastScroll() != null && rr0VarArr[0].h.getFastScroll().f40745n) {
            mv0 mv0Var2 = profileActivity.O;
            if (mv0Var2.d) {
                return mv0Var2.Z(motionEvent);
            }
        }
        mv0 mv0Var3 = profileActivity.O;
        if (mv0Var3 != null && mv0Var3.P(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.f47034n0;
        if (profileActivity.W4.f50591n) {
            if (view != profileActivity.Z) {
                kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                if (view == kVar || view == profileActivity.f41845s) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.U) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void m(int i3, View view) {
        this.f47028g0.f8413a = 0;
    }

    @Override
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.f47029h0;
        try {
            if (view == profileActivity.f41719a && profileActivity.Q) {
                org.telegram.ui.Components.tj0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            org.telegram.messenger.g0.h3(new jv0(this, 1));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.f47034n0;
        profileActivity.H0 = true;
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = profileActivity.H;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.f47034n0;
        profileActivity.H0 = false;
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = profileActivity.H;
        if (e5Var2 != null) {
            e5Var2.b();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        ProfileActivity profileActivity = this.f47034n0;
        profileActivity.f41804l6 = -1;
        profileActivity.U4 = false;
        profileActivity.V4 = false;
        profileActivity.O3();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kv0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        ProfileActivity profileActivity = this.f47034n0;
        jh.d.c(profileActivity.K6, profileActivity.fragmentView);
        profileActivity.L6.d();
    }

    @Override
    public final boolean p(View view, View view2, int i3, int i10) {
        if (this.f47029h0.K4 != -1 && i3 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f47030i0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i3, int i10) {
        this.f47028g0.f8413a = i3;
    }

    @Override
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.tj0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f47029h0;
        if (view == profileActivity.f41719a) {
            int i13 = -1;
            if (profileActivity.K4 != -1 && profileActivity.Q) {
                kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                boolean z10 = kVar.f27728o0;
                int top = profileActivity.O.getTop();
                boolean z11 = false;
                if (i10 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((u4.b0) currentListView.getLayoutManager()).L0()) != -1) {
                        u4.d1 K = currentListView.K(L0);
                        if (K != null) {
                            i13 = K.f55540a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i13 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i10;
                            } else {
                                max = Math.max(i10, i13 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i10);
                            z11 = true;
                        }
                    }
                    if (z10) {
                        if (!z11 && top < 0) {
                            iArr[1] = i10 - Math.max(top, i10);
                        } else {
                            iArr[1] = i10;
                        }
                    }
                } else if (z10) {
                    org.telegram.ui.Components.tj0 currentListView2 = profileActivity.O.getCurrentListView();
                    iArr[1] = i10;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 != null && (i12 = iArr[1]) > 0) {
                        currentListView2.scrollBy(0, i12);
                    }
                }
            }
        }
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
