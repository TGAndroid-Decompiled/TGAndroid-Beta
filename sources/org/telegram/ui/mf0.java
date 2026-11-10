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
public final class mf0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ArrayList f47941a;
    public final ArrayList f47942b;
    public final ArrayList f47943c;
    public final org.telegram.ui.Components.y8 d;
    public final org.telegram.ui.ActionBar.m5 f47944e;
    public final int f47945f;
    public final boolean h;
    public final org.telegram.ui.Components.lz f47946n;
    public boolean f47947r;
    public g61 f47948s;
    public int f47949w;

    public mf0(Context context, int i7, org.telegram.messenger.ij ijVar, TLRPC.Chat chat) {
        super(context);
        boolean z9;
        int i10;
        long j3;
        this.f47941a = new ArrayList();
        this.f47942b = new ArrayList();
        this.f47943c = new ArrayList();
        this.f47945f = i7;
        if (!ijVar.h4() && !org.telegram.messenger.ij.R4(ijVar.f23266k)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.h = z9;
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.f47946n = lzVar;
        lzVar.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.f27982i6, -1);
        lzVar.setViewType(13);
        lzVar.setIsSingleCell(false);
        addView(lzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f47944e = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(m5Var, c8.ha.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(context, false);
        this.d = y8Var;
        y8Var.setStyle(11);
        y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(y8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ijVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.ij.B0(ijVar.f23266k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            i10 = 2131232298;
        } else {
            i10 = 2131232356;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        y8Var.setAlpha(0.0f);
        m5Var.setAlpha(0.0f);
        TLRPC.Peer peer = ijVar.f23266k.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new bi.b0(this, j3, i7, chat));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false);
        this.f47949w = x02;
        setBackground(org.telegram.ui.ActionBar.m6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.pj0 a() {
        g61 g61Var = this.f47948s;
        if (g61Var != null) {
            return g61Var;
        }
        g61 g61Var2 = new g61(11, getContext(), null);
        this.f47948s = g61Var2;
        getContext();
        g61Var2.setLayoutManager(new v4.b0());
        this.f47948s.i(new fi.o1(this, 5));
        this.f47948s.setAdapter(new bi.k5(this, 7));
        return this.f47948s;
    }

    public final void b() {
        boolean z9;
        org.telegram.ui.Components.y8 y8Var;
        String str;
        ArrayList arrayList = this.f47943c;
        if (arrayList.size() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        setEnabled(z9);
        int i7 = 0;
        while (true) {
            y8Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f47945f;
            if (i7 < size) {
                y8Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                y8Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            y8Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            y8Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            y8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.m5 m5Var = this.f47944e;
        m5Var.setRightPadding(L);
        y8Var.a(false);
        ArrayList arrayList2 = this.f47941a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            m5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            m5Var.l(org.telegram.messenger.id.M0(2131748124, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            m5Var.l(org.telegram.messenger.id.G(arrayList2.size(), str, new Object[0]), false);
        }
        m5Var.animate().alpha(1.0f).setDuration(220L).start();
        y8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.lz lzVar = this.f47946n;
        lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(lzVar)).start();
        g61 g61Var = this.f47948s;
        if (g61Var != null) {
            g61Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z9 = true;
        this.f47947r = true;
        org.telegram.ui.Components.lz lzVar = this.f47946n;
        if (lzVar.getVisibility() != 0) {
            z9 = false;
        }
        org.telegram.ui.ActionBar.m5 m5Var = this.f47944e;
        m5Var.setVisibility(8);
        if (z9) {
            lzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z9) {
            lzVar.getLayoutParams().width = getMeasuredWidth();
            lzVar.setVisibility(0);
        }
        m5Var.setVisibility(0);
        m5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.f47947r = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f47947r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false);
            if (getBackground() != null && x02 != this.f47949w) {
                this.f47949w = x02;
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
