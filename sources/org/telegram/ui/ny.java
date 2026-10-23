package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ny {
    public float f39708a;
    public float f39709b;
    public boolean f39710c;
    public float d;
    public float e;
    public float f39711f;
    public float f39712g;
    public boolean h;
    public boolean f39713i;
    public ah.e f39714j;
    public long f39715k;
    public boolean f39716l;
    public boolean f39717m;
    public boolean f39718n;
    public float f39719o;
    public int f39720p;
    public TLRPC.Document f39721q;
    public final ImageReceiver f39722r;
    public String f39723s;

    public ny() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f39722r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
