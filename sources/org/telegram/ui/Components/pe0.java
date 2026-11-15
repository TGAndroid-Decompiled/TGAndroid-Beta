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
public final class pe0 extends pj0 {
    public final Context f38293r;
    public final te0 f38294s;

    public pe0(te0 te0Var, Context context) {
        this.f38294s = te0Var;
        this.f38293r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        int i10 = 1;
        if (i7 == 0) {
            return 1;
        }
        se0 se0Var = (se0) this.f38294s.f39690x1.get(i7 - 1);
        int b10 = se0Var.b() + 1;
        if (TextUtils.isEmpty(se0Var.f39295c) && !se0Var.f39296e) {
            i10 = 0;
        }
        return b10 + i10;
    }

    @Override
    public final Object O(int i7, int i10) {
        int i11;
        if (i7 == 0) {
            return 293145;
        }
        int i12 = i7 - 1;
        if (i10 == 0) {
            return -928312;
        }
        if (i12 >= 0) {
            te0 te0Var = this.f38294s;
            if (i12 < te0Var.f39690x1.size() && (i11 = i10 - 1) < ((se0) te0Var.f39690x1.get(i12)).b()) {
                return Integer.valueOf(Objects.hash(Long.valueOf(org.telegram.messenger.m5.o(((TLRPC.MessagePeerVote) ((se0) te0Var.f39690x1.get(i12)).f39294b.get(i11)).peer))));
            }
        }
        return -182734;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        if (i10 - 1 < ((se0) this.f38294s.f39690x1.get(i7 - 1)).b()) {
            return 0;
        }
        return 3;
    }

    @Override
    public final int R() {
        return this.f38294s.f39690x1.size() + 1;
    }

    @Override
    public final View T(int i7, View view) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        te0 te0Var = this.f38294s;
        TLRPC.Poll poll = te0Var.f39686t1;
        org.telegram.messenger.gj gjVar = te0Var.f39685s1;
        if (view == null) {
            view = new oe0(this, this.f38293r);
        }
        re0 re0Var = (re0) view;
        if (i7 == 0) {
            re0Var.setAlpha(0.0f);
            return view;
        }
        view.setAlpha(1.0f);
        se0 se0Var = (se0) te0Var.f39690x1.get(i7 - 1);
        int size = poll.answers.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
            if (Arrays.equals(pollAnswer.option, se0Var.d) && ((qe0) te0Var.f39689w1.get(se0Var)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (gjVar != null && gjVar.L2 && (message = gjVar.f23817k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i10 >= gjVar.f23817k.translatedPoll.f27860b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) gjVar.f23817k.translatedPoll.f27860b.get(i10);
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
                re0Var.a(str2, arrayList, te0Var.K0(se0Var.d), se0Var.f39293a, se0Var.a(), false);
                re0Var.setTag(2131296585, se0Var);
                return view;
            }
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        if (i7 != 0 && i10 != 0) {
            ArrayList arrayList = this.f38294s.A1;
            if (arrayList == null || arrayList.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        te0 te0Var = this.f38294s;
        TLRPC.Poll poll = te0Var.f39686t1;
        ArrayList arrayList2 = te0Var.f39690x1;
        org.telegram.messenger.gj gjVar = te0Var.f39685s1;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        int i12 = 0;
        if (i11 != 2) {
            if (i11 == 3) {
                se0 se0Var = (se0) arrayList2.get(i7 - 1);
                ((org.telegram.ui.Cells.l8) view).o(2131230871, org.telegram.messenger.hd.G(se0Var.f39293a - se0Var.b(), "ShowVotes", new Object[0]), false);
                return;
            }
            return;
        }
        re0 re0Var = (re0) view;
        se0 se0Var2 = (se0) arrayList2.get(i7 - 1);
        ArrayList arrayList3 = se0Var2.f39294b;
        byte[] bArr = se0Var2.d;
        TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) arrayList3.get(0);
        int size = poll.answers.size();
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i13);
            if (Arrays.equals(pollAnswer.option, bArr) && ((qe0) te0Var.f39689w1.get(se0Var2)) != null) {
                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                if (gjVar != null && gjVar.L2 && (message = gjVar.f23817k) != null && message.translatedPoll != null) {
                    while (true) {
                        if (i12 >= gjVar.f23817k.translatedPoll.f27860b.size()) {
                            break;
                        }
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) gjVar.f23817k.translatedPoll.f27860b.get(i12);
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
                re0Var.a(str2, arrayList, te0Var.K0(bArr), se0Var2.f39293a, se0Var2.a(), false);
                re0Var.setTag(2131296585, se0Var2);
                return;
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.l8 l8Var;
        te0 te0Var = this.f38294s;
        View view = te0Var.f39691y1;
        Context context = this.f38293r;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(23, context, true);
                    l8Var2.setOffsetFromImage(65);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, l8Var2, te0Var.J0);
                    l8Var2.g(org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.f29089q6);
                    l8Var = l8Var2;
                } else {
                    View oe0Var = new oe0(this, context);
                    oe0Var.setTag(-33024);
                    l8Var = oe0Var;
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
            l8Var = new PollVotesAlert$UserCell(te0Var, context);
        }
        return new v4.e1(l8Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        if (e1Var.f58539f == 0) {
            int b10 = e1Var.b();
            int S = S(b10);
            int Q = Q(b10) - 1;
            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) e1Var.f58535a;
            te0 te0Var = this.f38294s;
            se0 se0Var = (se0) te0Var.f39690x1.get(S - 1);
            TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) se0Var.f39294b.get(Q);
            TLObject e22 = org.telegram.messenger.np.s1(te0Var.f29679a).e2(org.telegram.messenger.m5.o(messagePeerVote.peer));
            int i7 = messagePeerVote.date;
            boolean z12 = true;
            if (Q == se0Var.b() - 1 && TextUtils.isEmpty(se0Var.f39295c) && !se0Var.f39296e) {
                z10 = false;
            } else {
                z10 = true;
            }
            i9 i9Var = pollVotesAlert$UserCell.f32615a;
            org.telegram.ui.ActionBar.j5 j5Var = pollVotesAlert$UserCell.f32616b;
            if (e22 instanceof TLRPC.User) {
                pollVotesAlert$UserCell.h = (TLRPC.User) e22;
                pollVotesAlert$UserCell.f32620n = null;
            } else if (e22 instanceof TLRPC.Chat) {
                pollVotesAlert$UserCell.f32620n = (TLRPC.Chat) e22;
                pollVotesAlert$UserCell.h = null;
            } else {
                pollVotesAlert$UserCell.h = null;
                pollVotesAlert$UserCell.f32620n = null;
            }
            long j3 = i7;
            pollVotesAlert$UserCell.d.setText(org.telegram.messenger.hd.E0().p0().format(j3 * 1000));
            pollVotesAlert$UserCell.f32617c.setText(org.telegram.messenger.hd.r(j3, true));
            pollVotesAlert$UserCell.f32622s = z10;
            if (e22 != null) {
                z12 = false;
            }
            pollVotesAlert$UserCell.f32624x = z12;
            pollVotesAlert$UserCell.f32623w = Q;
            if (e22 == null) {
                j5Var.l("", false);
                i9Var.setImageDrawable(null);
            } else {
                t8 t8Var = pollVotesAlert$UserCell.f32618e;
                TLRPC.User user = pollVotesAlert$UserCell.h;
                if ((user == null || user.photo == null) && (chat = pollVotesAlert$UserCell.f32620n) != null) {
                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                }
                if (user != null) {
                    t8Var.r(user);
                    TLRPC.UserStatus userStatus = pollVotesAlert$UserCell.h.status;
                } else {
                    TLRPC.Chat chat2 = pollVotesAlert$UserCell.f32620n;
                    if (chat2 != null) {
                        t8Var.q(chat2);
                    }
                }
                TLRPC.User user2 = pollVotesAlert$UserCell.h;
                if (user2 != null) {
                    String p10 = org.telegram.messenger.q10.p(user2);
                    pollVotesAlert$UserCell.f32621r = p10;
                    z11 = false;
                    pollVotesAlert$UserCell.f32621r = org.telegram.messenger.j6.m(p10, j5Var.getPaint().getFontMetricsInt(), false, null, 0);
                } else {
                    z11 = false;
                    TLRPC.Chat chat3 = pollVotesAlert$UserCell.f32620n;
                    if (chat3 != null) {
                        String str = chat3.title;
                        pollVotesAlert$UserCell.f32621r = str;
                        pollVotesAlert$UserCell.f32621r = org.telegram.messenger.j6.m(str, j5Var.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        pollVotesAlert$UserCell.f32621r = "";
                    }
                }
                j5Var.l(pollVotesAlert$UserCell.f32621r, z11);
                pu0 pu0Var = pollVotesAlert$UserCell.f32619f;
                TLRPC.User user3 = pollVotesAlert$UserCell.h;
                TLRPC.Chat chat4 = pollVotesAlert$UserCell.f32620n;
                int i10 = org.telegram.ui.ActionBar.j6.f29263z9;
                te0 te0Var2 = pollVotesAlert$UserCell.F;
                org.telegram.ui.Cells.n8 n8Var = te0.M1;
                j5Var.i(pu0Var.b(user3, chat4, org.telegram.ui.ActionBar.j6.w0(i10, te0Var2.J0), z11));
                TLRPC.Chat chat5 = pollVotesAlert$UserCell.f32620n;
                if (chat5 != null) {
                    i9Var.f(chat5, t8Var);
                } else {
                    TLRPC.User user4 = pollVotesAlert$UserCell.h;
                    if (user4 != null) {
                        i9Var.f(user4, t8Var);
                    } else {
                        i9Var.setImageDrawable(t8Var);
                    }
                }
            }
            ArrayList arrayList = pollVotesAlert$UserCell.E;
            if (arrayList != null) {
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(i9Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f, 1.0f));
                pollVotesAlert$UserCell.E.add(ObjectAnimator.ofFloat(pollVotesAlert$UserCell, te0.M1, 1.0f, 0.0f));
            } else if (!pollVotesAlert$UserCell.f32624x) {
                pollVotesAlert$UserCell.f32625y = 0.0f;
            }
        }
    }
}
