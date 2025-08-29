package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda40;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1;
import org.telegram.tgnet.TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC$TL_secureRequiredTypeOneOf$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

public class TL_account {

    public static class contentSettings extends TLObject {
        public static final int constructor = 1474462241;
        public int flags;
        public boolean sensitive_can_change;
        public boolean sensitive_enabled;

        public static contentSettings TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (1474462241 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account.contentSettings", Integer.valueOf(i)));
                }
                return null;
            }
            contentSettings contentsettings = new contentSettings();
            contentsettings.readParams(inputSerializedData, z);
            return contentsettings;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.sensitive_enabled = (readInt32 & 1) != 0;
            this.sensitive_can_change = (readInt32 & 2) != 0;
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1474462241);
            int i = this.sensitive_enabled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.sensitive_can_change ? i | 2 : i & (-3);
            this.flags = i2;
            outputSerializedData.writeInt32(i2);
        }
    }

    public static class setContentSettings extends TLObject {
        public static final int constructor = -1250643605;
        public int flags;
        public boolean sensitive_enabled;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1250643605);
            int i = this.sensitive_enabled ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
        }
    }

    public static class getContentSettings extends TLObject {
        public static final int constructor = -1952756306;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return contentSettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1952756306);
        }
    }

    public static class EmailVerified extends TLObject {
        public static EmailVerified TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            EmailVerified tL_emailVerifiedLogin;
            if (i != -507835039) {
                tL_emailVerifiedLogin = i != 731303195 ? null : new TL_emailVerified();
            } else {
                tL_emailVerifiedLogin = new TL_emailVerifiedLogin();
            }
            if (tL_emailVerifiedLogin == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in account_EmailVerified", Integer.valueOf(i)));
            }
            if (tL_emailVerifiedLogin != null) {
                tL_emailVerifiedLogin.readParams(inputSerializedData, z);
            }
            return tL_emailVerifiedLogin;
        }
    }

    public static class TL_emailVerified extends EmailVerified {
        public static final int constructor = 731303195;
        public String email;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.email = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(731303195);
            outputSerializedData.writeString(this.email);
        }
    }

    public static class TL_emailVerifiedLogin extends EmailVerified {
        public static final int constructor = -507835039;
        public String email;
        public TLRPC.auth_SentCode sent_code;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.email = inputSerializedData.readString(z);
            this.sent_code = TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-507835039);
            outputSerializedData.writeString(this.email);
            this.sent_code.serializeToStream(outputSerializedData);
        }
    }

    public static class passwordSettings extends TLObject {
        public static final int constructor = -1705233435;
        public String email;
        public int flags;
        public TLRPC.TL_secureSecretSettings secure_settings;

        public static passwordSettings TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-1705233435 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_passwordSettings", Integer.valueOf(i)));
                }
                return null;
            }
            passwordSettings passwordsettings = new passwordSettings();
            passwordsettings.readParams(inputSerializedData, z);
            return passwordsettings;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            if ((readInt32 & 1) != 0) {
                this.email = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.secure_settings = TLRPC.TL_secureSecretSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1705233435);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.email);
            }
            if ((this.flags & 2) != 0) {
                this.secure_settings.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class privacyRules extends TLObject {
        public static final int constructor = 1352683077;
        public ArrayList<TLRPC.PrivacyRule> rules = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static privacyRules TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (1352683077 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_privacyRules", Integer.valueOf(i)));
                }
                return null;
            }
            privacyRules privacyrules = new privacyRules();
            privacyrules.readParams(inputSerializedData, z);
            return privacyrules;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.rules = Vector.deserialize(inputSerializedData, new TLRPC$TL_updatePrivacy$$ExternalSyntheticLambda0(), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1352683077);
            Vector.serialize(outputSerializedData, this.rules);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class EmojiStatuses extends TLObject {
        public long hash;
        public ArrayList<TLRPC.EmojiStatus> statuses = new ArrayList<>();

        public static EmojiStatuses TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            EmojiStatuses tL_emojiStatuses;
            if (i == -1866176559) {
                tL_emojiStatuses = new TL_emojiStatuses();
            } else {
                if (i != -796072379) {
                    if (z) {
                        throw new RuntimeException(String.format("can't parse magic %x in account_EmojiStatuses", Integer.valueOf(i)));
                    }
                    return null;
                }
                tL_emojiStatuses = new TL_emojiStatusesNotModified();
            }
            tL_emojiStatuses.readParams(inputSerializedData, z);
            return tL_emojiStatuses;
        }
    }

    public static class TL_emojiStatusesNotModified extends EmojiStatuses {
        public static final int constructor = -796072379;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-796072379);
        }
    }

    public static class TL_emojiStatuses extends EmojiStatuses {
        public static final int constructor = -1866176559;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.statuses = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TLRPC.EmojiStatus.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1866176559);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.statuses);
        }
    }

    public static class Themes extends TLObject {
        public static Themes TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            Themes tL_themes;
            if (i == -1707242387) {
                tL_themes = new TL_themes();
            } else {
                if (i != -199313886) {
                    if (z) {
                        throw new RuntimeException(String.format("can't parse magic %x in account_Themes", Integer.valueOf(i)));
                    }
                    return null;
                }
                tL_themes = new TL_themesNotModified();
            }
            tL_themes.readParams(inputSerializedData, z);
            return tL_themes;
        }
    }

    public static class TL_themes extends Themes {
        public static final int constructor = -1707242387;
        public long hash;
        public ArrayList<TLRPC.TL_theme> themes = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.themes = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TLRPC.Theme.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1707242387);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.themes);
        }
    }

    public static class TL_themesNotModified extends Themes {
        public static final int constructor = -199313886;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-199313886);
        }
    }

    public static class WallPapers extends TLObject {
        public static WallPapers TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            WallPapers tL_wallPapers;
            if (i != -842824308) {
                tL_wallPapers = i != 471437699 ? null : new TL_wallPapersNotModified();
            } else {
                tL_wallPapers = new TL_wallPapers();
            }
            if (tL_wallPapers == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in account_WallPapers", Integer.valueOf(i)));
            }
            if (tL_wallPapers != null) {
                tL_wallPapers.readParams(inputSerializedData, z);
            }
            return tL_wallPapers;
        }
    }

    public static class TL_wallPapersNotModified extends WallPapers {
        public static final int constructor = 471437699;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(471437699);
        }
    }

    public static class TL_wallPapers extends WallPapers {
        public static final int constructor = -842824308;
        public long hash;
        public ArrayList<TLRPC.WallPaper> wallpapers = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.wallpapers = Vector.deserialize(inputSerializedData, new TL_account$TL_wallPapers$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-842824308);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.wallpapers);
        }
    }

    public static class Password extends TLObject {
        public TLRPC.PasswordKdfAlgo current_algo;
        public String email_unconfirmed_pattern;
        public int flags;
        public boolean has_password;
        public boolean has_recovery;
        public boolean has_secure_values;
        public String hint;
        public String login_email_pattern;
        public TLRPC.PasswordKdfAlgo new_algo;
        public TLRPC.SecurePasswordKdfAlgo new_secure_algo;
        public int pending_reset_date;
        public byte[] secure_random;
        public byte[] srp_B;
        public long srp_id;

        public static Password TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            Password tL_password;
            if (i == -1787080453) {
                tL_password = new TL_password();
            } else {
                tL_password = i != 408623183 ? null : new TL_password_layer144();
            }
            if (tL_password == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in account_Password", Integer.valueOf(i)));
            }
            if (tL_password != null) {
                tL_password.readParams(inputSerializedData, z);
            }
            return tL_password;
        }
    }

    public static class TL_password extends Password {
        public static final int constructor = -1787080453;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.has_recovery = (readInt32 & 1) != 0;
            this.has_secure_values = (readInt32 & 2) != 0;
            int i = readInt32 & 4;
            this.has_password = i != 0;
            if (i != 0) {
                this.current_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 4) != 0) {
                this.srp_B = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 4) != 0) {
                this.srp_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8) != 0) {
                this.hint = inputSerializedData.readString(z);
            }
            if ((this.flags & 16) != 0) {
                this.email_unconfirmed_pattern = inputSerializedData.readString(z);
            }
            this.new_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.new_secure_algo = TLRPC.SecurePasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.secure_random = inputSerializedData.readByteArray(z);
            if ((this.flags & 32) != 0) {
                this.pending_reset_date = inputSerializedData.readInt32(z);
            }
            if ((this.flags & 64) != 0) {
                this.login_email_pattern = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1787080453);
            int i = this.has_recovery ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.has_secure_values ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.has_password ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            if ((this.flags & 4) != 0) {
                this.current_algo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeByteArray(this.srp_B);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeInt64(this.srp_id);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.hint);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeString(this.email_unconfirmed_pattern);
            }
            this.new_algo.serializeToStream(outputSerializedData);
            this.new_secure_algo.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.secure_random);
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.pending_reset_date);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeString(this.login_email_pattern);
            }
        }
    }

    public static class TL_password_layer144 extends Password {
        public static final int constructor = 408623183;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.has_recovery = (readInt32 & 1) != 0;
            this.has_secure_values = (readInt32 & 2) != 0;
            int i = readInt32 & 4;
            this.has_password = i != 0;
            if (i != 0) {
                this.current_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 4) != 0) {
                this.srp_B = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 4) != 0) {
                this.srp_id = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 8) != 0) {
                this.hint = inputSerializedData.readString(z);
            }
            if ((this.flags & 16) != 0) {
                this.email_unconfirmed_pattern = inputSerializedData.readString(z);
            }
            this.new_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.new_secure_algo = TLRPC.SecurePasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.secure_random = inputSerializedData.readByteArray(z);
            if ((this.flags & 32) != 0) {
                this.pending_reset_date = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(408623183);
            int i = this.has_recovery ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.has_secure_values ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.has_password ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            if ((this.flags & 4) != 0) {
                this.current_algo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeByteArray(this.srp_B);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeInt64(this.srp_id);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.hint);
            }
            if ((this.flags & 16) != 0) {
                outputSerializedData.writeString(this.email_unconfirmed_pattern);
            }
            this.new_algo.serializeToStream(outputSerializedData);
            this.new_secure_algo.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.secure_random);
            if ((this.flags & 32) != 0) {
                outputSerializedData.writeInt32(this.pending_reset_date);
            }
        }
    }

    public static class tmpPassword extends TLObject {
        public static final int constructor = -614138572;
        public byte[] tmp_password;
        public int valid_until;

        public static tmpPassword TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-614138572 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_tmpPassword", Integer.valueOf(i)));
                }
                return null;
            }
            tmpPassword tmppassword = new tmpPassword();
            tmppassword.readParams(inputSerializedData, z);
            return tmppassword;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.tmp_password = inputSerializedData.readByteArray(z);
            this.valid_until = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-614138572);
            outputSerializedData.writeByteArray(this.tmp_password);
            outputSerializedData.writeInt32(this.valid_until);
        }
    }

    public static class authorizationForm extends TLObject {
        public static final int constructor = -1389486888;
        public int flags;
        public String privacy_policy_url;
        public ArrayList<TLRPC.SecureRequiredType> required_types = new ArrayList<>();
        public ArrayList<TLRPC.TL_secureValue> values = new ArrayList<>();
        public ArrayList<TLRPC.SecureValueError> errors = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static authorizationForm TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-1389486888 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_authorizationForm", Integer.valueOf(i)));
                }
                return null;
            }
            authorizationForm authorizationform = new authorizationForm();
            authorizationform.readParams(inputSerializedData, z);
            return authorizationform;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.required_types = Vector.deserialize(inputSerializedData, new TLRPC$TL_secureRequiredTypeOneOf$$ExternalSyntheticLambda0(), z);
            this.values = Vector.deserialize(inputSerializedData, new TL_account$authorizationForm$$ExternalSyntheticLambda0(), z);
            this.errors = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TLRPC.SecureValueError.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            if ((this.flags & 1) != 0) {
                this.privacy_policy_url = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1389486888);
            outputSerializedData.writeInt32(this.flags);
            Vector.serialize(outputSerializedData, this.required_types);
            Vector.serialize(outputSerializedData, this.values);
            Vector.serialize(outputSerializedData, this.errors);
            Vector.serialize(outputSerializedData, this.users);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.privacy_policy_url);
            }
        }
    }

    public static class autoDownloadSettings extends TLObject {
        public static final int constructor = 1674235686;
        public TLRPC.TL_autoDownloadSettings high;
        public TLRPC.TL_autoDownloadSettings low;
        public TLRPC.TL_autoDownloadSettings medium;

        public static autoDownloadSettings TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (1674235686 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_autoDownloadSettings", Integer.valueOf(i)));
                }
                return null;
            }
            autoDownloadSettings autodownloadsettings = new autoDownloadSettings();
            autodownloadsettings.readParams(inputSerializedData, z);
            return autodownloadsettings;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.low = TLRPC.TL_autoDownloadSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.medium = TLRPC.TL_autoDownloadSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.high = TLRPC.TL_autoDownloadSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1674235686);
            this.low.serializeToStream(outputSerializedData);
            this.medium.serializeToStream(outputSerializedData);
            this.high.serializeToStream(outputSerializedData);
        }
    }

    public static class sentEmailCode extends TLObject {
        public static final int constructor = -2128640689;
        public String email_pattern;
        public int length;

        public static sentEmailCode TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-2128640689 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_sentEmailCode", Integer.valueOf(i)));
                }
                return null;
            }
            sentEmailCode sentemailcode = new sentEmailCode();
            sentemailcode.readParams(inputSerializedData, z);
            return sentemailcode;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.email_pattern = inputSerializedData.readString(z);
            this.length = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2128640689);
            outputSerializedData.writeString(this.email_pattern);
            outputSerializedData.writeInt32(this.length);
        }
    }

    public static class webAuthorizations extends TLObject {
        public static final int constructor = -313079300;
        public ArrayList<TLRPC.TL_webAuthorization> authorizations = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static webAuthorizations TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-313079300 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_webAuthorizations", Integer.valueOf(i)));
                }
                return null;
            }
            webAuthorizations webauthorizations = new webAuthorizations();
            webauthorizations.readParams(inputSerializedData, z);
            return webauthorizations;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.authorizations = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TLRPC.TL_webAuthorization.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-313079300);
            Vector.serialize(outputSerializedData, this.authorizations);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class passwordInputSettings extends TLObject {
        public static final int constructor = -1036572727;
        public String email;
        public int flags;
        public String hint;
        public TLRPC.PasswordKdfAlgo new_algo;
        public byte[] new_password_hash;
        public TLRPC.TL_secureSecretSettings new_secure_settings;

        public static passwordInputSettings TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-1036572727 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_passwordInputSettings", Integer.valueOf(i)));
                }
                return null;
            }
            passwordInputSettings passwordinputsettings = new passwordInputSettings();
            passwordinputsettings.readParams(inputSerializedData, z);
            return passwordinputsettings;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            if ((readInt32 & 1) != 0) {
                this.new_algo = TLRPC.PasswordKdfAlgo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 1) != 0) {
                this.new_password_hash = inputSerializedData.readByteArray(z);
            }
            if ((this.flags & 1) != 0) {
                this.hint = inputSerializedData.readString(z);
            }
            if ((this.flags & 2) != 0) {
                this.email = inputSerializedData.readString(z);
            }
            if ((this.flags & 4) != 0) {
                this.new_secure_settings = TLRPC.TL_secureSecretSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1036572727);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.new_algo.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeByteArray(this.new_password_hash);
            }
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.hint);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.email);
            }
            if ((this.flags & 4) != 0) {
                this.new_secure_settings.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class ResetPasswordResult extends TLObject {
        public static ResetPasswordResult TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            ResetPasswordResult resetpasswordfailedwait;
            if (i == -478701471) {
                resetpasswordfailedwait = new resetPasswordFailedWait();
            } else if (i != -383330754) {
                resetpasswordfailedwait = i != -370148227 ? null : new resetPasswordRequestedWait();
            } else {
                resetpasswordfailedwait = new resetPasswordOk();
            }
            if (resetpasswordfailedwait == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in account_ResetPasswordResult", Integer.valueOf(i)));
            }
            if (resetpasswordfailedwait != null) {
                resetpasswordfailedwait.readParams(inputSerializedData, z);
            }
            return resetpasswordfailedwait;
        }
    }

    public static class resetPasswordFailedWait extends ResetPasswordResult {
        public static final int constructor = -478701471;
        public int retry_date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.retry_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-478701471);
            outputSerializedData.writeInt32(this.retry_date);
        }
    }

    public static class resetPasswordRequestedWait extends ResetPasswordResult {
        public static final int constructor = -370148227;
        public int until_date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.until_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-370148227);
            outputSerializedData.writeInt32(this.until_date);
        }
    }

    public static class resetPasswordOk extends ResetPasswordResult {
        public static final int constructor = -383330754;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-383330754);
        }
    }

    public static class authorizations extends TLObject {
        public static final int constructor = 1275039392;
        public int authorization_ttl_days;
        public ArrayList<TLRPC.TL_authorization> authorizations = new ArrayList<>();

        public static authorizations TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (1275039392 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_authorizations", Integer.valueOf(i)));
                }
                return null;
            }
            authorizations authorizationsVar = new authorizations();
            authorizationsVar.readParams(inputSerializedData, z);
            return authorizationsVar;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.authorization_ttl_days = inputSerializedData.readInt32(z);
            this.authorizations = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TLRPC.TL_authorization.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1275039392);
            outputSerializedData.writeInt32(this.authorization_ttl_days);
            Vector.serialize(outputSerializedData, this.authorizations);
        }
    }

    public static class registerDevice extends TLObject {
        public static final int constructor = -326762118;
        public boolean app_sandbox;
        public int flags;
        public boolean no_muted;
        public ArrayList<Long> other_uids = new ArrayList<>();
        public byte[] secret;
        public String token;
        public int token_type;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-326762118);
            int i = this.no_muted ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt32(this.token_type);
            outputSerializedData.writeString(this.token);
            outputSerializedData.writeBool(this.app_sandbox);
            outputSerializedData.writeByteArray(this.secret);
            Vector.serializeLong(outputSerializedData, this.other_uids);
        }
    }

    public static class unregisterDevice extends TLObject {
        public static final int constructor = 1779249670;
        public ArrayList<Long> other_uids = new ArrayList<>();
        public String token;
        public int token_type;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1779249670);
            outputSerializedData.writeInt32(this.token_type);
            outputSerializedData.writeString(this.token);
            Vector.serializeLong(outputSerializedData, this.other_uids);
        }
    }

    public static class updateNotifySettings extends TLObject {
        public static final int constructor = -2067899501;
        public TLRPC.InputNotifyPeer peer;
        public TLRPC.TL_inputPeerNotifySettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2067899501);
            this.peer.serializeToStream(outputSerializedData);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class getNotifySettings extends TLObject {
        public static final int constructor = 313765169;
        public TLRPC.InputNotifyPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.PeerNotifySettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(313765169);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class resetNotifySettings extends TLObject {
        public static final int constructor = -612493497;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-612493497);
        }
    }

    public static class updateProfile extends TLObject {
        public static final int constructor = 2018596725;
        public String about;
        public String first_name;
        public int flags;
        public String last_name;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.User.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2018596725);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.first_name);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.last_name);
            }
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.about);
            }
        }
    }

    public static class updateStatus extends TLObject {
        public static final int constructor = 1713919532;
        public boolean offline;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1713919532);
            outputSerializedData.writeBool(this.offline);
        }
    }

    public static class getWallPapers extends TLObject {
        public static final int constructor = 127302966;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return WallPapers.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(127302966);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class reportPeer extends TLObject {
        public static final int constructor = -977650298;
        public String message;
        public TLRPC.InputPeer peer;
        public TLRPC.ReportReason reason;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-977650298);
            this.peer.serializeToStream(outputSerializedData);
            this.reason.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.message);
        }
    }

    public static class resetPassword extends TLObject {
        public static final int constructor = -1828139493;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return ResetPasswordResult.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1828139493);
        }
    }

    public static class declinePasswordReset extends TLObject {
        public static final int constructor = 1284770294;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1284770294);
        }
    }

    public static class getChatThemes extends TLMethod<Themes> {
        public static final int constructor = -700916087;
        public long hash;

        @Override
        public Themes deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return Themes.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-700916087);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class setAuthorizationTTL extends TLObject {
        public static final int constructor = -1081501024;
        public int authorization_ttl_days;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1081501024);
            outputSerializedData.writeInt32(this.authorization_ttl_days);
        }
    }

    public static class changeAuthorizationSettings extends TLObject {
        public static final int constructor = 1089766498;
        public boolean call_requests_disabled;
        public boolean confirmed;
        public boolean encrypted_requests_disabled;
        public int flags;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1089766498);
            int i = this.confirmed ? this.flags | 8 : this.flags & (-9);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt64(this.hash);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeBool(this.encrypted_requests_disabled);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeBool(this.call_requests_disabled);
            }
        }
    }

    public static class checkUsername extends TLObject {
        public static final int constructor = 655677548;
        public String username;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(655677548);
            outputSerializedData.writeString(this.username);
        }
    }

    public static class updateUsername extends TLObject {
        public static final int constructor = 1040964988;
        public String username;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.User.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1040964988);
            outputSerializedData.writeString(this.username);
        }
    }

    public static class getPrivacy extends TLObject {
        public static final int constructor = -623130288;
        public TLRPC.InputPrivacyKey key;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return privacyRules.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-623130288);
            this.key.serializeToStream(outputSerializedData);
        }
    }

    public static class setPrivacy extends TLObject {
        public static final int constructor = -906486552;
        public TLRPC.InputPrivacyKey key;
        public ArrayList<TLRPC.InputPrivacyRule> rules = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return privacyRules.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-906486552);
            this.key.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.rules);
        }
    }

    public static class deleteAccount extends TLObject {
        public static final int constructor = 1099779595;
        public String reason;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1099779595);
            outputSerializedData.writeString(this.reason);
        }
    }

    public static class getAccountTTL extends TLObject {
        public static final int constructor = 150761757;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.TL_accountDaysTTL.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(150761757);
        }
    }

    public static class setAccountTTL extends TLObject {
        public static final int constructor = 608323678;
        public TLRPC.TL_accountDaysTTL ttl;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(608323678);
            this.ttl.serializeToStream(outputSerializedData);
        }
    }

    public static class sendChangePhoneCode extends TLObject {
        public static final int constructor = -2108208411;
        public String phone_number;
        public TLRPC.TL_codeSettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2108208411);
            outputSerializedData.writeString(this.phone_number);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class changePhone extends TLObject {
        public static final int constructor = 1891839707;
        public String phone_code;
        public String phone_code_hash;
        public String phone_number;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.User.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1891839707);
            outputSerializedData.writeString(this.phone_number);
            outputSerializedData.writeString(this.phone_code_hash);
            outputSerializedData.writeString(this.phone_code);
        }
    }

    public static class getWebAuthorizations extends TLObject {
        public static final int constructor = 405695855;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return webAuthorizations.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(405695855);
        }
    }

    public static class resetWebAuthorization extends TLObject {
        public static final int constructor = 755087855;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(755087855);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class resetWebAuthorizations extends TLObject {
        public static final int constructor = 1747789204;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1747789204);
        }
    }

    public static class getMultiWallPapers extends TLObject {
        public static final int constructor = 1705865692;
        public ArrayList<TLRPC.InputWallPaper> wallpapers = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new TL_account$TL_wallPapers$$ExternalSyntheticLambda0());
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1705865692);
            Vector.serialize(outputSerializedData, this.wallpapers);
        }
    }

    public static class getGlobalPrivacySettings extends TLObject {
        public static final int constructor = -349483786;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.GlobalPrivacySettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-349483786);
        }
    }

    public static class setGlobalPrivacySettings extends TLObject {
        public static final int constructor = 517647042;
        public TLRPC.GlobalPrivacySettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.GlobalPrivacySettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(517647042);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class reportProfilePhoto extends TLObject {
        public static final int constructor = -91437323;
        public String message;
        public TLRPC.InputPeer peer;
        public TLRPC.InputPhoto photo_id;
        public TLRPC.ReportReason reason;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-91437323);
            this.peer.serializeToStream(outputSerializedData);
            this.photo_id.serializeToStream(outputSerializedData);
            this.reason.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.message);
        }
    }

    public static class getAllSecureValues extends TLObject {
        public static final int constructor = -1299661699;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new TL_account$authorizationForm$$ExternalSyntheticLambda0());
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1299661699);
        }
    }

    public static class getSecureValue extends TLObject {
        public static final int constructor = 1936088002;
        public ArrayList<TLRPC.SecureValueType> types = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new TL_account$authorizationForm$$ExternalSyntheticLambda0());
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1936088002);
            Vector.serialize(outputSerializedData, this.types);
        }
    }

    public static class saveSecureValue extends TLObject {
        public static final int constructor = -1986010339;
        public long secure_secret_id;
        public TLRPC.TL_inputSecureValue value;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.TL_secureValue.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1986010339);
            this.value.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.secure_secret_id);
        }
    }

    public static class deleteSecureValue extends TLObject {
        public static final int constructor = -1199522741;
        public ArrayList<TLRPC.SecureValueType> types = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1199522741);
            Vector.serialize(outputSerializedData, this.types);
        }
    }

    public static class getAuthorizationForm extends TLObject {
        public static final int constructor = -1456907910;
        public long bot_id;
        public String public_key;
        public String scope;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return authorizationForm.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1456907910);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeString(this.scope);
            outputSerializedData.writeString(this.public_key);
        }
    }

    public static class acceptAuthorization extends TLObject {
        public static final int constructor = -202552205;
        public long bot_id;
        public TLRPC.TL_secureCredentialsEncrypted credentials;
        public String public_key;
        public String scope;
        public ArrayList<TLRPC.TL_secureValueHash> value_hashes = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-202552205);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeString(this.scope);
            outputSerializedData.writeString(this.public_key);
            Vector.serialize(outputSerializedData, this.value_hashes);
            this.credentials.serializeToStream(outputSerializedData);
        }
    }

    public static class sendVerifyPhoneCode extends TLObject {
        public static final int constructor = -1516022023;
        public String phone_number;
        public TLRPC.TL_codeSettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1516022023);
            outputSerializedData.writeString(this.phone_number);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class verifyPhone extends TLObject {
        public static final int constructor = 1305716726;
        public String phone_code;
        public String phone_code_hash;
        public String phone_number;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1305716726);
            outputSerializedData.writeString(this.phone_number);
            outputSerializedData.writeString(this.phone_code_hash);
            outputSerializedData.writeString(this.phone_code);
        }
    }

    public static class sendVerifyEmailCode extends TLObject {
        public static final int constructor = -1730136133;
        public String email;
        public TLRPC.EmailVerifyPurpose purpose;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return sentEmailCode.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1730136133);
            this.purpose.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.email);
        }
    }

    public static class verifyEmail extends TLObject {
        public static final int constructor = 53322959;
        public TLRPC.EmailVerifyPurpose purpose;
        public TLRPC.EmailVerification verification;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return EmailVerified.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(53322959);
            this.purpose.serializeToStream(outputSerializedData);
            this.verification.serializeToStream(outputSerializedData);
        }
    }

    public static class confirmPasswordEmail extends TLObject {
        public static final int constructor = -1881204448;
        public String code;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1881204448);
            outputSerializedData.writeString(this.code);
        }
    }

    public static class resendPasswordEmail extends TLObject {
        public static final int constructor = 2055154197;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2055154197);
        }
    }

    public static class cancelPasswordEmail extends TLObject {
        public static final int constructor = -1043606090;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1043606090);
        }
    }

    public static class getContactSignUpNotification extends TLObject {
        public static final int constructor = -1626880216;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1626880216);
        }
    }

    public static class setContactSignUpNotification extends TLObject {
        public static final int constructor = -806076575;
        public boolean silent;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-806076575);
            outputSerializedData.writeBool(this.silent);
        }
    }

    public static class getNotifyExceptions extends TLObject {
        public static final int constructor = 1398240377;
        public boolean compare_sound;
        public int flags;
        public TLRPC.InputNotifyPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1398240377);
            int i = this.compare_sound ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            if ((this.flags & 1) != 0) {
                this.peer.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class getWallPaper extends TLObject {
        public static final int constructor = -57811990;
        public TLRPC.InputWallPaper wallpaper;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-57811990);
            this.wallpaper.serializeToStream(outputSerializedData);
        }
    }

    public static class uploadWallPaper extends TLObject {
        public static final int constructor = -578472351;
        public TLRPC.InputFile file;
        public String mime_type;
        public TLRPC.TL_wallPaperSettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.WallPaper.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-578472351);
            this.file.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.mime_type);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class saveWallPaper extends TLObject {
        public static final int constructor = 1817860919;
        public TLRPC.TL_wallPaperSettings settings;
        public boolean unsave;
        public TLRPC.InputWallPaper wallpaper;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1817860919);
            this.wallpaper.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class installWallPaper extends TLObject {
        public static final int constructor = -18000023;
        public TLRPC.TL_wallPaperSettings settings;
        public TLRPC.InputWallPaper wallpaper;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-18000023);
            this.wallpaper.serializeToStream(outputSerializedData);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class resetWallPapers extends TLObject {
        public static final int constructor = -1153722364;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1153722364);
        }
    }

    public static class getAutoDownloadSettings extends TLObject {
        public static final int constructor = 1457130303;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return autoDownloadSettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1457130303);
        }
    }

    public static class saveAutoDownloadSettings extends TLObject {
        public static final int constructor = 1995661875;
        public int flags;
        public boolean high;
        public boolean low;
        public TLRPC.TL_autoDownloadSettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1995661875);
            int i = this.low ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.high ? i | 2 : i & (-3);
            this.flags = i2;
            outputSerializedData.writeInt32(i2);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class uploadTheme extends TLObject {
        public static final int constructor = 473805619;
        public TLRPC.InputFile file;
        public String file_name;
        public int flags;
        public String mime_type;
        public TLRPC.InputFile thumb;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Document.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(473805619);
            outputSerializedData.writeInt32(this.flags);
            this.file.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                this.thumb.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeString(this.file_name);
            outputSerializedData.writeString(this.mime_type);
        }
    }

    public static class createTheme extends TLObject {
        public static final int constructor = -2077048289;
        public TLRPC.InputDocument document;
        public int flags;
        public TLRPC.TL_inputThemeSettings settings;
        public String slug;
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Theme.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2077048289);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.slug);
            outputSerializedData.writeString(this.title);
            if ((this.flags & 4) != 0) {
                this.document.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                this.settings.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class updateTheme extends TLObject {
        public static final int constructor = 1555261397;
        public TLRPC.InputDocument document;
        public int flags;
        public String format;
        public TLRPC.TL_inputThemeSettings settings;
        public String slug;
        public TLRPC.InputTheme theme;
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Theme.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1555261397);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.format);
            this.theme.serializeToStream(outputSerializedData);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.slug);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.title);
            }
            if ((this.flags & 4) != 0) {
                this.document.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 8) != 0) {
                this.settings.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class saveTheme extends TLObject {
        public static final int constructor = -229175188;
        public TLRPC.InputTheme theme;
        public boolean unsave;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-229175188);
            this.theme.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
        }
    }

    public static class installTheme extends TLObject {
        public static final int constructor = 2061776695;
        public boolean dark;
        public int flags;
        public String format;
        public TLRPC.InputTheme theme;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2061776695);
            int i = this.dark ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.format);
            }
            if ((this.flags & 2) != 0) {
                this.theme.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class getTheme extends TLObject {
        public static final int constructor = -1919060949;
        public long document_id;
        public String format;
        public TLRPC.InputTheme theme;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Theme.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1919060949);
            outputSerializedData.writeString(this.format);
            this.theme.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.document_id);
        }
    }

    public static class getThemes extends TLObject {
        public static final int constructor = 1913054296;
        public String format;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Themes.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1913054296);
            outputSerializedData.writeString(this.format);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class updateEmojiStatus extends TLObject {
        public static final int constructor = -70001045;
        public TLRPC.EmojiStatus emoji_status;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-70001045);
            this.emoji_status.serializeToStream(outputSerializedData);
        }
    }

    public static class getDefaultBackgroundEmojis extends TLObject {
        public static final int constructor = -1509246514;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1509246514);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getChannelDefaultEmojiStatuses extends TLObject {
        public static final int constructor = 1999087573;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return EmojiStatuses.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1999087573);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getDefaultEmojiStatuses extends TLObject {
        public static final int constructor = -696962170;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return EmojiStatuses.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-696962170);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getRecentEmojiStatuses extends TLObject {
        public static final int constructor = 257392901;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return EmojiStatuses.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(257392901);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class clearRecentEmojiStatuses extends TLObject {
        public static final int constructor = 404757166;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(404757166);
        }
    }

    public static class updateDeviceLocked extends TLObject {
        public static final int constructor = 954152242;
        public int period;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(954152242);
            outputSerializedData.writeInt32(this.period);
        }
    }

    public static class webPagePreview extends TLObject {
        public static final int constructor = -1936029524;
        public TLRPC.MessageMedia media;
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static webPagePreview TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-1936029524 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in webPagePreview", Integer.valueOf(i)));
                }
                return null;
            }
            webPagePreview webpagepreview = new webPagePreview();
            webpagepreview.readParams(inputSerializedData, z);
            return webpagepreview;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1936029524);
            this.media.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class getWebPagePreview extends TLObject {
        public static final int constructor = 1460498287;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public int flags;
        public String message;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return webPagePreview.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1460498287);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.message);
            if ((this.flags & 8) != 0) {
                Vector.serialize(outputSerializedData, this.entities);
            }
        }
    }

    public static class getAuthorizations extends TLObject {
        public static final int constructor = -484392616;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return authorizations.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-484392616);
        }
    }

    public static class resetAuthorization extends TLObject {
        public static final int constructor = -545786948;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-545786948);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getPassword extends TLObject {
        public static final int constructor = 1418342645;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Password.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1418342645);
        }
    }

    public static class getPasswordSettings extends TLObject {
        public static final int constructor = -1663767815;
        public TLRPC.InputCheckPasswordSRP password;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return passwordSettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1663767815);
            this.password.serializeToStream(outputSerializedData);
        }
    }

    public static class updatePasswordSettings extends TLObject {
        public static final int constructor = -1516564433;
        public passwordInputSettings new_settings;
        public TLRPC.InputCheckPasswordSRP password;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1516564433);
            this.password.serializeToStream(outputSerializedData);
            this.new_settings.serializeToStream(outputSerializedData);
        }
    }

    public static class sendConfirmPhoneCode extends TLObject {
        public static final int constructor = 457157256;
        public String hash;
        public TLRPC.TL_codeSettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(457157256);
            outputSerializedData.writeString(this.hash);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class confirmPhone extends TLObject {
        public static final int constructor = 1596029123;
        public String phone_code;
        public String phone_code_hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1596029123);
            outputSerializedData.writeString(this.phone_code_hash);
            outputSerializedData.writeString(this.phone_code);
        }
    }

    public static class getTmpPassword extends TLObject {
        public static final int constructor = 1151208273;
        public TLRPC.InputCheckPasswordSRP password;
        public int period;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return tmpPassword.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1151208273);
            this.password.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.period);
        }
    }

    public static class SavedRingtones extends TLObject {
        public static SavedRingtones TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            SavedRingtones tL_savedRingtones;
            if (i != -1041683259) {
                tL_savedRingtones = i != -67704655 ? null : new TL_savedRingtonesNotModified();
            } else {
                tL_savedRingtones = new TL_savedRingtones();
            }
            if (tL_savedRingtones == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in account_SavedRingtones", Integer.valueOf(i)));
            }
            if (tL_savedRingtones != null) {
                tL_savedRingtones.readParams(inputSerializedData, z);
            }
            return tL_savedRingtones;
        }
    }

    public static class TL_savedRingtonesNotModified extends SavedRingtones {
        public static final int constructor = -67704655;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-67704655);
        }
    }

    public static class TL_savedRingtones extends SavedRingtones {
        public static final int constructor = -1041683259;
        public long hash;
        public ArrayList<TLRPC.Document> ringtones = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.hash = inputSerializedData.readInt64(z);
            this.ringtones = Vector.deserialize(inputSerializedData, new TLRPC$TL_help_premiumPromo$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1041683259);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.ringtones);
        }
    }

    public static class uploadRingtone extends TLObject {
        public static final int constructor = -2095414366;
        public TLRPC.InputFile file;
        public String file_name;
        public String mime_type;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Document.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2095414366);
            this.file.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.file_name);
            outputSerializedData.writeString(this.mime_type);
        }
    }

    public static class getSavedRingtones extends TLObject {
        public static final int constructor = -510647672;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return SavedRingtones.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-510647672);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class saveRingtone extends TLObject {
        public static final int constructor = 1038768899;
        public TLRPC.InputDocument id;
        public boolean unsave;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return SavedRingtone.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1038768899);
            this.id.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.unsave);
        }
    }

    public static class reorderUsernames extends TLObject {
        public static final int constructor = -279966037;
        public ArrayList<String> order = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-279966037);
            Vector.serializeString(outputSerializedData, this.order);
        }
    }

    public static class toggleUsername extends TLObject {
        public static final int constructor = 1490465654;
        public boolean active;
        public String username;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1490465654);
            outputSerializedData.writeString(this.username);
            outputSerializedData.writeBool(this.active);
        }
    }

    public static class SavedRingtone extends TLObject {
        public static SavedRingtone TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            SavedRingtone tL_savedRingtone;
            if (i != -1222230163) {
                tL_savedRingtone = i != 523271863 ? null : new TL_savedRingtoneConverted();
            } else {
                tL_savedRingtone = new TL_savedRingtone();
            }
            if (tL_savedRingtone == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in account_SavedRingtone", Integer.valueOf(i)));
            }
            if (tL_savedRingtone != null) {
                tL_savedRingtone.readParams(inputSerializedData, z);
            }
            return tL_savedRingtone;
        }
    }

    public static class TL_savedRingtoneConverted extends SavedRingtone {
        public static final int constructor = 523271863;
        public TLRPC.Document document;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.document = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(523271863);
            this.document.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_savedRingtone extends SavedRingtone {
        public static final int constructor = -1222230163;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1222230163);
        }
    }

    public static class getDefaultProfilePhotoEmojis extends TLObject {
        public static final int constructor = -495647960;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-495647960);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getDefaultGroupPhotoEmojis extends TLObject {
        public static final int constructor = -1856479058;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1856479058);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getChannelRestrictedStatusEmojis extends TLObject {
        public static final int constructor = 900325589;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.EmojiList.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(900325589);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class updateColor extends TLObject {
        public static final int constructor = 2096079197;
        public long background_emoji_id;
        public int color;
        public int flags;
        public boolean for_profile;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2096079197);
            int i = this.for_profile ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeInt32(this.color);
            }
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt64(this.background_emoji_id);
            }
        }
    }

    public static class TL_businessWeeklyOpen extends TLObject {
        public static final int constructor = 302717625;
        public int end_minute;
        public int start_minute;

        public static TL_businessWeeklyOpen TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 302717625) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessWeeklyOpen", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_businessWeeklyOpen();
            tL_businessWeeklyOpen.readParams(inputSerializedData, z);
            return tL_businessWeeklyOpen;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.start_minute = inputSerializedData.readInt32(z);
            this.end_minute = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(302717625);
            outputSerializedData.writeInt32(this.start_minute);
            outputSerializedData.writeInt32(this.end_minute);
        }
    }

    public static class TL_businessWorkHours extends TLObject {
        public static final int constructor = -1936543592;
        public int flags;
        public boolean open_now;
        public String timezone_id;
        public ArrayList<TL_businessWeeklyOpen> weekly_open = new ArrayList<>();

        public static TL_businessWorkHours TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != -1936543592) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessWorkHours", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessWorkHours tL_businessWorkHours = new TL_businessWorkHours();
            tL_businessWorkHours.readParams(inputSerializedData, z);
            return tL_businessWorkHours;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.open_now = (readInt32 & 1) != 0;
            this.timezone_id = inputSerializedData.readString(z);
            this.weekly_open = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_account.TL_businessWeeklyOpen.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1936543592);
            int i = this.open_now ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeString(this.timezone_id);
            Vector.serialize(outputSerializedData, this.weekly_open);
        }
    }

    public static class updateBusinessWorkHours extends TLObject {
        public static final int constructor = 1258348646;
        public TL_businessWorkHours business_work_hours;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1258348646);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.business_work_hours.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class updateBusinessLocation extends TLObject {
        public static final int constructor = -1637149926;
        public String address;
        public int flags;
        public TLRPC.InputGeoPoint geo_point;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1637149926);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 2) != 0) {
                this.geo_point.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeString(this.address);
            }
        }
    }

    public static class BusinessAwayMessageSchedule extends TLObject {
        public static BusinessAwayMessageSchedule TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            BusinessAwayMessageSchedule tL_businessAwayMessageScheduleOutsideWorkHours;
            if (i == -1007487743) {
                tL_businessAwayMessageScheduleOutsideWorkHours = new TL_businessAwayMessageScheduleOutsideWorkHours();
            } else if (i == -910564679) {
                tL_businessAwayMessageScheduleOutsideWorkHours = new TL_businessAwayMessageScheduleAlways();
            } else {
                tL_businessAwayMessageScheduleOutsideWorkHours = i != -867328308 ? null : new TL_businessAwayMessageScheduleCustom();
            }
            if (tL_businessAwayMessageScheduleOutsideWorkHours == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in BusinessAwayMessageSchedule", Integer.valueOf(i)));
            }
            if (tL_businessAwayMessageScheduleOutsideWorkHours != null) {
                tL_businessAwayMessageScheduleOutsideWorkHours.readParams(inputSerializedData, z);
            }
            return tL_businessAwayMessageScheduleOutsideWorkHours;
        }
    }

    public static class TL_businessAwayMessageScheduleAlways extends BusinessAwayMessageSchedule {
        public static final int constructor = -910564679;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-910564679);
        }
    }

    public static class TL_businessAwayMessageScheduleOutsideWorkHours extends BusinessAwayMessageSchedule {
        public static final int constructor = -1007487743;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1007487743);
        }
    }

    public static class TL_businessAwayMessageScheduleCustom extends BusinessAwayMessageSchedule {
        public static final int constructor = -867328308;
        public int end_date;
        public int start_date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.start_date = inputSerializedData.readInt32(z);
            this.end_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-867328308);
            outputSerializedData.writeInt32(this.start_date);
            outputSerializedData.writeInt32(this.end_date);
        }
    }

    public static class TL_inputBusinessGreetingMessage extends TLObject {
        public static final int constructor = 26528571;
        public int no_activity_days;
        public TL_inputBusinessRecipients recipients;
        public int shortcut_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.shortcut_id = inputSerializedData.readInt32(z);
            this.recipients = TL_inputBusinessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.no_activity_days = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(26528571);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.recipients.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.no_activity_days);
        }
    }

    public static class TL_businessGreetingMessage extends TLObject {
        public static final int constructor = -451302485;
        public int no_activity_days;
        public TL_businessRecipients recipients;
        public int shortcut_id;

        public static TL_businessGreetingMessage TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != -451302485) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessGreetingMessage", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessGreetingMessage tL_businessGreetingMessage = new TL_businessGreetingMessage();
            tL_businessGreetingMessage.readParams(inputSerializedData, z);
            return tL_businessGreetingMessage;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.shortcut_id = inputSerializedData.readInt32(z);
            this.recipients = TL_businessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.no_activity_days = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-451302485);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.recipients.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.no_activity_days);
        }
    }

    public static class TL_inputBusinessAwayMessage extends TLObject {
        public static final int constructor = -2094959136;
        public int flags;
        public boolean offline_only;
        public TL_inputBusinessRecipients recipients;
        public BusinessAwayMessageSchedule schedule;
        public int shortcut_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.offline_only = (readInt32 & 1) != 0;
            this.shortcut_id = inputSerializedData.readInt32(z);
            this.schedule = BusinessAwayMessageSchedule.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.recipients = TL_inputBusinessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2094959136);
            int i = this.offline_only ? this.flags | 1 : this.flags & 1;
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.schedule.serializeToStream(outputSerializedData);
            this.recipients.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_businessAwayMessage extends TLObject {
        public static final int constructor = -283809188;
        public int flags;
        public boolean offline_only;
        public TL_businessRecipients recipients;
        public BusinessAwayMessageSchedule schedule;
        public int shortcut_id;

        public static TL_businessAwayMessage TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != -283809188) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessAwayMessage", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessAwayMessage tL_businessAwayMessage = new TL_businessAwayMessage();
            tL_businessAwayMessage.readParams(inputSerializedData, z);
            return tL_businessAwayMessage;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.offline_only = (readInt32 & 1) != 0;
            this.shortcut_id = inputSerializedData.readInt32(z);
            this.schedule = BusinessAwayMessageSchedule.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.recipients = TL_businessRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-283809188);
            int i = this.offline_only ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeInt32(this.shortcut_id);
            this.schedule.serializeToStream(outputSerializedData);
            this.recipients.serializeToStream(outputSerializedData);
        }
    }

    public static class updateBusinessAwayMessage extends TLObject {
        public static final int constructor = -1570078811;
        public int flags;
        public TL_inputBusinessAwayMessage message;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1570078811);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class updateBusinessGreetingMessage extends TLObject {
        public static final int constructor = 1724755908;
        public int flags;
        public TL_inputBusinessGreetingMessage message;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1724755908);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.message.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_inputBusinessBotRecipients extends TLObject {
        public static final int constructor = -991587810;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<TLRPC.InputUser> users = new ArrayList<>();
        public ArrayList<TLRPC.InputUser> exclude_users = new ArrayList<>();

        public static TL_inputBusinessBotRecipients TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != -991587810) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_inputBusinessBotRecipients", Integer.valueOf(i)));
                }
                return null;
            }
            TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_inputBusinessBotRecipients();
            tL_inputBusinessBotRecipients.readParams(inputSerializedData, z);
            return tL_inputBusinessBotRecipients;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.existing_chats = (readInt32 & 1) != 0;
            this.new_chats = (readInt32 & 2) != 0;
            this.contacts = (readInt32 & 4) != 0;
            this.non_contacts = (readInt32 & 8) != 0;
            this.exclude_selected = (readInt32 & 32) != 0;
            if ((readInt32 & 16) != 0) {
                this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0(), z);
            }
            if ((this.flags & 64) != 0) {
                this.exclude_users = Vector.deserialize(inputSerializedData, new TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0(), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-991587810);
            int i = this.existing_chats ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.new_chats ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.contacts ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.non_contacts ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int i5 = this.exclude_selected ? i4 | 32 : i4 & (-33);
            this.flags = i5;
            outputSerializedData.writeInt32(i5);
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.users);
            }
            if ((this.flags & 64) != 0) {
                Vector.serialize(outputSerializedData, this.exclude_users);
            }
        }
    }

    public static class TL_businessBotRecipients extends TLObject {
        public static final int constructor = -1198722189;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<Long> users = new ArrayList<>();
        public ArrayList<Long> exclude_users = new ArrayList<>();

        public static TL_businessBotRecipients TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != -1198722189) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessBotRecipients", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessBotRecipients tL_businessBotRecipients = new TL_businessBotRecipients();
            tL_businessBotRecipients.readParams(inputSerializedData, z);
            return tL_businessBotRecipients;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.existing_chats = (readInt32 & 1) != 0;
            this.new_chats = (readInt32 & 2) != 0;
            this.contacts = (readInt32 & 4) != 0;
            this.non_contacts = (readInt32 & 8) != 0;
            this.exclude_selected = (readInt32 & 32) != 0;
            if ((readInt32 & 16) != 0) {
                this.users = Vector.deserializeLong(inputSerializedData, z);
            }
            if ((this.flags & 64) != 0) {
                this.exclude_users = Vector.deserializeLong(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1198722189);
            int i = this.existing_chats ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.new_chats ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.contacts ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.non_contacts ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int i5 = this.exclude_selected ? i4 | 32 : i4 & (-33);
            this.flags = i5;
            outputSerializedData.writeInt32(i5);
            if ((this.flags & 16) != 0) {
                Vector.serializeLong(outputSerializedData, this.users);
            }
            if ((this.flags & 64) != 0) {
                Vector.serializeLong(outputSerializedData, this.exclude_users);
            }
        }
    }

    public static class TL_inputBusinessRecipients extends TLObject {
        public static final int constructor = 1871393450;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<TLRPC.InputUser> users = new ArrayList<>();

        public static TL_inputBusinessRecipients TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 1871393450) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_inputBusinessRecipients", Integer.valueOf(i)));
                }
                return null;
            }
            TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_inputBusinessRecipients();
            tL_inputBusinessRecipients.readParams(inputSerializedData, z);
            return tL_inputBusinessRecipients;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.existing_chats = (readInt32 & 1) != 0;
            this.new_chats = (readInt32 & 2) != 0;
            this.contacts = (readInt32 & 4) != 0;
            this.non_contacts = (readInt32 & 8) != 0;
            this.exclude_selected = (readInt32 & 32) != 0;
            if ((readInt32 & 16) != 0) {
                this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0(), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1871393450);
            int i = this.existing_chats ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.new_chats ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.contacts ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.non_contacts ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int i5 = this.exclude_selected ? i4 | 32 : i4 & (-33);
            this.flags = i5;
            outputSerializedData.writeInt32(i5);
            if ((this.flags & 16) != 0) {
                Vector.serialize(outputSerializedData, this.users);
            }
        }
    }

    public static class TL_businessRecipients extends TLObject {
        public static final int constructor = 554733559;
        public boolean contacts;
        public boolean exclude_selected;
        public boolean existing_chats;
        public int flags;
        public boolean new_chats;
        public boolean non_contacts;
        public ArrayList<Long> users = new ArrayList<>();

        public static TL_businessRecipients TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 554733559) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessRecipients", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessRecipients tL_businessRecipients = new TL_businessRecipients();
            tL_businessRecipients.readParams(inputSerializedData, z);
            return tL_businessRecipients;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.existing_chats = (readInt32 & 1) != 0;
            this.new_chats = (readInt32 & 2) != 0;
            this.contacts = (readInt32 & 4) != 0;
            this.non_contacts = (readInt32 & 8) != 0;
            this.exclude_selected = (readInt32 & 32) != 0;
            if ((readInt32 & 16) != 0) {
                this.users = Vector.deserializeLong(inputSerializedData, z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(554733559);
            int i = this.existing_chats ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.new_chats ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.contacts ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.non_contacts ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int i5 = this.exclude_selected ? i4 | 32 : i4 & (-33);
            this.flags = i5;
            outputSerializedData.writeInt32(i5);
            if ((this.flags & 16) != 0) {
                Vector.serializeLong(outputSerializedData, this.users);
            }
        }
    }

    public static class TL_businessBotRights extends TLObject {
        public static final int constructor = -1604170505;
        public boolean change_gift_settings;
        public boolean delete_received_messages;
        public boolean delete_sent_messages;
        public boolean edit_bio;
        public boolean edit_name;
        public boolean edit_profile_photo;
        public boolean edit_username;
        public int flags;
        public boolean manage_stories;
        public boolean read_messages;
        public boolean reply;
        public boolean sell_gifts;
        public boolean transfer_and_upgrade_gifts;
        public boolean transfer_stars;
        public boolean view_gifts;

        public static TL_businessBotRights TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != -1604170505) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessBotRights", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessBotRights tL_businessBotRights = new TL_businessBotRights();
            tL_businessBotRights.readParams(inputSerializedData, z);
            return tL_businessBotRights;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.reply = (readInt32 & 1) != 0;
            this.read_messages = (readInt32 & 2) != 0;
            this.delete_sent_messages = (readInt32 & 4) != 0;
            this.delete_received_messages = (readInt32 & 8) != 0;
            this.edit_name = (readInt32 & 16) != 0;
            this.edit_bio = (readInt32 & 32) != 0;
            this.edit_profile_photo = (readInt32 & 64) != 0;
            this.edit_username = (readInt32 & 128) != 0;
            this.view_gifts = (readInt32 & 256) != 0;
            this.sell_gifts = (readInt32 & 512) != 0;
            this.change_gift_settings = (readInt32 & 1024) != 0;
            this.transfer_and_upgrade_gifts = (readInt32 & 2048) != 0;
            this.transfer_stars = (readInt32 & 4096) != 0;
            this.manage_stories = (readInt32 & 8192) != 0;
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1604170505);
            int i = this.reply ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.read_messages ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.delete_sent_messages ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            int i4 = this.delete_received_messages ? i3 | 8 : i3 & (-9);
            this.flags = i4;
            int i5 = this.edit_name ? i4 | 16 : i4 & (-17);
            this.flags = i5;
            int i6 = this.edit_bio ? i5 | 32 : i5 & (-33);
            this.flags = i6;
            int i7 = this.edit_profile_photo ? i6 | 64 : i6 & (-65);
            this.flags = i7;
            int i8 = this.edit_username ? i7 | 128 : i7 & (-129);
            this.flags = i8;
            int i9 = this.view_gifts ? i8 | 256 : i8 & (-257);
            this.flags = i9;
            int i10 = this.sell_gifts ? i9 | 512 : i9 & (-513);
            this.flags = i10;
            int i11 = this.change_gift_settings ? i10 | 1024 : i10 & (-1025);
            this.flags = i11;
            int i12 = this.transfer_and_upgrade_gifts ? i11 | 2048 : i11 & (-2049);
            this.flags = i12;
            int i13 = this.transfer_stars ? i12 | 4096 : i12 & (-4097);
            this.flags = i13;
            int i14 = this.manage_stories ? i13 | 8192 : i13 & (-8193);
            this.flags = i14;
            outputSerializedData.writeInt32(i14);
        }

        public static TL_businessBotRights all() {
            TL_businessBotRights tL_businessBotRights = new TL_businessBotRights();
            tL_businessBotRights.reply = true;
            tL_businessBotRights.read_messages = true;
            tL_businessBotRights.delete_sent_messages = true;
            tL_businessBotRights.delete_received_messages = true;
            tL_businessBotRights.edit_name = true;
            tL_businessBotRights.edit_bio = true;
            tL_businessBotRights.edit_profile_photo = true;
            tL_businessBotRights.edit_username = true;
            tL_businessBotRights.view_gifts = true;
            tL_businessBotRights.sell_gifts = true;
            tL_businessBotRights.change_gift_settings = true;
            tL_businessBotRights.transfer_and_upgrade_gifts = true;
            tL_businessBotRights.transfer_stars = true;
            tL_businessBotRights.manage_stories = true;
            return tL_businessBotRights;
        }

        public static TL_businessBotRights makeDefault() {
            TL_businessBotRights tL_businessBotRights = new TL_businessBotRights();
            tL_businessBotRights.reply = true;
            tL_businessBotRights.read_messages = true;
            tL_businessBotRights.delete_sent_messages = true;
            tL_businessBotRights.delete_received_messages = true;
            tL_businessBotRights.edit_name = false;
            tL_businessBotRights.edit_bio = false;
            tL_businessBotRights.edit_profile_photo = false;
            tL_businessBotRights.edit_username = false;
            tL_businessBotRights.view_gifts = false;
            tL_businessBotRights.sell_gifts = false;
            tL_businessBotRights.change_gift_settings = false;
            tL_businessBotRights.transfer_and_upgrade_gifts = false;
            tL_businessBotRights.transfer_stars = false;
            tL_businessBotRights.manage_stories = false;
            return tL_businessBotRights;
        }

        public static TL_businessBotRights clone(TL_businessBotRights tL_businessBotRights) {
            TL_businessBotRights tL_businessBotRights2 = new TL_businessBotRights();
            tL_businessBotRights2.reply = tL_businessBotRights.reply;
            tL_businessBotRights2.read_messages = tL_businessBotRights.read_messages;
            tL_businessBotRights2.delete_sent_messages = tL_businessBotRights.delete_sent_messages;
            tL_businessBotRights2.delete_received_messages = tL_businessBotRights.delete_received_messages;
            tL_businessBotRights2.edit_name = tL_businessBotRights.edit_name;
            tL_businessBotRights2.edit_bio = tL_businessBotRights.edit_bio;
            tL_businessBotRights2.edit_profile_photo = tL_businessBotRights.edit_profile_photo;
            tL_businessBotRights2.edit_username = tL_businessBotRights.edit_username;
            tL_businessBotRights2.view_gifts = tL_businessBotRights.view_gifts;
            tL_businessBotRights2.sell_gifts = tL_businessBotRights.sell_gifts;
            tL_businessBotRights2.change_gift_settings = tL_businessBotRights.change_gift_settings;
            tL_businessBotRights2.transfer_and_upgrade_gifts = tL_businessBotRights.transfer_and_upgrade_gifts;
            tL_businessBotRights2.transfer_stars = tL_businessBotRights.transfer_stars;
            tL_businessBotRights2.manage_stories = tL_businessBotRights.manage_stories;
            return tL_businessBotRights2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TL_businessBotRights)) {
                return false;
            }
            TL_businessBotRights tL_businessBotRights = (TL_businessBotRights) obj;
            return this.reply == tL_businessBotRights.reply && this.read_messages == tL_businessBotRights.read_messages && this.delete_sent_messages == tL_businessBotRights.delete_sent_messages && this.delete_received_messages == tL_businessBotRights.delete_received_messages && this.edit_name == tL_businessBotRights.edit_name && this.edit_bio == tL_businessBotRights.edit_bio && this.edit_profile_photo == tL_businessBotRights.edit_profile_photo && this.edit_username == tL_businessBotRights.edit_username && this.view_gifts == tL_businessBotRights.view_gifts && this.sell_gifts == tL_businessBotRights.sell_gifts && this.change_gift_settings == tL_businessBotRights.change_gift_settings && this.transfer_and_upgrade_gifts == tL_businessBotRights.transfer_and_upgrade_gifts && this.transfer_stars == tL_businessBotRights.transfer_stars && this.manage_stories == tL_businessBotRights.manage_stories;
        }
    }

    public static class TL_connectedBot extends TLObject {
        public static final int constructor = -849058964;
        public long bot_id;
        public int flags;
        public TL_businessBotRecipients recipients;
        public TL_businessBotRights rights;

        public static TL_connectedBot TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != -849058964) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_connectedBot", Integer.valueOf(i)));
                }
                return null;
            }
            TL_connectedBot tL_connectedBot = new TL_connectedBot();
            tL_connectedBot.readParams(inputSerializedData, z);
            return tL_connectedBot;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.bot_id = inputSerializedData.readInt64(z);
            this.recipients = TL_businessBotRecipients.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.rights = TL_businessBotRights.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-849058964);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.bot_id);
            this.recipients.serializeToStream(outputSerializedData);
            this.rights.serializeToStream(outputSerializedData);
        }
    }

    public static class connectedBots extends TLObject {
        public static final int constructor = 400029819;
        public ArrayList<TL_connectedBot> connected_bots = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static connectedBots TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 400029819) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_connectedBots", Integer.valueOf(i)));
                }
                return null;
            }
            connectedBots connectedbots = new connectedBots();
            connectedbots.readParams(inputSerializedData, z);
            return connectedbots;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.connected_bots = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_account.TL_connectedBot.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(400029819);
            Vector.serialize(outputSerializedData, this.connected_bots);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class updateConnectedBot extends TLObject {
        public static final int constructor = 1721797758;
        public TLRPC.InputUser bot;
        public boolean deleted;
        public int flags;
        public TL_inputBusinessBotRecipients recipients;
        public TL_businessBotRights rights;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1721797758);
            int i = this.deleted ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            int i2 = this.rights != null ? i | 1 : i & (-2);
            this.flags = i2;
            outputSerializedData.writeInt32(i2);
            if ((this.flags & 1) != 0) {
                this.rights.serializeToStream(outputSerializedData);
            }
            this.bot.serializeToStream(outputSerializedData);
            this.recipients.serializeToStream(outputSerializedData);
        }
    }

    public static class getConnectedBots extends TLObject {
        public static final int constructor = 1319421967;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return connectedBots.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1319421967);
        }
    }

    public static class toggleConnectedBotPaused extends TLObject {
        public static final int constructor = 1684934807;
        public boolean paused;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1684934807);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.paused);
        }
    }

    public static class disablePeerConnectedBot extends TLObject {
        public static final int constructor = 1581481689;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1581481689);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_birthday extends TLObject {
        public static final int constructor = 1821253126;
        public int day;
        public int flags;
        public int month;
        public int year;

        public static TL_birthday TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 1821253126) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_birthday", Integer.valueOf(i)));
                }
                return null;
            }
            TL_birthday tL_birthday = new TL_birthday();
            tL_birthday.readParams(inputSerializedData, z);
            return tL_birthday;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.day = inputSerializedData.readInt32(z);
            this.month = inputSerializedData.readInt32(z);
            if ((this.flags & 1) != 0) {
                this.year = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1821253126);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.day);
            outputSerializedData.writeInt32(this.month);
            if ((this.flags & 1) != 0) {
                outputSerializedData.writeInt32(this.year);
            }
        }
    }

    public static class TL_contactBirthday extends TLObject {
        public static final int constructor = 496600883;
        public TL_birthday birthday;
        public long contact_id;

        public static TL_contactBirthday TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 496600883) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_contactBirthday", Integer.valueOf(i)));
                }
                return null;
            }
            TL_contactBirthday tL_contactBirthday = new TL_contactBirthday();
            tL_contactBirthday.readParams(inputSerializedData, z);
            return tL_contactBirthday;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.contact_id = inputSerializedData.readInt64(z);
            this.birthday = TL_birthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(496600883);
            outputSerializedData.writeInt64(this.contact_id);
            this.birthday.serializeToStream(outputSerializedData);
        }
    }

    public static class contactBirthdays extends TLObject {
        public static final int constructor = 290452237;
        public ArrayList<TL_contactBirthday> contacts = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static contactBirthdays TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 290452237) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_contacts_contactBirthdays", Integer.valueOf(i)));
                }
                return null;
            }
            contactBirthdays contactbirthdays = new contactBirthdays();
            contactbirthdays.readParams(inputSerializedData, z);
            return contactbirthdays;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.contacts = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(290452237);
            Vector.serialize(outputSerializedData, this.contacts);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class updateBirthday extends TLObject {
        public static final int constructor = -865203183;
        public TL_birthday birthday;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-865203183);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.birthday.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class getBirthdays extends TLObject {
        public static final int constructor = -621959068;
        public TL_birthday birthday;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return contactBirthdays.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-621959068);
        }
    }

    public static class TL_inputBusinessChatLink extends TLObject {
        public static final int constructor = 292003751;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public int flags;
        public String message;
        public String title;

        public static TL_inputBusinessChatLink TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (292003751 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_inputBusinessChatLink", Integer.valueOf(i)));
                }
                return null;
            }
            TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_inputBusinessChatLink();
            tL_inputBusinessChatLink.readParams(inputSerializedData, z);
            return tL_inputBusinessChatLink;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda40(), z);
            }
            if ((this.flags & 2) != 0) {
                this.title = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(292003751);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.message);
            if ((this.flags & 1) != 0) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.title);
            }
        }
    }

    public static class TL_businessChatLink extends TLObject {
        public static final int constructor = -1263638929;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public int flags;
        public String link;
        public String message;
        public String title;
        public int views;

        public static TL_businessChatLink TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-1263638929 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessChatLink", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessChatLink tL_businessChatLink = new TL_businessChatLink();
            tL_businessChatLink.readParams(inputSerializedData, z);
            return tL_businessChatLink;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.link = inputSerializedData.readString(z);
            this.message = inputSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda40(), z);
            }
            if ((this.flags & 2) != 0) {
                this.title = inputSerializedData.readString(z);
            }
            this.views = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1263638929);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.link);
            outputSerializedData.writeString(this.message);
            if ((this.flags & 1) != 0) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if ((this.flags & 2) != 0) {
                outputSerializedData.writeString(this.title);
            }
            outputSerializedData.writeInt32(this.views);
        }
    }

    public static class businessChatLinks extends TLObject {
        public static final int constructor = -331111727;
        public ArrayList<TL_businessChatLink> links = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static businessChatLinks TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-331111727 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_businessChatLinks", Integer.valueOf(i)));
                }
                return null;
            }
            businessChatLinks businesschatlinks = new businessChatLinks();
            businesschatlinks.readParams(inputSerializedData, z);
            return businesschatlinks;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.links = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_account.TL_businessChatLink.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-331111727);
            Vector.serialize(outputSerializedData, this.links);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class resolvedBusinessChatLinks extends TLObject {
        public static final int constructor = -1708937439;
        public int flags;
        public String message;
        public TLRPC.Peer peer;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static resolvedBusinessChatLinks TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (-1708937439 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_account_businessChatLinks", Integer.valueOf(i)));
                }
                return null;
            }
            resolvedBusinessChatLinks resolvedbusinesschatlinks = new resolvedBusinessChatLinks();
            resolvedbusinesschatlinks.readParams(inputSerializedData, z);
            return resolvedbusinesschatlinks;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.message = inputSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda40(), z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1708937439);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.message);
            if ((this.flags & 1) != 0) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class createBusinessChatLink extends TLObject {
        public static final int constructor = -2007898482;
        public TL_inputBusinessChatLink link;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_businessChatLink.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2007898482);
            this.link.serializeToStream(outputSerializedData);
        }
    }

    public static class editBusinessChatLink extends TLObject {
        public static final int constructor = -1942744913;
        public TL_inputBusinessChatLink link;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_businessChatLink.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1942744913);
            outputSerializedData.writeString(this.slug);
            this.link.serializeToStream(outputSerializedData);
        }
    }

    public static class deleteBusinessChatLink extends TLObject {
        public static final int constructor = 1611085428;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1611085428);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class getBusinessChatLinks extends TLObject {
        public static final int constructor = 1869667809;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return businessChatLinks.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1869667809);
        }
    }

    public static class resolveBusinessChatLink extends TLObject {
        public static final int constructor = 1418913262;
        public String slug;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return resolvedBusinessChatLinks.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1418913262);
            outputSerializedData.writeString(this.slug);
        }
    }

    public static class toggleSponsoredMessages extends TLObject {
        public static final int constructor = -1176919155;
        public boolean enabled;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1176919155);
            outputSerializedData.writeBool(this.enabled);
        }
    }

    public static class TL_businessIntro extends TLObject {
        public static final int constructor = 1510606445;
        public String description;
        public int flags;
        public TLRPC.Document sticker;
        public String title;

        public static TL_businessIntro TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 1510606445) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_businessIntro", Integer.valueOf(i)));
                }
                return null;
            }
            TL_businessIntro tL_businessIntro = new TL_businessIntro();
            tL_businessIntro.readParams(inputSerializedData, z);
            return tL_businessIntro;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.title = inputSerializedData.readString(z);
            this.description = inputSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.sticker = TLRPC.Document.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1510606445);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.description);
            if ((this.flags & 1) != 0) {
                this.sticker.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_inputBusinessIntro extends TLObject {
        public static final int constructor = 163867085;
        public String description;
        public int flags;
        public TLRPC.InputDocument sticker;
        public String title;

        public static TL_inputBusinessIntro TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 163867085) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_inputBusinessIntro", Integer.valueOf(i)));
                }
                return null;
            }
            TL_inputBusinessIntro tL_inputBusinessIntro = new TL_inputBusinessIntro();
            tL_inputBusinessIntro.readParams(inputSerializedData, z);
            return tL_inputBusinessIntro;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.title = inputSerializedData.readString(z);
            this.description = inputSerializedData.readString(z);
            if ((this.flags & 1) != 0) {
                this.sticker = TLRPC.InputDocument.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(163867085);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.title);
            outputSerializedData.writeString(this.description);
            if ((this.flags & 1) != 0) {
                this.sticker.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class updateBusinessIntro extends TLObject {
        public static final int constructor = -1508585420;
        public int flags;
        public TL_inputBusinessIntro intro;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1508585420);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.intro.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class updatePersonalChannel extends TLObject {
        public static final int constructor = -649919008;
        public TLRPC.InputChannel channel;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-649919008);
            this.channel.serializeToStream(outputSerializedData);
        }
    }

    public static class ReactionNotificationsFrom extends TLObject {
        public static ReactionNotificationsFrom TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            ReactionNotificationsFrom tL_reactionNotificationsFromContacts;
            if (i == -1161583078) {
                tL_reactionNotificationsFromContacts = new TL_reactionNotificationsFromContacts();
            } else {
                tL_reactionNotificationsFromContacts = i != 1268654752 ? null : new TL_reactionNotificationsFromAll();
            }
            if (tL_reactionNotificationsFromContacts == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in ReactionNotificationsFrom", Integer.valueOf(i)));
            }
            if (tL_reactionNotificationsFromContacts != null) {
                tL_reactionNotificationsFromContacts.readParams(inputSerializedData, z);
            }
            return tL_reactionNotificationsFromContacts;
        }
    }

    public static class TL_reactionNotificationsFromContacts extends ReactionNotificationsFrom {
        public static final int constructor = -1161583078;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1161583078);
        }
    }

    public static class TL_reactionNotificationsFromAll extends ReactionNotificationsFrom {
        public static final int constructor = 1268654752;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1268654752);
        }
    }

    public static class TL_reactionsNotifySettings extends TLObject {
        public static final int constructor = 1457736048;
        public int flags;
        public ReactionNotificationsFrom messages_notify_from;
        public boolean show_previews;
        public TLRPC.NotificationSound sound;
        public ReactionNotificationsFrom stories_notify_from;

        public static TL_reactionsNotifySettings TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (1457736048 != i) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_reactionsNotifySettings", Integer.valueOf(i)));
                }
                return null;
            }
            TL_reactionsNotifySettings tL_reactionsNotifySettings = new TL_reactionsNotifySettings();
            tL_reactionsNotifySettings.readParams(inputSerializedData, z);
            return tL_reactionsNotifySettings;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            if ((readInt32 & 1) != 0) {
                this.messages_notify_from = ReactionNotificationsFrom.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 2) != 0) {
                this.stories_notify_from = ReactionNotificationsFrom.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.sound = TLRPC.NotificationSound.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.show_previews = inputSerializedData.readBool(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1457736048);
            outputSerializedData.writeInt32(this.flags);
            if ((this.flags & 1) != 0) {
                this.messages_notify_from.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 2) != 0) {
                this.stories_notify_from.serializeToStream(outputSerializedData);
            }
            this.sound.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.show_previews);
        }
    }

    public static class getReactionsNotifySettings extends TLObject {
        public static final int constructor = 115172684;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_reactionsNotifySettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(115172684);
        }
    }

    public static class setReactionsNotifySettings extends TLObject {
        public static final int constructor = 829220168;
        public TL_reactionsNotifySettings settings;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_reactionsNotifySettings.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(829220168);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class paidMessagesRevenue extends TLObject {
        public static final int constructor = 504403720;
        public long stars_amount;

        public static paidMessagesRevenue TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            if (i != 504403720) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in paidMessagesRevenue", Integer.valueOf(i)));
                }
                return null;
            }
            paidMessagesRevenue paidmessagesrevenue = new paidMessagesRevenue();
            paidmessagesrevenue.readParams(inputSerializedData, z);
            return paidmessagesrevenue;
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.stars_amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(504403720);
            outputSerializedData.writeInt64(this.stars_amount);
        }
    }

    public static class toggleNoPaidMessagesException extends TLObject {
        public static final int constructor = -30483850;
        public int flags;
        public TLRPC.InputPeer parent_peer;
        public boolean refund_charged;
        public boolean require_payment;
        public TLRPC.InputUser user_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-30483850);
            int i = this.refund_charged ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            int i2 = this.parent_peer != null ? i | 2 : i & (-3);
            this.flags = i2;
            int i3 = this.require_payment ? i2 | 4 : i2 & (-5);
            this.flags = i3;
            outputSerializedData.writeInt32(i3);
            if ((this.flags & 2) != 0) {
                this.parent_peer.serializeToStream(outputSerializedData);
            }
            this.user_id.serializeToStream(outputSerializedData);
        }
    }

    public static class getPaidMessagesRevenue extends TLObject {
        public static final int constructor = 431639143;
        public int flags;
        public TLRPC.InputPeer parent_peer;
        public TLRPC.InputUser user_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return paidMessagesRevenue.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(431639143);
            int i = this.parent_peer != null ? this.flags | 1 : this.flags & (-2);
            this.flags = i;
            outputSerializedData.writeInt32(i);
            if ((this.flags & 1) != 0) {
                this.parent_peer.serializeToStream(outputSerializedData);
            }
            this.user_id.serializeToStream(outputSerializedData);
        }
    }

    public static class RequirementToContact extends TLObject {
        public static RequirementToContact TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            RequirementToContact requirementtocontactpaidmessages;
            if (i == -1258914157) {
                requirementtocontactpaidmessages = new requirementToContactPaidMessages();
            } else if (i != -444472087) {
                requirementtocontactpaidmessages = i != 84580409 ? null : new requirementToContactEmpty();
            } else {
                requirementtocontactpaidmessages = new requirementToContactPremium();
            }
            if (requirementtocontactpaidmessages == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in RequirementToContact", Integer.valueOf(i)));
            }
            if (requirementtocontactpaidmessages != null) {
                requirementtocontactpaidmessages.readParams(inputSerializedData, z);
            }
            return requirementtocontactpaidmessages;
        }
    }

    public static class requirementToContactEmpty extends RequirementToContact {
        public static final int constructor = 84580409;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(84580409);
        }
    }

    public static class requirementToContactPremium extends RequirementToContact {
        public static final int constructor = -444472087;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-444472087);
        }
    }

    public static class requirementToContactPaidMessages extends RequirementToContact {
        public static final int constructor = -1258914157;
        public long stars_amount;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.stars_amount = inputSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1258914157);
            outputSerializedData.writeInt64(this.stars_amount);
        }
    }

    public static class getRequirementsToContact extends TLObject {
        public static final int constructor = -660962397;
        public ArrayList<TLRPC.InputUser> id = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return Vector.TLDeserialize(inputSerializedData, i, z, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i2, boolean z2) {
                    return TL_account.RequirementToContact.TLdeserialize(inputSerializedData2, i2, z2);
                }
            });
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = Vector.deserialize(inputSerializedData, new TLRPC$TL_inputPrivacyValueAllowUsers$$ExternalSyntheticLambda0(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-660962397);
            Vector.serialize(outputSerializedData, this.id);
        }
    }

    public static class SavedMusicIds extends TLObject {
        public ArrayList<Long> ids = new ArrayList<>();

        public static SavedMusicIds TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            SavedMusicIds tL_savedMusicIds;
            if (i != -1718786506) {
                tL_savedMusicIds = i != 1338514798 ? null : new TL_savedMusicIdsNotModified();
            } else {
                tL_savedMusicIds = new TL_savedMusicIds();
            }
            if (tL_savedMusicIds == null && z) {
                throw new RuntimeException(String.format("can't parse magic %x in SavedMusicIds", Integer.valueOf(i)));
            }
            if (tL_savedMusicIds != null) {
                tL_savedMusicIds.readParams(inputSerializedData, z);
            }
            return tL_savedMusicIds;
        }
    }

    public static class TL_savedMusicIds extends SavedMusicIds {
        public static final int constructor = -1718786506;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.ids = Vector.deserializeLong(inputSerializedData, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1718786506);
            Vector.serializeLong(outputSerializedData, this.ids);
        }
    }

    public static class TL_savedMusicIdsNotModified extends SavedMusicIds {
        public static final int constructor = 1338514798;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1338514798);
        }
    }

    public static class getSavedMusicIds extends TLObject {
        public static final int constructor = -526557265;
        public long hash;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return SavedMusicIds.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-526557265);
            outputSerializedData.writeInt64(this.hash);
        }
    }

    public static class getSavedMusicByID extends TLObject {
        public static final int constructor = 1970513129;
        public ArrayList<TLRPC.InputDocument> documents = new ArrayList<>();
        public TLRPC.InputUser id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.SavedMusic.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1970513129);
            this.id.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.documents);
        }
    }

    public static class Tl_getUniqueGiftChatThemes extends TLMethod<ChatThemes> {
        public static final int constructor = -25890913;
        public long hash;
        public int limit;
        public int offset;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-25890913);
            outputSerializedData.writeInt32(this.offset);
            outputSerializedData.writeInt32(this.limit);
            outputSerializedData.writeInt64(this.hash);
        }

        @Override
        public ChatThemes deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return ChatThemes.TLdeserialize(inputSerializedData, i, z);
        }
    }

    public static abstract class ChatThemes extends TLObject {
        public static ChatThemes TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (ChatThemes) TLObject.TLdeserialize(ChatThemes.class, fromConstructor(i), inputSerializedData, i, z);
        }

        private static ChatThemes fromConstructor(int i) {
            if (i == -535699004) {
                return new TL_chatThemesNotModified();
            }
            if (i != 373835863) {
                return null;
            }
            return new Tl_chatThemes();
        }
    }

    public static class TL_chatThemesNotModified extends ChatThemes {
        public static final int constructor = -535699004;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-535699004);
        }
    }

    public static class Tl_chatThemes extends ChatThemes {
        public static final int constructor = 373835863;
        public ArrayList<TLRPC.Chat> chats;
        public int flags;
        public long hash;
        public int next_offset;
        public ArrayList<TLRPC.ChatTheme> themes;
        public ArrayList<TLRPC.User> users;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(373835863);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.hash);
            Vector.serialize(outputSerializedData, this.themes);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.next_offset);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.hash = inputSerializedData.readInt64(z);
            this.themes = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TLRPC.ChatTheme.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            this.chats = Vector.deserialize(inputSerializedData, new TLRPC$TL_channels_adminLogResults$$ExternalSyntheticLambda1(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readInt32(z);
            }
        }
    }
}
