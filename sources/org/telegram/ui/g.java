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
public final class g extends ViewGroup {
    public final int f38397a;
    public final Object f38398b;

    public g(Object obj, Context context, int i10) {
        super(context);
        this.f38397a = i10;
        this.f38398b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f38397a) {
            case 1:
                org.telegram.ui.Components.bg0 bg0Var = (org.telegram.ui.Components.bg0) this.f38398b;
                if (!bg0Var.f27090i0) {
                    canvas.save();
                    canvas.scale(bg0Var.D / bg0Var.f27084e.getWidth(), bg0Var.E / bg0Var.f27084e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (!((org.telegram.ui.Components.voip.h1) this.f38398b).W) {
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.f38397a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38398b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f36354f) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) b5Var).q(canvas, usersSelectActivity.f36350a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        float f9;
        float f10;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int measuredWidth;
        switch (this.f38397a) {
            case 0:
                i iVar = (i) this.f38398b;
                lVar = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                    lVar3 = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                    lVar2.layout(0, 0, i12, lVar3.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = iVar.v;
                if (i16 != 0) {
                    if (i16 != 3) {
                        if (i16 != 5) {
                            if (i16 == 6) {
                                if (i12 > i13) {
                                    int measuredHeight = (i15 - iVar.f39077a.getMeasuredHeight()) / 2;
                                    float f11 = i14;
                                    int measuredWidth2 = ((int) ((0.5f * f11) - iVar.f39077a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.aj0 aj0Var = iVar.f39077a;
                                    aj0Var.layout(measuredWidth2, measuredHeight, aj0Var.getMeasuredWidth() + measuredWidth2, iVar.f39077a.getMeasuredHeight() + measuredHeight);
                                    float f12 = 0.4f * f11;
                                    int i17 = (int) f12;
                                    float f13 = i15;
                                    int i18 = (int) (0.14f * f13);
                                    TextView textView = iVar.f39080e;
                                    textView.layout(i17, i18, textView.getMeasuredWidth() + i17, iVar.f39080e.getMeasuredHeight() + i18);
                                    int i19 = (int) (0.31f * f13);
                                    TextView textView2 = iVar.f39081f;
                                    textView2.layout(i17, i19, textView2.getMeasuredWidth() + i17, iVar.f39081f.getMeasuredHeight() + i19);
                                    int A = (int) com.google.android.recaptcha.internal.a.A(f11 * 0.6f, iVar.f39079c.getMeasuredWidth(), 2.0f, f12);
                                    int i20 = (int) (f13 * 0.78f);
                                    cg.s0 s0Var = iVar.f39079c;
                                    s0Var.layout(A, i20, s0Var.getMeasuredWidth() + A, iVar.f39079c.getMeasuredHeight() + i20);
                                    return;
                                }
                                int i21 = (int) (i15 * 0.3f);
                                int measuredWidth3 = (i14 - iVar.f39077a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.aj0 aj0Var2 = iVar.f39077a;
                                aj0Var2.layout(measuredWidth3, i21, aj0Var2.getMeasuredWidth() + measuredWidth3, iVar.f39077a.getMeasuredHeight() + i21);
                                int C = org.telegram.messenger.x3.C(24.0f, iVar.f39077a.getMeasuredHeight(), i21);
                                TextView textView3 = iVar.f39080e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), iVar.f39080e.getMeasuredHeight() + C);
                                int textSize = (int) (iVar.f39080e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                                TextView textView4 = iVar.f39081f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), iVar.f39081f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i14 - iVar.f39079c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i15 - iVar.f39079c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                                cg.s0 s0Var2 = iVar.f39079c;
                                s0Var2.layout(measuredWidth4, measuredHeight2, s0Var2.getMeasuredWidth() + measuredWidth4, iVar.f39079c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i12 > i13) {
                            int measuredHeight3 = (i15 - iVar.f39077a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.aj0 aj0Var3 = iVar.f39077a;
                            aj0Var3.layout(0, measuredHeight3, aj0Var3.getMeasuredWidth(), iVar.f39077a.getMeasuredHeight() + measuredHeight3);
                            float f14 = i14;
                            float f15 = 0.4f * f14;
                            int i22 = (int) f15;
                            float f16 = i15;
                            int i23 = (int) (0.08f * f16);
                            TextView textView5 = iVar.f39080e;
                            textView5.layout(i22, i23, textView5.getMeasuredWidth() + i22, iVar.f39080e.getMeasuredHeight() + i23);
                            float f17 = f14 * 0.6f;
                            int A2 = (int) com.google.android.recaptcha.internal.a.A(f17, iVar.h.getMeasuredWidth(), 2.0f, f15);
                            int i24 = (int) (0.25f * f16);
                            LinearLayout linearLayout = iVar.h;
                            linearLayout.layout(A2, i24, linearLayout.getMeasuredWidth() + A2, iVar.h.getMeasuredHeight() + i24);
                            int A3 = (int) com.google.android.recaptcha.internal.a.A(f17, iVar.f39079c.getMeasuredWidth(), 2.0f, f15);
                            int i25 = (int) (f16 * 0.78f);
                            cg.s0 s0Var3 = iVar.f39079c;
                            s0Var3.layout(A3, i25, s0Var3.getMeasuredWidth() + A3, iVar.f39079c.getMeasuredHeight() + i25);
                            return;
                        } else {
                            if (AndroidUtilities.displaySize.y < 1800) {
                                f9 = i15;
                                int i26 = (int) (0.06f * f9);
                                org.telegram.ui.Components.aj0 aj0Var4 = iVar.f39077a;
                                aj0Var4.layout(0, i26, aj0Var4.getMeasuredWidth(), iVar.f39077a.getMeasuredHeight() + i26);
                                int i27 = (int) (0.463f * f9);
                                TextView textView6 = iVar.f39080e;
                                textView6.layout(0, i27, textView6.getMeasuredWidth(), iVar.f39080e.getMeasuredHeight() + i27);
                                f10 = 0.543f;
                            } else {
                                f9 = i15;
                                int i28 = (int) (0.148f * f9);
                                org.telegram.ui.Components.aj0 aj0Var5 = iVar.f39077a;
                                aj0Var5.layout(0, i28, aj0Var5.getMeasuredWidth(), iVar.f39077a.getMeasuredHeight() + i28);
                                int i29 = (int) (0.551f * f9);
                                TextView textView7 = iVar.f39080e;
                                textView7.layout(0, i29, textView7.getMeasuredWidth(), iVar.f39080e.getMeasuredHeight() + i29);
                                f10 = 0.631f;
                            }
                            int i30 = (int) (f9 * f10);
                            int measuredWidth5 = (getMeasuredWidth() - iVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = iVar.h;
                            linearLayout2.layout(measuredWidth5, i30, linearLayout2.getMeasuredWidth() + measuredWidth5, iVar.h.getMeasuredHeight() + i30);
                            int measuredWidth6 = (i14 - iVar.f39079c.getMeasuredWidth()) / 2;
                            int i31 = (int) (i15 * 0.853f);
                            cg.s0 s0Var4 = iVar.f39079c;
                            s0Var4.layout(measuredWidth6, i31, s0Var4.getMeasuredWidth() + measuredWidth6, iVar.f39079c.getMeasuredHeight() + i31);
                            return;
                        }
                    } else if (i12 > i13) {
                        float f18 = i15;
                        int measuredHeight4 = ((int) ((0.95f * f18) - iVar.f39077a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - iVar.f39077a.getMeasuredWidth());
                        org.telegram.ui.Components.aj0 aj0Var6 = iVar.f39077a;
                        aj0Var6.layout(width, measuredHeight4, aj0Var6.getMeasuredWidth() + width, iVar.f39077a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i14;
                        float f20 = 0.4f * f19;
                        int i32 = (int) f20;
                        int i33 = (int) (0.12f * f18);
                        TextView textView8 = iVar.f39080e;
                        textView8.layout(i32, i33, textView8.getMeasuredWidth() + i32, iVar.f39080e.getMeasuredHeight() + i33);
                        int i34 = (int) (0.24f * f18);
                        TextView textView9 = iVar.f39081f;
                        textView9.layout(i32, i34, textView9.getMeasuredWidth() + i32, iVar.f39081f.getMeasuredHeight() + i34);
                        float f21 = f19 * 0.6f;
                        int A4 = (int) com.google.android.recaptcha.internal.a.A(f21, iVar.f39079c.getMeasuredWidth(), 2.0f, f20);
                        int i35 = (int) (f18 * 0.8f);
                        cg.s0 s0Var5 = iVar.f39079c;
                        s0Var5.layout(A4, i35, s0Var5.getMeasuredWidth() + A4, iVar.f39079c.getMeasuredHeight() + i35);
                        int A5 = (int) com.google.android.recaptcha.internal.a.A(f21, iVar.d.getMeasuredWidth(), 2.0f, f20);
                        int u10 = b.u(16.0f, iVar.d.getMeasuredHeight(), i35);
                        TextView textView10 = iVar.d;
                        textView10.layout(A5, u10, textView10.getMeasuredWidth() + A5, iVar.d.getMeasuredHeight() + u10);
                        return;
                    } else {
                        int i36 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - iVar.f39077a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.aj0 aj0Var7 = iVar.f39077a;
                        aj0Var7.layout(measuredWidth7, i36, aj0Var7.getMeasuredWidth() + measuredWidth7, iVar.f39077a.getMeasuredHeight() + i36);
                        int C2 = org.telegram.messenger.x3.C(24.0f, iVar.f39077a.getMeasuredHeight(), i36);
                        TextView textView11 = iVar.f39080e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), iVar.f39080e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (iVar.f39080e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView12 = iVar.f39081f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), iVar.f39081f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - iVar.f39079c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - iVar.f39079c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        cg.s0 s0Var6 = iVar.f39079c;
                        s0Var6.layout(measuredWidth8, measuredHeight5, s0Var6.getMeasuredWidth() + measuredWidth8, iVar.f39079c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i14 - iVar.d.getMeasuredWidth()) / 2;
                        int u11 = b.u(32.0f, iVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = iVar.d;
                        textView13.layout(measuredWidth9, u11, textView13.getMeasuredWidth() + measuredWidth9, iVar.d.getMeasuredHeight() + u11);
                        return;
                    }
                } else if (i12 > i13) {
                    int measuredHeight6 = (i15 - iVar.f39077a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.aj0 aj0Var8 = iVar.f39077a;
                    aj0Var8.layout(0, measuredHeight6, aj0Var8.getMeasuredWidth(), iVar.f39077a.getMeasuredHeight() + measuredHeight6);
                    float f22 = i14;
                    float f23 = 0.4f * f22;
                    int i37 = (int) f23;
                    float f24 = i15;
                    int i38 = (int) (0.22f * f24);
                    TextView textView14 = iVar.f39080e;
                    textView14.layout(i37, i38, textView14.getMeasuredWidth() + i37, iVar.f39080e.getMeasuredHeight() + i38);
                    int i39 = (int) (0.39f * f24);
                    TextView textView15 = iVar.f39081f;
                    textView15.layout(i37, i39, textView15.getMeasuredWidth() + i37, iVar.f39081f.getMeasuredHeight() + i39);
                    int A6 = (int) com.google.android.recaptcha.internal.a.A(f22 * 0.6f, iVar.f39079c.getMeasuredWidth(), 2.0f, f23);
                    int i40 = (int) (f24 * 0.69f);
                    cg.s0 s0Var7 = iVar.f39079c;
                    s0Var7.layout(A6, i40, s0Var7.getMeasuredWidth() + A6, iVar.f39079c.getMeasuredHeight() + i40);
                    return;
                } else {
                    float f25 = i15;
                    int i41 = (int) (0.188f * f25);
                    org.telegram.ui.Components.aj0 aj0Var9 = iVar.f39077a;
                    aj0Var9.layout(0, i41, aj0Var9.getMeasuredWidth(), iVar.f39077a.getMeasuredHeight() + i41);
                    int i42 = (int) (0.651f * f25);
                    TextView textView16 = iVar.f39080e;
                    textView16.layout(0, i42, textView16.getMeasuredWidth(), iVar.f39080e.getMeasuredHeight() + i42);
                    int i43 = (int) (0.731f * f25);
                    TextView textView17 = iVar.f39081f;
                    textView17.layout(0, i43, textView17.getMeasuredWidth(), iVar.f39081f.getMeasuredHeight() + i43);
                    int measuredWidth10 = (i14 - iVar.f39079c.getMeasuredWidth()) / 2;
                    int i44 = (int) (f25 * 0.853f);
                    cg.s0 s0Var8 = iVar.f39079c;
                    s0Var8.layout(measuredWidth10, i44, s0Var8.getMeasuredWidth() + measuredWidth10, iVar.f39079c.getMeasuredHeight() + i44);
                    return;
                }
            case 1:
                org.telegram.ui.Components.bg0 bg0Var = (org.telegram.ui.Components.bg0) this.f38398b;
                bg0Var.f27084e.layout(0, 0, bg0Var.D, bg0Var.E);
                return;
            case 2:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f38398b;
                if (h1Var.f33734e.getParent() == this) {
                    h1Var.f33734e.layout(0, 0, h1Var.I, h1Var.J);
                    return;
                }
                return;
            case 3:
                cg1 cg1Var = (cg1) this.f38398b;
                lVar4 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar4.layout(0, 0, i12, lVar5.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 > i13) {
                    int measuredHeight7 = (i46 - cg1Var.f37104a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.aj0 aj0Var10 = cg1Var.f37104a;
                    aj0Var10.layout(0, measuredHeight7, aj0Var10.getMeasuredWidth(), cg1Var.f37104a.getMeasuredHeight() + measuredHeight7);
                    float f26 = i45;
                    float f27 = 0.4f * f26;
                    int i47 = (int) f27;
                    float f28 = i46;
                    int i48 = (int) (0.22f * f28);
                    TextView textView18 = cg1Var.f37108c;
                    textView18.layout(i47, i48, textView18.getMeasuredWidth() + i47, cg1Var.f37108c.getMeasuredHeight() + i48);
                    int i49 = (int) (0.39f * f28);
                    gh.s sVar = cg1Var.d;
                    sVar.layout(i47, i49, sVar.getMeasuredWidth() + i47, cg1Var.d.getMeasuredHeight() + i49);
                    int A7 = (int) com.google.android.recaptcha.internal.a.A(f26 * 0.6f, cg1Var.f37106b.getMeasuredWidth(), 2.0f, f27);
                    int i50 = (int) (f28 * 0.64f);
                    TextView textView19 = cg1Var.f37106b;
                    textView19.layout(A7, i50, textView19.getMeasuredWidth() + A7, cg1Var.f37106b.getMeasuredHeight() + i50);
                    return;
                }
                int i51 = (int) (i46 * 0.3f);
                int measuredWidth11 = (i45 - cg1Var.f37104a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.aj0 aj0Var11 = cg1Var.f37104a;
                aj0Var11.layout(measuredWidth11, i51, aj0Var11.getMeasuredWidth() + measuredWidth11, cg1Var.f37104a.getMeasuredHeight() + i51);
                int C3 = org.telegram.messenger.x3.C(16.0f, cg1Var.f37104a.getMeasuredHeight(), i51);
                TextView textView20 = cg1Var.f37108c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), cg1Var.f37108c.getMeasuredHeight() + C3);
                int C4 = org.telegram.messenger.x3.C(12.0f, cg1Var.f37108c.getMeasuredHeight(), C3);
                gh.s sVar2 = cg1Var.d;
                sVar2.layout(0, C4, sVar2.getMeasuredWidth(), cg1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i45 - cg1Var.f37106b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i46 - cg1Var.f37106b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                TextView textView21 = cg1Var.f37106b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, cg1Var.f37106b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38398b;
                org.telegram.ui.ActionBar.w1 w1Var = usersSelectActivity.f36350a;
                w1Var.layout(0, 0, w1Var.getMeasuredWidth(), usersSelectActivity.f36350a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f36350a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f36350a.getMeasuredHeight());
                usersSelectActivity.f36354f.layout(0, usersSelectActivity.f36350a.getMeasuredHeight(), usersSelectActivity.f36354f.getMeasuredWidth(), usersSelectActivity.f36354f.getMeasuredHeight() + usersSelectActivity.f36350a.getMeasuredHeight());
                usersSelectActivity.f36353e.layout(0, usersSelectActivity.f36350a.getMeasuredHeight(), usersSelectActivity.f36354f.getMeasuredWidth(), usersSelectActivity.f36353e.getMeasuredHeight() + usersSelectActivity.f36350a.getMeasuredHeight());
                org.telegram.ui.Components.u10 u10Var = usersSelectActivity.f36356r;
                if (u10Var != null) {
                    if (LocaleController.isRTL) {
                        measuredWidth = usersSelectActivity.f36357s.leftMargin;
                    } else {
                        measuredWidth = ((i12 - i10) - usersSelectActivity.f36357s.rightMargin) - u10Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.f36357s.bottomMargin) - usersSelectActivity.f36356r.getMeasuredHeight();
                    org.telegram.ui.Components.u10 u10Var2 = usersSelectActivity.f36356r;
                    u10Var2.layout(measuredWidth, measuredHeight9, u10Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f36356r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int i12;
        int dp;
        switch (this.f38397a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                i iVar = (i) this.f38398b;
                int i13 = iVar.v;
                lVar = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) iVar).actionBar;
                    lVar2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                }
                if (i13 != 0) {
                    if (i13 != 3) {
                        if (i13 != 5) {
                            if (i13 == 6) {
                                if (i13 == 6) {
                                    iVar.f39077a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                                } else {
                                    iVar.f39077a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i14 = (int) (size * 0.6f);
                                    iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    iVar.f39081f.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    iVar.f39079c.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    iVar.f39081f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i13 == 6) {
                                        iVar.f39079c.measure(b.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    } else {
                                        iVar.f39079c.measure(b.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f9 = size;
                            iVar.f39077a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f9), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i15 = (int) (f9 * 0.6f);
                            iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f39079c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            iVar.f39077a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f39079c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else {
                        iVar.f39077a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f10 = size;
                            iVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i16 = (int) (f10 * 0.6f);
                            iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f39081f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f39079c.measure(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f39081f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f39079c.measure(b.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f11 = size;
                    iVar.f39077a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i17 = (int) (f11 * 0.6f);
                    iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f39081f.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f39079c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    iVar.f39077a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    iVar.f39080e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f39081f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f39079c.measure(b.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.bg0 bg0Var = (org.telegram.ui.Components.bg0) this.f38398b;
                bg0Var.f27084e.measure(View.MeasureSpec.makeMeasureSpec(bg0Var.D, 1073741824), View.MeasureSpec.makeMeasureSpec(bg0Var.E, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f38398b;
                if (h1Var.f33734e.getParent() == this) {
                    h1Var.f33734e.measure(View.MeasureSpec.makeMeasureSpec(h1Var.I, 1073741824), View.MeasureSpec.makeMeasureSpec(h1Var.J, 1073741824));
                    return;
                }
                return;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                cg1 cg1Var = (cg1) this.f38398b;
                lVar3 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar3.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                if (size3 > size4) {
                    float f12 = size3;
                    cg1Var.f37104a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i18 = (int) (f12 * 0.6f);
                    cg1Var.f37108c.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.f37111e.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.f37106b.measure(View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                } else {
                    if (cg1Var.K == 7) {
                        i12 = 160;
                    } else {
                        i12 = 140;
                    }
                    float f13 = i12;
                    cg1Var.f37104a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), 1073741824));
                    cg1Var.f37108c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.f37111e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    cg1Var.f37106b.measure(b.d(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38398b;
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                if (!AndroidUtilities.isTablet() && size6 <= size5) {
                    dp = AndroidUtilities.dp(56.0f);
                } else {
                    dp = AndroidUtilities.dp(144.0f);
                }
                usersSelectActivity.f36350a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36350a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f36354f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36350a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f36353e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36350a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.u10 u10Var = usersSelectActivity.f36356r;
                if (u10Var != null) {
                    int i19 = usersSelectActivity.f36357s.width;
                    u10Var.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                    return;
                }
                return;
        }
    }
}
