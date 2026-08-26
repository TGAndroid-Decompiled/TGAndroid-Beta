package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

public final class RichMediaUploader$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final RichMediaUploader f$0;

    public RichMediaUploader$$ExternalSyntheticLambda1(RichMediaUploader richMediaUploader, int i) {
        this.$r8$classId = i;
        this.f$0 = richMediaUploader;
    }

    @Override
    public final void run() {
        Bitmap bitmapLoadBitmap;
        TLRPC.PhotoSize photoSizeScaleAndSaveImage;
        File pathToAttach;
        TLRPC.DocumentAttribute documentAttribute;
        switch (this.$r8$classId) {
            case 0:
                RichMediaUploader richMediaUploader = this.f$0;
                TLRPC.Document document = richMediaUploader.audioDocument;
                String absolutePath = null;
                if (document != null) {
                    String str = richMediaUploader.path;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            String str2 = document.mime_type;
                            String lowerCase = str2 == null ? "" : str2.toLowerCase();
                            bitmapLoadBitmap = lowerCase.startsWith("image/") ? ImageLoader.loadBitmap(str, null, 320.0f, 320.0f, true) : lowerCase.equals("video/mp4") ? SendMessagesHelper.createVideoThumbnail(str, 1) : null;
                            if (bitmapLoadBitmap != null) {
                                try {
                                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                                    int size = arrayList.size();
                                    int i = 0;
                                    do {
                                        if (i < size) {
                                            documentAttribute = arrayList.get(i);
                                            i++;
                                        } else {
                                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                            tL_documentAttributeImageSize.w = bitmapLoadBitmap.getWidth();
                                            tL_documentAttributeImageSize.h = bitmapLoadBitmap.getHeight();
                                            document.attributes.add(tL_documentAttributeImageSize);
                                        }
                                        photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 320.0f, 320.0f, 80, false);
                                        if (photoSizeScaleAndSaveImage == null) {
                                            document.thumbs.clear();
                                            document.thumbs.add(photoSizeScaleAndSaveImage);
                                            document.flags |= 1;
                                            pathToAttach = FileLoader.getInstance(richMediaUploader.currentAccount).getPathToAttach(photoSizeScaleAndSaveImage, true);
                                            if (pathToAttach != null && pathToAttach.exists()) {
                                                absolutePath = pathToAttach.getAbsolutePath();
                                            }
                                            if (!bitmapLoadBitmap.isRecycled()) {
                                                bitmapLoadBitmap.recycle();
                                            }
                                        } else if (!bitmapLoadBitmap.isRecycled()) {
                                            bitmapLoadBitmap.recycle();
                                        }
                                        break;
                                    } while (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize));
                                    photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 320.0f, 320.0f, 80, false);
                                    if (photoSizeScaleAndSaveImage == null) {
                                        document.thumbs.clear();
                                        document.thumbs.add(photoSizeScaleAndSaveImage);
                                        document.flags |= 1;
                                        pathToAttach = FileLoader.getInstance(richMediaUploader.currentAccount).getPathToAttach(photoSizeScaleAndSaveImage, true);
                                        if (pathToAttach != null) {
                                            absolutePath = pathToAttach.getAbsolutePath();
                                        }
                                        if (!bitmapLoadBitmap.isRecycled()) {
                                            bitmapLoadBitmap.recycle();
                                        }
                                    } else if (!bitmapLoadBitmap.isRecycled()) {
                                        bitmapLoadBitmap.recycle();
                                    }
                                } catch (Throwable unused) {
                                    if (bitmapLoadBitmap != null && !bitmapLoadBitmap.isRecycled()) {
                                    }
                                    richMediaUploader.documentThumbPath = absolutePath;
                                    AndroidUtilities.runOnUIThread(new RichMediaUploader$$ExternalSyntheticLambda1(richMediaUploader, 2));
                                    return;
                                }
                            } else if (bitmapLoadBitmap != null && !bitmapLoadBitmap.isRecycled()) {
                                bitmapLoadBitmap.recycle();
                            }
                        } catch (Throwable unused2) {
                            bitmapLoadBitmap = null;
                        }
                    }
                    break;
                }
                richMediaUploader.documentThumbPath = absolutePath;
                AndroidUtilities.runOnUIThread(new RichMediaUploader$$ExternalSyntheticLambda1(richMediaUploader, 2));
                return;
            case 1:
                RichMediaUploader richMediaUploader2 = this.f$0;
                String absolutePath2 = richMediaUploader2.path;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath2, options);
                    String str3 = options.outMimeType;
                    boolean z = str3 != null && (str3.equalsIgnoreCase("image/jpeg") || str3.equalsIgnoreCase("image/jpg"));
                    float photoSize = AndroidUtilities.getPhotoSize();
                    Bitmap bitmapLoadBitmap2 = ImageLoader.loadBitmap(absolutePath2, null, photoSize, photoSize, true);
                    if (bitmapLoadBitmap2 == null) {
                        bitmapLoadBitmap2 = ImageLoader.loadBitmap(absolutePath2, null, 800.0f, 800.0f, true);
                    }
                    if (bitmapLoadBitmap2 != null) {
                        File file = new File(FileLoader.getDirectory(4), "rich_jpeg_" + Math.abs(absolutePath2.hashCode()) + ".jpg");
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                boolean zCompress = bitmapLoadBitmap2.compress(Bitmap.CompressFormat.JPEG, 89, fileOutputStream);
                                fileOutputStream.close();
                                bitmapLoadBitmap2.recycle();
                                if (zCompress && file.length() > 0) {
                                    if (z) {
                                        long length = new File(absolutePath2).length();
                                        if (length <= 0 || file.length() < length) {
                                            absolutePath2 = file.getAbsolutePath();
                                        }
                                    } else {
                                        absolutePath2 = file.getAbsolutePath();
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            bitmapLoadBitmap2.recycle();
                            throw th3;
                        }
                    }
                } catch (Throwable unused3) {
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(17, richMediaUploader2, absolutePath2));
                return;
            default:
                RichMediaUploader richMediaUploader3 = this.f$0;
                if (richMediaUploader3.cancelled || richMediaUploader3.finished) {
                    return;
                }
                richMediaUploader3.beginUpload(richMediaUploader3.path);
                return;
        }
    }
}
