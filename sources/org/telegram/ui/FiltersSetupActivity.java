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
    public bt f41243a;
    public g00 f41244b;
    public v4.y f41245c;
    public UndoView d;
    public boolean f41246e;
    public boolean f41247f;
    public final ArrayList h;
    public final ArrayList f41248n;
    public int f41249r;
    public int f41250s;
    private int showTagsRow;
    public int f41251w;
    public int f41252x;
    public boolean f41253y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f41248n = new ArrayList();
        this.f41250s = -1;
        this.f41251w = -1;
    }

    public static void Z(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i7) {
        e00 e00Var;
        ArrayList arrayList = filtersSetupActivity.f41248n;
        if (i7 >= 0 && i7 < arrayList.size() && (e00Var = (e00) arrayList.get(i7)) != null) {
            int i10 = e00Var.f54544a;
            if (i10 == 6) {
                if (!filtersSetupActivity.getUserConfig().q()) {
                    filtersSetupActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().A7;
                org.telegram.messenger.qp messagesController = filtersSetupActivity.getMessagesController();
                boolean z9 = tL_messages_toggleDialogFilterTags.enabled;
                SharedPreferences.Editor edit = messagesController.f24774e7.edit();
                messagesController.A7 = z9;
                edit.putBoolean("folderTags", z9).apply();
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new ld(28, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.r8) view).setChecked(filtersSetupActivity.getMessagesController().A7);
                g00 g00Var = filtersSetupActivity.f41244b;
                int i11 = filtersSetupActivity.f41250s;
                g00Var.k(i11, filtersSetupActivity.f41251w - i11);
            } else if (i10 == 2) {
                org.telegram.messenger.vo voVar = e00Var.d;
                if (voVar != null && !voVar.e()) {
                    if (voVar.f26083p) {
                        filtersSetupActivity.showDialog(new ug.i0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new iz(voVar, null));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27995k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28065o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131750696, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 2));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        bt btVar = new bt(3, context, this);
        this.f41243a = btVar;
        btVar.r1();
        this.f41243a.setClipChildren(false);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57083m = false;
        this.f41243a.setItemAnimator(kVar);
        this.f41243a.setSectionsDrawBackground(true);
        ((v4.k) this.f41243a.getItemAnimator()).C = false;
        this.f41243a.setLayoutManager(new v4.b0(1, false));
        this.f41243a.setVerticalScrollBarEnabled(false);
        v4.y yVar = new v4.y(new org.telegram.ui.Components.ez(this));
        this.f41245c = yVar;
        yVar.h(this.f41243a);
        frameLayout.addView(this.f41243a, c8.ha.c(-1.0f, -1));
        bt btVar2 = this.f41243a;
        g00 g00Var = new g00(this, context);
        this.f41244b = g00Var;
        btVar2.setAdapter(g00Var);
        this.f41243a.setOnItemClickListener(new ru(3, this, context));
        if (this.f41247f) {
            g0(false);
            this.f41247f = false;
            this.f41243a.v0(this.f41244b.b() - 1);
            org.telegram.messenger.g0.i3(new b00(this, 1), 200L);
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.ActionBar.q4 q4Var) {
        int size = getMessagesController().T0().size();
        if ((size - 1 >= getMessagesController().L4 && !getUserConfig().q()) || size >= getMessagesController().M4) {
            showDialog(new ug.i0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (q4Var != null) {
            ((ActionBarLayout) q4Var).S(new iz(null, null));
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

    public final void f0(b00 b00Var) {
        if (!this.f41246e) {
            if (b00Var != null) {
                b00Var.run();
                return;
            }
            return;
        }
        this.f41246e = false;
        getNotificationCenter().k(org.telegram.messenger.qs.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = getMessagesController().T0();
        int size = T0.size();
        for (int i7 = 0; i7 < size; i7 = com.google.android.recaptcha.internal.a.f(((org.telegram.messenger.vo) T0.get(i7)).f26070a, i7, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(b00Var, 8));
    }

    public final void g0(boolean z9) {
        CharSequence M0;
        this.showTagsRow = -1;
        bt btVar = this.f41243a;
        if (btVar != null) {
            ArrayList arrayList = btVar.K2;
            if (arrayList == null) {
                btVar.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f41248n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().V0;
        ArrayList T0 = getMessagesController().T0();
        int i7 = 1;
        arrayList3.add(new rg.a(1, false));
        if (!arrayList4.isEmpty() && T0.size() < 10) {
            int size = arrayList3.size();
            String M02 = org.telegram.messenger.id.M0(2131750718, null);
            ?? aVar = new rg.a(0, false);
            aVar.f45139c = M02;
            arrayList3.add(aVar);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                ?? aVar2 = new rg.a(5, false);
                aVar2.f45140e = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i10);
                arrayList3.add(aVar2);
            }
            bt btVar2 = this.f41243a;
            if (btVar2 != null) {
                btVar2.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new rg.a(3, false);
            aVar3.f45139c = null;
            arrayList3.add(aVar3);
        }
        if (!T0.isEmpty()) {
            this.f41250s = arrayList3.size();
            String M03 = org.telegram.messenger.id.M0(2131750696, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.f45139c = M03;
            arrayList3.add(aVar4);
            this.f41249r = arrayList3.size();
            for (int i11 = 0; i11 < T0.size(); i11++) {
                ?? aVar5 = new rg.a(2, false);
                aVar5.d = (org.telegram.messenger.vo) T0.get(i11);
                arrayList3.add(aVar5);
                if (org.telegram.messenger.qp.s1(this.currentAccount).A7 && ((org.telegram.messenger.vo) T0.get(i11)).f26080m >= 0) {
                    this.f41253y = true;
                }
            }
            int size2 = arrayList3.size();
            this.f41251w = size2;
            bt btVar3 = this.f41243a;
            if (btVar3 != null) {
                ArrayList arrayList5 = btVar3.K2;
                int i12 = this.f41250s;
                int i13 = size2 - 1;
                if (T0.size() >= getMessagesController().M4) {
                    i7 = 0;
                }
                arrayList5.add(Long.valueOf(org.telegram.messenger.g0.w2(i12, i13 + i7)));
            }
        } else {
            this.f41251w = -1;
            this.f41250s = -1;
        }
        if (T0.size() < getMessagesController().M4) {
            String M04 = org.telegram.messenger.id.M0(2131751716, null);
            ?? aVar6 = new rg.a(4, false);
            aVar6.f45139c = M04;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new rg.a(3, false);
        aVar7.f45139c = null;
        arrayList3.add(aVar7);
        this.f41252x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String M05 = org.telegram.messenger.id.M0(2131750625, null);
        ?? aVar8 = new rg.a(6, false);
        aVar8.f45139c = M05;
        arrayList3.add(aVar8);
        if (!getUserConfig().q()) {
            M0 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750623, null), org.telegram.ui.ActionBar.l6.L6, 2, new b00(this, 0), null);
        } else {
            M0 = org.telegram.messenger.id.M0(2131750624, null);
        }
        ?? aVar9 = new rg.a(3, false);
        aVar9.f45139c = M0;
        arrayList3.add(aVar9);
        g00 g00Var = this.f41244b;
        if (g00Var != null) {
            if (z9) {
                g00Var.E(arrayList2, arrayList3);
            } else {
                g00Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f41243a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41243a, 16, new Class[]{org.telegram.ui.Cells.n4.class, i00.class, h00.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27865d6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41243a, 196608, new Class[]{c00.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ji));
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
        g00 g00Var = this.f41244b;
        if (g00Var != null) {
            g00Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
