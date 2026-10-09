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
public final class b90 implements View.OnClickListener {
    public final int f24950a;
    public final Object f24951b;

    public b90(Object obj, int i10) {
        this.f24950a = i10;
        this.f24951b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f24950a) {
            case 0:
                ((i90) this.f24951b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.z) this.f24951b).o(2);
                return;
            case 2:
                zc0 zc0Var = (zc0) this.f24951b;
                zc0.b(zc0Var.getContext(), zc0Var.f33527a, zc0Var.f33532n, false, zc0Var.f33536x, new nq(zc0Var, 29), zc0Var.f33529c);
                return;
            case 3:
                ((ae0) this.f24951b).onBackPressed();
                return;
            case 4:
                bf0.o((bf0) this.f24951b);
                return;
            case 5:
                jg0 jg0Var = (jg0) this.f24951b;
                jg0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                kg0 kg0Var = jg0Var.d;
                if (intValue == kg0Var.f28004y) {
                    kg0Var.N = u5Var.getCurrentColor();
                } else {
                    kg0Var.O = u5Var.getCurrentColor();
                }
                l00 l00Var = kg0Var.f27987l0;
                if (l00Var != null) {
                    l00Var.e(false, false, false);
                }
                kg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((rg0) this.f24951b).f30440a.f30792y.url)));
                return;
            case 7:
                gh0 gh0Var = (gh0) this.f24951b;
                PhotoViewer photoViewer = gh0Var.V;
                if (photoViewer != null) {
                    sg0 sg0Var = gh0Var.f26719r;
                    if (sg0Var != null) {
                        if (sg0Var.G) {
                            sg0Var.f();
                        } else {
                            sg0Var.g();
                        }
                    } else {
                        k81 k81Var = photoViewer.F2;
                        if (k81Var != null) {
                            if (k81Var.y()) {
                                k81Var.B();
                            } else {
                                k81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    gh0.f26700p0.z();
                    return;
                }
                return;
            case 8:
                qh0 qh0Var = (qh0) this.f24951b;
                qh0Var.getClass();
                nh0 nh0Var = (nh0) qh0Var;
                oh0 oh0Var = nh0Var.f29161e;
                rh0 rh0Var = (rh0) nh0Var.getTag(R.id.object_tag);
                if (rh0Var.f30445b.size() > 15) {
                    boolean z10 = rh0Var.f30447e;
                    rh0Var.f30447e = !z10;
                    if (!z10) {
                        rh0Var.f30448f = 10;
                    }
                    oh0Var.f29489s.P(nh0Var);
                    oh0Var.f29489s.f30797c.X(true);
                    return;
                }
                return;
            case 9:
                ((gn0) this.f24951b).onBackPressed();
                return;
            case 10:
                bo0 bo0Var = ((ao0) this.f24951b).f24724c;
                vt.p(bo0Var.F, bo0Var.G);
                return;
            case 11:
                ci.g2 g2Var = ((co0) this.f24951b).f25451e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                return;
            case 12:
                no0 no0Var = (no0) this.f24951b;
                no0Var.getClass();
                new rg.y0(no0Var.f29220b, 24, true).show();
                return;
            case 13:
                ((dp0) this.f24951b).Q(false);
                return;
            case 14:
                rr0 rr0Var = ((pr0) this.f24951b).f29937s;
                ArrayList arrayList = rr0Var.f30494s;
                if (!arrayList.isEmpty()) {
                    rr0Var.f30493r = TextUtils.join(" ", arrayList).toString();
                    rr0Var.f30492n = false;
                    rr0Var.d();
                    rr0Var.f30495w = null;
                    if (rr0Var.f30488b != 0) {
                        rr0Var.f30488b = 0;
                        qr0 qr0Var = rr0Var.H;
                        if (qr0Var != null) {
                            ((org.telegram.ui.vv) qr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                bw0 bw0Var = ((ku0) this.f24951b).f28170f;
                org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) bw0Var.f25166v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((or0) this.f24951b).run();
                return;
            case 17:
                ((ay0) this.f24951b).f24800b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ai.b7) this.f24951b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f24951b).setText("");
                return;
            case 20:
                s21 s21Var = ((u21) this.f24951b).f31348b;
                s21Var.setText("");
                AndroidUtilities.showKeyboard(s21Var);
                return;
            case 21:
                ((e31) this.f24951b).f25936b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((b51) this.f24951b).dismiss();
                return;
            case 23:
                org.telegram.ui.zn znVar = ((org.telegram.ui.al) this.f24951b).f35952s;
                if (!znVar.getUserConfig().isPremium() && ((chat = znVar.f44753e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + znVar.a(), 14).commit();
                    znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 13, false));
                } else {
                    znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a());
                }
                znVar.Uc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f24951b).getSwipeBack().b(true);
                return;
        }
    }
}
