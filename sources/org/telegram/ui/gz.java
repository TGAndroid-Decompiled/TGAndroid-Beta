package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class gz {
    public float f38178a;
    public float f38179b;
    public boolean f38180c;
    public float d;
    public float f38181e;
    public float f38182f;
    public float f38183g;
    public boolean h;
    public boolean f38184i;
    public zg.d f38185j;
    public long f38186k;
    public boolean f38187l;
    public boolean f38188m;
    public boolean f38189n;
    public float f38190o;
    public int f38191p;
    public TLRPC.Document f38192q;
    public final ImageReceiver f38193r;
    public String f38194s;

    public gz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f38193r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
