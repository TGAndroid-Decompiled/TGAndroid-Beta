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
public class cj0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public boolean C;
    public String D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final a0.g O;
    public org.telegram.ui.Components.jj0 P;
    public LinearLayout Q;
    public int R;
    public boolean S;
    public ImageReceiver T;
    public boolean U;
    public boolean V;
    public final b6 W;
    public FrameLayout X;
    public yi0 Y;
    public vf.f Z;
    public TLRPC.ChatFull f33167a;
    public final boolean f33168a0;
    public final long f33169b;
    public la1 f33170b0;
    public final int f33171c;
    public aj0 d;
    public org.telegram.ui.Components.mz e;
    public org.telegram.ui.Components.rl0 f33172f;
    public f2.i0 h;
    public final MessageObject f33173n;
    public aa1 f33174r;
    public aa1 f33175s;
    public final LruCache v;
    public na1 f33176w;
    public final ArrayList f33177x;
    public boolean f33178y;

    public cj0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f33177x = new ArrayList();
        this.D = null;
        this.O = new a0.g(0);
        this.W = new b6(this, 10);
        this.f33173n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f33169b = messageObject.getChatId();
            this.f33171c = messageObject.getId();
        } else {
            this.f33169b = -messageObject.getFromChatId();
            this.f33171c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f33167a = getMessagesController().getChatFull(this.f33169b);
    }

    public static void U(cj0 cj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        cj0Var.f33178y = true;
        if (tL_error != null) {
            cj0Var.g0();
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
        cj0Var.f33174r = oa1.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        cj0Var.f33175s = oa1.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        aa1 aa1Var = cj0Var.f33174r;
        if (aa1Var != null && aa1Var.d.f46606a.length <= 5) {
            cj0Var.f33178y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            aa1 aa1Var2 = cj0Var.f33174r;
            tL_loadAsyncGraph.token = aa1Var2.f32530g;
            long[] jArr = aa1Var2.d.f46606a;
            tL_loadAsyncGraph.f19388x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(cj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(cj0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new da(cj0Var, cj0Var.f33174r.f32530g + "_" + tL_loadAsyncGraph.f19388x, tL_loadAsyncGraph, 24), null, null, 0, cj0Var.f33167a.stats_dc, 1, true), cj0Var.classGuid);
            return;
        }
        cj0Var.g0();
    }

    public static void V(cj0 cj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z4;
        ArrayList arrayList = cj0Var.f33177x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                cj0Var.D = tL_publicForwards.next_offset;
            } else {
                cj0Var.D = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                cj0Var.R = i10;
            } else if (cj0Var.R == 0) {
                cj0Var.R = tL_publicForwards.forwards.size();
            }
            if (cj0Var.D == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            cj0Var.S = z4;
            cj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            cj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f19394id;
                    MessageObject messageObject = new MessageObject(cj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(cj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.mz mzVar = cj0Var.e;
            if (mzVar != null) {
                mzVar.c();
            }
        }
        cj0Var.C = true;
        cj0Var.B = false;
        cj0Var.g0();
    }

    public static void W(cj0 cj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z4;
        ArrayList arrayList = cj0Var.f33177x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                cj0Var.D = tL_publicForwards.next_offset;
            } else {
                cj0Var.D = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                cj0Var.R = i10;
            } else if (cj0Var.R == 0) {
                cj0Var.R = tL_publicForwards.forwards.size();
            }
            if (cj0Var.D == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            cj0Var.S = z4;
            cj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            cj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f19394id;
                    MessageObject messageObject = new MessageObject(cj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(cj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.mz mzVar = cj0Var.e;
            if (mzVar != null) {
                mzVar.c();
            }
        }
        cj0Var.C = true;
        cj0Var.B = false;
        cj0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            kf.k0.v(R.string.StoryNotFound, org.telegram.ui.Components.qc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.B) {
            return;
        }
        this.B = true;
        aj0 aj0Var = this.d;
        if (aj0Var != null) {
            aj0Var.l();
        }
        MessageObject messageObject = this.f33173n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f19387id = messageObject.storyItem.f19394id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f33169b);
            String str2 = this.D;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new wi0(this, 1), null, null, 0, this.f33167a.stats_dc, 1, true), this.classGuid);
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
        String str3 = this.D;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new wi0(this, 2), null, null, 0, this.f33167a.stats_dc, 1, true), this.classGuid);
    }

    public final void c0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f33173n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f19396id = messageObject.storyItem.f19394id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f33169b);
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
        getConnectionsManager().sendRequest(tL_getMessageStats, new wi0(this, 0), null, null, 0, this.f33167a.stats_dc, 1, true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        float f10;
        CharSequence charSequence;
        String str;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.e = mzVar;
        mzVar.setText(LocaleController.getString(R.string.NoResult));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.P = imageView;
        imageView.setAutoRepeat(true);
        this.P.f(R.raw.statistic_preload, 120, 120, null);
        this.P.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.j6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, getResourceProvider()));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.y3.r(R.string.LoadingStatsDescription, textView2, 1);
        this.Q.addView(this.P, k7.b6.t(120, 120, 1, 0, 0, 0, 20));
        this.Q.addView(textView, k7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        this.Q.addView(textView2, k7.b6.q(-2, -2, 1));
        this.Q.setAlpha(0.0f);
        frameLayout2.addView(this.Q, k7.b6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, getResourceProvider());
        this.f33172f = rl0Var;
        rl0Var.o1();
        org.telegram.ui.Components.rl0 rl0Var2 = this.f33172f;
        f2.i0 i0Var = new f2.i0(1, false);
        this.h = i0Var;
        rl0Var2.setLayoutManager(i0Var);
        ((f2.o1) this.f33172f.getItemAnimator()).f5807m = false;
        org.telegram.ui.Components.rl0 rl0Var3 = this.f33172f;
        aj0 aj0Var = new aj0(this, context);
        this.d = aj0Var;
        rl0Var3.setAdapter(aj0Var);
        org.telegram.ui.Components.rl0 rl0Var4 = this.f33172f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        rl0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f33172f);
        this.f33172f.setOnItemClickListener(new j(this, 18));
        this.f33172f.setOnItemLongClickListener(new hu(this, 23));
        this.f33172f.setOnScrollListener(new n3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.X = frameLayout3;
        frameLayout3.addView(this.f33172f, k7.b6.c(-1.0f, -1));
        this.X.addView(this.e, k7.b6.c(-1.0f, -1));
        this.X.setVisibility(8);
        frameLayout2.addView(this.X, k7.b6.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.W, 300L);
        g0();
        this.f33172f.setEmptyView(this.e);
        this.Y = new yi0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.T = imageReceiver;
        imageReceiver.setParentView(this.Y);
        this.T.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.V = false;
        MessageObject messageObject = this.f33173n;
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
                        this.V = true;
                        this.U = messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (!messageObject.mediaExists && !DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject) && !FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            this.T.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f33173n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.T.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f33173n, 0);
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
                charSequence = Emoji.replaceEmoji(charSequence2, this.Y.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequence = messageObject.messageText;
            }
            if (!messageObject.isVideo() && !messageObject.isPhoto()) {
                this.Y.setSubtitle(charSequence);
            } else {
                yi0 yi0Var = this.Y;
                if (yi0Var.getSubtitleTextView() != null) {
                    yi0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.V && !messageObject.isStory()) {
            i11 = 56;
        } else {
            this.Y.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i11 = 50;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        yi0 yi0Var2 = this.Y;
        if (!this.inPreviewMode) {
            f10 = i11;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(yi0Var2, 0, k7.b6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        e0();
        this.Y.i(org.telegram.ui.ActionBar.j6.v0(i13, getResourceProvider()), org.telegram.ui.ActionBar.j6.v0(i14, getResourceProvider()));
        View subtitleTextView = this.Y.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
            ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i14, getResourceProvider()));
        }
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, getResourceProvider()), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20275z8, getResourceProvider()), false);
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 26));
        this.Y.setOnClickListener(new g60(this, 10));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).c(0);
        } else if (view instanceof y91) {
            ((y91) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.y6) {
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, getResourceProvider())), org.telegram.ui.ActionBar.j6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19846b7), 0, 0);
            mqVar.f27116w = true;
            view.setBackground(mqVar);
        } else if (view instanceof xf.c) {
            ((xf.c) view).a();
        } else if (view instanceof bj0) {
            int i10 = bj0.d;
            ((bj0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.j3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, getResourceProvider()));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f33167a == null && chatFull.f19160id == this.f33169b) {
                e0();
                this.f33167a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.f33173n;
        if (messageObject.isStory()) {
            this.Y.setTitle(LocaleController.getString(R.string.StoryStatistics));
            yi0 yi0Var = this.Y;
            if (yi0Var.getSubtitleTextView() != null) {
                yi0Var.getSubtitleTextView().setVisibility(8);
            }
            yi0 yi0Var2 = this.Y;
            yi0Var2.f31057b = true;
            yi0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.Y.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f33173n);
                this.Y.setClipChildren(false);
                this.Y.getAvatarImageView().setScaleX(0.96f);
                this.Y.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.Y.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f33169b));
        if (chat != null && !this.V) {
            this.Y.setChatAvatar(chat);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.f33168a0 && (chatFull = this.f33167a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            ArrayList arrayList = n10.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            n10.removeAllViews();
            n10.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    public final void g0() {
        a0.g gVar = this.O;
        gVar.clear();
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = -1;
        this.K = -1;
        this.N = 0;
        if (this.C && this.f33178y) {
            AndroidUtilities.cancelRunOnUIThread(this.W);
            if (this.X.getVisibility() == 8) {
                this.Q.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.f91(this, 25));
                this.X.setVisibility(0);
                this.X.setAlpha(0.0f);
                this.X.animate().alpha(1.0f).start();
            }
            int i10 = this.N;
            this.L = i10;
            this.K = i10 + 1;
            this.N = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f33174r != null) {
                int i11 = this.N;
                this.I = i11;
                this.N = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f33175s != null) {
                int i12 = this.N;
                this.J = i12;
                this.N = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f33177x;
            if (!arrayList.isEmpty()) {
                int i13 = this.N;
                int i14 = i13 + 1;
                this.N = i14;
                this.E = i13;
                this.F = i14;
                int size = arrayList.size() + i14;
                this.G = size;
                this.M = size;
                this.N = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.S) {
                    int i15 = this.N;
                    this.N = i15 + 1;
                    this.H = i15;
                }
            }
        }
        aj0 aj0Var = this.d;
        if (aj0Var != null) {
            aj0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.k5 k5Var;
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.a5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        yi0 yi0Var = this.Y;
        View view = null;
        if (yi0Var != null) {
            k5Var = yi0Var.getTitleTextView();
        } else {
            k5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(k5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        yi0 yi0Var2 = this.Y;
        if (yi0Var2 != null) {
            view = yi0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19846b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20256y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20060n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33172f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.j6.f20126r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        oa1.k0(this.f33174r, arrayList, fVar);
        oa1.k0(this.f33175s, arrayList, fVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f33167a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f33169b, this.classGuid, true);
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
        aj0 aj0Var = this.d;
        if (aj0Var != null) {
            aj0Var.l();
        }
    }

    public cj0(MessageObject messageObject, boolean z4, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f33177x = new ArrayList();
        this.D = null;
        this.O = new a0.g(0);
        this.W = new b6(this, 10);
        this.f33173n = messageObject;
        this.f33171c = 0;
        this.f33169b = j10;
        this.f33167a = getMessagesController().getChatFull(j10);
        this.f33168a0 = z4;
    }
}
