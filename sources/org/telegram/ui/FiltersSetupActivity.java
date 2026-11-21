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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public et f43090a;
    public j00 f43091b;
    public v4.z f43092c;
    public UndoView d;
    public boolean f43093e;
    public boolean f43094f;
    public final ArrayList h;
    public final ArrayList f43095n;
    public int f43096r;
    public int f43097s;
    private int showTagsRow;
    public int f43098w;
    public int f43099x;
    public boolean f43100y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f43095n = new ArrayList();
        this.f43097s = -1;
        this.f43098w = -1;
    }

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i7) {
        h00 h00Var;
        ArrayList arrayList = filtersSetupActivity.f43095n;
        if (i7 >= 0 && i7 < arrayList.size() && (h00Var = (h00) arrayList.get(i7)) != null) {
            int i10 = h00Var.f56630a;
            if (i10 == 6) {
                if (!filtersSetupActivity.getUserConfig().q()) {
                    filtersSetupActivity.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().D7;
                org.telegram.messenger.mp messagesController = filtersSetupActivity.getMessagesController();
                boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
                SharedPreferences.Editor edit = messagesController.h7.edit();
                messagesController.D7 = z10;
                edit.putBoolean("folderTags", z10).apply();
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new e00(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.s8) view).setChecked(filtersSetupActivity.getMessagesController().D7);
                j00 j00Var = filtersSetupActivity.f43091b;
                int i11 = filtersSetupActivity.f43097s;
                j00Var.k(i11, filtersSetupActivity.f43098w - i11);
            } else if (i10 == 2) {
                org.telegram.messenger.ro roVar = h00Var.d;
                if (roVar != null && !roVar.d()) {
                    if (roVar.f26713p) {
                        filtersSetupActivity.showDialog(new ug.k0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new kz(roVar, null));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29508k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29578o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29789z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131750679, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 5));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        et etVar = new et(3, context, this);
        this.f43090a = etVar;
        etVar.r1();
        this.f43090a.setClipChildren(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59190m = false;
        this.f43090a.setItemAnimator(kVar);
        this.f43090a.setSectionsDrawBackground(true);
        ((v4.k) this.f43090a.getItemAnimator()).C = false;
        this.f43090a.setLayoutManager(new v4.c0(1, false));
        this.f43090a.setVerticalScrollBarEnabled(false);
        v4.z zVar = new v4.z(new org.telegram.ui.Components.qz(this));
        this.f43092c = zVar;
        zVar.h(this.f43090a);
        frameLayout.addView(this.f43090a, c8.ma.c(-1.0f, -1));
        et etVar2 = this.f43090a;
        j00 j00Var = new j00(this, context);
        this.f43091b = j00Var;
        etVar2.setAdapter(j00Var);
        this.f43090a.setOnItemClickListener(new at(6, this, context));
        if (this.f43094f) {
            g0(false);
            this.f43094f = false;
            this.f43090a.v0(this.f43091b.b() - 1);
            org.telegram.messenger.g0.h3(new d00(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.r4 r4Var) {
        int size = getMessagesController().V0().size();
        if ((size - 1 >= getMessagesController().O4 && !getUserConfig().q()) || size >= getMessagesController().P4) {
            showDialog(new ug.k0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (r4Var != null) {
            ((ActionBarLayout) r4Var).S(new kz(null, null));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.O2) {
            g0(true);
        } else if (i7 == org.telegram.messenger.ks.S2) {
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
            ((FrameLayout) this.fragmentView).addView(undoView, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(d00 d00Var) {
        if (!this.f43093e) {
            if (d00Var != null) {
                d00Var.run();
                return;
            }
            return;
        }
        this.f43093e = false;
        getNotificationCenter().k(org.telegram.messenger.ks.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList V0 = getMessagesController().V0();
        int size = V0.size();
        for (int i7 = 0; i7 < size; i7 = com.google.android.gms.internal.vision.e2.f(((org.telegram.messenger.ro) V0.get(i7)).f26700a, i7, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(d00Var, 8));
    }

    public final void g0(boolean z10) {
        CharSequence N0;
        this.showTagsRow = -1;
        et etVar = this.f43090a;
        if (etVar != null) {
            ArrayList arrayList = etVar.L2;
            if (arrayList == null) {
                etVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f43095n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().W0;
        ArrayList V0 = getMessagesController().V0();
        int i7 = 1;
        arrayList3.add(new rg.a(1, false));
        if (!arrayList4.isEmpty() && V0.size() < 10) {
            int size = arrayList3.size();
            String N02 = org.telegram.messenger.gd.N0(2131750704, null);
            ?? aVar = new rg.a(0, false);
            aVar.f48188c = N02;
            arrayList3.add(aVar);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                ?? aVar2 = new rg.a(5, false);
                aVar2.f48189e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                arrayList3.add(aVar2);
            }
            et etVar2 = this.f43090a;
            if (etVar2 != null) {
                etVar2.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new rg.a(3, false);
            aVar3.f48188c = null;
            arrayList3.add(aVar3);
        }
        if (!V0.isEmpty()) {
            this.f43097s = arrayList3.size();
            String N03 = org.telegram.messenger.gd.N0(2131750679, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.f48188c = N03;
            arrayList3.add(aVar4);
            this.f43096r = arrayList3.size();
            for (int i11 = 0; i11 < V0.size(); i11++) {
                ?? aVar5 = new rg.a(2, false);
                aVar5.d = (org.telegram.messenger.ro) V0.get(i11);
                arrayList3.add(aVar5);
                if (org.telegram.messenger.mp.u1(this.currentAccount).D7 && ((org.telegram.messenger.ro) V0.get(i11)).f26710m >= 0) {
                    this.f43100y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f43098w = size2;
            et etVar3 = this.f43090a;
            if (etVar3 != null) {
                ArrayList arrayList5 = etVar3.L2;
                int i12 = this.f43097s;
                int i13 = size2 - 1;
                if (V0.size() >= getMessagesController().P4) {
                    i7 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.g0.w2(i12, i13 + i7)));
            }
        } else {
            this.f43098w = -1;
            this.f43097s = -1;
        }
        if (V0.size() < getMessagesController().P4) {
            String N04 = org.telegram.messenger.gd.N0(2131751704, null);
            ?? aVar6 = new rg.a(4, false);
            aVar6.f48188c = N04;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new rg.a(3, false);
        aVar7.f48188c = null;
        arrayList3.add(aVar7);
        this.f43099x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String N05 = org.telegram.messenger.gd.N0(2131750608, null);
        ?? aVar8 = new rg.a(6, false);
        aVar8.f48188c = N05;
        arrayList3.add(aVar8);
        if (!getUserConfig().q()) {
            N0 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750606, null), org.telegram.ui.ActionBar.m6.L6, 2, new d00(this, 0), null);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131750607, null);
        }
        ?? aVar9 = new rg.a(3, false);
        aVar9.f48188c = N0;
        arrayList3.add(aVar9);
        j00 j00Var = this.f43091b;
        if (j00Var != null) {
            if (z10) {
                j00Var.E(arrayList2, arrayList3);
            } else {
                j00Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43090a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43090a, 16, new Class[]{org.telegram.ui.Cells.o4.class, l00.class, k00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29378d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43090a, 196608, new Class[]{f00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Mi));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        g0(false);
        getMessagesController().i3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.ks.O2);
        getNotificationCenter().c(this, org.telegram.messenger.ks.S2);
        if (getMessagesController().W0.isEmpty()) {
            getMessagesController().j3();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ks.O2);
        getNotificationCenter().n(this, org.telegram.messenger.ks.S2);
        f0(null);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        j00 j00Var = this.f43091b;
        if (j00Var != null) {
            j00Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
