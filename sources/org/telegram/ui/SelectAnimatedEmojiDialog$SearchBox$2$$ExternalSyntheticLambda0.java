package org.telegram.ui;

public final class SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog.SearchBox.AnonymousClass2 f$0;

    public SelectAnimatedEmojiDialog$SearchBox$2$$ExternalSyntheticLambda0(SelectAnimatedEmojiDialog.SearchBox.AnonymousClass2 anonymousClass2, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onFocusChanged$1();
                break;
            default:
                this.f$0.lambda$onTouchEvent$0();
                break;
        }
    }
}
