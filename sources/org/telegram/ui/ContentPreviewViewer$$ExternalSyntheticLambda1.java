package org.telegram.ui;

public final class ContentPreviewViewer$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ContentPreviewViewer f$0;

    public ContentPreviewViewer$$ExternalSyntheticLambda1(ContentPreviewViewer contentPreviewViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = contentPreviewViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDraw$14();
                break;
            case 1:
                this.f$0.lambda$close$13();
                break;
            default:
                this.f$0.lambda$showEmojiSelectorForStickers$6();
                break;
        }
    }
}
