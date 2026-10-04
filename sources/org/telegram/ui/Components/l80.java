package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PhotoViewer;
public final class l80 implements View.OnClickListener {
    public final int f28303a;
    public final Object f28304b;

    public l80(Object obj, int i10) {
        this.f28303a = i10;
        this.f28304b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f28303a) {
            case 0:
                n80 n80Var = (n80) this.f28304b;
                n80Var.f28897b = true;
                n80Var.dismiss();
                return;
            case 1:
                ((u80) this.f28304b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f28304b).o(2);
                return;
            case 3:
                nc0 nc0Var = (nc0) this.f28304b;
                nc0.b(nc0Var.getContext(), nc0Var.f28928a, nc0Var.f28933n, false, nc0Var.f28937x, new lc0(nc0Var, 0), nc0Var.f28930c);
                return;
            case 4:
                ((md0) this.f28304b).onBackPressed();
                return;
            case 5:
                me0.m((me0) this.f28304b);
                return;
            case 6:
                uf0 uf0Var = (uf0) this.f28304b;
                uf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                vf0 vf0Var = uf0Var.d;
                if (intValue == vf0Var.f31675y) {
                    vf0Var.N = u5Var.getCurrentColor();
                } else {
                    vf0Var.O = u5Var.getCurrentColor();
                }
                yz yzVar = vf0Var.f31658l0;
                if (yzVar != null) {
                    yzVar.e(false, false, false);
                }
                vf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((cg0) this.f28304b).f25362a.f25724y.url)));
                return;
            case 8:
                rg0 rg0Var = (rg0) this.f28304b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    dg0 dg0Var = rg0Var.f30396r;
                    if (dg0Var != null) {
                        if (dg0Var.G) {
                            dg0Var.f();
                        } else {
                            dg0Var.g();
                        }
                    } else {
                        d81 d81Var = photoViewer.F2;
                        if (d81Var != null) {
                            if (d81Var.y()) {
                                d81Var.B();
                            } else {
                                d81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    rg0.f30377p0.z();
                    return;
                }
                return;
            case 9:
                ah0 ah0Var = (ah0) this.f28304b;
                ah0Var.getClass();
                xg0 xg0Var = (xg0) ah0Var;
                yg0 yg0Var = xg0Var.f32784e;
                bh0 bh0Var = (bh0) xg0Var.getTag(R.id.object_tag);
                if (bh0Var.f24955b.size() > 15) {
                    boolean z10 = bh0Var.f24957e;
                    bh0Var.f24957e = !z10;
                    if (!z10) {
                        bh0Var.f24958f = 10;
                    }
                    yg0Var.f33154s.M(xg0Var);
                    yg0Var.f33154s.f25367c.X(true);
                    return;
                }
                return;
            case 10:
                ((sm0) this.f28304b).onBackPressed();
                return;
            case 11:
                on0 on0Var = ((nn0) this.f28304b).f29025c;
                ht.n(on0Var.F, on0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((pn0) this.f28304b).f29671e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                ao0 ao0Var = (ao0) this.f28304b;
                ao0Var.getClass();
                new rg.y0(ao0Var.f24611b, 24, true).show();
                return;
            case 14:
                ((qo0) this.f28304b).S(false);
                return;
            case 15:
                er0 er0Var = ((cr0) this.f28304b).f25440s;
                ArrayList arrayList = er0Var.f26115s;
                if (!arrayList.isEmpty()) {
                    er0Var.f26114r = TextUtils.join(" ", arrayList).toString();
                    er0Var.f26113n = false;
                    er0Var.d();
                    er0Var.f26116w = null;
                    if (er0Var.f26109b != 0) {
                        er0Var.f26109b = 0;
                        dr0 dr0Var = er0Var.H;
                        if (dr0Var != null) {
                            ((org.telegram.ui.xv) dr0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                pv0 pv0Var = ((yt0) this.f28304b).f33250f;
                org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29800v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) pv0Var.f29800v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((br0) this.f28304b).run();
                return;
            case 18:
                ((tx0) this.f28304b).f31192b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f28304b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f28304b).setText("");
                return;
            case 21:
                l21 l21Var = ((n21) this.f28304b).f28844b;
                l21Var.setText("");
                AndroidUtilities.showKeyboard(l21Var);
                return;
            case 22:
                ((x21) this.f28304b).f32707b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((t41) this.f28304b).dismiss();
                return;
            case 24:
                org.telegram.ui.yn ynVar = ((org.telegram.ui.wk) this.f28304b).f42507s;
                if (!ynVar.getUserConfig().isPremium() && ((chat = ynVar.f43314e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + ynVar.a(), 14).commit();
                    ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 13, false));
                } else {
                    ynVar.getMessagesController().getTranslateController().toggleTranslatingDialog(ynVar.a());
                }
                ynVar.Pc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f28304b).getSwipeBack().b(true);
                return;
        }
    }
}
