package org.telegram.ui.iv;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

public final class RichCaptionController$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final int f$5;

    public RichCaptionController$1$$ExternalSyntheticLambda0(ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.f$0 = shareSearchAdapter;
        this.f$1 = str;
        this.f$3 = arrayList;
        this.f$4 = arrayList2;
        this.f$2 = i;
        this.f$5 = i2;
    }

    @Override
    public final void run() {
        String lowerCase;
        String translitString;
        ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter;
        char c;
        String publicUsername;
        int i;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer.AnonymousClass14 anonymousClass14 = (PhotoViewer.AnonymousClass14) this.f$0;
                anonymousClass14.getClass();
                RichEditText richEditText = (RichEditText) this.f$1;
                int length = richEditText.length();
                int i2 = this.f$2;
                if (length >= i2 && richEditText.getSelectionStart() != richEditText.getSelectionEnd()) {
                    if (((TextSelectionHelper.ArticleTextSelectionHelper) this.f$3).selectRangeOf(((RichCaptionController.Host) this.f$4).cell(), 0, this.f$5, i2)) {
                        RichCaptionController richCaptionController = (RichCaptionController) anonymousClass14.this$0;
                        richCaptionController.hijackingSelection = true;
                        richEditText.setSelection(i2);
                        richCaptionController.hijackingSelection = false;
                    }
                    break;
                }
                break;
            case 1:
                ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter2 = (ChatAttachAlertContactsLayout.ShareSearchAdapter) this.f$0;
                shareSearchAdapter2.getClass();
                String lowerCase2 = ((String) this.f$1).trim().toLowerCase();
                if (lowerCase2.length() != 0) {
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2) || translitString2.length() == 0) {
                        translitString2 = null;
                    }
                    int i3 = (translitString2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i3];
                    strArr[0] = lowerCase2;
                    if (translitString2 != null) {
                        strArr[1] = translitString2;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList3 = (ArrayList) this.f$3;
                        if (i4 >= arrayList3.size()) {
                            ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter3 = shareSearchAdapter2;
                            int i5 = 0;
                            while (true) {
                                ArrayList arrayList4 = (ArrayList) this.f$4;
                                if (i5 >= arrayList4.size()) {
                                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(shareSearchAdapter3, this.f$5, arrayList, arrayList2, 12));
                                } else {
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList4.get(i5);
                                    if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                                        TLRPC.User user = MessagesController.getInstance(this.f$2).getUser(Long.valueOf(tL_contact.user_id));
                                        String lowerCase3 = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                                        String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                        if (lowerCase3.equals(translitString3)) {
                                            translitString3 = null;
                                        }
                                        char c2 = 0;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= i3) {
                                            }
                                            String str = strArr[i6];
                                            if (lowerCase3.startsWith(str) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str, translitString3)))) {
                                                c2 = 1;
                                            } else {
                                                String publicUsername2 = UserObject.getPublicUsername(user);
                                                if (publicUsername2 != null && publicUsername2.startsWith(str)) {
                                                    c2 = 2;
                                                }
                                            }
                                            if (c2 != 0 && user.phone != null) {
                                                if (c2 == 1) {
                                                    arrayList2.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str));
                                                } else {
                                                    arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str));
                                                }
                                                arrayList.add(user);
                                            }
                                            i6++;
                                            break;
                                            break;
                                        }
                                    }
                                    i5++;
                                }
                            }
                        } else {
                            ContactsController.Contact contact = (ContactsController.Contact) arrayList3.get(i4);
                            String lowerCase4 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                            String translitString4 = LocaleController.getInstance().getTranslitString(lowerCase4);
                            TLRPC.User user2 = contact.user;
                            if (user2 != null) {
                                lowerCase = ContactsController.formatName(user2.first_name, user2.last_name).toLowerCase();
                                translitString = LocaleController.getInstance().getTranslitString(lowerCase4);
                            } else {
                                lowerCase = null;
                                translitString = null;
                            }
                            if (lowerCase4.equals(translitString4)) {
                                translitString4 = null;
                            }
                            int i7 = 0;
                            char c3 = 0;
                            while (true) {
                                shareSearchAdapter = shareSearchAdapter2;
                                if (i7 >= i3) {
                                }
                                String str2 = strArr[i7];
                                int i8 = i7;
                                if ((lowerCase == null || !(lowerCase.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase))) && (translitString == null || !(translitString.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString)))) {
                                    TLRPC.User user3 = contact.user;
                                    c = (user3 == null || (publicUsername = UserObject.getPublicUsername(user3)) == null || !publicUsername.startsWith(str2)) ? (lowerCase4.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase4) || (translitString4 != null && (translitString4.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString4)))) ? (char) 3 : c3 : (char) 2;
                                } else {
                                    c = 1;
                                }
                                String str3 = lowerCase4;
                                if (c != 0 && (!contact.phones.isEmpty() || !contact.shortPhones.isEmpty())) {
                                    if (c == 3) {
                                        arrayList2.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                                    } else if (c == 1) {
                                        TLRPC.User user4 = contact.user;
                                        arrayList2.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str2));
                                    } else {
                                        arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(contact.user), null, "@" + str2));
                                    }
                                    TLRPC.User user5 = contact.user;
                                    if (user5 != null) {
                                        longSparseIntArray.put(user5.id, 1);
                                    }
                                    arrayList.add(contact);
                                }
                                char c4 = c;
                                i7 = i8 + 1;
                                lowerCase4 = str3;
                                c3 = c4;
                                shareSearchAdapter2 = shareSearchAdapter;
                                break;
                                break;
                            }
                            i4++;
                            shareSearchAdapter2 = shareSearchAdapter;
                        }
                    }
                } else {
                    shareSearchAdapter2.lastSearchId = -1;
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(shareSearchAdapter2, shareSearchAdapter2.lastSearchId, new ArrayList(), new ArrayList(), 12));
                }
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f$0;
                ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                if (!chatAttachAlert.isPhotoPicker || chatAttachAlert.isStickerMode) {
                    i = this.f$2;
                } else {
                    PhotoViewer.getInstance().setParentActivity(null, (BaseFragment) this.f$1, null);
                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                    photoViewer.maxSelectedPhotos = 0;
                    photoViewer.allowOrder = false;
                    i = 3;
                }
                PhotoViewer.getInstance().openPhotoForSelect((ArrayList) this.f$3, this.f$5, chatAttachAlert.isPollAttach ? 13 : i, false, chatAttachAlertPhotoLayout.photoViewerProvider, chatAttachAlert.isPollAttach ? null : (ChatActivity) this.f$4);
                PhotoViewer.getInstance().setAvatarFor(chatAttachAlert.setAvatarFor);
                if (chatAttachAlert.isPhotoPicker && !chatAttachAlert.isStickerMode) {
                    PhotoViewer.getInstance().closePhotoAfterSelect = false;
                } else if (chatAttachAlert.avatarPicker != 0) {
                    PhotoViewer.getInstance().closePhotoAfterSelect = true;
                    PhotoViewer.getInstance().closePhotoAfterSelectWithAnimation = chatAttachAlert.avatarWithBulletin != null;
                }
                if (chatAttachAlert.isStickerMode) {
                    PhotoViewer.getInstance().enableStickerMode(null, null, false, chatAttachAlert.customStickerHandler);
                }
                if (ChatAttachAlertPhotoLayout.captionForAllMedia()) {
                    PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                    Editable text = chatAttachAlert.getCommentView().getText();
                    photoViewer2.hasCaptionForAllMedia = true;
                    photoViewer2.captionForAllMedia = text;
                    photoViewer2.setCurrentCaption(null, text, false, false);
                    photoViewer2.updateCaptionTextForCurrentPhoto(null);
                }
                break;
        }
    }

    public RichCaptionController$1$$ExternalSyntheticLambda0(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, BaseFragment baseFragment, ArrayList arrayList, int i2, ChatActivity chatActivity) {
        this.f$0 = chatAttachAlertPhotoLayout;
        this.f$2 = i;
        this.f$1 = baseFragment;
        this.f$3 = arrayList;
        this.f$5 = i2;
        this.f$4 = chatActivity;
    }

    public RichCaptionController$1$$ExternalSyntheticLambda0(PhotoViewer.AnonymousClass14 anonymousClass14, RichEditText richEditText, int i, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper, RichCaptionController.Host host, int i2) {
        this.f$0 = anonymousClass14;
        this.f$1 = richEditText;
        this.f$2 = i;
        this.f$3 = articleTextSelectionHelper;
        this.f$4 = host;
        this.f$5 = i2;
    }
}
