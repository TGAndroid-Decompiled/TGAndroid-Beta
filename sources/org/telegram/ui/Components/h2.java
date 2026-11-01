package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h2 implements org.telegram.messenger.r20 {
    public final int f26645a = 0;
    public final int f26646b;
    public final int f26647c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f26648f;
    public final Object f26649g;

    public h2(int i10, int i11, m3 m3Var, o3 o3Var, int i12, n3 n3Var) {
        this.f26646b = i10;
        this.f26647c = i11;
        this.e = m3Var;
        this.f26648f = o3Var;
        this.d = i12;
        this.f26649g = n3Var;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        int i11;
        ?? r52;
        AlertDialog$Builder alertDialog$Builder;
        int i12;
        int L;
        boolean z10;
        int i13;
        String str;
        AlertDialog$Builder alertDialog$Builder2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i14 = this.f26645a;
        Object obj2 = this.f26649g;
        Object obj3 = this.f26648f;
        int i15 = this.d;
        int i16 = this.f26647c;
        int i17 = this.f26646b;
        KeyEvent.Callback callback = this.e;
        switch (i14) {
            case 0:
                m3 m3Var = (m3) callback;
                o3 o3Var = (o3) obj3;
                n3 n3Var = (n3) obj2;
                Boolean bool = (Boolean) obj;
                int i18 = i17 % 60;
                int i19 = (i17 - i18) / 60;
                int i20 = i16 % 60;
                int i21 = (i16 - i20) / 60;
                int i22 = 59;
                if (i20 == 0 && i21 > 0) {
                    i21--;
                    i20 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = m3Var.getValue();
                    i10 = o3Var.getValue();
                } else {
                    i10 = i15 % 60;
                    i11 = (i15 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                m3Var.setMinValue(i19);
                m3Var.setMaxValue(i21);
                if (i11 > i21) {
                    m3Var.setValue(i21);
                    i11 = i21;
                } else if (i11 < i19) {
                    m3Var.setValue(i19);
                    i11 = i19;
                }
                if (i11 <= i19) {
                    o3Var.setMinValue(i18);
                    if (i19 == i21) {
                        i22 = i20;
                    }
                    o3Var.setMaxValue(i22);
                } else if (i11 >= i21) {
                    if (i19 != i21) {
                        i18 = 0;
                    }
                    o3Var.setMinValue(i18);
                    o3Var.setMaxValue(i20);
                } else if (i19 == i21) {
                    o3Var.setMinValue(i18);
                    o3Var.setMaxValue(i20);
                } else {
                    o3Var.setMinValue(0);
                    o3Var.setMaxValue(59);
                }
                if (i10 > o3Var.getMaxValue()) {
                    i10 = o3Var.getMaxValue();
                    o3Var.setValue(i10);
                } else if (i10 < o3Var.getMinValue()) {
                    i10 = o3Var.getMinValue();
                    o3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    m3Var.setValue(i11);
                    o3Var.setValue(i10);
                }
                n3Var.invalidate();
                return;
            default:
                final rh.e4 e4Var = (rh.e4) callback;
                final mg.i2[] i2VarArr = (mg.i2[]) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                Long l4 = (Long) obj;
                if (l4.longValue() != -99 && l4.longValue() != -98) {
                    v41 v41Var = new v41(e4Var, l4, i2VarArr, 20);
                    if (l4.longValue() < 0) {
                        TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(e4Var.f21584a).M0(-l4.longValue());
                        if (M0 == null) {
                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                            tL_channels_getFullChannel.channel = org.telegram.messenger.wp.r1(e4Var.f21584a).g1(-l4.longValue());
                            ConnectionsManager.getInstance(e4Var.f21584a).sendRequest(tL_channels_getFullChannel, new org.telegram.ui.sl0(26, e4Var, v41Var));
                            return;
                        } else if (!M0.stargifts_available) {
                            alertDialog$Builder2 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                            String L0 = org.telegram.messenger.dd.L0(2131750271, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.f20135a;
                            x1Var.R = L0;
                            x1Var.T = org.telegram.messenger.dd.L0(2131750272, null);
                        }
                    } else if (l4.longValue() >= 0) {
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(e4Var.f21584a).Z1(l4);
                        TLRPC.UserFull a2 = org.telegram.messenger.wp.r1(e4Var.f21584a).a2(l4.longValue());
                        if (a2 != null && (disallowedGiftsSettings = a2.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                            org.telegram.messenger.a30.s(org.telegram.messenger.dd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(l4.longValue())), new cc(i2VarArr[0].f21590c, e4Var.I0), 2131624011, 36);
                            return;
                        } else if (a2 == null && Z1 != null) {
                            TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                            tL_users_getFullUser.f19936id = org.telegram.messenger.wp.r1(e4Var.f21584a).p1(Z1);
                            ConnectionsManager.getInstance(e4Var.f21584a).sendRequest(tL_users_getFullUser, new org.telegram.ui.mb(e4Var, i2VarArr, l4, v41Var, 12));
                            return;
                        }
                    }
                    v41Var.run();
                    return;
                } else if (i17 < i16) {
                    alertDialog$Builder2 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                    String L02 = org.telegram.messenger.dd.L0(2131750216, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.R = L02;
                    x1Var2.T = org.telegram.messenger.dd.G(Math.max(1, i15), "Gift2ExportTONUnlocksAlertText", new Object[0]);
                } else {
                    if (l4.longValue() == -98) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                        String L03 = org.telegram.messenger.dd.L0(2131750113, null);
                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20135a;
                        x1Var3.R = L03;
                        x1Var3.T = org.telegram.messenger.dd.L0(2131750112, null);
                        String t10 = org.telegram.ui.Wallet.k0.x(e4Var.f21584a).t();
                        LinearLayout linearLayout = new LinearLayout(e4Var.getContext());
                        linearLayout.setOrientation(1);
                        int i23 = 3;
                        if (!TextUtils.isEmpty(t10)) {
                            TextView textView = new TextView(e4Var.getContext());
                            textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
                            textView.setTextSize(1, 16.5f);
                            textView.setLetterSpacing(0.01818182f);
                            textView.setLineSpacing(org.telegram.messenger.i0.L(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                            textView.setIncludeFontPadding(false);
                            textView.setGravity(17);
                            textView.setPadding(0, org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f));
                            int i24 = org.telegram.ui.ActionBar.t6.f21038j5;
                            int w02 = org.telegram.ui.ActionBar.t6.w0(i24, e4Var.I0);
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), org.telegram.ui.ActionBar.t6.r1(0.045f, w02));
                            org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.045f, i24);
                            org.telegram.ui.ActionBar.p6 p6Var = e4Var.I0;
                            textView.setBackground(d02);
                            org.telegram.ui.ActionBar.a7.k(textView, d02, L2, null, p6Var);
                            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21186r5, e4Var.I0);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            int length = (t10.length() + 3) / 4;
                            for (int i25 = 0; i25 < length; i25++) {
                                if (i25 > 0) {
                                    if (i25 % 4 == 0) {
                                        str = "\n";
                                    } else {
                                        str = " ";
                                    }
                                    spannableStringBuilder.append((CharSequence) str);
                                }
                                int length2 = spannableStringBuilder.length();
                                int i26 = i25 * 4;
                                spannableStringBuilder.append((CharSequence) t10, i26, Math.min(t10.length(), i26 + 4));
                                if (((i25 / 4) + (i25 % 4)) % 2 == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i13 = w02;
                                } else {
                                    i13 = w03;
                                }
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), length2, spannableStringBuilder.length(), 33);
                            }
                            textView.setText(spannableStringBuilder);
                            linearLayout.addView(textView, w7.b6.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
                        }
                        TextView textView2 = new TextView(e4Var.getContext());
                        textView2.setTextSize(1, 15.0f);
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21038j5, e4Var.I0);
                        org.telegram.messenger.m5.l(textView2, 17, null, 2131750117);
                        linearLayout.addView(textView2, w7.b6.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                        LinearLayout linearLayout2 = new LinearLayout(e4Var.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setGravity(16);
                        int i27 = org.telegram.ui.ActionBar.t6.f21186r5;
                        r52 = 0;
                        e4Var.l1(linearLayout2, 2131232359, 14, i27, org.telegram.messenger.dd.L0(2131745512, null), true);
                        e4Var.l1(linearLayout2, 2131231953, 15, org.telegram.ui.ActionBar.t6.Ci, org.telegram.messenger.dd.L0(2131743220, null), true);
                        e4Var.l1(linearLayout2, 2131231826, 14, i27, org.telegram.messenger.dd.L0(2131743196, null), false);
                        linearLayout.addView(linearLayout2, w7.b6.t(-2, -2, 1, 0, 7, 0, 3));
                        e4Var.f46842p3 = true;
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, e4Var.getContext(), e4Var.I0);
                        int i28 = org.telegram.ui.ActionBar.t6.f21021i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i28, e4Var.I0), 7, org.telegram.messenger.i0.L(12.0f));
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i28);
                        org.telegram.ui.ActionBar.p6 p6Var2 = e4Var.I0;
                        c2Var.setBackground(h02);
                        org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, p6Var2);
                        c2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (org.telegram.messenger.dd.X) {
                            i23 = 5;
                        }
                        layoutParams.gravity = i23 | 16;
                        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        c2Var.e(org.telegram.messenger.dd.L0(2131750147, null), "", true, false, false);
                        if (org.telegram.messenger.dd.X) {
                            i12 = org.telegram.messenger.i0.L(4.0f);
                        } else {
                            i12 = 0;
                        }
                        int L3 = org.telegram.messenger.i0.L(12.0f);
                        if (org.telegram.messenger.dd.X) {
                            L = 0;
                        } else {
                            L = org.telegram.messenger.i0.L(4.0f);
                        }
                        c2Var.setPadding(i12, L3, L, org.telegram.messenger.i0.L(12.0f));
                        c2Var.setOnClickListener(new org.telegram.ui.qv0(29, e4Var, c2Var));
                        linearLayout.addView(c2Var, w7.b6.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
                        alertDialog$Builder3.o(linearLayout);
                        x1Var3.G = 20;
                        alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131750118, null), new org.telegram.ui.ActionBar.u1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i29) {
                                switch (r3) {
                                    case 0:
                                        gf.e h = x1Var4.h(i29, true, true);
                                        mg.i2 i2Var = i2VarArr[0];
                                        Objects.requireNonNull(i2Var);
                                        e4Var.r2(true, x1Var4, h, new mg.w1(i2Var, 11));
                                        return;
                                    default:
                                        gf.e h10 = x1Var4.h(i29, true, true);
                                        mg.i2 i2Var2 = i2VarArr[0];
                                        Objects.requireNonNull(i2Var2);
                                        e4Var.r2(false, x1Var4, h10, new mg.w1(i2Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder3;
                    } else {
                        r52 = 0;
                        LinearLayout linearLayout3 = new LinearLayout(e4Var.getContext());
                        linearLayout3.setOrientation(1);
                        linearLayout3.addView(new rh.d3(e4Var.getContext(), tL_starGiftUnique), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView3 = new TextView(e4Var.getContext());
                        int i29 = org.telegram.ui.ActionBar.t6.f21038j5;
                        org.telegram.messenger.m5.m(textView3, i29, e4Var.I0, 1, 20.0f);
                        textView3.setText(org.telegram.messenger.dd.L0(2131750221, null));
                        linearLayout3.addView(textView3, w7.b6.t(-1, -2, 48, 24, 4, 24, 14));
                        TextView textView4 = new TextView(e4Var.getContext());
                        org.telegram.ui.ActionBar.a7.V(textView4, i29, e4Var.I0);
                        textView4.setTextSize(1, 16.0f);
                        org.telegram.messenger.m5.q(null, null, 2131750222, new Object[]{e4Var.z1()}, textView4);
                        linearLayout3.addView(textView4, w7.b6.t(-1, -2, 48, 24, 0, 24, 4));
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                        alertDialog$Builder4.o(linearLayout3);
                        alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131750223, null), new org.telegram.ui.ActionBar.u1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i292) {
                                switch (r3) {
                                    case 0:
                                        gf.e h = x1Var4.h(i292, true, true);
                                        mg.i2 i2Var = i2VarArr[0];
                                        Objects.requireNonNull(i2Var);
                                        e4Var.r2(true, x1Var4, h, new mg.w1(i2Var, 11));
                                        return;
                                    default:
                                        gf.e h10 = x1Var4.h(i292, true, true);
                                        mg.i2 i2Var2 = i2VarArr[0];
                                        Objects.requireNonNull(i2Var2);
                                        e4Var.r2(false, x1Var4, h10, new mg.w1(i2Var2, 11));
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder = alertDialog$Builder4;
                    }
                    i0.a.s(r52, 2131752589, alertDialog$Builder, r52);
                    return;
                }
                i0.a.w(null, 2131747847, alertDialog$Builder2, null);
                return;
        }
    }

    public h2(rh.e4 e4Var, int i10, int i11, int i12, mg.i2[] i2VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = e4Var;
        this.f26646b = i10;
        this.f26647c = i11;
        this.d = i12;
        this.f26648f = i2VarArr;
        this.f26649g = tL_starGiftUnique;
    }
}
