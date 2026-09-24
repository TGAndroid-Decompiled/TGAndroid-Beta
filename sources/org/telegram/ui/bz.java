package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f32498a;
    public float f32499b;
    public boolean f32500c;
    public float d;
    public float e;
    public float f32501f;
    public float f32502g;
    public boolean h;
    public boolean f32503i;
    public zg.d f32504j;
    public long f32505k;
    public boolean f32506l;
    public boolean f32507m;
    public boolean f32508n;
    public float f32509o;
    public int f32510p;
    public TLRPC.Document f32511q;
    public final ImageReceiver f32512r;
    public String f32513s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32512r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
