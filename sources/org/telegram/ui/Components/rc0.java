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
public abstract class rc0 extends FrameLayout {
    public final ArrayList E;
    public final nc0 F;
    public final bh.b G;
    public TLRPC.Peer f30143a;
    public final boolean f30144b;
    public final org.telegram.ui.sn f30145c;
    public final MessagePreviewParams d;
    public final pc0 e;
    public final rb0 f30146f;
    public ValueAnimator h;
    public final TLRPC.User f30147n;
    public final TLRPC.Chat f30148r;
    public boolean f30149s;
    public boolean v;
    public final int f30150w;
    public boolean f30151x;
    public final org.telegram.ui.Cells.u5 f30152y;

    public rc0(Context context, org.telegram.ui.sn snVar, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, nc0 nc0Var, int i11, final boolean z10) {
        super(context);
        this.f30152y = new org.telegram.ui.Cells.u5(this, 17);
        this.E = new ArrayList(10);
        this.f30144b = z10;
        this.f30145c = snVar;
        this.f30150w = i10;
        this.G = bVar;
        this.f30147n = user;
        this.f30148r = chat;
        this.d = messagePreviewParams;
        this.F = nc0Var;
        this.f30146f = new rb0(this, context, nc0Var);
        pc0 pc0Var = new pc0(context, nc0Var);
        this.e = pc0Var;
        dh.d c10 = bVar.c(pc0Var, null, false);
        c10.o(fh.c.k(nc0Var));
        c10.v.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        pc0Var.setBackground(c10);
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
                i12 = this.e.f29511a.size() - 1;
            }
        }
        this.f30146f.setAdapter(new sb0(this, context));
        this.f30146f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.z5.e(-1, 66, 87));
        addView(this.f30146f, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                rc0 rc0Var = rc0.this;
                rc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    rc0Var.a(true);
                }
                return true;
            }
        });
        this.f30149s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(li.m.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rc0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f30143a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f30146f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    lc0 lc0Var = (lc0) view;
                    if (lc0Var.f28335a == 1) {
                        lc0Var.i();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
