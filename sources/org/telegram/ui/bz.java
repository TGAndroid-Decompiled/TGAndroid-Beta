package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f32512a;
    public float f32513b;
    public boolean f32514c;
    public float d;
    public float e;
    public float f32515f;
    public float f32516g;
    public boolean h;
    public boolean f32517i;
    public zg.d f32518j;
    public long f32519k;
    public boolean f32520l;
    public boolean f32521m;
    public boolean f32522n;
    public float f32523o;
    public int f32524p;
    public TLRPC.Document f32525q;
    public final ImageReceiver f32526r;
    public String f32527s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32526r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
