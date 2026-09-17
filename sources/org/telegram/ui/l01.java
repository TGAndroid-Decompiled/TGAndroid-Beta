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
public final class l01 extends org.telegram.ui.Components.qv0 implements r0.m {
    public boolean A0;
    public final ArrayList B0;
    public final ff C0;
    public final ProfileActivity D0;
    public final b2.q0 f35399w0;
    public final ProfileActivity f35400x0;
    public boolean f35401y0;
    public final Paint f35402z0;

    public l01(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.D0 = profileActivity;
        this.f35400x0 = profileActivity;
        this.f35399w0 = new Object();
        this.f35402z0 = new Paint();
        this.B0 = new ArrayList();
        this.C0 = new ff(27);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.ml0 currentListView;
        int L0;
        int max;
        ProfileActivity profileActivity = this.f35400x0;
        if (viewGroup == profileActivity.f31251a) {
            int i14 = -1;
            if (profileActivity.J4 != -1 && profileActivity.Q) {
                kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                boolean z10 = kVar.f19304n0;
                int top = profileActivity.O.getTop();
                boolean z11 = false;
                if (i11 < 0) {
                    if (top <= 0 && (currentListView = profileActivity.O.getCurrentListView()) != null && (L0 = ((s4.c0) currentListView.getLayoutManager()).L0()) != -1) {
                        s4.c1 L = currentListView.L(L0);
                        if (L != null) {
                            i14 = L.f42697a.getTop();
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
                    org.telegram.ui.Components.ml0 currentListView2 = profileActivity.O.getCurrentListView();
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
        ProfileActivity profileActivity = this.f35400x0;
        canvas.translate(0.0f, profileActivity.f31251a.getY());
        profileActivity.O.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        ProfileActivity profileActivity = this.D0;
        org.telegram.ui.Components.f50 f50Var = profileActivity.f31413x0;
        Paint paint = profileActivity.f31364q2;
        fh.d dVar = profileActivity.f31348n6;
        ah.i iVar = profileActivity.f31340m6;
        Paint paint2 = profileActivity.f31420y0;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f9078n) {
                RecordingCanvas a2 = dVar.a(measuredWidth, measuredHeight);
                a2.drawColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18806a7, profileActivity.f31425z0));
                if (SharedConfig.chatBlurEnabled()) {
                    iVar.b(a2, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.j6.f18806a7;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.f31425z0));
        if (profileActivity.f31251a.getVisibility() == 0) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.f31425z0);
            Paint paint3 = this.f35402z0;
            paint3.setColor(v02);
            if (profileActivity.H1) {
                paint.setAlpha((int) (profileActivity.f31251a.getAlpha() * 255.0f));
            }
            if (profileActivity.H1) {
                paint3.setAlpha((int) (profileActivity.f31251a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f31251a.getChildCount();
            ArrayList arrayList = this.B0;
            arrayList.clear();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f31251a.getChildAt(i11);
                profileActivity.f31251a.getClass();
                if (RecyclerView.S(childAt) != -1) {
                    arrayList.add(profileActivity.f31251a.getChildAt(i11));
                } else {
                    z11 = true;
                }
            }
            Collections.sort(arrayList, this.C0);
            profileActivity.f31251a.getY();
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
                profileActivity.f31251a.getY();
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
        if (f50Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f31413x0);
        }
        if (profileActivity.f31406w0 != null) {
            int save = canvas.save();
            canvas.translate(profileActivity.f31406w0.getLeft(), profileActivity.f31406w0.getTop());
            View view2 = profileActivity.f31406w0;
            kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (view2 == kVar.getBackButton()) {
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((f50Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float max = Math.max(profileActivity.f31406w0.getMeasuredWidth(), profileActivity.f31406w0.getMeasuredHeight()) / 2;
                canvas.drawCircle(max, max, 0.7f * max, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f31406w0.draw(canvas);
            canvas.restoreToCount(save);
        }
        u50 u50Var = profileActivity.U;
        float f10 = 0.0f;
        if (u50Var != null && u50Var.getVisibility() == 0) {
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
            hz0 hz0Var = profileActivity.f31251a;
            if (hz0Var != null) {
                f7 = hz0Var.getTranslationX();
            } else {
                f7 = 0.0f;
            }
            canvas.translate(f7, 0.0f);
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, profileActivity.f31425z0);
            int i13 = profileActivity.f31334l6;
            hz0 hz0Var2 = profileActivity.f31251a;
            if (hz0Var2 != null) {
                f10 = hz0Var2.getAlpha();
            }
            AndroidUtilities.drawNavigationBarProtection(canvas, this, v03, i13, f10);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.st0[] st0VarArr;
        org.telegram.ui.Components.st0 st0Var;
        ProfileActivity profileActivity = this.D0;
        vz0 vz0Var = profileActivity.V4;
        if (vz0Var.f37321n) {
            return vz0Var.g(motionEvent);
        }
        n01 n01Var = profileActivity.O;
        if (n01Var != null && (st0Var = (st0VarArr = n01Var.f30632k0)[0]) != null && st0Var.h.getFastScroll() != null && st0VarArr[0].h.getFastScroll().f28138n) {
            n01 n01Var2 = profileActivity.O;
            if (n01Var2.d) {
                return n01Var2.O(motionEvent);
            }
        }
        n01 n01Var3 = profileActivity.O;
        if (n01Var3 != null && n01Var3.H(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.D0;
        if (profileActivity.V4.f37321n) {
            if (view != profileActivity.Z) {
                kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
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
        ProfileActivity profileActivity = this.f35400x0;
        try {
            if (viewGroup == profileActivity.f31251a && profileActivity.Q) {
                org.telegram.ui.Components.ml0 currentListView = profileActivity.O.getCurrentListView();
                if (profileActivity.O.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new k01(this, 1));
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f35399w0.f3203a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ProfileActivity profileActivity = this.D0;
        profileActivity.G0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.m5[] m5VarArr = profileActivity.G;
            if (i11 >= m5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.m5 m5Var = m5VarArr[i11];
            if (m5Var != null) {
                m5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.m5[] m5VarArr2 = profileActivity.H;
            if (i10 < m5VarArr2.length) {
                org.telegram.ui.Components.m5 m5Var2 = m5VarArr2[i10];
                if (m5Var2 != null) {
                    m5Var2.a();
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
            org.telegram.ui.Components.m5[] m5VarArr = profileActivity.G;
            if (i11 >= m5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.m5 m5Var = m5VarArr[i11];
            if (m5Var != null) {
                m5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.m5[] m5VarArr2 = profileActivity.H;
            if (i10 < m5VarArr2.length) {
                org.telegram.ui.Components.m5 m5Var2 = m5VarArr2[i10];
                if (m5Var2 != null) {
                    m5Var2.b();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l01.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.D0;
        gh.d.c(profileActivity.f31361p6, profileActivity.fragmentView);
        profileActivity.q6.d();
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f35400x0.J4 != -1 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f35401y0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f35399w0.f3203a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
