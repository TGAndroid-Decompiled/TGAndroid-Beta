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
public final class kj0 extends org.telegram.ui.Components.ul0 {
    public final Context f35198c;
    public final mj0 d;

    public kj0(mj0 mj0Var, Context context) {
        this.d = mj0Var;
        this.f35198c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f == 0) {
            return ((org.telegram.ui.Cells.c5) c1Var.f42974a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        mj0 mj0Var = this.d;
        if (mj0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != mj0Var.H && i10 != mj0Var.O) {
            if (i10 == mj0Var.K) {
                return 3;
            }
            if (i10 == mj0Var.L) {
                return 4;
            }
            if (i10 == mj0Var.N) {
                return 5;
            }
            if (i10 == mj0Var.P) {
                return 6;
            }
            if (i10 == mj0Var.M) {
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
        int i16 = c1Var.f42977f;
        View view = c1Var.f42974a;
        boolean z10 = true;
        mj0 mj0Var = this.d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            if (i16 == 7) {
                                la1 la1Var = (la1) view;
                                la1Var.e(mj0Var.f35758s, false);
                                la1Var.setLayoutParams(new s4.p0(-1, -2));
                                return;
                            }
                            return;
                        }
                        lj0 lj0Var = (lj0) view;
                        TextView[] textViewArr = lj0Var.f35459a;
                        TextView[] textViewArr2 = lj0Var.f35460b;
                        mj0 mj0Var2 = lj0Var.f35461c;
                        ya1 ya1Var = mj0Var2.f35754e0;
                        MessageObject messageObject2 = mj0Var2.f35756n;
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
                        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(mj0Var2.U, 0));
                        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i15, 0));
                        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
                        TLRPC.ChatFull chatFull = mj0Var2.f35747a;
                        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i15 == 0) {
                            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
                        }
                        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i13 - mj0Var2.U), 0));
                        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
                        lj0Var.a();
                        return;
                    }
                    la1 la1Var2 = (la1) view;
                    la1Var2.e(mj0Var.f35757r, false);
                    la1Var2.setLayoutParams(new s4.p0(-1, -2));
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i10 == mj0Var.O) {
                    n4Var.setTopMargin(9);
                    n4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    n4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                }
                n4Var.setTopMargin(11);
                n4Var.setPadding(0, 0, 0, 0);
                n4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(this.f35198c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19058b7));
            return;
        }
        org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
        int i20 = mj0Var.I;
        if (i10 >= i20 && i10 < mj0Var.J) {
            messageObject = (MessageObject) mj0Var.f35760x.get(i10 - i20);
        } else {
            messageObject = null;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        if (messageObject.isStory()) {
            if (DialogObject.isUserDialog(dialogId)) {
                chat = mj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                chat = mj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            }
            TL_stories.StoryViews storyViews = messageObject.storyItem.views;
            if (storyViews != null && (i11 = storyViews.views_count) != 0) {
                string = LocaleController.formatPluralString("Views", i11, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.NoViews);
            }
            if (i10 == mj0Var.J - 1) {
                z10 = false;
            }
            c5Var.b(chat, null, string, z10);
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            tv tvVar = new tv(22, this, messageObject);
            c5Var.f20091r = storyItem;
            c5Var.f20086a.setOnClickListener(tvVar);
            return;
        }
        c5Var.f20091r = null;
        c5Var.f20086a.setOnClickListener(null);
        if (DialogObject.isUserDialog(dialogId)) {
            user = mj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            str = null;
        } else {
            TLRPC.Chat chat2 = mj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
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
            if (i10 == mj0Var.J - 1) {
                z10 = false;
            }
            c5Var.b(user, null, str, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.c7 c7Var;
        mj0 mj0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f35198c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.t4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.m3(context, 16);
                                view.setLayoutParams(new s4.p0(-1, 16));
                            }
                        } else {
                            view = new lj0(mj0Var, context);
                            view.setLayoutParams(new s4.p0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    ig.f fVar = new ig.f(mj0Var.getResourceProvider());
                    mj0Var.f35752c0 = fVar;
                    view = new jj0(this, this.f35198c, i11, fVar, mj0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f35198c, org.telegram.ui.ActionBar.j6.G6, 16, 11, false, mj0Var.getResourceProvider());
                    n4Var.setHeight(43);
                    c7Var = n4Var;
                }
            } else {
                mj0Var.getResourceProvider();
                c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
            }
            view = c7Var;
        } else {
            org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(6, 2, this.f35198c, mj0Var.getResourceProvider(), false);
            c5Var.setDividerColor(org.telegram.ui.ActionBar.j6.f19095d7);
            view = c5Var;
        }
        return new s4.c1(view);
    }
}
