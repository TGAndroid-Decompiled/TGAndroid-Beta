package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

public final class GroupedPhotosListView extends View implements GestureDetector.OnGestureListener {
    public boolean animateAllLine;
    public boolean animateBackground;
    public int animateToDX;
    public int animateToDXStart;
    public int animateToItem;
    public boolean animateToItemFast;
    public boolean animationsEnabled;
    public final Paint backgroundPaint;
    public long currentGroupId;
    public int currentImage;
    public float currentItemProgress;
    public final ArrayList currentObjects;
    public final ArrayList currentPhotos;
    public GroupedPhotosListViewDelegate delegate;
    public float drawAlpha;
    public int drawDx;
    public final GestureDetector gestureDetector;
    public boolean hasPhotos;
    public ValueAnimator hideAnimator;
    public boolean ignoreChanges;
    public final ArrayList imagesToDraw;
    public final int itemHeight;
    public final int itemSpacing;
    public final int itemWidth;
    public final int itemY;
    public long lastUpdateTime;
    public float moveLineProgress;
    public boolean moving;
    public int nextImage;
    public float nextItemProgress;
    public int nextPhotoScrolling;
    public final android.widget.Scroller scroll;
    public boolean scrolling;
    public ValueAnimator showAnimator;
    public boolean stopedScrolling;
    public final ArrayList unusedReceivers;

    public interface GroupedPhotosListViewDelegate {
    }

    public GroupedPhotosListView(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        this.unusedReceivers = new ArrayList();
        this.imagesToDraw = new ArrayList();
        this.currentPhotos = new ArrayList();
        this.currentObjects = new ArrayList();
        this.currentItemProgress = 1.0f;
        this.nextItemProgress = 0.0f;
        this.animateToItem = -1;
        this.animationsEnabled = true;
        this.nextPhotoScrolling = -1;
        this.animateBackground = true;
        this.gestureDetector = new GestureDetector(contextThemeWrapper, this);
        this.scroll = new android.widget.Scroller(contextThemeWrapper);
        this.itemWidth = AndroidUtilities.dp(42.0f);
        this.itemHeight = AndroidUtilities.dp(56.0f);
        this.itemSpacing = AndroidUtilities.dp(1.0f);
        this.itemY = i;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.unusedReceivers;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            ImageReceiver imageReceiver2 = (ImageReceiver) arrayList.get(0);
            arrayList.remove(0);
            imageReceiver = imageReceiver2;
        }
        this.imagesToDraw.add(imageReceiver);
        imageReceiver.setCurrentAccount(PhotoViewer.this.currentAccount);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.itemSpacing * 2) + this.itemWidth) * this.currentImage;
    }

    private int getMinScrollX() {
        return ((this.itemSpacing * 2) + this.itemWidth) * (-((this.currentPhotos.size() - this.currentImage) - 1));
    }

    public final void fillImages(int i, boolean z) {
        int iMax;
        int iMin;
        Object parentObject;
        Object obj;
        Object parentObject2;
        Object obj2;
        ArrayList arrayList = this.unusedReceivers;
        ArrayList arrayList2 = this.imagesToDraw;
        if (!z && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.moving = false;
            this.moveLineProgress = 1.0f;
            this.currentItemProgress = 1.0f;
            this.nextItemProgress = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.currentPhotos;
            if (arrayList3.isEmpty()) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth() / 2;
            int i2 = this.itemWidth;
            int i3 = measuredWidth2 - (i2 / 2);
            int i4 = this.itemSpacing;
            if (z) {
                int size = arrayList2.size();
                int i5 = 0;
                iMax = Integer.MIN_VALUE;
                iMin = Integer.MAX_VALUE;
                while (i5 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i5);
                    int param = imageReceiver.getParam();
                    int i6 = ((i2 + i4) * (param - this.currentImage)) + i3 + i;
                    if (i6 > measuredWidth || i6 + i2 < 0) {
                        arrayList.add(imageReceiver);
                        arrayList2.remove(i5);
                        size--;
                        i5--;
                    }
                    iMin = Math.min(iMin, param - 1);
                    iMax = Math.max(iMax, param + 1);
                    i5++;
                }
            } else {
                iMax = this.currentImage;
                iMin = iMax - 1;
            }
            ArrayList arrayList4 = this.currentObjects;
            int i7 = this.itemHeight;
            int i8 = this.itemY;
            if (iMax != Integer.MIN_VALUE) {
                int size2 = arrayList3.size();
                while (iMax < size2) {
                    int i9 = ((i2 + i4) * (iMax - this.currentImage)) + i3 + i;
                    if (i9 >= measuredWidth) {
                        break;
                    }
                    ImageLocation imageLocation = (ImageLocation) arrayList3.get(iMax);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i10 = measuredWidth;
                    int i11 = i3;
                    freeReceiver.setImageCoords(i9, i8, i2, i7);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        parentObject2 = arrayList4.get(iMax);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        PhotoViewer.PageBlocksAdapter pageBlocksAdapter = PhotoViewer.this.pageBlocksAdapter;
                        if (pageBlocksAdapter != null) {
                            parentObject2 = pageBlocksAdapter.getParentObject();
                        } else {
                            obj2 = null;
                        }
                        freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, obj2, 1);
                        freeReceiver.setParam(iMax);
                        iMax++;
                        measuredWidth = i10;
                        i3 = i11;
                    } else {
                        parentObject2 = "avatar_" + PhotoViewer.this.avatarsDialogId;
                    }
                    obj2 = parentObject2;
                    freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, obj2, 1);
                    freeReceiver.setParam(iMax);
                    iMax++;
                    measuredWidth = i10;
                    i3 = i11;
                }
            }
            int i12 = i3;
            if (iMin != Integer.MAX_VALUE) {
                while (iMin >= 0) {
                    int i13 = ((i2 + i4) * (iMin - this.currentImage)) + i12 + i + i2;
                    if (i13 <= 0) {
                        break;
                    }
                    ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(iMin);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.setImageCoords(i13, i8, i2, i7);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        parentObject = arrayList4.get(iMin);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        PhotoViewer.PageBlocksAdapter pageBlocksAdapter2 = PhotoViewer.this.pageBlocksAdapter;
                        if (pageBlocksAdapter2 != null) {
                            parentObject = pageBlocksAdapter2.getParentObject();
                        } else {
                            obj = null;
                        }
                        freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, obj, 1);
                        freeReceiver2.setParam(iMin);
                        iMin--;
                    } else {
                        parentObject = "avatar_" + PhotoViewer.this.avatarsDialogId;
                    }
                    obj = parentObject;
                    freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, obj, 1);
                    freeReceiver2.setParam(iMin);
                    iMin--;
                }
            }
            ValueAnimator valueAnimator = this.showAnimator;
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            this.showAnimator.start();
        }
    }

    public final void fillList() {
        final int i;
        long j;
        boolean z;
        Object obj;
        TL_iv.PageBlock pageBlock;
        TL_iv.PageBlock pageBlock2;
        int i2;
        PhotoViewer.PhotoViewerProvider photoViewerProvider;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z3;
        int size;
        int size2;
        int i3;
        int i4;
        int i5;
        TL_iv.PageBlock pageBlock3;
        TL_iv.PageBlock pageBlock4;
        boolean z4;
        ValueAnimator valueAnimator;
        float f;
        ValueAnimator valueAnimator2;
        Object obj2;
        final int i6 = 1;
        int i7 = 0;
        if (this.ignoreChanges) {
            this.ignoreChanges = false;
            return;
        }
        PhotoViewer photoViewer = PhotoViewer.this;
        int size3 = photoViewer.currentIndex;
        ArrayList arrayList3 = photoViewer.imagesArrLocations;
        ArrayList arrayList4 = photoViewer.imagesArr;
        PhotoViewer.PageBlocksAdapter pageBlocksAdapter = photoViewer.pageBlocksAdapter;
        List all = pageBlocksAdapter != null ? pageBlocksAdapter.getAll() : null;
        int i8 = PhotoViewer.this.slideshowMessageId;
        this.hasPhotos = false;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            if (arrayList4 == null || arrayList4.isEmpty()) {
                i = 0;
                j = 0;
                if (all == null || all.isEmpty()) {
                    i8 = i8;
                    i7 = 0;
                    z = false;
                    obj = null;
                } else {
                    pageBlock = (TL_iv.PageBlock) all.get(size3);
                    long j2 = pageBlock.groupId;
                    if (j2 != this.currentGroupId) {
                        this.currentGroupId = j2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.currentGroupId != 0) {
                        this.hasPhotos = true;
                        int size4 = all.size();
                        int i9 = size3;
                        int i10 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                i8 = i8;
                                break;
                            }
                            i8 = i8;
                            if (((TL_iv.PageBlock) all.get(i9)).groupId != this.currentGroupId) {
                                break;
                            }
                            i10++;
                            i9++;
                            i8 = i8;
                        }
                        int i11 = size3 - 1;
                        int i12 = i10;
                        TL_iv.PageBlock pageBlock5 = pageBlock;
                        while (true) {
                            if (i11 < 0) {
                                pageBlock2 = pageBlock5;
                                i = 0;
                                break;
                            }
                            pageBlock2 = pageBlock5;
                            i = 0;
                            if (((TL_iv.PageBlock) all.get(i11)).groupId != this.currentGroupId) {
                                break;
                            }
                            i12++;
                            i11--;
                            pageBlock5 = pageBlock2;
                        }
                        obj = pageBlock2;
                        i7 = i12;
                    } else {
                        i8 = i8;
                        i7 = 0;
                    }
                }
            } else {
                if (size3 >= arrayList4.size()) {
                    size3 = arrayList4.size() - 1;
                }
                MessageObject messageObject = (MessageObject) arrayList4.get(size3);
                long groupIdForUse = messageObject.getGroupIdForUse();
                j = 0;
                if (groupIdForUse != this.currentGroupId) {
                    this.currentGroupId = groupIdForUse;
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = arrayList4.size() > 1 && (photoViewerProvider = PhotoViewer.this.placeProvider) != null && photoViewerProvider.forceAllInGroup();
                if (this.currentGroupId != 0 || z5) {
                    this.hasPhotos = true;
                    int iMin = Math.min(size3 + 10, arrayList4.size());
                    int i13 = 0;
                    for (int i14 = size3; i14 < iMin; i14++) {
                        MessageObject messageObject2 = (MessageObject) arrayList4.get(i14);
                        if (i8 == 0 && !z5) {
                            if (messageObject2.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                        }
                        i13++;
                    }
                    int iMax = Math.max(size3 - 10, 0);
                    int i15 = size3 - 1;
                    int i16 = i13;
                    while (true) {
                        if (i15 < iMax) {
                            i2 = size3;
                            i = 0;
                            break;
                        }
                        MessageObject messageObject3 = (MessageObject) arrayList4.get(i15);
                        if (i8 == 0 && !z5) {
                            long groupIdForUse2 = messageObject3.getGroupIdForUse();
                            i2 = size3;
                            i = 0;
                            if (groupIdForUse2 != this.currentGroupId) {
                                break;
                            }
                        } else {
                            i2 = size3;
                        }
                        i16++;
                        i15--;
                        size3 = i2;
                    }
                    i8 = i8;
                    i7 = i16;
                    size3 = i2;
                    obj = messageObject;
                } else {
                    i = 0;
                    obj2 = messageObject;
                }
            }
            if (obj == null) {
                obj = pageBlock;
                return;
            }
            obj = pageBlock;
            z2 = this.animationsEnabled;
            arrayList = this.currentPhotos;
            if (z2) {
                if (this.hasPhotos) {
                    valueAnimator = this.hideAnimator;
                    if (valueAnimator != null) {
                        this.hideAnimator = null;
                        valueAnimator.cancel();
                    }
                    f = this.drawAlpha;
                    if (f < 1.0f && this.showAnimator == null) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 1.0f);
                        this.showAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.setDuration((long) ((1.0f - this.drawAlpha) * 200.0f));
                        this.showAnimator.addListener(new AnimatorListenerAdapter(this) {
                            public final GroupedPhotosListView this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i6) {
                                    case 0:
                                        GroupedPhotosListView groupedPhotosListView = this.this$0;
                                        if (groupedPhotosListView.hideAnimator == animator) {
                                            groupedPhotosListView.hideAnimator = null;
                                            groupedPhotosListView.fillList();
                                        }
                                        break;
                                    default:
                                        GroupedPhotosListView groupedPhotosListView2 = this.this$0;
                                        if (groupedPhotosListView2.showAnimator == animator) {
                                            groupedPhotosListView2.showAnimator = null;
                                        }
                                        break;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                switch (i6) {
                                    case 1:
                                        GroupedPhotosListViewDelegate groupedPhotosListViewDelegate = this.this$0.delegate;
                                        if (groupedPhotosListViewDelegate != null) {
                                            PhotoViewer.this.containerView.requestLayout();
                                        }
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        });
                        this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final GroupedPhotosListView f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i6) {
                                    case 0:
                                        GroupedPhotosListView groupedPhotosListView = this.f$0;
                                        groupedPhotosListView.getClass();
                                        groupedPhotosListView.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        groupedPhotosListView.invalidate();
                                        break;
                                    default:
                                        GroupedPhotosListView groupedPhotosListView2 = this.f$0;
                                        groupedPhotosListView2.getClass();
                                        groupedPhotosListView2.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        groupedPhotosListView2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                } else {
                    valueAnimator2 = this.showAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        this.showAnimator = null;
                    }
                    if (this.drawAlpha > 0.0f && arrayList.size() > 1) {
                        if (this.hideAnimator == null) {
                            float[] fArr = new float[2];
                            fArr[i] = this.drawAlpha;
                            fArr[1] = 0.0f;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr);
                            this.hideAnimator = valueAnimatorOfFloat2;
                            valueAnimatorOfFloat2.setDuration((long) (this.drawAlpha * 200.0f));
                            this.hideAnimator.addListener(new AnimatorListenerAdapter(this) {
                                public final GroupedPhotosListView this$0;

                                {
                                    this.this$0 = this;
                                }

                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    switch (i) {
                                        case 0:
                                            GroupedPhotosListView groupedPhotosListView = this.this$0;
                                            if (groupedPhotosListView.hideAnimator == animator) {
                                                groupedPhotosListView.hideAnimator = null;
                                                groupedPhotosListView.fillList();
                                            }
                                            break;
                                        default:
                                            GroupedPhotosListView groupedPhotosListView2 = this.this$0;
                                            if (groupedPhotosListView2.showAnimator == animator) {
                                                groupedPhotosListView2.showAnimator = null;
                                            }
                                            break;
                                    }
                                }

                                @Override
                                public void onAnimationStart(Animator animator) {
                                    switch (i) {
                                        case 1:
                                            GroupedPhotosListViewDelegate groupedPhotosListViewDelegate = this.this$0.delegate;
                                            if (groupedPhotosListViewDelegate != null) {
                                                PhotoViewer.this.containerView.requestLayout();
                                            }
                                            break;
                                        default:
                                            super.onAnimationStart(animator);
                                            break;
                                    }
                                }
                            });
                            this.hideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final GroupedPhotosListView f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                    switch (i) {
                                        case 0:
                                            GroupedPhotosListView groupedPhotosListView = this.f$0;
                                            groupedPhotosListView.getClass();
                                            groupedPhotosListView.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                            groupedPhotosListView.invalidate();
                                            break;
                                        default:
                                            GroupedPhotosListView groupedPhotosListView2 = this.f$0;
                                            groupedPhotosListView2.getClass();
                                            groupedPhotosListView2.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                            groupedPhotosListView2.invalidate();
                                            break;
                                    }
                                }
                            });
                            this.hideAnimator.start();
                            return;
                        }
                        return;
                    }
                }
            }
            arrayList2 = this.currentObjects;
            if (z) {
                z3 = false;
            } else if (i7 == arrayList.size() || !arrayList2.contains(obj)) {
                z3 = false;
                z = true;
            } else {
                int iIndexOf = arrayList2.indexOf(obj);
                int i17 = this.currentImage;
                if (i17 == iIndexOf || iIndexOf == -1) {
                    z3 = false;
                } else {
                    boolean z6 = this.animateAllLine;
                    if (!z6 && !this.moving && (iIndexOf == i17 - 1 || iIndexOf == i17 + 1)) {
                        this.animateToItemFast = true;
                        z6 = true;
                    }
                    int i18 = this.itemSpacing;
                    int i19 = this.itemWidth;
                    if (z6) {
                        this.animateToItem = iIndexOf;
                        this.nextImage = iIndexOf;
                        this.animateToDX = (i19 + i18) * (i17 - iIndexOf);
                        this.moving = true;
                        z3 = false;
                        this.animateAllLine = false;
                        this.lastUpdateTime = System.currentTimeMillis();
                        invalidate();
                    } else {
                        z3 = false;
                        fillImages((i19 + i18) * (i17 - iIndexOf), true);
                        this.currentImage = iIndexOf;
                        this.moving = false;
                    }
                    this.drawDx = z3 ? 1 : 0;
                }
            }
            if (z) {
                size = arrayList.size();
                this.animateAllLine = z3;
                arrayList.clear();
                arrayList2.clear();
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList2.addAll(arrayList3);
                    arrayList.addAll(arrayList3);
                    this.currentImage = size3;
                    this.animateToItem = -1;
                    this.animateToItemFast = z3;
                } else if (arrayList4 == null && !arrayList4.isEmpty()) {
                    PhotoViewer.PhotoViewerProvider photoViewerProvider2 = PhotoViewer.this.placeProvider;
                    boolean z7 = (photoViewerProvider2 != null && photoViewerProvider2.forceAllInGroup()) && arrayList4.size() > 1;
                    if (this.currentGroupId != j || z7 || i8 != 0) {
                        int iMin2 = Math.min(size3 + 10, arrayList4.size());
                        int i20 = size3;
                        while (true) {
                            if (i20 >= iMin2) {
                                z4 = z7;
                                break;
                            }
                            MessageObject messageObject4 = (MessageObject) arrayList4.get(i20);
                            if (i8 == 0 && !z7) {
                                z4 = z7;
                                if (messageObject4.getGroupIdForUse() != this.currentGroupId) {
                                    break;
                                }
                            } else {
                                z4 = z7;
                            }
                            arrayList2.add(messageObject4);
                            arrayList.add(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, 56, true), messageObject4.photoThumbsObject));
                            i20++;
                            z7 = z4;
                        }
                        this.currentImage = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                        int iMax2 = Math.max(size3 - 10, 0);
                        for (int i21 = size3 - 1; i21 >= iMax2; i21--) {
                            MessageObject messageObject5 = (MessageObject) arrayList4.get(i21);
                            if (i8 == 0 && !z4 && messageObject5.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                            arrayList2.add(0, messageObject5);
                            arrayList.add(0, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, 56, true), messageObject5.photoThumbsObject));
                            this.currentImage++;
                        }
                    }
                } else if (all != null && !all.isEmpty() && this.currentGroupId != j) {
                    size2 = all.size();
                    for (i3 = size3; i3 < size2; i3++) {
                        pageBlock4 = (TL_iv.PageBlock) all.get(i3);
                        if (pageBlock4.groupId != this.currentGroupId) {
                            break;
                        }
                        arrayList2.add(pageBlock4);
                        arrayList.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                    i4 = 0;
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    i5 = size3 - 1;
                    while (i5 >= 0) {
                        pageBlock3 = (TL_iv.PageBlock) all.get(i5);
                        if (pageBlock3.groupId != this.currentGroupId) {
                            break;
                        }
                        arrayList2.add(i4, pageBlock3);
                        arrayList.add(i4, ImageLocation.getForObject(pageBlock3.thumb, pageBlock3.thumbObject));
                        this.currentImage++;
                        i5--;
                        i4 = 0;
                    }
                }
                if (arrayList.size() == 1) {
                    arrayList.clear();
                    arrayList2.clear();
                }
                if (arrayList.size() != size) {
                    requestLayout();
                }
                fillImages(0, false);
            }
        }
        if (size3 >= arrayList3.size()) {
            size3 = arrayList3.size() - 1;
        }
        ImageLocation imageLocation = (ImageLocation) arrayList3.get(size3);
        int size5 = arrayList3.size();
        this.hasPhotos = true;
        i7 = size5;
        z = false;
        i = 0;
        j = 0;
        obj2 = imageLocation;
        obj = obj2;
        if (obj == null) {
            obj = pageBlock;
            return;
        }
        obj = pageBlock;
        z2 = this.animationsEnabled;
        arrayList = this.currentPhotos;
        if (z2) {
            if (this.hasPhotos) {
                valueAnimator2 = this.showAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.showAnimator = null;
                }
                if (this.drawAlpha > 0.0f) {
                    if (this.hideAnimator == null) {
                        float[] fArr2 = new float[2];
                        fArr2[i] = this.drawAlpha;
                        fArr2[1] = 0.0f;
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr2);
                        this.hideAnimator = valueAnimatorOfFloat3;
                        valueAnimatorOfFloat3.setDuration((long) (this.drawAlpha * 200.0f));
                        this.hideAnimator.addListener(new AnimatorListenerAdapter(this) {
                            public final GroupedPhotosListView this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i) {
                                    case 0:
                                        GroupedPhotosListView groupedPhotosListView = this.this$0;
                                        if (groupedPhotosListView.hideAnimator == animator) {
                                            groupedPhotosListView.hideAnimator = null;
                                            groupedPhotosListView.fillList();
                                        }
                                        break;
                                    default:
                                        GroupedPhotosListView groupedPhotosListView2 = this.this$0;
                                        if (groupedPhotosListView2.showAnimator == animator) {
                                            groupedPhotosListView2.showAnimator = null;
                                        }
                                        break;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                switch (i) {
                                    case 1:
                                        GroupedPhotosListViewDelegate groupedPhotosListViewDelegate = this.this$0.delegate;
                                        if (groupedPhotosListViewDelegate != null) {
                                            PhotoViewer.this.containerView.requestLayout();
                                        }
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        });
                        this.hideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final GroupedPhotosListView f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i) {
                                    case 0:
                                        GroupedPhotosListView groupedPhotosListView = this.f$0;
                                        groupedPhotosListView.getClass();
                                        groupedPhotosListView.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        groupedPhotosListView.invalidate();
                                        break;
                                    default:
                                        GroupedPhotosListView groupedPhotosListView2 = this.f$0;
                                        groupedPhotosListView2.getClass();
                                        groupedPhotosListView2.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        groupedPhotosListView2.invalidate();
                                        break;
                                }
                            }
                        });
                        this.hideAnimator.start();
                        return;
                    }
                    return;
                }
            } else {
                valueAnimator = this.hideAnimator;
                if (valueAnimator != null) {
                    this.hideAnimator = null;
                    valueAnimator.cancel();
                }
                f = this.drawAlpha;
                if (f < 1.0f) {
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f, 1.0f);
                    this.showAnimator = valueAnimatorOfFloat4;
                    valueAnimatorOfFloat4.setDuration((long) ((1.0f - this.drawAlpha) * 200.0f));
                    this.showAnimator.addListener(new AnimatorListenerAdapter(this) {
                        public final GroupedPhotosListView this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i6) {
                                case 0:
                                    GroupedPhotosListView groupedPhotosListView = this.this$0;
                                    if (groupedPhotosListView.hideAnimator == animator) {
                                        groupedPhotosListView.hideAnimator = null;
                                        groupedPhotosListView.fillList();
                                    }
                                    break;
                                default:
                                    GroupedPhotosListView groupedPhotosListView2 = this.this$0;
                                    if (groupedPhotosListView2.showAnimator == animator) {
                                        groupedPhotosListView2.showAnimator = null;
                                    }
                                    break;
                            }
                        }

                        @Override
                        public void onAnimationStart(Animator animator) {
                            switch (i6) {
                                case 1:
                                    GroupedPhotosListViewDelegate groupedPhotosListViewDelegate = this.this$0.delegate;
                                    if (groupedPhotosListViewDelegate != null) {
                                        PhotoViewer.this.containerView.requestLayout();
                                    }
                                    break;
                                default:
                                    super.onAnimationStart(animator);
                                    break;
                            }
                        }
                    });
                    this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final GroupedPhotosListView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            switch (i6) {
                                case 0:
                                    GroupedPhotosListView groupedPhotosListView = this.f$0;
                                    groupedPhotosListView.getClass();
                                    groupedPhotosListView.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                    groupedPhotosListView.invalidate();
                                    break;
                                default:
                                    GroupedPhotosListView groupedPhotosListView2 = this.f$0;
                                    groupedPhotosListView2.getClass();
                                    groupedPhotosListView2.drawAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                    groupedPhotosListView2.invalidate();
                                    break;
                            }
                        }
                    });
                }
            }
        }
        arrayList2 = this.currentObjects;
        if (z) {
            z3 = false;
        } else if (i7 == arrayList.size()) {
            z3 = false;
            z = true;
        } else {
            z3 = false;
            z = true;
        }
        if (z) {
            size = arrayList.size();
            this.animateAllLine = z3;
            arrayList.clear();
            arrayList2.clear();
            if (arrayList3 != null) {
                if (arrayList4 == null) {
                    if (all != null) {
                        size2 = all.size();
                        while (i3 < size2) {
                            pageBlock4 = (TL_iv.PageBlock) all.get(i3);
                            if (pageBlock4.groupId != this.currentGroupId) {
                                break;
                                break;
                            } else {
                                arrayList2.add(pageBlock4);
                                arrayList.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                            }
                        }
                        i4 = 0;
                        this.currentImage = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                        i5 = size3 - 1;
                        while (i5 >= 0) {
                            pageBlock3 = (TL_iv.PageBlock) all.get(i5);
                            if (pageBlock3.groupId != this.currentGroupId) {
                                break;
                                break;
                            }
                            arrayList2.add(i4, pageBlock3);
                            arrayList.add(i4, ImageLocation.getForObject(pageBlock3.thumb, pageBlock3.thumbObject));
                            this.currentImage++;
                            i5--;
                            i4 = 0;
                        }
                    }
                } else if (all != null) {
                    size2 = all.size();
                    while (i3 < size2) {
                        pageBlock4 = (TL_iv.PageBlock) all.get(i3);
                        if (pageBlock4.groupId != this.currentGroupId) {
                            break;
                            break;
                        } else {
                            arrayList2.add(pageBlock4);
                            arrayList.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                        }
                    }
                    i4 = 0;
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    i5 = size3 - 1;
                    while (i5 >= 0) {
                        pageBlock3 = (TL_iv.PageBlock) all.get(i5);
                        if (pageBlock3.groupId != this.currentGroupId) {
                            break;
                            break;
                        }
                        arrayList2.add(i4, pageBlock3);
                        arrayList.add(i4, ImageLocation.getForObject(pageBlock3.thumb, pageBlock3.thumbObject));
                        this.currentImage++;
                        i5--;
                        i4 = 0;
                    }
                }
            } else if (arrayList4 == null) {
                if (all != null) {
                    size2 = all.size();
                    while (i3 < size2) {
                        pageBlock4 = (TL_iv.PageBlock) all.get(i3);
                        if (pageBlock4.groupId != this.currentGroupId) {
                            break;
                            break;
                        } else {
                            arrayList2.add(pageBlock4);
                            arrayList.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                        }
                    }
                    i4 = 0;
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    i5 = size3 - 1;
                    while (i5 >= 0) {
                        pageBlock3 = (TL_iv.PageBlock) all.get(i5);
                        if (pageBlock3.groupId != this.currentGroupId) {
                            break;
                            break;
                        }
                        arrayList2.add(i4, pageBlock3);
                        arrayList.add(i4, ImageLocation.getForObject(pageBlock3.thumb, pageBlock3.thumbObject));
                        this.currentImage++;
                        i5--;
                        i4 = 0;
                    }
                }
            } else if (all != null) {
                size2 = all.size();
                while (i3 < size2) {
                    pageBlock4 = (TL_iv.PageBlock) all.get(i3);
                    if (pageBlock4.groupId != this.currentGroupId) {
                        break;
                        break;
                    } else {
                        arrayList2.add(pageBlock4);
                        arrayList.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                }
                i4 = 0;
                this.currentImage = 0;
                this.animateToItem = -1;
                this.animateToItemFast = false;
                i5 = size3 - 1;
                while (i5 >= 0) {
                    pageBlock3 = (TL_iv.PageBlock) all.get(i5);
                    if (pageBlock3.groupId != this.currentGroupId) {
                        break;
                        break;
                    }
                    arrayList2.add(i4, pageBlock3);
                    arrayList.add(i4, ImageLocation.getForObject(pageBlock3.thumb, pageBlock3.thumbObject));
                    this.currentImage++;
                    i5--;
                    i4 = 0;
                }
            }
            if (arrayList.size() == 1) {
                arrayList.clear();
                arrayList2.clear();
            }
            if (arrayList.size() != size) {
                requestLayout();
            }
            fillImages(0, false);
        }
    }

    public int getCount() {
        return this.currentPhotos.size();
    }

    public int getIndex() {
        return this.currentImage;
    }

    public final boolean hasPhotos() {
        if (!this.hasPhotos || this.hideAnimator != null) {
            return false;
        }
        if (this.drawAlpha > 0.0f || !this.animateBackground) {
            return true;
        }
        ValueAnimator valueAnimator = this.showAnimator;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        android.widget.Scroller scroller = this.scroll;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.animateToItem = -1;
        this.animateToItemFast = false;
        return true;
    }

    @Override
    public final void onDraw(Canvas canvas) throws Throwable {
        int i;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z = this.hasPhotos;
        ArrayList arrayList = this.imagesToDraw;
        if (z || !arrayList.isEmpty()) {
            float f = this.drawAlpha;
            if (!this.animateBackground) {
                f = this.hasPhotos ? 1.0f : 0.0f;
            }
            Paint paint = this.backgroundPaint;
            paint.setAlpha((int) (f * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.drawDx;
            int i3 = this.itemWidth;
            int i4 = (int) (i3 * 2.0f);
            int iDp = AndroidUtilities.dp(8.0f);
            ArrayList arrayList2 = this.currentPhotos;
            ImageLocation imageLocation = (ImageLocation) arrayList2.get(this.currentImage);
            int iMax = this.itemHeight;
            int iMin = Math.min(i4, (imageLocation == null || (photoSize2 = imageLocation.photoSize) == null) ? iMax : Math.max(i3, (int) ((iMax / photoSize2.h) * photoSize2.w)));
            float f2 = iDp * 2;
            float f3 = this.currentItemProgress;
            int i5 = (int) (f2 * f3);
            int i6 = ((int) ((iMin - i3) * f3)) + i3 + i5;
            int i7 = this.nextImage;
            if (i7 < 0 || i7 >= arrayList2.size()) {
                iMax = i3;
            } else {
                ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.nextImage);
                if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                    iMax = Math.max(i3, (int) ((iMax / photoSize.h) * photoSize.w));
                }
            }
            int iMin2 = Math.min(i4, iMax);
            float f4 = this.nextItemProgress;
            int i8 = (int) (f2 * f4);
            int i9 = (int) (((((iMin2 + i8) - i3) / 2) * f4 * (this.nextImage > this.currentImage ? -1 : 1)) + i2);
            int i10 = ((int) ((iMin2 - i3) * f4)) + i3 + i8;
            int measuredWidth = (getMeasuredWidth() - i6) / 2;
            int i11 = 0;
            for (int size = arrayList.size(); i11 < size; size = i) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i11);
                int param = imageReceiver.getParam();
                int i12 = this.currentImage;
                if (param == i12) {
                    imageReceiver.setImageX((i5 / 2) + measuredWidth + i9);
                    imageReceiver.setImageWidth(i6 - i5);
                    i = size;
                } else {
                    int i13 = this.nextImage;
                    int i14 = this.itemSpacing;
                    if (i13 >= i12) {
                        i = size;
                        if (param < i12) {
                            imageReceiver.setImageX(((i14 + i3) * (imageReceiver.getParam() - this.currentImage)) + measuredWidth + i9);
                        } else if (param <= i13) {
                            imageReceiver.setImageX(((i14 + i3) * ((imageReceiver.getParam() - this.currentImage) - 1)) + measuredWidth + i6 + i14 + i9);
                        } else {
                            imageReceiver.setImageX(i14 + i10 + ((i3 + i14) * ((imageReceiver.getParam() - this.currentImage) - 2)) + measuredWidth + i6 + i14 + i9);
                        }
                    } else if (param < i12) {
                        if (param <= i13) {
                            imageReceiver.setImageX(((((i3 + i14) * ((imageReceiver.getParam() - this.currentImage) + 1)) + measuredWidth) - (i14 + i10)) + i9);
                        } else {
                            imageReceiver.setImageX(((i14 + i3) * (imageReceiver.getParam() - this.currentImage)) + measuredWidth + i9);
                        }
                        i = size;
                    } else {
                        i = size;
                        imageReceiver.setImageX(((i14 + i3) * ((imageReceiver.getParam() - this.currentImage) - 1)) + measuredWidth + i6 + i14 + i9);
                    }
                    if (param == this.nextImage) {
                        imageReceiver.setImageWidth(i10 - i8);
                        imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i8 / 2)));
                    } else {
                        imageReceiver.setImageWidth(i3);
                    }
                }
                imageReceiver.setAlpha(this.drawAlpha);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                imageReceiver.draw(canvas);
                i11++;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = jCurrentTimeMillis;
            int i15 = this.animateToItem;
            if (i15 >= 0) {
                float f5 = this.moveLineProgress;
                if (f5 > 0.0f) {
                    float f6 = j;
                    float f7 = f5 - (f6 / (this.animateToItemFast ? 100.0f : 200.0f));
                    this.moveLineProgress = f7;
                    if (i15 == this.currentImage) {
                        float f8 = this.currentItemProgress;
                        if (f8 < 1.0f) {
                            float f9 = (f6 / 200.0f) + f8;
                            this.currentItemProgress = f9;
                            if (f9 > 1.0f) {
                                this.currentItemProgress = 1.0f;
                            }
                        }
                        int i16 = this.animateToDXStart;
                        this.drawDx = i16 + ((int) Math.ceil(this.currentItemProgress * (this.animateToDX - i16)));
                    } else {
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                        float interpolation = cubicBezierInterpolator.getInterpolation(1.0f - f7);
                        this.nextItemProgress = interpolation;
                        if (this.stopedScrolling) {
                            float f10 = this.currentItemProgress;
                            if (f10 > 0.0f) {
                                float f11 = f10 - (f6 / 200.0f);
                                this.currentItemProgress = f11;
                                if (f11 < 0.0f) {
                                    this.currentItemProgress = 0.0f;
                                }
                            }
                            int i17 = this.animateToDXStart;
                            this.drawDx = i17 + ((int) Math.ceil(interpolation * (this.animateToDX - i17)));
                        } else {
                            this.currentItemProgress = cubicBezierInterpolator.getInterpolation(this.moveLineProgress);
                            this.drawDx = (int) Math.ceil(this.nextItemProgress * this.animateToDX);
                        }
                    }
                    if (this.moveLineProgress <= 0.0f) {
                        this.currentImage = this.animateToItem;
                        this.moveLineProgress = 1.0f;
                        this.currentItemProgress = 1.0f;
                        this.nextItemProgress = 0.0f;
                        this.moving = false;
                        this.stopedScrolling = false;
                        this.drawDx = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                    }
                }
                fillImages(this.drawDx, true);
                invalidate();
            }
            if (this.scrolling) {
                float f12 = this.currentItemProgress;
                if (f12 > 0.0f) {
                    float f13 = f12 - (j / 200.0f);
                    this.currentItemProgress = f13;
                    if (f13 < 0.0f) {
                        this.currentItemProgress = 0.0f;
                    }
                    invalidate();
                }
            }
            android.widget.Scroller scroller = this.scroll;
            if (scroller.isFinished()) {
                return;
            }
            if (scroller.computeScrollOffset()) {
                this.drawDx = scroller.getCurrX();
                updateAfterScroll();
                invalidate();
            }
            if (scroller.isFinished()) {
                stopScrolling();
            }
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        android.widget.Scroller scroller = this.scroll;
        scroller.abortAnimation();
        if (this.currentPhotos.size() < 10) {
            return false;
        }
        scroller.fling(this.drawDx, 0, Math.round(f), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fillImages(0, false);
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) throws Throwable {
        this.drawDx = (int) (this.drawDx - f);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i = this.drawDx;
        if (i < minScrollX) {
            this.drawDx = minScrollX;
        } else if (i > maxScrollX) {
            this.drawDx = maxScrollX;
        }
        updateAfterScroll();
        return false;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) throws Throwable {
        PhotoViewer photoViewer = PhotoViewer.this;
        int i = photoViewer.currentIndex;
        ArrayList arrayList = photoViewer.imagesArrLocations;
        ArrayList arrayList2 = photoViewer.imagesArr;
        PhotoViewer.PageBlocksAdapter pageBlocksAdapter = photoViewer.pageBlocksAdapter;
        List all = pageBlocksAdapter != null ? pageBlocksAdapter.getAll() : null;
        stopScrolling();
        ArrayList arrayList3 = this.imagesToDraw;
        int size = arrayList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i2);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param >= 0) {
                    ArrayList arrayList4 = this.currentObjects;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int iIndexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i != iIndexOf) {
                                this.moveLineProgress = 1.0f;
                                this.animateAllLine = true;
                                ((PhotoViewer.AnonymousClass20) this.delegate).setCurrentIndex(iIndexOf);
                                return false;
                            }
                        } else if (all == null || all.isEmpty()) {
                            if (arrayList == null || arrayList.isEmpty()) {
                                break;
                                break;
                            }
                            int iIndexOf2 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i != iIndexOf2) {
                                this.moveLineProgress = 1.0f;
                                this.animateAllLine = true;
                                ((PhotoViewer.AnonymousClass20) this.delegate).setCurrentIndex(iIndexOf2);
                                return false;
                            }
                        } else {
                            int iIndexOf3 = all.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i != iIndexOf3) {
                                this.moveLineProgress = 1.0f;
                                this.animateAllLine = true;
                                ((PhotoViewer.AnonymousClass20) this.delegate).setCurrentIndex(iIndexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.currentPhotos.isEmpty() && getAlpha() == 1.0f) {
            z = this.gestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
            if (this.scrolling && motionEvent.getAction() == 1 && this.scroll.isFinished()) {
                stopScrolling();
            }
        }
        return z;
    }

    public final void reset() {
        this.hasPhotos = false;
        if (this.animationsEnabled) {
            this.drawAlpha = 0.0f;
        }
    }

    public void setAnimateBackground(boolean z) {
        this.animateBackground = z;
    }

    public void setAnimationsEnabled(boolean z) {
        if (this.animationsEnabled != z) {
            this.animationsEnabled = z;
            if (z) {
                return;
            }
            ValueAnimator valueAnimator = this.showAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.showAnimator = null;
            }
            ValueAnimator valueAnimator2 = this.hideAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.hideAnimator = null;
            }
            this.drawAlpha = 0.0f;
            invalidate();
        }
    }

    public void setDelegate(GroupedPhotosListViewDelegate groupedPhotosListViewDelegate) {
        this.delegate = groupedPhotosListViewDelegate;
    }

    public void setMoveProgress(float f) {
        if (this.scrolling || this.animateToItem >= 0) {
            return;
        }
        if (f > 0.0f) {
            this.nextImage = this.currentImage - 1;
        } else {
            this.nextImage = this.currentImage + 1;
        }
        int i = this.nextImage;
        ArrayList arrayList = this.currentPhotos;
        if (i < 0 || i >= arrayList.size()) {
            this.currentItemProgress = 1.0f;
        } else {
            this.currentItemProgress = 1.0f - Math.abs(f);
        }
        this.nextItemProgress = 1.0f - this.currentItemProgress;
        this.moving = f != 0.0f;
        invalidate();
        if (arrayList.isEmpty()) {
            return;
        }
        if (f >= 0.0f || this.currentImage != arrayList.size() - 1) {
            if (f <= 0.0f || this.currentImage != 0) {
                int i2 = (int) (f * (this.itemWidth + this.itemSpacing));
                this.drawDx = i2;
                fillImages(i2, true);
            }
        }
    }

    public final void stopScrolling() {
        this.scrolling = false;
        android.widget.Scroller scroller = this.scroll;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i = this.nextPhotoScrolling;
        if (i >= 0 && i < this.currentObjects.size()) {
            this.stopedScrolling = true;
            this.animateToItemFast = false;
            int i2 = this.nextPhotoScrolling;
            this.animateToItem = i2;
            this.nextImage = i2;
            this.animateToDX = (this.itemWidth + this.itemSpacing) * (this.currentImage - i2);
            this.animateToDXStart = this.drawDx;
            this.moveLineProgress = 1.0f;
            this.nextPhotoScrolling = -1;
            GroupedPhotosListViewDelegate groupedPhotosListViewDelegate = this.delegate;
            if (groupedPhotosListViewDelegate != null) {
                PhotoViewer photoViewer = PhotoViewer.this;
                if (PhotoViewer.shouldMessageObjectAutoPlayed(photoViewer.currentMessageObject)) {
                    photoViewer.playerAutoStarted = true;
                    photoViewer.onActionClick(true);
                    photoViewer.checkProgress(0, true);
                }
            }
        }
        invalidate();
    }

    public final void updateAfterScroll() throws Throwable {
        int i;
        int i2;
        int i3;
        int i4 = this.drawDx;
        int iAbs = Math.abs(i4);
        int i5 = this.itemWidth;
        int i6 = this.itemSpacing;
        int i7 = (i5 / 2) + i6;
        int iIndexOf = -1;
        if (iAbs > i7) {
            if (i4 > 0) {
                i2 = i4 - i7;
                i3 = 1;
            } else {
                i2 = i4 + i7;
                i3 = -1;
            }
            i = (i2 / ((i6 * 2) + i5)) + i3;
        } else {
            i = 0;
        }
        this.nextPhotoScrolling = this.currentImage - i;
        PhotoViewer photoViewer = PhotoViewer.this;
        int i8 = photoViewer.currentIndex;
        ArrayList arrayList = photoViewer.imagesArrLocations;
        ArrayList arrayList2 = photoViewer.imagesArr;
        PhotoViewer.PageBlocksAdapter pageBlocksAdapter = photoViewer.pageBlocksAdapter;
        List all = pageBlocksAdapter != null ? pageBlocksAdapter.getAll() : null;
        int i9 = this.nextPhotoScrolling;
        if (i8 != i9 && i9 >= 0 && i9 < this.currentPhotos.size()) {
            Object obj = this.currentObjects.get(this.nextPhotoScrolling);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                iIndexOf = arrayList2.indexOf((MessageObject) obj);
            } else if (all != null && !all.isEmpty()) {
                iIndexOf = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                iIndexOf = arrayList.indexOf((ImageLocation) obj);
            }
            if (iIndexOf >= 0) {
                this.ignoreChanges = true;
                ((PhotoViewer.AnonymousClass20) this.delegate).setCurrentIndex(iIndexOf);
            }
        }
        if (!this.scrolling) {
            this.scrolling = true;
            this.stopedScrolling = false;
        }
        fillImages(this.drawDx, true);
    }
}
