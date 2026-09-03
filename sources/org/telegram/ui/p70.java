package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class p70 {
    public String C;
    public int D;
    public org.telegram.ui.ActionBar.p1 E;
    public org.telegram.ui.ActionBar.g3 F;
    public org.telegram.ui.Components.g90 f36981b;
    public f3 d;
    public int e;
    public View f36983f;
    public boolean h;
    public TLRPC.Chat f36984n;
    public boolean f36985r;
    public View f36986s;
    public org.telegram.ui.Components.j90 v;
    public VideoPlayerHolderBase f36987w;
    public b3 f36988x;
    public int f36980a = 0;
    public final org.telegram.ui.Components.c90 f36982c = new org.telegram.ui.Components.c90();
    public final a0.h f36989y = new a0.h();
    public ArrayList B = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(l4 l4Var, org.telegram.ui.Components.o01 o01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, l4 l4Var);
}
