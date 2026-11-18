package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class p50 {
    public String G;
    public int H;
    public org.telegram.ui.ActionBar.h1 I;
    public org.telegram.ui.ActionBar.x2 J;
    public org.telegram.ui.Components.l80 f50751b;
    public z2 d;
    public int f50753e;
    public View f50754f;
    public boolean h;
    public TLRPC.Chat f50755n;
    public boolean f50756r;
    public View f50757s;
    public org.telegram.ui.Components.o80 f50758w;
    public VideoPlayerHolderBase f50759x;
    public v2 f50760y;
    public int f50750a = 0;
    public final n2.o0 f50752c = new n2.o0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.zy0 zy0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
