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
import java.util.HashSet;
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
public final class i10 extends FrameLayout implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final SpannableStringBuilder[] f38092s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.o2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final a10 S;
    public final b10 T;
    public final g10 U;
    public final d10 V;
    public final f10 W;
    public final ne.b f38093a;
    public final d10 f38094a0;
    public final ai.u1 f38095b;
    public final d10 f38096b0;
    public final org.telegram.ui.Components.vx0 f38097c;
    public final ArrayList f38098c0;
    public org.telegram.ui.Components.km0 d;
    public final ArrayList f38099d0;
    public r00 e;
    public boolean f38100e0;
    public final ArrayList f38101f;
    public final z5 f38102f0;
    public final u00 f38103g0;
    public final SparseArray h;
    public y00 f38104h0;
    public org.telegram.ui.Components.uo0 f38105i0;
    public final s4.b0 f38106j0;
    public final v00 f38107k0;
    public final AnimationNotificationsLocker f38108l0;
    public final z00 m0;
    public final ArrayList f38109n;
    public final fz f38110n0;
    public h10 f38111o0;
    public boolean f38112p0;
    public int f38113q0;
    public final HashMap f38114r;
    public boolean f38115r0;
    public int f38116s;
    public int v;
    public String f38117w;
    public String f38118x;
    public hg.o0 f38119y;

    public i10(org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        this.f38093a = new ne.b(0, this, org.telegram.ui.Components.zr.h, 380L, false);
        this.f38101f = new ArrayList();
        this.h = new SparseArray();
        this.f38109n = new ArrayList();
        this.f38114r = new HashMap();
        this.f38116s = 3;
        this.S = new a10(0, 0L);
        this.f38098c0 = new ArrayList();
        this.f38099d0 = new ArrayList();
        this.f38102f0 = new z5(this, 4);
        this.f38103g0 = new u00(this);
        this.f38108l0 = new AnimationNotificationsLocker();
        this.f38110n0 = new fz(this, 1);
        this.L = o2Var;
        Activity parentActivity = o2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, this, null);
        ai.u1 u1Var = new ai.u1(this, parentActivity, 29);
        this.f38095b = u1Var;
        u1Var.setOnItemClickListener(new h(this, 12));
        u1Var.setOnItemLongClickListener(new f(this, 16));
        s4.b0 b0Var = new s4.b0();
        this.f38106j0 = b0Var;
        u1Var.setLayoutManager(b0Var);
        v00 v00Var = new v00(this, parentActivity, 0);
        this.f38107k0 = v00Var;
        addView(v00Var);
        addView(u1Var);
        u1Var.setSectionsType(2);
        u1Var.setSkipDrawSection(true);
        u1Var.setOnScrollListener(new w00(this));
        z00 z00Var = new z00(parentActivity);
        this.m0 = z00Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals(z00Var.f43988c, formatDateChat)) {
            z00Var.f43988c = formatDateChat;
            z00Var.f43986a.t(formatDateChat, true, true);
        }
        addView(z00Var, w7.z5.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new b10(this);
        this.U = new g10(this, getContext());
        this.V = new d10(this, getContext(), 1);
        this.W = new f10(this, getContext());
        this.f38094a0 = new d10(this, getContext(), 4);
        this.f38096b0 = new d10(this, getContext(), 2);
        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(parentActivity, v00Var, 1, null);
        this.f38097c = vx0Var;
        addView(vx0Var);
        u1Var.setEmptyView(vx0Var);
        vx0Var.setVisibility(8);
        b();
    }

    public static void a(i10 i10Var, MessageObject messageObject, View view, int i10) {
        if (!i10Var.f38111o0.g()) {
            i10Var.f38111o0.a();
        }
        if (i10Var.f38111o0.g()) {
            i10Var.f38111o0.d(messageObject, view, i10);
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
                ig.y1 c10 = ig.z1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c10 != null) {
                    return c10.f13130b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f38092s0;
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
                    org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        vqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(vqVar, 0, spannableStringBuilder.length(), 0);
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
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f20344id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
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
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f20344id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
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

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21312k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21168c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21187d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21592z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21575y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21557x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21520v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21503u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21483t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21464s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21424q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21294j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21350m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21240g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21276i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21148b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21128a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
    }

    public final void b() {
        int i10;
        float f7 = this.f38093a.e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(24.0f));
        z00 z00Var = this.m0;
        z00Var.setTranslationY(f10);
        z00Var.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        z00Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.u1 u1Var = this.f38095b;
            int childCount = u1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (u1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) u1Var.getChildAt(i12)).a0(0, true);
                }
                u1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f38111o0.g()) {
                this.f38111o0.d(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.q2) {
                this.f38111o0.c(messageObject);
            } else {
                int i12 = this.f38119y.d;
                u00 u00Var = this.f38103g0;
                ArrayList arrayList = this.f38101f;
                String str2 = null;
                org.telegram.ui.ActionBar.o2 o2Var = this.L;
                if (i12 == 0) {
                    PhotoViewer.u1().M2(null, o2Var, null);
                    PhotoViewer.u1().d2(arrayList, i10, 0L, 0L, 0L, u00Var);
                    this.R = PhotoViewer.u1().f33563c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (k7Var.G) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.u1().M2(null, o2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.v0.k(messageObject);
                                        PhotoViewer.u1().M2(null, o2Var, null);
                                        PhotoViewer.u1().d2(k10, 0, 0L, 0L, 0L, u00Var);
                                        this.R = PhotoViewer.u1().f33563c;
                                        return;
                                    }
                                    PhotoViewer.u1().M2(null, o2Var, null);
                                    PhotoViewer.u1().d2(arrayList, indexOf, 0L, 0L, 0L, u00Var);
                                    this.R = PhotoViewer.u1().f33563c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.K, o2Var);
                            } else if (!k7Var.F) {
                                MessageObject message = k7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                k7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                k7Var.f(true);
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
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                                        o2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.av.I(this.L, messageObject, this.f38103g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.n7) view).E;
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
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.d5.p0(this.L, str, true, true);
        } else {
            pf.d.r(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21126a7));
        int i10 = org.telegram.ui.ActionBar.k6.f21274i7;
        ai.u1 u1Var = this.f38095b;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f21312k7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        org.telegram.ui.Components.vx0 vx0Var = this.f38097c;
        arrayList.add(new org.telegram.ui.ActionBar.t6(vx0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(vx0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21572y6));
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
        String str4 = this.f38118x;
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
        this.f38119y = o0Var;
        this.E = j10;
        this.F = j11;
        this.H = j12;
        this.G = j13;
        this.I = str2;
        this.J = z10;
        r00 r00Var = this.e;
        if (r00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r00Var);
        }
        z5 z5Var = this.f38102f0;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f38099d0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f38098c0;
            org.telegram.ui.Components.vx0 vx0Var = this.f38097c;
            ArrayList arrayList4 = this.f38101f;
            long j14 = 0;
            if (!z13 && (o0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f38109n.clear();
                this.f38114r.clear();
                this.M = true;
                vx0Var.setVisibility(0);
                org.telegram.ui.Components.km0 km0Var = this.d;
                if (km0Var != null) {
                    km0Var.l();
                }
                this.P++;
                ai.u1 u1Var = this.f38095b;
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
            org.telegram.ui.Components.km0 km0Var2 = this.d;
            if (km0Var2 != null) {
                km0Var2.l();
            }
            if (!z14) {
                z5Var.run();
                vx0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                y00 y00Var = this.f38104h0;
                if (y00Var != null) {
                    ((jv) y00Var).i(false, null, null, false);
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
                    final i10 i10Var = i10.this;
                    ArrayList arrayList5 = i10Var.f38101f;
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
                        tL_messages_search.f20453q = str6;
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
                        if (z16 && str6.equals(i10Var.f38117w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) i2.o1.i(1, arrayList5)).getId();
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
                        tL_messages_searchGlobal2.f20455q = str5;
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
                        if (z15 && str5.equals(i10Var.f38117w) && !arrayList5.isEmpty()) {
                            i16 = 1;
                            MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = i10Var.v;
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
                    i10Var.f38117w = str5;
                    i10Var.f38118x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    hg.q0.E1(i10Var.f38117w, arrayList10);
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
                            final i10 i10Var2 = i10.this;
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
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t00.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            v00 v00Var = this.f38107k0;
            if (o0Var == null) {
                v00Var.setViewType(1);
                return;
            }
            int i13 = o0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
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
        this.f38104h0 = y00Var;
        if (z10 && y00Var != null) {
            ArrayList arrayList = this.f38098c0;
            if (!arrayList.isEmpty()) {
                ((jv) y00Var).i(false, arrayList, this.f38099d0, this.f38100e0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f38115r0 = z10;
        setPadding(0, i10, 0, i11);
        ai.u1 u1Var = this.f38095b;
        if (z10) {
            u1Var.s1(0, i10, 0, i11);
        } else {
            u1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f38115r0 = false;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f38113q0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f38113q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.km0 km0Var;
        int i12 = this.f38116s;
        if (AndroidUtilities.isTablet()) {
            this.f38116s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f38116s = 6;
        } else {
            this.f38116s = 3;
        }
        if (i12 != this.f38116s && (km0Var = this.d) == this.U) {
            this.f38115r0 = true;
            km0Var.l();
            this.f38115r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38115r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        eh.e eVar = new eh.e(null);
        eVar.e = new c3.m(23);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f8668f = 1.0f;
        eVar.h = 1.0f;
        z00 z00Var = this.m0;
        dh.d c10 = bVar.c(z00Var, eVar, false);
        z00Var.f43987b = c10;
        c10.q(AndroidUtilities.dp(11.5f));
        z00Var.f43987b.p(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.uo0 uo0Var) {
        this.f38105i0 = uo0Var;
    }

    public void setUiCallback(h10 h10Var) {
        this.f38111o0 = h10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f38112p0 = z10;
    }

    @Override
    public final void updateColors() {
        try {
            z00 z00Var = this.m0;
            if (z00Var != null) {
                z00Var.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
