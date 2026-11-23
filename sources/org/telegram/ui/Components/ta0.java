package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ta0 extends FrameLayout {
    public final rc E;
    public final ArrayList F;
    public final pa0 G;
    public final dh.c H;
    public TLRPC.Peer f39881a;
    public final boolean f39882b;
    public final org.telegram.ui.bn f39883c;
    public final org.telegram.messenger.jj d;
    public final ra0 f39884e;
    public final z90 f39885f;
    public ValueAnimator h;
    public final TLRPC.User f39886n;
    public final TLRPC.Chat f39887r;
    public boolean f39888s;
    public boolean f39889w;
    public final int f39890x;
    public boolean f39891y;

    public ta0(Context context, org.telegram.ui.bn bnVar, dh.c cVar, org.telegram.messenger.jj jjVar, TLRPC.User user, TLRPC.Chat chat, int i7, pa0 pa0Var, int i10, final boolean z10) {
        super(context);
        this.E = new rc(this, 11);
        this.F = new ArrayList(10);
        this.f39882b = z10;
        this.f39883c = bnVar;
        this.f39890x = i7;
        this.H = cVar;
        this.f39886n = user;
        this.f39887r = chat;
        this.d = jjVar;
        this.G = pa0Var;
        this.f39885f = new z90(this, context, pa0Var);
        ra0 ra0Var = new ra0(context, pa0Var);
        this.f39884e = ra0Var;
        fh.g c10 = cVar.c(ra0Var, null, false);
        c10.p(c8.j0.l(pa0Var));
        c10.R.f11633e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ra0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && jjVar.f24974a != null) {
                this.f39884e.a(0, org.telegram.messenger.gd.N0(2131748354, null));
            } else if (i12 == 1 && jjVar.f24975b != null && !z10) {
                this.f39884e.a(1, org.telegram.messenger.gd.N0(2131748358, null));
            } else if (i12 == 2 && jjVar.f24976c != null && !z10) {
                this.f39884e.a(2, org.telegram.messenger.gd.N0(2131748357, null));
            }
            if (i12 == i10) {
                i11 = this.f39884e.f39258a.size() - 1;
            }
        }
        this.f39885f.setAdapter(new aa0(this, context));
        this.f39885f.setPosition(i11);
        this.f39884e.setSelectedTab(i11);
        addView(this.f39884e, c8.na.e(-1, 66, 87));
        addView(this.f39885f, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f39884e.setOnTabClick(new y2(this, 8));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ta0 ta0Var = ta0.this;
                ta0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ta0Var.a(true);
                }
                return true;
            }
        });
        this.f39888s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(pi.k.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ta0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f39881a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f39885f.f36665e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    na0 na0Var = (na0) view;
                    if (na0Var.f37736a == 1) {
                        na0Var.i();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
