package org.telegram.ui;

public final class ChannelBoostLayout$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ChannelBoostLayout f$0;

    public ChannelBoostLayout$$ExternalSyntheticLambda4(ChannelBoostLayout channelBoostLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = channelBoostLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadUsers$3();
                break;
            case 1:
                this.f$0.lambda$loadUsers$6();
                break;
            case 2:
                this.f$0.lambda$loadUsers$4();
                break;
            default:
                this.f$0.lambda$loadUsers$5();
                break;
        }
    }
}
