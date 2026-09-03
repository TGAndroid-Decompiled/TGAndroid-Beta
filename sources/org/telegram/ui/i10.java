package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class i10 extends f2.a1 {
    public final t10 f37522a;

    public i10(t10 t10Var) {
        this.f37522a = t10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f37522a.H.getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        MessageObject messageObject;
        t10 t10Var = this.f37522a;
        oh.b3 b3Var = t10Var.f41369j0;
        f2.j0 j0Var = t10Var.f41366g0;
        xd.a aVar = t10Var.f41355a;
        c10 c10Var = t10Var.f41370k0;
        if (recyclerView.getAdapter() != null && t10Var.d != null) {
            int L0 = j0Var.L0();
            int N0 = j0Var.N0();
            int abs = Math.abs(N0 - L0) + 1;
            int h = recyclerView.getAdapter().h();
            if (!t10Var.J && abs > 0 && N0 >= h - 10 && !t10Var.K) {
                AndroidUtilities.runOnUIThread(new c10(this, 1));
            }
            if (t10Var.d == t10Var.R) {
                if (i11 != 0 && !t10Var.f41364f.isEmpty() && TextUtils.isEmpty(t10Var.N)) {
                    AndroidUtilities.cancelRunOnUIThread(c10Var);
                    AndroidUtilities.runOnUIThread(c10Var, 1650L);
                    aVar.a(true, true);
                }
                f2.m1 K = recyclerView.K(L0);
                if (K != null && K.f5879f == 0) {
                    View view = K.f5875a;
                    if (view instanceof org.telegram.ui.Cells.s7) {
                        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                        if (s7Var.f23747e <= 0) {
                            messageObject = null;
                        } else {
                            messageObject = s7Var.f23745b[0];
                        }
                        if (messageObject != null) {
                            int i12 = messageObject.messageOwner.date;
                            b3Var.getClass();
                            String formatDateChat = LocaleController.formatDateChat(i12);
                            if (!TextUtils.equals((String) b3Var.d, formatDateChat)) {
                                b3Var.d = formatDateChat;
                                ((org.telegram.ui.Components.j6) b3Var.f16886b).q(formatDateChat, true, true);
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
            View pinnedHeader = t10Var.f41357b.getPinnedHeader();
            if (pinnedHeader instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) pinnedHeader;
                CharSequence text = u3Var.getText();
                if (!TextUtils.isEmpty(text) && u3Var.getAlpha() > 0.0f) {
                    String charSequence = text.toString();
                    if (!TextUtils.equals((String) b3Var.d, charSequence)) {
                        b3Var.d = charSequence;
                        ((org.telegram.ui.Components.j6) b3Var.f16886b).q(charSequence, true, true);
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
