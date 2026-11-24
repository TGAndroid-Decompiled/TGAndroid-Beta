package org.telegram.tgnet.tl;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Wallet.WalletEngine2;
public class TL_wallet {

    public static class InputWalletReplacement extends TLObject {
        public static InputWalletReplacement TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject inputwalletnew;
            if (i != 1671708892) {
                if (i != 1722182203) {
                    inputwalletnew = null;
                } else {
                    inputwalletnew = new inputWalletImported();
                }
            } else {
                inputwalletnew = new inputWalletNew();
            }
            return (InputWalletReplacement) TLObject.TLdeserialize(InputWalletReplacement.class, inputwalletnew, inputSerializedData, i, z);
        }
    }

    public static class TL_walletState extends WalletState {
        public static final int constructor = -1782238101;
        public String address;
        public boolean backup_enabled;
        public long balance;
        public boolean can_enable_backup;
        public boolean can_export_phrase;
        public byte[] public_key;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.backup_enabled = TLObject.hasFlag(readInt32, 1);
            this.can_export_phrase = TLObject.hasFlag(readInt32, 2);
            this.can_enable_backup = TLObject.hasFlag(readInt32, 4);
            this.address = inputSerializedData.readString(z);
            this.public_key = inputSerializedData.readByteArray(z);
            this.balance = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1782238101);
            outputSerializedData.writeInt32(TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.backup_enabled), 2, this.can_export_phrase), 4, this.can_enable_backup));
            outputSerializedData.writeString(this.address);
            outputSerializedData.writeByteArray(this.public_key);
            outputSerializedData.writeInt64(this.balance);
        }
    }

    public static class TL_walletStateEmpty extends WalletState {
        public static final int constructor = -1665551636;
        public boolean creating;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.creating = TLObject.hasFlag(inputSerializedData.readInt32(z), 1);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1665551636);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.creating));
        }
    }

    public static class WalletOnchainGiftAction extends TLObject {
        public static WalletOnchainGiftAction TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject walletonchaingiftactiondelist;
            switch (i) {
                case -1710739570:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionDelist();
                    break;
                case -978823956:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionOfferDecline();
                    break;
                case -628781360:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionOfferExpire();
                    break;
                case -451948018:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionOfferCreate();
                    break;
                case -187298232:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionOfferAccept();
                    break;
                case -114117331:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionBuy();
                    break;
                case 1208637885:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionChangePrice();
                    break;
                case 1707653005:
                    walletonchaingiftactiondelist = new walletOnchainGiftActionOfferCancel();
                    break;
                default:
                    walletonchaingiftactiondelist = null;
                    break;
            }
            return (WalletOnchainGiftAction) TLObject.TLdeserialize(WalletOnchainGiftAction.class, walletonchaingiftactiondelist, inputSerializedData, i, z);
        }

        public boolean equals(Object obj) {
            if (obj != null && obj.getClass() == getClass()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }

    public static class WalletState extends TLObject {
        public static WalletState TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_walletState;
            if (i != -1782238101) {
                if (i != -1665551636) {
                    tL_walletState = null;
                } else {
                    tL_walletState = new TL_walletStateEmpty();
                }
            } else {
                tL_walletState = new TL_walletState();
            }
            return (WalletState) TLObject.TLdeserialize(WalletState.class, tL_walletState, inputSerializedData, i, z);
        }
    }

    public static class WalletTransactionPeer extends TLObject {
        public String address;
        public long channel_id;
        public String domain;
        public long user_id;

        public static WalletTransactionPeer TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject wallettransactionpeeruser;
            switch (i) {
                case -722833299:
                    wallettransactionpeeruser = new walletTransactionPeerUser();
                    break;
                case -443213714:
                    wallettransactionpeeruser = new walletTransactionPeerOnramp();
                    break;
                case -193817447:
                    wallettransactionpeeruser = new walletTransactionPeerTelegramGift();
                    break;
                case 103596476:
                    wallettransactionpeeruser = new walletTransactionPeerAddress();
                    break;
                case 1257549816:
                    wallettransactionpeeruser = new walletTransactionPeerOnchainGift();
                    break;
                case 1424428081:
                    wallettransactionpeeruser = new walletTransactionPeerChannel();
                    break;
                case 1921772890:
                    wallettransactionpeeruser = new walletTransactionPeerUnsupported();
                    break;
                default:
                    wallettransactionpeeruser = null;
                    break;
            }
            return (WalletTransactionPeer) TLObject.TLdeserialize(WalletTransactionPeer.class, wallettransactionpeeruser, inputSerializedData, i, z);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WalletTransactionPeer)) {
                return false;
            }
            WalletTransactionPeer walletTransactionPeer = (WalletTransactionPeer) obj;
            if (walletTransactionPeer instanceof walletTransactionPeerUser) {
                if (!(this instanceof walletTransactionPeerUser)) {
                    return false;
                }
                walletTransactionPeerUser wallettransactionpeeruser = (walletTransactionPeerUser) this;
                walletTransactionPeerUser wallettransactionpeeruser2 = (walletTransactionPeerUser) walletTransactionPeer;
                if (wallettransactionpeeruser.user_id != wallettransactionpeeruser2.user_id || !TextUtils.equals(wallettransactionpeeruser.address, wallettransactionpeeruser2.address)) {
                    return false;
                }
                return true;
            } else if (walletTransactionPeer instanceof walletTransactionPeerChannel) {
                if (!(this instanceof walletTransactionPeerChannel)) {
                    return false;
                }
                walletTransactionPeerChannel wallettransactionpeerchannel = (walletTransactionPeerChannel) this;
                walletTransactionPeerChannel wallettransactionpeerchannel2 = (walletTransactionPeerChannel) walletTransactionPeer;
                if (wallettransactionpeerchannel.channel_id != wallettransactionpeerchannel2.channel_id || !TextUtils.equals(wallettransactionpeerchannel.address, wallettransactionpeerchannel2.address)) {
                    return false;
                }
                return true;
            } else if (walletTransactionPeer instanceof walletTransactionPeerAddress) {
                if (!(this instanceof walletTransactionPeerAddress)) {
                    return false;
                }
                return TextUtils.equals(((walletTransactionPeerAddress) this).address, ((walletTransactionPeerAddress) walletTransactionPeer).address);
            } else if (walletTransactionPeer instanceof walletTransactionPeerTelegramGift) {
                if (!(this instanceof walletTransactionPeerTelegramGift) || ((walletTransactionPeerTelegramGift) this).own_profile != ((walletTransactionPeerTelegramGift) walletTransactionPeer).own_profile) {
                    return false;
                }
                return true;
            } else if (walletTransactionPeer instanceof walletTransactionPeerOnchainGift) {
                if (!(this instanceof walletTransactionPeerOnchainGift)) {
                    return false;
                }
                return Objects.equals(((walletTransactionPeerOnchainGift) this).action, ((walletTransactionPeerOnchainGift) walletTransactionPeer).action);
            } else if (!(walletTransactionPeer instanceof walletTransactionPeerUnsupported)) {
                return false;
            } else {
                return this instanceof walletTransactionPeerUnsupported;
            }
        }
    }

    public static class card extends TLObject {
        public static final int constructor = -1898953807;
        public String address;
        public long balance;
        public nftItem bg_nft_item;
        public ArrayList<cardSticker> stickers = new ArrayList<>();

        public static card TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            card cardVar;
            if (-1898953807 != i) {
                cardVar = null;
            } else {
                cardVar = new card();
            }
            return (card) TLObject.TLdeserialize(card.class, cardVar, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.stickers = Vector.deserialize(inputSerializedData, new tfb((byte) 21), z);
            }
            if (TLObject.hasFlag(readInt32, 2)) {
                this.bg_nft_item = nftItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.address = inputSerializedData.readString(z);
            this.balance = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-1898953807);
            ArrayList<cardSticker> arrayList = this.stickers;
            boolean z2 = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            if (this.bg_nft_item != null) {
                z2 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(flag2, 1)) {
                Vector.serialize(outputSerializedData, this.stickers);
            }
            if (TLObject.hasFlag(flag2, 2)) {
                this.bg_nft_item.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.address);
            outputSerializedData.writeInt64(this.balance);
        }
    }

    public static class cardSticker extends TLObject {
        public static final int constructor = -218035014;
        public TL_stories.MediaAreaCoordinates coordinates;
        public nftItem nft;

        public static cardSticker TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            cardSticker cardsticker;
            if (-218035014 != i) {
                cardsticker = null;
            } else {
                cardsticker = new cardSticker();
            }
            return (cardSticker) TLObject.TLdeserialize(cardSticker.class, cardsticker, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = TL_stories.MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.nft = nftItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-218035014);
            this.coordinates.serializeToStream(outputSerializedData);
            this.nft.serializeToStream(outputSerializedData);
        }
    }

    public static class currencyRate extends TLObject {
        public static final int constructor = 819557436;
        public String currency;
        public String decimalSeparator;
        public boolean dropZeros;
        public int exp;
        public double rate;
        public boolean spaceBetween;
        public String symbol;
        public boolean symbolLeft;
        public String thousandsSeparator;
        public String title;
        public String translatedTitle;

        public static currencyRate TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            currencyRate currencyrate;
            if (819557436 != i) {
                currencyrate = null;
            } else {
                currencyrate = new currencyRate();
            }
            return (currencyRate) TLObject.TLdeserialize(currencyRate.class, currencyrate, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.currency = inputSerializedData.readString(z);
            this.rate = inputSerializedData.readDouble(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(819557436);
            outputSerializedData.writeString(this.currency);
            outputSerializedData.writeDouble(this.rate);
        }
    }

    public static class currencyRates extends TLObject {
        public static final int constructor = -1144199998;
        public ArrayList<currencyRate> rates = new ArrayList<>();

        public static currencyRates TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            currencyRates currencyrates;
            if (-1144199998 != i) {
                currencyrates = null;
            } else {
                currencyrates = new currencyRates();
            }
            return (currencyRates) TLObject.TLdeserialize(currencyRates.class, currencyrates, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.rates = Vector.deserialize(inputSerializedData, new tfb((byte) 22), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1144199998);
            Vector.serialize(outputSerializedData, this.rates);
        }
    }

    public static class encryptedSecretPhrasePart extends TLObject {
        public static final int constructor = 417867063;
        public byte[] data;

        public static encryptedSecretPhrasePart TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            encryptedSecretPhrasePart encryptedsecretphrasepart;
            if (417867063 != i) {
                encryptedsecretphrasepart = null;
            } else {
                encryptedsecretphrasepart = new encryptedSecretPhrasePart();
            }
            return (encryptedSecretPhrasePart) TLObject.TLdeserialize(encryptedSecretPhrasePart.class, encryptedsecretphrasepart, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.data = inputSerializedData.readByteArray(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(417867063);
            outputSerializedData.writeByteArray(this.data);
        }
    }

    public static class existingBalance extends TLObject {
        public static final int constructor = -1108800883;
        public boolean has_balance;
        public String url;

        public static existingBalance TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            existingBalance existingbalance;
            if (-1108800883 != i) {
                existingbalance = null;
            } else {
                existingbalance = new existingBalance();
            }
            return (existingBalance) TLObject.TLdeserialize(existingBalance.class, existingbalance, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.has_balance = TLObject.hasFlag(inputSerializedData.readInt32(z), 1);
            this.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1108800883);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.has_balance));
            outputSerializedData.writeString(this.url);
        }
    }

    public static class getBackupHolderDcs extends TLMethod<Vector<holderDc>> {
        public static final int constructor = -780544876;

        @Override
        public Vector<holderDc> deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new tfb((byte) 23));
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-780544876);
        }
    }

    public static class holderDc extends TLObject {
        public static final int constructor = -103410961;
        public int dc;
        public byte[] public_key;

        public static holderDc TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            holderDc holderdc;
            if (-103410961 != i) {
                holderdc = null;
            } else {
                holderdc = new holderDc();
            }
            return (holderDc) TLObject.TLdeserialize(holderDc.class, holderdc, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.dc = inputSerializedData.readInt32(z);
            this.public_key = inputSerializedData.readByteArray(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-103410961);
            outputSerializedData.writeInt32(this.dc);
            outputSerializedData.writeByteArray(this.public_key);
        }
    }

    public static class inputTonConnectOauthSession extends TLObject {
        public static final int constructor = 1654613710;
        public byte[] body;
        public byte[] challenge_answer;
        public walletOwnershipProof proof;
        public long session_id;

        public static inputTonConnectOauthSession TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            inputTonConnectOauthSession inputtonconnectoauthsession;
            if (1654613710 != i) {
                inputtonconnectoauthsession = null;
            } else {
                inputtonconnectoauthsession = new inputTonConnectOauthSession();
            }
            return (inputTonConnectOauthSession) TLObject.TLdeserialize(inputTonConnectOauthSession.class, inputtonconnectoauthsession, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.session_id = inputSerializedData.readInt64(z);
            this.challenge_answer = inputSerializedData.readByteArray(z);
            this.body = inputSerializedData.readByteArray(z);
            this.proof = walletOwnershipProof.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1654613710);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeByteArray(this.challenge_answer);
            outputSerializedData.writeByteArray(this.body);
            this.proof.serializeToStream(outputSerializedData);
        }
    }

    public static class inputWalletCardSticker extends TLObject {
        public static final int constructor = 1474250151;
        public TL_stories.MediaAreaCoordinates coordinates;
        public String nft_address;

        public static inputWalletCardSticker TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            inputWalletCardSticker inputwalletcardsticker;
            if (1474250151 != i) {
                inputwalletcardsticker = null;
            } else {
                inputwalletcardsticker = new inputWalletCardSticker();
            }
            return (inputWalletCardSticker) TLObject.TLdeserialize(inputWalletCardSticker.class, inputwalletcardsticker, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.coordinates = TL_stories.MediaAreaCoordinates.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.nft_address = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1474250151);
            this.coordinates.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.nft_address);
        }
    }

    public static class inputWalletImported extends InputWalletReplacement {
        public static final int constructor = 1722182203;
        public byte[] anchor_public_key;
        public walletOwnershipProof proof;
        public byte[] public_key;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.public_key = inputSerializedData.readByteArray(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.anchor_public_key = inputSerializedData.readByteArray(z);
            }
            this.proof = walletOwnershipProof.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(1722182203);
            if (this.anchor_public_key != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeByteArray(this.public_key);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeByteArray(this.anchor_public_key);
            }
            this.proof.serializeToStream(outputSerializedData);
        }
    }

    public static class inputWalletNew extends InputWalletReplacement {
        public static final int constructor = 1671708892;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1671708892);
        }
    }

    public static class mnemonic_decryptedKeyPart extends TLObject {
        public static final int constructor = -1953440504;
        public byte[] share;

        public static mnemonic_decryptedKeyPart TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
            if (-1953440504 != i) {
                mnemonic_decryptedkeypart = null;
            } else {
                mnemonic_decryptedkeypart = new mnemonic_decryptedKeyPart();
            }
            return (mnemonic_decryptedKeyPart) TLObject.TLdeserialize(mnemonic_decryptedKeyPart.class, mnemonic_decryptedkeypart, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.share = inputSerializedData.readByteArray(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1953440504);
            outputSerializedData.writeByteArray(this.share);
        }
    }

    public static class nftAttribute extends TLObject {
        public static final int constructor = 1277096206;
        public String trait_type;
        public String value;

        public static nftAttribute TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            nftAttribute nftattribute;
            if (1277096206 != i) {
                nftattribute = null;
            } else {
                nftattribute = new nftAttribute();
            }
            return (nftAttribute) TLObject.TLdeserialize(nftAttribute.class, nftattribute, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.trait_type = inputSerializedData.readString(z);
            this.value = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1277096206);
            outputSerializedData.writeString(this.trait_type);
            outputSerializedData.writeString(this.value);
        }
    }

    public static class nftItem extends TLObject {
        public static final int constructor = 389937907;
        public String address;
        public ArrayList<nftAttribute> attributes = new ArrayList<>();
        public String collection_address;
        public TLRPC.WebDocument content_url;
        public String description;
        public TLRPC.TL_dataJSON extra;
        public TL_stars.StarGift gift;
        public TLRPC.WebDocument image;
        public TLRPC.WebDocument image_small;
        public String index;
        public TLRPC.WebDocument lottie;
        public String name;
        public String owner_address;

        public static nftItem TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            nftItem nftitem;
            if (389937907 != i) {
                nftitem = null;
            } else {
                nftitem = new nftItem();
            }
            return (nftItem) TLObject.TLdeserialize(nftItem.class, nftitem, inputSerializedData, i, z);
        }

        public boolean isGift() {
            String str;
            String str2;
            TLRPC.WebDocument webDocument = this.content_url;
            if (webDocument == null || (str2 = webDocument.url) == null || !str2.startsWith("https://nft.fragment.com/gift/")) {
                TLRPC.WebDocument webDocument2 = this.image;
                if (webDocument2 != null && (str = webDocument2.url) != null && str.startsWith("https://nft.fragment.com/gift/")) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public boolean isPhoneNumber() {
            String str;
            String str2;
            TLRPC.WebDocument webDocument = this.content_url;
            if (webDocument == null || (str2 = webDocument.url) == null || !str2.startsWith("https://nft.fragment.com/number/")) {
                TLRPC.WebDocument webDocument2 = this.image;
                if (webDocument2 != null && (str = webDocument2.url) != null && str.startsWith("https://nft.fragment.com/number/")) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public boolean isUsername() {
            String str;
            String str2;
            TLRPC.WebDocument webDocument = this.content_url;
            if (webDocument == null || (str2 = webDocument.url) == null || !str2.startsWith("https://nft.fragment.com/username/")) {
                TLRPC.WebDocument webDocument2 = this.image;
                if (webDocument2 != null && (str = webDocument2.url) != null && str.startsWith("https://nft.fragment.com/username/")) {
                    return true;
                }
                return false;
            }
            return true;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.collection_address = inputSerializedData.readString(z);
            }
            this.address = inputSerializedData.readString(z);
            this.owner_address = inputSerializedData.readString(z);
            this.index = inputSerializedData.readString(z);
            if (TLObject.hasFlag(readInt32, 2)) {
                this.name = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(readInt32, 4)) {
                this.description = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(readInt32, 8)) {
                this.image = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(readInt32, 16)) {
                this.image_small = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(readInt32, 32)) {
                this.content_url = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(readInt32, 64)) {
                this.lottie = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(readInt32, 128)) {
                this.attributes = Vector.deserialize(inputSerializedData, new tfb((byte) 24), z);
            }
            if (TLObject.hasFlag(readInt32, 256)) {
                this.extra = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(readInt32, 512)) {
                this.gift = TL_stars.StarGift.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            outputSerializedData.writeInt32(389937907);
            boolean z10 = false;
            if (this.collection_address != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            if (this.name != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            if (this.description != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z3);
            if (this.image != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 8, z4);
            if (this.image_small != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 16, z5);
            if (this.content_url != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            int flag6 = TLObject.setFlag(flag5, 32, z6);
            if (this.lottie != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            int flag7 = TLObject.setFlag(flag6, 64, z7);
            ArrayList<nftAttribute> arrayList = this.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                z8 = true;
            } else {
                z8 = false;
            }
            int flag8 = TLObject.setFlag(flag7, 128, z8);
            if (this.extra != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            int flag9 = TLObject.setFlag(flag8, 256, z9);
            if (this.gift != null) {
                z10 = true;
            }
            int flag10 = TLObject.setFlag(flag9, 512, z10);
            outputSerializedData.writeInt32(flag10);
            if (TLObject.hasFlag(flag10, 1)) {
                outputSerializedData.writeString(this.collection_address);
            }
            outputSerializedData.writeString(this.address);
            outputSerializedData.writeString(this.owner_address);
            outputSerializedData.writeString(this.index);
            if (TLObject.hasFlag(flag10, 2)) {
                outputSerializedData.writeString(this.name);
            }
            if (TLObject.hasFlag(flag10, 4)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(flag10, 8)) {
                this.image.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag10, 16)) {
                this.image_small.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag10, 32)) {
                this.content_url.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag10, 64)) {
                this.lottie.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag10, 128)) {
                Vector.serialize(outputSerializedData, this.attributes);
            }
            if (TLObject.hasFlag(flag10, 256)) {
                this.extra.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag10, 512)) {
                this.gift.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class nftItems extends TLObject {
        public static final int constructor = 2035107951;
        public ArrayList<nftItem> items = new ArrayList<>();
        public String next_offset;

        public static nftItems TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            nftItems nftitems;
            if (2035107951 != i) {
                nftitems = null;
            } else {
                nftitems = new nftItems();
            }
            return (nftItems) TLObject.TLdeserialize(nftItems.class, nftitems, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.items = Vector.deserialize(inputSerializedData, new tfb((byte) 25), z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(2035107951);
            if (this.next_offset != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            Vector.serialize(outputSerializedData, this.items);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
        }
    }

    public static class proofChallenge extends TLObject {
        public static final int constructor = -1713105145;
        public String domain;
        public int expires;
        public String payload;

        public static proofChallenge TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            proofChallenge proofchallenge;
            if (-1713105145 != i) {
                proofchallenge = null;
            } else {
                proofchallenge = new proofChallenge();
            }
            return (proofChallenge) TLObject.TLdeserialize(proofChallenge.class, proofchallenge, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.payload = inputSerializedData.readString(z);
            this.expires = inputSerializedData.readInt32(z);
            this.domain = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1713105145);
            outputSerializedData.writeString(this.payload);
            outputSerializedData.writeInt32(this.expires);
            outputSerializedData.writeString(this.domain);
        }
    }

    public static class secretPhraseParts extends TLObject {
        public static final int constructor = -422514943;
        public ArrayList<Integer> dcs = new ArrayList<>();
        public String token;

        public static secretPhraseParts TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            secretPhraseParts secretphraseparts;
            if (-422514943 != i) {
                secretphraseparts = null;
            } else {
                secretphraseparts = new secretPhraseParts();
            }
            return (secretPhraseParts) TLObject.TLdeserialize(secretPhraseParts.class, secretphraseparts, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.token = inputSerializedData.readString(z);
            this.dcs = Vector.deserializeInt(inputSerializedData, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-422514943);
            outputSerializedData.writeString(this.token);
            Vector.serializeInt(outputSerializedData, this.dcs);
        }
    }

    public static class tonConnectChallenge extends TLObject {
        public static final int constructor = 1271436947;
        public byte[] challenge;
        public long event_id;

        public static tonConnectChallenge TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            tonConnectChallenge tonconnectchallenge;
            if (1271436947 != i) {
                tonconnectchallenge = null;
            } else {
                tonconnectchallenge = new tonConnectChallenge();
            }
            return (tonConnectChallenge) TLObject.TLdeserialize(tonConnectChallenge.class, tonconnectchallenge, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.challenge = inputSerializedData.readByteArray(z);
            this.event_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1271436947);
            outputSerializedData.writeByteArray(this.challenge);
            outputSerializedData.writeInt64(this.event_id);
        }
    }

    public static class tonConnectManifest extends TLObject {
        public static final int constructor = 304255588;
        public TLRPC.WebDocument icon;
        public String name;
        public String url;

        public static tonConnectManifest TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            tonConnectManifest tonconnectmanifest;
            if (304255588 != i) {
                tonconnectmanifest = null;
            } else {
                tonconnectmanifest = new tonConnectManifest();
            }
            return (tonConnectManifest) TLObject.TLdeserialize(tonConnectManifest.class, tonconnectmanifest, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.url = inputSerializedData.readString(z);
            this.name = inputSerializedData.readString(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.icon = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(304255588);
            if (this.icon != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeString(this.name);
            if (TLObject.hasFlag(flag, 1)) {
                this.icon.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class tonConnectNextEventId extends TLObject {
        public static final int constructor = 1478780131;
        public long event_id;

        public static tonConnectNextEventId TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            tonConnectNextEventId tonconnectnexteventid;
            if (1478780131 != i) {
                tonconnectnexteventid = null;
            } else {
                tonconnectnexteventid = new tonConnectNextEventId();
            }
            return (tonConnectNextEventId) TLObject.TLdeserialize(tonConnectNextEventId.class, tonconnectnexteventid, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.event_id = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1478780131);
            outputSerializedData.writeInt64(this.event_id);
        }
    }

    public static class tonConnectPending extends TLObject {
        public static final int constructor = -2050952924;
        public ArrayList<tonConnectRequest> requests = new ArrayList<>();
        public tonConnectSession session;

        public static tonConnectPending TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            tonConnectPending tonconnectpending;
            if (-2050952924 != i) {
                tonconnectpending = null;
            } else {
                tonconnectpending = new tonConnectPending();
            }
            return (tonConnectPending) TLObject.TLdeserialize(tonConnectPending.class, tonconnectpending, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.session = tonConnectSession.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.requests = Vector.deserialize(inputSerializedData, new tfb((byte) 26), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2050952924);
            this.session.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.requests);
        }
    }

    public static class tonConnectRequest extends TLObject {
        public static final int constructor = -1587575533;
        public byte[] body;
        public int expires;
        public int msg_id;
        public long session_id;
        public String topic;
        public String trace_id;

        public static tonConnectRequest TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            tonConnectRequest tonconnectrequest;
            if (-1587575533 != i) {
                tonconnectrequest = null;
            } else {
                tonconnectrequest = new tonConnectRequest();
            }
            return (tonConnectRequest) TLObject.TLdeserialize(tonConnectRequest.class, tonconnectrequest, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.session_id = inputSerializedData.readInt64(z);
            this.msg_id = inputSerializedData.readInt32(z);
            this.body = inputSerializedData.readByteArray(z);
            this.expires = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.topic = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(readInt32, 2)) {
                this.trace_id = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-1587575533);
            boolean z2 = false;
            if (this.topic != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            if (this.trace_id != null) {
                z2 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeByteArray(this.body);
            outputSerializedData.writeInt32(this.expires);
            if (TLObject.hasFlag(flag2, 1)) {
                outputSerializedData.writeString(this.topic);
            }
            if (TLObject.hasFlag(flag2, 2)) {
                outputSerializedData.writeString(this.trace_id);
            }
        }
    }

    public static class tonConnectSession extends TLObject {
        public static final int constructor = 308631238;
        public String client_id;
        public boolean closed;
        public boolean closing;
        public String dapp_client_id;
        public int date;
        public long id;
        public tonConnectManifest manifest;
        public Integer manifest_error;
        public byte[] nonce;
        public boolean pending;

        public static tonConnectSession TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            tonConnectSession tonconnectsession;
            if (308631238 != i) {
                tonconnectsession = null;
            } else {
                tonconnectsession = new tonConnectSession();
            }
            return (tonConnectSession) TLObject.TLdeserialize(tonConnectSession.class, tonconnectsession, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.pending = TLObject.hasFlag(readInt32, 1);
            this.closing = TLObject.hasFlag(readInt32, 2);
            this.closed = TLObject.hasFlag(readInt32, 4);
            this.id = inputSerializedData.readInt64(z);
            this.dapp_client_id = inputSerializedData.readString(z);
            if (TLObject.hasFlag(readInt32, 8)) {
                this.client_id = inputSerializedData.readString(z);
            }
            this.nonce = inputSerializedData.readByteArray(z);
            if (TLObject.hasFlag(readInt32, 16)) {
                this.manifest = tonConnectManifest.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(readInt32, 32)) {
                this.manifest_error = Integer.valueOf(inputSerializedData.readInt32(z));
            }
            this.date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            outputSerializedData.writeInt32(308631238);
            boolean z3 = false;
            int flag = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.pending), 2, this.closing), 4, this.closed);
            if (this.client_id != null) {
                z = true;
            } else {
                z = false;
            }
            int flag2 = TLObject.setFlag(flag, 8, z);
            if (this.manifest != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 16, z2);
            if (this.manifest_error != null) {
                z3 = true;
            }
            int flag4 = TLObject.setFlag(flag3, 32, z3);
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeString(this.dapp_client_id);
            if (TLObject.hasFlag(flag4, 8)) {
                outputSerializedData.writeString(this.client_id);
            }
            outputSerializedData.writeByteArray(this.nonce);
            if (TLObject.hasFlag(flag4, 16)) {
                this.manifest.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag4, 32)) {
                outputSerializedData.writeInt32(this.manifest_error.intValue());
            }
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class tonConnectSessions extends TLObject {
        public static final int constructor = 236939414;
        public ArrayList<tonConnectSession> sessions = new ArrayList<>();

        public static tonConnectSessions TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            tonConnectSessions tonconnectsessions;
            if (236939414 != i) {
                tonconnectsessions = null;
            } else {
                tonconnectsessions = new tonConnectSessions();
            }
            return (tonConnectSessions) TLObject.TLdeserialize(tonConnectSessions.class, tonconnectsessions, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.sessions = Vector.deserialize(inputSerializedData, new tfb((byte) 27), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(236939414);
            Vector.serialize(outputSerializedData, this.sessions);
        }
    }

    public static class userAddresses extends TLObject {
        public static final int constructor = -1836156075;
        public ArrayList<walletUserAddress> addresses = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static userAddresses TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            userAddresses useraddresses;
            if (-1836156075 != i) {
                useraddresses = null;
            } else {
                useraddresses = new userAddresses();
            }
            return (userAddresses) TLObject.TLdeserialize(userAddresses.class, useraddresses, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.addresses = Vector.deserialize(inputSerializedData, new tfb((byte) 28), z);
            this.users = Vector.deserialize(inputSerializedData, new c1b((byte) 12), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1836156075);
            Vector.serialize(outputSerializedData, this.addresses);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class walletOnchainGiftActionBuy extends WalletOnchainGiftAction {
        public static final int constructor = -114117331;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-114117331);
        }
    }

    public static class walletOnchainGiftActionChangePrice extends WalletOnchainGiftAction {
        public static final int constructor = 1208637885;
        public int flags;
        public long new_price;
        public long old_price;

        @Override
        public boolean equals(Object obj) {
            if ((obj instanceof walletOnchainGiftActionChangePrice) && obj.getClass() == getClass()) {
                walletOnchainGiftActionChangePrice walletonchaingiftactionchangeprice = (walletOnchainGiftActionChangePrice) obj;
                if (hasOldPrice() == walletonchaingiftactionchangeprice.hasOldPrice() && this.old_price == walletonchaingiftactionchangeprice.old_price && this.new_price == walletonchaingiftactionchangeprice.new_price) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasOldPrice() {
            return TLObject.hasFlag(this.flags, 1);
        }

        @Override
        public int hashCode() {
            return Objects.hash(getClass(), Boolean.valueOf(hasOldPrice()), Long.valueOf(this.old_price), Long.valueOf(this.new_price));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.old_price = inputSerializedData.readInt64(z);
            }
            this.new_price = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1208637885);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.old_price);
            }
            outputSerializedData.writeInt64(this.new_price);
        }
    }

    public static class walletOnchainGiftActionDelist extends WalletOnchainGiftAction {
        public static final int constructor = -1710739570;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1710739570);
        }
    }

    public static class walletOnchainGiftActionOfferAccept extends WalletOnchainGiftAction {
        public static final int constructor = -187298232;
        public boolean buyer;
        public String counterparty_address;
        public int flags;
        public String offer_address;
        public long price;
        public long service_fee;

        @Override
        public boolean equals(Object obj) {
            if ((obj instanceof walletOnchainGiftActionOfferAccept) && obj.getClass() == getClass()) {
                walletOnchainGiftActionOfferAccept walletonchaingiftactionofferaccept = (walletOnchainGiftActionOfferAccept) obj;
                if (this.buyer == walletonchaingiftactionofferaccept.buyer && TextUtils.equals(this.offer_address, walletonchaingiftactionofferaccept.offer_address) && TextUtils.equals(this.counterparty_address, walletonchaingiftactionofferaccept.counterparty_address) && this.price == walletonchaingiftactionofferaccept.price && this.service_fee == walletonchaingiftactionofferaccept.service_fee) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getClass(), Boolean.valueOf(this.buyer), this.offer_address, this.counterparty_address, Long.valueOf(this.price), Long.valueOf(this.service_fee));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.buyer = TLObject.hasFlag(readInt32, 1);
            this.offer_address = inputSerializedData.readString(z);
            this.counterparty_address = inputSerializedData.readString(z);
            this.price = inputSerializedData.readInt64(z);
            this.service_fee = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-187298232);
            int flag = TLObject.setFlag(this.flags, 1, this.buyer);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.offer_address);
            outputSerializedData.writeString(this.counterparty_address);
            outputSerializedData.writeInt64(this.price);
            outputSerializedData.writeInt64(this.service_fee);
        }
    }

    public static class walletOnchainGiftActionOfferCancel extends WalletOnchainGiftAction {
        public static final int constructor = 1707653005;
        public String counterparty_address;
        public long fine;
        public int flags;
        public String offer_address;
        public long price;
        public long refund_amount;

        @Override
        public boolean equals(Object obj) {
            if ((obj instanceof walletOnchainGiftActionOfferCancel) && obj.getClass() == getClass()) {
                walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = (walletOnchainGiftActionOfferCancel) obj;
                if (this.flags == walletonchaingiftactionoffercancel.flags && TextUtils.equals(this.offer_address, walletonchaingiftactionoffercancel.offer_address) && TextUtils.equals(this.counterparty_address, walletonchaingiftactionoffercancel.counterparty_address) && this.price == walletonchaingiftactionoffercancel.price && this.refund_amount == walletonchaingiftactionoffercancel.refund_amount && this.fine == walletonchaingiftactionoffercancel.fine) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getClass(), this.offer_address, this.counterparty_address, Long.valueOf(this.price), Long.valueOf(this.refund_amount), Long.valueOf(this.fine));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.offer_address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.counterparty_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.price = inputSerializedData.readInt64(z);
            }
            this.refund_amount = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fine = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(1707653005);
            int i = this.flags;
            if (this.counterparty_address != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.offer_address);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.counterparty_address);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.price);
            }
            outputSerializedData.writeInt64(this.refund_amount);
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt64(this.fine);
            }
        }
    }

    public static class walletOnchainGiftActionOfferCreate extends WalletOnchainGiftAction {
        public static final int constructor = -451948018;
        public long amount;
        public String counterparty_address;
        public int expires_at;
        public int flags;
        public String offer_address;
        public long price;
        public long service_fee;

        @Override
        public boolean equals(Object obj) {
            if ((obj instanceof walletOnchainGiftActionOfferCreate) && obj.getClass() == getClass()) {
                walletOnchainGiftActionOfferCreate walletonchaingiftactionoffercreate = (walletOnchainGiftActionOfferCreate) obj;
                if (TextUtils.equals(this.offer_address, walletonchaingiftactionoffercreate.offer_address) && TextUtils.equals(this.counterparty_address, walletonchaingiftactionoffercreate.counterparty_address) && this.price == walletonchaingiftactionoffercreate.price && this.amount == walletonchaingiftactionoffercreate.amount && this.service_fee == walletonchaingiftactionoffercreate.service_fee && this.expires_at == walletonchaingiftactionoffercreate.expires_at) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getClass(), this.offer_address, this.counterparty_address, Long.valueOf(this.price), Long.valueOf(this.amount), Long.valueOf(this.service_fee), Integer.valueOf(this.expires_at));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.offer_address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.counterparty_address = inputSerializedData.readString(z);
            }
            this.price = inputSerializedData.readInt64(z);
            this.amount = inputSerializedData.readInt64(z);
            this.service_fee = inputSerializedData.readInt64(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.expires_at = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-451948018);
            int i = this.flags;
            if (this.counterparty_address != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.offer_address);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.counterparty_address);
            }
            outputSerializedData.writeInt64(this.price);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt64(this.service_fee);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.expires_at);
            }
        }
    }

    public static class walletOnchainGiftActionOfferDecline extends WalletOnchainGiftAction {
        public static final int constructor = -978823956;
        public String counterparty_address;
        public int flags;
        public String offer_address;
        public long price;
        public long refund_amount;

        @Override
        public boolean equals(Object obj) {
            if ((obj instanceof walletOnchainGiftActionOfferDecline) && obj.getClass() == getClass()) {
                walletOnchainGiftActionOfferDecline walletonchaingiftactionofferdecline = (walletOnchainGiftActionOfferDecline) obj;
                if (TextUtils.equals(this.offer_address, walletonchaingiftactionofferdecline.offer_address) && TextUtils.equals(this.counterparty_address, walletonchaingiftactionofferdecline.counterparty_address) && this.price == walletonchaingiftactionofferdecline.price && this.refund_amount == walletonchaingiftactionofferdecline.refund_amount) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getClass(), this.offer_address, this.counterparty_address, Long.valueOf(this.price), Long.valueOf(this.refund_amount));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.offer_address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.counterparty_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.price = inputSerializedData.readInt64(z);
            }
            this.refund_amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-978823956);
            int i = this.flags;
            if (this.counterparty_address != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.offer_address);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.counterparty_address);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.price);
            }
            outputSerializedData.writeInt64(this.refund_amount);
        }
    }

    public static class walletOnchainGiftActionOfferExpire extends WalletOnchainGiftAction {
        public static final int constructor = -628781360;
        public String counterparty_address;
        public int flags;
        public String offer_address;
        public long price;
        public long refund_amount;

        @Override
        public boolean equals(Object obj) {
            if ((obj instanceof walletOnchainGiftActionOfferExpire) && obj.getClass() == getClass()) {
                walletOnchainGiftActionOfferExpire walletonchaingiftactionofferexpire = (walletOnchainGiftActionOfferExpire) obj;
                if (TextUtils.equals(this.offer_address, walletonchaingiftactionofferexpire.offer_address) && TextUtils.equals(this.counterparty_address, walletonchaingiftactionofferexpire.counterparty_address) && this.price == walletonchaingiftactionofferexpire.price && this.refund_amount == walletonchaingiftactionofferexpire.refund_amount) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getClass(), this.offer_address, this.counterparty_address, Long.valueOf(this.price), Long.valueOf(this.refund_amount));
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.offer_address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.counterparty_address = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.price = inputSerializedData.readInt64(z);
            }
            this.refund_amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-628781360);
            int i = this.flags;
            if (this.counterparty_address != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(i, 1, z);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.offer_address);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.counterparty_address);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.price);
            }
            outputSerializedData.writeInt64(this.refund_amount);
        }
    }

    public static class walletOwnershipProof extends TLObject {
        public static final int constructor = 1622985485;
        public byte[] signature;
        public int timestamp;

        public static walletOwnershipProof TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            walletOwnershipProof walletownershipproof;
            if (1622985485 != i) {
                walletownershipproof = null;
            } else {
                walletownershipproof = new walletOwnershipProof();
            }
            return (walletOwnershipProof) TLObject.TLdeserialize(walletOwnershipProof.class, walletownershipproof, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.timestamp = inputSerializedData.readInt32(z);
            this.signature = inputSerializedData.readByteArray(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1622985485);
            outputSerializedData.writeInt32(this.timestamp);
            outputSerializedData.writeByteArray(this.signature);
        }
    }

    public static class walletTransaction extends TLObject {
        public static final int constructor = -1792163517;
        public long amount;
        public String comment;
        public boolean comment_encrypted;
        public boolean comment_encrypted_preparing;
        public int date;
        public boolean failed;
        public long fee;
        public boolean feeUnknown;
        public boolean gasless;
        public String gaslessMessageBodyHash;
        public String id;
        public boolean incoming;
        public boolean key_change;
        public int localMessageId;
        public String messageHash;
        public nftItem nft;
        public String normalMessageBodyHash;
        public String operationId;
        public WalletTransactionPeer peer;
        public boolean pending;
        public WalletEngine2.SendPhase phase;
        public boolean preview;
        public long random_id;
        public boolean suspected_spam;
        public String traceFeesNanograms;
        public boolean traceIncomplete;
        public boolean traceSucceeded;
        public String tx_hash;
        public long validUntil;

        public static walletTransaction TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            walletTransaction wallettransaction;
            if (-1792163517 != i) {
                wallettransaction = null;
            } else {
                wallettransaction = new walletTransaction();
            }
            return (walletTransaction) TLObject.TLdeserialize(walletTransaction.class, wallettransaction, inputSerializedData, i, z);
        }

        private static boolean peerEquals(WalletTransactionPeer walletTransactionPeer, WalletTransactionPeer walletTransactionPeer2) {
            if (walletTransactionPeer != walletTransactionPeer2) {
                if (walletTransactionPeer == null || walletTransactionPeer2 == null || !walletTransactionPeer.equals(walletTransactionPeer2)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof walletTransaction)) {
                return false;
            }
            walletTransaction wallettransaction = (walletTransaction) obj;
            if (TextUtils.equals(this.id, wallettransaction.id) && this.incoming == wallettransaction.incoming && this.pending == wallettransaction.pending && this.key_change == wallettransaction.key_change && this.failed == wallettransaction.failed && this.amount == wallettransaction.amount && this.fee == wallettransaction.fee && this.date == wallettransaction.date && peerEquals(this.peer, wallettransaction.peer) && this.comment_encrypted == wallettransaction.comment_encrypted && this.comment_encrypted_preparing == wallettransaction.comment_encrypted_preparing && TextUtils.equals(this.comment, wallettransaction.comment) && TextUtils.equals(this.tx_hash, wallettransaction.tx_hash) && Objects.equals(this.nft, wallettransaction.nft) && this.preview == wallettransaction.preview && this.feeUnknown == wallettransaction.feeUnknown && Objects.equals(this.traceFeesNanograms, wallettransaction.traceFeesNanograms) && this.validUntil == wallettransaction.validUntil && this.traceSucceeded == wallettransaction.traceSucceeded && this.traceIncomplete == wallettransaction.traceIncomplete && Objects.equals(this.operationId, wallettransaction.operationId) && Objects.equals(this.messageHash, wallettransaction.messageHash) && this.phase == wallettransaction.phase) {
                return true;
            }
            return false;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.incoming = TLObject.hasFlag(readInt32, 1);
            this.gasless = TLObject.hasFlag(readInt32, 2);
            this.failed = TLObject.hasFlag(readInt32, 4);
            this.key_change = TLObject.hasFlag(readInt32, 32);
            this.comment_encrypted = TLObject.hasFlag(readInt32, 64);
            this.suspected_spam = TLObject.hasFlag(readInt32, 256);
            this.id = inputSerializedData.readString(z);
            this.amount = inputSerializedData.readInt64(z);
            this.fee = inputSerializedData.readInt64(z);
            this.date = inputSerializedData.readInt32(z);
            this.peer = WalletTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(readInt32, 8)) {
                this.comment = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(readInt32, 16)) {
                this.tx_hash = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(readInt32, 128)) {
                this.nft = nftItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            outputSerializedData.writeInt32(-1792163517);
            boolean z3 = false;
            int flag = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.incoming), 2, this.gasless), 4, this.failed);
            if (this.comment != null) {
                z = true;
            } else {
                z = false;
            }
            int flag2 = TLObject.setFlag(flag, 8, z);
            if (this.tx_hash != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag3 = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(flag2, 16, z2), 32, this.key_change), 64, this.comment_encrypted);
            if (this.nft != null) {
                z3 = true;
            }
            int flag4 = TLObject.setFlag(TLObject.setFlag(flag3, 128, z3), 256, this.suspected_spam);
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeString(this.id);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt64(this.fee);
            outputSerializedData.writeInt32(this.date);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(flag4, 8)) {
                outputSerializedData.writeString(this.comment);
            }
            if (TLObject.hasFlag(flag4, 16)) {
                outputSerializedData.writeString(this.tx_hash);
            }
            if (TLObject.hasFlag(flag4, 128)) {
                this.nft.serializeToStream(outputSerializedData);
            }
        }

        public boolean set(walletTransaction wallettransaction) {
            if (this.incoming == wallettransaction.incoming && this.pending == wallettransaction.pending && this.key_change == wallettransaction.key_change && this.failed == wallettransaction.failed && this.amount == wallettransaction.amount && this.fee == wallettransaction.fee && this.date == wallettransaction.date && peerEquals(this.peer, wallettransaction.peer) && this.comment_encrypted == wallettransaction.comment_encrypted && this.suspected_spam == wallettransaction.suspected_spam && this.comment_encrypted_preparing == wallettransaction.comment_encrypted_preparing && TextUtils.equals(this.comment, wallettransaction.comment) && TextUtils.equals(this.tx_hash, wallettransaction.tx_hash) && Objects.equals(this.nft, wallettransaction.nft) && this.preview == wallettransaction.preview && this.feeUnknown == wallettransaction.feeUnknown && TextUtils.equals(this.traceFeesNanograms, wallettransaction.traceFeesNanograms) && this.validUntil == wallettransaction.validUntil && this.traceSucceeded == wallettransaction.traceSucceeded && this.traceIncomplete == wallettransaction.traceIncomplete && TextUtils.equals(this.operationId, wallettransaction.operationId) && TextUtils.equals(this.messageHash, wallettransaction.messageHash) && this.phase == wallettransaction.phase) {
                return false;
            }
            this.incoming = wallettransaction.incoming;
            this.pending = wallettransaction.pending;
            this.key_change = wallettransaction.key_change;
            this.failed = wallettransaction.failed;
            this.amount = wallettransaction.amount;
            this.fee = wallettransaction.fee;
            this.date = wallettransaction.date;
            this.peer = wallettransaction.peer;
            this.comment_encrypted = wallettransaction.comment_encrypted;
            this.suspected_spam = wallettransaction.suspected_spam;
            this.comment_encrypted_preparing = wallettransaction.comment_encrypted_preparing;
            this.comment = wallettransaction.comment;
            this.tx_hash = wallettransaction.tx_hash;
            this.nft = wallettransaction.nft;
            this.preview = wallettransaction.preview;
            this.feeUnknown = wallettransaction.feeUnknown;
            this.traceFeesNanograms = wallettransaction.traceFeesNanograms;
            this.validUntil = wallettransaction.validUntil;
            this.traceSucceeded = wallettransaction.traceSucceeded;
            this.traceIncomplete = wallettransaction.traceIncomplete;
            this.operationId = wallettransaction.operationId;
            this.messageHash = wallettransaction.messageHash;
            this.phase = wallettransaction.phase;
            return true;
        }
    }

    public static class walletTransactionPeerAddress extends WalletTransactionPeer {
        public static final int constructor = 103596476;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.domain = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(103596476);
            if (this.domain != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.address);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.domain);
            }
        }
    }

    public static class walletTransactionPeerChannel extends WalletTransactionPeer {
        public static final int constructor = 1424428081;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.channel_id = inputSerializedData.readInt64(z);
            this.address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.domain = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(1424428081);
            if (this.domain != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeString(this.address);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.domain);
            }
        }
    }

    public static class walletTransactionPeerOnchainGift extends WalletTransactionPeer {
        public static final int constructor = 1257549816;
        public WalletOnchainGiftAction action;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            WalletOnchainGiftAction TLdeserialize = WalletOnchainGiftAction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.action = TLdeserialize;
            this.address = gs7.a(TLdeserialize);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1257549816);
            this.action.serializeToStream(outputSerializedData);
        }
    }

    public static class walletTransactionPeerOnramp extends WalletTransactionPeer {
        public static final int constructor = -443213714;
        public String provider_name;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.domain = inputSerializedData.readString(z);
            }
            this.provider_name = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-443213714);
            if (this.domain != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.address);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.domain);
            }
            outputSerializedData.writeString(this.provider_name);
        }
    }

    public static class walletTransactionPeerTelegramGift extends WalletTransactionPeer {
        public static final int constructor = -193817447;
        public boolean own_profile;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.own_profile = TLObject.hasFlag(inputSerializedData.readInt32(z), 1);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-193817447);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.own_profile));
        }
    }

    public static class walletTransactionPeerUser extends WalletTransactionPeer {
        public static final int constructor = -722833299;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.user_id = inputSerializedData.readInt64(z);
            this.address = inputSerializedData.readString(z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.domain = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-722833299);
            if (this.domain != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.address);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.domain);
            }
        }
    }

    public static class walletTransactions extends TLObject {
        public static final int constructor = 1126356389;
        public long balance;
        public String next_offset;
        public ArrayList<walletTransaction> transactions = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static walletTransactions TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            walletTransactions wallettransactions;
            if (1126356389 != i) {
                wallettransactions = null;
            } else {
                wallettransactions = new walletTransactions();
            }
            return (walletTransactions) TLObject.TLdeserialize(walletTransactions.class, wallettransactions, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.balance = inputSerializedData.readInt64(z);
            this.transactions = Vector.deserialize(inputSerializedData, new tfb((byte) 29), z);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new c1b((byte) 18), z);
            this.users = Vector.deserialize(inputSerializedData, new c1b((byte) 12), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(1126356389);
            if (this.next_offset != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.balance);
            Vector.serialize(outputSerializedData, this.transactions);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class walletUserAddress extends TLObject {
        public static final int constructor = -25628980;
        public String address;
        public byte[] public_key;
        public long user_id;

        public static walletUserAddress TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            walletUserAddress walletuseraddress;
            if (-25628980 != i) {
                walletuseraddress = null;
            } else {
                walletuseraddress = new walletUserAddress();
            }
            return (walletUserAddress) TLObject.TLdeserialize(walletUserAddress.class, walletuseraddress, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            if (TLObject.hasFlag(inputSerializedData.readInt32(z), 1)) {
                this.user_id = inputSerializedData.readInt64(z);
            }
            this.address = inputSerializedData.readString(z);
            this.public_key = inputSerializedData.readByteArray(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-25628980);
            if (this.user_id != 0) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            outputSerializedData.writeString(this.address);
            outputSerializedData.writeByteArray(this.public_key);
        }
    }

    public static class disableBackup extends TLMethod<WalletState> {
        public static final int constructor = 185331930;
        public byte[] new_public_key;
        public TLRPC.InputCheckPasswordSRP password;
        public walletOwnershipProof proof;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            boolean z2;
            outputSerializedData.writeInt32(185331930);
            boolean z3 = false;
            if (this.password != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            if (this.new_public_key != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            if (this.proof != null) {
                z3 = true;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z3);
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(flag3, 1)) {
                this.password.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag3, 2)) {
                outputSerializedData.writeByteArray(this.new_public_key);
            }
            if (TLObject.hasFlag(flag3, 4)) {
                this.proof.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return WalletState.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class enableBackup extends TLMethod<WalletState> {
        public static final int constructor = 1157678373;
        public byte[] new_public_key;
        public ArrayList<byte[]> parts = new ArrayList<>();
        public walletOwnershipProof proof;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(1157678373);
            boolean z2 = true;
            if (this.new_public_key != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 2, z);
            if (this.proof == null) {
                z2 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z2);
            outputSerializedData.writeInt32(flag2);
            Vector.serializeByteArray(outputSerializedData, this.parts);
            if (TLObject.hasFlag(flag2, 2)) {
                outputSerializedData.writeByteArray(this.new_public_key);
            }
            if (TLObject.hasFlag(flag2, 4)) {
                this.proof.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return WalletState.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class exportSecretPhrase extends TLMethod<secretPhraseParts> {
        public static final int constructor = -1871197780;
        public TLRPC.InputCheckPasswordSRP password;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-1871197780);
            if (this.password != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(flag, 1)) {
                this.password.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public secretPhraseParts deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return secretPhraseParts.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class fetchEncryptedSecretPhrasePart extends TLMethod<encryptedSecretPhrasePart> {
        public static final int constructor = -180804145;
        public byte[] public_key;
        public String token;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-180804145);
            outputSerializedData.writeString(this.token);
            outputSerializedData.writeByteArray(this.public_key);
        }

        @Override
        public encryptedSecretPhrasePart deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return encryptedSecretPhrasePart.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getCurrencyRates extends TLMethod<currencyRates> {
        public static final int constructor = -749108248;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-749108248);
        }

        @Override
        public currencyRates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return currencyRates.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getExistingWaltBalance extends TLMethod<existingBalance> {
        public static final int constructor = 1763656544;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1763656544);
        }

        @Override
        public existingBalance deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return existingBalance.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getGaslessInfo extends TLMethod<TLRPC.Updates> {
        public static final int constructor = 1949167777;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1949167777);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getNfts extends TLMethod<nftItems> {
        public static final int constructor = -1944915036;
        public int limit;
        public String offset;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1944915036);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public nftItems deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return nftItems.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getProofChallenge extends TLMethod<proofChallenge> {
        public static final int constructor = 539354775;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(539354775);
        }

        @Override
        public proofChallenge deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return proofChallenge.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getState extends TLMethod<WalletState> {
        public static final int constructor = -1417432262;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1417432262);
        }

        @Override
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return WalletState.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getTransactions extends TLMethod<walletTransactions> {
        public static final int constructor = -1467807101;
        public boolean inbound;
        public int limit;
        public String offset;
        public boolean outbound;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1467807101);
            outputSerializedData.writeInt32(TLObject.setFlag(TLObject.setFlag(0, 1, this.inbound), 2, this.outbound));
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public walletTransactions deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return walletTransactions.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getTransactionsByIDs extends TLMethod<walletTransactions> {
        public static final int constructor = -2128811338;
        public ArrayList<String> id = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2128811338);
            Vector.serializeString(outputSerializedData, this.id);
        }

        @Override
        public walletTransactions deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return walletTransactions.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getTransactionsByMsgHash extends TLMethod<walletTransactions> {
        public static final int constructor = -1497663139;
        public ArrayList<String> msg_hash = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1497663139);
            Vector.serializeString(outputSerializedData, this.msg_hash);
        }

        @Override
        public walletTransactions deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return walletTransactions.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class getUserAddresses extends TLMethod<userAddresses> {
        public static final int constructor = 1383456733;
        public boolean force;
        public ArrayList<TLRPC.InputUser> id = new ArrayList<>();
        public ArrayList<String> addresses = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1383456733);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.force));
            Vector.serialize(outputSerializedData, this.id);
            Vector.serializeString(outputSerializedData, this.addresses);
        }

        @Override
        public userAddresses deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return userAddresses.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class replaceWallet extends TLMethod<WalletState> {
        public static final int constructor = -658034964;
        public TLRPC.InputCheckPasswordSRP password;
        public InputWalletReplacement wallet;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-658034964);
            if (this.password != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            this.wallet.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(flag, 1)) {
                this.password.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return WalletState.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class sendTransfer extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -639247902;
        public byte[] data_gasless;
        public byte[] data_normal;
        public String gaslessMessageBodyHash;
        public String normalMessageBodyHash;
        public long random_id;
        public TLRPC.InputUser user_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-639247902);
            if (this.data_gasless != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeByteArray(this.data_normal);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeByteArray(this.data_gasless);
            }
            this.user_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.random_id);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class setCardStickers extends TLMethod<card> {
        public static final int constructor = 109382060;
        public String bg_nft_address;
        public ArrayList<inputWalletCardSticker> stickers = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(109382060);
            if (this.bg_nft_address != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            Vector.serialize(outputSerializedData, this.stickers);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.bg_nft_address);
            }
        }

        @Override
        public card deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return card.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectClaimRequest extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1723169601;
        public String app_request_id;
        public byte[] challenge_answer;
        public boolean declined;
        public int msg_id;
        public long session_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(1723169601);
            if (this.challenge_answer != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(TLObject.setFlag(0, 1, z), 2, this.declined);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeString(this.app_request_id);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeByteArray(this.challenge_answer);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectCloseSession extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -700489266;
        public byte[] body;
        public long session_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-700489266);
            if (this.body != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.session_id);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeByteArray(this.body);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectCreateSession extends TLMethod<tonConnectSession> {
        public static final int constructor = -862777274;
        public String dapp_client_id;
        public String manifest_url;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-862777274);
            outputSerializedData.writeString(this.dapp_client_id);
            outputSerializedData.writeString(this.manifest_url);
        }

        @Override
        public tonConnectSession deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return tonConnectSession.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectGetNextEventId extends TLMethod<tonConnectNextEventId> {
        public static final int constructor = 2002612804;
        public long session_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2002612804);
            outputSerializedData.writeInt64(this.session_id);
        }

        @Override
        public tonConnectNextEventId deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return tonConnectNextEventId.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectGetPending extends TLMethod<tonConnectPending> {
        public static final int constructor = 296673381;
        public String dapp_client_id;
        public Long session_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(296673381);
            boolean z2 = false;
            if (this.dapp_client_id != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            if (this.session_id != null) {
                z2 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z2);
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(flag2, 1)) {
                outputSerializedData.writeString(this.dapp_client_id);
            }
            if (TLObject.hasFlag(flag2, 2)) {
                outputSerializedData.writeInt64(this.session_id.longValue());
            }
        }

        @Override
        public tonConnectPending deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return tonConnectPending.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectGetSessions extends TLMethod<tonConnectSessions> {
        public static final int constructor = -1476414098;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1476414098);
        }

        @Override
        public tonConnectSessions deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return tonConnectSessions.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectRegisterKey extends TLMethod<tonConnectChallenge> {
        public static final int constructor = 864800540;
        public String client_id;
        public long session_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(864800540);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeString(this.client_id);
        }

        @Override
        public tonConnectChallenge deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return tonConnectChallenge.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectSubmitConnectResult extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1027602567;
        public byte[] body;
        public byte[] challenge_answer;
        public boolean error;
        public long session_id;
        public String trace_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1027602567);
            boolean z = false;
            int flag = TLObject.setFlag(0, 1, this.error);
            if (this.trace_id != null) {
                z = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z);
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeByteArray(this.challenge_answer);
            outputSerializedData.writeByteArray(this.body);
            if (TLObject.hasFlag(flag2, 2)) {
                outputSerializedData.writeString(this.trace_id);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class tonConnectSubmitResponse extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -87655108;
        public byte[] body;
        public int msg_id;
        public long session_id;
        public String trace_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z;
            outputSerializedData.writeInt32(-87655108);
            if (this.trace_id != null) {
                z = true;
            } else {
                z = false;
            }
            int flag = TLObject.setFlag(0, 1, z);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeByteArray(this.body);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.trace_id);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static class walletTransactionPeerUnsupported extends WalletTransactionPeer {
        public static final int constructor = 1921772890;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1921772890);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }
    }
}
