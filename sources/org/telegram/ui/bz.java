package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f35613a;
    public float f35614b;
    public boolean f35615c;
    public float d;
    public float f35616e;
    public float f35617f;
    public float f35618g;
    public boolean h;
    public boolean f35619i;
    public ng.d f35620j;
    public long f35621k;
    public boolean f35622l;
    public boolean f35623m;
    public boolean f35624n;
    public float f35625o;
    public int f35626p;
    public TLRPC.Document f35627q;
    public final ImageReceiver f35628r;
    public String f35629s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f35628r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
