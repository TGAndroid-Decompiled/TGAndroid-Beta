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
    public final int f25244a;
    public final Object f25245b;

    public c90(Object obj, int i10) {
        this.f25244a = i10;
        this.f25245b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25244a) {
            case 0:
                ((j90) this.f25245b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.z) this.f25245b).o(2);
                return;
            case 2:
                ad0 ad0Var = (ad0) this.f25245b;
                ad0.b(ad0Var.getContext(), ad0Var.f24537a, ad0Var.f24542n, false, ad0Var.f24546x, new nq(ad0Var, 29), ad0Var.f24539c);
                return;
            case 3:
                ((be0) this.f25245b).onBackPressed();
                return;
            case 4:
                df0.o((df0) this.f25245b);
                return;
            case 5:
                lg0 lg0Var = (lg0) this.f25245b;
                lg0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                mg0 mg0Var = lg0Var.d;
                if (intValue == mg0Var.f28813y) {
                    mg0Var.N = u5Var.getCurrentColor();
                } else {
                    mg0Var.O = u5Var.getCurrentColor();
                }
                m00 m00Var = mg0Var.f28796l0;
                if (m00Var != null) {
                    m00Var.e(false, false, false);
                }
                mg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((sg0) this.f25245b).f30782a.f31130y.url)));
                return;
            case 7:
                hh0 hh0Var = (hh0) this.f25245b;
                PhotoViewer photoViewer = hh0Var.V;
                if (photoViewer != null) {
                    tg0 tg0Var = hh0Var.f27030r;
                    if (tg0Var != null) {
                        if (tg0Var.G) {
                            tg0Var.f();
                        } else {
                            tg0Var.g();
                        }
                    } else {
                        l81 l81Var = photoViewer.F2;
                        if (l81Var != null) {
                            if (l81Var.y()) {
                                l81Var.B();
                            } else {
                                l81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    hh0.f27011p0.z();
                    return;
                }
                return;
            case 8:
                rh0 rh0Var = (rh0) this.f25245b;
                rh0Var.getClass();
                oh0 oh0Var = (oh0) rh0Var;
                ph0 ph0Var = oh0Var.f29475e;
                sh0 sh0Var = (sh0) oh0Var.getTag(R.id.object_tag);
                if (sh0Var.f30787b.size() > 15) {
                    boolean z10 = sh0Var.f30789e;
                    sh0Var.f30789e = !z10;
                    if (!z10) {
                        sh0Var.f30790f = 10;
                    }
                    ph0Var.f29770s.P(oh0Var);
                    ph0Var.f29770s.f31137c.X(true);
                    return;
                }
                return;
            case 9:
                ((hn0) this.f25245b).onBackPressed();
                return;
            case 10:
                co0 co0Var = ((bo0) this.f25245b).f25013c;
                wt.p(co0Var.F, co0Var.G);
                return;
            case 11:
                ci.g2 g2Var = ((do0) this.f25245b).f25777e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                return;
            case 12:
                oo0 oo0Var = (oo0) this.f25245b;
                oo0Var.getClass();
                new rg.y0(oo0Var.f29534b, 24, true).show();
                return;
            case 13:
                ((ep0) this.f25245b).Q(false);
                return;
            case 14:
                sr0 sr0Var = ((qr0) this.f25245b).f30284s;
                ArrayList arrayList = sr0Var.f30846s;
                if (!arrayList.isEmpty()) {
                    sr0Var.f30845r = TextUtils.join(" ", arrayList).toString();
                    sr0Var.f30844n = false;
                    sr0Var.d();
                    sr0Var.f30847w = null;
                    if (sr0Var.f30840b != 0) {
                        sr0Var.f30840b = 0;
                        rr0 rr0Var = sr0Var.H;
                        if (rr0Var != null) {
                            ((org.telegram.ui.vv) rr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                cw0 cw0Var = ((lu0) this.f25245b).f28546f;
                org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) cw0Var.f25474v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((pr0) this.f25245b).run();
                return;
            case 17:
                ((by0) this.f25245b).f25083b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ai.b7) this.f25245b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f25245b).setText("");
                return;
            case 20:
                u21 u21Var = ((w21) this.f25245b).f32577b;
                u21Var.setText("");
                AndroidUtilities.showKeyboard(u21Var);
                return;
            case 21:
                ((f31) this.f25245b).f26266b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((c51) this.f25245b).dismiss();
                return;
            case 23:
                org.telegram.ui.zn znVar = ((org.telegram.ui.al) this.f25245b).f35996s;
                if (!znVar.getUserConfig().isPremium() && ((chat = znVar.f44797e) == null || !chat.autotranslation)) {
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25245b).getSwipeBack().b(true);
                return;
        }
    }
}
