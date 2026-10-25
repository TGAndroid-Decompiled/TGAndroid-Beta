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
public final class np extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public kp f41958a;
    public org.telegram.ui.Components.mm0 f41959b;
    public org.telegram.ui.ActionBar.y5 f41960c;
    public org.telegram.ui.Components.uz d;
    public mp e;
    public TLRPC.Chat f41961f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f41962n;
    public org.telegram.ui.ActionBar.e2 f41963r;
    public boolean f41964s;
    public ArrayList v;
    public boolean f41965w;
    public boolean f41966x;
    public jp f41967y;

    public static void V(np npVar, org.telegram.ui.ActionBar.e2[] e2VarArr) {
        try {
            e2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        e2VarArr[0] = null;
        npVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(npVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, npVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new bp(npVar, 2), 1000L);
        if (!npVar.f41964s) {
            npVar.finishFragment();
        }
    }

    public static void X(np npVar, org.telegram.ui.ActionBar.e2[] e2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.r2 r2Var) {
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            try {
                e2Var.dismiss();
            } catch (Throwable unused) {
            }
            e2VarArr[0] = null;
        }
        npVar.h.linked_chat_id = chat.f22027id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(npVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, npVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new bp(npVar, 1), 1000L);
        if (r2Var != null) {
            npVar.removeSelfFromStack();
            r2Var.finishFragment();
            return;
        }
        npVar.finishFragment();
    }

    public final void Z(TLRPC.Chat chat, org.telegram.ui.ActionBar.r2 r2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f22027id, this, new m4.s0(24, this, r2Var));
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = null;
        if (r2Var == null) {
            e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = {e2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f41961f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new cp(this, e2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.i2(this, e2VarArr, chat, r2Var, 10), 64), 1), 500L);
    }

    public final void a0() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.y5 y5Var = this.f41960c;
            if (y5Var != null) {
                y5Var.setVisibility(8);
            }
        }
        if (!this.f41965w && this.f41964s && this.h.linked_chat_id == 0) {
            this.f41965w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23690v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23671u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23518m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23412g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    public final void b0(TLRPC.Chat chat, boolean z10) {
        int i10;
        String formatString;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f22027id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f22027id, 0, true);
                this.f41962n = chat;
                this.f41963r = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new bp(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, null);
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f41961f.title);
        } else if (!ChatObject.isPublic(this.f41961f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f41961f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f41961f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.t.h(R.string.DiscussionLinkGroupAlertHistory, org.telegram.ui.Components.b10.l(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.E8, null, 1, 20.0f);
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
        frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        j9Var.k(this.currentAccount, chat);
        y9Var.f(chat, j9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new e7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22366a);
    }

    public final void c0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f41964s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.E));
        this.f41961f = chat2;
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
                    chat = this.f41961f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            kp kpVar = this.f41958a;
            if (kpVar != null) {
                kpVar.l();
            }
            org.telegram.ui.ActionBar.y5 y5Var = this.f41960c;
            if (y5Var != null) {
                if (this.v.size() <= 10) {
                    i13 = 8;
                }
                y5Var.setVisibility(i13);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.N = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 5));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.f23289z0 = new jg.e2(this, 2);
        this.f41960c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new mp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        uzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f41959b = mm0Var;
        mm0Var.u1();
        this.f41959b.setSectionsDrawBackground(true);
        this.f41959b.setEmptyView(this.d);
        this.f41959b.setLayoutManager(new s4.c0(1, false));
        org.telegram.ui.Components.mm0 mm0Var2 = this.f41959b;
        kp kpVar = new kp(this, context);
        this.f41958a = kpVar;
        mm0Var2.setAdapter(kpVar);
        org.telegram.ui.Components.mm0 mm0Var3 = this.f41959b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f41959b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f41959b.setOnItemClickListener(new h(this, 4));
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f41959b != null) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23746y6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23538n6, false);
                if (!this.Q || x02 != this.R || x03 != this.S) {
                    this.Q = true;
                    this.R = x02;
                    this.S = x03;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f41959b.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f41959b.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f41959b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f41959b.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f41959b.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f41959b.V(i11);
                            } else if (i10 == 2) {
                                O = this.f41959b.P(i11);
                            } else {
                                O = this.f41959b.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.f5) {
                                org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) O;
                                f5Var.O = true;
                                f5Var.H = x02;
                                f5Var.I = x03;
                                if (i10 != 0) {
                                    ((org.telegram.ui.Cells.f5) O).d(0);
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jp jpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22028id;
            if (j10 == this.E) {
                this.h = chatFull;
                a0();
                c0();
                return;
            }
            TLRPC.Chat chat3 = this.f41962n;
            if (chat3 != null && chat3.f22027id == j10) {
                try {
                    this.f41963r.dismiss();
                } catch (Throwable unused) {
                }
                this.f41963r = null;
                b0(this.f41962n, false);
                this.f41962n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f41961f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f41961f.f22027id));
                if (chat4 != null) {
                    this.f41961f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f22027id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f41964s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f41961f;
                }
                if (chat2 != null && (jpVar = this.f41967y) != null) {
                    if (!this.P) {
                        jpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.O) {
                        this.f41967y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                if (j5Var != null && j5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f41959b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41959b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23746y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41959b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23538n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        a0();
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
        kp kpVar = this.f41958a;
        if (kpVar != null) {
            kpVar.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
