package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class m10 extends s4.s0 {
    public final x10 f35591a;

    public m10(x10 x10Var) {
        this.f35591a = x10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f35591a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        x10 x10Var = this.f35591a;
        ai.n4 n4Var = x10Var.m0;
        s4.c0 c0Var = x10Var.f39329j0;
        le.b bVar = x10Var.f39316a;
        g10 g10Var = x10Var.f39333n0;
        if (recyclerView.getAdapter() != null && x10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!x10Var.M && abs > 0 && N0 >= h - 10 && !x10Var.N) {
                AndroidUtilities.runOnUIThread(new g10(this, 1));
            }
            if (x10Var.d == x10Var.U) {
                if (i11 != 0 && !x10Var.f39324f.isEmpty() && TextUtils.isEmpty(x10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(g10Var);
                    AndroidUtilities.runOnUIThread(g10Var, 1650L);
                    bVar.a(true, true);
                }
                s4.c1 L = recyclerView.L(L0);
                if (L != null && L.f42998f == 0) {
                    View view = L.f42995a;
                    if (view instanceof org.telegram.ui.Cells.v7) {
                        org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
                        if (v7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = v7Var.f21708b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            n4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) n4Var.d, formatDateChat)) {
                                n4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.n6) n4Var.f1283b).q(formatDateChat, true, true);
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
            View pinnedHeader = x10Var.f39318b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) pinnedHeader;
                CharSequence text = w3Var.getText();
                if (!TextUtils.isEmpty(text) && w3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) n4Var.d, charSequence)) {
                        n4Var.d = charSequence;
                        ((org.telegram.ui.Components.n6) n4Var.f1283b).q(charSequence, true, true);
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
