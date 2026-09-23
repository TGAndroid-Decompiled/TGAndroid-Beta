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
public final class zj extends oi implements NotificationCenter.NotificationCenterDelegate, le.e {
    public final tj E;
    public final vj F;
    public final nz G;
    public final vi H;
    public final si I;
    public qj J;
    public boolean K;
    public final le.c f30607n;
    public final FrameLayout f30608r;
    public final ai.w0 f30609s;
    public final hg.g0 v;
    public final HashMap f30610w;
    public final ArrayList f30611x;
    public boolean f30612y;

    public zj(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context, d6Var, wiVar);
        this.f30607n = new le.c(0, this, rr.h, 380L, false);
        this.f30610w = new HashMap();
        this.f30611x = new ArrayList();
        this.f30612y = false;
        this.F = new vj(this, context);
        vi viVar = new vi(context, org.telegram.ui.ActionBar.h6.f18789d6, d6Var);
        this.H = viVar;
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30608r = frameLayout;
        si siVar = new si(context, d6Var, this.f26744b);
        this.I = siVar;
        siVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ci.h2 h2Var = siVar.f22890r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new nj(this));
        frameLayout.addView(viVar, w7.x5.g());
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(siVar, d);
        nz nzVar = new nz(context, d6Var);
        this.G = nzVar;
        nzVar.c();
        nzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(nzVar, w7.x5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 12);
        this.f30609s = w0Var;
        this.f26745c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f26746f = true;
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
        addView(w0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        tj tjVar = new tj(this, context);
        this.E = tjVar;
        w0Var.setAdapter(tjVar);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A5, this.f26743a));
        w0Var.setOnItemClickListener(new ai.n6(10, this, d6Var));
        w0Var.setOnScrollListener(new ai.r(this, 18));
        w0Var.setOnItemLongClickListener(new lj(this));
        FrameLayout.LayoutParams e = w7.x5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f26744b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f30609s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            wk0 wk0Var = (wk0) w0Var.G(childAt);
            if (wk0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (wk0Var.b() == 0 && childAt.getTop() >= 0) {
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
        this.f30609s.x0(0);
    }

    @Override
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f30610w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f30612y) {
            return false;
        }
        this.f30612y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f30611x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((pj) obj)));
        }
        wi wiVar = this.f26744b;
        return e5.b0(wiVar.J1, wiVar.n1(), wiVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                zj zjVar = zj.this;
                qj qjVar = zjVar.J;
                wi wiVar2 = zjVar.f26744b;
                String obj3 = wiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                qjVar.b(arrayList, obj3, z10, i10, j3, z11);
                wiVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(yj yjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f30610w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26743a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            b2Var.R = string;
            b2Var.T = formatString;
            hg.c.A(R.string.OK, alertDialog$Builder, null);
            return;
        }
        pj a2 = pj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f30611x;
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
        op opVar = yjVar.d;
        if (opVar.getVisibility() != 0) {
            opVar.setVisibility(0);
        }
        opVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f26744b.V1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zj.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z10;
        int i10 = 0;
        if (this.f30609s.getAdapter().h() == 2) {
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
        nz nzVar = this.G;
        if (nzVar.getVisibility() != 0 || (childAt = this.f30609s.getChildAt(0)) == null) {
            return;
        }
        nzVar.setTranslationY((childAt.getTop() + (nzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tj tjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (tjVar = this.E) != null) {
            tjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f30609s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        wk0 wk0Var = (wk0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && wk0Var != null && wk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.c cVar = this.f30607n;
        if (top >= 0 && wk0Var != null && wk0Var.b() == 0) {
            cVar.a(false, true);
        } else {
            cVar.a(true, true);
            top = i10;
        }
        this.f30608r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30609s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f30610w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f30611x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(M(hashMap.get((pj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f30610w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        y6 y6Var = new y6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f18772c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f18860h6));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.w0 w0Var = this.f30609s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        int i11 = org.telegram.ui.ActionBar.h6.f19025q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{yj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{yj.class}, new String[]{"statusTextView"}, null, null, -1, y6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{yj.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
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
        NotificationCenter.getInstance(this.f26744b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(qj qjVar) {
        this.J = qjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26744b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        si siVar = this.I;
        if (siVar != null) {
            siVar.setupBlurredBackground(cVar.c(siVar, eh.b.a(this.f26743a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        wi wiVar = this.f26744b;
        if (wiVar.f29702r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f30609s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
