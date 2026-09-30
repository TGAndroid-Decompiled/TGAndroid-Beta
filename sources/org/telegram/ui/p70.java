package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class p70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.e3 I;
    public org.telegram.ui.Components.r90 f36525b;
    public b3 d;
    public int e;
    public View f36527f;
    public boolean h;
    public TLRPC.Chat f36528n;
    public boolean f36529r;
    public View f36530s;
    public org.telegram.ui.Components.u90 v;
    public VideoPlayerHolderBase f36531w;
    public x2 f36532x;
    public int f36524a = 0;
    public final org.telegram.ui.Components.n90 f36526c = new org.telegram.ui.Components.n90();
    public final a0.i f36533y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.a11 a11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
