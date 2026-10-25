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
    public k10 f35505a;
    public p10 f35506b;
    public s4.z f35507c;
    public UndoView d;
    public boolean e;
    public boolean f35508f;
    public final ArrayList h;
    public final ArrayList f35509n;
    public int f35510r;
    public int f35511s;
    private int showTagsRow;
    public int v;
    public int f35512w;
    public boolean f35513x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f35509n = new ArrayList();
        this.f35511s = -1;
        this.v = -1;
    }

    public static void V(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        n10 n10Var;
        ArrayList arrayList = filtersSetupActivity.f35509n;
        if (i10 >= 0 && i10 < arrayList.size() && (n10Var = (n10) arrayList.get(i10)) != null) {
            int i11 = n10Var.f47037a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new j10(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.a9) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                p10 p10Var = filtersSetupActivity.f35506b;
                int i12 = filtersSetupActivity.f35511s;
                p10Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = n10Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new tg.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new o00(dialogFilter, null));
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
            ((ActionBarLayout) j5Var).R(new o00(null, null));
        }
    }

    public final UndoView a0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23483k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23558o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    public final void b0(i10 i10Var) {
        if (!this.e) {
            if (i10Var != null) {
                i10Var.run();
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
        for (int i10 = 0; i10 < size; i10 = c3.h0.i(dialogFilters.get(i10).f19549id, i10, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(i10Var, 8));
    }

    public final void c0(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        k10 k10Var = this.f35505a;
        if (k10Var != null) {
            ArrayList arrayList = k10Var.K2;
            if (arrayList == null) {
                k10Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f35509n;
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
            aVar.f41737c = string2;
            arrayList3.add(aVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? aVar2 = new qg.a(5, false);
                aVar2.e = arrayList4.get(i11);
                arrayList3.add(aVar2);
            }
            k10 k10Var2 = this.f35505a;
            if (k10Var2 != null) {
                k10Var2.K2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new qg.a(3, false);
            aVar3.f41737c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f35511s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new qg.a(0, false);
            aVar4.f41737c = string3;
            arrayList3.add(aVar4);
            this.f35510r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? aVar5 = new qg.a(2, false);
                aVar5.d = dialogFilters.get(i12);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f35513x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            k10 k10Var3 = this.f35505a;
            if (k10Var3 != null) {
                ArrayList arrayList5 = k10Var3.K2;
                int i13 = this.f35511s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f35511s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new qg.a(4, false);
            aVar6.f41737c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new qg.a(3, false);
        aVar7.f41737c = null;
        arrayList3.add(aVar7);
        this.f35512w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new qg.a(6, false);
        aVar8.f41737c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.y6.L6, 2, new i10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new qg.a(3, false);
        aVar9.f41737c = string;
        arrayList3.add(aVar9);
        p10 p10Var = this.f35506b;
        if (p10Var != null) {
            if (z10) {
                p10Var.E(arrayList2, arrayList3);
            } else {
                p10Var.l();
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
        k10 k10Var = new k10(0, context, this);
        this.f35505a = k10Var;
        k10Var.u1();
        this.f35505a.setClipChildren(false);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47760m = false;
        this.f35505a.setItemAnimator(lVar);
        this.f35505a.setSectionsDrawBackground(true);
        ((s4.l) this.f35505a.getItemAnimator()).C = false;
        this.f35505a.setLayoutManager(new s4.c0(1, false));
        this.f35505a.setVerticalScrollBarEnabled(false);
        s4.z zVar = new s4.z(new s10(this));
        this.f35507c = zVar;
        zVar.h(this.f35505a);
        frameLayout.addView(this.f35505a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        k10 k10Var2 = this.f35505a;
        p10 p10Var = new p10(this, context);
        this.f35506b = p10Var;
        k10Var2.setAdapter(p10Var);
        this.f35505a.setOnItemClickListener(new org.telegram.ui.Components.voip.k1(11, this, context));
        if (this.f35508f) {
            c0(false);
            this.f35508f = false;
            this.f35505a.v0(this.f35506b.h() - 1);
            AndroidUtilities.runOnUIThread(new i10(this, 1), 200L);
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
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f35505a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35505a, 16, new Class[]{org.telegram.ui.Cells.q4.class, r10.class, q10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35505a, 196608, new Class[]{l10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vh));
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
        getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.suggestedFiltersLoaded);
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
        p10 p10Var = this.f35506b;
        if (p10Var != null) {
            p10Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
