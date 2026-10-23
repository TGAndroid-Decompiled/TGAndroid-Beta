package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class f70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.h3 I;
    public org.telegram.ui.Components.z90 f37230b;
    public c3 d;
    public int e;
    public View f37232f;
    public boolean h;
    public TLRPC.Chat f37233n;
    public boolean f37234r;
    public View f37235s;
    public org.telegram.ui.Components.ca0 v;
    public VideoPlayerHolderBase f37236w;
    public y2 f37237x;
    public int f37229a = 0;
    public final org.telegram.ui.Components.v90 f37231c = new org.telegram.ui.Components.v90();
    public final a0.h f37238y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(i4 i4Var, org.telegram.ui.Components.m11 m11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, i4 i4Var);
}
