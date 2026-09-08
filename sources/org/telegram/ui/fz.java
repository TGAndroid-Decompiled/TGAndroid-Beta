package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36523a;
    public float f36524b;
    public boolean f36525c;
    public float d;
    public float f36526e;
    public float f36527f;
    public float f36528g;
    public boolean h;
    public boolean f36529i;
    public ah.e f36530j;
    public long f36531k;
    public boolean f36532l;
    public boolean f36533m;
    public boolean f36534n;
    public float f36535o;
    public int f36536p;
    public TLRPC.Document f36537q;
    public final ImageReceiver f36538r;
    public String f36539s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36538r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
