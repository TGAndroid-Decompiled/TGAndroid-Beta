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
public final class h10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public static final SpannableStringBuilder[] f38717o0 = new SpannableStringBuilder[3];
    public long A;
    public long B;
    public long C;
    public long D;
    public String E;
    public boolean F;
    public final Activity G;
    public final org.telegram.ui.ActionBar.o2 H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public String M;
    public int N;
    public final z00 O;
    public final a10 P;
    public final f10 Q;
    public final c10 R;
    public final e10 S;
    public final c10 T;
    public final c10 U;
    public final ArrayList V;
    public final ArrayList W;
    public final vd.a f38718a;
    public boolean f38719a0;
    public final jh.e1 f38720b;
    public final w5 f38721b0;
    public final org.telegram.ui.Components.qw0 f38722c;
    public final u00 f38723c0;
    public org.telegram.ui.Components.il0 d;
    public y00 f38724d0;
    public r00 f38725e;
    public org.telegram.ui.Components.pn0 f38726e0;
    public final ArrayList f38727f;
    public final f2.j0 f38728f0;
    public final v00 f38729g0;
    public final SparseArray h;
    public final AnimationNotificationsLocker f38730h0;
    public final lh.z2 f38731i0;
    public final q00 f38732j0;
    public g10 f38733k0;
    public boolean f38734l0;
    public int m0;
    public final ArrayList f38735n;
    public boolean f38736n0;
    public final HashMap f38737r;
    public int f38738s;
    public int v;
    public String f38739w;
    public String f38740x;
    public rf.f0 f38741y;

    public h10(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        this.f38718a = new vd.a(0, this, org.telegram.ui.Components.jr.h, 380L, false);
        this.f38727f = new ArrayList();
        this.h = new SparseArray();
        this.f38735n = new ArrayList();
        this.f38737r = new HashMap();
        this.f38738s = 3;
        this.O = new z00(0, 0L);
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f38721b0 = new w5(this, 4);
        this.f38723c0 = new u00(this);
        this.f38730h0 = new AnimationNotificationsLocker();
        this.f38732j0 = new q00(this, 0);
        this.H = o2Var;
        Activity parentActivity = o2Var.getParentActivity();
        this.G = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        jh.e1 e1Var = new jh.e1(this, parentActivity, 27);
        this.f38720b = e1Var;
        e1Var.setOnItemClickListener(new j(this, 11));
        e1Var.setOnItemLongClickListener(new h(this, 16));
        f2.j0 j0Var = new f2.j0();
        this.f38728f0 = j0Var;
        e1Var.setLayoutManager(j0Var);
        v00 v00Var = new v00(this, parentActivity, 0);
        this.f38729g0 = v00Var;
        addView(v00Var);
        addView(e1Var);
        e1Var.setSectionsType(2);
        e1Var.setSkipDrawSection(true);
        e1Var.setOnScrollListener(new w00(this));
        lh.z2 z2Var = new lh.z2(parentActivity);
        this.f38731i0 = z2Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) z2Var.d, formatDateChat)) {
            z2Var.d = formatDateChat;
            ((org.telegram.ui.Components.n6) z2Var.f16451b).q(formatDateChat, true, true);
        }
        addView(z2Var, i7.f6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.P = new a10(this);
        this.Q = new f10(this, getContext());
        this.R = new c10(this, getContext(), 1);
        this.S = new e10(this, getContext());
        this.T = new c10(this, getContext(), 4);
        this.U = new c10(this, getContext(), 2);
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(parentActivity, v00Var, 1, null);
        this.f38722c = qw0Var;
        addView(qw0Var);
        e1Var.setEmptyView(qw0Var);
        qw0Var.setVisibility(8);
        b();
    }

    public static void a(h10 h10Var, MessageObject messageObject, View view, int i10) {
        if (!h10Var.f38733k0.f()) {
            h10Var.f38733k0.a();
        }
        if (h10Var.f38733k0.f()) {
            h10Var.f38733k0.d(messageObject, view, i10);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z10) {
        return d(messageObject, z10, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z10, int i10, TextPaint textPaint) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        TLRPC.TL_forumTopic findTopic;
        Paint.FontMetricsInt fontMetricsInt;
        TLRPC.TL_forumTopic findTopic2;
        int i11;
        int i12;
        if (messageObject != null && messageObject.messageOwner != null) {
            if (messageObject.isQuickReply()) {
                sf.r1 c3 = sf.s1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c3 != null) {
                    return c3.f47936b;
                }
                return "";
            } else if (messageObject.isSponsored()) {
                if (messageObject.sponsoredCanReport) {
                    return LocaleController.getString(R.string.SponsoredMessageAd);
                }
                if (messageObject.sponsoredRecommended) {
                    return LocaleController.getString(R.string.SponsoredMessage2Recommended);
                }
                return LocaleController.getString(R.string.SponsoredMessage2);
            } else {
                SpannableStringBuilder[] spannableStringBuilderArr = f38717o0;
                if (spannableStringBuilderArr[i10] == null) {
                    spannableStringBuilderArr[i10] = new SpannableStringBuilder(">");
                    if (i10 == 0) {
                        i11 = R.drawable.attach_arrow_right;
                    } else if (i10 == 1) {
                        i11 = R.drawable.msg_mini_arrow_mediathin;
                    } else if (i10 == 2) {
                        i11 = R.drawable.msg_mini_arrow_mediabold;
                    } else {
                        return "";
                    }
                    Drawable mutate = ApplicationLoader.applicationContext.getDrawable(i11).mutate();
                    if (i10 == 0) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        iqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 0);
                }
                TLRPC.Message message = messageObject.messageOwner;
                CharSequence charSequence = null;
                Paint.FontMetricsInt fontMetricsInt2 = null;
                Paint.FontMetricsInt fontMetricsInt3 = null;
                Paint.FontMetricsInt fontMetricsInt4 = null;
                if (message.saved_peer_id != null) {
                    if (messageObject.getSavedDialogId() >= 0) {
                        user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.getSavedDialogId()));
                        chat = null;
                    } else if (messageObject.getSavedDialogId() < 0) {
                        chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getSavedDialogId()));
                        user2 = null;
                        chat2 = null;
                    } else {
                        user2 = null;
                        chat = null;
                    }
                    chat2 = chat;
                } else {
                    if (message.from_id.user_id != 0) {
                        user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                    } else {
                        user = null;
                    }
                    if (messageObject.messageOwner.from_id.chat_id != 0) {
                        chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id));
                    } else {
                        chat = null;
                    }
                    if (chat == null) {
                        if (messageObject.messageOwner.from_id.channel_id != 0) {
                            chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id));
                        } else {
                            chat = null;
                        }
                    }
                    if (messageObject.messageOwner.peer_id.channel_id != 0) {
                        chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id));
                    } else {
                        chat2 = null;
                    }
                    if (chat2 == null) {
                        if (messageObject.messageOwner.peer_id.chat_id != 0) {
                            chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id));
                        } else {
                            chat2 = null;
                        }
                    }
                    if (!ChatObject.isChannelAndNotMegaGroup(chat2) && !z10) {
                        user2 = user;
                        chat2 = null;
                    } else {
                        user2 = user;
                    }
                }
                if (user2 != null && chat2 != null) {
                    CharSequence charSequence2 = chat2.title;
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f22392id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence2 = yf.d.j(findTopic2, null, null);
                    }
                    if (textPaint == null) {
                        fontMetricsInt = null;
                    } else {
                        fontMetricsInt = textPaint.getFontMetricsInt();
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence2, fontMetricsInt, false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    String firstName = UserObject.getFirstName(user2);
                    if (textPaint != null) {
                        fontMetricsInt2 = textPaint.getFontMetricsInt();
                    }
                    spannableStringBuilder2.append(Emoji.replaceEmoji(firstName, fontMetricsInt2, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i10]).append((char) 8202).append(replaceEmoji);
                    charSequence = spannableStringBuilder2;
                } else if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    if (textPaint != null) {
                        fontMetricsInt3 = textPaint.getFontMetricsInt();
                    }
                    charSequence = Emoji.replaceEmoji(userName, fontMetricsInt3, false);
                } else if (chat != null) {
                    CharSequence charSequence3 = chat.title;
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f22392id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence3 = yf.d.j(findTopic, null, null);
                    }
                    if (textPaint != null) {
                        fontMetricsInt4 = textPaint.getFontMetricsInt();
                    }
                    charSequence = Emoji.replaceEmoji(charSequence3, fontMetricsInt4, false);
                }
                if (charSequence != null) {
                    return charSequence;
                }
                return "";
            }
        }
        return "";
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            b();
        }
    }

    public final void b() {
        int i10;
        float f9 = this.f38718a.f49505e;
        float f10 = (1.0f - f9) * (-AndroidUtilities.dp(24.0f));
        lh.z2 z2Var = this.f38731i0;
        z2Var.setTranslationY(f10);
        z2Var.setAlpha(f9);
        if (f9 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        z2Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            jh.e1 e1Var = this.f38720b;
            int childCount = e1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (e1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) e1Var.getChildAt(i12)).b0(0, true);
                }
                e1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r11, java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f38733k0.f()) {
                this.f38733k0.d(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.p2) {
                this.f38733k0.c(messageObject);
            } else {
                int i12 = this.f38741y.d;
                u00 u00Var = this.f38723c0;
                ArrayList arrayList = this.f38727f;
                String str2 = null;
                org.telegram.ui.ActionBar.o2 o2Var = this.H;
                if (i12 == 0) {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, u00Var);
                    this.N = PhotoViewer.t1().f35665c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (g7Var.C) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.t1().K2(null, o2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList n10 = org.telegram.messenger.x3.n(messageObject);
                                        PhotoViewer.t1().K2(null, o2Var, null);
                                        PhotoViewer.t1().a2(n10, 0, 0L, 0L, 0L, u00Var);
                                        this.N = PhotoViewer.t1().f35665c;
                                        return;
                                    }
                                    PhotoViewer.t1().K2(null, o2Var, null);
                                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, u00Var);
                                    this.N = PhotoViewer.t1().f35665c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.G, o2Var);
                            } else if (!g7Var.B) {
                                MessageObject message = g7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                g7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                g7Var.f(true);
                            }
                        }
                    } else if (i12 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                                        o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.mu.I(this.H, messageObject, this.f38723c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.j7) view).A;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.c5.q0(this.H, str, true, true);
        } else {
            ye.d.s(this.G, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        f fVar = new f(this, 14);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23133h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        jh.e1 e1Var = this.f38720b;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 2048, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23153i7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f23190k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.f7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f23096f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4, new Class[]{org.telegram.ui.Cells.f7.class}, org.telegram.ui.ActionBar.g6.f23114g3, null, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 32, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 524304, new Class[]{org.telegram.ui.Cells.k7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 524288, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23395w0, null, null, org.telegram.ui.ActionBar.g6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23427y0, null, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23004a1}, null, org.telegram.ui.ActionBar.g6.f23011a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.f23112g1, org.telegram.ui.ActionBar.g6.f23129h1};
        int i15 = org.telegram.ui.ActionBar.g6.f23173j9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23165j1, org.telegram.ui.ActionBar.g6.f23184k1, org.telegram.ui.ActionBar.g6.Z0}, null, org.telegram.ui.ActionBar.g6.f23030b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.f23155i9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.f23120g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.f23226m9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, -1, null, org.telegram.ui.ActionBar.g6.f23281p9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23377v0, null, null, org.telegram.ui.ActionBar.g6.f23330s9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23359u0, null, null, org.telegram.ui.ActionBar.g6.f23349t9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.f23368u9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.f23386v9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.f23404w9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23413x0, null, null, org.telegram.ui.ActionBar.g6.f23421x9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.f23435y9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23147i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class, org.telegram.ui.Cells.f6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23094f1}, null, org.telegram.ui.ActionBar.g6.f23453z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23041c1}, null, org.telegram.ui.ActionBar.g6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23218m1}, null, org.telegram.ui.ActionBar.g6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23065d9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23047c9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.p2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 524288, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23100f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 524304, new Class[]{org.telegram.ui.Cells.s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
        org.telegram.ui.Components.qw0 qw0Var = this.f38722c;
        arrayList.add(new org.telegram.ui.ActionBar.i6(qw0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(qw0Var.f32122e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23433y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final rf.f0 f0Var, final boolean z10, String str, boolean z11) {
        final String str2;
        int i10;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (f0Var == null) {
            i10 = -1;
        } else {
            i10 = f0Var.d;
        }
        final String str3 = j10 + j11 + j12 + j13 + i10 + str2 + z10;
        String str4 = this.f38740x;
        if (str4 != null && str4.equals(str3)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f38741y = f0Var;
        this.A = j10;
        this.B = j11;
        this.D = j12;
        this.C = j13;
        this.E = str2;
        this.F = z10;
        r00 r00Var = this.f38725e;
        if (r00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r00Var);
        }
        w5 w5Var = this.f38721b0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.W;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.V;
            org.telegram.ui.Components.qw0 qw0Var = this.f38722c;
            ArrayList arrayList4 = this.f38727f;
            long j14 = 0;
            if (!z13 && (f0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f38735n.clear();
                this.f38737r.clear();
                this.I = true;
                qw0Var.setVisibility(0);
                org.telegram.ui.Components.il0 il0Var = this.d;
                if (il0Var != null) {
                    il0Var.l();
                }
                this.L++;
                jh.e1 e1Var = this.f38720b;
                if (e1Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    e1Var.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z13) {
                    return;
                }
            }
            this.I = true;
            org.telegram.ui.Components.il0 il0Var2 = this.d;
            if (il0Var2 != null) {
                il0Var2.l();
            }
            if (!z14) {
                w5Var.run();
                qw0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                y00 y00Var = this.f38724d0;
                if (y00Var != null) {
                    ((kv) y00Var).i(false, null, null, false);
                }
            }
            final int i11 = this.L + 1;
            this.L = i11;
            final int i12 = UserConfig.selectedAccount;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i13;
                    long j15;
                    long j16;
                    int i14;
                    ?? r10;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final h10 h10Var = h10.this;
                    ArrayList arrayList5 = h10Var.f38727f;
                    final long j17 = j10;
                    long j18 = j11;
                    final String str5 = str2;
                    final rf.f0 f0Var2 = f0Var;
                    int i16 = i12;
                    long j19 = j12;
                    long j20 = j13;
                    final boolean z15 = z14;
                    ArrayList<Object> arrayList6 = null;
                    if (j17 != 0 && j18 == 0) {
                        ?? tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f22501q = str5;
                        tL_messages_search.limit = 20;
                        if (f0Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = f0Var2.f47223e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i16).getMessagesController().getInputPeer(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z15 && str5.equals(h10Var.f38739w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) j7.l1.i(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        tL_messages_searchGlobal = tL_messages_search;
                        i13 = i16;
                        j16 = j19;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str5);
                        boolean z16 = z10;
                        if (!isEmpty) {
                            j15 = j20;
                            ArrayList<Object> arrayList7 = new ArrayList<>();
                            ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                            ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                            j16 = j19;
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                            i13 = i16;
                            i14 = 20;
                            messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                            r10 = z16 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i13 = i16;
                            j15 = j20;
                            j16 = j19;
                            i14 = 20;
                            r10 = z16;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f22503q = str5;
                        if (f0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = f0Var2.f47223e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i13).getInputChannel(j18);
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j16 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z15 && str5.equals(h10Var.f38739w) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = h10Var.v;
                            tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i13).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                        } else {
                            i15 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i15;
                        tL_messages_searchGlobal2.folder_id = r10;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    h10Var.f38739w = str5;
                    h10Var.f38740x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    rf.h0.y1(h10Var.f38739w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final int i17 = i11;
                    final ArrayList<Object> arrayList11 = arrayList6;
                    final int i18 = i13;
                    final long j21 = j16;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i19 = i18;
                            final String str6 = str5;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i20 = 0; i20 < size; i20++) {
                                    MessageObject messageObject2 = new MessageObject(i19, messages_messages.messages.get(i20), false, true);
                                    messageObject2.setQuery(str6);
                                    arrayList12.add(messageObject2);
                                }
                            }
                            final h10 h10Var2 = h10.this;
                            final int i21 = i17;
                            final boolean z17 = z15;
                            final rf.f0 f0Var3 = f0Var2;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t00.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f38725e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            v00 v00Var = this.f38729g0;
            if (f0Var == null) {
                v00Var.setViewType(1);
                return;
            }
            int i13 = f0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.E)) {
                    v00Var.setViewType(1);
                } else {
                    v00Var.setViewType(2);
                }
            } else if (i13 == 1) {
                v00Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    v00Var.setViewType(5);
                }
            } else {
                v00Var.setViewType(4);
            }
        }
    }

    public final void i(y00 y00Var, boolean z10) {
        this.f38724d0 = y00Var;
        if (z10 && y00Var != null) {
            ArrayList arrayList = this.V;
            if (!arrayList.isEmpty()) {
                ((kv) y00Var).i(false, arrayList, this.W, this.f38719a0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f38736n0 = z10;
        setPadding(0, i10, 0, i11);
        jh.e1 e1Var = this.f38720b;
        if (z10) {
            e1Var.o1(0, i10, 0, i11);
        } else {
            e1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f38736n0 = false;
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
        org.telegram.ui.Components.il0 il0Var;
        int i12 = this.f38738s;
        if (AndroidUtilities.isTablet()) {
            this.f38738s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f38738s = 6;
        } else {
            this.f38738s = 3;
        }
        if (i12 != this.f38738s && (il0Var = this.d) == this.Q) {
            this.f38736n0 = true;
            il0Var.l();
            this.f38736n0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38736n0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(lg.a aVar) {
        og.d dVar = new og.d(null);
        dVar.f19560e = new xx0(12);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f19561f = 1.0f;
        dVar.h = 1.0f;
        lh.z2 z2Var = this.f38731i0;
        ng.d c3 = aVar.c(z2Var, dVar, false);
        z2Var.f16452c = c3;
        c3.p(AndroidUtilities.dp(11.5f));
        ((ng.d) z2Var.f16452c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.pn0 pn0Var) {
        this.f38726e0 = pn0Var;
    }

    public void setUiCallback(g10 g10Var) {
        this.f38733k0 = g10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f38734l0 = z10;
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
