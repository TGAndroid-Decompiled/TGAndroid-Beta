package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_messages_preparedInlineMessage$$ExternalSyntheticLambda0;
import org.telegram.tgnet.Vector;

public class TL_keyboard {

    public static abstract class ButtonTypeProto extends TLObject {
    }

    private TL_keyboard() {
    }

    public static abstract class ButtonType extends ButtonTypeProto {
        public static ButtonType TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (ButtonType) TLObject.TLdeserialize(ButtonType.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static ButtonType fromConstructor(int i) {
            switch (i) {
                case -1678843584:
                    return new TL_buttonTypeRequestGeoLocation();
                case -1429209212:
                    return new TL_buttonTypeRequestPoll();
                case -1072014982:
                    return new TL_buttonTypeSimpleWebView();
                case -908226327:
                    return new TL_buttonTypeDefault();
                case -549636359:
                    return new TL_buttonTypeRequestPhone();
                case 1071802622:
                    return new TL_inputButtonTypeRequestPeer();
                case 1331208759:
                    return new TL_buttonTypeRequestPeer();
                default:
                    return null;
            }
        }
    }

    public static class TL_buttonTypeDefault extends ButtonType {
        public static final int constructor = -908226327;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-908226327);
        }
    }

    public static class TL_buttonTypeRequestPhone extends ButtonType {
        public static final int constructor = -549636359;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-549636359);
        }
    }

    public static class TL_buttonTypeRequestGeoLocation extends ButtonType {
        public static final int constructor = -1678843584;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1678843584);
        }
    }

    public static class TL_buttonTypeRequestPoll extends ButtonType {
        public static final int constructor = -1429209212;
        public int flags;
        public boolean quiz;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1)) {
                this.quiz = inputSerializedData.readBool(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1429209212);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.quiz);
            }
        }
    }

    public static class TL_buttonTypeRequestPeer extends ButtonType {
        public static final int constructor = 1331208759;
        public int button_id;
        public int flags;
        public int max_quantity;
        public TLRPC.RequestPeerType peer_type;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.button_id = inputSerializedData.readInt32(z);
            this.peer_type = TLRPC.RequestPeerType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.max_quantity = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1331208759);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.button_id);
            this.peer_type.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.max_quantity);
        }
    }

    public static class TL_buttonTypeSimpleWebView extends ButtonType {
        public static final int constructor = -1072014982;
        public String url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1072014982);
            outputSerializedData.writeString(this.url);
        }
    }

    private static class TL_inputButtonTypeRequestPeer extends ButtonType {
        public static final int constructor = 1071802622;
        public int button_id;
        public int flags;
        public int max_quantity;
        public boolean name_requested;
        public TLRPC.RequestPeerType peer_type;
        public boolean photo_requested;
        public boolean username_requested;

        private TL_inputButtonTypeRequestPeer() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.name_requested = TLObject.hasFlag(int32, 1);
            this.username_requested = TLObject.hasFlag(this.flags, 2);
            this.photo_requested = TLObject.hasFlag(this.flags, 4);
            this.button_id = inputSerializedData.readInt32(z);
            this.peer_type = TLRPC.RequestPeerType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.max_quantity = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1071802622);
            int flag = TLObject.setFlag(this.flags, 1, this.name_requested);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.username_requested);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.photo_requested);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt32(this.button_id);
            this.peer_type.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.max_quantity);
        }
    }

    public static abstract class InlineButtonType extends ButtonTypeProto {
        public static InlineButtonType TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (InlineButtonType) TLObject.TLdeserialize(InlineButtonType.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static InlineButtonType fromConstructor(int i) {
            switch (i) {
                case -1820901387:
                    return new TL_inlineButtonTypeSwitchInline();
                case -1721647948:
                    return new TL_inputInlineButtonTypeUrlAuth();
                case -1539808867:
                    return new TL_inlineButtonTypeDisabled();
                case -1273154958:
                    return new TL_inlineButtonTypeCopy();
                case -1076875870:
                    return new TL_inlineButtonTypeUrlAuth();
                case -324732716:
                    return new TL_inlineButtonTypeUrl();
                case 693484600:
                    return new TL_inlineButtonTypeCallback();
                case 1003140532:
                    return new TL_inlineButtonTypeWebView();
                case 1067663311:
                    return new TL_inlineButtonTypeUserProfile();
                case 1220204453:
                    return new TL_inlineButtonTypeBuy();
                case 1408487002:
                    return new TL_inputInlineButtonTypeUserProfile();
                case 1557360797:
                    return new TL_inlineButtonTypeGame();
                default:
                    return null;
            }
        }
    }

    public static class TL_inlineButtonTypeUrl extends InlineButtonType {
        public static final int constructor = -324732716;
        public String url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-324732716);
            outputSerializedData.writeString(this.url);
        }
    }

    public static class TL_inlineButtonTypeUrlAuth extends InlineButtonType {
        public static final int constructor = -1076875870;
        public int button_id;
        public int flags;
        public String fwd_text;
        public String url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1)) {
                this.fwd_text = inputSerializedData.readString(z);
            }
            this.url = inputSerializedData.readString(z);
            this.button_id = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1076875870);
            int flag = TLObject.setFlag(this.flags, 1, this.fwd_text != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.fwd_text);
            }
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeInt32(this.button_id);
        }
    }

    public static class TL_inlineButtonTypeWebView extends InlineButtonType {
        public static final int constructor = 1003140532;
        public String url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1003140532);
            outputSerializedData.writeString(this.url);
        }
    }

    public static class TL_inlineButtonTypeCallback extends InlineButtonType {
        public static final int constructor = 693484600;
        public byte[] data;
        public int flags;
        public boolean requires_password;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.requires_password = TLObject.hasFlag(int32, 1);
            this.data = inputSerializedData.readByteArray(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(693484600);
            int flag = TLObject.setFlag(this.flags, 1, this.requires_password);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeByteArray(this.data);
        }
    }

    public static class TL_inlineButtonTypeGame extends InlineButtonType {
        public static final int constructor = 1557360797;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1557360797);
        }
    }

    public static class TL_inlineButtonTypeBuy extends InlineButtonType {
        public static final int constructor = 1220204453;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1220204453);
        }
    }

    public static class TL_inlineButtonTypeSwitchInline extends InlineButtonType {
        public static final int constructor = -1820901387;
        public int flags;
        public ArrayList<TLRPC.InlineQueryPeerType> peer_types;
        public String query;
        public boolean same_peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.same_peer = TLObject.hasFlag(int32, 1);
            this.query = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.peer_types = Vector.deserialize(inputSerializedData, new TLRPC$TL_messages_preparedInlineMessage$$ExternalSyntheticLambda0(), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1820901387);
            int flag = TLObject.setFlag(this.flags, 1, this.same_peer);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.peer_types != null);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.query);
            if (TLObject.hasFlag(this.flags, 2)) {
                Vector.serialize(outputSerializedData, this.peer_types);
            }
        }
    }

    public static class TL_inlineButtonTypeUserProfile extends InlineButtonType {
        public static final int constructor = 1067663311;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.user_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1067663311);
            outputSerializedData.writeInt64(this.user_id);
        }
    }

    public static class TL_inlineButtonTypeCopy extends InlineButtonType {
        public static final int constructor = -1273154958;
        public String copy_text;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.copy_text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1273154958);
            outputSerializedData.writeString(this.copy_text);
        }
    }

    public static class TL_inlineButtonTypeDisabled extends InlineButtonType {
        public static final int constructor = -1539808867;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1539808867);
        }
    }

    private static class TL_inputInlineButtonTypeUrlAuth extends InlineButtonType {
        public static final int constructor = -1721647948;
        public TLRPC.InputUser bot;
        public int flags;
        public String fwd_text;
        public boolean request_write_access;
        public String url;

        private TL_inputInlineButtonTypeUrlAuth() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.request_write_access = TLObject.hasFlag(int32, 1);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.fwd_text = inputSerializedData.readString(z);
            }
            this.url = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.bot = TLRPC.InputUser.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1721647948);
            int flag = TLObject.setFlag(this.flags, 1, this.request_write_access);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.fwd_text != null);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.bot != null);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.fwd_text);
            }
            outputSerializedData.writeString(this.url);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.bot.serializeToStream(outputSerializedData);
            }
        }
    }

    private static class TL_inputInlineButtonTypeUserProfile extends InlineButtonType {
        public static final int constructor = 1408487002;
        public TLRPC.InputUser user_id;

        private TL_inputInlineButtonTypeUserProfile() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.user_id = TLRPC.InputUser.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1408487002);
            this.user_id.serializeToStream(outputSerializedData);
        }
    }

    public static class PageButton extends TLObject implements KeyboardButtonProto {
        public static final int constructor = 1764381832;
        public int flags;
        public RichButtonStyle style;
        public TL_iv.RichText text;
        public InlineButtonType type;

        @Override
        public byte[] getData() {
            return KeyboardButtonProto.CC.$default$getData(this);
        }

        @Override
        public String getUrl() {
            return KeyboardButtonProto.CC.$default$getUrl(this);
        }

        public static PageButton TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (PageButton) TLObject.TLdeserialize(PageButton.class, i != 1764381832 ? null : new PageButton(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.text = TL_iv.RichText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.type = InlineButtonType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.style = RichButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1764381832);
            int flag = TLObject.setFlag(this.flags, 1, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.text.serializeToStream(outputSerializedData);
            this.type.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.style.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public InlineButtonType getType() {
            return this.type;
        }

        @Override
        public String getText() {
            TL_iv.RichText richText = this.text;
            if (richText instanceof TL_iv.textPlain) {
                return ((TL_iv.textPlain) richText).text;
            }
            return null;
        }
    }

    public static class RichButtonStyle extends TLObject {
        public static final int constructor = 63312061;
        public boolean bg_danger;
        public boolean bg_primary;
        public boolean bg_success;
        public int flags;
        public boolean link;

        public static RichButtonStyle TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (RichButtonStyle) TLObject.TLdeserialize(RichButtonStyle.class, i != 63312061 ? null : new RichButtonStyle(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.bg_primary = TLObject.hasFlag(int32, 1);
            this.bg_danger = TLObject.hasFlag(this.flags, 2);
            this.bg_success = TLObject.hasFlag(this.flags, 4);
            this.link = TLObject.hasFlag(this.flags, 8);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(63312061);
            int flag = TLObject.setFlag(this.flags, 1, this.bg_primary);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.bg_danger);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.bg_success);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8, this.link);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
        }
    }

    public static class KeyboardButtonStyle extends TLObject {
        public static final int constructor = 1339896880;
        public boolean bg_danger;
        public boolean bg_primary;
        public boolean bg_success;
        public int flags;
        public long icon;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.bg_primary = TLObject.hasFlag(int32, 1);
            this.bg_danger = TLObject.hasFlag(this.flags, 2);
            this.bg_success = TLObject.hasFlag(this.flags, 4);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.icon = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1339896880);
            int flag = TLObject.setFlag(this.flags, 1, this.bg_primary);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.bg_danger);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.bg_success);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt64(this.icon);
            }
        }

        public static KeyboardButtonStyle TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (KeyboardButtonStyle) TLObject.TLdeserialize(KeyboardButtonStyle.class, i != 1339896880 ? null : new KeyboardButtonStyle(), inputSerializedData, i, z);
        }
    }

    public static TLObject TLdeserializeLegacy(InputSerializedData inputSerializedData, int i, boolean z) {
        KeyboardButton keyboardButtonFromConstructor = KeyboardButton.fromConstructor(i);
        if (keyboardButtonFromConstructor != null) {
            keyboardButtonFromConstructor.readParams(inputSerializedData, z);
            return keyboardButtonFromConstructor;
        }
        KeyboardInlineButton keyboardInlineButtonFromConstructor = KeyboardInlineButton.fromConstructor(i);
        if (keyboardInlineButtonFromConstructor != null) {
            keyboardInlineButtonFromConstructor.readParams(inputSerializedData, z);
            return keyboardInlineButtonFromConstructor;
        }
        TLParseException.doThrowOrLog(inputSerializedData, KeyboardButtonProto.class.getName(), i, z);
        return null;
    }

    public interface KeyboardButtonProto {
        @Deprecated
        byte[] getData();

        String getText();

        ButtonTypeProto getType();

        @Deprecated
        String getUrl();

        public abstract class CC {
            public static String $default$getUrl(KeyboardButtonProto keyboardButtonProto) {
                ButtonTypeProto type = keyboardButtonProto.getType();
                if (type instanceof TL_inlineButtonTypeUrl) {
                    return ((TL_inlineButtonTypeUrl) type).url;
                }
                if (type instanceof TL_inlineButtonTypeUrlAuth) {
                    return ((TL_inlineButtonTypeUrlAuth) type).url;
                }
                if (type instanceof TL_inlineButtonTypeWebView) {
                    return ((TL_inlineButtonTypeWebView) type).url;
                }
                if (type instanceof TL_buttonTypeSimpleWebView) {
                    return ((TL_buttonTypeSimpleWebView) type).url;
                }
                return null;
            }

            public static byte[] $default$getData(KeyboardButtonProto keyboardButtonProto) {
                ButtonTypeProto type = keyboardButtonProto.getType();
                if (type instanceof TL_inlineButtonTypeCallback) {
                    return ((TL_inlineButtonTypeCallback) type).data;
                }
                return null;
            }
        }
    }

    public static abstract class KeyboardInlineButtonRow extends TLObject {
        public ArrayList<KeyboardInlineButton> buttons = new ArrayList<>();

        public static KeyboardInlineButtonRow fromConstructor(int i) {
            if (i == 423758582) {
                return new TL_keyboardInlineButtonRow();
            }
            if (i != 2002815875) {
                return null;
            }
            return new TL_keyboardInlineButtonRow_layer228();
        }

        public static KeyboardInlineButtonRow TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (KeyboardInlineButtonRow) TLObject.TLdeserialize(KeyboardInlineButtonRow.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class TL_keyboardInlineButtonRow extends KeyboardInlineButtonRow {
        public static final int constructor = 423758582;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.buttons = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_keyboard.KeyboardInlineButton.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(423758582);
            Vector.serialize(outputSerializedData, this.buttons);
        }
    }

    static class TL_keyboardInlineButtonRow_layer228 extends TL_keyboardInlineButtonRow {
        public static final int constructor = 2002815875;

        private TL_keyboardInlineButtonRow_layer228() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            ArrayList arrayListDeserialize = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_keyboard.TLdeserializeLegacy(inputSerializedData2, i, z2);
                }
            }, z);
            this.buttons = new ArrayList<>(arrayListDeserialize.size());
            int size = arrayListDeserialize.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListDeserialize.get(i);
                i++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof KeyboardInlineButton) {
                    this.buttons.add((KeyboardInlineButton) tLObject);
                }
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2002815875);
            Vector.serialize(outputSerializedData, this.buttons);
        }
    }

    public static abstract class KeyboardInlineButton extends TLObject implements KeyboardButtonProto {
        public int flags;
        public KeyboardButtonStyle style;
        public String text;
        public InlineButtonType type;

        @Override
        public byte[] getData() {
            return KeyboardButtonProto.CC.$default$getData(this);
        }

        @Override
        public String getUrl() {
            return KeyboardButtonProto.CC.$default$getUrl(this);
        }

        public static KeyboardInlineButton fromConstructor(int i) {
            if (i == 297902882) {
                return new TL_keyboardInlineButton();
            }
            return fromConstructorLegacy(i);
        }

        private static KeyboardInlineButton fromConstructorLegacy(int i) {
            switch (i) {
                case -1983540999:
                    return new TL_keyboardButtonGame_layer228();
                case -1816527947:
                    return new TL_keyboardButtonSwitchInline_layer223();
                case -1726768644:
                    return new TL_keyboardButtonSwitchInline_layer228();
                case -1675883435:
                    return new TL_keyboardInlineButton_legacy();
                case -1344716869:
                    return new TL_keyboardButtonBuy_layer223();
                case -1127960816:
                    return new TL_keyboardButtonCopy_layer228();
                case -1057137399:
                    return new TL_keyboardButtonUserProfile_layer228();
                case -802258988:
                    return new TL_inputKeyboardButtonUrlAuth_layer223();
                case -670292500:
                    return new TL_keyboardButtonUrl_layer228();
                case -433338016:
                    return new TL_keyboardButtonCallback_layer228();
                case -398020192:
                    return new TL_keyboardButtonWebView_layer228();
                case -376962181:
                    return new TL_inputKeyboardButtonUserProfile_layer223();
                case -183499015:
                    return new TL_keyboardButtonUrlAuth_layer228();
                case 90744648:
                    return new TL_keyboardButtonSwitchInline_layer157();
                case 280464681:
                    return new TL_keyboardButtonUrlAuth_layer223();
                case 326529584:
                    return new TL_keyboardButtonWebView_layer223();
                case 629866245:
                    return new TL_keyboardButtonUrl_layer223();
                case 814112961:
                    return new TL_keyboardButtonUserProfile_layer223();
                case 901503851:
                    return new TL_keyboardButtonCallback_layer223();
                case 1067792645:
                    return new TL_keyboardButtonBuy_layer228();
                case 1358175439:
                    return new TL_keyboardButtonGame_layer223();
                case 1744911986:
                    return new TL_inputKeyboardButtonUrlAuth_layer228();
                case 1748655686:
                    return new TL_keyboardButtonCallback_layer117();
                case 1976723854:
                    return new TL_keyboardButtonCopy_layer223();
                case 2103314375:
                    return new TL_inputKeyboardButtonUserProfile_layer228();
                default:
                    return null;
            }
        }

        public static KeyboardInlineButton TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            KeyboardButton keyboardButtonFromConstructor = KeyboardButton.fromConstructor(i);
            if (keyboardButtonFromConstructor != null) {
                keyboardButtonFromConstructor.readParams(inputSerializedData, z);
                TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboardInlineButton();
                tL_keyboardInlineButton.text = keyboardButtonFromConstructor.text;
                tL_keyboardInlineButton.type = new TL_inlineButtonTypeDisabled();
                return tL_keyboardInlineButton;
            }
            return (KeyboardInlineButton) TLObject.TLdeserialize(KeyboardInlineButton.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class KeyboardButtonRow extends TLObject {
        public static final int constructor = 2002815875;
        public ArrayList<KeyboardButton> buttons = new ArrayList<>();

        public static KeyboardButtonRow TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (KeyboardButtonRow) TLObject.TLdeserialize(KeyboardButtonRow.class, 2002815875 != i ? null : new KeyboardButtonRow(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.buttons = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_keyboard.KeyboardButton.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2002815875);
            Vector.serialize(outputSerializedData, this.buttons);
        }
    }

    public static abstract class KeyboardButton extends TLObject implements KeyboardButtonProto {
        protected int flags;
        public KeyboardButtonStyle style;
        public String text;
        public ButtonType type;

        @Override
        public byte[] getData() {
            return KeyboardButtonProto.CC.$default$getData(this);
        }

        @Override
        public String getUrl() {
            return KeyboardButtonProto.CC.$default$getUrl(this);
        }

        public static KeyboardButton fromConstructor(int i) {
            switch (i) {
                case -1598009252:
                    return new TL_keyboardButtonSimpleWebView_layer223();
                case -1560655744:
                    return new TL_keyboardButton_layer223();
                case -1438582451:
                    return new TL_keyboardButtonRequestGeoLocation_layer228();
                case -1318425559:
                    return new TL_keyboardButtonRequestPhone_layer223();
                case -1144565411:
                    return new TL_keyboardButtonRequestPoll_layer223();
                case -916050683:
                    return new TL_inputKeyboardButtonRequestPeer_layer221();
                case -514047120:
                    return new TL_keyboardButtonSimpleWebView_layer228();
                case -59151553:
                    return new TL_keyboardButtonRequestGeoLocation_layer223();
                case 45580630:
                    return new TL_inputKeyboardButtonRequestPeer_layer228();
                case 218842764:
                    return new TL_keyboardButtonRequestPeer_layer168();
                case 795322159:
                    return new TL_keyboardButton();
                case 1098841487:
                    return new TL_keyboardButtonRequestPhone_layer228();
                case 1406648280:
                    return new TL_keyboardButtonRequestPeer_layer223();
                case 1527715317:
                    return new TL_keyboardButtonRequestPeer_layer228();
                case 2047989634:
                    return new TL_keyboardButtonRequestPoll_layer228();
                case 2098662655:
                    return new TL_keyboardButton_layer228();
                default:
                    return null;
            }
        }

        public static KeyboardButton TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            KeyboardInlineButton keyboardInlineButtonFromConstructor = KeyboardInlineButton.fromConstructor(i);
            if (keyboardInlineButtonFromConstructor != null) {
                keyboardInlineButtonFromConstructor.readParams(inputSerializedData, z);
                TL_keyboardButton_layer223 tL_keyboardButton_layer223 = new TL_keyboardButton_layer223();
                tL_keyboardButton_layer223.text = keyboardInlineButtonFromConstructor.text;
                tL_keyboardButton_layer223.type = new TL_buttonTypeDefault();
                return tL_keyboardButton_layer223;
            }
            return (KeyboardButton) TLObject.TLdeserialize(KeyboardButton.class, fromConstructor(i), inputSerializedData, i, z);
        }
    }

    public static class TL_keyboardButton extends KeyboardButton {
        public static final int constructor = 795322159;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.type = ButtonType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(795322159);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            this.type.serializeToStream(outputSerializedData);
        }

        @Override
        public ButtonTypeProto getType() {
            return this.type;
        }

        @Override
        public String getText() {
            return this.text;
        }
    }

    public static class TL_keyboardInlineButton extends KeyboardInlineButton {
        public static final int constructor = 297902882;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.type = InlineButtonType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(297902882);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            this.type.serializeToStream(outputSerializedData);
        }

        @Override
        public ButtonTypeProto getType() {
            return this.type;
        }

        @Override
        public String getText() {
            return this.text;
        }
    }

    public static class TL_keyboardInlineButton_legacy extends TL_keyboardInlineButton {
        public static final int constructor = -1675883435;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.type = InlineButtonType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1675883435);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            this.type.serializeToStream(outputSerializedData);
        }
    }

    private static class TL_keyboardButton_layer228 extends TL_keyboardButton {
        public static final int constructor = 2098662655;

        private TL_keyboardButton_layer228() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.type = new TL_buttonTypeDefault();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2098662655);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButton_layer223 extends TL_keyboardButton {
        public static final int constructor = -1560655744;

        private TL_keyboardButton_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.type = new TL_buttonTypeDefault();
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1560655744);
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonRequestPhone_layer228 extends TL_keyboardButton {
        public static final int constructor = 1098841487;

        private TL_keyboardButtonRequestPhone_layer228() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_buttonTypeRequestPhone();
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1098841487);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonRequestPhone_layer223 extends TL_keyboardButtonRequestPhone_layer228 {
        public static final int constructor = -1318425559;

        private TL_keyboardButtonRequestPhone_layer223() {
            super();
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_buttonTypeRequestPhone();
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1318425559);
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonGame_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -1983540999;

        private TL_keyboardButtonGame_layer228() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_inlineButtonTypeGame();
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1983540999);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonGame_layer223 extends TL_keyboardButtonGame_layer228 {
        public static final int constructor = 1358175439;

        private TL_keyboardButtonGame_layer223() {
            super();
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_inlineButtonTypeGame();
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1358175439);
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonUrl_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -670292500;
        public final TL_inlineButtonTypeUrl mType;

        public TL_keyboardButtonUrl_layer228() {
            TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_inlineButtonTypeUrl();
            this.mType = tL_inlineButtonTypeUrl;
            this.type = tL_inlineButtonTypeUrl;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-670292500);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.url);
        }
    }

    private static class TL_keyboardButtonUrl_layer223 extends TL_keyboardButtonUrl_layer228 {
        public static final int constructor = 629866245;

        private TL_keyboardButtonUrl_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(629866245);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.url);
        }
    }

    private static class TL_keyboardButtonRequestGeoLocation_layer228 extends TL_keyboardButton {
        public static final int constructor = -1438582451;

        private TL_keyboardButtonRequestGeoLocation_layer228() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_buttonTypeRequestGeoLocation();
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1438582451);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonRequestGeoLocation_layer223 extends TL_keyboardButtonRequestGeoLocation_layer228 {
        public static final int constructor = -59151553;

        private TL_keyboardButtonRequestGeoLocation_layer223() {
            super();
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_buttonTypeRequestGeoLocation();
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-59151553);
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonUrlAuth_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -183499015;
        public final TL_inlineButtonTypeUrlAuth mType;

        public TL_keyboardButtonUrlAuth_layer228() {
            TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = new TL_inlineButtonTypeUrlAuth();
            this.mType = tL_inlineButtonTypeUrlAuth;
            this.type = tL_inlineButtonTypeUrlAuth;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.mType.fwd_text = inputSerializedData.readString(z);
            }
            this.mType.url = inputSerializedData.readString(z);
            this.mType.button_id = inputSerializedData.readInt32(z);
            this.mType.flags = this.flags & 1;
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-183499015);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.fwd_text != null);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 1024, this.style != null);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.mType.fwd_text);
            }
            outputSerializedData.writeString(this.mType.url);
            outputSerializedData.writeInt32(this.mType.button_id);
        }
    }

    private static class TL_keyboardButtonUrlAuth_layer223 extends TL_keyboardButtonUrlAuth_layer228 {
        public static final int constructor = 280464681;

        private TL_keyboardButtonUrlAuth_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.text = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.mType.fwd_text = inputSerializedData.readString(z);
            }
            this.mType.url = inputSerializedData.readString(z);
            this.mType.button_id = inputSerializedData.readInt32(z);
            this.mType.flags = this.flags & 1;
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(280464681);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.text);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.mType.fwd_text);
            }
            outputSerializedData.writeString(this.mType.url);
            outputSerializedData.writeInt32(this.mType.button_id);
        }
    }

    private static class TL_inputKeyboardButtonUrlAuth_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = 1744911986;
        public final TL_inputInlineButtonTypeUrlAuth mType;

        public TL_inputKeyboardButtonUrlAuth_layer228() {
            TL_inputInlineButtonTypeUrlAuth tL_inputInlineButtonTypeUrlAuth = new TL_inputInlineButtonTypeUrlAuth();
            this.mType = tL_inputInlineButtonTypeUrlAuth;
            this.type = tL_inputInlineButtonTypeUrlAuth;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.mType.request_write_access = TLObject.hasFlag(this.flags, 1);
            this.text = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.mType.fwd_text = inputSerializedData.readString(z);
            }
            this.mType.url = inputSerializedData.readString(z);
            this.mType.bot = TLRPC.InputUser.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            TL_inputInlineButtonTypeUrlAuth tL_inputInlineButtonTypeUrlAuth = this.mType;
            tL_inputInlineButtonTypeUrlAuth.flags = TLObject.setFlag(tL_inputInlineButtonTypeUrlAuth.flags, 1, tL_inputInlineButtonTypeUrlAuth.request_write_access);
            TL_inputInlineButtonTypeUrlAuth tL_inputInlineButtonTypeUrlAuth2 = this.mType;
            tL_inputInlineButtonTypeUrlAuth2.flags = TLObject.setFlag(tL_inputInlineButtonTypeUrlAuth2.flags, 2, tL_inputInlineButtonTypeUrlAuth2.fwd_text != null);
            TL_inputInlineButtonTypeUrlAuth tL_inputInlineButtonTypeUrlAuth3 = this.mType;
            tL_inputInlineButtonTypeUrlAuth3.flags = TLObject.setFlag(tL_inputInlineButtonTypeUrlAuth3.flags, 4, tL_inputInlineButtonTypeUrlAuth3.bot != null);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1744911986);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.request_write_access);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 1024, this.style != null);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            String str = this.mType.fwd_text;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
            outputSerializedData.writeString(this.mType.url);
            this.mType.bot.serializeToStream(outputSerializedData);
        }
    }

    private static class TL_inputKeyboardButtonUrlAuth_layer223 extends TL_inputKeyboardButtonUrlAuth_layer228 {
        public static final int constructor = -802258988;

        private TL_inputKeyboardButtonUrlAuth_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.request_write_access = TLObject.hasFlag(int32, 1);
            this.text = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.mType.fwd_text = inputSerializedData.readString(z);
            }
            this.mType.url = inputSerializedData.readString(z);
            this.mType.bot = TLRPC.InputUser.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            TL_inputInlineButtonTypeUrlAuth tL_inputInlineButtonTypeUrlAuth = this.mType;
            tL_inputInlineButtonTypeUrlAuth.flags = TLObject.setFlag(tL_inputInlineButtonTypeUrlAuth.flags, 1, tL_inputInlineButtonTypeUrlAuth.request_write_access);
            TL_inputInlineButtonTypeUrlAuth tL_inputInlineButtonTypeUrlAuth2 = this.mType;
            tL_inputInlineButtonTypeUrlAuth2.flags = TLObject.setFlag(tL_inputInlineButtonTypeUrlAuth2.flags, 2, tL_inputInlineButtonTypeUrlAuth2.fwd_text != null);
            TL_inputInlineButtonTypeUrlAuth tL_inputInlineButtonTypeUrlAuth3 = this.mType;
            tL_inputInlineButtonTypeUrlAuth3.flags = TLObject.setFlag(tL_inputInlineButtonTypeUrlAuth3.flags, 4, tL_inputInlineButtonTypeUrlAuth3.bot != null);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-802258988);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.request_write_access);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.text);
            String str = this.mType.fwd_text;
            if (str != null) {
                outputSerializedData.writeString(str);
            }
            outputSerializedData.writeString(this.mType.url);
            this.mType.bot.serializeToStream(outputSerializedData);
        }
    }

    private static class TL_keyboardButtonRequestPoll_layer228 extends TL_keyboardButton {
        public static final int constructor = 2047989634;
        public final TL_buttonTypeRequestPoll mType;

        public TL_keyboardButtonRequestPoll_layer228() {
            TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = new TL_buttonTypeRequestPoll();
            this.mType = tL_buttonTypeRequestPoll;
            this.type = tL_buttonTypeRequestPoll;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = this.mType;
            int i = this.flags;
            tL_buttonTypeRequestPoll.flags = i & 1;
            if (TLObject.hasFlag(i, 1)) {
                this.mType.quiz = inputSerializedData.readBool(z);
            }
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2047989634);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.mType.quiz);
            }
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonRequestPoll_layer223 extends TL_keyboardButtonRequestPoll_layer228 {
        public static final int constructor = -1144565411;

        private TL_keyboardButtonRequestPoll_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.flags = int32 & 1;
            if (TLObject.hasFlag(int32, 1)) {
                this.mType.quiz = inputSerializedData.readBool(z);
            }
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1144565411);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.mType.quiz);
            }
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonBuy_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = 1067792645;

        private TL_keyboardButtonBuy_layer228() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_inlineButtonTypeBuy();
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1067792645);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonBuy_layer223 extends TL_keyboardButtonBuy_layer228 {
        public static final int constructor = -1344716869;

        private TL_keyboardButtonBuy_layer223() {
            super();
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.type = new TL_inlineButtonTypeBuy();
            this.text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1344716869);
            outputSerializedData.writeString(this.text);
        }
    }

    private static class TL_keyboardButtonCopy_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -1127960816;
        public final TL_inlineButtonTypeCopy mType;

        public TL_keyboardButtonCopy_layer228() {
            TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_inlineButtonTypeCopy();
            this.mType = tL_inlineButtonTypeCopy;
            this.type = tL_inlineButtonTypeCopy;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.copy_text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1127960816);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.copy_text);
        }
    }

    private static class TL_keyboardButtonCopy_layer223 extends TL_keyboardButtonCopy_layer228 {
        public static final int constructor = 1976723854;

        private TL_keyboardButtonCopy_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.copy_text = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1976723854);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.copy_text);
        }
    }

    private static class TL_inputKeyboardButtonUserProfile_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = 2103314375;
        public final TL_inputInlineButtonTypeUserProfile mType;

        public TL_inputKeyboardButtonUserProfile_layer228() {
            TL_inputInlineButtonTypeUserProfile tL_inputInlineButtonTypeUserProfile = new TL_inputInlineButtonTypeUserProfile();
            this.mType = tL_inputInlineButtonTypeUserProfile;
            this.type = tL_inputInlineButtonTypeUserProfile;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.user_id = TLRPC.InputUser.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2103314375);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            this.mType.user_id.serializeToStream(outputSerializedData);
        }
    }

    private static class TL_inputKeyboardButtonUserProfile_layer223 extends TL_inputKeyboardButtonUserProfile_layer228 {
        public static final int constructor = -376962181;

        private TL_inputKeyboardButtonUserProfile_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.user_id = TLRPC.InputUser.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-376962181);
            outputSerializedData.writeString(this.text);
            this.mType.user_id.serializeToStream(outputSerializedData);
        }
    }

    private static class TL_keyboardButtonUserProfile_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -1057137399;
        public final TL_inlineButtonTypeUserProfile mType;

        public TL_keyboardButtonUserProfile_layer228() {
            TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_inlineButtonTypeUserProfile();
            this.mType = tL_inlineButtonTypeUserProfile;
            this.type = tL_inlineButtonTypeUserProfile;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.user_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1057137399);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeInt64(this.mType.user_id);
        }
    }

    private static class TL_keyboardButtonUserProfile_layer223 extends TL_keyboardButtonUserProfile_layer228 {
        public static final int constructor = 814112961;

        private TL_keyboardButtonUserProfile_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.user_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(814112961);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeInt64(this.mType.user_id);
        }
    }

    private static class TL_keyboardButtonWebView_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -398020192;
        public final TL_inlineButtonTypeWebView mType;

        public TL_keyboardButtonWebView_layer228() {
            TL_inlineButtonTypeWebView tL_inlineButtonTypeWebView = new TL_inlineButtonTypeWebView();
            this.mType = tL_inlineButtonTypeWebView;
            this.type = tL_inlineButtonTypeWebView;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-398020192);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.url);
        }
    }

    private static class TL_keyboardButtonWebView_layer223 extends TL_keyboardButtonWebView_layer228 {
        public static final int constructor = 326529584;

        private TL_keyboardButtonWebView_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(326529584);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.url);
        }
    }

    private static class TL_keyboardButtonSimpleWebView_layer228 extends TL_keyboardButton {
        public static final int constructor = -514047120;
        public final TL_buttonTypeSimpleWebView mType;

        public TL_keyboardButtonSimpleWebView_layer228() {
            TL_buttonTypeSimpleWebView tL_buttonTypeSimpleWebView = new TL_buttonTypeSimpleWebView();
            this.mType = tL_buttonTypeSimpleWebView;
            this.type = tL_buttonTypeSimpleWebView;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-514047120);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.url);
        }
    }

    private static class TL_keyboardButtonSimpleWebView_layer223 extends TL_keyboardButtonSimpleWebView_layer228 {
        public static final int constructor = -1598009252;

        private TL_keyboardButtonSimpleWebView_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1598009252);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.url);
        }
    }

    private static class TL_keyboardButtonRequestPeer_layer228 extends TL_keyboardButton {
        public static final int constructor = 1527715317;
        public final TL_buttonTypeRequestPeer mType;

        public TL_keyboardButtonRequestPeer_layer228() {
            TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = new TL_buttonTypeRequestPeer();
            this.mType = tL_buttonTypeRequestPeer;
            this.type = tL_buttonTypeRequestPeer;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.button_id = inputSerializedData.readInt32(z);
            this.mType.peer_type = TLRPC.RequestPeerType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.mType.max_quantity = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1527715317);
            int flag = TLObject.setFlag(this.flags, 1024, this.style != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeInt32(this.mType.button_id);
            this.mType.peer_type.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.mType.max_quantity);
        }
    }

    private static class TL_keyboardButtonRequestPeer_layer223 extends TL_keyboardButtonRequestPeer_layer228 {
        public static final int constructor = 1406648280;

        private TL_keyboardButtonRequestPeer_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.button_id = inputSerializedData.readInt32(z);
            this.mType.peer_type = TLRPC.RequestPeerType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.mType.max_quantity = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1406648280);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeInt32(this.mType.button_id);
            this.mType.peer_type.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.mType.max_quantity);
        }
    }

    private static class TL_keyboardButtonRequestPeer_layer168 extends TL_keyboardButtonRequestPeer_layer228 {
        public static final int constructor = 218842764;

        private TL_keyboardButtonRequestPeer_layer168() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.button_id = inputSerializedData.readInt32(z);
            this.mType.peer_type = TLRPC.RequestPeerType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(218842764);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeInt32(this.mType.button_id);
            this.mType.peer_type.serializeToStream(outputSerializedData);
        }
    }

    private static class TL_keyboardButtonCallback_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -433338016;
        public final TL_inlineButtonTypeCallback mType;

        public TL_keyboardButtonCallback_layer228() {
            TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = new TL_inlineButtonTypeCallback();
            this.mType = tL_inlineButtonTypeCallback;
            this.type = tL_inlineButtonTypeCallback;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.requires_password = TLObject.hasFlag(int32, 1);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.data = inputSerializedData.readByteArray(z);
            TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = this.mType;
            tL_inlineButtonTypeCallback.flags = TLObject.setFlag(tL_inlineButtonTypeCallback.flags, 1, tL_inlineButtonTypeCallback.requires_password);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-433338016);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.requires_password);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 1024, this.style != null);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeByteArray(this.mType.data);
        }
    }

    private static class TL_keyboardButtonCallback_layer223 extends TL_keyboardButtonCallback_layer228 {
        public static final int constructor = 901503851;

        private TL_keyboardButtonCallback_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.requires_password = TLObject.hasFlag(int32, 1);
            this.text = inputSerializedData.readString(z);
            this.mType.data = inputSerializedData.readByteArray(z);
            TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = this.mType;
            tL_inlineButtonTypeCallback.flags = TLObject.setFlag(tL_inlineButtonTypeCallback.flags, 1, tL_inlineButtonTypeCallback.requires_password);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(901503851);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.requires_password);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeByteArray(this.mType.data);
        }
    }

    private static class TL_keyboardButtonCallback_layer117 extends TL_keyboardButtonCallback_layer228 {
        public static final int constructor = 1748655686;

        private TL_keyboardButtonCallback_layer117() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.text = inputSerializedData.readString(z);
            this.mType.data = inputSerializedData.readByteArray(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1748655686);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeByteArray(this.mType.data);
        }
    }

    private static class TL_keyboardButtonSwitchInline_layer228 extends TL_keyboardInlineButton {
        public static final int constructor = -1726768644;
        public final TL_inlineButtonTypeSwitchInline mType;

        public TL_keyboardButtonSwitchInline_layer228() {
            TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = new TL_inlineButtonTypeSwitchInline();
            this.mType = tL_inlineButtonTypeSwitchInline;
            this.type = tL_inlineButtonTypeSwitchInline;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            if (TLObject.hasFlag(int32, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.mType.same_peer = TLObject.hasFlag(this.flags, 1);
            this.text = inputSerializedData.readString(z);
            this.mType.query = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.mType.peer_types = Vector.deserialize(inputSerializedData, new TLRPC$TL_messages_preparedInlineMessage$$ExternalSyntheticLambda0(), z);
            }
            TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = this.mType;
            tL_inlineButtonTypeSwitchInline.flags = TLObject.setFlag(tL_inlineButtonTypeSwitchInline.flags, 1, tL_inlineButtonTypeSwitchInline.same_peer);
            TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline2 = this.mType;
            tL_inlineButtonTypeSwitchInline2.flags = TLObject.setFlag(tL_inlineButtonTypeSwitchInline2.flags, 2, tL_inlineButtonTypeSwitchInline2.peer_types != null);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1726768644);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.same_peer);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 1024, this.style != null);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.query);
            ArrayList<TLRPC.InlineQueryPeerType> arrayList = this.mType.peer_types;
            if (arrayList != null) {
                Vector.serialize(outputSerializedData, arrayList);
            }
        }
    }

    private static class TL_keyboardButtonSwitchInline_layer223 extends TL_keyboardButtonSwitchInline_layer228 {
        public static final int constructor = -1816527947;

        private TL_keyboardButtonSwitchInline_layer223() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.same_peer = TLObject.hasFlag(int32, 1);
            this.text = inputSerializedData.readString(z);
            this.mType.query = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.mType.peer_types = Vector.deserialize(inputSerializedData, new TLRPC$TL_messages_preparedInlineMessage$$ExternalSyntheticLambda0(), z);
            }
            TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = this.mType;
            tL_inlineButtonTypeSwitchInline.flags = TLObject.setFlag(tL_inlineButtonTypeSwitchInline.flags, 1, tL_inlineButtonTypeSwitchInline.same_peer);
            TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline2 = this.mType;
            tL_inlineButtonTypeSwitchInline2.flags = TLObject.setFlag(tL_inlineButtonTypeSwitchInline2.flags, 2, tL_inlineButtonTypeSwitchInline2.peer_types != null);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1816527947);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.same_peer);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.query);
            ArrayList<TLRPC.InlineQueryPeerType> arrayList = this.mType.peer_types;
            if (arrayList != null) {
                Vector.serialize(outputSerializedData, arrayList);
            }
        }
    }

    private static class TL_keyboardButtonSwitchInline_layer157 extends TL_keyboardButtonSwitchInline_layer228 {
        public static final int constructor = 90744648;

        private TL_keyboardButtonSwitchInline_layer157() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.same_peer = TLObject.hasFlag(int32, 1);
            this.text = inputSerializedData.readString(z);
            this.mType.query = inputSerializedData.readString(z);
            TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = this.mType;
            tL_inlineButtonTypeSwitchInline.flags = TLObject.setFlag(tL_inlineButtonTypeSwitchInline.flags, 1, tL_inlineButtonTypeSwitchInline.same_peer);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(90744648);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.same_peer);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeString(this.mType.query);
        }
    }

    private static class TL_inputKeyboardButtonRequestPeer_layer228 extends TL_keyboardButton {
        public static final int constructor = 45580630;
        public final TL_inputButtonTypeRequestPeer mType;

        public TL_inputKeyboardButtonRequestPeer_layer228() {
            TL_inputButtonTypeRequestPeer tL_inputButtonTypeRequestPeer = new TL_inputButtonTypeRequestPeer();
            this.mType = tL_inputButtonTypeRequestPeer;
            this.type = tL_inputButtonTypeRequestPeer;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.name_requested = TLObject.hasFlag(int32, 1);
            this.mType.username_requested = TLObject.hasFlag(this.flags, 2);
            this.mType.photo_requested = TLObject.hasFlag(this.flags, 4);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style = KeyboardButtonStyle.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.text = inputSerializedData.readString(z);
            this.mType.button_id = inputSerializedData.readInt32(z);
            this.mType.peer_type = TLRPC.RequestPeerType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.mType.max_quantity = inputSerializedData.readInt32(z);
            TL_inputButtonTypeRequestPeer tL_inputButtonTypeRequestPeer = this.mType;
            tL_inputButtonTypeRequestPeer.flags = TLObject.setFlag(tL_inputButtonTypeRequestPeer.flags, 1, tL_inputButtonTypeRequestPeer.name_requested);
            TL_inputButtonTypeRequestPeer tL_inputButtonTypeRequestPeer2 = this.mType;
            tL_inputButtonTypeRequestPeer2.flags = TLObject.setFlag(tL_inputButtonTypeRequestPeer2.flags, 2, tL_inputButtonTypeRequestPeer2.username_requested);
            TL_inputButtonTypeRequestPeer tL_inputButtonTypeRequestPeer3 = this.mType;
            tL_inputButtonTypeRequestPeer3.flags = TLObject.setFlag(tL_inputButtonTypeRequestPeer3.flags, 4, tL_inputButtonTypeRequestPeer3.photo_requested);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(45580630);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.name_requested);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.mType.username_requested);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.mType.photo_requested);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 1024, this.style != null);
            this.flags = flag4;
            outputSerializedData.writeInt32(flag4);
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.style.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeInt32(this.mType.button_id);
            this.mType.peer_type.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.mType.max_quantity);
        }
    }

    private static class TL_inputKeyboardButtonRequestPeer_layer221 extends TL_inputKeyboardButtonRequestPeer_layer228 {
        public static final int constructor = -916050683;

        private TL_inputKeyboardButtonRequestPeer_layer221() {
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.mType.name_requested = TLObject.hasFlag(int32, 1);
            this.mType.username_requested = TLObject.hasFlag(this.flags, 2);
            this.mType.photo_requested = TLObject.hasFlag(this.flags, 4);
            this.text = inputSerializedData.readString(z);
            this.mType.button_id = inputSerializedData.readInt32(z);
            this.mType.peer_type = TLRPC.RequestPeerType.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.mType.max_quantity = inputSerializedData.readInt32(z);
            TL_inputButtonTypeRequestPeer tL_inputButtonTypeRequestPeer = this.mType;
            tL_inputButtonTypeRequestPeer.flags = TLObject.setFlag(tL_inputButtonTypeRequestPeer.flags, 1, tL_inputButtonTypeRequestPeer.name_requested);
            TL_inputButtonTypeRequestPeer tL_inputButtonTypeRequestPeer2 = this.mType;
            tL_inputButtonTypeRequestPeer2.flags = TLObject.setFlag(tL_inputButtonTypeRequestPeer2.flags, 2, tL_inputButtonTypeRequestPeer2.username_requested);
            TL_inputButtonTypeRequestPeer tL_inputButtonTypeRequestPeer3 = this.mType;
            tL_inputButtonTypeRequestPeer3.flags = TLObject.setFlag(tL_inputButtonTypeRequestPeer3.flags, 4, tL_inputButtonTypeRequestPeer3.photo_requested);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-916050683);
            int flag = TLObject.setFlag(this.flags, 1, this.mType.name_requested);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.mType.username_requested);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.mType.photo_requested);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeString(this.text);
            outputSerializedData.writeInt32(this.mType.button_id);
            this.mType.peer_type.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.mType.max_quantity);
        }
    }
}
