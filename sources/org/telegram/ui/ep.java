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
public final class ep extends org.telegram.ui.Components.vk0 {
    public final Context f38003c;
    public final hp d;

    public ep(hp hpVar, Context context) {
        this.d = hpVar;
        this.f38003c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        hp hpVar = this.d;
        if (hpVar.f38889w && !hpVar.f38890x) {
            return 0;
        }
        return hpVar.I;
    }

    @Override
    public final int j(int i9) {
        hp hpVar = this.d;
        hpVar.getClass();
        if (i9 == 0) {
            return 3;
        }
        if (i9 != hpVar.B && i9 != hpVar.E) {
            if (i9 >= hpVar.C && i9 < hpVar.D) {
                return 0;
            }
            if (i9 == hpVar.G) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String d;
        hp hpVar = this.d;
        boolean z10 = hpVar.f38888s;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z11 = false;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (z10) {
                        if (hpVar.h.linked_chat_id != 0) {
                            int i11 = org.telegram.ui.ActionBar.f6.f23212p7;
                            y4Var.a(i11, i11);
                            y4Var.b(LocaleController.getString(R.string.DiscussionUnlinkGroup), R.drawable.msg_remove, 5, false);
                            return;
                        }
                        y4Var.a(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                        y4Var.b(LocaleController.getString(R.string.DiscussionCreateGroup), R.drawable.msg_groups, 5, true);
                        return;
                    }
                    int i12 = org.telegram.ui.ActionBar.f6.f23212p7;
                    y4Var.a(i12, i12);
                    y4Var.b(LocaleController.getString(R.string.DiscussionUnlinkChannel), R.drawable.msg_remove, 5, false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == hpVar.H) {
                b9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                return;
            } else if (i9 == hpVar.F) {
                if (z10) {
                    b9Var.setText(LocaleController.getString(R.string.DiscussionChannelHelp2));
                    return;
                } else {
                    b9Var.setText(LocaleController.getString(R.string.DiscussionGroupHelp2));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i9));
        TLRPC.Chat chat = (TLRPC.Chat) hpVar.v.get(i9 - hpVar.C);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (TextUtils.isEmpty(publicUsername)) {
            d = null;
        } else {
            d = ta.b.d("@", publicUsername);
        }
        b5Var.b(chat, null, d, (i9 == hpVar.D - 1 && hpVar.h.linked_chat_id == 0) ? true : true);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout b5Var;
        TLRPC.Chat chat;
        hp hpVar = this.d;
        boolean z10 = hpVar.f38888s;
        if (i9 != 0) {
            Context context = this.f38003c;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.f36532c = UserConfig.selectedAccount;
                        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                        linearLayout.f36530a = o9Var;
                        org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(o9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
                        linearLayout.f36531b = r80Var;
                        o9Var.setImageDrawable(r80Var);
                        linearLayout.addView(o9Var, g7.e6.t(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, g7.e6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23058g9, false));
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z10) {
                            TLRPC.ChatFull chatFull = hpVar.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat chat2 = hpVar.getMessagesController().getChat(Long.valueOf(hpVar.h.linked_chat_id));
                                if (chat2 != null) {
                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat2.title)));
                                }
                            } else {
                                textView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
                            }
                        } else {
                            TLRPC.Chat chat3 = hpVar.getMessagesController().getChat(Long.valueOf(hpVar.h.linked_chat_id));
                            if (chat3 != null) {
                                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat3.title)));
                            }
                        }
                        frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        b5Var = frameLayout;
                    } else {
                        if (z10) {
                            chat = (TLRPC.Chat) hpVar.v.get(0);
                        } else {
                            chat = hpVar.f38885f;
                        }
                        dp dpVar = new dp(this, context, chat, chat);
                        hpVar.f38891y = dpVar;
                        b5Var = dpVar;
                    }
                } else {
                    b5Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                b5Var = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            b5Var = new org.telegram.ui.Cells.b5(6, 2, this.f38003c, null, false);
        }
        return new f2.q1(b5Var);
    }
}
