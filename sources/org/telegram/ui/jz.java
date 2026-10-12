package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jz {
    public float f37459a;
    public float f37460b;
    public boolean f37461c;
    public float d;
    public float e;
    public float f37462f;
    public float f37463g;
    public boolean h;
    public boolean f37464i;
    public ah.e f37465j;
    public long f37466k;
    public boolean f37467l;
    public boolean f37468m;
    public boolean f37469n;
    public float f37470o;
    public int f37471p;
    public TLRPC.Document f37472q;
    public final ImageReceiver f37473r;
    public String f37474s;

    public jz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37473r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
