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
public final class u80 implements View.OnClickListener {
    public final int f30874a;
    public final Object f30875b;

    public u80(Object obj, int i10) {
        this.f30874a = i10;
        this.f30875b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f30874a) {
            case 0:
                ((a90) this.f30875b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f30875b).o(2);
                return;
            case 2:
                tc0 tc0Var = (tc0) this.f30875b;
                tc0.b(tc0Var.getContext(), tc0Var.f30494a, tc0Var.f30498n, false, tc0Var.f30502x, new rc0(tc0Var, 0), tc0Var.f30496c);
                return;
            case 3:
                ((td0) this.f30875b).onBackPressed();
                return;
            case 4:
                ue0.n((ue0) this.f30875b);
                return;
            case 5:
                cg0 cg0Var = (cg0) this.f30875b;
                cg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                dg0 dg0Var = cg0Var.d;
                if (intValue == dg0Var.f25496y) {
                    dg0Var.N = t5Var.getCurrentColor();
                } else {
                    dg0Var.O = t5Var.getCurrentColor();
                }
                e00 e00Var = dg0Var.f25479l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                dg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((kg0) this.f30875b).f27874a.f28160y.url)));
                return;
            case 7:
                ah0 ah0Var = (ah0) this.f30875b;
                PhotoViewer photoViewer = ah0Var.V;
                if (photoViewer != null) {
                    lg0 lg0Var = ah0Var.f24616r;
                    if (lg0Var != null) {
                        if (lg0Var.G) {
                            lg0Var.f();
                        } else {
                            lg0Var.g();
                        }
                    } else {
                        c81 c81Var = photoViewer.F2;
                        if (c81Var != null) {
                            if (c81Var.y()) {
                                c81Var.B();
                            } else {
                                c81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    ah0.f24598p0.z();
                    return;
                }
                return;
            case 8:
                jh0 jh0Var = (jh0) this.f30875b;
                jh0Var.getClass();
                gh0 gh0Var = (gh0) jh0Var;
                hh0 hh0Var = gh0Var.e;
                kh0 kh0Var = (kh0) gh0Var.getTag(R.id.object_tag);
                if (kh0Var.f27878b.size() > 15) {
                    boolean z10 = kh0Var.e;
                    kh0Var.e = !z10;
                    if (!z10) {
                        kh0Var.f27880f = 10;
                    }
                    hh0Var.f26894s.P(gh0Var);
                    hh0Var.f26894s.f28164c.X(true);
                    return;
                }
                return;
            case 9:
                ((zm0) this.f30875b).onBackPressed();
                return;
            case 10:
                un0 un0Var = ((tn0) this.f30875b).f30627c;
                nt.o(un0Var.F, un0Var.G);
                return;
            case 11:
                ei.e2 e2Var = ((vn0) this.f30875b).e;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                return;
            case 12:
                go0 go0Var = (go0) this.f30875b;
                go0Var.getClass();
                new sg.y0(go0Var.f26615b, 24, true).show();
                return;
            case 13:
                ((wo0) this.f30875b).Q(false);
                return;
            case 14:
                kr0 kr0Var = ((ir0) this.f30875b).f27333s;
                ArrayList arrayList = kr0Var.f27931s;
                if (!arrayList.isEmpty()) {
                    kr0Var.f27930r = TextUtils.join(" ", arrayList).toString();
                    kr0Var.f27929n = false;
                    kr0Var.d();
                    kr0Var.f27932w = null;
                    if (kr0Var.f27926b != 0) {
                        kr0Var.f27926b = 0;
                        jr0 jr0Var = kr0Var.H;
                        if (jr0Var != null) {
                            ((org.telegram.ui.hv) jr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                uv0 uv0Var = ((du0) this.f30875b).f25631f;
                org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31071v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) uv0Var.f31071v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((hr0) this.f30875b).run();
                return;
            case 17:
                ((tx0) this.f30875b).f30697b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ci.l5) this.f30875b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f30875b).setText("");
                return;
            case 20:
                l21 l21Var = ((n21) this.f30875b).f28667b;
                l21Var.setText("");
                AndroidUtilities.showKeyboard(l21Var);
                return;
            case 21:
                ((w21) this.f30875b).f31956b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((t41) this.f30875b).dismiss();
                return;
            case 23:
                org.telegram.ui.qn qnVar = ((org.telegram.ui.rk) this.f30875b).f41230s;
                if (!qnVar.getUserConfig().isPremium() && ((chat = qnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + qnVar.a(), 14).commit();
                    qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 13, false));
                } else {
                    qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a());
                }
                qnVar.Vc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f30875b).getSwipeBack().b(true);
                return;
        }
    }
}
