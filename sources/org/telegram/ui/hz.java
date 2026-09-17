package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hz {
    public float f34382a;
    public float f34383b;
    public boolean f34384c;
    public float d;
    public float e;
    public float f34385f;
    public float f34386g;
    public boolean h;
    public boolean f34387i;
    public zg.d f34388j;
    public long f34389k;
    public boolean f34390l;
    public boolean f34391m;
    public boolean f34392n;
    public float f34393o;
    public int f34394p;
    public TLRPC.Document f34395q;
    public final ImageReceiver f34396r;
    public String f34397s;

    public hz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f34396r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
