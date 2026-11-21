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
public final class j70 implements View.OnClickListener {
    public final int f36435a;
    public final Object f36436b;

    public j70(Object obj, int i7) {
        this.f36435a = i7;
        this.f36436b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f36435a;
        Object obj = this.f36436b;
        switch (i10) {
            case 0:
                l70 l70Var = (l70) obj;
                l70Var.f37139m1 = true;
                l70Var.dismiss();
                return;
            case 1:
                ((r70) obj).dismiss();
                return;
            case 2:
                za0 za0Var = (za0) obj;
                za0.b(za0Var.getContext(), za0Var.f42750a, za0Var.f42755n, false, za0Var.f42760y, new oo(za0Var, 29), za0Var.f42752c);
                return;
            case 3:
                ((zb0) obj).onBackPressed();
                return;
            case 4:
                yc0.J0((yc0) obj);
                return;
            case 5:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                ee0 ee0Var = (ee0) l4Var.f49470e;
                if (intValue == ee0Var.E) {
                    ee0Var.O = t5Var.getCurrentColor();
                } else {
                    ee0Var.P = t5Var.getCurrentColor();
                }
                ez ezVar = ee0Var.m0;
                if (ezVar != null) {
                    ezVar.c(false, false, false);
                }
                ee0Var.d();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ke0) obj).f36894a.E.url)));
                return;
            case 7:
                ((pe0) obj).f38583s.getSwipeBack().b(true);
                return;
            case 8:
                df0 df0Var = (df0) obj;
                df0Var.getClass();
                af0 af0Var = (af0) df0Var;
                bf0 bf0Var = af0Var.f33497e;
                ef0 ef0Var = (ef0) af0Var.getTag(2131296587);
                if (ef0Var.f34784b.size() > 15) {
                    boolean z10 = ef0Var.f34786e;
                    ef0Var.f34786e = !z10;
                    if (!z10) {
                        ef0Var.f34787f = 10;
                    }
                    bf0Var.f33849s.K0(af0Var);
                    bf0Var.f33849s.n1.X(true);
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
                int i11 = org.telegram.ui.o6.n1;
                if (g2Var != null && activity != null) {
                    final org.telegram.ui.o6 o6Var = new org.telegram.ui.o6(1, activity, false);
                    o6Var.f30211w0 = false;
                    o6Var.f30209v0 = false;
                    int i12 = org.telegram.ui.ActionBar.m6.f29378d6;
                    o6Var.Q(i12);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29470i6, o6Var.J0), 1, -1));
                    org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Aj, o6Var.J0, PorterDuff.Mode.SRC_ATOP);
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
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(o6Var2.f30170a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(307, new Object[0]);
                                    q10.getMessagesStorage().f27080a.c(new org.telegram.messenger.x5(q10, 2));
                                    return;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ma.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    ov0 ov0Var = new ov0(activity, o6Var.f30170a);
                    ov0Var.setStickerNum(9);
                    ov0Var.getImageReceiver().W(1);
                    linearLayout.addView(ov0Var, c8.ma.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i13 = org.telegram.ui.ActionBar.m6.f29486j5;
                    org.telegram.ui.ActionBar.t6.U(textView, i13, null);
                    i5.c.r(20.0f, 1, 2131751334, textView, null);
                    linearLayout.addView(textView, c8.ma.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView2, i13, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.gd.a0("DownloadedFilesMessage", null, 2131751333, new Object[0]));
                    linearLayout.addView(textView2, c8.ma.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.gd.N0(2131748504, null));
                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Ji, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i14 = org.telegram.ui.ActionBar.m6.Fi;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                    org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i12, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.t6.j(textView3, k02, M, g10, null);
                    linearLayout.addView(textView3, c8.ma.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.gd.N0(2131752081, null));
                    org.telegram.ui.ActionBar.t6.U(textView4, i14, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.p6 g11 = org.telegram.ui.ActionBar.t6.g(i14, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.t6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.ma.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    o6Var.O = nestedScrollView;
                    textView3.setOnClickListener(new m8(10, o6Var, g2Var));
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
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(o6Var2.f30170a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(307, new Object[0]);
                                    q10.getMessagesStorage().f27080a.c(new org.telegram.messenger.x5(q10, 2));
                                    return;
                            }
                        }
                    });
                    o6Var.show();
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
                new ug.y0(em0Var.f34905b, 24, true).show();
                return;
            case 13:
                ((um0) obj).N(false);
                return;
            case 14:
                ep0 ep0Var = (ep0) ((hi.k1) obj).f14861w;
                ArrayList arrayList = ep0Var.f34958s;
                if (!arrayList.isEmpty()) {
                    ep0Var.f34957r = TextUtils.join(" ", arrayList).toString();
                    ep0Var.f34956n = false;
                    ep0Var.d();
                    ep0Var.f34960x = null;
                    if (ep0Var.f34952b != 0) {
                        ep0Var.f34952b = 0;
                        dp0 dp0Var = ep0Var.I;
                        if (dp0Var != null) {
                            ((org.telegram.ui.ju) dp0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                jt0 jt0Var = ((ur0) obj).f40576f;
                org.telegram.ui.ActionBar.g2 g2Var2 = jt0Var.f36689y1;
                if (g2Var2 != null && g2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) jt0Var.f36689y1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((cp0) obj).run();
                return;
            case 17:
                ((nv0) obj).f37989b.getImageReceiver().P0(false);
                return;
            case 18:
                org.telegram.messenger.g0.h3((fi.t4) obj, 100L);
                return;
            case 19:
                e01 e01Var = ((g01) obj).f35356b;
                e01Var.setText("");
                org.telegram.messenger.g0.I3(e01Var);
                return;
            case 20:
                ((q01) obj).f38745b.getImageReceiver().P0(false);
                return;
            case 21:
                ((b31) obj).dismiss();
                return;
            case 22:
                org.telegram.ui.bn bnVar = ((org.telegram.ui.ck) obj).E;
                if (!bnVar.getUserConfig().q() && ((chat = bnVar.f46001e) == null || !chat.autotranslation)) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i7).f25686g7.edit();
                    edit.putInt("dialog_show_translate_count" + bnVar.a(), 14).commit();
                    bnVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 13, false));
                } else {
                    org.telegram.messenger.z00 z00Var = bnVar.getMessagesController().f25815v7;
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
