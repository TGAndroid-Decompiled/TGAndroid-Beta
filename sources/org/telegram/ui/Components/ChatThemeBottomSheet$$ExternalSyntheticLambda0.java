package org.telegram.ui.Components;

public final class ChatThemeBottomSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ChatThemeBottomSheet f$0;

    public ChatThemeBottomSheet$$ExternalSyntheticLambda0(ChatThemeBottomSheet chatThemeBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = chatThemeBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$10();
                break;
            case 1:
                this.f$0.lambda$onCreate$7();
                break;
            case 2:
                this.f$0.lambda$applySelectedTheme$13();
                break;
            case 3:
                this.f$0.lambda$applySelectedTheme$15();
                break;
            case 4:
                this.f$0.lambda$showAsSheet$18();
                break;
            case 5:
                this.f$0.lambda$showAsSheet$19();
                break;
            case 6:
                this.f$0.lambda$showAsSheet$21();
                break;
            default:
                this.f$0.lambda$showAsSheet$22();
                break;
        }
    }
}
