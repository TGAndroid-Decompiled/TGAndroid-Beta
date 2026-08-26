package org.telegram.ui;

import org.telegram.messenger.LanguageDetector;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.CheckBoxCell;

public final class ChatActivity$$ExternalSyntheticLambda205 implements AlertDialog.OnButtonClickListener, LanguageDetector.StringCallback {
    public final BaseFragment f$0;
    public final Object[] f$1;
    public final String f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;

    public ChatActivity$$ExternalSyntheticLambda205(ChatActivity chatActivity, CheckBoxCell[] checkBoxCellArr, String str, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, boolean z) {
        this.f$0 = chatActivity;
        this.f$1 = checkBoxCellArr;
        this.f$2 = str;
        this.f$3 = tL_messages_requestUrlAuth;
        this.f$4 = tL_urlAuthResultRequest;
        this.f$5 = z;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((ChatActivity) this.f$0).lambda$showRequestUrlAlert$389((CheckBoxCell[]) this.f$1, this.f$2, (TLRPC.TL_messages_requestUrlAuth) this.f$3, (TLRPC.TL_urlAuthResultRequest) this.f$4, this.f$5, alertDialog, i);
    }

    @Override
    public void run(String str) {
        ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$82((String[]) this.f$1, (boolean[]) this.f$3, this.f$2, this.f$5, (ArticleViewer$$ExternalSyntheticLambda20) this.f$4, str);
    }

    public ChatActivity$$ExternalSyntheticLambda205(ProfileActivity profileActivity, String[] strArr, boolean[] zArr, String str, boolean z, ArticleViewer$$ExternalSyntheticLambda20 articleViewer$$ExternalSyntheticLambda20) {
        this.f$0 = profileActivity;
        this.f$1 = strArr;
        this.f$3 = zArr;
        this.f$2 = str;
        this.f$5 = z;
        this.f$4 = articleViewer$$ExternalSyntheticLambda20;
    }
}
