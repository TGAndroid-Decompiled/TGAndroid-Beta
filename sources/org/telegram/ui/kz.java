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
public final class kz extends org.telegram.ui.Components.vk0 {
    public final lz f39948c;

    public kz(lz lzVar) {
        this.f39948c = lzVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39948c.D;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        lz lzVar = this.f39948c;
        if (i9 != lzVar.K && i9 != lzVar.G) {
            if (i9 == lzVar.E) {
                return 3;
            }
            if (i9 >= lzVar.I && i9 < lzVar.J) {
                return 4;
            }
            if (i9 != lzVar.H && i9 != lzVar.F) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f10;
        int i10;
        lz lzVar = this.f39948c;
        ArrayList arrayList = lzVar.f40257f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i11 == 0) {
            lzVar.M = (cz) view;
            lzVar.f0();
        } else if (i11 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            Activity parentActivity = lzVar.getParentActivity();
            if (i9 == lzVar.K) {
                i10 = R.drawable.greydivider_bottom;
            } else {
                i10 = R.drawable.greydivider;
            }
            b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(parentActivity, i10, org.telegram.ui.ActionBar.f6.f22966b7));
            if (i9 == lzVar.K) {
                b9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    b9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    b9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            b9Var.setFixedSize(12);
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
                bg.t tVar = ezVar.h;
                org.telegram.ui.ActionBar.h5 h5Var = ezVar.f38047c;
                TextView textView = ezVar.f38050n;
                ImageView imageView = ezVar.d;
                bg.t tVar2 = ezVar.f38049f;
                ezVar.f38052s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                h5Var.l(str3, false);
                float f11 = ezVar.v;
                if (str3 == null) {
                    i12 = 0;
                }
                if (f11 != i12) {
                    ValueAnimator valueAnimator = ezVar.f38053w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ezVar.f38053w = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ezVar.v = f10;
                    kh.v8 v8Var = ezVar.f38048e;
                    v8Var.f16208c = f10;
                    v8Var.invalidate();
                    tVar2.setAlpha(ezVar.v);
                    ezVar.h.setAlpha(ezVar.v);
                    imageView.setAlpha(ezVar.v);
                    textView.setAlpha(1.0f - ezVar.v);
                    h5Var.setAlpha(ezVar.v);
                    ezVar.f38046b.setAlpha(1.0f - ezVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        tVar2.setVisibility(8);
                        tVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    tVar2.setVisibility(0);
                    tVar.setVisibility(0);
                }
            } else if (i11 == 4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                Long l10 = (Long) lzVar.h.get(i9 - lzVar.I);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = lzVar.getMessagesController().getUser(l10);
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
                if (arrayList.contains(l10)) {
                    g4Var.setForbiddenCheck(false);
                    g4Var.c(lzVar.f40256e.contains(l10), false);
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
                g4Var.setTag(l10);
                g4Var.d(chat, str2, str4);
            } else if (i11 == 5) {
                org.telegram.ui.Components.k00 k00Var = (org.telegram.ui.Components.k00) view;
                if (k00Var == lzVar.L) {
                    lzVar.L = null;
                }
                if (i9 == lzVar.F) {
                    k00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    k00Var.a("", null);
                    return;
                }
                lzVar.L = k00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    lzVar.e0(false);
                    return;
                }
                k00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                k00Var.a("", null);
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View k00Var;
        View view;
        lz lzVar = this.f39948c;
        View view2 = null;
        if (i9 == 0) {
            Activity parentActivity = lzVar.getParentActivity();
            int i10 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i10, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, g7.e6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            dh.u uVar = new dh.u(parentActivity);
            frameLayout.f37361a = uVar;
            uVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
            uVar.setTextSize(1, 14.0f);
            uVar.setGravity(17);
            uVar.setLines(2);
            frameLayout.addView(uVar, g7.e6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i9 == 2) {
                view2 = new org.telegram.ui.Cells.b9(lzVar.getParentActivity());
            } else {
                if (i9 == 3) {
                    k00Var = new jz(this, lzVar.getParentActivity(), lzVar);
                    k00Var.setLayoutParams(new f2.a1(-1, -2));
                    k00Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                } else if (i9 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(lzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                    view = g4Var;
                } else if (i9 == 5) {
                    k00Var = new org.telegram.ui.Components.k00(lzVar.getParentActivity());
                    k00Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                }
                view2 = k00Var;
            }
            return new f2.q1(view2);
        }
        view2 = view;
        return new f2.q1(view2);
    }
}
