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
public final class bk extends pi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public final vj E;
    public final xj F;
    public final pz G;
    public final wi H;
    public final ti I;
    public sj J;
    public boolean K;
    public final le.c f22963n;
    public final FrameLayout f22964r;
    public final ai.w0 f22965s;
    public final hg.g0 v;
    public final HashMap f22966w;
    public final ArrayList f22967x;
    public boolean f22968y;

    public bk(Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        this.f22963n = new le.c(0, this, tr.h, 380L, false);
        this.f22966w = new HashMap();
        this.f22967x = new ArrayList();
        this.f22968y = false;
        this.F = new xj(this, context);
        wi wiVar = new wi(context, org.telegram.ui.ActionBar.h6.f19076d6, d6Var);
        this.H = wiVar;
        wiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22964r = frameLayout;
        ti tiVar = new ti(context, d6Var, this.f27362b);
        this.I = tiVar;
        tiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ci.h2 h2Var = tiVar.f24137r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new pj(this));
        frameLayout.addView(wiVar, w7.y5.g());
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(tiVar, d);
        pz pzVar = new pz(context, d6Var);
        this.G = pzVar;
        pzVar.c();
        pzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(pzVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 12);
        this.f22965s = w0Var;
        this.f27363c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f27364f = true;
        w0Var.s1();
        w0Var.setClipToPadding(false);
        getContext();
        hg.g0 g0Var = new hg.g0(this, AndroidUtilities.dp(9.0f), w0Var, 1);
        this.v = g0Var;
        w0Var.setLayoutManager(g0Var);
        g0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        vj vjVar = new vj(this, context);
        this.E = vjVar;
        w0Var.setAdapter(vjVar);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, this.f27361a));
        w0Var.setOnItemClickListener(new ai.n6(10, this, d6Var));
        w0Var.setOnScrollListener(new ai.r(this, 18));
        w0Var.setOnItemLongClickListener(new nj(this));
        FrameLayout.LayoutParams e = w7.y5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f27362b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f22965s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            jl0 jl0Var = (jl0) w0Var.G(childAt);
            if (jl0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (jl0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        if (i10 == 0) {
            wi wiVar = this.H;
            wiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            wiVar.setVisibility(i11);
        }
    }

    @Override
    public final void E(pi piVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f22965s.y0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f22966w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f22968y) {
            return false;
        }
        this.f22968y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f22967x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((rj) obj)));
        }
        xi xiVar = this.f27362b;
        return e5.b0(xiVar.J1, xiVar.n1(), xiVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                bk bkVar = bk.this;
                sj sjVar = bkVar.J;
                xi xiVar2 = bkVar.f27362b;
                String obj3 = xiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                sjVar.b(arrayList, obj3, z10, i10, j3, z11);
                xiVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(ak akVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f22966w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27361a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
            a2Var.R = string;
            a2Var.T = formatString;
            org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        rj a2 = rj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f22967x;
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
        qp qpVar = akVar.d;
        if (qpVar.getVisibility() != 0) {
            qpVar.setVisibility(0);
        }
        qpVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f27362b.V1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bk.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z10;
        int i10 = 0;
        if (this.f22965s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.G.setVisibility(i10);
        O();
    }

    public final void O() {
        View childAt;
        pz pzVar = this.G;
        if (pzVar.getVisibility() != 0 || (childAt = this.f22965s.getChildAt(0)) == null) {
            return;
        }
        pzVar.setTranslationY((childAt.getTop() + (pzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vj vjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (vjVar = this.E) != null) {
            vjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f22965s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        jl0 jl0Var = (jl0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && jl0Var != null && jl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.c cVar = this.f22963n;
        if (top >= 0 && jl0Var != null && jl0Var.b() == 0) {
            cVar.a(false, true);
        } else {
            cVar.a(true, true);
            top = i10;
        }
        this.f22964r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f22965s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f22966w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f22967x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(M(hashMap.get((rj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f22966w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        y6 y6Var = new y6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f19147h6));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.w0 w0Var = this.f22965s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
        int i11 = org.telegram.ui.ActionBar.h6.f19314q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{ak.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{ak.class}, new String[]{"statusTextView"}, null, null, -1, y6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{ak.class}, null, org.telegram.ui.ActionBar.h6.f19327r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f27362b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(sj sjVar) {
        this.J = sjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27362b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ti tiVar = this.I;
        if (tiVar != null) {
            tiVar.setupBlurredBackground(cVar.c(tiVar, eh.b.a(this.f27361a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        xi xiVar = this.f27362b;
        if (xiVar.f30307r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            xiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    xiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            xiVar.setAllowNestedScroll(true);
        }
        this.f22965s.r1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
