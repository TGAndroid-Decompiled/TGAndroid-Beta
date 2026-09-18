package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class o10 extends s4.s0 {
    public final z10 f36206a;

    public o10(z10 z10Var) {
        this.f36206a = z10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f36206a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        z10 z10Var = this.f36206a;
        ai.n4 n4Var = z10Var.m0;
        s4.c0 c0Var = z10Var.f40087j0;
        le.b bVar = z10Var.f40074a;
        i10 i10Var = z10Var.f40091n0;
        if (recyclerView.getAdapter() != null && z10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!z10Var.M && abs > 0 && N0 >= h - 10 && !z10Var.N) {
                AndroidUtilities.runOnUIThread(new i10(this, 1));
            }
            if (z10Var.d == z10Var.U) {
                if (i11 != 0 && !z10Var.f40082f.isEmpty() && TextUtils.isEmpty(z10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(i10Var);
                    AndroidUtilities.runOnUIThread(i10Var, 1650L);
                    bVar.a(true, true);
                }
                s4.c1 L = recyclerView.L(L0);
                if (L != null && L.f42705f == 0) {
                    View view = L.f42702a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f21454b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            n4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) n4Var.d, formatDateChat)) {
                                n4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.m6) n4Var.f1286b).q(formatDateChat, true, true);
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
            View pinnedHeader = z10Var.f40076b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) n4Var.d, charSequence)) {
                        n4Var.d = charSequence;
                        ((org.telegram.ui.Components.m6) n4Var.f1286b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(i10Var);
                        AndroidUtilities.runOnUIThread(i10Var, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(i10Var);
            bVar.a(false, true);
        }
    }
}
