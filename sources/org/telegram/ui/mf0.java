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
    public final ArrayList f49848a;
    public final ArrayList f49849b;
    public final ArrayList f49850c;
    public final org.telegram.ui.Components.e9 d;
    public final org.telegram.ui.ActionBar.n5 f49851e;
    public final int f49852f;
    public final boolean h;
    public final org.telegram.ui.Components.wz f49853n;
    public boolean f49854r;
    public f61 f49855s;
    public int f49856w;

    public mf0(Context context, int i7, org.telegram.messenger.fj fjVar, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i10;
        long j3;
        this.f49848a = new ArrayList();
        this.f49849b = new ArrayList();
        this.f49850c = new ArrayList();
        this.f49852f = i7;
        if (!fjVar.h4() && !org.telegram.messenger.fj.R4(fjVar.f23968k)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        this.f49853n = wzVar;
        wzVar.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.f29488i6, -1);
        wzVar.setViewType(13);
        wzVar.setIsSingleCell(false);
        addView(wzVar, c8.ma.c(-1.0f, -2));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f49851e = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(n5Var, c8.ma.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.d = e9Var;
        e9Var.setStyle(11);
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(e9Var, c8.ma.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = fjVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.fj.B0(fjVar.f23968k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ma.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i10 = 2131232300;
        } else {
            i10 = 2131232358;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        e9Var.setAlpha(0.0f);
        n5Var.setAlpha(0.0f);
        TLRPC.Peer peer = fjVar.f23968k.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.v(this, j3, i7, chat));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false);
        this.f49856w = x02;
        setBackground(org.telegram.ui.ActionBar.n6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.ck0 a() {
        f61 f61Var = this.f49855s;
        if (f61Var != null) {
            return f61Var;
        }
        f61 f61Var2 = new f61(11, getContext(), null);
        this.f49855s = f61Var2;
        getContext();
        f61Var2.setLayoutManager(new v4.c0());
        this.f49855s.i(new ai.i0(this, 6));
        this.f49855s.setAdapter(new di.l4(this, 7));
        return this.f49855s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.e9 e9Var;
        String str;
        ArrayList arrayList = this.f49850c;
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
            int i10 = this.f49852f;
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
        org.telegram.ui.ActionBar.n5 n5Var = this.f49851e;
        n5Var.setRightPadding(L);
        e9Var.a(false);
        ArrayList arrayList2 = this.f49848a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            n5Var.l(org.telegram.messenger.i5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            n5Var.l(org.telegram.messenger.gd.M0(2131747932, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            n5Var.l(org.telegram.messenger.gd.G(arrayList2.size(), str, new Object[0]), false);
        }
        n5Var.animate().alpha(1.0f).setDuration(220L).start();
        e9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.wz wzVar = this.f49853n;
        wzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(wzVar)).start();
        f61 f61Var = this.f49855s;
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
        this.f49854r = true;
        org.telegram.ui.Components.wz wzVar = this.f49853n;
        if (wzVar.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f49851e;
        n5Var.setVisibility(8);
        if (z10) {
            wzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z10) {
            wzVar.getLayoutParams().width = getMeasuredWidth();
            wzVar.setVisibility(0);
        }
        n5Var.setVisibility(0);
        n5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.f49854r = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f49854r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false);
            if (getBackground() != null && x02 != this.f49856w) {
                this.f49856w = x02;
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
