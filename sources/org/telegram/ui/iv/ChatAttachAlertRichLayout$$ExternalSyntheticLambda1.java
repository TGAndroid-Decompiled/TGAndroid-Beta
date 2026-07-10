package org.telegram.ui.iv;

public final class ChatAttachAlertRichLayout$$ExternalSyntheticLambda1 implements Runnable {
    public final RichEditorListView f$0;

    public ChatAttachAlertRichLayout$$ExternalSyntheticLambda1(RichEditorListView richEditorListView) {
        this.f$0 = richEditorListView;
    }

    @Override
    public final void run() {
        this.f$0.convertToSimple();
    }
}
