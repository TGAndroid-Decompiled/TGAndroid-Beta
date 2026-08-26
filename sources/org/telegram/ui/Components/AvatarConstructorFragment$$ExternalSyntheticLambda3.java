package org.telegram.ui.Components;

public final class AvatarConstructorFragment$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final AvatarConstructorFragment f$0;

    public AvatarConstructorFragment$$ExternalSyntheticLambda3(AvatarConstructorFragment avatarConstructorFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = avatarConstructorFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$1();
                break;
            default:
                this.f$0.lambda$onDonePressed$3();
                break;
        }
    }
}
