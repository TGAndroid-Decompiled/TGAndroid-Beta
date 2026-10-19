package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ny {
    public float f39698a;
    public float f39699b;
    public boolean f39700c;
    public float d;
    public float e;
    public float f39701f;
    public float f39702g;
    public boolean h;
    public boolean f39703i;
    public ah.e f39704j;
    public long f39705k;
    public boolean f39706l;
    public boolean f39707m;
    public boolean f39708n;
    public float f39709o;
    public int f39710p;
    public TLRPC.Document f39711q;
    public final ImageReceiver f39712r;
    public String f39713s;

    public ny() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f39712r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
