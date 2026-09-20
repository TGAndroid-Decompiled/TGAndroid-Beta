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
public final class f80 implements View.OnClickListener {
    public final int f24027a;
    public final Object f24028b;

    public f80(Object obj, int i10) {
        this.f24027a = i10;
        this.f24028b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f24027a) {
            case 0:
                h80 h80Var = (h80) this.f24028b;
                h80Var.f24566b = true;
                h80Var.dismiss();
                return;
            case 1:
                ((o80) this.f24028b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f24028b).o(2);
                return;
            case 3:
                hc0 hc0Var = (hc0) this.f24028b;
                hc0.b(hc0Var.getContext(), hc0Var.f24606a, hc0Var.f24610n, false, hc0Var.f24614x, new xp(hc0Var, 29), hc0Var.f24608c);
                return;
            case 4:
                ((id0) this.f24028b).onBackPressed();
                return;
            case 5:
                ie0.m((ie0) this.f24028b);
                return;
            case 6:
                qf0 qf0Var = (qf0) this.f24028b;
                qf0Var.getClass();
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                int intValue = ((Integer) v5Var.getTag()).intValue();
                rf0 rf0Var = qf0Var.d;
                if (intValue == rf0Var.f27888y) {
                    rf0Var.N = v5Var.getCurrentColor();
                } else {
                    rf0Var.O = v5Var.getCurrentColor();
                }
                vz vzVar = rf0Var.f27871l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                rf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((xf0) this.f24028b).f30258a.f30522y.url)));
                return;
            case 8:
                og0 og0Var = (og0) this.f24028b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    yf0 yf0Var = og0Var.f26930r;
                    if (yf0Var != null) {
                        if (yf0Var.G) {
                            yf0Var.f();
                        } else {
                            yf0Var.g();
                        }
                    } else {
                        t71 t71Var = photoViewer.F2;
                        if (t71Var != null) {
                            if (t71Var.y()) {
                                t71Var.B();
                            } else {
                                t71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    og0.f26912p0.z();
                    return;
                }
                return;
            case 9:
                xg0 xg0Var = (xg0) this.f24028b;
                xg0Var.getClass();
                ug0 ug0Var = (ug0) xg0Var;
                vg0 vg0Var = ug0Var.e;
                yg0 yg0Var = (yg0) ug0Var.getTag(R.id.object_tag);
                if (yg0Var.f30528b.size() > 15) {
                    boolean z10 = yg0Var.e;
                    yg0Var.e = !z10;
                    if (!z10) {
                        yg0Var.f30530f = 10;
                    }
                    vg0Var.f29077s.O(ug0Var);
                    vg0Var.f29077s.f30817c.X(true);
                    return;
                }
                return;
            case 10:
                ((mm0) this.f24028b).onBackPressed();
                return;
            case 11:
                in0 in0Var = ((hn0) this.f24028b).f24726c;
                et.n(in0Var.F, in0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((jn0) this.f24028b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                un0 un0Var = (un0) this.f24028b;
                un0Var.getClass();
                new rg.x0(un0Var.f28777b, 24, true).show();
                return;
            case 14:
                ((lo0) this.f24028b).R(false);
                return;
            case 15:
                zq0 zq0Var = ((xq0) this.f24028b).f30352s;
                ArrayList arrayList = zq0Var.f30907s;
                if (!arrayList.isEmpty()) {
                    zq0Var.f30906r = TextUtils.join(" ", arrayList).toString();
                    zq0Var.f30905n = false;
                    zq0Var.d();
                    zq0Var.f30908w = null;
                    if (zq0Var.f30902b != 0) {
                        zq0Var.f30902b = 0;
                        yq0 yq0Var = zq0Var.H;
                        if (yq0Var != null) {
                            ((org.telegram.ui.xv) yq0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                jv0 jv0Var = ((st0) this.f24028b).f28213f;
                org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) jv0Var.f25528v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((wq0) this.f24028b).run();
                return;
            case 18:
                ((jx0) this.f24028b).f25549b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f24028b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f24028b).setText("");
                return;
            case 21:
                b21 b21Var = ((d21) this.f24028b).f23471b;
                b21Var.setText("");
                AndroidUtilities.showKeyboard(b21Var);
                return;
            case 22:
                ((n21) this.f24028b).f26546b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((j41) this.f24028b).dismiss();
                return;
            case 24:
                org.telegram.ui.zn znVar = ((org.telegram.ui.yk) this.f24028b).f39952s;
                if (!znVar.getUserConfig().isPremium() && ((chat = znVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + znVar.a(), 14).commit();
                    znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 13, false));
                } else {
                    znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a());
                }
                znVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f24028b).getSwipeBack().b(true);
                return;
        }
    }
}
