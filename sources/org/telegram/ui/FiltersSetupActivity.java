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
    public dt f43169a;
    public i00 f43170b;
    public v4.z f43171c;
    public UndoView d;
    public boolean f43172e;
    public boolean f43173f;
    public final ArrayList h;
    public final ArrayList f43174n;
    public int f43175r;
    public int f43176s;
    private int showTagsRow;
    public int f43177w;
    public int f43178x;
    public boolean f43179y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f43174n = new ArrayList();
        this.f43176s = -1;
        this.f43177w = -1;
    }

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i7) {
        g00 g00Var;
        ArrayList arrayList = filtersSetupActivity.f43174n;
        if (i7 >= 0 && i7 < arrayList.size() && (g00Var = (g00) arrayList.get(i7)) != null) {
            int i10 = g00Var.f56712a;
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
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new d00(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.r8) view).setChecked(filtersSetupActivity.getMessagesController().D7);
                i00 i00Var = filtersSetupActivity.f43170b;
                int i11 = filtersSetupActivity.f43176s;
                i00Var.k(i11, filtersSetupActivity.f43177w - i11);
            } else if (i10 == 2) {
                org.telegram.messenger.ro roVar = g00Var.d;
                if (roVar != null && !roVar.d()) {
                    if (roVar.f26786p) {
                        filtersSetupActivity.showDialog(new ug.k0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new jz(roVar, null));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29581k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29651o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131750679, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 5));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        dt dtVar = new dt(3, context, this);
        this.f43169a = dtVar;
        dtVar.r1();
        this.f43169a.setClipChildren(false);
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        this.f43169a.setItemAnimator(lVar);
        this.f43169a.setSectionsDrawBackground(true);
        ((v4.l) this.f43169a.getItemAnimator()).C = false;
        this.f43169a.setLayoutManager(new v4.c0(1, false));
        this.f43169a.setVerticalScrollBarEnabled(false);
        v4.z zVar = new v4.z(new org.telegram.ui.Components.nz(this));
        this.f43171c = zVar;
        zVar.h(this.f43169a);
        frameLayout.addView(this.f43169a, c8.na.c(-1.0f, -1));
        dt dtVar2 = this.f43169a;
        i00 i00Var = new i00(this, context);
        this.f43170b = i00Var;
        dtVar2.setAdapter(i00Var);
        this.f43169a.setOnItemClickListener(new zs(6, this, context));
        if (this.f43173f) {
            g0(false);
            this.f43173f = false;
            this.f43169a.v0(this.f43170b.b() - 1);
            org.telegram.messenger.g0.h3(new c00(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.r4 r4Var) {
        int size = getMessagesController().V0().size();
        if ((size - 1 >= getMessagesController().O4 && !getUserConfig().q()) || size >= getMessagesController().P4) {
            showDialog(new ug.k0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (r4Var != null) {
            ((ActionBarLayout) r4Var).S(new jz(null, null));
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
            ((FrameLayout) this.fragmentView).addView(undoView, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(c00 c00Var) {
        if (!this.f43172e) {
            if (c00Var != null) {
                c00Var.run();
                return;
            }
            return;
        }
        this.f43172e = false;
        getNotificationCenter().k(org.telegram.messenger.ks.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList V0 = getMessagesController().V0();
        int size = V0.size();
        for (int i7 = 0; i7 < size; i7 = com.google.android.gms.internal.vision.e2.f(((org.telegram.messenger.ro) V0.get(i7)).f26773a, i7, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(c00Var, 8));
    }

    public final void g0(boolean z10) {
        CharSequence N0;
        this.showTagsRow = -1;
        dt dtVar = this.f43169a;
        if (dtVar != null) {
            ArrayList arrayList = dtVar.L2;
            if (arrayList == null) {
                dtVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f43174n;
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
            aVar.f48016c = N02;
            arrayList3.add(aVar);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                ?? aVar2 = new rg.a(5, false);
                aVar2.f48017e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                arrayList3.add(aVar2);
            }
            dt dtVar2 = this.f43169a;
            if (dtVar2 != null) {
                dtVar2.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new rg.a(3, false);
            aVar3.f48016c = null;
            arrayList3.add(aVar3);
        }
        if (!V0.isEmpty()) {
            this.f43176s = arrayList3.size();
            String N03 = org.telegram.messenger.gd.N0(2131750679, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.f48016c = N03;
            arrayList3.add(aVar4);
            this.f43175r = arrayList3.size();
            for (int i11 = 0; i11 < V0.size(); i11++) {
                ?? aVar5 = new rg.a(2, false);
                aVar5.d = (org.telegram.messenger.ro) V0.get(i11);
                arrayList3.add(aVar5);
                if (org.telegram.messenger.mp.u1(this.currentAccount).D7 && ((org.telegram.messenger.ro) V0.get(i11)).f26783m >= 0) {
                    this.f43179y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f43177w = size2;
            dt dtVar3 = this.f43169a;
            if (dtVar3 != null) {
                ArrayList arrayList5 = dtVar3.L2;
                int i12 = this.f43176s;
                int i13 = size2 - 1;
                if (V0.size() >= getMessagesController().P4) {
                    i7 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.g0.w2(i12, i13 + i7)));
            }
        } else {
            this.f43177w = -1;
            this.f43176s = -1;
        }
        if (V0.size() < getMessagesController().P4) {
            String N04 = org.telegram.messenger.gd.N0(2131751704, null);
            ?? aVar6 = new rg.a(4, false);
            aVar6.f48016c = N04;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new rg.a(3, false);
        aVar7.f48016c = null;
        arrayList3.add(aVar7);
        this.f43178x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String N05 = org.telegram.messenger.gd.N0(2131750608, null);
        ?? aVar8 = new rg.a(6, false);
        aVar8.f48016c = N05;
        arrayList3.add(aVar8);
        if (!getUserConfig().q()) {
            N0 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750606, null), org.telegram.ui.ActionBar.n6.L6, 2, new c00(this, 0), null);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131750607, null);
        }
        ?? aVar9 = new rg.a(3, false);
        aVar9.f48016c = N0;
        arrayList3.add(aVar9);
        i00 i00Var = this.f43170b;
        if (i00Var != null) {
            if (z10) {
                i00Var.E(arrayList2, arrayList3);
            } else {
                i00Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43169a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43169a, 16, new Class[]{org.telegram.ui.Cells.o4.class, k00.class, j00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43169a, 196608, new Class[]{e00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Mi));
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
        i00 i00Var = this.f43170b;
        if (i00Var != null) {
            i00Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
