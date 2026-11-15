package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class n50 {
    public String G;
    public int H;
    public org.telegram.ui.ActionBar.g1 I;
    public org.telegram.ui.ActionBar.u2 J;
    public org.telegram.ui.Components.a80 f49449b;
    public z2 d;
    public int f49451e;
    public View f49452f;
    public boolean h;
    public TLRPC.Chat f49453n;
    public boolean f49454r;
    public View f49455s;
    public org.telegram.ui.Components.d80 f49456w;
    public VideoPlayerHolderBase f49457x;
    public v2 f49458y;
    public int f49448a = 0;
    public final n2.o0 f49450c = new n2.o0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.sy0 sy0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
