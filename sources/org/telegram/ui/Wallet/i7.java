package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class i7 {
    public final CountDownLatch f42597a = new CountDownLatch(1);
    public int f42598b;
    public byte[] f42599c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f42597a.getCount() == 0) {
            return;
        }
        this.f42599c = bArr;
        this.d = hostException;
        this.f42597a.countDown();
    }
}
