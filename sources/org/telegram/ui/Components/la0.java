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
    public final int f35587a;
    public final Object f35588b;

    public la0(Object obj, int i7) {
        this.f35587a = i7;
        this.f35588b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f35587a;
        Object obj = this.f35588b;
        switch (i10) {
            case 0:
                na0 na0Var = (na0) obj;
                na0.b(na0Var.getContext(), na0Var.f36236a, na0Var.f36241n, false, na0Var.f36246y, new gp(na0Var, 27), na0Var.f36238c);
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
                sd0 sd0Var = (sd0) l4Var.f47406e;
                if (intValue == sd0Var.D) {
                    sd0Var.N = r5Var.getCurrentColor();
                } else {
                    sd0Var.O = r5Var.getCurrentColor();
                }
                ry ryVar = sd0Var.f38001l0;
                if (ryVar != null) {
                    ryVar.c(false, false, false);
                }
                sd0Var.d();
                return;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((zd0) obj).f40917a.D.url)));
                return;
            case 5:
                oe0 oe0Var = (oe0) obj;
                oe0Var.getClass();
                le0 le0Var = (le0) oe0Var;
                me0 me0Var = le0Var.f35645e;
                pe0 pe0Var = (pe0) le0Var.getTag(2131296585);
                if (pe0Var.f36870b.size() > 15) {
                    boolean z9 = pe0Var.f36872e;
                    pe0Var.f36872e = !z9;
                    if (!z9) {
                        pe0Var.f36873f = 10;
                    }
                    me0Var.f35933s.J0(le0Var);
                    me0Var.f35933s.f37275j1.X(true);
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
                int i11 = org.telegram.ui.p6.f48660j1;
                if (f2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, activity, false);
                    p6Var.f28647v0 = false;
                    p6Var.f28646u0 = false;
                    int i12 = org.telegram.ui.ActionBar.k6.f27848d6;
                    p6Var.P(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, p6Var.I0), 1, -1));
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, p6Var.I0, PorterDuff.Mode.SRC_ATOP);
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
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f28612a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f26688a.c(new org.telegram.messenger.w5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    bv0 bv0Var = new bv0(activity, p6Var.f28612a);
                    bv0Var.setStickerNum(9);
                    bv0Var.getImageReceiver().W(1);
                    linearLayout.addView(bv0Var, c8.ha.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.k6.f27956j5;
                    org.telegram.ui.ActionBar.r6.V(textView, i13, null);
                    jg.g.v(textView, 1, 20.0f, null, 2131751347);
                    linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.hd.a0("DownloadedFilesMessage", null, 2131751346, new Object[0]));
                    linearLayout.addView(textView2, c8.ha.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.hd.M0(2131748696, null));
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.k6.Ci;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                    org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(textView3, k02, N, h, null);
                    linearLayout.addView(textView3, c8.ha.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.hd.M0(2131752093, null));
                    org.telegram.ui.ActionBar.r6.V(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.r6.k(textView4, k03, null, h7, null);
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
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.f28612a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(304, new Object[0]);
                                    q10.getMessagesStorage().f26688a.c(new org.telegram.messenger.w5(q10, 2));
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
                new ug.w0(ql0Var.f37333b, 24, true).show();
                return;
            case 10:
                ((fm0) obj).R(false);
                return;
            case 11:
                po0 po0Var = (po0) ((fi.i1) obj).f12169w;
                ArrayList arrayList = po0Var.f37021s;
                if (!arrayList.isEmpty()) {
                    po0Var.f37020r = TextUtils.join(" ", arrayList).toString();
                    po0Var.f37019n = false;
                    po0Var.d();
                    po0Var.f37023x = null;
                    if (po0Var.f37015b != 0) {
                        po0Var.f37015b = 0;
                        oo0 oo0Var = po0Var.H;
                        if (oo0Var != null) {
                            ((org.telegram.ui.fu) oo0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                xs0 xs0Var = ((jr0) obj).f35023f;
                org.telegram.ui.ActionBar.f2 f2Var2 = xs0Var.f40424x1;
                if (f2Var2 != null && f2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) xs0Var.f40424x1.getParentLayout()).r();
                    return;
                }
                return;
            case 13:
                ((ir0) obj).run();
                return;
            case 14:
                ((av0) obj).f31927b.getImageReceiver().P0(false);
                return;
            case 15:
                org.telegram.messenger.g0.i3((di.c5) obj, 100L);
                return;
            case 16:
                ((EditTextBoldCursor) obj).setText("");
                return;
            case 17:
                sz0 sz0Var = ((uz0) obj).f38766b;
                sz0Var.setText("");
                org.telegram.messenger.g0.K3(sz0Var);
                return;
            case 18:
                ((d01) obj).f32740b.getImageReceiver().P0(false);
                return;
            case 19:
                ((j21) obj).dismiss();
                return;
            case 20:
                org.telegram.ui.an anVar = ((org.telegram.ui.bk) obj).D;
                if (!anVar.getUserConfig().q() && ((chat = anVar.f43772e) == null || !chat.autotranslation)) {
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i7).f24749d7.edit();
                    edit.putInt("dialog_show_translate_count" + anVar.a(), 14).commit();
                    anVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 13, false));
                } else {
                    org.telegram.messenger.f10 f10Var = anVar.getMessagesController().f24881s7;
                    long a10 = anVar.a();
                    f10Var.K(a10, !f10Var.B(a10));
                }
                anVar.vd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
