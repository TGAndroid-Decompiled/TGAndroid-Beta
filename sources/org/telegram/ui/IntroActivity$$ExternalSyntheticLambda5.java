package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;

public final class IntroActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public IntroActivity$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    private final void run$org$telegram$ui$GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda5() {
        GroupCreateActivity.GroupCreateAdapter groupCreateAdapter = (GroupCreateActivity.GroupCreateAdapter) this.f$0;
        if (groupCreateAdapter.searching) {
            groupCreateAdapter.searchRunnable = null;
            ArrayList arrayList = (ArrayList) this.f$1;
            groupCreateAdapter.searchResult = arrayList;
            groupCreateAdapter.searchResultNames = (ArrayList) this.f$2;
            SearchAdapterHelper searchAdapterHelper = groupCreateAdapter.searchAdapterHelper;
            searchAdapterHelper.mergeResults(arrayList, null);
            int i = groupCreateAdapter.currentItemsCount;
            GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
            groupCreateActivity.showItemsAnimated$1(i);
            groupCreateAdapter.notifyDataSetChanged();
            if (groupCreateAdapter.searching && !searchAdapterHelper.isSearchInProgress() && groupCreateAdapter.getItemCount() == 0) {
                groupCreateActivity.emptyView.showProgress(false, true);
            }
        }
    }

    private final void run$org$telegram$ui$InviteContactsActivity$InviteAdapter$$ExternalSyntheticLambda0() {
        InviteContactsActivity.InviteAdapter inviteAdapter = (InviteContactsActivity.InviteAdapter) this.f$0;
        if (inviteAdapter.searching) {
            inviteAdapter.searchResult = (ArrayList) this.f$1;
            inviteAdapter.searchResultNames = (ArrayList) this.f$2;
            inviteAdapter.notifyDataSetChanged();
            InviteContactsActivity.this.emptyView.showProgress(false, true);
        }
    }

    @Override
    public final void run() throws Throwable {
        Object obj;
        long peerId;
        Object obj2;
        int i;
        boolean zContains;
        String str;
        Uri uri;
        String stickerExt;
        int i2;
        int iCeil;
        String absolutePath;
        String absolutePath2;
        boolean z;
        int i3 = 2;
        Object obj3 = null;
        Object parentObject = null;
        Boolean boolValueOf = null;
        str = null;
        String str2 = null;
        final int i4 = 0;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        final int i5 = 1;
        switch (this.$r8$classId) {
            case 0:
                IntroActivity introActivity = (IntroActivity) obj6;
                if (!introActivity.destroyed) {
                    introActivity.switchLanguageTextView.setText(((TLRPC.TL_langPackString) obj5).value);
                    MessagesController.getGlobalMainSettings().edit().putString("language_showed2", ((String) obj4).toLowerCase()).apply();
                }
                break;
            case 1:
                SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter = (SharedMediaLayout.GroupUsersSearchAdapter) obj6;
                groupUsersSearchAdapter.getClass();
                String lowerCase = ((String) obj4).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(groupUsersSearchAdapter, new ArrayList(), new ArrayList(), i3));
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i6 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i6];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = (ArrayList) obj5;
                    int size = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLObject tLObject = (TLObject) arrayList3.get(i7);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject).user_id;
                        } else {
                            if (tLObject instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                            } else {
                                obj = obj3;
                            }
                            i7++;
                            obj3 = obj;
                        }
                        BaseFragment baseFragment = SharedMediaLayout.this.profileActivity;
                        TLRPC.User user = baseFragment.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.id == baseFragment.getUserConfig().getClientUserId()) {
                            obj = null;
                        } else {
                            String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = null;
                            }
                            int i8 = 0;
                            char c = 0;
                            while (true) {
                                if (i8 < i6) {
                                    String str3 = strArr[i8];
                                    if (lowerCase2.startsWith(str3) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str3, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str3) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str3, translitString2)))) {
                                        c = 1;
                                    } else {
                                        String publicUsername = UserObject.getPublicUsername(user);
                                        if (publicUsername != null && publicUsername.startsWith(str3)) {
                                            c = 2;
                                        }
                                    }
                                    if (c != 0) {
                                        if (c == 1) {
                                            arrayList.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str3));
                                            obj2 = null;
                                        } else {
                                            obj2 = null;
                                            arrayList.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str3));
                                        }
                                        arrayList2.add(tLObject);
                                        obj = obj2;
                                    } else {
                                        i8++;
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                        }
                        i7++;
                        obj3 = obj;
                    }
                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(groupUsersSearchAdapter, arrayList, arrayList2, 2));
                }
                break;
            case 2:
                SharedMediaLayout.GroupUsersSearchAdapter groupUsersSearchAdapter2 = (SharedMediaLayout.GroupUsersSearchAdapter) obj6;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.searching) {
                    groupUsersSearchAdapter2.searchResultNames = (ArrayList) obj5;
                    groupUsersSearchAdapter2.searchCount--;
                    if (!ChatObject.isChannel(groupUsersSearchAdapter2.currentChat)) {
                        ArrayList arrayList4 = groupUsersSearchAdapter2.searchAdapterHelper.groupSearch;
                        arrayList4.clear();
                        arrayList4.addAll((ArrayList) obj4);
                    }
                    if (groupUsersSearchAdapter2.searchCount == 0) {
                        int i9 = 0;
                        while (true) {
                            SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                            if (i9 < mediaPageArr.length) {
                                SharedMediaLayout.MediaPage mediaPage = mediaPageArr[i9];
                                if (mediaPage.selectedType != 7) {
                                    i = 1;
                                } else if (groupUsersSearchAdapter2.totalCount == 0) {
                                    i = 1;
                                    mediaPage.emptyView.showProgress(false, true);
                                } else {
                                    i = 1;
                                    sharedMediaLayout.animateItemsEnter(mediaPage.listView, 0, null);
                                }
                                i9 += i;
                            }
                        }
                    }
                    groupUsersSearchAdapter2.notifyDataSetChanged();
                    break;
                }
                break;
            case 3:
                SharedMediaLayout.MediaSearchAdapter mediaSearchAdapter = (SharedMediaLayout.MediaSearchAdapter) obj6;
                mediaSearchAdapter.getClass();
                String lowerCase3 = ((String) obj4).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(21, mediaSearchAdapter, new ArrayList()));
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                        str2 = translitString3;
                    }
                    int i10 = (str2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i10];
                    strArr2[0] = lowerCase3;
                    if (str2 != null) {
                        strArr2[1] = str2;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList6 = (ArrayList) obj5;
                        if (i11 >= arrayList6.size()) {
                            AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(21, mediaSearchAdapter, arrayList5));
                        } else {
                            MessageObject messageObject = (MessageObject) arrayList6.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < i10) {
                                    String str4 = strArr2[i12];
                                    String documentName = messageObject.getDocumentName();
                                    if (documentName != null && documentName.length() != 0) {
                                        if (documentName.toLowerCase().contains(str4)) {
                                            arrayList5.add(messageObject);
                                        } else {
                                            if (mediaSearchAdapter.currentType == 4) {
                                                TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 < document.attributes.size()) {
                                                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                            String str5 = documentAttribute.performer;
                                                            zContains = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                            if (!zContains && (str = documentAttribute.title) != null) {
                                                                zContains = str.toLowerCase().contains(str4);
                                                            }
                                                        } else {
                                                            i13++;
                                                        }
                                                    } else {
                                                        zContains = false;
                                                    }
                                                }
                                                if (zContains) {
                                                    arrayList5.add(messageObject);
                                                }
                                            }
                                            i12++;
                                        }
                                        break;
                                    }
                                    i12++;
                                }
                                break;
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 4:
                StickersAlert stickersAlert = (StickersAlert) obj6;
                if (!stickersAlert.isDismissed()) {
                    stickersAlert.uploadImportStickers.remove((String) obj4);
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj5;
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int iIndexOf = stickersAlert.importingStickersPaths.indexOf(importingSticker);
                        if (iIndexOf >= 0) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = stickersAlert.gridView.findViewHolderForAdapterPosition(iIndexOf);
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ((StickerEmojiCell) viewHolderFindViewHolderForAdapterPosition.itemView).setSticker(importingSticker);
                            }
                        } else {
                            stickersAlert.adapter.notifyDataSetChanged();
                        }
                    } else {
                        stickersAlert.removeSticker(importingSticker);
                    }
                    if (stickersAlert.uploadImportStickers.isEmpty()) {
                        stickersAlert.updateFields();
                    }
                    break;
                }
                break;
            case 5:
                ((StickersAlert) obj6).lambda$new$5((ArrayList) obj5, (Boolean) obj4);
                break;
            case 6:
                ((StickersAlert) obj6).lambda$updateFields$28((TLObject) obj4, (TLRPC.TL_error) obj5);
                break;
            case 7:
                ((StickersAlert) obj6).lambda$checkUrlAvailable$47((TextView) obj5, (String) obj4);
                break;
            case 8:
                StickersAlert stickersAlert2 = (StickersAlert) obj6;
                ArrayList arrayList7 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                ArrayList arrayList8 = (ArrayList) obj5;
                int size2 = arrayList8.size();
                while (i4 < size2) {
                    Object obj7 = arrayList8.get(i4);
                    if ((obj7 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj7))) != null) {
                        boolean zEquals = "tgs".equals(stickerExt);
                        if (boolValueOf == null) {
                            boolValueOf = Boolean.valueOf(zEquals);
                        } else if (boolValueOf.booleanValue() != zEquals) {
                            continue;
                        }
                        if (!stickersAlert2.isDismissed()) {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = zEquals;
                            Boolean bool = boolValueOf;
                            String strCopyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (zEquals ? 64 : 512) * 1024);
                            importingSticker2.path = strCopyFileToCache;
                            if (strCopyFileToCache != null) {
                                if (zEquals) {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(strCopyFileToCache, options);
                                    int i14 = options.outWidth;
                                    if ((i14 == 512 && (i2 = options.outHeight) > 0 && i2 <= 512) || (options.outHeight == 512 && i14 > 0 && i14 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                }
                                ArrayList arrayList9 = (ArrayList) obj4;
                                if (arrayList9 != null && arrayList9.size() == size2 && (arrayList9.get(i4) instanceof String)) {
                                    importingSticker2.emoji = (String) arrayList9.get(i4);
                                } else {
                                    importingSticker2.emoji = "#️⃣";
                                }
                                arrayList7.add(importingSticker2);
                                if (arrayList7.size() >= 200) {
                                    boolValueOf = bool;
                                    AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(stickersAlert2, arrayList7, boolValueOf, 5));
                                }
                            }
                            boolValueOf = bool;
                            break;
                        }
                        break;
                    }
                    i4++;
                }
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(stickersAlert2, arrayList7, boolValueOf, 5));
                break;
            case 9:
                TrendingStickersLayout.TrendingStickersAdapter trendingStickersAdapter = (TrendingStickersLayout.TrendingStickersAdapter) obj6;
                trendingStickersAdapter.loadingMore = false;
                if (((TLRPC.TL_error) obj5) == null) {
                    TLObject tLObject2 = (TLObject) obj4;
                    if (tLObject2 instanceof TLRPC.TL_messages_featuredStickers) {
                        ArrayList<TLRPC.StickerSetCovered> arrayList10 = ((TLRPC.TL_messages_featuredStickers) tLObject2).sets;
                        if (arrayList10.size() < 40) {
                            trendingStickersAdapter.endReached = true;
                        }
                        if (!arrayList10.isEmpty()) {
                            ArrayList arrayList11 = trendingStickersAdapter.otherPacks;
                            boolean zIsEmpty = arrayList11.isEmpty();
                            SparseArray sparseArray = trendingStickersAdapter.cache;
                            if (zIsEmpty) {
                                int i15 = trendingStickersAdapter.totalItems;
                                trendingStickersAdapter.totalItems = i15 + 1;
                                sparseArray.put(i15, -1);
                            }
                            arrayList11.addAll(arrayList10);
                            ArrayList arrayList12 = trendingStickersAdapter.sets;
                            int size3 = arrayList12.size();
                            for (int i16 = 0; i16 < arrayList10.size(); i16++) {
                                TLRPC.StickerSetCovered stickerSetCovered = arrayList10.get(i16);
                                if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                    arrayList12.add(stickerSetCovered);
                                    SparseArray sparseArray2 = trendingStickersAdapter.positionsToSets;
                                    sparseArray2.put(trendingStickersAdapter.totalItems, stickerSetCovered);
                                    int i17 = trendingStickersAdapter.totalItems;
                                    trendingStickersAdapter.totalItems = i17 + 1;
                                    int i18 = size3 + 1;
                                    sparseArray.put(i17, Integer.valueOf(size3));
                                    if (stickerSetCovered.covers.isEmpty()) {
                                        sparseArray.put(trendingStickersAdapter.totalItems, stickerSetCovered.cover);
                                        iCeil = 1;
                                    } else {
                                        iCeil = (int) Math.ceil(stickerSetCovered.covers.size() / trendingStickersAdapter.stickersPerRow);
                                        for (int i19 = 0; i19 < stickerSetCovered.covers.size(); i19++) {
                                            sparseArray.put(trendingStickersAdapter.totalItems + i19, stickerSetCovered.covers.get(i19));
                                        }
                                    }
                                    int i20 = 0;
                                    while (true) {
                                        int i21 = trendingStickersAdapter.stickersPerRow * iCeil;
                                        if (i20 < i21) {
                                            sparseArray2.put(trendingStickersAdapter.totalItems + i20, stickerSetCovered);
                                            i20++;
                                        } else {
                                            trendingStickersAdapter.totalItems = i21 + trendingStickersAdapter.totalItems;
                                            size3 = i18;
                                        }
                                    }
                                }
                            }
                            trendingStickersAdapter.notifyDataSetChanged();
                        }
                    }
                }
                trendingStickersAdapter.endReached = true;
                break;
            case 10:
                final PhotoViewer.AnonymousClass52 anonymousClass52 = (PhotoViewer.AnonymousClass52) obj6;
                anonymousClass52.getClass();
                Uri uri2 = (Uri) obj5;
                if ("tg".equals(uri2.getScheme())) {
                    int iIntValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject2 = FileLoader.getInstance(iIntValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.parseLong(uri2.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.parseInt((CharSequence) uri2.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri2.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.hexToBytes(uri2.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri2.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (FileLoader.getInstance(iIntValue).isLoadingFile(FileLoader.getAttachFileName(tL_document))) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(tL_document.dc_id);
                        sb.append("_");
                        absolutePath = new File(directory, SurfaceContainer$$ExternalSyntheticOutline0.m(sb, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(iIntValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    anonymousClass52.fileDrawable = new AnimatedFileDrawable(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject2, 0L, iIntValue, true);
                } else {
                    anonymousClass52.fileDrawable = new AnimatedFileDrawable(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                anonymousClass52.duration = anonymousClass52.fileDrawable.metaData[4];
                float f = anonymousClass52.pendingProgress;
                if (f != 0.0f) {
                    anonymousClass52.setProgress((MessageObject) obj4, f, anonymousClass52.pixelWidth);
                    anonymousClass52.pendingProgress = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                PhotoViewer.AnonymousClass52 anonymousClass53 = anonymousClass52;
                                anonymousClass53.open = true;
                                anonymousClass53.loadRunnable = null;
                                if (anonymousClass53.fileDrawable != null) {
                                    anonymousClass53.ready = true;
                                    PhotoViewer photoViewer = anonymousClass53.delegate.f$0;
                                    if (photoViewer.needShowOnReady) {
                                        photoViewer.showVideoSeekPreviewPosition(true);
                                    }
                                }
                                break;
                            default:
                                PhotoViewer.AnonymousClass52 anonymousClass54 = anonymousClass52;
                                anonymousClass54.open = true;
                                anonymousClass54.loadRunnable = null;
                                if (anonymousClass54.fileDrawable != null) {
                                    anonymousClass54.ready = true;
                                    PhotoViewer photoViewer2 = anonymousClass54.delegate.f$0;
                                    if (photoViewer2.needShowOnReady) {
                                        photoViewer2.showVideoSeekPreviewPosition(true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 11:
                final PhotoViewer.AnonymousClass52 anonymousClass53 = (PhotoViewer.AnonymousClass52) obj6;
                anonymousClass53.getClass();
                VideoPlayer.VideoUri videoUri = (VideoPlayer.VideoUri) obj5;
                if (videoUri.isCached()) {
                    anonymousClass53.fileDrawable = new AnimatedFileDrawable(new File(videoUri.uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int iIntValue2 = UserConfig.selectedAccount;
                    try {
                        iIntValue2 = Utilities.parseInt((CharSequence) videoUri.uri.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i22 = iIntValue2;
                    try {
                        parentObject = FileLoader.getInstance(i22).getParentObject(Utilities.parseInt((CharSequence) videoUri.uri.getQueryParameter("rid")).intValue());
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    Object obj8 = parentObject;
                    TLRPC.Document document2 = videoUri.document;
                    if (FileLoader.getInstance(i22).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(document2.dc_id);
                        sb2.append("_");
                        absolutePath2 = new File(directory2, SurfaceContainer$$ExternalSyntheticOutline0.m(sb2, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i22).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    anonymousClass53.fileDrawable = new AnimatedFileDrawable(new File(absolutePath2), true, document2.size, 1, document2, null, obj8, 0L, i22, true);
                }
                anonymousClass53.duration = anonymousClass53.fileDrawable.metaData[4];
                float f2 = anonymousClass53.pendingProgress;
                if (f2 != 0.0f) {
                    anonymousClass53.setProgress((MessageObject) obj4, f2, anonymousClass53.pixelWidth);
                    anonymousClass53.pendingProgress = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                PhotoViewer.AnonymousClass52 anonymousClass54 = anonymousClass53;
                                anonymousClass54.open = true;
                                anonymousClass54.loadRunnable = null;
                                if (anonymousClass54.fileDrawable != null) {
                                    anonymousClass54.ready = true;
                                    PhotoViewer photoViewer = anonymousClass54.delegate.f$0;
                                    if (photoViewer.needShowOnReady) {
                                        photoViewer.showVideoSeekPreviewPosition(true);
                                    }
                                }
                                break;
                            default:
                                PhotoViewer.AnonymousClass52 anonymousClass55 = anonymousClass53;
                                anonymousClass55.open = true;
                                anonymousClass55.loadRunnable = null;
                                if (anonymousClass55.fileDrawable != null) {
                                    anonymousClass55.ready = true;
                                    PhotoViewer photoViewer2 = anonymousClass55.delegate.f$0;
                                    if (photoViewer2.needShowOnReady) {
                                        photoViewer2.showVideoSeekPreviewPosition(true);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 12:
                SpoilersTextView spoilersTextView = (SpoilersTextView) obj6;
                LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = spoilersTextView.onLongPressListener;
                if (onLinkPress != null && spoilersTextView.pressedLink == ((LinkSpanDrawable) obj5)) {
                    onLinkPress.run((ClickableSpan) obj4);
                    spoilersTextView.pressedLink = null;
                    spoilersTextView.links.clear(true);
                    break;
                }
                break;
            case 13:
                final GroupCallActivity.AnonymousClass28 anonymousClass28 = (GroupCallActivity.AnonymousClass28) obj6;
                ValueAnimator valueAnimator = anonymousClass28.replaceFullscreenViewAnimator;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                final GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) obj5;
                groupCallMiniTextureView.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        GroupCallMiniTextureView groupCallMiniTextureView2 = groupCallMiniTextureView;
                        if (groupCallMiniTextureView2.getParent() != null) {
                            anonymousClass28.removeView(groupCallMiniTextureView2);
                            groupCallMiniTextureView2.release();
                        }
                    }
                }).setDuration(100L).start();
                final GroupCallMiniTextureView groupCallMiniTextureView2 = (GroupCallMiniTextureView) obj4;
                if (groupCallMiniTextureView2 != null) {
                    groupCallMiniTextureView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            groupCallMiniTextureView2.animateEnter = false;
                        }
                    }).start();
                }
                break;
            case 14:
                ((DialogsActivity) obj6).removeSelfFromStack();
                ((ChannelCreateActivity) obj5).removeSelfFromStack();
                ((BaseFragment) obj4).finishFragment();
                break;
            case 15:
                DialogsActivity dialogsActivity = (DialogsActivity) obj6;
                dialogsActivity.getClass();
                int length = ((Object[]) obj4).length;
                dialogsActivity.reloadViewPageDialogs((DialogsActivity.ViewPage) obj5);
                DialogsActivity.AnonymousClass10 anonymousClass10 = dialogsActivity.filterTabsView;
                if (anonymousClass10 != null && anonymousClass10.getVisibility() == 0) {
                    dialogsActivity.filterTabsView.checkTabsCounter();
                    break;
                }
                break;
            case 16:
                DialogsActivity.AnonymousClass11 anonymousClass11 = (DialogsActivity.AnonymousClass11) obj6;
                anonymousClass11.getClass();
                boolean z2 = ((boolean[]) obj5)[0];
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj4;
                if (z2) {
                    dialogsActivity2.presentFragment(new FilterChatlistActivity(dialogFilter, null));
                } else {
                    FilterCreateActivity.FilterInvitesBottomSheet.show(dialogsActivity2, dialogFilter, null);
                }
                break;
            case 17:
                EmojiAnimationsOverlay emojiAnimationsOverlay = (EmojiAnimationsOverlay) obj6;
                emojiAnimationsOverlay.getClass();
                emojiAnimationsOverlay.showStickerSetBulletin((TLRPC.TL_messages_stickerSet) ((TLObject) obj5), (MessageObject) obj4);
                break;
            case 18:
                AlertDialog alertDialog = (AlertDialog) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj6;
                externalActionActivity.getClass();
                try {
                    alertDialog.dismiss();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        AlertDialog alertDialogShowUpdateAppAlert = AlertsCreator.showUpdateAppAlert(externalActionActivity, LocaleController.getString(R.string.UpdateAppAlert), true);
                        if (alertDialogShowUpdateAppAlert != null) {
                            alertDialogShowUpdateAppAlert.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(8, externalActionActivity, tL_error));
                        } else {
                            externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                            externalActionActivity.finish();
                        }
                    } else if ("BOT_INVALID".equals(tL_error.text) || "PUBLIC_KEY_REQUIRED".equals(tL_error.text) || "PUBLIC_KEY_INVALID".equals(tL_error.text) || "SCOPE_EMPTY".equals(tL_error.text) || "PAYLOAD_EMPTY".equals(tL_error.text)) {
                        externalActionActivity.setResult(1, new Intent().putExtra("error", tL_error.text));
                        externalActionActivity.finish();
                    } else {
                        externalActionActivity.setResult(0);
                        externalActionActivity.finish();
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
                break;
            case 19:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) obj6;
                filterCreateActivity.getClass();
                FilterCreateActivity.processErrors((TLRPC.TL_error) obj5, filterCreateActivity, BulletinFactory.of(filterCreateActivity));
                TLObject tLObject3 = (TLObject) obj4;
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    filterCreateActivity.getMessagesController().loadRemoteFilters(true);
                    TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject3;
                    FilterChatlistActivity filterChatlistActivity = new FilterChatlistActivity(filterCreateActivity.filter, tL_chatlists_exportedChatlistInvite.invite);
                    filterChatlistActivity.onEdit = new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity, i5);
                    filterChatlistActivity.onDelete = new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity, i3);
                    filterCreateActivity.presentFragment(filterChatlistActivity);
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(3, filterCreateActivity, tL_chatlists_exportedChatlistInvite), 200L);
                }
                break;
            case 20:
                FilterCreateActivity.FilterInvitesBottomSheet filterInvitesBottomSheet = (FilterCreateActivity.FilterInvitesBottomSheet) obj6;
                BulletinFactory bulletinFactory = new BulletinFactory(filterInvitesBottomSheet.bulletinContainer, null);
                BaseFragment baseFragment2 = filterInvitesBottomSheet.baseFragment;
                FilterCreateActivity.processErrors((TLRPC.TL_error) obj5, baseFragment2, bulletinFactory);
                TLObject tLObject4 = (TLObject) obj4;
                if (tLObject4 instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite) {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("n_0", true).apply();
                    filterInvitesBottomSheet.lambda$showGiftOfferSheet$15();
                    baseFragment2.getMessagesController().loadRemoteFilters(true);
                    baseFragment2.presentFragment(new FilterChatlistActivity(filterInvitesBottomSheet.filter, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject4).invite));
                }
                break;
            case 21:
                FilterCreateActivity.LinkCell linkCell = (FilterCreateActivity.LinkCell) obj6;
                if (((TLRPC.TL_error) obj5) != null) {
                    BulletinFactory.of(linkCell.fragment).createErrorBulletin(LocaleController.getString(R.string.UnknownError), null).show();
                    AndroidUtilities.cancelRunOnUIThread((FilterCreateActivity$LinkCell$$ExternalSyntheticLambda2) obj4);
                } else {
                    linkCell.getClass();
                }
                break;
            case 22:
                FiltersSetupActivity.ListAdapter listAdapter = (FiltersSetupActivity.ListAdapter) obj6;
                listAdapter.getClass();
                AlertDialog alertDialog2 = (AlertDialog) obj5;
                if (alertDialog2 != null) {
                    try {
                        alertDialog2.dismiss();
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                }
                FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
                MessagesController.DialogFilter dialogFilter2 = (MessagesController.DialogFilter) obj4;
                filtersSetupActivity.getMessagesController().removeFilter(dialogFilter2);
                filtersSetupActivity.getMessagesStorage().deleteDialogFilter(dialogFilter2);
                break;
            case 23:
                ((SharedMediaLayout.AnonymousClass13) obj6).checkboxRequestId = -1;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                if (tL_error2 != null) {
                    BulletinFactory.of((BaseFragment) obj4).showForError(false, tL_error2);
                }
                break;
            case 24:
                ProfileGiftsContainer.Page page = (ProfileGiftsContainer.Page) obj6;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj5;
                GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) obj4;
                if (!page.isCollection && savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    giftCell.setPinned(false, true);
                    page.list.togglePinned(savedStarGift, false, false);
                }
                savedStarGift.unsaved = !savedStarGift.unsaved;
                giftCell.setStarsGift(savedStarGift, true, page.isCollection);
                page.parent.collections.updateGiftsUnsaved(savedStarGift, savedStarGift.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = page.list.getInput(savedStarGift);
                savestargift.unsave = savedStarGift.unsaved;
                ConnectionsManager.getInstance(page.currentAccount).sendRequest(savestargift, null);
                break;
            case 25:
                ProfileGiftsContainer.Page page2 = (ProfileGiftsContainer.Page) obj6;
                SharedMediaLayout.AnonymousClass13 anonymousClass13 = page2.parent;
                StarsController.GiftsCollections giftsCollections = anonymousClass13.collections;
                int i23 = page2.list.collectionId;
                giftsCollections.getClass();
                ArrayList arrayList13 = new ArrayList();
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj5;
                arrayList13.add(savedStarGift2);
                giftsCollections.removeGifts(i23, arrayList13);
                ((ItemOptions) obj4).dismiss();
                anonymousClass13.updateTabsShown();
                TL_stars.TL_starGiftCollection tL_starGiftCollectionFindById = anonymousClass13.collections.findById(page2.list.collectionId);
                if (tL_starGiftCollectionFindById != null) {
                    BulletinFactory.of(anonymousClass13.fragment).createSimpleMultiBulletin(savedStarGift2.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, StarGiftSheet.getGiftName(savedStarGift2.gift), tL_starGiftCollectionFindById.title))).show();
                }
                break;
            case 26:
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = (ResaleGiftsFragment.ResaleGiftsList) obj6;
                resaleGiftsList.reqId = -1;
                TLObject tLObject5 = (TLObject) obj5;
                if (tLObject5 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject5;
                    int i24 = resaleGiftsList.account;
                    MessagesController.getInstance(i24).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i24).putChats(resalestargifts.chats, false);
                    resaleGiftsList.totalCount = resalestargifts.count;
                    boolean zIsEmpty2 = TextUtils.isEmpty(((TL_stars.getResaleStarGifts) obj4).offset);
                    ArrayList arrayList14 = resaleGiftsList.gifts;
                    if (zIsEmpty2) {
                        arrayList14.clear();
                        z = true;
                    } else {
                        z = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList15 = resalestargifts.gifts;
                    int size4 = arrayList15.size();
                    int i25 = 0;
                    while (i25 < size4) {
                        TL_stars.StarGift starGift = arrayList15.get(i25);
                        i25++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList14.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    resaleGiftsList.endReached = arrayList14.size() >= resaleGiftsList.totalCount || TextUtils.isEmpty(resalestargifts.next_offset);
                    resaleGiftsList.last_offset = resalestargifts.next_offset;
                    resaleGiftsList.loading = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList16 = resalestargifts.attributes;
                    if (arrayList16 != null && !arrayList16.isEmpty()) {
                        ArrayList arrayList17 = resaleGiftsList.modelAttributes;
                        arrayList17.clear();
                        ArrayList arrayList18 = resaleGiftsList.backdropAttributes;
                        arrayList18.clear();
                        ArrayList arrayList19 = resaleGiftsList.patternAttributes;
                        arrayList19.clear();
                        arrayList17.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList18.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList19.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        resaleGiftsList.attributes_hash = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        HashMap map = resaleGiftsList.backdropAttributesCounter;
                        map.clear();
                        HashMap map2 = resaleGiftsList.patternAttributesCounter;
                        map2.clear();
                        HashMap map3 = resaleGiftsList.modelAttributesCounter;
                        map3.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList20 = resalestargifts.counters;
                        int size5 = arrayList20.size();
                        while (i4 < size5) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList20.get(i4);
                            i4++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                map.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                map2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                map3.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    Utilities.Callback callback = resaleGiftsList.onUpdate;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z));
                    }
                }
                break;
            case 27:
                run$org$telegram$ui$GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda5();
                break;
            case 28:
                run$org$telegram$ui$InviteContactsActivity$InviteAdapter$$ExternalSyntheticLambda0();
                break;
            default:
                TLRPC.User user2 = (TLRPC.User) obj5;
                MessagesController.getInstance(((LaunchActivity) obj6).currentAccount).putUser(user2, true);
                ((LaunchActivity$$ExternalSyntheticLambda27) obj4).run(user2);
                break;
        }
    }

    public IntroActivity$$ExternalSyntheticLambda5(Object obj, String str, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = str;
        this.f$1 = obj2;
    }
}
