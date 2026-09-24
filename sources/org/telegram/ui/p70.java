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
    public org.telegram.ui.Components.o90 f36410b;
    public b3 d;
    public int e;
    public View f36412f;
    public boolean h;
    public TLRPC.Chat f36413n;
    public boolean f36414r;
    public View f36415s;
    public org.telegram.ui.Components.r90 v;
    public VideoPlayerHolderBase f36416w;
    public x2 f36417x;
    public int f36409a = 0;
    public final org.telegram.ui.Components.k90 f36411c = new org.telegram.ui.Components.k90();
    public final a0.i f36418y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.x01 x01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
