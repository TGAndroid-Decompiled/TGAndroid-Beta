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
public final class u80 implements View.OnClickListener {
    public final int f30913a;
    public final Object f30914b;

    public u80(Object obj, int i10) {
        this.f30913a = i10;
        this.f30914b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f30913a) {
            case 0:
                ((a90) this.f30914b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f30914b).o(2);
                return;
            case 2:
                tc0 tc0Var = (tc0) this.f30914b;
                tc0.b(tc0Var.getContext(), tc0Var.f30517a, tc0Var.f30521n, false, tc0Var.f30525x, new rc0(tc0Var, 0), tc0Var.f30519c);
                return;
            case 3:
                ((td0) this.f30914b).onBackPressed();
                return;
            case 4:
                te0.n((te0) this.f30914b);
                return;
            case 5:
                bg0 bg0Var = (bg0) this.f30914b;
                bg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                cg0 cg0Var = bg0Var.d;
                if (intValue == cg0Var.f25243y) {
                    cg0Var.N = t5Var.getCurrentColor();
                } else {
                    cg0Var.O = t5Var.getCurrentColor();
                }
                e00 e00Var = cg0Var.f25226l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                cg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((jg0) this.f30914b).f27530a.f27879y.url)));
                return;
            case 7:
                zg0 zg0Var = (zg0) this.f30914b;
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null) {
                    kg0 kg0Var = zg0Var.f32930r;
                    if (kg0Var != null) {
                        if (kg0Var.G) {
                            kg0Var.f();
                        } else {
                            kg0Var.g();
                        }
                    } else {
                        a81 a81Var = photoViewer.F2;
                        if (a81Var != null) {
                            if (a81Var.y()) {
                                a81Var.B();
                            } else {
                                a81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    zg0.f32912p0.z();
                    return;
                }
                return;
            case 8:
                ih0 ih0Var = (ih0) this.f30914b;
                ih0Var.getClass();
                fh0 fh0Var = (fh0) ih0Var;
                gh0 gh0Var = fh0Var.e;
                jh0 jh0Var = (jh0) fh0Var.getTag(R.id.object_tag);
                if (jh0Var.f27534b.size() > 15) {
                    boolean z10 = jh0Var.e;
                    jh0Var.e = !z10;
                    if (!z10) {
                        jh0Var.f27536f = 10;
                    }
                    gh0Var.f26574s.P(fh0Var);
                    gh0Var.f26574s.f27883c.X(true);
                    return;
                }
                return;
            case 9:
                ((ym0) this.f30914b).onBackPressed();
                return;
            case 10:
                tn0 tn0Var = ((sn0) this.f30914b).f30306c;
                nt.o(tn0Var.F, tn0Var.G);
                return;
            case 11:
                ei.e2 e2Var = ((un0) this.f30914b).e;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                return;
            case 12:
                fo0 fo0Var = (fo0) this.f30914b;
                fo0Var.getClass();
                new sg.x0(fo0Var.f26328b, 24, true).show();
                return;
            case 13:
                ((vo0) this.f30914b).Q(false);
                return;
            case 14:
                ir0 ir0Var = ((gr0) this.f30914b).f26668s;
                ArrayList arrayList = ir0Var.f27351s;
                if (!arrayList.isEmpty()) {
                    ir0Var.f27350r = TextUtils.join(" ", arrayList).toString();
                    ir0Var.f27349n = false;
                    ir0Var.d();
                    ir0Var.f27352w = null;
                    if (ir0Var.f27346b != 0) {
                        ir0Var.f27346b = 0;
                        hr0 hr0Var = ir0Var.H;
                        if (hr0Var != null) {
                            ((org.telegram.ui.jv) hr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                sv0 sv0Var = ((bu0) this.f30914b).f25054f;
                org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30395v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) sv0Var.f30395v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((fr0) this.f30914b).run();
                return;
            case 17:
                ((rx0) this.f30914b).f30079b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ci.l5) this.f30914b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f30914b).setText("");
                return;
            case 20:
                j21 j21Var = ((l21) this.f30914b).f28062b;
                j21Var.setText("");
                AndroidUtilities.showKeyboard(j21Var);
                return;
            case 21:
                ((u21) this.f30914b).f30871b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((r41) this.f30914b).dismiss();
                return;
            case 23:
                org.telegram.ui.sn snVar = ((org.telegram.ui.tk) this.f30914b).f41787s;
                if (!snVar.getUserConfig().isPremium() && ((chat = snVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + snVar.a(), 14).commit();
                    snVar.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) snVar, 13, false));
                } else {
                    snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a());
                }
                snVar.Uc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f30914b).getSwipeBack().b(true);
                return;
        }
    }
}
