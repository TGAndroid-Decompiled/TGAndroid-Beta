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
public final class c90 implements View.OnClickListener {
    public final int f25152a;
    public final Object f25153b;

    public c90(Object obj, int i10) {
        this.f25152a = i10;
        this.f25153b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25152a) {
            case 0:
                ((j90) this.f25153b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f25153b).o(2);
                return;
            case 2:
                ad0 ad0Var = (ad0) this.f25153b;
                ad0.b(ad0Var.getContext(), ad0Var.f24495a, ad0Var.f24500n, false, ad0Var.f24504x, new nq(ad0Var, 29), ad0Var.f24497c);
                return;
            case 3:
                ((ce0) this.f25153b).onBackPressed();
                return;
            case 4:
                df0.o((df0) this.f25153b);
                return;
            case 5:
                lg0 lg0Var = (lg0) this.f25153b;
                lg0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                mg0 mg0Var = lg0Var.d;
                if (intValue == mg0Var.f28702y) {
                    mg0Var.N = u5Var.getCurrentColor();
                } else {
                    mg0Var.O = u5Var.getCurrentColor();
                }
                m00 m00Var = mg0Var.f28685l0;
                if (m00Var != null) {
                    m00Var.e(false, false, false);
                }
                mg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((tg0) this.f25153b).f31092a.f31446y.url)));
                return;
            case 7:
                ih0 ih0Var = (ih0) this.f25153b;
                PhotoViewer photoViewer = ih0Var.V;
                if (photoViewer != null) {
                    ug0 ug0Var = ih0Var.f27344r;
                    if (ug0Var != null) {
                        if (ug0Var.G) {
                            ug0Var.f();
                        } else {
                            ug0Var.g();
                        }
                    } else {
                        m81 m81Var = photoViewer.F2;
                        if (m81Var != null) {
                            if (m81Var.y()) {
                                m81Var.B();
                            } else {
                                m81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    ih0.f27325p0.z();
                    return;
                }
                return;
            case 8:
                sh0 sh0Var = (sh0) this.f25153b;
                sh0Var.getClass();
                ph0 ph0Var = (ph0) sh0Var;
                qh0 qh0Var = ph0Var.f29726e;
                th0 th0Var = (th0) ph0Var.getTag(R.id.object_tag);
                if (th0Var.f31099b.size() > 15) {
                    boolean z10 = th0Var.f31101e;
                    th0Var.f31101e = !z10;
                    if (!z10) {
                        th0Var.f31102f = 10;
                    }
                    qh0Var.f30159s.P(ph0Var);
                    qh0Var.f30159s.f31452c.X(true);
                    return;
                }
                return;
            case 9:
                ((in0) this.f25153b).onBackPressed();
                return;
            case 10:
                do0 do0Var = ((co0) this.f25153b).f25252c;
                wt.p(do0Var.F, do0Var.G);
                return;
            case 11:
                ci.g2 g2Var = ((eo0) this.f25153b).f26111e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                return;
            case 12:
                po0 po0Var = (po0) this.f25153b;
                po0Var.getClass();
                new rg.y0(po0Var.f29781b, 24, true).show();
                return;
            case 13:
                ((fp0) this.f25153b).Q(false);
                return;
            case 14:
                tr0 tr0Var = ((rr0) this.f25153b).f30536s;
                ArrayList arrayList = tr0Var.f31142s;
                if (!arrayList.isEmpty()) {
                    tr0Var.f31141r = TextUtils.join(" ", arrayList).toString();
                    tr0Var.f31140n = false;
                    tr0Var.d();
                    tr0Var.f31143w = null;
                    if (tr0Var.f31136b != 0) {
                        tr0Var.f31136b = 0;
                        sr0 sr0Var = tr0Var.H;
                        if (sr0Var != null) {
                            ((org.telegram.ui.uv) sr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                dw0 dw0Var = ((mu0) this.f25153b).f28863f;
                org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) dw0Var.f25735v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((qr0) this.f25153b).run();
                return;
            case 17:
                ((cy0) this.f25153b).f25349b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ai.b7) this.f25153b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f25153b).setText("");
                return;
            case 20:
                v21 v21Var = ((x21) this.f25153b).f32810b;
                v21Var.setText("");
                AndroidUtilities.showKeyboard(v21Var);
                return;
            case 21:
                ((g31) this.f25153b).f26595b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((d51) this.f25153b).dismiss();
                return;
            case 23:
                org.telegram.ui.zn znVar = ((org.telegram.ui.al) this.f25153b).f36105s;
                if (!znVar.getUserConfig().isPremium() && ((chat = znVar.f44752e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + znVar.a(), 14).commit();
                    znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) znVar, 13, false));
                } else {
                    znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a());
                }
                znVar.Uc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25153b).getSwipeBack().b(true);
                return;
        }
    }
}
