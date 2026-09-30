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
    public final int f25939a;
    public final Object f25940b;

    public l80(Object obj, int i10) {
        this.f25939a = i10;
        this.f25940b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25939a) {
            case 0:
                n80 n80Var = (n80) this.f25940b;
                n80Var.f26619b = true;
                n80Var.dismiss();
                return;
            case 1:
                ((u80) this.f25940b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.y) this.f25940b).o(2);
                return;
            case 3:
                nc0 nc0Var = (nc0) this.f25940b;
                nc0.b(nc0Var.getContext(), nc0Var.f26656a, nc0Var.f26660n, false, nc0Var.f26664x, new lc0(nc0Var, 0), nc0Var.f26658c);
                return;
            case 4:
                ((nd0) this.f25940b).onBackPressed();
                return;
            case 5:
                ne0.m((ne0) this.f25940b);
                return;
            case 6:
                vf0 vf0Var = (vf0) this.f25940b;
                vf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                wf0 wf0Var = vf0Var.d;
                if (intValue == wf0Var.f29934y) {
                    wf0Var.N = u5Var.getCurrentColor();
                } else {
                    wf0Var.O = u5Var.getCurrentColor();
                }
                yz yzVar = wf0Var.f29917l0;
                if (yzVar != null) {
                    yzVar.e(false, false, false);
                }
                wf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((cg0) this.f25940b).f23311a.f23638y.url)));
                return;
            case 8:
                rg0 rg0Var = (rg0) this.f25940b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    dg0 dg0Var = rg0Var.f28005r;
                    if (dg0Var != null) {
                        if (dg0Var.G) {
                            dg0Var.f();
                        } else {
                            dg0Var.g();
                        }
                    } else {
                        v71 v71Var = photoViewer.F2;
                        if (v71Var != null) {
                            if (v71Var.y()) {
                                v71Var.B();
                            } else {
                                v71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    rg0.f27987p0.z();
                    return;
                }
                return;
            case 9:
                bh0 bh0Var = (bh0) this.f25940b;
                bh0Var.getClass();
                yg0 yg0Var = (yg0) bh0Var;
                zg0 zg0Var = yg0Var.e;
                ch0 ch0Var = (ch0) yg0Var.getTag(R.id.object_tag);
                if (ch0Var.f23316b.size() > 15) {
                    boolean z10 = ch0Var.e;
                    ch0Var.e = !z10;
                    if (!z10) {
                        ch0Var.f23318f = 10;
                    }
                    zg0Var.f30967s.O(yg0Var);
                    zg0Var.f30967s.f23640c.X(true);
                    return;
                }
                return;
            case 10:
                ((pm0) this.f25940b).onBackPressed();
                return;
            case 11:
                ln0 ln0Var = ((kn0) this.f25940b).f25800c;
                ht.n(ln0Var.F, ln0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((mn0) this.f25940b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                xn0 xn0Var = (xn0) this.f25940b;
                xn0Var.getClass();
                new rg.x0(xn0Var.f30427b, 24, true).show();
                return;
            case 14:
                ((oo0) this.f25940b).Q(false);
                return;
            case 15:
                cr0 cr0Var = ((ar0) this.f25940b).f22705s;
                ArrayList arrayList = cr0Var.f23411s;
                if (!arrayList.isEmpty()) {
                    cr0Var.f23410r = TextUtils.join(" ", arrayList).toString();
                    cr0Var.f23409n = false;
                    cr0Var.d();
                    cr0Var.f23412w = null;
                    if (cr0Var.f23406b != 0) {
                        cr0Var.f23406b = 0;
                        br0 br0Var = cr0Var.H;
                        if (br0Var != null) {
                            ((org.telegram.ui.sv) br0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                mv0 mv0Var = ((vt0) this.f25940b).f29723f;
                org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) mv0Var.f26449v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((zq0) this.f25940b).run();
                return;
            case 18:
                ((lx0) this.f25940b).f26144b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f25940b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f25940b).setText("");
                return;
            case 21:
                d21 d21Var = ((f21) this.f25940b).f24143b;
                d21Var.setText("");
                AndroidUtilities.showKeyboard(d21Var);
                return;
            case 22:
                ((p21) this.f25940b).f27224b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((l41) this.f25940b).dismiss();
                return;
            case 24:
                org.telegram.ui.wn wnVar = ((org.telegram.ui.wk) this.f25940b).f39479s;
                if (!wnVar.getUserConfig().isPremium() && ((chat = wnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + wnVar.a(), 14).commit();
                    wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 13, false));
                } else {
                    wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a());
                }
                wnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25940b).getSwipeBack().b(true);
                return;
        }
    }
}
