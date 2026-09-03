package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_communities;
public final class l implements Vector.TLDeserializer {
    public final int f19349a;

    public l(int i10) {
        this.f19349a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        switch (this.f19349a) {
            case 0:
                return TLRPC.AttachMenuPeerType.TLdeserialize(inputSerializedData, i10, z4);
            case 1:
                return TLRPC.TL_attachMenuBotIcon.TLdeserialize(inputSerializedData, i10, z4);
            case 2:
                return TLRPC.TL_attachMenuBotIconColor.TLdeserialize(inputSerializedData, i10, z4);
            case 3:
                return TLRPC.AttachMenuBot.TLdeserialize(inputSerializedData, i10, z4);
            case 4:
                return TLRPC.User.TLdeserialize(inputSerializedData, i10, z4);
            case 5:
                return TLRPC.RestrictionReason.TLdeserialize(inputSerializedData, i10, z4);
            case 6:
                return TLRPC.TL_username.TLdeserialize(inputSerializedData, i10, z4);
            case 7:
                return TL_bots.BotInfo.TLdeserialize(inputSerializedData, i10, z4);
            case 8:
                return TLRPC.TL_messageRange.TLdeserialize(inputSerializedData, i10, z4);
            case 9:
                return TLRPC.TL_channelAdminLogEvent.TLdeserialize(inputSerializedData, i10, z4);
            case 10:
                return TLRPC.Chat.TLdeserialize(inputSerializedData, i10, z4);
            case 11:
                return TLRPC.ChannelParticipant.TLdeserialize(inputSerializedData, i10, z4);
            case 12:
                return TLRPC.TL_sendAsPeer.TLdeserialize(inputSerializedData, i10, z4);
            case 13:
                return TLRPC.TL_sponsoredMessageReportOption.TLdeserialize(inputSerializedData, i10, z4);
            case 14:
                return TLRPC.ChatParticipant.TLdeserialize(inputSerializedData, i10, z4);
            case 15:
                return TLRPC.Reaction.TLdeserialize(inputSerializedData, i10, z4);
            case 16:
                return TLRPC.ThemeSettings.TLdeserialize(inputSerializedData, i10, z4);
            case 17:
                return TL_communities.CommunityPeer.TLdeserialize(inputSerializedData, i10, z4);
            case 18:
                return TLRPC.TL_dcOption.TLdeserialize(inputSerializedData, i10, z4);
            case 19:
                return TLRPC.TL_peerBlocked.TLdeserialize(inputSerializedData, i10, z4);
            case 20:
                return TLRPC.TL_contact.TLdeserialize(inputSerializedData, i10, z4);
            case 21:
                return TLRPC.TL_contactStatus.TLdeserialize(inputSerializedData, i10, z4);
            case 22:
                return TLRPC.TL_importedContact.TLdeserialize(inputSerializedData, i10, z4);
            case 23:
                return TLRPC.TL_popularContact.TLdeserialize(inputSerializedData, i10, z4);
            case 24:
                return TLRPC.TL_sponsoredPeer.TLdeserialize(inputSerializedData, i10, z4);
            case 25:
                return TLRPC.TL_topPeerCategoryPeers.TLdeserialize(inputSerializedData, i10, z4);
            case 26:
                return TLRPC.DocumentAttribute.TLdeserialize(inputSerializedData, i10, z4);
            case 27:
                return TLRPC.InputPeer.TLdeserialize(inputSerializedData, i10, z4);
            case 28:
                return TLRPC.PhotoSize.TLdeserialize(inputSerializedData, i10, z4);
            default:
                return TLRPC.EmojiKeyword.TLdeserialize(inputSerializedData, i10, z4);
        }
    }
}
