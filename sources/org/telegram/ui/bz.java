package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f35623a;
    public float f35624b;
    public boolean f35625c;
    public float d;
    public float f35626e;
    public float f35627f;
    public float f35628g;
    public boolean h;
    public boolean f35629i;
    public ng.d f35630j;
    public long f35631k;
    public boolean f35632l;
    public boolean f35633m;
    public boolean f35634n;
    public float f35635o;
    public int f35636p;
    public TLRPC.Document f35637q;
    public final ImageReceiver f35638r;
    public String f35639s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f35638r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
