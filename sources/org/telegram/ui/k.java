package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class k extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Components.ek0 f49261a;
    public j f49262b;
    public boolean f49263c;
    public TLRPC.GlobalPrivacySettings d;
    public int f49264e;
    public final ArrayList f49265f;
    public final ArrayList h;

    public k() {
        super(null);
        this.f49263c = false;
        this.f49264e = -3;
        this.f49265f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void Z(boolean z10) {
        ArrayList arrayList = this.f49265f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new i(0, 0, org.telegram.messenger.gd.O0("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new i(1, 1, org.telegram.messenger.gd.O0("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new i(2, 2, org.telegram.messenger.gd.O0("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().V0().size() > 1) {
            arrayList2.add(new i(0, 3, org.telegram.messenger.gd.O0("ArchiveSettingUnmutedChats")));
            arrayList2.add(new i(1, 4, org.telegram.messenger.gd.O0("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new i(2, 5, org.telegram.messenger.gd.O0("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new i(0, 6, org.telegram.messenger.gd.O0("NewChatsFromNonContacts")));
        arrayList2.add(new i(1, 7, org.telegram.messenger.gd.O0("NewChatsFromNonContactsCheck")));
        arrayList2.add(new i(2, 8, org.telegram.messenger.gd.O0("ArchiveAndMuteInfo")));
        j jVar = this.f49262b;
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
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131754140, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 24));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f49261a = ek0Var;
        ek0Var.r1();
        this.f49261a.setLayoutManager(new jg.b0(1, false, 2));
        this.f49261a.setVerticalScrollBarEnabled(false);
        this.f49261a.setSectionsDrawBackground(true);
        this.f49261a.setLayoutAnimation(null);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f49261a;
        j jVar = new j(this);
        this.f49262b = jVar;
        ek0Var2.setAdapter(jVar);
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        this.f49261a.setItemAnimator(lVar);
        frameLayout.addView(this.f49261a, c8.na.c(-1.0f, -1));
        this.f49261a.setOnItemClickListener(new h(this, 0));
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
        if (i7 == org.telegram.messenger.ks.f25238k0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            this.d = globalPrivacySettings;
            if (globalPrivacySettings == null) {
                this.d = new TLRPC.TL_globalPrivacySettings();
            }
            if (this.f49261a != null) {
                for (int i11 = 0; i11 < this.f49261a.getChildCount(); i11++) {
                    View childAt = this.f49261a.getChildAt(i11);
                    this.f49261a.getClass();
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
            this.f49263c = false;
        } else if (i7 == org.telegram.messenger.ks.O2) {
            Z(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f49261a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25238k0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25238k0);
        super.onFragmentDestroy();
        if (this.f49263c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new fi.l5(9));
            this.f49263c = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
