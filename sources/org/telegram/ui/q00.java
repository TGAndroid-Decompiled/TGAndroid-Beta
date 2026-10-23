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
public final class q00 extends org.telegram.ui.ActionBar.o2 {
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
    public aj R;
    public boolean S;
    public ai.z8 T;
    public int U;
    public int V;
    public int W;
    public ai.u1 f40585a;
    public n00 f40586b;
    public org.telegram.ui.ActionBar.u0 f40587c;
    public int d;
    public boolean e;
    public boolean f40588f;
    public boolean h;
    public boolean f40589n;
    public final MessagesController.DialogFilter f40590r;
    public boolean f40591s;
    public boolean v;
    public CharSequence f40592w;
    public boolean f40593x;
    public int f40594y;

    public q00(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f40593x = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f40590r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f40590r = dialogFilter2;
            dialogFilter2.f17862id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f40590r.f17862id) != null) {
                this.f40590r.f17862id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f40590r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f40591s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40590r.name);
        this.f40592w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f40592w = replaceEmoji;
        this.f40592w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f40590r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f40590r.title_noanimate;
        this.f40593x = z10;
        org.telegram.ui.Components.r5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f40590r;
        this.f40594y = dialogFilter4.flags;
        this.E = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f40590r.alwaysShow);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f40590r.neverShow);
        this.H = this.f40590r.pinnedDialogs.clone();
    }

    public static void U(q00 q00Var) {
        int i10;
        String str;
        int i11;
        q00Var.f40593x = !q00Var.f40593x;
        f00 f00Var = q00Var.J;
        if (f00Var != null) {
            org.telegram.ui.Cells.t3 t3Var = f00Var.f37184r;
            if (k0(q00Var.f40592w)) {
                if (q00Var.f40593x) {
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
        org.telegram.ui.Components.r5.s(q00Var.currentAccount, q00Var.f40593x);
        q00Var.i0(true);
        org.telegram.ui.ActionBar.k kVar = q00Var.actionBar;
        if (kVar != null) {
            int i12 = 26;
            if (kVar.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.n5 titleTextView = q00Var.actionBar.getTitleTextView();
                if (q00Var.f40593x) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (q00Var.actionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.n5 titleTextView2 = q00Var.actionBar.getTitleTextView2();
                if (q00Var.f40593x) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void V(q00 q00Var) {
        MessagesController.DialogFilter dialogFilter = q00Var.f40590r;
        if (q00Var.v) {
            q00Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = q00Var.actionBar.getTitleFontMetricsInt();
            q00Var.actionBar.I(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
            return;
        }
        q00Var.finishFragment();
    }

    public static void W(q00 q00Var) {
        int i10;
        MessagesController messagesController = q00Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = q00Var.f40590r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dialogFilter.alwaysShow.size(); i11++) {
            long longValue = dialogFilter.alwaysShow.get(i11).longValue();
            if (longValue < 0 && g0(q00Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(q00Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (q00Var.getUserConfig().isPremium()) {
            i10 = q00Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i10 = q00Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i10) {
            q00Var.showDialog(new sg.j0(4, q00Var.currentAccount, q00Var.getParentActivity(), q00Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17862id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            q00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new uz(q00Var, 1));
        } else {
            oz ozVar = new oz(dialogFilter, null);
            ozVar.E = new rz(q00Var, 1);
            ozVar.f40312y = new rz(q00Var, 2);
            q00Var.presentFragment(ozVar);
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
            org.telegram.ui.Components.a6[] a6VarArr = (org.telegram.ui.Components.a6[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.a6.class);
            if (a6VarArr != null && a6VarArr.length > 0) {
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
            for (int i12 = 0; i12 < size; i12 = com.google.android.gms.internal.play_billing.k3.f(dialogFilters.get(i12).f17862id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            o2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.Components.xc xcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.sl.q(R.string.FolderLinkNoChatsError, xcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.sl.q(R.string.FolderLinkOtherAdminLimitError, xcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(5, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(12, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(13, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.sl.q(R.string.NoFolderFound, xcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(4, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new sg.j0(3, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, null).show();
            } else {
                org.telegram.messenger.sl.q(R.string.UnknownError, xcVar, null);
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
            c2Var2.f20762i0 = false;
            c2Var2.show();
            c2Var = c2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f20466id = dialogFilter.f17862id;
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
        tL_dialogFilter.f20348id = dialogFilter.f17862id;
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
                Long l4 = (Long) arrayList5.get(i13);
                org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
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
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            q00.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, o2Var2, runnable3);
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

    public static CharSequence y0(int i10, CharSequence charSequence, boolean z10) {
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
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false), mode));
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(mutate2, mutate3);
                    yqVar.setBounds(0, 0, yqVar.getIntrinsicWidth(), yqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(yqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21571y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21346m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21509uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
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
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        boolean z10 = this.f40591s;
        MessagesController.DialogFilter dialogFilter = this.f40590r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                int i11 = 26;
                if (kVar.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.n5 titleTextView = this.actionBar.getTitleTextView();
                    if (this.f40593x) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView.setEmojiCacheType(i10);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.n5 titleTextView2 = this.actionBar.getTitleTextView2();
                    if (this.f40593x) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 26));
        this.f40587c = m10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        ig.o1 o1Var = new ig.o1(context, null, 4);
        this.fragmentView = o1Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, o1Var, null);
        ai.u1 u1Var = new ai.u1(this, context, 28);
        this.f40585a = u1Var;
        u1Var.t1();
        this.actionBar.setAdaptiveBackground(this.f40585a);
        this.f40585a.setLayoutManager(new s4.b0(1, false));
        this.f40585a.setVerticalScrollBarEnabled(false);
        o1Var.addView(this.f40585a, w7.z5.c(-1.0f, -1));
        ai.u1 u1Var2 = this.f40585a;
        n00 n00Var = new n00(this, context);
        this.f40586b = n00Var;
        u1Var2.setAdapter(n00Var);
        this.f40585a.setOnItemClickListener(new h(this, 10));
        this.f40585a.setOnItemLongClickListener(new qz(this, 0));
        s4.k kVar2 = new s4.k();
        kVar2.f46377m = false;
        kVar2.C = false;
        kVar2.o(org.telegram.ui.Components.bs.h);
        kVar2.n(350L);
        this.f40585a.setItemAnimator(kVar2);
        this.f40585a.setOnScrollListener(new j3(this, 10));
        i0(false);
        if (!this.N && dialogFilter != null && dialogFilter.isChatlist()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17862id;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new uz(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40585a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.wa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21183d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40585a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21404p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40585a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40585a, 262144, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40585a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21366n6));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        if (this.f40587c.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f40591s) {
                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new qz(this, 2));
                } else {
                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new qz(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new qz(this, 4));
                showDialog(alertDialog$Builder.f20678a);
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
        if (!TextUtils.isEmpty(this.f40592w) && this.f40592w.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.F.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f40591s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f40590r;
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
                if (dialogFilter.title_noanimate == (!this.f40593x) && TextUtils.equals(dialogFilter.name, this.f40592w) && dialogFilter.flags == this.f40594y) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        if (this.f40587c.isEnabled() == z11) {
            return;
        }
        this.f40587c.setEnabled(z11);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f40587c.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f40587c;
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f40587c;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f40587c;
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
        if (this.f40591s) {
            if (TextUtils.isEmpty(this.f40592w) || !this.f40589n) {
                int i10 = this.f40594y;
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
                this.f40592w = str;
                e00 e00Var = this.I;
                if (e00Var != null) {
                    e00Var.e(org.telegram.ui.Components.a6.cloneSpans(str, -1, e00Var.f36771s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.b1 K = this.f40585a.K(this.d);
                if (K != null) {
                    this.f40586b.y(K);
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
                    this.f40590r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
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
        if (!this.S && (dialogFilter = this.f40590r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.S = true;
            this.T = new ai.z8(this, z10, i10, 5);
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
        org.telegram.ui.Cells.c3 c3Var;
        k00 k00Var = this.K;
        if (k00Var != null && (c3Var = k00Var.f22315b) != null && c3Var.e) {
            if (z10) {
                c3Var.k(true);
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
        this.f40585a.setPadding(0, 0, 0, i13);
        this.f40585a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w0();
        ai.z8 z8Var = this.T;
        if (z8Var != null) {
            z8Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.c3 c3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            x0();
            try {
                k00 k00Var = this.K;
                if (k00Var != null && (c3Var = k00Var.f22315b) != null && c3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Oh)) != this.U) {
                    this.U = themedColor;
                    this.K.f22315b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void q0() {
        aj ajVar = this.R;
        if (ajVar != null) {
            ajVar.b(true);
            this.R = null;
        }
        s0(new sz(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f40592w};
        t0(this.f40590r, this.f40594y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f40593x, this.E, this.F, this.G, this.H, this.f40591s, false, this.h, true, z10, this, new ot(14, this, runnable));
    }

    public final void u0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f40594y, arrayList, z10);
        usersSelectActivity.F = this.f40590r.isChatlist();
        usersSelectActivity.f34261n = new ci.f(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(h00 h00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        if (z10) {
            c2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                c2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                c2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                c2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            c2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                c2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                c2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                c2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new ai.e4(this, h00Var, z10, 8));
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
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
        if (k0(this.f40592w)) {
            if (this.f40593x) {
                i10 = R.string.FilterNameAnimationsDisable;
            } else {
                i10 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i10);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final q00 f40577b;

            {
                this.f40577b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q00 q00Var = this.f40577b;
                        q00Var.f40588f = true;
                        q00Var.w0();
                        return;
                    case 1:
                        q00 q00Var2 = this.f40577b;
                        MessagesController.DialogFilter dialogFilter = q00Var2.f40590r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.k10.U(q00Var2, dialogFilter.f17862id, new rz(q00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        q00Var2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                            return;
                        }
                        return;
                    case 2:
                        q00.U(this.f40577b);
                        return;
                    case 3:
                        this.f40577b.u0(true);
                        return;
                    case 4:
                        q00 q00Var3 = this.f40577b;
                        q00Var3.e = true;
                        q00Var3.w0();
                        return;
                    default:
                        this.f40577b.u0(false);
                        return;
                }
            }
        };
        ?? aVar = new pg.a(11, false);
        aVar.d = string2;
        aVar.e = str;
        aVar.f37697c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new pg.a(2, false));
        arrayList2.add(h00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? aVar2 = new pg.a(0, false);
        aVar2.d = string3;
        arrayList2.add(aVar2);
        h00 b10 = h00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f37697c = new View.OnClickListener(this) {
            public final q00 f40577b;

            {
                this.f40577b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        q00 q00Var = this.f40577b;
                        q00Var.f40588f = true;
                        q00Var.w0();
                        return;
                    case 1:
                        q00 q00Var2 = this.f40577b;
                        MessagesController.DialogFilter dialogFilter = q00Var2.f40590r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.k10.U(q00Var2, dialogFilter.f17862id, new rz(q00Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                        alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                        q00Var2.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                            return;
                        }
                        return;
                    case 2:
                        q00.U(this.f40577b);
                        return;
                    case 3:
                        this.f40577b.u0(true);
                        return;
                    case 4:
                        q00 q00Var3 = this.f40577b;
                        q00Var3.e = true;
                        q00Var3.w0();
                        return;
                    default:
                        this.f40577b.u0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
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
                ?? aVar3 = new pg.a(1, false);
                aVar3.f37699g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
            }
            if (size2 != this.F.size()) {
                h00 b11 = h00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                b11.f37697c = new View.OnClickListener(this) {
                    public final q00 f40577b;

                    {
                        this.f40577b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                q00 q00Var = this.f40577b;
                                q00Var.f40588f = true;
                                q00Var.w0();
                                return;
                            case 1:
                                q00 q00Var2 = this.f40577b;
                                MessagesController.DialogFilter dialogFilter = q00Var2.f40590r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.k10.U(q00Var2, dialogFilter.f17862id, new rz(q00Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                q00Var2.showDialog(c2Var);
                                TextView textView = (TextView) c2Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                    return;
                                }
                                return;
                            case 2:
                                q00.U(this.f40577b);
                                return;
                            case 3:
                                this.f40577b.u0(true);
                                return;
                            case 4:
                                q00 q00Var3 = this.f40577b;
                                q00Var3.e = true;
                                q00Var3.w0();
                                return;
                            default:
                                this.f40577b.u0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(h00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f40590r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? aVar4 = new pg.a(0, false);
            aVar4.d = string4;
            arrayList2.add(aVar4);
            h00 b12 = h00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f37697c = new View.OnClickListener(this) {
                public final q00 f40577b;

                {
                    this.f40577b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            q00 q00Var = this.f40577b;
                            q00Var.f40588f = true;
                            q00Var.w0();
                            return;
                        case 1:
                            q00 q00Var2 = this.f40577b;
                            MessagesController.DialogFilter dialogFilter2 = q00Var2.f40590r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.k10.U(q00Var2, dialogFilter2.f17862id, new rz(q00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            q00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                return;
                            }
                            return;
                        case 2:
                            q00.U(this.f40577b);
                            return;
                        case 3:
                            this.f40577b.u0(true);
                            return;
                        case 4:
                            q00 q00Var3 = this.f40577b;
                            q00Var3.e = true;
                            q00Var3.w0();
                            return;
                        default:
                            this.f40577b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f40594y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(h00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f40588f && this.G.size() >= 8) {
                    size = Math.min(5, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i12 = 0; i12 < size; i12++) {
                    long longValue2 = ((Long) this.G.get(i12)).longValue();
                    ?? aVar5 = new pg.a(1, false);
                    aVar5.f37699g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.G.size()) {
                    h00 b13 = h00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    b13.f37697c = new View.OnClickListener(this) {
                        public final q00 f40577b;

                        {
                            this.f40577b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    q00 q00Var = this.f40577b;
                                    q00Var.f40588f = true;
                                    q00Var.w0();
                                    return;
                                case 1:
                                    q00 q00Var2 = this.f40577b;
                                    MessagesController.DialogFilter dialogFilter2 = q00Var2.f40590r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.k10.U(q00Var2, dialogFilter2.f17862id, new rz(q00Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                                    q00Var2.showDialog(c2Var);
                                    TextView textView = (TextView) c2Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                        return;
                                    }
                                    return;
                                case 2:
                                    q00.U(this.f40577b);
                                    return;
                                case 3:
                                    this.f40577b.u0(true);
                                    return;
                                case 4:
                                    q00 q00Var3 = this.f40577b;
                                    q00Var3.e = true;
                                    q00Var3.w0();
                                    return;
                                default:
                                    this.f40577b.u0(false);
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
            arrayList2.add(new pg.a(9, false));
            arrayList2.add(new pg.a(10, false));
            arrayList2.add(h00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? aVar6 = new pg.a(0, false);
            aVar6.d = string5;
            aVar6.f37698f = true;
            arrayList2.add(aVar6);
            arrayList2.add(h00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(h00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? aVar7 = new pg.a(0, false);
            aVar7.d = string6;
            aVar7.f37698f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new pg.a(8, false));
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ?? aVar8 = new pg.a(7, false);
                aVar8.f37704m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i13);
                arrayList2.add(aVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(h00.d(string));
        }
        if (!this.f40591s) {
            h00 b14 = h00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f37697c = new View.OnClickListener(this) {
                public final q00 f40577b;

                {
                    this.f40577b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            q00 q00Var = this.f40577b;
                            q00Var.f40588f = true;
                            q00Var.w0();
                            return;
                        case 1:
                            q00 q00Var2 = this.f40577b;
                            MessagesController.DialogFilter dialogFilter2 = q00Var2.f40590r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.k10.U(q00Var2, dialogFilter2.f17862id, new rz(q00Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q00Var2.getParentActivity());
                            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qz(q00Var2, 1));
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            q00Var2.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
                                return;
                            }
                            return;
                        case 2:
                            q00.U(this.f40577b);
                            return;
                        case 3:
                            this.f40577b.u0(true);
                            return;
                        case 4:
                            q00 q00Var3 = this.f40577b;
                            q00Var3.e = true;
                            q00Var3.w0();
                            return;
                        default:
                            this.f40577b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(h00.d(null));
        }
        n00 n00Var = this.f40586b;
        if (n00Var != null) {
            n00Var.E(arrayList, arrayList2);
        }
    }

    public final void x0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f40585a != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21571y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.il, false);
                if (x02 != this.V || x03 != this.W) {
                    this.V = x02;
                    this.W = x03;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f40585a.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f40585a.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f40585a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f40585a.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f40585a.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f40585a.V(i11);
                            } else if (i10 == 2) {
                                O = this.f40585a.P(i11);
                            } else {
                                O = this.f40585a.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.wa) {
                                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) O;
                                waVar.f23925a0 = true;
                                waVar.Q = x02;
                                waVar.R = x03;
                                if (i10 != 0) {
                                    ((org.telegram.ui.Cells.wa) O).i(0);
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
}
