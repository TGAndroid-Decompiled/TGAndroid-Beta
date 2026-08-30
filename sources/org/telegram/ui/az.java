package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class az {
    public float f32727a;
    public float f32728b;
    public boolean f32729c;
    public float d;
    public float e;
    public float f32730f;
    public float f32731g;
    public boolean h;
    public boolean f32732i;
    public mg.d f32733j;
    public long f32734k;
    public boolean f32735l;
    public boolean f32736m;
    public boolean f32737n;
    public float f32738o;
    public int f32739p;
    public TLRPC.Document f32740q;
    public final ImageReceiver f32741r;
    public String f32742s;

    public az() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32741r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
