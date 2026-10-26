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
public final class kp extends org.telegram.ui.Components.lm0 {
    public final Context f40997c;
    public final np d;

    public kp(np npVar, Context context) {
        this.d = npVar;
        this.f40997c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47738a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        np npVar = this.d;
        if (npVar.f41968w && !npVar.f41969x) {
            return 0;
        }
        return npVar.M;
    }

    @Override
    public final int j(int i10) {
        np npVar = this.d;
        npVar.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 != npVar.F && i10 != npVar.I) {
            if (i10 >= npVar.G && i10 < npVar.H) {
                return 0;
            }
            if (i10 == npVar.K) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String j10;
        np npVar = this.d;
        boolean z10 = npVar.f41967s;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
                    if (z10) {
                        if (npVar.h.linked_chat_id != 0) {
                            int i12 = org.telegram.ui.ActionBar.y6.f23581p7;
                            c5Var.a(i12, i12);
                            c5Var.b(LocaleController.getString(R.string.DiscussionUnlinkGroup), R.drawable.msg_remove, 5, false);
                            return;
                        }
                        c5Var.a(org.telegram.ui.ActionBar.y6.f23692v6, org.telegram.ui.ActionBar.y6.f23673u6);
                        c5Var.b(LocaleController.getString(R.string.DiscussionCreateGroup), R.drawable.msg_groups, 5, true);
                        return;
                    }
                    int i13 = org.telegram.ui.ActionBar.y6.f23581p7;
                    c5Var.a(i13, i13);
                    c5Var.b(LocaleController.getString(R.string.DiscussionUnlinkChannel), R.drawable.msg_remove, 5, false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == npVar.L) {
                i9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                return;
            } else if (i10 == npVar.J) {
                if (z10) {
                    i9Var.setText(LocaleController.getString(R.string.DiscussionChannelHelp2));
                    return;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.DiscussionGroupHelp2));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
        f5Var.setTag(Integer.valueOf(i10));
        TLRPC.Chat chat = (TLRPC.Chat) npVar.v.get(i10 - npVar.G);
        String publicUsername = ChatObject.getPublicUsername(chat);
        if (TextUtils.isEmpty(publicUsername)) {
            j10 = null;
        } else {
            j10 = org.telegram.ui.Components.b10.j("@", publicUsername);
        }
        if (i10 != npVar.H - 1 || npVar.h.linked_chat_id != 0) {
            z11 = true;
        }
        f5Var.c(chat, null, j10, z11);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout f5Var;
        TLRPC.Chat chat;
        np npVar = this.d;
        boolean z10 = npVar.f41967s;
        if (i10 != 0) {
            Context context = this.f40997c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.f39433c = UserConfig.selectedAccount;
                        linearLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                        linearLayout.f39431a = y9Var;
                        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(y9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
                        linearLayout.f39432b = fa0Var;
                        y9Var.setImageDrawable(fa0Var);
                        linearLayout.addView(y9Var, org.telegram.ui.Components.gb1.x(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23414g9, null);
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z10) {
                            TLRPC.ChatFull chatFull = npVar.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat chat2 = npVar.getMessagesController().getChat(Long.valueOf(npVar.h.linked_chat_id));
                                if (chat2 != null) {
                                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat2.title)));
                                }
                            } else {
                                textView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
                            }
                        } else {
                            TLRPC.Chat chat3 = npVar.getMessagesController().getChat(Long.valueOf(npVar.h.linked_chat_id));
                            if (chat3 != null) {
                                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat3.title)));
                            }
                        }
                        frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        f5Var = frameLayout;
                    } else {
                        if (z10) {
                            chat = (TLRPC.Chat) npVar.v.get(0);
                        } else {
                            chat = npVar.f41964f;
                        }
                        jp jpVar = new jp(this, context, chat, chat);
                        npVar.f41970y = jpVar;
                        f5Var = jpVar;
                    }
                } else {
                    f5Var = new org.telegram.ui.Cells.c5(context);
                }
            } else {
                f5Var = new org.telegram.ui.Cells.i9(context);
            }
        } else {
            f5Var = new org.telegram.ui.Cells.f5(6, 2, this.f40997c, null, false);
        }
        return new s4.e1(f5Var);
    }
}
