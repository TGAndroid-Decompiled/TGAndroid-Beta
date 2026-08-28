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
    public final int f38058a;
    public final Object f38059b;

    public f(Object obj, Context context, int i9) {
        super(context);
        this.f38058a = i9;
        this.f38059b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f38058a) {
            case 1:
                org.telegram.ui.Components.pf0 pf0Var = (org.telegram.ui.Components.pf0) this.f38059b;
                if (!pf0Var.f31636i0) {
                    canvas.save();
                    canvas.scale(pf0Var.D / pf0Var.f31630e.getWidth(), pf0Var.E / pf0Var.f31630e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (!((org.telegram.ui.Components.voip.g1) this.f38059b).W) {
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
        switch (this.f38058a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38059b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f36289f) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) usersSelectActivity).parentLayout;
                    ((ActionBarLayout) b5Var).q(canvas, usersSelectActivity.f36285a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredWidth;
        switch (this.f38058a) {
            case 0:
                h hVar = (h) this.f38059b;
                if (h.W(hVar) != null) {
                    h.Y(hVar).layout(0, 0, i11, h.X(hVar).getMeasuredHeight());
                }
                int i13 = i11 - i9;
                int i14 = i12 - i10;
                int i15 = hVar.v;
                if (i15 != 0) {
                    if (i15 != 3) {
                        if (i15 != 5) {
                            if (i15 == 6) {
                                if (i11 > i12) {
                                    int measuredHeight = (i14 - hVar.f38623a.getMeasuredHeight()) / 2;
                                    float f12 = i13;
                                    int measuredWidth2 = ((int) ((0.5f * f12) - hVar.f38623a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.pi0 pi0Var = hVar.f38623a;
                                    pi0Var.layout(measuredWidth2, measuredHeight, pi0Var.getMeasuredWidth() + measuredWidth2, hVar.f38623a.getMeasuredHeight() + measuredHeight);
                                    float f13 = 0.4f * f12;
                                    int i16 = (int) f13;
                                    float f14 = i14;
                                    int i17 = (int) (0.14f * f14);
                                    TextView textView = hVar.f38626e;
                                    textView.layout(i16, i17, textView.getMeasuredWidth() + i16, hVar.f38626e.getMeasuredHeight() + i17);
                                    int i18 = (int) (0.31f * f14);
                                    TextView textView2 = hVar.f38627f;
                                    textView2.layout(i16, i18, textView2.getMeasuredWidth() + i16, hVar.f38627f.getMeasuredHeight() + i18);
                                    int A = (int) e2.c.A(f12 * 0.6f, hVar.f38625c.getMeasuredWidth(), 2.0f, f13);
                                    int i19 = (int) (f14 * 0.78f);
                                    bh.e eVar = hVar.f38625c;
                                    eVar.layout(A, i19, eVar.getMeasuredWidth() + A, hVar.f38625c.getMeasuredHeight() + i19);
                                    return;
                                }
                                int i20 = (int) (i14 * 0.3f);
                                int measuredWidth3 = (i13 - hVar.f38623a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.pi0 pi0Var2 = hVar.f38623a;
                                pi0Var2.layout(measuredWidth3, i20, pi0Var2.getMeasuredWidth() + measuredWidth3, hVar.f38623a.getMeasuredHeight() + i20);
                                int C = org.telegram.messenger.l0.C(24.0f, hVar.f38623a.getMeasuredHeight(), i20);
                                TextView textView3 = hVar.f38626e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), hVar.f38626e.getMeasuredHeight() + C);
                                int textSize = (int) (hVar.f38626e.getTextSize() + AndroidUtilities.dp(16.0f) + C);
                                TextView textView4 = hVar.f38627f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), hVar.f38627f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i13 - hVar.f38625c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i14 - hVar.f38625c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                                bh.e eVar2 = hVar.f38625c;
                                eVar2.layout(measuredWidth4, measuredHeight2, eVar2.getMeasuredWidth() + measuredWidth4, hVar.f38625c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i11 > i12) {
                            int measuredHeight3 = (i14 - hVar.f38623a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.pi0 pi0Var3 = hVar.f38623a;
                            pi0Var3.layout(0, measuredHeight3, pi0Var3.getMeasuredWidth(), hVar.f38623a.getMeasuredHeight() + measuredHeight3);
                            float f15 = i13;
                            float f16 = 0.4f * f15;
                            int i21 = (int) f16;
                            float f17 = i14;
                            int i22 = (int) (0.08f * f17);
                            TextView textView5 = hVar.f38626e;
                            textView5.layout(i21, i22, textView5.getMeasuredWidth() + i21, hVar.f38626e.getMeasuredHeight() + i22);
                            float f18 = f15 * 0.6f;
                            int A2 = (int) e2.c.A(f18, hVar.h.getMeasuredWidth(), 2.0f, f16);
                            int i23 = (int) (0.25f * f17);
                            LinearLayout linearLayout = hVar.h;
                            linearLayout.layout(A2, i23, linearLayout.getMeasuredWidth() + A2, hVar.h.getMeasuredHeight() + i23);
                            int A3 = (int) e2.c.A(f18, hVar.f38625c.getMeasuredWidth(), 2.0f, f16);
                            int i24 = (int) (f17 * 0.78f);
                            bh.e eVar3 = hVar.f38625c;
                            eVar3.layout(A3, i24, eVar3.getMeasuredWidth() + A3, hVar.f38625c.getMeasuredHeight() + i24);
                            return;
                        } else {
                            if (AndroidUtilities.displaySize.y < 1800) {
                                f10 = i14;
                                int i25 = (int) (0.06f * f10);
                                org.telegram.ui.Components.pi0 pi0Var4 = hVar.f38623a;
                                pi0Var4.layout(0, i25, pi0Var4.getMeasuredWidth(), hVar.f38623a.getMeasuredHeight() + i25);
                                int i26 = (int) (0.463f * f10);
                                TextView textView6 = hVar.f38626e;
                                textView6.layout(0, i26, textView6.getMeasuredWidth(), hVar.f38626e.getMeasuredHeight() + i26);
                                f11 = 0.543f;
                            } else {
                                f10 = i14;
                                int i27 = (int) (0.148f * f10);
                                org.telegram.ui.Components.pi0 pi0Var5 = hVar.f38623a;
                                pi0Var5.layout(0, i27, pi0Var5.getMeasuredWidth(), hVar.f38623a.getMeasuredHeight() + i27);
                                int i28 = (int) (0.551f * f10);
                                TextView textView7 = hVar.f38626e;
                                textView7.layout(0, i28, textView7.getMeasuredWidth(), hVar.f38626e.getMeasuredHeight() + i28);
                                f11 = 0.631f;
                            }
                            int i29 = (int) (f10 * f11);
                            int measuredWidth5 = (getMeasuredWidth() - hVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = hVar.h;
                            linearLayout2.layout(measuredWidth5, i29, linearLayout2.getMeasuredWidth() + measuredWidth5, hVar.h.getMeasuredHeight() + i29);
                            int measuredWidth6 = (i13 - hVar.f38625c.getMeasuredWidth()) / 2;
                            int i30 = (int) (i14 * 0.853f);
                            bh.e eVar4 = hVar.f38625c;
                            eVar4.layout(measuredWidth6, i30, eVar4.getMeasuredWidth() + measuredWidth6, hVar.f38625c.getMeasuredHeight() + i30);
                            return;
                        }
                    } else if (i11 > i12) {
                        float f19 = i14;
                        int measuredHeight4 = ((int) ((0.95f * f19) - hVar.f38623a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - hVar.f38623a.getMeasuredWidth());
                        org.telegram.ui.Components.pi0 pi0Var6 = hVar.f38623a;
                        pi0Var6.layout(width, measuredHeight4, pi0Var6.getMeasuredWidth() + width, hVar.f38623a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i13;
                        float f21 = 0.4f * f20;
                        int i31 = (int) f21;
                        int i32 = (int) (0.12f * f19);
                        TextView textView8 = hVar.f38626e;
                        textView8.layout(i31, i32, textView8.getMeasuredWidth() + i31, hVar.f38626e.getMeasuredHeight() + i32);
                        int i33 = (int) (0.24f * f19);
                        TextView textView9 = hVar.f38627f;
                        textView9.layout(i31, i33, textView9.getMeasuredWidth() + i31, hVar.f38627f.getMeasuredHeight() + i33);
                        float f22 = f20 * 0.6f;
                        int A4 = (int) e2.c.A(f22, hVar.f38625c.getMeasuredWidth(), 2.0f, f21);
                        int i34 = (int) (f19 * 0.8f);
                        bh.e eVar5 = hVar.f38625c;
                        eVar5.layout(A4, i34, eVar5.getMeasuredWidth() + A4, hVar.f38625c.getMeasuredHeight() + i34);
                        int A5 = (int) e2.c.A(f22, hVar.d.getMeasuredWidth(), 2.0f, f21);
                        int w8 = org.telegram.messenger.ll.w(16.0f, hVar.d.getMeasuredHeight(), i34);
                        TextView textView10 = hVar.d;
                        textView10.layout(A5, w8, textView10.getMeasuredWidth() + A5, hVar.d.getMeasuredHeight() + w8);
                        return;
                    } else {
                        int i35 = (int) (i14 * 0.3f);
                        int measuredWidth7 = (i13 - hVar.f38623a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.pi0 pi0Var7 = hVar.f38623a;
                        pi0Var7.layout(measuredWidth7, i35, pi0Var7.getMeasuredWidth() + measuredWidth7, hVar.f38623a.getMeasuredHeight() + i35);
                        int C2 = org.telegram.messenger.l0.C(24.0f, hVar.f38623a.getMeasuredHeight(), i35);
                        TextView textView11 = hVar.f38626e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), hVar.f38626e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (hVar.f38626e.getTextSize() + AndroidUtilities.dp(16.0f) + C2);
                        TextView textView12 = hVar.f38627f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), hVar.f38627f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i13 - hVar.f38625c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i14 - hVar.f38625c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        bh.e eVar6 = hVar.f38625c;
                        eVar6.layout(measuredWidth8, measuredHeight5, eVar6.getMeasuredWidth() + measuredWidth8, hVar.f38625c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i13 - hVar.d.getMeasuredWidth()) / 2;
                        int w10 = org.telegram.messenger.ll.w(32.0f, hVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = hVar.d;
                        textView13.layout(measuredWidth9, w10, textView13.getMeasuredWidth() + measuredWidth9, hVar.d.getMeasuredHeight() + w10);
                        return;
                    }
                } else if (i11 > i12) {
                    int measuredHeight6 = (i14 - hVar.f38623a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.pi0 pi0Var8 = hVar.f38623a;
                    pi0Var8.layout(0, measuredHeight6, pi0Var8.getMeasuredWidth(), hVar.f38623a.getMeasuredHeight() + measuredHeight6);
                    float f23 = i13;
                    float f24 = 0.4f * f23;
                    int i36 = (int) f24;
                    float f25 = i14;
                    int i37 = (int) (0.22f * f25);
                    TextView textView14 = hVar.f38626e;
                    textView14.layout(i36, i37, textView14.getMeasuredWidth() + i36, hVar.f38626e.getMeasuredHeight() + i37);
                    int i38 = (int) (0.39f * f25);
                    TextView textView15 = hVar.f38627f;
                    textView15.layout(i36, i38, textView15.getMeasuredWidth() + i36, hVar.f38627f.getMeasuredHeight() + i38);
                    int A6 = (int) e2.c.A(f23 * 0.6f, hVar.f38625c.getMeasuredWidth(), 2.0f, f24);
                    int i39 = (int) (f25 * 0.69f);
                    bh.e eVar7 = hVar.f38625c;
                    eVar7.layout(A6, i39, eVar7.getMeasuredWidth() + A6, hVar.f38625c.getMeasuredHeight() + i39);
                    return;
                } else {
                    float f26 = i14;
                    int i40 = (int) (0.188f * f26);
                    org.telegram.ui.Components.pi0 pi0Var9 = hVar.f38623a;
                    pi0Var9.layout(0, i40, pi0Var9.getMeasuredWidth(), hVar.f38623a.getMeasuredHeight() + i40);
                    int i41 = (int) (0.651f * f26);
                    TextView textView16 = hVar.f38626e;
                    textView16.layout(0, i41, textView16.getMeasuredWidth(), hVar.f38626e.getMeasuredHeight() + i41);
                    int i42 = (int) (0.731f * f26);
                    TextView textView17 = hVar.f38627f;
                    textView17.layout(0, i42, textView17.getMeasuredWidth(), hVar.f38627f.getMeasuredHeight() + i42);
                    int measuredWidth10 = (i13 - hVar.f38625c.getMeasuredWidth()) / 2;
                    int i43 = (int) (f26 * 0.853f);
                    bh.e eVar8 = hVar.f38625c;
                    eVar8.layout(measuredWidth10, i43, eVar8.getMeasuredWidth() + measuredWidth10, hVar.f38625c.getMeasuredHeight() + i43);
                    return;
                }
            case 1:
                org.telegram.ui.Components.pf0 pf0Var = (org.telegram.ui.Components.pf0) this.f38059b;
                pf0Var.f31630e.layout(0, 0, pf0Var.D, pf0Var.E);
                return;
            case 2:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f38059b;
                if (g1Var.f33520e.getParent() == this) {
                    g1Var.f33520e.layout(0, 0, g1Var.I, g1Var.J);
                    return;
                }
                return;
            case 3:
                ag1 ag1Var = (ag1) this.f38059b;
                kVar = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar2 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar.layout(0, 0, i11, kVar2.getMeasuredHeight());
                int i44 = i11 - i9;
                int i45 = i12 - i10;
                if (i11 > i12) {
                    int measuredHeight7 = (i45 - ag1Var.f36481a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.pi0 pi0Var10 = ag1Var.f36481a;
                    pi0Var10.layout(0, measuredHeight7, pi0Var10.getMeasuredWidth(), ag1Var.f36481a.getMeasuredHeight() + measuredHeight7);
                    float f27 = i44;
                    float f28 = 0.4f * f27;
                    int i46 = (int) f28;
                    float f29 = i45;
                    int i47 = (int) (0.22f * f29);
                    TextView textView18 = ag1Var.f36485c;
                    textView18.layout(i46, i47, textView18.getMeasuredWidth() + i46, ag1Var.f36485c.getMeasuredHeight() + i47);
                    int i48 = (int) (0.39f * f29);
                    dh.u uVar = ag1Var.d;
                    uVar.layout(i46, i48, uVar.getMeasuredWidth() + i46, ag1Var.d.getMeasuredHeight() + i48);
                    int A7 = (int) e2.c.A(f27 * 0.6f, ag1Var.f36483b.getMeasuredWidth(), 2.0f, f28);
                    int i49 = (int) (f29 * 0.64f);
                    TextView textView19 = ag1Var.f36483b;
                    textView19.layout(A7, i49, textView19.getMeasuredWidth() + A7, ag1Var.f36483b.getMeasuredHeight() + i49);
                    return;
                }
                int i50 = (int) (i45 * 0.3f);
                int measuredWidth11 = (i44 - ag1Var.f36481a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.pi0 pi0Var11 = ag1Var.f36481a;
                pi0Var11.layout(measuredWidth11, i50, pi0Var11.getMeasuredWidth() + measuredWidth11, ag1Var.f36481a.getMeasuredHeight() + i50);
                int C3 = org.telegram.messenger.l0.C(16.0f, ag1Var.f36481a.getMeasuredHeight(), i50);
                TextView textView20 = ag1Var.f36485c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), ag1Var.f36485c.getMeasuredHeight() + C3);
                int C4 = org.telegram.messenger.l0.C(12.0f, ag1Var.f36485c.getMeasuredHeight(), C3);
                dh.u uVar2 = ag1Var.d;
                uVar2.layout(0, C4, uVar2.getMeasuredWidth(), ag1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i44 - ag1Var.f36483b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i45 - ag1Var.f36483b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                TextView textView21 = ag1Var.f36483b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, ag1Var.f36483b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38059b;
                org.telegram.ui.ActionBar.w1 w1Var = usersSelectActivity.f36285a;
                w1Var.layout(0, 0, w1Var.getMeasuredWidth(), usersSelectActivity.f36285a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f36285a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f36285a.getMeasuredHeight());
                usersSelectActivity.f36289f.layout(0, usersSelectActivity.f36285a.getMeasuredHeight(), usersSelectActivity.f36289f.getMeasuredWidth(), usersSelectActivity.f36289f.getMeasuredHeight() + usersSelectActivity.f36285a.getMeasuredHeight());
                usersSelectActivity.f36288e.layout(0, usersSelectActivity.f36285a.getMeasuredHeight(), usersSelectActivity.f36289f.getMeasuredWidth(), usersSelectActivity.f36288e.getMeasuredHeight() + usersSelectActivity.f36285a.getMeasuredHeight());
                org.telegram.ui.Components.j10 j10Var = usersSelectActivity.f36291r;
                if (j10Var != null) {
                    if (LocaleController.isRTL) {
                        measuredWidth = usersSelectActivity.f36292s.leftMargin;
                    } else {
                        measuredWidth = ((i11 - i9) - usersSelectActivity.f36292s.rightMargin) - j10Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i12 - i10) - usersSelectActivity.f36292s.bottomMargin) - usersSelectActivity.f36291r.getMeasuredHeight();
                    org.telegram.ui.Components.j10 j10Var2 = usersSelectActivity.f36291r;
                    j10Var2.layout(measuredWidth, measuredHeight9, j10Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f36291r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        int dp;
        switch (this.f38058a) {
            case 0:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                h hVar = (h) this.f38059b;
                int i12 = hVar.v;
                if (h.U(hVar) != null) {
                    h.V(hVar).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                }
                if (i12 != 0) {
                    if (i12 != 3) {
                        if (i12 != 5) {
                            if (i12 == 6) {
                                if (i12 == 6) {
                                    hVar.f38623a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                                } else {
                                    hVar.f38623a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i13 = (int) (size * 0.6f);
                                    hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    hVar.f38627f.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    hVar.f38625c.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    hVar.f38627f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i12 == 6) {
                                        hVar.f38625c.measure(org.telegram.messenger.ll.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    } else {
                                        hVar.f38625c.measure(org.telegram.messenger.ll.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f10 = size;
                            hVar.f38623a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i14 = (int) (f10 * 0.6f);
                            hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.h.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38625c.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            hVar.f38623a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38625c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else {
                        hVar.f38623a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f11 = size;
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i15 = (int) (f11 * 0.6f);
                            hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38627f.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38625c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38627f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38625c.measure(org.telegram.messenger.ll.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f12 = size;
                    hVar.f38623a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i16 = (int) (f12 * 0.6f);
                    hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38627f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38625c.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    hVar.f38623a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    hVar.f38626e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38627f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38625c.measure(org.telegram.messenger.ll.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.pf0 pf0Var = (org.telegram.ui.Components.pf0) this.f38059b;
                pf0Var.f31630e.measure(View.MeasureSpec.makeMeasureSpec(pf0Var.D, 1073741824), View.MeasureSpec.makeMeasureSpec(pf0Var.E, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f38059b;
                if (g1Var.f33520e.getParent() == this) {
                    g1Var.f33520e.measure(View.MeasureSpec.makeMeasureSpec(g1Var.I, 1073741824), View.MeasureSpec.makeMeasureSpec(g1Var.J, 1073741824));
                    return;
                }
                return;
            case 3:
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                ag1 ag1Var = (ag1) this.f38059b;
                kVar = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                if (size3 > size4) {
                    float f13 = size3;
                    ag1Var.f36481a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i17 = (int) (f13 * 0.6f);
                    ag1Var.f36485c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.f36488e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.f36483b.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                } else {
                    if (ag1Var.K == 7) {
                        i11 = 160;
                    } else {
                        i11 = 140;
                    }
                    float f14 = i11;
                    ag1Var.f36481a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), 1073741824));
                    ag1Var.f36485c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.f36488e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ag1Var.f36483b.measure(org.telegram.messenger.ll.d(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38059b;
                int size5 = View.MeasureSpec.getSize(i9);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                if (!AndroidUtilities.isTablet() && size6 <= size5) {
                    dp = AndroidUtilities.dp(56.0f);
                } else {
                    dp = AndroidUtilities.dp(144.0f);
                }
                usersSelectActivity.f36285a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36285a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f36289f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36285a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f36288e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36285a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.j10 j10Var = usersSelectActivity.f36291r;
                if (j10Var != null) {
                    int i18 = usersSelectActivity.f36292s.width;
                    j10Var.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                    return;
                }
                return;
        }
    }
}
