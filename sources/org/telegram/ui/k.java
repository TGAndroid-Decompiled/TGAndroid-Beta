package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Components.tj0 f46716a;
    public j f46717b;
    public boolean f46718c;
    public TLRPC.GlobalPrivacySettings d;
    public int f46719e;
    public final ArrayList f46720f;
    public final ArrayList h;

    public k() {
        super(null);
        this.f46718c = false;
        this.f46719e = -3;
        this.f46720f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Z(boolean z10) {
        ArrayList arrayList = this.f46720f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new i(0, 0, org.telegram.messenger.bd.N0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new i(1, 1, org.telegram.messenger.bd.N0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new i(2, 2, org.telegram.messenger.bd.N0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().T0().size() > 1) {
            arrayList2.add(new i(0, 3, org.telegram.messenger.bd.N0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new i(1, 4, org.telegram.messenger.bd.N0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new i(2, 5, org.telegram.messenger.bd.N0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new i(0, 6, org.telegram.messenger.bd.N0("NewChatsFromNonContacts")));
        arrayList2.add(new i(1, 7, org.telegram.messenger.bd.N0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new i(2, 8, org.telegram.messenger.bd.N0("ArchiveAndMuteInfo")));
        j jVar = this.f46717b;
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
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754143, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f46716a = tj0Var;
        tj0Var.r1();
        this.f46716a.setLayoutManager(new kg.y(1, false, 2));
        this.f46716a.setVerticalScrollBarEnabled(false);
        this.f46716a.setSectionsDrawBackground(true);
        this.f46716a.setLayoutAnimation(null);
        org.telegram.ui.Components.tj0 tj0Var2 = this.f46716a;
        j jVar = new j(this);
        this.f46717b = jVar;
        tj0Var2.setAdapter(jVar);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f46716a.setItemAnimator(kVar);
        frameLayout.addView(this.f46716a, b8.mf.c(-1.0f, -1));
        this.f46716a.setOnItemClickListener(new h(this, 0));
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23254k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.f46716a != null) {
                for (int i11 = 0; i11 < this.f46716a.getChildCount(); i11++) {
                    View childAt = this.f46716a.getChildAt(i11);
                    this.f46716a.getClass();
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
            this.f46718c = false;
        } else if (i3 == org.telegram.messenger.hs.O2) {
            Z(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f46716a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23254k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23254k0);
        super.onFragmentDestroy();
        if (this.f46718c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ei.u5(9));
            this.f46718c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
