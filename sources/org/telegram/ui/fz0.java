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
public final class fz0 extends org.telegram.ui.Components.hv0 implements r0.n {
    public final a5.e f38389s0;
    public final ProfileActivity f38390t0;
    public boolean f38391u0;
    public final Paint f38392v0;
    public boolean f38393w0;
    public final ArrayList f38394x0;
    public final org.telegram.ui.Components.wp0 f38395y0;
    public final ProfileActivity f38396z0;

    public fz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.f38396z0 = profileActivity;
        this.f38390t0 = profileActivity;
        this.f38389s0 = new Object();
        this.f38392v0 = new Paint();
        this.f38394x0 = new ArrayList();
        this.f38395y0 = new org.telegram.ui.Components.wp0(11);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.Components.jl0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f38390t0;
        if (viewGroup == profileActivity.f35984a) {
            int i14 = -1;
            if (profileActivity.F4 != -1 && profileActivity.M) {
                lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                boolean z10 = lVar.f23612j0;
                int top = profileActivity.K.getTop();
                boolean z11 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.K.getCurrentListView()) != null && (L0 = ((f2.j0) currentListView.getLayoutManager()).L0()) != -1) {
                        f2.n1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f6432a.getTop();
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
                    org.telegram.ui.Components.jl0 currentListView2 = profileActivity.K.getCurrentListView();
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
        ProfileActivity profileActivity = this.f38390t0;
        canvas.translate(0.0f, profileActivity.f35984a.getY());
        profileActivity.K.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        ProfileActivity profileActivity = this.f38396z0;
        org.telegram.ui.Components.d50 d50Var = profileActivity.f36117t0;
        Paint paint = profileActivity.f36070m2;
        qg.d dVar = profileActivity.f36055j6;
        lg.e eVar = profileActivity.f36048i6;
        Paint paint2 = profileActivity.f36123u0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f46673n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, profileActivity.f36129v0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36129v0));
        if (profileActivity.f35984a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36129v0);
            Paint paint3 = this.f38392v0;
            paint3.setColor(v02);
            if (profileActivity.D1) {
                paint.setAlpha((int) (profileActivity.f35984a.getAlpha() * 255.0f));
            }
            if (profileActivity.D1) {
                paint3.setAlpha((int) (profileActivity.f35984a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f35984a.getChildCount();
            ArrayList arrayList = this.f38394x0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f35984a.getChildAt(i11);
                profileActivity.f35984a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f35984a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.f38395y0);
            profileActivity.f35984a.getY();
            int size = arrayList.size();
            if (!profileActivity.C1 && size > 0 && !z11) {
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
                profileActivity.f35984a.getY();
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
        if (d50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f36117t0);
        }
        if (profileActivity.f36111s0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f36111s0.getLeft(), profileActivity.f36111s0.getTop());
            View view2 = profileActivity.f36111s0;
            lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view2 == lVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((d50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f36111s0.getMeasuredWidth(), profileActivity.f36111s0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f36111s0.draw(canvas);
            canvas.restoreToCount(save);
        }
        op0 op0Var = profileActivity.Q;
        float f10 = 0.0f;
        if (op0Var != null && op0Var.getVisibility() == 0) {
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
            by0 by0Var = profileActivity.f35984a;
            if (by0Var != null) {
                f9 = by0Var.getTranslationX();
            } else {
                f9 = 0.0f;
            }
            canvas.translate(f9, 0.0f);
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0);
            int i13 = profileActivity.f36041h6;
            by0 by0Var2 = profileActivity.f35984a;
            if (by0Var2 != null) {
                f10 = by0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i13, f10);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.it0[] it0VarArr;
        org.telegram.ui.Components.it0 it0Var;
        ProfileActivity profileActivity = this.f38396z0;
        qy0 qy0Var = profileActivity.R4;
        if (qy0Var.f40300n) {
            return qy0Var.g(motionEvent);
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && (it0Var = (it0VarArr = hz0Var.f32070g0)[0]) != null && it0Var.h.getFastScroll() != null && it0VarArr[0].h.getFastScroll().f32680n) {
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
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.f38396z0;
        if (profileActivity.R4.f40300n) {
            if (view != profileActivity.V) {
                lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                if (view == lVar || view == profileActivity.v) {
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
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.f38390t0;
        try {
            if (viewGroup == profileActivity.f35984a && profileActivity.M) {
                org.telegram.ui.Components.jl0 currentListView = profileActivity.K.getCurrentListView();
                if (profileActivity.K.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new ez0(this, 1));
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f38389s0.f165a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (this.f38390t0.F4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.f38396z0;
        profileActivity.C0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = profileActivity.C;
            if (i11 >= n5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.n5 n5Var = n5VarArr[i11];
            if (n5Var != null) {
                n5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr2 = profileActivity.D;
            if (i10 < n5VarArr2.length) {
                org.telegram.ui.Components.n5 n5Var2 = n5VarArr2[i10];
                if (n5Var2 != null) {
                    n5Var2.a();
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
        ProfileActivity profileActivity = this.f38396z0;
        int i10 = 0;
        profileActivity.C0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr = profileActivity.C;
            if (i11 >= n5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.n5 n5Var = n5VarArr[i11];
            if (n5Var != null) {
                n5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.n5[] n5VarArr2 = profileActivity.D;
            if (i10 < n5VarArr2.length) {
                org.telegram.ui.Components.n5 n5Var2 = n5VarArr2[i10];
                if (n5Var2 != null) {
                    n5Var2.b();
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
        ProfileActivity profileActivity = this.f38396z0;
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.f38396z0;
        rg.c.c(profileActivity.f36068l6, profileActivity.fragmentView);
        profileActivity.f36074m6.d();
    }

    @Override
    public final void requestLayout() {
        if (this.f38391u0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f38389s0.f165a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
