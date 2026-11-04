package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e extends ViewGroup {
    public final int f44842a;
    public final Object f44843b;

    public e(int i3, Context context, Object obj) {
        super(context);
        this.f44842a = i3;
        this.f44843b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        switch (this.f44842a) {
            case 5:
                wf.e eVar = (wf.e) this.f44843b;
                Path path = eVar.f57580m;
                float f10 = (1.0f - eVar.f57582o) * eVar.f57577j.f55852e;
                if (f10 > 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false), (int) Math.min(eVar.f57582o * 420.0f, 255.0f)));
                eVar.d.a(canvas, 1.0f);
                if (z10) {
                    RectF rectF = eVar.f57579l;
                    if (eVar.f57578k != f10) {
                        eVar.f57578k = f10;
                        rectF.set(eVar.f57572c);
                        path.reset();
                        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                        path.close();
                    }
                    canvas.save();
                    canvas.clipPath(path);
                }
                super.dispatchDraw(canvas);
                eVar.f57573e.a(canvas, 1.0f - eVar.f57582o);
                if (z10) {
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f44842a) {
            case 1:
                org.telegram.ui.Components.ie0 ie0Var = (org.telegram.ui.Components.ie0) this.f44843b;
                if (!ie0Var.f34702n0) {
                    canvas.save();
                    canvas.scale(ie0Var.I / ie0Var.f34691e.getWidth(), ie0Var.J / ie0Var.f34691e.getHeight());
                    super.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (!((org.telegram.ui.Components.voip.s0) this.f44843b).f39593b0) {
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
        switch (this.f44842a) {
            case 4:
                boolean drawChild = super.drawChild(canvas, view, j10);
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f44843b;
                if (view == usersSelectActivity.d || view == usersSelectActivity.f42109f) {
                    ((ActionBarLayout) UsersSelectActivity.a0(usersSelectActivity)).q(canvas, usersSelectActivity.f42105a.getMeasuredHeight());
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float f10;
        float f11;
        int measuredWidth;
        switch (this.f44842a) {
            case 0:
                g gVar = (g) this.f44843b;
                if (g.b0(gVar) != null) {
                    g.d0(gVar).layout(0, 0, i11, g.c0(gVar).getMeasuredHeight());
                }
                int i13 = i11 - i3;
                int i14 = i12 - i10;
                int i15 = gVar.f45420w;
                if (i15 != 0) {
                    if (i15 != 3) {
                        if (i15 != 5) {
                            if (i15 == 6) {
                                if (i11 > i12) {
                                    int measuredHeight = (i14 - gVar.f45412a.getMeasuredHeight()) / 2;
                                    float f12 = i13;
                                    int measuredWidth2 = ((int) ((0.5f * f12) - gVar.f45412a.getMeasuredWidth())) / 2;
                                    org.telegram.ui.Components.fh0 fh0Var = gVar.f45412a;
                                    fh0Var.layout(measuredWidth2, measuredHeight, fh0Var.getMeasuredWidth() + measuredWidth2, gVar.f45412a.getMeasuredHeight() + measuredHeight);
                                    float f13 = 0.4f * f12;
                                    int i16 = (int) f13;
                                    float f14 = i14;
                                    int i17 = (int) (0.14f * f14);
                                    TextView textView = gVar.f45415e;
                                    textView.layout(i16, i17, textView.getMeasuredWidth() + i16, gVar.f45415e.getMeasuredHeight() + i17);
                                    int i18 = (int) (0.31f * f14);
                                    TextView textView2 = gVar.f45416f;
                                    textView2.layout(i16, i18, textView2.getMeasuredWidth() + i16, gVar.f45416f.getMeasuredHeight() + i18);
                                    int z11 = (int) com.google.android.recaptcha.internal.a.z(f12 * 0.6f, gVar.f45414c.getMeasuredWidth(), 2.0f, f13);
                                    int i19 = (int) (f14 * 0.78f);
                                    fi.j jVar = gVar.f45414c;
                                    jVar.layout(z11, i19, jVar.getMeasuredWidth() + z11, gVar.f45414c.getMeasuredHeight() + i19);
                                    return;
                                }
                                int i20 = (int) (i14 * 0.3f);
                                int measuredWidth3 = (i13 - gVar.f45412a.getMeasuredWidth()) / 2;
                                org.telegram.ui.Components.fh0 fh0Var2 = gVar.f45412a;
                                fh0Var2.layout(measuredWidth3, i20, fh0Var2.getMeasuredWidth() + measuredWidth3, gVar.f45412a.getMeasuredHeight() + i20);
                                int C = org.telegram.messenger.k5.C(24.0f, gVar.f45412a.getMeasuredHeight(), i20);
                                TextView textView3 = gVar.f45415e;
                                textView3.layout(0, C, textView3.getMeasuredWidth(), gVar.f45415e.getMeasuredHeight() + C);
                                int textSize = (int) (gVar.f45415e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C);
                                TextView textView4 = gVar.f45416f;
                                textView4.layout(0, textSize, textView4.getMeasuredWidth(), gVar.f45416f.getMeasuredHeight() + textSize);
                                int measuredWidth4 = (i13 - gVar.f45414c.getMeasuredWidth()) / 2;
                                int measuredHeight2 = (i14 - gVar.f45414c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                                fi.j jVar2 = gVar.f45414c;
                                jVar2.layout(measuredWidth4, measuredHeight2, jVar2.getMeasuredWidth() + measuredWidth4, gVar.f45414c.getMeasuredHeight() + measuredHeight2);
                                return;
                            }
                            return;
                        } else if (i11 > i12) {
                            int measuredHeight3 = (i14 - gVar.f45412a.getMeasuredHeight()) / 2;
                            org.telegram.ui.Components.fh0 fh0Var3 = gVar.f45412a;
                            fh0Var3.layout(0, measuredHeight3, fh0Var3.getMeasuredWidth(), gVar.f45412a.getMeasuredHeight() + measuredHeight3);
                            float f15 = i13;
                            float f16 = 0.4f * f15;
                            int i21 = (int) f16;
                            float f17 = i14;
                            int i22 = (int) (0.08f * f17);
                            TextView textView5 = gVar.f45415e;
                            textView5.layout(i21, i22, textView5.getMeasuredWidth() + i21, gVar.f45415e.getMeasuredHeight() + i22);
                            float f18 = f15 * 0.6f;
                            int z12 = (int) com.google.android.recaptcha.internal.a.z(f18, gVar.h.getMeasuredWidth(), 2.0f, f16);
                            int i23 = (int) (0.25f * f17);
                            LinearLayout linearLayout = gVar.h;
                            linearLayout.layout(z12, i23, linearLayout.getMeasuredWidth() + z12, gVar.h.getMeasuredHeight() + i23);
                            int z13 = (int) com.google.android.recaptcha.internal.a.z(f18, gVar.f45414c.getMeasuredWidth(), 2.0f, f16);
                            int i24 = (int) (f17 * 0.78f);
                            fi.j jVar3 = gVar.f45414c;
                            jVar3.layout(z13, i24, jVar3.getMeasuredWidth() + z13, gVar.f45414c.getMeasuredHeight() + i24);
                            return;
                        } else {
                            if (org.telegram.messenger.g0.f22608q.y < 1800) {
                                f10 = i14;
                                int i25 = (int) (0.06f * f10);
                                org.telegram.ui.Components.fh0 fh0Var4 = gVar.f45412a;
                                fh0Var4.layout(0, i25, fh0Var4.getMeasuredWidth(), gVar.f45412a.getMeasuredHeight() + i25);
                                int i26 = (int) (0.463f * f10);
                                TextView textView6 = gVar.f45415e;
                                textView6.layout(0, i26, textView6.getMeasuredWidth(), gVar.f45415e.getMeasuredHeight() + i26);
                                f11 = 0.543f;
                            } else {
                                f10 = i14;
                                int i27 = (int) (0.148f * f10);
                                org.telegram.ui.Components.fh0 fh0Var5 = gVar.f45412a;
                                fh0Var5.layout(0, i27, fh0Var5.getMeasuredWidth(), gVar.f45412a.getMeasuredHeight() + i27);
                                int i28 = (int) (0.551f * f10);
                                TextView textView7 = gVar.f45415e;
                                textView7.layout(0, i28, textView7.getMeasuredWidth(), gVar.f45415e.getMeasuredHeight() + i28);
                                f11 = 0.631f;
                            }
                            int i29 = (int) (f10 * f11);
                            int measuredWidth5 = (getMeasuredWidth() - gVar.h.getMeasuredWidth()) / 2;
                            LinearLayout linearLayout2 = gVar.h;
                            linearLayout2.layout(measuredWidth5, i29, linearLayout2.getMeasuredWidth() + measuredWidth5, gVar.h.getMeasuredHeight() + i29);
                            int measuredWidth6 = (i13 - gVar.f45414c.getMeasuredWidth()) / 2;
                            int i30 = (int) (i14 * 0.853f);
                            fi.j jVar4 = gVar.f45414c;
                            jVar4.layout(measuredWidth6, i30, jVar4.getMeasuredWidth() + measuredWidth6, gVar.f45414c.getMeasuredHeight() + i30);
                            return;
                        }
                    } else if (i11 > i12) {
                        float f19 = i14;
                        int measuredHeight4 = ((int) ((0.95f * f19) - gVar.f45412a.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - gVar.f45412a.getMeasuredWidth());
                        org.telegram.ui.Components.fh0 fh0Var6 = gVar.f45412a;
                        fh0Var6.layout(width, measuredHeight4, fh0Var6.getMeasuredWidth() + width, gVar.f45412a.getMeasuredHeight() + measuredHeight4);
                        float f20 = i13;
                        float f21 = 0.4f * f20;
                        int i31 = (int) f21;
                        int i32 = (int) (0.12f * f19);
                        TextView textView8 = gVar.f45415e;
                        textView8.layout(i31, i32, textView8.getMeasuredWidth() + i31, gVar.f45415e.getMeasuredHeight() + i32);
                        int i33 = (int) (0.24f * f19);
                        TextView textView9 = gVar.f45416f;
                        textView9.layout(i31, i33, textView9.getMeasuredWidth() + i31, gVar.f45416f.getMeasuredHeight() + i33);
                        float f22 = f20 * 0.6f;
                        int z14 = (int) com.google.android.recaptcha.internal.a.z(f22, gVar.f45414c.getMeasuredWidth(), 2.0f, f21);
                        int i34 = (int) (f19 * 0.8f);
                        fi.j jVar5 = gVar.f45414c;
                        jVar5.layout(z14, i34, jVar5.getMeasuredWidth() + z14, gVar.f45414c.getMeasuredHeight() + i34);
                        int z15 = (int) com.google.android.recaptcha.internal.a.z(f22, gVar.d.getMeasuredWidth(), 2.0f, f21);
                        int w10 = org.telegram.messenger.camera.q.w(16.0f, gVar.d.getMeasuredHeight(), i34);
                        TextView textView10 = gVar.d;
                        textView10.layout(z15, w10, textView10.getMeasuredWidth() + z15, gVar.d.getMeasuredHeight() + w10);
                        return;
                    } else {
                        int i35 = (int) (i14 * 0.3f);
                        int measuredWidth7 = (i13 - gVar.f45412a.getMeasuredWidth()) / 2;
                        org.telegram.ui.Components.fh0 fh0Var7 = gVar.f45412a;
                        fh0Var7.layout(measuredWidth7, i35, fh0Var7.getMeasuredWidth() + measuredWidth7, gVar.f45412a.getMeasuredHeight() + i35);
                        int C2 = org.telegram.messenger.k5.C(24.0f, gVar.f45412a.getMeasuredHeight(), i35);
                        TextView textView11 = gVar.f45415e;
                        textView11.layout(0, C2, textView11.getMeasuredWidth(), gVar.f45415e.getMeasuredHeight() + C2);
                        int textSize2 = (int) (gVar.f45415e.getTextSize() + org.telegram.messenger.g0.L(16.0f) + C2);
                        TextView textView12 = gVar.f45416f;
                        textView12.layout(0, textSize2, textView12.getMeasuredWidth(), gVar.f45416f.getMeasuredHeight() + textSize2);
                        int measuredWidth8 = (i13 - gVar.f45414c.getMeasuredWidth()) / 2;
                        int measuredHeight5 = (i14 - gVar.f45414c.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                        fi.j jVar6 = gVar.f45414c;
                        jVar6.layout(measuredWidth8, measuredHeight5, jVar6.getMeasuredWidth() + measuredWidth8, gVar.f45414c.getMeasuredHeight() + measuredHeight5);
                        int measuredWidth9 = (i13 - gVar.d.getMeasuredWidth()) / 2;
                        int w11 = org.telegram.messenger.camera.q.w(32.0f, gVar.d.getMeasuredHeight(), measuredHeight5);
                        TextView textView13 = gVar.d;
                        textView13.layout(measuredWidth9, w11, textView13.getMeasuredWidth() + measuredWidth9, gVar.d.getMeasuredHeight() + w11);
                        return;
                    }
                } else if (i11 > i12) {
                    int measuredHeight6 = (i14 - gVar.f45412a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.fh0 fh0Var8 = gVar.f45412a;
                    fh0Var8.layout(0, measuredHeight6, fh0Var8.getMeasuredWidth(), gVar.f45412a.getMeasuredHeight() + measuredHeight6);
                    float f23 = i13;
                    float f24 = 0.4f * f23;
                    int i36 = (int) f24;
                    float f25 = i14;
                    int i37 = (int) (0.22f * f25);
                    TextView textView14 = gVar.f45415e;
                    textView14.layout(i36, i37, textView14.getMeasuredWidth() + i36, gVar.f45415e.getMeasuredHeight() + i37);
                    int i38 = (int) (0.39f * f25);
                    TextView textView15 = gVar.f45416f;
                    textView15.layout(i36, i38, textView15.getMeasuredWidth() + i36, gVar.f45416f.getMeasuredHeight() + i38);
                    int z16 = (int) com.google.android.recaptcha.internal.a.z(f23 * 0.6f, gVar.f45414c.getMeasuredWidth(), 2.0f, f24);
                    int i39 = (int) (f25 * 0.69f);
                    fi.j jVar7 = gVar.f45414c;
                    jVar7.layout(z16, i39, jVar7.getMeasuredWidth() + z16, gVar.f45414c.getMeasuredHeight() + i39);
                    return;
                } else {
                    float f26 = i14;
                    int i40 = (int) (0.188f * f26);
                    org.telegram.ui.Components.fh0 fh0Var9 = gVar.f45412a;
                    fh0Var9.layout(0, i40, fh0Var9.getMeasuredWidth(), gVar.f45412a.getMeasuredHeight() + i40);
                    int i41 = (int) (0.651f * f26);
                    TextView textView16 = gVar.f45415e;
                    textView16.layout(0, i41, textView16.getMeasuredWidth(), gVar.f45415e.getMeasuredHeight() + i41);
                    int i42 = (int) (0.731f * f26);
                    TextView textView17 = gVar.f45416f;
                    textView17.layout(0, i42, textView17.getMeasuredWidth(), gVar.f45416f.getMeasuredHeight() + i42);
                    int measuredWidth10 = (i13 - gVar.f45414c.getMeasuredWidth()) / 2;
                    int i43 = (int) (f26 * 0.853f);
                    fi.j jVar8 = gVar.f45414c;
                    jVar8.layout(measuredWidth10, i43, jVar8.getMeasuredWidth() + measuredWidth10, gVar.f45414c.getMeasuredHeight() + i43);
                    return;
                }
            case 1:
                org.telegram.ui.Components.ie0 ie0Var = (org.telegram.ui.Components.ie0) this.f44843b;
                ie0Var.f34691e.layout(0, 0, ie0Var.I, ie0Var.J);
                return;
            case 2:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f44843b;
                if (s0Var.f39595e.getParent() == this) {
                    s0Var.f39595e.layout(0, 0, s0Var.N, s0Var.O);
                    return;
                }
                return;
            case 3:
                ra1 ra1Var = (ra1) this.f44843b;
                ra1.p0(ra1Var).layout(0, 0, i11, ra1.o0(ra1Var).getMeasuredHeight());
                int i44 = i11 - i3;
                int i45 = i12 - i10;
                if (i11 > i12) {
                    int measuredHeight7 = (i45 - ra1Var.f49153a.getMeasuredHeight()) / 2;
                    org.telegram.ui.Components.fh0 fh0Var10 = ra1Var.f49153a;
                    fh0Var10.layout(0, measuredHeight7, fh0Var10.getMeasuredWidth(), ra1Var.f49153a.getMeasuredHeight() + measuredHeight7);
                    float f27 = i44;
                    float f28 = 0.4f * f27;
                    int i46 = (int) f28;
                    float f29 = i45;
                    int i47 = (int) (0.22f * f29);
                    TextView textView18 = ra1Var.f49157c;
                    textView18.layout(i46, i47, textView18.getMeasuredWidth() + i46, ra1Var.f49157c.getMeasuredHeight() + i47);
                    int i48 = (int) (0.39f * f29);
                    yh.l lVar = ra1Var.d;
                    lVar.layout(i46, i48, lVar.getMeasuredWidth() + i46, ra1Var.d.getMeasuredHeight() + i48);
                    int z17 = (int) com.google.android.recaptcha.internal.a.z(f27 * 0.6f, ra1Var.f49155b.getMeasuredWidth(), 2.0f, f28);
                    int i49 = (int) (f29 * 0.64f);
                    TextView textView19 = ra1Var.f49155b;
                    textView19.layout(z17, i49, textView19.getMeasuredWidth() + z17, ra1Var.f49155b.getMeasuredHeight() + i49);
                    return;
                }
                int i50 = (int) (i45 * 0.3f);
                int measuredWidth11 = (i44 - ra1Var.f49153a.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.fh0 fh0Var11 = ra1Var.f49153a;
                fh0Var11.layout(measuredWidth11, i50, fh0Var11.getMeasuredWidth() + measuredWidth11, ra1Var.f49153a.getMeasuredHeight() + i50);
                int C3 = org.telegram.messenger.k5.C(16.0f, ra1Var.f49153a.getMeasuredHeight(), i50);
                TextView textView20 = ra1Var.f49157c;
                textView20.layout(0, C3, textView20.getMeasuredWidth(), ra1Var.f49157c.getMeasuredHeight() + C3);
                int C4 = org.telegram.messenger.k5.C(12.0f, ra1Var.f49157c.getMeasuredHeight(), C3);
                yh.l lVar2 = ra1Var.d;
                lVar2.layout(0, C4, lVar2.getMeasuredWidth(), ra1Var.d.getMeasuredHeight() + C4);
                int measuredWidth12 = (i44 - ra1Var.f49155b.getMeasuredWidth()) / 2;
                int measuredHeight8 = (i45 - ra1Var.f49155b.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f);
                TextView textView21 = ra1Var.f49155b;
                textView21.layout(measuredWidth12, measuredHeight8, textView21.getMeasuredWidth() + measuredWidth12, ra1Var.f49155b.getMeasuredHeight() + measuredHeight8);
                return;
            case 4:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f44843b;
                org.telegram.ui.ActionBar.k1 k1Var = usersSelectActivity.f42105a;
                k1Var.layout(0, 0, k1Var.getMeasuredWidth(), usersSelectActivity.f42105a.getMeasuredHeight());
                usersSelectActivity.d.layout(0, usersSelectActivity.f42105a.getMeasuredHeight(), usersSelectActivity.d.getMeasuredWidth(), usersSelectActivity.d.getMeasuredHeight() + usersSelectActivity.f42105a.getMeasuredHeight());
                usersSelectActivity.f42109f.layout(0, usersSelectActivity.f42105a.getMeasuredHeight(), usersSelectActivity.f42109f.getMeasuredWidth(), usersSelectActivity.f42109f.getMeasuredHeight() + usersSelectActivity.f42105a.getMeasuredHeight());
                usersSelectActivity.f42108e.layout(0, usersSelectActivity.f42105a.getMeasuredHeight(), usersSelectActivity.f42109f.getMeasuredWidth(), usersSelectActivity.f42108e.getMeasuredHeight() + usersSelectActivity.f42105a.getMeasuredHeight());
                org.telegram.ui.Components.l00 l00Var = usersSelectActivity.f42111r;
                if (l00Var != null) {
                    if (org.telegram.messenger.bd.f21784a0) {
                        measuredWidth = usersSelectActivity.f42112s.leftMargin;
                    } else {
                        measuredWidth = ((i11 - i3) - usersSelectActivity.f42112s.rightMargin) - l00Var.getMeasuredWidth();
                    }
                    int measuredHeight9 = ((i12 - i10) - usersSelectActivity.f42112s.bottomMargin) - usersSelectActivity.f42111r.getMeasuredHeight();
                    org.telegram.ui.Components.l00 l00Var2 = usersSelectActivity.f42111r;
                    l00Var2.layout(measuredWidth, measuredHeight9, l00Var2.getMeasuredWidth() + measuredWidth, usersSelectActivity.f42111r.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                return;
            default:
                for (int i51 = 0; i51 < getChildCount(); i51++) {
                    View childAt = getChildAt(i51);
                    Rect rect = ((wf.e) this.f44843b).f57572c;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int L;
        switch (this.f44842a) {
            case 0:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                g gVar = (g) this.f44843b;
                int i12 = gVar.f45420w;
                if (g.Z(gVar) != null) {
                    g.a0(gVar).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                }
                if (i12 != 0) {
                    if (i12 != 3) {
                        if (i12 != 5) {
                            if (i12 == 6) {
                                if (i12 == 6) {
                                    gVar.f45412a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(140.0f), 1073741824));
                                } else {
                                    gVar.f45412a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
                                }
                                if (size > size2) {
                                    int i13 = (int) (size * 0.6f);
                                    gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f45416f.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f45414c.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                } else {
                                    gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    gVar.f45416f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                    if (i12 == 6) {
                                        gVar.f45414c.measure(org.telegram.messenger.camera.q.c(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                    } else {
                                        gVar.f45414c.measure(org.telegram.messenger.camera.q.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                                    }
                                }
                            }
                        } else if (size > size2) {
                            float f10 = size;
                            gVar.f45412a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i14 = (int) (f10 * 0.6f);
                            gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45414c.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        } else {
                            gVar.f45412a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45414c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        }
                    } else {
                        gVar.f45412a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), 1073741824));
                        if (size > size2) {
                            float f11 = size;
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f11), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i15 = (int) (f11 * 0.6f);
                            gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45416f.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45414c.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        } else {
                            gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45416f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            gVar.f45414c.measure(org.telegram.messenger.camera.q.c(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                        }
                    }
                } else if (size > size2) {
                    float f12 = size;
                    gVar.f45412a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f12), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i16 = (int) (f12 * 0.6f);
                    gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45416f.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45414c.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                } else {
                    gVar.f45412a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    gVar.f45415e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45416f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    gVar.f45414c.measure(org.telegram.messenger.camera.q.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.ie0 ie0Var = (org.telegram.ui.Components.ie0) this.f44843b;
                ie0Var.f34691e.measure(View.MeasureSpec.makeMeasureSpec(ie0Var.I, 1073741824), View.MeasureSpec.makeMeasureSpec(ie0Var.J, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f44843b;
                if (s0Var.f39595e.getParent() == this) {
                    s0Var.f39595e.measure(View.MeasureSpec.makeMeasureSpec(s0Var.N, 1073741824), View.MeasureSpec.makeMeasureSpec(s0Var.O, 1073741824));
                    return;
                }
                return;
            case 3:
                int size3 = View.MeasureSpec.getSize(i3);
                int size4 = View.MeasureSpec.getSize(i10);
                ra1 ra1Var = (ra1) this.f44843b;
                ra1.y0(ra1Var).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                if (size3 > size4) {
                    float f13 = size3;
                    ra1Var.f49153a.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f13), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size4 * 0.68f), 1073741824));
                    int i17 = (int) (f13 * 0.6f);
                    ra1Var.f49157c.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.d.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.f49160e.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.f49155b.measure(View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
                } else {
                    if (ra1Var.P == 7) {
                        i11 = 160;
                    } else {
                        i11 = 140;
                    }
                    float f14 = i11;
                    ra1Var.f49153a.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f14), 1073741824));
                    ra1Var.f49157c.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.d.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.f49160e.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 0));
                    ra1Var.f49155b.measure(org.telegram.messenger.camera.q.c(48.0f, size3, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
                }
                setMeasuredDimension(size3, size4);
                return;
            case 4:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f44843b;
                int size5 = View.MeasureSpec.getSize(i3);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                if (!org.telegram.messenger.g0.Q1() && size6 <= size5) {
                    L = org.telegram.messenger.g0.L(56.0f);
                } else {
                    L = org.telegram.messenger.g0.L(144.0f);
                }
                usersSelectActivity.f42105a.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                usersSelectActivity.d.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f42105a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f42109f.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f42105a.getMeasuredHeight(), 1073741824));
                usersSelectActivity.f42108e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6 - usersSelectActivity.f42105a.getMeasuredHeight(), 1073741824));
                org.telegram.ui.Components.l00 l00Var = usersSelectActivity.f42111r;
                if (l00Var != null) {
                    int i18 = usersSelectActivity.f42112s.width;
                    l00Var.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                    return;
                }
                return;
            default:
                int size7 = View.MeasureSpec.getSize(i3);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                wf.e eVar = (wf.e) this.f44843b;
                boolean z10 = ((uf.a) getParent()).d;
                Rect rect = eVar.f57572c;
                if (z10) {
                    rect.set(0, 0, size7, size8);
                } else {
                    rect.set(eVar.f57571b);
                }
                for (int i19 = 0; i19 < getChildCount(); i19++) {
                    getChildAt(i19).measure(View.MeasureSpec.makeMeasureSpec(eVar.f57572c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f57572c.height(), 1073741824));
                }
                return;
        }
    }

    public e(LaunchActivity launchActivity, wf.e eVar) {
        super(launchActivity);
        this.f44842a = 5;
        this.f44843b = eVar;
    }
}
