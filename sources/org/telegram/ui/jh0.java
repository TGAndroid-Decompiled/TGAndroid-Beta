package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class jh0 extends org.telegram.ui.Components.yk0 {

    public final Context f39377c;
    public final kh0 d;

    public jh0(kh0 kh0Var, Context context) {
        this.d = kh0Var;
        this.f39377c = context;
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        kh0 kh0Var = this.d;
        if (kh0Var.M == iB || kh0Var.f39760x == iB) {
            return true;
        }
        if (iB >= kh0Var.f39761y && iB < kh0Var.A) {
            return true;
        }
        if ((iB < kh0Var.D || iB >= kh0Var.E) && iB != kh0Var.J) {
            return iB >= kh0Var.Q && iB < kh0Var.R;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.T;
    }

    @Override
    public final int j(int i10) {
        kh0 kh0Var = this.d;
        if (i10 == kh0Var.f39757r) {
            return 0;
        }
        if (i10 == kh0Var.f39758s || i10 == kh0Var.H || i10 == kh0Var.O || i10 == kh0Var.L) {
            return 1;
        }
        if (i10 == kh0Var.v) {
            return 2;
        }
        if (i10 == kh0Var.f39760x) {
            return 3;
        }
        if (i10 == kh0Var.f39759w || i10 == kh0Var.F || i10 == kh0Var.I || i10 == kh0Var.N || i10 == kh0Var.P) {
            return 4;
        }
        if (i10 >= kh0Var.f39761y && i10 < kh0Var.A) {
            return 5;
        }
        if (i10 >= kh0Var.D && i10 < kh0Var.E) {
            return 5;
        }
        if (i10 == kh0Var.B) {
            return 6;
        }
        if (i10 == kh0Var.G) {
            return 7;
        }
        if (i10 == kh0Var.J) {
            return 8;
        }
        if (i10 == kh0Var.K) {
            return 9;
        }
        if (i10 == kh0Var.M) {
            return 10;
        }
        if (i10 < kh0Var.Q || i10 >= kh0Var.R) {
            return i10 == kh0Var.C ? 11 : 1;
        }
        return 10;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i11;
        TLRPC.User user;
        kh0 kh0Var = this.d;
        ArrayList arrayList = kh0Var.f39744e0;
        long j10 = kh0Var.f39745f;
        long j11 = kh0Var.f39753n;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z10 = true;
        if (i12 == 1) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == kh0Var.f39758s) {
                if (kh0Var.f39751k0 && j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    j4Var.setText(LocaleController.getString(R.string.PublicLink));
                    return;
                } else if (j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteLinkTitle));
                    return;
                } else {
                    j4Var.setText(LocaleController.getString(R.string.PermanentLinkForThisAdmin));
                    return;
                }
            }
            if (i10 == kh0Var.H) {
                j4Var.setText(LocaleController.getString(R.string.RevokedLinks));
                return;
            } else if (i10 == kh0Var.L) {
                j4Var.setText(LocaleController.getString(R.string.LinksCreatedByThisAdmin));
                return;
            } else {
                if (i10 == kh0Var.O) {
                    j4Var.setText(LocaleController.getString(R.string.LinksCreatedByOtherAdmins));
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) view;
            i80Var.setCanEdit(j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId);
            if (kh0Var.f39751k0 && j10 == kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                if (kh0Var.d != null) {
                    i80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(kh0Var.f39740c));
                    i80Var.d(0, null, false);
                    i80Var.b(true);
                    return;
                }
                return;
            }
            i80Var.b(!kh0Var.f39752l0);
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = kh0Var.f39743e;
            if (tL_chatInviteExported2 != null) {
                i80Var.setLink(tL_chatInviteExported2.link);
                i80Var.c(tL_chatInviteExported2, j11);
                return;
            } else {
                i80Var.setLink(null);
                i80Var.d(0, null, false);
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Context context = this.f39377c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(iW0, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23182k7, false), mode));
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(drawable, drawable2);
            String string = LocaleController.getString(R.string.CreateNewLink);
            boolean z11 = !arrayList.isEmpty();
            e2Var.f24254a.l(string, false);
            e2Var.f24255b.setImageDrawable(dqVar);
            e2Var.f24256c = z11;
            return;
        }
        if (i12 == 5) {
            int i13 = kh0Var.f39761y;
            if (i10 < i13 || i10 >= kh0Var.A) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) kh0Var.f39746f0.get(i10 - kh0Var.D);
                if (i10 == kh0Var.E - 1) {
                    z10 = false;
                }
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) arrayList.get(i10 - i13);
                if (i10 == kh0Var.A - 1) {
                    z10 = false;
                }
            }
            hh0 hh0Var = (hh0) view;
            hh0Var.b(tL_chatInviteExported, i10 - kh0Var.f39761y);
            hh0Var.D = z10;
            return;
        }
        switch (i12) {
            case 9:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                TLRPC.ChatFull chatFull = kh0Var.getMessagesController().getChatFull(j11);
                TLRPC.Chat chat = kh0Var.getMessagesController().getChat(Long.valueOf(j11));
                if (chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat)) {
                    x8Var.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                } else {
                    x8Var.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                }
                break;
            case 10:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                if (i10 != kh0Var.M) {
                    TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = (TLRPC.TL_chatAdminWithInvites) kh0Var.f39749i0.get(i10 - kh0Var.Q);
                    TLRPC.User user2 = (TLRPC.User) kh0Var.f39747g0.get(Long.valueOf(tL_chatAdminWithInvites.admin_id));
                    int i14 = tL_chatAdminWithInvites.invites_count;
                    if (i10 == kh0Var.R - 1) {
                        i11 = i14;
                        user = user2;
                    } else {
                        i11 = i14;
                        user = user2;
                    }
                    if (user != null) {
                        y4Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                    }
                } else {
                    user = kh0Var.getMessagesController().getUser(Long.valueOf(j10));
                    i11 = kh0Var.f39739b0;
                }
                z10 = false;
                if (user != null) {
                    y4Var.b(user, ContactsController.formatName(user.first_name, user.last_name), LocaleController.formatPluralString("InviteLinkCount", i11, new Object[0]), z10);
                }
                break;
            case 11:
                org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                if (i10 == kh0Var.C) {
                    TLRPC.ChatFull chatFull2 = kh0Var.getMessagesController().getChatFull(j11);
                    TLRPC.Chat chat2 = kh0Var.getMessagesController().getChat(Long.valueOf(j11));
                    if (chatFull2 != null && chatFull2.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        x8Var2.setText(LocaleController.getString(R.string.ChannelLinksInfoPaid));
                    } else {
                        x8Var2.setText(LocaleController.getString(R.string.ChannelLinksInfo));
                    }
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View y4Var;
        kh0 kh0Var = this.d;
        Context context = this.f39377c;
        switch (i10) {
            case 1:
                y4Var = new org.telegram.ui.Cells.j4(context, 23);
                break;
            case 2:
                org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(this.f39377c, kh0Var, null, true, kh0Var.h);
                i80Var.setPermanent(true);
                i80Var.setDelegate(new ih0(this, i80Var));
                y4Var = i80Var;
                break;
            case 3:
                y4Var = new org.telegram.ui.Cells.e2(context, 64, ((org.telegram.ui.ActionBar.n2) kh0Var).resourceProvider);
                break;
            case 4:
                y4Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 5:
                y4Var = new hh0(kh0Var, context);
                break;
            case 6:
                org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(9);
                h00Var.f28887w = false;
                y4Var = h00Var;
                break;
            case 7:
                y4Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 8:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.b(LocaleController.getString(R.string.DeleteAllRevokedLinks), false);
                x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                y4Var = x9Var;
                break;
            case 9:
                y4Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 10:
                y4Var = new org.telegram.ui.Cells.y4(8, 6, this.f39377c, null, false);
                break;
            case 11:
                y4Var = new org.telegram.ui.Cells.x8(context, ((org.telegram.ui.ActionBar.n2) kh0Var).resourceProvider);
                break;
            default:
                dh0 dh0Var = new dh0(context);
                dh0Var.addView(new ch0(context), h7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23111g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(kh0Var.h ? R.string.PrimaryLinkHelpChannel : R.string.PrimaryLinkHelp));
                dh0Var.addView(textView, h7.z5.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                dh0Var.setTag(-33024);
                y4Var = dh0Var;
                break;
        }
        return org.telegram.ui.Cells.pa.l(y4Var, y4Var, -1, -2);
    }
}
