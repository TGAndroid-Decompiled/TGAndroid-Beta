package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f32513a;
    public float f32514b;
    public boolean f32515c;
    public float d;
    public float e;
    public float f32516f;
    public float f32517g;
    public boolean h;
    public boolean f32518i;
    public zg.d f32519j;
    public long f32520k;
    public boolean f32521l;
    public boolean f32522m;
    public boolean f32523n;
    public float f32524o;
    public int f32525p;
    public TLRPC.Document f32526q;
    public final ImageReceiver f32527r;
    public String f32528s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32527r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
