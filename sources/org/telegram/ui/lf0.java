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
public final class lf0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ArrayList f47590a;
    public final ArrayList f47591b;
    public final ArrayList f47592c;
    public final org.telegram.ui.Components.z8 d;
    public final org.telegram.ui.ActionBar.l5 f47593e;
    public final int f47594f;
    public final boolean h;
    public final org.telegram.ui.Components.mz f47595n;
    public boolean f47596r;
    public f61 f47597s;
    public int f47598w;

    public lf0(Context context, int i7, org.telegram.messenger.ij ijVar, TLRPC.Chat chat) {
        super(context);
        boolean z9;
        int i10;
        long j3;
        this.f47590a = new ArrayList();
        this.f47591b = new ArrayList();
        this.f47592c = new ArrayList();
        this.f47594f = i7;
        if (!ijVar.h4() && !org.telegram.messenger.ij.R4(ijVar.f23262k)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.h = z9;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f47595n = mzVar;
        mzVar.e(org.telegram.ui.ActionBar.l6.G8, org.telegram.ui.ActionBar.l6.f27957i6, -1);
        mzVar.setViewType(13);
        mzVar.setIsSingleCell(false);
        addView(mzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f47593e = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(l5Var, c8.ha.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.d = z8Var;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(z8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ijVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.ij.B0(ijVar.f23262k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            i10 = 2131232298;
        } else {
            i10 = 2131232356;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        org.telegram.ui.ActionBar.s6.x(this, mutate, org.telegram.ui.ActionBar.l6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        z8Var.setAlpha(0.0f);
        l5Var.setAlpha(0.0f);
        TLRPC.Peer peer = ijVar.f23262k.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new bi.b0(this, j3, i7, chat));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.I5, false);
        this.f47598w = x02;
        setBackground(org.telegram.ui.ActionBar.l6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.qj0 a() {
        f61 f61Var = this.f47597s;
        if (f61Var != null) {
            return f61Var;
        }
        f61 f61Var2 = new f61(11, getContext(), null);
        this.f47597s = f61Var2;
        getContext();
        f61Var2.setLayoutManager(new v4.b0());
        this.f47597s.i(new fi.o1(this, 5));
        this.f47597s.setAdapter(new bi.k5(this, 7));
        return this.f47597s;
    }

    public final void b() {
        boolean z9;
        org.telegram.ui.Components.z8 z8Var;
        String str;
        ArrayList arrayList = this.f47592c;
        if (arrayList.size() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        setEnabled(z9);
        int i7 = 0;
        while (true) {
            z8Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f47594f;
            if (i7 < size) {
                z8Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                z8Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            z8Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            z8Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            z8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.l5 l5Var = this.f47593e;
        l5Var.setRightPadding(L);
        z8Var.a(false);
        ArrayList arrayList2 = this.f47590a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            l5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            l5Var.l(org.telegram.messenger.id.M0(2131748124, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            l5Var.l(org.telegram.messenger.id.G(arrayList2.size(), str, new Object[0]), false);
        }
        l5Var.animate().alpha(1.0f).setDuration(220L).start();
        z8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.mz mzVar = this.f47595n;
        mzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(mzVar)).start();
        f61 f61Var = this.f47597s;
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
        boolean z9 = true;
        this.f47596r = true;
        org.telegram.ui.Components.mz mzVar = this.f47595n;
        if (mzVar.getVisibility() != 0) {
            z9 = false;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f47593e;
        l5Var.setVisibility(8);
        if (z9) {
            mzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z9) {
            mzVar.getLayoutParams().width = getMeasuredWidth();
            mzVar.setVisibility(0);
        }
        l5Var.setVisibility(0);
        l5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.f47596r = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f47596r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.I5, false);
            if (getBackground() != null && x02 != this.f47598w) {
                this.f47598w = x02;
                org.telegram.ui.ActionBar.l6.H1(getBackground(), x02, true);
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
