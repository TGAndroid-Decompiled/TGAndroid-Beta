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
    public org.telegram.ui.Components.h90 f39609b;
    public d3 d;
    public int f39611e;
    public View f39612f;
    public boolean h;
    public TLRPC.Chat f39613n;
    public boolean f39614r;
    public View f39615s;
    public org.telegram.ui.Components.k90 v;
    public VideoPlayerHolderBase f39616w;
    public z2 f39617x;
    public int f39608a = 0;
    public final org.telegram.ui.Components.d90 f39610c = new org.telegram.ui.Components.d90();
    public final a0.h f39618y = new a0.h();
    public ArrayList B = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.p01 p01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
