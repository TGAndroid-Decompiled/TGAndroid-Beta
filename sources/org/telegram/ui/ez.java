package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ez {
    public float f37387a;
    public float f37388b;
    public boolean f37389c;
    public float d;
    public float f37390e;
    public float f37391f;
    public float f37392g;
    public boolean h;
    public boolean f37393i;
    public zg.d f37394j;
    public long f37395k;
    public boolean f37396l;
    public boolean f37397m;
    public boolean f37398n;
    public float f37399o;
    public int f37400p;
    public TLRPC.Document f37401q;
    public final ImageReceiver f37402r;
    public String f37403s;

    public ez() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37402r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
