package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class f70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.h3 I;
    public org.telegram.ui.Components.x90 f37215b;
    public c3 d;
    public int e;
    public View f37217f;
    public boolean h;
    public TLRPC.Chat f37218n;
    public boolean f37219r;
    public View f37220s;
    public org.telegram.ui.Components.aa0 v;
    public VideoPlayerHolderBase f37221w;
    public y2 f37222x;
    public int f37214a = 0;
    public final org.telegram.ui.Components.t90 f37216c = new org.telegram.ui.Components.t90();
    public final a0.h f37223y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(i4 i4Var, org.telegram.ui.Components.l11 l11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, i4 i4Var);
}
