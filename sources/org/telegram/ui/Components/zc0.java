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
    public TLRPC.Peer f33324a;
    public final boolean f33325b;
    public final org.telegram.ui.eo f33326c;
    public final MessagePreviewParams d;
    public final xc0 f33327e;
    public final bc0 f33328f;
    public ValueAnimator h;
    public final TLRPC.User f33329n;
    public final TLRPC.Chat f33330r;
    public boolean f33331s;
    public boolean v;
    public final int f33332w;
    public boolean f33333x;
    public final org.telegram.ui.Cells.l7 f33334y;

    public zc0(Context context, org.telegram.ui.eo eoVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, vc0 vc0Var, int i11, final boolean z10) {
        super(context);
        this.f33334y = new org.telegram.ui.Cells.l7(this, 15);
        this.E = new ArrayList(10);
        this.f33325b = z10;
        this.f33326c = eoVar;
        this.f33332w = i10;
        this.G = cVar;
        this.f33329n = user;
        this.f33330r = chat;
        this.d = messagePreviewParams;
        this.F = vc0Var;
        this.f33328f = new bc0(this, context, vc0Var);
        xc0 xc0Var = new xc0(context, vc0Var);
        this.f33327e = xc0Var;
        ch.d c10 = cVar.c(xc0Var, null, false);
        c10.o(eh.b.k(vc0Var));
        c10.f4683j.f4666e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        xc0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f33327e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f33327e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f33327e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f33327e.f32713a.size() - 1;
            }
        }
        this.f33328f.setAdapter(new cc0(this, context));
        this.f33328f.setPosition(i12);
        this.f33327e.setSelectedTab(i12);
        addView(this.f33327e, w7.w5.e(-1, 66, 87));
        addView(this.f33328f, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 119));
        this.f33327e.setOnTabClick(new a3(this, 7));
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
        this.f33331s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f33331s) {
            this.f33331s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ea(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f33328f.f31114e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof tc0) {
                    tc0 tc0Var = (tc0) view;
                    if (tc0Var.f30851a == 0) {
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
            MessagePreviewParams messagePreviewParams = eoVar.f37259f5;
            if (messagePreviewParams != null) {
                if (eoVar.f37330l5 == null) {
                    eoVar.f37330l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    eoVar.f37330l5 = null;
                }
                org.telegram.ui.tn tnVar = eoVar.f37330l5;
                if (tnVar != null) {
                    tnVar.f42246f = false;
                    tnVar.f42243b = messagePreviewParams.quoteStart;
                    tnVar.f42244c = messagePreviewParams.quoteEnd;
                    tnVar.e();
                    if (eoVar.f37372ob == 2) {
                        eoVar.Gb(eoVar.f37356n5, eoVar.f37330l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = eoVar.f37259f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    eoVar.m8();
                }
            }
            if (eoVar.f37252eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ml(nlVar, 1), 50L);
                eoVar.f37252eb = false;
            }
            Activity parentActivity = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f33324a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f33328f.f31114e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    tc0 tc0Var = (tc0) view;
                    if (tc0Var.f30851a == 1) {
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
