package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class i10 extends f2.z0 {
    public final t10 f34994a;

    public i10(t10 t10Var) {
        this.f34994a = t10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f34994a.H.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        t10 t10Var = this.f34994a;
        nh.a3 a3Var = t10Var.f38485j0;
        f2.i0 i0Var = t10Var.f38482g0;
        xd.a aVar = t10Var.f38472a;
        c10 c10Var = t10Var.f38486k0;
        if (recyclerView.getAdapter() != null && t10Var.d != null) {
            int L0 = i0Var.L0();
            int N0 = i0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!t10Var.J && abs > 0 && N0 >= h - 10 && !t10Var.K) {
                AndroidUtilities.runOnUIThread(new c10(this, 1));
            }
            if (t10Var.d == t10Var.R) {
                if (i11 != 0 && !t10Var.f38480f.isEmpty() && TextUtils.isEmpty(t10Var.N)) {
                    AndroidUtilities.cancelRunOnUIThread(c10Var);
                    AndroidUtilities.runOnUIThread(c10Var, 1650L);
                    aVar.a(true, true);
                }
                f2.l1 K = recyclerView.K(L0);
                if (K != null && K.f5788f == 0) {
                    View view = K.f5785a;
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        if (s7Var.e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = s7Var.f21946b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            a3Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) a3Var.d, formatDateChat)) {
                                a3Var.d = formatDateChat;
                                ((org.telegram.ui.Components.j6) a3Var.f15050b).q(formatDateChat, true, true);
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
            View pinnedHeader = t10Var.f38474b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) a3Var.d, charSequence)) {
                        a3Var.d = charSequence;
                        ((org.telegram.ui.Components.j6) a3Var.f15050b).q(charSequence, true, true);
                    }
                    if (i11 != 0) {
                        AndroidUtilities.cancelRunOnUIThread(c10Var);
                        AndroidUtilities.runOnUIThread(c10Var, 1650L);
                        aVar.a(true, true);
                        return;
                    }
                    return;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(c10Var);
            aVar.a(false, true);
        }
    }
}
