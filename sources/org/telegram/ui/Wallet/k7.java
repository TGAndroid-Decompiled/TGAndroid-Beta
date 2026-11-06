package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class k7 {
    public final CountDownLatch f42684a = new CountDownLatch(1);
    public int f42685b;
    public byte[] f42686c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f42684a.getCount() == 0) {
            return;
        }
        this.f42686c = bArr;
        this.d = hostException;
        this.f42684a.countDown();
    }
}
