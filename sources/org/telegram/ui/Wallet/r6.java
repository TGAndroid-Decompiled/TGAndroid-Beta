package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class r6 {
    public final CountDownLatch f35419a = new CountDownLatch(1);
    public int f35420b;
    public byte[] f35421c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f35419a.getCount() == 0) {
            return;
        }
        this.f35421c = bArr;
        this.d = hostException;
        this.f35419a.countDown();
    }
}
