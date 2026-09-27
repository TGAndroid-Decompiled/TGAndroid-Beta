package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class l10 extends s4.s0 {
    public final w10 f35226a;

    public l10(w10 w10Var) {
        this.f35226a = w10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f35226a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        w10 w10Var = this.f35226a;
        ai.n4 n4Var = w10Var.m0;
        s4.c0 c0Var = w10Var.f38768j0;
        le.c cVar = w10Var.f38755a;
        f10 f10Var = w10Var.f38772n0;
        if (recyclerView.getAdapter() != null && w10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!w10Var.M && abs > 0 && N0 >= h - 10 && !w10Var.N) {
                AndroidUtilities.runOnUIThread(new f10(this, 1));
            }
            if (w10Var.d == w10Var.U) {
                if (i11 != 0 && !w10Var.f38763f.isEmpty() && TextUtils.isEmpty(w10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(f10Var);
                    AndroidUtilities.runOnUIThread(f10Var, 1650L);
                    cVar.a(true, true);
                }
                s4.c1 L = recyclerView.L(L0);
                if (L != null && L.f43008f == 0) {
                    View view = L.f43005a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f21660b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            n4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) n4Var.d, formatDateChat)) {
                                n4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.o6) n4Var.f1295b).q(formatDateChat, true, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            View pinnedHeader = w10Var.f38757b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) n4Var.d, charSequence)) {
                        n4Var.d = charSequence;
                        ((org.telegram.ui.Components.o6) n4Var.f1295b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(f10Var);
                        AndroidUtilities.runOnUIThread(f10Var, 1650L);
                        cVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(f10Var);
            cVar.a(false, true);
        }
    }
}
