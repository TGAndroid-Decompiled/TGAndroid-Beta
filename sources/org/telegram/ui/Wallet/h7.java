package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class h7 {
    public final CountDownLatch f34304a = new CountDownLatch(1);
    public int f34305b;
    public byte[] f34306c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f34304a.getCount() == 0) {
            return;
        }
        this.f34306c = bArr;
        this.d = hostException;
        this.f34304a.countDown();
    }
}
