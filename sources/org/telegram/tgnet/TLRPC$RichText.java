package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$RichText extends TLObject {
    public String email;
    public TLRPC$RichText parentRichText;
    public ArrayList<TLRPC$RichText> texts = new ArrayList<>();
    public String url;
    public long webpage_id;

    public static TLRPC$RichText TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$RichText tLRPC$TL_textStrike;
        switch (i) {
            case -1678197867:
                tLRPC$TL_textStrike = new TLRPC$TL_textStrike();
                break;
            case -1054465340:
                tLRPC$TL_textStrike = new TLRPC$TL_textUnderline();
                break;
            case -939827711:
                tLRPC$TL_textStrike = new TLRPC$TL_textSuperscript();
                break;
            case -653089380:
                tLRPC$TL_textStrike = new TLRPC$TL_textItalic();
                break;
            case -599948721:
                tLRPC$TL_textStrike = new TLRPC$TL_textEmpty();
                break;
            case -564523562:
                tLRPC$TL_textStrike = new TLRPC$TL_textEmail();
                break;
            case -311786236:
                tLRPC$TL_textStrike = new TLRPC$TL_textSubscript();
                break;
            case 55281185:
                tLRPC$TL_textStrike = new TLRPC$TL_textMarked();
                break;
            case 136105807:
                tLRPC$TL_textStrike = new TLRPC$TL_textImage();
                break;
            case 483104362:
                tLRPC$TL_textStrike = new TLRPC$TL_textPhone();
                break;
            case 894777186:
                tLRPC$TL_textStrike = new TLRPC$TL_textAnchor();
                break;
            case 1009288385:
                tLRPC$TL_textStrike = new TLRPC$TL_textUrl();
                break;
            case 1730456516:
                tLRPC$TL_textStrike = new TLRPC$TL_textBold();
                break;
            case 1816074681:
                tLRPC$TL_textStrike = new TLRPC$TL_textFixed();
                break;
            case 1950782688:
                tLRPC$TL_textStrike = new TLRPC$TL_textPlain();
                break;
            case 2120376535:
                tLRPC$TL_textStrike = new TLRPC$TL_textConcat();
                break;
            default:
                tLRPC$TL_textStrike = null;
                break;
        }
        if (tLRPC$TL_textStrike == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in RichText", Integer.valueOf(i)));
        }
        if (tLRPC$TL_textStrike != null) {
            tLRPC$TL_textStrike.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_textStrike;
    }
}
