package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class i50 {
    public String G;
    public int H;
    public org.telegram.ui.ActionBar.f1 I;
    public org.telegram.ui.ActionBar.t2 J;
    public org.telegram.ui.Components.t70 f46111b;
    public a3 d;
    public int f46113e;
    public View f46114f;
    public boolean h;
    public TLRPC.Chat f46115n;
    public boolean f46116r;
    public View f46117s;
    public org.telegram.ui.Components.w70 f46118w;
    public VideoPlayerHolderBase f46119x;
    public w2 f46120y;
    public int f46110a = 0;
    public final m2.p0 f46112c = new m2.p0();
    public final a0.h E = new a0.h();
    public ArrayList F = new ArrayList();

    public abstract void a(g4 g4Var, org.telegram.ui.Components.py0 py0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, g4 g4Var);
}
