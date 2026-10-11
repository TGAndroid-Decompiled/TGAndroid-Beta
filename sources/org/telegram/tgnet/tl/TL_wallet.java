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
import org.telegram.tgnet.n;
import org.telegram.ui.Wallet.WalletEngine2;
public class TL_wallet {

    public static class InputWalletReplacement extends TLObject {
        public static InputWalletReplacement TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject inputwalletnew;
            if (i10 != 1671708892) {
                if (i10 != 1722182203) {
                    inputwalletnew = null;
                } else {
                    inputwalletnew = new inputWalletImported();
                }
            } else {
                inputwalletnew = new inputWalletNew();
            }
            return (InputWalletReplacement) TLObject.TLdeserialize(InputWalletReplacement.class, inputwalletnew, inputSerializedData, i10, z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.backup_enabled = TLObject.hasFlag(readInt32, 1);
            this.can_export_phrase = TLObject.hasFlag(readInt32, 2);
            this.can_enable_backup = TLObject.hasFlag(readInt32, 4);
            this.address = inputSerializedData.readString(z10);
            this.public_key = inputSerializedData.readByteArray(z10);
            this.balance = inputSerializedData.readInt64(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.creating = TLObject.hasFlag(inputSerializedData.readInt32(z10), 1);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1665551636);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.creating));
        }
    }

    public static class WalletState extends TLObject {
        public static WalletState TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_walletState;
            if (i10 != -1782238101) {
                if (i10 != -1665551636) {
                    tL_walletState = null;
                } else {
                    tL_walletState = new TL_walletStateEmpty();
                }
            } else {
                tL_walletState = new TL_walletState();
            }
            return (WalletState) TLObject.TLdeserialize(WalletState.class, tL_walletState, inputSerializedData, i10, z10);
        }
    }

    public static class WalletTransactionPeer extends TLObject {
        public String address;
        public String domain;
        public long user_id;

        public static WalletTransactionPeer TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject wallettransactionpeeruser;
            switch (i10) {
                case -722833299:
                    wallettransactionpeeruser = new walletTransactionPeerUser();
                    break;
                case -443213714:
                    wallettransactionpeeruser = new walletTransactionPeerOnramp();
                    break;
                case 103596476:
                    wallettransactionpeeruser = new walletTransactionPeerAddress();
                    break;
                case 1921772890:
                    wallettransactionpeeruser = new walletTransactionPeerUnsupported();
                    break;
                default:
                    wallettransactionpeeruser = null;
                    break;
            }
            return (WalletTransactionPeer) TLObject.TLdeserialize(WalletTransactionPeer.class, wallettransactionpeeruser, inputSerializedData, i10, z10);
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
            } else if (walletTransactionPeer instanceof walletTransactionPeerAddress) {
                if (!(this instanceof walletTransactionPeerAddress)) {
                    return false;
                }
                return TextUtils.equals(((walletTransactionPeerAddress) this).address, ((walletTransactionPeerAddress) walletTransactionPeer).address);
            } else if (!(walletTransactionPeer instanceof walletTransactionPeerUnsupported)) {
                return false;
            } else {
                return this instanceof walletTransactionPeerUnsupported;
            }
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

        public static currencyRate TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            currencyRate currencyrate;
            if (819557436 != i10) {
                currencyrate = null;
            } else {
                currencyrate = new currencyRate();
            }
            return (currencyRate) TLObject.TLdeserialize(currencyRate.class, currencyrate, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.currency = inputSerializedData.readString(z10);
            this.rate = inputSerializedData.readDouble(z10);
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

        public static currencyRates TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            currencyRates currencyrates;
            if (-1144199998 != i10) {
                currencyrates = null;
            } else {
                currencyrates = new currencyRates();
            }
            return (currencyRates) TLObject.TLdeserialize(currencyRates.class, currencyrates, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.rates = Vector.deserialize(inputSerializedData, new d(19), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1144199998);
            Vector.serialize(outputSerializedData, this.rates);
        }
    }

    public static class disableBackup extends TLMethod<WalletState> {
        public static final int constructor = 185331930;
        public byte[] new_public_key;
        public TLRPC.InputCheckPasswordSRP password;
        public walletOwnershipProof proof;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(185331930);
            boolean z12 = false;
            if (this.password != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            if (this.new_public_key != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z11);
            if (this.proof != null) {
                z12 = true;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z12);
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
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WalletState.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class enableBackup extends TLMethod<WalletState> {
        public static final int constructor = 1157678373;
        public byte[] new_public_key;
        public ArrayList<byte[]> parts = new ArrayList<>();
        public walletOwnershipProof proof;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(1157678373);
            boolean z11 = true;
            if (this.new_public_key != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 2, z10);
            if (this.proof == null) {
                z11 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z11);
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
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WalletState.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class encryptedSecretPhrasePart extends TLObject {
        public static final int constructor = 417867063;
        public byte[] data;

        public static encryptedSecretPhrasePart TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            encryptedSecretPhrasePart encryptedsecretphrasepart;
            if (417867063 != i10) {
                encryptedsecretphrasepart = null;
            } else {
                encryptedsecretphrasepart = new encryptedSecretPhrasePart();
            }
            return (encryptedSecretPhrasePart) TLObject.TLdeserialize(encryptedSecretPhrasePart.class, encryptedsecretphrasepart, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.data = inputSerializedData.readByteArray(z10);
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

        public static existingBalance TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            existingBalance existingbalance;
            if (-1108800883 != i10) {
                existingbalance = null;
            } else {
                existingbalance = new existingBalance();
            }
            return (existingBalance) TLObject.TLdeserialize(existingBalance.class, existingbalance, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.has_balance = TLObject.hasFlag(inputSerializedData.readInt32(z10), 1);
            this.url = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1108800883);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.has_balance));
            outputSerializedData.writeString(this.url);
        }
    }

    public static class exportSecretPhrase extends TLMethod<secretPhraseParts> {
        public static final int constructor = -1871197780;
        public TLRPC.InputCheckPasswordSRP password;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-1871197780);
            if (this.password != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(flag, 1)) {
                this.password.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public secretPhraseParts deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return secretPhraseParts.TLdeserialize(inputSerializedData, i10, z10);
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
        public encryptedSecretPhrasePart deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return encryptedSecretPhrasePart.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getBackupHolderDcs extends TLMethod<Vector<holderDc>> {
        public static final int constructor = -780544876;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-780544876);
        }

        @Override
        public Vector<holderDc> deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserialize(inputSerializedData, i10, z10, new d(20));
        }
    }

    public static class getCurrencyRates extends TLMethod<currencyRates> {
        public static final int constructor = -749108248;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-749108248);
        }

        @Override
        public currencyRates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return currencyRates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getExistingWaltBalance extends TLMethod<existingBalance> {
        public static final int constructor = 1763656544;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1763656544);
        }

        @Override
        public existingBalance deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return existingBalance.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getGaslessInfo extends TLMethod<TLRPC.Updates> {
        public static final int constructor = 1949167777;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1949167777);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
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
        public nftItems deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return nftItems.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getProofChallenge extends TLMethod<proofChallenge> {
        public static final int constructor = 539354775;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(539354775);
        }

        @Override
        public proofChallenge deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return proofChallenge.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getState extends TLMethod<WalletState> {
        public static final int constructor = -1417432262;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1417432262);
        }

        @Override
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WalletState.TLdeserialize(inputSerializedData, i10, z10);
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
        public walletTransactions deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return walletTransactions.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getTransactionsByIDs extends TLMethod<walletTransactions> {
        public static final int constructor = -2128811338;
        public ArrayList<String> f20290id = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2128811338);
            Vector.serializeString(outputSerializedData, this.f20290id);
        }

        @Override
        public walletTransactions deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return walletTransactions.TLdeserialize(inputSerializedData, i10, z10);
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
        public walletTransactions deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return walletTransactions.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getUserAddresses extends TLMethod<userAddresses> {
        public static final int constructor = 1383456733;
        public boolean force;
        public ArrayList<TLRPC.InputUser> f20291id = new ArrayList<>();
        public ArrayList<String> addresses = new ArrayList<>();

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1383456733);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.force));
            Vector.serialize(outputSerializedData, this.f20291id);
            Vector.serializeString(outputSerializedData, this.addresses);
        }

        @Override
        public userAddresses deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return userAddresses.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class holderDc extends TLObject {
        public static final int constructor = -103410961;
        public int f20292dc;
        public byte[] public_key;

        public static holderDc TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            holderDc holderdc;
            if (-103410961 != i10) {
                holderdc = null;
            } else {
                holderdc = new holderDc();
            }
            return (holderDc) TLObject.TLdeserialize(holderDc.class, holderdc, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.f20292dc = inputSerializedData.readInt32(z10);
            this.public_key = inputSerializedData.readByteArray(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-103410961);
            outputSerializedData.writeInt32(this.f20292dc);
            outputSerializedData.writeByteArray(this.public_key);
        }
    }

    public static class inputTonConnectOauthSession extends TLObject {
        public static final int constructor = 1654613710;
        public byte[] body;
        public byte[] challenge_answer;
        public walletOwnershipProof proof;
        public long session_id;

        public static inputTonConnectOauthSession TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            inputTonConnectOauthSession inputtonconnectoauthsession;
            if (1654613710 != i10) {
                inputtonconnectoauthsession = null;
            } else {
                inputtonconnectoauthsession = new inputTonConnectOauthSession();
            }
            return (inputTonConnectOauthSession) TLObject.TLdeserialize(inputTonConnectOauthSession.class, inputtonconnectoauthsession, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.session_id = inputSerializedData.readInt64(z10);
            this.challenge_answer = inputSerializedData.readByteArray(z10);
            this.body = inputSerializedData.readByteArray(z10);
            this.proof = walletOwnershipProof.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
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

    public static class inputWalletImported extends InputWalletReplacement {
        public static final int constructor = 1722182203;
        public byte[] anchor_public_key;
        public walletOwnershipProof proof;
        public byte[] public_key;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.public_key = inputSerializedData.readByteArray(z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.anchor_public_key = inputSerializedData.readByteArray(z10);
            }
            this.proof = walletOwnershipProof.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(1722182203);
            if (this.anchor_public_key != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
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

        public static mnemonic_decryptedKeyPart TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
            if (-1953440504 != i10) {
                mnemonic_decryptedkeypart = null;
            } else {
                mnemonic_decryptedkeypart = new mnemonic_decryptedKeyPart();
            }
            return (mnemonic_decryptedKeyPart) TLObject.TLdeserialize(mnemonic_decryptedKeyPart.class, mnemonic_decryptedkeypart, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.share = inputSerializedData.readByteArray(z10);
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

        public static nftAttribute TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            nftAttribute nftattribute;
            if (1277096206 != i10) {
                nftattribute = null;
            } else {
                nftattribute = new nftAttribute();
            }
            return (nftAttribute) TLObject.TLdeserialize(nftAttribute.class, nftattribute, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.trait_type = inputSerializedData.readString(z10);
            this.value = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1277096206);
            outputSerializedData.writeString(this.trait_type);
            outputSerializedData.writeString(this.value);
        }
    }

    public static class nftItem extends TLObject {
        public static final int constructor = 876739868;
        public String address;
        public ArrayList<nftAttribute> attributes = new ArrayList<>();
        public String collection_address;
        public TLRPC.WebDocument content_url;
        public String description;
        public TLRPC.TL_dataJSON extra;
        public TLRPC.WebDocument image;
        public TLRPC.WebDocument image_small;
        public String index;
        public TLRPC.WebDocument lottie;
        public String name;
        public String owner_address;

        public static nftItem TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            nftItem nftitem;
            if (876739868 != i10) {
                nftitem = null;
            } else {
                nftitem = new nftItem();
            }
            return (nftItem) TLObject.TLdeserialize(nftItem.class, nftitem, inputSerializedData, i10, z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.collection_address = inputSerializedData.readString(z10);
            }
            this.address = inputSerializedData.readString(z10);
            this.owner_address = inputSerializedData.readString(z10);
            this.index = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(readInt32, 2)) {
                this.name = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(readInt32, 4)) {
                this.description = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(readInt32, 8)) {
                this.image = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(readInt32, 16)) {
                this.image_small = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(readInt32, 32)) {
                this.content_url = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(readInt32, 64)) {
                this.lottie = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(readInt32, 128)) {
                this.attributes = Vector.deserialize(inputSerializedData, new d(21), z10);
            }
            if (TLObject.hasFlag(readInt32, 256)) {
                this.extra = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            outputSerializedData.writeInt32(876739868);
            boolean z18 = false;
            if (this.collection_address != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            if (this.name != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag2 = TLObject.setFlag(flag, 2, z11);
            if (this.description != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 4, z12);
            if (this.image != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int flag4 = TLObject.setFlag(flag3, 8, z13);
            if (this.image_small != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            int flag5 = TLObject.setFlag(flag4, 16, z14);
            if (this.content_url != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            int flag6 = TLObject.setFlag(flag5, 32, z15);
            if (this.lottie != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            int flag7 = TLObject.setFlag(flag6, 64, z16);
            ArrayList<nftAttribute> arrayList = this.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                z17 = true;
            } else {
                z17 = false;
            }
            int flag8 = TLObject.setFlag(flag7, 128, z17);
            if (this.extra != null) {
                z18 = true;
            }
            int flag9 = TLObject.setFlag(flag8, 256, z18);
            outputSerializedData.writeInt32(flag9);
            if (TLObject.hasFlag(flag9, 1)) {
                outputSerializedData.writeString(this.collection_address);
            }
            outputSerializedData.writeString(this.address);
            outputSerializedData.writeString(this.owner_address);
            outputSerializedData.writeString(this.index);
            if (TLObject.hasFlag(flag9, 2)) {
                outputSerializedData.writeString(this.name);
            }
            if (TLObject.hasFlag(flag9, 4)) {
                outputSerializedData.writeString(this.description);
            }
            if (TLObject.hasFlag(flag9, 8)) {
                this.image.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag9, 16)) {
                this.image_small.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag9, 32)) {
                this.content_url.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag9, 64)) {
                this.lottie.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(flag9, 128)) {
                Vector.serialize(outputSerializedData, this.attributes);
            }
            if (TLObject.hasFlag(flag9, 256)) {
                this.extra.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class nftItems extends TLObject {
        public static final int constructor = 2035107951;
        public ArrayList<nftItem> items = new ArrayList<>();
        public String next_offset;

        public static nftItems TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            nftItems nftitems;
            if (2035107951 != i10) {
                nftitems = null;
            } else {
                nftitems = new nftItems();
            }
            return (nftItems) TLObject.TLdeserialize(nftItems.class, nftitems, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.items = Vector.deserialize(inputSerializedData, new d(22), z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(2035107951);
            if (this.next_offset != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
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

        public static proofChallenge TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            proofChallenge proofchallenge;
            if (-1713105145 != i10) {
                proofchallenge = null;
            } else {
                proofchallenge = new proofChallenge();
            }
            return (proofChallenge) TLObject.TLdeserialize(proofChallenge.class, proofchallenge, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.payload = inputSerializedData.readString(z10);
            this.expires = inputSerializedData.readInt32(z10);
            this.domain = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1713105145);
            outputSerializedData.writeString(this.payload);
            outputSerializedData.writeInt32(this.expires);
            outputSerializedData.writeString(this.domain);
        }
    }

    public static class replaceWallet extends TLMethod<WalletState> {
        public static final int constructor = -658034964;
        public TLRPC.InputCheckPasswordSRP password;
        public InputWalletReplacement wallet;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-658034964);
            if (this.password != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            this.wallet.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(flag, 1)) {
                this.password.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public WalletState deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return WalletState.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class secretPhraseParts extends TLObject {
        public static final int constructor = -422514943;
        public ArrayList<Integer> dcs = new ArrayList<>();
        public String token;

        public static secretPhraseParts TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            secretPhraseParts secretphraseparts;
            if (-422514943 != i10) {
                secretphraseparts = null;
            } else {
                secretphraseparts = new secretPhraseParts();
            }
            return (secretPhraseParts) TLObject.TLdeserialize(secretPhraseParts.class, secretphraseparts, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.token = inputSerializedData.readString(z10);
            this.dcs = Vector.deserializeInt(inputSerializedData, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-422514943);
            outputSerializedData.writeString(this.token);
            Vector.serializeInt(outputSerializedData, this.dcs);
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
            boolean z10;
            outputSerializedData.writeInt32(-639247902);
            if (this.data_gasless != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeByteArray(this.data_normal);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeByteArray(this.data_gasless);
            }
            this.user_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.random_id);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class tonConnectChallenge extends TLObject {
        public static final int constructor = 1271436947;
        public byte[] challenge;
        public long event_id;

        public static tonConnectChallenge TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            tonConnectChallenge tonconnectchallenge;
            if (1271436947 != i10) {
                tonconnectchallenge = null;
            } else {
                tonconnectchallenge = new tonConnectChallenge();
            }
            return (tonConnectChallenge) TLObject.TLdeserialize(tonConnectChallenge.class, tonconnectchallenge, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.challenge = inputSerializedData.readByteArray(z10);
            this.event_id = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1271436947);
            outputSerializedData.writeByteArray(this.challenge);
            outputSerializedData.writeInt64(this.event_id);
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
            boolean z10;
            outputSerializedData.writeInt32(1723169601);
            if (this.challenge_answer != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(TLObject.setFlag(0, 1, z10), 2, this.declined);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeString(this.app_request_id);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeByteArray(this.challenge_answer);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class tonConnectCloseSession extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -700489266;
        public byte[] body;
        public long session_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-700489266);
            if (this.body != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.session_id);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeByteArray(this.body);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
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
        public tonConnectSession deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return tonConnectSession.TLdeserialize(inputSerializedData, i10, z10);
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
        public tonConnectNextEventId deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return tonConnectNextEventId.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class tonConnectGetPending extends TLMethod<tonConnectPending> {
        public static final int constructor = 296673381;
        public String dapp_client_id;
        public Long session_id;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(296673381);
            boolean z11 = false;
            if (this.dapp_client_id != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            if (this.session_id != null) {
                z11 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z11);
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(flag2, 1)) {
                outputSerializedData.writeString(this.dapp_client_id);
            }
            if (TLObject.hasFlag(flag2, 2)) {
                outputSerializedData.writeInt64(this.session_id.longValue());
            }
        }

        @Override
        public tonConnectPending deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return tonConnectPending.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class tonConnectGetSessions extends TLMethod<tonConnectSessions> {
        public static final int constructor = -1476414098;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1476414098);
        }

        @Override
        public tonConnectSessions deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return tonConnectSessions.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class tonConnectManifest extends TLObject {
        public static final int constructor = 304255588;
        public TLRPC.WebDocument icon;
        public String name;
        public String url;

        public static tonConnectManifest TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            tonConnectManifest tonconnectmanifest;
            if (304255588 != i10) {
                tonconnectmanifest = null;
            } else {
                tonconnectmanifest = new tonConnectManifest();
            }
            return (tonConnectManifest) TLObject.TLdeserialize(tonConnectManifest.class, tonconnectmanifest, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.url = inputSerializedData.readString(z10);
            this.name = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.icon = TLRPC.WebDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(304255588);
            if (this.icon != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
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

        public static tonConnectNextEventId TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            tonConnectNextEventId tonconnectnexteventid;
            if (1478780131 != i10) {
                tonconnectnexteventid = null;
            } else {
                tonconnectnexteventid = new tonConnectNextEventId();
            }
            return (tonConnectNextEventId) TLObject.TLdeserialize(tonConnectNextEventId.class, tonconnectnexteventid, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.event_id = inputSerializedData.readInt64(z10);
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

        public static tonConnectPending TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            tonConnectPending tonconnectpending;
            if (-2050952924 != i10) {
                tonconnectpending = null;
            } else {
                tonconnectpending = new tonConnectPending();
            }
            return (tonConnectPending) TLObject.TLdeserialize(tonConnectPending.class, tonconnectpending, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.session = tonConnectSession.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.requests = Vector.deserialize(inputSerializedData, new d(23), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2050952924);
            this.session.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.requests);
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
        public tonConnectChallenge deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return tonConnectChallenge.TLdeserialize(inputSerializedData, i10, z10);
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

        public static tonConnectRequest TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            tonConnectRequest tonconnectrequest;
            if (-1587575533 != i10) {
                tonconnectrequest = null;
            } else {
                tonconnectrequest = new tonConnectRequest();
            }
            return (tonConnectRequest) TLObject.TLdeserialize(tonConnectRequest.class, tonconnectrequest, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.session_id = inputSerializedData.readInt64(z10);
            this.msg_id = inputSerializedData.readInt32(z10);
            this.body = inputSerializedData.readByteArray(z10);
            this.expires = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.topic = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(readInt32, 2)) {
                this.trace_id = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-1587575533);
            boolean z11 = false;
            if (this.topic != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            if (this.trace_id != null) {
                z11 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z11);
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
        public long f20293id;
        public tonConnectManifest manifest;
        public Integer manifest_error;
        public byte[] nonce;
        public boolean pending;

        public static tonConnectSession TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            tonConnectSession tonconnectsession;
            if (308631238 != i10) {
                tonconnectsession = null;
            } else {
                tonconnectsession = new tonConnectSession();
            }
            return (tonConnectSession) TLObject.TLdeserialize(tonConnectSession.class, tonconnectsession, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.pending = TLObject.hasFlag(readInt32, 1);
            this.closing = TLObject.hasFlag(readInt32, 2);
            this.closed = TLObject.hasFlag(readInt32, 4);
            this.f20293id = inputSerializedData.readInt64(z10);
            this.dapp_client_id = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(readInt32, 8)) {
                this.client_id = inputSerializedData.readString(z10);
            }
            this.nonce = inputSerializedData.readByteArray(z10);
            if (TLObject.hasFlag(readInt32, 16)) {
                this.manifest = tonConnectManifest.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(readInt32, 32)) {
                this.manifest_error = Integer.valueOf(inputSerializedData.readInt32(z10));
            }
            this.date = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(308631238);
            boolean z12 = false;
            int flag = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.pending), 2, this.closing), 4, this.closed);
            if (this.client_id != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 8, z10);
            if (this.manifest != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag3 = TLObject.setFlag(flag2, 16, z11);
            if (this.manifest_error != null) {
                z12 = true;
            }
            int flag4 = TLObject.setFlag(flag3, 32, z12);
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeInt64(this.f20293id);
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

        public static tonConnectSessions TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            tonConnectSessions tonconnectsessions;
            if (236939414 != i10) {
                tonconnectsessions = null;
            } else {
                tonconnectsessions = new tonConnectSessions();
            }
            return (tonConnectSessions) TLObject.TLdeserialize(tonConnectSessions.class, tonconnectsessions, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.sessions = Vector.deserialize(inputSerializedData, new d(24), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(236939414);
            Vector.serialize(outputSerializedData, this.sessions);
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
            boolean z10 = false;
            int flag = TLObject.setFlag(0, 1, this.error);
            if (this.trace_id != null) {
                z10 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z10);
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeByteArray(this.challenge_answer);
            outputSerializedData.writeByteArray(this.body);
            if (TLObject.hasFlag(flag2, 2)) {
                outputSerializedData.writeString(this.trace_id);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
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
            boolean z10;
            outputSerializedData.writeInt32(-87655108);
            if (this.trace_id != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.session_id);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeByteArray(this.body);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.trace_id);
            }
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class userAddresses extends TLObject {
        public static final int constructor = -1836156075;
        public ArrayList<walletUserAddress> addresses = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static userAddresses TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            userAddresses useraddresses;
            if (-1836156075 != i10) {
                useraddresses = null;
            } else {
                useraddresses = new userAddresses();
            }
            return (userAddresses) TLObject.TLdeserialize(userAddresses.class, useraddresses, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.addresses = Vector.deserialize(inputSerializedData, new d(25), z10);
            this.users = Vector.deserialize(inputSerializedData, new n(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1836156075);
            Vector.serialize(outputSerializedData, this.addresses);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class walletOwnershipProof extends TLObject {
        public static final int constructor = 1622985485;
        public byte[] signature;
        public int timestamp;

        public static walletOwnershipProof TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            walletOwnershipProof walletownershipproof;
            if (1622985485 != i10) {
                walletownershipproof = null;
            } else {
                walletownershipproof = new walletOwnershipProof();
            }
            return (walletOwnershipProof) TLObject.TLdeserialize(walletOwnershipProof.class, walletownershipproof, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.timestamp = inputSerializedData.readInt32(z10);
            this.signature = inputSerializedData.readByteArray(z10);
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
        public String f20294id;
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
        public String traceFeesNanograms;
        public boolean traceIncomplete;
        public boolean traceSucceeded;
        public String tx_hash;
        public long validUntil;

        public static walletTransaction TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            walletTransaction wallettransaction;
            if (-1792163517 != i10) {
                wallettransaction = null;
            } else {
                wallettransaction = new walletTransaction();
            }
            return (walletTransaction) TLObject.TLdeserialize(walletTransaction.class, wallettransaction, inputSerializedData, i10, z10);
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
            if (TextUtils.equals(this.f20294id, wallettransaction.f20294id) && this.incoming == wallettransaction.incoming && this.pending == wallettransaction.pending && this.key_change == wallettransaction.key_change && this.failed == wallettransaction.failed && this.amount == wallettransaction.amount && this.fee == wallettransaction.fee && this.date == wallettransaction.date && peerEquals(this.peer, wallettransaction.peer) && this.comment_encrypted == wallettransaction.comment_encrypted && this.comment_encrypted_preparing == wallettransaction.comment_encrypted_preparing && TextUtils.equals(this.comment, wallettransaction.comment) && TextUtils.equals(this.tx_hash, wallettransaction.tx_hash) && Objects.equals(this.nft, wallettransaction.nft) && this.preview == wallettransaction.preview && this.feeUnknown == wallettransaction.feeUnknown && Objects.equals(this.traceFeesNanograms, wallettransaction.traceFeesNanograms) && this.validUntil == wallettransaction.validUntil && this.traceSucceeded == wallettransaction.traceSucceeded && this.traceIncomplete == wallettransaction.traceIncomplete && Objects.equals(this.operationId, wallettransaction.operationId) && Objects.equals(this.messageHash, wallettransaction.messageHash) && this.phase == wallettransaction.phase) {
                return true;
            }
            return false;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.incoming = TLObject.hasFlag(readInt32, 1);
            this.gasless = TLObject.hasFlag(readInt32, 2);
            this.failed = TLObject.hasFlag(readInt32, 4);
            this.key_change = TLObject.hasFlag(readInt32, 32);
            this.comment_encrypted = TLObject.hasFlag(readInt32, 64);
            this.f20294id = inputSerializedData.readString(z10);
            this.amount = inputSerializedData.readInt64(z10);
            this.fee = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.peer = WalletTransactionPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(readInt32, 8)) {
                this.comment = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(readInt32, 16)) {
                this.tx_hash = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(readInt32, 128)) {
                this.nft = nftItem.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(-1792163517);
            boolean z12 = false;
            int flag = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(0, 1, this.incoming), 2, this.gasless), 4, this.failed);
            if (this.comment != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 8, z10);
            if (this.tx_hash != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag3 = TLObject.setFlag(TLObject.setFlag(TLObject.setFlag(flag2, 16, z11), 32, this.key_change), 64, this.comment_encrypted);
            if (this.nft != null) {
                z12 = true;
            }
            int flag4 = TLObject.setFlag(flag3, 128, z12);
            outputSerializedData.writeInt32(flag4);
            outputSerializedData.writeString(this.f20294id);
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
            if (this.incoming == wallettransaction.incoming && this.pending == wallettransaction.pending && this.key_change == wallettransaction.key_change && this.failed == wallettransaction.failed && this.amount == wallettransaction.amount && this.fee == wallettransaction.fee && this.date == wallettransaction.date && peerEquals(this.peer, wallettransaction.peer) && this.comment_encrypted == wallettransaction.comment_encrypted && this.comment_encrypted_preparing == wallettransaction.comment_encrypted_preparing && TextUtils.equals(this.comment, wallettransaction.comment) && TextUtils.equals(this.tx_hash, wallettransaction.tx_hash) && Objects.equals(this.nft, wallettransaction.nft) && this.preview == wallettransaction.preview && this.feeUnknown == wallettransaction.feeUnknown && TextUtils.equals(this.traceFeesNanograms, wallettransaction.traceFeesNanograms) && this.validUntil == wallettransaction.validUntil && this.traceSucceeded == wallettransaction.traceSucceeded && this.traceIncomplete == wallettransaction.traceIncomplete && TextUtils.equals(this.operationId, wallettransaction.operationId) && TextUtils.equals(this.messageHash, wallettransaction.messageHash) && this.phase == wallettransaction.phase) {
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.address = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.domain = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(103596476);
            if (this.domain != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.address);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.domain);
            }
        }
    }

    public static class walletTransactionPeerOnramp extends WalletTransactionPeer {
        public static final int constructor = -443213714;
        public String provider_name;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.address = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.domain = inputSerializedData.readString(z10);
            }
            this.provider_name = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-443213714);
            if (this.domain != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.address);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeString(this.domain);
            }
            outputSerializedData.writeString(this.provider_name);
        }
    }

    public static class walletTransactionPeerUser extends WalletTransactionPeer {
        public static final int constructor = -722833299;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.user_id = inputSerializedData.readInt64(z10);
            this.address = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.domain = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-722833299);
            if (this.domain != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
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

        public static walletTransactions TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            walletTransactions wallettransactions;
            if (1126356389 != i10) {
                wallettransactions = null;
            } else {
                wallettransactions = new walletTransactions();
            }
            return (walletTransactions) TLObject.TLdeserialize(walletTransactions.class, wallettransactions, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.balance = inputSerializedData.readInt64(z10);
            this.transactions = Vector.deserialize(inputSerializedData, new d(26), z10);
            if (TLObject.hasFlag(readInt32, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new n(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new n(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(1126356389);
            if (this.next_offset != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
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

        public static walletUserAddress TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            walletUserAddress walletuseraddress;
            if (-25628980 != i10) {
                walletuseraddress = null;
            } else {
                walletuseraddress = new walletUserAddress();
            }
            return (walletUserAddress) TLObject.TLdeserialize(walletUserAddress.class, walletuseraddress, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            if (TLObject.hasFlag(inputSerializedData.readInt32(z10), 1)) {
                this.user_id = inputSerializedData.readInt64(z10);
            }
            this.address = inputSerializedData.readString(z10);
            this.public_key = inputSerializedData.readByteArray(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-25628980);
            if (this.user_id != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(0, 1, z10);
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(flag, 1)) {
                outputSerializedData.writeInt64(this.user_id);
            }
            outputSerializedData.writeString(this.address);
            outputSerializedData.writeByteArray(this.public_key);
        }
    }

    public static class walletTransactionPeerUnsupported extends WalletTransactionPeer {
        public static final int constructor = 1921772890;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1921772890);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
        }
    }
}
