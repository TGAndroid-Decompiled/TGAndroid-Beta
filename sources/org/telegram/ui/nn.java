package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nn {
    public MessageObject f35557a;
    public int f35558b;
    public int f35559c;
    public byte[] e;
    public boolean f35560f;
    public boolean h;
    public String f35562i;
    public ArrayList f35563j;
    public TLRPC.TodoItem f35564k;
    public TLRPC.PollAnswer f35565l;
    public boolean f35561g = false;
    public int d = -1;

    public nn(int i10, int i11, MessageObject messageObject) {
        this.f35557a = messageObject;
        this.f35558b = i10;
        this.f35559c = i11;
        e();
    }

    public static nn b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new nn(i10, i11, messageObject);
    }

    public static nn c(MessageObject messageObject) {
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
            int i12 = this.f35559c;
            if (i12 >= this.f35558b && i12 <= str.length() && this.f35558b <= messageObject.messageOwner.message.length() && (i10 = this.f35558b) >= 0 && (i11 = this.f35559c) >= 0) {
                if (TextUtils.equals(this.f35562i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f35557a = messageObject;
                    e();
                    this.f35560f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f35562i);
                if (indexOf >= 0) {
                    this.f35557a = messageObject;
                    this.f35559c = (this.f35559c - this.f35558b) + indexOf;
                    this.f35558b = indexOf;
                    e();
                    this.f35560f = false;
                    return;
                }
                this.f35557a = messageObject;
                this.f35558b = 0;
                this.f35559c = messageObject.messageOwner.message.length();
                e();
                this.f35560f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f35558b + ", " + this.f35559c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f35560f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f35560f = false;
    }

    public final boolean d() {
        if (this.f35561g) {
            if (this.f35564k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f35565l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f35562i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f35557a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f35561g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f35564k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f35565l = findPollItem;
                return true;
            } else {
                int i11 = this.f35559c;
                if (i11 >= this.f35558b && i11 <= str.length() && this.f35558b <= this.f35557a.messageOwner.message.length() && (i10 = this.f35558b) >= 0 && this.f35559c >= 0) {
                    String str2 = this.f35557a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f35559c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f35559c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f35562i = this.f35557a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f35563j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f35557a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f35557a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f35557a.messageOwner.entities.get(i12);
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
                                    if (this.f35563j == null) {
                                        this.f35563j = new ArrayList();
                                    }
                                    this.f35563j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f35558b + ", " + this.f35559c + ", len=" + this.f35557a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
