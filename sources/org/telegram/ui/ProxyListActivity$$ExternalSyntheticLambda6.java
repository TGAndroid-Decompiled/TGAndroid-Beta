package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ProxyRotationController;
import org.telegram.messenger.SharedConfig;

public final class ProxyListActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final SharedConfig.ProxyInfo f$0;
    public final long f$1;

    public ProxyListActivity$$ExternalSyntheticLambda6(SharedConfig.ProxyInfo proxyInfo, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = proxyInfo;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        long j = this.f$1;
        SharedConfig.ProxyInfo proxyInfo = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
                proxyInfo.checking = false;
                if (j == -1) {
                    proxyInfo.available = false;
                    proxyInfo.ping = 0L;
                } else {
                    proxyInfo.ping = j;
                    proxyInfo.available = true;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
                break;
            default:
                ProxyRotationController.lambda$new$0(proxyInfo, j);
                break;
        }
    }
}
