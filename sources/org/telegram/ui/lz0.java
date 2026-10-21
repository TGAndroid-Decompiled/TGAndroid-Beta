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
public final class lz0 extends org.telegram.ui.Components.lw0 implements r0.m {
    public boolean A0;
    public final ArrayList B0;
    public final jg0 C0;
    public final ProfileActivity D0;
    public final b2.u0 f39065w0;
    public final ProfileActivity f39066x0;
    public boolean f39067y0;
    public final Paint f39068z0;

    public lz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.D0 = profileActivity;
        this.f39066x0 = profileActivity;
        this.f39065w0 = new Object();
        this.f39068z0 = new Paint();
        this.B0 = new ArrayList();
        this.C0 = new jg0(4);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.jm0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f39066x0;
        if (viewGroup == profileActivity.f33581a) {
            int i14 = -1;
            if (profileActivity.L4 != -1 && profileActivity.Q) {
                kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                boolean z10 = kVar.f21497n0;
                int top = profileActivity.O.getTop();
                boolean z11 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((s4.b0) currentListView.getLayoutManager()).L0()) != -1) {
                        s4.b1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f45917a.getTop();
                        }
                        int paddingTop = currentListView.getPaddingTop();
                        if (i14 != paddingTop || L0 != 0) {
                            if (L0 != 0) {
                                max = i11;
                            } else {
                                max = Math.max(i11, i14 - paddingTop);
                            }
                            iArr[1] = max;
                            currentListView.scrollBy(0, i11);
                            z11 = true;
                        }
                    }
                    if (z10) {
                        if (!z11 && top < 0) {
                            iArr[1] = i11 - Math.max(top, i11);
                        } else {
                            iArr[1] = i11;
                        }
                    }
                } else if (z10) {
                    org.telegram.ui.Components.jm0 currentListView2 = profileActivity.O.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                        currentListView2.scrollBy(0, i13);
                    }
                }
            }
        }
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.f39066x0;
        canvas.translate(0.0f, profileActivity.f33581a.getY());
        profileActivity.O.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.p50 p50Var = profileActivity.f33753y0;
        Paint paint = profileActivity.f33702r2;
        gh.d dVar = profileActivity.f33706r6;
        bh.f fVar = profileActivity.q6;
        Paint paint2 = profileActivity.f33759z0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            ProfileActivity.C0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f11060n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20932a7, profileActivity.A0));
                if (SharedConfig.chatBlurEnabled()) {
                    fVar.b(a2, -2);
                }
                dVar.c();
            }
        }
        int i10 = org.telegram.ui.ActionBar.h6.f20932a7;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.A0));
        if (profileActivity.f33581a.getVisibility() == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.A0);
            Paint paint3 = this.f39068z0;
            paint3.setColor(w02);
            if (profileActivity.I1) {
                paint.setAlpha((int) (profileActivity.f33581a.getAlpha() * 255.0f));
            }
            if (profileActivity.I1) {
                paint3.setAlpha((int) (profileActivity.f33581a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f33581a.getChildCount();
            ArrayList arrayList = this.B0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f33581a.getChildAt(i11);
                profileActivity.f33581a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f33581a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.C0);
            profileActivity.f33581a.getY();
            int size = arrayList.size();
            if (!profileActivity.H1 && size > 0 && !z11) {
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
                profileActivity.f33581a.getY();
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
        if (p50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f33753y0);
        }
        if (profileActivity.f33745x0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f33745x0.getLeft(), profileActivity.f33745x0.getTop());
            View view2 = profileActivity.f33745x0;
            kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((p50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f33745x0.getMeasuredWidth(), profileActivity.f33745x0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f33745x0.draw(canvas);
            canvas.restoreToCount(save);
        }
        v10 v10Var = profileActivity.U;
        float f10 = 0.0f;
        if (v10Var != null && v10Var.getVisibility() == 0) {
            if (profileActivity.U.getAlpha() != 1.0f) {
                if (profileActivity.U.getAlpha() != 0.0f) {
                    canvas.saveLayerAlpha(profileActivity.U.getLeft(), profileActivity.U.getTop(), profileActivity.U.getRight(), profileActivity.U.getBottom(), (int) (profileActivity.U.getAlpha() * 255.0f), 31);
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
            hy0 hy0Var = profileActivity.f33581a;
            if (hy0Var != null) {
                f7 = hy0Var.getTranslationX();
            } else {
                f7 = 0.0f;
            }
            canvas.translate(f7, 0.0f);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, profileActivity.A0);
            int i13 = profileActivity.f33692p6;
            hy0 hy0Var2 = profileActivity.f33581a;
            if (hy0Var2 != null) {
                f10 = hy0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, w03, i13, f10);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.nu0[] nu0VarArr;
        org.telegram.ui.Components.nu0 nu0Var;
        ProfileActivity profileActivity = this.D0;
        wy0 wy0Var = profileActivity.X4;
        if (wy0Var.f42388n) {
            return wy0Var.g(motionEvent);
        }
        nz0 nz0Var = profileActivity.O;
        if (nz0Var != null && (nu0Var = (nu0VarArr = nz0Var.f31047k0)[0]) != null && nu0Var.h.getFastScroll() != null && nu0VarArr[0].h.getFastScroll().f29648n) {
            nz0 nz0Var2 = profileActivity.O;
            if (nz0Var2.d) {
                return nz0Var2.O(motionEvent);
            }
        }
        nz0 nz0Var3 = profileActivity.O;
        if (nz0Var3 != null && nz0Var3.H(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        if (profileActivity.X4.f42388n) {
            if (view != profileActivity.Z) {
                kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                if (view == kVar || view == profileActivity.v) {
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
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.f39066x0;
        try {
            if (viewGroup == profileActivity.f33581a && profileActivity.Q) {
                org.telegram.ui.Components.jm0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new kz0(this, 1));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f39065w0.f4053a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.D0;
        profileActivity.H0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
            if (i11 >= p5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.p5 p5Var = p5VarArr[i11];
            if (p5Var != null) {
                p5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr2 = profileActivity.H;
            if (i10 < p5VarArr2.length) {
                org.telegram.ui.Components.p5 p5Var2 = p5VarArr2[i10];
                if (p5Var2 != null) {
                    p5Var2.a();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.D0;
        int i10 = 0;
        profileActivity.H0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
            if (i11 >= p5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.p5 p5Var = p5VarArr[i11];
            if (p5Var != null) {
                p5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr2 = profileActivity.H;
            if (i10 < p5VarArr2.length) {
                org.telegram.ui.Components.p5 p5Var2 = p5VarArr2[i10];
                if (p5Var2 != null) {
                    p5Var2.b();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        profileActivity.W5 = -1;
        profileActivity.V4 = false;
        profileActivity.W4 = false;
        profileActivity.A3();
    }

    @Override
    public final void onMeasure(int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lz0.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        hh.d.c(profileActivity.f33721t6, profileActivity.fragmentView);
        profileActivity.f33728u6.d();
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f39066x0.L4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f39067y0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f39065w0.f4053a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
