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
public final class cj0 extends org.telegram.ui.Components.ll0 {
    public final Context f32362c;
    public final ej0 d;

    public cj0(ej0 ej0Var, Context context) {
        this.d = ej0Var;
        this.f32362c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42627a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 0) {
            return ((org.telegram.ui.Cells.b5) c1Var.f42627a).getCurrentObject() instanceof TLObject;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.Q;
    }

    @Override
    public final int j(int i10) {
        ej0 ej0Var = this.d;
        if (ej0Var.R.contains(Integer.valueOf(i10))) {
            return 1;
        }
        if (i10 != ej0Var.H && i10 != ej0Var.O) {
            if (i10 == ej0Var.K) {
                return 3;
            }
            if (i10 == ej0Var.L) {
                return 4;
            }
            if (i10 == ej0Var.N) {
                return 5;
            }
            if (i10 == ej0Var.P) {
                return 6;
            }
            if (i10 == ej0Var.M) {
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
        int i16 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z10 = true;
        ej0 ej0Var = this.d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            if (i16 == 7) {
                                ba1 ba1Var = (ba1) view;
                                ba1Var.e(ej0Var.f32955s, false);
                                ba1Var.setLayoutParams(new s4.p0(-1, -2));
                                return;
                            }
                            return;
                        }
                        dj0 dj0Var = (dj0) view;
                        TextView[] textViewArr = dj0Var.f32671a;
                        TextView[] textViewArr2 = dj0Var.f32672b;
                        ej0 ej0Var2 = dj0Var.f32673c;
                        oa1 oa1Var = ej0Var2.f32951e0;
                        MessageObject messageObject2 = ej0Var2.f32953n;
                        if (oa1Var != null) {
                            i14 = oa1Var.d();
                            i13 = oa1Var.a();
                            i15 = oa1Var.c();
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
                        textViewArr[1].setText(AndroidUtilities.formatWholeNumber(ej0Var2.U, 0));
                        textViewArr2[1].setText(LocaleController.formatString("PublicShares", R.string.PublicShares, new Object[0]));
                        textViewArr[2].setText(AndroidUtilities.formatWholeNumber(i15, 0));
                        textViewArr2[2].setText(LocaleController.formatString("Reactions", R.string.Reactions, new Object[0]));
                        TLRPC.ChatFull chatFull = ej0Var2.f32944a;
                        if (chatFull != null && (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && i15 == 0) {
                            ((ViewGroup) textViewArr2[2].getParent()).setVisibility(8);
                        }
                        textViewArr[3].setText(AndroidUtilities.formatWholeNumber(Math.max(0, i13 - ej0Var2.U), 0));
                        textViewArr2[3].setText(LocaleController.formatString("PrivateShares", R.string.PrivateShares, new Object[0]));
                        dj0Var.a();
                        return;
                    }
                    ba1 ba1Var2 = (ba1) view;
                    ba1Var2.e(ej0Var.f32954r, false);
                    ba1Var2.setLayoutParams(new s4.p0(-1, -2));
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == ej0Var.O) {
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
            view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(this.f32362c, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f18753b7));
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        int i20 = ej0Var.I;
        if (i10 >= i20 && i10 < ej0Var.J) {
            messageObject = (MessageObject) ej0Var.f32957x.get(i10 - i20);
        } else {
            messageObject = null;
        }
        long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
        if (messageObject.isStory()) {
            if (DialogObject.isUserDialog(dialogId)) {
                chat = ej0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            } else {
                chat = ej0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
            }
            TL_stories.StoryViews storyViews = messageObject.storyItem.views;
            if (storyViews != null && (i11 = storyViews.views_count) != 0) {
                string = LocaleController.formatPluralString("Views", i11, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.NoViews);
            }
            if (i10 == ej0Var.J - 1) {
                z10 = false;
            }
            b5Var.b(chat, null, string, z10);
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            pv pvVar = new pv(22, this, messageObject);
            b5Var.f19802r = storyItem;
            b5Var.f19797a.setOnClickListener(pvVar);
            return;
        }
        b5Var.f19802r = null;
        b5Var.f19797a.setOnClickListener(null);
        if (DialogObject.isUserDialog(dialogId)) {
            user = ej0Var.getMessagesController().getUser(Long.valueOf(dialogId));
            str = null;
        } else {
            TLRPC.Chat chat2 = ej0Var.getMessagesController().getChat(Long.valueOf(-dialogId));
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
            if (i10 == ej0Var.J - 1) {
                z10 = false;
            }
            b5Var.b(user, null, str, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.Cells.a7 a7Var;
        ej0 ej0Var = this.d;
        if (i10 != 0) {
            int i11 = 1;
            Context context = this.f32362c;
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
                            view = new dj0(ej0Var, context);
                            view.setLayoutParams(new s4.p0(-1, -2));
                        }
                    }
                    if (i10 != 4) {
                        i11 = 2;
                    }
                    ig.f fVar = new ig.f(ej0Var.getResourceProvider());
                    ej0Var.f32949c0 = fVar;
                    view = new bj0(this, this.f32362c, i11, fVar, ej0Var.getResourceProvider());
                } else {
                    org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f32362c, org.telegram.ui.ActionBar.h6.G6, 16, 11, false, ej0Var.getResourceProvider());
                    m4Var.setHeight(43);
                    a7Var = m4Var;
                }
            } else {
                ej0Var.getResourceProvider();
                a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
            }
            view = a7Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f32362c, ej0Var.getResourceProvider(), false);
            b5Var.setDividerColor(org.telegram.ui.ActionBar.h6.f18790d7);
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
