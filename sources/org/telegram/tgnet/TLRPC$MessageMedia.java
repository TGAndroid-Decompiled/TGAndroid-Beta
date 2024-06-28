package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories$StoryItem;

public abstract class TLRPC$MessageMedia extends TLObject {
    public String address;
    public TLRPC$Document alt_document;
    public TLRPC$Audio audio_unused;
    public byte[] bytes;
    public String captionLegacy;
    public String currency;
    public String description;
    public TLRPC$Document document;
    public ArrayList<TLRPC$MessageExtendedMedia> extended_media = new ArrayList<>();
    public String first_name;
    public int flags;
    public boolean force_large_media;
    public boolean force_small_media;
    public TLRPC$TL_game game;
    public TLRPC$GeoPoint geo;
    public int heading;
    public int id;
    public String last_name;
    public boolean manual;
    public boolean nopremium;
    public TLRPC$Peer peer;
    public int period;
    public String phone_number;
    public TLRPC$Photo photo;
    public String provider;
    public int proximity_notification_radius;
    public int receipt_msg_id;
    public boolean round;
    public boolean safe;
    public boolean shipping_address_requested;
    public boolean spoiler;
    public long stars_amount;
    public String start_param;
    public TL_stories$StoryItem storyItem;
    public boolean test;
    public String title;
    public long total_amount;
    public int ttl_seconds;
    public long user_id;
    public String vcard;
    public String venue_id;
    public String venue_type;
    public boolean via_mention;
    public boolean video;
    public TLRPC$Video video_unused;
    public boolean voice;
    public TLRPC$WebPage webpage;

    public static org.telegram.tgnet.TLRPC$MessageMedia TLdeserialize(org.telegram.tgnet.AbstractSerializedData r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.TLRPC$MessageMedia.TLdeserialize(org.telegram.tgnet.AbstractSerializedData, int, boolean):org.telegram.tgnet.TLRPC$MessageMedia");
    }

    public TLRPC$Document getDocument() {
        return (this.alt_document == null || MessagesController.isStoryQualityFull()) ? this.document : this.alt_document;
    }
}
