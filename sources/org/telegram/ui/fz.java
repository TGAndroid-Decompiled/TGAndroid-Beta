package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36436a;
    public float f36437b;
    public boolean f36438c;
    public float d;
    public float f36439e;
    public float f36440f;
    public float f36441g;
    public boolean h;
    public boolean f36442i;
    public zg.d f36443j;
    public long f36444k;
    public boolean f36445l;
    public boolean f36446m;
    public boolean f36447n;
    public float f36448o;
    public int f36449p;
    public TLRPC.Document f36450q;
    public final ImageReceiver f36451r;
    public String f36452s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36451r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
