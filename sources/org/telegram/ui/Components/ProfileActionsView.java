package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ProfileActivity;

public abstract class ProfileActionsView extends View {
    private AccessibilityNodeProvider accessibilityNodeProvider;
    private final List actions;
    private int activeCount;
    private final Set allAvailableActions;
    private ProfileActivity.AvatarImageView avatarView;
    private Action callAction;
    private boolean callAnimationStateLoaded;
    private float callBackwardAnimateFromX;
    private float callBackwardAnimateFromY;
    private final Path clipAvatarPath;
    public float clipHeight;
    private final Path clipPath;
    private int color;
    private float currentHeight;
    private long downTime;
    private float downX;
    private float downY;
    private Action firstAction;
    private boolean hasColorById;
    private Action hit;
    private boolean ignoreRect;
    public boolean isAnimatingCallAction;
    private boolean isApplying;
    private boolean isNotificationsEnabled;
    public boolean isOpeningLayout;
    private Action lastAction;
    private ColorFilter lastColorFilter;
    private int lastColorFilterColor;
    private final Matrix matrix;
    public int mode;
    private OnActionClickListener onActionClickListener;
    private final Paint paint;
    private float parentExpanded;
    private RadialGradient radialGradient;
    private RenderNode renderNode;
    private float renderNodeScale;
    private float renderNodeTranslateY;
    private final Paint shaderPaint;
    private final int targetHeight;
    final float textPadding;
    final float top;
    final float xpadding;
    final float ypadding;

    public interface OnActionClickListener {
        void onClick(int i, float f, float f2);
    }

    private void checkPaints() {
    }

    public ProfileActionsView(Context context, int i) {
        super(context);
        this.actions = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.shaderPaint = new Paint();
        this.isAnimatingCallAction = false;
        this.isOpeningLayout = true;
        this.clipHeight = -1.0f;
        this.clipAvatarPath = new Path();
        this.clipPath = new Path();
        this.activeCount = 0;
        this.ignoreRect = false;
        this.currentHeight = 0.0f;
        this.onActionClickListener = null;
        this.allAvailableActions = new HashSet();
        this.mode = 6;
        this.callAction = null;
        this.color = 0;
        this.matrix = new Matrix();
        this.hit = null;
        this.callAnimationStateLoaded = false;
        this.callBackwardAnimateFromX = -1.0f;
        this.callBackwardAnimateFromY = -1.0f;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.xpadding = AndroidUtilities.dpf2(14.0f);
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        this.ypadding = fDpf2;
        float fDpf22 = AndroidUtilities.dpf2(8.0f);
        this.top = fDpf22;
        this.textPadding = AndroidUtilities.dpf2(4.0f);
        this.targetHeight = (int) ((i - fDpf2) - fDpf22);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    public void drawingBlur(boolean z) {
        if (this.ignoreRect == z && this.renderNode == null) {
            return;
        }
        this.ignoreRect = z;
        this.renderNode = null;
        this.avatarView = null;
        invalidate();
    }

    public void drawingBlur(RenderNode renderNode, ProfileActivity.AvatarImageView avatarImageView, float f, float f2) {
        this.ignoreRect = false;
        this.renderNode = renderNode;
        this.avatarView = avatarImageView;
        this.renderNodeScale = f;
        this.renderNodeTranslateY = f2;
        invalidate();
    }

    public void setOnActionClickListener(OnActionClickListener onActionClickListener) {
        this.onActionClickListener = onActionClickListener;
    }

    public void setParentExpanded(float f) {
        if (this.parentExpanded != f) {
            this.parentExpanded = f;
            checkPaints();
            invalidate();
        }
    }

    public void setActionsColor(int i, boolean z) {
        if (this.radialGradient != null && this.color == i && this.hasColorById == z) {
            return;
        }
        this.color = i;
        this.hasColorById = z;
        createColorShader();
        checkPaints();
    }

    private boolean isButtonColorLight() {
        return AndroidUtilities.computePerceivedBrightness(this.color) > 0.72f;
    }

    private void createColorShader() {
        int i = this.color;
        if (i == 0) {
            return;
        }
        if (!this.hasColorById) {
            this.paint.setColor(i);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float fMax = ((measuredWidth - ((this.xpadding / 2.0f) * Math.max(0, this.activeCount - 1))) - (this.xpadding * 2.0f)) / Math.max(1, this.activeCount);
        RadialGradient radialGradient = new RadialGradient(fMax / 2.0f, this.targetHeight / 2.0f, this.hasColorById ? fMax * 0.65f : 1.0f, Theme.multAlpha(this.color, 0.8f), this.color, Shader.TileMode.CLAMP);
        this.radialGradient = radialGradient;
        this.shaderPaint.setShader(radialGradient);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec((int) (this.targetHeight + this.top + this.ypadding), 1073741824));
    }

    public void updatePosition(float f, float f2) {
        this.currentHeight = f2;
        setTranslationY(f);
        invalidate();
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f = this.xpadding;
        return ((measuredWidth - ((f / 2.0f) * (r4 - 1))) - (f * 2.0f)) / this.activeCount;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f = this.clipHeight;
        if (f >= 0.0f) {
            float y = f - getY();
            if (y <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y);
            }
        }
        float fMax = Math.max(0.0f, (this.currentHeight - this.ypadding) - this.top);
        if (fMax <= 0.0f) {
            return;
        }
        float f2 = this.xpadding / 2.0f;
        float itemWidth = getItemWidth();
        float f3 = this.xpadding;
        float roundRadius = getRoundRadius();
        if (this.renderNode != null) {
            this.clipPath.rewind();
        }
        int size = this.actions.size();
        Action action = null;
        Action action2 = null;
        for (int i = 0; i < size; i++) {
            Action action3 = (Action) this.actions.get(i);
            if (!action3.isDeleted) {
                if (!action3.isDeleting) {
                    RectF rectF = action3.rect;
                    float f4 = this.top;
                    rectF.set(f3, f4, f3 + itemWidth, f4 + fMax);
                    f3 += itemWidth + f2;
                    if (action == null) {
                        action = action3;
                    }
                    action2 = action3;
                }
                action3.updatePosition();
                if (this.renderNode != null) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(action3.rect);
                    rectF2.inset((action3.rect.width() / 2.0f) * (1.0f - action3.getScale()), (action3.rect.height() / 2.0f) * (1.0f - action3.getScale()));
                    rectF2.inset(-1.0f, -1.0f);
                    this.clipPath.addRoundRect(rectF2, roundRadius, roundRadius, Path.Direction.CCW);
                }
            }
        }
        this.firstAction = action;
        this.lastAction = action2;
        float fClamp01 = Utilities.clamp01(fMax / this.targetHeight);
        float fClamp012 = Utilities.clamp01((fClamp01 - 0.2f) / 0.8f);
        if (fClamp012 <= 0.0f) {
            return;
        }
        if (!this.ignoreRect) {
            for (int i2 = 0; i2 < size; i2++) {
                Action action4 = (Action) this.actions.get(i2);
                if (!action4.isDeleted) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(action4.rect);
                    rectF3.inset((action4.rect.width() / 2.0f) * (1.0f - action4.getScale()), (action4.rect.height() / 2.0f) * (1.0f - action4.getScale()));
                    int alpha = this.paint.getAlpha();
                    float alpha2 = (int) (action4.getAlpha() * fClamp012 * alpha);
                    this.paint.setAlpha((int) ((this.radialGradient != null ? 0.1f : 1.0f) * alpha2));
                    if (SharedConfig.shadowsInSections && isButtonColorLight() && this.parentExpanded < 0.5f) {
                        this.paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, Theme.multAlpha(536870912, (alpha2 / 255.0f) * (this.radialGradient == null ? 1.0f : 0.1f)));
                    } else {
                        this.paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    canvas.drawRoundRect(rectF3, roundRadius, roundRadius, this.paint);
                    if (this.radialGradient != null) {
                        int alpha3 = this.shaderPaint.getAlpha();
                        this.shaderPaint.setAlpha((int) (action4.getAlpha() * fClamp012 * alpha3));
                        this.matrix.setTranslate(rectF3.left, rectF3.top);
                        this.radialGradient.setLocalMatrix(this.matrix);
                        canvas.drawRoundRect(rectF3, roundRadius, roundRadius, this.shaderPaint);
                        this.shaderPaint.setAlpha(alpha3);
                    }
                    this.paint.setAlpha(alpha);
                }
            }
        }
        drawRenderNode(canvas);
        float fClamp013 = Utilities.clamp01((fClamp01 - 0.4f) / 0.6f);
        if (fClamp013 > 0.0f) {
            for (int i3 = 0; i3 < size; i3++) {
                drawAction(canvas, (Action) this.actions.get(i3), fClamp01, fClamp013);
            }
        }
    }

    private void drawRenderNode(Canvas canvas) {
        RenderNode renderNode = this.renderNode;
        if (renderNode == null || Build.VERSION.SDK_INT < 29 || !renderNode.hasDisplayList() || !canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        ProfileActivity.AvatarImageView avatarImageView = this.avatarView;
        if (avatarImageView != null) {
            View view = (View) avatarImageView.getParent();
            float x = view.getX();
            float y = view.getY() - getTranslationY();
            float width = view.getWidth() * view.getScaleX();
            float height = view.getHeight() * view.getScaleY();
            this.clipAvatarPath.rewind();
            this.clipAvatarPath.addRoundRect(x, y, x + width, y + height, this.avatarView.getRoundRadiusForExpand() * view.getScaleX(), view.getScaleY() * this.avatarView.getRoundRadiusForExpand(), Path.Direction.CCW);
            canvas.clipPath(this.clipAvatarPath);
        }
        canvas.clipPath(this.clipPath);
        canvas.translate(0.0f, this.renderNodeTranslateY);
        float f = this.renderNodeScale;
        canvas.scale(f, f);
        canvas.drawRenderNode(this.renderNode);
        canvas.restore();
    }

    public void stopLoading(int i) {
        stopLoading(find(i));
    }

    private void stopLoading(Action action) {
        if (action == null || !action.isLoading) {
            return;
        }
        action.isLoading = false;
        invalidate();
    }

    private void updateBounds(Action action) {
        float f;
        float fCenterX = action.rect.centerX();
        action.rect.centerY();
        float fDp = AndroidUtilities.dp(24.0f);
        float f2 = 0.5f * fDp;
        action.text.setMaxWidth(action.rect.width() - AndroidUtilities.dp(2.0f));
        if (action.text.getLineCount() >= 3) {
            f = 0.75f;
        } else {
            f = action.text.getLineCount() >= 2 ? 0.85f : 1.0f;
        }
        action.textScale = f;
        float fMax = Math.max(0.0f, ((this.targetHeight - (action.text.getHeight() * action.textScale)) / 3.0f) + AndroidUtilities.dpf2(1.33f));
        action.setBounds((int) (fCenterX - f2), (int) fMax, (int) (fCenterX + f2), (int) (fMax + fDp));
    }

    private void drawAction(Canvas canvas, Action action, float f, float f2) {
        if (action == null || action.isDeleted) {
            return;
        }
        boolean zIsButtonColorLight = isButtonColorLight();
        float fClamp = !zIsButtonColorLight ? 1.0f : MathUtils.clamp((this.parentExpanded - 0.75f) / 0.25f, 0.0f, 1.0f);
        if (zIsButtonColorLight && Build.VERSION.SDK_INT < 31) {
            fClamp = 0.0f;
        }
        int iBlendARGB = ColorUtils.blendARGB(-16777216, -1, fClamp);
        if (this.lastColorFilter == null || this.lastColorFilterColor != iBlendARGB) {
            this.lastColorFilterColor = iBlendARGB;
            this.lastColorFilter = new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN);
        }
        canvas.save();
        float alpha = f2 * action.getAlpha();
        float fCenterX = action.rect.centerX();
        float fCenterY = action.rect.centerY();
        float scale = f * action.getScale();
        canvas.scale(scale, scale, fCenterX, fCenterY);
        canvas.clipRect(action.rect);
        updateBounds(action);
        float height = ((action.bounds.bottom + action.bounds.top) - ((action.text.getHeight() * action.textScale) / 2.0f)) - AndroidUtilities.dp(4.66f);
        canvas.save();
        canvas.scale(action.textScale, action.textScale, fCenterX, ((action.text.getHeight() * action.textScale) / 2.0f) + height);
        action.text.draw(canvas, fCenterX - (action.text.getWidth() / 2.0f), height, iBlendARGB, alpha);
        canvas.restore();
        int i = action.iconTranslationY;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        float f3 = action.iconScale;
        if (f3 != 1.0f) {
            canvas.scale(f3, f3, action.bounds.centerX(), action.bounds.centerY());
        }
        if (!this.isAnimatingCallAction || action.key != 5) {
            float f4 = (1.0f - fClamp) * alpha;
            float f5 = fClamp * alpha;
            if (action.drawableAnimated != null) {
                if (action.key == 1) {
                    drawActionDrawable(canvas, action.drawableOutline, f4);
                    drawActionDrawable(canvas, action.drawableAnimated, f5);
                } else {
                    drawActionDrawable(canvas, action.drawableAnimated, alpha);
                }
            } else {
                drawActionDrawable(canvas, action.drawableOutline, f4);
                drawActionDrawable(canvas, action.drawableFilled, f5);
            }
        }
        canvas.restore();
        drawLoading(canvas, action, alpha);
    }

    private void drawActionDrawable(Canvas canvas, Drawable drawable, float f) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.lastColorFilter);
        drawable.setAlpha((int) (f * 255.0f));
        drawable.draw(canvas);
    }

    private void drawLoading(Canvas canvas, Action action, float f) {
        if (action.stopDelay > 0 && System.currentTimeMillis() > action.stopDelay + action.startTime) {
            action.isLoading = false;
        }
        if (action.isLoading) {
            LoadingDrawable loadingDrawable = action.loadingDrawable;
            if (loadingDrawable == null) {
                LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                action.loadingDrawable = loadingDrawable2;
                loadingDrawable2.setCallback(this);
                action.loadingDrawable.setColors(Theme.multAlpha(-1, 0.1f), Theme.multAlpha(-1, 0.3f), Theme.multAlpha(-1, 0.35f), Theme.multAlpha(-1, 0.8f));
                action.loadingDrawable.setAppearByGradient(true);
                action.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
            } else if (loadingDrawable.isDisappeared() || action.loadingDrawable.isDisappearing()) {
                action.loadingDrawable.reset();
                action.loadingDrawable.resetDisappear();
            }
        } else {
            LoadingDrawable loadingDrawable3 = action.loadingDrawable;
            if (loadingDrawable3 != null && !loadingDrawable3.isDisappearing() && !action.loadingDrawable.isDisappeared()) {
                action.loadingDrawable.disappear();
            }
        }
        LoadingDrawable loadingDrawable4 = action.loadingDrawable;
        if (loadingDrawable4 != null) {
            loadingDrawable4.setBounds(action.rect);
            action.loadingDrawable.setRadii(getRoundRadius());
            action.loadingDrawable.setAlpha((int) (f * 255.0f));
            action.loadingDrawable.draw(canvas);
        }
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Action action;
        if (this.currentHeight < AndroidUtilities.dp(8.0f)) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.hit = null;
            int size = this.actions.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Action action3 = (Action) this.actions.get(i);
                if (!action3.isDeleting && action3.rect.contains(x, y)) {
                    this.hit = action3;
                    this.downX = x;
                    this.downY = y;
                    this.downTime = System.currentTimeMillis();
                    this.hit.bounce.setPressed(true);
                    break;
                }
                i++;
            }
        } else if (action2 == 2) {
            if (this.hit != null && (Math.abs(x - this.downX) > 20.0f || Math.abs(y - this.downY) > 20.0f)) {
                this.hit.bounce.setPressed(false);
                this.hit = null;
            }
        } else if ((action2 == 1 || action2 == 3) && (action = this.hit) != null) {
            action.bounce.setPressed(false);
            if (action2 == 1 && this.hit.rect.contains(x, y)) {
                if (System.currentTimeMillis() - this.downTime > 250) {
                    try {
                        performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                }
                Action action4 = this.hit;
                if (action4.supportsLoading && !action4.isLoading) {
                    action4.isLoading = true;
                    invalidate();
                }
                Action action5 = this.hit;
                int i2 = action5.supportsAnimate;
                if (i2 != 0) {
                    action5.updateDrawable(true, i2);
                }
                this.hit.startTime = System.currentTimeMillis();
                final Action action6 = this.hit;
                OnActionClickListener onActionClickListener = this.onActionClickListener;
                if (onActionClickListener != null) {
                    if (action6.callDelay == 0) {
                        int i3 = action6.key;
                        RectF rectF = action6.rect;
                        onActionClickListener.onClick(i3, rectF.left, rectF.top);
                    } else {
                        postDelayed(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onTouchEvent$0(action6);
                            }
                        }, action6.callDelay);
                    }
                }
            }
            this.hit = null;
            return true;
        }
        return this.hit != null;
    }

    public void lambda$onTouchEvent$0(Action action) {
        OnActionClickListener onActionClickListener = this.onActionClickListener;
        int i = action.key;
        RectF rectF = action.rect;
        onActionClickListener.onClick(i, rectF.left, rectF.top);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof LoadingDrawable);
    }

    public void beginApplyingActions() {
        this.isApplying = true;
    }

    public void commitActions() {
        if (this.isApplying) {
            this.isApplying = false;
            applyVisibleActions();
        }
    }

    public void set(int i, boolean z) {
        boolean zRemove;
        if (z) {
            zRemove = this.allAvailableActions.add(Integer.valueOf(i));
        } else {
            zRemove = this.allAvailableActions.remove(Integer.valueOf(i));
        }
        if (zRemove) {
            applyVisibleActions();
        }
    }

    public void setNotifications(boolean z) {
        boolean z2 = this.isNotificationsEnabled != z;
        this.isNotificationsEnabled = z;
        Action actionFind = find(1);
        if (actionFind != null) {
            updateNotification(actionFind, z2);
            invalidate();
        } else {
            this.allAvailableActions.add(1);
            applyVisibleActions();
        }
    }

    public void addCameraAction() {
        Action action = new Action(ActionButton.SET_PHOTO);
        action.key = 14;
        this.actions.add(action);
    }

    public void addEditInfo() {
        Action action = new Action(ActionButton.EDIT_INFO);
        action.key = 16;
        this.actions.add(action);
    }

    public void addSettings() {
        Action action = new Action(ActionButton.SETTINGS);
        action.key = 17;
        this.actions.add(action);
    }

    public void startAnimatedActions() {
        if (this.mode == 6) {
            int size = this.actions.size();
            for (int i = 0; i < size; i++) {
                Action action = (Action) this.actions.get(i);
                if (action.drawableAnimated != null) {
                    if (action.key == 15) {
                        action.drawableAnimated.setCurrentFrame(14);
                    } else {
                        action.drawableAnimated.setCurrentFrame(0);
                    }
                    action.drawableAnimated.start();
                }
            }
        }
    }

    public boolean supportsEditInfo() {
        return this.mode == 6;
    }

    public void startCameraAnimation() {
        Action actionFind = find(14);
        if (actionFind == null || actionFind.drawableAnimated == null) {
            return;
        }
        actionFind.drawableAnimated.start();
    }

    public boolean canHaveJoinAction() {
        int i = this.mode;
        return i == 1 || i == 3;
    }

    private void updateNotification(Action action, boolean z) {
        if (z) {
            if (this.isNotificationsEnabled) {
                ActionButton actionButton = ActionButton.NOTIFICATION_MUTE;
                action.setText(LocaleController.getString(actionButton.title));
                action.updateDrawable(R.raw.profile_unmuting, actionButton.filledIcon, actionButton.outlineIcon);
                return;
            } else {
                ActionButton actionButton2 = ActionButton.NOTIFICATION_UNMUTE;
                action.setText(LocaleController.getString(actionButton2.title));
                action.updateDrawable(R.raw.profile_muting, actionButton2.filledIcon, actionButton2.outlineIcon);
                return;
            }
        }
        action.update(this.isNotificationsEnabled ? ActionButton.NOTIFICATION_MUTE : ActionButton.NOTIFICATION_UNMUTE);
    }

    private void applyVisibleActions() {
        if (this.isApplying) {
            return;
        }
        if (this.mode == 6) {
            this.activeCount = this.actions.size();
            invalidate();
            return;
        }
        final ArrayList arrayList = new ArrayList();
        boolean zHasJoin = hasJoin();
        int i = this.mode;
        if (i == 0) {
            insertIfAvailable(arrayList, 0);
            insertIfAvailable(arrayList, 1);
            insertIfAvailable(arrayList, 5);
            insertIfAvailable(arrayList, 6);
            insertIfNotAvailable(arrayList, 3, 6);
        } else if (i == 1) {
            if (zHasJoin) {
                insertIfAvailable(arrayList, 7);
            } else {
                insertIfAvailable(arrayList, 10);
                insertIfNotAvailable(arrayList, 11, 10);
            }
            insertIfAvailable(arrayList, 1);
            if (!zHasJoin) {
                insertIfAvailable(arrayList, 2);
                insertIfNotAvailable2(arrayList, 3, 2, 12);
            }
            insertIfNotAvailable(arrayList, 4, 12);
            if (zHasJoin) {
                arrayList.add(getOrCreate(8));
            } else {
                insertIfAvailable(arrayList, 12);
                insertIfNotAvailable(arrayList, 9, 12);
            }
        } else if (i == 2) {
            insertIfAvailable(arrayList, 0);
            insertIfAvailable(arrayList, 1);
            insertIfAvailable(arrayList, 4);
            arrayList.add(getOrCreate(13));
        } else if (i == 3 || i == 4) {
            if (zHasJoin) {
                insertIfAvailable(arrayList, 7);
            } else {
                insertIfAvailable(arrayList, 0);
            }
            insertIfAvailable(arrayList, 1);
            if (zHasJoin) {
                arrayList.add(getOrCreate(8));
            } else {
                insertIfAvailable(arrayList, 10);
                insertIfNotAvailable(arrayList, 11, 10);
                insertIfAvailable(arrayList, 9);
            }
        } else if (i == 5) {
            insertIfAvailable(arrayList, 0);
            insertIfAvailable(arrayList, 1);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyVisibleActions$1(arrayList);
            }
        });
    }

    public void lambda$applyVisibleActions$1(List list) {
        int i = this.activeCount;
        int size = list.size();
        this.activeCount = size;
        if (i != size && this.radialGradient != null) {
            createColorShader();
        }
        int size2 = this.actions.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Action action = (Action) this.actions.get(i2);
            if (action.isDeleting && !action.isDeleted) {
                list.add(action);
            } else if (find(list, action.key) == null) {
                action.delete();
                list.add(action);
            }
        }
        this.actions.clear();
        this.actions.addAll(list);
        invalidate();
    }

    private void insertIfAvailable(List list, int i) {
        if (this.allAvailableActions.contains(Integer.valueOf(i))) {
            list.add(getOrCreate(i));
        }
    }

    private void insertIfNotAvailable(List list, int i, int i2) {
        if (!this.allAvailableActions.contains(Integer.valueOf(i)) || this.allAvailableActions.contains(Integer.valueOf(i2))) {
            return;
        }
        list.add(getOrCreate(i));
    }

    private void insertIfNotAvailable2(List list, int i, int i2, int i3) {
        if (!this.allAvailableActions.contains(Integer.valueOf(i)) || this.allAvailableActions.contains(Integer.valueOf(i2)) || this.allAvailableActions.contains(Integer.valueOf(i3))) {
            return;
        }
        list.add(getOrCreate(i));
    }

    private boolean hasJoin() {
        return this.allAvailableActions.contains(7) && !this.allAvailableActions.contains(9);
    }

    private Action getOrCreate(int i) {
        Action actionFind = find(i);
        if (actionFind != null) {
            if (i == 1) {
                updateNotification(actionFind, false);
            }
            return actionFind;
        }
        switch (i) {
            case 0:
                actionFind = new Action(ActionButton.MESSAGE);
                break;
            case 1:
                actionFind = new Action();
                updateNotification(actionFind, false);
                break;
            case 2:
                actionFind = new Action(ActionButton.DISCUSS);
                break;
            case 3:
                actionFind = new Action(ActionButton.GIFT);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 200;
                break;
            case 4:
                actionFind = new Action(ActionButton.SHARE);
                break;
            case 5:
                actionFind = new Action(ActionButton.CALL);
                this.callAction = actionFind;
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 500;
                break;
            case 6:
                actionFind = new Action(ActionButton.VIDEO);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 500;
                break;
            case 7:
                actionFind = new Action(ActionButton.JOIN);
                actionFind.supportsLoading = true;
                actionFind.callDelay = 300;
                break;
            case 8:
                actionFind = new Action(ActionButton.REPORT);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 500;
                break;
            case 9:
                actionFind = new Action(ActionButton.LEAVE);
                actionFind.supportsLoading = true;
                actionFind.supportsAnimate = R.raw.profile_leave;
                actionFind.stopDelay = 300;
                break;
            case 10:
                actionFind = new Action(ActionButton.VOICE_CHAT);
                actionFind.supportsLoading = true;
                actionFind.supportsAnimate = R.raw.profile_voicechat;
                actionFind.stopDelay = 500;
                break;
            case 11:
                actionFind = new Action(ActionButton.STREAM);
                actionFind.supportsLoading = true;
                actionFind.supportsAnimate = R.raw.profile_voicechat;
                actionFind.stopDelay = 500;
                break;
            case 12:
                actionFind = new Action(ActionButton.STORY);
                break;
            case 13:
                actionFind = new Action(ActionButton.STOP);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 300;
                break;
        }
        if (actionFind != null) {
            actionFind.key = i;
        }
        return actionFind;
    }

    private Action find(int i) {
        return find(this.actions, i);
    }

    private Action find(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Action action = (Action) list.get(i2);
            if (!action.isDeleting && action.key == i) {
                return action;
            }
        }
        return null;
    }

    public boolean hasCall() {
        return this.allAvailableActions.contains(5) && this.callAction != null;
    }

    class Action {
        private final ButtonBounce bounce;
        private RLottieDrawable drawableAnimated;
        private Drawable drawableFilled;
        private Drawable drawableOutline;
        boolean isLoading;
        int key;
        LoadingDrawable loadingDrawable;
        private final AnimatedFloat positionFraction;
        long startTime;
        int stopDelay;
        int supportsAnimate;
        boolean supportsLoading;
        private Text text;
        final RectF prevRect = new RectF();
        final RectF rect = new RectF();
        private final RectF to = new RectF();
        private final RectF from = new RectF();
        private final Rect bounds = new Rect();
        private float textScale = 1.0f;
        boolean isOpening = false;
        boolean isDeleting = false;
        boolean isDeleted = false;
        int iconTranslationY = 0;
        float iconScale = 1.0f;
        int callDelay = 0;

        public void setBounds(int i, int i2, int i3, int i4) {
            this.bounds.set(i, i2, i3, i4);
            checkBounds();
        }

        private void checkBounds() {
            RLottieDrawable rLottieDrawable = this.drawableAnimated;
            if (rLottieDrawable != null) {
                rLottieDrawable.setBounds(this.bounds);
            }
            Drawable drawable = this.drawableFilled;
            if (drawable != null) {
                drawable.setBounds(this.bounds);
            }
            Drawable drawable2 = this.drawableOutline;
            if (drawable2 != null) {
                drawable2.setBounds(this.bounds);
            }
        }

        public void setText(CharSequence charSequence) {
            this.text = new Text(charSequence, 11.0f, AndroidUtilities.bold()).multiline(3).align(Layout.Alignment.ALIGN_CENTER);
        }

        public Action() {
            this.bounce = new ButtonBounce(ProfileActionsView.this);
            this.positionFraction = new AnimatedFloat(ProfileActionsView.this, 0L, 250L, CubicBezierInterpolator.DEFAULT);
        }

        public Action(ActionButton actionButton) {
            this.bounce = new ButtonBounce(ProfileActionsView.this);
            this.positionFraction = new AnimatedFloat(ProfileActionsView.this, 0L, 250L, CubicBezierInterpolator.DEFAULT);
            update(actionButton);
        }

        public float getAlpha() {
            if (this.isDeleting) {
                return 1.0f - this.positionFraction.set(1.0f);
            }
            if (this.isOpening) {
                return this.positionFraction.set(1.0f);
            }
            return 1.0f;
        }

        public void delete() {
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            boolean z = false;
            if (loadingDrawable != null) {
                loadingDrawable.disappear();
                this.supportsLoading = false;
                this.isLoading = false;
            }
            this.isDeleting = true;
            RectF rectF = this.prevRect;
            float f = rectF.left - 1.0f;
            ProfileActionsView profileActionsView = ProfileActionsView.this;
            boolean z2 = f <= profileActionsView.xpadding;
            boolean z3 = rectF.right + 1.0f >= ((float) profileActionsView.getMeasuredWidth()) - ProfileActionsView.this.xpadding;
            if (z2 && z3) {
                z3 = false;
            } else {
                z = z2;
            }
            this.from.set(this.prevRect);
            this.to.set(this.prevRect);
            if (z) {
                RectF rectF2 = this.to;
                rectF2.right = rectF2.left;
            } else if (z3) {
                RectF rectF3 = this.to;
                rectF3.left = rectF3.right;
            } else {
                int i = this.key;
                if ((i == 3 || i == 2) && ProfileActionsView.this.mode == 1) {
                    RectF rectF4 = this.to;
                    rectF4.left = rectF4.right;
                } else {
                    RectF rectF5 = this.to;
                    float fCenterX = rectF5.centerX();
                    rectF5.right = fCenterX;
                    rectF5.left = fCenterX;
                }
            }
            this.positionFraction.set(0.0f, true);
        }

        public void updateDrawable(boolean z, int i) {
            if (z) {
                updateDrawable(i, 0, 0);
            } else {
                updateDrawable(0, i, i);
            }
        }

        public void updatePosition() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ProfileActionsView.Action.updatePosition():void");
        }

        private void animatePosition() {
            float f = this.positionFraction.set(1.0f);
            if (f != 1.0f) {
                this.rect.left = AndroidUtilities.lerp(this.from.left, this.to.left, f);
                this.rect.right = AndroidUtilities.lerp(this.from.right, this.to.right, f);
                return;
            }
            this.isOpening = false;
            if (this.isDeleting) {
                this.isDeleted = true;
            }
        }

        public float getScale() {
            return this.bounce.getScale(0.04f);
        }

        public void update(ActionButton actionButton) {
            updateDrawable(0, actionButton.filledIcon, actionButton.outlineIcon);
            setText(LocaleController.getString(actionButton.title));
        }

        public void updateDrawable(int i, int i2, int i3) {
            if (i != 0) {
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
                rLottieDrawable.setMasterParent(ProfileActionsView.this);
                rLottieDrawable.start();
                this.drawableAnimated = rLottieDrawable;
            } else {
                this.drawableAnimated = null;
            }
            this.drawableFilled = i2 != 0 ? ProfileActionsView.this.getResources().getDrawable(i2).mutate() : null;
            this.drawableOutline = i3 != 0 ? ProfileActionsView.this.getResources().getDrawable(i3).mutate() : null;
            checkBounds();
        }
    }

    public static final class ActionButton {
        private static final ActionButton[] $VALUES;
        public static final ActionButton CALL;
        public static final ActionButton DISCUSS;
        public static final ActionButton EDIT_INFO;
        public static final ActionButton EDIT_USERNAME;
        public static final ActionButton GIFT;
        public static final ActionButton JOIN;
        public static final ActionButton LEAVE;
        public static final ActionButton MESSAGE;
        public static final ActionButton NOTIFICATION_MUTE;
        public static final ActionButton NOTIFICATION_UNMUTE;
        public static final ActionButton REPORT;
        public static final ActionButton SETTINGS;
        public static final ActionButton SET_PHOTO;
        public static final ActionButton SHARE;
        public static final ActionButton STOP;
        public static final ActionButton STORY;
        public static final ActionButton STREAM;
        public static final ActionButton VIDEO;
        public static final ActionButton VOICE_CHAT;
        final int filledIcon;
        final int outlineIcon;
        final int title;

        private static ActionButton[] $values() {
            return new ActionButton[]{MESSAGE, NOTIFICATION_MUTE, NOTIFICATION_UNMUTE, DISCUSS, GIFT, SHARE, CALL, VIDEO, JOIN, REPORT, LEAVE, VOICE_CHAT, STREAM, STORY, STOP, SET_PHOTO, EDIT_USERNAME, EDIT_INFO, SETTINGS};
        }

        public static ActionButton valueOf(String str) {
            return (ActionButton) Enum.valueOf(ActionButton.class, str);
        }

        public static ActionButton[] values() {
            return (ActionButton[]) $VALUES.clone();
        }

        static {
            int i = R.string.ProfileActionsMessage;
            int i2 = R.drawable.filled_profile_message_24;
            int i3 = R.drawable.outline_profile_message_24;
            MESSAGE = new ActionButton("MESSAGE", 0, i, i2, i3);
            NOTIFICATION_MUTE = new ActionButton("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
            NOTIFICATION_UNMUTE = new ActionButton("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
            DISCUSS = new ActionButton("DISCUSS", 3, R.string.ProfileActionsDiscuss, i2, i3);
            GIFT = new ActionButton("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
            SHARE = new ActionButton("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
            CALL = new ActionButton("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
            VIDEO = new ActionButton("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
            JOIN = new ActionButton("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
            REPORT = new ActionButton("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
            int i4 = R.string.ProfileActionsLeave;
            int i5 = R.drawable.leave;
            LEAVE = new ActionButton("LEAVE", 10, i4, i5, i5);
            int i6 = R.string.ProfileActionsVoiceChat;
            int i7 = R.drawable.live_stream;
            VOICE_CHAT = new ActionButton("VOICE_CHAT", 11, i6, i7, i7);
            STREAM = new ActionButton("STREAM", 12, R.string.ProfileActionsLiveStream, i7, i7);
            STORY = new ActionButton("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
            STOP = new ActionButton("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
            SET_PHOTO = new ActionButton("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
            int i8 = R.string.ProfileActionsEditUsername;
            int i9 = R.drawable.filled_profile_edit_24;
            int i10 = R.drawable.outline_profile_edit_24;
            EDIT_USERNAME = new ActionButton("EDIT_USERNAME", 16, i8, i9, i10);
            EDIT_INFO = new ActionButton("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i9, i10);
            SETTINGS = new ActionButton("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
            $VALUES = $values();
        }

        private ActionButton(String str, int i, int i2, int i3, int i4) {
            this.title = i2;
            this.filledIcon = i3;
            this.outlineIcon = i4;
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.accessibilityNodeProvider == null) {
            this.accessibilityNodeProvider = new AccessibilityNodeProvider() {
                @Override
                public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                    Action action;
                    int[] iArr = {0, 0};
                    ProfileActionsView.this.getLocationOnScreen(iArr);
                    if (i == -1) {
                        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(ProfileActionsView.this);
                        ProfileActionsView.this.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                        accessibilityNodeInfoObtain.setEnabled(true);
                        for (int i2 = 0; i2 < ProfileActionsView.this.actions.size(); i2++) {
                            ProfileActionsView profileActionsView = ProfileActionsView.this;
                            accessibilityNodeInfoObtain.addChild(profileActionsView, ((Action) profileActionsView.actions.get(i2)).key);
                        }
                        return accessibilityNodeInfoObtain;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= ProfileActionsView.this.actions.size()) {
                            action = null;
                            break;
                        }
                        if (((Action) ProfileActionsView.this.actions.get(i3)).key == i) {
                            action = (Action) ProfileActionsView.this.actions.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (action == null || action.rect.isEmpty()) {
                        return null;
                    }
                    AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
                    accessibilityNodeInfoObtain2.setSource(ProfileActionsView.this, i);
                    accessibilityNodeInfoObtain2.setParent(ProfileActionsView.this);
                    accessibilityNodeInfoObtain2.setPackageName(ProfileActionsView.this.getContext().getPackageName());
                    accessibilityNodeInfoObtain2.addAction(16);
                    accessibilityNodeInfoObtain2.addAction(64);
                    accessibilityNodeInfoObtain2.setClickable(true);
                    accessibilityNodeInfoObtain2.setFocusable(true);
                    accessibilityNodeInfoObtain2.setEnabled(true);
                    accessibilityNodeInfoObtain2.setVisibleToUser(true);
                    accessibilityNodeInfoObtain2.setClassName(Button.class.getName());
                    accessibilityNodeInfoObtain2.setText(action.text.getText());
                    RectF rectF = action.rect;
                    Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                    rect.offset(iArr[0], iArr[1]);
                    accessibilityNodeInfoObtain2.setBoundsInScreen(rect);
                    return accessibilityNodeInfoObtain2;
                }

                @Override
                public boolean performAction(int i, int i2, Bundle bundle) {
                    Action action;
                    if (i == -1) {
                        return ProfileActionsView.this.performAccessibilityAction(i2, bundle);
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= ProfileActionsView.this.actions.size()) {
                            action = null;
                            break;
                        }
                        if (((Action) ProfileActionsView.this.actions.get(i3)).key == i) {
                            action = (Action) ProfileActionsView.this.actions.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (action == null) {
                        return false;
                    }
                    if (i2 == 64) {
                        sendAccessibilityEventForVirtualView(i, 32768);
                        return true;
                    }
                    if (i2 != 16) {
                        return false;
                    }
                    if (ProfileActionsView.this.onActionClickListener != null) {
                        ProfileActionsView.this.onActionClickListener.onClick(i, 0.0f, 0.0f);
                    }
                    return true;
                }

                private void sendAccessibilityEventForVirtualView(int i, int i2) {
                    sendAccessibilityEventForVirtualView(i, i2, null);
                }

                private void sendAccessibilityEventForVirtualView(int i, int i2, String str) {
                    if (((AccessibilityManager) ProfileActionsView.this.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
                        accessibilityEventObtain.setPackageName(ProfileActionsView.this.getContext().getPackageName());
                        accessibilityEventObtain.setSource(ProfileActionsView.this, i);
                        if (str != null) {
                            accessibilityEventObtain.getText().add(str);
                        }
                        if (ProfileActionsView.this.getParent() != null) {
                            ProfileActionsView.this.getParent().requestSendAccessibilityEvent(ProfileActionsView.this, accessibilityEventObtain);
                        }
                    }
                }
            };
        }
        return this.accessibilityNodeProvider;
    }
}
