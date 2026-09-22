package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f33720a;
    public float f33721b;
    public boolean f33722c;
    public float d;
    public float e;
    public float f33723f;
    public float f33724g;
    public boolean h;
    public boolean f33725i;
    public zg.d f33726j;
    public long f33727k;
    public boolean f33728l;
    public boolean f33729m;
    public boolean f33730n;
    public float f33731o;
    public int f33732p;
    public TLRPC.Document f33733q;
    public final ImageReceiver f33734r;
    public String f33735s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33734r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
