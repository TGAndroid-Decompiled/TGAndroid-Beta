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
public final class j80 implements View.OnClickListener {
    public final int f25319a;
    public final Object f25320b;

    public j80(Object obj, int i10) {
        this.f25319a = i10;
        this.f25320b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f25319a) {
            case 0:
                l80 l80Var = (l80) this.f25320b;
                l80Var.f26006b = true;
                l80Var.dismiss();
                return;
            case 1:
                ((s80) this.f25320b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.y) this.f25320b).o(2);
                return;
            case 3:
                lc0 lc0Var = (lc0) this.f25320b;
                lc0.b(lc0Var.getContext(), lc0Var.f26041a, lc0Var.f26045n, false, lc0Var.f26049x, new jc0(lc0Var, 0), lc0Var.f26043c);
                return;
            case 4:
                ((ld0) this.f25320b).onBackPressed();
                return;
            case 5:
                le0.m((le0) this.f25320b);
                return;
            case 6:
                tf0 tf0Var = (tf0) this.f25320b;
                tf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                uf0 uf0Var = tf0Var.d;
                if (intValue == uf0Var.f28802y) {
                    uf0Var.N = u5Var.getCurrentColor();
                } else {
                    uf0Var.O = u5Var.getCurrentColor();
                }
                xz xzVar = uf0Var.f28785l0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
                uf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ag0) this.f25320b).f22640a.f23013y.url)));
                return;
            case 8:
                pg0 pg0Var = (pg0) this.f25320b;
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null) {
                    bg0 bg0Var = pg0Var.f27371r;
                    if (bg0Var != null) {
                        if (bg0Var.G) {
                            bg0Var.f();
                        } else {
                            bg0Var.g();
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
                    pg0.f27353p0.z();
                    return;
                }
                return;
            case 9:
                zg0 zg0Var = (zg0) this.f25320b;
                zg0Var.getClass();
                wg0 wg0Var = (wg0) zg0Var;
                xg0 xg0Var = wg0Var.e;
                ah0 ah0Var = (ah0) wg0Var.getTag(R.id.object_tag);
                if (ah0Var.f22646b.size() > 15) {
                    boolean z10 = ah0Var.e;
                    ah0Var.e = !z10;
                    if (!z10) {
                        ah0Var.f22648f = 10;
                    }
                    xg0Var.f30352s.O(wg0Var);
                    xg0Var.f30352s.f23018c.X(true);
                    return;
                }
                return;
            case 10:
                ((nm0) this.f25320b).onBackPressed();
                return;
            case 11:
                jn0 jn0Var = ((in0) this.f25320b).f25165c;
                gt.n(jn0Var.F, jn0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((kn0) this.f25320b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                vn0 vn0Var = (vn0) this.f25320b;
                vn0Var.getClass();
                new rg.x0(vn0Var.f29153b, 24, true).show();
                return;
            case 14:
                ((mo0) this.f25320b).Q(false);
                return;
            case 15:
                ar0 ar0Var = ((yq0) this.f25320b).f30694s;
                ArrayList arrayList = ar0Var.f22739s;
                if (!arrayList.isEmpty()) {
                    ar0Var.f22738r = TextUtils.join(" ", arrayList).toString();
                    ar0Var.f22737n = false;
                    ar0Var.d();
                    ar0Var.f22740w = null;
                    if (ar0Var.f22734b != 0) {
                        ar0Var.f22734b = 0;
                        zq0 zq0Var = ar0Var.H;
                        if (zq0Var != null) {
                            ((org.telegram.ui.sv) zq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                kv0 kv0Var = ((tt0) this.f25320b).f28612f;
                org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) kv0Var.f25866v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((xq0) this.f25320b).run();
                return;
            case 18:
                ((jx0) this.f25320b).f25545b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f25320b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f25320b).setText("");
                return;
            case 21:
                b21 b21Var = ((d21) this.f25320b).f23481b;
                b21Var.setText("");
                AndroidUtilities.showKeyboard(b21Var);
                return;
            case 22:
                ((n21) this.f25320b).f26654b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((j41) this.f25320b).dismiss();
                return;
            case 24:
                org.telegram.ui.wn wnVar = ((org.telegram.ui.wk) this.f25320b).f39389s;
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f25320b).getSwipeBack().b(true);
                return;
        }
    }
}
