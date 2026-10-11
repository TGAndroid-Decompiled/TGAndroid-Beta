package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class u6 {
    public final CountDownLatch f35642a = new CountDownLatch(1);
    public int f35643b;
    public byte[] f35644c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f35642a.getCount() == 0) {
            return;
        }
        this.f35644c = bArr;
        this.d = hostException;
        this.f35642a.countDown();
    }
}
