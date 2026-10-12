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
public final class sh0 extends sm0 {
    public final Context f30567r;
    public final wh0 f30568s;

    public sh0(wh0 wh0Var, Context context) {
        this.f30568s = wh0Var;
        this.f30567r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(wm0 wm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        int i11 = 1;
        if (i10 == 0) {
            return 1;
        }
        vh0 vh0Var = (vh0) this.f30568s.f32401x.get(i10 - 1);
        int b10 = vh0Var.b() + 1;
        if (TextUtils.isEmpty(vh0Var.f31522c) && !vh0Var.f31523e) {
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
            wh0 wh0Var = this.f30568s;
            if (i13 < wh0Var.f32401x.size() && (i12 = i11 - 1) < ((vh0) wh0Var.f32401x.get(i13)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((vh0) wh0Var.f32401x.get(i13)).f31521b.get(i12)).peer))));
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
        if (i11 - 1 < ((vh0) this.f30568s.f32401x.get(i10 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f30568s.f32401x.size() + 1;
    }

    @Override
    public final View T(int i10, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        wh0 wh0Var = this.f30568s;
        TLRPC.Poll poll = wh0Var.f32398r;
        MessageObject messageObject = wh0Var.f32397n;
        if (view == null) {
            view = new rh0(this, this.f30567r);
        }
        uh0 uh0Var = (uh0) view;
        if (i10 == 0) {
            uh0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        vh0 vh0Var = (vh0) wh0Var.f32401x.get(i10 - 1);
        int size = poll.answers.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
            if (Arrays.equals(pollAnswer.option, vh0Var.d) && ((th0) wh0Var.f32400w.get(vh0Var)) != null) {
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
                uh0Var.a(str2, arrayList, wh0Var.Q(vh0Var.d), vh0Var.f31520a, vh0Var.a(), false);
                uh0Var.setTag(R.id.object_tag, vh0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        if (i10 != 0 && i11 != 0) {
            ArrayList arrayList = this.f30568s.F;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        wh0 wh0Var = this.f30568s;
        TLRPC.Poll poll = wh0Var.f32398r;
        ArrayList arrayList2 = wh0Var.f32401x;
        MessageObject messageObject = wh0Var.f32397n;
        int i12 = d1Var.f47901f;
        View view = d1Var.f47897a;
        int i13 = 0;
        if (i12 != 2) {
            if (i12 == 3) {
                vh0 vh0Var = (vh0) arrayList2.get(i10 - 1);
                ((org.telegram.ui.Cells.r8) view).m(R.drawable.arrow_more, LocaleController.formatPluralString("ShowVotes", vh0Var.f31520a - vh0Var.b(), new Object[0]), false);
                return;
            }
            return;
        }
        uh0 uh0Var = (uh0) view;
        vh0 vh0Var2 = (vh0) arrayList2.get(i10 - 1);
        ArrayList arrayList3 = vh0Var2.f31521b;
        byte[] bArr = vh0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i14 = 0; i14 < size; i14++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i14);
            if (Arrays.equals(pollAnswer.option, bArr) && ((th0) wh0Var.f32400w.get(vh0Var2)) != null) {
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
                uh0Var.a(str2, arrayList, wh0Var.Q(bArr), vh0Var2.f31520a, vh0Var2.a(), false);
                uh0Var.setTag(R.id.object_tag, vh0Var2);
                return;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        wh0 wh0Var = this.f30568s;
        View view = wh0Var.f32402y;
        Context context = this.f30567r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(23, context, true);
                    r8Var2.setOffsetFromImage(65);
                    r8Var2.setBackgroundColor(wh0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5));
                    r8Var2.e(org.telegram.ui.ActionBar.h6.N6, org.telegram.ui.ActionBar.h6.q6);
                    r8Var = r8Var2;
                } else {
                    View rh0Var = new rh0(this, context);
                    rh0Var.setTag(-33024);
                    r8Var = rh0Var;
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
            r8Var = new PollVotesAlert$UserCell(wh0Var, context);
        }
        return new s4.d1(r8Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        org.telegram.ui.ActionBar.c6 c6Var;
        if (d1Var.f47901f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.f47897a;
            wh0 wh0Var = this.f30568s;
            vh0 vh0Var = (vh0) wh0Var.f32401x.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) vh0Var.f31521b.get(Q);
            TLObject userOrChat = wh0Var.R().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
            int i10 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == vh0Var.b() - 1 && TextUtils.isEmpty(vh0Var.f31522c) && !vh0Var.f31523e) {
                z10 = false;
            } else {
                z10 = true;
            }
            y9 y9Var = pollVotesAlert$UserCell.f24001a;
            org.telegram.ui.ActionBar.h5 h5Var = pollVotesAlert$UserCell.f24002b;
            if (userOrChat instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) userOrChat;
                pollVotesAlert$UserCell.f24006n = null;
            } else if (userOrChat instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f24006n = (TLRPC.Chat) userOrChat;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f24006n = null;
            }
            long j3 = i10;
            pollVotesAlert$UserCell.d.setText(LocaleController.getInstance().getFormatterDay().format(j3 * 1000));
            pollVotesAlert$UserCell.f24003c.setText(LocaleController.formatDate(j3, true));
            pollVotesAlert$UserCell.v = z10;
            if (userOrChat != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f24010x = z12;
            pollVotesAlert$UserCell.f24009w = Q;
            if (userOrChat == null) {
                h5Var.l("", false);
                y9Var.setImageDrawable(null);
            } else {
                int i11 = pollVotesAlert$UserCell.f24008s;
                j9 j9Var = pollVotesAlert$UserCell.f24004e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f24006n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    j9Var.m(i11, user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f24006n;
                    if (chat2 != null) {
                        j9Var.k(i11, chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    pollVotesAlert$UserCell.f24007r = userName;
                    z11 = false;
                    pollVotesAlert$UserCell.f24007r = Emoji.replaceEmoji(userName, h5Var.getPaint().getFontMetricsInt(), false);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f24006n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f24007r = str;
                        pollVotesAlert$UserCell.f24007r = Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false);
                    } else {
                        pollVotesAlert$UserCell.f24007r = "";
                    }
                }
                h5Var.l(pollVotesAlert$UserCell.f24007r, z11);
                tx0 tx0Var = pollVotesAlert$UserCell.f24005f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f24006n;
                int i12 = org.telegram.ui.ActionBar.h6.f20967z9;
                c6Var = ((org.telegram.ui.ActionBar.e3) pollVotesAlert$UserCell.F).resourcesProvider;
                h5Var.i(tx0Var.a(user3, chat4, org.telegram.ui.ActionBar.h6.w0(i12, c6Var), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f24006n;
                if (chat5 != null) {
                    y9Var.e(chat5, j9Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        y9Var.e(user4, j9Var);
                    } else {
                        y9Var.setImageDrawable(j9Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(y9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(h5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, wh0.O, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f24010x) {
                pollVotesAlert$UserCell.f24011y = 0.0f;
            }
        }
    }
}
