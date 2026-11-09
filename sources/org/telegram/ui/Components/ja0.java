package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ja0 extends FrameLayout {
    public final et D;
    public final ArrayList E;
    public final fa0 F;
    public final dh.c G;
    public TLRPC.Peer f34970a;
    public final boolean f34971b;
    public final org.telegram.ui.cn f34972c;
    public final org.telegram.messenger.mj d;
    public final ha0 f34973e;
    public final o90 f34974f;
    public ValueAnimator h;
    public final TLRPC.User f34975n;
    public final TLRPC.Chat f34976r;
    public boolean f34977s;
    public boolean f34978w;
    public final int f34979x;
    public boolean f34980y;

    public ja0(Context context, org.telegram.ui.cn cnVar, dh.c cVar, org.telegram.messenger.mj mjVar, TLRPC.User user, TLRPC.Chat chat, int i7, fa0 fa0Var, int i10, final boolean z9) {
        super(context);
        this.D = new et(this, 7);
        this.E = new ArrayList(10);
        this.f34971b = z9;
        this.f34972c = cnVar;
        this.f34979x = i7;
        this.G = cVar;
        this.f34975n = user;
        this.f34976r = chat;
        this.d = mjVar;
        this.F = fa0Var;
        this.f34974f = new o90(this, context, fa0Var);
        ha0 ha0Var = new ha0(context, fa0Var);
        this.f34973e = ha0Var;
        fh.g c10 = cVar.c(ha0Var, null, false);
        c10.p(c8.g0.k(fa0Var));
        c10.Q.f11508e = true;
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(16.0f));
        ha0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && mjVar.f24030a != null) {
                this.f34973e.a(0, org.telegram.messenger.id.M0(2131748547, null));
            } else if (i12 == 1 && mjVar.f24031b != null && !z9) {
                this.f34973e.a(1, org.telegram.messenger.id.M0(2131748551, null));
            } else if (i12 == 2 && mjVar.f24032c != null && !z9) {
                this.f34973e.a(2, org.telegram.messenger.id.M0(2131748550, null));
            }
            if (i12 == i10) {
                i11 = this.f34973e.f34259a.size() - 1;
            }
        }
        this.f34974f.setAdapter(new p90(this, context));
        this.f34974f.setPosition(i11);
        this.f34973e.setSelectedTab(i11);
        addView(this.f34973e, c8.ha.e(-1, 66, 87));
        addView(this.f34974f, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f34973e.setOnTabClick(new s2(this, 6));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ja0 ja0Var = ja0.this;
                ja0Var.getClass();
                if (motionEvent.getAction() == 1 && !z9) {
                    ja0Var.a(true);
                }
                return true;
            }
        });
        this.f34977s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(mi.l.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z9);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f34970a = peer;
        int i7 = 0;
        while (true) {
            View[] viewArr = this.f34974f.f39950e;
            if (i7 < viewArr.length) {
                View view = viewArr[i7];
                if (view != null) {
                    da0 da0Var = (da0) view;
                    if (da0Var.f32915a == 1) {
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
