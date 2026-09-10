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
    public final zg.a G;
    public TLRPC.Peer f22661a;
    public final boolean f22662b;
    public final org.telegram.ui.eo f22663c;
    public final MessagePreviewParams d;
    public final cc0 e;
    public final fb0 f22664f;
    public ValueAnimator h;
    public final TLRPC.User f22665n;
    public final TLRPC.Chat f22666r;
    public boolean f22667s;
    public boolean v;
    public final int f22668w;
    public boolean f22669x;
    public final org.telegram.ui.Cells.l9 f22670y;

    public ec0(Context context, org.telegram.ui.eo eoVar, zg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, ac0 ac0Var, int i11, final boolean z10) {
        super(context);
        this.f22670y = new org.telegram.ui.Cells.l9(this, 14);
        this.E = new ArrayList(10);
        this.f22662b = z10;
        this.f22663c = eoVar;
        this.f22668w = i10;
        this.G = aVar;
        this.f22665n = user;
        this.f22666r = chat;
        this.d = messagePreviewParams;
        this.F = ac0Var;
        this.f22664f = new fb0(this, context, ac0Var);
        cc0 cc0Var = new cc0(context, ac0Var);
        this.e = cc0Var;
        bh.d c10 = aVar.c(cc0Var, null, false);
        c10.n(dh.c.k(ac0Var));
        c10.h.e = true;
        c10.o(AndroidUtilities.dp(8.0f));
        c10.p(AndroidUtilities.dp(16.0f));
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
                i12 = this.e.f22094a.size() - 1;
            }
        }
        this.f22664f.setAdapter(new gb0(this, context));
        this.f22664f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.a6.e(-1, 66, 87));
        addView(this.f22664f, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
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
        this.f22667s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ii.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f22667s) {
            this.f22667s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ii.n.V).setListener(new yo(10, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f22664f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof yb0) {
                    yb0 yb0Var = (yb0) view;
                    if (yb0Var.f29290a == 0) {
                        yb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.kl klVar = (org.telegram.ui.kl) this;
            org.telegram.ui.eo eoVar = klVar.H;
            eoVar.Ea = null;
            eoVar.d7();
            MessagePreviewParams messagePreviewParams = eoVar.f32324f5;
            if (messagePreviewParams != null) {
                if (eoVar.f32395l5 == null) {
                    eoVar.f32395l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    eoVar.f32395l5 = null;
                }
                org.telegram.ui.tn tnVar = eoVar.f32395l5;
                if (tnVar != null) {
                    tnVar.f36970f = false;
                    tnVar.f36968b = messagePreviewParams.quoteStart;
                    tnVar.f36969c = messagePreviewParams.quoteEnd;
                    tnVar.e();
                    if (eoVar.f32437ob == 2) {
                        eoVar.Cb(eoVar.f32421n5, eoVar.f32395l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = eoVar.f32324f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    eoVar.j8();
                }
            }
            if (eoVar.f32317eb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.jl(klVar, 1), 50L);
                eoVar.f32317eb = false;
            }
            Activity parentActivity = eoVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f22661a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f22664f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    yb0 yb0Var = (yb0) view;
                    if (yb0Var.f29290a == 1) {
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
