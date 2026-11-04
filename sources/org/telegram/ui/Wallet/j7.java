package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class j7 {
    public final CountDownLatch f42706a = new CountDownLatch(1);
    public int f42707b;
    public byte[] f42708c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f42706a.getCount() == 0) {
            return;
        }
        this.f42708c = bArr;
        this.d = hostException;
        this.f42706a.countDown();
    }
}
