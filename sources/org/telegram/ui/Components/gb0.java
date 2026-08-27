package org.telegram.ui.Components;

import android.animation.ValueAnimator;
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

public abstract class gb0 extends FrameLayout {
    public final ArrayList A;
    public final cb0 B;
    public final jg.a C;

    public TLRPC.Peer f28580a;

    public final boolean f28581b;

    public final org.telegram.ui.rn f28582c;
    public final MessagePreviewParams d;

    public final eb0 f28583e;

    public final ia0 f28584f;
    public ValueAnimator h;

    public final TLRPC.User f28585n;

    public final TLRPC.Chat f28586r;

    public boolean f28587s;
    public boolean v;

    public final int f28588w;

    public boolean f28589x;

    public final m.i3 f28590y;

    public gb0(Context context, org.telegram.ui.rn rnVar, jg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, cb0 cb0Var, int i11, final boolean z10) {
        super(context);
        this.f28590y = new m.i3(this, 23);
        this.A = new ArrayList(10);
        this.f28581b = z10;
        this.f28582c = rnVar;
        this.f28588w = i10;
        this.C = aVar;
        this.f28585n = user;
        this.f28586r = chat;
        this.d = messagePreviewParams;
        this.B = cb0Var;
        this.f28584f = new ia0(this, context, cb0Var);
        eb0 eb0Var = new eb0(context, cb0Var);
        this.f28583e = eb0Var;
        lg.d dVarC = aVar.c(eb0Var, null, false);
        dVarC.n(ng.c.j(cb0Var));
        dVarC.h.f15583e = true;
        dVarC.o(AndroidUtilities.dp(8.0f));
        dVarC.p(AndroidUtilities.dp(16.0f));
        eb0Var.setBackground(dVarC);
        int size = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 == 0 && messagePreviewParams.replyMessage != null) {
                this.f28583e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i12 != 1 || messagePreviewParams.forwardMessages == null || z10) {
                if (i12 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f28583e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            } else {
                this.f28583e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            }
            if (i12 == i11) {
                size = this.f28583e.f28004a.size() - 1;
            }
        }
        this.f28584f.setAdapter(new ja0(this, context));
        this.f28584f.setPosition(size);
        this.f28583e.setSelectedTab(size);
        addView(this.f28583e, h7.z5.e(-1, 66, 87));
        addView(this.f28584f, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f28583e.setOnTabClick(new v2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                gb0 gb0Var = this.f28956a;
                gb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    gb0Var.a(true);
                }
                return true;
            }
        });
        this.f28587s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(sh.m.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        if (this.f28587s) {
            this.f28587s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(sh.m.V).setListener(new org.telegram.ui.go(15, this, z10));
            int i10 = 0;
            while (true) {
                View[] viewArr = this.f28584f.f31545e;
                if (i10 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i10];
                if (view instanceof ab0) {
                    ab0 ab0Var = (ab0) view;
                    if (ab0Var.f26712a == 0) {
                        ab0Var.j();
                        break;
                    }
                }
                i10++;
            }
            org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this;
            org.telegram.ui.rn rnVar = ykVar.D;
            rnVar.Aa = null;
            rnVar.d7();
            MessagePreviewParams messagePreviewParams = rnVar.f41992b5;
            if (messagePreviewParams != null) {
                if (rnVar.f42069h5 == null) {
                    rnVar.f42069h5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    rnVar.f42069h5 = null;
                }
                org.telegram.ui.hn hnVar = rnVar.f42069h5;
                if (hnVar != null) {
                    hnVar.f38865f = false;
                    hnVar.f38862b = messagePreviewParams.quoteStart;
                    hnVar.f38863c = messagePreviewParams.quoteEnd;
                    hnVar.e();
                    if (rnVar.f42114kb == 2) {
                        rnVar.Cb(rnVar.f42095j5, rnVar.f42069h5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = rnVar.f41992b5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    rnVar.j8();
                }
            }
            if (rnVar.f41984ab && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.xk(ykVar, 1), 50L);
                rnVar.f41984ab = false;
            }
            AndroidUtilities.requestAdjustResize(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f28580a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f28584f.f31545e;
            if (i10 >= viewArr.length) {
                return;
            }
            View view = viewArr[i10];
            if (view != null) {
                ab0 ab0Var = (ab0) view;
                if (ab0Var.f26712a == 1) {
                    ab0Var.h();
                }
            }
            i10++;
        }
    }
}
