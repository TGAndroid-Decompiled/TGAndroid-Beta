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
public final class k extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.lm0 f38706a;
    public j f38707b;
    public boolean f38708c;
    public TLRPC.GlobalPrivacySettings d;
    public int e;
    public final ArrayList f38709f;
    public final ArrayList h;

    public k() {
        super(null);
        this.f38708c = false;
        this.e = -3;
        this.f38709f = new ArrayList();
        this.h = new ArrayList();
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.f38709f;
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
        j jVar = this.f38707b;
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
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ArchiveSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f38706a = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f38706a);
        this.f38706a.setLayoutManager(new hg.a0(1, false, 2));
        this.f38706a.setVerticalScrollBarEnabled(false);
        this.f38706a.setLayoutAnimation(null);
        org.telegram.ui.Components.lm0 lm0Var2 = this.f38706a;
        j jVar = new j(this);
        this.f38707b = jVar;
        lm0Var2.setAdapter(jVar);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.zr.h);
        kVar.C = false;
        kVar.f46376m = false;
        this.f38706a.setItemAnimator(kVar);
        frameLayout.addView(this.f38706a, w7.z5.c(-1.0f, -1));
        this.f38706a.setOnItemClickListener(new h(this, 0));
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
            if (this.f38706a != null) {
                for (int i12 = 0; i12 < this.f38706a.getChildCount(); i12++) {
                    View childAt = this.f38706a.getChildAt(i12);
                    this.f38706a.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.h;
                        if (R < arrayList.size()) {
                            int i13 = ((i) arrayList.get(R)).d;
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
            this.f38708c = false;
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
        if (this.f38708c) {
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = this.d;
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ci.d6(8));
            this.f38708c = false;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38706a.setPadding(0, 0, 0, i13);
        this.f38706a.setClipToPadding(false);
    }
}
