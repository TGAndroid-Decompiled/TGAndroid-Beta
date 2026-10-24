package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kp extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public boolean Q;
    public int R;
    public int S;
    public hp f38988a;
    public org.telegram.ui.Components.lm0 f38989b;
    public org.telegram.ui.ActionBar.u0 f38990c;
    public org.telegram.ui.Components.tz d;
    public jp e;
    public TLRPC.Chat f38991f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f38992n;
    public org.telegram.ui.ActionBar.c2 f38993r;
    public boolean f38994s;
    public ArrayList v;
    public boolean f38995w;
    public boolean f38996x;
    public gp f38997y;

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
        if (!kpVar.f38994s) {
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
        kpVar.h.linked_chat_id = chat.f20344id;
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
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f20344id, this, new m4.w0(21, this, o2Var));
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = null;
        if (o2Var == null) {
            c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f38991f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new ap(this, c2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ai.k2(this, c2VarArr, chat, o2Var, 10), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f38990c;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
        }
        if (!this.f38995w && this.f38994s && this.h.linked_chat_id == 0) {
            this.f38995w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void a0(TLRPC.Chat chat, boolean z10) {
        int i10;
        String formatString;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f20344id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f20344id, 0, true);
                this.f38992n = chat;
                this.f38993r = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new zo(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, null);
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f38991f.title);
        } else if (!ChatObject.isPublic(this.f38991f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f38991f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f38991f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.v0.h(R.string.DiscussionLinkGroupAlertHistory, si.o0.i(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        f9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(getParentActivity());
        u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(u9Var, w7.z5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.v0.q(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
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
        frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        f9Var.k(this.currentAccount, chat);
        u9Var.e(chat, f9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new e7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20679a);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21517v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21500u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21347m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21240g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f38994s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.E));
        this.f38991f = chat2;
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
                    chat = this.f38991f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            hp hpVar = this.f38988a;
            if (hpVar != null) {
                hpVar.l();
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f38990c;
            if (u0Var != null) {
                if (this.v.size() <= 10) {
                    i13 = 8;
                }
                u0Var.setVisibility(i13);
            }
        }
    }

    public final void c0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f38989b != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21572y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21367n6, false);
                if (!this.Q || x02 != this.R || x03 != this.S) {
                    this.Q = true;
                    this.R = x02;
                    this.S = x03;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f38989b.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f38989b.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f38989b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f38989b.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f38989b.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f38989b.V(i11);
                            } else if (i10 == 2) {
                                O = this.f38989b.P(i11);
                            } else {
                                O = this.f38989b.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) O;
                                a5Var.O = true;
                                a5Var.H = x02;
                                a5Var.I = x03;
                                if (i10 != 0) {
                                    ((org.telegram.ui.Cells.a5) O).d(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final View createView(Context context) {
        this.N = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 5));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 2);
        this.f38990c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new jp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.k6.f21126a7;
        org.telegram.ui.ActionBar.r6.i(i11, frameLayout, null);
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.d = tzVar;
        tzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f38989b = lm0Var;
        lm0Var.t1();
        this.f38989b.setEmptyView(this.d);
        this.f38989b.setLayoutManager(new s4.b0(1, false));
        org.telegram.ui.Components.lm0 lm0Var2 = this.f38989b;
        hp hpVar = new hp(this, context);
        this.f38988a = hpVar;
        lm0Var2.setAdapter(hpVar);
        org.telegram.ui.Components.lm0 lm0Var3 = this.f38989b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        lm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f38989b, w7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f38989b);
        this.f38989b.setOnItemClickListener(new h(this, 4));
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
            long j10 = chatFull.f20345id;
            if (j10 == this.E) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f38992n;
            if (chat3 != null && chat3.f20344id == j10) {
                try {
                    this.f38993r.dismiss();
                } catch (Throwable unused) {
                }
                this.f38993r = null;
                a0(this.f38992n, false);
                this.f38992n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f38991f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f38991f.f20344id));
                if (chat4 != null) {
                    this.f38991f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f20344id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f38994s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f38991f;
                }
                if (chat2 != null && (gpVar = this.f38997y) != null) {
                    if (!this.P) {
                        gpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.O) {
                        this.f38997y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                if (h5Var != null && h5Var.getLastFragment() == this) {
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
        i6 i6Var = new i6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f38989b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21572y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f38989b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21367n6));
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
        hp hpVar = this.f38988a;
        if (hpVar != null) {
            hpVar.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
