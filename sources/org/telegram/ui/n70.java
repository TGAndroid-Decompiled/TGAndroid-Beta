package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class n70 {
    public String C;
    public int D;
    public org.telegram.ui.ActionBar.p1 E;
    public org.telegram.ui.ActionBar.g3 F;
    public org.telegram.ui.Components.f90 f36476b;
    public d3 d;
    public int e;
    public View f36478f;
    public boolean h;
    public TLRPC.Chat f36479n;
    public boolean f36480r;
    public View f36481s;
    public org.telegram.ui.Components.i90 v;
    public VideoPlayerHolderBase f36482w;
    public z2 f36483x;
    public int f36475a = 0;
    public final org.telegram.ui.Components.b90 f36477c = new org.telegram.ui.Components.b90();
    public final a0.h f36484y = new a0.h();
    public ArrayList B = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.o01 o01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
