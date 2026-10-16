package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public class pj0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final a0.g R;
    public org.telegram.ui.Components.bk0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final a6 Z;
    public TLRPC.ChatFull f38946a;
    public FrameLayout f38947a0;
    public final long f38948b;
    public lj0 f38949b0;
    public final int f38950c;
    public jg.f f38951c0;
    public nj0 d;
    public final boolean f38952d0;
    public org.telegram.ui.Components.yz e;
    public eb1 f38953e0;
    public org.telegram.ui.Components.mm0 f38954f;
    public s4.b0 h;
    public final MessageObject f38955n;
    public ta1 f38956r;
    public ta1 f38957s;
    public final LruCache v;
    public gb1 f38958w;
    public final ArrayList f38959x;
    public boolean f38960y;

    public pj0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f38959x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new a6(this, 10);
        this.f38955n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f38948b = messageObject.getChatId();
            this.f38950c = messageObject.getId();
        } else {
            this.f38948b = -messageObject.getFromChatId();
            this.f38950c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f38946a = getMessagesController().getChatFull(this.f38948b);
    }

    public static void U(pj0 pj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        pj0Var.f38960y = true;
        if (tL_error != null) {
            pj0Var.g0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        pj0Var.f38956r = hb1.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        pj0Var.f38957s = hb1.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        ta1 ta1Var = pj0Var.f38956r;
        if (ta1Var != null && ta1Var.d.f14251a.length <= 5) {
            pj0Var.f38960y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            ta1 ta1Var2 = pj0Var.f38956r;
            tL_loadAsyncGraph.token = ta1Var2.f40053g;
            long[] jArr = ta1Var2.d.f14251a;
            tL_loadAsyncGraph.f19145x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(pj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(pj0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new fa(pj0Var, pj0Var.f38956r.f40053g + "_" + tL_loadAsyncGraph.f19145x, tL_loadAsyncGraph, 24), null, null, 0, pj0Var.f38946a.stats_dc, 1, true), pj0Var.classGuid);
            return;
        }
        pj0Var.g0();
    }

    public static void V(pj0 pj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = pj0Var.f38959x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                pj0Var.G = tL_publicForwards.next_offset;
            } else {
                pj0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                pj0Var.U = i10;
            } else if (pj0Var.U == 0) {
                pj0Var.U = tL_publicForwards.forwards.size();
            }
            if (pj0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            pj0Var.V = z10;
            pj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            pj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f19151id;
                    MessageObject messageObject = new MessageObject(pj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(pj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.yz yzVar = pj0Var.e;
            if (yzVar != null) {
                yzVar.c();
            }
        }
        pj0Var.F = true;
        pj0Var.E = false;
        pj0Var.g0();
    }

    public static void W(pj0 pj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = pj0Var.f38959x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                pj0Var.G = tL_publicForwards.next_offset;
            } else {
                pj0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                pj0Var.U = i10;
            } else if (pj0Var.U == 0) {
                pj0Var.U = tL_publicForwards.forwards.size();
            }
            if (pj0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            pj0Var.V = z10;
            pj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            pj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f19151id;
                    MessageObject messageObject = new MessageObject(pj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(pj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.yz yzVar = pj0Var.e;
            if (yzVar != null) {
                yzVar.c();
            }
        }
        pj0Var.F = true;
        pj0Var.E = false;
        pj0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.g0.q(R.string.StoryNotFound, org.telegram.ui.Components.zc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.E) {
            return;
        }
        this.E = true;
        nj0 nj0Var = this.d;
        if (nj0Var != null) {
            nj0Var.l();
        }
        MessageObject messageObject = this.f38955n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f19144id = messageObject.storyItem.f19151id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f38948b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new ij0(this, 1), null, null, 0, this.f38946a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
        } else {
            tL_getMessagePublicForwards.msg_id = messageObject.getId();
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
        }
        String str3 = this.G;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new ij0(this, 2), null, null, 0, this.f38946a.stats_dc, 1, true), this.classGuid);
    }

    public final void c0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f38955n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f19153id = messageObject.storyItem.f19151id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f38948b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = messageObject.getId();
                tL_getMessageStats2.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new ij0(this, 0), null, null, 0, this.f38946a.stats_dc, 1, true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        CharSequence charSequence;
        String str;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.e = yzVar;
        yzVar.setText(LocaleController.getString(R.string.NoResult));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.S = imageView;
        imageView.setAutoRepeat(true);
        this.S.f(R.raw.statistic_preload, 120, 120, null);
        this.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, getResourceProvider()));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.sk.m(R.string.LoadingStatsDescription, textView2, 1);
        this.T.addView(this.S, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, w7.z5.q(-2, -2, 1));
        float f7 = 0.0f;
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, 240, 17));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, getResourceProvider());
        this.f38954f = mm0Var;
        mm0Var.p1();
        org.telegram.ui.Components.mm0 mm0Var2 = this.f38954f;
        s4.b0 b0Var = new s4.b0(1, false);
        this.h = b0Var;
        mm0Var2.setLayoutManager(b0Var);
        ((s4.e1) this.f38954f.getItemAnimator()).f44872m = false;
        org.telegram.ui.Components.mm0 mm0Var3 = this.f38954f;
        nj0 nj0Var = new nj0(this, context);
        this.d = nj0Var;
        mm0Var3.setAdapter(nj0Var);
        org.telegram.ui.Components.mm0 mm0Var4 = this.f38954f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        mm0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f38954f);
        this.f38954f.setOnItemClickListener(new i(this, 19));
        this.f38954f.setOnItemLongClickListener(new mu(this, 22));
        this.f38954f.setOnScrollListener(new k3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f38947a0 = frameLayout3;
        frameLayout3.addView(this.f38954f, w7.z5.d(-1.0f, -1));
        this.f38947a0.addView(this.e, w7.z5.d(-1.0f, -1));
        this.f38947a0.setVisibility(8);
        frameLayout2.addView(this.f38947a0, w7.z5.d(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.Z, 300L);
        g0();
        this.f38954f.setEmptyView(this.e);
        this.f38949b0 = new lj0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.W = imageReceiver;
        imageReceiver.setParentView(this.f38949b0);
        this.W.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.Y = false;
        MessageObject messageObject = this.f38955n;
        if (!messageObject.isStory()) {
            if (!messageObject.needDrawBluredPreview() && (messageObject.isPhoto() || messageObject.isNewGif() || messageObject.isVideo())) {
                if (messageObject.isWebpage()) {
                    str = messageObject.messageOwner.media.webpage.type;
                } else {
                    str = null;
                }
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                        photoSize = closestPhotoSizeWithSize2;
                    }
                    if (closestPhotoSizeWithSize != null) {
                        this.Y = true;
                        this.X = messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (!messageObject.mediaExists && !DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject) && !FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            this.W.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f38955n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.W.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f38955n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = messageObject.caption;
            } else if (!TextUtils.isEmpty(messageObject.messageOwner.message)) {
                CharSequence charSequence2 = messageObject.messageText;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, 150);
                }
                charSequence = Emoji.replaceEmoji(charSequence2, this.f38949b0.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequence = messageObject.messageText;
            }
            if (!messageObject.isVideo() && !messageObject.isPhoto()) {
                this.f38949b0.setSubtitle(charSequence);
            } else {
                lj0 lj0Var = this.f38949b0;
                if (lj0Var.getSubtitleTextView() != null) {
                    lj0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Y && !messageObject.isStory()) {
            i11 = 56;
        } else {
            this.f38949b0.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i11 = 50;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        lj0 lj0Var2 = this.f38949b0;
        if (!this.inPreviewMode) {
            f7 = i11;
        }
        kVar.addView(lj0Var2, 0, w7.z5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        e0();
        this.f38949b0.i(org.telegram.ui.ActionBar.g6.w0(i13, getResourceProvider()), org.telegram.ui.ActionBar.g6.w0(i14, getResourceProvider()));
        View subtitleTextView = this.f38949b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
            ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i14, getResourceProvider()));
        }
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, getResourceProvider()), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007z8, getResourceProvider()), false);
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 11));
        this.f38949b0.setOnClickListener(new t60(this, 9));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).c(0);
        } else if (view instanceof ra1) {
            ((ra1) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, getResourceProvider())), org.telegram.ui.ActionBar.g6.W0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19563b7), 0, 0);
            crVar.f23883w = true;
            view.setBackground(crVar);
        } else if (view instanceof lg.c) {
            ((lg.c) view).a();
        } else if (view instanceof oj0) {
            int i10 = oj0.d;
            ((oj0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.l3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, getResourceProvider()));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f38946a == null && chatFull.f18917id == this.f38948b) {
                e0();
                this.f38946a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.f38955n;
        if (messageObject.isStory()) {
            this.f38949b0.setTitle(LocaleController.getString(R.string.StoryStatistics));
            lj0 lj0Var = this.f38949b0;
            if (lj0Var.getSubtitleTextView() != null) {
                lj0Var.getSubtitleTextView().setVisibility(8);
            }
            lj0 lj0Var2 = this.f38949b0;
            lj0Var2.f28588b = true;
            lj0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.f38949b0.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f38955n);
                this.f38949b0.setClipChildren(false);
                this.f38949b0.getAvatarImageView().setScaleX(0.96f);
                this.f38949b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f38949b0.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f38948b));
        if (chat != null && !this.Y) {
            this.f38949b0.setChatAvatar(chat);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.f38952d0 && (chatFull = this.f38946a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
            ArrayList arrayList = n10.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            n10.removeAllViews();
            n10.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    public final void g0() {
        a0.g gVar = this.R;
        gVar.clear();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.N = -1;
        this.Q = 0;
        if (this.F && this.f38960y) {
            AndroidUtilities.cancelRunOnUIThread(this.Z);
            if (this.f38947a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new kj0(this, 0));
                this.f38947a0.setVisibility(0);
                this.f38947a0.setAlpha(0.0f);
                this.f38947a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f38956r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f38957s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f38959x;
            if (!arrayList.isEmpty()) {
                int i13 = this.Q;
                int i14 = i13 + 1;
                this.Q = i14;
                this.H = i13;
                this.I = i14;
                int size = arrayList.size() + i14;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i15 = this.Q;
                    this.Q = i15 + 1;
                    this.K = i15;
                }
            }
        }
        nj0 nj0Var = this.d;
        if (nj0Var != null) {
            nj0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.h5 h5Var;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        lj0 lj0Var = this.f38949b0;
        View view = null;
        if (lj0Var != null) {
            h5Var = lj0Var.getTitleTextView();
        } else {
            h5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        lj0 lj0Var2 = this.f38949b0;
        if (lj0Var2 != null) {
            view = lj0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19563b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f19988y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f19784n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38954f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.g6.f19852r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        hb1.k0(this.f38956r, arrayList, eVar);
        hb1.k0(this.f38957s, arrayList, eVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f38946a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f38948b, this.classGuid, true);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        nj0 nj0Var = this.d;
        if (nj0Var != null) {
            nj0Var.l();
        }
    }

    public pj0(MessageObject messageObject, boolean z10, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f38959x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new a6(this, 10);
        this.f38955n = messageObject;
        this.f38950c = 0;
        this.f38948b = j10;
        this.f38946a = getMessagesController().getChatFull(j10);
        this.f38952d0 = z10;
    }
}
