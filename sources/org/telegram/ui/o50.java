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
    public org.telegram.ui.Components.x70 f48239b;
    public z2 d;
    public int f48241e;
    public View f48242f;
    public boolean h;
    public TLRPC.Chat f48243n;
    public boolean f48244r;
    public View f48245s;
    public org.telegram.ui.Components.a80 f48246w;
    public VideoPlayerHolderBase f48247x;
    public v2 f48248y;
    public int f48238a = 0;
    public final n2.n0 f48240c = new n2.n0();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.py0 py0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
