package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f32514a;
    public float f32515b;
    public boolean f32516c;
    public float d;
    public float e;
    public float f32517f;
    public float f32518g;
    public boolean h;
    public boolean f32519i;
    public zg.d f32520j;
    public long f32521k;
    public boolean f32522l;
    public boolean f32523m;
    public boolean f32524n;
    public float f32525o;
    public int f32526p;
    public TLRPC.Document f32527q;
    public final ImageReceiver f32528r;
    public String f32529s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32528r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
