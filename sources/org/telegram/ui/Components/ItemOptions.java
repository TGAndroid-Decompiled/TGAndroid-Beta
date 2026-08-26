package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.cast.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$57$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.BlurringShader.StoryBlurDrawer.AnonymousClass2;
import org.telegram.ui.Components.Paint.Input;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.Premium.boosts.BoostCounterView;
import org.telegram.ui.Components.Reactions.ChatSelectionReactionMenuOverlay;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.KeepMediaPopupView;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.SelfStoriesPreviewView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda4;
import org.telegram.ui.iv.RichEditor;

public final class ItemOptions {
    public AnonymousClass4 actionBarPopupWindow;
    public boolean allowCenter;
    public boolean allowMoveScrim;
    public int allowMoveScrimGravity;
    public boolean allowShowingOnTopOfKeyboard;
    public int animateToHeight;
    public int animateToWidth;
    public boolean blur;
    public boolean blurForMenu;
    public final ViewGroup container;
    public final Context context;
    public int dimAlpha;
    public ValueAnimator dimAnimator;
    public DimView dimView;
    public Runnable dismissListener;
    public boolean dismissWithButtons;
    public boolean dontDismiss;
    public boolean dontFocus;
    public boolean drawScrim;
    public int fixedWidthDp;
    public ItemOptions$$ExternalSyntheticLambda13 followLayoutListener;
    public final int[] followLoc;
    public boolean followScrim;
    public ItemOptions$$ExternalSyntheticLambda12 followScrollListener;
    public View followingView;
    public boolean forceBottom;
    public boolean forceTop;
    public int foregroundIndex;
    public final BaseFragment fragment;
    public Integer gapBackgroundColor;
    public int gravity;
    public boolean hideScrimUnder;
    public final int[] hoverLoc;
    public TodoItemMenu$$ExternalSyntheticLambda4 hoverReleaseListener;
    public View hoveredItem;
    public Integer iconColor;
    public boolean ignoreX;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout lastLayout;
    public ViewGroup layout;
    public final LinearLayout linearLayout;
    public boolean longPressSelectionEnabled;
    public int maxHeight;
    public int minWidthDp;
    public boolean needsFocus;
    public boolean offsetByContainer;
    public float offsetX;
    public float offsetY;
    public boolean onTopOfScrim;
    public boolean overridenSwipebackGravity;
    public final float[] point;
    public ViewGroup pointContainer;
    public ChatActivity$57$$ExternalSyntheticLambda0 preDrawListener;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean scaleOut;
    public BlurredBackgroundSourceBitmap scrimBlur3SourceBitmap;
    public final View scrimView;
    public Drawable scrimViewBackground;
    public int scrimViewBackgroundShadowColor;
    public int scrimViewPadding;
    public int scrimViewRoundRadius;
    public Integer selectorColor;
    public int shiftDp;
    public final boolean shownFromBottom;
    public final boolean swipeback;
    public Integer textColor;
    public float translateX;
    public float translateY;
    public final boolean useScrollView;
    public final Rect viewAdditionalOffsets;

    public final class AnonymousClass4 extends ActionBarPopupWindow {
        public final ViewGroup val$container;

        public AnonymousClass4(View view, ViewGroup viewGroup) {
            super(view);
            this.val$container = viewGroup;
        }

        @Override
        public final void dismiss() {
            dismiss(true);
            ViewGroup viewGroup = this.val$container;
            ItemOptions itemOptions = ItemOptions.this;
            itemOptions.dismissDim(viewGroup);
            Runnable runnable = itemOptions.dismissListener;
            if (runnable != null) {
                runnable.run();
                itemOptions.dismissListener = null;
            }
        }
    }

    public final class AnonymousClass7 extends ScrollView {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
        }
    }

    public final class DimView extends View {
        public Bitmap blurBitmap;
        public final Paint blurPaint;
        public final RectF bounds;
        public final Bitmap cachedBitmap;
        public final Paint cachedBitmapPaint;
        public final float clipBottom;
        public final Path clipPath;
        public final float clipTop;
        public final int dim;
        public float dimProgress;
        public float moveToX;
        public float moveToY;

        public DimView(Context context) {
            float fMin;
            super(context);
            this.clipPath = new Path();
            this.bounds = new RectF();
            View view = ItemOptions.this.scrimView;
            if (view == null || !(view.getParent() instanceof View)) {
                this.clipTop = 0.0f;
                this.clipBottom = 0.0f;
            } else {
                this.clipTop = view.getY() + ((View) view.getParent()).getY();
                if (ItemOptions.this.allowMoveScrim) {
                    fMin = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
                } else {
                    fMin = 0.0f;
                }
                this.clipBottom = fMin;
            }
            this.dim = ColorUtils.setAlphaComponent(0, ItemOptions.this.dimAlpha);
            if (ItemOptions.this.drawScrim && (view instanceof UserCell) && (ItemOptions.this.fragment instanceof ProfileActivity)) {
                this.cachedBitmapPaint = new Paint(3);
                int width = view.getWidth();
                Rect rect = ItemOptions.this.viewAdditionalOffsets;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width() + width, rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
                this.cachedBitmap = bitmapCreateBitmap;
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.translate(rect.left, rect.top);
                view.draw(canvas);
            } else {
                this.cachedBitmapPaint = null;
                this.cachedBitmap = null;
            }
            if (ItemOptions.this.blur || ItemOptions.this.blurForMenu) {
                this.blurPaint = new Paint(3);
                view.setAlpha(0.0f);
                ViewGroup viewGroup = ItemOptions.this.pointContainer;
                GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda8 = new GiftSheet$$ExternalSyntheticLambda8(this, 5);
                if (viewGroup == null) {
                    ScrimOptions.makeGlobalBlurBitmaps(giftSheet$$ExternalSyntheticLambda8);
                } else {
                    int i = ScrimOptions.$r8$clinit;
                    AndroidUtilities.makeGlobalBlurBitmap(new OAuthSheet$$ExternalSyntheticLambda13(2, viewGroup, giftSheet$$ExternalSyntheticLambda8), 15.0f);
                }
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            char c;
            float width;
            int height;
            float f2;
            Canvas canvas2 = canvas;
            super.onDraw(canvas);
            if (this.blurBitmap != null) {
                canvas2.save();
                float fMax = Math.max(getWidth() / this.blurBitmap.getWidth(), getHeight() / this.blurBitmap.getHeight());
                canvas2.scale(fMax, fMax);
                Paint paint = this.blurPaint;
                paint.setAlpha((int) (this.dimProgress * 255.0f));
                canvas2.drawBitmap(this.blurBitmap, 0.0f, 0.0f, paint);
                canvas2.restore();
            } else {
                canvas2.drawColor(Theme.multAlpha(this.dimProgress, this.dim));
            }
            ItemOptions itemOptions = ItemOptions.this;
            if (itemOptions.drawScrim) {
                Path path = this.clipPath;
                float[] fArr = itemOptions.point;
                View view = itemOptions.scrimView;
                Rect rect = itemOptions.viewAdditionalOffsets;
                float f3 = this.clipTop;
                Bitmap bitmap = this.cachedBitmap;
                if (bitmap != null && (view.getParent() instanceof View)) {
                    canvas2.save();
                    if (f3 < 1.0f) {
                        canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f3 * (itemOptions.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                    }
                    if (itemOptions.allowMoveScrim) {
                        ItemOptions.getPointOnScreen(view, itemOptions.pointContainer, fArr);
                        canvas2.translate(AndroidUtilities.lerp(fArr[0], this.moveToX, this.dimProgress), AndroidUtilities.lerp(fArr[1], this.moveToY, this.dimProgress));
                    } else {
                        canvas2.translate(fArr[0], fArr[1]);
                    }
                    Drawable drawable = itemOptions.scrimViewBackground;
                    if (drawable != null) {
                        if (drawable.getIntrinsicWidth() <= 0 || itemOptions.scrimViewBackground.getIntrinsicHeight() <= 0) {
                            itemOptions.scrimViewBackground.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                        } else {
                            itemOptions.scrimViewBackground.setBounds((((view.getWidth() + rect.right) - itemOptions.scrimViewBackground.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - itemOptions.scrimViewBackground.getIntrinsicHeight()) / 2) + (-rect.top), ((itemOptions.scrimViewBackground.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((itemOptions.scrimViewBackground.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                        }
                        itemOptions.scrimViewBackground.draw(canvas2);
                    }
                    if (itemOptions.scrimViewPadding > 0 || itemOptions.scrimViewRoundRadius > 0) {
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f4 = -rect.left;
                        float f5 = itemOptions.scrimViewPadding;
                        rectF.set((this.dimProgress * f5) + f4, (getAlpha() * f5) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * itemOptions.scrimViewPadding), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * itemOptions.scrimViewPadding));
                        float f6 = itemOptions.scrimViewRoundRadius * this.dimProgress;
                        path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                    Paint paint2 = this.cachedBitmapPaint;
                    paint2.setAlpha(255);
                    canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                    canvas2.restore();
                    return;
                }
                if (view != 0 && (view.getParent() instanceof View)) {
                    canvas2.save();
                    float f7 = this.clipBottom;
                    if (f3 >= 1.0f && f7 == 0.0f) {
                        f = 255.0f;
                        c = 0;
                    } else if (itemOptions.allowMoveScrim) {
                        f = 255.0f;
                        c = 0;
                        canvas2.clipRect(-rect.left, AndroidUtilities.lerp((((-rect.top) + fArr[1]) - (f3 * (itemOptions.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, 0.0f, this.dimProgress), getMeasuredWidth() + rect.right, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.dimProgress, f7, getMeasuredHeight() + rect.bottom));
                    } else {
                        f = 255.0f;
                        c = 0;
                        canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f3 * (itemOptions.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                    }
                    float f8 = this.dimProgress;
                    if (itemOptions.allowMoveScrim) {
                        ItemOptions.getPointOnScreen(view, itemOptions.pointContainer, fArr);
                        canvas2.translate(AndroidUtilities.lerp(fArr[c], this.moveToX, f8), AndroidUtilities.lerp(fArr[1], this.moveToY, f8));
                    } else {
                        canvas2.translate(fArr[c], fArr[1]);
                    }
                    if (itemOptions.animateToWidth == 0 || itemOptions.animateToHeight == 0) {
                        width = view.getWidth();
                        height = view.getHeight();
                    } else {
                        width = AndroidUtilities.lerp(view.getWidth(), itemOptions.animateToWidth, f8);
                        height = AndroidUtilities.lerp(view.getHeight(), itemOptions.animateToHeight, f8);
                    }
                    float f9 = height;
                    float f10 = width;
                    Drawable drawable2 = itemOptions.scrimViewBackground;
                    if (drawable2 != null) {
                        if (drawable2.getIntrinsicWidth() <= 0 || itemOptions.scrimViewBackground.getIntrinsicHeight() <= 0) {
                            f2 = 1.0f;
                            itemOptions.scrimViewBackground.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                        } else {
                            f2 = 1.0f;
                            itemOptions.scrimViewBackground.setBounds((((view.getWidth() + rect.right) - itemOptions.scrimViewBackground.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - itemOptions.scrimViewBackground.getIntrinsicHeight()) / 2) + (-rect.top), ((itemOptions.scrimViewBackground.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((itemOptions.scrimViewBackground.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                        }
                        itemOptions.scrimViewBackground.setAlpha((int) (this.dimProgress * f));
                        if (Build.VERSION.SDK_INT >= 29) {
                            Drawable drawable3 = itemOptions.scrimViewBackground;
                            if (drawable3 instanceof ShapeDrawable) {
                                Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                                paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), Theme.multAlpha(this.dimProgress, itemOptions.scrimViewBackgroundShadowColor));
                            }
                        }
                        itemOptions.scrimViewBackground.draw(canvas2);
                    } else {
                        f2 = 1.0f;
                    }
                    if (itemOptions.scrimViewPadding > 0 || itemOptions.scrimViewRoundRadius > 0) {
                        path.rewind();
                        boolean z = view instanceof ScrimView;
                        RectF rectF2 = this.bounds;
                        if (z) {
                            ((ScrimView) view).getBounds(rectF2);
                        } else {
                            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        float f11 = -rect.left;
                        float f12 = rectF2.left + f11;
                        float f13 = itemOptions.scrimViewPadding * this.dimProgress;
                        float f14 = -rect.top;
                        rectF3.set(f12 + f13, rectF2.top + f14 + f13, (f11 + rectF2.right) - f13, (f14 + rectF2.bottom) - f13);
                        float f15 = itemOptions.scrimViewRoundRadius * this.dimProgress;
                        path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                    if (!(view instanceof SharedPhotoVideoCell2)) {
                        if (!(view instanceof GiftSheet.GiftCell) || itemOptions.animateToWidth == 0 || itemOptions.animateToHeight == 0) {
                            if (itemOptions.allowMoveScrim) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.dimProgress * f), 31);
                                canvas2 = canvas;
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            if (view instanceof ScrimView) {
                                ((ScrimView) view).drawScrim(canvas2, this.dimProgress);
                            } else {
                                canvas2.translate(-view.getScrollX(), -view.getScrollY());
                                view.draw(canvas2);
                            }
                            canvas2.restore();
                        } else if (view.getAlpha() >= 1.0f) {
                            ((GiftSheet.GiftCell) view).customDraw(this, canvas2, f10, f9, this.dimProgress);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, f10, f9, (int) (this.dimProgress * f), 31);
                            float fLerp = AndroidUtilities.lerp(1.0f, 0.9f, this.dimProgress);
                            canvas.scale(fLerp, fLerp, f10 / 2.0f, f9 / 2.0f);
                            ((GiftSheet.GiftCell) view).customDraw(this, canvas, f10, f9, this.dimProgress);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                        canvas2.restore();
                    }
                    if (view.getAlpha() >= f2) {
                        ((SharedPhotoVideoCell2) view).customDraw(canvas2, f10, f9, this.dimProgress);
                    } else {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f10, f9, (int) (this.dimProgress * f), 31);
                        float fLerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.dimProgress);
                        canvas2.scale(fLerp2, fLerp2, f10 / 2.0f, f9 / 2.0f);
                        ((SharedPhotoVideoCell2) view).customDraw(canvas2, f10, f9, this.dimProgress);
                        canvas2.restore();
                    }
                    canvas2.restore();
                }
            }
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            ItemOptions itemOptions = ItemOptions.this;
            Blur3Utils.checkBitmapSourceMatrixScale(itemOptions.scrimBlur3SourceBitmap, this);
            ViewGroup viewGroup = itemOptions.layout;
            if (viewGroup != null) {
                viewGroup.invalidate();
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
        void drawScrim(Canvas canvas, float f);

        void getBounds(RectF rectF);
    }

    public ItemOptions(BaseFragment baseFragment, View view, boolean z, boolean z2) {
        INavigationLayout parentLayout;
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
        if ((((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).hasMainTabs) || (((baseFragment instanceof DialogsActivity) && ((DialogsActivity) baseFragment).hasMainTabs) || (((baseFragment instanceof ContactsActivity) && ((ContactsActivity) baseFragment).hasMainTabs) || ((baseFragment instanceof SettingsActivity) && ((SettingsActivity) baseFragment).hasMainTabs)))) && (parentLayout = baseFragment.getParentLayout()) != null) {
            BaseFragment safeLastFragment = ((ActionBarLayout) parentLayout).getSafeLastFragment();
            if (safeLastFragment instanceof MainTabsActivity) {
                baseFragment = safeLastFragment;
            }
        }
        this.fragment = baseFragment;
        Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        this.resourcesProvider = resourceProvider;
        this.context = baseFragment.getContext();
        this.scrimView = view;
        this.dimAlpha = ((double) AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite, resourceProvider))) > 0.705d ? 102 : 51;
        this.swipeback = z;
        this.useScrollView = z2;
        this.shownFromBottom = false;
        init();
    }

    public static void addAlbumsItemOptions(ItemOptions itemOptions, StoriesController.StoriesCollections storiesCollections, final HashSet hashSet, boolean z, Runnable runnable, final Utilities.Callback callback) {
        Object obj;
        ArrayList<TLRPC.PhotoSize> arrayList;
        Context context = itemOptions.context;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        LinearLayout linearLayout = new LinearLayout(context);
        anonymousClass7.addView(linearLayout);
        linearLayout.setOrientation(1);
        itemOptions.addView(anonymousClass7, LayoutHelper.createLinear(-1, -2));
        float f = 0.12f;
        Theme.ResourcesProvider resourcesProvider = itemOptions.resourcesProvider;
        if (z && runnable != null) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(2, itemOptions.context, itemOptions.resourcesProvider, false, false);
            actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i = Theme.key_actionBarDefaultSubmenuItem;
            int color = Theme.getColor(i, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider);
            actionBarMenuSubItem.setTextColor(color);
            actionBarMenuSubItem.setIconColor(color2);
            actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i, resourcesProvider)));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.StoriesAlbumNewAlbum), R.drawable.menu_album_add, null);
            actionBarMenuSubItem.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda51(5, runnable));
            linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        }
        ArrayList arrayList2 = storiesCollections.collections;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            final StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj2;
            final int i3 = storyAlbum.album_id;
            final boolean zContains = hashSet.contains(Integer.valueOf(i3));
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(2, itemOptions.context, itemOptions.resourcesProvider, false, false);
            actionBarMenuSubItem2.setChecked(zContains);
            actionBarMenuSubItem2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int i4 = Theme.key_actionBarDefaultSubmenuItem;
            int color3 = Theme.getColor(i4, resourcesProvider);
            int color4 = Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider);
            actionBarMenuSubItem2.setTextColor(color3);
            actionBarMenuSubItem2.setIconColor(color4);
            actionBarMenuSubItem2.setSelectorColor(Theme.multAlpha(f, Theme.getColor(i4, resourcesProvider)));
            TLRPC.Photo photo = storyAlbum.icon_photo;
            if (photo == null || (arrayList = photo.sizes) == null) {
                obj = null;
                actionBarMenuSubItem2.setTextAndIcon(storyAlbum.title, R.drawable.msg_folders, null);
            } else {
                actionBarMenuSubItem2.setTextAndIcon(storyAlbum.title, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(storyAlbum.icon_photo.sizes, AndroidUtilities.dp(24.0f), false, FileLoader.getClosestPhotoSizeWithSize(arrayList, 50), true), storyAlbum.icon_photo), "50_50", null, null);
                obj = null;
            }
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean z2 = zContains;
                    HashSet hashSet2 = hashSet;
                    int i5 = i3;
                    if (z2) {
                        hashSet2.remove(Integer.valueOf(i5));
                    } else {
                        hashSet2.add(Integer.valueOf(i5));
                    }
                    callback.run(storyAlbum);
                }
            });
            linearLayout.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
            f = 0.12f;
        }
    }

    public static View findItemAt(View view, int i, int i2) {
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

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view) {
        return new ItemOptions(viewGroup, resourcesProvider, view, false, false, false);
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

    public final void add(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        add(i, null, charSequence, z ? Theme.key_text_RedRegular : Theme.key_actionBarDefaultSubmenuItemIcon, z ? Theme.key_text_RedRegular : Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public final void addAccount(int i, boolean z, Runnable runnable) {
        Context context = this.context;
        if (context == null) {
            return;
        }
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        int i3 = Theme.key_actionBarDefaultSubmenuItemIcon;
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(UserObject.getUserName(currentUser));
        actionBarMenuSubItem.setClipToPadding(false);
        actionBarMenuSubItem.textView.setPadding((actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.getImageReceiver().setCurrentAccount(i);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(UserConfig.selectedAccount, currentUser);
        backupImageView.setRoundRadius(AndroidUtilities.dp(34.0f));
        backupImageView.imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
        backupImageView.onNewImageSet();
        backupImageView.setScaleX(z ? 0.84f : 1.0f);
        backupImageView.setScaleY(z ? 0.84f : 1.0f);
        actionBarMenuSubItem.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z) {
            View view = new View(context);
            view.setBackground(new Theme.AnonymousClass6(AndroidUtilities.dp(2.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), AndroidUtilities.dp(34.0f)));
            actionBarMenuSubItem.addView(view, LayoutHelper.createFrame(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i2, resourcesProvider);
        Integer num2 = this.iconColor;
        int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(i3, resourcesProvider);
        actionBarMenuSubItem.setTextColor(iIntValue);
        actionBarMenuSubItem.setIconColor(iIntValue2);
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i2, resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 1));
        int i4 = this.minWidthDp;
        if (i4 <= 0) {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        } else {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        }
    }

    public final void addChat(TLObject tLObject, boolean z, Runnable runnable) {
        Context context = this.context;
        if (context == null) {
            return;
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
        BackupImageView backupImageView = new BackupImageView(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(tLObject);
        backupImageView.setRoundRadius(AndroidUtilities.dp(34.0f));
        backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        backupImageView.onNewImageSet();
        backupImageView.setScaleX(z ? 0.84f : 1.0f);
        backupImageView.setScaleY(z ? 0.84f : 1.0f);
        actionBarMenuSubItem.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, (LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z) {
            View view = new View(context);
            view.setBackground(new Theme.AnonymousClass6(AndroidUtilities.dp(2.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), AndroidUtilities.dp(34.0f)));
            actionBarMenuSubItem.addView(view, LayoutHelper.createFrame(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
        }
        Integer num = this.textColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i, resourcesProvider);
        Integer num2 = this.iconColor;
        int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(i2, resourcesProvider);
        actionBarMenuSubItem.setTextColor(iIntValue);
        actionBarMenuSubItem.setIconColor(iIntValue2);
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i, resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 3));
        int i3 = this.minWidthDp;
        if (i3 <= 0) {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        } else {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i3));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        }
    }

    public final void addChecked(Runnable runnable, String str, boolean z) {
        addChecked(z, 0, null, str, runnable);
    }

    public final void addGap() {
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(this.context, Theme.key_actionBarDefaultSubmenuSeparator, this.resourcesProvider);
        gapView.setTag(R.id.fit_width_tag, 1);
        Integer num = this.gapBackgroundColor;
        if (num != null) {
            gapView.setColor(num.intValue());
        }
        addView(gapView, LayoutHelper.createLinear(-1, 8));
    }

    public final void addIf(int i, CharSequence charSequence, Runnable runnable, boolean z) {
        if (z) {
            add(i, null, charSequence, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, runnable);
        }
    }

    public final void addProfile(TLObject tLObject, String str, Runnable runnable) {
        Context context = this.context;
        FrameLayout frameLayout = new FrameLayout(context);
        int i = Theme.key_listSelector;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        frameLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i, resourcesProvider), 0, 12));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(17.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(tLObject);
        backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        backupImageView.onNewImageSet();
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        OKLCH.m(Theme.key_dialogTextBlack, resourcesProvider, textView, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (tLObject instanceof TLRPC.User) {
            textView.setText(UserObject.getUserName((TLRPC.User) tLObject));
        } else if (tLObject instanceof TLRPC.Chat) {
            textView.setText(((TLRPC.Chat) tLObject).title);
        }
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        OKLCH.m(Theme.key_dialogTextGray2, resourcesProvider, textView2, 13.0f);
        textView2.setText(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 2));
        addView(frameLayout, LayoutHelper.createLinear(-1, 52));
    }

    public final void addSpaceGap$1() {
        boolean z = this.layout instanceof LinearLayout;
        Context context = this.context;
        if (!z) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setOrientation(1);
            ViewGroup viewGroup = this.layout;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
            int i = this.maxHeight;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(i > 0 ? i / AndroidUtilities.density : -2.0f));
            layoutParams.gravity = 48;
            viewGroup.addView(actionBarPopupWindowLayout, layoutParams);
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 0, context, this.resourcesProvider);
        this.lastLayout = actionBarPopupWindowLayout2;
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ItemOptions$$ExternalSyntheticLambda1(1, this));
        this.layout.addView(this.lastLayout, LayoutHelper.createLinear(-1, -2, 48, 0, -8, 0, 0));
    }

    public final void addText(int i, int i2, CharSequence charSequence) {
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(this.context, 12);
        anonymousClass9.setTextSize(1, i);
        anonymousClass9.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        anonymousClass9.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        anonymousClass9.setText(Emoji.replaceEmoji(charSequence, anonymousClass9.getPaint().getFontMetricsInt(), false));
        anonymousClass9.setTag(R.id.fit_width_tag, 1);
        anonymousClass9.setTypeface(null);
        NotificationCenter.listenEmojiLoading(anonymousClass9);
        if (i2 > 0) {
            anonymousClass9.setMaxWidth(i2);
        }
        addView(anonymousClass9, LayoutHelper.createLinear(-1, -2));
    }

    public final void addView(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.fit_width_tag, 1);
        addView(view, LayoutHelper.createLinear(-1, -2));
    }

    public final void closeSwipeback() {
        this.dontDismiss = true;
        this.lastLayout.getSwipeBack().closeForeground(true);
    }

    public final void cutTextInFancyHalf() {
        if (this.context == null || this.lastLayout.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(actionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof ActionBarMenuSubItem) {
            AnimatedEmojiSpan.TextViewEmojis textView = ((ActionBarMenuSubItem) childAt).getTextView();
            textView.setMaxWidth(textView.getPaddingRight() + textView.getPaddingLeft() + HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()));
        }
    }

    public final void dismiss() {
        if (this.dontDismiss) {
            this.dontDismiss = false;
            return;
        }
        AnonymousClass4 anonymousClass4 = this.actionBarPopupWindow;
        if (anonymousClass4 != null) {
            anonymousClass4.dismiss();
            return;
        }
        Runnable runnable = this.dismissListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void dismissDim(ViewGroup viewGroup) {
        DimView dimView = this.dimView;
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
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(dimView, 17));
        this.dimAnimator.addListener(new EmojiView.AnonymousClass35(this, dimView, viewGroup, 6));
        if (this.allowMoveScrim) {
            this.dimAnimator.setDuration(380L);
            this.dimAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else {
            this.dimAnimator.setDuration(150L);
        }
        this.dimAnimator.start();
    }

    public final View getItemAt(int i) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        if (actionBarPopupWindowLayout == null && this.layout == null) {
            return null;
        }
        if (actionBarPopupWindowLayout == this.layout) {
            return actionBarPopupWindowLayout.linearLayout.getChildAt(i);
        }
        int i2 = 0;
        while (i2 < this.layout.getChildCount() - 1) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                View childAt2 = actionBarPopupWindowLayout2.linearLayout.getChildAt(i);
                if (childAt2 != null) {
                    return childAt2;
                }
                i -= actionBarPopupWindowLayout2.getItemsCount();
            }
            i2++;
        }
        return null;
    }

    public final int getItemsCount() {
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

    public final ActionBarMenuSubItem getLast() {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
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
        View childAt2 = actionBarPopupWindowLayout2.linearLayout.getChildAt(actionBarPopupWindowLayout2.getItemsCount() - 1);
        if (childAt2 instanceof ActionBarMenuSubItem) {
            return (ActionBarMenuSubItem) childAt2;
        }
        return null;
    }

    public final void init() {
        ProfileActivity.AnonymousClass39 anonymousClass39 = new ProfileActivity.AnonymousClass39(this, this.context, R.drawable.popup_fixed_alert4, this.resourcesProvider, (this.shownFromBottom ? 2 : 0) | (this.swipeback ? 1 : 0) | (this.useScrollView ? 0 : 4));
        this.lastLayout = anonymousClass39;
        anonymousClass39.setDispatchKeyEventListener(new ItemOptions$$ExternalSyntheticLambda1(0, this));
        this.layout = this.lastLayout;
    }

    public final void installFollowListeners() {
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
                ItemOptions.AnonymousClass4 anonymousClass4;
                ItemOptions itemOptions = this.f$0;
                if (itemOptions.followingView == null || (anonymousClass4 = itemOptions.actionBarPopupWindow) == null || !anonymousClass4.isShowing()) {
                    return;
                }
                int[] iArr = new int[2];
                itemOptions.followingView.getLocationOnScreen(iArr);
                int i = iArr[0];
                int[] iArr2 = itemOptions.followLoc;
                if (i == iArr2[0] && iArr[1] == iArr2[1]) {
                    return;
                }
                iArr2[0] = i;
                iArr2[1] = iArr[1];
                itemOptions.reposition();
            }
        };
        this.followingView.getViewTreeObserver().addOnScrollChangedListener(this.followScrollListener);
        ItemOptions$$ExternalSyntheticLambda13 itemOptions$$ExternalSyntheticLambda13 = new ItemOptions$$ExternalSyntheticLambda13(this, 0);
        this.followLayoutListener = itemOptions$$ExternalSyntheticLambda13;
        this.followingView.addOnLayoutChangeListener(itemOptions$$ExternalSyntheticLambda13);
    }

    public final boolean isShown() {
        AnonymousClass4 anonymousClass4 = this.actionBarPopupWindow;
        return anonymousClass4 != null && anonymousClass4.isShowing();
    }

    public final void makeMultiline() {
        if (this.context == null || this.lastLayout.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(actionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof ActionBarMenuSubItem) {
            ((ActionBarMenuSubItem) childAt).setMultiline(false);
        }
    }

    public final ItemOptions makeSwipeback() {
        ItemOptions itemOptions = new ItemOptions(this.lastLayout, this.resourcesProvider);
        itemOptions.foregroundIndex = this.lastLayout.addViewToSwipeBack(itemOptions.linearLayout);
        return itemOptions;
    }

    public final void openSwipeback(ItemOptions itemOptions) {
        this.dontDismiss = true;
        this.lastLayout.getSwipeBack().openForeground(itemOptions.foregroundIndex);
    }

    public final void putCheck() {
        if (this.context == null || this.lastLayout.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(actionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof ActionBarMenuSubItem) {
            ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) childAt;
            actionBarMenuSubItem.setRightIcon(R.drawable.msg_text_check);
            actionBarMenuSubItem.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            actionBarMenuSubItem.getRightIcon().setScaleX(0.85f);
            actionBarMenuSubItem.getRightIcon().setScaleY(0.85f);
        }
    }

    public final void putPremiumLock(Runnable runnable) {
        if (runnable == null || this.context == null || this.lastLayout.getItemsCount() <= 0) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(actionBarPopupWindowLayout.getItemsCount() - 1);
        if (childAt instanceof ActionBarMenuSubItem) {
            ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) childAt;
            actionBarMenuSubItem.setRightIcon(R.drawable.msg_mini_lock3);
            actionBarMenuSubItem.getRightIcon().setAlpha(0.4f);
            actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 4));
        }
    }

    public final void removeFollowListeners() {
        View view = this.followingView;
        if (view != null) {
            if (this.followScrollListener != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this.followScrollListener);
                }
            }
            ItemOptions$$ExternalSyntheticLambda13 itemOptions$$ExternalSyntheticLambda13 = this.followLayoutListener;
            if (itemOptions$$ExternalSyntheticLambda13 != null) {
                this.followingView.removeOnLayoutChangeListener(itemOptions$$ExternalSyntheticLambda13);
            }
        }
        this.followScrollListener = null;
        this.followLayoutListener = null;
        this.followingView = null;
    }

    public final void reposition() {
        View view;
        ViewGroup viewGroup;
        int i;
        int x;
        float fWidth;
        float measuredWidth;
        int y;
        AnonymousClass4 anonymousClass4 = this.actionBarPopupWindow;
        if (anonymousClass4 == null || !anonymousClass4.isShowing() || (view = this.scrimView) == 0 || (viewGroup = this.pointContainer) == null || this.layout == null || this.lastLayout == null) {
            return;
        }
        float[] fArr = this.point;
        getPointOnScreen(view, viewGroup, fArr);
        float f = fArr[1];
        float f2 = fArr[0];
        if (this.offsetByContainer) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            f2 += iArr[0];
            f += iArr[1];
        }
        RectF rectF = new RectF();
        if (view instanceof ScrimView) {
            ((ScrimView) view).getBounds(rectF);
        } else {
            int i2 = this.animateToWidth;
            if (i2 == 0 || (i = this.animateToHeight) == 0) {
                rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                rectF.set(0.0f, 0.0f, i2, i);
            }
        }
        float paddingLeft = f2 + rectF.left;
        float measuredHeight = f + rectF.top;
        if (this.ignoreX) {
            fArr[0] = 0.0f;
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
            y = (int) (viewGroup.getY() + (Math.min(measuredHeight + fHeight, AndroidUtilities.displaySize.y) - this.layout.getMeasuredHeight()));
        } else {
            if (this.forceTop || measuredHeight + fHeight + this.layout.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                measuredHeight = (measuredHeight - fHeight) - this.layout.getMeasuredHeight();
                if (this.allowCenter && Math.max(0.0f, measuredHeight + fHeight) + this.layout.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                    measuredHeight = (((viewGroup.getHeight() - this.layout.getMeasuredHeight()) / 2.0f) - fHeight) - viewGroup.getY();
                }
            }
            y = (int) (viewGroup.getY() + measuredHeight + fHeight);
        }
        float f3 = x + this.translateX;
        this.offsetX = f3;
        float f4 = y + this.translateY;
        this.offsetY = f4;
        this.actionBarPopupWindow.update((int) f3, (int) f4, -1, -1);
    }

    public final void setBackgroundColor(int i) {
        int i2 = 0;
        while (i2 < this.layout.getChildCount()) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i);
            }
            i2++;
        }
    }

    public final void setBlurBackground(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder, boolean z) {
        ViewGroup viewGroup = this.layout;
        if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(viewGroup, null, z);
            blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
            blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
            viewGroup.setBackground(blurredBackgroundDrawableCreate);
        }
    }

    public final void setColors(int i, int i2) {
        this.textColor = Integer.valueOf(i);
        this.iconColor = Integer.valueOf(i2);
        int i3 = 0;
        while (i3 < this.layout.getChildCount()) {
            View childAt = i3 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                for (int i4 = 0; i4 < actionBarPopupWindowLayout.getItemsCount(); i4++) {
                    View childAt2 = actionBarPopupWindowLayout.linearLayout.getChildAt(i4);
                    if (childAt2 instanceof ActionBarMenuSubItem) {
                        ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) childAt2;
                        actionBarMenuSubItem.setTextColor(i);
                        actionBarMenuSubItem.setIconColor(i2);
                    }
                }
            } else if (childAt instanceof ActionBarMenuSubItem) {
                ActionBarMenuSubItem actionBarMenuSubItem2 = (ActionBarMenuSubItem) childAt;
                actionBarMenuSubItem2.setTextColor(i);
                actionBarMenuSubItem2.setIconColor(i2);
            }
            i3++;
        }
    }

    public final void setGravity(int i) {
        this.gravity = i;
        if (i == 5 && this.swipeback) {
            ViewGroup viewGroup = this.layout;
            if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow.ActionBarPopupWindowLayout) viewGroup).swipeBackGravityRight = true;
            }
        }
    }

    public final void setScrimViewBackground(Drawable drawable) {
        this.scrimViewBackground = drawable;
        this.scrimViewBackgroundShadowColor = 0;
        if (!(drawable instanceof ShapeDrawable) || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.scrimViewBackgroundShadowColor = ((ShapeDrawable) drawable).getPaint().getShadowLayerColor();
    }

    public final void setTranslationY(float f) {
        AnonymousClass4 anonymousClass4 = this.actionBarPopupWindow;
        if (anonymousClass4 != null) {
            anonymousClass4.update((int) this.offsetX, (int) (this.offsetY + f), -1, -1);
        }
    }

    public final void setupSelectors() {
        if (this.layout == null) {
            return;
        }
        int i = 0;
        while (i < this.layout.getChildCount()) {
            View childAt = i == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                if (actionBarPopupWindowLayout.getItemsCount() > 0) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                    View childAt2 = anonymousClass2.getChildAt(0);
                    View childAt3 = anonymousClass2.getChildAt(actionBarPopupWindowLayout.getItemsCount() - 1);
                    boolean z = childAt2 instanceof ActionBarMenuSubItem;
                    Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                    if (z) {
                        ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) childAt2;
                        boolean z2 = childAt2 == childAt3;
                        if (!actionBarMenuSubItem.top || actionBarMenuSubItem.bottom != z2 || actionBarMenuSubItem.selectorRad != 12) {
                            actionBarMenuSubItem.top = true;
                            actionBarMenuSubItem.bottom = z2;
                            actionBarMenuSubItem.selectorRad = 12;
                            actionBarMenuSubItem.updateBackground();
                        }
                    } else if ((childAt2 instanceof MessagePreviewView.ToggleButton) || (childAt2 instanceof FrameLayout)) {
                        childAt2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), 12, childAt2 == childAt3 ? 12 : 0));
                    } else if (childAt2 != null && (childAt2.getBackground() instanceof RippleDrawable)) {
                        childAt2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), 12, childAt2 == childAt3 ? 12 : 0));
                    }
                    if (childAt3 instanceof ActionBarMenuSubItem) {
                        ActionBarMenuSubItem actionBarMenuSubItem2 = (ActionBarMenuSubItem) childAt3;
                        boolean z3 = childAt3 == childAt2;
                        if (actionBarMenuSubItem2.top != z3 || !actionBarMenuSubItem2.bottom || actionBarMenuSubItem2.selectorRad != 12) {
                            actionBarMenuSubItem2.top = z3;
                            actionBarMenuSubItem2.bottom = true;
                            actionBarMenuSubItem2.selectorRad = 12;
                            actionBarMenuSubItem2.updateBackground();
                        }
                    } else if ((childAt3 instanceof MessagePreviewView.ToggleButton) || (childAt3 instanceof FrameLayout)) {
                        childAt3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), childAt2 == childAt3 ? 12 : 0, 12));
                    } else if (childAt3 != null && (childAt3.getBackground() instanceof RippleDrawable)) {
                        childAt3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider), childAt2 == childAt3 ? 12 : 0, 12));
                    }
                }
            }
            i++;
        }
    }

    public final void show() {
        float f;
        float f2;
        int i;
        float paddingLeft;
        int width;
        int iMax;
        int height;
        boolean z;
        boolean z2;
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource;
        float f3;
        float f4;
        DimView dimView;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        float x;
        float measuredWidth;
        float fWidth;
        float f5;
        DimView dimView2;
        int i2 = 2;
        if (this.actionBarPopupWindow == null && this.linearLayout == null && getItemsCount() > 0) {
            setupSelectors();
            if (this.fixedWidthDp > 0) {
                int i3 = 0;
                while (i3 < this.layout.getChildCount() - 1) {
                    View childAt = i3 == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i3);
                    if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                        for (int i4 = 0; i4 < actionBarPopupWindowLayout2.getItemsCount(); i4++) {
                            actionBarPopupWindowLayout2.linearLayout.getChildAt(i4).getLayoutParams().width = AndroidUtilities.dp(this.fixedWidthDp);
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
                            actionBarPopupWindowLayout3.linearLayout.getChildAt(i6).setMinimumWidth(AndroidUtilities.dp(this.minWidthDp));
                        }
                    }
                    i5++;
                }
            }
            if ((this.blur || this.blurForMenu) && this.scrimBlur3SourceBitmap == null) {
                this.scrimBlur3SourceBitmap = new BlurredBackgroundSourceBitmap();
            }
            ViewGroup viewGroup = this.container;
            BaseFragment baseFragment = this.fragment;
            final ViewGroup overlayContainerView = viewGroup == null ? ((ActionBarLayout) baseFragment.getParentLayout()).getOverlayContainerView() : viewGroup;
            this.pointContainer = overlayContainerView;
            Context context = this.context;
            if (context == null || overlayContainerView == null) {
                return;
            }
            float f6 = AndroidUtilities.displaySize.y / 2.0f;
            float[] fArr = this.point;
            View view = this.scrimView;
            if (view != 0) {
                getPointOnScreen(view, overlayContainerView, fArr);
                f6 = fArr[1];
                f2 = fArr[0];
                if (this.offsetByContainer) {
                    int[] iArr = new int[2];
                    overlayContainerView.getLocationOnScreen(iArr);
                    f = 2.0f;
                    f2 += iArr[0];
                    f6 += iArr[1];
                } else {
                    f = 2.0f;
                }
            } else {
                f = 2.0f;
                f2 = 0.0f;
            }
            RectF rectF = new RectF();
            if (view instanceof ScrimView) {
                ((ScrimView) view).getBounds(rectF);
            } else {
                int i7 = this.animateToWidth;
                if (i7 == 0 || (i = this.animateToHeight) == 0) {
                    rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    rectF.set(0.0f, 0.0f, i7, i);
                }
            }
            float f7 = f2 + rectF.left;
            float measuredHeight = f6 + rectF.top;
            if (this.ignoreX) {
                fArr[0] = 0.0f;
                f7 = 0.0f;
            }
            if (this.dimAlpha > 0 || this.blur || this.blurForMenu) {
                DimView dimView3 = new DimView(context);
                this.dimView = dimView3;
                this.preDrawListener = new ChatActivity$57$$ExternalSyntheticLambda0(dimView3, i2);
                overlayContainerView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
                overlayContainerView.addView(this.dimView, LayoutHelper.createFrame(-1.0f, -1));
                this.dimView.setProgress(0.0f);
                if (this.hideScrimUnder) {
                    view.setVisibility(4);
                }
                ValueAnimator valueAnimator = this.dimAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.dimAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.dimAnimator = valueAnimatorOfFloat;
                int i8 = 0;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, i8));
                this.dimAnimator.addListener(new AnonymousClass3(this, i8));
                if (this.allowMoveScrim) {
                    this.dimAnimator.setDuration(380L);
                    this.dimAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                } else {
                    this.dimAnimator.setDuration(150L);
                }
                this.dimAnimator.start();
            } else {
                f7 = f7;
            }
            if (!this.allowMoveScrim || (dimView2 = this.dimView) == null || this.animateToWidth == 0) {
                paddingLeft = f7;
            } else {
                dimView2.moveToX = (overlayContainerView.getWidth() - this.animateToWidth) / f;
                if (this.allowMoveScrimGravity == 3) {
                    this.dimView.moveToX = AndroidUtilities.dp(36.0f);
                }
                paddingLeft = (-fArr[0]) + this.dimView.moveToX + f7;
            }
            this.layout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), Integer.MIN_VALUE));
            RectF rectF2 = new RectF();
            Rect padding = this.lastLayout.getPadding();
            rectF2.set(padding.left, padding.top, this.layout.getMeasuredWidth() - padding.right, this.layout.getMeasuredHeight() - padding.bottom);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.layout, overlayContainerView);
            this.actionBarPopupWindow = anonymousClass4;
            anonymousClass4.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    View view2;
                    ItemOptions itemOptions = ItemOptions.this;
                    itemOptions.actionBarPopupWindow = null;
                    itemOptions.dismissDim(overlayContainerView);
                    View view3 = itemOptions.hoveredItem;
                    if (view3 != null) {
                        view3.setPressed(false);
                        itemOptions.hoveredItem = null;
                    }
                    if (itemOptions.hoverReleaseListener != null && (view2 = itemOptions.scrimView) != null) {
                        view2.setOnTouchListener(null);
                    }
                    itemOptions.hoverReleaseListener = null;
                    itemOptions.removeFollowListeners();
                    Runnable runnable = itemOptions.dismissListener;
                    if (runnable != null) {
                        runnable.run();
                        itemOptions.dismissListener = null;
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
                measuredHeight += overlayContainerView.getPaddingTop();
                paddingLeft -= overlayContainerView.getPaddingLeft();
            }
            if (view != 0) {
                int i9 = this.gravity;
                if (i9 == 3) {
                    width = (int) (overlayContainerView.getX() + paddingLeft);
                } else {
                    if (i9 == 5) {
                        fWidth = rectF.width() + overlayContainerView.getX() + paddingLeft;
                        f5 = rectF2.right;
                    } else {
                        if (i9 == 1) {
                            x = (rectF.width() / f) + overlayContainerView.getX() + paddingLeft;
                            measuredWidth = this.layout.getMeasuredWidth() / f;
                        } else if (rectF2.width() + paddingLeft > overlayContainerView.getWidth()) {
                            fWidth = rectF.width() + overlayContainerView.getX() + paddingLeft;
                            f5 = rectF2.right;
                        } else {
                            x = overlayContainerView.getX() + paddingLeft;
                            measuredWidth = rectF2.left;
                        }
                        width = (int) (x - measuredWidth);
                    }
                    width = (int) (fWidth - f5);
                }
            } else {
                width = (overlayContainerView.getWidth() - this.layout.getMeasuredWidth()) / 2;
            }
            if (this.allowShowingOnTopOfKeyboard) {
                iMax = 0;
            } else {
                Rect rect = new Rect();
                View rootView = overlayContainerView.getRootView();
                overlayContainerView.getWindowVisibleDisplayFrame(rect);
                iMax = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            int i10 = (AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) - iMax;
            float fHeight = this.onTopOfScrim ? 0.0f : rectF.height();
            if (!this.forceBottom) {
                if (view != 0) {
                    if (this.forceTop || measuredHeight + fHeight + this.layout.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > i10) {
                        measuredHeight = (measuredHeight - fHeight) - this.layout.getMeasuredHeight();
                        if (this.allowCenter && Math.max(0.0f, measuredHeight + fHeight) + this.layout.getMeasuredHeight() > fArr[1] + rectF.top && rectF.height() == view.getHeight()) {
                            measuredHeight = (((overlayContainerView.getHeight() - this.layout.getMeasuredHeight()) / f) - fHeight) - overlayContainerView.getY();
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    z2 = z;
                    height = (int) (overlayContainerView.getY() + measuredHeight + fHeight);
                } else {
                    height = (overlayContainerView.getHeight() - this.layout.getMeasuredHeight()) / 2;
                }
                if (this.swipeback && z2 && !this.overridenSwipebackGravity && (actionBarPopupWindowLayout = this.lastLayout) != null) {
                    actionBarPopupWindowLayout.swipeBackGravityBottom = true;
                }
                if (this.allowMoveScrim && (dimView = this.dimView) != null) {
                    float height2 = overlayContainerView.getHeight();
                    float measuredHeight2 = this.layout.getMeasuredHeight();
                    float f8 = rectF.bottom;
                    dimView.moveToY = (height2 - (measuredHeight2 + f8)) / f;
                    DimView dimView4 = this.dimView;
                    height = (int) (dimView4.moveToY + f8);
                    width = (int) (((dimView4.moveToX + rectF.right) - this.layout.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                    if (this.allowMoveScrimGravity == 3) {
                        width = (int) (this.dimView.moveToX - AndroidUtilities.dp(8.0f));
                    }
                }
                if (!this.longPressSelectionEnabled) {
                    if (baseFragment == null && baseFragment.getFragmentView() != null) {
                        baseFragment.getFragmentView().getRootView().dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    } else if (viewGroup != null) {
                        overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    }
                }
                if (this.blurForMenu && this.scrimBlur3SourceBitmap != null) {
                    int i11 = Theme.key_actionBarDefaultSubmenuItem;
                    Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                    setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(i11, resourcesProvider)));
                    BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = this.scrimBlur3SourceBitmap;
                    blurredBackgroundSourceBitmap.getClass();
                    blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceBitmap);
                    blurredBackgroundDrawableSource.setColorProvider(null);
                    blurredBackgroundDrawableSource.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider));
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
                AnonymousClass4 anonymousClass5 = this.actionBarPopupWindow;
                anonymousClass5.scaleOut = this.scaleOut;
                float f9 = width + this.translateX;
                this.offsetX = f9;
                float f10 = height + this.translateY;
                this.offsetY = f10;
                anonymousClass5.showAtLocation(overlayContainerView, 0, (int) f9, (int) f10);
                if (this.longPressSelectionEnabled && view != 0) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    TodoItemMenu$$ExternalSyntheticLambda4 todoItemMenu$$ExternalSyntheticLambda4 = new TodoItemMenu$$ExternalSyntheticLambda4(new WeakReference(this), 4);
                    this.hoverReleaseListener = todoItemMenu$$ExternalSyntheticLambda4;
                    view.setOnTouchListener(todoItemMenu$$ExternalSyntheticLambda4);
                }
                if (this.followScrim) {
                    installFollowListeners();
                }
            }
            float f11 = measuredHeight + fHeight;
            height = this.allowMoveScrim ? (int) f11 : (int) (overlayContainerView.getY() + (Math.min(f11, i10) - this.layout.getMeasuredHeight()));
            z2 = false;
            if (this.swipeback) {
                actionBarPopupWindowLayout.swipeBackGravityBottom = true;
            }
            if (this.allowMoveScrim) {
                float height3 = overlayContainerView.getHeight();
                float measuredHeight3 = this.layout.getMeasuredHeight();
                float f12 = rectF.bottom;
                dimView.moveToY = (height3 - (measuredHeight3 + f12)) / f;
                DimView dimView5 = this.dimView;
                height = (int) (dimView5.moveToY + f12);
                width = (int) (((dimView5.moveToX + rectF.right) - this.layout.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                if (this.allowMoveScrimGravity == 3) {
                    width = (int) (this.dimView.moveToX - AndroidUtilities.dp(8.0f));
                }
            }
            if (!this.longPressSelectionEnabled) {
                if (baseFragment == null) {
                    if (viewGroup != null) {
                        overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                    }
                } else if (viewGroup != null) {
                    overlayContainerView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                }
            }
            if (this.blurForMenu) {
                int i12 = Theme.key_actionBarDefaultSubmenuItem;
                Theme.ResourcesProvider resourcesProvider2 = this.resourcesProvider;
                setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(i12, resourcesProvider2)));
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap2 = this.scrimBlur3SourceBitmap;
                blurredBackgroundSourceBitmap2.getClass();
                blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceBitmap2);
                blurredBackgroundDrawableSource.setColorProvider(null);
                blurredBackgroundDrawableSource.setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider2));
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
            AnonymousClass4 anonymousClass6 = this.actionBarPopupWindow;
            anonymousClass6.scaleOut = this.scaleOut;
            float f13 = width + this.translateX;
            this.offsetX = f13;
            float f14 = height + this.translateY;
            this.offsetY = f14;
            anonymousClass6.showAtLocation(overlayContainerView, 0, (int) f13, (int) f14);
            if (this.longPressSelectionEnabled) {
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                TodoItemMenu$$ExternalSyntheticLambda4 todoItemMenu$$ExternalSyntheticLambda5 = new TodoItemMenu$$ExternalSyntheticLambda4(new WeakReference(this), 4);
                this.hoverReleaseListener = todoItemMenu$$ExternalSyntheticLambda5;
                view.setOnTouchListener(todoItemMenu$$ExternalSyntheticLambda5);
            }
            if (this.followScrim) {
                installFollowListeners();
            }
        }
    }

    public final void translate(float f, float f2) {
        this.translateX += f;
        this.translateY += f2;
    }

    public final void updateHover(int i, int i2) {
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
            int[] iArr = this.hoverLoc;
            view2.getLocationOnScreen(iArr);
            this.hoveredItem.drawableHotspotChanged(i - iArr[0], i2 - iArr[1]);
        }
    }

    public final void addChecked(boolean z, int i, RichEditor.RequiresPremiumDrawable requiresPremiumDrawable, String str, Runnable runnable) {
        if (this.context == null) {
            return;
        }
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        int i3 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((i == 0 && requiresPremiumDrawable == null) ? 1 : 2, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (requiresPremiumDrawable != null) {
            actionBarMenuSubItem.setTextAndIcon(str, 0, requiresPremiumDrawable);
        } else if (i != 0) {
            actionBarMenuSubItem.setTextAndIcon(str, i, null);
        } else {
            actionBarMenuSubItem.setText(str);
        }
        actionBarMenuSubItem.setChecked(z);
        Integer num = this.textColor;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i2, resourcesProvider);
        Integer num2 = this.iconColor;
        int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(i3, resourcesProvider);
        actionBarMenuSubItem.setTextColor(iIntValue);
        actionBarMenuSubItem.setIconColor(iIntValue2);
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i2, resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 5));
        int i4 = this.minWidthDp;
        if (i4 <= 0) {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        } else {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        }
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z) {
        return new ItemOptions(viewGroup, resourcesProvider, view, z, false, false);
    }

    public final void add(int i, Drawable drawable, CharSequence charSequence, int i2, int i3, Runnable runnable) {
        if (this.context == null) {
            return;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i == 0 && drawable == null) {
            actionBarMenuSubItem.setText(charSequence);
        } else {
            actionBarMenuSubItem.setTextAndIcon(charSequence, i, drawable);
        }
        Integer num = this.textColor;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i3, resourcesProvider);
        Integer num2 = this.iconColor;
        int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(i2, resourcesProvider);
        actionBarMenuSubItem.setTextColor(iIntValue);
        actionBarMenuSubItem.setIconColor(iIntValue2);
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i3, resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda2(this, runnable, 0));
        int i4 = this.minWidthDp;
        if (i4 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        } else {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        }
    }

    public final void addView(View view, LinearLayout.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.addView(view, layoutParams);
        } else {
            this.lastLayout.linearLayout.addView(view, layoutParams);
        }
    }

    public final void setGapBackgroundColor(int i) {
        this.gapBackgroundColor = Integer.valueOf(i);
        if (this.layout != null) {
            int i2 = 0;
            while (i2 < this.layout.getChildCount()) {
                View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
                if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                    for (int i3 = 0; i3 < actionBarPopupWindowLayout.getItemsCount(); i3++) {
                        View childAt2 = actionBarPopupWindowLayout.linearLayout.getChildAt(i3);
                        if (childAt2 instanceof ActionBarPopupWindow.GapView) {
                            ((ActionBarPopupWindow.GapView) childAt2).setColor(i);
                        }
                    }
                } else if (childAt instanceof ActionBarPopupWindow.GapView) {
                    ((ActionBarPopupWindow.GapView) childAt).setColor(i);
                }
                i2++;
            }
        }
    }

    public final void setBlurBackground(BlurringShader.BlurManager blurManager, float f, float f2) {
        Drawable drawableMutate = this.context.getResources().getDrawable(R.drawable.popup_fixed_alert4).mutate();
        ViewGroup viewGroup = this.layout;
        if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new BlurringShader.StoryBlurDrawer(blurManager, viewGroup, 5, false).new AnonymousClass2(this.layout.getX() + this.offsetX + f, this.layout.getY() + this.offsetY + f2, drawableMutate, AndroidUtilities.dp(12.0f)));
            return;
        }
        for (int i = 0; i < this.layout.getChildCount(); i++) {
            View childAt = this.layout.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                childAt.setBackground(new BlurringShader.StoryBlurDrawer(blurManager, childAt, 5, false).new AnonymousClass2(this.layout.getX() + this.offsetX + f + childAt.getX(), this.layout.getY() + this.offsetY + f2 + childAt.getY(), drawableMutate, AndroidUtilities.dp(12.0f)));
            }
        }
    }

    public final void add(ActionBarMenuSubItem actionBarMenuSubItem) {
        AndroidUtilities.removeFromParent(actionBarMenuSubItem);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.textColor;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider);
        Integer num2 = this.iconColor;
        int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider);
        actionBarMenuSubItem.setTextColor(iIntValue);
        actionBarMenuSubItem.setIconColor(iIntValue2);
        actionBarMenuSubItem.setSelectorColor(Theme.getColor(Theme.key_groupcreate_sectionText, resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider)));
        int i = this.minWidthDp;
        if (i > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
        } else {
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        }
    }

    public final ActionBarMenuSubItem addChecked() {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, this.context, this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.textColor;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(i, resourcesProvider);
        Integer num2 = this.iconColor;
        int iIntValue2 = num2 != null ? num2.intValue() : Theme.getColor(i2, resourcesProvider);
        actionBarMenuSubItem.setTextColor(iIntValue);
        actionBarMenuSubItem.setIconColor(iIntValue2);
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(0.12f, Theme.getColor(i, resourcesProvider)));
        int i3 = this.minWidthDp;
        if (i3 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i3));
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(this.minWidthDp, -2));
            return actionBarMenuSubItem;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        return actionBarMenuSubItem;
    }

    public ItemOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z, boolean z2, boolean z3) {
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

    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 15:
                    ((PollVotesAlert) this.this$0).actionBarAnimation = null;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ItemOptions itemOptions = (ItemOptions) this.this$0;
                    DimView dimView = itemOptions.dimView;
                    if (dimView != null) {
                        dimView.setProgress(1.0f);
                        itemOptions.dimView.invalidate();
                    }
                    itemOptions.dimAnimator = null;
                    break;
                case 1:
                    FilterTabsView.TabView tabView = (FilterTabsView.TabView) this.this$0;
                    tabView.animateChange = false;
                    tabView.animateTabCounter = false;
                    tabView.animateTextChange = false;
                    tabView.animateTextX = false;
                    tabView.animateTabWidth = false;
                    tabView.changeAnimator = null;
                    tabView.invalidate();
                    break;
                case 2:
                    FilterTabsView filterTabsView = (FilterTabsView) this.this$0;
                    filterTabsView.tabLineColorKey = filterTabsView.aTabLineColorKey;
                    filterTabsView.backgroundColorKey = filterTabsView.aBackgroundColorKey;
                    filterTabsView.activeTextColorKey = filterTabsView.aActiveTextColorKey;
                    filterTabsView.unactiveTextColorKey = filterTabsView.aUnactiveTextColorKey;
                    filterTabsView.aTabLineColorKey = -1;
                    filterTabsView.aActiveTextColorKey = -1;
                    filterTabsView.aUnactiveTextColorKey = -1;
                    filterTabsView.aBackgroundColorKey = -1;
                    break;
                case 3:
                    FolderBottomSheet.Button button = (FolderBottomSheet.Button) this.this$0;
                    button.countScale = 1.0f;
                    button.invalidate();
                    break;
                case 4:
                    KeepMediaPopupView.ExceptionsView exceptionsView = (KeepMediaPopupView.ExceptionsView) this.this$0;
                    ((JoinCallAlert) exceptionsView.this$0).animationInProgress = false;
                    TextView[] textViewArr = (TextView[]) exceptionsView.avatarsImageView;
                    TextView textView = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView;
                    break;
                case 5:
                    JoinToSendSettingsView joinToSendSettingsView = (JoinToSendSettingsView) this.this$0;
                    if (!joinToSendSettingsView.isJoinToSend) {
                        joinToSendSettingsView.joinRequestCell.setVisibility(8);
                    }
                    break;
                case 6:
                    LinkActionView.AnonymousClass4 anonymousClass4 = (LinkActionView.AnonymousClass4) this.this$0;
                    if (((ChatActivity.AnonymousClass27) anonymousClass4.val$dimView).getParent() != null) {
                        anonymousClass4.val$finalContainer.removeView((ChatActivity.AnonymousClass27) anonymousClass4.val$dimView);
                    }
                    anonymousClass4.val$finalContainer.getViewTreeObserver().removeOnPreDrawListener((PhotoViewer.AnonymousClass9) anonymousClass4.val$preDrawListener);
                    break;
                case 7:
                    MessagePreviewView.Page page = (MessagePreviewView.Page) this.this$0;
                    page.this$0.offsetsAnimator = null;
                    page.setOffset(page.yOffset, page.chatTopOffset);
                    break;
                case 8:
                    NumberTextView numberTextView = (NumberTextView) this.this$0;
                    numberTextView.animator = null;
                    numberTextView.oldLetters.clear();
                    break;
                case 9:
                    Input input = (Input) this.this$0;
                    input.renderView.getPainting().commitPath(null, input.renderView.getCurrentColor(), true, null);
                    input.arrowAnimator = null;
                    break;
                case 10:
                    super.onAnimationEnd(animator);
                    LPhotoPaintView.PopupButton popupButton = (LPhotoPaintView.PopupButton) this.this$0;
                    ImageView imageView = popupButton.imageView;
                    popupButton.imageView = popupButton.image2View;
                    popupButton.image2View = imageView;
                    imageView.bringToFront();
                    popupButton.image2View.setVisibility(8);
                    popupButton.imageSwitchAnimator = null;
                    break;
                case 11:
                    PaintToolsView paintToolsView = (PaintToolsView) this.this$0;
                    if (animator == paintToolsView.nextSelectedAnimator) {
                        paintToolsView.selectedIndex = paintToolsView.nextSelectedIndex;
                        paintToolsView.nextSelectedIndex = -1;
                        paintToolsView.nextSelectedAnimator = null;
                    }
                    break;
                case 12:
                    PasscodeView passcodeView = (PasscodeView) this.this$0;
                    passcodeView.setVisibility(8);
                    passcodeView.onHidden();
                    passcodeView.shownT = 0.0f;
                    passcodeView.onAnimationUpdate(0.0f);
                    passcodeView.setAlpha(0.0f);
                    break;
                case 13:
                    AnimatorSet animatorSet = (AnimatorSet) this.this$0;
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    break;
                case 14:
                    zzr zzrVar = (zzr) this.this$0;
                    AnimatorSet animatorSet2 = ((PasscodeView.AnimatingTextView) zzrVar.zza).currentAnimation;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        ((PasscodeView.AnimatingTextView) zzrVar.zza).currentAnimation = null;
                        break;
                    }
                    break;
                case 15:
                    break;
                case 16:
                    PopupSwipeBackLayout popupSwipeBackLayout = (PopupSwipeBackLayout) this.this$0;
                    popupSwipeBackLayout.isAnimationInProgress = false;
                    popupSwipeBackLayout.foregroundAnimator = null;
                    break;
                case 17:
                    super.onAnimationEnd(animator);
                    GLIconTextureView gLIconTextureView = (GLIconTextureView) ((SelfStoriesPreviewView.AnonymousClass1) this.this$0).this$0;
                    gLIconTextureView.mRenderer.angleX = 0.0f;
                    gLIconTextureView.animatorSet = null;
                    gLIconTextureView.scheduleIdleAnimation(gLIconTextureView.idleDelay);
                    break;
                case 18:
                    PremiumButtonView premiumButtonView = (PremiumButtonView) this.this$0;
                    premiumButtonView.overlayProgress = premiumButtonView.showOverlay ? 1.0f : 0.0f;
                    premiumButtonView.updateOverlayProgress();
                    break;
                case 19:
                    VideoScreenPreview videoScreenPreview = (VideoScreenPreview) ((VideoScreenPreview.AnonymousClass3) this.this$0).this$0;
                    videoScreenPreview.firstFrameRendered = true;
                    videoScreenPreview.invalidate();
                    break;
                case 20:
                    BoostCounterView boostCounterView = (BoostCounterView) this.this$0;
                    boostCounterView.countScale = 1.0f;
                    boostCounterView.invalidate();
                    break;
                case 21:
                    ((PullForegroundDrawable) this.this$0).doNotShow();
                    break;
                case 22:
                    ((ReactedUsersListView) this.this$0).loadingView.setVisibility(8);
                    break;
                case 23:
                    ((ShareAlert$$ExternalSyntheticLambda29) this.this$0).run();
                    break;
                case 24:
                    ChatSelectionReactionMenuOverlay chatSelectionReactionMenuOverlay = (ChatSelectionReactionMenuOverlay) this.this$0;
                    chatSelectionReactionMenuOverlay.setVisibility(8);
                    ChatSelectionReactionMenuOverlay.AnonymousClass2 anonymousClass2 = chatSelectionReactionMenuOverlay.reactionsContainerLayout;
                    if (anonymousClass2 != null) {
                        chatSelectionReactionMenuOverlay.removeView(anonymousClass2);
                        chatSelectionReactionMenuOverlay.reactionsContainerLayout = null;
                    }
                    chatSelectionReactionMenuOverlay.currentPrimaryObject = null;
                    break;
                case 25:
                    ReactionsEffectOverlay.this.removeCurrentView();
                    break;
                case 26:
                    ((Runnable) this.this$0).run();
                    break;
                case 27:
                    RecyclerListView recyclerListView = (RecyclerListView) this.this$0;
                    View view = recyclerListView.emptyView;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (recyclerListView.hasSections()) {
                        recyclerListView.invalidate();
                    }
                    break;
                case 28:
                    ScrollSlidingTabStrip scrollSlidingTabStrip = (ScrollSlidingTabStrip) this.this$0;
                    if (scrollSlidingTabStrip.draggingView != null) {
                        scrollSlidingTabStrip.invalidateOverlays();
                        scrollSlidingTabStrip.draggingView.invalidate();
                        scrollSlidingTabStrip.tabsContainer.invalidate();
                        scrollSlidingTabStrip.invalidate();
                        scrollSlidingTabStrip.draggingView = null;
                    }
                    break;
                default:
                    ((ScrollableHorizontalScrollView) this.this$0).scrollingAnimation = false;
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 29:
                    ScrollableHorizontalScrollView scrollableHorizontalScrollView = (ScrollableHorizontalScrollView) this.this$0;
                    scrollableHorizontalScrollView.scrollingAnimation = true;
                    if (scrollableHorizontalScrollView.getParent() instanceof HorizontalScrollView) {
                        ((HorizontalScrollView) scrollableHorizontalScrollView.getParent()).requestDisallowInterceptTouchEvent(false);
                    }
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        private final void onAnimationEnd$org$telegram$ui$Components$PollVotesAlert$9(Animator animator) {
        }
    }

    public ItemOptions(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, Theme.ResourcesProvider resourcesProvider) {
        this.gravity = 5;
        this.point = new float[2];
        this.drawScrim = true;
        this.longPressSelectionEnabled = true;
        this.viewAdditionalOffsets = new Rect();
        this.dismissWithButtons = true;
        this.shiftDp = -4;
        this.followLoc = new int[2];
        this.hoverLoc = new int[2];
        Context context = actionBarPopupWindowLayout.getContext();
        this.context = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.resourcesProvider = resourcesProvider;
    }
}
