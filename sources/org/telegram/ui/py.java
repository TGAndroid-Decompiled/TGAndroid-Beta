package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class py {
    public float f40647a;
    public float f40648b;
    public boolean f40649c;
    public float d;
    public float e;
    public float f40650f;
    public float f40651g;
    public boolean h;
    public boolean f40652i;
    public ah.e f40653j;
    public long f40654k;
    public boolean f40655l;
    public boolean f40656m;
    public boolean f40657n;
    public float f40658o;
    public int f40659p;
    public TLRPC.Document f40660q;
    public final ImageReceiver f40661r;
    public String f40662s;

    public py() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f40661r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
