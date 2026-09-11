package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class m10 extends s4.s0 {
    public final x10 f38540a;

    public m10(x10 x10Var) {
        this.f38540a = x10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f38540a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        x10 x10Var = this.f38540a;
        bi.a4 a4Var = x10Var.m0;
        s4.c0 c0Var = x10Var.f42549j0;
        le.b bVar = x10Var.f42535a;
        g10 g10Var = x10Var.f42553n0;
        if (recyclerView.getAdapter() != null && x10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!x10Var.M && abs > 0 && N0 >= h - 10 && !x10Var.N) {
                AndroidUtilities.runOnUIThread(new g10(this, 1));
            }
            if (x10Var.d == x10Var.U) {
                if (i11 != 0 && !x10Var.f42544f.isEmpty() && TextUtils.isEmpty(x10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(g10Var);
                    AndroidUtilities.runOnUIThread(g10Var, 1650L);
                    bVar.a(true, true);
                }
                s4.c1 K = recyclerView.K(L0);
                if (K != null && K.f45742f == 0) {
                    View view = K.f45738a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.f23340e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f23338b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            a4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) a4Var.d, formatDateChat)) {
                                a4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.p6) a4Var.f2751b).q(formatDateChat, true, true);
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
            View pinnedHeader = x10Var.f42537b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) a4Var.d, charSequence)) {
                        a4Var.d = charSequence;
                        ((org.telegram.ui.Components.p6) a4Var.f2751b).q(charSequence, true, true);
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
