package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class wa0 extends FrameLayout {
    public final ik E;
    public final ArrayList F;
    public final sa0 G;
    public final dh.c H;
    public TLRPC.Peer f41736a;
    public final boolean f41737b;
    public final org.telegram.ui.bn f41738c;
    public final org.telegram.messenger.kj d;
    public final ua0 f41739e;
    public final ca0 f41740f;
    public ValueAnimator h;
    public final TLRPC.User f41741n;
    public final TLRPC.Chat f41742r;
    public boolean f41743s;
    public boolean f41744w;
    public final int f41745x;
    public boolean f41746y;

    public wa0(Context context, org.telegram.ui.bn bnVar, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, sa0 sa0Var, int i10, final boolean z10) {
        super(context);
        this.E = new ik(this, 10);
        this.F = new ArrayList(10);
        this.f41737b = z10;
        this.f41738c = bnVar;
        this.f41745x = i7;
        this.H = cVar;
        this.f41741n = user;
        this.f41742r = chat;
        this.d = kjVar;
        this.G = sa0Var;
        this.f41740f = new ca0(this, context, sa0Var);
        ua0 ua0Var = new ua0(context, sa0Var);
        this.f41739e = ua0Var;
        fh.g c10 = cVar.c(ua0Var, null, false);
        c10.p(c8.i0.l(sa0Var));
        c10.R.f11671e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ua0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && kjVar.f25079a != null) {
                this.f41739e.a(0, org.telegram.messenger.hd.N0(2131748354, null));
            } else if (i12 == 1 && kjVar.f25080b != null && !z10) {
                this.f41739e.a(1, org.telegram.messenger.hd.N0(2131748358, null));
            } else if (i12 == 2 && kjVar.f25081c != null && !z10) {
                this.f41739e.a(2, org.telegram.messenger.hd.N0(2131748357, null));
            }
            if (i12 == i10) {
                i11 = this.f41739e.f40306a.size() - 1;
            }
        }
        this.f41740f.setAdapter(new da0(this, context));
        this.f41740f.setPosition(i11);
        this.f41739e.setSelectedTab(i11);
        addView(this.f41739e, c8.ma.e(-1, 66, 87));
        addView(this.f41740f, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f41739e.setOnTabClick(new z2(this, 8));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                wa0 wa0Var = wa0.this;
                wa0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    wa0Var.a(true);
                }
                return true;
            }
        });
        this.f41743s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(pi.k.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wa0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f41736a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f41740f.f36434e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    qa0 qa0Var = (qa0) view;
                    if (qa0Var.f38851a == 1) {
                        qa0Var.i();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
