package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36444a;
    public float f36445b;
    public boolean f36446c;
    public float d;
    public float f36447e;
    public float f36448f;
    public float f36449g;
    public boolean h;
    public boolean f36450i;
    public zg.d f36451j;
    public long f36452k;
    public boolean f36453l;
    public boolean f36454m;
    public boolean f36455n;
    public float f36456o;
    public int f36457p;
    public TLRPC.Document f36458q;
    public final ImageReceiver f36459r;
    public String f36460s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36459r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
