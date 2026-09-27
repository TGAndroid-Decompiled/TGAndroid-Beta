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
    public final int f25667a;
    public final Object f25668b;

    public k80(Object obj, int i10) {
        this.f25667a = i10;
        this.f25668b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25667a) {
            case 0:
                m80 m80Var = (m80) this.f25668b;
                m80Var.f26387b = true;
                m80Var.dismiss();
                return;
            case 1:
                ((t80) this.f25668b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.a0) this.f25668b).o(2);
                return;
            case 3:
                lc0 lc0Var = (lc0) this.f25668b;
                lc0.b(lc0Var.getContext(), lc0Var.f25997a, lc0Var.f26001n, false, lc0Var.f26005x, new jc0(lc0Var, 0), lc0Var.f25999c);
                return;
            case 4:
                ((kd0) this.f25668b).onBackPressed();
                return;
            case 5:
                ke0.m((ke0) this.f25668b);
                return;
            case 6:
                sf0 sf0Var = (sf0) this.f25668b;
                sf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                tf0 tf0Var = sf0Var.d;
                if (intValue == tf0Var.f28588y) {
                    tf0Var.N = u5Var.getCurrentColor();
                } else {
                    tf0Var.O = u5Var.getCurrentColor();
                }
                xz xzVar = tf0Var.f28571l0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
                tf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ag0) this.f25668b).f22675a.f23019y.url)));
                return;
            case 8:
                rg0 rg0Var = (rg0) this.f25668b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    bg0 bg0Var = rg0Var.f27995r;
                    if (bg0Var != null) {
                        if (bg0Var.G) {
                            bg0Var.f();
                        } else {
                            bg0Var.g();
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
                    rg0.f27977p0.z();
                    return;
                }
                return;
            case 9:
                ah0 ah0Var = (ah0) this.f25668b;
                ah0Var.getClass();
                xg0 xg0Var = (xg0) ah0Var;
                yg0 yg0Var = xg0Var.e;
                bh0 bh0Var = (bh0) xg0Var.getTag(R.id.object_tag);
                if (bh0Var.f23024b.size() > 15) {
                    boolean z10 = bh0Var.e;
                    bh0Var.e = !z10;
                    if (!z10) {
                        bh0Var.f23026f = 10;
                    }
                    yg0Var.f30664s.O(xg0Var);
                    yg0Var.f30664s.f23322c.X(true);
                    return;
                }
                return;
            case 10:
                ((om0) this.f25668b).onBackPressed();
                return;
            case 11:
                kn0 kn0Var = ((jn0) this.f25668b).f25513c;
                gt.n(kn0Var.F, kn0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((ln0) this.f25668b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                wn0 wn0Var = (wn0) this.f25668b;
                wn0Var.getClass();
                new rg.x0(wn0Var.f30119b, 24, true).show();
                return;
            case 14:
                ((mo0) this.f25668b).R(false);
                return;
            case 15:
                ar0 ar0Var = ((yq0) this.f25668b).f30768s;
                ArrayList arrayList = ar0Var.f22745s;
                if (!arrayList.isEmpty()) {
                    ar0Var.f22744r = TextUtils.join(" ", arrayList).toString();
                    ar0Var.f22743n = false;
                    ar0Var.d();
                    ar0Var.f22746w = null;
                    if (ar0Var.f22740b != 0) {
                        ar0Var.f22740b = 0;
                        zq0 zq0Var = ar0Var.H;
                        if (zq0Var != null) {
                            ((org.telegram.ui.wv) zq0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                lv0 lv0Var = ((ut0) this.f25668b).f28941f;
                org.telegram.ui.ActionBar.o2 o2Var = lv0Var.f26212v1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) lv0Var.f26212v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((xq0) this.f25668b).run();
                return;
            case 18:
                ((kx0) this.f25668b).f25879b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f25668b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f25668b).setText("");
                return;
            case 21:
                c21 c21Var = ((e21) this.f25668b).f23856b;
                c21Var.setText("");
                AndroidUtilities.showKeyboard(c21Var);
                return;
            case 22:
                ((o21) this.f25668b).f26946b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((k41) this.f25668b).dismiss();
                return;
            case 24:
                org.telegram.ui.xn xnVar = ((org.telegram.ui.yk) this.f25668b).f40270s;
                if (!xnVar.getUserConfig().isPremium() && ((chat = xnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + xnVar.a(), 14).commit();
                    xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) xnVar, 13, false));
                } else {
                    xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a());
                }
                xnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25668b).getSwipeBack().b(true);
                return;
        }
    }
}
