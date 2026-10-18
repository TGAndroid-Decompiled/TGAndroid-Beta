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
public final class mz extends org.telegram.ui.Components.hm0 {
    public final nz f39304c;

    public mz(nz nzVar) {
        this.f39304c = nzVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45961f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39304c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        nz nzVar = this.f39304c;
        if (i10 != nzVar.O && i10 != nzVar.K) {
            if (i10 == nzVar.I) {
                return 3;
            }
            if (i10 >= nzVar.M && i10 < nzVar.N) {
                return 4;
            }
            if (i10 != nzVar.L && i10 != nzVar.J) {
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
        nz nzVar = this.f39304c;
        ArrayList arrayList = nzVar.f39612f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
        int i12 = b1Var.f45961f;
        View view = b1Var.f45958a;
        if (i12 == 0) {
            nzVar.Q = (dz) view;
            nzVar.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            Activity parentActivity = nzVar.getParentActivity();
            if (i10 == nzVar.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(parentActivity, i11, org.telegram.ui.ActionBar.h6.f20955b7));
            if (i10 == nzVar.O) {
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
                gz gzVar = (gz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ai.vd vdVar = gzVar.h;
                org.telegram.ui.ActionBar.j5 j5Var = gzVar.f37387c;
                TextView textView = gzVar.f37389n;
                ImageView imageView = gzVar.d;
                ai.vd vdVar2 = gzVar.f37388f;
                gzVar.f37391s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                j5Var.l(str3, false);
                float f10 = gzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = gzVar.f37392w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        gzVar.f37392w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    gzVar.v = f7;
                    ei.u8 u8Var = gzVar.e;
                    u8Var.f9914c = f7;
                    u8Var.invalidate();
                    vdVar2.setAlpha(gzVar.v);
                    gzVar.h.setAlpha(gzVar.v);
                    imageView.setAlpha(gzVar.v);
                    textView.setAlpha(1.0f - gzVar.v);
                    j5Var.setAlpha(gzVar.v);
                    gzVar.f37386b.setAlpha(1.0f - gzVar.v);
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
                Long l4 = (Long) nzVar.h.get(i10 - nzVar.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = nzVar.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = nzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    f4Var.c(nzVar.e.contains(l4), false);
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
                if (h10Var == nzVar.P) {
                    nzVar.P = null;
                }
                if (i10 == nzVar.J) {
                    h10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    h10Var.a("", null);
                    return;
                }
                nzVar.P = h10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    nzVar.f0(false);
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
        nz nzVar = this.f39304c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = nzVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.z5.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
            wh.n nVar = new wh.n(parentActivity);
            frameLayout.f36350a = nVar;
            nVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
            nVar.setTextSize(1, 14.0f);
            nVar.setGravity(17);
            nVar.setLines(2);
            frameLayout.addView(nVar, w7.z5.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.d9(nzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    h10Var = new lz(this, nzVar.getParentActivity(), nzVar);
                    h10Var.setLayoutParams(new s4.o0(-1, -2));
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(1, 0, nzVar.getParentActivity(), false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    h10Var = new org.telegram.ui.Components.h10(nzVar.getParentActivity());
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                }
                view2 = h10Var;
            }
            return new s4.b1(view2);
        }
        view2 = view;
        return new s4.b1(view2);
    }
}
