package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public gh.f1 f35476a;
    public l10 f35477b;
    public f2.h0 f35478c;
    public UndoView d;
    public boolean f35479e;
    public boolean f35480f;
    public final ArrayList h;
    public final ArrayList f35481n;
    public int f35482r;
    public int f35483s;
    private int showTagsRow;
    public int v;
    public int f35484w;
    public boolean f35485x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f35481n = new ArrayList();
        this.f35483s = -1;
        this.v = -1;
    }

    public static void T(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i9) {
        j10 j10Var;
        ArrayList arrayList = filtersSetupActivity.f35481n;
        if (i9 >= 0 && i9 < arrayList.size() && (j10Var = (j10) arrayList.get(i9)) != null) {
            int i10 = j10Var.f48814a;
            if (i10 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new rc(29, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.t8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                l10 l10Var = filtersSetupActivity.f35477b;
                int i11 = filtersSetupActivity.f35483s;
                l10Var.q(i11, filtersSetupActivity.v - i11);
            } else if (i10 == 2) {
                MessagesController.DialogFilter dialogFilter = j10Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new zf.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new n00(dialogFilter, null));
                    }
                }
            } else if (i10 == 4) {
                filtersSetupActivity.W(filtersSetupActivity.getParentLayout());
            }
        }
    }

    public final void W(org.telegram.ui.ActionBar.b5 b5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new zf.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (b5Var != null) {
            ((ActionBarLayout) b5Var).P(new n00(null, null));
        }
    }

    public final UndoView X() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Y(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        gh.f1 f1Var = this.f35476a;
        if (f1Var != null) {
            ArrayList arrayList = f1Var.G2;
            if (arrayList == null) {
                f1Var.G2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f35481n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i9 = 1;
        arrayList3.add(new wf.a(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? aVar = new wf.a(0, false);
            aVar.f39338c = string2;
            arrayList3.add(aVar);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                ?? aVar2 = new wf.a(5, false);
                aVar2.f39339e = arrayList4.get(i10);
                arrayList3.add(aVar2);
            }
            gh.f1 f1Var2 = this.f35476a;
            if (f1Var2 != null) {
                f1Var2.G2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new wf.a(3, false);
            aVar3.f39338c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f35483s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new wf.a(0, false);
            aVar4.f39338c = string3;
            arrayList3.add(aVar4);
            this.f35482r = arrayList3.size();
            for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                ?? aVar5 = new wf.a(2, false);
                aVar5.d = dialogFilters.get(i11);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i11).color >= 0) {
                    this.f35485x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            gh.f1 f1Var3 = this.f35476a;
            if (f1Var3 != null) {
                ArrayList arrayList5 = f1Var3.G2;
                int i12 = this.f35483s;
                int i13 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i9 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i12, i13 + i9)));
            }
        } else {
            this.v = -1;
            this.f35483s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new wf.a(4, false);
            aVar6.f39338c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new wf.a(3, false);
        aVar7.f39338c = null;
        arrayList3.add(aVar7);
        this.f35484w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new wf.a(6, false);
        aVar8.f39338c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.f6.L6, 2, new g10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new wf.a(3, false);
        aVar9.f39338c = string;
        arrayList3.add(aVar9);
        l10 l10Var = this.f35477b;
        if (l10Var != null) {
            if (z10) {
                l10Var.E(arrayList2, arrayList3);
            } else {
                l10Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 19));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        gh.f1 f1Var = new gh.f1(this, context, 29);
        this.f35476a = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35476a);
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.f35476a.setItemAnimator(nVar);
        ((f2.n) this.f35476a.getItemAnimator()).C = false;
        this.f35476a.setLayoutManager(new f2.m0(1, false));
        this.f35476a.setVerticalScrollBarEnabled(false);
        f2.h0 h0Var = new f2.h0(new o10(this));
        this.f35478c = h0Var;
        h0Var.d(this.f35476a);
        frameLayout.addView(this.f35476a, g7.e6.c(-1.0f, -1));
        gh.f1 f1Var2 = this.f35476a;
        l10 l10Var = new l10(this, context);
        this.f35477b = l10Var;
        f1Var2.setAdapter(l10Var);
        this.f35476a.setOnItemClickListener(new yr(9, this, context));
        if (this.f35480f) {
            Y(false);
            this.f35480f = false;
            this.f35476a.u0(this.f35477b.h() - 1);
            AndroidUtilities.runOnUIThread(new g10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogFiltersUpdated) {
            Y(true);
        } else if (i9 == NotificationCenter.suggestedFiltersLoaded) {
            Y(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 16, new Class[]{org.telegram.ui.Cells.m4.class, n10.class, h10.class, m10.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{h10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{h10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        int i9 = org.telegram.ui.ActionBar.f6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{h10.class}, new String[]{"moveImageView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{h10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 196608, new Class[]{h10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{n10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 32, new Class[]{n10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35476a, 0, new Class[]{n10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        Y(false);
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
        NotificationCenter notificationCenter = getNotificationCenter();
        int i9 = NotificationCenter.dialogFiltersUpdated;
        notificationCenter.removeObserver(this, i9);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (this.f35479e) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i9, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i10 = 0; i10 < size; i10 = j3.r0.e(dialogFilters.get(i10).f19649id, i10, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new ih.q5(5));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f35476a.setPadding(0, 0, 0, i12);
        this.f35476a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        l10 l10Var = this.f35477b;
        if (l10Var != null) {
            l10Var.l();
        }
    }
}
