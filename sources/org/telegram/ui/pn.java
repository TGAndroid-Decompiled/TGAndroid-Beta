package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class pn {
    public MessageObject f40946a;
    public int f40947b;
    public int f40948c;
    public byte[] f40949e;
    public boolean f40950f;
    public boolean h;
    public String f40952i;
    public ArrayList f40953j;
    public TLRPC.TodoItem f40954k;
    public TLRPC.PollAnswer f40955l;
    public boolean f40951g = false;
    public int d = -1;

    public pn(int i10, int i11, MessageObject messageObject) {
        this.f40946a = messageObject;
        this.f40947b = i10;
        this.f40948c = i11;
        e();
    }

    public static pn b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new pn(i10, i11, messageObject);
    }

    public static pn c(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && message.message != null) {
            return b(0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, messageObject.messageOwner.message.length()), messageObject);
        }
        return null;
    }

    public final void a(MessageObject messageObject) {
        String str;
        int i10;
        int i11;
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && (str = message.message) != null) {
            int i12 = this.f40948c;
            if (i12 >= this.f40947b && i12 <= str.length() && this.f40947b <= messageObject.messageOwner.message.length() && (i10 = this.f40947b) >= 0 && (i11 = this.f40948c) >= 0) {
                if (TextUtils.equals(this.f40952i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f40946a = messageObject;
                    e();
                    this.f40950f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f40952i);
                if (indexOf >= 0) {
                    this.f40946a = messageObject;
                    this.f40948c = (this.f40948c - this.f40947b) + indexOf;
                    this.f40947b = indexOf;
                    e();
                    this.f40950f = false;
                    return;
                }
                this.f40946a = messageObject;
                this.f40947b = 0;
                this.f40948c = messageObject.messageOwner.message.length();
                e();
                this.f40950f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f40947b + ", " + this.f40948c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f40950f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f40950f = false;
    }

    public final boolean d() {
        if (this.f40951g) {
            if (this.f40954k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f40955l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f40952i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f40946a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f40951g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f40954k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.f40949e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f40955l = findPollItem;
                return true;
            } else {
                int i11 = this.f40948c;
                if (i11 >= this.f40947b && i11 <= str.length() && this.f40947b <= this.f40946a.messageOwner.message.length() && (i10 = this.f40947b) >= 0 && this.f40948c >= 0) {
                    String str2 = this.f40946a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f40948c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f40948c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f40952i = this.f40946a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f40953j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f40946a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f40946a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f40946a.messageOwner.entities.get(i12);
                            int i13 = messageEntity.offset;
                            if (AndroidUtilities.intersect1dInclusive(max, min, i13, messageEntity.length + i13)) {
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
                                int i14 = messageEntity.offset;
                                int i15 = i14 - max;
                                int i16 = (i14 + messageEntity.length) - max;
                                if ((i15 >= 0 || i16 >= 0) && (i15 <= min || i16 <= min)) {
                                    tL_messageEntityCustomEmoji.offset = Math.max(0, i15);
                                    tL_messageEntityCustomEmoji.length = Math.min(i16, min - max) - tL_messageEntityCustomEmoji.offset;
                                    if (this.f40953j == null) {
                                        this.f40953j = new ArrayList();
                                    }
                                    this.f40953j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f40947b + ", " + this.f40948c + ", len=" + this.f40946a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
