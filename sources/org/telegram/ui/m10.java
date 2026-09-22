package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class m10 extends s4.s0 {
    public final x10 f35580a;

    public m10(x10 x10Var) {
        this.f35580a = x10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f35580a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        x10 x10Var = this.f35580a;
        ai.n4 n4Var = x10Var.m0;
        s4.c0 c0Var = x10Var.f39448j0;
        le.b bVar = x10Var.f39435a;
        g10 g10Var = x10Var.f39452n0;
        if (recyclerView.getAdapter() != null && x10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!x10Var.M && abs > 0 && N0 >= h - 10 && !x10Var.N) {
                AndroidUtilities.runOnUIThread(new g10(this, 1));
            }
            if (x10Var.d == x10Var.U) {
                if (i11 != 0 && !x10Var.f39443f.isEmpty() && TextUtils.isEmpty(x10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(g10Var);
                    AndroidUtilities.runOnUIThread(g10Var, 1650L);
                    bVar.a(true, true);
                }
                s4.c1 K = recyclerView.K(L0);
                if (K != null && K.f42674f == 0) {
                    View view = K.f42671a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f21434b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            n4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) n4Var.d, formatDateChat)) {
                                n4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.m6) n4Var.f1283b).q(formatDateChat, true, true);
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
            View pinnedHeader = x10Var.f39437b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) n4Var.d, charSequence)) {
                        n4Var.d = charSequence;
                        ((org.telegram.ui.Components.m6) n4Var.f1283b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(g10Var);
                        AndroidUtilities.runOnUIThread(g10Var, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(g10Var);
            bVar.a(false, true);
        }
    }
}
