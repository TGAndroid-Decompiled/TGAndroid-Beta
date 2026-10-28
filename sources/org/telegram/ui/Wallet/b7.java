package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class b7 {
    public final CountDownLatch f36422a = new CountDownLatch(1);
    public int f36423b;
    public byte[] f36424c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f36422a.getCount() == 0) {
            return;
        }
        this.f36424c = bArr;
        this.d = hostException;
        this.f36422a.countDown();
    }
}
