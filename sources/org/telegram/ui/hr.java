package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

public final class hr extends org.telegram.ui.Components.yk0 {

    public final Context f38885c;
    public final lr d;

    public hr(lr lrVar, Context context) {
        this.d = lrVar;
        this.f38885c = context;
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
        int i10 = o1Var.f5793f;
        if (i10 != 16) {
            lr lrVar = this.d;
            if (i10 == 7 || i10 == 14) {
                return ChatObject.canBlockUsers(lrVar.f40217r);
            }
            if (i10 == 0) {
                Object currentObject = ((org.telegram.ui.Cells.y4) o1Var.f5789a).getCurrentObject();
                if (lrVar.K != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                    return false;
                }
            } else {
                int iB = o1Var.b();
                if (i10 != 0 && i10 != 2 && i10 != 6) {
                    if (i10 != 12) {
                        if (i10 == 13) {
                            return false;
                        }
                    } else {
                        if (iB == lrVar.f40223t0) {
                            return ChatObject.canUserDoAdminAction(lrVar.f40217r, 13);
                        }
                        if (iB == lrVar.F0) {
                            return ChatObject.canUserDoAdminAction(lrVar.f40217r, 2);
                        }
                        if (iB != lrVar.H0) {
                            if (i10 == 13) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final TLObject E(int i10) {
        lr lrVar = this.d;
        int i11 = lrVar.A0;
        if (i10 >= i11 && i10 < lrVar.B0) {
            return (TLObject) lrVar.B.get(i10 - i11);
        }
        int i12 = lrVar.Q0;
        if (i10 >= i12 && i10 < lrVar.R0) {
            return (TLObject) lrVar.D.get(i10 - i12);
        }
        int i13 = lrVar.T0;
        if (i10 < i13 || i10 >= lrVar.U0) {
            return null;
        }
        return (TLObject) lrVar.C.get(i10 - i13);
    }

    @Override
    public final int h() {
        return this.d.Z0;
    }

    @Override
    public final int j(int i10) {
        lr lrVar = this.d;
        if (i10 == lrVar.f40227v0 || i10 == lrVar.f40230w0 || i10 == lrVar.f40218r0 || i10 == lrVar.f40213p0) {
            return 2;
        }
        if ((i10 >= lrVar.A0 && i10 < lrVar.B0) || ((i10 >= lrVar.T0 && i10 < lrVar.U0) || (i10 >= lrVar.Q0 && i10 < lrVar.R0))) {
            return 0;
        }
        if (i10 == lrVar.f40236y0 || i10 == lrVar.C0 || i10 == lrVar.D0) {
            return 3;
        }
        if (i10 == lrVar.f40238z0 || i10 == lrVar.O || i10 == lrVar.J0 || i10 == lrVar.f40211o0 || i10 == lrVar.f40206l0) {
            return 5;
        }
        if (i10 == lrVar.X0 || i10 == lrVar.L0 || i10 == lrVar.N0 || i10 == lrVar.f40215q0 || i10 == lrVar.f40225u0 || i10 == lrVar.G0 || i10 == lrVar.I0 || i10 == lrVar.f40195f1 || i10 == lrVar.f40204k0 || i10 == lrVar.f40209n0) {
            return 1;
        }
        if (i10 == lrVar.Y0) {
            return 4;
        }
        if (i10 == lrVar.f40233x0) {
            return 6;
        }
        if (i10 == lrVar.f40186c0 || i10 == lrVar.f40188d0 || i10 == lrVar.f40200i0 || i10 == lrVar.f40191e0 || i10 == lrVar.f40194f0 || i10 == lrVar.P || i10 == lrVar.f40180a0 || i10 == lrVar.f40183b0 || i10 == lrVar.f40198h0 || i10 == lrVar.M0) {
            return 7;
        }
        if (i10 == lrVar.V0 || i10 == lrVar.P0 || i10 == lrVar.S0 || i10 == lrVar.f40187c1) {
            return 8;
        }
        if (i10 == lrVar.K0) {
            return 9;
        }
        if (i10 == lrVar.W0) {
            return 10;
        }
        if (i10 == lrVar.f40184b1) {
            return 11;
        }
        if (i10 == lrVar.f40223t0 || i10 == lrVar.F0 || i10 == lrVar.H0) {
            return 12;
        }
        if (lrVar.p0(i10)) {
            return 13;
        }
        if (i10 == lrVar.Q) {
            return 14;
        }
        if (i10 == lrVar.O0) {
            return 15;
        }
        if (i10 == lrVar.f40189d1 || i10 == lrVar.f40192e1 || i10 == lrVar.f40202j0) {
            return 16;
        }
        return i10 == lrVar.m0 ? 17 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        long peerId;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z13;
        TLObject chat;
        CharSequence joined;
        boolean z14;
        CharSequence string;
        TLRPC.User user;
        boolean z15;
        CharSequence string2;
        boolean z16;
        TLRPC.User user2;
        StringBuilder sb2;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        CharSequence string3;
        boolean z33;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        lr lrVar = this.d;
        ArrayList arrayList = lrVar.B;
        boolean z34 = lrVar.f40229w;
        boolean z35 = lrVar.v;
        int i12 = lrVar.K;
        int i13 = o1Var.f5793f;
        View view = o1Var.f5789a;
        String str = "";
        int i14 = 0;
        z = false;
        boolean z36 = false;
        z = false;
        z = false;
        boolean z37 = false;
        z = false;
        z = false;
        boolean z38 = false;
        z = true;
        z = true;
        boolean z39 = true;
        switch (i13) {
            case 0:
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.setTag(Integer.valueOf(i10));
                TLObject tLObjectE = E(i10);
                if (i10 < lrVar.A0 || i10 >= (i11 = lrVar.B0)) {
                    if (i10 < lrVar.Q0 || i10 >= (i11 = lrVar.R0)) {
                        i11 = lrVar.U0;
                    } else if (ChatObject.isChannel(lrVar.f40217r) && !lrVar.f40217r.megagroup) {
                        z10 = true;
                    }
                    z10 = false;
                } else if (!ChatObject.isChannel(lrVar.f40217r) || lrVar.f40217r.megagroup) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!(tLObjectE instanceof TLRPC.User)) {
                    if (tLObjectE instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObjectE;
                        peerId = MessageObject.getPeerId(channelParticipant.peer);
                        str = "";
                        long j13 = channelParticipant.kicked_by;
                        long j14 = channelParticipant.promoted_by;
                        j10 = 0;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = channelParticipant.banned_rights;
                        int i15 = channelParticipant.date;
                        z13 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                        z12 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                        z11 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        i14 = i15;
                        j11 = j13;
                        tL_chatBannedRights = tL_chatBannedRights3;
                        j12 = j14;
                    } else {
                        j10 = 0;
                        if (tLObjectE instanceof TLRPC.ChatParticipant) {
                            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObjectE;
                            peerId = chatParticipant.user_id;
                            int i16 = chatParticipant.date;
                            boolean z40 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                            z11 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                            i14 = i16;
                            z12 = z40;
                            j11 = 0;
                            j12 = 0;
                            tL_chatBannedRights = null;
                        }
                    }
                    if (peerId > j10) {
                        chat = lrVar.getMessagesController().getUser(Long.valueOf(peerId));
                    } else {
                        chat = lrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                    }
                    if (chat != null) {
                        if (i12 == 3) {
                            if (tL_chatBannedRights == null) {
                                string3 = str;
                            } else {
                                sb2 = new StringBuilder();
                                z17 = tL_chatBannedRights.view_messages;
                                if (z17 && lrVar.A.view_messages != z17) {
                                    sb2.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages && lrVar.A.send_plain != tL_chatBannedRights.send_plain) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                z18 = tL_chatBannedRights.send_media;
                                if (z18 || lrVar.A.send_media == z18) {
                                    z19 = tL_chatBannedRights.send_photos;
                                    if (z19 && lrVar.A.send_photos != z19) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    z20 = tL_chatBannedRights.send_videos;
                                    if (z20 && lrVar.A.send_videos != z20) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    z21 = tL_chatBannedRights.send_audios;
                                    if (z21 && lrVar.A.send_audios != z21) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    z22 = tL_chatBannedRights.send_docs;
                                    if (z22 && lrVar.A.send_docs != z22) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    z23 = tL_chatBannedRights.send_voices;
                                    if (z23 && lrVar.A.send_voices != z23) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    z24 = tL_chatBannedRights.send_roundvideos;
                                    if (z24 && lrVar.A.send_roundvideos != z24) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                    }
                                } else {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendMedia", R.string.UserRestrictionsNoSendMedia));
                                }
                                z25 = tL_chatBannedRights.send_stickers;
                                if (z25 && lrVar.A.send_stickers != z25) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                z26 = tL_chatBannedRights.send_polls;
                                if (z26 && lrVar.A.send_polls != z26) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                z27 = tL_chatBannedRights.embed_links;
                                if (z27 && !tL_chatBannedRights.send_plain && lrVar.A.embed_links != z27) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                z28 = tL_chatBannedRights.invite_users;
                                if (z28 && lrVar.A.invite_users != z28) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                z29 = tL_chatBannedRights.pin_messages;
                                if (z29 && lrVar.A.pin_messages != z29) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                z30 = tL_chatBannedRights.edit_rank;
                                if (z30 && lrVar.A.edit_rank != z30) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                z31 = tL_chatBannedRights.send_reactions;
                                if (z31 && lrVar.A.send_reactions != z31) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                z32 = tL_chatBannedRights.change_info;
                                if (z32 && lrVar.A.change_info != z32) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
                                }
                                if (sb2.length() != 0) {
                                    sb2.replace(0, 1, sb2.substring(0, 1).toUpperCase());
                                    sb2.append('.');
                                }
                                string3 = sb2.toString();
                            }
                            if (i10 != i11 - 1) {
                                z33 = true;
                            } else {
                                z33 = false;
                            }
                            y4Var.b(chat, null, string3, z33);
                        } else if (i12 == 0) {
                            if (z13 || (user2 = lrVar.getMessagesController().getUser(Long.valueOf(j11))) == null) {
                                string2 = null;
                            } else {
                                string2 = LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2));
                            }
                            if (i10 != i11 - 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            y4Var.b(chat, null, string2, z16);
                        } else if (i12 == 1) {
                            if (z12) {
                                if (z11 || (user = lrVar.getMessagesController().getUser(Long.valueOf(j12))) == null) {
                                    string = null;
                                } else if (user.f22527id == peerId) {
                                    string = LocaleController.getString(R.string.ChannelAdministrator);
                                } else {
                                    string = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                }
                                if (i10 != i11 - 1) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                y4Var.b(chat, null, string, z15);
                            } else {
                                string = LocaleController.getString(R.string.ChannelCreator);
                            }
                            if (i10 != i11 - 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            y4Var.b(chat, null, string, z15);
                        } else if (i12 == 2) {
                            if (z10 || i14 == 0) {
                                joined = null;
                            } else {
                                joined = LocaleController.formatJoined(i14);
                            }
                            if (i10 != i11 - 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            y4Var.b(chat, null, joined, z14);
                        }
                    }
                } else {
                    peerId = ((TLRPC.User) tLObjectE).f22527id;
                    z12 = false;
                    z11 = false;
                    tL_chatBannedRights = null;
                    j11 = 0;
                    j12 = 0;
                    j10 = 0;
                }
                z13 = false;
                if (peerId > j10) {
                    chat = lrVar.getMessagesController().getUser(Long.valueOf(peerId));
                } else {
                    chat = lrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                }
                if (chat != null) {
                    if (i12 == 3) {
                        if (tL_chatBannedRights == null) {
                            string3 = str;
                        } else {
                            sb2 = new StringBuilder();
                            z17 = tL_chatBannedRights.view_messages;
                            if (z17) {
                                sb2.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                            }
                            if (tL_chatBannedRights.send_messages) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                            }
                            z18 = tL_chatBannedRights.send_media;
                            if (z18) {
                                z19 = tL_chatBannedRights.send_photos;
                                if (z19) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                }
                                z20 = tL_chatBannedRights.send_videos;
                                if (z20) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                }
                                z21 = tL_chatBannedRights.send_audios;
                                if (z21) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                }
                                z22 = tL_chatBannedRights.send_docs;
                                if (z22) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                }
                                z23 = tL_chatBannedRights.send_voices;
                                if (z23) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                }
                                z24 = tL_chatBannedRights.send_roundvideos;
                                if (z24) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                }
                            } else {
                                z19 = tL_chatBannedRights.send_photos;
                                if (z19) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                }
                                z20 = tL_chatBannedRights.send_videos;
                                if (z20) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                }
                                z21 = tL_chatBannedRights.send_audios;
                                if (z21) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                }
                                z22 = tL_chatBannedRights.send_docs;
                                if (z22) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                }
                                z23 = tL_chatBannedRights.send_voices;
                                if (z23) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                }
                                z24 = tL_chatBannedRights.send_roundvideos;
                                if (z24) {
                                    if (sb2.length() != 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                }
                            }
                            z25 = tL_chatBannedRights.send_stickers;
                            if (z25) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                            }
                            z26 = tL_chatBannedRights.send_polls;
                            if (z26) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                            }
                            z27 = tL_chatBannedRights.embed_links;
                            if (z27) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                            }
                            z28 = tL_chatBannedRights.invite_users;
                            if (z28) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                            }
                            z29 = tL_chatBannedRights.pin_messages;
                            if (z29) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                            }
                            z30 = tL_chatBannedRights.edit_rank;
                            if (z30) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                            }
                            z31 = tL_chatBannedRights.send_reactions;
                            if (z31) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                            }
                            z32 = tL_chatBannedRights.change_info;
                            if (z32) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
                            }
                            if (sb2.length() != 0) {
                                sb2.replace(0, 1, sb2.substring(0, 1).toUpperCase());
                                sb2.append('.');
                            }
                            string3 = sb2.toString();
                        }
                        if (i10 != i11 - 1) {
                            z33 = true;
                        } else {
                            z33 = false;
                        }
                        y4Var.b(chat, null, string3, z33);
                    } else if (i12 == 0) {
                        if (z13) {
                            string2 = null;
                        } else {
                            string2 = null;
                        }
                        if (i10 != i11 - 1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        y4Var.b(chat, null, string2, z16);
                    } else if (i12 == 1) {
                        if (z12) {
                            if (z11) {
                                string = null;
                            } else {
                                string = null;
                            }
                            if (i10 != i11 - 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            y4Var.b(chat, null, string, z15);
                        } else {
                            string = LocaleController.getString(R.string.ChannelCreator);
                        }
                        if (i10 != i11 - 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        y4Var.b(chat, null, string, z15);
                    } else if (i12 == 2) {
                        if (z10) {
                            joined = null;
                        } else {
                            joined = null;
                        }
                        if (i10 != i11 - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        y4Var.b(chat, null, joined, z14);
                    }
                }
                break;
            case 1:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == lrVar.f40225u0) {
                    x8Var.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                } else if (i10 != lrVar.X0) {
                    if (i10 == lrVar.L0) {
                        int iM0 = lr.m0(lrVar.l1);
                        if (lrVar.f40220s == null || iM0 == 0) {
                            x8Var.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                        } else {
                            x8Var.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, iM0 < 60 ? LocaleController.formatPluralString("Seconds", iM0, new Object[0]) : iM0 < 3600 ? LocaleController.formatPluralString("Minutes", iM0 / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (iM0 / 60) / 60, new Object[0])));
                        }
                    } else if (i10 == lrVar.f40204k0) {
                        x8Var.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                    } else if (i10 == lrVar.f40209n0) {
                        x8Var.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, nh.k.G0(lrVar.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((double) ((int) ((((double) (lrVar.f40231w1 * (lrVar.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f))) / 1000.0d) * ((double) lrVar.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d)));
                    } else if (i10 == lrVar.G0) {
                        x8Var.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                    } else if (i10 == lrVar.I0) {
                        x8Var.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                    } else if (i10 == lrVar.f40215q0) {
                        x8Var.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                    } else if (i10 != lrVar.N0) {
                        if (i10 == lrVar.f40195f1) {
                            x8Var.setText(LocaleController.getString(lrVar.f40219r1 ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                        }
                    } else if (!lrVar.f40210n1) {
                        x8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                    }
                } else if (i12 == 0 || i12 == 3) {
                    if (z35) {
                        x8Var.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    } else if (!z34) {
                        x8Var.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    }
                } else if (i12 != 1) {
                    if (i12 == 2) {
                        if (z35 && lrVar.f40181a1 == 0) {
                            x8Var.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                        } else {
                            x8Var.setText("");
                        }
                    }
                } else if (lrVar.f40227v0 == -1) {
                    x8Var.setText("");
                } else if (!z35) {
                    x8Var.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                } else {
                    x8Var.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                }
                break;
            case 2:
                org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
                v4Var.a(org.telegram.ui.ActionBar.g6.f23215m6, org.telegram.ui.ActionBar.g6.G6);
                if (i10 != lrVar.f40227v0) {
                    if (i10 == lrVar.f40218r0) {
                        v4Var.b(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, lrVar.f40223t0 > lrVar.f40218r0);
                    } else if (i10 == lrVar.f40230w0) {
                        v4Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                        if ((!lrVar.M || lrVar.N) && lrVar.V0 == -1 && !arrayList.isEmpty()) {
                            z38 = true;
                        }
                        v4Var.b(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z38);
                    } else if (i10 == lrVar.f40213p0) {
                        v4Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                        v4Var.b(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                    }
                } else if (i12 == 3) {
                    v4Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                    v4Var.b(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, lrVar.A0 != -1);
                } else if (i12 == 0) {
                    v4Var.b(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                } else if (i12 == 1) {
                    v4Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                    v4Var.b(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !lrVar.M || lrVar.N);
                } else if (i12 == 2) {
                    v4Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                    if (lrVar.f40230w0 != -1 || ((!lrVar.M || lrVar.N) && lrVar.V0 == -1 && !arrayList.isEmpty())) {
                        z37 = true;
                    }
                    if (!z35) {
                        v4Var.b(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z37);
                    } else {
                        v4Var.b(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z37);
                    }
                }
                break;
            case 5:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 != lrVar.f40238z0) {
                    if (i10 == lrVar.O) {
                        j4Var.setText(LocaleController.getString(z34 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                    } else if (i10 == lrVar.J0) {
                        j4Var.setText(LocaleController.getString(R.string.Slowmode));
                    } else if (i10 == lrVar.f40211o0) {
                        j4Var.setText(LocaleController.getString(R.string.BroadcastGroup));
                    } else if (i10 == lrVar.f40206l0) {
                        j4Var.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                    }
                } else if (i12 != 0) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                } else {
                    TLRPC.ChatFull chatFull3 = lrVar.f40220s;
                    int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                    if (size == 0) {
                        j4Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                    } else {
                        j4Var.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                    }
                }
                break;
            case 6:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String string4 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                TLRPC.ChatFull chatFull4 = lrVar.f40220s;
                x9Var.c(string4, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                break;
            case 7:
            case 14:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.getCheckBox().setDrawIconType(1);
                Switch checkBox = o8Var.getCheckBox();
                int i17 = org.telegram.ui.ActionBar.g6.f23302r7;
                int i18 = org.telegram.ui.ActionBar.g6.V6;
                int i19 = org.telegram.ui.ActionBar.g6.f23053d6;
                checkBox.d(i17, i18, i19, i19);
                boolean z41 = o8Var.getTag() != null && ((Integer) o8Var.getTag()).intValue() == i10;
                o8Var.setTag(Integer.valueOf(i10));
                if (i10 == lrVar.f40186c0) {
                    o8Var.d(LocaleController.getString(z34 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (lrVar.A.change_info || ChatObject.isPublic(lrVar.f40217r)) ? false : true, lrVar.f40198h0 != -1, z41);
                } else if (i10 == lrVar.f40200i0) {
                    o8Var.d(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !lrVar.A.manage_linked_peers, false, z41);
                } else if (i10 == lrVar.f40188d0) {
                    o8Var.d(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !lrVar.A.invite_users, true, z41);
                } else if (i10 == lrVar.f40191e0) {
                    o8Var.d(LocaleController.getString(R.string.UserRestrictionsPinMessages), (lrVar.A.pin_messages || ChatObject.isPublic(lrVar.f40217r)) ? false : true, true, z41);
                } else if (i10 == lrVar.f40194f0) {
                    o8Var.d(LocaleController.getString(R.string.UserRestrictionsEditTags), !lrVar.A.edit_rank, true, z41);
                } else if (i10 == lrVar.P) {
                    o8Var.d(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !lrVar.A.send_plain, true, z41);
                } else if (i10 == lrVar.M0) {
                    o8Var.d(LocaleController.getString(R.string.GroupNotRestrictBoosters), lrVar.f40210n1, false, z41);
                    o8Var.getCheckBox().setDrawIconType(0);
                    o8Var.getCheckBox().d(org.telegram.ui.ActionBar.g6.M6, org.telegram.ui.ActionBar.g6.N6, i19, i19);
                } else if (i10 == lrVar.Q) {
                    int iN0 = lr.n0(lrVar.A);
                    o8Var.d(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), iN0 > 0, true, z41);
                    Locale locale = Locale.US;
                    o8Var.a(new o0.m(this, o8Var, false, 2), s3.c.d(iN0, "/10"), !lrVar.f40199h1);
                } else if (i10 == lrVar.f40180a0) {
                    o8Var.d(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !lrVar.A.send_stickers, true, z41);
                } else if (i10 == lrVar.f40183b0) {
                    o8Var.d(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !lrVar.A.embed_links, true, z41);
                } else if (i10 == lrVar.Z) {
                    o8Var.d(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !lrVar.A.send_polls, true, false);
                } else if (i10 == lrVar.f40198h0) {
                    o8Var.d(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !lrVar.A.manage_topics, false, z41);
                }
                if ((i10 == lrVar.f40191e0 || i10 == lrVar.f40186c0) && ChatObject.isDiscussionGroup(((org.telegram.ui.ActionBar.n2) lrVar).currentAccount, lrVar.J)) {
                    o8Var.setIcon(R.drawable.permission_locked);
                } else if (!ChatObject.canBlockUsers(lrVar.f40217r)) {
                    o8Var.setIcon(0);
                } else if ((i10 == lrVar.f40188d0 && !ChatObject.canUserDoAdminAction(lrVar.f40217r, 3)) || ((i10 == lrVar.f40191e0 && !ChatObject.canUserDoAdminAction(lrVar.f40217r, 0)) || ((i10 == lrVar.f40186c0 && !ChatObject.canUserDoAdminAction(lrVar.f40217r, 1)) || ((i10 == lrVar.f40198h0 && !ChatObject.canManageTopics(lrVar.f40217r)) || (ChatObject.isPublic(lrVar.f40217r) && (i10 == lrVar.f40191e0 || i10 == lrVar.f40186c0)))))) {
                    o8Var.setIcon(R.drawable.permission_locked);
                } else {
                    o8Var.setIcon(0);
                }
                break;
            case 8:
                org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
                if (i10 != lrVar.V0) {
                    if (i10 == lrVar.S0) {
                        s3Var.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                    } else if (i10 != lrVar.P0) {
                        if (i10 == lrVar.f40187c1) {
                            s3Var.setText("");
                        }
                    } else if (ChatObject.isChannel(lrVar.f40217r) && !lrVar.f40217r.megagroup) {
                        s3Var.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                    } else {
                        s3Var.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                    }
                } else if (ChatObject.isChannel(lrVar.f40217r) && !lrVar.f40217r.megagroup) {
                    s3Var.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                } else {
                    s3Var.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                }
                break;
            case 11:
                org.telegram.ui.Components.h00 h00Var = (org.telegram.ui.Components.h00) view;
                if (i12 != 0) {
                    h00Var.setItemsCount(1);
                } else {
                    TLRPC.ChatFull chatFull5 = lrVar.f40220s;
                    h00Var.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                }
                break;
            case 12:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                if (i10 == lrVar.f40223t0) {
                    l8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(lrVar.f40217r, 13) && ((chatFull2 = lrVar.f40220s) == null || chatFull2.antispam || lrVar.l0() >= lrVar.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string5 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                    TLRPC.ChatFull chatFull6 = lrVar.f40220s;
                    if (chatFull6 != null && chatFull6.antispam) {
                        z36 = true;
                    }
                    l8Var.l(R.drawable.msg_policy, string5, z36);
                } else if (i10 == lrVar.F0) {
                    l8Var.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(lrVar.f40217r, 2) && ((chatFull = lrVar.f40220s) == null || chatFull.participants_hidden || lrVar.l0() >= lrVar.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    String string6 = LocaleController.getString(R.string.ChannelHideMembers);
                    TLRPC.ChatFull chatFull7 = lrVar.f40220s;
                    l8Var.j(string6, chatFull7 != null && chatFull7.participants_hidden, false);
                } else if (i10 == lrVar.H0) {
                    l8Var.getCheckBox().setIcon(0);
                    String string7 = LocaleController.getString(R.string.ChannelMemberTags);
                    TLRPC.Chat chat2 = lrVar.f40217r;
                    if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                        z39 = false;
                    }
                    l8Var.j(string7, z39, false);
                }
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                boolean z42 = y1Var.getTag() != null && ((Integer) y1Var.getTag()).intValue() == i10;
                y1Var.setTag(Integer.valueOf(i10));
                if (i10 == lrVar.R) {
                    y1Var.e(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !lrVar.A.send_photos, true, z42);
                } else if (i10 == lrVar.S) {
                    y1Var.e(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !lrVar.A.send_videos, true, z42);
                } else if (i10 == lrVar.T) {
                    y1Var.e(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !lrVar.A.send_stickers, true, z42);
                } else if (i10 == lrVar.U) {
                    y1Var.e(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !lrVar.A.send_audios, true, z42);
                } else if (i10 == lrVar.V) {
                    y1Var.e(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !lrVar.A.send_docs, true, z42);
                } else if (i10 == lrVar.W) {
                    y1Var.e(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !lrVar.A.send_voices, true, z42);
                } else if (i10 == lrVar.X) {
                    y1Var.e(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !lrVar.A.send_roundvideos, true, z42);
                } else if (i10 == lrVar.Y) {
                    String string8 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = lrVar.A;
                    y1Var.e(string8, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights4.send_plain) ? false : true, true, z42);
                } else if (i10 == lrVar.f40196g0) {
                    y1Var.e(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !lrVar.A.send_reactions, false, z42);
                } else if (i10 != lrVar.Z) {
                    y1Var.setPad(1);
                } else {
                    y1Var.e(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !lrVar.A.send_polls, true, z42);
                }
                break;
            case 16:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (i10 == lrVar.f40189d1) {
                    String string9 = LocaleController.getString(R.string.ChannelSignMessages);
                    boolean z43 = lrVar.f40219r1;
                    p8Var.f(string9, z43, z43);
                } else if (i10 == lrVar.f40192e1) {
                    p8Var.f(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), lrVar.f40222s1, false);
                } else if (i10 == lrVar.f40202j0) {
                    p8Var.f(LocaleController.getString(R.string.GroupMessagesChargePrice), lrVar.f40226u1, false);
                }
                break;
            case 17:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                if (i10 == lrVar.m0) {
                    int[] iArrA = org.telegram.ui.Cells.u7.a((int) lrVar.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    int iClamp = (int) Utilities.clamp(lrVar.f40231w1, lrVar.getMessagesController().starsPaidMessageAmountMax, 1L);
                    fr frVar = new fr(0);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.f25681c = iArrA;
                    t7Var.d = 20;
                    t7Var.f25682e = frVar;
                    u7Var.d(iClamp, t7Var, new x3(this, 3));
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        View view;
        Context context = this.f38885c;
        lr lrVar = this.d;
        switch (i10) {
            case 0:
                int i11 = lrVar.K;
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4((i11 == 0 || i11 == 3) ? 7 : 6, (i11 == 0 || i11 == 3) ? 6 : 2, this.f38885c, null, lrVar.f40181a1 == 0);
                y4Var.setDelegate(new gr(this, 0));
                view = y4Var;
                x8Var = view;
                break;
            case 1:
                x8Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 2:
                x8Var = new org.telegram.ui.Cells.v4(context);
                break;
            case 3:
                x8Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 4:
                org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
                if (lrVar.v) {
                    x8Var2.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                    x8Var = x8Var2;
                } else if (!lrVar.f40229w) {
                    x8Var2.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                    x8Var = x8Var2;
                } else {
                    x8Var2.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                    x8Var = x8Var2;
                }
                break;
            case 5:
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(this.f38885c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                j4Var.setHeight(43);
                view = j4Var;
                x8Var = view;
                break;
            case 6:
                x8Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 7:
            case 14:
                x8Var = new org.telegram.ui.Cells.o8(context);
                break;
            case 8:
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, 26, ((org.telegram.ui.ActionBar.n2) lrVar).resourceProvider);
                s3Var.setBackground(null);
                x8Var = s3Var;
                break;
            case 9:
            default:
                org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, null);
                dv0Var.b(lrVar.l1, null, LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff), LocaleController.formatString(R.string.SlowmodeSeconds, 5), LocaleController.formatString(R.string.SlowmodeSeconds, 10), LocaleController.formatString(R.string.SlowmodeSeconds, 30), LocaleController.formatString(R.string.SlowmodeMinutes, 1), LocaleController.formatString(R.string.SlowmodeMinutes, 5), LocaleController.formatString(R.string.SlowmodeMinutes, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                dv0Var.setCallback(new gr(this, 1));
                x8Var = dv0Var;
                break;
            case 10:
                x8Var = new org.telegram.ui.Cells.p4(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                break;
            case 11:
                org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(6);
                h00Var.f28887w = false;
                h00Var.setUseHeaderOffset(false);
                h00Var.setPaddingLeft(AndroidUtilities.dp(5.0f));
                f2.y0 y0Var = new f2.y0(-1, -1);
                int iDp = AndroidUtilities.dp(12.0f);
                ((ViewGroup.MarginLayoutParams) y0Var).rightMargin = iDp;
                ((ViewGroup.MarginLayoutParams) y0Var).leftMargin = iDp;
                ((ViewGroup.MarginLayoutParams) y0Var).topMargin = AndroidUtilities.dp(30.0f);
                h00Var.setLayoutParams(y0Var);
                x8Var = h00Var;
                break;
            case 12:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(23, this.f38885c, lrVar.getResourceProvider(), false, true);
                l8Var.v = 50;
                x8Var = l8Var;
                break;
            case 13:
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, this.f38885c, lrVar.getResourceProvider(), false);
                y1Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f23109g7, org.telegram.ui.ActionBar.g6.f23182k7);
                y1Var.setEnabled(true);
                x8Var = y1Var;
                break;
            case 15:
                org.telegram.ui.Components.dv0 dv0Var2 = new org.telegram.ui.Components.dv0(context, null);
                Drawable[] drawableArr = {lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2), lrVar.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge2)};
                int i12 = lrVar.f40212o1;
                dv0Var2.b(i12 > 0 ? i12 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                dv0Var2.setCallback(new gr(this, 2));
                view = dv0Var2;
                x8Var = view;
                break;
            case 16:
                x8Var = new org.telegram.ui.Cells.p8(context, lrVar.getResourceProvider());
                break;
            case 17:
                x8Var = new org.telegram.ui.Cells.u7(context, lrVar.getResourceProvider());
                break;
        }
        return new org.telegram.ui.Components.lk0(x8Var);
    }
}
