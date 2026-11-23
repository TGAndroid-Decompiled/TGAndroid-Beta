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
    public org.telegram.ui.Components.k80 f50839b;
    public z2 d;
    public int f50841e;
    public View f50842f;
    public boolean h;
    public TLRPC.Chat f50843n;
    public boolean f50844r;
    public View f50845s;
    public org.telegram.ui.Components.n80 f50846w;
    public VideoPlayerHolderBase f50847x;
    public v2 f50848y;
    public int f50838a = 0;
    public final n2.p0 f50840c = new n2.p0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.az0 az0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
