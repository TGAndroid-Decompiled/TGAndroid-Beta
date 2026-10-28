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
public final class mn {
    public MessageObject f41477a;
    public int f41478b;
    public int f41479c;
    public byte[] e;
    public boolean f41480f;
    public boolean h;
    public String f41482i;
    public ArrayList f41483j;
    public TLRPC.TodoItem f41484k;
    public TLRPC.PollAnswer f41485l;
    public boolean f41486m;
    public ArrayList f41487n;
    public int f41488o;
    public boolean f41481g = false;
    public int d = -1;

    public mn(MessageObject messageObject, int i10, int i11) {
        TLRPC.Message message;
        this.f41477a = messageObject;
        this.f41478b = i10;
        this.f41479c = i11;
        boolean z10 = false;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f41486m = z10;
        f();
    }

    public static mn b(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return c(messageObject, 0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, d(messageObject)));
            }
            return null;
        }
        return null;
    }

    public static mn c(MessageObject messageObject, int i10, int i11) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new mn(messageObject, i10, i11);
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
        if (this.f41486m) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f41477a = messageObject;
                String str2 = this.f41482i;
                if (str2 != null && RichQuote.containsQuote(richMessage, str2)) {
                    RichQuote richQuote = null;
                    if (RichQuote.canQuote(messageObject)) {
                        iArr = RichQuote.findQuote(messageObject, this.f41482i, this.f41488o);
                    } else {
                        iArr = null;
                    }
                    if (iArr != null) {
                        richQuote = RichQuote.fromSelection(messageObject, iArr[0], iArr[1]);
                    }
                    if (richQuote != null) {
                        this.f41478b = iArr[0];
                        this.f41479c = iArr[1];
                        e(richQuote.offset, richQuote.fragments);
                    } else {
                        this.f41478b = -1;
                        this.f41479c = -1;
                    }
                    this.f41480f = false;
                    return;
                }
                this.f41478b = 0;
                this.f41479c = Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, d(messageObject));
                this.f41480f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: rich message is null");
            this.f41480f = false;
            return;
        }
        TLRPC.Message message2 = messageObject.messageOwner;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f41479c;
            if (i12 >= this.f41478b && i12 <= str.length() && this.f41478b <= messageObject.messageOwner.message.length() && (i10 = this.f41478b) >= 0 && (i11 = this.f41479c) >= 0) {
                if (TextUtils.equals(this.f41482i, messageObject.messageOwner.message.substring(i10, i11))) {
                    this.f41477a = messageObject;
                    f();
                    this.f41480f = false;
                    return;
                }
                int indexOf = messageObject.messageOwner.message.indexOf(this.f41482i);
                if (indexOf >= 0) {
                    this.f41477a = messageObject;
                    this.f41479c = (this.f41479c - this.f41478b) + indexOf;
                    this.f41478b = indexOf;
                    f();
                    this.f41480f = false;
                    return;
                }
                this.f41477a = messageObject;
                this.f41478b = 0;
                this.f41479c = messageObject.messageOwner.message.length();
                f();
                this.f41480f = true;
                return;
            }
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.f41478b + ", " + this.f41479c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f41480f = false;
            return;
        }
        FileLog.e("ReplyQuote.checkEdit: message is null");
        this.f41480f = false;
    }

    public final void e(int i10, ArrayList arrayList) {
        this.f41487n = arrayList;
        this.f41488o = i10;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f41483j = arrayList2;
            String flatText = RichQuote.flatText(arrayList, arrayList2);
            this.f41482i = flatText;
            flatText.getClass();
            return;
        }
        this.f41487n = null;
        this.f41482i = null;
        this.f41483j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i11;
        if (this.f41486m) {
            int i12 = this.f41478b;
            if (i12 >= 0 && (i11 = this.f41479c) >= 0) {
                RichQuote fromSelection = RichQuote.fromSelection(this.f41477a, i12, i11);
                if (fromSelection == null) {
                    FileLog.e("ReplyQuote: failed to build a rich quote (" + this.f41478b + ", " + this.f41479c + ")");
                    e(0, null);
                    return false;
                }
                e(fromSelection.offset, fromSelection.fragments);
                return true;
            } else if (this.f41487n == null) {
                return false;
            }
        } else {
            MessageObject messageObject = this.f41477a;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (str = message.message) != null) {
                if (this.f41481g) {
                    TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                    if (findTodoItem == null) {
                        FileLog.e("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f41484k = findTodoItem;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.e);
                    if (findPollItem == null) {
                        FileLog.e("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f41485l = findPollItem;
                    return true;
                } else {
                    int i13 = this.f41479c;
                    if (i13 >= this.f41478b && i13 <= str.length() && this.f41478b <= this.f41477a.messageOwner.message.length() && (i10 = this.f41478b) >= 0 && this.f41479c >= 0) {
                        String str2 = this.f41477a.messageOwner.message;
                        int max = Math.max(0, i10);
                        while (max < this.f41479c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f41479c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            FileLog.e("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f41482i = this.f41477a.messageOwner.message.substring(max, min);
                        ArrayList arrayList = this.f41483j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f41477a.messageOwner.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i14 = 0; i14 < this.f41477a.messageOwner.entities.size(); i14++) {
                                TLRPC.MessageEntity messageEntity = this.f41477a.messageOwner.entities.get(i14);
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
                                        if (this.f41483j == null) {
                                            this.f41483j = new ArrayList();
                                        }
                                        this.f41483j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        FileLog.e("ReplyQuote: start/end are invalid (" + this.f41478b + ", " + this.f41479c + ", len=" + this.f41477a.messageOwner.message.length() + ")");
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
