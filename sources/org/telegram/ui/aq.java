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
public final class aq extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public xp f34292a;
    public org.telegram.ui.Components.mm0 f34293b;
    public org.telegram.ui.ActionBar.u0 f34294c;
    public org.telegram.ui.Components.yz d;
    public zp e;
    public TLRPC.Chat f34295f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f34296n;
    public org.telegram.ui.ActionBar.a2 f34297r;
    public boolean f34298s;
    public ArrayList v;
    public boolean f34299w;
    public boolean f34300x;
    public wp f34301y;

    public static void U(aq aqVar, org.telegram.ui.ActionBar.a2[] a2VarArr) {
        try {
            a2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        a2VarArr[0] = null;
        aqVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(aqVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, aqVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new op(aqVar, 2), 1000L);
        if (!aqVar.f34298s) {
            aqVar.finishFragment();
        }
    }

    public static void W(aq aqVar, org.telegram.ui.ActionBar.a2[] a2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.m2 m2Var) {
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            try {
                a2Var.dismiss();
            } catch (Throwable unused) {
            }
            a2VarArr[0] = null;
        }
        aqVar.h.linked_chat_id = chat.f19216id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(aqVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, aqVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new op(aqVar, 1), 1000L);
        if (m2Var != null) {
            aqVar.removeSelfFromStack();
            m2Var.finishFragment();
            return;
        }
        aqVar.finishFragment();
    }

    public final void Y(TLRPC.Chat chat, org.telegram.ui.ActionBar.m2 m2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f19216id, this, new m4.z0(20, this, m2Var));
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = null;
        if (m2Var == null) {
            a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.a2[] a2VarArr = {a2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f34295f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new pp(this, a2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.f3(this, a2VarArr, chat, m2Var, 5), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f34294c;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
        }
        if (!this.f34299w && this.f34298s && this.h.linked_chat_id == 0) {
            this.f34299w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new m(this, 3));
        }
    }

    public final void a0(TLRPC.Chat chat, boolean z10) {
        int i10;
        String formatString;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f19216id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f19216id, 0, true);
                this.f34296n = chat;
                this.f34297r = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new op(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f34295f.title);
        } else if (!ChatObject.isPublic(this.f34295f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f34295f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f34295f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.q.h(R.string.DiscussionLinkGroupAlertHistory, t8.b.i(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getParentActivity());
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(z9Var, w7.a6.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        int i17 = 76;
        if (z11) {
            i14 = 21;
        } else {
            i14 = 76;
        }
        float f7 = i14;
        if (!z11) {
            i17 = 21;
        }
        frameLayout.addView(textView2, w7.a6.a(-2.0f, f7, 11.0f, i17, 0.0f, -1, i16));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, w7.a6.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, i15 | 48));
        k9Var.k(this.currentAccount, chat);
        z9Var.e(chat, k9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new f7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f19548a);
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f34298s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.E));
        this.f34295f = chat2;
        if (chat2 != null) {
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = 1;
            if (z10) {
                if (this.h.linked_chat_id == 0) {
                    this.M = 2;
                    this.F = 1;
                }
                int i10 = this.M;
                this.G = i10;
                int size = this.v.size() + i10;
                this.M = size;
                this.H = size;
                if (this.h.linked_chat_id != 0) {
                    this.M = size + 1;
                    this.F = size;
                }
            } else {
                this.G = 1;
                int size2 = this.v.size();
                int i11 = 1 + size2;
                this.H = i11;
                this.M = size2 + 2;
                this.F = i11;
            }
            int i12 = this.M;
            this.M = i12 + 1;
            this.J = i12;
            int i13 = 0;
            if (!z10 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.v.get(0);
                } else {
                    chat = this.f34295f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            xp xpVar = this.f34292a;
            if (xpVar != null) {
                xpVar.l();
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f34294c;
            if (u0Var != null) {
                if (this.v.size() <= 10) {
                    i13 = 8;
                }
                u0Var.setVisibility(i13);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.N = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 4));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 2);
        this.f34294c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new zp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.g6.f19843a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.d = yzVar;
        yzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f34293b = mm0Var;
        mm0Var.p1();
        this.f34293b.setEmptyView(this.d);
        this.f34293b.setLayoutManager(new s4.b0(1, false));
        org.telegram.ui.Components.mm0 mm0Var2 = this.f34293b;
        xp xpVar = new xp(this, context);
        this.f34292a = xpVar;
        mm0Var2.setAdapter(xpVar);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f34293b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f34293b, w7.a6.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f34293b);
        this.f34293b.setOnItemClickListener(new i(this, 4));
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wp wpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f19217id;
            if (j10 == this.E) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f34296n;
            if (chat3 != null && chat3.f19216id == j10) {
                try {
                    this.f34297r.dismiss();
                } catch (Throwable unused) {
                }
                this.f34297r = null;
                a0(this.f34296n, false);
                this.f34296n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f34295f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f34295f.f19216id));
                if (chat4 != null) {
                    this.f34295f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f19216id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f34298s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f34295f;
                }
                if (chat2 != null && (wpVar = this.f34301y) != null) {
                    if (!this.P) {
                        wpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.O) {
                        this.f34301y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
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
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f20288y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f20084n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.g6.f20152r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 0, new Class[]{up.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19957g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20064m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20216u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f34293b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20233v6));
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
        xp xpVar = this.f34292a;
        if (xpVar != null) {
            xpVar.l();
        }
    }
}
