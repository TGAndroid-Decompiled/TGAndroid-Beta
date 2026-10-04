package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class on {
    public MessageObject f39235a;
    public int f39236b;
    public int f39237c;
    public byte[] f39238e;
    public boolean f39239f;
    public boolean h;
    public String f39241i;
    public ArrayList f39242j;
    public TLRPC.TodoItem f39243k;
    public TLRPC.PollAnswer f39244l;
    public boolean f39240g = false;
    public int d = -1;

    public on(int i10, int i11, MessageObject messageObject) {
        this.f39235a = messageObject;
        this.f39236b = i10;
        this.f39237c = i11;
        e();
    }

    public static on b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new on(i10, i11, messageObject);
    }

    public static on c(MessageObject messageObject) {
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
            int i12 = this.f39237c;
            if (i12 >= this.f39236b && i12 <= str.length() && this.f39236b <= messageObject.messageOwner.message.length() && (i10 = this.f39236b) >= 0 && (i11 = this.f39237c) >= 0) {
                if (TextUtils.equals(this.f39241i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f39235a = messageObject;
                    e();
                    this.f39239f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f39241i);
                if (indexOf >= 0) {
                    this.f39235a = messageObject;
                    this.f39237c = (this.f39237c - this.f39236b) + indexOf;
                    this.f39236b = indexOf;
                    e();
                    this.f39239f = false;
                    return;
                }
                this.f39235a = messageObject;
                this.f39236b = 0;
                this.f39237c = messageObject.messageOwner.message.length();
                e();
                this.f39239f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f39236b + ", " + this.f39237c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f39239f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f39239f = false;
    }

    public final boolean d() {
        if (this.f39240g) {
            if (this.f39243k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f39244l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f39241i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f39235a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f39240g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f39243k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.f39238e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f39244l = findPollItem;
                return true;
            } else {
                int i11 = this.f39237c;
                if (i11 >= this.f39236b && i11 <= str.length() && this.f39236b <= this.f39235a.messageOwner.message.length() && (i10 = this.f39236b) >= 0 && this.f39237c >= 0) {
                    String str2 = this.f39235a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f39237c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f39237c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f39241i = this.f39235a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f39242j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f39235a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f39235a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f39235a.messageOwner.entities.get(i12);
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
                                    if (this.f39242j == null) {
                                        this.f39242j = new ArrayList();
                                    }
                                    this.f39242j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f39236b + ", " + this.f39237c + ", len=" + this.f39235a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
