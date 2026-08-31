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
public final class b80 implements View.OnClickListener {
    public final int f25517a;
    public final Object f25518b;

    public b80(Object obj, int i10) {
        this.f25517a = i10;
        this.f25518b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25517a) {
            case 0:
                d80 d80Var = (d80) this.f25518b;
                d80Var.f26224b = true;
                d80Var.dismiss();
                return;
            case 1:
                ((j80) this.f25518b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f25518b).o(2);
                return;
            case 3:
                cc0 cc0Var = (cc0) this.f25518b;
                cc0.b(cc0Var.getContext(), cc0Var.f25912a, cc0Var.f25917n, false, cc0Var.f25921x, new xp(cc0Var, 29), cc0Var.f25914c);
                return;
            case 4:
                ((dd0) this.f25518b).onBackPressed();
                return;
            case 5:
                fe0.m((fe0) this.f25518b);
                return;
            case 6:
                of0 of0Var = (of0) this.f25518b;
                of0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                pf0 pf0Var = of0Var.d;
                if (intValue == pf0Var.f30067y) {
                    pf0Var.K = u5Var.getCurrentColor();
                } else {
                    pf0Var.L = u5Var.getCurrentColor();
                }
                xz xzVar = pf0Var.f30047i0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
                pf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((wf0) this.f25518b).f32741a.f33069y.url)));
                return;
            case 8:
                ng0 ng0Var = (ng0) this.f25518b;
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null) {
                    xf0 xf0Var = ng0Var.f29501r;
                    if (xf0Var != null) {
                        if (xf0Var.D) {
                            xf0Var.f();
                        } else {
                            xf0Var.g();
                        }
                    } else {
                        k71 k71Var = photoViewer.C2;
                        if (k71Var != null) {
                            if (k71Var.y()) {
                                k71Var.B();
                            } else {
                                k71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    ng0.m0.z();
                    return;
                }
                return;
            case 9:
                vg0 vg0Var = (vg0) this.f25518b;
                vg0Var.getClass();
                sg0 sg0Var = (sg0) vg0Var;
                tg0 tg0Var = sg0Var.f31058e;
                wg0 wg0Var = (wg0) sg0Var.getTag(R.id.object_tag);
                if (wg0Var.f32745b.size() > 15) {
                    boolean z4 = wg0Var.f32747e;
                    wg0Var.f32747e = !z4;
                    if (!z4) {
                        wg0Var.f32748f = 10;
                    }
                    tg0Var.f31339s.O(sg0Var);
                    tg0Var.f31339s.f33073c.X(true);
                    return;
                }
                return;
            case 10:
                ((jm0) this.f25518b).onBackPressed();
                return;
            case 11:
                en0 en0Var = ((dn0) this.f25518b).f26301c;
                dt.n(en0Var.C, en0Var.D);
                return;
            case 12:
                lg.f fVar = ((fn0) this.f25518b).f26966e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                return;
            case 13:
                pn0 pn0Var = (pn0) this.f25518b;
                pn0Var.getClass();
                new fg.n1(pn0Var.f30129b, 24, true).show();
                return;
            case 14:
                ((eo0) this.f25518b).Q(false);
                return;
            case 15:
                rq0 rq0Var = ((pq0) this.f25518b).f30182s;
                ArrayList arrayList = rq0Var.f30826s;
                if (!arrayList.isEmpty()) {
                    rq0Var.f30825r = TextUtils.join(" ", arrayList).toString();
                    rq0Var.f30824n = false;
                    rq0Var.d();
                    rq0Var.f30827w = null;
                    if (rq0Var.f30820b != 0) {
                        rq0Var.f30820b = 0;
                        qq0 qq0Var = rq0Var.E;
                        if (qq0Var != null) {
                            ((org.telegram.ui.tv) qq0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                zu0 zu0Var = ((ht0) this.f25518b).f27587f;
                org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) zu0Var.f34004s1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((oq0) this.f25518b).run();
                return;
            case 18:
                ((ax0) this.f25518b).f25362b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((oh.w4) this.f25518b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f25518b).setText("");
                return;
            case 21:
                r11 r11Var = ((t11) this.f25518b).f31235b;
                r11Var.setText("");
                AndroidUtilities.showKeyboard(r11Var);
                return;
            case 22:
                ((c21) this.f25518b).f25759b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((w31) this.f25518b).dismiss();
                return;
            case 24:
                org.telegram.ui.xn xnVar = ((org.telegram.ui.wk) this.f25518b).f42837s;
                if (!xnVar.getUserConfig().isPremium() && ((chat = xnVar.f43165e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + xnVar.a(), 14).commit();
                    xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 13, false));
                } else {
                    xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a());
                }
                xnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25518b).getSwipeBack().b(true);
                return;
        }
    }
}
