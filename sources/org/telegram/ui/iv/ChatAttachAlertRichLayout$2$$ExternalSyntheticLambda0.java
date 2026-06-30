package org.telegram.ui.iv;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.iv.RichEditorListView;

public final class ChatAttachAlertRichLayout$2$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final RichEditorListView.SelectionEdit f$0;

    public ChatAttachAlertRichLayout$2$$ExternalSyntheticLambda0(RichEditorListView.SelectionEdit selectionEdit) {
        this.f$0 = selectionEdit;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.replaceWith((TL_iv.RichMessage) obj);
    }
}
