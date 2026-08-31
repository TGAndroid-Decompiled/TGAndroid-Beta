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
    public final int f37040a;
    public final Object f37041b;

    public g(Object obj, Context context, int i10) {
        super(context);
        this.f37040a = i10;
        this.f37041b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37040a) {
            case 1:
                org.telegram.ui.Components.ng0 ng0Var = (org.telegram.ui.Components.ng0) this.f37041b;
                if (!ng0Var.f29499j0) {
                    canvas.save();
                    canvas.scale(ng0Var.E / ng0Var.f29492e.getWidth(), ng0Var.F / ng0Var.f29492e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (!((org.telegram.ui.Components.voip.h1) this.f37041b).X) {
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
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.f37040a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37041b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f34934f) {
                    f5Var = ((org.telegram.ui.ActionBar.p2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) f5Var).q(canvas, usersSelectActivity.f34930a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredWidth;
        switch (this.f37040a) {
            case 0:
                i iVar = (i) this.f37041b;
                if (i.X(iVar) != null) {
                    i.Z(iVar).layout(0, 0, i12, i.Y(iVar).getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = iVar.v;
                if (i16 != 0) {
                    if (i16 != 3) {
                        if (i16 != 5) {
                            if (i16 == 6) {
                                if (i12 > i13) {
                                    int measuredHeight = (i15 - iVar.f37701a.getMeasuredHeight()) / 2;
                                    float f12 = i14;
                                    int measuredWidth2 = ((int) ((0.5f * f12) - iVar.f37701a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.lj0 lj0Var = iVar.f37701a;
                                    lj0Var.layout(measuredWidth2, measuredHeight, lj0Var.getMeasuredWidth() + measuredWidth2, iVar.f37701a.getMeasuredHeight() + measuredHeight);
                                    float f13 = 0.4f * f12;
                                    int i17 = (int) f13;
                                    float f14 = i15;
                                    int i18 = (int) (0.14f * f14);
                                    TextView textView = iVar.f37704e;
                                    textView.layout(i17, i18, textView.getMeasuredWidth() + i17, iVar.f37704e.getMeasuredHeight() + i18);
                                    int i19 = (int) (0.31f * f14);
                                    TextView textView2 = iVar.f37705f;
                                    textView2.layout(i17, i19, textView2.getMeasuredWidth() + i17, iVar.f37705f.getMeasuredHeight() + i19);
                                    int x10 = (int) e2.c.x(f12 * 0.6f, iVar.f37703c.getMeasuredWidth(), 2.0f, f13);
                                    int i20 = (int) (f14 * 0.78f);
                                    fg.s0 s0Var = iVar.f37703c;
                                    s0Var.layout(x10, i20, s0Var.getMeasuredWidth() + x10, iVar.f37703c.getMeasuredHeight() + i20);
                                    return;
                                }
                                int i21 = (int) (i15 * 0.3f);
                                int measuredWidth3 = (i14 - iVar.f37701a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.lj0 lj0Var2 = iVar.f37701a;
                                lj0Var2.layout(measuredWidth3, i21, lj0Var2.getMeasuredWidth() + measuredWidth3, iVar.f37701a.getMeasuredHeight() + i21);
                                int C = org.telegram.messenger.y3.C(24.0f, iVar.f37701a.getMeasuredHeight(), i21);
                                TextView textView3 = iVar.f37704e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), iVar.f37704e.getMeasuredHeight() + C);
                                int textSize = (int) (iVar.f37704e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                                TextView textView4 = iVar.f37705f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), iVar.f37705f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i14 - iVar.f37703c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i15 - iVar.f37703c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                                fg.s0 s0Var2 = iVar.f37703c;
                                s0Var2.layout(measuredWidth4, measuredHeight2, s0Var2.getMeasuredWidth() + measuredWidth4, iVar.f37703c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i12 > i13) {
                            int measuredHeight3 = (i15 - iVar.f37701a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.lj0 lj0Var3 = iVar.f37701a;
                            lj0Var3.layout(0, measuredHeight3, lj0Var3.getMeasuredWidth(), iVar.f37701a.getMeasuredHeight() + measuredHeight3);
                            float f15 = i14;
                            float f16 = 0.4f * f15;
                            int i22 = (int) f16;
                            float f17 = i15;
                            int i23 = (int) (0.08f * f17);
                            TextView textView5 = iVar.f37704e;
                            textView5.layout(i22, i23, textView5.getMeasuredWidth() + i22, iVar.f37704e.getMeasuredHeight() + i23);
                            float f18 = f15 * 0.6f;
                            int x11 = (int) e2.c.x(f18, iVar.h.getMeasuredWidth(), 2.0f, f16);
                            int i24 = (int) (0.25f * f17);
                            LinearLayout linearLayout = iVar.h;
                            linearLayout.layout(x11, i24, linearLayout.getMeasuredWidth() + x11, iVar.h.getMeasuredHeight() + i24);
                            int x12 = (int) e2.c.x(f18, iVar.f37703c.getMeasuredWidth(), 2.0f, f16);
                            int i25 = (int) (f17 * 0.78f);
                            fg.s0 s0Var3 = iVar.f37703c;
                            s0Var3.layout(x12, i25, s0Var3.getMeasuredWidth() + x12, iVar.f37703c.getMeasuredHeight() + i25);
                            return;
                        } else {
                            if (AndroidUtilities.displaySize.y < 1800) {
                                f10 = i15;
                                int i26 = (int) (0.06f * f10);
                                org.telegram.ui.Components.lj0 lj0Var4 = iVar.f37701a;
                                lj0Var4.layout(0, i26, lj0Var4.getMeasuredWidth(), iVar.f37701a.getMeasuredHeight() + i26);
                                int i27 = (int) (0.463f * f10);
                                TextView textView6 = iVar.f37704e;
                                textView6.layout(0, i27, textView6.getMeasuredWidth(), iVar.f37704e.getMeasuredHeight() + i27);
                                f11 = 0.543f;
                            } else {
                                f10 = i15;
                                int i28 = (int) (0.148f * f10);
                                org.telegram.ui.Components.lj0 lj0Var5 = iVar.f37701a;
                                lj0Var5.layout(0, i28, lj0Var5.getMeasuredWidth(), iVar.f37701a.getMeasuredHeight() + i28);
                                int i29 = (int) (0.551f * f10);
                                TextView textView7 = iVar.f37704e;
                                textView7.layout(0, i29, textView7.getMeasuredWidth(), iVar.f37704e.getMeasuredHeight() + i29);
                                f11 = 0.631f;
                            }
                            int i30 = (int) (f10 * f11);
                            int measuredWidth5 = (getMeasuredWidth() - iVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = iVar.h;
                            linearLayout2.layout(measuredWidth5, i30, linearLayout2.getMeasuredWidth() + measuredWidth5, iVar.h.getMeasuredHeight() + i30);
                            int measuredWidth6 = (i14 - iVar.f37703c.getMeasuredWidth()) / 2;
                            int i31 = (int) (i15 * 0.853f);
                            fg.s0 s0Var4 = iVar.f37703c;
                            s0Var4.layout(measuredWidth6, i31, s0Var4.getMeasuredWidth() + measuredWidth6, iVar.f37703c.getMeasuredHeight() + i31);
                            return;
                        }
                    } else if (i12 > i13) {
                        float f19 = i15;
                        int measuredHeight4 = ((int) ((0.95f * f19) - iVar.f37701a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - iVar.f37701a.getMeasuredWidth());
                        org.telegram.ui.Components.lj0 lj0Var6 = iVar.f37701a;
                        lj0Var6.layout(width, measuredHeight4, lj0Var6.getMeasuredWidth() + width, iVar.f37701a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i14;
                        float f21 = 0.4f * f20;
                        int i32 = (int) f21;
                        int i33 = (int) (0.12f * f19);
                        TextView textView8 = iVar.f37704e;
                        textView8.layout(i32, i33, textView8.getMeasuredWidth() + i32, iVar.f37704e.getMeasuredHeight() + i33);
                        int i34 = (int) (0.24f * f19);
                        TextView textView9 = iVar.f37705f;
                        textView9.layout(i32, i34, textView9.getMeasuredWidth() + i32, iVar.f37705f.getMeasuredHeight() + i34);
                        float f22 = f20 * 0.6f;
                        int x13 = (int) e2.c.x(f22, iVar.f37703c.getMeasuredWidth(), 2.0f, f21);
                        int i35 = (int) (f19 * 0.8f);
                        fg.s0 s0Var5 = iVar.f37703c;
                        s0Var5.layout(x13, i35, s0Var5.getMeasuredWidth() + x13, iVar.f37703c.getMeasuredHeight() + i35);
                        int x14 = (int) e2.c.x(f22, iVar.d.getMeasuredWidth(), 2.0f, f21);
                        int t6 = b.t(16.0f, iVar.d.getMeasuredHeight(), i35);
                        TextView textView10 = iVar.d;
                        textView10.layout(x14, t6, textView10.getMeasuredWidth() + x14, iVar.d.getMeasuredHeight() + t6);
                        return;
                    } else {
                        int i36 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - iVar.f37701a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.lj0 lj0Var7 = iVar.f37701a;
                        lj0Var7.layout(measuredWidth7, i36, lj0Var7.getMeasuredWidth() + measuredWidth7, iVar.f37701a.getMeasuredHeight() + i36);
                        int C2 = org.telegram.messenger.y3.C(24.0f, iVar.f37701a.getMeasuredHeight(), i36);
                        TextView textView11 = iVar.f37704e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), iVar.f37704e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (iVar.f37704e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView12 = iVar.f37705f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), iVar.f37705f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - iVar.f37703c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - iVar.f37703c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        fg.s0 s0Var6 = iVar.f37703c;
                        s0Var6.layout(measuredWidth8, measuredHeight5, s0Var6.getMeasuredWidth() + measuredWidth8, iVar.f37703c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i14 - iVar.d.getMeasuredWidth()) / 2;
                        int t9 = b.t(32.0f, iVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = iVar.d;
                        textView13.layout(measuredWidth9, t9, textView13.getMeasuredWidth() + measuredWidth9, iVar.d.getMeasuredHeight() + t9);
                        return;
                    }
                } else if (i12 > i13) {
                    int measuredHeight6 = (i15 - iVar.f37701a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.lj0 lj0Var8 = iVar.f37701a;
                    lj0Var8.layout(0, measuredHeight6, lj0Var8.getMeasuredWidth(), iVar.f37701a.getMeasuredHeight() + measuredHeight6);
                    float f23 = i14;
                    float f24 = 0.4f * f23;
                    int i37 = (int) f24;
                    float f25 = i15;
                    int i38 = (int) (0.22f * f25);
                    TextView textView14 = iVar.f37704e;
                    textView14.layout(i37, i38, textView14.getMeasuredWidth() + i37, iVar.f37704e.getMeasuredHeight() + i38);
                    int i39 = (int) (0.39f * f25);
                    TextView textView15 = iVar.f37705f;
                    textView15.layout(i37, i39, textView15.getMeasuredWidth() + i37, iVar.f37705f.getMeasuredHeight() + i39);
                    int x15 = (int) e2.c.x(f23 * 0.6f, iVar.f37703c.getMeasuredWidth(), 2.0f, f24);
                    int i40 = (int) (f25 * 0.69f);
                    fg.s0 s0Var7 = iVar.f37703c;
                    s0Var7.layout(x15, i40, s0Var7.getMeasuredWidth() + x15, iVar.f37703c.getMeasuredHeight() + i40);
                    return;
                } else {
                    float f26 = i15;
                    int i41 = (int) (0.188f * f26);
                    org.telegram.ui.Components.lj0 lj0Var9 = iVar.f37701a;
                    lj0Var9.layout(0, i41, lj0Var9.getMeasuredWidth(), iVar.f37701a.getMeasuredHeight() + i41);
                    int i42 = (int) (0.651f * f26);
                    TextView textView16 = iVar.f37704e;
                    textView16.layout(0, i42, textView16.getMeasuredWidth(), iVar.f37704e.getMeasuredHeight() + i42);
                    int i43 = (int) (0.731f * f26);
                    TextView textView17 = iVar.f37705f;
                    textView17.layout(0, i43, textView17.getMeasuredWidth(), iVar.f37705f.getMeasuredHeight() + i43);
                    int measuredWidth10 = (i14 - iVar.f37703c.getMeasuredWidth()) / 2;
                    int i44 = (int) (f26 * 0.853f);
                    fg.s0 s0Var8 = iVar.f37703c;
                    s0Var8.layout(measuredWidth10, i44, s0Var8.getMeasuredWidth() + measuredWidth10, iVar.f37703c.getMeasuredHeight() + i44);
                    return;
                }
            case 1:
                org.telegram.ui.Components.ng0 ng0Var = (org.telegram.ui.Components.ng0) this.f37041b;
                ng0Var.f29492e.layout(0, 0, ng0Var.E, ng0Var.F);
                return;
            case 2:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f37041b;
                if (h1Var.f32070e.getParent() == this) {
                    h1Var.f32070e.layout(0, 0, h1Var.J, h1Var.K);
                    return;
                }
                return;
            case 3:
                qg1 qg1Var = (qg1) this.f37041b;
                kVar = ((org.telegram.ui.ActionBar.p2) qg1Var).actionBar;
                kVar2 = ((org.telegram.ui.ActionBar.p2) qg1Var).actionBar;
                kVar.layout(0, 0, i12, kVar2.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 > i13) {
                    int measuredHeight7 = (i46 - qg1Var.f40480a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.lj0 lj0Var10 = qg1Var.f40480a;
                    lj0Var10.layout(0, measuredHeight7, lj0Var10.getMeasuredWidth(), qg1Var.f40480a.getMeasuredHeight() + measuredHeight7);
                    float f27 = i45;
                    float f28 = 0.4f * f27;
                    int i47 = (int) f28;
                    float f29 = i46;
                    int i48 = (int) (0.22f * f29);
                    TextView textView18 = qg1Var.f40484c;
                    textView18.layout(i47, i48, textView18.getMeasuredWidth() + i47, qg1Var.f40484c.getMeasuredHeight() + i48);
                    int i49 = (int) (0.39f * f29);
                    jh.s sVar = qg1Var.d;
                    sVar.layout(i47, i49, sVar.getMeasuredWidth() + i47, qg1Var.d.getMeasuredHeight() + i49);
                    int x16 = (int) e2.c.x(f27 * 0.6f, qg1Var.f40482b.getMeasuredWidth(), 2.0f, f28);
                    int i50 = (int) (f29 * 0.64f);
                    TextView textView19 = qg1Var.f40482b;
                    textView19.layout(x16, i50, textView19.getMeasuredWidth() + x16, qg1Var.f40482b.getMeasuredHeight() + i50);
                    return;
                }
                int i51 = (int) (i46 * 0.3f);
                int measuredWidth11 = (i45 - qg1Var.f40480a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.lj0 lj0Var11 = qg1Var.f40480a;
                lj0Var11.layout(measuredWidth11, i51, lj0Var11.getMeasuredWidth() + measuredWidth11, qg1Var.f40480a.getMeasuredHeight() + i51);
                int C3 = org.telegram.messenger.y3.C(16.0f, qg1Var.f40480a.getMeasuredHeight(), i51);
                TextView textView20 = qg1Var.f40484c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), qg1Var.f40484c.getMeasuredHeight() + C3);
                int C4 = org.telegram.messenger.y3.C(12.0f, qg1Var.f40484c.getMeasuredHeight(), C3);
                jh.s sVar2 = qg1Var.d;
                sVar2.layout(0, C4, sVar2.getMeasuredWidth(), qg1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i45 - qg1Var.f40482b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i46 - qg1Var.f40482b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                TextView textView21 = qg1Var.f40482b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, qg1Var.f40482b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37041b;
                org.telegram.ui.ActionBar.x1 x1Var = usersSelectActivity.f34930a;
                x1Var.layout(0, 0, x1Var.getMeasuredWidth(), usersSelectActivity.f34930a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f34930a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f34930a.getMeasuredHeight());
                usersSelectActivity.f34934f.layout(0, usersSelectActivity.f34930a.getMeasuredHeight(), usersSelectActivity.f34934f.getMeasuredWidth(), usersSelectActivity.f34934f.getMeasuredHeight() + usersSelectActivity.f34930a.getMeasuredHeight());
                usersSelectActivity.f34933e.layout(0, usersSelectActivity.f34930a.getMeasuredHeight(), usersSelectActivity.f34934f.getMeasuredWidth(), usersSelectActivity.f34933e.getMeasuredHeight() + usersSelectActivity.f34930a.getMeasuredHeight());
                org.telegram.ui.Components.a20 a20Var = usersSelectActivity.f34936r;
                if (a20Var != null) {
                    if (LocaleController.isRTL) {
                        measuredWidth = usersSelectActivity.f34937s.leftMargin;
                    } else {
                        measuredWidth = ((i12 - i10) - usersSelectActivity.f34937s.rightMargin) - a20Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.f34937s.bottomMargin) - usersSelectActivity.f34936r.getMeasuredHeight();
                    org.telegram.ui.Components.a20 a20Var2 = usersSelectActivity.f34936r;
                    a20Var2.layout(measuredWidth, measuredHeight9, a20Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f34936r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        int i12;
        int dp;
        switch (this.f37040a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                i iVar = (i) this.f37041b;
                int i13 = iVar.v;
                if (i.V(iVar) != null) {
                    i.W(iVar).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                }
                if (i13 != 0) {
                    if (i13 != 3) {
                        if (i13 != 5) {
                            if (i13 == 6) {
                                if (i13 == 6) {
                                    iVar.f37701a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                                } else {
                                    iVar.f37701a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i14 = (int) (size * 0.6f);
                                    iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    iVar.f37705f.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    iVar.f37703c.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    iVar.f37705f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i13 == 6) {
                                        iVar.f37703c.measure(b.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    } else {
                                        iVar.f37703c.measure(b.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f10 = size;
                            iVar.f37701a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i15 = (int) (f10 * 0.6f);
                            iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f37703c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            iVar.f37701a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f37703c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else {
                        iVar.f37701a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f11 = size;
                            iVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i16 = (int) (f11 * 0.6f);
                            iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f37705f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f37703c.measure(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f37705f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            iVar.f37703c.measure(b.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f12 = size;
                    iVar.f37701a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i17 = (int) (f12 * 0.6f);
                    iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f37705f.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f37703c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    iVar.f37701a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    iVar.f37704e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f37705f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    iVar.f37703c.measure(b.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.ng0 ng0Var = (org.telegram.ui.Components.ng0) this.f37041b;
                ng0Var.f29492e.measure(View.MeasureSpec.makeMeasureSpec(ng0Var.E, 1073741824), View.MeasureSpec.makeMeasureSpec(ng0Var.F, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f37041b;
                if (h1Var.f32070e.getParent() == this) {
                    h1Var.f32070e.measure(View.MeasureSpec.makeMeasureSpec(h1Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(h1Var.K, 1073741824));
                    return;
                }
                return;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                qg1 qg1Var = (qg1) this.f37041b;
                kVar = ((org.telegram.ui.ActionBar.p2) qg1Var).actionBar;
                kVar.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                if (size3 > size4) {
                    float f13 = size3;
                    qg1Var.f40480a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i18 = (int) (f13 * 0.6f);
                    qg1Var.f40484c.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    qg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    qg1Var.f40487e.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    qg1Var.f40482b.measure(View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                } else {
                    if (qg1Var.L == 7) {
                        i12 = 160;
                    } else {
                        i12 = 140;
                    }
                    float f14 = i12;
                    qg1Var.f40480a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), 1073741824));
                    qg1Var.f40484c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    qg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    qg1Var.f40487e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    qg1Var.f40482b.measure(b.d(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37041b;
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                if (!AndroidUtilities.isTablet() && size6 <= size5) {
                    dp = AndroidUtilities.dp(56.0f);
                } else {
                    dp = AndroidUtilities.dp(144.0f);
                }
                usersSelectActivity.f34930a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f34930a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f34934f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f34930a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f34933e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f34930a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.a20 a20Var = usersSelectActivity.f34936r;
                if (a20Var != null) {
                    int i19 = usersSelectActivity.f34937s.width;
                    a20Var.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                    return;
                }
                return;
        }
    }
}
