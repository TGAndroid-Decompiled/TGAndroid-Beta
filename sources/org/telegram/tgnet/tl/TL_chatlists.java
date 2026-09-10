package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.p;
public class TL_chatlists {

    public static class TL_chatlists_chatlistInvite extends chatlist_ChatlistInvite {
        public static final int constructor = -250687953;
        public String emoticon;
        public int flags;
        public boolean title_noanimate;
        public TLRPC.TL_textWithEntities title = new TLRPC.TL_textWithEntities();
        public ArrayList<TLRPC.Peer> peers = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.title_noanimate = TLObject.hasFlag(readInt32, 2);
            this.title = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if ((this.flags & 1) > 0) {
                this.emoticon = inputSerializedData.readString(z10);
            }
            this.peers = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(26), z10);
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(-250687953);
            if (this.title_noanimate) {
                i10 = this.flags | 2;
            } else {
                i10 = this.flags & (-3);
            }
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
            this.title.serializeToStream(outputSerializedData);
            if ((this.flags & 1) > 0) {
                outputSerializedData.writeString(this.emoticon);
            }
            Vector.serialize(outputSerializedData, this.peers);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_chatlists_chatlistInviteAlready extends chatlist_ChatlistInvite {
        public static final int constructor = -91752871;
        public int filter_id;
        public ArrayList<TLRPC.Peer> missing_peers = new ArrayList<>();
        public ArrayList<TLRPC.Peer> already_peers = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.filter_id = inputSerializedData.readInt32(z10);
            this.missing_peers = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(26), z10);
            this.already_peers = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(26), z10);
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-91752871);
            outputSerializedData.writeInt32(this.filter_id);
            Vector.serialize(outputSerializedData, this.missing_peers);
            Vector.serialize(outputSerializedData, this.already_peers);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_chatlists_chatlistInvite_layer195 extends TL_chatlists_chatlistInvite {
        public static final int constructor = 500007837;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            this.title = tL_textWithEntities;
            tL_textWithEntities.text = inputSerializedData.readString(z10);
            if ((this.flags & 1) > 0) {
                this.emoticon = inputSerializedData.readString(z10);
            }
            this.peers = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(26), z10);
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(500007837);
            outputSerializedData.writeInt32(this.flags);
            this.title.serializeToStream(outputSerializedData);
            if ((this.flags & 1) > 0) {
                outputSerializedData.writeString(this.emoticon);
            }
            Vector.serialize(outputSerializedData, this.peers);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_chatlists_chatlistUpdates extends TLObject {
        public static final int constructor = -1816295539;
        public ArrayList<TLRPC.Peer> missing_peers = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_chatlists_chatlistUpdates TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
            if (-1816295539 != i10) {
                tL_chatlists_chatlistUpdates = null;
            } else {
                tL_chatlists_chatlistUpdates = new TL_chatlists_chatlistUpdates();
            }
            return (TL_chatlists_chatlistUpdates) TLObject.TLdeserialize(TL_chatlists_chatlistUpdates.class, tL_chatlists_chatlistUpdates, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.missing_peers = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(26), z10);
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1816295539);
            Vector.serialize(outputSerializedData, this.missing_peers);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_chatlists_checkChatlistInvite extends TLObject {
        public static final int constructor = 1103171583;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return chatlist_ChatlistInvite.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1103171583);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class TL_chatlists_deleteExportedInvite extends TLObject {
        public static final int constructor = 1906072670;
        public TL_inputChatlistDialogFilter chatlist;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1906072670);
            this.chatlist.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class TL_chatlists_editExportedInvite extends TLObject {
        public static final int constructor = 1698543165;
        public TL_inputChatlistDialogFilter chatlist;
        public int flags;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();
        public boolean revoked;
        public String slug;
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_exportedChatlistInvite.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1698543165);
            int flag = TLObject.setFlag(this.flags, 1, this.revoked);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.chatlist.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.slug);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.peers);
            }
        }
    }

    public static class TL_chatlists_exportChatlistInvite extends TLObject {
        public static final int constructor = -2072885362;
        public TL_inputChatlistDialogFilter chatlist;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_chatlists_exportedChatlistInvite.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2072885362);
            this.chatlist.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.title);
            Vector.serialize(outputSerializedData, this.peers);
        }
    }

    public static class TL_chatlists_exportedChatlistInvite extends TLObject {
        public static final int constructor = 283567014;
        public TLRPC.DialogFilter filter;
        public TL_exportedChatlistInvite invite;

        public static TL_chatlists_exportedChatlistInvite TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite;
            if (283567014 != i10) {
                tL_chatlists_exportedChatlistInvite = null;
            } else {
                tL_chatlists_exportedChatlistInvite = new TL_chatlists_exportedChatlistInvite();
            }
            return (TL_chatlists_exportedChatlistInvite) TLObject.TLdeserialize(TL_chatlists_exportedChatlistInvite.class, tL_chatlists_exportedChatlistInvite, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.filter = TLRPC.DialogFilter.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.invite = TL_exportedChatlistInvite.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(283567014);
            this.filter.serializeToStream(outputSerializedData);
            this.invite.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_chatlists_exportedInvites extends TLObject {
        public static final int constructor = 279670215;
        public ArrayList<TL_exportedChatlistInvite> invites = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_chatlists_exportedInvites TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_chatlists_exportedInvites tL_chatlists_exportedInvites;
            if (279670215 != i10) {
                tL_chatlists_exportedInvites = null;
            } else {
                tL_chatlists_exportedInvites = new TL_chatlists_exportedInvites();
            }
            return (TL_chatlists_exportedInvites) TLObject.TLdeserialize(TL_chatlists_exportedInvites.class, tL_chatlists_exportedInvites, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.invites = Vector.deserialize(inputSerializedData, new c(20), z10);
            this.chats = Vector.deserialize(inputSerializedData, new p(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new p(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(279670215);
            Vector.serialize(outputSerializedData, this.invites);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_chatlists_getChatlistUpdates extends TLObject {
        public static final int constructor = -1992190687;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_chatlists_chatlistUpdates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1992190687);
            this.chatlist.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_chatlists_getExportedInvites extends TLObject {
        public static final int constructor = -838608253;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_chatlists_exportedInvites.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-838608253);
            this.chatlist.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_chatlists_getLeaveChatlistSuggestions extends TLObject {
        public static final int constructor = -37955820;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new org.telegram.messenger.b(26));
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-37955820);
            this.chatlist.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_chatlists_hideChatlistUpdates extends TLObject {
        public static final int constructor = 1726252795;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1726252795);
            this.chatlist.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_chatlists_joinChatlistInvite extends TLObject {
        public static final int constructor = -1498291302;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1498291302);
            outputSerializedData.writeString(this.slug);
            Vector.serialize(outputSerializedData, this.peers);
        }
    }

    public static class TL_chatlists_joinChatlistUpdates extends TLObject {
        public static final int constructor = -527828747;
        public TL_inputChatlistDialogFilter chatlist;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-527828747);
            this.chatlist.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.peers);
        }
    }

    public static class TL_chatlists_leaveChatlist extends TLObject {
        public static final int constructor = 1962598714;
        public TL_inputChatlistDialogFilter chatlist;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1962598714);
            this.chatlist.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.peers);
        }
    }

    public static class TL_exportedChatlistInvite extends TLObject {
        public static final int constructor = 206668204;
        public int flags;
        public ArrayList<TLRPC.Peer> peers = new ArrayList<>();
        public boolean revoked;
        public String title;
        public String url;

        public static TL_exportedChatlistInvite TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_exportedChatlistInvite tL_exportedChatlistInvite;
            if (206668204 != i10) {
                tL_exportedChatlistInvite = null;
            } else {
                tL_exportedChatlistInvite = new TL_exportedChatlistInvite();
            }
            return (TL_exportedChatlistInvite) TLObject.TLdeserialize(TL_exportedChatlistInvite.class, tL_exportedChatlistInvite, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.revoked = TLObject.hasFlag(readInt32, 1);
            this.title = inputSerializedData.readString(z10);
            this.url = inputSerializedData.readString(z10);
            this.peers = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(26), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(206668204);
            if (this.revoked) {
                i10 = this.flags | 1;
            } else {
                i10 = this.flags & (-2);
            }
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.url);
            Vector.serialize(outputSerializedData, this.peers);
        }
    }

    public static class TL_inputChatlistDialogFilter extends TLObject {
        public static final int constructor = -203367885;
        public int filter_id;

        public static TL_inputChatlistDialogFilter TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter;
            if (-203367885 != i10) {
                tL_inputChatlistDialogFilter = null;
            } else {
                tL_inputChatlistDialogFilter = new TL_inputChatlistDialogFilter();
            }
            return (TL_inputChatlistDialogFilter) TLObject.TLdeserialize(TL_inputChatlistDialogFilter.class, tL_inputChatlistDialogFilter, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.filter_id = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-203367885);
            outputSerializedData.writeInt32(this.filter_id);
        }
    }

    public static abstract class chatlist_ChatlistInvite extends TLObject {
        public static chatlist_ChatlistInvite TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_chatlists_chatlistInvite;
            if (i10 != -250687953) {
                if (i10 != -91752871) {
                    if (i10 != 500007837) {
                        tL_chatlists_chatlistInvite = null;
                    } else {
                        tL_chatlists_chatlistInvite = new TL_chatlists_chatlistInvite_layer195();
                    }
                } else {
                    tL_chatlists_chatlistInvite = new TL_chatlists_chatlistInviteAlready();
                }
            } else {
                tL_chatlists_chatlistInvite = new TL_chatlists_chatlistInvite();
            }
            return (chatlist_ChatlistInvite) TLObject.TLdeserialize(chatlist_ChatlistInvite.class, tL_chatlists_chatlistInvite, inputSerializedData, i10, z10);
        }
    }
}
