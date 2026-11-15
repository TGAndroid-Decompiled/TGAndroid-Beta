package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qm {
    public org.telegram.messenger.gj f50643a;
    public int f50644b;
    public int f50645c;
    public byte[] f50646e;
    public boolean f50647f;
    public boolean h;
    public String f50649i;
    public ArrayList f50650j;
    public TLRPC.TodoItem f50651k;
    public TLRPC.PollAnswer f50652l;
    public boolean f50653m;
    public ArrayList f50654n;
    public int f50655o;
    public boolean f50648g = false;
    public int d = -1;

    public qm(int i7, int i10, org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        this.f50643a = gjVar;
        this.f50644b = i7;
        this.f50645c = i10;
        boolean z10 = false;
        if (gjVar != null && (message = gjVar.f23817k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f50653m = z10;
        f();
    }

    public static qm b(int i7, int i10, org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        org.telegram.messenger.gj.B0(gjVar.f23817k);
        return new qm(i7, i10, gjVar);
    }

    public static qm c(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message = gjVar.f23817k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.np.s1(gjVar.K1).f25361p4, d(gjVar)), gjVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.gj gjVar) {
        ?? r22;
        TLRPC.Message message = gjVar.f23817k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.iv ivVar = gjVar.f23874y2;
                if (ivVar != null && (r22 = ivVar.f24454q) != 0) {
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

    public final void a(org.telegram.messenger.gj gjVar) {
        String str;
        int i7;
        int i10;
        TL_iv.RichMessage richMessage;
        org.telegram.messenger.mv mvVar;
        int[] iArr;
        if (this.f50653m) {
            TLRPC.Message message = gjVar.f23817k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f50643a = gjVar;
                String str2 = this.f50649i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e10 = org.telegram.messenger.mv.e(richMessage);
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    while (true) {
                        mvVar = null;
                        if (i11 >= e10.size()) {
                            break;
                        }
                        if (i11 > 0) {
                            sb2.append('\n');
                        }
                        org.telegram.messenger.mv.b((TL_iv.RichText) e10.get(i11), sb2, null);
                        i11++;
                    }
                    if (sb2.indexOf(str2) >= 0) {
                        if (org.telegram.messenger.mv.c(gjVar)) {
                            iArr = org.telegram.messenger.mv.f(gjVar, this.f50649i, this.f50655o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            mvVar = org.telegram.messenger.mv.k(iArr[0], iArr[1], gjVar);
                        }
                        if (mvVar != null) {
                            this.f50644b = iArr[0];
                            this.f50645c = iArr[1];
                            e(mvVar.f25100b, mvVar.f25099a);
                        } else {
                            this.f50644b = -1;
                            this.f50645c = -1;
                        }
                        this.f50647f = false;
                        return;
                    }
                }
                this.f50644b = 0;
                this.f50645c = Math.min(org.telegram.messenger.np.s1(gjVar.K1).f25361p4, d(gjVar));
                this.f50647f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
            this.f50647f = false;
            return;
        }
        TLRPC.Message message2 = gjVar.f23817k;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f50645c;
            if (i12 >= this.f50644b && i12 <= str.length() && this.f50644b <= gjVar.f23817k.message.length() && (i7 = this.f50644b) >= 0 && (i10 = this.f50645c) >= 0) {
                if (TextUtils.equals(this.f50649i, gjVar.f23817k.message.substring(i7, i10))) {
                    this.f50643a = gjVar;
                    f();
                    this.f50647f = false;
                    return;
                }
                int indexOf = gjVar.f23817k.message.indexOf(this.f50649i);
                if (indexOf >= 0) {
                    this.f50643a = gjVar;
                    this.f50645c = (this.f50645c - this.f50644b) + indexOf;
                    this.f50644b = indexOf;
                    f();
                    this.f50647f = false;
                    return;
                }
                this.f50643a = gjVar;
                this.f50644b = 0;
                this.f50645c = gjVar.f23817k.message.length();
                f();
                this.f50647f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f50644b + ", " + this.f50645c + ", len=" + gjVar.f23817k.message.length() + ")");
            this.f50647f = false;
            return;
        }
        org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
        this.f50647f = false;
    }

    public final void e(int i7, ArrayList arrayList) {
        this.f50654n = arrayList;
        this.f50655o = i7;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f50650j = arrayList2;
            String h = org.telegram.messenger.mv.h(arrayList, arrayList2);
            this.f50649i = h;
            h.getClass();
            return;
        }
        this.f50654n = null;
        this.f50649i = null;
        this.f50650j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i7;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.f50653m) {
            int i11 = this.f50644b;
            if (i11 >= 0 && (i10 = this.f50645c) >= 0) {
                org.telegram.messenger.mv k10 = org.telegram.messenger.mv.k(i11, i10, this.f50643a);
                if (k10 == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.f50644b + ", " + this.f50645c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f25100b, k10.f25099a);
                return true;
            } else if (this.f50654n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.gj gjVar = this.f50643a;
            if (gjVar != null && (message = gjVar.f23817k) != null && (str = message.message) != null) {
                if (this.f50648g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.gj.Z(this.d, gjVar);
                    if (Z == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f50651k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.gj.X(gjVar, this.f50646e);
                    if (X == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f50652l = X;
                    return true;
                } else {
                    int i12 = this.f50645c;
                    if (i12 >= this.f50644b && i12 <= str.length() && this.f50644b <= this.f50643a.f23817k.message.length() && (i7 = this.f50644b) >= 0 && this.f50645c >= 0) {
                        String str2 = this.f50643a.f23817k.message;
                        int max = Math.max(0, i7);
                        while (max < this.f50645c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f50645c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f50649i = this.f50643a.f23817k.message.substring(max, min);
                        ArrayList arrayList = this.f50650j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f50643a.f23817k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < this.f50643a.f23817k.entities.size(); i13++) {
                                TLRPC.MessageEntity messageEntity = this.f50643a.f23817k.entities.get(i13);
                                int i14 = messageEntity.offset;
                                int i15 = messageEntity.length + i14;
                                Typeface typeface = org.telegram.messenger.g0.f23581a;
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
                                        if (this.f50650j == null) {
                                            this.f50650j = new ArrayList();
                                        }
                                        this.f50650j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.f50644b + ", " + this.f50645c + ", len=" + this.f50643a.f23817k.message.length() + ")");
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
