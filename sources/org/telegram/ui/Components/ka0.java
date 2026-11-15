package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ka0 extends FrameLayout {
    public final zj E;
    public final ArrayList F;
    public final ga0 G;
    public final dh.c H;
    public TLRPC.Peer f36335a;
    public final boolean f36336b;
    public final org.telegram.ui.an f36337c;
    public final org.telegram.messenger.kj d;
    public final ia0 f36338e;
    public final q90 f36339f;
    public ValueAnimator h;
    public final TLRPC.User f36340n;
    public final TLRPC.Chat f36341r;
    public boolean f36342s;
    public boolean f36343w;
    public final int f36344x;
    public boolean f36345y;

    public ka0(Context context, org.telegram.ui.an anVar, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, ga0 ga0Var, int i10, final boolean z10) {
        super(context);
        this.E = new zj(this, 10);
        this.F = new ArrayList(10);
        this.f36336b = z10;
        this.f36337c = anVar;
        this.f36344x = i7;
        this.H = cVar;
        this.f36340n = user;
        this.f36341r = chat;
        this.d = kjVar;
        this.G = ga0Var;
        this.f36339f = new q90(this, context, ga0Var);
        ia0 ia0Var = new ia0(context, ga0Var);
        this.f36338e = ia0Var;
        fh.g c10 = cVar.c(ia0Var, null, false);
        c10.p(c8.g0.k(ga0Var));
        c10.R.f11322e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ia0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && kjVar.f24706a != null) {
                this.f36338e.a(0, org.telegram.messenger.hd.M0(2131748547, null));
            } else if (i12 == 1 && kjVar.f24707b != null && !z10) {
                this.f36338e.a(1, org.telegram.messenger.hd.M0(2131748551, null));
            } else if (i12 == 2 && kjVar.f24708c != null && !z10) {
                this.f36338e.a(2, org.telegram.messenger.hd.M0(2131748550, null));
            }
            if (i12 == i10) {
                i11 = this.f36338e.f35520a.size() - 1;
            }
        }
        this.f36339f.setAdapter(new r90(this, context));
        this.f36339f.setPosition(i11);
        this.f36338e.setSelectedTab(i11);
        addView(this.f36338e, c8.ja.e(-1, 66, 87));
        addView(this.f36339f, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f36338e.setOnTabClick(new q2(this, 8));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ka0 ka0Var = ka0.this;
                ka0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ka0Var.a(true);
                }
                return true;
            }
        });
        this.f36342s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(pi.k.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ka0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f36335a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f36339f.f41300e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    ea0 ea0Var = (ea0) view;
                    if (ea0Var.f34254a == 1) {
                        ea0Var.i();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
