package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ia0 extends FrameLayout {
    public final dt D;
    public final ArrayList E;
    public final ea0 F;
    public final dh.c G;
    public TLRPC.Peer f34579a;
    public final boolean f34580b;
    public final org.telegram.ui.cn f34581c;
    public final org.telegram.messenger.mj d;
    public final ga0 f34582e;
    public final n90 f34583f;
    public ValueAnimator h;
    public final TLRPC.User f34584n;
    public final TLRPC.Chat f34585r;
    public boolean f34586s;
    public boolean f34587w;
    public final int f34588x;
    public boolean f34589y;

    public ia0(Context context, org.telegram.ui.cn cnVar, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, ea0 ea0Var, int i10, final boolean z9) {
        super(context);
        this.D = new dt(this, 7);
        this.E = new ArrayList(10);
        this.f34580b = z9;
        this.f34581c = cnVar;
        this.f34588x = i7;
        this.G = cVar;
        this.f34584n = user;
        this.f34585r = chat;
        this.d = mjVar;
        this.F = ea0Var;
        this.f34583f = new n90(this, context, ea0Var);
        ga0 ga0Var = new ga0(context, ea0Var);
        this.f34582e = ga0Var;
        fh.g c10 = cVar.c(ga0Var, null, false);
        c10.p(c8.g0.k(ea0Var));
        c10.Q.f11513e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ga0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && mjVar.f24034a != null) {
                this.f34582e.a(0, org.telegram.messenger.id.M0(2131748547, null));
            } else if (i12 == 1 && mjVar.f24035b != null && !z9) {
                this.f34582e.a(1, org.telegram.messenger.id.M0(2131748551, null));
            } else if (i12 == 2 && mjVar.f24036c != null && !z9) {
                this.f34582e.a(2, org.telegram.messenger.id.M0(2131748550, null));
            }
            if (i12 == i10) {
                i11 = this.f34582e.f33859a.size() - 1;
            }
        }
        this.f34583f.setAdapter(new o90(this, context));
        this.f34583f.setPosition(i11);
        this.f34582e.setSelectedTab(i11);
        addView(this.f34582e, c8.ha.e(-1, 66, 87));
        addView(this.f34583f, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f34582e.setOnTabClick(new r2(this, 6));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ia0 ia0Var = ia0.this;
                ia0Var.getClass();
                if (motionEvent.getAction() == 1 && !z9) {
                    ia0Var.a(true);
                }
                return true;
            }
        });
        this.f34586s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(mi.l.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z9);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f34579a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f34583f.f38893e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    ca0 ca0Var = (ca0) view;
                    if (ca0Var.f32519a == 1) {
                        ca0Var.i();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
