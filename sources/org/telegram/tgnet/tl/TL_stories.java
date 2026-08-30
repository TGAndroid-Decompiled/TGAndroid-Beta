package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;
import org.telegram.tgnet.o;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.u;
import ph.d8;
public class TL_stories {

    public static class Albums extends TLObject {
        public ArrayList<TL_storyAlbum> albums;
        public long hash;

        public static Albums TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_albums;
            if (i10 != -1013417414) {
                if (i10 != 1448008427) {
                    tL_albums = null;
                } else {
                    tL_albums = new TL_albumsNotModified();
                }
            } else {
                tL_albums = new TL_albums();
            }
            return (Albums) TLObject.TLdeserialize(Albums.class, tL_albums, inputSerializedData, i10, z4);
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
        public String f19414id;
        public int multiplier;
        public long stars;
        public boolean unclaimed;
        public String used_gift_slug;
        public long user_id = -1;

        public static Boost TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_boost_layer186;
            if (i10 != 706514033) {
                if (i10 != 1262359766) {
                    tL_boost_layer186 = null;
                } else {
                    tL_boost_layer186 = new TL_boost();
                }
            } else {
                tL_boost_layer186 = new TL_boost_layer186();
            }
            return (Boost) TLObject.TLdeserialize(Boost.class, tL_boost_layer186, inputSerializedData, i10, z4);
        }
    }

    public static class MediaArea extends TLObject {
        public MediaAreaCoordinates coordinates;
        public boolean dark;
        public int flags;
        public boolean flipped;
        public TLRPC.Reaction reaction;

        public static MediaArea TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_mediaAreaWeather2;
            switch (i10) {
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
            return (MediaArea) TLObject.TLdeserialize(MediaArea.class, tL_mediaAreaWeather2, inputSerializedData, i10, z4);
        }
    }

    public static class MediaAreaCoordinates extends TLObject {
        public int flags;
        public double h;
        public double radius;
        public double rotation;
        public double f19415w;
        public double f19416x;
        public double f19417y;

        public static MediaAreaCoordinates TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_mediaAreaCoordinates;
            if (i10 != -808853502) {
                if (i10 != 64088654) {
                    tL_mediaAreaCoordinates = null;
                } else {
                    tL_mediaAreaCoordinates = new TL_mediaAreaCoordinates_layer181();
                }
            } else {
                tL_mediaAreaCoordinates = new TL_mediaAreaCoordinates();
            }
            return (MediaAreaCoordinates) TLObject.TLdeserialize(MediaAreaCoordinates.class, tL_mediaAreaCoordinates, inputSerializedData, i10, z4);
        }
    }

    public static abstract class PeerStories extends TLObject {
        public boolean checkedExpired;
        public int flags;
        public int max_read_id;
        public TLRPC.Peer peer;
        public ArrayList<StoryItem> stories = new ArrayList<>();

        public static PeerStories TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_peerStories_layer162;
            if (i10 != -2045664768) {
                if (i10 != -1707742823) {
                    tL_peerStories_layer162 = null;
                } else {
                    tL_peerStories_layer162 = new TL_peerStories();
                }
            } else {
                tL_peerStories_layer162 = new TL_peerStories_layer162();
            }
            return (PeerStories) TLObject.TLdeserialize(PeerStories.class, tL_peerStories_layer162, inputSerializedData, i10, z4);
        }
    }

    public static class PrepaidGiveaway extends TLObject {
        public int boosts;
        public int date;
        public long f19418id;
        public int quantity;

        public static PrepaidGiveaway TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_prepaidStarsGiveaway;
            if (i10 != -1700956192) {
                if (i10 != -1303143084) {
                    tL_prepaidStarsGiveaway = null;
                } else {
                    tL_prepaidStarsGiveaway = new TL_prepaidGiveaway();
                }
            } else {
                tL_prepaidStarsGiveaway = new TL_prepaidStarsGiveaway();
            }
            return (PrepaidGiveaway) TLObject.TLdeserialize(PrepaidGiveaway.class, tL_prepaidStarsGiveaway, inputSerializedData, i10, z4);
        }
    }

    public static class StoryFwdHeader extends TLObject {
        public int flags;
        public TLRPC.Peer from;
        public String from_name;
        public boolean modified;
        public int story_id;

        public static StoryFwdHeader TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_storyFwdHeader tL_storyFwdHeader;
            if (i10 != -1205411504) {
                tL_storyFwdHeader = null;
            } else {
                tL_storyFwdHeader = new TL_storyFwdHeader();
            }
            return (StoryFwdHeader) TLObject.TLdeserialize(StoryFwdHeader.class, tL_storyFwdHeader, inputSerializedData, i10, z4);
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
        public int f19419id;
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
        public d8 parsedPrivacy;
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

        public static StoryItem TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_storyItem_layer174;
            switch (i10) {
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
            return (StoryItem) TLObject.TLdeserialize(StoryItem.class, tL_storyItem_layer174, inputSerializedData, i10, z4);
        }
    }

    public static class StoryReaction extends TLObject {
        public TLRPC.Message message;
        public TLRPC.Peer peer_id;
        public StoryItem story;

        public static StoryReaction TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_storyReactionPublicForward;
            if (i10 != -1146411453) {
                if (i10 != -808644845) {
                    if (i10 != 1620104917) {
                        tL_storyReactionPublicForward = null;
                    } else {
                        tL_storyReactionPublicForward = new TL_storyReaction();
                    }
                } else {
                    tL_storyReactionPublicForward = new TL_storyReactionPublicRepost();
                }
            } else {
                tL_storyReactionPublicForward = new TL_storyReactionPublicForward();
            }
            return (StoryReaction) TLObject.TLdeserialize(StoryReaction.class, tL_storyReactionPublicForward, inputSerializedData, i10, z4);
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

        public static StoryView TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_storyViewPublicForward;
            if (i10 != -1870436597) {
                if (i10 != -1329730875) {
                    if (i10 != -1116418231) {
                        tL_storyViewPublicForward = null;
                    } else {
                        tL_storyViewPublicForward = new TL_storyViewPublicRepost();
                    }
                } else {
                    tL_storyViewPublicForward = new TL_storyView();
                }
            } else {
                tL_storyViewPublicForward = new TL_storyViewPublicForward();
            }
            return (StoryView) TLObject.TLdeserialize(StoryView.class, tL_storyViewPublicForward, inputSerializedData, i10, z4);
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

        public static StoryViews TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_storyViews;
            if (i10 != -1923523370) {
                if (i10 != -968094825) {
                    if (i10 != -748199729) {
                        tL_storyViews = null;
                    } else {
                        tL_storyViews = new TL_storyViews_layer160();
                    }
                } else {
                    tL_storyViews = new TL_storyViews_layer161();
                }
            } else {
                tL_storyViews = new TL_storyViews();
            }
            return (StoryViews) TLObject.TLdeserialize(StoryViews.class, tL_storyViews, inputSerializedData, i10, z4);
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

        public static StoryViewsList TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_storyViewsList_layer167;
            if (i10 != 1189722604) {
                if (i10 != 1507299269) {
                    tL_storyViewsList_layer167 = null;
                } else {
                    tL_storyViewsList_layer167 = new TL_storyViewsList();
                }
            } else {
                tL_storyViewsList_layer167 = new TL_storyViewsList_layer167();
            }
            return (StoryViewsList) TLObject.TLdeserialize(StoryViewsList.class, tL_storyViewsList_layer167, inputSerializedData, i10, z4);
        }
    }

    public static class TL_albums extends Albums {
        public static final int constructor = -1013417414;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.hash = inputSerializedData.readInt64(z4);
            this.albums = Vector.deserialize(inputSerializedData, new d(3), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1013417414);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.albums);
        }
    }

    public static class TL_boost extends Boost {
        public static final int constructor = 1262359766;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.gift = TLObject.hasFlag(readInt32, 2);
            this.giveaway = TLObject.hasFlag(this.flags, 4);
            this.unclaimed = TLObject.hasFlag(this.flags, 8);
            this.f19414id = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.giveaway_msg_id = inputSerializedData.readInt32(z4);
            }
            this.date = inputSerializedData.readInt32(z4);
            this.expires = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.used_gift_slug = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.multiplier = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.stars = inputSerializedData.readInt64(z4);
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
            outputSerializedData.writeString(this.f19414id);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.gift = TLObject.hasFlag(readInt32, 2);
            this.giveaway = TLObject.hasFlag(this.flags, 4);
            this.unclaimed = TLObject.hasFlag(this.flags, 8);
            this.f19414id = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.giveaway_msg_id = inputSerializedData.readInt32(z4);
            }
            this.date = inputSerializedData.readInt32(z4);
            this.expires = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.used_gift_slug = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.multiplier = inputSerializedData.readInt32(z4);
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
            outputSerializedData.writeString(this.f19414id);
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
        public TL_storyAlbum deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_storyAlbum.TLdeserialize(inputSerializedData, i10, z4);
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
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_exportedStoryLink extends TLObject {
        public static final int constructor = 1070138683;
        public String link;

        public static TL_exportedStoryLink TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_exportedStoryLink tL_exportedStoryLink;
            if (1070138683 != i10) {
                tL_exportedStoryLink = null;
            } else {
                tL_exportedStoryLink = new TL_exportedStoryLink();
            }
            return (TL_exportedStoryLink) TLObject.TLdeserialize(TL_exportedStoryLink.class, tL_exportedStoryLink, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.link = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1070138683);
            outputSerializedData.writeString(this.link);
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

        public static TL_foundStories TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_foundStories tL_foundStories;
            if (-488736969 != i10) {
                tL_foundStories = null;
            } else {
                tL_foundStories = new TL_foundStories();
            }
            return (TL_foundStories) TLObject.TLdeserialize(TL_foundStories.class, tL_foundStories, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.count = inputSerializedData.readInt32(z4);
            this.stories = Vector.deserialize(inputSerializedData, new d(4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z4);
            }
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
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

    public static class TL_foundStory extends TLObject {
        public static final int constructor = -394605632;
        public TLRPC.Peer peer;
        public StoryItem storyItem;

        public static TL_foundStory TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_foundStory tL_foundStory;
            if (-394605632 != i10) {
                tL_foundStory = null;
            } else {
                tL_foundStory = new TL_foundStory();
            }
            return (TL_foundStory) TLObject.TLdeserialize(TL_foundStory.class, tL_foundStory, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.storyItem = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-394605632);
            this.peer.serializeToStream(outputSerializedData);
            this.storyItem.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_geoPointAddress extends TLObject {
        public static final int constructor = -565420653;
        public String city;
        public String country_iso2;
        public int flags;
        public String state;
        public String street;

        public static TL_geoPointAddress TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_geoPointAddress tL_geoPointAddress;
            if (-565420653 != i10) {
                tL_geoPointAddress = null;
            } else {
                tL_geoPointAddress = new TL_geoPointAddress();
            }
            return (TL_geoPointAddress) TLObject.TLdeserialize(TL_geoPointAddress.class, tL_geoPointAddress, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.country_iso2 = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.state = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.city = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.street = inputSerializedData.readString(z4);
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

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder("geo{country=");
            sb.append(this.country_iso2);
            sb.append(", ");
            String str3 = "";
            if (this.state == null) {
                str = "";
            } else {
                str = android.support.v4.media.a.r(new StringBuilder("state="), this.state, ", ");
            }
            sb.append(str);
            if (this.city == null) {
                str2 = "";
            } else {
                str2 = android.support.v4.media.a.r(new StringBuilder("city="), this.city, ", ");
            }
            sb.append(str2);
            if (this.street != null) {
                str3 = "street=" + this.street;
            }
            return android.support.v4.media.a.r(sb, str3, "}");
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
        public Albums deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return Albums.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_getStoryReactionsList extends TLObject {
        public static final int constructor = -1179482081;
        public int flags;
        public boolean forwards_first;
        public int f19420id;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;
        public TLRPC.Reaction reaction;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_storyReactionsList.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1179482081);
            int flag = TLObject.setFlag(this.flags, 4, this.forwards_first);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19420id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.reaction.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.offset);
            }
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_inputMediaAreaChannelPost extends MediaArea {
        public static final int constructor = 577893055;
        public TLRPC.InputChannel channel;
        public int msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.channel = TLRPC.InputChannel.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.msg_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(577893055);
            this.coordinates.serializeToStream(outputSerializedData);
            this.channel.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_inputMediaAreaVenue extends MediaArea {
        public static final int constructor = -1300094593;
        public long query_id;
        public String result_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.query_id = inputSerializedData.readInt64(z4);
            this.result_id = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1300094593);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.query_id);
            outputSerializedData.writeString(this.result_id);
        }
    }

    public static class TL_mediaAreaChannelPost extends MediaArea {
        public static final int constructor = 1996756655;
        public long channel_id;
        public int msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.channel_id = inputSerializedData.readInt64(z4);
            this.msg_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1996756655);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_mediaAreaCoordinates extends MediaAreaCoordinates {
        public static final int constructor = -808853502;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.f19416x = inputSerializedData.readDouble(z4);
            this.f19417y = inputSerializedData.readDouble(z4);
            this.f19415w = inputSerializedData.readDouble(z4);
            this.h = inputSerializedData.readDouble(z4);
            this.rotation = inputSerializedData.readDouble(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.radius = inputSerializedData.readDouble(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-808853502);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeDouble(this.f19416x);
            outputSerializedData.writeDouble(this.f19417y);
            outputSerializedData.writeDouble(this.f19415w);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.f19416x = inputSerializedData.readDouble(z4);
            this.f19417y = inputSerializedData.readDouble(z4);
            this.f19415w = inputSerializedData.readDouble(z4);
            this.h = inputSerializedData.readDouble(z4);
            this.rotation = inputSerializedData.readDouble(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(64088654);
            outputSerializedData.writeDouble(this.f19416x);
            outputSerializedData.writeDouble(this.f19417y);
            outputSerializedData.writeDouble(this.f19415w);
            outputSerializedData.writeDouble(this.h);
            outputSerializedData.writeDouble(this.rotation);
        }
    }

    public static class TL_mediaAreaGeoPoint extends MediaArea {
        public static final int constructor = -891992787;
        public TL_geoPointAddress address;
        public TLRPC.GeoPoint geo;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.geo = TLRPC.GeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.address = TL_geoPointAddress.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.geo = TLRPC.GeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-544523486);
            this.coordinates.serializeToStream(outputSerializedData);
            this.geo.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_mediaAreaStarGift extends MediaArea {
        public static final int constructor = 1468491885;
        public String slug;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.slug = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1468491885);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class TL_mediaAreaSuggestedReaction extends MediaArea {
        public static final int constructor = 340088945;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.dark = TLObject.hasFlag(readInt32, 1);
            this.flipped = TLObject.hasFlag(this.flags, 2);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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

    public static class TL_mediaAreaUrl extends MediaArea {
        public static final int constructor = 926421125;
        public String url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.url = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(926421125);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.url);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.geo = TLRPC.GeoPoint.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.title = inputSerializedData.readString(z4);
            this.address = inputSerializedData.readString(z4);
            this.provider = inputSerializedData.readString(z4);
            this.venue_id = inputSerializedData.readString(z4);
            this.venue_type = inputSerializedData.readString(z4);
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

    public static class TL_mediaAreaWeather extends MediaArea {
        public static final int constructor = 1235637404;
        public int color;
        public String emoji;
        public double temperature_c;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.emoji = inputSerializedData.readString(z4);
            this.temperature_c = inputSerializedData.readDouble(z4);
            this.color = inputSerializedData.readInt32(z4);
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

    public static class TL_mediaAreaWeather2 extends MediaArea {
        public static final int constructor = -2057362882;
        public String emoji;
        public int temperature_c;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.dark = TLObject.hasFlag(readInt32, 1);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.emoji = inputSerializedData.readString(z4);
            this.temperature_c = inputSerializedData.readInt32(z4);
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

    public static class TL_mediaAreaWeatherOld extends MediaArea {
        public static final int constructor = 1132918857;
        public String emoji;
        public double temperature_c;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.dark = TLObject.hasFlag(readInt32, 1);
            this.coordinates = MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.emoji = inputSerializedData.readString(z4);
            this.temperature_c = inputSerializedData.readDouble(z4);
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

    public static class TL_myBoost extends TLObject {
        public static int constructor = -1001897636;
        public int cooldown_until_date;
        public int date;
        public int expires;
        public int flags;
        public TLRPC.Peer peer;
        public int slot;

        public static TL_myBoost TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_myBoost tL_myBoost;
            if (constructor != i10) {
                tL_myBoost = null;
            } else {
                tL_myBoost = new TL_myBoost();
            }
            return (TL_myBoost) TLObject.TLdeserialize(TL_myBoost.class, tL_myBoost, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.slot = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.date = inputSerializedData.readInt32(z4);
            this.expires = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.cooldown_until_date = inputSerializedData.readInt32(z4);
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

    public static class TL_peerStories extends PeerStories {
        public static final int constructor = -1707742823;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.max_read_id = inputSerializedData.readInt32(z4);
            }
            this.stories = Vector.deserialize(inputSerializedData, new d(5), z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            long readInt64 = inputSerializedData.readInt64(z4);
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.peer = tL_peerUser;
            tL_peerUser.user_id = readInt64;
            if (TLObject.hasFlag(this.flags, 1)) {
                this.max_read_id = inputSerializedData.readInt32(z4);
            }
            this.stories = Vector.deserialize(inputSerializedData, new d(5), z4);
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

    public static class TL_premium_applyBoost extends TLObject {
        public static int constructor = 1803396934;
        public int flags;
        public TLRPC.InputPeer peer;
        public ArrayList<Integer> slots = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_premium_myBoosts.TLdeserialize(inputSerializedData, i10, z4);
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

    public static class TL_premium_boostsList extends TLObject {
        public static int constructor = -2030542532;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<Boost> boosts = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_premium_boostsList TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_premium_boostsList tL_premium_boostsList;
            if (constructor != i10) {
                tL_premium_boostsList = null;
            } else {
                tL_premium_boostsList = new TL_premium_boostsList();
            }
            return (TL_premium_boostsList) TLObject.TLdeserialize(TL_premium_boostsList.class, tL_premium_boostsList, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.count = inputSerializedData.readInt32(z4);
            this.boosts = Vector.deserialize(inputSerializedData, new d(6), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z4);
            }
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
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

        public static TL_premium_boostsStatus TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_premium_boostsStatus tL_premium_boostsStatus;
            if (constructor != i10) {
                tL_premium_boostsStatus = null;
            } else {
                tL_premium_boostsStatus = new TL_premium_boostsStatus();
            }
            return (TL_premium_boostsStatus) TLObject.TLdeserialize(TL_premium_boostsStatus.class, tL_premium_boostsStatus, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.my_boost = TLObject.hasFlag(readInt32, 4);
            this.level = inputSerializedData.readInt32(z4);
            this.current_level_boosts = inputSerializedData.readInt32(z4);
            this.boosts = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 16)) {
                this.gift_boosts = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_level_boosts = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.premium_audience = TL_stats.TL_statsPercentValue.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.boost_url = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.prepaid_giveaways = Vector.deserialize(inputSerializedData, new d(7), z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.my_boost_slots = Vector.deserializeInt(inputSerializedData, z4);
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

    public static class TL_premium_getBoostsList extends TLObject {
        public static int constructor = 1626764896;
        public int flags;
        public boolean gifts;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_premium_boostsList.TLdeserialize(inputSerializedData, i10, z4);
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

    public static class TL_premium_getBoostsStatus extends TLObject {
        public static int constructor = 70197089;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_premium_boostsStatus.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_premium_getMyBoosts extends TLObject {
        public static int constructor = 199719754;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_premium_myBoosts.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
        }
    }

    public static class TL_premium_myBoosts extends TLObject {
        public static int constructor = -1696454430;
        public ArrayList<TL_myBoost> my_boosts = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_premium_myBoosts TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_premium_myBoosts tL_premium_myBoosts;
            if (constructor != i10) {
                tL_premium_myBoosts = null;
            } else {
                tL_premium_myBoosts = new TL_premium_myBoosts();
            }
            return (TL_premium_myBoosts) TLObject.TLdeserialize(TL_premium_myBoosts.class, tL_premium_myBoosts, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.my_boosts = Vector.deserialize(inputSerializedData, new d(8), z4);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            Vector.serialize(outputSerializedData, this.my_boosts);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_prepaidGiveaway extends PrepaidGiveaway {
        public static final int constructor = -1303143084;
        public int months;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.f19418id = inputSerializedData.readInt64(z4);
            this.months = inputSerializedData.readInt32(z4);
            this.quantity = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1303143084);
            outputSerializedData.writeInt64(this.f19418id);
            outputSerializedData.writeInt32(this.months);
            outputSerializedData.writeInt32(this.quantity);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_prepaidStarsGiveaway extends PrepaidGiveaway {
        public static final int constructor = -1700956192;
        public long stars;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.f19418id = inputSerializedData.readInt64(z4);
            this.stars = inputSerializedData.readInt64(z4);
            this.quantity = inputSerializedData.readInt32(z4);
            this.boosts = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1700956192);
            outputSerializedData.writeInt64(this.f19418id);
            outputSerializedData.writeInt64(this.stars);
            outputSerializedData.writeInt32(this.quantity);
            outputSerializedData.writeInt32(this.boosts);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_publicForwardStory extends TL_stats.PublicForward {
        public static final int constructor = -302797360;
        public TLRPC.Peer peer;
        public StoryItem story;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.story = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-302797360);
            this.peer.serializeToStream(outputSerializedData);
            this.story.serializeToStream(outputSerializedData);
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
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
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
            boolean z4;
            outputSerializedData.writeInt32(-798372642);
            int flag = TLObject.setFlag(this.flags, 4, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.noforwards);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.rtmp_stream);
            this.flags = flag3;
            boolean z10 = false;
            if (this.messages_enabled != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 64, z4);
            this.flags = flag4;
            if (this.send_paid_messages_stars != null) {
                z10 = true;
            }
            int flag5 = TLObject.setFlag(flag4, 128, z10);
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
            Long l10 = this.send_paid_messages_stars;
            if (l10 != null) {
                outputSerializedData.writeInt64(l10.longValue());
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_stats_getStoryStats extends TLObject {
        public static final int constructor = 927985472;
        public boolean dark;
        public int flags;
        public int f19421id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_stats_storyStats.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(927985472);
            if (this.dark) {
                i10 = this.flags | 1;
            } else {
                i10 = this.flags & (-2);
            }
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19421id);
        }
    }

    public static class TL_stats_storyStats extends TLObject {
        public static final int constructor = 1355613820;
        public TL_stats.StatsGraph reactions_by_emotion_graph;
        public TL_stats.StatsGraph views_graph;

        public static TL_stats_storyStats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_stats_storyStats tL_stats_storyStats;
            if (1355613820 != i10) {
                tL_stats_storyStats = null;
            } else {
                tL_stats_storyStats = new TL_stats_storyStats();
            }
            return (TL_stats_storyStats) TLObject.TLdeserialize(TL_stats_storyStats.class, tL_stats_storyStats, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.views_graph = TL_stats.StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.reactions_by_emotion_graph = TL_stats.StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1355613820);
            this.views_graph.serializeToStream(outputSerializedData);
            this.reactions_by_emotion_graph.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_storiesStealthMode extends TLObject {
        public static final int constructor = 1898850301;
        public int active_until_date;
        public int cooldown_until_date;
        public int flags;

        public static TL_storiesStealthMode TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_storiesStealthMode tL_storiesStealthMode;
            if (1898850301 != i10) {
                tL_storiesStealthMode = null;
            } else {
                tL_storiesStealthMode = new TL_storiesStealthMode();
            }
            return (TL_storiesStealthMode) TLObject.TLdeserialize(TL_storiesStealthMode.class, tL_storiesStealthMode, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.active_until_date = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.cooldown_until_date = inputSerializedData.readInt32(z4);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.has_more = TLObject.hasFlag(readInt32, 1);
            this.count = inputSerializedData.readInt32(z4);
            this.state = inputSerializedData.readString(z4);
            this.peer_stories = Vector.deserialize(inputSerializedData, new d(9), z4);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
            this.stealth_mode = TL_storiesStealthMode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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

    public static class TL_stories_allStoriesNotModified extends stories_AllStories {
        public static final int constructor = 291044926;
        public int flags;
        public String state;
        public TL_storiesStealthMode stealth_mode;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.state = inputSerializedData.readString(z4);
            this.stealth_mode = TL_storiesStealthMode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(291044926);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.state);
            this.stealth_mode.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stories_canSendStory extends TLObject {
        public static final int constructor = 820732912;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return canSendStoryCount.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(820732912);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stories_deleteStories extends TLObject {
        public static final int constructor = -1369842849;
        public ArrayList<Integer> f19422id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return Vector.TLDeserializeInt(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1369842849);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.f19422id);
        }
    }

    public static class TL_stories_editStory extends TLObject {
        public static final int constructor = 744728363;
        public String caption;
        public int flags;
        public int f19423id;
        public TLRPC.InputMedia media;
        public TLRPC.InputDocument music;
        public TLRPC.InputPeer peer;
        public ArrayList<MediaArea> media_areas = new ArrayList<>();
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<TLRPC.InputPrivacyRule> privacy_rules = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(744728363);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19423id);
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

    public static class TL_stories_exportStoryLink extends TLObject {
        public static final int constructor = 2072899360;
        public int f19424id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_exportedStoryLink.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2072899360);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f19424id);
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
        public TL_stories_stories deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_stories_getAllReadPeerStories extends TLObject {
        public static final int constructor = -1688541191;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1688541191);
        }
    }

    public static class TL_stories_getAllStories extends TLObject {
        public static final int constructor = -290400731;
        public int flags;
        public boolean include_hidden;
        public boolean next;
        public String state;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return stories_AllStories.TLdeserialize(inputSerializedData, i10, z4);
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

    public static class TL_stories_getChatsToSend extends TLObject {
        public static final int constructor = -1519744160;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.messages_Chats.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1519744160);
        }
    }

    public static class TL_stories_getPeerMaxIDs extends TLMethod<Vector<TLRPC.TL_recentStory>> {
        public static final int constructor = 2018087280;
        public ArrayList<TLRPC.InputPeer> f19425id = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2018087280);
            Vector.serialize(outputSerializedData, this.f19425id);
        }

        @Override
        public Vector<TLRPC.TL_recentStory> deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return Vector.TLDeserialize(inputSerializedData, i10, z4, new d(10));
        }
    }

    public static class TL_stories_getPeerStories extends TLObject {
        public static final int constructor = 743103056;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_stories_peerStories.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(743103056);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_stories_getPinnedStories extends TLObject {
        public static final int constructor = 1478600156;
        public int limit;
        public int offset_id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i10, z4);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1271586794);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.offset_id);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_stories_getStoriesByID extends TLObject {
        public static final int constructor = 1467271796;
        public ArrayList<Integer> f19426id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_stories_stories.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1467271796);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.f19426id);
        }
    }

    public static class TL_stories_getStoriesViews extends TLObject {
        public static final int constructor = 685862088;
        public ArrayList<Integer> f19427id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_stories_storyViews.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(685862088);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.f19427id);
        }
    }

    public static class TL_stories_getStoryViewsList extends TLObject {
        public static final int constructor = 2127707223;
        public int flags;
        public boolean forwards_first;
        public int f19428id;
        public boolean just_contacts;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;
        public String f19429q;
        public boolean reactions_first;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return StoryViewsList.TLdeserialize(inputSerializedData, i10, z4);
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
                outputSerializedData.writeString(this.f19429q);
            }
            outputSerializedData.writeInt32(this.f19428id);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_stories_incrementStoryViews extends TLObject {
        public static final int constructor = -1308456197;
        public ArrayList<Integer> f19430id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1308456197);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.f19430id);
        }
    }

    public static class TL_stories_peerStories extends TLObject {
        public static final int constructor = -890861720;
        public PeerStories stories;
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_stories_peerStories TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_stories_peerStories tL_stories_peerStories;
            if (-890861720 != i10) {
                tL_stories_peerStories = null;
            } else {
                tL_stories_peerStories = new TL_stories_peerStories();
            }
            return (TL_stories_peerStories) TLObject.TLdeserialize(TL_stories_peerStories.class, tL_stories_peerStories, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.stories = PeerStories.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-890861720);
            this.stories.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_stories_readStories extends TLObject {
        public static final int constructor = -1521034552;
        public int max_id;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return Vector.TLDeserializeInt(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1521034552);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.max_id);
        }
    }

    public static class TL_stories_report extends TLMethod<TLRPC.ReportResult> {
        public static final int constructor = 433646405;
        public ArrayList<Integer> f19431id = new ArrayList<>();
        public String message;
        public byte[] option;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(433646405);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, new u(outputSerializedData, 1), this.f19431id);
            outputSerializedData.writeByteArray(this.option);
            outputSerializedData.writeString(this.message);
        }

        @Override
        public TLRPC.ReportResult deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.ReportResult.TLdeserialize(inputSerializedData, i10, z4);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_foundStories.TLdeserialize(inputSerializedData, i10, z4);
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

    public static class TL_stories_sendReaction extends TLObject {
        public static final int constructor = 2144810674;
        public boolean add_to_recent;
        public int flags;
        public TLRPC.InputPeer peer;
        public TLRPC.Reaction reaction;
        public int story_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            outputSerializedData.writeInt32(-1885443944);
            int flag = TLObject.setFlag(this.flags, 4, this.pinned);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.noforwards);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 128, this.fwd_modified);
            this.flags = flag3;
            if (this.albums != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 256, z4);
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

    public static class TL_stories_stories extends TLObject {
        public static final int constructor = 1673780490;
        public int count;
        public int flags;
        public ArrayList<StoryItem> stories = new ArrayList<>();
        public ArrayList<Integer> pinned_to_top = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_stories_stories TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_stories_stories tL_stories_stories;
            if (1673780490 != i10) {
                tL_stories_stories = null;
            } else {
                tL_stories_stories = new TL_stories_stories();
            }
            return (TL_stories_stories) TLObject.TLdeserialize(TL_stories_stories.class, tL_stories_stories, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.count = inputSerializedData.readInt32(z4);
            this.stories = Vector.deserialize(inputSerializedData, new d(5), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.pinned_to_top = Vector.deserializeInt(inputSerializedData, z4);
            }
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
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

    public static class TL_stories_storyViews extends TLObject {
        public static final int constructor = -560009955;
        public ArrayList<StoryViews> views = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_stories_storyViews TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_stories_storyViews tL_stories_storyViews;
            if (-560009955 != i10) {
                tL_stories_storyViews = null;
            } else {
                tL_stories_storyViews = new TL_stories_storyViews();
            }
            return (TL_stories_storyViews) TLObject.TLdeserialize(TL_stories_storyViews.class, tL_stories_storyViews, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.views = Vector.deserialize(inputSerializedData, new d(11), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-560009955);
            Vector.serialize(outputSerializedData, this.views);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_stories_togglePeerStoriesHidden extends TLObject {
        public static final int constructor = -1123805756;
        public boolean hidden;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1123805756);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.hidden);
        }
    }

    public static class TL_storyAlbum extends TLObject {
        public static final int constructor = -1826262950;
        public int album_id;
        public TLRPC.Photo icon_photo;
        public TLRPC.Document icon_video;
        public String title;

        public static TL_storyAlbum TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_storyAlbum tL_storyAlbum;
            if (i10 != -1826262950) {
                tL_storyAlbum = null;
            } else {
                tL_storyAlbum = new TL_storyAlbum();
            }
            return (TL_storyAlbum) TLObject.TLdeserialize(TL_storyAlbum.class, tL_storyAlbum, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.album_id = inputSerializedData.readInt32(z4);
            this.title = inputSerializedData.readString(z4);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.icon_photo = TLRPC.Photo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(readInt32, 2)) {
                this.icon_video = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            outputSerializedData.writeInt32(-1826262950);
            boolean z10 = false;
            if (this.icon_photo != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(0, 1, z4);
            if (this.icon_video != null) {
                z10 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z10);
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt32(this.album_id);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(flag2, 1)) {
                this.icon_photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag2, 2)) {
                this.icon_video.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_storyFwdHeader extends StoryFwdHeader {
        public static final int constructor = -1205411504;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.modified = TLObject.hasFlag(readInt32, 8);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.from = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.from_name = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.story_id = inputSerializedData.readInt32(z4);
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

    public static class TL_storyItem extends StoryItem {
        public static final int constructor = 379894076;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.f19419id = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.expire_date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new d(12), z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new c(15), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.albums = Vector.deserializeInt(inputSerializedData, z4);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.music = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
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
            if (this.albums != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag10 = TLObject.setFlag(flag9, 524288, z4);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeInt32(this.f19419id);
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

    public static class TL_storyItemDeleted extends StoryItem {
        public static final int constructor = 1374088783;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.f19419id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1374088783);
            outputSerializedData.writeInt32(this.f19419id);
        }
    }

    public static class TL_storyItemSkipped extends StoryItem {
        public static final int constructor = -5388013;
        public boolean live;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.close_friends = TLObject.hasFlag(readInt32, 256);
            this.live = TLObject.hasFlag(this.flags, 512);
            this.f19419id = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
            this.expire_date = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-5388013);
            int flag = TLObject.setFlag(this.flags, 256, this.close_friends);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 512, this.live);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt32(this.f19419id);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.expire_date);
        }
    }

    public static class TL_storyItem_layer160 extends TL_storyItem {
        public static final int constructor = 1445635639;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.f19419id = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
            this.expire_date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new c(15), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
            outputSerializedData.writeInt32(this.f19419id);
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

    public static class TL_storyItem_layer166 extends TL_storyItem {
        public static final int constructor = 1153718222;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.f19419id = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
            this.expire_date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new d(12), z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new c(15), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
            outputSerializedData.writeInt32(this.f19419id);
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

    public static class TL_storyItem_layer174 extends TL_storyItem {
        public static final int constructor = -1352440415;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.f19419id = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.expire_date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new d(12), z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new c(15), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
            outputSerializedData.writeInt32(this.f19419id);
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

    public static class TL_storyItem_layer210 extends TL_storyItem {
        public static final int constructor = 2041735716;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.f19419id = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.expire_date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new d(12), z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new c(15), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
            outputSerializedData.writeInt32(this.f19419id);
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

    public static class TL_storyItem_layer223 extends TL_storyItem {
        public static final int constructor = -302947087;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 32);
            this.isPublic = TLObject.hasFlag(this.flags, 128);
            this.close_friends = TLObject.hasFlag(this.flags, 256);
            this.min = TLObject.hasFlag(this.flags, 512);
            this.noforwards = TLObject.hasFlag(this.flags, 1024);
            this.edited = TLObject.hasFlag(this.flags, 2048);
            this.contacts = TLObject.hasFlag(this.flags, 4096);
            this.selected_contacts = TLObject.hasFlag(this.flags, 8192);
            this.out = TLObject.hasFlag(this.flags, 65536);
            this.f19419id = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 262144)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.fwd_from = StoryFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.expire_date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.caption = inputSerializedData.readString(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
            }
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 16384)) {
                this.media_areas = Vector.deserialize(inputSerializedData, new d(12), z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.privacy = Vector.deserialize(inputSerializedData, new c(15), z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.views = StoryViews.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.sent_reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 524288)) {
                this.albums = Vector.deserializeInt(inputSerializedData, z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
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
            if (this.albums != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag10 = TLObject.setFlag(flag9, 524288, z4);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeInt32(this.f19419id);
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

    public static class TL_storyReaction extends StoryReaction {
        public static final int constructor = 1620104917;
        public int date;
        public TLRPC.Reaction reaction;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.date = inputSerializedData.readInt32(z4);
            this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1620104917);
            this.peer_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
            this.reaction.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_storyReactionPublicForward extends StoryReaction {
        public static final int constructor = -1146411453;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            StoryItem TLdeserialize = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.story = TLdeserialize;
            if (TLdeserialize != null) {
                TLdeserialize.dialogId = DialogObject.getPeerDialogId(this.peer_id);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-808644845);
            this.peer_id.serializeToStream(outputSerializedData);
            this.story.serializeToStream(outputSerializedData);
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

        public static TL_storyReactionsList TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_storyReactionsList tL_storyReactionsList;
            if (-1436583780 != i10) {
                tL_storyReactionsList = null;
            } else {
                tL_storyReactionsList = new TL_storyReactionsList();
            }
            return (TL_storyReactionsList) TLObject.TLdeserialize(TL_storyReactionsList.class, tL_storyReactionsList, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.count = inputSerializedData.readInt32(z4);
            this.reactions = Vector.deserialize(inputSerializedData, new d(13), z4);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z4);
            }
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
    }

    public static class TL_storyView extends StoryView {
        public static final int constructor = -1329730875;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.blocked = TLObject.hasFlag(readInt32, 1);
            this.blocked_my_stories_from = TLObject.hasFlag(this.flags, 2);
            this.user_id = inputSerializedData.readInt64(z4);
            this.date = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.blocked = TLObject.hasFlag(readInt32, 1);
            this.blocked_my_stories_from = TLObject.hasFlag(this.flags, 2);
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.blocked = TLObject.hasFlag(readInt32, 1);
            this.blocked_my_stories_from = TLObject.hasFlag(this.flags, 2);
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.story = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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

    public static class TL_storyViews extends StoryViews {
        public static final int constructor = -1923523370;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.has_viewers = TLObject.hasFlag(readInt32, 2);
            this.views_count = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.forwards_count = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reactions = Vector.deserialize(inputSerializedData, new o(22), z4);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.reactions_count = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.recent_viewers = Vector.deserializeLong(inputSerializedData, z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(-1923523370);
            if (this.has_viewers) {
                i10 = this.flags | 2;
            } else {
                i10 = this.flags & (-3);
            }
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
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

    public static class TL_storyViewsList extends StoryViewsList {
        public static final int constructor = 1507299269;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.count = inputSerializedData.readInt32(z4);
            this.views_count = inputSerializedData.readInt32(z4);
            this.forwards_count = inputSerializedData.readInt32(z4);
            this.reactions_count = inputSerializedData.readInt32(z4);
            this.views = Vector.deserialize(inputSerializedData, new d(14), z4);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.count = inputSerializedData.readInt32(z4);
            this.reactions_count = inputSerializedData.readInt32(z4);
            this.views = Vector.deserialize(inputSerializedData, new d(14), z4);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z4);
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

    public static class TL_storyViews_layer160 extends StoryViews {
        public static final int constructor = -748199729;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.views_count = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.recent_viewers = Vector.deserializeLong(inputSerializedData, z4);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.views_count = inputSerializedData.readInt32(z4);
            this.reactions_count = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.recent_viewers = Vector.deserializeLong(inputSerializedData, z4);
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

    public static class TL_togglePinnedToTop extends TLObject {
        public static final int constructor = 187268763;
        public ArrayList<Integer> f19432id = new ArrayList<>();
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(187268763);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.f19432id);
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
            boolean z4;
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(1582455222);
            boolean z12 = false;
            if (this.title != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(0, 1, z4);
            if (this.delete_stories != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z10);
            if (this.add_stories != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z11);
            if (this.order != null) {
                z12 = true;
            }
            int flag4 = TLObject.setFlag(flag3, 8, z12);
            outputSerializedData.writeInt32(flag4);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.album_id);
            if (TLObject.hasFlag(flag4, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(flag4, 2)) {
                Vector.serializeInt(outputSerializedData, this.delete_stories);
            }
            if (TLObject.hasFlag(flag4, 4)) {
                Vector.serializeInt(outputSerializedData, this.add_stories);
            }
            if (TLObject.hasFlag(flag4, 8)) {
                Vector.serializeInt(outputSerializedData, this.order);
            }
        }

        @Override
        public TL_storyAlbum deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return TL_storyAlbum.TLdeserialize(inputSerializedData, i10, z4);
        }
    }

    public static class TL_updateReadStories extends TLRPC.Update {
        public static final int constructor = -145845461;
        public int max_id;
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.max_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-145845461);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.max_id);
        }
    }

    public static class TL_updateStoriesStealthMode extends TLRPC.Update {
        public static final int constructor = 738741697;
        public TL_storiesStealthMode stealth_mode;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.stealth_mode = TL_storiesStealthMode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(738741697);
            this.stealth_mode.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateStory extends TLRPC.Update {
        public static final int constructor = 1974712216;
        public TLRPC.Peer peer;
        public StoryItem story;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.story = StoryItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1974712216);
            this.peer.serializeToStream(outputSerializedData);
            this.story.serializeToStream(outputSerializedData);
        }
    }

    public static class canSendStoryCount extends TLObject {
        public static final int constructor = -1014513586;
        public int count_remains;

        public static canSendStoryCount TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            canSendStoryCount cansendstorycount;
            if (-1014513586 != i10) {
                cansendstorycount = null;
            } else {
                cansendstorycount = new canSendStoryCount();
            }
            return (canSendStoryCount) TLObject.TLdeserialize(canSendStoryCount.class, cansendstorycount, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.count_remains = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1014513586);
            outputSerializedData.writeInt32(this.count_remains);
        }
    }

    public static abstract class stories_AllStories extends TLObject {
        public static stories_AllStories TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TLObject tL_stories_allStoriesNotModified;
            if (i10 != 291044926) {
                if (i10 != 1862033025) {
                    tL_stories_allStoriesNotModified = null;
                } else {
                    tL_stories_allStoriesNotModified = new TL_stories_allStories();
                }
            } else {
                tL_stories_allStoriesNotModified = new TL_stories_allStoriesNotModified();
            }
            return (stories_AllStories) TLObject.TLdeserialize(stories_AllStories.class, tL_stories_allStoriesNotModified, inputSerializedData, i10, z4);
        }
    }

    public static class togglePinned extends TLObject {
        public static final int constructor = -1703566865;
        public ArrayList<Integer> f19433id = new ArrayList<>();
        public TLRPC.InputPeer peer;
        public boolean pinned;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z4) {
            return Vector.TLDeserializeInt(inputSerializedData, i10, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1703566865);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.f19433id);
            outputSerializedData.writeBool(this.pinned);
        }
    }

    public static class TL_albumsNotModified extends Albums {
        public static final int constructor = 1448008427;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1448008427);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
        }
    }
}
