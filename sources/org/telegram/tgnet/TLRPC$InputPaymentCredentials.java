package org.telegram.tgnet;

public abstract class TLRPC$InputPaymentCredentials extends TLObject {
    public TLRPC$TL_dataJSON data;
    public int flags;
    public String id;
    public TLRPC$TL_dataJSON payment_token;
    public boolean save;
    public byte[] tmp_password;
}
