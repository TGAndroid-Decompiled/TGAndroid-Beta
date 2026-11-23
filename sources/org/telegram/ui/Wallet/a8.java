package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class a8 {
    public final CountDownLatch f44057a = new CountDownLatch(1);
    public int f44058b;
    public byte[] f44059c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f44057a.getCount() == 0) {
            return;
        }
        this.f44059c = bArr;
        this.d = hostException;
        this.f44057a.countDown();
    }
}
