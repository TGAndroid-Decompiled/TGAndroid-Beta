package org.telegram.ui;

public final class TopicsFragment$2$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final TopicCreateFragment f$0;

    public TopicsFragment$2$$ExternalSyntheticLambda4(TopicCreateFragment topicCreateFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = topicCreateFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showKeyboard();
                break;
            default:
                this.f$0.lambda$selectEmoji$2();
                break;
        }
    }
}
