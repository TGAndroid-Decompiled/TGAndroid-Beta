package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36497a;
    public float f36498b;
    public boolean f36499c;
    public float d;
    public float f36500e;
    public float f36501f;
    public float f36502g;
    public boolean h;
    public boolean f36503i;
    public ah.e f36504j;
    public long f36505k;
    public boolean f36506l;
    public boolean f36507m;
    public boolean f36508n;
    public float f36509o;
    public int f36510p;
    public TLRPC.Document f36511q;
    public final ImageReceiver f36512r;
    public String f36513s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36512r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
