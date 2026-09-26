package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xg0 extends tl0 {
    public final Context f30351r;
    public final bh0 f30352s;

    public xg0(bh0 bh0Var, Context context) {
        this.f30352s = bh0Var;
        this.f30351r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(xl0 xl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        ah0 ah0Var = (ah0) this.f30352s.f23024x.get(i10 - 1);
        int b10 = ah0Var.b() + 1;
        if (TextUtils.isEmpty(ah0Var.f22647c) && !ah0Var.e) {
            i11 = 0;
        }
        return b10 + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return 293145;
        }
        int i13 = i10 - 1;
        if (i11 == 0) {
            return -928312;
        }
        if (i13 >= 0) {
            bh0 bh0Var = this.f30352s;
            if (i13 < bh0Var.f23024x.size() && (i12 = i11 - 1) < ((ah0) bh0Var.f23024x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((ah0) bh0Var.f23024x.get(i13)).f22646b.get(i12)).peer))));
            }
        }
        return -182734;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 2;
        }
        if (i11 - 1 < ((ah0) this.f30352s.f23024x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f30352s.f23024x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        bh0 bh0Var = this.f30352s;
        TLRPC.Poll poll = bh0Var.f23021r;
        MessageObject messageObject = bh0Var.f23020n;
        if (view == null) {
            view = new wg0(this, this.f30351r);
        }
        zg0 zg0Var = (zg0) view;
        if (i10 == 0) {
            zg0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ah0 ah0Var = (ah0) bh0Var.f23024x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, ah0Var.d) && ((yg0) bh0Var.f23023w.get(ah0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i11 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i11);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i11++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                } else {
                    str = tL_textWithEntities.text;
                }
                String str2 = str;
                if (tL_textWithEntities == null) {
                    arrayList = null;
                } else {
                    arrayList = tL_textWithEntities.entities;
                }
                zg0Var.a(str2, arrayList, bh0Var.P(ah0Var.d), ah0Var.f22645a, ah0Var.a(), false);
                zg0Var.setTag(R.id.object_tag, ah0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f30352s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        bh0 bh0Var = this.f30352s;
        TLRPC.Poll poll = bh0Var.f23021r;
        ArrayList arrayList2 = bh0Var.f23024x;
        MessageObject messageObject = bh0Var.f23020n;
        int i12 = c1Var.f42962f;
        View view = c1Var.f42959a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                ah0 ah0Var = (ah0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", ah0Var.f22645a - ah0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        zg0 zg0Var = (zg0) view;
        ah0 ah0Var2 = (ah0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = ah0Var2.f22646b;
        byte[] bArr = ah0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((yg0) bh0Var.f23023w.get(ah0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i13 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i13);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i13++;
                    }
                }
                if (tL_textWithEntities == null) {
                    str = "";
                } else {
                    str = tL_textWithEntities.text;
                }
                String str2 = str;
                if (tL_textWithEntities == null) {
                    arrayList = null;
                } else {
                    arrayList = tL_textWithEntities.entities;
                }
                zg0Var.a(str2, arrayList, bh0Var.P(bArr), ah0Var2.f22645a, ah0Var2.a(), false);
                zg0Var.setTag(R.id.object_tag, ah0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        bh0 bh0Var = this.f30352s;
        View view = bh0Var.f23025y;
        Context context = this.f30351r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    r8Var2.setBackgroundColor(bh0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5));
                    r8Var2.e(org.telegram.ui.ActionBar.h6.N6, org.telegram.ui.ActionBar.h6.q6);
                    r8Var = r8Var2;
                } else {
                    View wg0Var = new wg0(this, context);
                    wg0Var.setTag(-33024);
                    r8Var = wg0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                r8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    r8Var = view;
                }
            }
        } else {
            r8Var = new PollVotesAlert$UserCell(bh0Var, context);
        }
        return new s4.c1(r8Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.d6 d6Var;
        if (c1Var.f42962f == 0) {
            int b10 = c1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) c1Var.f42959a;
            bh0 bh0Var = this.f30352s;
            ah0 ah0Var = (ah0) bh0Var.f23024x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ah0Var.f22646b.get(Q);
            TLObject userOrChat = bh0Var.Q().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == ah0Var.b() - 1 && TextUtils.isEmpty(ah0Var.f22647c) && !ah0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            w9 w9Var = pollVotesAlert$UserCell.f22312a;
            org.telegram.ui.ActionBar.h5 h5Var = pollVotesAlert$UserCell.f22313b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f22316n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f22316n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f22316n = null;
            }
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.f22314c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f22320x = z12;
            pollVotesAlert$UserCell.f22319w = Q;
            if (userOrChat == null) {
                h5Var.l("", false);
                w9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f22318s;
                h9 h9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f22316n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    h9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f22316n;
                    if (chat2 != null) {
                        h9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f22317r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f22317r = Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f22316n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f22317r = str;
                        pollVotesAlert$UserCell.f22317r = Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f22317r = "";
                    }
                }
                h5Var.l(pollVotesAlert$UserCell.f22317r, z11);
                ww0 ww0Var = pollVotesAlert$UserCell.f22315f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f22316n;
                int i12 = org.telegram.ui.ActionBar.h6.f19464z9;
                d6Var = ((org.telegram.ui.ActionBar.e3) pollVotesAlert$UserCell.F).resourcesProvider;
                h5Var.i(ww0Var.a(user3, chat4, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f22316n;
                if (chat5 != null) {
                    w9Var.e(chat5, h9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        w9Var.e(user4, h9Var);
                    } else {
                        w9Var.setImageDrawable(h9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, bh0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f22320x) {
                pollVotesAlert$UserCell.f22321y = 0.0f;
            }
        }
    }
}
