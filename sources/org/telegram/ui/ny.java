package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ny {
    public float f39699a;
    public float f39700b;
    public boolean f39701c;
    public float d;
    public float e;
    public float f39702f;
    public float f39703g;
    public boolean h;
    public boolean f39704i;
    public ah.e f39705j;
    public long f39706k;
    public boolean f39707l;
    public boolean f39708m;
    public boolean f39709n;
    public float f39710o;
    public int f39711p;
    public TLRPC.Document f39712q;
    public final ImageReceiver f39713r;
    public String f39714s;

    public ny() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f39713r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
