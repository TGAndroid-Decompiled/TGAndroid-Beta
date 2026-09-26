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
    public org.telegram.ui.Components.p90 f36419b;
    public b3 d;
    public int e;
    public View f36421f;
    public boolean h;
    public TLRPC.Chat f36422n;
    public boolean f36423r;
    public View f36424s;
    public org.telegram.ui.Components.s90 v;
    public VideoPlayerHolderBase f36425w;
    public x2 f36426x;
    public int f36418a = 0;
    public final org.telegram.ui.Components.l90 f36420c = new org.telegram.ui.Components.l90();
    public final a0.i f36427y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.y01 y01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
