package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jn {
    public MessageObject f39590a;
    public int f39591b;
    public int f39592c;
    public byte[] f39593e;
    public boolean f39594f;
    public boolean h;
    public String f39596i;
    public ArrayList f39597j;
    public TLRPC.TodoItem f39598k;
    public TLRPC.PollAnswer f39599l;
    public boolean f39595g = false;
    public int d = -1;

    public jn(int i10, int i11, MessageObject messageObject) {
        this.f39590a = messageObject;
        this.f39591b = i10;
        this.f39592c = i11;
        e();
    }

    public static jn b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new jn(i10, i11, messageObject);
    }

    public static jn c(MessageObject messageObject) {
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
            int i12 = this.f39592c;
            if (i12 >= this.f39591b && i12 <= str.length() && this.f39591b <= messageObject.messageOwner.message.length() && (i10 = this.f39591b) >= 0 && (i11 = this.f39592c) >= 0) {
                if (TextUtils.equals(this.f39596i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f39590a = messageObject;
                    e();
                    this.f39594f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f39596i);
                if (indexOf >= 0) {
                    this.f39590a = messageObject;
                    this.f39592c = (this.f39592c - this.f39591b) + indexOf;
                    this.f39591b = indexOf;
                    e();
                    this.f39594f = false;
                    return;
                }
                this.f39590a = messageObject;
                this.f39591b = 0;
                this.f39592c = messageObject.messageOwner.message.length();
                e();
                this.f39594f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f39591b + ", " + this.f39592c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f39594f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f39594f = false;
    }

    public final boolean d() {
        if (this.f39595g) {
            if (this.f39598k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f39599l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f39596i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f39590a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f39595g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f39598k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.f39593e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f39599l = findPollItem;
                return true;
            } else {
                int i11 = this.f39592c;
                if (i11 >= this.f39591b && i11 <= str.length() && this.f39591b <= this.f39590a.messageOwner.message.length() && (i10 = this.f39591b) >= 0 && this.f39592c >= 0) {
                    String str2 = this.f39590a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f39592c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f39592c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f39596i = this.f39590a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f39597j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f39590a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f39590a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f39590a.messageOwner.entities.get(i12);
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
                                    if (this.f39597j == null) {
                                        this.f39597j = new ArrayList();
                                    }
                                    this.f39597j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f39591b + ", " + this.f39592c + ", len=" + this.f39590a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
