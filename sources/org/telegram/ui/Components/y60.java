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
public final class y60 implements View.OnClickListener {
    public final int f41884a;
    public final Object f41885b;

    public y60(Object obj, int i7) {
        this.f41884a = i7;
        this.f41885b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f41884a;
        Object obj = this.f41885b;
        switch (i10) {
            case 0:
                ((e70) obj).dismiss();
                return;
            case 1:
                oa0 oa0Var = (oa0) obj;
                oa0.b(oa0Var.getContext(), oa0Var.f37896a, oa0Var.f37901n, false, oa0Var.f37906y, new fo(oa0Var, 29), oa0Var.f37898c);
                return;
            case 2:
                ((nb0) obj).onBackPressed();
                return;
            case 3:
                nc0.I0((nc0) obj);
                return;
            case 4:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                td0 td0Var = (td0) l4Var.f48823e;
                if (intValue == td0Var.E) {
                    td0Var.O = r5Var.getCurrentColor();
                } else {
                    td0Var.P = r5Var.getCurrentColor();
                }
                wy wyVar = td0Var.m0;
                if (wyVar != null) {
                    wyVar.c(false, false, false);
                }
                td0Var.e();
                return;
            case 5:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((zd0) obj).f42342a.E.url)));
                return;
            case 6:
                re0 re0Var = (re0) obj;
                re0Var.getClass();
                oe0 oe0Var = (oe0) re0Var;
                pe0 pe0Var = oe0Var.f37932e;
                se0 se0Var = (se0) oe0Var.getTag(2131296585);
                if (se0Var.f39292b.size() > 15) {
                    boolean z10 = se0Var.f39294e;
                    se0Var.f39294e = !z10;
                    if (!z10) {
                        se0Var.f39295f = 10;
                    }
                    pe0Var.f38294s.J0(oe0Var);
                    pe0Var.f38294s.n1.X(true);
                    return;
                }
                return;
            case 7:
                ((ok0) obj).onBackPressed();
                return;
            case 8:
                il0 il0Var = (il0) ((di.i4) obj).d;
                Activity activity = il0Var.G;
                org.telegram.ui.ActionBar.e2 e2Var = il0Var.H;
                int i11 = org.telegram.ui.p6.n1;
                if (e2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, activity, false);
                    p6Var.f29720w0 = false;
                    p6Var.f29718v0 = false;
                    int i12 = org.telegram.ui.ActionBar.j6.f28849d6;
                    p6Var.Q(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, p6Var.J0), 1, -1));
                    org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Aj, p6Var.J0, PorterDuff.Mode.SRC_ATOP);
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
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f29679a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f27219a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ja.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    dv0 dv0Var = new dv0(activity, p6Var.f29679a);
                    dv0Var.setStickerNum(9);
                    dv0Var.getImageReceiver().W(1);
                    linearLayout.addView(dv0Var, c8.ja.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.j6.f28957j5;
                    org.telegram.ui.ActionBar.q6.U(textView, i13, null);
                    i5.c.w(textView, 1, 20.0f, null, 2131751346);
                    linearLayout.addView(textView, c8.ja.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.q6.U(textView2, i13, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.hd.a0("DownloadedFilesMessage", null, 2131751345, new Object[0]));
                    linearLayout.addView(textView2, c8.ja.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.hd.M0(2131748697, null));
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.Ji, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.j6.Fi;
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, i14, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i12, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                    org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i12, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.q6.j(textView3, k02, M, g10, null);
                    linearLayout.addView(textView3, c8.ja.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.hd.M0(2131752093, null));
                    org.telegram.ui.ActionBar.q6.U(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.j6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.m6 g11 = org.telegram.ui.ActionBar.q6.g(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.q6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.ja.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p6Var.O = nestedScrollView;
                    textView3.setOnClickListener(new n2(15, p6Var, e2Var));
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
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f29679a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f27219a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    p6Var.show();
                    return;
                }
                return;
            case 9:
                ah.i iVar = ((jl0) obj).d;
                iVar.setText("");
                org.telegram.messenger.g0.J3(iVar);
                return;
            case 10:
                ul0 ul0Var = (ul0) obj;
                ul0Var.getClass();
                new ug.x0(ul0Var.f40097b, 24, true).show();
                return;
            case 11:
                ((jm0) obj).Q(false);
                return;
            case 12:
                to0 to0Var = (to0) ((hi.k1) obj).f14496w;
                ArrayList arrayList = to0Var.f39760s;
                if (!arrayList.isEmpty()) {
                    to0Var.f39759r = TextUtils.join(" ", arrayList).toString();
                    to0Var.f39758n = false;
                    to0Var.d();
                    to0Var.f39762x = null;
                    if (to0Var.f39754b != 0) {
                        to0Var.f39754b = 0;
                        so0 so0Var = to0Var.I;
                        if (so0Var != null) {
                            ((org.telegram.ui.hu) so0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ys0 ys0Var = ((kr0) obj).f36582f;
                org.telegram.ui.ActionBar.e2 e2Var2 = ys0Var.f42152y1;
                if (e2Var2 != null && e2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) ys0Var.f42152y1.getParentLayout()).r();
                    return;
                }
                return;
            case 14:
                ((ro0) obj).run();
                return;
            case 15:
                ((cv0) obj).f33707b.getImageReceiver().P0(false);
                return;
            case 16:
                org.telegram.messenger.g0.i3((fi.u4) obj, 100L);
                return;
            case 17:
                ((EditTextBoldCursor) obj).setText("");
                return;
            case 18:
                vz0 vz0Var = ((xz0) obj).f41808b;
                vz0Var.setText("");
                org.telegram.messenger.g0.J3(vz0Var);
                return;
            case 19:
                ((g01) obj).f34771b.getImageReceiver().P0(false);
                return;
            case 20:
                ((p21) obj).dismiss();
                return;
            case 21:
                org.telegram.ui.an anVar = ((org.telegram.ui.bk) obj).E;
                if (!anVar.getUserConfig().q() && ((chat = anVar.f45172e) == null || !chat.autotranslation)) {
                    i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i7).f25273e7.edit();
                    edit.putInt("dialog_show_translate_count" + anVar.a(), 14).commit();
                    anVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar, 13, false));
                } else {
                    org.telegram.messenger.c10 c10Var = anVar.getMessagesController().f25403t7;
                    long a10 = anVar.a();
                    c10Var.K(a10, !c10Var.B(a10));
                }
                anVar.zd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
