package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ja0 extends FrameLayout {
    public final zj E;
    public final ArrayList F;
    public final fa0 G;
    public final dh.c H;
    public TLRPC.Peer f35948a;
    public final boolean f35949b;
    public final org.telegram.ui.an f35950c;
    public final org.telegram.messenger.kj d;
    public final ha0 f35951e;
    public final p90 f35952f;
    public ValueAnimator h;
    public final TLRPC.User f35953n;
    public final TLRPC.Chat f35954r;
    public boolean f35955s;
    public boolean f35956w;
    public final int f35957x;
    public boolean f35958y;

    public ja0(Context context, org.telegram.ui.an anVar, dh.c cVar, org.telegram.messenger.kj kjVar, TLRPC.User user, TLRPC.Chat chat, int i7, fa0 fa0Var, int i10, final boolean z10) {
        super(context);
        this.E = new zj(this, 10);
        this.F = new ArrayList(10);
        this.f35949b = z10;
        this.f35950c = anVar;
        this.f35957x = i7;
        this.H = cVar;
        this.f35953n = user;
        this.f35954r = chat;
        this.d = kjVar;
        this.G = fa0Var;
        this.f35952f = new p90(this, context, fa0Var);
        ha0 ha0Var = new ha0(context, fa0Var);
        this.f35951e = ha0Var;
        fh.g c10 = cVar.c(ha0Var, null, false);
        c10.p(c8.g0.k(fa0Var));
        c10.R.f11322e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ha0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && kjVar.f24703a != null) {
                this.f35951e.a(0, org.telegram.messenger.hd.M0(2131748547, null));
            } else if (i12 == 1 && kjVar.f24704b != null && !z10) {
                this.f35951e.a(1, org.telegram.messenger.hd.M0(2131748551, null));
            } else if (i12 == 2 && kjVar.f24705c != null && !z10) {
                this.f35951e.a(2, org.telegram.messenger.hd.M0(2131748550, null));
            }
            if (i12 == i10) {
                i11 = this.f35951e.f35208a.size() - 1;
            }
        }
        this.f35952f.setAdapter(new q90(this, context));
        this.f35952f.setPosition(i11);
        this.f35951e.setSelectedTab(i11);
        addView(this.f35951e, c8.ja.e(-1, 66, 87));
        addView(this.f35952f, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f35951e.setOnTabClick(new q2(this, 8));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ja0 ja0Var = ja0.this;
                ja0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ja0Var.a(true);
                }
                return true;
            }
        });
        this.f35955s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(pi.k.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f35948a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f35952f.f41297e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    da0 da0Var = (da0) view;
                    if (da0Var.f33894a == 1) {
                        da0Var.i();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
