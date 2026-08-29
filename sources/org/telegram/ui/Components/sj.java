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
public final class sj extends fi implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public final lj A;
    public final oj B;
    public final hz C;
    public final mi D;
    public final ji E;
    public ij F;
    public boolean G;
    public final vd.a f32654n;
    public final FrameLayout f32655r;
    public final jh.e1 f32656s;
    public final gj v;
    public final HashMap f32657w;
    public final ArrayList f32658x;
    public boolean f32659y;

    public sj(Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.f32654n = new vd.a(0, this, jr.h, 380L, false);
        this.f32657w = new HashMap();
        this.f32658x = new ArrayList();
        this.f32659y = false;
        this.B = new oj(this, context);
        mi miVar = new mi(context, org.telegram.ui.ActionBar.g6.f23062d6, c6Var);
        this.D = miVar;
        miVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32655r = frameLayout;
        ji jiVar = new ji(context, c6Var, this.f28403b);
        this.E = jiVar;
        jiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        ig.f fVar = jiVar.f34546r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new ej(this));
        frameLayout.addView(miVar, i7.f6.g());
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(jiVar, d);
        hz hzVar = new hz(context, c6Var);
        this.C = hzVar;
        hzVar.c();
        hzVar.setText(LocaleController.getString(R.string.NoContacts));
        addView(hzVar, i7.f6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        jh.e1 e1Var = new jh.e1(this, context, c6Var, 11);
        this.f32656s = e1Var;
        this.f28404c = e1Var;
        this.d = e1Var;
        this.h = true;
        this.f28406f = true;
        e1Var.p1();
        e1Var.setClipToPadding(false);
        getContext();
        gj gjVar = new gj(this, AndroidUtilities.dp(9.0f), e1Var, 0);
        this.v = gjVar;
        e1Var.setLayoutManager(gjVar);
        gjVar.P = false;
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        addView(e1Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        lj ljVar = new lj(this, context);
        this.A = ljVar;
        e1Var.setAdapter(ljVar);
        e1Var.setGlowColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A5, this.f28402a));
        e1Var.setOnItemClickListener(new eg.w0(11, this, c6Var));
        e1Var.setOnScrollListener(new cg.g2(this, 21));
        e1Var.setOnItemLongClickListener(new cj(this));
        FrameLayout.LayoutParams e10 = i7.f6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        NotificationCenter.getInstance(this.f28403b.F1).addObserver(this, NotificationCenter.contactsDidLoad);
        M();
    }

    public int getCurrentTop() {
        jh.e1 e1Var = this.f32656s;
        if (e1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = e1Var.getChildAt(0);
            vk0 vk0Var = (vk0) e1Var.G(childAt);
            if (vk0Var != null) {
                int paddingTop = e1Var.getPaddingTop();
                if (vk0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(fi fiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f32656s.x0(0);
    }

    @Override
    public final boolean H(final int i10, final boolean z10, int i11, final boolean z11, final long j10) {
        HashMap hashMap = this.f32657w;
        int i12 = 0;
        if ((hashMap.size() == 0 && this.F == null) || this.f32659y) {
            return false;
        }
        this.f32659y = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.f32658x;
        int size = arrayList2.size();
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(L(hashMap.get((hj) obj)));
        }
        ni niVar = this.f28403b;
        return c5.b0(niVar.F1, niVar.n1(), niVar.j1() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                sj sjVar = sj.this;
                ij ijVar = sjVar.F;
                ni niVar2 = sjVar.f28403b;
                String obj3 = niVar2.m1().getText().toString();
                ((Long) obj2).getClass();
                ijVar.b(arrayList, obj3, z10, i10, j10, z11);
                niVar2.dismiss();
            }
        }, 0L);
    }

    public final void K(rj rjVar, Object obj) {
        boolean z10;
        HashMap hashMap = this.f32657w;
        if (hashMap.isEmpty() && !this.G) {
            String formatString = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28402a);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = formatString;
            j7.l1.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        hj a2 = hj.a(obj);
        boolean containsKey = hashMap.containsKey(a2);
        ArrayList arrayList = this.f32658x;
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
        hp hpVar = rjVar.d;
        if (hpVar.getVisibility() != 0) {
            hpVar.setVisibility(0);
        }
        hpVar.a(z10, true);
        if (!z10) {
            i10 = 2;
        }
        this.f28403b.V1(i10);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 L(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sj.L(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void M() {
        boolean z10;
        int i10 = 0;
        if (this.f32656s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.C.setVisibility(i10);
        O();
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11;
        if (i10 == 0) {
            mi miVar = this.D;
            miVar.setAlpha(f9);
            if (f9 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            miVar.setVisibility(i11);
        }
    }

    public final void O() {
        View childAt;
        hz hzVar = this.C;
        if (hzVar.getVisibility() != 0 || (childAt = this.f32656s.getChildAt(0)) == null) {
            return;
        }
        hzVar.setTranslationY((childAt.getTop() + (hzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lj ljVar;
        if (i10 == NotificationCenter.contactsDidLoad && (ljVar = this.A) != null) {
            ljVar.l();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        jh.e1 e1Var = this.f32656s;
        if (e1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        vd.a aVar = this.f32654n;
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i10;
        }
        this.f32655r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f32656s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.f32657w;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.f32658x;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(L(hashMap.get((hj) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.f32657w.size();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        x6 x6Var = new x6(this, 1);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        jh.e1 e1Var = this.f32656s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        int i11 = org.telegram.ui.ActionBar.g6.f23294q5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{rj.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{rj.class}, new String[]{"statusTextView"}, null, null, -1, x6Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{rj.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    @Override
    public final void m() {
        NotificationCenter.getInstance(this.f28403b.F1).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        O();
    }

    public void setDelegate(ij ijVar) {
        this.F = ijVar;
    }

    public void setMultipleSelectionAllowed(boolean z10) {
        this.G = z10;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(lg.a aVar) {
        ji jiVar = this.E;
        if (jiVar != null) {
            jiVar.setupBlurredBackground(aVar.c(jiVar, pg.a.a(this.f28402a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        ni niVar = this.f28403b;
        if (niVar.f31029n1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    niVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            niVar.setAllowNestedScroll(true);
        }
        this.f32656s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f28405e);
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
