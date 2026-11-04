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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oe0 extends oj0 {
    public final Context f36816r;
    public final se0 f36817s;

    public oe0(se0 se0Var, Context context) {
        this.f36817s = se0Var;
        this.f36816r = context;
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        int i10 = 1;
        if (i3 == 0) {
            return 1;
        }
        re0 re0Var = (re0) this.f36817s.f37998u1.get(i3 - 1);
        int b10 = re0Var.b() + 1;
        if (TextUtils.isEmpty(re0Var.f37714c) && !re0Var.f37715e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override
    public final Object O(int i3, int i10) {
        int i11;
        if (i3 == 0) {
            return 293145;
        }
        int i12 = i3 - 1;
        if (i10 == 0) {
            return -928312;
        }
        if (i12 >= 0) {
            se0 se0Var = this.f36817s;
            if (i12 < se0Var.f37998u1.size() && (i11 = i10 - 1) < ((re0) se0Var.f37998u1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((re0) se0Var.f37998u1.get(i12)).f37713b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        if (i10 - 1 < ((re0) this.f36817s.f37998u1.get(i3 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f36817s.f37998u1.size() + 1;
    }

    @Override
    public final View T(int i3, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        se0 se0Var = this.f36817s;
        TLRPC.Poll poll = se0Var.f37994q1;
        org.telegram.messenger.zi ziVar = se0Var.f37993p1;
        if (view == null) {
            view = new ne0(this, this.f36816r);
        }
        qe0 qe0Var = (qe0) view;
        if (i3 == 0) {
            qe0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        re0 re0Var = (re0) se0Var.f37998u1.get(i3 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, re0Var.d) && ((pe0) se0Var.f37997t1.get(re0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ziVar != null && ziVar.J2 && (message = ziVar.f26868k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= ziVar.f26868k.translatedPoll.f25639b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ziVar.f26868k.translatedPoll.f25639b.get(i10);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i10++;
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
                qe0Var.a(str2, arrayList, se0Var.K0(re0Var.d), re0Var.f37712a, re0Var.a(), false);
                qe0Var.setTag(2131296585, re0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        if (i3 != 0 && i10 != 0) {
            ArrayList arrayList = this.f36817s.f38001x1;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        se0 se0Var = this.f36817s;
        TLRPC.Poll poll = se0Var.f37994q1;
        ArrayList arrayList2 = se0Var.f37998u1;
        org.telegram.messenger.zi ziVar = se0Var.f37993p1;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                re0 re0Var = (re0) arrayList2.get(i3 - 1);
                ((org.telegram.ui.Cells.l8) view).o(2131230871, org.telegram.messenger.bd.G(re0Var.f37712a - re0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        qe0 qe0Var = (qe0) view;
        re0 re0Var2 = (re0) arrayList2.get(i3 - 1);
        ArrayList arrayList3 = re0Var2.f37713b;
        byte[] bArr = re0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((pe0) se0Var.f37997t1.get(re0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (ziVar != null && ziVar.J2 && (message = ziVar.f26868k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= ziVar.f26868k.translatedPoll.f25639b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ziVar.f26868k.translatedPoll.f25639b.get(i12);
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            tL_textWithEntities = pollAnswer2.text;
                            break;
                        }
                        i12++;
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
                qe0Var.a(str2, arrayList, se0Var.K0(bArr), re0Var2.f37712a, re0Var2.a(), false);
                qe0Var.setTag(2131296585, re0Var2);
                return;
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.l8 l8Var;
        se0 se0Var = this.f36817s;
        View view = se0Var.f37999v1;
        Context context = this.f36816r;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(23, context, true);
                    l8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, l8Var2, se0Var.J0);
                    l8Var2.g(org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.f28121q6);
                    l8Var = l8Var2;
                } else {
                    View ne0Var = new ne0(this, context);
                    ne0Var.setTag(-33024);
                    l8Var = ne0Var;
                }
            } else {
                ViewParent parent = view.getParent();
                l8Var = view;
                if (parent != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    l8Var = view;
                }
            }
        } else {
            l8Var = new PollVotesAlert$UserCell(se0Var, context);
        }
        return new u4.d1(l8Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        if (d1Var.f55544f == 0) {
            int b10 = d1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) d1Var.f55540a;
            se0 se0Var = this.f36817s;
            re0 re0Var = (re0) se0Var.f37998u1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) re0Var.f37713b.get(Q);
            TLObject e22 = org.telegram.messenger.hp.s1(se0Var.f28583a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i3 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == re0Var.b() - 1 && TextUtils.isEmpty(re0Var.f37714c) && !re0Var.f37715e) {
                z10 = false;
            } else {
                z10 = true;
            }
            k9 k9Var = pollVotesAlert$UserCell.f31508a;
            org.telegram.ui.ActionBar.k5 k5Var = pollVotesAlert$UserCell.f31509b;
            if (e22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) e22;
                pollVotesAlert$UserCell.f31513n = null;
            } else if (e22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f31513n = (TLRPC.Chat) e22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f31513n = null;
            }
            long j10 = i3;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.bd.E0().p0().format(j10 * 1000));
            pollVotesAlert$UserCell.f31510c.setText(org.telegram.messenger.bd.r(j10, true));
            pollVotesAlert$UserCell.f31515s = z10;
            if (e22 != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f31517x = z12;
            pollVotesAlert$UserCell.f31516w = Q;
            if (e22 == null) {
                k5Var.l("", false);
                k9Var.setImageDrawable(null);
            } else {
                u8 u8Var = pollVotesAlert$UserCell.f31511e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f31513n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    u8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f31513n;
                    if (chat2 != null) {
                        u8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.l10.p(user2);
                    pollVotesAlert$UserCell.f31514r = p10;
                    z11 = false;
                    pollVotesAlert$UserCell.f31514r = org.telegram.messenger.i6.m(p10, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f31513n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f31514r = str;
                        pollVotesAlert$UserCell.f31514r = org.telegram.messenger.i6.m(str, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f31514r = "";
                    }
                }
                k5Var.l(pollVotesAlert$UserCell.f31514r, z11);
                mu0 mu0Var = pollVotesAlert$UserCell.f31512f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f31513n;
                int i10 = org.telegram.ui.ActionBar.k6.f28293z9;
                se0 se0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.n8 n8Var = se0.J1;
                k5Var.i(mu0Var.b(user3, chat4, org.telegram.ui.ActionBar.k6.w0(i10, se0Var2.J0), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f31513n;
                if (chat5 != null) {
                    k9Var.e(chat5, u8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        k9Var.e(user4, u8Var);
                    } else {
                        k9Var.setImageDrawable(u8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(k9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, se0.J1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f31517x) {
                pollVotesAlert$UserCell.f31518y = 0.0f;
            }
        }
    }
}
