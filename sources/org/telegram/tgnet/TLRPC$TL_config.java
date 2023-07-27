package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
public class TLRPC$TL_config extends TLObject {
    public static int constructor = -870702050;
    public String autologin_token;
    public String autoupdate_url_prefix;
    public int base_lang_pack_version;
    public boolean blocked_mode;
    public int call_connect_timeout_ms;
    public int call_packet_timeout_ms;
    public int call_receive_timeout_ms;
    public int call_ring_timeout_ms;
    public int caption_length_max;
    public int channels_read_media_period;
    public int chat_size_max;
    public int date;
    public ArrayList<TLRPC$TL_dcOption> dc_options = new ArrayList<>();
    public String dc_txt_domain_name;
    public boolean default_p2p_contacts;
    public int edit_time_limit;
    public int expires;
    public int flags;
    public boolean force_try_ipv6;
    public int forwarded_count_max;
    public String gif_search_username;
    public String img_search_username;
    public int lang_pack_version;
    public String me_url_prefix;
    public int megagroup_size_max;
    public int message_length_max;
    public int notify_cloud_delay_ms;
    public int notify_default_delay_ms;
    public int offline_blur_timeout_ms;
    public int offline_idle_timeout_ms;
    public int online_cloud_timeout_ms;
    public int online_update_period_ms;
    public boolean preload_featured_stickers;
    public int push_chat_limit;
    public int push_chat_period_ms;
    public int rating_e_decay;
    public TLRPC$Reaction reactions_default;
    public boolean revoke_pm_inbox;
    public int revoke_pm_time_limit;
    public int revoke_time_limit;
    public String static_maps_provider;
    public int stickers_recent_limit;
    public String suggested_lang_code;
    public boolean test_mode;
    public int this_dc;
    public int tmp_sessions;
    public String venue_search_username;
    public int webfile_dc_id;

    public static TLRPC$TL_config TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_config", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_config tLRPC$TL_config = new TLRPC$TL_config();
        tLRPC$TL_config.readParams(abstractSerializedData, z);
        return tLRPC$TL_config;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.default_p2p_contacts = (readInt32 & 8) != 0;
        this.preload_featured_stickers = (readInt32 & 16) != 0;
        this.revoke_pm_inbox = (readInt32 & 64) != 0;
        this.blocked_mode = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
        this.force_try_ipv6 = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
        this.date = abstractSerializedData.readInt32(z);
        this.expires = abstractSerializedData.readInt32(z);
        this.test_mode = abstractSerializedData.readBool(z);
        this.this_dc = abstractSerializedData.readInt32(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$TL_dcOption TLdeserialize = TLRPC$TL_dcOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.dc_options.add(TLdeserialize);
        }
        this.dc_txt_domain_name = abstractSerializedData.readString(z);
        this.chat_size_max = abstractSerializedData.readInt32(z);
        this.megagroup_size_max = abstractSerializedData.readInt32(z);
        this.forwarded_count_max = abstractSerializedData.readInt32(z);
        this.online_update_period_ms = abstractSerializedData.readInt32(z);
        this.offline_blur_timeout_ms = abstractSerializedData.readInt32(z);
        this.offline_idle_timeout_ms = abstractSerializedData.readInt32(z);
        this.online_cloud_timeout_ms = abstractSerializedData.readInt32(z);
        this.notify_cloud_delay_ms = abstractSerializedData.readInt32(z);
        this.notify_default_delay_ms = abstractSerializedData.readInt32(z);
        this.push_chat_period_ms = abstractSerializedData.readInt32(z);
        this.push_chat_limit = abstractSerializedData.readInt32(z);
        this.edit_time_limit = abstractSerializedData.readInt32(z);
        this.revoke_time_limit = abstractSerializedData.readInt32(z);
        this.revoke_pm_time_limit = abstractSerializedData.readInt32(z);
        this.rating_e_decay = abstractSerializedData.readInt32(z);
        this.stickers_recent_limit = abstractSerializedData.readInt32(z);
        this.channels_read_media_period = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.tmp_sessions = abstractSerializedData.readInt32(z);
        }
        this.call_receive_timeout_ms = abstractSerializedData.readInt32(z);
        this.call_ring_timeout_ms = abstractSerializedData.readInt32(z);
        this.call_connect_timeout_ms = abstractSerializedData.readInt32(z);
        this.call_packet_timeout_ms = abstractSerializedData.readInt32(z);
        this.me_url_prefix = abstractSerializedData.readString(z);
        if ((this.flags & 128) != 0) {
            this.autoupdate_url_prefix = abstractSerializedData.readString(z);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.gif_search_username = abstractSerializedData.readString(z);
        }
        if ((this.flags & 1024) != 0) {
            this.venue_search_username = abstractSerializedData.readString(z);
        }
        if ((this.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
            this.img_search_username = abstractSerializedData.readString(z);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0) {
            this.static_maps_provider = abstractSerializedData.readString(z);
        }
        this.caption_length_max = abstractSerializedData.readInt32(z);
        this.message_length_max = abstractSerializedData.readInt32(z);
        this.webfile_dc_id = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.suggested_lang_code = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.lang_pack_version = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.base_lang_pack_version = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
            this.reactions_default = TLRPC$Reaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 65536) != 0) {
            this.autologin_token = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.default_p2p_contacts ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        int i2 = this.preload_featured_stickers ? i | 16 : i & (-17);
        this.flags = i2;
        int i3 = this.revoke_pm_inbox ? i2 | 64 : i2 & (-65);
        this.flags = i3;
        int i4 = this.blocked_mode ? i3 | LiteMode.FLAG_CHAT_BLUR : i3 & (-257);
        this.flags = i4;
        int i5 = this.force_try_ipv6 ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i4 & (-16385);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.expires);
        abstractSerializedData.writeBool(this.test_mode);
        abstractSerializedData.writeInt32(this.this_dc);
        abstractSerializedData.writeInt32(481674261);
        int size = this.dc_options.size();
        abstractSerializedData.writeInt32(size);
        for (int i6 = 0; i6 < size; i6++) {
            this.dc_options.get(i6).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.dc_txt_domain_name);
        abstractSerializedData.writeInt32(this.chat_size_max);
        abstractSerializedData.writeInt32(this.megagroup_size_max);
        abstractSerializedData.writeInt32(this.forwarded_count_max);
        abstractSerializedData.writeInt32(this.online_update_period_ms);
        abstractSerializedData.writeInt32(this.offline_blur_timeout_ms);
        abstractSerializedData.writeInt32(this.offline_idle_timeout_ms);
        abstractSerializedData.writeInt32(this.online_cloud_timeout_ms);
        abstractSerializedData.writeInt32(this.notify_cloud_delay_ms);
        abstractSerializedData.writeInt32(this.notify_default_delay_ms);
        abstractSerializedData.writeInt32(this.push_chat_period_ms);
        abstractSerializedData.writeInt32(this.push_chat_limit);
        abstractSerializedData.writeInt32(this.edit_time_limit);
        abstractSerializedData.writeInt32(this.revoke_time_limit);
        abstractSerializedData.writeInt32(this.revoke_pm_time_limit);
        abstractSerializedData.writeInt32(this.rating_e_decay);
        abstractSerializedData.writeInt32(this.stickers_recent_limit);
        abstractSerializedData.writeInt32(this.channels_read_media_period);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.tmp_sessions);
        }
        abstractSerializedData.writeInt32(this.call_receive_timeout_ms);
        abstractSerializedData.writeInt32(this.call_ring_timeout_ms);
        abstractSerializedData.writeInt32(this.call_connect_timeout_ms);
        abstractSerializedData.writeInt32(this.call_packet_timeout_ms);
        abstractSerializedData.writeString(this.me_url_prefix);
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeString(this.autoupdate_url_prefix);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            abstractSerializedData.writeString(this.gif_search_username);
        }
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeString(this.venue_search_username);
        }
        if ((this.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
            abstractSerializedData.writeString(this.img_search_username);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0) {
            abstractSerializedData.writeString(this.static_maps_provider);
        }
        abstractSerializedData.writeInt32(this.caption_length_max);
        abstractSerializedData.writeInt32(this.message_length_max);
        abstractSerializedData.writeInt32(this.webfile_dc_id);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.suggested_lang_code);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.lang_pack_version);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.base_lang_pack_version);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
            this.reactions_default.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 65536) != 0) {
            abstractSerializedData.writeString(this.autologin_token);
        }
    }
}
