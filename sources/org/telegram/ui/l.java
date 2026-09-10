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
public final class l extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.vl0 f34485a;
    public k f34486b;
    public boolean f34487c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f34488f;
    public final ArrayList h;

    public l() {
        super(null);
        this.f34487c = false;
        this.e = -3;
        this.f34488f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.f34488f;
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
        k kVar = this.f34486b;
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
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f34485a = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f34485a);
        this.f34485a.setLayoutManager(new fg.a0(1, false, 2));
        this.f34485a.setVerticalScrollBarEnabled(false);
        this.f34485a.setLayoutAnimation(null);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f34485a;
        k kVar = new k(this);
        this.f34486b = kVar;
        vl0Var2.setAdapter(kVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        this.f34485a.setItemAnimator(jVar);
        frameLayout.addView(this.f34485a, w7.a6.c(-1.0f, -1));
        this.f34485a.setOnItemClickListener(new i(this, 0));
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
            if (this.f34485a != null) {
                for (int i12 = 0; i12 < this.f34485a.getChildCount(); i12++) {
                    View childAt = this.f34485a.getChildAt(i12);
                    this.f34485a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i13 = ((j) arrayList.get(R)).d;
                            if (i13 == 1) {
                                ((org.telegram.ui.Cells.x8) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i13 == 4) {
                                ((org.telegram.ui.Cells.x8) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i13 == 7) {
                                ((org.telegram.ui.Cells.x8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f34487c = false;
        } else if (i10 == NotificationCenter.dialogFiltersUpdated) {
            U(true);
        }
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
        if (this.f34487c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new bi.g1(4));
            this.f34487c = false;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34485a.setPadding(0, 0, 0, i13);
        this.f34485a.setClipToPadding(false);
    }
}
