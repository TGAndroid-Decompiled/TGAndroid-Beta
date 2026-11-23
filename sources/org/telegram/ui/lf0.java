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
public final class lf0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ArrayList f49744a;
    public final ArrayList f49745b;
    public final ArrayList f49746c;
    public final org.telegram.ui.Components.d9 d;
    public final org.telegram.ui.ActionBar.n5 f49747e;
    public final int f49748f;
    public final boolean h;
    public final org.telegram.ui.Components.vz f49749n;
    public boolean f49750r;
    public d61 f49751s;
    public int f49752w;

    public lf0(Context context, int i7, org.telegram.messenger.fj fjVar, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i10;
        long j3;
        this.f49744a = new ArrayList();
        this.f49745b = new ArrayList();
        this.f49746c = new ArrayList();
        this.f49748f = i7;
        if (!fjVar.h4() && !org.telegram.messenger.fj.R4(fjVar.f24073k)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f49749n = vzVar;
        vzVar.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.f29543i6, -1);
        vzVar.setViewType(13);
        vzVar.setIsSingleCell(false);
        addView(vzVar, c8.na.c(-1.0f, -2));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f49747e = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(n5Var, c8.na.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.d = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(d9Var, c8.na.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = fjVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.fj.B0(fjVar.f24073k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.na.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i10 = 2131232303;
        } else {
            i10 = 2131232361;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        d9Var.setAlpha(0.0f);
        n5Var.setAlpha(0.0f);
        TLRPC.Peer peer = fjVar.f24073k.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.v(this, j3, i7, chat));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false);
        this.f49752w = x02;
        setBackground(org.telegram.ui.ActionBar.n6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.ek0 a() {
        d61 d61Var = this.f49751s;
        if (d61Var != null) {
            return d61Var;
        }
        d61 d61Var2 = new d61(11, getContext(), null);
        this.f49751s = d61Var2;
        getContext();
        d61Var2.setLayoutManager(new v4.c0());
        this.f49751s.i(new ai.f0(this, 6));
        this.f49751s.setAdapter(new di.l4(this, 7));
        return this.f49751s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.d9 d9Var;
        String str;
        ArrayList arrayList = this.f49746c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i7 = 0;
        while (true) {
            d9Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f49748f;
            if (i7 < size) {
                d9Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                d9Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            d9Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            d9Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            d9Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.n5 n5Var = this.f49747e;
        n5Var.setRightPadding(L);
        d9Var.a(false);
        ArrayList arrayList2 = this.f49744a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            n5Var.l(org.telegram.messenger.i5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            n5Var.l(org.telegram.messenger.gd.N0(2131747931, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            n5Var.l(org.telegram.messenger.gd.G(arrayList2.size(), str, new Object[0]), false);
        }
        n5Var.animate().alpha(1.0f).setDuration(220L).start();
        d9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.vz vzVar = this.f49749n;
        vzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(vzVar)).start();
        d61 d61Var = this.f49751s;
        if (d61Var != null) {
            d61Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f49750r = true;
        org.telegram.ui.Components.vz vzVar = this.f49749n;
        if (vzVar.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f49747e;
        n5Var.setVisibility(8);
        if (z10) {
            vzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z10) {
            vzVar.getLayoutParams().width = getMeasuredWidth();
            vzVar.setVisibility(0);
        }
        n5Var.setVisibility(0);
        n5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.f49750r = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f49750r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false);
            if (getBackground() != null && x02 != this.f49752w) {
                this.f49752w = x02;
                org.telegram.ui.ActionBar.n6.H1(getBackground(), x02, true);
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
