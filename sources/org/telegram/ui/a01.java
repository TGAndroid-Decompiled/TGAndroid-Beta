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
public final class a01 extends org.telegram.ui.Components.bw0 implements r0.m {
    public boolean A0;
    public final ArrayList B0;
    public final cf C0;
    public final ProfileActivity D0;
    public final b2.q0 f31934w0;
    public final ProfileActivity f31935x0;
    public boolean f31936y0;
    public final Paint f31937z0;

    public a01(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.D0 = profileActivity;
        this.f31935x0 = profileActivity;
        this.f31934w0 = new Object();
        this.f31937z0 = new Paint();
        this.B0 = new ArrayList();
        this.C0 = new cf(27);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.xl0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f31935x0;
        if (viewGroup == profileActivity.f31523a) {
            int i14 = -1;
            if (profileActivity.J4 != -1 && profileActivity.Q) {
                kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                boolean z10 = kVar.f19555n0;
                int top = profileActivity.O.getTop();
                boolean z11 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((s4.c0) currentListView.getLayoutManager()).L0()) != -1) {
                        s4.c1 K = currentListView.K(L0);
                        if (K != null) {
                            i14 = K.f42959a.getTop();
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
                    org.telegram.ui.Components.xl0 currentListView2 = profileActivity.O.getCurrentListView();
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
        ProfileActivity profileActivity = this.f31935x0;
        canvas.translate(0.0f, profileActivity.f31523a.getY());
        profileActivity.O.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.h50 h50Var = profileActivity.f31685x0;
        Paint paint = profileActivity.f31636q2;
        fh.d dVar = profileActivity.f31620n6;
        ah.h hVar = profileActivity.f31612m6;
        Paint paint2 = profileActivity.f31692y0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f9060n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, profileActivity.f31697z0));
                if (SharedConfig.chatBlurEnabled()) {
                    hVar.b(a2, -2);
                }
                dVar.c();
            }
        }
        int i10 = org.telegram.ui.ActionBar.h6.f19003a7;
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i10, profileActivity.f31697z0));
        if (profileActivity.f31523a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.h6.v0(i10, profileActivity.f31697z0);
            Paint paint3 = this.f31937z0;
            paint3.setColor(v02);
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.f31523a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.f31523a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f31523a.getChildCount();
            ArrayList arrayList = this.B0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f31523a.getChildAt(i11);
                profileActivity.f31523a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f31523a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.C0);
            profileActivity.f31523a.getY();
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
                profileActivity.f31523a.getY();
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
        if (h50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f31685x0);
        }
        if (profileActivity.f31678w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f31678w0.getLeft(), profileActivity.f31678w0.getTop());
            View view2 = profileActivity.f31678w0;
            kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((h50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f31678w0.getMeasuredWidth(), profileActivity.f31678w0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f31678w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        n50 n50Var = profileActivity.U;
        float f10 = 0.0f;
        if (n50Var != null && n50Var.getVisibility() == 0) {
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
            wy0 wy0Var = profileActivity.f31523a;
            if (wy0Var != null) {
                f7 = wy0Var.getTranslationX();
            } else {
                f7 = 0.0f;
            }
            canvas.translate(f7, 0.0f);
            int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, profileActivity.f31697z0);
            int i13 = profileActivity.f31606l6;
            wy0 wy0Var2 = profileActivity.f31523a;
            if (wy0Var2 != null) {
                f10 = wy0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i13, f10);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.du0[] du0VarArr;
        org.telegram.ui.Components.du0 du0Var;
        ProfileActivity profileActivity = this.D0;
        kz0 kz0Var = profileActivity.V4;
        if (kz0Var.f34304n) {
            return kz0Var.g(motionEvent);
        }
        c01 c01Var = profileActivity.O;
        if (c01Var != null && (du0Var = (du0VarArr = c01Var.f25842k0)[0]) != null && du0Var.h.getFastScroll() != null && du0VarArr[0].h.getFastScroll().f23987n) {
            c01 c01Var2 = profileActivity.O;
            if (c01Var2.d) {
                return c01Var2.O(motionEvent);
            }
        }
        c01 c01Var3 = profileActivity.O;
        if (c01Var3 != null && c01Var3.H(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        if (profileActivity.V4.f34304n) {
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
        ProfileActivity profileActivity = this.f31935x0;
        try {
            if (viewGroup == profileActivity.f31523a && profileActivity.Q) {
                org.telegram.ui.Components.xl0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new zz0(this, 1));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f31934w0.f3195a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.D0;
        profileActivity.G0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.o5[] o5VarArr = profileActivity.G;
            if (i11 >= o5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.o5 o5Var = o5VarArr[i11];
            if (o5Var != null) {
                o5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.o5[] o5VarArr2 = profileActivity.H;
            if (i10 < o5VarArr2.length) {
                org.telegram.ui.Components.o5 o5Var2 = o5VarArr2[i10];
                if (o5Var2 != null) {
                    o5Var2.a();
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
            org.telegram.ui.Components.o5[] o5VarArr = profileActivity.G;
            if (i11 >= o5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.o5 o5Var = o5VarArr[i11];
            if (o5Var != null) {
                o5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.o5[] o5VarArr2 = profileActivity.H;
            if (i10 < o5VarArr2.length) {
                org.telegram.ui.Components.o5 o5Var2 = o5VarArr2[i10];
                if (o5Var2 != null) {
                    o5Var2.b();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a01.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        gh.d.c(profileActivity.f31633p6, profileActivity.fragmentView);
        profileActivity.q6.d();
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f31935x0.J4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31936y0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f31934w0.f3195a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
