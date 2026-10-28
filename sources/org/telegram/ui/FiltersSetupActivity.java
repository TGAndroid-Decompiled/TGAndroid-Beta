package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public m10 f35532a;
    public r10 f35533b;
    public s4.z f35534c;
    public UndoView d;
    public boolean e;
    public boolean f35535f;
    public final ArrayList h;
    public final ArrayList f35536n;
    public int f35537r;
    public int f35538s;
    private int showTagsRow;
    public int v;
    public int f35539w;
    public boolean f35540x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f35536n = new ArrayList();
        this.f35538s = -1;
        this.v = -1;
    }

    public static void V(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        p10 p10Var;
        ArrayList arrayList = filtersSetupActivity.f35536n;
        if (i10 >= 0 && i10 < arrayList.size() && (p10Var = (p10) arrayList.get(i10)) != null) {
            int i11 = p10Var.f47075a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new l10(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.a9) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                r10 r10Var = filtersSetupActivity.f35533b;
                int i12 = filtersSetupActivity.f35538s;
                r10Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = p10Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new tg.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new q00(dialogFilter, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.Z(filtersSetupActivity.getParentLayout());
            }
        }
    }

    public final void Z(org.telegram.ui.ActionBar.j5 j5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new tg.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (j5Var != null) {
            ((ActionBarLayout) j5Var).R(new q00(null, null));
        }
    }

    public final UndoView a0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23486k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23561o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    public final void b0(k10 k10Var) {
        if (!this.e) {
            if (k10Var != null) {
                k10Var.run();
                return;
            }
            return;
        }
        this.e = false;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getMessagesStorage().saveDialogFiltersOrder();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int size = dialogFilters.size();
        for (int i10 = 0; i10 < size; i10 = c3.h0.i(dialogFilters.get(i10).f19548id, i10, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(k10Var, 8));
    }

    public final void c0(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        m10 m10Var = this.f35532a;
        if (m10Var != null) {
            ArrayList arrayList = m10Var.K2;
            if (arrayList == null) {
                m10Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f35536n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 1;
        arrayList3.add(new qg.a(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? aVar = new qg.a(0, false);
            aVar.f42273c = string2;
            arrayList3.add(aVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? aVar2 = new qg.a(5, false);
                aVar2.e = arrayList4.get(i11);
                arrayList3.add(aVar2);
            }
            m10 m10Var2 = this.f35532a;
            if (m10Var2 != null) {
                m10Var2.K2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new qg.a(3, false);
            aVar3.f42273c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f35538s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new qg.a(0, false);
            aVar4.f42273c = string3;
            arrayList3.add(aVar4);
            this.f35537r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? aVar5 = new qg.a(2, false);
                aVar5.d = dialogFilters.get(i12);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f35540x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            m10 m10Var3 = this.f35532a;
            if (m10Var3 != null) {
                ArrayList arrayList5 = m10Var3.K2;
                int i13 = this.f35538s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f35538s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new qg.a(4, false);
            aVar6.f42273c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new qg.a(3, false);
        aVar7.f42273c = null;
        arrayList3.add(aVar7);
        this.f35539w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new qg.a(6, false);
        aVar8.f42273c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.y6.L6, 2, new k10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new qg.a(3, false);
        aVar9.f42273c = string;
        arrayList3.add(aVar9);
        r10 r10Var = this.f35533b;
        if (r10Var != null) {
            if (z10) {
                r10Var.E(arrayList2, arrayList3);
            } else {
                r10Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 29));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        m10 m10Var = new m10(0, context, this);
        this.f35532a = m10Var;
        m10Var.u1();
        this.f35532a.setClipChildren(false);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        this.f35532a.setItemAnimator(lVar);
        this.f35532a.setSectionsDrawBackground(true);
        ((s4.l) this.f35532a.getItemAnimator()).C = false;
        this.f35532a.setLayoutManager(new s4.c0(1, false));
        this.f35532a.setVerticalScrollBarEnabled(false);
        s4.z zVar = new s4.z(new u10(this));
        this.f35534c = zVar;
        zVar.h(this.f35532a);
        frameLayout.addView(this.f35532a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        m10 m10Var2 = this.f35532a;
        r10 r10Var = new r10(this, context);
        this.f35533b = r10Var;
        m10Var2.setAdapter(r10Var);
        this.f35532a.setOnItemClickListener(new org.telegram.ui.Components.voip.k1(11, this, context));
        if (this.f35535f) {
            c0(false);
            this.f35535f = false;
            this.f35532a.v0(this.f35533b.h() - 1);
            AndroidUtilities.runOnUIThread(new k10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            c0(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            c0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f35532a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35532a, 16, new Class[]{org.telegram.ui.Cells.q4.class, t10.class, s10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35532a, 196608, new Class[]{n10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        c0(false);
        getMessagesController().loadRemoteFilters(true);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (getMessagesController().suggestedFilters.isEmpty()) {
            getMessagesController().loadSuggestedFilters();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        b0(null);
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
        r10 r10Var = this.f35533b;
        if (r10Var != null) {
            r10Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
