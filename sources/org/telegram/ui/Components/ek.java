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
public final class ek extends si implements NotificationCenter.NotificationCenterDelegate, me.d {
    public final yj E;
    public final ak F;
    public final f00 G;
    public final zi H;
    public final wi I;
    public vj J;
    public boolean K;
    public final me.b f25716n;
    public final FrameLayout f25717r;
    public final ai.w0 f25718s;
    public final hg.f0 v;
    public final HashMap f25719w;
    public final ArrayList f25720x;
    public boolean f25721y;

    public ek(Context context, org.telegram.ui.ActionBar.c6 c6Var, aj ajVar) {
        super(context, c6Var, ajVar);
        this.f25716n = new me.b(0, this, js.h, 380L, false);
        this.f25719w = new HashMap();
        this.f25720x = new ArrayList();
        this.f25721y = false;
        this.F = new ak(this, context);
        zi ziVar = new zi(context, org.telegram.ui.ActionBar.h6.f20560d6, c6Var);
        this.H = ziVar;
        ziVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25717r = frameLayout;
        wi wiVar = new wi(context, c6Var, this.f30570b);
        this.I = wiVar;
        wiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ci.g2 g2Var = wiVar.f31362r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new sj(this));
        frameLayout.addView(ziVar, w7.w5.g());
        FrameLayout.LayoutParams a2 = w7.w5.a(48.0f, 7.0f, 8.0f, 7.0f, 4.0f, -1, 51);
        ((ViewGroup.MarginLayoutParams) a2).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(wiVar, a2);
        f00 f00Var = new f00(context, c6Var);
        this.G = f00Var;
        f00Var.c();
        f00Var.setText(LocaleController.getString(R.string.NoContacts));
        addView(f00Var, w7.w5.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 51));
        ai.w0 w0Var = new ai.w0(this, context, c6Var, 12);
        this.f25718s = w0Var;
        this.f30571c = w0Var;
        this.d = w0Var;
        this.h = true;
        this.f30573f = true;
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
        addView(w0Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        yj yjVar = new yj(this, context);
        this.E = yjVar;
        w0Var.setAdapter(yjVar);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A5, this.f30569a));
        w0Var.setOnItemClickListener(new ai.o6(10, this, c6Var));
        w0Var.setOnScrollListener(new ai.r(this, 18));
        w0Var.setOnItemLongClickListener(new qj(this));
        FrameLayout.LayoutParams e7 = w7.w5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e7).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e7);
        NotificationCenter.getInstance(this.f30570b.M1).addObserver(this, NotificationCenter.contactsDidLoad);
        Q();
    }

    public int getCurrentTop() {
        ai.w0 w0Var = this.f25718s;
        if (w0Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = w0Var.getChildAt(0);
            gm0 gm0Var = (gm0) w0Var.G(childAt);
            if (gm0Var != null) {
                int paddingTop = w0Var.getPaddingTop();
                if (gm0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i10, int i11) {
        int i12;
        aj ajVar = this.f30570b;
        if (ajVar.f24385u1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            ajVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    ajVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            ajVar.setAllowNestedScroll(true);
        }
        this.f25718s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f30572e);
    }

    @Override
    public final void G(si siVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f25718s.x0(0);
    }

    @Override
    public final boolean K(final int i10, final boolean z10, int i11, final boolean z11, final long j3) {
        HashMap hashMap = this.f25719w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.J == null) || this.f25721y) {
            return false;
        }
        this.f25721y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f25720x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(P(hashMap.get((uj) obj)));
        }
        aj ajVar = this.f30570b;
        return g5.a0(ajVar.M1, ajVar.p1(), ajVar.l1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                ek ekVar = ek.this;
                vj vjVar = ekVar.J;
                aj ajVar2 = ekVar.f30570b;
                String obj3 = ajVar2.o1().getText().toString();
                ((Long) obj2).getClass();
                vjVar.b(arrayList, obj3, z10, i10, j3, z11);
                ajVar2.dismiss();
            }
        }, 0L);
    }

    public final void O(dk dkVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f25719w;
        if (hashMap.isEmpty() && !this.K) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f30569a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
            a2Var.R = string;
            a2Var.T = formatString;
            org.telegram.messenger.v0.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        uj a2 = uj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f25720x;
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
        fq fqVar = dkVar.d;
        if (fqVar.getVisibility() != 0) {
            fqVar.setVisibility(0);
        }
        fqVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f30570b.Z1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 P(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ek.P(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void Q() {
        boolean z10;
        int i10 = 0;
        if (this.f25718s.getAdapter().h() == 2) {
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
        f00 f00Var = this.G;
        if (f00Var.getVisibility() != 0 || (childAt = this.f25718s.getChildAt(0)) == null) {
            return;
        }
        f00Var.setTranslationY((childAt.getTop() + (f00Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        yj yjVar;
        if (i10 == NotificationCenter.contactsDidLoad && (yjVar = this.E) != null) {
            yjVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ai.w0 w0Var = this.f25718s;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        gm0 gm0Var = (gm0) w0Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && gm0Var != null && gm0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        me.b bVar = this.f25716n;
        if (top >= 0 && gm0Var != null && gm0Var.b() == 0) {
            bVar.a(false, true);
        } else {
            bVar.a(true, true);
            top = i10;
        }
        this.f25717r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25718s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f25719w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f25720x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(P(hashMap.get((uj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f25719w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        a7 a7Var = new a7(this, 1);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20544c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f20632h6));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.w0 w0Var = this.f25718s;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        int i11 = org.telegram.ui.ActionBar.h6.f20799q5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{dk.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{dk.class}, new String[]{"statusTextView"}, null, null, -1, a7Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{dk.class}, null, org.telegram.ui.ActionBar.h6.f20813r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        if (i10 == 0) {
            zi ziVar = this.H;
            ziVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ziVar.setVisibility(i11);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    @Override
    public final void p() {
        NotificationCenter.getInstance(this.f30570b.M1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    public void setDelegate(vj vjVar) {
        this.J = vjVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.K = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30570b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ah.c cVar) {
        wi wiVar = this.I;
        if (wiVar != null) {
            wiVar.setupBlurredBackground(cVar.c(wiVar, eh.b.a(this.f30569a), false));
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
