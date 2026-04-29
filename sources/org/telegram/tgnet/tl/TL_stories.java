package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda111;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1;
import org.telegram.tgnet.TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1;
import org.telegram.tgnet.TLRPC$TL_messageReactions$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.Vector$$ExternalSyntheticLambda3;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public class TL_stories {

    public static class TL_stories_storyViews extends TLObject {
        public static final int constructor = -560009955;
        public ArrayList<StoryViews> views = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_stories_storyViews TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_stories_storyViews) TLObject.TLdeserialize(TL_stories_storyViews.class, -560009955 != i ? null : new TL_stories_storyViews(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.views = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stories.StoryViews.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-560009955);
            Vector.serialize(outputSerializedData, this.views);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class StoryView extends TLObject {
        public boolean blocked;
        public boolean blocked_my_stories_from;
        public int date;
        public int flags;
        public TLRPC.Message message;
        public TLRPC.Peer peer_id;
        public TLRPC.Reaction reaction;
        public StoryItem story;
        public long user_id;

        public static StoryView TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_storyViewPublicForward;
            if (i == -1870436597) {
                tL_storyViewPublicForward = new TL_storyViewPublicForward();
            } else if (i == -1329730875) {
                tL_storyViewPublicForward = new TL_storyView();
            } else {
                tL_storyViewPublicForward = i != -1116418231 ? null : new TL_storyViewPublicRepost();
            }
            return (StoryView) TLObject.TLdeserialize(StoryView.class, tL_storyViewPublicForward, inputSerializedData, i, z);
        }
    }

    public static class TL_storyView extends StoryView {
        public static final int constructor = -1329730875;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.blocked = TLObject.hasFlag(int32, 1);
            this.blocked_my_stories_from = TLObject.hasFlag(this.flags, 2);
            this.user_id = inputSerializedData.readInt64(z);
            this.date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1329730875);
            int flag = TLObject.setFlag(this.flags, 1, this.blocked);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.blocked_my_stories_from);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.reaction.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyViewPublicForward extends StoryView {
        public static final int constructor = -1870436597;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.blocked = TLObject.hasFlag(int32, 1);
            this.blocked_my_stories_from = TLObject.hasFlag(this.flags, 2);
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1870436597);
            int flag = TLObject.setFlag(this.flags, 1, this.blocked);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.blocked_my_stories_from);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_storyViewPublicRepost extends StoryView {
        public static final int constructor = -1116418231;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.blocked = TLObject.hasFlag(int32, 1);
            this.blocked_my_stories_from = TLObject.hasFlag(this.flags, 2);
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.story = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1116418231);
            int flag = TLObject.setFlag(this.flags, 1, this.blocked);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.blocked_my_stories_from);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.peer_id.serializeToStream(outputSerializedData);
            this.story.serializeToStream(outputSerializedData);
        }
    }

    public static abstract class PeerStories extends TLObject {
        public boolean checkedExpired;
        public int flags;
        public int max_read_id;
        public TLRPC.Peer peer;
        public ArrayList<StoryItem> stories = new ArrayList<>();

        public static PeerStories TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_peerStories_layer162;
            if (i != -2045664768) {
                tL_peerStories_layer162 = i != -1707742823 ? null : new TL_peerStories();
            } else {
                tL_peerStories_layer162 = new TL_peerStories_layer162();
            }
            return (PeerStories) TLObject.TLdeserialize(PeerStories.class, tL_peerStories_layer162, inputSerializedData, i, z);
        }
    }

    public static class TL_peerStories extends PeerStories {
        public static final int constructor = -1707742823;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.max_read_id = inputSerializedData.readInt32(z);
            }
            this.stories = Vector.deserialize(inputSerializedData, new TL_stories$TL_peerStories$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1707742823);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.max_read_id);
            }
            Vector.serialize(outputSerializedData, this.stories);
        }
    }

    public static class TL_peerStories_layer162 extends TL_peerStories {
        public static final int constructor = -2045664768;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            long int64 = inputSerializedData.readInt64(z);
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.peer = tL_peerUser;
            tL_peerUser.user_id = int64;
            if (TLObject.hasFlag(this.flags, 1)) {
                this.max_read_id = inputSerializedData.readInt32(z);
            }
            this.stories = Vector.deserialize(inputSerializedData, new TL_stories$TL_peerStories$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2045664768);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.peer.user_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.max_read_id);
            }
            Vector.serialize(outputSerializedData, this.stories);
        }
    }

    public static class TL_stories_peerStories extends TLObject {
        public static final int constructor = -890861720;
        public PeerStories stories;
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_stories_peerStories TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_stories_peerStories) TLObject.TLdeserialize(TL_stories_peerStories.class, -890861720 != i ? null : new TL_stories_peerStories(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.stories = PeerStories.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-890861720);
            this.stories.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static abstract class stories_AllStories extends TLObject {
        public static stories_AllStories TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_stories_allStoriesNotModified;
            if (i == 291044926) {
                tL_stories_allStoriesNotModified = new TL_stories_allStoriesNotModified();
            } else {
                tL_stories_allStoriesNotModified = i != 1862033025 ? null : new TL_stories_allStories();
            }
            return (stories_AllStories) TLObject.TLdeserialize(stories_AllStories.class, tL_stories_allStoriesNotModified, inputSerializedData, i, z);
        }
    }

    public static class TL_stories_allStoriesNotModified extends stories_AllStories {
        public static final int constructor = 291044926;
        public int flags;
        public String state;
        public TL_storiesStealthMode stealth_mode;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.state = inputSerializedData.readString(z);
            this.stealth_mode = TL_storiesStealthMode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(291044926);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.state);
            this.stealth_mode.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stories_allStories extends stories_AllStories {
        public static final int constructor = 1862033025;
        public int count;
        public int flags;
        public boolean has_more;
        public String state;
        public TL_storiesStealthMode stealth_mode;
        public ArrayList<PeerStories> peer_stories = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.has_more = TLObject.hasFlag(int32, 1);
            this.count = inputSerializedData.readInt32(z);
            this.state = inputSerializedData.readString(z);
            this.peer_stories = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stories.PeerStories.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            this.stealth_mode = TL_storiesStealthMode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1862033025);
            int flag = TLObject.setFlag(this.flags, 1, this.has_more);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.count);
            outputSerializedData.writeString(this.state);
            Vector.serialize(outputSerializedData, this.peer_stories);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
            this.stealth_mode.serializeToStream(outputSerializedData);
        }
    }

    public static class canSendStoryCount extends TLObject {
        public static final int constructor = -1014513586;
        public int count_remains;

        public static canSendStoryCount TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (canSendStoryCount) TLObject.TLdeserialize(canSendStoryCount.class, -1014513586 != i ? null : new canSendStoryCount(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1014513586);
            outputSerializedData.writeInt32(this.count_remains);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.count_remains = inputSerializedData.readInt32(z);
        }
    }

    public static class TL_stories_canSendStory extends TLObject {
        public static final int constructor = 820732912;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return canSendStoryCount.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(820732912);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stories_sendStory extends TLObject {
        public static final int constructor = -1885443944;
        public ArrayList<Integer> albums;
        public String caption;
        public int flags;
        public TLRPC.InputPeer fwd_from_id;
        public int fwd_from_story;
        public boolean fwd_modified;
        public TLRPC.InputMedia media;
        public TLRPC.InputDocument music;
        public boolean noforwards;
        public TLRPC.InputPeer peer;
        public int period;
        public boolean pinned;
        public long random_id;
        public ArrayList<MediaArea> media_areas = new ArrayList<>();
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<TLRPC.InputPrivacyRule> privacy_rules = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1885443944);
            int flag = TLObject.setFlag(this.flags, 4, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.noforwards);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.fwd_modified);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 256, this.albums != null);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            this.peer.serializeToStream(outputSerializedData);
            this.media.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 32)) {
                Vector.serialize(outputSerializedData, this.media_areas);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            Vector.serialize(outputSerializedData, this.privacy_rules);
            outputSerializedData.writeInt64(this.random_id);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.period);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.fwd_from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt32(this.fwd_from_story);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                Vector.serializeInt(outputSerializedData, this.albums);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.music.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_stories_deleteStories extends TLObject {
        public static final int constructor = -1369842849;
        public ArrayList<Integer> id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserializeInt(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1369842849);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.id);
        }
    }

    public static class togglePinned extends TLObject {
        public static final int constructor = -1703566865;
        public ArrayList<Integer> id = new ArrayList<>();
        public TLRPC.InputPeer peer;
        public boolean pinned;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserializeInt(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1703566865);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.id);
            outputSerializedData.writeBool(this.pinned);
        }
    }

    public static class TL_stories_editStory extends TLObject {
        public static final int constructor = 744728363;
        public String caption;
        public int flags;
        public int id;
        public TLRPC.InputMedia media;
        public TLRPC.InputDocument music;
        public TLRPC.InputPeer peer;
        public ArrayList<MediaArea> media_areas = new ArrayList<>();
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<TLRPC.InputPrivacyRule> privacy_rules = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(744728363);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.media_areas);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.privacy_rules);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.music.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_stories_getAllStories extends TLObject {
        public static final int constructor = -290400731;
        public int flags;
        public boolean include_hidden;
        public boolean next;
        public String state;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return stories_AllStories.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-290400731);
            int flag = TLObject.setFlag(this.flags, 2, this.next);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.include_hidden);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.state);
            }
        }
    }

    public static class TL_stories_togglePeerStoriesHidden extends TLObject {
        public static final int constructor = -1123805756;
        public boolean hidden;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1123805756);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.hidden);
        }
    }

    public static class TL_stories_stories extends TLObject {
        public static final int constructor = 1673780490;
        public int count;
        public int flags;
        public ArrayList<StoryItem> stories = new ArrayList<>();
        public ArrayList<Integer> pinned_to_top = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_stories_stories TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_stories_stories) TLObject.TLdeserialize(TL_stories_stories.class, 1673780490 != i ? null : new TL_stories_stories(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.stories = Vector.deserialize(inputSerializedData, new TL_stories$TL_peerStories$$ExternalSyntheticLambda0(), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.pinned_to_top = Vector.deserializeInt(inputSerializedData, z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1673780490);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.stories);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serializeInt(outputSerializedData, this.pinned_to_top);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_stories_getPeerStories extends TLObject {
        public static final int constructor = 743103056;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_stories_peerStories.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(743103056);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateStory extends TLRPC.Update {
        public static final int constructor = 1974712216;
        public TLRPC.Peer peer;
        public StoryItem story;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.story = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1974712216);
            this.peer.serializeToStream(outputSerializedData);
            this.story.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stories_getPinnedStories extends TLObject {
        public static final int constructor = 1478600156;
        public int limit;
        public int offset_id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1478600156);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.offset_id);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_stories_getStoriesArchive extends TLObject {
        public static final int constructor = -1271586794;
        public int limit;
        public int offset_id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1271586794);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.offset_id);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_updateReadStories extends TLRPC.Update {
        public static final int constructor = -145845461;
        public int max_id;
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.max_id = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-145845461);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.max_id);
        }
    }

    public static class StoryViewsList extends TLObject {
        public int count;
        public int flags;
        public int forwards_count;
        public int reactions_count;
        public int views_count;
        public ArrayList<StoryView> views = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();
        public String next_offset = "";

        public static StoryViewsList TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_storyViewsList_layer167;
            if (i != 1189722604) {
                tL_storyViewsList_layer167 = i != 1507299269 ? null : new TL_storyViewsList();
            } else {
                tL_storyViewsList_layer167 = new TL_storyViewsList_layer167();
            }
            return (StoryViewsList) TLObject.TLdeserialize(StoryViewsList.class, tL_storyViewsList_layer167, inputSerializedData, i, z);
        }
    }

    public static class TL_storyViewsList extends StoryViewsList {
        public static final int constructor = 1507299269;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.views_count = inputSerializedData.readInt32(z);
            this.forwards_count = inputSerializedData.readInt32(z);
            this.reactions_count = inputSerializedData.readInt32(z);
            this.views = Vector.deserialize(inputSerializedData, new TL_stories$TL_storyViewsList$$ExternalSyntheticLambda0(), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1507299269);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            outputSerializedData.writeInt32(this.views_count);
            outputSerializedData.writeInt32(this.forwards_count);
            outputSerializedData.writeInt32(this.reactions_count);
            Vector.serialize(outputSerializedData, this.views);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
        }
    }

    public static class TL_storyViewsList_layer167 extends StoryViewsList {
        public static final int constructor = 1189722604;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.reactions_count = inputSerializedData.readInt32(z);
            this.views = Vector.deserialize(inputSerializedData, new TL_stories$TL_storyViewsList$$ExternalSyntheticLambda0(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1189722604);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            outputSerializedData.writeInt32(this.reactions_count);
            Vector.serialize(outputSerializedData, this.views);
            Vector.serialize(outputSerializedData, this.users);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
        }
    }

    public static class TL_stories_readStories extends TLObject {
        public static final int constructor = -1521034552;
        public int max_id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserializeInt(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1521034552);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.max_id);
        }
    }

    public static class TL_stories_incrementStoryViews extends TLObject {
        public static final int constructor = -1308456197;
        public ArrayList<Integer> id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1308456197);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.id);
        }
    }

    public static class TL_stories_getStoryViewsList extends TLObject {
        public static final int constructor = 2127707223;
        public int flags;
        public boolean forwards_first;
        public int id;
        public boolean just_contacts;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;
        public String q;
        public boolean reactions_first;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return StoryViewsList.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2127707223);
            int flag = TLObject.setFlag(this.flags, 1, this.just_contacts);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.reactions_first);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 8, this.forwards_first);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.q);
            }
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_stories_getStoriesByID extends TLObject {
        public static final int constructor = 1467271796;
        public ArrayList<Integer> id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1467271796);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.id);
        }
    }

    public static class TL_foundStory extends TLObject {
        public static final int constructor = -394605632;
        public TLRPC.Peer peer;
        public StoryItem storyItem;

        public static TL_foundStory TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_foundStory) TLObject.TLdeserialize(TL_foundStory.class, -394605632 != i ? null : new TL_foundStory(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.storyItem = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-394605632);
            this.peer.serializeToStream(outputSerializedData);
            this.storyItem.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_foundStories extends TLObject {
        public static final int constructor = -488736969;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<TL_foundStory> stories = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_foundStories TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_foundStories) TLObject.TLdeserialize(TL_foundStories.class, -488736969 != i ? null : new TL_foundStories(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.stories = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stories.TL_foundStory.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-488736969);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.stories);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_stories_searchPosts extends TLObject {
        public static final int constructor = -780072697;
        public MediaArea area;
        public int flags;
        public String hashtag;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_foundStories.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-780072697);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.hashtag);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.area.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_stories_getStoriesViews extends TLObject {
        public static final int constructor = 685862088;
        public ArrayList<Integer> id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_stories_storyViews.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(685862088);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.id);
        }
    }

    public static class TL_exportedStoryLink extends TLObject {
        public static final int constructor = 1070138683;
        public String link;

        public static TL_exportedStoryLink TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_exportedStoryLink) TLObject.TLdeserialize(TL_exportedStoryLink.class, 1070138683 != i ? null : new TL_exportedStoryLink(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.link = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1070138683);
            outputSerializedData.writeString(this.link);
        }
    }

    public static class TL_stories_exportStoryLink extends TLObject {
        public static final int constructor = 2072899360;
        public int id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_exportedStoryLink.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2072899360);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
        }
    }

    public static class TL_stories_report extends TLObject {
        public static final int constructor = 433646405;
        public ArrayList<Integer> id = new ArrayList<>();
        public String message;
        public byte[] option;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.ReportResult.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(433646405);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, new Vector$$ExternalSyntheticLambda3(outputSerializedData), this.id);
            outputSerializedData.writeByteArray(this.option);
            outputSerializedData.writeString(this.message);
        }
    }

    public static class TL_stories_getAllReadPeerStories extends TLObject {
        public static final int constructor = -1688541191;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1688541191);
        }
    }

    public static class TL_stories_getPeerMaxIDs extends TLMethod<Vector<TLRPC.TL_recentStory>> {
        public static final int constructor = 2018087280;
        public ArrayList<TLRPC.InputPeer> id = new ArrayList<>();

        @Override
        public Vector<TLRPC.TL_recentStory> deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i2, boolean z2) {
                    return TLRPC.TL_recentStory.TLdeserialize(inputSerializedData2, i2, z2);
                }
            });
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2018087280);
            Vector.serialize(outputSerializedData, this.id);
        }
    }

    public static class TL_updateStoriesStealthMode extends TLRPC.Update {
        public static final int constructor = 738741697;
        public TL_storiesStealthMode stealth_mode;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.stealth_mode = TL_storiesStealthMode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(738741697);
            this.stealth_mode.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_storiesStealthMode extends TLObject {
        public static final int constructor = 1898850301;
        public int active_until_date;
        public int cooldown_until_date;
        public int flags;

        public static TL_storiesStealthMode TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_storiesStealthMode) TLObject.TLdeserialize(TL_storiesStealthMode.class, 1898850301 != i ? null : new TL_storiesStealthMode(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1)) {
                this.active_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.cooldown_until_date = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1898850301);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.active_until_date);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.cooldown_until_date);
            }
        }
    }

    public static class TL_stories_activateStealthMode extends TLObject {
        public static final int constructor = 1471926630;
        public int flags;
        public boolean future;
        public boolean past;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1471926630);
            int flag = TLObject.setFlag(this.flags, 1, this.past);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.future);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
        }
    }

    public static class TL_stories_sendReaction extends TLObject {
        public static final int constructor = 2144810674;
        public boolean add_to_recent;
        public int flags;
        public TLRPC.InputPeer peer;
        public TLRPC.Reaction reaction;
        public int story_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2144810674);
            int flag = TLObject.setFlag(this.flags, 1, this.add_to_recent);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.story_id);
            this.reaction.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stories_getChatsToSend extends TLObject {
        public static final int constructor = -1519744160;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.messages_Chats.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1519744160);
        }
    }

    public static class TL_myBoost extends TLObject {
        public static int constructor = -1001897636;
        public int cooldown_until_date;
        public int date;
        public int expires;
        public int flags;
        public TLRPC.Peer peer;
        public int slot;

        public static TL_myBoost TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_myBoost) TLObject.TLdeserialize(TL_myBoost.class, constructor != i ? null : new TL_myBoost(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.slot = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.expires = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.cooldown_until_date = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.slot);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.expires);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.cooldown_until_date);
            }
        }
    }

    public static class TL_premium_myBoosts extends TLObject {
        public static int constructor = -1696454430;
        public ArrayList<TL_myBoost> my_boosts = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_premium_myBoosts TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_premium_myBoosts) TLObject.TLdeserialize(TL_premium_myBoosts.class, constructor != i ? null : new TL_premium_myBoosts(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.my_boosts = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stories.TL_myBoost.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.my_boosts);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_premium_getMyBoosts extends TLObject {
        public static int constructor = 199719754;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_premium_myBoosts.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    public static class TL_premium_boostsStatus extends TLObject {
        public static int constructor = 1230586490;
        public String boost_url;
        public int boosts;
        public int current_level_boosts;
        public int flags;
        public int gift_boosts;
        public int level;
        public boolean my_boost;
        public int next_level_boosts;
        public TL_stats.TL_statsPercentValue premium_audience;
        public ArrayList<PrepaidGiveaway> prepaid_giveaways = new ArrayList<>();
        public ArrayList<Integer> my_boost_slots = new ArrayList<>();

        public static TL_premium_boostsStatus TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_premium_boostsStatus) TLObject.TLdeserialize(TL_premium_boostsStatus.class, constructor != i ? null : new TL_premium_boostsStatus(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.my_boost = TLObject.hasFlag(int32, 4);
            this.level = inputSerializedData.readInt32(z);
            this.current_level_boosts = inputSerializedData.readInt32(z);
            this.boosts = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.gift_boosts = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_level_boosts = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.premium_audience = TL_stats.TL_statsPercentValue.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.boost_url = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.prepaid_giveaways = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                    @Override
                    public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                        return TL_stories.PrepaidGiveaway.TLdeserialize(inputSerializedData2, i, z2);
                    }
                }, z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.my_boost_slots = Vector.deserializeInt(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 4, this.my_boost);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.level);
            outputSerializedData.writeInt32(this.current_level_boosts);
            outputSerializedData.writeInt32(this.boosts);
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt32(this.gift_boosts);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.next_level_boosts);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.premium_audience.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.boost_url);
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.prepaid_giveaways);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serializeInt(outputSerializedData, this.my_boost_slots);
            }
        }
    }

    public static class TL_premium_getBoostsStatus extends TLObject {
        public static int constructor = 70197089;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_premium_boostsStatus.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_premium_applyBoost extends TLObject {
        public static int constructor = 1803396934;
        public int flags;
        public TLRPC.InputPeer peer;
        public ArrayList<Integer> slots = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_premium_myBoosts.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serializeInt(outputSerializedData, this.slots);
            }
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class Boost extends TLObject {
        public static final long NO_USER_ID = -1;
        public int date;
        public int expires;
        public int flags;
        public boolean gift;
        public boolean giveaway;
        public int giveaway_msg_id;
        public String id;
        public int multiplier;
        public long stars;
        public boolean unclaimed;
        public String used_gift_slug;
        public long user_id = -1;

        public static Boost TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_boost_layer186;
            if (i != 706514033) {
                tL_boost_layer186 = i != 1262359766 ? null : new TL_boost();
            } else {
                tL_boost_layer186 = new TL_boost_layer186();
            }
            return (Boost) TLObject.TLdeserialize(Boost.class, tL_boost_layer186, inputSerializedData, i, z);
        }
    }

    public static class TL_boost extends Boost {
        public static final int constructor = 1262359766;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.gift = TLObject.hasFlag(int32, 2);
            this.giveaway = TLObject.hasFlag(this.flags, 4);
            this.unclaimed = TLObject.hasFlag(this.flags, 8);
            this.id = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.giveaway_msg_id = inputSerializedData.readInt32(z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.expires = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.used_gift_slug = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.multiplier = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.stars = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1262359766);
            int flag = TLObject.setFlag(this.flags, 2, this.gift);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.giveaway);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 8, this.unclaimed);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.giveaway_msg_id);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.expires);
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.used_gift_slug);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.multiplier);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                outputSerializedData.writeInt64(this.stars);
            }
        }
    }

    public static class TL_boost_layer186 extends TL_boost {
        public static final int constructor = 706514033;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.gift = TLObject.hasFlag(int32, 2);
            this.giveaway = TLObject.hasFlag(this.flags, 4);
            this.unclaimed = TLObject.hasFlag(this.flags, 8);
            this.id = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.giveaway_msg_id = inputSerializedData.readInt32(z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.expires = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.used_gift_slug = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.multiplier = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(706514033);
            int flag = TLObject.setFlag(this.flags, 2, this.gift);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.giveaway);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 8, this.unclaimed);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.giveaway_msg_id);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.expires);
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeString(this.used_gift_slug);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeInt32(this.multiplier);
            }
        }
    }

    public static class TL_premium_boostsList extends TLObject {
        public static int constructor = -2030542532;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<Boost> boosts = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_premium_boostsList TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_premium_boostsList) TLObject.TLdeserialize(TL_premium_boostsList.class, constructor != i ? null : new TL_premium_boostsList(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.boosts = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stories.Boost.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.boosts);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_premium_getBoostsList extends TLObject {
        public static int constructor = 1626764896;
        public int flags;
        public boolean gifts;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_premium_boostsList.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.gifts);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static abstract class StoryItem extends TLObject {
        public ArrayList<Integer> albums;
        public String attachPath;
        public String caption;
        public boolean close_friends;
        public boolean contacts;
        public int date;
        public String detectedLng;
        public long dialogId;
        public boolean edited;
        public int expire_date;
        public int fileReference;
        public String firstFramePath;
        public int flags;
        public TLRPC.Peer from_id;
        public StoryFwdHeader fwd_from;
        public int id;
        public boolean isPublic;
        public boolean justUploaded;
        public long lastUpdateTime;
        public TLRPC.MessageMedia media;
        public int messageId;
        public int messageType;
        public boolean min;
        public TLRPC.Document music;
        public boolean noforwards;
        public boolean out;
        public StoryPrivacyBottomSheet.StoryPrivacy parsedPrivacy;
        public boolean pinned;
        public boolean selected_contacts;
        public TLRPC.Reaction sent_reaction;
        public boolean translated;
        public String translatedLng;
        public TLRPC.TL_textWithEntities translatedText;
        public StoryViews views;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<MediaArea> media_areas = new ArrayList<>();
        public ArrayList<TLRPC.PrivacyRule> privacy = new ArrayList<>();

        public static StoryItem TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_storyItem_layer174;
            switch (i) {
                case -1352440415:
                    tL_storyItem_layer174 = new TL_storyItem_layer174();
                    break;
                case -302947087:
                    tL_storyItem_layer174 = new TL_storyItem_layer223();
                    break;
                case -5388013:
                    tL_storyItem_layer174 = new TL_storyItemSkipped();
                    break;
                case 379894076:
                    tL_storyItem_layer174 = new TL_storyItem();
                    break;
                case 1153718222:
                    tL_storyItem_layer174 = new TL_storyItem_layer166();
                    break;
                case 1374088783:
                    tL_storyItem_layer174 = new TL_storyItemDeleted();
                    break;
                case 1445635639:
                    tL_storyItem_layer174 = new TL_storyItem_layer160();
                    break;
                case 2041735716:
                    tL_storyItem_layer174 = new TL_storyItem_layer210();
                    break;
                default:
                    tL_storyItem_layer174 = null;
                    break;
            }
            return (StoryItem) TLObject.TLdeserialize(StoryItem.class, tL_storyItem_layer174, inputSerializedData, i, z);
        }
    }

    public static abstract class StoryViews extends TLObject {
        public int flags;
        public int forwards_count;
        public boolean has_viewers;
        public int reactions_count;
        public int views_count;
        public ArrayList<Long> recent_viewers = new ArrayList<>();
        public ArrayList<TLRPC.ReactionCount> reactions = new ArrayList<>();

        public static StoryViews TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_storyViews;
            if (i == -1923523370) {
                tL_storyViews = new TL_storyViews();
            } else if (i != -968094825) {
                tL_storyViews = i != -748199729 ? null : new TL_storyViews_layer160();
            } else {
                tL_storyViews = new TL_storyViews_layer161();
            }
            return (StoryViews) TLObject.TLdeserialize(StoryViews.class, tL_storyViews, inputSerializedData, i, z);
        }
    }

    public static class TL_storyViews_layer160 extends StoryViews {
        public static final int constructor = -748199729;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.views_count = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.recent_viewers = Vector.deserializeLong(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-748199729);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.views_count);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serializeLong(outputSerializedData, this.recent_viewers);
            }
        }
    }

    public static class TL_storyViews_layer161 extends StoryViews {
        public static final int constructor = -968094825;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.views_count = inputSerializedData.readInt32(z);
            this.reactions_count = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.recent_viewers = Vector.deserializeLong(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-968094825);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.views_count);
            outputSerializedData.writeInt32(this.reactions_count);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serializeLong(outputSerializedData, this.recent_viewers);
            }
        }
    }

    public static class TL_storyViews extends StoryViews {
        public static final int constructor = -1923523370;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.has_viewers = TLObject.hasFlag(int32, 2);
            this.views_count = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.forwards_count = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reactions = Vector.deserialize(inputSerializedData, new TLRPC$TL_messageReactions$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reactions_count = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.recent_viewers = Vector.deserializeLong(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1923523370);
            int i = this.has_viewers ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt32(this.views_count);
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.forwards_count);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                Vector.serialize(outputSerializedData, this.reactions);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt32(this.reactions_count);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serializeLong(outputSerializedData, this.recent_viewers);
            }
        }
    }

    public static class TL_publicForwardStory extends TL_stats.PublicForward {
        public static final int constructor = -302797360;
        public TLRPC.Peer peer;
        public StoryItem story;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.story = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-302797360);
            this.peer.serializeToStream(outputSerializedData);
            this.story.serializeToStream(outputSerializedData);
        }
    }

    public static class StoryFwdHeader extends TLObject {
        public int flags;
        public TLRPC.Peer from;
        public String from_name;
        public boolean modified;
        public int story_id;

        public static StoryFwdHeader TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (StoryFwdHeader) TLObject.TLdeserialize(StoryFwdHeader.class, i != -1205411504 ? null : new TL_storyFwdHeader(), inputSerializedData, i, z);
        }
    }

    public static class TL_storyFwdHeader extends StoryFwdHeader {
        public static final int constructor = -1205411504;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.modified = TLObject.hasFlag(int32, 8);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.from = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_name = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.story_id = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1205411504);
            int flag = TLObject.setFlag(this.flags, 8, this.modified);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.from_name);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.story_id);
            }
        }
    }

    public static class Albums extends TLObject {
        public ArrayList<TL_storyAlbum> albums;
        public long hash;

        public static Albums TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_albums;
            if (i == -1013417414) {
                tL_albums = new TL_albums();
            } else {
                tL_albums = i != 1448008427 ? null : new TL_albumsNotModified();
            }
            return (Albums) TLObject.TLdeserialize(Albums.class, tL_albums, inputSerializedData, i, z);
        }
    }

    public static class TL_albums extends Albums {
        public static final int constructor = -1013417414;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1013417414);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.albums);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.albums = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stories.TL_storyAlbum.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }
    }

    public static class TL_albumsNotModified extends Albums {
        public static final int constructor = 1448008427;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1448008427);
        }
    }

    public static class TL_storyAlbum extends TLObject {
        public static final int constructor = -1826262950;
        public int album_id;
        public TLRPC.Photo icon_photo;
        public TLRPC.Document icon_video;
        public String title;

        public static TL_storyAlbum TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_storyAlbum) TLObject.TLdeserialize(TL_storyAlbum.class, i != -1826262950 ? null : new TL_storyAlbum(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.album_id = inputSerializedData.readInt32(z);
            this.title = inputSerializedData.readString(z);
            if (TLObject.hasFlag(int32, 1)) {
                this.icon_photo = TLRPC.Photo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(int32, 2)) {
                this.icon_video = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1826262950);
            int flag = TLObject.setFlag(TLObject.setFlag(0, 1, this.icon_photo != null), 2, this.icon_video != null);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.album_id);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(flag, 1)) {
                this.icon_photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag, 2)) {
                this.icon_video.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyItem extends StoryItem {
        public static final int constructor = 379894076;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.pinned = TLObject.hasFlag(int32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.id = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.expire_date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda111(), z);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new TL_stories$TL_storyItem$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.albums = Vector.deserializeInt(inputSerializedData, z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.music = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(379894076);
            int flag = TLObject.setFlag(this.flags, 32, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 128, this.isPublic);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 256, this.close_friends);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.min);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 1024, this.noforwards);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 2048, this.edited);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 4096, this.contacts);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 8192, this.selected_contacts);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 65536, this.out);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 524288, this.albums != null);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.expire_date);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            this.media.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 16384)) {
                Vector.serialize(outputSerializedData, this.media_areas);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.privacy);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                Vector.serializeInt(outputSerializedData, this.albums);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.music.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyItem_layer223 extends TL_storyItem {
        public static final int constructor = -302947087;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.pinned = TLObject.hasFlag(int32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.id = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.expire_date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda111(), z);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new TL_stories$TL_storyItem$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.albums = Vector.deserializeInt(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-302947087);
            int flag = TLObject.setFlag(this.flags, 32, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 128, this.isPublic);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 256, this.close_friends);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.min);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 1024, this.noforwards);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 2048, this.edited);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 4096, this.contacts);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 8192, this.selected_contacts);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 65536, this.out);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 524288, this.albums != null);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.expire_date);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            this.media.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 16384)) {
                Vector.serialize(outputSerializedData, this.media_areas);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.privacy);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                Vector.serializeInt(outputSerializedData, this.albums);
            }
        }
    }

    public static class TL_storyItem_layer210 extends TL_storyItem {
        public static final int constructor = 2041735716;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.pinned = TLObject.hasFlag(int32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.id = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.expire_date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda111(), z);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new TL_stories$TL_storyItem$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2041735716);
            int flag = TLObject.setFlag(this.flags, 32, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 128, this.isPublic);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 256, this.close_friends);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.min);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 1024, this.noforwards);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 2048, this.edited);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 4096, this.contacts);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 8192, this.selected_contacts);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 65536, this.out);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.expire_date);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            this.media.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 16384)) {
                Vector.serialize(outputSerializedData, this.media_areas);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.privacy);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyItem_layer174 extends TL_storyItem {
        public static final int constructor = -1352440415;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.pinned = TLObject.hasFlag(int32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.id = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.expire_date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda111(), z);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new TL_stories$TL_storyItem$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1352440415);
            int flag = TLObject.setFlag(this.flags, 32, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 128, this.isPublic);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 256, this.close_friends);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.min);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 1024, this.noforwards);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 2048, this.edited);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 4096, this.contacts);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 8192, this.selected_contacts);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 65536, this.out);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeInt32(this.date);
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.expire_date);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            this.media.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 16384)) {
                Vector.serialize(outputSerializedData, this.media_areas);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.privacy);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyItem_layer166 extends TL_storyItem {
        public static final int constructor = 1153718222;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.pinned = TLObject.hasFlag(int32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.id = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
            this.expire_date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda111(), z);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new TL_stories$TL_storyItem$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1153718222);
            int flag = TLObject.setFlag(this.flags, 32, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 128, this.isPublic);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 256, this.close_friends);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.min);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 1024, this.noforwards);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 2048, this.edited);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 4096, this.contacts);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 8192, this.selected_contacts);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 65536, this.out);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.expire_date);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            this.media.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 16384)) {
                Vector.serialize(outputSerializedData, this.media_areas);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.privacy);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyItem_layer160 extends TL_storyItem {
        public static final int constructor = 1445635639;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.pinned = TLObject.hasFlag(int32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.id = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
            this.expire_date = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda111(), z);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1445635639);
            int flag = TLObject.setFlag(this.flags, 32, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 128, this.isPublic);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 256, this.close_friends);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 512, this.min);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 1024, this.noforwards);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 2048, this.edited);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 4096, this.contacts);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 8192, this.selected_contacts);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.expire_date);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            this.media.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.privacy);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyItemDeleted extends StoryItem {
        public static final int constructor = 1374088783;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1374088783);
            outputSerializedData.writeInt32(this.id);
        }
    }

    public static class TL_storyItemSkipped extends StoryItem {
        public static final int constructor = -5388013;
        public boolean live;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.close_friends = TLObject.hasFlag(int32, 256);
            this.live = TLObject.hasFlag(this.flags, 512);
            this.id = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
            this.expire_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-5388013);
            int flag = TLObject.setFlag(this.flags, 256, this.close_friends);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 512, this.live);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.expire_date);
        }
    }

    public static class MediaAreaCoordinates extends TLObject {
        public int flags;
        public double h;
        public double radius;
        public double rotation;
        public double w;
        public double x;
        public double y;

        public static MediaAreaCoordinates TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_mediaAreaCoordinates;
            if (i == -808853502) {
                tL_mediaAreaCoordinates = new TL_mediaAreaCoordinates();
            } else {
                tL_mediaAreaCoordinates = i != 64088654 ? null : new TL_mediaAreaCoordinates_layer181();
            }
            return (MediaAreaCoordinates) TLObject.TLdeserialize(MediaAreaCoordinates.class, tL_mediaAreaCoordinates, inputSerializedData, i, z);
        }
    }

    public static class TL_mediaAreaCoordinates extends MediaAreaCoordinates {
        public static final int constructor = -808853502;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.x = inputSerializedData.readDouble(z);
            this.y = inputSerializedData.readDouble(z);
            this.w = inputSerializedData.readDouble(z);
            this.h = inputSerializedData.readDouble(z);
            this.rotation = inputSerializedData.readDouble(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.radius = inputSerializedData.readDouble(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-808853502);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeDouble(this.x);
            outputSerializedData.writeDouble(this.y);
            outputSerializedData.writeDouble(this.w);
            outputSerializedData.writeDouble(this.h);
            outputSerializedData.writeDouble(this.rotation);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeDouble(this.radius);
            }
        }
    }

    public static class TL_mediaAreaCoordinates_layer181 extends MediaAreaCoordinates {
        public static final int constructor = 64088654;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.x = inputSerializedData.readDouble(z);
            this.y = inputSerializedData.readDouble(z);
            this.w = inputSerializedData.readDouble(z);
            this.h = inputSerializedData.readDouble(z);
            this.rotation = inputSerializedData.readDouble(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(64088654);
            outputSerializedData.writeDouble(this.x);
            outputSerializedData.writeDouble(this.y);
            outputSerializedData.writeDouble(this.w);
            outputSerializedData.writeDouble(this.h);
            outputSerializedData.writeDouble(this.rotation);
        }
    }

    public static class MediaArea extends TLObject {
        public MediaAreaCoordinates coordinates;
        public boolean dark;
        public int flags;
        public boolean flipped;
        public TLRPC.Reaction reaction;

        public static MediaArea TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_mediaAreaWeather2;
            switch (i) {
                case -2057362882:
                    tL_mediaAreaWeather2 = new TL_mediaAreaWeather2();
                    break;
                case -1300094593:
                    tL_mediaAreaWeather2 = new TL_inputMediaAreaVenue();
                    break;
                case -1098720356:
                    tL_mediaAreaWeather2 = new TL_mediaAreaVenue();
                    break;
                case -891992787:
                    tL_mediaAreaWeather2 = new TL_mediaAreaGeoPoint();
                    break;
                case -544523486:
                    tL_mediaAreaWeather2 = new TL_mediaAreaGeoPoint_layer181();
                    break;
                case 340088945:
                    tL_mediaAreaWeather2 = new TL_mediaAreaSuggestedReaction();
                    break;
                case 577893055:
                    tL_mediaAreaWeather2 = new TL_inputMediaAreaChannelPost();
                    break;
                case 926421125:
                    tL_mediaAreaWeather2 = new TL_mediaAreaUrl();
                    break;
                case 1132918857:
                    tL_mediaAreaWeather2 = new TL_mediaAreaWeatherOld();
                    break;
                case 1235637404:
                    tL_mediaAreaWeather2 = new TL_mediaAreaWeather();
                    break;
                case 1468491885:
                    tL_mediaAreaWeather2 = new TL_mediaAreaStarGift();
                    break;
                case 1996756655:
                    tL_mediaAreaWeather2 = new TL_mediaAreaChannelPost();
                    break;
                default:
                    tL_mediaAreaWeather2 = null;
                    break;
            }
            return (MediaArea) TLObject.TLdeserialize(MediaArea.class, tL_mediaAreaWeather2, inputSerializedData, i, z);
        }
    }

    public static class TL_mediaAreaSuggestedReaction extends MediaArea {
        public static final int constructor = 340088945;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.dark = TLObject.hasFlag(int32, 1);
            this.flipped = TLObject.hasFlag(this.flags, 2);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(340088945);
            int flag = TLObject.setFlag(this.flags, 1, this.dark);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.flipped);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.coordinates.serializeToStream(outputSerializedData);
            this.reaction.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_mediaAreaChannelPost extends MediaArea {
        public static final int constructor = 1996756655;
        public long channel_id;
        public int msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.channel_id = inputSerializedData.readInt64(z);
            this.msg_id = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1996756655);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_mediaAreaVenue extends MediaArea {
        public static final int constructor = -1098720356;
        public String address;
        public TLRPC.GeoPoint geo;
        public String provider;
        public String title;
        public String venue_id;
        public String venue_type;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.geo = TLRPC.GeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.title = inputSerializedData.readString(z);
            this.address = inputSerializedData.readString(z);
            this.provider = inputSerializedData.readString(z);
            this.venue_id = inputSerializedData.readString(z);
            this.venue_type = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1098720356);
            this.coordinates.serializeToStream(outputSerializedData);
            this.geo.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.address);
            outputSerializedData.writeString(this.provider);
            outputSerializedData.writeString(this.venue_id);
            outputSerializedData.writeString(this.venue_type);
        }
    }

    public static class TL_mediaAreaUrl extends MediaArea {
        public static final int constructor = 926421125;
        public String url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(926421125);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.url);
        }
    }

    public static class TL_mediaAreaStarGift extends MediaArea {
        public static final int constructor = 1468491885;
        public String slug;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.slug = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1468491885);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class TL_mediaAreaWeather2 extends MediaArea {
        public static final int constructor = -2057362882;
        public String emoji;
        public int temperature_c;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.dark = TLObject.hasFlag(int32, 1);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.emoji = inputSerializedData.readString(z);
            this.temperature_c = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2057362882);
            int flag = TLObject.setFlag(this.flags, 1, this.dark);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.emoji);
            outputSerializedData.writeInt32(this.temperature_c);
        }
    }

    public static class TL_mediaAreaWeather extends MediaArea {
        public static final int constructor = 1235637404;
        public int color;
        public String emoji;
        public double temperature_c;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.emoji = inputSerializedData.readString(z);
            this.temperature_c = inputSerializedData.readDouble(z);
            this.color = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1235637404);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.emoji);
            outputSerializedData.writeDouble(this.temperature_c);
            outputSerializedData.writeInt32(this.color);
        }
    }

    public static class TL_mediaAreaWeatherOld extends MediaArea {
        public static final int constructor = 1132918857;
        public String emoji;
        public double temperature_c;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.dark = TLObject.hasFlag(int32, 1);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.emoji = inputSerializedData.readString(z);
            this.temperature_c = inputSerializedData.readDouble(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1132918857);
            int flag = TLObject.setFlag(this.flags, 1, this.dark);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.emoji);
            outputSerializedData.writeDouble(this.temperature_c);
        }
    }

    public static class TL_inputMediaAreaVenue extends MediaArea {
        public static final int constructor = -1300094593;
        public long query_id;
        public String result_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.query_id = inputSerializedData.readInt64(z);
            this.result_id = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1300094593);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.query_id);
            outputSerializedData.writeString(this.result_id);
        }
    }

    public static class TL_inputMediaAreaChannelPost extends MediaArea {
        public static final int constructor = 577893055;
        public TLRPC.InputChannel channel;
        public int msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.channel = TLRPC.InputChannel.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.msg_id = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(577893055);
            this.coordinates.serializeToStream(outputSerializedData);
            this.channel.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_geoPointAddress extends TLObject {
        public static final int constructor = -565420653;
        public String city;
        public String country_iso2;
        public int flags;
        public String state;
        public String street;

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append("geo{country=");
            sb.append(this.country_iso2);
            sb.append(", ");
            String str3 = "";
            if (this.state != null) {
                str = "state=" + this.state + ", ";
            } else {
                str = "";
            }
            sb.append(str);
            if (this.city != null) {
                str2 = "city=" + this.city + ", ";
            } else {
                str2 = "";
            }
            sb.append(str2);
            if (this.street != null) {
                str3 = "street=" + this.street;
            }
            sb.append(str3);
            sb.append("}");
            return sb.toString();
        }

        public static TL_geoPointAddress TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_geoPointAddress) TLObject.TLdeserialize(TL_geoPointAddress.class, -565420653 != i ? null : new TL_geoPointAddress(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.country_iso2 = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.state = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.city = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.street = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-565420653);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.country_iso2);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.state);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.city);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.street);
            }
        }
    }

    public static class TL_mediaAreaGeoPoint extends MediaArea {
        public static final int constructor = -891992787;
        public TL_geoPointAddress address;
        public TLRPC.GeoPoint geo;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.geo = TLRPC.GeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.address = TL_geoPointAddress.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-891992787);
            outputSerializedData.writeInt32(this.flags);
            this.coordinates.serializeToStream(outputSerializedData);
            this.geo.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.address.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_mediaAreaGeoPoint_layer181 extends TL_mediaAreaGeoPoint {
        public static final int constructor = -544523486;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.geo = TLRPC.GeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-544523486);
            this.coordinates.serializeToStream(outputSerializedData);
            this.geo.serializeToStream(outputSerializedData);
        }
    }

    public static class PrepaidGiveaway extends TLObject {
        public int boosts;
        public int date;
        public long id;
        public int quantity;

        public static PrepaidGiveaway TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_prepaidStarsGiveaway;
            if (i != -1700956192) {
                tL_prepaidStarsGiveaway = i != -1303143084 ? null : new TL_prepaidGiveaway();
            } else {
                tL_prepaidStarsGiveaway = new TL_prepaidStarsGiveaway();
            }
            return (PrepaidGiveaway) TLObject.TLdeserialize(PrepaidGiveaway.class, tL_prepaidStarsGiveaway, inputSerializedData, i, z);
        }
    }

    public static class TL_prepaidStarsGiveaway extends PrepaidGiveaway {
        public static final int constructor = -1700956192;
        public long stars;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = inputSerializedData.readInt64(z);
            this.stars = inputSerializedData.readInt64(z);
            this.quantity = inputSerializedData.readInt32(z);
            this.boosts = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1700956192);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.stars);
            outputSerializedData.writeInt32(this.quantity);
            outputSerializedData.writeInt32(this.boosts);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_prepaidGiveaway extends PrepaidGiveaway {
        public static final int constructor = -1303143084;
        public int months;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = inputSerializedData.readInt64(z);
            this.months = inputSerializedData.readInt32(z);
            this.quantity = inputSerializedData.readInt32(z);
            this.date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1303143084);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt32(this.months);
            outputSerializedData.writeInt32(this.quantity);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_stats_storyStats extends TLObject {
        public static final int constructor = 1355613820;
        public TL_stats.StatsGraph reactions_by_emotion_graph;
        public TL_stats.StatsGraph views_graph;

        public static TL_stats_storyStats TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_stats_storyStats) TLObject.TLdeserialize(TL_stats_storyStats.class, 1355613820 != i ? null : new TL_stats_storyStats(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.views_graph = TL_stats.StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.reactions_by_emotion_graph = TL_stats.StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1355613820);
            this.views_graph.serializeToStream(outputSerializedData);
            this.reactions_by_emotion_graph.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stats_getStoryStats extends TLObject {
        public static final int constructor = 927985472;
        public boolean dark;
        public int flags;
        public int id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_stats_storyStats.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(927985472);
            int i = this.dark ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
        }
    }

    public static class StoryReaction extends TLObject {
        public TLRPC.Message message;
        public TLRPC.Peer peer_id;
        public StoryItem story;

        public static StoryReaction TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_storyReactionPublicForward;
            if (i == -1146411453) {
                tL_storyReactionPublicForward = new TL_storyReactionPublicForward();
            } else if (i != -808644845) {
                tL_storyReactionPublicForward = i != 1620104917 ? null : new TL_storyReaction();
            } else {
                tL_storyReactionPublicForward = new TL_storyReactionPublicRepost();
            }
            return (StoryReaction) TLObject.TLdeserialize(StoryReaction.class, tL_storyReactionPublicForward, inputSerializedData, i, z);
        }
    }

    public static class TL_storyReactionPublicForward extends StoryReaction {
        public static final int constructor = -1146411453;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1146411453);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_storyReactionPublicRepost extends StoryReaction {
        public static final int constructor = -808644845;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            StoryItem storyItemTLdeserialize = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.story = storyItemTLdeserialize;
            if (storyItemTLdeserialize != null) {
                storyItemTLdeserialize.dialogId = DialogObject.getPeerDialogId(this.peer_id);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-808644845);
            this.peer_id.serializeToStream(outputSerializedData);
            this.story.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_storyReaction extends StoryReaction {
        public static final int constructor = 1620104917;
        public int date;
        public TLRPC.Reaction reaction;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.date = inputSerializedData.readInt32(z);
            this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1620104917);
            this.peer_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.reaction.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_storyReactionsList extends TLObject {
        public static final int constructor = -1436583780;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<StoryReaction> reactions = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_storyReactionsList TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_storyReactionsList) TLObject.TLdeserialize(TL_storyReactionsList.class, -1436583780 != i ? null : new TL_storyReactionsList(), inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1436583780);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.reactions);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.reactions = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_stories.StoryReaction.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
        }
    }

    public static class TL_getStoryReactionsList extends TLObject {
        public static final int constructor = -1179482081;
        public int flags;
        public boolean forwards_first;
        public int id;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;
        public TLRPC.Reaction reaction;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_storyReactionsList.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1179482081);
            int flag = TLObject.setFlag(this.flags, 4, this.forwards_first);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.reaction.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.offset);
            }
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_togglePinnedToTop extends TLObject {
        public static final int constructor = 187268763;
        public ArrayList<Integer> id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(187268763);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.id);
        }
    }

    public static class TL_createAlbum extends TLMethod<TL_storyAlbum> {
        public static final int constructor = -1553754395;
        public TLRPC.InputPeer peer;
        public ArrayList<Integer> stories = new ArrayList<>();
        public String title;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1553754395);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.title);
            Vector.serializeInt(outputSerializedData, this.stories);
        }

        @Override
        public TL_storyAlbum deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_storyAlbum.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_updateAlbum extends TLMethod<TL_storyAlbum> {
        public static final int constructor = 1582455222;
        public ArrayList<Integer> add_stories;
        public int album_id;
        public ArrayList<Integer> delete_stories;
        public ArrayList<Integer> order;
        public TLRPC.InputPeer peer;
        public String title;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1582455222);
            int flag = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.title != null), 2, this.delete_stories != null), 4, this.add_stories != null), 8, this.order != null);
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.album_id);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(flag, 2)) {
                Vector.serializeInt(outputSerializedData, this.delete_stories);
            }
            if (TLObject.hasFlag(flag, 4)) {
                Vector.serializeInt(outputSerializedData, this.add_stories);
            }
            if (TLObject.hasFlag(flag, 8)) {
                Vector.serializeInt(outputSerializedData, this.order);
            }
        }

        @Override
        public TL_storyAlbum deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_storyAlbum.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_reorderAlbums extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -2060059687;
        public ArrayList<Integer> order = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2060059687);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.order);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_deleteAlbum extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1925949744;
        public int album_id;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1925949744);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.album_id);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_getAlbums extends TLMethod<Albums> {
        public static final int constructor = 632548039;
        public long hash;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(632548039);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public Albums deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Albums.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_stories_getAlbumStories extends TLMethod<TL_stories_stories> {
        public static final int constructor = -1400869535;
        public int album_id;
        public int limit;
        public int offset;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1400869535);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.album_id);
            outputSerializedData.writeInt32(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public TL_stories_stories deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class TL_startLive extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -798372642;
        public String caption;
        public int flags;
        public Boolean messages_enabled;
        public boolean noforwards;
        public TLRPC.InputPeer peer;
        public boolean pinned;
        public long random_id;
        public boolean rtmp_stream;
        public Long send_paid_messages_stars;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<TLRPC.InputPrivacyRule> privacy_rules = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-798372642);
            int flag = TLObject.setFlag(this.flags, 4, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.noforwards);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.rtmp_stream);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 64, this.messages_enabled != null);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 128, this.send_paid_messages_stars != null);
            this.flags = flag5;
            outputSerializedData.writeInt32(flag5);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.caption);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            Vector.serialize(outputSerializedData, this.privacy_rules);
            outputSerializedData.writeInt64(this.random_id);
            Boolean bool = this.messages_enabled;
            if (bool != null) {
                outputSerializedData.writeBool(bool.booleanValue());
            }
            Long l = this.send_paid_messages_stars;
            if (l != null) {
                outputSerializedData.writeInt64(l.longValue());
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
