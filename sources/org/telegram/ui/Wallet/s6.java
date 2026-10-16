package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class s6 {
    public final CountDownLatch f33430a = new CountDownLatch(1);
    public int f33431b;
    public byte[] f33432c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f33430a.getCount() == 0) {
            return;
        }
        this.f33432c = bArr;
        this.d = hostException;
        this.f33430a.countDown();
    }
}
