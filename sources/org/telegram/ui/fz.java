package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36430a;
    public float f36431b;
    public boolean f36432c;
    public float d;
    public float f36433e;
    public float f36434f;
    public float f36435g;
    public boolean h;
    public boolean f36436i;
    public zg.d f36437j;
    public long f36438k;
    public boolean f36439l;
    public boolean f36440m;
    public boolean f36441n;
    public float f36442o;
    public int f36443p;
    public TLRPC.Document f36444q;
    public final ImageReceiver f36445r;
    public String f36446s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36445r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
