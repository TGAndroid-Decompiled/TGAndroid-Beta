package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.bots.SetupEmojiStatusSheet;
import org.telegram.ui.bots.SetupEmojiStatusSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichQuoteAuthorCell;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;

public final class ChatActivity$$ExternalSyntheticLambda171 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda171(int i, int i2, MediaController mediaController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 1;
        this.f$0 = mediaController;
        this.f$1 = i;
        this.f$3 = tL_error;
        this.f$4 = tLObject;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        int i;
        char c;
        switch (this.$r8$classId) {
            case 0:
                int i2 = this.f$1;
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.progressDialogAtMessageId = i2;
                chatActivity.progressDialogAtMessageType = this.f$2;
                chatActivity.progressDialogLinkSpan = (CharacterStyle) this.f$3;
                ((ChatMessageCell) this.f$4).invalidate();
                break;
            case 1:
                ((MediaController) this.f$0).lambda$loadMoreMusic$11(this.f$1, (TLRPC.TL_error) this.f$3, (TLObject) this.f$4, this.f$2);
                break;
            case 2:
                SearchAdapter searchAdapter = (SearchAdapter) this.f$0;
                searchAdapter.getClass();
                String lowerCase = ((String) this.f$3).trim().toLowerCase();
                int length = lowerCase.length();
                int i3 = this.f$1;
                if (length == 0) {
                    AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(searchAdapter, i3, new ArrayList(), new ArrayList(), searchAdapter.unregistredContacts, 9));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i4 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i4];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        ArrayList arrayList4 = (ArrayList) this.f$4;
                        int size = arrayList4.size();
                        int i6 = this.f$2;
                        String str = null;
                        if (i5 >= size) {
                            int i7 = i3;
                            if (searchAdapter.allUnregistredContacts == null) {
                                searchAdapter.allUnregistredContacts = new ArrayList();
                                ArrayList<ContactsController.Contact> arrayList5 = ContactsController.getInstance(i6).phoneBookContacts;
                                int size2 = arrayList5.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    ContactsController.Contact contact = arrayList5.get(i8);
                                    i8++;
                                    ContactsController.Contact contact2 = contact;
                                    SearchAdapter.ContactEntry contactEntry = new SearchAdapter.ContactEntry();
                                    contactEntry.contact = contact2;
                                    contactEntry.q1 = (contact2.first_name + " " + contact2.last_name).toLowerCase();
                                    (contact2.last_name + " " + contact2.first_name).toLowerCase();
                                    searchAdapter.allUnregistredContacts.add(contactEntry);
                                }
                            }
                            for (int i9 = 0; i9 < searchAdapter.allUnregistredContacts.size(); i9++) {
                                SearchAdapter.ContactEntry contactEntry2 = (SearchAdapter.ContactEntry) searchAdapter.allUnregistredContacts.get(i9);
                                if ((translitString != null && (contactEntry2.q1.toLowerCase().contains(translitString) || contactEntry2.q1.toLowerCase().contains(translitString))) || contactEntry2.q1.toLowerCase().contains(lowerCase) || contactEntry2.q1.toLowerCase().contains(lowerCase)) {
                                    arrayList3.add(contactEntry2.contact);
                                }
                            }
                            AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(searchAdapter, i7, arrayList, arrayList2, arrayList3, 9));
                        } else {
                            TLRPC.User user = MessagesController.getInstance(i6).getUser(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i5)).user_id));
                            if (searchAdapter.allowSelf || !user.self) {
                                String[] strArr2 = new String[3];
                                strArr2[0] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                                String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[0]);
                                strArr2[1] = translitString2;
                                if (strArr2[0].equals(translitString2)) {
                                    strArr2[1] = null;
                                }
                                if (UserObject.isReplyUser(user)) {
                                    strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                                } else if (user.self) {
                                    strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                }
                                int i10 = 0;
                                char c2 = 0;
                                while (true) {
                                    if (i10 >= i4) {
                                        i = i3;
                                    }
                                    String str2 = strArr[i10];
                                    i = i3;
                                    int i11 = i10;
                                    for (int i12 = 0; i12 < 3; i12++) {
                                        String str3 = strArr2[i12];
                                        if (str3 != null && (str3.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, str3))) {
                                            c2 = 1;
                                            String publicUsername = UserObject.getPublicUsername(user);
                                            if (c2 == 0 || publicUsername == null || !publicUsername.startsWith(str2)) {
                                                c = c2;
                                            } else {
                                                c = 2;
                                            }
                                            if (c != 0) {
                                                if (c == 1) {
                                                    arrayList2.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str2));
                                                } else {
                                                    arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), str, "@" + str2));
                                                }
                                                arrayList.add(user);
                                            }
                                            c2 = c;
                                            i10 = i11 + 1;
                                            i3 = i;
                                            str = str;
                                        }
                                        break;
                                    }
                                    String publicUsername2 = UserObject.getPublicUsername(user);
                                    if (c2 == 0) {
                                        c = c2;
                                    } else {
                                        c = c2;
                                    }
                                    if (c != 0) {
                                        if (c == 1) {
                                            arrayList2.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str2));
                                        } else {
                                            arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), str, "@" + str2));
                                        }
                                        arrayList.add(user);
                                    }
                                    c2 = c;
                                    i10 = i11 + 1;
                                    i3 = i;
                                    str = str;
                                }
                            } else {
                                i = i3;
                            }
                            i5++;
                            i3 = i;
                        }
                    }
                }
                break;
            case 3:
                BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12 = (BotWebViewContainer$$ExternalSyntheticLambda12) this.f$4;
                TLRPC.Document document = (TLRPC.Document) this.f$3;
                SetupEmojiStatusSheet.show(this.f$1, (TLRPC.User) this.f$0, document, this.f$2, new SetupEmojiStatusSheet$$ExternalSyntheticLambda1(botWebViewContainer$$ExternalSyntheticLambda12, document, 1));
                break;
            case 4:
                RichDetailsCell.AnonymousClass3 anonymousClass3 = (RichDetailsCell.AnonymousClass3) this.f$0;
                anonymousClass3.getClass();
                RichEditText richEditText = (RichEditText) this.f$3;
                int length2 = richEditText.length();
                int i13 = this.f$1;
                if (length2 >= i13 && richEditText.getSelectionStart() != richEditText.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    RichDetailsCell richDetailsCell = RichDetailsCell.this;
                    if (articleTextSelectionHelper.selectRangeOf(richDetailsCell, 0, this.f$2, i13)) {
                        richDetailsCell.hijackingSelection = true;
                        richEditText.setSelection(i13);
                        richDetailsCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 5:
                PhotoViewer.AnonymousClass24 anonymousClass24 = (PhotoViewer.AnonymousClass24) this.f$0;
                anonymousClass24.getClass();
                RichEditText richEditText2 = (RichEditText) this.f$3;
                int length3 = richEditText2.length();
                int i14 = this.f$1;
                if (length3 >= i14 && richEditText2.getSelectionStart() != richEditText2.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    boolean zIsInSelectionMode = articleTextSelectionHelper2.isInSelectionMode();
                    RichQuoteAuthorCell richQuoteAuthorCell = (RichQuoteAuthorCell) anonymousClass24.this$0;
                    if (zIsInSelectionMode) {
                        richQuoteAuthorCell.hijackingSelection = true;
                        richEditText2.setSelection(i14);
                        richQuoteAuthorCell.hijackingSelection = false;
                    } else if (articleTextSelectionHelper2.selectRangeOf(richQuoteAuthorCell, 0, this.f$2, i14)) {
                        richQuoteAuthorCell.hijackingSelection = true;
                        richEditText2.setSelection(i14);
                        richQuoteAuthorCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 6:
                PhotoViewer.AnonymousClass49 anonymousClass49 = (PhotoViewer.AnonymousClass49) this.f$0;
                anonymousClass49.getClass();
                RichEditText richEditText3 = (RichEditText) this.f$3;
                int length4 = richEditText3.length();
                int i15 = this.f$1;
                if (length4 >= i15 && richEditText3.getSelectionStart() != richEditText3.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper3 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    RichTableCell richTableCell = (RichTableCell) anonymousClass49.this$0;
                    if (articleTextSelectionHelper3.selectRangeOf(richTableCell, 0, this.f$2, i15)) {
                        richTableCell.hijackingSelection = true;
                        richEditText3.setSelection(i15);
                        richTableCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 7:
                RichTextCell.AnonymousClass2 anonymousClass2 = (RichTextCell.AnonymousClass2) this.f$0;
                anonymousClass2.getClass();
                RichEditText richEditText4 = (RichEditText) this.f$3;
                int length5 = richEditText4.length();
                int i16 = this.f$1;
                if (length5 >= i16 && richEditText4.getSelectionStart() != richEditText4.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper4 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    boolean zIsInSelectionMode2 = articleTextSelectionHelper4.isInSelectionMode();
                    RichTextCell richTextCell = RichTextCell.this;
                    if (zIsInSelectionMode2) {
                        richTextCell.hijackingSelection = true;
                        richEditText4.setSelection(i16);
                        richTextCell.hijackingSelection = false;
                    } else if (articleTextSelectionHelper4.selectRangeOf(richTextCell, 0, this.f$2, i16)) {
                        richTextCell.hijackingSelection = true;
                        richEditText4.setSelection(i16);
                        richTextCell.hijackingSelection = false;
                    }
                    break;
                }
                break;
            default:
                RichTextCell.AnonymousClass3 anonymousClass4 = (RichTextCell.AnonymousClass3) this.f$0;
                anonymousClass4.getClass();
                RichEditText richEditText5 = (RichEditText) this.f$3;
                int length6 = richEditText5.length();
                int i17 = this.f$1;
                if (length6 >= i17 && richEditText5.getSelectionStart() != richEditText5.getSelectionEnd()) {
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper5 = (TextSelectionHelper.ArticleTextSelectionHelper) this.f$4;
                    boolean zIsInSelectionMode3 = articleTextSelectionHelper5.isInSelectionMode();
                    RichTextCell richTextCell2 = RichTextCell.this;
                    if (zIsInSelectionMode3) {
                        richTextCell2.hijackingAuthorSelection = true;
                        richEditText5.setSelection(i17);
                        richTextCell2.hijackingAuthorSelection = false;
                    } else if (articleTextSelectionHelper5.selectRangeOf(richTextCell2, 1, this.f$2, i17)) {
                        richTextCell2.hijackingAuthorSelection = true;
                        richEditText5.setSelection(i17);
                        richTextCell2.hijackingAuthorSelection = false;
                    }
                    break;
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda171(int i, TLRPC.User user, TLRPC.Document document, int i2, BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12) {
        this.$r8$classId = 3;
        this.f$1 = i;
        this.f$0 = user;
        this.f$3 = document;
        this.f$2 = i2;
        this.f$4 = botWebViewContainer$$ExternalSyntheticLambda12;
    }

    public ChatActivity$$ExternalSyntheticLambda171(Object obj, Object obj2, int i, Object obj3, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$1 = i;
        this.f$4 = obj3;
        this.f$2 = i2;
    }

    public ChatActivity$$ExternalSyntheticLambda171(ChatActivity chatActivity, int i, int i2, CharacterStyle characterStyle, ChatMessageCell chatMessageCell) {
        this.$r8$classId = 0;
        this.f$0 = chatActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = characterStyle;
        this.f$4 = chatMessageCell;
    }
}
