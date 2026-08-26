package org.telegram.ui.Components.spoilers;

public final class SpoilersTextView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final SpoilersTextView f$0;

    public SpoilersTextView$$ExternalSyntheticLambda2(SpoilersTextView spoilersTextView, int i) {
        this.$r8$classId = i;
        this.f$0 = spoilersTextView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SpoilersTextView spoilersTextView = this.f$0;
                spoilersTextView.getClass();
                spoilersTextView.post(new SpoilersTextView$$ExternalSyntheticLambda2(spoilersTextView, 1));
                break;
            default:
                SpoilersTextView spoilersTextView2 = this.f$0;
                spoilersTextView2.isSpoilersRevealed = true;
                spoilersTextView2.invalidateSpoilers();
                break;
        }
    }
}
