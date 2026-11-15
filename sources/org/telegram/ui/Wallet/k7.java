package org.telegram.ui.Wallet;

import java.util.concurrent.CountDownLatch;
import org.telegram.ui.Wallet.WalletEngine2;
public final class k7 {
    public final CountDownLatch f44070a = new CountDownLatch(1);
    public int f44071b;
    public byte[] f44072c;
    public WalletEngine2.HttpTransport.HostException d;

    public final synchronized void a(byte[] bArr, WalletEngine2.HttpTransport.HostException hostException) {
        if (this.f44070a.getCount() == 0) {
            return;
        }
        this.f44072c = bArr;
        this.d = hostException;
        this.f44070a.countDown();
    }
}
