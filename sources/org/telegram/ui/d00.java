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
public final class d00 extends org.telegram.ui.Components.ul0 {
    public final e00 f31799c;

    public d00(e00 e00Var) {
        this.f31799c = e00Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f31799c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        e00 e00Var = this.f31799c;
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
        e00 e00Var = this.f31799c;
        ArrayList arrayList = e00Var.f32005f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = e00Var.d;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i12 == 0) {
            e00Var.Q = (vz) view;
            e00Var.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            Activity parentActivity = e00Var.getParentActivity();
            if (i10 == e00Var.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(parentActivity, i11, org.telegram.ui.ActionBar.j6.f17892b7));
            if (i10 == e00Var.O) {
                f9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    f9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    f9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            f9Var.setFixedSize(12);
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
                di.h hVar = xzVar.h;
                org.telegram.ui.ActionBar.l5 l5Var = xzVar.f38844c;
                TextView textView = xzVar.f38846n;
                ImageView imageView = xzVar.d;
                di.h hVar2 = xzVar.f38845f;
                xzVar.f38848s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                l5Var.l(str3, false);
                float f10 = xzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = xzVar.f38849w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        xzVar.f38849w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    xzVar.v = f7;
                    bi.la laVar = xzVar.e;
                    laVar.f3052c = f7;
                    laVar.invalidate();
                    hVar2.setAlpha(xzVar.v);
                    xzVar.h.setAlpha(xzVar.v);
                    imageView.setAlpha(xzVar.v);
                    textView.setAlpha(1.0f - xzVar.v);
                    l5Var.setAlpha(xzVar.v);
                    xzVar.f38843b.setAlpha(1.0f - xzVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        hVar2.setVisibility(8);
                        hVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    hVar2.setVisibility(0);
                    hVar.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
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
                    g4Var.setForbiddenCheck(false);
                    g4Var.c(e00Var.e.contains(l4), false);
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
                org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
                if (h10Var == e00Var.P) {
                    e00Var.P = null;
                }
                if (i10 == e00Var.J) {
                    h10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    h10Var.a("", null);
                    return;
                }
                e00Var.P = h10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    e00Var.f0(false);
                    return;
                }
                h10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                h10Var.a("", null);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h10Var;
        View view;
        e00 e00Var = this.f31799c;
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
            frameLayout.addView(imageView, w7.a6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            uh.o oVar = new uh.o(parentActivity);
            frameLayout.f37657a = oVar;
            oVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            oVar.setTextSize(1, 14.0f);
            oVar.setGravity(17);
            oVar.setLines(2);
            frameLayout.addView(oVar, w7.a6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.f9(e00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    h10Var = new c00(this, e00Var.getParentActivity(), e00Var);
                    h10Var.setLayoutParams(new s4.p0(-1, -2));
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(e00Var.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    h10Var = new org.telegram.ui.Components.h10(e00Var.getParentActivity());
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                }
                view2 = h10Var;
            }
            return new s4.c1(view2);
        }
        view2 = view;
        return new s4.c1(view2);
    }
}
