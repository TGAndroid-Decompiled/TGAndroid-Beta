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
public final class qi0 extends org.telegram.ui.Components.il0 {
    public final Context f41737c;
    public final si0 d;

    public qi0(si0 si0Var, Context context) {
        this.d = si0Var;
        this.f41737c = context;
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return ((org.telegram.ui.Cells.z4) n1Var.f6432a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.M;
    }

    @Override
    public final int j(int i10) {
        si0 si0Var = this.d;
        if (si0Var.N.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != si0Var.D && i10 != si0Var.K) {
            if (i10 == si0Var.G) {
                return 3;
            }
            if (i10 == si0Var.H) {
                return 4;
            }
            if (i10 == si0Var.J) {
                return 5;
            }
            if (i10 == si0Var.L) {
                return 6;
            }
            if (i10 == si0Var.I) {
                return 7;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
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
        int i16 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = true;
        si0 si0Var = this.d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            if (i16 == 7) {
                                d91 d91Var = (d91) view;
                                d91Var.e(si0Var.f42409s, false);
                                d91Var.setLayoutParams(new f2.x0(-1, -2));
                                return;
                            }
                            return;
                        }
                        ri0 ri0Var = (ri0) view;
                        TextView[] textViewArr = ri0Var.f42120a;
                        TextView[] textViewArr2 = ri0Var.f42121b;
                        si0 si0Var2 = ri0Var.f42122c;
                        q91 q91Var = si0Var2.f42402a0;
                        MessageObject messageObject2 = si0Var2.f42407n;
                        if (q91Var != null) {
                            i14 = q91Var.d();
                            i13 = q91Var.a();
                            i15 = q91Var.c();
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
                        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(si0Var2.Q, 0));
                        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i15, 0));
                        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
                        TLRPC.ChatFull chatFull = si0Var2.f42401a;
                        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i15 == 0) {
                            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
                        }
                        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i13 - si0Var2.Q), 0));
                        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
                        ri0Var.a();
                        return;
                    }
                    d91 d91Var2 = (d91) view;
                    d91Var2.e(si0Var.f42408r, false);
                    d91Var2.setLayoutParams(new f2.x0(-1, -2));
                    return;
                }
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 == si0Var.K) {
                    k4Var.setTopMargin(9);
                    k4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    k4Var.setText(LocaleController.formatString("StatisticOverview", R.string.StatisticOverview, new Object[0]));
                    return;
                }
                k4Var.setTopMargin(11);
                k4Var.setPadding(0, 0, 0, 0);
                k4Var.setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                return;
            }
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(this.f41737c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
            return;
        }
        org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
        int i20 = si0Var.E;
        if (i10 >= i20 && i10 < si0Var.F) {
            messageObject = (MessageObject) si0Var.f42411x.get(i10 - i20);
        } else {
            messageObject = null;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        if (messageObject.isStory()) {
            if (DialogObject.isUserDialog(dialogId)) {
                chat = si0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                chat = si0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            }
            TL_stories.StoryViews storyViews = messageObject.storyItem.views;
            if (storyViews != null && (i11 = storyViews.views_count) != 0) {
                string = LocaleController.formatPluralString("Views", i11, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.NoViews);
            }
            if (i10 == si0Var.F - 1) {
                z10 = false;
            }
            z4Var.b(chat, null, string, z10);
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            t70 t70Var = new t70(10, this, messageObject);
            z4Var.f26047r = storyItem;
            z4Var.f26041a.setOnClickListener(t70Var);
            return;
        }
        z4Var.f26047r = null;
        z4Var.f26041a.setOnClickListener(null);
        if (DialogObject.isUserDialog(dialogId)) {
            user = si0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            str = null;
        } else {
            TLRPC.Chat chat2 = si0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
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
            if (i10 == si0Var.F - 1) {
                z10 = false;
            }
            z4Var.b(user, null, str, z10);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.x6 x6Var;
        si0 si0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f41737c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    view = new org.telegram.ui.Cells.q4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                                }
                            } else {
                                view = new org.telegram.ui.Cells.i3(context, 16);
                                view.setLayoutParams(new f2.x0(-1, 16));
                            }
                        } else {
                            view = new ri0(si0Var, context);
                            view.setLayoutParams(new f2.x0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    tf.f fVar = new tf.f(si0Var.getResourceProvider());
                    si0Var.Y = fVar;
                    view = new pi0(this, this.f41737c, i11, fVar, si0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(this.f41737c, org.telegram.ui.ActionBar.g6.G6, 16, 11, false, si0Var.getResourceProvider());
                    k4Var.setHeight(43);
                    x6Var = k4Var;
                }
            } else {
                si0Var.getResourceProvider();
                x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
            }
            view = x6Var;
        } else {
            org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(6, 2, this.f41737c, si0Var.getResourceProvider(), false);
            z4Var.setDividerColor(org.telegram.ui.ActionBar.g6.f23063d7);
            view = z4Var;
        }
        return new f2.n1(view);
    }
}
