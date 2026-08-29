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
    public jh.e1 f35543a;
    public n10 f35544b;
    public f2.e0 f35545c;
    public UndoView d;
    public boolean f35546e;
    public boolean f35547f;
    public final ArrayList h;
    public final ArrayList f35548n;
    public int f35549r;
    public int f35550s;
    private int showTagsRow;
    public int v;
    public int f35551w;
    public boolean f35552x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f35548n = new ArrayList();
        this.f35550s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        l10 l10Var;
        ArrayList arrayList = filtersSetupActivity.f35548n;
        if (i10 >= 0 && i10 < arrayList.size() && (l10Var = (l10) arrayList.get(i10)) != null) {
            int i11 = l10Var.f50845a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new zg(25, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.q8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                n10 n10Var = filtersSetupActivity.f35544b;
                int i12 = filtersSetupActivity.f35550s;
                n10Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = l10Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new cg.v0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new p00(dialogFilter, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.X(filtersSetupActivity.getParentLayout());
            }
        }
    }

    public final void X(org.telegram.ui.ActionBar.b5 b5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new cg.v0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (b5Var != null) {
            ((ActionBarLayout) b5Var).P(new p00(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        jh.e1 e1Var = this.f35543a;
        if (e1Var != null) {
            ArrayList arrayList = e1Var.G2;
            if (arrayList == null) {
                e1Var.G2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f35548n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 1;
        arrayList3.add(new zf.a(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? aVar = new zf.a(0, false);
            aVar.f40051c = string2;
            arrayList3.add(aVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? aVar2 = new zf.a(5, false);
                aVar2.f40052e = arrayList4.get(i11);
                arrayList3.add(aVar2);
            }
            jh.e1 e1Var2 = this.f35543a;
            if (e1Var2 != null) {
                e1Var2.G2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new zf.a(3, false);
            aVar3.f40051c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f35550s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new zf.a(0, false);
            aVar4.f40051c = string3;
            arrayList3.add(aVar4);
            this.f35549r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? aVar5 = new zf.a(2, false);
                aVar5.d = dialogFilters.get(i12);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f35552x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            jh.e1 e1Var3 = this.f35543a;
            if (e1Var3 != null) {
                ArrayList arrayList5 = e1Var3.G2;
                int i13 = this.f35550s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f35550s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new zf.a(4, false);
            aVar6.f40051c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new zf.a(3, false);
        aVar7.f40051c = null;
        arrayList3.add(aVar7);
        this.f35551w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new zf.a(6, false);
        aVar8.f40051c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.g6.L6, 2, new i10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new zf.a(3, false);
        aVar9.f40051c = string;
        arrayList3.add(aVar9);
        n10 n10Var = this.f35544b;
        if (n10Var != null) {
            if (z10) {
                n10Var.E(arrayList2, arrayList3);
            } else {
                n10Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 11));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        jh.e1 e1Var = new jh.e1(this, context, 28);
        this.f35543a = e1Var;
        e1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35543a);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.f35543a.setItemAnimator(lVar);
        ((f2.l) this.f35543a.getItemAnimator()).C = false;
        this.f35543a.setLayoutManager(new f2.j0(1, false));
        this.f35543a.setVerticalScrollBarEnabled(false);
        f2.e0 e0Var = new f2.e0(new q10(this));
        this.f35545c = e0Var;
        e0Var.d(this.f35543a);
        frameLayout.addView(this.f35543a, i7.f6.c(-1.0f, -1));
        jh.e1 e1Var2 = this.f35543a;
        n10 n10Var = new n10(this, context);
        this.f35544b = n10Var;
        e1Var2.setAdapter(n10Var);
        this.f35543a.setOnItemClickListener(new xr(9, this, context));
        if (this.f35547f) {
            Z(false);
            this.f35547f = false;
            this.f35543a.u0(this.f35544b.h() - 1);
            AndroidUtilities.runOnUIThread(new i10(this, 1), 200L);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 16, new Class[]{org.telegram.ui.Cells.k4.class, p10.class, j10.class, o10.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{j10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{j10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        int i10 = org.telegram.ui.ActionBar.g6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{j10.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{j10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 196608, new Class[]{j10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{p10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23260o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 32, new Class[]{p10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35543a, 0, new Class[]{p10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23190k7));
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
        if (this.f35546e) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i11 = 0; i11 < size; i11 = th.d(dialogFilters.get(i11).f19620id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new lh.o5(5));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35543a.setPadding(0, 0, 0, i13);
        this.f35543a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        n10 n10Var = this.f35544b;
        if (n10Var != null) {
            n10Var.l();
        }
    }
}
