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
public final class l80 implements View.OnClickListener {
    public final int f28397a;
    public final Object f28398b;

    public l80(Object obj, int i10) {
        this.f28397a = i10;
        this.f28398b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f28397a) {
            case 0:
                n80 n80Var = (n80) this.f28398b;
                n80Var.f28994b = true;
                n80Var.dismiss();
                return;
            case 1:
                ((u80) this.f28398b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f28398b).o(2);
                return;
            case 3:
                nc0 nc0Var = (nc0) this.f28398b;
                nc0.b(nc0Var.getContext(), nc0Var.f29023a, nc0Var.f29028n, false, nc0Var.f29032x, new lc0(nc0Var, 0), nc0Var.f29025c);
                return;
            case 4:
                ((md0) this.f28398b).onBackPressed();
                return;
            case 5:
                me0.m((me0) this.f28398b);
                return;
            case 6:
                uf0 uf0Var = (uf0) this.f28398b;
                uf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                vf0 vf0Var = uf0Var.d;
                if (intValue == vf0Var.f31749y) {
                    vf0Var.N = u5Var.getCurrentColor();
                } else {
                    vf0Var.O = u5Var.getCurrentColor();
                }
                yz yzVar = vf0Var.f31732l0;
                if (yzVar != null) {
                    yzVar.e(false, false, false);
                }
                vf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((cg0) this.f28398b).f25416a.f25785y.url)));
                return;
            case 8:
                rg0 rg0Var = (rg0) this.f28398b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    dg0 dg0Var = rg0Var.f30485r;
                    if (dg0Var != null) {
                        if (dg0Var.G) {
                            dg0Var.f();
                        } else {
                            dg0Var.g();
                        }
                    } else {
                        e81 e81Var = photoViewer.F2;
                        if (e81Var != null) {
                            if (e81Var.y()) {
                                e81Var.B();
                            } else {
                                e81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    rg0.f30466p0.z();
                    return;
                }
                return;
            case 9:
                ah0 ah0Var = (ah0) this.f28398b;
                ah0Var.getClass();
                xg0 xg0Var = (xg0) ah0Var;
                yg0 yg0Var = xg0Var.f32882e;
                bh0 bh0Var = (bh0) xg0Var.getTag(R.id.object_tag);
                if (bh0Var.f24976b.size() > 15) {
                    boolean z10 = bh0Var.f24978e;
                    bh0Var.f24978e = !z10;
                    if (!z10) {
                        bh0Var.f24979f = 10;
                    }
                    yg0Var.f33278s.M(xg0Var);
                    yg0Var.f33278s.f25421c.X(true);
                    return;
                }
                return;
            case 10:
                ((sm0) this.f28398b).onBackPressed();
                return;
            case 11:
                on0 on0Var = ((nn0) this.f28398b).f29120c;
                ht.n(on0Var.F, on0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((pn0) this.f28398b).f29770e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                ao0 ao0Var = (ao0) this.f28398b;
                ao0Var.getClass();
                new rg.y0(ao0Var.f24682b, 24, true).show();
                return;
            case 14:
                ((qo0) this.f28398b).S(false);
                return;
            case 15:
                fr0 fr0Var = ((dr0) this.f28398b).f25856s;
                ArrayList arrayList = fr0Var.f26573s;
                if (!arrayList.isEmpty()) {
                    fr0Var.f26572r = TextUtils.join(" ", arrayList).toString();
                    fr0Var.f26571n = false;
                    fr0Var.d();
                    fr0Var.f26574w = null;
                    if (fr0Var.f26567b != 0) {
                        fr0Var.f26567b = 0;
                        er0 er0Var = fr0Var.H;
                        if (er0Var != null) {
                            ((org.telegram.ui.xv) er0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                qv0 qv0Var = ((zt0) this.f28398b).f33641f;
                org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) qv0Var.f30263v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((gq0) this.f28398b).run();
                return;
            case 18:
                ((ux0) this.f28398b).f31549b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f28398b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f28398b).setText("");
                return;
            case 21:
                m21 m21Var = ((o21) this.f28398b).f29323b;
                m21Var.setText("");
                AndroidUtilities.showKeyboard(m21Var);
                return;
            case 22:
                ((y21) this.f28398b).f33159b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((u41) this.f28398b).dismiss();
                return;
            case 24:
                org.telegram.ui.yn ynVar = ((org.telegram.ui.wk) this.f28398b).f42582s;
                if (!ynVar.getUserConfig().isPremium() && ((chat = ynVar.f43315e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + ynVar.a(), 14).commit();
                    ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 13, false));
                } else {
                    ynVar.getMessagesController().getTranslateController().toggleTranslatingDialog(ynVar.a());
                }
                ynVar.Pc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f28398b).getSwipeBack().b(true);
                return;
        }
    }
}
