package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.m;
import org.telegram.tgnet.r;
public class TL_feed {

    public static abstract class FeedItem extends TLObject {
        public static FeedItem TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_feedItemMessageGroup;
            if (i10 != 1697598577) {
                if (i10 != 1810307195) {
                    if (i10 != 2121511845) {
                        tL_feedItemMessageGroup = null;
                    } else {
                        tL_feedItemMessageGroup = new TL_feedItemMessage();
                    }
                } else {
                    tL_feedItemMessageGroup = new TL_feedItemInterestCategories();
                }
            } else {
                tL_feedItemMessageGroup = new TL_feedItemMessageGroup();
            }
            return (FeedItem) TLObject.TLdeserialize(FeedItem.class, tL_feedItemMessageGroup, inputSerializedData, i10, z10);
        }
    }

    public static abstract class FeedMessages extends TLObject {
        public static FeedMessages TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_feedMessagesNotModified;
            if (i10 != -619039485) {
                if (i10 != -587770695) {
                    tL_feedMessagesNotModified = null;
                } else {
                    tL_feedMessagesNotModified = new TL_feedMessages();
                }
            } else {
                tL_feedMessagesNotModified = new TL_feedMessagesNotModified();
            }
            return (FeedMessages) TLObject.TLdeserialize(FeedMessages.class, tL_feedMessagesNotModified, inputSerializedData, i10, z10);
        }
    }

    public static class FeedPosition extends TLObject {
        public static final int constructor = 1348066419;
        public int date;
        public int f22246id;
        public TLRPC.Peer peer;

        public static FeedPosition TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            FeedPosition feedPosition;
            if (i10 != 1348066419) {
                feedPosition = null;
            } else {
                feedPosition = new FeedPosition();
            }
            return (FeedPosition) TLObject.TLdeserialize(FeedPosition.class, feedPosition, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.date = inputSerializedData.readInt32(z10);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.f22246id = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1348066419);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f22246id);
        }
    }

    public static class ForYouFeed extends TLObject {
        public static final int constructor = 1381464069;
        public int flags;
        public ArrayList<FeedItem> items = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static ForYouFeed TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            ForYouFeed forYouFeed;
            if (i10 != 1381464069) {
                forYouFeed = null;
            } else {
                forYouFeed = new ForYouFeed();
            }
            return (ForYouFeed) TLObject.TLdeserialize(ForYouFeed.class, forYouFeed, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.items = Vector.deserialize(inputSerializedData, new c(24), z10);
            this.chats = Vector.deserialize(inputSerializedData, new m(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new m(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1381464069);
            outputSerializedData.writeInt32(this.flags);
            Vector.serialize(outputSerializedData, this.items);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static abstract class InterestCategories extends TLObject {
        public static InterestCategories TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_interestCategories;
            if (i10 != -323604576) {
                if (i10 != 2043617685) {
                    tL_interestCategories = null;
                } else {
                    tL_interestCategories = new TL_interestCategoriesNotModified();
                }
            } else {
                tL_interestCategories = new TL_interestCategories();
            }
            return (InterestCategories) TLObject.TLdeserialize(InterestCategories.class, tL_interestCategories, inputSerializedData, i10, z10);
        }
    }

    public static class InterestCategory extends TLObject {
        public static final int constructor = 1816553187;
        public String emoji;
        public long emoji_document_id;
        public int flags;
        public int f22247id;
        public String title;

        public static InterestCategory TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            InterestCategory interestCategory;
            if (i10 != 1816553187) {
                interestCategory = null;
            } else {
                interestCategory = new InterestCategory();
            }
            return (InterestCategory) TLObject.TLdeserialize(InterestCategory.class, interestCategory, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.f22247id = inputSerializedData.readInt32(z10);
            this.title = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.emoji = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.emoji_document_id = inputSerializedData.readInt64(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(1816553187);
            int i10 = this.flags;
            boolean z11 = false;
            if (this.emoji != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z10);
            this.flags = flag;
            if (this.emoji_document_id != 0) {
                z11 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z11);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt32(this.f22247id);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.emoji);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.emoji_document_id);
            }
        }
    }

    public static class TL_feedItemInterestCategories extends FeedItem {
        public static final int constructor = 1810307195;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1810307195);
        }
    }

    public static class TL_feedItemMessage extends FeedItem {
        public static final int constructor = 2121511845;
        public TLRPC.Message message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2121511845);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_feedItemMessageGroup extends FeedItem {
        public static final int constructor = 1697598577;
        public ArrayList<TLRPC.Message> messages = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.messages = Vector.deserialize(inputSerializedData, new r(0), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1697598577);
            Vector.serialize(outputSerializedData, this.messages);
        }
    }

    public static class TL_feedMessages extends FeedMessages {
        public static final int constructor = -587770695;
        public int flags;
        public FeedPosition max_position;
        public FeedPosition min_position;
        public FeedPosition read_max_position;
        public ArrayList<TLRPC.Message> messages = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.max_position = FeedPosition.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.min_position = FeedPosition.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.read_max_position = FeedPosition.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.messages = Vector.deserialize(inputSerializedData, new r(0), z10);
            this.chats = Vector.deserialize(inputSerializedData, new m(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new m(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(-587770695);
            int i10 = this.flags;
            boolean z12 = false;
            if (this.max_position != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z10);
            this.flags = flag;
            if (this.min_position != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z11);
            this.flags = flag2;
            if (this.read_max_position != null) {
                z12 = true;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z12);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.max_position.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.min_position.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.read_max_position.serializeToStream(outputSerializedData);
            }
            Vector.serialize(outputSerializedData, this.messages);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_feedMessagesNotModified extends FeedMessages {
        public static final int constructor = -619039485;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-619039485);
        }
    }

    public static class TL_feed_getFeed extends TLMethod<FeedMessages> {
        public static final int constructor = 2121717715;
        public int add_offset;
        public int filter_id;
        public int flags;
        public long hash;
        public int limit;
        public FeedPosition max_position;
        public FeedPosition min_position;
        public FeedPosition offset_position;
        public boolean offset_to_max_read;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(2121717715);
            int flag = TLObject.setFlag(this.flags, 8, this.offset_to_max_read);
            this.flags = flag;
            boolean z12 = false;
            if (this.offset_position != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 1, z10);
            this.flags = flag2;
            if (this.max_position != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 2, z11);
            this.flags = flag3;
            if (this.min_position != null) {
                z12 = true;
            }
            int flag4 = TLObject.setFlag(flag3, 4, z12);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt32(this.filter_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.offset_position.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.add_offset);
            outputSerializedData.writeInt32(this.limit);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.max_position.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.min_position.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public FeedMessages deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return FeedMessages.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_feed_getForYou extends TLMethod<ForYouFeed> {
        public static final int constructor = 867755499;
        public int limit;
        public String query;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(867755499);
            if (this.query != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.query);
            }
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public ForYouFeed deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return ForYouFeed.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_feed_getInterestCategories extends TLMethod<InterestCategories> {
        public static final int constructor = -1166402118;
        public long hash;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1166402118);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public InterestCategories deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return InterestCategories.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_feed_readFeed extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1271479809;
        public int filter_id;
        public FeedPosition max_position;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1271479809);
            outputSerializedData.writeInt32(this.filter_id);
            this.max_position.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_feed_setInterestCategories extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1624680228;
        public ArrayList<Integer> category_ids = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1624680228);
            Vector.serializeInt(outputSerializedData, this.category_ids);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_interestCategories extends InterestCategories {
        public static final int constructor = -323604576;
        public ArrayList<InterestCategory> categories = new ArrayList<>();
        public ArrayList<Integer> selected = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.categories = Vector.deserialize(inputSerializedData, new c(25), z10);
            this.selected = Vector.deserializeInt(inputSerializedData, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-323604576);
            Vector.serialize(outputSerializedData, this.categories);
            Vector.serializeInt(outputSerializedData, this.selected);
        }
    }

    public static class TL_interestCategoriesNotModified extends InterestCategories {
        public static final int constructor = 2043617685;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2043617685);
        }
    }
}
