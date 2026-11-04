package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class mm {
    public org.telegram.messenger.zi f47700a;
    public int f47701b;
    public int f47702c;
    public byte[] f47703e;
    public boolean f47704f;
    public boolean h;
    public String f47706i;
    public ArrayList f47707j;
    public TLRPC.TodoItem f47708k;
    public TLRPC.PollAnswer f47709l;
    public boolean f47710m;
    public ArrayList f47711n;
    public int f47712o;
    public boolean f47705g = false;
    public int d = -1;

    public mm(int i3, int i10, org.telegram.messenger.zi ziVar) {
        TLRPC.Message message;
        this.f47700a = ziVar;
        this.f47701b = i3;
        this.f47702c = i10;
        boolean z10 = false;
        if (ziVar != null && (message = ziVar.f26868k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f47710m = z10;
        f();
    }

    public static mm b(int i3, int i10, org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return null;
        }
        org.telegram.messenger.zi.B0(ziVar.f26868k);
        return new mm(i3, i10, ziVar);
    }

    public static mm c(org.telegram.messenger.zi ziVar) {
        TLRPC.Message message = ziVar.f26868k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.hp.s1(ziVar.I1).f23081o4, d(ziVar)), ziVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.zi ziVar) {
        ?? r22;
        TLRPC.Message message = ziVar.f26868k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.cv cvVar = ziVar.f26915w2;
                if (cvVar != null && (r22 = cvVar.f22079q) != 0) {
                    return r22.length();
                }
                return 0;
            }
            String str = message.message;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        return 0;
    }

    public final void a(org.telegram.messenger.zi ziVar) {
        String str;
        int i3;
        int i10;
        TL_iv.RichMessage richMessage;
        org.telegram.messenger.gv gvVar;
        int[] iArr;
        if (this.f47710m) {
            TLRPC.Message message = ziVar.f26868k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f47700a = ziVar;
                String str2 = this.f47706i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e10 = org.telegram.messenger.gv.e(richMessage);
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    while (true) {
                        gvVar = null;
                        if (i11 >= e10.size()) {
                            break;
                        }
                        if (i11 > 0) {
                            sb2.append('\n');
                        }
                        org.telegram.messenger.gv.b((TL_iv.RichText) e10.get(i11), sb2, null);
                        i11++;
                    }
                    if (sb2.indexOf(str2) >= 0) {
                        if (org.telegram.messenger.gv.c(ziVar)) {
                            iArr = org.telegram.messenger.gv.f(ziVar, this.f47706i, this.f47712o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            gvVar = org.telegram.messenger.gv.k(iArr[0], iArr[1], ziVar);
                        }
                        if (gvVar != null) {
                            this.f47701b = iArr[0];
                            this.f47702c = iArr[1];
                            e(gvVar.f22780b, gvVar.f22779a);
                        } else {
                            this.f47701b = -1;
                            this.f47702c = -1;
                        }
                        this.f47704f = false;
                        return;
                    }
                }
                this.f47701b = 0;
                this.f47702c = Math.min(org.telegram.messenger.hp.s1(ziVar.I1).f23081o4, d(ziVar));
                this.f47704f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
            this.f47704f = false;
            return;
        }
        TLRPC.Message message2 = ziVar.f26868k;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f47702c;
            if (i12 >= this.f47701b && i12 <= str.length() && this.f47701b <= ziVar.f26868k.message.length() && (i3 = this.f47701b) >= 0 && (i10 = this.f47702c) >= 0) {
                if (TextUtils.equals(this.f47706i, ziVar.f26868k.message.substring(i3, i10))) {
                    this.f47700a = ziVar;
                    f();
                    this.f47704f = false;
                    return;
                }
                int indexOf = ziVar.f26868k.message.indexOf(this.f47706i);
                if (indexOf >= 0) {
                    this.f47700a = ziVar;
                    this.f47702c = (this.f47702c - this.f47701b) + indexOf;
                    this.f47701b = indexOf;
                    f();
                    this.f47704f = false;
                    return;
                }
                this.f47700a = ziVar;
                this.f47701b = 0;
                this.f47702c = ziVar.f26868k.message.length();
                f();
                this.f47704f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f47701b + ", " + this.f47702c + ", len=" + ziVar.f26868k.message.length() + ")");
            this.f47704f = false;
            return;
        }
        org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
        this.f47704f = false;
    }

    public final void e(int i3, ArrayList arrayList) {
        this.f47711n = arrayList;
        this.f47712o = i3;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f47707j = arrayList2;
            String h = org.telegram.messenger.gv.h(arrayList, arrayList2);
            this.f47706i = h;
            h.getClass();
            return;
        }
        this.f47711n = null;
        this.f47706i = null;
        this.f47707j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i3;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.f47710m) {
            int i11 = this.f47701b;
            if (i11 >= 0 && (i10 = this.f47702c) >= 0) {
                org.telegram.messenger.gv k10 = org.telegram.messenger.gv.k(i11, i10, this.f47700a);
                if (k10 == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.f47701b + ", " + this.f47702c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f22780b, k10.f22779a);
                return true;
            } else if (this.f47711n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.zi ziVar = this.f47700a;
            if (ziVar != null && (message = ziVar.f26868k) != null && (str = message.message) != null) {
                if (this.f47705g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.zi.Z(this.d, ziVar);
                    if (Z == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f47708k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.zi.X(ziVar, this.f47703e);
                    if (X == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f47709l = X;
                    return true;
                } else {
                    int i12 = this.f47702c;
                    if (i12 >= this.f47701b && i12 <= str.length() && this.f47701b <= this.f47700a.f26868k.message.length() && (i3 = this.f47701b) >= 0 && this.f47702c >= 0) {
                        String str2 = this.f47700a.f26868k.message;
                        int max = Math.max(0, i3);
                        while (max < this.f47702c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f47702c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f47706i = this.f47700a.f26868k.message.substring(max, min);
                        ArrayList arrayList = this.f47707j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f47700a.f26868k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < this.f47700a.f26868k.entities.size(); i13++) {
                                TLRPC.MessageEntity messageEntity = this.f47700a.f26868k.entities.get(i13);
                                int i14 = messageEntity.offset;
                                int i15 = messageEntity.length + i14;
                                Typeface typeface = org.telegram.messenger.g0.f22580a;
                                if (Math.max(max, min) >= Math.min(i14, i15) && Math.max(i14, i15) >= Math.min(max, min)) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityBold();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityItalic();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityUnderline();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityStrike();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntitySpoiler();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji3 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        tL_messageEntityCustomEmoji2.document_id = tL_messageEntityCustomEmoji3.document_id;
                                        tL_messageEntityCustomEmoji2.document = tL_messageEntityCustomEmoji3.document;
                                        tL_messageEntityCustomEmoji = tL_messageEntityCustomEmoji2;
                                    }
                                    int i16 = messageEntity.offset;
                                    int i17 = i16 - max;
                                    int i18 = (i16 + messageEntity.length) - max;
                                    if ((i17 >= 0 || i18 >= 0) && (i17 <= min || i18 <= min)) {
                                        tL_messageEntityCustomEmoji.offset = Math.max(0, i17);
                                        tL_messageEntityCustomEmoji.length = Math.min(i18, min - max) - tL_messageEntityCustomEmoji.offset;
                                        if (this.f47707j == null) {
                                            this.f47707j = new ArrayList();
                                        }
                                        this.f47707j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.f47701b + ", " + this.f47702c + ", len=" + this.f47700a.f26868k.message.length() + ")");
                        return false;
                    }
                }
            } else {
                org.telegram.messenger.a8.d("ReplyQuote: message is null");
                return false;
            }
        }
        return true;
    }
}
