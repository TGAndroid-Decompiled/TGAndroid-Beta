package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ez {
    public float f37431a;
    public float f37432b;
    public boolean f37433c;
    public float d;
    public float f37434e;
    public float f37435f;
    public float f37436g;
    public boolean h;
    public boolean f37437i;
    public zg.d f37438j;
    public long f37439k;
    public boolean f37440l;
    public boolean f37441m;
    public boolean f37442n;
    public float f37443o;
    public int f37444p;
    public TLRPC.Document f37445q;
    public final ImageReceiver f37446r;
    public String f37447s;

    public ez() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37446r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
