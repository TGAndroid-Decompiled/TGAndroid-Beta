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
public final class ak extends oi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public final uj E;
    public final wj F;
    public final oz G;
    public final vi H;
    public final si I;
    public rj J;
    public boolean K;
    public final le.c f22677n;
    public final FrameLayout f22678r;
    public final ai.w0 f22679s;
    public final hg.g0 v;
    public final HashMap f22680w;
    public final ArrayList f22681x;
    public boolean f22682y;

    public ak(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.f22677n = new le.c(0, this, sr.h, 380L, false);
        this.f22680w = new HashMap();
        this.f22681x = new ArrayList();
        this.f22682y = false;
        this.F = new wj(this, context);
        vi viVar = new vi(context, org.telegram.ui.ActionBar.h6.f19059d6, d6Var);
        this.H = viVar;
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22678r = frameLayout;
        si siVar = new si(context, d6Var, this.f27043b);
        this.I = siVar;
        siVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ci.h2 h2Var = siVar.f23475r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new oj(this));
        frameLayout.addView(viVar, w7.y5.g());
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(siVar, d);
        oz ozVar = new oz(context, d6Var);
        this.G = ozVar;
        ozVar.c();
        ozVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(ozVar, w7.y5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 12);
        this.f22679s = w0Var;
        this.f27044c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f27045f = true;
        w0Var.p1();
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
        uj ujVar = new uj(this, context);
        this.E = ujVar;
        w0Var.setAdapter(ujVar);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, this.f27042a));
        w0Var.setOnItemClickListener(new ai.n6(10, this, d6Var));
        w0Var.setOnScrollListener(new ai.r(this, 18));
        w0Var.setOnItemLongClickListener(new mj(this));
        FrameLayout.LayoutParams e = w7.y5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f27043b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f22679s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            hl0 hl0Var = (hl0) w0Var.G(childAt);
            if (hl0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (hl0Var.b() == 0 && childAt.getTop() >= 0) {
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
            vi viVar = this.H;
            viVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            viVar.setVisibility(i11);
        }
    }

    @Override
    public final void E(oi oiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f22679s.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f22680w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f22682y) {
            return false;
        }
        this.f22682y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f22681x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((qj) obj)));
        }
        wi wiVar = this.f27043b;
        return e5.b0(wiVar.J1, wiVar.n1(), wiVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                ak akVar = ak.this;
                rj rjVar = akVar.J;
                wi wiVar2 = akVar.f27043b;
                String obj3 = wiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                rjVar.b(arrayList, obj3, z10, i10, j3, z11);
                wiVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(zj zjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f22680w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27042a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            a2Var.R = string;
            a2Var.T = formatString;
            org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        qj a2 = qj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f22681x;
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
        pp ppVar = zjVar.d;
        if (ppVar.getVisibility() != 0) {
            ppVar.setVisibility(0);
        }
        ppVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f27043b.V1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ak.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z10;
        int i10 = 0;
        if (this.f22679s.getAdapter().h() == 2) {
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
        oz ozVar = this.G;
        if (ozVar.getVisibility() != 0 || (childAt = this.f22679s.getChildAt(0)) == null) {
            return;
        }
        ozVar.setTranslationY((childAt.getTop() + (ozVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        uj ujVar;
        if (i10 == NotificationCenter.contactsDidLoad && (ujVar = this.E) != null) {
            ujVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f22679s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        hl0 hl0Var = (hl0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && hl0Var != null && hl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.c cVar = this.f22677n;
        if (top >= 0 && hl0Var != null && hl0Var.b() == 0) {
            cVar.a(false, true);
        } else {
            cVar.a(true, true);
            top = i10;
        }
        this.f22678r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f22679s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f22680w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f22681x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(M(hashMap.get((qj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f22680w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        y6 y6Var = new y6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19042c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f19130h6));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.w0 w0Var = this.f22679s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        int i11 = org.telegram.ui.ActionBar.h6.f19297q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{zj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{zj.class}, new String[]{"statusTextView"}, null, null, -1, y6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{zj.class}, null, org.telegram.ui.ActionBar.h6.f19310r0, null, org.telegram.ui.ActionBar.h6.J7));
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
        NotificationCenter.getInstance(this.f27043b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(rj rjVar) {
        this.J = rjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27043b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        si siVar = this.I;
        if (siVar != null) {
            siVar.setupBlurredBackground(cVar.c(siVar, eh.b.a(this.f27042a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        wi wiVar = this.f27043b;
        if (wiVar.f30057r1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            wiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    wiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            wiVar.setAllowNestedScroll(true);
        }
        this.f22679s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
