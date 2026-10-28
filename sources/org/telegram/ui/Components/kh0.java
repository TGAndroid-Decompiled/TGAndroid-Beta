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
public final class kh0 extends im0 {
    public final Context f29960r;
    public final oh0 f29961s;

    public kh0(oh0 oh0Var, Context context) {
        this.f29961s = oh0Var;
        this.f29960r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        nh0 nh0Var = (nh0) this.f29961s.f31292x.get(i10 - 1);
        int b10 = nh0Var.b() + 1;
        if (TextUtils.isEmpty(nh0Var.f30921c) && !nh0Var.e) {
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
            oh0 oh0Var = this.f29961s;
            if (i13 < oh0Var.f31292x.size() && (i12 = i11 - 1) < ((nh0) oh0Var.f31292x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((nh0) oh0Var.f31292x.get(i13)).f30920b.get(i12)).peer))));
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
        if (i11 - 1 < ((nh0) this.f29961s.f31292x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f29961s.f31292x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        oh0 oh0Var = this.f29961s;
        TLRPC.Poll poll = oh0Var.f31289r;
        MessageObject messageObject = oh0Var.f31288n;
        if (view == null) {
            view = new jh0(this, this.f29960r);
        }
        mh0 mh0Var = (mh0) view;
        if (i10 == 0) {
            mh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        nh0 nh0Var = (nh0) oh0Var.f31292x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, nh0Var.d) && ((lh0) oh0Var.f31291w.get(nh0Var)) != null) {
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
                mh0Var.a(str2, arrayList, oh0Var.R(nh0Var.d), nh0Var.f30919a, nh0Var.a(), false);
                mh0Var.setTag(R.id.object_tag, nh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f29961s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.e1 e1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        oh0 oh0Var = this.f29961s;
        TLRPC.Poll poll = oh0Var.f31289r;
        ArrayList arrayList2 = oh0Var.f31292x;
        MessageObject messageObject = oh0Var.f31288n;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                nh0 nh0Var = (nh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.v8) view).o(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", nh0Var.f30919a - nh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        mh0 mh0Var = (mh0) view;
        nh0 nh0Var2 = (nh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = nh0Var2.f30920b;
        byte[] bArr = nh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((lh0) oh0Var.f31291w.get(nh0Var2)) != null) {
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
                mh0Var.a(str2, arrayList, oh0Var.R(bArr), nh0Var2.f30919a, nh0Var2.a(), false);
                mh0Var.setTag(R.id.object_tag, nh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        oh0 oh0Var = this.f29961s;
        View view = oh0Var.f31293y;
        Context context = this.f29960r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(23, context, true);
                    v8Var2.setOffsetFromImage(65);
                    int i11 = org.telegram.ui.ActionBar.y6.f23428h5;
                    u6Var = ((org.telegram.ui.ActionBar.k3) oh0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.i(i11, v8Var2, u6Var);
                    v8Var2.g(org.telegram.ui.ActionBar.y6.N6, org.telegram.ui.ActionBar.y6.f23598q6);
                    v8Var = v8Var2;
                } else {
                    View jh0Var = new jh0(this, context);
                    jh0Var.setTag(-33024);
                    v8Var = jh0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                v8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    v8Var = view;
                }
            }
        } else {
            v8Var = new PollVotesAlert$UserCell(oh0Var, context);
        }
        return new s4.e1(v8Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.u6 u6Var;
        if (e1Var.f47776f == 0) {
            int b10 = e1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) e1Var.f47773a;
            oh0 oh0Var = this.f29961s;
            nh0 nh0Var = (nh0) oh0Var.f31292x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) nh0Var.f30920b.get(Q);
            TLObject userOrChat = oh0Var.S().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == nh0Var.b() - 1 && TextUtils.isEmpty(nh0Var.f30921c) && !nh0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            y9 y9Var = pollVotesAlert$UserCell.f26208a;
            org.telegram.ui.ActionBar.b6 b6Var = pollVotesAlert$UserCell.f26209b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f26212n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f26212n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f26212n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f26210c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f26216x = z12;
            pollVotesAlert$UserCell.f26215w = Q;
            if (userOrChat == null) {
                b6Var.l("", false);
                y9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f26214s;
                j9 j9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f26212n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    j9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f26212n;
                    if (chat2 != null) {
                        j9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f26213r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f26213r = Emoji.replaceEmoji(userName, b6Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f26212n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f26213r = str;
                        pollVotesAlert$UserCell.f26213r = Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f26213r = "";
                    }
                }
                b6Var.l(pollVotesAlert$UserCell.f26213r, z11);
                rx0 rx0Var = pollVotesAlert$UserCell.f26211f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f26212n;
                int i12 = org.telegram.ui.ActionBar.y6.f23771z9;
                u6Var = ((org.telegram.ui.ActionBar.k3) pollVotesAlert$UserCell.F).resourcesProvider;
                b6Var.i(rx0Var.b(user3, chat4, org.telegram.ui.ActionBar.y6.w0(i12, u6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f26212n;
                if (chat5 != null) {
                    y9Var.f(chat5, j9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        y9Var.f(user4, j9Var);
                    } else {
                        y9Var.setImageDrawable(j9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(y9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(b6Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, oh0.R, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f26216x) {
                pollVotesAlert$UserCell.f26217y = 0.0f;
            }
        }
    }
}
