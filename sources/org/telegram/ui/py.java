package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class py {
    public float f40256a;
    public float f40257b;
    public boolean f40258c;
    public float d;
    public float e;
    public float f40259f;
    public float f40260g;
    public boolean h;
    public boolean f40261i;
    public ah.e f40262j;
    public long f40263k;
    public boolean f40264l;
    public boolean f40265m;
    public boolean f40266n;
    public float f40267o;
    public int f40268p;
    public TLRPC.Document f40269q;
    public final ImageReceiver f40270r;
    public String f40271s;

    public py() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f40270r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
