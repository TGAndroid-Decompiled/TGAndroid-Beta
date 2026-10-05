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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public ai.w0 f33770a;
    public d20 f33771b;
    public s4.y f33772c;
    public UndoView d;
    public boolean f33773e;
    public boolean f33774f;
    public final ArrayList h;
    public final ArrayList f33775n;
    public int f33776r;
    public int f33777s;
    private int showTagsRow;
    public int v;
    public int f33778w;
    public boolean f33779x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f33775n = new ArrayList();
        this.f33777s = -1;
        this.v = -1;
    }

    public static void S(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        b20 b20Var;
        ArrayList arrayList = filtersSetupActivity.f33775n;
        if (i10 >= 0 && i10 < arrayList.size() && (b20Var = (b20) arrayList.get(i10)) != null) {
            int i11 = b20Var.f17192a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new no(22, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.w8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                d20 d20Var = filtersSetupActivity.f33771b;
                int i12 = filtersSetupActivity.f33777s;
                d20Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = b20Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new rg.k0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new f10(dialogFilter, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.W(filtersSetupActivity.getParentLayout());
            }
        }
    }

    public final void W(org.telegram.ui.ActionBar.c5 c5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new rg.k0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (c5Var != null) {
            ((ActionBarLayout) c5Var).P(new f10(null, null));
        }
    }

    public final UndoView X() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Y(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        ai.w0 w0Var = this.f33770a;
        if (w0Var != null) {
            ArrayList arrayList = w0Var.L2;
            if (arrayList == null) {
                w0Var.L2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f33775n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 1;
        arrayList3.add(new og.a(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? aVar = new og.a(0, false);
            aVar.f35024c = string2;
            arrayList3.add(aVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? aVar2 = new og.a(5, false);
                aVar2.f35025e = arrayList4.get(i11);
                arrayList3.add(aVar2);
            }
            ai.w0 w0Var2 = this.f33770a;
            if (w0Var2 != null) {
                w0Var2.L2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new og.a(3, false);
            aVar3.f35024c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f33777s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new og.a(0, false);
            aVar4.f35024c = string3;
            arrayList3.add(aVar4);
            this.f33776r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? aVar5 = new og.a(2, false);
                aVar5.d = dialogFilters.get(i12);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f33779x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            ai.w0 w0Var3 = this.f33770a;
            if (w0Var3 != null) {
                ArrayList arrayList5 = w0Var3.L2;
                int i13 = this.f33777s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f33777s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new og.a(4, false);
            aVar6.f35024c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new og.a(3, false);
        aVar7.f35024c = null;
        arrayList3.add(aVar7);
        this.f33778w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new og.a(6, false);
        aVar8.f35024c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.i6.L6, 2, new y10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new og.a(3, false);
        aVar9.f35024c = string;
        arrayList3.add(aVar9);
        d20 d20Var = this.f33771b;
        if (d20Var != null) {
            if (z10) {
                d20Var.E(arrayList2, arrayList3);
            } else {
                d20Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 24));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ai.w0 w0Var = new ai.w0(this, context, 29);
        this.f33770a = w0Var;
        w0Var.r1();
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46577m = false;
        this.f33770a.setItemAnimator(jVar);
        this.f33770a.setSectionsDrawBackground(true);
        ((s4.j) this.f33770a.getItemAnimator()).C = false;
        this.f33770a.setLayoutManager(new s4.c0(1, false));
        this.f33770a.setVerticalScrollBarEnabled(false);
        s4.y yVar = new s4.y(new g20(this));
        this.f33772c = yVar;
        yVar.e(this.f33770a);
        frameLayout.addView(this.f33770a, w7.z5.c(-1.0f, -1));
        ai.w0 w0Var2 = this.f33770a;
        d20 d20Var = new d20(this, context);
        this.f33771b = d20Var;
        w0Var2.setAdapter(d20Var);
        this.f33770a.setOnItemClickListener(new pw(2, this, context));
        if (this.f33774f) {
            Y(false);
            this.f33774f = false;
            this.f33770a.v0(this.f33771b.h() - 1);
            AndroidUtilities.runOnUIThread(new y10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            Y(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            Y(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f33770a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 16, new Class[]{org.telegram.ui.Cells.m4.class, f20.class, z10.class, e20.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{z10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{z10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21233z6));
        int i10 = org.telegram.ui.ActionBar.i6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{z10.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{z10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 196608, new Class[]{z10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{f20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21030o6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 32, new Class[]{f20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33770a, 0, new Class[]{f20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20957k7));
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
        int i10 = NotificationCenter.dialogFiltersUpdated;
        notificationCenter.removeObserver(this, i10);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (this.f33773e) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i11 = 0; i11 < size; i11 = com.google.android.gms.internal.vision.e2.e(dialogFilters.get(i11).f17266id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new ai.u7(8));
        }
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
        d20 d20Var = this.f33771b;
        if (d20Var != null) {
            d20Var.l();
        }
    }
}
