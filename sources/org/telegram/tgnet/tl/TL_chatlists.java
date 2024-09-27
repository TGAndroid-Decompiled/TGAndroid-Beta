package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public class TL_chatlists {

    public static class TL_chatlists_chatlistInvite extends chatlist_ChatlistInvite {
        public static final int constructor = 500007837;
        public String emoticon;
        public int flags;
        public String title;
        public ArrayList<TLRPC.Peer> peers = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.flags = abstractSerializedData.readInt32(z);
            this.title = abstractSerializedData.readString(z);
            if ((this.flags & 1) > 0) {
                this.emoticon = abstractSerializedData.readString(z);
            }
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC.Peer TLdeserialize = TLRPC.Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.peers.add(TLdeserialize);
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.chats.add(TLdeserialize2);
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            if (readInt325 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                }
                return;
            }
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i3 = 0; i3 < readInt326; i3++) {
                TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize3 == null) {
                    return;
                }
                this.users.add(TLdeserialize3);
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(500007837);
            abstractSerializedData.writeInt32(this.flags);
            abstractSerializedData.writeString(this.title);
            if ((this.flags & 1) > 0) {
                abstractSerializedData.writeString(this.emoticon);
            }
            abstractSerializedData.writeInt32(481674261);
            int size = this.peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.peers.get(i).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.chats.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.chats.get(i2).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size3 = this.users.size();
            abstractSerializedData.writeInt32(size3);
            for (int i3 = 0; i3 < size3; i3++) {
                this.users.get(i3).serializeToStream(abstractSerializedData);
            }
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
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.filter_id = abstractSerializedData.readInt32(z);
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC.Peer TLdeserialize = TLRPC.Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.missing_peers.add(TLdeserialize);
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                TLRPC.Peer TLdeserialize2 = TLRPC.Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.already_peers.add(TLdeserialize2);
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            if (readInt325 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                }
                return;
            }
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i3 = 0; i3 < readInt326; i3++) {
                TLRPC.Chat TLdeserialize3 = TLRPC.Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize3 == null) {
                    return;
                }
                this.chats.add(TLdeserialize3);
            }
            int readInt327 = abstractSerializedData.readInt32(z);
            if (readInt327 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt327)));
                }
                return;
            }
            int readInt328 = abstractSerializedData.readInt32(z);
            for (int i4 = 0; i4 < readInt328; i4++) {
                TLRPC.User TLdeserialize4 = TLRPC.User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize4 == null) {
                    return;
                }
                this.users.add(TLdeserialize4);
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-91752871);
            abstractSerializedData.writeInt32(this.filter_id);
            abstractSerializedData.writeInt32(481674261);
            int size = this.missing_peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.missing_peers.get(i).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.chats.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.chats.get(i2).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size3 = this.users.size();
            abstractSerializedData.writeInt32(size3);
            for (int i3 = 0; i3 < size3; i3++) {
                this.users.get(i3).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_chatlists_chatlistUpdates extends TLObject {
        public static final int constructor = -1816295539;
        public ArrayList<TLRPC.Peer> missing_peers = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_chatlists_chatlistUpdates TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (-1816295539 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_chatlists_chatlistUpdates", Integer.valueOf(i)));
                }
                return null;
            }
            TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = new TL_chatlists_chatlistUpdates();
            tL_chatlists_chatlistUpdates.readParams(abstractSerializedData, z);
            return tL_chatlists_chatlistUpdates;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC.Peer TLdeserialize = TLRPC.Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.missing_peers.add(TLdeserialize);
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.chats.add(TLdeserialize2);
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            if (readInt325 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                }
                return;
            }
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i3 = 0; i3 < readInt326; i3++) {
                TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize3 == null) {
                    return;
                }
                this.users.add(TLdeserialize3);
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1816295539);
            abstractSerializedData.writeInt32(481674261);
            int size = this.missing_peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.missing_peers.get(i).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.chats.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.chats.get(i2).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size3 = this.users.size();
            abstractSerializedData.writeInt32(size3);
            for (int i3 = 0; i3 < size3; i3++) {
                this.users.get(i3).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_chatlists_checkChatlistInvite extends TLObject {
        public static final int constructor = 1103171583;
        public String slug;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return chatlist_ChatlistInvite.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1103171583);
            abstractSerializedData.writeString(this.slug);
        }
    }

    public static class TL_chatlists_deleteExportedInvite extends TLObject {
        public static final int constructor = 1906072670;
        public TL_inputChatlistDialogFilter chatlist;
        public String slug;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1906072670);
            this.chatlist.serializeToStream(abstractSerializedData);
            abstractSerializedData.writeString(this.slug);
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
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TL_exportedChatlistInvite.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1698543165);
            int i = this.revoked ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            abstractSerializedData.writeInt32(i);
            this.chatlist.serializeToStream(abstractSerializedData);
            abstractSerializedData.writeString(this.slug);
            if ((this.flags & 2) != 0) {
                abstractSerializedData.writeString(this.title);
            }
            if ((this.flags & 4) != 0) {
                abstractSerializedData.writeInt32(481674261);
                int size = this.peers.size();
                abstractSerializedData.writeInt32(size);
                for (int i2 = 0; i2 < size; i2++) {
                    this.peers.get(i2).serializeToStream(abstractSerializedData);
                }
            }
        }
    }

    public static class TL_chatlists_exportChatlistInvite extends TLObject {
        public static final int constructor = -2072885362;
        public TL_inputChatlistDialogFilter chatlist;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();
        public String title;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TL_chatlists_exportedChatlistInvite.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-2072885362);
            this.chatlist.serializeToStream(abstractSerializedData);
            abstractSerializedData.writeString(this.title);
            abstractSerializedData.writeInt32(481674261);
            int size = this.peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.peers.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_chatlists_exportedChatlistInvite extends TLObject {
        public static final int constructor = 283567014;
        public TLRPC.DialogFilter filter;
        public TL_exportedChatlistInvite invite;

        public static TL_chatlists_exportedChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (283567014 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_chatlists_exportedChatlistInvite", Integer.valueOf(i)));
                }
                return null;
            }
            TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = new TL_chatlists_exportedChatlistInvite();
            tL_chatlists_exportedChatlistInvite.readParams(abstractSerializedData, z);
            return tL_chatlists_exportedChatlistInvite;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.filter = TLRPC.DialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            this.invite = TL_exportedChatlistInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(283567014);
            this.filter.serializeToStream(abstractSerializedData);
            this.invite.serializeToStream(abstractSerializedData);
        }
    }

    public static class TL_chatlists_exportedInvites extends TLObject {
        public static final int constructor = 279670215;
        public ArrayList<TL_exportedChatlistInvite> invites = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_chatlists_exportedInvites TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (279670215 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_chatlists_exportedInvites", Integer.valueOf(i)));
                }
                return null;
            }
            TL_chatlists_exportedInvites tL_chatlists_exportedInvites = new TL_chatlists_exportedInvites();
            tL_chatlists_exportedInvites.readParams(abstractSerializedData, z);
            return tL_chatlists_exportedInvites;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TL_exportedChatlistInvite TLdeserialize = TL_exportedChatlistInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.invites.add(TLdeserialize);
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.chats.add(TLdeserialize2);
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            if (readInt325 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                }
                return;
            }
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i3 = 0; i3 < readInt326; i3++) {
                TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize3 == null) {
                    return;
                }
                this.users.add(TLdeserialize3);
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(279670215);
            abstractSerializedData.writeInt32(481674261);
            int size = this.invites.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.invites.get(i).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.chats.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.chats.get(i2).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(481674261);
            int size3 = this.users.size();
            abstractSerializedData.writeInt32(size3);
            for (int i3 = 0; i3 < size3; i3++) {
                this.users.get(i3).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_chatlists_getChatlistUpdates extends TLObject {
        public static final int constructor = -1992190687;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TL_chatlists_chatlistUpdates.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1992190687);
            this.chatlist.serializeToStream(abstractSerializedData);
        }
    }

    public static class TL_chatlists_getExportedInvites extends TLObject {
        public static final int constructor = -838608253;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TL_chatlists_exportedInvites.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-838608253);
            this.chatlist.serializeToStream(abstractSerializedData);
        }
    }

    public static class TL_chatlists_getLeaveChatlistSuggestions extends TLObject {
        public static final int constructor = -37955820;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            TLRPC.Vector vector = new TLRPC.Vector();
            int readInt32 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt32; i2++) {
                TLRPC.Peer TLdeserialize = TLRPC.Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return vector;
                }
                vector.objects.add(TLdeserialize);
            }
            return vector;
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-37955820);
            this.chatlist.serializeToStream(abstractSerializedData);
        }
    }

    public static class TL_chatlists_hideChatlistUpdates extends TLObject {
        public static final int constructor = 1726252795;
        public TL_inputChatlistDialogFilter chatlist;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1726252795);
            this.chatlist.serializeToStream(abstractSerializedData);
        }
    }

    public static class TL_chatlists_joinChatlistInvite extends TLObject {
        public static final int constructor = -1498291302;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();
        public String slug;

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1498291302);
            abstractSerializedData.writeString(this.slug);
            abstractSerializedData.writeInt32(481674261);
            int size = this.peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.peers.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_chatlists_joinChatlistUpdates extends TLObject {
        public static final int constructor = -527828747;
        public TL_inputChatlistDialogFilter chatlist;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-527828747);
            this.chatlist.serializeToStream(abstractSerializedData);
            abstractSerializedData.writeInt32(481674261);
            int size = this.peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.peers.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_chatlists_leaveChatlist extends TLObject {
        public static final int constructor = 1962598714;
        public TL_inputChatlistDialogFilter chatlist;
        public ArrayList<TLRPC.InputPeer> peers = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(abstractSerializedData, i, z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1962598714);
            this.chatlist.serializeToStream(abstractSerializedData);
            abstractSerializedData.writeInt32(481674261);
            int size = this.peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.peers.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_exportedChatlistInvite extends TLObject {
        public static final int constructor = 206668204;
        public int flags;
        public ArrayList<TLRPC.Peer> peers = new ArrayList<>();
        public boolean revoked;
        public String title;
        public String url;

        public static TL_exportedChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (206668204 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_exportedChatlistInvite", Integer.valueOf(i)));
                }
                return null;
            }
            TL_exportedChatlistInvite tL_exportedChatlistInvite = new TL_exportedChatlistInvite();
            tL_exportedChatlistInvite.readParams(abstractSerializedData, z);
            return tL_exportedChatlistInvite;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            this.flags = readInt32;
            this.revoked = (readInt32 & 1) != 0;
            this.title = abstractSerializedData.readString(z);
            this.url = abstractSerializedData.readString(z);
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC.Peer TLdeserialize = TLRPC.Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.peers.add(TLdeserialize);
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(206668204);
            int i = this.revoked ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            abstractSerializedData.writeInt32(i);
            abstractSerializedData.writeString(this.title);
            abstractSerializedData.writeString(this.url);
            abstractSerializedData.writeInt32(481674261);
            int size = this.peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.peers.get(i2).serializeToStream(abstractSerializedData);
            }
        }
    }

    public static class TL_inputChatlistDialogFilter extends TLObject {
        public static final int constructor = -203367885;
        public int filter_id;

        public static TL_inputChatlistDialogFilter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (-203367885 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_inputChatlistDialogFilter", Integer.valueOf(i)));
                }
                return null;
            }
            TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_inputChatlistDialogFilter();
            tL_inputChatlistDialogFilter.readParams(abstractSerializedData, z);
            return tL_inputChatlistDialogFilter;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.filter_id = abstractSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-203367885);
            abstractSerializedData.writeInt32(this.filter_id);
        }
    }

    public static abstract class chatlist_ChatlistInvite extends TLObject {
        public static chatlist_ChatlistInvite TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            chatlist_ChatlistInvite tL_chatlists_chatlistInvite = i != -91752871 ? i != 500007837 ? null : new TL_chatlists_chatlistInvite() : new TL_chatlists_chatlistInviteAlready();
            if (tL_chatlists_chatlistInvite == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in chatlist_ChatlistInvite", Integer.valueOf(i)));
            }
            if (tL_chatlists_chatlistInvite != null) {
                tL_chatlists_chatlistInvite.readParams(abstractSerializedData, z);
            }
            return tL_chatlists_chatlistInvite;
        }
    }
}
