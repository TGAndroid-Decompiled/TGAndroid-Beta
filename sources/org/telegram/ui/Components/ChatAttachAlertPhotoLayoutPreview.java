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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
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
    private static HashMap photoRotate = new HashMap();
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

    @Override
    public int needsActionBar() {
        return 1;
    }

    @Override
    public boolean shouldHideBottomButtons() {
        return true;
    }

    static float access$1416(ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview, float f) {
        float f2 = chatAttachAlertPhotoLayoutPreview.draggingCellTouchY + f;
        chatAttachAlertPhotoLayoutPreview.draggingCellTouchY = f2;
        return f2;
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
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

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
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

    public void startMediaCrossfade() {
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
                ((PreviewGroupsView.PreviewGroupCell.MediaCell) obj2).startCrossfade();
            }
        }
    }

    public void invalidateGroupsView() {
        this.groupsView.invalidate();
    }

    @Override
    public void onShow(final ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.shown = true;
        if (attachAlertLayout instanceof ChatAttachAlertPhotoLayout) {
            this.photoLayout = (ChatAttachAlertPhotoLayout) attachAlertLayout;
            this.groupsView.deletedPhotos.clear();
            this.groupsView.fromPhotoLayout(this.photoLayout);
            this.groupsView.requestLayout();
            this.layoutManager.scrollToPositionWithOffset(0, 0);
            this.listView.post(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertPhotoLayoutPreview.$r8$lambda$4WxXY8L8PbU1QF6rFa0wJqi4lVM(this.f$0, attachAlertLayout);
                }
            });
            postDelayed(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertPhotoLayoutPreview.$r8$lambda$a5MCt0VnzYfhlX92TjlKaSxAi2c(this.f$0);
                }
            }, 250L);
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

    public static void $r8$lambda$4WxXY8L8PbU1QF6rFa0wJqi4lVM(ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview, ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        chatAttachAlertPhotoLayoutPreview.getClass();
        int currentItemTop = attachAlertLayout.getCurrentItemTop();
        int listTopPadding = attachAlertLayout.getListTopPadding();
        RecyclerListView recyclerListView = chatAttachAlertPhotoLayoutPreview.listView;
        if (currentItemTop > AndroidUtilities.dp(7.0f)) {
            listTopPadding -= currentItemTop;
        }
        recyclerListView.scrollBy(0, listTopPadding);
    }

    public static void $r8$lambda$a5MCt0VnzYfhlX92TjlKaSxAi2c(ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview) {
        if (!chatAttachAlertPhotoLayoutPreview.shown || chatAttachAlertPhotoLayoutPreview.parentAlert.getPhotoLayout() == null) {
            return;
        }
        chatAttachAlertPhotoLayoutPreview.parentAlert.getPhotoLayout().previewItem.setIcon(R.drawable.ic_ab_back);
        chatAttachAlertPhotoLayoutPreview.parentAlert.getPhotoLayout().previewItem.setText(LocaleController.getString(R.string.Back));
        chatAttachAlertPhotoLayoutPreview.parentAlert.getPhotoLayout().previewItem.setRightIcon(0);
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
    public int getSelectedItemsCount() {
        return this.groupsView.getPhotosCount();
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
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(56.0f);
    }

    @Override
    public void applyCaption(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.applyCaption(charSequence);
        }
    }

    private class GroupCalculator {
        float height;
        int maxX;
        int maxY;
        ArrayList photos;
        int width;
        public ArrayList posArray = new ArrayList();
        public HashMap positions = new HashMap();
        private final int maxSizeWidth = 1000;

        private class MessageGroupedLayoutAttempt {
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

        private float multiHeight(float[] fArr, int i, int i2) {
            float f = 0.0f;
            while (i < i2) {
                f += fArr[i];
                i++;
            }
            return 1000.0f / f;
        }

        public GroupCalculator(ArrayList arrayList) {
            this.photos = arrayList;
            calculate();
        }

        public void calculate() {
            int i;
            int i2;
            ArrayList arrayList;
            int i3;
            int i4;
            MessageObject.GroupedMessagePosition groupedMessagePosition;
            boolean zBooleanValue;
            int i5 = 8;
            int size = this.photos.size();
            this.posArray.clear();
            this.positions.clear();
            int i6 = 0;
            if (size == 0) {
                this.width = 0;
                this.height = 0.0f;
                this.maxX = 0;
                this.maxY = 0;
                return;
            }
            this.posArray.ensureCapacity(size);
            char[] cArr = new char[size];
            int i7 = 0;
            float f = 1.0f;
            boolean z = false;
            while (i7 < size) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.photos.get(i7);
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                groupedMessagePosition2.last = i7 == size + (-1);
                MediaController.CropState cropState = photoEntry.cropState;
                int i8 = cropState != null ? cropState.width : photoEntry.width;
                int i9 = cropState != null ? cropState.height : photoEntry.height;
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
                            int attributeInt = new ExifInterface(photoEntry.path).getAttributeInt("Orientation", 1);
                            if (attributeInt == 6 || attributeInt == i5) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                        }
                    } catch (Exception unused) {
                    }
                    ChatAttachAlertPhotoLayoutPreview.photoRotate.put(photoEntry, Boolean.valueOf(zBooleanValue));
                }
                if (zBooleanValue) {
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                float f2 = i8 / i9;
                groupedMessagePosition2.aspectRatio = f2;
                cArr[i7] = f2 > 1.2f ? 'w' : f2 < 0.8f ? 'n' : 'q';
                f += f2;
                if (f2 > 2.0f) {
                    z = true;
                }
                this.positions.put(photoEntry, groupedMessagePosition2);
                this.posArray.add(groupedMessagePosition2);
                i7++;
                i5 = 8;
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
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                int backgroundPaddingLeft = AndroidUtilities.displaySize.x - (ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getBackgroundPaddingLeft() * 2);
                Point point3 = AndroidUtilities.displaySize;
                groupedMessagePosition3.set(0, 0, 0, 0, 800, ((backgroundPaddingLeft * 0.8f) / groupedMessagePosition3.aspectRatio) / (Math.max(point3.x, point3.y) * 0.5f), 15);
            } else {
                if (z || !(size == 2 || size == 3 || size == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i11 = 0; i11 < size; i11++) {
                        if (f3 > 1.1f) {
                            fArr[i11] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) this.posArray.get(i11)).aspectRatio);
                        } else {
                            fArr[i11] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) this.posArray.get(i11)).aspectRatio);
                        }
                        fArr[i11] = Math.max(0.66667f, Math.min(1.7f, fArr[i11]));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 1; i12 < size2; i12++) {
                        int i13 = size2 - i12;
                        if (i12 <= 3 && i13 <= 3) {
                            arrayList2.add(new MessageGroupedLayoutAttempt(i12, i13, multiHeight(fArr, 0, i12), multiHeight(fArr, i12, size2)));
                        }
                    }
                    int i14 = 1;
                    while (i14 < size2 - 1) {
                        int i15 = 1;
                        while (true) {
                            int i16 = size2 - i14;
                            if (i15 < i16) {
                                int i17 = i16 - i15;
                                if (i14 <= 3) {
                                    if (i15 <= (f3 < 0.85f ? 4 : 3) && i17 <= 3) {
                                        float fMultiHeight = multiHeight(fArr, i6, i14);
                                        int i18 = i14 + i15;
                                        arrayList2.add(new MessageGroupedLayoutAttempt(i14, i15, i17, fMultiHeight, multiHeight(fArr, i14, i18), multiHeight(fArr, i18, size2)));
                                    }
                                }
                                i15++;
                                i6 = 0;
                            }
                        }
                        i14++;
                        i6 = 0;
                    }
                    int i19 = 1;
                    while (true) {
                        int i20 = 0;
                        if (i19 >= size2 - 2) {
                            break;
                        }
                        int i21 = 1;
                        while (true) {
                            int i22 = size2 - i19;
                            if (i21 < i22) {
                                int i23 = 1;
                                while (true) {
                                    int i24 = i22 - i21;
                                    if (i23 < i24) {
                                        int i25 = i24 - i23;
                                        if (i19 > 3 || i21 > 3 || i23 > 3) {
                                            i2 = size;
                                            arrayList = arrayList2;
                                        } else {
                                            if (i25 > 3) {
                                                i2 = size;
                                                i22 = i22;
                                                arrayList = arrayList2;
                                            } else {
                                                float fMultiHeight2 = multiHeight(fArr, i20, i19);
                                                int i26 = i19 + i21;
                                                float fMultiHeight3 = multiHeight(fArr, i19, i26);
                                                int i27 = i26 + i23;
                                                float fMultiHeight4 = multiHeight(fArr, i26, i27);
                                                float fMultiHeight5 = multiHeight(fArr, i27, size2);
                                                arrayList = arrayList2;
                                                i2 = size;
                                                arrayList.add(new MessageGroupedLayoutAttempt(i19, i21, i23, i25, fMultiHeight2, fMultiHeight3, fMultiHeight4, fMultiHeight5));
                                            }
                                            i23++;
                                            arrayList2 = arrayList;
                                            size = i2;
                                            i22 = i22;
                                            i20 = 0;
                                        }
                                        i23++;
                                        arrayList2 = arrayList;
                                        size = i2;
                                        i22 = i22;
                                        i20 = 0;
                                    }
                                }
                                i21++;
                                i20 = 0;
                            }
                        }
                        i19++;
                    }
                    i = size;
                    ArrayList arrayList3 = arrayList2;
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f4 = 0.0f;
                    for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList3.get(i28);
                        float f5 = Float.MAX_VALUE;
                        int i29 = 0;
                        float f6 = 0.0f;
                        while (true) {
                            float[] fArr2 = messageGroupedLayoutAttempt2.heights;
                            if (i29 >= fArr2.length) {
                                break;
                            }
                            float f7 = fArr2[i29];
                            f6 += f7;
                            if (f7 < f5) {
                                f5 = f7;
                            }
                            i29++;
                        }
                        float fAbs = Math.abs(f6 - 1332.0f);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        if (iArr.length > 1) {
                            int i30 = iArr[0];
                            int i31 = iArr[1];
                            if (i30 <= i31 && (iArr.length <= 2 || i31 <= iArr[2])) {
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
                    int i32 = 0;
                    int i33 = 0;
                    while (true) {
                        int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                        if (i33 >= iArr2.length) {
                            break;
                        }
                        int i34 = iArr2[i33];
                        float f8 = messageGroupedLayoutAttempt.heights[i33];
                        int i35 = 1000;
                        int i36 = 0;
                        MessageObject.GroupedMessagePosition groupedMessagePosition4 = null;
                        while (i36 < i34) {
                            int i37 = (int) (fArr[i32] * f8);
                            i35 -= i37;
                            MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) this.posArray.get(i32);
                            int i38 = i33 == 0 ? 4 : 0;
                            if (i33 == messageGroupedLayoutAttempt.lineCounts.length - 1) {
                                i38 |= 8;
                            }
                            if (i36 == 0) {
                                i38 |= 1;
                                groupedMessagePosition4 = groupedMessagePosition5;
                            }
                            if (i36 == i34 - 1) {
                                i38 |= 2;
                                groupedMessagePosition4 = groupedMessagePosition5;
                            }
                            int i39 = i36;
                            groupedMessagePosition5.set(i39, i36, i33, i33, i37, Math.max(fDp3, f8 / 814.0f), i38);
                            i32++;
                            i36 = i39 + 1;
                        }
                        int i40 = i33;
                        if (groupedMessagePosition4 != null) {
                            groupedMessagePosition4.pw += i35;
                            groupedMessagePosition4.spanSize += i35;
                        }
                        i33 = i40 + 1;
                    }
                } else if (size == 2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                    if (str.equals("ww") && f3 > ((double) 1.2285012f) * 1.4d) {
                        float f9 = groupedMessagePosition6.aspectRatio;
                        float f10 = groupedMessagePosition7.aspectRatio;
                        if (f9 - f10 < 0.2d) {
                            float fRound = Math.round(Math.min(1000.0f / f9, Math.min(1000.0f / f10, 407.0f))) / 814.0f;
                            groupedMessagePosition6.set(0, 0, 0, 0, 1000, fRound, 7);
                            groupedMessagePosition7.set(0, 0, 1, 1, 1000, fRound, 11);
                        } else if (!str.equals("ww")) {
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
                    } else if (!str.equals("ww") || str.equals("qq")) {
                        float f13 = 500;
                        float fRound4 = Math.round(Math.min(f13 / groupedMessagePosition6.aspectRatio, Math.min(f13 / groupedMessagePosition7.aspectRatio, 814.0f))) / 814.0f;
                        groupedMessagePosition6.set(0, 0, 0, 0, 500, fRound4, 13);
                        groupedMessagePosition7.set(1, 1, 0, 0, 500, fRound4, 14);
                    } else {
                        float f14 = groupedMessagePosition6.aspectRatio;
                        int iMax = (int) Math.max(400.0f, Math.round((1000.0f / f14) / ((1.0f / f14) + (1.0f / groupedMessagePosition7.aspectRatio))));
                        int i41 = 1000 - iMax;
                        if (i41 < iMin) {
                            iMax -= iMin - i41;
                        } else {
                            iMin = i41;
                        }
                        float fMin = Math.min(814.0f, Math.round(Math.min(iMin / groupedMessagePosition6.aspectRatio, iMax / groupedMessagePosition7.aspectRatio))) / 814.0f;
                        groupedMessagePosition6.set(0, 0, 0, 0, iMin, fMin, 13);
                        groupedMessagePosition7.set(1, 1, 0, 0, iMax, fMin, 14);
                    }
                } else if (size == 3) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                    MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) this.posArray.get(2);
                    if (str.charAt(0) == 'n') {
                        float f15 = groupedMessagePosition9.aspectRatio;
                        float fMin2 = Math.min(407.0f, Math.round((1000.0f * f15) / (groupedMessagePosition10.aspectRatio + f15)));
                        float f16 = 814.0f - fMin2;
                        int iMax2 = (int) Math.max(iMin, Math.min(500.0f, Math.round(Math.min(groupedMessagePosition10.aspectRatio * fMin2, groupedMessagePosition9.aspectRatio * f16))));
                        int i42 = 1000 - iMax2;
                        groupedMessagePosition8.set(0, 0, 0, 1, Math.round(Math.min((groupedMessagePosition8.aspectRatio * 814.0f) + iMin2, i42)), 1.0f, 13);
                        float f17 = f16 / 814.0f;
                        groupedMessagePosition9.set(1, 1, 0, 0, iMax2, f17, 6);
                        float f18 = fMin2 / 814.0f;
                        groupedMessagePosition10.set(1, 1, 1, 1, iMax2, f18, 10);
                        groupedMessagePosition10.spanSize = 1000;
                        groupedMessagePosition8.siblingHeights = new float[]{f18, f17};
                        groupedMessagePosition8.spanSize = i42;
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
                    MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                    MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                    MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) this.posArray.get(2);
                    MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) this.posArray.get(3);
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
                            int i43 = iDp3 / 2;
                            iMax3 -= i43;
                            iMax4 -= iDp3 - i43;
                        }
                        int i44 = iMax3;
                        float fMin4 = Math.min(814.0f - fRound6, fRound7) / 814.0f;
                        float f22 = fMin4 < fDp3 ? fDp3 : fMin4;
                        groupedMessagePosition12.set(0, 0, 1, 1, i44, f22, 9);
                        groupedMessagePosition13.set(1, 1, 1, 1, iDp2, f22, 8);
                        groupedMessagePosition14.set(2, 2, 1, 1, iMax4, f22, 10);
                    } else {
                        int iMax5 = Math.max(iMin, Math.round(814.0f / (((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition13.aspectRatio)) + (1.0f / groupedMessagePosition14.aspectRatio))));
                        float f23 = iDp;
                        float f24 = iMax5;
                        float fMin5 = Math.min(0.33f, Math.max(f23, f24 / groupedMessagePosition12.aspectRatio) / 814.0f);
                        float fMin6 = Math.min(0.33f, Math.max(f23, f24 / groupedMessagePosition13.aspectRatio) / 814.0f);
                        float f25 = (1.0f - fMin5) - fMin6;
                        int i45 = 1000 - iMax5;
                        groupedMessagePosition11.set(0, 0, 0, 2, Math.round(Math.min((groupedMessagePosition11.aspectRatio * 814.0f) + iMin2, i45)), fMin5 + fMin6 + f25, 13);
                        groupedMessagePosition12.set(1, 1, 0, 0, iMax5, fMin5, 6);
                        groupedMessagePosition13.set(1, 1, 1, 1, iMax5, fMin6, 2);
                        groupedMessagePosition13.spanSize = 1000;
                        groupedMessagePosition14.set(1, 1, 2, 2, iMax5, f25, 10);
                        groupedMessagePosition14.spanSize = 1000;
                        groupedMessagePosition11.spanSize = i45;
                        groupedMessagePosition11.siblingHeights = new float[]{fMin5, fMin6, f25};
                    }
                }
                for (i3 = 0; i3 < i; i3++) {
                    groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i3);
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
                for (i4 = 0; i4 < i; i4++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) this.posArray.get(i4);
                    groupedMessagePosition15.top = getTop(groupedMessagePosition15, groupedMessagePosition15.minY);
                }
                this.width = getWidth();
                this.height = getHeight();
            }
            i = size;
            while (i3 < i) {
                groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i3);
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
            while (i4 < i) {
                MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) this.posArray.get(i4);
                groupedMessagePosition16.top = getTop(groupedMessagePosition16, groupedMessagePosition16.minY);
            }
            this.width = getWidth();
            this.height = getHeight();
        }

        public int getWidth() {
            int[] iArr = new int[10];
            Arrays.fill(iArr, 0);
            int size = this.posArray.size();
            for (int i = 0; i < size; i++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i);
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

        public float getHeight() {
            float[] fArr = new float[10];
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i = 0; i < size; i++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) this.posArray.get(i);
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

        private float getLeft(MessageObject.GroupedMessagePosition groupedMessagePosition, int i, int i2, int i3) {
            int i4 = (i2 - i) + 1;
            float[] fArr = new float[i4];
            float f = 0.0f;
            Arrays.fill(fArr, 0.0f);
            int size = this.posArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) this.posArray.get(i5);
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
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) this.posArray.get(i3);
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
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
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
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public boolean onBackPressed() {
        this.parentAlert.updatePhotoPreview(false);
        return true;
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void onMenuItemClick(int i) {
        try {
            this.parentAlert.getPhotoLayout().onMenuItemClick(i);
        } catch (Exception unused) {
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
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
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onSelectedItemsCountChanged(int i) {
        if (i > 1) {
            this.parentAlert.selectedMenuItem.showSubItem(0);
        } else {
            this.parentAlert.selectedMenuItem.hideSubItem(0);
        }
    }

    class PreviewGroupsView extends ViewGroup {
        private HashMap deletedPhotos;
        private float draggingT;
        private ArrayList groupCells;
        private ChatActionCell hintView;
        private HashMap images;
        boolean[] lastGroupSeen;
        private int lastMeasuredHeight;
        private int paddingBottom;
        private int paddingTop;
        GroupingPhotoViewerProvider photoViewerProvider;
        HashMap photosMap;
        List photosMapKeys;
        ArrayList photosOrder;
        private float savedDragFromX;
        private float savedDragFromY;
        private float savedDraggingT;
        private final Runnable scroller;
        private boolean scrollerStarted;
        HashMap selectedPhotos;
        PreviewGroupCell tapGroupCell;
        PreviewGroupCell.MediaCell tapMediaCell;
        long tapTime;
        private final PointF tmpPoint;
        private int undoViewId;
        float viewBottom;
        float viewTop;

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return false;
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
            this.images = new HashMap();
            setWillNotDraw(false);
            ChatActionCell chatActionCell = new ChatActionCell(context, true, ChatAttachAlertPhotoLayoutPreview.this.themeDelegate);
            this.hintView = chatActionCell;
            chatActionCell.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
            addView(this.hintView);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            ChatActionCell chatActionCell = this.hintView;
            chatActionCell.layout(0, 0, chatActionCell.getMeasuredWidth(), this.hintView.getMeasuredHeight());
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

        public void fromPhotoLayout(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
            this.photosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            this.photosMap = chatAttachAlertPhotoLayout.getSelectedPhotos();
            fromPhotoArrays();
        }

        public void fromPhotoArrays() {
            for (int i = 0; i < this.groupCells.size(); i++) {
                ((PreviewGroupCell) this.groupCells.get(i)).detach();
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

        public void calcPhotoArrays() {
            String str;
            this.photosMap = ChatAttachAlertPhotoLayoutPreview.this.photoLayout.getSelectedPhotos();
            this.photosMapKeys = new ArrayList(this.photosMap.entrySet());
            this.selectedPhotos = new HashMap();
            this.photosOrder = new ArrayList();
            int size = this.groupCells.size();
            for (int i = 0; i < size; i++) {
                GroupCalculator groupCalculator = ((PreviewGroupCell) this.groupCells.get(i)).group;
                if (groupCalculator.photos.size() != 0) {
                    int size2 = groupCalculator.photos.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) groupCalculator.photos.get(i2);
                        if (!this.deletedPhotos.containsKey(photoEntry)) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < this.photosMapKeys.size()) {
                                    Map.Entry entry = (Map.Entry) this.photosMapKeys.get(i3);
                                    Object value = entry.getValue();
                                    if (value == photoEntry) {
                                        Object key = entry.getKey();
                                        this.selectedPhotos.put(key, value);
                                        this.photosOrder.add(key);
                                        break;
                                    }
                                    i3++;
                                } else {
                                    for (int i4 = 0; i4 < this.photosMapKeys.size(); i4++) {
                                        Map.Entry entry2 = (Map.Entry) this.photosMapKeys.get(i4);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.selectedPhotos.put(key2, value2);
                                            this.photosOrder.add(key2);
                                            break;
                                        }
                                    }
                                    break;
                                }
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

        public void toPhotoLayout(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
            int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
            calcPhotoArrays();
            chatAttachAlertPhotoLayout.updateSelected(this.selectedPhotos, this.photosOrder, z);
            if (size != this.photosOrder.size()) {
                ChatAttachAlertPhotoLayoutPreview.this.parentAlert.updateCountButton(1);
            }
        }

        public int getPhotosCount() {
            int size = this.groupCells.size();
            int size2 = 0;
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) this.groupCells.get(i);
                if (previewGroupCell != null && previewGroupCell.group != null && previewGroupCell.group.photos != null) {
                    size2 += previewGroupCell.group.photos.size();
                }
            }
            return size2;
        }

        public ArrayList getPhotos() {
            ArrayList arrayList = new ArrayList();
            int size = this.groupCells.size();
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) this.groupCells.get(i);
                if (previewGroupCell != null && previewGroupCell.group != null && previewGroupCell.group.photos != null) {
                    arrayList.addAll(previewGroupCell.group.photos);
                }
            }
            return arrayList;
        }

        public int measurePureHeight() {
            int iMeasure = this.paddingTop + this.paddingBottom;
            int size = this.groupCells.size();
            for (int i = 0; i < size; i++) {
                iMeasure = (int) (iMeasure + ((PreviewGroupCell) this.groupCells.get(i)).measure());
            }
            if (this.hintView.getMeasuredHeight() <= 0) {
                this.hintView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
            }
            return iMeasure + this.hintView.getMeasuredHeight();
        }

        private int measureHeight() {
            return Math.max(measurePureHeight(), (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(45.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.hintView.measure(i, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
            if (this.lastMeasuredHeight <= 0) {
                this.lastMeasuredHeight = measureHeight();
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.lastMeasuredHeight), 1073741824));
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

        private boolean[] groupSeen() {
            boolean[] zArr = new boolean[this.groupCells.size()];
            float f = this.paddingTop;
            int iComputeVerticalScrollOffset = ChatAttachAlertPhotoLayoutPreview.this.listView.computeVerticalScrollOffset();
            int i = 0;
            this.viewTop = Math.max(0, iComputeVerticalScrollOffset - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding());
            this.viewBottom = (ChatAttachAlertPhotoLayoutPreview.this.listView.getMeasuredHeight() - ChatAttachAlertPhotoLayoutPreview.this.getListTopPadding()) + iComputeVerticalScrollOffset;
            int size = this.groupCells.size();
            while (i < size) {
                float fMeasure = ((PreviewGroupCell) this.groupCells.get(i)).measure() + f;
                zArr[i] = isSeen(f, fMeasure);
                i++;
                f = fMeasure;
            }
            return zArr;
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

        public void remeasure() {
            float f = this.paddingTop;
            int size = this.groupCells.size();
            int size2 = 0;
            for (int i = 0; i < size; i++) {
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) this.groupCells.get(i);
                float fMeasure = previewGroupCell.measure();
                previewGroupCell.y = f;
                previewGroupCell.indexStart = size2;
                f += fMeasure;
                size2 += previewGroupCell.group.photos.size();
            }
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
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) this.groupCells.get(i);
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

        PointF dragTranslate() {
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                if (!ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding) {
                    RectF rectFRect = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect();
                    RectF rectFRect2 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect(1.0f);
                    this.tmpPoint.x = AndroidUtilities.lerp(rectFRect2.left + (rectFRect.width() / 2.0f), ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchX - ((ChatAttachAlertPhotoLayoutPreview.this.draggingCellLeft - 0.5f) * ChatAttachAlertPhotoLayoutPreview.this.draggingCellFromWidth), this.draggingT);
                    this.tmpPoint.y = AndroidUtilities.lerp(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.y + rectFRect2.top + (rectFRect.height() / 2.0f), (ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchY - ((ChatAttachAlertPhotoLayoutPreview.this.draggingCellTop - 0.5f) * ChatAttachAlertPhotoLayoutPreview.this.draggingCellFromHeight)) + ChatAttachAlertPhotoLayoutPreview.this.draggingCellGroupY, this.draggingT);
                } else {
                    RectF rectFRect3 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect();
                    RectF rectFRect4 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell.rect(1.0f);
                    this.tmpPoint.x = AndroidUtilities.lerp(rectFRect4.left + (rectFRect3.width() / 2.0f), this.savedDragFromX, this.draggingT / this.savedDraggingT);
                    this.tmpPoint.y = AndroidUtilities.lerp(ChatAttachAlertPhotoLayoutPreview.this.draggingCell.groupCell.y + rectFRect4.top + (rectFRect3.height() / 2.0f), this.savedDragFromY, this.draggingT / this.savedDraggingT);
                }
                return this.tmpPoint;
            }
            PointF pointF = this.tmpPoint;
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }

        void stopDragging() {
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
            }
            PointF pointFDragTranslate = dragTranslate();
            this.savedDraggingT = this.draggingT;
            this.savedDragFromX = pointFDragTranslate.x;
            this.savedDragFromY = pointFDragTranslate.y;
            ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding = true;
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator = ValueAnimator.ofFloat(this.savedDraggingT, 0.0f);
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.$r8$lambda$ixGI42umPjCmhHGRfys1kGhUrF8(this.f$0, valueAnimator);
                }
            });
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

        public static void $r8$lambda$ixGI42umPjCmhHGRfys1kGhUrF8(PreviewGroupsView previewGroupsView, ValueAnimator valueAnimator) {
            previewGroupsView.getClass();
            previewGroupsView.draggingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            previewGroupsView.invalidate();
        }

        void startDragging(PreviewGroupCell.MediaCell mediaCell) {
            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = mediaCell;
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
            chatAttachAlertPhotoLayoutPreview.draggingCellGroupY = chatAttachAlertPhotoLayoutPreview.draggingCell.groupCell.y;
            ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding = false;
            this.draggingT = 0.0f;
            invalidate();
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
            }
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.m2198$r8$lambda$Nj5B9IguX1XoP5OIQrsk_MUJbE(this.f$0, valueAnimator);
                }
            });
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.setDuration(200L);
            ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.start();
        }

        public static void m2198$r8$lambda$Nj5B9IguX1XoP5OIQrsk_MUJbE(PreviewGroupsView previewGroupsView, ValueAnimator valueAnimator) {
            previewGroupsView.getClass();
            previewGroupsView.draggingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            previewGroupsView.invalidate();
        }

        class GroupingPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
            private ArrayList photos = new ArrayList();

            @Override
            public boolean cancelButtonPressed() {
                return false;
            }

            GroupingPhotoViewerProvider() {
            }

            public void init(ArrayList arrayList) {
                this.photos = arrayList;
            }

            @Override
            public void onClose() {
                PreviewGroupsView.this.fromPhotoArrays();
                PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                previewGroupsView.toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
            }

            @Override
            public boolean isPhotoChecked(int i) {
                if (i < 0 || i >= this.photos.size()) {
                    return false;
                }
                return PreviewGroupsView.this.photosOrder.contains(Integer.valueOf(((MediaController.PhotoEntry) this.photos.get(i)).imageId));
            }

            @Override
            public int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
                if (i < 0 || i >= this.photos.size()) {
                    return -1;
                }
                Integer numValueOf = Integer.valueOf(((MediaController.PhotoEntry) this.photos.get(i)).imageId);
                int iIndexOf = PreviewGroupsView.this.photosOrder.indexOf(numValueOf);
                if (iIndexOf >= 0) {
                    if (PreviewGroupsView.this.photosOrder.size() <= 1) {
                        return -1;
                    }
                    PreviewGroupsView.this.photosOrder.remove(iIndexOf);
                    PreviewGroupsView.this.fromPhotoArrays();
                    return iIndexOf;
                }
                PreviewGroupsView.this.photosOrder.add(numValueOf);
                PreviewGroupsView.this.fromPhotoArrays();
                return PreviewGroupsView.this.photosOrder.size() - 1;
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
            public int getSelectedCount() {
                return PreviewGroupsView.this.photosOrder.size();
            }

            @Override
            public ArrayList getSelectedPhotosOrder() {
                return PreviewGroupsView.this.photosOrder;
            }

            @Override
            public HashMap getSelectedPhotos() {
                return PreviewGroupsView.this.photosMap;
            }

            @Override
            public int getPhotoIndex(int i) {
                MediaController.PhotoEntry photoEntry;
                if (i < 0 || i >= this.photos.size() || (photoEntry = (MediaController.PhotoEntry) this.photos.get(i)) == null) {
                    return -1;
                }
                return PreviewGroupsView.this.photosOrder.indexOf(Integer.valueOf(photoEntry.imageId));
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                MediaController.PhotoEntry photoEntry;
                ArrayList arrayList;
                PhotoViewer.PlaceProviderObject placeProviderObject = null;
                if (i >= 0 && i < this.photos.size() && isPhotoChecked(i) && (photoEntry = (MediaController.PhotoEntry) this.photos.get(i)) != null) {
                    int size = PreviewGroupsView.this.groupCells.size();
                    PreviewGroupCell previewGroupCell = null;
                    PreviewGroupCell.MediaCell mediaCell = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        previewGroupCell = (PreviewGroupCell) PreviewGroupsView.this.groupCells.get(i2);
                        if (previewGroupCell != null && (arrayList = previewGroupCell.media) != null) {
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                PreviewGroupCell.MediaCell mediaCell2 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i3);
                                if (mediaCell2 != null && mediaCell2.photoEntry == photoEntry && mediaCell2.scale > 0.5d) {
                                    mediaCell = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i3);
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
            public void updatePhotoAtIndex(int i) {
                MediaController.PhotoEntry photoEntry;
                boolean z;
                if (i < 0 || i >= this.photos.size() || (photoEntry = (MediaController.PhotoEntry) this.photos.get(i)) == null) {
                    return;
                }
                int i2 = photoEntry.imageId;
                PreviewGroupsView.this.invalidate();
                for (int i3 = 0; i3 < PreviewGroupsView.this.groupCells.size(); i3++) {
                    PreviewGroupCell previewGroupCell = (PreviewGroupCell) PreviewGroupsView.this.groupCells.get(i3);
                    if (previewGroupCell != null && previewGroupCell.media != null) {
                        for (int i4 = 0; i4 < previewGroupCell.media.size(); i4++) {
                            PreviewGroupCell.MediaCell mediaCell = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                            if (mediaCell != null && mediaCell.photoEntry.imageId == i2) {
                                mediaCell.setImage(photoEntry);
                            }
                        }
                        if (previewGroupCell.group == null || previewGroupCell.group.photos == null) {
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
                            previewGroupCell.setGroup(previewGroupCell.group, true);
                        }
                    }
                }
                PreviewGroupsView.this.remeasure();
                PreviewGroupsView.this.invalidate();
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
            int i2;
            boolean z;
            PreviewGroupCell.MediaCell mediaCell3;
            int i3;
            ChatActivity chatActivity;
            BaseFragment lastFragment;
            int iIndexOf;
            int iIndexOf2;
            int size;
            int i4;
            PreviewGroupCell.MediaCell mediaCell4;
            PreviewGroupCell.MediaCell mediaCell5;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int size2 = this.groupCells.size();
            float f2 = 0.0f;
            int i5 = 0;
            float f3 = 0.0f;
            while (true) {
                if (i5 >= size2) {
                    previewGroupCell = null;
                    break;
                }
                previewGroupCell = (PreviewGroupCell) this.groupCells.get(i5);
                float fMeasure = previewGroupCell.measure();
                if (y >= f3 && y <= f3 + fMeasure) {
                    break;
                }
                f3 += fMeasure;
                i5++;
            }
            if (previewGroupCell == null) {
                mediaCell = null;
                break;
            }
            int size3 = previewGroupCell.media.size();
            int i6 = 0;
            while (true) {
                if (i6 < size3) {
                    mediaCell = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i6);
                    if (mediaCell != null && mediaCell.drawingRect().contains(x, y - f3)) {
                        break;
                    }
                    i6++;
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
                rectF.set(f4 - (rectFRect.width() / 2.0f), f5 - (rectFRect.height() / 2.0f), f4 + (rectFRect.width() / 2.0f), f5 + (rectFRect.height() / 2.0f));
                int i7 = 0;
                previewGroupCell2 = null;
                float f6 = 0.0f;
                float f7 = 0.0f;
                while (i7 < size2) {
                    PreviewGroupCell previewGroupCell3 = (PreviewGroupCell) this.groupCells.get(i7);
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
                    i7++;
                    f6 = fMeasure2;
                }
                if (previewGroupCell2 != null) {
                    int size4 = previewGroupCell2.media.size();
                    int i8 = 0;
                    mediaCell2 = null;
                    float f9 = 0.0f;
                    while (i8 < size4) {
                        PreviewGroupCell.MediaCell mediaCell6 = (PreviewGroupCell.MediaCell) previewGroupCell2.media.get(i8);
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
                                float fMin2 = ((Math.min(rectFDrawingRect.right, rectF.right) - Math.max(rectFDrawingRect.left, rectF.left)) * (Math.min(rectFDrawingRect.bottom, rectF.bottom) - Math.max(rectFDrawingRect.top, rectF.top))) / (rectF.width() * rectF.height());
                                if (fMin2 > 0.15f && fMin2 > f9) {
                                    mediaCell2 = mediaCell6;
                                    f9 = fMin2;
                                }
                            }
                        }
                        i8++;
                        f2 = 0.0f;
                    }
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
                action = motionEvent.getAction();
                if (action == 0 || ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null) {
                    if (action == 2 || ChatAttachAlertPhotoLayoutPreview.this.draggingCell == null || ChatAttachAlertPhotoLayoutPreview.this.draggingCellHiding) {
                        i = 1;
                        if (action != 1) {
                            if (action == i || ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null || (mediaCell3 = this.tapMediaCell) == null || this.tapGroupCell == null) {
                                i2 = 1;
                                z = false;
                            } else {
                                if (!mediaCell3.wasSpoiler || mediaCell3.spoilerRevealProgress != f) {
                                    RectF rectFDrawingRect2 = this.tapMediaCell.drawingRect();
                                    RectF rectF2 = AndroidUtilities.rectTmp;
                                    rectF2.set(rectFDrawingRect2.right - AndroidUtilities.dp(36.4f), this.tapGroupCell.top + rectFDrawingRect2.top, rectFDrawingRect2.right, this.tapGroupCell.top + rectFDrawingRect2.top + AndroidUtilities.dp(36.4f));
                                    if (rectF2.contains(x, y - this.tapMediaCell.groupCell.y)) {
                                        if (ChatAttachAlertPhotoLayoutPreview.this.getSelectedItemsCount() > 1) {
                                            final MediaController.PhotoEntry photoEntry = this.tapMediaCell.photoEntry;
                                            final int iIndexOf3 = this.tapGroupCell.group.photos.indexOf(photoEntry);
                                            if (iIndexOf3 >= 0) {
                                                saveDeletedImageId(photoEntry);
                                                final PreviewGroupCell previewGroupCell4 = this.tapGroupCell;
                                                previewGroupCell4.group.photos.remove(iIndexOf3);
                                                previewGroupCell4.setGroup(previewGroupCell4.group, true);
                                                updateGroups();
                                                toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
                                                final int i9 = this.undoViewId + 1;
                                                this.undoViewId = i9;
                                                ChatAttachAlertPhotoLayoutPreview.this.undoView.showWithAction(0L, 82, photoEntry, null, new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.$r8$lambda$g5hAEvblIRfBqrzeNY1sWy3_xc8(this.f$0, previewGroupCell4, photoEntry, iIndexOf3);
                                                    }
                                                });
                                                postDelayed(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.$r8$lambda$c7pGCRpTzDlczhScXtLh0bijKfc(this.f$0, i9);
                                                    }
                                                }, 4000L);
                                            }
                                            if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                                                ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
                                            }
                                        }
                                    } else {
                                        calcPhotoArrays();
                                        ArrayList photos = getPhotos();
                                        int iIndexOf4 = photos.indexOf(this.tapMediaCell.photoEntry);
                                        ChatAttachAlert chatAttachAlert = ChatAttachAlertPhotoLayoutPreview.this.parentAlert;
                                        if (chatAttachAlert.avatarPicker != 0) {
                                            i3 = 1;
                                        } else {
                                            BaseFragment baseFragment = chatAttachAlert.baseFragment;
                                            if (baseFragment instanceof ChatActivity) {
                                                chatActivity = (ChatActivity) baseFragment;
                                                i3 = 0;
                                            } else {
                                                i3 = 4;
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
                                            PhotoViewer.getInstance().openPhotoForSelect(new ArrayList(photos), iIndexOf4, i3, false, this.photoViewerProvider, chatActivity);
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
                                        PhotoViewer.getInstance().openPhotoForSelect(new ArrayList(photos), iIndexOf4, i3, false, this.photoViewerProvider, chatActivity);
                                        if (ChatAttachAlertPhotoLayoutPreview.this.photoLayout.captionForAllMedia()) {
                                            PhotoViewer.getInstance().setCaption(ChatAttachAlertPhotoLayoutPreview.this.parentAlert.getCommentView().getText());
                                        }
                                    }
                                    this.tapMediaCell = null;
                                    this.tapTime = 0L;
                                    ChatAttachAlertPhotoLayoutPreview.this.draggingCell = null;
                                    this.draggingT = 0.0f;
                                } else {
                                    this.tapMediaCell.startRevealMedia(motionEvent.getX(), motionEvent.getY());
                                }
                                i2 = 1;
                                z = true;
                            }
                        } else {
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
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= size) {
                                                    mediaCell4 = null;
                                                    break;
                                                }
                                                mediaCell5 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                                                if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                    mediaCell4 = mediaCell5;
                                                    break;
                                                }
                                                i4++;
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
                                i2 = 1;
                                z = false;
                            }
                            i2 = 1;
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
                        i2 = 1;
                    }
                } else {
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                    if (!chatAttachAlertPhotoLayoutPreview.listView.scrollingByUser && ((chatAttachAlertPhotoLayoutPreview.draggingAnimator == null || !ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.isRunning()) && previewGroupCell != null && mediaCell != null && previewGroupCell.group != null && previewGroupCell.group.photos.contains(mediaCell.photoEntry))) {
                        this.tapGroupCell = previewGroupCell;
                        this.tapMediaCell = mediaCell;
                        ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchX = x;
                        ChatAttachAlertPhotoLayoutPreview.this.draggingCellTouchY = y;
                        ChatAttachAlertPhotoLayoutPreview.this.draggingCell = null;
                        final long jElapsedRealtime = SystemClock.elapsedRealtime();
                        this.tapTime = jElapsedRealtime;
                        final PreviewGroupCell.MediaCell mediaCell7 = this.tapMediaCell;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.$r8$lambda$jkv7Pm0k0kp3it_Ta57rqKXTPfA(this.f$0, jElapsedRealtime, mediaCell7);
                            }
                        }, ViewConfiguration.getLongPressTimeout());
                        invalidate();
                    } else if (action == 2) {
                        i = 1;
                        if (action != 1) {
                            if (action == i) {
                            }
                            i2 = 1;
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
                                        i4 = 0;
                                        while (true) {
                                            if (i4 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i4++;
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
                            i2 = 1;
                            z = false;
                        }
                    } else {
                        i = 1;
                        if (action != 1) {
                            if (action == i) {
                            }
                            i2 = 1;
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
                                        i4 = 0;
                                        while (true) {
                                            if (i4 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i4++;
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
                            i2 = 1;
                            z = false;
                        }
                    }
                    i2 = 1;
                    z = true;
                }
                if (action != i2 || action == 3) {
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
            if (action == 0) {
                if (action == 2) {
                    i = 1;
                    if (action != 1) {
                        if (action == i) {
                        }
                        i2 = 1;
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
                                        i4 = 0;
                                        while (true) {
                                            if (i4 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i4++;
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
                            i2 = 1;
                            z = false;
                        }
                        i2 = 1;
                        z = true;
                    }
                } else {
                    i = 1;
                    if (action != 1) {
                        if (action == i) {
                        }
                        i2 = 1;
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
                                        i4 = 0;
                                        while (true) {
                                            if (i4 >= size) {
                                                mediaCell4 = null;
                                                break;
                                            }
                                            mediaCell5 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                                            if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                                mediaCell4 = mediaCell5;
                                                break;
                                            }
                                            i4++;
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
                            i2 = 1;
                            z = false;
                        }
                        i2 = 1;
                        z = true;
                    }
                }
            } else if (action == 2) {
                i = 1;
                if (action != 1) {
                    if (action == i) {
                    }
                    i2 = 1;
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
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= size) {
                                            mediaCell4 = null;
                                            break;
                                        }
                                        mediaCell5 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                                        if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                            mediaCell4 = mediaCell5;
                                            break;
                                        }
                                        i4++;
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
                        i2 = 1;
                        z = false;
                    }
                    i2 = 1;
                    z = true;
                }
            } else {
                i = 1;
                if (action != 1) {
                    if (action == i) {
                    }
                    i2 = 1;
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
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= size) {
                                            mediaCell4 = null;
                                            break;
                                        }
                                        mediaCell5 = (PreviewGroupCell.MediaCell) previewGroupCell.media.get(i4);
                                        if (mediaCell5.photoEntry == ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry) {
                                            mediaCell4 = mediaCell5;
                                            break;
                                        }
                                        i4++;
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
                        i2 = 1;
                        z = false;
                    }
                    i2 = 1;
                    z = true;
                }
            }
            if (action != i2) {
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

        public static void $r8$lambda$jkv7Pm0k0kp3it_Ta57rqKXTPfA(PreviewGroupsView previewGroupsView, long j, PreviewGroupCell.MediaCell mediaCell) {
            PreviewGroupCell.MediaCell mediaCell2;
            if (!ChatAttachAlertPhotoLayoutPreview.this.listView.scrollingByUser && previewGroupsView.tapTime == j && (mediaCell2 = previewGroupsView.tapMediaCell) == mediaCell) {
                previewGroupsView.startDragging(mediaCell2);
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

        public static void $r8$lambda$g5hAEvblIRfBqrzeNY1sWy3_xc8(PreviewGroupsView previewGroupsView, PreviewGroupCell previewGroupCell, MediaController.PhotoEntry photoEntry, int i) {
            if (ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator != null) {
                ChatAttachAlertPhotoLayoutPreview.this.draggingAnimator.cancel();
            }
            ChatAttachAlertPhotoLayoutPreview.this.draggingCell = null;
            previewGroupsView.draggingT = 0.0f;
            previewGroupsView.pushToGroup(previewGroupCell, photoEntry, i);
            previewGroupsView.updateGroups();
            previewGroupsView.toPhotoLayout(ChatAttachAlertPhotoLayoutPreview.this.photoLayout, false);
        }

        public static void $r8$lambda$c7pGCRpTzDlczhScXtLh0bijKfc(PreviewGroupsView previewGroupsView, int i) {
            if (i == previewGroupsView.undoViewId && ChatAttachAlertPhotoLayoutPreview.this.undoView.isShown()) {
                ChatAttachAlertPhotoLayoutPreview.this.undoView.hide(true, 1);
            }
        }

        private void pushToGroup(PreviewGroupCell previewGroupCell, MediaController.PhotoEntry photoEntry, int i) {
            previewGroupCell.group.photos.add(Math.min(previewGroupCell.group.photos.size(), i), photoEntry);
            if (previewGroupCell.group.photos.size() == 11) {
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) previewGroupCell.group.photos.get(10);
                previewGroupCell.group.photos.remove(10);
                int iIndexOf = this.groupCells.indexOf(previewGroupCell);
                if (iIndexOf >= 0) {
                    int i2 = iIndexOf + 1;
                    PreviewGroupCell previewGroupCell2 = i2 == this.groupCells.size() ? null : (PreviewGroupCell) this.groupCells.get(i2);
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
                PreviewGroupCell previewGroupCell = (PreviewGroupCell) this.groupCells.get(i);
                if (previewGroupCell.group.photos.size() < 10 && i < this.groupCells.size() - 1) {
                    int size2 = 10 - previewGroupCell.group.photos.size();
                    PreviewGroupCell previewGroupCell2 = (PreviewGroupCell) this.groupCells.get(i + 1);
                    ArrayList arrayList = new ArrayList();
                    int iMin = Math.min(size2, previewGroupCell2.group.photos.size());
                    for (int i2 = 0; i2 < iMin; i2++) {
                        arrayList.add((MediaController.PhotoEntry) previewGroupCell2.group.photos.remove(0));
                    }
                    previewGroupCell.group.photos.addAll(arrayList);
                    previewGroupCell.setGroup(previewGroupCell.group, true);
                    previewGroupCell2.setGroup(previewGroupCell2.group, true);
                }
            }
        }

        class PreviewGroupCell {
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
            public ArrayList media;
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

            private PreviewGroupCell() {
                this.y = 0.0f;
                this.indexStart = 0;
                this.updateDuration = 200L;
                this.lastMediaUpdate = 0L;
                this.groupWidth = 0.0f;
                this.groupHeight = 0.0f;
                this.previousGroupWidth = 0.0f;
                this.previousGroupHeight = 0.0f;
                this.media = new ArrayList();
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

            public void detach() {
                for (int i = 0; i < this.media.size(); i++) {
                    ((MediaCell) this.media.get(i)).detach();
                }
            }

            class MediaCell {
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

                public void detach() {
                    SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
                    if (spoilerEffect2 != null) {
                        spoilerEffect2.detach(PreviewGroupsView.this);
                        this.spoilerEffect = null;
                    }
                }

                public void setImage(final MediaController.PhotoEntry photoEntry) {
                    this.photoEntry = photoEntry;
                    if (photoEntry != null && photoEntry.isVideo) {
                        this.videoDurationText = AndroidUtilities.formatShortDuration(photoEntry.duration);
                    } else {
                        this.videoDurationText = null;
                    }
                    if (this.image == null) {
                        this.image = new ImageReceiver(PreviewGroupsView.this);
                        this.blurredImage = new ImageReceiver(PreviewGroupsView.this);
                        this.image.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                            @Override
                            public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell.$r8$lambda$TbhHdsXIdMHnlz4NjRb6hg04z5c(this.f$0, photoEntry, imageReceiver, z, z2, z3);
                            }

                            @Override
                            public void didSetImageBitmap(int i, String str, Drawable drawable) {
                                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
                            }

                            @Override
                            public void onAnimationReady(ImageReceiver imageReceiver) {
                                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
                            }
                        });
                    }
                    if (photoEntry != null) {
                        String str = photoEntry.thumbPath;
                        if (str != null) {
                            this.image.setImage(ImageLocation.getForPath(str), null, null, null, Theme.chat_attachEmptyDrawable, 0L, null, null, 0);
                            return;
                        }
                        if (photoEntry.path != null) {
                            if (photoEntry.isVideo) {
                                this.image.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, Theme.chat_attachEmptyDrawable, 0L, null, null, 0);
                                this.image.setAllowStartAnimation(true);
                                return;
                            }
                            this.image.setOrientation(photoEntry.orientation, true);
                            this.image.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, Theme.chat_attachEmptyDrawable, 0L, null, null, 0);
                            return;
                        }
                        this.image.setImageBitmap(Theme.chat_attachEmptyDrawable);
                    }
                }

                public static void $r8$lambda$TbhHdsXIdMHnlz4NjRb6hg04z5c(MediaCell mediaCell, MediaController.PhotoEntry photoEntry, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                    mediaCell.getClass();
                    if (z && !z2 && photoEntry != null && photoEntry.hasSpoiler && mediaCell.blurredImage.getBitmap() == null) {
                        if (mediaCell.blurredImage.getBitmap() != null && !mediaCell.blurredImage.getBitmap().isRecycled()) {
                            mediaCell.blurredImage.getBitmap().recycle();
                            mediaCell.blurredImage.setImageBitmap((Bitmap) null);
                        }
                        mediaCell.blurredImage.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
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
                        this.fromRect.set(rectF.centerX() - (((this.fromRect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width), rectF.centerY() - (((this.fromRect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height), rectF.centerX() + (((this.fromRect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width), rectF.centerY() + (((this.fromRect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height));
                    } else {
                        this.fromRect.set(rectF.centerX() - (((mediaCell.rect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width), rectF.centerY() - (((mediaCell.rect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height), rectF.centerX() + (((mediaCell.rect.width() / 2.0f) * mediaCell.groupCell.width) / PreviewGroupCell.this.width), rectF.centerY() + (((mediaCell.rect.height() / 2.0f) * mediaCell.groupCell.height) / PreviewGroupCell.this.height));
                    }
                    this.fromScale = AndroidUtilities.lerp(this.fromScale, this.scale, getT());
                    this.lastUpdate = SystemClock.elapsedRealtime();
                }

                public void layout(GroupCalculator groupCalculator, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z) {
                    if (groupCalculator == null || groupedMessagePosition == null) {
                        if (z) {
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
                        this.fromScale = 0.0f;
                        this.scale = 0.0f;
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

                public float getT() {
                    return PreviewGroupCell.this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastUpdate) / 200.0f));
                }

                public MediaCell clone() {
                    MediaCell mediaCell = PreviewGroupCell.this.new MediaCell();
                    mediaCell.rect.set(this.rect);
                    mediaCell.image = this.image;
                    mediaCell.photoEntry = this.photoEntry;
                    return mediaCell;
                }

                public RectF rect() {
                    return rect(getT());
                }

                public RectF rect(float f) {
                    if (this.rect != null && this.image != null) {
                        float fLerp = PreviewGroupCell.this.left + (this.rect.left * PreviewGroupCell.this.width);
                        float fLerp2 = PreviewGroupCell.this.top + (this.rect.top * PreviewGroupCell.this.height);
                        float fWidth = this.rect.width() * PreviewGroupCell.this.width;
                        float fHeight = this.rect.height() * PreviewGroupCell.this.height;
                        if (f < 1.0f && this.fromRect != null) {
                            fLerp = AndroidUtilities.lerp(PreviewGroupCell.this.left + (this.fromRect.left * PreviewGroupCell.this.width), fLerp, f);
                            fLerp2 = AndroidUtilities.lerp(PreviewGroupCell.this.top + (this.fromRect.top * PreviewGroupCell.this.height), fLerp2, f);
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
                    this.tempRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    return this.tempRect;
                }

                public RectF drawingRect() {
                    float f = 0.0f;
                    if (this.rect != null && this.image != null) {
                        if (ChatAttachAlertPhotoLayoutPreview.this.draggingCell != null && ChatAttachAlertPhotoLayoutPreview.this.draggingCell.photoEntry == this.photoEntry) {
                            f = PreviewGroupsView.this.draggingT;
                        }
                        float fLerp = AndroidUtilities.lerp(this.fromScale, this.scale, getT()) * (((1.0f - f) * 0.2f) + 0.8f);
                        RectF rectFRect = rect();
                        float f2 = 1.0f - fLerp;
                        float f3 = fLerp + 1.0f;
                        rectFRect.set(rectFRect.left + ((rectFRect.width() * f2) / 2.0f), rectFRect.top + ((rectFRect.height() * f2) / 2.0f), rectFRect.left + ((rectFRect.width() * f3) / 2.0f), rectFRect.top + ((rectFRect.height() * f3) / 2.0f));
                        return rectFRect;
                    }
                    this.tempRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    return this.tempRect;
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
                            float fMax = Math.max(fDp, ChatAttachAlertPhotoLayoutPreview.this.videoPlayImage.getIntrinsicHeight() + AndroidUtilities.dp(4.0f));
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
                        this.durationOut.set((int) f, (int) (f2 - (this.videoDurationBitmap.getHeight() * f3)), (int) (f + (this.videoDurationBitmap.getWidth() * f3)), (int) f2);
                        this.bitmapPaint.setAlpha((int) (f4 * 255.0f));
                        canvas.drawBitmap(this.videoDurationBitmap, this.durationIn, this.durationOut, this.bitmapPaint);
                    }
                }

                public void startRevealMedia(float f, float f2) {
                    this.spoilerRevealX = f;
                    this.spoilerRevealY = f2;
                    RectF rectFDrawingRect = drawingRect();
                    this.spoilerMaxRadius = (float) Math.sqrt(Math.pow(rectFDrawingRect.width(), 2.0d) + Math.pow(rectFDrawingRect.height(), 2.0d));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) MathUtils.clamp(this.spoilerMaxRadius * 0.3f, 250.0f, 550.0f));
                    duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell.$r8$lambda$3IZzTzLSKDvR27ES6V4JnyEWOQY(this.f$0, valueAnimator);
                        }
                    });
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

                public static void $r8$lambda$3IZzTzLSKDvR27ES6V4JnyEWOQY(MediaCell mediaCell, ValueAnimator valueAnimator) {
                    mediaCell.getClass();
                    mediaCell.spoilerRevealProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewGroupsView.this.invalidate();
                }

                public boolean draw(Canvas canvas) {
                    return draw(canvas, false);
                }

                public boolean draw(Canvas canvas, boolean z) {
                    return draw(canvas, getT(), z);
                }

                public boolean draw(Canvas canvas, float f, boolean z) {
                    char c;
                    char c2;
                    char c3;
                    char c4;
                    float f2;
                    String str;
                    Bitmap bitmap;
                    int iIndexOf;
                    float f3;
                    boolean z2;
                    float f4;
                    float f5;
                    char c5;
                    Path.Direction direction;
                    RectF rectF;
                    if (this.rect == null || this.image == null) {
                        return false;
                    }
                    float f6 = ChatAttachAlertPhotoLayoutPreview.this.draggingCell == this ? PreviewGroupsView.this.draggingT : 0.0f;
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
                    float fLerp6 = AndroidUtilities.lerp(fLerp2, fDp, f6);
                    float fLerp7 = AndroidUtilities.lerp(fLerp3, fDp, f6);
                    float fLerp8 = AndroidUtilities.lerp(fLerp4, fDp, f6);
                    float fLerp9 = AndroidUtilities.lerp(fLerp5, fDp, f6);
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
                    if (photoEntry != null) {
                        c = 6;
                        if (photoEntry.hasSpoiler && !photoEntry.isChatPreviewSpoilerRevealed) {
                            if (!this.wasSpoiler && this.blurredImage.getBitmap() == null && this.image.getBitmap() != null) {
                                this.wasSpoiler = true;
                                this.blurredImage.setImageBitmap(Utilities.stackBlurBitmapMax(this.image.getBitmap()));
                            } else {
                                if (!this.wasSpoiler && this.blurredImage.getBitmap() != null) {
                                    c5 = 1;
                                    this.wasSpoiler = true;
                                }
                                float[] fArr = this.radii;
                                fArr[c5] = fLerp6;
                                fArr[0] = fLerp6;
                                fArr[3] = fLerp7;
                                fArr[2] = fLerp7;
                                fArr[5] = fLerp8;
                                fArr[4] = fLerp8;
                                fArr[7] = fLerp9;
                                fArr[6] = fLerp9;
                                canvas.save();
                                this.path.rewind();
                                Path path = this.path;
                                float[] fArr2 = this.radii;
                                c2 = 7;
                                direction = Path.Direction.CW;
                                path.addRoundRect(rectFDrawingRect, fArr2, direction);
                                canvas.clipPath(this.path);
                                if (this.spoilerRevealProgress != 0.0f) {
                                    this.path.rewind();
                                    c3 = 4;
                                    c4 = 5;
                                    this.path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerMaxRadius * this.spoilerRevealProgress, direction);
                                    canvas.clipPath(this.path, Region.Op.DIFFERENCE);
                                } else {
                                    c3 = 4;
                                    c4 = 5;
                                }
                                this.blurredImage.setRoundRadius(i, i2, i3, i4);
                                this.blurredImage.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                                this.blurredImage.setAlpha(fLerp);
                                this.blurredImage.draw(canvas);
                                if (this.spoilerEffect == null) {
                                    this.spoilerEffect = SpoilerEffect2.getInstance(PreviewGroupsView.this);
                                }
                                SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
                                PreviewGroupsView previewGroupsView = PreviewGroupsView.this;
                                spoilerEffect2.draw(canvas, previewGroupsView, previewGroupsView.getWidth(), PreviewGroupsView.this.getHeight());
                                canvas.restore();
                                PreviewGroupsView.this.invalidate();
                                PreviewGroupsView.this.invalidate();
                            }
                            c5 = 1;
                            float[] fArr3 = this.radii;
                            fArr3[c5] = fLerp6;
                            fArr3[0] = fLerp6;
                            fArr3[3] = fLerp7;
                            fArr3[2] = fLerp7;
                            fArr3[5] = fLerp8;
                            fArr3[4] = fLerp8;
                            fArr3[7] = fLerp9;
                            fArr3[6] = fLerp9;
                            canvas.save();
                            this.path.rewind();
                            Path path2 = this.path;
                            float[] fArr4 = this.radii;
                            c2 = 7;
                            direction = Path.Direction.CW;
                            path2.addRoundRect(rectFDrawingRect, fArr4, direction);
                            canvas.clipPath(this.path);
                            if (this.spoilerRevealProgress != 0.0f) {
                                this.path.rewind();
                                c3 = 4;
                                c4 = 5;
                                this.path.addCircle(this.spoilerRevealX, this.spoilerRevealY, this.spoilerMaxRadius * this.spoilerRevealProgress, direction);
                                canvas.clipPath(this.path, Region.Op.DIFFERENCE);
                            } else {
                                c3 = 4;
                                c4 = 5;
                            }
                            this.blurredImage.setRoundRadius(i, i2, i3, i4);
                            this.blurredImage.setImageCoords(rectFDrawingRect.left, rectFDrawingRect.top, rectFDrawingRect.width(), rectFDrawingRect.height());
                            this.blurredImage.setAlpha(fLerp);
                            this.blurredImage.draw(canvas);
                            if (this.spoilerEffect == null) {
                                this.spoilerEffect = SpoilerEffect2.getInstance(PreviewGroupsView.this);
                            }
                            SpoilerEffect2 spoilerEffect3 = this.spoilerEffect;
                            PreviewGroupsView previewGroupsView2 = PreviewGroupsView.this;
                            spoilerEffect3.draw(canvas, previewGroupsView2, previewGroupsView2.getWidth(), PreviewGroupsView.this.getHeight());
                            canvas.restore();
                            PreviewGroupsView.this.invalidate();
                            PreviewGroupsView.this.invalidate();
                        }
                        f2 = this.spoilerCrossfadeProgress;
                        str = null;
                        if (f2 == 1.0f && this.spoilerCrossfadeBitmap != null) {
                            float[] fArr5 = this.radii;
                            fArr5[1] = fLerp6;
                            fArr5[0] = fLerp6;
                            fArr5[3] = fLerp7;
                            fArr5[2] = fLerp7;
                            fArr5[c4] = fLerp8;
                            fArr5[c3] = fLerp8;
                            fArr5[c2] = fLerp9;
                            fArr5[c] = fLerp9;
                            canvas.save();
                            this.path.rewind();
                            this.path.addRoundRect(rectFDrawingRect, this.radii, Path.Direction.CW);
                            canvas.clipPath(this.path);
                            float fMin = Math.min(1.0f, this.spoilerCrossfadeProgress + (Math.min(16L, SystemClock.elapsedRealtime() - this.lastUpdate) / 250.0f));
                            this.spoilerCrossfadeProgress = fMin;
                            this.spoilerCrossfadePaint.setAlpha((int) ((1.0f - fMin) * 255.0f));
                            canvas.drawBitmap(this.spoilerCrossfadeBitmap, rectFDrawingRect.left, rectFDrawingRect.top, this.spoilerCrossfadePaint);
                            canvas.restore();
                            PreviewGroupsView.this.invalidate();
                        } else if (f2 == 1.0f && (bitmap = this.spoilerCrossfadeBitmap) != null) {
                            bitmap.recycle();
                            this.spoilerCrossfadeBitmap = null;
                            PreviewGroupsView.this.invalidate();
                        }
                        PreviewGroupCell previewGroupCell = PreviewGroupCell.this;
                        iIndexOf = previewGroupCell.indexStart + previewGroupCell.group.photos.indexOf(this.photoEntry);
                        if (iIndexOf >= 0) {
                            str = (iIndexOf + 1) + "";
                        }
                        String str2 = str;
                        if (this.image.getVisible()) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (Math.abs(this.visibleT - f3) > 0.01f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            long jMin = Math.min(17L, SystemClock.elapsedRealtime() - this.lastVisibleTUpdate);
                            this.lastVisibleTUpdate = SystemClock.elapsedRealtime();
                            f4 = jMin / 100.0f;
                            f5 = this.visibleT;
                            if (f3 < f5) {
                                this.visibleT = Math.max(0.0f, f5 - f4);
                            } else {
                                this.visibleT = Math.min(1.0f, f5 + f4);
                            }
                        }
                        drawPhotoIndex(canvas, rectFDrawingRect.top + AndroidUtilities.dp(10.0f), rectFDrawingRect.right - AndroidUtilities.dp(10.0f), str2, fLerp, this.visibleT * fLerp);
                        drawDuration(canvas, rectFDrawingRect.left + AndroidUtilities.dp(4.0f), rectFDrawingRect.bottom - AndroidUtilities.dp(4.0f), this.videoDurationText, fLerp, fLerp * this.visibleT);
                        if (z) {
                            canvas.restore();
                        }
                        return f < 1.0f || z2;
                    }
                    c = 6;
                    c2 = 7;
                    c3 = 4;
                    c4 = 5;
                    f2 = this.spoilerCrossfadeProgress;
                    str = null;
                    if (f2 == 1.0f) {
                        if (f2 == 1.0f) {
                            bitmap.recycle();
                            this.spoilerCrossfadeBitmap = null;
                            PreviewGroupsView.this.invalidate();
                        }
                    } else if (f2 == 1.0f) {
                        bitmap.recycle();
                        this.spoilerCrossfadeBitmap = null;
                        PreviewGroupsView.this.invalidate();
                    }
                    PreviewGroupCell previewGroupCell2 = PreviewGroupCell.this;
                    iIndexOf = previewGroupCell2.indexStart + previewGroupCell2.group.photos.indexOf(this.photoEntry);
                    if (iIndexOf >= 0) {
                        str = (iIndexOf + 1) + "";
                    }
                    String str3 = str;
                    if (this.image.getVisible()) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (Math.abs(this.visibleT - f3) > 0.01f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        long jMin2 = Math.min(17L, SystemClock.elapsedRealtime() - this.lastVisibleTUpdate);
                        this.lastVisibleTUpdate = SystemClock.elapsedRealtime();
                        f4 = jMin2 / 100.0f;
                        f5 = this.visibleT;
                        if (f3 < f5) {
                            this.visibleT = Math.max(0.0f, f5 - f4);
                        } else {
                            this.visibleT = Math.min(1.0f, f5 + f4);
                        }
                    }
                    drawPhotoIndex(canvas, rectFDrawingRect.top + AndroidUtilities.dp(10.0f), rectFDrawingRect.right - AndroidUtilities.dp(10.0f), str3, fLerp, this.visibleT * fLerp);
                    drawDuration(canvas, rectFDrawingRect.left + AndroidUtilities.dp(4.0f), rectFDrawingRect.bottom - AndroidUtilities.dp(4.0f), this.videoDurationText, fLerp, fLerp * this.visibleT);
                    if (z) {
                        canvas.restore();
                    }
                    if (f < 1.0f) {
                        return true;
                    }
                }
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
                    MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) groupCalculator.positions.get(photoEntry);
                    long j3 = j2;
                    this.stars = Math.max(this.stars, photoEntry.starsAmount);
                    int size2 = this.media.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            mediaCell = null;
                            break;
                        }
                        mediaCell = (MediaCell) this.media.get(i3);
                        if (mediaCell.photoEntry == photoEntry) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (mediaCell != null) {
                        mediaCell.layout(groupCalculator, groupedMessagePosition, z);
                    } else {
                        MediaCell mediaCell2 = new MediaCell();
                        mediaCell2.setImage(photoEntry);
                        mediaCell2.layout(groupCalculator, groupedMessagePosition, z);
                        this.media.add(mediaCell2);
                    }
                    i2++;
                    j2 = j3;
                }
                long j4 = j2;
                int size3 = this.media.size();
                while (i < size3) {
                    MediaCell mediaCell3 = (MediaCell) this.media.get(i);
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

            public float getT() {
                return this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastMediaUpdate) / 200.0f));
            }

            public float measure() {
                Point point = AndroidUtilities.displaySize;
                return AndroidUtilities.lerp(this.previousGroupHeight, this.groupHeight, getT()) * Math.max(point.x, point.y) * 0.5f * ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale();
            }

            public boolean draw(Canvas canvas) {
                float f = 1.0f;
                float interpolation = this.interpolator.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.lastMediaUpdate) / 200.0f));
                boolean z = interpolation < 1.0f;
                Point point = AndroidUtilities.displaySize;
                float fMax = Math.max(point.x, point.y) * 0.5f;
                float fLerp = AndroidUtilities.lerp(this.previousGroupWidth, this.groupWidth, interpolation) * PreviewGroupsView.this.getWidth() * ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale();
                float fLerp2 = AndroidUtilities.lerp(this.previousGroupHeight, this.groupHeight, interpolation) * fMax * ChatAttachAlertPhotoLayoutPreview.this.getPreviewScale();
                if (this.messageBackground != null) {
                    this.top = 0.0f;
                    this.left = (PreviewGroupsView.this.getWidth() - Math.max(this.padding, fLerp)) / 2.0f;
                    this.right = (PreviewGroupsView.this.getWidth() + Math.max(this.padding, fLerp)) / 2.0f;
                    this.bottom = Math.max(this.padding * 2, fLerp2);
                    this.messageBackground.setTop(0, (int) fLerp, (int) fLerp2, 0, 0, 0, false, false);
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
                    MediaCell mediaCell = (MediaCell) this.media.get(i);
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
                    this.buttonText = new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f), 14.0f, AndroidUtilities.bold());
                }
                float fDp = AndroidUtilities.dp(28.0f) + this.buttonText.getCurrentWidth();
                float fDp2 = AndroidUtilities.dp(32.0f);
                RectF rectF = this.buttonTextRect;
                float f = this.left;
                float f2 = this.width;
                float f3 = this.top;
                float f4 = this.height;
                rectF.set(((f2 - fDp) / 2.0f) + f, ((f4 - fDp2) / 2.0f) + f3, f + ((f2 + fDp) / 2.0f), f3 + ((f4 + fDp2) / 2.0f));
                this.buttonTextBgPaint.setColor(1610612736);
                float f5 = fDp2 / 2.0f;
                canvas.drawRoundRect(this.buttonTextRect, f5, f5, this.buttonTextBgPaint);
                this.buttonText.draw(canvas, ((this.left + (this.width / 2.0f)) - (fDp / 2.0f)) + AndroidUtilities.dp(14.0f), this.top + (this.height / 2.0f), -1, 1.0f);
            }
        }
    }

    public Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : Theme.getThemeDrawable(str);
    }
}
