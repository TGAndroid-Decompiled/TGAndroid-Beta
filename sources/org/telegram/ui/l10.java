package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class l10 extends s4.t0 {
    public final w10 f39439a;

    public l10(w10 w10Var) {
        this.f39439a = w10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f39439a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        w10 w10Var = this.f39439a;
        ai.o4 o4Var = w10Var.m0;
        s4.d0 d0Var = w10Var.f43100j0;
        me.b bVar = w10Var.f43086a;
        uz uzVar = w10Var.f43104n0;
        if (recyclerView.getAdapter() != null && w10Var.d != null) {
            int L0 = d0Var.L0();
            int N0 = d0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!w10Var.M && abs > 0 && N0 >= h - 10 && !w10Var.N) {
                AndroidUtilities.runOnUIThread(new uz(this, 2));
            }
            if (w10Var.d == w10Var.U) {
                if (i11 != 0 && !w10Var.f43095f.isEmpty() && TextUtils.isEmpty(w10Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(uzVar);
                    AndroidUtilities.runOnUIThread(uzVar, 1650L);
                    bVar.a(true, true);
                }
                s4.d1 K = recyclerView.K(L0);
                if (K != null && K.f47706f == 0) {
                    View view = K.f47702a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.f23517e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f23515b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            o4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) o4Var.d, formatDateChat)) {
                                o4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.q6) o4Var.f1526b).t(formatDateChat, true, true);
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
            View pinnedHeader = w10Var.f43088b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) o4Var.d, charSequence)) {
                        o4Var.d = charSequence;
                        ((org.telegram.ui.Components.q6) o4Var.f1526b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(uzVar);
                        AndroidUtilities.runOnUIThread(uzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(uzVar);
            bVar.a(false, true);
        }
    }
}
