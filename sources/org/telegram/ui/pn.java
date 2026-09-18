package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class pn {
    public MessageObject f36512a;
    public int f36513b;
    public int f36514c;
    public byte[] e;
    public boolean f36515f;
    public boolean h;
    public String f36517i;
    public ArrayList f36518j;
    public TLRPC.TodoItem f36519k;
    public TLRPC.PollAnswer f36520l;
    public boolean f36516g = false;
    public int d = -1;

    public pn(int i10, int i11, MessageObject messageObject) {
        this.f36512a = messageObject;
        this.f36513b = i10;
        this.f36514c = i11;
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
            int i12 = this.f36514c;
            if (i12 >= this.f36513b && i12 <= str.length() && this.f36513b <= messageObject.messageOwner.message.length() && (i10 = this.f36513b) >= 0 && (i11 = this.f36514c) >= 0) {
                if (TextUtils.equals(this.f36517i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f36512a = messageObject;
                    e();
                    this.f36515f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f36517i);
                if (indexOf >= 0) {
                    this.f36512a = messageObject;
                    this.f36514c = (this.f36514c - this.f36513b) + indexOf;
                    this.f36513b = indexOf;
                    e();
                    this.f36515f = false;
                    return;
                }
                this.f36512a = messageObject;
                this.f36513b = 0;
                this.f36514c = messageObject.messageOwner.message.length();
                e();
                this.f36515f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f36513b + ", " + this.f36514c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f36515f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f36515f = false;
    }

    public final boolean d() {
        if (this.f36516g) {
            if (this.f36519k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f36520l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f36517i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f36512a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f36516g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f36519k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f36520l = findPollItem;
                return true;
            } else {
                int i11 = this.f36514c;
                if (i11 >= this.f36513b && i11 <= str.length() && this.f36513b <= this.f36512a.messageOwner.message.length() && (i10 = this.f36513b) >= 0 && this.f36514c >= 0) {
                    String str2 = this.f36512a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f36514c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f36514c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f36517i = this.f36512a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f36518j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f36512a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f36512a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f36512a.messageOwner.entities.get(i12);
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
                                    if (this.f36518j == null) {
                                        this.f36518j = new ArrayList();
                                    }
                                    this.f36518j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f36513b + ", " + this.f36514c + ", len=" + this.f36512a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
