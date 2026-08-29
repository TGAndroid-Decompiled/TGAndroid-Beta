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
public final class kp extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public hp f39977a;
    public org.telegram.ui.Components.jl0 f39978b;
    public org.telegram.ui.ActionBar.w0 f39979c;
    public org.telegram.ui.Components.hz d;
    public jp f39980e;
    public TLRPC.Chat f39981f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f39982n;
    public org.telegram.ui.ActionBar.c2 f39983r;
    public boolean f39984s;
    public ArrayList v;
    public boolean f39985w;
    public boolean f39986x;
    public gp f39987y;

    public static void U(kp kpVar, org.telegram.ui.ActionBar.c2[] c2VarArr) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        kpVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(kpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, kpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new zo(kpVar, 2), 1000L);
        if (!kpVar.f39984s) {
            kpVar.finishFragment();
        }
    }

    public static void W(kp kpVar, org.telegram.ui.ActionBar.c2[] c2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            try {
                c2Var.dismiss();
            } catch (Throwable unused) {
            }
            c2VarArr[0] = null;
        }
        kpVar.h.linked_chat_id = chat.f22392id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(kpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, kpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new zo(kpVar, 1), 1000L);
        if (o2Var != null) {
            kpVar.removeSelfFromStack();
            o2Var.finishFragment();
            return;
        }
        kpVar.finishFragment();
    }

    public final void Y(TLRPC.Chat chat, org.telegram.ui.ActionBar.o2 o2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f22392id, this, new kg.w(24, this, o2Var));
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = null;
        if (o2Var == null) {
            c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f39981f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new ap(this, c2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ih.c1(this, c2VarArr, chat, o2Var, 9), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f39979c;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        }
        if (!this.f39985w && this.f39984s && this.h.linked_chat_id == 0) {
            this.f39985w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new o(this, 3));
        }
    }

    public final void a0(TLRPC.Chat chat, boolean z10) {
        int i10;
        String formatString;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f22392id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f22392id, 0, true);
                this.f39982n = chat;
                this.f39983r = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new zo(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f39981f.title);
        } else if (!ChatObject.isPublic(this.f39981f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f39981f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f39981f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.x3.i(R.string.DiscussionLinkGroupAlertHistory, u3.c.f(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getParentActivity());
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(t9Var, i7.f6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
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
        float f9 = i14;
        if (!z11) {
            i17 = 21;
        }
        frameLayout.addView(textView2, i7.f6.d(-1, -2.0f, i16, f9, 11.0f, i17, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        e9Var.k(this.currentAccount, chat);
        t9Var.e(chat, e9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new z6(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22714a);
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f39984s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.A));
        this.f39981f = chat2;
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
            int i13 = 0;
            if (!z10 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.v.get(0);
                } else {
                    chat = this.f39981f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.I;
                    this.I = i14 + 1;
                    this.G = i14;
                }
            }
            hp hpVar = this.f39977a;
            if (hpVar != null) {
                hpVar.l();
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f39979c;
            if (w0Var != null) {
                if (this.v.size() <= 10) {
                    i13 = 8;
                }
                w0Var.setVisibility(i13);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.J = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 19));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 1);
        this.f39979c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39980e = new jp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.d = hzVar;
        hzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f39978b = jl0Var;
        jl0Var.p1();
        this.f39978b.setEmptyView(this.d);
        this.f39978b.setLayoutManager(new f2.j0(1, false));
        org.telegram.ui.Components.jl0 jl0Var2 = this.f39978b;
        hp hpVar = new hp(this, context);
        this.f39977a = hpVar;
        jl0Var2.setAdapter(hpVar);
        org.telegram.ui.Components.jl0 jl0Var3 = this.f39978b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        jl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f39978b, i7.f6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f39978b);
        this.f39978b.setOnItemClickListener(new j(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gp gpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22393id;
            if (j10 == this.A) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f39982n;
            if (chat3 != null && chat3.f22392id == j10) {
                try {
                    this.f39983r.dismiss();
                } catch (Throwable unused) {
                }
                this.f39983r = null;
                a0(this.f39982n, false);
                this.f39982n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f39981f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f39981f.f22392id));
                if (chat4 != null) {
                    this.f39981f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f22392id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f39984s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f39981f;
                }
                if (chat2 != null && (gpVar = this.f39987y) != null) {
                    if (!this.L) {
                        gpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.K) {
                        this.f39987y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
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
        f fVar = new f(this, 7);
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 16, new Class[]{org.telegram.ui.Cells.z4.class, org.telegram.ui.Cells.w4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 0, new Class[]{org.telegram.ui.Cells.z4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 0, new Class[]{ep.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23120g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23365u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39978b, 262144, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23383v6));
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
        hp hpVar = this.f39977a;
        if (hpVar != null) {
            hpVar.l();
        }
    }
}
