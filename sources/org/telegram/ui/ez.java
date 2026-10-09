package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ez {
    public float f37385a;
    public float f37386b;
    public boolean f37387c;
    public float d;
    public float f37388e;
    public float f37389f;
    public float f37390g;
    public boolean h;
    public boolean f37391i;
    public zg.d f37392j;
    public long f37393k;
    public boolean f37394l;
    public boolean f37395m;
    public boolean f37396n;
    public float f37397o;
    public int f37398p;
    public TLRPC.Document f37399q;
    public final ImageReceiver f37400r;
    public String f37401s;

    public ez() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f37400r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
