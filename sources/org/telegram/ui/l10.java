package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
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
import android.view.ViewPropertyAnimator;
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
public final class l10 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public z00 I;
    public a10 J;
    public f10 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public nj R;
    public boolean S;
    public i2.i0 T;
    public bi.o0 f37804a;
    public i10 f37805b;
    public org.telegram.ui.ActionBar.u0 f37806c;
    public int d;
    public boolean e;
    public boolean f37807f;
    public boolean h;
    public boolean f37808n;
    public final MessagesController.DialogFilter f37809r;
    public boolean f37810s;
    public boolean v;
    public CharSequence f37811w;
    public boolean f37812x;
    public int f37813y;

    public l10(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f37812x = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f37809r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f37809r = dialogFilter2;
            dialogFilter2.f16708id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f37809r.f16708id) != null) {
                this.f37809r.f16708id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f37809r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f37810s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37809r.name);
        this.f37811w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f37811w = replaceEmoji;
        this.f37811w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f37809r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f37809r.title_noanimate;
        this.f37812x = z10;
        org.telegram.ui.Components.s5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f37809r;
        this.f37813y = dialogFilter4.flags;
        this.E = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f37809r.alwaysShow);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f37809r.neverShow);
        this.H = this.f37809r.pinnedDialogs.clone();
    }

    public static void U(l10 l10Var) {
        int i10;
        String str;
        int i11;
        l10Var.f37812x = !l10Var.f37812x;
        a10 a10Var = l10Var.J;
        if (a10Var != null) {
            org.telegram.ui.Cells.u3 u3Var = a10Var.f34012r;
            if (k0(l10Var.f37811w)) {
                if (l10Var.f37812x) {
                    i11 = R.string.FilterNameAnimationsDisable;
                } else {
                    i11 = R.string.FilterNameAnimationsEnable;
                }
                str = LocaleController.getString(i11);
            } else {
                str = null;
            }
            u3Var.setText(str);
        }
        org.telegram.ui.Components.s5.s(l10Var.currentAccount, l10Var.f37812x);
        l10Var.i0(true);
        org.telegram.ui.ActionBar.k kVar = l10Var.actionBar;
        if (kVar != null) {
            int i12 = 26;
            if (kVar.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.h5 titleTextView = l10Var.actionBar.getTitleTextView();
                if (l10Var.f37812x) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (l10Var.actionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.h5 titleTextView2 = l10Var.actionBar.getTitleTextView2();
                if (l10Var.f37812x) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void V(l10 l10Var) {
        MessagesController.DialogFilter dialogFilter = l10Var.f37809r;
        if (l10Var.v) {
            l10Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = l10Var.actionBar.getTitleFontMetricsInt();
            l10Var.actionBar.J(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
            return;
        }
        l10Var.finishFragment();
    }

    public static void W(l10 l10Var) {
        int i10;
        MessagesController messagesController = l10Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = l10Var.f37809r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dialogFilter.alwaysShow.size(); i11++) {
            long longValue = dialogFilter.alwaysShow.get(i11).longValue();
            if (longValue < 0 && g0(l10Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(l10Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (l10Var.getUserConfig().isPremium()) {
            i10 = l10Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i10 = l10Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i10) {
            l10Var.showDialog(new sg.j0(4, l10Var.currentAccount, l10Var.getParentActivity(), l10Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f16708id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            l10Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new n00(l10Var, 1));
        } else {
            h00 h00Var = new h00(dialogFilter, null);
            h00Var.f36575y = new k00(l10Var, 1);
            h00Var.f36574x = new k00(l10Var, 2);
            l10Var.presentFragment(h00Var);
        }
    }

    public static boolean g0(TLRPC.Chat chat) {
        if (!ChatObject.canUserDoAdminAction(chat, 3)) {
            if (!ChatObject.isPublic(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean k0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.b6.class);
            if (b6VarArr != null && b6VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.m2 m2Var, Runnable runnable) {
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
            m2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            m2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        m2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = m2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = com.google.android.gms.internal.play_billing.k3.f(dialogFilters.get(i12).f16708id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            m2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.Components.zc zcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(4, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.yh.p(R.string.FolderLinkNoChatsError, zcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.yh.p(R.string.FolderLinkOtherAdminLimitError, zcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(5, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(12, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(13, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.yh.p(R.string.NoFolderFound, zcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(4, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(3, m2Var.getCurrentAccount(), m2Var.getContext(), m2Var, null).show();
            } else {
                org.telegram.messenger.yh.p(R.string.UnknownError, zcVar, null);
            }
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.m2 m2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (m2Var == null || m2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.a2 a2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(m2Var.getParentActivity(), 3, null);
            a2Var2.f19569g0 = false;
            a2Var2.show();
            a2Var = a2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f19339id = dialogFilter.f16708id;
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
        tL_dialogFilter.f19221id = dialogFilter.f16708id;
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
        MessagesController messagesController = m2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new bu(longSparseIntArray, 1));
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
                Long l4 = (Long) arrayList5.get(i13);
                org.telegram.ui.ActionBar.a2 a2Var3 = a2Var;
                int i17 = size2;
                long longValue = l4.longValue();
                if ((i16 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !DialogObject.isEncryptedDialog(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User user = messagesController.getUser(l4);
                        if (user != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = user.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j10 = -longValue;
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
                a2Var = a2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        m2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.a2 a2Var4 = a2Var;
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
                final org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.a2 a2Var5 = a2Var4;
                            if (a2Var5 != null) {
                                try {
                                    a2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            l10.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, m2Var2, runnable3);
                        } else if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        p0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, m2Var, null);
    }

    public static CharSequence x0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("n_" + i10, false) && (context = ApplicationLoader.applicationContext) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable mutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                    mutate.setBounds(0, -AndroidUtilities.dp(8.0f), mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                    spannableString.setSpan(new ImageSpan(mutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable mutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false), mode));
                    org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(mutate2, mutate3);
                    crVar.setBounds(0, 0, crVar.getIntrinsicWidth(), crVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(crVar, 0), 0, spannableString.length(), 33);
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
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        boolean z10 = this.f37810s;
        MessagesController.DialogFilter dialogFilter = this.f37809r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                int i11 = 26;
                if (kVar.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                    if (this.f37812x) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView.setEmojiCacheType(i10);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.h5 titleTextView2 = this.actionBar.getTitleTextView2();
                    if (this.f37812x) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 25));
        this.f37806c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        ig.q1 q1Var = new ig.q1(context, null, 4);
        this.fragmentView = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        bi.o0 o0Var = new bi.o0(this, context, 27);
        this.f37804a = o0Var;
        o0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37804a);
        this.f37804a.setLayoutManager(new s4.b0(1, false));
        this.f37804a.setVerticalScrollBarEnabled(false);
        q1Var.addView(this.f37804a, w7.a6.d(-1.0f, -1));
        bi.o0 o0Var2 = this.f37804a;
        i10 i10Var = new i10(this, context);
        this.f37805b = i10Var;
        o0Var2.setAdapter(i10Var);
        this.f37804a.setOnItemClickListener(new i(this, 10));
        this.f37804a.setOnItemLongClickListener(new j00(this, 0));
        s4.k kVar2 = new s4.k();
        kVar2.f44872m = false;
        kVar2.C = false;
        kVar2.o(org.telegram.ui.Components.es.h);
        kVar2.n(350L);
        this.f37804a.setItemAnimator(kVar2);
        this.f37804a.setOnScrollListener(new k3(this, 10));
        i0(false);
        if (!this.N && dialogFilter != null && dialogFilter.isChatlist()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f16708id;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new n00(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.xa.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 4, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20226uh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20064m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f20288y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f20084n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37804a, 0, new Class[]{org.telegram.ui.Cells.xa.class}, null, org.telegram.ui.ActionBar.g6.f20152r0, null, org.telegram.ui.ActionBar.g6.J7));
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
        if (this.f37806c.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f37810s) {
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new j00(this, 2));
                } else {
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new j00(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new j00(this, 4));
                showDialog(alertDialog$Builder.f19548a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void i0(boolean z10) {
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f37811w) && this.f37811w.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.F.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f37810s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f37809r;
                if (dialogFilter.alwaysShow.size() != this.F.size()) {
                    this.h = true;
                }
                if (dialogFilter.neverShow.size() != this.G.size()) {
                    this.h = true;
                }
                if (dialogFilter.color != this.E) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(dialogFilter.alwaysShow);
                    Collections.sort(this.F);
                    if (!dialogFilter.alwaysShow.equals(this.F)) {
                        this.h = true;
                    }
                    Collections.sort(dialogFilter.neverShow);
                    Collections.sort(this.G);
                    if (!dialogFilter.neverShow.equals(this.G)) {
                        this.h = true;
                    }
                }
                if (dialogFilter.title_noanimate == (!this.f37812x) && TextUtils.equals(dialogFilter.name, this.f37811w) && dialogFilter.flags == this.f37813y) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        if (this.f37806c.isEnabled() == z11) {
            return;
        }
        this.f37806c.setEnabled(z11);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f37806c.animate();
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (z11) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f37806c;
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f37806c;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f37806c;
        if (z11) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String string;
        if (this.f37810s) {
            if (TextUtils.isEmpty(this.f37811w) || !this.f37808n) {
                int i10 = this.f37813y;
                int i11 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                int i12 = i10 & i11;
                String str = "";
                if ((i12 & i11) == i11) {
                    if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i10) != 0) {
                        string = LocaleController.getString(R.string.FilterNameUnread);
                    } else {
                        if ((i10 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                            string = LocaleController.getString(R.string.FilterNameNonMuted);
                        }
                        string = "";
                    }
                } else {
                    int i13 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    if ((i12 & i13) != 0) {
                        if (((~i13) & i12) == 0) {
                            string = LocaleController.getString(R.string.FilterContacts);
                        }
                        string = "";
                    } else {
                        int i14 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        if ((i12 & i14) != 0) {
                            if (((~i14) & i12) == 0) {
                                string = LocaleController.getString(R.string.FilterNonContacts);
                            }
                            string = "";
                        } else {
                            int i15 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            if ((i12 & i15) != 0) {
                                if (((~i15) & i12) == 0) {
                                    string = LocaleController.getString(R.string.FilterGroups);
                                }
                                string = "";
                            } else {
                                int i16 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                                if ((i12 & i16) != 0) {
                                    if (((~i16) & i12) == 0) {
                                        string = LocaleController.getString(R.string.FilterBots);
                                    }
                                    string = "";
                                } else {
                                    int i17 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                                    if ((i12 & i17) != 0 && ((~i17) & i12) == 0) {
                                        string = LocaleController.getString(R.string.FilterChannels);
                                    }
                                    string = "";
                                }
                            }
                        }
                    }
                }
                if (string == null || string.length() <= 12) {
                    str = string;
                }
                this.f37811w = str;
                z00 z00Var = this.I;
                if (z00Var != null) {
                    z00Var.e(org.telegram.ui.Components.b6.cloneSpans(str, -1, z00Var.f42445s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.b1 K = this.f37804a.K(this.d);
                if (K != null) {
                    this.f37805b.y(K);
                }
            }
        }
    }

    public final void l0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i10 = 0;
            while (true) {
                arrayList = this.L;
                if (i10 < arrayList.size()) {
                    if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                arrayList.remove(i10);
                if (arrayList.isEmpty()) {
                    this.f37809r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
                }
                w0();
            }
        }
    }

    public final void m0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.L;
            if (i10 < arrayList.size()) {
                if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
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
        if (!this.S && (dialogFilter = this.f37809r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.S = true;
            this.T = new i2.i0(this, z10, i10, 3);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void o0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i10;
        if (arrayList != null) {
            i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!arrayList2.contains(arrayList.get(i11))) {
                    i10++;
                }
            }
            size = 0;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (!arrayList.contains(arrayList2.get(i12))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i10 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i10 = 0;
        }
        if (z10) {
            if (size > 0 && size > i10) {
                n0(size, true);
            } else if (i10 > 0) {
                n0(i10, false);
            }
        } else if (size > 0) {
            n0(size, false);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.e3 e3Var;
        f10 f10Var = this.K;
        if (f10Var != null && (e3Var = f10Var.f21198b) != null && e3Var.e) {
            if (z10) {
                e3Var.k(true);
                return false;
            }
            return false;
        }
        return h0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        w0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.M != 0) {
            getConnectionsManager().cancelRequest(this.M, true);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37804a.setPadding(0, 0, 0, i13);
        this.f37804a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w0();
        i2.i0 i0Var = this.T;
        if (i0Var != null) {
            i0Var.run();
        }
    }

    public final void q0() {
        nj njVar = this.R;
        if (njVar != null) {
            njVar.b(true);
            this.R = null;
        }
        s0(new l00(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f37811w};
        t0(this.f37809r, this.f37813y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), !this.f37812x, this.E, this.F, this.G, this.H, this.f37810s, false, this.h, true, z10, this, new o00(1, this, runnable));
    }

    public final void u0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f37813y, arrayList, z10);
        usersSelectActivity.F = this.f37809r.isChatlist();
        usersSelectActivity.f32903n = new bi.h(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(c10 c10Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        if (z10) {
            a2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            a2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                a2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new com.google.firebase.messaging.i(this, c10Var, z10, 7));
        showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
        }
    }

    public final void w0() {
        String str;
        String string;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList arrayList2 = this.P;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string2 = LocaleController.getString(R.string.FilterNameHeader);
        if (k0(this.f37811w)) {
            if (this.f37812x) {
                i10 = R.string.FilterNameAnimationsDisable;
            } else {
                i10 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i10);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final l10 f37001b;

            {
                this.f37001b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l10 l10Var = this.f37001b;
                        l10Var.f37807f = true;
                        l10Var.w0();
                        return;
                    case 1:
                        l10 l10Var2 = this.f37001b;
                        MessagesController.DialogFilter dialogFilter = l10Var2.f37809r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.o10.U(l10Var2, dialogFilter.f16708id, new k00(l10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l10Var2.getParentActivity());
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(l10Var2, 1));
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        l10Var2.showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                            return;
                        }
                        return;
                    case 2:
                        l10.U(this.f37001b);
                        return;
                    case 3:
                        this.f37001b.u0(true);
                        return;
                    case 4:
                        l10 l10Var3 = this.f37001b;
                        l10Var3.e = true;
                        l10Var3.w0();
                        return;
                    default:
                        this.f37001b.u0(false);
                        return;
                }
            }
        };
        ?? aVar = new pg.a(11, false);
        aVar.d = string2;
        aVar.e = str;
        aVar.f34664c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new pg.a(2, false));
        arrayList2.add(c10.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? aVar2 = new pg.a(0, false);
        aVar2.d = string3;
        arrayList2.add(aVar2);
        c10 b10 = c10.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f34664c = new View.OnClickListener(this) {
            public final l10 f37001b;

            {
                this.f37001b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l10 l10Var = this.f37001b;
                        l10Var.f37807f = true;
                        l10Var.w0();
                        return;
                    case 1:
                        l10 l10Var2 = this.f37001b;
                        MessagesController.DialogFilter dialogFilter = l10Var2.f37809r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.o10.U(l10Var2, dialogFilter.f16708id, new k00(l10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l10Var2.getParentActivity());
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(l10Var2, 1));
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        l10Var2.showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                            return;
                        }
                        return;
                    case 2:
                        l10.U(this.f37001b);
                        return;
                    case 3:
                        this.f37001b.u0(true);
                        return;
                    case 4:
                        l10 l10Var3 = this.f37001b;
                        l10Var3.e = true;
                        l10Var3.w0();
                        return;
                    default:
                        this.f37001b.u0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.F.isEmpty()) {
            if (!this.e && this.F.size() >= 8) {
                size2 = Math.min(5, this.F.size());
            } else {
                size2 = this.F.size();
            }
            for (int i11 = 0; i11 < size2; i11++) {
                long longValue = ((Long) this.F.get(i11)).longValue();
                ?? aVar3 = new pg.a(1, false);
                aVar3.f34666g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
            }
            if (size2 != this.F.size()) {
                c10 b11 = c10.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                b11.f34664c = new View.OnClickListener(this) {
                    public final l10 f37001b;

                    {
                        this.f37001b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                l10 l10Var = this.f37001b;
                                l10Var.f37807f = true;
                                l10Var.w0();
                                return;
                            case 1:
                                l10 l10Var2 = this.f37001b;
                                MessagesController.DialogFilter dialogFilter = l10Var2.f37809r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.o10.U(l10Var2, dialogFilter.f16708id, new k00(l10Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l10Var2.getParentActivity());
                                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(l10Var2, 1));
                                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                l10Var2.showDialog(a2Var);
                                TextView textView = (TextView) a2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                    return;
                                }
                                return;
                            case 2:
                                l10.U(this.f37001b);
                                return;
                            case 3:
                                this.f37001b.u0(true);
                                return;
                            case 4:
                                l10 l10Var3 = this.f37001b;
                                l10Var3.e = true;
                                l10Var3.w0();
                                return;
                            default:
                                this.f37001b.u0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(c10.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f37809r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? aVar4 = new pg.a(0, false);
            aVar4.d = string4;
            arrayList2.add(aVar4);
            c10 b12 = c10.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f34664c = new View.OnClickListener(this) {
                public final l10 f37001b;

                {
                    this.f37001b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l10 l10Var = this.f37001b;
                            l10Var.f37807f = true;
                            l10Var.w0();
                            return;
                        case 1:
                            l10 l10Var2 = this.f37001b;
                            MessagesController.DialogFilter dialogFilter2 = l10Var2.f37809r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.o10.U(l10Var2, dialogFilter2.f16708id, new k00(l10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l10Var2.getParentActivity());
                            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(l10Var2, 1));
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                            l10Var2.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                return;
                            }
                            return;
                        case 2:
                            l10.U(this.f37001b);
                            return;
                        case 3:
                            this.f37001b.u0(true);
                            return;
                        case 4:
                            l10 l10Var3 = this.f37001b;
                            l10Var3.e = true;
                            l10Var3.w0();
                            return;
                        default:
                            this.f37001b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f37813y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(c10.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f37807f && this.G.size() >= 8) {
                    size = Math.min(5, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i12 = 0; i12 < size; i12++) {
                    long longValue2 = ((Long) this.G.get(i12)).longValue();
                    ?? aVar5 = new pg.a(1, false);
                    aVar5.f34666g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.G.size()) {
                    c10 b13 = c10.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    b13.f34664c = new View.OnClickListener(this) {
                        public final l10 f37001b;

                        {
                            this.f37001b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    l10 l10Var = this.f37001b;
                                    l10Var.f37807f = true;
                                    l10Var.w0();
                                    return;
                                case 1:
                                    l10 l10Var2 = this.f37001b;
                                    MessagesController.DialogFilter dialogFilter2 = l10Var2.f37809r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.o10.U(l10Var2, dialogFilter2.f16708id, new k00(l10Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l10Var2.getParentActivity());
                                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(l10Var2, 1));
                                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                                    l10Var2.showDialog(a2Var);
                                    TextView textView = (TextView) a2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                        return;
                                    }
                                    return;
                                case 2:
                                    l10.U(this.f37001b);
                                    return;
                                case 3:
                                    this.f37001b.u0(true);
                                    return;
                                case 4:
                                    l10 l10Var3 = this.f37001b;
                                    l10Var3.e = true;
                                    l10Var3.w0();
                                    return;
                                default:
                                    this.f37001b.u0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(c10.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new pg.a(9, false));
            arrayList2.add(new pg.a(10, false));
            arrayList2.add(c10.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? aVar6 = new pg.a(0, false);
            aVar6.d = string5;
            aVar6.f34665f = true;
            arrayList2.add(aVar6);
            arrayList2.add(c10.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(c10.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? aVar7 = new pg.a(0, false);
            aVar7.d = string6;
            aVar7.f34665f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new pg.a(8, false));
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ?? aVar8 = new pg.a(7, false);
                aVar8.f34671m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i13);
                arrayList2.add(aVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(c10.d(string));
        }
        if (!this.f37810s) {
            c10 b14 = c10.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f34664c = new View.OnClickListener(this) {
                public final l10 f37001b;

                {
                    this.f37001b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            l10 l10Var = this.f37001b;
                            l10Var.f37807f = true;
                            l10Var.w0();
                            return;
                        case 1:
                            l10 l10Var2 = this.f37001b;
                            MessagesController.DialogFilter dialogFilter2 = l10Var2.f37809r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.o10.U(l10Var2, dialogFilter2.f16708id, new k00(l10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l10Var2.getParentActivity());
                            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j00(l10Var2, 1));
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                            l10Var2.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                                return;
                            }
                            return;
                        case 2:
                            l10.U(this.f37001b);
                            return;
                        case 3:
                            this.f37001b.u0(true);
                            return;
                        case 4:
                            l10 l10Var3 = this.f37001b;
                            l10Var3.e = true;
                            l10Var3.w0();
                            return;
                        default:
                            this.f37001b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(c10.d(null));
        }
        i10 i10Var = this.f37805b;
        if (i10Var != null) {
            i10Var.E(arrayList, arrayList2);
        }
    }
}
