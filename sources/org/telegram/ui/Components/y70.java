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
public final class y70 implements View.OnClickListener {
    public final int f30173a;
    public final Object f30174b;

    public y70(Object obj, int i10) {
        this.f30173a = i10;
        this.f30174b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f30173a) {
            case 0:
                a80 a80Var = (a80) this.f30174b;
                a80Var.f22383b = true;
                a80Var.dismiss();
                return;
            case 1:
                ((h80) this.f30174b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f30174b).o(2);
                return;
            case 3:
                yb0 yb0Var = (yb0) this.f30174b;
                yb0.b(yb0Var.getContext(), yb0Var.f30194a, yb0Var.f30198n, false, yb0Var.f30202x, new yp(yb0Var, 29), yb0Var.f30196c);
                return;
            case 4:
                ((zc0) this.f30174b).onBackPressed();
                return;
            case 5:
                ae0.m((ae0) this.f30174b);
                return;
            case 6:
                if0 if0Var = (if0) this.f30174b;
                if0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                jf0 jf0Var = if0Var.d;
                if (intValue == jf0Var.f25299y) {
                    jf0Var.N = u5Var.getCurrentColor();
                } else {
                    jf0Var.O = u5Var.getCurrentColor();
                }
                wz wzVar = jf0Var.f25282l0;
                if (wzVar != null) {
                    wzVar.e(false, false, false);
                }
                jf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pf0) this.f30174b).f27020a.f27338y.url)));
                return;
            case 8:
                eg0 eg0Var = (eg0) this.f30174b;
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = eg0Var.f23679r;
                    if (qf0Var != null) {
                        if (qf0Var.G) {
                            qf0Var.f();
                        } else {
                            qf0Var.g();
                        }
                    } else {
                        f71 f71Var = photoViewer.F2;
                        if (f71Var != null) {
                            if (f71Var.y()) {
                                f71Var.B();
                            } else {
                                f71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    eg0.f23661p0.z();
                    return;
                }
                return;
            case 9:
                og0 og0Var = (og0) this.f30174b;
                og0Var.getClass();
                lg0 lg0Var = (lg0) og0Var;
                mg0 mg0Var = lg0Var.e;
                pg0 pg0Var = (pg0) lg0Var.getTag(R.id.object_tag);
                if (pg0Var.f27025b.size() > 15) {
                    boolean z10 = pg0Var.e;
                    pg0Var.e = !z10;
                    if (!z10) {
                        pg0Var.f27027f = 10;
                    }
                    mg0Var.f26172s.O(lg0Var);
                    mg0Var.f26172s.f27341c.X(true);
                    return;
                }
                return;
            case 10:
                ((bm0) this.f30174b).onBackPressed();
                return;
            case 11:
                wm0 wm0Var = ((vm0) this.f30174b).f28773c;
                ft.n(wm0Var.F, wm0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((xm0) this.f30174b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                in0 in0Var = (in0) this.f30174b;
                in0Var.getClass();
                new rg.x0(in0Var.f25005b, 24, true).show();
                return;
            case 14:
                ((yn0) this.f30174b).Q(false);
                return;
            case 15:
                mq0 mq0Var = ((kq0) this.f30174b).f25675s;
                ArrayList arrayList = mq0Var.f26265s;
                if (!arrayList.isEmpty()) {
                    mq0Var.f26264r = TextUtils.join(" ", arrayList).toString();
                    mq0Var.f26263n = false;
                    mq0Var.d();
                    mq0Var.f26266w = null;
                    if (mq0Var.f26260b != 0) {
                        mq0Var.f26260b = 0;
                        lq0 lq0Var = mq0Var.H;
                        if (lq0Var != null) {
                            ((org.telegram.ui.tv) lq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                yu0 yu0Var = ((ht0) this.f30174b).f24822f;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30450v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.f30450v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((jq0) this.f30174b).run();
                return;
            case 18:
                ((xw0) this.f30174b).f30078b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f30174b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f30174b).setText("");
                return;
            case 21:
                m11 m11Var = ((o11) this.f30174b).f26571b;
                m11Var.setText("");
                AndroidUtilities.showKeyboard(m11Var);
                return;
            case 22:
                ((y11) this.f30174b).f30132b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((u31) this.f30174b).dismiss();
                return;
            case 24:
                org.telegram.ui.xn xnVar = ((org.telegram.ui.wk) this.f30174b).f39045s;
                if (!xnVar.getUserConfig().isPremium() && ((chat = xnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + xnVar.a(), 14).commit();
                    xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar, 13, false));
                } else {
                    xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a());
                }
                xnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f30174b).getSwipeBack().b(true);
                return;
        }
    }
}
