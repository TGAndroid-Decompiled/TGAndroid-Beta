package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hz {
    public float f34387a;
    public float f34388b;
    public boolean f34389c;
    public float d;
    public float e;
    public float f34390f;
    public float f34391g;
    public boolean h;
    public boolean f34392i;
    public zg.d f34393j;
    public long f34394k;
    public boolean f34395l;
    public boolean f34396m;
    public boolean f34397n;
    public float f34398o;
    public int f34399p;
    public TLRPC.Document f34400q;
    public final ImageReceiver f34401r;
    public String f34402s;

    public hz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f34401r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
