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
public final class c20 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public static final SpannableStringBuilder[] f34678s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.m2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final u10 S;
    public final v10 T;
    public final a20 U;
    public final x10 V;
    public final z10 W;
    public final ne.b f34679a;
    public final x10 f34680a0;
    public final bi.o0 f34681b;
    public final x10 f34682b0;
    public final org.telegram.ui.Components.wx0 f34683c;
    public final ArrayList f34684c0;
    public org.telegram.ui.Components.lm0 d;
    public final ArrayList f34685d0;
    public m10 e;
    public boolean f34686e0;
    public final ArrayList f34687f;
    public final a6 f34688f0;
    public final p10 f34689g0;
    public final SparseArray h;
    public t10 f34690h0;
    public org.telegram.ui.Components.vo0 f34691i0;
    public final s4.b0 f34692j0;
    public final q10 f34693k0;
    public final AnimationNotificationsLocker f34694l0;
    public final bi.d4 m0;
    public final ArrayList f34695n;
    public final zz f34696n0;
    public b20 f34697o0;
    public boolean f34698p0;
    public int f34699q0;
    public final HashMap f34700r;
    public boolean f34701r0;
    public int f34702s;
    public int v;
    public String f34703w;
    public String f34704x;
    public hg.p0 f34705y;

    public c20(org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getParentActivity());
        this.f34679a = new ne.b(0, this, org.telegram.ui.Components.es.h, 380L, false);
        this.f34687f = new ArrayList();
        this.h = new SparseArray();
        this.f34695n = new ArrayList();
        this.f34700r = new HashMap();
        this.f34702s = 3;
        this.S = new u10(0, 0L);
        this.f34684c0 = new ArrayList();
        this.f34685d0 = new ArrayList();
        this.f34688f0 = new a6(this, 4);
        this.f34689g0 = new p10(this);
        this.f34694l0 = new AnimationNotificationsLocker();
        this.f34696n0 = new zz(this, 1);
        this.L = m2Var;
        Activity parentActivity = m2Var.getParentActivity();
        this.K = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        bi.o0 o0Var = new bi.o0(this, parentActivity, 28);
        this.f34681b = o0Var;
        o0Var.setOnItemClickListener(new i(this, 12));
        o0Var.setOnItemLongClickListener(new g(this, 16));
        s4.b0 b0Var = new s4.b0();
        this.f34692j0 = b0Var;
        o0Var.setLayoutManager(b0Var);
        q10 q10Var = new q10(this, parentActivity, 0);
        this.f34693k0 = q10Var;
        addView(q10Var);
        addView(o0Var);
        o0Var.setSectionsType(2);
        o0Var.setSkipDrawSection(true);
        o0Var.setOnScrollListener(new r10(this));
        bi.d4 d4Var = new bi.d4(parentActivity);
        this.m0 = d4Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) d4Var.d, formatDateChat)) {
            d4Var.d = formatDateChat;
            ((org.telegram.ui.Components.r6) d4Var.f2945b).t(formatDateChat, true, true);
        }
        addView(d4Var, w7.a6.a(33.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1, 49));
        this.T = new v10(this);
        this.U = new a20(this, getContext());
        this.V = new x10(this, getContext(), 1);
        this.W = new z10(this, getContext());
        this.f34680a0 = new x10(this, getContext(), 4);
        this.f34682b0 = new x10(this, getContext(), 2);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(parentActivity, q10Var, 1, null);
        this.f34683c = wx0Var;
        addView(wx0Var);
        o0Var.setEmptyView(wx0Var);
        wx0Var.setVisibility(8);
        b();
    }

    public static void a(c20 c20Var, MessageObject messageObject, View view, int i10) {
        if (!c20Var.f34697o0.g()) {
            c20Var.f34697o0.a();
        }
        if (c20Var.f34697o0.g()) {
            c20Var.f34697o0.d(messageObject, view, i10);
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
                ig.a2 c10 = ig.b2.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c10 != null) {
                    return c10.f11435b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f34678s0;
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
                    org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        brVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(brVar, 0, spannableStringBuilder.length(), 0);
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
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f19216id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
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
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f19216id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
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
        float f7 = this.f34679a.e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(24.0f));
        bi.d4 d4Var = this.m0;
        d4Var.setTranslationY(f10);
        d4Var.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        d4Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bi.o0 o0Var = this.f34681b;
            int childCount = o0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (o0Var.getChildAt(i12) instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) o0Var.getChildAt(i12)).b0(0, true);
                }
                o0Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c20.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f34697o0.g()) {
                this.f34697o0.d(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.s2) {
                this.f34697o0.c(messageObject);
            } else {
                int i12 = this.f34705y.d;
                p10 p10Var = this.f34689g0;
                ArrayList arrayList = this.f34687f;
                String str2 = null;
                org.telegram.ui.ActionBar.m2 m2Var = this.L;
                if (i12 == 0) {
                    PhotoViewer.t1().K2(null, m2Var, null);
                    PhotoViewer.t1().b2(arrayList, i10, 0L, 0L, 0L, p10Var);
                    this.R = PhotoViewer.t1().f32207c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (k7Var.G) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList l4 = org.telegram.messenger.q.l(messageObject);
                                        PhotoViewer.t1().K2(null, m2Var, null);
                                        PhotoViewer.t1().b2(l4, 0, 0L, 0L, 0L, p10Var);
                                        this.R = PhotoViewer.t1().f32207c;
                                        return;
                                    }
                                    PhotoViewer.t1().K2(null, m2Var, null);
                                    PhotoViewer.t1().b2(arrayList, indexOf, 0L, 0L, 0L, p10Var);
                                    this.R = PhotoViewer.t1().f32207c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.K, m2Var);
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
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                                        m2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.hv.J(this.L, messageObject, this.f34689g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
            org.telegram.ui.Components.g5.p0(this.L, str, true, true);
        } else {
            pf.d.s(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19972h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        bi.o0 o0Var = this.f34681b;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i12 = org.telegram.ui.ActionBar.g6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 2048, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f19991i7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f20029k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19973h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.f19934f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.g6.f19951g3, null, null, org.telegram.ui.ActionBar.g6.f20305z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.g6.m0, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 524288, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, org.telegram.ui.ActionBar.g6.f20152r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.f20246w0, null, null, org.telegram.ui.ActionBar.g6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.f20283y0, null, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.L0, null, null, org.telegram.ui.ActionBar.g6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19838a1}, null, org.telegram.ui.ActionBar.g6.f19845a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.g6.f19949g1, org.telegram.ui.ActionBar.g6.f19968h1};
        int i15 = org.telegram.ui.ActionBar.g6.f20011j9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f20003j1, org.telegram.ui.ActionBar.g6.f20023k1, org.telegram.ui.ActionBar.g6.Z0}, null, org.telegram.ui.ActionBar.g6.f19865b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.f19993i9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.F0[0], null, null, org.telegram.ui.ActionBar.g6.f19957g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.f20067m9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, -1, null, org.telegram.ui.ActionBar.g6.p9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.f20141q9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.f20227v0, null, null, org.telegram.ui.ActionBar.g6.f20181s9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.f20210u0, null, null, org.telegram.ui.ActionBar.g6.f20200t9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.f20219u9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.f20236v9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.X0}, null, org.telegram.ui.ActionBar.g6.w9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.g6.f20264x0, null, null, org.telegram.ui.ActionBar.g6.f20273x9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Y0}, null, org.telegram.ui.ActionBar.g6.f20291y9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19985i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19932f1}, null, org.telegram.ui.ActionBar.g6.f20308z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19877c1}, null, org.telegram.ui.ActionBar.g6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f20059m1}, null, org.telegram.ui.ActionBar.g6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19904d9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19885c9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.g6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8192, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 16384, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 524288, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        org.telegram.ui.Components.wx0 wx0Var = this.f34683c;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wx0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wx0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f20288y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final hg.p0 p0Var, final boolean z10, String str, boolean z11) {
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
        if (p0Var == null) {
            i10 = -1;
        } else {
            i10 = p0Var.d;
        }
        final String str3 = j10 + j11 + j12 + j13 + i10 + str2 + z10;
        String str4 = this.f34704x;
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
        this.f34705y = p0Var;
        this.E = j10;
        this.F = j11;
        this.H = j12;
        this.G = j13;
        this.I = str2;
        this.J = z10;
        m10 m10Var = this.e;
        if (m10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m10Var);
        }
        a6 a6Var = this.f34688f0;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f34685d0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f34684c0;
            org.telegram.ui.Components.wx0 wx0Var = this.f34683c;
            ArrayList arrayList4 = this.f34687f;
            long j14 = 0;
            if (!z13 && (p0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f34695n.clear();
                this.f34700r.clear();
                this.M = true;
                wx0Var.setVisibility(0);
                org.telegram.ui.Components.lm0 lm0Var = this.d;
                if (lm0Var != null) {
                    lm0Var.l();
                }
                this.P++;
                bi.o0 o0Var = this.f34681b;
                if (o0Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    o0Var.getPinnedHeader().setAlpha(0.0f);
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
            org.telegram.ui.Components.lm0 lm0Var2 = this.d;
            if (lm0Var2 != null) {
                lm0Var2.l();
            }
            if (!z14) {
                a6Var.run();
                wx0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                t10 t10Var = this.f34690h0;
                if (t10Var != null) {
                    ((aw) t10Var).i(false, null, null, false);
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
                    hg.p0 p0Var2;
                    int i14;
                    long j15;
                    boolean z15;
                    long j16;
                    int i15;
                    TLRPC.MessagesFilter messagesFilter;
                    int i16;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final c20 c20Var = c20.this;
                    ArrayList arrayList5 = c20Var.f34687f;
                    final long j17 = j10;
                    int i17 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                    long j18 = j11;
                    String str6 = str2;
                    hg.p0 p0Var3 = p0Var;
                    int i18 = i12;
                    long j19 = j12;
                    long j20 = j13;
                    boolean z16 = z14;
                    ArrayList<Object> arrayList6 = null;
                    if (i17 != 0 && j18 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f19325q = str6;
                        tL_messages_search.limit = 20;
                        if (p0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = p0Var3.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i18).getMessagesController().getInputPeer(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z16 && str6.equals(c20Var.f34703w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) i2.d.g(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i13 = i18;
                        str5 = str6;
                        p0Var2 = p0Var3;
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
                            p0Var2 = p0Var3;
                            i15 = 20;
                            messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                            i14 = z17 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i13 = i18;
                            str5 = str6;
                            p0Var2 = p0Var3;
                            i14 = z17 ? 1 : 0;
                            j15 = j19;
                            z15 = z16;
                            j16 = j20;
                            i15 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i15;
                        tL_messages_searchGlobal2.f19327q = str5;
                        if (p0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = p0Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i13).getInputChannel(j18);
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                        }
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j16 / 1000);
                        }
                        if (z15 && str5.equals(c20Var.f34703w) && !arrayList5.isEmpty()) {
                            i16 = 1;
                            MessageObject messageObject = (MessageObject) i2.d.g(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = c20Var.v;
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
                    c20Var.f34703w = str5;
                    c20Var.f34704x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    hg.r0.z1(c20Var.f34703w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final boolean z18 = z15;
                    final int i19 = i11;
                    final hg.p0 p0Var4 = p0Var2;
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
                            final c20 c20Var2 = c20.this;
                            final int i23 = i19;
                            final boolean z19 = z18;
                            final hg.p0 p0Var5 = p0Var4;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o10.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            q10 q10Var = this.f34693k0;
            if (p0Var == null) {
                q10Var.setViewType(1);
                return;
            }
            int i13 = p0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
                    q10Var.setViewType(1);
                } else {
                    q10Var.setViewType(2);
                }
            } else if (i13 == 1) {
                q10Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    q10Var.setViewType(5);
                }
            } else {
                q10Var.setViewType(4);
            }
        }
    }

    public final void i(t10 t10Var, boolean z10) {
        this.f34690h0 = t10Var;
        if (z10 && t10Var != null) {
            ArrayList arrayList = this.f34684c0;
            if (!arrayList.isEmpty()) {
                ((aw) t10Var).i(false, arrayList, this.f34685d0, this.f34686e0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f34701r0 = z10;
        setPadding(0, i10, 0, i11);
        bi.o0 o0Var = this.f34681b;
        if (z10) {
            o0Var.o1(0, i10, 0, i11);
        } else {
            o0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f34701r0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f34699q0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f34699q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.lm0 lm0Var;
        int i12 = this.f34702s;
        if (AndroidUtilities.isTablet()) {
            this.f34702s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f34702s = 6;
        } else {
            this.f34702s = 3;
        }
        if (i12 != this.f34702s && (lm0Var = this.d) == this.U) {
            this.f34701r0 = true;
            lm0Var.l();
            this.f34701r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f34701r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        eh.e eVar = new eh.e(null);
        eVar.e = new bi.w2(19);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f8779f = 1.0f;
        eVar.h = 1.0f;
        bi.d4 d4Var = this.m0;
        dh.d c10 = bVar.c(d4Var, eVar, false);
        d4Var.f2946c = c10;
        c10.q(AndroidUtilities.dp(11.5f));
        ((dh.d) d4Var.f2946c).p(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.vo0 vo0Var) {
        this.f34691i0 = vo0Var;
    }

    public void setUiCallback(b20 b20Var) {
        this.f34697o0 = b20Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f34698p0 = z10;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
