package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class nc0 extends FrameLayout {
    public final ArrayList E;
    public final jc0 F;
    public final ch.b G;
    public TLRPC.Peer f30954a;
    public final boolean f30955b;
    public final org.telegram.ui.un f30956c;
    public final MessagePreviewParams d;
    public final lc0 e;
    public final ob0 f30957f;
    public ValueAnimator h;
    public final TLRPC.User f30958n;
    public final TLRPC.Chat f30959r;
    public boolean f30960s;
    public boolean v;
    public final int f30961w;
    public boolean f30962x;
    public final m.g3 f30963y;

    public nc0(Context context, org.telegram.ui.un unVar, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, jc0 jc0Var, int i11, final boolean z10) {
        super(context);
        this.f30963y = new m.g3(this, 21);
        this.E = new ArrayList(10);
        this.f30955b = z10;
        this.f30956c = unVar;
        this.f30961w = i10;
        this.G = bVar;
        this.f30958n = user;
        this.f30959r = chat;
        this.d = messagePreviewParams;
        this.F = jc0Var;
        this.f30957f = new ob0(this, context, jc0Var);
        lc0 lc0Var = new lc0(context, jc0Var);
        this.e = lc0Var;
        eh.d c10 = bVar.c(lc0Var, null, false);
        c10.v(gh.c.k(jc0Var));
        c10.f9966x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        lc0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.e.f30163a.size() - 1;
            }
        }
        this.f30957f.setAdapter(new pb0(this, context));
        this.f30957f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, gb1.i(-1, 66, 87));
        addView(this.f30957f, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new b3(this, 6));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                nc0 nc0Var = nc0.this;
                nc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    nc0Var.a(true);
                }
                return true;
            }
        });
        this.f30960s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(mi.m.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nc0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f30954a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f30957f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    hc0 hc0Var = (hc0) view;
                    if (hc0Var.f28912a == 1) {
                        hc0Var.i();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
