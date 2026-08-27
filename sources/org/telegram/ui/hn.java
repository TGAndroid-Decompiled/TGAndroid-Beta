package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class hn {

    public MessageObject f38861a;

    public int f38862b;

    public int f38863c;

    public byte[] f38864e;

    public boolean f38865f;
    public boolean h;

    public String f38867i;

    public ArrayList f38868j;

    public TLRPC.TodoItem f38869k;

    public TLRPC.PollAnswer f38870l;

    public boolean f38866g = false;
    public int d = -1;

    public hn(int i10, int i11, MessageObject messageObject) {
        this.f38861a = messageObject;
        this.f38862b = i10;
        this.f38863c = i11;
        e();
    }

    public static hn b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new hn(i10, i11, messageObject);
    }

    public static hn c(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null || message.message == null) {
            return null;
        }
        return b(0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, messageObject.messageOwner.message.length()), messageObject);
    }

    public final void a(MessageObject messageObject) {
        String str;
        int i10;
        int i11;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null || (str = message.message) == null) {
            FileLog.e("ReplyQuote.checkEdit: message is null");
            this.f38865f = false;
            return;
        }
        int i12 = this.f38863c;
        if (i12 < this.f38862b || i12 > str.length() || this.f38862b > messageObject.messageOwner.message.length() || (i10 = this.f38862b) < 0 || (i11 = this.f38863c) < 0) {
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f38862b + ", " + this.f38863c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f38865f = false;
            return;
        }
        if (TextUtils.equals(this.f38867i, messageObject.messageOwner.message.substring(i10, i11))) {
            this.f38861a = messageObject;
            e();
            this.f38865f = false;
            return;
        }
        int iIndexOf = messageObject.messageOwner.message.indexOf(this.f38867i);
        if (iIndexOf >= 0) {
            this.f38861a = messageObject;
            this.f38863c = (this.f38863c - this.f38862b) + iIndexOf;
            this.f38862b = iIndexOf;
            e();
            this.f38865f = false;
            return;
        }
        this.f38861a = messageObject;
        this.f38862b = 0;
        this.f38863c = messageObject.messageOwner.message.length();
        e();
        this.f38865f = true;
    }

    public final boolean d() {
        if (this.f38866g) {
            if (this.f38869k == null) {
                return false;
            }
        } else {
            if (!this.h) {
                return !TextUtils.isEmpty(this.f38867i);
            }
            if (this.f38870l == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.MessageEntity tL_messageEntitySpoiler;
        MessageObject messageObject = this.f38861a;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (str = message.message) == null) {
            FileLog.e("ReplyQuote: message is null");
            return false;
        }
        if (this.f38866g) {
            TLRPC.TodoItem todoItemFindTodoItem = MessageObject.findTodoItem(messageObject, this.d);
            if (todoItemFindTodoItem == null) {
                FileLog.e("ReplyQuote: todo task is not found");
                return false;
            }
            this.f38869k = todoItemFindTodoItem;
            return true;
        }
        if (this.h) {
            TLRPC.PollAnswer pollAnswerFindPollItem = MessageObject.findPollItem(messageObject, this.f38864e);
            if (pollAnswerFindPollItem == null) {
                FileLog.e("ReplyQuote: poll item is not found");
                return false;
            }
            this.f38870l = pollAnswerFindPollItem;
            return true;
        }
        int i11 = this.f38863c;
        if (i11 < this.f38862b || i11 > str.length() || this.f38862b > this.f38861a.messageOwner.message.length() || (i10 = this.f38862b) < 0 || this.f38863c < 0) {
            FileLog.e("ReplyQuote: start/end are invalid (" + this.f38862b + ", " + this.f38863c + ", len=" + this.f38861a.messageOwner.message.length() + ")");
            return false;
        }
        String str2 = this.f38861a.messageOwner.message;
        int iMax = Math.max(0, i10);
        while (iMax < this.f38863c && Character.isWhitespace(str2.charAt(iMax))) {
            iMax++;
        }
        int iMin = Math.min(this.f38863c, str2.length());
        while (iMin > iMax && Character.isWhitespace(str2.charAt(iMin - 1))) {
            iMin--;
        }
        if (iMax == iMin) {
            FileLog.e("ReplyQuote: message is full of whitespace");
            return false;
        }
        this.f38867i = this.f38861a.messageOwner.message.substring(iMax, iMin);
        ArrayList arrayList = this.f38868j;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f38861a.messageOwner.entities;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < this.f38861a.messageOwner.entities.size(); i12++) {
                TLRPC.MessageEntity messageEntity = this.f38861a.messageOwner.entities.get(i12);
                int i13 = messageEntity.offset;
                if (AndroidUtilities.intersect1dInclusive(iMax, iMin, i13, messageEntity.length + i13)) {
                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                        tL_messageEntitySpoiler = new TLRPC.TL_messageEntityBold();
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                        tL_messageEntitySpoiler = new TLRPC.TL_messageEntityItalic();
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                        tL_messageEntitySpoiler = new TLRPC.TL_messageEntityUnderline();
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                        tL_messageEntitySpoiler = new TLRPC.TL_messageEntityStrike();
                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                        tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                        tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                        tL_messageEntitySpoiler = tL_messageEntityCustomEmoji;
                    }
                    int i14 = messageEntity.offset;
                    int i15 = i14 - iMax;
                    int i16 = (i14 + messageEntity.length) - iMax;
                    if ((i15 >= 0 || i16 >= 0) && (i15 <= iMin || i16 <= iMin)) {
                        tL_messageEntitySpoiler.offset = Math.max(0, i15);
                        tL_messageEntitySpoiler.length = Math.min(i16, iMin - iMax) - tL_messageEntitySpoiler.offset;
                        if (this.f38868j == null) {
                            this.f38868j = new ArrayList();
                        }
                        this.f38868j.add(tL_messageEntitySpoiler);
                    }
                }
            }
        }
        return true;
    }
}
