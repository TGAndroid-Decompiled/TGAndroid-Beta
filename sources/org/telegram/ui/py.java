package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class py {
    public float f40262a;
    public float f40263b;
    public boolean f40264c;
    public float d;
    public float e;
    public float f40265f;
    public float f40266g;
    public boolean h;
    public boolean f40267i;
    public ah.e f40268j;
    public long f40269k;
    public boolean f40270l;
    public boolean f40271m;
    public boolean f40272n;
    public float f40273o;
    public int f40274p;
    public TLRPC.Document f40275q;
    public final ImageReceiver f40276r;
    public String f40277s;

    public py() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f40276r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
