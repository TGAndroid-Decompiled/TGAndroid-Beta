package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

public final class fz0 extends org.telegram.ui.Components.zu0 implements r0.n {

    public final d5.p f38239s0;

    public final ProfileActivity f38240t0;

    public boolean f38241u0;

    public final Paint f38242v0;

    public boolean f38243w0;

    public final ArrayList f38244x0;

    public final org.telegram.ui.Components.lp0 f38245y0;

    public final ProfileActivity f38246z0;

    public fz0(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.f38246z0 = profileActivity;
        this.f38240t0 = profileActivity;
        this.f38239s0 = new d5.p();
        this.f38242v0 = new Paint();
        this.f38244x0 = new ArrayList();
        this.f38245y0 = new org.telegram.ui.Components.lp0(11);
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int i13;
        org.telegram.ui.Components.zk0 currentListView;
        int iL0;
        ProfileActivity profileActivity = this.f38240t0;
        if (viewGroup == profileActivity.f35921a) {
            if (profileActivity.F4 == -1 || !profileActivity.M) {
                return;
            }
            boolean z10 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.f23578j0;
            int top = profileActivity.K.getTop();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    org.telegram.ui.Components.zk0 currentListView2 = profileActivity.K.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView2 == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView2.scrollBy(0, i13);
                    return;
                }
                return;
            }
            if (top <= 0 && (currentListView = profileActivity.K.getCurrentListView()) != null && (iL0 = ((f2.k0) currentListView.getLayoutManager()).L0()) != -1) {
                f2.o1 o1VarK = currentListView.K(iL0);
                int top2 = o1VarK != null ? o1VarK.f5789a.getTop() : -1;
                int paddingTop = currentListView.getPaddingTop();
                if (top2 != paddingTop || iL0 != 0) {
                    iArr[1] = iL0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                    currentListView.scrollBy(0, i11);
                    z11 = true;
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        canvas.save();
        ProfileActivity profileActivity = this.f38240t0;
        canvas.translate(0.0f, profileActivity.f35921a.getY());
        profileActivity.K.Q(canvas, arrayList);
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ProfileActivity profileActivity = this.f38246z0;
        org.telegram.ui.Components.u40 u40Var = profileActivity.f36055t0;
        Paint paint = profileActivity.f36008m2;
        og.d dVar = profileActivity.f35993j6;
        jg.e eVar = profileActivity.f35986i6;
        Paint paint2 = profileActivity.f36061u0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
            ProfileActivity.B0(profileActivity);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (dVar != null && !dVar.f19455n) {
                RecordingCanvas recordingCanvasA = dVar.a(measuredWidth, measuredHeight);
                recordingCanvasA.drawColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, profileActivity.f36067v0));
                if (SharedConfig.chatBlurEnabled()) {
                    eVar.b(recordingCanvasA, -2);
                }
                dVar.b();
            }
        }
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36067v0));
        if (profileActivity.f35921a.getVisibility() == 0) {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, profileActivity.f36067v0);
            Paint paint3 = this.f38242v0;
            paint3.setColor(iV0);
            if (profileActivity.D1) {
                paint.setAlpha((int) (profileActivity.f35921a.getAlpha() * 255.0f));
            }
            if (profileActivity.D1) {
                paint3.setAlpha((int) (profileActivity.f35921a.getAlpha() * 255.0f));
            }
            int childCount = profileActivity.f35921a.getChildCount();
            ArrayList arrayList = this.f38244x0;
            arrayList.clear();
            boolean z10 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = profileActivity.f35921a.getChildAt(i11);
                profileActivity.f35921a.getClass();
                if (RecyclerView.R(childAt) != -1) {
                    arrayList.add(profileActivity.f35921a.getChildAt(i11));
                } else {
                    z10 = true;
                }
            }
            Collections.sort(arrayList, this.f38245y0);
            profileActivity.f35921a.getY();
            int size = arrayList.size();
            if (!profileActivity.C1 && size > 0 && !z10) {
                ((View) arrayList.get(0)).getY();
            }
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList.get(i12);
                boolean z12 = view.getBackground() != null;
                profileActivity.f35921a.getY();
                view.getY();
                if (z11 == z12) {
                    view.getAlpha();
                } else {
                    view.getAlpha();
                    z11 = z12;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (u40Var.getAlpha() > 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), profileActivity.f36055t0);
        }
        if (profileActivity.f36049s0 != null) {
            int iSave = canvas.save();
            canvas.translate(profileActivity.f36049s0.getLeft(), profileActivity.f36049s0.getTop());
            if (profileActivity.f36049s0 == ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getBackButton()) {
                int iMax = Math.max(profileActivity.f36049s0.getMeasuredWidth(), profileActivity.f36049s0.getMeasuredHeight()) / 2;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (((u40Var.getAlpha() / 255.0f) * alpha) / 0.3f));
                float f10 = iMax;
                canvas.drawCircle(f10, f10, 0.7f * f10, paint2);
                paint2.setAlpha(alpha);
            }
            profileActivity.f36049s0.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        aj0 aj0Var = profileActivity.Q;
        if (aj0Var != null && aj0Var.getVisibility() == 0) {
            if (profileActivity.Q.getAlpha() == 1.0f) {
                profileActivity.Q.draw(canvas);
            } else if (profileActivity.Q.getAlpha() != 0.0f) {
                canvas.saveLayerAlpha(profileActivity.Q.getLeft(), profileActivity.Q.getTop(), profileActivity.Q.getRight(), profileActivity.Q.getBottom(), (int) (profileActivity.Q.getAlpha() * 255.0f), 31);
                canvas.translate(profileActivity.Q.getLeft(), profileActivity.Q.getTop());
                profileActivity.Q.draw(canvas);
                canvas.restore();
            }
        }
        if (profileActivity.E0) {
            return;
        }
        canvas.save();
        by0 by0Var = profileActivity.f35921a;
        canvas.translate(by0Var != null ? by0Var.getTranslationX() : 0.0f, 0.0f);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0);
        int i13 = profileActivity.f35979h6;
        by0 by0Var2 = profileActivity.f35921a;
        AndroidUtilities.drawNavigationBarProtection(canvas, this, iV1, i13, by0Var2 != null ? by0Var2.getAlpha() : 0.0f);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.zs0[] zs0VarArr;
        org.telegram.ui.Components.zs0 zs0Var;
        ProfileActivity profileActivity = this.f38246z0;
        qy0 qy0Var = profileActivity.R4;
        if (qy0Var.f41180n) {
            return qy0Var.g(motionEvent);
        }
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && (zs0Var = (zs0VarArr = hz0Var.f29122g0)[0]) != null && zs0Var.h.getFastScroll() != null && zs0VarArr[0].h.getFastScroll().f29396n) {
            hz0 hz0Var2 = profileActivity.K;
            if (hz0Var2.d) {
                return hz0Var2.O(motionEvent);
            }
        }
        hz0 hz0Var3 = profileActivity.K;
        if (hz0Var3 == null || !hz0Var3.H(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ProfileActivity profileActivity = this.f38246z0;
        if ((profileActivity.R4.f41180n && (view == profileActivity.V || view == ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar || view == profileActivity.v)) || view == profileActivity.Q) {
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
        ProfileActivity profileActivity = this.f38240t0;
        try {
            if (viewGroup == profileActivity.f35921a && profileActivity.M) {
                org.telegram.ui.Components.zk0 currentListView = profileActivity.K.getCurrentListView();
                if (profileActivity.K.getTop() == 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
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
        ProfileActivity profileActivity = this.f38246z0;
        profileActivity.C0 = true;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
            if (i11 >= i5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i11];
            if (i5Var != null) {
                i5Var.a();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr2 = profileActivity.D;
            if (i10 >= i5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.i5 i5Var2 = i5VarArr2[i10];
            if (i5Var2 != null) {
                i5Var2.a();
            }
            i10++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ProfileActivity profileActivity = this.f38246z0;
        int i10 = 0;
        profileActivity.C0 = false;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
            if (i11 >= i5VarArr.length) {
                break;
            }
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i11];
            if (i5Var != null) {
                i5Var.b();
            }
            i11++;
        }
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr2 = profileActivity.D;
            if (i10 >= i5VarArr2.length) {
                return;
            }
            org.telegram.ui.Components.i5 i5Var2 = i5VarArr2[i10];
            if (i5Var2 != null) {
                i5Var2.b();
            }
            i10++;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ProfileActivity profileActivity = this.f38246z0;
        profileActivity.Q5 = -1;
        profileActivity.P4 = false;
        profileActivity.Q4 = false;
        profileActivity.A3();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        char c10;
        org.telegram.ui.Components.dr[] drVarArr;
        int measuredWidth;
        int iMax;
        View childAt;
        int iB;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        char c11;
        int measuredWidth2;
        int iMax2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.f38246z0;
        org.telegram.ui.Components.dr[] drVarArr2 = profileActivity.G;
        org.telegram.ui.Components.dr[] drVarArr3 = profileActivity.F;
        HashMap map = profileActivity.U1;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f35958f;
        int i14 = 0;
        int i15 = currentActionBarHeight + (((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        by0 by0Var = profileActivity.f35921a;
        if (by0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) by0Var.getLayoutParams();
            if (layoutParams.topMargin != i15) {
                layoutParams.topMargin = i15;
            }
        }
        org.telegram.ui.Components.zk0 zk0Var = profileActivity.f35927b;
        if (zk0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zk0Var.getLayoutParams();
            if (layoutParams2.topMargin != i15) {
                layoutParams2.topMargin = i15;
            }
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        if (profileActivity.f36087y0 == getMeasuredWidth() && profileActivity.f36093z0 == getMeasuredHeight()) {
            drVarArr = drVarArr2;
            z10 = false;
            c10 = 0;
        } else {
            int i16 = profileActivity.f36087y0;
            z10 = (i16 == 0 || i16 == getMeasuredWidth()) ? false : true;
            profileActivity.A0 = 0;
            int i17 = profileActivity.d.f43554e.J2;
            profileActivity.f36087y0 = getMeasuredWidth();
            profileActivity.f36093z0 = getMeasuredHeight();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(profileActivity.f35921a.getMeasuredHeight(), 0);
            map.clear();
            c10 = 0;
            while (i14 < i17) {
                int iJ = profileActivity.d.j(i14);
                org.telegram.ui.Components.dr[] drVarArr4 = drVarArr2;
                map.put(Integer.valueOf(i14), Integer.valueOf(profileActivity.A0));
                if (iJ == 13) {
                    profileActivity.A0 += profileActivity.f35921a.getMeasuredHeight();
                } else {
                    f2.o1 o1VarG = profileActivity.d.g(null, iJ);
                    View view = o1VarG.f5789a;
                    profileActivity.d.v(o1VarG, i14);
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    profileActivity.A0 += view.getMeasuredHeight();
                }
                i14++;
                drVarArr2 = drVarArr4;
            }
            drVarArr = drVarArr2;
            org.telegram.ui.Components.iw0 iw0Var = profileActivity.L;
            if (iw0Var != null) {
                ((FrameLayout.LayoutParams) iw0Var.getLayoutParams()).topMargin = profileActivity.T3() + AndroidUtilities.statusBarHeight;
            }
        }
        if (profileActivity.f35941c5 != null) {
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[c10];
            h5Var.setRightPadding(h5Var.getMeasuredWidth() - profileActivity.f35941c5.p().getTitleTextView().getMeasuredWidth());
        }
        boolean z15 = profileActivity.f35978h5;
        if (z15 || !((z14 = profileActivity.f35988j1) || (profileActivity.C1 && profileActivity.F1 == 2))) {
            if (z15 && !profileActivity.C1 && !profileActivity.P4) {
                this.f38241u0 = true;
                if (profileActivity.E0 || !(profileActivity.f35989j2 || AndroidUtilities.isTablet())) {
                    measuredWidth = profileActivity.f35921a.getMeasuredWidth() + profileActivity.O3();
                    iMax = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.A0) + i15));
                } else {
                    measuredWidth = profileActivity.T3();
                    iMax = 0;
                }
                if (profileActivity.A1 != 0) {
                    iMax += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
                    profileActivity.f35921a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
                } else {
                    profileActivity.f35921a.setBottomGlowOffset(0);
                }
                int paddingTop = profileActivity.f35921a.getPaddingTop();
                int i18 = 0;
                while (true) {
                    if (i18 >= profileActivity.f35921a.getChildCount()) {
                        childAt = null;
                        iB = -1;
                        break;
                    } else {
                        iB = RecyclerView.R(profileActivity.f35921a.getChildAt(i18));
                        if (iB != -1) {
                            childAt = profileActivity.f35921a.getChildAt(i18);
                            break;
                        }
                        i18++;
                    }
                }
                if (childAt == null && (childAt = profileActivity.f35921a.getChildAt(0)) != null) {
                    by0 by0Var2 = profileActivity.f35921a;
                    View viewF = by0Var2.F(childAt);
                    f2.o1 o1VarT = viewF == null ? null : by0Var2.T(viewF);
                    iB = o1VarT.b();
                    if (iB == -1 && (iB = o1VarT.f5794g) == -1) {
                        iB = o1VarT.f5791c;
                    }
                }
                int top = childAt != null ? childAt.getTop() : measuredWidth;
                if ((((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.f23578j0 || profileActivity.f36015n1) && (i12 = profileActivity.F4) >= 0) {
                    profileActivity.f35935c.h1(i12, -measuredWidth);
                } else {
                    if (profileActivity.Q4 || paddingTop != measuredWidth) {
                        int i19 = profileActivity.Q5;
                        if (i19 >= 0) {
                            profileActivity.f35935c.h1(i19, profileActivity.R5 - measuredWidth);
                            i13 = 0;
                        } else if ((z10 && profileActivity.f35996k2) || childAt == null) {
                            i13 = 0;
                            profileActivity.f35935c.h1(0, profileActivity.T3() - measuredWidth);
                        } else {
                            if (iB == 0 && !profileActivity.f35996k2 && top > profileActivity.T3()) {
                                top = profileActivity.T3();
                            }
                            profileActivity.f35935c.h1(iB, top - measuredWidth);
                        }
                    } else {
                        i13 = 0;
                    }
                    z11 = false;
                    if (paddingTop == measuredWidth || profileActivity.f35921a.getPaddingBottom() != iMax) {
                        profileActivity.f35921a.setPadding(i13, measuredWidth, i13, iMax);
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (z12) {
                        measureChildWithMargins(profileActivity.f35921a, i10, 0, i11, 0);
                        try {
                            by0 by0Var3 = profileActivity.f35921a;
                            by0Var3.layout(0, i15, by0Var3.getMeasuredWidth(), profileActivity.f35921a.getMeasuredHeight() + i15);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    this.f38241u0 = false;
                }
                i13 = 0;
                z11 = true;
                if (paddingTop == measuredWidth) {
                    profileActivity.f35921a.setPadding(i13, measuredWidth, i13, iMax);
                    z12 = true;
                } else {
                    profileActivity.f35921a.setPadding(i13, measuredWidth, i13, iMax);
                    z12 = true;
                }
                if (z12) {
                    measureChildWithMargins(profileActivity.f35921a, i10, 0, i11, 0);
                    by0 by0Var4 = profileActivity.f35921a;
                    by0Var4.layout(0, i15, by0Var4.getMeasuredWidth(), profileActivity.f35921a.getMeasuredHeight() + i15);
                }
                this.f38241u0 = false;
            }
            if (size > View.MeasureSpec.getSize(i10)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 != this.f38243w0) {
                post(new ez0(this, 0));
                this.f38243w0 = z13;
            }
        }
        this.f38241u0 = true;
        if (z14) {
            org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
            if (v0Var != null) {
                v0Var.setAlpha(0.0f);
                profileActivity.Q0.setEnabled(false);
                profileActivity.Q0.setVisibility(8);
            }
            h5VarArr[1].setTextColor(-1);
            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[1];
            h5Var2.setPivotY(h5Var2.getMeasuredHeight());
            h5VarArr[1].setScaleX(1.38f);
            h5VarArr[1].setScaleY(1.38f);
            org.telegram.ui.Components.ll0 ll0Var = profileActivity.H;
            if (ll0Var != null) {
                ll0Var.b(Color.argb(179, 255, 255, 255));
            }
            Drawable drawable = profileActivity.f36079x;
            if (drawable != null) {
                drawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            }
            org.telegram.ui.Components.dr drVar = drVarArr3[0];
            if (drVar != null) {
                drVar.b(1.0f);
            }
            org.telegram.ui.Components.dr drVar2 = drVarArr3[1];
            if (drVar2 != null) {
                drVar2.b(1.0f);
            }
            org.telegram.ui.Components.dr drVar3 = drVarArr[0];
            if (drVar3 != null) {
                drVar3.b(1.0f);
            }
            org.telegram.ui.Components.dr drVar4 = drVarArr[1];
            if (drVar4 != null) {
                drVar4.b(1.0f);
            }
            profileActivity.Y4(1.0f);
            profileActivity.f36040r[1].setTextColor(-1275068417);
            ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.C(1090519039, false);
            ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.D(-1, false);
            wz0 wz0Var = profileActivity.J;
            wz0Var.A = true;
            wz0Var.setVisibility(0);
            profileActivity.J.e(1.0f, false);
            profileActivity.f35922a0.setForegroundAlpha(1.0f);
            profileActivity.U.setVisibility(4);
            profileActivity.f35987j0.L();
            profileActivity.f35987j0.setVisibility(0);
            h01 h01Var = profileActivity.X5;
            if (h01Var != null) {
                h01Var.a(603979775);
            }
            oy0 oy0Var = profileActivity.f36034q0;
            if (oy0Var != null) {
                oy0Var.setExpandProgress(1.0f);
            }
            hh.v0 v0Var2 = profileActivity.f36041r0;
            if (v0Var2 != null) {
                v0Var2.setExpandProgress(1.0f);
            }
            org.telegram.ui.Components.rg0 rg0Var = profileActivity.W;
            if (rg0Var != null) {
                rg0Var.setParentExpanded(1.0f);
            }
            org.telegram.ui.Components.jh0 jh0Var = profileActivity.Y;
            if (jh0Var != null) {
                jh0Var.setParentExpanded(1.0f);
            }
            org.telegram.ui.Components.sv0 sv0Var = profileActivity.P;
            if (sv0Var != null) {
                sv0Var.setParentExpanded(1.0f);
            }
            c11 = 0;
            profileActivity.f35988j1 = false;
            profileActivity.V4();
        } else {
            c11 = 0;
        }
        profileActivity.z3();
        profileActivity.f35996k2 = true;
        profileActivity.f36002l2 = true;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i20 = NotificationCenter.needCheckSystemBarColors;
        Object[] objArr = new Object[1];
        objArr[c11] = Boolean.TRUE;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i20, objArr);
        if (profileActivity.P0 != null) {
            if (profileActivity.g4()) {
                profileActivity.P0.r(21);
            } else {
                profileActivity.P0.K(21);
            }
            if (profileActivity.m0 != null) {
                profileActivity.P0.K(34);
                profileActivity.P0.K(35);
                profileActivity.P0.r(31);
            }
        }
        profileActivity.f35975h2 = 1.0f;
        if (profileActivity.f35989j2) {
            measuredWidth2 = profileActivity.T3() + i15;
            iMax2 = 0;
        } else {
            measuredWidth2 = profileActivity.f35921a.getMeasuredWidth() + profileActivity.O3();
            iMax2 = Math.max(0, getMeasuredHeight() - ((profileActivity.T3() + profileActivity.A0) + i15));
        }
        if (profileActivity.A1 != 0) {
            iMax2 += AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight;
            profileActivity.f35921a.setBottomGlowOffset(AndroidUtilities.dp(48.0f) + AndroidUtilities.navigationBarHeight);
        } else {
            profileActivity.f35921a.setBottomGlowOffset(0);
        }
        float f10 = measuredWidth2 - i15;
        profileActivity.N1 = f10;
        if (profileActivity.F1 == 0) {
            profileActivity.M1 = f10;
        }
        profileActivity.f35935c.h1(0, -i15);
        profileActivity.f35921a.setPadding(0, measuredWidth2, 0, iMax2);
        measureChildWithMargins(profileActivity.f35921a, i10, 0, i11, 0);
        by0 by0Var5 = profileActivity.f35921a;
        by0Var5.layout(0, i15, by0Var5.getMeasuredWidth(), profileActivity.f35921a.getMeasuredHeight() + i15);
        this.f38241u0 = false;
        if (size > View.MeasureSpec.getSize(i10)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 != this.f38243w0) {
            post(new ez0(this, 0));
            this.f38243w0 = z13;
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ProfileActivity profileActivity = this.f38246z0;
        pg.c.c(profileActivity.f36006l6, profileActivity.fragmentView);
        profileActivity.f36012m6.d();
    }

    @Override
    public final void p(int i10, View view) {
        this.f38239s0.f4821a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i10, int i11) {
        return this.f38240t0.F4 != -1 && i10 == 2;
    }

    @Override
    public final void requestLayout() {
        if (this.f38241u0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.f38239s0.f4821a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
