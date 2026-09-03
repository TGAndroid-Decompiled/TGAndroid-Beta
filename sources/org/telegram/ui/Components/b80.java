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
    public final int f25537a;
    public final Object f25538b;

    public b80(Object obj, int i10) {
        this.f25537a = i10;
        this.f25538b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25537a) {
            case 0:
                d80 d80Var = (d80) this.f25538b;
                d80Var.f26227b = true;
                d80Var.dismiss();
                return;
            case 1:
                ((j80) this.f25538b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f25538b).o(2);
                return;
            case 3:
                cc0 cc0Var = (cc0) this.f25538b;
                cc0.b(cc0Var.getContext(), cc0Var.f25889a, cc0Var.f25894n, false, cc0Var.f25898x, new xp(cc0Var, 29), cc0Var.f25891c);
                return;
            case 4:
                ((dd0) this.f25538b).onBackPressed();
                return;
            case 5:
                fe0.m((fe0) this.f25538b);
                return;
            case 6:
                of0 of0Var = (of0) this.f25538b;
                of0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                pf0 pf0Var = of0Var.d;
                if (intValue == pf0Var.f30080y) {
                    pf0Var.K = u5Var.getCurrentColor();
                } else {
                    pf0Var.L = u5Var.getCurrentColor();
                }
                xz xzVar = pf0Var.f30060i0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
                pf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((wf0) this.f25538b).f32746a.f33063y.url)));
                return;
            case 8:
                ng0 ng0Var = (ng0) this.f25538b;
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null) {
                    xf0 xf0Var = ng0Var.f29479r;
                    if (xf0Var != null) {
                        if (xf0Var.D) {
                            xf0Var.f();
                        } else {
                            xf0Var.g();
                        }
                    } else {
                        j71 j71Var = photoViewer.C2;
                        if (j71Var != null) {
                            if (j71Var.y()) {
                                j71Var.B();
                            } else {
                                j71Var.C();
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
                vg0 vg0Var = (vg0) this.f25538b;
                vg0Var.getClass();
                sg0 sg0Var = (sg0) vg0Var;
                tg0 tg0Var = sg0Var.f31058e;
                wg0 wg0Var = (wg0) sg0Var.getTag(R.id.object_tag);
                if (wg0Var.f32750b.size() > 15) {
                    boolean z4 = wg0Var.f32752e;
                    wg0Var.f32752e = !z4;
                    if (!z4) {
                        wg0Var.f32753f = 10;
                    }
                    tg0Var.f31354s.O(sg0Var);
                    tg0Var.f31354s.f33067c.X(true);
                    return;
                }
                return;
            case 10:
                ((im0) this.f25538b).onBackPressed();
                return;
            case 11:
                dn0 dn0Var = ((cn0) this.f25538b).f26013c;
                dt.n(dn0Var.C, dn0Var.D);
                return;
            case 12:
                lg.f fVar = ((en0) this.f25538b).f26635e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                return;
            case 13:
                on0 on0Var = (on0) this.f25538b;
                on0Var.getClass();
                new fg.n1(on0Var.f29825b, 24, true).show();
                return;
            case 14:
                ((do0) this.f25538b).Q(false);
                return;
            case 15:
                qq0 qq0Var = ((oq0) this.f25538b).f29871s;
                ArrayList arrayList = qq0Var.f30499s;
                if (!arrayList.isEmpty()) {
                    qq0Var.f30498r = TextUtils.join(" ", arrayList).toString();
                    qq0Var.f30497n = false;
                    qq0Var.d();
                    qq0Var.f30500w = null;
                    if (qq0Var.f30493b != 0) {
                        qq0Var.f30493b = 0;
                        pq0 pq0Var = qq0Var.E;
                        if (pq0Var != null) {
                            ((org.telegram.ui.tv) pq0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                yu0 yu0Var = ((gt0) this.f25538b).f27280f;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f33649s1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.f33649s1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((nq0) this.f25538b).run();
                return;
            case 18:
                ((zw0) this.f25538b).f34031b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((oh.w4) this.f25538b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f25538b).setText("");
                return;
            case 21:
                q11 q11Var = ((s11) this.f25538b).f30959b;
                q11Var.setText("");
                AndroidUtilities.showKeyboard(q11Var);
                return;
            case 22:
                ((b21) this.f25538b).f25478b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((v31) this.f25538b).dismiss();
                return;
            case 24:
                org.telegram.ui.xn xnVar = ((org.telegram.ui.wk) this.f25538b).f42798s;
                if (!xnVar.getUserConfig().isPremium() && ((chat = xnVar.f43143e) == null || !chat.autotranslation)) {
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25538b).getSwipeBack().b(true);
                return;
        }
    }
}
