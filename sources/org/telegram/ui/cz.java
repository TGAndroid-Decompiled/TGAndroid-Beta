package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cz {
    public float f33259a;
    public float f33260b;
    public boolean f33261c;
    public float d;
    public float e;
    public float f33262f;
    public float f33263g;
    public boolean h;
    public boolean f33264i;
    public mg.d f33265j;
    public long f33266k;
    public boolean f33267l;
    public boolean f33268m;
    public boolean f33269n;
    public float f33270o;
    public int f33271p;
    public TLRPC.Document f33272q;
    public final ImageReceiver f33273r;
    public String f33274s;

    public cz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33273r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
