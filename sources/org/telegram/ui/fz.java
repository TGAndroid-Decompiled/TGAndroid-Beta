package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36431a;
    public float f36432b;
    public boolean f36433c;
    public float d;
    public float f36434e;
    public float f36435f;
    public float f36436g;
    public boolean h;
    public boolean f36437i;
    public zg.d f36438j;
    public long f36439k;
    public boolean f36440l;
    public boolean f36441m;
    public boolean f36442n;
    public float f36443o;
    public int f36444p;
    public TLRPC.Document f36445q;
    public final ImageReceiver f36446r;
    public String f36447s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36446r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
