package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class op extends org.telegram.ui.Components.rl0 {
    public final Context f39773c;
    public final rp d;

    public op(rp rpVar, Context context) {
        this.d = rpVar;
        this.f39773c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        rp rpVar = this.d;
        if (rpVar.f40901w && !rpVar.f40902x) {
            return 0;
        }
        return rpVar.J;
    }

    @Override
    public final int j(int i10) {
        rp rpVar = this.d;
        rpVar.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 != rpVar.C && i10 != rpVar.F) {
            if (i10 >= rpVar.D && i10 < rpVar.E) {
                return 0;
            }
            if (i10 == rpVar.H) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String k10;
        rp rpVar = this.d;
        boolean z4 = rpVar.f40900s;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (z4) {
                        if (rpVar.h.linked_chat_id != 0) {
                            int i12 = org.telegram.ui.ActionBar.k6.f21878p7;
                            y4Var.a(i12, i12);
                            y4Var.b(LocaleController.getString(R.string.DiscussionUnlinkGroup), R.drawable.msg_remove, 5, false);
                            return;
                        }
                        y4Var.a(org.telegram.ui.ActionBar.k6.f21981v6, org.telegram.ui.ActionBar.k6.f21963u6);
                        y4Var.b(LocaleController.getString(R.string.DiscussionCreateGroup), R.drawable.msg_groups, 5, true);
                        return;
                    }
                    int i13 = org.telegram.ui.ActionBar.k6.f21878p7;
                    y4Var.a(i13, i13);
                    y4Var.b(LocaleController.getString(R.string.DiscussionUnlinkChannel), R.drawable.msg_remove, 5, false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == rpVar.I) {
                a9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                return;
            } else if (i10 == rpVar.G) {
                if (z4) {
                    a9Var.setText(LocaleController.getString(R.string.DiscussionChannelHelp2));
                    return;
                } else {
                    a9Var.setText(LocaleController.getString(R.string.DiscussionGroupHelp2));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i10));
        TLRPC.Chat chat = (TLRPC.Chat) rpVar.v.get(i10 - rpVar.D);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (TextUtils.isEmpty(publicUsername)) {
            k10 = null;
        } else {
            k10 = yh.k("@", publicUsername);
        }
        b5Var.b(chat, null, k10, (i10 == rpVar.E - 1 && rpVar.h.linked_chat_id == 0) ? true : true);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout b5Var;
        TLRPC.Chat chat;
        rp rpVar = this.d;
        boolean z4 = rpVar.f40900s;
        if (i10 != 0) {
            Context context = this.f39773c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.f38092c = UserConfig.selectedAccount;
                        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                        linearLayout.f38090a = p9Var;
                        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(p9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
                        linearLayout.f38091b = m90Var;
                        p9Var.setImageDrawable(m90Var);
                        linearLayout.addView(p9Var, k7.c6.t(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, k7.c6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21719g9, false));
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z4) {
                            TLRPC.ChatFull chatFull = rpVar.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat chat2 = rpVar.getMessagesController().getChat(Long.valueOf(rpVar.h.linked_chat_id));
                                if (chat2 != null) {
                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat2.title)));
                                }
                            } else {
                                textView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
                            }
                        } else {
                            TLRPC.Chat chat3 = rpVar.getMessagesController().getChat(Long.valueOf(rpVar.h.linked_chat_id));
                            if (chat3 != null) {
                                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat3.title)));
                            }
                        }
                        frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        b5Var = frameLayout;
                    } else {
                        if (z4) {
                            chat = (TLRPC.Chat) rpVar.v.get(0);
                        } else {
                            chat = rpVar.f40897f;
                        }
                        np npVar = new np(this, context, chat, chat);
                        rpVar.f40903y = npVar;
                        b5Var = npVar;
                    }
                } else {
                    b5Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                b5Var = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f39773c, null, false);
        }
        return new f2.m1(b5Var);
    }
}
