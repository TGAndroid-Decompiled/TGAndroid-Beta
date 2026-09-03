package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class j10 extends f2.z0 {
    public final u10 f35063a;

    public j10(u10 u10Var) {
        this.f35063a = u10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f35063a.H.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        u10 u10Var = this.f35063a;
        nh.a3 a3Var = u10Var.f38651j0;
        f2.i0 i0Var = u10Var.f38648g0;
        xd.a aVar = u10Var.f38638a;
        d10 d10Var = u10Var.f38652k0;
        if (recyclerView.getAdapter() != null && u10Var.d != null) {
            int L0 = i0Var.L0();
            int N0 = i0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!u10Var.J && abs > 0 && N0 >= h - 10 && !u10Var.K) {
                AndroidUtilities.runOnUIThread(new d10(this, 1));
            }
            if (u10Var.d == u10Var.R) {
                if (i11 != 0 && !u10Var.f38646f.isEmpty() && TextUtils.isEmpty(u10Var.N)) {
                    AndroidUtilities.cancelRunOnUIThread(d10Var);
                    AndroidUtilities.runOnUIThread(d10Var, 1650L);
                    aVar.a(true, true);
                }
                f2.l1 K = recyclerView.K(L0);
                if (K != null && K.f5777f == 0) {
                    View view = K.f5774a;
                    if (view instanceof org.telegram.ui.Cells.r7) {
                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                        if (r7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = r7Var.f21877b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            a3Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) a3Var.d, formatDateChat)) {
                                a3Var.d = formatDateChat;
                                ((org.telegram.ui.Components.j6) a3Var.f15030b).q(formatDateChat, true, true);
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
            View pinnedHeader = u10Var.f38640b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.t3) {
                org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) pinnedHeader;
                CharSequence text = t3Var.getText();
                if (!TextUtils.isEmpty(text) && t3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) a3Var.d, charSequence)) {
                        a3Var.d = charSequence;
                        ((org.telegram.ui.Components.j6) a3Var.f15030b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(d10Var);
                        AndroidUtilities.runOnUIThread(d10Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(d10Var);
            aVar.a(false, true);
        }
    }
}
