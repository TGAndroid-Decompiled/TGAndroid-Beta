package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class ks0 implements View.OnClickListener {

    public final long f30178a;

    public final org.telegram.ui.ActionBar.c6 f30179b;

    public final Context f30180c;
    public final hu0 d;

    public ks0(hu0 hu0Var, long j10, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        this.d = hu0Var;
        this.f30178a = j10;
        this.f30179b = c6Var;
        this.f30180c = context;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        boolean z10;
        boolean z11;
        jh.j6 j6Var;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean zCanUserDoAction;
        org.telegram.ui.ActionBar.f1 f1Var;
        boolean z12;
        org.telegram.ui.ActionBar.f1 f1Var2;
        org.telegram.ui.ActionBar.f1 f1Var3;
        int i11;
        gu0 gu0VarJ1;
        final hu0 hu0Var = this.d;
        wt0[] wt0VarArr = hu0Var.f29140p1;
        wq0 wq0Var = hu0Var.R;
        ImageView imageView = hu0Var.f29135n0;
        vq0 vq0Var = hu0Var.Q;
        int closestTab = hu0Var.getClosestTab();
        boolean zP0 = hu0.p0(closestTab);
        final org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        MessagesController messagesController = MessagesController.getInstance(n2Var.getCurrentAccount());
        long j10 = hu0Var.f29121f1;
        TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
        boolean zI = hu0Var.getStoriesController().i(j10);
        int i12 = 11;
        if (hu0.w0(closestTab) && zI && (gu0VarJ1 = hu0Var.j1(closestTab)) != null) {
            final int i13 = gu0VarJ1.f28826b;
            final b70 b70VarH = b70.H(n2Var, imageView);
            int i14 = R.drawable.menu_add_stories;
            String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
            final int i15 = 0;
            final long j11 = this.f30178a;
            b70VarH.c(i14, string, new Runnable() {
                @Override
                public final void run() {
                    switch (i15) {
                        case 0:
                            hu0Var.O0(n2Var, j11, i13);
                            b70VarH.u();
                            break;
                        default:
                            hu0Var.P0(n2Var, j11, i13);
                            b70VarH.u();
                            break;
                    }
                }
            }, false);
            hu0Var.x(b70VarH, n2Var, j11, i13);
            b70VarH.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new km(hu0Var, i13, b70VarH, i12), false);
            final int i16 = 1;
            b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                @Override
                public final void run() {
                    switch (i16) {
                        case 0:
                            hu0Var.O0(n2Var, j11, i13);
                            b70VarH.u();
                            break;
                        default:
                            hu0Var.P0(n2Var, j11, i13);
                            b70VarH.u();
                            break;
                    }
                }
            }, true);
            b70VarH.k();
            hu0Var.y(b70VarH);
            b70VarH.J = false;
            b70VarH.Y = true;
            b70VarH.f26992s = 0;
            b70VarH.Z();
            return;
        }
        final int i17 = 5;
        if (closestTab == 14) {
            gh.t3 currentPage = wq0Var.getCurrentPage();
            hh.m7 m7Var = currentPage.f7536e;
            if (m7Var == null) {
                return;
            }
            long j12 = wq0Var.f7199c;
            int i18 = wq0Var.f7198b;
            if (j12 == UserConfig.getInstance(i18).getClientUserId()) {
                zCanUserDoAction = true;
            } else {
                zCanUserDoAction = j12 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i18).getChat(Long.valueOf(-j12)), 5);
            }
            final b70 b70VarH2 = b70.H(n2Var, imageView);
            if (m7Var.f9746c) {
                f1Var = null;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(0, b70VarH2.f26967e, b70VarH2.d, false, false);
                b70VarH2.d(f1Var4);
                f1Var = f1Var4;
                z12 = true;
            }
            if (wq0Var.b()) {
                final int i19 = 0;
                b70VarH2.c(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) {

                    public final ks0 f28145b;

                    {
                        this.f28145b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i19) {
                            case 0:
                                wq0 wq0Var2 = this.f28145b.d.R;
                                wq0Var2.getClass();
                                wq0Var2.h(null, new gh.n2(wq0Var2, 0));
                                b70VarH2.u();
                                break;
                            case 1:
                                ks0 ks0Var = this.f28145b;
                                ks0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt("type", 2);
                                hu0 hu0Var2 = ks0Var.d;
                                bundle.putLong("dialog_id", -hu0Var2.Z0.f22381id);
                                o90 o90Var = new o90(bundle, null);
                                o90Var.f31238c = hu0Var2.Z0;
                                hu0Var2.f29145r1.presentFragment(o90Var);
                                b70VarH2.u();
                                break;
                            default:
                                this.f28145b.d.R.setReordering(true);
                                b70VarH2.u();
                                break;
                        }
                    }
                }, false);
                z12 = true;
            }
            if (wq0Var.f7200e.h()) {
                if (!m7Var.h().isEmpty() || currentPage.d) {
                    final int i20 = 2;
                    b70VarH2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) {

                        public final ks0 f28145b;

                        {
                            this.f28145b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i20) {
                                case 0:
                                    wq0 wq0Var2 = this.f28145b.d.R;
                                    wq0Var2.getClass();
                                    wq0Var2.h(null, new gh.n2(wq0Var2, 0));
                                    b70VarH2.u();
                                    break;
                                case 1:
                                    ks0 ks0Var = this.f28145b;
                                    ks0Var.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("type", 2);
                                    hu0 hu0Var2 = ks0Var.d;
                                    bundle.putLong("dialog_id", -hu0Var2.Z0.f22381id);
                                    o90 o90Var = new o90(bundle, null);
                                    o90Var.f31238c = hu0Var2.Z0;
                                    hu0Var2.f29145r1.presentFragment(o90Var);
                                    b70VarH2.u();
                                    break;
                                default:
                                    this.f28145b.d.R.setReordering(true);
                                    b70VarH2.u();
                                    break;
                            }
                        }
                    }, false);
                }
                z12 = true;
            }
            if (z12) {
                b70VarH2.k();
            }
            org.telegram.ui.ActionBar.f1 f1VarH = b70VarH2.h();
            f1VarH.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
            org.telegram.ui.ActionBar.f1 f1VarH2 = b70VarH2.h();
            f1VarH2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
            org.telegram.ui.ActionBar.f1 f1VarH3 = b70VarH2.h();
            f1VarH3.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
            org.telegram.ui.ActionBar.f1 f1VarH4 = b70VarH2.h();
            f1VarH4.setText(LocaleController.getString(R.string.Gift2FilterUnique));
            if (zCanUserDoAction) {
                b70VarH2.k();
                org.telegram.ui.ActionBar.f1 f1VarH5 = b70VarH2.h();
                f1VarH5.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                org.telegram.ui.ActionBar.f1 f1VarH6 = b70VarH2.h();
                f1VarH6.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                f1Var3 = f1VarH6;
                f1Var2 = f1VarH5;
            } else {
                f1Var2 = null;
                f1Var3 = null;
            }
            gh.u3 u3Var = new gh.u3(f1Var, m7Var, f1VarH, f1VarH2, f1VarH3, f1VarH4, zCanUserDoAction, f1Var2, f1Var3);
            org.telegram.ui.ActionBar.f1 f1Var5 = f1Var;
            org.telegram.ui.ActionBar.f1 f1Var6 = f1Var2;
            org.telegram.ui.ActionBar.f1 f1Var7 = f1Var3;
            u3Var.run();
            if (f1Var5 != null) {
                i11 = 2;
                f1Var5.setOnClickListener(new xh0(i11, m7Var, u3Var));
            } else {
                i11 = 2;
            }
            gh.d4.j(f1VarH, m7Var, u3Var, 1);
            gh.d4.j(f1VarH2, m7Var, u3Var, i11);
            gh.d4.j(f1VarH3, m7Var, u3Var, 4);
            gh.d4.j(f1VarH4, m7Var, u3Var, 8);
            if (zCanUserDoAction) {
                gh.d4.j(f1Var6, m7Var, u3Var, 256);
                gh.d4.j(f1Var7, m7Var, u3Var, 512);
            }
            b70VarH2.Y = true;
            b70VarH2.J = false;
            b70VarH2.f26992s = 0;
            b70VarH2.Z();
            return;
        }
        if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && vq0Var != null) {
            b70 b70VarH3 = b70.H(n2Var, imageView);
            final int i21 = 0;
            b70VarH3.l(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) {

                public final ks0 f28446b;

                {
                    this.f28446b = this;
                }

                @Override
                public final void run() {
                    switch (i21) {
                        case 0:
                            hu0 hu0Var2 = this.f28446b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var2.f29145r1;
                            lh.sb sbVarE = lh.sb.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = hu0Var2.f29121f1;
                            String currentLang = hu0Var2.Q.getCurrentLang();
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            sbVarE.R(null);
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            break;
                        case 1:
                            this.f28446b.d.Q.f();
                            break;
                        case 2:
                            vq0 vq0Var2 = this.f28446b.d.Q;
                            if (!vq0Var2.d()) {
                                vq0Var2.f();
                            } else {
                                vq0Var2.h();
                            }
                            break;
                        case 3:
                            vq0 vq0Var3 = this.f28446b.d.Q;
                            vq0Var3.b(vq0Var3.getCurrentLang());
                            break;
                        case 4:
                            hu0 hu0Var3 = this.f28446b.d;
                            hu0Var3.f29145r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.f29145r1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.rn(bundle), true);
                            break;
                        case 5:
                            hu0 hu0Var4 = this.f28446b.d;
                            try {
                                hu0Var4.f29145r1.getMediaDataController().installShortcut(hu0Var4.f29145r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        default:
                            ks0 ks0Var = this.f28446b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ks0Var.d.f29145r1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            y4.s(n2Var4, false, null, currentUser, false, true, false, true, new g1(24, ks0Var, currentUser));
                            break;
                    }
                }
            }, vq0Var.getItemsCount() < n2Var.getMessagesController().botPreviewMediasMax);
            final int i22 = 1;
            b70VarH3.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) {

                public final ks0 f28446b;

                {
                    this.f28446b = this;
                }

                @Override
                public final void run() {
                    switch (i22) {
                        case 0:
                            hu0 hu0Var2 = this.f28446b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var2.f29145r1;
                            lh.sb sbVarE = lh.sb.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = hu0Var2.f29121f1;
                            String currentLang = hu0Var2.Q.getCurrentLang();
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            sbVarE.R(null);
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            break;
                        case 1:
                            this.f28446b.d.Q.f();
                            break;
                        case 2:
                            vq0 vq0Var2 = this.f28446b.d.Q;
                            if (!vq0Var2.d()) {
                                vq0Var2.f();
                            } else {
                                vq0Var2.h();
                            }
                            break;
                        case 3:
                            vq0 vq0Var3 = this.f28446b.d.Q;
                            vq0Var3.b(vq0Var3.getCurrentLang());
                            break;
                        case 4:
                            hu0 hu0Var3 = this.f28446b.d;
                            hu0Var3.f29145r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.f29145r1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.rn(bundle), true);
                            break;
                        case 5:
                            hu0 hu0Var4 = this.f28446b.d;
                            try {
                                hu0Var4.f29145r1.getMediaDataController().installShortcut(hu0Var4.f29145r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        default:
                            ks0 ks0Var = this.f28446b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ks0Var.d.f29145r1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            y4.s(n2Var4, false, null, currentUser, false, true, false, true, new g1(24, ks0Var, currentUser));
                            break;
                    }
                }
            }, vq0Var.getItemsCount() > 1 && !vq0Var.d());
            final int i23 = 2;
            b70VarH3.l(R.drawable.msg_select, LocaleController.getString(vq0Var.d() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) {

                public final ks0 f28446b;

                {
                    this.f28446b = this;
                }

                @Override
                public final void run() {
                    switch (i23) {
                        case 0:
                            hu0 hu0Var2 = this.f28446b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var2.f29145r1;
                            lh.sb sbVarE = lh.sb.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = hu0Var2.f29121f1;
                            String currentLang = hu0Var2.Q.getCurrentLang();
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            sbVarE.R(null);
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            break;
                        case 1:
                            this.f28446b.d.Q.f();
                            break;
                        case 2:
                            vq0 vq0Var2 = this.f28446b.d.Q;
                            if (!vq0Var2.d()) {
                                vq0Var2.f();
                            } else {
                                vq0Var2.h();
                            }
                            break;
                        case 3:
                            vq0 vq0Var3 = this.f28446b.d.Q;
                            vq0Var3.b(vq0Var3.getCurrentLang());
                            break;
                        case 4:
                            hu0 hu0Var3 = this.f28446b.d;
                            hu0Var3.f29145r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.f29145r1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.rn(bundle), true);
                            break;
                        case 5:
                            hu0 hu0Var4 = this.f28446b.d;
                            try {
                                hu0Var4.f29145r1.getMediaDataController().installShortcut(hu0Var4.f29145r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        default:
                            ks0 ks0Var = this.f28446b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ks0Var.d.f29145r1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            y4.s(n2Var4, false, null, currentUser, false, true, false, true, new g1(24, ks0Var, currentUser));
                            break;
                    }
                }
            }, vq0Var.getItemsCount() > 0);
            final int i24 = 3;
            b70VarH3.m(!TextUtils.isEmpty(vq0Var.getCurrentLang()), R.drawable.msg_delete, LocaleController.formatString(R.string.ProfileBotRemoveLang, b31.E(vq0Var.getCurrentLang(), null, null)), true, new Runnable(this) {

                public final ks0 f28446b;

                {
                    this.f28446b = this;
                }

                @Override
                public final void run() {
                    switch (i24) {
                        case 0:
                            hu0 hu0Var2 = this.f28446b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var2.f29145r1;
                            lh.sb sbVarE = lh.sb.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = hu0Var2.f29121f1;
                            String currentLang = hu0Var2.Q.getCurrentLang();
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            sbVarE.R(null);
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            break;
                        case 1:
                            this.f28446b.d.Q.f();
                            break;
                        case 2:
                            vq0 vq0Var2 = this.f28446b.d.Q;
                            if (!vq0Var2.d()) {
                                vq0Var2.f();
                            } else {
                                vq0Var2.h();
                            }
                            break;
                        case 3:
                            vq0 vq0Var3 = this.f28446b.d.Q;
                            vq0Var3.b(vq0Var3.getCurrentLang());
                            break;
                        case 4:
                            hu0 hu0Var3 = this.f28446b.d;
                            hu0Var3.f29145r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.f29145r1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.rn(bundle), true);
                            break;
                        case 5:
                            hu0 hu0Var4 = this.f28446b.d;
                            try {
                                hu0Var4.f29145r1.getMediaDataController().installShortcut(hu0Var4.f29145r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        default:
                            ks0 ks0Var = this.f28446b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ks0Var.d.f29145r1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            y4.s(n2Var4, false, null, currentUser, false, true, false, true, new g1(24, ks0Var, currentUser));
                            break;
                    }
                }
            });
            b70VarH3.a0(0.0f, -AndroidUtilities.dp(52.0f));
            b70VarH3.f26992s = 0;
            b70VarH3.Z();
            return;
        }
        if (hu0Var.getSelectedTab() == 11) {
            b70 b70VarH4 = b70.H(n2Var, imageView);
            final int i25 = 4;
            b70VarH4.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) {

                public final ks0 f28446b;

                {
                    this.f28446b = this;
                }

                @Override
                public final void run() {
                    switch (i25) {
                        case 0:
                            hu0 hu0Var2 = this.f28446b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var2.f29145r1;
                            lh.sb sbVarE = lh.sb.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = hu0Var2.f29121f1;
                            String currentLang = hu0Var2.Q.getCurrentLang();
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            sbVarE.R(null);
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            break;
                        case 1:
                            this.f28446b.d.Q.f();
                            break;
                        case 2:
                            vq0 vq0Var2 = this.f28446b.d.Q;
                            if (!vq0Var2.d()) {
                                vq0Var2.f();
                            } else {
                                vq0Var2.h();
                            }
                            break;
                        case 3:
                            vq0 vq0Var3 = this.f28446b.d.Q;
                            vq0Var3.b(vq0Var3.getCurrentLang());
                            break;
                        case 4:
                            hu0 hu0Var3 = this.f28446b.d;
                            hu0Var3.f29145r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.f29145r1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.rn(bundle), true);
                            break;
                        case 5:
                            hu0 hu0Var4 = this.f28446b.d;
                            try {
                                hu0Var4.f29145r1.getMediaDataController().installShortcut(hu0Var4.f29145r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        default:
                            ks0 ks0Var = this.f28446b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ks0Var.d.f29145r1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            y4.s(n2Var4, false, null, currentUser, false, true, false, true, new g1(24, ks0Var, currentUser));
                            break;
                    }
                }
            }, false);
            b70VarH4.k();
            b70VarH4.c(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) {

                public final ks0 f28446b;

                {
                    this.f28446b = this;
                }

                @Override
                public final void run() {
                    switch (i17) {
                        case 0:
                            hu0 hu0Var2 = this.f28446b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var2.f29145r1;
                            lh.sb sbVarE = lh.sb.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = hu0Var2.f29121f1;
                            String currentLang = hu0Var2.Q.getCurrentLang();
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            sbVarE.R(null);
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            break;
                        case 1:
                            this.f28446b.d.Q.f();
                            break;
                        case 2:
                            vq0 vq0Var2 = this.f28446b.d.Q;
                            if (!vq0Var2.d()) {
                                vq0Var2.f();
                            } else {
                                vq0Var2.h();
                            }
                            break;
                        case 3:
                            vq0 vq0Var3 = this.f28446b.d.Q;
                            vq0Var3.b(vq0Var3.getCurrentLang());
                            break;
                        case 4:
                            hu0 hu0Var3 = this.f28446b.d;
                            hu0Var3.f29145r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.f29145r1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.rn(bundle), true);
                            break;
                        case 5:
                            hu0 hu0Var4 = this.f28446b.d;
                            try {
                                hu0Var4.f29145r1.getMediaDataController().installShortcut(hu0Var4.f29145r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        default:
                            ks0 ks0Var = this.f28446b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ks0Var.d.f29145r1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            y4.s(n2Var4, false, null, currentUser, false, true, false, true, new g1(24, ks0Var, currentUser));
                            break;
                    }
                }
            }, false);
            final int i26 = 6;
            b70VarH4.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) {

                public final ks0 f28446b;

                {
                    this.f28446b = this;
                }

                @Override
                public final void run() {
                    switch (i26) {
                        case 0:
                            hu0 hu0Var2 = this.f28446b.d;
                            org.telegram.ui.ActionBar.n2 n2Var2 = hu0Var2.f29145r1;
                            lh.sb sbVarE = lh.sb.E(n2Var2.getParentActivity(), n2Var2.getCurrentAccount());
                            long j13 = hu0Var2.f29121f1;
                            String currentLang = hu0Var2.Q.getCurrentLang();
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            sbVarE.R(null);
                            sbVarE.f16797r0 = j13;
                            sbVarE.f16801s0 = currentLang;
                            break;
                        case 1:
                            this.f28446b.d.Q.f();
                            break;
                        case 2:
                            vq0 vq0Var2 = this.f28446b.d.Q;
                            if (!vq0Var2.d()) {
                                vq0Var2.f();
                            } else {
                                vq0Var2.h();
                            }
                            break;
                        case 3:
                            vq0 vq0Var3 = this.f28446b.d.Q;
                            vq0Var3.b(vq0Var3.getCurrentLang());
                            break;
                        case 4:
                            hu0 hu0Var3 = this.f28446b.d;
                            hu0Var3.f29145r1.getMessagesController().setSavedViewAs(false);
                            Bundle bundle = new Bundle();
                            org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var3.f29145r1;
                            bundle.putLong("user_id", n2Var3.getUserConfig().getClientUserId());
                            n2Var3.presentFragment(new org.telegram.ui.rn(bundle), true);
                            break;
                        case 5:
                            hu0 hu0Var4 = this.f28446b.d;
                            try {
                                hu0Var4.f29145r1.getMediaDataController().installShortcut(hu0Var4.f29145r1.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        default:
                            ks0 ks0Var = this.f28446b;
                            org.telegram.ui.ActionBar.n2 n2Var4 = ks0Var.d.f29145r1;
                            TLRPC.User currentUser = n2Var4.getUserConfig().getCurrentUser();
                            y4.s(n2Var4, false, null, currentUser, false, true, false, true, new g1(24, ks0Var, currentUser));
                            break;
                    }
                }
            }, false);
            b70VarH4.a0(0.0f, -AndroidUtilities.dp(52.0f));
            b70VarH4.f26992s = 0;
            b70VarH4.Z();
            return;
        }
        final b70 b70VarH5 = b70.H(n2Var, imageView);
        if ((closestTab == 8 || hu0.w0(closestTab)) && zI) {
            i10 = 0;
            b70VarH5.c(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new gs0(this, this.f30179b, b70VarH5, i10), false);
            b70VarH5.k();
        } else {
            i10 = 0;
        }
        hu0Var.y(b70VarH5);
        if (zP0) {
            z10 = true;
        } else {
            wt0 wt0Var = wt0VarArr[i10];
            if (wt0Var.f34344w && wt0Var.v) {
                z10 = true;
            } else {
                boolean[] zArr = wt0Var.f34331i;
                if (zArr[i10] && zArr[1] && wt0Var.f34334l) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
        }
        if (DialogObject.isEncryptedDialog(j10) || (user != null && user.bot)) {
            z11 = true;
        } else {
            b70VarH5.c(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new km(this, closestTab, b70VarH5, 13), false);
            if (hu0Var.Z0 != null && !hu0Var.v0() && (chat = MessagesController.getInstance(n2Var.getCurrentAccount()).getChat(Long.valueOf(hu0Var.Z0.f22381id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                final int i27 = 1;
                b70VarH5.c(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) {

                    public final ks0 f28145b;

                    {
                        this.f28145b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i27) {
                            case 0:
                                wq0 wq0Var2 = this.f28145b.d.R;
                                wq0Var2.getClass();
                                wq0Var2.h(null, new gh.n2(wq0Var2, 0));
                                b70VarH5.u();
                                break;
                            case 1:
                                ks0 ks0Var = this.f28145b;
                                ks0Var.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putInt("type", 2);
                                hu0 hu0Var2 = ks0Var.d;
                                bundle.putLong("dialog_id", -hu0Var2.Z0.f22381id);
                                o90 o90Var = new o90(bundle, null);
                                o90Var.f31238c = hu0Var2.Z0;
                                hu0Var2.f29145r1.presentFragment(o90Var);
                                b70VarH5.u();
                                break;
                            default:
                                this.f28145b.d.R.setReordering(true);
                                b70VarH5.u();
                                break;
                        }
                    }
                }, false);
            }
            if (z10) {
                b70VarH5.k();
                final org.telegram.ui.ActionBar.f1 f1Var8 = new org.telegram.ui.ActionBar.f1(1, this.f30180c, this.f30179b, false, false);
                final org.telegram.ui.ActionBar.f1 f1Var9 = new org.telegram.ui.ActionBar.f1(1, this.f30180c, this.f30179b, false, true);
                f1Var8.g(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0, null);
                b70VarH5.A.addView(f1Var8);
                f1Var9.g(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0, null);
                b70VarH5.A.addView(f1Var9);
                if (zP0) {
                    final eu0 eu0VarK1 = hu0Var.k1(closestTab);
                    if (eu0VarK1 != null && (j6Var = eu0VarK1.f28155s) != null) {
                        f1Var8.setChecked(j6Var.f13545n);
                        f1Var9.setChecked(eu0VarK1.f28155s.f13546o);
                    }
                    final int i28 = 0;
                    f1Var8.setOnClickListener(new View.OnClickListener(this) {

                        public final ks0 f29094b;

                        {
                            this.f29094b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i28) {
                                case 0:
                                    hu0 hu0Var2 = this.f29094b.d;
                                    if (!hu0Var2.D1) {
                                        org.telegram.ui.ActionBar.f1 f1Var10 = f1Var9;
                                        boolean z13 = f1Var10.getCheckView().f27188a.f26309q;
                                        org.telegram.ui.ActionBar.f1 f1Var11 = f1Var8;
                                        if (!z13 && f1Var11.getCheckView().f27188a.f26309q) {
                                            float f10 = -hu0Var2.f29138o1;
                                            hu0Var2.f29138o1 = f10;
                                            AndroidUtilities.shakeViewSpring(view2, f10);
                                            break;
                                        } else {
                                            f1Var11.getCheckView().a(!f1Var11.getCheckView().f27188a.f26309q, true);
                                            jh.j6 j6Var2 = eu0VarK1.f28155s;
                                            if (j6Var2 != null) {
                                                boolean z14 = f1Var11.getCheckView().f27188a.f26309q;
                                                boolean z15 = f1Var10.getCheckView().f27188a.f26309q;
                                                j6Var2.f13545n = z14;
                                                j6Var2.f13546o = z15;
                                                j6Var2.d(true);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    hu0 hu0Var3 = this.f29094b.d;
                                    if (!hu0Var3.D1) {
                                        org.telegram.ui.ActionBar.f1 f1Var12 = f1Var9;
                                        boolean z16 = f1Var12.getCheckView().f27188a.f26309q;
                                        org.telegram.ui.ActionBar.f1 f1Var13 = f1Var8;
                                        if (!z16 && f1Var13.getCheckView().f27188a.f26309q) {
                                            float f11 = -hu0Var3.f29138o1;
                                            hu0Var3.f29138o1 = f11;
                                            AndroidUtilities.shakeViewSpring(view2, f11);
                                            break;
                                        } else {
                                            f1Var13.getCheckView().a(!f1Var13.getCheckView().f27188a.f26309q, true);
                                            jh.j6 j6Var3 = eu0VarK1.f28155s;
                                            if (j6Var3 != null) {
                                                boolean z17 = f1Var12.getCheckView().f27188a.f26309q;
                                                boolean z18 = f1Var13.getCheckView().f27188a.f26309q;
                                                j6Var3.f13545n = z17;
                                                j6Var3.f13546o = z18;
                                                j6Var3.d(true);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    final int i29 = 1;
                    f1Var9.setOnClickListener(new View.OnClickListener(this) {

                        public final ks0 f29094b;

                        {
                            this.f29094b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i29) {
                                case 0:
                                    hu0 hu0Var2 = this.f29094b.d;
                                    if (!hu0Var2.D1) {
                                        org.telegram.ui.ActionBar.f1 f1Var10 = f1Var8;
                                        boolean z13 = f1Var10.getCheckView().f27188a.f26309q;
                                        org.telegram.ui.ActionBar.f1 f1Var11 = f1Var9;
                                        if (!z13 && f1Var11.getCheckView().f27188a.f26309q) {
                                            float f10 = -hu0Var2.f29138o1;
                                            hu0Var2.f29138o1 = f10;
                                            AndroidUtilities.shakeViewSpring(view2, f10);
                                            break;
                                        } else {
                                            f1Var11.getCheckView().a(!f1Var11.getCheckView().f27188a.f26309q, true);
                                            jh.j6 j6Var2 = eu0VarK1.f28155s;
                                            if (j6Var2 != null) {
                                                boolean z14 = f1Var11.getCheckView().f27188a.f26309q;
                                                boolean z15 = f1Var10.getCheckView().f27188a.f26309q;
                                                j6Var2.f13545n = z14;
                                                j6Var2.f13546o = z15;
                                                j6Var2.d(true);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    hu0 hu0Var3 = this.f29094b.d;
                                    if (!hu0Var3.D1) {
                                        org.telegram.ui.ActionBar.f1 f1Var12 = f1Var8;
                                        boolean z16 = f1Var12.getCheckView().f27188a.f26309q;
                                        org.telegram.ui.ActionBar.f1 f1Var13 = f1Var9;
                                        if (!z16 && f1Var13.getCheckView().f27188a.f26309q) {
                                            float f11 = -hu0Var3.f29138o1;
                                            hu0Var3.f29138o1 = f11;
                                            AndroidUtilities.shakeViewSpring(view2, f11);
                                            break;
                                        } else {
                                            f1Var13.getCheckView().a(!f1Var13.getCheckView().f27188a.f26309q, true);
                                            jh.j6 j6Var3 = eu0VarK1.f28155s;
                                            if (j6Var3 != null) {
                                                boolean z17 = f1Var12.getCheckView().f27188a.f26309q;
                                                boolean z18 = f1Var13.getCheckView().f27188a.f26309q;
                                                j6Var3.f13545n = z17;
                                                j6Var3.f13546o = z18;
                                                j6Var3.d(true);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    z11 = true;
                } else {
                    int i30 = 0;
                    int i31 = wt0VarArr[0].f34339q;
                    f1Var8.setChecked(i31 == 0 || i31 == 1);
                    f1Var8.setOnClickListener(new is0(this, f1Var9, f1Var8, i30));
                    int i32 = wt0VarArr[0].f34339q;
                    f1Var9.setChecked(i32 == 0 || i32 == 2);
                    z11 = true;
                    f1Var9.setOnClickListener(new is0(this, f1Var8, f1Var9, 1 == true ? 1 : 0));
                }
            } else {
                z11 = true;
            }
        }
        b70VarH5.J = false;
        b70VarH5.Y = z11;
        b70VarH5.f26992s = 0;
        b70VarH5.Z();
    }
}
