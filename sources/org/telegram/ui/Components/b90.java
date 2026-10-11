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
    public final int f24945a;
    public final Object f24946b;

    public b90(Object obj, int i10) {
        this.f24945a = i10;
        this.f24946b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f24945a) {
            case 0:
                ((i90) this.f24946b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f24946b).o(2);
                return;
            case 2:
                ad0 ad0Var = (ad0) this.f24946b;
                ad0.b(ad0Var.getContext(), ad0Var.f24563a, ad0Var.f24568n, false, ad0Var.f24572x, new yc0(ad0Var, 0), ad0Var.f24565c);
                return;
            case 3:
                ((be0) this.f24946b).onBackPressed();
                return;
            case 4:
                cf0.o((cf0) this.f24946b);
                return;
            case 5:
                kg0 kg0Var = (kg0) this.f24946b;
                kg0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                lg0 lg0Var = kg0Var.d;
                if (intValue == lg0Var.f28412y) {
                    lg0Var.N = u5Var.getCurrentColor();
                } else {
                    lg0Var.O = u5Var.getCurrentColor();
                }
                m00 m00Var = lg0Var.f28395l0;
                if (m00Var != null) {
                    m00Var.e(false, false, false);
                }
                lg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((sg0) this.f24946b).f30862a.f31249y.url)));
                return;
            case 7:
                hh0 hh0Var = (hh0) this.f24946b;
                PhotoViewer photoViewer = hh0Var.V;
                if (photoViewer != null) {
                    tg0 tg0Var = hh0Var.f27120r;
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
                    hh0.f27101p0.z();
                    return;
                }
                return;
            case 8:
                rh0 rh0Var = (rh0) this.f24946b;
                rh0Var.getClass();
                oh0 oh0Var = (oh0) rh0Var;
                ph0 ph0Var = oh0Var.f29507e;
                sh0 sh0Var = (sh0) oh0Var.getTag(R.id.object_tag);
                if (sh0Var.f30867b.size() > 15) {
                    boolean z10 = sh0Var.f30869e;
                    sh0Var.f30869e = !z10;
                    if (!z10) {
                        sh0Var.f30870f = 10;
                    }
                    ph0Var.f29873s.P(oh0Var);
                    ph0Var.f29873s.f31256c.X(true);
                    return;
                }
                return;
            case 9:
                ((hn0) this.f24946b).onBackPressed();
                return;
            case 10:
                co0 co0Var = ((bo0) this.f24946b).f25052c;
                wt.p(co0Var.F, co0Var.G);
                return;
            case 11:
                ci.g2 g2Var = ((do0) this.f24946b).f25855e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                return;
            case 12:
                oo0 oo0Var = (oo0) this.f24946b;
                oo0Var.getClass();
                new rg.y0(oo0Var.f29566b, 24, true).show();
                return;
            case 13:
                ((ep0) this.f24946b).Q(false);
                return;
            case 14:
                sr0 sr0Var = ((qr0) this.f24946b).f30318s;
                ArrayList arrayList = sr0Var.f30926s;
                if (!arrayList.isEmpty()) {
                    sr0Var.f30925r = TextUtils.join(" ", arrayList).toString();
                    sr0Var.f30924n = false;
                    sr0Var.d();
                    sr0Var.f30927w = null;
                    if (sr0Var.f30920b != 0) {
                        sr0Var.f30920b = 0;
                        rr0 rr0Var = sr0Var.H;
                        if (rr0Var != null) {
                            ((org.telegram.ui.uv) rr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                cw0 cw0Var = ((lu0) this.f24946b).f28622f;
                org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) cw0Var.f25536v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((pr0) this.f24946b).run();
                return;
            case 17:
                ((by0) this.f24946b).f25121b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ai.b7) this.f24946b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f24946b).setText("");
                return;
            case 20:
                u21 u21Var = ((w21) this.f24946b).f32614b;
                u21Var.setText("");
                AndroidUtilities.showKeyboard(u21Var);
                return;
            case 21:
                ((f31) this.f24946b).f26308b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((c51) this.f24946b).dismiss();
                return;
            case 23:
                org.telegram.ui.zn znVar = ((org.telegram.ui.al) this.f24946b).f36139s;
                if (!znVar.getUserConfig().isPremium() && ((chat = znVar.f44786e) == null || !chat.autotranslation)) {
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f24946b).getSwipeBack().b(true);
                return;
        }
    }
}
