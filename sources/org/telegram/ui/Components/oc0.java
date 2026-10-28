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
public abstract class oc0 extends FrameLayout {
    public final ArrayList E;
    public final kc0 F;
    public final ch.b G;
    public TLRPC.Peer f31263a;
    public final boolean f31264b;
    public final org.telegram.ui.wn f31265c;
    public final MessagePreviewParams d;
    public final mc0 e;
    public final pb0 f31266f;
    public ValueAnimator h;
    public final TLRPC.User f31267n;
    public final TLRPC.Chat f31268r;
    public boolean f31269s;
    public boolean v;
    public final int f31270w;
    public boolean f31271x;
    public final m.g3 f31272y;

    public oc0(Context context, org.telegram.ui.wn wnVar, ch.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, kc0 kc0Var, int i11, final boolean z10) {
        super(context);
        this.f31272y = new m.g3(this, 21);
        this.E = new ArrayList(10);
        this.f31264b = z10;
        this.f31265c = wnVar;
        this.f31270w = i10;
        this.G = bVar;
        this.f31267n = user;
        this.f31268r = chat;
        this.d = messagePreviewParams;
        this.F = kc0Var;
        this.f31266f = new pb0(this, context, kc0Var);
        mc0 mc0Var = new mc0(context, kc0Var);
        this.e = mc0Var;
        eh.d c10 = bVar.c(mc0Var, null, false);
        c10.v(gh.c.k(kc0Var));
        c10.f9965x.e = true;
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(16.0f));
        mc0Var.setBackground(c10);
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
                i12 = this.e.f30495a.size() - 1;
            }
        }
        this.f31266f.setAdapter(new qb0(this, context));
        this.f31266f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, kb1.i(-1, 66, 87));
        addView(this.f31266f, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new b3(this, 6));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                oc0 oc0Var = oc0.this;
                oc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    oc0Var.a(true);
                }
                return true;
            }
        });
        this.f31269s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(mi.m.V).scaleY(1.0f);
    }

    public final void a(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oc0.a(boolean):void");
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f31263a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f31266f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ic0 ic0Var = (ic0) view;
                    if (ic0Var.f29301a == 1) {
                        ic0Var.i();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
