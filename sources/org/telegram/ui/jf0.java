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
public final class jf0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ArrayList f46950a;
    public final ArrayList f46951b;
    public final ArrayList f46952c;
    public final org.telegram.ui.Components.z8 d;
    public final org.telegram.ui.ActionBar.k5 f46953e;
    public final int f46954f;
    public final boolean h;
    public final org.telegram.ui.Components.lz f46955n;
    public boolean f46956r;
    public e61 f46957s;
    public int f46958w;

    public jf0(Context context, int i7, org.telegram.messenger.ij ijVar, TLRPC.Chat chat) {
        super(context);
        boolean z9;
        int i10;
        long j3;
        this.f46950a = new ArrayList();
        this.f46951b = new ArrayList();
        this.f46952c = new ArrayList();
        this.f46954f = i7;
        if (!ijVar.i4() && !org.telegram.messenger.ij.S4(ijVar.f23237k)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.h = z9;
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.f46955n = lzVar;
        lzVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f27940i6, -1);
        lzVar.setViewType(13);
        lzVar.setIsSingleCell(false);
        addView(lzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f46953e = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(k5Var, c8.ha.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.d = z8Var;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(z8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ijVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.ij.B0(ijVar.f23237k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            i10 = 2131232298;
        } else {
            i10 = 2131232356;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        z8Var.setAlpha(0.0f);
        k5Var.setAlpha(0.0f);
        TLRPC.Peer peer = ijVar.f23237k.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new bi.b0(this, j3, i7, chat));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
        this.f46958w = x02;
        setBackground(org.telegram.ui.ActionBar.k6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.pj0 a() {
        e61 e61Var = this.f46957s;
        if (e61Var != null) {
            return e61Var;
        }
        e61 e61Var2 = new e61(11, getContext(), null);
        this.f46957s = e61Var2;
        getContext();
        e61Var2.setLayoutManager(new v4.b0());
        this.f46957s.i(new fi.o1(this, 5));
        this.f46957s.setAdapter(new bi.k5(this, 7));
        return this.f46957s;
    }

    public final void b() {
        boolean z9;
        org.telegram.ui.Components.z8 z8Var;
        String str;
        ArrayList arrayList = this.f46952c;
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
            int i10 = this.f46954f;
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
        org.telegram.ui.ActionBar.k5 k5Var = this.f46953e;
        k5Var.setRightPadding(L);
        z8Var.a(false);
        ArrayList arrayList2 = this.f46950a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            k5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            k5Var.l(org.telegram.messenger.hd.M0(2131748123, null), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            k5Var.l(org.telegram.messenger.hd.G(arrayList2.size(), str, new Object[0]), false);
        }
        k5Var.animate().alpha(1.0f).setDuration(220L).start();
        z8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.lz lzVar = this.f46955n;
        lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(lzVar)).start();
        e61 e61Var = this.f46957s;
        if (e61Var != null) {
            e61Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z9 = true;
        this.f46956r = true;
        org.telegram.ui.Components.lz lzVar = this.f46955n;
        if (lzVar.getVisibility() != 0) {
            z9 = false;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.f46953e;
        k5Var.setVisibility(8);
        if (z9) {
            lzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z9) {
            lzVar.getLayoutParams().width = getMeasuredWidth();
            lzVar.setVisibility(0);
        }
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.f46956r = false;
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f46956r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (getBackground() != null && x02 != this.f46958w) {
                this.f46958w = x02;
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
