package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class b7 {
    public final CountDownLatch f34043a = new CountDownLatch(1);
    public int f34044b;
    public byte[] f34045c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f34043a.getCount() == 0) {
            return;
        }
        this.f34045c = bArr;
        this.d = hostException;
        this.f34043a.countDown();
    }
}
