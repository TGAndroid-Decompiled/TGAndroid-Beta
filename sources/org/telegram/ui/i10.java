package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class i10 extends s4.s0 {
    public final t10 f34341a;

    public i10(t10 t10Var) {
        this.f34341a = t10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f34341a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        t10 t10Var = this.f34341a;
        ai.n4 n4Var = t10Var.m0;
        s4.c0 c0Var = t10Var.f37931j0;
        le.c cVar = t10Var.f37918a;
        c10 c10Var = t10Var.f37935n0;
        if (recyclerView.getAdapter() != null && t10Var.d != null) {
            int L0 = c0Var.L0();
            int N0 = c0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!t10Var.M && abs > 0 && N0 >= h - 10 && !t10Var.N) {
                AndroidUtilities.runOnUIThread(new c10(this, 1));
            }
            if (t10Var.d == t10Var.U) {
                if (i11 != 0 && !t10Var.f37926f.isEmpty() && TextUtils.isEmpty(t10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(c10Var);
                    AndroidUtilities.runOnUIThread(c10Var, 1650L);
                    cVar.a(true, true);
                }
                s4.c1 K = recyclerView.K(L0);
                if (K != null && K.f42962f == 0) {
                    View view = K.f42959a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f21657b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            n4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) n4Var.d, formatDateChat)) {
                                n4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.o6) n4Var.f1293b).q(formatDateChat, true, true);
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
            View pinnedHeader = t10Var.f37920b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) n4Var.d, charSequence)) {
                        n4Var.d = charSequence;
                        ((org.telegram.ui.Components.o6) n4Var.f1293b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(c10Var);
                        AndroidUtilities.runOnUIThread(c10Var, 1650L);
                        cVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(c10Var);
            cVar.a(false, true);
        }
    }
}
