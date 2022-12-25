package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$Update extends TLObject {
    public static TLRPC$Update TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Update tLRPC$TL_updateTheme;
        switch (i) {
            case -2112423005:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateTheme();
                break;
            case -2092401936:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChatUserTyping();
                break;
            case -2030252155:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateMoveStickerSetToTop();
                break;
            case -2027964103:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
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
            case -2006880112:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -2006880112;
                    public int flags;
                    public boolean isFinal;
                    public String text;
                    public long transcription_id;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.isFinal = (readInt32 & 1) != 0;
                        this.transcription_id = abstractSerializedData2.readInt64(z2);
                        this.text = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.isFinal ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.transcription_id);
                        abstractSerializedData2.writeString(this.text);
                    }
                };
                break;
            case -1937192669:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelUserTyping();
                break;
            case -1906403213:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -1906403213;
                    public ArrayList<TLRPC$TL_dcOption> dc_options = new ArrayList<>();

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$TL_dcOption TLdeserialize = TLRPC$TL_dcOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.dc_options.add(TLdeserialize);
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
                tLRPC$TL_updateTheme = new TLRPC$TL_updateDeleteScheduledMessages();
                break;
            case -1842450928:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateReadChannelInbox();
                break;
            case -1821035490:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -1821035490;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1738720581:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
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
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -1706939360;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1667805217:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateReadHistoryInbox();
                break;
            case -1576161051:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateDeleteMessages();
                break;
            case -1574314746:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -1574314746;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1512627963:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -1512627963;
                    public ArrayList<Integer> order = new ArrayList<>();

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            this.order.add(Integer.valueOf(abstractSerializedData2.readInt32(z2)));
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
            case -1484486364:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateUserName();
                break;
            case -1425052898:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePhoneCall();
                break;
            case -1398708869:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateMessagePoll();
                break;
            case -1304443240:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelAvailableMessages();
                break;
            case -1264392051:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateEncryption();
                break;
            case -1263546448:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePeerLocated();
                break;
            case -1218471511:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateReadChannelOutbox();
                break;
            case -1147422299:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePeerHistoryTTL();
                break;
            case -1094555409:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateNotifySettings();
                break;
            case -1071741569:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateUserTyping();
                break;
            case -1020437742:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateDeleteChannelMessages();
                break;
            case -761649164:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelMessageForwards();
                break;
            case -693004986:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateReadChannelDiscussionInbox();
                break;
            case -674602590:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChatParticipantAdmin();
                break;
            case -513517117:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateDialogUnreadMark();
                break;
            case -483443337:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChatParticipantDelete();
                break;
            case -469536605:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateEditMessage();
                break;
            case -451831443:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -451831443;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -440534818:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateUserStatus();
                break;
            case -366410403:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelReadMessagesContents();
                break;
            case -337352679:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateServiceNotification();
                break;
            case -309990731:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePinnedMessages();
                break;
            case -298113238:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePrivacy();
                break;
            case -232346616:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelMessageViews();
                break;
            case -232290676:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateUserPhoto();
                break;
            case -219423922:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateGroupCallParticipants();
                break;
            case -124097970:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChat();
                break;
            case -99664734:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePinnedDialogs();
                break;
            case -78886548:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = -78886548;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -31881726:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelPinnedTopics();
                break;
            case 8703322:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateTranscribedAudio();
                break;
            case 88680979:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateUserPhone();
                break;
            case 125178264:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChatParticipants();
                break;
            case 192428418:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateGroupCallConnection();
                break;
            case 196268545:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateStickerSetsOrder();
                break;
            case 277713951:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelTooLong();
                break;
            case 314359194:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateNewEncryptedMessage();
                break;
            case 347227392:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateGroupCall();
                break;
            case 347625491:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateBotMenuButton();
                break;
            case 361936797:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateWebViewResultSent();
                break;
            case 386986326:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateEncryptedChatTyping();
                break;
            case 397910539:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 397910539;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 422509539:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelPinnedTopic();
                break;
            case 422972864:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateFolderPeers();
                break;
            case 457133559:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateEditChannelMessage();
                break;
            case 457829485:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateDraftMessage();
                break;
            case 522914557:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateNewMessage();
                break;
            case 542282808:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateUser();
                break;
            case 610945826:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePeerBlocked();
                break;
            case 643940105:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePhoneCallSignalingData();
                break;
            case 654302845:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 654302845;
                    public TLRPC$DialogFilter filter;
                    public int flags;
                    public int f989id;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.f989id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.filter = TLRPC$DialogFilter.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt32(this.f989id);
                        if ((this.flags & 1) != 0) {
                            this.filter.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 674706841:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateUserEmojiStatus();
                break;
            case 791390623:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannelWebPage();
                break;
            case 791617983:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateReadHistoryOutbox();
                break;
            case 821314523:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 821314523;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 834816008:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 834816008;
                    public boolean emojis;
                    public int flags;
                    public boolean masks;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.masks = (readInt32 & 1) != 0;
                        this.emojis = (readInt32 & 2) != 0;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.masks ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.emojis ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                    }
                };
                break;
            case 889491791:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 889491791;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 956179895:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateEncryptedMessagesRead();
                break;
            case 967122427:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateNewScheduledMessage();
                break;
            case 1037718609:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChatParticipantAdd();
                break;
            case 1180041828:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateLangPackTooLong();
                break;
            case 1299263278:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateBotCommands();
                break;
            case 1318109142:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateMessageID();
                break;
            case 1421875280:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChatDefaultBannedRights();
                break;
            case 1442983757:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateLangPack();
                break;
            case 1448076945:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 1448076945;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1461528386:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 1461528386;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1517529484:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateMessageExtendedMedia();
                break;
            case 1538885128:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePinnedChannelMessages();
                break;
            case 1578843320:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateMessageReactions();
                break;
            case 1656358105:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateNewChannelMessage();
                break;
            case 1666927625:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateChannel();
                break;
            case 1753886890:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateNewStickerSet();
                break;
            case 1757493555:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateReadMessagesContents();
                break;
            case 1767677564:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateReadChannelDiscussionOutbox();
                break;
            case 1786671974:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePeerSettings();
                break;
            case 1852826908:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateDialogPinned();
                break;
            case 1870160884:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 1870160884;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1885586395:
                tLRPC$TL_updateTheme = new TLRPC$TL_updatePendingJoinRequests();
                break;
            case 1887741886:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 1887741886;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1960361625:
                tLRPC$TL_updateTheme = new TLRPC$Update() {
                    public static int constructor = 1960361625;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 2139689491:
                tLRPC$TL_updateTheme = new TLRPC$TL_updateWebPage();
                break;
            default:
                tLRPC$TL_updateTheme = null;
                break;
        }
        if (tLRPC$TL_updateTheme == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Update", Integer.valueOf(i)));
        }
        if (tLRPC$TL_updateTheme != null) {
            tLRPC$TL_updateTheme.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_updateTheme;
    }
}
