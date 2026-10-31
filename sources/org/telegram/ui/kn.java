package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class kn {
    public org.telegram.messenger.jj f38905a;
    public int f38906b;
    public int f38907c;
    public byte[] e;
    public boolean f38908f;
    public boolean h;
    public String f38910i;
    public ArrayList f38911j;
    public TLRPC.TodoItem f38912k;
    public TLRPC.PollAnswer f38913l;
    public boolean f38914m;
    public ArrayList f38915n;
    public int f38916o;
    public boolean f38909g = false;
    public int d = -1;

    public kn(int i10, int i11, org.telegram.messenger.jj jjVar) {
        TLRPC.Message message;
        this.f38905a = jjVar;
        this.f38906b = i10;
        this.f38907c = i11;
        boolean z10 = false;
        if (jjVar != null && (message = jjVar.f16337k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f38914m = z10;
        f();
    }

    public static kn b(int i10, int i11, org.telegram.messenger.jj jjVar) {
        if (jjVar == null) {
            return null;
        }
        org.telegram.messenger.jj.B0(jjVar.f16337k);
        return new kn(i10, i11, jjVar);
    }

    public static kn c(org.telegram.messenger.jj jjVar) {
        TLRPC.Message message = jjVar.f16337k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.vp.r1(jjVar.I1).f18871p4, d(jjVar)), jjVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.jj jjVar) {
        ?? r22;
        TLRPC.Message message = jjVar.f16337k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.vv vvVar = jjVar.f16385w2;
                if (vvVar != null && (r22 = vvVar.f18999q) != 0) {
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

    public final void a(org.telegram.messenger.jj jjVar) {
        String str;
        int i10;
        int i11;
        TL_iv.RichMessage richMessage;
        org.telegram.messenger.zv zvVar;
        int[] iArr;
        if (this.f38914m) {
            TLRPC.Message message = jjVar.f16337k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f38905a = jjVar;
                String str2 = this.f38910i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e = org.telegram.messenger.zv.e(richMessage);
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = 0;
                    while (true) {
                        zvVar = null;
                        if (i12 >= e.size()) {
                            break;
                        }
                        if (i12 > 0) {
                            sb2.append('\n');
                        }
                        org.telegram.messenger.zv.b((TL_iv.RichText) e.get(i12), sb2, null);
                        i12++;
                    }
                    if (sb2.indexOf(str2) >= 0) {
                        if (org.telegram.messenger.zv.c(jjVar)) {
                            iArr = org.telegram.messenger.zv.f(jjVar, this.f38910i, this.f38916o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            zvVar = org.telegram.messenger.zv.k(iArr[0], iArr[1], jjVar);
                        }
                        if (zvVar != null) {
                            this.f38906b = iArr[0];
                            this.f38907c = iArr[1];
                            e(zvVar.f19767b, zvVar.f19766a);
                        } else {
                            this.f38906b = -1;
                            this.f38907c = -1;
                        }
                        this.f38908f = false;
                        return;
                    }
                }
                this.f38906b = 0;
                this.f38907c = Math.min(org.telegram.messenger.vp.r1(jjVar.I1).f18871p4, d(jjVar));
                this.f38908f = true;
                return;
            }
            org.telegram.messenger.f8.d("ReplyQuote.checkEdit: rich message is null");
            this.f38908f = false;
            return;
        }
        TLRPC.Message message2 = jjVar.f16337k;
        if (message2 != null && (str = message2.message) != null) {
            int i13 = this.f38907c;
            if (i13 >= this.f38906b && i13 <= str.length() && this.f38906b <= jjVar.f16337k.message.length() && (i10 = this.f38906b) >= 0 && (i11 = this.f38907c) >= 0) {
                if (TextUtils.equals(this.f38910i, jjVar.f16337k.message.substring(i10, i11))) {
                    this.f38905a = jjVar;
                    f();
                    this.f38908f = false;
                    return;
                }
                int indexOf = jjVar.f16337k.message.indexOf(this.f38910i);
                if (indexOf >= 0) {
                    this.f38905a = jjVar;
                    this.f38907c = (this.f38907c - this.f38906b) + indexOf;
                    this.f38906b = indexOf;
                    f();
                    this.f38908f = false;
                    return;
                }
                this.f38905a = jjVar;
                this.f38906b = 0;
                this.f38907c = jjVar.f16337k.message.length();
                f();
                this.f38908f = true;
                return;
            }
            org.telegram.messenger.f8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f38906b + ", " + this.f38907c + ", len=" + jjVar.f16337k.message.length() + ")");
            this.f38908f = false;
            return;
        }
        org.telegram.messenger.f8.d("ReplyQuote.checkEdit: message is null");
        this.f38908f = false;
    }

    public final void e(int i10, ArrayList arrayList) {
        this.f38915n = arrayList;
        this.f38916o = i10;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f38911j = arrayList2;
            String h = org.telegram.messenger.zv.h(arrayList, arrayList2);
            this.f38910i = h;
            h.getClass();
            return;
        }
        this.f38915n = null;
        this.f38910i = null;
        this.f38911j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i11;
        if (this.f38914m) {
            int i12 = this.f38906b;
            if (i12 >= 0 && (i11 = this.f38907c) >= 0) {
                org.telegram.messenger.zv k10 = org.telegram.messenger.zv.k(i12, i11, this.f38905a);
                if (k10 == null) {
                    org.telegram.messenger.f8.d("ReplyQuote: failed to build a rich quote (" + this.f38906b + ", " + this.f38907c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f19767b, k10.f19766a);
                return true;
            } else if (this.f38915n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.jj jjVar = this.f38905a;
            if (jjVar != null && (message = jjVar.f16337k) != null && (str = message.message) != null) {
                if (this.f38909g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.jj.Z(this.d, jjVar);
                    if (Z == null) {
                        org.telegram.messenger.f8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f38912k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.jj.X(jjVar, this.e);
                    if (X == null) {
                        org.telegram.messenger.f8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f38913l = X;
                    return true;
                } else {
                    int i13 = this.f38907c;
                    if (i13 >= this.f38906b && i13 <= str.length() && this.f38906b <= this.f38905a.f16337k.message.length() && (i10 = this.f38906b) >= 0 && this.f38907c >= 0) {
                        String str2 = this.f38905a.f16337k.message;
                        int max = Math.max(0, i10);
                        while (max < this.f38907c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f38907c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.f8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f38910i = this.f38905a.f16337k.message.substring(max, min);
                        ArrayList arrayList = this.f38911j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f38905a.f16337k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < this.f38905a.f16337k.entities.size(); i14++) {
                                TLRPC.MessageEntity messageEntity = this.f38905a.f16337k.entities.get(i14);
                                int i15 = messageEntity.offset;
                                int i16 = messageEntity.length + i15;
                                Typeface typeface = org.telegram.messenger.i0.f15999a;
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
                                        if (this.f38911j == null) {
                                            this.f38911j = new ArrayList();
                                        }
                                        this.f38911j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.f8.d("ReplyQuote: start/end are invalid (" + this.f38906b + ", " + this.f38907c + ", len=" + this.f38905a.f16337k.message.length() + ")");
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
