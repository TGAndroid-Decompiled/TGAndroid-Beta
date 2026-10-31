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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public ag.b1 f33331a;
    public f10 f33332b;
    public s4.x f33333c;
    public UndoView d;
    public boolean e;
    public boolean f33334f;
    public final ArrayList h;
    public final ArrayList f33335n;
    public int f33336r;
    public int f33337s;
    private int showTagsRow;
    public int f33338w;
    public int f33339x;
    public boolean f33340y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f33335n = new ArrayList();
        this.f33337s = -1;
        this.f33338w = -1;
    }

    public static void Y(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        d10 d10Var;
        ArrayList arrayList = filtersSetupActivity.f33335n;
        if (i10 >= 0 && i10 < arrayList.size() && (d10Var = (d10) arrayList.get(i10)) != null) {
            int i11 = d10Var.f7680a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().q()) {
                    filtersSetupActivity.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().B7;
                org.telegram.messenger.vp messagesController = filtersSetupActivity.getMessagesController();
                boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
                SharedPreferences.Editor edit = messagesController.f7.edit();
                messagesController.B7 = z10;
                edit.putBoolean("folderTags", z10).apply();
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new org.telegram.ui.Components.t20(12, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.t8) view).setChecked(filtersSetupActivity.getMessagesController().B7);
                f10 f10Var = filtersSetupActivity.f33332b;
                int i12 = filtersSetupActivity.f33337s;
                f10Var.k(i12, filtersSetupActivity.f33338w - i12);
            } else if (i11 == 2) {
                org.telegram.messenger.ap apVar = d10Var.d;
                if (apVar != null && !apVar.e()) {
                    if (apVar.f14657p) {
                        filtersSetupActivity.showDialog(new kg.q0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new i00(apVar, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.c0(filtersSetupActivity.getParentLayout());
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21059k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21134o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    public final void c0(org.telegram.ui.ActionBar.z4 z4Var) {
        int size = getMessagesController().S0().size();
        if ((size - 1 >= getMessagesController().M4 && !getUserConfig().q()) || size >= getMessagesController().N4) {
            showDialog(new kg.q0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (z4Var != null) {
            ((ActionBarLayout) z4Var).R(new i00(null, null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131750697, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 23));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ag.b1 b1Var = new ag.b1(this, context, 28);
        this.f33331a = b1Var;
        b1Var.r1();
        this.f33331a.setClipChildren(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.f33331a.setItemAnimator(jVar);
        this.f33331a.setSectionsDrawBackground(true);
        ((s4.j) this.f33331a.getItemAnimator()).C = false;
        this.f33331a.setLayoutManager(new s4.a0(1, false));
        this.f33331a.setVerticalScrollBarEnabled(false);
        s4.x xVar = new s4.x(new org.telegram.ui.Components.sz(this));
        this.f33333c = xVar;
        xVar.h(this.f33331a);
        frameLayout.addView(this.f33331a, w7.b6.c(-1.0f, -1));
        ag.b1 b1Var2 = this.f33331a;
        f10 f10Var = new f10(this, context);
        this.f33332b = f10Var;
        b1Var2.setAdapter(f10Var);
        this.f33331a.setOnItemClickListener(new rv(4, this, context));
        if (this.f33334f) {
            f0(false);
            this.f33334f = false;
            this.f33331a.v0(this.f33332b.b() - 1);
            org.telegram.messenger.i0.h3(new a10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final UndoView d0() {
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

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.O2) {
            f0(true);
        } else if (i10 == org.telegram.messenger.zs.Q2) {
            f0(true);
        }
    }

    public final void e0(a10 a10Var) {
        if (!this.e) {
            if (a10Var != null) {
                a10Var.run();
                return;
            }
            return;
        }
        this.e = false;
        getNotificationCenter().k(org.telegram.messenger.zs.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList S0 = getMessagesController().S0();
        int size = S0.size();
        for (int i10 = 0; i10 < size; i10 = c3.i0.j(((org.telegram.messenger.ap) S0.get(i10)).f14645a, i10, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new k(a10Var, 8));
    }

    public final void f0(boolean z10) {
        CharSequence L0;
        this.showTagsRow = -1;
        ag.b1 b1Var = this.f33331a;
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
        ArrayList arrayList3 = this.f33335n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().V0;
        ArrayList S0 = getMessagesController().S0();
        int i10 = 1;
        arrayList3.add(new hg.b(1, false));
        if (!arrayList4.isEmpty() && S0.size() < 10) {
            int size = arrayList3.size();
            String L02 = org.telegram.messenger.cd.L0(2131750719, null);
            ?? bVar = new hg.b(0, false);
            bVar.f36588c = L02;
            arrayList3.add(bVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? bVar2 = new hg.b(5, false);
                bVar2.e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i11);
                arrayList3.add(bVar2);
            }
            ag.b1 b1Var2 = this.f33331a;
            if (b1Var2 != null) {
                b1Var2.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(size, arrayList3.size() - 1)));
            }
            ?? bVar3 = new hg.b(3, false);
            bVar3.f36588c = null;
            arrayList3.add(bVar3);
        }
        if (!S0.isEmpty()) {
            this.f33337s = arrayList3.size();
            String L03 = org.telegram.messenger.cd.L0(2131750697, null);
            ?? bVar4 = new hg.b(0, false);
            bVar4.f36588c = L03;
            arrayList3.add(bVar4);
            this.f33336r = arrayList3.size();
            for (int i12 = 0; i12 < S0.size(); i12++) {
                ?? bVar5 = new hg.b(2, false);
                bVar5.d = (org.telegram.messenger.ap) S0.get(i12);
                arrayList3.add(bVar5);
                if (org.telegram.messenger.vp.r1(this.currentAccount).B7 && ((org.telegram.messenger.ap) S0.get(i12)).f14654m >= 0) {
                    this.f33340y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f33338w = size2;
            ag.b1 b1Var3 = this.f33331a;
            if (b1Var3 != null) {
                ArrayList arrayList5 = b1Var3.K2;
                int i13 = this.f33337s;
                int i14 = size2 - 1;
                if (S0.size() >= getMessagesController().N4) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.i0.w2(i13, i14 + i10)));
            }
        } else {
            this.f33338w = -1;
            this.f33337s = -1;
        }
        if (S0.size() < getMessagesController().N4) {
            String L04 = org.telegram.messenger.cd.L0(2131751717, null);
            ?? bVar6 = new hg.b(4, false);
            bVar6.f36588c = L04;
            arrayList3.add(bVar6);
        }
        ?? bVar7 = new hg.b(3, false);
        bVar7.f36588c = null;
        arrayList3.add(bVar7);
        this.f33339x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String L05 = org.telegram.messenger.cd.L0(2131750626, null);
        ?? bVar8 = new hg.b(6, false);
        bVar8.f36588c = L05;
        arrayList3.add(bVar8);
        if (!getUserConfig().q()) {
            L0 = org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131750624, null), org.telegram.ui.ActionBar.t6.L6, 2, new a10(this, 0), null);
        } else {
            L0 = org.telegram.messenger.cd.L0(2131750625, null);
        }
        ?? bVar9 = new hg.b(3, false);
        bVar9.f36588c = L0;
        arrayList3.add(bVar9);
        f10 f10Var = this.f33332b;
        if (f10Var != null) {
            if (z10) {
                f10Var.E(arrayList2, arrayList3);
            } else {
                f10Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33331a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33331a, 16, new Class[]{org.telegram.ui.Cells.p4.class, h10.class, g10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33331a, 196608, new Class[]{b10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ji));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f0(false);
        getMessagesController().a3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.zs.O2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.Q2);
        if (getMessagesController().V0.isEmpty()) {
            getMessagesController().b3();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.O2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.Q2);
        e0(null);
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
        f10 f10Var = this.f33332b;
        if (f10Var != null) {
            f10Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
