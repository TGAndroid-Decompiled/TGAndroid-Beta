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
    public org.telegram.ui.Components.q90 f36422b;
    public b3 d;
    public int e;
    public View f36424f;
    public boolean h;
    public TLRPC.Chat f36425n;
    public boolean f36426r;
    public View f36427s;
    public org.telegram.ui.Components.t90 v;
    public VideoPlayerHolderBase f36428w;
    public x2 f36429x;
    public int f36421a = 0;
    public final org.telegram.ui.Components.m90 f36423c = new org.telegram.ui.Components.m90();
    public final a0.i f36430y = new a0.i();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(g4 g4Var, org.telegram.ui.Components.z01 z01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, g4 g4Var);
}
