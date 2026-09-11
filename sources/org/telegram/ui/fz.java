package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fz {
    public float f36496a;
    public float f36497b;
    public boolean f36498c;
    public float d;
    public float f36499e;
    public float f36500f;
    public float f36501g;
    public boolean h;
    public boolean f36502i;
    public ah.e f36503j;
    public long f36504k;
    public boolean f36505l;
    public boolean f36506m;
    public boolean f36507n;
    public float f36508o;
    public int f36509p;
    public TLRPC.Document f36510q;
    public final ImageReceiver f36511r;
    public String f36512s;

    public fz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36511r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
