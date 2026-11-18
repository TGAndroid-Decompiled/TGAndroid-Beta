package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class h70 implements View.OnClickListener {
    public final int f35787a;
    public final Object f35788b;

    public h70(Object obj, int i7) {
        this.f35787a = i7;
        this.f35788b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f35787a;
        Object obj = this.f35788b;
        switch (i10) {
            case 0:
                j70 j70Var = (j70) obj;
                j70Var.f36377m1 = true;
                j70Var.dismiss();
                return;
            case 1:
                ((p70) obj).dismiss();
                return;
            case 2:
                ya0 ya0Var = (ya0) obj;
                ya0.b(ya0Var.getContext(), ya0Var.f42435a, ya0Var.f42440n, false, ya0Var.f42445y, new mo(ya0Var, 29), ya0Var.f42437c);
                return;
            case 3:
                ((yb0) obj).onBackPressed();
                return;
            case 4:
                xc0.J0((xc0) obj);
                return;
            case 5:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                de0 de0Var = (de0) l4Var.f49432e;
                if (intValue == de0Var.E) {
                    de0Var.O = t5Var.getCurrentColor();
                } else {
                    de0Var.P = t5Var.getCurrentColor();
                }
                cz czVar = de0Var.m0;
                if (czVar != null) {
                    czVar.c(false, false, false);
                }
                de0Var.d();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((je0) obj).f36422a.E.url)));
                return;
            case 7:
                bf0 bf0Var = (bf0) obj;
                bf0Var.getClass();
                ye0 ye0Var = (ye0) bf0Var;
                ze0 ze0Var = ye0Var.f42483e;
                cf0 cf0Var = (cf0) ye0Var.getTag(2131296585);
                if (cf0Var.f33987b.size() > 15) {
                    boolean z10 = cf0Var.f33989e;
                    cf0Var.f33989e = !z10;
                    if (!z10) {
                        cf0Var.f33990f = 10;
                    }
                    ze0Var.f42881s.K0(ye0Var);
                    ze0Var.f42881s.n1.X(true);
                    return;
                }
                return;
            case 8:
                ((wk0) obj).onBackPressed();
                return;
            case 9:
                ql0 ql0Var = (ql0) ((di.l4) obj).d;
                Activity activity = ql0Var.G;
                org.telegram.ui.ActionBar.h2 h2Var = ql0Var.H;
                int i11 = org.telegram.ui.o6.n1;
                if (h2Var != null && activity != null) {
                    final org.telegram.ui.o6 o6Var = new org.telegram.ui.o6(1, activity, false);
                    o6Var.f30228w0 = false;
                    o6Var.f30226v0 = false;
                    int i12 = org.telegram.ui.ActionBar.n6.f29394d6;
                    o6Var.Q(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29486i6, o6Var.J0), 1, -1));
                    org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Aj, o6Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(2131231309);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    o6Var.dismiss();
                                    return;
                                default:
                                    org.telegram.ui.o6 o6Var2 = o6Var;
                                    o6Var2.dismiss();
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(o6Var2.f30187a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(307, new Object[0]);
                                    q10.getMessagesStorage().f27052a.c(new org.telegram.messenger.x5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ma.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    lv0 lv0Var = new lv0(activity, o6Var.f30187a);
                    lv0Var.setStickerNum(9);
                    lv0Var.getImageReceiver().W(1);
                    linearLayout.addView(lv0Var, c8.ma.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.n6.f29502j5;
                    org.telegram.ui.ActionBar.u6.U(textView, i13, null);
                    i5.c.r(20.0f, 1, 2131751335, textView, null);
                    linearLayout.addView(textView, c8.ma.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(textView2, i13, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.gd.a0("DownloadedFilesMessage", null, 2131751334, new Object[0]));
                    linearLayout.addView(textView2, c8.ma.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.gd.M0(2131748505, null));
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.n6.Fi;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                    org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i12, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.u6.j(textView3, k02, M, g10, null);
                    linearLayout.addView(textView3, c8.ma.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.gd.M0(2131752082, null));
                    org.telegram.ui.ActionBar.u6.U(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.u6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.ma.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    o6Var.O = nestedScrollView;
                    textView3.setOnClickListener(new y7(11, o6Var, h2Var));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    o6Var.dismiss();
                                    return;
                                default:
                                    org.telegram.ui.o6 o6Var2 = o6Var;
                                    o6Var2.dismiss();
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(o6Var2.f30187a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(307, new Object[0]);
                                    q10.getMessagesStorage().f27052a.c(new org.telegram.messenger.x5(q10, 2));
                                    return;
                            }
                        }
                    });
                    o6Var.show();
                    return;
                }
                return;
            case 10:
                ah.i iVar = ((rl0) obj).d;
                iVar.setText("");
                org.telegram.messenger.g0.I3(iVar);
                return;
            case 11:
                cm0 cm0Var = (cm0) obj;
                cm0Var.getClass();
                new ug.z0(cm0Var.f34104b, 24, true).show();
                return;
            case 12:
                ((rm0) obj).N(false);
                return;
            case 13:
                cp0 cp0Var = (cp0) ((hi.k1) obj).f14856w;
                ArrayList arrayList = cp0Var.f34155s;
                if (!arrayList.isEmpty()) {
                    cp0Var.f34154r = TextUtils.join(" ", arrayList).toString();
                    cp0Var.f34153n = false;
                    cp0Var.d();
                    cp0Var.f34157x = null;
                    if (cp0Var.f34149b != 0) {
                        cp0Var.f34149b = 0;
                        bp0 bp0Var = cp0Var.I;
                        if (bp0Var != null) {
                            ((org.telegram.ui.ju) bp0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                gt0 gt0Var = ((sr0) obj).f39833f;
                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var.f35642y1;
                if (h2Var2 != null && h2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) gt0Var.f35642y1.getParentLayout()).r();
                    return;
                }
                return;
            case 15:
                ((ap0) obj).run();
                return;
            case 16:
                ((kv0) obj).f36894b.getImageReceiver().P0(false);
                return;
            case 17:
                org.telegram.messenger.g0.h3((fi.s4) obj, 100L);
                return;
            case 18:
                c01 c01Var = ((e01) obj).f34556b;
                c01Var.setText("");
                org.telegram.messenger.g0.I3(c01Var);
                return;
            case 19:
                ((o01) obj).f37921b.getImageReceiver().P0(false);
                return;
            case 20:
                ((y21) obj).dismiss();
                return;
            case 21:
                org.telegram.ui.bn bnVar = ((org.telegram.ui.ck) obj).E;
                if (!bnVar.getUserConfig().q() && ((chat = bnVar.f45978e) == null || !chat.autotranslation)) {
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).f25658g7.edit();
                    edit.putInt("dialog_show_translate_count" + bnVar.a(), 14).commit();
                    bnVar.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) bnVar, 13, false));
                } else {
                    org.telegram.messenger.z00 z00Var = bnVar.getMessagesController().f25787v7;
                    long a10 = bnVar.a();
                    z00Var.K(a10, !z00Var.B(a10));
                }
                bnVar.zd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
