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
public final class h70 implements View.OnClickListener {
    public final int f28986a;
    public final Object f28987b;

    public h70(Object obj, int i9) {
        this.f28986a = i9;
        this.f28987b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i9;
        switch (this.f28986a) {
            case 0:
                j70 j70Var = (j70) this.f28987b;
                j70Var.f29663b = true;
                j70Var.dismiss();
                return;
            case 1:
                ((p70) this.f28987b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f28987b).o(2);
                return;
            case 3:
                gb0 gb0Var = (gb0) this.f28987b;
                gb0.b(gb0Var.getContext(), gb0Var.f28718a, gb0Var.f28723n, false, gb0Var.f28727x, new np(gb0Var, 29), gb0Var.f28720c);
                return;
            case 4:
                ((gc0) this.f28987b).onBackPressed();
                return;
            case 5:
                hd0.m((hd0) this.f28987b);
                return;
            case 6:
                pe0 pe0Var = (pe0) this.f28987b;
                pe0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                qe0 qe0Var = pe0Var.d;
                if (intValue == qe0Var.f31923y) {
                    qe0Var.J = u5Var.getCurrentColor();
                } else {
                    qe0Var.K = u5Var.getCurrentColor();
                }
                hz hzVar = qe0Var.f31902h0;
                if (hzVar != null) {
                    hzVar.e(false, false, false);
                }
                qe0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ye0) this.f28987b).f34958a.f35296y.url)));
                return;
            case 8:
                pf0 pf0Var = (pf0) this.f28987b;
                PhotoViewer photoViewer = pf0Var.R;
                if (photoViewer != null) {
                    ze0 ze0Var = pf0Var.f31638r;
                    if (ze0Var != null) {
                        if (ze0Var.C) {
                            ze0Var.f();
                        } else {
                            ze0Var.g();
                        }
                    } else {
                        k61 k61Var = photoViewer.B2;
                        if (k61Var != null) {
                            if (k61Var.z()) {
                                k61Var.C();
                            } else {
                                k61Var.D();
                            }
                        } else {
                            return;
                        }
                    }
                    pf0.f31622l0.z();
                    return;
                }
                return;
            case 9:
                yf0 yf0Var = (yf0) this.f28987b;
                yf0Var.getClass();
                vf0 vf0Var = (vf0) yf0Var;
                wf0 wf0Var = vf0Var.f33361e;
                zf0 zf0Var = (zf0) vf0Var.getTag(R.id.object_tag);
                if (zf0Var.f35299b.size() > 15) {
                    boolean z10 = zf0Var.f35301e;
                    zf0Var.f35301e = !z10;
                    if (!z10) {
                        zf0Var.f35302f = 10;
                    }
                    wf0Var.f34221s.N(vf0Var);
                    wf0Var.f34221s.f26784c.X(true);
                    return;
                }
                return;
            case 10:
                ((ll0) this.f28987b).onBackPressed();
                return;
            case 11:
                gm0 gm0Var = ((fm0) this.f28987b).f28513c;
                ss.n(gm0Var.B, gm0Var.C);
                return;
            case 12:
                fg.g gVar = ((hm0) this.f28987b).f29132e;
                gVar.setText("");
                AndroidUtilities.showKeyboard(gVar);
                return;
            case 13:
                sm0 sm0Var = (sm0) this.f28987b;
                sm0Var.getClass();
                new zf.x0(sm0Var.f32519b, 24, true).show();
                return;
            case 14:
                ((hn0) this.f28987b).Q(false);
                return;
            case 15:
                wp0 wp0Var = ((up0) this.f28987b).f33113s;
                ArrayList arrayList = wp0Var.f34312s;
                if (!arrayList.isEmpty()) {
                    wp0Var.f34311r = TextUtils.join(" ", arrayList).toString();
                    wp0Var.f34310n = false;
                    wp0Var.d();
                    wp0Var.f34313w = null;
                    if (wp0Var.f34306b != 0) {
                        wp0Var.f34306b = 0;
                        vp0 vp0Var = wp0Var.D;
                        if (vp0Var != null) {
                            ((org.telegram.ui.jv) vp0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                eu0 eu0Var = ((ns0) this.f28987b).f31179f;
                org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) eu0Var.f28160r1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((tp0) this.f28987b).run();
                return;
            case 18:
                ((gw0) this.f28987b).f28883b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ih.y4) this.f28987b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f28987b).setText("");
                return;
            case 21:
                t01 t01Var = ((v01) this.f28987b).f33196b;
                t01Var.setText("");
                AndroidUtilities.showKeyboard(t01Var);
                return;
            case 22:
                ((f11) this.f28987b).f28231b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((z21) this.f28987b).dismiss();
                return;
            case 24:
                org.telegram.ui.qn qnVar = ((org.telegram.ui.nk) this.f28987b).f40757s;
                if (!qnVar.getUserConfig().isPremium() && ((chat = qnVar.f41890e) == null || !chat.autotranslation)) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i9).edit();
                    edit.putInt("dialog_show_translate_count" + qnVar.a(), 14).commit();
                    qnVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 13, false));
                } else {
                    qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a());
                }
                qnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f28987b).getSwipeBack().b(true);
                return;
        }
    }
}
