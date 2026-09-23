package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cz {
    public float f32440a;
    public float f32441b;
    public boolean f32442c;
    public float d;
    public float e;
    public float f32443f;
    public float f32444g;
    public boolean h;
    public boolean f32445i;
    public zg.d f32446j;
    public long f32447k;
    public boolean f32448l;
    public boolean f32449m;
    public boolean f32450n;
    public float f32451o;
    public int f32452p;
    public TLRPC.Document f32453q;
    public final ImageReceiver f32454r;
    public String f32455s;

    public cz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32454r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
