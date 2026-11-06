package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class k7 {
    public final CountDownLatch f42708a = new CountDownLatch(1);
    public int f42709b;
    public byte[] f42710c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f42708a.getCount() == 0) {
            return;
        }
        this.f42710c = bArr;
        this.d = hostException;
        this.f42708a.countDown();
    }
}
