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
public final class c10 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public q00 I;
    public r00 J;
    public w00 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public fj R;
    public boolean S;
    public i2.g0 T;
    public ai.w0 f32219a;
    public z00 f32220b;
    public org.telegram.ui.ActionBar.v0 f32221c;
    public int d;
    public boolean e;
    public boolean f32222f;
    public boolean h;
    public boolean f32223n;
    public final MessagesController.DialogFilter f32224r;
    public boolean f32225s;
    public boolean v;
    public CharSequence f32226w;
    public boolean f32227x;
    public int f32228y;

    public c10(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f32227x = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f32224r = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.f32224r = dialogFilter2;
            dialogFilter2.f15577id = 2;
            while (getMessagesController().dialogFiltersById.get(this.f32224r.f15577id) != null) {
                this.f32224r.f15577id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.f32224r;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.f32225s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f32224r.name);
        this.f32226w = spannableStringBuilder;
        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.f32226w = replaceEmoji;
        this.f32226w = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f32224r.entities, textPaint.getFontMetricsInt());
        boolean z10 = !this.f32224r.title_noanimate;
        this.f32227x = z10;
        org.telegram.ui.Components.q5.s(this.currentAccount, z10);
        MessagesController.DialogFilter dialogFilter4 = this.f32224r;
        this.f32228y = dialogFilter4.flags;
        this.E = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.f32224r.alwaysShow);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f32224r.neverShow);
        this.H = this.f32224r.pinnedDialogs.clone();
    }

    public static void U(c10 c10Var) {
        int i10;
        String str;
        int i11;
        c10Var.f32227x = !c10Var.f32227x;
        r00 r00Var = c10Var.J;
        if (r00Var != null) {
            org.telegram.ui.Cells.u3 u3Var = r00Var.f36649r;
            if (k0(c10Var.f32226w)) {
                if (c10Var.f32227x) {
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
        org.telegram.ui.Components.q5.s(c10Var.currentAccount, c10Var.f32227x);
        c10Var.i0(true);
        org.telegram.ui.ActionBar.k kVar = c10Var.actionBar;
        if (kVar != null) {
            int i12 = 26;
            if (kVar.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.i5 titleTextView = c10Var.actionBar.getTitleTextView();
                if (c10Var.f32227x) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (c10Var.actionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.i5 titleTextView2 = c10Var.actionBar.getTitleTextView2();
                if (c10Var.f32227x) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void V(c10 c10Var) {
        MessagesController.DialogFilter dialogFilter = c10Var.f32224r;
        if (c10Var.v) {
            c10Var.v = false;
            Paint.FontMetricsInt titleFontMetricsInt = c10Var.actionBar.getTitleFontMetricsInt();
            c10Var.actionBar.J(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
            return;
        }
        c10Var.finishFragment();
    }

    public static void W(c10 c10Var) {
        int i10;
        MessagesController messagesController = c10Var.getMessagesController();
        MessagesController.DialogFilter dialogFilter = c10Var.f32224r;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < dialogFilter.alwaysShow.size(); i11++) {
            long longValue = dialogFilter.alwaysShow.get(i11).longValue();
            if (longValue < 0 && g0(c10Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(c10Var.getMessagesController().getInputPeer(longValue));
            }
        }
        if (c10Var.getUserConfig().isPremium()) {
            i10 = c10Var.getMessagesController().dialogFiltersChatsLimitPremium;
        } else {
            i10 = c10Var.getMessagesController().dialogFiltersChatsLimitDefault;
        }
        if (arrayList.size() > i10) {
            c10Var.showDialog(new rg.j0(4, c10Var.currentAccount, c10Var.getParentActivity(), c10Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f15577id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            c10Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new f00(c10Var, 1));
        } else {
            zz zzVar = new zz(dialogFilter, null);
            zzVar.f40289y = new c00(c10Var, 1);
            zzVar.f40288x = new c00(c10Var, 2);
            c10Var.presentFragment(zzVar);
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
            org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.z5.class);
            if (z5VarArr != null && z5VarArr.length > 0) {
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
            for (int i12 = 0; i12 < size; i12 = com.google.android.gms.internal.vision.e2.e(dialogFilters.get(i12).f15577id, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            n2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void r0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.Components.xc xcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new rg.j0(4, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.z0.p(R.string.FolderLinkNoChatsError, xcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.z0.p(R.string.FolderLinkOtherAdminLimitError, xcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new rg.j0(5, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new rg.j0(12, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new rg.j0(13, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.z0.p(R.string.NoFolderFound, xcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new rg.j0(4, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new rg.j0(3, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, null).show();
            } else {
                org.telegram.messenger.z0.p(R.string.UnknownError, xcVar, null);
            }
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
            b2Var2.f18459g0 = false;
            b2Var2.show();
            b2Var = b2Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f18206id = dialogFilter.f15577id;
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
        tL_dialogFilter.f18088id = dialogFilter.f15577id;
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
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!DialogObject.isEncryptedDialog(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new tt(longSparseIntArray, 1));
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
                org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
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
                        if (z22) {
                            org.telegram.ui.ActionBar.b2 b2Var5 = b2Var4;
                            if (b2Var5 != null) {
                                try {
                                    b2Var5.dismiss();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            c10.p0(dialogFilter2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, n2Var2, runnable3);
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
        p0(dialogFilter, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, n2Var, null);
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
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Th, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    mutate2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false), mode));
                    org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(mutate2, mutate3);
                    qqVar.setBounds(0, 0, qqVar.getIntrinsicWidth(), qqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(qqVar, 0), 0, spannableString.length(), 33);
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
        boolean z10 = this.f32225s;
        MessagesController.DialogFilter dialogFilter = this.f32224r;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                int i11 = 26;
                if (kVar.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.i5 titleTextView = this.actionBar.getTitleTextView();
                    if (this.f32227x) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView.setEmojiCacheType(i10);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.i5 titleTextView2 = this.actionBar.getTitleTextView2();
                    if (this.f32227x) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 23));
        this.f32221c = n10.e(1, LocaleController.getString(R.string.Save).toUpperCase());
        hg.r1 r1Var = new hg.r1(context, null, 4);
        this.fragmentView = r1Var;
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 27);
        this.f32219a = w0Var;
        w0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32219a);
        this.f32219a.setLayoutManager(new s4.c0(1, false));
        this.f32219a.setVerticalScrollBarEnabled(false);
        r1Var.addView(this.f32219a, w7.x5.c(-1.0f, -1));
        ai.w0 w0Var2 = this.f32219a;
        z00 z00Var = new z00(this, context);
        this.f32220b = z00Var;
        w0Var2.setAdapter(z00Var);
        this.f32219a.setOnItemClickListener(new i(this, 9));
        this.f32219a.setOnItemLongClickListener(new b00(this, 0));
        s4.j jVar = new s4.j();
        jVar.f42662m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.n(350L);
        this.f32219a.setItemAnimator(jVar);
        this.f32219a.setOnScrollListener(new i3(this, 10));
        i0(false);
        if (!this.N && dialogFilter != null && dialogFilter.isChatlist()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.f15577id;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new f00(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 13);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.bb.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19008p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 262144, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"ImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 4, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"adminTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19111uh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18953m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f18973n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32219a, 0, new Class[]{org.telegram.ui.Cells.bb.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
        if (this.f32221c.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (this.f32225s) {
                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDiscardNewTitle);
                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDiscardNewAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.FilterDiscardNewSave), new b00(this, 2));
                } else {
                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDiscardTitle);
                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDiscardAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new b00(this, 3));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new b00(this, 4));
                showDialog(alertDialog$Builder.f18409a);
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
        if (!TextUtils.isEmpty(this.f32226w) && this.f32226w.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.F.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f32225s) {
                this.h = false;
                MessagesController.DialogFilter dialogFilter = this.f32224r;
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
                if (dialogFilter.title_noanimate == (!this.f32227x) && TextUtils.equals(dialogFilter.name, this.f32226w) && dialogFilter.flags == this.f32228y) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        if (this.f32221c.isEnabled() == z11) {
            return;
        }
        this.f32221c.setEnabled(z11);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f32221c.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f32221c;
        if (z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f32221c;
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f32221c;
        if (z11) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String string;
        if (this.f32225s) {
            if (TextUtils.isEmpty(this.f32226w) || !this.f32223n) {
                int i10 = this.f32228y;
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
                this.f32226w = str;
                q00 q00Var = this.I;
                if (q00Var != null) {
                    q00Var.e(org.telegram.ui.Components.z5.cloneSpans(str, -1, q00Var.f36234s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.c1 K = this.f32219a.K(this.d);
                if (K != null) {
                    this.f32220b.y(K);
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
                    this.f32224r.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
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
        if (!this.S && (dialogFilter = this.f32224r) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.S = true;
            this.T = new i2.g0(this, z10, i10, 3);
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
        w00 w00Var = this.K;
        if (w00Var != null && (d3Var = w00Var.f20027b) != null && d3Var.e) {
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
        this.f32219a.setPadding(0, 0, 0, i13);
        this.f32219a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w0();
        i2.g0 g0Var = this.T;
        if (g0Var != null) {
            g0Var.run();
        }
    }

    public final void q0() {
        fj fjVar = this.R;
        if (fjVar != null) {
            fjVar.b(true);
            this.R = null;
        }
        s0(new d00(this, 0), true);
    }

    public final void s0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f32226w};
        t0(this.f32224r, this.f32228y, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.f32227x, this.E, this.F, this.G, this.H, this.f32225s, false, this.h, true, z10, this, new hw(9, this, runnable));
    }

    public final void u0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.f32228y, arrayList, z10);
        usersSelectActivity.F = this.f32224r.isChatlist();
        usersSelectActivity.f31583n = new ai.k(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void v0(t00 t00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        if (z10) {
            b2Var.R = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            b2Var.R = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                b2Var.T = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.StickersRemove), new com.google.firebase.messaging.i(this, t00Var, z10, 8));
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
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
        if (k0(this.f32226w)) {
            if (this.f32227x) {
                i10 = R.string.FilterNameAnimationsDisable;
            } else {
                i10 = R.string.FilterNameAnimationsEnable;
            }
            str = LocaleController.getString(i10);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final c10 f31619b;

            {
                this.f31619b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c10 c10Var = this.f31619b;
                        c10Var.f32222f = true;
                        c10Var.w0();
                        return;
                    case 1:
                        c10 c10Var2 = this.f31619b;
                        MessagesController.DialogFilter dialogFilter = c10Var2.f32224r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.d10.T(c10Var2, dialogFilter.f15577id, new c00(c10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(c10Var2, 1));
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        c10Var2.showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                            return;
                        }
                        return;
                    case 2:
                        c10.U(this.f31619b);
                        return;
                    case 3:
                        this.f31619b.u0(true);
                        return;
                    case 4:
                        c10 c10Var3 = this.f31619b;
                        c10Var3.e = true;
                        c10Var3.w0();
                        return;
                    default:
                        this.f31619b.u0(false);
                        return;
                }
            }
        };
        ?? aVar = new og.a(11, false);
        aVar.d = string2;
        aVar.e = str;
        aVar.f37477c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new og.a(2, false));
        arrayList2.add(t00.d(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ?? aVar2 = new og.a(0, false);
        aVar2.d = string3;
        arrayList2.add(aVar2);
        t00 b10 = t00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        b10.f37477c = new View.OnClickListener(this) {
            public final c10 f31619b;

            {
                this.f31619b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c10 c10Var = this.f31619b;
                        c10Var.f32222f = true;
                        c10Var.w0();
                        return;
                    case 1:
                        c10 c10Var2 = this.f31619b;
                        MessagesController.DialogFilter dialogFilter = c10Var2.f32224r;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            org.telegram.ui.Components.d10.T(c10Var2, dialogFilter.f15577id, new c00(c10Var2, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(c10Var2, 1));
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                        c10Var2.showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                            return;
                        }
                        return;
                    case 2:
                        c10.U(this.f31619b);
                        return;
                    case 3:
                        this.f31619b.u0(true);
                        return;
                    case 4:
                        c10 c10Var3 = this.f31619b;
                        c10Var3.e = true;
                        c10Var3.w0();
                        return;
                    default:
                        this.f31619b.u0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.F.isEmpty()) {
            if (!this.e && this.F.size() >= 8) {
                size2 = Math.min(5, this.F.size());
            } else {
                size2 = this.F.size();
            }
            for (int i11 = 0; i11 < size2; i11++) {
                long longValue = ((Long) this.F.get(i11)).longValue();
                ?? aVar3 = new og.a(1, false);
                aVar3.f37479g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
            }
            if (size2 != this.F.size()) {
                t00 b11 = t00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.F.size() - 5, new Object[0]), false);
                b11.f37477c = new View.OnClickListener(this) {
                    public final c10 f31619b;

                    {
                        this.f31619b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                c10 c10Var = this.f31619b;
                                c10Var.f32222f = true;
                                c10Var.w0();
                                return;
                            case 1:
                                c10 c10Var2 = this.f31619b;
                                MessagesController.DialogFilter dialogFilter = c10Var2.f32224r;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(c10Var2, dialogFilter.f15577id, new c00(c10Var2, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(c10Var2, 1));
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                                c10Var2.showDialog(b2Var);
                                TextView textView = (TextView) b2Var.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                                    return;
                                }
                                return;
                            case 2:
                                c10.U(this.f31619b);
                                return;
                            case 3:
                                this.f31619b.u0(true);
                                return;
                            case 4:
                                c10 c10Var3 = this.f31619b;
                                c10Var3.e = true;
                                c10Var3.w0();
                                return;
                            default:
                                this.f31619b.u0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(t00.d(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.f32224r;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ?? aVar4 = new og.a(0, false);
            aVar4.d = string4;
            arrayList2.add(aVar4);
            t00 b12 = t00.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            b12.f37477c = new View.OnClickListener(this) {
                public final c10 f31619b;

                {
                    this.f31619b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            c10 c10Var = this.f31619b;
                            c10Var.f32222f = true;
                            c10Var.w0();
                            return;
                        case 1:
                            c10 c10Var2 = this.f31619b;
                            MessagesController.DialogFilter dialogFilter2 = c10Var2.f32224r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.d10.T(c10Var2, dialogFilter2.f15577id, new c00(c10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(c10Var2, 1));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            c10Var2.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                                return;
                            }
                            return;
                        case 2:
                            c10.U(this.f31619b);
                            return;
                        case 3:
                            this.f31619b.u0(true);
                            return;
                        case 4:
                            c10 c10Var3 = this.f31619b;
                            c10Var3.e = true;
                            c10Var3.w0();
                            return;
                        default:
                            this.f31619b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.f32228y & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(t00.c(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f32222f && this.G.size() >= 8) {
                    size = Math.min(5, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i12 = 0; i12 < size; i12++) {
                    long longValue2 = ((Long) this.G.get(i12)).longValue();
                    ?? aVar5 = new og.a(1, false);
                    aVar5.f37479g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.G.size()) {
                    t00 b13 = t00.b(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.G.size() - 5, new Object[0]), false);
                    b13.f37477c = new View.OnClickListener(this) {
                        public final c10 f31619b;

                        {
                            this.f31619b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    c10 c10Var = this.f31619b;
                                    c10Var.f32222f = true;
                                    c10Var.w0();
                                    return;
                                case 1:
                                    c10 c10Var2 = this.f31619b;
                                    MessagesController.DialogFilter dialogFilter2 = c10Var2.f32224r;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        org.telegram.ui.Components.d10.T(c10Var2, dialogFilter2.f15577id, new c00(c10Var2, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(c10Var2, 1));
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                                    c10Var2.showDialog(b2Var);
                                    TextView textView = (TextView) b2Var.d(-1);
                                    if (textView != null) {
                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                                        return;
                                    }
                                    return;
                                case 2:
                                    c10.U(this.f31619b);
                                    return;
                                case 3:
                                    this.f31619b.u0(true);
                                    return;
                                case 4:
                                    c10 c10Var3 = this.f31619b;
                                    c10Var3.e = true;
                                    c10Var3.w0();
                                    return;
                                default:
                                    this.f31619b.u0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(t00.d(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new og.a(9, false));
            arrayList2.add(new og.a(10, false));
            arrayList2.add(t00.d(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ?? aVar6 = new og.a(0, false);
            aVar6.d = string5;
            aVar6.f37478f = true;
            arrayList2.add(aVar6);
            arrayList2.add(t00.b(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(t00.d(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ?? aVar7 = new og.a(0, false);
            aVar7.d = string6;
            aVar7.f37478f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new og.a(8, false));
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ?? aVar8 = new og.a(7, false);
                aVar8.f37484m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i13);
                arrayList2.add(aVar8);
            }
            if (dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList2.add(t00.d(string));
        }
        if (!this.f32225s) {
            t00 b14 = t00.b(0, LocaleController.getString(R.string.FilterDelete), true);
            b14.f37477c = new View.OnClickListener(this) {
                public final c10 f31619b;

                {
                    this.f31619b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            c10 c10Var = this.f31619b;
                            c10Var.f32222f = true;
                            c10Var.w0();
                            return;
                        case 1:
                            c10 c10Var2 = this.f31619b;
                            MessagesController.DialogFilter dialogFilter2 = c10Var2.f32224r;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                org.telegram.ui.Components.d10.T(c10Var2, dialogFilter2.f15577id, new c00(c10Var2, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c10Var2.getParentActivity());
                            alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                            alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b00(c10Var2, 1));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            c10Var2.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                                return;
                            }
                            return;
                        case 2:
                            c10.U(this.f31619b);
                            return;
                        case 3:
                            this.f31619b.u0(true);
                            return;
                        case 4:
                            c10 c10Var3 = this.f31619b;
                            c10Var3.e = true;
                            c10Var3.w0();
                            return;
                        default:
                            this.f31619b.u0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(t00.d(null));
        }
        z00 z00Var = this.f32220b;
        if (z00Var != null) {
            z00Var.E(arrayList, arrayList2);
        }
    }
}
