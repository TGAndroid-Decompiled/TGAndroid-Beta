package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qm {
    public org.telegram.messenger.gj f50647a;
    public int f50648b;
    public int f50649c;
    public byte[] f50650e;
    public boolean f50651f;
    public boolean h;
    public String f50653i;
    public ArrayList f50654j;
    public TLRPC.TodoItem f50655k;
    public TLRPC.PollAnswer f50656l;
    public boolean f50657m;
    public ArrayList f50658n;
    public int f50659o;
    public boolean f50652g = false;
    public int d = -1;

    public qm(int i7, int i10, org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        this.f50647a = gjVar;
        this.f50648b = i7;
        this.f50649c = i10;
        boolean z10 = false;
        if (gjVar != null && (message = gjVar.f23819k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f50657m = z10;
        f();
    }

    public static qm b(int i7, int i10, org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        org.telegram.messenger.gj.B0(gjVar.f23819k);
        return new qm(i7, i10, gjVar);
    }

    public static qm c(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message = gjVar.f23819k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.np.s1(gjVar.K1).f25364p4, d(gjVar)), gjVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.gj gjVar) {
        ?? r22;
        TLRPC.Message message = gjVar.f23819k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.iv ivVar = gjVar.f23876y2;
                if (ivVar != null && (r22 = ivVar.f24459q) != 0) {
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
        if (this.f50657m) {
            TLRPC.Message message = gjVar.f23819k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f50647a = gjVar;
                String str2 = this.f50653i;
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
                            iArr = org.telegram.messenger.mv.f(gjVar, this.f50653i, this.f50659o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            mvVar = org.telegram.messenger.mv.k(iArr[0], iArr[1], gjVar);
                        }
                        if (mvVar != null) {
                            this.f50648b = iArr[0];
                            this.f50649c = iArr[1];
                            e(mvVar.f25103b, mvVar.f25102a);
                        } else {
                            this.f50648b = -1;
                            this.f50649c = -1;
                        }
                        this.f50651f = false;
                        return;
                    }
                }
                this.f50648b = 0;
                this.f50649c = Math.min(org.telegram.messenger.np.s1(gjVar.K1).f25364p4, d(gjVar));
                this.f50651f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
            this.f50651f = false;
            return;
        }
        TLRPC.Message message2 = gjVar.f23819k;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f50649c;
            if (i12 >= this.f50648b && i12 <= str.length() && this.f50648b <= gjVar.f23819k.message.length() && (i7 = this.f50648b) >= 0 && (i10 = this.f50649c) >= 0) {
                if (TextUtils.equals(this.f50653i, gjVar.f23819k.message.substring(i7, i10))) {
                    this.f50647a = gjVar;
                    f();
                    this.f50651f = false;
                    return;
                }
                int indexOf = gjVar.f23819k.message.indexOf(this.f50653i);
                if (indexOf >= 0) {
                    this.f50647a = gjVar;
                    this.f50649c = (this.f50649c - this.f50648b) + indexOf;
                    this.f50648b = indexOf;
                    f();
                    this.f50651f = false;
                    return;
                }
                this.f50647a = gjVar;
                this.f50648b = 0;
                this.f50649c = gjVar.f23819k.message.length();
                f();
                this.f50651f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f50648b + ", " + this.f50649c + ", len=" + gjVar.f23819k.message.length() + ")");
            this.f50651f = false;
            return;
        }
        org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
        this.f50651f = false;
    }

    public final void e(int i7, ArrayList arrayList) {
        this.f50658n = arrayList;
        this.f50659o = i7;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f50654j = arrayList2;
            String h = org.telegram.messenger.mv.h(arrayList, arrayList2);
            this.f50653i = h;
            h.getClass();
            return;
        }
        this.f50658n = null;
        this.f50653i = null;
        this.f50654j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i7;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.f50657m) {
            int i11 = this.f50648b;
            if (i11 >= 0 && (i10 = this.f50649c) >= 0) {
                org.telegram.messenger.mv k10 = org.telegram.messenger.mv.k(i11, i10, this.f50647a);
                if (k10 == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.f50648b + ", " + this.f50649c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f25103b, k10.f25102a);
                return true;
            } else if (this.f50658n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.gj gjVar = this.f50647a;
            if (gjVar != null && (message = gjVar.f23819k) != null && (str = message.message) != null) {
                if (this.f50652g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.gj.Z(this.d, gjVar);
                    if (Z == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f50655k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.gj.X(gjVar, this.f50650e);
                    if (X == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f50656l = X;
                    return true;
                } else {
                    int i12 = this.f50649c;
                    if (i12 >= this.f50648b && i12 <= str.length() && this.f50648b <= this.f50647a.f23819k.message.length() && (i7 = this.f50648b) >= 0 && this.f50649c >= 0) {
                        String str2 = this.f50647a.f23819k.message;
                        int max = Math.max(0, i7);
                        while (max < this.f50649c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f50649c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f50653i = this.f50647a.f23819k.message.substring(max, min);
                        ArrayList arrayList = this.f50654j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f50647a.f23819k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < this.f50647a.f23819k.entities.size(); i13++) {
                                TLRPC.MessageEntity messageEntity = this.f50647a.f23819k.entities.get(i13);
                                int i14 = messageEntity.offset;
                                int i15 = messageEntity.length + i14;
                                Typeface typeface = org.telegram.messenger.g0.f23583a;
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
                                        if (this.f50654j == null) {
                                            this.f50654j = new ArrayList();
                                        }
                                        this.f50654j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.f50648b + ", " + this.f50649c + ", len=" + this.f50647a.f23819k.message.length() + ")");
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
