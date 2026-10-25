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
public final class k extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.mm0 f40764a;
    public j f40765b;
    public boolean f40766c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f40767f;
    public final ArrayList h;

    public k() {
        super(null);
        this.f40766c = false;
        this.e = -3;
        this.f40767f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void V(boolean z10) {
        ArrayList arrayList = this.f40767f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new i(0, 0, LocaleController.getString("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new i(1, 1, LocaleController.getString("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new i(2, 2, LocaleController.getString("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().getDialogFilters().size() > 1) {
            arrayList2.add(new i(0, 3, LocaleController.getString("ArchiveSettingUnmutedChats")));
            arrayList2.add(new i(1, 4, LocaleController.getString("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new i(2, 5, LocaleController.getString("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new i(0, 6, LocaleController.getString("NewChatsFromNonContacts")));
        arrayList2.add(new i(1, 7, LocaleController.getString("NewChatsFromNonContactsCheck")));
        arrayList2.add(new i(2, 8, LocaleController.getString("ArchiveAndMuteInfo")));
        j jVar = this.f40765b;
        if (jVar == null) {
            return;
        }
        if (z10) {
            jVar.E(arrayList, arrayList2);
        } else {
            jVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.ArchiveSettings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f40764a = mm0Var;
        mm0Var.u1();
        this.f40764a.setLayoutManager(new ig.a0(1, false, 2));
        this.f40764a.setVerticalScrollBarEnabled(false);
        this.f40764a.setSectionsDrawBackground(true);
        this.f40764a.setLayoutAnimation(null);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f40764a;
        j jVar = new j(this);
        this.f40765b = jVar;
        mm0Var2.setAdapter(jVar);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.f47760m = false;
        this.f40764a.setItemAnimator(lVar);
        frameLayout.addView(this.f40764a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f40764a.setOnItemClickListener(new h(this, 0));
        getContactsController().loadGlobalPrivacySetting();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        V(false);
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
            if (this.f40764a != null) {
                for (int i12 = 0; i12 < this.f40764a.getChildCount(); i12++) {
                    View childAt = this.f40764a.getChildAt(i12);
                    this.f40764a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i13 = ((i) arrayList.get(R)).d;
                            if (i13 == 1) {
                                ((org.telegram.ui.Cells.a9) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i13 == 4) {
                                ((org.telegram.ui.Cells.a9) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i13 == 7) {
                                ((org.telegram.ui.Cells.a9) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f40766c = false;
        } else if (i10 == NotificationCenter.dialogFiltersUpdated) {
            V(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f40764a;
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
        if (this.f40766c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new di.d6(8));
            this.f40766c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
