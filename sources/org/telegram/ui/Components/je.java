package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class je implements Utilities.Callback {
    public final int f24377a = 0;
    public final boolean f24378b;
    public final Object f24379c;
    public final Object d;
    public final Object e;

    public je(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z10) {
        this.f24379c = chatActivityEnterView;
        this.d = d2Var;
        this.e = user;
        this.f24378b = z10;
    }

    @Override
    public final void run(Object obj) {
        yg.l0 l0Var;
        TLRPC.Document f7;
        wc wcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f24377a;
        Object obj2 = this.e;
        boolean z10 = this.f24378b;
        Object obj3 = this.d;
        Object obj4 = this.f24379c;
        switch (i14) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i15 = ChatActivityEnterView.f20816m5;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                wh.p1 p1Var = new wh.p1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f17342id, sg.s.c(sg.s.b(1, (List) obj)), null);
                p1Var.V(z10);
                p1Var.show();
                return;
            case 1:
                zh.e2 e2Var = (zh.e2) obj4;
                yg.p0 p0Var = (yg.p0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                zh.a3 a3Var = e2Var.f48368a;
                if (z10 && p0Var.f47101f != null) {
                    try {
                        a3Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l0Var = new yg.l0(view.getContext(), null, a3Var.f48172f2, null, view, a3Var.getMeasuredWidth() / 2.0f, a3Var.getMeasuredHeight() / 2.0f, p0Var, a3Var.C2, 0, true);
                } else {
                    l0Var = new yg.l0(view.getContext(), null, a3Var.f48172f2, null, view, a3Var.getMeasuredWidth() / 2.0f, a3Var.getMeasuredHeight() / 2.0f, p0Var, a3Var.C2, 2, true);
                }
                yg.l0.B = l0Var;
                int i16 = R.id.parent_tag;
                yg.i0 i0Var = l0Var.f47046i;
                i0Var.setTag(i16, 1);
                a3Var.addView(i0Var);
                zh.z2 z2Var = a3Var.O1;
                l0Var.f47056s = true;
                l0Var.f47061y = System.currentTimeMillis();
                if (p0Var.f47101f != null) {
                    f7 = MediaDataController.getInstance(a3Var.C2).getEmojiAnimatedSticker(p0Var.f47101f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(p0Var.f47101f, a3Var.B1);
                    of2.replyToStoryItem = z2Var.f49129a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(a3Var.C2).sendMessage(of2);
                } else {
                    f7 = p5.f(a3Var.C2, p0Var.f47102g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (a3Var.f48172f2.getReactionsWindow() != null) {
                            a3Var.f48172f2.getReactionsWindow().e();
                        }
                        a3Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, a3Var.B1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = p0Var.f47102g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = z2Var.f49129a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(a3Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    pc q6 = new wc(a3Var.f48160c1, a3Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new xh.x(e2Var, 22));
                    q6.f26081j = 5000;
                    q6.j();
                }
                if (a3Var.f48172f2.getReactionsWindow() != null) {
                    a3Var.f48172f2.getReactionsWindow().e();
                }
                a3Var.s0();
                return;
            default:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                zh.a3 a3Var2 = ((zh.v2) obj4).f48986l;
                zh.h2 h2Var = a3Var2.f48160c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (a3Var2.C1) {
                        wc wcVar2 = new wc(h2Var, f6Var);
                        if (z10) {
                            i12 = R.raw.contact_check;
                        } else {
                            i12 = R.raw.chats_archived;
                        }
                        if (z10) {
                            i13 = R.string.StoryPinnedToProfile;
                        } else {
                            i13 = R.string.StoryArchivedFromProfile;
                        }
                        wcVar2.Q(i12, 36, LocaleController.getString(i13)).j();
                        return;
                    } else if (z10) {
                        new wc(h2Var, f6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        wcVar = new wc(h2Var, f6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    wcVar = new wc(h2Var, f6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.a2.o(i11, wcVar, i10, 36);
                return;
        }
    }

    public je(zh.e2 e2Var, boolean z10, yg.p0 p0Var, View view) {
        this.f24379c = e2Var;
        this.f24378b = z10;
        this.d = p0Var;
        this.e = view;
    }

    public je(zh.v2 v2Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f24379c = v2Var;
        this.d = storyItem;
        this.f24378b = z10;
        this.e = f6Var;
    }
}
