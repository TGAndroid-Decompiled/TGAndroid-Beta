package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
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
import java.util.HashSet;
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
public final class q00 extends org.telegram.ui.ActionBar.r2 {
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public e00 I;
    public f00 J;
    public k00 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public ej R;
    public boolean S;
    public bi.u8 T;
    public int U;
    public int V;
    public int W;
    public bi.r1 f42555a;
    public n00 f42556b;
    public org.telegram.ui.ActionBar.u5 f42557c;
    public int d;
    public boolean e;
    public boolean f42558f;
    public boolean h;
    public boolean f42559n;
    public final MessagesController.DialogFilter f42560r;
    public boolean f42561s;
    public boolean v;
    public CharSequence f42562w;
    public boolean f42563x;
    public int f42564y;

    public q00(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f42563x = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f42560r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f42560r = dialogFilter2;
            dialogFilter2.f19548id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f42560r.f19548id) != null) {
                this.f42560r.f19548id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f42560r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f42561s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f42560r.name);
        this.f42562w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f42562w = replaceEmoji;
        this.f42562w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f42560r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f42560r.title_noanimate;
        this.f42563x = z10;
        org.telegram.ui.Components.t5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f42560r;
        this.f42564y = dialogFilter4.flags;
        this.E = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f42560r.alwaysShow);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f42560r.neverShow);
        this.H = this.f42560r.pinnedDialogs.clone();
    }

    public static CharSequence A0(int i10, CharSequence charSequence, boolean z10) {
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
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false), mode));
                    org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(mutate2, mutate3);
                    arVar.setBounds(0, 0, arVar.getIntrinsicWidth(), arVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(arVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void V(q00 q00Var) {
        int i10;
        String str;
        int i11;
        q00Var.f42563x = !q00Var.f42563x;
        f00 f00Var = q00Var.J;
        if (f00Var != null) {
            org.telegram.ui.Cells.y3 y3Var = f00Var.f39119r;
            if (m0(q00Var.f42562w)) {
                if (q00Var.f42563x) {
                    i11 = R.string.FilterNameAnimationsDisable;
                } else {
                    i11 = R.string.FilterNameAnimationsEnable;
                }
                str = LocaleController.getString(i11);
            } else {
                str = null;
            }
            y3Var.setText(str);
        }
        org.telegram.ui.Components.t5.s(q00Var.currentAccount, q00Var.f42563x);
        q00Var.k0(true);
        org.telegram.ui.ActionBar.r5 r5Var = q00Var.simpleActionBar;
        if (r5Var != null) {
            int i12 = 26;
            if (r5Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.b6 titleTextView = q00Var.simpleActionBar.getTitleTextView();
                if (q00Var.f42563x) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (q00Var.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.b6 titleTextView2 = q00Var.simpleActionBar.getTitleTextView2();
                if (q00Var.f42563x) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void W(q00 q00Var) {
        MessagesController.DialogFilter dialogFilter = q00Var.f42560r;
        if (q00Var.v) {
            q00Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = q00Var.simpleActionBar.getTitleFontMetricsInt();
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt);
            org.telegram.ui.ActionBar.r5 r5Var = q00Var.simpleActionBar;
            r5Var.getClass();
            r5Var.w(replaceAnimatedEmoji, true, 220L, org.telegram.ui.Components.ds.h);
            return;
        }
        q00Var.finishFragment();
    }

    public static void X(q00 q00Var) {
        int i10;
        MessagesController messagesController = q00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = q00Var.f42560r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dialogFilter.alwaysShow.size(); i11++) {
            long longValue = dialogFilter.alwaysShow.get(i11).longValue();
            if (longValue < 0 && i0(q00Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(q00Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (q00Var.getUserConfig().isPremium()) {
            i10 = q00Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i10 = q00Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i10) {
            q00Var.showDialog(new tg.j0(4, q00Var.currentAccount, q00Var.getParentActivity(), q00Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19548id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            q00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new uz(q00Var, 1));
        } else {
            oz ozVar = new oz(dialogFilter, null);
            ozVar.f42261x = new rz(q00Var, 1);
            ozVar.f42260w = new rz(q00Var, 2);
            q00Var.presentFragment(ozVar);
        }
    }

    public static boolean i0(TLRPC.Chat chat) {
        if (!ChatObject.canUserDoAdminAction(chat, 3)) {
            if (!ChatObject.isPublic(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean m0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.c6[] c6VarArr = (org.telegram.ui.Components.c6[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.c6.class);
            if (c6VarArr != null && c6VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void r0(MessagesController.DialogFilter dialogFilter, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.r2 r2Var, Runnable runnable) {
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
            r2Var.getMessagesController().addFilter(dialogFilter, z12);
        } else {
            r2Var.getMessagesController().onFilterUpdate(dialogFilter);
        }
        r2Var.getMessagesStorage().saveDialogFilter(dialogFilter, z12, true);
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = r2Var.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i12 = 0; i12 < size; i12 = c3.h0.i(dialogFilters.get(i12).f19548id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            r2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void t0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.Components.wc wcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new tg.j0(4, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.wh.n(R.string.FolderLinkNoChatsError, wcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.wh.n(R.string.FolderLinkOtherAdminLimitError, wcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new tg.j0(5, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new tg.j0(12, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new tg.j0(13, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.wh.n(R.string.NoFolderFound, wcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new tg.j0(4, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new tg.j0(3, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, null).show();
            } else {
                org.telegram.messenger.wh.n(R.string.UnknownError, wcVar, null);
            }
        }
    }

    public static void v0(final MessagesController.DialogFilter dialogFilter, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.r2 r2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (r2Var == null || r2Var.getParentActivity() == null) {
            return;
        }
        final org.telegram.ui.ActionBar.e2 e2Var = null;
        int i12 = 3;
        int i13 = 0;
        if (z15) {
            org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(r2Var.getParentActivity(), 3, null);
            e2Var2.f22576i0 = false;
            e2Var2.show();
            e2Var = e2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f22153id = dialogFilter.f19548id;
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
        tL_dialogFilter.f22033id = dialogFilter.f19548id;
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
        MessagesController messagesController = r2Var.getMessagesController();
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
                Long l4 = (Long) arrayList5.get(i13);
                org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
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
                e2Var = e2Var3;
                size2 = i17;
            }
            i16++;
            i12 = 3;
            i13 = 0;
            i14 = 1;
        }
        r2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
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
                final org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                final Runnable runnable2 = runnable;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var4;
                            if (e2Var5 != null) {
                                try {
                                    e2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            q00.r0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, r2Var2, runnable3);
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
        r0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, r2Var, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23685uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return j0(true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.f42561s;
        MessagesController.DialogFilter dialogFilter = this.f42560r;
        if (z10) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            if (r5Var != null) {
                int i12 = 26;
                if (r5Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.b6 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f42563x) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView.setEmojiCacheType(i10);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.b6 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f42563x) {
                        i12 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i12);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 28));
        org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
        if (this.f42561s) {
            i11 = R.string.Create;
        } else {
            i11 = R.string.Save;
        }
        this.f42557c = r5Var2.i(LocaleController.getString(i11));
        jg.r1 r1Var = new jg.r1(context, null, 4);
        this.fragmentView = r1Var;
        bi.r1 r1Var2 = new bi.r1(this, context, 28);
        this.f42555a = r1Var2;
        r1Var2.u1();
        this.f42555a.setLayoutManager(new s4.c0(1, false));
        this.f42555a.setVerticalScrollBarEnabled(false);
        this.f42555a.setSectionsDrawBackground(true);
        r1Var.addView(this.f42555a, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        bi.r1 r1Var3 = this.f42555a;
        n00 n00Var = new n00(this, context);
        this.f42556b = n00Var;
        r1Var3.setAdapter(n00Var);
        this.f42555a.setOnItemClickListener(new h(this, 10));
        this.f42555a.setOnItemLongClickListener(new qz(this, 0));
        s4.l lVar = new s4.l();
        lVar.f47798m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        this.f42555a.setItemAnimator(lVar);
        this.f42555a.setOnScrollListener(new i3(this, 11));
        k0(false);
        if (!this.N && dialogFilter != null && dialogFilter.isChatlist()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f19548id;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new uz(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f42555a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42555a, 16, new Class[]{org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.ab.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42555a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23582p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42555a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23598q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42555a, 262144, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42555a, 0, new Class[]{org.telegram.ui.Cells.ab.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23541n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z10) {
        if (this.f42557c.f23139w.f19326f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f42561s) {
                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new qz(this, 2));
                } else {
                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new qz(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new qz(this, 4));
                showDialog(alertDialog$Builder.f22369a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void k0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f42562w) && this.f42562w.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.F.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f42561s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f42560r;
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
                if (dialogFilter.title_noanimate == (!this.f42563x) && TextUtils.equals(dialogFilter.name, this.f42562w) && dialogFilter.flags == this.f42564y) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        this.f42557c.a(z11, z10);
    }

    public final void l0() {
        String string;
        if (this.f42561s) {
            if (TextUtils.isEmpty(this.f42562w) || !this.f42559n) {
                int i10 = this.f42564y;
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
                this.f42562w = str;
                e00 e00Var = this.I;
                if (e00Var != null) {
                    e00Var.e(org.telegram.ui.Components.c6.cloneSpans(str, -1, e00Var.f38722s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.e1 K = this.f42555a.K(this.d);
                if (K != null) {
                    this.f42556b.y(K);
                }
            }
        }
    }

    public final void n0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
                    this.f42560r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
                }
                y0();
            }
        }
    }

    public final void o0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        y0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.b3 b3Var;
        k00 k00Var = this.K;
        if (k00Var != null && (b3Var = k00Var.f24003b) != null && b3Var.e) {
            if (z10) {
                b3Var.k(true);
                return false;
            }
            return false;
        }
        return j0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        y0();
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
    public final void onResume() {
        super.onResume();
        y0();
        bi.u8 u8Var = this.T;
        if (u8Var != null) {
            u8Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.b3 b3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            z0();
            try {
                k00 k00Var = this.K;
                if (k00Var != null && (b3Var = k00Var.f24003b) != null && b3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Oh)) != this.U) {
                    this.U = themedColor;
                    this.K.f24003b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void p0(int i10, boolean z10) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.S && (dialogFilter = this.f42560r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.S = true;
            this.T = new bi.u8(this, z10, i10, 6);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void q0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
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
                p0(size, true);
            } else if (i10 > 0) {
                p0(i10, false);
            }
        } else if (size > 0) {
            p0(size, false);
        }
    }

    public final void s0() {
        ej ejVar = this.R;
        if (ejVar != null) {
            ejVar.b(true);
            this.R = null;
        }
        u0(new sz(this, 0), true);
    }

    public final void u0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f42562w};
        v0(this.f42560r, this.f42564y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f42563x, this.E, this.F, this.G, this.H, this.f42561s, false, this.h, true, z10, this, new kz(2, this, runnable));
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f42564y, arrayList, z10);
        usersSelectActivity.F = this.f42560r.isChatlist();
        usersSelectActivity.f36350n = new di.f(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void x0(h00 h00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        if (z10) {
            e2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            e2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                e2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new bi.z3(this, h00Var, z10, 8));
        showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
        }
    }

    public final void y0() {
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
        if (m0(this.f42562w)) {
            if (this.f42563x) {
                i10 = R.string.FilterNameAnimationsDisable;
            } else {
                i10 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i10);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final q00 f42547b;

            {
                this.f42547b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q00 q00Var = this.f42547b;
                        q00Var.f42558f = true;
                        q00Var.y0();
                        return;
                    case 1:
                        q00 q00Var2 = this.f42547b;
                        MessagesController.DialogFilter dialogFilter = q00Var2.f42560r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n10.U(q00Var2, dialogFilter.f19548id, new rz(q00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        q00Var2.showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                            return;
                        }
                        return;
                    case 2:
                        q00.V(this.f42547b);
                        return;
                    case 3:
                        this.f42547b.w0(true);
                        return;
                    case 4:
                        q00 q00Var3 = this.f42547b;
                        q00Var3.e = true;
                        q00Var3.y0();
                        return;
                    default:
                        this.f42547b.w0(false);
                        return;
                }
            }
        };
        ?? aVar = new qg.a(11, false);
        aVar.d = string2;
        aVar.e = str;
        aVar.f39737c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new qg.a(2, false));
        arrayList2.add(h00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? aVar2 = new qg.a(0, false);
        aVar2.d = string3;
        arrayList2.add(aVar2);
        h00 b10 = h00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f39737c = new View.OnClickListener(this) {
            public final q00 f42547b;

            {
                this.f42547b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q00 q00Var = this.f42547b;
                        q00Var.f42558f = true;
                        q00Var.y0();
                        return;
                    case 1:
                        q00 q00Var2 = this.f42547b;
                        MessagesController.DialogFilter dialogFilter = q00Var2.f42560r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.n10.U(q00Var2, dialogFilter.f19548id, new rz(q00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        q00Var2.showDialog(e2Var);
                        TextView textView = (TextView) e2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                            return;
                        }
                        return;
                    case 2:
                        q00.V(this.f42547b);
                        return;
                    case 3:
                        this.f42547b.w0(true);
                        return;
                    case 4:
                        q00 q00Var3 = this.f42547b;
                        q00Var3.e = true;
                        q00Var3.y0();
                        return;
                    default:
                        this.f42547b.w0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.F.isEmpty()) {
            if (!this.e && this.F.size() >= 8) {
                size2 = Math.min(5, this.F.size());
            } else {
                size2 = this.F.size();
            }
            for (int i11 = 0; i11 < size2; i11++) {
                long longValue = ((Long) this.F.get(i11)).longValue();
                ?? aVar3 = new qg.a(1, false);
                aVar3.f39739g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
            }
            if (size2 != this.F.size()) {
                h00 b11 = h00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                b11.f39737c = new View.OnClickListener(this) {
                    public final q00 f42547b;

                    {
                        this.f42547b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                q00 q00Var = this.f42547b;
                                q00Var.f42558f = true;
                                q00Var.y0();
                                return;
                            case 1:
                                q00 q00Var2 = this.f42547b;
                                MessagesController.DialogFilter dialogFilter = q00Var2.f42560r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.n10.U(q00Var2, dialogFilter.f19548id, new rz(q00Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                q00Var2.showDialog(e2Var);
                                TextView textView = (TextView) e2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                                    return;
                                }
                                return;
                            case 2:
                                q00.V(this.f42547b);
                                return;
                            case 3:
                                this.f42547b.w0(true);
                                return;
                            case 4:
                                q00 q00Var3 = this.f42547b;
                                q00Var3.e = true;
                                q00Var3.y0();
                                return;
                            default:
                                this.f42547b.w0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(h00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f42560r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? aVar4 = new qg.a(0, false);
            aVar4.d = string4;
            arrayList2.add(aVar4);
            h00 b12 = h00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f39737c = new View.OnClickListener(this) {
                public final q00 f42547b;

                {
                    this.f42547b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            q00 q00Var = this.f42547b;
                            q00Var.f42558f = true;
                            q00Var.y0();
                            return;
                        case 1:
                            q00 q00Var2 = this.f42547b;
                            MessagesController.DialogFilter dialogFilter2 = q00Var2.f42560r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n10.U(q00Var2, dialogFilter2.f19548id, new rz(q00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            q00Var2.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                                return;
                            }
                            return;
                        case 2:
                            q00.V(this.f42547b);
                            return;
                        case 3:
                            this.f42547b.w0(true);
                            return;
                        case 4:
                            q00 q00Var3 = this.f42547b;
                            q00Var3.e = true;
                            q00Var3.y0();
                            return;
                        default:
                            this.f42547b.w0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f42564y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f42558f && this.G.size() >= 8) {
                    size = Math.min(5, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i12 = 0; i12 < size; i12++) {
                    long longValue2 = ((Long) this.G.get(i12)).longValue();
                    ?? aVar5 = new qg.a(1, false);
                    aVar5.f39739g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.G.size()) {
                    h00 b13 = h00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    b13.f39737c = new View.OnClickListener(this) {
                        public final q00 f42547b;

                        {
                            this.f42547b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    q00 q00Var = this.f42547b;
                                    q00Var.f42558f = true;
                                    q00Var.y0();
                                    return;
                                case 1:
                                    q00 q00Var2 = this.f42547b;
                                    MessagesController.DialogFilter dialogFilter2 = q00Var2.f42560r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.n10.U(q00Var2, dialogFilter2.f19548id, new rz(q00Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                                    q00Var2.showDialog(e2Var);
                                    TextView textView = (TextView) e2Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q00.V(this.f42547b);
                                    return;
                                case 3:
                                    this.f42547b.w0(true);
                                    return;
                                case 4:
                                    q00 q00Var3 = this.f42547b;
                                    q00Var3.e = true;
                                    q00Var3.y0();
                                    return;
                                default:
                                    this.f42547b.w0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(h00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new qg.a(9, false));
            arrayList2.add(new qg.a(10, false));
            arrayList2.add(h00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? aVar6 = new qg.a(0, false);
            aVar6.d = string5;
            aVar6.f39738f = true;
            arrayList2.add(aVar6);
            arrayList2.add(h00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(h00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? aVar7 = new qg.a(0, false);
            aVar7.d = string6;
            aVar7.f39738f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new qg.a(8, false));
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ?? aVar8 = new qg.a(7, false);
                aVar8.f39744m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i13);
                arrayList2.add(aVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(h00.d(string));
        }
        if (!this.f42561s) {
            h00 b14 = h00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f39737c = new View.OnClickListener(this) {
                public final q00 f42547b;

                {
                    this.f42547b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            q00 q00Var = this.f42547b;
                            q00Var.f42558f = true;
                            q00Var.y0();
                            return;
                        case 1:
                            q00 q00Var2 = this.f42547b;
                            MessagesController.DialogFilter dialogFilter2 = q00Var2.f42560r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.n10.U(q00Var2, dialogFilter2.f19548id, new rz(q00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            q00Var2.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                                return;
                            }
                            return;
                        case 2:
                            q00.V(this.f42547b);
                            return;
                        case 3:
                            this.f42547b.w0(true);
                            return;
                        case 4:
                            q00 q00Var3 = this.f42547b;
                            q00Var3.e = true;
                            q00Var3.y0();
                            return;
                        default:
                            this.f42547b.w0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(h00.d(null));
        }
        n00 n00Var = this.f42556b;
        if (n00Var != null) {
            n00Var.E(arrayList, arrayList2);
        }
    }

    public final void z0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f42555a != null) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23749y6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.il, false);
                if (x02 != this.V || x03 != this.W) {
                    this.V = x02;
                    this.W = x03;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f42555a.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f42555a.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f42555a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f42555a.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f42555a.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f42555a.V(i11);
                            } else if (i10 == 2) {
                                O = this.f42555a.P(i11);
                            } else {
                                O = this.f42555a.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.ab) {
                                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) O;
                                abVar.f23874a0 = true;
                                abVar.Q = x02;
                                abVar.R = x03;
                                if (i10 != 0) {
                                    ((org.telegram.ui.Cells.ab) O).i(0);
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
    }
}
