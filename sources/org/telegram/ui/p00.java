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
public final class p00 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public ArrayList B;
    public ArrayList C;
    public final LongSparseIntArray D;
    public d00 E;
    public e00 F;
    public j00 G;
    public final ArrayList H;
    public int I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public float M;
    public zi N;
    public boolean O;
    public jh.n6 P;
    public jh.e1 f41260a;
    public m00 f41261b;
    public org.telegram.ui.ActionBar.w0 f41262c;
    public int d;
    public boolean f41263e;
    public boolean f41264f;
    public boolean h;
    public boolean f41265n;
    public final MessagesController.DialogFilter f41266r;
    public boolean f41267s;
    public boolean v;
    public CharSequence f41268w;
    public boolean f41269x;
    public int f41270y;

    public p00(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f41269x = true;
        this.H = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = -5.0f;
        this.f41266r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f41266r = dialogFilter2;
            dialogFilter2.f19620id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f41266r.f19620id) != null) {
                this.f41266r.f19620id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f41266r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f41267s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f41266r.name);
        this.f41268w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f41268w = replaceEmoji;
        this.f41268w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f41266r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f41266r.title_noanimate;
        this.f41269x = z10;
        org.telegram.ui.Components.p5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f41266r;
        this.f41270y = dialogFilter4.flags;
        this.A = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f41266r.alwaysShow);
        this.B = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.C = new ArrayList(this.f41266r.neverShow);
        this.D = this.f41266r.pinnedDialogs.clone();
    }

    public static void U(p00 p00Var) {
        int i10;
        String str;
        int i11;
        p00Var.f41269x = !p00Var.f41269x;
        e00 e00Var = p00Var.F;
        if (e00Var != null) {
            org.telegram.ui.Cells.r3 r3Var = e00Var.f37661r;
            if (k0(p00Var.f41268w)) {
                if (p00Var.f41269x) {
                    i11 = R.string.FilterNameAnimationsDisable;
                } else {
                    i11 = R.string.FilterNameAnimationsEnable;
                }
                str = LocaleController.getString(i11);
            } else {
                str = null;
            }
            r3Var.setText(str);
        }
        org.telegram.ui.Components.p5.s(p00Var.currentAccount, p00Var.f41269x);
        p00Var.i0(true);
        org.telegram.ui.ActionBar.l lVar = p00Var.actionBar;
        if (lVar != null) {
            int i12 = 26;
            if (lVar.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.h5 titleTextView = p00Var.actionBar.getTitleTextView();
                if (p00Var.f41269x) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (p00Var.actionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.h5 titleTextView2 = p00Var.actionBar.getTitleTextView2();
                if (p00Var.f41269x) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void V(p00 p00Var) {
        MessagesController.DialogFilter dialogFilter = p00Var.f41266r;
        if (p00Var.v) {
            p00Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = p00Var.actionBar.getTitleFontMetricsInt();
            p00Var.actionBar.I(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
            return;
        }
        p00Var.finishFragment();
    }

    public static void W(p00 p00Var) {
        int i10;
        MessagesController messagesController = p00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = p00Var.f41266r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dialogFilter.alwaysShow.size(); i11++) {
            long longValue = dialogFilter.alwaysShow.get(i11).longValue();
            if (longValue < 0 && g0(p00Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(p00Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (p00Var.getUserConfig().isPremium()) {
            i10 = p00Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i10 = p00Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i10) {
            p00Var.showDialog(new cg.v0(4, p00Var.currentAccount, p00Var.getParentActivity(), p00Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19620id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            p00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new tz(p00Var, 1));
        } else {
            nz nzVar = new nz(dialogFilter, null);
            nzVar.f40939y = new qz(p00Var, 1);
            nzVar.f40938x = new qz(p00Var, 2);
            p00Var.presentFragment(nzVar);
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

    public static void p0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.o2 o2Var, Runnable runnable) {
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
            o2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            o2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        o2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = o2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = th.d(dialogFilters.get(i12).f19620id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            o2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.Components.tc tcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new cg.v0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.x3.s(R.string.FolderLinkNoChatsError, tcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.x3.s(R.string.FolderLinkOtherAdminLimitError, tcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new cg.v0(5, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new cg.v0(12, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new cg.v0(13, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.x3.s(R.string.NoFolderFound, tcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new cg.v0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new cg.v0(3, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else {
                org.telegram.messenger.x3.s(R.string.UnknownError, tcVar, null);
            }
        }
    }

    public static void t0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.o2 o2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.c2 c2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(o2Var.getParentActivity(), 3, null);
            c2Var2.f22783c0 = false;
            c2Var2.show();
            c2Var = c2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f22515id = dialogFilter.f19620id;
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
        tL_dialogFilter.f22397id = dialogFilter.f19620id;
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
        MessagesController messagesController = o2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new mt(longSparseIntArray, 1));
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
                org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
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
                c2Var = c2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        o2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.c2 c2Var4 = c2Var;
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
                            p00.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, o2Var2, runnable3);
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
        p0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, o2Var, null);
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
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), mode));
                    org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(mutate2, mutate3);
                    jqVar.setBounds(0, 0, jqVar.getIntrinsicWidth(), jqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(jqVar, 0), 0, spannableString.length(), 33);
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
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        boolean z10 = this.f41267s;
        MessagesController.DialogFilter dialogFilter = this.f41266r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                int i11 = 26;
                if (lVar.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                    if (this.f41269x) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView.setEmojiCacheType(i10);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.h5 titleTextView2 = this.actionBar.getTitleTextView2();
                    if (this.f41269x) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 10));
        this.f41262c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        org.telegram.ui.Components.n51 n51Var = new org.telegram.ui.Components.n51(context, null, 3);
        this.fragmentView = n51Var;
        n51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        jh.e1 e1Var = new jh.e1(this, context, 26);
        this.f41260a = e1Var;
        e1Var.p1();
        this.actionBar.setAdaptiveBackground(this.f41260a);
        this.f41260a.setLayoutManager(new f2.j0(1, false));
        this.f41260a.setVerticalScrollBarEnabled(false);
        n51Var.addView(this.f41260a, i7.f6.c(-1.0f, -1));
        jh.e1 e1Var2 = this.f41260a;
        m00 m00Var = new m00(this, context);
        this.f41261b = m00Var;
        e1Var2.setAdapter(m00Var);
        this.f41260a.setOnItemClickListener(new j(this, 9));
        this.f41260a.setOnItemLongClickListener(new pz(this, 0));
        f2.l lVar2 = new f2.l();
        lVar2.f6463m = false;
        lVar2.C = false;
        lVar2.o(org.telegram.ui.Components.jr.h);
        lVar2.n(350L);
        this.f41260a.setItemAnimator(lVar2);
        this.f41260a.setOnScrollListener(new m3(this, 10));
        i0(false);
        if (!this.J && dialogFilter != null && dialogFilter.isChatlist()) {
            this.J = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19620id;
            this.I = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new tz(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.m8.class, org.telegram.ui.Cells.sa.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23279p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 4, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23376uh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41260a, 0, new Class[]{org.telegram.ui.Cells.sa.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        if (this.f41262c.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f41267s) {
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new pz(this, 2));
                } else {
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new pz(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new pz(this, 4));
                showDialog(alertDialog$Builder.f22714a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void i0(boolean z10) {
        boolean z11;
        float f9;
        float f10;
        float f11;
        float f12;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f41268w) && this.f41268w.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.B.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f41267s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f41266r;
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
                if (dialogFilter.title_noanimate == (!this.f41269x) && TextUtils.equals(dialogFilter.name, this.f41268w) && dialogFilter.flags == this.f41270y) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        if (this.f41262c.isEnabled() == z11) {
            return;
        }
        this.f41262c.setEnabled(z11);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f41262c.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f41262c;
        if (z11) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        w0Var.setAlpha(f9);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f41262c;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f41262c;
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
        if (this.f41267s) {
            if (TextUtils.isEmpty(this.f41268w) || !this.f41265n) {
                int i10 = this.f41270y;
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
                this.f41268w = str;
                d00 d00Var = this.E;
                if (d00Var != null) {
                    d00Var.e(org.telegram.ui.Components.y5.cloneSpans(str, -1, d00Var.f37251s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                f2.n1 K = this.f41260a.K(this.d);
                if (K != null) {
                    this.f41261b.y(K);
                }
            }
        }
    }

    public final void l0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i10 = 0;
            while (true) {
                arrayList = this.H;
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
                    this.f41266r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
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
            arrayList = this.H;
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
        if (!this.O && (dialogFilter = this.f41266r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.O = true;
            this.P = new jh.n6(this, z10, i10, 3);
            if (getLayoutContainer() != null) {
                this.P.run();
                this.P = null;
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
        org.telegram.ui.Cells.b3 b3Var;
        j00 j00Var = this.G;
        if (j00Var != null && (b3Var = j00Var.f24218b) != null && b3Var.f26885e) {
            if (z10) {
                b3Var.k(true);
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
        if (this.I != 0) {
            getConnectionsManager().cancelRequest(this.I, true);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f41260a.setPadding(0, 0, 0, i13);
        this.f41260a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w0();
        jh.n6 n6Var = this.P;
        if (n6Var != null) {
            n6Var.run();
        }
    }

    public final void q0() {
        zi ziVar = this.N;
        if (ziVar != null) {
            ziVar.b(true);
            this.N = null;
        }
        s0(new rz(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f41268w};
        t0(this.f41266r, this.f41270y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f41269x, this.A, this.B, this.C, this.D, this.f41267s, false, this.h, true, z10, this, new org.telegram.ui.Components.voip.o(18, this, runnable));
    }

    public final void u0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.B;
        } else {
            arrayList = this.C;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f41270y, arrayList, z10);
        usersSelectActivity.B = this.f41266r.isChatlist();
        usersSelectActivity.f36355n = new gh.q(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(g00 g00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
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
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new com.google.firebase.messaging.i(this, g00Var, z10, 7));
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        }
    }

    public final void w0() {
        String str;
        String string;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.K;
        arrayList.clear();
        ArrayList arrayList2 = this.L;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string2 = LocaleController.getString(R.string.FilterNameHeader);
        if (k0(this.f41268w)) {
            if (this.f41269x) {
                i10 = R.string.FilterNameAnimationsDisable;
            } else {
                i10 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i10);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final p00 f41251b;

            {
                this.f41251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p00 p00Var = this.f41251b;
                        p00Var.f41264f = true;
                        p00Var.w0();
                        return;
                    case 1:
                        p00 p00Var2 = this.f41251b;
                        MessagesController.DialogFilter dialogFilter = p00Var2.f41266r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.y00.T(p00Var2, dialogFilter.f19620id, new qz(p00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p00Var2.getParentActivity());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pz(p00Var2, 1));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        p00Var2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                            return;
                        }
                        return;
                    case 2:
                        p00.U(this.f41251b);
                        return;
                    case 3:
                        this.f41251b.u0(true);
                        return;
                    case 4:
                        p00 p00Var3 = this.f41251b;
                        p00Var3.f41263e = true;
                        p00Var3.w0();
                        return;
                    default:
                        this.f41251b.u0(false);
                        return;
                }
            }
        };
        ?? aVar = new zf.a(11, false);
        aVar.d = string2;
        aVar.f38402e = str;
        aVar.f38401c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new zf.a(2, false));
        arrayList2.add(g00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? aVar2 = new zf.a(0, false);
        aVar2.d = string3;
        arrayList2.add(aVar2);
        g00 b10 = g00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f38401c = new View.OnClickListener(this) {
            public final p00 f41251b;

            {
                this.f41251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p00 p00Var = this.f41251b;
                        p00Var.f41264f = true;
                        p00Var.w0();
                        return;
                    case 1:
                        p00 p00Var2 = this.f41251b;
                        MessagesController.DialogFilter dialogFilter = p00Var2.f41266r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.y00.T(p00Var2, dialogFilter.f19620id, new qz(p00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p00Var2.getParentActivity());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pz(p00Var2, 1));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        p00Var2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                            return;
                        }
                        return;
                    case 2:
                        p00.U(this.f41251b);
                        return;
                    case 3:
                        this.f41251b.u0(true);
                        return;
                    case 4:
                        p00 p00Var3 = this.f41251b;
                        p00Var3.f41263e = true;
                        p00Var3.w0();
                        return;
                    default:
                        this.f41251b.u0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.B.isEmpty()) {
            if (!this.f41263e && this.B.size() >= 8) {
                size2 = Math.min(5, this.B.size());
            } else {
                size2 = this.B.size();
            }
            for (int i11 = 0; i11 < size2; i11++) {
                long longValue = ((Long) this.B.get(i11)).longValue();
                ?? aVar3 = new zf.a(1, false);
                aVar3.f38404g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
            }
            if (size2 != this.B.size()) {
                g00 b11 = g00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.B.size() - 5, new Object[0]), false);
                b11.f38401c = new View.OnClickListener(this) {
                    public final p00 f41251b;

                    {
                        this.f41251b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                p00 p00Var = this.f41251b;
                                p00Var.f41264f = true;
                                p00Var.w0();
                                return;
                            case 1:
                                p00 p00Var2 = this.f41251b;
                                MessagesController.DialogFilter dialogFilter = p00Var2.f41266r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.y00.T(p00Var2, dialogFilter.f19620id, new qz(p00Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p00Var2.getParentActivity());
                                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pz(p00Var2, 1));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                p00Var2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                                    return;
                                }
                                return;
                            case 2:
                                p00.U(this.f41251b);
                                return;
                            case 3:
                                this.f41251b.u0(true);
                                return;
                            case 4:
                                p00 p00Var3 = this.f41251b;
                                p00Var3.f41263e = true;
                                p00Var3.w0();
                                return;
                            default:
                                this.f41251b.u0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(g00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f41266r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? aVar4 = new zf.a(0, false);
            aVar4.d = string4;
            arrayList2.add(aVar4);
            g00 b12 = g00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f38401c = new View.OnClickListener(this) {
                public final p00 f41251b;

                {
                    this.f41251b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            p00 p00Var = this.f41251b;
                            p00Var.f41264f = true;
                            p00Var.w0();
                            return;
                        case 1:
                            p00 p00Var2 = this.f41251b;
                            MessagesController.DialogFilter dialogFilter2 = p00Var2.f41266r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.y00.T(p00Var2, dialogFilter2.f19620id, new qz(p00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p00Var2.getParentActivity());
                            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pz(p00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            p00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                                return;
                            }
                            return;
                        case 2:
                            p00.U(this.f41251b);
                            return;
                        case 3:
                            this.f41251b.u0(true);
                            return;
                        case 4:
                            p00 p00Var3 = this.f41251b;
                            p00Var3.f41263e = true;
                            p00Var3.w0();
                            return;
                        default:
                            this.f41251b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f41270y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(g00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.C.isEmpty()) {
                if (!this.f41264f && this.C.size() >= 8) {
                    size = Math.min(5, this.C.size());
                } else {
                    size = this.C.size();
                }
                for (int i12 = 0; i12 < size; i12++) {
                    long longValue2 = ((Long) this.C.get(i12)).longValue();
                    ?? aVar5 = new zf.a(1, false);
                    aVar5.f38404g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.C.size()) {
                    g00 b13 = g00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.C.size() - 5, new Object[0]), false);
                    b13.f38401c = new View.OnClickListener(this) {
                        public final p00 f41251b;

                        {
                            this.f41251b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    p00 p00Var = this.f41251b;
                                    p00Var.f41264f = true;
                                    p00Var.w0();
                                    return;
                                case 1:
                                    p00 p00Var2 = this.f41251b;
                                    MessagesController.DialogFilter dialogFilter2 = p00Var2.f41266r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.y00.T(p00Var2, dialogFilter2.f19620id, new qz(p00Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p00Var2.getParentActivity());
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pz(p00Var2, 1));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                                    p00Var2.showDialog(c2Var);
                                    TextView textView = (TextView) c2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                                        return;
                                    }
                                    return;
                                case 2:
                                    p00.U(this.f41251b);
                                    return;
                                case 3:
                                    this.f41251b.u0(true);
                                    return;
                                case 4:
                                    p00 p00Var3 = this.f41251b;
                                    p00Var3.f41263e = true;
                                    p00Var3.w0();
                                    return;
                                default:
                                    this.f41251b.u0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(g00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new zf.a(9, false));
            arrayList2.add(new zf.a(10, false));
            arrayList2.add(g00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.H;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? aVar6 = new zf.a(0, false);
            aVar6.d = string5;
            aVar6.f38403f = true;
            arrayList2.add(aVar6);
            arrayList2.add(g00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(g00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? aVar7 = new zf.a(0, false);
            aVar7.d = string6;
            aVar7.f38403f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new zf.a(8, false));
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ?? aVar8 = new zf.a(7, false);
                aVar8.f38409m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i13);
                arrayList2.add(aVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(g00.d(string));
        }
        if (!this.f41267s) {
            g00 b14 = g00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f38401c = new View.OnClickListener(this) {
                public final p00 f41251b;

                {
                    this.f41251b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            p00 p00Var = this.f41251b;
                            p00Var.f41264f = true;
                            p00Var.w0();
                            return;
                        case 1:
                            p00 p00Var2 = this.f41251b;
                            MessagesController.DialogFilter dialogFilter2 = p00Var2.f41266r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.y00.T(p00Var2, dialogFilter2.f19620id, new qz(p00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p00Var2.getParentActivity());
                            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pz(p00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            p00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                                return;
                            }
                            return;
                        case 2:
                            p00.U(this.f41251b);
                            return;
                        case 3:
                            this.f41251b.u0(true);
                            return;
                        case 4:
                            p00 p00Var3 = this.f41251b;
                            p00Var3.f41263e = true;
                            p00Var3.w0();
                            return;
                        default:
                            this.f41251b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(g00.d(null));
        }
        m00 m00Var = this.f41261b;
        if (m00Var != null) {
            m00Var.E(arrayList, arrayList2);
        }
    }
}
