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
public class ej0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.bj0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final x5 Z;
    public TLRPC.ChatFull f32944a;
    public FrameLayout f32945a0;
    public final long f32946b;
    public aj0 f32947b0;
    public final int f32948c;
    public ig.f f32949c0;
    public cj0 d;
    public final boolean f32950d0;
    public org.telegram.ui.Components.nz e;
    public oa1 f32951e0;
    public org.telegram.ui.Components.ml0 f32952f;
    public s4.c0 h;
    public final MessageObject f32953n;
    public da1 f32954r;
    public da1 f32955s;
    public final LruCache v;
    public qa1 f32956w;
    public final ArrayList f32957x;
    public boolean f32958y;

    public ej0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f32957x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new x5(this, 10);
        this.f32953n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f32946b = messageObject.getChatId();
            this.f32948c = messageObject.getId();
        } else {
            this.f32946b = -messageObject.getFromChatId();
            this.f32948c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f32944a = getMessagesController().getChatFull(this.f32946b);
    }

    public static void U(ej0 ej0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        ej0Var.f32958y = true;
        if (tL_error != null) {
            ej0Var.g0();
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
        ej0Var.f32954r = ra1.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        ej0Var.f32955s = ra1.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        da1 da1Var = ej0Var.f32954r;
        if (da1Var != null && da1Var.d.f12990a.length <= 5) {
            ej0Var.f32958y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            da1 da1Var2 = ej0Var.f32954r;
            tL_loadAsyncGraph.token = da1Var2.f32555g;
            long[] jArr = da1Var2.d.f12990a;
            tL_loadAsyncGraph.f18312x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(ej0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(ej0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new aa(ej0Var, ej0Var.f32954r.f32555g + "_" + tL_loadAsyncGraph.f18312x, tL_loadAsyncGraph, 24), null, null, 0, ej0Var.f32944a.stats_dc, 1, true), ej0Var.classGuid);
            return;
        }
        ej0Var.g0();
    }

    public static void V(ej0 ej0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = ej0Var.f32957x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ej0Var.G = tL_publicForwards.next_offset;
            } else {
                ej0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                ej0Var.U = i10;
            } else if (ej0Var.U == 0) {
                ej0Var.U = tL_publicForwards.forwards.size();
            }
            if (ej0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ej0Var.V = z10;
            ej0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            ej0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f18318id;
                    MessageObject messageObject = new MessageObject(ej0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(ej0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.nz nzVar = ej0Var.e;
            if (nzVar != null) {
                nzVar.c();
            }
        }
        ej0Var.F = true;
        ej0Var.E = false;
        ej0Var.g0();
    }

    public static void W(ej0 ej0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = ej0Var.f32957x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ej0Var.G = tL_publicForwards.next_offset;
            } else {
                ej0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                ej0Var.U = i10;
            } else if (ej0Var.U == 0) {
                ej0Var.U = tL_publicForwards.forwards.size();
            }
            if (ej0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ej0Var.V = z10;
            ej0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            ej0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f18318id;
                    MessageObject messageObject = new MessageObject(ej0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(ej0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.nz nzVar = ej0Var.e;
            if (nzVar != null) {
                nzVar.c();
            }
        }
        ej0Var.F = true;
        ej0Var.E = false;
        ej0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.z0.o(R.string.StoryNotFound, org.telegram.ui.Components.xc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.E) {
            return;
        }
        this.E = true;
        cj0 cj0Var = this.d;
        if (cj0Var != null) {
            cj0Var.l();
        }
        MessageObject messageObject = this.f32953n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f18311id = messageObject.storyItem.f18318id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f32946b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new yi0(this, 1), null, null, 0, this.f32944a.stats_dc, 1, true), this.classGuid);
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new yi0(this, 2), null, null, 0, this.f32944a.stats_dc, 1, true), this.classGuid);
    }

    public final void c0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f32953n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f18320id = messageObject.storyItem.f18318id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f32946b);
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
        getConnectionsManager().sendRequest(tL_getMessageStats, new yi0(this, 0), null, null, 0, this.f32944a.stats_dc, 1, true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        float f7;
        CharSequence charSequence;
        String str;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(context, null);
        this.e = nzVar;
        nzVar.setText(LocaleController.getString(R.string.NoResult));
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
        int i13 = org.telegram.ui.ActionBar.h6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, getResourceProvider()));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.h6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.ul.l(R.string.LoadingStatsDescription, textView2, 1);
        this.T.addView(this.S, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, w7.x5.q(-2, -2, 1));
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, w7.x5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, getResourceProvider());
        this.f32952f = ml0Var;
        ml0Var.p1();
        org.telegram.ui.Components.ml0 ml0Var2 = this.f32952f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.h = c0Var;
        ml0Var2.setLayoutManager(c0Var);
        ((s4.f1) this.f32952f.getItemAnimator()).f42662m = false;
        org.telegram.ui.Components.ml0 ml0Var3 = this.f32952f;
        cj0 cj0Var = new cj0(this, context);
        this.d = cj0Var;
        ml0Var3.setAdapter(cj0Var);
        org.telegram.ui.Components.ml0 ml0Var4 = this.f32952f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        ml0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f32952f);
        this.f32952f.setOnItemClickListener(new i(this, 18));
        this.f32952f.setOnItemLongClickListener(new eu(this, 23));
        this.f32952f.setOnScrollListener(new i3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f32945a0 = frameLayout3;
        frameLayout3.addView(this.f32952f, w7.x5.c(-1.0f, -1));
        this.f32945a0.addView(this.e, w7.x5.c(-1.0f, -1));
        this.f32945a0.setVisibility(8);
        frameLayout2.addView(this.f32945a0, w7.x5.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.Z, 300L);
        g0();
        this.f32952f.setEmptyView(this.e);
        this.f32947b0 = new aj0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.W = imageReceiver;
        imageReceiver.setParentView(this.f32947b0);
        this.W.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.Y = false;
        MessageObject messageObject = this.f32953n;
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
                            this.W.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f32953n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.W.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f32953n, 0);
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
                charSequence = Emoji.replaceEmoji(charSequence2, this.f32947b0.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequence = messageObject.messageText;
            }
            if (!messageObject.isVideo() && !messageObject.isPhoto()) {
                this.f32947b0.setSubtitle(charSequence);
            } else {
                aj0 aj0Var = this.f32947b0;
                if (aj0Var.getSubtitleTextView() != null) {
                    aj0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Y && !messageObject.isStory()) {
            i11 = 56;
        } else {
            this.f32947b0.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i11 = 50;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        aj0 aj0Var2 = this.f32947b0;
        if (!this.inPreviewMode) {
            f7 = i11;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(aj0Var2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        e0();
        this.f32947b0.i(org.telegram.ui.ActionBar.h6.v0(i13, getResourceProvider()), org.telegram.ui.ActionBar.h6.v0(i14, getResourceProvider()));
        View subtitleTextView = this.f32947b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.i5) {
            ((org.telegram.ui.ActionBar.i5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i14, getResourceProvider()));
        }
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, getResourceProvider()), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19191z8, getResourceProvider()), false);
        hg.c.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 9));
        this.f32947b0.setOnClickListener(new h60(this, 10));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).c(0);
        } else if (view instanceof ba1) {
            ((ba1) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, getResourceProvider())), org.telegram.ui.ActionBar.h6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f18753b7), 0, 0);
            qqVar.f27431w = true;
            view.setBackground(qqVar);
        } else if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof dj0) {
            int i10 = dj0.d;
            ((dj0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.k3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, getResourceProvider()));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f32944a == null && chatFull.f18084id == this.f32946b) {
                e0();
                this.f32944a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.f32953n;
        if (messageObject.isStory()) {
            this.f32947b0.setTitle(LocaleController.getString(R.string.StoryStatistics));
            aj0 aj0Var = this.f32947b0;
            if (aj0Var.getSubtitleTextView() != null) {
                aj0Var.getSubtitleTextView().setVisibility(8);
            }
            aj0 aj0Var2 = this.f32947b0;
            aj0Var2.f24018b = true;
            aj0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.f32947b0.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f32953n);
                this.f32947b0.setClipChildren(false);
                this.f32947b0.getAvatarImageView().setScaleX(0.96f);
                this.f32947b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f32947b0.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f32946b));
        if (chat != null && !this.Y) {
            this.f32947b0.setChatAvatar(chat);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.f32950d0 && (chatFull = this.f32944a) != null && chatFull.can_view_stats) {
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
        if (this.F && this.f32958y) {
            AndroidUtilities.cancelRunOnUIThread(this.Z);
            if (this.f32945a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.u81(this, 26));
                this.f32945a0.setVisibility(0);
                this.f32945a0.setAlpha(0.0f);
                this.f32945a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f32954r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f32955s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f32957x;
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
        cj0 cj0Var = this.d;
        if (cj0Var != null) {
            cj0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.i5 i5Var;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        aj0 aj0Var = this.f32947b0;
        View view = null;
        if (aj0Var != null) {
            i5Var = aj0Var.getTitleTextView();
        } else {
            i5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(i5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Oi));
        aj0 aj0Var2 = this.f32947b0;
        if (aj0Var2 != null) {
            view = aj0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18753b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f18973n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32952f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.h6.F8));
        ra1.k0(this.f32954r, arrayList, eVar);
        ra1.k0(this.f32955s, arrayList, eVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f32944a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f32946b, this.classGuid, true);
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
        cj0 cj0Var = this.d;
        if (cj0Var != null) {
            cj0Var.l();
        }
    }

    public ej0(MessageObject messageObject, boolean z10, long j3) {
        super(null);
        this.v = new LruCache(15);
        this.f32957x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new x5(this, 10);
        this.f32953n = messageObject;
        this.f32948c = 0;
        this.f32946b = j3;
        this.f32944a = getMessagesController().getChatFull(j3);
        this.f32950d0 = z10;
    }
}
