package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jj0 extends org.telegram.ui.Components.kl0 {
    public final Context f37785c;
    public final lj0 d;

    public jj0(lj0 lj0Var, Context context) {
        this.d = lj0Var;
        this.f37785c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45738a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 0) {
            return ((org.telegram.ui.Cells.a5) c1Var.f45738a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        lj0 lj0Var = this.d;
        if (lj0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != lj0Var.H && i10 != lj0Var.O) {
            if (i10 == lj0Var.K) {
                return 3;
            }
            if (i10 == lj0Var.L) {
                return 4;
            }
            if (i10 == lj0Var.N) {
                return 5;
            }
            if (i10 == lj0Var.P) {
                return 6;
            }
            if (i10 == lj0Var.M) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        MessageObject messageObject;
        String str;
        String format;
        TLRPC.User user;
        TLObject chat;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z10 = true;
        lj0 lj0Var = this.d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            if (i16 == 7) {
                                la1 la1Var = (la1) view;
                                la1Var.e(lj0Var.f38391s, false);
                                la1Var.setLayoutParams(new s4.p0(-1, -2));
                                return;
                            }
                            return;
                        }
                        kj0 kj0Var = (kj0) view;
                        TextView[] textViewArr = kj0Var.f38078a;
                        TextView[] textViewArr2 = kj0Var.f38079b;
                        lj0 lj0Var2 = kj0Var.f38080c;
                        ya1 ya1Var = lj0Var2.f38387e0;
                        MessageObject messageObject2 = lj0Var2.f38389n;
                        if (ya1Var != null) {
                            i14 = ya1Var.d();
                            i13 = ya1Var.a();
                            i15 = ya1Var.c();
                        } else {
                            if (messageObject2.isStory()) {
                                i12 = messageObject2.storyItem.views.views_count;
                            } else {
                                i12 = messageObject2.messageOwner.views;
                            }
                            if (messageObject2.isStory()) {
                                i13 = messageObject2.storyItem.views.forwards_count;
                            } else {
                                i13 = messageObject2.messageOwner.forwards;
                            }
                            if (messageObject2.isStory()) {
                                int i17 = messageObject2.storyItem.views.reactions_count;
                                i14 = i12;
                                i15 = i17;
                            } else if (messageObject2.messageOwner.reactions != null) {
                                int i18 = 0;
                                for (int i19 = 0; i19 < messageObject2.messageOwner.reactions.results.size(); i19++) {
                                    i18 += messageObject2.messageOwner.reactions.results.get(i19).count;
                                }
                                i14 = i12;
                                i15 = i18;
                            } else {
                                i14 = i12;
                                i15 = 0;
                            }
                        }
                        textViewArr[0].setText(AndroidUtilities.formatWholeNumber(i14, 0));
                        textViewArr2[0].setText(LocaleController.getString(R.string.StatisticViews));
                        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(lj0Var2.U, 0));
                        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i15, 0));
                        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
                        TLRPC.ChatFull chatFull = lj0Var2.f38379a;
                        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i15 == 0) {
                            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
                        }
                        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i13 - lj0Var2.U), 0));
                        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
                        kj0Var.a();
                        return;
                    }
                    la1 la1Var2 = (la1) view;
                    la1Var2.e(lj0Var.f38390r, false);
                    la1Var2.setLayoutParams(new s4.p0(-1, -2));
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == lj0Var.O) {
                    l4Var.setTopMargin(9);
                    l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    l4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                }
                l4Var.setTopMargin(11);
                l4Var.setPadding(0, 0, 0, 0);
                l4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.f37785c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20627b7));
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        int i20 = lj0Var.I;
        if (i10 >= i20 && i10 < lj0Var.J) {
            messageObject = (MessageObject) lj0Var.f38393x.get(i10 - i20);
        } else {
            messageObject = null;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        if (messageObject.isStory()) {
            if (DialogObject.isUserDialog(dialogId)) {
                chat = lj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                chat = lj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            }
            TL_stories.StoryViews storyViews = messageObject.storyItem.views;
            if (storyViews != null && (i11 = storyViews.views_count) != 0) {
                string = LocaleController.formatPluralString("Views", i11, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.NoViews);
            }
            if (i10 == lj0Var.J - 1) {
                z10 = false;
            }
            a5Var.b(chat, null, string, z10);
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            tv tvVar = new tv(22, this, messageObject);
            a5Var.f21608r = storyItem;
            a5Var.f21602a.setOnClickListener(tvVar);
            return;
        }
        a5Var.f21608r = null;
        a5Var.f21602a.setOnClickListener(null);
        if (DialogObject.isUserDialog(dialogId)) {
            user = lj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            str = null;
        } else {
            TLRPC.Chat chat2 = lj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                format = LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]);
            } else {
                int i21 = chat2.participants_count;
                if (i21 != 0) {
                    format = String.format("%1$s, %2$s", LocaleController.formatPluralString("Members", i21, new Object[0]), LocaleController.formatPluralString("Views", messageObject.messageOwner.views, new Object[0]));
                } else {
                    str = null;
                    user = chat2;
                }
            }
            str = format;
            user = chat2;
        }
        if (user != null) {
            if (i10 == lj0Var.J - 1) {
                z10 = false;
            }
            a5Var.b(user, null, str, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.a7 a7Var;
        lj0 lj0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f37785c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.r4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.k3(context, 16);
                                view.setLayoutParams(new s4.p0(-1, 16));
                            }
                        } else {
                            view = new kj0(lj0Var, context);
                            view.setLayoutParams(new s4.p0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    jg.f fVar = new jg.f(lj0Var.getResourceProvider());
                    lj0Var.f38384c0 = fVar;
                    view = new ij0(this, this.f37785c, i11, fVar, lj0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f37785c, org.telegram.ui.ActionBar.j6.G6, 16, 11, false, lj0Var.getResourceProvider());
                    l4Var.setHeight(43);
                    a7Var = l4Var;
                }
            } else {
                lj0Var.getResourceProvider();
                a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            }
            view = a7Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f37785c, lj0Var.getResourceProvider(), false);
            a5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f20664d7);
            view = a5Var;
        }
        return new s4.c1(view);
    }
}
