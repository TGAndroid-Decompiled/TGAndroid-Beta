package org.telegram.tgnet;

public final class ConnectionsManager$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final boolean f$1;
    public final int f$2;

    public ConnectionsManager$$ExternalSyntheticLambda13(int i, int i2, int i3, boolean z) {
        this.$r8$classId = i3;
        this.f$0 = i;
        this.f$1 = z;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.f$1, this.f$0, this.f$2);
                break;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.f$0, this.f$1, this.f$2);
                break;
        }
    }

    public ConnectionsManager$$ExternalSyntheticLambda13(boolean z, int i, int i2) {
        this.$r8$classId = 1;
        this.f$1 = z;
        this.f$0 = i;
        this.f$2 = i2;
    }
}
