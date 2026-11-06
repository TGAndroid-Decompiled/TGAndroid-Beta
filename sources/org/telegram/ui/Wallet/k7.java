package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class k7 {
    public final CountDownLatch f42709a = new CountDownLatch(1);
    public int f42710b;
    public byte[] f42711c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f42709a.getCount() == 0) {
            return;
        }
        this.f42711c = bArr;
        this.d = hostException;
        this.f42709a.countDown();
    }
}
