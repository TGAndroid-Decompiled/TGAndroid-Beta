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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public mh.d1 f34117a;
    public a20 f34118b;
    public f2.f0 f34119c;
    public UndoView d;
    public boolean f34120e;
    public boolean f34121f;
    public final ArrayList h;
    public final ArrayList f34122n;
    public int f34123r;
    public int f34124s;
    private int showTagsRow;
    public int v;
    public int f34125w;
    public boolean f34126x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f34122n = new ArrayList();
        this.f34124s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        y10 y10Var;
        ArrayList arrayList = filtersSetupActivity.f34122n;
        if (i10 >= 0 && i10 < arrayList.size() && (y10Var = (y10) arrayList.get(i10)) != null) {
            int i11 = y10Var.f2505a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new lo(22, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.s8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                a20 a20Var = filtersSetupActivity.f34118b;
                int i12 = filtersSetupActivity.f34124s;
                a20Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = y10Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new fg.v0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new b10(dialogFilter, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.X(filtersSetupActivity.getParentLayout());
            }
        }
    }

    public final void X(org.telegram.ui.ActionBar.f5 f5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new fg.v0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (f5Var != null) {
            ((ActionBarLayout) f5Var).P(new b10(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z4) {
        CharSequence string;
        this.showTagsRow = -1;
        mh.d1 d1Var = this.f34117a;
        if (d1Var != null) {
            ArrayList arrayList = d1Var.H2;
            if (arrayList == null) {
                d1Var.H2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f34122n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 1;
        arrayList3.add(new cg.b(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? bVar = new cg.b(0, false);
            bVar.f43518c = string2;
            arrayList3.add(bVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? bVar2 = new cg.b(5, false);
                bVar2.f43519e = arrayList4.get(i11);
                arrayList3.add(bVar2);
            }
            mh.d1 d1Var2 = this.f34117a;
            if (d1Var2 != null) {
                d1Var2.H2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? bVar3 = new cg.b(3, false);
            bVar3.f43518c = null;
            arrayList3.add(bVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f34124s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? bVar4 = new cg.b(0, false);
            bVar4.f43518c = string3;
            arrayList3.add(bVar4);
            this.f34123r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? bVar5 = new cg.b(2, false);
                bVar5.d = dialogFilters.get(i12);
                arrayList3.add(bVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f34126x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            mh.d1 d1Var3 = this.f34117a;
            if (d1Var3 != null) {
                ArrayList arrayList5 = d1Var3.H2;
                int i13 = this.f34124s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f34124s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? bVar6 = new cg.b(4, false);
            bVar6.f43518c = string4;
            arrayList3.add(bVar6);
        }
        ?? bVar7 = new cg.b(3, false);
        bVar7.f43518c = null;
        arrayList3.add(bVar7);
        this.f34125w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? bVar8 = new cg.b(6, false);
        bVar8.f43518c = string5;
        arrayList3.add(bVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.k6.L6, 2, new u10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? bVar9 = new cg.b(3, false);
        bVar9.f43518c = string;
        arrayList3.add(bVar9);
        a20 a20Var = this.f34118b;
        if (a20Var != null) {
            if (z4) {
                a20Var.E(arrayList2, arrayList3);
            } else {
                a20Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 11));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        mh.d1 d1Var = new mh.d1(this, context, 27);
        this.f34117a = d1Var;
        d1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34117a);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        this.f34117a.setItemAnimator(lVar);
        ((f2.l) this.f34117a.getItemAnimator()).C = false;
        this.f34117a.setLayoutManager(new f2.j0(1, false));
        this.f34117a.setVerticalScrollBarEnabled(false);
        f2.f0 f0Var = new f2.f0(new d20(this));
        this.f34119c = f0Var;
        f0Var.d(this.f34117a);
        frameLayout.addView(this.f34117a, k7.c6.c(-1.0f, -1));
        mh.d1 d1Var2 = this.f34117a;
        a20 a20Var = new a20(this, context);
        this.f34118b = a20Var;
        d1Var2.setAdapter(a20Var);
        this.f34117a.setOnItemClickListener(new rs(8, this, context));
        if (this.f34121f) {
            Z(false);
            this.f34121f = false;
            this.f34117a.u0(this.f34118b.h() - 1);
            AndroidUtilities.runOnUIThread(new u10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            Z(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            Z(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 16, new Class[]{org.telegram.ui.Cells.m4.class, c20.class, w10.class, b20.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{w10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{w10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        int i10 = org.telegram.ui.ActionBar.k6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{w10.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{w10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 196608, new Class[]{w10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{c20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21857o6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 32, new Class[]{c20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34117a, 0, new Class[]{c20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21786k7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        Z(false);
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
        int i10 = NotificationCenter.dialogFiltersUpdated;
        notificationCenter.removeObserver(this, i10);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (this.f34120e) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i11 = 0; i11 < size; i11 = yh.d(dialogFilters.get(i11).f18055id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new oh.p5(4));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34117a.setPadding(0, 0, 0, i13);
        this.f34117a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        a20 a20Var = this.f34118b;
        if (a20Var != null) {
            a20Var.l();
        }
    }
}
