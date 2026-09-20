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
public abstract class dc0 extends FrameLayout {
    public final ArrayList E;
    public final zb0 F;
    public final ah.c G;
    public TLRPC.Peer f23550a;
    public final boolean f23551b;
    public final org.telegram.ui.zn f23552c;
    public final MessagePreviewParams d;
    public final bc0 e;
    public final db0 f23553f;
    public ValueAnimator h;
    public final TLRPC.User f23554n;
    public final TLRPC.Chat f23555r;
    public boolean f23556s;
    public boolean v;
    public final int f23557w;
    public boolean f23558x;
    public final org.telegram.ui.Cells.u6 f23559y;

    public dc0(Context context, org.telegram.ui.zn znVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, zb0 zb0Var, int i11, final boolean z10) {
        super(context);
        this.f23559y = new org.telegram.ui.Cells.u6(this, 18);
        this.E = new ArrayList(10);
        this.f23551b = z10;
        this.f23552c = znVar;
        this.f23557w = i10;
        this.G = cVar;
        this.f23554n = user;
        this.f23555r = chat;
        this.d = messagePreviewParams;
        this.F = zb0Var;
        this.f23553f = new db0(this, context, zb0Var);
        bc0 bc0Var = new bc0(context, zb0Var);
        this.e = bc0Var;
        ch.d c10 = cVar.c(bc0Var, null, false);
        c10.o(eh.b.k(zb0Var));
        c10.f4289j.e = true;
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(16.0f));
        bc0Var.setBackground(c10);
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
                i12 = this.e.f22956a.size() - 1;
            }
        }
        this.f23553f.setAdapter(new eb0(this, context));
        this.f23553f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.y5.e(-1, 66, 87));
        addView(this.f23553f, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new x2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                dc0 dc0Var = dc0.this;
                dc0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    dc0Var.a(true);
                }
                return true;
            }
        });
        this.f23556s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f23556s) {
            this.f23556s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ba(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f23553f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof xb0) {
                    xb0 xb0Var = (xb0) view;
                    if (xb0Var.f30224a == 0) {
                        xb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.fl flVar = (org.telegram.ui.fl) this;
            org.telegram.ui.zn znVar = flVar.H;
            znVar.Ea = null;
            znVar.d7();
            MessagePreviewParams messagePreviewParams = znVar.f40311f5;
            if (messagePreviewParams != null) {
                if (znVar.f40383l5 == null) {
                    znVar.f40383l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    znVar.f40383l5 = null;
                }
                org.telegram.ui.pn pnVar = znVar.f40383l5;
                if (pnVar != null) {
                    pnVar.f36595f = false;
                    pnVar.f36593b = messagePreviewParams.quoteStart;
                    pnVar.f36594c = messagePreviewParams.quoteEnd;
                    pnVar.e();
                    if (znVar.nb == 2) {
                        znVar.Cb(znVar.f40409n5, znVar.f40383l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = znVar.f40311f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    znVar.j8();
                }
            }
            if (znVar.f40292db && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 50L);
                znVar.f40292db = false;
            }
            Activity parentActivity = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f23550a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f23553f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    xb0 xb0Var = (xb0) view;
                    if (xb0Var.f30224a == 1) {
                        xb0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
