package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f33643a;
    public float f33644b;
    public boolean f33645c;
    public float d;
    public float e;
    public float f33646f;
    public float f33647g;
    public boolean h;
    public boolean f33648i;
    public zg.d f33649j;
    public long f33650k;
    public boolean f33651l;
    public boolean f33652m;
    public boolean f33653n;
    public float f33654o;
    public int f33655p;
    public TLRPC.Document f33656q;
    public final ImageReceiver f33657r;
    public String f33658s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f33657r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
