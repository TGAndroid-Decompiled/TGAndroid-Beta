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
    public final int f23267a;
    public final Object f23268b;

    public g80(Object obj, int i10) {
        this.f23267a = i10;
        this.f23268b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f23267a) {
            case 0:
                i80 i80Var = (i80) this.f23268b;
                i80Var.f23924b = true;
                i80Var.dismiss();
                return;
            case 1:
                ((q80) this.f23268b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f23268b).o(2);
                return;
            case 3:
                ic0 ic0Var = (ic0) this.f23268b;
                ic0.b(ic0Var.getContext(), ic0Var.f23992a, ic0Var.f23996n, false, ic0Var.f24000x, new dq(ic0Var, 29), ic0Var.f23994c);
                return;
            case 4:
                ((id0) this.f23268b).onBackPressed();
                return;
            case 5:
                je0.m((je0) this.f23268b);
                return;
            case 6:
                rf0 rf0Var = (rf0) this.f23268b;
                rf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                sf0 sf0Var = rf0Var.d;
                if (intValue == sf0Var.f27043y) {
                    sf0Var.N = u5Var.getCurrentColor();
                } else {
                    sf0Var.O = u5Var.getCurrentColor();
                }
                c00 c00Var = sf0Var.f27026l0;
                if (c00Var != null) {
                    c00Var.e(false, false, false);
                }
                sf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((yf0) this.f23268b).f29318a.f29667y.url)));
                return;
            case 8:
                og0 og0Var = (og0) this.f23268b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    zf0 zf0Var = og0Var.f25799r;
                    if (zf0Var != null) {
                        if (zf0Var.G) {
                            zf0Var.f();
                        } else {
                            zf0Var.g();
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
                    og0.f25781p0.z();
                    return;
                }
                return;
            case 9:
                xg0 xg0Var = (xg0) this.f23268b;
                xg0Var.getClass();
                ug0 ug0Var = (ug0) xg0Var;
                vg0 vg0Var = ug0Var.e;
                yg0 yg0Var = (yg0) ug0Var.getTag(R.id.object_tag);
                if (yg0Var.f29323b.size() > 15) {
                    boolean z10 = yg0Var.e;
                    yg0Var.e = !z10;
                    if (!z10) {
                        yg0Var.f29325f = 10;
                    }
                    vg0Var.f27934s.O(ug0Var);
                    vg0Var.f27934s.f29679c.X(true);
                    return;
                }
                return;
            case 10:
                ((km0) this.f23268b).onBackPressed();
                return;
            case 11:
                fn0 fn0Var = ((en0) this.f23268b).f22732c;
                kt.n(fn0Var.F, fn0Var.G);
                return;
            case 12:
                bi.t2 t2Var = ((gn0) this.f23268b).e;
                t2Var.setText("");
                AndroidUtilities.showKeyboard(t2Var);
                return;
            case 13:
                rn0 rn0Var = (rn0) this.f23268b;
                rn0Var.getClass();
                new qg.a1(rn0Var.f26698b, 24, true).show();
                return;
            case 14:
                ((ho0) this.f23268b).Q(false);
                return;
            case 15:
                xq0 xq0Var = ((vq0) this.f23268b).f28588s;
                ArrayList arrayList = xq0Var.f29132s;
                if (!arrayList.isEmpty()) {
                    xq0Var.f29131r = TextUtils.join(" ", arrayList).toString();
                    xq0Var.f29130n = false;
                    xq0Var.d();
                    xq0Var.f29133w = null;
                    if (xq0Var.f29127b != 0) {
                        xq0Var.f29127b = 0;
                        wq0 wq0Var = xq0Var.H;
                        if (wq0Var != null) {
                            ((org.telegram.ui.yv) wq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                iv0 iv0Var = ((qt0) this.f23268b).f26486f;
                org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) iv0Var.f24131v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((uq0) this.f23268b).run();
                return;
            case 18:
                ((jx0) this.f23268b).f24510b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((zh.s3) this.f23268b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f23268b).setText("");
                return;
            case 21:
                a21 a21Var = ((c21) this.f23268b).f21978b;
                a21Var.setText("");
                AndroidUtilities.showKeyboard(a21Var);
                return;
            case 22:
                ((n21) this.f23268b).f25384b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((i41) this.f23268b).dismiss();
                return;
            case 24:
                org.telegram.ui.eo eoVar = ((org.telegram.ui.bl) this.f23268b).f31282s;
                if (!eoVar.getUserConfig().isPremium() && ((chat = eoVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + eoVar.a(), 14).commit();
                    eoVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar, 13, false));
                } else {
                    eoVar.getMessagesController().getTranslateController().toggleTranslatingDialog(eoVar.a());
                }
                eoVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23268b).getSwipeBack().b(true);
                return;
        }
    }
}
