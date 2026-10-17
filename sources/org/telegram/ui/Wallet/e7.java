package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class e7 {
    public final CountDownLatch f34169a = new CountDownLatch(1);
    public int f34170b;
    public byte[] f34171c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f34169a.getCount() == 0) {
            return;
        }
        this.f34171c = bArr;
        this.d = hostException;
        this.f34169a.countDown();
    }
}
