package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f33702a;
    public float f33703b;
    public boolean f33704c;
    public float d;
    public float e;
    public float f33705f;
    public float f33706g;
    public boolean h;
    public boolean f33707i;
    public zg.d f33708j;
    public long f33709k;
    public boolean f33710l;
    public boolean f33711m;
    public boolean f33712n;
    public float f33713o;
    public int f33714p;
    public TLRPC.Document f33715q;
    public final ImageReceiver f33716r;
    public String f33717s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33716r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
