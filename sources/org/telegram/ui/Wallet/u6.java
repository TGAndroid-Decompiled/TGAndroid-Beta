package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class u6 {
    public final CountDownLatch f35608a = new CountDownLatch(1);
    public int f35609b;
    public byte[] f35610c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f35608a.getCount() == 0) {
            return;
        }
        this.f35610c = bArr;
        this.d = hostException;
        this.f35608a.countDown();
    }
}
