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
public final class f90 implements View.OnClickListener {
    public final int f25982a;
    public final Object f25983b;

    public f90(Object obj, int i10) {
        this.f25982a = i10;
        this.f25983b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        int i11 = this.f25982a;
        Object obj = this.f25983b;
        switch (i11) {
            case 0:
                ((m90) obj).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) obj).o(2);
                return;
            case 2:
                ed0 ed0Var = (ed0) obj;
                ed0.b(ed0Var.getContext(), ed0Var.f25665a, ed0Var.f25670n, false, ed0Var.f25674x, new cd0(ed0Var, 0), ed0Var.f25667c);
                return;
            case 3:
                ((ee0) obj).onBackPressed();
                return;
            case 4:
                ff0.o((ff0) obj);
                return;
            case 5:
                ng0 ng0Var = (ng0) obj;
                ng0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                og0 og0Var = ng0Var.d;
                if (intValue == og0Var.f29208y) {
                    og0Var.N = u5Var.getCurrentColor();
                } else {
                    og0Var.O = u5Var.getCurrentColor();
                }
                o00 o00Var = og0Var.f29191l0;
                if (o00Var != null) {
                    o00Var.e(false, false, false);
                }
                og0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ug0) obj).f31165a.f31513y.url)));
                return;
            case 7:
                jh0 jh0Var = (jh0) obj;
                PhotoViewer photoViewer = jh0Var.V;
                if (photoViewer != null) {
                    vg0 vg0Var = jh0Var.f27522r;
                    if (vg0Var != null) {
                        if (vg0Var.G) {
                            vg0Var.f();
                        } else {
                            vg0Var.g();
                        }
                    } else {
                        q81 q81Var = photoViewer.F2;
                        if (q81Var != null) {
                            if (q81Var.y()) {
                                q81Var.B();
                            } else {
                                q81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    jh0.f27503p0.z();
                    return;
                }
                return;
            case 8:
                uh0 uh0Var = (uh0) obj;
                uh0Var.getClass();
                rh0 rh0Var = (rh0) uh0Var;
                sh0 sh0Var = rh0Var.f30157e;
                vh0 vh0Var = (vh0) rh0Var.getTag(R.id.object_tag);
                if (vh0Var.f31520b.size() > 15) {
                    boolean z10 = vh0Var.f31522e;
                    vh0Var.f31522e = !z10;
                    if (!z10) {
                        vh0Var.f31523f = 10;
                    }
                    sh0Var.f30572s.P(rh0Var);
                    sh0Var.f30572s.f32407c.X(true);
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView = ((hf) obj).f26765a;
                int i12 = ChatActivityEnterView.Q5;
                chatActivityEnterView.A1();
                return;
            case 10:
                ((mn0) obj).onBackPressed();
                return;
            case 11:
                ho0 ho0Var = ((go0) obj).f26483c;
                xt.p(ho0Var.F, ho0Var.G);
                return;
            case 12:
                ci.g2 g2Var = ((io0) obj).f27250e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                return;
            case 13:
                to0 to0Var = (to0) obj;
                to0Var.getClass();
                new rg.y0(to0Var.f30906b, 24, true).show();
                return;
            case 14:
                ((jp0) obj).Q(false);
                return;
            case 15:
                xr0 xr0Var = ((vr0) obj).f32185s;
                ArrayList arrayList = xr0Var.f32841s;
                if (!arrayList.isEmpty()) {
                    xr0Var.f32840r = TextUtils.join(" ", arrayList).toString();
                    xr0Var.f32839n = false;
                    xr0Var.d();
                    xr0Var.f32842w = null;
                    if (xr0Var.f32835b != 0) {
                        xr0Var.f32835b = 0;
                        wr0 wr0Var = xr0Var.H;
                        if (wr0Var != null) {
                            ((org.telegram.ui.xv) wr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                hw0 hw0Var = ((qu0) obj).f29936f;
                org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26972v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) hw0Var.f26972v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((ur0) obj).run();
                return;
            case 18:
                ((gy0) obj).f26555b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.b7) obj, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) obj).setText("");
                return;
            case 21:
                z21 z21Var = ((b31) obj).f24563b;
                z21Var.setText("");
                AndroidUtilities.showKeyboard(z21Var);
                return;
            case 22:
                ((k31) obj).f27743b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((g51) obj).dismiss();
                return;
            case 24:
                org.telegram.ui.eo eoVar = ((org.telegram.ui.el) obj).f37177s;
                if (!eoVar.getUserConfig().isPremium() && ((chat = eoVar.f37241e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + eoVar.a(), 14).commit();
                    eoVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) eoVar, 13, false));
                } else {
                    eoVar.getMessagesController().getTranslateController().toggleTranslatingDialog(eoVar.a());
                }
                eoVar.Uc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
        }
    }
}
