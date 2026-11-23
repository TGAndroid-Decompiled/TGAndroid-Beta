package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public org.telegram.ui.Components.ek0 f49149a;
    public j f49150b;
    public boolean f49151c;
    public TLRPC.GlobalPrivacySettings d;
    public int f49152e;
    public final ArrayList f49153f;
    public final ArrayList h;

    public k() {
        super(null);
        this.f49151c = false;
        this.f49152e = -3;
        this.f49153f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Z(boolean z10) {
        ArrayList arrayList = this.f49153f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new i(0, 0, org.telegram.messenger.hd.O0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new i(1, 1, org.telegram.messenger.hd.O0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new i(2, 2, org.telegram.messenger.hd.O0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().V0().size() > 1) {
            arrayList2.add(new i(0, 3, org.telegram.messenger.hd.O0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new i(1, 4, org.telegram.messenger.hd.O0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new i(2, 5, org.telegram.messenger.hd.O0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new i(0, 6, org.telegram.messenger.hd.O0("NewChatsFromNonContacts")));
        arrayList2.add(new i(1, 7, org.telegram.messenger.hd.O0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new i(2, 8, org.telegram.messenger.hd.O0("ArchiveAndMuteInfo")));
        j jVar = this.f49150b;
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
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131754140, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 24));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f49149a = ek0Var;
        ek0Var.r1();
        this.f49149a.setLayoutManager(new jg.b0(1, false, 2));
        this.f49149a.setVerticalScrollBarEnabled(false);
        this.f49149a.setSectionsDrawBackground(true);
        this.f49149a.setLayoutAnimation(null);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f49149a;
        j jVar = new j(this);
        this.f49150b = jVar;
        ek0Var2.setAdapter(jVar);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59194m = false;
        this.f49149a.setItemAnimator(kVar);
        frameLayout.addView(this.f49149a, c8.ma.c(-1.0f, -1));
        this.f49149a.setOnItemClickListener(new h(this, 0));
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
        if (i7 == org.telegram.messenger.ls.f25333k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.f49149a != null) {
                for (int i11 = 0; i11 < this.f49149a.getChildCount(); i11++) {
                    View childAt = this.f49149a.getChildAt(i11);
                    this.f49149a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i12 = ((i) arrayList.get(R)).d;
                            if (i12 == 1) {
                                ((org.telegram.ui.Cells.s8) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i12 == 4) {
                                ((org.telegram.ui.Cells.s8) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i12 == 7) {
                                ((org.telegram.ui.Cells.s8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f49151c = false;
        } else if (i7 == org.telegram.messenger.ls.O2) {
            Z(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f49149a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25333k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25333k0);
        super.onFragmentDestroy();
        if (this.f49151c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new fi.l5(9));
            this.f49151c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
