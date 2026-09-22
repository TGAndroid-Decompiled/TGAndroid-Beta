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
    public final int f25031a;
    public final Object f25032b;

    public i80(Object obj, int i10) {
        this.f25031a = i10;
        this.f25032b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25031a) {
            case 0:
                k80 k80Var = (k80) this.f25032b;
                k80Var.f25645b = true;
                k80Var.dismiss();
                return;
            case 1:
                ((r80) this.f25032b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f25032b).o(2);
                return;
            case 3:
                lc0 lc0Var = (lc0) this.f25032b;
                lc0.b(lc0Var.getContext(), lc0Var.f26053a, lc0Var.f26057n, false, lc0Var.f26061x, new jc0(lc0Var, 0), lc0Var.f26055c);
                return;
            case 4:
                ((ld0) this.f25032b).onBackPressed();
                return;
            case 5:
                le0.m((le0) this.f25032b);
                return;
            case 6:
                tf0 tf0Var = (tf0) this.f25032b;
                tf0Var.getClass();
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                int intValue = ((Integer) v5Var.getTag()).intValue();
                uf0 uf0Var = tf0Var.d;
                if (intValue == uf0Var.f28755y) {
                    uf0Var.N = v5Var.getCurrentColor();
                } else {
                    uf0Var.O = v5Var.getCurrentColor();
                }
                vz vzVar = uf0Var.f28738l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                uf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ag0) this.f25032b).f22654a.f22992y.url)));
                return;
            case 8:
                rg0 rg0Var = (rg0) this.f25032b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    bg0 bg0Var = rg0Var.f27978r;
                    if (bg0Var != null) {
                        if (bg0Var.G) {
                            bg0Var.f();
                        } else {
                            bg0Var.g();
                        }
                    } else {
                        v71 v71Var = photoViewer.F2;
                        if (v71Var != null) {
                            if (v71Var.y()) {
                                v71Var.B();
                            } else {
                                v71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    rg0.f27960p0.z();
                    return;
                }
                return;
            case 9:
                ah0 ah0Var = (ah0) this.f25032b;
                ah0Var.getClass();
                xg0 xg0Var = (xg0) ah0Var;
                yg0 yg0Var = xg0Var.e;
                bh0 bh0Var = (bh0) xg0Var.getTag(R.id.object_tag);
                if (bh0Var.f22994b.size() > 15) {
                    boolean z10 = bh0Var.e;
                    bh0Var.e = !z10;
                    if (!z10) {
                        bh0Var.f22996f = 10;
                    }
                    yg0Var.f30652s.O(xg0Var);
                    yg0Var.f30652s.f23358c.X(true);
                    return;
                }
                return;
            case 10:
                ((om0) this.f25032b).onBackPressed();
                return;
            case 11:
                kn0 kn0Var = ((jn0) this.f25032b).f25416c;
                et.n(kn0Var.F, kn0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((ln0) this.f25032b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                wn0 wn0Var = (wn0) this.f25032b;
                wn0Var.getClass();
                new rg.x0(wn0Var.f30075b, 24, true).show();
                return;
            case 14:
                ((no0) this.f25032b).R(false);
                return;
            case 15:
                br0 br0Var = ((zq0) this.f25032b).f30944s;
                ArrayList arrayList = br0Var.f23084s;
                if (!arrayList.isEmpty()) {
                    br0Var.f23083r = TextUtils.join(" ", arrayList).toString();
                    br0Var.f23082n = false;
                    br0Var.d();
                    br0Var.f23085w = null;
                    if (br0Var.f23079b != 0) {
                        br0Var.f23079b = 0;
                        ar0 ar0Var = br0Var.H;
                        if (ar0Var != null) {
                            ((org.telegram.ui.xv) ar0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                lv0 lv0Var = ((ut0) this.f25032b).f28899f;
                org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) lv0Var.f26234v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((yq0) this.f25032b).run();
                return;
            case 18:
                ((lx0) this.f25032b).f26252b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f25032b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f25032b).setText("");
                return;
            case 21:
                d21 d21Var = ((f21) this.f25032b).f24087b;
                d21Var.setText("");
                AndroidUtilities.showKeyboard(d21Var);
                return;
            case 22:
                ((p21) this.f25032b).f27234b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((l41) this.f25032b).dismiss();
                return;
            case 24:
                org.telegram.ui.zn znVar = ((org.telegram.ui.zk) this.f25032b).f40248s;
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25032b).getSwipeBack().b(true);
                return;
        }
    }
}
