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
    public org.telegram.ui.Components.x70 f48267b;
    public z2 d;
    public int f48269e;
    public View f48270f;
    public boolean h;
    public TLRPC.Chat f48271n;
    public boolean f48272r;
    public View f48273s;
    public org.telegram.ui.Components.a80 f48274w;
    public VideoPlayerHolderBase f48275x;
    public v2 f48276y;
    public int f48266a = 0;
    public final n2.n0 f48268c = new n2.n0();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.qy0 qy0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
