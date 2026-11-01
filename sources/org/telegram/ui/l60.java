package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class l60 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.k1 H;
    public org.telegram.ui.ActionBar.z2 I;
    public org.telegram.ui.Components.q80 f39096b;
    public z2 d;
    public int e;
    public View f39098f;
    public boolean h;
    public TLRPC.Chat f39099n;
    public boolean f39100r;
    public View f39101s;
    public org.telegram.ui.Components.t80 f39102w;
    public VideoPlayerHolderBase f39103x;
    public v2 f39104y;
    public int f39095a = 0;
    public final ji.a f39097c = new ji.a();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(f4 f4Var, org.telegram.ui.Components.vz0 vz0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, f4 f4Var);
}
