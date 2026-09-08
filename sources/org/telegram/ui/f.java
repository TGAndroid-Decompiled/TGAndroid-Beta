package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class f extends ViewGroup {
    public final int f36240a;
    public final Object f36241b;

    public f(Object obj, Context context, int i10) {
        super(context);
        this.f36240a = i10;
        this.f36241b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f36240a) {
            case 1:
                org.telegram.ui.Components.eg0 eg0Var = (org.telegram.ui.Components.eg0) this.f36241b;
                if (!eg0Var.m0) {
                    canvas.save();
                    canvas.scale(eg0Var.H / eg0Var.f25710e.getWidth(), eg0Var.I / eg0Var.f25710e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (!((org.telegram.ui.Components.voip.h1) this.f36241b).f31545a0) {
                    super.draw(canvas);
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.f36240a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j3);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f36241b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f34268f) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) d5Var).q(canvas, usersSelectActivity.f34264a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int measuredWidth;
        switch (this.f36240a) {
            case 0:
                h hVar = (h) this.f36241b;
                kVar = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                    kVar3 = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                    kVar2.layout(0, 0, i12, kVar3.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = hVar.v;
                if (i16 != 0) {
                    if (i16 != 3) {
                        if (i16 != 5) {
                            if (i16 == 6) {
                                if (i12 > i13) {
                                    int measuredHeight = (i15 - hVar.f36850a.getMeasuredHeight()) / 2;
                                    float f11 = i14;
                                    int measuredWidth2 = ((int) ((0.5f * f11) - hVar.f36850a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.aj0 aj0Var = hVar.f36850a;
                                    aj0Var.layout(measuredWidth2, measuredHeight, aj0Var.getMeasuredWidth() + measuredWidth2, hVar.f36850a.getMeasuredHeight() + measuredHeight);
                                    float f12 = 0.4f * f11;
                                    int i17 = (int) f12;
                                    float f13 = i15;
                                    int i18 = (int) (0.14f * f13);
                                    TextView textView = hVar.f36853e;
                                    textView.layout(i17, i18, textView.getMeasuredWidth() + i17, hVar.f36853e.getMeasuredHeight() + i18);
                                    int i19 = (int) (0.31f * f13);
                                    TextView textView2 = hVar.f36854f;
                                    textView2.layout(i17, i19, textView2.getMeasuredWidth() + i17, hVar.f36854f.getMeasuredHeight() + i19);
                                    int A = (int) com.google.android.gms.internal.vision.e2.A(f11 * 0.6f, hVar.f36852c.getMeasuredWidth(), 2.0f, f12);
                                    int i20 = (int) (f13 * 0.78f);
                                    ci.n nVar = hVar.f36852c;
                                    nVar.layout(A, i20, nVar.getMeasuredWidth() + A, hVar.f36852c.getMeasuredHeight() + i20);
                                    return;
                                }
                                int i21 = (int) (i15 * 0.3f);
                                int measuredWidth3 = (i14 - hVar.f36850a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.aj0 aj0Var2 = hVar.f36850a;
                                aj0Var2.layout(measuredWidth3, i21, aj0Var2.getMeasuredWidth() + measuredWidth3, hVar.f36850a.getMeasuredHeight() + i21);
                                int C = org.telegram.messenger.w1.C(24.0f, hVar.f36850a.getMeasuredHeight(), i21);
                                TextView textView3 = hVar.f36853e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), hVar.f36853e.getMeasuredHeight() + C);
                                int textSize = (int) (hVar.f36853e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                                TextView textView4 = hVar.f36854f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), hVar.f36854f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i14 - hVar.f36852c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i15 - hVar.f36852c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                                ci.n nVar2 = hVar.f36852c;
                                nVar2.layout(measuredWidth4, measuredHeight2, nVar2.getMeasuredWidth() + measuredWidth4, hVar.f36852c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i12 > i13) {
                            int measuredHeight3 = (i15 - hVar.f36850a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.aj0 aj0Var3 = hVar.f36850a;
                            aj0Var3.layout(0, measuredHeight3, aj0Var3.getMeasuredWidth(), hVar.f36850a.getMeasuredHeight() + measuredHeight3);
                            float f14 = i14;
                            float f15 = 0.4f * f14;
                            int i22 = (int) f15;
                            float f16 = i15;
                            int i23 = (int) (0.08f * f16);
                            TextView textView5 = hVar.f36853e;
                            textView5.layout(i22, i23, textView5.getMeasuredWidth() + i22, hVar.f36853e.getMeasuredHeight() + i23);
                            float f17 = f14 * 0.6f;
                            int A2 = (int) com.google.android.gms.internal.vision.e2.A(f17, hVar.h.getMeasuredWidth(), 2.0f, f15);
                            int i24 = (int) (0.25f * f16);
                            LinearLayout linearLayout = hVar.h;
                            linearLayout.layout(A2, i24, linearLayout.getMeasuredWidth() + A2, hVar.h.getMeasuredHeight() + i24);
                            int A3 = (int) com.google.android.gms.internal.vision.e2.A(f17, hVar.f36852c.getMeasuredWidth(), 2.0f, f15);
                            int i25 = (int) (f16 * 0.78f);
                            ci.n nVar3 = hVar.f36852c;
                            nVar3.layout(A3, i25, nVar3.getMeasuredWidth() + A3, hVar.f36852c.getMeasuredHeight() + i25);
                            return;
                        } else {
                            if (AndroidUtilities.displaySize.y < 1800) {
                                f7 = i15;
                                int i26 = (int) (0.06f * f7);
                                org.telegram.ui.Components.aj0 aj0Var4 = hVar.f36850a;
                                aj0Var4.layout(0, i26, aj0Var4.getMeasuredWidth(), hVar.f36850a.getMeasuredHeight() + i26);
                                int i27 = (int) (0.463f * f7);
                                TextView textView6 = hVar.f36853e;
                                textView6.layout(0, i27, textView6.getMeasuredWidth(), hVar.f36853e.getMeasuredHeight() + i27);
                                f10 = 0.543f;
                            } else {
                                f7 = i15;
                                int i28 = (int) (0.148f * f7);
                                org.telegram.ui.Components.aj0 aj0Var5 = hVar.f36850a;
                                aj0Var5.layout(0, i28, aj0Var5.getMeasuredWidth(), hVar.f36850a.getMeasuredHeight() + i28);
                                int i29 = (int) (0.551f * f7);
                                TextView textView7 = hVar.f36853e;
                                textView7.layout(0, i29, textView7.getMeasuredWidth(), hVar.f36853e.getMeasuredHeight() + i29);
                                f10 = 0.631f;
                            }
                            int i30 = (int) (f7 * f10);
                            int measuredWidth5 = (getMeasuredWidth() - hVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = hVar.h;
                            linearLayout2.layout(measuredWidth5, i30, linearLayout2.getMeasuredWidth() + measuredWidth5, hVar.h.getMeasuredHeight() + i30);
                            int measuredWidth6 = (i14 - hVar.f36852c.getMeasuredWidth()) / 2;
                            int i31 = (int) (i15 * 0.853f);
                            ci.n nVar4 = hVar.f36852c;
                            nVar4.layout(measuredWidth6, i31, nVar4.getMeasuredWidth() + measuredWidth6, hVar.f36852c.getMeasuredHeight() + i31);
                            return;
                        }
                    } else if (i12 > i13) {
                        float f18 = i15;
                        int measuredHeight4 = ((int) ((0.95f * f18) - hVar.f36850a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - hVar.f36850a.getMeasuredWidth());
                        org.telegram.ui.Components.aj0 aj0Var6 = hVar.f36850a;
                        aj0Var6.layout(width, measuredHeight4, aj0Var6.getMeasuredWidth() + width, hVar.f36850a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i14;
                        float f20 = 0.4f * f19;
                        int i32 = (int) f20;
                        int i33 = (int) (0.12f * f18);
                        TextView textView8 = hVar.f36853e;
                        textView8.layout(i32, i33, textView8.getMeasuredWidth() + i32, hVar.f36853e.getMeasuredHeight() + i33);
                        int i34 = (int) (0.24f * f18);
                        TextView textView9 = hVar.f36854f;
                        textView9.layout(i32, i34, textView9.getMeasuredWidth() + i32, hVar.f36854f.getMeasuredHeight() + i34);
                        float f21 = f19 * 0.6f;
                        int A4 = (int) com.google.android.gms.internal.vision.e2.A(f21, hVar.f36852c.getMeasuredWidth(), 2.0f, f20);
                        int i35 = (int) (f18 * 0.8f);
                        ci.n nVar5 = hVar.f36852c;
                        nVar5.layout(A4, i35, nVar5.getMeasuredWidth() + A4, hVar.f36852c.getMeasuredHeight() + i35);
                        int A5 = (int) com.google.android.gms.internal.vision.e2.A(f21, hVar.d.getMeasuredWidth(), 2.0f, f20);
                        int v = org.telegram.messenger.wl.v(16.0f, hVar.d.getMeasuredHeight(), i35);
                        TextView textView10 = hVar.d;
                        textView10.layout(A5, v, textView10.getMeasuredWidth() + A5, hVar.d.getMeasuredHeight() + v);
                        return;
                    } else {
                        int i36 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - hVar.f36850a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.aj0 aj0Var7 = hVar.f36850a;
                        aj0Var7.layout(measuredWidth7, i36, aj0Var7.getMeasuredWidth() + measuredWidth7, hVar.f36850a.getMeasuredHeight() + i36);
                        int C2 = org.telegram.messenger.w1.C(24.0f, hVar.f36850a.getMeasuredHeight(), i36);
                        TextView textView11 = hVar.f36853e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), hVar.f36853e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (hVar.f36853e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView12 = hVar.f36854f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), hVar.f36854f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - hVar.f36852c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - hVar.f36852c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ci.n nVar6 = hVar.f36852c;
                        nVar6.layout(measuredWidth8, measuredHeight5, nVar6.getMeasuredWidth() + measuredWidth8, hVar.f36852c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i14 - hVar.d.getMeasuredWidth()) / 2;
                        int v9 = org.telegram.messenger.wl.v(32.0f, hVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = hVar.d;
                        textView13.layout(measuredWidth9, v9, textView13.getMeasuredWidth() + measuredWidth9, hVar.d.getMeasuredHeight() + v9);
                        return;
                    }
                } else if (i12 > i13) {
                    int measuredHeight6 = (i15 - hVar.f36850a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.aj0 aj0Var8 = hVar.f36850a;
                    aj0Var8.layout(0, measuredHeight6, aj0Var8.getMeasuredWidth(), hVar.f36850a.getMeasuredHeight() + measuredHeight6);
                    float f22 = i14;
                    float f23 = 0.4f * f22;
                    int i37 = (int) f23;
                    float f24 = i15;
                    int i38 = (int) (0.22f * f24);
                    TextView textView14 = hVar.f36853e;
                    textView14.layout(i37, i38, textView14.getMeasuredWidth() + i37, hVar.f36853e.getMeasuredHeight() + i38);
                    int i39 = (int) (0.39f * f24);
                    TextView textView15 = hVar.f36854f;
                    textView15.layout(i37, i39, textView15.getMeasuredWidth() + i37, hVar.f36854f.getMeasuredHeight() + i39);
                    int A6 = (int) com.google.android.gms.internal.vision.e2.A(f22 * 0.6f, hVar.f36852c.getMeasuredWidth(), 2.0f, f23);
                    int i40 = (int) (f24 * 0.69f);
                    ci.n nVar7 = hVar.f36852c;
                    nVar7.layout(A6, i40, nVar7.getMeasuredWidth() + A6, hVar.f36852c.getMeasuredHeight() + i40);
                    return;
                } else {
                    float f25 = i15;
                    int i41 = (int) (0.188f * f25);
                    org.telegram.ui.Components.aj0 aj0Var9 = hVar.f36850a;
                    aj0Var9.layout(0, i41, aj0Var9.getMeasuredWidth(), hVar.f36850a.getMeasuredHeight() + i41);
                    int i42 = (int) (0.651f * f25);
                    TextView textView16 = hVar.f36853e;
                    textView16.layout(0, i42, textView16.getMeasuredWidth(), hVar.f36853e.getMeasuredHeight() + i42);
                    int i43 = (int) (0.731f * f25);
                    TextView textView17 = hVar.f36854f;
                    textView17.layout(0, i43, textView17.getMeasuredWidth(), hVar.f36854f.getMeasuredHeight() + i43);
                    int measuredWidth10 = (i14 - hVar.f36852c.getMeasuredWidth()) / 2;
                    int i44 = (int) (f25 * 0.853f);
                    ci.n nVar8 = hVar.f36852c;
                    nVar8.layout(measuredWidth10, i44, nVar8.getMeasuredWidth() + measuredWidth10, hVar.f36852c.getMeasuredHeight() + i44);
                    return;
                }
            case 1:
                org.telegram.ui.Components.eg0 eg0Var = (org.telegram.ui.Components.eg0) this.f36241b;
                eg0Var.f25710e.layout(0, 0, eg0Var.H, eg0Var.I);
                return;
            case 2:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f36241b;
                if (h1Var.f31548e.getParent() == this) {
                    h1Var.f31548e.layout(0, 0, h1Var.M, h1Var.N);
                    return;
                }
                return;
            case 3:
                hh1 hh1Var = (hh1) this.f36241b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                kVar4.layout(0, 0, i12, kVar5.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 > i13) {
                    int measuredHeight7 = (i46 - hh1Var.f37029a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.aj0 aj0Var10 = hh1Var.f37029a;
                    aj0Var10.layout(0, measuredHeight7, aj0Var10.getMeasuredWidth(), hh1Var.f37029a.getMeasuredHeight() + measuredHeight7);
                    float f26 = i45;
                    float f27 = 0.4f * f26;
                    int i47 = (int) f27;
                    float f28 = i46;
                    int i48 = (int) (0.22f * f28);
                    TextView textView18 = hh1Var.f37033c;
                    textView18.layout(i47, i48, textView18.getMeasuredWidth() + i47, hh1Var.f37033c.getMeasuredHeight() + i48);
                    int i49 = (int) (0.39f * f28);
                    wh.p pVar = hh1Var.d;
                    pVar.layout(i47, i49, pVar.getMeasuredWidth() + i47, hh1Var.d.getMeasuredHeight() + i49);
                    int A7 = (int) com.google.android.gms.internal.vision.e2.A(f26 * 0.6f, hh1Var.f37031b.getMeasuredWidth(), 2.0f, f27);
                    int i50 = (int) (f28 * 0.64f);
                    TextView textView19 = hh1Var.f37031b;
                    textView19.layout(A7, i50, textView19.getMeasuredWidth() + A7, hh1Var.f37031b.getMeasuredHeight() + i50);
                    return;
                }
                int i51 = (int) (i46 * 0.3f);
                int measuredWidth11 = (i45 - hh1Var.f37029a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.aj0 aj0Var11 = hh1Var.f37029a;
                aj0Var11.layout(measuredWidth11, i51, aj0Var11.getMeasuredWidth() + measuredWidth11, hh1Var.f37029a.getMeasuredHeight() + i51);
                int C3 = org.telegram.messenger.w1.C(16.0f, hh1Var.f37029a.getMeasuredHeight(), i51);
                TextView textView20 = hh1Var.f37033c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), hh1Var.f37033c.getMeasuredHeight() + C3);
                int C4 = org.telegram.messenger.w1.C(12.0f, hh1Var.f37033c.getMeasuredHeight(), C3);
                wh.p pVar2 = hh1Var.d;
                pVar2.layout(0, C4, pVar2.getMeasuredWidth(), hh1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i45 - hh1Var.f37031b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i46 - hh1Var.f37031b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                TextView textView21 = hh1Var.f37031b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, hh1Var.f37031b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f36241b;
                org.telegram.ui.ActionBar.v1 v1Var = usersSelectActivity.f34264a;
                v1Var.layout(0, 0, v1Var.getMeasuredWidth(), usersSelectActivity.f34264a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f34264a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f34264a.getMeasuredHeight());
                usersSelectActivity.f34268f.layout(0, usersSelectActivity.f34264a.getMeasuredHeight(), usersSelectActivity.f34268f.getMeasuredWidth(), usersSelectActivity.f34268f.getMeasuredHeight() + usersSelectActivity.f34264a.getMeasuredHeight());
                usersSelectActivity.f34267e.layout(0, usersSelectActivity.f34264a.getMeasuredHeight(), usersSelectActivity.f34268f.getMeasuredWidth(), usersSelectActivity.f34267e.getMeasuredHeight() + usersSelectActivity.f34264a.getMeasuredHeight());
                org.telegram.ui.Components.y10 y10Var = usersSelectActivity.f34270r;
                if (y10Var != null) {
                    if (LocaleController.isRTL) {
                        measuredWidth = usersSelectActivity.f34271s.leftMargin;
                    } else {
                        measuredWidth = ((i12 - i10) - usersSelectActivity.f34271s.rightMargin) - y10Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.f34271s.bottomMargin) - usersSelectActivity.f34270r.getMeasuredHeight();
                    org.telegram.ui.Components.y10 y10Var2 = usersSelectActivity.f34270r;
                    y10Var2.layout(measuredWidth, measuredHeight9, y10Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f34270r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int i12;
        int dp;
        switch (this.f36240a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                h hVar = (h) this.f36241b;
                int i13 = hVar.v;
                kVar = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) hVar).actionBar;
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                }
                if (i13 != 0) {
                    if (i13 != 3) {
                        if (i13 != 5) {
                            if (i13 == 6) {
                                if (i13 == 6) {
                                    hVar.f36850a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                                } else {
                                    hVar.f36850a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i14 = (int) (size * 0.6f);
                                    hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    hVar.f36854f.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    hVar.f36852c.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    hVar.f36854f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i13 == 6) {
                                        hVar.f36852c.measure(org.telegram.messenger.wl.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    } else {
                                        hVar.f36852c.measure(org.telegram.messenger.wl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f7 = size;
                            hVar.f36850a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i15 = (int) (f7 * 0.6f);
                            hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f36852c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            hVar.f36850a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f36852c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else {
                        hVar.f36850a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f10 = size;
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i16 = (int) (f10 * 0.6f);
                            hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f36854f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f36852c.measure(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f36854f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f36852c.measure(org.telegram.messenger.wl.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f11 = size;
                    hVar.f36850a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i17 = (int) (f11 * 0.6f);
                    hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f36854f.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f36852c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    hVar.f36850a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    hVar.f36853e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f36854f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f36852c.measure(org.telegram.messenger.wl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.eg0 eg0Var = (org.telegram.ui.Components.eg0) this.f36241b;
                eg0Var.f25710e.measure(View.MeasureSpec.makeMeasureSpec(eg0Var.H, 1073741824), View.MeasureSpec.makeMeasureSpec(eg0Var.I, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f36241b;
                if (h1Var.f31548e.getParent() == this) {
                    h1Var.f31548e.measure(View.MeasureSpec.makeMeasureSpec(h1Var.M, 1073741824), View.MeasureSpec.makeMeasureSpec(h1Var.N, 1073741824));
                    return;
                }
                return;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                hh1 hh1Var = (hh1) this.f36241b;
                kVar3 = ((org.telegram.ui.ActionBar.n2) hh1Var).actionBar;
                kVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                if (size3 > size4) {
                    float f12 = size3;
                    hh1Var.f37029a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i18 = (int) (f12 * 0.6f);
                    hh1Var.f37033c.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    hh1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    hh1Var.f37036e.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    hh1Var.f37031b.measure(View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                } else {
                    if (hh1Var.O == 7) {
                        i12 = 160;
                    } else {
                        i12 = 140;
                    }
                    float f13 = i12;
                    hh1Var.f37029a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), 1073741824));
                    hh1Var.f37033c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    hh1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    hh1Var.f37036e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    hh1Var.f37031b.measure(org.telegram.messenger.wl.d(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f36241b;
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                if (!AndroidUtilities.isTablet() && size6 <= size5) {
                    dp = AndroidUtilities.dp(56.0f);
                } else {
                    dp = AndroidUtilities.dp(144.0f);
                }
                usersSelectActivity.f34264a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f34264a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f34268f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f34264a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f34267e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f34264a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.y10 y10Var = usersSelectActivity.f34270r;
                if (y10Var != null) {
                    int i19 = usersSelectActivity.f34271s.width;
                    y10Var.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                    return;
                }
                return;
        }
    }
}
