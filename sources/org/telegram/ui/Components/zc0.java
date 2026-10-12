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
public abstract class zc0 extends FrameLayout {
    public final ArrayList E;
    public final vc0 F;
    public final ah.c G;
    public TLRPC.Peer f33330a;
    public final boolean f33331b;
    public final org.telegram.ui.eo f33332c;
    public final MessagePreviewParams d;
    public final xc0 f33333e;
    public final bc0 f33334f;
    public ValueAnimator h;
    public final TLRPC.User f33335n;
    public final TLRPC.Chat f33336r;
    public boolean f33337s;
    public boolean v;
    public final int f33338w;
    public boolean f33339x;
    public final org.telegram.ui.Cells.l7 f33340y;

    public zc0(Context context, org.telegram.ui.eo eoVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, vc0 vc0Var, int i11, final boolean z10) {
        super(context);
        this.f33340y = new org.telegram.ui.Cells.l7(this, 15);
        this.E = new ArrayList(10);
        this.f33331b = z10;
        this.f33332c = eoVar;
        this.f33338w = i10;
        this.G = cVar;
        this.f33335n = user;
        this.f33336r = chat;
        this.d = messagePreviewParams;
        this.F = vc0Var;
        this.f33334f = new bc0(this, context, vc0Var);
        xc0 xc0Var = new xc0(context, vc0Var);
        this.f33333e = xc0Var;
        ch.d c10 = cVar.c(xc0Var, null, false);
        c10.o(eh.b.k(vc0Var));
        c10.f4683j.f4666e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        xc0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f33333e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f33333e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f33333e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f33333e.f32712a.size() - 1;
            }
        }
        this.f33334f.setAdapter(new cc0(this, context));
        this.f33334f.setPosition(i12);
        this.f33333e.setSelectedTab(i12);
        addView(this.f33333e, w7.w5.e(-1, 66, 87));
        addView(this.f33334f, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 119));
        this.f33333e.setOnTabClick(new a3(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zc0 zc0Var = zc0.this;
                zc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    zc0Var.a(true);
                }
                return true;
            }
        });
        this.f33337s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f33337s) {
            this.f33337s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ea(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f33334f.f31109e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof tc0) {
                    tc0 tc0Var = (tc0) view;
                    if (tc0Var.f30854a == 0) {
                        tc0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.nl nlVar = (org.telegram.ui.nl) this;
            org.telegram.ui.eo eoVar = nlVar.H;
            eoVar.Fa = null;
            eoVar.g7();
            MessagePreviewParams messagePreviewParams = eoVar.f37264f5;
            if (messagePreviewParams != null) {
                if (eoVar.f37335l5 == null) {
                    eoVar.f37335l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    eoVar.f37335l5 = null;
                }
                org.telegram.ui.tn tnVar = eoVar.f37335l5;
                if (tnVar != null) {
                    tnVar.f42248f = false;
                    tnVar.f42245b = messagePreviewParams.quoteStart;
                    tnVar.f42246c = messagePreviewParams.quoteEnd;
                    tnVar.e();
                    if (eoVar.f37377ob == 2) {
                        eoVar.Gb(eoVar.f37361n5, eoVar.f37335l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = eoVar.f37264f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    eoVar.m8();
                }
            }
            if (eoVar.f37257eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ml(nlVar, 1), 50L);
                eoVar.f37257eb = false;
            }
            Activity parentActivity = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f33330a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f33334f.f31109e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    tc0 tc0Var = (tc0) view;
                    if (tc0Var.f30854a == 1) {
                        tc0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
