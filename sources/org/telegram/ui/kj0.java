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
public class kj0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.kj0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final x5 Z;
    public TLRPC.ChatFull f34384a;
    public FrameLayout f34385a0;
    public final long f34386b;
    public gj0 f34387b0;
    public final int f34388c;
    public hg.f f34389c0;
    public ij0 d;
    public final boolean f34390d0;
    public org.telegram.ui.Components.tz e;
    public cb1 f34391e0;
    public org.telegram.ui.Components.vl0 f34392f;
    public s4.c0 h;
    public final MessageObject f34393n;
    public ra1 f34394r;
    public ra1 f34395s;
    public final LruCache v;
    public eb1 f34396w;
    public final ArrayList f34397x;
    public boolean f34398y;

    public kj0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f34397x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new x5(this, 10);
        this.f34393n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f34386b = messageObject.getChatId();
            this.f34388c = messageObject.getId();
        } else {
            this.f34386b = -messageObject.getFromChatId();
            this.f34388c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f34384a = getMessagesController().getChatFull(this.f34386b);
    }

    public static void U(kj0 kj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        kj0Var.f34398y = true;
        if (tL_error != null) {
            kj0Var.g0();
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
        kj0Var.f34394r = fb1.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        kj0Var.f34395s = fb1.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        ra1 ra1Var = kj0Var.f34394r;
        if (ra1Var != null && ra1Var.d.f10590a.length <= 5) {
            kj0Var.f34398y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            ra1 ra1Var2 = kj0Var.f34394r;
            tL_loadAsyncGraph.token = ra1Var2.f36316g;
            long[] jArr = ra1Var2.d.f10590a;
            tL_loadAsyncGraph.f17429x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(kj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(kj0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new aa(kj0Var, kj0Var.f34394r.f36316g + "_" + tL_loadAsyncGraph.f17429x, tL_loadAsyncGraph, 24), null, null, 0, kj0Var.f34384a.stats_dc, 1, true), kj0Var.classGuid);
            return;
        }
        kj0Var.g0();
    }

    public static void V(kj0 kj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = kj0Var.f34397x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                kj0Var.G = tL_publicForwards.next_offset;
            } else {
                kj0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                kj0Var.U = i10;
            } else if (kj0Var.U == 0) {
                kj0Var.U = tL_publicForwards.forwards.size();
            }
            if (kj0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            kj0Var.V = z10;
            kj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            kj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f17435id;
                    MessageObject messageObject = new MessageObject(kj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(kj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.tz tzVar = kj0Var.e;
            if (tzVar != null) {
                tzVar.c();
            }
        }
        kj0Var.F = true;
        kj0Var.E = false;
        kj0Var.g0();
    }

    public static void W(kj0 kj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = kj0Var.f34397x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                kj0Var.G = tL_publicForwards.next_offset;
            } else {
                kj0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                kj0Var.U = i10;
            } else if (kj0Var.U == 0) {
                kj0Var.U = tL_publicForwards.forwards.size();
            }
            if (kj0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            kj0Var.V = z10;
            kj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            kj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f17435id;
                    MessageObject messageObject = new MessageObject(kj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(kj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.tz tzVar = kj0Var.e;
            if (tzVar != null) {
                tzVar.c();
            }
        }
        kj0Var.F = true;
        kj0Var.E = false;
        kj0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.a2.o(R.string.StoryNotFound, org.telegram.ui.Components.wc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.E) {
            return;
        }
        this.E = true;
        ij0 ij0Var = this.d;
        if (ij0Var != null) {
            ij0Var.l();
        }
        MessageObject messageObject = this.f34393n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f17428id = messageObject.storyItem.f17435id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f34386b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new ej0(this, 1), null, null, 0, this.f34384a.stats_dc, 1, true), this.classGuid);
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new ej0(this, 2), null, null, 0, this.f34384a.stats_dc, 1, true), this.classGuid);
    }

    public final void c0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f34393n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f17437id = messageObject.storyItem.f17435id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f34386b);
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
        getConnectionsManager().sendRequest(tL_getMessageStats, new ej0(this, 0), null, null, 0, this.f34384a.stats_dc, 1, true);
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.e = tzVar;
        tzVar.setText(LocaleController.getString(R.string.NoResult));
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
        org.telegram.messenger.em.k(R.string.LoadingStatsDescription, textView2, 1);
        this.T.addView(this.S, w7.a6.t(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, w7.a6.t(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, w7.a6.q(-2, -2, 1));
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, w7.a6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, getResourceProvider());
        this.f34392f = vl0Var;
        vl0Var.o1();
        org.telegram.ui.Components.vl0 vl0Var2 = this.f34392f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.h = c0Var;
        vl0Var2.setLayoutManager(c0Var);
        ((s4.f1) this.f34392f.getItemAnimator()).f41645m = false;
        org.telegram.ui.Components.vl0 vl0Var3 = this.f34392f;
        ij0 ij0Var = new ij0(this, context);
        this.d = ij0Var;
        vl0Var3.setAdapter(ij0Var);
        org.telegram.ui.Components.vl0 vl0Var4 = this.f34392f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        vl0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f34392f);
        this.f34392f.setOnItemClickListener(new i(this, 18));
        this.f34392f.setOnItemLongClickListener(new iu(this, 23));
        this.f34392f.setOnScrollListener(new j3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f34385a0 = frameLayout3;
        frameLayout3.addView(this.f34392f, w7.a6.c(-1.0f, -1));
        this.f34385a0.addView(this.e, w7.a6.c(-1.0f, -1));
        this.f34385a0.setVisibility(8);
        frameLayout2.addView(this.f34385a0, w7.a6.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.Z, 300L);
        g0();
        this.f34392f.setEmptyView(this.e);
        this.f34387b0 = new gj0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.W = imageReceiver;
        imageReceiver.setParentView(this.f34387b0);
        this.W.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.Y = false;
        MessageObject messageObject = this.f34393n;
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
                            this.W.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f34393n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.W.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f34393n, 0);
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
                charSequence = Emoji.replaceEmoji(charSequence2, this.f34387b0.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequence = messageObject.messageText;
            }
            if (!messageObject.isVideo() && !messageObject.isPhoto()) {
                this.f34387b0.setSubtitle(charSequence);
            } else {
                gj0 gj0Var = this.f34387b0;
                if (gj0Var.getSubtitleTextView() != null) {
                    gj0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Y && !messageObject.isStory()) {
            i11 = 56;
        } else {
            this.f34387b0.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i11 = 50;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        gj0 gj0Var2 = this.f34387b0;
        if (!this.inPreviewMode) {
            f7 = i11;
        } else {
            f7 = 0.0f;
        }
        lVar.addView(gj0Var2, 0, w7.a6.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        e0();
        this.f34387b0.i(org.telegram.ui.ActionBar.j6.v0(i13, getResourceProvider()), org.telegram.ui.ActionBar.j6.v0(i14, getResourceProvider()));
        View subtitleTextView = this.f34387b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.l5) {
            ((org.telegram.ui.ActionBar.l5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i14, getResourceProvider()));
        }
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, getResourceProvider()), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18327z8, getResourceProvider()), false);
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 9));
        this.f34387b0.setOnClickListener(new l60(this, 10));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).c(0);
        } else if (view instanceof pa1) {
            ((pa1) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.c7) {
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, getResourceProvider())), org.telegram.ui.ActionBar.j6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7), 0, 0);
            vqVar.f28580w = true;
            view.setBackground(vqVar);
        } else if (view instanceof jg.c) {
            ((jg.c) view).a();
        } else if (view instanceof jj0) {
            int i10 = jj0.d;
            ((jj0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.k3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, getResourceProvider()));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f34384a == null && chatFull.f17196id == this.f34386b) {
                e0();
                this.f34384a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.f34393n;
        if (messageObject.isStory()) {
            this.f34387b0.setTitle(LocaleController.getString(R.string.StoryStatistics));
            gj0 gj0Var = this.f34387b0;
            if (gj0Var.getSubtitleTextView() != null) {
                gj0Var.getSubtitleTextView().setVisibility(8);
            }
            gj0 gj0Var2 = this.f34387b0;
            gj0Var2.f24455b = true;
            gj0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.f34387b0.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f34393n);
                this.f34387b0.setClipChildren(false);
                this.f34387b0.getAvatarImageView().setScaleX(0.96f);
                this.f34387b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f34387b0.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f34386b));
        if (chat != null && !this.Y) {
            this.f34387b0.setChatAvatar(chat);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.f34390d0 && (chatFull = this.f34384a) != null && chatFull.can_view_stats) {
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
        if (this.F && this.f34398y) {
            AndroidUtilities.cancelRunOnUIThread(this.Z);
            if (this.f34385a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.voip.v2(this, 16));
                this.f34385a0.setVisibility(0);
                this.f34385a0.setAlpha(0.0f);
                this.f34385a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f34394r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f34395s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f34397x;
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
        ij0 ij0Var = this.d;
        if (ij0Var != null) {
            ij0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.l5 l5Var;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        gj0 gj0Var = this.f34387b0;
        View view = null;
        if (gj0Var != null) {
            l5Var = gj0Var.getTitleTextView();
        } else {
            l5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(l5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        gj0 gj0Var2 = this.f34387b0;
        if (gj0Var2 != null) {
            view = gj0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34392f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        fb1.k0(this.f34394r, arrayList, eVar);
        fb1.k0(this.f34395s, arrayList, eVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f34384a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f34386b, this.classGuid, true);
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
        ij0 ij0Var = this.d;
        if (ij0Var != null) {
            ij0Var.l();
        }
    }

    public kj0(MessageObject messageObject, boolean z10, long j3) {
        super(null);
        this.v = new LruCache(15);
        this.f34397x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new x5(this, 10);
        this.f34393n = messageObject;
        this.f34388c = 0;
        this.f34386b = j3;
        this.f34384a = getMessagesController().getChatFull(j3);
        this.f34390d0 = z10;
    }
}
