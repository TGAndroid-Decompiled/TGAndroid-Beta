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
public class bj0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.lj0 P;
    public LinearLayout Q;
    public int R;
    public boolean S;
    public ImageReceiver T;
    public boolean U;
    public boolean V;
    public final z5 W;
    public FrameLayout X;
    public xi0 Y;
    public wf.f Z;
    public TLRPC.ChatFull f35536a;
    public final boolean f35537a0;
    public final long f35538b;
    public ea1 f35539b0;
    public final int f35540c;
    public zi0 d;
    public org.telegram.ui.Components.oz f35541e;
    public org.telegram.ui.Components.tl0 f35542f;
    public f2.j0 h;
    public final MessageObject f35543n;
    public t91 f35544r;
    public t91 f35545s;
    public final LruCache v;
    public ga1 f35546w;
    public final ArrayList f35547x;
    public boolean f35548y;

    public bj0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f35547x = new ArrayList();
        this.D = null;
        this.O = new a0.g(0);
        this.W = new z5(this, 10);
        this.f35543n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f35538b = messageObject.getChatId();
            this.f35540c = messageObject.getId();
        } else {
            this.f35538b = -messageObject.getFromChatId();
            this.f35540c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f35536a = getMessagesController().getChatFull(this.f35538b);
    }

    public static void U(bj0 bj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        bj0Var.f35548y = true;
        if (tL_error != null) {
            bj0Var.g0();
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
        bj0Var.f35544r = ha1.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        bj0Var.f35545s = ha1.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        t91 t91Var = bj0Var.f35544r;
        if (t91Var != null && t91Var.d.f50546a.length <= 5) {
            bj0Var.f35548y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            t91 t91Var2 = bj0Var.f35544r;
            tL_loadAsyncGraph.token = t91Var2.f41547g;
            long[] jArr = t91Var2.d.f50546a;
            tL_loadAsyncGraph.f21074x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(bj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(bj0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new ba(bj0Var, bj0Var.f35544r.f41547g + "_" + tL_loadAsyncGraph.f21074x, tL_loadAsyncGraph, 24), null, null, 0, bj0Var.f35536a.stats_dc, 1, true), bj0Var.classGuid);
            return;
        }
        bj0Var.g0();
    }

    public static void V(bj0 bj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z4;
        ArrayList arrayList = bj0Var.f35547x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                bj0Var.D = tL_publicForwards.next_offset;
            } else {
                bj0Var.D = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                bj0Var.R = i10;
            } else if (bj0Var.R == 0) {
                bj0Var.R = tL_publicForwards.forwards.size();
            }
            if (bj0Var.D == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            bj0Var.S = z4;
            bj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            bj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f21080id;
                    MessageObject messageObject = new MessageObject(bj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(bj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.oz ozVar = bj0Var.f35541e;
            if (ozVar != null) {
                ozVar.c();
            }
        }
        bj0Var.C = true;
        bj0Var.B = false;
        bj0Var.g0();
    }

    public static void W(bj0 bj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z4;
        ArrayList arrayList = bj0Var.f35547x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                bj0Var.D = tL_publicForwards.next_offset;
            } else {
                bj0Var.D = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                bj0Var.R = i10;
            } else if (bj0Var.R == 0) {
                bj0Var.R = tL_publicForwards.forwards.size();
            }
            if (bj0Var.D == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            bj0Var.S = z4;
            bj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            bj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f21080id;
                    MessageObject messageObject = new MessageObject(bj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(bj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.oz ozVar = bj0Var.f35541e;
            if (ozVar != null) {
                ozVar.c();
            }
        }
        bj0Var.C = true;
        bj0Var.B = false;
        bj0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            l.d.v(R.string.StoryNotFound, org.telegram.ui.Components.qc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.B) {
            return;
        }
        this.B = true;
        zi0 zi0Var = this.d;
        if (zi0Var != null) {
            zi0Var.l();
        }
        MessageObject messageObject = this.f35543n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f21073id = messageObject.storyItem.f21080id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f35538b);
            String str2 = this.D;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new vi0(this, 1), null, null, 0, this.f35536a.stats_dc, 1, true), this.classGuid);
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new vi0(this, 2), null, null, 0, this.f35536a.stats_dc, 1, true), this.classGuid);
    }

    public final void c0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f35543n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f21082id = messageObject.storyItem.f21080id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f35538b);
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
        getConnectionsManager().sendRequest(tL_getMessageStats, new vi0(this, 0), null, null, 0, this.f35536a.stats_dc, 1, true);
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f35541e = ozVar;
        ozVar.setText(LocaleController.getString(R.string.NoResult));
        this.f35541e.setVisibility(8);
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
        int i13 = org.telegram.ui.ActionBar.k6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, getResourceProvider()));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.y3.r(R.string.LoadingStatsDescription, textView2, 1);
        this.Q.addView(this.P, k7.c6.t(120, 120, 1, 0, 0, 0, 20));
        this.Q.addView(textView, k7.c6.t(-2, -2, 1, 0, 0, 0, 10));
        this.Q.addView(textView2, k7.c6.q(-2, -2, 1));
        this.Q.setAlpha(0.0f);
        frameLayout2.addView(this.Q, k7.c6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, getResourceProvider());
        this.f35542f = tl0Var;
        tl0Var.p1();
        org.telegram.ui.Components.tl0 tl0Var2 = this.f35542f;
        f2.j0 j0Var = new f2.j0(1, false);
        this.h = j0Var;
        tl0Var2.setLayoutManager(j0Var);
        ((f2.p1) this.f35542f.getItemAnimator()).f5910m = false;
        org.telegram.ui.Components.tl0 tl0Var3 = this.f35542f;
        zi0 zi0Var = new zi0(this, context);
        this.d = zi0Var;
        tl0Var3.setAdapter(zi0Var);
        org.telegram.ui.Components.tl0 tl0Var4 = this.f35542f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        tl0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f35542f);
        this.f35542f.setOnItemClickListener(new j(this, 18));
        this.f35542f.setOnItemLongClickListener(new gu(this, 23));
        this.f35542f.setOnScrollListener(new l3(this, 20));
        this.f35541e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.X = frameLayout3;
        frameLayout3.addView(this.f35542f, k7.c6.c(-1.0f, -1));
        this.X.addView(this.f35541e, k7.c6.c(-1.0f, -1));
        this.X.setVisibility(8);
        frameLayout2.addView(this.X, k7.c6.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.W, 300L);
        g0();
        this.f35542f.setEmptyView(this.f35541e);
        this.Y = new xi0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.T = imageReceiver;
        imageReceiver.setParentView(this.Y);
        this.T.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.V = false;
        MessageObject messageObject = this.f35543n;
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
                            this.T.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f35543n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.T.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f35543n, 0);
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
                xi0 xi0Var = this.Y;
                if (xi0Var.getSubtitleTextView() != null) {
                    xi0Var.getSubtitleTextView().setVisibility(8);
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
        xi0 xi0Var2 = this.Y;
        if (!this.inPreviewMode) {
            f10 = i11;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(xi0Var2, 0, k7.c6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        e0();
        this.Y.i(org.telegram.ui.ActionBar.k6.v0(i13, getResourceProvider()), org.telegram.ui.ActionBar.k6.v0(i14, getResourceProvider()));
        View subtitleTextView = this.Y.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.l5) {
            ((org.telegram.ui.ActionBar.l5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i14, getResourceProvider()));
        }
        this.actionBar.C(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, getResourceProvider()), false);
        this.actionBar.B(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22055z8, getResourceProvider()), false);
        yh.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 26));
        this.Y.setOnClickListener(new f60(this, 10));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).c(0);
        } else if (view instanceof r91) {
            ((r91) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21605a7, getResourceProvider())), org.telegram.ui.ActionBar.k6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21624b7), 0, 0);
            pqVar.f30173w = true;
            view.setBackground(pqVar);
        } else if (view instanceof yf.c) {
            ((yf.c) view).a();
        } else if (view instanceof aj0) {
            int i10 = aj0.d;
            ((aj0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.k3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, getResourceProvider()));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f35536a == null && chatFull.f20844id == this.f35538b) {
                e0();
                this.f35536a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.f35543n;
        if (messageObject.isStory()) {
            this.Y.setTitle(LocaleController.getString(R.string.StoryStatistics));
            xi0 xi0Var = this.Y;
            if (xi0Var.getSubtitleTextView() != null) {
                xi0Var.getSubtitleTextView().setVisibility(8);
            }
            xi0 xi0Var2 = this.Y;
            xi0Var2.f25663b = true;
            xi0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.Y.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f35543n);
                this.Y.setClipChildren(false);
                this.Y.getAvatarImageView().setScaleX(0.96f);
                this.Y.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.Y.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f35538b));
        if (chat != null && !this.V) {
            this.Y.setChatAvatar(chat);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.f35537a0 && (chatFull = this.f35536a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            ArrayList arrayList = n10.f22475e;
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
        if (this.C && this.f35548y) {
            AndroidUtilities.cancelRunOnUIThread(this.W);
            if (this.X.getVisibility() == 8) {
                this.Q.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.g91(this, 25));
                this.X.setVisibility(0);
                this.X.setAlpha(0.0f);
                this.X.animate().alpha(1.0f).start();
            }
            int i10 = this.N;
            this.L = i10;
            this.K = i10 + 1;
            this.N = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f35544r != null) {
                int i11 = this.N;
                this.I = i11;
                this.N = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f35545s != null) {
                int i12 = this.N;
                this.J = i12;
                this.N = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f35547x;
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
        zi0 zi0Var = this.d;
        if (zi0Var != null) {
            zi0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.l5 l5Var;
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        xi0 xi0Var = this.Y;
        View view = null;
        if (xi0Var != null) {
            l5Var = xi0Var.getTitleTextView();
        } else {
            l5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(l5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.Oi));
        xi0 xi0Var2 = this.Y;
        if (xi0Var2 != null) {
            view = xi0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.k6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21624b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f22036y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21839n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35542f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        ha1.k0(this.f35544r, arrayList, fVar);
        ha1.k0(this.f35545s, arrayList, fVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f35536a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f35538b, this.classGuid, true);
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
        zi0 zi0Var = this.d;
        if (zi0Var != null) {
            zi0Var.l();
        }
    }

    public bj0(MessageObject messageObject, boolean z4, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f35547x = new ArrayList();
        this.D = null;
        this.O = new a0.g(0);
        this.W = new z5(this, 10);
        this.f35543n = messageObject;
        this.f35540c = 0;
        this.f35538b = j10;
        this.f35536a = getMessagesController().getChatFull(j10);
        this.f35537a0 = z4;
    }
}
