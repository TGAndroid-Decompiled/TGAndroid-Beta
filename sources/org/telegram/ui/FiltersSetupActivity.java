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
    public bi.y1 f29912a;
    public f20 f29913b;
    public s4.y f29914c;
    public UndoView d;
    public boolean e;
    public boolean f29915f;
    public final ArrayList h;
    public final ArrayList f29916n;
    public int f29917r;
    public int f29918s;
    private int showTagsRow;
    public int v;
    public int f29919w;
    public boolean f29920x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f29916n = new ArrayList();
        this.f29918s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        d20 d20Var;
        ArrayList arrayList = filtersSetupActivity.f29916n;
        if (i10 >= 0 && i10 < arrayList.size() && (d20Var = (d20) arrayList.get(i10)) != null) {
            int i11 = d20Var.f14046a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new org.telegram.ui.Components.th(17, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.x8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                f20 f20Var = filtersSetupActivity.f29913b;
                int i12 = filtersSetupActivity.f29918s;
                f20Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = d20Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new qg.k0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new h10(dialogFilter, null));
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
            showDialog(new qg.k0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (f5Var != null) {
            ((ActionBarLayout) f5Var).P(new h10(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        bi.y1 y1Var = this.f29912a;
        if (y1Var != null) {
            ArrayList arrayList = y1Var.K2;
            if (arrayList == null) {
                y1Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f29916n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 1;
        arrayList3.add(new ng.a(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? aVar = new ng.a(0, false);
            aVar.f31810c = string2;
            arrayList3.add(aVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? aVar2 = new ng.a(5, false);
                aVar2.e = arrayList4.get(i11);
                arrayList3.add(aVar2);
            }
            bi.y1 y1Var2 = this.f29912a;
            if (y1Var2 != null) {
                y1Var2.K2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new ng.a(3, false);
            aVar3.f31810c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f29918s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new ng.a(0, false);
            aVar4.f31810c = string3;
            arrayList3.add(aVar4);
            this.f29917r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? aVar5 = new ng.a(2, false);
                aVar5.d = dialogFilters.get(i12);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f29920x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            bi.y1 y1Var3 = this.f29912a;
            if (y1Var3 != null) {
                ArrayList arrayList5 = y1Var3.K2;
                int i13 = this.f29918s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f29918s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new ng.a(4, false);
            aVar6.f31810c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new ng.a(3, false);
        aVar7.f31810c = null;
        arrayList3.add(aVar7);
        this.f29919w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new ng.a(6, false);
        aVar8.f31810c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.j6.L6, 2, new a20(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new ng.a(3, false);
        aVar9.f31810c = string;
        arrayList3.add(aVar9);
        f20 f20Var = this.f29913b;
        if (f20Var != null) {
            if (z10) {
                f20Var.E(arrayList2, arrayList3);
            } else {
                f20Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 24));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        bi.y1 y1Var = new bi.y1(this, context, 28);
        this.f29912a = y1Var;
        y1Var.o1();
        this.actionBar.setAdaptiveBackground(this.f29912a);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        this.f29912a.setItemAnimator(jVar);
        ((s4.j) this.f29912a.getItemAnimator()).C = false;
        this.f29912a.setLayoutManager(new s4.c0(1, false));
        this.f29912a.setVerticalScrollBarEnabled(false);
        s4.y yVar = new s4.y(new i20(this));
        this.f29914c = yVar;
        yVar.d(this.f29912a);
        frameLayout.addView(this.f29912a, w7.a6.c(-1.0f, -1));
        bi.y1 y1Var2 = this.f29912a;
        f20 f20Var = new f20(this, context);
        this.f29913b = f20Var;
        y1Var2.setAdapter(f20Var);
        this.f29912a.setOnItemClickListener(new org.telegram.ui.Components.km(25, this, context));
        if (this.f29915f) {
            Z(false);
            this.f29915f = false;
            this.f29912a.u0(this.f29913b.h() - 1);
            AndroidUtilities.runOnUIThread(new a20(this, 1), 200L);
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 16, new Class[]{org.telegram.ui.Cells.m4.class, h20.class, b20.class, g20.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{b20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{b20.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        int i10 = org.telegram.ui.ActionBar.j6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{b20.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{b20.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 196608, new Class[]{b20.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{h20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18126o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 32, new Class[]{h20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29912a, 0, new Class[]{h20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18056k7));
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
            for (int i11 = 0; i11 < size; i11 = com.google.android.gms.internal.vision.e2.d(dialogFilters.get(i11).f14645id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new bi.g1(4));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f29912a.setPadding(0, 0, 0, i13);
        this.f29912a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        f20 f20Var = this.f29913b;
        if (f20Var != null) {
            f20Var.l();
        }
    }
}
