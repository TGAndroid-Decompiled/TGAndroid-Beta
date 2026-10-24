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
public abstract class pc0 extends FrameLayout {
    public final ArrayList E;
    public final lc0 F;
    public final bh.b G;
    public TLRPC.Peer f29537a;
    public final boolean f29538b;
    public final org.telegram.ui.sn f29539c;
    public final MessagePreviewParams d;
    public final nc0 e;
    public final pb0 f29540f;
    public ValueAnimator h;
    public final TLRPC.User f29541n;
    public final TLRPC.Chat f29542r;
    public boolean f29543s;
    public boolean v;
    public final int f29544w;
    public boolean f29545x;
    public final org.telegram.ui.Cells.u5 f29546y;

    public pc0(Context context, org.telegram.ui.sn snVar, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, lc0 lc0Var, int i11, final boolean z10) {
        super(context);
        this.f29546y = new org.telegram.ui.Cells.u5(this, 17);
        this.E = new ArrayList(10);
        this.f29538b = z10;
        this.f29539c = snVar;
        this.f29544w = i10;
        this.G = bVar;
        this.f29541n = user;
        this.f29542r = chat;
        this.d = messagePreviewParams;
        this.F = lc0Var;
        this.f29540f = new pb0(this, context, lc0Var);
        nc0 nc0Var = new nc0(context, lc0Var);
        this.e = nc0Var;
        dh.d c10 = bVar.c(nc0Var, null, false);
        c10.o(fh.c.k(lc0Var));
        c10.v.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        nc0Var.setBackground(c10);
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
                i12 = this.e.f28867a.size() - 1;
            }
        }
        this.f29540f.setAdapter(new qb0(this, context));
        this.f29540f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.z5.e(-1, 66, 87));
        addView(this.f29540f, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new x2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                pc0 pc0Var = pc0.this;
                pc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    pc0Var.a(true);
                }
                return true;
            }
        });
        this.f29543s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(li.m.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pc0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f29537a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f29540f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    jc0 jc0Var = (jc0) view;
                    if (jc0Var.f27669a == 1) {
                        jc0Var.i();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
