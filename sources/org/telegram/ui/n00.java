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
public final class n00 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public ArrayList B;
    public ArrayList C;
    public final LongSparseIntArray D;
    public b00 E;
    public c00 F;
    public h00 G;
    public final ArrayList H;
    public int I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public float M;
    public wi N;
    public boolean O;
    public gh.q6 P;
    public gh.f1 f40564a;
    public k00 f40565b;
    public org.telegram.ui.ActionBar.w0 f40566c;
    public int d;
    public boolean f40567e;
    public boolean f40568f;
    public boolean h;
    public boolean f40569n;
    public final MessagesController.DialogFilter f40570r;
    public boolean f40571s;
    public boolean v;
    public CharSequence f40572w;
    public boolean f40573x;
    public int f40574y;

    public n00(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f40573x = true;
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = -5.0f;
        this.f40570r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f40570r = dialogFilter2;
            dialogFilter2.f19649id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f40570r.f19649id) != null) {
                this.f40570r.f19649id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f40570r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f40571s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40570r.name);
        this.f40572w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f40572w = replaceEmoji;
        this.f40572w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f40570r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f40570r.title_noanimate;
        this.f40573x = z10;
        org.telegram.ui.Components.k5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f40570r;
        this.f40574y = dialogFilter4.flags;
        this.A = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f40570r.alwaysShow);
        this.B = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.C = new ArrayList(this.f40570r.neverShow);
        this.D = this.f40570r.pinnedDialogs.clone();
    }

    public static void T(n00 n00Var) {
        int i9;
        String str;
        int i10;
        n00Var.f40573x = !n00Var.f40573x;
        c00 c00Var = n00Var.F;
        if (c00Var != null) {
            org.telegram.ui.Cells.u3 u3Var = c00Var.f37021r;
            if (j0(n00Var.f40572w)) {
                if (n00Var.f40573x) {
                    i10 = R.string.FilterNameAnimationsDisable;
                } else {
                    i10 = R.string.FilterNameAnimationsEnable;
                }
                str = LocaleController.getString(i10);
            } else {
                str = null;
            }
            u3Var.setText(str);
        }
        org.telegram.ui.Components.k5.s(n00Var.currentAccount, n00Var.f40573x);
        n00Var.h0(true);
        org.telegram.ui.ActionBar.k kVar = n00Var.actionBar;
        if (kVar != null) {
            int i11 = 26;
            if (kVar.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.h5 titleTextView = n00Var.actionBar.getTitleTextView();
                if (n00Var.f40573x) {
                    i9 = 0;
                } else {
                    i9 = 26;
                }
                titleTextView.setEmojiCacheType(i9);
            }
            if (n00Var.actionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.h5 titleTextView2 = n00Var.actionBar.getTitleTextView2();
                if (n00Var.f40573x) {
                    i11 = 0;
                }
                titleTextView2.setEmojiCacheType(i11);
            }
        }
    }

    public static void U(n00 n00Var) {
        MessagesController.DialogFilter dialogFilter = n00Var.f40570r;
        if (n00Var.v) {
            n00Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = n00Var.actionBar.getTitleFontMetricsInt();
            n00Var.actionBar.I(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
            return;
        }
        n00Var.finishFragment();
    }

    public static void V(n00 n00Var) {
        int i9;
        MessagesController messagesController = n00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = n00Var.f40570r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < dialogFilter.alwaysShow.size(); i10++) {
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && f0(n00Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(n00Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (n00Var.getUserConfig().isPremium()) {
            i9 = n00Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i9 = n00Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i9) {
            n00Var.showDialog(new zf.j0(4, n00Var.currentAccount, n00Var.getParentActivity(), n00Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19649id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            n00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new rz(n00Var, 1));
        } else {
            lz lzVar = new lz(dialogFilter, null);
            lzVar.f40263y = new oz(n00Var, 1);
            lzVar.f40262x = new oz(n00Var, 2);
            n00Var.presentFragment(lzVar);
        }
    }

    public static boolean f0(TLRPC.Chat chat) {
        if (!ChatObject.canUserDoAdminAction(chat, 3)) {
            if (!ChatObject.isPublic(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean j0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.t5.class);
            if (t5VarArr != null && t5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void o0(MessagesController.DialogFilter dialogFilter, int i9, String str, ArrayList arrayList, boolean z10, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.o2 o2Var, Runnable runnable) {
        if (dialogFilter.flags != i9 || z13) {
            dialogFilter.pendingUnreadCount = -1;
            if (z14) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i9;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i10;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z10;
        if (z11) {
            o2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            o2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        o2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = o2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i11 = 0; i11 < size; i11 = j3.r0.e(dialogFilters.get(i11).f19649id, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            o2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void q0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.Components.oc ocVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new zf.j0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.ll.p(R.string.FolderLinkNoChatsError, ocVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.ll.p(R.string.FolderLinkOtherAdminLimitError, ocVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new zf.j0(5, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new zf.j0(12, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new zf.j0(13, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.ll.p(R.string.NoFolderFound, ocVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new zf.j0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new zf.j0(3, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else {
                org.telegram.messenger.ll.p(R.string.UnknownError, ocVar, null);
            }
        }
    }

    public static void s0(final MessagesController.DialogFilter dialogFilter, final int i9, final String str, final ArrayList arrayList, final boolean z10, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.o2 o2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.c2 c2Var = null;
        int i11 = 3;
        int i12 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(o2Var.getParentActivity(), 3, null);
            c2Var2.f22766c0 = false;
            c2Var2.show();
            c2Var = c2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f22503id = dialogFilter.f19649id;
        int i13 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        tL_dialogFilter.contacts = (i9 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0;
        tL_dialogFilter.non_contacts = (i9 & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0;
        tL_dialogFilter.groups = (i9 & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0;
        tL_dialogFilter.broadcasts = (i9 & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0;
        tL_dialogFilter.bots = (i9 & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0;
        tL_dialogFilter.exclude_muted = (i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0;
        tL_dialogFilter.exclude_read = (i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0;
        tL_dialogFilter.exclude_archived = (i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0;
        tL_dialogFilter.f22385id = dialogFilter.f19649id;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i10 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i10;
        }
        MessagesController messagesController = o2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long keyAt = longSparseIntArray.keyAt(i14);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new mt(longSparseIntArray, 1));
        }
        int i15 = 0;
        while (i15 < i11) {
            if (i15 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i15 == i13) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i12 < size2) {
                Long l10 = (Long) arrayList5.get(i12);
                org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                int i16 = size2;
                long longValue = l10.longValue();
                if ((i15 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !DialogObject.isEncryptedDialog(longValue)) {
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
                i12++;
                c2Var = c2Var3;
                size2 = i16;
            }
            i15++;
            i11 = 3;
            i12 = 0;
            i13 = 1;
        }
        o2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.c2 c2Var4 = c2Var;
                final MessagesController.DialogFilter dialogFilter2 = dialogFilter;
                final int i17 = i9;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i18 = i10;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.c2 c2Var5 = c2Var4;
                            if (c2Var5 != null) {
                                try {
                                    c2Var5.dismiss();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                            }
                            n00.o0(dialogFilter2, i17, str2, arrayList7, z17, i18, arrayList8, arrayList9, z18, z19, z20, z21, o2Var2, runnable3);
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
        o0(dialogFilter, i9, str, arrayList, z10, i10, arrayList2, arrayList3, z11, z12, z13, z14, o2Var, null);
    }

    public static CharSequence w0(int i9, CharSequence charSequence, boolean z10) {
        Context context;
        if (i9 >= 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("n_" + i9, false) && (context = ApplicationLoader.applicationContext) != null) {
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
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false), mode));
                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(mutate2, mutate3);
                    fqVar.setBounds(0, 0, fqVar.getIntrinsicWidth(), fqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(fqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        int i9;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        boolean z10 = this.f40571s;
        MessagesController.DialogFilter dialogFilter = this.f40570r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                int i10 = 26;
                if (kVar.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                    if (this.f40573x) {
                        i9 = 0;
                    } else {
                        i9 = 26;
                    }
                    titleTextView.setEmojiCacheType(i9);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.h5 titleTextView2 = this.actionBar.getTitleTextView2();
                    if (this.f40573x) {
                        i10 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i10);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 18));
        this.f40566c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(context, null, 3);
        this.fragmentView = b51Var;
        b51Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        gh.f1 f1Var = new gh.f1(this, context, 27);
        this.f40564a = f1Var;
        f1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40564a);
        this.f40564a.setLayoutManager(new f2.m0(1, false));
        this.f40564a.setVerticalScrollBarEnabled(false);
        b51Var.addView(this.f40564a, g7.e6.c(-1.0f, -1));
        gh.f1 f1Var2 = this.f40564a;
        k00 k00Var = new k00(this, context);
        this.f40565b = k00Var;
        f1Var2.setAdapter(k00Var);
        this.f40564a.setOnItemClickListener(new i(this, 9));
        this.f40564a.setOnItemLongClickListener(new nz(this, 0));
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        this.f40564a.setItemAnimator(nVar);
        this.f40564a.setOnScrollListener(new l3(this, 10));
        h0(false);
        if (!this.J && dialogFilter != null && dialogFilter.isChatlist()) {
            this.J = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19649id;
            this.I = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new rz(this, 0));
        }
        return this.fragmentView;
    }

    public final boolean g0(boolean z10) {
        if (this.f40566c.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f40571s) {
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new nz(this, 2));
                } else {
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new nz(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new nz(this, 4));
                showDialog(alertDialog$Builder.f22702a);
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.va.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23212p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23229q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 4, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.uh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{org.telegram.ui.Cells.va.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f40564a, 0, new Class[]{org.telegram.ui.Cells.va.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    public final void h0(boolean z10) {
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f40572w) && this.f40572w.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.B.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f40571s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f40570r;
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
                if (dialogFilter.title_noanimate == (!this.f40573x) && TextUtils.equals(dialogFilter.name, this.f40572w) && dialogFilter.flags == this.f40574y) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        if (this.f40566c.isEnabled() == z11) {
            return;
        }
        this.f40566c.setEnabled(z11);
        float f14 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f40566c.animate();
            if (z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z11) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (z11) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f40566c;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f40566c;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f40566c;
        if (z11) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final void i0() {
        String string;
        if (this.f40571s) {
            if (TextUtils.isEmpty(this.f40572w) || !this.f40569n) {
                int i9 = this.f40574y;
                int i10 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                int i11 = i9 & i10;
                String str = "";
                if ((i11 & i10) == i10) {
                    if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i9) != 0) {
                        string = LocaleController.getString(R.string.FilterNameUnread);
                    } else {
                        if ((i9 & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                            string = LocaleController.getString(R.string.FilterNameNonMuted);
                        }
                        string = "";
                    }
                } else {
                    int i12 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    if ((i11 & i12) != 0) {
                        if (((~i12) & i11) == 0) {
                            string = LocaleController.getString(R.string.FilterContacts);
                        }
                        string = "";
                    } else {
                        int i13 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        if ((i11 & i13) != 0) {
                            if (((~i13) & i11) == 0) {
                                string = LocaleController.getString(R.string.FilterNonContacts);
                            }
                            string = "";
                        } else {
                            int i14 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            if ((i11 & i14) != 0) {
                                if (((~i14) & i11) == 0) {
                                    string = LocaleController.getString(R.string.FilterGroups);
                                }
                                string = "";
                            } else {
                                int i15 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                                if ((i11 & i15) != 0) {
                                    if (((~i15) & i11) == 0) {
                                        string = LocaleController.getString(R.string.FilterBots);
                                    }
                                    string = "";
                                } else {
                                    int i16 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                                    if ((i11 & i16) != 0 && ((~i16) & i11) == 0) {
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
                this.f40572w = str;
                b00 b00Var = this.E;
                if (b00Var != null) {
                    b00Var.e(org.telegram.ui.Components.t5.cloneSpans(str, -1, b00Var.f36585s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                f2.q1 K = this.f40564a.K(this.d);
                if (K != null) {
                    this.f40565b.y(K);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void k0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i9 = 0;
            while (true) {
                arrayList = this.H;
                if (i9 < arrayList.size()) {
                    if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i9)).url, tL_exportedChatlistInvite.url)) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                arrayList.remove(i9);
                if (arrayList.isEmpty()) {
                    this.f40570r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
                }
                v0();
            }
        }
    }

    public final void l0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            arrayList = this.H;
            if (i9 < arrayList.size()) {
                if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i9)).url, tL_exportedChatlistInvite.url)) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i9, tL_exportedChatlistInvite);
        }
        v0();
    }

    public final void m0(int i9, boolean z10) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.O && (dialogFilter = this.f40570r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.O = true;
            this.P = new gh.q6(this, z10, i9, 3);
            if (getLayoutContainer() != null) {
                this.P.run();
                this.P = null;
            }
        }
    }

    public final void n0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i9;
        if (arrayList != null) {
            i9 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!arrayList2.contains(arrayList.get(i10))) {
                    i9++;
                }
            }
            size = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (!arrayList.contains(arrayList2.get(i11))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i9 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i9 = 0;
        }
        if (z10) {
            if (size > 0 && size > i9) {
                m0(size, true);
            } else if (i9 > 0) {
                m0(i9, false);
            }
        } else if (size > 0) {
            m0(size, false);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.d3 d3Var;
        h00 h00Var = this.G;
        if (h00Var != null && (d3Var = h00Var.f24373b) != null && d3Var.f33124e) {
            if (z10) {
                d3Var.k(true);
                return false;
            }
            return false;
        }
        return g0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        v0();
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f40564a.setPadding(0, 0, 0, i12);
        this.f40564a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        v0();
        gh.q6 q6Var = this.P;
        if (q6Var != null) {
            q6Var.run();
        }
    }

    public final void p0() {
        wi wiVar = this.N;
        if (wiVar != null) {
            wiVar.b(true);
            this.N = null;
        }
        r0(new pz(this, 0), true);
    }

    public final void r0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f40572w};
        s0(this.f40570r, this.f40574y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f40573x, this.A, this.B, this.C, this.D, this.f40571s, false, this.h, true, z10, this, new org.telegram.ui.Components.p61(21, this, runnable));
    }

    public final void t0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.B;
        } else {
            arrayList = this.C;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f40574y, arrayList, z10);
        usersSelectActivity.B = this.f40570r.isChatlist();
        usersSelectActivity.f36290n = new dh.s(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void u0(e00 e00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            c2Var.N = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                c2Var.P = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new b5.e(this, e00Var, z10, 7));
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        }
    }

    public final void v0() {
        String str;
        String string;
        int size;
        int size2;
        int i9;
        ArrayList arrayList = this.K;
        arrayList.clear();
        ArrayList arrayList2 = this.L;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string2 = LocaleController.getString(R.string.FilterNameHeader);
        if (j0(this.f40572w)) {
            if (this.f40573x) {
                i9 = R.string.FilterNameAnimationsDisable;
            } else {
                i9 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i9);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final n00 f40559b;

            {
                this.f40559b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n00 n00Var = this.f40559b;
                        n00Var.f40568f = true;
                        n00Var.v0();
                        return;
                    case 1:
                        n00 n00Var2 = this.f40559b;
                        MessagesController.DialogFilter dialogFilter = n00Var2.f40570r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n00.S(n00Var2, dialogFilter.f19649id, new oz(n00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        n00Var2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                            return;
                        }
                        return;
                    case 2:
                        n00.T(this.f40559b);
                        return;
                    case 3:
                        this.f40559b.t0(true);
                        return;
                    case 4:
                        n00 n00Var3 = this.f40559b;
                        n00Var3.f40567e = true;
                        n00Var3.v0();
                        return;
                    default:
                        this.f40559b.t0(false);
                        return;
                }
            }
        };
        ?? aVar = new wf.a(11, false);
        aVar.d = string2;
        aVar.f37768e = str;
        aVar.f37767c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new wf.a(2, false));
        arrayList2.add(e00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? aVar2 = new wf.a(0, false);
        aVar2.d = string3;
        arrayList2.add(aVar2);
        e00 b10 = e00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f37767c = new View.OnClickListener(this) {
            public final n00 f40559b;

            {
                this.f40559b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n00 n00Var = this.f40559b;
                        n00Var.f40568f = true;
                        n00Var.v0();
                        return;
                    case 1:
                        n00 n00Var2 = this.f40559b;
                        MessagesController.DialogFilter dialogFilter = n00Var2.f40570r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n00.S(n00Var2, dialogFilter.f19649id, new oz(n00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        n00Var2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                            return;
                        }
                        return;
                    case 2:
                        n00.T(this.f40559b);
                        return;
                    case 3:
                        this.f40559b.t0(true);
                        return;
                    case 4:
                        n00 n00Var3 = this.f40559b;
                        n00Var3.f40567e = true;
                        n00Var3.v0();
                        return;
                    default:
                        this.f40559b.t0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.B.isEmpty()) {
            if (!this.f40567e && this.B.size() >= 8) {
                size2 = Math.min(5, this.B.size());
            } else {
                size2 = this.B.size();
            }
            for (int i10 = 0; i10 < size2; i10++) {
                long longValue = ((Long) this.B.get(i10)).longValue();
                ?? aVar3 = new wf.a(1, false);
                aVar3.f37770g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
            }
            if (size2 != this.B.size()) {
                e00 b11 = e00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.B.size() - 5, new Object[0]), false);
                b11.f37767c = new View.OnClickListener(this) {
                    public final n00 f40559b;

                    {
                        this.f40559b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                n00 n00Var = this.f40559b;
                                n00Var.f40568f = true;
                                n00Var.v0();
                                return;
                            case 1:
                                n00 n00Var2 = this.f40559b;
                                MessagesController.DialogFilter dialogFilter = n00Var2.f40570r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.n00.S(n00Var2, dialogFilter.f19649id, new oz(n00Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                n00Var2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                    return;
                                }
                                return;
                            case 2:
                                n00.T(this.f40559b);
                                return;
                            case 3:
                                this.f40559b.t0(true);
                                return;
                            case 4:
                                n00 n00Var3 = this.f40559b;
                                n00Var3.f40567e = true;
                                n00Var3.v0();
                                return;
                            default:
                                this.f40559b.t0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(e00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f40570r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? aVar4 = new wf.a(0, false);
            aVar4.d = string4;
            arrayList2.add(aVar4);
            e00 b12 = e00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f37767c = new View.OnClickListener(this) {
                public final n00 f40559b;

                {
                    this.f40559b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            n00 n00Var = this.f40559b;
                            n00Var.f40568f = true;
                            n00Var.v0();
                            return;
                        case 1:
                            n00 n00Var2 = this.f40559b;
                            MessagesController.DialogFilter dialogFilter2 = n00Var2.f40570r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n00.S(n00Var2, dialogFilter2.f19649id, new oz(n00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            n00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                return;
                            }
                            return;
                        case 2:
                            n00.T(this.f40559b);
                            return;
                        case 3:
                            this.f40559b.t0(true);
                            return;
                        case 4:
                            n00 n00Var3 = this.f40559b;
                            n00Var3.f40567e = true;
                            n00Var3.v0();
                            return;
                        default:
                            this.f40559b.t0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f40574y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(e00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.C.isEmpty()) {
                if (!this.f40568f && this.C.size() >= 8) {
                    size = Math.min(5, this.C.size());
                } else {
                    size = this.C.size();
                }
                for (int i11 = 0; i11 < size; i11++) {
                    long longValue2 = ((Long) this.C.get(i11)).longValue();
                    ?? aVar5 = new wf.a(1, false);
                    aVar5.f37770g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.C.size()) {
                    e00 b13 = e00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.C.size() - 5, new Object[0]), false);
                    b13.f37767c = new View.OnClickListener(this) {
                        public final n00 f40559b;

                        {
                            this.f40559b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    n00 n00Var = this.f40559b;
                                    n00Var.f40568f = true;
                                    n00Var.v0();
                                    return;
                                case 1:
                                    n00 n00Var2 = this.f40559b;
                                    MessagesController.DialogFilter dialogFilter2 = n00Var2.f40570r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.n00.S(n00Var2, dialogFilter2.f19649id, new oz(n00Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                                    n00Var2.showDialog(c2Var);
                                    TextView textView = (TextView) c2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                        return;
                                    }
                                    return;
                                case 2:
                                    n00.T(this.f40559b);
                                    return;
                                case 3:
                                    this.f40559b.t0(true);
                                    return;
                                case 4:
                                    n00 n00Var3 = this.f40559b;
                                    n00Var3.f40567e = true;
                                    n00Var3.v0();
                                    return;
                                default:
                                    this.f40559b.t0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(e00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new wf.a(9, false));
            arrayList2.add(new wf.a(10, false));
            arrayList2.add(e00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.H;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? aVar6 = new wf.a(0, false);
            aVar6.d = string5;
            aVar6.f37769f = true;
            arrayList2.add(aVar6);
            arrayList2.add(e00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(e00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? aVar7 = new wf.a(0, false);
            aVar7.d = string6;
            aVar7.f37769f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new wf.a(8, false));
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                ?? aVar8 = new wf.a(7, false);
                aVar8.f37775m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i12);
                arrayList2.add(aVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(e00.d(string));
        }
        if (!this.f40571s) {
            e00 b14 = e00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f37767c = new View.OnClickListener(this) {
                public final n00 f40559b;

                {
                    this.f40559b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            n00 n00Var = this.f40559b;
                            n00Var.f40568f = true;
                            n00Var.v0();
                            return;
                        case 1:
                            n00 n00Var2 = this.f40559b;
                            MessagesController.DialogFilter dialogFilter2 = n00Var2.f40570r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n00.S(n00Var2, dialogFilter2.f19649id, new oz(n00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n00Var2.getParentActivity());
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nz(n00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            n00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                                return;
                            }
                            return;
                        case 2:
                            n00.T(this.f40559b);
                            return;
                        case 3:
                            this.f40559b.t0(true);
                            return;
                        case 4:
                            n00 n00Var3 = this.f40559b;
                            n00Var3.f40567e = true;
                            n00Var3.v0();
                            return;
                        default:
                            this.f40559b.t0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(e00.d(null));
        }
        k00 k00Var = this.f40565b;
        if (k00Var != null) {
            k00Var.E(arrayList, arrayList2);
        }
    }
}
