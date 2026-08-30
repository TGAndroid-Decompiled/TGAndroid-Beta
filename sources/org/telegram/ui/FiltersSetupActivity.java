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
    public lh.e1 f31597a;
    public z10 f31598b;
    public f2.e0 f31599c;
    public UndoView d;
    public boolean e;
    public boolean f31600f;
    public final ArrayList h;
    public final ArrayList f31601n;
    public int f31602r;
    public int f31603s;
    private int showTagsRow;
    public int v;
    public int f31604w;
    public boolean f31605x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f31601n = new ArrayList();
        this.f31603s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        x10 x10Var;
        ArrayList arrayList = filtersSetupActivity.f31601n;
        if (i10 >= 0 && i10 < arrayList.size() && (x10Var = (x10) arrayList.get(i10)) != null) {
            int i11 = x10Var.f1808a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new lo(22, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.s8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                z10 z10Var = filtersSetupActivity.f31598b;
                int i12 = filtersSetupActivity.f31603s;
                z10Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = x10Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new eg.v0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new b10(dialogFilter, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.X(filtersSetupActivity.getParentLayout());
            }
        }
    }

    public final void X(org.telegram.ui.ActionBar.e5 e5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new eg.v0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (e5Var != null) {
            ((ActionBarLayout) e5Var).P(new b10(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z4) {
        CharSequence string;
        this.showTagsRow = -1;
        lh.e1 e1Var = this.f31597a;
        if (e1Var != null) {
            ArrayList arrayList = e1Var.H2;
            if (arrayList == null) {
                e1Var.H2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f31601n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 1;
        arrayList3.add(new bg.b(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? bVar = new bg.b(0, false);
            bVar.f39830c = string2;
            arrayList3.add(bVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? bVar2 = new bg.b(5, false);
                bVar2.e = arrayList4.get(i11);
                arrayList3.add(bVar2);
            }
            lh.e1 e1Var2 = this.f31597a;
            if (e1Var2 != null) {
                e1Var2.H2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? bVar3 = new bg.b(3, false);
            bVar3.f39830c = null;
            arrayList3.add(bVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f31603s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? bVar4 = new bg.b(0, false);
            bVar4.f39830c = string3;
            arrayList3.add(bVar4);
            this.f31602r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? bVar5 = new bg.b(2, false);
                bVar5.d = dialogFilters.get(i12);
                arrayList3.add(bVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f31605x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            lh.e1 e1Var3 = this.f31597a;
            if (e1Var3 != null) {
                ArrayList arrayList5 = e1Var3.H2;
                int i13 = this.f31603s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f31603s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? bVar6 = new bg.b(4, false);
            bVar6.f39830c = string4;
            arrayList3.add(bVar6);
        }
        ?? bVar7 = new bg.b(3, false);
        bVar7.f39830c = null;
        arrayList3.add(bVar7);
        this.f31604w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? bVar8 = new bg.b(6, false);
        bVar8.f39830c = string5;
        arrayList3.add(bVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.j6.L6, 2, new u10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? bVar9 = new bg.b(3, false);
        bVar9.f39830c = string;
        arrayList3.add(bVar9);
        z10 z10Var = this.f31598b;
        if (z10Var != null) {
            if (z4) {
                z10Var.E(arrayList2, arrayList3);
            } else {
                z10Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 11));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        lh.e1 e1Var = new lh.e1(this, context, 27);
        this.f31597a = e1Var;
        e1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f31597a);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.f5818m = false;
        this.f31597a.setItemAnimator(lVar);
        ((f2.l) this.f31597a.getItemAnimator()).C = false;
        this.f31597a.setLayoutManager(new f2.i0(1, false));
        this.f31597a.setVerticalScrollBarEnabled(false);
        f2.e0 e0Var = new f2.e0(new c20(this));
        this.f31599c = e0Var;
        e0Var.d(this.f31597a);
        frameLayout.addView(this.f31597a, k7.b6.c(-1.0f, -1));
        lh.e1 e1Var2 = this.f31597a;
        z10 z10Var = new z10(this, context);
        this.f31598b = z10Var;
        e1Var2.setAdapter(z10Var);
        this.f31597a.setOnItemClickListener(new qs(8, this, context));
        if (this.f31600f) {
            Z(false);
            this.f31600f = false;
            this.f31597a.u0(this.f31598b.h() - 1);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 16, new Class[]{org.telegram.ui.Cells.m4.class, b20.class, v10.class, a20.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{v10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{v10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        int i10 = org.telegram.ui.ActionBar.j6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{v10.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{v10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 196608, new Class[]{v10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{b20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20103o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 32, new Class[]{b20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31597a, 0, new Class[]{b20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20032k7));
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
        if (this.e) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i11 = 0; i11 < size; i11 = yh.e(dialogFilters.get(i11).f16669id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new nh.p5(4));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31597a.setPadding(0, 0, 0, i13);
        this.f31597a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        z10 z10Var = this.f31598b;
        if (z10Var != null) {
            z10Var.l();
        }
    }
}
