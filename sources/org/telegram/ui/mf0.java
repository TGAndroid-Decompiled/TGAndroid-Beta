package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mf0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ArrayList f49866a;
    public final ArrayList f49867b;
    public final ArrayList f49868c;
    public final org.telegram.ui.Components.e9 d;
    public final org.telegram.ui.ActionBar.m5 f49869e;
    public final int f49870f;
    public final boolean h;
    public final org.telegram.ui.Components.yz f49871n;
    public boolean f49872r;
    public f61 f49873s;
    public int f49874w;

    public mf0(Context context, int i7, org.telegram.messenger.fj fjVar, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i10;
        long j3;
        this.f49866a = new ArrayList();
        this.f49867b = new ArrayList();
        this.f49868c = new ArrayList();
        this.f49870f = i7;
        if (!fjVar.h4() && !org.telegram.messenger.fj.R4(fjVar.f23993k)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.f49871n = yzVar;
        yzVar.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.f29470i6, -1);
        yzVar.setViewType(13);
        yzVar.setIsSingleCell(false);
        addView(yzVar, c8.ma.c(-1.0f, -2));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f49869e = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(m5Var, c8.ma.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.d = e9Var;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(e9Var, c8.ma.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = fjVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.fj.B0(fjVar.f23993k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ma.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i10 = 2131232300;
        } else {
            i10 = 2131232358;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        e9Var.setAlpha(0.0f);
        m5Var.setAlpha(0.0f);
        TLRPC.Peer peer = fjVar.f23993k.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.v(this, j3, i7, chat));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false);
        this.f49874w = x02;
        setBackground(org.telegram.ui.ActionBar.m6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.ek0 a() {
        f61 f61Var = this.f49873s;
        if (f61Var != null) {
            return f61Var;
        }
        f61 f61Var2 = new f61(11, getContext(), null);
        this.f49873s = f61Var2;
        getContext();
        f61Var2.setLayoutManager(new v4.c0());
        this.f49873s.i(new ai.j0(this, 6));
        this.f49873s.setAdapter(new di.l4(this, 7));
        return this.f49873s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.e9 e9Var;
        String str;
        ArrayList arrayList = this.f49868c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i7 = 0;
        while (true) {
            e9Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f49870f;
            if (i7 < size) {
                e9Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                e9Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            e9Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            e9Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            e9Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.m5 m5Var = this.f49869e;
        m5Var.setRightPadding(L);
        e9Var.a(false);
        ArrayList arrayList2 = this.f49866a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            m5Var.l(org.telegram.messenger.i5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            m5Var.l(org.telegram.messenger.gd.N0(2131747931, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            m5Var.l(org.telegram.messenger.gd.G(arrayList2.size(), str, new Object[0]), false);
        }
        m5Var.animate().alpha(1.0f).setDuration(220L).start();
        e9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.yz yzVar = this.f49871n;
        yzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(yzVar)).start();
        f61 f61Var = this.f49873s;
        if (f61Var != null) {
            f61Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f49872r = true;
        org.telegram.ui.Components.yz yzVar = this.f49871n;
        if (yzVar.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.m5 m5Var = this.f49869e;
        m5Var.setVisibility(8);
        if (z10) {
            yzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z10) {
            yzVar.getLayoutParams().width = getMeasuredWidth();
            yzVar.setVisibility(0);
        }
        m5Var.setVisibility(0);
        m5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.f49872r = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f49872r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false);
            if (getBackground() != null && x02 != this.f49874w) {
                this.f49874w = x02;
                org.telegram.ui.ActionBar.m6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
