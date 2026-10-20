package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ny {
    public float f39704a;
    public float f39705b;
    public boolean f39706c;
    public float d;
    public float e;
    public float f39707f;
    public float f39708g;
    public boolean h;
    public boolean f39709i;
    public ah.e f39710j;
    public long f39711k;
    public boolean f39712l;
    public boolean f39713m;
    public boolean f39714n;
    public float f39715o;
    public int f39716p;
    public TLRPC.Document f39717q;
    public final ImageReceiver f39718r;
    public String f39719s;

    public ny() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f39718r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
