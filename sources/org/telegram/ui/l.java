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
    public org.telegram.ui.Components.wl0 f35204a;
    public k f35205b;
    public boolean f35206c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f35207f;
    public final ArrayList h;

    public l() {
        super(null);
        this.f35206c = false;
        this.e = -3;
        this.f35207f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.f35207f;
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
        k kVar = this.f35205b;
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
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ArchiveSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19006a7, false));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f35204a = wl0Var;
        wl0Var.q1();
        this.f35204a.setLayoutManager(new gg.b0(1, false, 2));
        this.f35204a.setVerticalScrollBarEnabled(false);
        this.f35204a.setLayoutAnimation(null);
        org.telegram.ui.Components.wl0 wl0Var2 = this.f35204a;
        k kVar = new k(this);
        this.f35205b = kVar;
        wl0Var2.setAdapter(kVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.f42964m = false;
        this.f35204a.setItemAnimator(jVar);
        frameLayout.addView(this.f35204a, w7.y5.c(-1.0f, -1));
        this.f35204a.setOnItemClickListener(new i(this, 0));
        getContactsController().loadGlobalPrivacySetting();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        U(false);
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
            if (this.f35204a != null) {
                for (int i12 = 0; i12 < this.f35204a.getChildCount(); i12++) {
                    View childAt = this.f35204a.getChildAt(i12);
                    this.f35204a.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= 0) {
                        ArrayList arrayList = this.h;
                        if (S < arrayList.size()) {
                            int i13 = ((j) arrayList.get(S)).d;
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
            this.f35206c = false;
        } else if (i10 == NotificationCenter.dialogFiltersUpdated) {
            U(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.wl0 getListViewForSimpleGlass() {
        return this.f35204a;
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
        if (this.f35206c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ai.t7(8));
            this.f35206c = false;
        }
    }
}
