package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jz {
    public float f37173a;
    public float f37174b;
    public boolean f37175c;
    public float d;
    public float e;
    public float f37176f;
    public float f37177g;
    public boolean h;
    public boolean f37178i;
    public ah.e f37179j;
    public long f37180k;
    public boolean f37181l;
    public boolean f37182m;
    public boolean f37183n;
    public float f37184o;
    public int f37185p;
    public TLRPC.Document f37186q;
    public final ImageReceiver f37187r;
    public String f37188s;

    public jz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37187r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
