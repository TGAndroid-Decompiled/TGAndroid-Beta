package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class n10 extends s4.t0 {
    public final y10 f40175a;

    public n10(y10 y10Var) {
        this.f40175a = y10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f40175a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        y10 y10Var = this.f40175a;
        ai.o4 o4Var = y10Var.m0;
        s4.d0 d0Var = y10Var.f44255j0;
        me.b bVar = y10Var.f44241a;
        wz wzVar = y10Var.f44259n0;
        if (recyclerView.getAdapter() != null && y10Var.d != null) {
            int L0 = d0Var.L0();
            int N0 = d0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!y10Var.M && abs > 0 && N0 >= h - 10 && !y10Var.N) {
                AndroidUtilities.runOnUIThread(new wz(this, 2));
            }
            if (y10Var.d == y10Var.U) {
                if (i11 != 0 && !y10Var.f44250f.isEmpty() && TextUtils.isEmpty(y10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(wzVar);
                    AndroidUtilities.runOnUIThread(wzVar, 1650L);
                    bVar.a(true, true);
                }
                s4.d1 K = recyclerView.K(L0);
                if (K != null && K.f47893f == 0) {
                    View view = K.f47889a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.f23285e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f23283b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            o4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) o4Var.d, formatDateChat)) {
                                o4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.q6) o4Var.f1524b).t(formatDateChat, true, true);
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
            View pinnedHeader = y10Var.f44243b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) o4Var.d, charSequence)) {
                        o4Var.d = charSequence;
                        ((org.telegram.ui.Components.q6) o4Var.f1524b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(wzVar);
                        AndroidUtilities.runOnUIThread(wzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(wzVar);
            bVar.a(false, true);
        }
    }
}
