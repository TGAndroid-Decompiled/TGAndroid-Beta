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
public final class n extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.jl0 f40654a;
    public m f40655b;
    public boolean f40656c;
    public TLRPC.GlobalPrivacySettings d;
    public int f40657e;
    public final ArrayList f40658f;
    public final ArrayList h;

    public n() {
        super(null);
        this.f40656c = false;
        this.f40657e = -3;
        this.f40658f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.f40658f;
        arrayList.clear();
        ArrayList arrayList2 = this.h;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new l(0, 0, LocaleController.getString("ArchiveSettingUnmutedFolders")));
        arrayList2.add(new l(1, 1, LocaleController.getString("ArchiveSettingUnmutedFoldersCheck")));
        arrayList2.add(new l(2, 2, LocaleController.getString("ArchiveSettingUnmutedFoldersInfo")));
        if (getMessagesController().getDialogFilters().size() > 1) {
            arrayList2.add(new l(0, 3, LocaleController.getString("ArchiveSettingUnmutedChats")));
            arrayList2.add(new l(1, 4, LocaleController.getString("ArchiveSettingUnmutedChatsCheck")));
            arrayList2.add(new l(2, 5, LocaleController.getString("ArchiveSettingUnmutedChatsInfo")));
        }
        arrayList2.add(new l(0, 6, LocaleController.getString("NewChatsFromNonContacts")));
        arrayList2.add(new l(1, 7, LocaleController.getString("NewChatsFromNonContactsCheck")));
        arrayList2.add(new l(2, 8, LocaleController.getString("ArchiveAndMuteInfo")));
        m mVar = this.f40655b;
        if (mVar == null) {
            return;
        }
        if (z10) {
            mVar.E(arrayList, arrayList2);
        } else {
            mVar.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ArchiveSettings));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f40654a = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40654a);
        this.f40654a.setLayoutManager(new k(1, false, 0));
        this.f40654a.setVerticalScrollBarEnabled(false);
        this.f40654a.setLayoutAnimation(null);
        org.telegram.ui.Components.jl0 jl0Var2 = this.f40654a;
        m mVar = new m(this);
        this.f40655b = mVar;
        jl0Var2.setAdapter(mVar);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.f40654a.setItemAnimator(lVar);
        frameLayout.addView(this.f40654a, i7.f6.c(-1.0f, -1));
        this.f40654a.setOnItemClickListener(new j(this, 0));
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
            if (this.f40654a != null) {
                for (int i12 = 0; i12 < this.f40654a.getChildCount(); i12++) {
                    View childAt = this.f40654a.getChildAt(i12);
                    this.f40654a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i13 = ((l) arrayList.get(R)).d;
                            if (i13 == 1) {
                                ((org.telegram.ui.Cells.q8) childAt).setChecked(this.d.keep_archived_unmuted);
                            } else if (i13 == 4) {
                                ((org.telegram.ui.Cells.q8) childAt).setChecked(this.d.keep_archived_folders);
                            } else if (i13 == 7) {
                                ((org.telegram.ui.Cells.q8) childAt).setChecked(this.d.archive_and_mute_new_noncontact_peers);
                            }
                        }
                    }
                }
            }
            this.f40656c = false;
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
        if (this.f40656c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new lh.o5(5));
            this.f40656c = false;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f40654a.setPadding(0, 0, 0, i13);
        this.f40654a.setClipToPadding(false);
    }
}
