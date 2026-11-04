package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public xs f41265a;
    public c00 f41266b;
    public u4.y f41267c;
    public UndoView d;
    public boolean f41268e;
    public boolean f41269f;
    public final ArrayList h;
    public final ArrayList f41270n;
    public int f41271r;
    public int f41272s;
    private int showTagsRow;
    public int f41273w;
    public int f41274x;
    public boolean f41275y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f41270n = new ArrayList();
        this.f41272s = -1;
        this.f41273w = -1;
    }

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i3) {
        a00 a00Var;
        ArrayList arrayList = filtersSetupActivity.f41270n;
        if (i3 >= 0 && i3 < arrayList.size() && (a00Var = (a00) arrayList.get(i3)) != null) {
            int i10 = a00Var.f54715a;
            if (i10 == 6) {
                if (!filtersSetupActivity.getUserConfig().q()) {
                    filtersSetupActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().A7;
                org.telegram.messenger.hp messagesController = filtersSetupActivity.getMessagesController();
                boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
                SharedPreferences.Editor edit = messagesController.f22999e7.edit();
                messagesController.A7 = z10;
                edit.putBoolean("folderTags", z10).apply();
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new xy(1, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.q8) view).setChecked(filtersSetupActivity.getMessagesController().A7);
                c00 c00Var = filtersSetupActivity.f41266b;
                int i11 = filtersSetupActivity.f41272s;
                c00Var.k(i11, filtersSetupActivity.f41273w - i11);
            } else if (i10 == 2) {
                org.telegram.messenger.mo moVar = a00Var.d;
                if (moVar != null && !moVar.e()) {
                    if (moVar.f24250p) {
                        filtersSetupActivity.showDialog(new vg.i0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new ez(moVar, null));
                    }
                }
            } else if (i10 == 4) {
                filtersSetupActivity.d0(filtersSetupActivity.getParentLayout());
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28008k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28081o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131750697, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 3));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        xs xsVar = new xs(3, context, this);
        this.f41265a = xsVar;
        xsVar.r1();
        this.f41265a.setClipChildren(false);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f41265a.setItemAnimator(kVar);
        this.f41265a.setSectionsDrawBackground(true);
        ((u4.k) this.f41265a.getItemAnimator()).C = false;
        this.f41265a.setLayoutManager(new u4.b0(1, false));
        this.f41265a.setVerticalScrollBarEnabled(false);
        u4.y yVar = new u4.y(new org.telegram.ui.Components.az(this));
        this.f41267c = yVar;
        yVar.h(this.f41265a);
        frameLayout.addView(this.f41265a, b8.mf.c(-1.0f, -1));
        xs xsVar2 = this.f41265a;
        c00 c00Var = new c00(this, context);
        this.f41266b = c00Var;
        xsVar2.setAdapter(c00Var);
        this.f41265a.setOnItemClickListener(new org.telegram.ui.Components.i41(13, this, context));
        if (this.f41269f) {
            g0(false);
            this.f41269f = false;
            this.f41265a.v0(this.f41266b.b() - 1);
            org.telegram.messenger.g0.i3(new xz(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.q4 q4Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().L4 && !getUserConfig().q()) || size >= getMessagesController().M4) {
            showDialog(new vg.i0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (q4Var != null) {
            ((ActionBarLayout) q4Var).S(new ez(null, null));
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.O2) {
            g0(true);
        } else if (i3 == org.telegram.messenger.hs.Q2) {
            g0(true);
        }
    }

    public final UndoView e0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(xz xzVar) {
        if (!this.f41268e) {
            if (xzVar != null) {
                xzVar.run();
                return;
            }
            return;
        }
        this.f41268e = false;
        getNotificationCenter().k(org.telegram.messenger.hs.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = getMessagesController().T0();
        int size = T0.size();
        for (int i3 = 0; i3 < size; i3 = com.google.android.recaptcha.internal.a.f(((org.telegram.messenger.mo) T0.get(i3)).f24237a, i3, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(xzVar, 8));
    }

    public final void g0(boolean z10) {
        CharSequence M0;
        this.showTagsRow = -1;
        xs xsVar = this.f41265a;
        if (xsVar != null) {
            ArrayList arrayList = xsVar.L2;
            if (arrayList == null) {
                xsVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f41270n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().W0;
        ArrayList T0 = getMessagesController().T0();
        int i3 = 1;
        arrayList3.add(new sg.a(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M02 = org.telegram.messenger.bd.M0(2131750719, null);
            ?? aVar = new sg.a(0, false);
            aVar.f43547c = M02;
            arrayList3.add(aVar);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                ?? aVar2 = new sg.a(5, false);
                aVar2.f43548e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                arrayList3.add(aVar2);
            }
            xs xsVar2 = this.f41265a;
            if (xsVar2 != null) {
                xsVar2.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new sg.a(3, false);
            aVar3.f43547c = null;
            arrayList3.add(aVar3);
        }
        if (!T0.isEmpty()) {
            this.f41272s = arrayList3.size();
            String M03 = org.telegram.messenger.bd.M0(2131750697, null);
            ?? aVar4 = new sg.a(0, false);
            aVar4.f43547c = M03;
            arrayList3.add(aVar4);
            this.f41271r = arrayList3.size();
            for (int i11 = 0; i11 < T0.size(); i11++) {
                ?? aVar5 = new sg.a(2, false);
                aVar5.d = (org.telegram.messenger.mo) T0.get(i11);
                arrayList3.add(aVar5);
                if (org.telegram.messenger.hp.s1(this.currentAccount).A7 && ((org.telegram.messenger.mo) T0.get(i11)).f24247m >= 0) {
                    this.f41275y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f41273w = size2;
            xs xsVar3 = this.f41265a;
            if (xsVar3 != null) {
                ArrayList arrayList5 = xsVar3.L2;
                int i12 = this.f41272s;
                int i13 = size2 - 1;
                if (T0.size() >= getMessagesController().M4) {
                    i3 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.g0.w2(i12, i13 + i3)));
            }
        } else {
            this.f41273w = -1;
            this.f41272s = -1;
        }
        if (T0.size() < getMessagesController().M4) {
            String M04 = org.telegram.messenger.bd.M0(2131751717, null);
            ?? aVar6 = new sg.a(4, false);
            aVar6.f43547c = M04;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new sg.a(3, false);
        aVar7.f43547c = null;
        arrayList3.add(aVar7);
        this.f41274x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M05 = org.telegram.messenger.bd.M0(2131750626, null);
        ?? aVar8 = new sg.a(6, false);
        aVar8.f43547c = M05;
        arrayList3.add(aVar8);
        if (!getUserConfig().q()) {
            M0 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750624, null), org.telegram.ui.ActionBar.k6.L6, 2, new xz(this, 0), null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131750625, null);
        }
        ?? aVar9 = new sg.a(3, false);
        aVar9.f43547c = M0;
        arrayList3.add(aVar9);
        c00 c00Var = this.f41266b;
        if (c00Var != null) {
            if (z10) {
                c00Var.E(arrayList2, arrayList3);
            } else {
                c00Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41265a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41265a, 16, new Class[]{org.telegram.ui.Cells.n4.class, e00.class, d00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41265a, 196608, new Class[]{yz.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ji));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        g0(false);
        getMessagesController().c3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.hs.O2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.Q2);
        if (getMessagesController().W0.isEmpty()) {
            getMessagesController().d3();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.O2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.Q2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        c00 c00Var = this.f41266b;
        if (c00Var != null) {
            c00Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
