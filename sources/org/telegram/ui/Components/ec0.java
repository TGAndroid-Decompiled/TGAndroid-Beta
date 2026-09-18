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
public abstract class ec0 extends FrameLayout {
    public final ArrayList E;
    public final ac0 F;
    public final ah.c G;
    public TLRPC.Peer f23844a;
    public final boolean f23845b;
    public final org.telegram.ui.zn f23846c;
    public final MessagePreviewParams d;
    public final cc0 e;
    public final eb0 f23847f;
    public ValueAnimator h;
    public final TLRPC.User f23848n;
    public final TLRPC.Chat f23849r;
    public boolean f23850s;
    public boolean v;
    public final int f23851w;
    public boolean f23852x;
    public final org.telegram.ui.Cells.t6 f23853y;

    public ec0(Context context, org.telegram.ui.zn znVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, ac0 ac0Var, int i11, final boolean z10) {
        super(context);
        this.f23853y = new org.telegram.ui.Cells.t6(this, 18);
        this.E = new ArrayList(10);
        this.f23845b = z10;
        this.f23846c = znVar;
        this.f23851w = i10;
        this.G = cVar;
        this.f23848n = user;
        this.f23849r = chat;
        this.d = messagePreviewParams;
        this.F = ac0Var;
        this.f23847f = new eb0(this, context, ac0Var);
        cc0 cc0Var = new cc0(context, ac0Var);
        this.e = cc0Var;
        ch.d c10 = cVar.c(cc0Var, null, false);
        c10.o(eh.b.k(ac0Var));
        c10.f4288j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        cc0Var.setBackground(c10);
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
                i12 = this.e.f23248a.size() - 1;
            }
        }
        this.f23847f.setAdapter(new fb0(this, context));
        this.f23847f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.y5.e(-1, 66, 87));
        addView(this.f23847f, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ec0 ec0Var = ec0.this;
                ec0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ec0Var.a(true);
                }
                return true;
            }
        });
        this.f23850s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f23850s) {
            this.f23850s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ca(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f23847f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof yb0) {
                    yb0 yb0Var = (yb0) view;
                    if (yb0Var.f30532a == 0) {
                        yb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.fl flVar = (org.telegram.ui.fl) this;
            org.telegram.ui.zn znVar = flVar.H;
            znVar.Ea = null;
            znVar.d7();
            MessagePreviewParams messagePreviewParams = znVar.f40269f5;
            if (messagePreviewParams != null) {
                if (znVar.f40341l5 == null) {
                    znVar.f40341l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    znVar.f40341l5 = null;
                }
                org.telegram.ui.pn pnVar = znVar.f40341l5;
                if (pnVar != null) {
                    pnVar.f36515f = false;
                    pnVar.f36513b = messagePreviewParams.quoteStart;
                    pnVar.f36514c = messagePreviewParams.quoteEnd;
                    pnVar.e();
                    if (znVar.nb == 2) {
                        znVar.Cb(znVar.f40367n5, znVar.f40341l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = znVar.f40269f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    znVar.j8();
                }
            }
            if (znVar.f40250db && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 50L);
                znVar.f40250db = false;
            }
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f23844a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f23847f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    yb0 yb0Var = (yb0) view;
                    if (yb0Var.f30532a == 1) {
                        yb0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
