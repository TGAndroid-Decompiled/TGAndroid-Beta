package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ny {
    public float f42019a;
    public float f42020b;
    public boolean f42021c;
    public float d;
    public float e;
    public float f42022f;
    public float f42023g;
    public boolean h;
    public boolean f42024i;
    public bh.e f42025j;
    public long f42026k;
    public boolean f42027l;
    public boolean f42028m;
    public boolean f42029n;
    public float f42030o;
    public int f42031p;
    public TLRPC.Document f42032q;
    public final ImageReceiver f42033r;
    public String f42034s;

    public ny() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f42033r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
