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
public abstract class rb0 extends FrameLayout {
    public final ArrayList A;
    public final nb0 B;
    public final lg.a C;
    public TLRPC.Peer f32249a;
    public final boolean f32250b;
    public final org.telegram.ui.tn f32251c;
    public final MessagePreviewParams d;
    public final pb0 f32252e;
    public final sa0 f32253f;
    public ValueAnimator h;
    public final TLRPC.User f32254n;
    public final TLRPC.Chat f32255r;
    public boolean f32256s;
    public boolean v;
    public final int f32257w;
    public boolean f32258x;
    public final lh.m7 f32259y;

    public rb0(Context context, org.telegram.ui.tn tnVar, lg.a aVar, MessagePreviewParams messagePreviewParams, TLRPC.User user, TLRPC.Chat chat, int i10, nb0 nb0Var, int i11, final boolean z10) {
        super(context);
        this.f32259y = new lh.m7(this, 26);
        this.A = new ArrayList(10);
        this.f32250b = z10;
        this.f32251c = tnVar;
        this.f32257w = i10;
        this.C = aVar;
        this.f32254n = user;
        this.f32255r = chat;
        this.d = messagePreviewParams;
        this.B = nb0Var;
        this.f32253f = new sa0(this, context, nb0Var);
        pb0 pb0Var = new pb0(context, nb0Var);
        this.f32252e = pb0Var;
        ng.d c3 = aVar.c(pb0Var, null, false);
        c3.n(pg.a.j(nb0Var));
        c3.h.f17329e = true;
        c3.o(AndroidUtilities.dp(8.0f));
        c3.p(AndroidUtilities.dp(16.0f));
        pb0Var.setBackground(c3);
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0 && messagePreviewParams.replyMessage != null) {
                this.f32252e.a(0, LocaleController.getString(R.string.MessageOptionsReply));
            } else if (i13 == 1 && messagePreviewParams.forwardMessages != null && !z10) {
                this.f32252e.a(1, LocaleController.getString(R.string.MessageOptionsForward));
            } else {
                if (i13 == 2 && messagePreviewParams.linkMessage != null && !z10) {
                    this.f32252e.a(2, LocaleController.getString(R.string.MessageOptionsLink));
                }
            }
            if (i13 == i11) {
                i12 = this.f32252e.f31633a.size() - 1;
            }
        }
        this.f32253f.setAdapter(new ta0(this, context));
        this.f32253f.setPosition(i12);
        this.f32252e.setSelectedTab(i12);
        addView(this.f32252e, i7.f6.e(-1, 66, 87));
        addView(this.f32253f, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 66.0f));
        this.f32252e.setOnTabClick(new y2(this, 7));
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                rb0 rb0Var = rb0.this;
                rb0Var.getClass();
                if (motionEvent.getAction() == 1 && !z10) {
                    rb0Var.a(true);
                }
                return true;
            }
        });
        this.f32256s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(uh.m.V).scaleY(1.0f);
    }

    public final void a(boolean z10) {
        int i10;
        if (this.f32256s) {
            this.f32256s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(uh.m.V).setListener(new z9(14, this, z10));
            int i11 = 0;
            while (true) {
                View[] viewArr = this.f32253f.f35261e;
                if (i11 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i11];
                if (view instanceof lb0) {
                    lb0 lb0Var = (lb0) view;
                    if (lb0Var.f30273a == 0) {
                        lb0Var.j();
                        break;
                    }
                }
                i11++;
            }
            org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this;
            org.telegram.ui.tn tnVar = zkVar.D;
            tnVar.Aa = null;
            tnVar.d7();
            MessagePreviewParams messagePreviewParams = tnVar.f42755b5;
            if (messagePreviewParams != null) {
                if (tnVar.f42831h5 == null) {
                    tnVar.f42831h5 = messagePreviewParams.quote;
                }
                if (messagePreviewParams.quote == null) {
                    tnVar.f42831h5 = null;
                }
                org.telegram.ui.jn jnVar = tnVar.f42831h5;
                if (jnVar != null) {
                    jnVar.f39594f = false;
                    jnVar.f39591b = messagePreviewParams.quoteStart;
                    jnVar.f39592c = messagePreviewParams.quoteEnd;
                    jnVar.e();
                    if (tnVar.f42874kb == 2) {
                        tnVar.Cb(tnVar.f42856j5, tnVar.f42831h5);
                    }
                } else {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    MessagePreviewParams.Messages messages = tnVar.f42755b5.forwardMessages;
                    if (messages != null) {
                        messages.getSelectedMessages(arrayList);
                    }
                    tnVar.j8();
                }
            }
            if (tnVar.f42747ab && z10) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yk(zkVar, 1), 50L);
                tnVar.f42747ab = false;
            }
            Activity parentActivity = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
    }

    public abstract void b();

    public abstract void c(boolean z10);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.f32249a = peer;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.f32253f.f35261e;
            if (i10 < viewArr.length) {
                View view = viewArr[i10];
                if (view != null) {
                    lb0 lb0Var = (lb0) view;
                    if (lb0Var.f30273a == 1) {
                        lb0Var.h();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
