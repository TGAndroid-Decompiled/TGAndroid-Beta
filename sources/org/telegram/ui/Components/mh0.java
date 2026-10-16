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
public final class mh0 extends im0 {
    public final Context f27106r;
    public final qh0 f27107s;

    public mh0(qh0 qh0Var, Context context) {
        this.f27107s = qh0Var;
        this.f27106r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        ph0 ph0Var = (ph0) this.f27107s.f28293x.get(i10 - 1);
        int b10 = ph0Var.b() + 1;
        if (TextUtils.isEmpty(ph0Var.f28003c) && !ph0Var.e) {
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
            qh0 qh0Var = this.f27107s;
            if (i13 < qh0Var.f28293x.size() && (i12 = i11 - 1) < ((ph0) qh0Var.f28293x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((ph0) qh0Var.f28293x.get(i13)).f28002b.get(i12)).peer))));
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
        if (i11 - 1 < ((ph0) this.f27107s.f28293x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f27107s.f28293x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        qh0 qh0Var = this.f27107s;
        TLRPC.Poll poll = qh0Var.f28290r;
        MessageObject messageObject = qh0Var.f28289n;
        if (view == null) {
            view = new lh0(this, this.f27106r);
        }
        oh0 oh0Var = (oh0) view;
        if (i10 == 0) {
            oh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        ph0 ph0Var = (ph0) qh0Var.f28293x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, ph0Var.d) && ((nh0) qh0Var.f28292w.get(ph0Var)) != null) {
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
                oh0Var.a(str2, arrayList, qh0Var.Q(ph0Var.d), ph0Var.f28001a, ph0Var.a(), false);
                oh0Var.setTag(R.id.object_tag, ph0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f27107s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        qh0 qh0Var = this.f27107s;
        TLRPC.Poll poll = qh0Var.f28290r;
        ArrayList arrayList2 = qh0Var.f28293x;
        MessageObject messageObject = qh0Var.f28289n;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                ph0 ph0Var = (ph0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", ph0Var.f28001a - ph0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        oh0 oh0Var = (oh0) view;
        ph0 ph0Var2 = (ph0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = ph0Var2.f28002b;
        byte[] bArr = ph0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((nh0) qh0Var.f28292w.get(ph0Var2)) != null) {
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
                oh0Var.a(str2, arrayList, qh0Var.Q(bArr), ph0Var2.f28001a, ph0Var2.a(), false);
                oh0Var.setTag(R.id.object_tag, ph0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        qh0 qh0Var = this.f27107s;
        View view = qh0Var.f28294y;
        Context context = this.f27106r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    r8Var2.setBackgroundColor(qh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
                    r8Var2.e(org.telegram.ui.ActionBar.g6.N6, org.telegram.ui.ActionBar.g6.q6);
                    r8Var = r8Var2;
                } else {
                    View lh0Var = new lh0(this, context);
                    lh0Var.setTag(-33024);
                    r8Var = lh0Var;
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
            r8Var = new PollVotesAlert$UserCell(qh0Var, context);
        }
        return new s4.b1(r8Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (b1Var.f44841f == 0) {
            int b10 = b1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) b1Var.f44838a;
            qh0 qh0Var = this.f27107s;
            ph0 ph0Var = (ph0) qh0Var.f28293x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) ph0Var.f28002b.get(Q);
            TLObject userOrChat = qh0Var.R().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == ph0Var.b() - 1 && TextUtils.isEmpty(ph0Var.f28003c) && !ph0Var.e) {
                z10 = false;
            } else {
                z10 = true;
            }
            z9 z9Var = pollVotesAlert$UserCell.f22910a;
            org.telegram.ui.ActionBar.h5 h5Var = pollVotesAlert$UserCell.f22911b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f22914n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f22914n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f22914n = null;
            }
            long j10 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j10 * 1000));
            pollVotesAlert$UserCell.f22912c.setText(LocaleController.formatDate(j10, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f22918x = z12;
            pollVotesAlert$UserCell.f22917w = Q;
            if (userOrChat == null) {
                h5Var.l("", false);
                z9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f22916s;
                k9 k9Var = pollVotesAlert$UserCell.e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f22914n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    k9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f22914n;
                    if (chat2 != null) {
                        k9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f22915r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f22915r = Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f22914n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f22915r = str;
                        pollVotesAlert$UserCell.f22915r = Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f22915r = "";
                    }
                }
                h5Var.l(pollVotesAlert$UserCell.f22915r, z11);
                jx0 jx0Var = pollVotesAlert$UserCell.f22913f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f22914n;
                int i12 = org.telegram.ui.ActionBar.g6.f20008z9;
                c6Var = ((org.telegram.ui.ActionBar.e3) pollVotesAlert$UserCell.F).resourcesProvider;
                h5Var.i(jx0Var.a(user3, chat4, org.telegram.ui.ActionBar.g6.w0(i12, c6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f22914n;
                if (chat5 != null) {
                    z9Var.e(chat5, k9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        z9Var.e(user4, k9Var);
                    } else {
                        z9Var.setImageDrawable(k9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(z9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, qh0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f22918x) {
                pollVotesAlert$UserCell.f22919y = 0.0f;
            }
        }
    }
}
