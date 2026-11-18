package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class z7 {
    public final CountDownLatch f45355a = new CountDownLatch(1);
    public int f45356b;
    public byte[] f45357c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f45355a.getCount() == 0) {
            return;
        }
        this.f45357c = bArr;
        this.d = hostException;
        this.f45355a.countDown();
    }
}
