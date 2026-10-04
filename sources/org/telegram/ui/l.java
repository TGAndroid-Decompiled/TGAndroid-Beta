package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.zl0 f38134a;
    public k f38135b;
    public boolean f38136c;
    public TLRPC.GlobalPrivacySettings d;
    public int f38137e;
    public final ArrayList f38138f;
    public final ArrayList h;

    public l() {
        super(null);
        this.f38136c = false;
        this.f38137e = -3;
        this.f38138f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void S(boolean z10) {
        ArrayList arrayList = this.f38138f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new j(0, 0, LocaleController.getString("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new j(1, 1, LocaleController.getString("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new j(2, 2, LocaleController.getString("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().getDialogFilters().size() > 1) {
            arrayList2.add(new j(0, 3, LocaleController.getString("ArchiveSettingUnmutedChats")));
            arrayList2.add(new j(1, 4, LocaleController.getString("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new j(2, 5, LocaleController.getString("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new j(0, 6, LocaleController.getString("NewChatsFromNonContacts")));
        arrayList2.add(new j(1, 7, LocaleController.getString("NewChatsFromNonContactsCheck")));
        arrayList2.add(new j(2, 8, LocaleController.getString("ArchiveAndMuteInfo")));
        k kVar = this.f38135b;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.E(arrayList, arrayList2);
        } else {
            kVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ArchiveSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f38134a = zl0Var;
        zl0Var.s1();
        this.f38134a.setLayoutManager(new gg.b0(1, false, 2));
        this.f38134a.setVerticalScrollBarEnabled(false);
        this.f38134a.setSectionsDrawBackground(true);
        this.f38134a.setLayoutAnimation(null);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f38134a;
        k kVar = new k(this);
        this.f38135b = kVar;
        zl0Var2.setAdapter(kVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46570m = false;
        this.f38134a.setItemAnimator(jVar);
        frameLayout.addView(this.f38134a, w7.z5.c(-1.0f, -1));
        this.f38134a.setOnItemClickListener(new i(this, 0));
        getContactsController().loadGlobalPrivacySetting();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        S(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.f38134a != null) {
                for (int i12 = 0; i12 < this.f38134a.getChildCount(); i12++) {
                    View childAt = this.f38134a.getChildAt(i12);
                    this.f38134a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i13 = ((j) arrayList.get(R)).d;
                            if (i13 == 1) {
                                ((org.telegram.ui.Cells.w8) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i13 == 4) {
                                ((org.telegram.ui.Cells.w8) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i13 == 7) {
                                ((org.telegram.ui.Cells.w8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f38136c = false;
        } else if (i10 == NotificationCenter.dialogFiltersUpdated) {
            S(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f38134a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        super.onFragmentDestroy();
        if (this.f38136c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ai.u7(8));
            this.f38136c = false;
        }
    }
}
