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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public ag.b1 f33338a;
    public e10 f33339b;
    public s4.x f33340c;
    public UndoView d;
    public boolean e;
    public boolean f33341f;
    public final ArrayList h;
    public final ArrayList f33342n;
    public int f33343r;
    public int f33344s;
    private int showTagsRow;
    public int f33345w;
    public int f33346x;
    public boolean f33347y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f33342n = new ArrayList();
        this.f33344s = -1;
        this.f33345w = -1;
    }

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        c10 c10Var;
        ArrayList arrayList = filtersSetupActivity.f33342n;
        if (i10 >= 0 && i10 < arrayList.size() && (c10Var = (c10) arrayList.get(i10)) != null) {
            int i11 = c10Var.f7681a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().q()) {
                    filtersSetupActivity.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().B7;
                org.telegram.messenger.wp messagesController = filtersSetupActivity.getMessagesController();
                boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
                SharedPreferences.Editor edit = messagesController.f7.edit();
                messagesController.B7 = z10;
                edit.putBoolean("folderTags", z10).apply();
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new org.telegram.ui.Components.t20(12, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.t8) view).setChecked(filtersSetupActivity.getMessagesController().B7);
                e10 e10Var = filtersSetupActivity.f33339b;
                int i12 = filtersSetupActivity.f33344s;
                e10Var.k(i12, filtersSetupActivity.f33345w - i12);
            } else if (i11 == 2) {
                org.telegram.messenger.bp bpVar = c10Var.d;
                if (bpVar != null && !bpVar.e()) {
                    if (bpVar.f15012p) {
                        filtersSetupActivity.showDialog(new kg.q0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new h00(bpVar, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.d0(filtersSetupActivity.getParentLayout());
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21060k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21135o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131750697, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 23));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ag.b1 b1Var = new ag.b1(this, context, 28);
        this.f33338a = b1Var;
        b1Var.r1();
        this.f33338a.setClipChildren(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        this.f33338a.setItemAnimator(jVar);
        this.f33338a.setSectionsDrawBackground(true);
        ((s4.j) this.f33338a.getItemAnimator()).C = false;
        this.f33338a.setLayoutManager(new s4.a0(1, false));
        this.f33338a.setVerticalScrollBarEnabled(false);
        s4.x xVar = new s4.x(new org.telegram.ui.Components.sz(this));
        this.f33340c = xVar;
        xVar.h(this.f33338a);
        frameLayout.addView(this.f33338a, w7.b6.c(-1.0f, -1));
        ag.b1 b1Var2 = this.f33338a;
        e10 e10Var = new e10(this, context);
        this.f33339b = e10Var;
        b1Var2.setAdapter(e10Var);
        this.f33338a.setOnItemClickListener(new qv(4, this, context));
        if (this.f33341f) {
            g0(false);
            this.f33341f = false;
            this.f33338a.v0(this.f33339b.b() - 1);
            org.telegram.messenger.i0.h3(new z00(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.z4 z4Var) {
        int size = getMessagesController().S0().size();
        if ((size - 1 >= getMessagesController().M4 && !getUserConfig().q()) || size >= getMessagesController().N4) {
            showDialog(new kg.q0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (z4Var != null) {
            ((ActionBarLayout) z4Var).R(new h00(null, null));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.O2) {
            g0(true);
        } else if (i10 == org.telegram.messenger.at.Q2) {
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
            ((FrameLayout) this.fragmentView).addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(z00 z00Var) {
        if (!this.e) {
            if (z00Var != null) {
                z00Var.run();
                return;
            }
            return;
        }
        this.e = false;
        getNotificationCenter().k(org.telegram.messenger.at.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList S0 = getMessagesController().S0();
        int size = S0.size();
        for (int i10 = 0; i10 < size; i10 = c3.i0.j(((org.telegram.messenger.bp) S0.get(i10)).f15000a, i10, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new k(z00Var, 8));
    }

    public final void g0(boolean z10) {
        CharSequence L0;
        this.showTagsRow = -1;
        ag.b1 b1Var = this.f33338a;
        if (b1Var != null) {
            ArrayList arrayList = b1Var.K2;
            if (arrayList == null) {
                b1Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f33342n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().V0;
        ArrayList S0 = getMessagesController().S0();
        int i10 = 1;
        arrayList3.add(new hg.b(1, false));
        if (!arrayList4.isEmpty() && S0.size() < 10) {
            int size = arrayList3.size();
            String L02 = org.telegram.messenger.dd.L0(2131750719, null);
            ?? bVar = new hg.b(0, false);
            bVar.f36159c = L02;
            arrayList3.add(bVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? bVar2 = new hg.b(5, false);
                bVar2.e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i11);
                arrayList3.add(bVar2);
            }
            ag.b1 b1Var2 = this.f33338a;
            if (b1Var2 != null) {
                b1Var2.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(size, arrayList3.size() - 1)));
            }
            ?? bVar3 = new hg.b(3, false);
            bVar3.f36159c = null;
            arrayList3.add(bVar3);
        }
        if (!S0.isEmpty()) {
            this.f33344s = arrayList3.size();
            String L03 = org.telegram.messenger.dd.L0(2131750697, null);
            ?? bVar4 = new hg.b(0, false);
            bVar4.f36159c = L03;
            arrayList3.add(bVar4);
            this.f33343r = arrayList3.size();
            for (int i12 = 0; i12 < S0.size(); i12++) {
                ?? bVar5 = new hg.b(2, false);
                bVar5.d = (org.telegram.messenger.bp) S0.get(i12);
                arrayList3.add(bVar5);
                if (org.telegram.messenger.wp.r1(this.currentAccount).B7 && ((org.telegram.messenger.bp) S0.get(i12)).f15009m >= 0) {
                    this.f33347y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f33345w = size2;
            ag.b1 b1Var3 = this.f33338a;
            if (b1Var3 != null) {
                ArrayList arrayList5 = b1Var3.K2;
                int i13 = this.f33344s;
                int i14 = size2 - 1;
                if (S0.size() >= getMessagesController().N4) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.i0.w2(i13, i14 + i10)));
            }
        } else {
            this.f33345w = -1;
            this.f33344s = -1;
        }
        if (S0.size() < getMessagesController().N4) {
            String L04 = org.telegram.messenger.dd.L0(2131751717, null);
            ?? bVar6 = new hg.b(4, false);
            bVar6.f36159c = L04;
            arrayList3.add(bVar6);
        }
        ?? bVar7 = new hg.b(3, false);
        bVar7.f36159c = null;
        arrayList3.add(bVar7);
        this.f33346x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String L05 = org.telegram.messenger.dd.L0(2131750626, null);
        ?? bVar8 = new hg.b(6, false);
        bVar8.f36159c = L05;
        arrayList3.add(bVar8);
        if (!getUserConfig().q()) {
            L0 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131750624, null), org.telegram.ui.ActionBar.t6.L6, 2, new z00(this, 0), null);
        } else {
            L0 = org.telegram.messenger.dd.L0(2131750625, null);
        }
        ?? bVar9 = new hg.b(3, false);
        bVar9.f36159c = L0;
        arrayList3.add(bVar9);
        e10 e10Var = this.f33339b;
        if (e10Var != null) {
            if (z10) {
                e10Var.E(arrayList2, arrayList3);
            } else {
                e10Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f33338a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33338a, 16, new Class[]{org.telegram.ui.Cells.p4.class, g10.class, f10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33338a, 196608, new Class[]{a10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ji));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        g0(false);
        getMessagesController().a3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.at.O2);
        getNotificationCenter().c(this, org.telegram.messenger.at.Q2);
        if (getMessagesController().V0.isEmpty()) {
            getMessagesController().b3();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.at.O2);
        getNotificationCenter().n(this, org.telegram.messenger.at.Q2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        e10 e10Var = this.f33339b;
        if (e10Var != null) {
            e10Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
