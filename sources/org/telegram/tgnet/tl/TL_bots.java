package org.telegram.tgnet.tl;

import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
public class TL_bots {

    public static abstract class BotInfo extends TLObject {
        public botAppSettings app_settings;
        public ArrayList<TLRPC.BotCommand> commands = new ArrayList<>();
        public String description;
        public TLRPC.Document description_document;
        public TLRPC.Photo description_photo;
        public int flags;
        public boolean has_preview_medias;
        public BotMenuButton menu_button;
        public String privacy_policy_url;
        public long user_id;
        public botVerifierSettings verifier_settings;
        public int version;

        public static BotInfo TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (BotInfo) TLObject.TLdeserialize(BotInfo.class, fromConstructor(i10), inputSerializedData, i10, z10);
        }

        private static BotInfo fromConstructor(int i10) {
            switch (i10) {
                case -2109505932:
                    return new TL_botInfo_layer192();
                case -1892676777:
                    return new TL_botInfo_layer185();
                case -1729618630:
                    return new TL_botInfo_layer131();
                case -1154598962:
                    return new TL_botInfoEmpty_layer48();
                case -468280483:
                    return new TL_botInfo_layer140();
                case 164583517:
                    return new TL_botInfo_layer48();
                case 460632885:
                    return new TL_botInfo_layer139();
                case 912290611:
                    return new TL_botInfo_layer195();
                case 1300890265:
                    return new TL_botInfo();
                default:
                    return null;
            }
        }
    }

    public static abstract class BotMenuButton extends TLObject {
        public static BotMenuButton TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_botMenuButton;
            if (i10 != -944407322) {
                if (i10 != 1113113093) {
                    if (i10 != 1966318984) {
                        tL_botMenuButton = null;
                    } else {
                        tL_botMenuButton = new TL_botMenuButtonDefault();
                    }
                } else {
                    tL_botMenuButton = new TL_botMenuButtonCommands();
                }
            } else {
                tL_botMenuButton = new TL_botMenuButton();
            }
            return (BotMenuButton) TLObject.TLdeserialize(BotMenuButton.class, tL_botMenuButton, inputSerializedData, i10, z10);
        }
    }

    public static class TL_botInfo extends BotInfo {
        public static final int constructor = 1300890265;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.has_preview_medias = TLObject.hasFlag(readInt32, 64);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo = TLRPC.Photo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button = BotMenuButton.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.privacy_policy_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.app_settings = botAppSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.verifier_settings = botVerifierSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1300890265);
            int flag = TLObject.setFlag(this.flags, 64, this.has_preview_medias);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.commands);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeString(this.privacy_policy_url);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.app_settings.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 512)) {
                this.verifier_settings.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_botInfoEmpty_layer48 extends TL_botInfo {
        public static final int constructor = -1154598962;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1154598962);
        }
    }

    public static class TL_botInfo_layer131 extends TL_botInfo {
        public static final int constructor = -1729618630;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.user_id = inputSerializedData.readInt32(z10);
            this.description = inputSerializedData.readString(z10);
            this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1729618630);
            outputSerializedData.writeInt32((int) this.user_id);
            outputSerializedData.writeString(this.description);
            Vector.serialize(outputSerializedData, this.commands);
        }
    }

    public static class TL_botInfo_layer139 extends BotInfo {
        public static final int constructor = 460632885;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.user_id = inputSerializedData.readInt64(z10);
            this.description = inputSerializedData.readString(z10);
            this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(460632885);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.description);
            Vector.serialize(outputSerializedData, this.commands);
        }
    }

    public static class TL_botInfo_layer140 extends TL_botInfo {
        public static final int constructor = -468280483;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.user_id = inputSerializedData.readInt64(z10);
            this.description = inputSerializedData.readString(z10);
            this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
            this.menu_button = BotMenuButton.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-468280483);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.description);
            Vector.serialize(outputSerializedData, this.commands);
            this.menu_button.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_botInfo_layer185 extends TL_botInfo {
        public static final int constructor = -1892676777;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.has_preview_medias = TLObject.hasFlag(readInt32, 64);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo = TLRPC.Photo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button = BotMenuButton.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1892676777);
            int flag = TLObject.setFlag(this.flags, 64, this.has_preview_medias);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.commands);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_botInfo_layer192 extends TL_botInfo {
        public static final int constructor = -2109505932;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.has_preview_medias = TLObject.hasFlag(readInt32, 64);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo = TLRPC.Photo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button = BotMenuButton.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.privacy_policy_url = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2109505932);
            int flag = TLObject.setFlag(this.flags, 64, this.has_preview_medias);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.commands);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeString(this.privacy_policy_url);
            }
        }
    }

    public static class TL_botInfo_layer195 extends TL_botInfo {
        public static final int constructor = 912290611;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.has_preview_medias = TLObject.hasFlag(readInt32, 64);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.user_id = inputSerializedData.readInt64(z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo = TLRPC.Photo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button = BotMenuButton.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.privacy_policy_url = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.app_settings = botAppSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(912290611);
            int flag = TLObject.setFlag(this.flags, 64, this.has_preview_medias);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.description_photo.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                this.description_document.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                Vector.serialize(outputSerializedData, this.commands);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.menu_button.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                outputSerializedData.writeString(this.privacy_policy_url);
            }
            if (TLObject.hasFlag(this.flags, 256)) {
                this.app_settings.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_botInfo_layer48 extends TL_botInfo {
        public static final int constructor = 164583517;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.user_id = inputSerializedData.readInt32(z10);
            this.version = inputSerializedData.readInt32(z10);
            inputSerializedData.readString(z10);
            this.description = inputSerializedData.readString(z10);
            this.commands = Vector.deserialize(inputSerializedData, new c(18), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(164583517);
            outputSerializedData.writeInt32((int) this.user_id);
            outputSerializedData.writeInt32(this.version);
            outputSerializedData.writeString("");
            outputSerializedData.writeString(this.description);
            Vector.serialize(outputSerializedData, this.commands);
        }
    }

    public static class TL_botMenuButton extends BotMenuButton {
        public static final int constructor = -944407322;
        public String text;
        public String url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.text = inputSerializedData.readString(z10);
            this.url = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-944407322);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.url);
        }
    }

    public static class TL_botMenuButtonCommands extends BotMenuButton {
        public static final int constructor = 1113113093;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1113113093);
        }
    }

    public static class TL_botMenuButtonDefault extends BotMenuButton {
        public static final int constructor = 1966318984;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1966318984);
        }
    }

    public static class TL_updateBotMenuButton extends TLRPC.Update {
        public static final int constructor = 347625491;
        public long bot_id;
        public BotMenuButton button;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.bot_id = inputSerializedData.readInt64(z10);
            this.button = BotMenuButton.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(347625491);
            outputSerializedData.writeInt64(this.bot_id);
            this.button.serializeToStream(outputSerializedData);
        }
    }

    public static class addPreviewMedia extends TLObject {
        public static final int constructor = 397326170;
        public TLRPC.InputUser bot;
        public String lang_code = "";
        public TLRPC.InputMedia media;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return botPreviewMedia.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(397326170);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.lang_code);
            this.media.serializeToStream(outputSerializedData);
        }
    }

    public static class allowSendMessage extends TLObject {
        public static final int constructor = -248323089;
        public TLRPC.InputUser bot;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-248323089);
            this.bot.serializeToStream(outputSerializedData);
        }
    }

    public static class botAppSettings extends TLObject {
        public static final int constructor = -912582320;
        public int background_color;
        public int background_dark_color;
        public int flags;
        public int header_color;
        public int header_dark_color;
        public byte[] placeholder_path;
        public Path placeholder_svg_path;

        public static botAppSettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            botAppSettings botappsettings;
            if (-912582320 != i10) {
                botappsettings = null;
            } else {
                botappsettings = new botAppSettings();
            }
            return (botAppSettings) TLObject.TLdeserialize(botAppSettings.class, botappsettings, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                byte[] readByteArray = inputSerializedData.readByteArray(z10);
                this.placeholder_path = readByteArray;
                this.placeholder_svg_path = SvgHelper.doPath(SvgHelper.decompress(readByteArray));
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.background_color = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.background_dark_color = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.header_color = inputSerializedData.readInt32(z10);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                this.header_dark_color = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-912582320);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeByteArray(this.placeholder_path);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.background_color);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.background_dark_color);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.header_color);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeInt32(this.header_dark_color);
            }
        }
    }

    public static class botPreviewMedia extends TLObject {
        public static final int constructor = 602479523;
        public int date;
        public TLRPC.MessageMedia media;

        public static botPreviewMedia TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            botPreviewMedia botpreviewmedia;
            if (602479523 != i10) {
                botpreviewmedia = null;
            } else {
                botpreviewmedia = new botPreviewMedia();
            }
            return (botPreviewMedia) TLObject.TLdeserialize(botPreviewMedia.class, botpreviewmedia, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.date = inputSerializedData.readInt32(z10);
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(602479523);
            outputSerializedData.writeInt32(this.date);
            this.media.serializeToStream(outputSerializedData);
        }
    }

    public static class botVerification extends TLObject {
        public static final int constructor = -113453988;
        public long bot_id;
        public String description;
        public long icon;

        public static botVerification TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            botVerification botverification;
            if (-113453988 != i10) {
                botverification = null;
            } else {
                botverification = new botVerification();
            }
            return (botVerification) TLObject.TLdeserialize(botVerification.class, botverification, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.bot_id = inputSerializedData.readInt64(z10);
            this.icon = inputSerializedData.readInt64(z10);
            this.description = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-113453988);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeInt64(this.icon);
            outputSerializedData.writeString(this.description);
        }
    }

    public static class botVerifierSettings extends TLObject {
        public static final int constructor = -1328716265;
        public boolean can_modify_custom_description;
        public String company;
        public String custom_description;
        public int flags;
        public long icon;

        public static botVerifierSettings TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            botVerifierSettings botverifiersettings;
            if (-1328716265 != i10) {
                botverifiersettings = null;
            } else {
                botverifiersettings = new botVerifierSettings();
            }
            return (botVerifierSettings) TLObject.TLdeserialize(botVerifierSettings.class, botverifiersettings, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.can_modify_custom_description = TLObject.hasFlag(readInt32, 2);
            this.icon = inputSerializedData.readInt64(z10);
            this.company = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.custom_description = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1328716265);
            int flag = TLObject.setFlag(this.flags, 2, this.can_modify_custom_description);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.icon);
            outputSerializedData.writeString(this.company);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.custom_description);
            }
        }
    }

    public static class canSendMessage extends TLObject {
        public static final int constructor = 324662502;
        public TLRPC.InputUser bot;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(324662502);
            this.bot.serializeToStream(outputSerializedData);
        }
    }

    public static class checkDownloadFileParams extends TLObject {
        public static final int constructor = 1342666121;
        public TLRPC.InputUser bot;
        public String file_name;
        public String url;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1342666121);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.file_name);
            outputSerializedData.writeString(this.url);
        }
    }

    public static class checkUsername extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -2014174821;
        public String username;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2014174821);
            outputSerializedData.writeString(this.username);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class createBot extends TLMethod<TLRPC.User> {
        public static final int constructor = -441352405;
        public int flags;
        public TLRPC.InputUser manager_id;
        public String name;
        public String username;
        public boolean via_deeplink;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-441352405);
            int flag = TLObject.setFlag(this.flags, 1, this.via_deeplink);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.name);
            outputSerializedData.writeString(this.username);
            this.manager_id.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.User deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.User.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class deletePreviewMedia extends TLObject {
        public static final int constructor = 755054003;
        public TLRPC.InputUser bot;
        public String lang_code = "";
        public ArrayList<TLRPC.InputMedia> media = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(755054003);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.lang_code);
            Vector.serialize(outputSerializedData, this.media);
        }
    }

    public static class editPreviewMedia extends TLObject {
        public static final int constructor = -2061148049;
        public TLRPC.InputUser bot;
        public String lang_code = "";
        public TLRPC.InputMedia media;
        public TLRPC.InputMedia new_media;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return botPreviewMedia.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2061148049);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.lang_code);
            this.media.serializeToStream(outputSerializedData);
            this.new_media.serializeToStream(outputSerializedData);
        }
    }

    public static class exportBotToken extends TLMethod<exportedBotToken> {
        public static final int constructor = 6533257;
        public long bot_id;
        public boolean revoke;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(6533257);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeBool(this.revoke);
        }

        @Override
        public exportedBotToken deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return exportedBotToken.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class exportedBotToken extends TLObject {
        public static final int constructor = 1012971041;
        public String token;

        public static exportedBotToken TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            exportedBotToken exportedbottoken;
            if (1012971041 != i10) {
                exportedbottoken = null;
            } else {
                exportedbottoken = new exportedBotToken();
            }
            return (exportedBotToken) TLObject.TLdeserialize(exportedBotToken.class, exportedbottoken, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.token = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1012971041);
            outputSerializedData.writeString(this.token);
        }
    }

    public static class getAdminedBots extends TLObject {
        public static final int constructor = -1334764157;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new l(4));
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1334764157);
        }
    }

    public static class getBotInfo extends TLObject {
        public static final int constructor = -589753091;
        public TLRPC.InputUser bot;
        public int flags;
        public String lang_code;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return BotInfo.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-589753091);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.bot.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.lang_code);
        }
    }

    public static class getBotMenuButton extends TLObject {
        public static final int constructor = -1671369944;
        public TLRPC.InputUser user_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return BotMenuButton.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1671369944);
            this.user_id.serializeToStream(outputSerializedData);
        }
    }

    public static class getBotRecommendations extends TLObject {
        public static final int constructor = -1581840363;
        public TLRPC.InputUser bot;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Users.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1581840363);
            this.bot.serializeToStream(outputSerializedData);
        }
    }

    public static class getPopularAppBots extends TLObject {
        public static final int constructor = -1034878574;
        public int limit;
        public String offset;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return popularAppBots.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1034878574);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class getPreviewInfo extends TLObject {
        public static final int constructor = 1111143341;
        public TLRPC.InputUser bot;
        public String lang_code = "";

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return previewInfo.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1111143341);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.lang_code);
        }
    }

    public static class getPreviewMedias extends TLObject {
        public static final int constructor = -1566222003;
        public TLRPC.InputUser bot;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new c(19));
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1566222003);
            this.bot.serializeToStream(outputSerializedData);
        }
    }

    public static class getRequestedWebViewButton extends TLMethod<TL_keyboard.KeyboardButton> {
        public static final int constructor = -1088047117;
        public TLRPC.InputUser bot;
        public String webapp_req_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1088047117);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.webapp_req_id);
        }

        @Override
        public TL_keyboard.KeyboardButton deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_keyboard.KeyboardButton.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class invokeWebViewCustomMethod extends TLObject {
        public static final int constructor = 142591463;
        public TLRPC.InputUser bot;
        public String custom_method;
        public TLRPC.TL_dataJSON params;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(142591463);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.custom_method);
            this.params.serializeToStream(outputSerializedData);
        }
    }

    public static class popularAppBots extends TLObject {
        public static final int constructor = 428978491;
        public int flags;
        public String next_offset;
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static popularAppBots TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            popularAppBots popularappbots;
            if (428978491 != i10) {
                popularappbots = null;
            } else {
                popularappbots = new popularAppBots();
            }
            return (popularAppBots) TLObject.TLdeserialize(popularAppBots.class, popularappbots, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(428978491);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class previewInfo extends TLObject {
        public static final int constructor = 212278628;
        public ArrayList<botPreviewMedia> media = new ArrayList<>();
        public ArrayList<String> lang_codes = new ArrayList<>();

        public static previewInfo TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            previewInfo previewinfo;
            if (212278628 != i10) {
                previewinfo = null;
            } else {
                previewinfo = new previewInfo();
            }
            return (previewInfo) TLObject.TLdeserialize(previewInfo.class, previewinfo, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.media = Vector.deserialize(inputSerializedData, new c(19), z10);
            this.lang_codes = Vector.deserializeString(inputSerializedData, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(212278628);
            Vector.serialize(outputSerializedData, this.media);
            Vector.serializeString(outputSerializedData, this.lang_codes);
        }
    }

    public static class reorderPreviewMedias extends TLObject {
        public static final int constructor = -1238895702;
        public TLRPC.InputUser bot;
        public String lang_code = "";
        public ArrayList<TLRPC.InputMedia> order = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1238895702);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.lang_code);
            Vector.serialize(outputSerializedData, this.order);
        }
    }

    public static class reorderUsernames extends TLObject {
        public static final int constructor = -1760972350;
        public TLRPC.InputUser bot;
        public ArrayList<String> order = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1760972350);
            this.bot.serializeToStream(outputSerializedData);
            Vector.serializeString(outputSerializedData, this.order);
        }
    }

    public static class requestedButton extends TLObject {
        public static final int constructor = -247743273;
        public String webapp_req_id;

        public static requestedButton TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            requestedButton requestedbutton;
            if (-247743273 != i10) {
                requestedbutton = null;
            } else {
                requestedbutton = new requestedButton();
            }
            return (requestedButton) TLObject.TLdeserialize(requestedButton.class, requestedbutton, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.webapp_req_id = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-247743273);
            outputSerializedData.writeString(this.webapp_req_id);
        }
    }

    public static class setBotInfo extends TLObject {
        public static final int constructor = 282013987;
        public String about;
        public TLRPC.InputUser bot;
        public String description;
        public int flags;
        public String lang_code;
        public String name;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(282013987);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.bot.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.lang_code);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeString(this.name);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.about);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.description);
            }
        }
    }

    public static class setBotMenuButton extends TLObject {
        public static final int constructor = 1157944655;
        public BotMenuButton button;
        public TLRPC.InputUser user_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1157944655);
            this.user_id.serializeToStream(outputSerializedData);
            this.button.serializeToStream(outputSerializedData);
        }
    }

    public static class setCustomVerification extends TLObject {
        public static final int constructor = -1953898563;
        public TLRPC.InputUser bot;
        public String custom_description;
        public boolean enabled;
        public int flags;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1953898563);
            int flag = TLObject.setFlag(this.flags, 2, this.enabled);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.bot.serializeToStream(outputSerializedData);
            }
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeString(this.custom_description);
            }
        }
    }

    public static class toggleUserEmojiStatusPermission extends TLObject {
        public static final int constructor = 115237778;
        public TLRPC.InputUser bot;
        public boolean enabled;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(115237778);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.enabled);
        }
    }

    public static class toggleUsername extends TLObject {
        public static final int constructor = 87861619;
        public boolean active;
        public TLRPC.InputUser bot;
        public String username;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(87861619);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.username);
            outputSerializedData.writeBool(this.active);
        }
    }

    public static class updateStarRefProgram extends TLObject {
        public static final int constructor = 2005621427;
        public TLRPC.InputUser bot;
        public int commission_permille;
        public int duration_months;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_payments.starRefProgram.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2005621427);
            outputSerializedData.writeInt32(this.flags);
            this.bot.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.commission_permille);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.duration_months);
            }
        }
    }
}
