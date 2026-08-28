package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class a70 {
    public String B;
    public int C;
    public org.telegram.ui.ActionBar.o1 D;
    public org.telegram.ui.ActionBar.f3 E;
    public org.telegram.ui.Components.m80 f36374b;
    public e3 d;
    public int f36376e;
    public View f36377f;
    public boolean h;
    public TLRPC.Chat f36378n;
    public boolean f36379r;
    public View f36380s;
    public org.telegram.ui.Components.p80 v;
    public VideoPlayerHolderBase f36381w;
    public a3 f36382x;
    public int f36373a = 0;
    public final org.telegram.ui.Components.i80 f36375c = new org.telegram.ui.Components.i80();
    public final a0.h f36383y = new a0.h();
    public ArrayList A = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.rz0 rz0Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
