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
public final class pg0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ArrayList f40475a;
    public final ArrayList f40476b;
    public final ArrayList f40477c;
    public final org.telegram.ui.Components.u8 d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final int f40478f;
    public final boolean h;
    public final org.telegram.ui.Components.zz f40479n;
    public boolean f40480r;
    public u71 f40481s;
    public int f40482w;

    public pg0(Context context, int i10, org.telegram.messenger.kj kjVar, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j10;
        this.f40475a = new ArrayList();
        this.f40476b = new ArrayList();
        this.f40477c = new ArrayList();
        this.f40478f = i10;
        if (!kjVar.h4() && !org.telegram.messenger.kj.R4(kjVar.f16690k)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        this.f40479n = zzVar;
        zzVar.e(org.telegram.ui.ActionBar.t6.G8, org.telegram.ui.ActionBar.t6.f21021i6, -1);
        zzVar.setViewType(13);
        zzVar.setIsSingleCell(false);
        addView(zzVar, w7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var;
        u5Var.setTextSize(16);
        u5Var.setEllipsizeByGradient(true);
        u5Var.setRightPadding(org.telegram.messenger.i0.L(62.0f));
        addView(u5Var, w7.b6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.d = u8Var;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
        addView(u8Var, w7.b6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = kjVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.wp.r1(i10).i1(org.telegram.messenger.kj.B0(kjVar.f16690k));
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = 2131232297;
        } else {
            i11 = 2131232355;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        u8Var.setAlpha(0.0f);
        u5Var.setAlpha(0.0f);
        TLRPC.Peer peer = kjVar.f16690k.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new org.telegram.ui.Components.o2(this, j10, i10, chat));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
        this.f40482w = x02;
        setBackground(org.telegram.ui.ActionBar.t6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.uk0 a() {
        u71 u71Var = this.f40481s;
        if (u71Var != null) {
            return u71Var;
        }
        u71 u71Var2 = new u71(8, getContext(), null);
        this.f40481s = u71Var2;
        getContext();
        u71Var2.setLayoutManager(new s4.a0());
        this.f40481s.i(new mg.u1(this, 6));
        this.f40481s.setAdapter(new kg.f(this, 6));
        return this.f40481s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.u8 u8Var;
        String str;
        ArrayList arrayList = this.f40477c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            u8Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f40478f;
            if (i10 < size) {
                u8Var.b(i10, i11, (TLObject) arrayList.get(i10));
            } else {
                u8Var.b(i10, i11, null);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            u8Var.setTranslationX(org.telegram.messenger.i0.L(24.0f));
        } else if (arrayList.size() == 2) {
            u8Var.setTranslationX(org.telegram.messenger.i0.L(12.0f));
        } else {
            u8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.i0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        u5Var.setRightPadding(L);
        u8Var.a(false);
        ArrayList arrayList2 = this.f40475a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            u5Var.l(org.telegram.messenger.i5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            u5Var.l(org.telegram.messenger.dd.L0(2131748140, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            u5Var.l(org.telegram.messenger.dd.G(arrayList2.size(), str, new Object[0]), false);
        }
        u5Var.animate().alpha(1.0f).setDuration(220L).start();
        u8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.zz zzVar = this.f40479n;
        zzVar.animate().alpha(0.0f).setDuration(220L).setListener(new eg.m(zzVar)).start();
        u71 u71Var = this.f40481s;
        if (u71Var != null) {
            u71Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f40480r = true;
        org.telegram.ui.Components.zz zzVar = this.f40479n;
        if (zzVar.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        u5Var.setVisibility(8);
        if (z10) {
            zzVar.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            zzVar.getLayoutParams().width = getMeasuredWidth();
            zzVar.setVisibility(0);
        }
        u5Var.setVisibility(0);
        u5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.i0.L(40.0f);
        this.f40480r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40480r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
            if (getBackground() != null && x02 != this.f40482w) {
                this.f40482w = x02;
                org.telegram.ui.ActionBar.t6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
