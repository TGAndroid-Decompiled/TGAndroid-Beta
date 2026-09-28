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
public final class k80 implements View.OnClickListener {
    public final int f25640a;
    public final Object f25641b;

    public k80(Object obj, int i10) {
        this.f25640a = i10;
        this.f25641b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25640a) {
            case 0:
                m80 m80Var = (m80) this.f25641b;
                m80Var.f26332b = true;
                m80Var.dismiss();
                return;
            case 1:
                ((t80) this.f25641b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.y) this.f25641b).o(2);
                return;
            case 3:
                mc0 mc0Var = (mc0) this.f25641b;
                mc0.b(mc0Var.getContext(), mc0Var.f26371a, mc0Var.f26375n, false, mc0Var.f26379x, new kc0(mc0Var, 0), mc0Var.f26373c);
                return;
            case 4:
                ((md0) this.f25641b).onBackPressed();
                return;
            case 5:
                me0.m((me0) this.f25641b);
                return;
            case 6:
                uf0 uf0Var = (uf0) this.f25641b;
                uf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                vf0 vf0Var = uf0Var.d;
                if (intValue == vf0Var.f29088y) {
                    vf0Var.N = u5Var.getCurrentColor();
                } else {
                    vf0Var.O = u5Var.getCurrentColor();
                }
                xz xzVar = vf0Var.f29071l0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
                vf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((bg0) this.f25641b).f22998a.f23302y.url)));
                return;
            case 8:
                qg0 qg0Var = (qg0) this.f25641b;
                PhotoViewer photoViewer = qg0Var.V;
                if (photoViewer != null) {
                    cg0 cg0Var = qg0Var.f27709r;
                    if (cg0Var != null) {
                        if (cg0Var.G) {
                            cg0Var.f();
                        } else {
                            cg0Var.g();
                        }
                    } else {
                        u71 u71Var = photoViewer.F2;
                        if (u71Var != null) {
                            if (u71Var.y()) {
                                u71Var.B();
                            } else {
                                u71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    qg0.f27691p0.z();
                    return;
                }
                return;
            case 9:
                ah0 ah0Var = (ah0) this.f25641b;
                ah0Var.getClass();
                xg0 xg0Var = (xg0) ah0Var;
                yg0 yg0Var = xg0Var.e;
                bh0 bh0Var = (bh0) xg0Var.getTag(R.id.object_tag);
                if (bh0Var.f23003b.size() > 15) {
                    boolean z10 = bh0Var.e;
                    bh0Var.e = !z10;
                    if (!z10) {
                        bh0Var.f23005f = 10;
                    }
                    yg0Var.f30661s.O(xg0Var);
                    yg0Var.f30661s.f23304c.X(true);
                    return;
                }
                return;
            case 10:
                ((om0) this.f25641b).onBackPressed();
                return;
            case 11:
                kn0 kn0Var = ((jn0) this.f25641b).f25493c;
                gt.n(kn0Var.F, kn0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((ln0) this.f25641b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                wn0 wn0Var = (wn0) this.f25641b;
                wn0Var.getClass();
                new rg.x0(wn0Var.f30100b, 24, true).show();
                return;
            case 14:
                ((no0) this.f25641b).Q(false);
                return;
            case 15:
                br0 br0Var = ((zq0) this.f25641b).f30960s;
                ArrayList arrayList = br0Var.f23098s;
                if (!arrayList.isEmpty()) {
                    br0Var.f23097r = TextUtils.join(" ", arrayList).toString();
                    br0Var.f23096n = false;
                    br0Var.d();
                    br0Var.f23099w = null;
                    if (br0Var.f23093b != 0) {
                        br0Var.f23093b = 0;
                        ar0 ar0Var = br0Var.H;
                        if (ar0Var != null) {
                            ((org.telegram.ui.sv) ar0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                lv0 lv0Var = ((ut0) this.f25641b).f28887f;
                org.telegram.ui.ActionBar.m2 m2Var = lv0Var.f26160v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) lv0Var.f26160v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((yq0) this.f25641b).run();
                return;
            case 18:
                ((kx0) this.f25641b).f25856b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f25641b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f25641b).setText("");
                return;
            case 21:
                c21 c21Var = ((e21) this.f25641b).f23842b;
                c21Var.setText("");
                AndroidUtilities.showKeyboard(c21Var);
                return;
            case 22:
                ((o21) this.f25641b).f26912b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((k41) this.f25641b).dismiss();
                return;
            case 24:
                org.telegram.ui.wn wnVar = ((org.telegram.ui.wk) this.f25641b).f39391s;
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25641b).getSwipeBack().b(true);
                return;
        }
    }
}
