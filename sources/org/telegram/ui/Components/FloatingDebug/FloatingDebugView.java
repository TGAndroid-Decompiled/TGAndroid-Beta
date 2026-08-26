package org.telegram.ui.Components.FloatingDebug;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;

public final class FloatingDebugView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout bigLayout;
    public final ArrayList debugItems;
    public SpringAnimation fabXSpring;
    public SpringAnimation fabYSpring;
    public CombinedDrawable floatingButtonBackground;
    public final AnonymousClass2 floatingButtonContainer;
    public boolean inLongPress;
    public boolean isBigMenuShown;
    public boolean isFromFling;
    public boolean isScrolling;
    public final RecyclerListView listView;
    public final SharedPreferences mPrefs;
    public final FloatingDebugView$$ExternalSyntheticLambda2 onLongPress;
    public final TextView titleView;
    public final int touchSlop;
    public int wasStatusBar;

    public final class AnonymousClass2 extends FrameLayout {
        public final GestureDetectorCompat val$gestureDetector;

        public AnonymousClass2(LaunchActivity launchActivity, GestureDetectorCompat gestureDetectorCompat) {
            super(launchActivity);
            this.val$gestureDetector = gestureDetectorCompat;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            FloatingDebugView.this.invalidate();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            DisplayMetrics displayMetrics;
            float f;
            boolean zOnTouchEvent = this.val$gestureDetector.mDetector.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            FloatingDebugView floatingDebugView = FloatingDebugView.this;
            if (action == 0) {
                AndroidUtilities.runOnUIThread(floatingDebugView.onLongPress, 200L);
                return zOnTouchEvent;
            }
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return zOnTouchEvent;
            }
            AndroidUtilities.cancelRunOnUIThread(floatingDebugView.onLongPress);
            if (!floatingDebugView.isFromFling) {
                SpringForce springForce = floatingDebugView.fabXSpring.mSpring;
                if (((float) springForce.mFinalPosition) >= getWidth() / 2.0f) {
                    displayMetrics = getResources().getDisplayMetrics();
                    f = 2.1474836E9f;
                } else {
                    displayMetrics = getResources().getDisplayMetrics();
                    f = -2.1474836E9f;
                }
                springForce.mFinalPosition = FloatingDebugView.clampX(displayMetrics, f);
                floatingDebugView.fabYSpring.mSpring.mFinalPosition = FloatingDebugView.clampY(getResources().getDisplayMetrics(), (float) floatingDebugView.fabYSpring.mSpring.mFinalPosition);
                floatingDebugView.fabXSpring.start();
                floatingDebugView.fabYSpring.start();
            }
            floatingDebugView.inLongPress = false;
            floatingDebugView.isScrolling = false;
            floatingDebugView.isFromFling = false;
            return zOnTouchEvent;
        }

        @Override
        public final void setTranslationX(float f) {
            super.setTranslationX(f);
            FloatingDebugView.this.invalidate();
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            FloatingDebugView.this.invalidate();
        }
    }

    public final class SeekBarCell extends FrameLayout {
        public AnimationProperties.FloatProperty callback;
        public int lastWidth;
        public float max;
        public float min;
        public final SeekBarView seekBar;
        public final TextPaint textPaint;
        public String title;
        public float value;

        public SeekBarCell(LaunchActivity launchActivity) {
            super(launchActivity);
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(launchActivity);
            this.seekBar = seekBarView;
            seekBarView.setReportChanges(true);
            seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                @Override
                public final CharSequence getContentDescription() {
                    SeekBarCell seekBarCell = SeekBarCell.this;
                    float f = seekBarCell.min;
                    return String.valueOf(Math.round((seekBarCell.seekBar.getProgress() * (seekBarCell.max - f)) + f));
                }

                @Override
                public final int getStepsCount() {
                    return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                }

                @Override
                public final boolean needVisuallyDivideSteps() {
                    return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                }

                @Override
                public final void onSeekBarDrag(boolean z, float f) {
                    SeekBarCell seekBarCell = SeekBarCell.this;
                    float f2 = seekBarCell.min;
                    float fM = DiffUtil.m(seekBarCell.max, f2, f, f2);
                    seekBarCell.value = fM;
                    if (z) {
                        seekBarCell.callback.set((Object) null, Float.valueOf(fM));
                    }
                    seekBarCell.invalidate();
                }

                @Override
                public final void onSeekBarPressed(boolean z) {
                }
            });
            seekBarView.setImportantForAccessibility(2);
            addView(seekBarView, LayoutHelper.createFrame(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            this.seekBar.invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            TextPaint textPaint = this.textPaint;
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            canvas.drawText(this.title, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), textPaint);
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
            String str = String.format(Locale.ROOT, "%.2f", Float.valueOf(this.value));
            canvas.drawText(str, (getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - textPaint.measureText(str), this.seekBar.getY() + AndroidUtilities.dp(23.0f), textPaint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.seekBar.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int size = View.MeasureSpec.getSize(i);
            if (this.lastWidth != size) {
                SeekBarView seekBarView = this.seekBar;
                float fFloatValue = this.callback.get(null).floatValue();
                float f = this.min;
                seekBarView.setProgress((fFloatValue - f) / (this.max - f));
                this.lastWidth = size;
            }
        }

        @Override
        public final boolean performAccessibilityAction(int i, Bundle bundle) {
            return super.performAccessibilityAction(i, bundle) || this.seekBar.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
        }
    }

    public FloatingDebugView(final LaunchActivity launchActivity) {
        super(launchActivity);
        this.onLongPress = new FloatingDebugView$$ExternalSyntheticLambda2(this, 3);
        this.debugItems = new ArrayList();
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() {
            public float startX;
            public float startY;

            @Override
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                DisplayMetrics displayMetrics;
                float f3;
                FloatingDebugView floatingDebugView = FloatingDebugView.this;
                if (!floatingDebugView.isScrolling || floatingDebugView.inLongPress) {
                    return false;
                }
                SpringForce springForce = floatingDebugView.fabXSpring.mSpring;
                if ((f / 7.0f) + ((float) springForce.mFinalPosition) >= floatingDebugView.getWidth() / 2.0f) {
                    displayMetrics = floatingDebugView.getResources().getDisplayMetrics();
                    f3 = 2.1474836E9f;
                } else {
                    displayMetrics = floatingDebugView.getResources().getDisplayMetrics();
                    f3 = -2.1474836E9f;
                }
                springForce.mFinalPosition = FloatingDebugView.clampX(displayMetrics, f3);
                floatingDebugView.fabYSpring.mSpring.mFinalPosition = FloatingDebugView.clampY(floatingDebugView.getResources().getDisplayMetrics(), (f2 / 10.0f) + ((float) floatingDebugView.fabYSpring.mSpring.mFinalPosition));
                floatingDebugView.fabXSpring.start();
                floatingDebugView.fabYSpring.start();
                floatingDebugView.isFromFling = true;
                return true;
            }

            @Override
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                FloatingDebugView floatingDebugView = FloatingDebugView.this;
                if (!floatingDebugView.inLongPress) {
                    AndroidUtilities.cancelRunOnUIThread(floatingDebugView.onLongPress);
                }
                if (!floatingDebugView.isScrolling) {
                    float fAbs = Math.abs(f);
                    int i = floatingDebugView.touchSlop;
                    if (fAbs >= i || Math.abs(f2) >= i) {
                        this.startX = (float) floatingDebugView.fabXSpring.mSpring.mFinalPosition;
                        this.startY = (float) floatingDebugView.fabYSpring.mSpring.mFinalPosition;
                        floatingDebugView.isScrolling = true;
                    }
                }
                if (floatingDebugView.isScrolling && !floatingDebugView.inLongPress) {
                    floatingDebugView.fabXSpring.mSpring.mFinalPosition = (motionEvent2.getRawX() + this.startX) - motionEvent.getRawX();
                    floatingDebugView.fabYSpring.mSpring.mFinalPosition = (motionEvent2.getRawY() + this.startY) - motionEvent.getRawY();
                    floatingDebugView.fabXSpring.start();
                    floatingDebugView.fabYSpring.start();
                }
                return floatingDebugView.isScrolling;
            }

            @Override
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                FloatingDebugView floatingDebugView = FloatingDebugView.this;
                if (floatingDebugView.inLongPress || floatingDebugView.isBigMenuShown) {
                    return false;
                }
                floatingDebugView.showBigMenu(true);
                return true;
            }
        };
        this.mPrefs = launchActivity.getSharedPreferences("floating_debug", 0);
        this.touchSlop = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(launchActivity, simpleOnGestureListener);
        gestureDetectorCompat.mDetector.setIsLongpressEnabled(false);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(launchActivity, gestureDetectorCompat);
        this.floatingButtonContainer = anonymousClass2;
        ImageView imageView = new ImageView(launchActivity);
        imageView.setImageResource(R.drawable.device_phone_android);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_actionIcon, false), PorterDuff.Mode.SRC_IN));
        anonymousClass2.addView(imageView);
        anonymousClass2.setVisibility(8);
        addView(anonymousClass2, LayoutHelper.createFrame(56, 56.0f));
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        this.bigLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        TextView textView = new TextView(launchActivity);
        this.titleView = textView;
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.DebugMenu));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        RecyclerListView recyclerListView = new RecyclerListView(launchActivity);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerListView.setAdapter(new RecyclerListView.SelectionAdapter() {
            @Override
            public final int getItemCount() {
                return FloatingDebugView.this.debugItems.size();
            }

            @Override
            public final int getItemViewType(int i) {
                return ID3v1Genre$EnumUnboxingLocalUtility.ordinal(((FloatingDebugController$DebugItem) FloatingDebugView.this.debugItems.get(i)).type);
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return ID3v1Genre$EnumUnboxingLocalUtility.values(3)[viewHolder.getItemViewType()] == 1;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                FloatingDebugController$DebugItem floatingDebugController$DebugItem = (FloatingDebugController$DebugItem) FloatingDebugView.this.debugItems.get(i);
                int iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(floatingDebugController$DebugItem.type);
                String str = floatingDebugController$DebugItem.title;
                if (iOrdinal == 0) {
                    AlertDialog.AlertDialogCell alertDialogCell = (AlertDialog.AlertDialogCell) viewHolder.itemView;
                    alertDialogCell.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                    alertDialogCell.setTextAndIcon(str, 0);
                    return;
                }
                if (iOrdinal == 1) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    headerCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
                    headerCell.setText(str);
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    SeekBarCell seekBarCell = (SeekBarCell) viewHolder.itemView;
                    seekBarCell.title = str.toString();
                    AnimationProperties.FloatProperty floatProperty = floatingDebugController$DebugItem.floatProperty;
                    seekBarCell.value = floatProperty.get(null).floatValue();
                    seekBarCell.min = floatingDebugController$DebugItem.from;
                    seekBarCell.max = floatingDebugController$DebugItem.to;
                    seekBarCell.callback = floatProperty;
                    seekBarCell.invalidate();
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View headerCell;
                int iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(ID3v1Genre$EnumUnboxingLocalUtility.values(3)[i]);
                LaunchActivity launchActivity2 = launchActivity;
                if (iOrdinal != 1) {
                    headerCell = iOrdinal != 2 ? new AlertDialog.AlertDialogCell(launchActivity2, null) : new SeekBarCell(launchActivity2);
                } else {
                    headerCell = new HeaderCell(launchActivity2);
                }
                headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(headerCell);
            }
        });
        recyclerListView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 5));
        linearLayout.addView(recyclerListView, LayoutHelper.createLinear(-1, 0, 1.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        updateDrawables();
        setFitsSystemWindows(true);
        setWillNotDraw(false);
    }

    public static float clampX(DisplayMetrics displayMetrics, float f) {
        return MathUtils.clamp(f, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float clampY(DisplayMetrics displayMetrics, float f) {
        return MathUtils.clamp(f, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<FloatingDebugController$DebugItem> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FloatingDebugController$DebugItem("Theme"));
        arrayList.add(new FloatingDebugController$DebugItem(new GiftSheet$$ExternalSyntheticLambda2(5), "Draw action bar shadow"));
        arrayList.add(new FloatingDebugController$DebugItem(new FloatingDebugView$$ExternalSyntheticLambda2(this, 0), "Show blur settings"));
        arrayList.add(new FloatingDebugController$DebugItem(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new FloatingDebugController$DebugItem(new FloatingDebugView$$ExternalSyntheticLambda2(this, 1), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug)));
        arrayList.add(new FloatingDebugController$DebugItem(new GiftSheet$$ExternalSyntheticLambda2(6), Theme.currentTheme.isDark() ? "Switch to day theme" : "Switch to dark theme"));
        arrayList.add(new FloatingDebugController$DebugItem(new FloatingDebugView$$ExternalSyntheticLambda2(this, 2), LocaleController.getString(R.string.DebugSendLogs)));
        return arrayList;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didSetNewTheme) {
            updateDrawables();
            this.listView.getAdapter().notifyDataSetChanged();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LinearLayout linearLayout = this.bigLayout;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.mPrefs;
        float f = sharedPreferences.getFloat("x", -1.0f);
        float f2 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float fClampX = (f == -1.0f || f >= ((float) displayMetrics.widthPixels) / 2.0f) ? clampX(displayMetrics, 2.1474836E9f) : clampX(displayMetrics, -2.1474836E9f);
        AnonymousClass2 anonymousClass2 = this.floatingButtonContainer;
        anonymousClass2.setTranslationX(fClampX);
        anonymousClass2.setTranslationY(f2 == -1.0f ? clampY(displayMetrics, 2.1474836E9f) : clampY(displayMetrics, f2));
        SpringAnimation springAnimation = new SpringAnimation(anonymousClass2, DynamicAnimation.TRANSLATION_X, anonymousClass2.getTranslationX());
        SpringForce springForce = new SpringForce(anonymousClass2.getTranslationX());
        springForce.setStiffness(650.0f);
        springForce.setDampingRatio(0.75f);
        springAnimation.mSpring = springForce;
        this.fabXSpring = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(anonymousClass2, DynamicAnimation.TRANSLATION_Y, anonymousClass2.getTranslationY());
        SpringForce springForce2 = new SpringForce(anonymousClass2.getTranslationY());
        springForce2.setStiffness(650.0f);
        springForce2.setDampingRatio(0.75f);
        springAnimation2.mSpring = springForce2;
        this.fabYSpring = springAnimation2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fabXSpring.cancel();
        this.fabYSpring.cancel();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        AnonymousClass2 anonymousClass2 = this.floatingButtonContainer;
        anonymousClass2.setTranslationX(clampX(displayMetrics, anonymousClass2.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.1474836E9f : -2.1474836E9f));
        anonymousClass2.setTranslationY(clampY(displayMetrics, anonymousClass2.getTranslationY()));
        this.fabXSpring.mSpring.mFinalPosition = anonymousClass2.getTranslationX();
        this.fabYSpring.mSpring.mFinalPosition = anonymousClass2.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.fabXSpring.cancel();
        this.fabYSpring.cancel();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        AnonymousClass2 anonymousClass2 = this.floatingButtonContainer;
        canvas.translate(anonymousClass2.getTranslationX(), anonymousClass2.getTranslationY());
        canvas.scale(anonymousClass2.getScaleX(), anonymousClass2.getScaleY(), anonymousClass2.getPivotX(), anonymousClass2.getPivotY());
        this.floatingButtonBackground.setAlpha((int) (anonymousClass2.getAlpha() * 255.0f));
        this.floatingButtonBackground.setBounds(anonymousClass2.getLeft(), anonymousClass2.getTop(), anonymousClass2.getRight(), anonymousClass2.getBottom());
        this.floatingButtonBackground.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.isBigMenuShown;
    }

    public final void showBigMenu(final boolean z) {
        if (this.isBigMenuShown == z) {
            return;
        }
        this.isBigMenuShown = z;
        if (z) {
            this.bigLayout.setVisibility(0);
            ArrayList arrayList = this.debugItems;
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                INavigationLayout actionBarLayout = ((LaunchActivity) getContext()).getActionBarLayout();
                if (actionBarLayout instanceof FloatingDebugProvider) {
                    arrayList.addAll(((FloatingDebugProvider) actionBarLayout).onGetDebugItems());
                }
                INavigationLayout rightActionBarLayout = ((LaunchActivity) getContext()).getRightActionBarLayout();
                if (rightActionBarLayout instanceof FloatingDebugProvider) {
                    arrayList.addAll(((FloatingDebugProvider) rightActionBarLayout).onGetDebugItems());
                }
                INavigationLayout layersActionBarLayout = ((LaunchActivity) getContext()).getLayersActionBarLayout();
                if (layersActionBarLayout instanceof FloatingDebugProvider) {
                    arrayList.addAll(((FloatingDebugProvider) layersActionBarLayout).onGetDebugItems());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.listView.getAdapter().notifyDataSetChanged();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z) {
            this.wasStatusBar = window.getStatusBarColor();
        }
        AnonymousClass2 anonymousClass2 = this.floatingButtonContainer;
        final float translationX = anonymousClass2.getTranslationX();
        final float translationY = anonymousClass2.getTranslationY();
        SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(z ? 0.0f : 1000.0f));
        SpringForce springForce = new SpringForce(1000.0f);
        springForce.setStiffness(900.0f);
        springForce.setDampingRatio(1.0f);
        springForce.mFinalPosition = z ? 1000.0f : 0.0f;
        springAnimation.mSpring = springForce;
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                float f3 = f / 1000.0f;
                FloatingDebugView floatingDebugView = this.f$0;
                LinearLayout linearLayout = floatingDebugView.bigLayout;
                linearLayout.setAlpha(f3);
                float fDp = AndroidUtilities.dp(8.0f);
                float f4 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f4 - fDp, 0.0f, f3));
                float fDp2 = AndroidUtilities.dp(8.0f);
                float f5 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f5 - fDp2, 0.0f, f3));
                FloatingDebugView.AnonymousClass2 anonymousClass3 = floatingDebugView.floatingButtonContainer;
                linearLayout.setPivotX(anonymousClass3.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(anonymousClass3.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(anonymousClass3.getWidth() / linearLayout.getWidth(), 1.0f, f3));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(anonymousClass3.getHeight() / linearLayout.getHeight(), 1.0f, f3));
                }
                anonymousClass3.setTranslationX(AndroidUtilities.lerp(f4, (floatingDebugView.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f3));
                anonymousClass3.setTranslationY(AndroidUtilities.lerp(f5, (floatingDebugView.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f3));
                anonymousClass3.setAlpha(1.0f - f3);
                window.setStatusBarColor(ColorUtils.blendARGB(f3, floatingDebugView.wasStatusBar, 2046820352));
                floatingDebugView.invalidate();
            }
        });
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                FloatingDebugView floatingDebugView = this.f$0;
                FloatingDebugView.AnonymousClass2 anonymousClass3 = floatingDebugView.floatingButtonContainer;
                anonymousClass3.setTranslationX(translationX);
                anonymousClass3.setTranslationY(translationY);
                if (z) {
                    return;
                }
                floatingDebugView.bigLayout.setVisibility(8);
            }
        });
        springAnimation.start();
    }

    public final void updateDrawables() {
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(null, Theme.key_chats_actionBackground, false), Theme.getColor(null, Theme.key_chats_actionPressedBackground, false));
        Drawable drawableMutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, rippleDrawableSafeCreateSimpleSelectorCircleDrawable, 0, 0);
        combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        this.floatingButtonBackground = combinedDrawable;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogBackground, false), mode));
        this.bigLayout.setBackground(drawable);
        this.titleView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        invalidate();
    }
}
