package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ua0 extends FrameLayout {
    public final gk E;
    public final ArrayList F;
    public final qa0 G;
    public final dh.c H;
    public TLRPC.Peer f40277a;
    public final boolean f40278b;
    public final org.telegram.ui.bn f40279c;
    public final org.telegram.messenger.jj d;
    public final sa0 f40280e;
    public final aa0 f40281f;
    public ValueAnimator h;
    public final TLRPC.User f40282n;
    public final TLRPC.Chat f40283r;
    public boolean f40284s;
    public boolean f40285w;
    public final int f40286x;
    public boolean f40287y;

    public ua0(Context context, org.telegram.ui.bn bnVar, dh.c cVar, org.telegram.messenger.jj jjVar, TLRPC.User user, TLRPC.Chat chat, int i7, qa0 qa0Var, int i10, final boolean z10) {
        super(context);
        this.E = new gk(this, 10);
        this.F = new ArrayList(10);
        this.f40278b = z10;
        this.f40279c = bnVar;
        this.f40286x = i7;
        this.H = cVar;
        this.f40282n = user;
        this.f40283r = chat;
        this.d = jjVar;
        this.G = qa0Var;
        this.f40281f = new aa0(this, context, qa0Var);
        sa0 sa0Var = new sa0(context, qa0Var);
        this.f40280e = sa0Var;
        fh.g c10 = cVar.c(sa0Var, null, false);
        c10.p(c8.i0.l(qa0Var));
        c10.R.f11639e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        sa0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && jjVar.f24864a != null) {
                this.f40280e.a(0, org.telegram.messenger.gd.M0(2131748355, null));
            } else if (i12 == 1 && jjVar.f24865b != null && !z10) {
                this.f40280e.a(1, org.telegram.messenger.gd.M0(2131748359, null));
            } else if (i12 == 2 && jjVar.f24866c != null && !z10) {
                this.f40280e.a(2, org.telegram.messenger.gd.M0(2131748358, null));
            }
            if (i12 == i10) {
                i11 = this.f40280e.f39546a.size() - 1;
            }
        }
        this.f40281f.setAdapter(new ba0(this, context));
        this.f40281f.setPosition(i11);
        this.f40280e.setSelectedTab(i11);
        addView(this.f40280e, c8.ma.e(-1, 66, 87));
        addView(this.f40281f, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f40280e.setOnTabClick(new y2(this, 8));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ua0 ua0Var = ua0.this;
                ua0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ua0Var.a(true);
                }
                return true;
            }
        });
        this.f40284s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(pi.k.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f40277a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f40281f.f35378e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    oa0 oa0Var = (oa0) view;
                    if (oa0Var.f38039a == 1) {
                        oa0Var.i();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
