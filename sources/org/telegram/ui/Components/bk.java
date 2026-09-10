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
public final class bk extends qi implements NotificationCenter.NotificationCenterDelegate, le.d {
    public final vj E;
    public final xj F;
    public final tz G;
    public final xi H;
    public final ui I;
    public sj J;
    public boolean K;
    public final le.b f21843n;
    public final FrameLayout f21844r;
    public final bi.y1 f21845s;
    public final gg.j0 v;
    public final HashMap f21846w;
    public final ArrayList f21847x;
    public boolean f21848y;

    public bk(Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(context, f6Var, yiVar);
        this.f21843n = new le.b(0, this, wr.h, 380L, false);
        this.f21846w = new HashMap();
        this.f21847x = new ArrayList();
        this.f21848y = false;
        this.F = new xj(this, context);
        xi xiVar = new xi(context, org.telegram.ui.ActionBar.j6.f17928d6, f6Var);
        this.H = xiVar;
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21844r = frameLayout;
        ui uiVar = new ui(context, f6Var, this.f26422b);
        this.I = uiVar;
        uiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        bi.t2 t2Var = uiVar.f24572r;
        t2Var.setHint(string);
        t2Var.addTextChangedListener(new pj(this));
        frameLayout.addView(xiVar, w7.a6.g());
        FrameLayout.LayoutParams d = w7.a6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(uiVar, d);
        tz tzVar = new tz(context, f6Var);
        this.G = tzVar;
        tzVar.c();
        tzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(tzVar, w7.a6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.y1 y1Var = new bi.y1(this, context, f6Var, 11);
        this.f21845s = y1Var;
        this.f26423c = y1Var;
        this.d = y1Var;
        this.h = true;
        this.f26424f = true;
        y1Var.o1();
        y1Var.setClipToPadding(false);
        getContext();
        gg.j0 j0Var = new gg.j0(this, AndroidUtilities.dp(9.0f), y1Var, 1);
        this.v = j0Var;
        y1Var.setLayoutManager(j0Var);
        j0Var.P = false;
        y1Var.setHorizontalScrollBarEnabled(false);
        y1Var.setVerticalScrollBarEnabled(false);
        y1Var.setClipToPadding(false);
        addView(y1Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        vj vjVar = new vj(this, context);
        this.E = vjVar;
        y1Var.setAdapter(vjVar);
        y1Var.setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A5, this.f26421a));
        y1Var.setOnItemClickListener(new ai.b0(9, this, f6Var));
        y1Var.setOnScrollListener(new bi.a2(this, 16));
        y1Var.setOnItemLongClickListener(new nj(this));
        FrameLayout.LayoutParams e = w7.a6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        NotificationCenter.getInstance(this.f26422b.J1).addObserver(this, NotificationCenter.contactsDidLoad);
        N();
    }

    public int getCurrentTop() {
        bi.y1 y1Var = this.f21845s;
        if (y1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = y1Var.getChildAt(0);
            fl0 fl0Var = (fl0) y1Var.G(childAt);
            if (fl0Var != null) {
                int paddingTop = y1Var.getPaddingTop();
                if (fl0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(qi qiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f21845s.x0(0);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
    public final boolean I(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f21846w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f21848y) {
            return false;
        }
        this.f21848y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f21847x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(M(hashMap.get((rj) obj)));
        }
        yi yiVar = this.f26422b;
        return d5.b0(yiVar.J1, yiVar.n1(), yiVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                bk bkVar = bk.this;
                sj sjVar = bkVar.J;
                yi yiVar2 = bkVar.f26422b;
                String obj3 = yiVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                sjVar.b(arrayList, obj3, z10, i10, j3, z11);
                yiVar2.dismiss();
            }
        }, 0L);
    }

    public final void L(ak akVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f21846w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26421a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = formatString;
            hc.b.A(R.string.OK, alertDialog$Builder, null);
            return;
        }
        rj a2 = rj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f21847x;
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
        tp tpVar = akVar.d;
        if (tpVar.getVisibility() != 0) {
            tpVar.setVisibility(0);
        }
        tpVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f26422b.V1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 M(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bk.M(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void N() {
        boolean z10;
        int i10 = 0;
        if (this.f21845s.getAdapter().h() == 2) {
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
        tz tzVar = this.G;
        if (tzVar.getVisibility() != 0 || (childAt = this.f21845s.getChildAt(0)) == null) {
            return;
        }
        tzVar.setTranslationY((childAt.getTop() + (tzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
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
        bi.y1 y1Var = this.f21845s;
        if (y1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        le.b bVar = this.f21843n;
        if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f21844r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f21845s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f21846w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f21847x;
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
        return this.f21846w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        x6 x6Var = new x6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f17911c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f17999h6));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        bi.y1 y1Var = this.f21845s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        int i11 = org.telegram.ui.ActionBar.j6.f18161q5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{ak.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{ak.class}, new String[]{"statusTextView"}, null, null, -1, x6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{ak.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f26422b.J1).removeObserver(this, NotificationCenter.contactsDidLoad);
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
        this.f26422b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(zg.a aVar) {
        ui uiVar = this.I;
        if (uiVar != null) {
            uiVar.setupBlurredBackground(aVar.c(uiVar, dh.c.a(this.f26421a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        yi yiVar = this.f26422b;
        if (yiVar.f29403r1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f21845s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
