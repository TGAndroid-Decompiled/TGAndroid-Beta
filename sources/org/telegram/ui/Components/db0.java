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
public final class db0 implements View.OnClickListener {
    public final int f25458a;
    public final Object f25459b;

    public db0(Object obj, int i10) {
        this.f25458a = i10;
        this.f25459b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        int i11 = this.f25458a;
        Object obj = this.f25459b;
        switch (i11) {
            case 0:
                gb0 gb0Var = (gb0) obj;
                gb0.b(gb0Var.getContext(), gb0Var.f26378a, gb0Var.f26382n, false, gb0Var.f26387y, new eb0(gb0Var, 0), gb0Var.f26380c);
                return;
            case 1:
                ((fc0) obj).onBackPressed();
                return;
            case 2:
                hd0.I0((hd0) obj);
                return;
            case 3:
                fg.j jVar = (fg.j) obj;
                jVar.getClass();
                org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) view;
                int intValue = ((Integer) w5Var.getTag()).intValue();
                oe0 oe0Var = (oe0) jVar.e;
                if (intValue == oe0Var.D) {
                    oe0Var.N = w5Var.getCurrentColor();
                } else {
                    oe0Var.O = w5Var.getCurrentColor();
                }
                gz gzVar = oe0Var.f29112l0;
                if (gzVar != null) {
                    gzVar.c(false, false, false);
                }
                oe0Var.f();
                return;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ue0) obj).f30946a.D.url)));
                return;
            case 5:
                jf0 jf0Var = (jf0) obj;
                PhotoViewer photoViewer = jf0Var.V;
                if (photoViewer != null) {
                    ve0 ve0Var = jf0Var.f27418r;
                    if (ve0Var != null) {
                        if (ve0Var.G) {
                            ve0Var.f();
                        } else {
                            ve0Var.g();
                        }
                    } else {
                        v61 v61Var = photoViewer.F2;
                        if (v61Var != null) {
                            if (v61Var.d0()) {
                                v61Var.g0();
                            } else {
                                v61Var.h0();
                            }
                        } else {
                            return;
                        }
                    }
                    jf0.f27400p0.z();
                    return;
                }
                return;
            case 6:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                of0 of0Var = (of0) rf0Var;
                pf0 pf0Var = of0Var.e;
                sf0 sf0Var = (sf0) of0Var.getTag(2131296585);
                if (sf0Var.f30280b.size() > 15) {
                    boolean z10 = sf0Var.e;
                    sf0Var.e = !z10;
                    if (!z10) {
                        sf0Var.f30282f = 10;
                    }
                    pf0Var.f29419s.J0(of0Var);
                    pf0Var.f29419s.f30636j1.X(true);
                    return;
                }
                return;
            case 7:
                ((ol0) obj).onBackPressed();
                return;
            case 8:
                hm0 hm0Var = (hm0) ((kg.f) obj).d;
                Activity activity = hm0Var.F;
                org.telegram.ui.ActionBar.k2 k2Var = hm0Var.G;
                int i12 = org.telegram.ui.p6.f40374j1;
                if (k2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, activity, false);
                    p6Var.f21618v0 = false;
                    p6Var.f21617u0 = false;
                    int i13 = org.telegram.ui.ActionBar.t6.f20930d6;
                    p6Var.Q(i13);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var.I0), 1, -1));
                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.xj, p6Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(2131231310);
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
                                    org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(p6Var2.f21584a);
                                    q6.H.clear();
                                    q6.getNotificationCenter().k(304, new Object[0]);
                                    q6.getMessagesStorage().f16331a.c(new org.telegram.messenger.y5(q6, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.i0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, w7.b6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    fw0 fw0Var = new fw0(activity, p6Var.f21584a);
                    fw0Var.setStickerNum(9);
                    fw0Var.getImageReceiver().W(1);
                    linearLayout.addView(fw0Var, w7.b6.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i14 = org.telegram.ui.ActionBar.t6.f21038j5;
                    org.telegram.ui.ActionBar.a7.V(textView, i14, null);
                    sc.e.u(textView, 1, 20.0f, null, 2131751347);
                    linearLayout.addView(textView, w7.b6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView2, i14, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.dd.a0("DownloadedFilesMessage", null, 2131751346, new Object[0]));
                    linearLayout.addView(textView2, w7.b6.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.i0.o());
                    textView3.setText(org.telegram.messenger.dd.L0(2131748712, null));
                    org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Gi, null);
                    int L2 = org.telegram.messenger.i0.L(8.0f);
                    int i15 = org.telegram.ui.ActionBar.t6.Ci;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
                    int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, x02, o10, o10);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                    org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i13, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.a7.k(textView3, k02, N, h, null);
                    linearLayout.addView(textView3, w7.b6.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.i0.o());
                    textView4.setText(org.telegram.messenger.dd.L0(2131752093, null));
                    org.telegram.ui.ActionBar.a7.V(textView4, i15, null);
                    int L3 = org.telegram.messenger.i0.L(8.0f);
                    int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i15, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o11, o11);
                    org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i15, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.a7.k(textView4, k03, null, h10, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, w7.b6.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p6Var.N = nestedScrollView;
                    textView3.setOnClickListener(new sr(1, p6Var, k2Var));
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
                                    org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(p6Var2.f21584a);
                                    q6.H.clear();
                                    q6.getNotificationCenter().k(304, new Object[0]);
                                    q6.getMessagesStorage().f16331a.c(new org.telegram.messenger.y5(q6, 2));
                                    return;
                            }
                        }
                    });
                    p6Var.show();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.n0 n0Var = ((im0) obj).d;
                n0Var.setText("");
                org.telegram.messenger.i0.J3(n0Var);
                return;
            case 10:
                sm0 sm0Var = (sm0) obj;
                sm0Var.getClass();
                new kg.i1(sm0Var.f30336b, 24, true).show();
                return;
            case 11:
                ((hn0) obj).R(false);
                return;
            case 12:
                tp0 tp0Var = (tp0) ((rp0) obj).f30063w;
                ArrayList arrayList = tp0Var.f30696s;
                if (!arrayList.isEmpty()) {
                    tp0Var.f30695r = TextUtils.join(" ", arrayList).toString();
                    tp0Var.f30694n = false;
                    tp0Var.d();
                    tp0Var.f30698x = null;
                    if (tp0Var.f30691b != 0) {
                        tp0Var.f30691b = 0;
                        sp0 sp0Var = tp0Var.H;
                        if (sp0Var != null) {
                            ((org.telegram.ui.hv) sp0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                au0 au0Var = ((ks0) obj).f27954f;
                org.telegram.ui.ActionBar.k2 k2Var2 = au0Var.f24568x1;
                if (k2Var2 != null && k2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) au0Var.f24568x1.getParentLayout()).r();
                    return;
                }
                return;
            case 14:
                ((vo0) obj).run();
                return;
            case 15:
                ((ew0) obj).f25947b.getImageReceiver().P0(false);
                return;
            case 16:
                org.telegram.messenger.i0.h3((th.r3) obj, 100L);
                return;
            case 17:
                ((EditTextBoldCursor) obj).setText("");
                return;
            case 18:
                y01 y01Var = ((a11) obj).f24267b;
                y01Var.setText("");
                org.telegram.messenger.i0.J3(y01Var);
                return;
            case 19:
                ((k11) obj).f27694b.getImageReceiver().P0(false);
                return;
            case 20:
                ((n31) obj).dismiss();
                return;
            case 21:
                org.telegram.ui.un unVar = ((org.telegram.ui.xk) obj).D;
                if (!unVar.getUserConfig().q() && ((chat = unVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(i10).e7.edit();
                    edit.putInt("dialog_show_translate_count" + unVar.a(), 14).commit();
                    unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 13, false));
                } else {
                    org.telegram.messenger.u10 u10Var = unVar.getMessagesController().f19253t7;
                    long a2 = unVar.a();
                    u10Var.K(a2, !u10Var.B(a2));
                }
                unVar.qd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
