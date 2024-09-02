package org.telegram.tgnet;

public abstract class TLRPC$auth_SentCodeType extends TLObject {
    public boolean apple_signin_allowed;
    public String beginning;
    public String email_pattern;
    public int flags;
    public boolean google_signin_allowed;
    public int length;
    public int next_phone_login_date;
    public byte[] nonce;
    public String pattern;
    public byte[] play_integrity_nonce;
    public long play_integrity_project_id;
    public String prefix;
    public int push_timeout;
    public String receipt;
    public int reset_available_period;
    public int reset_pending_date;
    public String url;
    public boolean verifiedFirebase;

    public static TLRPC$auth_SentCodeType TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$auth_SentCodeType tLRPC$auth_SentCodeType;
        switch (i) {
            case -2113903484:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.prefix = abstractSerializedData2.readString(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-2113903484);
                        abstractSerializedData2.writeString(this.prefix);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case -1542017919:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.beginning = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1542017919);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.beginning);
                        }
                    }
                };
                break;
            case -1521934870:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.apple_signin_allowed = (readInt32 & 1) != 0;
                        this.google_signin_allowed = (readInt32 & 2) != 0;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1521934870);
                        int i2 = this.apple_signin_allowed ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.google_signin_allowed ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                    }
                };
                break;
            case -1425815847:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.pattern = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1425815847);
                        abstractSerializedData2.writeString(this.pattern);
                    }
                };
                break;
            case -1284008785:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.beginning = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1284008785);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.beginning);
                        }
                    }
                };
                break;
            case -1073693790:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1073693790);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case -648651719:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.url = abstractSerializedData2.readString(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-648651719);
                        abstractSerializedData2.writeString(this.url);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case -196020837:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.apple_signin_allowed = (readInt32 & 1) != 0;
                        this.google_signin_allowed = (readInt32 & 2) != 0;
                        this.email_pattern = abstractSerializedData2.readString(z2);
                        this.length = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 8) != 0) {
                            this.reset_available_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.reset_pending_date = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-196020837);
                        int i2 = this.apple_signin_allowed ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.google_signin_allowed ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeString(this.email_pattern);
                        abstractSerializedData2.writeInt32(this.length);
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reset_available_period);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.reset_pending_date);
                        }
                    }
                };
                break;
            case 10475318:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.nonce = abstractSerializedData2.readByteArray(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.play_integrity_project_id = abstractSerializedData2.readInt64(z2);
                            this.play_integrity_nonce = abstractSerializedData2.readByteArray(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.receipt = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.push_timeout = abstractSerializedData2.readInt32(z2);
                        }
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(10475318);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeByteArray(this.nonce);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeByteArray(this.play_integrity_nonce);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.receipt);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.push_timeout);
                        }
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1035688326:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1035688326);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            case 1398007207:
                tLRPC$auth_SentCodeType = new TLRPC$auth_SentCodeType() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.length = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1398007207);
                        abstractSerializedData2.writeInt32(this.length);
                    }
                };
                break;
            default:
                tLRPC$auth_SentCodeType = null;
                break;
        }
        if (tLRPC$auth_SentCodeType == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in auth_SentCodeType", Integer.valueOf(i)));
        }
        if (tLRPC$auth_SentCodeType != null) {
            tLRPC$auth_SentCodeType.readParams(abstractSerializedData, z);
        }
        return tLRPC$auth_SentCodeType;
    }
}
