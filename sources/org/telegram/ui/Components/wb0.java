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
public abstract class wb0 extends FrameLayout {
    public final ArrayList B;
    public final sb0 C;
    public final ng.a D;
    public TLRPC.Peer f30285a;
    public final boolean f30286b;
    public final org.telegram.ui.xn f30287c;
    public final MessagePreviewParams d;
    public final ub0 e;
    public final xa0 f30288f;
    public ValueAnimator h;
    public final TLRPC.User f30289n;
    public final TLRPC.Chat f30290r;
    public boolean f30291s;
    public boolean v;
    public final int f30292w;
    public boolean f30293x;
    public final m2.b f30294y;

    public wb0(Context context, org.telegram.ui.xn xnVar, ng.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, sb0 sb0Var, int i11, final boolean z4) {
        super(context);
        this.f30294y = new m2.b(this, 25);
        this.B = new ArrayList(10);
        this.f30286b = z4;
        this.f30287c = xnVar;
        this.f30292w = i10;
        this.D = aVar;
        this.f30289n = user;
        this.f30290r = chat;
        this.d = messagePreviewParams;
        this.C = sb0Var;
        this.f30288f = new xa0(this, context, sb0Var);
        ub0 ub0Var = new ub0(context, sb0Var);
        this.e = ub0Var;
        pg.b c3 = aVar.c(ub0Var, null, false);
        c3.n(rg.b.j(sb0Var));
        c3.h.e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        ub0Var.setBackground(c3);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z4) {
                this.e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z4) {
                    this.e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.e.f29177a.size() - 1;
            }
        }
        this.f30288f.setAdapter(new ya0(this, context));
        this.f30288f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, k7.b6.e(-1, 66, 87));
        addView(this.f30288f, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                wb0 wb0Var = wb0.this;
                wb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z4) {
                    wb0Var.a(true);
                }
                return true;
            }
        });
        this.f30291s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(wh.n.V).scaleY(1.0f);
    }

    public final void a(boolean z4) {
        int i10;
        if (this.f30291s) {
            this.f30291s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(wh.n.V).setListener(new l00(6, this, z4));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f30288f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof qb0) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f28102a == 0) {
                        qb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.fl flVar = (org.telegram.ui.fl) this;
            org.telegram.ui.xn xnVar = flVar.E;
            xnVar.Ba = null;
            xnVar.d7();
            MessagePreviewParams messagePreviewParams = xnVar.f39976c5;
            if (messagePreviewParams != null) {
                if (xnVar.f40052i5 == null) {
                    xnVar.f40052i5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    xnVar.f40052i5 = null;
                }
                org.telegram.ui.nn nnVar = xnVar.f40052i5;
                if (nnVar != null) {
                    nnVar.f36694f = false;
                    nnVar.f36692b = messagePreviewParams.quoteStart;
                    nnVar.f36693c = messagePreviewParams.quoteEnd;
                    nnVar.e();
                    if (xnVar.f40094lb == 2) {
                        xnVar.Cb(xnVar.f40076k5, xnVar.f40052i5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = xnVar.f39976c5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    xnVar.j8();
                }
            }
            if (xnVar.f39969bb && z4) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 1), 50L);
                xnVar.f39969bb = false;
            }
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z4);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f30285a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f30288f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f28102a == 1) {
                        qb0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
