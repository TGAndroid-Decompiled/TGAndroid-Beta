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
public final class i80 implements View.OnClickListener {
    public final int f24970a;
    public final Object f24971b;

    public i80(Object obj, int i10) {
        this.f24970a = i10;
        this.f24971b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f24970a) {
            case 0:
                k80 k80Var = (k80) this.f24971b;
                k80Var.f25707b = true;
                k80Var.dismiss();
                return;
            case 1:
                ((r80) this.f24971b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.y) this.f24971b).o(2);
                return;
            case 3:
                kc0 kc0Var = (kc0) this.f24971b;
                kc0.b(kc0Var.getContext(), kc0Var.f25748a, kc0Var.f25752n, false, kc0Var.f25756x, new ic0(kc0Var, 0), kc0Var.f25750c);
                return;
            case 4:
                ((kd0) this.f24971b).onBackPressed();
                return;
            case 5:
                ke0.m((ke0) this.f24971b);
                return;
            case 6:
                sf0 sf0Var = (sf0) this.f24971b;
                sf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                tf0 tf0Var = sf0Var.d;
                if (intValue == tf0Var.f28513y) {
                    tf0Var.N = u5Var.getCurrentColor();
                } else {
                    tf0Var.O = u5Var.getCurrentColor();
                }
                wz wzVar = tf0Var.f28496l0;
                if (wzVar != null) {
                    wzVar.e(false, false, false);
                }
                tf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((zf0) this.f24971b).f30865a.f22684y.url)));
                return;
            case 8:
                og0 og0Var = (og0) this.f24971b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    ag0 ag0Var = og0Var.f27064r;
                    if (ag0Var != null) {
                        if (ag0Var.G) {
                            ag0Var.f();
                        } else {
                            ag0Var.g();
                        }
                    } else {
                        s71 s71Var = photoViewer.F2;
                        if (s71Var != null) {
                            if (s71Var.y()) {
                                s71Var.B();
                            } else {
                                s71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    og0.f27046p0.z();
                    return;
                }
                return;
            case 9:
                yg0 yg0Var = (yg0) this.f24971b;
                yg0Var.getClass();
                vg0 vg0Var = (vg0) yg0Var;
                wg0 wg0Var = vg0Var.e;
                zg0 zg0Var = (zg0) vg0Var.getTag(R.id.object_tag);
                if (zg0Var.f30871b.size() > 15) {
                    boolean z10 = zg0Var.e;
                    zg0Var.e = !z10;
                    if (!z10) {
                        zg0Var.f30873f = 10;
                    }
                    wg0Var.f29984s.O(vg0Var);
                    wg0Var.f29984s.f22690c.X(true);
                    return;
                }
                return;
            case 10:
                ((mm0) this.f24971b).onBackPressed();
                return;
            case 11:
                in0 in0Var = ((hn0) this.f24971b).f24842c;
                ft.n(in0Var.F, in0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((jn0) this.f24971b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                un0 un0Var = (un0) this.f24971b;
                un0Var.getClass();
                new rg.x0(un0Var.f28841b, 24, true).show();
                return;
            case 14:
                ((lo0) this.f24971b).Q(false);
                return;
            case 15:
                zq0 zq0Var = ((xq0) this.f24971b).f30392s;
                ArrayList arrayList = zq0Var.f30968s;
                if (!arrayList.isEmpty()) {
                    zq0Var.f30967r = TextUtils.join(" ", arrayList).toString();
                    zq0Var.f30966n = false;
                    zq0Var.d();
                    zq0Var.f30969w = null;
                    if (zq0Var.f30963b != 0) {
                        zq0Var.f30963b = 0;
                        yq0 yq0Var = zq0Var.H;
                        if (yq0Var != null) {
                            ((org.telegram.ui.sv) yq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                jv0 jv0Var = ((st0) this.f24971b).f28326f;
                org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25559v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) jv0Var.f25559v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((wq0) this.f24971b).run();
                return;
            case 18:
                ((ix0) this.f24971b).f25189b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f24971b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f24971b).setText("");
                return;
            case 21:
                a21 a21Var = ((c21) this.f24971b).f23166b;
                a21Var.setText("");
                AndroidUtilities.showKeyboard(a21Var);
                return;
            case 22:
                ((m21) this.f24971b).f26341b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((i41) this.f24971b).dismiss();
                return;
            case 24:
                org.telegram.ui.wn wnVar = ((org.telegram.ui.wk) this.f24971b).f39390s;
                if (!wnVar.getUserConfig().isPremium() && ((chat = wnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + wnVar.a(), 14).commit();
                    wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 13, false));
                } else {
                    wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a());
                }
                wnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f24971b).getSwipeBack().b(true);
                return;
        }
    }
}
