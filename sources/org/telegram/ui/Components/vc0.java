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
public abstract class vc0 extends FrameLayout {
    public final ArrayList E;
    public final rc0 F;
    public final ah.c G;
    public TLRPC.Peer f31747a;
    public final boolean f31748b;
    public final org.telegram.ui.zn f31749c;
    public final MessagePreviewParams d;
    public final tc0 f31750e;
    public final xb0 f31751f;
    public ValueAnimator h;
    public final TLRPC.User f31752n;
    public final TLRPC.Chat f31753r;
    public boolean f31754s;
    public boolean v;
    public final int f31755w;
    public boolean f31756x;
    public final org.telegram.ui.Cells.t6 f31757y;

    public vc0(Context context, org.telegram.ui.zn znVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, rc0 rc0Var, int i11, final boolean z10) {
        super(context);
        this.f31757y = new org.telegram.ui.Cells.t6(this, 16);
        this.E = new ArrayList(10);
        this.f31748b = z10;
        this.f31749c = znVar;
        this.f31755w = i10;
        this.G = cVar;
        this.f31752n = user;
        this.f31753r = chat;
        this.d = messagePreviewParams;
        this.F = rc0Var;
        this.f31751f = new xb0(this, context, rc0Var);
        tc0 tc0Var = new tc0(context, rc0Var);
        this.f31750e = tc0Var;
        ch.d c10 = cVar.c(tc0Var, null, false);
        c10.o(eh.b.k(rc0Var));
        c10.f4685j.f4668e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        tc0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f31750e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f31750e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f31750e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f31750e.f31142a.size() - 1;
            }
        }
        this.f31751f.setAdapter(new yb0(this, context));
        this.f31751f.setPosition(i12);
        this.f31750e.setSelectedTab(i12);
        addView(this.f31750e, w7.x5.e(-1, 66, 87));
        addView(this.f31751f, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 66.0f, -1, 119));
        this.f31750e.setOnTabClick(new a3(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                vc0 vc0Var = vc0.this;
                vc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    vc0Var.a(true);
                }
                return true;
            }
        });
        this.f31754s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f31754s) {
            this.f31754s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new fa(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f31751f.f29429e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof pc0) {
                    pc0 pc0Var = (pc0) view;
                    if (pc0Var.f29840a == 0) {
                        pc0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.jl jlVar = (org.telegram.ui.jl) this;
            org.telegram.ui.zn znVar = jlVar.H;
            znVar.Fa = null;
            znVar.g7();
            MessagePreviewParams messagePreviewParams = znVar.f44771f5;
            if (messagePreviewParams != null) {
                if (znVar.f44842l5 == null) {
                    znVar.f44842l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    znVar.f44842l5 = null;
                }
                org.telegram.ui.pn pnVar = znVar.f44842l5;
                if (pnVar != null) {
                    pnVar.f40849f = false;
                    pnVar.f40846b = messagePreviewParams.quoteStart;
                    pnVar.f40847c = messagePreviewParams.quoteEnd;
                    pnVar.e();
                    if (znVar.f44884ob == 2) {
                        znVar.Gb(znVar.f44868n5, znVar.f44842l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = znVar.f44771f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    znVar.m8();
                }
            }
            if (znVar.f44764eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.il(jlVar, 1), 50L);
                znVar.f44764eb = false;
            }
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f31747a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f31751f.f29429e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    pc0 pc0Var = (pc0) view;
                    if (pc0Var.f29840a == 1) {
                        pc0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
