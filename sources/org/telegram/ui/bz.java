package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f32511a;
    public float f32512b;
    public boolean f32513c;
    public float d;
    public float e;
    public float f32514f;
    public float f32515g;
    public boolean h;
    public boolean f32516i;
    public zg.d f32517j;
    public long f32518k;
    public boolean f32519l;
    public boolean f32520m;
    public boolean f32521n;
    public float f32522o;
    public int f32523p;
    public TLRPC.Document f32524q;
    public final ImageReceiver f32525r;
    public String f32526s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32525r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
