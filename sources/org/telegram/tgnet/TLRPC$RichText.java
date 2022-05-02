package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$RichText extends TLObject {
    public String email;
    public TLRPC$RichText parentRichText;
    public ArrayList<TLRPC$RichText> texts = new ArrayList<>();
    public String url;
    public long webpage_id;

    public static TLRPC$RichText TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$RichText tLRPC$RichText;
        switch (i) {
            case -1678197867:
                tLRPC$RichText = new TLRPC$TL_textStrike();
                break;
            case -1054465340:
                tLRPC$RichText = new TLRPC$TL_textUnderline();
                break;
            case -939827711:
                tLRPC$RichText = new TLRPC$TL_textSuperscript();
                break;
            case -653089380:
                tLRPC$RichText = new TLRPC$TL_textItalic();
                break;
            case -599948721:
                tLRPC$RichText = new TLRPC$TL_textEmpty();
                break;
            case -564523562:
                tLRPC$RichText = new TLRPC$TL_textEmail();
                break;
            case -311786236:
                tLRPC$RichText = new TLRPC$TL_textSubscript();
                break;
            case 55281185:
                tLRPC$RichText = new TLRPC$TL_textMarked();
                break;
            case 136105807:
                tLRPC$RichText = new TLRPC$TL_textImage();
                break;
            case 483104362:
                tLRPC$RichText = new TLRPC$TL_textPhone();
                break;
            case 894777186:
                tLRPC$RichText = new TLRPC$TL_textAnchor();
                break;
            case 1009288385:
                tLRPC$RichText = new TLRPC$TL_textUrl();
                break;
            case 1730456516:
                tLRPC$RichText = new TLRPC$TL_textBold();
                break;
            case 1816074681:
                tLRPC$RichText = new TLRPC$TL_textFixed();
                break;
            case 1950782688:
                tLRPC$RichText = new TLRPC$TL_textPlain();
                break;
            case 2120376535:
                tLRPC$RichText = new TLRPC$TL_textConcat();
                break;
            default:
                tLRPC$RichText = null;
                break;
        }
        if (tLRPC$RichText != null || !z) {
            if (tLRPC$RichText != null) {
                tLRPC$RichText.readParams(abstractSerializedData, z);
            }
            return tLRPC$RichText;
        }
        throw new RuntimeException(String.format("can't parse magic %x in RichText", Integer.valueOf(i)));
    }
}
