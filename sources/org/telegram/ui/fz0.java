package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public final class fz0 extends org.telegram.ui.Components.xu0 implements r0.n {
    public final d5.p f38379s0;
    public final ProfileActivity f38380t0;
    public boolean f38381u0;
    public final Paint f38382v0;
    public boolean f38383w0;
    public final ArrayList f38384x0;
    public final org.telegram.ui.Components.jn0 f38385y0;
    public final ProfileActivity f38386z0;

    public fz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.f38386z0 = profileActivity;
        this.f38380t0 = profileActivity;
        this.f38379s0 = new Object();
        this.f38382v0 = new Paint();
        this.f38384x0 = new ArrayList();
        this.f38385y0 = new org.telegram.ui.Components.jn0(13);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        org.telegram.ui.Components.wk0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f38380t0;
        if (viewGroup == profileActivity.f35918a) {
            int i13 = -1;
            if (profileActivity.F4 != -1 && profileActivity.M) {
                kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                boolean z10 = kVar.f23577j0;
                int top = profileActivity.K.getTop();
                boolean z11 = false;
                if (i10 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.K.getCurrentListView()) != null && (L0 = ((f2.m0) currentListView.getLayoutManager()).L0()) != -1) {
                        f2.q1 K = currentListView.K(L0);
                        if (K != null) {
                            i13 = K.f5501a.getTop();
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
                    org.telegram.ui.Components.wk0 currentListView2 = profileActivity.K.getCurrentListView();
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
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.f38380t0;
        canvas.translate(0.0f, profileActivity.f35918a.getY());
        profileActivity.K.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.f38386z0;
        org.telegram.ui.Components.p40 p40Var = profileActivity.f36052t0;
        Paint paint = profileActivity.f36005m2;
        ng.d dVar = profileActivity.f35990j6;
        ig.e eVar = profileActivity.f35983i6;
        Paint paint2 = profileActivity.f36058u0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.A0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f18606n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, profileActivity.f36064v0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, profileActivity.f36064v0));
        if (profileActivity.f35918a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(i9, profileActivity.f36064v0);
            Paint paint3 = this.f38382v0;
            paint3.setColor(v02);
            if (profileActivity.D1) {
                paint.setAlpha((int) (profileActivity.f35918a.getAlpha() * 255.0f));
            }
            if (profileActivity.D1) {
                paint3.setAlpha((int) (profileActivity.f35918a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f35918a.getChildCount();
            ArrayList arrayList = this.f38384x0;
            arrayList.clear();
            boolean z11 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = profileActivity.f35918a.getChildAt(i10);
                profileActivity.f35918a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f35918a.getChildAt(i10));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.f38385y0);
            profileActivity.f35918a.getY();
            int size = arrayList.size();
            if (!profileActivity.C1 && size > 0 && !z11) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z12 = false;
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) arrayList.get(i11);
                if (view.getBackground() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                profileActivity.f35918a.getY();
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
        if (p40Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f36052t0);
        }
        if (profileActivity.f36046s0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f36046s0.getLeft(), profileActivity.f36046s0.getTop());
            View view2 = profileActivity.f36046s0;
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((p40Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f36046s0.getMeasuredWidth(), profileActivity.f36046s0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f36046s0.draw(canvas);
            canvas.restoreToCount(save);
        }
        yi0 yi0Var = profileActivity.Q;
        float f11 = 0.0f;
        if (yi0Var != null && yi0Var.getVisibility() == 0) {
            if (profileActivity.Q.getAlpha() != 1.0f) {
                if (profileActivity.Q.getAlpha() != 0.0f) {
                    canvas.saveLayerAlpha(profileActivity.Q.getLeft(), profileActivity.Q.getTop(), profileActivity.Q.getRight(), profileActivity.Q.getBottom(), (int) (profileActivity.Q.getAlpha() * 255.0f), 31);
                    canvas.translate(profileActivity.Q.getLeft(), profileActivity.Q.getTop());
                    profileActivity.Q.draw(canvas);
                    canvas.restore();
                }
            } else {
                profileActivity.Q.draw(canvas);
            }
        }
        if (!profileActivity.E0) {
            canvas.save();
            by0 by0Var = profileActivity.f35918a;
            if (by0Var != null) {
                f10 = by0Var.getTranslationX();
            } else {
                f10 = 0.0f;
            }
            canvas.translate(f10, 0.0f);
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0);
            int i12 = profileActivity.f35976h6;
            by0 by0Var2 = profileActivity.f35918a;
            if (by0Var2 != null) {
                f11 = by0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i12, f11);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.xs0[] xs0VarArr;
        org.telegram.ui.Components.xs0 xs0Var;
        ProfileActivity profileActivity = this.f38386z0;
        qy0 qy0Var = profileActivity.R4;
        if (qy0Var.f40824n) {
            return qy0Var.g(motionEvent);
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && (xs0Var = (xs0VarArr = hz0Var.f28137g0)[0]) != null && xs0Var.h.getFastScroll() != null && xs0VarArr[0].h.getFastScroll().f28480n) {
            hz0 hz0Var2 = profileActivity.K;
            if (hz0Var2.d) {
                return hz0Var2.O(motionEvent);
            }
        }
        hz0 hz0Var3 = profileActivity.K;
        if (hz0Var3 != null && hz0Var3.H(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.f38386z0;
        if (profileActivity.R4.f40824n) {
            if (view != profileActivity.V) {
                kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                if (view == kVar || view == profileActivity.v) {
                    return true;
                }
            } else {
                return true;
            }
        }
        if (view == profileActivity.Q) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        ProfileActivity profileActivity = this.f38380t0;
        try {
            if (viewGroup == profileActivity.f35918a && profileActivity.M) {
                org.telegram.ui.Components.wk0 currentListView = profileActivity.K.getCurrentListView();
                if (profileActivity.K.getTop() == 0) {
                    iArr[1] = i12;
                    currentListView.scrollBy(0, i12);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new ez0(this, 1));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.f38386z0;
        profileActivity.C0 = true;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
            if (i10 >= i5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i10];
            if (i5Var != null) {
                i5Var.a();
            }
            i10++;
        }
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr2 = profileActivity.D;
            if (i9 < i5VarArr2.length) {
                org.telegram.ui.Components.i5 i5Var2 = i5VarArr2[i9];
                if (i5Var2 != null) {
                    i5Var2.a();
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.f38386z0;
        int i9 = 0;
        profileActivity.C0 = false;
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
            if (i10 >= i5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i10];
            if (i5Var != null) {
                i5Var.b();
            }
            i10++;
        }
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr2 = profileActivity.D;
            if (i9 < i5VarArr2.length) {
                org.telegram.ui.Components.i5 i5Var2 = i5VarArr2[i9];
                if (i5Var2 != null) {
                    i5Var2.b();
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ProfileActivity profileActivity = this.f38386z0;
        profileActivity.Q5 = -1;
        profileActivity.P4 = false;
        profileActivity.Q4 = false;
        profileActivity.A3();
    }

    @Override
    public final void onMeasure(int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fz0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        ProfileActivity profileActivity = this.f38386z0;
        og.d.c(profileActivity.f36003l6, profileActivity.fragmentView);
        profileActivity.f36009m6.d();
    }

    @Override
    public final void p(int i9, View view) {
        this.f38379s0.f4376a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i9, int i10) {
        if (this.f38380t0.F4 != -1 && i9 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38381u0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        this.f38379s0.f4376a = i9;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
