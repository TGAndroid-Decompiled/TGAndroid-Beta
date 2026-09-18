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
public final class g80 implements View.OnClickListener {
    public final int f24332a;
    public final Object f24333b;

    public g80(Object obj, int i10) {
        this.f24332a = i10;
        this.f24333b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f24332a) {
            case 0:
                i80 i80Var = (i80) this.f24333b;
                i80Var.f24868b = true;
                i80Var.dismiss();
                return;
            case 1:
                ((p80) this.f24333b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f24333b).o(2);
                return;
            case 3:
                ic0 ic0Var = (ic0) this.f24333b;
                ic0.b(ic0Var.getContext(), ic0Var.f24903a, ic0Var.f24907n, false, ic0Var.f24911x, new xp(ic0Var, 29), ic0Var.f24905c);
                return;
            case 4:
                ((jd0) this.f24333b).onBackPressed();
                return;
            case 5:
                je0.m((je0) this.f24333b);
                return;
            case 6:
                rf0 rf0Var = (rf0) this.f24333b;
                rf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                sf0 sf0Var = rf0Var.d;
                if (intValue == sf0Var.f28163y) {
                    sf0Var.N = u5Var.getCurrentColor();
                } else {
                    sf0Var.O = u5Var.getCurrentColor();
                }
                vz vzVar = sf0Var.f28146l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                sf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((yf0) this.f24333b).f30569a.f30792y.url)));
                return;
            case 8:
                pg0 pg0Var = (pg0) this.f24333b;
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null) {
                    zf0 zf0Var = pg0Var.f27227r;
                    if (zf0Var != null) {
                        if (zf0Var.G) {
                            zf0Var.f();
                        } else {
                            zf0Var.g();
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
                    pg0.f27209p0.z();
                    return;
                }
                return;
            case 9:
                yg0 yg0Var = (yg0) this.f24333b;
                yg0Var.getClass();
                vg0 vg0Var = (vg0) yg0Var;
                wg0 wg0Var = vg0Var.e;
                zg0 zg0Var = (zg0) vg0Var.getTag(R.id.object_tag);
                if (zg0Var.f30798b.size() > 15) {
                    boolean z10 = zg0Var.e;
                    zg0Var.e = !z10;
                    if (!z10) {
                        zg0Var.f30800f = 10;
                    }
                    wg0Var.f30046s.O(vg0Var);
                    wg0Var.f30046s.f22609c.X(true);
                    return;
                }
                return;
            case 10:
                ((nm0) this.f24333b).onBackPressed();
                return;
            case 11:
                jn0 jn0Var = ((in0) this.f24333b).f25020c;
                et.n(jn0Var.F, jn0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((kn0) this.f24333b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                vn0 vn0Var = (vn0) this.f24333b;
                vn0Var.getClass();
                new rg.x0(vn0Var.f29141b, 24, true).show();
                return;
            case 14:
                ((lo0) this.f24333b).R(false);
                return;
            case 15:
                ar0 ar0Var = ((yq0) this.f24333b).f30656s;
                ArrayList arrayList = ar0Var.f22708s;
                if (!arrayList.isEmpty()) {
                    ar0Var.f22707r = TextUtils.join(" ", arrayList).toString();
                    ar0Var.f22706n = false;
                    ar0Var.d();
                    ar0Var.f22709w = null;
                    if (ar0Var.f22703b != 0) {
                        ar0Var.f22703b = 0;
                        zq0 zq0Var = ar0Var.H;
                        if (zq0Var != null) {
                            ((org.telegram.ui.xv) zq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                kv0 kv0Var = ((tt0) this.f24333b).f28483f;
                org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) kv0Var.f25848v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((xq0) this.f24333b).run();
                return;
            case 18:
                ((kx0) this.f24333b).f25865b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f24333b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f24333b).setText("");
                return;
            case 21:
                c21 c21Var = ((e21) this.f24333b).f23767b;
                c21Var.setText("");
                AndroidUtilities.showKeyboard(c21Var);
                return;
            case 22:
                ((o21) this.f24333b).f26834b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((k41) this.f24333b).dismiss();
                return;
            case 24:
                org.telegram.ui.zn znVar = ((org.telegram.ui.yk) this.f24333b).f39838s;
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f24333b).getSwipeBack().b(true);
                return;
        }
    }
}
