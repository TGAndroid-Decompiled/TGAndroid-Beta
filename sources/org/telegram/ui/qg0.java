package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class qg0 extends sg1 implements NotificationCenter.NotificationCenterDelegate, ud.b {
    public FrameLayout A;
    public sg0 B;
    public lg.d C;
    public View D;
    public Integer E;
    public gy F;
    public xg.b[] G;
    public int H;
    public int I;
    public int J;
    public NotificationCenter.ObserversGroup K;
    public NotificationCenter.ObserversGroup L;
    public lh.w3 M;
    public boolean N;
    public final og.c O;
    public final og.d P;

    public IUpdateLayout f41656w;

    public boolean f41657x;

    public bg1 f41658y;
    public final ud.a v = new ud.a(0, this, org.telegram.ui.Components.er.h, 380, true);
    public final RectF Q = new RectF();

    public qg0() {
        if (Build.VERSION.SDK_INT >= 31) {
            og.d dVar = new og.d(null);
            this.P = dVar;
            dVar.i(new ng0(this));
        } else {
            this.P = null;
        }
        this.O = new og.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.ec.a(this.f42639b, y8Var);
    }

    public static void Y(qg0 qg0Var, int i10, org.telegram.ui.Components.b70 b70Var) {
        if (qg0Var.currentAccount == i10) {
            return;
        }
        b70Var.u();
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.K0(i10);
        }
    }

    public static boolean Z(qg0 qg0Var, View view) {
        ArrayList<MessagesController.DialogFilter> dialogFilters;
        ArrayList<MessagesController.DialogFilter> arrayList;
        ?? r10;
        ?? r17;
        boolean z10;
        ?? r18;
        TLRPC.EncryptedChat encryptedChatN;
        ?? r11 = 0;
        if (qg0Var.getParentActivity() == null || qg0Var.getParentActivity() == null || (dialogFilters = qg0Var.getMessagesController().getDialogFilters()) == null || dialogFilters.size() <= 1) {
            return false;
        }
        ?? H = org.telegram.ui.Components.b70.H(qg0Var, view);
        int i10 = 0;
        while (i10 < dialogFilters.size()) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            ?? f1Var = new org.telegram.ui.ActionBar.f1(2, qg0Var.getParentActivity(), qg0Var.getResourceProvider(), false, false);
            f1Var.setPadding(AndroidUtilities.dp(18.0f), r11, AndroidUtilities.dp(18.0f), r11);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, f1Var.getTextView().getPaint().getFontMetricsInt(), r11);
            if (!dialogFilter.isDefault()) {
                charSequenceReplaceEmoji = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, dialogFilter.entities, f1Var.getTextView().getPaint().getFontMetricsInt());
            }
            int mainUnreadCount = dialogFilter.isDefault() ? MessagesStorage.getInstance(qg0Var.currentAccount).getMainUnreadCount() : dialogFilter.unreadCount;
            if (mainUnreadCount > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceReplaceEmoji);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) String.valueOf(mainUnreadCount));
                ?? messagesController = qg0Var.getMessagesController();
                ArrayList<TLRPC.Dialog> dialogs = dialogFilter.isDefault() ? messagesController.getDialogs(r11) : messagesController.getAllDialogs();
                int i11 = 0;
                ?? r12 = f1Var;
                while (true) {
                    if (i11 >= dialogs.size()) {
                        arrayList = dialogFilters;
                        r17 = r12;
                        z10 = false;
                        break;
                    }
                    TLRPC.Dialog dialog = dialogs.get(i11);
                    if (dialogFilter.isDefault()) {
                        r18 = r12;
                    } else {
                        ?? r19 = r12;
                        long j10 = dialog.f22384id;
                        if (DialogObject.isEncryptedDialog(j10) && (encryptedChatN = org.telegram.messenger.y1.n(messagesController, j10)) != null) {
                            j10 = encryptedChatN.user_id;
                        }
                        r18 = r19;
                        r18 = r19;
                        if (!dialogFilter.includesDialog(qg0Var.getAccountInstance(), j10, dialog)) {
                            r18 = r18;
                            arrayList = dialogFilters;
                        }
                        i11++;
                        dialogFilters = arrayList;
                        r12 = r18;
                    }
                    if (messagesController.getDialogUnreadCount(dialog) > 0 || dialog.unread_mark) {
                        r18 = r18;
                        long j11 = dialog.f22384id;
                        arrayList = dialogFilters;
                        if (!messagesController.isDialogMuted(j11, 0L)) {
                            z10 = true;
                            r17 = r18;
                            break;
                        }
                    } else {
                        r18 = r18;
                        arrayList = dialogFilters;
                    }
                    i11++;
                    dialogFilters = arrayList;
                    r12 = r18;
                }
                spannableStringBuilder.setSpan(new og0(qg0Var, mainUnreadCount, z10), length, spannableStringBuilder.length(), 33);
                ?? r13 = r17;
                r13.setContentDescription(TextUtils.concat(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, "\n", LocaleController.formatPluralString("AccDescrUnreadCount", mainUnreadCount, new Object[0])));
                charSequenceReplaceEmoji = spannableStringBuilder;
                r10 = r13;
            } else {
                arrayList = dialogFilters;
                r10 = f1Var;
            }
            r10.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
            r10.g(charSequenceReplaceEmoji, 0, new org.telegram.ui.Components.r00(qg0Var.getParentActivity(), R.drawable.msg_folders, qg0Var.getMessagesController().folderTags ? dialogFilter.color : -1));
            r10.getTextView().setEmojiColor(qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
            r10.setMinimumWidth(160);
            r10.setOnClickListener(new c0(qg0Var, H, dialogFilter, 11));
            H.r(r10, h7.z5.n(-1, -2));
            i10++;
            dialogFilters = arrayList;
            r11 = 0;
        }
        H.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
        H.X = AndroidUtilities.dp(400.0f);
        ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        shapeDrawableB0.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
        H.W(shapeDrawableB0);
        H.f26974i = 3;
        H.Z();
        return true;
    }

    public static void a0(qg0 qg0Var) {
        qg0Var.getUserConfig().setShowCallsTab(true);
        qg0Var.g0(true, true);
        NotificationCenter.getInstance(qg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(qg0 qg0Var) {
        qg0Var.getClass();
        int i10 = 0;
        Integer numValueOf = null;
        for (int i11 = 3; i11 >= 0; i11--) {
            if (!UserConfig.getInstance(i11).isClientActivated()) {
                i10++;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i11);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i10--;
        }
        if (i10 > 0 && numValueOf != null) {
            qg0Var.presentFragment(new ig0(numValueOf.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            qg0Var.showDialog(new ag.i1(7, qg0Var.currentAccount, qg0Var.getParentActivity(), qg0Var, null));
        }
    }

    public static void c0(qg0 qg0Var) {
        qg0Var.getUserConfig().setShowCallsTab(false);
        qg0Var.g0(false, true);
        NotificationCenter.getInstance(qg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 V(int i10) {
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i10 == 2) {
            if (!getUserConfig().showCallsTab) {
                return new x71(a9.p.h("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new j9(bundle2);
        }
        if (i10 == 0) {
            gy gyVar = new gy(a9.p.h("hasMainTabs", true));
            this.F = gyVar;
            gyVar.E3 = new ng0(this);
            return gyVar;
        }
        if (i10 != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        return n2VarX != null && n2VarX.canBeginSlide();
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        sg0 sg0Var = new sg0(context, this.resourceProvider);
        this.B = sg0Var;
        sg0Var.setClipChildren(false);
        this.B.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.B.setMaxWidth(AndroidUtilities.dp(344.0f));
        xg.b[] bVarArr = new xg.b[5];
        this.G = bVarArr;
        bVarArr[0] = xg.b.b(context, this.resourceProvider, xg.a.CHATS, R.string.MainTabsChats);
        this.G[1] = xg.b.b(context, this.resourceProvider, xg.a.CONTACTS, R.string.MainTabsContacts);
        this.G[2] = xg.b.b(context, this.resourceProvider, xg.a.SETTINGS, R.string.Settings);
        this.G[3] = xg.b.b(context, this.resourceProvider, xg.a.CALLS, R.string.MainTabsCalls);
        xg.b[] bVarArr2 = this.G;
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        int i11 = R.string.MainTabsProfile;
        xg.b bVar = new xg.b(context);
        bVar.f49427a.setText(LocaleController.getString(i11));
        bVar.f49428b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(0, user);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        n9Var.e(user, y8Var);
        n9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f49429c = n9Var;
        bVar.addView(n9Var, h7.z5.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f49435w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f49434s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        final int i12 = 0;
        this.G[0].setOnLongClickListener(new View.OnLongClickListener(this) {

            public final qg0 f40079b;

            {
                this.f40079b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i12) {
                    case 0:
                        return qg0.Z(this.f40079b, view);
                    case 1:
                        qg0 qg0Var = this.f40079b;
                        if (qg0Var.getParentActivity() == null || qg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(qg0Var, view);
                        b70VarH.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new mg0(qg0Var, 5), false);
                        b70VarH.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new mg0(qg0Var, 6), false);
                        b70VarH.f26994u = true;
                        b70VarH.v = true;
                        b70VarH.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        b70VarH.f26974i = 3;
                        ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB0.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH.W(shapeDrawableB0);
                        b70VarH.Z();
                        return true;
                    case 2:
                        qg0 qg0Var2 = this.f40079b;
                        if (qg0Var2.getParentActivity() == null || qg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH2 = org.telegram.ui.Components.b70.H(qg0Var2, view);
                        b70VarH2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new mg0(qg0Var2, 1), false);
                        if (qg0Var2.getUserConfig().showCallsTab) {
                            b70VarH2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new mg0(qg0Var2, 2), false);
                        } else {
                            b70VarH2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new mg0(qg0Var2, 3), false);
                        }
                        b70VarH2.f26994u = true;
                        b70VarH2.v = true;
                        b70VarH2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableB1 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB1.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH2.W(shapeDrawableB1);
                        b70VarH2.Z();
                        return true;
                    default:
                        this.f40079b.k0(view);
                        return true;
                }
            }
        });
        final int i13 = 1;
        this.G[1].setOnLongClickListener(new View.OnLongClickListener(this) {

            public final qg0 f40079b;

            {
                this.f40079b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i13) {
                    case 0:
                        return qg0.Z(this.f40079b, view);
                    case 1:
                        qg0 qg0Var = this.f40079b;
                        if (qg0Var.getParentActivity() == null || qg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(qg0Var, view);
                        b70VarH.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new mg0(qg0Var, 5), false);
                        b70VarH.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new mg0(qg0Var, 6), false);
                        b70VarH.f26994u = true;
                        b70VarH.v = true;
                        b70VarH.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        b70VarH.f26974i = 3;
                        ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB0.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH.W(shapeDrawableB0);
                        b70VarH.Z();
                        return true;
                    case 2:
                        qg0 qg0Var2 = this.f40079b;
                        if (qg0Var2.getParentActivity() == null || qg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH2 = org.telegram.ui.Components.b70.H(qg0Var2, view);
                        b70VarH2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new mg0(qg0Var2, 1), false);
                        if (qg0Var2.getUserConfig().showCallsTab) {
                            b70VarH2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new mg0(qg0Var2, 2), false);
                        } else {
                            b70VarH2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new mg0(qg0Var2, 3), false);
                        }
                        b70VarH2.f26994u = true;
                        b70VarH2.v = true;
                        b70VarH2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableB1 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB1.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH2.W(shapeDrawableB1);
                        b70VarH2.Z();
                        return true;
                    default:
                        this.f40079b.k0(view);
                        return true;
                }
            }
        });
        final int i14 = 2;
        this.G[3].setOnLongClickListener(new View.OnLongClickListener(this) {

            public final qg0 f40079b;

            {
                this.f40079b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i14) {
                    case 0:
                        return qg0.Z(this.f40079b, view);
                    case 1:
                        qg0 qg0Var = this.f40079b;
                        if (qg0Var.getParentActivity() == null || qg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(qg0Var, view);
                        b70VarH.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new mg0(qg0Var, 5), false);
                        b70VarH.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new mg0(qg0Var, 6), false);
                        b70VarH.f26994u = true;
                        b70VarH.v = true;
                        b70VarH.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        b70VarH.f26974i = 3;
                        ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB0.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH.W(shapeDrawableB0);
                        b70VarH.Z();
                        return true;
                    case 2:
                        qg0 qg0Var2 = this.f40079b;
                        if (qg0Var2.getParentActivity() == null || qg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH2 = org.telegram.ui.Components.b70.H(qg0Var2, view);
                        b70VarH2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new mg0(qg0Var2, 1), false);
                        if (qg0Var2.getUserConfig().showCallsTab) {
                            b70VarH2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new mg0(qg0Var2, 2), false);
                        } else {
                            b70VarH2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new mg0(qg0Var2, 3), false);
                        }
                        b70VarH2.f26994u = true;
                        b70VarH2.v = true;
                        b70VarH2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableB1 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB1.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH2.W(shapeDrawableB1);
                        b70VarH2.Z();
                        return true;
                    default:
                        this.f40079b.k0(view);
                        return true;
                }
            }
        });
        final int i15 = 3;
        this.G[4].setOnLongClickListener(new View.OnLongClickListener(this) {

            public final qg0 f40079b;

            {
                this.f40079b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i15) {
                    case 0:
                        return qg0.Z(this.f40079b, view);
                    case 1:
                        qg0 qg0Var = this.f40079b;
                        if (qg0Var.getParentActivity() == null || qg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(qg0Var, view);
                        b70VarH.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new mg0(qg0Var, 5), false);
                        b70VarH.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new mg0(qg0Var, 6), false);
                        b70VarH.f26994u = true;
                        b70VarH.v = true;
                        b70VarH.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        b70VarH.f26974i = 3;
                        ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB0.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH.W(shapeDrawableB0);
                        b70VarH.Z();
                        return true;
                    case 2:
                        qg0 qg0Var2 = this.f40079b;
                        if (qg0Var2.getParentActivity() == null || qg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.b70 b70VarH2 = org.telegram.ui.Components.b70.H(qg0Var2, view);
                        b70VarH2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new mg0(qg0Var2, 1), false);
                        if (qg0Var2.getUserConfig().showCallsTab) {
                            b70VarH2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new mg0(qg0Var2, 2), false);
                        } else {
                            b70VarH2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new mg0(qg0Var2, 3), false);
                        }
                        b70VarH2.f26994u = true;
                        b70VarH2.v = true;
                        b70VarH2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableB1 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), qg0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                        shapeDrawableB1.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        b70VarH2.W(shapeDrawableB1);
                        b70VarH2.Z();
                        return true;
                    default:
                        this.f40079b.k0(view);
                        return true;
                }
            }
        });
        this.B.L.add(this.G[0]);
        this.B.L.add(this.G[1]);
        this.B.L.add(this.G[4]);
        this.B.L.add(this.G[3]);
        int i16 = 0;
        while (true) {
            xg.b[] bVarArr3 = this.G;
            if (i16 >= bVarArr3.length) {
                break;
            }
            xg.b bVar2 = bVarArr3[i16];
            bVar2.setOnClickListener(new hh.z0(this, i16 > 2 ? i16 - 1 : i16, 18));
            this.B.addView(this.G[i16]);
            this.B.i(bVar2, true, false);
            i16++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f42640c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6);
        og.c cVar = this.O;
        cVar.a(themedColor);
        qg.j jVar = new qg.j(this.f42639b);
        og.a aVar = this.P;
        if (aVar == null) {
            aVar = cVar;
        }
        n0 n0Var = this.f42639b;
        boolean zIsEnabled = LiteMode.isEnabled(262144);
        sg0 sg0Var2 = this.B;
        mg.d dVarF = ng.c.f(this.resourceProvider);
        lg.d dVarW = aVar.w();
        if (zIsEnabled && Build.VERSION.SDK_INT >= 33 && (dVarW instanceof lg.e)) {
            lg.e eVar = (lg.e) dVarW;
            eVar.N = new jg.f(eVar.I);
        }
        dVarW.n(dVarF);
        if (n0Var != null && sg0Var2 != null) {
            jVar.d(sg0Var2, n0Var, new ag.h0(29, dVarW, sg0Var2), false);
        }
        this.C = dVarW;
        dVarW.p(AndroidUtilities.dp(28.0f));
        this.C.o(AndroidUtilities.dp(7.666f));
        this.B.setBackground(this.C);
        n0 n0Var2 = this.f42639b;
        this.D = new View(context);
        View view = this.D;
        lg.f fVar = new lg.f(cVar);
        fVar.n(null);
        if (n0Var2 != null && view != null) {
            jVar.d(view, n0Var2, new ag.h0(29, fVar, view), false);
        }
        jg.b bVar3 = new jg.b(fVar);
        bVar3.b(AndroidUtilities.dp(60.0f), true);
        this.D.setBackground(bVar3);
        this.f42639b.addView(this.D, h7.z5.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.A = frameLayout;
        frameLayout.setOnClickListener(new ag.l2(24));
        this.A.addView(this.B, h7.z5.e(-1, 72, 81));
        this.A.setClipToPadding(false);
        this.f42639b.addView(this.A, h7.z5.e(-1, -2, 80));
        bg1 bg1Var = new bg1(context);
        this.f41658y = bg1Var;
        this.f42639b.addView(bg1Var, h7.z5.e(-1, -2, 80));
        IUpdateLayout iUpdateLayoutTakeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f41658y);
        this.f41656w = iUpdateLayoutTakeUpdateLayout;
        if (iUpdateLayoutTakeUpdateLayout != null) {
            iUpdateLayoutTakeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f42639b;
    }

    public final void d0() {
        og.d dVar;
        View view;
        if (Build.VERSION.SDK_INT < 31 || (dVar = this.P) == null || (view = this.fragmentView) == null) {
            return;
        }
        dVar.h(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        dVar.j();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xg.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.notificationsCountUpdated || i10 == NotificationCenter.updateInterfaces) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z10 = true;
            }
            j0(z10);
            return;
        }
        if (i10 == NotificationCenter.appUpdateLoading) {
            IUpdateLayout iUpdateLayout3 = this.f41656w;
            if (iUpdateLayout3 != null) {
                iUpdateLayout3.updateFileProgress(null);
                this.f41656w.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f41656w) != null) {
                iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoadFailed) {
            String str2 = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f41656w) != null) {
                iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileLoadProgressChanged) {
            IUpdateLayout iUpdateLayout4 = this.f41656w;
            if (iUpdateLayout4 != null) {
                iUpdateLayout4.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.appUpdateAvailable) {
            IUpdateLayout iUpdateLayout5 = this.f41656w;
            if (iUpdateLayout5 == null || (launchActivity = LaunchActivity.C1) == null) {
                return;
            }
            iUpdateLayout5.updateAppUpdateViews(this.currentAccount, launchActivity.Z.size() == 1);
            return;
        }
        if (i10 == NotificationCenter.needSetDayNightTheme) {
            int currentPosition = this.f42640c.getCurrentPosition();
            SparseArray sparseArray = this.f42638a;
            int size = sparseArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                qg1 qg1Var = (qg1) sparseArray.valueAt(i12);
                if (sparseArray.keyAt(i12) != currentPosition && qg1Var != null) {
                    qg1Var.f41659a.clearViews();
                }
            }
            return;
        }
        if (i10 == NotificationCenter.callTabsVisibleToggled) {
            g0(getUserConfig().showCallsTab, true);
            rg1 rg1Var = this.f42640c;
            if (rg1Var == null || rg1Var.getCurrentPosition() != 2) {
                W(2);
                return;
            }
            this.f42640c.D(0);
            m0(0, true);
            this.f41657x = true;
            return;
        }
        if (i10 != NotificationCenter.mainUserInfoChanged) {
            if (i10 == NotificationCenter.contactsPermissionBadgeCheck) {
                f0();
                return;
            }
            return;
        }
        xg.b[] bVarArr = this.G;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i13 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).getClientUserId()));
        bVar.f49429c.e(user, new org.telegram.ui.Components.y8(0, user));
    }

    public final void e0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6);
        rg1 rg1Var = this.f42640c;
        this.O.a(i0.b.d(rg1Var != null ? rg1Var.r(0) : 1.0f, themedColor, themedColor2));
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
        lg.d dVar = this.C;
        if (dVar != null) {
            dVar.u();
        }
        d0();
        View view2 = this.D;
        if (view2 != null) {
            view2.invalidate();
        }
        sg0 sg0Var = this.B;
        if (sg0Var != null) {
            sg0Var.invalidate();
        }
        xg.b[] bVarArr = this.G;
        if (bVarArr != null) {
            for (xg.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f49435w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, bVar.d);
                bVar.f49434s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    public final void f0() {
        if (this.B == null || this.G[1] == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 23 && ContactsController.hasContactsPermission();
        if (z10) {
            MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (i10 < 23 || !UserConfig.getInstance(this.currentAccount).syncContacts || z10 || !MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
            this.G[1].d(null, true, true);
        } else {
            this.G[1].d("!", true, true);
        }
    }

    public final void g0(boolean z10, boolean z11) {
        sg0 sg0Var = this.B;
        if (sg0Var != null) {
            sg0Var.i(this.G[2], !z10, z11);
            this.B.i(this.G[3], z10, z11);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        if (n2VarX != null) {
            return n2VarX.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23973c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f23053d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f23124h5));
        return themeDescriptions;
    }

    public final void h0() {
        rg1 rg1Var = this.f42640c;
        if (rg1Var == null || this.D == null) {
            return;
        }
        float fA = 1.0f - h7.n.a(Math.abs(3.0f - rg1Var.getPositionAnimated()), 0.0f, 1.0f);
        float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.H)) * fA)) * this.v.f48497e;
        this.D.setAlpha(navigationBarThirdButtonsFactor);
        this.D.setTranslationY(fA * AndroidUtilities.dp(48.0f));
        this.D.setVisibility(navigationBarThirdButtonsFactor > 0.0f ? 0 : 8);
    }

    public final void i0() {
        View view = this.f41658y.f36817b;
        int i10 = -((view == null || view.getVisibility() != 0) ? 0 : AndroidUtilities.dp(44.0f));
        int iDp = AndroidUtilities.dp(40.0f) + i10;
        float f10 = this.v.f48497e;
        AndroidUtilities.lerp(0.85f, 1.0f, f10);
        this.A.setTranslationY(AndroidUtilities.lerp(iDp, i10, f10));
        this.B.setClickable(f10 > 1.0f);
        this.B.setEnabled(f10 > 1.0f);
        this.B.setAlpha(f10);
        this.B.setVisibility(f10 <= 0.0f ? 8 : 0);
    }

    public final void j0(boolean z10) {
        if (this.B == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount <= 0) {
            this.G[0].d(null, false, z10);
        } else {
            this.G[0].d(LocaleController.formatNumber(mainUnreadCount, ','), false, z10);
        }
    }

    public final void k0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.lp0(7));
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            b70VarH.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new mg0(this, 0), false);
        }
        if (arrayList.size() > 0) {
            if (b70VarH.x() > 0) {
                b70VarH.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int iIntValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == iIntValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(iIntValue).getCurrentUser();
                org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
                y8Var.r(currentUser);
                ag.d0 d0Var = new ag.d0(this, getParentActivity(), z10);
                linearLayout.addView(d0Var, h7.z5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getParentActivity());
                if (z10) {
                    n9Var.setScaleX(0.833f);
                    n9Var.setScaleY(0.833f);
                }
                n9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                n9Var.getImageReceiver().setCurrentAccount(iIntValue);
                n9Var.e(currentUser, y8Var);
                d0Var.addView(n9Var, h7.z5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, h7.z5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new gh.v2(this, iIntValue, b70VarH, 15));
                b70VarH.r(linearLayout, h7.z5.n(230, 48));
            }
        }
        b70VarH.f26994u = true;
        b70VarH.v = true;
        b70VarH.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable shapeDrawableB0 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        shapeDrawableB0.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
        b70VarH.W(shapeDrawableB0);
        b70VarH.Z();
        org.telegram.ui.Components.y30.AccountSwitchHint.a();
    }

    public final gy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        gy gyVar = new gy(bundle);
        this.F = gyVar;
        gyVar.E3 = new ng0(this);
        this.f42638a.put(0, new qg1(gyVar));
        return this.F;
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            xg.b[] bVarArr = this.G;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e((i11 > 2 ? i11 + (-1) : i11) == i10, z10);
            i11++;
        }
    }

    public final void n0(float f10, boolean z10) {
        int i10 = 0;
        while (i10 < this.G.length) {
            float fMax = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f10));
            xg.b bVar = this.G[i10];
            bVar.F = fMax;
            bVar.E = z10;
            bVar.invalidate();
            i10++;
        }
        this.B.invalidate();
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean zOnBackPressed = super.onBackPressed(z10);
        if (zOnBackPressed && this.f42640c.getCurrentPosition() != 0) {
            zOnBackPressed = false;
            if (z10) {
                this.f42640c.D(0);
            }
        }
        return zOnBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        if (n2VarX != null) {
            n2VarX.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.K = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.L = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.ec.h(this.f42639b);
        NotificationCenter.ObserversGroup observersGroup = this.K;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.K = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.L;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.L = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lh.w3 w3Var = this.M;
        if (w3Var != null) {
            w3Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.N) {
            return;
        }
        if (this.M == null && org.telegram.ui.Components.y30.AccountSwitchHint.c()) {
            AndroidUtilities.runOnUIThread(new mg0(this, 7), 1500L);
        }
        this.N = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        if (n2VarX != null) {
            n2VarX.onSlideProgress(z10, f10);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        if (n2VarX != null) {
            n2VarX.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
