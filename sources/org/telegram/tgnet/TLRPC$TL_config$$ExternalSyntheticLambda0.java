package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_communities;

public final class TLRPC$TL_config$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    public final int $r8$classId;

    public TLRPC$TL_config$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return TLRPC.TL_dcOption.TLdeserialize(inputSerializedData, i, z);
            case 1:
                return TLRPC.AttachMenuPeerType.TLdeserialize(inputSerializedData, i, z);
            case 2:
                return TLRPC.TL_attachMenuBotIcon.TLdeserialize(inputSerializedData, i, z);
            case 3:
                return TLRPC.TL_attachMenuBotIconColor.TLdeserialize(inputSerializedData, i, z);
            case 4:
                return TLRPC.AttachMenuBot.TLdeserialize(inputSerializedData, i, z);
            case 5:
                return TLRPC.User.TLdeserialize(inputSerializedData, i, z);
            case 6:
                return TLRPC.RestrictionReason.TLdeserialize(inputSerializedData, i, z);
            case 7:
                return TLRPC.TL_username.TLdeserialize(inputSerializedData, i, z);
            case 8:
                return TL_bots.BotInfo.TLdeserialize(inputSerializedData, i, z);
            case 9:
                return TLRPC.TL_messageRange.TLdeserialize(inputSerializedData, i, z);
            case 10:
                return TLRPC.TL_channelAdminLogEvent.TLdeserialize(inputSerializedData, i, z);
            case 11:
                return TLRPC.Chat.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TLRPC.ChannelParticipant.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.TL_sendAsPeer.TLdeserialize(inputSerializedData, i, z);
            case 14:
                return TLRPC.TL_sponsoredMessageReportOption.TLdeserialize(inputSerializedData, i, z);
            case 15:
                return TLRPC.ChatParticipant.TLdeserialize(inputSerializedData, i, z);
            case 16:
                return TLRPC.Reaction.TLdeserialize(inputSerializedData, i, z);
            case 17:
                return TLRPC.ThemeSettings.TLdeserialize(inputSerializedData, i, z);
            case 18:
                return TL_communities.CommunityPeer.TLdeserialize(inputSerializedData, i, z);
            case 19:
                return TLRPC.TL_peerBlocked.TLdeserialize(inputSerializedData, i, z);
            case 20:
                return TLRPC.TL_contact.TLdeserialize(inputSerializedData, i, z);
            case 21:
                return TLRPC.TL_contactStatus.TLdeserialize(inputSerializedData, i, z);
            case 22:
                return TLRPC.TL_importedContact.TLdeserialize(inputSerializedData, i, z);
            case 23:
                return TLRPC.TL_popularContact.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TLRPC.TL_sponsoredPeer.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TLRPC.TL_topPeerCategoryPeers.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TLRPC.DocumentAttribute.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TLRPC.InputPeer.TLdeserialize(inputSerializedData, i, z);
            case 28:
                return TLRPC.PhotoSize.TLdeserialize(inputSerializedData, i, z);
            default:
                return TLRPC.EmojiKeyword.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
