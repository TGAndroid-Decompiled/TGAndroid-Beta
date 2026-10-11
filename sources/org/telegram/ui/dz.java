package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class dz {
    public float f37144a;
    public float f37145b;
    public boolean f37146c;
    public float d;
    public float f37147e;
    public float f37148f;
    public float f37149g;
    public boolean h;
    public boolean f37150i;
    public zg.d f37151j;
    public long f37152k;
    public boolean f37153l;
    public boolean f37154m;
    public boolean f37155n;
    public float f37156o;
    public int f37157p;
    public TLRPC.Document f37158q;
    public final ImageReceiver f37159r;
    public String f37160s;

    public dz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37159r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
