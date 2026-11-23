package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e extends ViewGroup {
    public final int f47058a;
    public final Object f47059b;

    public e(int i7, Context context, Object obj) {
        super(context);
        this.f47058a = i7;
        this.f47059b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f47058a) {
            case 3:
                canvas.save();
                wi.h hVar = (wi.h) this.f47059b;
                canvas.scale(hVar.f59976x / hVar.f59962i.getWidth(), hVar.f59977y / hVar.f59962i.getHeight());
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f47058a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j3);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f47059b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f43908f) {
                    ((ActionBarLayout) UsersSelectActivity.a0(usersSelectActivity)).q(canvas, usersSelectActivity.f43904a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        int measuredWidth;
        switch (this.f47058a) {
            case 0:
                g gVar = (g) this.f47059b;
                if (g.b0(gVar) != null) {
                    g.d0(gVar).layout(0, 0, i11, g.c0(gVar).getMeasuredHeight());
                }
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                int i15 = gVar.f47842w;
                if (i15 != 0) {
                    if (i15 != 3) {
                        if (i15 != 5) {
                            if (i15 == 6) {
                                if (i11 > i12) {
                                    int measuredHeight = (i14 - gVar.f47834a.getMeasuredHeight()) / 2;
                                    float f12 = i13;
                                    int measuredWidth2 = ((int) ((0.5f * f12) - gVar.f47834a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.rh0 rh0Var = gVar.f47834a;
                                    rh0Var.layout(measuredWidth2, measuredHeight, rh0Var.getMeasuredWidth() + measuredWidth2, gVar.f47834a.getMeasuredHeight() + measuredHeight);
                                    float f13 = 0.4f * f12;
                                    int i16 = (int) f13;
                                    float f14 = i14;
                                    int i17 = (int) (0.14f * f14);
                                    TextView textView = gVar.f47837e;
                                    textView.layout(i16, i17, textView.getMeasuredWidth() + i16, gVar.f47837e.getMeasuredHeight() + i17);
                                    int i18 = (int) (0.31f * f14);
                                    TextView textView2 = gVar.f47838f;
                                    textView2.layout(i16, i18, textView2.getMeasuredWidth() + i16, gVar.f47838f.getMeasuredHeight() + i18);
                                    int A = (int) com.google.android.gms.internal.vision.e2.A(f12 * 0.6f, gVar.f47836c.getMeasuredWidth(), 2.0f, f13);
                                    int i19 = (int) (f14 * 0.78f);
                                    gi.j jVar = gVar.f47836c;
                                    jVar.layout(A, i19, jVar.getMeasuredWidth() + A, gVar.f47836c.getMeasuredHeight() + i19);
                                    return;
                                }
                                int i20 = (int) (i14 * 0.3f);
                                int measuredWidth3 = (i13 - gVar.f47834a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.rh0 rh0Var2 = gVar.f47834a;
                                rh0Var2.layout(measuredWidth3, i20, rh0Var2.getMeasuredWidth() + measuredWidth3, gVar.f47834a.getMeasuredHeight() + i20);
                                int C = org.telegram.messenger.f3.C(24.0f, gVar.f47834a.getMeasuredHeight(), i20);
                                TextView textView3 = gVar.f47837e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), gVar.f47837e.getMeasuredHeight() + C);
                                int textSize = (int) (gVar.f47837e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C);
                                TextView textView4 = gVar.f47838f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), gVar.f47838f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i13 - gVar.f47836c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i14 - gVar.f47836c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                                gi.j jVar2 = gVar.f47836c;
                                jVar2.layout(measuredWidth4, measuredHeight2, jVar2.getMeasuredWidth() + measuredWidth4, gVar.f47836c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i11 > i12) {
                            int measuredHeight3 = (i14 - gVar.f47834a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.rh0 rh0Var3 = gVar.f47834a;
                            rh0Var3.layout(0, measuredHeight3, rh0Var3.getMeasuredWidth(), gVar.f47834a.getMeasuredHeight() + measuredHeight3);
                            float f15 = i13;
                            float f16 = 0.4f * f15;
                            int i21 = (int) f16;
                            float f17 = i14;
                            int i22 = (int) (0.08f * f17);
                            TextView textView5 = gVar.f47837e;
                            textView5.layout(i21, i22, textView5.getMeasuredWidth() + i21, gVar.f47837e.getMeasuredHeight() + i22);
                            float f18 = f15 * 0.6f;
                            int A2 = (int) com.google.android.gms.internal.vision.e2.A(f18, gVar.h.getMeasuredWidth(), 2.0f, f16);
                            int i23 = (int) (0.25f * f17);
                            LinearLayout linearLayout = gVar.h;
                            linearLayout.layout(A2, i23, linearLayout.getMeasuredWidth() + A2, gVar.h.getMeasuredHeight() + i23);
                            int A3 = (int) com.google.android.gms.internal.vision.e2.A(f18, gVar.f47836c.getMeasuredWidth(), 2.0f, f16);
                            int i24 = (int) (f17 * 0.78f);
                            gi.j jVar3 = gVar.f47836c;
                            jVar3.layout(A3, i24, jVar3.getMeasuredWidth() + A3, gVar.f47836c.getMeasuredHeight() + i24);
                            return;
                        } else {
                            if (org.telegram.messenger.g0.f24010q.y < 1800) {
                                f10 = i14;
                                int i25 = (int) (0.06f * f10);
                                org.telegram.ui.Components.rh0 rh0Var4 = gVar.f47834a;
                                rh0Var4.layout(0, i25, rh0Var4.getMeasuredWidth(), gVar.f47834a.getMeasuredHeight() + i25);
                                int i26 = (int) (0.463f * f10);
                                TextView textView6 = gVar.f47837e;
                                textView6.layout(0, i26, textView6.getMeasuredWidth(), gVar.f47837e.getMeasuredHeight() + i26);
                                f11 = 0.543f;
                            } else {
                                f10 = i14;
                                int i27 = (int) (0.148f * f10);
                                org.telegram.ui.Components.rh0 rh0Var5 = gVar.f47834a;
                                rh0Var5.layout(0, i27, rh0Var5.getMeasuredWidth(), gVar.f47834a.getMeasuredHeight() + i27);
                                int i28 = (int) (0.551f * f10);
                                TextView textView7 = gVar.f47837e;
                                textView7.layout(0, i28, textView7.getMeasuredWidth(), gVar.f47837e.getMeasuredHeight() + i28);
                                f11 = 0.631f;
                            }
                            int i29 = (int) (f10 * f11);
                            int measuredWidth5 = (getMeasuredWidth() - gVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = gVar.h;
                            linearLayout2.layout(measuredWidth5, i29, linearLayout2.getMeasuredWidth() + measuredWidth5, gVar.h.getMeasuredHeight() + i29);
                            int measuredWidth6 = (i13 - gVar.f47836c.getMeasuredWidth()) / 2;
                            int i30 = (int) (i14 * 0.853f);
                            gi.j jVar4 = gVar.f47836c;
                            jVar4.layout(measuredWidth6, i30, jVar4.getMeasuredWidth() + measuredWidth6, gVar.f47836c.getMeasuredHeight() + i30);
                            return;
                        }
                    } else if (i11 > i12) {
                        float f19 = i14;
                        int measuredHeight4 = ((int) ((0.95f * f19) - gVar.f47834a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - gVar.f47834a.getMeasuredWidth());
                        org.telegram.ui.Components.rh0 rh0Var6 = gVar.f47834a;
                        rh0Var6.layout(width, measuredHeight4, rh0Var6.getMeasuredWidth() + width, gVar.f47834a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i13;
                        float f21 = 0.4f * f20;
                        int i31 = (int) f21;
                        int i32 = (int) (0.12f * f19);
                        TextView textView8 = gVar.f47837e;
                        textView8.layout(i31, i32, textView8.getMeasuredWidth() + i31, gVar.f47837e.getMeasuredHeight() + i32);
                        int i33 = (int) (0.24f * f19);
                        TextView textView9 = gVar.f47838f;
                        textView9.layout(i31, i33, textView9.getMeasuredWidth() + i31, gVar.f47838f.getMeasuredHeight() + i33);
                        float f22 = f20 * 0.6f;
                        int A4 = (int) com.google.android.gms.internal.vision.e2.A(f22, gVar.f47836c.getMeasuredWidth(), 2.0f, f21);
                        int i34 = (int) (f19 * 0.8f);
                        gi.j jVar5 = gVar.f47836c;
                        jVar5.layout(A4, i34, jVar5.getMeasuredWidth() + A4, gVar.f47836c.getMeasuredHeight() + i34);
                        int A5 = (int) com.google.android.gms.internal.vision.e2.A(f22, gVar.d.getMeasuredWidth(), 2.0f, f21);
                        int x10 = org.telegram.messenger.o10.x(16.0f, gVar.d.getMeasuredHeight(), i34);
                        TextView textView10 = gVar.d;
                        textView10.layout(A5, x10, textView10.getMeasuredWidth() + A5, gVar.d.getMeasuredHeight() + x10);
                        return;
                    } else {
                        int i35 = (int) (i14 * 0.3f);
                        int measuredWidth7 = (i13 - gVar.f47834a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.rh0 rh0Var7 = gVar.f47834a;
                        rh0Var7.layout(measuredWidth7, i35, rh0Var7.getMeasuredWidth() + measuredWidth7, gVar.f47834a.getMeasuredHeight() + i35);
                        int C2 = org.telegram.messenger.f3.C(24.0f, gVar.f47834a.getMeasuredHeight(), i35);
                        TextView textView11 = gVar.f47837e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), gVar.f47837e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (gVar.f47837e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C2);
                        TextView textView12 = gVar.f47838f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), gVar.f47838f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i13 - gVar.f47836c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i14 - gVar.f47836c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                        gi.j jVar6 = gVar.f47836c;
                        jVar6.layout(measuredWidth8, measuredHeight5, jVar6.getMeasuredWidth() + measuredWidth8, gVar.f47836c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i13 - gVar.d.getMeasuredWidth()) / 2;
                        int x11 = org.telegram.messenger.o10.x(32.0f, gVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = gVar.d;
                        textView13.layout(measuredWidth9, x11, textView13.getMeasuredWidth() + measuredWidth9, gVar.d.getMeasuredHeight() + x11);
                        return;
                    }
                } else if (i11 > i12) {
                    int measuredHeight6 = (i14 - gVar.f47834a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.rh0 rh0Var8 = gVar.f47834a;
                    rh0Var8.layout(0, measuredHeight6, rh0Var8.getMeasuredWidth(), gVar.f47834a.getMeasuredHeight() + measuredHeight6);
                    float f23 = i13;
                    float f24 = 0.4f * f23;
                    int i36 = (int) f24;
                    float f25 = i14;
                    int i37 = (int) (0.22f * f25);
                    TextView textView14 = gVar.f47837e;
                    textView14.layout(i36, i37, textView14.getMeasuredWidth() + i36, gVar.f47837e.getMeasuredHeight() + i37);
                    int i38 = (int) (0.39f * f25);
                    TextView textView15 = gVar.f47838f;
                    textView15.layout(i36, i38, textView15.getMeasuredWidth() + i36, gVar.f47838f.getMeasuredHeight() + i38);
                    int A6 = (int) com.google.android.gms.internal.vision.e2.A(f23 * 0.6f, gVar.f47836c.getMeasuredWidth(), 2.0f, f24);
                    int i39 = (int) (f25 * 0.69f);
                    gi.j jVar7 = gVar.f47836c;
                    jVar7.layout(A6, i39, jVar7.getMeasuredWidth() + A6, gVar.f47836c.getMeasuredHeight() + i39);
                    return;
                } else {
                    float f26 = i14;
                    int i40 = (int) (0.188f * f26);
                    org.telegram.ui.Components.rh0 rh0Var9 = gVar.f47834a;
                    rh0Var9.layout(0, i40, rh0Var9.getMeasuredWidth(), gVar.f47834a.getMeasuredHeight() + i40);
                    int i41 = (int) (0.651f * f26);
                    TextView textView16 = gVar.f47837e;
                    textView16.layout(0, i41, textView16.getMeasuredWidth(), gVar.f47837e.getMeasuredHeight() + i41);
                    int i42 = (int) (0.731f * f26);
                    TextView textView17 = gVar.f47838f;
                    textView17.layout(0, i42, textView17.getMeasuredWidth(), gVar.f47838f.getMeasuredHeight() + i42);
                    int measuredWidth10 = (i13 - gVar.f47836c.getMeasuredWidth()) / 2;
                    int i43 = (int) (f26 * 0.853f);
                    gi.j jVar8 = gVar.f47836c;
                    jVar8.layout(measuredWidth10, i43, jVar8.getMeasuredWidth() + measuredWidth10, gVar.f47836c.getMeasuredHeight() + i43);
                    return;
                }
            case 1:
                bb1 bb1Var = (bb1) this.f47059b;
                bb1.p0(bb1Var).layout(0, 0, i11, bb1.o0(bb1Var).getMeasuredHeight());
                int i44 = i11 - i7;
                int i45 = i12 - i10;
                if (i11 > i12) {
                    int measuredHeight7 = (i45 - bb1Var.f45783a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.rh0 rh0Var10 = bb1Var.f45783a;
                    rh0Var10.layout(0, measuredHeight7, rh0Var10.getMeasuredWidth(), bb1Var.f45783a.getMeasuredHeight() + measuredHeight7);
                    float f27 = i44;
                    float f28 = 0.4f * f27;
                    int i46 = (int) f28;
                    float f29 = i45;
                    int i47 = (int) (0.22f * f29);
                    TextView textView18 = bb1Var.f45787c;
                    textView18.layout(i46, i47, textView18.getMeasuredWidth() + i46, bb1Var.f45787c.getMeasuredHeight() + i47);
                    int i48 = (int) (0.39f * f29);
                    xh.l lVar = bb1Var.d;
                    lVar.layout(i46, i48, lVar.getMeasuredWidth() + i46, bb1Var.d.getMeasuredHeight() + i48);
                    int A7 = (int) com.google.android.gms.internal.vision.e2.A(f27 * 0.6f, bb1Var.f45785b.getMeasuredWidth(), 2.0f, f28);
                    int i49 = (int) (f29 * 0.64f);
                    TextView textView19 = bb1Var.f45785b;
                    textView19.layout(A7, i49, textView19.getMeasuredWidth() + A7, bb1Var.f45785b.getMeasuredHeight() + i49);
                    return;
                }
                int i50 = (int) (i45 * 0.3f);
                int measuredWidth11 = (i44 - bb1Var.f45783a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.rh0 rh0Var11 = bb1Var.f45783a;
                rh0Var11.layout(measuredWidth11, i50, rh0Var11.getMeasuredWidth() + measuredWidth11, bb1Var.f45783a.getMeasuredHeight() + i50);
                int C3 = org.telegram.messenger.f3.C(16.0f, bb1Var.f45783a.getMeasuredHeight(), i50);
                TextView textView20 = bb1Var.f45787c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), bb1Var.f45787c.getMeasuredHeight() + C3);
                int C4 = org.telegram.messenger.f3.C(12.0f, bb1Var.f45787c.getMeasuredHeight(), C3);
                xh.l lVar2 = bb1Var.d;
                lVar2.layout(0, C4, lVar2.getMeasuredWidth(), bb1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i44 - bb1Var.f45785b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i45 - bb1Var.f45785b.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                TextView textView21 = bb1Var.f45785b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, bb1Var.f45785b.getMeasuredHeight() + measuredHeight8);
                return;
            case 2:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f47059b;
                org.telegram.ui.ActionBar.l1 l1Var = usersSelectActivity.f43904a;
                l1Var.layout(0, 0, l1Var.getMeasuredWidth(), usersSelectActivity.f43904a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f43904a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f43904a.getMeasuredHeight());
                usersSelectActivity.f43908f.layout(0, usersSelectActivity.f43904a.getMeasuredHeight(), usersSelectActivity.f43908f.getMeasuredWidth(), usersSelectActivity.f43908f.getMeasuredHeight() + usersSelectActivity.f43904a.getMeasuredHeight());
                usersSelectActivity.f43907e.layout(0, usersSelectActivity.f43904a.getMeasuredHeight(), usersSelectActivity.f43908f.getMeasuredWidth(), usersSelectActivity.f43907e.getMeasuredHeight() + usersSelectActivity.f43904a.getMeasuredHeight());
                org.telegram.ui.Components.c10 c10Var = usersSelectActivity.f43910r;
                if (c10Var != null) {
                    if (org.telegram.messenger.hd.f24408a0) {
                        measuredWidth = usersSelectActivity.f43911s.leftMargin;
                    } else {
                        measuredWidth = ((i11 - i7) - usersSelectActivity.f43911s.rightMargin) - c10Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i12 - i10) - usersSelectActivity.f43911s.bottomMargin) - usersSelectActivity.f43910r.getMeasuredHeight();
                    org.telegram.ui.Components.c10 c10Var2 = usersSelectActivity.f43910r;
                    c10Var2.layout(measuredWidth, measuredHeight9, c10Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f43910r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
            default:
                wi.h hVar = (wi.h) this.f47059b;
                hVar.f59962i.layout(0, 0, hVar.f59976x, hVar.f59977y);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        switch (this.f47058a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                g gVar = (g) this.f47059b;
                int i12 = gVar.f47842w;
                if (g.Z(gVar) != null) {
                    g.a0(gVar).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                }
                if (i12 != 0) {
                    if (i12 != 3) {
                        if (i12 != 5) {
                            if (i12 == 6) {
                                if (i12 == 6) {
                                    gVar.f47834a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824));
                                } else {
                                    gVar.f47834a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i13 = (int) (size * 0.6f);
                                    gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f47838f.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f47836c.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                } else {
                                    gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f47838f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i12 == 6) {
                                        gVar.f47836c.measure(org.telegram.messenger.o10.c(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                    } else {
                                        gVar.f47836c.measure(org.telegram.messenger.o10.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f10 = size;
                            gVar.f47834a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i14 = (int) (f10 * 0.6f);
                            gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f47836c.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        } else {
                            gVar.f47834a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f47836c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        }
                    } else {
                        gVar.f47834a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), 1073741824));
                        if (size > size2) {
                            float f11 = size;
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i15 = (int) (f11 * 0.6f);
                            gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f47838f.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f47836c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        } else {
                            gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f47838f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f47836c.measure(org.telegram.messenger.o10.c(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f12 = size;
                    gVar.f47834a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i16 = (int) (f12 * 0.6f);
                    gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f47838f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f47836c.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else {
                    gVar.f47834a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    gVar.f47837e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f47838f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f47836c.measure(org.telegram.messenger.o10.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                bb1 bb1Var = (bb1) this.f47059b;
                bb1.y0(bb1Var).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                if (size3 > size4) {
                    float f13 = size3;
                    bb1Var.f45783a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i17 = (int) (f13 * 0.6f);
                    bb1Var.f45787c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bb1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bb1Var.f45790e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bb1Var.f45785b.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
                } else {
                    if (bb1Var.P == 7) {
                        i11 = 160;
                    } else {
                        i11 = 140;
                    }
                    float f14 = i11;
                    bb1Var.f45783a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), 1073741824));
                    bb1Var.f45787c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bb1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bb1Var.f45790e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    bb1Var.f45785b.measure(org.telegram.messenger.o10.c(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            case 2:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f47059b;
                int size5 = View.MeasureSpec.getSize(i7);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                if (!org.telegram.messenger.g0.Q1() && size6 <= size5) {
                    L = org.telegram.messenger.g0.L(56.0f);
                } else {
                    L = org.telegram.messenger.g0.L(144.0f);
                }
                usersSelectActivity.f43904a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f43904a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f43908f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f43904a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f43907e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f43904a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.c10 c10Var = usersSelectActivity.f43910r;
                if (c10Var != null) {
                    int i18 = usersSelectActivity.f43911s.width;
                    c10Var.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                    return;
                }
                return;
            default:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
                wi.h hVar = (wi.h) this.f47059b;
                hVar.f59962i.measure(View.MeasureSpec.makeMeasureSpec(hVar.f59976x, 1073741824), View.MeasureSpec.makeMeasureSpec(hVar.f59977y, 1073741824));
                return;
        }
    }
}
