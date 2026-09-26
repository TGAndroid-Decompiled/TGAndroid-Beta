package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mn {
    public MessageObject f35624a;
    public int f35625b;
    public int f35626c;
    public byte[] e;
    public boolean f35627f;
    public boolean h;
    public String f35629i;
    public ArrayList f35630j;
    public TLRPC.TodoItem f35631k;
    public TLRPC.PollAnswer f35632l;
    public boolean f35628g = false;
    public int d = -1;

    public mn(int i10, int i11, MessageObject messageObject) {
        this.f35624a = messageObject;
        this.f35625b = i10;
        this.f35626c = i11;
        e();
    }

    public static mn b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new mn(i10, i11, messageObject);
    }

    public static mn c(MessageObject messageObject) {
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
            int i12 = this.f35626c;
            if (i12 >= this.f35625b && i12 <= str.length() && this.f35625b <= messageObject.messageOwner.message.length() && (i10 = this.f35625b) >= 0 && (i11 = this.f35626c) >= 0) {
                if (TextUtils.equals(this.f35629i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f35624a = messageObject;
                    e();
                    this.f35627f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f35629i);
                if (indexOf >= 0) {
                    this.f35624a = messageObject;
                    this.f35626c = (this.f35626c - this.f35625b) + indexOf;
                    this.f35625b = indexOf;
                    e();
                    this.f35627f = false;
                    return;
                }
                this.f35624a = messageObject;
                this.f35625b = 0;
                this.f35626c = messageObject.messageOwner.message.length();
                e();
                this.f35627f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f35625b + ", " + this.f35626c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f35627f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f35627f = false;
    }

    public final boolean d() {
        if (this.f35628g) {
            if (this.f35631k == null) {
                return false;
            }
        } else if (this.h) {
            if (this.f35632l == null) {
                return false;
            }
        } else {
            return !TextUtils.isEmpty(this.f35629i);
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        MessageObject messageObject = this.f35624a;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
            if (this.f35628g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.f35631k = findTodoItem;
                return true;
            } else if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.f35632l = findPollItem;
                return true;
            } else {
                int i11 = this.f35626c;
                if (i11 >= this.f35625b && i11 <= str.length() && this.f35625b <= this.f35624a.messageOwner.message.length() && (i10 = this.f35625b) >= 0 && this.f35626c >= 0) {
                    String str2 = this.f35624a.messageOwner.message;
                    int max = Math.max(0, i10);
                    while (max < this.f35626c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.f35626c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        FileLog.e("ReplyQuote: message is full of whitespace");
                        return false;
                    }
                    this.f35629i = this.f35624a.messageOwner.message.substring(max, min);
                    ArrayList arrayList = this.f35630j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.f35624a.messageOwner.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i12 = 0; i12 < this.f35624a.messageOwner.entities.size(); i12++) {
                            TLRPC.MessageEntity messageEntity = this.f35624a.messageOwner.entities.get(i12);
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
                                    if (this.f35630j == null) {
                                        this.f35630j = new ArrayList();
                                    }
                                    this.f35630j.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                    }
                    return true;
                }
                FileLog.e("ReplyQuote: start/end are invalid (" + this.f35625b + ", " + this.f35626c + ", len=" + this.f35624a.messageOwner.message.length() + ")");
                return false;
            }
        }
        FileLog.e("ReplyQuote: message is null");
        return false;
    }
}
