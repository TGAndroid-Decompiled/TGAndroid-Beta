package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class i10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ud.b {

    public static final SpannableStringBuilder[] f38933o0 = new SpannableStringBuilder[3];
    public long A;
    public long B;
    public long C;
    public long D;
    public String E;
    public boolean F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.n2 H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public String M;
    public int N;
    public final a10 O;
    public final b10 P;
    public final g10 Q;
    public final d10 R;
    public final f10 S;
    public final d10 T;
    public final d10 U;
    public final ArrayList V;
    public final ArrayList W;

    public final ud.a f38934a;

    public boolean f38935a0;

    public final hh.f1 f38936b;

    public final w5 f38937b0;

    public final org.telegram.ui.Components.iw0 f38938c;

    public final v00 f38939c0;
    public org.telegram.ui.Components.yk0 d;

    public z00 f38940d0;

    public s00 f38941e;

    public org.telegram.ui.Components.fn0 f38942e0;

    public final ArrayList f38943f;

    public final f2.k0 f38944f0;

    public final w00 f38945g0;
    public final SparseArray h;

    public final AnimationNotificationsLocker f38946h0;

    public final jh.a3 f38947i0;

    public final r00 f38948j0;

    public h10 f38949k0;

    public boolean f38950l0;
    public int m0;

    public final ArrayList f38951n;

    public boolean f38952n0;

    public final HashMap f38953r;

    public int f38954s;
    public int v;

    public String f38955w;

    public String f38956x;

    public pf.e0 f38957y;

    public i10(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        this.f38934a = new ud.a(0, this, org.telegram.ui.Components.er.h, 380L, false);
        this.f38943f = new ArrayList();
        this.h = new SparseArray();
        this.f38951n = new ArrayList();
        this.f38953r = new HashMap();
        this.f38954s = 3;
        this.O = new a10(0, 0L);
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f38937b0 = new w5(this, 4);
        this.f38939c0 = new v00(this);
        this.f38946h0 = new AnimationNotificationsLocker();
        this.f38948j0 = new r00(this, 0);
        this.H = n2Var;
        Activity parentActivity = n2Var.getParentActivity();
        this.G = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        hh.f1 f1Var = new hh.f1(this, parentActivity, 28);
        this.f38936b = f1Var;
        f1Var.setOnItemClickListener(new i(this, 11));
        f1Var.setOnItemLongClickListener(new g(this, 16));
        f2.k0 k0Var = new f2.k0();
        this.f38944f0 = k0Var;
        f1Var.setLayoutManager(k0Var);
        w00 w00Var = new w00(this, parentActivity, 0);
        this.f38945g0 = w00Var;
        addView(w00Var);
        addView(f1Var);
        f1Var.setSectionsType(2);
        f1Var.setSkipDrawSection(true);
        f1Var.setOnScrollListener(new x00(this));
        jh.a3 a3Var = new jh.a3(parentActivity);
        this.f38947i0 = a3Var;
        String dateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) a3Var.d, dateChat)) {
            a3Var.d = dateChat;
            ((org.telegram.ui.Components.i6) a3Var.f13031b).q(dateChat, true, true);
        }
        addView(a3Var, h7.z5.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.P = new b10(this);
        this.Q = new g10(this, getContext());
        this.R = new d10(this, getContext(), 1);
        this.S = new f10(this, getContext());
        this.T = new d10(this, getContext(), 4);
        this.U = new d10(this, getContext(), 2);
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(parentActivity, w00Var, 1, null);
        this.f38938c = iw0Var;
        addView(iw0Var);
        f1Var.setEmptyView(iw0Var);
        iw0Var.setVisibility(8);
        b();
    }

    public static void a(i10 i10Var, MessageObject messageObject, View view, int i10) {
        if (!i10Var.f38949k0.f()) {
            i10Var.f38949k0.a();
        }
        if (i10Var.f38949k0.f()) {
            i10Var.f38949k0.d(messageObject, view, i10);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z10) {
        return d(messageObject, z10, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z10, int i10, TextPaint textPaint) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic2;
        int i11;
        if (messageObject == null || messageObject.messageOwner == null) {
            return "";
        }
        if (messageObject.isQuickReply()) {
            qf.p1 p1VarC = qf.q1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
            return p1VarC == null ? "" : p1VarC.f46419b;
        }
        if (messageObject.isSponsored()) {
            if (messageObject.sponsoredCanReport) {
                return LocaleController.getString(R.string.SponsoredMessageAd);
            }
            return messageObject.sponsoredRecommended ? LocaleController.getString(R.string.SponsoredMessage2Recommended) : LocaleController.getString(R.string.SponsoredMessage2);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = f38933o0;
        if (spannableStringBuilderArr[i10] == null) {
            spannableStringBuilderArr[i10] = new SpannableStringBuilder(">");
            if (i10 == 0) {
                i11 = R.drawable.attach_arrow_right;
            } else if (i10 == 1) {
                i11 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i10 != 2) {
                    return "";
                }
                i11 = R.drawable.msg_mini_arrow_mediabold;
            }
            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(i10 == 0 ? 2 : 1, ApplicationLoader.applicationContext.getDrawable(i11).mutate());
            if (i10 == 1 || i10 == 2) {
                cqVar.setScale(0.85f);
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
            spannableStringBuilder.setSpan(cqVar, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message = messageObject.messageOwner;
        CharSequence charSequenceReplaceEmoji = null;
        if (message.saved_peer_id != null) {
            if (messageObject.getSavedDialogId() >= 0) {
                user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.getSavedDialogId()));
                chat = null;
            } else if (messageObject.getSavedDialogId() < 0) {
                chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getSavedDialogId()));
                user = null;
                chat2 = null;
            } else {
                user = null;
                chat = null;
            }
            chat2 = chat;
        } else {
            TLRPC.User user2 = message.from_id.user_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id)) : null;
            chat = messageObject.messageOwner.from_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            if (chat == null) {
                chat = messageObject.messageOwner.from_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            }
            chat2 = messageObject.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id)) : null;
            if (chat2 == null) {
                chat2 = messageObject.messageOwner.peer_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id)) : null;
            }
            if (ChatObject.isChannelAndNotMegaGroup(chat2) || z10) {
                user = user2;
            } else {
                user = user2;
                chat2 = null;
            }
        }
        if (user != null && chat2 != null) {
            CharSequence charSequenceJ = chat2.title;
            if (ChatObject.isForum(chat2) && (tL_forumTopicFindTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f22380id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequenceJ = wf.c.j(tL_forumTopicFindTopic2, null, null);
            }
            CharSequence charSequenceReplaceEmoji2 = Emoji.replaceEmoji(charSequenceJ, textPaint == null ? null : textPaint.getFontMetricsInt(), false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(Emoji.replaceEmoji(UserObject.getFirstName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i10]).append((char) 8202).append(charSequenceReplaceEmoji2);
            charSequenceReplaceEmoji = spannableStringBuilder2;
        } else if (user != null) {
            charSequenceReplaceEmoji = Emoji.replaceEmoji(UserObject.getUserName(user), textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        } else if (chat != null) {
            CharSequence charSequenceJ2 = chat.title;
            if (ChatObject.isForum(chat) && (tL_forumTopicFindTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f22380id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                charSequenceJ2 = wf.c.j(tL_forumTopicFindTopic, null, null);
            }
            charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceJ2, textPaint != null ? textPaint.getFontMetricsInt() : null, false);
        }
        return charSequenceReplaceEmoji == null ? "" : charSequenceReplaceEmoji;
    }

    public final void b() {
        float f10 = this.f38934a.f48497e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(24.0f));
        jh.a3 a3Var = this.f38947i0;
        a3Var.setTranslationY(f11);
        a3Var.setAlpha(f10);
        a3Var.setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            hh.f1 f1Var = this.f38936b;
            int childCount = f1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (f1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) f1Var.getChildAt(i12)).b0(0, true);
                }
                f1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long j10, ArrayList arrayList) {
        org.telegram.ui.Components.yk0 yk0Var;
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f38943f;
            if (i11 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i11);
            long dialogId = messageObject.getDialogId();
            if (dialogId < 0) {
                i10 = (int) (-dialogId);
                if (!ChatObject.isChannel(i10, UserConfig.selectedAccount)) {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            if (i10 == j10) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (messageObject.getId() == ((Integer) arrayList.get(i12)).intValue()) {
                        arrayList2.remove(i11);
                        this.h.remove(messageObject.getId());
                        String str = messageObject.monthKey;
                        HashMap map = this.f38953r;
                        ArrayList arrayList3 = (ArrayList) map.get(str);
                        arrayList3.remove(messageObject);
                        if (arrayList3.size() == 0) {
                            this.f38951n.remove(messageObject.monthKey);
                            map.remove(messageObject.monthKey);
                        }
                        i11--;
                        this.K--;
                        z10 = true;
                    }
                }
            }
            i11++;
        }
        if (!z10 || (yk0Var = this.d) == null) {
            return;
        }
        yk0Var.l();
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        String str;
        if (messageObject == null) {
            return;
        }
        if (this.f38949k0.f()) {
            this.f38949k0.d(messageObject, view, i11);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p2) {
            this.f38949k0.c(messageObject);
            return;
        }
        int i12 = this.f38957y.d;
        v00 v00Var = this.f38939c0;
        ArrayList arrayList = this.f38943f;
        String string = null;
        org.telegram.ui.ActionBar.n2 n2Var = this.H;
        if (i12 == 0) {
            PhotoViewer.t1().K2(null, n2Var, null);
            PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, v00Var);
            this.N = PhotoViewer.t1().f35600c;
            return;
        }
        if (i12 == 3 || i12 == 5) {
            if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).a();
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (view instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                TLRPC.Document document = messageObject.getDocument();
                if (!f7Var.C) {
                    if (f7Var.B) {
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                        f7Var.f(true);
                        return;
                    } else {
                        MessageObject message = f7Var.getMessage();
                        message.putInDownloadsStore = true;
                        AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                        f7Var.f(true);
                        return;
                    }
                }
                if (!messageObject.canPreviewDocument()) {
                    AndroidUtilities.openDocument(messageObject, this.G, n2Var);
                    return;
                }
                PhotoViewer.t1().K2(null, n2Var, null);
                int iIndexOf = arrayList.indexOf(messageObject);
                if (iIndexOf >= 0) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer.t1().a2(arrayList, iIndexOf, 0L, 0L, 0L, v00Var);
                    this.N = PhotoViewer.t1().f35600c;
                    return;
                } else {
                    ArrayList arrayListM = org.telegram.messenger.y1.m(messageObject);
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer.t1().a2(arrayListM, 0, 0L, 0L, 0L, v00Var);
                    this.N = PhotoViewer.t1().f35600c;
                    return;
                }
            }
            return;
        }
        if (i12 == 2) {
            try {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                    str = null;
                } else {
                    if (webPage.cached_page != null) {
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                            n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                            return;
                        }
                        return;
                    }
                    String str2 = webPage.embed_url;
                    if (str2 != null && str2.length() != 0) {
                        org.telegram.ui.Components.fu.J(this.H, messageObject, this.f38939c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                        return;
                    }
                    str = webPage.url;
                }
                if (str == null) {
                    ArrayList arrayList2 = ((org.telegram.ui.Cells.i7) view).A;
                    if (arrayList2.size() > 0) {
                        string = ((CharSequence) arrayList2.get(0)).toString();
                    }
                    str = string;
                }
                if (str != null) {
                    g(str);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.y4.q0(this.H, str, true, true);
        } else {
            we.e.s(this.G, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23124h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        hh.f1 f1Var = this.f38936b;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 2048, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23145i7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f23182k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.e7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.f23087f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4, new Class[]{org.telegram.ui.Cells.e7.class}, org.telegram.ui.ActionBar.g6.f23105g3, null, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.i7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.i7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 524304, new Class[]{org.telegram.ui.Cells.j7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 524288, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23385w0, null, null, org.telegram.ui.ActionBar.g6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23417y0, null, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f22995a1}, null, org.telegram.ui.ActionBar.g6.f23001a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.f23103g1, org.telegram.ui.ActionBar.g6.f23120h1};
        int i15 = org.telegram.ui.ActionBar.g6.f23165j9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23157j1, org.telegram.ui.ActionBar.g6.f23176k1, org.telegram.ui.ActionBar.g6.Z0}, null, org.telegram.ui.ActionBar.g6.f23020b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.f23147i9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.f23111g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.f23218m9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, -1, null, org.telegram.ui.ActionBar.g6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23368v0, null, null, org.telegram.ui.ActionBar.g6.f23323s9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23351u0, null, null, org.telegram.ui.ActionBar.g6.f23342t9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.f23360u9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.f23376v9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.f23394w9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23400x0, null, null, org.telegram.ui.ActionBar.g6.f23408x9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.f23426y9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23139i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.e6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23085f1}, null, org.telegram.ui.ActionBar.g6.f23444z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23031c1}, null, org.telegram.ui.ActionBar.g6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23210m1}, null, org.telegram.ui.ActionBar.g6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23056d9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23039c9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 524288, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23091f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 524304, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
        org.telegram.ui.Components.iw0 iw0Var = this.f38938c;
        arrayList.add(new org.telegram.ui.ActionBar.i6(iw0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(iw0Var.f29506e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23423y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final pf.e0 e0Var, final boolean z10, String str, boolean z11) {
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j10 + j11 + j12 + j13 + (e0Var == null ? -1 : e0Var.d) + str2 + z10;
        String str4 = this.f38956x;
        boolean z12 = str4 != null && str4.equals(str3);
        boolean z13 = !z12 && z11;
        this.f38957y = e0Var;
        this.A = j10;
        this.B = j11;
        this.D = j12;
        this.C = j13;
        this.E = str2;
        this.F = z10;
        s00 s00Var = this.f38941e;
        if (s00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(s00Var);
        }
        w5 w5Var = this.f38937b0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (z12 && z11) {
            return;
        }
        ArrayList arrayList = this.W;
        final boolean z14 = z12;
        ArrayList arrayList2 = this.V;
        org.telegram.ui.Components.iw0 iw0Var = this.f38938c;
        ArrayList arrayList3 = this.f38943f;
        if (z13 || (e0Var == null && j11 == 0 && j10 == 0 && j12 == 0 && j13 == 0)) {
            arrayList3.clear();
            this.f38951n.clear();
            this.f38953r.clear();
            this.I = true;
            iw0Var.setVisibility(0);
            org.telegram.ui.Components.yk0 yk0Var = this.d;
            if (yk0Var != null) {
                yk0Var.l();
            }
            this.L++;
            hh.f1 f1Var = this.f38936b;
            if (f1Var.getPinnedHeader() != null) {
                f1Var.getPinnedHeader().setAlpha(0.0f);
            }
            arrayList2.clear();
            arrayList.clear();
            if (!z13) {
                return;
            }
        } else if (z11 && !arrayList3.isEmpty()) {
            return;
        } else {
            arrayList3 = arrayList3;
        }
        this.I = true;
        org.telegram.ui.Components.yk0 yk0Var2 = this.d;
        if (yk0Var2 != null) {
            yk0Var2.l();
        }
        if (!z14) {
            w5Var.run();
            iw0Var.e(true, !z11);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList.clear();
            arrayList2.clear();
            z00 z00Var = this.f38940d0;
            if (z00Var != null) {
                ((mv) z00Var).i(false, null, null, false);
            }
        }
        final int i10 = this.L + 1;
        this.L = i10;
        final int i11 = UserConfig.selectedAccount;
        ?? r10 = new Runnable() {
            @Override
            public final void run() throws Throwable {
                int i12;
                ?? r11;
                int i13;
                Object obj;
                final i10 i10Var = this.f42381a;
                ArrayList arrayList4 = i10Var.f38943f;
                final long j14 = j10;
                long j15 = j11;
                final String str5 = str2;
                final pf.e0 e0Var2 = e0Var;
                int i14 = i11;
                long j16 = j12;
                long j17 = j13;
                final boolean z15 = z14;
                long j18 = j16;
                ArrayList<Object> arrayList5 = null;
                if (j14 == 0 || j15 != 0) {
                    boolean zIsEmpty = TextUtils.isEmpty(str5);
                    boolean z16 = z10;
                    if (zIsEmpty) {
                        i12 = 20;
                        r11 = z16;
                    } else {
                        ArrayList<Object> arrayList6 = new ArrayList<>();
                        ArrayList<CharSequence> arrayList7 = new ArrayList<>();
                        ArrayList<TLRPC.User> arrayList8 = new ArrayList<>();
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                        i12 = 20;
                        messagesStorage.localSearch(0, str5, arrayList6, arrayList7, arrayList8, null, z16 ? 1 : 0);
                        r11 = z16 ? 1 : 0;
                        arrayList5 = arrayList6;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = i12;
                    tL_messages_searchGlobal.f22491q = str5;
                    tL_messages_searchGlobal.filter = e0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var2.f45782e;
                    tL_messages_searchGlobal.community = MessagesController.getInstance(i14).getInputChannel(j15);
                    if (j18 > 0) {
                        tL_messages_searchGlobal.min_date = (int) (j18 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_searchGlobal.max_date = (int) (j17 / 1000);
                    }
                    if (z15 && str5.equals(i10Var.f38955w) && !arrayList4.isEmpty()) {
                        i13 = 1;
                        MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList4);
                        tL_messages_searchGlobal.offset_id = messageObject.getId();
                        tL_messages_searchGlobal.offset_rate = i10Var.v;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i14).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                    } else {
                        i13 = 1;
                        tL_messages_searchGlobal.offset_rate = 0;
                        tL_messages_searchGlobal.offset_id = 0;
                        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal.flags |= i13;
                    tL_messages_searchGlobal.folder_id = r11;
                    obj = tL_messages_searchGlobal;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.f22489q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = e0Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var2.f45782e;
                    tL_messages_search.peer = AccountInstance.getInstance(i14).getMessagesController().getInputPeer(j14);
                    if (j18 > 0) {
                        tL_messages_search.min_date = (int) (j18 / 1000);
                    }
                    if (j17 > 0) {
                        tL_messages_search.max_date = (int) (j17 / 1000);
                    }
                    if (z15 && str5.equals(i10Var.f38955w) && !arrayList4.isEmpty()) {
                        tL_messages_search.offset_id = ((MessageObject) i0.a.i(1, arrayList4)).getId();
                    } else {
                        tL_messages_search.offset_id = 0;
                    }
                    obj = tL_messages_search;
                    i14 = i14;
                    j18 = j18;
                }
                i10Var.f38955w = str5;
                i10Var.f38956x = str3;
                final ArrayList arrayList9 = new ArrayList();
                pf.g0.y1(i10Var.f38955w, arrayList9);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
                final int i15 = i10;
                final ArrayList<Object> arrayList10 = arrayList5;
                final int i16 = i14;
                final long j19 = j18;
                connectionsManager.sendRequestTyped(obj, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        final ArrayList arrayList11 = new ArrayList();
                        final int i17 = i16;
                        final String str6 = str5;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i18 = 0; i18 < size; i18++) {
                                MessageObject messageObject2 = new MessageObject(i17, messages_messages.messages.get(i18), false, true);
                                messageObject2.setQuery(str6);
                                arrayList11.add(messageObject2);
                            }
                        }
                        final i10 i10Var2 = i10Var;
                        final int i19 = i15;
                        final boolean z17 = z15;
                        final pf.e0 e0Var3 = e0Var2;
                        final long j20 = j14;
                        final long j21 = j19;
                        final ArrayList arrayList12 = arrayList10;
                        final ArrayList arrayList13 = arrayList9;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                boolean z18;
                                boolean z19;
                                ArrayList arrayList14;
                                String string;
                                ArrayList arrayList15;
                                SparseArray sparseArray;
                                char c10;
                                char c11;
                                i10 i10Var3 = i10Var2;
                                b10 b10Var = i10Var3.P;
                                g10 g10Var = i10Var3.Q;
                                ArrayList arrayList16 = i10Var3.f38951n;
                                SparseArray sparseArray2 = i10Var3.h;
                                ArrayList arrayList17 = i10Var3.W;
                                HashMap map = i10Var3.f38953r;
                                ArrayList arrayList18 = i10Var3.f38943f;
                                ArrayList arrayList19 = i10Var3.V;
                                ?? r12 = i10Var3.f38936b;
                                org.telegram.ui.Components.iw0 iw0Var2 = i10Var3.f38938c;
                                if (i19 != i10Var3.L) {
                                    return;
                                }
                                i10Var3.I = false;
                                if (tL_error != null) {
                                    eh.s sVar = iw0Var2.d;
                                    org.telegram.ui.Components.p80 p80Var = iw0Var2.f29506e;
                                    sVar.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                    p80Var.setVisibility(0);
                                    p80Var.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    iw0Var2.e(false, true);
                                    return;
                                }
                                iw0Var2.e(false, true);
                                eh.s sVar2 = iw0Var2.d;
                                org.telegram.ui.Components.p80 p80Var2 = iw0Var2.f29506e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                i10Var3.v = messages_messages2.next_rate;
                                int i20 = i17;
                                MessagesStorage.getInstance(i20).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                                MessagesController.getInstance(i20).putUsers(messages_messages2.users, false);
                                MessagesController.getInstance(i20).putChats(messages_messages2.chats, false);
                                boolean z20 = z17;
                                if (!z20) {
                                    arrayList18.clear();
                                    sparseArray2.clear();
                                    arrayList16.clear();
                                    map.clear();
                                }
                                i10Var3.K = messages_messages2.count;
                                String str7 = str6;
                                i10Var3.M = str7;
                                ArrayList arrayList20 = arrayList11;
                                int size2 = arrayList20.size();
                                int i21 = 0;
                                while (i21 < size2) {
                                    boolean z21 = z20;
                                    MessageObject messageObject3 = (MessageObject) arrayList20.get(i21);
                                    ArrayList arrayList21 = arrayList20;
                                    ArrayList arrayList22 = (ArrayList) map.get(messageObject3.monthKey);
                                    if (arrayList22 == null) {
                                        arrayList22 = new ArrayList();
                                        map.put(messageObject3.monthKey, arrayList22);
                                        arrayList16.add(messageObject3.monthKey);
                                    }
                                    arrayList22.add(messageObject3);
                                    arrayList18.add(messageObject3);
                                    sparseArray2.put(messageObject3.getId(), messageObject3);
                                    if (PhotoViewer.t1().Q1()) {
                                        PhotoViewer photoViewerT1 = PhotoViewer.t1();
                                        int i22 = i10Var3.N;
                                        arrayList15 = arrayList16;
                                        SparseArray[] sparseArrayArr = photoViewerT1.V6;
                                        ArrayList arrayList23 = photoViewerT1.U6;
                                        sparseArray = sparseArray2;
                                        if (i22 == photoViewerT1.f35600c) {
                                            if (sparseArrayArr[0].indexOfKey(messageObject3.getId()) < 0) {
                                                if (photoViewerT1.M5) {
                                                    arrayList23.add(messageObject3);
                                                    c11 = 0;
                                                } else {
                                                    c11 = 0;
                                                    arrayList23.add(0, messageObject3);
                                                }
                                                c10 = 0;
                                                sparseArrayArr[c11].put(messageObject3.getId(), messageObject3);
                                            } else {
                                                c10 = 0;
                                            }
                                            photoViewerT1.L5[c10] = arrayList23.size() == photoViewerT1.F5;
                                            photoViewerT1.D2();
                                        }
                                    } else {
                                        arrayList15 = arrayList16;
                                        sparseArray = sparseArray2;
                                    }
                                    i21++;
                                    arrayList20 = arrayList21;
                                    z20 = z21;
                                    arrayList16 = arrayList15;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z22 = z20;
                                if (arrayList18.size() > i10Var3.K) {
                                    i10Var3.K = arrayList18.size();
                                }
                                i10Var3.J = arrayList18.size() >= i10Var3.K;
                                boolean zIsEmpty2 = arrayList18.isEmpty();
                                pf.e0 e0Var4 = e0Var3;
                                if (zIsEmpty2) {
                                    if (e0Var4 == null) {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        p80Var2.setVisibility(8);
                                    } else if (TextUtils.isEmpty(i10Var3.M) && j20 == 0 && j21 == 0) {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                        int i23 = e0Var4.d;
                                        if (i23 == 1) {
                                            string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles);
                                        } else if (i23 == 0) {
                                            string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMedia);
                                        } else if (i23 == 2) {
                                            string = LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleLinks);
                                        } else {
                                            string = i23 == 3 ? LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleMusic) : LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleVoice);
                                        }
                                        p80Var2.setVisibility(0);
                                        p80Var2.setText(string);
                                    } else {
                                        sVar2.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                        p80Var2.setVisibility(0);
                                        p80Var2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                    }
                                }
                                if (e0Var4 != null) {
                                    int i24 = e0Var4.d;
                                    if (i24 != 0) {
                                        if (i24 == 1) {
                                            i10Var3.d = i10Var3.R;
                                        } else if (i24 == 2) {
                                            i10Var3.d = i10Var3.S;
                                        } else if (i24 == 3) {
                                            i10Var3.d = i10Var3.T;
                                        } else if (i24 == 5) {
                                            i10Var3.d = i10Var3.U;
                                        }
                                    } else if (TextUtils.isEmpty(i10Var3.M)) {
                                        i10Var3.d = g10Var;
                                    } else {
                                        i10Var3.d = b10Var;
                                    }
                                } else {
                                    i10Var3.d = b10Var;
                                }
                                f2.q0 adapter = r12.getAdapter();
                                org.telegram.ui.Components.yk0 yk0Var3 = i10Var3.d;
                                if (adapter != yk0Var3) {
                                    r12.setAdapter(yk0Var3);
                                }
                                if (z22) {
                                    z18 = false;
                                } else {
                                    arrayList19.clear();
                                    ArrayList arrayList24 = arrayList12;
                                    ArrayList arrayList25 = arrayList19;
                                    if (arrayList24 != null) {
                                        arrayList25.addAll(arrayList24);
                                    }
                                    if (str7.length() < 3 || (!LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str7) && !"saved messages".startsWith(str7))) {
                                        z19 = false;
                                        break;
                                    }
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= arrayList25.size()) {
                                            z19 = false;
                                            arrayList25.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                            break;
                                        }
                                        if (arrayList25.get(i25) instanceof TLRPC.User) {
                                            arrayList14 = arrayList25;
                                            if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22527id == ((TLRPC.User) arrayList25.get(i25)).f22527id) {
                                                arrayList25 = arrayList14;
                                                z19 = false;
                                                break;
                                            }
                                        } else {
                                            arrayList14 = arrayList25;
                                        }
                                        i25++;
                                        arrayList25 = arrayList14;
                                    }
                                    arrayList17.clear();
                                    arrayList17.addAll(arrayList13);
                                    i10Var3.f38935a0 = z19;
                                    if (str7.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str7) || "archive".startsWith(str7))) {
                                        i10Var3.f38935a0 = true;
                                    }
                                    z00 z00Var2 = i10Var3.f38940d0;
                                    z18 = z19;
                                    if (z00Var2 != null) {
                                        ((mv) z00Var2).i(TextUtils.isEmpty(i10Var3.M), arrayList25, arrayList17, i10Var3.f38935a0);
                                        z18 = z19;
                                    }
                                }
                                View view = null;
                                int iR = -1;
                                for (?? r13 = z18; r13 < size2; r13++) {
                                    View childAt = r12.getChildAt(r13);
                                    if (childAt instanceof org.telegram.ui.Components.h00) {
                                        iR = RecyclerView.R(childAt);
                                        view = childAt;
                                    }
                                }
                                if (view != null) {
                                    r12.removeView(view);
                                }
                                if ((i10Var3.f38945g0.getVisibility() == 0 && r12.getChildCount() == 0) || (r12.getAdapter() != g10Var && view != null)) {
                                    i10Var3.getViewTreeObserver().addOnPreDrawListener(new pq(i10Var3, (org.telegram.ui.Components.h00) view, iR, 3));
                                }
                                i10Var3.d.l();
                            }
                        });
                    }
                });
            }
        };
        this.f38941e = r10;
        AndroidUtilities.runOnUIThread(r10, (!z14 || arrayList3.isEmpty()) ? 350L : 0L);
        w00 w00Var = this.f38945g0;
        if (e0Var == null) {
            w00Var.setViewType(1);
            return;
        }
        int i12 = e0Var.d;
        if (i12 == 0) {
            if (TextUtils.isEmpty(this.E)) {
                w00Var.setViewType(2);
                return;
            } else {
                w00Var.setViewType(1);
                return;
            }
        }
        if (i12 == 1) {
            w00Var.setViewType(3);
            return;
        }
        if (i12 == 3 || i12 == 5) {
            w00Var.setViewType(4);
        } else if (i12 == 2) {
            w00Var.setViewType(5);
        }
    }

    public final void i(z00 z00Var, boolean z10) {
        this.f38940d0 = z00Var;
        if (!z10 || z00Var == null) {
            return;
        }
        ArrayList arrayList = this.V;
        if (arrayList.isEmpty()) {
            return;
        }
        ((mv) z00Var).i(false, arrayList, this.W, this.f38935a0);
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f38952n0 = z10;
        setPadding(0, i10, 0, i11);
        hh.f1 f1Var = this.f38936b;
        if (z10) {
            f1Var.o1(0, i10, 0, i11);
        } else {
            f1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f38952n0 = false;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.m0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.m0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.yk0 yk0Var;
        int i12 = this.f38954s;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            this.f38954s = 6;
        } else {
            this.f38954s = 3;
        }
        if (i12 != this.f38954s && (yk0Var = this.d) == this.Q) {
            this.f38952n0 = true;
            yk0Var.l();
            this.f38952n0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38952n0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(jg.a aVar) {
        mg.d dVar = new mg.d(null);
        dVar.f18050e = new ng.a(3);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f18051f = 1.0f;
        dVar.h = 1.0f;
        jh.a3 a3Var = this.f38947i0;
        lg.d dVarC = aVar.c(a3Var, dVar, false);
        a3Var.f13032c = dVarC;
        dVarC.p(AndroidUtilities.dp(11.5f));
        ((lg.d) a3Var.f13032c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.fn0 fn0Var) {
        this.f38942e0 = fn0Var;
    }

    public void setUiCallback(h10 h10Var) {
        this.f38949k0 = h10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f38950l0 = z10;
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
