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
public final class ij0 extends org.telegram.ui.Components.ul0 {
    public final Context f33745c;
    public final kj0 d;

    public ij0(kj0 kj0Var, Context context) {
        this.d = kj0Var;
        this.f33745c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
            return ((org.telegram.ui.Cells.b5) c1Var.f41610a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        kj0 kj0Var = this.d;
        if (kj0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != kj0Var.H && i10 != kj0Var.O) {
            if (i10 == kj0Var.K) {
                return 3;
            }
            if (i10 == kj0Var.L) {
                return 4;
            }
            if (i10 == kj0Var.N) {
                return 5;
            }
            if (i10 == kj0Var.P) {
                return 6;
            }
            if (i10 == kj0Var.M) {
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
        int i16 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z10 = true;
        kj0 kj0Var = this.d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            if (i16 == 7) {
                                pa1 pa1Var = (pa1) view;
                                pa1Var.e(kj0Var.f34395s, false);
                                pa1Var.setLayoutParams(new s4.p0(-1, -2));
                                return;
                            }
                            return;
                        }
                        jj0 jj0Var = (jj0) view;
                        TextView[] textViewArr = jj0Var.f34123a;
                        TextView[] textViewArr2 = jj0Var.f34124b;
                        kj0 kj0Var2 = jj0Var.f34125c;
                        cb1 cb1Var = kj0Var2.f34391e0;
                        MessageObject messageObject2 = kj0Var2.f34393n;
                        if (cb1Var != null) {
                            i14 = cb1Var.d();
                            i13 = cb1Var.a();
                            i15 = cb1Var.c();
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
                        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(kj0Var2.U, 0));
                        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i15, 0));
                        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
                        TLRPC.ChatFull chatFull = kj0Var2.f34384a;
                        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i15 == 0) {
                            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
                        }
                        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i13 - kj0Var2.U), 0));
                        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
                        jj0Var.a();
                        return;
                    }
                    pa1 pa1Var2 = (pa1) view;
                    pa1Var2.e(kj0Var.f34394r, false);
                    pa1Var2.setLayoutParams(new s4.p0(-1, -2));
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == kj0Var.O) {
                    m4Var.setTopMargin(9);
                    m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    m4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                }
                m4Var.setTopMargin(11);
                m4Var.setPadding(0, 0, 0, 0);
                m4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.f33745c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        int i20 = kj0Var.I;
        if (i10 >= i20 && i10 < kj0Var.J) {
            messageObject = (MessageObject) kj0Var.f34397x.get(i10 - i20);
        } else {
            messageObject = null;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        if (messageObject.isStory()) {
            if (DialogObject.isUserDialog(dialogId)) {
                chat = kj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                chat = kj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            }
            TL_stories.StoryViews storyViews = messageObject.storyItem.views;
            if (storyViews != null && (i11 = storyViews.views_count) != 0) {
                string = LocaleController.formatPluralString("Views", i11, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.NoViews);
            }
            if (i10 == kj0Var.J - 1) {
                z10 = false;
            }
            b5Var.b(chat, null, string, z10);
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            ow owVar = new ow(19, this, messageObject);
            b5Var.f18925r = storyItem;
            b5Var.f18920a.setOnClickListener(owVar);
            return;
        }
        b5Var.f18925r = null;
        b5Var.f18920a.setOnClickListener(null);
        if (DialogObject.isUserDialog(dialogId)) {
            user = kj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            str = null;
        } else {
            TLRPC.Chat chat2 = kj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
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
            if (i10 == kj0Var.J - 1) {
                z10 = false;
            }
            b5Var.b(user, null, str, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.c7 c7Var;
        kj0 kj0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f33745c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.s4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.k3(context, 16);
                                view.setLayoutParams(new s4.p0(-1, 16));
                            }
                        } else {
                            view = new jj0(kj0Var, context);
                            view.setLayoutParams(new s4.p0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    hg.f fVar = new hg.f(kj0Var.getResourceProvider());
                    kj0Var.f34389c0 = fVar;
                    view = new hj0(this, this.f33745c, i11, fVar, kj0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f33745c, org.telegram.ui.ActionBar.j6.G6, 16, 11, false, kj0Var.getResourceProvider());
                    m4Var.setHeight(43);
                    c7Var = m4Var;
                }
            } else {
                kj0Var.getResourceProvider();
                c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
            }
            view = c7Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f33745c, kj0Var.getResourceProvider(), false);
            b5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f17929d7);
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
