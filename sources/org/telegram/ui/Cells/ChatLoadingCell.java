package org.telegram.ui.Cells;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.ContactsAdapter;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$2$1;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.web.WebActionBar;

public final class ChatLoadingCell extends FrameLayout {
    public int backgroundHeight;
    public final AnonymousClass1 frameLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public float viewTop;

    public final class AnonymousClass1 extends FrameLayout {
        public final int $r8$classId;
        public final Object rect;
        public final Object this$0;

        public AnonymousClass1(Object obj, Context context, Object obj2, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
            this.rect = obj2;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    RectF rectF = (RectF) this.rect;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    ChatLoadingCell chatLoadingCell = (ChatLoadingCell) this.this$0;
                    int measuredWidth = chatLoadingCell.getMeasuredWidth();
                    int i = chatLoadingCell.backgroundHeight;
                    float x = chatLoadingCell.getX();
                    float f = chatLoadingCell.viewTop;
                    Theme.ResourcesProvider resourcesProvider = chatLoadingCell.resourcesProvider;
                    if (resourcesProvider != null) {
                        resourcesProvider.applyServiceShaderMatrix(measuredWidth, i, x, f);
                    } else {
                        Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, measuredWidth, i, x, f);
                    }
                    float fDp = AndroidUtilities.dp(18.0f);
                    float fDp2 = AndroidUtilities.dp(18.0f);
                    Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackground") : null;
                    if (paint == null) {
                        paint = Theme.getThemePaint("paintChatActionBackground");
                    }
                    canvas.drawRoundRect(rectF, fDp, fDp2, paint);
                    if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
                        float fDp3 = AndroidUtilities.dp(18.0f);
                        float fDp4 = AndroidUtilities.dp(18.0f);
                        Paint paint2 = resourcesProvider != null ? resourcesProvider.getPaint("paintChatActionBackgroundDarken") : null;
                        if (paint2 == null) {
                            paint2 = Theme.getThemePaint("paintChatActionBackgroundDarken");
                        }
                        canvas.drawRoundRect(rectF, fDp3, fDp4, paint2);
                    }
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 4:
                    int action = motionEvent.getAction();
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    if (rTMPStreamPipOverlay.consumingChild != null) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.offsetLocation(rTMPStreamPipOverlay.consumingChild.getX(), rTMPStreamPipOverlay.consumingChild.getY());
                        boolean zDispatchTouchEvent = rTMPStreamPipOverlay.consumingChild.dispatchTouchEvent(motionEvent);
                        motionEventObtain.recycle();
                        if (action == 1 || action == 3) {
                            rTMPStreamPipOverlay.consumingChild = null;
                        }
                        if (zDispatchTouchEvent) {
                            return true;
                        }
                    }
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                    boolean zOnTouchEvent = rTMPStreamPipOverlay.scaleGestureDetector.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    boolean z = !rTMPStreamPipOverlay.scaleGestureDetector.isInProgress() && rTMPStreamPipOverlay.gestureDetector.mDetector.onTouchEvent(motionEvent);
                    if (action == 1 || action == 3) {
                        rTMPStreamPipOverlay.isScrolling = false;
                        rTMPStreamPipOverlay.isScrollDisallowed = false;
                        SpringAnimation springAnimation = rTMPStreamPipOverlay.pipXSpring;
                        if (!springAnimation.mRunning) {
                            float f = rTMPStreamPipOverlay.pipX;
                            springAnimation.mValue = f;
                            springAnimation.mStartValueIsSet = true;
                            SpringForce springForce = springAnimation.mSpring;
                            int i = rTMPStreamPipOverlay.pipWidth;
                            float f2 = (i / 2.0f) + f;
                            int i2 = AndroidUtilities.displaySize.x;
                            springForce.mFinalPosition = f2 >= ((float) i2) / 2.0f ? (i2 - i) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            rTMPStreamPipOverlay.pipXSpring.start();
                        }
                        SpringAnimation springAnimation2 = rTMPStreamPipOverlay.pipYSpring;
                        if (!springAnimation2.mRunning) {
                            float f3 = rTMPStreamPipOverlay.pipY;
                            springAnimation2.mValue = f3;
                            springAnimation2.mStartValueIsSet = true;
                            springAnimation2.mSpring.mFinalPosition = MathUtils.clamp(f3, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rTMPStreamPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                            rTMPStreamPipOverlay.pipYSpring.start();
                        }
                    }
                    return zOnTouchEvent || z;
                case 8:
                    int action2 = motionEvent.getAction();
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    if (liveStoryPipOverlay.consumingChild != null) {
                        MotionEvent motionEventObtain3 = MotionEvent.obtain(motionEvent);
                        motionEventObtain3.offsetLocation(liveStoryPipOverlay.consumingChild.getX(), liveStoryPipOverlay.consumingChild.getY());
                        boolean zDispatchTouchEvent2 = liveStoryPipOverlay.consumingChild.dispatchTouchEvent(motionEvent);
                        motionEventObtain3.recycle();
                        if (action2 == 1 || action2 == 3) {
                            liveStoryPipOverlay.consumingChild = null;
                        }
                        if (zDispatchTouchEvent2) {
                            return true;
                        }
                    }
                    MotionEvent motionEventObtain4 = MotionEvent.obtain(motionEvent);
                    motionEventObtain4.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                    boolean zOnTouchEvent2 = liveStoryPipOverlay.scaleGestureDetector.onTouchEvent(motionEventObtain4);
                    motionEventObtain4.recycle();
                    boolean z2 = !liveStoryPipOverlay.scaleGestureDetector.isInProgress() && liveStoryPipOverlay.gestureDetector.mDetector.onTouchEvent(motionEvent);
                    if (action2 == 1 || action2 == 3) {
                        liveStoryPipOverlay.isScrolling = false;
                        liveStoryPipOverlay.isScrollDisallowed = false;
                        SpringAnimation springAnimation3 = liveStoryPipOverlay.pipXSpring;
                        if (!springAnimation3.mRunning) {
                            float f4 = liveStoryPipOverlay.pipX;
                            springAnimation3.mValue = f4;
                            springAnimation3.mStartValueIsSet = true;
                            SpringForce springForce2 = springAnimation3.mSpring;
                            int i3 = liveStoryPipOverlay.pipWidth;
                            float f5 = (i3 / 2.0f) + f4;
                            int i4 = AndroidUtilities.displaySize.x;
                            springForce2.mFinalPosition = f5 >= ((float) i4) / 2.0f ? (i4 - i3) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            liveStoryPipOverlay.pipXSpring.start();
                        }
                        SpringAnimation springAnimation4 = liveStoryPipOverlay.pipYSpring;
                        if (!springAnimation4.mRunning) {
                            float f6 = liveStoryPipOverlay.pipY;
                            springAnimation4.mValue = f6;
                            springAnimation4.mStartValueIsSet = true;
                            springAnimation4.mSpring.mFinalPosition = MathUtils.clamp(f6, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - liveStoryPipOverlay.pipHeight) - AndroidUtilities.dp(16.0f));
                            liveStoryPipOverlay.pipYSpring.start();
                        }
                    }
                    return zOnTouchEvent2 || z2;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            boolean z;
            boolean z2;
            switch (this.$r8$classId) {
                case 2:
                    LPhotoPaintView.PopupButton popupButton = (LPhotoPaintView.PopupButton) this.this$0;
                    if (popupButton.imageSwitchAnimator == null || (!((z = popupButton.imageSwitchFill) && view == popupButton.image2View) && (z || view != popupButton.imageView))) {
                        return super.drawChild(canvas, view, j);
                    }
                    float measuredWidth = ((z ? popupButton.imageSwitchT : 1.0f - popupButton.imageSwitchT) * getMeasuredWidth()) / 2.0f;
                    canvas.save();
                    Path path = (Path) this.rect;
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                case 9:
                    PaintView.PopupButton popupButton2 = (PaintView.PopupButton) this.this$0;
                    if (popupButton2.imageSwitchAnimator == null || (!((z2 = popupButton2.imageSwitchFill) && view == popupButton2.image2View) && (z2 || view != popupButton2.imageView))) {
                        return super.drawChild(canvas, view, j);
                    }
                    float measuredWidth2 = ((z2 ? popupButton2.imageSwitchT : 1.0f - popupButton2.imageSwitchT) * getMeasuredWidth()) / 2.0f;
                    canvas.save();
                    Path path2 = (Path) this.rect;
                    path2.rewind();
                    path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth2, Path.Direction.CW);
                    canvas.clipPath(path2);
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 3:
                    super.onAttachedToWindow();
                    ((ChatCustomReactionsEditActivity$2$1) this.rect).onAttach();
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onConfigurationChanged(Configuration configuration) {
            switch (this.$r8$classId) {
                case 4:
                    AndroidUtilities.checkDisplaySize(getContext(), configuration);
                    RTMPStreamPipOverlay rTMPStreamPipOverlay = (RTMPStreamPipOverlay) this.this$0;
                    AndroidUtilities.setPreferredMaxRefreshRate(rTMPStreamPipOverlay.windowManager, rTMPStreamPipOverlay.contentView, rTMPStreamPipOverlay.windowLayoutParams);
                    rTMPStreamPipOverlay.bindTextureView(false);
                    break;
                case 8:
                    AndroidUtilities.checkDisplaySize(getContext(), configuration);
                    LiveStoryPipOverlay liveStoryPipOverlay = (LiveStoryPipOverlay) this.this$0;
                    AndroidUtilities.setPreferredMaxRefreshRate(liveStoryPipOverlay.windowManager, liveStoryPipOverlay.contentView, liveStoryPipOverlay.windowLayoutParams);
                    liveStoryPipOverlay.bindTextureView$1$1();
                    break;
                default:
                    super.onConfigurationChanged(configuration);
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 3:
                    super.onDetachedFromWindow();
                    ((ChatCustomReactionsEditActivity$2$1) this.rect).onDetach();
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 5:
                    canvas.save();
                    VoIPPiPView voIPPiPView = (VoIPPiPView) this.this$0;
                    canvas.scale(voIPPiPView.floatingView.getScaleX(), voIPPiPView.floatingView.getScaleY(), voIPPiPView.floatingView.getPivotX() + voIPPiPView.floatingView.getLeft(), voIPPiPView.floatingView.getPivotY() + voIPPiPView.floatingView.getTop());
                    int left = voIPPiPView.floatingView.getLeft() - AndroidUtilities.dp(2.0f);
                    int top = voIPPiPView.floatingView.getTop() - AndroidUtilities.dp(2.0f);
                    int iDp = AndroidUtilities.dp(2.0f) + voIPPiPView.floatingView.getRight();
                    int iDp2 = AndroidUtilities.dp(2.0f) + voIPPiPView.floatingView.getBottom();
                    Drawable drawable = (Drawable) this.rect;
                    drawable.setBounds(left, top, iDp, iDp2);
                    drawable.draw(canvas);
                    canvas.restore();
                    super.onDraw(canvas);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    ContactsAdapter contactsAdapter = (ContactsAdapter) this.this$0;
                    if (contactsAdapter.isEmptyWithMainTabs && contactsAdapter.hasPhonebook) {
                        super.onMeasure(i, i2);
                    } else {
                        int size = View.MeasureSpec.getSize(i2);
                        ViewGroup viewGroup = (ViewGroup) this.rect;
                        if (size == 0) {
                            size = viewGroup.getMeasuredHeight();
                        }
                        if (size == 0) {
                            size = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                        }
                        int iDp = AndroidUtilities.dp(50.0f);
                        int iDp2 = contactsAdapter.onlyUsers != 0 ? 0 : AndroidUtilities.dp(30.0f) + iDp;
                        if (!contactsAdapter.isAdmin && !contactsAdapter.needPhonebook) {
                            iDp2 += iDp;
                        }
                        int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(iDp2 < paddingTop ? paddingTop - iDp2 : 0, 1073741824));
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 4:
                    super.onSizeChanged(i, i2, i3, i4);
                    Path path = (Path) this.rect;
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, i, i2);
                    path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    break;
                case 8:
                    super.onSizeChanged(i, i2, i3, i4);
                    Path path2 = (Path) this.rect;
                    path2.rewind();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, i, i2);
                    path2.addRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        public void set(int i, CharSequence charSequence, boolean z) {
            ImageView imageView = (ImageView) this.rect;
            if (z) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i);
            } else {
                imageView.setImageResource(i);
            }
            ((TextView) this.this$0).setText(charSequence);
        }

        public AnonymousClass1(Context context) {
            super(context);
            this.$r8$classId = 7;
            ImageView imageView = new ImageView(context);
            this.rect = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.this$0 = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
        }

        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 10:
                    super(context);
                    this.rect = resourcesProvider;
                    WebActionBar.AnonymousClass4 anonymousClass4 = new WebActionBar.AnonymousClass4(context, 2);
                    this.this$0 = anonymousClass4;
                    anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                    anonymousClass4.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                    anonymousClass4.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
                    anonymousClass4.setTextSize(1, 16.0f);
                    anonymousClass4.setMaxLines(Integer.MAX_VALUE);
                    anonymousClass4.setBackground(null);
                    anonymousClass4.setImeOptions(anonymousClass4.getImeOptions() | 268435456);
                    anonymousClass4.setInputType(anonymousClass4.getInputType() | 16384);
                    anonymousClass4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
                    anonymousClass4.setMinHeight(AndroidUtilities.dp(50.0f));
                    addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
                    break;
                default:
                    LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
                    AnimatedTextView animatedTextView = new AnimatedTextView(context);
                    this.rect = animatedTextView;
                    int i2 = Theme.key_windowBackgroundWhiteBlackText;
                    animatedTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
                    animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
                    animatedTextView.setTypeface(AndroidUtilities.bold());
                    linearLayoutM.addView(animatedTextView, LayoutHelper.createLinear(-2, 23, 1));
                    TextView textView = new TextView(context);
                    this.this$0 = textView;
                    textView.setTextSize(1, 11.0f);
                    textView.setTextColor(Theme.getColor(i2, resourcesProvider));
                    textView.setSingleLine();
                    textView.setMaxLines(1);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
                    addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 17));
                    break;
            }
        }

        public AnonymousClass1(ChatLoadingCell chatLoadingCell, Context context) {
            super(context);
            this.$r8$classId = 0;
            this.this$0 = chatLoadingCell;
            this.rect = new RectF();
        }

        public AnonymousClass1(LPhotoPaintView.PopupButton popupButton, Context context) {
            super(context);
            this.$r8$classId = 2;
            this.this$0 = popupButton;
            this.rect = new Path();
        }

        public AnonymousClass1(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, Context context) {
            super(context);
            this.$r8$classId = 3;
            this.this$0 = chatCustomReactionsEditActivity;
            this.rect = new ChatCustomReactionsEditActivity$2$1(this, this);
        }

        public AnonymousClass1(RTMPStreamPipOverlay rTMPStreamPipOverlay, Context context) {
            super(context);
            this.$r8$classId = 4;
            this.this$0 = rTMPStreamPipOverlay;
            this.rect = new Path();
        }

        public AnonymousClass1(LiveStoryPipOverlay liveStoryPipOverlay, Context context) {
            super(context);
            this.$r8$classId = 8;
            this.this$0 = liveStoryPipOverlay;
            this.rect = new Path();
        }

        public AnonymousClass1(PaintView.PopupButton popupButton, Context context) {
            super(context);
            this.$r8$classId = 9;
            this.this$0 = popupButton;
            this.rect = new Path();
        }
    }

    public ChatLoadingCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context);
        this.frameLayout = anonymousClass1;
        anonymousClass1.setWillNotDraw(false);
        addView(anonymousClass1, LayoutHelper.createFrame(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, resourcesProvider);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText, resourcesProvider));
        anonymousClass1.addView(radialProgressView, LayoutHelper.createFrame(32, 32, 17));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z) {
        this.frameLayout.setVisibility(z ? 0 : 4);
    }

    public final void setVisiblePart(float f, int i) {
        if (this.viewTop != f) {
            invalidate();
        }
        this.viewTop = f;
        this.backgroundHeight = i;
    }
}
