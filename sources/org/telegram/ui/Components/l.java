package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class l extends mr0 {
    public final e0 f30006a1;

    public l(e0 e0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.f30006a1 = e0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        FrameLayout frameLayout = this.f30006a1.G0;
        if (z10) {
            wc wcVar = new wc(frameLayout, this.resourcesProvider);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    qc G = wcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedToSavedMessages, new Object[0])));
                    G.f31896s = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                    int i11 = R.raw.forward;
                    int i12 = R.string.AIEditorStyleSharedTo;
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = chat.title;
                    }
                    qc G2 = wcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f31896s = false;
                    G2.j();
                } else {
                    qc G3 = wcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AIEditorStyleSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.f31896s = false;
                    G3.j();
                }
            } else {
                qc R = wcVar.R(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("AIEditorStyleSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                R.f31896s = false;
                R.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
