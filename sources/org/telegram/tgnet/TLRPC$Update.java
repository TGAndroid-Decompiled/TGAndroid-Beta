package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$Update extends TLObject {
    public static TLRPC$Update TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Update tLRPC$Update;
        switch (i) {
            case -2112423005:
                tLRPC$Update = new TLRPC$TL_updateTheme();
                break;
            case -2092401936:
                tLRPC$Update = new TLRPC$TL_updateChatUserTyping();
                break;
            case -2027964103:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -2027964103;
                    public int msg_id;
                    public TLRPC$Peer peer;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.msg_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.peer.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.msg_id);
                    }
                };
                break;
            case -1937192669:
                tLRPC$Update = new TLRPC$TL_updateChannelUserTyping();
                break;
            case -1906403213:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -1906403213;
                    public ArrayList<TLRPC$TL_dcOption> dc_options = new ArrayList<>();

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$TL_dcOption TLdeserialize = TLRPC$TL_dcOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize != null) {
                                    this.dc_options.add(TLdeserialize);
                                } else {
                                    return;
                                }
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.dc_options.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.dc_options.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1870238482:
                tLRPC$Update = new TLRPC$TL_updateDeleteScheduledMessages();
                break;
            case -1842450928:
                tLRPC$Update = new TLRPC$TL_updateReadChannelInbox();
                break;
            case -1821035490:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -1821035490;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1738720581:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -1738720581;
                    public long actor_id;
                    public long channel_id;
                    public int date;
                    public int flags;
                    public TLRPC$ExportedChatInvite invite;
                    public TLRPC$ChannelParticipant new_participant;
                    public TLRPC$ChannelParticipant prev_participant;
                    public int qts;
                    public long user_id;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.channel_id = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.actor_id = abstractSerializedData2.readInt64(z2);
                        this.user_id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 1) != 0) {
                            this.prev_participant = TLRPC$ChannelParticipant.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.new_participant = TLRPC$ChannelParticipant.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.qts = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt64(this.channel_id);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt64(this.actor_id);
                        abstractSerializedData2.writeInt64(this.user_id);
                        if ((this.flags & 1) != 0) {
                            this.prev_participant.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.new_participant.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.qts);
                    }
                };
                break;
            case -1706939360:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -1706939360;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1667805217:
                tLRPC$Update = new TLRPC$TL_updateReadHistoryInbox();
                break;
            case -1576161051:
                tLRPC$Update = new TLRPC$TL_updateDeleteMessages();
                break;
            case -1574314746:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -1574314746;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1512627963:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -1512627963;
                    public ArrayList<Integer> order = new ArrayList<>();

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 == 481674261) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                this.order.add(Integer.valueOf(abstractSerializedData2.readInt32(z2)));
                            }
                        } else if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.order.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            abstractSerializedData2.writeInt32(this.order.get(i2).intValue());
                        }
                    }
                };
                break;
            case -1425052898:
                tLRPC$Update = new TLRPC$TL_updatePhoneCall();
                break;
            case -1398708869:
                tLRPC$Update = new TLRPC$TL_updateMessagePoll();
                break;
            case -1304443240:
                tLRPC$Update = new TLRPC$TL_updateChannelAvailableMessages();
                break;
            case -1264392051:
                tLRPC$Update = new TLRPC$TL_updateEncryption();
                break;
            case -1263546448:
                tLRPC$Update = new TLRPC$TL_updatePeerLocated();
                break;
            case -1218471511:
                tLRPC$Update = new TLRPC$TL_updateReadChannelOutbox();
                break;
            case -1147422299:
                tLRPC$Update = new TLRPC$TL_updatePeerHistoryTTL();
                break;
            case -1094555409:
                tLRPC$Update = new TLRPC$TL_updateNotifySettings();
                break;
            case -1071741569:
                tLRPC$Update = new TLRPC$TL_updateUserTyping();
                break;
            case -1020437742:
                tLRPC$Update = new TLRPC$TL_updateDeleteChannelMessages();
                break;
            case -1007549728:
                tLRPC$Update = new TLRPC$TL_updateUserName();
                break;
            case -761649164:
                tLRPC$Update = new TLRPC$TL_updateChannelMessageForwards();
                break;
            case -693004986:
                tLRPC$Update = new TLRPC$TL_updateReadChannelDiscussionInbox();
                break;
            case -674602590:
                tLRPC$Update = new TLRPC$TL_updateChatParticipantAdmin();
                break;
            case -513517117:
                tLRPC$Update = new TLRPC$TL_updateDialogUnreadMark();
                break;
            case -483443337:
                tLRPC$Update = new TLRPC$TL_updateChatParticipantDelete();
                break;
            case -469536605:
                tLRPC$Update = new TLRPC$TL_updateEditMessage();
                break;
            case -451831443:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = -451831443;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -440534818:
                tLRPC$Update = new TLRPC$TL_updateUserStatus();
                break;
            case -337352679:
                tLRPC$Update = new TLRPC$TL_updateServiceNotification();
                break;
            case -309990731:
                tLRPC$Update = new TLRPC$TL_updatePinnedMessages();
                break;
            case -299124375:
                tLRPC$Update = new TLRPC$TL_updateDraftMessage();
                break;
            case -298113238:
                tLRPC$Update = new TLRPC$TL_updatePrivacy();
                break;
            case -232346616:
                tLRPC$Update = new TLRPC$TL_updateChannelMessageViews();
                break;
            case -232290676:
                tLRPC$Update = new TLRPC$TL_updateUserPhoto();
                break;
            case -219423922:
                tLRPC$Update = new TLRPC$TL_updateGroupCallParticipants();
                break;
            case -124097970:
                tLRPC$Update = new TLRPC$TL_updateChat();
                break;
            case -99664734:
                tLRPC$Update = new TLRPC$TL_updatePinnedDialogs();
                break;
            case 88680979:
                tLRPC$Update = new TLRPC$TL_updateUserPhone();
                break;
            case 125178264:
                tLRPC$Update = new TLRPC$TL_updateChatParticipants();
                break;
            case 192428418:
                tLRPC$Update = new TLRPC$TL_updateGroupCallConnection();
                break;
            case 196268545:
                tLRPC$Update = new TLRPC$TL_updateStickerSetsOrder();
                break;
            case 277713951:
                tLRPC$Update = new TLRPC$TL_updateChannelTooLong();
                break;
            case 314359194:
                tLRPC$Update = new TLRPC$TL_updateNewEncryptedMessage();
                break;
            case 347227392:
                tLRPC$Update = new TLRPC$TL_updateGroupCall();
                break;
            case 347625491:
                tLRPC$Update = new TLRPC$TL_updateBotMenuButton();
                break;
            case 357013699:
                tLRPC$Update = new TLRPC$TL_updateMessageReactions();
                break;
            case 361936797:
                tLRPC$Update = new TLRPC$TL_updateWebViewResultSent();
                break;
            case 386986326:
                tLRPC$Update = new TLRPC$TL_updateEncryptedChatTyping();
                break;
            case 397910539:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 397910539;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 422972864:
                tLRPC$Update = new TLRPC$TL_updateFolderPeers();
                break;
            case 457133559:
                tLRPC$Update = new TLRPC$TL_updateEditChannelMessage();
                break;
            case 522914557:
                tLRPC$Update = new TLRPC$TL_updateNewMessage();
                break;
            case 610945826:
                tLRPC$Update = new TLRPC$TL_updatePeerBlocked();
                break;
            case 643940105:
                tLRPC$Update = new TLRPC$TL_updatePhoneCallSignalingData();
                break;
            case 654302845:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 654302845;
                    public TLRPC$TL_dialogFilter filter;
                    public int flags;
                    public int id;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.filter = TLRPC$TL_dialogFilter.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt32(this.id);
                        if ((this.flags & 1) != 0) {
                            this.filter.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 791390623:
                tLRPC$Update = new TLRPC$TL_updateChannelWebPage();
                break;
            case 791617983:
                tLRPC$Update = new TLRPC$TL_updateReadHistoryOutbox();
                break;
            case 889491791:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 889491791;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 956179895:
                tLRPC$Update = new TLRPC$TL_updateEncryptedMessagesRead();
                break;
            case 967122427:
                tLRPC$Update = new TLRPC$TL_updateNewScheduledMessage();
                break;
            case 1037718609:
                tLRPC$Update = new TLRPC$TL_updateChatParticipantAdd();
                break;
            case 1135492588:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 1135492588;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1153291573:
                tLRPC$Update = new TLRPC$TL_updateChannelReadMessagesContents();
                break;
            case 1180041828:
                tLRPC$Update = new TLRPC$TL_updateLangPackTooLong();
                break;
            case 1299263278:
                tLRPC$Update = new TLRPC$TL_updateBotCommands();
                break;
            case 1318109142:
                tLRPC$Update = new TLRPC$TL_updateMessageID();
                break;
            case 1421875280:
                tLRPC$Update = new TLRPC$TL_updateChatDefaultBannedRights();
                break;
            case 1442983757:
                tLRPC$Update = new TLRPC$TL_updateLangPack();
                break;
            case 1448076945:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 1448076945;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1461528386:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 1461528386;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1538885128:
                tLRPC$Update = new TLRPC$TL_updatePinnedChannelMessages();
                break;
            case 1656358105:
                tLRPC$Update = new TLRPC$TL_updateNewChannelMessage();
                break;
            case 1666927625:
                tLRPC$Update = new TLRPC$TL_updateChannel();
                break;
            case 1753886890:
                tLRPC$Update = new TLRPC$TL_updateNewStickerSet();
                break;
            case 1757493555:
                tLRPC$Update = new TLRPC$TL_updateReadMessagesContents();
                break;
            case 1767677564:
                tLRPC$Update = new TLRPC$TL_updateReadChannelDiscussionOutbox();
                break;
            case 1786671974:
                tLRPC$Update = new TLRPC$TL_updatePeerSettings();
                break;
            case 1852826908:
                tLRPC$Update = new TLRPC$TL_updateDialogPinned();
                break;
            case 1885586395:
                tLRPC$Update = new TLRPC$TL_updatePendingJoinRequests();
                break;
            case 1887741886:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 1887741886;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1960361625:
                tLRPC$Update = new TLRPC$Update() {
                    public static int constructor = 1960361625;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 2139689491:
                tLRPC$Update = new TLRPC$TL_updateWebPage();
                break;
            default:
                tLRPC$Update = null;
                break;
        }
        if (tLRPC$Update != null || !z) {
            if (tLRPC$Update != null) {
                tLRPC$Update.readParams(abstractSerializedData, z);
            }
            return tLRPC$Update;
        }
        throw new RuntimeException(String.format("can't parse magic %x in Update", Integer.valueOf(i)));
    }
}
