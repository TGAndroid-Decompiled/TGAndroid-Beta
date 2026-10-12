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
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public bi.o0 f32088a;
    public i20 f32089b;
    public s4.y f32090c;
    public UndoView d;
    public boolean e;
    public boolean f32091f;
    public final ArrayList h;
    public final ArrayList f32092n;
    public int f32093r;
    public int f32094s;
    private int showTagsRow;
    public int v;
    public int f32095w;
    public boolean f32096x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.f32092n = new ArrayList();
        this.f32094s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        g20 g20Var;
        ArrayList arrayList = filtersSetupActivity.f32092n;
        if (i10 >= 0 && i10 < arrayList.size() && (g20Var = (g20) arrayList.get(i10)) != null) {
            int i11 = g20Var.f43203a;
            if (i11 == 6) {
                if (!filtersSetupActivity.getUserConfig().isPremium()) {
                    filtersSetupActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) filtersSetupActivity, 35, true));
                    return;
                }
                TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
                filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new to(22, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
                ((org.telegram.ui.Cells.w8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
                i20 i20Var = filtersSetupActivity.f32089b;
                int i12 = filtersSetupActivity.f32094s;
                i20Var.q(i12, filtersSetupActivity.v - i12);
            } else if (i11 == 2) {
                MessagesController.DialogFilter dialogFilter = g20Var.d;
                if (dialogFilter != null && !dialogFilter.isDefault()) {
                    if (dialogFilter.locked) {
                        filtersSetupActivity.showDialog(new sg.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                    } else {
                        filtersSetupActivity.presentFragment(new l10(dialogFilter, null));
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
            showDialog(new sg.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (b5Var != null) {
            ((ActionBarLayout) b5Var).P(new l10(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            ((FrameLayout) this.fragmentView).addView(undoView, w7.a6.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z10) {
        CharSequence string;
        this.showTagsRow = -1;
        bi.o0 o0Var = this.f32088a;
        if (o0Var != null) {
            ArrayList arrayList = o0Var.I2;
            if (arrayList == null) {
                o0Var.I2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f32092n;
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
            aVar.f36282c = string2;
            arrayList3.add(aVar);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ?? aVar2 = new pg.a(5, false);
                aVar2.e = arrayList4.get(i11);
                arrayList3.add(aVar2);
            }
            bi.o0 o0Var2 = this.f32088a;
            if (o0Var2 != null) {
                o0Var2.I2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ?? aVar3 = new pg.a(3, false);
            aVar3.f36282c = null;
            arrayList3.add(aVar3);
        }
        if (!dialogFilters.isEmpty()) {
            this.f32094s = arrayList3.size();
            String string3 = LocaleController.getString(R.string.Filters);
            ?? aVar4 = new pg.a(0, false);
            aVar4.f36282c = string3;
            arrayList3.add(aVar4);
            this.f32093r = arrayList3.size();
            for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                ?? aVar5 = new pg.a(2, false);
                aVar5.d = dialogFilters.get(i12);
                arrayList3.add(aVar5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i12).color >= 0) {
                    this.f32096x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            bi.o0 o0Var3 = this.f32088a;
            if (o0Var3 != null) {
                ArrayList arrayList5 = o0Var3.I2;
                int i13 = this.f32094s;
                int i14 = size2 - 1;
                if (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium) {
                    i10 = 0;
                }
                arrayList5.add(Long.valueOf(AndroidUtilities.pack(i13, i14 + i10)));
            }
        } else {
            this.v = -1;
            this.f32094s = -1;
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string4 = LocaleController.getString(R.string.CreateNewFilter);
            ?? aVar6 = new pg.a(4, false);
            aVar6.f36282c = string4;
            arrayList3.add(aVar6);
        }
        ?? aVar7 = new pg.a(3, false);
        aVar7.f36282c = null;
        arrayList3.add(aVar7);
        this.f32095w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string5 = LocaleController.getString(R.string.FolderShowTags);
        ?? aVar8 = new pg.a(6, false);
        aVar8.f36282c = string5;
        arrayList3.add(aVar8);
        if (!getUserConfig().isPremium()) {
            string = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.g6.L6, 2, new d20(this, 0));
        } else {
            string = LocaleController.getString(R.string.FolderShowTagsInfo);
        }
        ?? aVar9 = new pg.a(3, false);
        aVar9.f36282c = string;
        arrayList3.add(aVar9);
        i20 i20Var = this.f32089b;
        if (i20Var != null) {
            if (z10) {
                i20Var.E(arrayList2, arrayList3);
            } else {
                i20Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 26));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        bi.o0 o0Var = new bi.o0(this, context, 29);
        this.f32088a = o0Var;
        o0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32088a);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.f44872m = false;
        this.f32088a.setItemAnimator(kVar);
        ((s4.k) this.f32088a.getItemAnimator()).C = false;
        this.f32088a.setLayoutManager(new s4.b0(1, false));
        this.f32088a.setVerticalScrollBarEnabled(false);
        s4.y yVar = new s4.y(new l20(this));
        this.f32090c = yVar;
        yVar.d(this.f32088a);
        frameLayout.addView(this.f32088a, w7.a6.d(-1.0f, -1));
        bi.o0 o0Var2 = this.f32088a;
        i20 i20Var = new i20(this, context);
        this.f32089b = i20Var;
        o0Var2.setAdapter(i20Var);
        this.f32088a.setOnItemClickListener(new gw(4, this, context));
        if (this.f32091f) {
            Z(false);
            this.f32091f = false;
            this.f32088a.u0(this.f32089b.h() - 1);
            AndroidUtilities.runOnUIThread(new d20(this, 1), 200L);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 16, new Class[]{org.telegram.ui.Cells.m4.class, k20.class, e20.class, j20.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{e20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{e20.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20305z6));
        int i10 = org.telegram.ui.ActionBar.g6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{e20.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{e20.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 196608, new Class[]{e20.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{k20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20104o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 32, new Class[]{k20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32088a, 0, new Class[]{k20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20029k7));
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
            for (int i11 = 0; i11 < size; i11 = com.google.android.gms.internal.play_billing.k3.f(dialogFilters.get(i11).f16708id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new bi.g7(8));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f32088a.setPadding(0, 0, 0, i13);
        this.f32088a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        i20 i20Var = this.f32089b;
        if (i20Var != null) {
            i20Var.l();
        }
    }
}
