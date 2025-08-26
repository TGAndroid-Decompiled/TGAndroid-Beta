package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ProfileActivity;

public class ProfileActionsView extends View {
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
    private final Matrix matrix;
    public int mode;
    private OnActionClickListener onActionClickListener;
    final float padding;
    private final Paint paint;
    private RadialGradient radialGradient;
    private RenderNode renderNode;
    private float renderNodeScale;
    private float renderNodeTranslateY;
    private final Paint shaderPaint;
    private final int targetHeight;
    private final android.graphics.Rect textBounds;
    final float textPadding;
    private final TextPaint textPaint;
    final float top;

    public interface OnActionClickListener {
        void onClick(int i, float f, float f2);
    }

    public ProfileActionsView(Context context, int i) {
        super(context);
        this.actions = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.shaderPaint = new Paint();
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        this.textBounds = new android.graphics.Rect();
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
        float dpf2 = AndroidUtilities.dpf2(18.0f);
        this.padding = dpf2;
        float dpf22 = AndroidUtilities.dpf2(8.0f);
        this.top = dpf22;
        this.textPadding = AndroidUtilities.dpf2(4.0f);
        this.targetHeight = (int) ((i - dpf2) - dpf22);
        textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint.setColor(-1);
        setBackgroundColor(0);
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

    public void setActionsColor(int i, boolean z) {
        if (this.radialGradient != null && this.color == i && this.hasColorById == z) {
            return;
        }
        this.color = i;
        this.hasColorById = z;
        createColorShader();
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
        float f = this.padding;
        float f2 = ((measuredWidth - ((f / 2.0f) * (r4 - 1))) - (f * 2.0f)) / this.activeCount;
        RadialGradient radialGradient = new RadialGradient(f2 / 2.0f, this.targetHeight / 2.0f, this.hasColorById ? f2 * 0.65f : 1.0f, 671088640, this.color, Shader.TileMode.CLAMP);
        this.radialGradient = radialGradient;
        this.shaderPaint.setShader(radialGradient);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec((int) (this.targetHeight + this.top + this.padding), 1073741824));
    }

    public void updatePosition(float f, float f2) {
        this.currentHeight = f2;
        setTranslationY(f);
        invalidate();
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f = this.padding;
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
        float max = Math.max(0.0f, (this.currentHeight - this.padding) - this.top);
        if (max <= 0.0f) {
            return;
        }
        float f2 = this.padding / 2.0f;
        float itemWidth = getItemWidth();
        float f3 = this.padding;
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
                    rectF.set(f3, f4, f3 + itemWidth, f4 + max);
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
                    this.clipPath.addRoundRect(rectF2, roundRadius, roundRadius, Path.Direction.CCW);
                }
            }
        }
        this.firstAction = action;
        this.lastAction = action2;
        float clamp01 = Utilities.clamp01(max / this.targetHeight);
        float clamp012 = Utilities.clamp01((clamp01 - 0.2f) / 0.8f);
        if (clamp012 <= 0.0f) {
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
                    int alpha2 = (int) (action4.getAlpha() * clamp012 * alpha);
                    this.paint.setAlpha((int) (alpha2 * (this.radialGradient != null ? 0.1f : 1.0f)));
                    canvas.drawRoundRect(rectF3, roundRadius, roundRadius, this.paint);
                    if (this.radialGradient != null) {
                        this.shaderPaint.setAlpha(alpha2);
                        this.matrix.setTranslate(rectF3.left, rectF3.top);
                        this.radialGradient.setLocalMatrix(this.matrix);
                        canvas.drawRoundRect(rectF3, roundRadius, roundRadius, this.shaderPaint);
                    }
                    this.paint.setAlpha(alpha);
                }
            }
        }
        drawRenderNode(canvas);
        float clamp013 = Utilities.clamp01((clamp01 - 0.4f) / 0.6f);
        if (clamp013 > 0.0f) {
            for (int i3 = 0; i3 < size; i3++) {
                drawAction(canvas, (Action) this.actions.get(i3), clamp01, clamp013);
            }
        }
    }

    private void drawRenderNode(Canvas canvas) {
        boolean hasDisplayList;
        RenderNode renderNode = this.renderNode;
        if (renderNode == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        hasDisplayList = renderNode.hasDisplayList();
        if (hasDisplayList && canvas.isHardwareAccelerated()) {
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
        float centerX = action.rect.centerX();
        action.rect.centerY();
        float dp = AndroidUtilities.dp(this.mode == 6 ? 28.0f : 24.0f);
        float f2 = 0.5f * dp;
        action.text.setMaxWidth(action.rect.width() - AndroidUtilities.dp(2.0f));
        if (action.text.getLineCount() >= 3) {
            f = 0.75f;
        } else {
            f = action.text.getLineCount() >= 2 ? 0.85f : 1.0f;
        }
        action.textScale = f;
        float max = Math.max(0.0f, (this.targetHeight - (action.text.getHeight() * action.textScale)) / 3.0f);
        action.drawable.setBounds((int) (centerX - f2), (int) max, (int) (centerX + f2), (int) (max + dp));
    }

    private void drawAction(Canvas canvas, Action action, float f, float f2) {
        if (action == null || action.drawable == null || action.isDeleted) {
            return;
        }
        canvas.save();
        float alpha = f2 * action.getAlpha();
        float centerX = action.rect.centerX();
        float centerY = action.rect.centerY();
        float scale = f * action.getScale();
        canvas.scale(scale, scale, centerX, centerY);
        canvas.clipRect(action.rect);
        updateBounds(action);
        float height = (action.drawable.getBounds().bottom + action.drawable.getBounds().top) - ((action.text.getHeight() * action.textScale) / 2.0f);
        canvas.save();
        canvas.scale(action.textScale, action.textScale, centerX, ((action.text.getHeight() * action.textScale) / 2.0f) + height);
        action.text.draw(canvas, centerX - (action.text.getWidth() / 2.0f), height, -1, alpha);
        canvas.restore();
        int i = action.iconTranslationY;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        float f3 = action.iconScale;
        if (f3 != 1.0f) {
            canvas.scale(f3, f3, action.drawable.getBounds().centerX(), action.drawable.getBounds().centerY());
        }
        if (!this.isAnimatingCallAction || action.key != 5) {
            action.drawable.setAlpha((int) (255.0f * alpha));
            action.drawable.draw(canvas);
        }
        canvas.restore();
        drawLoading(canvas, action, alpha);
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
            action.loadingDrawable.setRadiiDp(8.0f);
            action.loadingDrawable.setAlpha((int) (f * 255.0f));
            action.loadingDrawable.draw(canvas);
        }
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(8.0f);
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
                this.hit.startTime = System.currentTimeMillis();
                final Action action5 = this.hit;
                OnActionClickListener onActionClickListener = this.onActionClickListener;
                if (onActionClickListener != null) {
                    if (action5.callDelay == 0) {
                        int i2 = action5.key;
                        RectF rectF = action5.rect;
                        onActionClickListener.onClick(i2, rectF.left, rectF.top);
                    } else {
                        postDelayed(new Runnable() {
                            @Override
                            public final void run() {
                                ProfileActionsView.this.lambda$onTouchEvent$0(action5);
                            }
                        }, action5.callDelay);
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
        boolean remove;
        if (z) {
            remove = this.allAvailableActions.add(Integer.valueOf(i));
        } else {
            remove = this.allAvailableActions.remove(Integer.valueOf(i));
        }
        if (remove) {
            applyVisibleActions();
        }
    }

    public void setNotifications(boolean z) {
        boolean z2 = this.isNotificationsEnabled != z;
        this.isNotificationsEnabled = z;
        Action find = find(1);
        if (find != null) {
            updateNotification(find, z2);
            invalidate();
        } else {
            this.allAvailableActions.add(1);
            applyVisibleActions();
        }
    }

    public void addCameraAction(RLottieDrawable rLottieDrawable) {
        Action action = new Action();
        rLottieDrawable.setMasterParent(this);
        rLottieDrawable.setCurrentFrame(0);
        rLottieDrawable.start();
        action.iconTranslationY = -AndroidUtilities.dp(2.0f);
        action.drawable = rLottieDrawable;
        action.key = 14;
        action.setText(LocaleController.getString(R.string.ProfileActionsEditPhoto));
        action.iconScale = 1.5f;
        this.actions.add(action);
        this.activeCount = this.actions.size();
    }

    public void addEditUsernameAction() {
        Action action = new Action();
        int i = R.raw.profile_username;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
        rLottieDrawable.setMasterParent(this);
        action.drawable = rLottieDrawable;
        action.text = null;
        action.key = 15;
        rLottieDrawable.setCurrentFrame(14);
        rLottieDrawable.multiplySpeed(0.4f);
        rLottieDrawable.start();
        action.setText(LocaleController.getString(R.string.ProfileActionsEditUsername));
        this.actions.add(action);
    }

    public void addEditInfoAction() {
        Action action = new Action();
        int i = R.raw.profile_edit;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
        rLottieDrawable.setMasterParent(this);
        rLottieDrawable.multiplySpeed(1.4f);
        action.drawable = rLottieDrawable;
        action.text = null;
        action.key = 16;
        action.iconTranslationY = -AndroidUtilities.dp(2.0f);
        rLottieDrawable.start();
        action.setText(LocaleController.getString(R.string.ProfileActionsEditInfo));
        this.actions.add(action);
    }

    public void startAnimatedActions() {
        if (this.mode == 6) {
            int size = this.actions.size();
            for (int i = 0; i < size; i++) {
                Action action = (Action) this.actions.get(i);
                if (action.drawable instanceof RLottieDrawable) {
                    RLottieDrawable rLottieDrawable = (RLottieDrawable) action.drawable;
                    if (action.key == 15) {
                        rLottieDrawable.setCurrentFrame(14);
                    } else {
                        rLottieDrawable.setCurrentFrame(0);
                    }
                    rLottieDrawable.start();
                }
            }
        }
    }

    public boolean supportsEditInfo() {
        return this.mode == 6;
    }

    public void startCameraAnimation() {
        Action find = find(14);
        if (find == null || find.drawable == null) {
            return;
        }
        ((RLottieDrawable) find.drawable).start();
    }

    public boolean canHaveJoinAction() {
        int i = this.mode;
        return i == 1 || i == 3;
    }

    private void updateNotification(Action action, boolean z) {
        if (z) {
            if (this.isNotificationsEnabled) {
                action.update(true, R.raw.profile_unmuting, R.string.ProfileButtonMute);
                return;
            } else {
                action.update(true, R.raw.profile_muting, R.string.ProfileButtonUnmute);
                return;
            }
        }
        if (this.isNotificationsEnabled) {
            action.update(false, R.drawable.mute, R.string.ProfileButtonMute);
        } else {
            action.update(false, R.drawable.unmute, R.string.ProfileButtonUnmute);
        }
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
        boolean hasJoin = hasJoin();
        int i = this.mode;
        if (i == 0) {
            insertIfAvailable(arrayList, 0);
            insertIfAvailable(arrayList, 1);
            insertIfAvailable(arrayList, 5);
            insertIfAvailable(arrayList, 6);
            insertIfNotAvailable(arrayList, 3, 6);
        } else if (i == 1) {
            if (hasJoin) {
                insertIfAvailable(arrayList, 7);
            } else {
                insertIfAvailable(arrayList, 10);
                insertIfNotAvailable(arrayList, 11, 10);
            }
            insertIfAvailable(arrayList, 1);
            if (!hasJoin) {
                insertIfAvailable(arrayList, 2);
                insertIfNotAvailable2(arrayList, 3, 2, 12);
            }
            insertIfNotAvailable(arrayList, 4, 12);
            if (hasJoin) {
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
            if (hasJoin) {
                insertIfAvailable(arrayList, 7);
            } else {
                insertIfAvailable(arrayList, 0);
            }
            insertIfAvailable(arrayList, 1);
            if (hasJoin) {
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
                ProfileActionsView.this.lambda$applyVisibleActions$1(arrayList);
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
        Action find = find(i);
        if (find != null) {
            if (i == 1) {
                updateNotification(find, false);
            }
            return find;
        }
        switch (i) {
            case 0:
                find = new Action(this, R.drawable.message, R.string.ProfileActionsMessage);
                break;
            case 1:
                find = new Action();
                updateNotification(find, false);
                break;
            case 2:
                find = new Action(this, R.drawable.message, R.string.ProfileActionsDiscuss);
                break;
            case 3:
                find = new Action(this, R.drawable.gift, R.string.ProfileActionsGift);
                find.supportsLoading = true;
                find.stopDelay = 200;
                break;
            case 4:
                find = new Action(this, R.drawable.action_share, R.string.ProfileActionsShare);
                break;
            case 5:
                find = new Action(this, R.drawable.call, R.string.ProfileActionsCall);
                this.callAction = find;
                find.supportsLoading = true;
                find.stopDelay = 500;
                break;
            case 6:
                find = new Action(this, R.drawable.video, R.string.ProfileActionsVideo);
                find.supportsLoading = true;
                find.stopDelay = 500;
                break;
            case 7:
                find = new Action(this, R.drawable.join, R.string.ProfileActionsJoin);
                find.supportsLoading = true;
                find.callDelay = 300;
                break;
            case 8:
                find = new Action(this, R.drawable.report, R.string.ProfileActionsReport);
                find.supportsLoading = true;
                find.stopDelay = 500;
                break;
            case 9:
                find = new Action(this, R.drawable.leave, R.string.ProfileActionsLeave);
                find.supportsLoading = true;
                find.stopDelay = 300;
                break;
            case 10:
                find = new Action(this, R.drawable.live_stream, R.string.ProfileActionsVoiceChat);
                find.supportsLoading = true;
                find.stopDelay = 500;
                break;
            case 11:
                find = new Action(this, R.drawable.live_stream, R.string.ProfileActionsLiveStream);
                find.supportsLoading = true;
                find.stopDelay = 500;
                break;
            case 12:
                find = new Action(this, R.drawable.story, R.string.ProfileActionsAddStory);
                break;
            case 13:
                find = new Action(this, R.drawable.block, R.string.ProfileActionsStop);
                find.supportsLoading = true;
                find.stopDelay = 300;
                break;
        }
        if (find != null) {
            find.key = i;
        }
        return find;
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

    public void applyCallTransition(View view, boolean z, float f, float f2) {
        if (view == null || getMeasuredWidth() <= 0.0f) {
            return;
        }
        float left = view.getLeft();
        float top = view.getTop();
        if (z) {
            int size = this.actions.size();
            float f3 = this.padding / 2.0f;
            float itemWidth = getItemWidth();
            float f4 = this.padding;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Action action = (Action) this.actions.get(i);
                if (!action.isDeleted) {
                    if (action.key == 5) {
                        RectF rectF = this.callAction.rect;
                        float f5 = this.top;
                        rectF.set(f4, f5, itemWidth + f4, this.targetHeight + f5);
                        break;
                    }
                    f4 += itemWidth + f3;
                }
                i++;
            }
            updateBounds(this.callAction);
            float centerY = (((((f - this.targetHeight) - this.padding) - this.top) + this.callAction.drawable.getBounds().centerY()) - (view.getMeasuredHeight() / 2.0f)) - top;
            view.setTranslationX(AndroidUtilities.lerp(0.0f, (this.callAction.drawable.getBounds().centerX() - (view.getMeasuredWidth() / 2.0f)) - left, f2));
            view.setTranslationY(AndroidUtilities.lerp(0.0f, centerY, f2));
        } else {
            if (!this.callAnimationStateLoaded) {
                this.callAnimationStateLoaded = true;
                this.callBackwardAnimateFromY = ((getTranslationY() + this.callAction.drawable.getBounds().centerY()) - (view.getMeasuredHeight() / 2.0f)) - top;
                this.callBackwardAnimateFromX = (this.callAction.drawable.getBounds().centerX() - (view.getMeasuredWidth() / 2.0f)) - left;
            }
            view.setTranslationX(AndroidUtilities.lerp(0.0f, this.callBackwardAnimateFromX, f2));
            view.setTranslationY(AndroidUtilities.lerp(0.0f, this.callBackwardAnimateFromY, f2));
        }
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public class Action {
        private final ButtonBounce bounce;
        int callDelay;
        private Drawable drawable;
        private final RectF from;
        float iconScale;
        int iconTranslationY;
        boolean isDeleted;
        boolean isDeleting;
        boolean isLoading;
        boolean isOpening;
        int key;
        LoadingDrawable loadingDrawable;
        private final AnimatedFloat positionFraction;
        final RectF prevRect;
        final RectF rect;
        long startTime;
        int stopDelay;
        boolean supportsLoading;
        private Text text;
        private float textScale;
        private final RectF to;

        public void setText(CharSequence charSequence) {
            this.text = new Text(charSequence, 11.0f).multiline(3).align(Layout.Alignment.ALIGN_CENTER);
        }

        public Action() {
            this.bounce = new ButtonBounce(ProfileActionsView.this);
            this.prevRect = new RectF();
            this.rect = new RectF();
            this.positionFraction = new AnimatedFloat(ProfileActionsView.this, 0L, 250L, CubicBezierInterpolator.DEFAULT);
            this.to = new RectF();
            this.from = new RectF();
            this.textScale = 1.0f;
            this.isOpening = false;
            this.isDeleting = false;
            this.isDeleted = false;
            this.iconTranslationY = 0;
            this.iconScale = 1.0f;
            this.callDelay = 0;
        }

        public Action(ProfileActionsView profileActionsView, int i, int i2) {
            this(false, i, i2);
        }

        public Action(boolean z, int i, int i2) {
            this.bounce = new ButtonBounce(ProfileActionsView.this);
            this.prevRect = new RectF();
            this.rect = new RectF();
            this.positionFraction = new AnimatedFloat(ProfileActionsView.this, 0L, 250L, CubicBezierInterpolator.DEFAULT);
            this.to = new RectF();
            this.from = new RectF();
            this.textScale = 1.0f;
            this.isOpening = false;
            this.isDeleting = false;
            this.isDeleted = false;
            this.iconTranslationY = 0;
            this.iconScale = 1.0f;
            this.callDelay = 0;
            update(z, i, i2);
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
            boolean z2 = f <= profileActionsView.padding;
            boolean z3 = rectF.right + 1.0f >= ((float) profileActionsView.getMeasuredWidth()) - ProfileActionsView.this.padding;
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
                    float centerX = rectF5.centerX();
                    rectF5.right = centerX;
                    rectF5.left = centerX;
                }
            }
            this.positionFraction.set(0.0f, true);
        }

        public void update(boolean z, int i, int i2) {
            if (z) {
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
                rLottieDrawable.setMasterParent(ProfileActionsView.this);
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                rLottieDrawable.start();
                this.drawable = rLottieDrawable;
            } else {
                this.drawable = ProfileActionsView.this.getResources().getDrawable(i).mutate();
            }
            setText(LocaleController.getString(i2));
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
    }
}
