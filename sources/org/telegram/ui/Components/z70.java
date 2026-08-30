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
public final class z70 implements View.OnClickListener {
    public final int f31260a;
    public final Object f31261b;

    public z70(Object obj, int i10) {
        this.f31260a = i10;
        this.f31261b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f31260a) {
            case 0:
                b80 b80Var = (b80) this.f31261b;
                b80Var.f23592b = true;
                b80Var.dismiss();
                return;
            case 1:
                ((h80) this.f31261b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f31261b).o(2);
                return;
            case 3:
                ac0 ac0Var = (ac0) this.f31261b;
                ac0.b(ac0Var.getContext(), ac0Var.f23343a, ac0Var.f23347n, false, ac0Var.f23351x, new vp(ac0Var, 29), ac0Var.f23345c);
                return;
            case 4:
                ((bd0) this.f31261b).onBackPressed();
                return;
            case 5:
                de0.m((de0) this.f31261b);
                return;
            case 6:
                mf0 mf0Var = (mf0) this.f31261b;
                mf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                nf0 nf0Var = mf0Var.d;
                if (intValue == nf0Var.f27268y) {
                    nf0Var.K = u5Var.getCurrentColor();
                } else {
                    nf0Var.L = u5Var.getCurrentColor();
                }
                vz vzVar = nf0Var.f27248i0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                nf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((uf0) this.f31261b).f29212a.f29457y.url)));
                return;
            case 8:
                lg0 lg0Var = (lg0) this.f31261b;
                PhotoViewer photoViewer = lg0Var.S;
                if (photoViewer != null) {
                    vf0 vf0Var = lg0Var.f26673r;
                    if (vf0Var != null) {
                        if (vf0Var.D) {
                            vf0Var.f();
                        } else {
                            vf0Var.g();
                        }
                    } else {
                        i71 i71Var = photoViewer.C2;
                        if (i71Var != null) {
                            if (i71Var.y()) {
                                i71Var.B();
                            } else {
                                i71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    lg0.m0.z();
                    return;
                }
                return;
            case 9:
                tg0 tg0Var = (tg0) this.f31261b;
                tg0Var.getClass();
                qg0 qg0Var = (qg0) tg0Var;
                rg0 rg0Var = qg0Var.e;
                ug0 ug0Var = (ug0) qg0Var.getTag(R.id.object_tag);
                if (ug0Var.f29216b.size() > 15) {
                    boolean z4 = ug0Var.e;
                    ug0Var.e = !z4;
                    if (!z4) {
                        ug0Var.f29218f = 10;
                    }
                    rg0Var.f28463s.O(qg0Var);
                    rg0Var.f28463s.f29462c.X(true);
                    return;
                }
                return;
            case 10:
                ((im0) this.f31261b).onBackPressed();
                return;
            case 11:
                dn0 dn0Var = ((cn0) this.f31261b).f24027c;
                bt.n(dn0Var.C, dn0Var.D);
                return;
            case 12:
                kg.f fVar = ((en0) this.f31261b).e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                return;
            case 13:
                on0 on0Var = (on0) this.f31261b;
                on0Var.getClass();
                new eg.o1(on0Var.f27601b, 24, true).show();
                return;
            case 14:
                ((do0) this.f31261b).Q(false);
                return;
            case 15:
                qq0 qq0Var = ((oq0) this.f31261b).f27651s;
                ArrayList arrayList = qq0Var.f28221s;
                if (!arrayList.isEmpty()) {
                    qq0Var.f28220r = TextUtils.join(" ", arrayList).toString();
                    qq0Var.f28219n = false;
                    qq0Var.d();
                    qq0Var.f28222w = null;
                    if (qq0Var.f28216b != 0) {
                        qq0Var.f28216b = 0;
                        pq0 pq0Var = qq0Var.E;
                        if (pq0Var != null) {
                            ((org.telegram.ui.sv) pq0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                yu0 yu0Var = ((gt0) this.f31261b).f25249f;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.f31144s1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((nq0) this.f31261b).run();
                return;
            case 18:
                ((zw0) this.f31261b).f31455b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((nh.v4) this.f31261b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f31261b).setText("");
                return;
            case 21:
                q11 q11Var = ((s11) this.f31261b).f28592b;
                q11Var.setText("");
                AndroidUtilities.showKeyboard(q11Var);
                return;
            case 22:
                ((b21) this.f31261b).f23544b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((v31) this.f31261b).dismiss();
                return;
            case 24:
                org.telegram.ui.xn xnVar = ((org.telegram.ui.wk) this.f31261b).f39757s;
                if (!xnVar.getUserConfig().isPremium() && ((chat = xnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + xnVar.a(), 14).commit();
                    xnVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar, 13, false));
                } else {
                    xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a());
                }
                xnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f31261b).getSwipeBack().b(true);
                return;
        }
    }
}
