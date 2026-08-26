package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.HintView2;

public class ItemOptions {
    public ActionBarPopupWindow actionBarPopupWindow;
    private boolean allowCenter;
    private boolean allowMoveScrim;
    private int allowMoveScrimGravity;
    private boolean allowShowingOnTopOfKeyboard;
    private int animateToHeight;
    private int animateToWidth;
    private boolean blur;
    private boolean blurForMenu;
    private ViewGroup container;
    private Context context;
    private int dimAlpha;
    private ValueAnimator dimAnimator;
    private DimView dimView;
    private Runnable dismissListener;
    public boolean dismissWithButtons;
    private boolean dontDismiss;
    private boolean dontFocus;
    private boolean drawScrim;
    private int fixedWidthDp;
    private View.OnLayoutChangeListener followLayoutListener;
    private final int[] followLoc;
    private boolean followScrim;
    private ViewTreeObserver.OnScrollChangedListener followScrollListener;
    private View followingView;
    private boolean forceBottom;
    private boolean forceTop;
    private int foregroundIndex;
    private BaseFragment fragment;
    private Integer gapBackgroundColor;
    private int gravity;
    private boolean hideScrimUnder;
    private final int[] hoverLoc;
    private View.OnTouchListener hoverReleaseListener;
    private View hoveredItem;
    private Integer iconColor;
    private boolean ignoreX;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout lastLayout;
    private ViewGroup layout;
    private LinearLayout linearLayout;
    private boolean longPressSelectionEnabled;
    private int maxHeight;
    private int minWidthDp;
    public boolean needsFocus;
    private boolean offsetByContainer;
    private float offsetX;
    private float offsetY;
    public boolean onTopOfScrim;
    private boolean overridenSwipebackGravity;
    private final float[] point;
    private ViewGroup pointContainer;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean scaleOut;
    private BlurredBackgroundSourceBitmap scrimBlur3SourceBitmap;
    private View scrimView;
    private Drawable scrimViewBackground;
    private int scrimViewBackgroundShadowColor;
    private int scrimViewPadding;
    private int scrimViewRoundRadius;
    private Integer selectorColor;
    private int shiftDp;
    public boolean shownFromBottom;
    public boolean swipeback;
    private Integer textColor;
    private float translateX;
    private float translateY;
    public boolean useScrollView;
    private Rect viewAdditionalOffsets;

    public class DimView extends View {
        private Bitmap blurBitmap;
        private Paint blurPaint;
        private final RectF bounds;
        private final Bitmap cachedBitmap;
        private final Paint cachedBitmapPaint;
        public final float clipBottom;
        private final Path clipPath;
        public final float clipTop;
        private final int dim;
        public float dimProgress;
        private float moveToX;
        private float moveToY;

        public DimView(Context context) {
            float fMin;
            super(context);
            this.clipPath = new Path();
            this.bounds = new RectF();
            if (ItemOptions.this.scrimView == null || !(ItemOptions.this.scrimView.getParent() instanceof View)) {
                this.clipTop = 0.0f;
                this.clipBottom = 0.0f;
            } else {
                this.clipTop = ItemOptions.this.scrimView.getY() + ((View) ItemOptions.this.scrimView.getParent()).getY();
                if (ItemOptions.this.allowMoveScrim) {
                    fMin = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, ItemOptions.this.scrimView.getY() + ((View) ItemOptions.this.scrimView.getParent()).getY() + ItemOptions.this.scrimView.getHeight()));
                } else {
                    fMin = 0.0f;
                }
                this.clipBottom = fMin;
            }
            this.dim = ColorUtils.setAlphaComponent(0, ItemOptions.this.dimAlpha);
            if (ItemOptions.this.drawScrim && (ItemOptions.this.scrimView instanceof UserCell) && (ItemOptions.this.fragment instanceof ProfileActivity)) {
                this.cachedBitmapPaint = new Paint(3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ItemOptions.this.viewAdditionalOffsets.width() + ItemOptions.this.scrimView.getWidth(), ItemOptions.this.viewAdditionalOffsets.height() + ItemOptions.this.scrimView.getHeight(), Bitmap.Config.ARGB_8888);
                this.cachedBitmap = bitmapCreateBitmap;
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.translate(ItemOptions.this.viewAdditionalOffsets.left, ItemOptions.this.viewAdditionalOffsets.top);
                ItemOptions.this.scrimView.draw(canvas);
            } else {
                this.cachedBitmapPaint = null;
                this.cachedBitmap = null;
            }
            if (ItemOptions.this.blur || ItemOptions.this.blurForMenu) {
                this.blurPaint = new Paint(3);
                ItemOptions.this.scrimView.setAlpha(0.0f);
                ScrimOptions.makeGlobalBlurBitmaps(ItemOptions.this.pointContainer, new EmojiView$$ExternalSyntheticLambda18(this, 17));
            }
        }

        public void lambda$new$0(Bitmap bitmap, Bitmap bitmap2) {
            ItemOptions.this.scrimView.setAlpha(1.0f);
            if (ItemOptions.this.blur) {
                this.blurBitmap = bitmap;
            }
            if (ItemOptions.this.scrimBlur3SourceBitmap != null) {
                ItemOptions.this.scrimBlur3SourceBitmap.setBitmap(bitmap2);
                Blur3Utils.checkBitmapSourceMatrixScale(ItemOptions.this.scrimBlur3SourceBitmap, this);
                if (ItemOptions.this.layout != null) {
                    ItemOptions.this.layout.invalidate();
                }
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            float width;
            int height;
            Canvas canvas2;
            super.onDraw(canvas);
            if (this.blurBitmap != null) {
                canvas.save();
                float fMax = Math.max(getWidth() / this.blurBitmap.getWidth(), getHeight() / this.blurBitmap.getHeight());
                canvas.scale(fMax, fMax);
                this.blurPaint.setAlpha((int) (this.dimProgress * 255.0f));
                canvas.drawBitmap(this.blurBitmap, 0.0f, 0.0f, this.blurPaint);
                canvas.restore();
            } else {
                canvas.drawColor(Theme.multAlpha(this.dimProgress, this.dim));
            }
            if (ItemOptions.this.drawScrim) {
                if (this.cachedBitmap != null && (ItemOptions.this.scrimView.getParent() instanceof View)) {
                    canvas.save();
                    if (this.clipTop < 1.0f) {
                        canvas.clipRect(-ItemOptions.this.viewAdditionalOffsets.left, (((-ItemOptions.this.viewAdditionalOffsets.top) + ItemOptions.this.point[1]) - (this.clipTop * (ItemOptions.this.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, getMeasuredWidth() + ItemOptions.this.viewAdditionalOffsets.right, getMeasuredHeight() + ItemOptions.this.viewAdditionalOffsets.bottom);
                    }
                    if (ItemOptions.this.allowMoveScrim) {
                        ItemOptions.getPointOnScreen(ItemOptions.this.scrimView, ItemOptions.this.pointContainer, ItemOptions.this.point);
                        canvas.translate(AndroidUtilities.lerp(ItemOptions.this.point[0], this.moveToX, this.dimProgress), AndroidUtilities.lerp(ItemOptions.this.point[1], this.moveToY, this.dimProgress));
                    } else {
                        canvas.translate(ItemOptions.this.point[0], ItemOptions.this.point[1]);
                    }
                    if (ItemOptions.this.scrimViewBackground != null) {
                        if (ItemOptions.this.scrimViewBackground.getIntrinsicWidth() <= 0 || ItemOptions.this.scrimViewBackground.getIntrinsicHeight() <= 0) {
                            ItemOptions.this.scrimViewBackground.setBounds(-ItemOptions.this.viewAdditionalOffsets.left, -ItemOptions.this.viewAdditionalOffsets.top, ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right, ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom);
                        } else {
                            ItemOptions.this.scrimViewBackground.setBounds((((ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right) - ItemOptions.this.scrimViewBackground.getIntrinsicWidth()) / 2) + (-ItemOptions.this.viewAdditionalOffsets.left), (((ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom) - ItemOptions.this.scrimViewBackground.getIntrinsicHeight()) / 2) + (-ItemOptions.this.viewAdditionalOffsets.top), ((ItemOptions.this.scrimViewBackground.getIntrinsicWidth() + (ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right)) / 2) + (-ItemOptions.this.viewAdditionalOffsets.left), ((ItemOptions.this.scrimViewBackground.getIntrinsicHeight() + (ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom)) / 2) + (-ItemOptions.this.viewAdditionalOffsets.top));
                        }
                        ItemOptions.this.scrimViewBackground.draw(canvas);
                    }
                    if (ItemOptions.this.scrimViewPadding > 0 || ItemOptions.this.scrimViewRoundRadius > 0) {
                        this.clipPath.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((ItemOptions.this.scrimViewPadding * this.dimProgress) + (-ItemOptions.this.viewAdditionalOffsets.left), (getAlpha() * ItemOptions.this.scrimViewPadding) + (-ItemOptions.this.viewAdditionalOffsets.top), (this.cachedBitmap.getWidth() + (-ItemOptions.this.viewAdditionalOffsets.left)) - (getAlpha() * ItemOptions.this.scrimViewPadding), (this.cachedBitmap.getHeight() + (-ItemOptions.this.viewAdditionalOffsets.top)) - (getAlpha() * ItemOptions.this.scrimViewPadding));
                        this.clipPath.addRoundRect(rectF, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                    }
                    this.cachedBitmapPaint.setAlpha(255);
                    canvas.drawBitmap(this.cachedBitmap, -ItemOptions.this.viewAdditionalOffsets.left, -ItemOptions.this.viewAdditionalOffsets.top, this.cachedBitmapPaint);
                    canvas.restore();
                    return;
                }
                if (ItemOptions.this.scrimView != null && (ItemOptions.this.scrimView.getParent() instanceof View)) {
                    canvas.save();
                    if (this.clipTop < 1.0f || this.clipBottom != 0.0f) {
                        if (ItemOptions.this.allowMoveScrim) {
                            canvas.clipRect(-ItemOptions.this.viewAdditionalOffsets.left, AndroidUtilities.lerp((((-ItemOptions.this.viewAdditionalOffsets.top) + ItemOptions.this.point[1]) - (this.clipTop * (ItemOptions.this.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, 0.0f, this.dimProgress), getMeasuredWidth() + ItemOptions.this.viewAdditionalOffsets.right, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.dimProgress, this.clipBottom, getMeasuredHeight() + ItemOptions.this.viewAdditionalOffsets.bottom));
                        } else {
                            canvas.clipRect(-ItemOptions.this.viewAdditionalOffsets.left, (((-ItemOptions.this.viewAdditionalOffsets.top) + ItemOptions.this.point[1]) - (this.clipTop * (ItemOptions.this.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, getMeasuredWidth() + ItemOptions.this.viewAdditionalOffsets.right, getMeasuredHeight() + ItemOptions.this.viewAdditionalOffsets.bottom);
                        }
                    }
                    float f = this.dimProgress;
                    if (ItemOptions.this.allowMoveScrim) {
                        ItemOptions.getPointOnScreen(ItemOptions.this.scrimView, ItemOptions.this.pointContainer, ItemOptions.this.point);
                        canvas.translate(AndroidUtilities.lerp(ItemOptions.this.point[0], this.moveToX, f), AndroidUtilities.lerp(ItemOptions.this.point[1], this.moveToY, f));
                    } else {
                        canvas.translate(ItemOptions.this.point[0], ItemOptions.this.point[1]);
                    }
                    if (ItemOptions.this.animateToWidth == 0 || ItemOptions.this.animateToHeight == 0) {
                        width = ItemOptions.this.scrimView.getWidth();
                        height = ItemOptions.this.scrimView.getHeight();
                    } else {
                        width = AndroidUtilities.lerp(ItemOptions.this.scrimView.getWidth(), ItemOptions.this.animateToWidth, f);
                        height = AndroidUtilities.lerp(ItemOptions.this.scrimView.getHeight(), ItemOptions.this.animateToHeight, f);
                    }
                    float f2 = height;
                    float f3 = width;
                    if (ItemOptions.this.scrimViewBackground != null) {
                        if (ItemOptions.this.scrimViewBackground.getIntrinsicWidth() <= 0 || ItemOptions.this.scrimViewBackground.getIntrinsicHeight() <= 0) {
                            ItemOptions.this.scrimViewBackground.setBounds(-ItemOptions.this.viewAdditionalOffsets.left, -ItemOptions.this.viewAdditionalOffsets.top, ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right, ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom);
                        } else {
                            ItemOptions.this.scrimViewBackground.setBounds((((ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right) - ItemOptions.this.scrimViewBackground.getIntrinsicWidth()) / 2) + (-ItemOptions.this.viewAdditionalOffsets.left), (((ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom) - ItemOptions.this.scrimViewBackground.getIntrinsicHeight()) / 2) + (-ItemOptions.this.viewAdditionalOffsets.top), ((ItemOptions.this.scrimViewBackground.getIntrinsicWidth() + (ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right)) / 2) + (-ItemOptions.this.viewAdditionalOffsets.left), ((ItemOptions.this.scrimViewBackground.getIntrinsicHeight() + (ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom)) / 2) + (-ItemOptions.this.viewAdditionalOffsets.top));
                        }
                        ItemOptions.this.scrimViewBackground.setAlpha((int) (this.dimProgress * 255.0f));
                        if (Build.VERSION.SDK_INT >= 29 && (ItemOptions.this.scrimViewBackground instanceof ShapeDrawable)) {
                            Paint paint = ((ShapeDrawable) ItemOptions.this.scrimViewBackground).getPaint();
                            paint.setShadowLayer(paint.getShadowLayerRadius(), paint.getShadowLayerDx(), paint.getShadowLayerDy(), Theme.multAlpha(this.dimProgress, ItemOptions.this.scrimViewBackgroundShadowColor));
                        }
                        ItemOptions.this.scrimViewBackground.draw(canvas);
                    }
                    if (ItemOptions.this.scrimViewPadding > 0 || ItemOptions.this.scrimViewRoundRadius > 0) {
                        this.clipPath.rewind();
                        if (ItemOptions.this.scrimView instanceof ScrimView) {
                            ((ScrimView) ItemOptions.this.scrimView).getBounds(this.bounds);
                        } else {
                            this.bounds.set(0.0f, 0.0f, getWidth(), getHeight());
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set((ItemOptions.this.scrimViewPadding * this.dimProgress) + (-ItemOptions.this.viewAdditionalOffsets.left) + this.bounds.left, (ItemOptions.this.scrimViewPadding * this.dimProgress) + (-ItemOptions.this.viewAdditionalOffsets.top) + this.bounds.top, ((-ItemOptions.this.viewAdditionalOffsets.left) + this.bounds.right) - (ItemOptions.this.scrimViewPadding * this.dimProgress), ((-ItemOptions.this.viewAdditionalOffsets.top) + this.bounds.bottom) - (ItemOptions.this.scrimViewPadding * this.dimProgress));
                        this.clipPath.addRoundRect(rectF2, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                    }
                    if (!(ItemOptions.this.scrimView instanceof SharedPhotoVideoCell2)) {
                        canvas2 = canvas;
                        if (!(ItemOptions.this.scrimView instanceof GiftSheet.GiftCell) || ItemOptions.this.animateToWidth == 0 || ItemOptions.this.animateToHeight == 0) {
                            if (ItemOptions.this.allowMoveScrim) {
                                canvas2.saveLayerAlpha(0.0f, 0.0f, ItemOptions.this.scrimView.getWidth(), ItemOptions.this.scrimView.getHeight(), (int) (this.dimProgress * 255.0f), 31);
                            } else {
                                canvas2.save();
                            }
                            if (ItemOptions.this.scrimView instanceof ScrimView) {
                                ((ScrimView) ItemOptions.this.scrimView).drawScrim(canvas2, this.dimProgress);
                            } else {
                                canvas2.translate(-ItemOptions.this.scrimView.getScrollX(), -ItemOptions.this.scrimView.getScrollY());
                                ItemOptions.this.scrimView.draw(canvas2);
                            }
                            canvas2.restore();
                        } else if (ItemOptions.this.scrimView.getAlpha() >= 1.0f) {
                            ((GiftSheet.GiftCell) ItemOptions.this.scrimView).customDraw(this, canvas2, f3, f2, this.dimProgress);
                        } else {
                            canvas2.saveLayerAlpha(0.0f, 0.0f, f3, f2, (int) (this.dimProgress * 255.0f), 31);
                            canvas2 = canvas2;
                            float fLerp = AndroidUtilities.lerp(1.0f, 0.9f, this.dimProgress);
                            canvas2.scale(fLerp, fLerp, f3 / 2.0f, f2 / 2.0f);
                            ((GiftSheet.GiftCell) ItemOptions.this.scrimView).customDraw(this, canvas2, f3, f2, this.dimProgress);
                            canvas2.restore();
                        }
                    } else if (ItemOptions.this.scrimView.getAlpha() >= 1.0f) {
                        canvas2 = canvas;
                        ((SharedPhotoVideoCell2) ItemOptions.this.scrimView).customDraw(this, canvas2, f3, f2, this.dimProgress);
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, f3, f2, (int) (this.dimProgress * 255.0f), 31);
                        canvas2 = canvas;
                        float fLerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.dimProgress);
                        canvas2.scale(fLerp2, fLerp2, f3 / 2.0f, f2 / 2.0f);
                        ((SharedPhotoVideoCell2) ItemOptions.this.scrimView).customDraw(this, canvas2, f3, f2, this.dimProgress);
                        canvas2.restore();
                    }
                    canvas2.restore();
                }
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            Blur3Utils.checkBitmapSourceMatrixScale(ItemOptions.this.scrimBlur3SourceBitmap, this);
            if (ItemOptions.this.layout != null) {
                ItemOptions.this.layout.invalidate();
            }
        }

        public void setProgress(float f) {
            if (this.dimProgress == f) {
                return;
            }
            this.dimProgress = f;
            invalidate();
        }
    }

    public interface ScrimView {

        public abstract class CC {
            public static void $default$drawScrim(ScrimView scrimView, Canvas canvas, float f) {
                if (scrimView instanceof View) {
                    ((View) scrimView).draw(canvas);
                }
            }

            public static void $default$getBounds(ScrimView scrimView, RectF rectF) {
                if (scrimView instanceof View) {
                    View view = (View) scrimView;
                    rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
                }
            }
        }

        void drawScrim(Canvas canvas, float f);

        void getBounds(RectF rectF);
    }

    private ItemOptions(BaseFragment baseFragment, View view, boolean z, boolean z2, boolean z3) {
        this.gravity = 5;
        this.point = new float[2];
        this.drawScrim = true;
        this.longPressSelectionEnabled = true;
        this.viewAdditionalOffsets = new Rect();
        this.dismissWithButtons = true;
        this.shiftDp = -4;
        this.followLoc = new int[2];
        this.hoverLoc = new int[2];
        if (baseFragment.getContext() == null) {
            return;
        }
        BaseFragment baseFragmentDownFragment = downFragment(baseFragment);
        this.fragment = baseFragmentDownFragment;
        this.resourcesProvider = baseFragmentDownFragment.getResourceProvider();
        this.context = baseFragmentDownFragment.getContext();
        this.scrimView = view;
        this.dimAlpha = ((double) AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider))) > 0.705d ? 102 : 51;
        this.swipeback = z;
        this.useScrollView = z2;
        this.shownFromBottom = z3;
        init();
    }

    public static void addAlbumsItemOptions(ItemOptions itemOptions, StoriesController.StoriesCollections storiesCollections, final HashSet<Integer> hashSet, boolean z, Runnable runnable, final Utilities.Callback<StoriesController.StoryAlbum> callback) {
        ActionBarMenuSubItem actionBarMenuSubItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ScrollView scrollView = new ScrollView(itemOptions.getContext()) {
            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
            }
        };
        LinearLayout linearLayout = new LinearLayout(itemOptions.getContext());
        scrollView.addView(linearLayout);
        linearLayout.setOrientation(1);
        itemOptions.addView(scrollView, LayoutHelper.createLinear(-1, -2));
        if (z && runnable != null) {
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(2, itemOptions.getContext(), itemOptions.resourcesProvider, false, false);
            actionBarMenuSubItem2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i = Theme.key_actionBarDefaultSubmenuItem;
            actionBarMenuSubItem2.setColors(Theme.getColor(i, itemOptions.resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, itemOptions.resourcesProvider));
            actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i, itemOptions.resourcesProvider)));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add);
            actionBarMenuSubItem2.setOnClickListener(new ArchiveHelp$$ExternalSyntheticLambda0(5, runnable));
            linearLayout.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
        }
        ArrayList arrayList2 = storiesCollections.collections;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            final StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj;
            final int i3 = storyAlbum.album_id;
            final boolean zContains = hashSet.contains(Integer.valueOf(i3));
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(2, itemOptions.getContext(), itemOptions.resourcesProvider, false, false);
            actionBarMenuSubItem3.setChecked(zContains);
            actionBarMenuSubItem3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i4 = Theme.key_actionBarDefaultSubmenuItem;
            actionBarMenuSubItem3.setColors(Theme.getColor(i4, itemOptions.resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, itemOptions.resourcesProvider));
            actionBarMenuSubItem3.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i4, itemOptions.resourcesProvider)));
            TLRPC.Photo photo = storyAlbum.icon_photo;
            if (photo == null || (arrayList = photo.sizes) == null) {
                actionBarMenuSubItem = actionBarMenuSubItem3;
                actionBarMenuSubItem.setTextAndIcon(storyAlbum.title, R.drawable.msg_folders);
            } else {
                actionBarMenuSubItem3.setTextAndIcon(storyAlbum.title, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(storyAlbum.icon_photo.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), storyAlbum.icon_photo), "50_50", null, null);
                actionBarMenuSubItem = actionBarMenuSubItem3;
            }
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StoriesController.StoryAlbum storyAlbum2 = storyAlbum;
                    ItemOptions.lambda$addAlbumsItemOptions$21(zContains, hashSet, i3, callback, storyAlbum2, view);
                }
            });
            linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        }
    }

    private void cancelHover() {
        View view = this.hoveredItem;
        if (view != null) {
            view.setPressed(false);
            this.hoveredItem = null;
        }
    }

    public void clearHoverListener() {
        View view;
        cancelHover();
        if (this.hoverReleaseListener != null && (view = this.scrimView) != null) {
            view.setOnTouchListener(null);
        }
        this.hoverReleaseListener = null;
    }

    public void dismissDim(final ViewGroup viewGroup) {
        int i = 0;
        final DimView dimView = this.dimView;
        if (dimView == null) {
            return;
        }
        this.dimView = null;
        ValueAnimator valueAnimator = this.dimAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dimView.dimProgress, 0.0f);
        this.dimAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(dimView, i));
        this.dimAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                dimView.setProgress(0.0f);
                dimView.invalidate();
                AndroidUtilities.removeFromParent(dimView);
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(ItemOptions.this.preDrawListener);
                if (ItemOptions.this.hideScrimUnder) {
                    ItemOptions.this.scrimView.setVisibility(0);
                    if (ItemOptions.this.scrimView instanceof GiftSheet.GiftCell) {
                        GiftSheet.GiftCell giftCell = (GiftSheet.GiftCell) ItemOptions.this.scrimView;
                        giftCell.card.invalidate();
                        giftCell.card.invalidateDrawable(giftCell.cardBackground);
                    }
                }
            }
        });
        if (this.allowMoveScrim) {
            this.dimAnimator.setDuration(380L);
            this.dimAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else {
            this.dimAnimator.setDuration(150L);
        }
        this.dimAnimator.start();
    }

    private static BaseFragment downFragment(BaseFragment baseFragment) {
        INavigationLayout parentLayout;
        if ((((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).hasMainTabs) || (((baseFragment instanceof DialogsActivity) && ((DialogsActivity) baseFragment).hasMainTabs) || (((baseFragment instanceof ContactsActivity) && ((ContactsActivity) baseFragment).hasMainTabs) || ((baseFragment instanceof SettingsActivity) && ((SettingsActivity) baseFragment).hasMainTabs)))) && (parentLayout = baseFragment.getParentLayout()) != null) {
            BaseFragment safeLastFragment = ((ActionBarLayout) parentLayout).getSafeLastFragment();
            if (safeLastFragment instanceof MainTabsActivity) {
                return safeLastFragment;
            }
        }
        return baseFragment;
    }

    private static View findItemAt(View view, int i, int i2) {
        if (view != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int width = view.getWidth() + i3;
            int height = view.getHeight() + i4;
            if (i >= i3 && i < width && i2 >= i4 && i2 < height) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewFindItemAt = findItemAt(viewGroup.getChildAt(childCount), i, i2);
                        if (viewFindItemAt != null) {
                            return viewFindItemAt;
                        }
                    }
                }
                if (view.isClickable() && view.isEnabled() && !(view instanceof ActionBarPopupWindow.GapView)) {
                    return view;
                }
            }
        }
        return null;
    }

    public static void getPointOnScreen(View view, ViewGroup viewGroup, float[] fArr) {
        if (view == null || viewGroup == null) {
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        while (view != viewGroup) {
            float y = view.getY() + f;
            float x = view.getX() + f2;
            if ((view instanceof ScrollView) || (view instanceof HorizontalScrollView)) {
                x -= view.getScrollX();
                y -= view.getScrollY();
            }
            f2 = x;
            f = y;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            if (!(view instanceof ViewGroup)) {
                return;
            }
        }
        float paddingLeft = f2 - viewGroup.getPaddingLeft();
        float paddingTop = f - viewGroup.getPaddingTop();
        fArr[0] = paddingLeft;
        fArr[1] = paddingTop;
    }

    private void init() {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.context, R.drawable.popup_fixed_alert4, this.resourcesProvider, (this.swipeback ? 1 : 0) | (this.shownFromBottom ? 2 : 0) | (this.useScrollView ? 0 : 4)) {
            @Override
            public void onMeasure(int i, int i2) {
                if (this == ItemOptions.this.layout && ItemOptions.this.maxHeight > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(ItemOptions.this.maxHeight, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2));
                }
                super.onMeasure(i, i2);
            }
        };
        this.lastLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setDispatchKeyEventListener(new ItemOptions$$ExternalSyntheticLambda4(1, this));
        this.layout = this.lastLayout;
    }

    private void installFollowListeners() {
        removeFollowListeners();
        View view = this.scrimView;
        if (view == null) {
            return;
        }
        this.followingView = view;
        view.getLocationOnScreen(this.followLoc);
        this.followScrollListener = new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public final void onScrollChanged() {
                this.f$0.lambda$installFollowListeners$16();
            }
        };
        this.followingView.getViewTreeObserver().addOnScrollChangedListener(this.followScrollListener);
        ItemOptions$$ExternalSyntheticLambda19 itemOptions$$ExternalSyntheticLambda19 = new ItemOptions$$ExternalSyntheticLambda19(this, 0);
        this.followLayoutListener = itemOptions$$ExternalSyntheticLambda19;
        this.followingView.addOnLayoutChangeListener(itemOptions$$ExternalSyntheticLambda19);
    }

    private void installHoverReleaseListener() {
        View view = this.scrimView;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            this.scrimView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        WeakReference weakReference = new WeakReference(this);
        View view2 = this.scrimView;
        ItemOptions$$ExternalSyntheticLambda1 itemOptions$$ExternalSyntheticLambda1 = new ItemOptions$$ExternalSyntheticLambda1(weakReference, 0);
        this.hoverReleaseListener = itemOptions$$ExternalSyntheticLambda1;
        view2.setOnTouchListener(itemOptions$$ExternalSyntheticLambda1);
    }

    public void lambda$add$1(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    public void lambda$add$8(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    public void lambda$addAccount$7(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    public static void lambda$addAlbumsItemOptions$21(boolean z, HashSet hashSet, int i, Utilities.Callback callback, StoriesController.StoryAlbum storyAlbum, View view) {
        if (z) {
            hashSet.remove(Integer.valueOf(i));
        } else {
            hashSet.add(Integer.valueOf(i));
        }
        callback.run(storyAlbum);
    }

    public void lambda$addBot$4(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    public boolean lambda$addBot$5(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (!this.dismissWithButtons) {
            return true;
        }
        dismiss();
        return true;
    }

    public void lambda$addChat$6(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    public void lambda$addChecked$2(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    public boolean lambda$addChecked$3(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (!this.dismissWithButtons) {
            return true;
        }
        dismiss();
        return true;
    }

    public static void lambda$addFrom$11(ActionBar.ActionBarMenuOnItemClick actionBarMenuOnItemClick, int i) {
        if (actionBarMenuOnItemClick != null) {
            actionBarMenuOnItemClick.onItemClick(i);
        }
    }

    public void lambda$addProfile$12(Runnable runnable, View view) {
        dismiss();
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$addProfileCustom$13(Runnable runnable, View view) {
        dismiss();
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$addSpaceGap$10(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.actionBarPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            dismiss();
        }
    }

    public static void lambda$dismissDim$18(DimView dimView, ValueAnimator valueAnimator) {
        dimView.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$init$0(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.actionBarPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            dismiss();
        }
    }

    public void lambda$installFollowListeners$16() {
        ActionBarPopupWindow actionBarPopupWindow;
        if (this.followingView == null || (actionBarPopupWindow = this.actionBarPopupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        int[] iArr = new int[2];
        this.followingView.getLocationOnScreen(iArr);
        int i = iArr[0];
        int[] iArr2 = this.followLoc;
        if (i == iArr2[0] && iArr[1] == iArr2[1]) {
            return;
        }
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        reposition();
    }

    public void lambda$installFollowListeners$17(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (isShown()) {
            reposition();
        }
    }

    public static boolean lambda$installHoverReleaseListener$19(WeakReference weakReference, View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        ItemOptions itemOptions = (ItemOptions) weakReference.get();
        if (itemOptions == null || (actionBarPopupWindow = itemOptions.actionBarPopupWindow) == null || !actionBarPopupWindow.isShowing()) {
            view.setOnTouchListener(null);
            return false;
        }
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 2) {
            itemOptions.updateHover((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        } else if (actionMasked == 1) {
            itemOptions.releaseHover((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            view.setOnTouchListener(null);
            itemOptions.hoverReleaseListener = null;
        } else if (actionMasked == 3) {
            itemOptions.cancelHover();
            view.setOnTouchListener(null);
            itemOptions.hoverReleaseListener = null;
        }
        return true;
    }

    public void lambda$putPremiumLock$9(Runnable runnable, View view) {
        if (runnable != null) {
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(view, i);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            runnable.run();
        }
    }

    public static boolean lambda$show$14(DimView dimView) {
        dimView.invalidate();
        return true;
    }

    public void lambda$show$15(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        DimView dimView = this.dimView;
        if (dimView != null) {
            dimView.setProgress(fFloatValue);
        }
    }

    public static ItemOptions makeOptions(BaseFragment baseFragment, View view) {
        return new ItemOptions(baseFragment, view, false, true, false);
    }

    private void releaseHover(int i, int i2) {
        updateHover(i, i2);
        View view = this.hoveredItem;
        if (view != null) {
            this.hoveredItem = null;
            view.setPressed(false);
            view.performClick();
        }
    }

    public void removeFollowListeners() {
        View view = this.followingView;
        if (view != null) {
            if (this.followScrollListener != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.followScrollListener);
                }
            }
            View.OnLayoutChangeListener onLayoutChangeListener = this.followLayoutListener;
            if (onLayoutChangeListener != null) {
                this.followingView.removeOnLayoutChangeListener(onLayoutChangeListener);
            }
        }
        this.followScrollListener = null;
        this.followLayoutListener = null;
        this.followingView = null;
    }

    public static void setGapBackgroundColor(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.GapView) {
                ((ActionBarPopupWindow.GapView) childAt).setColor(i);
            } else if (childAt instanceof ViewGroup) {
                setGapBackgroundColor((ViewGroup) childAt, i);
            }
        }
    }

    public static ItemOptions swipeback(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, Theme.ResourcesProvider resourcesProvider) {
        return new ItemOptions(actionBarPopupWindowLayout, resourcesProvider);
    }

    private void updateHover(int i, int i2) {
        View viewFindItemAt = findItemAt(this.layout, i, i2);
        View view = this.hoveredItem;
        if (viewFindItemAt != view) {
            if (view != null) {
                view.setPressed(false);
            }
            this.hoveredItem = viewFindItemAt;
            if (viewFindItemAt != null) {
                viewFindItemAt.setPressed(true);
            }
        }
        View view2 = this.hoveredItem;
        if (view2 != null) {
            view2.getLocationOnScreen(this.hoverLoc);
            View view3 = this.hoveredItem;
            int[] iArr = this.hoverLoc;
            view3.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
        }
    }

    public ItemOptions add(CharSequence charSequence, Runnable runnable) {
        return add(0, charSequence, false, runnable);
    }

    public ItemOptions addAccount(int i, boolean z, Runnable runnable) {
        if (this.context == null) {
            return this;
        }
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        int i3 = Theme.key_actionBarDefaultSubmenuItemIcon;
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(UserObject.getUserName(currentUser));
        actionBarMenuSubItem.setClipToPadding(false);
        actionBarMenuSubItem.textView.setPadding((actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        BackupImageView backupImageView = new BackupImageView(this.context);
        backupImageView.getImageReceiver().setCurrentAccount(i);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(currentUser);
        backupImageView.setRoundRadius(AndroidUtilities.dp(34.0f));
        backupImageView.setForUserOrChat(currentUser, avatarDrawable);
        backupImageView.setScaleX(z ? 0.84f : 1.0f);
        backupImageView.setScaleY(z ? 0.84f : 1.0f);
        actionBarMenuSubItem.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        if (z) {
            View view = new View(this.context);
            view.setBackground(new Theme.AnonymousClass6(AndroidUtilities.dp(2.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), AndroidUtilities.dp(34.0f)));
            actionBarMenuSubItem.addView(view, LayoutHelper.createFrame(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i2, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num2 != null ? num2.intValue() : Theme.getColor(i3, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i2, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 7));
        int i4 = this.minWidthDp;
        if (i4 <= 0) {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
            return this;
        }
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        return this;
    }

    public ItemOptions addBot(TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable, Runnable runnable2) {
        if (this.context == null) {
            return this;
        }
        int i = Theme.key_actionBarDefaultSubmenuItemIcon;
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        CharSequence charSequenceApplyNewSpan = tL_attachMenuBot.side_menu_disclaimer_needed ? TextCell.applyNewSpan(tL_attachMenuBot.short_name) : tL_attachMenuBot.short_name;
        TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot);
        if (sideAttachMenuBotIcon != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, Theme.key_emptyListPlaceholder, 1.0f);
            if (svgThumb != null) {
                Integer num = this.iconColor;
                svgThumb.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
            actionBarMenuSubItem.setTextAndIcon(charSequenceApplyNewSpan, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot);
            actionBarMenuSubItem.setImageSize(24, 24);
        } else {
            actionBarMenuSubItem.setTextAndIcon(charSequenceApplyNewSpan, R.drawable.msg_bot);
        }
        Integer num2 = this.textColor;
        int iIntValue = num2 != null ? num2.intValue() : Theme.getColor(i2, this.resourcesProvider);
        Integer num3 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num3 != null ? num3.intValue() : Theme.getColor(i, this.resourcesProvider));
        Integer num4 = this.iconColor;
        actionBarMenuSubItem.setIconColorImage(num4 != null ? num4.intValue() : Theme.getColor(i, this.resourcesProvider));
        Integer num5 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num5 != null ? num5.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i2, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 1));
        actionBarMenuSubItem.setOnLongClickListener(new ItemOptions$$ExternalSyntheticLambda10(this, runnable2, 1));
        int i3 = this.minWidthDp;
        if (i3 <= 0) {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
            return this;
        }
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i3));
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        return this;
    }

    public ItemOptions addChat(TLObject tLObject, boolean z, Runnable runnable) {
        if (this.context == null) {
            return this;
        }
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            actionBarMenuSubItem.setText(chat == null ? "" : chat.title);
            actionBarMenuSubItem.setSubtext(ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.DiscussChannel) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase());
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            actionBarMenuSubItem.setText(UserObject.getUserName(user));
            if (user.id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                actionBarMenuSubItem.setSubtext(LocaleController.getString(R.string.VoipGroupPersonalAccount));
            } else if (UserObject.isBot(user)) {
                actionBarMenuSubItem.setSubtext(LocaleController.getString(R.string.Bot));
            }
        }
        actionBarMenuSubItem.setClipToPadding(false);
        actionBarMenuSubItem.textView.setPadding((actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        BackupImageView backupImageView = new BackupImageView(this.context);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        backupImageView.setRoundRadius(AndroidUtilities.dp(34.0f));
        backupImageView.setForUserOrChat(tLObject, avatarDrawable);
        backupImageView.setScaleX(z ? 0.84f : 1.0f);
        backupImageView.setScaleY(z ? 0.84f : 1.0f);
        actionBarMenuSubItem.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        if (z) {
            View view = new View(this.context);
            view.setBackground(new Theme.AnonymousClass6(AndroidUtilities.dp(2.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), AndroidUtilities.dp(34.0f)));
            actionBarMenuSubItem.addView(view, LayoutHelper.createFrame(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num2 != null ? num2.intValue() : Theme.getColor(i2, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 5));
        int i3 = this.minWidthDp;
        if (i3 <= 0) {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
            return this;
        }
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i3));
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        return this;
    }

    public ItemOptions addChecked(boolean z, CharSequence charSequence, Runnable runnable) {
        return addChecked(z, charSequence, runnable, (Runnable) null);
    }

    public ItemOptions addCheckedIf(boolean z, boolean z2, CharSequence charSequence, Runnable runnable) {
        return !z ? this : addChecked(z2, charSequence, runnable);
    }

    public ItemOptions addDialog(int i, long j, Runnable runnable) {
        int i2;
        TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(j);
        boolean z = userOrChat instanceof TLRPC.User;
        boolean z2 = (userOrChat instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) userOrChat);
        if (z) {
            i2 = R.string.ViewProfile;
        } else {
            i2 = z2 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile;
        }
        return addProfile(userOrChat, LocaleController.getString(i2), runnable);
    }

    public ItemOptions addFrom(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, ActionBar.ActionBarMenuOnItemClick actionBarMenuOnItemClick) {
        for (int i = 0; i < actionBarPopupWindowLayout.getItemsCount(); i++) {
            View itemAt = actionBarPopupWindowLayout.getItemAt(i);
            if (itemAt.getVisibility() == 0 && (itemAt instanceof ActionBarMenuSubItem)) {
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) itemAt;
                add(actionBarMenuSubItem.getIconResId(), actionBarMenuSubItem.getTextView().getText(), new EmojiView$$ExternalSyntheticLambda9(actionBarMenuOnItemClick, ((Integer) actionBarMenuSubItem.getTag()).intValue(), 10));
            }
        }
        return this;
    }

    public ItemOptions addGap() {
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(this.context, this.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
        gapView.setTag(R.id.fit_width_tag, 1);
        Integer num = this.gapBackgroundColor;
        if (num != null) {
            gapView.setColor(num.intValue());
        }
        addView(gapView, LayoutHelper.createLinear(-1, 8));
        return this;
    }

    public ItemOptions addGapIf(boolean z) {
        return !z ? this : addGap();
    }

    public ItemOptions addIf(boolean z, int i, CharSequence charSequence, boolean z2, Runnable runnable) {
        return !z ? this : add(i, charSequence, z2, runnable);
    }

    public ItemOptions addProfile(TLObject tLObject, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(this.context);
        frameLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 0, 12));
        BackupImageView backupImageView = new BackupImageView(this.context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(17.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        backupImageView.setForUserOrChat(tLObject, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(this.context);
        OKLCH.m(Theme.key_dialogTextBlack, this.resourcesProvider, textView, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(this.context);
        OKLCH.m(Theme.key_dialogTextGray2, this.resourcesProvider, textView2, 13.0f);
        textView2.setText(AndroidUtilities.replaceArrows(charSequence, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 0));
        addView(frameLayout, LayoutHelper.createLinear(-1, 52));
        return this;
    }

    public ItemOptions addProfileCustom(TLObject tLObject, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(this.context);
        frameLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 0, 12));
        BackupImageView backupImageView = new BackupImageView(this.context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(17.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        backupImageView.setForUserOrChat(tLObject, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, 51, 13.0f, 11.0f, 0.0f, 11.0f));
        TextView textView = new TextView(this.context);
        OKLCH.m(Theme.key_dialogTextBlack, this.resourcesProvider, textView, 14.0f);
        textView.setText(charSequence);
        textView.setMaxWidth(AndroidUtilities.dp(150.0f));
        textView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 8.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 2));
        addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    public ItemOptions addSpaceGap() {
        return addSpaceGap(true);
    }

    public ItemOptions addText(CharSequence charSequence, int i) {
        return addText(charSequence, i, -1);
    }

    public ItemOptions addView(View view) {
        if (view == null) {
            return this;
        }
        view.setTag(R.id.fit_width_tag, 1);
        addView(view, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    public ItemOptions allowCenter(boolean z) {
        this.allowCenter = z;
        return this;
    }

    public ItemOptions allowMoveScrim() {
        this.allowMoveScrim = true;
        return this;
    }

    public ItemOptions allowMoveScrimGravity(int i) {
        this.allowMoveScrimGravity = i;
        return this;
    }

    public ItemOptions allowShowingOnTopOfKeyboard() {
        this.allowShowingOnTopOfKeyboard = true;
        return this;
    }

    public ItemOptions animateToSize(int i, int i2) {
        this.animateToWidth = i;
        this.animateToHeight = i2;
        return this;
    }

    public void closeSwipeback() {
        dontDismiss();
        this.lastLayout.getSwipeBack().closeForeground();
    }

    public ItemOptions cutTextInFancyHalf() {
        if (this.context != null && this.lastLayout.getItemsCount() > 0) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
            View itemAt = actionBarPopupWindowLayout.getItemAt(actionBarPopupWindowLayout.getItemsCount() - 1);
            if (itemAt instanceof ActionBarMenuSubItem) {
                AnimatedEmojiSpan.TextViewEmojis textView = ((ActionBarMenuSubItem) itemAt).getTextView();
                textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
            }
        }
        return this;
    }

    public void dismiss() {
        if (this.dontDismiss) {
            this.dontDismiss = false;
            return;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            return;
        }
        Runnable runnable = this.dismissListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void dontDismiss() {
        this.dontDismiss = true;
    }

    public ItemOptions dontFocus() {
        this.dontFocus = true;
        return this;
    }

    public ItemOptions followScrimView() {
        this.followScrim = true;
        if (isShown()) {
            installFollowListeners();
        }
        return this;
    }

    public ItemOptions forceBottom(boolean z) {
        this.forceBottom = z;
        return this;
    }

    public ItemOptions forceTop(boolean z) {
        this.forceTop = z;
        return this;
    }

    public Context getContext() {
        return this.context;
    }

    public View getItemAt(int i) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        if (actionBarPopupWindowLayout == null && this.layout == null) {
            return null;
        }
        if (actionBarPopupWindowLayout == this.layout) {
            return actionBarPopupWindowLayout.getItemAt(i);
        }
        int i2 = 0;
        while (i2 < this.layout.getChildCount() - 1) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                View itemAt = actionBarPopupWindowLayout2.getItemAt(i);
                if (itemAt != null) {
                    return itemAt;
                }
                i -= actionBarPopupWindowLayout2.getItemsCount();
            }
            i2++;
        }
        return null;
    }

    public int getItemsCount() {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        int i = 0;
        if (actionBarPopupWindowLayout == null && this.layout == null) {
            return 0;
        }
        if (actionBarPopupWindowLayout == this.layout) {
            return actionBarPopupWindowLayout.getItemsCount();
        }
        int itemsCount = 0;
        while (i < this.layout.getChildCount() - 1) {
            View childAt = i == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                itemsCount = ((ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt).getItemsCount() + itemsCount;
            }
            i++;
        }
        return itemsCount;
    }

    public ActionBarMenuSubItem getLast() {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            LinearLayout linearLayout2 = this.linearLayout;
            View childAt = linearLayout2.getChildAt(linearLayout2.getChildCount() - 1);
            if (childAt instanceof ActionBarMenuSubItem) {
                return (ActionBarMenuSubItem) childAt;
            }
            return null;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        if (actionBarPopupWindowLayout == null || actionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.lastLayout;
        View itemAt = actionBarPopupWindowLayout2.getItemAt(actionBarPopupWindowLayout2.getItemsCount() - 1);
        if (itemAt instanceof ActionBarMenuSubItem) {
            return (ActionBarMenuSubItem) itemAt;
        }
        return null;
    }

    public View getLastView() {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            LinearLayout linearLayout2 = this.linearLayout;
            return linearLayout2.getChildAt(linearLayout2.getChildCount() - 1);
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        if (actionBarPopupWindowLayout == null || actionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.lastLayout;
        return actionBarPopupWindowLayout2.getItemAt(actionBarPopupWindowLayout2.getItemsCount() - 1);
    }

    public ViewGroup getLayout() {
        return this.layout;
    }

    public LinearLayout getLinearLayout() {
        return this.linearLayout;
    }

    public float getOffsetX() {
        return this.offsetX;
    }

    public float getOffsetY() {
        return this.offsetY;
    }

    public ItemOptions hideScrimUnder() {
        this.hideScrimUnder = true;
        return this;
    }

    public ItemOptions ignoreX() {
        this.ignoreX = true;
        return this;
    }

    public boolean isShown() {
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        return actionBarPopupWindow != null && actionBarPopupWindow.isShowing();
    }

    public ItemOptions makeMultiline(boolean z) {
        if (this.context != null && this.lastLayout.getItemsCount() > 0) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
            View itemAt = actionBarPopupWindowLayout.getItemAt(actionBarPopupWindowLayout.getItemsCount() - 1);
            if (itemAt instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) itemAt).setMultiline(z);
            }
        }
        return this;
    }

    public ItemOptions makeSwipeback() {
        ItemOptions itemOptions = new ItemOptions(this.lastLayout, this.resourcesProvider);
        itemOptions.foregroundIndex = this.lastLayout.addViewToSwipeBack(itemOptions.linearLayout);
        return itemOptions;
    }

    public ItemOptions needsFocus() {
        this.needsFocus = true;
        return this;
    }

    public ItemOptions offsetByContainer() {
        this.offsetByContainer = true;
        return this;
    }

    public void openSwipeback(ItemOptions itemOptions) {
        dontDismiss();
        this.lastLayout.getSwipeBack().openForeground(itemOptions.foregroundIndex);
    }

    public ItemOptions putCheck() {
        if (this.context != null && this.lastLayout.getItemsCount() > 0) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
            View itemAt = actionBarPopupWindowLayout.getItemAt(actionBarPopupWindowLayout.getItemsCount() - 1);
            if (itemAt instanceof ActionBarMenuSubItem) {
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) itemAt;
                actionBarMenuSubItem.setRightIcon(R.drawable.msg_text_check);
                actionBarMenuSubItem.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                actionBarMenuSubItem.getRightIcon().setScaleX(0.85f);
                actionBarMenuSubItem.getRightIcon().setScaleY(0.85f);
            }
        }
        return this;
    }

    public ItemOptions putPremiumLock(Runnable runnable) {
        if (runnable != null && this.context != null && this.lastLayout.getItemsCount() > 0) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
            View itemAt = actionBarPopupWindowLayout.getItemAt(actionBarPopupWindowLayout.getItemsCount() - 1);
            if (itemAt instanceof ActionBarMenuSubItem) {
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) itemAt;
                actionBarMenuSubItem.setRightIcon(R.drawable.msg_mini_lock3);
                actionBarMenuSubItem.getRightIcon().setAlpha(0.4f);
                actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 6));
            }
        }
        return this;
    }

    public void reposition() {
        View view;
        ViewGroup viewGroup;
        int i;
        int x;
        float fWidth;
        float measuredWidth;
        float y;
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing() || (view = this.scrimView) == null || (viewGroup = this.pointContainer) == null || this.layout == null || this.lastLayout == null) {
            return;
        }
        getPointOnScreen(view, viewGroup, this.point);
        float[] fArr = this.point;
        float f = fArr[1];
        float f2 = fArr[0];
        if (this.offsetByContainer) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            f2 += iArr[0];
            f += iArr[1];
        }
        RectF rectF = new RectF();
        View view2 = this.scrimView;
        if (view2 instanceof ScrimView) {
            ((ScrimView) view2).getBounds(rectF);
        } else {
            int i2 = this.animateToWidth;
            if (i2 == 0 || (i = this.animateToHeight) == 0) {
                rectF.set(0.0f, 0.0f, view2.getMeasuredWidth(), this.scrimView.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i2, i);
            }
        }
        float paddingLeft = f2 + rectF.left;
        float measuredHeight = f + rectF.top;
        if (this.ignoreX) {
            this.point[0] = 0.0f;
            paddingLeft = 0.0f;
        }
        this.layout.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
        RectF rectF2 = new RectF();
        Rect padding = this.lastLayout.getPadding();
        rectF2.set(padding.left, padding.top, this.layout.getMeasuredWidth() - padding.right, this.layout.getMeasuredHeight() - padding.bottom);
        if (AndroidUtilities.isTablet()) {
            measuredHeight += viewGroup.getPaddingTop();
            paddingLeft -= viewGroup.getPaddingLeft();
        }
        int i3 = this.gravity;
        if (i3 == 3) {
            x = (int) (viewGroup.getX() + paddingLeft);
        } else {
            if (i3 == 5) {
                fWidth = rectF.width() + viewGroup.getX() + paddingLeft;
                measuredWidth = rectF2.right;
            } else if (i3 == 1) {
                fWidth = (rectF.width() / 2.0f) + viewGroup.getX() + paddingLeft;
                measuredWidth = this.layout.getMeasuredWidth() / 2.0f;
            } else if (rectF2.width() + paddingLeft > viewGroup.getWidth()) {
                fWidth = rectF.width() + viewGroup.getX() + paddingLeft;
                measuredWidth = rectF2.right;
            } else {
                x = (int) ((viewGroup.getX() + paddingLeft) - rectF2.left);
            }
            x = (int) (fWidth - measuredWidth);
        }
        float fHeight = this.onTopOfScrim ? 0.0f : rectF.height();
        if (this.forceBottom) {
            y = viewGroup.getY() + (Math.min(measuredHeight + fHeight, AndroidUtilities.displaySize.y) - this.layout.getMeasuredHeight());
        } else {
            if (this.forceTop || measuredHeight + fHeight + this.layout.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                measuredHeight = (measuredHeight - fHeight) - this.layout.getMeasuredHeight();
                if (this.allowCenter && Math.max(0.0f, measuredHeight + fHeight) + this.layout.getMeasuredHeight() > this.point[1] + rectF.top && rectF.height() == this.scrimView.getHeight()) {
                    measuredHeight = (((viewGroup.getHeight() - this.layout.getMeasuredHeight()) / 2.0f) - fHeight) - viewGroup.getY();
                }
            }
            y = viewGroup.getY() + measuredHeight + fHeight;
        }
        int i4 = (int) y;
        float f3 = x + this.translateX;
        this.offsetX = f3;
        float f4 = i4 + this.translateY;
        this.offsetY = f4;
        this.actionBarPopupWindow.update((int) f3, (int) f4, -1, -1);
    }

    public ItemOptions setBackgroundColor(int i) {
        int i2 = 0;
        while (i2 < this.layout.getChildCount()) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i);
            }
            i2++;
        }
        return this;
    }

    public ItemOptions setBlur(boolean z, boolean z2) {
        this.blur = z;
        this.blurForMenu = z2;
        return this;
    }

    public ItemOptions setBlurBackground(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProvider blurredBackgroundProvider, boolean z) {
        ViewGroup viewGroup = this.layout;
        if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(viewGroup, null, z);
            blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProvider);
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
            blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
            viewGroup.setBackground(blurredBackgroundDrawableCreate);
        }
        return this;
    }

    public ItemOptions setBlurBackgroundForSwipeback(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProvider blurredBackgroundProvider, boolean z) {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(linearLayout, null, z);
            blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProvider);
            linearLayout.setBackground(blurredBackgroundDrawableCreate);
        }
        return this;
    }

    public ItemOptions setColors(int i, int i2) {
        this.textColor = Integer.valueOf(i);
        this.iconColor = Integer.valueOf(i2);
        int i3 = 0;
        while (i3 < this.layout.getChildCount()) {
            View childAt = i3 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                for (int i4 = 0; i4 < actionBarPopupWindowLayout.getItemsCount(); i4++) {
                    View itemAt = actionBarPopupWindowLayout.getItemAt(i4);
                    if (itemAt instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt).setColors(i, i2);
                    }
                }
            } else if (childAt instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) childAt).setColors(i, i2);
            }
            i3++;
        }
        return this;
    }

    public ItemOptions setDimAlpha(int i) {
        this.dimAlpha = i;
        return this;
    }

    public ItemOptions setDismissWithButtons(boolean z) {
        this.dismissWithButtons = z;
        return this;
    }

    public ItemOptions setDrawScrim(boolean z) {
        this.drawScrim = z;
        return this;
    }

    public ItemOptions setFixedWidth(int i) {
        this.fixedWidthDp = i;
        return this;
    }

    public ItemOptions setGravity(int i) {
        this.gravity = i;
        if (i == 5 && this.swipeback) {
            ViewGroup viewGroup = this.layout;
            if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow.ActionBarPopupWindowLayout) viewGroup).swipeBackGravityRight = true;
            }
        }
        return this;
    }

    public ItemOptions setLongPressSelectionEnabled(boolean z) {
        this.longPressSelectionEnabled = z;
        return this;
    }

    public ItemOptions setMaxHeight(int i) {
        this.maxHeight = i;
        return this;
    }

    public ItemOptions setMinWidth(int i) {
        this.minWidthDp = i;
        return this;
    }

    public ItemOptions setOnDismiss(Runnable runnable) {
        this.dismissListener = runnable;
        return this;
    }

    public ItemOptions setOnTopOfScrim() {
        this.onTopOfScrim = true;
        return this;
    }

    public ItemOptions setRoundRadius(int i) {
        return setRoundRadius(i, 0);
    }

    public ItemOptions setScaleOut(boolean z) {
        this.scaleOut = z;
        return this;
    }

    public ItemOptions setScrimView(View view) {
        this.scrimView = view;
        if (this.followScrim && isShown()) {
            installFollowListeners();
        }
        return this;
    }

    public ItemOptions setScrimViewBackground(Drawable drawable) {
        this.scrimViewBackground = drawable;
        this.scrimViewBackgroundShadowColor = 0;
        if ((drawable instanceof ShapeDrawable) && Build.VERSION.SDK_INT >= 29) {
            this.scrimViewBackgroundShadowColor = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
        }
        return this;
    }

    public ItemOptions setSelectorColor(int i) {
        this.selectorColor = Integer.valueOf(i);
        int i2 = 0;
        while (i2 < this.layout.getChildCount()) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                for (int i3 = 0; i3 < actionBarPopupWindowLayout.getItemsCount(); i3++) {
                    View itemAt = actionBarPopupWindowLayout.getItemAt(i3);
                    if (itemAt instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt).setSelectorColor(i);
                    }
                }
            } else if (childAt instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) childAt).setSelectorColor(i);
            }
            i2++;
        }
        return this;
    }

    public ItemOptions setSwipebackGravity(boolean z, boolean z2) {
        this.overridenSwipebackGravity = true;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        actionBarPopupWindowLayout.swipeBackGravityRight = z;
        actionBarPopupWindowLayout.swipeBackGravityBottom = z2;
        return this;
    }

    public void setTranslationY(float f) {
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.update((int) this.offsetX, (int) (this.offsetY + f), -1, -1);
        }
    }

    public ItemOptions setViewAdditionalOffsets(int i, int i2, int i3, int i4) {
        this.viewAdditionalOffsets.set(i, i2, i3, i4);
        return this;
    }

    public void setupSelectors() {
        if (this.layout == null) {
            return;
        }
        int i = 0;
        while (i < this.layout.getChildCount()) {
            View childAt = i == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                if (actionBarPopupWindowLayout.getItemsCount() > 0) {
                    View itemAt = actionBarPopupWindowLayout.getItemAt(0);
                    View itemAt2 = actionBarPopupWindowLayout.getItemAt(actionBarPopupWindowLayout.getItemsCount() - 1);
                    if (itemAt instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt).updateSelectorBackground(true, itemAt == itemAt2, 12);
                    } else if ((itemAt instanceof MessagePreviewView.ToggleButton) || (itemAt instanceof FrameLayout)) {
                        itemAt.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), 12, itemAt == itemAt2 ? 12 : 0));
                    } else if (itemAt != null && (itemAt.getBackground() instanceof RippleDrawable)) {
                        itemAt.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), 12, itemAt == itemAt2 ? 12 : 0));
                    }
                    if (itemAt2 instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt2).updateSelectorBackground(itemAt2 == itemAt, true, 12);
                    } else if ((itemAt2 instanceof MessagePreviewView.ToggleButton) || (itemAt2 instanceof FrameLayout)) {
                        itemAt2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), itemAt == itemAt2 ? 12 : 0, 12));
                    } else if (itemAt2 != null && (itemAt2.getBackground() instanceof RippleDrawable)) {
                        itemAt2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), itemAt == itemAt2 ? 12 : 0, 12));
                    }
                }
            }
            i++;
        }
    }

    public ItemOptions show() {
        float f;
        float f2;
        int i;
        int width;
        int iMax;
        int height;
        boolean z;
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource;
        float f3;
        float f4;
        BaseFragment baseFragment;
        DimView dimView;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        float x;
        float fWidth;
        float measuredWidth;
        DimView dimView2;
        int i2 = 0;
        if (this.actionBarPopupWindow == null && this.linearLayout == null && getItemsCount() > 0) {
            setupSelectors();
            if (this.fixedWidthDp > 0) {
                int i3 = 0;
                while (i3 < this.layout.getChildCount() - 1) {
                    View childAt = i3 == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i3);
                    if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                        for (int i4 = 0; i4 < actionBarPopupWindowLayout2.getItemsCount(); i4++) {
                            actionBarPopupWindowLayout2.getItemAt(i4).getLayoutParams().width = AndroidUtilities.dp(this.fixedWidthDp);
                        }
                    }
                    i3++;
                }
            } else if (this.minWidthDp > 0) {
                int i5 = 0;
                while (i5 < this.layout.getChildCount() - 1) {
                    View childAt2 = i5 == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i5);
                    if (childAt2 instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout3 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt2;
                        for (int i6 = 0; i6 < actionBarPopupWindowLayout3.getItemsCount(); i6++) {
                            actionBarPopupWindowLayout3.getItemAt(i6).setMinimumWidth(AndroidUtilities.dp(this.minWidthDp));
                        }
                    }
                    i5++;
                }
            }
            if ((this.blur || this.blurForMenu) && this.scrimBlur3SourceBitmap == null) {
                this.scrimBlur3SourceBitmap = new BlurredBackgroundSourceBitmap();
            }
            ViewGroup overlayContainerView = this.container;
            if (overlayContainerView == null) {
                overlayContainerView = ((ActionBarLayout) this.fragment.getParentLayout()).getOverlayContainerView();
            }
            final ViewGroup viewGroup = overlayContainerView;
            this.pointContainer = viewGroup;
            if (this.context != null && viewGroup != null) {
                float f5 = AndroidUtilities.displaySize.y / 2.0f;
                View view = this.scrimView;
                if (view != null) {
                    getPointOnScreen(view, viewGroup, this.point);
                    float[] fArr = this.point;
                    f = fArr[1];
                    f2 = fArr[0];
                    if (this.offsetByContainer) {
                        int[] iArr = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        f2 += iArr[0];
                        f += iArr[1];
                    }
                } else {
                    f = f5;
                    f2 = 0.0f;
                }
                RectF rectF = new RectF();
                View view2 = this.scrimView;
                if (view2 instanceof ScrimView) {
                    ((ScrimView) view2).getBounds(rectF);
                } else {
                    int i7 = this.animateToWidth;
                    if (i7 == 0 || (i = this.animateToHeight) == 0) {
                        rectF.set(0.0f, 0.0f, view2.getMeasuredWidth(), this.scrimView.getMeasuredHeight());
                    } else {
                        rectF.set(0.0f, 0.0f, i7, i);
                    }
                }
                float f6 = f2 + rectF.left;
                float measuredHeight = f + rectF.top;
                if (this.ignoreX) {
                    this.point[0] = 0.0f;
                    f6 = 0.0f;
                }
                if (this.dimAlpha > 0 || this.blur || this.blurForMenu) {
                    DimView dimView3 = new DimView(this.context);
                    this.dimView = dimView3;
                    this.preDrawListener = new ItemOptions$$ExternalSyntheticLambda16(dimView3, i2);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
                    viewGroup.addView(this.dimView, LayoutHelper.createFrame(-1, -1.0f));
                    this.dimView.setProgress(0.0f);
                    if (this.hideScrimUnder) {
                        this.scrimView.setVisibility(4);
                    }
                    ValueAnimator valueAnimator = this.dimAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.dimAnimator = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.dimAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 13));
                    this.dimAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ItemOptions.this.dimView != null) {
                                ItemOptions.this.dimView.setProgress(1.0f);
                                ItemOptions.this.dimView.invalidate();
                            }
                            ItemOptions.this.dimAnimator = null;
                        }
                    });
                    if (this.allowMoveScrim) {
                        this.dimAnimator.setDuration(380L);
                        this.dimAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    } else {
                        this.dimAnimator.setDuration(150L);
                    }
                    this.dimAnimator.start();
                }
                if (this.allowMoveScrim && (dimView2 = this.dimView) != null && this.animateToWidth != 0) {
                    dimView2.moveToX = (viewGroup.getWidth() - this.animateToWidth) / 2.0f;
                    if (this.allowMoveScrimGravity == 3) {
                        this.dimView.moveToX = AndroidUtilities.dp(36.0f);
                    }
                    f6 += this.dimView.moveToX + (-this.point[0]);
                }
                float paddingLeft = f6;
                this.layout.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE));
                RectF rectF2 = new RectF();
                Rect padding = this.lastLayout.getPadding();
                rectF2.set(padding.left, padding.top, this.layout.getMeasuredWidth() - padding.right, this.layout.getMeasuredHeight() - padding.bottom);
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(this.layout, -2, -2) {
                    @Override
                    public void dismiss() {
                        dismiss(true);
                        ItemOptions.this.dismissDim(viewGroup);
                        if (ItemOptions.this.dismissListener != null) {
                            ItemOptions.this.dismissListener.run();
                            ItemOptions.this.dismissListener = null;
                        }
                    }
                };
                this.actionBarPopupWindow = actionBarPopupWindow;
                actionBarPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        ItemOptions itemOptions = ItemOptions.this;
                        itemOptions.actionBarPopupWindow = null;
                        itemOptions.dismissDim(viewGroup);
                        ItemOptions.this.clearHoverListener();
                        ItemOptions.this.removeFollowListeners();
                        if (ItemOptions.this.dismissListener != null) {
                            ItemOptions.this.dismissListener.run();
                            ItemOptions.this.dismissListener = null;
                        }
                    }
                });
                this.actionBarPopupWindow.setOutsideTouchable(true);
                this.actionBarPopupWindow.setFocusable(!this.dontFocus);
                this.actionBarPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
                this.actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                if (this.allowShowingOnTopOfKeyboard) {
                    this.actionBarPopupWindow.setInputMethodMode(2);
                    this.actionBarPopupWindow.setSoftInputMode(0);
                } else if (this.dontFocus || this.needsFocus) {
                    this.actionBarPopupWindow.setInputMethodMode(1);
                    this.actionBarPopupWindow.setSoftInputMode(32);
                } else {
                    this.actionBarPopupWindow.setInputMethodMode(2);
                    this.actionBarPopupWindow.setSoftInputMode(0);
                }
                if (AndroidUtilities.isTablet()) {
                    measuredHeight += viewGroup.getPaddingTop();
                    paddingLeft -= viewGroup.getPaddingLeft();
                }
                if (this.scrimView != null) {
                    int i8 = this.gravity;
                    if (i8 == 3) {
                        x = viewGroup.getX() + paddingLeft;
                    } else {
                        if (i8 == 5) {
                            fWidth = rectF.width() + viewGroup.getX() + paddingLeft;
                            measuredWidth = rectF2.right;
                        } else if (i8 == 1) {
                            fWidth = (rectF.width() / 2.0f) + viewGroup.getX() + paddingLeft;
                            measuredWidth = this.layout.getMeasuredWidth() / 2.0f;
                        } else if (rectF2.width() + paddingLeft > viewGroup.getWidth()) {
                            fWidth = rectF.width() + viewGroup.getX() + paddingLeft;
                            measuredWidth = rectF2.right;
                        } else {
                            x = (viewGroup.getX() + paddingLeft) - rectF2.left;
                        }
                        width = (int) (fWidth - measuredWidth);
                    }
                    width = (int) x;
                } else {
                    width = (viewGroup.getWidth() - this.layout.getMeasuredWidth()) / 2;
                }
                if (this.allowShowingOnTopOfKeyboard) {
                    iMax = 0;
                } else {
                    Rect rect = new Rect();
                    View rootView = viewGroup.getRootView();
                    viewGroup.getWindowVisibleDisplayFrame(rect);
                    iMax = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
                }
                int i9 = (AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) - iMax;
                float fHeight = this.onTopOfScrim ? 0.0f : rectF.height();
                if (this.forceBottom) {
                    float f7 = measuredHeight + fHeight;
                    height = this.allowMoveScrim ? (int) f7 : (int) (viewGroup.getY() + (Math.min(f7, i9) - this.layout.getMeasuredHeight()));
                } else {
                    if (this.scrimView != null) {
                        if (this.forceTop || measuredHeight + fHeight + this.layout.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > i9) {
                            measuredHeight = (measuredHeight - fHeight) - this.layout.getMeasuredHeight();
                            if (this.allowCenter && Math.max(0.0f, measuredHeight + fHeight) + this.layout.getMeasuredHeight() > this.point[1] + rectF.top && rectF.height() == this.scrimView.getHeight()) {
                                measuredHeight = (((viewGroup.getHeight() - this.layout.getMeasuredHeight()) / 2.0f) - fHeight) - viewGroup.getY();
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        height = (int) (viewGroup.getY() + measuredHeight + fHeight);
                    } else {
                        height = (viewGroup.getHeight() - this.layout.getMeasuredHeight()) / 2;
                    }
                    if (this.swipeback && z && !this.overridenSwipebackGravity && (actionBarPopupWindowLayout = this.lastLayout) != null) {
                        actionBarPopupWindowLayout.swipeBackGravityBottom = true;
                    }
                    if (this.allowMoveScrim && (dimView = this.dimView) != null) {
                        dimView.moveToY = (viewGroup.getHeight() - (this.layout.getMeasuredHeight() + rectF.bottom)) / 2.0f;
                        height = (int) (this.dimView.moveToY + rectF.bottom);
                        width = (int) (((this.dimView.moveToX + rectF.right) - this.layout.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                        if (this.allowMoveScrimGravity == 3) {
                            width = (int) (this.dimView.moveToX - AndroidUtilities.dp(8.0f));
                        }
                    }
                    if (!this.longPressSelectionEnabled) {
                        baseFragment = this.fragment;
                        if (baseFragment == null && baseFragment.getFragmentView() != null) {
                            this.fragment.getFragmentView().getRootView().dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        } else if (this.container != null) {
                            viewGroup.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        }
                    }
                    if (this.blurForMenu && this.scrimBlur3SourceBitmap != null) {
                        setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
                        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = this.scrimBlur3SourceBitmap;
                        blurredBackgroundSourceBitmap.getClass();
                        blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceBitmap);
                        blurredBackgroundDrawableSource.setColorProvider(null);
                        blurredBackgroundDrawableSource.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider));
                        blurredBackgroundDrawableSource.setPadding(AndroidUtilities.dp(8.0f));
                        blurredBackgroundDrawableSource.boundProps.hasPadding = true;
                        blurredBackgroundDrawableSource.setRadius(AndroidUtilities.dp(12.0f));
                        f3 = width + this.translateX;
                        f4 = height + this.translateY;
                        if (blurredBackgroundDrawableSource.sourceOffsetX == f3 || blurredBackgroundDrawableSource.sourceOffsetY != f4) {
                            blurredBackgroundDrawableSource.sourceOffsetX = f3;
                            blurredBackgroundDrawableSource.sourceOffsetY = f4;
                            blurredBackgroundDrawableSource.dispatchSourceRelativePositionChange();
                        }
                        this.layout.setBackground(blurredBackgroundDrawableSource);
                    }
                    this.actionBarPopupWindow.setScaleOut(this.scaleOut);
                    ActionBarPopupWindow actionBarPopupWindow2 = this.actionBarPopupWindow;
                    float f8 = width + this.translateX;
                    this.offsetX = f8;
                    float f9 = height + this.translateY;
                    this.offsetY = f9;
                    actionBarPopupWindow2.showAtLocation(viewGroup, 0, (int) f8, (int) f9);
                    if (this.longPressSelectionEnabled) {
                        installHoverReleaseListener();
                    }
                    if (this.followScrim) {
                        installFollowListeners();
                    }
                }
                z = false;
                if (this.swipeback) {
                    actionBarPopupWindowLayout.swipeBackGravityBottom = true;
                }
                if (this.allowMoveScrim) {
                    dimView.moveToY = (viewGroup.getHeight() - (this.layout.getMeasuredHeight() + rectF.bottom)) / 2.0f;
                    height = (int) (this.dimView.moveToY + rectF.bottom);
                    width = (int) (((this.dimView.moveToX + rectF.right) - this.layout.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                    if (this.allowMoveScrimGravity == 3) {
                        width = (int) (this.dimView.moveToX - AndroidUtilities.dp(8.0f));
                    }
                }
                if (!this.longPressSelectionEnabled) {
                    baseFragment = this.fragment;
                    if (baseFragment == null) {
                        if (this.container != null) {
                            viewGroup.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        }
                    } else if (this.container != null) {
                        viewGroup.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    }
                }
                if (this.blurForMenu) {
                    setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
                    BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap2 = this.scrimBlur3SourceBitmap;
                    blurredBackgroundSourceBitmap2.getClass();
                    blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceBitmap2);
                    blurredBackgroundDrawableSource.setColorProvider(null);
                    blurredBackgroundDrawableSource.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider));
                    blurredBackgroundDrawableSource.setPadding(AndroidUtilities.dp(8.0f));
                    blurredBackgroundDrawableSource.boundProps.hasPadding = true;
                    blurredBackgroundDrawableSource.setRadius(AndroidUtilities.dp(12.0f));
                    f3 = width + this.translateX;
                    f4 = height + this.translateY;
                    if (blurredBackgroundDrawableSource.sourceOffsetX == f3) {
                        blurredBackgroundDrawableSource.sourceOffsetX = f3;
                        blurredBackgroundDrawableSource.sourceOffsetY = f4;
                        blurredBackgroundDrawableSource.dispatchSourceRelativePositionChange();
                    } else {
                        blurredBackgroundDrawableSource.sourceOffsetX = f3;
                        blurredBackgroundDrawableSource.sourceOffsetY = f4;
                        blurredBackgroundDrawableSource.dispatchSourceRelativePositionChange();
                    }
                    this.layout.setBackground(blurredBackgroundDrawableSource);
                }
                this.actionBarPopupWindow.setScaleOut(this.scaleOut);
                ActionBarPopupWindow actionBarPopupWindow3 = this.actionBarPopupWindow;
                float f10 = width + this.translateX;
                this.offsetX = f10;
                float f11 = height + this.translateY;
                this.offsetY = f11;
                actionBarPopupWindow3.showAtLocation(viewGroup, 0, (int) f10, (int) f11);
                if (this.longPressSelectionEnabled) {
                    installHoverReleaseListener();
                }
                if (this.followScrim) {
                    installFollowListeners();
                }
            }
        }
        return this;
    }

    public ItemOptions translate(float f, float f2) {
        this.translateX += f;
        this.translateY += f2;
        return this;
    }

    public void updateColors() {
    }

    public static ItemOptions makeOptions(BaseFragment baseFragment, View view, boolean z) {
        return new ItemOptions(baseFragment, view, z, true, false);
    }

    public ItemOptions add(int i, CharSequence charSequence, Runnable runnable) {
        return add(i, charSequence, false, runnable);
    }

    public ItemOptions addChecked(boolean z, int i, CharSequence charSequence, Runnable runnable) {
        return addChecked(z, i, charSequence, runnable, null);
    }

    public ItemOptions addCheckedIf(boolean z, boolean z2, CharSequence charSequence, Runnable runnable, Runnable runnable2) {
        return !z ? this : addChecked(z2, charSequence, runnable, runnable2);
    }

    public ItemOptions addIf(boolean z, int i, CharSequence charSequence, Runnable runnable) {
        return !z ? this : add(i, charSequence, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public ItemOptions addSpaceGap(boolean z) {
        if (!(this.layout instanceof LinearLayout)) {
            LinearLayout linearLayout = new LinearLayout(this.context);
            this.layout = linearLayout;
            linearLayout.setOrientation(z ? 1 : 0);
            ViewGroup viewGroup = this.layout;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
            int i = this.maxHeight;
            viewGroup.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1.0f, i > 0 ? i / AndroidUtilities.density : -2.0f, 48));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.context, R.drawable.popup_fixed_alert4, this.resourcesProvider, !z ? 4 : 0);
        this.lastLayout = actionBarPopupWindowLayout2;
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ItemOptions$$ExternalSyntheticLambda4(0, this));
        this.layout.addView(this.lastLayout, LayoutHelper.createLinear(-1, -2, 48, !z ? -8 : 0, z ? -8 : 0, 0, 0));
        return this;
    }

    public ItemOptions addText(CharSequence charSequence, int i, int i2) {
        return addText(charSequence, i, null, i2);
    }

    public ItemOptions setRoundRadius(int i, int i2) {
        this.scrimViewRoundRadius = i;
        this.scrimViewPadding = i2;
        return this;
    }

    public static ItemOptions makeOptions(BaseFragment baseFragment, View view, boolean z, boolean z2) {
        return new ItemOptions(baseFragment, view, z, !z2, false);
    }

    public ItemOptions add(Drawable drawable, CharSequence charSequence, Runnable runnable) {
        return add(0, drawable, charSequence, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public ItemOptions addChecked(boolean z, Drawable drawable, CharSequence charSequence, Runnable runnable) {
        return addChecked(z, 0, drawable, charSequence, runnable, null);
    }

    public ItemOptions addIf(boolean z, int i, Drawable drawable, CharSequence charSequence, Runnable runnable) {
        return !z ? this : add(i, drawable, charSequence, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public ItemOptions addText(CharSequence charSequence, int i, Typeface typeface, int i2) {
        TextView textView = new TextView(this.context) {
            @Override
            public void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
            }
        };
        textView.setTextSize(1, i);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setTypeface(typeface);
        NotificationCenter.listenEmojiLoading(textView);
        if (i2 > 0) {
            textView.setMaxWidth(i2);
        }
        addView(textView, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    public ItemOptions addView(View view, LinearLayout.LayoutParams layoutParams) {
        if (view == null) {
            return this;
        }
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.addView(view, layoutParams);
            return this;
        }
        this.lastLayout.addView(view, layoutParams);
        return this;
    }

    public ItemOptions setBlur(boolean z) {
        this.blur = z;
        this.blurForMenu = z;
        return this;
    }

    public static ItemOptions makeOptions(BaseFragment baseFragment, View view, boolean z, boolean z2, boolean z3) {
        return new ItemOptions(baseFragment, view, z, !z2, z3);
    }

    public ItemOptions add(int i, CharSequence charSequence, boolean z, Runnable runnable) {
        return add(i, charSequence, z ? Theme.key_text_RedRegular : Theme.key_actionBarDefaultSubmenuItemIcon, z ? Theme.key_text_RedRegular : Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public ItemOptions addChecked(boolean z, CharSequence charSequence, Runnable runnable, Runnable runnable2) {
        return addChecked(z, 0, charSequence, runnable, runnable2);
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, View view) {
        return makeOptions(viewGroup, (Theme.ResourcesProvider) null, view);
    }

    public ItemOptions add(int i, CharSequence charSequence, int i2, Runnable runnable) {
        return add(i, charSequence, i2, i2, runnable);
    }

    public ItemOptions addChecked(boolean z, int i, CharSequence charSequence, Runnable runnable, Runnable runnable2) {
        return addChecked(z, i, null, charSequence, runnable, runnable2);
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view) {
        return new ItemOptions(viewGroup, resourcesProvider, view, false, false);
    }

    public ItemOptions add(int i, CharSequence charSequence, int i2, int i3, Runnable runnable) {
        return add(i, null, charSequence, i2, i3, runnable);
    }

    public ItemOptions addChecked(boolean z, int i, Drawable drawable, CharSequence charSequence, Runnable runnable, Runnable runnable2) {
        if (this.context == null) {
            return this;
        }
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        int i3 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((i == 0 && drawable == null) ? 1 : 2, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (drawable != null) {
            actionBarMenuSubItem.setTextAndIcon(charSequence, 0, drawable);
        } else if (i != 0) {
            actionBarMenuSubItem.setTextAndIcon(charSequence, i);
        } else {
            actionBarMenuSubItem.setText(charSequence);
        }
        actionBarMenuSubItem.setChecked(z);
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i2, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num2 != null ? num2.intValue() : Theme.getColor(i3, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i2, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 8));
        if (runnable2 != null) {
            actionBarMenuSubItem.setOnLongClickListener(new ItemOptions$$ExternalSyntheticLambda10(this, runnable2, 0));
        }
        int i4 = this.minWidthDp;
        if (i4 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
            return this;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z) {
        return new ItemOptions(viewGroup, resourcesProvider, view, z, false);
    }

    public ItemOptions add(int i, Drawable drawable, CharSequence charSequence, int i2, int i3, Runnable runnable) {
        if (this.context == null) {
            return this;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i == 0 && drawable == null) {
            actionBarMenuSubItem.setText(charSequence);
        } else {
            actionBarMenuSubItem.setTextAndIcon(charSequence, i, drawable);
        }
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i3, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num2 != null ? num2.intValue() : Theme.getColor(i2, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i3, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 4));
        int i4 = this.minWidthDp;
        if (i4 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
            return this;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    public ItemOptions setGapBackgroundColor(int i) {
        this.gapBackgroundColor = Integer.valueOf(i);
        if (this.layout != null) {
            int i2 = 0;
            while (i2 < this.layout.getChildCount()) {
                View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
                if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                    for (int i3 = 0; i3 < actionBarPopupWindowLayout.getItemsCount(); i3++) {
                        View itemAt = actionBarPopupWindowLayout.getItemAt(i3);
                        if (itemAt instanceof ActionBarPopupWindow.GapView) {
                            ((ActionBarPopupWindow.GapView) itemAt).setColor(i);
                        }
                    }
                } else if (childAt instanceof ActionBarPopupWindow.GapView) {
                    ((ActionBarPopupWindow.GapView) childAt).setColor(i);
                }
                i2++;
            }
        }
        return this;
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z, boolean z2) {
        return new ItemOptions(viewGroup, resourcesProvider, view, z, z2);
    }

    public ItemOptions setBlurBackground(BlurringShader.BlurManager blurManager, float f, float f2) {
        Drawable drawableMutate = this.context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.layout;
        if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new BlurringShader.StoryBlurDrawer(blurManager, viewGroup, 5).makeDrawable(this.layout.getX() + this.offsetX + f, this.layout.getY() + this.offsetY + f2, drawableMutate, AndroidUtilities.dp(12.0f)));
            return this;
        }
        for (int i = 0; i < this.layout.getChildCount(); i++) {
            View childAt = this.layout.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                childAt.setBackground(new BlurringShader.StoryBlurDrawer(blurManager, childAt, 5).makeDrawable(childAt.getX() + this.layout.getX() + this.offsetX + f, childAt.getY() + this.layout.getY() + this.offsetY + f2, drawableMutate, AndroidUtilities.dp(12.0f)));
            }
        }
        return this;
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z, boolean z2, boolean z3) {
        return new ItemOptions(viewGroup, resourcesProvider, view, z, z2, z3);
    }

    public ActionBarMenuSubItem add() {
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        add(actionBarMenuSubItem);
        return actionBarMenuSubItem;
    }

    private ItemOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z, boolean z2) {
        this(viewGroup, resourcesProvider, view, z, z2, false);
    }

    private ItemOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z, boolean z2, boolean z3) {
        this.gravity = 5;
        this.point = new float[2];
        this.drawScrim = true;
        this.longPressSelectionEnabled = true;
        this.viewAdditionalOffsets = new Rect();
        this.dismissWithButtons = true;
        this.shiftDp = -4;
        this.followLoc = new int[2];
        this.hoverLoc = new int[2];
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.container = viewGroup;
        this.resourcesProvider = resourcesProvider;
        this.context = viewGroup.getContext();
        this.scrimView = view;
        this.dimAlpha = ((double) AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider))) > 0.705d ? 102 : 51;
        this.swipeback = z;
        this.shownFromBottom = z2;
        this.useScrollView = z3;
        init();
    }

    public void add(ActionBarMenuSubItem actionBarMenuSubItem) {
        AndroidUtilities.removeFromParent(actionBarMenuSubItem);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num2 != null ? num2.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
        actionBarMenuSubItem.setSelectorColor(Theme.getColor(Theme.key_groupcreate_sectionText, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
        int i = this.minWidthDp;
        if (i > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        } else {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        }
    }

    public ActionBarMenuSubItem addChecked() {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num2 != null ? num2.intValue() : Theme.getColor(i2, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i, this.resourcesProvider)));
        int i3 = this.minWidthDp;
        if (i3 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i3));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
            return actionBarMenuSubItem;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        return actionBarMenuSubItem;
    }

    public ItemOptions add(CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
        if (this.context == null) {
            return this;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(charSequence);
        actionBarMenuSubItem.setSubtext(charSequence2);
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(iIntValue, num2 != null ? num2.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 3));
        int i = this.minWidthDp;
        if (i > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
            return this;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    private ItemOptions(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, Theme.ResourcesProvider resourcesProvider) {
        this.gravity = 5;
        this.point = new float[2];
        this.drawScrim = true;
        this.longPressSelectionEnabled = true;
        this.viewAdditionalOffsets = new Rect();
        this.dismissWithButtons = true;
        this.shiftDp = -4;
        this.followLoc = new int[2];
        this.hoverLoc = new int[2];
        this.context = actionBarPopupWindowLayout.getContext();
        LinearLayout linearLayout = new LinearLayout(this.context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.resourcesProvider = resourcesProvider;
    }
}
