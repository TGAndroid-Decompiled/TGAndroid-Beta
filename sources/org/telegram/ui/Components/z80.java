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
public final class z80 implements View.OnClickListener {
    public final int f31809a;
    public final Object f31810b;

    public z80(Object obj, int i10) {
        this.f31809a = i10;
        this.f31810b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f31809a) {
            case 0:
                ((g90) this.f31810b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f31810b).o(2);
                return;
            case 2:
                ad0 ad0Var = (ad0) this.f31810b;
                ad0.b(ad0Var.getContext(), ad0Var.f23524a, ad0Var.f23528n, false, ad0Var.f23532x, new yc0(ad0Var, 0), ad0Var.f23526c);
                return;
            case 3:
                ((zd0) this.f31810b).onBackPressed();
                return;
            case 4:
                ze0.n((ze0) this.f31810b);
                return;
            case 5:
                hg0 hg0Var = (hg0) this.f31810b;
                hg0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                ig0 ig0Var = hg0Var.d;
                if (intValue == ig0Var.f25975y) {
                    ig0Var.N = u5Var.getCurrentColor();
                } else {
                    ig0Var.O = u5Var.getCurrentColor();
                }
                h00 h00Var = ig0Var.f25958l0;
                if (h00Var != null) {
                    h00Var.d(false, false, false);
                }
                ig0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pg0) this.f31810b).f28309a.f28600y.url)));
                return;
            case 7:
                fh0 fh0Var = (fh0) this.f31810b;
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null) {
                    qg0 qg0Var = fh0Var.f25053r;
                    if (qg0Var != null) {
                        if (qg0Var.G) {
                            qg0Var.f();
                        } else {
                            qg0Var.g();
                        }
                    } else {
                        h81 h81Var = photoViewer.F2;
                        if (h81Var != null) {
                            if (h81Var.y()) {
                                h81Var.B();
                            } else {
                                h81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    fh0.f25035p0.z();
                    return;
                }
                return;
            case 8:
                oh0 oh0Var = (oh0) this.f31810b;
                oh0Var.getClass();
                lh0 lh0Var = (lh0) oh0Var;
                mh0 mh0Var = lh0Var.e;
                ph0 ph0Var = (ph0) lh0Var.getTag(R.id.object_tag);
                if (ph0Var.f28314b.size() > 15) {
                    boolean z10 = ph0Var.e;
                    ph0Var.e = !z10;
                    if (!z10) {
                        ph0Var.f28316f = 10;
                    }
                    mh0Var.f27397s.P(lh0Var);
                    mh0Var.f27397s.f28605c.X(true);
                    return;
                }
                return;
            case 9:
                ((cn0) this.f31810b).onBackPressed();
                return;
            case 10:
                yn0 yn0Var = ((xn0) this.f31810b).f31288c;
                st.o(yn0Var.F, yn0Var.G);
                return;
            case 11:
                di.g2 g2Var = ((zn0) this.f31810b).e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                return;
            case 12:
                ko0 ko0Var = (ko0) this.f31810b;
                ko0Var.getClass();
                new sg.y0(ko0Var.f26765b, 24, true).show();
                return;
            case 13:
                ((zo0) this.f31810b).Q(false);
                return;
            case 14:
                or0 or0Var = ((mr0) this.f31810b).f27492s;
                ArrayList arrayList = or0Var.f28036s;
                if (!arrayList.isEmpty()) {
                    or0Var.f28035r = TextUtils.join(" ", arrayList).toString();
                    or0Var.f28034n = false;
                    or0Var.d();
                    or0Var.f28037w = null;
                    if (or0Var.f28031b != 0) {
                        or0Var.f28031b = 0;
                        nr0 nr0Var = or0Var.H;
                        if (nr0Var != null) {
                            ((org.telegram.ui.aw) nr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                xv0 xv0Var = ((gu0) this.f31810b).f25424f;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) xv0Var.f31388v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((lr0) this.f31810b).run();
                return;
            case 17:
                ((wx0) this.f31810b).f30996b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((bi.m6) this.f31810b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f31810b).setText("");
                return;
            case 20:
                p21 p21Var = ((r21) this.f31810b).f28722b;
                p21Var.setText("");
                AndroidUtilities.showKeyboard(p21Var);
                return;
            case 21:
                ((a31) this.f31810b).f23427b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((x41) this.f31810b).dismiss();
                return;
            case 23:
                org.telegram.ui.fo foVar = ((org.telegram.ui.el) this.f31810b).f35632s;
                if (!foVar.getUserConfig().isPremium() && ((chat = foVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + foVar.a(), 14).commit();
                    foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 13, false));
                } else {
                    foVar.getMessagesController().getTranslateController().toggleTranslatingDialog(foVar.a());
                }
                foVar.Uc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f31810b).getSwipeBack().b(true);
                return;
        }
    }
}
