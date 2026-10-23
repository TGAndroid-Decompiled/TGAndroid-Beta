package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class gn {
    public MessageObject f37362a;
    public int f37363b;
    public int f37364c;
    public byte[] e;
    public boolean f37365f;
    public boolean h;
    public String f37367i;
    public ArrayList f37368j;
    public TLRPC.TodoItem f37369k;
    public TLRPC.PollAnswer f37370l;
    public boolean f37371m;
    public ArrayList f37372n;
    public int f37373o;
    public boolean f37366g = false;
    public int d = -1;

    public gn(MessageObject messageObject, int i10, int i11) {
        TLRPC.Message message;
        this.f37362a = messageObject;
        this.f37363b = i10;
        this.f37364c = i11;
        boolean z10 = false;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f37371m = z10;
        f();
    }

    public static gn b(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return c(messageObject, 0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, d(messageObject)));
            }
            return null;
        }
        return null;
    }

    public static gn c(MessageObject messageObject, int i10, int i11) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new gn(messageObject, i10, i11);
    }

    public static int d(MessageObject messageObject) {
        CharSequence charSequence;
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                RichMessageLayout richMessageLayout = messageObject.richLayout;
                if (richMessageLayout != null && (charSequence = richMessageLayout.joinedText) != null) {
                    return charSequence.length();
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

    public final void a(MessageObject messageObject) {
        String str;
        int i10;
        int i11;
        TL_iv.RichMessage richMessage;
        int[] iArr;
        if (this.f37371m) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f37362a = messageObject;
                String str2 = this.f37367i;
                if (str2 != null && RichQuote.containsQuote(richMessage, str2)) {
                    RichQuote richQuote = null;
                    if (RichQuote.canQuote(messageObject)) {
                        iArr = RichQuote.findQuote(messageObject, this.f37367i, this.f37373o);
                    } else {
                        iArr = null;
                    }
                    if (iArr != null) {
                        richQuote = RichQuote.fromSelection(messageObject, iArr[0], iArr[1]);
                    }
                    if (richQuote != null) {
                        this.f37363b = iArr[0];
                        this.f37364c = iArr[1];
                        e(richQuote.offset, richQuote.fragments);
                    } else {
                        this.f37363b = -1;
                        this.f37364c = -1;
                    }
                    this.f37365f = false;
                    return;
                }
                this.f37363b = 0;
                this.f37364c = Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, d(messageObject));
                this.f37365f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: rich message is null");
            this.f37365f = false;
            return;
        }
        TLRPC.Message message2 = messageObject.messageOwner;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f37364c;
            if (i12 >= this.f37363b && i12 <= str.length() && this.f37363b <= messageObject.messageOwner.message.length() && (i10 = this.f37363b) >= 0 && (i11 = this.f37364c) >= 0) {
                if (TextUtils.equals(this.f37367i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f37362a = messageObject;
                    f();
                    this.f37365f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f37367i);
                if (indexOf >= 0) {
                    this.f37362a = messageObject;
                    this.f37364c = (this.f37364c - this.f37363b) + indexOf;
                    this.f37363b = indexOf;
                    f();
                    this.f37365f = false;
                    return;
                }
                this.f37362a = messageObject;
                this.f37363b = 0;
                this.f37364c = messageObject.messageOwner.message.length();
                f();
                this.f37365f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f37363b + ", " + this.f37364c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f37365f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f37365f = false;
    }

    public final void e(int i10, ArrayList arrayList) {
        this.f37372n = arrayList;
        this.f37373o = i10;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f37368j = arrayList2;
            String flatText = RichQuote.flatText(arrayList, arrayList2);
            this.f37367i = flatText;
            flatText.getClass();
            return;
        }
        this.f37372n = null;
        this.f37367i = null;
        this.f37368j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i11;
        if (this.f37371m) {
            int i12 = this.f37363b;
            if (i12 >= 0 && (i11 = this.f37364c) >= 0) {
                RichQuote fromSelection = RichQuote.fromSelection(this.f37362a, i12, i11);
                if (fromSelection == null) {
                    FileLog.e("ReplyQuote: failed to build a rich quote (" + this.f37363b + ", " + this.f37364c + ")");
                    e(0, null);
                    return false;
                }
                e(fromSelection.offset, fromSelection.fragments);
                return true;
            } else if (this.f37372n == null) {
                return false;
            }
        } else {
            MessageObject messageObject = this.f37362a;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
                if (this.f37366g) {
                    TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                    if (findTodoItem == null) {
                        FileLog.e("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f37369k = findTodoItem;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.e);
                    if (findPollItem == null) {
                        FileLog.e("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f37370l = findPollItem;
                    return true;
                } else {
                    int i13 = this.f37364c;
                    if (i13 >= this.f37363b && i13 <= str.length() && this.f37363b <= this.f37362a.messageOwner.message.length() && (i10 = this.f37363b) >= 0 && this.f37364c >= 0) {
                        String str2 = this.f37362a.messageOwner.message;
                        int max = Math.max(0, i10);
                        while (max < this.f37364c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f37364c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            FileLog.e("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f37367i = this.f37362a.messageOwner.message.substring(max, min);
                        ArrayList arrayList = this.f37368j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f37362a.messageOwner.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < this.f37362a.messageOwner.entities.size(); i14++) {
                                TLRPC.MessageEntity messageEntity = this.f37362a.messageOwner.entities.get(i14);
                                int i15 = messageEntity.offset;
                                if (AndroidUtilities.intersect1dInclusive(max, min, i15, messageEntity.length + i15)) {
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
                                    int i16 = messageEntity.offset;
                                    int i17 = i16 - max;
                                    int i18 = (i16 + messageEntity.length) - max;
                                    if ((i17 >= 0 || i18 >= 0) && (i17 <= min || i18 <= min)) {
                                        tL_messageEntityCustomEmoji.offset = Math.max(0, i17);
                                        tL_messageEntityCustomEmoji.length = Math.min(i18, min - max) - tL_messageEntityCustomEmoji.offset;
                                        if (this.f37368j == null) {
                                            this.f37368j = new ArrayList();
                                        }
                                        this.f37368j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        FileLog.e("ReplyQuote: start/end are invalid (" + this.f37363b + ", " + this.f37364c + ", len=" + this.f37362a.messageOwner.message.length() + ")");
                        return false;
                    }
                }
            } else {
                FileLog.e("ReplyQuote: message is null");
                return false;
            }
        }
        return true;
    }
}
