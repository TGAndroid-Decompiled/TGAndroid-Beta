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
    public TLRPC.Peer f24540a;
    public final boolean f24541b;
    public final org.telegram.ui.xn f24542c;
    public final MessagePreviewParams d;
    public final ec0 e;
    public final ib0 f24543f;
    public ValueAnimator h;
    public final TLRPC.User f24544n;
    public final TLRPC.Chat f24545r;
    public boolean f24546s;
    public boolean v;
    public final int f24547w;
    public boolean f24548x;
    public final org.telegram.ui.Cells.t6 f24549y;

    public gc0(Context context, org.telegram.ui.xn xnVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, cc0 cc0Var, int i11, final boolean z10) {
        super(context);
        this.f24549y = new org.telegram.ui.Cells.t6(this, 17);
        this.E = new ArrayList(10);
        this.f24541b = z10;
        this.f24542c = xnVar;
        this.f24547w = i10;
        this.G = cVar;
        this.f24544n = user;
        this.f24545r = chat;
        this.d = messagePreviewParams;
        this.F = cc0Var;
        this.f24543f = new ib0(this, context, cc0Var);
        ec0 ec0Var = new ec0(context, cc0Var);
        this.e = ec0Var;
        ch.d c10 = cVar.c(ec0Var, null, false);
        c10.u(eh.b.k(cc0Var));
        c10.f4282j.e = true;
        c10.v(AndroidUtilities.dp(8.0f));
        c10.w(AndroidUtilities.dp(16.0f));
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
                i12 = this.e.f24006a.size() - 1;
            }
        }
        this.f24543f.setAdapter(new jb0(this, context));
        this.f24543f.setPosition(i12);
        this.e.setSelectedTab(i12);
        addView(this.e, w7.y5.e(-1, 66, 87));
        addView(this.f24543f, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
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
        this.f24546s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f24546s) {
            this.f24546s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new ca(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f24543f.e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof ac0) {
                    ac0 ac0Var = (ac0) view;
                    if (ac0Var.f22645a == 0) {
                        ac0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.fl flVar = (org.telegram.ui.fl) this;
            org.telegram.ui.xn xnVar = flVar.H;
            xnVar.Ea = null;
            xnVar.d7();
            MessagePreviewParams messagePreviewParams = xnVar.f39758f5;
            if (messagePreviewParams != null) {
                if (xnVar.f39830l5 == null) {
                    xnVar.f39830l5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    xnVar.f39830l5 = null;
                }
                org.telegram.ui.nn nnVar = xnVar.f39830l5;
                if (nnVar != null) {
                    nnVar.f36054f = false;
                    nnVar.f36052b = messagePreviewParams.quoteStart;
                    nnVar.f36053c = messagePreviewParams.quoteEnd;
                    nnVar.e();
                    if (xnVar.nb == 2) {
                        xnVar.Cb(xnVar.f39856n5, xnVar.f39830l5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = xnVar.f39758f5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    xnVar.j8();
                }
            }
            if (xnVar.f39739db && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 1), 50L);
                xnVar.f39739db = false;
            }
            Activity parentActivity = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f24540a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f24543f.e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    ac0 ac0Var = (ac0) view;
                    if (ac0Var.f22645a == 1) {
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
