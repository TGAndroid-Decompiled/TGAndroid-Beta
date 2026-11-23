package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class p50 {
    public String G;
    public int H;
    public org.telegram.ui.ActionBar.g1 I;
    public org.telegram.ui.ActionBar.w2 J;
    public org.telegram.ui.Components.n80 f50752b;
    public z2 d;
    public int f50754e;
    public View f50755f;
    public boolean h;
    public TLRPC.Chat f50756n;
    public boolean f50757r;
    public View f50758s;
    public org.telegram.ui.Components.q80 f50759w;
    public VideoPlayerHolderBase f50760x;
    public v2 f50761y;
    public int f50751a = 0;
    public final n2.o0 f50753c = new n2.o0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.bz0 bz0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
