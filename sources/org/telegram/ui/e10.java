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
public final class e10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final SpannableStringBuilder[] f36494s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.n2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final w00 S;
    public final x00 T;
    public final c10 U;
    public final z00 V;
    public final b10 W;
    public final ne.b f36495a;
    public final z00 f36496a0;
    public final ai.u1 f36497b;
    public final z00 f36498b0;
    public final org.telegram.ui.Components.tx0 f36499c;
    public final ArrayList f36500c0;
    public org.telegram.ui.Components.im0 d;
    public final ArrayList f36501d0;
    public o00 e;
    public boolean f36502e0;
    public final ArrayList f36503f;
    public final a6 f36504f0;
    public final r00 f36505g0;
    public final SparseArray h;
    public v00 f36506h0;
    public org.telegram.ui.Components.so0 f36507i0;
    public final s4.b0 f36508j0;
    public final s00 f36509k0;
    public final AnimationNotificationsLocker f36510l0;
    public final ci.i3 m0;
    public final ArrayList f36511n;
    public final dz f36512n0;
    public d10 f36513o0;
    public boolean f36514p0;
    public int f36515q0;
    public final HashMap f36516r;
    public boolean f36517r0;
    public int f36518s;
    public int v;
    public String f36519w;
    public String f36520x;
    public hg.o0 f36521y;

    public e10(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        this.f36495a = new ne.b(0, this, org.telegram.ui.Components.bs.h, 380L, false);
        this.f36503f = new ArrayList();
        this.h = new SparseArray();
        this.f36511n = new ArrayList();
        this.f36516r = new HashMap();
        this.f36518s = 3;
        this.S = new w00(0, 0L);
        this.f36500c0 = new ArrayList();
        this.f36501d0 = new ArrayList();
        this.f36504f0 = new a6(this, 4);
        this.f36505g0 = new r00(this);
        this.f36510l0 = new AnimationNotificationsLocker();
        this.f36512n0 = new dz(this, 1);
        this.L = n2Var;
        Activity parentActivity = n2Var.getParentActivity();
        this.K = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
        ai.u1 u1Var = new ai.u1(this, parentActivity, 29);
        this.f36497b = u1Var;
        u1Var.setOnItemClickListener(new i(this, 12));
        u1Var.setOnItemLongClickListener(new g(this, 16));
        s4.b0 b0Var = new s4.b0();
        this.f36508j0 = b0Var;
        u1Var.setLayoutManager(b0Var);
        s00 s00Var = new s00(this, parentActivity, 0);
        this.f36509k0 = s00Var;
        addView(s00Var);
        addView(u1Var);
        u1Var.setSectionsType(2);
        u1Var.setSkipDrawSection(true);
        u1Var.setOnScrollListener(new t00(this));
        ci.i3 i3Var = new ci.i3(parentActivity);
        this.m0 = i3Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) i3Var.d, formatDateChat)) {
            i3Var.d = formatDateChat;
            ((org.telegram.ui.Components.p6) i3Var.f5485b).t(formatDateChat, true, true);
        }
        addView(i3Var, w7.z5.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new x00(this);
        this.U = new c10(this, getContext());
        this.V = new z00(this, getContext(), 1);
        this.W = new b10(this, getContext());
        this.f36496a0 = new z00(this, getContext(), 4);
        this.f36498b0 = new z00(this, getContext(), 2);
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(parentActivity, s00Var, 1, null);
        this.f36499c = tx0Var;
        addView(tx0Var);
        u1Var.setEmptyView(tx0Var);
        tx0Var.setVisibility(8);
        b();
    }

    public static void a(e10 e10Var, MessageObject messageObject, View view, int i10) {
        if (!e10Var.f36513o0.g()) {
            e10Var.f36513o0.a();
        }
        if (e10Var.f36513o0.g()) {
            e10Var.f36513o0.d(messageObject, view, i10);
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
                ig.z1 c10 = ig.a2.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c10 != null) {
                    return c10.f13099b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f36494s0;
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
                    org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        yqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(yqVar, 0, spannableStringBuilder.length(), 0);
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
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f20279id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence2 = og.d.j(findTopic2, null, null);
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
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f20279id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence3 = og.d.j(findTopic, null, null);
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

    public final void b() {
        int i10;
        float f7 = this.f36495a.e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(24.0f));
        ci.i3 i3Var = this.m0;
        i3Var.setTranslationY(f10);
        i3Var.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        i3Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.u1 u1Var = this.f36497b;
            int childCount = u1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (u1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) u1Var.getChildAt(i12)).b0(0, true);
                }
                u1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f36513o0.g()) {
                this.f36513o0.d(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.r2) {
                this.f36513o0.c(messageObject);
            } else {
                int i12 = this.f36521y.d;
                r00 r00Var = this.f36505g0;
                ArrayList arrayList = this.f36503f;
                String str2 = null;
                org.telegram.ui.ActionBar.n2 n2Var = this.L;
                if (i12 == 0) {
                    PhotoViewer.u1().M2(null, n2Var, null);
                    PhotoViewer.u1().d2(arrayList, i10, 0L, 0L, 0L, r00Var);
                    this.R = PhotoViewer.u1().f33263c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (i7Var.G) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.u1().M2(null, n2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.g0.k(messageObject);
                                        PhotoViewer.u1().M2(null, n2Var, null);
                                        PhotoViewer.u1().d2(k10, 0, 0L, 0L, 0L, r00Var);
                                        this.R = PhotoViewer.u1().f33263c;
                                        return;
                                    }
                                    PhotoViewer.u1().M2(null, n2Var, null);
                                    PhotoViewer.u1().d2(arrayList, indexOf, 0L, 0L, 0L, r00Var);
                                    this.R = PhotoViewer.u1().f33263c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.K, n2Var);
                            } else if (!i7Var.F) {
                                MessageObject message = i7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                i7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                i7Var.f(true);
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
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.H1.P().l(messageObject) == null) {
                                        n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.cv.J(this.L, messageObject, this.f36505g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.m7) view).E;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.f5.p0(this.L, str, true, true);
        } else {
            pf.d.r(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.h6.f20993d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21064h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20935a7));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        ai.u1 u1Var = this.f36497b;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        int i12 = org.telegram.ui.ActionBar.h6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f21083i7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.f21121k7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21065h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.f21026f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.h6.f21043g3, null, null, org.telegram.ui.ActionBar.h6.f21398z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 8192, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 16384, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 32, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 524304, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 524288, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, org.telegram.ui.ActionBar.h6.f21244r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.f21339w0, null, null, org.telegram.ui.ActionBar.h6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.f21376y0, null, null, org.telegram.ui.ActionBar.h6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.L0, null, null, org.telegram.ui.ActionBar.h6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20930a1}, null, org.telegram.ui.ActionBar.h6.f20937a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.h6.f21041g1, org.telegram.ui.ActionBar.h6.f21060h1};
        int i15 = org.telegram.ui.ActionBar.h6.f21103j9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21095j1, org.telegram.ui.ActionBar.h6.f21115k1, org.telegram.ui.ActionBar.h6.Z0}, null, org.telegram.ui.ActionBar.h6.f20957b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.F0[1], null, null, org.telegram.ui.ActionBar.h6.f21085i9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.F0[0], null, null, org.telegram.ui.ActionBar.h6.f21049g9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.G0, null, null, org.telegram.ui.ActionBar.h6.f21159m9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.h6.H0, null, -1, null, org.telegram.ui.ActionBar.h6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.I0, null, null, org.telegram.ui.ActionBar.h6.f21233q9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.f21320v0, null, null, org.telegram.ui.ActionBar.h6.f21273s9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.f21303u0, null, null, org.telegram.ui.ActionBar.h6.f21292t9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.T0}, null, org.telegram.ui.ActionBar.h6.f21312u9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.V0, org.telegram.ui.ActionBar.h6.W0}, null, org.telegram.ui.ActionBar.h6.f21329v9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.X0}, null, org.telegram.ui.ActionBar.h6.w9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.f21357x0, null, null, org.telegram.ui.ActionBar.h6.f21366x9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Y0}, null, org.telegram.ui.ActionBar.h6.f21384y9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21077i1}, null, org.telegram.ui.ActionBar.h6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21024f1}, null, org.telegram.ui.ActionBar.h6.f21401z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20969c1}, null, org.telegram.ui.ActionBar.h6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21151m1}, null, org.telegram.ui.ActionBar.h6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20996d9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20977c9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.h6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u1Var, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        org.telegram.ui.Components.tx0 tx0Var = this.f36499c;
        arrayList.add(new org.telegram.ui.ActionBar.j6(tx0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(tx0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21381y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final hg.o0 o0Var, final boolean z10, String str, boolean z11) {
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
        if (o0Var == null) {
            i10 = -1;
        } else {
            i10 = o0Var.d;
        }
        final String str3 = j10 + j11 + j12 + j13 + i10 + str2 + z10;
        String str4 = this.f36520x;
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
        this.f36521y = o0Var;
        this.E = j10;
        this.F = j11;
        this.H = j12;
        this.G = j13;
        this.I = str2;
        this.J = z10;
        o00 o00Var = this.e;
        if (o00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o00Var);
        }
        a6 a6Var = this.f36504f0;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f36501d0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f36500c0;
            org.telegram.ui.Components.tx0 tx0Var = this.f36499c;
            ArrayList arrayList4 = this.f36503f;
            long j14 = 0;
            if (!z13 && (o0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f36511n.clear();
                this.f36516r.clear();
                this.M = true;
                tx0Var.setVisibility(0);
                org.telegram.ui.Components.im0 im0Var = this.d;
                if (im0Var != null) {
                    im0Var.l();
                }
                this.P++;
                ai.u1 u1Var = this.f36497b;
                if (u1Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    u1Var.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z13) {
                    return;
                }
            }
            this.M = true;
            org.telegram.ui.Components.im0 im0Var2 = this.d;
            if (im0Var2 != null) {
                im0Var2.l();
            }
            if (!z14) {
                a6Var.run();
                tx0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                v00 v00Var = this.f36506h0;
                if (v00Var != null) {
                    ((hv) v00Var).i(false, null, null, false);
                }
            }
            final int i11 = this.P + 1;
            this.P = i11;
            final int i12 = UserConfig.selectedAccount;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i13;
                    String str5;
                    hg.o0 o0Var2;
                    int i14;
                    long j15;
                    boolean z15;
                    long j16;
                    int i15;
                    TLRPC.MessagesFilter messagesFilter;
                    int i16;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final e10 e10Var = e10.this;
                    ArrayList arrayList5 = e10Var.f36503f;
                    final long j17 = j10;
                    int i17 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                    long j18 = j11;
                    String str6 = str2;
                    hg.o0 o0Var3 = o0Var;
                    int i18 = i12;
                    long j19 = j12;
                    long j20 = j13;
                    boolean z16 = z14;
                    ArrayList<Object> arrayList6 = null;
                    if (i17 != 0 && j18 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f20388q = str6;
                        tL_messages_search.limit = 20;
                        if (o0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = o0Var3.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i18).getMessagesController().getInputPeer(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z16 && str6.equals(e10Var.f36519w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) i2.e.h(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i13 = i18;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        j15 = j19;
                        tL_messages_searchGlobal = tL_messages_search;
                        z15 = z16;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str6);
                        boolean z17 = z10;
                        if (!isEmpty) {
                            j15 = j19;
                            ArrayList<Object> arrayList7 = new ArrayList<>();
                            ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                            z15 = z16;
                            ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i18);
                            j16 = j20;
                            i13 = i18;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i15 = 20;
                            messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                            i14 = z17 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i13 = i18;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i14 = z17 ? 1 : 0;
                            j15 = j19;
                            z15 = z16;
                            j16 = j20;
                            i15 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i15;
                        tL_messages_searchGlobal2.f20390q = str5;
                        if (o0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = o0Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i13).getInputChannel(j18);
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                        }
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                        }
                        if (z15 && str5.equals(e10Var.f36519w) && !arrayList5.isEmpty()) {
                            i16 = 1;
                            MessageObject messageObject = (MessageObject) i2.e.h(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = e10Var.v;
                            tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i13).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                        } else {
                            i16 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i16;
                        tL_messages_searchGlobal2.folder_id = i14;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    e10Var.f36519w = str5;
                    e10Var.f36520x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    hg.q0.z1(e10Var.f36519w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final boolean z18 = z15;
                    final int i19 = i11;
                    final hg.o0 o0Var4 = o0Var2;
                    final String str7 = str5;
                    final int i20 = i13;
                    final ArrayList<Object> arrayList11 = arrayList6;
                    final long j21 = j15;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i21 = i20;
                            final String str8 = str7;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i22 = 0; i22 < size; i22++) {
                                    MessageObject messageObject2 = new MessageObject(i21, messages_messages.messages.get(i22), false, true);
                                    messageObject2.setQuery(str8);
                                    arrayList12.add(messageObject2);
                                }
                            }
                            final e10 e10Var2 = e10.this;
                            final int i23 = i19;
                            final boolean z19 = z18;
                            final hg.o0 o0Var5 = o0Var4;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q00.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            s00 s00Var = this.f36509k0;
            if (o0Var == null) {
                s00Var.setViewType(1);
                return;
            }
            int i13 = o0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
                    s00Var.setViewType(1);
                } else {
                    s00Var.setViewType(2);
                }
            } else if (i13 == 1) {
                s00Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    s00Var.setViewType(5);
                }
            } else {
                s00Var.setViewType(4);
            }
        }
    }

    public final void i(v00 v00Var, boolean z10) {
        this.f36506h0 = v00Var;
        if (z10 && v00Var != null) {
            ArrayList arrayList = this.f36500c0;
            if (!arrayList.isEmpty()) {
                ((hv) v00Var).i(false, arrayList, this.f36501d0, this.f36502e0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f36517r0 = z10;
        setPadding(0, i10, 0, i11);
        ai.u1 u1Var = this.f36497b;
        if (z10) {
            u1Var.o1(0, i10, 0, i11);
        } else {
            u1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f36517r0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f36515q0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f36515q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.im0 im0Var;
        int i12 = this.f36518s;
        if (AndroidUtilities.isTablet()) {
            this.f36518s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f36518s = 6;
        } else {
            this.f36518s = 3;
        }
        if (i12 != this.f36518s && (im0Var = this.d) == this.U) {
            this.f36517r0 = true;
            im0Var.l();
            this.f36517r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f36517r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        eh.e eVar = new eh.e(null);
        eVar.e = new ci.i1(21);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f8660f = 1.0f;
        eVar.h = 1.0f;
        ci.i3 i3Var = this.m0;
        dh.d c10 = bVar.c(i3Var, eVar, false);
        i3Var.f5486c = c10;
        c10.q(AndroidUtilities.dp(11.5f));
        ((dh.d) i3Var.f5486c).p(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.so0 so0Var) {
        this.f36507i0 = so0Var;
    }

    public void setUiCallback(d10 d10Var) {
        this.f36513o0 = d10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f36514p0 = z10;
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
