package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f33782a;
    public float f33783b;
    public boolean f33784c;
    public float d;
    public float e;
    public float f33785f;
    public float f33786g;
    public boolean h;
    public boolean f33787i;
    public zg.d f33788j;
    public long f33789k;
    public boolean f33790l;
    public boolean f33791m;
    public boolean f33792n;
    public float f33793o;
    public int f33794p;
    public TLRPC.Document f33795q;
    public final ImageReceiver f33796r;
    public String f33797s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33796r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
