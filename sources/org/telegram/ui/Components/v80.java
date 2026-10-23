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
public final class v80 implements View.OnClickListener {
    public final int f31382a;
    public final Object f31383b;

    public v80(Object obj, int i10) {
        this.f31382a = i10;
        this.f31383b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f31382a) {
            case 0:
                ((b90) this.f31383b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f31383b).o(2);
                return;
            case 2:
                vc0 vc0Var = (vc0) this.f31383b;
                vc0.b(vc0Var.getContext(), vc0Var.f31408a, vc0Var.f31412n, false, vc0Var.f31416x, new yb0(vc0Var, 1), vc0Var.f31410c);
                return;
            case 3:
                ((wd0) this.f31383b).onBackPressed();
                return;
            case 4:
                xe0.m((xe0) this.f31383b);
                return;
            case 5:
                gg0 gg0Var = (gg0) this.f31383b;
                gg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                hg0 hg0Var = gg0Var.d;
                if (intValue == hg0Var.f26949y) {
                    hg0Var.N = t5Var.getCurrentColor();
                } else {
                    hg0Var.O = t5Var.getCurrentColor();
                }
                e00 e00Var = hg0Var.f26932l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                hg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((og0) this.f31383b).f29171a.f29559y.url)));
                return;
            case 7:
                dh0 dh0Var = (dh0) this.f31383b;
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null) {
                    pg0 pg0Var = dh0Var.f25649r;
                    if (pg0Var != null) {
                        if (pg0Var.G) {
                            pg0Var.f();
                        } else {
                            pg0Var.g();
                        }
                    } else {
                        j81 j81Var = photoViewer.F2;
                        if (j81Var != null) {
                            if (j81Var.y()) {
                                j81Var.B();
                            } else {
                                j81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    dh0.f25631p0.z();
                    return;
                }
                return;
            case 8:
                mh0 mh0Var = (mh0) this.f31383b;
                mh0Var.getClass();
                jh0 jh0Var = (jh0) mh0Var;
                kh0 kh0Var = jh0Var.e;
                nh0 nh0Var = (nh0) jh0Var.getTag(R.id.object_tag);
                if (nh0Var.f28950b.size() > 15) {
                    boolean z10 = nh0Var.e;
                    nh0Var.e = !z10;
                    if (!z10) {
                        nh0Var.f28952f = 10;
                    }
                    kh0Var.f28040s.Q(jh0Var);
                    kh0Var.f28040s.f29176c.X(true);
                    return;
                }
                return;
            case 9:
                ((cn0) this.f31383b).onBackPressed();
                return;
            case 10:
                xn0 xn0Var = ((wn0) this.f31383b).f32277c;
                nt.n(xn0Var.F, xn0Var.G);
                return;
            case 11:
                ei.e2 e2Var = ((yn0) this.f31383b).d;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                return;
            case 12:
                jo0 jo0Var = (jo0) this.f31383b;
                jo0Var.getClass();
                new sg.y0(jo0Var.f27723b, 24, true).show();
                return;
            case 13:
                ((ap0) this.f31383b).P(false);
                return;
            case 14:
                nr0 nr0Var = ((lr0) this.f31383b).f28418s;
                ArrayList arrayList = nr0Var.f29008s;
                if (!arrayList.isEmpty()) {
                    nr0Var.f29007r = TextUtils.join(" ", arrayList).toString();
                    nr0Var.f29006n = false;
                    nr0Var.d();
                    nr0Var.f29009w = null;
                    if (nr0Var.f29003b != 0) {
                        nr0Var.f29003b = 0;
                        mr0 mr0Var = nr0Var.H;
                        if (mr0Var != null) {
                            ((org.telegram.ui.jv) mr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                xv0 xv0Var = ((gu0) this.f31383b).f26716f;
                org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) xv0Var.f32711v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((kr0) this.f31383b).run();
                return;
            case 17:
                ((wx0) this.f31383b).f32371b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ci.k5) this.f31383b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f31383b).setText("");
                return;
            case 20:
                o21 o21Var = ((q21) this.f31383b).f29762b;
                o21Var.setText("");
                AndroidUtilities.showKeyboard(o21Var);
                return;
            case 21:
                ((a31) this.f31383b).f24619b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((y41) this.f31383b).dismiss();
                return;
            case 23:
                org.telegram.ui.sn snVar = ((org.telegram.ui.sk) this.f31383b).f41429y;
                if (!snVar.getUserConfig().isPremium() && ((chat = snVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + snVar.a(), 14).commit();
                    snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 13, false));
                } else {
                    snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a());
                }
                snVar.Xc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f31383b).getSwipeBack().b(true);
                return;
        }
    }
}
