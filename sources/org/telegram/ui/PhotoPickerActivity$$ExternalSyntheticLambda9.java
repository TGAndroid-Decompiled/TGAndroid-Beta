package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.SlotsDrawable$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichEditorListView;

public final class PhotoPickerActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId = 4;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final boolean f$4;
    public final Object f$5;

    public PhotoPickerActivity$$ExternalSyntheticLambda9(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f$0 = activity;
        this.f$2 = i;
        this.f$1 = inputGroupCall;
        this.f$4 = z;
        this.f$3 = groupCall;
        this.f$5 = hashSet;
    }

    @Override
    public final void run() throws Throwable {
        String str;
        int i;
        boolean z;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        int i2;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i3;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.Document document;
        String res;
        int[] iArr;
        RLottieNative rLottieNativeCreateFromRawJson;
        char c;
        String absolutePath;
        final String str2;
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpenInputStream;
        String extensionFromMimeType;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i4;
        int i5;
        int i6;
        int iCeil;
        final int i7;
        int iIntValue;
        final int i8;
        final int i9;
        final int iIntValue2;
        switch (this.$r8$classId) {
            case 0:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.f$0;
                ArrayList arrayList = photoPickerActivity.recentSearches;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    str = (String) this.f$1;
                    if (i10 < size) {
                        if (((String) arrayList.get(i10)).equalsIgnoreCase(str)) {
                            arrayList.remove(i10);
                        } else {
                            i10++;
                        }
                    }
                }
                arrayList.add(0, str);
                while (arrayList.size() > 20) {
                    SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList);
                }
                photoPickerActivity.saveRecentSearch();
                if (this.f$2 != photoPickerActivity.lastSearchToken) {
                    return;
                }
                ArrayList arrayList2 = photoPickerActivity.searchResult;
                int size2 = arrayList2.size();
                TLObject tLObject = (TLObject) this.f$3;
                if (tLObject != null) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    photoPickerActivity.nextImagesSearchOffset = messages_botresults.next_offset;
                    int size3 = messages_botresults.results.size();
                    i = 0;
                    for (int i11 = 0; i11 < size3; i11++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                        boolean z2 = this.f$4;
                        if ((z2 || "photo".equals(botInlineResult.type)) && (!z2 || "gif".equals(botInlineResult.type))) {
                            HashMap map = photoPickerActivity.searchResultKeys;
                            if (!map.containsKey(botInlineResult.id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                if (z2 && botInlineResult.document != null) {
                                    for (int i12 = 0; i12 < botInlineResult.document.attributes.size(); i12++) {
                                        TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i12);
                                        if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                            searchImage.width = documentAttribute.w;
                                            searchImage.height = documentAttribute.h;
                                            searchImage.document = botInlineResult.document;
                                            searchImage.size = 0;
                                            photo2 = botInlineResult.photo;
                                            if (photo2 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, photoPickerActivity.itemSize, true)) != null) {
                                                botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                                botInlineResult.document.flags |= 1;
                                            }
                                        }
                                    }
                                    searchImage.document = botInlineResult.document;
                                    searchImage.size = 0;
                                    photo2 = botInlineResult.photo;
                                    if (photo2 != null) {
                                        botInlineResult.document.thumbs.add(closestPhotoSizeWithSize);
                                        botInlineResult.document.flags |= 1;
                                    }
                                } else if (!z2 && (photo = botInlineResult.photo) != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize2 != null) {
                                        searchImage.width = closestPhotoSizeWithSize2.w;
                                        searchImage.height = closestPhotoSizeWithSize2.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize2;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize2.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize3;
                                    }
                                } else if (botInlineResult.content != null) {
                                    for (int i13 = 0; i13 < botInlineResult.content.attributes.size(); i13++) {
                                        TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i13);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) {
                                            searchImage.width = documentAttribute2.w;
                                            searchImage.height = documentAttribute2.h;
                                            webDocument = botInlineResult.thumb;
                                            if (webDocument != null) {
                                                searchImage.thumbUrl = webDocument.url;
                                            } else {
                                                searchImage.thumbUrl = null;
                                            }
                                            webDocument2 = botInlineResult.content;
                                            searchImage.imageUrl = webDocument2.url;
                                            if (z2) {
                                                i2 = 0;
                                            } else {
                                                i2 = webDocument2.size;
                                            }
                                            searchImage.size = i2;
                                        }
                                    }
                                    webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    if (z2) {
                                        i2 = 0;
                                    } else {
                                        i2 = webDocument2.size;
                                    }
                                    searchImage.size = i2;
                                }
                                searchImage.id = botInlineResult.id;
                                searchImage.type = z2 ? 1 : 0;
                                searchImage.inlineResult = botInlineResult;
                                HashMap<String, String> map2 = new HashMap<>();
                                searchImage.params = map2;
                                map2.put("id", botInlineResult.id);
                                searchImage.params.put("query_id", "" + messages_botresults.query_id);
                                searchImage.params.put("bot_name", UserObject.getPublicUsername((TLRPC.User) this.f$5));
                                arrayList2.add(searchImage);
                                map.put(searchImage.id, searchImage);
                                i++;
                            }
                        }
                    }
                    photoPickerActivity.imageSearchEndReached = size2 == arrayList2.size() || photoPickerActivity.nextImagesSearchOffset == null;
                } else {
                    i = 0;
                }
                photoPickerActivity.searching = false;
                if (i == 0) {
                    if (photoPickerActivity.imageSearchEndReached) {
                        z = true;
                        photoPickerActivity.listAdapter.mObservable.notifyItemRangeRemoved(arrayList2.size() - 1, 1);
                    }
                    if (arrayList2.size() <= 0) {
                        photoPickerActivity.emptyView.showProgress(false, z);
                        return;
                    }
                    return;
                }
                photoPickerActivity.listAdapter.mObservable.notifyItemRangeInserted(size2, i);
                z = true;
                if (arrayList2.size() <= 0) {
                    photoPickerActivity.emptyView.showProgress(false, z);
                    return;
                }
                return;
            case 1:
                ((ContactsController) this.f$0).lambda$processLoadedContacts$36(this.f$2, (ArrayList) this.f$1, (ArrayList) this.f$3, (LongSparseArray) this.f$5, this.f$4);
                return;
            case 2:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequestMulti$65((TLObject) this.f$3, this.f$2, (SendMessagesHelper.DelayedMessage) this.f$1, (ArrayList) this.f$5, this.f$4);
                return;
            case 3:
                SlotsDrawable slotsDrawable = (SlotsDrawable) this.f$0;
                if (slotsDrawable.destroyAfterLoading) {
                    AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda2(slotsDrawable, 0));
                    return;
                }
                int i14 = 0;
                boolean z3 = false;
                while (true) {
                    RLottieNative[] rLottieNativeArr = slotsDrawable.secondLottieNatives;
                    int length = rLottieNativeArr.length + 2;
                    int i15 = this.f$2;
                    ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$5;
                    if (i14 >= length) {
                        if (z3) {
                            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda2(slotsDrawable, 1));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new ChatActivity$70$$ExternalSyntheticLambda1(slotsDrawable, this.f$4, i15, chatMessageCell));
                            return;
                        }
                    }
                    RLottieNative[] rLottieNativeArr2 = slotsDrawable.lottieNatives;
                    if (i14 <= 2) {
                        if (rLottieNativeArr[i14] == null) {
                            if (i14 == 0) {
                                int i16 = slotsDrawable.left;
                                if (i16 == 1) {
                                    i3 = 5;
                                } else if (i16 == 2) {
                                    i3 = 6;
                                } else if (i16 == 3) {
                                    i3 = 7;
                                } else {
                                    i3 = i16 == 4 ? 4 : 3;
                                }
                            } else if (i14 == 1) {
                                int i17 = slotsDrawable.center;
                                if (i17 == 1) {
                                    i3 = 11;
                                } else if (i17 == 2) {
                                    i3 = 12;
                                } else if (i17 == 3) {
                                    i3 = 13;
                                } else {
                                    i3 = i17 == 4 ? 10 : 9;
                                }
                            } else {
                                int i18 = slotsDrawable.right;
                                if (i18 == 1) {
                                    i3 = 17;
                                } else if (i18 == 2) {
                                    i3 = 18;
                                } else if (i18 == 3) {
                                    i3 = 19;
                                } else {
                                    i3 = i18 == 4 ? 16 : 15;
                                }
                            }
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f$1;
                            document = tL_messages_stickerSet.documents.get(i3);
                            res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(res)) {
                                AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda3(document, i15, (MessageObject) this.f$3, chatMessageCell, tL_messages_stickerSet, 0));
                                z3 = true;
                            } else {
                                iArr = slotsDrawable.metaData;
                                rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(res, "dice", iArr, null, null);
                                if (i14 <= 2) {
                                    rLottieNativeArr[i14] = rLottieNativeCreateFromRawJson;
                                    slotsDrawable.secondFrameCounts[i14] = iArr[0];
                                } else {
                                    if (i14 == 3) {
                                        c = 0;
                                    } else {
                                        c = 4;
                                    }
                                    rLottieNativeArr2[c] = rLottieNativeCreateFromRawJson;
                                    slotsDrawable.frameCounts[i14 == 3 ? (char) 0 : (char) 4] = iArr[0];
                                }
                            }
                        }
                    } else if (rLottieNativeArr2[i14] == null) {
                        i3 = i14 == 3 ? 1 : 2;
                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f$1;
                        document = tL_messages_stickerSet.documents.get(i3);
                        res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                        if (TextUtils.isEmpty(res)) {
                            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda3(document, i15, (MessageObject) this.f$3, chatMessageCell, tL_messages_stickerSet, 0));
                            z3 = true;
                        } else {
                            iArr = slotsDrawable.metaData;
                            rLottieNativeCreateFromRawJson = RLottieNative.createFromRawJson(res, "dice", iArr, null, null);
                            if (i14 <= 2) {
                                rLottieNativeArr[i14] = rLottieNativeCreateFromRawJson;
                                slotsDrawable.secondFrameCounts[i14] = iArr[0];
                            } else {
                                if (i14 == 3) {
                                    c = 0;
                                } else {
                                    c = 4;
                                }
                                rLottieNativeArr2[c] = rLottieNativeCreateFromRawJson;
                                slotsDrawable.frameCounts[i14 == 3 ? (char) 0 : (char) 4] = iArr[0];
                            }
                        }
                    }
                    i14++;
                }
                break;
            case 4:
                VoIPHelper.lastCallTime = 0L;
                VoIPHelper.joinConference((Activity) this.f$0, this.f$2, (TLRPC.InputGroupCall) this.f$1, this.f$4, (TLRPC.GroupCall) this.f$3, (HashSet) this.f$5);
                return;
            default:
                Uri uri = (Uri) this.f$3;
                final RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
                richEditorListView.getClass();
                InputStream inputStream = null;
                mediaMetadataRetriever = null;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                try {
                    absolutePath = AndroidUtilities.getPath(uri);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    absolutePath = null;
                }
                final boolean z4 = this.f$4;
                final int i19 = this.f$2;
                if (absolutePath == null || !ArticleViewer.IBlock.CC.m(absolutePath)) {
                    Context context = richEditorListView.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                                if (inputStreamOpenInputStream != null) {
                                    String str3 = (String) this.f$1;
                                    if (str3 != null) {
                                        try {
                                            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                                        } catch (Exception e2) {
                                            e = e2;
                                            fileOutputStream = null;
                                            try {
                                                FileLog.e(e);
                                                if (inputStreamOpenInputStream != null) {
                                                    try {
                                                        inputStreamOpenInputStream.close();
                                                        break;
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                                str2 = null;
                                                if (str2 == null) {
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = inputStreamOpenInputStream;
                                                inputStreamOpenInputStream = inputStream;
                                                if (inputStreamOpenInputStream != null) {
                                                    try {
                                                        inputStreamOpenInputStream.close();
                                                        break;
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                                if (fileOutputStream != null) {
                                                    throw th;
                                                }
                                                try {
                                                    fileOutputStream.close();
                                                    throw th;
                                                } catch (Exception unused3) {
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileOutputStream = null;
                                            inputStream = inputStreamOpenInputStream;
                                            inputStreamOpenInputStream = inputStream;
                                            if (inputStreamOpenInputStream != null) {
                                                inputStreamOpenInputStream.close();
                                                break;
                                            }
                                            if (fileOutputStream != null) {
                                                throw th;
                                            }
                                            fileOutputStream.close();
                                            throw th;
                                        }
                                    } else {
                                        extensionFromMimeType = null;
                                    }
                                    if (TextUtils.isEmpty(extensionFromMimeType)) {
                                        extensionFromMimeType = z4 ? "mp4" : "jpg";
                                    }
                                    File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i19) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        AndroidUtilities.copyFile(inputStreamOpenInputStream, fileOutputStream);
                                        absolutePath = file.getAbsolutePath();
                                        try {
                                            inputStreamOpenInputStream.close();
                                            break;
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                            break;
                                        } catch (Exception unused5) {
                                        }
                                        str2 = absolutePath;
                                    } catch (Exception e3) {
                                        e = e3;
                                        FileLog.e(e);
                                        if (inputStreamOpenInputStream != null) {
                                            inputStreamOpenInputStream.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        str2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (inputStreamOpenInputStream != null) {
                                            inputStreamOpenInputStream.close();
                                            break;
                                        }
                                        if (fileOutputStream != null) {
                                            throw th;
                                        }
                                        fileOutputStream.close();
                                        throw th;
                                    }
                                } else if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                            } catch (Exception e4) {
                                e = e4;
                                inputStreamOpenInputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                fileOutputStream = null;
                                inputStreamOpenInputStream = inputStream;
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                    break;
                                }
                                if (fileOutputStream != null) {
                                    throw th;
                                }
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                        break;
                    } catch (Exception unused6) {
                    }
                    str2 = null;
                } else {
                    str2 = absolutePath;
                }
                if (str2 == null && ArticleViewer.IBlock.CC.m(str2)) {
                    if (z4) {
                        try {
                            try {
                                mediaMetadataRetriever = new MediaMetadataRetriever();
                                try {
                                    try {
                                        mediaMetadataRetriever.setDataSource(str2);
                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                        i5 = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 0;
                                        if (strExtractMetadata2 != null) {
                                            try {
                                                i6 = Integer.parseInt(strExtractMetadata2);
                                            } catch (Exception e5) {
                                                e = e5;
                                                i6 = 0;
                                                i4 = i6;
                                                mediaMetadataRetriever2 = mediaMetadataRetriever;
                                                FileLog.e(e);
                                                if (mediaMetadataRetriever2 != null) {
                                                    try {
                                                        mediaMetadataRetriever2.release();
                                                    } catch (Exception unused7) {
                                                        i6 = i4;
                                                        iCeil = 0;
                                                        i7 = iCeil;
                                                    }
                                                    break;
                                                }
                                                i6 = i4;
                                                i7 = 0;
                                                if (!z4) {
                                                    try {
                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                        options.inJustDecodeBounds = true;
                                                        BitmapFactory.decodeFile(str2, options);
                                                        i5 = options.outWidth;
                                                        i6 = options.outHeight;
                                                        break;
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                    }
                                                    try {
                                                        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str2);
                                                        iIntValue = ((Integer) imageOrientation.first).intValue();
                                                        try {
                                                            iIntValue2 = ((Integer) imageOrientation.second).intValue();
                                                            i8 = iIntValue;
                                                            i9 = i5;
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            FileLog.e(e);
                                                            i8 = iIntValue;
                                                            i9 = i5;
                                                            iIntValue2 = 0;
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        iIntValue = 0;
                                                    }
                                                    final int i20 = i6;
                                                    final BlockRow blockRow = (BlockRow) this.f$5;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            RichEditorListView richEditorListView2 = richEditorListView;
                                                            richEditorListView2.getClass();
                                                            boolean z5 = z4;
                                                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i19, 0L, str2, z5 ? i7 : 0, z5, i9, i20, 0L);
                                                            photoEntry.setOrientation(i8, iIntValue2);
                                                            BlockRow blockRow2 = blockRow;
                                                            if (blockRow2 == null || !RichEditorListView.isMedia(blockRow2.block)) {
                                                                richEditorListView2.attachMedia(photoEntry);
                                                            } else {
                                                                richEditorListView2.addMediaToRow(blockRow2, photoEntry);
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                                i9 = i5;
                                                i8 = 0;
                                                iIntValue2 = 0;
                                                final int i21 = i6;
                                                final BlockRow blockRow2 = (BlockRow) this.f$5;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        RichEditorListView richEditorListView2 = richEditorListView;
                                                        richEditorListView2.getClass();
                                                        boolean z5 = z4;
                                                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i19, 0L, str2, z5 ? i7 : 0, z5, i9, i21, 0L);
                                                        photoEntry.setOrientation(i8, iIntValue2);
                                                        BlockRow blockRow3 = blockRow2;
                                                        if (blockRow3 == null || !RichEditorListView.isMedia(blockRow3.block)) {
                                                            richEditorListView2.attachMedia(photoEntry);
                                                        } else {
                                                            richEditorListView2.addMediaToRow(blockRow3, photoEntry);
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else {
                                            i6 = 0;
                                        }
                                        if (strExtractMetadata3 != null) {
                                            try {
                                                iCeil = (int) Math.ceil(Long.parseLong(strExtractMetadata3) / 1000.0d);
                                            } catch (Exception e9) {
                                                e = e9;
                                                i4 = i6;
                                                mediaMetadataRetriever2 = mediaMetadataRetriever;
                                                FileLog.e(e);
                                                if (mediaMetadataRetriever2 != null) {
                                                    mediaMetadataRetriever2.release();
                                                }
                                                i6 = i4;
                                                i7 = 0;
                                            }
                                        } else {
                                            iCeil = 0;
                                        }
                                        try {
                                            mediaMetadataRetriever.release();
                                            break;
                                        } catch (Exception unused8) {
                                        }
                                        i7 = iCeil;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (mediaMetadataRetriever != null) {
                                            try {
                                                mediaMetadataRetriever.release();
                                                break;
                                            } catch (Exception unused9) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    i6 = 0;
                                    i5 = 0;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                i4 = 0;
                                i5 = 0;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                        }
                        break;
                    } else {
                        i6 = 0;
                        i7 = 0;
                        i5 = 0;
                    }
                    if (!z4) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str2, options2);
                        i5 = options2.outWidth;
                        i6 = options2.outHeight;
                        Pair<Integer, Integer> imageOrientation2 = AndroidUtilities.getImageOrientation(str2);
                        iIntValue = ((Integer) imageOrientation2.first).intValue();
                        iIntValue2 = ((Integer) imageOrientation2.second).intValue();
                        i8 = iIntValue;
                        i9 = i5;
                        final int i22 = i6;
                        final BlockRow blockRow3 = (BlockRow) this.f$5;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                RichEditorListView richEditorListView2 = richEditorListView;
                                richEditorListView2.getClass();
                                boolean z5 = z4;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i19, 0L, str2, z5 ? i7 : 0, z5, i9, i22, 0L);
                                photoEntry.setOrientation(i8, iIntValue2);
                                BlockRow blockRow4 = blockRow3;
                                if (blockRow4 == null || !RichEditorListView.isMedia(blockRow4.block)) {
                                    richEditorListView2.attachMedia(photoEntry);
                                } else {
                                    richEditorListView2.addMediaToRow(blockRow4, photoEntry);
                                }
                            }
                        });
                        return;
                    }
                    i9 = i5;
                    i8 = 0;
                    iIntValue2 = 0;
                    final int i23 = i6;
                    final BlockRow blockRow4 = (BlockRow) this.f$5;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            RichEditorListView richEditorListView2 = richEditorListView;
                            richEditorListView2.getClass();
                            boolean z5 = z4;
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i19, 0L, str2, z5 ? i7 : 0, z5, i9, i23, 0L);
                            photoEntry.setOrientation(i8, iIntValue2);
                            BlockRow blockRow5 = blockRow4;
                            if (blockRow5 == null || !RichEditorListView.isMedia(blockRow5.block)) {
                                richEditorListView2.attachMedia(photoEntry);
                            } else {
                                richEditorListView2.addMediaToRow(blockRow5, photoEntry);
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }

    public PhotoPickerActivity$$ExternalSyntheticLambda9(ContactsController contactsController, int i, ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, boolean z) {
        this.f$0 = contactsController;
        this.f$2 = i;
        this.f$1 = arrayList;
        this.f$3 = arrayList2;
        this.f$5 = longSparseArray;
        this.f$4 = z;
    }

    public PhotoPickerActivity$$ExternalSyntheticLambda9(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z) {
        this.f$0 = sendMessagesHelper;
        this.f$3 = tLObject;
        this.f$2 = i;
        this.f$1 = delayedMessage;
        this.f$5 = arrayList;
        this.f$4 = z;
    }

    public PhotoPickerActivity$$ExternalSyntheticLambda9(SlotsDrawable slotsDrawable, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, boolean z) {
        this.f$0 = slotsDrawable;
        this.f$1 = tL_messages_stickerSet;
        this.f$2 = i;
        this.f$3 = messageObject;
        this.f$5 = chatMessageCell;
        this.f$4 = z;
    }

    public PhotoPickerActivity$$ExternalSyntheticLambda9(PhotoPickerActivity photoPickerActivity, String str, int i, TLObject tLObject, boolean z, TLRPC.User user) {
        this.f$0 = photoPickerActivity;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = tLObject;
        this.f$4 = z;
        this.f$5 = user;
    }

    public PhotoPickerActivity$$ExternalSyntheticLambda9(RichEditorListView richEditorListView, Uri uri, boolean z, String str, int i, BlockRow blockRow) {
        this.f$0 = richEditorListView;
        this.f$3 = uri;
        this.f$4 = z;
        this.f$1 = str;
        this.f$2 = i;
        this.f$5 = blockRow;
    }
}
