package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class j70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.o1 H;
    public org.telegram.ui.ActionBar.k3 I;
    public org.telegram.ui.Components.ba0 f40449b;
    public a3 d;
    public int e;
    public View f40451f;
    public boolean h;
    public TLRPC.Chat f40452n;
    public boolean f40453r;
    public View f40454s;
    public org.telegram.ui.Components.ea0 v;
    public VideoPlayerHolderBase f40455w;
    public w2 f40456x;
    public int f40448a = 0;
    public final org.telegram.ui.Components.x90 f40450c = new org.telegram.ui.Components.x90();
    public final a0.h f40457y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(h4 h4Var, org.telegram.ui.Components.v11 v11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, h4 h4Var);
}
