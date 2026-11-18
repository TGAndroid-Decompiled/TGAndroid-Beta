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
    public org.telegram.ui.Components.l80 f50707b;
    public z2 d;
    public int f50709e;
    public View f50710f;
    public boolean h;
    public TLRPC.Chat f50711n;
    public boolean f50712r;
    public View f50713s;
    public org.telegram.ui.Components.o80 f50714w;
    public VideoPlayerHolderBase f50715x;
    public v2 f50716y;
    public int f50706a = 0;
    public final n2.o0 f50708c = new n2.o0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(e4 e4Var, org.telegram.ui.Components.zy0 zy0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, e4 e4Var);
}
