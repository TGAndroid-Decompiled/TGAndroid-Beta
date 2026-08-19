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
    private ArrayList currentObjects;
    public ArrayList currentPhotos;
    private GroupedPhotosListViewDelegate delegate;
    private float drawAlpha;
    private int drawDx;
    private GestureDetector gestureDetector;
    private boolean hasPhotos;
    private ValueAnimator hideAnimator;
    private boolean ignoreChanges;
    private ArrayList imagesToDraw;
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
    private ArrayList unusedReceivers;

    public interface GroupedPhotosListViewDelegate {
        boolean forceAll();

        long getAvatarsDialogId();

        int getCurrentAccount();

        int getCurrentIndex();

        ArrayList getImagesArr();

        ArrayList getImagesArrLocations();

        List getPageBlockArr();

        Object getParentObject();

        int getSlideshowMessageId();

        void onShowAnimationStart();

        void onStopScrolling();

        void setCurrentIndex(int i);
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    public GroupedPhotosListView(Context context, int i) {
        super(context);
        this.backgroundPaint = new Paint();
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
        this.gestureDetector = new GestureDetector(context, this);
        this.scroll = new android.widget.Scroller(context);
        this.itemWidth = AndroidUtilities.dp(42.0f);
        this.itemHeight = AndroidUtilities.dp(56.0f);
        this.itemSpacing = AndroidUtilities.dp(1.0f);
        this.itemY = i;
        this.backgroundPaint.setColor(2130706432);
    }

    public void clear() {
        this.currentPhotos.clear();
        this.currentObjects.clear();
        this.imagesToDraw.clear();
    }

    public void fillList() {
        ?? r15;
        long j;
        boolean z;
        TL_iv.PageBlock pageBlock;
        int size;
        TL_iv.PageBlock pageBlock2;
        int i;
        TL_iv.PageBlock pageBlock3;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        int size2;
        int size3;
        int i2;
        int i3;
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
        ArrayList imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList imagesArr = this.delegate.getImagesArr();
        List pageBlockArr = this.delegate.getPageBlockArr();
        int slideshowMessageId = this.delegate.getSlideshowMessageId();
        this.delegate.getCurrentAccount();
        this.hasPhotos = false;
        if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
            if (currentIndex >= imagesArrLocations.size()) {
                currentIndex = imagesArrLocations.size() - 1;
            }
            ImageLocation imageLocation = (ImageLocation) imagesArrLocations.get(currentIndex);
            size = imagesArrLocations.size();
            this.hasPhotos = true;
            z = false;
            z4 = false;
            j = 0;
            obj2 = imageLocation;
        } else {
            if (imagesArr != null && !imagesArr.isEmpty()) {
                if (currentIndex >= imagesArr.size()) {
                    currentIndex = imagesArr.size() - 1;
                }
                MessageObject messageObject = (MessageObject) imagesArr.get(currentIndex);
                long groupIdForUse = messageObject.getGroupIdForUse();
                j = 0;
                if (groupIdForUse != this.currentGroupId) {
                    this.currentGroupId = groupIdForUse;
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = imagesArr.size() > 1 && this.delegate.forceAll();
                if (this.currentGroupId != 0 || z5) {
                    this.hasPhotos = true;
                    int iMin = Math.min(currentIndex + 10, imagesArr.size());
                    int i4 = 0;
                    for (int i5 = currentIndex; i5 < iMin; i5++) {
                        MessageObject messageObject2 = (MessageObject) imagesArr.get(i5);
                        if (slideshowMessageId == 0 && !z5) {
                            if (messageObject2.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                        }
                        i4++;
                    }
                    int iMax = Math.max(currentIndex - 10, 0);
                    int i6 = currentIndex - 1;
                    size = i4;
                    while (true) {
                        if (i6 < iMax) {
                            imagesArrLocations = imagesArrLocations;
                            z3 = false;
                            break;
                        }
                        MessageObject messageObject3 = (MessageObject) imagesArr.get(i6);
                        if (slideshowMessageId == 0 && !z5) {
                            long groupIdForUse2 = messageObject3.getGroupIdForUse();
                            imagesArrLocations = imagesArrLocations;
                            z3 = false;
                            if (groupIdForUse2 != this.currentGroupId) {
                                break;
                            }
                        } else {
                            imagesArrLocations = imagesArrLocations;
                        }
                        size++;
                        i6--;
                        imagesArrLocations = imagesArrLocations;
                    }
                    obj = messageObject;
                    r15 = z3;
                } else {
                    size = 0;
                    z4 = false;
                    obj2 = messageObject;
                }
            } else {
                imagesArrLocations = imagesArrLocations;
                r15 = 0;
                r15 = 0;
                j = 0;
                if (pageBlockArr == null || pageBlockArr.isEmpty()) {
                    currentIndex = currentIndex;
                    z = false;
                    pageBlock = null;
                } else {
                    TL_iv.PageBlock pageBlock6 = (TL_iv.PageBlock) pageBlockArr.get(currentIndex);
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
                        int i7 = currentIndex;
                        int i8 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                pageBlock2 = pageBlock6;
                                i = currentIndex;
                                pageBlock3 = pageBlock2;
                                break;
                            }
                            i = currentIndex;
                            pageBlock3 = pageBlock2;
                            if (((TL_iv.PageBlock) pageBlockArr.get(i7)).groupId != this.currentGroupId) {
                                pageBlock2 = pageBlock6;
                                break;
                            }
                            pageBlock2 = pageBlock6;
                            i8++;
                            i7++;
                            pageBlock2 = pageBlock3;
                            currentIndex = i;
                        }
                        int i9 = i - 1;
                        while (true) {
                            if (i9 < 0) {
                                z2 = z;
                                break;
                            }
                            z2 = z;
                            if (((TL_iv.PageBlock) pageBlockArr.get(i9)).groupId != this.currentGroupId) {
                                break;
                            }
                            i8++;
                            i9--;
                            z = z2;
                        }
                        z = z2;
                        obj = pageBlock3;
                        currentIndex = i;
                        size = i8;
                    } else {
                        pageBlock = pageBlock6;
                    }
                }
                size = 0;
                obj = pageBlock;
            }
            if (obj == null) {
                return;
            }
            if (this.animationsEnabled) {
                if (!this.hasPhotos) {
                    valueAnimator2 = this.showAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        this.showAnimator = null;
                    }
                    if (this.drawAlpha > 0.0f && this.currentPhotos.size() > 1) {
                        if (this.hideAnimator == null) {
                            float[] fArr = new float[2];
                            fArr[r15] = this.drawAlpha;
                            fArr[1] = 0.0f;
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                            this.hideAnimator = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.setDuration((long) (this.drawAlpha * 200.0f));
                            this.hideAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (GroupedPhotosListView.this.hideAnimator == animator) {
                                        GroupedPhotosListView.this.hideAnimator = null;
                                        GroupedPhotosListView.this.fillList();
                                    }
                                }
                            });
                            this.hideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                    GroupedPhotosListView.$r8$lambda$KepaK_8oXCcSf_cbb0QgwVgL6ns(this.f$0, valueAnimator3);
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
                    if (f < 1.0f && this.showAnimator == null) {
                        float[] fArr2 = new float[2];
                        fArr2[r15] = f;
                        fArr2[1] = 1.0f;
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
                        this.showAnimator = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.setDuration((long) ((1.0f - this.drawAlpha) * 200.0f));
                        this.showAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animator) {
                                if (GroupedPhotosListView.this.delegate != null) {
                                    GroupedPhotosListView.this.delegate.onShowAnimationStart();
                                }
                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (GroupedPhotosListView.this.showAnimator == animator) {
                                    GroupedPhotosListView.this.showAnimator = null;
                                }
                            }
                        });
                        this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                GroupedPhotosListView.$r8$lambda$OIrEb7L_MZwr_NKa3XEvCI9sUdo(this.f$0, valueAnimator3);
                            }
                        });
                    }
                }
            }
            if (!z) {
                if (size == this.currentPhotos.size() || !this.currentObjects.contains(obj)) {
                    z = true;
                } else {
                    int iIndexOf = this.currentObjects.indexOf(obj);
                    int i10 = this.currentImage;
                    if (i10 != iIndexOf && iIndexOf != -1) {
                        boolean z6 = this.animateAllLine;
                        if (!z6 && !this.moving && (iIndexOf == i10 - 1 || iIndexOf == i10 + 1)) {
                            this.animateToItemFast = true;
                            z6 = true;
                        }
                        if (z6) {
                            this.animateToItem = iIndexOf;
                            this.nextImage = iIndexOf;
                            this.animateToDX = (i10 - iIndexOf) * (this.itemWidth + this.itemSpacing);
                            this.moving = true;
                            this.animateAllLine = r15;
                            this.lastUpdateTime = System.currentTimeMillis();
                            invalidate();
                            r15 = 0;
                        } else {
                            fillImages(true, (i10 - iIndexOf) * (this.itemWidth + this.itemSpacing));
                            this.currentImage = iIndexOf;
                            r15 = 0;
                            this.moving = false;
                        }
                        this.drawDx = r15;
                    }
                }
            }
            if (z) {
                size2 = this.currentPhotos.size();
                this.animateAllLine = r15;
                this.currentPhotos.clear();
                this.currentObjects.clear();
                if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
                    ArrayList arrayList = imagesArrLocations;
                    this.currentObjects.addAll(arrayList);
                    this.currentPhotos.addAll(arrayList);
                    this.currentImage = currentIndex;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                } else if (imagesArr == null && !imagesArr.isEmpty()) {
                    boolean z7 = this.delegate.forceAll() && imagesArr.size() > 1;
                    if (this.currentGroupId != j || z7 || slideshowMessageId != 0) {
                        int iMin2 = Math.min(currentIndex + 10, imagesArr.size());
                        for (int i11 = currentIndex; i11 < iMin2; i11++) {
                            MessageObject messageObject4 = (MessageObject) imagesArr.get(i11);
                            if (slideshowMessageId == 0 && !z7 && messageObject4.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                            this.currentObjects.add(messageObject4);
                            this.currentPhotos.add(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, 56, true), messageObject4.photoThumbsObject));
                        }
                        this.currentImage = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                        int iMax2 = Math.max(currentIndex - 10, 0);
                        for (int i12 = currentIndex - 1; i12 >= iMax2; i12--) {
                            MessageObject messageObject5 = (MessageObject) imagesArr.get(i12);
                            if (slideshowMessageId == 0 && !z7 && messageObject5.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                            this.currentObjects.add(0, messageObject5);
                            this.currentPhotos.add(0, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, 56, true), messageObject5.photoThumbsObject));
                            this.currentImage++;
                        }
                    }
                } else if (pageBlockArr != null && !pageBlockArr.isEmpty() && this.currentGroupId != j) {
                    size3 = pageBlockArr.size();
                    for (i2 = currentIndex; i2 < size3; i2++) {
                        pageBlock5 = (TL_iv.PageBlock) pageBlockArr.get(i2);
                        if (pageBlock5.groupId != this.currentGroupId) {
                            break;
                        }
                        this.currentObjects.add(pageBlock5);
                        this.currentPhotos.add(ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                    }
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    for (i3 = currentIndex - 1; i3 >= 0; i3--) {
                        pageBlock4 = (TL_iv.PageBlock) pageBlockArr.get(i3);
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
        obj = obj2;
        r15 = z4;
        if (obj == null) {
            return;
        }
        if (this.animationsEnabled) {
            if (!this.hasPhotos) {
                valueAnimator2 = this.showAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.showAnimator = null;
                }
                if (this.drawAlpha > 0.0f) {
                    if (this.hideAnimator == null) {
                        float[] fArr3 = new float[2];
                        fArr3[r15] = this.drawAlpha;
                        fArr3[1] = 0.0f;
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr3);
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
                        this.hideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                GroupedPhotosListView.$r8$lambda$KepaK_8oXCcSf_cbb0QgwVgL6ns(this.f$0, valueAnimator3);
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
                    float[] fArr4 = new float[2];
                    fArr4[r15] = f;
                    fArr4[1] = 1.0f;
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(fArr4);
                    this.showAnimator = valueAnimatorOfFloat4;
                    valueAnimatorOfFloat4.setDuration((long) ((1.0f - this.drawAlpha) * 200.0f));
                    this.showAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationStart(Animator animator) {
                            if (GroupedPhotosListView.this.delegate != null) {
                                GroupedPhotosListView.this.delegate.onShowAnimationStart();
                            }
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (GroupedPhotosListView.this.showAnimator == animator) {
                                GroupedPhotosListView.this.showAnimator = null;
                            }
                        }
                    });
                    this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            GroupedPhotosListView.$r8$lambda$OIrEb7L_MZwr_NKa3XEvCI9sUdo(this.f$0, valueAnimator3);
                        }
                    });
                }
            }
        }
        if (!z) {
            if (size == this.currentPhotos.size()) {
                z = true;
            } else {
                z = true;
            }
        }
        if (z) {
            size2 = this.currentPhotos.size();
            this.animateAllLine = r15;
            this.currentPhotos.clear();
            this.currentObjects.clear();
            if (imagesArrLocations != null) {
                if (imagesArr == null) {
                    if (pageBlockArr != null) {
                        size3 = pageBlockArr.size();
                        while (i2 < size3) {
                            pageBlock5 = (TL_iv.PageBlock) pageBlockArr.get(i2);
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
                        while (i3 >= 0) {
                            pageBlock4 = (TL_iv.PageBlock) pageBlockArr.get(i3);
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
                    while (i2 < size3) {
                        pageBlock5 = (TL_iv.PageBlock) pageBlockArr.get(i2);
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
                    while (i3 >= 0) {
                        pageBlock4 = (TL_iv.PageBlock) pageBlockArr.get(i3);
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
                    while (i2 < size3) {
                        pageBlock5 = (TL_iv.PageBlock) pageBlockArr.get(i2);
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
                    while (i3 >= 0) {
                        pageBlock4 = (TL_iv.PageBlock) pageBlockArr.get(i3);
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
                while (i2 < size3) {
                    pageBlock5 = (TL_iv.PageBlock) pageBlockArr.get(i2);
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
                while (i3 >= 0) {
                    pageBlock4 = (TL_iv.PageBlock) pageBlockArr.get(i3);
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

    public static void $r8$lambda$KepaK_8oXCcSf_cbb0QgwVgL6ns(GroupedPhotosListView groupedPhotosListView, ValueAnimator valueAnimator) {
        groupedPhotosListView.getClass();
        groupedPhotosListView.drawAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        groupedPhotosListView.invalidate();
    }

    public static void $r8$lambda$OIrEb7L_MZwr_NKa3XEvCI9sUdo(GroupedPhotosListView groupedPhotosListView, ValueAnimator valueAnimator) {
        groupedPhotosListView.getClass();
        groupedPhotosListView.drawAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        groupedPhotosListView.invalidate();
    }

    public int getCount() {
        return this.currentPhotos.size();
    }

    public int getIndex() {
        return this.currentImage;
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
        if (i >= 0 && i < this.currentPhotos.size()) {
            this.currentItemProgress = 1.0f - Math.abs(f);
        } else {
            this.currentItemProgress = 1.0f;
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

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        if (this.unusedReceivers.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            imageReceiver = (ImageReceiver) this.unusedReceivers.get(0);
            this.unusedReceivers.remove(0);
        }
        this.imagesToDraw.add(imageReceiver);
        imageReceiver.setCurrentAccount(this.delegate.getCurrentAccount());
        return imageReceiver;
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
                ImageReceiver imageReceiver = (ImageReceiver) this.imagesToDraw.get(i2);
                int param = imageReceiver.getParam();
                int i3 = param - this.currentImage;
                int i4 = this.itemWidth;
                int i5 = (i3 * (this.itemSpacing + i4)) + measuredWidth2 + i;
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
                int i6 = ((iMax - this.currentImage) * (this.itemWidth + this.itemSpacing)) + measuredWidth2 + i;
                if (i6 >= measuredWidth) {
                    break;
                }
                ImageLocation imageLocation = (ImageLocation) this.currentPhotos.get(iMax);
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
                int i9 = (i7 * (this.itemSpacing + i8)) + measuredWidth2 + i + i8;
                if (i9 <= 0) {
                    break;
                }
                ImageLocation imageLocation2 = (ImageLocation) this.currentPhotos.get(iMin);
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
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList imagesArr = this.delegate.getImagesArr();
        List pageBlockArr = this.delegate.getPageBlockArr();
        stopScrolling();
        int size = this.imagesToDraw.size();
        for (int i = 0; i < size; i++) {
            ImageReceiver imageReceiver = (ImageReceiver) this.imagesToDraw.get(i);
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
            i = i3 + (i2 / (i5 + (i6 * 2)));
        } else {
            i = 0;
        }
        this.nextPhotoScrolling = this.currentImage - i;
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList imagesArr = this.delegate.getImagesArr();
        List pageBlockArr = this.delegate.getPageBlockArr();
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
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.scroll.abortAnimation();
        if (this.currentPhotos.size() < 10) {
            return false;
        }
        this.scroll.fling(this.drawDx, 0, Math.round(f), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
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
            this.animateToDX = (this.currentImage - i2) * (this.itemWidth + this.itemSpacing);
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

    private int getMinScrollX() {
        return (-((this.currentPhotos.size() - this.currentImage) - 1)) * (this.itemWidth + (this.itemSpacing * 2));
    }

    private int getMaxScrollX() {
        return this.currentImage * (this.itemWidth + (this.itemSpacing * 2));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fillImages(false, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int iMax;
        int iMax2;
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
            ImageLocation imageLocation = (ImageLocation) this.currentPhotos.get(this.currentImage);
            if (imageLocation != null && (photoSize2 = imageLocation.photoSize) != null) {
                iMax = Math.max(this.itemWidth, (int) (photoSize2.w * (this.itemHeight / photoSize2.h)));
            } else {
                iMax = this.itemHeight;
            }
            int iMin = Math.min(i2, iMax);
            float f2 = iDp * 2;
            float f3 = this.currentItemProgress;
            int i3 = (int) (f2 * f3);
            int i4 = this.itemWidth;
            int i5 = i4 + ((int) ((iMin - i4) * f3)) + i3;
            int i6 = this.nextImage;
            if (i6 >= 0 && i6 < this.currentPhotos.size()) {
                ImageLocation imageLocation2 = (ImageLocation) this.currentPhotos.get(this.nextImage);
                if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                    iMax2 = Math.max(this.itemWidth, (int) (photoSize.w * (this.itemHeight / photoSize.h)));
                } else {
                    iMax2 = this.itemHeight;
                }
            } else {
                iMax2 = this.itemWidth;
            }
            int iMin2 = Math.min(i2, iMax2);
            float f4 = this.nextItemProgress;
            int i7 = (int) (f2 * f4);
            float f5 = i;
            int i8 = this.itemWidth;
            int i9 = (int) (f5 + ((((iMin2 + i7) - i8) / 2) * f4 * (this.nextImage > this.currentImage ? -1 : 1)));
            int i10 = i8 + ((int) ((iMin2 - i8) * f4)) + i7;
            int measuredWidth = (getMeasuredWidth() - i5) / 2;
            for (int i11 = 0; i11 < size; i11++) {
                ImageReceiver imageReceiver = (ImageReceiver) this.imagesToDraw.get(i11);
                int param = imageReceiver.getParam();
                int i12 = this.currentImage;
                if (param == i12) {
                    imageReceiver.setImageX(measuredWidth + i9 + (i3 / 2));
                    imageReceiver.setImageWidth(i5 - i3);
                } else {
                    int i13 = this.nextImage;
                    if (i13 < i12) {
                        if (param >= i12) {
                            imageReceiver.setImageX(measuredWidth + i5 + this.itemSpacing + (((imageReceiver.getParam() - this.currentImage) - 1) * (this.itemWidth + this.itemSpacing)) + i9);
                        } else if (param <= i13) {
                            int param2 = (imageReceiver.getParam() - this.currentImage) + 1;
                            int i14 = this.itemWidth;
                            int i15 = this.itemSpacing;
                            imageReceiver.setImageX((((param2 * (i14 + i15)) + measuredWidth) - (i15 + i10)) + i9);
                        } else {
                            imageReceiver.setImageX(((imageReceiver.getParam() - this.currentImage) * (this.itemWidth + this.itemSpacing)) + measuredWidth + i9);
                        }
                    } else if (param < i12) {
                        imageReceiver.setImageX(((imageReceiver.getParam() - this.currentImage) * (this.itemWidth + this.itemSpacing)) + measuredWidth + i9);
                    } else if (param <= i13) {
                        imageReceiver.setImageX(measuredWidth + i5 + this.itemSpacing + (((imageReceiver.getParam() - this.currentImage) - 1) * (this.itemWidth + this.itemSpacing)) + i9);
                    } else {
                        int i16 = measuredWidth + i5 + this.itemSpacing;
                        int param3 = (imageReceiver.getParam() - this.currentImage) - 2;
                        int i17 = this.itemWidth;
                        int i18 = this.itemSpacing;
                        imageReceiver.setImageX(i16 + (param3 * (i17 + i18)) + i18 + i10 + i9);
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
                            float f10 = f9 + (f7 / 200.0f);
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

    public void setDelegate(GroupedPhotosListViewDelegate groupedPhotosListViewDelegate) {
        this.delegate = groupedPhotosListViewDelegate;
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

    public void setAnimateBackground(boolean z) {
        this.animateBackground = z;
    }

    public void reset() {
        this.hasPhotos = false;
        if (this.animationsEnabled) {
            this.drawAlpha = 0.0f;
        }
    }
}
