package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class py {
    public float f42527a;
    public float f42528b;
    public boolean f42529c;
    public float d;
    public float e;
    public float f42530f;
    public float f42531g;
    public boolean h;
    public boolean f42532i;
    public bh.e f42533j;
    public long f42534k;
    public boolean f42535l;
    public boolean f42536m;
    public boolean f42537n;
    public float f42538o;
    public int f42539p;
    public TLRPC.Document f42540q;
    public final ImageReceiver f42541r;
    public String f42542s;

    public py() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f42541r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
