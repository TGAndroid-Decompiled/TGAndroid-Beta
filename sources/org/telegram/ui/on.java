package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class on {
    public MessageObject f39236a;
    public int f39237b;
    public int f39238c;
    public byte[] f39239e;
    public boolean f39240f;
    public boolean h;
    public String f39242i;
    public ArrayList f39243j;
    public TLRPC.TodoItem f39244k;
    public TLRPC.PollAnswer f39245l;
    public boolean f39241g = false;
    public int d = -1;

    public on(int i10, int i11, MessageObject messageObject) {
        this.f39236a = messageObject;
        this.f39237b = i10;
        this.f39238c = i11;
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
            int i12 = this.f39238c;
            if (i12 >= this.f39237b && i12 <= str.length() && this.f39237b <= messageObject.messageOwner.message.length() && (i10 = this.f39237b) >= 0 && (i11 = this.f39238c) >= 0) {
                if (TextUtils.equals(this.f39242i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f39236a = messageObject;
                    e();
                    this.f39240f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f39242i);
                if (indexOf >= 0) {
                    this.f39236a = messageObject;
                    this.f39238c = (this.f39238c - this.f39237b) + indexOf;
                    this.f39237b = indexOf;
                    e();
                    this.f39240f = false;
                    return;
                }
                this.f39236a = messageObject;
                this.f39237b = 0;
                this.f39238c = messageObject.messageOwner.message.length();
                e();
                this.f39240f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f39237b + ", " + this.f39238c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f39240f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f39240f = false;
    }

    public final boolean d() {
        if (this.f39241g) {
            if (this.f39244k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f39245l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f39242i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f39236a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f39241g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f39244k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.f39239e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f39245l = findPollItem;
                return true;
            } else {
                int i11 = this.f39238c;
                if (i11 >= this.f39237b && i11 <= str.length() && this.f39237b <= this.f39236a.messageOwner.message.length() && (i10 = this.f39237b) >= 0 && this.f39238c >= 0) {
                    String str2 = this.f39236a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f39238c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f39238c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f39242i = this.f39236a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f39243j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f39236a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f39236a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f39236a.messageOwner.entities.get(i12);
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
                                    if (this.f39243j == null) {
                                        this.f39243j = new ArrayList();
                                    }
                                    this.f39243j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f39237b + ", " + this.f39238c + ", len=" + this.f39236a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
