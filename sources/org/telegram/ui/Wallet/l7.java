package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class l7 {
    public final CountDownLatch f42794a = new CountDownLatch(1);
    public int f42795b;
    public byte[] f42796c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f42794a.getCount() == 0) {
            return;
        }
        this.f42796c = bArr;
        this.d = hostException;
        this.f42794a.countDown();
    }
}
