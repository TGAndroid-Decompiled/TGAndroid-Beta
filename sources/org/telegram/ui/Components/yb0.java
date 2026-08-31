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
public abstract class yb0 extends FrameLayout {
    public final ArrayList B;
    public final ub0 C;
    public final og.a D;
    public TLRPC.Peer f33432a;
    public final boolean f33433b;
    public final org.telegram.ui.xn f33434c;
    public final MessagePreviewParams d;
    public final wb0 f33435e;
    public final za0 f33436f;
    public ValueAnimator h;
    public final TLRPC.User f33437n;
    public final TLRPC.Chat f33438r;
    public boolean f33439s;
    public boolean v;
    public final int f33440w;
    public boolean f33441x;
    public final m2.b f33442y;

    public yb0(Context context, org.telegram.ui.xn xnVar, og.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, ub0 ub0Var, int i11, final boolean z4) {
        super(context);
        this.f33442y = new m2.b(this, 25);
        this.B = new ArrayList(10);
        this.f33433b = z4;
        this.f33434c = xnVar;
        this.f33440w = i10;
        this.D = aVar;
        this.f33437n = user;
        this.f33438r = chat;
        this.d = messagePreviewParams;
        this.C = ub0Var;
        this.f33436f = new za0(this, context, ub0Var);
        wb0 wb0Var = new wb0(context, ub0Var);
        this.f33435e = wb0Var;
        qg.b c3 = aVar.c(wb0Var, null, false);
        c3.n(sg.b.j(ub0Var));
        c3.h.f44839e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        wb0Var.setBackground(c3);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f33435e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z4) {
                this.f33435e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z4) {
                    this.f33435e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f33435e.f32714a.size() - 1;
            }
        }
        this.f33436f.setAdapter(new ab0(this, context));
        this.f33436f.setPosition(i12);
        this.f33435e.setSelectedTab(i12);
        addView(this.f33435e, k7.c6.e(-1, 66, 87));
        addView(this.f33436f, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f33435e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                yb0 yb0Var = yb0.this;
                yb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z4) {
                    yb0Var.a(true);
                }
                return true;
            }
        });
        this.f33439s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(xh.n.V).scaleY(1.0f);
    }

    public final void a(boolean z4) {
        int i10;
        if (this.f33439s) {
            this.f33439s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(xh.n.V).setListener(new x20(4, this, z4));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f33436f.f28987e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof sb0) {
                    sb0 sb0Var = (sb0) view;
                    if (sb0Var.f31027a == 0) {
                        sb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.fl flVar = (org.telegram.ui.fl) this;
            org.telegram.ui.xn xnVar = flVar.E;
            xnVar.Ba = null;
            xnVar.d7();
            MessagePreviewParams messagePreviewParams = xnVar.f43144c5;
            if (messagePreviewParams != null) {
                if (xnVar.f43221i5 == null) {
                    xnVar.f43221i5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    xnVar.f43221i5 = null;
                }
                org.telegram.ui.nn nnVar = xnVar.f43221i5;
                if (nnVar != null) {
                    nnVar.f39488f = false;
                    nnVar.f39485b = messagePreviewParams.quoteStart;
                    nnVar.f39486c = messagePreviewParams.quoteEnd;
                    nnVar.e();
                    if (xnVar.f43263lb == 2) {
                        xnVar.Cb(xnVar.f43245k5, xnVar.f43221i5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = xnVar.f43144c5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    xnVar.j8();
                }
            }
            if (xnVar.f43137bb && z4) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 1), 50L);
                xnVar.f43137bb = false;
            }
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z4);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f33432a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f33436f.f28987e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    sb0 sb0Var = (sb0) view;
                    if (sb0Var.f31027a == 1) {
                        sb0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
