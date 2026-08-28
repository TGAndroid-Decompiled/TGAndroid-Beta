package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hp extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ep f38881a;
    public org.telegram.ui.Components.wk0 f38882b;
    public org.telegram.ui.ActionBar.w0 f38883c;
    public org.telegram.ui.Components.yy d;
    public gp f38884e;
    public TLRPC.Chat f38885f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f38886n;
    public org.telegram.ui.ActionBar.c2 f38887r;
    public boolean f38888s;
    public ArrayList v;
    public boolean f38889w;
    public boolean f38890x;
    public dp f38891y;

    public static void T(hp hpVar, org.telegram.ui.ActionBar.c2[] c2VarArr) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        hpVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(hpVar.currentAccount);
        int i9 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, hpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new wo(hpVar, 2), 1000L);
        if (!hpVar.f38888s) {
            hpVar.finishFragment();
        }
    }

    public static void V(hp hpVar, org.telegram.ui.ActionBar.c2[] c2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            try {
                c2Var.dismiss();
            } catch (Throwable unused) {
            }
            c2VarArr[0] = null;
        }
        hpVar.h.linked_chat_id = chat.f22380id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(hpVar.currentAccount);
        int i9 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, hpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new wo(hpVar, 1), 1000L);
        if (o2Var != null) {
            hpVar.removeSelfFromStack();
            o2Var.finishFragment();
            return;
        }
        hpVar.finishFragment();
    }

    public final void X(TLRPC.Chat chat, org.telegram.ui.ActionBar.o2 o2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f22380id, this, new ih.v3(24, this, o2Var));
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = null;
        if (o2Var == null) {
            c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f38885f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new xo(this, c2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new fh.h1(this, c2VarArr, chat, o2Var, 11), 64), 1), 500L);
    }

    public final void Y() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f38883c;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        }
        if (!this.f38889w && this.f38888s && this.h.linked_chat_id == 0) {
            this.f38889w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new m(this, 3));
        }
    }

    public final void Z(TLRPC.Chat chat, boolean z10) {
        int i9;
        String formatString;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f22380id);
        int i14 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f22380id, 0, true);
                this.f38886n = chat;
                this.f38887r = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new wo(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f38885f.title);
        } else if (!ChatObject.isPublic(this.f38885f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f38885f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f38885f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.l0.h(R.string.DiscussionLinkGroupAlertHistory, ta.b.e(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getParentActivity());
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(o9Var, g7.e6.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        int i16 = 76;
        if (z11) {
            i13 = 21;
        } else {
            i13 = 76;
        }
        float f10 = i13;
        if (!z11) {
            i16 = 21;
        }
        frameLayout.addView(textView2, g7.e6.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
        if (LocaleController.isRTL) {
            i14 = 5;
        }
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        z8Var.k(this.currentAccount, chat);
        o9Var.e(chat, z8Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new a7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void a0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f38888s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.A));
        this.f38885f = chat2;
        if (chat2 != null) {
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = 1;
            if (z10) {
                if (this.h.linked_chat_id == 0) {
                    this.I = 2;
                    this.B = 1;
                }
                int i9 = this.I;
                this.C = i9;
                int size = this.v.size() + i9;
                this.I = size;
                this.D = size;
                if (this.h.linked_chat_id != 0) {
                    this.I = size + 1;
                    this.B = size;
                }
            } else {
                this.C = 1;
                int size2 = this.v.size();
                int i10 = 1 + size2;
                this.D = i10;
                this.I = size2 + 2;
                this.B = i10;
            }
            int i11 = this.I;
            this.I = i11 + 1;
            this.F = i11;
            int i12 = 0;
            if (!z10 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.v.get(0);
                } else {
                    chat = this.f38885f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.I;
                    this.I = i13 + 1;
                    this.G = i13;
                }
            }
            ep epVar = this.f38881a;
            if (epVar != null) {
                epVar.l();
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f38883c;
            if (w0Var != null) {
                if (this.v.size() <= 10) {
                    i12 = 8;
                }
                w0Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.J = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i9 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 27));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 1);
        this.f38883c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38884e = new gp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.d = yyVar;
        yyVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f38882b = wk0Var;
        wk0Var.p1();
        this.f38882b.setEmptyView(this.d);
        this.f38882b.setLayoutManager(new f2.m0(1, false));
        org.telegram.ui.Components.wk0 wk0Var2 = this.f38882b;
        ep epVar = new ep(this, context);
        this.f38881a = epVar;
        wk0Var2.setAdapter(epVar);
        org.telegram.ui.Components.wk0 wk0Var3 = this.f38882b;
        if (!LocaleController.isRTL) {
            i9 = 2;
        }
        wk0Var3.setVerticalScrollbarPosition(i9);
        frameLayout2.addView(this.f38882b, g7.e6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f38882b);
        this.f38882b.setOnItemClickListener(new i(this, 3));
        a0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        dp dpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22381id;
            if (j10 == this.A) {
                this.h = chatFull;
                Y();
                a0();
                return;
            }
            TLRPC.Chat chat3 = this.f38886n;
            if (chat3 != null && chat3.f22380id == j10) {
                try {
                    this.f38887r.dismiss();
                } catch (Throwable unused) {
                }
                this.f38887r = null;
                Z(this.f38886n, false);
                this.f38886n = null;
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f38885f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f38885f.f22380id));
                if (chat4 != null) {
                    this.f38885f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f22380id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f38888s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f38885f;
                }
                if (chat2 != null && (dpVar = this.f38891y) != null) {
                    if (!this.L) {
                        dpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.K) {
                        this.f38891y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i9 == NotificationCenter.dialogDeleted) {
            if ((-this.A) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 7);
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 0, new Class[]{bp.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23058g9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23303u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38882b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23319v6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        Y();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ep epVar = this.f38881a;
        if (epVar != null) {
            epVar.l();
        }
    }
}
