package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36524a;
    public float f36525b;
    public boolean f36526c;
    public float d;
    public float f36527e;
    public float f36528f;
    public float f36529g;
    public boolean h;
    public boolean f36530i;
    public ah.e f36531j;
    public long f36532k;
    public boolean f36533l;
    public boolean f36534m;
    public boolean f36535n;
    public float f36536o;
    public int f36537p;
    public TLRPC.Document f36538q;
    public final ImageReceiver f36539r;
    public String f36540s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36539r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
