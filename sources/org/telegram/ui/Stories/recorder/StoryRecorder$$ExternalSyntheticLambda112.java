package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.EmojiThemes$$ExternalSyntheticLambda4;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;

public final class StoryRecorder$$ExternalSyntheticLambda112 implements Runnable {
    public final int $r8$classId;
    public final StoryRecorder f$0;
    public final PaintView f$1;
    public final int f$2;
    public final int f$3;
    public final StoryEntry f$4;
    public final boolean f$5;
    public final boolean f$6;
    public final Runnable f$7;

    public StoryRecorder$$ExternalSyntheticLambda112(StoryRecorder storyRecorder, PaintView paintView, int i, int i2, StoryEntry storyEntry, boolean z, boolean z2, Runnable runnable, int i3) {
        this.$r8$classId = i3;
        this.f$0 = storyRecorder;
        this.f$1 = paintView;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = storyEntry;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$7 = runnable;
    }

    @Override
    public final void run() {
        File fileMakeCacheFile;
        File fileMakeCacheFile2;
        File fileMakeCacheFile3;
        File fileMakeCacheFile4;
        final File file;
        int size;
        int i;
        StoryEntry storyEntry;
        PaintView paintView;
        ImageReceiver photoImage;
        File file2;
        File fileMakeCacheFile5;
        StoryEntry storyEntry2;
        PaintView paintView2;
        int i2;
        File pathToAttach;
        final File file3;
        ImageReceiver photoImage2;
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder storyRecorder = this.f$0;
                storyRecorder.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                PaintView paintView3 = this.f$1;
                StoryEntry storyEntry3 = this.f$4;
                paintView3.getBitmap(arrayList2, false, false, false, false, storyEntry3);
                if (!storyEntry3.isVideo) {
                    storyEntry3.averageDuration = Utilities.clamp(paintView3.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = paintView3.getMasks();
                final ArrayList arrayList3 = masks != null ? new ArrayList(masks) : null;
                boolean z = storyEntry3.isVideo;
                boolean zWouldBeVideo = storyEntry3.wouldBeVideo();
                arrayList2.clear();
                Bitmap bitmap = paintView3.getBitmap(arrayList2, true, false, false, !z, storyEntry3);
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                int i3 = storyRecorder.currentAccount;
                final File fileMakeCacheFile6 = StoryEntry.makeCacheFile(i3, "png");
                arrayList.add(new EmojiThemes$$ExternalSyntheticLambda4(bitmap, fileMakeCacheFile6, 1));
                if (storyEntry3.isRepostMessage) {
                    long j = storyEntry3.backgroundWallpaperPeerId;
                    if (j == Long.MIN_VALUE) {
                        fileMakeCacheFile = null;
                    } else {
                        Drawable backgroundDrawable = storyEntry3.backgroundDrawable;
                        if (backgroundDrawable == null) {
                            backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, i3, j, storyRecorder.isDark);
                        }
                        if (backgroundDrawable != null) {
                            fileMakeCacheFile = StoryEntry.makeCacheFile(i3, "webp");
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f$2, this.f$3, Bitmap.Config.ARGB_8888);
                            StoryEntry.drawBackgroundDrawable(new Canvas(bitmapCreateBitmap), backgroundDrawable, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                            arrayList.add(new EmojiThemes$$ExternalSyntheticLambda4(bitmapCreateBitmap, fileMakeCacheFile, 2));
                        } else {
                            fileMakeCacheFile = null;
                        }
                    }
                } else {
                    fileMakeCacheFile = null;
                }
                if (storyEntry3.isRepostMessage && storyEntry3.isVideo) {
                    int i4 = storyEntry3.width;
                    int i5 = storyEntry3.height;
                    MessageEntityView messageEntityViewFindMessageView = paintView3.findMessageView();
                    if (messageEntityViewFindMessageView != null) {
                        MessageEntityView.AnonymousClass2 anonymousClass2 = messageEntityViewFindMessageView.listView;
                        if (anonymousClass2.getChildCount() == 1 && i4 > 0 && i5 > 0) {
                            photoImage = anonymousClass2.getChildAt(0) instanceof ChatMessageCell ? ((ChatMessageCell) anonymousClass2.getChildAt(0)).getPhotoImage() : null;
                        }
                    }
                    if (photoImage == null || ((int) photoImage.getImageWidth()) <= 0 || ((int) photoImage.getImageHeight()) <= 0) {
                        fileMakeCacheFile2 = null;
                    } else {
                        float f = i4;
                        float f2 = i5;
                        float fMax = Math.max(photoImage.getImageWidth() / f, photoImage.getImageHeight() / f2);
                        int i6 = (int) ((f * fMax) / 2.0f);
                        int i7 = (int) ((f2 * fMax) / 2.0f);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                        float[] fArr = new float[8];
                        int i8 = 0;
                        while (i8 < photoImage.getRoundRadius().length) {
                            int i9 = i8 * 2;
                            int i10 = i8;
                            fArr[i9] = photoImage.getRoundRadius()[i10];
                            fArr[i9 + 1] = photoImage.getRoundRadius()[i10];
                            i8 = i10 + 1;
                        }
                        Canvas canvas = new Canvas(bitmapCreateBitmap2);
                        Path path = new Path();
                        canvas.scale(0.5f, 0.5f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f3 = (i6 * 2.0f) / 2.0f;
                        float f4 = (i7 * 2.0f) / 2.0f;
                        rectF.set(f3 - (photoImage.getImageWidth() / 2.0f), f4 - (photoImage.getImageHeight() / 2.0f), (photoImage.getImageWidth() / 2.0f) + f3, (photoImage.getImageHeight() / 2.0f) + f4);
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        Paint paint = new Paint(1);
                        paint.setColor(-1);
                        canvas.drawPath(path, paint);
                        fileMakeCacheFile2 = StoryEntry.makeCacheFile(i3, "webp");
                        arrayList.add(new EmojiThemes$$ExternalSyntheticLambda4(bitmapCreateBitmap2, fileMakeCacheFile2, 3));
                    }
                } else {
                    fileMakeCacheFile2 = null;
                }
                if (paintView3.hasChanges()) {
                    if (zWouldBeVideo) {
                        storyEntry = storyEntry3;
                        paintView = paintView3;
                        fileMakeCacheFile3 = null;
                    } else {
                        paintView = paintView3;
                        Bitmap bitmap2 = paintView.getBitmap(new ArrayList(), false, true, false, false, storyEntry3);
                        storyEntry = storyEntry3;
                        fileMakeCacheFile3 = StoryEntry.makeCacheFile(i3, "png");
                        arrayList.add(new EmojiThemes$$ExternalSyntheticLambda4(bitmap2, fileMakeCacheFile3, 4));
                    }
                    if (this.f$5) {
                        Bitmap blurBitmap = paintView.getBlurBitmap();
                        fileMakeCacheFile4 = StoryEntry.makeCacheFile(i3, "png");
                        arrayList.add(new EmojiThemes$$ExternalSyntheticLambda4(blurBitmap, fileMakeCacheFile4, 5));
                        storyEntry3 = storyEntry;
                    } else {
                        storyEntry3 = storyEntry;
                        file = null;
                    }
                    final Theme$$ExternalSyntheticLambda19 theme$$ExternalSyntheticLambda19 = (Theme$$ExternalSyntheticLambda19) this.f$7;
                    final boolean z2 = this.f$6;
                    final int i11 = 1;
                    final File file4 = fileMakeCacheFile2;
                    final StoryEntry storyEntry4 = storyEntry3;
                    final File file5 = fileMakeCacheFile;
                    final ArrayList arrayList4 = arrayList2;
                    final File file6 = fileMakeCacheFile3;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    StoryEntry storyEntry5 = storyEntry4;
                                    try {
                                        File file7 = storyEntry5.paintFile;
                                        if (file7 != null) {
                                            file7.delete();
                                        }
                                        break;
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file8 = storyEntry5.paintEntitiesFile;
                                        if (file8 != null) {
                                            file8.delete();
                                        }
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        File file9 = storyEntry5.paintBlurFile;
                                        if (file9 != null) {
                                            file9.delete();
                                        }
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    storyEntry5.paintFile = null;
                                    storyEntry5.paintEntitiesFile = null;
                                    storyEntry5.paintBlurFile = null;
                                    File file10 = storyEntry5.backgroundFile;
                                    if (file10 != null) {
                                        try {
                                            file10.delete();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        storyEntry5.backgroundFile = null;
                                    }
                                    File file11 = storyEntry5.messageVideoMaskFile;
                                    if (file11 != null) {
                                        try {
                                            file11.delete();
                                        } catch (Exception e2) {
                                            FileLog.e(e2);
                                        }
                                        storyEntry5.messageVideoMaskFile = null;
                                    }
                                    storyEntry5.editedMedia |= z2;
                                    storyEntry5.mediaEntities = arrayList4;
                                    storyEntry5.paintFile = fileMakeCacheFile6;
                                    storyEntry5.backgroundFile = file5;
                                    storyEntry5.paintEntitiesFile = file6;
                                    storyEntry5.messageVideoMaskFile = file4;
                                    storyEntry5.paintBlurFile = file;
                                    storyEntry5.stickers = arrayList3;
                                    ((StoryRecorder$$ExternalSyntheticLambda5) theme$$ExternalSyntheticLambda19).run();
                                    break;
                                default:
                                    StoryEntry storyEntry6 = storyEntry4;
                                    try {
                                        File file12 = storyEntry6.paintFile;
                                        if (file12 != null) {
                                            file12.delete();
                                        }
                                        break;
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        File file13 = storyEntry6.paintEntitiesFile;
                                        if (file13 != null) {
                                            file13.delete();
                                        }
                                        break;
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        File file14 = storyEntry6.paintBlurFile;
                                        if (file14 != null) {
                                            file14.delete();
                                        }
                                        break;
                                    } catch (Exception unused6) {
                                    }
                                    storyEntry6.paintFile = null;
                                    storyEntry6.paintEntitiesFile = null;
                                    storyEntry6.paintBlurFile = null;
                                    File file15 = storyEntry6.backgroundFile;
                                    if (file15 != null) {
                                        try {
                                            file15.delete();
                                        } catch (Exception e3) {
                                            FileLog.e(e3);
                                        }
                                        storyEntry6.backgroundFile = null;
                                    }
                                    File file16 = storyEntry6.messageVideoMaskFile;
                                    if (file16 != null) {
                                        try {
                                            file16.delete();
                                        } catch (Exception e4) {
                                            FileLog.e(e4);
                                        }
                                        storyEntry6.messageVideoMaskFile = null;
                                    }
                                    storyEntry6.editedMedia |= z2;
                                    storyEntry6.mediaEntities = arrayList4;
                                    storyEntry6.paintFile = fileMakeCacheFile6;
                                    storyEntry6.backgroundFile = file5;
                                    storyEntry6.paintEntitiesFile = file6;
                                    storyEntry6.messageVideoMaskFile = file4;
                                    storyEntry6.paintBlurFile = file;
                                    storyEntry6.stickers = arrayList3;
                                    ((Theme$$ExternalSyntheticLambda19) theme$$ExternalSyntheticLambda19).run();
                                    break;
                            }
                        }
                    });
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                fileMakeCacheFile3 = storyEntry3.paintEntitiesFile;
                fileMakeCacheFile4 = storyEntry3.paintBlurFile;
                file = fileMakeCacheFile4;
                final Runnable theme$$ExternalSyntheticLambda110 = (Theme$$ExternalSyntheticLambda19) this.f$7;
                final boolean z3 = this.f$6;
                final int i12 = 1;
                final File file7 = fileMakeCacheFile2;
                final StoryEntry storyEntry5 = storyEntry3;
                final File file8 = fileMakeCacheFile;
                final ArrayList arrayList5 = arrayList2;
                final File file9 = fileMakeCacheFile3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                StoryEntry storyEntry6 = storyEntry5;
                                try {
                                    File file10 = storyEntry6.paintFile;
                                    if (file10 != null) {
                                        file10.delete();
                                    }
                                    break;
                                } catch (Exception unused) {
                                }
                                try {
                                    File file11 = storyEntry6.paintEntitiesFile;
                                    if (file11 != null) {
                                        file11.delete();
                                    }
                                    break;
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file12 = storyEntry6.paintBlurFile;
                                    if (file12 != null) {
                                        file12.delete();
                                    }
                                    break;
                                } catch (Exception unused3) {
                                }
                                storyEntry6.paintFile = null;
                                storyEntry6.paintEntitiesFile = null;
                                storyEntry6.paintBlurFile = null;
                                File file13 = storyEntry6.backgroundFile;
                                if (file13 != null) {
                                    try {
                                        file13.delete();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    storyEntry6.backgroundFile = null;
                                }
                                File file14 = storyEntry6.messageVideoMaskFile;
                                if (file14 != null) {
                                    try {
                                        file14.delete();
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                    }
                                    storyEntry6.messageVideoMaskFile = null;
                                }
                                storyEntry6.editedMedia |= z3;
                                storyEntry6.mediaEntities = arrayList5;
                                storyEntry6.paintFile = fileMakeCacheFile6;
                                storyEntry6.backgroundFile = file8;
                                storyEntry6.paintEntitiesFile = file9;
                                storyEntry6.messageVideoMaskFile = file7;
                                storyEntry6.paintBlurFile = file;
                                storyEntry6.stickers = arrayList3;
                                ((StoryRecorder$$ExternalSyntheticLambda5) theme$$ExternalSyntheticLambda110).run();
                                break;
                            default:
                                StoryEntry storyEntry7 = storyEntry5;
                                try {
                                    File file15 = storyEntry7.paintFile;
                                    if (file15 != null) {
                                        file15.delete();
                                    }
                                    break;
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file16 = storyEntry7.paintEntitiesFile;
                                    if (file16 != null) {
                                        file16.delete();
                                    }
                                    break;
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file17 = storyEntry7.paintBlurFile;
                                    if (file17 != null) {
                                        file17.delete();
                                    }
                                    break;
                                } catch (Exception unused6) {
                                }
                                storyEntry7.paintFile = null;
                                storyEntry7.paintEntitiesFile = null;
                                storyEntry7.paintBlurFile = null;
                                File file18 = storyEntry7.backgroundFile;
                                if (file18 != null) {
                                    try {
                                        file18.delete();
                                    } catch (Exception e3) {
                                        FileLog.e(e3);
                                    }
                                    storyEntry7.backgroundFile = null;
                                }
                                File file19 = storyEntry7.messageVideoMaskFile;
                                if (file19 != null) {
                                    try {
                                        file19.delete();
                                    } catch (Exception e4) {
                                        FileLog.e(e4);
                                    }
                                    storyEntry7.messageVideoMaskFile = null;
                                }
                                storyEntry7.editedMedia |= z3;
                                storyEntry7.mediaEntities = arrayList5;
                                storyEntry7.paintFile = fileMakeCacheFile6;
                                storyEntry7.backgroundFile = file8;
                                storyEntry7.paintEntitiesFile = file9;
                                storyEntry7.messageVideoMaskFile = file7;
                                storyEntry7.paintBlurFile = file;
                                storyEntry7.stickers = arrayList3;
                                ((Theme$$ExternalSyntheticLambda19) theme$$ExternalSyntheticLambda110).run();
                                break;
                        }
                    }
                });
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Runnable) obj2).run();
                }
                return;
            default:
                StoryRecorder storyRecorder2 = this.f$0;
                storyRecorder2.getClass();
                ArrayList arrayList6 = new ArrayList();
                PaintView paintView4 = this.f$1;
                StoryEntry storyEntry6 = this.f$4;
                paintView4.getBitmap(arrayList6, false, false, false, false, storyEntry6);
                if (!storyEntry6.isVideo) {
                    storyEntry6.averageDuration = Utilities.clamp(paintView4.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = paintView4.getMasks();
                final ArrayList arrayList7 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z4 = storyEntry6.isVideo;
                boolean zWouldBeVideo2 = storyEntry6.wouldBeVideo();
                arrayList6.clear();
                Bitmap bitmap3 = paintView4.getBitmap(arrayList6, true, false, false, !z4, storyEntry6);
                if (arrayList6.isEmpty()) {
                    arrayList6 = null;
                }
                int i13 = storyRecorder2.currentAccount;
                final File pathToAttach2 = FileLoader.getInstance(i13).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap3, Bitmap.CompressFormat.PNG, storyEntry6.resultWidth, storyEntry6.resultHeight, 87, false, 101, 101), true);
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    bitmap3.recycle();
                }
                boolean z5 = storyEntry6.isRepostMessage;
                int i14 = this.f$2;
                int i15 = this.f$3;
                if (z5) {
                    long j2 = storyEntry6.backgroundWallpaperPeerId;
                    if (j2 == Long.MIN_VALUE) {
                        file2 = null;
                    } else {
                        Drawable backgroundDrawable2 = storyEntry6.backgroundDrawable;
                        if (backgroundDrawable2 == null) {
                            backgroundDrawable2 = PreviewView.getBackgroundDrawable((Drawable) null, i13, j2, storyRecorder2.isDark);
                        }
                        if (backgroundDrawable2 != null) {
                            File fileMakeCacheFile7 = StoryEntry.makeCacheFile(i13, "webp");
                            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                            StoryEntry.drawBackgroundDrawable(new Canvas(bitmapCreateBitmap3), backgroundDrawable2, bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight());
                            try {
                                try {
                                    bitmapCreateBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile7));
                                    if (!bitmapCreateBitmap3.isRecycled()) {
                                        bitmapCreateBitmap3.recycle();
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    if (!bitmapCreateBitmap3.isRecycled()) {
                                        bitmapCreateBitmap3.recycle();
                                    }
                                }
                                file2 = fileMakeCacheFile7;
                            } catch (Throwable th) {
                                if (!bitmapCreateBitmap3.isRecycled()) {
                                    bitmapCreateBitmap3.recycle();
                                }
                                throw th;
                            }
                        } else {
                            file2 = null;
                        }
                    }
                    break;
                } else {
                    file2 = null;
                }
                if (storyEntry6.isRepostMessage && storyEntry6.isVideo) {
                    int i16 = storyEntry6.width;
                    int i17 = storyEntry6.height;
                    MessageEntityView messageEntityViewFindMessageView2 = paintView4.findMessageView();
                    if (messageEntityViewFindMessageView2 != null) {
                        MessageEntityView.AnonymousClass2 anonymousClass3 = messageEntityViewFindMessageView2.listView;
                        if (anonymousClass3.getChildCount() == 1 && i16 > 0 && i17 > 0) {
                            photoImage2 = anonymousClass3.getChildAt(0) instanceof ChatMessageCell ? ((ChatMessageCell) anonymousClass3.getChildAt(0)).getPhotoImage() : null;
                        }
                    }
                    if (photoImage2 == null || ((int) photoImage2.getImageWidth()) <= 0 || ((int) photoImage2.getImageHeight()) <= 0) {
                        fileMakeCacheFile5 = null;
                    } else {
                        float f5 = i16;
                        float f6 = i17;
                        float fMax2 = Math.max(photoImage2.getImageWidth() / f5, photoImage2.getImageHeight() / f6);
                        int i18 = (int) ((f5 * fMax2) / 2.0f);
                        int i19 = (int) ((f6 * fMax2) / 2.0f);
                        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(i18, i19, Bitmap.Config.ARGB_8888);
                        float[] fArr2 = new float[8];
                        int i20 = 0;
                        while (i20 < photoImage2.getRoundRadius().length) {
                            int i21 = i20 * 2;
                            int i22 = i20;
                            fArr2[i21] = photoImage2.getRoundRadius()[i22];
                            fArr2[i21 + 1] = photoImage2.getRoundRadius()[i22];
                            i20 = i22 + 1;
                        }
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap4);
                        Path path2 = new Path();
                        canvas2.scale(0.5f, 0.5f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f7 = (i18 * 2.0f) / 2.0f;
                        float f8 = (i19 * 2.0f) / 2.0f;
                        rectF2.set(f7 - (photoImage2.getImageWidth() / 2.0f), f8 - (photoImage2.getImageHeight() / 2.0f), (photoImage2.getImageWidth() / 2.0f) + f7, (photoImage2.getImageHeight() / 2.0f) + f8);
                        path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                        Paint paint2 = new Paint(1);
                        paint2.setColor(-1);
                        canvas2.drawPath(path2, paint2);
                        try {
                            fileMakeCacheFile5 = StoryEntry.makeCacheFile(i13, "webp");
                            bitmapCreateBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile5));
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            fileMakeCacheFile5 = null;
                        }
                        bitmapCreateBitmap4.recycle();
                    }
                    break;
                } else {
                    fileMakeCacheFile5 = null;
                }
                if (zWouldBeVideo2) {
                    storyEntry2 = storyEntry6;
                    paintView2 = paintView4;
                    i2 = i15;
                    pathToAttach = null;
                } else {
                    paintView2 = paintView4;
                    i2 = i15;
                    Bitmap bitmap4 = paintView2.getBitmap(new ArrayList(), false, true, false, false, storyEntry6);
                    pathToAttach = FileLoader.getInstance(i13).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap4, Bitmap.CompressFormat.PNG, i14, i2, 87, false, 101, 101), true);
                    if (bitmap4 != null && !bitmap4.isRecycled()) {
                        storyEntry2 = storyEntry6;
                        bitmap4.recycle();
                    }
                }
                storyEntry2 = storyEntry6;
                storyEntry2 = storyEntry6;
                if (this.f$5) {
                    Bitmap blurBitmap2 = paintView2.getBlurBitmap();
                    File pathToAttach3 = FileLoader.getInstance(i13).getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap2, Bitmap.CompressFormat.PNG, i14, i2, 87, false, 101, 101), true);
                    if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                        blurBitmap2.recycle();
                    }
                    file3 = pathToAttach3;
                } else {
                    file3 = null;
                }
                final StoryEntry storyEntry7 = storyEntry2;
                final StoryRecorder$$ExternalSyntheticLambda5 storyRecorder$$ExternalSyntheticLambda5 = (StoryRecorder$$ExternalSyntheticLambda5) this.f$7;
                final boolean z6 = this.f$6;
                final int i23 = 0;
                final File file10 = fileMakeCacheFile5;
                final File file11 = file2;
                final ArrayList arrayList8 = arrayList6;
                final File file12 = pathToAttach;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i23) {
                            case 0:
                                StoryEntry storyEntry8 = storyEntry7;
                                try {
                                    File file13 = storyEntry8.paintFile;
                                    if (file13 != null) {
                                        file13.delete();
                                    }
                                    break;
                                } catch (Exception unused) {
                                }
                                try {
                                    File file14 = storyEntry8.paintEntitiesFile;
                                    if (file14 != null) {
                                        file14.delete();
                                    }
                                    break;
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file15 = storyEntry8.paintBlurFile;
                                    if (file15 != null) {
                                        file15.delete();
                                    }
                                    break;
                                } catch (Exception unused3) {
                                }
                                storyEntry8.paintFile = null;
                                storyEntry8.paintEntitiesFile = null;
                                storyEntry8.paintBlurFile = null;
                                File file16 = storyEntry8.backgroundFile;
                                if (file16 != null) {
                                    try {
                                        file16.delete();
                                    } catch (Exception e3) {
                                        FileLog.e(e3);
                                    }
                                    storyEntry8.backgroundFile = null;
                                }
                                File file17 = storyEntry8.messageVideoMaskFile;
                                if (file17 != null) {
                                    try {
                                        file17.delete();
                                    } catch (Exception e4) {
                                        FileLog.e(e4);
                                    }
                                    storyEntry8.messageVideoMaskFile = null;
                                }
                                storyEntry8.editedMedia |= z6;
                                storyEntry8.mediaEntities = arrayList8;
                                storyEntry8.paintFile = pathToAttach2;
                                storyEntry8.backgroundFile = file11;
                                storyEntry8.paintEntitiesFile = file12;
                                storyEntry8.messageVideoMaskFile = file10;
                                storyEntry8.paintBlurFile = file3;
                                storyEntry8.stickers = arrayList7;
                                ((StoryRecorder$$ExternalSyntheticLambda5) storyRecorder$$ExternalSyntheticLambda5).run();
                                break;
                            default:
                                StoryEntry storyEntry9 = storyEntry7;
                                try {
                                    File file18 = storyEntry9.paintFile;
                                    if (file18 != null) {
                                        file18.delete();
                                    }
                                    break;
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file19 = storyEntry9.paintEntitiesFile;
                                    if (file19 != null) {
                                        file19.delete();
                                    }
                                    break;
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file110 = storyEntry9.paintBlurFile;
                                    if (file110 != null) {
                                        file110.delete();
                                    }
                                    break;
                                } catch (Exception unused6) {
                                }
                                storyEntry9.paintFile = null;
                                storyEntry9.paintEntitiesFile = null;
                                storyEntry9.paintBlurFile = null;
                                File file111 = storyEntry9.backgroundFile;
                                if (file111 != null) {
                                    try {
                                        file111.delete();
                                    } catch (Exception e5) {
                                        FileLog.e(e5);
                                    }
                                    storyEntry9.backgroundFile = null;
                                }
                                File file112 = storyEntry9.messageVideoMaskFile;
                                if (file112 != null) {
                                    try {
                                        file112.delete();
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    storyEntry9.messageVideoMaskFile = null;
                                }
                                storyEntry9.editedMedia |= z6;
                                storyEntry9.mediaEntities = arrayList8;
                                storyEntry9.paintFile = pathToAttach2;
                                storyEntry9.backgroundFile = file11;
                                storyEntry9.paintEntitiesFile = file12;
                                storyEntry9.messageVideoMaskFile = file10;
                                storyEntry9.paintBlurFile = file3;
                                storyEntry9.stickers = arrayList7;
                                ((Theme$$ExternalSyntheticLambda19) storyRecorder$$ExternalSyntheticLambda5).run();
                                break;
                        }
                    }
                });
                return;
        }
    }
}
