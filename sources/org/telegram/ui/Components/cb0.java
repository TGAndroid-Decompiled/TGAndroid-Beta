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
public abstract class cb0 extends FrameLayout {
    public final ArrayList A;
    public final ya0 B;
    public final ig.a C;
    public TLRPC.Peer f27454a;
    public final boolean f27455b;
    public final org.telegram.ui.qn f27456c;
    public final MessagePreviewParams d;
    public final ab0 f27457e;
    public final ea0 f27458f;
    public ValueAnimator h;
    public final TLRPC.User f27459n;
    public final TLRPC.Chat f27460r;
    public boolean f27461s;
    public boolean v;
    public final int f27462w;
    public boolean f27463x;
    public final m.i3 f27464y;

    public cb0(Context context, org.telegram.ui.qn qnVar, ig.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i9, ya0 ya0Var, int i10, final boolean z10) {
        super(context);
        this.f27464y = new m.i3(this, 23);
        this.A = new ArrayList(10);
        this.f27455b = z10;
        this.f27456c = qnVar;
        this.f27462w = i9;
        this.C = aVar;
        this.f27459n = user;
        this.f27460r = chat;
        this.d = messagePreviewParams;
        this.B = ya0Var;
        this.f27458f = new ea0(this, context, ya0Var);
        ab0 ab0Var = new ab0(context, ya0Var);
        this.f27457e = ab0Var;
        kg.d c10 = aVar.c(ab0Var, null, false);
        c10.n(mg.c.j(ya0Var));
        c10.h.f14805e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ab0Var.setBackground(c10);
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && messagePreviewParams.replyMessage != null) {
                this.f27457e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i12 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f27457e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i12 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f27457e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i12 == i10) {
                i11 = this.f27457e.f26746a.size() - 1;
            }
        }
        this.f27458f.setAdapter(new fa0(this, context));
        this.f27458f.setPosition(i11);
        this.f27457e.setSelectedTab(i11);
        addView(this.f27457e, g7.e6.e(-1, 66, 87));
        addView(this.f27458f, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f27457e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                cb0 cb0Var = cb0.this;
                cb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    cb0Var.a(true);
                }
                return true;
            }
        });
        this.f27461s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(rh.m.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i9;
        if (this.f27461s) {
            this.f27461s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(rh.m.V).setListener(new u9(14, this, z10));
            int i10 = 0;
            while (true) {
                View[] viewArr = this.f27458f.f31035e;
                if (i10 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i10];
                if (view instanceof wa0) {
                    wa0 wa0Var = (wa0) view;
                    if (wa0Var.f34168a == 0) {
                        wa0Var.j();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this;
            org.telegram.ui.qn qnVar = wkVar.D;
            qnVar.Aa = null;
            qnVar.d7();
            MessagePreviewParams messagePreviewParams = qnVar.f41857b5;
            if (messagePreviewParams != null) {
                if (qnVar.f41934h5 == null) {
                    qnVar.f41934h5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    qnVar.f41934h5 = null;
                }
                org.telegram.ui.gn gnVar = qnVar.f41934h5;
                if (gnVar != null) {
                    gnVar.f38576f = false;
                    gnVar.f38573b = messagePreviewParams.quoteStart;
                    gnVar.f38574c = messagePreviewParams.quoteEnd;
                    gnVar.e();
                    if (qnVar.f41976kb == 2) {
                        qnVar.Cb(qnVar.f41959j5, qnVar.f41934h5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = qnVar.f41857b5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    qnVar.j8();
                }
            }
            if (qnVar.f41849ab && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vk(wkVar, 1), 50L);
                qnVar.f41849ab = false;
            }
            Activity parentActivity = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i9);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f27454a = peer;
        int i9 = 0;
        while (true) {
            View[] viewArr = this.f27458f.f31035e;
            if (i9 < viewArr.length) {
                View view = viewArr[i9];
                if (view != null) {
                    wa0 wa0Var = (wa0) view;
                    if (wa0Var.f34168a == 1) {
                        wa0Var.h();
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }
}
