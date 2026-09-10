package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hz {
    public float f33487a;
    public float f33488b;
    public boolean f33489c;
    public float d;
    public float e;
    public float f33490f;
    public float f33491g;
    public boolean h;
    public boolean f33492i;
    public yg.e f33493j;
    public long f33494k;
    public boolean f33495l;
    public boolean f33496m;
    public boolean f33497n;
    public float f33498o;
    public int f33499p;
    public TLRPC.Document f33500q;
    public final ImageReceiver f33501r;
    public String f33502s;

    public hz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33501r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
