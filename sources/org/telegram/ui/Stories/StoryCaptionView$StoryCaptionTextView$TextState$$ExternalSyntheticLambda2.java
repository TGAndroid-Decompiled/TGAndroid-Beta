package org.telegram.ui.Stories;

public final class StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final StoryCaptionView.StoryCaptionTextView.TextState f$0;

    public StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2(StoryCaptionView.StoryCaptionTextView.TextState textState, int i) {
        this.$r8$classId = i;
        this.f$0 = textState;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StoryCaptionView.StoryCaptionTextView storyCaptionTextView = this.f$0.this$1;
                storyCaptionTextView.sizeCached = 0;
                storyCaptionTextView.requestLayout();
                StoryCaptionView storyCaptionView = storyCaptionTextView.this$0;
                storyCaptionView.updateTopMargin(storyCaptionView.getWidth(), storyCaptionView.getHeight());
                storyCaptionView.requestLayout();
                break;
            case 1:
                StoryCaptionView.StoryCaptionTextView storyCaptionTextView2 = this.f$0.this$1;
                storyCaptionTextView2.sizeCached = 0;
                storyCaptionTextView2.requestLayout();
                StoryCaptionView storyCaptionView2 = storyCaptionTextView2.this$0;
                storyCaptionView2.updateTopMargin(storyCaptionView2.getWidth(), storyCaptionView2.getHeight());
                storyCaptionView2.requestLayout();
                break;
            case 2:
                StoryCaptionView.StoryCaptionTextView.TextState textState = this.f$0;
                textState.getClass();
                textState.this$1.post(new StoryCaptionView$StoryCaptionTextView$TextState$$ExternalSyntheticLambda2(textState, 3));
                break;
            default:
                this.f$0.this$1.isSpoilersRevealed = true;
                break;
        }
    }
}
