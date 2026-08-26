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
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.TintInfo;
import androidx.core.math.MathUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.ThemePreviewActivity;

public final class ChatAttachAlertPhotoLayoutPreview extends ChatAttachAlert.AttachAlertLayout {
    public static final HashMap photoRotate = new HashMap();
    public ValueAnimator draggingAnimator;
    public PreviewGroupsView.PreviewGroupCell.MediaCell draggingCell;
    public float draggingCellFromHeight;
    public float draggingCellFromWidth;
    public float draggingCellGroupY;
    public boolean draggingCellHiding;
    public float draggingCellLeft;
    public float draggingCellTop;
    public float draggingCellTouchX;
    public float draggingCellTouchY;
    public final PreviewGroupsView groupsView;
    public final TextView header;
    public ViewPropertyAnimator headerAnimator;
    public boolean ignoreLayout;
    public boolean isPortrait;
    public final LinearLayoutManager layoutManager;
    public final ChatActivity.AnonymousClass34 listView;
    public int paddingTop;
    public ChatAttachAlertPhotoLayout photoLayout;
    public boolean shown;
    public final Theme.ResourcesProvider themeDelegate;
    public final UndoView undoView;
    public final Drawable videoPlayImage;

    public final class PreviewGroupsView extends ViewGroup {
        public final HashMap deletedPhotos;
        public float draggingT;
        public final ArrayList groupCells;
        public final ChatActionCell hintView;
        public boolean[] lastGroupSeen;
        public int lastMeasuredHeight;
        public final int paddingBottom;
        public final int paddingTop;
        public final GroupingPhotoViewerProvider photoViewerProvider;
        public HashMap photosMap;
        public ArrayList photosMapKeys;
        public ArrayList photosOrder;
        public float savedDragFromX;
        public float savedDragFromY;
        public float savedDraggingT;
        public final BubbleActivity.AnonymousClass1 scroller;
        public boolean scrollerStarted;
        public HashMap selectedPhotos;
        public PreviewGroupCell tapGroupCell;
        public PreviewGroupCell.MediaCell tapMediaCell;
        public long tapTime;
        public final PointF tmpPoint;
        public int undoViewId;
        public float viewBottom;
        public float viewTop;

        public final class GroupingPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
            public ArrayList photos = new ArrayList();

            public GroupingPhotoViewerProvider() {
            }

            @Override
            public final boolean cancelButtonPressed() {
                return false;
            }

            @Override
            public final int getPhotoIndex(int i) {
                MediaController.PhotoEntry photoEntry;
                if (i < 0 || i >= this.photos.size() || (photoEntry = (MediaController.PhotoEntry) this.photos.get(i)) == null) {
                    return -1;
                }
                return PreviewGroupsView.this.photosOrder.indexOf(Integer.valueOf(photoEntry.imageId));
            }

            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                MediaController.PhotoEntry photoEntry;
                ArrayList arrayList;
                if (i >= 0 && i < this.photos.size() && isPhotoChecked(i) && (photoEntry = (MediaController.PhotoEntry) this.photos.get(i)) != null) {
                    PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                    int size = previewGroupsView.groupCells.size();
                    PreviewGroupCell previewGroupCell = null;
                    PreviewGroupCell.MediaCell mediaCell = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        previewGroupCell = (PreviewGroupCell) previewGroupsView.groupCells.get(i2);
                        if (previewGroupCell != null && (arrayList = previewGroupCell.media) != null) {
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                PreviewGroupCell.MediaCell mediaCell2 = (PreviewGroupCell.MediaCell) arrayList.get(i3);
                                if (mediaCell2 != null && mediaCell2.photoEntry == photoEntry && mediaCell2.scale > 0.5d) {
                                    mediaCell = (PreviewGroupCell.MediaCell) arrayList.get(i3);
                                    break;
                                }
                            }
                            if (mediaCell != null) {
                                break;
                            }
                        }
                    }
                    if (previewGroupCell != null && mediaCell != null) {
                        PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                        int[] iArr = new int[2];
                        previewGroupsView.getLocationInWindow(iArr);
                        int i4 = Build.VERSION.SDK_INT;
                        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                        if (i4 < 26) {
                            iArr[0] = iArr[0] - chatAttachAlertPhotoLayoutPreview.parentAlert.getLeftInset();
                        }
                        placeProviderObject.viewX = iArr[0];
                        placeProviderObject.viewY = iArr[1] + ((int) previewGroupCell.y);
                        placeProviderObject.scale = 1.0f;
                        placeProviderObject.parentView = previewGroupsView;
                        ImageReceiver imageReceiver = mediaCell.image;
                        placeProviderObject.imageReceiver = imageReceiver;
                        placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                        placeProviderObject.radius = new int[]{(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                        RectF rectF = mediaCell.roundRadiuses;
                        placeProviderObject.clipTopAddition = (int) (-previewGroupsView.getY());
                        placeProviderObject.clipBottomAddition = previewGroupsView.getHeight() - ((int) (((-previewGroupsView.getY()) + chatAttachAlertPhotoLayoutPreview.listView.getHeight()) - chatAttachAlertPhotoLayoutPreview.parentAlert.getClipLayoutBottom()));
                        return placeProviderObject;
                    }
                }
                return null;
            }

            @Override
            public final int getSelectedCount() {
                return PreviewGroupsView.this.photosOrder.size();
            }

            @Override
            public final HashMap getSelectedPhotos() {
                return PreviewGroupsView.this.photosMap;
            }

            @Override
            public final ArrayList getSelectedPhotosOrder() {
                return PreviewGroupsView.this.photosOrder;
            }

            @Override
            public final boolean isPhotoChecked(int i) {
                if (i < 0 || i >= this.photos.size()) {
                    return false;
                }
                return PreviewGroupsView.this.photosOrder.contains(Integer.valueOf(((MediaController.PhotoEntry) this.photos.get(i)).imageId));
            }

            @Override
            public final void onClose() {
                PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                previewGroupsView.fromPhotoArrays();
                previewGroupsView.toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
            }

            @Override
            public final int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
                if (i < 0 || i >= this.photos.size()) {
                    return -1;
                }
                Integer numValueOf = Integer.valueOf(((MediaController.PhotoEntry) this.photos.get(i)).imageId);
                PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                int iIndexOf = previewGroupsView.photosOrder.indexOf(numValueOf);
                if (iIndexOf < 0) {
                    previewGroupsView.photosOrder.add(numValueOf);
                    previewGroupsView.fromPhotoArrays();
                    return previewGroupsView.photosOrder.size() - 1;
                }
                if (previewGroupsView.photosOrder.size() <= 1) {
                    return -1;
                }
                previewGroupsView.photosOrder.remove(iIndexOf);
                previewGroupsView.fromPhotoArrays();
                return iIndexOf;
            }

            @Override
            public final int setPhotoUnchecked(Object obj) {
                int iIndexOf;
                Integer numValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
                PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                if (previewGroupsView.photosOrder.size() <= 1 || (iIndexOf = previewGroupsView.photosOrder.indexOf(numValueOf)) < 0) {
                    return -1;
                }
                previewGroupsView.photosOrder.remove(iIndexOf);
                previewGroupsView.fromPhotoArrays();
                return iIndexOf;
            }

            @Override
            public final void updatePhotoAtIndex(int i) {
                MediaController.PhotoEntry photoEntry;
                ArrayList arrayList;
                boolean z;
                if (i < 0 || i >= this.photos.size() || (photoEntry = (MediaController.PhotoEntry) this.photos.get(i)) == null) {
                    return;
                }
                int i2 = photoEntry.imageId;
                PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                previewGroupsView.invalidate();
                for (int i3 = 0; i3 < previewGroupsView.groupCells.size(); i3++) {
                    PreviewGroupCell previewGroupCell = (PreviewGroupCell) previewGroupsView.groupCells.get(i3);
                    if (previewGroupCell != null && (arrayList = previewGroupCell.media) != null) {
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            PreviewGroupCell.MediaCell mediaCell = (PreviewGroupCell.MediaCell) arrayList.get(i4);
                            if (mediaCell != null && mediaCell.photoEntry.imageId == i2) {
                                mediaCell.setImage(photoEntry);
                            }
                        }
                        GroupCalculator groupCalculator = previewGroupCell.group;
                        if (groupCalculator == null || groupCalculator.photos == null) {
                            z = false;
                        } else {
                            z = false;
                            for (int i5 = 0; i5 < previewGroupCell.group.photos.size(); i5++) {
                                if (((MediaController.PhotoEntry) previewGroupCell.group.photos.get(i5)).imageId == i2) {
                                    previewGroupCell.group.photos.set(i5, photoEntry);
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            PreviewGroupCell.access$600(previewGroupCell, previewGroupCell.group, true);
                        }
                    }
                }
                previewGroupsView.remeasure();
                previewGroupsView.invalidate();
            }
        }

        public final class PreviewGroupCell {
            public final TintInfo backgroundCacheParams;
            public float bottom;
            public Text buttonText;
            public long buttonTextPrice;
            public GroupCalculator group;
            public float height;
            public float left;
            public final MessageDrawable messageBackground;
            public float right;
            public long stars;
            public float top;
            public float width;
            public float y = 0.0f;
            public int indexStart = 0;
            public long lastMediaUpdate = 0;
            public float groupWidth = 0.0f;
            public float groupHeight = 0.0f;
            public float previousGroupWidth = 0.0f;
            public float previousGroupHeight = 0.0f;
            public final ArrayList media = new ArrayList();
            public final CubicBezierInterpolator interpolator = CubicBezierInterpolator.EASE_BOTH;
            public final int padding = AndroidUtilities.dp(4.0f);
            public final int halfGap = AndroidUtilities.dp(2.0f) / 2;
            public final RectF buttonTextRect = new RectF();
            public final Paint buttonTextBgPaint = new Paint(1);

            public final class MediaCell {
                public ImageReceiver blurredImage;
                public PreviewGroupCell groupCell;
                public ImageReceiver image;
                public MediaController.PhotoEntry photoEntry;
                public Bitmap spoilerCrossfadeBitmap;
                public SpoilerEffect2 spoilerEffect;
                public float spoilerMaxRadius;
                public float spoilerRevealProgress;
                public float spoilerRevealX;
                public float spoilerRevealY;
                public TextPaint textPaint;
                public TextPaint videoDurationTextPaint;
                public boolean wasSpoiler;
                public RectF fromRect = null;
                public final RectF rect = new RectF();
                public long lastUpdate = 0;
                public int positionFlags = 0;
                public float fromScale = 1.0f;
                public float scale = 0.0f;
                public RectF fromRoundRadiuses = null;
                public final RectF roundRadiuses = new RectF();
                public String videoDurationText = null;
                public final Path path = new Path();
                public final float[] radii = new float[8];
                public float spoilerCrossfadeProgress = 1.0f;
                public final Paint spoilerCrossfadePaint = new Paint(1);
                public final RectF tempRect = new RectF();
                public final Paint paint = new Paint(1);
                public final Paint strokePaint = new Paint(1);
                public final Paint bitmapPaint = new Paint(1);
                public Bitmap indexBitmap = null;
                public String indexBitmapText = null;
                public Bitmap videoDurationBitmap = null;
                public String videoDurationBitmapText = null;
                public final Rect indexIn = new Rect();
                public final Rect indexOut = new Rect();
                public final Rect durationIn = new Rect();
                public final Rect durationOut = new Rect();
                public float visibleT = 1.0f;
                public long lastVisibleTUpdate = 0;

                public MediaCell() {
                    this.groupCell = PreviewGroupCell.this;
                }

                public static void access$3700(MediaCell mediaCell, GroupCalculator groupCalculator, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z) {
                    RectF rectF = mediaCell.rect;
                    if (groupCalculator == null || groupedMessagePosition == null) {
                        if (!z) {
                            mediaCell.fromScale = 0.0f;
                            mediaCell.scale = 0.0f;
                            return;
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        mediaCell.fromScale = AndroidUtilities.lerp(mediaCell.fromScale, mediaCell.scale, mediaCell.getT());
                        RectF rectF2 = mediaCell.fromRect;
                        if (rectF2 != null) {
                            AndroidUtilities.lerp(rectF2, rectF, mediaCell.getT(), mediaCell.fromRect);
                        }
                        mediaCell.scale = 0.0f;
                        mediaCell.lastUpdate = jElapsedRealtime;
                        return;
                    }
                    mediaCell.positionFlags = groupedMessagePosition.flags;
                    RectF rectF3 = mediaCell.roundRadiuses;
                    if (z) {
                        float t = mediaCell.getT();
                        RectF rectF4 = mediaCell.fromRect;
                        if (rectF4 != null) {
                            AndroidUtilities.lerp(rectF4, rectF, t, rectF4);
                        }
                        RectF rectF5 = mediaCell.fromRoundRadiuses;
                        if (rectF5 != null) {
                            AndroidUtilities.lerp(rectF5, rectF3, t, rectF5);
                        }
                        mediaCell.fromScale = AndroidUtilities.lerp(mediaCell.fromScale, mediaCell.scale, t);
                        mediaCell.lastUpdate = SystemClock.elapsedRealtime();
                    }
                    float f = groupedMessagePosition.left;
                    float f2 = groupCalculator.width;
                    float f3 = f / f2;
                    float f4 = groupedMessagePosition.top;
                    float f5 = groupCalculator.height;
                    float f6 = f4 / f5;
                    float f7 = groupedMessagePosition.pw / f2;
                    float f8 = groupedMessagePosition.ph / f5;
                    mediaCell.scale = 1.0f;
                    rectF.set(f3, f6, f7 + f3, f8 + f6);
                    float fDp = AndroidUtilities.dp(2.0f);
                    float fDp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
                    int i = mediaCell.positionFlags;
                    float f9 = (i & 5) == 5 ? fDp2 : fDp;
                    float f10 = (i & 6) == 6 ? fDp2 : fDp;
                    float f11 = (i & 10) == 10 ? fDp2 : fDp;
                    if ((i & 9) == 9) {
                        fDp = fDp2;
                    }
                    rectF3.set(f9, f10, f11, fDp);
                    if (mediaCell.fromRect == null) {
                        RectF rectF6 = new RectF();
                        mediaCell.fromRect = rectF6;
                        rectF6.set(rectF);
                    }
                    if (mediaCell.fromRoundRadiuses == null) {
                        RectF rectF7 = new RectF();
                        mediaCell.fromRoundRadiuses = rectF7;
                        rectF7.set(rectF3);
                    }
                }

                public final Object clone() {
                    MediaCell mediaCell = PreviewGroupCell.this.new MediaCell();
                    mediaCell.rect.set(this.rect);
                    mediaCell.image = this.image;
                    mediaCell.photoEntry = this.photoEntry;
                    return mediaCell;
                }

                public final boolean draw(Canvas canvas, boolean z) {
                    char c;
                    Bitmap bitmap;
                    String str;
                    float f;
                    String str2;
                    char c2;
                    Path.Direction direction;
                    RectF rectF;
                    float t = getT();
                    if (this.rect == null || this.image == null) {
                        return false;
                    }
                    PreviewGroupCell previewGroupCell = PreviewGroupCell.this;
                    PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                    float f2 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell == this ? previewGroupsView.draggingT : 0.0f;
                    float fLerp = AndroidUtilities.lerp(this.fromScale, this.scale, t);
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
                    if (t < 1.0f && (rectF = this.fromRoundRadiuses) != null) {
                        fLerp2 = AndroidUtilities.lerp(rectF.left, fLerp2, t);
                        fLerp3 = AndroidUtilities.lerp(this.fromRoundRadiuses.top, fLerp3, t);
                        fLerp4 = AndroidUtilities.lerp(this.fromRoundRadiuses.right, fLerp4, t);
                        fLerp5 = AndroidUtilities.lerp(this.fromRoundRadiuses.bottom, fLerp5, t);
                    }
                    float fLerp6 = AndroidUtilities.lerp(fLerp2, fDp, f2);
                    float fLerp7 = AndroidUtilities.lerp(fLerp3, fDp, f2);
                    float fLerp8 = AndroidUtilities.lerp(fLerp4, fDp, f2);
                    float fLerp9 = AndroidUtilities.lerp(fLerp5, fDp, f2);
                    if (z) {
                        canvas.save();
                        canvas.translate(-rectFDrawingRect.centerX(), -rectFDrawingRect.centerY());
                    }
                    int i = (int) fLerp6;
                    int i2 = (int) fLerp7;
                    int i3 = (int) fLerp8;
                    int i4 = (int) fLerp9;
                    this.image.setRoundRadius(i, i2, i3, i4);
                    this.image.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                    this.image.setAlpha(fLerp);
                    this.image.draw(canvas);
                    MediaController.PhotoEntry photoEntry = this.photoEntry;
                    Path path = this.path;
                    PreviewGroupsView previewGroupsView2 = PreviewGroupsView.this;
                    float[] fArr = this.radii;
                    if (photoEntry == null || !photoEntry.hasSpoiler || photoEntry.isChatPreviewSpoilerRevealed) {
                        fLerp6 = fLerp6;
                        c = 3;
                    } else {
                        if (this.wasSpoiler || this.blurredImage.getBitmap() != null || this.image.getBitmap() == null) {
                            if (!this.wasSpoiler && this.blurredImage.getBitmap() != null) {
                                c2 = 1;
                                this.wasSpoiler = true;
                            }
                            fArr[c2] = fLerp6;
                            fArr[0] = fLerp6;
                            fArr[3] = fLerp7;
                            fArr[2] = fLerp7;
                            fArr[5] = fLerp8;
                            fArr[4] = fLerp8;
                            fArr[7] = fLerp9;
                            fArr[6] = fLerp9;
                            canvas.save();
                            path.rewind();
                            direction = Path.Direction.CW;
                            path.addRoundRect(rectFDrawingRect, fArr, direction);
                            canvas.clipPath(path);
                            if (this.spoilerRevealProgress != 0.0f) {
                                path.rewind();
                                path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerRevealProgress * this.spoilerMaxRadius, direction);
                                canvas.clipPath(path, Region.Op.DIFFERENCE);
                            }
                            this.blurredImage.setRoundRadius(i, i2, i3, i4);
                            this.blurredImage.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                            this.blurredImage.setAlpha(fLerp);
                            this.blurredImage.draw(canvas);
                            if (this.spoilerEffect == null) {
                                this.spoilerEffect = SpoilerEffect2.getInstance(previewGroupsView2);
                            }
                            SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
                            int width = previewGroupsView2.getWidth();
                            int height = previewGroupsView2.getHeight();
                            previewGroupsView2 = previewGroupsView2;
                            c = 3;
                            spoilerEffect2.draw(canvas, previewGroupsView2, width, height, 1.0f, false);
                            canvas.restore();
                            previewGroupsView2.invalidate();
                            previewGroupsView2.invalidate();
                        } else {
                            this.wasSpoiler = true;
                            this.blurredImage.setImageBitmap(Utilities.stackBlurBitmapMax(this.image.getBitmap()));
                        }
                        c2 = 1;
                        fArr[c2] = fLerp6;
                        fArr[0] = fLerp6;
                        fArr[3] = fLerp7;
                        fArr[2] = fLerp7;
                        fArr[5] = fLerp8;
                        fArr[4] = fLerp8;
                        fArr[7] = fLerp9;
                        fArr[6] = fLerp9;
                        canvas.save();
                        path.rewind();
                        direction = Path.Direction.CW;
                        path.addRoundRect(rectFDrawingRect, fArr, direction);
                        canvas.clipPath(path);
                        if (this.spoilerRevealProgress != 0.0f) {
                            path.rewind();
                            path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerRevealProgress * this.spoilerMaxRadius, direction);
                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                        }
                        this.blurredImage.setRoundRadius(i, i2, i3, i4);
                        this.blurredImage.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                        this.blurredImage.setAlpha(fLerp);
                        this.blurredImage.draw(canvas);
                        if (this.spoilerEffect == null) {
                            this.spoilerEffect = SpoilerEffect2.getInstance(previewGroupsView2);
                        }
                        SpoilerEffect2 spoilerEffect3 = this.spoilerEffect;
                        int width2 = previewGroupsView2.getWidth();
                        int height2 = previewGroupsView2.getHeight();
                        previewGroupsView2 = previewGroupsView2;
                        c = 3;
                        spoilerEffect3.draw(canvas, previewGroupsView2, width2, height2, 1.0f, false);
                        canvas.restore();
                        previewGroupsView2.invalidate();
                        previewGroupsView2.invalidate();
                    }
                    float f3 = this.spoilerCrossfadeProgress;
                    String str3 = null;
                    if (f3 != 1.0f && this.spoilerCrossfadeBitmap != null) {
                        fArr[1] = fLerp6;
                        fArr[0] = fLerp6;
                        fArr[c] = fLerp7;
                        fArr[2] = fLerp7;
                        fArr[5] = fLerp8;
                        fArr[4] = fLerp8;
                        fArr[7] = fLerp9;
                        fArr[6] = fLerp9;
                        canvas.save();
                        path.rewind();
                        path.addRoundRect(rectFDrawingRect, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        float fMin = Math.min(1.0f, (Math.min(16L, SystemClock.elapsedRealtime() - this.lastUpdate) / 250.0f) + this.spoilerCrossfadeProgress);
                        this.spoilerCrossfadeProgress = fMin;
                        Paint paint = this.spoilerCrossfadePaint;
                        paint.setAlpha((int) ((1.0f - fMin) * 255.0f));
                        canvas.drawBitmap(this.spoilerCrossfadeBitmap, rectFDrawingRect.left, rectFDrawingRect.top, paint);
                        canvas.restore();
                        previewGroupsView2.invalidate();
                    } else if (f3 == 1.0f && (bitmap = this.spoilerCrossfadeBitmap) != null) {
                        bitmap.recycle();
                        this.spoilerCrossfadeBitmap = null;
                        previewGroupsView2.invalidate();
                    }
                    int iIndexOf = previewGroupCell.group.photos.indexOf(this.photoEntry) + previewGroupCell.indexStart;
                    if (iIndexOf >= 0) {
                        str3 = (iIndexOf + 1) + "";
                    }
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
                    float fDp2 = rectFDrawingRect.top + AndroidUtilities.dp(10.0f);
                    float fDp3 = rectFDrawingRect.right - AndroidUtilities.dp(10.0f);
                    float f7 = this.visibleT * fLerp;
                    int iDp = AndroidUtilities.dp(12.0f);
                    int iDp2 = AndroidUtilities.dp(1.2f);
                    int i5 = (iDp + iDp2) * 2;
                    int i6 = iDp2 * 4;
                    Rect rect = this.indexIn;
                    if (str3 == null || !(this.indexBitmap == null || (str2 = this.indexBitmapText) == null || !str2.equals(str3))) {
                        z2 = z2;
                    } else {
                        if (this.indexBitmap == null) {
                            this.indexBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
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
                        int i7 = Theme.key_chat_attachCheckBoxCheck;
                        textPaint2.setColor(Theme.getColor(i7, chatAttachAlertPhotoLayoutPreview.resourcesProvider));
                        int length = str3.length();
                        if (length == 0 || length == 1 || length == 2) {
                            f = 14.0f;
                        } else {
                            f = length != 3 ? 8.0f : 10.0f;
                        }
                        float f8 = f;
                        this.textPaint.setTextSize(AndroidUtilities.dp(f8));
                        float f9 = i5 / 2.0f;
                        Paint paint2 = this.paint;
                        paint2.setColor(Theme.getColor(Theme.key_chat_attachCheckBoxBackground, ChatAttachAlertPhotoLayoutPreview.this.resourcesProvider));
                        float f10 = (int) f9;
                        float f11 = iDp;
                        canvas2.drawCircle(f10, f10, f11, paint2);
                        Paint paint3 = this.strokePaint;
                        paint3.setColor(AndroidUtilities.getOffsetColor(-1, Theme.getColor(i7, ChatAttachAlertPhotoLayoutPreview.this.resourcesProvider), 1.0f, 1.0f));
                        paint3.setStyle(Paint.Style.STROKE);
                        paint3.setStrokeWidth(iDp2);
                        canvas2.drawCircle(f10, f10, f11, paint3);
                        canvas2.drawText(str3, f9 - (this.textPaint.measureText(str3) / 2.0f), f9 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f8 / 4.0f), this.textPaint);
                        rect.set(0, 0, i5, i5);
                        this.indexBitmapText = str3;
                    }
                    Bitmap bitmap2 = this.indexBitmap;
                    Paint paint4 = this.bitmapPaint;
                    if (bitmap2 != null) {
                        float f12 = i5 * fLerp;
                        float f13 = i6;
                        float f14 = fDp2 - f13;
                        int i8 = (int) (f14 + f12);
                        Rect rect2 = this.indexOut;
                        rect2.set((int) ((fDp3 - f12) + f13), (int) f14, (int) (fDp3 + f13), i8);
                        paint4.setAlpha((int) (f7 * 255.0f));
                        canvas.drawBitmap(this.indexBitmap, rect, rect2, paint4);
                    }
                    float fDp4 = rectFDrawingRect.left + AndroidUtilities.dp(4.0f);
                    float fDp5 = rectFDrawingRect.bottom - AndroidUtilities.dp(4.0f);
                    String str4 = this.videoDurationText;
                    float f15 = fLerp * this.visibleT;
                    if (str4 != null) {
                        Bitmap bitmap3 = this.videoDurationBitmap;
                        Rect rect3 = this.durationIn;
                        if (bitmap3 == null || (str = this.videoDurationBitmapText) == null || !str.equals(str4)) {
                            if (this.videoDurationTextPaint == null) {
                                TextPaint textPaint3 = new TextPaint(1);
                                this.videoDurationTextPaint = textPaint3;
                                textPaint3.setTypeface(AndroidUtilities.bold());
                                this.videoDurationTextPaint.setColor(-1);
                            }
                            float fDp6 = AndroidUtilities.dp(12.0f);
                            this.videoDurationTextPaint.setTextSize(fDp6);
                            float intrinsicWidth = ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicWidth() + this.videoDurationTextPaint.measureText(str4) + AndroidUtilities.dp(15.0f);
                            float fMax = Math.max(fDp6, AndroidUtilities.dp(4.0f) + ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicHeight());
                            int iCeil = (int) Math.ceil(intrinsicWidth);
                            int iCeil2 = (int) Math.ceil(fMax);
                            Bitmap bitmap4 = this.videoDurationBitmap;
                            if (bitmap4 == null || bitmap4.getWidth() != iCeil || this.videoDurationBitmap.getHeight() != iCeil2) {
                                Bitmap bitmap5 = this.videoDurationBitmap;
                                if (bitmap5 != null) {
                                    bitmap5.recycle();
                                }
                                this.videoDurationBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                            }
                            Canvas canvas3 = new Canvas(this.videoDurationBitmap);
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            rectF3.set(0.0f, 0.0f, intrinsicWidth, fMax);
                            canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Theme.chat_timeBackgroundPaint);
                            int iDp3 = AndroidUtilities.dp(5.0f);
                            int intrinsicHeight = (int) ((fMax - ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicHeight()) / 2.0f);
                            Drawable drawable = ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage;
                            drawable.setBounds(iDp3, intrinsicHeight, drawable.getIntrinsicWidth() + iDp3, ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicHeight() + intrinsicHeight);
                            ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.draw(canvas3);
                            canvas3.drawText(str4, AndroidUtilities.dp(18.0f), fDp6 + AndroidUtilities.dp(-0.7f), this.videoDurationTextPaint);
                            rect3.set(0, 0, iCeil, iCeil2);
                            this.videoDurationBitmapText = str4;
                        }
                        int width3 = this.videoDurationBitmap.getWidth();
                        int i9 = (int) fDp4;
                        int height3 = (int) (fDp5 - (this.videoDurationBitmap.getHeight() * fLerp));
                        int i10 = (int) ((width3 * fLerp) + fDp4);
                        int i11 = (int) fDp5;
                        Rect rect4 = this.durationOut;
                        rect4.set(i9, height3, i10, i11);
                        paint4.setAlpha((int) (f15 * 255.0f));
                        canvas.drawBitmap(this.videoDurationBitmap, rect3, rect4, paint4);
                    }
                    if (z) {
                        canvas.restore();
                    }
                    return t < 1.0f || z2;
                }

                public final RectF drawingRect() {
                    float f = 0.0f;
                    if (this.rect == null || this.image == null) {
                        RectF rectF = this.tempRect;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        return rectF;
                    }
                    PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                    MediaCell mediaCell = ChatAttachAlertPhotoLayoutPreview.this.draggingCell;
                    if (mediaCell != null && mediaCell.photoEntry == this.photoEntry) {
                        f = previewGroupsView.draggingT;
                    }
                    float fLerp = (((1.0f - f) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.fromScale, this.scale, getT());
                    RectF rectFRect = rect(getT());
                    float f2 = 1.0f - fLerp;
                    float f3 = fLerp + 1.0f;
                    rectFRect.set(Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(rectFRect.width(), f2, 2.0f, rectFRect.left), ((rectFRect.height() * f2) / 2.0f) + rectFRect.top, Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(rectFRect.width(), f3, 2.0f, rectFRect.left), ((rectFRect.height() * f3) / 2.0f) + rectFRect.top);
                    return rectFRect;
                }

                public final float getT() {
                    return PreviewGroupCell.this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastUpdate) / 200.0f));
                }

                public final RectF rect(float f) {
                    RectF rectF;
                    RectF rectF2 = this.rect;
                    RectF rectF3 = this.tempRect;
                    if (rectF2 == null || this.image == null) {
                        rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                        return rectF3;
                    }
                    PreviewGroupCell previewGroupCell = PreviewGroupCell.this;
                    float fLerp = (rectF2.left * previewGroupCell.width) + previewGroupCell.left;
                    float fLerp2 = (rectF2.top * previewGroupCell.height) + previewGroupCell.top;
                    float fWidth = rectF2.width() * previewGroupCell.width;
                    float fHeight = rectF2.height() * previewGroupCell.height;
                    if (f < 1.0f && (rectF = this.fromRect) != null) {
                        fLerp = AndroidUtilities.lerp((rectF.left * previewGroupCell.width) + previewGroupCell.left, fLerp, f);
                        fLerp2 = AndroidUtilities.lerp((this.fromRect.top * previewGroupCell.height) + previewGroupCell.top, fLerp2, f);
                        fWidth = AndroidUtilities.lerp(this.fromRect.width() * previewGroupCell.width, fWidth, f);
                        fHeight = AndroidUtilities.lerp(this.fromRect.height() * previewGroupCell.height, fHeight, f);
                    }
                    int i = this.positionFlags;
                    if ((i & 4) == 0) {
                        float f2 = previewGroupCell.halfGap;
                        fLerp2 += f2;
                        fHeight -= f2;
                    }
                    if ((i & 8) == 0) {
                        fHeight -= previewGroupCell.halfGap;
                    }
                    if ((i & 1) == 0) {
                        float f3 = previewGroupCell.halfGap;
                        fLerp += f3;
                        fWidth -= f3;
                    }
                    if ((i & 2) == 0) {
                        fWidth -= previewGroupCell.halfGap;
                    }
                    rectF3.set(fLerp, fLerp2, fWidth + fLerp, fHeight + fLerp2);
                    return rectF3;
                }

                public final void setImage(MediaController.PhotoEntry photoEntry) {
                    this.photoEntry = photoEntry;
                    if (photoEntry.isVideo) {
                        this.videoDurationText = AndroidUtilities.formatShortDuration(photoEntry.duration);
                    } else {
                        this.videoDurationText = null;
                    }
                    if (this.image == null) {
                        PreviewGroupCell previewGroupCell = PreviewGroupCell.this;
                        this.image = new ImageReceiver(PreviewGroupsView.this);
                        this.blurredImage = new ImageReceiver(PreviewGroupsView.this);
                        this.image.setDelegate(new ChatActivity$$ExternalSyntheticLambda189(29, this, photoEntry));
                    }
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

            public PreviewGroupCell() {
                Theme.ResourcesProvider resourcesProvider = ChatAttachAlertPhotoLayoutPreview.this.themeDelegate;
                Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable("drawableMsgOutMedia") : null;
                this.messageBackground = (MessageDrawable) (drawable == null ? (Drawable) Theme.defaultChatDrawables.get("drawableMsgOutMedia") : drawable);
                this.backgroundCacheParams = new TintInfo();
            }

            public static void access$600(PreviewGroupCell previewGroupCell, GroupCalculator groupCalculator, boolean z) {
                ArrayList arrayList;
                previewGroupCell.group = groupCalculator;
                if (groupCalculator == null) {
                    return;
                }
                groupCalculator.calculate();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - previewGroupCell.lastMediaUpdate;
                long j2 = 200;
                if (j < 200) {
                    float f = j / 200.0f;
                    previewGroupCell.previousGroupHeight = AndroidUtilities.lerp(previewGroupCell.previousGroupHeight, previewGroupCell.groupHeight, f);
                    previewGroupCell.previousGroupWidth = AndroidUtilities.lerp(previewGroupCell.previousGroupWidth, previewGroupCell.groupWidth, f);
                } else {
                    previewGroupCell.previousGroupHeight = previewGroupCell.groupHeight;
                    previewGroupCell.previousGroupWidth = previewGroupCell.groupWidth;
                }
                previewGroupCell.groupWidth = groupCalculator.width / 1000.0f;
                previewGroupCell.groupHeight = groupCalculator.height;
                previewGroupCell.lastMediaUpdate = z ? jElapsedRealtime : 0L;
                previewGroupCell.stars = 0L;
                HashMap map = groupCalculator.positions;
                ArrayList arrayList2 = new ArrayList(map.keySet());
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    arrayList = previewGroupCell.media;
                    MediaCell mediaCell = null;
                    if (i >= size) {
                        break;
                    }
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i);
                    MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) map.get(photoEntry);
                    long j3 = j2;
                    int i2 = i;
                    previewGroupCell.stars = Math.max(previewGroupCell.stars, photoEntry.starsAmount);
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        MediaCell mediaCell2 = (MediaCell) arrayList.get(i3);
                        if (mediaCell2.photoEntry == photoEntry) {
                            mediaCell = mediaCell2;
                            break;
                        }
                    }
                    if (mediaCell == null) {
                        MediaCell mediaCell3 = previewGroupCell.new MediaCell();
                        mediaCell3.setImage(photoEntry);
                        MediaCell.access$3700(mediaCell3, groupCalculator, groupedMessagePosition, z);
                        arrayList.add(mediaCell3);
                    } else {
                        MediaCell.access$3700(mediaCell, groupCalculator, groupedMessagePosition, z);
                    }
                    i = i2 + 1;
                    j2 = j3;
                }
                long j4 = j2;
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    MediaCell mediaCell4 = (MediaCell) arrayList.get(i4);
                    if (!map.containsKey(mediaCell4.photoEntry)) {
                        if (mediaCell4.scale > 0.0f || mediaCell4.lastUpdate + j4 > jElapsedRealtime) {
                            MediaCell.access$3700(mediaCell4, null, null, z);
                        } else {
                            SpoilerEffect2 spoilerEffect2 = mediaCell4.spoilerEffect;
                            if (spoilerEffect2 != null) {
                                spoilerEffect2.detach(PreviewGroupsView.this);
                                mediaCell4.spoilerEffect = null;
                            }
                            arrayList.remove(i4);
                            i4--;
                            size3--;
                        }
                    }
                    i4++;
                }
                PreviewGroupsView.this.invalidate();
            }

            public final float measure() {
                Point point = AndroidUtilities.displaySize;
                return ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * AndroidUtilities.lerp(this.previousGroupHeight, this.groupHeight, this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastMediaUpdate) / 200.0f))) * Math.max(point.x, point.y) * 0.5f;
            }
        }

        public PreviewGroupsView(Context context) {
            super(context);
            this.groupCells = new ArrayList();
            this.deletedPhotos = new HashMap();
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
            this.scroller = new BubbleActivity.AnonymousClass1(this, 14);
            this.photoViewerProvider = new GroupingPhotoViewerProvider();
            this.undoViewId = 0;
            new HashMap();
            setWillNotDraw(false);
            ChatActionCell chatActionCell = new ChatActionCell(context, ChatAttachAlertPhotoLayoutPreview.this.themeDelegate, true);
            this.hintView = chatActionCell;
            chatActionCell.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
            addView(chatActionCell);
        }

        public final void calcPhotoArrays() {
            String str;
            this.photosMap = ChatAttachAlertPhotoLayoutPreview.this.photoLayout.getSelectedPhotos();
            this.photosMapKeys = new ArrayList(this.photosMap.entrySet());
            this.selectedPhotos = new HashMap();
            this.photosOrder = new ArrayList();
            ArrayList arrayList = this.groupCells;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                GroupCalculator groupCalculator = ((PreviewGroupCell) arrayList.get(i)).group;
                if (groupCalculator.photos.size() != 0) {
                    ArrayList arrayList2 = groupCalculator.photos;
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i2);
                        HashMap map = this.deletedPhotos;
                        if (!map.containsKey(photoEntry)) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= this.photosMapKeys.size()) {
                                    for (int i4 = 0; i4 < this.photosMapKeys.size(); i4++) {
                                        Map.Entry entry = (Map.Entry) this.photosMapKeys.get(i4);
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
                                Map.Entry entry2 = (Map.Entry) this.photosMapKeys.get(i3);
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
                            Object obj = map.get(photoEntry);
                            this.selectedPhotos.put(obj, photoEntry);
                            this.photosOrder.add(obj);
                        }
                    }
                }
            }
        }

        public final PointF dragTranslate() {
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
            PreviewGroupCell.MediaCell mediaCell = chatAttachAlertPhotoLayoutPreview.draggingCell;
            PointF pointF = this.tmpPoint;
            if (mediaCell == null) {
                pointF.x = 0.0f;
                pointF.y = 0.0f;
                return pointF;
            }
            if (chatAttachAlertPhotoLayoutPreview.draggingCellHiding) {
                RectF rectFRect = mediaCell.rect(mediaCell.getT());
                RectF rectFRect2 = chatAttachAlertPhotoLayoutPreview.draggingCell.rect(1.0f);
                pointF.x = AndroidUtilities.lerp((rectFRect.width() / 2.0f) + rectFRect2.left, this.savedDragFromX, this.draggingT / this.savedDraggingT);
                pointF.y = AndroidUtilities.lerp((rectFRect.height() / 2.0f) + chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.y + rectFRect2.top, this.savedDragFromY, this.draggingT / this.savedDraggingT);
                return pointF;
            }
            RectF rectFRect3 = mediaCell.rect(mediaCell.getT());
            RectF rectFRect4 = chatAttachAlertPhotoLayoutPreview.draggingCell.rect(1.0f);
            pointF.x = AndroidUtilities.lerp((rectFRect3.width() / 2.0f) + rectFRect4.left, chatAttachAlertPhotoLayoutPreview.draggingCellTouchX - ((chatAttachAlertPhotoLayoutPreview.draggingCellLeft - 0.5f) * chatAttachAlertPhotoLayoutPreview.draggingCellFromWidth), this.draggingT);
            pointF.y = AndroidUtilities.lerp((rectFRect3.height() / 2.0f) + chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.y + rectFRect4.top, (chatAttachAlertPhotoLayoutPreview.draggingCellTouchY - ((chatAttachAlertPhotoLayoutPreview.draggingCellTop - 0.5f) * chatAttachAlertPhotoLayoutPreview.draggingCellFromHeight)) + chatAttachAlertPhotoLayoutPreview.draggingCellGroupY, this.draggingT);
            return pointF;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        public final void fromPhotoArrays() {
            ArrayList arrayList;
            int i = 0;
            while (true) {
                arrayList = this.groupCells;
                if (i >= arrayList.size()) {
                    break;
                }
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) arrayList.get(i);
                for (int i2 = 0; i2 < previewGroupCell.media.size(); i2++) {
                    PreviewGroupCell.MediaCell mediaCell = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i2);
                    SpoilerEffect2 spoilerEffect2 = mediaCell.spoilerEffect;
                    if (spoilerEffect2 != null) {
                        spoilerEffect2.detach(PreviewGroupsView.this);
                        mediaCell.spoilerEffect = null;
                    }
                }
                i++;
            }
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            int size = this.photosOrder.size();
            int i3 = size - 1;
            for (int i4 = 0; i4 < size; i4++) {
                Integer num = (Integer) this.photosOrder.get(i4);
                num.getClass();
                arrayList2.add((MediaController.PhotoEntry) this.photosMap.get(num));
                if (i4 % 10 == 9 || i4 == i3) {
                    PreviewGroupCell previewGroupCell2 = new PreviewGroupCell();
                    PreviewGroupCell.access$600(previewGroupCell2, ChatAttachAlertPhotoLayoutPreview.this.new GroupCalculator(arrayList2), false);
                    arrayList.add(previewGroupCell2);
                    arrayList2 = new ArrayList();
                }
            }
        }

        public final boolean[] groupSeen() {
            ArrayList arrayList = this.groupCells;
            boolean[] zArr = new boolean[arrayList.size()];
            float f = this.paddingTop;
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
            int iComputeVerticalScrollOffset = chatAttachAlertPhotoLayoutPreview.listView.computeVerticalScrollOffset();
            this.viewTop = Math.max(0, iComputeVerticalScrollOffset - chatAttachAlertPhotoLayoutPreview.getListTopPadding());
            this.viewBottom = (chatAttachAlertPhotoLayoutPreview.listView.getMeasuredHeight() - chatAttachAlertPhotoLayoutPreview.getListTopPadding()) + iComputeVerticalScrollOffset;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                float fMeasure = ((PreviewGroupCell) arrayList.get(i)).measure() + f;
                float f2 = this.viewTop;
                zArr[i] = (f >= f2 && f <= this.viewBottom) || (fMeasure >= f2 && fMeasure <= this.viewBottom) || (f <= f2 && fMeasure >= this.viewBottom);
                i++;
                f = fMeasure;
            }
            return zArr;
        }

        @Override
        public final void invalidate() {
            int iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight(), 45.0f, measurePureHeight());
            if (this.lastMeasuredHeight != iM) {
                this.lastMeasuredHeight = iM;
                requestLayout();
            }
            super.invalidate();
        }

        public final int measurePureHeight() {
            int iMeasure = this.paddingTop + this.paddingBottom;
            ArrayList arrayList = this.groupCells;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iMeasure = (int) (((PreviewGroupCell) arrayList.get(i)).measure() + iMeasure);
            }
            ChatActionCell chatActionCell = this.hintView;
            if (chatActionCell.getMeasuredHeight() <= 0) {
                chatActionCell.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
            }
            return chatActionCell.getMeasuredHeight() + iMeasure;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float interpolation;
            boolean z;
            PreviewGroupsView previewGroupsView;
            float previewScale;
            float previewScale2;
            MessageDrawable messageDrawable;
            ArrayList arrayList;
            int size;
            int i;
            long j;
            PreviewGroupCell.MediaCell mediaCell;
            PreviewGroupCell.MediaCell mediaCell2;
            float f;
            int i2 = this.paddingTop;
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
            int iComputeVerticalScrollOffset = chatAttachAlertPhotoLayoutPreview.listView.computeVerticalScrollOffset();
            this.viewTop = Math.max(0, iComputeVerticalScrollOffset - chatAttachAlertPhotoLayoutPreview.getListTopPadding());
            this.viewBottom = (chatAttachAlertPhotoLayoutPreview.listView.getMeasuredHeight() - chatAttachAlertPhotoLayoutPreview.getListTopPadding()) + iComputeVerticalScrollOffset;
            canvas.save();
            canvas.translate(0.0f, i2);
            ArrayList arrayList2 = this.groupCells;
            int size2 = arrayList2.size();
            float f2 = i2;
            int i3 = 0;
            int size3 = 0;
            while (i3 < size2) {
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) arrayList2.get(i3);
                float fMeasure = previewGroupCell.measure();
                previewGroupCell.y = f2;
                previewGroupCell.indexStart = size3;
                float f3 = this.viewTop;
                if (f2 < f3 || f2 > this.viewBottom) {
                    float f4 = f2 + fMeasure;
                    if ((f4 < f3 || f4 > this.viewBottom) && (f2 > f3 || f4 < this.viewBottom)) {
                        arrayList2 = arrayList2;
                        size2 = size2;
                        i3 = i3;
                    } else {
                        interpolation = previewGroupCell.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - previewGroupCell.lastMediaUpdate) / 200.0f));
                        if (interpolation < 1.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Point point = AndroidUtilities.displaySize;
                        float fMax = Math.max(point.x, point.y) * 0.5f;
                        float fLerp = AndroidUtilities.lerp(previewGroupCell.previousGroupWidth, previewGroupCell.groupWidth, interpolation);
                        previewGroupsView = PreviewGroupsView.this;
                        previewScale = ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * fLerp * previewGroupsView.getWidth();
                        previewScale2 = ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * AndroidUtilities.lerp(previewGroupCell.previousGroupHeight, previewGroupCell.groupHeight, interpolation) * fMax;
                        messageDrawable = previewGroupCell.messageBackground;
                        if (messageDrawable != null) {
                            previewGroupCell.top = 0.0f;
                            float width = previewGroupsView.getWidth();
                            int i4 = previewGroupCell.padding;
                            previewGroupCell.left = (width - Math.max(i4, previewScale)) / 2.0f;
                            previewGroupCell.right = (Math.max(i4, previewScale) + previewGroupsView.getWidth()) / 2.0f;
                            previewGroupCell.bottom = Math.max(i4 * 2, previewScale2);
                            previewGroupCell.messageBackground.setTop(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                            messageDrawable.setBounds((int) previewGroupCell.left, (int) previewGroupCell.top, (int) previewGroupCell.right, (int) previewGroupCell.bottom);
                            if (previewGroupCell.groupWidth <= 0.0f) {
                                f = 1.0f - interpolation;
                            } else if (previewGroupCell.previousGroupWidth <= 0.0f) {
                                f = interpolation;
                            } else {
                                f = 1.0f;
                            }
                            messageDrawable.setAlpha((int) (f * 255.0f));
                            messageDrawable.drawCached(canvas, previewGroupCell.backgroundCacheParams, null);
                            float f5 = i4;
                            previewGroupCell.top += f5;
                            previewGroupCell.left += f5;
                            previewGroupCell.bottom -= f5;
                            previewGroupCell.right -= f5;
                        }
                        previewGroupCell.width = previewGroupCell.right - previewGroupCell.left;
                        previewGroupCell.height = previewGroupCell.bottom - previewGroupCell.top;
                        arrayList = previewGroupCell.media;
                        size = arrayList.size();
                        for (i = 0; i < size; i++) {
                            mediaCell = (PreviewGroupCell.MediaCell) arrayList.get(i);
                            if (mediaCell != null && (((mediaCell2 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell) == null || mediaCell2.photoEntry != mediaCell.photoEntry) && mediaCell.draw(canvas, false))) {
                                z = true;
                            }
                        }
                        j = previewGroupCell.stars;
                        if (j > 0) {
                            if (previewGroupCell.buttonText != null || previewGroupCell.buttonTextPrice != j) {
                                previewGroupCell.buttonTextPrice = j;
                                previewGroupCell.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f, null), 14.0f, AndroidUtilities.bold());
                            }
                            float fDp = AndroidUtilities.dp(28.0f) + previewGroupCell.buttonText.width;
                            float fDp2 = AndroidUtilities.dp(32.0f);
                            RectF rectF = previewGroupCell.buttonTextRect;
                            float f6 = previewGroupCell.left;
                            float f7 = previewGroupCell.width;
                            float fM = ImageReceiver$$ExternalSyntheticOutline0.m(f7, fDp, 2.0f, f6);
                            float f8 = previewGroupCell.top;
                            float f9 = previewGroupCell.height;
                            rectF.set(fM, ImageReceiver$$ExternalSyntheticOutline0.m(f9, fDp2, 2.0f, f8), AacUtil.m(f7, fDp, 2.0f, f6), AacUtil.m(f9, fDp2, 2.0f, f8));
                            Paint paint = previewGroupCell.buttonTextBgPaint;
                            paint.setColor(1610612736);
                            float f10 = fDp2 / 2.0f;
                            canvas.drawRoundRect(rectF, f10, f10, paint);
                            previewGroupCell.buttonText.draw(AndroidUtilities.dp(14.0f) + (((previewGroupCell.width / 2.0f) + previewGroupCell.left) - (fDp / 2.0f)), previewGroupCell.top + (previewGroupCell.height / 2.0f), 1.0f, -1, canvas);
                        }
                        if (z) {
                            invalidate();
                        }
                    }
                } else {
                    interpolation = previewGroupCell.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - previewGroupCell.lastMediaUpdate) / 200.0f));
                    if (interpolation < 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Point point2 = AndroidUtilities.displaySize;
                    float fMax2 = Math.max(point2.x, point2.y) * 0.5f;
                    float fLerp2 = AndroidUtilities.lerp(previewGroupCell.previousGroupWidth, previewGroupCell.groupWidth, interpolation);
                    previewGroupsView = PreviewGroupsView.this;
                    previewScale = ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * fLerp2 * previewGroupsView.getWidth();
                    previewScale2 = ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale() * AndroidUtilities.lerp(previewGroupCell.previousGroupHeight, previewGroupCell.groupHeight, interpolation) * fMax2;
                    messageDrawable = previewGroupCell.messageBackground;
                    if (messageDrawable != null) {
                        previewGroupCell.top = 0.0f;
                        float width2 = previewGroupsView.getWidth();
                        int i5 = previewGroupCell.padding;
                        previewGroupCell.left = (width2 - Math.max(i5, previewScale)) / 2.0f;
                        previewGroupCell.right = (Math.max(i5, previewScale) + previewGroupsView.getWidth()) / 2.0f;
                        previewGroupCell.bottom = Math.max(i5 * 2, previewScale2);
                        previewGroupCell.messageBackground.setTop(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                        messageDrawable.setBounds((int) previewGroupCell.left, (int) previewGroupCell.top, (int) previewGroupCell.right, (int) previewGroupCell.bottom);
                        if (previewGroupCell.groupWidth <= 0.0f) {
                            f = 1.0f - interpolation;
                        } else if (previewGroupCell.previousGroupWidth <= 0.0f) {
                            f = interpolation;
                        } else {
                            f = 1.0f;
                        }
                        messageDrawable.setAlpha((int) (f * 255.0f));
                        messageDrawable.drawCached(canvas, previewGroupCell.backgroundCacheParams, null);
                        float f11 = i5;
                        previewGroupCell.top += f11;
                        previewGroupCell.left += f11;
                        previewGroupCell.bottom -= f11;
                        previewGroupCell.right -= f11;
                    }
                    previewGroupCell.width = previewGroupCell.right - previewGroupCell.left;
                    previewGroupCell.height = previewGroupCell.bottom - previewGroupCell.top;
                    arrayList = previewGroupCell.media;
                    size = arrayList.size();
                    while (i < size) {
                        mediaCell = (PreviewGroupCell.MediaCell) arrayList.get(i);
                        if (mediaCell != null) {
                            z = true;
                        }
                    }
                    j = previewGroupCell.stars;
                    if (j > 0) {
                        if (previewGroupCell.buttonText != null) {
                            previewGroupCell.buttonTextPrice = j;
                            previewGroupCell.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f, null), 14.0f, AndroidUtilities.bold());
                        } else {
                            previewGroupCell.buttonTextPrice = j;
                            previewGroupCell.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f, null), 14.0f, AndroidUtilities.bold());
                        }
                        float fDp3 = AndroidUtilities.dp(28.0f) + previewGroupCell.buttonText.width;
                        float fDp4 = AndroidUtilities.dp(32.0f);
                        RectF rectF2 = previewGroupCell.buttonTextRect;
                        float f12 = previewGroupCell.left;
                        float f13 = previewGroupCell.width;
                        float fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(f13, fDp3, 2.0f, f12);
                        float f14 = previewGroupCell.top;
                        float f15 = previewGroupCell.height;
                        rectF2.set(fM2, ImageReceiver$$ExternalSyntheticOutline0.m(f15, fDp4, 2.0f, f14), AacUtil.m(f13, fDp3, 2.0f, f12), AacUtil.m(f15, fDp4, 2.0f, f14));
                        Paint paint2 = previewGroupCell.buttonTextBgPaint;
                        paint2.setColor(1610612736);
                        float f16 = fDp4 / 2.0f;
                        canvas.drawRoundRect(rectF2, f16, f16, paint2);
                        previewGroupCell.buttonText.draw(AndroidUtilities.dp(14.0f) + (((previewGroupCell.width / 2.0f) + previewGroupCell.left) - (fDp3 / 2.0f)), previewGroupCell.top + (previewGroupCell.height / 2.0f), 1.0f, -1, canvas);
                    }
                    if (z) {
                        invalidate();
                    }
                }
                canvas.translate(0.0f, fMeasure);
                f2 += fMeasure;
                size3 += previewGroupCell.group.photos.size();
                i3++;
                arrayList2 = arrayList2;
                size2 = size2;
            }
            ChatActionCell chatActionCell = this.hintView;
            chatActionCell.setVisiblePart(f2, chatActionCell.getMeasuredHeight());
            if (chatActionCell.hasGradientService()) {
                chatActionCell.drawBackground(canvas, true);
                chatActionCell.drawReactions(canvas, true);
            }
            chatActionCell.draw(canvas);
            canvas.restore();
            if (chatAttachAlertPhotoLayoutPreview.draggingCell != null) {
                canvas.save();
                PointF pointFDragTranslate = dragTranslate();
                canvas.translate(pointFDragTranslate.x, pointFDragTranslate.y);
                if (chatAttachAlertPhotoLayoutPreview.draggingCell.draw(canvas, true)) {
                    invalidate();
                }
                canvas.restore();
            }
            super.onDraw(canvas);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            ChatActionCell chatActionCell = this.hintView;
            chatActionCell.layout(0, 0, chatActionCell.getMeasuredWidth(), chatActionCell.getMeasuredHeight());
        }

        @Override
        public final void onMeasure(int i, int i2) {
            this.hintView.measure(i, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
            if (this.lastMeasuredHeight <= 0) {
                this.lastMeasuredHeight = BotFullscreenButtons$$ExternalSyntheticOutline1.m(AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight(), 45.0f, measurePureHeight());
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.lastMeasuredHeight), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            PreviewGroupCell previewGroupCell;
            PreviewGroupCell.MediaCell mediaCell;
            float f;
            PreviewGroupCell previewGroupCell2;
            PreviewGroupCell.MediaCell mediaCell2;
            int action;
            BubbleActivity.AnonymousClass1 anonymousClass1;
            int i;
            boolean z;
            final PreviewGroupCell.MediaCell mediaCell3;
            int i2;
            ChatActivity chatActivity;
            PreviewGroupCell.MediaCell mediaCell4;
            GroupCalculator groupCalculator;
            ArrayList arrayList;
            PreviewGroupCell.MediaCell mediaCell5;
            int iIndexOf;
            int iIndexOf2;
            int i3;
            ArrayList arrayList2;
            int size;
            int i4;
            PreviewGroupCell.MediaCell mediaCell6;
            PreviewGroupCell.MediaCell mediaCell7;
            RectF rectF;
            RectF rectF2;
            RectF rectF3;
            RectF rectF4;
            RectF rectF5;
            PreviewGroupCell previewGroupCell3;
            ValueAnimator valueAnimator;
            GroupCalculator groupCalculator2;
            ArrayList arrayList3;
            PreviewGroupCell previewGroupCell4;
            float f2;
            int i5;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ArrayList arrayList4 = this.groupCells;
            int size2 = arrayList4.size();
            int i6 = 0;
            float f3 = 0.0f;
            while (true) {
                if (i6 >= size2) {
                    previewGroupCell = null;
                    break;
                }
                previewGroupCell = (PreviewGroupCell) arrayList4.get(i6);
                float fMeasure = previewGroupCell.measure();
                if (y >= f3 && y <= f3 + fMeasure) {
                    break;
                }
                f3 += fMeasure;
                i6++;
            }
            if (previewGroupCell == null) {
                mediaCell = null;
                break;
            }
            ArrayList arrayList5 = previewGroupCell.media;
            int size3 = arrayList5.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size3) {
                    mediaCell = null;
                    break;
                }
                PreviewGroupCell.MediaCell mediaCell8 = (PreviewGroupCell.MediaCell) arrayList5.get(i7);
                if (mediaCell8 != null && mediaCell8.drawingRect().contains(x, y - f3)) {
                    mediaCell = mediaCell8;
                    break;
                }
                i7++;
            }
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
            PreviewGroupCell.MediaCell mediaCell9 = chatAttachAlertPhotoLayoutPreview.draggingCell;
            if (mediaCell9 != null) {
                RectF rectFRect = mediaCell9.rect(mediaCell9.getT());
                PointF pointFDragTranslate = dragTranslate();
                RectF rectF6 = new RectF();
                f = 2.0f;
                float f4 = pointFDragTranslate.x;
                float f5 = pointFDragTranslate.y;
                rectF6.set(f4 - (rectFRect.width() / 2.0f), f5 - (rectFRect.height() / 2.0f), (rectFRect.width() / 2.0f) + f4, (rectFRect.height() / 2.0f) + f5);
                int i8 = 0;
                previewGroupCell2 = null;
                float f6 = 0.0f;
                float f7 = 0.0f;
                while (i8 < size2) {
                    PreviewGroupCell previewGroupCell5 = (PreviewGroupCell) arrayList4.get(i8);
                    float fMeasure2 = previewGroupCell5.measure() + f6;
                    if (fMeasure2 >= rectF6.top) {
                        float f8 = rectF6.bottom;
                        if (f8 >= f6) {
                            i5 = i8;
                            float fMin = Math.min(fMeasure2, f8) - Math.max(f6, rectF6.top);
                            if (fMin > f7) {
                                f7 = fMin;
                                previewGroupCell2 = previewGroupCell5;
                            }
                        } else {
                            i5 = i8;
                        }
                    } else {
                        i5 = i8;
                    }
                    i8 = i5 + 1;
                    f6 = fMeasure2;
                }
                if (previewGroupCell2 != null) {
                    ArrayList arrayList6 = previewGroupCell2.media;
                    int size4 = arrayList6.size();
                    int i9 = 0;
                    float f9 = 0.0f;
                    mediaCell2 = null;
                    while (i9 < size4) {
                        PreviewGroupCell.MediaCell mediaCell10 = (PreviewGroupCell.MediaCell) arrayList6.get(i9);
                        if (mediaCell10 == null || mediaCell10 == chatAttachAlertPhotoLayoutPreview.draggingCell) {
                            arrayList3 = arrayList6;
                        } else {
                            arrayList3 = arrayList6;
                            if (previewGroupCell2.group.photos.contains(mediaCell10.photoEntry)) {
                                RectF rectFDrawingRect = mediaCell10.drawingRect();
                                int i10 = mediaCell10.positionFlags;
                                if ((i10 & 4) > 0) {
                                    f2 = 0.0f;
                                    rectFDrawingRect.top = 0.0f;
                                } else {
                                    f2 = 0.0f;
                                }
                                if ((i10 & 1) > 0) {
                                    rectFDrawingRect.left = f2;
                                }
                                if ((i10 & 2) > 0) {
                                    rectFDrawingRect.right = getWidth();
                                }
                                if ((mediaCell10.positionFlags & 8) > 0) {
                                    rectFDrawingRect.bottom = previewGroupCell2.height;
                                }
                                if (RectF.intersects(rectF6, rectFDrawingRect)) {
                                    previewGroupCell4 = previewGroupCell2;
                                    float fMin2 = ((Math.min(rectFDrawingRect.bottom, rectF6.bottom) - Math.max(rectFDrawingRect.top, rectF6.top)) * (Math.min(rectFDrawingRect.right, rectF6.right) - Math.max(rectFDrawingRect.left, rectF6.left))) / (rectF6.height() * rectF6.width());
                                    if (fMin2 > 0.15f && fMin2 > f9) {
                                        f9 = fMin2;
                                        mediaCell2 = mediaCell10;
                                    }
                                } else {
                                    previewGroupCell4 = previewGroupCell2;
                                }
                            }
                            i9++;
                            arrayList6 = arrayList3;
                            size4 = size4;
                            previewGroupCell2 = previewGroupCell4;
                        }
                        previewGroupCell4 = previewGroupCell2;
                        size4 = size4;
                        i9++;
                        arrayList6 = arrayList3;
                        size4 = size4;
                        previewGroupCell2 = previewGroupCell4;
                    }
                }
                action = motionEvent.getAction();
                anonymousClass1 = this.scroller;
                if (action == 0 || chatAttachAlertPhotoLayoutPreview.draggingCell != null || chatAttachAlertPhotoLayoutPreview.listView.scrollingByUser || (((valueAnimator = chatAttachAlertPhotoLayoutPreview.draggingAnimator) != null && valueAnimator.isRunning()) || previewGroupCell == null || mediaCell == null || (groupCalculator2 = previewGroupCell.group) == null || !groupCalculator2.photos.contains(mediaCell.photoEntry))) {
                    if (action == 2 || chatAttachAlertPhotoLayoutPreview.draggingCell == null || chatAttachAlertPhotoLayoutPreview.draggingCellHiding) {
                        i = 1;
                        if (action == 1) {
                            mediaCell5 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                            if (mediaCell5 != null) {
                                if (previewGroupCell != null || mediaCell == null || mediaCell == mediaCell5) {
                                    if (previewGroupCell2 != null || mediaCell2 == null || mediaCell2 == mediaCell5 || mediaCell2.photoEntry == mediaCell5.photoEntry) {
                                        mediaCell = null;
                                        previewGroupCell = null;
                                    } else {
                                        previewGroupCell = previewGroupCell2;
                                        mediaCell = mediaCell2;
                                    }
                                }
                                if (previewGroupCell != null && mediaCell != null && mediaCell != mediaCell5) {
                                    iIndexOf = mediaCell5.groupCell.group.photos.indexOf(mediaCell5.photoEntry);
                                    iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                    if (iIndexOf >= 0) {
                                        chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                        PreviewGroupCell previewGroupCell6 = chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell;
                                        i3 = 1;
                                        PreviewGroupCell.access$600(previewGroupCell6, previewGroupCell6.group, true);
                                    } else {
                                        i3 = 1;
                                    }
                                    if (iIndexOf2 >= 0) {
                                        if (arrayList4.indexOf(previewGroupCell) > arrayList4.indexOf(chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell)) {
                                            iIndexOf2 += i3;
                                        }
                                        pushToGroup(previewGroupCell, chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry, iIndexOf2);
                                        if (chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell != previewGroupCell) {
                                            arrayList2 = previewGroupCell.media;
                                            size = arrayList2.size();
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= size) {
                                                    mediaCell6 = null;
                                                    break;
                                                }
                                                mediaCell6 = (PreviewGroupCell.MediaCell) arrayList2.get(i4);
                                                if (mediaCell6.photoEntry == chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry) {
                                                    break;
                                                }
                                                i4++;
                                            }
                                            if (mediaCell6 != null) {
                                                remeasure();
                                                mediaCell7 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                                                mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell7.fromScale, mediaCell7.scale, mediaCell7.getT());
                                                if (mediaCell6.fromRect == null) {
                                                    mediaCell6.fromRect = new RectF();
                                                }
                                                rectF = new RectF();
                                                rectF2 = mediaCell6.fromRect;
                                                rectF3 = mediaCell6.rect;
                                                if (rectF2 == null) {
                                                    rectF.set(rectF3);
                                                } else {
                                                    AndroidUtilities.lerp(rectF2, rectF3, mediaCell6.getT(), rectF);
                                                }
                                                rectF4 = mediaCell7.fromRect;
                                                rectF5 = mediaCell7.rect;
                                                previewGroupCell3 = PreviewGroupCell.this;
                                                if (rectF4 != null) {
                                                    AndroidUtilities.lerp(rectF4, rectF5, mediaCell7.getT(), mediaCell6.fromRect);
                                                    mediaCell6.fromRect.set(rectF.centerX() - (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                                } else {
                                                    mediaCell6.fromRect.set(rectF.centerX() - (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                                }
                                                mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell6.fromScale, mediaCell6.scale, mediaCell6.getT());
                                                mediaCell6.lastUpdate = SystemClock.elapsedRealtime();
                                                chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell6;
                                                mediaCell6.groupCell = previewGroupCell;
                                                mediaCell6.fromScale = 1.0f;
                                                mediaCell6.scale = 1.0f;
                                                remeasure();
                                            }
                                        }
                                    }
                                    try {
                                        chatAttachAlertPhotoLayoutPreview.performHapticFeedback(7, 2);
                                    } catch (Exception unused) {
                                    }
                                    updateGroups();
                                    toPhotoLayout(chatAttachAlertPhotoLayoutPreview.photoLayout, false);
                                }
                                stopDragging();
                            } else {
                                i = 1;
                                if (action == i) {
                                }
                                z = false;
                            }
                        } else if (action == i || chatAttachAlertPhotoLayoutPreview.draggingCell != null || (mediaCell3 = this.tapMediaCell) == null || this.tapGroupCell == null) {
                            z = false;
                        } else if (mediaCell3.wasSpoiler && mediaCell3.spoilerRevealProgress == 0.0f) {
                            float x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            mediaCell3.spoilerRevealX = x2;
                            mediaCell3.spoilerRevealY = y2;
                            RectF rectFDrawingRect2 = mediaCell3.drawingRect();
                            mediaCell3.spoilerMaxRadius = (float) Math.sqrt(Math.pow(rectFDrawingRect2.height(), 2.0d) + Math.pow(rectFDrawingRect2.width(), 2.0d));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) MathUtils.clamp(mediaCell3.spoilerMaxRadius * 0.3f, 250.0f, 550.0f));
                            duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                            duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(mediaCell3, 29));
                            duration.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    MediaCell mediaCell11 = MediaCell.this;
                                    mediaCell11.photoEntry.isChatPreviewSpoilerRevealed = true;
                                    PreviewGroupsView.this.invalidate();
                                }
                            });
                            duration.start();
                        } else {
                            RectF rectFDrawingRect3 = mediaCell3.drawingRect();
                            RectF rectF7 = AndroidUtilities.rectTmp;
                            float fDp = rectFDrawingRect3.right - AndroidUtilities.dp(36.4f);
                            float f10 = this.tapGroupCell.top + rectFDrawingRect3.top;
                            rectF7.set(fDp, f10, rectFDrawingRect3.right, AndroidUtilities.dp(36.4f) + f10);
                            if (!rectF7.contains(x, y - this.tapMediaCell.groupCell.y)) {
                                calcPhotoArrays();
                                ArrayList arrayList7 = new ArrayList();
                                int size5 = arrayList4.size();
                                for (int i11 = 0; i11 < size5; i11++) {
                                    PreviewGroupCell previewGroupCell7 = (PreviewGroupCell) arrayList4.get(i11);
                                    if (previewGroupCell7 != null && (groupCalculator = previewGroupCell7.group) != null && (arrayList = groupCalculator.photos) != null) {
                                        arrayList7.addAll(arrayList);
                                    }
                                }
                                int iIndexOf3 = arrayList7.indexOf(this.tapMediaCell.photoEntry);
                                ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayoutPreview.parentAlert;
                                int i12 = chatAttachAlert.avatarPicker;
                                BaseFragment lastFragment = chatAttachAlert.baseFragment;
                                if (i12 != 0) {
                                    i2 = 1;
                                } else {
                                    if (lastFragment instanceof ChatActivity) {
                                        chatActivity = (ChatActivity) lastFragment;
                                        i2 = 0;
                                    } else {
                                        i2 = 4;
                                    }
                                    if (lastFragment == null) {
                                        lastFragment = LaunchActivity.getLastFragment();
                                    }
                                    if (!chatAttachAlert.delegate.needEnterComment()) {
                                        AndroidUtilities.hideKeyboard(lastFragment.getFragmentView().findFocus());
                                        AndroidUtilities.hideKeyboard(chatAttachAlert.getContainer().findFocus());
                                    }
                                    PhotoViewer.getInstance().setParentActivity(null, lastFragment, chatAttachAlertPhotoLayoutPreview.resourcesProvider);
                                    PhotoViewer.getInstance().setParentAlert(chatAttachAlert);
                                    PhotoViewer photoViewer = PhotoViewer.getInstance();
                                    int i13 = chatAttachAlert.maxSelectedPhotos;
                                    boolean z2 = chatAttachAlert.allowOrder;
                                    photoViewer.maxSelectedPhotos = i13;
                                    photoViewer.allowOrder = z2;
                                    this.photoViewerProvider.photos = arrayList7;
                                    PhotoViewer.getInstance().openPhotoForSelect(new ArrayList(arrayList7), iIndexOf3, i2, false, this.photoViewerProvider, chatActivity);
                                    chatAttachAlertPhotoLayoutPreview.photoLayout.getClass();
                                    if (ChatAttachAlertPhotoLayout.captionForAllMedia()) {
                                        PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                                        Editable text = chatAttachAlert.getCommentView().getText();
                                        photoViewer2.hasCaptionForAllMedia = true;
                                        photoViewer2.captionForAllMedia = text;
                                        mediaCell4 = null;
                                        photoViewer2.setCurrentCaption(null, text, false, false);
                                        photoViewer2.updateCaptionTextForCurrentPhoto(null);
                                    }
                                    this.tapMediaCell = mediaCell4;
                                    this.tapTime = 0L;
                                    chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell4;
                                    this.draggingT = 0.0f;
                                }
                                chatActivity = null;
                                if (lastFragment == null) {
                                    lastFragment = LaunchActivity.getLastFragment();
                                }
                                if (!chatAttachAlert.delegate.needEnterComment()) {
                                    AndroidUtilities.hideKeyboard(lastFragment.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(chatAttachAlert.getContainer().findFocus());
                                }
                                PhotoViewer.getInstance().setParentActivity(null, lastFragment, chatAttachAlertPhotoLayoutPreview.resourcesProvider);
                                PhotoViewer.getInstance().setParentAlert(chatAttachAlert);
                                PhotoViewer photoViewer3 = PhotoViewer.getInstance();
                                int i14 = chatAttachAlert.maxSelectedPhotos;
                                boolean z3 = chatAttachAlert.allowOrder;
                                photoViewer3.maxSelectedPhotos = i14;
                                photoViewer3.allowOrder = z3;
                                this.photoViewerProvider.photos = arrayList7;
                                PhotoViewer.getInstance().openPhotoForSelect(new ArrayList(arrayList7), iIndexOf3, i2, false, this.photoViewerProvider, chatActivity);
                                chatAttachAlertPhotoLayoutPreview.photoLayout.getClass();
                                if (ChatAttachAlertPhotoLayout.captionForAllMedia()) {
                                    PhotoViewer photoViewer4 = PhotoViewer.getInstance();
                                    Editable text2 = chatAttachAlert.getCommentView().getText();
                                    photoViewer4.hasCaptionForAllMedia = true;
                                    photoViewer4.captionForAllMedia = text2;
                                    mediaCell4 = null;
                                    photoViewer4.setCurrentCaption(null, text2, false, false);
                                    photoViewer4.updateCaptionTextForCurrentPhoto(null);
                                }
                                this.tapMediaCell = mediaCell4;
                                this.tapTime = 0L;
                                chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell4;
                                this.draggingT = 0.0f;
                            } else if (chatAttachAlertPhotoLayoutPreview.getSelectedItemsCount() > 1) {
                                MediaController.PhotoEntry photoEntry = this.tapMediaCell.photoEntry;
                                int iIndexOf4 = this.tapGroupCell.group.photos.indexOf(photoEntry);
                                if (iIndexOf4 >= 0) {
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayoutPreview.photoLayout;
                                    if (chatAttachAlertPhotoLayout != null) {
                                        ArrayList arrayList8 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                        int size6 = arrayList8.size();
                                        for (int i15 = 0; i15 < size6; i15++) {
                                            if (((Map.Entry) arrayList8.get(i15)).getValue() == photoEntry) {
                                                this.deletedPhotos.put(photoEntry, ((Map.Entry) arrayList8.get(i15)).getKey());
                                                break;
                                            }
                                        }
                                    }
                                    PreviewGroupCell previewGroupCell8 = this.tapGroupCell;
                                    previewGroupCell8.group.photos.remove(iIndexOf4);
                                    PreviewGroupCell.access$600(previewGroupCell8, previewGroupCell8.group, true);
                                    updateGroups();
                                    toPhotoLayout(chatAttachAlertPhotoLayoutPreview.photoLayout, false);
                                    int i16 = this.undoViewId + 1;
                                    this.undoViewId = i16;
                                    chatAttachAlertPhotoLayoutPreview.undoView.showWithAction(0L, 82, photoEntry, (Object) null, (Runnable) null, new ArticleViewer$$ExternalSyntheticLambda71(this, previewGroupCell8, photoEntry, iIndexOf4, 13));
                                    postDelayed(new ArticleViewer$$ExternalSyntheticLambda74(this, i16, 23), 4000L);
                                }
                                ValueAnimator valueAnimator2 = chatAttachAlertPhotoLayoutPreview.draggingAnimator;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                            }
                            mediaCell4 = null;
                            this.tapMediaCell = mediaCell4;
                            this.tapTime = 0L;
                            chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell4;
                            this.draggingT = 0.0f;
                        }
                    } else {
                        chatAttachAlertPhotoLayoutPreview.draggingCellTouchX = x;
                        chatAttachAlertPhotoLayoutPreview.draggingCellTouchY = y;
                        z = true;
                        if (!this.scrollerStarted) {
                            this.scrollerStarted = true;
                            postDelayed(anonymousClass1, 16L);
                        }
                        invalidate();
                    }
                    if (action != 1 || action == 3) {
                        this.tapTime = 0L;
                        removeCallbacks(anonymousClass1);
                        this.scrollerStarted = false;
                        if (!z) {
                            stopDragging();
                            return true;
                        }
                    }
                    return z;
                }
                this.tapGroupCell = previewGroupCell;
                this.tapMediaCell = mediaCell;
                chatAttachAlertPhotoLayoutPreview.draggingCellTouchX = x;
                chatAttachAlertPhotoLayoutPreview.draggingCellTouchY = y;
                chatAttachAlertPhotoLayoutPreview.draggingCell = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.tapTime = jElapsedRealtime;
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda12(this, jElapsedRealtime, this.tapMediaCell, 12), ViewConfiguration.getLongPressTimeout());
                invalidate();
                z = true;
                if (action != 1) {
                    this.tapTime = 0L;
                    removeCallbacks(anonymousClass1);
                    this.scrollerStarted = false;
                    if (!z) {
                        stopDragging();
                        return true;
                    }
                } else {
                    this.tapTime = 0L;
                    removeCallbacks(anonymousClass1);
                    this.scrollerStarted = false;
                    if (!z) {
                        stopDragging();
                        return true;
                    }
                }
                return z;
            }
            f = 2.0f;
            previewGroupCell2 = null;
            mediaCell2 = null;
            action = motionEvent.getAction();
            anonymousClass1 = this.scroller;
            if (action == 0) {
                if (action == 2) {
                    i = 1;
                    if (action == 1) {
                        if (action == i) {
                        }
                        z = false;
                    } else {
                        mediaCell5 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                        if (mediaCell5 != null) {
                            if (previewGroupCell != null) {
                                if (previewGroupCell2 != null) {
                                    mediaCell = null;
                                    previewGroupCell = null;
                                } else {
                                    mediaCell = null;
                                    previewGroupCell = null;
                                }
                            } else if (previewGroupCell2 != null) {
                                mediaCell = null;
                                previewGroupCell = null;
                            } else {
                                mediaCell = null;
                                previewGroupCell = null;
                            }
                            if (previewGroupCell != null) {
                                iIndexOf = mediaCell5.groupCell.group.photos.indexOf(mediaCell5.photoEntry);
                                iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                if (iIndexOf >= 0) {
                                    chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                    PreviewGroupCell previewGroupCell9 = chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell;
                                    i3 = 1;
                                    PreviewGroupCell.access$600(previewGroupCell9, previewGroupCell9.group, true);
                                } else {
                                    i3 = 1;
                                }
                                if (iIndexOf2 >= 0) {
                                    if (arrayList4.indexOf(previewGroupCell) > arrayList4.indexOf(chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell)) {
                                        iIndexOf2 += i3;
                                    }
                                    pushToGroup(previewGroupCell, chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry, iIndexOf2);
                                    if (chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell != previewGroupCell) {
                                        arrayList2 = previewGroupCell.media;
                                        size = arrayList2.size();
                                        i4 = 0;
                                        while (true) {
                                            if (i4 >= size) {
                                                mediaCell6 = null;
                                                break;
                                            }
                                            mediaCell6 = (PreviewGroupCell.MediaCell) arrayList2.get(i4);
                                            if (mediaCell6.photoEntry == chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry) {
                                                break;
                                                break;
                                            }
                                            i4++;
                                        }
                                        if (mediaCell6 != null) {
                                            remeasure();
                                            mediaCell7 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                                            mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell7.fromScale, mediaCell7.scale, mediaCell7.getT());
                                            if (mediaCell6.fromRect == null) {
                                                mediaCell6.fromRect = new RectF();
                                            }
                                            rectF = new RectF();
                                            rectF2 = mediaCell6.fromRect;
                                            rectF3 = mediaCell6.rect;
                                            if (rectF2 == null) {
                                                rectF.set(rectF3);
                                            } else {
                                                AndroidUtilities.lerp(rectF2, rectF3, mediaCell6.getT(), rectF);
                                            }
                                            rectF4 = mediaCell7.fromRect;
                                            rectF5 = mediaCell7.rect;
                                            previewGroupCell3 = PreviewGroupCell.this;
                                            if (rectF4 != null) {
                                                AndroidUtilities.lerp(rectF4, rectF5, mediaCell7.getT(), mediaCell6.fromRect);
                                                mediaCell6.fromRect.set(rectF.centerX() - (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                            } else {
                                                mediaCell6.fromRect.set(rectF.centerX() - (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                            }
                                            mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell6.fromScale, mediaCell6.scale, mediaCell6.getT());
                                            mediaCell6.lastUpdate = SystemClock.elapsedRealtime();
                                            chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell6;
                                            mediaCell6.groupCell = previewGroupCell;
                                            mediaCell6.fromScale = 1.0f;
                                            mediaCell6.scale = 1.0f;
                                            remeasure();
                                        }
                                    }
                                }
                                chatAttachAlertPhotoLayoutPreview.performHapticFeedback(7, 2);
                                updateGroups();
                                toPhotoLayout(chatAttachAlertPhotoLayoutPreview.photoLayout, false);
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
                        mediaCell5 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                        if (mediaCell5 != null) {
                            if (previewGroupCell != null) {
                                if (previewGroupCell2 != null) {
                                    mediaCell = null;
                                    previewGroupCell = null;
                                } else {
                                    mediaCell = null;
                                    previewGroupCell = null;
                                }
                            } else if (previewGroupCell2 != null) {
                                mediaCell = null;
                                previewGroupCell = null;
                            } else {
                                mediaCell = null;
                                previewGroupCell = null;
                            }
                            if (previewGroupCell != null) {
                                iIndexOf = mediaCell5.groupCell.group.photos.indexOf(mediaCell5.photoEntry);
                                iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                                if (iIndexOf >= 0) {
                                    chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                    PreviewGroupCell previewGroupCell10 = chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell;
                                    i3 = 1;
                                    PreviewGroupCell.access$600(previewGroupCell10, previewGroupCell10.group, true);
                                } else {
                                    i3 = 1;
                                }
                                if (iIndexOf2 >= 0) {
                                    if (arrayList4.indexOf(previewGroupCell) > arrayList4.indexOf(chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell)) {
                                        iIndexOf2 += i3;
                                    }
                                    pushToGroup(previewGroupCell, chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry, iIndexOf2);
                                    if (chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell != previewGroupCell) {
                                        arrayList2 = previewGroupCell.media;
                                        size = arrayList2.size();
                                        i4 = 0;
                                        while (true) {
                                            if (i4 >= size) {
                                                mediaCell6 = null;
                                                break;
                                            }
                                            mediaCell6 = (PreviewGroupCell.MediaCell) arrayList2.get(i4);
                                            if (mediaCell6.photoEntry == chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry) {
                                                break;
                                                break;
                                            }
                                            i4++;
                                        }
                                        if (mediaCell6 != null) {
                                            remeasure();
                                            mediaCell7 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                                            mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell7.fromScale, mediaCell7.scale, mediaCell7.getT());
                                            if (mediaCell6.fromRect == null) {
                                                mediaCell6.fromRect = new RectF();
                                            }
                                            rectF = new RectF();
                                            rectF2 = mediaCell6.fromRect;
                                            rectF3 = mediaCell6.rect;
                                            if (rectF2 == null) {
                                                rectF.set(rectF3);
                                            } else {
                                                AndroidUtilities.lerp(rectF2, rectF3, mediaCell6.getT(), rectF);
                                            }
                                            rectF4 = mediaCell7.fromRect;
                                            rectF5 = mediaCell7.rect;
                                            previewGroupCell3 = PreviewGroupCell.this;
                                            if (rectF4 != null) {
                                                AndroidUtilities.lerp(rectF4, rectF5, mediaCell7.getT(), mediaCell6.fromRect);
                                                mediaCell6.fromRect.set(rectF.centerX() - (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                            } else {
                                                mediaCell6.fromRect.set(rectF.centerX() - (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                            }
                                            mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell6.fromScale, mediaCell6.scale, mediaCell6.getT());
                                            mediaCell6.lastUpdate = SystemClock.elapsedRealtime();
                                            chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell6;
                                            mediaCell6.groupCell = previewGroupCell;
                                            mediaCell6.fromScale = 1.0f;
                                            mediaCell6.scale = 1.0f;
                                            remeasure();
                                        }
                                    }
                                }
                                chatAttachAlertPhotoLayoutPreview.performHapticFeedback(7, 2);
                                updateGroups();
                                toPhotoLayout(chatAttachAlertPhotoLayoutPreview.photoLayout, false);
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
                    mediaCell5 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                    if (mediaCell5 != null) {
                        if (previewGroupCell != null) {
                            if (previewGroupCell2 != null) {
                                mediaCell = null;
                                previewGroupCell = null;
                            } else {
                                mediaCell = null;
                                previewGroupCell = null;
                            }
                        } else if (previewGroupCell2 != null) {
                            mediaCell = null;
                            previewGroupCell = null;
                        } else {
                            mediaCell = null;
                            previewGroupCell = null;
                        }
                        if (previewGroupCell != null) {
                            iIndexOf = mediaCell5.groupCell.group.photos.indexOf(mediaCell5.photoEntry);
                            iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                            if (iIndexOf >= 0) {
                                chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                PreviewGroupCell previewGroupCell11 = chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell;
                                i3 = 1;
                                PreviewGroupCell.access$600(previewGroupCell11, previewGroupCell11.group, true);
                            } else {
                                i3 = 1;
                            }
                            if (iIndexOf2 >= 0) {
                                if (arrayList4.indexOf(previewGroupCell) > arrayList4.indexOf(chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell)) {
                                    iIndexOf2 += i3;
                                }
                                pushToGroup(previewGroupCell, chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry, iIndexOf2);
                                if (chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell != previewGroupCell) {
                                    arrayList2 = previewGroupCell.media;
                                    size = arrayList2.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= size) {
                                            mediaCell6 = null;
                                            break;
                                        }
                                        mediaCell6 = (PreviewGroupCell.MediaCell) arrayList2.get(i4);
                                        if (mediaCell6.photoEntry == chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry) {
                                            break;
                                            break;
                                        }
                                        i4++;
                                    }
                                    if (mediaCell6 != null) {
                                        remeasure();
                                        mediaCell7 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                                        mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell7.fromScale, mediaCell7.scale, mediaCell7.getT());
                                        if (mediaCell6.fromRect == null) {
                                            mediaCell6.fromRect = new RectF();
                                        }
                                        rectF = new RectF();
                                        rectF2 = mediaCell6.fromRect;
                                        rectF3 = mediaCell6.rect;
                                        if (rectF2 == null) {
                                            rectF.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF2, rectF3, mediaCell6.getT(), rectF);
                                        }
                                        rectF4 = mediaCell7.fromRect;
                                        rectF5 = mediaCell7.rect;
                                        previewGroupCell3 = PreviewGroupCell.this;
                                        if (rectF4 != null) {
                                            AndroidUtilities.lerp(rectF4, rectF5, mediaCell7.getT(), mediaCell6.fromRect);
                                            mediaCell6.fromRect.set(rectF.centerX() - (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                        } else {
                                            mediaCell6.fromRect.set(rectF.centerX() - (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                        }
                                        mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell6.fromScale, mediaCell6.scale, mediaCell6.getT());
                                        mediaCell6.lastUpdate = SystemClock.elapsedRealtime();
                                        chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell6;
                                        mediaCell6.groupCell = previewGroupCell;
                                        mediaCell6.fromScale = 1.0f;
                                        mediaCell6.scale = 1.0f;
                                        remeasure();
                                    }
                                }
                            }
                            chatAttachAlertPhotoLayoutPreview.performHapticFeedback(7, 2);
                            updateGroups();
                            toPhotoLayout(chatAttachAlertPhotoLayoutPreview.photoLayout, false);
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
                    mediaCell5 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                    if (mediaCell5 != null) {
                        if (previewGroupCell != null) {
                            if (previewGroupCell2 != null) {
                                mediaCell = null;
                                previewGroupCell = null;
                            } else {
                                mediaCell = null;
                                previewGroupCell = null;
                            }
                        } else if (previewGroupCell2 != null) {
                            mediaCell = null;
                            previewGroupCell = null;
                        } else {
                            mediaCell = null;
                            previewGroupCell = null;
                        }
                        if (previewGroupCell != null) {
                            iIndexOf = mediaCell5.groupCell.group.photos.indexOf(mediaCell5.photoEntry);
                            iIndexOf2 = previewGroupCell.group.photos.indexOf(mediaCell.photoEntry);
                            if (iIndexOf >= 0) {
                                chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.group.photos.remove(iIndexOf);
                                PreviewGroupCell previewGroupCell12 = chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell;
                                i3 = 1;
                                PreviewGroupCell.access$600(previewGroupCell12, previewGroupCell12.group, true);
                            } else {
                                i3 = 1;
                            }
                            if (iIndexOf2 >= 0) {
                                if (arrayList4.indexOf(previewGroupCell) > arrayList4.indexOf(chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell)) {
                                    iIndexOf2 += i3;
                                }
                                pushToGroup(previewGroupCell, chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry, iIndexOf2);
                                if (chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell != previewGroupCell) {
                                    arrayList2 = previewGroupCell.media;
                                    size = arrayList2.size();
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= size) {
                                            mediaCell6 = null;
                                            break;
                                        }
                                        mediaCell6 = (PreviewGroupCell.MediaCell) arrayList2.get(i4);
                                        if (mediaCell6.photoEntry == chatAttachAlertPhotoLayoutPreview.draggingCell.photoEntry) {
                                            break;
                                            break;
                                        }
                                        i4++;
                                    }
                                    if (mediaCell6 != null) {
                                        remeasure();
                                        mediaCell7 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                                        mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell7.fromScale, mediaCell7.scale, mediaCell7.getT());
                                        if (mediaCell6.fromRect == null) {
                                            mediaCell6.fromRect = new RectF();
                                        }
                                        rectF = new RectF();
                                        rectF2 = mediaCell6.fromRect;
                                        rectF3 = mediaCell6.rect;
                                        if (rectF2 == null) {
                                            rectF.set(rectF3);
                                        } else {
                                            AndroidUtilities.lerp(rectF2, rectF3, mediaCell6.getT(), rectF);
                                        }
                                        rectF4 = mediaCell7.fromRect;
                                        rectF5 = mediaCell7.rect;
                                        previewGroupCell3 = PreviewGroupCell.this;
                                        if (rectF4 != null) {
                                            AndroidUtilities.lerp(rectF4, rectF5, mediaCell7.getT(), mediaCell6.fromRect);
                                            mediaCell6.fromRect.set(rectF.centerX() - (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((mediaCell6.fromRect.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((mediaCell6.fromRect.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                        } else {
                                            mediaCell6.fromRect.set(rectF.centerX() - (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width), rectF.centerY() - (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height), (((rectF5.width() / f) * mediaCell7.groupCell.width) / previewGroupCell3.width) + rectF.centerX(), (((rectF5.height() / f) * mediaCell7.groupCell.height) / previewGroupCell3.height) + rectF.centerY());
                                        }
                                        mediaCell6.fromScale = AndroidUtilities.lerp(mediaCell6.fromScale, mediaCell6.scale, mediaCell6.getT());
                                        mediaCell6.lastUpdate = SystemClock.elapsedRealtime();
                                        chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell6;
                                        mediaCell6.groupCell = previewGroupCell;
                                        mediaCell6.fromScale = 1.0f;
                                        mediaCell6.scale = 1.0f;
                                        remeasure();
                                    }
                                }
                            }
                            chatAttachAlertPhotoLayoutPreview.performHapticFeedback(7, 2);
                            updateGroups();
                            toPhotoLayout(chatAttachAlertPhotoLayoutPreview.photoLayout, false);
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
                removeCallbacks(anonymousClass1);
                this.scrollerStarted = false;
                if (!z) {
                    stopDragging();
                    return true;
                }
            } else {
                this.tapTime = 0L;
                removeCallbacks(anonymousClass1);
                this.scrollerStarted = false;
                if (!z) {
                    stopDragging();
                    return true;
                }
            }
            return z;
        }

        public final void pushToGroup(PreviewGroupCell previewGroupCell, MediaController.PhotoEntry photoEntry, int i) {
            ArrayList arrayList = previewGroupCell.group.photos;
            arrayList.add(Math.min(arrayList.size(), i), photoEntry);
            if (previewGroupCell.group.photos.size() == 11) {
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) previewGroupCell.group.photos.get(10);
                previewGroupCell.group.photos.remove(10);
                ArrayList arrayList2 = this.groupCells;
                int iIndexOf = arrayList2.indexOf(previewGroupCell);
                if (iIndexOf >= 0) {
                    int i2 = iIndexOf + 1;
                    PreviewGroupCell previewGroupCell2 = i2 == arrayList2.size() ? null : (PreviewGroupCell) arrayList2.get(i2);
                    if (previewGroupCell2 == null) {
                        PreviewGroupCell previewGroupCell3 = new PreviewGroupCell();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(photoEntry2);
                        PreviewGroupCell.access$600(previewGroupCell3, ChatAttachAlertPhotoLayoutPreview.this.new GroupCalculator(arrayList3), true);
                        invalidate();
                    } else {
                        pushToGroup(previewGroupCell2, photoEntry2, 0);
                    }
                }
            }
            PreviewGroupCell.access$600(previewGroupCell, previewGroupCell.group, true);
        }

        public final void remeasure() {
            float f = this.paddingTop;
            ArrayList arrayList = this.groupCells;
            int size = arrayList.size();
            int size2 = 0;
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) arrayList.get(i);
                float fMeasure = previewGroupCell.measure();
                previewGroupCell.y = f;
                previewGroupCell.indexStart = size2;
                f += fMeasure;
                size2 += previewGroupCell.group.photos.size();
            }
        }

        public final void stopDragging() {
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
            ValueAnimator valueAnimator = chatAttachAlertPhotoLayoutPreview.draggingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            PointF pointFDragTranslate = dragTranslate();
            float f = this.draggingT;
            this.savedDraggingT = f;
            this.savedDragFromX = pointFDragTranslate.x;
            this.savedDragFromY = pointFDragTranslate.y;
            chatAttachAlertPhotoLayoutPreview.draggingCellHiding = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
            chatAttachAlertPhotoLayoutPreview.draggingAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda3(this, 1));
            chatAttachAlertPhotoLayoutPreview.draggingAnimator.addListener(new CheckBox.AnonymousClass1(this, 19));
            chatAttachAlertPhotoLayoutPreview.draggingAnimator.setDuration(200L);
            chatAttachAlertPhotoLayoutPreview.draggingAnimator.start();
            invalidate();
        }

        public final void toPhotoLayout(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
            int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
            calcPhotoArrays();
            HashMap map = this.selectedPhotos;
            ArrayList arrayList = this.photosOrder;
            HashMap map2 = ChatAttachAlertPhotoLayout.selectedPhotos;
            map2.clear();
            map2.putAll(map);
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.selectedPhotosOrder;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            int i = 1;
            if (z) {
                chatAttachAlertPhotoLayout.updatePhotosCounter(false);
                chatAttachAlertPhotoLayout.updateCheckedPhotoIndices();
                ChatAttachAlertPhotoLayout.AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
                int childCount = anonymousClass3.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = anonymousClass3.getChildAt(i2);
                    if (childAt instanceof PhotoAttachPhotoCell) {
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                        ChatAttachAlertPhotoLayout.PhotoAttachAdapter photoAttachAdapter = chatAttachAlertPhotoLayout.adapter;
                        if (photoAttachAdapter.hasCameraSpaceRow && childAdapterPosition > chatAttachAlertPhotoLayout.itemsPerRow) {
                            childAdapterPosition--;
                        }
                        boolean z2 = photoAttachAdapter.needCamera;
                        if (z2 && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry) {
                            childAdapterPosition--;
                        }
                        PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                        ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                        if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.isPollAttach) {
                            photoAttachPhotoCell.getCheckBox().setVisibility(8);
                        }
                        MediaController.PhotoEntry photoEntryAtPosition = chatAttachAlertPhotoLayout.getPhotoEntryAtPosition(childAdapterPosition);
                        if (photoEntryAtPosition != null) {
                            HashMap map3 = ChatAttachAlertPhotoLayout.selectedPhotos;
                            photoAttachPhotoCell.setPhotoEntry(photoEntryAtPosition, map3.size() > i, z2 && chatAttachAlertPhotoLayout.selectedAlbumEntry == chatAttachAlertPhotoLayout.galleryAlbumEntry, childAdapterPosition == photoAttachAdapter.getItemCount() + (-1), chatAttachAlert.allowLivePhotos);
                            if ((chatAttachAlert.baseFragment instanceof ChatActivity) && chatAttachAlert.allowOrder) {
                                photoAttachPhotoCell.setChecked(ChatAttachAlertPhotoLayout.selectedPhotosOrder.indexOf(Integer.valueOf(photoEntryAtPosition.imageId)), map3.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                            } else {
                                photoAttachPhotoCell.setChecked(-1, map3.containsKey(Integer.valueOf(photoEntryAtPosition.imageId)), false);
                            }
                        }
                    }
                    i2++;
                    i = 1;
                }
            }
            if (size != this.photosOrder.size()) {
                ChatAttachAlertPhotoLayoutPreview.this.parentAlert.updateCountButton(1);
            }
        }

        public final void updateGroups() {
            ArrayList arrayList = this.groupCells;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) arrayList.get(i);
                if (previewGroupCell.group.photos.size() < 10 && i < arrayList.size() - 1) {
                    int size2 = 10 - previewGroupCell.group.photos.size();
                    PreviewGroupCell previewGroupCell2 = (PreviewGroupCell) arrayList.get(i + 1);
                    ArrayList arrayList2 = new ArrayList();
                    int iMin = Math.min(size2, previewGroupCell2.group.photos.size());
                    for (int i2 = 0; i2 < iMin; i2++) {
                        arrayList2.add((MediaController.PhotoEntry) previewGroupCell2.group.photos.remove(0));
                    }
                    previewGroupCell.group.photos.addAll(arrayList2);
                    PreviewGroupCell.access$600(previewGroupCell, previewGroupCell.group, true);
                    PreviewGroupCell.access$600(previewGroupCell2, previewGroupCell2.group, true);
                }
            }
        }
    }

    public ChatAttachAlertPhotoLayoutPreview(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
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
        TextView textView = new TextView(context);
        this.header = textView;
        ThemePreviewActivity.AnonymousClass9 anonymousClass9 = new ThemePreviewActivity.AnonymousClass9(this, context, actionBarMenuCreateMenu, this.resourcesProvider, 2);
        this.parentAlert.actionBar.addView(anonymousClass9, 0, LayoutHelper.createFrame(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setText(LocaleController.getString(R.string.AttachMediaPreview));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
        textView.setAlpha(0.0f);
        anonymousClass9.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, this.resourcesProvider, 11);
        this.listView = anonymousClass34;
        anonymousClass34.setAdapter(new AppIconsSelectorCell.AnonymousClass1(this, 3));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        anonymousClass34.setLayoutManager(linearLayoutManager);
        anonymousClass34.setClipChildren(false);
        anonymousClass34.setClipToPadding(false);
        anonymousClass34.setOverScrollMode(2);
        anonymousClass34.setVerticalScrollBarEnabled(false);
        PreviewGroupsView previewGroupsView = new PreviewGroupsView(context);
        this.groupsView = previewGroupsView;
        previewGroupsView.setClipToPadding(true);
        previewGroupsView.setClipChildren(true);
        addView(anonymousClass34, LayoutHelper.createFrame(-1.0f, -1));
        this.photoLayout = this.parentAlert.photoLayout;
        previewGroupsView.deletedPhotos.clear();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        previewGroupsView.photosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        previewGroupsView.photosMap = chatAttachAlertPhotoLayout.getSelectedPhotos();
        previewGroupsView.fromPhotoArrays();
        UndoView undoView = new UndoView(context, null, false, this.parentAlert.parentThemeDelegate);
        this.undoView = undoView;
        undoView.setEnterOffsetMargin(AndroidUtilities.dp(32.0f));
        addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 52.0f));
        this.videoPlayImage = context.getResources().getDrawable(R.drawable.play_mini_video);
    }

    @Override
    public final void applyCaption(Editable editable) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.applyCaption(editable);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
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
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34.getChildCount() <= 0) {
            anonymousClass34.setTopGlowOffset(anonymousClass34.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        anonymousClass34.setTopGlowOffset(top);
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
        GroupCalculator groupCalculator;
        ArrayList arrayList;
        PreviewGroupsView previewGroupsView = this.groupsView;
        int size = previewGroupsView.groupCells.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            PreviewGroupsView.PreviewGroupCell previewGroupCell = (PreviewGroupsView.PreviewGroupCell) previewGroupsView.groupCells.get(i);
            if (previewGroupCell != null && (groupCalculator = previewGroupCell.group) != null && (arrayList = groupCalculator.photos) != null) {
                size2 = arrayList.size() + size2;
            }
        }
        return size2;
    }

    @Override
    public final int needsActionBar() {
        return 1;
    }

    @Override
    public final boolean onBackPressed() {
        this.parentAlert.updatePhotoPreview(false);
        return true;
    }

    @Override
    public final void onHidden() {
        MediaController.PhotoEntry photoEntry;
        this.draggingCell = null;
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(0, false);
        }
        ArrayList arrayList = this.groupsView.groupCells;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((PreviewGroupsView.PreviewGroupCell) obj).media;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell = (PreviewGroupsView.PreviewGroupCell.MediaCell) obj2;
                if (mediaCell.wasSpoiler && (photoEntry = mediaCell.photoEntry) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override
    public final void onHide() {
        ChatAttachAlert chatAttachAlert;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.shown = false;
        ViewPropertyAnimator viewPropertyAnimator = this.headerAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.header.animate().alpha(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.EASE_BOTH);
        this.headerAnimator = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (chatAttachAlert = this.parentAlert).photoLayout) != null) {
            chatAttachAlertPhotoLayout.previewItem.setIcon(R.drawable.msg_view_file);
            chatAttachAlert.photoLayout.previewItem.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            chatAttachAlert.photoLayout.previewItem.setRightIcon(R.drawable.msg_arrowright);
        }
        this.groupsView.toPhotoLayout(this.photoLayout, true);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Point point = AndroidUtilities.displaySize;
        boolean z2 = point.y > point.x;
        if (this.isPortrait != z2) {
            this.isPortrait = z2;
            PreviewGroupsView previewGroupsView = this.groupsView;
            int size = previewGroupsView.groupCells.size();
            for (int i5 = 0; i5 < size; i5++) {
                PreviewGroupsView.PreviewGroupCell previewGroupCell = (PreviewGroupsView.PreviewGroupCell) previewGroupsView.groupCells.get(i5);
                if (previewGroupCell.group.photos.size() == 1) {
                    PreviewGroupsView.PreviewGroupCell.access$600(previewGroupCell, previewGroupCell.group, true);
                }
            }
        }
    }

    @Override
    public final void onMenuItemClick(int i) {
        try {
            this.parentAlert.photoLayout.onMenuItemClick(i);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
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
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34.getPaddingTop() != this.paddingTop || anonymousClass34.getPaddingBottom() != this.listPaddingBottom) {
            anonymousClass34.setPaddingWithoutRequestLayout(anonymousClass34.getPaddingLeft(), this.paddingTop, anonymousClass34.getPaddingRight(), this.listPaddingBottom);
            invalidate();
        }
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
        this.header.setTextSize(f);
        this.ignoreLayout = false;
    }

    @Override
    public final void onSelectedItemsCountChanged(int i) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (i > 1) {
            chatAttachAlert.selectedMenuItem.showSubItem$1(0);
        } else {
            chatAttachAlert.selectedMenuItem.hideSubItem(0);
        }
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.shown = true;
        boolean z = attachAlertLayout instanceof ChatAttachAlertPhotoLayout;
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (z) {
            this.photoLayout = (ChatAttachAlertPhotoLayout) attachAlertLayout;
            PreviewGroupsView previewGroupsView = this.groupsView;
            previewGroupsView.deletedPhotos.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            previewGroupsView.photosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            previewGroupsView.photosMap = chatAttachAlertPhotoLayout.getSelectedPhotos();
            previewGroupsView.fromPhotoArrays();
            previewGroupsView.requestLayout();
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
            anonymousClass34.post(new EmojiView$2$$ExternalSyntheticLambda1(9, this, attachAlertLayout));
            postDelayed(new Bulletin$2$$ExternalSyntheticLambda1(this, 17), 250L);
            previewGroupsView.toPhotoLayout(this.photoLayout, false);
        } else {
            anonymousClass34.smoothScrollToPosition(0);
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
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    public final void startMediaCrossfade() {
        ArrayList arrayList = this.groupsView.groupCells;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((PreviewGroupsView.PreviewGroupCell) obj).media;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell = (PreviewGroupsView.PreviewGroupCell.MediaCell) obj2;
                RectF rectFDrawingRect = mediaCell.drawingRect();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, Math.round(rectFDrawingRect.width())), Math.max(1, Math.round(rectFDrawingRect.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.save();
                canvas.translate(-rectFDrawingRect.left, -rectFDrawingRect.top);
                mediaCell.draw(canvas, false);
                canvas.restore();
                Bitmap bitmap = mediaCell.spoilerCrossfadeBitmap;
                if (bitmap != null && !bitmap.isRecycled()) {
                    mediaCell.spoilerCrossfadeBitmap.recycle();
                }
                mediaCell.spoilerCrossfadeBitmap = bitmapCreateBitmap;
                mediaCell.spoilerCrossfadeProgress = 0.0f;
                PreviewGroupsView.this.invalidate();
            }
        }
    }

    public final class GroupCalculator {
        public float height;
        public int maxX;
        public int maxY;
        public final ArrayList photos;
        public final ArrayList posArray = new ArrayList();
        public final HashMap positions = new HashMap();
        public int width;

        public GroupCalculator(ArrayList arrayList) {
            this.photos = arrayList;
            calculate();
        }

        public static float multiHeight(float[] fArr, int i, int i2) {
            float f = 0.0f;
            while (i < i2) {
                f += fArr[i];
                i++;
            }
            return 1000.0f / f;
        }

        public final void calculate() {
            float[] fArr;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            float f;
            boolean zBooleanValue;
            int intValue;
            int i6 = 8;
            ArrayList arrayList = this.photos;
            int size = arrayList.size();
            ArrayList arrayList2 = this.posArray;
            arrayList2.clear();
            HashMap map = this.positions;
            map.clear();
            if (size == 0) {
                this.width = 0;
                this.height = 0.0f;
                this.maxX = 0;
                this.maxY = 0;
                return;
            }
            arrayList2.ensureCapacity(size);
            char[] cArr = new char[size];
            int i7 = 0;
            float f2 = 1.0f;
            boolean z = false;
            while (i7 < size) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i7);
                MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
                groupedMessagePosition.last = i7 == size + (-1);
                MediaController.CropState cropState = photoEntry.cropState;
                int i8 = cropState != null ? cropState.width : photoEntry.width;
                int i9 = cropState != null ? cropState.height : photoEntry.height;
                HashMap map2 = ChatAttachAlertPhotoLayoutPreview.photoRotate;
                if (map2.containsKey(photoEntry)) {
                    zBooleanValue = ((Boolean) map2.get(photoEntry)).booleanValue();
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
                            if (intValue == 6 || intValue == i6) {
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
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                float f3 = i8 / i9;
                groupedMessagePosition.aspectRatio = f3;
                cArr[i7] = f3 > 1.2f ? 'w' : f3 < 0.8f ? 'n' : 'q';
                f2 += f3;
                if (f3 > 2.0f) {
                    z = true;
                }
                map.put(photoEntry, groupedMessagePosition);
                arrayList2.add(groupedMessagePosition);
                i7++;
                i6 = 8;
            }
            String str = new String(cArr);
            int iDp = AndroidUtilities.dp(120.0f);
            float fDp = AndroidUtilities.dp(120.0f);
            Point point = AndroidUtilities.displaySize;
            int iMin = (int) (fDp / (Math.min(point.x, point.y) / 1000.0f));
            float fDp2 = AndroidUtilities.dp(40.0f);
            Point point2 = AndroidUtilities.displaySize;
            int iMin2 = (int) (fDp2 / (Math.min(point2.x, point2.y) / 1000.0f));
            float f4 = f2 / size;
            float fDp3 = AndroidUtilities.dp(100.0f) / 814.0f;
            if (size == 1) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                int backgroundPaddingLeft = AndroidUtilities.displaySize.x - (ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getBackgroundPaddingLeft() * 2);
                Point point3 = AndroidUtilities.displaySize;
                groupedMessagePosition2.set(0, 0, 0, 0, 800, ((backgroundPaddingLeft * 0.8f) / groupedMessagePosition2.aspectRatio) / (Math.max(point3.x, point3.y) * 0.5f), 15);
            } else if (z || !(size == 2 || size == 3 || size == 4)) {
                int size2 = arrayList2.size();
                float[] fArr2 = new float[size2];
                for (int i11 = 0; i11 < size; i11++) {
                    if (f4 > 1.1f) {
                        fArr2[i11] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i11)).aspectRatio);
                    } else {
                        fArr2[i11] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i11)).aspectRatio);
                    }
                    fArr2[i11] = Math.max(0.66667f, Math.min(1.7f, fArr2[i11]));
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 1; i12 < size2; i12++) {
                    int i13 = size2 - i12;
                    if (i12 <= 3 && i13 <= 3) {
                        arrayList3.add(new MessageGroupedLayoutAttempt(i12, i13, multiHeight(fArr2, 0, i12), multiHeight(fArr2, i12, size2)));
                    }
                }
                int i14 = 1;
                while (i14 < size2 - 1) {
                    int i15 = 1;
                    while (true) {
                        int i16 = size2 - i14;
                        if (i15 < i16) {
                            int i17 = i16 - i15;
                            if (i14 > 3) {
                                i4 = i14;
                                i5 = i15;
                            } else if (i15 > (f4 < 0.85f ? 4 : 3) || i17 > 3) {
                                i4 = i14;
                                i5 = i15;
                            } else {
                                int i18 = i14 + i15;
                                i4 = i14;
                                i5 = i15;
                                arrayList3.add(new MessageGroupedLayoutAttempt(i4, i5, i17, multiHeight(fArr2, 0, i14), multiHeight(fArr2, i14, i18), multiHeight(fArr2, i18, size2)));
                            }
                            i15 = i5 + 1;
                            i14 = i4;
                        }
                    }
                    i14++;
                }
                int i19 = 1;
                while (i19 < size2 - 2) {
                    int i20 = 1;
                    while (true) {
                        int i21 = size2 - i19;
                        if (i20 < i21) {
                            int i22 = 1;
                            while (true) {
                                int i23 = i21 - i20;
                                if (i22 < i23) {
                                    int i24 = i23 - i22;
                                    if (i19 > 3 || i20 > 3 || i22 > 3) {
                                        i = i19;
                                        i2 = i20;
                                        i3 = i22;
                                    } else {
                                        if (i24 > 3) {
                                            i = i19;
                                            i2 = i20;
                                            i3 = i22;
                                        } else {
                                            int i25 = i19 + i20;
                                            int i26 = i25 + i22;
                                            i = i19;
                                            i2 = i20;
                                            i3 = i22;
                                            arrayList3.add(new MessageGroupedLayoutAttempt(i, i2, i3, i24, multiHeight(fArr2, 0, i19), multiHeight(fArr2, i19, i25), multiHeight(fArr2, i25, i26), multiHeight(fArr2, i26, size2)));
                                        }
                                        i22 = i3 + 1;
                                        i19 = i;
                                        i20 = i2;
                                    }
                                    i22 = i3 + 1;
                                    i19 = i;
                                    i20 = i2;
                                }
                            }
                            i20++;
                        }
                    }
                    i19++;
                }
                float f5 = 0.0f;
                int i27 = 0;
                MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                while (i27 < arrayList3.size()) {
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList3.get(i27);
                    float f6 = Float.MAX_VALUE;
                    float f7 = 0.0f;
                    int i28 = 0;
                    while (true) {
                        float[] fArr3 = messageGroupedLayoutAttempt2.heights;
                        if (i28 >= fArr3.length) {
                            break;
                        }
                        float f8 = fArr3[i28];
                        f7 += f8;
                        if (f8 < f6) {
                            f6 = f8;
                        }
                        i28++;
                    }
                    float fAbs = Math.abs(f7 - 1332.0f);
                    int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                    if (iArr.length > 1) {
                        int i29 = iArr[0];
                        int i30 = iArr[1];
                        if (i29 <= i30) {
                            fArr = fArr2;
                            if (iArr.length <= 2 || i30 <= iArr[2]) {
                                if (iArr.length > 3 && iArr[2] > iArr[3]) {
                                }
                            }
                            fAbs *= 1.2f;
                        } else {
                            fArr = fArr2;
                        }
                        fAbs *= 1.2f;
                    } else {
                        fArr = fArr2;
                    }
                    if (f6 < iMin) {
                        fAbs *= 1.5f;
                    }
                    if (messageGroupedLayoutAttempt == null || fAbs < f5) {
                        f5 = fAbs;
                        messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                    }
                    i27++;
                    fArr2 = fArr;
                }
                float[] fArr4 = fArr2;
                if (messageGroupedLayoutAttempt == null) {
                    return;
                }
                int i31 = 0;
                int i32 = 0;
                while (true) {
                    int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                    if (i31 >= iArr2.length) {
                        break;
                    }
                    int i33 = iArr2[i31];
                    float f9 = messageGroupedLayoutAttempt.heights[i31];
                    int i34 = 1000;
                    int i35 = 0;
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                    while (i35 < i33) {
                        int i36 = (int) (fArr4[i32] * f9);
                        i34 -= i36;
                        MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(i32);
                        int i37 = i31 == 0 ? 4 : 0;
                        if (i31 == iArr2.length - 1) {
                            i37 |= 8;
                        }
                        if (i35 == 0) {
                            i37 |= 1;
                            groupedMessagePosition3 = groupedMessagePosition4;
                        }
                        if (i35 == i33 - 1) {
                            i37 |= 2;
                            groupedMessagePosition3 = groupedMessagePosition4;
                        }
                        int i38 = i35;
                        groupedMessagePosition4.set(i38, i35, i31, i31, i36, Math.max(fDp3, f9 / 814.0f), i37);
                        i32++;
                        i35 = i38 + 1;
                    }
                    int i39 = i31;
                    if (groupedMessagePosition3 != null) {
                        groupedMessagePosition3.pw += i34;
                        groupedMessagePosition3.spanSize += i34;
                    }
                    i31 = i39 + 1;
                }
            } else if (size == 2) {
                MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                if (str.equals("ww")) {
                    f = 1000.0f;
                    if (f4 > ((double) 1.2285012f) * 1.4d) {
                        float f10 = groupedMessagePosition5.aspectRatio;
                        float f11 = groupedMessagePosition6.aspectRatio;
                        if (f10 - f11 < 0.2d) {
                            float fRound = Math.round(Math.min(1000.0f / f10, Math.min(1000.0f / f11, 407.0f))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, 1000, fRound, 7);
                            groupedMessagePosition6.set(0, 0, 1, 1, 1000, fRound, 11);
                        }
                    }
                } else {
                    f = 1000.0f;
                }
                if (str.equals("ww") || str.equals("qq")) {
                    float f12 = 500;
                    float fRound2 = Math.round(Math.min(f12 / groupedMessagePosition5.aspectRatio, Math.min(f12 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, 500, fRound2, 13);
                    groupedMessagePosition6.set(1, 1, 0, 0, 500, fRound2, 14);
                } else {
                    float f13 = groupedMessagePosition5.aspectRatio;
                    int iMax = (int) Math.max(400.0f, Math.round((f / f13) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f13))));
                    int i40 = 1000 - iMax;
                    if (i40 < iMin) {
                        iMax -= iMin - i40;
                    } else {
                        iMin = i40;
                    }
                    float fMin = Math.min(814.0f, Math.round(Math.min(iMin / groupedMessagePosition5.aspectRatio, iMax / groupedMessagePosition6.aspectRatio))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, iMin, fMin, 13);
                    groupedMessagePosition6.set(1, 1, 0, 0, iMax, fMin, 14);
                }
            } else if (size == 3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                if (str.charAt(0) == 'n') {
                    float f14 = groupedMessagePosition8.aspectRatio;
                    float fMin2 = Math.min(407.0f, Math.round((f14 * 1000.0f) / (groupedMessagePosition9.aspectRatio + f14)));
                    float f15 = 814.0f - fMin2;
                    int iMax2 = (int) Math.max(iMin, Math.min(500.0f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * fMin2, groupedMessagePosition8.aspectRatio * f15))));
                    int i41 = 1000 - iMax2;
                    groupedMessagePosition7.set(0, 0, 0, 1, Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + iMin2, i41)), 1.0f, 13);
                    float f16 = f15 / 814.0f;
                    groupedMessagePosition8.set(1, 1, 0, 0, iMax2, f16, 6);
                    float f17 = fMin2 / 814.0f;
                    groupedMessagePosition9.set(1, 1, 1, 1, iMax2, f17, 10);
                    groupedMessagePosition9.spanSize = 1000;
                    groupedMessagePosition7.siblingHeights = new float[]{f17, f16};
                    groupedMessagePosition7.spanSize = i41;
                } else {
                    float fRound3 = Math.round(Math.min(1000.0f / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                    groupedMessagePosition7.set(0, 1, 0, 0, 1000, fRound3, 7);
                    float f18 = 500;
                    float fMin3 = Math.min(814.0f - fRound3, Math.round(Math.min(f18 / groupedMessagePosition8.aspectRatio, f18 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                    float f19 = fMin3 < fDp3 ? fDp3 : fMin3;
                    groupedMessagePosition8.set(0, 0, 1, 1, 500, f19, 9);
                    groupedMessagePosition9.set(1, 1, 1, 1, 500, f19, 10);
                }
            } else {
                MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
                if (str.charAt(0) == 'w') {
                    float fRound4 = Math.round(Math.min(1000.0f / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                    groupedMessagePosition10.set(0, 2, 0, 0, 1000, fRound4, 7);
                    float fRound5 = Math.round(1000.0f / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                    float f20 = iMin;
                    int iMax3 = (int) Math.max(f20, Math.min(400.0f, groupedMessagePosition11.aspectRatio * fRound5));
                    int iMax4 = (int) Math.max(Math.max(f20, 330.0f), groupedMessagePosition13.aspectRatio * fRound5);
                    int iDp2 = (1000 - iMax3) - iMax4;
                    if (iDp2 < AndroidUtilities.dp(58.0f)) {
                        int iDp3 = AndroidUtilities.dp(58.0f) - iDp2;
                        iDp2 = AndroidUtilities.dp(58.0f);
                        int i42 = iDp3 / 2;
                        iMax3 -= i42;
                        iMax4 -= iDp3 - i42;
                    }
                    int i43 = iMax3;
                    float fMin4 = Math.min(814.0f - fRound4, fRound5) / 814.0f;
                    float f21 = fMin4 < fDp3 ? fDp3 : fMin4;
                    groupedMessagePosition11.set(0, 0, 1, 1, i43, f21, 9);
                    groupedMessagePosition12.set(1, 1, 1, 1, iDp2, f21, 8);
                    groupedMessagePosition13.set(2, 2, 1, 1, iMax4, f21, 10);
                } else {
                    int iMax5 = Math.max(iMin, Math.round(814.0f / ((1.0f / groupedMessagePosition13.aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                    float f22 = iDp;
                    float f23 = iMax5;
                    float fMin5 = Math.min(0.33f, Math.max(f22, f23 / groupedMessagePosition11.aspectRatio) / 814.0f);
                    float fMin6 = Math.min(0.33f, Math.max(f22, f23 / groupedMessagePosition12.aspectRatio) / 814.0f);
                    float f24 = (1.0f - fMin5) - fMin6;
                    int i44 = 1000 - iMax5;
                    groupedMessagePosition10.set(0, 0, 0, 2, Math.round(Math.min((groupedMessagePosition10.aspectRatio * 814.0f) + iMin2, i44)), fMin5 + fMin6 + f24, 13);
                    groupedMessagePosition11.set(1, 1, 0, 0, iMax5, fMin5, 6);
                    groupedMessagePosition12.set(1, 1, 1, 1, iMax5, fMin6, 2);
                    groupedMessagePosition12.spanSize = 1000;
                    groupedMessagePosition13.set(1, 1, 2, 2, iMax5, f24, 10);
                    groupedMessagePosition13.spanSize = 1000;
                    groupedMessagePosition10.spanSize = i44;
                    groupedMessagePosition10.siblingHeights = new float[]{fMin5, fMin6, f24};
                }
            }
            int i45 = 0;
            while (i45 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i45);
                if (groupedMessagePosition14.minX == 0) {
                    groupedMessagePosition14.spanSize += 200;
                }
                if ((groupedMessagePosition14.flags & 2) != 0) {
                    groupedMessagePosition14.edge = true;
                }
                this.maxX = Math.max(this.maxX, (int) groupedMessagePosition14.maxX);
                this.maxY = Math.max(this.maxY, (int) groupedMessagePosition14.maxY);
                byte b = groupedMessagePosition14.minY;
                byte b2 = groupedMessagePosition14.maxY;
                byte b3 = groupedMessagePosition14.minX;
                int i46 = (b2 - b) + 1;
                float[] fArr5 = new float[i46];
                Arrays.fill(fArr5, 0.0f);
                int size3 = arrayList2.size();
                int i47 = 0;
                while (i47 < size3) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i47);
                    if (groupedMessagePosition15 != groupedMessagePosition14 && groupedMessagePosition15.maxX < b3) {
                        int iMin3 = Math.min((int) groupedMessagePosition15.maxY, (int) b2) - b;
                        int iMax6 = Math.max(groupedMessagePosition15.minY - b, 0);
                        while (iMax6 <= iMin3) {
                            fArr5[iMax6] = fArr5[iMax6] + groupedMessagePosition15.pw;
                            iMax6++;
                            i45 = i45;
                        }
                    }
                    i47++;
                    i45 = i45;
                }
                int i48 = i45;
                float f25 = 0.0f;
                for (int i49 = 0; i49 < i46; i49++) {
                    float f26 = fArr5[i49];
                    if (f25 < f26) {
                        f25 = f26;
                    }
                }
                groupedMessagePosition14.left = f25;
                i45 = i48 + 1;
            }
            for (int i50 = 0; i50 < size; i50++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i50);
                byte b4 = groupedMessagePosition16.minY;
                int i51 = this.maxX + 1;
                float[] fArr6 = new float[i51];
                Arrays.fill(fArr6, 0.0f);
                int size4 = arrayList2.size();
                for (int i52 = 0; i52 < size4; i52++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i52);
                    if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxY < b4) {
                        for (int i53 = groupedMessagePosition17.minX; i53 <= groupedMessagePosition17.maxX; i53++) {
                            fArr6[i53] = fArr6[i53] + groupedMessagePosition17.ph;
                        }
                    }
                }
                float f27 = 0.0f;
                for (int i54 = 0; i54 < i51; i54++) {
                    float f28 = fArr6[i54];
                    if (f27 < f28) {
                        f27 = f28;
                    }
                }
                groupedMessagePosition16.top = f27;
            }
            int[] iArr3 = new int[10];
            Arrays.fill(iArr3, 0);
            int size5 = arrayList2.size();
            for (int i55 = 0; i55 < size5; i55++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i55);
                int i56 = groupedMessagePosition18.pw;
                for (int i57 = groupedMessagePosition18.minY; i57 <= groupedMessagePosition18.maxY; i57++) {
                    iArr3[i57] = iArr3[i57] + i56;
                }
            }
            int i58 = iArr3[0];
            for (int i59 = 1; i59 < 10; i59++) {
                int i60 = iArr3[i59];
                if (i58 < i60) {
                    i58 = i60;
                }
            }
            this.width = i58;
            float[] fArr7 = new float[10];
            Arrays.fill(fArr7, 0.0f);
            int size6 = arrayList2.size();
            for (int i61 = 0; i61 < size6; i61++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i61);
                float f29 = groupedMessagePosition19.ph;
                for (int i62 = groupedMessagePosition19.minX; i62 <= groupedMessagePosition19.maxX; i62++) {
                    fArr7[i62] = fArr7[i62] + f29;
                }
            }
            float f30 = fArr7[0];
            for (int i63 = 1; i63 < 10; i63++) {
                float f31 = fArr7[i63];
                if (f30 < f31) {
                    f30 = f31;
                }
            }
            this.height = f30;
        }

        public final class MessageGroupedLayoutAttempt {
            public final float[] heights;
            public final int[] lineCounts;

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
    }
}
