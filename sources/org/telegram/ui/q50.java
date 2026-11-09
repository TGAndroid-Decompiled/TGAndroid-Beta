package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class q50 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.v2 I;
    public org.telegram.ui.Components.y70 f48918b;
    public z2 d;
    public int f48920e;
    public View f48921f;
    public boolean h;
    public TLRPC.Chat f48922n;
    public boolean f48923r;
    public View f48924s;
    public org.telegram.ui.Components.b80 f48925w;
    public VideoPlayerHolderBase f48926x;
    public v2 f48927y;
    public int f48917a = 0;
    public final n2.n0 f48919c = new n2.n0();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.ry0 ry0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
