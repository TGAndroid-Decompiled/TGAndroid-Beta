package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ez {
    public float f33352a;
    public float f33353b;
    public boolean f33354c;
    public float d;
    public float e;
    public float f33355f;
    public float f33356g;
    public boolean h;
    public boolean f33357i;
    public zg.d f33358j;
    public long f33359k;
    public boolean f33360l;
    public boolean f33361m;
    public boolean f33362n;
    public float f33363o;
    public int f33364p;
    public TLRPC.Document f33365q;
    public final ImageReceiver f33366r;
    public String f33367s;

    public ez() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33366r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
