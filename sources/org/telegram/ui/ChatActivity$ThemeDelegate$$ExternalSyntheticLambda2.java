package org.telegram.ui;

public final class ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ThemeDelegate f$0;

    public ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2(ChatActivity.ThemeDelegate themeDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = themeDelegate;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setCurrentTheme$2();
                break;
            default:
                this.f$0.lambda$setCurrentTheme$3();
                break;
        }
    }
}
