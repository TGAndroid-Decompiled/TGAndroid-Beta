package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class q00 extends org.telegram.ui.ActionBar.n2 {
    public int A;
    public ArrayList B;
    public ArrayList C;
    public final LongSparseIntArray D;
    public e00 E;
    public f00 F;
    public k00 G;
    public final ArrayList H;
    public int I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public float M;
    public yi N;
    public boolean O;
    public hh.p6 P;

    public hh.f1 f41471a;

    public n00 f41472b;

    public org.telegram.ui.ActionBar.v0 f41473c;
    public int d;

    public boolean f41474e;

    public boolean f41475f;
    public boolean h;

    public boolean f41476n;

    public final MessagesController.DialogFilter f41477r;

    public boolean f41478s;
    public boolean v;

    public CharSequence f41479w;

    public boolean f41480x;

    public int f41481y;

    public q00(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f41480x = true;
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = -5.0f;
        this.f41477r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f41477r = dialogFilter2;
            dialogFilter2.f19622id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f41477r.f19622id) != null) {
                this.f41477r.f19622id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f41477r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f41478s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f41477r.name);
        this.f41479w = spannableStringBuilder;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f41479w = charSequenceReplaceEmoji;
        this.f41479w = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, this.f41477r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f41477r.title_noanimate;
        this.f41480x = z10;
        org.telegram.ui.Components.k5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f41477r;
        this.f41481y = dialogFilter4.flags;
        this.A = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f41477r.alwaysShow);
        this.B = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.C = new ArrayList(this.f41477r.neverShow);
        this.D = this.f41477r.pinnedDialogs.clone();
    }

    public static void U(q00 q00Var) {
        String string;
        q00Var.f41480x = !q00Var.f41480x;
        f00 f00Var = q00Var.F;
        if (f00Var != null) {
            org.telegram.ui.Cells.r3 r3Var = f00Var.f37890r;
            if (k0(q00Var.f41479w)) {
                string = LocaleController.getString(q00Var.f41480x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                string = null;
            }
            r3Var.setText(string);
        }
        org.telegram.ui.Components.k5.s(q00Var.currentAccount, q00Var.f41480x);
        q00Var.i0(true);
        org.telegram.ui.ActionBar.k kVar = q00Var.actionBar;
        if (kVar != null) {
            if (kVar.getTitleTextView() != null) {
                q00Var.actionBar.getTitleTextView().setEmojiCacheType(q00Var.f41480x ? 0 : 26);
            }
            if (q00Var.actionBar.getTitleTextView2() != null) {
                q00Var.actionBar.getTitleTextView2().setEmojiCacheType(q00Var.f41480x ? 0 : 26);
            }
        }
    }

    public static void V(q00 q00Var) {
        MessagesController.DialogFilter dialogFilter = q00Var.f41477r;
        if (!q00Var.v) {
            q00Var.finishFragment();
            return;
        }
        q00Var.v = false;
        Paint.FontMetricsInt titleFontMetricsInt = q00Var.actionBar.getTitleFontMetricsInt();
        q00Var.actionBar.J(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
    }

    public static void W(q00 q00Var) {
        MessagesController messagesController = q00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = q00Var.f41477r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < dialogFilter.alwaysShow.size(); i10++) {
            long jLongValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (jLongValue < 0 && g0(q00Var.getMessagesController().getChat(Long.valueOf(-jLongValue)))) {
                arrayList.add(q00Var.getMessagesController().getInputPeer(jLongValue));
            }
        }
        if (arrayList.size() > (q00Var.getUserConfig().isPremium() ? q00Var.getMessagesController().dialogFiltersChatsLimitPremium : q00Var.getMessagesController().dialogFiltersChatsLimitDefault)) {
            q00Var.showDialog(new ag.i1(4, q00Var.currentAccount, q00Var.getParentActivity(), q00Var, null));
            return;
        }
        if (arrayList.isEmpty()) {
            oz ozVar = new oz(dialogFilter, null);
            ozVar.f41226y = new rz(q00Var, 1);
            ozVar.f41225x = new rz(q00Var, 2);
            q00Var.presentFragment(ozVar);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19622id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        q00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new uz(q00Var, 1));
    }

    public static boolean g0(TLRPC.Chat chat) {
        if (ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return ChatObject.isPublic(chat) && !chat.join_request;
    }

    public static boolean k0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.t5.class);
            if (t5VarArr != null && t5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.n2 n2Var, Runnable runnable) {
        if (dialogFilter.flags != i10 || z13) {
            dialogFilter.pendingUnreadCount = -1;
            if (z14) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i10;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i11;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z10;
        if (z11) {
            n2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            n2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        n2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = n2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int iF = 0; iF < size; iF = i0.a.f(dialogFilters.get(iF).f19622id, iF, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            n2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.Components.mc mcVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new ag.i1(4, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.y1.r(R.string.FolderLinkNoChatsError, mcVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.y1.r(R.string.FolderLinkOtherAdminLimitError, mcVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new ag.i1(5, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new ag.i1(12, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new ag.i1(13, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.y1.r(R.string.NoFolderFound, mcVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new ag.i1(4, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.y1.r(R.string.UnknownError, mcVar, null);
        } else {
            new ag.i1(3, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.n2 n2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.b2 b2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(n2Var.getParentActivity(), 3, null);
            b2Var2.f22747c0 = false;
            b2Var2.show();
            b2Var = b2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f22503id = dialogFilter.f19622id;
        int i14 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        tL_dialogFilter.contacts = (i10 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0;
        tL_dialogFilter.non_contacts = (i10 & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0;
        tL_dialogFilter.groups = (i10 & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0;
        tL_dialogFilter.broadcasts = (i10 & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0;
        tL_dialogFilter.bots = (i10 & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0;
        tL_dialogFilter.exclude_muted = (i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0;
        tL_dialogFilter.exclude_read = (i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0;
        tL_dialogFilter.exclude_archived = (i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0;
        tL_dialogFilter.f22385id = dialogFilter.f19622id;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i11 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i11;
        }
        MessagesController messagesController = n2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long jKeyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(jKeyAt)) {
                    arrayList6.add(Long.valueOf(jKeyAt));
                }
            }
            Collections.sort(arrayList6, new ot(longSparseIntArray, 1));
        }
        int i16 = 0;
        while (i16 < i12) {
            if (i16 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i16 == i14) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i13 < size2) {
                Long l10 = (Long) arrayList5.get(i13);
                org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                int i17 = size2;
                long jLongValue = l10.longValue();
                if ((i16 != 0 || longSparseIntArray.indexOfKey(jLongValue) < 0) && !DialogObject.isEncryptedDialog(jLongValue)) {
                    if (jLongValue > 0) {
                        TLRPC.User user = messagesController.getUser(l10);
                        if (user != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = jLongValue;
                            tL_inputPeerUser.access_hash = user.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j10 = -jLongValue;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                        if (chat != null) {
                            if (ChatObject.isChannel(chat)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j10;
                                tL_inputPeerChannel.access_hash = chat.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j10;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i13++;
                b2Var = b2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        n2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.b2 b2Var4 = b2Var;
                final MessagesController.DialogFilter dialogFilter2 = dialogFilter;
                final int i18 = i10;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i19 = i11;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (!z22) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            org.telegram.ui.ActionBar.b2 b2Var5 = b2Var4;
                            if (b2Var5 != null) {
                                try {
                                    b2Var5.dismiss();
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                            }
                            q00.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, n2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        p0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, n2Var, null);
    }

    public static CharSequence x0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("n_" + i10, false) && (context = ApplicationLoader.applicationContext) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                    drawableMutate.setBounds(0, -AndroidUtilities.dp(8.0f), drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                    spannableString.setSpan(new xz(drawableMutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable drawableMutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(iW0, mode));
                    drawableMutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), mode));
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(drawableMutate2, drawableMutate3);
                    dqVar.setBounds(0, 0, dqVar.getIntrinsicWidth(), dqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(dqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        boolean z10 = this.f41478s;
        MessagesController.DialogFilter dialogFilter = this.f41477r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                if (kVar.getTitleTextView() != null) {
                    this.actionBar.getTitleTextView().setEmojiCacheType(this.f41480x ? 0 : 26);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    this.actionBar.getTitleTextView2().setEmojiCacheType(this.f41480x ? 0 : 26);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 19));
        this.f41473c = zVarN.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        org.telegram.ui.Components.d51 d51Var = new org.telegram.ui.Components.d51(context, null, 3);
        this.fragmentView = d51Var;
        d51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        hh.f1 f1Var = new hh.f1(this, context, 27);
        this.f41471a = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f41471a);
        this.f41471a.setLayoutManager(new f2.k0(1, false));
        this.f41471a.setVerticalScrollBarEnabled(false);
        d51Var.addView(this.f41471a, h7.z5.c(-1.0f, -1));
        hh.f1 f1Var2 = this.f41471a;
        n00 n00Var = new n00(this, context);
        this.f41472b = n00Var;
        f1Var2.setAdapter(n00Var);
        this.f41471a.setOnItemClickListener(new i(this, 9));
        this.f41471a.setOnItemLongClickListener(new qz(this, 0));
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.n(350L);
        this.f41471a.setItemAnimator(lVar);
        this.f41471a.setOnScrollListener(new m3(this, 10));
        i0(false);
        if (!this.J && dialogFilter != null && dialogFilter.isChatlist()) {
            this.J = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19622id;
            this.I = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new uz(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.sa.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23269p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41471a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        if (this.f41473c.getAlpha() != 1.0f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        if (this.f41478s) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDiscardNewTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDiscardNewAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new qz(this, 2));
        } else {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDiscardTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDiscardAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new qz(this, 3));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new qz(this, 4));
        showDialog(alertDialog$Builder.f22702a);
        return false;
    }

    public final void i0(boolean z10) {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f41479w) && this.f41479w.length() <= 12;
        if (z12) {
            z12 = ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.B.isEmpty()) ? false : true;
            if (z12 && !this.f41478s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f41477r;
                if (dialogFilter.alwaysShow.size() != this.B.size()) {
                    this.h = true;
                }
                if (dialogFilter.neverShow.size() != this.C.size()) {
                    this.h = true;
                }
                if (dialogFilter.color != this.A) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(dialogFilter.alwaysShow);
                    Collections.sort(this.B);
                    if (!dialogFilter.alwaysShow.equals(this.B)) {
                        this.h = true;
                    }
                    Collections.sort(dialogFilter.neverShow);
                    Collections.sort(this.C);
                    if (!dialogFilter.neverShow.equals(this.C)) {
                        this.h = true;
                    }
                }
                if (dialogFilter.title_noanimate == (!this.f41480x) && TextUtils.equals(dialogFilter.name, this.f41479w) && dialogFilter.flags == this.f41481y) {
                    z11 = this.h;
                }
                z12 = z11;
            }
        }
        if (this.f41473c.isEnabled() == z12) {
            return;
        }
        this.f41473c.setEnabled(z12);
        if (z10) {
            this.f41473c.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.0f).scaleY(z12 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f41473c.setAlpha(z12 ? 1.0f : 0.0f);
        this.f41473c.setScaleX(z12 ? 1.0f : 0.0f);
        this.f41473c.setScaleY(z12 ? 1.0f : 0.0f);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String string;
        if (this.f41478s) {
            if (TextUtils.isEmpty(this.f41479w) || !this.f41476n) {
                int i10 = this.f41481y;
                int i11 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                int i12 = i10 & i11;
                if ((i12 & i11) != i11) {
                    int i13 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    if ((i12 & i13) == 0) {
                        int i14 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        if ((i12 & i14) == 0) {
                            int i15 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            if ((i12 & i15) == 0) {
                                int i16 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                                if ((i12 & i16) == 0) {
                                    int i17 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                                    if ((i12 & i17) == 0 || ((~i17) & i12) != 0) {
                                        string = "";
                                    } else {
                                        string = LocaleController.getString(R.string.FilterChannels);
                                    }
                                } else if (((~i16) & i12) == 0) {
                                    string = LocaleController.getString(R.string.FilterBots);
                                } else {
                                    string = "";
                                }
                            } else if (((~i15) & i12) == 0) {
                                string = LocaleController.getString(R.string.FilterGroups);
                            } else {
                                string = "";
                            }
                        } else if (((~i14) & i12) == 0) {
                            string = LocaleController.getString(R.string.FilterNonContacts);
                        } else {
                            string = "";
                        }
                    } else if (((~i13) & i12) == 0) {
                        string = LocaleController.getString(R.string.FilterContacts);
                    } else {
                        string = "";
                    }
                } else if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i10) != 0) {
                    string = LocaleController.getString(R.string.FilterNameUnread);
                } else if ((i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                    string = LocaleController.getString(R.string.FilterNameNonMuted);
                } else {
                    string = "";
                }
                String str = (string == null || string.length() <= 12) ? string : "";
                this.f41479w = str;
                e00 e00Var = this.E;
                if (e00Var != null) {
                    e00Var.e(org.telegram.ui.Components.t5.cloneSpans(str, -1, e00Var.f37581s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                f2.o1 o1VarK = this.f41471a.K(this.d);
                if (o1VarK != null) {
                    this.f41472b.y(o1VarK);
                }
            }
        }
    }

    public final void l0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.H;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
            if (arrayList.isEmpty()) {
                this.f41477r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
            }
            w0();
        }
    }

    public final void m0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.H;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i10, tL_exportedChatlistInvite);
        }
        w0();
    }

    public final void n0(int i10, boolean z10) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.O && (dialogFilter = this.f41477r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.O = true;
            this.P = new hh.p6(this, z10, i10, 3);
            if (getLayoutContainer() != null) {
                this.P.run();
                this.P = null;
            }
        }
    }

    public final void o0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int size2;
        if (arrayList != null) {
            size2 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!arrayList2.contains(arrayList.get(i10))) {
                    size2++;
                }
            }
            size = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (!arrayList.contains(arrayList2.get(i11))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            size2 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            size2 = 0;
        }
        if (!z10) {
            if (size > 0) {
                n0(size, false);
            }
        } else if (size > 0 && size > size2) {
            n0(size, true);
        } else if (size2 > 0) {
            n0(size2, false);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.b3 b3Var;
        k00 k00Var = this.G;
        if (k00Var == null || (b3Var = k00Var.f24196b) == null || !b3Var.f32878e) {
            return h0(z10);
        }
        if (!z10) {
            return false;
        }
        b3Var.k(true);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        w0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.I != 0) {
            getConnectionsManager().cancelRequest(this.I, true);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f41471a.setPadding(0, 0, 0, i13);
        this.f41471a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w0();
        hh.p6 p6Var = this.P;
        if (p6Var != null) {
            p6Var.run();
        }
    }

    public final void q0() {
        yi yiVar = this.N;
        if (yiVar != null) {
            yiVar.b(true);
            this.N = null;
        }
        s0(new sz(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f41479w};
        t0(this.f41477r, this.f41481y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f41480x, this.A, this.B, this.C, this.D, this.f41478s, false, this.h, true, z10, this, new org.telegram.ui.Components.r61(21, this, runnable));
    }

    public final void u0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f41481y, z10 ? this.B : this.C, z10);
        usersSelectActivity.B = this.f41477r.isChatlist();
        usersSelectActivity.f36293n = new eh.q(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(h00 h00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        if (z10) {
            b2Var.N = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                b2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                b2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                b2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            b2Var.N = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                b2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                b2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                b2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new b5.d(this, h00Var, z10, 7));
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public final void w0() {
        ArrayList arrayList = this.K;
        arrayList.clear();
        ArrayList arrayList2 = this.L;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string = LocaleController.getString(R.string.FilterNameHeader);
        String string2 = k0(this.f41479w) ? LocaleController.getString(this.f41480x ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable) : null;
        final int i10 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {

            public final q00 f41455b;

            {
                this.f41455b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        q00 q00Var = this.f41455b;
                        q00Var.f41475f = true;
                        q00Var.w0();
                        break;
                    case 1:
                        q00 q00Var2 = this.f41455b;
                        MessagesController.DialogFilter dialogFilter = q00Var2.f41477r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.q00.T(q00Var2, dialogFilter.f19622id, new rz(q00Var2, 0));
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            q00Var2.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                            }
                        }
                        break;
                    case 2:
                        q00.U(this.f41455b);
                        break;
                    case 3:
                        this.f41455b.u0(true);
                        break;
                    case 4:
                        q00 q00Var3 = this.f41455b;
                        q00Var3.f41474e = true;
                        q00Var3.w0();
                        break;
                    default:
                        this.f41455b.u0(false);
                        break;
                }
            }
        };
        h00 h00Var = new h00(11, false);
        h00Var.d = string;
        h00Var.f38644e = string2;
        h00Var.f38643c = onClickListener;
        arrayList2.add(h00Var);
        this.d = arrayList2.size();
        arrayList2.add(new h00(2, false));
        arrayList2.add(h00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        h00 h00Var2 = new h00(0, false);
        h00Var2.d = string3;
        arrayList2.add(h00Var2);
        h00 h00VarB = h00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        final int i11 = 3;
        h00VarB.f38643c = new View.OnClickListener(this) {

            public final q00 f41455b;

            {
                this.f41455b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        q00 q00Var = this.f41455b;
                        q00Var.f41475f = true;
                        q00Var.w0();
                        break;
                    case 1:
                        q00 q00Var2 = this.f41455b;
                        MessagesController.DialogFilter dialogFilter = q00Var2.f41477r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.q00.T(q00Var2, dialogFilter.f19622id, new rz(q00Var2, 0));
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            q00Var2.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                            }
                        }
                        break;
                    case 2:
                        q00.U(this.f41455b);
                        break;
                    case 3:
                        this.f41455b.u0(true);
                        break;
                    case 4:
                        q00 q00Var3 = this.f41455b;
                        q00Var3.f41474e = true;
                        q00Var3.w0();
                        break;
                    default:
                        this.f41455b.u0(false);
                        break;
                }
            }
        };
        arrayList2.add(h00VarB);
        if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.B.isEmpty()) {
            int size = (this.f41474e || this.B.size() < 8) ? this.B.size() : Math.min(5, this.B.size());
            for (int i12 = 0; i12 < size; i12++) {
                long jLongValue = ((Long) this.B.get(i12)).longValue();
                h00 h00Var3 = new h00(1, false);
                h00Var3.f38646g = true;
                h00Var3.h = jLongValue;
                arrayList2.add(h00Var3);
            }
            if (size != this.B.size()) {
                h00 h00VarB2 = h00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.B.size() - 5, new Object[0]), false);
                final int i13 = 4;
                h00VarB2.f38643c = new View.OnClickListener(this) {

                    public final q00 f41455b;

                    {
                        this.f41455b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                q00 q00Var = this.f41455b;
                                q00Var.f41475f = true;
                                q00Var.w0();
                                break;
                            case 1:
                                q00 q00Var2 = this.f41455b;
                                MessagesController.DialogFilter dialogFilter = q00Var2.f41477r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.q00.T(q00Var2, dialogFilter.f19622id, new rz(q00Var2, 0));
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                    q00Var2.showDialog(b2Var);
                                    TextView textView = (TextView) b2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                    }
                                }
                                break;
                            case 2:
                                q00.U(this.f41455b);
                                break;
                            case 3:
                                this.f41455b.u0(true);
                                break;
                            case 4:
                                q00 q00Var3 = this.f41455b;
                                q00Var3.f41474e = true;
                                q00Var3.w0();
                                break;
                            default:
                                this.f41455b.u0(false);
                                break;
                        }
                    }
                };
                arrayList2.add(h00VarB2);
            }
        }
        arrayList2.add(h00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f41477r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            h00 h00Var4 = new h00(0, false);
            h00Var4.d = string4;
            arrayList2.add(h00Var4);
            h00 h00VarB3 = h00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            final int i14 = 5;
            h00VarB3.f38643c = new View.OnClickListener(this) {

                public final q00 f41455b;

                {
                    this.f41455b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            q00 q00Var = this.f41455b;
                            q00Var.f41475f = true;
                            q00Var.w0();
                            break;
                        case 1:
                            q00 q00Var2 = this.f41455b;
                            MessagesController.DialogFilter dialogFilter2 = q00Var2.f41477r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.q00.T(q00Var2, dialogFilter2.f19622id, new rz(q00Var2, 0));
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                q00Var2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                }
                            }
                            break;
                        case 2:
                            q00.U(this.f41455b);
                            break;
                        case 3:
                            this.f41455b.u0(true);
                            break;
                        case 4:
                            q00 q00Var3 = this.f41455b;
                            q00Var3.f41474e = true;
                            q00Var3.w0();
                            break;
                        default:
                            this.f41455b.u0(false);
                            break;
                    }
                }
            };
            arrayList2.add(h00VarB3);
            if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f41481y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.C.isEmpty()) {
                int size2 = (this.f41475f || this.C.size() < 8) ? this.C.size() : Math.min(5, this.C.size());
                for (int i15 = 0; i15 < size2; i15++) {
                    long jLongValue2 = ((Long) this.C.get(i15)).longValue();
                    h00 h00Var5 = new h00(1, false);
                    h00Var5.f38646g = false;
                    h00Var5.h = jLongValue2;
                    arrayList2.add(h00Var5);
                }
                if (size2 != this.C.size()) {
                    h00 h00VarB4 = h00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.C.size() - 5, new Object[0]), false);
                    final int i16 = 0;
                    h00VarB4.f38643c = new View.OnClickListener(this) {

                        public final q00 f41455b;

                        {
                            this.f41455b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    q00 q00Var = this.f41455b;
                                    q00Var.f41475f = true;
                                    q00Var.w0();
                                    break;
                                case 1:
                                    q00 q00Var2 = this.f41455b;
                                    MessagesController.DialogFilter dialogFilter2 = q00Var2.f41477r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.q00.T(q00Var2, dialogFilter2.f19622id, new rz(q00Var2, 0));
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                        q00Var2.showDialog(b2Var);
                                        TextView textView = (TextView) b2Var.d(-1);
                                        if (textView != null) {
                                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                        }
                                    }
                                    break;
                                case 2:
                                    q00.U(this.f41455b);
                                    break;
                                case 3:
                                    this.f41455b.u0(true);
                                    break;
                                case 4:
                                    q00 q00Var3 = this.f41455b;
                                    q00Var3.f41474e = true;
                                    q00Var3.w0();
                                    break;
                                default:
                                    this.f41455b.u0(false);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(h00VarB4);
                }
            }
            arrayList2.add(h00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new h00(9, false));
            arrayList2.add(new h00(10, false));
            arrayList2.add(h00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.H;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            h00 h00Var6 = new h00(0, false);
            h00Var6.d = string5;
            h00Var6.f38645f = true;
            arrayList2.add(h00Var6);
            arrayList2.add(h00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(h00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            h00 h00Var7 = new h00(0, false);
            h00Var7.d = string6;
            h00Var7.f38645f = true;
            arrayList2.add(h00Var7);
            arrayList2.add(new h00(8, false));
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i17);
                h00 h00Var8 = new h00(7, false);
                h00Var8.f38651m = tL_exportedChatlistInvite;
                arrayList2.add(h00Var8);
            }
            arrayList2.add(h00.d(dialogFilter.isChatlist() ? LocaleController.getString(R.string.FilterInviteLinksHintNew) : LocaleController.getString(R.string.FilterInviteLinksHint)));
        }
        if (!this.f41478s) {
            h00 h00VarB5 = h00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            final int i18 = 1;
            h00VarB5.f38643c = new View.OnClickListener(this) {

                public final q00 f41455b;

                {
                    this.f41455b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            q00 q00Var = this.f41455b;
                            q00Var.f41475f = true;
                            q00Var.w0();
                            break;
                        case 1:
                            q00 q00Var2 = this.f41455b;
                            MessagesController.DialogFilter dialogFilter2 = q00Var2.f41477r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.q00.T(q00Var2, dialogFilter2.f19622id, new rz(q00Var2, 0));
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                q00Var2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                }
                            }
                            break;
                        case 2:
                            q00.U(this.f41455b);
                            break;
                        case 3:
                            this.f41455b.u0(true);
                            break;
                        case 4:
                            q00 q00Var3 = this.f41455b;
                            q00Var3.f41474e = true;
                            q00Var3.w0();
                            break;
                        default:
                            this.f41455b.u0(false);
                            break;
                    }
                }
            };
            arrayList2.add(h00VarB5);
            arrayList2.add(h00.d(null));
        }
        n00 n00Var = this.f41472b;
        if (n00Var != null) {
            n00Var.E(arrayList, arrayList2);
        }
    }
}
