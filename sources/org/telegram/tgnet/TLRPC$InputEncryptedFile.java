package org.telegram.tgnet;

public abstract class TLRPC$InputEncryptedFile extends TLObject {
    public long access_hash;
    public long id;
    public int key_fingerprint;
    public String md5_checksum;
    public int parts;
}
