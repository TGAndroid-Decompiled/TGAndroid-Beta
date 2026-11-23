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
public final class g70 implements View.OnClickListener {
    public final int f35347a;
    public final Object f35348b;

    public g70(Object obj, int i7) {
        this.f35347a = i7;
        this.f35348b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f35347a;
        Object obj = this.f35348b;
        switch (i10) {
            case 0:
                i70 i70Var = (i70) obj;
                i70Var.f35962m1 = true;
                i70Var.dismiss();
                return;
            case 1:
                ((o70) obj).dismiss();
                return;
            case 2:
                wa0 wa0Var = (wa0) obj;
                wa0.b(wa0Var.getContext(), wa0Var.f41556a, wa0Var.f41561n, false, wa0Var.f41566y, new lo(wa0Var, 29), wa0Var.f41558c);
                return;
            case 3:
                ((wb0) obj).onBackPressed();
                return;
            case 4:
                wc0.J0((wc0) obj);
                return;
            case 5:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                int intValue = ((Integer) s5Var.getTag()).intValue();
                de0 de0Var = (de0) l4Var.f49583e;
                if (intValue == de0Var.E) {
                    de0Var.O = s5Var.getCurrentColor();
                } else {
                    de0Var.P = s5Var.getCurrentColor();
                }
                bz bzVar = de0Var.m0;
                if (bzVar != null) {
                    bzVar.c(false, false, false);
                }
                de0Var.d();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((je0) obj).f36396a.E.url)));
                return;
            case 7:
                ((oe0) obj).f38141s.getSwipeBack().b(true);
                return;
            case 8:
                cf0 cf0Var = (cf0) obj;
                cf0Var.getClass();
                ze0 ze0Var = (ze0) cf0Var;
                af0 af0Var = ze0Var.f42840e;
                df0 df0Var = (df0) ze0Var.getTag(2131296587);
                if (df0Var.f34318b.size() > 15) {
                    boolean z10 = df0Var.f34320e;
                    df0Var.f34320e = !z10;
                    if (!z10) {
                        df0Var.f34321f = 10;
                    }
                    af0Var.f33472s.K0(ze0Var);
                    af0Var.f33472s.n1.X(true);
                    return;
                }
                return;
            case 9:
                ((yk0) obj).onBackPressed();
                return;
            case 10:
                sl0 sl0Var = (sl0) ((di.l4) obj).d;
                Activity activity = sl0Var.G;
                org.telegram.ui.ActionBar.g2 g2Var = sl0Var.H;
                int i11 = org.telegram.ui.p6.n1;
                if (g2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(1, activity, false);
                    p6Var.f30264w0 = false;
                    p6Var.f30262v0 = false;
                    int i12 = org.telegram.ui.ActionBar.n6.f29451d6;
                    p6Var.Q(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, p6Var.J0), 1, -1));
                    org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Aj, p6Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(2131231312);
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
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(p6Var2.f30223a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(307, new Object[0]);
                                    q10.getMessagesStorage().f27149a.c(new org.telegram.messenger.x5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.na.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    nv0 nv0Var = new nv0(activity, p6Var.f30223a);
                    nv0Var.setStickerNum(9);
                    nv0Var.getImageReceiver().X(1);
                    linearLayout.addView(nv0Var, c8.na.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.n6.f29559j5;
                    org.telegram.ui.ActionBar.u6.U(textView, i13, null);
                    i5.c.r(20.0f, 1, 2131751334, textView, null);
                    linearLayout.addView(textView, c8.na.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(textView2, i13, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.gd.a0("DownloadedFilesMessage", null, 2131751333, new Object[0]));
                    linearLayout.addView(textView2, c8.na.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.gd.N0(2131748504, null));
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
                    linearLayout.addView(textView3, c8.na.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.gd.N0(2131752081, null));
                    org.telegram.ui.ActionBar.u6.U(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.u6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.na.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p6Var.O = nestedScrollView;
                    textView3.setOnClickListener(new l8(10, p6Var, g2Var));
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
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(p6Var2.f30223a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(307, new Object[0]);
                                    q10.getMessagesStorage().f27149a.c(new org.telegram.messenger.x5(q10, 2));
                                    return;
                            }
                        }
                    });
                    p6Var.show();
                    return;
                }
                return;
            case 11:
                ah.i iVar = ((tl0) obj).d;
                iVar.setText("");
                org.telegram.messenger.g0.I3(iVar);
                return;
            case 12:
                em0 em0Var = (em0) obj;
                em0Var.getClass();
                new ug.y0(em0Var.f34795b, 24, true).show();
                return;
            case 13:
                ((tm0) obj).P(false);
                return;
            case 14:
                dp0 dp0Var = (dp0) ((hi.s1) obj).f15371w;
                ArrayList arrayList = dp0Var.f34428s;
                if (!arrayList.isEmpty()) {
                    dp0Var.f34427r = TextUtils.join(" ", arrayList).toString();
                    dp0Var.f34426n = false;
                    dp0Var.d();
                    dp0Var.f34430x = null;
                    if (dp0Var.f34422b != 0) {
                        dp0Var.f34422b = 0;
                        cp0 cp0Var = dp0Var.I;
                        if (cp0Var != null) {
                            ((org.telegram.ui.iu) cp0Var).e(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                it0 it0Var = ((tr0) obj).f40139f;
                org.telegram.ui.ActionBar.g2 g2Var2 = it0Var.f36166y1;
                if (g2Var2 != null && g2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) it0Var.f36166y1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((bp0) obj).run();
                return;
            case 17:
                ((mv0) obj).f37551b.getImageReceiver().Q0(false);
                return;
            case 18:
                org.telegram.messenger.g0.h3((fi.t4) obj, 100L);
                return;
            case 19:
                d01 d01Var = ((f01) obj).f34938b;
                d01Var.setText("");
                org.telegram.messenger.g0.I3(d01Var);
                return;
            case 20:
                ((o01) obj).f37972b.getImageReceiver().Q0(false);
                return;
            case 21:
                ((a31) obj).dismiss();
                return;
            case 22:
                org.telegram.ui.bn bnVar = ((org.telegram.ui.ck) obj).E;
                if (!bnVar.getUserConfig().q() && ((chat = bnVar.f46173e) == null || !chat.autotranslation)) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).f25753g7.edit();
                    edit.putInt("dialog_show_translate_count" + bnVar.a(), 14).commit();
                    bnVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 13, false));
                } else {
                    org.telegram.messenger.y00 y00Var = bnVar.getMessagesController().f25882v7;
                    long a10 = bnVar.a();
                    y00Var.K(a10, !y00Var.B(a10));
                }
                bnVar.zd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
