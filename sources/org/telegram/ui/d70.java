package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class d70 {
    public String F;
    public int G;
    public org.telegram.ui.ActionBar.m1 H;
    public org.telegram.ui.ActionBar.f3 I;
    public org.telegram.ui.Components.y90 f36078b;
    public d3 d;
    public int e;
    public View f36080f;
    public boolean h;
    public TLRPC.Chat f36081n;
    public boolean f36082r;
    public View f36083s;
    public org.telegram.ui.Components.ba0 v;
    public VideoPlayerHolderBase f36084w;
    public z2 f36085x;
    public int f36077a = 0;
    public final org.telegram.ui.Components.u90 f36079c = new org.telegram.ui.Components.u90();
    public final a0.h f36086y = new a0.h();
    public ArrayList E = new ArrayList();

    public abstract int a();

    public abstract int b();

    public abstract void c(j4 j4Var, org.telegram.ui.Components.h11 h11Var);

    public abstract boolean d(TL_iv.PageBlock pageBlock, j4 j4Var);
}
