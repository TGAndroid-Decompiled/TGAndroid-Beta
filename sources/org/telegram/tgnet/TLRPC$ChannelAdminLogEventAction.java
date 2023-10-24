package org.telegram.tgnet;
public abstract class TLRPC$ChannelAdminLogEventAction extends TLObject {
    public static TLRPC$ChannelAdminLogEventAction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChannelAdminLogEventAction tLRPC$TL_channelAdminLogEventActionStopPoll;
        switch (i) {
            case -1895328189:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionStopPoll();
                break;
            case -1374254839:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionDeleteTopic();
                break;
            case -1347021750:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantJoinByRequest();
                break;
            case -1312568665:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeStickerSet();
                break;
            case -1102180616:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeAvailableReactions();
                break;
            case -886388890:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionToggleNoForwards();
                break;
            case -714643696:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantToggleAdmin();
                break;
            case -610299584:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$ChannelAdminLogEventAction() {
                    public TLRPC$TL_inputGroupCall call;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-610299584);
                        this.call.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -484690728:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantInvite();
                break;
            case -431740480:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantUnmute();
                break;
            case -422036098:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantToggleBan();
                break;
            case -421545947:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeTitle();
                break;
            case -384910503:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionExportedInviteEdit();
                break;
            case -370660328:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionUpdatePinned();
                break;
            case -263212119:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeUsernames();
                break;
            case -261103096:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionEditTopic();
                break;
            case -124291086:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$ChannelAdminLogEventAction() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-124291086);
                    }
                };
                break;
            case -115071790:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantMute();
                break;
            case -26672755:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeTheme();
                break;
            case -23084712:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantJoinByInvite();
                break;
            case 46949251:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionToggleForum();
                break;
            case 84703944:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeLinkedChat();
                break;
            case 241923758:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeLocation();
                break;
            case 405815507:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$ChannelAdminLogEventAction() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(405815507);
                    }
                };
                break;
            case 460916654:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionToggleInvites();
                break;
            case 589338437:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$ChannelAdminLogEventAction() {
                    public TLRPC$TL_inputGroupCall call;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(589338437);
                        this.call.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 648939889:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionToggleSignatures();
                break;
            case 771095562:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionDefaultBannedRights();
                break;
            case 1009460347:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeColor();
                break;
            case 1048537159:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionParticipantVolume();
                break;
            case 1091179342:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionExportedInviteRevoke();
                break;
            case 1121994683:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionDeleteMessage();
                break;
            case 1129042607:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangePhoto();
                break;
            case 1147126836:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeBackgroundEmoji();
                break;
            case 1401984889:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionToggleSlowMode();
                break;
            case 1427671598:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeAbout();
                break;
            case 1456906823:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionToggleGroupCallSetting();
                break;
            case 1483767080:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionCreateTopic();
                break;
            case 1515256996:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionExportedInviteDelete();
                break;
            case 1569535291:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionPinTopic();
                break;
            case 1599903217:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionTogglePreHistoryHidden();
                break;
            case 1693675004:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionToggleAntiSpam();
                break;
            case 1783299128:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeUsername();
                break;
            case 1855199800:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionChangeHistoryTTL();
                break;
            case 1889215493:
                tLRPC$TL_channelAdminLogEventActionStopPoll = new TLRPC$TL_channelAdminLogEventActionEditMessage();
                break;
            default:
                tLRPC$TL_channelAdminLogEventActionStopPoll = null;
                break;
        }
        if (tLRPC$TL_channelAdminLogEventActionStopPoll == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChannelAdminLogEventAction", Integer.valueOf(i)));
        }
        if (tLRPC$TL_channelAdminLogEventActionStopPoll != null) {
            tLRPC$TL_channelAdminLogEventActionStopPoll.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_channelAdminLogEventActionStopPoll;
    }
}
