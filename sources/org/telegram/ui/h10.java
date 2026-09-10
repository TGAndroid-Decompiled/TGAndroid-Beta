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
public final class h10 extends org.telegram.ui.ActionBar.p2 {
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public v00 I;
    public w00 J;
    public b10 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public kj R;
    public boolean S;
    public i2.f0 T;
    public bi.y1 f33232a;
    public e10 f33233b;
    public org.telegram.ui.ActionBar.w0 f33234c;
    public int d;
    public boolean e;
    public boolean f33235f;
    public boolean h;
    public boolean f33236n;
    public final MessagesController.DialogFilter f33237r;
    public boolean f33238s;
    public boolean v;
    public CharSequence f33239w;
    public boolean f33240x;
    public int f33241y;

    public h10(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f33240x = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f33237r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f33237r = dialogFilter2;
            dialogFilter2.f14645id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f33237r.f14645id) != null) {
                this.f33237r.f14645id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f33237r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f33238s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f33237r.name);
        this.f33239w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f33239w = replaceEmoji;
        this.f33239w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f33237r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f33237r.title_noanimate;
        this.f33240x = z10;
        org.telegram.ui.Components.p5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f33237r;
        this.f33241y = dialogFilter4.flags;
        this.E = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f33237r.alwaysShow);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f33237r.neverShow);
        this.H = this.f33237r.pinnedDialogs.clone();
    }

    public static void U(h10 h10Var) {
        int i10;
        String str;
        int i11;
        h10Var.f33240x = !h10Var.f33240x;
        w00 w00Var = h10Var.J;
        if (w00Var != null) {
            org.telegram.ui.Cells.t3 t3Var = w00Var.f37663r;
            if (k0(h10Var.f33239w)) {
                if (h10Var.f33240x) {
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
        org.telegram.ui.Components.p5.s(h10Var.currentAccount, h10Var.f33240x);
        h10Var.i0(true);
        org.telegram.ui.ActionBar.l lVar = h10Var.actionBar;
        if (lVar != null) {
            int i12 = 26;
            if (lVar.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.l5 titleTextView = h10Var.actionBar.getTitleTextView();
                if (h10Var.f33240x) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (h10Var.actionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.l5 titleTextView2 = h10Var.actionBar.getTitleTextView2();
                if (h10Var.f33240x) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void V(h10 h10Var) {
        MessagesController.DialogFilter dialogFilter = h10Var.f33237r;
        if (h10Var.v) {
            h10Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = h10Var.actionBar.getTitleFontMetricsInt();
            h10Var.actionBar.J(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
            return;
        }
        h10Var.finishFragment();
    }

    public static void W(h10 h10Var) {
        int i10;
        MessagesController messagesController = h10Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = h10Var.f33237r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dialogFilter.alwaysShow.size(); i11++) {
            long longValue = dialogFilter.alwaysShow.get(i11).longValue();
            if (longValue < 0 && g0(h10Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(h10Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (h10Var.getUserConfig().isPremium()) {
            i10 = h10Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i10 = h10Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i10) {
            h10Var.showDialog(new qg.k0(4, h10Var.currentAccount, h10Var.getParentActivity(), h10Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f14645id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            h10Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new k00(h10Var, 1));
        } else {
            e00 e00Var = new e00(dialogFilter, null);
            e00Var.f32011y = new h00(h10Var, 1);
            e00Var.f32010x = new h00(h10Var, 2);
            h10Var.presentFragment(e00Var);
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
            org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.y5.class);
            if (y5VarArr != null && y5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.p2 p2Var, Runnable runnable) {
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
            p2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            p2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        p2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = p2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = com.google.android.gms.internal.vision.e2.d(dialogFilters.get(i12).f14645id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            p2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.Components.wc wcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new qg.k0(4, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.a2.p(R.string.FolderLinkNoChatsError, wcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.a2.p(R.string.FolderLinkOtherAdminLimitError, wcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new qg.k0(5, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new qg.k0(12, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new qg.k0(13, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.a2.p(R.string.NoFolderFound, wcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new qg.k0(4, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new qg.k0(3, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, null).show();
            } else {
                org.telegram.messenger.a2.p(R.string.UnknownError, wcVar, null);
            }
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.p2 p2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.d2 d2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(p2Var.getParentActivity(), 3, null);
            d2Var2.f17621g0 = false;
            d2Var2.show();
            d2Var = d2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f17318id = dialogFilter.f14645id;
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
        tL_dialogFilter.f17200id = dialogFilter.f14645id;
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
            Collections.sort(arrayList6, new xt(longSparseIntArray, 1));
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
                org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
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
                        long j3 = -longValue;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                        if (chat != null) {
                            if (ChatObject.isChannel(chat)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j3;
                                tL_inputPeerChannel.access_hash = chat.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j3;
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
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
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
                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var4;
                            if (d2Var5 != null) {
                                try {
                                    d2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            h10.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, p2Var2, runnable3);
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
        p0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, p2Var, null);
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
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), mode));
                    org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(mutate2, mutate3);
                    vqVar.setBounds(0, 0, vqVar.getIntrinsicWidth(), vqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(vqVar, 0), 0, spannableString.length(), 33);
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
        boolean z10 = this.f33238s;
        MessagesController.DialogFilter dialogFilter = this.f33237r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                int i11 = 26;
                if (lVar.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
                    if (this.f33240x) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView.setEmojiCacheType(i10);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.l5 titleTextView2 = this.actionBar.getTitleTextView2();
                    if (this.f33240x) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 23));
        this.f33234c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        gg.z1 z1Var = new gg.z1(context, null, 4);
        this.fragmentView = z1Var;
        z1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        bi.y1 y1Var = new bi.y1(this, context, 26);
        this.f33232a = y1Var;
        y1Var.o1();
        this.actionBar.setAdaptiveBackground(this.f33232a);
        this.f33232a.setLayoutManager(new s4.c0(1, false));
        this.f33232a.setVerticalScrollBarEnabled(false);
        z1Var.addView(this.f33232a, w7.a6.c(-1.0f, -1));
        bi.y1 y1Var2 = this.f33232a;
        e10 e10Var = new e10(this, context);
        this.f33233b = e10Var;
        y1Var2.setAdapter(e10Var);
        this.f33232a.setOnItemClickListener(new i(this, 9));
        this.f33232a.setOnItemLongClickListener(new g00(this, 0));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.n(350L);
        this.f33232a.setItemAnimator(jVar);
        this.f33232a.setOnScrollListener(new j3(this, 10));
        i0(false);
        if (!this.N && dialogFilter != null && dialogFilter.isChatlist()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f14645id;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new k00(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.bb.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18144p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 4, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18247uh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33232a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        if (this.f33234c.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f33238s) {
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new g00(this, 2));
                } else {
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new g00(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new g00(this, 4));
                showDialog(alertDialog$Builder.f17528a);
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
        if (!TextUtils.isEmpty(this.f33239w) && this.f33239w.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.F.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f33238s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f33237r;
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
                if (dialogFilter.title_noanimate == (!this.f33240x) && TextUtils.equals(dialogFilter.name, this.f33239w) && dialogFilter.flags == this.f33241y) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        if (this.f33234c.isEnabled() == z11) {
            return;
        }
        this.f33234c.setEnabled(z11);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f33234c.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f33234c;
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f33234c;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f33234c;
        if (z11) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String string;
        if (this.f33238s) {
            if (TextUtils.isEmpty(this.f33239w) || !this.f33236n) {
                int i10 = this.f33241y;
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
                this.f33239w = str;
                v00 v00Var = this.I;
                if (v00Var != null) {
                    v00Var.e(org.telegram.ui.Components.y5.cloneSpans(str, -1, v00Var.f37371s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.c1 K = this.f33232a.K(this.d);
                if (K != null) {
                    this.f33233b.y(K);
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
                    this.f33237r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
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
        if (!this.S && (dialogFilter = this.f33237r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.S = true;
            this.T = new i2.f0(this, z10, i10, 3);
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
        org.telegram.ui.Cells.d3 d3Var;
        b10 b10Var = this.K;
        if (b10Var != null && (d3Var = b10Var.f19109b) != null && d3Var.e) {
            if (z10) {
                d3Var.k(true);
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
        this.f33232a.setPadding(0, 0, 0, i13);
        this.f33232a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w0();
        i2.f0 f0Var = this.T;
        if (f0Var != null) {
            f0Var.run();
        }
    }

    public final void q0() {
        kj kjVar = this.R;
        if (kjVar != null) {
            kjVar.b(true);
            this.R = null;
        }
        s0(new i00(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f33239w};
        t0(this.f33237r, this.f33241y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f33240x, this.E, this.F, this.G, this.H, this.f33238s, false, this.h, true, z10, this, new uv(12, this, runnable));
    }

    public final void u0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f33241y, arrayList, z10);
        usersSelectActivity.F = this.f33237r.isChatlist();
        usersSelectActivity.f30724n = new gg.d0(8, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(y00 y00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        if (z10) {
            d2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                d2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                d2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                d2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            d2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                d2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                d2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                d2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new com.google.firebase.messaging.i(this, y00Var, z10, 8));
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
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
        if (k0(this.f33239w)) {
            if (this.f33240x) {
                i10 = R.string.FilterNameAnimationsDisable;
            } else {
                i10 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i10);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h10 f32660b;

            {
                this.f32660b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h10 h10Var = this.f32660b;
                        h10Var.f33235f = true;
                        h10Var.w0();
                        return;
                    case 1:
                        h10 h10Var2 = this.f32660b;
                        MessagesController.DialogFilter dialogFilter = h10Var2.f33237r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.k10.T(h10Var2, dialogFilter.f14645id, new h00(h10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h10Var2.getParentActivity());
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g00(h10Var2, 1));
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        h10Var2.showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                            return;
                        }
                        return;
                    case 2:
                        h10.U(this.f32660b);
                        return;
                    case 3:
                        this.f32660b.u0(true);
                        return;
                    case 4:
                        h10 h10Var3 = this.f32660b;
                        h10Var3.e = true;
                        h10Var3.w0();
                        return;
                    default:
                        this.f32660b.u0(false);
                        return;
                }
            }
        };
        ?? aVar = new ng.a(11, false);
        aVar.d = string2;
        aVar.e = str;
        aVar.f38857c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new ng.a(2, false));
        arrayList2.add(y00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? aVar2 = new ng.a(0, false);
        aVar2.d = string3;
        arrayList2.add(aVar2);
        y00 b10 = y00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f38857c = new View.OnClickListener(this) {
            public final h10 f32660b;

            {
                this.f32660b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h10 h10Var = this.f32660b;
                        h10Var.f33235f = true;
                        h10Var.w0();
                        return;
                    case 1:
                        h10 h10Var2 = this.f32660b;
                        MessagesController.DialogFilter dialogFilter = h10Var2.f33237r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.k10.T(h10Var2, dialogFilter.f14645id, new h00(h10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h10Var2.getParentActivity());
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g00(h10Var2, 1));
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        h10Var2.showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                            return;
                        }
                        return;
                    case 2:
                        h10.U(this.f32660b);
                        return;
                    case 3:
                        this.f32660b.u0(true);
                        return;
                    case 4:
                        h10 h10Var3 = this.f32660b;
                        h10Var3.e = true;
                        h10Var3.w0();
                        return;
                    default:
                        this.f32660b.u0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.F.isEmpty()) {
            if (!this.e && this.F.size() >= 8) {
                size2 = Math.min(5, this.F.size());
            } else {
                size2 = this.F.size();
            }
            for (int i11 = 0; i11 < size2; i11++) {
                long longValue = ((Long) this.F.get(i11)).longValue();
                ?? aVar3 = new ng.a(1, false);
                aVar3.f38859g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
            }
            if (size2 != this.F.size()) {
                y00 b11 = y00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                b11.f38857c = new View.OnClickListener(this) {
                    public final h10 f32660b;

                    {
                        this.f32660b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h10 h10Var = this.f32660b;
                                h10Var.f33235f = true;
                                h10Var.w0();
                                return;
                            case 1:
                                h10 h10Var2 = this.f32660b;
                                MessagesController.DialogFilter dialogFilter = h10Var2.f33237r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.k10.T(h10Var2, dialogFilter.f14645id, new h00(h10Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h10Var2.getParentActivity());
                                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g00(h10Var2, 1));
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                h10Var2.showDialog(d2Var);
                                TextView textView = (TextView) d2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                                    return;
                                }
                                return;
                            case 2:
                                h10.U(this.f32660b);
                                return;
                            case 3:
                                this.f32660b.u0(true);
                                return;
                            case 4:
                                h10 h10Var3 = this.f32660b;
                                h10Var3.e = true;
                                h10Var3.w0();
                                return;
                            default:
                                this.f32660b.u0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(y00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f33237r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? aVar4 = new ng.a(0, false);
            aVar4.d = string4;
            arrayList2.add(aVar4);
            y00 b12 = y00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f38857c = new View.OnClickListener(this) {
                public final h10 f32660b;

                {
                    this.f32660b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            h10 h10Var = this.f32660b;
                            h10Var.f33235f = true;
                            h10Var.w0();
                            return;
                        case 1:
                            h10 h10Var2 = this.f32660b;
                            MessagesController.DialogFilter dialogFilter2 = h10Var2.f33237r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.k10.T(h10Var2, dialogFilter2.f14645id, new h00(h10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h10Var2.getParentActivity());
                            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g00(h10Var2, 1));
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            h10Var2.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                                return;
                            }
                            return;
                        case 2:
                            h10.U(this.f32660b);
                            return;
                        case 3:
                            this.f32660b.u0(true);
                            return;
                        case 4:
                            h10 h10Var3 = this.f32660b;
                            h10Var3.e = true;
                            h10Var3.w0();
                            return;
                        default:
                            this.f32660b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f33241y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(y00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f33235f && this.G.size() >= 8) {
                    size = Math.min(5, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i12 = 0; i12 < size; i12++) {
                    long longValue2 = ((Long) this.G.get(i12)).longValue();
                    ?? aVar5 = new ng.a(1, false);
                    aVar5.f38859g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.G.size()) {
                    y00 b13 = y00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    b13.f38857c = new View.OnClickListener(this) {
                        public final h10 f32660b;

                        {
                            this.f32660b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    h10 h10Var = this.f32660b;
                                    h10Var.f33235f = true;
                                    h10Var.w0();
                                    return;
                                case 1:
                                    h10 h10Var2 = this.f32660b;
                                    MessagesController.DialogFilter dialogFilter2 = h10Var2.f33237r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.k10.T(h10Var2, dialogFilter2.f14645id, new h00(h10Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h10Var2.getParentActivity());
                                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g00(h10Var2, 1));
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                                    h10Var2.showDialog(d2Var);
                                    TextView textView = (TextView) d2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                                        return;
                                    }
                                    return;
                                case 2:
                                    h10.U(this.f32660b);
                                    return;
                                case 3:
                                    this.f32660b.u0(true);
                                    return;
                                case 4:
                                    h10 h10Var3 = this.f32660b;
                                    h10Var3.e = true;
                                    h10Var3.w0();
                                    return;
                                default:
                                    this.f32660b.u0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(y00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new ng.a(9, false));
            arrayList2.add(new ng.a(10, false));
            arrayList2.add(y00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? aVar6 = new ng.a(0, false);
            aVar6.d = string5;
            aVar6.f38858f = true;
            arrayList2.add(aVar6);
            arrayList2.add(y00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(y00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? aVar7 = new ng.a(0, false);
            aVar7.d = string6;
            aVar7.f38858f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new ng.a(8, false));
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ?? aVar8 = new ng.a(7, false);
                aVar8.f38864m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i13);
                arrayList2.add(aVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(y00.d(string));
        }
        if (!this.f33238s) {
            y00 b14 = y00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f38857c = new View.OnClickListener(this) {
                public final h10 f32660b;

                {
                    this.f32660b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            h10 h10Var = this.f32660b;
                            h10Var.f33235f = true;
                            h10Var.w0();
                            return;
                        case 1:
                            h10 h10Var2 = this.f32660b;
                            MessagesController.DialogFilter dialogFilter2 = h10Var2.f33237r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.k10.T(h10Var2, dialogFilter2.f14645id, new h00(h10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h10Var2.getParentActivity());
                            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g00(h10Var2, 1));
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            h10Var2.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                                return;
                            }
                            return;
                        case 2:
                            h10.U(this.f32660b);
                            return;
                        case 3:
                            this.f32660b.u0(true);
                            return;
                        case 4:
                            h10 h10Var3 = this.f32660b;
                            h10Var3.e = true;
                            h10Var3.w0();
                            return;
                        default:
                            this.f32660b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(y00.d(null));
        }
        e10 e10Var = this.f33233b;
        if (e10Var != null) {
            e10Var.E(arrayList, arrayList2);
        }
    }
}
