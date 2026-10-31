package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class m60 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.k1 H;
    public org.telegram.ui.ActionBar.z2 I;
    public org.telegram.ui.Components.q80 f39481b;
    public z2 d;
    public int e;
    public View f39483f;
    public boolean h;
    public TLRPC.Chat f39484n;
    public boolean f39485r;
    public View f39486s;
    public org.telegram.ui.Components.t80 f39487w;
    public VideoPlayerHolderBase f39488x;
    public v2 f39489y;
    public int f39480a = 0;
    public final ji.a f39482c = new ji.a();
    public final a0.h D = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract void a(f4 f4Var, org.telegram.ui.Components.uz0 uz0Var);

    public abstract boolean b(TL_iv.PageBlock pageBlock, f4 f4Var);
}
