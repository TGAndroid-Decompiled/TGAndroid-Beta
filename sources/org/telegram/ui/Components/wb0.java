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
    public final ArrayList E;
    public final sb0 F;
    public final bh.b G;
    public TLRPC.Peer f32224a;
    public final boolean f32225b;
    public final org.telegram.ui.co f32226c;
    public final MessagePreviewParams d;
    public final ub0 f32227e;
    public final wa0 f32228f;
    public ValueAnimator h;
    public final TLRPC.User f32229n;
    public final TLRPC.Chat f32230r;
    public boolean f32231s;
    public boolean v;
    public final int f32232w;
    public boolean f32233x;
    public final org.telegram.ui.Cells.l7 f32234y;

    public wb0(Context context, org.telegram.ui.co coVar, bh.b bVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, sb0 sb0Var, int i11, final boolean z10) {
        super(context);
        this.f32234y = new org.telegram.ui.Cells.l7(this, 16);
        this.E = new ArrayList(10);
        this.f32225b = z10;
        this.f32226c = coVar;
        this.f32232w = i10;
        this.G = bVar;
        this.f32229n = user;
        this.f32230r = chat;
        this.d = messagePreviewParams;
        this.F = sb0Var;
        this.f32228f = new wa0(this, context, sb0Var);
        ub0 ub0Var = new ub0(context, sb0Var);
        this.f32227e = ub0Var;
        dh.d c10 = bVar.c(ub0Var, null, false);
        c10.n(fh.b.k(sb0Var));
        c10.h.f6821e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
        ub0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f32227e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f32227e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f32227e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f32227e.f30849a.size() - 1;
            }
        }
        this.f32228f.setAdapter(new xa0(this, context));
        this.f32228f.setPosition(i12);
        this.f32227e.setSelectedTab(i12);
        addView(this.f32227e, w7.x5.e(-1, 66, 87));
        addView(this.f32228f, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f32227e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                wb0 wb0Var = wb0.this;
                wb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    wb0Var.a(true);
                }
                return true;
            }
        });
        this.f32231s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ki.o.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f32231s) {
            this.f32231s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ki.o.V).setListener(new org.telegram.ui.to(15, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f32228f.f27017e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof qb0) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f29657a == 0) {
                        qb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.il ilVar = (org.telegram.ui.il) this;
            org.telegram.ui.co coVar = ilVar.H;
            coVar.Ea = null;
            coVar.d7();
            MessagePreviewParams messagePreviewParams = coVar.f35255f5;
            if (messagePreviewParams != null) {
                if (coVar.f35326l5 == null) {
                    coVar.f35326l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    coVar.f35326l5 = null;
                }
                org.telegram.ui.sn snVar = coVar.f35326l5;
                if (snVar != null) {
                    snVar.f40481f = false;
                    snVar.f40478b = messagePreviewParams.quoteStart;
                    snVar.f40479c = messagePreviewParams.quoteEnd;
                    snVar.e();
                    if (coVar.f35368ob == 2) {
                        coVar.Cb(coVar.f35352n5, coVar.f35326l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = coVar.f35255f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    coVar.j8();
                }
            }
            if (coVar.f35248eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.hl(ilVar, 1), 50L);
                coVar.f35248eb = false;
            }
            Activity parentActivity = coVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f32224a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f32228f.f27017e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    qb0 qb0Var = (qb0) view;
                    if (qb0Var.f29657a == 1) {
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
