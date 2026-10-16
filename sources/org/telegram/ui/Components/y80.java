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
public final class y80 implements View.OnClickListener {
    public final int f31184a;
    public final Object f31185b;

    public y80(Object obj, int i10) {
        this.f31184a = i10;
        this.f31185b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f31184a) {
            case 0:
                ((f90) this.f31185b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f31185b).o(2);
                return;
            case 2:
                ad0 ad0Var = (ad0) this.f31185b;
                ad0.b(ad0Var.getContext(), ad0Var.f23203a, ad0Var.f23207n, false, ad0Var.f23211x, new yc0(ad0Var, 0), ad0Var.f23205c);
                return;
            case 3:
                ((zd0) this.f31185b).onBackPressed();
                return;
            case 4:
                af0.n((af0) this.f31185b);
                return;
            case 5:
                ig0 ig0Var = (ig0) this.f31185b;
                ig0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                jg0 jg0Var = ig0Var.d;
                if (intValue == jg0Var.f26026y) {
                    jg0Var.N = u5Var.getCurrentColor();
                } else {
                    jg0Var.O = u5Var.getCurrentColor();
                }
                h00 h00Var = jg0Var.f26009l0;
                if (h00Var != null) {
                    h00Var.d(false, false, false);
                }
                jg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((qg0) this.f31185b).f28282a.f28532y.url)));
                return;
            case 7:
                fh0 fh0Var = (fh0) this.f31185b;
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null) {
                    rg0 rg0Var = fh0Var.f24751r;
                    if (rg0Var != null) {
                        if (rg0Var.G) {
                            rg0Var.f();
                        } else {
                            rg0Var.g();
                        }
                    } else {
                        i81 i81Var = photoViewer.F2;
                        if (i81Var != null) {
                            if (i81Var.y()) {
                                i81Var.B();
                            } else {
                                i81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    fh0.f24733p0.z();
                    return;
                }
                return;
            case 8:
                oh0 oh0Var = (oh0) this.f31185b;
                oh0Var.getClass();
                lh0 lh0Var = (lh0) oh0Var;
                mh0 mh0Var = lh0Var.e;
                ph0 ph0Var = (ph0) lh0Var.getTag(R.id.object_tag);
                if (ph0Var.f28002b.size() > 15) {
                    boolean z10 = ph0Var.e;
                    ph0Var.e = !z10;
                    if (!z10) {
                        ph0Var.f28004f = 10;
                    }
                    mh0Var.f27107s.P(lh0Var);
                    mh0Var.f27107s.f28287c.X(true);
                    return;
                }
                return;
            case 9:
                ((cn0) this.f31185b).onBackPressed();
                return;
            case 10:
                xn0 xn0Var = ((wn0) this.f31185b).f30606c;
                st.o(xn0Var.F, xn0Var.G);
                return;
            case 11:
                di.g2 g2Var = ((yn0) this.f31185b).e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                return;
            case 12:
                ko0 ko0Var = (ko0) this.f31185b;
                ko0Var.getClass();
                new sg.y0(ko0Var.f26450b, 24, true).show();
                return;
            case 13:
                ((zo0) this.f31185b).Q(false);
                return;
            case 14:
                nr0 nr0Var = ((lr0) this.f31185b).f26823s;
                ArrayList arrayList = nr0Var.f27404s;
                if (!arrayList.isEmpty()) {
                    nr0Var.f27403r = TextUtils.join(" ", arrayList).toString();
                    nr0Var.f27402n = false;
                    nr0Var.d();
                    nr0Var.f27405w = null;
                    if (nr0Var.f27399b != 0) {
                        nr0Var.f27399b = 0;
                        mr0 mr0Var = nr0Var.H;
                        if (mr0Var != null) {
                            ((org.telegram.ui.aw) mr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                xv0 xv0Var = ((gu0) this.f31185b).f25112f;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31069v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) xv0Var.f31069v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((kr0) this.f31185b).run();
                return;
            case 17:
                ((wx0) this.f31185b).f30688b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((bi.m6) this.f31185b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f31185b).setText("");
                return;
            case 20:
                q21 q21Var = ((s21) this.f31185b).f28709b;
                q21Var.setText("");
                AndroidUtilities.showKeyboard(q21Var);
                return;
            case 21:
                ((b31) this.f31185b).f23382b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((x41) this.f31185b).dismiss();
                return;
            case 23:
                org.telegram.ui.fo foVar = ((org.telegram.ui.el) this.f31185b).f35321s;
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f31185b).getSwipeBack().b(true);
                return;
        }
    }
}
