package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.util.ObjectsCompat$$ExternalSyntheticBackport0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.RecyclerListView;

public class ChatThemeBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private final Adapter adapter;
    private final View applyButton;
    private TextView applyTextView;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private final ChatActivity chatActivity;
    private final RLottieDrawable darkThemeDrawable;
    private final RLottieImageView darkThemeView;
    HintView hintView;
    private boolean isApplyClicked;
    private boolean isLightDarkChangeAnimation;
    private final LinearLayoutManager layoutManager;
    private final EmojiThemes originalTheme;
    private final FlickerLoadingView progressView;
    private final RecyclerListView recyclerView;
    private TextView resetTextView;
    private FrameLayout rootLayout;
    private ChatThemeItem selectedItem;
    private final ChatActivity.ThemeDelegate themeDelegate;
    private final TextView titleView;
    private int prevSelectedPosition = -1;
    private final boolean originalIsDark = Theme.getActiveTheme().isDark();
    private boolean forceDark = !Theme.getActiveTheme().isDark();
    private final LinearSmoothScroller scroller = new LinearSmoothScroller(this, getContext()) {
        @Override
        public int calculateTimeForScrolling(int i) {
            return super.calculateTimeForScrolling(i) * 6;
        }
    };

    public ChatThemeBottomSheet(ChatActivity chatActivity, final ChatActivity.ThemeDelegate themeDelegate) {
        super(chatActivity.getParentActivity(), true, themeDelegate);
        String str;
        int i;
        this.chatActivity = chatActivity;
        this.themeDelegate = themeDelegate;
        this.originalTheme = themeDelegate.getCurrentTheme();
        Adapter adapter = new Adapter(this.currentAccount, themeDelegate, 0);
        this.adapter = adapter;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        this.drawNavigationBar = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.rootLayout = frameLayout;
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.titleView = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
        textView.setTextColor(getThemedColor("dialogTextBlack"));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        this.rootLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int themedColor = getThemedColor("featuredStickers_addButton");
        int dp = AndroidUtilities.dp(28.0f);
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.sun_outline, "2131558527", dp, dp, false, null);
        this.darkThemeDrawable = rLottieDrawable;
        setForceDark(Theme.getActiveTheme().isDark(), false);
        rLottieDrawable.setAllowDecodeSingleFrame(true);
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        RLottieImageView rLottieImageView = new RLottieImageView(getContext()) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (ChatThemeBottomSheet.this.forceDark) {
                    accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToDayTheme", R.string.AccDescrSwitchToDayTheme));
                } else {
                    accessibilityNodeInfo.setText(LocaleController.getString("AccDescrSwitchToNightTheme", R.string.AccDescrSwitchToNightTheme));
                }
            }
        };
        this.darkThemeView = rLottieImageView;
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatThemeBottomSheet.this.lambda$new$0(view);
            }
        });
        this.rootLayout.addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        RecyclerListView recyclerListView = new RecyclerListView(getContext());
        this.recyclerView = recyclerListView;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setHasFixedSize(true);
        recyclerListView.setItemAnimator(null);
        recyclerListView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                ChatThemeBottomSheet.this.lambda$new$1(themeDelegate, view, i2);
            }
        });
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), this.resourcesProvider);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(14);
        flickerLoadingView.setVisibility(0);
        this.rootLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.rootLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.applyButton = view;
        view.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), getThemedColor("featuredStickers_addButton"), getThemedColor("featuredStickers_addButtonPressed")));
        view.setEnabled(false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChatThemeBottomSheet.this.lambda$new$2(view2);
            }
        });
        this.rootLayout.addView(view, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.resetTextView = textView2;
        textView2.setAlpha(0.0f);
        this.resetTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.resetTextView.setGravity(17);
        this.resetTextView.setLines(1);
        this.resetTextView.setSingleLine(true);
        TextView textView3 = this.resetTextView;
        if (themeDelegate.getCurrentTheme() == null) {
            i = R.string.DoNoSetTheme;
            str = "DoNoSetTheme";
        } else {
            i = R.string.ChatResetTheme;
            str = "ChatResetTheme";
        }
        textView3.setText(LocaleController.getString(str, i));
        this.resetTextView.setTextColor(getThemedColor("featuredStickers_buttonText"));
        this.resetTextView.setTextSize(1, 15.0f);
        this.resetTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.resetTextView.setVisibility(4);
        this.rootLayout.addView(this.resetTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView4 = new TextView(getContext());
        this.applyTextView = textView4;
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        this.applyTextView.setGravity(17);
        this.applyTextView.setLines(1);
        this.applyTextView.setSingleLine(true);
        this.applyTextView.setText(LocaleController.getString("ChatApplyTheme", R.string.ChatApplyTheme));
        this.applyTextView.setTextColor(getThemedColor("featuredStickers_buttonText"));
        this.applyTextView.setTextSize(1, 15.0f);
        this.applyTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.applyTextView.setVisibility(4);
        this.rootLayout.addView(this.applyTextView, LayoutHelper.createFrame(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
    }

    public void lambda$new$0(View view) {
        if (this.changeDayNightViewAnimator == null) {
            setupLightDarkTheme(!this.forceDark);
        }
    }

    public void lambda$new$1(ChatActivity.ThemeDelegate themeDelegate, View view, final int i) {
        if (this.adapter.items.get(i) != this.selectedItem && this.changeDayNightView == null) {
            ChatThemeItem chatThemeItem = this.adapter.items.get(i);
            this.selectedItem = chatThemeItem;
            this.isLightDarkChangeAnimation = false;
            EmojiThemes emojiThemes = chatThemeItem.chatTheme;
            if (emojiThemes == null || emojiThemes.showAsDefaultStub) {
                this.applyTextView.animate().alpha(0.0f).setDuration(300L).start();
                this.resetTextView.animate().alpha(1.0f).setDuration(300L).start();
            } else {
                this.resetTextView.animate().alpha(0.0f).setDuration(300L).start();
                this.applyTextView.animate().alpha(1.0f).setDuration(300L).start();
            }
            EmojiThemes emojiThemes2 = this.selectedItem.chatTheme;
            if (emojiThemes2.showAsDefaultStub) {
                themeDelegate.setCurrentTheme(null, true, Boolean.valueOf(this.forceDark));
            } else {
                themeDelegate.setCurrentTheme(emojiThemes2, true, Boolean.valueOf(this.forceDark));
            }
            this.adapter.setSelectedItem(i);
            this.containerView.postDelayed(new Runnable() {
                @Override
                public void run() {
                    int i2;
                    RecyclerView.LayoutManager layoutManager = ChatThemeBottomSheet.this.recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        if (i > ChatThemeBottomSheet.this.prevSelectedPosition) {
                            i2 = Math.min(i + 1, ChatThemeBottomSheet.this.adapter.items.size() - 1);
                        } else {
                            i2 = Math.max(i - 1, 0);
                        }
                        ChatThemeBottomSheet.this.scroller.setTargetPosition(i2);
                        layoutManager.startSmoothScroll(ChatThemeBottomSheet.this.scroller);
                    }
                    ChatThemeBottomSheet.this.prevSelectedPosition = i;
                }
            }, 100L);
            for (int i2 = 0; i2 < this.recyclerView.getChildCount(); i2++) {
                ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.recyclerView.getChildAt(i2);
                if (themeSmallPreviewView != view) {
                    themeSmallPreviewView.cancelAnimation();
                }
            }
            if (!this.adapter.items.get(i).chatTheme.showAsDefaultStub) {
                ((ThemeSmallPreviewView) view).playEmojiAnimation();
            }
        }
    }

    public void lambda$new$2(View view) {
        applySelectedTheme();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatThemeController.preloadAllWallpaperThumbs(true);
        ChatThemeController.preloadAllWallpaperThumbs(false);
        ChatThemeController.preloadAllWallpaperImages(true);
        ChatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.isApplyClicked = false;
        List<EmojiThemes> cachedThemes = this.themeDelegate.getCachedThemes();
        if (cachedThemes == null || cachedThemes.isEmpty()) {
            ChatThemeController.requestAllChatThemes(new ResultCallback<List<EmojiThemes>>() {
                public void onComplete(List<EmojiThemes> list) {
                    if (list != null && !list.isEmpty()) {
                        ChatThemeBottomSheet.this.themeDelegate.setCachedThemes(list);
                    }
                    ChatThemeBottomSheet.this.onDataLoaded(list);
                }

                @Override
                public void onError(TLRPC$TL_error tLRPC$TL_error) {
                    Toast.makeText(ChatThemeBottomSheet.this.getContext(), tLRPC$TL_error.text, 0).show();
                }
            }, true);
        } else {
            onDataLoaded(cachedThemes);
        }
        if (this.chatActivity.getCurrentUser() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !this.chatActivity.getCurrentUser().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            HintView hintView = new HintView(getContext(), 9, this.chatActivity.getResourceProvider());
            this.hintView = hintView;
            hintView.setVisibility(4);
            this.hintView.setShowingDuration(5000L);
            this.hintView.setBottomOffset(-AndroidUtilities.dp(8.0f));
            this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDayNightSwitchTooltip", R.string.ChatThemeDayNightSwitchTooltip, this.chatActivity.getCurrentUser().first_name)));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatThemeBottomSheet.this.lambda$onCreate$3();
                }
            }, 1500L);
            this.container.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public void lambda$onCreate$3() {
        this.hintView.showForView(this.darkThemeView, true);
    }

    @Override
    public void onContainerTranslationYChanged(float f) {
        HintView hintView = this.hintView;
        if (hintView != null) {
            hintView.hide();
        }
    }

    @Override
    public void onBackPressed() {
        close();
    }

    @Override
    public void dismiss() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        if (!this.isApplyClicked) {
            this.themeDelegate.setCurrentTheme(this.originalTheme, true, Boolean.valueOf(this.originalIsDark));
        }
    }

    public void close() {
        if (hasChanges()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString("ChatThemeSaveDialogTitle", R.string.ChatThemeSaveDialogTitle));
            builder.setSubtitle(LocaleController.getString("ChatThemeSaveDialogText", R.string.ChatThemeSaveDialogText));
            builder.setPositiveButton(LocaleController.getString("ChatThemeSaveDialogApply", R.string.ChatThemeSaveDialogApply), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatThemeBottomSheet.this.lambda$close$4(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("ChatThemeSaveDialogDiscard", R.string.ChatThemeSaveDialogDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ChatThemeBottomSheet.this.lambda$close$5(dialogInterface, i);
                }
            });
            builder.show();
            return;
        }
        dismiss();
    }

    public void lambda$close$4(DialogInterface dialogInterface, int i) {
        applySelectedTheme();
    }

    public void lambda$close$5(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            this.adapter.notifyDataSetChanged();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            private boolean isAnimationStarted = false;

            @Override
            public void didSetColor() {
            }

            @Override
            public void onAnimationProgress(float f) {
                if (f == 0.0f && !this.isAnimationStarted) {
                    ChatThemeBottomSheet.this.onAnimationStart();
                    this.isAnimationStarted = true;
                }
                ChatThemeBottomSheet.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ChatThemeBottomSheet.this.getThemedColor("featuredStickers_addButton"), PorterDuff.Mode.MULTIPLY));
                ChatThemeBottomSheet chatThemeBottomSheet = ChatThemeBottomSheet.this;
                chatThemeBottomSheet.setOverlayNavBarColor(chatThemeBottomSheet.getThemedColor("windowBackgroundGray"));
                if (ChatThemeBottomSheet.this.isLightDarkChangeAnimation) {
                    ChatThemeBottomSheet.this.setItemsAnimationProgress(f);
                }
                if (f == 1.0f && this.isAnimationStarted) {
                    ChatThemeBottomSheet.this.isLightDarkChangeAnimation = false;
                    ChatThemeBottomSheet.this.onAnimationEnd();
                    this.isAnimationStarted = false;
                }
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, new Drawable[]{this.shadowDrawable}, themeDescriptionDelegate, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.titleView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.recyclerView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ThemeSmallPreviewView.class}, null, null, null, "dialogBackgroundGray"));
        arrayList.add(new ThemeDescription(this.applyButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "featuredStickers_addButton"));
        arrayList.add(new ThemeDescription(this.applyButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "featuredStickers_addButtonPressed"));
        Iterator<ThemeDescription> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().resourcesProvider = this.themeDelegate;
        }
        return arrayList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setupLightDarkTheme(final boolean z) {
        ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView();
        final Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(createBitmap);
        this.darkThemeView.setAlpha(0.0f);
        ((FrameLayout) this.chatActivity.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        this.darkThemeView.setAlpha(1.0f);
        final Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        final Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.darkThemeView.getLocationInWindow(iArr);
        final float f = iArr[0];
        final float f2 = iArr[1];
        final float measuredWidth = f + (this.darkThemeView.getMeasuredWidth() / 2.0f);
        final float measuredHeight = f2 + (this.darkThemeView.getMeasuredHeight() / 2.0f);
        final float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        this.changeDayNightView = new View(getContext()) {
            @Override
            protected void onDraw(Canvas canvas2) {
                super.onDraw(canvas2);
                if (z) {
                    if (ChatThemeBottomSheet.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, max * ChatThemeBottomSheet.this.changeDayNightViewProgress, paint);
                    }
                    canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas2.drawCircle(measuredWidth, measuredHeight, max * (1.0f - ChatThemeBottomSheet.this.changeDayNightViewProgress), paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                ChatThemeBottomSheet.this.darkThemeView.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ChatThemeBottomSheet.this.changeDayNightViewProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ChatThemeBottomSheet.this.changeDayNightView.invalidate();
                if (!this.changedNavigationBarColor && ChatThemeBottomSheet.this.changeDayNightViewProgress > 0.5f) {
                    this.changedNavigationBarColor = true;
                    AndroidUtilities.setLightNavigationBar(ChatThemeBottomSheet.this.getWindow(), true ^ z);
                    AndroidUtilities.setNavigationBarColor(ChatThemeBottomSheet.this.getWindow(), ChatThemeBottomSheet.this.getThemedColor("windowBackgroundGray"));
                }
            }
        });
        this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ChatThemeBottomSheet.this.changeDayNightView != null) {
                    if (ChatThemeBottomSheet.this.changeDayNightView.getParent() != null) {
                        ((ViewGroup) ChatThemeBottomSheet.this.changeDayNightView.getParent()).removeView(ChatThemeBottomSheet.this.changeDayNightView);
                    }
                    ChatThemeBottomSheet.this.changeDayNightView = null;
                }
                ChatThemeBottomSheet.this.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
            }
        });
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatThemeBottomSheet.this.lambda$setupLightDarkTheme$6(z);
            }
        });
    }

    public void lambda$setupLightDarkTheme$6(boolean z) {
        Adapter adapter = this.adapter;
        if (!(adapter == null || adapter.items == null)) {
            setForceDark(z, true);
            ChatThemeItem chatThemeItem = this.selectedItem;
            if (chatThemeItem != null) {
                this.isLightDarkChangeAnimation = true;
                EmojiThemes emojiThemes = chatThemeItem.chatTheme;
                if (emojiThemes.showAsDefaultStub) {
                    this.themeDelegate.setCurrentTheme(null, false, Boolean.valueOf(z));
                } else {
                    this.themeDelegate.setCurrentTheme(emojiThemes, false, Boolean.valueOf(z));
                }
            }
            Adapter adapter2 = this.adapter;
            if (!(adapter2 == null || adapter2.items == null)) {
                for (int i = 0; i < this.adapter.items.size(); i++) {
                    this.adapter.items.get(i).themeIndex = z ? 1 : 0;
                }
                this.adapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    protected boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !hasChanges()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.containerView.getTop() && x >= this.containerView.getLeft() && x <= this.containerView.getRight()) {
            return false;
        }
        this.chatActivity.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    public void onDataLoaded(List<EmojiThemes> list) {
        if (!(list == null || list.isEmpty())) {
            boolean z = false;
            ChatThemeItem chatThemeItem = new ChatThemeItem(list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            EmojiThemes currentTheme = this.themeDelegate.getCurrentTheme();
            arrayList.add(0, chatThemeItem);
            this.selectedItem = chatThemeItem;
            for (int i = 1; i < list.size(); i++) {
                EmojiThemes emojiThemes = list.get(i);
                ChatThemeItem chatThemeItem2 = new ChatThemeItem(emojiThemes);
                emojiThemes.loadPreviewColors(this.currentAccount);
                chatThemeItem2.themeIndex = this.forceDark ? 1 : 0;
                arrayList.add(chatThemeItem2);
            }
            this.adapter.setItems(arrayList);
            this.applyButton.setEnabled(true);
            this.applyTextView.setAlpha(0.0f);
            this.resetTextView.setAlpha(0.0f);
            this.recyclerView.setAlpha(0.0f);
            this.applyTextView.setVisibility(0);
            this.resetTextView.setVisibility(0);
            this.darkThemeView.setVisibility(0);
            if (currentTheme != null) {
                int i2 = 0;
                while (true) {
                    if (i2 == arrayList.size()) {
                        i2 = -1;
                        break;
                    } else if (((ChatThemeItem) arrayList.get(i2)).chatTheme.getEmoticon().equals(currentTheme.getEmoticon())) {
                        this.selectedItem = (ChatThemeItem) arrayList.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    this.prevSelectedPosition = i2;
                    this.adapter.setSelectedItem(i2);
                    if (i2 > 0 && i2 < arrayList.size() / 2) {
                        i2--;
                    }
                    this.layoutManager.scrollToPositionWithOffset(Math.min(i2, this.adapter.items.size() - 1), 0);
                }
            } else {
                this.adapter.setSelectedItem(0);
                this.layoutManager.scrollToPositionWithOffset(0, 0);
                z = true;
            }
            float f = 1.0f;
            this.recyclerView.animate().alpha(1.0f).setDuration(150L).start();
            this.resetTextView.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).start();
            ViewPropertyAnimator animate = this.applyTextView.animate();
            if (z) {
                f = 0.0f;
            }
            animate.alpha(f).setDuration(150L).start();
            this.progressView.animate().alpha(0.0f).setListener(new HideViewAfterAnimation(this.progressView)).setDuration(150L).start();
        }
    }

    public void onAnimationStart() {
        List<ChatThemeItem> list;
        Adapter adapter = this.adapter;
        if (!(adapter == null || (list = adapter.items) == null)) {
            for (ChatThemeItem chatThemeItem : list) {
                chatThemeItem.themeIndex = this.forceDark ? 1 : 0;
            }
        }
        if (!this.isLightDarkChangeAnimation) {
            setItemsAnimationProgress(1.0f);
        }
    }

    public void onAnimationEnd() {
        this.isLightDarkChangeAnimation = false;
    }

    private void setForceDark(boolean z, boolean z2) {
        if (this.forceDark != z) {
            this.forceDark = z;
            int i = 0;
            if (z2) {
                RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
                if (z) {
                    i = rLottieDrawable.getFramesCount();
                }
                rLottieDrawable.setCustomEndFrame(i);
                RLottieImageView rLottieImageView = this.darkThemeView;
                if (rLottieImageView != null) {
                    rLottieImageView.playAnimation();
                    return;
                }
                return;
            }
            int framesCount = z ? this.darkThemeDrawable.getFramesCount() - 1 : 0;
            this.darkThemeDrawable.setCurrentFrame(framesCount, false, true);
            this.darkThemeDrawable.setCustomEndFrame(framesCount);
            RLottieImageView rLottieImageView2 = this.darkThemeView;
            if (rLottieImageView2 != null) {
                rLottieImageView2.invalidate();
            }
        }
    }

    public void setItemsAnimationProgress(float f) {
        for (int i = 0; i < this.adapter.getItemCount(); i++) {
            this.adapter.items.get(i).animationProgress = f;
        }
    }

    private void applySelectedTheme() {
        boolean z;
        ChatThemeItem chatThemeItem = this.selectedItem;
        EmojiThemes emojiThemes = chatThemeItem.chatTheme;
        boolean z2 = emojiThemes.showAsDefaultStub;
        Bulletin bulletin = null;
        EmojiThemes emojiThemes2 = z2 ? null : emojiThemes;
        if (!(chatThemeItem == null || emojiThemes2 == this.originalTheme)) {
            String emoticon = (emojiThemes == null || z2) ? null : emojiThemes.getEmoticon();
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.chatActivity.getDialogId(), emoticon, true);
            if (emojiThemes == null || emojiThemes.showAsDefaultStub) {
                this.themeDelegate.setCurrentTheme(null, true, Boolean.valueOf(this.originalIsDark));
            } else {
                this.themeDelegate.setCurrentTheme(emojiThemes, true, Boolean.valueOf(this.originalIsDark));
            }
            this.isApplyClicked = true;
            TLRPC$User currentUser = this.chatActivity.getCurrentUser();
            if (currentUser != null && !currentUser.self) {
                if (TextUtils.isEmpty(emoticon)) {
                    emoticon = "❌";
                    z = true;
                } else {
                    z = false;
                }
                StickerSetBulletinLayout stickerSetBulletinLayout = new StickerSetBulletinLayout(getContext(), null, -1, emoticon != null ? MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(emoticon) : null, this.chatActivity.getResourceProvider());
                stickerSetBulletinLayout.subtitleTextView.setVisibility(8);
                if (z) {
                    stickerSetBulletinLayout.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, currentUser.first_name)));
                } else {
                    stickerSetBulletinLayout.titleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, currentUser.first_name)));
                }
                stickerSetBulletinLayout.titleTextView.setTypeface(null);
                bulletin = Bulletin.make(this.chatActivity, stickerSetBulletinLayout, 2750);
            }
        }
        dismiss();
        if (bulletin != null) {
            bulletin.show();
        }
    }

    private boolean hasChanges() {
        if (this.selectedItem == null) {
            return false;
        }
        EmojiThemes emojiThemes = this.originalTheme;
        String str = null;
        String emoticon = emojiThemes != null ? emojiThemes.getEmoticon() : null;
        String str2 = "❌";
        if (TextUtils.isEmpty(emoticon)) {
            emoticon = str2;
        }
        EmojiThemes emojiThemes2 = this.selectedItem.chatTheme;
        if (emojiThemes2 != null) {
            str = emojiThemes2.getEmoticon();
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        return !ObjectsCompat$$ExternalSyntheticBackport0.m(emoticon, str2);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public static class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private final int currentAccount;
        private final int currentViewType;
        public List<ChatThemeItem> items;
        private final Theme.ResourcesProvider resourcesProvider;
        private WeakReference<ThemeSmallPreviewView> selectedViewRef;
        private int selectedItemPosition = -1;
        private HashMap<String, Theme.ThemeInfo> loadingThemes = new HashMap<>();
        private HashMap<Theme.ThemeInfo, String> loadingWallpapers = new HashMap<>();

        public Adapter(int i, Theme.ResourcesProvider resourcesProvider, int i2) {
            this.currentViewType = i2;
            this.resourcesProvider = resourcesProvider;
            this.currentAccount = i;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new ThemeSmallPreviewView(viewGroup.getContext(), this.currentAccount, this.resourcesProvider, this.currentViewType));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) viewHolder.itemView;
            Theme.ThemeInfo themeInfo = this.items.get(i).chatTheme.getThemeInfo(this.items.get(i).themeIndex);
            if (themeInfo != null && themeInfo.pathToFile != null && !themeInfo.previewParsed && new File(themeInfo.pathToFile).exists()) {
                parseTheme(themeInfo);
            }
            ChatThemeItem chatThemeItem = this.items.get(i);
            ChatThemeItem chatThemeItem2 = themeSmallPreviewView.chatThemeItem;
            boolean z = false;
            boolean z2 = chatThemeItem2 != null && chatThemeItem2.chatTheme.getEmoticon().equals(chatThemeItem.chatTheme.getEmoticon()) && !DrawerProfileCell.switchingTheme && themeSmallPreviewView.lastThemeIndex == chatThemeItem.themeIndex;
            themeSmallPreviewView.setFocusable(true);
            themeSmallPreviewView.setEnabled(true);
            themeSmallPreviewView.setBackgroundColor(Theme.getColor("dialogBackgroundGray"));
            themeSmallPreviewView.setItem(chatThemeItem, z2);
            if (i == this.selectedItemPosition) {
                z = true;
            }
            themeSmallPreviewView.setSelected(z, z2);
            if (i == this.selectedItemPosition) {
                this.selectedViewRef = new WeakReference<>(themeSmallPreviewView);
            }
        }

        private boolean parseTheme(final org.telegram.ui.ActionBar.Theme.ThemeInfo r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatThemeBottomSheet.Adapter.parseTheme(org.telegram.ui.ActionBar.Theme$ThemeInfo):boolean");
        }

        public void lambda$parseTheme$1(final Theme.ThemeInfo themeInfo, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatThemeBottomSheet.Adapter.this.lambda$parseTheme$0(tLObject, themeInfo);
                }
            });
        }

        public void lambda$parseTheme$0(TLObject tLObject, Theme.ThemeInfo themeInfo) {
            if (tLObject instanceof TLRPC$TL_wallPaper) {
                TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(tLRPC$WallPaper.document);
                if (!this.loadingThemes.containsKey(attachFileName)) {
                    this.loadingThemes.put(attachFileName, themeInfo);
                    FileLoader.getInstance(themeInfo.account).loadFile(tLRPC$WallPaper.document, tLRPC$WallPaper, 1, 1);
                    return;
                }
                return;
            }
            themeInfo.badWallpaper = true;
        }

        @Override
        public int getItemCount() {
            List<ChatThemeItem> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public void setItems(List<ChatThemeItem> list) {
            this.items = list;
            notifyDataSetChanged();
        }

        public void setSelectedItem(int i) {
            int i2 = this.selectedItemPosition;
            if (i2 != i) {
                if (i2 >= 0) {
                    notifyItemChanged(i2);
                    WeakReference<ThemeSmallPreviewView> weakReference = this.selectedViewRef;
                    ThemeSmallPreviewView themeSmallPreviewView = weakReference == null ? null : weakReference.get();
                    if (themeSmallPreviewView != null) {
                        themeSmallPreviewView.setSelected(false);
                    }
                }
                this.selectedItemPosition = i;
                notifyItemChanged(i);
            }
        }
    }

    public static class ChatThemeItem {
        public float animationProgress;
        public final EmojiThemes chatTheme;
        public Bitmap icon;
        public boolean isSelected;
        public Drawable previewDrawable;
        public int themeIndex;

        public ChatThemeItem(EmojiThemes emojiThemes) {
            this.chatTheme = emojiThemes;
        }
    }

    @Override
    public void show() {
        String str;
        int i;
        super.show();
        TextView textView = this.resetTextView;
        if (this.themeDelegate.getCurrentTheme() == null) {
            i = R.string.DoNoSetTheme;
            str = "DoNoSetTheme";
        } else {
            i = R.string.ChatResetTheme;
            str = "ChatResetTheme";
        }
        textView.setText(LocaleController.getString(str, i));
    }
}
