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
public final class bk extends pi implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final vj E;
    public final xj F;
    public final pz G;
    public final wi H;
    public final ti I;
    public sj J;
    public boolean K;
    public final le.b f25007n;
    public final FrameLayout f25008r;
    public final ai.w0 f25009s;
    public final hg.f0 v;
    public final HashMap f25010w;
    public final ArrayList f25011x;
    public boolean f25012y;

    public bk(Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(context, d6Var, xiVar);
        this.f25007n = new le.b(0, this, tr.h, 380L, false);
        this.f25010w = new HashMap();
        this.f25011x = new ArrayList();
        this.f25012y = false;
        this.F = new xj(this, context);
        wi wiVar = new wi(context, org.telegram.ui.ActionBar.i6.f20827d6, d6Var);
        this.H = wiVar;
        wiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25008r = frameLayout;
        ti tiVar = new ti(context, d6Var, this.f29741b);
        this.I = tiVar;
        tiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ci.h2 h2Var = tiVar.f26295r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new pj(this));
        frameLayout.addView(wiVar, w7.z5.g());
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(tiVar, d);
        pz pzVar = new pz(context, d6Var);
        this.G = pzVar;
        pzVar.c();
        pzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(pzVar, w7.z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 12);
        this.f25009s = w0Var;
        setBlur3Capture(w0Var);
        this.d = w0Var;
        this.h = true;
        this.f29744f = true;
        w0Var.r1();
        w0Var.setClipToPadding(false);
        getContext();
        hg.f0 f0Var = new hg.f0(this, AndroidUtilities.dp(9.0f), w0Var, 1);
        this.v = f0Var;
        w0Var.setLayoutManager(f0Var);
        f0Var.P = false;
        w0Var.setHorizontalScrollBarEnabled(false);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setClipToPadding(false);
        addView(w0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        vj vjVar = new vj(this, context);
        this.E = vjVar;
        w0Var.setAdapter(vjVar);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A5, this.f29740a));
        w0Var.setOnItemClickListener(new ai.n6(10, this, d6Var));
        w0Var.setOnScrollListener(new ai.r(this, 19));
        w0Var.setOnItemLongClickListener(new nj(this));
        FrameLayout.LayoutParams e7 = w7.z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        NotificationCenter.getInstance(this.f29741b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        L();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f25009s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            il0 il0Var = (il0) w0Var.G(childAt);
            if (il0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (il0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void C(pi piVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void E() {
        this.f25009s.y0(0);
    }

    @Override
    public final boolean G(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f25010w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f25012y) {
            return false;
        }
        this.f25012y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f25011x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(K(hashMap.get((rj) obj)));
        }
        xi xiVar = this.f29741b;
        return e5.b0(xiVar.J1, xiVar.n1(), xiVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                bk bkVar = bk.this;
                sj sjVar = bkVar.J;
                xi xiVar2 = bkVar.f29741b;
                String obj3 = xiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                sjVar.b(arrayList, obj3, z10, i10, j3, z11);
                xiVar2.dismiss();
            }
        }, 0L);
    }

    public final void J(ak akVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f25010w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f29740a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
            b2Var.R = string;
            b2Var.T = formatString;
            org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        rj a2 = rj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f25011x;
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
        this.f29741b.U1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 K(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bk.K(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void L() {
        boolean z10;
        int i10 = 0;
        if (this.f25009s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.G.setVisibility(i10);
        M();
    }

    public final void M() {
        View childAt;
        pz pzVar = this.G;
        if (pzVar.getVisibility() != 0 || (childAt = this.f25009s.getChildAt(0)) == null) {
            return;
        }
        pzVar.setTranslationY((childAt.getTop() + (pzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vj vjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (vjVar = this.E) != null) {
            vjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f25009s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f25007n;
        if (top >= 0 && il0Var != null && il0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f25008r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25009s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f25010w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f25011x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(K(hashMap.get((rj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f25010w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        y6 y6Var = new y6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20810c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20900h6));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        ai.w0 w0Var = this.f25009s;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        int i11 = org.telegram.ui.ActionBar.i6.f21067q5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{ak.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{ak.class}, new String[]{"statusTextView"}, null, null, -1, y6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{ak.class}, null, org.telegram.ui.ActionBar.i6.f21081r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f29741b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        M();
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
        this.f29741b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        ti tiVar = this.I;
        if (tiVar != null) {
            tiVar.setupBlurredBackground(cVar.c(tiVar, eh.b.a(this.f29740a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        xi xiVar = this.f29741b;
        if (xiVar.f32947r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f25009s.q1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f29743e);
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
