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
public final class b10 extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public ArrayList C;
    public ArrayList D;
    public final LongSparseIntArray E;
    public p00 F;
    public q00 G;
    public v00 H;
    public final ArrayList I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final ArrayList M;
    public float N;
    public ej O;
    public boolean P;
    public mh.n6 Q;
    public mh.d1 f35304a;
    public y00 f35305b;
    public org.telegram.ui.ActionBar.w0 f35306c;
    public int d;
    public boolean f35307e;
    public boolean f35308f;
    public boolean h;
    public boolean f35309n;
    public final MessagesController.DialogFilter f35310r;
    public boolean f35311s;
    public boolean v;
    public CharSequence f35312w;
    public boolean f35313x;
    public int f35314y;

    public b10(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f35313x = true;
        this.I = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = -5.0f;
        this.f35310r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f35310r = dialogFilter2;
            dialogFilter2.f18057id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f35310r.f18057id) != null) {
                this.f35310r.f18057id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f35310r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f35311s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35310r.name);
        this.f35312w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f35312w = replaceEmoji;
        this.f35312w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f35310r.entities, textPaint.getFontMetricsInt());
        boolean z4 = !this.f35310r.title_noanimate;
        this.f35313x = z4;
        org.telegram.ui.Components.l5.s(this.currentAccount, z4);
        MessagesController.DialogFilter dialogFilter4 = this.f35310r;
        this.f35314y = dialogFilter4.flags;
        this.B = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f35310r.alwaysShow);
        this.C = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.D = new ArrayList(this.f35310r.neverShow);
        this.E = this.f35310r.pinnedDialogs.clone();
    }

    public static void U(b10 b10Var) {
        int i10;
        String str;
        int i11;
        b10Var.f35313x = !b10Var.f35313x;
        q00 q00Var = b10Var.G;
        if (q00Var != null) {
            org.telegram.ui.Cells.t3 t3Var = q00Var.f40286r;
            if (k0(b10Var.f35312w)) {
                if (b10Var.f35313x) {
                    i11 = R.string.FilterNameAnimationsDisable;
                } else {
                    i11 = R.string.FilterNameAnimationsEnable;
                }
                str = LocaleController.getString(i11);
            } else {
                str = null;
            }
            t3Var.setText(str);
        }
        org.telegram.ui.Components.l5.s(b10Var.currentAccount, b10Var.f35313x);
        b10Var.i0(true);
        org.telegram.ui.ActionBar.k kVar = b10Var.actionBar;
        if (kVar != null) {
            int i12 = 26;
            if (kVar.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.l5 titleTextView = b10Var.actionBar.getTitleTextView();
                if (b10Var.f35313x) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (b10Var.actionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.l5 titleTextView2 = b10Var.actionBar.getTitleTextView2();
                if (b10Var.f35313x) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void V(b10 b10Var) {
        MessagesController.DialogFilter dialogFilter = b10Var.f35310r;
        if (b10Var.v) {
            b10Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = b10Var.actionBar.getTitleFontMetricsInt();
            b10Var.actionBar.I(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
            return;
        }
        b10Var.finishFragment();
    }

    public static void W(b10 b10Var) {
        int i10;
        MessagesController messagesController = b10Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = b10Var.f35310r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dialogFilter.alwaysShow.size(); i11++) {
            long longValue = dialogFilter.alwaysShow.get(i11).longValue();
            if (longValue < 0 && g0(b10Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(b10Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (b10Var.getUserConfig().isPremium()) {
            i10 = b10Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i10 = b10Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i10) {
            b10Var.showDialog(new fg.v0(4, b10Var.currentAccount, b10Var.getParentActivity(), b10Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f18057id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            b10Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new f00(b10Var, 1));
        } else {
            zz zzVar = new zz(dialogFilter, null);
            zzVar.f44058y = new c00(b10Var, 1);
            zzVar.f44057x = new c00(b10Var, 2);
            b10Var.presentFragment(zzVar);
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
            org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.u5.class);
            if (u5VarArr != null && u5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z4, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z10, boolean z11, boolean z12, boolean z13, org.telegram.ui.ActionBar.p2 p2Var, Runnable runnable) {
        if (dialogFilter.flags != i10 || z12) {
            dialogFilter.pendingUnreadCount = -1;
            if (z13) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i10;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i11;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z4;
        if (z10) {
            p2Var.getMessagesController().addFilter(dialogFilter, z11);
        } else {
            p2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        p2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z11, true);
        if (z11) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = p2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = yh.d(dialogFilters.get(i12).f18057id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            p2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.Components.qc qcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new fg.v0(4, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.y3.s(R.string.FolderLinkNoChatsError, qcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.y3.s(R.string.FolderLinkOtherAdminLimitError, qcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new fg.v0(5, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new fg.v0(12, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new fg.v0(13, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.y3.s(R.string.NoFolderFound, qcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new fg.v0(4, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new fg.v0(3, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else {
                org.telegram.messenger.y3.s(R.string.UnknownError, qcVar, null);
            }
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z4, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final org.telegram.ui.ActionBar.p2 p2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.d2 d2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z14) {
            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(p2Var.getParentActivity(), 3, null);
            d2Var2.f21243d0 = false;
            d2Var2.show();
            d2Var = d2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f20968id = dialogFilter.f18057id;
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
        tL_dialogFilter.f20850id = dialogFilter.f18057id;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z4;
        if (i11 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i11;
        }
        MessagesController messagesController = p2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new ut(longSparseIntArray, 1));
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
                org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                int i17 = size2;
                long longValue = l10.longValue();
                if ((i16 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !DialogObject.isEncryptedDialog(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User user = messagesController.getUser(l10);
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
                d2Var = d2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        p2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z15 = z14;
                final org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                final MessagesController.DialogFilter dialogFilter2 = dialogFilter;
                final int i18 = i10;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z16 = z4;
                final int i19 = i11;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z17 = z10;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z21 = z15;
                        Runnable runnable3 = runnable2;
                        if (z21) {
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var4;
                            if (d2Var5 != null) {
                                try {
                                    d2Var5.dismiss();
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                }
                            }
                            b10.p0(dialogFilter2, i18, str2, arrayList7, z16, i19, arrayList8, arrayList9, z17, z18, z19, z20, p2Var2, runnable3);
                        } else if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
            }
        });
        if (z14) {
            return;
        }
        p0(dialogFilter, i10, str, arrayList, z4, i11, arrayList2, arrayList3, z10, z11, z12, z13, p2Var, null);
    }

    public static CharSequence x0(int i10, CharSequence charSequence, boolean z4) {
        Context context;
        if (i10 >= 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("n_" + i10, false) && (context = ApplicationLoader.applicationContext) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z4) {
                    Drawable mutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                    mutate.setBounds(0, -AndroidUtilities.dp(8.0f), mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                    spannableString.setSpan(new ImageSpan(mutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable mutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false), mode));
                    org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(mutate2, mutate3);
                    pqVar.setBounds(0, 0, pqVar.getIntrinsicWidth(), pqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(pqVar, 0), 0, spannableString.length(), 33);
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
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        boolean z4 = this.f35311s;
        MessagesController.DialogFilter dialogFilter = this.f35310r;
        if (z4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                int i11 = 26;
                if (kVar.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
                    if (this.f35313x) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView.setEmojiCacheType(i10);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.l5 titleTextView2 = this.actionBar.getTitleTextView2();
                    if (this.f35313x) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 10));
        this.f35306c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        org.telegram.ui.Components.z51 z51Var = new org.telegram.ui.Components.z51(context, null, 3);
        this.fragmentView = z51Var;
        z51Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        mh.d1 d1Var = new mh.d1(this, context, 25);
        this.f35304a = d1Var;
        d1Var.o1();
        this.actionBar.setAdaptiveBackground(this.f35304a);
        this.f35304a.setLayoutManager(new f2.j0(1, false));
        this.f35304a.setVerticalScrollBarEnabled(false);
        z51Var.addView(this.f35304a, k7.c6.c(-1.0f, -1));
        mh.d1 d1Var2 = this.f35304a;
        y00 y00Var = new y00(this, context);
        this.f35305b = y00Var;
        d1Var2.setAdapter(y00Var);
        this.f35304a.setOnItemClickListener(new j(this, 9));
        this.f35304a.setOnItemLongClickListener(new b00(this, 0));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.n(350L);
        this.f35304a.setItemAnimator(lVar);
        this.f35304a.setOnScrollListener(new l3(this, 10));
        i0(false);
        if (!this.K && dialogFilter != null && dialogFilter.isChatlist()) {
            this.K = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f18057id;
            this.J = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new f00(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.o8.class, org.telegram.ui.Cells.va.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21878p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21896q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 262144, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21974uh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21823m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f22038y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21841n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35304a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        return arrayList;
    }

    public final boolean h0(boolean z4) {
        if (this.f35306c.getAlpha() == 1.0f) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f35311s) {
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new b00(this, 2));
                } else {
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new b00(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new b00(this, 4));
                showDialog(alertDialog$Builder.f21168a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void i0(boolean z4) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z11 = true;
        if (!TextUtils.isEmpty(this.f35312w) && this.f35312w.length() <= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.C.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && !this.f35311s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f35310r;
                if (dialogFilter.alwaysShow.size() != this.C.size()) {
                    this.h = true;
                }
                if (dialogFilter.neverShow.size() != this.D.size()) {
                    this.h = true;
                }
                if (dialogFilter.color != this.B) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(dialogFilter.alwaysShow);
                    Collections.sort(this.C);
                    if (!dialogFilter.alwaysShow.equals(this.C)) {
                        this.h = true;
                    }
                    Collections.sort(dialogFilter.neverShow);
                    Collections.sort(this.D);
                    if (!dialogFilter.neverShow.equals(this.D)) {
                        this.h = true;
                    }
                }
                if (dialogFilter.title_noanimate == (!this.f35313x) && TextUtils.equals(dialogFilter.name, this.f35312w) && dialogFilter.flags == this.f35314y) {
                    z11 = this.h;
                }
                z10 = z11;
            }
        }
        if (this.f35306c.isEnabled() == z10) {
            return;
        }
        this.f35306c.setEnabled(z10);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f35306c.animate();
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (z10) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f35306c;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f35306c;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f35306c;
        if (z10) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String string;
        if (this.f35311s) {
            if (TextUtils.isEmpty(this.f35312w) || !this.f35309n) {
                int i10 = this.f35314y;
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
                this.f35312w = str;
                p00 p00Var = this.F;
                if (p00Var != null) {
                    p00Var.e(org.telegram.ui.Components.u5.cloneSpans(str, -1, p00Var.f39845s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                f2.m1 K = this.f35304a.K(this.d);
                if (K != null) {
                    this.f35305b.y(K);
                }
            }
        }
    }

    public final void l0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i10 = 0;
            while (true) {
                arrayList = this.I;
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
                    this.f35310r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
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
            arrayList = this.I;
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

    public final void n0(int i10, boolean z4) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.P && (dialogFilter = this.f35310r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.P = true;
            this.Q = new mh.n6(this, z4, i10, 3);
            if (getLayoutContainer() != null) {
                this.Q.run();
                this.Q = null;
            }
        }
    }

    public final void o0(ArrayList arrayList, ArrayList arrayList2, boolean z4) {
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
        if (z4) {
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
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Cells.d3 d3Var;
        v00 v00Var = this.H;
        if (v00Var != null && (d3Var = v00Var.f22795b) != null && d3Var.f27000e) {
            if (z4) {
                d3Var.k(true);
                return false;
            }
            return false;
        }
        return h0(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        w0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.J != 0) {
            getConnectionsManager().cancelRequest(this.J, true);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35304a.setPadding(0, 0, 0, i13);
        this.f35304a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w0();
        mh.n6 n6Var = this.Q;
        if (n6Var != null) {
            n6Var.run();
        }
    }

    public final void q0() {
        ej ejVar = this.O;
        if (ejVar != null) {
            ejVar.b(true);
            this.O = null;
        }
        s0(new d00(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z4) {
        CharSequence[] charSequenceArr = {this.f35312w};
        t0(this.f35310r, this.f35314y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f35313x, this.B, this.C, this.D, this.E, this.f35311s, false, this.h, true, z4, this, new org.telegram.ui.Components.q51(25, this, runnable));
    }

    public final void u0(boolean z4) {
        ArrayList arrayList;
        if (z4) {
            arrayList = this.C;
        } else {
            arrayList = this.D;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f35314y, arrayList, z4);
        usersSelectActivity.C = this.f35310r.isChatlist();
        usersSelectActivity.f34935n = new jh.q(7, this, z4);
        presentFragment(usersSelectActivity);
    }

    public final void v0(s00 s00Var, CharSequence charSequence, Object obj, boolean z4) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        if (z4) {
            d2Var.O = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            d2Var.O = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                d2Var.Q = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new com.google.firebase.messaging.i(this, s00Var, z4, 7));
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
        }
    }

    public final void w0() {
        String str;
        String string;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.L;
        arrayList.clear();
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string2 = LocaleController.getString(R.string.FilterNameHeader);
        if (k0(this.f35312w)) {
            if (this.f35313x) {
                i10 = R.string.FilterNameAnimationsDisable;
            } else {
                i10 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i10);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final b10 f34970b;

            {
                this.f34970b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b10 b10Var = this.f34970b;
                        b10Var.f35308f = true;
                        b10Var.w0();
                        return;
                    case 1:
                        b10 b10Var2 = this.f34970b;
                        MessagesController.DialogFilter dialogFilter = b10Var2.f35310r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.d10.T(b10Var2, dialogFilter.f18057id, new c00(b10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b10Var2.getParentActivity());
                        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(b10Var2, 1));
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        b10Var2.showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                            return;
                        }
                        return;
                    case 2:
                        b10.U(this.f34970b);
                        return;
                    case 3:
                        this.f34970b.u0(true);
                        return;
                    case 4:
                        b10 b10Var3 = this.f34970b;
                        b10Var3.f35307e = true;
                        b10Var3.w0();
                        return;
                    default:
                        this.f34970b.u0(false);
                        return;
                }
            }
        };
        ?? bVar = new cg.b(11, false);
        bVar.d = string2;
        bVar.f40973e = str;
        bVar.f40972c = onClickListener;
        arrayList2.add(bVar);
        this.d = arrayList2.size();
        arrayList2.add(new cg.b(2, false));
        arrayList2.add(s00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? bVar2 = new cg.b(0, false);
        bVar2.d = string3;
        arrayList2.add(bVar2);
        s00 b10 = s00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f40972c = new View.OnClickListener(this) {
            public final b10 f34970b;

            {
                this.f34970b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b10 b10Var = this.f34970b;
                        b10Var.f35308f = true;
                        b10Var.w0();
                        return;
                    case 1:
                        b10 b10Var2 = this.f34970b;
                        MessagesController.DialogFilter dialogFilter = b10Var2.f35310r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.d10.T(b10Var2, dialogFilter.f18057id, new c00(b10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b10Var2.getParentActivity());
                        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(b10Var2, 1));
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        b10Var2.showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                            return;
                        }
                        return;
                    case 2:
                        b10.U(this.f34970b);
                        return;
                    case 3:
                        this.f34970b.u0(true);
                        return;
                    case 4:
                        b10 b10Var3 = this.f34970b;
                        b10Var3.f35307e = true;
                        b10Var3.w0();
                        return;
                    default:
                        this.f34970b.u0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.C.isEmpty()) {
            if (!this.f35307e && this.C.size() >= 8) {
                size2 = Math.min(5, this.C.size());
            } else {
                size2 = this.C.size();
            }
            for (int i11 = 0; i11 < size2; i11++) {
                long longValue = ((Long) this.C.get(i11)).longValue();
                ?? bVar3 = new cg.b(1, false);
                bVar3.f40975g = true;
                bVar3.h = longValue;
                arrayList2.add(bVar3);
            }
            if (size2 != this.C.size()) {
                s00 b11 = s00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.C.size() - 5, new Object[0]), false);
                b11.f40972c = new View.OnClickListener(this) {
                    public final b10 f34970b;

                    {
                        this.f34970b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                b10 b10Var = this.f34970b;
                                b10Var.f35308f = true;
                                b10Var.w0();
                                return;
                            case 1:
                                b10 b10Var2 = this.f34970b;
                                MessagesController.DialogFilter dialogFilter = b10Var2.f35310r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(b10Var2, dialogFilter.f18057id, new c00(b10Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b10Var2.getParentActivity());
                                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(b10Var2, 1));
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                b10Var2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                                    return;
                                }
                                return;
                            case 2:
                                b10.U(this.f34970b);
                                return;
                            case 3:
                                this.f34970b.u0(true);
                                return;
                            case 4:
                                b10 b10Var3 = this.f34970b;
                                b10Var3.f35307e = true;
                                b10Var3.w0();
                                return;
                            default:
                                this.f34970b.u0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(s00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f35310r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? bVar4 = new cg.b(0, false);
            bVar4.d = string4;
            arrayList2.add(bVar4);
            s00 b12 = s00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f40972c = new View.OnClickListener(this) {
                public final b10 f34970b;

                {
                    this.f34970b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            b10 b10Var = this.f34970b;
                            b10Var.f35308f = true;
                            b10Var.w0();
                            return;
                        case 1:
                            b10 b10Var2 = this.f34970b;
                            MessagesController.DialogFilter dialogFilter2 = b10Var2.f35310r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.d10.T(b10Var2, dialogFilter2.f18057id, new c00(b10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b10Var2.getParentActivity());
                            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(b10Var2, 1));
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                            b10Var2.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                                return;
                            }
                            return;
                        case 2:
                            b10.U(this.f34970b);
                            return;
                        case 3:
                            this.f34970b.u0(true);
                            return;
                        case 4:
                            b10 b10Var3 = this.f34970b;
                            b10Var3.f35307e = true;
                            b10Var3.w0();
                            return;
                        default:
                            this.f34970b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f35314y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(s00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.D.isEmpty()) {
                if (!this.f35308f && this.D.size() >= 8) {
                    size = Math.min(5, this.D.size());
                } else {
                    size = this.D.size();
                }
                for (int i12 = 0; i12 < size; i12++) {
                    long longValue2 = ((Long) this.D.get(i12)).longValue();
                    ?? bVar5 = new cg.b(1, false);
                    bVar5.f40975g = false;
                    bVar5.h = longValue2;
                    arrayList2.add(bVar5);
                }
                if (size != this.D.size()) {
                    s00 b13 = s00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.D.size() - 5, new Object[0]), false);
                    b13.f40972c = new View.OnClickListener(this) {
                        public final b10 f34970b;

                        {
                            this.f34970b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    b10 b10Var = this.f34970b;
                                    b10Var.f35308f = true;
                                    b10Var.w0();
                                    return;
                                case 1:
                                    b10 b10Var2 = this.f34970b;
                                    MessagesController.DialogFilter dialogFilter2 = b10Var2.f35310r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.d10.T(b10Var2, dialogFilter2.f18057id, new c00(b10Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b10Var2.getParentActivity());
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(b10Var2, 1));
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                                    b10Var2.showDialog(d2Var);
                                    TextView textView = (TextView) d2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                                        return;
                                    }
                                    return;
                                case 2:
                                    b10.U(this.f34970b);
                                    return;
                                case 3:
                                    this.f34970b.u0(true);
                                    return;
                                case 4:
                                    b10 b10Var3 = this.f34970b;
                                    b10Var3.f35307e = true;
                                    b10Var3.w0();
                                    return;
                                default:
                                    this.f34970b.u0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(s00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new cg.b(9, false));
            arrayList2.add(new cg.b(10, false));
            arrayList2.add(s00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.I;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? bVar6 = new cg.b(0, false);
            bVar6.d = string5;
            bVar6.f40974f = true;
            arrayList2.add(bVar6);
            arrayList2.add(s00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(s00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? bVar7 = new cg.b(0, false);
            bVar7.d = string6;
            bVar7.f40974f = true;
            arrayList2.add(bVar7);
            arrayList2.add(new cg.b(8, false));
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ?? bVar8 = new cg.b(7, false);
                bVar8.f40980m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i13);
                arrayList2.add(bVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(s00.d(string));
        }
        if (!this.f35311s) {
            s00 b14 = s00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f40972c = new View.OnClickListener(this) {
                public final b10 f34970b;

                {
                    this.f34970b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            b10 b10Var = this.f34970b;
                            b10Var.f35308f = true;
                            b10Var.w0();
                            return;
                        case 1:
                            b10 b10Var2 = this.f34970b;
                            MessagesController.DialogFilter dialogFilter2 = b10Var2.f35310r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.d10.T(b10Var2, dialogFilter2.f18057id, new c00(b10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b10Var2.getParentActivity());
                            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(b10Var2, 1));
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                            b10Var2.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                                return;
                            }
                            return;
                        case 2:
                            b10.U(this.f34970b);
                            return;
                        case 3:
                            this.f34970b.u0(true);
                            return;
                        case 4:
                            b10 b10Var3 = this.f34970b;
                            b10Var3.f35307e = true;
                            b10Var3.w0();
                            return;
                        default:
                            this.f34970b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(s00.d(null));
        }
        y00 y00Var = this.f35305b;
        if (y00Var != null) {
            y00Var.E(arrayList, arrayList2);
        }
    }
}
