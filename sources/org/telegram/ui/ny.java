package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ny {
    public float f39707a;
    public float f39708b;
    public boolean f39709c;
    public float d;
    public float e;
    public float f39710f;
    public float f39711g;
    public boolean h;
    public boolean f39712i;
    public ah.e f39713j;
    public long f39714k;
    public boolean f39715l;
    public boolean f39716m;
    public boolean f39717n;
    public float f39718o;
    public int f39719p;
    public TLRPC.Document f39720q;
    public final ImageReceiver f39721r;
    public String f39722s;

    public ny() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f39721r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
