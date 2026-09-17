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
public final class x70 implements View.OnClickListener {
    public final int f32470a;
    public final Object f32471b;

    public x70(Object obj, int i10) {
        this.f32470a = i10;
        this.f32471b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f32470a) {
            case 0:
                z70 z70Var = (z70) this.f32471b;
                z70Var.f33119b = true;
                z70Var.dismiss();
                return;
            case 1:
                ((g80) this.f32471b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f32471b).o(2);
                return;
            case 3:
                ac0 ac0Var = (ac0) this.f32471b;
                ac0.b(ac0Var.getContext(), ac0Var.f24357a, ac0Var.f24362n, false, ac0Var.f24366x, new wp(ac0Var, 29), ac0Var.f24359c);
                return;
            case 4:
                ((ad0) this.f32471b).onBackPressed();
                return;
            case 5:
                ae0.m((ae0) this.f32471b);
                return;
            case 6:
                if0 if0Var = (if0) this.f32471b;
                if0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                jf0 jf0Var = if0Var.d;
                if (intValue == jf0Var.f27528y) {
                    jf0Var.N = t5Var.getCurrentColor();
                } else {
                    jf0Var.O = t5Var.getCurrentColor();
                }
                vz vzVar = jf0Var.f27511l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                jf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pf0) this.f32471b).f29395a.f29745y.url)));
                return;
            case 8:
                eg0 eg0Var = (eg0) this.f32471b;
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = eg0Var.f25722r;
                    if (qf0Var != null) {
                        if (qf0Var.G) {
                            qf0Var.f();
                        } else {
                            qf0Var.g();
                        }
                    } else {
                        g71 g71Var = photoViewer.F2;
                        if (g71Var != null) {
                            if (g71Var.y()) {
                                g71Var.B();
                            } else {
                                g71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    eg0.f25703p0.z();
                    return;
                }
                return;
            case 9:
                ng0 ng0Var = (ng0) this.f32471b;
                ng0Var.getClass();
                kg0 kg0Var = (kg0) ng0Var;
                lg0 lg0Var = kg0Var.f27851e;
                og0 og0Var = (og0) kg0Var.getTag(R.id.object_tag);
                if (og0Var.f29074b.size() > 15) {
                    boolean z10 = og0Var.f29076e;
                    og0Var.f29076e = !z10;
                    if (!z10) {
                        og0Var.f29077f = 10;
                    }
                    lg0Var.f28200s.O(kg0Var);
                    lg0Var.f28200s.f29399c.X(true);
                    return;
                }
                return;
            case 10:
                ((am0) this.f32471b).onBackPressed();
                return;
            case 11:
                vm0 vm0Var = ((um0) this.f32471b).f30952c;
                dt.n(vm0Var.F, vm0Var.G);
                return;
            case 12:
                di.h2 h2Var = ((wm0) this.f32471b).f32323e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                hn0 hn0Var = (hn0) this.f32471b;
                hn0Var.getClass();
                new sg.a1(hn0Var.f26791b, 24, true).show();
                return;
            case 14:
                ((yn0) this.f32471b).Q(false);
                return;
            case 15:
                mq0 mq0Var = ((kq0) this.f32471b).f27922s;
                ArrayList arrayList = mq0Var.f28518s;
                if (!arrayList.isEmpty()) {
                    mq0Var.f28517r = TextUtils.join(" ", arrayList).toString();
                    mq0Var.f28516n = false;
                    mq0Var.d();
                    mq0Var.f28519w = null;
                    if (mq0Var.f28512b != 0) {
                        mq0Var.f28512b = 0;
                        lq0 lq0Var = mq0Var.H;
                        if (lq0Var != null) {
                            ((org.telegram.ui.xv) lq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                xu0 xu0Var = ((gt0) this.f32471b).f26540f;
                org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32754v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) xu0Var.f32754v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((jq0) this.f32471b).run();
                return;
            case 18:
                ((xw0) this.f32471b).f32781b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((bi.j6) this.f32471b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f32471b).setText("");
                return;
            case 21:
                m11 m11Var = ((o11) this.f32471b).f28951b;
                m11Var.setText("");
                AndroidUtilities.showKeyboard(m11Var);
                return;
            case 22:
                ((y11) this.f32471b).f32849b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((u31) this.f32471b).dismiss();
                return;
            case 24:
                org.telegram.ui.co coVar = ((org.telegram.ui.zk) this.f32471b).f43478s;
                if (!coVar.getUserConfig().isPremium() && ((chat = coVar.f35265e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + coVar.a(), 14).commit();
                    coVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 13, false));
                } else {
                    coVar.getMessagesController().getTranslateController().toggleTranslatingDialog(coVar.a());
                }
                coVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f32471b).getSwipeBack().b(true);
                return;
        }
    }
}
