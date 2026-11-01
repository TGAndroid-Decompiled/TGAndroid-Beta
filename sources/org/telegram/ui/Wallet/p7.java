package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class p7 {
    public final CountDownLatch f35038a = new CountDownLatch(1);
    public int f35039b;
    public byte[] f35040c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f35038a.getCount() == 0) {
            return;
        }
        this.f35040c = bArr;
        this.d = hostException;
        this.f35038a.countDown();
    }
}
