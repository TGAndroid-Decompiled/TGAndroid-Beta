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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public k10 f33442a;
    public p10 f33443b;
    public s4.y f33444c;
    public UndoView d;
    public boolean e;
    public boolean f33445f;
    public final ArrayList h;
    public final ArrayList f33446n;
    public int f33447r;
    public int f33448s;
    private int showTagsRow;
    public int v;
    public int f33449w;
    public boolean f33450x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f33446n = new ArrayList();
        this.f33448s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        n10 n10Var;
        ArrayList arrayList = filtersSetupActivity.f33446n;
        if (i10 >= 0 && i10 < arrayList.size() && (n10Var = (n10) arrayList.get(i10)) != null) {
            int i11 = n10Var.f44713a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new vc(29, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.w8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                p10 p10Var = filtersSetupActivity.f33443b;
                int i12 = filtersSetupActivity.f33448s;
                p10Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = n10Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new sg.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new q00(dialogFilter, null));
                    }
                }
            } else if (i11 == 4) {
                filtersSetupActivity.Y(filtersSetupActivity.getParentLayout());
            }
        }
    }

    public final void Y(org.telegram.ui.ActionBar.h5 h5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new sg.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (h5Var != null) {
            ((ActionBarLayout) h5Var).Q(new q00(null, null));
        }
    }

    public final UndoView Z() {
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

    public final void a0(j10 j10Var) {
        if (!this.e) {
            if (j10Var != null) {
                j10Var.run();
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
        for (int i10 = 0; i10 < size; i10 = com.google.android.gms.internal.play_billing.k3.f(dialogFilters.get(i10).f17862id, i10, 1, tL_messages_updateDialogFiltersOrder.order)) {
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(j10Var, 8));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21311k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21386o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    public final void b0(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        k10 k10Var = this.f33442a;
        if (k10Var != null) {
            ArrayList arrayList = k10Var.J2;
            if (arrayList == null) {
                k10Var.J2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f33446n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i10 = 1;
        arrayList3.add(new pg.a(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string2 = LocaleController.getString(R.string.FilterRecommended);
            ?? aVar = new pg.a(0, false);
            aVar.f39742c = string2;
            arrayList3.add(aVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? aVar2 = new pg.a(5, false);
                aVar2.e = arrayList4.get(i11);
                arrayList3.add(aVar2);
            }
            k10 k10Var2 = this.f33442a;
            if (k10Var2 != null) {
                k10Var2.J2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new pg.a(3, false);
            aVar3.f39742c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f33448s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new pg.a(0, false);
            aVar4.f39742c = string3;
            arrayList3.add(aVar4);
            this.f33447r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? aVar5 = new pg.a(2, false);
                aVar5.d = dialogFilters.get(i12);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f33450x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            k10 k10Var3 = this.f33442a;
            if (k10Var3 != null) {
                ArrayList arrayList5 = k10Var3.J2;
                int i13 = this.f33448s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f33448s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new pg.a(4, false);
            aVar6.f39742c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new pg.a(3, false);
        aVar7.f39742c = null;
        arrayList3.add(aVar7);
        this.f33449w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new pg.a(6, false);
        aVar8.f39742c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.k6.L6, 2, new j10(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new pg.a(3, false);
        aVar9.f39742c = string;
        arrayList3.add(aVar9);
        p10 p10Var = this.f33443b;
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
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 27));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        k10 k10Var = new k10(0, context, this);
        this.f33442a = k10Var;
        k10Var.t1();
        this.f33442a.setClipChildren(false);
        this.actionBar.setAdaptiveBackground(this.f33442a);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f46377m = false;
        this.f33442a.setItemAnimator(kVar);
        ((s4.k) this.f33442a.getItemAnimator()).C = false;
        this.f33442a.setLayoutManager(new s4.b0(1, false));
        this.f33442a.setVerticalScrollBarEnabled(false);
        s4.y yVar = new s4.y(new s10(this));
        this.f33444c = yVar;
        yVar.d(this.f33442a);
        frameLayout.addView(this.f33442a, w7.z5.c(-1.0f, -1));
        k10 k10Var2 = this.f33442a;
        p10 p10Var = new p10(this, context);
        this.f33443b = p10Var;
        k10Var2.setAdapter(p10Var);
        this.f33442a.setOnItemClickListener(new ks(7, this, context));
        if (this.f33445f) {
            b0(false);
            this.f33445f = false;
            this.f33442a.u0(this.f33443b.h() - 1);
            AndroidUtilities.runOnUIThread(new j10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            b0(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            b0(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33442a, 16, new Class[]{org.telegram.ui.Cells.l4.class, r10.class, q10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33442a, 196608, new Class[]{l10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        b0(false);
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
        a0(null);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33442a.setPadding(0, 0, 0, i13);
        this.f33442a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        p10 p10Var = this.f33443b;
        if (p10Var != null) {
            p10Var.l();
        }
    }
}
