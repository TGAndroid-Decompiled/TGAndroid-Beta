package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public float f32598a;
    public float f32599b;
    public boolean f32600c;
    public float d;
    public float e;
    public float f32601f;
    public float f32602g;
    public boolean h;
    public boolean f32603i;
    public zg.d f32604j;
    public long f32605k;
    public boolean f32606l;
    public boolean f32607m;
    public boolean f32608n;
    public float f32609o;
    public int f32610p;
    public TLRPC.Document f32611q;
    public final ImageReceiver f32612r;
    public String f32613s;

    public bz() {
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f32612r = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setAllowDrawWhileCacheGenerating(true);
    }
}
