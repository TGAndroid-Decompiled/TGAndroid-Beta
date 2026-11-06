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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public zs f41232a;
    public e00 f41233b;
    public v4.y f41234c;
    public UndoView d;
    public boolean f41235e;
    public boolean f41236f;
    public final ArrayList h;
    public final ArrayList f41237n;
    public int f41238r;
    public int f41239s;
    private int showTagsRow;
    public int f41240w;
    public int f41241x;
    public boolean f41242y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f41237n = new ArrayList();
        this.f41239s = -1;
        this.f41240w = -1;
    }

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i7) {
        c00 c00Var;
        ArrayList arrayList = filtersSetupActivity.f41237n;
        if (i7 >= 0 && i7 < arrayList.size() && (c00Var = (c00) arrayList.get(i7)) != null) {
            int i10 = c00Var.f54439a;
            if (i10 == 6) {
                if (!filtersSetupActivity.getUserConfig().q()) {
                    filtersSetupActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().A7;
                org.telegram.messenger.qp messagesController = filtersSetupActivity.getMessagesController();
                boolean z9 = tL_messages_toggleDialogFilterTags.enabled;
                SharedPreferences.Editor edit = messagesController.f24767e7.edit();
                messagesController.A7 = z9;
                edit.putBoolean("folderTags", z9).apply();
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new ld(28, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.r8) view).setChecked(filtersSetupActivity.getMessagesController().A7);
                e00 e00Var = filtersSetupActivity.f41233b;
                int i11 = filtersSetupActivity.f41239s;
                e00Var.k(i11, filtersSetupActivity.f41240w - i11);
            } else if (i10 == 2) {
                org.telegram.messenger.vo voVar = c00Var.d;
                if (voVar != null && !voVar.e()) {
                    if (voVar.f26077p) {
                        filtersSetupActivity.showDialog(new ug.i0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new gz(voVar, null));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27979k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28049o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131750697, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 2));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zs zsVar = new zs(3, context, this);
        this.f41232a = zsVar;
        zsVar.r1();
        this.f41232a.setClipChildren(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f56978m = false;
        this.f41232a.setItemAnimator(kVar);
        this.f41232a.setSectionsDrawBackground(true);
        ((v4.k) this.f41232a.getItemAnimator()).C = false;
        this.f41232a.setLayoutManager(new v4.b0(1, false));
        this.f41232a.setVerticalScrollBarEnabled(false);
        v4.y yVar = new v4.y(new org.telegram.ui.Components.dz(this));
        this.f41234c = yVar;
        yVar.h(this.f41232a);
        frameLayout.addView(this.f41232a, c8.ha.c(-1.0f, -1));
        zs zsVar2 = this.f41232a;
        e00 e00Var = new e00(this, context);
        this.f41233b = e00Var;
        zsVar2.setAdapter(e00Var);
        this.f41232a.setOnItemClickListener(new pu(3, this, context));
        if (this.f41236f) {
            g0(false);
            this.f41236f = false;
            this.f41232a.v0(this.f41233b.b() - 1);
            org.telegram.messenger.g0.i3(new zz(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.q4 q4Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().L4 && !getUserConfig().q()) || size >= getMessagesController().M4) {
            showDialog(new ug.i0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (q4Var != null) {
            ((ActionBarLayout) q4Var).S(new gz(null, null));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.O2) {
            g0(true);
        } else if (i7 == org.telegram.messenger.qs.Q2) {
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
            ((FrameLayout) this.fragmentView).addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void f0(zz zzVar) {
        if (!this.f41235e) {
            if (zzVar != null) {
                zzVar.run();
                return;
            }
            return;
        }
        this.f41235e = false;
        getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = getMessagesController().T0();
        int size = T0.size();
        for (int i7 = 0; i7 < size; i7 = com.google.android.recaptcha.internal.a.f(((org.telegram.messenger.vo) T0.get(i7)).f26064a, i7, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(zzVar, 8));
    }

    public final void g0(boolean z9) {
        CharSequence M0;
        this.showTagsRow = -1;
        zs zsVar = this.f41232a;
        if (zsVar != null) {
            ArrayList arrayList = zsVar.K2;
            if (arrayList == null) {
                zsVar.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f41237n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().V0;
        ArrayList T0 = getMessagesController().T0();
        int i7 = 1;
        arrayList3.add(new rg.a(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M02 = org.telegram.messenger.hd.M0(2131750719, null);
            ?? aVar = new rg.a(0, false);
            aVar.f44513c = M02;
            arrayList3.add(aVar);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                ?? aVar2 = new rg.a(5, false);
                aVar2.f44514e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                arrayList3.add(aVar2);
            }
            zs zsVar2 = this.f41232a;
            if (zsVar2 != null) {
                zsVar2.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new rg.a(3, false);
            aVar3.f44513c = null;
            arrayList3.add(aVar3);
        }
        if (!T0.isEmpty()) {
            this.f41239s = arrayList3.size();
            String M03 = org.telegram.messenger.hd.M0(2131750697, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.f44513c = M03;
            arrayList3.add(aVar4);
            this.f41238r = arrayList3.size();
            for (int i11 = 0; i11 < T0.size(); i11++) {
                ?? aVar5 = new rg.a(2, false);
                aVar5.d = (org.telegram.messenger.vo) T0.get(i11);
                arrayList3.add(aVar5);
                if (org.telegram.messenger.qp.s1(this.currentAccount).A7 && ((org.telegram.messenger.vo) T0.get(i11)).f26074m >= 0) {
                    this.f41242y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f41240w = size2;
            zs zsVar3 = this.f41232a;
            if (zsVar3 != null) {
                ArrayList arrayList5 = zsVar3.K2;
                int i12 = this.f41239s;
                int i13 = size2 - 1;
                if (T0.size() >= getMessagesController().M4) {
                    i7 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.g0.w2(i12, i13 + i7)));
            }
        } else {
            this.f41240w = -1;
            this.f41239s = -1;
        }
        if (T0.size() < getMessagesController().M4) {
            String M04 = org.telegram.messenger.hd.M0(2131751717, null);
            ?? aVar6 = new rg.a(4, false);
            aVar6.f44513c = M04;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new rg.a(3, false);
        aVar7.f44513c = null;
        arrayList3.add(aVar7);
        this.f41241x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M05 = org.telegram.messenger.hd.M0(2131750626, null);
        ?? aVar8 = new rg.a(6, false);
        aVar8.f44513c = M05;
        arrayList3.add(aVar8);
        if (!getUserConfig().q()) {
            M0 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750624, null), org.telegram.ui.ActionBar.k6.L6, 2, new zz(this, 0), null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750625, null);
        }
        ?? aVar9 = new rg.a(3, false);
        aVar9.f44513c = M0;
        arrayList3.add(aVar9);
        e00 e00Var = this.f41233b;
        if (e00Var != null) {
            if (z9) {
                e00Var.E(arrayList2, arrayList3);
            } else {
                e00Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41232a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41232a, 16, new Class[]{org.telegram.ui.Cells.n4.class, g00.class, f00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27849d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41232a, 196608, new Class[]{a00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ji));
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
        getNotificationCenter().c(this, org.telegram.messenger.qs.O2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.Q2);
        if (getMessagesController().V0.isEmpty()) {
            getMessagesController().d3();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.O2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.Q2);
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
        e00 e00Var = this.f41233b;
        if (e00Var != null) {
            e00Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
