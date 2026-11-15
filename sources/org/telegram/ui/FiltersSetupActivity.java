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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public ct f42604a;
    public g00 f42605b;
    public v4.y f42606c;
    public UndoView d;
    public boolean f42607e;
    public boolean f42608f;
    public final ArrayList h;
    public final ArrayList f42609n;
    public int f42610r;
    public int f42611s;
    private int showTagsRow;
    public int f42612w;
    public int f42613x;
    public boolean f42614y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f42609n = new ArrayList();
        this.f42611s = -1;
        this.f42612w = -1;
    }

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i7) {
        e00 e00Var;
        ArrayList arrayList = filtersSetupActivity.f42609n;
        if (i7 >= 0 && i7 < arrayList.size() && (e00Var = (e00) arrayList.get(i7)) != null) {
            int i10 = e00Var.f56015a;
            if (i10 == 6) {
                if (!filtersSetupActivity.getUserConfig().q()) {
                    filtersSetupActivity.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().B7;
                org.telegram.messenger.np messagesController = filtersSetupActivity.getMessagesController();
                boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
                SharedPreferences.Editor edit = messagesController.f25283f7.edit();
                messagesController.B7 = z10;
                edit.putBoolean("folderTags", z10).apply();
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new b00(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.q8) view).setChecked(filtersSetupActivity.getMessagesController().B7);
                g00 g00Var = filtersSetupActivity.f42605b;
                int i11 = filtersSetupActivity.f42611s;
                g00Var.k(i11, filtersSetupActivity.f42612w - i11);
            } else if (i10 == 2) {
                org.telegram.messenger.so soVar = e00Var.d;
                if (soVar != null && !soVar.e()) {
                    if (soVar.f26565p) {
                        filtersSetupActivity.showDialog(new ug.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new hz(soVar, null));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28979k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29049o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131750696, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 3));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ct ctVar = new ct(3, context, this);
        this.f42604a = ctVar;
        ctVar.r1();
        this.f42604a.setClipChildren(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f42604a.setItemAnimator(kVar);
        this.f42604a.setSectionsDrawBackground(true);
        ((v4.k) this.f42604a.getItemAnimator()).C = false;
        this.f42604a.setLayoutManager(new v4.b0(1, false));
        this.f42604a.setVerticalScrollBarEnabled(false);
        v4.y yVar = new v4.y(new org.telegram.ui.Components.hz(this));
        this.f42606c = yVar;
        yVar.h(this.f42604a);
        frameLayout.addView(this.f42604a, c8.ja.c(-1.0f, -1));
        ct ctVar2 = this.f42604a;
        g00 g00Var = new g00(this, context);
        this.f42605b = g00Var;
        ctVar2.setAdapter(g00Var);
        this.f42604a.setOnItemClickListener(new tr(7, this, context));
        if (this.f42608f) {
            g0(false);
            this.f42608f = false;
            this.f42604a.v0(this.f42605b.b() - 1);
            org.telegram.messenger.g0.i3(new a00(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.o4 o4Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().M4 && !getUserConfig().q()) || size >= getMessagesController().N4) {
            showDialog(new ug.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (o4Var != null) {
            ((ActionBarLayout) o4Var).S(new hz(null, null));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.O2) {
            g0(true);
        } else if (i7 == org.telegram.messenger.ns.Q2) {
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
            ((FrameLayout) this.fragmentView).addView(undoView, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(a00 a00Var) {
        if (!this.f42607e) {
            if (a00Var != null) {
                a00Var.run();
                return;
            }
            return;
        }
        this.f42607e = false;
        getNotificationCenter().k(org.telegram.messenger.ns.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = getMessagesController().T0();
        int size = T0.size();
        for (int i7 = 0; i7 < size; i7 = com.google.android.gms.internal.vision.e2.f(((org.telegram.messenger.so) T0.get(i7)).f26552a, i7, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(a00Var, 8));
    }

    public final void g0(boolean z10) {
        CharSequence M0;
        this.showTagsRow = -1;
        ct ctVar = this.f42604a;
        if (ctVar != null) {
            ArrayList arrayList = ctVar.L2;
            if (arrayList == null) {
                ctVar.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f42609n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().W0;
        ArrayList T0 = getMessagesController().T0();
        int i7 = 1;
        arrayList3.add(new rg.a(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M02 = org.telegram.messenger.hd.M0(2131750718, null);
            ?? aVar = new rg.a(0, false);
            aVar.f46504c = M02;
            arrayList3.add(aVar);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                ?? aVar2 = new rg.a(5, false);
                aVar2.f46505e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                arrayList3.add(aVar2);
            }
            ct ctVar2 = this.f42604a;
            if (ctVar2 != null) {
                ctVar2.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new rg.a(3, false);
            aVar3.f46504c = null;
            arrayList3.add(aVar3);
        }
        if (!T0.isEmpty()) {
            this.f42611s = arrayList3.size();
            String M03 = org.telegram.messenger.hd.M0(2131750696, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.f46504c = M03;
            arrayList3.add(aVar4);
            this.f42610r = arrayList3.size();
            for (int i11 = 0; i11 < T0.size(); i11++) {
                ?? aVar5 = new rg.a(2, false);
                aVar5.d = (org.telegram.messenger.so) T0.get(i11);
                arrayList3.add(aVar5);
                if (org.telegram.messenger.np.s1(this.currentAccount).B7 && ((org.telegram.messenger.so) T0.get(i11)).f26562m >= 0) {
                    this.f42614y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f42612w = size2;
            ct ctVar3 = this.f42604a;
            if (ctVar3 != null) {
                ArrayList arrayList5 = ctVar3.L2;
                int i12 = this.f42611s;
                int i13 = size2 - 1;
                if (T0.size() >= getMessagesController().N4) {
                    i7 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.g0.w2(i12, i13 + i7)));
            }
        } else {
            this.f42612w = -1;
            this.f42611s = -1;
        }
        if (T0.size() < getMessagesController().N4) {
            String M04 = org.telegram.messenger.hd.M0(2131751716, null);
            ?? aVar6 = new rg.a(4, false);
            aVar6.f46504c = M04;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new rg.a(3, false);
        aVar7.f46504c = null;
        arrayList3.add(aVar7);
        this.f42613x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M05 = org.telegram.messenger.hd.M0(2131750625, null);
        ?? aVar8 = new rg.a(6, false);
        aVar8.f46504c = M05;
        arrayList3.add(aVar8);
        if (!getUserConfig().q()) {
            M0 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750623, null), org.telegram.ui.ActionBar.j6.L6, 2, new a00(this, 0), null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750624, null);
        }
        ?? aVar9 = new rg.a(3, false);
        aVar9.f46504c = M0;
        arrayList3.add(aVar9);
        g00 g00Var = this.f42605b;
        if (g00Var != null) {
            if (z10) {
                g00Var.E(arrayList2, arrayList3);
            } else {
                g00Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f42604a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42604a, 16, new Class[]{org.telegram.ui.Cells.n4.class, i00.class, h00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42604a, 196608, new Class[]{c00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Mi));
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
        getNotificationCenter().c(this, org.telegram.messenger.ns.O2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.Q2);
        if (getMessagesController().W0.isEmpty()) {
            getMessagesController().d3();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.O2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.Q2);
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
        g00 g00Var = this.f42605b;
        if (g00Var != null) {
            g00Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
