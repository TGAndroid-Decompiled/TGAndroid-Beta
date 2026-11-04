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
public final class df0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ArrayList f44675a;
    public final ArrayList f44676b;
    public final ArrayList f44677c;
    public final org.telegram.ui.Components.x8 d;
    public final org.telegram.ui.ActionBar.k5 f44678e;
    public final int f44679f;
    public final boolean h;
    public final org.telegram.ui.Components.iz f44680n;
    public boolean f44681r;
    public u51 f44682s;
    public int f44683w;

    public df0(Context context, int i3, org.telegram.messenger.zi ziVar, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i10;
        long j10;
        this.f44675a = new ArrayList();
        this.f44676b = new ArrayList();
        this.f44677c = new ArrayList();
        this.f44679f = i3;
        if (!ziVar.i4() && !org.telegram.messenger.zi.S4(ziVar.f26868k)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.f44680n = izVar;
        izVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f27972i6, -1);
        izVar.setViewType(13);
        izVar.setIsSingleCell(false);
        addView(izVar, b8.mf.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f44678e = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(k5Var, b8.mf.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false);
        this.d = x8Var;
        x8Var.setStyle(11);
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(x8Var, b8.mf.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ziVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.hp.s1(i3).j1(org.telegram.messenger.zi.B0(ziVar.f26868k));
        ImageView imageView = new ImageView(context);
        addView(imageView, b8.mf.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i10 = 2131232298;
        } else {
            i10 = 2131232356;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        x8Var.setAlpha(0.0f);
        k5Var.setAlpha(0.0f);
        TLRPC.Peer peer = ziVar.f26868k.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getMessageReadParticipants, new ci.x(this, j10, i3, chat));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
        this.f44683w = x02;
        setBackground(org.telegram.ui.ActionBar.k6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.tj0 a() {
        u51 u51Var = this.f44682s;
        if (u51Var != null) {
            return u51Var;
        }
        u51 u51Var2 = new u51(10, getContext(), null);
        this.f44682s = u51Var2;
        getContext();
        u51Var2.setLayoutManager(new u4.b0());
        this.f44682s.i(new gi.o1(this, 5));
        this.f44682s.setAdapter(new ci.r4(this, 6));
        return this.f44682s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.x8 x8Var;
        String str;
        ArrayList arrayList = this.f44677c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i3 = 0;
        while (true) {
            x8Var = this.d;
            if (i3 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f44679f;
            if (i3 < size) {
                x8Var.b(i3, i10, (TLObject) arrayList.get(i3));
            } else {
                x8Var.b(i3, i10, null);
            }
            i3++;
        }
        if (arrayList.size() == 1) {
            x8Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            x8Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            x8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.k5 k5Var = this.f44678e;
        k5Var.setRightPadding(L);
        x8Var.a(false);
        ArrayList arrayList2 = this.f44675a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            k5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            k5Var.l(org.telegram.messenger.bd.M0(2131748132, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            k5Var.l(org.telegram.messenger.bd.G(arrayList2.size(), str, new Object[0]), false);
        }
        k5Var.animate().alpha(1.0f).setDuration(220L).start();
        x8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.iz izVar = this.f44680n;
        izVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(izVar)).start();
        u51 u51Var = this.f44682s;
        if (u51Var != null) {
            u51Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f44681r = true;
        org.telegram.ui.Components.iz izVar = this.f44680n;
        if (izVar.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f44678e;
        k5Var.setVisibility(8);
        if (z10) {
            izVar.setVisibility(8);
        }
        super.onMeasure(i3, i10);
        if (z10) {
            izVar.getLayoutParams().width = getMeasuredWidth();
            izVar.setVisibility(0);
        }
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.f44681r = false;
        super.onMeasure(i3, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f44681r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (getBackground() != null && x02 != this.f44683w) {
                this.f44683w = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
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
