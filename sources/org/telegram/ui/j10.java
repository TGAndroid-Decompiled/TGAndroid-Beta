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
public final class j10 extends FrameLayout implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate, oe.d {
    public static final SpannableStringBuilder[] f40319s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.r2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final b10 S;
    public final c10 T;
    public final h10 U;
    public final e10 V;
    public final g10 W;
    public final oe.b f40320a;
    public final e10 f40321a0;
    public final bi.r1 f40322b;
    public final e10 f40323b0;
    public final org.telegram.ui.Components.fy0 f40324c;
    public final ArrayList f40325c0;
    public org.telegram.ui.Components.mm0 d;
    public final ArrayList f40326d0;
    public s00 e;
    public boolean f40327e0;
    public final ArrayList f40328f;
    public final y5 f40329f0;
    public final v00 f40330g0;
    public final SparseArray h;
    public z00 f40331h0;
    public org.telegram.ui.Components.ap0 f40332i0;
    public final s4.c0 f40333j0;
    public final w00 f40334k0;
    public final AnimationNotificationsLocker f40335l0;
    public final a10 m0;
    public final ArrayList f40336n;
    public final r00 f40337n0;
    public i10 f40338o0;
    public boolean f40339p0;
    public int f40340q0;
    public final HashMap f40341r;
    public boolean f40342r0;
    public int f40343s;
    public int v;
    public String f40344w;
    public String f40345x;
    public ig.p0 f40346y;

    public j10(org.telegram.ui.ActionBar.r2 r2Var) {
        super(r2Var.getParentActivity());
        this.f40320a = new oe.b(0, this, org.telegram.ui.Components.ds.h, 380L, false);
        this.f40328f = new ArrayList();
        this.h = new SparseArray();
        this.f40336n = new ArrayList();
        this.f40341r = new HashMap();
        this.f40343s = 3;
        this.S = new b10(0, 0L);
        this.f40325c0 = new ArrayList();
        this.f40326d0 = new ArrayList();
        this.f40329f0 = new y5(this, 4);
        this.f40330g0 = new v00(this);
        this.f40335l0 = new AnimationNotificationsLocker();
        this.f40337n0 = new r00(this, 0);
        this.L = r2Var;
        Activity parentActivity = r2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, this, null);
        bi.r1 r1Var = new bi.r1(this, parentActivity, 29);
        this.f40322b = r1Var;
        r1Var.setOnItemClickListener(new h(this, 12));
        r1Var.setOnItemLongClickListener(new f(this, 16));
        s4.c0 c0Var = new s4.c0();
        this.f40333j0 = c0Var;
        r1Var.setLayoutManager(c0Var);
        w00 w00Var = new w00(this, parentActivity, 0);
        this.f40334k0 = w00Var;
        addView(w00Var);
        addView(r1Var);
        r1Var.setSectionsType(2);
        r1Var.setSkipDrawSection(true);
        r1Var.setOnScrollListener(new x00(this));
        a10 a10Var = new a10(parentActivity);
        this.m0 = a10Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals(a10Var.f37642c, formatDateChat)) {
            a10Var.f37642c = formatDateChat;
            a10Var.f37640a.t(formatDateChat, true, true);
        }
        addView(a10Var, org.telegram.ui.Components.kb1.h(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new c10(this);
        this.U = new h10(this, getContext());
        this.V = new e10(this, getContext(), 1);
        this.W = new g10(this, getContext());
        this.f40321a0 = new e10(this, getContext(), 4);
        this.f40323b0 = new e10(this, getContext(), 2);
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(parentActivity, w00Var, 1, null);
        this.f40324c = fy0Var;
        addView(fy0Var);
        r1Var.setEmptyView(fy0Var);
        fy0Var.setVisibility(8);
        b();
    }

    public static void a(j10 j10Var, MessageObject messageObject, View view, int i10) {
        if (!j10Var.f40338o0.g()) {
            j10Var.f40338o0.a();
        }
        if (j10Var.f40338o0.g()) {
            j10Var.f40338o0.e(messageObject, view, i10);
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
                jg.b2 c10 = jg.c2.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c10 != null) {
                    return c10.f15640b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f40319s0;
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
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        zqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(zqVar, 0, spannableStringBuilder.length(), 0);
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
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f22028id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence2 = pg.d.j(findTopic2, null, null);
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
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f22028id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence3 = pg.d.j(findTopic, null, null);
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
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23377e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23486k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23341c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23360d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23771z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23752y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23715w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23696v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23677u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23658t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23638s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23584p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23469j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23524m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23415g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23452i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23321b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23302a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ih));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
    }

    public final void b() {
        int i10;
        float f7 = this.f40320a.e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(24.0f));
        a10 a10Var = this.m0;
        a10Var.setTranslationY(f10);
        a10Var.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        a10Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            bi.r1 r1Var = this.f40322b;
            int childCount = r1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (r1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) r1Var.getChildAt(i12)).a0(0, true);
                }
                r1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f40338o0.g()) {
                this.f40338o0.e(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.p2) {
                this.f40338o0.d(messageObject);
            } else {
                int i12 = this.f40346y.d;
                v00 v00Var = this.f40330g0;
                ArrayList arrayList = this.f40328f;
                String str2 = null;
                org.telegram.ui.ActionBar.r2 r2Var = this.L;
                if (i12 == 0) {
                    PhotoViewer.v1().N2(null, r2Var, null);
                    PhotoViewer.v1().e2(arrayList, i10, 0L, 0L, 0L, v00Var);
                    this.R = PhotoViewer.v1().f35651c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (o7Var.G) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.v1().N2(null, r2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList l4 = org.telegram.messenger.t.l(messageObject);
                                        PhotoViewer.v1().N2(null, r2Var, null);
                                        PhotoViewer.v1().e2(l4, 0, 0L, 0L, 0L, v00Var);
                                        this.R = PhotoViewer.v1().f35651c;
                                        return;
                                    }
                                    PhotoViewer.v1().N2(null, r2Var, null);
                                    PhotoViewer.v1().e2(arrayList, indexOf, 0L, 0L, 0L, v00Var);
                                    this.R = PhotoViewer.v1().f35651c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.K, r2Var);
                            } else if (!o7Var.F) {
                                MessageObject message = o7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                o7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                o7Var.f(true);
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
                                        r2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.dv.I(this.L, messageObject, this.f40330g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.r7) view).E;
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
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    ((org.telegram.ui.Cells.n7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.g5.p0(this.L, str, true, true);
        } else {
            qf.d.r(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23428h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23300a7));
        int i10 = org.telegram.ui.ActionBar.y6.f23450i7;
        bi.r1 r1Var = this.f40322b;
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8192, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.f23486k7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 16384, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8192, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 16384, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        org.telegram.ui.Components.fy0 fy0Var = this.f40324c;
        arrayList.add(new org.telegram.ui.ActionBar.h7(fy0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(fy0Var.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23749y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final ig.p0 p0Var, final boolean z10, String str, boolean z11) {
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
        String str4 = this.f40345x;
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
        this.f40346y = p0Var;
        this.E = j10;
        this.F = j11;
        this.H = j12;
        this.G = j13;
        this.I = str2;
        this.J = z10;
        s00 s00Var = this.e;
        if (s00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(s00Var);
        }
        y5 y5Var = this.f40329f0;
        AndroidUtilities.cancelRunOnUIThread(y5Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f40326d0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f40325c0;
            org.telegram.ui.Components.fy0 fy0Var = this.f40324c;
            ArrayList arrayList4 = this.f40328f;
            long j14 = 0;
            if (!z13 && (p0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f40336n.clear();
                this.f40341r.clear();
                this.M = true;
                fy0Var.setVisibility(0);
                org.telegram.ui.Components.mm0 mm0Var = this.d;
                if (mm0Var != null) {
                    mm0Var.l();
                }
                this.P++;
                bi.r1 r1Var = this.f40322b;
                if (r1Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    r1Var.getPinnedHeader().setAlpha(0.0f);
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
            org.telegram.ui.Components.mm0 mm0Var2 = this.d;
            if (mm0Var2 != null) {
                mm0Var2.l();
            }
            if (!z14) {
                y5Var.run();
                fy0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                z00 z00Var = this.f40331h0;
                if (z00Var != null) {
                    ((kv) z00Var).j(false, null, null, false);
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
                    ig.p0 p0Var2;
                    int i14;
                    long j15;
                    boolean z15;
                    long j16;
                    int i15;
                    TLRPC.MessagesFilter messagesFilter;
                    int i16;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final j10 j10Var = j10.this;
                    ArrayList arrayList5 = j10Var.f40328f;
                    final long j17 = j10;
                    int i17 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
                    long j18 = j11;
                    String str6 = str2;
                    ig.p0 p0Var3 = p0Var;
                    int i18 = i12;
                    long j19 = j12;
                    long j20 = j13;
                    boolean z16 = z14;
                    ArrayList<Object> arrayList6 = null;
                    if (i17 != 0 && j18 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f22139q = str6;
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
                        if (z16 && str6.equals(j10Var.f40344w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) ic.a.g(1, arrayList5)).getId();
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
                        tL_messages_searchGlobal2.f22141q = str5;
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
                        if (z15 && str5.equals(j10Var.f40344w) && !arrayList5.isEmpty()) {
                            i16 = 1;
                            MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = j10Var.v;
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
                    j10Var.f40344w = str5;
                    j10Var.f40345x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    ig.r0.E1(j10Var.f40344w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final boolean z18 = z15;
                    final int i19 = i11;
                    final ig.p0 p0Var4 = p0Var2;
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
                            final j10 j10Var2 = j10.this;
                            final int i23 = i19;
                            final boolean z19 = z18;
                            final ig.p0 p0Var5 = p0Var4;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u00.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            w00 w00Var = this.f40334k0;
            if (p0Var == null) {
                w00Var.setViewType(1);
                return;
            }
            int i13 = p0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
                    w00Var.setViewType(1);
                } else {
                    w00Var.setViewType(2);
                }
            } else if (i13 == 1) {
                w00Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    w00Var.setViewType(5);
                }
            } else {
                w00Var.setViewType(4);
            }
        }
    }

    public final void i(z00 z00Var, boolean z10) {
        this.f40331h0 = z00Var;
        if (z10 && z00Var != null) {
            ArrayList arrayList = this.f40325c0;
            if (!arrayList.isEmpty()) {
                ((kv) z00Var).j(false, arrayList, this.f40326d0, this.f40327e0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f40342r0 = z10;
        setPadding(0, i10, 0, i11);
        bi.r1 r1Var = this.f40322b;
        if (z10) {
            r1Var.t1(0, i10, 0, i11);
        } else {
            r1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f40342r0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f40340q0 = i10;
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f40340q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.mm0 mm0Var;
        int i12 = this.f40343s;
        if (AndroidUtilities.isTablet()) {
            this.f40343s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f40343s = 6;
        } else {
            this.f40343s = 3;
        }
        if (i12 != this.f40343s && (mm0Var = this.d) == this.U) {
            this.f40342r0 = true;
            mm0Var.l();
            this.f40342r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40342r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ch.b bVar) {
        fh.e eVar = new fh.e(null);
        eVar.e = new gh.a(0);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f10483f = 1.0f;
        eVar.h = 1.0f;
        a10 a10Var = this.m0;
        eh.d c10 = bVar.c(a10Var, eVar, false);
        a10Var.f37641b = c10;
        c10.x(AndroidUtilities.dp(11.5f));
        a10Var.f37641b.w(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.ap0 ap0Var) {
        this.f40332i0 = ap0Var;
    }

    public void setUiCallback(i10 i10Var) {
        this.f40338o0 = i10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f40339p0 = z10;
    }

    @Override
    public final void updateColors() {
        try {
            a10 a10Var = this.m0;
            if (a10Var != null) {
                a10Var.updateColors();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
