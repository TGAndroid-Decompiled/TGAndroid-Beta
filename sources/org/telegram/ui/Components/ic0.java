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
public abstract class ic0 extends FrameLayout {
    public final ArrayList E;
    public final ec0 F;
    public final ah.c G;
    public TLRPC.Peer f27356a;
    public final boolean f27357b;
    public final org.telegram.ui.yn f27358c;
    public final MessagePreviewParams d;
    public final gc0 f27359e;
    public final jb0 f27360f;
    public ValueAnimator h;
    public final TLRPC.User f27361n;
    public final TLRPC.Chat f27362r;
    public boolean f27363s;
    public boolean v;
    public final int f27364w;
    public boolean f27365x;
    public final org.telegram.ui.Cells.t6 f27366y;

    public ic0(Context context, org.telegram.ui.yn ynVar, ah.c cVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, ec0 ec0Var, int i11, final boolean z10) {
        super(context);
        this.f27366y = new org.telegram.ui.Cells.t6(this, 17);
        this.E = new ArrayList(10);
        this.f27357b = z10;
        this.f27358c = ynVar;
        this.f27364w = i10;
        this.G = cVar;
        this.f27361n = user;
        this.f27362r = chat;
        this.d = messagePreviewParams;
        this.F = ec0Var;
        this.f27360f = new jb0(this, context, ec0Var);
        gc0 gc0Var = new gc0(context, ec0Var);
        this.f27359e = gc0Var;
        ch.d c10 = cVar.c(gc0Var, null, false);
        c10.x(eh.b.k(ec0Var));
        c10.f4632l.f4616e = true;
        c10.y(AndroidUtilities.dp(8.0f));
        c10.z(AndroidUtilities.dp(16.0f));
        gc0Var.setBackground(c10);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f27359e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f27359e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f27359e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f27359e.f26791a.size() - 1;
            }
        }
        this.f27360f.setAdapter(new kb0(this, context));
        this.f27360f.setPosition(i12);
        this.f27359e.setSelectedTab(i12);
        addView(this.f27359e, w7.z5.e(-1, 66, 87));
        addView(this.f27360f, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f27359e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ic0 ic0Var = ic0.this;
                ic0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    ic0Var.a(true);
                }
                return true;
            }
        });
        this.f27363s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(ji.n.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f27363s) {
            this.f27363s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(ji.n.V).setListener(new da(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f27360f.f26733e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof cc0) {
                    cc0 cc0Var = (cc0) view;
                    if (cc0Var.f25316a == 0) {
                        cc0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.el elVar = (org.telegram.ui.el) this;
            org.telegram.ui.yn ynVar = elVar.H;
            ynVar.Ca = null;
            ynVar.d7();
            MessagePreviewParams messagePreviewParams = ynVar.f43307d5;
            if (messagePreviewParams != null) {
                if (ynVar.f43381j5 == null) {
                    ynVar.f43381j5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    ynVar.f43381j5 = null;
                }
                org.telegram.ui.on onVar = ynVar.f43381j5;
                if (onVar != null) {
                    onVar.f39240f = false;
                    onVar.f39237b = messagePreviewParams.quoteStart;
                    onVar.f39238c = messagePreviewParams.quoteEnd;
                    onVar.e();
                    if (ynVar.f43411lb == 2) {
                        ynVar.Bb(ynVar.f43405l5, ynVar.f43381j5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = ynVar.f43307d5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    ynVar.j8();
                }
            }
            if (ynVar.f43287bb && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 1), 50L);
                ynVar.f43287bb = false;
            }
            Activity parentActivity = ynVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f27356a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f27360f.f26733e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    cc0 cc0Var = (cc0) view;
                    if (cc0Var.f25316a == 1) {
                        cc0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
