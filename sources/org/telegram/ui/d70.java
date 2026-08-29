package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class d70 {
    public String B;
    public int C;
    public org.telegram.ui.ActionBar.o1 D;
    public org.telegram.ui.ActionBar.f3 E;
    public org.telegram.ui.Components.z80 f37380b;
    public f3 d;
    public int f37382e;
    public View f37383f;
    public boolean h;
    public TLRPC.Chat f37384n;
    public boolean f37385r;
    public View f37386s;
    public org.telegram.ui.Components.c90 v;
    public VideoPlayerHolderBase f37387w;
    public b3 f37388x;
    public int f37379a = 0;
    public final org.telegram.ui.Components.v80 f37381c = new org.telegram.ui.Components.v80();
    public final a0.h f37389y = new a0.h();
    public ArrayList A = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(k4 k4Var, org.telegram.ui.Components.d01 d01Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, k4 k4Var);
}
