package org.telegram.ui;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda8(ChannelMonetizationLayout channelMonetizationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$12();
                break;
            case 1:
                this.f$0.sendCpmUpdate();
                break;
            case 2:
                this.f$0.lambda$new$1();
                break;
            case 3:
                this.f$0.lambda$new$3();
                break;
            case 4:
                this.f$0.updateList();
                break;
            case 5:
                this.f$0.lambda$initLevel$31();
                break;
            case 6:
                this.f$0.lambda$sendCpmUpdate$36();
                break;
            case 7:
                this.f$0.lambda$applyStarsStats$28();
                break;
            default:
                this.f$0.lambda$onNestedScroll$42();
                break;
        }
    }
}
