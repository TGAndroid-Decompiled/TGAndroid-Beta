package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e extends ViewGroup {
    public final int f45161a;
    public final Object f45162b;

    public e(int i7, Context context, Object obj) {
        super(context);
        this.f45161a = i7;
        this.f45162b = obj;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f45161a) {
            case 3:
                canvas.save();
                ti.i iVar = (ti.i) this.f45162b;
                canvas.scale(iVar.f56102x / iVar.f56088i.getWidth(), iVar.f56103y / iVar.f56088i.getHeight());
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
        switch (this.f45161a) {
            case 2:
                boolean drawChild = super.drawChild(canvas, view, j3);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f45162b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f42078f) {
                    ((ActionBarLayout) UsersSelectActivity.a0(usersSelectActivity)).q(canvas, usersSelectActivity.f42074a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        int measuredWidth;
        switch (this.f45161a) {
            case 0:
                g gVar = (g) this.f45162b;
                if (g.b0(gVar) != null) {
                    g.d0(gVar).layout(0, 0, i11, g.c0(gVar).getMeasuredHeight());
                }
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                int i15 = gVar.f45738w;
                if (i15 != 0) {
                    if (i15 != 3) {
                        if (i15 != 5) {
                            if (i15 == 6) {
                                if (i11 > i12) {
                                    int measuredHeight = (i14 - gVar.f45730a.getMeasuredHeight()) / 2;
                                    float f12 = i13;
                                    int measuredWidth2 = ((int) ((0.5f * f12) - gVar.f45730a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.ch0 ch0Var = gVar.f45730a;
                                    ch0Var.layout(measuredWidth2, measuredHeight, ch0Var.getMeasuredWidth() + measuredWidth2, gVar.f45730a.getMeasuredHeight() + measuredHeight);
                                    float f13 = 0.4f * f12;
                                    int i16 = (int) f13;
                                    float f14 = i14;
                                    int i17 = (int) (0.14f * f14);
                                    TextView textView = gVar.f45733e;
                                    textView.layout(i16, i17, textView.getMeasuredWidth() + i16, gVar.f45733e.getMeasuredHeight() + i17);
                                    int i18 = (int) (0.31f * f14);
                                    TextView textView2 = gVar.f45734f;
                                    textView2.layout(i16, i18, textView2.getMeasuredWidth() + i16, gVar.f45734f.getMeasuredHeight() + i18);
                                    int A = (int) com.google.android.recaptcha.internal.a.A(f12 * 0.6f, gVar.f45732c.getMeasuredWidth(), 2.0f, f13);
                                    int i19 = (int) (f14 * 0.78f);
                                    ei.k kVar = gVar.f45732c;
                                    kVar.layout(A, i19, kVar.getMeasuredWidth() + A, gVar.f45732c.getMeasuredHeight() + i19);
                                    return;
                                }
                                int i20 = (int) (i14 * 0.3f);
                                int measuredWidth3 = (i13 - gVar.f45730a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.ch0 ch0Var2 = gVar.f45730a;
                                ch0Var2.layout(measuredWidth3, i20, ch0Var2.getMeasuredWidth() + measuredWidth3, gVar.f45730a.getMeasuredHeight() + i20);
                                int C = org.telegram.messenger.k5.C(24.0f, gVar.f45730a.getMeasuredHeight(), i20);
                                TextView textView3 = gVar.f45733e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), gVar.f45733e.getMeasuredHeight() + C);
                                int textSize = (int) (gVar.f45733e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C);
                                TextView textView4 = gVar.f45734f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), gVar.f45734f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i13 - gVar.f45732c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i14 - gVar.f45732c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                                ei.k kVar2 = gVar.f45732c;
                                kVar2.layout(measuredWidth4, measuredHeight2, kVar2.getMeasuredWidth() + measuredWidth4, gVar.f45732c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i11 > i12) {
                            int measuredHeight3 = (i14 - gVar.f45730a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.ch0 ch0Var3 = gVar.f45730a;
                            ch0Var3.layout(0, measuredHeight3, ch0Var3.getMeasuredWidth(), gVar.f45730a.getMeasuredHeight() + measuredHeight3);
                            float f15 = i13;
                            float f16 = 0.4f * f15;
                            int i21 = (int) f16;
                            float f17 = i14;
                            int i22 = (int) (0.08f * f17);
                            TextView textView5 = gVar.f45733e;
                            textView5.layout(i21, i22, textView5.getMeasuredWidth() + i21, gVar.f45733e.getMeasuredHeight() + i22);
                            float f18 = f15 * 0.6f;
                            int A2 = (int) com.google.android.recaptcha.internal.a.A(f18, gVar.h.getMeasuredWidth(), 2.0f, f16);
                            int i23 = (int) (0.25f * f17);
                            LinearLayout linearLayout = gVar.h;
                            linearLayout.layout(A2, i23, linearLayout.getMeasuredWidth() + A2, gVar.h.getMeasuredHeight() + i23);
                            int A3 = (int) com.google.android.recaptcha.internal.a.A(f18, gVar.f45732c.getMeasuredWidth(), 2.0f, f16);
                            int i24 = (int) (f17 * 0.78f);
                            ei.k kVar3 = gVar.f45732c;
                            kVar3.layout(A3, i24, kVar3.getMeasuredWidth() + A3, gVar.f45732c.getMeasuredHeight() + i24);
                            return;
                        } else {
                            if (org.telegram.messenger.g0.f22563q.y < 1800) {
                                f10 = i14;
                                int i25 = (int) (0.06f * f10);
                                org.telegram.ui.Components.ch0 ch0Var4 = gVar.f45730a;
                                ch0Var4.layout(0, i25, ch0Var4.getMeasuredWidth(), gVar.f45730a.getMeasuredHeight() + i25);
                                int i26 = (int) (0.463f * f10);
                                TextView textView6 = gVar.f45733e;
                                textView6.layout(0, i26, textView6.getMeasuredWidth(), gVar.f45733e.getMeasuredHeight() + i26);
                                f11 = 0.543f;
                            } else {
                                f10 = i14;
                                int i27 = (int) (0.148f * f10);
                                org.telegram.ui.Components.ch0 ch0Var5 = gVar.f45730a;
                                ch0Var5.layout(0, i27, ch0Var5.getMeasuredWidth(), gVar.f45730a.getMeasuredHeight() + i27);
                                int i28 = (int) (0.551f * f10);
                                TextView textView7 = gVar.f45733e;
                                textView7.layout(0, i28, textView7.getMeasuredWidth(), gVar.f45733e.getMeasuredHeight() + i28);
                                f11 = 0.631f;
                            }
                            int i29 = (int) (f10 * f11);
                            int measuredWidth5 = (getMeasuredWidth() - gVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = gVar.h;
                            linearLayout2.layout(measuredWidth5, i29, linearLayout2.getMeasuredWidth() + measuredWidth5, gVar.h.getMeasuredHeight() + i29);
                            int measuredWidth6 = (i13 - gVar.f45732c.getMeasuredWidth()) / 2;
                            int i30 = (int) (i14 * 0.853f);
                            ei.k kVar4 = gVar.f45732c;
                            kVar4.layout(measuredWidth6, i30, kVar4.getMeasuredWidth() + measuredWidth6, gVar.f45732c.getMeasuredHeight() + i30);
                            return;
                        }
                    } else if (i11 > i12) {
                        float f19 = i14;
                        int measuredHeight4 = ((int) ((0.95f * f19) - gVar.f45730a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - gVar.f45730a.getMeasuredWidth());
                        org.telegram.ui.Components.ch0 ch0Var6 = gVar.f45730a;
                        ch0Var6.layout(width, measuredHeight4, ch0Var6.getMeasuredWidth() + width, gVar.f45730a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i13;
                        float f21 = 0.4f * f20;
                        int i31 = (int) f21;
                        int i32 = (int) (0.12f * f19);
                        TextView textView8 = gVar.f45733e;
                        textView8.layout(i31, i32, textView8.getMeasuredWidth() + i31, gVar.f45733e.getMeasuredHeight() + i32);
                        int i33 = (int) (0.24f * f19);
                        TextView textView9 = gVar.f45734f;
                        textView9.layout(i31, i33, textView9.getMeasuredWidth() + i31, gVar.f45734f.getMeasuredHeight() + i33);
                        float f22 = f20 * 0.6f;
                        int A4 = (int) com.google.android.recaptcha.internal.a.A(f22, gVar.f45732c.getMeasuredWidth(), 2.0f, f21);
                        int i34 = (int) (f19 * 0.8f);
                        ei.k kVar5 = gVar.f45732c;
                        kVar5.layout(A4, i34, kVar5.getMeasuredWidth() + A4, gVar.f45732c.getMeasuredHeight() + i34);
                        int A5 = (int) com.google.android.recaptcha.internal.a.A(f22, gVar.d.getMeasuredWidth(), 2.0f, f21);
                        int w10 = org.telegram.messenger.camera.q.w(16.0f, gVar.d.getMeasuredHeight(), i34);
                        TextView textView10 = gVar.d;
                        textView10.layout(A5, w10, textView10.getMeasuredWidth() + A5, gVar.d.getMeasuredHeight() + w10);
                        return;
                    } else {
                        int i35 = (int) (i14 * 0.3f);
                        int measuredWidth7 = (i13 - gVar.f45730a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.ch0 ch0Var7 = gVar.f45730a;
                        ch0Var7.layout(measuredWidth7, i35, ch0Var7.getMeasuredWidth() + measuredWidth7, gVar.f45730a.getMeasuredHeight() + i35);
                        int C2 = org.telegram.messenger.k5.C(24.0f, gVar.f45730a.getMeasuredHeight(), i35);
                        TextView textView11 = gVar.f45733e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), gVar.f45733e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (gVar.f45733e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C2);
                        TextView textView12 = gVar.f45734f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), gVar.f45734f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i13 - gVar.f45732c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i14 - gVar.f45732c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                        ei.k kVar6 = gVar.f45732c;
                        kVar6.layout(measuredWidth8, measuredHeight5, kVar6.getMeasuredWidth() + measuredWidth8, gVar.f45732c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i13 - gVar.d.getMeasuredWidth()) / 2;
                        int w11 = org.telegram.messenger.camera.q.w(32.0f, gVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = gVar.d;
                        textView13.layout(measuredWidth9, w11, textView13.getMeasuredWidth() + measuredWidth9, gVar.d.getMeasuredHeight() + w11);
                        return;
                    }
                } else if (i11 > i12) {
                    int measuredHeight6 = (i14 - gVar.f45730a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.ch0 ch0Var8 = gVar.f45730a;
                    ch0Var8.layout(0, measuredHeight6, ch0Var8.getMeasuredWidth(), gVar.f45730a.getMeasuredHeight() + measuredHeight6);
                    float f23 = i13;
                    float f24 = 0.4f * f23;
                    int i36 = (int) f24;
                    float f25 = i14;
                    int i37 = (int) (0.22f * f25);
                    TextView textView14 = gVar.f45733e;
                    textView14.layout(i36, i37, textView14.getMeasuredWidth() + i36, gVar.f45733e.getMeasuredHeight() + i37);
                    int i38 = (int) (0.39f * f25);
                    TextView textView15 = gVar.f45734f;
                    textView15.layout(i36, i38, textView15.getMeasuredWidth() + i36, gVar.f45734f.getMeasuredHeight() + i38);
                    int A6 = (int) com.google.android.recaptcha.internal.a.A(f23 * 0.6f, gVar.f45732c.getMeasuredWidth(), 2.0f, f24);
                    int i39 = (int) (f25 * 0.69f);
                    ei.k kVar7 = gVar.f45732c;
                    kVar7.layout(A6, i39, kVar7.getMeasuredWidth() + A6, gVar.f45732c.getMeasuredHeight() + i39);
                    return;
                } else {
                    float f26 = i14;
                    int i40 = (int) (0.188f * f26);
                    org.telegram.ui.Components.ch0 ch0Var9 = gVar.f45730a;
                    ch0Var9.layout(0, i40, ch0Var9.getMeasuredWidth(), gVar.f45730a.getMeasuredHeight() + i40);
                    int i41 = (int) (0.651f * f26);
                    TextView textView16 = gVar.f45733e;
                    textView16.layout(0, i41, textView16.getMeasuredWidth(), gVar.f45733e.getMeasuredHeight() + i41);
                    int i42 = (int) (0.731f * f26);
                    TextView textView17 = gVar.f45734f;
                    textView17.layout(0, i42, textView17.getMeasuredWidth(), gVar.f45734f.getMeasuredHeight() + i42);
                    int measuredWidth10 = (i13 - gVar.f45732c.getMeasuredWidth()) / 2;
                    int i43 = (int) (f26 * 0.853f);
                    ei.k kVar8 = gVar.f45732c;
                    kVar8.layout(measuredWidth10, i43, kVar8.getMeasuredWidth() + measuredWidth10, gVar.f45732c.getMeasuredHeight() + i43);
                    return;
                }
            case 1:
                za1 za1Var = (za1) this.f45162b;
                za1.p0(za1Var).layout(0, 0, i11, za1.o0(za1Var).getMeasuredHeight());
                int i44 = i11 - i7;
                int i45 = i12 - i10;
                if (i11 > i12) {
                    int measuredHeight7 = (i45 - za1Var.f52496a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.ch0 ch0Var10 = za1Var.f52496a;
                    ch0Var10.layout(0, measuredHeight7, ch0Var10.getMeasuredWidth(), za1Var.f52496a.getMeasuredHeight() + measuredHeight7);
                    float f27 = i44;
                    float f28 = 0.4f * f27;
                    int i46 = (int) f28;
                    float f29 = i45;
                    int i47 = (int) (0.22f * f29);
                    TextView textView18 = za1Var.f52500c;
                    textView18.layout(i46, i47, textView18.getMeasuredWidth() + i46, za1Var.f52500c.getMeasuredHeight() + i47);
                    int i48 = (int) (0.39f * f29);
                    xh.l lVar = za1Var.d;
                    lVar.layout(i46, i48, lVar.getMeasuredWidth() + i46, za1Var.d.getMeasuredHeight() + i48);
                    int A7 = (int) com.google.android.recaptcha.internal.a.A(f27 * 0.6f, za1Var.f52498b.getMeasuredWidth(), 2.0f, f28);
                    int i49 = (int) (f29 * 0.64f);
                    TextView textView19 = za1Var.f52498b;
                    textView19.layout(A7, i49, textView19.getMeasuredWidth() + A7, za1Var.f52498b.getMeasuredHeight() + i49);
                    return;
                }
                int i50 = (int) (i45 * 0.3f);
                int measuredWidth11 = (i44 - za1Var.f52496a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ch0 ch0Var11 = za1Var.f52496a;
                ch0Var11.layout(measuredWidth11, i50, ch0Var11.getMeasuredWidth() + measuredWidth11, za1Var.f52496a.getMeasuredHeight() + i50);
                int C3 = org.telegram.messenger.k5.C(16.0f, za1Var.f52496a.getMeasuredHeight(), i50);
                TextView textView20 = za1Var.f52500c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), za1Var.f52500c.getMeasuredHeight() + C3);
                int C4 = org.telegram.messenger.k5.C(12.0f, za1Var.f52500c.getMeasuredHeight(), C3);
                xh.l lVar2 = za1Var.d;
                lVar2.layout(0, C4, lVar2.getMeasuredWidth(), za1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i44 - za1Var.f52498b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i45 - za1Var.f52498b.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                TextView textView21 = za1Var.f52498b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, za1Var.f52498b.getMeasuredHeight() + measuredHeight8);
                return;
            case 2:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f45162b;
                org.telegram.ui.ActionBar.m1 m1Var = usersSelectActivity.f42074a;
                m1Var.layout(0, 0, m1Var.getMeasuredWidth(), usersSelectActivity.f42074a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f42074a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f42074a.getMeasuredHeight());
                usersSelectActivity.f42078f.layout(0, usersSelectActivity.f42074a.getMeasuredHeight(), usersSelectActivity.f42078f.getMeasuredWidth(), usersSelectActivity.f42078f.getMeasuredHeight() + usersSelectActivity.f42074a.getMeasuredHeight());
                usersSelectActivity.f42077e.layout(0, usersSelectActivity.f42074a.getMeasuredHeight(), usersSelectActivity.f42078f.getMeasuredWidth(), usersSelectActivity.f42077e.getMeasuredHeight() + usersSelectActivity.f42074a.getMeasuredHeight());
                org.telegram.ui.Components.q00 q00Var = usersSelectActivity.f42080r;
                if (q00Var != null) {
                    if (org.telegram.messenger.id.f23157a0) {
                        measuredWidth = usersSelectActivity.f42081s.leftMargin;
                    } else {
                        measuredWidth = ((i11 - i7) - usersSelectActivity.f42081s.rightMargin) - q00Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i12 - i10) - usersSelectActivity.f42081s.bottomMargin) - usersSelectActivity.f42080r.getMeasuredHeight();
                    org.telegram.ui.Components.q00 q00Var2 = usersSelectActivity.f42080r;
                    q00Var2.layout(measuredWidth, measuredHeight9, q00Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f42080r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
            default:
                ti.i iVar = (ti.i) this.f45162b;
                iVar.f56088i.layout(0, 0, iVar.f56102x, iVar.f56103y);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        switch (this.f45161a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                g gVar = (g) this.f45162b;
                int i12 = gVar.f45738w;
                if (g.Z(gVar) != null) {
                    g.a0(gVar).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                }
                if (i12 != 0) {
                    if (i12 != 3) {
                        if (i12 != 5) {
                            if (i12 == 6) {
                                if (i12 == 6) {
                                    gVar.f45730a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824));
                                } else {
                                    gVar.f45730a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i13 = (int) (size * 0.6f);
                                    gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f45734f.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f45732c.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                } else {
                                    gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f45734f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i12 == 6) {
                                        gVar.f45732c.measure(org.telegram.messenger.camera.q.c(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                    } else {
                                        gVar.f45732c.measure(org.telegram.messenger.camera.q.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f10 = size;
                            gVar.f45730a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i14 = (int) (f10 * 0.6f);
                            gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45732c.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        } else {
                            gVar.f45730a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45732c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        }
                    } else {
                        gVar.f45730a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), 1073741824));
                        if (size > size2) {
                            float f11 = size;
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i15 = (int) (f11 * 0.6f);
                            gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45734f.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45732c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        } else {
                            gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45734f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45732c.measure(org.telegram.messenger.camera.q.c(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f12 = size;
                    gVar.f45730a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i16 = (int) (f12 * 0.6f);
                    gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45734f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45732c.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else {
                    gVar.f45730a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    gVar.f45733e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45734f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45732c.measure(org.telegram.messenger.camera.q.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                za1 za1Var = (za1) this.f45162b;
                za1.y0(za1Var).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                if (size3 > size4) {
                    float f13 = size3;
                    za1Var.f52496a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i17 = (int) (f13 * 0.6f);
                    za1Var.f52500c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    za1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    za1Var.f52503e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    za1Var.f52498b.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
                } else {
                    if (za1Var.O == 7) {
                        i11 = 160;
                    } else {
                        i11 = 140;
                    }
                    float f14 = i11;
                    za1Var.f52496a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), 1073741824));
                    za1Var.f52500c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    za1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    za1Var.f52503e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    za1Var.f52498b.measure(org.telegram.messenger.camera.q.c(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            case 2:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f45162b;
                int size5 = View.MeasureSpec.getSize(i7);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                if (!org.telegram.messenger.g0.Q1() && size6 <= size5) {
                    L = org.telegram.messenger.g0.L(56.0f);
                } else {
                    L = org.telegram.messenger.g0.L(144.0f);
                }
                usersSelectActivity.f42074a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f42074a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f42078f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f42074a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f42077e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f42074a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.q00 q00Var = usersSelectActivity.f42080r;
                if (q00Var != null) {
                    int i18 = usersSelectActivity.f42081s.width;
                    q00Var.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                    return;
                }
                return;
            default:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
                ti.i iVar = (ti.i) this.f45162b;
                iVar.f56088i.measure(View.MeasureSpec.makeMeasureSpec(iVar.f56102x, 1073741824), View.MeasureSpec.makeMeasureSpec(iVar.f56103y, 1073741824));
                return;
        }
    }
}
