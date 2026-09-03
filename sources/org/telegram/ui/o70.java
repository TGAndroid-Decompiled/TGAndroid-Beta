package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class o70 {
    public String C;
    public int D;
    public org.telegram.ui.ActionBar.p1 E;
    public org.telegram.ui.ActionBar.h3 F;
    public org.telegram.ui.Components.h90 f39554b;
    public d3 d;
    public int f39556e;
    public View f39557f;
    public boolean h;
    public TLRPC.Chat f39558n;
    public boolean f39559r;
    public View f39560s;
    public org.telegram.ui.Components.k90 v;
    public VideoPlayerHolderBase f39561w;
    public z2 f39562x;
    public int f39553a = 0;
    public final org.telegram.ui.Components.d90 f39555c = new org.telegram.ui.Components.d90();
    public final a0.h f39563y = new a0.h();
    public ArrayList B = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.o01 o01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
