package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class o50 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.v2 I;
    public org.telegram.ui.Components.x70 f48268b;
    public z2 d;
    public int f48270e;
    public View f48271f;
    public boolean h;
    public TLRPC.Chat f48272n;
    public boolean f48273r;
    public View f48274s;
    public org.telegram.ui.Components.a80 f48275w;
    public VideoPlayerHolderBase f48276x;
    public v2 f48277y;
    public int f48267a = 0;
    public final n2.n0 f48269c = new n2.n0();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.py0 py0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
