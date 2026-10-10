package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ck extends qi implements NotificationCenter.NotificationCenterDelegate, me.d {
    public final wj E;
    public final yj F;
    public final d00 G;
    public final xi H;
    public final ui I;
    public tj J;
    public boolean K;
    public final me.b f25311n;
    public final FrameLayout f25312r;
    public final ai.w0 f25313s;
    public final hg.f0 v;
    public final HashMap f25314w;
    public final ArrayList f25315x;
    public boolean f25316y;

    public ck(Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context, e6Var, yiVar);
        this.f25311n = new me.b(0, this, is.h, 380L, false);
        this.f25314w = new HashMap();
        this.f25315x = new ArrayList();
        this.f25316y = false;
        this.F = new yj(this, context);
        xi xiVar = new xi(context, org.telegram.ui.ActionBar.i6.f20801d6, e6Var);
        this.H = xiVar;
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25312r = frameLayout;
        ui uiVar = new ui(context, e6Var, this.f30211b);
        this.I = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ci.g2 g2Var = uiVar.f30958r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new qj(this));
        frameLayout.addView(xiVar, w7.x5.g());
        FrameLayout.LayoutParams a2 = w7.x5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, a2);
        d00 d00Var = new d00(context, e6Var);
        this.G = d00Var;
        d00Var.c();
        d00Var.setText(LocaleController.getString(R.string.NoContacts));
        addView(d00Var, w7.x5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 12);
        this.f25313s = w0Var;
        this.f30212c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f30214f = true;
        w0Var.p1();
        w0Var.setClipToPadding(false);
        getContext();
        hg.f0 f0Var = new hg.f0(this, AndroidUtilities.dp(9.0f), w0Var, 1);
        this.v = f0Var;
        w0Var.setLayoutManager(f0Var);
        f0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        wj wjVar = new wj(this, context);
        this.E = wjVar;
        w0Var.setAdapter(wjVar);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A5, this.f30210a));
        w0Var.setOnItemClickListener(new ai.o6(10, this, e6Var));
        w0Var.setOnScrollListener(new ai.r(this, 18));
        w0Var.setOnItemLongClickListener(new oj(this));
        FrameLayout.LayoutParams e7 = w7.x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        NotificationCenter.getInstance(this.f30211b.M1).addObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f25313s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            bm0 bm0Var = (bm0) w0Var.G(childAt);
            if (bm0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (bm0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void C(int i10, int i11) {
        int i12;
        yi yiVar = this.f30211b;
        if (yiVar.f33282u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            yiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    yiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            yiVar.setAllowNestedScroll(true);
        }
        this.f25313s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f30213e);
    }

    @Override
    public final void G(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f25313s.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f25314w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f25316y) {
            return false;
        }
        this.f25316y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f25315x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((sj) obj)));
        }
        yi yiVar = this.f30211b;
        return g5.a0(yiVar.M1, yiVar.p1(), yiVar.l1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                ck ckVar = ck.this;
                tj tjVar = ckVar.J;
                yi yiVar2 = ckVar.f30211b;
                String obj3 = yiVar2.o1().getText().toString();
                ((Long) obj2).getClass();
                tjVar.b(arrayList, obj3, z10, i10, j3, z11);
                yiVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(bk bkVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f25314w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30210a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
            b2Var.R = string;
            b2Var.T = formatString;
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        sj a2 = sj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f25315x;
        int i10 = 1;
        if (containsKey) {
            hashMap.remove(a2);
            arrayList.remove(a2);
            z10 = false;
        } else {
            hashMap.put(a2, obj);
            arrayList.add(a2);
            z10 = true;
        }
        dq dqVar = bkVar.d;
        if (dqVar.getVisibility() != 0) {
            dqVar.setVisibility(0);
        }
        dqVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f30211b.Z1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 P(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ck.P(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void Q() {
        boolean z10;
        int i10 = 0;
        if (this.f25313s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.G.setVisibility(i10);
        R();
    }

    public final void R() {
        View childAt;
        d00 d00Var = this.G;
        if (d00Var.getVisibility() != 0 || (childAt = this.f25313s.getChildAt(0)) == null) {
            return;
        }
        d00Var.setTranslationY((childAt.getTop() + (d00Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wj wjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (wjVar = this.E) != null) {
            wjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f25313s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        bm0 bm0Var = (bm0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && bm0Var != null && bm0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        me.b bVar = this.f25311n;
        if (top >= 0 && bm0Var != null && bm0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f25312r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25313s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f25314w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f25315x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((sj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f25314w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        a7 a7Var = new a7(this, 1);
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20785c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20873h6));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        ai.w0 w0Var = this.f25313s;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20923k0, null, null, org.telegram.ui.ActionBar.i6.f20802d7));
        int i11 = org.telegram.ui.ActionBar.i6.f21040q5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{bk.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{bk.class}, new String[]{"statusTextView"}, null, null, -1, a7Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{bk.class}, null, org.telegram.ui.ActionBar.i6.f21053r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.U7));
        return arrayList;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        if (i10 == 0) {
            xi xiVar = this.H;
            xiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            xiVar.setVisibility(i11);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    @Override
    public final void p() {
        NotificationCenter.getInstance(this.f30211b.M1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    public void setDelegate(tj tjVar) {
        this.J = tjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30211b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ui uiVar = this.I;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(cVar.c(uiVar, eh.b.a(this.f30210a), false));
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
