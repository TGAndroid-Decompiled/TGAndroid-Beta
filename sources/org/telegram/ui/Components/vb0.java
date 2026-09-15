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
public abstract class vb0 extends FrameLayout {
    public final ArrayList E;
    public final rb0 F;
    public final ah.c G;
    public TLRPC.Peer f28678a;
    public final boolean f28679b;
    public final org.telegram.ui.bo f28680c;
    public final MessagePreviewParams d;
    public final tb0 e;
    public final va0 f28681f;
    public ValueAnimator h;
    public final TLRPC.User f28682n;
    public final TLRPC.Chat f28683r;
    public boolean f28684s;
    public boolean v;
    public final int f28685w;
    public boolean f28686x;
    public final org.telegram.ui.Cells.l7 f28687y;

    public vb0(Context context, org.telegram.ui.bo boVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, rb0 rb0Var, int i11, final boolean z10) {
        super(context);
        this.f28687y = new org.telegram.ui.Cells.l7(this, 16);
        this.E = new ArrayList(10);
        this.f28679b = z10;
        this.f28680c = boVar;
        this.f28685w = i10;
        this.G = cVar;
        this.f28682n = user;
        this.f28683r = chat;
        this.d = messagePreviewParams;
        this.F = rb0Var;
        this.f28681f = new va0(this, context, rb0Var);
        tb0 tb0Var = new tb0(context, rb0Var);
        this.e = tb0Var;
        ch.d c10 = cVar.c(tb0Var, null, false);
        c10.o(eh.b.k(rb0Var));
        c10.f4283j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tb0Var.setBackground(c10);
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
                i12 = this.e.f28088a.size() - 1;
            }
        }
        this.f28681f.setAdapter(new wa0(this, context));
        this.f28681f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.x5.e(-1, 66, 87));
        addView(this.f28681f, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new x2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                vb0 vb0Var = vb0.this;
                vb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    vb0Var.a(true);
                }
                return true;
            }
        });
        this.f28684s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f28684s) {
            this.f28684s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new aa(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f28681f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof pb0) {
                    pb0 pb0Var = (pb0) view;
                    if (pb0Var.f26996a == 0) {
                        pb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.il ilVar = (org.telegram.ui.il) this;
            org.telegram.ui.bo boVar = ilVar.H;
            boVar.Ea = null;
            boVar.d7();
            MessagePreviewParams messagePreviewParams = boVar.f32305f5;
            if (messagePreviewParams != null) {
                if (boVar.f32377l5 == null) {
                    boVar.f32377l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    boVar.f32377l5 = null;
                }
                org.telegram.ui.rn rnVar = boVar.f32377l5;
                if (rnVar != null) {
                    rnVar.f37156f = false;
                    rnVar.f37154b = messagePreviewParams.quoteStart;
                    rnVar.f37155c = messagePreviewParams.quoteEnd;
                    rnVar.e();
                    if (boVar.f32419ob == 2) {
                        boVar.Cb(boVar.f32403n5, boVar.f32377l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = boVar.f32305f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    boVar.j8();
                }
            }
            if (boVar.f32298eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.hl(ilVar, 1), 50L);
                boVar.f32298eb = false;
            }
            Activity parentActivity = boVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f28678a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f28681f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    pb0 pb0Var = (pb0) view;
                    if (pb0Var.f26996a == 1) {
                        pb0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
