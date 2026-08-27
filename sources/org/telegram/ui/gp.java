package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class gp extends org.telegram.ui.Components.yk0 {

    public final Context f38459c;
    public final jp d;

    public gp(jp jpVar, Context context) {
        this.d = jpVar;
        this.f38459c = context;
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 2;
    }

    @Override
    public final int h() {
        jp jpVar = this.d;
        if (!jpVar.f39458w || jpVar.f39459x) {
            return jpVar.I;
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        jp jpVar = this.d;
        jpVar.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == jpVar.B || i10 == jpVar.E) {
            return 2;
        }
        if (i10 < jpVar.C || i10 >= jpVar.D) {
            return i10 == jpVar.G ? 4 : 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        jp jpVar = this.d;
        boolean z10 = jpVar.f39457s;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            y4Var.setTag(Integer.valueOf(i10));
            TLRPC.Chat chat = (TLRPC.Chat) jpVar.v.get(i10 - jpVar.C);
            String publicUsername = ChatObject.getPublicUsername(chat);
            y4Var.b(chat, null, TextUtils.isEmpty(publicUsername) ? null : s3.c.e("@", publicUsername), (i10 == jpVar.D - 1 && jpVar.h.linked_chat_id == 0) ? false : true);
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == jpVar.H) {
                x8Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                return;
            } else {
                if (i10 == jpVar.F) {
                    if (z10) {
                        x8Var.setText(LocaleController.getString(R.string.DiscussionChannelHelp2));
                        return;
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.DiscussionGroupHelp2));
                        return;
                    }
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
        if (!z10) {
            int i12 = org.telegram.ui.ActionBar.g6.f23269p7;
            v4Var.a(i12, i12);
            v4Var.b(LocaleController.getString(R.string.DiscussionUnlinkChannel), R.drawable.msg_remove, 5, false);
        } else if (jpVar.h.linked_chat_id == 0) {
            v4Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
            v4Var.b(LocaleController.getString(R.string.DiscussionCreateGroup), R.drawable.msg_groups, 5, true);
        } else {
            int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
            v4Var.a(i13, i13);
            v4Var.b(LocaleController.getString(R.string.DiscussionUnlinkGroup), R.drawable.msg_remove, 5, false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ?? y4Var;
        jp jpVar = this.d;
        boolean z10 = jpVar.f39457s;
        if (i10 != 0) {
            Context context = this.f38459c;
            if (i10 == 1) {
                y4Var = new org.telegram.ui.Cells.x8(context);
            } else if (i10 == 2) {
                y4Var = new org.telegram.ui.Cells.v4(context);
            } else if (i10 != 4) {
                ?? dpVar = new dp(context);
                ?? cpVar = new cp(context);
                cpVar.f37125c = UserConfig.selectedAccount;
                cpVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                cpVar.setOrientation(1);
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                cpVar.f37123a = n9Var;
                org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(n9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
                cpVar.f37124b = v80Var;
                n9Var.setImageDrawable(v80Var);
                cpVar.addView(n9Var, h7.z5.t(104, 104, 49, 0, 2, 0, 0));
                dpVar.addView(cpVar, h7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23111g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (z10) {
                    TLRPC.ChatFull chatFull = jpVar.h;
                    if (chatFull == null || chatFull.linked_chat_id == 0) {
                        textView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
                    } else {
                        TLRPC.Chat chat = jpVar.getMessagesController().getChat(Long.valueOf(jpVar.h.linked_chat_id));
                        if (chat != null) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat.title)));
                        }
                    }
                } else {
                    TLRPC.Chat chat2 = jpVar.getMessagesController().getChat(Long.valueOf(jpVar.h.linked_chat_id));
                    if (chat2 != null) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat2.title)));
                    }
                }
                dpVar.addView(textView, h7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                dpVar.setTag(-33024);
                y4Var = dpVar;
            } else {
                TLRPC.Chat chat3 = z10 ? (TLRPC.Chat) jpVar.v.get(0) : jpVar.f39454f;
                fp fpVar = new fp(this, context, chat3, chat3);
                jpVar.f39460y = fpVar;
                y4Var = fpVar;
            }
        } else {
            y4Var = new org.telegram.ui.Cells.y4(6, 2, this.f38459c, null, false);
        }
        return new org.telegram.ui.Components.lk0(y4Var);
    }
}
