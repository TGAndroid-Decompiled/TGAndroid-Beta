package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class j extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public org.telegram.ui.Components.tk0 f38389a;
    public i f38390b;
    public boolean f38391c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f38392f;
    public final ArrayList h;

    public j() {
        super(null);
        this.f38391c = false;
        this.e = -3;
        this.f38392f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Y(boolean z10) {
        ArrayList arrayList = this.f38392f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new h(0, 0, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new h(1, 1, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new h(2, 2, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().S0().size() > 1) {
            arrayList2.add(new h(0, 3, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new h(1, 4, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new h(2, 5, org.telegram.messenger.cd.M0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new h(0, 6, org.telegram.messenger.cd.M0("NewChatsFromNonContacts")));
        arrayList2.add(new h(1, 7, org.telegram.messenger.cd.M0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new h(2, 8, org.telegram.messenger.cd.M0("ArchiveAndMuteInfo")));
        i iVar = this.f38390b;
        if (iVar == null) {
            return;
        }
        if (z10) {
            iVar.E(arrayList, arrayList2);
        } else {
            iVar.f();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754143, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f38389a = tk0Var;
        tk0Var.r1();
        this.f38389a.setLayoutManager(new dh.f(1, false, 1));
        this.f38389a.setVerticalScrollBarEnabled(false);
        this.f38389a.setSectionsDrawBackground(true);
        this.f38389a.setLayoutAnimation(null);
        org.telegram.ui.Components.tk0 tk0Var2 = this.f38389a;
        i iVar = new i(this);
        this.f38390b = iVar;
        tk0Var2.setAdapter(iVar);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.f38389a.setItemAnimator(jVar);
        frameLayout.addView(this.f38389a, w7.b6.c(-1.0f, -1));
        this.f38389a.setOnItemClickListener(new g(this, 0));
        getContactsController().B();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        Y(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19638k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.f38389a != null) {
                for (int i12 = 0; i12 < this.f38389a.getChildCount(); i12++) {
                    View childAt = this.f38389a.getChildAt(i12);
                    this.f38389a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i13 = ((h) arrayList.get(R)).d;
                            if (i13 == 1) {
                                ((org.telegram.ui.Cells.t8) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i13 == 4) {
                                ((org.telegram.ui.Cells.t8) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i13 == 7) {
                                ((org.telegram.ui.Cells.t8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f38391c = false;
        } else if (i10 == org.telegram.messenger.zs.O2) {
            Y(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f38389a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19638k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19638k0);
        super.onFragmentDestroy();
        if (this.f38391c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ag.c3(4));
            this.f38391c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
