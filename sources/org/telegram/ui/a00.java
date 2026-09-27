package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class a00 extends org.telegram.ui.Components.xl0 {
    public final b00 f31933c;

    public a00(b00 b00Var) {
        this.f31933c = b00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f31933c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        b00 b00Var = this.f31933c;
        if (i10 != b00Var.O && i10 != b00Var.K) {
            if (i10 == b00Var.I) {
                return 3;
            }
            if (i10 >= b00Var.M && i10 < b00Var.N) {
                return 4;
            }
            if (i10 != b00Var.L && i10 != b00Var.J) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f7;
        int i11;
        b00 b00Var = this.f31933c;
        ArrayList arrayList = b00Var.f32191f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = b00Var.d;
        int i12 = c1Var.f43008f;
        View view = c1Var.f43005a;
        if (i12 == 0) {
            b00Var.Q = (sz) view;
            b00Var.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            Activity parentActivity = b00Var.getParentActivity();
            if (i10 == b00Var.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            e9Var.setBackground(org.telegram.ui.ActionBar.i6.V0(parentActivity, i11, org.telegram.ui.ActionBar.i6.f19021b7));
            if (i10 == b00Var.O) {
                e9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    e9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            e9Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                uz uzVar = (uz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ai.p4 p4Var = uzVar.h;
                org.telegram.ui.ActionBar.j5 j5Var = uzVar.f38383c;
                TextView textView = uzVar.f38385n;
                ImageView imageView = uzVar.d;
                ai.p4 p4Var2 = uzVar.f38384f;
                uzVar.f38387s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                j5Var.l(str3, false);
                float f10 = uzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = uzVar.f38388w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        uzVar.f38388w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    uzVar.v = f7;
                    ci.f9 f9Var = uzVar.e;
                    f9Var.f4709c = f7;
                    f9Var.invalidate();
                    p4Var2.setAlpha(uzVar.v);
                    uzVar.h.setAlpha(uzVar.v);
                    imageView.setAlpha(uzVar.v);
                    textView.setAlpha(1.0f - uzVar.v);
                    j5Var.setAlpha(uzVar.v);
                    uzVar.f38382b.setAlpha(1.0f - uzVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        p4Var2.setVisibility(8);
                        p4Var.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    p4Var2.setVisibility(0);
                    p4Var.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                Long l4 = (Long) b00Var.h.get(i10 - b00Var.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = b00Var.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = b00Var.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat2 != null) {
                        str4 = chat2.title;
                        if (chat2.participants_count != 0) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                str = LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count);
                            } else {
                                str = LocaleController.formatPluralStringComma("Members", chat2.participants_count);
                            }
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            str = LocaleController.getString("ChannelPublic");
                        } else {
                            str = LocaleController.getString("MegaPublic");
                        }
                    } else {
                        str = null;
                    }
                    String str5 = str4;
                    str4 = str;
                    str2 = str5;
                    chat = chat2;
                }
                if (arrayList.contains(l4)) {
                    g4Var.setForbiddenCheck(false);
                    g4Var.c(b00Var.e.contains(l4), false);
                } else {
                    g4Var.setForbiddenCheck(true);
                    g4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str4 = LocaleController.getString(R.string.FilterInviteBot);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteUser);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            str4 = LocaleController.getString(R.string.FilterInviteChannel);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteGroup);
                        }
                    }
                }
                g4Var.setTag(l4);
                g4Var.d(chat, str2, str4);
            } else if (i12 == 5) {
                org.telegram.ui.Components.b10 b10Var = (org.telegram.ui.Components.b10) view;
                if (b10Var == b00Var.P) {
                    b00Var.P = null;
                }
                if (i10 == b00Var.J) {
                    b10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    b10Var.a("", null);
                    return;
                }
                b00Var.P = b10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    b00Var.f0(false);
                    return;
                }
                b10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                b10Var.a("", null);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View b10Var;
        View view;
        b00 b00Var = this.f31933c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = b00Var.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.y5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            vh.n nVar = new vh.n(parentActivity);
            frameLayout.f37606a = nVar;
            nVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B6, false));
            nVar.setTextSize(1, 14.0f);
            nVar.setGravity(17);
            nVar.setLines(2);
            frameLayout.addView(nVar, w7.y5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(b00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    b10Var = new zz(this, b00Var.getParentActivity(), b00Var);
                    b10Var.setLayoutParams(new s4.p0(-1, -2));
                    b10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(b00Var.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    b10Var = new org.telegram.ui.Components.b10(b00Var.getParentActivity());
                    b10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                }
                view2 = b10Var;
            }
            return new s4.c1(view2);
        }
        view2 = view;
        return new s4.c1(view2);
    }
}
