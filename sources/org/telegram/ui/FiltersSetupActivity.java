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

    public hh.f1 f35479a;

    public o10 f35480b;

    public f2.f0 f35481c;
    public UndoView d;

    public boolean f35482e;

    public boolean f35483f;
    public final ArrayList h;

    public final ArrayList f35484n;

    public int f35485r;

    public int f35486s;
    private int showTagsRow;
    public int v;

    public int f35487w;

    public boolean f35488x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f35484n = new ArrayList();
        this.f35486s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        m10 m10Var;
        ArrayList arrayList = filtersSetupActivity.f35484n;
        if (i10 < 0 || i10 >= arrayList.size() || (m10Var = (m10) arrayList.get(i10)) == null) {
            return;
        }
        int i11 = m10Var.f49413a;
        if (i11 == 6) {
            if (!filtersSetupActivity.getUserConfig().isPremium()) {
                filtersSetupActivity.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) filtersSetupActivity, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
            filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
            filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new gg(26, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
            ((org.telegram.ui.Cells.p8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
            o10 o10Var = filtersSetupActivity.f35480b;
            int i12 = filtersSetupActivity.f35486s;
            o10Var.q(i12, filtersSetupActivity.v - i12);
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                filtersSetupActivity.X(filtersSetupActivity.getParentLayout());
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter = m10Var.d;
        if (dialogFilter == null || dialogFilter.isDefault()) {
            return;
        }
        if (dialogFilter.locked) {
            filtersSetupActivity.showDialog(new ag.i1(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
        } else {
            filtersSetupActivity.presentFragment(new q00(dialogFilter, null));
        }
    }

    public final void X(org.telegram.ui.ActionBar.b5 b5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new ag.i1(3, this.currentAccount, getParentActivity(), this, null));
        } else if (b5Var != null) {
            ((ActionBarLayout) b5Var).P(new q00(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z10) {
        this.showTagsRow = -1;
        hh.f1 f1Var = this.f35479a;
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
        ArrayList arrayList3 = this.f35484n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        arrayList3.add(new m10(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            m10 m10Var = new m10(0, false);
            m10Var.f40285c = string;
            arrayList3.add(m10Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i10);
                m10 m10Var2 = new m10(5, false);
                m10Var2.f40286e = tL_dialogFilterSuggested;
                arrayList3.add(m10Var2);
            }
            hh.f1 f1Var2 = this.f35479a;
            if (f1Var2 != null) {
                f1Var2.G2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            m10 m10Var3 = new m10(3, false);
            m10Var3.f40285c = null;
            arrayList3.add(m10Var3);
        }
        if (dialogFilters.isEmpty()) {
            this.v = -1;
            this.f35486s = -1;
        } else {
            this.f35486s = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            m10 m10Var4 = new m10(0, false);
            m10Var4.f40285c = string2;
            arrayList3.add(m10Var4);
            this.f35485r = arrayList3.size();
            for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                m10 m10Var5 = new m10(2, false);
                m10Var5.d = dialogFilter;
                arrayList3.add(m10Var5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i11).color >= 0) {
                    this.f35488x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            hh.f1 f1Var3 = this.f35479a;
            if (f1Var3 != null) {
                f1Var3.G2.add(Long.valueOf(AndroidUtilities.pack(this.f35486s, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            m10 m10Var6 = new m10(4, false);
            m10Var6.f40285c = string3;
            arrayList3.add(m10Var6);
        }
        m10 m10Var7 = new m10(3, false);
        m10Var7.f40285c = null;
        arrayList3.add(m10Var7);
        this.f35487w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        m10 m10Var8 = new m10(6, false);
        m10Var8.f40285c = string4;
        arrayList3.add(m10Var8);
        CharSequence charSequenceReplaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.g6.L6, 2, new j10(this, 0)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        m10 m10Var9 = new m10(3, false);
        m10Var9.f40285c = charSequenceReplaceSingleTag;
        arrayList3.add(m10Var9);
        o10 o10Var = this.f35480b;
        if (o10Var != null) {
            if (z10) {
                o10Var.E(arrayList2, arrayList3);
            } else {
                o10Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 20));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        hh.f1 f1Var = new hh.f1(this, context, 29);
        this.f35479a = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35479a);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.f35479a.setItemAnimator(lVar);
        ((f2.l) this.f35479a.getItemAnimator()).C = false;
        this.f35479a.setLayoutManager(new f2.k0(1, false));
        this.f35479a.setVerticalScrollBarEnabled(false);
        f2.f0 f0Var = new f2.f0(new r10(this));
        this.f35481c = f0Var;
        f0Var.d(this.f35479a);
        frameLayout.addView(this.f35479a, h7.z5.c(-1.0f, -1));
        hh.f1 f1Var2 = this.f35479a;
        o10 o10Var = new o10(this, context);
        this.f35480b = o10Var;
        f1Var2.setAdapter(o10Var);
        this.f35479a.setOnItemClickListener(new zr(9, this, context));
        if (this.f35483f) {
            Z(false);
            this.f35483f = false;
            this.f35479a.u0(this.f35480b.h() - 1);
            AndroidUtilities.runOnUIThread(new j10(this, 1), 200L);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 16, new Class[]{org.telegram.ui.Cells.j4.class, q10.class, k10.class, p10.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{k10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{k10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        int i10 = org.telegram.ui.ActionBar.g6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{k10.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{k10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 196608, new Class[]{k10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{q10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23251o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 32, new Class[]{q10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35479a, 0, new Class[]{q10.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23182k7));
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
        if (this.f35482e) {
            int iF = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            while (iF < size) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(iF);
                iF = i0.a.f(dialogFilter.f19622id, iF, 1, tL_messages_updateDialogFiltersOrder.order);
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new jh.m5(5));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35479a.setPadding(0, 0, 0, i13);
        this.f35479a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        o10 o10Var = this.f35480b;
        if (o10Var != null) {
            o10Var.l();
        }
    }
}
