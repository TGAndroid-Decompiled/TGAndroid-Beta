package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.pj0 f47121a;
    public j f47122b;
    public boolean f47123c;
    public TLRPC.GlobalPrivacySettings d;
    public int f47124e;
    public final ArrayList f47125f;
    public final ArrayList h;

    public k() {
        super(null);
        this.f47123c = false;
        this.f47124e = -3;
        this.f47125f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Z(boolean z9) {
        ArrayList arrayList = this.f47125f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new i(0, 0, org.telegram.messenger.id.N0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new i(1, 1, org.telegram.messenger.id.N0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new i(2, 2, org.telegram.messenger.id.N0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().T0().size() > 1) {
            arrayList2.add(new i(0, 3, org.telegram.messenger.id.N0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new i(1, 4, org.telegram.messenger.id.N0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new i(2, 5, org.telegram.messenger.id.N0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new i(0, 6, org.telegram.messenger.id.N0("NewChatsFromNonContacts")));
        arrayList2.add(new i(1, 7, org.telegram.messenger.id.N0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new i(2, 8, org.telegram.messenger.id.N0("ArchiveAndMuteInfo")));
        j jVar = this.f47122b;
        if (jVar == null) {
            return;
        }
        if (z9) {
            jVar.E(arrayList, arrayList2);
        } else {
            jVar.f();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131754143, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 21));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f47121a = pj0Var;
        pj0Var.r1();
        this.f47121a.setLayoutManager(new jg.b0(1, false, 2));
        this.f47121a.setVerticalScrollBarEnabled(false);
        this.f47121a.setSectionsDrawBackground(true);
        this.f47121a.setLayoutAnimation(null);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f47121a;
        j jVar = new j(this);
        this.f47122b = jVar;
        pj0Var2.setAdapter(jVar);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.f57079m = false;
        this.f47121a.setItemAnimator(kVar);
        frameLayout.addView(this.f47121a, c8.ha.c(-1.0f, -1));
        this.f47121a.setOnItemClickListener(new h(this, 0));
        getContactsController().B();
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
        this.d = globalPrivacySettings;
        if (globalPrivacySettings == null) {
            this.d = new TLRPC.TL_globalPrivacySettings();
        }
        Z(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25029k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.f47121a != null) {
                for (int i11 = 0; i11 < this.f47121a.getChildCount(); i11++) {
                    View childAt = this.f47121a.getChildAt(i11);
                    this.f47121a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i12 = ((i) arrayList.get(R)).d;
                            if (i12 == 1) {
                                ((org.telegram.ui.Cells.r8) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i12 == 4) {
                                ((org.telegram.ui.Cells.r8) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i12 == 7) {
                                ((org.telegram.ui.Cells.r8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f47123c = false;
        } else if (i7 == org.telegram.messenger.qs.O2) {
            Z(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f47121a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25029k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25029k0);
        super.onFragmentDestroy();
        if (this.f47123c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new di.v5(9));
            this.f47123c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
