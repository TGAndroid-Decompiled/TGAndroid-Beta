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

public final class nz extends org.telegram.ui.Components.yk0 {

    public final oz f40959c;

    public nz(oz ozVar) {
        this.f40959c = ozVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 4;
    }

    @Override
    public final int h() {
        return this.f40959c.D;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        oz ozVar = this.f40959c;
        if (i10 == ozVar.K || i10 == ozVar.G) {
            return 2;
        }
        if (i10 == ozVar.E) {
            return 3;
        }
        if (i10 < ozVar.I || i10 >= ozVar.J) {
            return (i10 == ozVar.H || i10 == ozVar.F) ? 5 : 0;
        }
        return 4;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        String userName;
        TLRPC.User user;
        oz ozVar = this.f40959c;
        ArrayList arrayList = ozVar.f41220f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            ozVar.M = (fz) view;
            ozVar.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(ozVar.getParentActivity(), i10 == ozVar.K ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
            if (i10 != ozVar.K) {
                x8Var.setFixedSize(12);
                return;
            }
            x8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                x8Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                x8Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String string2 = null;
        if (i11 == 3) {
            hz hzVar = (hz) view;
            String strSubstring = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            cg.q qVar = hzVar.h;
            org.telegram.ui.ActionBar.h5 h5Var = hzVar.f38914c;
            TextView textView = hzVar.f38917n;
            ImageView imageView = hzVar.d;
            cg.q qVar2 = hzVar.f38916f;
            hzVar.f38919s = strSubstring;
            if (strSubstring != null) {
                if (strSubstring.startsWith("http://")) {
                    strSubstring = strSubstring.substring(7);
                }
                if (strSubstring.startsWith("https://")) {
                    strSubstring = strSubstring.substring(8);
                }
            }
            h5Var.l(strSubstring, false);
            if (hzVar.v != (strSubstring == null ? 0 : 1)) {
                ValueAnimator valueAnimator = hzVar.f38920w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    hzVar.f38920w = null;
                }
                float f10 = strSubstring != null ? 1.0f : 0.0f;
                hzVar.v = f10;
                lh.t8 t8Var = hzVar.f38915e;
                t8Var.f16874c = f10;
                t8Var.invalidate();
                qVar2.setAlpha(hzVar.v);
                hzVar.h.setAlpha(hzVar.v);
                imageView.setAlpha(hzVar.v);
                textView.setAlpha(1.0f - hzVar.v);
                h5Var.setAlpha(hzVar.v);
                hzVar.f38913b.setAlpha(1.0f - hzVar.v);
                if (strSubstring == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    qVar2.setVisibility(8);
                    qVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                qVar2.setVisibility(0);
                qVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) view;
                if (n00Var == ozVar.L) {
                    ozVar.L = null;
                }
                if (i10 == ozVar.F) {
                    n00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    n00Var.a("", null);
                    return;
                }
                ozVar.L = n00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    ozVar.f0(false);
                    return;
                } else {
                    n00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    n00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        Long l10 = (Long) ozVar.h.get(i10 - ozVar.I);
        long jLongValue = l10.longValue();
        if (jLongValue >= 0) {
            TLRPC.User user2 = ozVar.getMessagesController().getUser(l10);
            if (user2 != null) {
                userName = UserObject.getUserName(user2);
                user = user2;
            } else {
                userName = null;
                user = user2;
            }
        } else {
            TLRPC.Chat chat = ozVar.getMessagesController().getChat(Long.valueOf(-jLongValue));
            if (chat != null) {
                string2 = chat.title;
                if (chat.participants_count != 0) {
                    string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count);
                } else {
                    string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString("ChannelPublic") : LocaleController.getString("MegaPublic");
                }
            } else {
                string = null;
            }
            String str = string2;
            string2 = string;
            userName = str;
            user = chat;
        }
        if (arrayList.contains(l10)) {
            d4Var.setForbiddenCheck(false);
            d4Var.c(ozVar.f41219e.contains(l10), false);
        } else {
            d4Var.setForbiddenCheck(true);
            d4Var.c(false, false);
            if (user instanceof TLRPC.User) {
                string2 = user.bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (user instanceof TLRPC.Chat) {
                string2 = ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) user) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        d4Var.setTag(l10);
        d4Var.d(user, userName, string2);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout n00Var;
        View view;
        oz ozVar = this.f40959c;
        View x8Var = null;
        if (i10 != 0) {
            if (i10 == 2) {
                x8Var = new org.telegram.ui.Cells.x8(ozVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    n00Var = new mz(this, ozVar.getParentActivity(), ozVar);
                    n00Var.setLayoutParams(new f2.y0(-1, -2));
                    n00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                } else if (i10 == 4) {
                    org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(ozVar.getParentActivity(), 1, 0, false);
                    d4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    view = d4Var;
                } else if (i10 == 5) {
                    n00Var = new org.telegram.ui.Components.n00(ozVar.getParentActivity());
                    n00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                }
                x8Var = n00Var;
            }
            return new org.telegram.ui.Components.lk0(x8Var);
        }
        Activity parentActivity = ozVar.getParentActivity();
        int i11 = R.raw.folder_share;
        fz fzVar = new fz(parentActivity);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(parentActivity);
        ri0Var.f(i11, 90, 90, null);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.d();
        ri0Var.setImportantForAccessibility(2);
        fzVar.addView(ri0Var, h7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        eh.s sVar = new eh.s(parentActivity);
        fzVar.f38238a = sVar;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(17);
        sVar.setLines(2);
        fzVar.addView(sVar, h7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = fzVar;
        x8Var = view;
        return new org.telegram.ui.Components.lk0(x8Var);
    }
}
