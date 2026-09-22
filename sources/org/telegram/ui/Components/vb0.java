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
    public TLRPC.Peer f28675a;
    public final boolean f28676b;
    public final org.telegram.ui.bo f28677c;
    public final MessagePreviewParams d;
    public final tb0 e;
    public final va0 f28678f;
    public ValueAnimator h;
    public final TLRPC.User f28679n;
    public final TLRPC.Chat f28680r;
    public boolean f28681s;
    public boolean v;
    public final int f28682w;
    public boolean f28683x;
    public final org.telegram.ui.Cells.l7 f28684y;

    public vb0(Context context, org.telegram.ui.bo boVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, rb0 rb0Var, int i11, final boolean z10) {
        super(context);
        this.f28684y = new org.telegram.ui.Cells.l7(this, 16);
        this.E = new ArrayList(10);
        this.f28676b = z10;
        this.f28677c = boVar;
        this.f28682w = i10;
        this.G = cVar;
        this.f28679n = user;
        this.f28680r = chat;
        this.d = messagePreviewParams;
        this.F = rb0Var;
        this.f28678f = new va0(this, context, rb0Var);
        tb0 tb0Var = new tb0(context, rb0Var);
        this.e = tb0Var;
        ch.d c10 = cVar.c(tb0Var, null, false);
        c10.o(eh.b.k(rb0Var));
        c10.f4285j.e = true;
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
                i12 = this.e.f28085a.size() - 1;
            }
        }
        this.f28678f.setAdapter(new wa0(this, context));
        this.f28678f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.x5.e(-1, 66, 87));
        addView(this.f28678f, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
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
        this.f28681s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f28681s) {
            this.f28681s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new aa(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f28678f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof pb0) {
                    pb0 pb0Var = (pb0) view;
                    if (pb0Var.f26993a == 0) {
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
            MessagePreviewParams messagePreviewParams = boVar.f32301f5;
            if (messagePreviewParams != null) {
                if (boVar.f32372l5 == null) {
                    boVar.f32372l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    boVar.f32372l5 = null;
                }
                org.telegram.ui.rn rnVar = boVar.f32372l5;
                if (rnVar != null) {
                    rnVar.f37174f = false;
                    rnVar.f37172b = messagePreviewParams.quoteStart;
                    rnVar.f37173c = messagePreviewParams.quoteEnd;
                    rnVar.e();
                    if (boVar.nb == 2) {
                        boVar.Cb(boVar.f32398n5, boVar.f32372l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = boVar.f32301f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    boVar.j8();
                }
            }
            if (boVar.f32282db && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.hl(ilVar, 1), 50L);
                boVar.f32282db = false;
            }
            Activity parentActivity = boVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f28675a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f28678f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    pb0 pb0Var = (pb0) view;
                    if (pb0Var.f26993a == 1) {
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
