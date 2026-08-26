package org.telegram.ui.iv;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.SlotsDrawable;
import org.telegram.ui.Components.voip.VoIPHelper;

public final class RichEditorListView$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final Object f$3;
    public final int f$4;
    public final Object f$5;

    public RichEditorListView$$ExternalSyntheticLambda32(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.$r8$classId = 4;
        this.f$0 = activity;
        this.f$4 = i;
        this.f$1 = inputGroupCall;
        this.f$2 = z;
        this.f$3 = groupCall;
        this.f$5 = hashSet;
    }

    @Override
    public final void run() throws Throwable {
        String absolutePath;
        final String str;
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpenInputStream;
        String extensionFromMimeType;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i;
        int i2;
        int i3;
        int iCeil;
        final int i4;
        int iIntValue;
        final int i5;
        final int i6;
        final int iIntValue2;
        switch (this.$r8$classId) {
            case 0:
                Uri uri = (Uri) this.f$1;
                final RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
                richEditorListView.getClass();
                InputStream inputStream = null;
                MediaMetadataRetriever mediaMetadataRetriever2 = null;
                Runnable runnable = null;
                try {
                    absolutePath = AndroidUtilities.getPath(uri);
                } catch (Exception e) {
                    FileLog.e(e);
                    absolutePath = null;
                }
                final boolean z = this.f$2;
                final int i7 = this.f$4;
                if (absolutePath == null || !Theme.ResourcesProvider.CC.m(absolutePath)) {
                    Context context = richEditorListView.getContext();
                    try {
                        if (context != null) {
                            try {
                                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                                if (inputStreamOpenInputStream != null) {
                                    String str2 = (String) this.f$3;
                                    if (str2 != null) {
                                        try {
                                            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
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
                                                str = null;
                                                if (str != null) {
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
                                        extensionFromMimeType = z ? "mp4" : "jpg";
                                    }
                                    File file = new File(FileLoader.getDirectory(4), "rich_external_" + (-i7) + "_" + SharedConfig.getLastLocalId() + "." + extensionFromMimeType);
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
                                        str = absolutePath;
                                    } catch (Exception e3) {
                                        e = e3;
                                        FileLog.e(e);
                                        if (inputStreamOpenInputStream != null) {
                                            inputStreamOpenInputStream.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        str = null;
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
                    str = null;
                } else {
                    str = absolutePath;
                }
                if (str != null || !Theme.ResourcesProvider.CC.m(str)) {
                    return;
                }
                try {
                    if (z) {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                            try {
                                try {
                                    mediaMetadataRetriever.setDataSource(str);
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                    i2 = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 0;
                                    if (strExtractMetadata2 != null) {
                                        try {
                                            i3 = Integer.parseInt(strExtractMetadata2);
                                        } catch (Exception e5) {
                                            e = e5;
                                            i3 = 0;
                                            i = i3;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                                            FileLog.e(e);
                                            if (mediaMetadataRetriever2 != null) {
                                                try {
                                                    mediaMetadataRetriever2.release();
                                                } catch (Exception unused7) {
                                                    i3 = i;
                                                    iCeil = 0;
                                                    i4 = iCeil;
                                                }
                                                break;
                                            }
                                            i3 = i;
                                            i4 = 0;
                                            if (!z) {
                                                try {
                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                    options.inJustDecodeBounds = true;
                                                    BitmapFactory.decodeFile(str, options);
                                                    i2 = options.outWidth;
                                                    i3 = options.outHeight;
                                                    break;
                                                } catch (Exception e6) {
                                                    FileLog.e(e6);
                                                }
                                                try {
                                                    Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
                                                    iIntValue = ((Integer) imageOrientation.first).intValue();
                                                    try {
                                                        iIntValue2 = ((Integer) imageOrientation.second).intValue();
                                                        i5 = iIntValue;
                                                        i6 = i2;
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        FileLog.e(e);
                                                        i5 = iIntValue;
                                                        i6 = i2;
                                                        iIntValue2 = 0;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    iIntValue = 0;
                                                }
                                                final int i8 = i3;
                                                final BlockRow blockRow = (BlockRow) this.f$5;
                                                runnable = new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        RichEditorListView richEditorListView2 = richEditorListView;
                                                        richEditorListView2.getClass();
                                                        boolean z2 = z;
                                                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i7, 0L, str, z2 ? i4 : 0, z2, i6, i8, 0L);
                                                        photoEntry.setOrientation(i5, iIntValue2);
                                                        BlockRow blockRow2 = blockRow;
                                                        if (blockRow2 == null || !RichEditorListView.isMedia(blockRow2.block)) {
                                                            richEditorListView2.attachMedia(photoEntry);
                                                        } else {
                                                            richEditorListView2.addMediaToRow(blockRow2, photoEntry);
                                                        }
                                                    }
                                                };
                                                AndroidUtilities.runOnUIThread(runnable);
                                                return;
                                            }
                                            i6 = i2;
                                            i5 = 0;
                                            iIntValue2 = 0;
                                            final int i9 = i3;
                                            final BlockRow blockRow2 = (BlockRow) this.f$5;
                                            runnable = new Runnable() {
                                                @Override
                                                public final void run() {
                                                    RichEditorListView richEditorListView2 = richEditorListView;
                                                    richEditorListView2.getClass();
                                                    boolean z2 = z;
                                                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i7, 0L, str, z2 ? i4 : 0, z2, i6, i9, 0L);
                                                    photoEntry.setOrientation(i5, iIntValue2);
                                                    BlockRow blockRow3 = blockRow2;
                                                    if (blockRow3 == null || !RichEditorListView.isMedia(blockRow3.block)) {
                                                        richEditorListView2.attachMedia(photoEntry);
                                                    } else {
                                                        richEditorListView2.addMediaToRow(blockRow3, photoEntry);
                                                    }
                                                }
                                            };
                                            AndroidUtilities.runOnUIThread(runnable);
                                            return;
                                        }
                                    } else {
                                        i3 = 0;
                                    }
                                    if (strExtractMetadata3 != null) {
                                        try {
                                            iCeil = (int) Math.ceil(Long.parseLong(strExtractMetadata3) / 1000.0d);
                                        } catch (Exception e9) {
                                            e = e9;
                                            i = i3;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                                            FileLog.e(e);
                                            if (mediaMetadataRetriever2 != null) {
                                                mediaMetadataRetriever2.release();
                                            }
                                            i3 = i;
                                            i4 = 0;
                                        }
                                    } else {
                                        iCeil = 0;
                                    }
                                    try {
                                        mediaMetadataRetriever.release();
                                        break;
                                    } catch (Exception unused8) {
                                    }
                                    i4 = iCeil;
                                } catch (Exception e10) {
                                    e = e10;
                                    i3 = 0;
                                    i2 = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (mediaMetadataRetriever != 0) {
                                    try {
                                        mediaMetadataRetriever.release();
                                        break;
                                    } catch (Exception unused9) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i = 0;
                            i2 = 0;
                        }
                        break;
                    } else {
                        i3 = 0;
                        i4 = 0;
                        i2 = 0;
                    }
                    if (!z) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str, options2);
                        i2 = options2.outWidth;
                        i3 = options2.outHeight;
                        Pair<Integer, Integer> imageOrientation2 = AndroidUtilities.getImageOrientation(str);
                        iIntValue = ((Integer) imageOrientation2.first).intValue();
                        iIntValue2 = ((Integer) imageOrientation2.second).intValue();
                        i5 = iIntValue;
                        i6 = i2;
                        final int i10 = i3;
                        final BlockRow blockRow3 = (BlockRow) this.f$5;
                        runnable = new Runnable() {
                            @Override
                            public final void run() {
                                RichEditorListView richEditorListView2 = richEditorListView;
                                richEditorListView2.getClass();
                                boolean z2 = z;
                                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i7, 0L, str, z2 ? i4 : 0, z2, i6, i10, 0L);
                                photoEntry.setOrientation(i5, iIntValue2);
                                BlockRow blockRow4 = blockRow3;
                                if (blockRow4 == null || !RichEditorListView.isMedia(blockRow4.block)) {
                                    richEditorListView2.attachMedia(photoEntry);
                                } else {
                                    richEditorListView2.addMediaToRow(blockRow4, photoEntry);
                                }
                            }
                        };
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                    i6 = i2;
                    i5 = 0;
                    iIntValue2 = 0;
                    final int i11 = i3;
                    final BlockRow blockRow4 = (BlockRow) this.f$5;
                    runnable = new Runnable() {
                        @Override
                        public final void run() {
                            RichEditorListView richEditorListView2 = richEditorListView;
                            richEditorListView2.getClass();
                            boolean z2 = z;
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i7, 0L, str, z2 ? i4 : 0, z2, i6, i11, 0L);
                            photoEntry.setOrientation(i5, iIntValue2);
                            BlockRow blockRow5 = blockRow4;
                            if (blockRow5 == null || !RichEditorListView.isMedia(blockRow5.block)) {
                                richEditorListView2.attachMedia(photoEntry);
                            } else {
                                richEditorListView2.addMediaToRow(blockRow5, photoEntry);
                            }
                        }
                    };
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    mediaMetadataRetriever = runnable;
                }
                break;
            case 1:
                ((ContactsController) this.f$0).lambda$processLoadedContacts$36(this.f$4, (ArrayList) this.f$1, (ArrayList) this.f$3, (LongSparseArray) this.f$5, this.f$2);
                return;
            case 2:
                ((SendMessagesHelper) this.f$0).lambda$performSendMessageRequestMulti$65((TLObject) this.f$1, this.f$4, (SendMessagesHelper.DelayedMessage) this.f$3, (ArrayList) this.f$5, this.f$2);
                return;
            case 3:
                ((SlotsDrawable) this.f$0).lambda$setDiceNumber$9((TLRPC.TL_messages_stickerSet) this.f$1, this.f$4, (MessageObject) this.f$3, (ChatMessageCell) this.f$5, this.f$2);
                return;
            default:
                VoIPHelper.lastCallTime = 0L;
                VoIPHelper.joinConference((Activity) this.f$0, this.f$4, (TLRPC.InputGroupCall) this.f$1, this.f$2, (TLRPC.GroupCall) this.f$3, (HashSet) this.f$5);
                return;
        }
    }

    public RichEditorListView$$ExternalSyntheticLambda32(Object obj, TLObject tLObject, int i, Object obj2, Object obj3, boolean z, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = tLObject;
        this.f$4 = i;
        this.f$3 = obj2;
        this.f$5 = obj3;
        this.f$2 = z;
    }

    public RichEditorListView$$ExternalSyntheticLambda32(ContactsController contactsController, int i, ArrayList arrayList, ArrayList arrayList2, LongSparseArray longSparseArray, boolean z) {
        this.$r8$classId = 1;
        this.f$0 = contactsController;
        this.f$4 = i;
        this.f$1 = arrayList;
        this.f$3 = arrayList2;
        this.f$5 = longSparseArray;
        this.f$2 = z;
    }

    public RichEditorListView$$ExternalSyntheticLambda32(RichEditorListView richEditorListView, Uri uri, boolean z, String str, int i, BlockRow blockRow) {
        this.$r8$classId = 0;
        this.f$0 = richEditorListView;
        this.f$1 = uri;
        this.f$2 = z;
        this.f$3 = str;
        this.f$4 = i;
        this.f$5 = blockRow;
    }
}
