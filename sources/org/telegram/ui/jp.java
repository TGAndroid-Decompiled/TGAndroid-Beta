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

public final class jp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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

    public gp f39450a;

    public org.telegram.ui.Components.zk0 f39451b;

    public org.telegram.ui.ActionBar.v0 f39452c;
    public org.telegram.ui.Components.az d;

    public ip f39453e;

    public TLRPC.Chat f39454f;
    public TLRPC.ChatFull h;

    public TLRPC.Chat f39455n;

    public org.telegram.ui.ActionBar.b2 f39456r;

    public boolean f39457s;
    public ArrayList v;

    public boolean f39458w;

    public boolean f39459x;

    public fp f39460y;

    public static void U(jp jpVar, org.telegram.ui.ActionBar.b2[] b2VarArr) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        jpVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(jpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, jpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new yo(jpVar, 2), 1000L);
        if (jpVar.f39457s) {
            return;
        }
        jpVar.finishFragment();
    }

    public static void W(jp jpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } catch (Throwable unused) {
            }
            b2VarArr[0] = null;
        }
        jpVar.h.linked_chat_id = chat.f22380id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(jpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, jpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new yo(jpVar, 1), 1000L);
        if (n2Var == null) {
            jpVar.finishFragment();
        } else {
            jpVar.removeSelfFromStack();
            n2Var.finishFragment();
        }
    }

    public final void Y(TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f22380id, this, new jh.z1(24, this, n2Var));
            return;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = {n2Var == null ? new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f39454f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new zo(this, b2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new gh.f1(this, b2VarArr, chat, n2Var, 9), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.f39452c;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        }
        if (!this.f39458w && this.f39457s && this.h.linked_chat_id == 0) {
            this.f39458w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new n(this, 3));
        }
    }

    public final void a0(TLRPC.Chat chat, boolean z10) {
        String string;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f22380id);
        int i10 = 0;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f22380id, 0, true);
                this.f39455n = chat;
                this.f39456r = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new yo(this, i10), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isPublic(chat)) {
            string = !ChatObject.isPublic(this.f39454f) ? LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f39454f.title) : LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f39454f.title);
        } else {
            string = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f39454f.title);
        }
        if (chatFull.hidden_prehistory) {
            string = org.telegram.messenger.y1.i(R.string.DiscussionLinkGroupAlertHistory, s3.c.f(string, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(string));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getParentActivity());
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView2, h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        y8Var.k(this.currentAccount, chat);
        n9Var.e(chat, y8Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new b7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void b0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f39457s;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.A));
        this.f39454f = chat;
        if (chat == null) {
            return;
        }
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
            int i10 = this.I;
            this.C = i10;
            int size = this.v.size() + i10;
            this.I = size;
            this.D = size;
            if (this.h.linked_chat_id != 0) {
                this.I = size + 1;
                this.B = size;
            }
        } else {
            this.C = 1;
            int size2 = this.v.size();
            int i11 = 1 + size2;
            this.D = i11;
            this.I = size2 + 2;
            this.B = i11;
        }
        int i12 = this.I;
        this.I = i12 + 1;
        this.F = i12;
        if (!z10 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
            TLRPC.Chat chat2 = z10 ? (TLRPC.Chat) this.v.get(0) : this.f39454f;
            if (chat2 != null && ((!ChatObject.isPublic(chat2) || z10) && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i13 = this.I;
                this.I = i13 + 1;
                this.G = i13;
            }
        }
        gp gpVar = this.f39450a;
        if (gpVar != null) {
            gpVar.l();
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f39452c;
        if (v0Var != null) {
            v0Var.setVisibility(this.v.size() <= 10 ? 8 : 0);
        }
    }

    @Override
    public final View createView(Context context) {
        this.J = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 28));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 1);
        this.f39452c = v0VarA;
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39453e = new ip(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.d = azVar;
        azVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f39451b = zk0Var;
        zk0Var.p1();
        this.f39451b.setEmptyView(this.d);
        this.f39451b.setLayoutManager(new f2.k0(1, false));
        org.telegram.ui.Components.zk0 zk0Var2 = this.f39451b;
        gp gpVar = new gp(this, context);
        this.f39450a = gpVar;
        zk0Var2.setAdapter(gpVar);
        this.f39451b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.f39451b, h7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f39451b);
        this.f39451b.setOnItemClickListener(new i(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        fp fpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22381id;
            if (j10 == this.A) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f39455n;
            if (chat3 == null || chat3.f22380id != j10) {
                return;
            }
            try {
                this.f39456r.dismiss();
            } catch (Throwable unused) {
            }
            this.f39456r = null;
            a0(this.f39455n, false);
            this.f39455n = null;
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.dialogDeleted) {
                if ((-this.A) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                    if (b5Var == null || b5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
            return;
        }
        if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 || this.f39454f == null) {
            return;
        }
        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f39454f.f22380id));
        if (chat4 != null) {
            this.f39454f = chat4;
        }
        if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f22380id))) != null) {
            this.v.set(0, chat);
        }
        if (!this.f39457s) {
            chat2 = this.f39454f;
        } else if (this.v.size() > 0) {
            chat2 = (TLRPC.Chat) this.v.get(0);
        }
        if (chat2 == null || (fpVar = this.f39460y) == null) {
            return;
        }
        if (!this.L) {
            fpVar.setJoinRequest(chat2.join_request);
        }
        if (this.K) {
            return;
        }
        this.f39460y.setJoinToSend(chat2.join_to_send);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 7);
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 16, new Class[]{org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.v4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 0, new Class[]{dp.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23111g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39451b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        Z();
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
        gp gpVar = this.f39450a;
        if (gpVar != null) {
            gpVar.l();
        }
    }
}
