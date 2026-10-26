package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class h70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.o1 H;
    public org.telegram.ui.ActionBar.k3 I;
    public org.telegram.ui.Components.aa0 f39920b;
    public a3 d;
    public int e;
    public View f39922f;
    public boolean h;
    public TLRPC.Chat f39923n;
    public boolean f39924r;
    public View f39925s;
    public org.telegram.ui.Components.da0 v;
    public VideoPlayerHolderBase f39926w;
    public w2 f39927x;
    public int f39919a = 0;
    public final org.telegram.ui.Components.w90 f39921c = new org.telegram.ui.Components.w90();
    public final a0.h f39928y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(h4 h4Var, org.telegram.ui.Components.u11 u11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, h4 h4Var);
}
