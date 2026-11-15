package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public org.telegram.ui.Components.uj0 f48482a;
    public j f48483b;
    public boolean f48484c;
    public TLRPC.GlobalPrivacySettings d;
    public int f48485e;
    public final ArrayList f48486f;
    public final ArrayList h;

    public k() {
        super(null);
        this.f48484c = false;
        this.f48485e = -3;
        this.f48486f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Z(boolean z10) {
        ArrayList arrayList = this.f48486f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new i(0, 0, org.telegram.messenger.hd.N0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new i(1, 1, org.telegram.messenger.hd.N0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new i(2, 2, org.telegram.messenger.hd.N0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().T0().size() > 1) {
            arrayList2.add(new i(0, 3, org.telegram.messenger.hd.N0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new i(1, 4, org.telegram.messenger.hd.N0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new i(2, 5, org.telegram.messenger.hd.N0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new i(0, 6, org.telegram.messenger.hd.N0("NewChatsFromNonContacts")));
        arrayList2.add(new i(1, 7, org.telegram.messenger.hd.N0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new i(2, 8, org.telegram.messenger.hd.N0("ArchiveAndMuteInfo")));
        j jVar = this.f48483b;
        if (jVar == null) {
            return;
        }
        if (z10) {
            jVar.E(arrayList, arrayList2);
        } else {
            jVar.f();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131754143, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f48482a = uj0Var;
        uj0Var.r1();
        this.f48482a.setLayoutManager(new jg.b0(1, false, 2));
        this.f48482a.setVerticalScrollBarEnabled(false);
        this.f48482a.setSectionsDrawBackground(true);
        this.f48482a.setLayoutAnimation(null);
        org.telegram.ui.Components.uj0 uj0Var2 = this.f48482a;
        j jVar = new j(this);
        this.f48483b = jVar;
        uj0Var2.setAdapter(jVar);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f48482a.setItemAnimator(kVar);
        frameLayout.addView(this.f48482a, c8.ja.c(-1.0f, -1));
        this.f48482a.setOnItemClickListener(new h(this, 0));
        getContactsController().B();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        Z(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25522k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.f48482a != null) {
                for (int i11 = 0; i11 < this.f48482a.getChildCount(); i11++) {
                    View childAt = this.f48482a.getChildAt(i11);
                    this.f48482a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i12 = ((i) arrayList.get(R)).d;
                            if (i12 == 1) {
                                ((org.telegram.ui.Cells.q8) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i12 == 4) {
                                ((org.telegram.ui.Cells.q8) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i12 == 7) {
                                ((org.telegram.ui.Cells.q8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f48484c = false;
        } else if (i7 == org.telegram.messenger.ns.O2) {
            Z(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f48482a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25522k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25522k0);
        super.onFragmentDestroy();
        if (this.f48484c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new fi.m5(9));
            this.f48484c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
