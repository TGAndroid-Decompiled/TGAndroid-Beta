package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ab0 extends FrameLayout {
    public final ew D;
    public final ArrayList E;
    public final wa0 F;
    public final tg.b G;
    public TLRPC.Peer f24336a;
    public final boolean f24337b;
    public final org.telegram.ui.un f24338c;
    public final org.telegram.messenger.oj d;
    public final ya0 e;
    public final fa0 f24339f;
    public ValueAnimator h;
    public final TLRPC.User f24340n;
    public final TLRPC.Chat f24341r;
    public boolean f24342s;
    public boolean f24343w;
    public final int f24344x;
    public boolean f24345y;

    public ab0(Context context, org.telegram.ui.un unVar, tg.b bVar, org.telegram.messenger.oj ojVar, TLRPC.User user, TLRPC.Chat chat, int i10, wa0 wa0Var, int i11, final boolean z10) {
        super(context);
        this.D = new ew(this, 5);
        this.E = new ArrayList(10);
        this.f24337b = z10;
        this.f24338c = unVar;
        this.f24344x = i10;
        this.G = bVar;
        this.f24340n = user;
        this.f24341r = chat;
        this.d = ojVar;
        this.F = wa0Var;
        this.f24339f = new fa0(this, context, wa0Var);
        ya0 ya0Var = new ya0(context, wa0Var);
        this.e = ya0Var;
        vg.f c10 = bVar.c(ya0Var, null, false);
        c10.o(w7.b9.k(wa0Var));
        c10.P.e = true;
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(16.0f));
        ya0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && ojVar.f17451a != null) {
                this.e.a(0, org.telegram.messenger.dd.L0(2131748562, null));
            } else if (i13 == 1 && ojVar.f17452b != null && !z10) {
                this.e.a(1, org.telegram.messenger.dd.L0(2131748566, null));
            } else if (i13 == 2 && ojVar.f17453c != null && !z10) {
                this.e.a(2, org.telegram.messenger.dd.L0(2131748565, null));
            }
            if (i13 == i11) {
                i12 = this.e.f32793a.size() - 1;
            }
        }
        this.f24339f.setAdapter(new ga0(this, context));
        this.f24339f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.b6.e(-1, 66, 87));
        addView(this.f24339f, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new r2(this, 6));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ab0 ab0Var = ab0.this;
                ab0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ab0Var.a(true);
                }
                return true;
            }
        });
        this.f24342s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ci.o.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f24336a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f24339f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ua0 ua0Var = (ua0) view;
                    if (ua0Var.f30910a == 1) {
                        ua0Var.i();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
