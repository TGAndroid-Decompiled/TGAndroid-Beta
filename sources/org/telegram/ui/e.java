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
public final class e extends ViewGroup {
    public final int f38958a;
    public final Object f38959b;

    public e(Object obj, Context context, int i10) {
        super(context);
        this.f38958a = i10;
        this.f38959b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f38958a) {
            case 1:
                org.telegram.ui.Components.ch0 ch0Var = (org.telegram.ui.Components.ch0) this.f38959b;
                if (!ch0Var.m0) {
                    canvas.save();
                    canvas.scale(ch0Var.H / ch0Var.e.getWidth(), ch0Var.I / ch0Var.e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (!((org.telegram.ui.Components.voip.i1) this.f38959b).f33846a0) {
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
        switch (this.f38958a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38959b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f36325f) {
                    ((ActionBarLayout) UsersSelectActivity.W(usersSelectActivity)).q(canvas, usersSelectActivity.f36322a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredWidth;
        switch (this.f38958a) {
            case 0:
                g gVar = (g) this.f38959b;
                if (g.X(gVar) != null) {
                    g.Z(gVar).layout(0, 0, i12, g.Y(gVar).getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = gVar.v;
                if (i16 != 0) {
                    if (i16 != 3) {
                        if (i16 != 5) {
                            if (i16 == 6) {
                                if (i12 > i13) {
                                    int measuredHeight = (i15 - gVar.f39498a.getMeasuredHeight()) / 2;
                                    float f11 = i14;
                                    int measuredWidth2 = ((int) ((0.5f * f11) - gVar.f39498a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.ak0 ak0Var = gVar.f39498a;
                                    ak0Var.layout(measuredWidth2, measuredHeight, ak0Var.getMeasuredWidth() + measuredWidth2, gVar.f39498a.getMeasuredHeight() + measuredHeight);
                                    float f12 = 0.4f * f11;
                                    int i17 = (int) f12;
                                    float f13 = i15;
                                    int i18 = (int) (0.14f * f13);
                                    TextView textView = gVar.e;
                                    textView.layout(i17, i18, textView.getMeasuredWidth() + i17, gVar.e.getMeasuredHeight() + i18);
                                    int i19 = (int) (0.31f * f13);
                                    TextView textView2 = gVar.f39501f;
                                    textView2.layout(i17, i19, textView2.getMeasuredWidth() + i17, gVar.f39501f.getMeasuredHeight() + i19);
                                    int B = (int) c3.h0.B(f11 * 0.6f, gVar.f39500c.getMeasuredWidth(), 2.0f, f12);
                                    int i20 = (int) (f13 * 0.78f);
                                    ei.n nVar = gVar.f39500c;
                                    nVar.layout(B, i20, nVar.getMeasuredWidth() + B, gVar.f39500c.getMeasuredHeight() + i20);
                                    return;
                                }
                                int i21 = (int) (i15 * 0.3f);
                                int measuredWidth3 = (i14 - gVar.f39498a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.ak0 ak0Var2 = gVar.f39498a;
                                ak0Var2.layout(measuredWidth3, i21, ak0Var2.getMeasuredWidth() + measuredWidth3, gVar.f39498a.getMeasuredHeight() + i21);
                                int D = org.telegram.messenger.t.D(24.0f, gVar.f39498a.getMeasuredHeight(), i21);
                                TextView textView3 = gVar.e;
                                textView3.layout(0, D, textView3.getMeasuredWidth(), gVar.e.getMeasuredHeight() + D);
                                int textSize = (int) (gVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + D);
                                TextView textView4 = gVar.f39501f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), gVar.f39501f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i14 - gVar.f39500c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i15 - gVar.f39500c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                                ei.n nVar2 = gVar.f39500c;
                                nVar2.layout(measuredWidth4, measuredHeight2, nVar2.getMeasuredWidth() + measuredWidth4, gVar.f39500c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i12 > i13) {
                            int measuredHeight3 = (i15 - gVar.f39498a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.ak0 ak0Var3 = gVar.f39498a;
                            ak0Var3.layout(0, measuredHeight3, ak0Var3.getMeasuredWidth(), gVar.f39498a.getMeasuredHeight() + measuredHeight3);
                            float f14 = i14;
                            float f15 = 0.4f * f14;
                            int i22 = (int) f15;
                            float f16 = i15;
                            int i23 = (int) (0.08f * f16);
                            TextView textView5 = gVar.e;
                            textView5.layout(i22, i23, textView5.getMeasuredWidth() + i22, gVar.e.getMeasuredHeight() + i23);
                            float f17 = f14 * 0.6f;
                            int B2 = (int) c3.h0.B(f17, gVar.h.getMeasuredWidth(), 2.0f, f15);
                            int i24 = (int) (0.25f * f16);
                            LinearLayout linearLayout = gVar.h;
                            linearLayout.layout(B2, i24, linearLayout.getMeasuredWidth() + B2, gVar.h.getMeasuredHeight() + i24);
                            int B3 = (int) c3.h0.B(f17, gVar.f39500c.getMeasuredWidth(), 2.0f, f15);
                            int i25 = (int) (f16 * 0.78f);
                            ei.n nVar3 = gVar.f39500c;
                            nVar3.layout(B3, i25, nVar3.getMeasuredWidth() + B3, gVar.f39500c.getMeasuredHeight() + i25);
                            return;
                        } else {
                            if (AndroidUtilities.displaySize.y < 1800) {
                                f7 = i15;
                                int i26 = (int) (0.06f * f7);
                                org.telegram.ui.Components.ak0 ak0Var4 = gVar.f39498a;
                                ak0Var4.layout(0, i26, ak0Var4.getMeasuredWidth(), gVar.f39498a.getMeasuredHeight() + i26);
                                int i27 = (int) (0.463f * f7);
                                TextView textView6 = gVar.e;
                                textView6.layout(0, i27, textView6.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i27);
                                f10 = 0.543f;
                            } else {
                                f7 = i15;
                                int i28 = (int) (0.148f * f7);
                                org.telegram.ui.Components.ak0 ak0Var5 = gVar.f39498a;
                                ak0Var5.layout(0, i28, ak0Var5.getMeasuredWidth(), gVar.f39498a.getMeasuredHeight() + i28);
                                int i29 = (int) (0.551f * f7);
                                TextView textView7 = gVar.e;
                                textView7.layout(0, i29, textView7.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i29);
                                f10 = 0.631f;
                            }
                            int i30 = (int) (f7 * f10);
                            int measuredWidth5 = (getMeasuredWidth() - gVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = gVar.h;
                            linearLayout2.layout(measuredWidth5, i30, linearLayout2.getMeasuredWidth() + measuredWidth5, gVar.h.getMeasuredHeight() + i30);
                            int measuredWidth6 = (i14 - gVar.f39500c.getMeasuredWidth()) / 2;
                            int i31 = (int) (i15 * 0.853f);
                            ei.n nVar4 = gVar.f39500c;
                            nVar4.layout(measuredWidth6, i31, nVar4.getMeasuredWidth() + measuredWidth6, gVar.f39500c.getMeasuredHeight() + i31);
                            return;
                        }
                    } else if (i12 > i13) {
                        float f18 = i15;
                        int measuredHeight4 = ((int) ((0.95f * f18) - gVar.f39498a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - gVar.f39498a.getMeasuredWidth());
                        org.telegram.ui.Components.ak0 ak0Var6 = gVar.f39498a;
                        ak0Var6.layout(width, measuredHeight4, ak0Var6.getMeasuredWidth() + width, gVar.f39498a.getMeasuredHeight() + measuredHeight4);
                        float f19 = i14;
                        float f20 = 0.4f * f19;
                        int i32 = (int) f20;
                        int i33 = (int) (0.12f * f18);
                        TextView textView8 = gVar.e;
                        textView8.layout(i32, i33, textView8.getMeasuredWidth() + i32, gVar.e.getMeasuredHeight() + i33);
                        int i34 = (int) (0.24f * f18);
                        TextView textView9 = gVar.f39501f;
                        textView9.layout(i32, i34, textView9.getMeasuredWidth() + i32, gVar.f39501f.getMeasuredHeight() + i34);
                        float f21 = f19 * 0.6f;
                        int B4 = (int) c3.h0.B(f21, gVar.f39500c.getMeasuredWidth(), 2.0f, f20);
                        int i35 = (int) (f18 * 0.8f);
                        ei.n nVar5 = gVar.f39500c;
                        nVar5.layout(B4, i35, nVar5.getMeasuredWidth() + B4, gVar.f39500c.getMeasuredHeight() + i35);
                        int B5 = (int) c3.h0.B(f21, gVar.d.getMeasuredWidth(), 2.0f, f20);
                        int z11 = org.telegram.messenger.vh.z(16.0f, gVar.d.getMeasuredHeight(), i35);
                        TextView textView10 = gVar.d;
                        textView10.layout(B5, z11, textView10.getMeasuredWidth() + B5, gVar.d.getMeasuredHeight() + z11);
                        return;
                    } else {
                        int i36 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - gVar.f39498a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ak0 ak0Var7 = gVar.f39498a;
                        ak0Var7.layout(measuredWidth7, i36, ak0Var7.getMeasuredWidth() + measuredWidth7, gVar.f39498a.getMeasuredHeight() + i36);
                        int D2 = org.telegram.messenger.t.D(24.0f, gVar.f39498a.getMeasuredHeight(), i36);
                        TextView textView11 = gVar.e;
                        textView11.layout(0, D2, textView11.getMeasuredWidth(), gVar.e.getMeasuredHeight() + D2);
                        int textSize2 = (int) (gVar.e.getTextSize() + AndroidUtilities.dp(16.0f) + D2);
                        TextView textView12 = gVar.f39501f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), gVar.f39501f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - gVar.f39500c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - gVar.f39500c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ei.n nVar6 = gVar.f39500c;
                        nVar6.layout(measuredWidth8, measuredHeight5, nVar6.getMeasuredWidth() + measuredWidth8, gVar.f39500c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i14 - gVar.d.getMeasuredWidth()) / 2;
                        int z12 = org.telegram.messenger.vh.z(32.0f, gVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = gVar.d;
                        textView13.layout(measuredWidth9, z12, textView13.getMeasuredWidth() + measuredWidth9, gVar.d.getMeasuredHeight() + z12);
                        return;
                    }
                } else if (i12 > i13) {
                    int measuredHeight6 = (i15 - gVar.f39498a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.ak0 ak0Var8 = gVar.f39498a;
                    ak0Var8.layout(0, measuredHeight6, ak0Var8.getMeasuredWidth(), gVar.f39498a.getMeasuredHeight() + measuredHeight6);
                    float f22 = i14;
                    float f23 = 0.4f * f22;
                    int i37 = (int) f23;
                    float f24 = i15;
                    int i38 = (int) (0.22f * f24);
                    TextView textView14 = gVar.e;
                    textView14.layout(i37, i38, textView14.getMeasuredWidth() + i37, gVar.e.getMeasuredHeight() + i38);
                    int i39 = (int) (0.39f * f24);
                    TextView textView15 = gVar.f39501f;
                    textView15.layout(i37, i39, textView15.getMeasuredWidth() + i37, gVar.f39501f.getMeasuredHeight() + i39);
                    int B6 = (int) c3.h0.B(f22 * 0.6f, gVar.f39500c.getMeasuredWidth(), 2.0f, f23);
                    int i40 = (int) (f24 * 0.69f);
                    ei.n nVar7 = gVar.f39500c;
                    nVar7.layout(B6, i40, nVar7.getMeasuredWidth() + B6, gVar.f39500c.getMeasuredHeight() + i40);
                    return;
                } else {
                    float f25 = i15;
                    int i41 = (int) (0.188f * f25);
                    org.telegram.ui.Components.ak0 ak0Var9 = gVar.f39498a;
                    ak0Var9.layout(0, i41, ak0Var9.getMeasuredWidth(), gVar.f39498a.getMeasuredHeight() + i41);
                    int i42 = (int) (0.651f * f25);
                    TextView textView16 = gVar.e;
                    textView16.layout(0, i42, textView16.getMeasuredWidth(), gVar.e.getMeasuredHeight() + i42);
                    int i43 = (int) (0.731f * f25);
                    TextView textView17 = gVar.f39501f;
                    textView17.layout(0, i43, textView17.getMeasuredWidth(), gVar.f39501f.getMeasuredHeight() + i43);
                    int measuredWidth10 = (i14 - gVar.f39500c.getMeasuredWidth()) / 2;
                    int i44 = (int) (f25 * 0.853f);
                    ei.n nVar8 = gVar.f39500c;
                    nVar8.layout(measuredWidth10, i44, nVar8.getMeasuredWidth() + measuredWidth10, gVar.f39500c.getMeasuredHeight() + i44);
                    return;
                }
            case 1:
                org.telegram.ui.Components.ch0 ch0Var = (org.telegram.ui.Components.ch0) this.f38959b;
                ch0Var.e.layout(0, 0, ch0Var.H, ch0Var.I);
                return;
            case 2:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f38959b;
                if (i1Var.e.getParent() == this) {
                    i1Var.e.layout(0, 0, i1Var.M, i1Var.N);
                    return;
                }
                return;
            case 3:
                dg1 dg1Var = (dg1) this.f38959b;
                kVar = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                kVar2 = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                kVar.layout(0, 0, i12, kVar2.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 > i13) {
                    int measuredHeight7 = (i46 - dg1Var.f38865a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.ak0 ak0Var10 = dg1Var.f38865a;
                    ak0Var10.layout(0, measuredHeight7, ak0Var10.getMeasuredWidth(), dg1Var.f38865a.getMeasuredHeight() + measuredHeight7);
                    float f26 = i45;
                    float f27 = 0.4f * f26;
                    int i47 = (int) f27;
                    float f28 = i46;
                    int i48 = (int) (0.22f * f28);
                    TextView textView18 = dg1Var.f38869c;
                    textView18.layout(i47, i48, textView18.getMeasuredWidth() + i47, dg1Var.f38869c.getMeasuredHeight() + i48);
                    int i49 = (int) (0.39f * f28);
                    xh.n nVar9 = dg1Var.d;
                    nVar9.layout(i47, i49, nVar9.getMeasuredWidth() + i47, dg1Var.d.getMeasuredHeight() + i49);
                    int B7 = (int) c3.h0.B(f26 * 0.6f, dg1Var.f38867b.getMeasuredWidth(), 2.0f, f27);
                    int i50 = (int) (f28 * 0.64f);
                    TextView textView19 = dg1Var.f38867b;
                    textView19.layout(B7, i50, textView19.getMeasuredWidth() + B7, dg1Var.f38867b.getMeasuredHeight() + i50);
                    return;
                }
                int i51 = (int) (i46 * 0.3f);
                int measuredWidth11 = (i45 - dg1Var.f38865a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ak0 ak0Var11 = dg1Var.f38865a;
                ak0Var11.layout(measuredWidth11, i51, ak0Var11.getMeasuredWidth() + measuredWidth11, dg1Var.f38865a.getMeasuredHeight() + i51);
                int D3 = org.telegram.messenger.t.D(16.0f, dg1Var.f38865a.getMeasuredHeight(), i51);
                TextView textView20 = dg1Var.f38869c;
                textView20.layout(0, D3, textView20.getMeasuredWidth(), dg1Var.f38869c.getMeasuredHeight() + D3);
                int D4 = org.telegram.messenger.t.D(12.0f, dg1Var.f38869c.getMeasuredHeight(), D3);
                xh.n nVar10 = dg1Var.d;
                nVar10.layout(0, D4, nVar10.getMeasuredWidth(), dg1Var.d.getMeasuredHeight() + D4);
                int measuredWidth12 = (i45 - dg1Var.f38867b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i46 - dg1Var.f38867b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                TextView textView21 = dg1Var.f38867b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, dg1Var.f38867b.getMeasuredHeight() + measuredHeight8);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38959b;
                org.telegram.ui.ActionBar.w1 w1Var = usersSelectActivity.f36322a;
                w1Var.layout(0, 0, w1Var.getMeasuredWidth(), usersSelectActivity.f36322a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f36322a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f36322a.getMeasuredHeight());
                usersSelectActivity.f36325f.layout(0, usersSelectActivity.f36322a.getMeasuredHeight(), usersSelectActivity.f36325f.getMeasuredWidth(), usersSelectActivity.f36325f.getMeasuredHeight() + usersSelectActivity.f36322a.getMeasuredHeight());
                usersSelectActivity.e.layout(0, usersSelectActivity.f36322a.getMeasuredHeight(), usersSelectActivity.f36325f.getMeasuredWidth(), usersSelectActivity.e.getMeasuredHeight() + usersSelectActivity.f36322a.getMeasuredHeight());
                org.telegram.ui.Components.j20 j20Var = usersSelectActivity.f36327r;
                if (j20Var != null) {
                    if (LocaleController.isRTL) {
                        measuredWidth = usersSelectActivity.f36328s.leftMargin;
                    } else {
                        measuredWidth = ((i12 - i10) - usersSelectActivity.f36328s.rightMargin) - j20Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.f36328s.bottomMargin) - usersSelectActivity.f36327r.getMeasuredHeight();
                    org.telegram.ui.Components.j20 j20Var2 = usersSelectActivity.f36327r;
                    j20Var2.layout(measuredWidth, measuredHeight9, j20Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f36327r.getMeasuredHeight() + measuredHeight9);
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
        switch (this.f38958a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                g gVar = (g) this.f38959b;
                int i13 = gVar.v;
                if (g.V(gVar) != null) {
                    g.W(gVar).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                }
                if (i13 != 0) {
                    if (i13 != 3) {
                        if (i13 != 5) {
                            if (i13 == 6) {
                                if (i13 == 6) {
                                    gVar.f39498a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                                } else {
                                    gVar.f39498a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i14 = (int) (size * 0.6f);
                                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f39501f.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f39500c.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f39501f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i13 == 6) {
                                        gVar.f39500c.measure(org.telegram.messenger.vh.x(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    } else {
                                        gVar.f39500c.measure(org.telegram.messenger.vh.x(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f7 = size;
                            gVar.f39498a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f7), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i15 = (int) (f7 * 0.6f);
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f39500c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            gVar.f39498a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f39500c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else {
                        gVar.f39498a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f10 = size;
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i16 = (int) (f10 * 0.6f);
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f39501f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f39500c.measure(View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f39501f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f39500c.measure(org.telegram.messenger.vh.x(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f11 = size;
                    gVar.f39498a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i17 = (int) (f11 * 0.6f);
                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f39501f.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f39500c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    gVar.f39498a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    gVar.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f39501f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f39500c.measure(org.telegram.messenger.vh.x(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.ch0 ch0Var = (org.telegram.ui.Components.ch0) this.f38959b;
                ch0Var.e.measure(View.MeasureSpec.makeMeasureSpec(ch0Var.H, 1073741824), View.MeasureSpec.makeMeasureSpec(ch0Var.I, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f38959b;
                if (i1Var.e.getParent() == this) {
                    i1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i1Var.M, 1073741824), View.MeasureSpec.makeMeasureSpec(i1Var.N, 1073741824));
                    return;
                }
                return;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                dg1 dg1Var = (dg1) this.f38959b;
                kVar = ((org.telegram.ui.ActionBar.r2) dg1Var).actionBar;
                kVar.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                if (size3 > size4) {
                    float f12 = size3;
                    dg1Var.f38865a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i18 = (int) (f12 * 0.6f);
                    dg1Var.f38869c.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    dg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    dg1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    dg1Var.f38867b.measure(View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                } else {
                    if (dg1Var.O == 7) {
                        i12 = 160;
                    } else {
                        i12 = 140;
                    }
                    float f13 = i12;
                    dg1Var.f38865a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f13), 1073741824));
                    dg1Var.f38869c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    dg1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    dg1Var.e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    dg1Var.f38867b.measure(org.telegram.messenger.vh.x(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38959b;
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                if (!AndroidUtilities.isTablet() && size6 <= size5) {
                    dp = AndroidUtilities.dp(56.0f);
                } else {
                    dp = AndroidUtilities.dp(144.0f);
                }
                usersSelectActivity.f36322a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36322a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f36325f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36322a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36322a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.j20 j20Var = usersSelectActivity.f36327r;
                if (j20Var != null) {
                    int i19 = usersSelectActivity.f36328s.width;
                    j20Var.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                    return;
                }
                return;
        }
    }
}
