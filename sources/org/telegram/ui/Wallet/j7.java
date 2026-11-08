package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class j7 {
    public final CountDownLatch f42679a = new CountDownLatch(1);
    public int f42680b;
    public byte[] f42681c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f42679a.getCount() == 0) {
            return;
        }
        this.f42681c = bArr;
        this.d = hostException;
        this.f42679a.countDown();
    }
}
