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
public abstract class gc0 extends FrameLayout {
    public final ArrayList E;
    public final cc0 F;
    public final ah.c G;
    public TLRPC.Peer f24462a;
    public final boolean f24463b;
    public final org.telegram.ui.wn f24464c;
    public final MessagePreviewParams d;
    public final ec0 e;
    public final ib0 f24465f;
    public ValueAnimator h;
    public final TLRPC.User f24466n;
    public final TLRPC.Chat f24467r;
    public boolean f24468s;
    public boolean v;
    public final int f24469w;
    public boolean f24470x;
    public final org.telegram.ui.Cells.t6 f24471y;

    public gc0(Context context, org.telegram.ui.wn wnVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, cc0 cc0Var, int i11, final boolean z10) {
        super(context);
        this.f24471y = new org.telegram.ui.Cells.t6(this, 17);
        this.E = new ArrayList(10);
        this.f24463b = z10;
        this.f24464c = wnVar;
        this.f24469w = i10;
        this.G = cVar;
        this.f24466n = user;
        this.f24467r = chat;
        this.d = messagePreviewParams;
        this.F = cc0Var;
        this.f24465f = new ib0(this, context, cc0Var);
        ec0 ec0Var = new ec0(context, cc0Var);
        this.e = ec0Var;
        ch.d c10 = cVar.c(ec0Var, null, false);
        c10.o(eh.b.k(cc0Var));
        c10.f4280j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        ec0Var.setBackground(c10);
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
                i12 = this.e.f23922a.size() - 1;
            }
        }
        this.f24465f.setAdapter(new jb0(this, context));
        this.f24465f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.y5.e(-1, 66, 87));
        addView(this.f24465f, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                gc0 gc0Var = gc0.this;
                gc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    gc0Var.a(true);
                }
                return true;
            }
        });
        this.f24468s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f24468s) {
            this.f24468s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ca(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f24465f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof ac0) {
                    ac0 ac0Var = (ac0) view;
                    if (ac0Var.f22601a == 0) {
                        ac0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.el elVar = (org.telegram.ui.el) this;
            org.telegram.ui.wn wnVar = elVar.H;
            wnVar.Ea = null;
            wnVar.d7();
            MessagePreviewParams messagePreviewParams = wnVar.f39476f5;
            if (messagePreviewParams != null) {
                if (wnVar.f39547l5 == null) {
                    wnVar.f39547l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    wnVar.f39547l5 = null;
                }
                org.telegram.ui.mn mnVar = wnVar.f39547l5;
                if (mnVar != null) {
                    mnVar.f35626f = false;
                    mnVar.f35624b = messagePreviewParams.quoteStart;
                    mnVar.f35625c = messagePreviewParams.quoteEnd;
                    mnVar.e();
                    if (wnVar.nb == 2) {
                        wnVar.Cb(wnVar.f39573n5, wnVar.f39547l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = wnVar.f39476f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    wnVar.j8();
                }
            }
            if (wnVar.f39457db && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 1), 50L);
                wnVar.f39457db = false;
            }
            Activity parentActivity = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f24462a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f24465f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ac0 ac0Var = (ac0) view;
                    if (ac0Var.f22601a == 1) {
                        ac0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
