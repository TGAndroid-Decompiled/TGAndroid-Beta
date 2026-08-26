package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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

public class GroupedPhotosListView extends View implements GestureDetector.OnGestureListener {
    private boolean animateAllLine;
    private boolean animateBackground;
    private int animateToDX;
    private int animateToDXStart;
    private int animateToItem;
    private boolean animateToItemFast;
    private boolean animationsEnabled;
    private Paint backgroundPaint;
    private long currentGroupId;
    private int currentImage;
    private float currentItemProgress;
    private ArrayList<Object> currentObjects;
    public ArrayList<ImageLocation> currentPhotos;
    private GroupedPhotosListViewDelegate delegate;
    private float drawAlpha;
    private int drawDx;
    private GestureDetector gestureDetector;
    private boolean hasPhotos;
    private ValueAnimator hideAnimator;
    private boolean ignoreChanges;
    private ArrayList<ImageReceiver> imagesToDraw;
    private int itemHeight;
    private int itemSpacing;
    private int itemWidth;
    private int itemY;
    private long lastUpdateTime;
    private float moveLineProgress;
    private boolean moving;
    private int nextImage;
    private float nextItemProgress;
    private int nextPhotoScrolling;
    private android.widget.Scroller scroll;
    private boolean scrolling;
    private ValueAnimator showAnimator;
    private boolean stopedScrolling;
    private ArrayList<ImageReceiver> unusedReceivers;

    public interface GroupedPhotosListViewDelegate {
        boolean forceAll();

        long getAvatarsDialogId();

        int getCurrentAccount();

        int getCurrentIndex();

        ArrayList<MessageObject> getImagesArr();

        ArrayList<ImageLocation> getImagesArrLocations();

        List<TL_iv.PageBlock> getPageBlockArr();

        Object getParentObject();

        int getSlideshowMessageId();

        void onShowAnimationStart();

        void onStopScrolling();

        void setCurrentIndex(int i);

        boolean validGroupId(long j);
    }

    public GroupedPhotosListView(Context context) {
        this(context, AndroidUtilities.dp(3.0f));
    }

    private void fillImages(boolean z, int i) {
        int iMax;
        int iMin;
        Object parentObject;
        Object parentObject2;
        if (!z && !this.imagesToDraw.isEmpty()) {
            this.unusedReceivers.addAll(this.imagesToDraw);
            this.imagesToDraw.clear();
            this.moving = false;
            this.moveLineProgress = 1.0f;
            this.currentItemProgress = 1.0f;
            this.nextItemProgress = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() == 0 || this.currentPhotos.isEmpty()) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (this.itemWidth / 2);
        if (z) {
            int size = this.imagesToDraw.size();
            int i2 = 0;
            iMax = Integer.MIN_VALUE;
            iMin = Integer.MAX_VALUE;
            while (i2 < size) {
                ImageReceiver imageReceiver = this.imagesToDraw.get(i2);
                int param = imageReceiver.getParam();
                int i3 = param - this.currentImage;
                int i4 = this.itemWidth;
                int i5 = ((this.itemSpacing + i4) * i3) + measuredWidth2 + i;
                if (i5 > measuredWidth || i5 + i4 < 0) {
                    this.unusedReceivers.add(imageReceiver);
                    this.imagesToDraw.remove(i2);
                    size--;
                    i2--;
                }
                iMin = Math.min(iMin, param - 1);
                iMax = Math.max(iMax, param + 1);
                i2++;
            }
        } else {
            iMax = this.currentImage;
            iMin = iMax - 1;
        }
        if (iMax != Integer.MIN_VALUE) {
            int size2 = this.currentPhotos.size();
            while (iMax < size2) {
                int i6 = ((this.itemWidth + this.itemSpacing) * (iMax - this.currentImage)) + measuredWidth2 + i;
                if (i6 >= measuredWidth) {
                    break;
                }
                ImageLocation imageLocation = this.currentPhotos.get(iMax);
                ImageReceiver freeReceiver = getFreeReceiver();
                freeReceiver.setImageCoords(i6, this.itemY, this.itemWidth, this.itemHeight);
                if (this.currentObjects.get(0) instanceof MessageObject) {
                    parentObject2 = this.currentObjects.get(iMax);
                } else if (this.currentObjects.get(0) instanceof TL_iv.PageBlock) {
                    parentObject2 = this.delegate.getParentObject();
                } else {
                    parentObject2 = "avatar_" + this.delegate.getAvatarsDialogId();
                }
                freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, parentObject2, 1);
                freeReceiver.setParam(iMax);
                iMax++;
            }
        }
        if (iMin != Integer.MAX_VALUE) {
            while (iMin >= 0) {
                int i7 = iMin - this.currentImage;
                int i8 = this.itemWidth;
                int i9 = ((this.itemSpacing + i8) * i7) + measuredWidth2 + i + i8;
                if (i9 <= 0) {
                    break;
                }
                ImageLocation imageLocation2 = this.currentPhotos.get(iMin);
                ImageReceiver freeReceiver2 = getFreeReceiver();
                freeReceiver2.setImageCoords(i9, this.itemY, this.itemWidth, this.itemHeight);
                if (this.currentObjects.get(0) instanceof MessageObject) {
                    parentObject = this.currentObjects.get(iMin);
                } else if (this.currentObjects.get(0) instanceof TL_iv.PageBlock) {
                    parentObject = this.delegate.getParentObject();
                } else {
                    parentObject = "avatar_" + this.delegate.getAvatarsDialogId();
                }
                freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, parentObject, 1);
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

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        if (this.unusedReceivers.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            imageReceiver = this.unusedReceivers.get(0);
            this.unusedReceivers.remove(0);
        }
        this.imagesToDraw.add(imageReceiver);
        imageReceiver.setCurrentAccount(this.delegate.getCurrentAccount());
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.itemSpacing * 2) + this.itemWidth) * this.currentImage;
    }

    private int getMinScrollX() {
        return ((this.itemSpacing * 2) + this.itemWidth) * (-((this.currentPhotos.size() - this.currentImage) - 1));
    }

    public void lambda$fillList$0(ValueAnimator valueAnimator) {
        this.drawAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void lambda$fillList$1(ValueAnimator valueAnimator) {
        this.drawAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private void stopScrolling() {
        this.scrolling = false;
        if (!this.scroll.isFinished()) {
            this.scroll.abortAnimation();
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
                groupedPhotosListViewDelegate.onStopScrolling();
            }
        }
        invalidate();
    }

    private void updateAfterScroll() {
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
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList<ImageLocation> imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList<MessageObject> imagesArr = this.delegate.getImagesArr();
        List<TL_iv.PageBlock> pageBlockArr = this.delegate.getPageBlockArr();
        int i8 = this.nextPhotoScrolling;
        if (currentIndex != i8 && i8 >= 0 && i8 < this.currentPhotos.size()) {
            Object obj = this.currentObjects.get(this.nextPhotoScrolling);
            if (imagesArr != null && !imagesArr.isEmpty()) {
                iIndexOf = imagesArr.indexOf((MessageObject) obj);
            } else if (pageBlockArr != null && !pageBlockArr.isEmpty()) {
                iIndexOf = pageBlockArr.indexOf((TL_iv.PageBlock) obj);
            } else if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
                iIndexOf = imagesArrLocations.indexOf((ImageLocation) obj);
            }
            if (iIndexOf >= 0) {
                this.ignoreChanges = true;
                this.delegate.setCurrentIndex(iIndexOf);
            }
        }
        if (!this.scrolling) {
            this.scrolling = true;
            this.stopedScrolling = false;
        }
        fillImages(true, this.drawDx);
    }

    public void clear() {
        this.currentPhotos.clear();
        this.currentObjects.clear();
        this.imagesToDraw.clear();
    }

    public void fillList() {
        final int i;
        long j;
        boolean z;
        TL_iv.PageBlock pageBlock;
        int size;
        TL_iv.PageBlock pageBlock2;
        int i2;
        TL_iv.PageBlock pageBlock3;
        boolean z2;
        Object obj;
        boolean z3;
        int size2;
        int size3;
        int i3;
        int i4;
        TL_iv.PageBlock pageBlock4;
        TL_iv.PageBlock pageBlock5;
        ValueAnimator valueAnimator;
        float f;
        ValueAnimator valueAnimator2;
        Object obj2;
        if (this.ignoreChanges) {
            this.ignoreChanges = false;
            return;
        }
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList<ImageLocation> imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList<MessageObject> imagesArr = this.delegate.getImagesArr();
        List<TL_iv.PageBlock> pageBlockArr = this.delegate.getPageBlockArr();
        int slideshowMessageId = this.delegate.getSlideshowMessageId();
        this.delegate.getCurrentAccount();
        this.hasPhotos = false;
        if (imagesArrLocations == null || imagesArrLocations.isEmpty()) {
            if (imagesArr == null || imagesArr.isEmpty()) {
                imagesArrLocations = imagesArrLocations;
                i = 0;
                j = 0;
                if (pageBlockArr == null || pageBlockArr.isEmpty()) {
                    currentIndex = currentIndex;
                    z = false;
                    pageBlock = null;
                } else {
                    TL_iv.PageBlock pageBlock6 = pageBlockArr.get(currentIndex);
                    long j2 = pageBlock6.groupId;
                    if (j2 != this.currentGroupId) {
                        this.currentGroupId = j2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.currentGroupId != 0) {
                        this.hasPhotos = true;
                        int size4 = pageBlockArr.size();
                        int i5 = currentIndex;
                        int i6 = 0;
                        while (true) {
                            if (i5 >= size4) {
                                pageBlock2 = pageBlock6;
                                i2 = currentIndex;
                                pageBlock3 = pageBlock2;
                                break;
                            }
                            i2 = currentIndex;
                            pageBlock3 = pageBlock2;
                            if (pageBlockArr.get(i5).groupId != this.currentGroupId) {
                                pageBlock2 = pageBlock6;
                                break;
                            }
                            pageBlock2 = pageBlock6;
                            i6++;
                            i5++;
                            pageBlock2 = pageBlock3;
                            currentIndex = i2;
                        }
                        int i7 = i2 - 1;
                        while (true) {
                            if (i7 < 0) {
                                z2 = z;
                                break;
                            }
                            z2 = z;
                            if (pageBlockArr.get(i7).groupId != this.currentGroupId) {
                                break;
                            }
                            i6++;
                            i7--;
                            z = z2;
                        }
                        z = z2;
                        obj = pageBlock3;
                        currentIndex = i2;
                        size = i6;
                    } else {
                        pageBlock = pageBlock6;
                    }
                }
                size = 0;
                obj = pageBlock;
            } else {
                if (currentIndex >= imagesArr.size()) {
                    currentIndex = imagesArr.size() - 1;
                }
                MessageObject messageObject = imagesArr.get(currentIndex);
                long groupIdForUse = messageObject.getGroupIdForUse();
                j = 0;
                if (groupIdForUse != this.currentGroupId) {
                    this.currentGroupId = groupIdForUse;
                    z = true;
                } else {
                    z = false;
                }
                boolean z4 = imagesArr.size() > 1 && this.delegate.forceAll();
                if (this.currentGroupId != 0 || z4) {
                    this.hasPhotos = true;
                    int iMin = Math.min(currentIndex + 10, imagesArr.size());
                    int i8 = 0;
                    for (int i9 = currentIndex; i9 < iMin; i9++) {
                        MessageObject messageObject2 = imagesArr.get(i9);
                        if (slideshowMessageId == 0 && !z4) {
                            if (messageObject2.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                        }
                        i8++;
                    }
                    int iMax = Math.max(currentIndex - 10, 0);
                    int i10 = currentIndex - 1;
                    size = i8;
                    while (true) {
                        if (i10 < iMax) {
                            imagesArrLocations = imagesArrLocations;
                            i = 0;
                            break;
                        }
                        MessageObject messageObject3 = imagesArr.get(i10);
                        if (slideshowMessageId == 0 && !z4) {
                            long groupIdForUse2 = messageObject3.getGroupIdForUse();
                            imagesArrLocations = imagesArrLocations;
                            i = 0;
                            if (groupIdForUse2 != this.currentGroupId) {
                                break;
                            }
                        } else {
                            imagesArrLocations = imagesArrLocations;
                        }
                        size++;
                        i10--;
                        imagesArrLocations = imagesArrLocations;
                    }
                    obj = messageObject;
                } else {
                    size = 0;
                    i = 0;
                    obj2 = messageObject;
                }
            }
            if (obj == null) {
                return;
            }
            if (this.animationsEnabled) {
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
                        this.showAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (GroupedPhotosListView.this.showAnimator == animator) {
                                    GroupedPhotosListView.this.showAnimator = null;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                if (GroupedPhotosListView.this.delegate != null) {
                                    GroupedPhotosListView.this.delegate.onShowAnimationStart();
                                }
                            }
                        });
                        final int i11 = 1;
                        this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final GroupedPhotosListView f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i11) {
                                    case 0:
                                        this.f$0.lambda$fillList$0(valueAnimator3);
                                        break;
                                    default:
                                        this.f$0.lambda$fillList$1(valueAnimator3);
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
                    if (this.drawAlpha > 0.0f && this.currentPhotos.size() > 1) {
                        if (this.hideAnimator == null) {
                            float[] fArr = new float[2];
                            fArr[i] = this.drawAlpha;
                            fArr[1] = 0.0f;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr);
                            this.hideAnimator = valueAnimatorOfFloat2;
                            valueAnimatorOfFloat2.setDuration((long) (this.drawAlpha * 200.0f));
                            this.hideAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (GroupedPhotosListView.this.hideAnimator == animator) {
                                        GroupedPhotosListView.this.hideAnimator = null;
                                        GroupedPhotosListView.this.fillList();
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
                                            this.f$0.lambda$fillList$0(valueAnimator3);
                                            break;
                                        default:
                                            this.f$0.lambda$fillList$1(valueAnimator3);
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
            if (z) {
                z3 = false;
            } else if (size == this.currentPhotos.size() || !this.currentObjects.contains(obj)) {
                z3 = false;
                z = true;
            } else {
                int iIndexOf = this.currentObjects.indexOf(obj);
                int i12 = this.currentImage;
                if (i12 == iIndexOf || iIndexOf == -1) {
                    z3 = false;
                } else {
                    boolean z5 = this.animateAllLine;
                    if (!z5 && !this.moving && (iIndexOf == i12 - 1 || iIndexOf == i12 + 1)) {
                        this.animateToItemFast = true;
                        z5 = true;
                    }
                    if (z5) {
                        this.animateToItem = iIndexOf;
                        this.nextImage = iIndexOf;
                        this.animateToDX = (this.itemWidth + this.itemSpacing) * (i12 - iIndexOf);
                        this.moving = true;
                        this.animateAllLine = false;
                        this.lastUpdateTime = System.currentTimeMillis();
                        invalidate();
                        z3 = false;
                    } else {
                        fillImages(true, (this.itemWidth + this.itemSpacing) * (i12 - iIndexOf));
                        this.currentImage = iIndexOf;
                        z3 = false;
                        this.moving = false;
                    }
                    this.drawDx = z3 ? 1 : 0;
                }
            }
            if (z) {
                size2 = this.currentPhotos.size();
                this.animateAllLine = z3;
                this.currentPhotos.clear();
                this.currentObjects.clear();
                if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
                    ArrayList<ImageLocation> arrayList = imagesArrLocations;
                    this.currentObjects.addAll(arrayList);
                    this.currentPhotos.addAll(arrayList);
                    this.currentImage = currentIndex;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                } else if (imagesArr == null && !imagesArr.isEmpty()) {
                    boolean z6 = this.delegate.forceAll() && imagesArr.size() > 1;
                    if (this.currentGroupId != j || z6 || slideshowMessageId != 0) {
                        int iMin2 = Math.min(currentIndex + 10, imagesArr.size());
                        for (int i13 = currentIndex; i13 < iMin2; i13++) {
                            MessageObject messageObject4 = imagesArr.get(i13);
                            if (slideshowMessageId == 0 && !z6 && messageObject4.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                            this.currentObjects.add(messageObject4);
                            this.currentPhotos.add(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, 56, true), messageObject4.photoThumbsObject));
                        }
                        this.currentImage = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                        int iMax2 = Math.max(currentIndex - 10, 0);
                        for (int i14 = currentIndex - 1; i14 >= iMax2; i14--) {
                            MessageObject messageObject5 = imagesArr.get(i14);
                            if (slideshowMessageId == 0 && !z6 && messageObject5.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                            this.currentObjects.add(0, messageObject5);
                            this.currentPhotos.add(0, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, 56, true), messageObject5.photoThumbsObject));
                            this.currentImage++;
                        }
                    }
                } else if (pageBlockArr != null && !pageBlockArr.isEmpty() && this.currentGroupId != j) {
                    size3 = pageBlockArr.size();
                    for (i3 = currentIndex; i3 < size3; i3++) {
                        pageBlock5 = pageBlockArr.get(i3);
                        if (pageBlock5.groupId != this.currentGroupId) {
                            break;
                        }
                        this.currentObjects.add(pageBlock5);
                        this.currentPhotos.add(ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                    }
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    for (i4 = currentIndex - 1; i4 >= 0; i4--) {
                        pageBlock4 = pageBlockArr.get(i4);
                        if (pageBlock4.groupId != this.currentGroupId) {
                            break;
                        }
                        this.currentObjects.add(0, pageBlock4);
                        this.currentPhotos.add(0, ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                        this.currentImage++;
                    }
                }
                if (this.currentPhotos.size() == 1) {
                    this.currentPhotos.clear();
                    this.currentObjects.clear();
                }
                if (this.currentPhotos.size() != size2) {
                    requestLayout();
                }
                fillImages(false, 0);
            }
        }
        if (currentIndex >= imagesArrLocations.size()) {
            currentIndex = imagesArrLocations.size() - 1;
        }
        ImageLocation imageLocation = imagesArrLocations.get(currentIndex);
        size = imagesArrLocations.size();
        this.hasPhotos = true;
        z = false;
        i = 0;
        j = 0;
        obj2 = imageLocation;
        obj = obj2;
        if (obj == null) {
            return;
        }
        if (this.animationsEnabled) {
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
                        this.hideAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (GroupedPhotosListView.this.hideAnimator == animator) {
                                    GroupedPhotosListView.this.hideAnimator = null;
                                    GroupedPhotosListView.this.fillList();
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
                                        this.f$0.lambda$fillList$0(valueAnimator3);
                                        break;
                                    default:
                                        this.f$0.lambda$fillList$1(valueAnimator3);
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
                    this.showAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (GroupedPhotosListView.this.showAnimator == animator) {
                                GroupedPhotosListView.this.showAnimator = null;
                            }
                        }

                        @Override
                        public void onAnimationStart(Animator animator) {
                            if (GroupedPhotosListView.this.delegate != null) {
                                GroupedPhotosListView.this.delegate.onShowAnimationStart();
                            }
                        }
                    });
                    final int i15 = 1;
                    this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final GroupedPhotosListView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            switch (i15) {
                                case 0:
                                    this.f$0.lambda$fillList$0(valueAnimator3);
                                    break;
                                default:
                                    this.f$0.lambda$fillList$1(valueAnimator3);
                                    break;
                            }
                        }
                    });
                }
            }
        }
        if (z) {
            z3 = false;
        } else if (size == this.currentPhotos.size()) {
            z3 = false;
            z = true;
        } else {
            z3 = false;
            z = true;
        }
        if (z) {
            size2 = this.currentPhotos.size();
            this.animateAllLine = z3;
            this.currentPhotos.clear();
            this.currentObjects.clear();
            if (imagesArrLocations != null) {
                if (imagesArr == null) {
                    if (pageBlockArr != null) {
                        size3 = pageBlockArr.size();
                        while (i3 < size3) {
                            pageBlock5 = pageBlockArr.get(i3);
                            if (pageBlock5.groupId != this.currentGroupId) {
                                break;
                                break;
                            } else {
                                this.currentObjects.add(pageBlock5);
                                this.currentPhotos.add(ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                            }
                        }
                        this.currentImage = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                        while (i4 >= 0) {
                            pageBlock4 = pageBlockArr.get(i4);
                            if (pageBlock4.groupId != this.currentGroupId) {
                                break;
                                break;
                            }
                            this.currentObjects.add(0, pageBlock4);
                            this.currentPhotos.add(0, ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                            this.currentImage++;
                        }
                    }
                } else if (pageBlockArr != null) {
                    size3 = pageBlockArr.size();
                    while (i3 < size3) {
                        pageBlock5 = pageBlockArr.get(i3);
                        if (pageBlock5.groupId != this.currentGroupId) {
                            break;
                            break;
                        } else {
                            this.currentObjects.add(pageBlock5);
                            this.currentPhotos.add(ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                        }
                    }
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    while (i4 >= 0) {
                        pageBlock4 = pageBlockArr.get(i4);
                        if (pageBlock4.groupId != this.currentGroupId) {
                            break;
                            break;
                        }
                        this.currentObjects.add(0, pageBlock4);
                        this.currentPhotos.add(0, ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                        this.currentImage++;
                    }
                }
            } else if (imagesArr == null) {
                if (pageBlockArr != null) {
                    size3 = pageBlockArr.size();
                    while (i3 < size3) {
                        pageBlock5 = pageBlockArr.get(i3);
                        if (pageBlock5.groupId != this.currentGroupId) {
                            break;
                            break;
                        } else {
                            this.currentObjects.add(pageBlock5);
                            this.currentPhotos.add(ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                        }
                    }
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    while (i4 >= 0) {
                        pageBlock4 = pageBlockArr.get(i4);
                        if (pageBlock4.groupId != this.currentGroupId) {
                            break;
                            break;
                        }
                        this.currentObjects.add(0, pageBlock4);
                        this.currentPhotos.add(0, ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                        this.currentImage++;
                    }
                }
            } else if (pageBlockArr != null) {
                size3 = pageBlockArr.size();
                while (i3 < size3) {
                    pageBlock5 = pageBlockArr.get(i3);
                    if (pageBlock5.groupId != this.currentGroupId) {
                        break;
                        break;
                    } else {
                        this.currentObjects.add(pageBlock5);
                        this.currentPhotos.add(ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                    }
                }
                this.currentImage = 0;
                this.animateToItem = -1;
                this.animateToItemFast = false;
                while (i4 >= 0) {
                    pageBlock4 = pageBlockArr.get(i4);
                    if (pageBlock4.groupId != this.currentGroupId) {
                        break;
                        break;
                    }
                    this.currentObjects.add(0, pageBlock4);
                    this.currentPhotos.add(0, ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                    this.currentImage++;
                }
            }
            if (this.currentPhotos.size() == 1) {
                this.currentPhotos.clear();
                this.currentObjects.clear();
            }
            if (this.currentPhotos.size() != size2) {
                requestLayout();
            }
            fillImages(false, 0);
        }
    }

    public int getCount() {
        return this.currentPhotos.size();
    }

    public int getIndex() {
        return this.currentImage;
    }

    public boolean hasPhotos() {
        if (!this.hasPhotos || this.hideAnimator != null) {
            return false;
        }
        if (this.drawAlpha > 0.0f || !this.animateBackground) {
            return true;
        }
        ValueAnimator valueAnimator = this.showAnimator;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public boolean isAnimationsEnabled() {
        return this.animationsEnabled;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        if (!this.scroll.isFinished()) {
            this.scroll.abortAnimation();
        }
        this.animateToItem = -1;
        this.animateToItemFast = false;
        return true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int iMax;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        if (this.hasPhotos || !this.imagesToDraw.isEmpty()) {
            float f = this.drawAlpha;
            if (!this.animateBackground) {
                f = this.hasPhotos ? 1.0f : 0.0f;
            }
            this.backgroundPaint.setAlpha((int) (f * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
            if (this.imagesToDraw.isEmpty()) {
                return;
            }
            int size = this.imagesToDraw.size();
            int i = this.drawDx;
            int i2 = (int) (this.itemWidth * 2.0f);
            int iDp = AndroidUtilities.dp(8.0f);
            ImageLocation imageLocation = this.currentPhotos.get(this.currentImage);
            int iMin = Math.min(i2, (imageLocation == null || (photoSize2 = imageLocation.photoSize) == null) ? this.itemHeight : Math.max(this.itemWidth, (int) ((this.itemHeight / photoSize2.h) * photoSize2.w)));
            float f2 = iDp * 2;
            float f3 = this.currentItemProgress;
            int i3 = (int) (f2 * f3);
            int i4 = this.itemWidth;
            int i5 = i4 + ((int) ((iMin - i4) * f3)) + i3;
            int i6 = this.nextImage;
            if (i6 < 0 || i6 >= this.currentPhotos.size()) {
                iMax = this.itemWidth;
            } else {
                ImageLocation imageLocation2 = this.currentPhotos.get(this.nextImage);
                iMax = (imageLocation2 == null || (photoSize = imageLocation2.photoSize) == null) ? this.itemHeight : Math.max(this.itemWidth, (int) ((this.itemHeight / photoSize.h) * photoSize.w));
            }
            int iMin2 = Math.min(i2, iMax);
            float f4 = this.nextItemProgress;
            int i7 = (int) (f2 * f4);
            float f5 = i;
            int i8 = this.itemWidth;
            int i9 = (int) (((((iMin2 + i7) - i8) / 2) * f4 * (this.nextImage > this.currentImage ? -1 : 1)) + f5);
            int i10 = i8 + ((int) ((iMin2 - i8) * f4)) + i7;
            int measuredWidth = (getMeasuredWidth() - i5) / 2;
            for (int i11 = 0; i11 < size; i11++) {
                ImageReceiver imageReceiver = this.imagesToDraw.get(i11);
                int param = imageReceiver.getParam();
                int i12 = this.currentImage;
                if (param == i12) {
                    imageReceiver.setImageX((i3 / 2) + measuredWidth + i9);
                    imageReceiver.setImageWidth(i5 - i3);
                } else {
                    int i13 = this.nextImage;
                    if (i13 < i12) {
                        if (param >= i12) {
                            imageReceiver.setImageX(((this.itemWidth + this.itemSpacing) * ((imageReceiver.getParam() - this.currentImage) - 1)) + measuredWidth + i5 + this.itemSpacing + i9);
                        } else if (param <= i13) {
                            int param2 = (imageReceiver.getParam() - this.currentImage) + 1;
                            int i14 = this.itemWidth;
                            int i15 = this.itemSpacing;
                            imageReceiver.setImageX(((((i14 + i15) * param2) + measuredWidth) - (i15 + i10)) + i9);
                        } else {
                            imageReceiver.setImageX(((this.itemWidth + this.itemSpacing) * (imageReceiver.getParam() - this.currentImage)) + measuredWidth + i9);
                        }
                    } else if (param < i12) {
                        imageReceiver.setImageX(((this.itemWidth + this.itemSpacing) * (imageReceiver.getParam() - this.currentImage)) + measuredWidth + i9);
                    } else if (param <= i13) {
                        imageReceiver.setImageX(((this.itemWidth + this.itemSpacing) * ((imageReceiver.getParam() - this.currentImage) - 1)) + measuredWidth + i5 + this.itemSpacing + i9);
                    } else {
                        int i16 = measuredWidth + i5 + this.itemSpacing;
                        int param3 = (imageReceiver.getParam() - this.currentImage) - 2;
                        int i17 = this.itemWidth;
                        int i18 = this.itemSpacing;
                        imageReceiver.setImageX(i18 + i10 + ((i17 + i18) * param3) + i16 + i9);
                    }
                    if (param == this.nextImage) {
                        imageReceiver.setImageWidth(i10 - i7);
                        imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i7 / 2)));
                    } else {
                        imageReceiver.setImageWidth(this.itemWidth);
                    }
                }
                imageReceiver.setAlpha(this.drawAlpha);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                imageReceiver.draw(canvas);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = jCurrentTimeMillis;
            int i19 = this.animateToItem;
            if (i19 >= 0) {
                float f6 = this.moveLineProgress;
                if (f6 > 0.0f) {
                    float f7 = j;
                    float f8 = f6 - (f7 / (this.animateToItemFast ? 100.0f : 200.0f));
                    this.moveLineProgress = f8;
                    if (i19 == this.currentImage) {
                        float f9 = this.currentItemProgress;
                        if (f9 < 1.0f) {
                            float f10 = (f7 / 200.0f) + f9;
                            this.currentItemProgress = f10;
                            if (f10 > 1.0f) {
                                this.currentItemProgress = 1.0f;
                            }
                        }
                        int i20 = this.animateToDXStart;
                        this.drawDx = i20 + ((int) Math.ceil(this.currentItemProgress * (this.animateToDX - i20)));
                    } else {
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                        float interpolation = cubicBezierInterpolator.getInterpolation(1.0f - f8);
                        this.nextItemProgress = interpolation;
                        if (this.stopedScrolling) {
                            float f11 = this.currentItemProgress;
                            if (f11 > 0.0f) {
                                float f12 = f11 - (f7 / 200.0f);
                                this.currentItemProgress = f12;
                                if (f12 < 0.0f) {
                                    this.currentItemProgress = 0.0f;
                                }
                            }
                            int i21 = this.animateToDXStart;
                            this.drawDx = i21 + ((int) Math.ceil(interpolation * (this.animateToDX - i21)));
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
                fillImages(true, this.drawDx);
                invalidate();
            }
            if (this.scrolling) {
                float f13 = this.currentItemProgress;
                if (f13 > 0.0f) {
                    float f14 = f13 - (j / 200.0f);
                    this.currentItemProgress = f14;
                    if (f14 < 0.0f) {
                        this.currentItemProgress = 0.0f;
                    }
                    invalidate();
                }
            }
            if (this.scroll.isFinished()) {
                return;
            }
            if (this.scroll.computeScrollOffset()) {
                this.drawDx = this.scroll.getCurrX();
                updateAfterScroll();
                invalidate();
            }
            if (this.scroll.isFinished()) {
                stopScrolling();
            }
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.scroll.abortAnimation();
        if (this.currentPhotos.size() < 10) {
            return false;
        }
        this.scroll.fling(this.drawDx, 0, Math.round(f), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fillImages(false, 0);
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList<ImageLocation> imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList<MessageObject> imagesArr = this.delegate.getImagesArr();
        List<TL_iv.PageBlock> pageBlockArr = this.delegate.getPageBlockArr();
        stopScrolling();
        int size = this.imagesToDraw.size();
        for (int i = 0; i < size; i++) {
            ImageReceiver imageReceiver = this.imagesToDraw.get(i);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param >= 0 && param < this.currentObjects.size()) {
                    if (imagesArr != null && !imagesArr.isEmpty()) {
                        int iIndexOf = imagesArr.indexOf((MessageObject) this.currentObjects.get(param));
                        if (currentIndex != iIndexOf) {
                            this.moveLineProgress = 1.0f;
                            this.animateAllLine = true;
                            this.delegate.setCurrentIndex(iIndexOf);
                            break;
                        }
                        return true;
                    }
                    if (pageBlockArr != null && !pageBlockArr.isEmpty()) {
                        int iIndexOf2 = pageBlockArr.indexOf((TL_iv.PageBlock) this.currentObjects.get(param));
                        if (currentIndex != iIndexOf2) {
                            this.moveLineProgress = 1.0f;
                            this.animateAllLine = true;
                            this.delegate.setCurrentIndex(iIndexOf2);
                            break;
                        }
                        return true;
                    }
                    if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
                        int iIndexOf3 = imagesArrLocations.indexOf((ImageLocation) this.currentObjects.get(param));
                        if (currentIndex != iIndexOf3) {
                            this.moveLineProgress = 1.0f;
                            this.animateAllLine = true;
                            this.delegate.setCurrentIndex(iIndexOf3);
                            break;
                        }
                        return true;
                    }
                    break;
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.currentPhotos.isEmpty() && getAlpha() == 1.0f) {
            z = this.gestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
            if (this.scrolling && motionEvent.getAction() == 1 && this.scroll.isFinished()) {
                stopScrolling();
            }
        }
        return z;
    }

    public void reset() {
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
        if (i < 0 || i >= this.currentPhotos.size()) {
            this.currentItemProgress = 1.0f;
        } else {
            this.currentItemProgress = 1.0f - Math.abs(f);
        }
        this.nextItemProgress = 1.0f - this.currentItemProgress;
        this.moving = f != 0.0f;
        invalidate();
        if (this.currentPhotos.isEmpty()) {
            return;
        }
        if (f >= 0.0f || this.currentImage != this.currentPhotos.size() - 1) {
            if (f <= 0.0f || this.currentImage != 0) {
                int i2 = (int) (f * (this.itemWidth + this.itemSpacing));
                this.drawDx = i2;
                fillImages(true, i2);
            }
        }
    }

    public GroupedPhotosListView(Context context, int i) {
        super(context);
        this.backgroundPaint = new Paint();
        this.unusedReceivers = new ArrayList<>();
        this.imagesToDraw = new ArrayList<>();
        this.currentPhotos = new ArrayList<>();
        this.currentObjects = new ArrayList<>();
        this.currentItemProgress = 1.0f;
        this.nextItemProgress = 0.0f;
        this.animateToItem = -1;
        this.animationsEnabled = true;
        this.nextPhotoScrolling = -1;
        this.animateBackground = true;
        this.gestureDetector = new GestureDetector(context, this);
        this.scroll = new android.widget.Scroller(context);
        this.itemWidth = AndroidUtilities.dp(42.0f);
        this.itemHeight = AndroidUtilities.dp(56.0f);
        this.itemSpacing = AndroidUtilities.dp(1.0f);
        this.itemY = i;
        this.backgroundPaint.setColor(2130706432);
    }
}
