package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class kn {
    public org.telegram.messenger.kj f38931a;
    public int f38932b;
    public int f38933c;
    public byte[] e;
    public boolean f38934f;
    public boolean h;
    public String f38936i;
    public ArrayList f38937j;
    public TLRPC.TodoItem f38938k;
    public TLRPC.PollAnswer f38939l;
    public boolean f38940m;
    public ArrayList f38941n;
    public int f38942o;
    public boolean f38935g = false;
    public int d = -1;

    public kn(int i10, int i11, org.telegram.messenger.kj kjVar) {
        TLRPC.Message message;
        this.f38931a = kjVar;
        this.f38932b = i10;
        this.f38933c = i11;
        boolean z10 = false;
        if (kjVar != null && (message = kjVar.f16690k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f38940m = z10;
        f();
    }

    public static kn b(int i10, int i11, org.telegram.messenger.kj kjVar) {
        if (kjVar == null) {
            return null;
        }
        org.telegram.messenger.kj.B0(kjVar.f16690k);
        return new kn(i10, i11, kjVar);
    }

    public static kn c(org.telegram.messenger.kj kjVar) {
        TLRPC.Message message = kjVar.f16690k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.wp.r1(kjVar.I1).f19214p4, d(kjVar)), kjVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.kj kjVar) {
        ?? r22;
        TLRPC.Message message = kjVar.f16690k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.wv wvVar = kjVar.f16738w2;
                if (wvVar != null && (r22 = wvVar.f19342q) != 0) {
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

    public final void a(org.telegram.messenger.kj kjVar) {
        String str;
        int i10;
        int i11;
        TL_iv.RichMessage richMessage;
        org.telegram.messenger.aw awVar;
        int[] iArr;
        if (this.f38940m) {
            TLRPC.Message message = kjVar.f16690k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f38931a = kjVar;
                String str2 = this.f38936i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e = org.telegram.messenger.aw.e(richMessage);
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = 0;
                    while (true) {
                        awVar = null;
                        if (i12 >= e.size()) {
                            break;
                        }
                        if (i12 > 0) {
                            sb2.append('\n');
                        }
                        org.telegram.messenger.aw.b((TL_iv.RichText) e.get(i12), sb2, null);
                        i12++;
                    }
                    if (sb2.indexOf(str2) >= 0) {
                        if (org.telegram.messenger.aw.c(kjVar)) {
                            iArr = org.telegram.messenger.aw.f(kjVar, this.f38936i, this.f38942o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            awVar = org.telegram.messenger.aw.k(iArr[0], iArr[1], kjVar);
                        }
                        if (awVar != null) {
                            this.f38932b = iArr[0];
                            this.f38933c = iArr[1];
                            e(awVar.f14863b, awVar.f14862a);
                        } else {
                            this.f38932b = -1;
                            this.f38933c = -1;
                        }
                        this.f38934f = false;
                        return;
                    }
                }
                this.f38932b = 0;
                this.f38933c = Math.min(org.telegram.messenger.wp.r1(kjVar.I1).f19214p4, d(kjVar));
                this.f38934f = true;
                return;
            }
            org.telegram.messenger.f8.d("ReplyQuote.checkEdit: rich message is null");
            this.f38934f = false;
            return;
        }
        TLRPC.Message message2 = kjVar.f16690k;
        if (message2 != null && (str = message2.message) != null) {
            int i13 = this.f38933c;
            if (i13 >= this.f38932b && i13 <= str.length() && this.f38932b <= kjVar.f16690k.message.length() && (i10 = this.f38932b) >= 0 && (i11 = this.f38933c) >= 0) {
                if (TextUtils.equals(this.f38936i, kjVar.f16690k.message.substring(i10, i11))) {
                    this.f38931a = kjVar;
                    f();
                    this.f38934f = false;
                    return;
                }
                int indexOf = kjVar.f16690k.message.indexOf(this.f38936i);
                if (indexOf >= 0) {
                    this.f38931a = kjVar;
                    this.f38933c = (this.f38933c - this.f38932b) + indexOf;
                    this.f38932b = indexOf;
                    f();
                    this.f38934f = false;
                    return;
                }
                this.f38931a = kjVar;
                this.f38932b = 0;
                this.f38933c = kjVar.f16690k.message.length();
                f();
                this.f38934f = true;
                return;
            }
            org.telegram.messenger.f8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f38932b + ", " + this.f38933c + ", len=" + kjVar.f16690k.message.length() + ")");
            this.f38934f = false;
            return;
        }
        org.telegram.messenger.f8.d("ReplyQuote.checkEdit: message is null");
        this.f38934f = false;
    }

    public final void e(int i10, ArrayList arrayList) {
        this.f38941n = arrayList;
        this.f38942o = i10;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f38937j = arrayList2;
            String h = org.telegram.messenger.aw.h(arrayList, arrayList2);
            this.f38936i = h;
            h.getClass();
            return;
        }
        this.f38941n = null;
        this.f38936i = null;
        this.f38937j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i11;
        if (this.f38940m) {
            int i12 = this.f38932b;
            if (i12 >= 0 && (i11 = this.f38933c) >= 0) {
                org.telegram.messenger.aw k10 = org.telegram.messenger.aw.k(i12, i11, this.f38931a);
                if (k10 == null) {
                    org.telegram.messenger.f8.d("ReplyQuote: failed to build a rich quote (" + this.f38932b + ", " + this.f38933c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f14863b, k10.f14862a);
                return true;
            } else if (this.f38941n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.kj kjVar = this.f38931a;
            if (kjVar != null && (message = kjVar.f16690k) != null && (str = message.message) != null) {
                if (this.f38935g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.kj.Z(this.d, kjVar);
                    if (Z == null) {
                        org.telegram.messenger.f8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f38938k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.kj.X(kjVar, this.e);
                    if (X == null) {
                        org.telegram.messenger.f8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f38939l = X;
                    return true;
                } else {
                    int i13 = this.f38933c;
                    if (i13 >= this.f38932b && i13 <= str.length() && this.f38932b <= this.f38931a.f16690k.message.length() && (i10 = this.f38932b) >= 0 && this.f38933c >= 0) {
                        String str2 = this.f38931a.f16690k.message;
                        int max = Math.max(0, i10);
                        while (max < this.f38933c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f38933c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.f8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f38936i = this.f38931a.f16690k.message.substring(max, min);
                        ArrayList arrayList = this.f38937j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f38931a.f16690k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < this.f38931a.f16690k.entities.size(); i14++) {
                                TLRPC.MessageEntity messageEntity = this.f38931a.f16690k.entities.get(i14);
                                int i15 = messageEntity.offset;
                                int i16 = messageEntity.length + i15;
                                Typeface typeface = org.telegram.messenger.i0.f16145a;
                                if (Math.max(max, min) >= Math.min(i15, i16) && Math.max(i15, i16) >= Math.min(max, min)) {
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
                                    int i17 = messageEntity.offset;
                                    int i18 = i17 - max;
                                    int i19 = (i17 + messageEntity.length) - max;
                                    if ((i18 >= 0 || i19 >= 0) && (i18 <= min || i19 <= min)) {
                                        tL_messageEntityCustomEmoji.offset = Math.max(0, i18);
                                        tL_messageEntityCustomEmoji.length = Math.min(i19, min - max) - tL_messageEntityCustomEmoji.offset;
                                        if (this.f38937j == null) {
                                            this.f38937j = new ArrayList();
                                        }
                                        this.f38937j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.f8.d("ReplyQuote: start/end are invalid (" + this.f38932b + ", " + this.f38933c + ", len=" + this.f38931a.f16690k.message.length() + ")");
                        return false;
                    }
                }
            } else {
                org.telegram.messenger.f8.d("ReplyQuote: message is null");
                return false;
            }
        }
        return true;
    }
}
