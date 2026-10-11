package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dz {
    public float f37178a;
    public float f37179b;
    public boolean f37180c;
    public float d;
    public float f37181e;
    public float f37182f;
    public float f37183g;
    public boolean h;
    public boolean f37184i;
    public zg.d f37185j;
    public long f37186k;
    public boolean f37187l;
    public boolean f37188m;
    public boolean f37189n;
    public float f37190o;
    public int f37191p;
    public TLRPC.Document f37192q;
    public final ImageReceiver f37193r;
    public String f37194s;

    public dz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37193r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
