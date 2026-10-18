package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class py {
    public float f40220a;
    public float f40221b;
    public boolean f40222c;
    public float d;
    public float e;
    public float f40223f;
    public float f40224g;
    public boolean h;
    public boolean f40225i;
    public ah.e f40226j;
    public long f40227k;
    public boolean f40228l;
    public boolean f40229m;
    public boolean f40230n;
    public float f40231o;
    public int f40232p;
    public TLRPC.Document f40233q;
    public final ImageReceiver f40234r;
    public String f40235s;

    public py() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f40234r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
