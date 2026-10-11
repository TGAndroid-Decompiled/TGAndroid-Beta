package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class wc0 extends FrameLayout {
    public final ArrayList E;
    public final sc0 F;
    public final ah.c G;
    public TLRPC.Peer f32612a;
    public final boolean f32613b;
    public final org.telegram.ui.zn f32614c;
    public final MessagePreviewParams d;
    public final uc0 f32615e;
    public final yb0 f32616f;
    public ValueAnimator h;
    public final TLRPC.User f32617n;
    public final TLRPC.Chat f32618r;
    public boolean f32619s;
    public boolean v;
    public final int f32620w;
    public boolean f32621x;
    public final org.telegram.ui.Cells.t6 f32622y;

    public wc0(Context context, org.telegram.ui.zn znVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, sc0 sc0Var, int i11, final boolean z10) {
        super(context);
        this.f32622y = new org.telegram.ui.Cells.t6(this, 16);
        this.E = new ArrayList(10);
        this.f32613b = z10;
        this.f32614c = znVar;
        this.f32620w = i10;
        this.G = cVar;
        this.f32617n = user;
        this.f32618r = chat;
        this.d = messagePreviewParams;
        this.F = sc0Var;
        this.f32616f = new yb0(this, context, sc0Var);
        uc0 uc0Var = new uc0(context, sc0Var);
        this.f32615e = uc0Var;
        ch.d c10 = cVar.c(uc0Var, null, false);
        c10.o(eh.b.k(sc0Var));
        c10.f4684j.f4667e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        uc0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f32615e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f32615e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f32615e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f32615e.f31382a.size() - 1;
            }
        }
        this.f32616f.setAdapter(new zb0(this, context));
        this.f32616f.setPosition(i12);
        this.f32615e.setSelectedTab(i12);
        addView(this.f32615e, w7.x5.e(-1, 66, 87));
        addView(this.f32616f, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 119));
        this.f32615e.setOnTabClick(new a3(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                wc0 wc0Var = wc0.this;
                wc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    wc0Var.a(true);
                }
                return true;
            }
        });
        this.f32619s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f32619s) {
            this.f32619s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ea(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f32616f.f30096e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof qc0) {
                    qc0 qc0Var = (qc0) view;
                    if (qc0Var.f30127a == 0) {
                        qc0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.jl jlVar = (org.telegram.ui.jl) this;
            org.telegram.ui.zn znVar = jlVar.H;
            znVar.Fa = null;
            znVar.g7();
            MessagePreviewParams messagePreviewParams = znVar.f44770f5;
            if (messagePreviewParams != null) {
                if (znVar.f44841l5 == null) {
                    znVar.f44841l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    znVar.f44841l5 = null;
                }
                org.telegram.ui.pn pnVar = znVar.f44841l5;
                if (pnVar != null) {
                    pnVar.f40916f = false;
                    pnVar.f40913b = messagePreviewParams.quoteStart;
                    pnVar.f40914c = messagePreviewParams.quoteEnd;
                    pnVar.e();
                    if (znVar.f44883ob == 2) {
                        znVar.Gb(znVar.f44867n5, znVar.f44841l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = znVar.f44770f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    znVar.m8();
                }
            }
            if (znVar.f44763eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.il(jlVar, 1), 50L);
                znVar.f44763eb = false;
            }
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f32612a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f32616f.f30096e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qc0 qc0Var = (qc0) view;
                    if (qc0Var.f30127a == 1) {
                        qc0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
