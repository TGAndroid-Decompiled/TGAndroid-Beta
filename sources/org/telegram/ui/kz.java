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
public final class kz extends org.telegram.ui.Components.lm0 {
    public final lz f41091c;

    public kz(lz lzVar) {
        this.f41091c = lzVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f41091c.G;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        lz lzVar = this.f41091c;
        if (i10 != lzVar.N && i10 != lzVar.J) {
            if (i10 == lzVar.H) {
                return 3;
            }
            if (i10 >= lzVar.L && i10 < lzVar.M) {
                return 4;
            }
            if (i10 != lzVar.K && i10 != lzVar.I) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f7;
        lz lzVar = this.f41091c;
        ArrayList arrayList = lzVar.f41406f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        if (i11 == 0) {
            lzVar.P = (bz) view;
            lzVar.h0();
        } else if (i11 == 2) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == lzVar.N) {
                i9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    i9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            i9Var.setFixedSize(12);
        } else {
            int i12 = 1;
            String str4 = null;
            if (i11 == 3) {
                ez ezVar = (ez) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                bi.md mdVar = ezVar.h;
                org.telegram.ui.ActionBar.b6 b6Var = ezVar.f39213c;
                TextView textView = ezVar.f39215n;
                ImageView imageView = ezVar.d;
                bi.md mdVar2 = ezVar.f39214f;
                ezVar.f39217s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                b6Var.l(str3, false);
                float f10 = ezVar.v;
                if (str3 == null) {
                    i12 = 0;
                }
                if (f10 != i12) {
                    ValueAnimator valueAnimator = ezVar.f39218w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ezVar.f39218w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ezVar.v = f7;
                    dz dzVar = ezVar.e;
                    dzVar.d = f7;
                    dzVar.invalidate();
                    mdVar2.setAlpha(ezVar.v);
                    ezVar.h.setAlpha(ezVar.v);
                    imageView.setAlpha(ezVar.v);
                    textView.setAlpha(1.0f - ezVar.v);
                    b6Var.setAlpha(ezVar.v);
                    ezVar.f39212b.setAlpha(1.0f - ezVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        mdVar2.setVisibility(8);
                        mdVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    mdVar2.setVisibility(0);
                    mdVar.setVisibility(0);
                }
            } else if (i11 == 4) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                Long l4 = (Long) lzVar.h.get(i10 - lzVar.L);
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
                    k4Var.setForbiddenCheck(false);
                    k4Var.c(lzVar.e.contains(l4), false);
                } else {
                    k4Var.setForbiddenCheck(true);
                    k4Var.c(false, false);
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
                k4Var.setTag(l4);
                k4Var.d(chat, str2, str4);
            } else if (i11 == 5) {
                org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) view;
                if (k10Var == lzVar.O) {
                    lzVar.O = null;
                }
                if (i10 == lzVar.I) {
                    k10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    k10Var.a("", null);
                    return;
                }
                lzVar.O = k10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    lzVar.g0(false);
                    return;
                }
                k10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                k10Var.a("", null);
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View k10Var;
        View view;
        lz lzVar = this.f41091c;
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
            frameLayout.addView(imageView, org.telegram.ui.Components.gb1.h(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            xh.n nVar = new xh.n(parentActivity);
            frameLayout.f38187a = nVar;
            org.telegram.ui.ActionBar.f7.V(nVar, org.telegram.ui.ActionBar.y6.B6, null);
            nVar.setTextSize(1, 14.0f);
            nVar.setGravity(17);
            nVar.setLines(2);
            frameLayout.addView(nVar, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.i9(lzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    k10Var = new jz(this, lzVar.getParentActivity(), lzVar);
                    k10Var.setLayoutParams(new s4.q0(-1, -2));
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, k10Var, null);
                } else if (i10 == 4) {
                    View k4Var = new org.telegram.ui.Cells.k4(lzVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, k4Var, null);
                    view = k4Var;
                } else if (i10 == 5) {
                    k10Var = new org.telegram.ui.Components.k10(lzVar.getParentActivity());
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, k10Var, null);
                }
                view2 = k10Var;
            }
            return new s4.e1(view2);
        }
        view2 = view;
        return new s4.e1(view2);
    }
}
