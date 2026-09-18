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
public final class d00 extends org.telegram.ui.Components.ll0 {
    public final e00 f32982c;

    public d00(e00 e00Var) {
        this.f32982c = e00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42705f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32982c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        e00 e00Var = this.f32982c;
        if (i10 != e00Var.O && i10 != e00Var.K) {
            if (i10 == e00Var.I) {
                return 3;
            }
            if (i10 >= e00Var.M && i10 < e00Var.N) {
                return 4;
            }
            if (i10 != e00Var.L && i10 != e00Var.J) {
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
        e00 e00Var = this.f32982c;
        ArrayList arrayList = e00Var.f33252f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = e00Var.d;
        int i12 = c1Var.f42705f;
        View view = c1Var.f42702a;
        if (i12 == 0) {
            e00Var.Q = (vz) view;
            e00Var.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            Activity parentActivity = e00Var.getParentActivity();
            if (i10 == e00Var.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(parentActivity, i11, org.telegram.ui.ActionBar.j6.f18827b7));
            if (i10 == e00Var.O) {
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
                xz xzVar = (xz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ai.p4 p4Var = xzVar.h;
                org.telegram.ui.ActionBar.k5 k5Var = xzVar.f39734c;
                TextView textView = xzVar.f39736n;
                ImageView imageView = xzVar.d;
                ai.p4 p4Var2 = xzVar.f39735f;
                xzVar.f39738s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                k5Var.l(str3, false);
                float f10 = xzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = xzVar.f39739w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        xzVar.f39739w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    xzVar.v = f7;
                    ci.j9 j9Var = xzVar.e;
                    j9Var.f4857c = f7;
                    j9Var.invalidate();
                    p4Var2.setAlpha(xzVar.v);
                    xzVar.h.setAlpha(xzVar.v);
                    imageView.setAlpha(xzVar.v);
                    textView.setAlpha(1.0f - xzVar.v);
                    k5Var.setAlpha(xzVar.v);
                    xzVar.f39733b.setAlpha(1.0f - xzVar.v);
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
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                Long l4 = (Long) e00Var.h.get(i10 - e00Var.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = e00Var.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = e00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    f4Var.setForbiddenCheck(false);
                    f4Var.c(e00Var.e.contains(l4), false);
                } else {
                    f4Var.setForbiddenCheck(true);
                    f4Var.c(false, false);
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
                f4Var.setTag(l4);
                f4Var.d(chat, str2, str4);
            } else if (i12 == 5) {
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) view;
                if (z00Var == e00Var.P) {
                    e00Var.P = null;
                }
                if (i10 == e00Var.J) {
                    z00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    z00Var.a("", null);
                    return;
                }
                e00Var.P = z00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    e00Var.f0(false);
                    return;
                }
                z00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                z00Var.a("", null);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View z00Var;
        View view;
        e00 e00Var = this.f32982c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = e00Var.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.x5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            vh.o oVar = new vh.o(parentActivity);
            frameLayout.f38539a = oVar;
            oVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            oVar.setTextSize(1, 14.0f);
            oVar.setGravity(17);
            oVar.setLines(2);
            frameLayout.addView(oVar, w7.x5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(e00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    z00Var = new c00(this, e00Var.getParentActivity(), e00Var);
                    z00Var.setLayoutParams(new s4.p0(-1, -2));
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(e00Var.getParentActivity(), 1, 0, false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    z00Var = new org.telegram.ui.Components.z00(e00Var.getParentActivity());
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                }
                view2 = z00Var;
            }
            return new s4.c1(view2);
        }
        view2 = view;
        return new s4.c1(view2);
    }
}
