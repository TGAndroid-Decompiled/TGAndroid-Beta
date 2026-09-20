package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f33754a;
    public float f33755b;
    public boolean f33756c;
    public float d;
    public float e;
    public float f33757f;
    public float f33758g;
    public boolean h;
    public boolean f33759i;
    public zg.d f33760j;
    public long f33761k;
    public boolean f33762l;
    public boolean f33763m;
    public boolean f33764n;
    public float f33765o;
    public int f33766p;
    public TLRPC.Document f33767q;
    public final ImageReceiver f33768r;
    public String f33769s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33768r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
