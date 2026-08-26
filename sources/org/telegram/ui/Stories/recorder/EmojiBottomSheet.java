package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.framework.media.zzq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda471;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DrawingInBackgroundThreadDrawable;
import org.telegram.ui.Components.EmojiTabsStrip;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchStateDrawable;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda1;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoryReactionWidgetBackground;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotCommandsMenuContainer;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.WebActionBar;

public class EmojiBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static int savedPosition = 1;
    public int categoryIndex;
    public TodoItemMenu$$ExternalSyntheticLambda17 drawBlurBitmap;
    public final boolean greeting;
    public float maxPadding;
    public Utilities.Callback3Return onDocumentSelected;
    public BusinessIntroActivity$$ExternalSyntheticLambda3 onPlusSelected;
    public Utilities.CallbackReturn onWidgetSelected;
    public final boolean onlyStickers;
    public final AnonymousClass2 plus;
    public String query;
    public final TabsView tabsView;
    public float top;
    public final PollItemMenu.AnonymousClass3 viewPager;
    public boolean wasKeyboardVisible;
    public final AnonymousClass1 widgets;

    public final class AnonymousClass1 extends TLRPC.Document {
    }

    public final class AnonymousClass2 extends TLRPC.Document {
    }

    public final class ContainerView extends FrameLayout {
        public final Paint backgroundBlurPaint;
        public final Paint backgroundPaint;
        public Bitmap blurBitmap;
        public Matrix blurBitmapMatrix;
        public BitmapShader blurBitmapShader;
        public final Paint handlePaint;
        public final RectF handleRect;
        public final AnimatedFloat isActionBarT;
        public Boolean overStatusBar;

        public ContainerView(Context context) {
            super(context);
            this.backgroundPaint = new Paint(1);
            this.backgroundBlurPaint = new Paint(3);
            this.handlePaint = new Paint(1);
            this.isActionBarT = new AnimatedFloat(this, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.handleRect = new RectF();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Paint paint = this.backgroundPaint;
            int i = Theme.key_dialogBackground;
            EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
            paint.setColor(Theme.getColor(i, ((BottomSheet) emojiBottomSheet).resourcesProvider));
            paint.setAlpha((int) ((this.blurBitmap == null ? 1.0f : 0.85f) * 255.0f));
            PollItemMenu.AnonymousClass3 anonymousClass3 = emojiBottomSheet.viewPager;
            View[] viewPages = anonymousClass3.getViewPages();
            emojiBottomSheet.top = 0.0f;
            boolean z = false;
            for (View view : viewPages) {
                if (view instanceof IPage) {
                    IPage iPage = (IPage) view;
                    emojiBottomSheet.top += Utilities.clamp(1.0f - Math.abs(iPage.getTranslationX() / iPage.getMeasuredWidth()), 1.0f, 0.0f) * iPage.top();
                    if (iPage.getVisibility() == 0) {
                        iPage.updateTops();
                    }
                }
            }
            float f = this.isActionBarT.set(emojiBottomSheet.top <= 0.0f ? 1.0f : 0.0f, false);
            float paddingTop = (emojiBottomSheet.top + anonymousClass3.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), anonymousClass3.getPaddingTop(), f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) emojiBottomSheet).backgroundPaddingLeft, paddingTop, getWidth() - ((BottomSheet) emojiBottomSheet).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
            if (this.blurBitmap != null) {
                this.blurBitmapMatrix.reset();
                this.blurBitmapMatrix.postScale(16.0f, 16.0f);
                this.blurBitmapMatrix.postTranslate(0.0f, -getY());
                this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.backgroundBlurPaint);
            }
            boolean z2 = rectF.top < ((float) AndroidUtilities.statusBarHeight);
            Boolean bool = this.overStatusBar;
            if (bool == null || bool.booleanValue() != z2) {
                this.overStatusBar = Boolean.valueOf(z2);
                Window window = emojiBottomSheet.getWindow();
                if (z2 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                    z = true;
                }
                AndroidUtilities.setLightStatusBar(window, z);
            }
            float f2 = 1.0f - f;
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f2, AndroidUtilities.dp(14.0f) * f2, paint);
            RectF rectF2 = this.handleRect;
            rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + getWidth()) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
            Paint paint2 = this.handlePaint;
            paint2.setColor(1367573379);
            paint2.setAlpha((int) (f2 * 81.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
            canvas.save();
            canvas.clipRect(rectF);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                float y = motionEvent.getY();
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                if (y < emojiBottomSheet.top) {
                    emojiBottomSheet.lambda$showGiftOfferSheet$15();
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bitmap bitmap = this.blurBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.backgroundBlurPaint.setShader(null);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.blurBitmap == null) {
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                if (((BottomSheet) emojiBottomSheet).resourcesProvider == null) {
                    if (!Theme.currentTheme.isDark()) {
                        return;
                    }
                } else if (!((BottomSheet) emojiBottomSheet).resourcesProvider.isDark()) {
                    return;
                }
                if (emojiBottomSheet.drawBlurBitmap == null || SharedConfig.getDevicePerformanceClass() <= 0 || LiteMode.isPowerSaverApplied()) {
                    return;
                }
                Point point = AndroidUtilities.displaySize;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                emojiBottomSheet.drawBlurBitmap.run(bitmapCreateBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(bitmapCreateBitmap, 8);
                this.blurBitmap = bitmapCreateBitmap;
                Paint paint = this.backgroundBlurPaint;
                Bitmap bitmap = this.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                if (this.blurBitmapMatrix == null) {
                    this.blurBitmapMatrix = new Matrix();
                }
                this.blurBitmapMatrix.postScale(16.0f, 16.0f);
                this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
                invalidate();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            float fMin = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
            EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
            emojiBottomSheet.maxPadding = fMin;
            emojiBottomSheet.viewPager.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
            emojiBottomSheet.viewPager.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            TabsView tabsView = emojiBottomSheet.tabsView;
            if (tabsView != null) {
                tabsView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            }
            setMeasuredDimension(size, size2);
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            invalidate();
        }
    }

    public final class EmojiListView extends RecyclerListView {
        public float bottomBound;
        public boolean emoji;
        public final ArrayList lineDrawables;
        public final ArrayList lineDrawablesTmp;
        public RecyclerAnimationScrollHelper scrollHelper;
        public boolean smoothScrolling;
        public float topBound;
        public final ArrayList unusedArrays;
        public final ArrayList unusedLineDrawables;
        public final SparseArray viewsGroupedByLines;
        public final PorterDuffColorFilter whiteFilter;

        public final class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            public ArrayList imageViewEmojis;
            public int position;
            public int startOffset;
            public final ArrayList drawInBackgroundViews = new ArrayList();
            public final boolean lite = LiteMode.isEnabled(8200);

            public DrawingInBackgroundLine() {
            }

            @Override
            public final void draw(Canvas canvas, long j, int i, int i2, float f) {
                if (this.imageViewEmojis == null) {
                    return;
                }
                RecyclerView.ItemAnimator itemAnimator = EmojiListView.this.mItemAnimator;
                boolean z = true;
                int i3 = 0;
                boolean z2 = (itemAnimator != null && itemAnimator.isRunning()) || this.imageViewEmojis.size() <= 4 || !this.lite;
                if (!z2) {
                    while (true) {
                        if (i3 >= this.imageViewEmojis.size()) {
                            z = z2;
                            break;
                        } else if (((EmojiImageView) this.imageViewEmojis.get(i3)).getScale() != 1.0f) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z = z2;
                    break;
                }
                if (!z) {
                    super.draw(canvas, j, i, i2, f);
                    return;
                }
                prepareDraw(System.currentTimeMillis());
                drawInUiThread(canvas, f);
                reset();
            }

            @Override
            public final void drawInBackground(Canvas canvas) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.drawInBackgroundViews;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    EmojiImageView emojiImageView = (EmojiImageView) arrayList.get(i);
                    emojiImageView.getClass();
                    AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                    if (animatedEmojiDrawable != null) {
                        animatedEmojiDrawable.setColorFilter(EmojiListView.this.whiteFilter);
                    }
                    emojiImageView.imageReceiverToDraw.draw(canvas, emojiImageView.backgroundThreadDrawHolder[this.threadIndex]);
                    i++;
                }
            }

            @Override
            public final void drawInUiThread(Canvas canvas, float f) {
                AnimatedEmojiDrawable animatedEmojiDrawable;
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    canvas.translate(-this.startOffset, 0.0f);
                    for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                        EmojiImageView emojiImageView = (EmojiImageView) this.imageViewEmojis.get(i);
                        emojiImageView.getClass();
                        float scale = emojiImageView.getScale();
                        float alpha = emojiImageView.getAlpha() * f;
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set(emojiImageView.getPaddingLeft() + ((int) emojiImageView.getX()), emojiImageView.getPaddingTop(), (emojiImageView.getWidth() + ((int) emojiImageView.getX())) - emojiImageView.getPaddingRight(), emojiImageView.getHeight() - emojiImageView.getPaddingBottom());
                        AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiImageView.drawable;
                        if (animatedEmojiDrawable2 != null) {
                            animatedEmojiDrawable2.setBounds(rect);
                        }
                        ImageReceiver imageReceiver = emojiImageView.imageReceiver;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        PorterDuffColorFilter porterDuffColorFilter = EmojiListView.this.whiteFilter;
                        if (porterDuffColorFilter != null && (animatedEmojiDrawable = emojiImageView.drawable) != null) {
                            animatedEmojiDrawable.setColorFilter(porterDuffColorFilter);
                        }
                        if (scale != 1.0f) {
                            canvas.save();
                            canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                            if (animatedEmojiDrawable2 != null) {
                                animatedEmojiDrawable2.setAlpha((int) (alpha * 255.0f));
                                animatedEmojiDrawable2.draw(canvas);
                            } else if (emojiImageView.imageReceiver != null) {
                                canvas.save();
                                canvas.clipRect(emojiImageView.imageReceiver.getImageX(), emojiImageView.imageReceiver.getImageY(), emojiImageView.imageReceiver.getImageX2(), emojiImageView.imageReceiver.getImageY2());
                                emojiImageView.imageReceiver.setAlpha(alpha);
                                emojiImageView.imageReceiver.draw(canvas);
                                canvas.restore();
                            }
                            canvas.restore();
                        } else if (animatedEmojiDrawable2 != null) {
                            animatedEmojiDrawable2.setAlpha((int) (alpha * 255.0f));
                            animatedEmojiDrawable2.draw(canvas);
                        } else if (emojiImageView.imageReceiver != null) {
                            canvas.save();
                            canvas.clipRect(emojiImageView.imageReceiver.getImageX(), emojiImageView.imageReceiver.getImageY(), emojiImageView.imageReceiver.getImageX2(), emojiImageView.imageReceiver.getImageY2());
                            emojiImageView.imageReceiver.setAlpha(alpha);
                            emojiImageView.imageReceiver.draw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }

            @Override
            public final void onFrameReady() {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.drawInBackgroundViews;
                    if (i >= arrayList.size()) {
                        EmojiListView.this.invalidate();
                        return;
                    }
                    ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((EmojiImageView) arrayList.get(i)).backgroundThreadDrawHolder[this.threadIndex];
                    if (backgroundThreadDrawHolder != null) {
                        backgroundThreadDrawHolder.release();
                    }
                    i++;
                }
            }

            @Override
            public final void prepareDraw(long j) {
                float intrinsicWidth;
                float width;
                int height;
                float f;
                int i;
                ArrayList arrayList = this.drawInBackgroundViews;
                arrayList.clear();
                for (int i2 = 0; i2 < this.imageViewEmojis.size(); i2++) {
                    EmojiImageView emojiImageView = (EmojiImageView) this.imageViewEmojis.get(i2);
                    emojiImageView.getClass();
                    AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                    ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : emojiImageView.imageReceiver;
                    if (imageReceiver != null) {
                        imageReceiver.setAlpha(emojiImageView.getAlpha());
                        AnimatedEmojiDrawable animatedEmojiDrawable2 = emojiImageView.drawable;
                        if (animatedEmojiDrawable2 != null) {
                            animatedEmojiDrawable2.setColorFilter(EmojiListView.this.whiteFilter);
                        }
                        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = emojiImageView.backgroundThreadDrawHolder;
                        int i3 = this.threadIndex;
                        backgroundThreadDrawHolderArr[i3] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i3], i3);
                        backgroundThreadDrawHolderArr[i3].time = j;
                        emojiImageView.imageReceiverToDraw = imageReceiver;
                        if (imageReceiver.getLottieAnimation() != null) {
                            emojiImageView.imageReceiverToDraw.getLottieAnimation().updateCurrentFrame(j);
                        }
                        if (emojiImageView.imageReceiverToDraw.getAnimation() != null) {
                            emojiImageView.imageReceiverToDraw.getAnimation().updateCurrentFrame(j);
                        }
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set(emojiImageView.getPaddingLeft(), emojiImageView.getPaddingTop(), emojiImageView.getWidth() - emojiImageView.getPaddingRight(), emojiImageView.getHeight() - emojiImageView.getPaddingBottom());
                        RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                        if (lottieAnimation == null || (i = lottieAnimation.height) == 0) {
                            AnimatedFileDrawable animation = imageReceiver.getAnimation();
                            if (animation == null || animation.getIntrinsicHeight() == 0) {
                                Bitmap bitmap = imageReceiver.getBitmap();
                                if (bitmap != null) {
                                    width = bitmap.getWidth();
                                    height = bitmap.getHeight();
                                } else {
                                    Drawable staticThumb = imageReceiver.getStaticThumb();
                                    intrinsicWidth = (staticThumb == null || staticThumb.getIntrinsicHeight() == 0) ? 1.0f : staticThumb.getIntrinsicWidth() / staticThumb.getIntrinsicHeight();
                                }
                                if (intrinsicWidth < 1.0f) {
                                    float fHeight = (rect.height() * intrinsicWidth) / 2.0f;
                                    int iCenterX = (int) (rect.centerX() - fHeight);
                                    int iCenterX2 = (int) (rect.centerX() + fHeight);
                                    rect.left = iCenterX;
                                    rect.right = iCenterX2;
                                } else if (intrinsicWidth > 1.0f) {
                                    float fWidth = (rect.width() / intrinsicWidth) / 2.0f;
                                    int iCenterY = (int) (rect.centerY() - fWidth);
                                    int iCenterY2 = (int) (rect.centerY() + fWidth);
                                    rect.top = iCenterY;
                                    rect.bottom = iCenterY2;
                                }
                                rect.offset((emojiImageView.getLeft() + ((int) emojiImageView.getTranslationX())) - this.startOffset, 0);
                                backgroundThreadDrawHolderArr[i3].setBounds(rect);
                                arrayList.add(emojiImageView);
                            } else {
                                width = animation.getIntrinsicWidth();
                                height = animation.getIntrinsicHeight();
                            }
                            f = height;
                        } else {
                            width = lottieAnimation.width;
                            f = i;
                        }
                        intrinsicWidth = width / f;
                        if (intrinsicWidth < 1.0f) {
                            float fHeight2 = (rect.height() * intrinsicWidth) / 2.0f;
                            int iCenterX3 = (int) (rect.centerX() - fHeight2);
                            int iCenterX4 = (int) (rect.centerX() + fHeight2);
                            rect.left = iCenterX3;
                            rect.right = iCenterX4;
                        } else if (intrinsicWidth > 1.0f) {
                            float fWidth2 = (rect.width() / intrinsicWidth) / 2.0f;
                            int iCenterY3 = (int) (rect.centerY() - fWidth2);
                            int iCenterY4 = (int) (rect.centerY() + fWidth2);
                            rect.top = iCenterY3;
                            rect.bottom = iCenterY4;
                        }
                        rect.offset((emojiImageView.getLeft() + ((int) emojiImageView.getTranslationX())) - this.startOffset, 0);
                        backgroundThreadDrawHolderArr[i3].setBounds(rect);
                        arrayList.add(emojiImageView);
                    }
                }
            }
        }

        public final class EmojiImageView extends View {
            public boolean attached;
            public final ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
            public final ButtonBounce bounce;
            public final int currentAccount;
            public long documentId;
            public AnimatedEmojiDrawable drawable;
            public boolean emoji;
            public ImageReceiver imageReceiver;
            public ImageReceiver imageReceiverToDraw;
            public final EmojiListView listView;

            public EmojiImageView(Context context, EmojiListView emojiListView) {
                super(context);
                this.currentAccount = UserConfig.selectedAccount;
                this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
                this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
                setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                this.listView = emojiListView;
            }

            public float getScale() {
                return this.bounce.getScale(0.15f);
            }

            @Override
            public final void invalidate() {
                this.listView.invalidate();
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.attached = true;
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.addView(this);
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onAttachedToWindow();
                }
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.attached = false;
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this);
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                }
            }

            @Override
            public final void onDraw(Canvas canvas) {
                ImageReceiver imageReceiver = this.imageReceiver;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                    this.imageReceiver.draw(canvas);
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                    this.drawable.draw(canvas);
                }
            }

            @Override
            public final void onMeasure(int i, int i2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
                super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
            }

            public void setDrawable(Drawable drawable) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this);
                }
                this.drawable = null;
                this.documentId = 0L;
                this.emoji = false;
                if (this.imageReceiver == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.imageReceiver = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.imageReceiver.setAspectFit(true);
                    if (this.attached) {
                        this.imageReceiver.onAttachedToWindow();
                    }
                }
                this.imageReceiver.setImageBitmap(drawable);
            }

            public final void setEmoji(TLRPC.Document document, boolean z) {
                if (this.documentId == (document == null ? 0L : document.id)) {
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this);
                }
                if (document == null) {
                    this.emoji = false;
                    this.documentId = 0L;
                    this.drawable = null;
                    return;
                }
                this.emoji = true;
                this.documentId = document.id;
                int i = EmojiBottomSheet.savedPosition;
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(this.currentAccount, LiteMode.isEnabled(z ? 1 : 16388) ? 3 : 13, document);
                this.drawable = animatedEmojiDrawableMake;
                if (this.attached) {
                    animatedEmojiDrawableMake.addView(this);
                }
            }

            @Override
            public void setPressed(boolean z) {
                super.setPressed(z);
                this.bounce.setPressed(z);
            }

            public void setSticker(TLRPC.Document document) {
                this.emoji = false;
                if (document == null) {
                    ImageReceiver imageReceiver = this.imageReceiver;
                    if (imageReceiver != null) {
                        this.documentId = 0L;
                        imageReceiver.clearImage();
                        return;
                    }
                    return;
                }
                long j = this.documentId;
                long j2 = document.id;
                if (j == j2) {
                    return;
                }
                this.documentId = j2;
                if (this.imageReceiver == null) {
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    this.imageReceiver = imageReceiver2;
                    imageReceiver2.setLayerNum(7);
                    this.imageReceiver.setAspectFit(true);
                    if (this.attached) {
                        this.imageReceiver.onAttachedToWindow();
                    }
                }
                this.imageReceiver.setParentView(!this.emoji ? this : this.listView);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                String strConcat = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
                if (!LiteMode.isEnabled(1)) {
                    strConcat = strConcat.concat("_firstframe");
                }
                this.imageReceiver.setImage(ImageLocation.getForDocument(document), strConcat, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
            }
        }

        public EmojiListView(Context context) {
            super(context, null);
            this.smoothScrolling = false;
            this.viewsGroupedByLines = new SparseArray();
            this.unusedArrays = new ArrayList();
            this.unusedLineDrawables = new ArrayList();
            this.lineDrawables = new ArrayList();
            this.lineDrawablesTmp = new ArrayList();
            this.whiteFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }

        public static void access$4100(EmojiListView emojiListView, int i, int i2) {
            if (emojiListView.scrollHelper == null || !(emojiListView.getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) emojiListView.getLayoutManager();
            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(i);
            int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            if ((viewFindViewByPosition == null && Math.abs(i - iFindFirstVisibleItemPosition) > gridLayoutManager.mSpanCount * 9.0f) || !SharedConfig.animationsEnabled()) {
                emojiListView.scrollHelper.scrollDirection = gridLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1;
                emojiListView.scrollHelper.scrollToPosition(i, i2, false, false);
            } else {
                EmojiView.AnonymousClass34 anonymousClass34 = new EmojiView.AnonymousClass34(emojiListView.getContext(), emojiListView);
                anonymousClass34.mTargetPosition = i;
                anonymousClass34.offset = i2;
                gridLayoutManager.startSmoothScroll(anonymousClass34);
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            SparseArray sparseArray;
            ArrayList arrayList;
            ArrayList arrayList2;
            DrawingInBackgroundLine drawingInBackgroundLine;
            DrawingInBackgroundLine drawingInBackgroundLine2;
            if (getVisibility() != 0) {
                return;
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.clipRect(0.0f, this.topBound, getWidth(), this.bottomBound);
            if (!this.emoji) {
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
            Rect rect = this.selectorRect;
            if (!rect.isEmpty()) {
                this.selectorDrawable.setBounds(rect);
                canvas.save();
                Consumer consumer = this.selectorTransformer;
                if (consumer != null) {
                    consumer.accept(canvas);
                }
                this.selectorDrawable.draw(canvas);
                canvas.restore();
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                sparseArray = this.viewsGroupedByLines;
                int size = sparseArray.size();
                arrayList = this.unusedArrays;
                if (i2 >= size) {
                    break;
                }
                ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i2);
                arrayList3.clear();
                arrayList.add(arrayList3);
                i2++;
            }
            sparseArray.clear();
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof EmojiImageView) {
                    EmojiImageView emojiImageView = (EmojiImageView) childAt;
                    if (emojiImageView.getY() < this.bottomBound && emojiImageView.getY() + emojiImageView.getHeight() > this.topBound) {
                        int y = this.smoothScrolling ? (int) emojiImageView.getY() : emojiImageView.getTop();
                        ArrayList arrayList4 = (ArrayList) sparseArray.get(y);
                        if (arrayList4 == null) {
                            arrayList4 = !arrayList.isEmpty() ? (ArrayList) arrayList.remove(arrayList.size() - 1) : new ArrayList();
                            sparseArray.put(y, arrayList4);
                        }
                        arrayList4.add(emojiImageView);
                    }
                }
            }
            ArrayList arrayList5 = this.lineDrawablesTmp;
            arrayList5.clear();
            ArrayList arrayList6 = this.lineDrawables;
            arrayList5.addAll(arrayList6);
            arrayList6.clear();
            canvas.save();
            canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray.size();
                arrayList2 = this.unusedLineDrawables;
                if (i4 >= size2) {
                    break;
                }
                ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i4);
                EmojiImageView emojiImageView2 = (EmojiImageView) arrayList7.get(i);
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(emojiImageView2);
                while (true) {
                    if (i >= arrayList5.size()) {
                        drawingInBackgroundLine = null;
                        break;
                    } else {
                        if (((DrawingInBackgroundLine) arrayList5.get(i)).position == childAdapterPosition) {
                            drawingInBackgroundLine = (DrawingInBackgroundLine) arrayList5.get(i);
                            arrayList5.remove(i);
                            break;
                        }
                        i++;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    if (arrayList2.isEmpty()) {
                        drawingInBackgroundLine2 = new DrawingInBackgroundLine();
                        drawingInBackgroundLine2.currentLayerNum = 7;
                        if (drawingInBackgroundLine2.attachedToWindow) {
                            drawingInBackgroundLine2.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~drawingInBackgroundLine2.currentLayerNum);
                        }
                    } else {
                        drawingInBackgroundLine2 = (DrawingInBackgroundLine) arrayList2.remove(arrayList2.size() - 1);
                    }
                    drawingInBackgroundLine = drawingInBackgroundLine2;
                    drawingInBackgroundLine.position = childAdapterPosition;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                arrayList6.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = arrayList7;
                canvas.save();
                canvas.translate(emojiImageView2.getLeft(), emojiImageView2.getY());
                drawingInBackgroundLine.startOffset = emojiImageView2.getLeft();
                int measuredWidth = getMeasuredWidth() - (emojiImageView2.getLeft() * 2);
                int measuredHeight = emojiImageView2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    drawingInBackgroundLine.draw(canvas, jCurrentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                }
                canvas.restore();
                i4++;
                i = 0;
            }
            for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                if (arrayList2.size() < 3) {
                    arrayList2.add((DrawingInBackgroundLine) arrayList5.get(i5));
                    ((DrawingInBackgroundLine) arrayList5.get(i5)).imageViewEmojis = null;
                    ((DrawingInBackgroundLine) arrayList5.get(i5)).reset();
                } else {
                    ((DrawingInBackgroundLine) arrayList5.get(i5)).onDetachFromWindow();
                }
            }
            arrayList5.clear();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2 != null && !(childAt2 instanceof EmojiImageView) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
                    canvas.save();
                    canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                    childAt2.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
            canvas.restoreToCount(saveCount);
        }

        @Override
        public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
            super.setLayoutManager(layoutManager);
            this.scrollHelper = null;
            if (layoutManager instanceof LinearLayoutManager) {
                RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this, (LinearLayoutManager) layoutManager);
                this.scrollHelper = recyclerAnimationScrollHelper;
                recyclerAnimationScrollHelper.animationCallback = new SelectAnimatedEmojiDialog.AnonymousClass16(this, 1);
                recyclerAnimationScrollHelper.scrollListener = new StoriesViewPager$$ExternalSyntheticLambda0(this, 24);
            }
        }
    }

    public final class GifPage extends IPage implements NotificationCenter.NotificationCenterDelegate {
        public final GifAdapter adapter;
        public final ArrayList gifs;
        public final GifLayoutManager layoutManager;
        public final BotCommandsMenuContainer.AnonymousClass1 listView;
        public final ArrayList mygifs;
        public final AnonymousClass4 previewDelegate;
        public final SearchField searchField;

        public final class AnonymousClass4 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
            @Override
            public final void addCaptionToGif(TLObject tLObject, Object obj) {
            }

            @Override
            public final void addToFavoriteSelected(String str) {
            }

            @Override
            public final boolean can() {
                return true;
            }

            @Override
            public final boolean canAddCaption() {
                return false;
            }

            @Override
            public final boolean canDeleteSticker() {
                return false;
            }

            @Override
            public final boolean canEditSticker() {
                return false;
            }

            @Override
            public final boolean canSchedule() {
                return false;
            }

            @Override
            public final boolean canSendSticker() {
                return true;
            }

            @Override
            public final Boolean canSetAsStatus(TLRPC.Document document) {
                return null;
            }

            @Override
            public final void copyEmoji(TLRPC.Document document) {
            }

            @Override
            public final void deleteSticker(TLRPC.Document document) {
            }

            @Override
            public final void editSticker(TLRPC.Document document) {
            }

            @Override
            public final ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1) {
                return null;
            }

            @Override
            public final long getDialogId() {
                return 0L;
            }

            @Override
            public final TLRPC.TL_messageMediaPoll getPoll() {
                return null;
            }

            @Override
            public final TLRPC.PollAnswer getPollAnswer() {
                return null;
            }

            @Override
            public final MessageObject getPollMessageObject() {
                return null;
            }

            @Override
            public final String getQuery(boolean z) {
                return null;
            }

            @Override
            public final void gifAddedOrDeleted() {
            }

            @Override
            public final boolean isInScheduleMode() {
                return false;
            }

            @Override
            public final boolean isPhotoEditor() {
                return true;
            }

            @Override
            public final boolean isReplacedSticker() {
                return false;
            }

            @Override
            public final boolean isSettingIntroSticker() {
                return false;
            }

            @Override
            public final boolean isStickerEditor() {
                return false;
            }

            @Override
            public final boolean needCopy(TLRPC.Document document) {
                return false;
            }

            @Override
            public final boolean needOpen() {
                return true;
            }

            @Override
            public final boolean needRemove() {
                return false;
            }

            @Override
            public final boolean needRemoveFromRecent(TLRPC.Document document) {
                return false;
            }

            @Override
            public final boolean needSend(int i) {
                return false;
            }

            @Override
            public final void newStickerPackSelected(CharSequence charSequence, String str, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
            }

            @Override
            public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
            }

            @Override
            public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
            }

            @Override
            public final void removeFromRecent(TLRPC.Document document) {
            }

            @Override
            public final void resetTouch() {
            }

            @Override
            public final void retractVote() {
            }

            @Override
            public final void sendEmoji(TLRPC.Document document) {
            }

            @Override
            public final void sendGif(int i, int i2, Object obj, TLObject tLObject, boolean z) {
            }

            @Override
            public final void sendSticker(String str) {
            }

            @Override
            public final void sendVote() {
            }

            @Override
            public final void setAsEmojiStatus(TLRPC.Document document) {
            }

            @Override
            public final void setIntroSticker(String str) {
            }

            @Override
            public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
            }

            @Override
            public final void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            }
        }

        public final class GifAdapter extends RecyclerListView.SelectionAdapter {
            public TLRPC.User bot;
            public String offset;
            public String query;
            public boolean requestedBot;
            public final VoIPFragment$12$$ExternalSyntheticLambda0 searchRunnable = new VoIPFragment$12$$ExternalSyntheticLambda0(this, 5);
            public int currentReqId = -1;
            public boolean requesting = false;

            public GifAdapter() {
            }

            public final Object getItem(int i) {
                int size = i - 1;
                GifPage gifPage = GifPage.this;
                if (!gifPage.mygifs.isEmpty() && TextUtils.isEmpty(this.query)) {
                    if (size >= 0 && size < gifPage.mygifs.size()) {
                        return gifPage.mygifs.get(size);
                    }
                    size -= gifPage.mygifs.size();
                }
                if (gifPage.gifs.isEmpty()) {
                    return null;
                }
                if (!gifPage.mygifs.isEmpty() && TextUtils.isEmpty(this.query)) {
                    size--;
                }
                if (size < 0 || size >= gifPage.gifs.size()) {
                    return null;
                }
                return gifPage.gifs.get(size);
            }

            @Override
            public final int getItemCount() {
                GifPage gifPage = GifPage.this;
                int size = 0;
                int size2 = ((gifPage.mygifs.isEmpty() || !TextUtils.isEmpty(this.query)) ? 0 : gifPage.mygifs.size()) + 1;
                if (!gifPage.gifs.isEmpty()) {
                    if (!gifPage.mygifs.isEmpty() && TextUtils.isEmpty(this.query)) {
                        size = 1;
                    }
                    size += gifPage.gifs.size();
                }
                return size2 + size;
            }

            @Override
            public final int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                int size = i - 1;
                GifPage gifPage = GifPage.this;
                if (!gifPage.mygifs.isEmpty() && TextUtils.isEmpty(this.query)) {
                    size -= gifPage.mygifs.size();
                }
                return (gifPage.gifs.isEmpty() || gifPage.mygifs.isEmpty() || !TextUtils.isEmpty(this.query) || size != 0) ? 2 : 1;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.mItemViewType == 2;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int i2 = viewHolder.mItemViewType;
                View view = viewHolder.itemView;
                if (i2 == 0) {
                    view.setTag(34);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) EmojiBottomSheet.this.maxPadding));
                    return;
                }
                if (i2 == 2) {
                    ContextLinkCell contextLinkCell = (ContextLinkCell) view;
                    Object item = getItem(i);
                    if (!(item instanceof TLRPC.Document)) {
                        if (item instanceof TLRPC.BotInlineResult) {
                            contextLinkCell.setLink((TLRPC.BotInlineResult) item, this.bot, true, false, false, true);
                            return;
                        }
                        return;
                    }
                    TLRPC.Document document = (TLRPC.Document) item;
                    contextLinkCell.getClass();
                    contextLinkCell.needDivider = false;
                    contextLinkCell.needShadow = false;
                    contextLinkCell.currentDate = 0;
                    contextLinkCell.inlineResult = null;
                    contextLinkCell.parentObject = "gif" + document;
                    contextLinkCell.documentAttach = document;
                    contextLinkCell.photoAttach = null;
                    contextLinkCell.mediaWebpage = true;
                    contextLinkCell.isForceGif = true;
                    contextLinkCell.setAttachType();
                    contextLinkCell.documentAttachType = 2;
                    contextLinkCell.requestLayout();
                    contextLinkCell.fileName = null;
                    contextLinkCell.fileExist = false;
                    contextLinkCell.resolvingFileName = false;
                    contextLinkCell.updateButtonState(false, false);
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                GifPage gifPage = GifPage.this;
                if (i == 0) {
                    view = new View(gifPage.getContext());
                } else if (i == 1) {
                    StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(gifPage.getContext(), false, false, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider, false);
                    stickerSetNameCell.setText(LocaleController.getString(R.string.FeaturedGifs), 0, null, 0, 0);
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.dp(2.5f);
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(5.5f);
                    stickerSetNameCell.setLayoutParams(layoutParams);
                    view = stickerSetNameCell;
                } else {
                    ContextLinkCell contextLinkCell = new ContextLinkCell(gifPage.getContext(), null, false);
                    contextLinkCell.getPhotoImage().setLayerNum(7);
                    if (contextLinkCell.buttonBounce == null) {
                        ButtonBounce buttonBounce = new ButtonBounce(contextLinkCell, 1.0f, 3.0f);
                        buttonBounce.releaseDelay = 120L;
                        contextLinkCell.buttonBounce = buttonBounce;
                    }
                    contextLinkCell.setIsKeyboard(true);
                    contextLinkCell.setCanPreviewGif(true);
                    view = contextLinkCell;
                }
                return new RecyclerListView.Holder(view);
            }

            public final void request$1() {
                if (this.requesting) {
                    return;
                }
                this.requesting = true;
                GifPage gifPage = GifPage.this;
                gifPage.searchField.showProgress(true);
                int i = this.currentReqId;
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                if (i >= 0) {
                    ConnectionsManager.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).cancelRequest(this.currentReqId, true);
                    this.currentReqId = -1;
                }
                if (this.bot == null) {
                    TLObject userOrChat = MessagesController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).getUserOrChat(MessagesController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).gifSearchBot);
                    if (userOrChat instanceof TLRPC.User) {
                        this.bot = (TLRPC.User) userOrChat;
                    }
                }
                TLRPC.User user = this.bot;
                if (user == null && !this.requestedBot) {
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = MessagesController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).gifSearchBot;
                    this.currentReqId = ConnectionsManager.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).sendRequest(tL_contacts_resolveUsername, new RichMediaUploader$$ExternalSyntheticLambda0(this, 5));
                    return;
                }
                if (user == null) {
                    return;
                }
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).getInputUser(this.bot);
                String str = this.query;
                if (str == null) {
                    str = "";
                }
                tL_messages_getInlineBotResults.query = str;
                boolean zIsEmpty = TextUtils.isEmpty(this.offset);
                String str2 = this.offset;
                tL_messages_getInlineBotResults.offset = str2 != null ? str2 : "";
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                String str3 = "gif_search_" + tL_messages_getInlineBotResults.query + "_" + tL_messages_getInlineBotResults.offset;
                MessagesStorage.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).getBotCache(str3, new ChatActivity$$ExternalSyntheticLambda471(this, zIsEmpty, tL_messages_getInlineBotResults, str3));
            }

            public final void updateItems(String str) {
                boolean zEquals = TextUtils.equals(this.query, str);
                GifPage gifPage = GifPage.this;
                if (!zEquals) {
                    if (this.currentReqId != -1) {
                        ConnectionsManager.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).cancelRequest(this.currentReqId, true);
                        this.currentReqId = -1;
                    }
                    this.requesting = false;
                    this.offset = "";
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.query);
                this.query = str;
                VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0 = this.searchRunnable;
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
                boolean zIsEmpty2 = TextUtils.isEmpty(str);
                RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
                if (zIsEmpty2) {
                    gifPage.gifs.clear();
                    gifPage.searchField.showProgress(false);
                    adapterDataObservable.notifyChanged();
                } else {
                    if (zIsEmpty) {
                        adapterDataObservable.notifyChanged();
                    }
                    gifPage.searchField.showProgress(true);
                    AndroidUtilities.runOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0, 1500L);
                }
            }
        }

        public final class GifLayoutManager extends ExtendedGridLayoutManager {
            public final Size size;

            public GifLayoutManager() {
                super(100, true);
                this.size = new Size();
                this.mSpanSizeLookup = new PeerColorActivity.Page.AnonymousClass2(this, 7);
            }

            @Override
            public final int getFlowItemCount() {
                return getItemCount();
            }

            @Override
            public final Size getSizeForItem(int i) {
                TLRPC.Document document;
                ArrayList<TLRPC.DocumentAttribute> arrayList;
                TLRPC.PhotoSize closestPhotoSizeWithSize;
                int i2;
                int i3;
                Size size = this.size;
                size.full = false;
                Object item = GifPage.this.adapter.getItem(i);
                if (item instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) item;
                    document = botInlineResult.document;
                    if (document != null) {
                        arrayList = document.attributes;
                    } else {
                        TLRPC.WebDocument webDocument = botInlineResult.content;
                        if (webDocument != null) {
                            arrayList = webDocument.attributes;
                        } else {
                            TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                            arrayList = webDocument2 != null ? webDocument2.attributes : null;
                        }
                    }
                } else {
                    if (!(item instanceof TLRPC.Document)) {
                        size.full = true;
                        return size;
                    }
                    document = (TLRPC.Document) item;
                    arrayList = document.attributes;
                }
                size.height = 100.0f;
                size.width = 100.0f;
                size.full = false;
                if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i2 = closestPhotoSizeWithSize.w) != 0 && (i3 = closestPhotoSizeWithSize.h) != 0) {
                    size.width = i2;
                    size.height = i3;
                }
                if (arrayList != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                        if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            size.width = documentAttribute.w;
                            size.height = documentAttribute.h;
                            break;
                        }
                    }
                }
                return size;
            }
        }

        public GifPage(Context context) {
            super(context);
            this.previewDelegate = new AnonymousClass4();
            this.mygifs = new ArrayList();
            this.gifs = new ArrayList();
            BotCommandsMenuContainer.AnonymousClass1 anonymousClass1 = new BotCommandsMenuContainer.AnonymousClass1(this, context, 1);
            this.listView = anonymousClass1;
            GifAdapter gifAdapter = new GifAdapter();
            this.adapter = gifAdapter;
            anonymousClass1.setAdapter(gifAdapter);
            GifLayoutManager gifLayoutManager = new GifLayoutManager();
            this.layoutManager = gifLayoutManager;
            anonymousClass1.setLayoutManager(gifLayoutManager);
            anonymousClass1.addItemDecoration(new MessageSeenView.AnonymousClass2(this, 8));
            anonymousClass1.setClipToPadding(true);
            anonymousClass1.setVerticalScrollBarEnabled(false);
            TopicsFragment$$ExternalSyntheticLambda9 topicsFragment$$ExternalSyntheticLambda9 = new TopicsFragment$$ExternalSyntheticLambda9(this, 16);
            anonymousClass1.setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda22(8, this, topicsFragment$$ExternalSyntheticLambda9));
            anonymousClass1.setOnItemClickListener(topicsFragment$$ExternalSyntheticLambda9);
            anonymousClass1.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 14));
            addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
            SearchField searchField = new SearchField(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
            this.searchField = searchField;
            searchField.onSearchQuery = new LinkManager$$ExternalSyntheticLambda1(this, 27);
            searchField.checkCategoriesView(2, false);
            addView(searchField, LayoutHelper.createFrame(-1, -2, 48));
        }

        @Override
        public final void bind(int i) {
            GifAdapter gifAdapter = this.adapter;
            GifPage.this.mygifs.clear();
            GifPage gifPage = GifPage.this;
            gifPage.mygifs.addAll(MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).getRecentGifs());
            if (this.gifs.isEmpty() && TextUtils.isEmpty(EmojiBottomSheet.this.query)) {
                gifAdapter.request$1();
            }
            gifAdapter.updateItems(null);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.recentDocumentsDidLoad) {
                GifAdapter gifAdapter = this.adapter;
                GifPage.this.mygifs.clear();
                GifPage gifPage = GifPage.this;
                gifPage.mygifs.addAll(MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).getRecentGifs());
                gifAdapter.mObservable.notifyChanged();
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
            setPadding(((BottomSheet) emojiBottomSheet).backgroundPaddingLeft, 0, ((BottomSheet) emojiBottomSheet).backgroundPaddingLeft, AndroidUtilities.navigationBarHeight);
            super.onMeasure(i, i2);
        }

        @Override
        public final float top() {
            int i = 0;
            while (true) {
                BotCommandsMenuContainer.AnonymousClass1 anonymousClass1 = this.listView;
                if (i >= anonymousClass1.getChildCount()) {
                    return 0.0f;
                }
                View childAt = anonymousClass1.getChildAt(i);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i++;
            }
        }

        @Override
        public final void updateTops() {
            this.searchField.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, top()));
        }
    }

    public abstract class IPage extends FrameLayout {
        public int currentType;

        public abstract void bind(int i);

        public abstract float top();

        public abstract void updateTops();
    }

    public final class NoEmojiView extends FrameLayout {
        public final BackupImageView imageView;
        public int lastI;

        public NoEmojiView(Context context, boolean z) {
            super(context);
            this.lastI = -1;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(36, 36, 17));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            textView.setText(LocaleController.getString(z ? R.string.NoEmojiFound : R.string.NoStickersFound));
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(170.0f), (AndroidUtilities.displaySize.y * 0.34999996f) - AndroidUtilities.dp(142.0f)), 1073741824));
        }
    }

    public final class Page extends IPage {
        public final Adapter adapter;
        public final GridLayoutManager layoutManager;
        public final EmojiListView listView;
        public float lockTop;
        public boolean resetOnce;
        public final SearchField searchField;
        public int spanCount;
        public final AnonymousClass3 tabsStrip;

        public final class Adapter extends RecyclerView.Adapter {
            public String activeQuery;
            public TLRPC.TL_messages_stickerSet faveSet;
            public boolean includeNotFound;
            public int lastAllSetsCount;
            public String[] lastLang;
            public String query;
            public TLRPC.TL_messages_stickerSet recentSet;
            public int searchId;
            public final TLRPC.TL_inputStickerSetShortName staticEmojiInput;
            public final HashMap allEmojis = new HashMap();
            public final HashMap packsBySet = new HashMap();
            public final HashMap setByDocumentId = new HashMap();
            public final ArrayList allStickerSets = new ArrayList();
            public final ArrayList stickerSets = new ArrayList();
            public final ArrayList packs = new ArrayList();
            public final ArrayList documents = new ArrayList();
            public final ArrayList documentIds = new ArrayList();
            public int itemsCount = 0;
            public final SparseIntArray positionToSection = new SparseIntArray();
            public final HashSet searchDocumentIds = new HashSet();
            public final VoIPFragment$12$$ExternalSyntheticLambda0 searchRunnable = new VoIPFragment$12$$ExternalSyntheticLambda0(this, 6);

            public Adapter() {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                this.staticEmojiInput = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = "StaticEmoji";
            }

            @Override
            public final int getItemCount() {
                return this.itemsCount;
            }

            @Override
            public final int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                if (this.includeNotFound && i == this.itemsCount - 1) {
                    return 3;
                }
                if (this.positionToSection.get(i, -1) >= 0) {
                    return 1;
                }
                if (i < 0) {
                    return 2;
                }
                ArrayList arrayList = this.documents;
                return (i >= arrayList.size() || arrayList.get(i) != EmojiBottomSheet.this.widgets) ? 2 : 4;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TLRPC.StickerSet stickerSet;
                int i2 = viewHolder.mItemViewType;
                Page page = Page.this;
                View view = viewHolder.itemView;
                if (i2 == 0) {
                    view.setTag(34);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) EmojiBottomSheet.this.maxPadding));
                    return;
                }
                if (i2 == 1) {
                    int i3 = this.positionToSection.get(i);
                    if (i3 >= 0) {
                        ArrayList arrayList = this.stickerSets;
                        if (i3 >= arrayList.size()) {
                            return;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                        String str = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? "" : stickerSet.title;
                        StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) view;
                        if (this.activeQuery == null) {
                            stickerSetNameCell.setText(str, 0, null, 0, 0);
                            return;
                        }
                        int iIndexOf = str.toLowerCase().indexOf(this.activeQuery.toLowerCase());
                        if (iIndexOf < 0) {
                            stickerSetNameCell.setText(str, 0, null, 0, 0);
                            return;
                        } else {
                            stickerSetNameCell.setText(str, 0, null, iIndexOf, this.activeQuery.length());
                            return;
                        }
                    }
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        NoEmojiView noEmojiView = (NoEmojiView) view;
                        int i4 = this.searchId;
                        if (noEmojiView.lastI != i4) {
                            noEmojiView.lastI = i4;
                            SelectAnimatedEmojiDialog.updateSearchEmptyViewImage(UserConfig.selectedAccount, noEmojiView.imageView);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = this.documents;
                TLRPC.Document document = i >= arrayList2.size() ? null : (TLRPC.Document) arrayList2.get(i);
                EmojiListView.EmojiImageView emojiImageView = (EmojiListView.EmojiImageView) view;
                if (document == EmojiBottomSheet.this.plus) {
                    emojiImageView.setSticker(null);
                    int iDp = AndroidUtilities.dp(28.0f);
                    EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                    int i5 = Theme.key_chat_emojiPanelIcon;
                    ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.12f, emojiBottomSheet.getThemedColor(i5)));
                    Drawable drawableMutate = page.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(emojiBottomSheet.getThemedColor(i5), PorterDuff.Mode.MULTIPLY));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(shapeDrawableCreateRoundRectDrawable, drawableMutate);
                    int iDp2 = AndroidUtilities.dp(56.0f);
                    int iDp3 = AndroidUtilities.dp(56.0f);
                    combinedDrawable.backWidth = iDp2;
                    combinedDrawable.backHeight = iDp3;
                    int iDp4 = AndroidUtilities.dp(24.0f);
                    int iDp5 = AndroidUtilities.dp(24.0f);
                    combinedDrawable.iconWidth = iDp4;
                    combinedDrawable.iconHeight = iDp5;
                    combinedDrawable.center = true;
                    emojiImageView.setDrawable(combinedDrawable);
                    return;
                }
                ArrayList arrayList3 = this.documentIds;
                long jLongValue = i >= arrayList3.size() ? 0L : ((Long) arrayList3.get(i)).longValue();
                if (document == null && jLongValue == 0) {
                    return;
                }
                int i6 = page.currentType;
                if (i6 != 0) {
                    emojiImageView.setEmoji(null, i6 == 1);
                    emojiImageView.setSticker(document);
                    return;
                }
                if (document != null) {
                    emojiImageView.setSticker(null);
                    emojiImageView.setEmoji(document, page.currentType == 1);
                    return;
                }
                emojiImageView.setSticker(null);
                boolean z = page.currentType == 1;
                if (emojiImageView.documentId == jLongValue) {
                    return;
                }
                AnimatedEmojiDrawable animatedEmojiDrawable = emojiImageView.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(emojiImageView);
                }
                if (jLongValue == 0) {
                    emojiImageView.emoji = false;
                    emojiImageView.documentId = 0L;
                    emojiImageView.drawable = null;
                    return;
                }
                emojiImageView.emoji = true;
                emojiImageView.documentId = jLongValue;
                AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(emojiImageView.currentAccount, jLongValue, null, LiteMode.isEnabled(z ? 1 : 16388) ? 3 : 13);
                emojiImageView.drawable = animatedEmojiDrawableMake;
                if (emojiImageView.attached) {
                    animatedEmojiDrawableMake.addView(emojiImageView);
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View stickerSetNameCell;
                Page page = Page.this;
                if (i == 0) {
                    stickerSetNameCell = new View(page.getContext());
                } else {
                    if (i == 1) {
                        stickerSetNameCell = new StickerSetNameCell(page.getContext(), true, false, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider, false);
                    } else if (i == 3) {
                        stickerSetNameCell = new NoEmojiView(page.getContext(), page.currentType == 0);
                    } else if (i == 4) {
                        StoryWidgetsCell storyWidgetsCell = EmojiBottomSheet.this.new StoryWidgetsCell(page.getContext());
                        storyWidgetsCell.onClickListener = new EmojiBottomSheet$$ExternalSyntheticLambda1(EmojiBottomSheet.this, 2);
                        stickerSetNameCell = storyWidgetsCell;
                    } else {
                        stickerSetNameCell = new EmojiListView.EmojiImageView(page.getContext(), page.listView);
                    }
                }
                return new RecyclerListView.Holder(stickerSetNameCell);
            }

            public final void updateItems$1(String str) {
                TLRPC.TL_messages_stickerSet stickerSet;
                ArrayList<TLRPC.StickerSetCovered> arrayList;
                int i;
                TLRPC.TL_messages_stickerSet stickerSet2;
                ArrayList<TLRPC.StickerSetCovered> arrayList2;
                int i2;
                HashMap map;
                ArrayList arrayList3;
                int i3;
                ArrayList arrayList4;
                int i4;
                TLRPC.StickerSet stickerSet3;
                this.query = str;
                VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0 = this.searchRunnable;
                Page page = Page.this;
                int i5 = 1;
                if (str != null) {
                    page.searchField.showProgress(true);
                    AnonymousClass3 anonymousClass3 = page.tabsStrip;
                    anonymousClass3.showSelected = false;
                    anonymousClass3.contentView.invalidate();
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
                    AndroidUtilities.runOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0, 100L);
                    return;
                }
                AnonymousClass3 anonymousClass4 = page.tabsStrip;
                anonymousClass4.showSelected = true;
                anonymousClass4.contentView.invalidate();
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                MediaDataController mediaDataController = MediaDataController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount);
                this.itemsCount = 0;
                ArrayList arrayList5 = this.documents;
                arrayList5.clear();
                this.documentIds.clear();
                SparseIntArray sparseIntArray = this.positionToSection;
                sparseIntArray.clear();
                ArrayList arrayList6 = this.stickerSets;
                arrayList6.clear();
                ArrayList arrayList7 = this.allStickerSets;
                arrayList7.clear();
                HashMap map2 = this.setByDocumentId;
                map2.clear();
                this.itemsCount++;
                boolean z = false;
                arrayList5.add(null);
                ArrayList arrayList8 = this.packs;
                arrayList8.clear();
                if (page.currentType == 1) {
                    if (emojiBottomSheet.onWidgetSelected != null && (emojiBottomSheet.canShowWidget(0) || emojiBottomSheet.canShowWidget(1) || emojiBottomSheet.canShowWidget(2) || emojiBottomSheet.canShowWidget(3) || emojiBottomSheet.canShowWidget(4))) {
                        arrayList5.add(emojiBottomSheet.widgets);
                        this.itemsCount++;
                    }
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(2);
                    if (recentStickers != null && !recentStickers.isEmpty()) {
                        if (this.faveSet == null) {
                            this.faveSet = new TLRPC.TL_messages_stickerSet();
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.faveSet;
                        tL_messages_stickerSet.documents = recentStickers;
                        tL_messages_stickerSet.set = new TLRPC.TL_stickerSet();
                        this.faveSet.set.title = LocaleController.getString(R.string.FavoriteStickers);
                        arrayList6.add(this.faveSet);
                    }
                    ArrayList<TLRPC.Document> recentStickers2 = mediaDataController.getRecentStickers(0);
                    if (recentStickers2 != null && !recentStickers2.isEmpty()) {
                        if (this.recentSet == null) {
                            this.recentSet = new TLRPC.TL_messages_stickerSet();
                        }
                        this.recentSet.documents = recentStickers2;
                        if (emojiBottomSheet.onPlusSelected != null) {
                            recentStickers2.add(0, emojiBottomSheet.plus);
                        }
                        this.recentSet.set = new TLRPC.TL_stickerSet();
                        this.recentSet.set.title = LocaleController.getString(R.string.RecentStickers);
                        arrayList6.add(this.recentSet);
                    }
                }
                arrayList6.addAll(mediaDataController.getStickerSets(page.currentType == 0 ? 5 : 0));
                int i6 = 0;
                while (i6 < arrayList6.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i6);
                    sparseIntArray.put(this.itemsCount, i6);
                    arrayList5.add(z);
                    this.itemsCount += i5;
                    arrayList5.addAll(tL_messages_stickerSet2.documents);
                    this.itemsCount = tL_messages_stickerSet2.documents.size() + this.itemsCount;
                    Object obj = tL_messages_stickerSet2 == this.recentSet ? "recent" : tL_messages_stickerSet2 == this.faveSet ? "fav" : tL_messages_stickerSet2;
                    int i7 = 0;
                    while (i7 < tL_messages_stickerSet2.documents.size()) {
                        map2.put(Long.valueOf(tL_messages_stickerSet2.documents.get(i7).id), obj);
                        i7++;
                        arrayList5 = arrayList5;
                    }
                    ArrayList arrayList9 = arrayList5;
                    EmojiView.EmojiPack emojiPack = new EmojiView.EmojiPack();
                    emojiPack.documents = tL_messages_stickerSet2.documents;
                    emojiPack.set = tL_messages_stickerSet2.set;
                    emojiPack.installed = true;
                    emojiPack.featured = false;
                    emojiPack.expanded = true;
                    emojiPack.free = true;
                    if (tL_messages_stickerSet2 == this.faveSet) {
                        emojiPack.resId = R.drawable.emoji_tabs_faves;
                    } else if (tL_messages_stickerSet2 == this.recentSet) {
                        emojiPack.resId = R.drawable.msg_emoji_recent;
                    }
                    arrayList8.add(emojiPack);
                    arrayList7.add(tL_messages_stickerSet2);
                    i6++;
                    arrayList5 = arrayList9;
                    i5 = 1;
                    z = false;
                }
                ArrayList arrayList10 = arrayList5;
                if (page.currentType == 0) {
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
                    if (featuredEmojiSets != null) {
                        int i8 = 0;
                        while (i8 < featuredEmojiSets.size()) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i8);
                            if (!(stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                                    TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                    tL_messages_stickerSet3.set = stickerSet4;
                                    tL_messages_stickerSet3.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    HashMap map3 = this.packsBySet;
                                    ArrayList<TLRPC.TL_stickerPack> arrayList11 = (ArrayList) map3.get(Long.valueOf(stickerSet4.id));
                                    tL_messages_stickerSet3.packs = arrayList11;
                                    if (arrayList11 == null) {
                                        HashMap map4 = new HashMap();
                                        int i9 = 0;
                                        while (i9 < tL_messages_stickerSet3.documents.size()) {
                                            TLRPC.Document document = tL_messages_stickerSet3.documents.get(i9);
                                            if (document == null) {
                                                arrayList2 = featuredEmojiSets;
                                                i2 = i8;
                                            } else {
                                                arrayList2 = featuredEmojiSets;
                                                ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(MessageObject.findAnimatedEmojiEmoticon(document, null));
                                                i2 = i8;
                                                if (emojis != null) {
                                                    int iM = 0;
                                                    while (iM < emojis.size()) {
                                                        String string = emojis.get(iM).code.toString();
                                                        ArrayList arrayList12 = (ArrayList) map4.get(string);
                                                        ArrayList<Emoji.EmojiSpanRange> arrayList13 = emojis;
                                                        if (arrayList12 == null) {
                                                            arrayList3 = new ArrayList();
                                                            map4.put(string, arrayList3);
                                                        } else {
                                                            arrayList3 = arrayList12;
                                                        }
                                                        HashMap map5 = map4;
                                                        iM = MessagesController$$ExternalSyntheticOutline2.m(document.id, arrayList3, iM, 1);
                                                        map4 = map5;
                                                        emojis = arrayList13;
                                                        document = document;
                                                    }
                                                    map = map4;
                                                }
                                                i9++;
                                                featuredEmojiSets = arrayList2;
                                                i8 = i2;
                                                map4 = map;
                                            }
                                            map = map4;
                                            i9++;
                                            featuredEmojiSets = arrayList2;
                                            i8 = i2;
                                            map4 = map;
                                        }
                                        arrayList = featuredEmojiSets;
                                        i = i8;
                                        tL_messages_stickerSet3.packs = new ArrayList<>();
                                        for (Map.Entry entry : map4.entrySet()) {
                                            TLRPC.TL_stickerPack tL_stickerPack = new TLRPC.TL_stickerPack();
                                            tL_stickerPack.emoticon = (String) entry.getKey();
                                            tL_stickerPack.documents = (ArrayList) entry.getValue();
                                            tL_messages_stickerSet3.packs.add(tL_stickerPack);
                                        }
                                        map3.put(Long.valueOf(tL_messages_stickerSet3.set.id), tL_messages_stickerSet3.packs);
                                    } else {
                                        arrayList = featuredEmojiSets;
                                        i = i8;
                                    }
                                    stickerSet2 = tL_messages_stickerSet3;
                                    if (stickerSet2.set == null) {
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < arrayList8.size()) {
                                                arrayList6.add(stickerSet2);
                                                arrayList7.add(stickerSet2);
                                                sparseIntArray.put(this.itemsCount, i6);
                                                i6++;
                                                arrayList4 = arrayList10;
                                                arrayList4.add(null);
                                                this.itemsCount++;
                                                arrayList4.addAll(stickerSet2.documents);
                                                this.itemsCount = stickerSet2.documents.size() + this.itemsCount;
                                                for (i4 = 0; i4 < stickerSet2.documents.size(); i4++) {
                                                    map2.put(Long.valueOf(stickerSet2.documents.get(i4).id), stickerSet2);
                                                }
                                                EmojiView.EmojiPack emojiPack2 = new EmojiView.EmojiPack();
                                                emojiPack2.documents = stickerSet2.documents;
                                                emojiPack2.set = stickerSet2.set;
                                                emojiPack2.installed = false;
                                                emojiPack2.featured = true;
                                                emojiPack2.expanded = true;
                                                emojiPack2.free = true;
                                                arrayList8.add(emojiPack2);
                                                break;
                                                break;
                                            }
                                            stickerSet3 = ((EmojiView.EmojiPack) arrayList8.get(i3)).set;
                                            if (stickerSet3 != null) {
                                            }
                                            i3++;
                                        }
                                    }
                                } else {
                                    emojiBottomSheet = emojiBottomSheet;
                                    arrayList = featuredEmojiSets;
                                    i = i8;
                                }
                                arrayList4 = arrayList10;
                                break;
                                break;
                            }
                            stickerSet2 = MediaDataController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                            if (stickerSet2 != null) {
                                emojiBottomSheet = emojiBottomSheet;
                                arrayList = featuredEmojiSets;
                                i = i8;
                                if (stickerSet2.set == null) {
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < arrayList8.size()) {
                                            arrayList6.add(stickerSet2);
                                            arrayList7.add(stickerSet2);
                                            sparseIntArray.put(this.itemsCount, i6);
                                            i6++;
                                            arrayList4 = arrayList10;
                                            arrayList4.add(null);
                                            this.itemsCount++;
                                            arrayList4.addAll(stickerSet2.documents);
                                            this.itemsCount = stickerSet2.documents.size() + this.itemsCount;
                                            while (i4 < stickerSet2.documents.size()) {
                                                map2.put(Long.valueOf(stickerSet2.documents.get(i4).id), stickerSet2);
                                            }
                                            EmojiView.EmojiPack emojiPack3 = new EmojiView.EmojiPack();
                                            emojiPack3.documents = stickerSet2.documents;
                                            emojiPack3.set = stickerSet2.set;
                                            emojiPack3.installed = false;
                                            emojiPack3.featured = true;
                                            emojiPack3.expanded = true;
                                            emojiPack3.free = true;
                                            arrayList8.add(emojiPack3);
                                            break;
                                        }
                                        stickerSet3 = ((EmojiView.EmojiPack) arrayList8.get(i3)).set;
                                        if (stickerSet3 != null || stickerSet3.id != stickerSet2.set.id) {
                                            i3++;
                                        }
                                    }
                                }
                            } else {
                                emojiBottomSheet = emojiBottomSheet;
                                arrayList = featuredEmojiSets;
                                i = i8;
                            }
                            arrayList4 = arrayList10;
                            break;
                            i8 = i + 1;
                            arrayList10 = arrayList4;
                            emojiBottomSheet = emojiBottomSheet;
                            featuredEmojiSets = arrayList;
                        }
                    }
                    boolean zContains = false;
                    for (int i10 = 0; i10 < arrayList7.size(); i10++) {
                        try {
                            zContains = ((TLRPC.TL_messages_stickerSet) arrayList7.get(i10)).set.title.toLowerCase().contains("staticemoji");
                        } catch (Exception unused) {
                        }
                        if (zContains) {
                            break;
                        }
                    }
                    if (!zContains && (stickerSet = mediaDataController.getStickerSet((TLRPC.InputStickerSet) this.staticEmojiInput, false)) != null) {
                        arrayList7.add(stickerSet);
                    }
                }
                page.resetOnce = true;
                if (this.lastAllSetsCount != arrayList7.size()) {
                    HashMap map6 = this.allEmojis;
                    map6.clear();
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList7.get(i11);
                        if (tL_messages_stickerSet4 != null) {
                            for (int i12 = 0; i12 < tL_messages_stickerSet4.packs.size(); i12++) {
                                String str2 = tL_messages_stickerSet4.packs.get(i12).emoticon;
                                ArrayList arrayList14 = (ArrayList) map6.get(str2);
                                if (arrayList14 == null) {
                                    arrayList14 = new ArrayList();
                                    map6.put(str2, arrayList14);
                                }
                                arrayList14.addAll(tL_messages_stickerSet4.packs.get(i12).documents);
                            }
                        }
                    }
                    this.lastAllSetsCount = arrayList7.size();
                }
                this.includeNotFound = false;
                page.tabsStrip.updateEmojiPacks(arrayList8);
                this.activeQuery = null;
                this.mObservable.notifyChanged();
            }
        }

        public Page(Context context) {
            super(context);
            this.spanCount = 8;
            this.lockTop = -1.0f;
            this.resetOnce = false;
            EmojiListView emojiListView = new EmojiListView(context);
            this.listView = emojiListView;
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            emojiListView.setAdapter(adapter);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.spanCount);
            this.layoutManager = gridLayoutManager;
            emojiListView.setLayoutManager(gridLayoutManager);
            emojiListView.setClipToPadding(true);
            emojiListView.setVerticalScrollBarEnabled(false);
            gridLayoutManager.mSpanSizeLookup = new PeerColorActivity.Page.AnonymousClass2(this, 8);
            emojiListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 17));
            emojiListView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 15));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mAddDuration = 220L;
            defaultItemAnimator.mMoveDuration = 220L;
            defaultItemAnimator.mChangeAddDuration = 160L;
            defaultItemAnimator.mChangeRemoveDuration = 160L;
            defaultItemAnimator.mMoveInterpolator = CubicBezierInterpolator.EASE_OUT;
            emojiListView.setItemAnimator(defaultItemAnimator);
            addView(emojiListView, LayoutHelper.createFrame(-1.0f, -1));
            SearchField searchField = new SearchField(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider);
            this.searchField = searchField;
            searchField.onSearchQuery = new LinkManager$$ExternalSyntheticLambda1(this, 28);
            addView(searchField, LayoutHelper.createFrame(-1, -2, 48));
            ?? r0 = new EmojiTabsStrip(context, ((BottomSheet) EmojiBottomSheet.this).resourcesProvider) {
                {
                    int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider);
                }

                @Override
                public final boolean onTabClick(int i) {
                    int iKeyAt;
                    int paddingTop;
                    SearchField.AnonymousClass5 anonymousClass5;
                    int i2 = 0;
                    if (this.scrollingAnimation) {
                        return false;
                    }
                    Page page = Page.this;
                    SearchField searchField2 = page.searchField;
                    EmojiListView emojiListView2 = page.listView;
                    if (searchField2 != null && (anonymousClass5 = searchField2.categoriesListView) != null) {
                        StickerCategoriesListView.EmojiCategory selectedCategory = anonymousClass5.getSelectedCategory();
                        SearchField searchField3 = page.searchField;
                        if (selectedCategory != null) {
                            EmojiListView.access$4100(emojiListView2, 0, 0);
                            searchField3.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        }
                        searchField3.categoriesListView.scrollToStart();
                        searchField3.clear();
                    }
                    Adapter adapter2 = page.adapter;
                    if (adapter2 != null) {
                        adapter2.updateItems$1(null);
                    }
                    while (true) {
                        if (i2 >= adapter2.positionToSection.size()) {
                            iKeyAt = -1;
                            break;
                        }
                        iKeyAt = adapter2.positionToSection.keyAt(i2);
                        if (adapter2.positionToSection.valueAt(i2) == i) {
                            break;
                        }
                        i2++;
                    }
                    if (iKeyAt < 0) {
                        return true;
                    }
                    float pVar = page.lockTop;
                    if (pVar >= 0.0f) {
                        paddingTop = emojiListView2.getPaddingTop();
                    } else {
                        pVar = page.top();
                        page.lockTop = pVar;
                        paddingTop = emojiListView2.getPaddingTop();
                    }
                    EmojiListView.access$4100(emojiListView2, iKeyAt, ((int) (pVar + paddingTop)) - AndroidUtilities.dp(102.0f));
                    return true;
                }
            };
            this.tabsStrip = r0;
            addView((View) r0, LayoutHelper.createFrame(36.0f, -1));
        }

        @Override
        public final void bind(int i) {
            this.currentType = i;
            this.listView.emoji = i == 0;
            GridLayoutManager gridLayoutManager = this.layoutManager;
            int i2 = i == 0 ? 8 : 5;
            this.spanCount = i2;
            gridLayoutManager.setSpanCount(i2);
            boolean z = this.resetOnce;
            Adapter adapter = this.adapter;
            if (!z) {
                adapter.updateItems$1(null);
            }
            EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
            int i3 = emojiBottomSheet.categoryIndex;
            SearchField searchField = this.searchField;
            if (i3 >= 0) {
                searchField.ignoreTextChange = true;
                searchField.editText.setText("");
                searchField.ignoreTextChange = false;
                SearchField.AnonymousClass5 anonymousClass5 = searchField.categoriesListView;
                if (anonymousClass5 != null) {
                    anonymousClass5.selectCategory(emojiBottomSheet.categoryIndex);
                    searchField.categoriesListView.scrollToSelected();
                    if (searchField.categoriesListView.getSelectedCategory() != null) {
                        adapter.query = searchField.categoriesListView.getSelectedCategory().emojis;
                        VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0 = adapter.searchRunnable;
                        AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
                        AndroidUtilities.runOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
                    }
                }
            } else if (TextUtils.isEmpty(emojiBottomSheet.query)) {
                searchField.clear();
            } else {
                searchField.editText.setText(emojiBottomSheet.query);
                SearchField.AnonymousClass5 anonymousClass6 = searchField.categoriesListView;
                if (anonymousClass6 != null) {
                    anonymousClass6.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    searchField.categoriesListView.scrollToStart();
                }
                AndroidUtilities.cancelRunOnUIThread(adapter.searchRunnable);
                AndroidUtilities.runOnUIThread(adapter.searchRunnable);
            }
            searchField.checkCategoriesView(i, emojiBottomSheet.greeting);
            MediaDataController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).checkStickers(i == 0 ? 5 : 0);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
            setPadding(((BottomSheet) emojiBottomSheet).backgroundPaddingLeft, 0, ((BottomSheet) emojiBottomSheet).backgroundPaddingLeft, 0);
            setTranslationY(AndroidUtilities.dp(16.0f));
            this.searchField.setTranslationY(AndroidUtilities.dp(52.0f));
            this.listView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(102.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(emojiBottomSheet.onlyStickers ? 0.0f : 40.0f) + AndroidUtilities.navigationBarHeight);
            super.onMeasure(i, i2);
        }

        @Override
        public final float top() {
            float f = this.lockTop;
            if (f >= 0.0f) {
                return f;
            }
            int i = 0;
            while (true) {
                EmojiListView emojiListView = this.listView;
                if (i >= emojiListView.getChildCount()) {
                    return 0.0f;
                }
                View childAt = emojiListView.getChildAt(i);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return BotFullscreenButtons$$ExternalSyntheticOutline1.m(childAt.getBottom(), 102.0f, 0);
                }
                i++;
            }
        }

        @Override
        public final void updateTops() {
            float fMax = Math.max(0.0f, top());
            setTranslationY(AndroidUtilities.dp(16.0f) + fMax);
            this.searchField.setTranslationY(AndroidUtilities.dp(52.0f) + fMax);
            EmojiListView emojiListView = this.listView;
            float paddingTop = fMax + emojiListView.getPaddingTop();
            float height = emojiListView.getHeight() - emojiListView.getPaddingBottom();
            emojiListView.topBound = paddingTop;
            emojiListView.bottomBound = height;
        }
    }

    public final class SearchField extends FrameLayout {
        public final FrameLayout box;
        public AnonymousClass5 categoriesListView;
        public final int categoriesListViewType;
        public final ImageView clear;
        public boolean clearVisible;
        public final UsersSelectActivity.AnonymousClass4 editText;
        public boolean ignoreTextChange;
        public boolean isprogress;
        public Utilities.Callback2 onSearchQuery;
        public final Theme.ResourcesProvider resourcesProvider;
        public final SearchStateDrawable searchImageDrawable;

        public final class AnonymousClass5 extends StickerCategoriesListView {
            public final boolean val$greeting;

            public AnonymousClass5(Context context, int i, Theme.ResourcesProvider resourcesProvider, boolean z) {
                super(context, i, resourcesProvider);
                this.val$greeting = z;
            }

            @Override
            public final boolean isTabIconsAnimationEnabled() {
                return LiteMode.isEnabled(8200);
            }

            @Override
            public final StickerCategoriesListView.EmojiCategory[] preprocessCategories(StickerCategoriesListView.EmojiCategory[] emojiCategoryArr) {
                if (emojiCategoryArr != null && this.val$greeting) {
                    int i = 0;
                    while (true) {
                        if (i >= emojiCategoryArr.length) {
                            i = -1;
                            break;
                        }
                        StickerCategoriesListView.EmojiCategory emojiCategory = emojiCategoryArr[i];
                        if (emojiCategory != null && emojiCategory.greeting) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                        int length = emojiCategoryArr.length;
                        StickerCategoriesListView.EmojiCategory[] emojiCategoryArr2 = new StickerCategoriesListView.EmojiCategory[length];
                        emojiCategoryArr2[0] = emojiCategoryArr[i];
                        int i2 = 1;
                        while (i2 < length) {
                            emojiCategoryArr2[i2] = emojiCategoryArr[i2 <= i ? i2 - 1 : i2];
                            i2++;
                        }
                        return emojiCategoryArr2;
                    }
                }
                return emojiCategoryArr;
            }

            @Override
            public final void selectCategory(int i) {
                super.selectCategory(i);
                SearchField.this.updateButton(false);
            }
        }

        public SearchField(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.categoriesListViewType = -1;
            this.resourcesProvider = resourcesProvider;
            FrameLayout frameLayout = new FrameLayout(context);
            this.box = frameLayout;
            frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.getColor(Theme.key_chat_emojiSearchBackground, resourcesProvider)));
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new RichEditor.AnonymousClass5(19));
            addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            SearchStateDrawable searchStateDrawable = new SearchStateDrawable();
            this.searchImageDrawable = searchStateDrawable;
            searchStateDrawable.setIconState(0, false, false);
            int i = Theme.key_chat_emojiSearchIcon;
            int color = Theme.getColor(i, resourcesProvider);
            Paint paint = searchStateDrawable.paint;
            paint.setColor(color);
            searchStateDrawable.alpha = paint.getAlpha();
            paint.setAlpha(255);
            imageView.setImageDrawable(searchStateDrawable);
            frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36, 51));
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 10);
            this.editText = anonymousClass4;
            anonymousClass4.setTextSize(1, 16.0f);
            anonymousClass4.setHintTextColor(Theme.getColor(i, resourcesProvider));
            anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            anonymousClass4.setBackgroundDrawable(null);
            anonymousClass4.setPadding(0, 0, 0, 0);
            anonymousClass4.setMaxLines(1);
            anonymousClass4.setLines(1);
            anonymousClass4.setSingleLine(true);
            anonymousClass4.setImeOptions(268435459);
            anonymousClass4.setHint(LocaleController.getString(R.string.Search));
            int i2 = Theme.key_featuredStickers_addedIcon;
            anonymousClass4.setCursorColor(Theme.getColor(i2, resourcesProvider));
            anonymousClass4.setHandlesColor(Theme.getColor(i2, resourcesProvider));
            anonymousClass4.setCursorSize(AndroidUtilities.dp(20.0f));
            anonymousClass4.setCursorWidth(1.5f);
            anonymousClass4.setTranslationY(AndroidUtilities.dp(-2.0f));
            frameLayout2.addView(anonymousClass4, LayoutHelper.createFrame(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
            anonymousClass4.addTextChangedListener(new WebActionBar.AnonymousClass5(this, 4));
            ImageView imageView2 = new ImageView(context);
            this.clear = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageDrawable(new org.telegram.ui.Components.SearchField.AnonymousClass1(resourcesProvider));
            imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, AndroidUtilities.dp(15.0f)));
            imageView2.setAlpha(0.0f);
            imageView2.setScaleX(0.7f);
            imageView2.setScaleY(0.7f);
            imageView2.setVisibility(8);
            final int i3 = 0;
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                public final EmojiBottomSheet.SearchField f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.clear();
                            break;
                        default:
                            EmojiBottomSheet.SearchField searchField = this.f$0;
                            int i4 = searchField.searchImageDrawable.toState;
                            if (i4 == 1) {
                                searchField.clear();
                                EmojiBottomSheet.SearchField.AnonymousClass5 anonymousClass5 = searchField.categoriesListView;
                                if (anonymousClass5 != null) {
                                    anonymousClass5.scrollToStart();
                                }
                            } else if (i4 == 0) {
                                searchField.editText.requestFocus();
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(imageView2, LayoutHelper.createFrame(36, 36, 53));
            final int i4 = 1;
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final EmojiBottomSheet.SearchField f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.clear();
                            break;
                        default:
                            EmojiBottomSheet.SearchField searchField = this.f$0;
                            int i5 = searchField.searchImageDrawable.toState;
                            if (i5 == 1) {
                                searchField.clear();
                                EmojiBottomSheet.SearchField.AnonymousClass5 anonymousClass5 = searchField.categoriesListView;
                                if (anonymousClass5 != null) {
                                    anonymousClass5.scrollToStart();
                                }
                            } else if (i5 == 0) {
                                searchField.editText.requestFocus();
                            }
                            break;
                    }
                }
            });
        }

        public final void checkCategoriesView(int i, boolean z) {
            if (this.categoriesListViewType != i || this.categoriesListView == null) {
                AnonymousClass5 anonymousClass5 = this.categoriesListView;
                FrameLayout frameLayout = this.box;
                if (anonymousClass5 != null) {
                    frameLayout.removeView(anonymousClass5);
                }
                AnonymousClass5 anonymousClass6 = new AnonymousClass5(getContext(), i == 1 ? 3 : 0, this.resourcesProvider, z);
                this.categoriesListView = anonymousClass6;
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.editText;
                anonymousClass6.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) anonymousClass4.getPaint().measureText(((Object) anonymousClass4.getHint()) + "")));
                final int i2 = 0;
                this.categoriesListView.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
                    public final EmojiBottomSheet.SearchField f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i2) {
                            case 0:
                                EmojiBottomSheet.SearchField searchField = this.f$0;
                                UsersSelectActivity.AnonymousClass4 anonymousClass7 = searchField.editText;
                                anonymousClass7.animate().cancel();
                                anonymousClass7.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                                searchField.updateButton(false);
                                break;
                            default:
                                StickerCategoriesListView.EmojiCategory emojiCategory = (StickerCategoriesListView.EmojiCategory) obj;
                                EmojiBottomSheet.SearchField searchField2 = this.f$0;
                                EmojiBottomSheet.SearchField.AnonymousClass5 anonymousClass8 = searchField2.categoriesListView;
                                if (anonymousClass8 != null) {
                                    if (anonymousClass8.getSelectedCategory() != emojiCategory) {
                                        searchField2.categoriesListView.selectCategory(emojiCategory);
                                        String str = emojiCategory.emojis;
                                        int categoryIndex = searchField2.categoriesListView.getCategoryIndex();
                                        Utilities.Callback2 callback2 = searchField2.onSearchQuery;
                                        if (callback2 != null) {
                                            callback2.run(str, Integer.valueOf(categoryIndex));
                                        }
                                    } else {
                                        searchField2.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                        Utilities.Callback2 callback3 = searchField2.onSearchQuery;
                                        if (callback3 != null) {
                                            callback3.run(null, -1);
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i3 = 1;
                this.categoriesListView.setOnCategoryClick(new Utilities.Callback(this) {
                    public final EmojiBottomSheet.SearchField f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i3) {
                            case 0:
                                EmojiBottomSheet.SearchField searchField = this.f$0;
                                UsersSelectActivity.AnonymousClass4 anonymousClass7 = searchField.editText;
                                anonymousClass7.animate().cancel();
                                anonymousClass7.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                                searchField.updateButton(false);
                                break;
                            default:
                                StickerCategoriesListView.EmojiCategory emojiCategory = (StickerCategoriesListView.EmojiCategory) obj;
                                EmojiBottomSheet.SearchField searchField2 = this.f$0;
                                EmojiBottomSheet.SearchField.AnonymousClass5 anonymousClass8 = searchField2.categoriesListView;
                                if (anonymousClass8 != null) {
                                    if (anonymousClass8.getSelectedCategory() != emojiCategory) {
                                        searchField2.categoriesListView.selectCategory(emojiCategory);
                                        String str = emojiCategory.emojis;
                                        int categoryIndex = searchField2.categoriesListView.getCategoryIndex();
                                        Utilities.Callback2 callback2 = searchField2.onSearchQuery;
                                        if (callback2 != null) {
                                            callback2.run(str, Integer.valueOf(categoryIndex));
                                        }
                                    } else {
                                        searchField2.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                                        Utilities.Callback2 callback3 = searchField2.onSearchQuery;
                                        if (callback3 != null) {
                                            callback3.run(null, -1);
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                frameLayout.addView(this.categoriesListView, Math.max(0, frameLayout.getChildCount() - 1), LayoutHelper.createFrame(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
            }
        }

        public final void clear() {
            this.editText.setText("");
            Utilities.Callback2 callback2 = this.onSearchQuery;
            if (callback2 != null) {
                callback2.run(null, -1);
            }
            AnonymousClass5 anonymousClass5 = this.categoriesListView;
            if (anonymousClass5 != null) {
                anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public final void showProgress(boolean z) {
            this.isprogress = z;
            if (z) {
                this.searchImageDrawable.setIconState(2, true, false);
            } else {
                updateButton(true);
            }
        }

        public final void updateButton(boolean z) {
            AnonymousClass5 anonymousClass5;
            AnonymousClass5 anonymousClass6;
            boolean z2 = this.isprogress;
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.editText;
            if (!z2 || ((anonymousClass4.length() == 0 && ((anonymousClass6 = this.categoriesListView) == null || anonymousClass6.getSelectedCategory() == null)) || z)) {
                this.searchImageDrawable.setIconState((anonymousClass4.length() > 0 || ((anonymousClass5 = this.categoriesListView) != null && anonymousClass5.categoriesShownT > 0.5f && (anonymousClass5.scrolledIntoOccupiedWidth || anonymousClass5.getSelectedCategory() != null))) ? 1 : 0, true, false);
                this.isprogress = false;
            }
        }
    }

    public final class TabsView extends View {
        public StaticLayout emojiLayout;
        public float emojiLayoutLeft;
        public float emojiLayoutWidth;
        public final RectF emojiRect;
        public StaticLayout gifsLayout;
        public float gifsLayoutLeft;
        public float gifsLayoutWidth;
        public final RectF gifsRect;
        public int lastWidth;
        public EmojiBottomSheet$$ExternalSyntheticLambda1 onTypeSelected;
        public final Paint selectPaint;
        public final RectF selectRect;
        public StaticLayout stickersLayout;
        public float stickersLayoutLeft;
        public float stickersLayoutWidth;
        public final RectF stickersRect;
        public final TextPaint textPaint;
        public float type;

        public TabsView(Context context) {
            super(context);
            this.textPaint = new TextPaint(1);
            this.selectPaint = new Paint(1);
            this.emojiRect = new RectF();
            this.stickersRect = new RectF();
            this.gifsRect = new RectF();
            this.selectRect = new RectF();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            RectF rectF;
            RectF rectF2;
            canvas.drawColor(-14737633);
            Paint paint = this.selectPaint;
            paint.setColor(-13224394);
            float f = this.type;
            int i = (int) f;
            RectF rectF3 = this.gifsRect;
            RectF rectF4 = this.stickersRect;
            RectF rectF5 = this.emojiRect;
            if (i <= 0) {
                rectF = rectF5;
            } else {
                rectF = i == 1 ? rectF4 : rectF3;
            }
            int iCeil = (int) Math.ceil(f);
            if (iCeil <= 0) {
                rectF2 = rectF5;
            } else {
                rectF2 = iCeil == 1 ? rectF4 : rectF3;
            }
            float f2 = this.type;
            RectF rectF6 = this.selectRect;
            AndroidUtilities.lerp(rectF, rectF2, f2 - ((int) f2), rectF6);
            canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
            StaticLayout staticLayout = this.emojiLayout;
            TextPaint textPaint = this.textPaint;
            if (staticLayout != null) {
                canvas.save();
                canvas.translate((rectF5.left + AndroidUtilities.dp(12.0f)) - this.emojiLayoutLeft, ImageReceiver$$ExternalSyntheticOutline0.m(rectF5.height(), this.emojiLayout.getHeight(), 2.0f, rectF5.top));
                textPaint.setColor(ColorUtils.blendARGB(Utilities.clamp(1.0f - Math.abs(this.type - 0.0f), 1.0f, 0.0f), -8158333, -1));
                this.emojiLayout.draw(canvas);
                canvas.restore();
            }
            if (this.stickersLayout != null) {
                canvas.save();
                canvas.translate((rectF4.left + AndroidUtilities.dp(12.0f)) - this.stickersLayoutLeft, ImageReceiver$$ExternalSyntheticOutline0.m(rectF4.height(), this.stickersLayout.getHeight(), 2.0f, rectF4.top));
                textPaint.setColor(ColorUtils.blendARGB(Utilities.clamp(1.0f - Math.abs(this.type - 1.0f), 1.0f, 0.0f), -8158333, -1));
                this.stickersLayout.draw(canvas);
                canvas.restore();
            }
            if (this.gifsLayout != null) {
                canvas.save();
                canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.gifsLayoutLeft, ImageReceiver$$ExternalSyntheticOutline0.m(rectF3.height(), this.gifsLayout.getHeight(), 2.0f, rectF3.top));
                textPaint.setColor(ColorUtils.blendARGB(Utilities.clamp(1.0f - Math.abs(this.type - 2.0f), 1.0f, 0.0f), -8158333, -1));
                this.gifsLayout.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
            if (getMeasuredWidth() != this.lastWidth || this.emojiLayout == null) {
                TextPaint textPaint = this.textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                String string = LocaleController.getString("Emoji");
                int measuredWidth = getMeasuredWidth();
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
                this.emojiLayout = staticLayout;
                this.emojiLayoutWidth = staticLayout.getLineCount() >= 1 ? this.emojiLayout.getLineWidth(0) : 0.0f;
                this.emojiLayoutLeft = this.emojiLayout.getLineCount() >= 1 ? this.emojiLayout.getLineLeft(0) : 0.0f;
                StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
                this.stickersLayout = staticLayout2;
                this.stickersLayoutWidth = staticLayout2.getLineCount() >= 1 ? this.stickersLayout.getLineWidth(0) : 0.0f;
                this.stickersLayoutLeft = this.stickersLayout.getLineCount() >= 1 ? this.stickersLayout.getLineLeft(0) : 0.0f;
                StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
                this.gifsLayout = staticLayout3;
                this.gifsLayoutWidth = staticLayout3.getLineCount() >= 1 ? this.gifsLayout.getLineWidth(0) : 0.0f;
                this.gifsLayoutLeft = this.gifsLayout.getLineCount() >= 1 ? this.gifsLayout.getLineLeft(0) : 0.0f;
                float fDp = AndroidUtilities.dp(12.0f) + this.emojiLayoutWidth + AndroidUtilities.dp(36.0f) + this.stickersLayoutWidth + AndroidUtilities.dp(36.0f) + this.gifsLayoutWidth + AndroidUtilities.dp(12.0f);
                float fDp2 = AndroidUtilities.dp(14.0f) / 2.0f;
                float fDp3 = AndroidUtilities.dp(66.0f) / 2.0f;
                float measuredWidth2 = (getMeasuredWidth() - fDp) / 2.0f;
                this.emojiRect.set(measuredWidth2, fDp2, this.emojiLayoutWidth + measuredWidth2 + AndroidUtilities.dp(24.0f), fDp3);
                float fDp4 = this.emojiLayoutWidth + AndroidUtilities.dp(36.0f) + measuredWidth2;
                this.stickersRect.set(fDp4, fDp2, this.stickersLayoutWidth + fDp4 + AndroidUtilities.dp(24.0f), fDp3);
                float fDp5 = this.stickersLayoutWidth + AndroidUtilities.dp(36.0f) + fDp4;
                this.gifsRect.set(fDp5, fDp2, this.gifsLayoutWidth + fDp5 + AndroidUtilities.dp(24.0f), fDp3);
                AndroidUtilities.dp(36.0f);
            }
            this.lastWidth = getMeasuredWidth();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                if (motionEvent.getAction() != 1 || this.onTypeSelected == null) {
                    return super.onTouchEvent(motionEvent);
                }
                if (this.emojiRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(0);
                    return true;
                }
                if (this.stickersRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(1);
                    return true;
                }
                if (this.gifsRect.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.onTypeSelected.run(2);
                }
            }
            return true;
        }
    }

    public EmojiBottomSheet(final Context context, Theme.ResourcesProvider resourcesProvider, final boolean z, boolean z2) {
        super(context, resourcesProvider, true, false);
        this.query = null;
        this.categoryIndex = -1;
        this.widgets = new AnonymousClass1();
        this.plus = new AnonymousClass2();
        this.maxPadding = -1.0f;
        this.onlyStickers = z;
        this.greeting = z2;
        this.useSmoothKeyboard = true;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new ContainerView(context);
        PollItemMenu.AnonymousClass3 anonymousClass3 = new PollItemMenu.AnonymousClass3(this, context, 5);
        this.viewPager = anonymousClass3;
        anonymousClass3.currentPosition = z ? 0 : savedPosition;
        anonymousClass3.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final void bindView(View view, int i, int i2) {
                IPage iPage = (IPage) view;
                if (z) {
                    i = 1;
                }
                iPage.bind(i);
            }

            @Override
            public final View createView(int i) {
                EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                Context context2 = context;
                return i == 1 ? emojiBottomSheet.new GifPage(context2) : emojiBottomSheet.new Page(context2);
            }

            @Override
            public final int getItemCount() {
                return z ? 1 : 3;
            }

            @Override
            public final int getItemViewType(int i) {
                return (i == 0 || i == 1) ? 0 : 1;
            }
        });
        this.containerView.addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 87));
        new KeyboardNotifier(this.containerView, false, new EmojiBottomSheet$$ExternalSyntheticLambda1(this, 0));
        if (!z) {
            TabsView tabsView = new TabsView(context);
            this.tabsView = tabsView;
            tabsView.onTypeSelected = new EmojiBottomSheet$$ExternalSyntheticLambda1(this, 1);
            tabsView.type = anonymousClass3.currentPosition;
            tabsView.invalidate();
            this.containerView.addView(tabsView, LayoutHelper.createFrame(-1, -2, 87));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        FileLog.disableGson(true);
        if (!z) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
        }
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(7, false, true, false);
    }

    public boolean canClickWidget(Integer num) {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return this.viewPager.getTranslationY() >= ((float) ((int) this.maxPadding));
    }

    public boolean canShowWidget(Integer num) {
        return true;
    }

    public boolean checkAudioPermission(Runnable runnable) {
        return true;
    }

    public final void closeKeyboard() {
        SearchField searchField;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
        for (View view : this.viewPager.getViewPages()) {
            if (view instanceof Page) {
                SearchField searchField2 = ((Page) view).searchField;
                if (searchField2 != null) {
                    AndroidUtilities.hideKeyboard(searchField2.editText);
                }
            } else if ((view instanceof GifPage) && (searchField = ((GifPage) view).searchField) != null) {
                AndroidUtilities.hideKeyboard(searchField.editText);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad || i == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.viewPager.getViewPages()) {
                if (view instanceof Page) {
                    Page page = (Page) view;
                    if (i == NotificationCenter.groupStickersDidLoad || ((page.currentType == 0 && ((Integer) objArr[0]).intValue() == 5) || (page.currentType == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        Page.Adapter adapter = page.adapter;
                        if (adapter.query == null) {
                            adapter.updateItems$1(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        closeKeyboard();
        super.lambda$showGiftOfferSheet$15();
        FileLog.disableGson(false);
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() <= 0 ? AndroidUtilities.displaySize.y : (int) (this.containerView.getMeasuredHeight() - this.viewPager.getY());
    }

    public final void lambda$new$2$41() {
        boolean z = this.wasKeyboardVisible;
        boolean z2 = this.keyboardVisible;
        if (z != z2) {
            this.wasKeyboardVisible = z2;
            this.container.clearAnimation();
            float fMin = 0.0f;
            if (this.keyboardVisible) {
                int i = AndroidUtilities.displaySize.y;
                int i2 = this.keyboardHeight;
                fMin = Math.min(0.0f, Math.max(((i - i2) * 0.3f) - this.top, (-i2) / 3.0f));
            }
            this.container.animate().translationY(fMin).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
        }
    }

    public final void onWidgetClick(int i) {
        if (canClickWidget(Integer.valueOf(i))) {
            if ((i != 1 || checkAudioPermission(new VoIPFragment$$ExternalSyntheticLambda9(this, i, 1))) && ((Boolean) this.onWidgetSelected.run(Integer.valueOf(i))).booleanValue()) {
                lambda$showGiftOfferSheet$15();
            }
        }
    }

    public final class StoryWidgetsCell extends View {
        public final Paint bgPaint;
        public float[] lineWidths;
        public EmojiBottomSheet$$ExternalSyntheticLambda1 onClickListener;
        public final TextPaint textPaint;
        public final ArrayList widgets;

        public abstract class BaseWidget {
            public final AnimatedFloat animatedWidth;
            public final ButtonBounce bounce;
            public float height;
            public int id;
            public float width;
            public float layoutX = 0.0f;
            public int layoutLine = 0;
            public final RectF bounds = new RectF();

            public BaseWidget(StoryWidgetsCell storyWidgetsCell) {
                this.bounce = new ButtonBounce(storyWidgetsCell, 1.0f, 5.0f);
                this.animatedWidth = new AnimatedFloat(350L, storyWidgetsCell, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            public abstract void draw(Canvas canvas, float f, float f2);

            public void onAttachToWindow(boolean z) {
            }
        }

        public final class ReactionWidget extends BaseWidget {
            public final StoryReactionWidgetBackground background;
            public int currentIndex;
            public ReactionImageHolder nextReactionHolder;
            public final AnimatedFloat progressToNext;
            public ReactionImageHolder reactionHolder;
            public Timer timeTimer;
            public final ArrayList visibleReactions;

            public ReactionWidget() {
                super(StoryWidgetsCell.this);
                this.reactionHolder = new ReactionImageHolder(StoryWidgetsCell.this);
                this.nextReactionHolder = new ReactionImageHolder(StoryWidgetsCell.this);
                this.progressToNext = new AnimatedFloat(StoryWidgetsCell.this);
                this.background = new StoryReactionWidgetBackground(StoryWidgetsCell.this);
                this.visibleReactions = new ArrayList();
                this.id = 3;
                this.width = AndroidUtilities.dp(44.0f);
                this.height = AndroidUtilities.dp(36.0f);
                List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).getReactionsList();
                for (int i = 0; i < Math.min(reactionsList.size(), 8); i++) {
                    ArrayList arrayList = this.visibleReactions;
                    TLRPC.TL_availableReaction tL_availableReaction = reactionsList.get(i);
                    ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                    String str = tL_availableReaction.reaction;
                    visibleReaction.emojicon = str;
                    visibleReaction.hash = str.hashCode();
                    arrayList.add(visibleReaction);
                }
                Collections.sort(this.visibleReactions, new OAuthSheet$$ExternalSyntheticLambda3(17));
                if (!this.visibleReactions.isEmpty()) {
                    this.reactionHolder.setVisibleReaction((ReactionsLayoutInBubble.VisibleReaction) this.visibleReactions.get(this.currentIndex));
                }
                this.progressToNext.set(1.0f, true);
            }

            @Override
            public final void draw(Canvas canvas, float f, float f2) {
                float fDp = f2 - AndroidUtilities.dp(4.0f);
                RectF rectF = this.bounds;
                float f3 = this.width;
                rectF.set((int) f, (int) fDp, (int) (f + f3), (int) (fDp + f3));
                float scale = this.bounce.getScale(0.05f);
                canvas.save();
                canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
                int i = (int) rectF.left;
                int i2 = (int) rectF.top;
                int i3 = (int) rectF.right;
                int i4 = (int) rectF.bottom;
                StoryReactionWidgetBackground storyReactionWidgetBackground = this.background;
                storyReactionWidgetBackground.setBounds(i, i2, i3, i4);
                storyReactionWidgetBackground.draw(canvas);
                float fDp2 = AndroidUtilities.dp(30.0f);
                Rect rect = AndroidUtilities.rectTmp2;
                float f4 = fDp2 / 2.0f;
                rect.set((int) (rectF.centerX() - f4), (int) (rectF.centerY() - f4), (int) (rectF.centerX() + f4), (int) (rectF.centerY() + f4));
                float f5 = this.progressToNext.set(1.0f, false);
                this.nextReactionHolder.bounds.set(rect);
                this.reactionHolder.bounds.set(rect);
                if (f5 == 1.0f) {
                    this.reactionHolder.draw(canvas);
                } else {
                    canvas.save();
                    float f6 = 1.0f - f5;
                    canvas.scale(f6, f6, rectF.centerX(), rectF.top);
                    ReactionImageHolder reactionImageHolder = this.nextReactionHolder;
                    reactionImageHolder.alpha = f6;
                    reactionImageHolder.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.scale(f5, f5, rectF.centerX(), rectF.bottom);
                    ReactionImageHolder reactionImageHolder2 = this.reactionHolder;
                    reactionImageHolder2.alpha = f5;
                    reactionImageHolder2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }

            @Override
            public final void onAttachToWindow(boolean z) {
                this.reactionHolder.onAttachedToWindow(z);
                this.nextReactionHolder.onAttachedToWindow(z);
                Timer timer = this.timeTimer;
                if (timer != null) {
                    timer.cancel();
                    this.timeTimer = null;
                }
                if (z) {
                    Timer timer2 = new Timer();
                    this.timeTimer = timer2;
                    timer2.schedule(new zzq(this, 4), 2000L, 2000L);
                }
            }
        }

        public StoryWidgetsCell(Context context) {
            String temperature;
            super(context);
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            paint.setColor(436207615);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
            textPaint.setColor(-1);
            ArrayList arrayList = new ArrayList();
            this.widgets = arrayList;
            setPadding(0, 0, 0, 0);
            if (EmojiBottomSheet.this.canShowWidget(4)) {
                Button button = new Button(4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
                if (!UserConfig.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).isPremium()) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                    button.lockDrawable = drawableMutate;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.6f, -1), PorterDuff.Mode.SRC_IN));
                    Paint paint2 = new Paint(1);
                    button.lockPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                arrayList.add(button);
            }
            if (EmojiBottomSheet.this.canShowWidget(0)) {
                arrayList.add(new Button(0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
            }
            if (EmojiBottomSheet.this.canShowWidget(5)) {
                Weather.State state = Weather.cacheValue;
                Button[] buttonArr = {null};
                StringBuilder sb = new StringBuilder();
                sb.append(state == null ? "🌤" : state.emoji);
                sb.append(" ");
                if (state == null) {
                    temperature = Weather.isDefaultCelsius() ? "24°C" : "72°F";
                } else {
                    temperature = state.getTemperature();
                }
                sb.append(temperature);
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(sb.toString(), textPaint.getFontMetricsInt(), false);
                CharSequence charSequence = charSequenceReplaceEmoji;
                if (MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).storyWeatherPreload && PermissionRequest.hasPermission("android.permission.ACCESS_COARSE_LOCATION") && state == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("___");
                    spannableStringBuilder.setSpan(new LoadingSpan(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder.length(), 33);
                    buttonArr[0] = new Button(spannableStringBuilder);
                    Weather.fetch(false, new ThemeActivity$$ExternalSyntheticLambda19(1, this, buttonArr));
                    charSequence = spannableStringBuilder;
                }
                charSequence = charSequenceReplaceEmoji;
                charSequence = charSequenceReplaceEmoji;
                Button button2 = buttonArr[0];
                arrayList.add(button2 == null ? new Button(charSequence) : button2);
            }
            if (EmojiBottomSheet.this.canShowWidget(1)) {
                arrayList.add(new Button(1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
            }
            if (EmojiBottomSheet.this.canShowWidget(2)) {
                arrayList.add(new Button(2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
            }
            if (EmojiBottomSheet.this.canShowWidget(3)) {
                arrayList.add(new ReactionWidget());
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            ArrayList arrayList = this.widgets;
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    float[] fArr = this.lineWidths;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    fArr[i2] = 0.0f;
                    i2++;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                BaseWidget baseWidget = (BaseWidget) obj;
                int i4 = baseWidget.layoutLine - 1;
                float[] fArr2 = this.lineWidths;
                float f = fArr2[i4];
                if (f > 0.0f) {
                    fArr2[i4] = f + AndroidUtilities.dp(10.0f);
                }
                float[] fArr3 = this.lineWidths;
                fArr3[i4] = fArr3[i4] + baseWidget.animatedWidth.set(baseWidget.width, false);
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                BaseWidget baseWidget2 = (BaseWidget) obj2;
                baseWidget2.draw(canvas, ImageReceiver$$ExternalSyntheticOutline0.m((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.lineWidths[baseWidget2.layoutLine - 1], 2.0f, getPaddingLeft()) + baseWidget2.layoutX, RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(baseWidget2.layoutLine - 1, 48.0f, AndroidUtilities.dp(12.0f)));
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            ArrayList arrayList = this.widgets;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((BaseWidget) obj).onAttachToWindow(true);
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ArrayList arrayList = this.widgets;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((BaseWidget) obj).onAttachToWindow(false);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            ArrayList arrayList = this.widgets;
            int size2 = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            float fDp = 0.0f;
            int i5 = 1;
            while (i4 < size2) {
                Object obj = arrayList.get(i4);
                i4++;
                BaseWidget baseWidget = (BaseWidget) obj;
                baseWidget.layoutX = fDp;
                float fDp2 = baseWidget.width + AndroidUtilities.dp(10.0f) + fDp;
                if (fDp2 > paddingLeft) {
                    i5++;
                    baseWidget.layoutX = 0.0f;
                    fDp = baseWidget.width + AndroidUtilities.dp(10.0f) + 0.0f;
                } else {
                    fDp = fDp2;
                }
                baseWidget.layoutLine = i5;
            }
            float[] fArr = this.lineWidths;
            if (fArr == null || fArr.length != i5) {
                this.lineWidths = new float[i5];
            } else {
                Arrays.fill(fArr, 0.0f);
            }
            int size3 = arrayList.size();
            while (i3 < size3) {
                Object obj2 = arrayList.get(i3);
                i3++;
                BaseWidget baseWidget2 = (BaseWidget) obj2;
                int i6 = baseWidget2.layoutLine - 1;
                float[] fArr2 = this.lineWidths;
                float f = fArr2[i6];
                if (f > 0.0f) {
                    fArr2[i6] = f + AndroidUtilities.dp(10.0f);
                }
                float[] fArr3 = this.lineWidths;
                fArr3[i6] = fArr3[i6] + baseWidget2.width;
            }
            setMeasuredDimension(size, RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(i5 - 1, 12.0f, RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(i5, 36.0f, AndroidUtilities.dp(24.0f))));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            BaseWidget baseWidget;
            EmojiBottomSheet$$ExternalSyntheticLambda1 emojiBottomSheet$$ExternalSyntheticLambda1;
            ArrayList arrayList = this.widgets;
            int size = arrayList.size();
            int i = 0;
            do {
                if (i >= size) {
                    baseWidget = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                baseWidget = (BaseWidget) obj;
            } while (!baseWidget.bounds.contains(motionEvent.getX(), motionEvent.getY()));
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                BaseWidget baseWidget2 = (BaseWidget) obj2;
                if (baseWidget2 != baseWidget) {
                    baseWidget2.bounce.setPressed(false);
                }
            }
            if (baseWidget != null) {
                baseWidget.bounce.setPressed((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) ? false : true);
            }
            if (motionEvent.getAction() == 1 && baseWidget != null && (emojiBottomSheet$$ExternalSyntheticLambda1 = this.onClickListener) != null) {
                emojiBottomSheet$$ExternalSyntheticLambda1.run(Integer.valueOf(baseWidget.id));
            }
            return baseWidget != null;
        }

        public final class Button extends BaseWidget {
            public Drawable drawable;
            public StaticLayout layout;
            public Drawable lockDrawable;
            public Paint lockPaint;
            public float textLeft;
            public float textWidth;

            public Button(int i, int i2, String str) {
                super(StoryWidgetsCell.this);
                this.id = i;
                Drawable drawableMutate = StoryWidgetsCell.this.getContext().getResources().getDrawable(i2).mutate();
                this.drawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                String upperCase = str.toUpperCase();
                float f = AndroidUtilities.displaySize.x * 0.8f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint = StoryWidgetsCell.this.textPaint;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, f, truncateAt), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.layout = staticLayout;
                this.textWidth = staticLayout.getLineCount() > 0 ? this.layout.getLineWidth(0) : 0.0f;
                this.textLeft = this.layout.getLineCount() > 0 ? this.layout.getLineLeft(0) : 0.0f;
                this.width = AndroidUtilities.dpf2(45.6f) + this.textWidth;
                this.height = AndroidUtilities.dpf2(36.0f);
            }

            @Override
            public final void draw(Canvas canvas, float f, float f2) {
                RectF rectF = this.bounds;
                rectF.set(f, f2, this.width + f, this.height + f2);
                float scale = this.bounce.getScale(0.05f);
                canvas.save();
                canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), StoryWidgetsCell.this.bgPaint);
                if (this.lockDrawable != null) {
                    canvas.saveLayerAlpha(rectF, 255, 31);
                }
                if (this.drawable == null) {
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
                    this.drawable = emojiBigDrawable;
                    if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                        ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
                    }
                }
                if (this.drawable != null) {
                    float fDp = AndroidUtilities.dp(24.0f) / 2;
                    this.drawable.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - fDp), (int) (((this.height / 2.0f) + rectF.top) - fDp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + fDp), (int) ((this.height / 2.0f) + rectF.top + fDp));
                    this.drawable.draw(canvas);
                }
                if (this.lockDrawable != null) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.height) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.lockPaint);
                    this.lockDrawable.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.height) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.height) - AndroidUtilities.dp(5.0f)));
                    this.lockDrawable.draw(canvas);
                    canvas.restore();
                }
                canvas.translate((rectF.left + AndroidUtilities.dp((this.drawable != null ? 28 : 0) + 6)) - this.textLeft, ((this.height / 2.0f) + rectF.top) - (this.layout.getHeight() / 2.0f));
                this.layout.draw(canvas);
                canvas.restore();
            }

            public Button(CharSequence charSequence) {
                super(StoryWidgetsCell.this);
                this.id = 5;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, StoryWidgetsCell.this.textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), StoryWidgetsCell.this.textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.layout = staticLayout;
                this.textWidth = staticLayout.getLineCount() > 0 ? this.layout.getLineWidth(0) : 0.0f;
                this.textLeft = this.layout.getLineCount() > 0 ? this.layout.getLineLeft(0) : 0.0f;
                this.width = AndroidUtilities.dpf2(12.0f) + this.textWidth;
                this.height = AndroidUtilities.dpf2(36.0f);
            }
        }
    }
}
