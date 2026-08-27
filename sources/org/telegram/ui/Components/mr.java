package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

public final class mr implements Utilities.Callback2 {

    public final int f30738a;

    public final ur f30739b;

    public mr(ur urVar, int i10) {
        this.f30738a = i10;
        this.f30739b = urVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f30738a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                ur urVar = this.f30739b;
                tr trVar = urVar.f33174f0;
                tr trVar2 = urVar.f33176h0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = urVar.f33186s0;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = urVar.f33185r0;
                if (urVar.X != null) {
                    arrayList.add(n41.C(AndroidUtilities.dp(12.0f)));
                    org.telegram.ui.Cells.pa.o(R.string.DeleteAdditionalActions, arrayList);
                    urVar.T(arrayList, urVar.f33173e0);
                    if (urVar.f33189v0) {
                        trVar.g();
                        int i10 = (urVar.f33192y0 ? 1 : 0) + (urVar.f33193z0 ? 1 : 0);
                        String str = trVar.f32861b;
                        Locale locale = Locale.US;
                        n41 n41VarZ = n41.z(i10 + "/2", str, 100);
                        n41VarZ.K(i10 == 2);
                        n41VarZ.f30839f = urVar.f33191x0;
                        n41VarZ.D = new q2(17, urVar, b51Var);
                        arrayList.add(n41VarZ);
                        if (!urVar.f33191x0) {
                            n41 n41VarY = n41.y(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages));
                            n41VarY.K(urVar.f33192y0);
                            n41VarY.f30841i = 1;
                            arrayList.add(n41VarY);
                            n41 n41VarY2 = n41.y(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions));
                            n41VarY2.K(urVar.f33193z0);
                            n41VarY2.f30841i = 1;
                            arrayList.add(n41VarY2);
                        }
                    } else {
                        urVar.T(arrayList, trVar);
                        urVar.T(arrayList, urVar.f33175g0);
                    }
                    urVar.T(arrayList, trVar2);
                    if (urVar.f33172d0 || !trVar2.c()) {
                        z10 = true;
                    } else {
                        if (urVar.f33171c0) {
                            arrayList.add(n41.B(null));
                            if (trVar2.b()) {
                                String pluralString = LocaleController.formatPluralString("UserRestrictionsCanDoUsers", trVar2.f32866i, new Object[0]);
                                n41 n41Var = new n41(42);
                                n41Var.d = 0;
                                n41Var.f30847o = pluralString;
                                arrayList.add(n41Var);
                            } else {
                                String string = LocaleController.getString(R.string.UserRestrictionsCanDo);
                                n41 n41Var2 = new n41(42);
                                n41Var2.d = 0;
                                n41Var2.f30847o = string;
                                arrayList.add(n41Var2);
                            }
                            n41 n41VarE = n41.E(0, LocaleController.getString(R.string.UserRestrictionsSend));
                            n41VarE.K((tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                            n41VarE.f30852t = tL_chatBannedRights2.send_plain;
                            arrayList.add(n41VarE);
                            int i11 = (tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? 0 : 1;
                            if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                                i11++;
                            }
                            if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                                i11++;
                            }
                            String string2 = LocaleController.getString(R.string.UserRestrictionsSendMedia);
                            Locale locale2 = Locale.US;
                            n41 n41VarM = n41.m(1, string2, i11 + "/10");
                            n41VarM.K(i11 > 0);
                            n41VarM.f30852t = urVar.S();
                            n41VarM.f30839f = urVar.f33188u0;
                            n41VarM.D = new gh.v2(urVar, i11, b51Var, 9);
                            arrayList.add(n41VarM);
                            if (!urVar.f33188u0) {
                                n41 n41VarY3 = n41.y(6, LocaleController.getString(R.string.SendMediaPermissionPhotos));
                                n41VarY3.K((tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos) ? false : true);
                                n41VarY3.f30852t = tL_chatBannedRights2.send_photos;
                                n41VarY3.f30841i = 1;
                                arrayList.add(n41VarY3);
                                n41 n41VarY4 = n41.y(7, LocaleController.getString(R.string.SendMediaPermissionVideos));
                                n41VarY4.K((tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos) ? false : true);
                                n41VarY4.f30852t = tL_chatBannedRights2.send_videos;
                                n41VarY4.f30841i = 1;
                                arrayList.add(n41VarY4);
                                n41 n41VarY5 = n41.y(8, LocaleController.getString(R.string.SendMediaPermissionFiles));
                                n41VarY5.K((tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs) ? false : true);
                                n41VarY5.f30852t = tL_chatBannedRights2.send_docs;
                                n41VarY5.f30841i = 1;
                                arrayList.add(n41VarY5);
                                n41 n41VarY6 = n41.y(9, LocaleController.getString(R.string.SendMediaPermissionMusic));
                                n41VarY6.K((tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios) ? false : true);
                                n41VarY6.f30852t = tL_chatBannedRights2.send_audios;
                                n41VarY6.f30841i = 1;
                                arrayList.add(n41VarY6);
                                n41 n41VarY7 = n41.y(10, LocaleController.getString(R.string.SendMediaPermissionVoice));
                                n41VarY7.K((tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices) ? false : true);
                                n41VarY7.f30852t = tL_chatBannedRights2.send_voices;
                                n41VarY7.f30841i = 1;
                                arrayList.add(n41VarY7);
                                n41 n41VarY8 = n41.y(11, LocaleController.getString(R.string.SendMediaPermissionRound));
                                n41VarY8.K((tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos) ? false : true);
                                n41VarY8.f30852t = tL_chatBannedRights2.send_roundvideos;
                                n41VarY8.f30841i = 1;
                                arrayList.add(n41VarY8);
                                n41 n41VarY9 = n41.y(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs));
                                n41VarY9.K((tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers) ? false : true);
                                n41VarY9.f30852t = tL_chatBannedRights2.send_stickers;
                                n41VarY9.f30841i = 1;
                                arrayList.add(n41VarY9);
                                n41 n41VarY10 = n41.y(13, LocaleController.getString(R.string.SendMediaPolls));
                                n41VarY10.K((tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls) ? false : true);
                                n41VarY10.f30852t = tL_chatBannedRights2.send_polls;
                                n41VarY10.f30841i = 1;
                                arrayList.add(n41VarY10);
                                n41 n41VarY11 = n41.y(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                                n41VarY11.K((tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) ? false : true);
                                n41VarY11.f30852t = tL_chatBannedRights2.embed_links;
                                n41VarY11.f30841i = 1;
                                arrayList.add(n41VarY11);
                                n41 n41VarY12 = n41.y(15, LocaleController.getString(R.string.UserRestrictionsSendReactions));
                                n41VarY12.K((tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions) ? false : true);
                                n41VarY12.f30852t = tL_chatBannedRights2.send_reactions;
                                n41VarY12.f30841i = 1;
                                arrayList.add(n41VarY12);
                            }
                            n41 n41VarE2 = n41.E(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers));
                            n41VarE2.K((tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users) ? false : true);
                            n41VarE2.f30852t = tL_chatBannedRights2.invite_users;
                            arrayList.add(n41VarE2);
                            n41 n41VarE3 = n41.E(3, LocaleController.getString(R.string.UserRestrictionsPinMessages));
                            n41VarE3.K((tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages) ? false : true);
                            n41VarE3.f30852t = tL_chatBannedRights2.pin_messages;
                            arrayList.add(n41VarE3);
                            n41 n41VarE4 = n41.E(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo));
                            n41VarE4.K((tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info) ? false : true);
                            n41VarE4.f30852t = tL_chatBannedRights2.change_info;
                            arrayList.add(n41VarE4);
                            if (urVar.W) {
                                n41 n41VarE5 = n41.E(5, LocaleController.getString(R.string.CreateTopicsPermission));
                                n41VarE5.K((tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics) ? false : true);
                                n41VarE5.f30852t = tL_chatBannedRights2.manage_topics;
                                arrayList.add(n41VarE5);
                            }
                        }
                        if (urVar.f33179k0) {
                            String string3 = LocaleController.getString(trVar2.b() ? urVar.f33171c0 ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers : urVar.f33171c0 ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser);
                            n41 n41Var3 = new n41(38);
                            n41Var3.d = 1;
                            n41Var3.f30847o = string3;
                            n41Var3.f30839f = !urVar.f33171c0;
                            n41Var3.f30849q = true;
                            arrayList.add(n41Var3);
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    }
                    if (urVar.m0 != 0) {
                        if (z10) {
                            arrayList.add(n41.C(AndroidUtilities.dp(12.0f)));
                        }
                        String string4 = LocaleController.getString(R.string.CommunityBanFromCommunity);
                        n41 n41Var4 = new n41(39);
                        n41Var4.d = 103;
                        n41Var4.f30844l = string4;
                        n41Var4.f30857z = 0;
                        n41Var4.K(urVar.f33180l0);
                        arrayList.add(n41Var4);
                        TL_communities.ParticipantJoinedChats participantJoinedChats = urVar.f33181n0;
                        arrayList.add(n41.A(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new nr(urVar, 1)), true)));
                    }
                    break;
                }
                break;
            default:
                TL_communities.ParticipantJoinedChats participantJoinedChats2 = (TL_communities.ParticipantJoinedChats) obj;
                ur urVar2 = this.f30739b;
                if (participantJoinedChats2 == null) {
                    urVar2.getClass();
                } else {
                    urVar2.f33181n0 = participantJoinedChats2;
                    urVar2.T.N(true);
                }
                break;
        }
    }
}
