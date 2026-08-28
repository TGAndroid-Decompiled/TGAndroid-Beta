package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gn {
    public MessageObject f38572a;
    public int f38573b;
    public int f38574c;
    public byte[] f38575e;
    public boolean f38576f;
    public boolean h;
    public String f38578i;
    public ArrayList f38579j;
    public TLRPC.TodoItem f38580k;
    public TLRPC.PollAnswer f38581l;
    public boolean f38577g = false;
    public int d = -1;

    public gn(int i9, int i10, MessageObject messageObject) {
        this.f38572a = messageObject;
        this.f38573b = i9;
        this.f38574c = i10;
        e();
    }

    public static gn b(int i9, int i10, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new gn(i9, i10, messageObject);
    }

    public static gn c(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && message.message != null) {
            return b(0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, messageObject.messageOwner.message.length()), messageObject);
        }
        return null;
    }

    public final void a(MessageObject messageObject) {
        String str;
        int i9;
        int i10;
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && (str = message.message) != null) {
            int i11 = this.f38574c;
            if (i11 >= this.f38573b && i11 <= str.length() && this.f38573b <= messageObject.messageOwner.message.length() && (i9 = this.f38573b) >= 0 && (i10 = this.f38574c) >= 0) {
                if (TextUtils.equals(this.f38578i, messageObject.messageOwner.message.substring(i9, i10))) {
                    this.f38572a = messageObject;
                    e();
                    this.f38576f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f38578i);
                if (indexOf >= 0) {
                    this.f38572a = messageObject;
                    this.f38574c = (this.f38574c - this.f38573b) + indexOf;
                    this.f38573b = indexOf;
                    e();
                    this.f38576f = false;
                    return;
                }
                this.f38572a = messageObject;
                this.f38573b = 0;
                this.f38574c = messageObject.messageOwner.message.length();
                e();
                this.f38576f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f38573b + ", " + this.f38574c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f38576f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f38576f = false;
    }

    public final boolean d() {
        if (this.f38577g) {
            if (this.f38580k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f38581l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f38578i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i9;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f38572a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f38577g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f38580k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.f38575e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f38581l = findPollItem;
                return true;
            } else {
                int i10 = this.f38574c;
                if (i10 >= this.f38573b && i10 <= str.length() && this.f38573b <= this.f38572a.messageOwner.message.length() && (i9 = this.f38573b) >= 0 && this.f38574c >= 0) {
                    String str2 = this.f38572a.messageOwner.message;
                    int max = Math.max(0, i9);
                    while (max < this.f38574c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f38574c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f38578i = this.f38572a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f38579j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f38572a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i11 = 0; i11 < this.f38572a.messageOwner.entities.size(); i11++) {
                            TLRPC.MessageEntity messageEntity = this.f38572a.messageOwner.entities.get(i11);
                            int i12 = messageEntity.offset;
                            if (AndroidUtilities.intersect1dInclusive(max, min, i12, messageEntity.length + i12)) {
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
                                int i13 = messageEntity.offset;
                                int i14 = i13 - max;
                                int i15 = (i13 + messageEntity.length) - max;
                                if ((i14 >= 0 || i15 >= 0) && (i14 <= min || i15 <= min)) {
                                    tL_messageEntityCustomEmoji.offset = Math.max(0, i14);
                                    tL_messageEntityCustomEmoji.length = Math.min(i15, min - max) - tL_messageEntityCustomEmoji.offset;
                                    if (this.f38579j == null) {
                                        this.f38579j = new ArrayList();
                                    }
                                    this.f38579j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f38573b + ", " + this.f38574c + ", len=" + this.f38572a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
