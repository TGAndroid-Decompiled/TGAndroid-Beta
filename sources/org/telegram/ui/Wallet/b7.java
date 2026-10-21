package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class b7 {
    public final CountDownLatch f34044a = new CountDownLatch(1);
    public int f34045b;
    public byte[] f34046c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f34044a.getCount() == 0) {
            return;
        }
        this.f34046c = bArr;
        this.d = hostException;
        this.f34044a.countDown();
    }
}
