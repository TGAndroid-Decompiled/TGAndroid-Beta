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
public final class la0 implements View.OnClickListener {
    public final int f35628a;
    public final Object f35629b;

    public la0(Object obj, int i7) {
        this.f35628a = i7;
        this.f35629b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f35628a;
        Object obj = this.f35629b;
        switch (i10) {
            case 0:
                na0 na0Var = (na0) obj;
                na0.b(na0Var.getContext(), na0Var.f36264a, na0Var.f36269n, false, na0Var.f36274y, new gp(na0Var, 27), na0Var.f36266c);
                return;
            case 1:
                ((mb0) obj).onBackPressed();
                return;
            case 2:
                mc0.I0((mc0) obj);
                return;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                sd0 sd0Var = (sd0) l4Var.f47512e;
                if (intValue == sd0Var.D) {
                    sd0Var.N = r5Var.getCurrentColor();
                } else {
                    sd0Var.O = r5Var.getCurrentColor();
                }
                ry ryVar = sd0Var.f37944l0;
                if (ryVar != null) {
                    ryVar.c(false, false, false);
                }
                sd0Var.d();
                return;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((zd0) obj).f40919a.D.url)));
                return;
            case 5:
                oe0 oe0Var = (oe0) obj;
                oe0Var.getClass();
                le0 le0Var = (le0) oe0Var;
                me0 me0Var = le0Var.f35665e;
                pe0 pe0Var = (pe0) le0Var.getTag(2131296585);
                if (pe0Var.f36899b.size() > 15) {
                    boolean z9 = pe0Var.f36901e;
                    pe0Var.f36901e = !z9;
                    if (!z9) {
                        pe0Var.f36902f = 10;
                    }
                    me0Var.f35948s.J0(le0Var);
                    me0Var.f35948s.f37276m1.X(true);
                    return;
                }
                return;
            case 6:
                ((jk0) obj).onBackPressed();
                return;
            case 7:
                dl0 dl0Var = (dl0) ((bi.k5) obj).d;
                Activity activity = dl0Var.F;
                org.telegram.ui.ActionBar.f2 f2Var = dl0Var.G;
                int i11 = org.telegram.ui.p6.f48670m1;
                if (f2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, activity, false);
                    p6Var.f28707v0 = false;
                    p6Var.f28706u0 = false;
                    int i12 = org.telegram.ui.ActionBar.m6.f27890d6;
                    p6Var.P(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, p6Var.I0), 1, -1));
                    org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.xj, p6Var.I0, PorterDuff.Mode.SRC_ATOP);
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
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f28669a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f26723a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    cv0 cv0Var = new cv0(activity, p6Var.f28669a);
                    cv0Var.setStickerNum(9);
                    cv0Var.getImageReceiver().W(1);
                    linearLayout.addView(cv0Var, c8.ha.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.m6.f27998j5;
                    org.telegram.ui.ActionBar.t6.U(textView, i13, null);
                    jg.g.v(textView, 1, 20.0f, null, 2131751346);
                    linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView2, i13, null);
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
                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Gi, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.m6.Ci;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                    org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i12, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.t6.j(textView3, k02, M, g10, null);
                    linearLayout.addView(textView3, c8.ha.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.id.M0(2131752093, null));
                    org.telegram.ui.ActionBar.t6.U(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.p6 g11 = org.telegram.ui.ActionBar.t6.g(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.t6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.ha.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p6Var.N = nestedScrollView;
                    textView3.setOnClickListener(new kk(8, p6Var, f2Var));
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
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f28669a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f26723a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    p6Var.show();
                    return;
                }
                return;
            case 8:
                ah.i iVar = ((el0) obj).d;
                iVar.setText("");
                org.telegram.messenger.g0.K3(iVar);
                return;
            case 9:
                ql0 ql0Var = (ql0) obj;
                ql0Var.getClass();
                new ug.w0(ql0Var.f37322b, 24, true).show();
                return;
            case 10:
                ((fm0) obj).R(false);
                return;
            case 11:
                po0 po0Var = (po0) ((fi.i1) obj).f12176w;
                ArrayList arrayList = po0Var.f37053s;
                if (!arrayList.isEmpty()) {
                    po0Var.f37052r = TextUtils.join(" ", arrayList).toString();
                    po0Var.f37051n = false;
                    po0Var.d();
                    po0Var.f37055x = null;
                    if (po0Var.f37047b != 0) {
                        po0Var.f37047b = 0;
                        oo0 oo0Var = po0Var.H;
                        if (oo0Var != null) {
                            ((org.telegram.ui.iu) oo0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ys0 ys0Var = ((kr0) obj).f35421f;
                org.telegram.ui.ActionBar.f2 f2Var2 = ys0Var.f40719x1;
                if (f2Var2 != null && f2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) ys0Var.f40719x1.getParentLayout()).r();
                    return;
                }
                return;
            case 13:
                ((jr0) obj).run();
                return;
            case 14:
                ((bv0) obj).f32366b.getImageReceiver().P0(false);
                return;
            case 15:
                org.telegram.messenger.g0.i3((di.d5) obj, 100L);
                return;
            case 16:
                ((EditTextBoldCursor) obj).setText("");
                return;
            case 17:
                tz0 tz0Var = ((vz0) obj).f39847b;
                tz0Var.setText("");
                org.telegram.messenger.g0.K3(tz0Var);
                return;
            case 18:
                ((e01) obj).f33121b.getImageReceiver().P0(false);
                return;
            case 19:
                ((k21) obj).dismiss();
                return;
            case 20:
                org.telegram.ui.cn cnVar = ((org.telegram.ui.dk) obj).D;
                if (!cnVar.getUserConfig().q() && ((chat = cnVar.f44473e) == null || !chat.autotranslation)) {
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i7).f24768d7.edit();
                    edit.putInt("dialog_show_translate_count" + cnVar.a(), 14).commit();
                    cnVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 13, false));
                } else {
                    org.telegram.messenger.f10 f10Var = cnVar.getMessagesController().f24900s7;
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
