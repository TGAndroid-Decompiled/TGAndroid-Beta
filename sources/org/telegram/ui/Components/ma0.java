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
public final class ma0 implements View.OnClickListener {
    public final int f36044a;
    public final Object f36045b;

    public ma0(Object obj, int i7) {
        this.f36044a = i7;
        this.f36045b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f36044a;
        Object obj = this.f36045b;
        switch (i10) {
            case 0:
                oa0 oa0Var = (oa0) obj;
                oa0.b(oa0Var.getContext(), oa0Var.f36674a, oa0Var.f36679n, false, oa0Var.f36684y, new gp(oa0Var, 27), oa0Var.f36676c);
                return;
            case 1:
                ((nb0) obj).onBackPressed();
                return;
            case 2:
                nc0.I0((nc0) obj);
                return;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                td0 td0Var = (td0) l4Var.f47458e;
                if (intValue == td0Var.D) {
                    td0Var.N = r5Var.getCurrentColor();
                } else {
                    td0Var.O = r5Var.getCurrentColor();
                }
                sy syVar = td0Var.f38370l0;
                if (syVar != null) {
                    syVar.c(false, false, false);
                }
                td0Var.d();
                return;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ae0) obj).f31777a.D.url)));
                return;
            case 5:
                pe0 pe0Var = (pe0) obj;
                pe0Var.getClass();
                me0 me0Var = (me0) pe0Var;
                ne0 ne0Var = me0Var.f36081e;
                qe0 qe0Var = (qe0) me0Var.getTag(2131296585);
                if (qe0Var.f37300b.size() > 15) {
                    boolean z9 = qe0Var.f37302e;
                    qe0Var.f37302e = !z9;
                    if (!z9) {
                        qe0Var.f37303f = 10;
                    }
                    ne0Var.f36351s.J0(me0Var);
                    ne0Var.f36351s.f37686j1.X(true);
                    return;
                }
                return;
            case 6:
                ((kk0) obj).onBackPressed();
                return;
            case 7:
                el0 el0Var = (el0) ((bi.k5) obj).d;
                Activity activity = el0Var.F;
                org.telegram.ui.ActionBar.f2 f2Var = el0Var.G;
                int i11 = org.telegram.ui.p6.f48638j1;
                if (f2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, activity, false);
                    p6Var.f28656v0 = false;
                    p6Var.f28655u0 = false;
                    int i12 = org.telegram.ui.ActionBar.l6.f27865d6;
                    p6Var.P(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, p6Var.I0), 1, -1));
                    org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.xj, p6Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(2131231309);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    p6Var.dismiss();
                                    return;
                                default:
                                    org.telegram.ui.p6 p6Var2 = p6Var;
                                    p6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f28621a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f26719a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    dv0 dv0Var = new dv0(activity, p6Var.f28621a);
                    dv0Var.setStickerNum(9);
                    dv0Var.getImageReceiver().W(1);
                    linearLayout.addView(dv0Var, c8.ha.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.l6.f27973j5;
                    org.telegram.ui.ActionBar.s6.U(textView, i13, null);
                    jg.g.v(textView, 1, 20.0f, null, 2131751346);
                    linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.s6.U(textView2, i13, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.id.a0("DownloadedFilesMessage", null, 2131751345, new Object[0]));
                    linearLayout.addView(textView2, c8.ha.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.id.M0(2131748697, null));
                    org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.Gi, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.l6.Ci;
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, i14, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i12, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i14);
                    org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i12, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.s6.j(textView3, k02, M, g10, null);
                    linearLayout.addView(textView3, c8.ha.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.id.M0(2131752093, null));
                    org.telegram.ui.ActionBar.s6.U(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.l6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.o6 g11 = org.telegram.ui.ActionBar.s6.g(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.s6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.ha.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p6Var.N = nestedScrollView;
                    textView3.setOnClickListener(new lk(8, p6Var, f2Var));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    p6Var.dismiss();
                                    return;
                                default:
                                    org.telegram.ui.p6 p6Var2 = p6Var;
                                    p6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f28621a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f26719a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    p6Var.show();
                    return;
                }
                return;
            case 8:
                ah.i iVar = ((fl0) obj).d;
                iVar.setText("");
                org.telegram.messenger.g0.K3(iVar);
                return;
            case 9:
                rl0 rl0Var = (rl0) obj;
                rl0Var.getClass();
                new ug.w0(rl0Var.f37734b, 24, true).show();
                return;
            case 10:
                ((gm0) obj).R(false);
                return;
            case 11:
                qo0 qo0Var = (qo0) ((fi.i1) obj).f12172w;
                ArrayList arrayList = qo0Var.f37454s;
                if (!arrayList.isEmpty()) {
                    qo0Var.f37453r = TextUtils.join(" ", arrayList).toString();
                    qo0Var.f37452n = false;
                    qo0Var.d();
                    qo0Var.f37456x = null;
                    if (qo0Var.f37448b != 0) {
                        qo0Var.f37448b = 0;
                        po0 po0Var = qo0Var.H;
                        if (po0Var != null) {
                            ((org.telegram.ui.hu) po0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                zs0 zs0Var = ((lr0) obj).f35829f;
                org.telegram.ui.ActionBar.f2 f2Var2 = zs0Var.f41127x1;
                if (f2Var2 != null && f2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) zs0Var.f41127x1.getParentLayout()).r();
                    return;
                }
                return;
            case 13:
                ((kr0) obj).run();
                return;
            case 14:
                ((cv0) obj).f32766b.getImageReceiver().P0(false);
                return;
            case 15:
                org.telegram.messenger.g0.i3((di.d5) obj, 100L);
                return;
            case 16:
                ((EditTextBoldCursor) obj).setText("");
                return;
            case 17:
                uz0 uz0Var = ((wz0) obj).f40263b;
                uz0Var.setText("");
                org.telegram.messenger.g0.K3(uz0Var);
                return;
            case 18:
                ((f01) obj).f33541b.getImageReceiver().P0(false);
                return;
            case 19:
                ((l21) obj).dismiss();
                return;
            case 20:
                org.telegram.ui.cn cnVar = ((org.telegram.ui.dk) obj).D;
                if (!cnVar.getUserConfig().q() && ((chat = cnVar.f44432e) == null || !chat.autotranslation)) {
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i7).f24764d7.edit();
                    edit.putInt("dialog_show_translate_count" + cnVar.a(), 14).commit();
                    cnVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 13, false));
                } else {
                    org.telegram.messenger.f10 f10Var = cnVar.getMessagesController().f24896s7;
                    long a10 = cnVar.a();
                    f10Var.K(a10, !f10Var.B(a10));
                }
                cnVar.yd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
