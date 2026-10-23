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
public final class nz extends org.telegram.ui.Components.lm0 {
    public final oz f40014c;

    public nz(oz ozVar) {
        this.f40014c = ozVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40014c.I;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        oz ozVar = this.f40014c;
        if (i10 != ozVar.P && i10 != ozVar.L) {
            if (i10 == ozVar.J) {
                return 3;
            }
            if (i10 >= ozVar.N && i10 < ozVar.O) {
                return 4;
            }
            if (i10 != ozVar.M && i10 != ozVar.K) {
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
        oz ozVar = this.f40014c;
        ArrayList arrayList = ozVar.f40306f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i12 == 0) {
            ozVar.R = (dz) view;
            ozVar.g0();
            return;
        }
        String str4 = null;
        if (i12 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            Activity parentActivity = ozVar.getParentActivity();
            if (i10 == ozVar.P) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            org.telegram.ui.ActionBar.r6.b0(i11, org.telegram.ui.ActionBar.k6.f21145b7, parentActivity, e9Var, null);
            if (i10 == ozVar.P) {
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
            return;
        }
        int i13 = 1;
        if (i12 == 3) {
            hz hzVar = (hz) view;
            if (tL_exportedChatlistInvite == null) {
                str3 = null;
            } else {
                str3 = tL_exportedChatlistInvite.url;
            }
            ai.wd wdVar = hzVar.h;
            org.telegram.ui.ActionBar.n5 n5Var = hzVar.f37989c;
            TextView textView = hzVar.f37991n;
            ImageView imageView = hzVar.d;
            ai.wd wdVar2 = hzVar.f37990f;
            hzVar.f37993s = str3;
            if (str3 != null) {
                if (str3.startsWith("http://")) {
                    str3 = str3.substring(7);
                }
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
            }
            n5Var.l(str3, false);
            float f10 = hzVar.v;
            if (str3 == null) {
                i13 = 0;
            }
            if (f10 != i13) {
                ValueAnimator valueAnimator = hzVar.f37994w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    hzVar.f37994w = null;
                }
                if (str3 != null) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                hzVar.v = f7;
                gz gzVar = hzVar.e;
                gzVar.d = f7;
                gzVar.invalidate();
                wdVar2.setAlpha(hzVar.v);
                hzVar.h.setAlpha(hzVar.v);
                imageView.setAlpha(hzVar.v);
                textView.setAlpha(1.0f - hzVar.v);
                n5Var.setAlpha(hzVar.v);
                hzVar.f37988b.setAlpha(1.0f - hzVar.v);
                if (str3 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    wdVar2.setVisibility(8);
                    wdVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                wdVar2.setVisibility(0);
                wdVar.setVisibility(0);
            }
        } else if (i12 == 4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Long l4 = (Long) ozVar.h.get(i10 - ozVar.N);
            long longValue = l4.longValue();
            if (longValue >= 0) {
                TLRPC.User user = ozVar.getMessagesController().getUser(l4);
                if (user != null) {
                    str2 = UserObject.getUserName(user);
                    chat = user;
                } else {
                    str2 = null;
                    chat = user;
                }
            } else {
                TLRPC.Chat chat2 = ozVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                f4Var.c(ozVar.e.contains(l4), false);
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
            if (h10Var == ozVar.Q) {
                ozVar.Q = null;
            }
            if (i10 == ozVar.K) {
                h10Var.b(LocaleController.getString(R.string.InviteLink), false);
                h10Var.a("", null);
                return;
            }
            ozVar.Q = h10Var;
            if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                ozVar.f0(false);
                return;
            }
            h10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
            h10Var.a("", null);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View h10Var;
        View view;
        oz ozVar = this.f40014c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = ozVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            wh.n nVar = new wh.n(parentActivity);
            frameLayout.f36762a = nVar;
            org.telegram.ui.ActionBar.r6.W(nVar, org.telegram.ui.ActionBar.k6.B6, null);
            nVar.setTextSize(1, 14.0f);
            nVar.setGravity(17);
            nVar.setLines(2);
            frameLayout.addView(nVar, w7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(ozVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    h10Var = new mz(this, ozVar.getParentActivity(), ozVar);
                    h10Var.setLayoutParams(new s4.o0(-1, -2));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, h10Var, null);
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(ozVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, f4Var, null);
                    view = f4Var;
                } else if (i10 == 5) {
                    h10Var = new org.telegram.ui.Components.h10(ozVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, h10Var, null);
                }
                view2 = h10Var;
            }
            return new s4.b1(view2);
        }
        view2 = view;
        return new s4.b1(view2);
    }
}
