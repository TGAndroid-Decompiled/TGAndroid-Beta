package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public abstract class d70 {
    public String B;
    public int C;
    public org.telegram.ui.ActionBar.n1 D;
    public org.telegram.ui.ActionBar.e3 E;

    public org.telegram.ui.Components.q80 f37285b;
    public f3 d;

    public int f37287e;

    public View f37288f;
    public boolean h;

    public TLRPC.Chat f37289n;

    public boolean f37290r;

    public View f37291s;
    public org.telegram.ui.Components.t80 v;

    public VideoPlayerHolderBase f37292w;

    public b3 f37293x;

    public int f37284a = 0;

    public final org.telegram.ui.Components.m80 f37286c = new org.telegram.ui.Components.m80();

    public final a0.h f37294y = new a0.h();
    public ArrayList A = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(k4 k4Var, org.telegram.ui.Components.tz0 tz0Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, k4 k4Var);
}
