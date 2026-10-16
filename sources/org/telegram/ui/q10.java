package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class q10 extends s4.r0 {
    public final b20 f39044a;

    public q10(b20 b20Var) {
        this.f39044a = b20Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f39044a.K.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        b20 b20Var = this.f39044a;
        bi.d4 d4Var = b20Var.m0;
        s4.b0 b0Var = b20Var.f34174j0;
        ne.b bVar = b20Var.f34161a;
        zz zzVar = b20Var.f34178n0;
        if (recyclerView.getAdapter() != null && b20Var.d != null) {
            int L0 = b0Var.L0();
            int N0 = b0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!b20Var.M && abs > 0 && N0 >= h - 10 && !b20Var.N) {
                AndroidUtilities.runOnUIThread(new zz(this, 2));
            }
            if (b20Var.d == b20Var.U) {
                if (i11 != 0 && !b20Var.f34169f.isEmpty() && TextUtils.isEmpty(b20Var.Q)) {
                    AndroidUtilities.cancelRunOnUIThread(zzVar);
                    AndroidUtilities.runOnUIThread(zzVar, 1650L);
                    bVar.a(true, true);
                }
                s4.b1 K = recyclerView.K(L0);
                if (K != null && K.f44841f == 0) {
                    View view = K.f44838a;
                    if (view instanceof org.telegram.ui.Cells.u7) {
                        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                        if (u7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = u7Var.f22245b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            d4Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) d4Var.d, formatDateChat)) {
                                d4Var.d = formatDateChat;
                                ((org.telegram.ui.Components.r6) d4Var.f2949b).t(formatDateChat, true, true);
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
            View pinnedHeader = b20Var.f34163b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) pinnedHeader;
                CharSequence text = v3Var.getText();
                if (!TextUtils.isEmpty(text) && v3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) d4Var.d, charSequence)) {
                        d4Var.d = charSequence;
                        ((org.telegram.ui.Components.r6) d4Var.f2949b).t(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(zzVar);
                        AndroidUtilities.runOnUIThread(zzVar, 1650L);
                        bVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(zzVar);
            bVar.a(false, true);
        }
    }
}
