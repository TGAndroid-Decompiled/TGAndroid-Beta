package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class da0 extends FrameLayout {
    public final lt E;
    public final ArrayList F;
    public final z90 G;
    public final eh.c H;
    public TLRPC.Peer f33033a;
    public final boolean f33034b;
    public final org.telegram.ui.wm f33035c;
    public final org.telegram.messenger.dj d;
    public final ba0 f33036e;
    public final j90 f33037f;
    public ValueAnimator h;
    public final TLRPC.User f33038n;
    public final TLRPC.Chat f33039r;
    public boolean f33040s;
    public boolean f33041w;
    public final int f33042x;
    public boolean f33043y;

    public da0(Context context, org.telegram.ui.wm wmVar, eh.c cVar, org.telegram.messenger.dj djVar, TLRPC.User user, TLRPC.Chat chat, int i3, z90 z90Var, int i10, final boolean z10) {
        super(context);
        this.E = new lt(this, 6);
        this.F = new ArrayList(10);
        this.f33034b = z10;
        this.f33035c = wmVar;
        this.f33042x = i3;
        this.H = cVar;
        this.f33038n = user;
        this.f33039r = chat;
        this.d = djVar;
        this.G = z90Var;
        this.f33037f = new j90(this, context, z90Var);
        ba0 ba0Var = new ba0(context, z90Var);
        this.f33036e = ba0Var;
        gh.g c2 = cVar.c(ba0Var, null, false);
        c2.p(b8.cd.k(z90Var));
        c2.R.f12302e = true;
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(16.0f));
        ba0Var.setBackground(c2);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && djVar.f22197a != null) {
                this.f33036e.a(0, org.telegram.messenger.bd.M0(2131748555, null));
            } else if (i12 == 1 && djVar.f22198b != null && !z10) {
                this.f33036e.a(1, org.telegram.messenger.bd.M0(2131748559, null));
            } else if (i12 == 2 && djVar.f22199c != null && !z10) {
                this.f33036e.a(2, org.telegram.messenger.bd.M0(2131748558, null));
            }
            if (i12 == i10) {
                i11 = this.f33036e.f32143a.size() - 1;
            }
        }
        this.f33037f.setAdapter(new k90(this, context));
        this.f33037f.setPosition(i11);
        this.f33036e.setSelectedTab(i11);
        addView(this.f33036e, b8.mf.e(-1, 66, 87));
        addView(this.f33037f, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f33036e.setOnTabClick(new p2(this, 6));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                da0 da0Var = da0.this;
                da0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    da0Var.a(true);
                }
                return true;
            }
        });
        this.f33040s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ni.l.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f33033a = peer;
        int i3 = 0;
        while (true) {
            View[] viewArr = this.f33037f.f36386e;
            if (i3 < viewArr.length) {
                View view = viewArr[i3];
                if (view != null) {
                    x90 x90Var = (x90) view;
                    if (x90Var.f40285a == 1) {
                        x90Var.i();
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }
}
