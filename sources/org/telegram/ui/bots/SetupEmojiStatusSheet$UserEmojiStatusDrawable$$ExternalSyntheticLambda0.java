package org.telegram.ui.bots;

public final class SetupEmojiStatusSheet$UserEmojiStatusDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SetupEmojiStatusSheet.UserEmojiStatusDrawable f$0;

    public SetupEmojiStatusSheet$UserEmojiStatusDrawable$$ExternalSyntheticLambda0(SetupEmojiStatusSheet.UserEmojiStatusDrawable userEmojiStatusDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = userEmojiStatusDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SetupEmojiStatusSheet.UserEmojiStatusDrawable userEmojiStatusDrawable = this.f$0;
                if (userEmojiStatusDrawable.attached) {
                    userEmojiStatusDrawable.setRandomStatus();
                    break;
                }
                break;
            default:
                this.f$0.invalidateSelf();
                break;
        }
    }
}
