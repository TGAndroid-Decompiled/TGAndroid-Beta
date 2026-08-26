package org.telegram.ui.Components;

public final class ChatActivityEnterView$$ExternalSyntheticLambda88 implements Runnable {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda88(ChatActivityEnterView chatActivityEnterView, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendMessage$58();
                break;
            case 1:
                this.f$0.lambda$openWebViewMenu$33();
                break;
            case 2:
                this.f$0.lambda$new$0();
                break;
            case 3:
                this.f$0.lambda$showPopup$100();
                break;
            case 4:
                this.f$0.lambda$onSendLongClick$48();
                break;
            default:
                this.f$0.lambda$openRichEditorWithHtml$81();
                break;
        }
    }
}
