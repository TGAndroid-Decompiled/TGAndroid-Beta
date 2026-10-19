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
public final class kz extends org.telegram.ui.Components.hm0 {
    public final lz f38694c;

    public kz(lz lzVar) {
        this.f38694c = lzVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38694c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        lz lzVar = this.f38694c;
        if (i10 != lzVar.O && i10 != lzVar.K) {
            if (i10 == lzVar.I) {
                return 3;
            }
            if (i10 >= lzVar.M && i10 < lzVar.N) {
                return 4;
            }
            if (i10 != lzVar.L && i10 != lzVar.J) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f7;
        int i11;
        lz lzVar = this.f38694c;
        ArrayList arrayList = lzVar.f39086f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
        int i12 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i12 == 0) {
            lzVar.Q = (bz) view;
            lzVar.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            Activity parentActivity = lzVar.getParentActivity();
            if (i10 == lzVar.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(parentActivity, i11, org.telegram.ui.ActionBar.h6.f20951b7));
            if (i10 == lzVar.O) {
                d9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    d9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    d9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            d9Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                ez ezVar = (ez) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ai.vd vdVar = ezVar.h;
                org.telegram.ui.ActionBar.j5 j5Var = ezVar.f36832c;
                TextView textView = ezVar.f36834n;
                ImageView imageView = ezVar.d;
                ai.vd vdVar2 = ezVar.f36833f;
                ezVar.f36836s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                j5Var.l(str3, false);
                float f10 = ezVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = ezVar.f36837w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ezVar.f36837w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ezVar.v = f7;
                    ei.u8 u8Var = ezVar.e;
                    u8Var.f9913c = f7;
                    u8Var.invalidate();
                    vdVar2.setAlpha(ezVar.v);
                    ezVar.h.setAlpha(ezVar.v);
                    imageView.setAlpha(ezVar.v);
                    textView.setAlpha(1.0f - ezVar.v);
                    j5Var.setAlpha(ezVar.v);
                    ezVar.f36831b.setAlpha(1.0f - ezVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        vdVar2.setVisibility(8);
                        vdVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    vdVar2.setVisibility(0);
                    vdVar.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                Long l4 = (Long) lzVar.h.get(i10 - lzVar.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = lzVar.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = lzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    f4Var.c(lzVar.e.contains(l4), false);
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
                org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
                if (h10Var == lzVar.P) {
                    lzVar.P = null;
                }
                if (i10 == lzVar.J) {
                    h10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    h10Var.a("", null);
                    return;
                }
                lzVar.P = h10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    lzVar.f0(false);
                    return;
                }
                h10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                h10Var.a("", null);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View h10Var;
        View view;
        lz lzVar = this.f38694c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = lzVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            wh.n nVar = new wh.n(parentActivity);
            frameLayout.f35758a = nVar;
            nVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
            nVar.setTextSize(1, 14.0f);
            nVar.setGravity(17);
            nVar.setLines(2);
            frameLayout.addView(nVar, w7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.d9(lzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    h10Var = new jz(this, lzVar.getParentActivity(), lzVar);
                    h10Var.setLayoutParams(new s4.o0(-1, -2));
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(lzVar.getParentActivity(), 1, 0, false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    h10Var = new org.telegram.ui.Components.h10(lzVar.getParentActivity());
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                }
                view2 = h10Var;
            }
            return new s4.b1(view2);
        }
        view2 = view;
        return new s4.b1(view2);
    }
}
