package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarsIntroActivity;

public class ChatAttachAlertPhotoLayoutPreview extends ChatAttachAlert.AttachAlertLayout {
    private static HashMap<MediaController.PhotoEntry, Boolean> photoRotate = new HashMap<>();
    private ValueAnimator draggingAnimator;
    private PreviewGroupsView.PreviewGroupCell.MediaCell draggingCell;
    private float draggingCellFromHeight;
    private float draggingCellFromWidth;
    private float draggingCellGroupY;
    private boolean draggingCellHiding;
    private float draggingCellLeft;
    private float draggingCellTop;
    private float draggingCellTouchX;
    private float draggingCellTouchY;
    private final long durationMultiplier;
    private PreviewGroupsView groupsView;
    public TextView header;
    private ViewPropertyAnimator headerAnimator;
    private boolean ignoreLayout;
    private boolean isPortrait;
    private LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    private int paddingTop;
    private ChatAttachAlertPhotoLayout photoLayout;
    private boolean shown;
    private Theme.ResourcesProvider themeDelegate;
    private UndoView undoView;
    private Drawable videoPlayImage;

    public class PreviewGroupsView extends ViewGroup {
        private HashMap<Object, Object> deletedPhotos;
        private float draggingT;
        private ArrayList<PreviewGroupCell> groupCells;
        private ChatActionCell hintView;
        private HashMap<MediaController.PhotoEntry, ImageReceiver> images;
        boolean[] lastGroupSeen;
        private int lastMeasuredHeight;
        private int paddingBottom;
        private int paddingTop;
        GroupingPhotoViewerProvider photoViewerProvider;
        HashMap<Object, Object> photosMap;
        List<Map.Entry<Object, Object>> photosMapKeys;
        ArrayList<Object> photosOrder;
        private float savedDragFromX;
        private float savedDragFromY;
        private float savedDraggingT;
        private final Runnable scroller;
        private boolean scrollerStarted;
        HashMap<Object, Object> selectedPhotos;
        PreviewGroupCell tapGroupCell;
        PreviewGroupCell.MediaCell tapMediaCell;
        long tapTime;
        private final PointF tmpPoint;
        private int undoViewId;
        float viewBottom;
        float viewTop;

        public class GroupingPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
            private ArrayList<MediaController.PhotoEntry> photos = new ArrayList<>();

            public GroupingPhotoViewerProvider() {
            }

            @Override
            public boolean cancelButtonPressed() {
                return false;
            }

            @Override
            public int getPhotoIndex(int i) {
                MediaController.PhotoEntry photoEntry;
                if (i < 0 || i >= this.photos.size() || (photoEntry = this.photos.get(i)) == null) {
                    return -1;
                }
                return PreviewGroupsView.this.photosOrder.indexOf(Integer.valueOf(photoEntry.imageId));
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                MediaController.PhotoEntry photoEntry;
                ArrayList<PreviewGroupCell.MediaCell> arrayList;
                PhotoViewer.PlaceProviderObject placeProviderObject = null;
                if (i >= 0 && i < this.photos.size() && isPhotoChecked(i) && (photoEntry = this.photos.get(i)) != null) {
                    int size = PreviewGroupsView.this.groupCells.size();
                    PreviewGroupCell previewGroupCell = null;
                    PreviewGroupCell.MediaCell mediaCell = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        previewGroupCell = (PreviewGroupCell) PreviewGroupsView.this.groupCells.get(i2);
                        if (previewGroupCell != null && (arrayList = previewGroupCell.media) != null) {
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                PreviewGroupCell.MediaCell mediaCell2 = previewGroupCell.media.get(i3);
                                if (mediaCell2 != null && mediaCell2.photoEntry == photoEntry && mediaCell2.scale > 0.5d) {
                                    mediaCell = previewGroupCell.media.get(i3);
                                    break;
                                }
                            }
                            if (mediaCell != null) {
                                break;
                            }
                        }
                    }
                    if (previewGroupCell != null && mediaCell != null) {
                        placeProviderObject = new PhotoViewer.PlaceProviderObject();
                        int[] iArr = new int[2];
                        PreviewGroupsView.this.getLocationInWindow(iArr);
                        if (Build.VERSION.SDK_INT < 26) {
                            iArr[0] = iArr[0] - ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getLeftInset();
                        }
                        placeProviderObject.viewX = iArr[0];
                        placeProviderObject.viewY = iArr[1] + ((int) previewGroupCell.y);
                        placeProviderObject.scale = 1.0f;
                        placeProviderObject.parentView = PreviewGroupsView.this;
                        ImageReceiver imageReceiver = mediaCell.image;
                        placeProviderObject.imageReceiver = imageReceiver;
                        placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                        placeProviderObject.radius = new int[]{(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                        RectF rectF = mediaCell.roundRadiuses;
                        placeProviderObject.clipTopAddition = (int) (-PreviewGroupsView.this.getY());
                        placeProviderObject.clipBottomAddition = PreviewGroupsView.this.getHeight() - ((int) (((-PreviewGroupsView.this.getY()) + ChatAttachAlertPhotoLayoutPreview.this.listView.getHeight()) - ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getClipLayoutBottom()));
                    }
                }
                return placeProviderObject;
            }

            @Override
            public int getSelectedCount() {
                return PreviewGroupsView.this.photosOrder.size();
            }

            @Override
            public HashMap<Object, Object> getSelectedPhotos() {
                return PreviewGroupsView.this.photosMap;
            }

            @Override
            public ArrayList<Object> getSelectedPhotosOrder() {
                return PreviewGroupsView.this.photosOrder;
            }

            public void init(ArrayList<MediaController.PhotoEntry> arrayList) {
                this.photos = arrayList;
            }

            @Override
            public boolean isPhotoChecked(int i) {
                if (i < 0 || i >= this.photos.size()) {
                    return false;
                }
                return PreviewGroupsView.this.photosOrder.contains(Integer.valueOf(this.photos.get(i).imageId));
            }

            @Override
            public void onClose() {
                PreviewGroupsView.this.fromPhotoArrays();
                PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                previewGroupsView.toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
            }

            @Override
            public int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
                if (i < 0 || i >= this.photos.size()) {
                    return -1;
                }
                Integer numValueOf = Integer.valueOf(this.photos.get(i).imageId);
                int iIndexOf = PreviewGroupsView.this.photosOrder.indexOf(numValueOf);
                if (iIndexOf < 0) {
                    PreviewGroupsView.this.photosOrder.add(numValueOf);
                    PreviewGroupsView.this.fromPhotoArrays();
                    return PreviewGroupsView.this.photosOrder.size() - 1;
                }
                if (PreviewGroupsView.this.photosOrder.size() <= 1) {
                    return -1;
                }
                PreviewGroupsView.this.photosOrder.remove(iIndexOf);
                PreviewGroupsView.this.fromPhotoArrays();
                return iIndexOf;
            }

            @Override
            public int setPhotoUnchecked(Object obj) {
                int iIndexOf;
                Integer numValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
                if (PreviewGroupsView.this.photosOrder.size() <= 1 || (iIndexOf = PreviewGroupsView.this.photosOrder.indexOf(numValueOf)) < 0) {
                    return -1;
                }
                PreviewGroupsView.this.photosOrder.remove(iIndexOf);
                PreviewGroupsView.this.fromPhotoArrays();
                return iIndexOf;
            }

            @Override
            public void updatePhotoAtIndex(int i) {
                MediaController.PhotoEntry photoEntry;
                boolean z;
                if (i < 0 || i >= this.photos.size() || (photoEntry = this.photos.get(i)) == null) {
                    return;
                }
                int i2 = photoEntry.imageId;
                PreviewGroupsView.this.invalidate();
                for (int i3 = 0; i3 < PreviewGroupsView.this.groupCells.size(); i3++) {
                    PreviewGroupCell previewGroupCell = (PreviewGroupCell) PreviewGroupsView.this.groupCells.get(i3);
                    if (previewGroupCell != null && previewGroupCell.media != null) {
                        for (int i4 = 0; i4 < previewGroupCell.media.size(); i4++) {
                            PreviewGroupCell.MediaCell mediaCell = previewGroupCell.media.get(i4);
                            if (mediaCell != null && mediaCell.photoEntry.imageId == i2) {
                                mediaCell.setImage(photoEntry);
                            }
                        }
                        if (previewGroupCell.group == null || previewGroupCell.group.photos == null) {
                            z = false;
                        } else {
                            z = false;
                            for (int i5 = 0; i5 < previewGroupCell.group.photos.size(); i5++) {
                                if (previewGroupCell.group.photos.get(i5).imageId == i2) {
                                    previewGroupCell.group.photos.set(i5, photoEntry);
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            previewGroupCell.setGroup(previewGroupCell.group, true);
                        }
                    }
                }
                PreviewGroupsView.this.remeasure();
                PreviewGroupsView.this.invalidate();
            }
        }

        public class PreviewGroupCell {
            private final MessageDrawable.PathDrawParams backgroundCacheParams;
            private float bottom;
            private Text buttonText;
            private final Paint buttonTextBgPaint;
            private long buttonTextPrice;
            private final RectF buttonTextRect;
            final int gap;
            private GroupCalculator group;
            private float groupHeight;
            private float groupWidth;
            final int halfGap;
            private float height;
            public int indexStart;
            private Interpolator interpolator;
            private long lastMediaUpdate;
            private float left;
            public ArrayList<MediaCell> media;
            private final MessageDrawable messageBackground;
            final int padding;
            private float previousGroupHeight;
            private float previousGroupWidth;
            private float right;
            public long stars;
            private float top;
            private final long updateDuration;
            private float width;
            public float y;

            public class MediaCell {
                private Paint bitmapPaint;
                public ImageReceiver blurredImage;
                private Rect durationIn;
                private Rect durationOut;
                private RectF fromRect;
                public RectF fromRoundRadiuses;
                public float fromScale;
                public PreviewGroupCell groupCell;
                public ImageReceiver image;
                private Bitmap indexBitmap;
                private String indexBitmapText;
                private Rect indexIn;
                private Rect indexOut;
                private long lastUpdate;
                private long lastVisibleTUpdate;
                private Paint paint;
                private Path path;
                public MediaController.PhotoEntry photoEntry;
                private int positionFlags;
                private float[] radii;
                public RectF rect;
                public RectF roundRadiuses;
                public float scale;
                private Bitmap spoilerCrossfadeBitmap;
                private Paint spoilerCrossfadePaint;
                private float spoilerCrossfadeProgress;
                private SpoilerEffect2 spoilerEffect;
                private float spoilerMaxRadius;
                private float spoilerRevealProgress;
                private float spoilerRevealX;
                private float spoilerRevealY;
                private Paint strokePaint;
                private RectF tempRect;
                private TextPaint textPaint;
                private final long updateDuration;
                private Bitmap videoDurationBitmap;
                private String videoDurationBitmapText;
                private String videoDurationText;
                private TextPaint videoDurationTextPaint;
                private float visibleT;
                public boolean wasSpoiler;

                private MediaCell() {
                    this.groupCell = PreviewGroupCell.this;
                    this.fromRect = null;
                    this.rect = new RectF();
                    this.lastUpdate = 0L;
                    this.updateDuration = 200L;
                    this.positionFlags = 0;
                    this.fromScale = 1.0f;
                    this.scale = 0.0f;
                    this.fromRoundRadiuses = null;
                    this.roundRadiuses = new RectF();
                    this.videoDurationText = null;
                    this.path = new Path();
                    this.radii = new float[8];
                    this.spoilerCrossfadeProgress = 1.0f;
                    this.spoilerCrossfadePaint = new Paint(1);
                    this.tempRect = new RectF();
                    this.paint = new Paint(1);
                    this.strokePaint = new Paint(1);
                    this.bitmapPaint = new Paint(1);
                    this.indexBitmap = null;
                    this.indexBitmapText = null;
                    this.videoDurationBitmap = null;
                    this.videoDurationBitmapText = null;
                    this.indexIn = new Rect();
                    this.indexOut = new Rect();
                    this.durationIn = new Rect();
                    this.durationOut = new Rect();
                    this.visibleT = 1.0f;
                    this.lastVisibleTUpdate = 0L;
                }

                private void drawDuration(Canvas canvas, float f, float f2, String str, float f3, float f4) {
                    String str2;
                    if (str != null) {
                        if (this.videoDurationBitmap == null || (str2 = this.videoDurationBitmapText) == null || !str2.equals(str)) {
                            if (this.videoDurationTextPaint == null) {
                                TextPaint textPaint = new TextPaint(1);
                                this.videoDurationTextPaint = textPaint;
                                textPaint.setTypeface(AndroidUtilities.bold());
                                this.videoDurationTextPaint.setColor(-1);
                            }
                            float fDp = AndroidUtilities.dp(12.0f);
                            this.videoDurationTextPaint.setTextSize(fDp);
                            float intrinsicWidth = ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicWidth() + this.videoDurationTextPaint.measureText(str) + AndroidUtilities.dp(15.0f);
                            float fMax = Math.max(fDp, AndroidUtilities.dp(4.0f) + ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicHeight());
                            int iCeil = (int) Math.ceil(intrinsicWidth);
                            int iCeil2 = (int) Math.ceil(fMax);
                            Bitmap bitmap = this.videoDurationBitmap;
                            if (bitmap == null || bitmap.getWidth() != iCeil || this.videoDurationBitmap.getHeight() != iCeil2) {
                                Bitmap bitmap2 = this.videoDurationBitmap;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                this.videoDurationBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                            }
                            Canvas canvas2 = new Canvas(this.videoDurationBitmap);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, intrinsicWidth, fMax);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                            int iDp = AndroidUtilities.dp(5.0f);
                            int intrinsicHeight = (int) ((fMax - ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicHeight()) / 2.0f);
                            ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.setBounds(iDp, intrinsicHeight, ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicWidth() + iDp, ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicHeight() + intrinsicHeight);
                            ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.draw(canvas2);
                            canvas2.drawText(str, AndroidUtilities.dp(18.0f), fDp + AndroidUtilities.dp(-0.7f), this.videoDurationTextPaint);
                            this.durationIn.set(0, 0, iCeil, iCeil2);
                            this.videoDurationBitmapText = str;
                        }
                        this.durationOut.set((int) f, (int) (f2 - (this.videoDurationBitmap.getHeight() * f3)), (int) ((this.videoDurationBitmap.getWidth() * f3) + f), (int) f2);
                        this.bitmapPaint.setAlpha((int) (f4 * 255.0f));
                        canvas.drawBitmap(this.videoDurationBitmap, this.durationIn, this.durationOut, this.bitmapPaint);
                    }
                }

                private void drawPhotoIndex(Canvas canvas, float f, float f2, String str, float f3, float f4) {
                    float f5;
                    String str2;
                    int iDp = AndroidUtilities.dp(12.0f);
                    int iDp2 = AndroidUtilities.dp(1.2f);
                    int i = (iDp + iDp2) * 2;
                    int i2 = iDp2 * 4;
                    if (str != null && (this.indexBitmap == null || (str2 = this.indexBitmapText) == null || !str2.equals(str))) {
                        if (this.indexBitmap == null) {
                            this.indexBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                        }
                        Canvas canvas2 = new Canvas(this.indexBitmap);
                        canvas2.drawColor(0);
                        if (this.textPaint == null) {
                            TextPaint textPaint = new TextPaint(1);
                            this.textPaint = textPaint;
                            textPaint.setTypeface(AndroidUtilities.bold());
                        }
                        TextPaint textPaint2 = this.textPaint;
                        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                        int i3 = Theme.key_chat_attachCheckBoxCheck;
                        textPaint2.setColor(chatAttachAlertPhotoLayoutPreview.getThemedColor(i3));
                        int length = str.length();
                        if (length == 0 || length == 1 || length == 2) {
                            f5 = 14.0f;
                        } else {
                            f5 = length != 3 ? 8.0f : 10.0f;
                        }
                        this.textPaint.setTextSize(AndroidUtilities.dp(f5));
                        float f6 = i / 2.0f;
                        this.paint.setColor(ChatAttachAlertPhotoLayoutPreview.this.getThemedColor(Theme.key_chat_attachCheckBoxBackground));
                        float f7 = (int) f6;
                        float f8 = iDp;
                        canvas2.drawCircle(f7, f7, f8, this.paint);
                        this.strokePaint.setColor(AndroidUtilities.getOffsetColor(-1, ChatAttachAlertPhotoLayoutPreview.this.getThemedColor(i3), 1.0f, 1.0f));
                        this.strokePaint.setStyle(Paint.Style.STROKE);
                        this.strokePaint.setStrokeWidth(iDp2);
                        canvas2.drawCircle(f7, f7, f8, this.strokePaint);
                        canvas2.drawText(str, f6 - (this.textPaint.measureText(str) / 2.0f), f6 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f5 / 4.0f), this.textPaint);
                        this.indexIn.set(0, 0, i, i);
                        this.indexBitmapText = str;
                    }
                    if (this.indexBitmap != null) {
                        float f9 = i * f3;
                        float f10 = i2;
                        float f11 = f - f10;
                        this.indexOut.set((int) ((f2 - f9) + f10), (int) f11, (int) (f2 + f10), (int) (f11 + f9));
                        this.bitmapPaint.setAlpha((int) (255.0f * f4));
                        canvas.drawBitmap(this.indexBitmap, this.indexIn, this.indexOut, this.bitmapPaint);
                    }
                }

                public void lambda$setImage$0(MediaController.PhotoEntry photoEntry, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                    if (z && !z2 && photoEntry != null && photoEntry.hasSpoiler && this.blurredImage.getBitmap() == null) {
                        if (this.blurredImage.getBitmap() != null && !this.blurredImage.getBitmap().isRecycled()) {
                            this.blurredImage.getBitmap().recycle();
                            this.blurredImage.setImageBitmap((Bitmap) null);
                        }
                        this.blurredImage.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                    }
                }

                public void lambda$startRevealMedia$1(ValueAnimator valueAnimator) {
                    this.spoilerRevealProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewGroupsView.this.invalidate();
                }

                public void layout(GroupCalculator groupCalculator, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z) {
                    if (groupCalculator == null || groupedMessagePosition == null) {
                        if (!z) {
                            this.fromScale = 0.0f;
                            this.scale = 0.0f;
                            return;
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        this.fromScale = AndroidUtilities.lerp(this.fromScale, this.scale, getT());
                        RectF rectF = this.fromRect;
                        if (rectF != null) {
                            AndroidUtilities.lerp(rectF, this.rect, getT(), this.fromRect);
                        }
                        this.scale = 0.0f;
                        this.lastUpdate = jElapsedRealtime;
                        return;
                    }
                    this.positionFlags = groupedMessagePosition.flags;
                    if (z) {
                        float t = getT();
                        RectF rectF2 = this.fromRect;
                        if (rectF2 != null) {
                            AndroidUtilities.lerp(rectF2, this.rect, t, rectF2);
                        }
                        RectF rectF3 = this.fromRoundRadiuses;
                        if (rectF3 != null) {
                            AndroidUtilities.lerp(rectF3, this.roundRadiuses, t, rectF3);
                        }
                        this.fromScale = AndroidUtilities.lerp(this.fromScale, this.scale, t);
                        this.lastUpdate = SystemClock.elapsedRealtime();
                    }
                    float f = groupedMessagePosition.left;
                    float f2 = groupCalculator.width;
                    float f3 = f / f2;
                    float f4 = groupedMessagePosition.top;
                    float f5 = groupCalculator.height;
                    float f6 = f4 / f5;
                    float f7 = groupedMessagePosition.pw / f2;
                    float f8 = groupedMessagePosition.ph / f5;
                    this.scale = 1.0f;
                    this.rect.set(f3, f6, f7 + f3, f8 + f6);
                    float fDp = AndroidUtilities.dp(2.0f);
                    float fDp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
                    RectF rectF4 = this.roundRadiuses;
                    int i = this.positionFlags;
                    float f9 = (i & 5) == 5 ? fDp2 : fDp;
                    float f10 = (i & 6) == 6 ? fDp2 : fDp;
                    float f11 = (i & 10) == 10 ? fDp2 : fDp;
                    if ((i & 9) == 9) {
                        fDp = fDp2;
                    }
                    rectF4.set(f9, f10, f11, fDp);
                    if (this.fromRect == null) {
                        RectF rectF5 = new RectF();
                        this.fromRect = rectF5;
                        rectF5.set(this.rect);
                    }
                    if (this.fromRoundRadiuses == null) {
                        RectF rectF6 = new RectF();
                        this.fromRoundRadiuses = rectF6;
                        rectF6.set(this.roundRadiuses);
                    }
                }

                public void layoutFrom(MediaCell mediaCell) {
                    this.fromScale = AndroidUtilities.lerp(mediaCell.fromScale, mediaCell.scale, mediaCell.getT());
                    if (this.fromRect == null) {
                        this.fromRect = new RectF();
                    }
                    RectF rectF = new RectF();
                    RectF rectF2 = this.fromRect;
                    if (rectF2 == null) {
                        rectF.set(this.rect);
                    } else {
                        AndroidUtilities.lerp(rectF2, this.rect, getT(), rectF);
                    }
                    RectF rectF3 = mediaCell.fromRect;
                    if (rectF3 != null) {
                        AndroidUtilities.lerp(rectF3, mediaCell.rect, mediaCell.getT(), this.fromRect);
                        this.fromRect.set(rectF.centerX() - (((this.fromRect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width), rectF.centerY() - (((this.fromRect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height), (((this.fromRect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width) + rectF.centerX(), (((this.fromRect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height) + rectF.centerY());
                    } else {
                        this.fromRect.set(rectF.centerX() - (((mediaCell.rect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width), rectF.centerY() - (((mediaCell.rect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height), (((mediaCell.rect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width) + rectF.centerX(), (((mediaCell.rect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height) + rectF.centerY());
                    }
                    this.fromScale = AndroidUtilities.lerp(this.fromScale, this.scale, getT());
                    this.lastUpdate = SystemClock.elapsedRealtime();
                }

                public void setImage(MediaController.PhotoEntry photoEntry) {
                    this.photoEntry = photoEntry;
                    if (photoEntry == null || !photoEntry.isVideo) {
                        this.videoDurationText = null;
                    } else {
                        this.videoDurationText = AndroidUtilities.formatShortDuration(photoEntry.duration);
                    }
                    if (this.image == null) {
                        this.image = new ImageReceiver(PreviewGroupsView.this);
                        this.blurredImage = new ImageReceiver(PreviewGroupsView.this);
                        this.image.setDelegate(new AIEditorAlert$$ExternalSyntheticLambda34(4, this, photoEntry));
                    }
                    if (photoEntry != null) {
                        String str = photoEntry.thumbPath;
                        if (str != null) {
                            this.image.setImage(ImageLocation.getForPath(str), null, null, null, Theme.chat_attachEmptyDrawable, 0L, null, null, 0);
                            return;
                        }
                        if (photoEntry.path == null) {
                            this.image.setImageBitmap(Theme.chat_attachEmptyDrawable);
                            return;
                        }
                        if (photoEntry.isVideo) {
                            this.image.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, Theme.chat_attachEmptyDrawable, 0L, null, null, 0);
                            this.image.setAllowStartAnimation(true);
                            return;
                        }
                        this.image.setOrientation(photoEntry.orientation, true);
                        this.image.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, Theme.chat_attachEmptyDrawable, 0L, null, null, 0);
                    }
                }

                public void startRevealMedia(float f, float f2) {
                    this.spoilerRevealX = f;
                    this.spoilerRevealY = f2;
                    RectF rectFDrawingRect = drawingRect();
                    this.spoilerMaxRadius = (float) Math.sqrt(Math.pow(rectFDrawingRect.height(), 2.0d) + Math.pow(rectFDrawingRect.width(), 2.0d));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) MathUtils.clamp(this.spoilerMaxRadius * 0.3f, 250.0f, 550.0f));
                    duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                    duration.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 3));
                    duration.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            MediaCell mediaCell = MediaCell.this;
                            mediaCell.photoEntry.isChatPreviewSpoilerRevealed = true;
                            PreviewGroupsView.this.invalidate();
                        }
                    });
                    duration.start();
                }

                public void detach() {
                    SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
                    if (spoilerEffect2 != null) {
                        spoilerEffect2.detach(PreviewGroupsView.this);
                        this.spoilerEffect = null;
                    }
                }

                public boolean draw(Canvas canvas) {
                    return draw(canvas, false);
                }

                public RectF drawingRect() {
                    float f = 0.0f;
                    if (this.rect == null || this.image == null) {
                        this.tempRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                        return this.tempRect;
                    }
                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null && ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry == this.photoEntry) {
                        f = PreviewGroupsView.this.draggingT;
                    }
                    float fLerp = (((1.0f - f) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.fromScale, this.scale, getT());
                    RectF rectFRect = rect();
                    float f2 = 1.0f - fLerp;
                    float f3 = fLerp + 1.0f;
                    rectFRect.set(Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(rectFRect.width(), f2, 2.0f, rectFRect.left), ((rectFRect.height() * f2) / 2.0f) + rectFRect.top, Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(rectFRect.width(), f3, 2.0f, rectFRect.left), ((rectFRect.height() * f3) / 2.0f) + rectFRect.top);
                    return rectFRect;
                }

                public float getT() {
                    return PreviewGroupCell.this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastUpdate) / 200.0f));
                }

                public RectF rect() {
                    return rect(getT());
                }

                public void startCrossfade() {
                    RectF rectFDrawingRect = drawingRect();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, Math.round(rectFDrawingRect.width())), Math.max(1, Math.round(rectFDrawingRect.height())), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.save();
                    canvas.translate(-rectFDrawingRect.left, -rectFDrawingRect.top);
                    draw(canvas);
                    canvas.restore();
                    Bitmap bitmap = this.spoilerCrossfadeBitmap;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.spoilerCrossfadeBitmap.recycle();
                    }
                    this.spoilerCrossfadeBitmap = bitmapCreateBitmap;
                    this.spoilerCrossfadeProgress = 0.0f;
                    PreviewGroupsView.this.invalidate();
                }

                public MediaCell clone() {
                    MediaCell mediaCell = PreviewGroupCell.this.new MediaCell();
                    mediaCell.rect.set(this.rect);
                    mediaCell.image = this.image;
                    mediaCell.photoEntry = this.photoEntry;
                    return mediaCell;
                }

                public boolean draw(Canvas canvas, boolean z) {
                    return draw(canvas, getT(), z);
                }

                public RectF rect(float f) {
                    if (this.rect == null || this.image == null) {
                        this.tempRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                        return this.tempRect;
                    }
                    float fLerp = (this.rect.left * PreviewGroupCell.this.width) + PreviewGroupCell.this.left;
                    float fLerp2 = (this.rect.top * PreviewGroupCell.this.height) + PreviewGroupCell.this.top;
                    float fWidth = this.rect.width() * PreviewGroupCell.this.width;
                    float fHeight = this.rect.height() * PreviewGroupCell.this.height;
                    if (f < 1.0f && this.fromRect != null) {
                        fLerp = AndroidUtilities.lerp((this.fromRect.left * PreviewGroupCell.this.width) + PreviewGroupCell.this.left, fLerp, f);
                        fLerp2 = AndroidUtilities.lerp((this.fromRect.top * PreviewGroupCell.this.height) + PreviewGroupCell.this.top, fLerp2, f);
                        fWidth = AndroidUtilities.lerp(this.fromRect.width() * PreviewGroupCell.this.width, fWidth, f);
                        fHeight = AndroidUtilities.lerp(this.fromRect.height() * PreviewGroupCell.this.height, fHeight, f);
                    }
                    int i = this.positionFlags;
                    if ((i & 4) == 0) {
                        float f2 = PreviewGroupCell.this.halfGap;
                        fLerp2 += f2;
                        fHeight -= f2;
                    }
                    if ((i & 8) == 0) {
                        fHeight -= PreviewGroupCell.this.halfGap;
                    }
                    if ((i & 1) == 0) {
                        float f3 = PreviewGroupCell.this.halfGap;
                        fLerp += f3;
                        fWidth -= f3;
                    }
                    if ((i & 2) == 0) {
                        fWidth -= PreviewGroupCell.this.halfGap;
                    }
                    this.tempRect.set(fLerp, fLerp2, fWidth + fLerp, fHeight + fLerp2);
                    return this.tempRect;
                }

                public boolean draw(Canvas canvas, float f, boolean z) {
                    char c;
                    char c2;
                    Bitmap bitmap;
                    char c3;
                    Path.Direction direction;
                    RectF rectF;
                    Canvas canvas2 = canvas;
                    if (this.rect == null || this.image == null) {
                        return false;
                    }
                    float f2 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell == this ? PreviewGroupsView.this.draggingT : 0.0f;
                    float fLerp = AndroidUtilities.lerp(this.fromScale, this.scale, f);
                    if (fLerp <= 0.0f) {
                        return false;
                    }
                    RectF rectFDrawingRect = drawingRect();
                    float fDp = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
                    RectF rectF2 = this.roundRadiuses;
                    float fLerp2 = rectF2.left;
                    float fLerp3 = rectF2.top;
                    float fLerp4 = rectF2.right;
                    float fLerp5 = rectF2.bottom;
                    if (f < 1.0f && (rectF = this.fromRoundRadiuses) != null) {
                        fLerp2 = AndroidUtilities.lerp(rectF.left, fLerp2, f);
                        fLerp3 = AndroidUtilities.lerp(this.fromRoundRadiuses.top, fLerp3, f);
                        fLerp4 = AndroidUtilities.lerp(this.fromRoundRadiuses.right, fLerp4, f);
                        fLerp5 = AndroidUtilities.lerp(this.fromRoundRadiuses.bottom, fLerp5, f);
                    }
                    float fLerp6 = AndroidUtilities.lerp(fLerp2, fDp, f2);
                    float fLerp7 = AndroidUtilities.lerp(fLerp3, fDp, f2);
                    float fLerp8 = AndroidUtilities.lerp(fLerp4, fDp, f2);
                    float fLerp9 = AndroidUtilities.lerp(fLerp5, fDp, f2);
                    if (z) {
                        canvas2.save();
                        canvas2.translate(-rectFDrawingRect.centerX(), -rectFDrawingRect.centerY());
                    }
                    int i = (int) fLerp6;
                    int i2 = (int) fLerp7;
                    int i3 = (int) fLerp8;
                    int i4 = (int) fLerp9;
                    this.image.setRoundRadius(i, i2, i3, i4);
                    this.image.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                    this.image.setAlpha(fLerp);
                    this.image.draw(canvas2);
                    MediaController.PhotoEntry photoEntry = this.photoEntry;
                    if (photoEntry == null || !photoEntry.hasSpoiler || photoEntry.isChatPreviewSpoilerRevealed) {
                        fLerp6 = fLerp6;
                        c = 6;
                        c2 = 7;
                    } else {
                        if (!this.wasSpoiler && this.blurredImage.getBitmap() == null && this.image.getBitmap() != null) {
                            this.wasSpoiler = true;
                            this.blurredImage.setImageBitmap(Utilities.stackBlurBitmapMax(this.image.getBitmap()));
                        } else {
                            if (!this.wasSpoiler && this.blurredImage.getBitmap() != null) {
                                c3 = 1;
                                this.wasSpoiler = true;
                            }
                            float[] fArr = this.radii;
                            fArr[c3] = fLerp6;
                            fArr[0] = fLerp6;
                            fArr[3] = fLerp7;
                            fArr[2] = fLerp7;
                            fArr[5] = fLerp8;
                            fArr[4] = fLerp8;
                            fArr[7] = fLerp9;
                            fArr[6] = fLerp9;
                            canvas2.save();
                            this.path.rewind();
                            Path path = this.path;
                            float[] fArr2 = this.radii;
                            direction = Path.Direction.CW;
                            path.addRoundRect(rectFDrawingRect, fArr2, direction);
                            canvas2.clipPath(this.path);
                            if (this.spoilerRevealProgress != 0.0f) {
                                this.path.rewind();
                                c = 6;
                                c2 = 7;
                                this.path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerMaxRadius * this.spoilerRevealProgress, direction);
                                canvas2.clipPath(this.path, Region.Op.DIFFERENCE);
                            } else {
                                c = 6;
                                c2 = 7;
                            }
                            this.blurredImage.setRoundRadius(i, i2, i3, i4);
                            this.blurredImage.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                            this.blurredImage.setAlpha(fLerp);
                            this.blurredImage.draw(canvas2);
                            if (this.spoilerEffect == null) {
                                this.spoilerEffect = SpoilerEffect2.getInstance(PreviewGroupsView.this);
                            }
                            SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
                            PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                            spoilerEffect2.draw(canvas, previewGroupsView, previewGroupsView.getWidth(), PreviewGroupsView.this.getHeight(), 1.0f, false);
                            canvas2 = canvas;
                            canvas2.restore();
                            PreviewGroupsView.this.invalidate();
                            PreviewGroupsView.this.invalidate();
                        }
                        c3 = 1;
                        float[] fArr3 = this.radii;
                        fArr3[c3] = fLerp6;
                        fArr3[0] = fLerp6;
                        fArr3[3] = fLerp7;
                        fArr3[2] = fLerp7;
                        fArr3[5] = fLerp8;
                        fArr3[4] = fLerp8;
                        fArr3[7] = fLerp9;
                        fArr3[6] = fLerp9;
                        canvas2.save();
                        this.path.rewind();
                        Path path2 = this.path;
                        float[] fArr4 = this.radii;
                        direction = Path.Direction.CW;
                        path2.addRoundRect(rectFDrawingRect, fArr4, direction);
                        canvas2.clipPath(this.path);
                        if (this.spoilerRevealProgress != 0.0f) {
                            this.path.rewind();
                            c = 6;
                            c2 = 7;
                            this.path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerMaxRadius * this.spoilerRevealProgress, direction);
                            canvas2.clipPath(this.path, Region.Op.DIFFERENCE);
                        } else {
                            c = 6;
                            c2 = 7;
                        }
                        this.blurredImage.setRoundRadius(i, i2, i3, i4);
                        this.blurredImage.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                        this.blurredImage.setAlpha(fLerp);
                        this.blurredImage.draw(canvas2);
                        if (this.spoilerEffect == null) {
                            this.spoilerEffect = SpoilerEffect2.getInstance(PreviewGroupsView.this);
                        }
                        SpoilerEffect2 spoilerEffect3 = this.spoilerEffect;
                        PreviewGroupsView previewGroupsView2 = PreviewGroupsView.this;
                        spoilerEffect3.draw(canvas, previewGroupsView2, previewGroupsView2.getWidth(), PreviewGroupsView.this.getHeight(), 1.0f, false);
                        canvas2 = canvas;
                        canvas2.restore();
                        PreviewGroupsView.this.invalidate();
                        PreviewGroupsView.this.invalidate();
                    }
                    float f3 = this.spoilerCrossfadeProgress;
                    String str = null;
                    if (f3 != 1.0f && this.spoilerCrossfadeBitmap != null) {
                        float[] fArr5 = this.radii;
                        fArr5[1] = fLerp6;
                        fArr5[0] = fLerp6;
                        fArr5[3] = r30;
                        fArr5[2] = fLerp7;
                        fArr5[5] = fLerp8;
                        fArr5[4] = fLerp8;
                        fArr5[c2] = fLerp9;
                        fArr5[c] = fLerp9;
                        canvas2.save();
                        this.path.rewind();
                        this.path.addRoundRect(rectFDrawingRect, this.radii, Path.Direction.CW);
                        canvas2.clipPath(this.path);
                        float fMin = Math.min(1.0f, (Math.min(16L, SystemClock.elapsedRealtime() - this.lastUpdate) / 250.0f) + this.spoilerCrossfadeProgress);
                        this.spoilerCrossfadeProgress = fMin;
                        this.spoilerCrossfadePaint.setAlpha((int) ((1.0f - fMin) * 255.0f));
                        canvas2.drawBitmap(this.spoilerCrossfadeBitmap, rectFDrawingRect.left, rectFDrawingRect.top, this.spoilerCrossfadePaint);
                        canvas2.restore();
                        PreviewGroupsView.this.invalidate();
                    } else if (f3 == 1.0f && (bitmap = this.spoilerCrossfadeBitmap) != null) {
                        bitmap.recycle();
                        this.spoilerCrossfadeBitmap = null;
                        PreviewGroupsView.this.invalidate();
                    }
                    PreviewGroupCell previewGroupCell = PreviewGroupCell.this;
                    int iIndexOf = previewGroupCell.group.photos.indexOf(this.photoEntry) + previewGroupCell.indexStart;
                    if (iIndexOf >= 0) {
                        str = (iIndexOf + 1) + "";
                    }
                    String str2 = str;
                    float f4 = this.image.getVisible() ? 1.0f : 0.0f;
                    boolean z2 = Math.abs(this.visibleT - f4) > 0.01f;
                    if (z2) {
                        long jMin = Math.min(17L, SystemClock.elapsedRealtime() - this.lastVisibleTUpdate);
                        this.lastVisibleTUpdate = SystemClock.elapsedRealtime();
                        float f5 = jMin / 100.0f;
                        float f6 = this.visibleT;
                        if (f4 < f6) {
                            this.visibleT = Math.max(0.0f, f6 - f5);
                        } else {
                            this.visibleT = Math.min(1.0f, f6 + f5);
                        }
                    }
                    drawPhotoIndex(canvas2, rectFDrawingRect.top + AndroidUtilities.dp(10.0f), rectFDrawingRect.right - AndroidUtilities.dp(10.0f), str2, fLerp, fLerp * this.visibleT);
                    drawDuration(canvas, rectFDrawingRect.left + AndroidUtilities.dp(4.0f), rectFDrawingRect.bottom - AndroidUtilities.dp(4.0f), this.videoDurationText, fLerp, fLerp * this.visibleT);
                    if (z) {
                        canvas.restore();
                    }
                    return f < 1.0f || z2;
                }
            }

            private PreviewGroupCell() {
                this.y = 0.0f;
                this.indexStart = 0;
                this.updateDuration = 200L;
                this.lastMediaUpdate = 0L;
                this.groupWidth = 0.0f;
                this.groupHeight = 0.0f;
                this.previousGroupWidth = 0.0f;
                this.previousGroupHeight = 0.0f;
                this.media = new ArrayList<>();
                this.interpolator = CubicBezierInterpolator.EASE_BOTH;
                this.padding = AndroidUtilities.dp(4.0f);
                int iDp = AndroidUtilities.dp(2.0f);
                this.gap = iDp;
                this.halfGap = iDp / 2;
                this.buttonTextRect = new RectF();
                this.buttonTextBgPaint = new Paint(1);
                this.messageBackground = (MessageDrawable) ChatAttachAlertPhotoLayoutPreview.this.getThemedDrawable("drawableMsgOutMedia");
                this.backgroundCacheParams = new MessageDrawable.PathDrawParams();
            }

            public void setGroup(GroupCalculator groupCalculator, boolean z) {
                MediaCell mediaCell;
                this.group = groupCalculator;
                if (groupCalculator == null) {
                    return;
                }
                groupCalculator.calculate();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.lastMediaUpdate;
                long j2 = 200;
                if (j < 200) {
                    float f = j / 200.0f;
                    this.previousGroupHeight = AndroidUtilities.lerp(this.previousGroupHeight, this.groupHeight, f);
                    this.previousGroupWidth = AndroidUtilities.lerp(this.previousGroupWidth, this.groupWidth, f);
                } else {
                    this.previousGroupHeight = this.groupHeight;
                    this.previousGroupWidth = this.groupWidth;
                }
                this.groupWidth = groupCalculator.width / 1000.0f;
                this.groupHeight = groupCalculator.height;
                this.lastMediaUpdate = z ? jElapsedRealtime : 0L;
                this.stars = 0L;
                ArrayList arrayList = new ArrayList(groupCalculator.positions.keySet());
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i2);
                    MessageObject.GroupedMessagePosition groupedMessagePosition = groupCalculator.positions.get(photoEntry);
                    long j3 = j2;
                    this.stars = Math.max(this.stars, photoEntry.starsAmount);
                    int size2 = this.media.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            mediaCell = null;
                            break;
                        }
                        mediaCell = this.media.get(i3);
                        if (mediaCell.photoEntry == photoEntry) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (mediaCell == null) {
                        MediaCell mediaCell2 = new MediaCell();
                        mediaCell2.setImage(photoEntry);
                        mediaCell2.layout(groupCalculator, groupedMessagePosition, z);
                        this.media.add(mediaCell2);
                    } else {
                        mediaCell.layout(groupCalculator, groupedMessagePosition, z);
                    }
                    i2++;
                    j2 = j3;
                }
                long j4 = j2;
                int size3 = this.media.size();
                while (i < size3) {
                    MediaCell mediaCell3 = this.media.get(i);
                    if (!groupCalculator.positions.containsKey(mediaCell3.photoEntry)) {
                        if (mediaCell3.scale > 0.0f || mediaCell3.lastUpdate + j4 > jElapsedRealtime) {
                            mediaCell3.layout(null, null, z);
                        } else {
                            mediaCell3.detach();
                            this.media.remove(i);
                            i--;
                            size3--;
                        }
                    }
                    i++;
                }
                PreviewGroupsView.this.invalidate();
            }

            public void detach() {
                for (int i = 0; i < this.media.size(); i++) {
                    this.media.get(i).detach();
                }
            }

            public boolean draw(Canvas canvas) {
                float f = 1.0f;
                float interpolation = this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastMediaUpdate) / 200.0f));
                boolean z = interpolation < 1.0f;
                Point point = AndroidUtilities.displaySize;
                float fMax = Math.max(point.x, point.y) * 0.5f;
                float previewScale = ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * AndroidUtilities.lerp(this.previousGroupWidth, this.groupWidth, interpolation) * PreviewGroupsView.this.getWidth();
                float previewScale2 = ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * AndroidUtilities.lerp(this.previousGroupHeight, this.groupHeight, interpolation) * fMax;
                if (this.messageBackground != null) {
                    this.top = 0.0f;
                    this.left = (PreviewGroupsView.this.getWidth() - Math.max(this.padding, previewScale)) / 2.0f;
                    this.right = (Math.max(this.padding, previewScale) + PreviewGroupsView.this.getWidth()) / 2.0f;
                    this.bottom = Math.max(this.padding * 2, previewScale2);
                    this.messageBackground.setTop(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                    this.messageBackground.setBounds((int) this.left, (int) this.top, (int) this.right, (int) this.bottom);
                    if (this.groupWidth <= 0.0f) {
                        f = 1.0f - interpolation;
                    } else if (this.previousGroupWidth <= 0.0f) {
                        f = interpolation;
                    }
                    this.messageBackground.setAlpha((int) (f * 255.0f));
                    this.messageBackground.drawCached(canvas, this.backgroundCacheParams);
                    float f2 = this.top;
                    float f3 = this.padding;
                    this.top = f2 + f3;
                    this.left += f3;
                    this.bottom -= f3;
                    this.right -= f3;
                }
                this.width = this.right - this.left;
                this.height = this.bottom - this.top;
                int size = this.media.size();
                for (int i = 0; i < size; i++) {
                    MediaCell mediaCell = this.media.get(i);
                    if (mediaCell != null && ((ChatAttachAlertPhotoLayoutPreview.this.draggingCell == null || ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry != mediaCell.photoEntry) && mediaCell.draw(canvas))) {
                        z = true;
                    }
                }
                drawStarsButton(canvas);
                return z;
            }

            public void drawStarsButton(Canvas canvas) {
                long j = this.stars;
                if (j <= 0) {
                    return;
                }
                if (this.buttonText == null || this.buttonTextPrice != j) {
                    this.buttonTextPrice = j;
                    this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float currentWidth = this.buttonText.getCurrentWidth() + AndroidUtilities.dp(28.0f);
                float fDp = AndroidUtilities.dp(32.0f);
                RectF rectF = this.buttonTextRect;
                float f = this.left;
                float f2 = this.width;
                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(f2, currentWidth, 2.0f, f);
                float f3 = this.top;
                float f4 = this.height;
                rectF.set(fM, ImageReceiver$$ExternalSyntheticOutline0.m(f4, fDp, 2.0f, f3), AacUtil.m(f2, currentWidth, 2.0f, f), AacUtil.m(f4, fDp, 2.0f, f3));
                this.buttonTextBgPaint.setColor(1610612736);
                float f5 = fDp / 2.0f;
                canvas.drawRoundRect(this.buttonTextRect, f5, f5, this.buttonTextBgPaint);
                this.buttonText.draw(canvas, (((this.width / 2.0f) + this.left) - (currentWidth / 2.0f)) + AndroidUtilities.dp(14.0f), (this.height / 2.0f) + this.top, -1, 1.0f);
            }

            public float getT() {
                return this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastMediaUpdate) / 200.0f));
            }

            public float maxHeight() {
                Point point = AndroidUtilities.displaySize;
                float fMax = Math.max(point.x, point.y) * 0.5f;
                if (getT() < 0.95f) {
                    return measure();
                }
                return ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * this.groupHeight * fMax;
            }

            public float measure() {
                Point point = AndroidUtilities.displaySize;
                return ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * AndroidUtilities.lerp(this.previousGroupHeight, this.groupHeight, getT()) * Math.max(point.x, point.y) * 0.5f;
            }
        }

        public PreviewGroupsView(Context context) {
            super(context);
            this.groupCells = new ArrayList<>();
            this.deletedPhotos = new HashMap<>();
            this.paddingTop = AndroidUtilities.dp(16.0f);
            this.paddingBottom = AndroidUtilities.dp(64.0f);
            this.lastMeasuredHeight = 0;
            this.lastGroupSeen = null;
            this.tapTime = 0L;
            this.tapGroupCell = null;
            this.tapMediaCell = null;
            this.draggingT = 0.0f;
            this.tmpPoint = new PointF();
            this.scrollerStarted = false;
            this.scroller = new Runnable() {
                @Override
                public void run() {
                    float fDp;
                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell == null || ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding) {
                        return;
                    }
                    int iComputeVerticalScrollOffset = ChatAttachAlertPhotoLayoutPreview.this.listView.computeVerticalScrollOffset();
                    boolean z = ChatAttachAlertPhotoLayoutPreview.this.listView.computeVerticalScrollExtent() + iComputeVerticalScrollOffset >= (PreviewGroupsView.this.measurePureHeight() - PreviewGroupsView.this.paddingBottom) + PreviewGroupsView.this.paddingTop;
                    float fMax = Math.max(0.0f, (ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchY - Math.max(0, iComputeVerticalScrollOffset - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float fMax2 = Math.max(0.0f, ((ChatAttachAlertPhotoLayoutPreview.this.listView.getMeasuredHeight() - (ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchY - iComputeVerticalScrollOffset)) - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float fDp2 = AndroidUtilities.dp(32.0f);
                    if (fMax < fDp2 && iComputeVerticalScrollOffset > ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding()) {
                        fDp = (-(1.0f - (fMax / fDp2))) * AndroidUtilities.dp(6.0f);
                    } else if (fMax2 < fDp2) {
                        fDp = AndroidUtilities.dp(6.0f) * (1.0f - (fMax2 / fDp2));
                    } else {
                        fDp = 0.0f;
                    }
                    int i = (int) fDp;
                    if (Math.abs(i) > 0 && ChatAttachAlertPhotoLayoutPreview.this.listView.canScrollVertically(i) && (fDp <= 0.0f || !z)) {
                        ChatAttachAlertPhotoLayoutPreview.access$1416(ChatAttachAlertPhotoLayoutPreview.this, fDp);
                        ChatAttachAlertPhotoLayoutPreview.this.listView.scrollBy(0, i);
                        PreviewGroupsView.this.invalidate();
                    }
                    PreviewGroupsView.this.scrollerStarted = true;
                    PreviewGroupsView.this.postDelayed(this, 15L);
                }
            };
            this.photoViewerProvider = new GroupingPhotoViewerProvider();
            this.undoViewId = 0;
            this.images = new HashMap<>();
            setWillNotDraw(false);
            ChatActionCell chatActionCell = new ChatActionCell(context, true, ChatAttachAlertPhotoLayoutPreview.this.themeDelegate);
            this.hintView = chatActionCell;
            chatActionCell.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
            addView(this.hintView);
        }

        private boolean[] groupSeen() {
            boolean[] zArr = new boolean[this.groupCells.size()];
            float f = this.paddingTop;
            int iComputeVerticalScrollOffset = ChatAttachAlertPhotoLayoutPreview.this.listView.computeVerticalScrollOffset();
            int i = 0;
            this.viewTop = Math.max(0, iComputeVerticalScrollOffset - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding());
            this.viewBottom = (ChatAttachAlertPhotoLayoutPreview.this.listView.getMeasuredHeight() - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding()) + iComputeVerticalScrollOffset;
            int size = this.groupCells.size();
            while (i < size) {
                float fMeasure = this.groupCells.get(i).measure() + f;
                zArr[i] = isSeen(f, fMeasure);
                i++;
                f = fMeasure;
            }
            return zArr;
        }

        public void lambda$onTouchEvent$2(long j, PreviewGroupCell.MediaCell mediaCell) {
            PreviewGroupCell.MediaCell mediaCell2;
            if (!ChatAttachAlertPhotoLayoutPreview.this.listView.scrollingByUser && this.tapTime == j && (mediaCell2 = this.tapMediaCell) == mediaCell) {
                startDragging(mediaCell2);
                RectF rectFRect = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect();
                RectF rectFDrawingRect = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.drawingRect();
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                chatAttachAlertPhotoLayoutPreview.draggingCellLeft = (((chatAttachAlertPhotoLayoutPreview.draggingCellTouchX - rectFRect.left) / rectFRect.width()) + 0.5f) / 2.0f;
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview2 = ChatAttachAlertPhotoLayoutPreview.this;
                chatAttachAlertPhotoLayoutPreview2.draggingCellTop = (chatAttachAlertPhotoLayoutPreview2.draggingCellTouchY - rectFRect.top) / rectFRect.height();
                ChatAttachAlertPhotoLayoutPreview.this.draggingCellFromWidth = rectFDrawingRect.width();
                ChatAttachAlertPhotoLayoutPreview.this.draggingCellFromHeight = rectFDrawingRect.height();
                try {
                    ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
            }
        }

        public void lambda$onTouchEvent$3(PreviewGroupCell previewGroupCell, MediaController.PhotoEntry photoEntry, int i) {
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
            }
            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = null;
            this.draggingT = 0.0f;
            pushToGroup(previewGroupCell, photoEntry, i);
            updateGroups();
            toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
        }

        public void lambda$onTouchEvent$4(int i) {
            if (i == this.undoViewId && ChatAttachAlertPhotoLayoutPreview.this.undoView.isShown()) {
                ChatAttachAlertPhotoLayoutPreview.this.undoView.hide(true, 1);
            }
        }

        public void lambda$startDragging$1(ValueAnimator valueAnimator) {
            this.draggingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void lambda$stopDragging$0(ValueAnimator valueAnimator) {
            this.draggingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        private int measureHeight() {
            return BotFullscreenButtons$$ExternalSyntheticOutline1.m(45.0f, AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight(), measurePureHeight());
        }

        public int measurePureHeight() {
            int iMeasure = this.paddingTop + this.paddingBottom;
            int size = this.groupCells.size();
            for (int i = 0; i < size; i++) {
                iMeasure = (int) (iMeasure + this.groupCells.get(i).measure());
            }
            if (this.hintView.getMeasuredHeight() <= 0) {
                this.hintView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
            }
            return this.hintView.getMeasuredHeight() + iMeasure;
        }

        private void pushToGroup(PreviewGroupCell previewGroupCell, MediaController.PhotoEntry photoEntry, int i) {
            previewGroupCell.group.photos.add(Math.min(previewGroupCell.group.photos.size(), i), photoEntry);
            if (previewGroupCell.group.photos.size() == 11) {
                MediaController.PhotoEntry photoEntry2 = previewGroupCell.group.photos.get(10);
                previewGroupCell.group.photos.remove(10);
                int iIndexOf = this.groupCells.indexOf(previewGroupCell);
                if (iIndexOf >= 0) {
                    int i2 = iIndexOf + 1;
                    PreviewGroupCell previewGroupCell2 = i2 == this.groupCells.size() ? null : this.groupCells.get(i2);
                    if (previewGroupCell2 == null) {
                        PreviewGroupCell previewGroupCell3 = new PreviewGroupCell();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(photoEntry2);
                        previewGroupCell3.setGroup(ChatAttachAlertPhotoLayoutPreview.this.new GroupCalculator(arrayList), true);
                        invalidate();
                    } else {
                        pushToGroup(previewGroupCell2, photoEntry2, 0);
                    }
                }
            }
            previewGroupCell.setGroup(previewGroupCell.group, true);
        }

        private void updateGroups() {
            int size = this.groupCells.size();
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = this.groupCells.get(i);
                if (previewGroupCell.group.photos.size() < 10 && i < this.groupCells.size() - 1) {
                    int size2 = 10 - previewGroupCell.group.photos.size();
                    PreviewGroupCell previewGroupCell2 = this.groupCells.get(i + 1);
                    ArrayList arrayList = new ArrayList();
                    int iMin = Math.min(size2, previewGroupCell2.group.photos.size());
                    for (int i2 = 0; i2 < iMin; i2++) {
                        arrayList.add(previewGroupCell2.group.photos.remove(0));
                    }
                    previewGroupCell.group.photos.addAll(arrayList);
                    previewGroupCell.setGroup(previewGroupCell.group, true);
                    previewGroupCell2.setGroup(previewGroupCell2.group, true);
                }
            }
        }

        public void calcPhotoArrays() {
            String str;
            this.photosMap = ChatAttachAlertPhotoLayoutPreview.this.photoLayout.getSelectedPhotos();
            this.photosMapKeys = new ArrayList(this.photosMap.entrySet());
            this.selectedPhotos = new HashMap<>();
            this.photosOrder = new ArrayList<>();
            int size = this.groupCells.size();
            for (int i = 0; i < size; i++) {
                GroupCalculator groupCalculator = this.groupCells.get(i).group;
                if (groupCalculator.photos.size() != 0) {
                    int size2 = groupCalculator.photos.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        MediaController.PhotoEntry photoEntry = groupCalculator.photos.get(i2);
                        if (!this.deletedPhotos.containsKey(photoEntry)) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= this.photosMapKeys.size()) {
                                    for (int i4 = 0; i4 < this.photosMapKeys.size(); i4++) {
                                        Map.Entry<Object, Object> entry = this.photosMapKeys.get(i4);
                                        Object value = entry.getValue();
                                        if ((value instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key = entry.getKey();
                                            this.selectedPhotos.put(key, value);
                                            this.photosOrder.add(key);
                                            break;
                                        }
                                    }
                                    break;
                                }
                                Map.Entry<Object, Object> entry2 = this.photosMapKeys.get(i3);
                                Object value2 = entry2.getValue();
                                if (value2 == photoEntry) {
                                    Object key2 = entry2.getKey();
                                    this.selectedPhotos.put(key2, value2);
                                    this.photosOrder.add(key2);
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            Object obj = this.deletedPhotos.get(photoEntry);
                            this.selectedPhotos.put(obj, photoEntry);
                            this.photosOrder.add(obj);
                        }
                    }
                }
            }
        }

        public PointF dragTranslate() {
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell == null) {
                PointF pointF = this.tmpPoint;
                pointF.x = 0.0f;
                pointF.y = 0.0f;
                return pointF;
            }
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding) {
                RectF rectFRect = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect();
                RectF rectFRect2 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect(1.0f);
                this.tmpPoint.x = AndroidUtilities.lerp((rectFRect.width() / 2.0f) + rectFRect2.left, this.savedDragFromX, this.draggingT / this.savedDraggingT);
                this.tmpPoint.y = AndroidUtilities.lerp((rectFRect.height() / 2.0f) + ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.y + rectFRect2.top, this.savedDragFromY, this.draggingT / this.savedDraggingT);
            } else {
                RectF rectFRect3 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect();
                RectF rectFRect4 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect(1.0f);
                this.tmpPoint.x = AndroidUtilities.lerp((rectFRect3.width() / 2.0f) + rectFRect4.left, ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchX - (ChatAttachAlertPhotoLayoutPreview.this.draggingCellFromWidth * (ChatAttachAlertPhotoLayoutPreview.this.draggingCellLeft - 0.5f)), this.draggingT);
                this.tmpPoint.y = AndroidUtilities.lerp((rectFRect3.height() / 2.0f) + ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.y + rectFRect4.top, ChatAttachAlertPhotoLayoutPreview.this.draggingCellGroupY + (ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchY - (ChatAttachAlertPhotoLayoutPreview.this.draggingCellFromHeight * (ChatAttachAlertPhotoLayoutPreview.this.draggingCellTop - 0.5f))), this.draggingT);
            }
            return this.tmpPoint;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        public void fromPhotoArrays() {
            for (int i = 0; i < this.groupCells.size(); i++) {
                this.groupCells.get(i).detach();
            }
            this.groupCells.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.photosOrder.size();
            int i2 = size - 1;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) this.photosOrder.get(i3);
                num.getClass();
                arrayList.add((MediaController.PhotoEntry) this.photosMap.get(num));
                if (i3 % 10 == 9 || i3 == i2) {
                    PreviewGroupCell previewGroupCell = new PreviewGroupCell();
                    previewGroupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.new GroupCalculator(arrayList), false);
                    this.groupCells.add(previewGroupCell);
                    arrayList = new ArrayList();
                }
            }
        }

        public void fromPhotoLayout(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
            this.photosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            this.photosMap = chatAttachAlertPhotoLayout.getSelectedPhotos();
            fromPhotoArrays();
        }

        public ArrayList<MediaController.PhotoEntry> getPhotos() {
            ArrayList<MediaController.PhotoEntry> arrayList = new ArrayList<>();
            int size = this.groupCells.size();
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = this.groupCells.get(i);
                if (previewGroupCell != null && previewGroupCell.group != null && previewGroupCell.group.photos != null) {
                    arrayList.addAll(previewGroupCell.group.photos);
                }
            }
            return arrayList;
        }

        public int getPhotosCount() {
            int size = this.groupCells.size();
            int size2 = 0;
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = this.groupCells.get(i);
                if (previewGroupCell != null && previewGroupCell.group != null && previewGroupCell.group.photos != null) {
                    size2 = previewGroupCell.group.photos.size() + size2;
                }
            }
            return size2;
        }

        @Override
        public void invalidate() {
            int iMeasureHeight = measureHeight();
            if (this.lastMeasuredHeight != iMeasureHeight) {
                this.lastMeasuredHeight = iMeasureHeight;
                requestLayout();
            }
            super.invalidate();
        }

        public boolean isSeen(float f, float f2) {
            float f3 = this.viewTop;
            if (f >= f3 && f <= this.viewBottom) {
                return true;
            }
            if (f2 < f3 || f2 > this.viewBottom) {
                return f <= f3 && f2 >= this.viewBottom;
            }
            return true;
        }

        @Override
        public void onDraw(Canvas canvas) {
            float f = this.paddingTop;
            int iComputeVerticalScrollOffset = ChatAttachAlertPhotoLayoutPreview.this.listView.computeVerticalScrollOffset();
            this.viewTop = Math.max(0, iComputeVerticalScrollOffset - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding());
            this.viewBottom = (ChatAttachAlertPhotoLayoutPreview.this.listView.getMeasuredHeight() - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding()) + iComputeVerticalScrollOffset;
            canvas.save();
            canvas.translate(0.0f, this.paddingTop);
            int size = this.groupCells.size();
            int size2 = 0;
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = this.groupCells.get(i);
                float fMeasure = previewGroupCell.measure();
                previewGroupCell.y = f;
                previewGroupCell.indexStart = size2;
                float f2 = this.viewTop;
                if (f < f2 || f > this.viewBottom) {
                    float f3 = f + fMeasure;
                    if ((f3 >= f2 && f3 <= this.viewBottom) || (f <= f2 && f3 >= this.viewBottom)) {
                        if (previewGroupCell.draw(canvas)) {
                            invalidate();
                        }
                    }
                } else if (previewGroupCell.draw(canvas)) {
                    invalidate();
                }
                canvas.translate(0.0f, fMeasure);
                f += fMeasure;
                size2 += previewGroupCell.group.photos.size();
            }
            ChatActionCell chatActionCell = this.hintView;
            chatActionCell.setVisiblePart(f, chatActionCell.getMeasuredHeight());
            if (this.hintView.hasGradientService()) {
                this.hintView.drawBackground(canvas, true);
                this.hintView.drawReactions(canvas, true, null);
            }
            this.hintView.draw(canvas);
            canvas.restore();
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                canvas.save();
                PointF pointFDragTranslate = dragTranslate();
                canvas.translate(pointFDragTranslate.x, pointFDragTranslate.y);
                if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.draw(canvas, true)) {
                    invalidate();
                }
                canvas.restore();
            }
            super.onDraw(canvas);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            ChatActionCell chatActionCell = this.hintView;
            chatActionCell.layout(0, 0, chatActionCell.getMeasuredWidth(), this.hintView.getMeasuredHeight());
        }

        @Override
        public void onMeasure(int i, int i2) {
            this.hintView.measure(i, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
            if (this.lastMeasuredHeight <= 0) {
                this.lastMeasuredHeight = measureHeight();
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.lastMeasuredHeight), 1073741824));
        }

        public void onScroll() {
            int i = 0;
            boolean z = true;
            boolean z2 = this.lastGroupSeen == null;
            if (!z2) {
                boolean[] zArrGroupSeen = groupSeen();
                if (zArrGroupSeen.length == this.lastGroupSeen.length) {
                    while (true) {
                        if (i < zArrGroupSeen.length) {
                            if (zArrGroupSeen[i] != this.lastGroupSeen[i]) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                if (z) {
                    invalidate();
                }
            }
            this.lastGroupSeen = groupSeen();
            z = z2;
            if (z) {
                invalidate();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            PreviewGroupCell previewGroupCell;
            PreviewGroupCell.MediaCell mediaCell;
            float f;
            PreviewGroupCell previewGroupCell2;
            PreviewGroupCell.MediaCell mediaCell2;
            int action;
            int i;
            boolean z;
            PreviewGroupCell.MediaCell mediaCell3;
            int i2;
            ChatActivity chatActivity;
            BaseFragment lastFragment;
            int iIndexOf;
            int iIndexOf2;
            int size;
            int i3;
            PreviewGroupCell.MediaCell mediaCell4;
            PreviewGroupCell.MediaCell mediaCell5;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int size2 = this.groupCells.size();
            float f2 = 0.0f;
            int i4 = 0;
            float f3 = 0.0f;
            while (true) {
                if (i4 >= size2) {
                    previewGroupCell = null;
                    break;
                }
                previewGroupCell = this.groupCells.get(i4);
                float fMeasure = previewGroupCell.measure();
                if (y >= f3 && y <= f3 + fMeasure) {
                    break;
                }
                f3 += fMeasure;
                i4++;
            }
            if (previewGroupCell == null) {
                mediaCell = null;
                break;
            }
            int size3 = previewGroupCell.media.size();
            int i5 = 0;
            while (true) {
                if (i5 < size3) {
                    mediaCell = previewGroupCell.media.get(i5);
                    if (mediaCell != null && mediaCell.drawingRect().contains(x, y - f3)) {
                        break;
                    }
                    i5++;
                } else {
                    mediaCell = null;
                    break;
                }
            }
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                RectF rectFRect = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect();
                PointF pointFDragTranslate = dragTranslate();
                RectF rectF = new RectF();
                float f4 = pointFDragTranslate.x;
                float f5 = pointFDragTranslate.y;
                rectF.set(f4 - (rectFRect.width() / 2.0f), f5 - (rectFRect.height() / 2.0f), (rectFRect.width() / 2.0f) + f4, (rectFRect.height() / 2.0f) + f5);
                int i6 = 0;
                previewGroupCell2 = null;
                float f6 = 0.0f;
                float f7 = 0.0f;
                while (i6 < size2) {
                    PreviewGroupCell previewGroupCell3 = this.groupCells.get(i6);
                    float fMeasure2 = f6 + previewGroupCell3.measure();
                    if (fMeasure2 >= rectF.top) {
                        float f8 = rectF.bottom;
                        if (f8 >= f6) {
                            float fMin = Math.min(fMeasure2, f8) - Math.max(f6, rectF.top);
                            if (fMin > f7) {
                                f7 = fMin;
                                previewGroupCell2 = previewGroupCell3;
                            }
                        }
                    }
                    i6++;
                    f6 = fMeasure2;
                }
                if (previewGroupCell2 != null) {
                    int size4 = previewGroupCell2.media.size();
                    int i7 = 0;
                    mediaCell2 = null;
                    float f9 = 0.0f;
                    while (i7 < size4) {
                        PreviewGroupCell.MediaCell mediaCell6 = previewGroupCell2.media.get(i7);
                        if (mediaCell6 != null && mediaCell6 != ChatAttachAlertPhotoLayoutPreview.this.draggingCell && previewGroupCell2.group.photos.contains(mediaCell6.photoEntry)) {
                            RectF rectFDrawingRect = mediaCell6.drawingRect();
                            if ((mediaCell6.positionFlags & 4) > 0) {
                                rectFDrawingRect.top = f2;
                            }
                            if ((mediaCell6.positionFlags & 1) > 0) {
                                rectFDrawingRect.left = f2;
                            }
                            if ((mediaCell6.positionFlags & 2) > 0) {
                                rectFDrawingRect.right = getWidth();
                            }
                            if ((mediaCell6.positionFlags & 8) > 0) {
                                rectFDrawingRect.bottom = previewGroupCell2.height;
                            }
                            if (RectF.intersects(rectF, rectFDrawingRect)) {
                                float fMin2 = ((Math.min(rectFDrawingRect.bottom, rectF.bottom) - Math.max(rectFDrawingRect.top, rectF.top)) * (Math.min(rectFDrawingRect.right, rectF.right) - Math.max(rectFDrawingRect.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (fMin2 > 0.15f && fMin2 > f9) {
                                    f9 = fMin2;
                                    mediaCell2 = mediaCell6;
                                }
                            }
                        }
                        i7++;
                        f2 = 0.0f;
                    }
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
                action = motionEvent.getAction();
                if (action != 0 && ChatAttachAlertPhotoLayoutPreview.this.draggingCell == null) {
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                    if (!chatAttachAlertPhotoLayoutPreview.listView.scrollingByUser && ((chatAttachAlertPhotoLayoutPreview.draggingAnimator == null || !ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.isRunning()) && previewGroupCell != null && mediaCell != null && previewGroupCell.group != null && previewGroupCell.group.photos.contains(mediaCell.photoEntry))) {
                        this.tapGroupCell = previewGroupCell;
                        this.tapMediaCell = mediaCell;
                        ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchX = x;
                        ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchY = y;
                        ChatAttachAlertPhotoLayoutPreview.this.draggingCell = null;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        this.tapTime = jElapsedRealtime;
                        AndroidUtilities.runOnUIThread(new BulletinFactory$$ExternalSyntheticLambda5(this, jElapsedRealtime, this.tapMediaCell, 1), ViewConfiguration.getLongPressTimeout());
                        invalidate();
                    } else if (action == 2) {
                        i = 1;
                        if (action == 1) {
                            if (action == i) {
                            }
                            z = false;
                        } else if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                            if (previewGroupCell != null) {
                                if (previewGroupCell2 != null) {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                } else {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                }
                            } else if (previewGroupCell2 != null) {
                                previewGroupCell = null;
                                mediaCell = null;
                            } else {
                                previewGroupCell = null;
                                mediaCell = null;
                            }
                            if (previewGroupCell != null) {
                                iIndexOf = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry);
                                iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                if (iIndexOf >= 0) {
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group, true);
                                }
                                if (iIndexOf2 >= 0) {
                                    if (this.groupCells.indexOf(previewGroupCell) > this.groupCells.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell)) {
                                        iIndexOf2++;
                                    }
                                    pushToGroup(previewGroupCell, ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry, iIndexOf2);
                                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell != previewGroupCell) {
                                        size = previewGroupCell.media.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = previewGroupCell.media.get(i3);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (mediaCell4 != null) {
                                            remeasure();
                                            mediaCell4.layoutFrom(ChatAttachAlertPhotoLayoutPreview.this.draggingCell);
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell4;
                                            mediaCell4.groupCell = previewGroupCell;
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell.fromScale = 1.0f;
                                            mediaCell4.scale = 1.0f;
                                            remeasure();
                                        }
                                    }
                                }
                                ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(7, 2);
                                updateGroups();
                                toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                            }
                            stopDragging();
                        } else {
                            i = 1;
                            if (action == i) {
                            }
                            z = false;
                        }
                    } else {
                        i = 1;
                        if (action == 1) {
                            if (action == i) {
                            }
                            z = false;
                        } else if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                            if (previewGroupCell != null) {
                                if (previewGroupCell2 != null) {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                } else {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                }
                            } else if (previewGroupCell2 != null) {
                                previewGroupCell = null;
                                mediaCell = null;
                            } else {
                                previewGroupCell = null;
                                mediaCell = null;
                            }
                            if (previewGroupCell != null) {
                                iIndexOf = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry);
                                iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                if (iIndexOf >= 0) {
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group, true);
                                }
                                if (iIndexOf2 >= 0) {
                                    if (this.groupCells.indexOf(previewGroupCell) > this.groupCells.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell)) {
                                        iIndexOf2++;
                                    }
                                    pushToGroup(previewGroupCell, ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry, iIndexOf2);
                                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell != previewGroupCell) {
                                        size = previewGroupCell.media.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = previewGroupCell.media.get(i3);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (mediaCell4 != null) {
                                            remeasure();
                                            mediaCell4.layoutFrom(ChatAttachAlertPhotoLayoutPreview.this.draggingCell);
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell4;
                                            mediaCell4.groupCell = previewGroupCell;
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell.fromScale = 1.0f;
                                            mediaCell4.scale = 1.0f;
                                            remeasure();
                                        }
                                    }
                                }
                                ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(7, 2);
                                updateGroups();
                                toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                            }
                            stopDragging();
                        } else {
                            i = 1;
                            if (action == i) {
                            }
                            z = false;
                        }
                    }
                    z = true;
                } else if (action == 2 || ChatAttachAlertPhotoLayoutPreview.this.draggingCell == null || ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding) {
                    i = 1;
                    if (action == 1) {
                        if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                            if (previewGroupCell != null || mediaCell == null || mediaCell == ChatAttachAlertPhotoLayoutPreview.this.draggingCell) {
                                if (previewGroupCell2 != null || mediaCell2 == null || mediaCell2 == ChatAttachAlertPhotoLayoutPreview.this.draggingCell || mediaCell2.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                } else {
                                    previewGroupCell = previewGroupCell2;
                                    mediaCell = mediaCell2;
                                }
                            }
                            if (previewGroupCell != null && mediaCell != null && mediaCell != ChatAttachAlertPhotoLayoutPreview.this.draggingCell) {
                                iIndexOf = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry);
                                iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                if (iIndexOf >= 0) {
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group, true);
                                }
                                if (iIndexOf2 >= 0) {
                                    if (this.groupCells.indexOf(previewGroupCell) > this.groupCells.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell)) {
                                        iIndexOf2++;
                                    }
                                    pushToGroup(previewGroupCell, ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry, iIndexOf2);
                                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell != previewGroupCell) {
                                        size = previewGroupCell.media.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = previewGroupCell.media.get(i3);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (mediaCell4 != null) {
                                            remeasure();
                                            mediaCell4.layoutFrom(ChatAttachAlertPhotoLayoutPreview.this.draggingCell);
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell4;
                                            mediaCell4.groupCell = previewGroupCell;
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell.fromScale = 1.0f;
                                            mediaCell4.scale = 1.0f;
                                            remeasure();
                                        }
                                    }
                                }
                                try {
                                    ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(7, 2);
                                } catch (Exception unused) {
                                }
                                updateGroups();
                                toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                            }
                            stopDragging();
                        } else {
                            i = 1;
                            if (action == i) {
                            }
                            z = false;
                        }
                        z = true;
                    } else if (action == i || ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null || (mediaCell3 = this.tapMediaCell) == null || this.tapGroupCell == null) {
                        z = false;
                    } else {
                        if (mediaCell3.wasSpoiler && mediaCell3.spoilerRevealProgress == f) {
                            this.tapMediaCell.startRevealMedia(motionEvent.getX(), motionEvent.getY());
                        } else {
                            RectF rectFDrawingRect2 = this.tapMediaCell.drawingRect();
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(rectFDrawingRect2.right - AndroidUtilities.dp(36.4f), this.tapGroupCell.top + rectFDrawingRect2.top, rectFDrawingRect2.right, this.tapGroupCell.top + rectFDrawingRect2.top + AndroidUtilities.dp(36.4f));
                            if (!rectF2.contains(x, y - this.tapMediaCell.groupCell.y)) {
                                calcPhotoArrays();
                                ArrayList<MediaController.PhotoEntry> photos = getPhotos();
                                int iIndexOf3 = photos.indexOf(this.tapMediaCell.photoEntry);
                                ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayoutPreview.this.parentAlert;
                                if (chatAttachAlert.avatarPicker != 0) {
                                    i2 = 1;
                                } else {
                                    BaseFragment baseFragment = chatAttachAlert.baseFragment;
                                    if (baseFragment instanceof ChatActivity) {
                                        chatActivity = (ChatActivity) baseFragment;
                                        i2 = 0;
                                    } else {
                                        i2 = 4;
                                    }
                                    lastFragment = chatAttachAlert.baseFragment;
                                    if (lastFragment == null) {
                                        lastFragment = LaunchActivity.getLastFragment();
                                    }
                                    if (!ChatAttachAlertPhotoLayoutPreview.this.parentAlert.delegate.needEnterComment()) {
                                        AndroidUtilities.hideKeyboard(lastFragment.getFragmentView().findFocus());
                                        AndroidUtilities.hideKeyboard(ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getContainer().findFocus());
                                    }
                                    PhotoViewer.getInstance().setParentActivity(lastFragment, ChatAttachAlertPhotoLayoutPreview.this.resourcesProvider);
                                    PhotoViewer.getInstance().setParentAlert(ChatAttachAlertPhotoLayoutPreview.this.parentAlert);
                                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlertPhotoLayoutPreview.this.parentAlert;
                                    photoViewer.setMaxSelectedPhotos(chatAttachAlert2.maxSelectedPhotos, chatAttachAlert2.allowOrder);
                                    this.photoViewerProvider.init(photos);
                                    PhotoViewer.getInstance().openPhotoForSelect(new ArrayList<>(photos), iIndexOf3, i2, false, this.photoViewerProvider, chatActivity);
                                    if (ChatAttachAlertPhotoLayoutPreview.this.photoLayout.captionForAllMedia()) {
                                        PhotoViewer.getInstance().setCaption(ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getCommentView().getText());
                                    }
                                }
                                chatActivity = null;
                                lastFragment = chatAttachAlert.baseFragment;
                                if (lastFragment == null) {
                                    lastFragment = LaunchActivity.getLastFragment();
                                }
                                if (!ChatAttachAlertPhotoLayoutPreview.this.parentAlert.delegate.needEnterComment()) {
                                    AndroidUtilities.hideKeyboard(lastFragment.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getContainer().findFocus());
                                }
                                PhotoViewer.getInstance().setParentActivity(lastFragment, ChatAttachAlertPhotoLayoutPreview.this.resourcesProvider);
                                PhotoViewer.getInstance().setParentAlert(ChatAttachAlertPhotoLayoutPreview.this.parentAlert);
                                PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                                ChatAttachAlert chatAttachAlert3 = ChatAttachAlertPhotoLayoutPreview.this.parentAlert;
                                photoViewer2.setMaxSelectedPhotos(chatAttachAlert3.maxSelectedPhotos, chatAttachAlert3.allowOrder);
                                this.photoViewerProvider.init(photos);
                                PhotoViewer.getInstance().openPhotoForSelect(new ArrayList<>(photos), iIndexOf3, i2, false, this.photoViewerProvider, chatActivity);
                                if (ChatAttachAlertPhotoLayoutPreview.this.photoLayout.captionForAllMedia()) {
                                    PhotoViewer.getInstance().setCaption(ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getCommentView().getText());
                                }
                            } else if (ChatAttachAlertPhotoLayoutPreview.this.getSelectedItemsCount() > 1) {
                                MediaController.PhotoEntry photoEntry = this.tapMediaCell.photoEntry;
                                int iIndexOf4 = this.tapGroupCell.group.photos.indexOf(photoEntry);
                                if (iIndexOf4 >= 0) {
                                    saveDeletedImageId(photoEntry);
                                    PreviewGroupCell previewGroupCell4 = this.tapGroupCell;
                                    previewGroupCell4.group.photos.remove(iIndexOf4);
                                    previewGroupCell4.setGroup(previewGroupCell4.group, true);
                                    updateGroups();
                                    toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                                    int i8 = this.undoViewId + 1;
                                    this.undoViewId = i8;
                                    ChatAttachAlertPhotoLayoutPreview.this.undoView.showWithAction(0L, 82, photoEntry, null, new ShareTopView$$ExternalSyntheticLambda3(this, previewGroupCell4, photoEntry, iIndexOf4, 1));
                                    postDelayed(new EmojiView$$ExternalSyntheticLambda9(this, i8, 1), 4000L);
                                }
                                if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
                                }
                            }
                            this.tapMediaCell = null;
                            this.tapTime = 0L;
                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = null;
                            this.draggingT = 0.0f;
                        }
                        z = true;
                    }
                } else {
                    ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchX = x;
                    ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchY = y;
                    z = true;
                    if (!this.scrollerStarted) {
                        this.scrollerStarted = true;
                        postDelayed(this.scroller, 16L);
                    }
                    invalidate();
                }
                if (action != 1 || action == 3) {
                    this.tapTime = 0L;
                    removeCallbacks(this.scroller);
                    this.scrollerStarted = false;
                    if (!z) {
                        stopDragging();
                        return true;
                    }
                }
                return z;
            }
            f = 0.0f;
            previewGroupCell2 = null;
            mediaCell2 = null;
            action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    i = 1;
                    if (action == 1) {
                        if (action == i) {
                        }
                        z = false;
                    } else {
                        if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                            if (previewGroupCell != null) {
                                if (previewGroupCell2 != null) {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                } else {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                }
                            } else if (previewGroupCell2 != null) {
                                previewGroupCell = null;
                                mediaCell = null;
                            } else {
                                previewGroupCell = null;
                                mediaCell = null;
                            }
                            if (previewGroupCell != null) {
                                iIndexOf = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry);
                                iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                if (iIndexOf >= 0) {
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group, true);
                                }
                                if (iIndexOf2 >= 0) {
                                    if (this.groupCells.indexOf(previewGroupCell) > this.groupCells.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell)) {
                                        iIndexOf2++;
                                    }
                                    pushToGroup(previewGroupCell, ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry, iIndexOf2);
                                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell != previewGroupCell) {
                                        size = previewGroupCell.media.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = previewGroupCell.media.get(i3);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (mediaCell4 != null) {
                                            remeasure();
                                            mediaCell4.layoutFrom(ChatAttachAlertPhotoLayoutPreview.this.draggingCell);
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell4;
                                            mediaCell4.groupCell = previewGroupCell;
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell.fromScale = 1.0f;
                                            mediaCell4.scale = 1.0f;
                                            remeasure();
                                        }
                                    }
                                }
                                ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(7, 2);
                                updateGroups();
                                toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                            }
                            stopDragging();
                        } else {
                            i = 1;
                            if (action == i) {
                            }
                            z = false;
                        }
                        z = true;
                    }
                } else {
                    i = 1;
                    if (action == 1) {
                        if (action == i) {
                        }
                        z = false;
                    } else {
                        if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                            if (previewGroupCell != null) {
                                if (previewGroupCell2 != null) {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                } else {
                                    previewGroupCell = null;
                                    mediaCell = null;
                                }
                            } else if (previewGroupCell2 != null) {
                                previewGroupCell = null;
                                mediaCell = null;
                            } else {
                                previewGroupCell = null;
                                mediaCell = null;
                            }
                            if (previewGroupCell != null) {
                                iIndexOf = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry);
                                iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                if (iIndexOf >= 0) {
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group, true);
                                }
                                if (iIndexOf2 >= 0) {
                                    if (this.groupCells.indexOf(previewGroupCell) > this.groupCells.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell)) {
                                        iIndexOf2++;
                                    }
                                    pushToGroup(previewGroupCell, ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry, iIndexOf2);
                                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell != previewGroupCell) {
                                        size = previewGroupCell.media.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = previewGroupCell.media.get(i3);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (mediaCell4 != null) {
                                            remeasure();
                                            mediaCell4.layoutFrom(ChatAttachAlertPhotoLayoutPreview.this.draggingCell);
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell4;
                                            mediaCell4.groupCell = previewGroupCell;
                                            ChatAttachAlertPhotoLayoutPreview.this.draggingCell.fromScale = 1.0f;
                                            mediaCell4.scale = 1.0f;
                                            remeasure();
                                        }
                                    }
                                }
                                ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(7, 2);
                                updateGroups();
                                toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                            }
                            stopDragging();
                        } else {
                            i = 1;
                            if (action == i) {
                            }
                            z = false;
                        }
                        z = true;
                    }
                }
            } else if (action == 2) {
                i = 1;
                if (action == 1) {
                    if (action == i) {
                    }
                    z = false;
                } else {
                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                        if (previewGroupCell != null) {
                            if (previewGroupCell2 != null) {
                                previewGroupCell = null;
                                mediaCell = null;
                            } else {
                                previewGroupCell = null;
                                mediaCell = null;
                            }
                        } else if (previewGroupCell2 != null) {
                            previewGroupCell = null;
                            mediaCell = null;
                        } else {
                            previewGroupCell = null;
                            mediaCell = null;
                        }
                        if (previewGroupCell != null) {
                            iIndexOf = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry);
                            iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                            if (iIndexOf >= 0) {
                                ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group, true);
                            }
                            if (iIndexOf2 >= 0) {
                                if (this.groupCells.indexOf(previewGroupCell) > this.groupCells.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell)) {
                                    iIndexOf2++;
                                }
                                pushToGroup(previewGroupCell, ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry, iIndexOf2);
                                if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell != previewGroupCell) {
                                    size = previewGroupCell.media.size();
                                    i3 = 0;
                                    while (true) {
                                        if (i3 >= size) {
                                            mediaCell4 = null;
                                            break;
                                        }
                                        mediaCell5 = previewGroupCell.media.get(i3);
                                        if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                            mediaCell4 = mediaCell5;
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (mediaCell4 != null) {
                                        remeasure();
                                        mediaCell4.layoutFrom(ChatAttachAlertPhotoLayoutPreview.this.draggingCell);
                                        ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell4;
                                        mediaCell4.groupCell = previewGroupCell;
                                        ChatAttachAlertPhotoLayoutPreview.this.draggingCell.fromScale = 1.0f;
                                        mediaCell4.scale = 1.0f;
                                        remeasure();
                                    }
                                }
                            }
                            ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(7, 2);
                            updateGroups();
                            toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                        }
                        stopDragging();
                    } else {
                        i = 1;
                        if (action == i) {
                        }
                        z = false;
                    }
                    z = true;
                }
            } else {
                i = 1;
                if (action == 1) {
                    if (action == i) {
                    }
                    z = false;
                } else {
                    if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                        if (previewGroupCell != null) {
                            if (previewGroupCell2 != null) {
                                previewGroupCell = null;
                                mediaCell = null;
                            } else {
                                previewGroupCell = null;
                                mediaCell = null;
                            }
                        } else if (previewGroupCell2 != null) {
                            previewGroupCell = null;
                            mediaCell = null;
                        } else {
                            previewGroupCell = null;
                            mediaCell = null;
                        }
                        if (previewGroupCell != null) {
                            iIndexOf = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry);
                            iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                            if (iIndexOf >= 0) {
                                ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.setGroup(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.group, true);
                            }
                            if (iIndexOf2 >= 0) {
                                if (this.groupCells.indexOf(previewGroupCell) > this.groupCells.indexOf(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell)) {
                                    iIndexOf2++;
                                }
                                pushToGroup(previewGroupCell, ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry, iIndexOf2);
                                if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell != previewGroupCell) {
                                    size = previewGroupCell.media.size();
                                    i3 = 0;
                                    while (true) {
                                        if (i3 >= size) {
                                            mediaCell4 = null;
                                            break;
                                        }
                                        mediaCell5 = previewGroupCell.media.get(i3);
                                        if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                            mediaCell4 = mediaCell5;
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (mediaCell4 != null) {
                                        remeasure();
                                        mediaCell4.layoutFrom(ChatAttachAlertPhotoLayoutPreview.this.draggingCell);
                                        ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell4;
                                        mediaCell4.groupCell = previewGroupCell;
                                        ChatAttachAlertPhotoLayoutPreview.this.draggingCell.fromScale = 1.0f;
                                        mediaCell4.scale = 1.0f;
                                        remeasure();
                                    }
                                }
                            }
                            ChatAttachAlertPhotoLayoutPreview.this.performHapticFeedback(7, 2);
                            updateGroups();
                            toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                        }
                        stopDragging();
                    } else {
                        i = 1;
                        if (action == i) {
                        }
                        z = false;
                    }
                    z = true;
                }
            }
            if (action != 1) {
                this.tapTime = 0L;
                removeCallbacks(this.scroller);
                this.scrollerStarted = false;
                if (!z) {
                    stopDragging();
                    return true;
                }
            } else {
                this.tapTime = 0L;
                removeCallbacks(this.scroller);
                this.scrollerStarted = false;
                if (!z) {
                    stopDragging();
                    return true;
                }
            }
            return z;
        }

        public void remeasure() {
            float f = this.paddingTop;
            int size = this.groupCells.size();
            int size2 = 0;
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = this.groupCells.get(i);
                float fMeasure = previewGroupCell.measure();
                previewGroupCell.y = f;
                previewGroupCell.indexStart = size2;
                f += fMeasure;
                size2 += previewGroupCell.group.photos.size();
            }
        }

        public void saveDeletedImageId(MediaController.PhotoEntry photoEntry) {
            if (ChatAttachAlertPhotoLayoutPreview.this.photoLayout == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(ChatAttachAlertPhotoLayoutPreview.this.photoLayout.getSelectedPhotos().entrySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Map.Entry) arrayList.get(i)).getValue() == photoEntry) {
                    this.deletedPhotos.put(photoEntry, ((Map.Entry) arrayList.get(i)).getKey());
                    return;
                }
            }
        }

        public void startDragging(PreviewGroupCell.MediaCell mediaCell) {
            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell;
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
            chatAttachAlertPhotoLayoutPreview.draggingCellGroupY = chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.y;
            int i = 0;
            ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding = false;
            this.draggingT = 0.0f;
            invalidate();
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
            }
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.addUpdateListener(new ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda0(this, i));
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.setDuration(200L);
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.start();
        }

        public void stopDragging() {
            int i = 1;
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
            }
            PointF pointFDragTranslate = dragTranslate();
            this.savedDraggingT = this.draggingT;
            this.savedDragFromX = pointFDragTranslate.x;
            this.savedDragFromY = pointFDragTranslate.y;
            ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding = true;
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator = ValueAnimator.ofFloat(this.savedDraggingT, 0.0f);
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.addUpdateListener(new ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda0(this, i));
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell = null;
                    ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding = false;
                    PreviewGroupsView.this.invalidate();
                }
            });
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.setDuration(200L);
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.start();
            invalidate();
        }

        public void toPhotoLayout(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
            int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
            calcPhotoArrays();
            chatAttachAlertPhotoLayout.updateSelected(this.selectedPhotos, this.photosOrder, z);
            if (size != this.photosOrder.size()) {
                ChatAttachAlertPhotoLayoutPreview.this.parentAlert.updateCountButton(1);
            }
        }
    }

    public ChatAttachAlertPhotoLayoutPreview(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.durationMultiplier = 1L;
        this.draggingCellTouchX = 0.0f;
        this.draggingCellTouchY = 0.0f;
        this.draggingCellTop = 0.0f;
        this.draggingCellLeft = 0.0f;
        this.draggingCellFromWidth = 0.0f;
        this.draggingCellFromHeight = 0.0f;
        this.draggingCell = null;
        this.draggingCellHiding = false;
        this.draggingCellGroupY = 0.0f;
        this.shown = false;
        this.ignoreLayout = false;
        Point point = AndroidUtilities.displaySize;
        this.isPortrait = point.y > point.x;
        this.themeDelegate = resourcesProvider;
        this.occupyNavigationBar = true;
        setWillNotDraw(false);
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        this.header = new TextView(context);
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, actionBarMenuCreateMenu, 0, 0, this.resourcesProvider) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(ChatAttachAlertPhotoLayoutPreview.this.header.getText());
            }
        };
        this.parentAlert.actionBar.addView(actionBarMenuItem, 0, LayoutHelper.createFrame(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        this.header.setImportantForAccessibility(2);
        this.header.setGravity(3);
        this.header.setSingleLine(true);
        this.header.setLines(1);
        this.header.setMaxLines(1);
        this.header.setEllipsize(TextUtils.TruncateAt.END);
        this.header.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        this.header.setText(LocaleController.getString(R.string.AttachMediaPreview));
        this.header.setTypeface(AndroidUtilities.bold());
        this.header.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        this.header.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        this.header.setAlpha(0.0f);
        actionBarMenuItem.addView(this.header, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourcesProvider) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onScrolled(int i, int i2) {
                ChatAttachAlertPhotoLayoutPreview.this.invalidate();
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                chatAttachAlertPhotoLayoutPreview.parentAlert.updateLayout(chatAttachAlertPhotoLayoutPreview, true, i2);
                ChatAttachAlertPhotoLayoutPreview.this.groupsView.onScroll();
                super.onScrolled(i, i2);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public int getItemCount() {
                return 1;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new RecyclerListView.Holder(ChatAttachAlertPhotoLayoutPreview.this.groupsView);
            }
        });
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setClipChildren(false);
        this.listView.setClipToPadding(false);
        this.listView.setOverScrollMode(2);
        this.listView.setVerticalScrollBarEnabled(false);
        PreviewGroupsView previewGroupsView = new PreviewGroupsView(context);
        this.groupsView = previewGroupsView;
        previewGroupsView.setClipToPadding(true);
        this.groupsView.setClipChildren(true);
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.photoLayout = this.parentAlert.getPhotoLayout();
        this.groupsView.deletedPhotos.clear();
        this.groupsView.fromPhotoLayout(this.photoLayout);
        UndoView undoView = new UndoView(context, null, false, this.parentAlert.parentThemeDelegate);
        this.undoView = undoView;
        undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
        addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
        this.videoPlayImage = context.getResources().getDrawable(R.drawable.play_mini_video);
    }

    public static float access$1416(ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview, float f) {
        float f2 = chatAttachAlertPhotoLayoutPreview.draggingCellTouchY + f;
        chatAttachAlertPhotoLayoutPreview.draggingCellTouchY = f2;
        return f2;
    }

    public void lambda$onShow$0(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        int currentItemTop = attachAlertLayout.getCurrentItemTop();
        int listTopPadding = attachAlertLayout.getListTopPadding();
        RecyclerListView recyclerListView = this.listView;
        if (currentItemTop > AndroidUtilities.dp(7.0f)) {
            listTopPadding -= currentItemTop;
        }
        recyclerListView.scrollBy(0, listTopPadding);
    }

    public void lambda$onShow$1() {
        if (!this.shown || this.parentAlert.getPhotoLayout() == null) {
            return;
        }
        this.parentAlert.getPhotoLayout().previewItem.setIcon(R.drawable.ic_ab_back);
        this.parentAlert.getPhotoLayout().previewItem.setText(LocaleController.getString(R.string.Back));
        this.parentAlert.getPhotoLayout().previewItem.setRightIcon(0);
    }

    @Override
    public void applyCaption(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.applyCaption(charSequence);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Drawable wallpaperDrawable;
        int i;
        ChatActivity.ThemeDelegate themeDelegate = this.parentAlert.parentThemeDelegate;
        boolean z = false;
        if (themeDelegate != null && (wallpaperDrawable = themeDelegate.getWallpaperDrawable()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (AndroidUtilities.isTablet()) {
                i = 16;
            } else {
                Point point = AndroidUtilities.displaySize;
                i = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < ActionBar.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / ActionBar.getCurrentActionBarHeight())) * i);
            }
            int iMax = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, iMax, getWidth(), getHeight());
            wallpaperDrawable.setBounds(0, iMax, getWidth(), AndroidUtilities.displaySize.y + iMax);
            wallpaperDrawable.draw(canvas);
            z = true;
        }
        super.dispatchDraw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.listView;
            recyclerListView.setTopGlowOffset(recyclerListView.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        this.listView.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.groupsView.getPhotosCount();
    }

    public Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : (Drawable) Theme.defaultChatDrawables.get(str);
    }

    public void invalidateGroupsView() {
        this.groupsView.invalidate();
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    @Override
    public boolean onBackPressed() {
        this.parentAlert.updatePhotoPreview(false);
        return true;
    }

    @Override
    public void onHidden() {
        MediaController.PhotoEntry photoEntry;
        this.draggingCell = null;
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(false, 0);
        }
        ArrayList arrayList = this.groupsView.groupCells;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList<PreviewGroupsView.PreviewGroupCell.MediaCell> arrayList2 = ((PreviewGroupsView.PreviewGroupCell) obj).media;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell = arrayList2.get(i2);
                i2++;
                PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell2 = mediaCell;
                if (mediaCell2.wasSpoiler && (photoEntry = mediaCell2.photoEntry) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public void onHide() {
        this.shown = false;
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.header.animate().alpha(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        this.headerAnimator = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && this.parentAlert.getPhotoLayout() != null) {
            this.parentAlert.getPhotoLayout().previewItem.setIcon(R.drawable.msg_view_file);
            this.parentAlert.getPhotoLayout().previewItem.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            this.parentAlert.getPhotoLayout().previewItem.setRightIcon(R.drawable.msg_arrowright);
        }
        this.groupsView.toPhotoLayout(this.photoLayout, true);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Point point = AndroidUtilities.displaySize;
        boolean z2 = point.y > point.x;
        if (this.isPortrait != z2) {
            this.isPortrait = z2;
            int size = this.groupsView.groupCells.size();
            for (int i5 = 0; i5 < size; i5++) {
                PreviewGroupsView.PreviewGroupCell previewGroupCell = (PreviewGroupsView.PreviewGroupCell) this.groupsView.groupCells.get(i5);
                if (previewGroupCell.group.photos.size() == 1) {
                    previewGroupCell.setGroup(previewGroupCell.group, true);
                }
            }
        }
    }

    @Override
    public void onMenuItemClick(int i) {
        try {
            this.parentAlert.getPhotoLayout().onMenuItemClick(i);
        } catch (Exception unused) {
        }
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        float f;
        this.ignoreLayout = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
        if (AndroidUtilities.isTablet()) {
            this.paddingTop = (i2 / 5) * 2;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.paddingTop = (int) (i2 / 3.5f);
            } else {
                this.paddingTop = (i2 / 5) * 2;
            }
        }
        int iDp = this.paddingTop - AndroidUtilities.dp(52.0f);
        this.paddingTop = iDp;
        if (iDp < 0) {
            this.paddingTop = 0;
        }
        if (this.listView.getPaddingTop() != this.paddingTop || this.listView.getPaddingBottom() != this.listPaddingBottom) {
            RecyclerListView recyclerListView = this.listView;
            recyclerListView.setPaddingWithoutRequestLayout(recyclerListView.getPaddingLeft(), this.paddingTop, this.listView.getPaddingRight(), this.listPaddingBottom);
            invalidate();
        }
        TextView textView = this.header;
        if (AndroidUtilities.isTablet()) {
            f = 20.0f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            if (point2.x > point2.y) {
                f = 18.0f;
            } else {
                f = 20.0f;
            }
        }
        textView.setTextSize(f);
        this.ignoreLayout = false;
    }

    @Override
    public void onSelectedItemsCountChanged(int i) {
        if (i > 1) {
            this.parentAlert.selectedMenuItem.showSubItem(0);
        } else {
            this.parentAlert.selectedMenuItem.hideSubItem(0);
        }
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.shown = true;
        if (attachAlertLayout instanceof ChatAttachAlertPhotoLayout) {
            this.photoLayout = (ChatAttachAlertPhotoLayout) attachAlertLayout;
            this.groupsView.deletedPhotos.clear();
            this.groupsView.fromPhotoLayout(this.photoLayout);
            this.groupsView.requestLayout();
            this.layoutManager.scrollToPositionWithOffset(0, 0);
            this.listView.post(new ChatAttachAlertPhotoLayout$$ExternalSyntheticLambda25(this, (ChatAttachAlertPhotoLayout) attachAlertLayout));
            postDelayed(new GroupCallPip$$ExternalSyntheticLambda2(this, 2), 250L);
            this.groupsView.toPhotoLayout(this.photoLayout, false);
        } else {
            scrollToTop();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.header.animate().alpha(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.headerAnimator = interpolator;
        interpolator.start();
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public boolean shouldHideBottomButtons() {
        return true;
    }

    public void startMediaCrossfade() {
        ArrayList arrayList = this.groupsView.groupCells;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList<PreviewGroupsView.PreviewGroupCell.MediaCell> arrayList2 = ((PreviewGroupsView.PreviewGroupCell) obj).media;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell = arrayList2.get(i2);
                i2++;
                mediaCell.startCrossfade();
            }
        }
    }

    public class GroupCalculator {
        float height;
        int maxX;
        int maxY;
        ArrayList<MediaController.PhotoEntry> photos;
        int width;
        public ArrayList<MessageObject.GroupedMessagePosition> posArray = new ArrayList<>();
        public HashMap<MediaController.PhotoEntry, MessageObject.GroupedMessagePosition> positions = new HashMap<>();
        private final int maxSizeWidth = 1000;

        public GroupCalculator(ArrayList<MediaController.PhotoEntry> arrayList) {
            this.photos = arrayList;
            calculate();
        }

        private float getLeft(MessageObject.GroupedMessagePosition groupedMessagePosition, int i, int i2, int i3) {
            int i4 = (i2 - i) + 1;
            float[] fArr = new float[i4];
            float f = 0.0f;
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.posArray.get(i5);
                if (groupedMessagePosition2 != groupedMessagePosition && groupedMessagePosition2.maxX < i3) {
                    int iMin = Math.min((int) groupedMessagePosition2.maxY, i2) - i;
                    for (int iMax = Math.max(groupedMessagePosition2.minY - i, 0); iMax <= iMin; iMax++) {
                        fArr[iMax] = fArr[iMax] + groupedMessagePosition2.pw;
                    }
                }
            }
            for (int i6 = 0; i6 < i4; i6++) {
                float f2 = fArr[i6];
                if (f < f2) {
                    f = f2;
                }
            }
            return f;
        }

        private float getTop(MessageObject.GroupedMessagePosition groupedMessagePosition, int i) {
            int i2 = this.maxX + 1;
            float[] fArr = new float[i2];
            float f = 0.0f;
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = this.posArray.get(i3);
                if (groupedMessagePosition2 != groupedMessagePosition && groupedMessagePosition2.maxY < i) {
                    for (int i4 = groupedMessagePosition2.minX; i4 <= groupedMessagePosition2.maxX; i4++) {
                        fArr[i4] = fArr[i4] + groupedMessagePosition2.ph;
                    }
                }
            }
            for (int i5 = 0; i5 < i2; i5++) {
                float f2 = fArr[i5];
                if (f < f2) {
                    f = f2;
                }
            }
            return f;
        }

        private float multiHeight(float[] fArr, int i, int i2) {
            float f = 0.0f;
            while (i < i2) {
                f += fArr[i];
                i++;
            }
            return 1000.0f / f;
        }

        public void calculate(ArrayList<MediaController.PhotoEntry> arrayList) {
            this.photos = arrayList;
            calculate();
        }

        public float getHeight() {
            float[] fArr = new float[10];
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i = 0; i < size; i++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = this.posArray.get(i);
                float f = groupedMessagePosition.ph;
                for (int i2 = groupedMessagePosition.minX; i2 <= groupedMessagePosition.maxX; i2++) {
                    fArr[i2] = fArr[i2] + f;
                }
            }
            float f2 = fArr[0];
            for (int i3 = 1; i3 < 10; i3++) {
                float f3 = fArr[i3];
                if (f2 < f3) {
                    f2 = f3;
                }
            }
            return f2;
        }

        public int getWidth() {
            int[] iArr = new int[10];
            Arrays.fill(iArr, 0);
            int size = this.posArray.size();
            for (int i = 0; i < size; i++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = this.posArray.get(i);
                int i2 = groupedMessagePosition.pw;
                for (int i3 = groupedMessagePosition.minY; i3 <= groupedMessagePosition.maxY; i3++) {
                    iArr[i3] = iArr[i3] + i2;
                }
            }
            int i4 = iArr[0];
            for (int i5 = 1; i5 < 10; i5++) {
                int i6 = iArr[i5];
                if (i4 < i6) {
                    i4 = i6;
                }
            }
            return i4;
        }

        public class MessageGroupedLayoutAttempt {
            public float[] heights;
            public int[] lineCounts;

            public MessageGroupedLayoutAttempt(int i, int i2, float f, float f2) {
                this.lineCounts = new int[]{i, i2};
                this.heights = new float[]{f, f2};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, float f, float f2, float f3) {
                this.lineCounts = new int[]{i, i2, i3};
                this.heights = new float[]{f, f2, f3};
            }

            public MessageGroupedLayoutAttempt(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
                this.lineCounts = new int[]{i, i2, i3, i4};
                this.heights = new float[]{f, f2, f3, f4};
            }
        }

        public void calculate() {
            int i;
            ArrayList arrayList;
            int i2;
            int i3;
            MessageObject.GroupedMessagePosition groupedMessagePosition;
            boolean zBooleanValue;
            int intValue;
            int i4 = 8;
            int size = this.photos.size();
            this.posArray.clear();
            this.positions.clear();
            int i5 = 0;
            if (size == 0) {
                this.width = 0;
                this.height = 0.0f;
                this.maxX = 0;
                this.maxY = 0;
                return;
            }
            this.posArray.ensureCapacity(size);
            char[] cArr = new char[size];
            int i6 = 0;
            float f = 1.0f;
            boolean z = false;
            while (i6 < size) {
                MediaController.PhotoEntry photoEntry = this.photos.get(i6);
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                groupedMessagePosition2.last = i6 == size + (-1);
                MediaController.CropState cropState = photoEntry.cropState;
                int i7 = cropState != null ? cropState.width : photoEntry.width;
                int i8 = cropState != null ? cropState.height : photoEntry.height;
                if (ChatAttachAlertPhotoLayoutPreview.photoRotate.containsKey(photoEntry)) {
                    zBooleanValue = ((Boolean) ChatAttachAlertPhotoLayoutPreview.photoRotate.get(photoEntry)).booleanValue();
                } else {
                    try {
                        if (photoEntry.isVideo) {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(photoEntry.path);
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                            if (strExtractMetadata == null || !(strExtractMetadata.equals("90") || strExtractMetadata.equals("270"))) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = true;
                            }
                        } else {
                            ExifInterface exifInterface = new ExifInterface(photoEntry.path);
                            ExifInterface.ExifAttribute exifAttribute = exifInterface.getExifAttribute("Orientation");
                            if (exifAttribute == null) {
                                intValue = 1;
                            } else {
                                try {
                                    intValue = exifAttribute.getIntValue(exifInterface.mExifByteOrder);
                                } catch (NumberFormatException unused) {
                                    intValue = 1;
                                }
                            }
                            if (intValue == 6 || intValue == i4) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    ChatAttachAlertPhotoLayoutPreview.photoRotate.put(photoEntry, Boolean.valueOf(zBooleanValue));
                }
                if (zBooleanValue) {
                    int i9 = i8;
                    i8 = i7;
                    i7 = i9;
                }
                float f2 = i7 / i8;
                groupedMessagePosition2.aspectRatio = f2;
                cArr[i6] = f2 > 1.2f ? 'w' : f2 < 0.8f ? 'n' : 'q';
                f += f2;
                if (f2 > 2.0f) {
                    z = true;
                }
                this.positions.put(photoEntry, groupedMessagePosition2);
                this.posArray.add(groupedMessagePosition2);
                i6++;
                i4 = 8;
            }
            String str = new String(cArr);
            int iDp = AndroidUtilities.dp(120.0f);
            float fDp = AndroidUtilities.dp(120.0f);
            Point point = AndroidUtilities.displaySize;
            int iMin = (int) (fDp / (Math.min(point.x, point.y) / 1000.0f));
            float fDp2 = AndroidUtilities.dp(40.0f);
            Point point2 = AndroidUtilities.displaySize;
            int iMin2 = (int) (fDp2 / (Math.min(point2.x, point2.y) / 1000.0f));
            float f3 = f / size;
            float fDp3 = AndroidUtilities.dp(100.0f) / 814.0f;
            if (size == 1) {
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = this.posArray.get(0);
                int backgroundPaddingLeft = AndroidUtilities.displaySize.x - (ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getBackgroundPaddingLeft() * 2);
                Point point3 = AndroidUtilities.displaySize;
                groupedMessagePosition3.set(0, 0, 0, 0, 800, ((backgroundPaddingLeft * 0.8f) / groupedMessagePosition3.aspectRatio) / (Math.max(point3.x, point3.y) * 0.5f), 15);
            } else {
                if (z || !(size == 2 || size == 3 || size == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i10 = 0; i10 < size; i10++) {
                        if (f3 > 1.1f) {
                            fArr[i10] = Math.max(1.0f, this.posArray.get(i10).aspectRatio);
                        } else {
                            fArr[i10] = Math.min(1.0f, this.posArray.get(i10).aspectRatio);
                        }
                        fArr[i10] = Math.max(0.66667f, Math.min(1.7f, fArr[i10]));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i11 = 1;
                    while (i11 < size2) {
                        int i12 = size2 - i11;
                        if (i11 > 3 || i12 > 3) {
                            arrayList = arrayList2;
                        } else {
                            arrayList = arrayList2;
                            arrayList.add(new MessageGroupedLayoutAttempt(i11, i12, multiHeight(fArr, 0, i11), multiHeight(fArr, i11, size2)));
                        }
                        i11++;
                        arrayList2 = arrayList;
                    }
                    ArrayList arrayList3 = arrayList2;
                    for (int i13 = 1; i13 < size2 - 1; i13++) {
                        int i14 = 1;
                        while (true) {
                            int i15 = size2 - i13;
                            if (i14 < i15) {
                                int i16 = i15 - i14;
                                if (i13 <= 3) {
                                    if (i14 <= (f3 < 0.85f ? 4 : 3) && i16 <= 3) {
                                        int i17 = i13 + i14;
                                        arrayList3.add(new MessageGroupedLayoutAttempt(i13, i14, i16, multiHeight(fArr, 0, i13), multiHeight(fArr, i13, i17), multiHeight(fArr, i17, size2)));
                                    }
                                }
                                i14++;
                                fArr = fArr;
                            }
                        }
                    }
                    float[] fArr2 = fArr;
                    int i18 = 1;
                    while (i18 < size2 - 2) {
                        int i19 = 1;
                        while (true) {
                            int i20 = size2 - i18;
                            if (i19 < i20) {
                                int i21 = 1;
                                while (true) {
                                    int i22 = i20 - i19;
                                    if (i21 < i22) {
                                        int i23 = i22 - i21;
                                        if (i18 > 3 || i19 > 3 || i21 > 3 || i23 > 3) {
                                            i = i20;
                                        } else {
                                            int i24 = i18 + i19;
                                            i = i20;
                                            int i25 = i24 + i21;
                                            arrayList3.add(new MessageGroupedLayoutAttempt(i18, i19, i21, i23, multiHeight(fArr2, i5, i18), multiHeight(fArr2, i18, i24), multiHeight(fArr2, i24, i25), multiHeight(fArr2, i25, size2)));
                                        }
                                        i21++;
                                        i20 = i;
                                        i5 = 0;
                                    }
                                }
                                i19++;
                                i5 = 0;
                            }
                        }
                        i18++;
                        i5 = 0;
                    }
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f4 = 0.0f;
                    for (int i26 = 0; i26 < arrayList3.size(); i26++) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList3.get(i26);
                        float f5 = Float.MAX_VALUE;
                        float f6 = 0.0f;
                        int i27 = 0;
                        while (true) {
                            float[] fArr3 = messageGroupedLayoutAttempt2.heights;
                            if (i27 >= fArr3.length) {
                                break;
                            }
                            float f7 = fArr3[i27];
                            f6 += f7;
                            if (f7 < f5) {
                                f5 = f7;
                            }
                            i27++;
                        }
                        float fAbs = Math.abs(f6 - 1332.0f);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        if (iArr.length > 1) {
                            int i28 = iArr[0];
                            int i29 = iArr[1];
                            if (i28 <= i29 && (iArr.length <= 2 || i29 <= iArr[2])) {
                                if (iArr.length > 3 && iArr[2] > iArr[3]) {
                                }
                            }
                            fAbs *= 1.2f;
                        }
                        if (f5 < iMin) {
                            fAbs *= 1.5f;
                        }
                        if (messageGroupedLayoutAttempt == null || fAbs < f4) {
                            messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                            f4 = fAbs;
                        }
                    }
                    if (messageGroupedLayoutAttempt == null) {
                        return;
                    }
                    int i30 = 0;
                    int i31 = 0;
                    while (true) {
                        int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                        if (i31 >= iArr2.length) {
                            break;
                        }
                        int i32 = iArr2[i31];
                        float f8 = messageGroupedLayoutAttempt.heights[i31];
                        int i33 = 1000;
                        int i34 = 0;
                        MessageObject.GroupedMessagePosition groupedMessagePosition4 = null;
                        while (i34 < i32) {
                            int i35 = (int) (fArr2[i30] * f8);
                            i33 -= i35;
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = this.posArray.get(i30);
                            int i36 = i31 == 0 ? 4 : 0;
                            if (i31 == messageGroupedLayoutAttempt.lineCounts.length - 1) {
                                i36 |= 8;
                            }
                            if (i34 == 0) {
                                i36 |= 1;
                                groupedMessagePosition4 = groupedMessagePosition5;
                            }
                            if (i34 == i32 - 1) {
                                i36 |= 2;
                                groupedMessagePosition4 = groupedMessagePosition5;
                            }
                            int i37 = i34;
                            groupedMessagePosition5.set(i37, i34, i31, i31, i35, Math.max(fDp3, f8 / 814.0f), i36);
                            i30++;
                            i34 = i37 + 1;
                        }
                        int i38 = i31;
                        if (groupedMessagePosition4 != null) {
                            groupedMessagePosition4.pw += i33;
                            groupedMessagePosition4.spanSize += i33;
                        }
                        i31 = i38 + 1;
                    }
                } else if (size == 2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition6 = this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition7 = this.posArray.get(1);
                    if (str.equals("ww") && f3 > ((double) 1.2285012f) * 1.4d) {
                        float f9 = groupedMessagePosition6.aspectRatio;
                        float f10 = groupedMessagePosition7.aspectRatio;
                        if (f9 - f10 < 0.2d) {
                            float fRound = Math.round(Math.min(1000.0f / f9, Math.min(1000.0f / f10, 407.0f))) / 814.0f;
                            groupedMessagePosition6.set(0, 0, 0, 0, 1000, fRound, 7);
                            groupedMessagePosition7.set(0, 0, 1, 1, 1000, fRound, 11);
                        } else if (str.equals("ww")) {
                            float f11 = 500;
                            float fRound2 = Math.round(Math.min(f11 / groupedMessagePosition6.aspectRatio, Math.min(f11 / groupedMessagePosition7.aspectRatio, 814.0f))) / 814.0f;
                            groupedMessagePosition6.set(0, 0, 0, 0, 500, fRound2, 13);
                            groupedMessagePosition7.set(1, 1, 0, 0, 500, fRound2, 14);
                        } else {
                            float f12 = 500;
                            float fRound3 = Math.round(Math.min(f12 / groupedMessagePosition6.aspectRatio, Math.min(f12 / groupedMessagePosition7.aspectRatio, 814.0f))) / 814.0f;
                            groupedMessagePosition6.set(0, 0, 0, 0, 500, fRound3, 13);
                            groupedMessagePosition7.set(1, 1, 0, 0, 500, fRound3, 14);
                        }
                    } else if (str.equals("ww") && !str.equals("qq")) {
                        float f13 = groupedMessagePosition6.aspectRatio;
                        int iMax = (int) Math.max(400.0f, Math.round((1000.0f / f13) / ((1.0f / groupedMessagePosition7.aspectRatio) + (1.0f / f13))));
                        int i39 = 1000 - iMax;
                        if (i39 < iMin) {
                            iMax -= iMin - i39;
                        } else {
                            iMin = i39;
                        }
                        float fMin = Math.min(814.0f, Math.round(Math.min(iMin / groupedMessagePosition6.aspectRatio, iMax / groupedMessagePosition7.aspectRatio))) / 814.0f;
                        groupedMessagePosition6.set(0, 0, 0, 0, iMin, fMin, 13);
                        groupedMessagePosition7.set(1, 1, 0, 0, iMax, fMin, 14);
                    } else {
                        float f14 = 500;
                        float fRound4 = Math.round(Math.min(f14 / groupedMessagePosition6.aspectRatio, Math.min(f14 / groupedMessagePosition7.aspectRatio, 814.0f))) / 814.0f;
                        groupedMessagePosition6.set(0, 0, 0, 0, 500, fRound4, 13);
                        groupedMessagePosition7.set(1, 1, 0, 0, 500, fRound4, 14);
                    }
                } else if (size == 3) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition8 = this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition9 = this.posArray.get(1);
                    MessageObject.GroupedMessagePosition groupedMessagePosition10 = this.posArray.get(2);
                    if (str.charAt(0) == 'n') {
                        float f15 = groupedMessagePosition9.aspectRatio;
                        float fMin2 = Math.min(407.0f, Math.round((f15 * 1000.0f) / (groupedMessagePosition10.aspectRatio + f15)));
                        float f16 = 814.0f - fMin2;
                        int iMax2 = (int) Math.max(iMin, Math.min(500.0f, Math.round(Math.min(groupedMessagePosition10.aspectRatio * fMin2, groupedMessagePosition9.aspectRatio * f16))));
                        int i40 = 1000 - iMax2;
                        groupedMessagePosition8.set(0, 0, 0, 1, Math.round(Math.min((groupedMessagePosition8.aspectRatio * 814.0f) + iMin2, i40)), 1.0f, 13);
                        float f17 = f16 / 814.0f;
                        groupedMessagePosition9.set(1, 1, 0, 0, iMax2, f17, 6);
                        float f18 = fMin2 / 814.0f;
                        groupedMessagePosition10.set(1, 1, 1, 1, iMax2, f18, 10);
                        groupedMessagePosition10.spanSize = 1000;
                        groupedMessagePosition8.siblingHeights = new float[]{f18, f17};
                        groupedMessagePosition8.spanSize = i40;
                    } else {
                        float fRound5 = Math.round(Math.min(1000.0f / groupedMessagePosition8.aspectRatio, 537.24005f)) / 814.0f;
                        groupedMessagePosition8.set(0, 1, 0, 0, 1000, fRound5, 7);
                        float f19 = 500;
                        float fMin3 = Math.min(814.0f - fRound5, Math.round(Math.min(f19 / groupedMessagePosition9.aspectRatio, f19 / groupedMessagePosition10.aspectRatio))) / 814.0f;
                        float f20 = fMin3 < fDp3 ? fDp3 : fMin3;
                        groupedMessagePosition9.set(0, 0, 1, 1, 500, f20, 9);
                        groupedMessagePosition10.set(1, 1, 1, 1, 500, f20, 10);
                    }
                } else {
                    MessageObject.GroupedMessagePosition groupedMessagePosition11 = this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition12 = this.posArray.get(1);
                    MessageObject.GroupedMessagePosition groupedMessagePosition13 = this.posArray.get(2);
                    MessageObject.GroupedMessagePosition groupedMessagePosition14 = this.posArray.get(3);
                    if (str.charAt(0) == 'w') {
                        float fRound6 = Math.round(Math.min(1000.0f / groupedMessagePosition11.aspectRatio, 537.24005f)) / 814.0f;
                        groupedMessagePosition11.set(0, 2, 0, 0, 1000, fRound6, 7);
                        float fRound7 = Math.round(1000.0f / ((groupedMessagePosition12.aspectRatio + groupedMessagePosition13.aspectRatio) + groupedMessagePosition14.aspectRatio));
                        float f21 = iMin;
                        int iMax3 = (int) Math.max(f21, Math.min(400.0f, groupedMessagePosition12.aspectRatio * fRound7));
                        int iMax4 = (int) Math.max(Math.max(f21, 330.0f), groupedMessagePosition14.aspectRatio * fRound7);
                        int iDp2 = (1000 - iMax3) - iMax4;
                        if (iDp2 < AndroidUtilities.dp(58.0f)) {
                            int iDp3 = AndroidUtilities.dp(58.0f) - iDp2;
                            iDp2 = AndroidUtilities.dp(58.0f);
                            int i41 = iDp3 / 2;
                            iMax3 -= i41;
                            iMax4 -= iDp3 - i41;
                        }
                        int i42 = iMax4;
                        int i43 = iMax3;
                        float fMin4 = Math.min(814.0f - fRound6, fRound7) / 814.0f;
                        float f22 = fMin4 < fDp3 ? fDp3 : fMin4;
                        groupedMessagePosition12.set(0, 0, 1, 1, i43, f22, 9);
                        groupedMessagePosition13.set(1, 1, 1, 1, iDp2, f22, 8);
                        groupedMessagePosition14.set(2, 2, 1, 1, i42, f22, 10);
                    } else {
                        int iMax5 = Math.max(iMin, Math.round(814.0f / ((1.0f / groupedMessagePosition14.aspectRatio) + ((1.0f / groupedMessagePosition13.aspectRatio) + (1.0f / groupedMessagePosition12.aspectRatio)))));
                        float f23 = iDp;
                        float f24 = iMax5;
                        float fMin5 = Math.min(0.33f, Math.max(f23, f24 / groupedMessagePosition12.aspectRatio) / 814.0f);
                        float fMin6 = Math.min(0.33f, Math.max(f23, f24 / groupedMessagePosition13.aspectRatio) / 814.0f);
                        float f25 = (1.0f - fMin5) - fMin6;
                        int i44 = 1000 - iMax5;
                        groupedMessagePosition11.set(0, 0, 0, 2, Math.round(Math.min((groupedMessagePosition11.aspectRatio * 814.0f) + iMin2, i44)), fMin5 + fMin6 + f25, 13);
                        groupedMessagePosition12.set(1, 1, 0, 0, iMax5, fMin5, 6);
                        groupedMessagePosition13.set(1, 1, 1, 1, iMax5, fMin6, 2);
                        groupedMessagePosition13.spanSize = 1000;
                        groupedMessagePosition14.set(1, 1, 2, 2, iMax5, f25, 10);
                        groupedMessagePosition14.spanSize = 1000;
                        groupedMessagePosition11.spanSize = i44;
                        groupedMessagePosition11.siblingHeights = new float[]{fMin5, fMin6, f25};
                    }
                }
                for (i2 = 0; i2 < size; i2++) {
                    groupedMessagePosition = this.posArray.get(i2);
                    if (groupedMessagePosition.minX == 0) {
                        groupedMessagePosition.spanSize += 200;
                    }
                    if ((groupedMessagePosition.flags & 2) != 0) {
                        groupedMessagePosition.edge = true;
                    }
                    this.maxX = Math.max(this.maxX, (int) groupedMessagePosition.maxX);
                    this.maxY = Math.max(this.maxY, (int) groupedMessagePosition.maxY);
                    groupedMessagePosition.left = getLeft(groupedMessagePosition, groupedMessagePosition.minY, groupedMessagePosition.maxY, groupedMessagePosition.minX);
                }
                for (i3 = 0; i3 < size; i3++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = this.posArray.get(i3);
                    groupedMessagePosition15.top = getTop(groupedMessagePosition15, groupedMessagePosition15.minY);
                }
                this.width = getWidth();
                this.height = getHeight();
            }
            while (i2 < size) {
                groupedMessagePosition = this.posArray.get(i2);
                if (groupedMessagePosition.minX == 0) {
                    groupedMessagePosition.spanSize += 200;
                }
                if ((groupedMessagePosition.flags & 2) != 0) {
                    groupedMessagePosition.edge = true;
                }
                this.maxX = Math.max(this.maxX, (int) groupedMessagePosition.maxX);
                this.maxY = Math.max(this.maxY, (int) groupedMessagePosition.maxY);
                groupedMessagePosition.left = getLeft(groupedMessagePosition, groupedMessagePosition.minY, groupedMessagePosition.maxY, groupedMessagePosition.minX);
            }
            while (i3 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition16 = this.posArray.get(i3);
                groupedMessagePosition16.top = getTop(groupedMessagePosition16, groupedMessagePosition16.minY);
            }
            this.width = getWidth();
            this.height = getHeight();
        }
    }
}
