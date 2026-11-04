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
import org.telegram.ui.PhotoViewer;
public final class ga0 implements View.OnClickListener {
    public final int f34030a;
    public final Object f34031b;

    public ga0(Object obj, int i3) {
        this.f34030a = i3;
        this.f34031b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i3;
        int i10 = this.f34030a;
        Object obj = this.f34031b;
        switch (i10) {
            case 0:
                ia0 ia0Var = (ia0) obj;
                ia0.b(ia0Var.getContext(), ia0Var.f34639a, ia0Var.f34644n, false, ia0Var.f34649y, new gp(ia0Var, 27), ia0Var.f34641c);
                return;
            case 1:
                ((hb0) obj).onBackPressed();
                return;
            case 2:
                hc0.I0((hc0) obj);
                return;
            case 3:
                org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) obj;
                n4Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                nd0 nd0Var = (nd0) n4Var.f47865e;
                if (intValue == nd0Var.E) {
                    nd0Var.O = r5Var.getCurrentColor();
                } else {
                    nd0Var.P = r5Var.getCurrentColor();
                }
                py pyVar = nd0Var.m0;
                if (pyVar != null) {
                    pyVar.c(false, false, false);
                }
                nd0Var.d();
                return;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((td0) obj).f38396a.E.url)));
                return;
            case 5:
                ie0 ie0Var = (ie0) obj;
                PhotoViewer photoViewer = ie0Var.W;
                if (photoViewer != null) {
                    ud0 ud0Var = ie0Var.f34703r;
                    if (ud0Var != null) {
                        if (ud0Var.H) {
                            ud0Var.f();
                        } else {
                            ud0Var.g();
                        }
                    } else {
                        m51 m51Var = photoViewer.G2;
                        if (m51Var != null) {
                            if (m51Var.d0()) {
                                m51Var.g0();
                            } else {
                                m51Var.h0();
                            }
                        } else {
                            return;
                        }
                    }
                    ie0.f34683q0.z();
                    return;
                }
                return;
            case 6:
                qe0 qe0Var = (qe0) obj;
                qe0Var.getClass();
                ne0 ne0Var = (ne0) qe0Var;
                oe0 oe0Var = ne0Var.f36496e;
                re0 re0Var = (re0) ne0Var.getTag(2131296585);
                if (re0Var.f37713b.size() > 15) {
                    boolean z10 = re0Var.f37715e;
                    re0Var.f37715e = !z10;
                    if (!z10) {
                        re0Var.f37716f = 10;
                    }
                    oe0Var.f36817s.J0(ne0Var);
                    oe0Var.f36817s.k1.X(true);
                    return;
                }
                return;
            case 7:
                ((nk0) obj).onBackPressed();
                return;
            case 8:
                hl0 hl0Var = (hl0) ((ci.r4) obj).d;
                Activity activity = hl0Var.G;
                org.telegram.ui.ActionBar.d2 d2Var = hl0Var.H;
                int i11 = org.telegram.ui.q6.k1;
                if (d2Var != null && activity != null) {
                    final org.telegram.ui.q6 q6Var = new org.telegram.ui.q6(1, activity, false);
                    q6Var.f28621w0 = false;
                    q6Var.f28619v0 = false;
                    int i12 = org.telegram.ui.ActionBar.k6.f27878d6;
                    q6Var.P(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, q6Var.J0), 1, -1));
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, q6Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(2131231309);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    q6Var.dismiss();
                                    return;
                                default:
                                    org.telegram.ui.q6 q6Var2 = q6Var;
                                    q6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(q6Var2.f28583a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f24934a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, b8.mf.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    av0 av0Var = new av0(activity, q6Var.f28583a);
                    av0Var.setStickerNum(9);
                    av0Var.getImageReceiver().W(1);
                    linearLayout.addView(av0Var, b8.mf.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.k6.f27988j5;
                    org.telegram.ui.ActionBar.r6.V(textView, i13, null);
                    k2.p1.u(textView, 1, 20.0f, null, 2131751347);
                    linearLayout.addView(textView, b8.mf.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.bd.a0("DownloadedFilesMessage", null, 2131751346, new Object[0]));
                    linearLayout.addView(textView2, b8.mf.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.bd.M0(2131748705, null));
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.k6.Ci;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, x02, o10, o10);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                    org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(textView3, k02, N, h, null);
                    linearLayout.addView(textView3, b8.mf.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.bd.M0(2131752093, null));
                    org.telegram.ui.ActionBar.r6.V(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o11, o11);
                    org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.r6.k(textView4, k03, null, h7, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, b8.mf.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    q6Var.O = nestedScrollView;
                    textView3.setOnClickListener(new q2(14, q6Var, d2Var));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    q6Var.dismiss();
                                    return;
                                default:
                                    org.telegram.ui.q6 q6Var2 = q6Var;
                                    q6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(q6Var2.f28583a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f24934a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    q6Var.show();
                    return;
                }
                return;
            case 9:
                bh.g gVar = ((il0) obj).d;
                gVar.setText("");
                org.telegram.messenger.g0.K3(gVar);
                return;
            case 10:
                tl0 tl0Var = (tl0) obj;
                tl0Var.getClass();
                new vg.v0(tl0Var.f38486b, 24, true).show();
                return;
            case 11:
                ((im0) obj).R(false);
                return;
            case 12:
                ro0 ro0Var = (ro0) ((gi.i1) obj).f12949w;
                ArrayList arrayList = ro0Var.f37770s;
                if (!arrayList.isEmpty()) {
                    ro0Var.f37769r = TextUtils.join(" ", arrayList).toString();
                    ro0Var.f37768n = false;
                    ro0Var.d();
                    ro0Var.f37772x = null;
                    if (ro0Var.f37764b != 0) {
                        ro0Var.f37764b = 0;
                        qo0 qo0Var = ro0Var.I;
                        if (qo0Var != null) {
                            ((org.telegram.ui.du) qo0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ws0 ws0Var = ((ir0) obj).f34804f;
                org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var.f40142y1;
                if (d2Var2 != null && d2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) ws0Var.f40142y1.getParentLayout()).r();
                    return;
                }
                return;
            case 14:
                ((sp0) obj).run();
                return;
            case 15:
                ((zu0) obj).f41126b.getImageReceiver().P0(false);
                return;
            case 16:
                org.telegram.messenger.g0.i3((ei.c5) obj, 100L);
                return;
            case 17:
                ((EditTextBoldCursor) obj).setText("");
                return;
            case 18:
                sz0 sz0Var = ((uz0) obj).f38914b;
                sz0Var.setText("");
                org.telegram.messenger.g0.K3(sz0Var);
                return;
            case 19:
                ((d01) obj).f32883b.getImageReceiver().P0(false);
                return;
            case 20:
                ((f21) obj).dismiss();
                return;
            case 21:
                org.telegram.ui.wm wmVar = ((org.telegram.ui.xj) obj).E;
                if (!wmVar.getUserConfig().q() && ((chat = wmVar.f51292e) == null || !chat.autotranslation)) {
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i3).f22989d7.edit();
                    edit.putInt("dialog_show_translate_count" + wmVar.a(), 14).commit();
                    wmVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 13, false));
                } else {
                    org.telegram.messenger.x00 x00Var = wmVar.getMessagesController().f23120s7;
                    long a10 = wmVar.a();
                    x00Var.K(a10, !x00Var.B(a10));
                }
                wmVar.vd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
