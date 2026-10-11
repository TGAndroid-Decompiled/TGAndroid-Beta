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
public final class h01 extends org.telegram.ui.Components.uw0 implements r0.m {
    public boolean A0;
    public final ArrayList B0;
    public final ff C0;
    public final ProfileActivity D0;
    public final b2.q0 f38197w0;
    public final ProfileActivity f38198x0;
    public boolean f38199y0;
    public final Paint f38200z0;

    public h01(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.D0 = profileActivity;
        this.f38198x0 = profileActivity;
        this.f38197w0 = new Object();
        this.f38200z0 = new Paint();
        this.B0 = new ArrayList();
        this.C0 = new ff(27);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.sm0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f38198x0;
        if (viewGroup == profileActivity.f34239a) {
            int i14 = -1;
            if (profileActivity.J4 != -1 && profileActivity.Q) {
                kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                boolean z10 = kVar.f21286n0;
                int top = profileActivity.O.getTop();
                boolean z11 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((s4.d0) currentListView.getLayoutManager()).L0()) != -1) {
                        s4.d1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f47748a.getTop();
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
                    org.telegram.ui.Components.sm0 currentListView2 = profileActivity.O.getCurrentListView();
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
        ProfileActivity profileActivity = this.f38198x0;
        canvas.translate(0.0f, profileActivity.f34239a.getY());
        profileActivity.O.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.y50 y50Var = profileActivity.f34402x0;
        Paint paint = profileActivity.f34353q2;
        fh.d dVar = profileActivity.f34337n6;
        ah.h hVar = profileActivity.f34329m6;
        Paint paint2 = profileActivity.f34409y0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f9938n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20730a7, profileActivity.f34414z0));
                if (SharedConfig.chatBlurEnabled()) {
                    hVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.h6.f20730a7;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.f34414z0));
        if (profileActivity.f34239a.getVisibility() == 0) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.f34414z0);
            Paint paint3 = this.f38200z0;
            paint3.setColor(w02);
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.f34239a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.f34239a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f34239a.getChildCount();
            ArrayList arrayList = this.B0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f34239a.getChildAt(i11);
                profileActivity.f34239a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f34239a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.C0);
            profileActivity.f34239a.getY();
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
                profileActivity.f34239a.getY();
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
        if (y50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f34402x0);
        }
        if (profileActivity.f34395w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f34395w0.getLeft(), profileActivity.f34395w0.getTop());
            View view2 = profileActivity.f34395w0;
            kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((y50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f34395w0.getMeasuredWidth(), profileActivity.f34395w0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f34395w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        q50 q50Var = profileActivity.U;
        float f10 = 0.0f;
        if (q50Var != null && q50Var.getVisibility() == 0) {
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
        if (!profileActivity.I0) {
            canvas.save();
            dz0 dz0Var = profileActivity.f34239a;
            if (dz0Var != null) {
                f7 = dz0Var.getTranslationX();
            } else {
                f7 = 0.0f;
            }
            canvas.translate(f7, 0.0f);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, profileActivity.f34414z0);
            int i13 = profileActivity.f34323l6;
            dz0 dz0Var2 = profileActivity.f34239a;
            if (dz0Var2 != null) {
                f10 = dz0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, w03, i13, f10);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.wu0[] wu0VarArr;
        org.telegram.ui.Components.wu0 wu0Var;
        ProfileActivity profileActivity = this.D0;
        sz0 sz0Var = profileActivity.V4;
        if (sz0Var.f40976n) {
            return sz0Var.g(motionEvent);
        }
        j01 j01Var = profileActivity.O;
        if (j01Var != null && (wu0Var = (wu0VarArr = j01Var.f25711k0)[0]) != null && wu0Var.h.getFastScroll() != null && wu0VarArr[0].h.getFastScroll().f33584n) {
            j01 j01Var2 = profileActivity.O;
            if (j01Var2.d) {
                return j01Var2.O(motionEvent);
            }
        }
        j01 j01Var3 = profileActivity.O;
        if (j01Var3 != null && j01Var3.H(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        if (profileActivity.V4.f40976n) {
            if (view != profileActivity.Z) {
                kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
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
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ProfileActivity profileActivity = this.f38198x0;
        try {
            if (viewGroup == profileActivity.f34239a && profileActivity.Q) {
                org.telegram.ui.Components.sm0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new g01(this, 1));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f38197w0.f3533a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.D0;
        profileActivity.G0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr = profileActivity.G;
            if (i11 >= q5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.q5 q5Var = q5VarArr[i11];
            if (q5Var != null) {
                q5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr2 = profileActivity.H;
            if (i10 < q5VarArr2.length) {
                org.telegram.ui.Components.q5 q5Var2 = q5VarArr2[i10];
                if (q5Var2 != null) {
                    q5Var2.a();
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
        profileActivity.G0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr = profileActivity.G;
            if (i11 >= q5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.q5 q5Var = q5VarArr[i11];
            if (q5Var != null) {
                q5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.q5[] q5VarArr2 = profileActivity.H;
            if (i10 < q5VarArr2.length) {
                org.telegram.ui.Components.q5 q5Var2 = q5VarArr2[i10];
                if (q5Var2 != null) {
                    q5Var2.b();
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
        profileActivity.U5 = -1;
        profileActivity.T4 = false;
        profileActivity.U4 = false;
        profileActivity.A3();
    }

    @Override
    public final void onMeasure(int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h01.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        gh.d.c(profileActivity.f34350p6, profileActivity.fragmentView);
        profileActivity.q6.d();
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f38198x0.J4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38199y0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f38197w0.f3533a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
