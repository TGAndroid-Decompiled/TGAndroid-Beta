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
public final class b00 extends org.telegram.ui.Components.kl0 {
    public final c00 f34606c;

    public b00(c00 c00Var) {
        this.f34606c = c00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34606c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        c00 c00Var = this.f34606c;
        if (i10 != c00Var.O && i10 != c00Var.K) {
            if (i10 == c00Var.I) {
                return 3;
            }
            if (i10 >= c00Var.M && i10 < c00Var.N) {
                return 4;
            }
            if (i10 != c00Var.L && i10 != c00Var.J) {
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
        c00 c00Var = this.f34606c;
        ArrayList arrayList = c00Var.f34984f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = c00Var.d;
        int i12 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i12 == 0) {
            c00Var.Q = (tz) view;
            c00Var.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            Activity parentActivity = c00Var.getParentActivity();
            if (i10 == c00Var.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(parentActivity, i11, org.telegram.ui.ActionBar.j6.f20654b7));
            if (i10 == c00Var.O) {
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
                vz vzVar = (vz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                bi.c4 c4Var = vzVar.h;
                org.telegram.ui.ActionBar.j5 j5Var = vzVar.f41744c;
                TextView textView = vzVar.f41747n;
                ImageView imageView = vzVar.d;
                bi.c4 c4Var2 = vzVar.f41746f;
                vzVar.f41749s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                j5Var.l(str3, false);
                float f10 = vzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = vzVar.f41750w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        vzVar.f41750w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    vzVar.v = f7;
                    di.i9 i9Var = vzVar.f41745e;
                    i9Var.f7414c = f7;
                    i9Var.invalidate();
                    c4Var2.setAlpha(vzVar.v);
                    vzVar.h.setAlpha(vzVar.v);
                    imageView.setAlpha(vzVar.v);
                    textView.setAlpha(1.0f - vzVar.v);
                    j5Var.setAlpha(vzVar.v);
                    vzVar.f41743b.setAlpha(1.0f - vzVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        c4Var2.setVisibility(8);
                        c4Var.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    c4Var2.setVisibility(0);
                    c4Var.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                Long l4 = (Long) c00Var.h.get(i10 - c00Var.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = c00Var.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = c00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    f4Var.c(c00Var.f34983e.contains(l4), false);
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
                if (z00Var == c00Var.P) {
                    c00Var.P = null;
                }
                if (i10 == c00Var.J) {
                    z00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    z00Var.a("", null);
                    return;
                }
                c00Var.P = z00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    c00Var.f0(false);
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
        c00 c00Var = this.f34606c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = c00Var.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.x5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            wh.p pVar = new wh.p(parentActivity);
            frameLayout.f40898a = pVar;
            pVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            pVar.setTextSize(1, 14.0f);
            pVar.setGravity(17);
            pVar.setLines(2);
            frameLayout.addView(pVar, w7.x5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(c00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    z00Var = new a00(this, c00Var.getParentActivity(), c00Var);
                    z00Var.setLayoutParams(new s4.p0(-1, -2));
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(c00Var.getParentActivity(), 1, 0, false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    z00Var = new org.telegram.ui.Components.z00(c00Var.getParentActivity());
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                }
                view2 = z00Var;
            }
            return new s4.c1(view2);
        }
        view2 = view;
        return new s4.c1(view2);
    }
}
