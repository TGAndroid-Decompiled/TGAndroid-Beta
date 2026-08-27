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

    public final int f37885a;

    public final Object f37886b;

    public f(Object obj, Context context, int i10) {
        super(context);
        this.f37885a = i10;
        this.f37886b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37885a) {
            case 1:
                org.telegram.ui.Components.sf0 sf0Var = (org.telegram.ui.Components.sf0) this.f37886b;
                if (!sf0Var.f32429i0) {
                    canvas.save();
                    canvas.scale(sf0Var.D / sf0Var.f32423e.getWidth(), sf0Var.E / sf0Var.f32423e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (!((org.telegram.ui.Components.voip.g1) this.f37886b).W) {
                    super.draw(canvas);
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f37885a) {
            case 4:
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37886b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f36292f) {
                    ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) usersSelectActivity).parentLayout).q(canvas, usersSelectActivity.f36288a.getMeasuredHeight());
                }
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        switch (this.f37885a) {
            case 0:
                h hVar = (h) this.f37886b;
                if (((org.telegram.ui.ActionBar.n2) hVar).actionBar != null) {
                    ((org.telegram.ui.ActionBar.n2) hVar).actionBar.layout(0, 0, i12, ((org.telegram.ui.ActionBar.n2) hVar).actionBar.getMeasuredHeight());
                }
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                int i16 = hVar.v;
                if (i16 == 0) {
                    if (i12 <= i13) {
                        float f12 = i15;
                        int i17 = (int) (0.188f * f12);
                        org.telegram.ui.Components.ri0 ri0Var = hVar.f38630a;
                        ri0Var.layout(0, i17, ri0Var.getMeasuredWidth(), hVar.f38630a.getMeasuredHeight() + i17);
                        int i18 = (int) (0.651f * f12);
                        TextView textView = hVar.f38633e;
                        textView.layout(0, i18, textView.getMeasuredWidth(), hVar.f38633e.getMeasuredHeight() + i18);
                        int i19 = (int) (0.731f * f12);
                        TextView textView2 = hVar.f38634f;
                        textView2.layout(0, i19, textView2.getMeasuredWidth(), hVar.f38634f.getMeasuredHeight() + i19);
                        int measuredWidth = (i14 - hVar.f38632c.getMeasuredWidth()) / 2;
                        int i20 = (int) (f12 * 0.853f);
                        ag.e1 e1Var = hVar.f38632c;
                        e1Var.layout(measuredWidth, i20, e1Var.getMeasuredWidth() + measuredWidth, hVar.f38632c.getMeasuredHeight() + i20);
                    } else {
                        int measuredHeight = (i15 - hVar.f38630a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var2 = hVar.f38630a;
                        ri0Var2.layout(0, measuredHeight, ri0Var2.getMeasuredWidth(), hVar.f38630a.getMeasuredHeight() + measuredHeight);
                        float f13 = i14;
                        float f14 = 0.4f * f13;
                        int i21 = (int) f14;
                        float f15 = i15;
                        int i22 = (int) (0.22f * f15);
                        TextView textView3 = hVar.f38633e;
                        textView3.layout(i21, i22, textView3.getMeasuredWidth() + i21, hVar.f38633e.getMeasuredHeight() + i22);
                        int i23 = (int) (0.39f * f15);
                        TextView textView4 = hVar.f38634f;
                        textView4.layout(i21, i23, textView4.getMeasuredWidth() + i21, hVar.f38634f.getMeasuredHeight() + i23);
                        int iA = (int) com.google.android.recaptcha.internal.a.A(f13 * 0.6f, hVar.f38632c.getMeasuredWidth(), 2.0f, f14);
                        int i24 = (int) (f15 * 0.69f);
                        ag.e1 e1Var2 = hVar.f38632c;
                        e1Var2.layout(iA, i24, e1Var2.getMeasuredWidth() + iA, hVar.f38632c.getMeasuredHeight() + i24);
                    }
                    break;
                } else if (i16 == 3) {
                    if (i12 <= i13) {
                        int i25 = (int) (i15 * 0.3f);
                        int measuredWidth2 = (i14 - hVar.f38630a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var3 = hVar.f38630a;
                        ri0Var3.layout(measuredWidth2, i25, ri0Var3.getMeasuredWidth() + measuredWidth2, hVar.f38630a.getMeasuredHeight() + i25);
                        int iC = org.telegram.messenger.y1.C(24.0f, hVar.f38630a.getMeasuredHeight(), i25);
                        TextView textView5 = hVar.f38633e;
                        textView5.layout(0, iC, textView5.getMeasuredWidth(), hVar.f38633e.getMeasuredHeight() + iC);
                        int textSize = (int) (hVar.f38633e.getTextSize() + AndroidUtilities.dp(16.0f) + iC);
                        TextView textView6 = hVar.f38634f;
                        textView6.layout(0, textSize, textView6.getMeasuredWidth(), hVar.f38634f.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i14 - hVar.f38632c.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i15 - hVar.f38632c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ag.e1 e1Var3 = hVar.f38632c;
                        e1Var3.layout(measuredWidth3, measuredHeight2, e1Var3.getMeasuredWidth() + measuredWidth3, hVar.f38632c.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i14 - hVar.d.getMeasuredWidth()) / 2;
                        int iU = org.telegram.messenger.rl.u(32.0f, hVar.d.getMeasuredHeight(), measuredHeight2);
                        TextView textView7 = hVar.d;
                        textView7.layout(measuredWidth4, iU, textView7.getMeasuredWidth() + measuredWidth4, hVar.d.getMeasuredHeight() + iU);
                    } else {
                        float f16 = i15;
                        int measuredHeight3 = ((int) ((0.95f * f16) - hVar.f38630a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - hVar.f38630a.getMeasuredWidth());
                        org.telegram.ui.Components.ri0 ri0Var4 = hVar.f38630a;
                        ri0Var4.layout(width, measuredHeight3, ri0Var4.getMeasuredWidth() + width, hVar.f38630a.getMeasuredHeight() + measuredHeight3);
                        float f17 = i14;
                        float f18 = 0.4f * f17;
                        int i26 = (int) f18;
                        int i27 = (int) (0.12f * f16);
                        TextView textView8 = hVar.f38633e;
                        textView8.layout(i26, i27, textView8.getMeasuredWidth() + i26, hVar.f38633e.getMeasuredHeight() + i27);
                        int i28 = (int) (0.24f * f16);
                        TextView textView9 = hVar.f38634f;
                        textView9.layout(i26, i28, textView9.getMeasuredWidth() + i26, hVar.f38634f.getMeasuredHeight() + i28);
                        float f19 = f17 * 0.6f;
                        int iA2 = (int) com.google.android.recaptcha.internal.a.A(f19, hVar.f38632c.getMeasuredWidth(), 2.0f, f18);
                        int i29 = (int) (f16 * 0.8f);
                        ag.e1 e1Var4 = hVar.f38632c;
                        e1Var4.layout(iA2, i29, e1Var4.getMeasuredWidth() + iA2, hVar.f38632c.getMeasuredHeight() + i29);
                        int iA3 = (int) com.google.android.recaptcha.internal.a.A(f19, hVar.d.getMeasuredWidth(), 2.0f, f18);
                        int iU2 = org.telegram.messenger.rl.u(16.0f, hVar.d.getMeasuredHeight(), i29);
                        TextView textView10 = hVar.d;
                        textView10.layout(iA3, iU2, textView10.getMeasuredWidth() + iA3, hVar.d.getMeasuredHeight() + iU2);
                    }
                    break;
                } else if (i16 == 5) {
                    if (i12 <= i13) {
                        if (AndroidUtilities.displaySize.y < 1800) {
                            f10 = i15;
                            int i30 = (int) (0.06f * f10);
                            org.telegram.ui.Components.ri0 ri0Var5 = hVar.f38630a;
                            ri0Var5.layout(0, i30, ri0Var5.getMeasuredWidth(), hVar.f38630a.getMeasuredHeight() + i30);
                            int i31 = (int) (0.463f * f10);
                            TextView textView11 = hVar.f38633e;
                            textView11.layout(0, i31, textView11.getMeasuredWidth(), hVar.f38633e.getMeasuredHeight() + i31);
                            f11 = 0.543f;
                        } else {
                            f10 = i15;
                            int i32 = (int) (0.148f * f10);
                            org.telegram.ui.Components.ri0 ri0Var6 = hVar.f38630a;
                            ri0Var6.layout(0, i32, ri0Var6.getMeasuredWidth(), hVar.f38630a.getMeasuredHeight() + i32);
                            int i33 = (int) (0.551f * f10);
                            TextView textView12 = hVar.f38633e;
                            textView12.layout(0, i33, textView12.getMeasuredWidth(), hVar.f38633e.getMeasuredHeight() + i33);
                            f11 = 0.631f;
                        }
                        int i34 = (int) (f10 * f11);
                        int measuredWidth5 = (getMeasuredWidth() - hVar.h.getMeasuredWidth()) / 2;
                        LinearLayout linearLayout = hVar.h;
                        linearLayout.layout(measuredWidth5, i34, linearLayout.getMeasuredWidth() + measuredWidth5, hVar.h.getMeasuredHeight() + i34);
                        int measuredWidth6 = (i14 - hVar.f38632c.getMeasuredWidth()) / 2;
                        int i35 = (int) (i15 * 0.853f);
                        ag.e1 e1Var5 = hVar.f38632c;
                        e1Var5.layout(measuredWidth6, i35, e1Var5.getMeasuredWidth() + measuredWidth6, hVar.f38632c.getMeasuredHeight() + i35);
                    } else {
                        int measuredHeight4 = (i15 - hVar.f38630a.getMeasuredHeight()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var7 = hVar.f38630a;
                        ri0Var7.layout(0, measuredHeight4, ri0Var7.getMeasuredWidth(), hVar.f38630a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i14;
                        float f21 = 0.4f * f20;
                        int i36 = (int) f21;
                        float f22 = i15;
                        int i37 = (int) (0.08f * f22);
                        TextView textView13 = hVar.f38633e;
                        textView13.layout(i36, i37, textView13.getMeasuredWidth() + i36, hVar.f38633e.getMeasuredHeight() + i37);
                        float f23 = f20 * 0.6f;
                        int iA4 = (int) com.google.android.recaptcha.internal.a.A(f23, hVar.h.getMeasuredWidth(), 2.0f, f21);
                        int i38 = (int) (0.25f * f22);
                        LinearLayout linearLayout2 = hVar.h;
                        linearLayout2.layout(iA4, i38, linearLayout2.getMeasuredWidth() + iA4, hVar.h.getMeasuredHeight() + i38);
                        int iA5 = (int) com.google.android.recaptcha.internal.a.A(f23, hVar.f38632c.getMeasuredWidth(), 2.0f, f21);
                        int i39 = (int) (f22 * 0.78f);
                        ag.e1 e1Var6 = hVar.f38632c;
                        e1Var6.layout(iA5, i39, e1Var6.getMeasuredWidth() + iA5, hVar.f38632c.getMeasuredHeight() + i39);
                    }
                    break;
                } else if (i16 == 6) {
                    if (i12 <= i13) {
                        int i40 = (int) (i15 * 0.3f);
                        int measuredWidth7 = (i14 - hVar.f38630a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ri0 ri0Var8 = hVar.f38630a;
                        ri0Var8.layout(measuredWidth7, i40, ri0Var8.getMeasuredWidth() + measuredWidth7, hVar.f38630a.getMeasuredHeight() + i40);
                        int iC2 = org.telegram.messenger.y1.C(24.0f, hVar.f38630a.getMeasuredHeight(), i40);
                        TextView textView14 = hVar.f38633e;
                        textView14.layout(0, iC2, textView14.getMeasuredWidth(), hVar.f38633e.getMeasuredHeight() + iC2);
                        int textSize2 = (int) (hVar.f38633e.getTextSize() + AndroidUtilities.dp(16.0f) + iC2);
                        TextView textView15 = hVar.f38634f;
                        textView15.layout(0, textSize2, textView15.getMeasuredWidth(), hVar.f38634f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i14 - hVar.f38632c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i15 - hVar.f38632c.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ag.e1 e1Var7 = hVar.f38632c;
                        e1Var7.layout(measuredWidth8, measuredHeight5, e1Var7.getMeasuredWidth() + measuredWidth8, hVar.f38632c.getMeasuredHeight() + measuredHeight5);
                    } else {
                        int measuredHeight6 = (i15 - hVar.f38630a.getMeasuredHeight()) / 2;
                        float f24 = i14;
                        int measuredWidth9 = ((int) ((0.5f * f24) - hVar.f38630a.getMeasuredWidth())) / 2;
                        org.telegram.ui.Components.ri0 ri0Var9 = hVar.f38630a;
                        ri0Var9.layout(measuredWidth9, measuredHeight6, ri0Var9.getMeasuredWidth() + measuredWidth9, hVar.f38630a.getMeasuredHeight() + measuredHeight6);
                        float f25 = 0.4f * f24;
                        int i41 = (int) f25;
                        float f26 = i15;
                        int i42 = (int) (0.14f * f26);
                        TextView textView16 = hVar.f38633e;
                        textView16.layout(i41, i42, textView16.getMeasuredWidth() + i41, hVar.f38633e.getMeasuredHeight() + i42);
                        int i43 = (int) (0.31f * f26);
                        TextView textView17 = hVar.f38634f;
                        textView17.layout(i41, i43, textView17.getMeasuredWidth() + i41, hVar.f38634f.getMeasuredHeight() + i43);
                        int iA6 = (int) com.google.android.recaptcha.internal.a.A(f24 * 0.6f, hVar.f38632c.getMeasuredWidth(), 2.0f, f25);
                        int i44 = (int) (f26 * 0.78f);
                        ag.e1 e1Var8 = hVar.f38632c;
                        e1Var8.layout(iA6, i44, e1Var8.getMeasuredWidth() + iA6, hVar.f38632c.getMeasuredHeight() + i44);
                    }
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.sf0 sf0Var = (org.telegram.ui.Components.sf0) this.f37886b;
                sf0Var.f32423e.layout(0, 0, sf0Var.D, sf0Var.E);
                break;
            case 2:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f37886b;
                if (g1Var.f33570e.getParent() == this) {
                    g1Var.f33570e.layout(0, 0, g1Var.I, g1Var.J);
                }
                break;
            case 3:
                zf1 zf1Var = (zf1) this.f37886b;
                ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.layout(0, 0, i12, ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.getMeasuredHeight());
                int i45 = i12 - i10;
                int i46 = i13 - i11;
                if (i12 <= i13) {
                    int i47 = (int) (i46 * 0.3f);
                    int measuredWidth10 = (i45 - zf1Var.f45161a.getMeasuredWidth()) / 2;
                    org.telegram.ui.Components.ri0 ri0Var10 = zf1Var.f45161a;
                    ri0Var10.layout(measuredWidth10, i47, ri0Var10.getMeasuredWidth() + measuredWidth10, zf1Var.f45161a.getMeasuredHeight() + i47);
                    int iC3 = org.telegram.messenger.y1.C(16.0f, zf1Var.f45161a.getMeasuredHeight(), i47);
                    TextView textView18 = zf1Var.f45165c;
                    textView18.layout(0, iC3, textView18.getMeasuredWidth(), zf1Var.f45165c.getMeasuredHeight() + iC3);
                    int iC4 = org.telegram.messenger.y1.C(12.0f, zf1Var.f45165c.getMeasuredHeight(), iC3);
                    eh.s sVar = zf1Var.d;
                    sVar.layout(0, iC4, sVar.getMeasuredWidth(), zf1Var.d.getMeasuredHeight() + iC4);
                    int measuredWidth11 = (i45 - zf1Var.f45163b.getMeasuredWidth()) / 2;
                    int measuredHeight7 = (i46 - zf1Var.f45163b.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    TextView textView19 = zf1Var.f45163b;
                    textView19.layout(measuredWidth11, measuredHeight7, textView19.getMeasuredWidth() + measuredWidth11, zf1Var.f45163b.getMeasuredHeight() + measuredHeight7);
                } else {
                    int measuredHeight8 = (i46 - zf1Var.f45161a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.ri0 ri0Var11 = zf1Var.f45161a;
                    ri0Var11.layout(0, measuredHeight8, ri0Var11.getMeasuredWidth(), zf1Var.f45161a.getMeasuredHeight() + measuredHeight8);
                    float f27 = i45;
                    float f28 = 0.4f * f27;
                    int i48 = (int) f28;
                    float f29 = i46;
                    int i49 = (int) (0.22f * f29);
                    TextView textView20 = zf1Var.f45165c;
                    textView20.layout(i48, i49, textView20.getMeasuredWidth() + i48, zf1Var.f45165c.getMeasuredHeight() + i49);
                    int i50 = (int) (0.39f * f29);
                    eh.s sVar2 = zf1Var.d;
                    sVar2.layout(i48, i50, sVar2.getMeasuredWidth() + i48, zf1Var.d.getMeasuredHeight() + i50);
                    int iA7 = (int) com.google.android.recaptcha.internal.a.A(f27 * 0.6f, zf1Var.f45163b.getMeasuredWidth(), 2.0f, f28);
                    int i51 = (int) (f29 * 0.64f);
                    TextView textView21 = zf1Var.f45163b;
                    textView21.layout(iA7, i51, textView21.getMeasuredWidth() + iA7, zf1Var.f45163b.getMeasuredHeight() + i51);
                }
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37886b;
                org.telegram.ui.ActionBar.v1 v1Var = usersSelectActivity.f36288a;
                v1Var.layout(0, 0, v1Var.getMeasuredWidth(), usersSelectActivity.f36288a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f36288a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f36288a.getMeasuredHeight());
                usersSelectActivity.f36292f.layout(0, usersSelectActivity.f36288a.getMeasuredHeight(), usersSelectActivity.f36292f.getMeasuredWidth(), usersSelectActivity.f36292f.getMeasuredHeight() + usersSelectActivity.f36288a.getMeasuredHeight());
                usersSelectActivity.f36291e.layout(0, usersSelectActivity.f36288a.getMeasuredHeight(), usersSelectActivity.f36292f.getMeasuredWidth(), usersSelectActivity.f36291e.getMeasuredHeight() + usersSelectActivity.f36288a.getMeasuredHeight());
                org.telegram.ui.Components.m10 m10Var = usersSelectActivity.f36294r;
                if (m10Var != null) {
                    int measuredWidth12 = LocaleController.isRTL ? usersSelectActivity.f36295s.leftMargin : ((i12 - i10) - usersSelectActivity.f36295s.rightMargin) - m10Var.getMeasuredWidth();
                    int measuredHeight9 = ((i13 - i11) - usersSelectActivity.f36295s.bottomMargin) - usersSelectActivity.f36294r.getMeasuredHeight();
                    org.telegram.ui.Components.m10 m10Var2 = usersSelectActivity.f36294r;
                    m10Var2.layout(measuredWidth12, measuredHeight9, m10Var2.getMeasuredWidth() + measuredWidth12, usersSelectActivity.f36294r.getMeasuredHeight() + measuredHeight9);
                }
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f37885a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                h hVar = (h) this.f37886b;
                int i12 = hVar.v;
                if (((org.telegram.ui.ActionBar.n2) hVar).actionBar != null) {
                    ((org.telegram.ui.ActionBar.n2) hVar).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                }
                if (i12 != 0) {
                    if (i12 == 3) {
                        hVar.f38630a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f10 = size;
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i13 = (int) (f10 * 0.6f);
                            hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38634f.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38632c.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38634f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            hVar.f38632c.measure(org.telegram.messenger.rl.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else if (i12 != 5) {
                        if (i12 == 6) {
                            if (i12 == 6) {
                                hVar.f38630a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                            } else {
                                hVar.f38630a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                            }
                            if (size > size2) {
                                int i14 = (int) (size * 0.6f);
                                hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.f38634f.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.f38632c.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                            } else {
                                hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                hVar.f38634f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (i12 == 6) {
                                    hVar.f38632c.measure(org.telegram.messenger.rl.d(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    hVar.f38632c.measure(org.telegram.messenger.rl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                }
                            }
                        }
                    } else if (size > size2) {
                        float f11 = size;
                        hVar.f38630a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                        int i15 = (int) (f11 * 0.6f);
                        hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.h.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.f38632c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        hVar.f38630a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                        hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        hVar.f38632c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    }
                } else if (size > size2) {
                    float f12 = size;
                    hVar.f38630a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i16 = (int) (f12 * 0.6f);
                    hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38634f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38632c.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    hVar.f38630a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    hVar.f38633e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38634f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    hVar.f38632c.measure(org.telegram.messenger.rl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                break;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.sf0 sf0Var = (org.telegram.ui.Components.sf0) this.f37886b;
                sf0Var.f32423e.measure(View.MeasureSpec.makeMeasureSpec(sf0Var.D, 1073741824), View.MeasureSpec.makeMeasureSpec(sf0Var.E, 1073741824));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f37886b;
                if (g1Var.f33570e.getParent() == this) {
                    g1Var.f33570e.measure(View.MeasureSpec.makeMeasureSpec(g1Var.I, 1073741824), View.MeasureSpec.makeMeasureSpec(g1Var.J, 1073741824));
                }
                break;
            case 3:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                zf1 zf1Var = (zf1) this.f37886b;
                ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                if (size3 > size4) {
                    float f13 = size3;
                    zf1Var.f45161a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i17 = (int) (f13 * 0.6f);
                    zf1Var.f45165c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.f45168e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.f45163b.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                } else {
                    float f14 = zf1Var.K == 7 ? 160 : 140;
                    zf1Var.f45161a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f14), 1073741824));
                    zf1Var.f45165c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.f45168e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    zf1Var.f45163b.measure(org.telegram.messenger.rl.d(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37886b;
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                usersSelectActivity.f36288a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec((AndroidUtilities.isTablet() || size6 > size5) ? AndroidUtilities.dp(144.0f) : AndroidUtilities.dp(56.0f), Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36288a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f36292f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36288a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f36291e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f36288a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.m10 m10Var = usersSelectActivity.f36294r;
                if (m10Var != null) {
                    int i18 = usersSelectActivity.f36295s.width;
                    m10Var.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                }
                break;
        }
    }
}
