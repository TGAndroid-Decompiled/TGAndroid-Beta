package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.Choreographer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Stories.recorder.Weather;

public final class PhotoViewer$$ExternalSyntheticLambda91 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;

    public PhotoViewer$$ExternalSyntheticLambda91(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
    }

    @Override
    public final void run(Object obj) {
        StickerMakerView.SegmentedObject[] segmentedObjectArr;
        Bitmap bitmapCutSegmentInFilteredBitmap;
        Bitmap bitmap;
        float f;
        float f2;
        float fSqrt;
        float f3;
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                boolean z = this.f$1;
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.f$2;
                StickerMakerView.SegmentedObject segmentedObject = (StickerMakerView.SegmentedObject) obj;
                StickerMakerView stickerMakerView = photoViewer.stickerMakerView;
                if (!stickerMakerView.segmentingLoaded || (segmentedObjectArr = stickerMakerView.objects) == null || segmentedObjectArr.length <= 0) {
                    photoViewer.cutOutBtn.setCutOutState(true);
                    photoViewer.showEditStickerMode(false, true);
                } else {
                    ThanosEffect thanosEffect = photoViewer.stickerMakerView.getThanosEffect();
                    StickerMakerView stickerMakerView2 = photoViewer.stickerMakerView;
                    stickerMakerView2.isSegmentedState = true;
                    stickerMakerView2.selectedObject = segmentedObject;
                    Bitmap bitmap2 = photoViewer.centerImage.getBitmap();
                    photoViewer.centerImage.getOrientation();
                    StickerMakerView.SegmentedObject segmentedObject2 = stickerMakerView2.selectedObject;
                    if (segmentedObject2 == null) {
                        bitmapCutSegmentInFilteredBitmap = stickerMakerView2.sourceBitmap;
                    } else if (!z || bitmap2 == null) {
                        bitmapCutSegmentInFilteredBitmap = segmentedObject2.overrideImage;
                        if (bitmapCutSegmentInFilteredBitmap == null) {
                            bitmapCutSegmentInFilteredBitmap = segmentedObject2.image;
                        }
                    } else {
                        bitmapCutSegmentInFilteredBitmap = stickerMakerView2.cutSegmentInFilteredBitmap(bitmap2);
                    }
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer.imagesArrLocals.get(photoViewer.currentIndex);
                    if (thanosEffect == null) {
                        Utilities.themeQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda163(photoViewer, bitmapCutSegmentInFilteredBitmap, 0));
                        photoViewer.stickerMakerView.disableClippingMode();
                        photoViewer.containerView.invalidate();
                    } else {
                        StickerMakerView stickerMakerView3 = photoViewer.stickerMakerView;
                        photoViewer.centerImage.getOrientation();
                        stickerMakerView3.getClass();
                        String str = photoEntry.filterPath;
                        Bitmap bitmapDecodeFile = str != null ? BitmapFactory.decodeFile(str) : stickerMakerView3.getSourceBitmap();
                        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(photoEntry.paintPath);
                        int width = bitmapDecodeFile.getWidth();
                        int height = bitmapDecodeFile.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        Paint paint2 = new Paint(3);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint2);
                        Rect rect = new Rect();
                        float f4 = 0.0f;
                        rect.set(0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        StickerMakerView.SegmentedObject segmentedObject3 = stickerMakerView3.selectedObject;
                        if (segmentedObject3 == null) {
                            StickerMakerView.SegmentedObject[] segmentedObjectArr2 = stickerMakerView3.objects;
                            if (segmentedObjectArr2.length > 0) {
                                segmentedObject3 = segmentedObjectArr2[0];
                            }
                        }
                        if (segmentedObject3 == null) {
                            bitmapCreateBitmap = null;
                            f = 2.0f;
                        } else {
                            if (segmentedObject3.orientation == 0 || !photoEntry.isFiltered) {
                                bitmap = bitmapDecodeFile;
                                f = 2.0f;
                                Bitmap bitmap3 = segmentedObject3.overrideDarkMaskImage;
                                if (bitmap3 == null) {
                                    bitmap3 = segmentedObject3.darkMaskImage;
                                }
                                canvas.drawBitmap(bitmap3, (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f = 2.0f;
                                float f5 = segmentedObject3.orientation;
                                Bitmap bitmap4 = segmentedObject3.overrideDarkMaskImage;
                                if (bitmap4 == null) {
                                    bitmap4 = segmentedObject3.darkMaskImage;
                                }
                                float width2 = bitmap4.getWidth() / 2.0f;
                                bitmap = bitmapDecodeFile;
                                Bitmap bitmap5 = segmentedObject3.overrideDarkMaskImage;
                                if (bitmap5 == null) {
                                    bitmap5 = segmentedObject3.darkMaskImage;
                                }
                                matrix.postRotate(f5, width2, bitmap5.getHeight() / 2.0f);
                                if ((segmentedObject3.orientation / 90) % 2 != 0) {
                                    Bitmap bitmap6 = segmentedObject3.overrideDarkMaskImage;
                                    if (bitmap6 == null) {
                                        bitmap6 = segmentedObject3.darkMaskImage;
                                    }
                                    int height2 = bitmap6.getHeight();
                                    Bitmap bitmap7 = segmentedObject3.overrideDarkMaskImage;
                                    if (bitmap7 == null) {
                                        bitmap7 = segmentedObject3.darkMaskImage;
                                    }
                                    float width3 = (height2 - bitmap7.getWidth()) / 2.0f;
                                    matrix.postTranslate(width3, -width3);
                                }
                                float width4 = bitmap.getWidth();
                                Bitmap bitmap8 = segmentedObject3.overrideDarkMaskImage;
                                if (bitmap8 == null) {
                                    bitmap8 = segmentedObject3.darkMaskImage;
                                }
                                float height3 = width4 / bitmap8.getHeight();
                                float height4 = bitmap.getHeight();
                                Bitmap bitmap9 = segmentedObject3.overrideDarkMaskImage;
                                if (bitmap9 == null) {
                                    bitmap9 = segmentedObject3.darkMaskImage;
                                }
                                matrix.postScale(height3, height4 / bitmap9.getWidth());
                                Bitmap bitmap10 = segmentedObject3.overrideDarkMaskImage;
                                if (bitmap10 == null) {
                                    bitmap10 = segmentedObject3.darkMaskImage;
                                }
                                canvas.drawBitmap(bitmap10, matrix, paint);
                            }
                            if (bitmapDecodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (segmentedObject3.orientation == 0 || photoEntry.isFiltered) {
                                    canvas.drawBitmap(bitmapDecodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-segmentedObject3.orientation, bitmapDecodeFile2.getWidth() / f, bitmapDecodeFile2.getHeight() / f);
                                    if ((segmentedObject3.orientation / 90) % 2 != 0) {
                                        float height5 = (bitmapDecodeFile2.getHeight() - bitmapDecodeFile2.getWidth()) / f;
                                        matrix2.postTranslate(height5, -height5);
                                    }
                                    matrix2.postScale(bitmap.getWidth() / bitmapDecodeFile2.getHeight(), bitmap.getHeight() / bitmapDecodeFile2.getWidth());
                                    canvas.drawBitmap(bitmapDecodeFile2, matrix2, paint);
                                }
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                            Utilities.themeQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda163(photoViewer, bitmapCutSegmentInFilteredBitmap, 1));
                            photoViewer.stickerMakerView.disableClippingMode();
                            photoViewer.containerView.invalidate();
                        } else {
                            MediaController.CropState cropState = mediaEditState.cropState;
                            if (cropState != null) {
                                bitmapCreateBitmap = PhotoViewer.createCroppedBitmap(bitmapCreateBitmap, cropState, new int[]{photoViewer.centerImage.getOrientation(), photoViewer.centerImage.getInvert()}, true);
                            }
                            if (bitmapCreateBitmap == null) {
                                Utilities.themeQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda163(photoViewer, bitmapCutSegmentInFilteredBitmap, 2));
                                photoViewer.stickerMakerView.disableClippingMode();
                                photoViewer.containerView.invalidate();
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width5 = bitmapCreateBitmap.getWidth();
                                int height6 = bitmapCreateBitmap.getHeight();
                                if (!photoEntry.isCropped && (photoViewer.centerImage.getOrientation() / 90) % 2 != 0) {
                                    width5 = bitmapCreateBitmap.getHeight();
                                    height6 = bitmapCreateBitmap.getWidth();
                                }
                                float f6 = width5;
                                float f7 = height6;
                                float fMin = Math.min(photoViewer.getContainerViewWidth(photoViewer.currentEditMode) / f6, photoViewer.getContainerViewHeight(photoViewer.currentEditMode, false) / f7);
                                float f8 = f6 * fMin;
                                float f9 = f7 * fMin;
                                if ((photoViewer.centerImage.getOrientation() == 0 || photoEntry.isCropped) && photoViewer.rotate == 0.0f) {
                                    f2 = f8;
                                    fSqrt = f9;
                                    f3 = 0.0f;
                                } else {
                                    float width6 = bitmapCreateBitmap.getWidth();
                                    float height7 = bitmapCreateBitmap.getHeight();
                                    float f10 = width6 / f;
                                    float f11 = height7 / f;
                                    float fSqrt2 = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                                    float f12 = fSqrt2 * f;
                                    int i3 = (int) f12;
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i3, i3, config);
                                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((photoEntry.isCropped ? 0 : photoViewer.centerImage.getOrientation()) + photoViewer.rotate, fSqrt2, fSqrt2);
                                    canvas2.drawBitmap(bitmapCreateBitmap, (f12 - width6) / f, (f12 - height7) / f, (Paint) null);
                                    bitmapCreateBitmap.recycle();
                                    float f13 = f8 / f;
                                    float f14 = f9 / f;
                                    fSqrt = ((float) Math.sqrt((f14 * f14) + (f13 * f13))) * f;
                                    f3 = (-(fSqrt - f8)) / f;
                                    f4 = (-(fSqrt - f9)) / f;
                                    bitmapCreateBitmap = bitmapCreateBitmap2;
                                    f2 = fSqrt;
                                }
                                matrix3.postScale(f2, fSqrt);
                                float f15 = photoViewer.scale;
                                matrix3.postScale(f15, f15, f2 / f, fSqrt / f);
                                matrix3.postTranslate(photoViewer.translationX + f3 + Math.max(0, (int) ((photoViewer.getContainerViewWidth(photoViewer.currentEditMode) - f8) / f)), photoViewer.translationY + f4 + Math.max(0, (int) ((photoViewer.getContainerViewHeight(photoViewer.currentEditMode, false) - f9) / f)));
                                photoViewer.stickerMakerView.isThanosInProgress = true;
                                Utilities.themeQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda163(photoViewer, bitmapCutSegmentInFilteredBitmap, 3));
                                PhotoViewer$$ExternalSyntheticLambda16 photoViewer$$ExternalSyntheticLambda16 = new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 12);
                                PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8 = new PollItemMenu$$ExternalSyntheticLambda8(photoViewer, bitmapCutSegmentInFilteredBitmap, photoViewer$$ExternalSyntheticLambda16, 7);
                                QrActivity$5$$ExternalSyntheticLambda1 qrActivity$5$$ExternalSyntheticLambda1 = new QrActivity$5$$ExternalSyntheticLambda1(23);
                                ThanosEffect.DrawingThread drawingThread = thanosEffect.drawThread;
                                if (drawingThread != null) {
                                    drawingThread.animate(matrix3, bitmapCreateBitmap, pollItemMenu$$ExternalSyntheticLambda8, qrActivity$5$$ExternalSyntheticLambda1);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.frameCallback);
                                } else {
                                    thanosEffect.toSet.add(new ThanosEffect.ToSet(matrix3, bitmapCreateBitmap, pollItemMenu$$ExternalSyntheticLambda8, qrActivity$5$$ExternalSyntheticLambda1));
                                }
                                AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda16, 1200L);
                            }
                        }
                    }
                }
                photoViewer.stickerMakerView.disableClippingMode();
                photoViewer.containerView.invalidate();
                break;
            case 1:
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                chatAttachAlertPhotoLayout.takingPhoto = false;
                File file = (File) this.f$2;
                if (file != null && !chatAttachAlertPhotoLayout.parentAlert.destroyed) {
                    ChatAttachAlertPhotoLayout.mediaFromExternalCamera = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused) {
                            i2 = 0;
                        }
                    } catch (Exception unused2) {
                        i = 0;
                    }
                    int i4 = i;
                    int i5 = ChatAttachAlertPhotoLayout.lastImageId;
                    ChatAttachAlertPhotoLayout.lastImageId = i5 - 1;
                    MediaController.PhotoEntry photoEntry2 = new MediaController.PhotoEntry(0, i5, 0L, file.getAbsolutePath(), num.intValue() == -1 ? 0 : num.intValue(), false, i4, i2, 0L);
                    photoEntry2.canDeleteAfter = true;
                    chatAttachAlertPhotoLayout.openPhotoViewer(photoEntry2, this.f$1, false);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass1 = (EmojiView.StickersSearchGridAdapter.AnonymousClass1) this.f$0;
                EmojiView.StickersSearchGridAdapter stickersSearchGridAdapter = EmojiView.StickersSearchGridAdapter.this;
                if (stickersSearchGridAdapter.emojiSearchId == anonymousClass1.lastId) {
                    ArrayList arrayList2 = anonymousClass1.emojiStickersArray;
                    int i6 = 0;
                    if (this.f$1) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        stickersSearchGridAdapter.isCompleted = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i6 < size2) {
                        Object obj2 = arrayList.get(i6);
                        i6++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        anonymousClass1.emojiStickersMap.put(document.id, document);
                    }
                    anonymousClass1.emojiStickers.put(arrayList2, stickersSearchGridAdapter.searchQuery);
                    ((Runnable) this.f$2).run();
                    break;
                }
                break;
            case 3:
                Runnable runnable = (Runnable) obj;
                if (!this.f$1) {
                    runnable.run();
                } else {
                    StickerCategoriesListView.search.fetch(UserConfig.selectedAccount, (String) this.f$0, new SelectAnimatedEmojiDialog$$ExternalSyntheticLambda33((LinkedHashSet) this.f$2, runnable, 1));
                }
                break;
            default:
                Weather.State state = (Weather.State) obj;
                if (this.f$1) {
                    ((AlertDialog) this.f$0).dismissUnless(350L);
                }
                ((Utilities.Callback) this.f$2).run(state);
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda91(ChatAttachAlertPhotoLayout.AnonymousClass10 anonymousClass10, File file, boolean z) {
        this.$r8$classId = 1;
        this.f$0 = anonymousClass10;
        this.f$2 = file;
        this.f$1 = z;
    }

    public PhotoViewer$$ExternalSyntheticLambda91(boolean z, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
        this.f$2 = obj2;
    }
}
