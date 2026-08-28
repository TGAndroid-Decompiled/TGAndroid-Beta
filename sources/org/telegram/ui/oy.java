package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class oy {
    public float f41262a;
    public float f41263b;
    public boolean f41264c;
    public float d;
    public float f41265e;
    public float f41266f;
    public float f41267g;
    public boolean h;
    public boolean f41268i;
    public hg.d f41269j;
    public long f41270k;
    public boolean f41271l;
    public boolean f41272m;
    public boolean f41273n;
    public float f41274o;
    public int f41275p;
    public TLRPC.Document f41276q;
    public final ImageReceiver f41277r;
    public String f41278s;

    public oy() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f41277r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
