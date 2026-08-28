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
public final class f10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, td.b {
    public static final SpannableStringBuilder[] f38084o0 = new SpannableStringBuilder[3];
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
    public final x00 O;
    public final y00 P;
    public final d10 Q;
    public final a10 R;
    public final c10 S;
    public final a10 T;
    public final a10 U;
    public final ArrayList V;
    public final ArrayList W;
    public final td.a f38085a;
    public boolean f38086a0;
    public final gh.f1 f38087b;
    public final v5 f38088b0;
    public final org.telegram.ui.Components.gw0 f38089c;
    public final s00 f38090c0;
    public org.telegram.ui.Components.vk0 d;
    public w00 f38091d0;
    public p00 f38092e;
    public org.telegram.ui.Components.dn0 f38093e0;
    public final ArrayList f38094f;
    public final f2.m0 f38095f0;
    public final t00 f38096g0;
    public final SparseArray h;
    public final AnimationNotificationsLocker f38097h0;
    public final ih.b3 f38098i0;
    public final o00 f38099j0;
    public e10 f38100k0;
    public boolean f38101l0;
    public int m0;
    public final ArrayList f38102n;
    public boolean f38103n0;
    public final HashMap f38104r;
    public int f38105s;
    public int v;
    public String f38106w;
    public String f38107x;
    public of.m0 f38108y;

    public f10(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        this.f38085a = new td.a(0, this, org.telegram.ui.Components.gr.h, 380L, false);
        this.f38094f = new ArrayList();
        this.h = new SparseArray();
        this.f38102n = new ArrayList();
        this.f38104r = new HashMap();
        this.f38105s = 3;
        this.O = new x00(0, 0L);
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f38088b0 = new v5(this, 4);
        this.f38090c0 = new s00(this);
        this.f38097h0 = new AnimationNotificationsLocker();
        this.f38099j0 = new o00(this, 0);
        this.H = o2Var;
        Activity parentActivity = o2Var.getParentActivity();
        this.G = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        gh.f1 f1Var = new gh.f1(this, parentActivity, 28);
        this.f38087b = f1Var;
        f1Var.setOnItemClickListener(new i(this, 11));
        f1Var.setOnItemLongClickListener(new g(this, 16));
        f2.m0 m0Var = new f2.m0();
        this.f38095f0 = m0Var;
        f1Var.setLayoutManager(m0Var);
        t00 t00Var = new t00(this, parentActivity, 0);
        this.f38096g0 = t00Var;
        addView(t00Var);
        addView(f1Var);
        f1Var.setSectionsType(2);
        f1Var.setSkipDrawSection(true);
        f1Var.setOnScrollListener(new u00(this));
        ih.b3 b3Var = new ih.b3(parentActivity);
        this.f38098i0 = b3Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) b3Var.d, formatDateChat)) {
            b3Var.d = formatDateChat;
            ((org.telegram.ui.Components.i6) b3Var.f11259b).q(formatDateChat, true, true);
        }
        addView(b3Var, g7.e6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.P = new y00(this);
        this.Q = new d10(this, getContext());
        this.R = new a10(this, getContext(), 1);
        this.S = new c10(this, getContext());
        this.T = new a10(this, getContext(), 4);
        this.U = new a10(this, getContext(), 2);
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(parentActivity, t00Var, 1, null);
        this.f38089c = gw0Var;
        addView(gw0Var);
        f1Var.setEmptyView(gw0Var);
        gw0Var.setVisibility(8);
        b();
    }

    public static void a(f10 f10Var, MessageObject messageObject, View view, int i9) {
        if (!f10Var.f38100k0.f()) {
            f10Var.f38100k0.a();
        }
        if (f10Var.f38100k0.f()) {
            f10Var.f38100k0.d(messageObject, view, i9);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z10) {
        return d(messageObject, z10, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z10, int i9, TextPaint textPaint) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        TLRPC.TL_forumTopic findTopic;
        Paint.FontMetricsInt fontMetricsInt;
        TLRPC.TL_forumTopic findTopic2;
        int i10;
        int i11;
        if (messageObject != null && messageObject.messageOwner != null) {
            if (messageObject.isQuickReply()) {
                pf.q1 c10 = pf.r1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c10 != null) {
                    return c10.f45757b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f38084o0;
                if (spannableStringBuilderArr[i9] == null) {
                    spannableStringBuilderArr[i9] = new SpannableStringBuilder(">");
                    if (i9 == 0) {
                        i10 = R.drawable.attach_arrow_right;
                    } else if (i9 == 1) {
                        i10 = R.drawable.msg_mini_arrow_mediathin;
                    } else if (i9 == 2) {
                        i10 = R.drawable.msg_mini_arrow_mediabold;
                    } else {
                        return "";
                    }
                    Drawable mutate = ApplicationLoader.applicationContext.getDrawable(i10).mutate();
                    if (i9 == 0) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(i11, mutate);
                    if (i9 == 1 || i9 == 2) {
                        eqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i9];
                    spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 0);
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
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f22380id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence2 = vf.c.j(findTopic2, null, null);
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
                    spannableStringBuilder2.append(Emoji.replaceEmoji(firstName, fontMetricsInt2, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i9]).append((char) 8202).append(replaceEmoji);
                    charSequence = spannableStringBuilder2;
                } else if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    if (textPaint != null) {
                        fontMetricsInt3 = textPaint.getFontMetricsInt();
                    }
                    charSequence = Emoji.replaceEmoji(userName, fontMetricsInt3, false);
                } else if (chat != null) {
                    CharSequence charSequence3 = chat.title;
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f22380id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence3 = vf.c.j(findTopic, null, null);
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
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            b();
        }
    }

    public final void b() {
        int i9;
        float f10 = this.f38085a.f47775e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(24.0f));
        ih.b3 b3Var = this.f38098i0;
        b3Var.setTranslationY(f11);
        b3Var.setAlpha(f10);
        if (f10 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        b3Var.setVisibility(i9);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            gh.f1 f1Var = this.f38087b;
            int childCount = f1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (f1Var.getChildAt(i11) instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) f1Var.getChildAt(i11)).a0(0, true);
                }
                f1Var.getChildAt(i11).invalidate();
            }
        }
    }

    public final void e(long r11, java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i9, View view, MessageObject messageObject, int i10) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f38100k0.f()) {
                this.f38100k0.d(messageObject, view, i10);
            } else if (view instanceof org.telegram.ui.Cells.r2) {
                this.f38100k0.c(messageObject);
            } else {
                int i11 = this.f38108y.d;
                s00 s00Var = this.f38090c0;
                ArrayList arrayList = this.f38094f;
                String str2 = null;
                org.telegram.ui.ActionBar.o2 o2Var = this.H;
                if (i11 == 0) {
                    PhotoViewer.t1().K2(null, o2Var, null);
                    PhotoViewer.t1().a2(arrayList, i9, 0L, 0L, 0L, s00Var);
                    this.N = PhotoViewer.t1().f35597c;
                } else if (i11 != 3 && i11 != 5) {
                    if (i11 == 1) {
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (i7Var.C) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.t1().K2(null, o2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.l0.k(messageObject);
                                        PhotoViewer.t1().K2(null, o2Var, null);
                                        PhotoViewer.t1().a2(k10, 0, 0L, 0L, 0L, s00Var);
                                        this.N = PhotoViewer.t1().f35597c;
                                        return;
                                    }
                                    PhotoViewer.t1().K2(null, o2Var, null);
                                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, s00Var);
                                    this.N = PhotoViewer.t1().f35597c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.G, o2Var);
                            } else if (!i7Var.B) {
                                MessageObject message = i7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                i7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                i7Var.f(true);
                            }
                        }
                    } else if (i11 == 2) {
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
                                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                                        o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.gu.I(this.H, messageObject, this.f38090c0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.l7) view).A;
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
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.y4.q0(this.H, str, true, true);
        } else {
            ve.e.s(this.G, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23072h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        gh.f1 f1Var = this.f38087b;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        int i11 = org.telegram.ui.ActionBar.f6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.f23093i7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.f23128k7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f23034f3, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.f6.f23052g3, null, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.f6.m0, null, null, org.telegram.ui.ActionBar.f6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 524288, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.f23328w0, null, null, org.telegram.ui.ActionBar.f6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.f23363y0, null, null, org.telegram.ui.ActionBar.f6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.L0, null, null, org.telegram.ui.ActionBar.f6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22943a1}, null, org.telegram.ui.ActionBar.f6.f22949a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.f6.f23050g1, org.telegram.ui.ActionBar.f6.f23068h1};
        int i14 = org.telegram.ui.ActionBar.f6.f23112j9;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, drawableArr, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23104j1, org.telegram.ui.ActionBar.f6.f23122k1, org.telegram.ui.ActionBar.f6.Z0}, null, org.telegram.ui.ActionBar.f6.f22968b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, -1, null, org.telegram.ui.ActionBar.f6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, -1, null, org.telegram.ui.ActionBar.f6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.F0[1], null, null, org.telegram.ui.ActionBar.f6.i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.F0[0], null, null, org.telegram.ui.ActionBar.f6.f23058g9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.G0, null, null, org.telegram.ui.ActionBar.f6.f23165m9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.f6.H0, null, -1, null, org.telegram.ui.ActionBar.f6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.I0, null, null, org.telegram.ui.ActionBar.f6.f23232q9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.f23314v0, null, null, org.telegram.ui.ActionBar.f6.f23270s9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.f23297u0, null, null, org.telegram.ui.ActionBar.f6.f23288t9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.T0}, null, org.telegram.ui.ActionBar.f6.f23306u9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.V0, org.telegram.ui.ActionBar.f6.W0}, null, org.telegram.ui.ActionBar.f6.f23322v9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.X0}, null, org.telegram.ui.ActionBar.f6.f23336w9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.f23345x0, null, null, org.telegram.ui.ActionBar.f6.f23354x9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.Y0}, null, org.telegram.ui.ActionBar.f6.f23372y9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23087i1}, null, org.telegram.ui.ActionBar.f6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23032f1}, null, org.telegram.ui.ActionBar.f6.f23389z9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22978c1}, null, org.telegram.ui.ActionBar.f6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23157m1}, null, org.telegram.ui.ActionBar.f6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.d9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22986c9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.f6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 524288, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23038f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
        org.telegram.ui.Components.gw0 gw0Var = this.f38089c;
        arrayList.add(new org.telegram.ui.ActionBar.h6(gw0Var.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(gw0Var.f28885e, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23369y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final of.m0 m0Var, final boolean z10, String str, boolean z11) {
        final String str2;
        int i9;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (m0Var == null) {
            i9 = -1;
        } else {
            i9 = m0Var.d;
        }
        final String str3 = j10 + j11 + j12 + j13 + i9 + str2 + z10;
        String str4 = this.f38107x;
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
        this.f38108y = m0Var;
        this.A = j10;
        this.B = j11;
        this.D = j12;
        this.C = j13;
        this.E = str2;
        this.F = z10;
        p00 p00Var = this.f38092e;
        if (p00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p00Var);
        }
        v5 v5Var = this.f38088b0;
        AndroidUtilities.cancelRunOnUIThread(v5Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.W;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.V;
            org.telegram.ui.Components.gw0 gw0Var = this.f38089c;
            ArrayList arrayList4 = this.f38094f;
            long j14 = 0;
            if (!z13 && (m0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f38102n.clear();
                this.f38104r.clear();
                this.I = true;
                gw0Var.setVisibility(0);
                org.telegram.ui.Components.vk0 vk0Var = this.d;
                if (vk0Var != null) {
                    vk0Var.l();
                }
                this.L++;
                gh.f1 f1Var = this.f38087b;
                if (f1Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    f1Var.getPinnedHeader().setAlpha(0.0f);
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
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null) {
                vk0Var2.l();
            }
            if (!z14) {
                v5Var.run();
                gw0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                w00 w00Var = this.f38091d0;
                if (w00Var != null) {
                    ((jv) w00Var).i(false, null, null, false);
                }
            }
            final int i10 = this.L + 1;
            this.L = i10;
            final int i11 = UserConfig.selectedAccount;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i12;
                    long j15;
                    long j16;
                    int i13;
                    ?? r10;
                    TLRPC.MessagesFilter messagesFilter;
                    int i14;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final f10 f10Var = f10.this;
                    ArrayList arrayList5 = f10Var.f38094f;
                    final long j17 = j10;
                    long j18 = j11;
                    final String str5 = str2;
                    final of.m0 m0Var2 = m0Var;
                    int i15 = i11;
                    long j19 = j12;
                    long j20 = j13;
                    final boolean z15 = z14;
                    ArrayList<Object> arrayList6 = null;
                    if (j17 != 0 && j18 == 0) {
                        ?? tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f22489q = str5;
                        tL_messages_search.limit = 20;
                        if (m0Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = m0Var2.f19421e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i15).getMessagesController().getInputPeer(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z15 && str5.equals(f10Var.f38106w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) j3.r0.j(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        tL_messages_searchGlobal = tL_messages_search;
                        i12 = i15;
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
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                            i12 = i15;
                            i13 = 20;
                            messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                            r10 = z16 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i12 = i15;
                            j15 = j20;
                            j16 = j19;
                            i13 = 20;
                            r10 = z16;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i13;
                        tL_messages_searchGlobal2.f22491q = str5;
                        if (m0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = m0Var2.f19421e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i12).getInputChannel(j18);
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j16 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z15 && str5.equals(f10Var.f38106w) && !arrayList5.isEmpty()) {
                            i14 = 1;
                            MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = f10Var.v;
                            tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                        } else {
                            i14 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i14;
                        tL_messages_searchGlobal2.folder_id = r10;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    f10Var.f38106w = str5;
                    f10Var.f38107x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    of.o0.y1(f10Var.f38106w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                    final int i16 = i10;
                    final ArrayList<Object> arrayList11 = arrayList6;
                    final int i17 = i12;
                    final long j21 = j16;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i18 = i17;
                            final String str6 = str5;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i19 = 0; i19 < size; i19++) {
                                    MessageObject messageObject2 = new MessageObject(i18, messages_messages.messages.get(i19), false, true);
                                    messageObject2.setQuery(str6);
                                    arrayList12.add(messageObject2);
                                }
                            }
                            final f10 f10Var2 = f10.this;
                            final int i20 = i16;
                            final boolean z17 = z15;
                            final of.m0 m0Var3 = m0Var2;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r00.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f38092e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            t00 t00Var = this.f38096g0;
            if (m0Var == null) {
                t00Var.setViewType(1);
                return;
            }
            int i12 = m0Var.d;
            if (i12 == 0) {
                if (!TextUtils.isEmpty(this.E)) {
                    t00Var.setViewType(1);
                } else {
                    t00Var.setViewType(2);
                }
            } else if (i12 == 1) {
                t00Var.setViewType(3);
            } else if (i12 != 3 && i12 != 5) {
                if (i12 == 2) {
                    t00Var.setViewType(5);
                }
            } else {
                t00Var.setViewType(4);
            }
        }
    }

    public final void i(w00 w00Var, boolean z10) {
        this.f38091d0 = w00Var;
        if (z10 && w00Var != null) {
            ArrayList arrayList = this.V;
            if (!arrayList.isEmpty()) {
                ((jv) w00Var).i(false, arrayList, this.W, this.f38086a0);
            }
        }
    }

    public final void j(int i9, int i10, boolean z10) {
        setClipToPadding(false);
        this.f38103n0 = z10;
        setPadding(0, i9, 0, i10);
        gh.f1 f1Var = this.f38087b;
        if (z10) {
            f1Var.o1(0, i9, 0, i10);
        } else {
            f1Var.setPadding(0, i9, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i9;
        marginLayoutParams.bottomMargin = -i10;
        this.f38103n0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = UserConfig.selectedAccount;
        this.m0 = i9;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.m0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.Components.vk0 vk0Var;
        int i11 = this.f38105s;
        if (AndroidUtilities.isTablet()) {
            this.f38105s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f38105s = 6;
        } else {
            this.f38105s = 3;
        }
        if (i11 != this.f38105s && (vk0Var = this.d) == this.Q) {
            this.f38103n0 = true;
            vk0Var.l();
            this.f38103n0 = false;
        }
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f38103n0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ig.a aVar) {
        lg.d dVar = new lg.d(null);
        dVar.f16866e = new i3.i(26);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f16867f = 1.0f;
        dVar.h = 1.0f;
        ih.b3 b3Var = this.f38098i0;
        kg.d c10 = aVar.c(b3Var, dVar, false);
        b3Var.f11260c = c10;
        c10.p(AndroidUtilities.dp(11.5f));
        ((kg.d) b3Var.f11260c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.dn0 dn0Var) {
        this.f38093e0 = dn0Var;
    }

    public void setUiCallback(e10 e10Var) {
        this.f38100k0 = e10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f38101l0 = z10;
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
