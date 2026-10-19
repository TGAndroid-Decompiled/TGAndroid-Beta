package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class b70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.f3 I;
    public org.telegram.ui.Components.y90 f35532b;
    public d3 d;
    public int e;
    public View f35534f;
    public boolean h;
    public TLRPC.Chat f35535n;
    public boolean f35536r;
    public View f35537s;
    public org.telegram.ui.Components.ba0 v;
    public VideoPlayerHolderBase f35538w;
    public z2 f35539x;
    public int f35531a = 0;
    public final org.telegram.ui.Components.u90 f35533c = new org.telegram.ui.Components.u90();
    public final a0.h f35540y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.i11 i11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
