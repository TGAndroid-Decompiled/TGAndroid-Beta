package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ny {
    public float f42016a;
    public float f42017b;
    public boolean f42018c;
    public float d;
    public float e;
    public float f42019f;
    public float f42020g;
    public boolean h;
    public boolean f42021i;
    public bh.e f42022j;
    public long f42023k;
    public boolean f42024l;
    public boolean f42025m;
    public boolean f42026n;
    public float f42027o;
    public int f42028p;
    public TLRPC.Document f42029q;
    public final ImageReceiver f42030r;
    public String f42031s;

    public ny() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f42030r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
