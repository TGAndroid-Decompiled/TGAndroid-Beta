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
    public final int f30908a;
    public final Object f30909b;

    public u80(Object obj, int i10) {
        this.f30908a = i10;
        this.f30909b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f30908a) {
            case 0:
                ((a90) this.f30909b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f30909b).o(2);
                return;
            case 2:
                tc0 tc0Var = (tc0) this.f30909b;
                tc0.b(tc0Var.getContext(), tc0Var.f30470a, tc0Var.f30474n, false, tc0Var.f30478x, new rc0(tc0Var, 0), tc0Var.f30472c);
                return;
            case 3:
                ((td0) this.f30909b).onBackPressed();
                return;
            case 4:
                te0.n((te0) this.f30909b);
                return;
            case 5:
                bg0 bg0Var = (bg0) this.f30909b;
                bg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                cg0 cg0Var = bg0Var.d;
                if (intValue == cg0Var.f25212y) {
                    cg0Var.N = t5Var.getCurrentColor();
                } else {
                    cg0Var.O = t5Var.getCurrentColor();
                }
                e00 e00Var = cg0Var.f25195l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                cg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((jg0) this.f30909b).f27524a.f27850y.url)));
                return;
            case 7:
                zg0 zg0Var = (zg0) this.f30909b;
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null) {
                    kg0 kg0Var = zg0Var.f32945r;
                    if (kg0Var != null) {
                        if (kg0Var.G) {
                            kg0Var.f();
                        } else {
                            kg0Var.g();
                        }
                    } else {
                        b81 b81Var = photoViewer.F2;
                        if (b81Var != null) {
                            if (b81Var.y()) {
                                b81Var.B();
                            } else {
                                b81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    zg0.f32927p0.z();
                    return;
                }
                return;
            case 8:
                ih0 ih0Var = (ih0) this.f30909b;
                ih0Var.getClass();
                fh0 fh0Var = (fh0) ih0Var;
                gh0 gh0Var = fh0Var.e;
                jh0 jh0Var = (jh0) fh0Var.getTag(R.id.object_tag);
                if (jh0Var.f27528b.size() > 15) {
                    boolean z10 = jh0Var.e;
                    jh0Var.e = !z10;
                    if (!z10) {
                        jh0Var.f27530f = 10;
                    }
                    gh0Var.f26594s.P(fh0Var);
                    gh0Var.f26594s.f27854c.X(true);
                    return;
                }
                return;
            case 9:
                ((ym0) this.f30909b).onBackPressed();
                return;
            case 10:
                tn0 tn0Var = ((sn0) this.f30909b).f30291c;
                nt.o(tn0Var.F, tn0Var.G);
                return;
            case 11:
                ei.e2 e2Var = ((un0) this.f30909b).e;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                return;
            case 12:
                fo0 fo0Var = (fo0) this.f30909b;
                fo0Var.getClass();
                new sg.y0(fo0Var.f26306b, 24, true).show();
                return;
            case 13:
                ((vo0) this.f30909b).Q(false);
                return;
            case 14:
                jr0 jr0Var = ((hr0) this.f30909b).f26926s;
                ArrayList arrayList = jr0Var.f27590s;
                if (!arrayList.isEmpty()) {
                    jr0Var.f27589r = TextUtils.join(" ", arrayList).toString();
                    jr0Var.f27588n = false;
                    jr0Var.d();
                    jr0Var.f27591w = null;
                    if (jr0Var.f27585b != 0) {
                        jr0Var.f27585b = 0;
                        ir0 ir0Var = jr0Var.H;
                        if (ir0Var != null) {
                            ((org.telegram.ui.hv) ir0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                tv0 tv0Var = ((cu0) this.f30909b).f25344f;
                org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) tv0Var.f30732v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((gr0) this.f30909b).run();
                return;
            case 17:
                ((sx0) this.f30909b).f30351b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ci.l5) this.f30909b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f30909b).setText("");
                return;
            case 20:
                k21 k21Var = ((m21) this.f30909b).f28367b;
                k21Var.setText("");
                AndroidUtilities.showKeyboard(k21Var);
                return;
            case 21:
                ((v21) this.f30909b).f31125b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((s41) this.f30909b).dismiss();
                return;
            case 23:
                org.telegram.ui.qn qnVar = ((org.telegram.ui.rk) this.f30909b).f41224s;
                if (!qnVar.getUserConfig().isPremium() && ((chat = qnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + qnVar.a(), 14).commit();
                    qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 13, false));
                } else {
                    qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a());
                }
                qnVar.Uc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f30909b).getSwipeBack().b(true);
                return;
        }
    }
}
