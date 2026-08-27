package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class cq extends org.telegram.ui.Components.yk0 {

    public final Context f37129c;
    public boolean d;

    public final dq f37130e;

    public cq(dq dqVar, Context context) {
        this.f37130e = dqVar;
        if (dqVar.f37523y == 2) {
            C(true);
        }
        this.f37129c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        TLRPC.Chat chat;
        int i10 = o1Var.f5793f;
        dq dqVar = this.f37130e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.L;
        int i11 = dqVar.f37523y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.J;
        if (!dqVar.f37519w.creator || ((i11 != 0 && (i11 != 2 || !dqVar.G)) || i10 != 4 || o1Var.b() != dqVar.f37491a0)) {
            if (!dqVar.E) {
                return false;
            }
            if ((i11 != 0 && i11 != 2) || i10 != 4) {
                return i10 != 3 ? false : false;
            }
            int iB = o1Var.b();
            if (iB == dqVar.S) {
                if (!tL_chatAdminRights.add_admins && ((chat = dqVar.f37519w) == null || !chat.creator)) {
                    return false;
                }
            } else {
                if (i11 == 2 && !dqVar.G) {
                    return false;
                }
                if (iB == dqVar.T) {
                    if (!tL_chatAdminRights.change_info) {
                        return false;
                    }
                    if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !dqVar.A) {
                        return false;
                    }
                } else {
                    if (iB == dqVar.U) {
                        return tL_chatAdminRights.post_messages;
                    }
                    if (iB == dqVar.V) {
                        return tL_chatAdminRights.manage_direct_messages;
                    }
                    if (iB == dqVar.W) {
                        return tL_chatAdminRights.manage_welcome_messages;
                    }
                    if (iB == dqVar.X) {
                        return tL_chatAdminRights.edit_messages;
                    }
                    if (iB == dqVar.Y) {
                        return tL_chatAdminRights.delete_messages;
                    }
                    if (iB == dqVar.G0) {
                        return tL_chatAdminRights.manage_call;
                    }
                    if (iB == dqVar.Z) {
                        return tL_chatAdminRights.add_admins;
                    }
                    if (iB == dqVar.f37491a0) {
                        return tL_chatAdminRights.anonymous;
                    }
                    if (iB == dqVar.f37493b0) {
                        return tL_chatAdminRights.ban_users;
                    }
                    if (iB == dqVar.f37495c0) {
                        return tL_chatAdminRights.invite_users;
                    }
                    if (iB == dqVar.f37496d0) {
                        if (!tL_chatAdminRights.pin_messages) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                            return false;
                        }
                    } else {
                        if (iB == dqVar.f37498e0) {
                            return tL_chatAdminRights.manage_ranks;
                        }
                        if (iB == dqVar.f37503i0) {
                            return tL_chatAdminRights.manage_topics;
                        }
                        if (iB == dqVar.Q0) {
                            return tL_chatAdminRights.post_stories;
                        }
                        if (iB == dqVar.R0) {
                            return tL_chatAdminRights.edit_stories;
                        }
                        if (iB == dqVar.S0) {
                            return tL_chatAdminRights.delete_stories;
                        }
                        if (iB == dqVar.f37504j0) {
                            return tL_chatAdminRights.manage_linked_peers;
                        }
                        if (i10 != 3 || i10 == 1 || i10 == 5 || i10 == 8 || i10 == 11) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f37130e.R;
    }

    @Override
    public final long i(int i10) {
        dq dqVar = this.f37130e;
        if (dqVar.f37523y != 2) {
            return -1L;
        }
        if (i10 == dqVar.S) {
            return 1L;
        }
        if (i10 == dqVar.T) {
            return 2L;
        }
        if (i10 == dqVar.U) {
            return 3L;
        }
        if (i10 == dqVar.X) {
            return 4L;
        }
        if (i10 == dqVar.Y) {
            return 5L;
        }
        if (i10 == dqVar.Z) {
            return 6L;
        }
        if (i10 == dqVar.f37491a0) {
            return 7L;
        }
        if (i10 == dqVar.f37493b0) {
            return 8L;
        }
        if (i10 == dqVar.f37495c0) {
            return 9L;
        }
        if (i10 == dqVar.f37496d0) {
            return 10L;
        }
        if (i10 == dqVar.f37505k0) {
            return 11L;
        }
        if (i10 == dqVar.f37506l0) {
            return 12L;
        }
        if (i10 == dqVar.m0) {
            return 13L;
        }
        if (i10 == dqVar.f37508n0) {
            return 14L;
        }
        if (i10 == dqVar.f37509o0) {
            return 15L;
        }
        if (i10 == dqVar.f37510p0) {
            return 16L;
        }
        if (i10 == dqVar.f37511q0) {
            return 17L;
        }
        if (i10 == dqVar.f37513r0) {
            return 18L;
        }
        if (i10 == dqVar.f37515s0) {
            return 19L;
        }
        if (i10 == dqVar.f37517u0) {
            return 20L;
        }
        if (i10 == dqVar.f37522x0) {
            return 21L;
        }
        if (i10 == dqVar.D0) {
            return 22L;
        }
        if (i10 == dqVar.E0) {
            return 23L;
        }
        if (i10 == dqVar.F0) {
            return 24L;
        }
        if (i10 == dqVar.G0) {
            return 25L;
        }
        if (i10 == dqVar.H0) {
            return 26L;
        }
        if (i10 == dqVar.I0) {
            return 27L;
        }
        if (i10 == dqVar.f37516t0) {
            return 28L;
        }
        if (i10 == dqVar.f37503i0) {
            return 29L;
        }
        if (i10 == dqVar.f37524y0) {
            return 30L;
        }
        if (i10 == dqVar.A0) {
            return 31L;
        }
        if (i10 == dqVar.f37525z0) {
            return 32L;
        }
        if (i10 == dqVar.B0) {
            return 33L;
        }
        if (i10 == dqVar.C0) {
            return 34L;
        }
        if (i10 == dqVar.f37518v0) {
            return 35L;
        }
        if (i10 == dqVar.J0) {
            return 36L;
        }
        if (i10 == dqVar.L0) {
            return 37L;
        }
        if (i10 == dqVar.M0) {
            return 38L;
        }
        if (i10 == dqVar.N0) {
            return 39L;
        }
        if (i10 == dqVar.O0) {
            return 40L;
        }
        if (i10 == dqVar.Q0) {
            return 41L;
        }
        if (i10 == dqVar.R0) {
            return 42L;
        }
        if (i10 == dqVar.S0) {
            return 43L;
        }
        if (i10 == dqVar.V) {
            return 44L;
        }
        if (i10 == dqVar.f37498e0) {
            return 45L;
        }
        if (i10 == dqVar.f37500f0) {
            return 46L;
        }
        if (i10 == dqVar.f37501g0) {
            return 47L;
        }
        if (i10 == dqVar.f37502h0) {
            return 48L;
        }
        if (i10 == dqVar.f37504j0) {
            return 49L;
        }
        return i10 == dqVar.W ? 50L : 0L;
    }

    @Override
    public final int j(int i10) {
        dq dqVar = this.f37130e;
        if (i10 == dqVar.D0 || i10 == dqVar.F0 || i10 == dqVar.E0 || i10 == dqVar.f37522x0 || i10 == dqVar.f37524y0 || i10 == dqVar.A0 || i10 == dqVar.f37525z0 || i10 == dqVar.C0 || i10 == dqVar.B0 || i10 == dqVar.f37500f0 || i10 == dqVar.L0 || i10 == dqVar.M0 || i10 == dqVar.N0 || i10 == dqVar.Q0 || i10 == dqVar.R0 || i10 == dqVar.S0) {
            return 10;
        }
        if (i10 == dqVar.f37518v0 || i10 == dqVar.J0 || i10 == dqVar.O0) {
            return 9;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1 || i10 == dqVar.f37505k0 || i10 == dqVar.m0 || i10 == dqVar.H0 || i10 == dqVar.f37509o0) {
            return 5;
        }
        if (i10 == 2 || i10 == dqVar.f37511q0) {
            return 3;
        }
        if (i10 == dqVar.T || i10 == dqVar.U || i10 == dqVar.V || i10 == dqVar.X || i10 == dqVar.Y || i10 == dqVar.Z || i10 == dqVar.f37493b0 || i10 == dqVar.f37495c0 || i10 == dqVar.f37496d0 || i10 == dqVar.f37498e0 || i10 == dqVar.f37517u0 || i10 == dqVar.f37491a0 || i10 == dqVar.G0 || i10 == dqVar.S || i10 == dqVar.f37503i0 || i10 == dqVar.f37501g0 || i10 == dqVar.f37504j0 || i10 == dqVar.W) {
            return 4;
        }
        if (i10 == dqVar.f37508n0 || i10 == dqVar.f37515s0 || i10 == dqVar.f37502h0) {
            return 1;
        }
        if (i10 == dqVar.I0) {
            return 6;
        }
        if (i10 == dqVar.f37513r0) {
            return 11;
        }
        return i10 == dqVar.f37516t0 ? 8 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        dq dqVar = this.f37130e;
        int i13 = dqVar.f37523y;
        boolean z11 = dqVar.Q;
        boolean z12 = dqVar.B;
        boolean z13 = dqVar.A;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = dqVar.I;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = dqVar.L;
        int i14 = o1Var.f5793f;
        View view = o1Var.f5789a;
        final int i15 = 1;
        final int i16 = 2;
        switch (i14) {
            case 0:
                ((org.telegram.ui.Cells.ra) view).a(dqVar.v, dqVar.f37523y == 2 ? LocaleController.getString(R.string.Bot) : null);
                break;
            case 1:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == dqVar.f37502h0) {
                    x8Var.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                } else if (i10 == dqVar.f37508n0) {
                    x8Var.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                } else if (i10 == dqVar.f37515s0) {
                    x8Var.setText(dqVar.f37523y == 0 ? LocaleController.formatString(R.string.EditAdminRankInfo, (UserObject.isUserSelf(dqVar.v) && dqVar.f37519w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin)) : LocaleController.formatString(R.string.EditMemberRankInfo, UserObject.getUserName(dqVar.v)));
                }
                break;
            case 2:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                if (i10 == dqVar.f37506l0) {
                    int i17 = org.telegram.ui.ActionBar.g6.f23269p7;
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.u0(i17));
                    x9Var.setTag(Integer.valueOf(i17));
                    if (dqVar.f37523y == 0) {
                        x9Var.b(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                    } else if (dqVar.f37523y == 1) {
                        x9Var.b(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                    }
                } else if (i10 == dqVar.f37510p0) {
                    int i18 = org.telegram.ui.ActionBar.g6.G6;
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.u0(i18));
                    x9Var.setTag(Integer.valueOf(i18));
                    if (!z13) {
                        x9Var.b(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                    } else {
                        x9Var.b(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                    }
                }
                break;
            case 3:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 != 2) {
                    if (i10 == dqVar.f37511q0) {
                        j4Var.setText(LocaleController.getString(R.string.EditAdminRank));
                    }
                } else if (dqVar.f37523y == 2 || (dqVar.v != null && dqVar.v.bot)) {
                    j4Var.setText(LocaleController.getString(R.string.BotRestrictionsCanDo));
                } else if (dqVar.f37523y == 0) {
                    j4Var.setText(LocaleController.getString(R.string.EditAdminWhatCanDo));
                } else if (dqVar.f37523y == 1) {
                    j4Var.setText(LocaleController.getString(R.string.UserRestrictionsCanDo));
                }
                break;
            case 4:
            case 9:
                final int i19 = 0;
                final org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                boolean z14 = i13 != 2 || dqVar.G;
                TLRPC.Chat chat = dqVar.f37519w;
                boolean z15 = chat != null && chat.creator;
                if (i10 == dqVar.f37518v0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = dqVar.L;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = dqVar.K;
                    i15 = (tL_chatBannedRights3.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                    if (!tL_chatBannedRights3.send_videos && !tL_chatBannedRights2.send_videos) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.send_stickers && !tL_chatBannedRights2.send_stickers) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.send_audios && !tL_chatBannedRights2.send_audios) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.send_docs && !tL_chatBannedRights2.send_docs) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.send_voices && !tL_chatBannedRights2.send_voices) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights3.send_plain && !tL_chatBannedRights2.send_plain) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.send_polls && !tL_chatBannedRights2.send_polls) {
                        i15++;
                    }
                    if (!tL_chatBannedRights3.send_reactions && !tL_chatBannedRights2.send_reactions) {
                        i15++;
                    }
                    o8Var.d(LocaleController.getString(R.string.UserRestrictionsSendMedia), i15 > 0, true, true);
                    Locale locale = Locale.US;
                    o8Var.a(new Runnable(this) {

                        public final cq f36866b;

                        {
                            this.f36866b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    dq dqVar2 = this.f36866b.f37130e;
                                    org.telegram.ui.Cells.o8 o8Var2 = o8Var;
                                    if (o8Var2.isEnabled()) {
                                        if (!dq.l0(dqVar2)) {
                                            boolean z16 = o8Var2.d.h;
                                            o8Var2.setChecked(!z16);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = dqVar2.K;
                                            tL_chatBannedRights4.send_media = z16;
                                            tL_chatBannedRights4.send_photos = z16;
                                            tL_chatBannedRights4.send_videos = z16;
                                            tL_chatBannedRights4.send_stickers = z16;
                                            tL_chatBannedRights4.send_gifs = z16;
                                            tL_chatBannedRights4.send_games = z16;
                                            tL_chatBannedRights4.send_inline = z16;
                                            tL_chatBannedRights4.send_audios = z16;
                                            tL_chatBannedRights4.send_docs = z16;
                                            tL_chatBannedRights4.send_voices = z16;
                                            tL_chatBannedRights4.send_roundvideos = z16;
                                            tL_chatBannedRights4.embed_links = z16;
                                            tL_chatBannedRights4.send_polls = z16;
                                            tL_chatBannedRights4.send_reactions = z16;
                                            AndroidUtilities.updateVisibleRows(dqVar2.f37492b);
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar2.getParentActivity());
                                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.f22702a.show();
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.o8 o8Var3 = o8Var;
                                    if (o8Var3.isEnabled()) {
                                        boolean z17 = o8Var3.d.h;
                                        o8Var3.setChecked(z17);
                                        dq dqVar3 = this.f36866b.f37130e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = dqVar3.I;
                                        boolean z18 = !z17;
                                        tL_chatAdminRights2.post_messages = z18;
                                        tL_chatAdminRights2.edit_messages = z18;
                                        tL_chatAdminRights2.delete_messages = z18;
                                        AndroidUtilities.updateVisibleRows(dqVar3.f37492b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.o8 o8Var4 = o8Var;
                                    if (o8Var4.isEnabled()) {
                                        boolean z19 = o8Var4.d.h;
                                        o8Var4.setChecked(z19);
                                        dq dqVar4 = this.f36866b.f37130e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = dqVar4.I;
                                        boolean z20 = !z19;
                                        tL_chatAdminRights3.post_stories = z20;
                                        tL_chatAdminRights3.edit_stories = z20;
                                        tL_chatAdminRights3.delete_stories = z20;
                                        AndroidUtilities.updateVisibleRows(dqVar4.f37492b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, s3.c.d(i15, "/10"), !dqVar.f37520w0);
                    o8Var.setIcon(dq.l0(dqVar) ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.J0) {
                    ?? r10 = tL_chatAdminRights.post_messages;
                    if (tL_chatAdminRights.edit_messages) {
                        i12 = r10;
                        i12 = r10 + 1;
                    }
                    i12 = r10;
                    int i20 = i12;
                    if (tL_chatAdminRights.delete_messages) {
                        i20 = i12 + 1;
                    }
                    o8Var.d(LocaleController.getString(R.string.ChannelManageMessages), i20 > 0, true, true);
                    Locale locale2 = Locale.US;
                    o8Var.a(new Runnable(this) {

                        public final cq f36866b;

                        {
                            this.f36866b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    dq dqVar2 = this.f36866b.f37130e;
                                    org.telegram.ui.Cells.o8 o8Var2 = o8Var;
                                    if (o8Var2.isEnabled()) {
                                        if (!dq.l0(dqVar2)) {
                                            boolean z16 = o8Var2.d.h;
                                            o8Var2.setChecked(!z16);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = dqVar2.K;
                                            tL_chatBannedRights4.send_media = z16;
                                            tL_chatBannedRights4.send_photos = z16;
                                            tL_chatBannedRights4.send_videos = z16;
                                            tL_chatBannedRights4.send_stickers = z16;
                                            tL_chatBannedRights4.send_gifs = z16;
                                            tL_chatBannedRights4.send_games = z16;
                                            tL_chatBannedRights4.send_inline = z16;
                                            tL_chatBannedRights4.send_audios = z16;
                                            tL_chatBannedRights4.send_docs = z16;
                                            tL_chatBannedRights4.send_voices = z16;
                                            tL_chatBannedRights4.send_roundvideos = z16;
                                            tL_chatBannedRights4.embed_links = z16;
                                            tL_chatBannedRights4.send_polls = z16;
                                            tL_chatBannedRights4.send_reactions = z16;
                                            AndroidUtilities.updateVisibleRows(dqVar2.f37492b);
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar2.getParentActivity());
                                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.f22702a.show();
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.o8 o8Var3 = o8Var;
                                    if (o8Var3.isEnabled()) {
                                        boolean z17 = o8Var3.d.h;
                                        o8Var3.setChecked(z17);
                                        dq dqVar3 = this.f36866b.f37130e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = dqVar3.I;
                                        boolean z18 = !z17;
                                        tL_chatAdminRights2.post_messages = z18;
                                        tL_chatAdminRights2.edit_messages = z18;
                                        tL_chatAdminRights2.delete_messages = z18;
                                        AndroidUtilities.updateVisibleRows(dqVar3.f37492b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.o8 o8Var4 = o8Var;
                                    if (o8Var4.isEnabled()) {
                                        boolean z19 = o8Var4.d.h;
                                        o8Var4.setChecked(z19);
                                        dq dqVar4 = this.f36866b.f37130e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = dqVar4.I;
                                        boolean z20 = !z19;
                                        tL_chatAdminRights3.post_stories = z20;
                                        tL_chatAdminRights3.edit_stories = z20;
                                        tL_chatAdminRights3.delete_stories = z20;
                                        AndroidUtilities.updateVisibleRows(dqVar4.f37492b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, s3.c.d(i20, "/3"), !dqVar.K0);
                } else if (i10 == dqVar.O0) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = dqVar.I;
                    ?? r11 = tL_chatAdminRights2.post_stories;
                    if (tL_chatAdminRights2.edit_stories) {
                        i11 = r11;
                        i11 = r11 + 1;
                    }
                    i11 = r11;
                    int i21 = i11;
                    if (tL_chatAdminRights2.delete_stories) {
                        i21 = i11 + 1;
                    }
                    o8Var.d(LocaleController.getString(R.string.ChannelManageStories), i21 > 0, true, true);
                    Locale locale3 = Locale.US;
                    o8Var.a(new Runnable(this) {

                        public final cq f36866b;

                        {
                            this.f36866b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    dq dqVar2 = this.f36866b.f37130e;
                                    org.telegram.ui.Cells.o8 o8Var2 = o8Var;
                                    if (o8Var2.isEnabled()) {
                                        if (!dq.l0(dqVar2)) {
                                            boolean z16 = o8Var2.d.h;
                                            o8Var2.setChecked(!z16);
                                            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = dqVar2.K;
                                            tL_chatBannedRights4.send_media = z16;
                                            tL_chatBannedRights4.send_photos = z16;
                                            tL_chatBannedRights4.send_videos = z16;
                                            tL_chatBannedRights4.send_stickers = z16;
                                            tL_chatBannedRights4.send_gifs = z16;
                                            tL_chatBannedRights4.send_games = z16;
                                            tL_chatBannedRights4.send_inline = z16;
                                            tL_chatBannedRights4.send_audios = z16;
                                            tL_chatBannedRights4.send_docs = z16;
                                            tL_chatBannedRights4.send_voices = z16;
                                            tL_chatBannedRights4.send_roundvideos = z16;
                                            tL_chatBannedRights4.embed_links = z16;
                                            tL_chatBannedRights4.send_polls = z16;
                                            tL_chatBannedRights4.send_reactions = z16;
                                            AndroidUtilities.updateVisibleRows(dqVar2.f37492b);
                                        } else {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dqVar2.getParentActivity());
                                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                            alertDialog$Builder.f22702a.show();
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    org.telegram.ui.Cells.o8 o8Var3 = o8Var;
                                    if (o8Var3.isEnabled()) {
                                        boolean z17 = o8Var3.d.h;
                                        o8Var3.setChecked(z17);
                                        dq dqVar3 = this.f36866b.f37130e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = dqVar3.I;
                                        boolean z18 = !z17;
                                        tL_chatAdminRights3.post_messages = z18;
                                        tL_chatAdminRights3.edit_messages = z18;
                                        tL_chatAdminRights3.delete_messages = z18;
                                        AndroidUtilities.updateVisibleRows(dqVar3.f37492b);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Cells.o8 o8Var4 = o8Var;
                                    if (o8Var4.isEnabled()) {
                                        boolean z19 = o8Var4.d.h;
                                        o8Var4.setChecked(z19);
                                        dq dqVar4 = this.f36866b.f37130e;
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = dqVar4.I;
                                        boolean z20 = !z19;
                                        tL_chatAdminRights4.post_stories = z20;
                                        tL_chatAdminRights4.edit_stories = z20;
                                        tL_chatAdminRights4.delete_stories = z20;
                                        AndroidUtilities.updateVisibleRows(dqVar4.f37492b);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, s3.c.d(i21, "/3"), !dqVar.P0);
                } else if (i10 == dqVar.S) {
                    o8Var.d(LocaleController.getString(R.string.ManageGroup), dqVar.G, true, false);
                    o8Var.setIcon((dqVar.J.add_admins || z15) ? 0 : R.drawable.permission_locked);
                } else if (i10 == dqVar.T) {
                    if (dqVar.f37523y == 0 || dqVar.f37523y == 2) {
                        if (z12) {
                            o8Var.c(LocaleController.getString(R.string.CommunityAdminRightEditCommunityName), z14 && dqVar.I.change_info, true);
                        } else if (z13) {
                            o8Var.c(LocaleController.getString(R.string.EditAdminChangeChannelInfo), z14 && dqVar.I.change_info, true);
                        } else {
                            o8Var.c(LocaleController.getString(R.string.EditAdminChangeGroupInfo), (z14 && dqVar.I.change_info) || !dqVar.L.change_info, true);
                        }
                        if (dqVar.f37523y == 2) {
                            o8Var.setIcon((dqVar.J.change_info || z15) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (dqVar.f37523y == 1) {
                        o8Var.c(LocaleController.getString(z12 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (dqVar.K.change_info || dqVar.L.change_info) ? false : true, dqVar.f37503i0 != -1);
                        o8Var.setIcon(dqVar.L.change_info ? R.drawable.permission_locked : 0);
                    }
                } else if (i10 == dqVar.U) {
                    o8Var.c(LocaleController.getString(R.string.EditAdminPostMessages), z14 && dqVar.I.post_messages, true);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.post_messages || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.W) {
                    if (UserObject.isBot(dqVar.v)) {
                        o8Var.c(LocaleController.getString(z13 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages), z14 && dqVar.I.manage_welcome_messages, true);
                    } else {
                        o8Var.c(LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages), z14 && dqVar.I.manage_welcome_messages, true);
                    }
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.manage_welcome_messages || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.V) {
                    o8Var.c(LocaleController.getString(R.string.EditAdminManageDirect), z14 && dqVar.I.manage_direct_messages, true);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.manage_direct_messages || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.X) {
                    o8Var.c(LocaleController.getString(R.string.EditAdminEditMessages), z14 && dqVar.I.edit_messages, true);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.edit_messages || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.Y) {
                    if (z13) {
                        o8Var.c(LocaleController.getString(R.string.EditAdminDeleteMessages), z14 && dqVar.I.delete_messages, true);
                    } else {
                        o8Var.c(LocaleController.getString(R.string.EditAdminGroupDeleteMessages), z14 && dqVar.I.delete_messages, true);
                    }
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.delete_messages || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.Z) {
                    o8Var.c(LocaleController.getString(R.string.EditAdminAddAdmins), z14 && dqVar.I.add_admins, (dqVar.f37493b0 != -1 && z13) || dqVar.f37491a0 != -1);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.add_admins || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.f37491a0) {
                    o8Var.c(LocaleController.getString(R.string.EditAdminSendAnonymously), z14 && dqVar.I.anonymous, dqVar.f37503i0 != -1 || z11);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.anonymous || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.f37501g0) {
                    String string = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                    if (dqVar.f37521x == null || dqVar.v == null) {
                        z10 = false;
                    } else if ((dqVar.f37512r ? dqVar.f37507n : dqVar.f37521x.guard_bot_id) == dqVar.v.f22527id) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o8Var.c(string, z10, false);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon(0);
                    }
                } else if (i10 == dqVar.f37493b0) {
                    o8Var.c(LocaleController.getString(z12 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers), z14 && dqVar.I.ban_users, !z12);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.ban_users || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.f37504j0) {
                    o8Var.c(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), z14 && dqVar.I.manage_linked_peers, true);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.manage_linked_peers || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.G0) {
                    o8Var.c(LocaleController.getString(R.string.StartVoipChatPermission), z14 && dqVar.I.manage_call, true);
                    if (dqVar.f37523y == 2) {
                        o8Var.setIcon((dqVar.J.manage_call || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.f37503i0) {
                    if (dqVar.f37523y == 0) {
                        o8Var.c(LocaleController.getString(R.string.ManageTopicsPermission), z14 && dqVar.I.manage_topics, z11);
                    } else if (dqVar.f37523y == 1) {
                        o8Var.c(LocaleController.getString(R.string.CreateTopicsPermission), (dqVar.K.manage_topics || dqVar.L.manage_topics) ? false : true, z11);
                        o8Var.setIcon(dqVar.L.manage_topics ? R.drawable.permission_locked : 0);
                    } else if (dqVar.f37523y == 2) {
                        o8Var.c(LocaleController.getString(R.string.ManageTopicsPermission), z14 && dqVar.I.manage_topics, z11);
                        o8Var.setIcon((dqVar.J.manage_topics || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.f37495c0) {
                    if (dqVar.f37523y == 0) {
                        if (ChatObject.isActionBannedByDefault(dqVar.f37519w, 3)) {
                            o8Var.c(LocaleController.getString(R.string.EditAdminAddUsers), dqVar.I.invite_users, true);
                        } else {
                            o8Var.c(LocaleController.getString(R.string.EditAdminAddUsersViaLink), dqVar.I.invite_users, true);
                        }
                    } else if (dqVar.f37523y == 1) {
                        o8Var.c(LocaleController.getString(R.string.UserRestrictionsInviteUsers), (dqVar.K.invite_users || dqVar.L.invite_users) ? false : true, true);
                        o8Var.setIcon(dqVar.L.invite_users ? R.drawable.permission_locked : 0);
                    } else if (dqVar.f37523y == 2) {
                        o8Var.c(LocaleController.getString(R.string.EditAdminAddUsersViaLink), z14 && dqVar.I.invite_users, true);
                        o8Var.setIcon((dqVar.J.invite_users || z15) ? 0 : R.drawable.permission_locked);
                    }
                } else if (i10 == dqVar.f37496d0) {
                    if (dqVar.f37523y == 0 || dqVar.f37523y == 2) {
                        o8Var.c(LocaleController.getString(R.string.EditAdminPinMessages), (z14 && dqVar.I.pin_messages) || !dqVar.L.pin_messages, true);
                        if (dqVar.f37523y == 2) {
                            o8Var.setIcon((dqVar.J.pin_messages || z15) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (dqVar.f37523y == 1) {
                        o8Var.c(LocaleController.getString(R.string.UserRestrictionsPinMessages), (dqVar.K.pin_messages || dqVar.L.pin_messages) ? false : true, true);
                        o8Var.setIcon(dqVar.L.pin_messages ? R.drawable.permission_locked : 0);
                    }
                } else if (i10 == dqVar.f37498e0) {
                    if (dqVar.f37523y == 0 || dqVar.f37523y == 2) {
                        o8Var.c(LocaleController.getString(R.string.EditAdminEditTags), z14 && dqVar.I.manage_ranks, true);
                        if (dqVar.f37523y == 2) {
                            o8Var.setIcon((dqVar.J.manage_ranks || z15) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (dqVar.f37523y == 1) {
                        o8Var.c(LocaleController.getString(R.string.UserRestrictionsEditTags), (dqVar.K.edit_rank || dqVar.L.edit_rank) ? false : true, true);
                        o8Var.setIcon(dqVar.L.edit_rank ? R.drawable.permission_locked : 0);
                    }
                } else if (i10 == dqVar.f37517u0) {
                    o8Var.c(LocaleController.getString(R.string.UserRestrictionsSend), (dqVar.K.send_plain || dqVar.L.send_plain) ? false : true, true);
                    o8Var.setIcon(dqVar.L.send_plain ? R.drawable.permission_locked : 0);
                }
                if (dqVar.f37523y != 2 && i10 == dqVar.f37517u0) {
                    o8Var.setEnabled((dqVar.K.view_messages || dqVar.L.view_messages) ? false : true);
                }
                break;
            case 5:
                org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
                if (i13 == 2 && (i10 == dqVar.f37505k0 || i10 == dqVar.f37515s0)) {
                    w6Var.setAlpha(dqVar.F);
                } else {
                    w6Var.setAlpha(1.0f);
                }
                break;
            case 6:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                if (i10 == dqVar.I0) {
                    int i22 = dqVar.K.until_date;
                    v8Var.c(LocaleController.getString(R.string.UserRestrictionsDuration), (i22 == 0 || Math.abs(((long) i22) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(dqVar.K.until_date), false);
                }
                break;
            case 7:
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                String string2 = (UserObject.isUserSelf(dqVar.v) && dqVar.f37519w.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                this.d = true;
                z5Var.getTextView().setEnabled(dqVar.E || dqVar.f37519w.creator);
                z5Var.getTextView().setSingleLine(true);
                z5Var.getTextView().setImeOptions(6);
                z5Var.n(dqVar.O, string2, false);
                this.d = false;
                break;
            case 10:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                boolean z16 = y1Var.getTag() != null && ((Integer) y1Var.getTag()).intValue() == i10;
                y1Var.setTag(Integer.valueOf(i10));
                if (i10 == dqVar.D0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (dqVar.K.send_stickers || tL_chatBannedRights.send_stickers) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_stickers ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.F0) {
                    String string3 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = dqVar.K;
                    y1Var.e(string3, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights.embed_links || tL_chatBannedRights4.send_plain || tL_chatBannedRights.send_plain) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.embed_links ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.E0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPolls), "", (dqVar.K.send_polls || tL_chatBannedRights.send_polls) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_polls ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.f37522x0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (dqVar.K.send_photos || tL_chatBannedRights.send_photos) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_photos ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.f37524y0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (dqVar.K.send_videos || tL_chatBannedRights.send_videos) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_videos ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.f37500f0) {
                    y1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (dqVar.K.send_reactions || tL_chatBannedRights.send_reactions) ? false : true, true, false);
                    y1Var.setIcon(tL_chatBannedRights.send_reactions ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.f37525z0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (dqVar.K.send_audios || tL_chatBannedRights.send_audios) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_audios ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.A0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (dqVar.K.send_docs || tL_chatBannedRights.send_docs) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_docs ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.B0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (dqVar.K.send_voices || tL_chatBannedRights.send_voices) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_voices ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.C0) {
                    y1Var.e(LocaleController.getString(R.string.SendMediaPermissionRound), "", (dqVar.K.send_roundvideos || tL_chatBannedRights.send_roundvideos) ? false : true, true, z16);
                    y1Var.setIcon(tL_chatBannedRights.send_roundvideos ? R.drawable.permission_locked : 0);
                } else if (i10 == dqVar.L0) {
                    y1Var.e(LocaleController.getString(R.string.EditAdminPostMessages), "", tL_chatAdminRights.post_messages, true, z16);
                } else if (i10 == dqVar.M0) {
                    y1Var.e(LocaleController.getString(R.string.EditAdminEditMessages), "", tL_chatAdminRights.edit_messages, true, z16);
                } else if (i10 == dqVar.N0) {
                    y1Var.e(LocaleController.getString(R.string.EditAdminDeleteMessages), "", tL_chatAdminRights.delete_messages, true, z16);
                } else if (i10 == dqVar.Q0) {
                    y1Var.e(LocaleController.getString(R.string.EditAdminPostStories), "", tL_chatAdminRights.post_stories, true, z16);
                } else if (i10 == dqVar.R0) {
                    y1Var.e(LocaleController.getString(R.string.EditAdminEditStories), "", tL_chatAdminRights.edit_stories, true, z16);
                } else if (i10 == dqVar.S0) {
                    y1Var.e(LocaleController.getString(R.string.EditAdminDeleteStories), "", tL_chatAdminRights.delete_stories, true, z16);
                }
                break;
            case 11:
                ((org.telegram.ui.Components.kz0) view).a(dqVar.v, dqVar.O, i13 == 0, false, new x3(this, 2));
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View kz0Var;
        Context context = this.f37129c;
        dq dqVar = this.f37130e;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(context, null);
                raVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                kz0Var = raVar;
                break;
            case 1:
                kz0Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 2:
            default:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                kz0Var = x9Var;
                break;
            case 3:
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(this.f37129c, org.telegram.ui.ActionBar.g6.L6, 21, 15, true, null);
                j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                view = j4Var;
                kz0Var = view;
                break;
            case 4:
            case 9:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
                o8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                kz0Var = o8Var;
                break;
            case 5:
                kz0Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 6:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, null, false);
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                kz0Var = v8Var;
                break;
            case 7:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, null);
                z5Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                z5Var.c(new p0(this, 4));
                kz0Var = z5Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                dqVar.d = frameLayout;
                int i11 = org.telegram.ui.ActionBar.g6.f22999a7;
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                dqVar.f37497e = new FrameLayout(context);
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
                dqVar.f37499f = j6Var;
                j6Var.setTypeface(AndroidUtilities.bold());
                dqVar.f37499f.setTextColor(-1);
                dqVar.f37499f.setTextSize(AndroidUtilities.dp(14.0f));
                dqVar.f37499f.setGravity(17);
                org.telegram.ui.Components.j6 j6Var2 = dqVar.f37499f;
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.AddBotButton, " ", sb2);
                sb2.append(LocaleController.getString(dqVar.G ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                j6Var2.setText(sb2.toString());
                dqVar.f37497e.addView(dqVar.f37499f, h7.z5.e(-2, -2, 17));
                dqVar.f37497e.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
                dqVar.f37497e.setOnClickListener(new a(this, 15));
                dqVar.d.addView(dqVar.f37497e, h7.z5.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                dqVar.d.setLayoutParams(new f2.y0(-1, -2));
                View view2 = new View(context);
                view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                dqVar.d.setClipChildren(false);
                dqVar.d.setClipToPadding(false);
                dqVar.d.addView(view2, h7.z5.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                kz0Var = dqVar.d;
                break;
            case 10:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.f37129c, dqVar.getResourceProvider(), false);
                y1Var.setPad(1);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f23109g7, org.telegram.ui.ActionBar.g6.f23182k7);
                y1Var.setEnabled(true);
                y1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                view = y1Var;
                kz0Var = view;
                break;
            case 11:
                kz0Var = new org.telegram.ui.Components.kz0(((org.telegram.ui.ActionBar.n2) dqVar).currentAccount, -dqVar.f37514s, this.f37129c, ((org.telegram.ui.ActionBar.n2) dqVar).resourceProvider);
                break;
        }
        return new org.telegram.ui.Components.lk0(kz0Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        int iB = o1Var.b();
        dq dqVar = this.f37130e;
        if (iB == dqVar.f37511q0) {
            dq.f0(dqVar, o1Var.f5789a);
        }
    }

    @Override
    public final void z(f2.o1 o1Var) {
        int iB = o1Var.b();
        dq dqVar = this.f37130e;
        if (iB != dqVar.f37513r0 || dqVar.getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(dqVar.getParentActivity().getCurrentFocus());
    }
}
