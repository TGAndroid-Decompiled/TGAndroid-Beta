package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class py {
    public float f40558a;
    public float f40559b;
    public boolean f40560c;
    public float d;
    public float e;
    public float f40561f;
    public float f40562g;
    public boolean h;
    public boolean f40563i;
    public ah.e f40564j;
    public long f40565k;
    public boolean f40566l;
    public boolean f40567m;
    public boolean f40568n;
    public float f40569o;
    public int f40570p;
    public TLRPC.Document f40571q;
    public final ImageReceiver f40572r;
    public String f40573s;

    public py() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f40572r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
