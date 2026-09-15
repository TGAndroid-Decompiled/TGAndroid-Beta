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
public final class hj0 extends org.telegram.ui.Components.kl0 {
    public final Context f34300c;
    public final jj0 d;

    public hj0(jj0 jj0Var, Context context) {
        this.d = jj0Var;
        this.f34300c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f == 0) {
            return ((org.telegram.ui.Cells.a5) c1Var.f42675a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        jj0 jj0Var = this.d;
        if (jj0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != jj0Var.H && i10 != jj0Var.O) {
            if (i10 == jj0Var.K) {
                return 3;
            }
            if (i10 == jj0Var.L) {
                return 4;
            }
            if (i10 == jj0Var.N) {
                return 5;
            }
            if (i10 == jj0Var.P) {
                return 6;
            }
            if (i10 == jj0Var.M) {
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
        int i16 = c1Var.f42678f;
        View view = c1Var.f42675a;
        boolean z10 = true;
        jj0 jj0Var = this.d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            if (i16 == 7) {
                                ia1 ia1Var = (ia1) view;
                                ia1Var.e(jj0Var.f34926s, false);
                                ia1Var.setLayoutParams(new s4.p0(-1, -2));
                                return;
                            }
                            return;
                        }
                        ij0 ij0Var = (ij0) view;
                        TextView[] textViewArr = ij0Var.f34689a;
                        TextView[] textViewArr2 = ij0Var.f34690b;
                        jj0 jj0Var2 = ij0Var.f34691c;
                        va1 va1Var = jj0Var2.f34922e0;
                        MessageObject messageObject2 = jj0Var2.f34924n;
                        if (va1Var != null) {
                            i14 = va1Var.d();
                            i13 = va1Var.a();
                            i15 = va1Var.c();
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
                        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(jj0Var2.U, 0));
                        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i15, 0));
                        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
                        TLRPC.ChatFull chatFull = jj0Var2.f34915a;
                        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i15 == 0) {
                            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
                        }
                        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i13 - jj0Var2.U), 0));
                        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
                        ij0Var.a();
                        return;
                    }
                    ia1 ia1Var2 = (ia1) view;
                    ia1Var2.e(jj0Var.f34925r, false);
                    ia1Var2.setLayoutParams(new s4.p0(-1, -2));
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == jj0Var.O) {
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
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(this.f34300c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f18800b7));
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        int i20 = jj0Var.I;
        if (i10 >= i20 && i10 < jj0Var.J) {
            messageObject = (MessageObject) jj0Var.f34928x.get(i10 - i20);
        } else {
            messageObject = null;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        if (messageObject.isStory()) {
            if (DialogObject.isUserDialog(dialogId)) {
                chat = jj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                chat = jj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            }
            TL_stories.StoryViews storyViews = messageObject.storyItem.views;
            if (storyViews != null && (i11 = storyViews.views_count) != 0) {
                string = LocaleController.formatPluralString("Views", i11, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.NoViews);
            }
            if (i10 == jj0Var.J - 1) {
                z10 = false;
            }
            a5Var.b(chat, null, string, z10);
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            sv svVar = new sv(22, this, messageObject);
            a5Var.f19792r = storyItem;
            a5Var.f19787a.setOnClickListener(svVar);
            return;
        }
        a5Var.f19792r = null;
        a5Var.f19787a.setOnClickListener(null);
        if (DialogObject.isUserDialog(dialogId)) {
            user = jj0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            str = null;
        } else {
            TLRPC.Chat chat2 = jj0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
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
            if (i10 == jj0Var.J - 1) {
                z10 = false;
            }
            a5Var.b(user, null, str, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.a7 a7Var;
        jj0 jj0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f34300c;
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
                            view = new ij0(jj0Var, context);
                            view.setLayoutParams(new s4.p0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    ig.f fVar = new ig.f(jj0Var.getResourceProvider());
                    jj0Var.f34920c0 = fVar;
                    view = new gj0(this, this.f34300c, i11, fVar, jj0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f34300c, org.telegram.ui.ActionBar.i6.G6, 16, 11, false, jj0Var.getResourceProvider());
                    l4Var.setHeight(43);
                    a7Var = l4Var;
                }
            } else {
                jj0Var.getResourceProvider();
                a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            }
            view = a7Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(6, 2, this.f34300c, jj0Var.getResourceProvider(), false);
            a5Var.setDividerColor(org.telegram.ui.ActionBar.i6.f18837d7);
            view = a5Var;
        }
        return new s4.c1(view);
    }
}
