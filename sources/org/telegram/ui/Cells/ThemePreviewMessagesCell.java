package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
public class ThemePreviewMessagesCell extends LinearLayout {
    private Drawable backgroundDrawable;
    private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    private final Runnable cancelProgress;
    private ChatMessageCell[] cells;
    public BaseFragment fragment;
    private Drawable oldBackgroundDrawable;
    private BackgroundGradientDrawable.Disposable oldBackgroundGradientDisposable;
    private Drawable overrideDrawable;
    private INavigationLayout parentLayout;
    private int progress;
    private Drawable shadowDrawable;
    private final int type;

    @Override
    protected void dispatchSetPressed(boolean z) {
    }

    public void lambda$new$0() {
        this.progress = -1;
        int i = 0;
        while (true) {
            ChatMessageCell[] chatMessageCellArr = this.cells;
            if (i >= chatMessageCellArr.length) {
                return;
            }
            if (chatMessageCellArr[i] != null) {
                chatMessageCellArr[i].invalidate();
            }
            i++;
        }
    }

    public ThemePreviewMessagesCell(Context context, INavigationLayout iNavigationLayout, int i) {
        this(context, iNavigationLayout, i, 0L);
    }

    public ThemePreviewMessagesCell(Context context, INavigationLayout iNavigationLayout, int i, long j) {
        this(context, iNavigationLayout, i, j, null);
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public ThemePreviewMessagesCell(android.content.Context r18, org.telegram.ui.ActionBar.INavigationLayout r19, int r20, long r21, org.telegram.ui.ActionBar.Theme.ResourcesProvider r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ThemePreviewMessagesCell.<init>(android.content.Context, org.telegram.ui.ActionBar.INavigationLayout, int, long, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public ChatMessageCell[] getCells() {
        return this.cells;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            ChatMessageCell[] chatMessageCellArr = this.cells;
            if (i >= chatMessageCellArr.length) {
                return;
            }
            chatMessageCellArr[i].invalidate();
            i++;
        }
    }

    public void setOverrideBackground(Drawable drawable) {
        this.overrideDrawable = drawable;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable drawable = this.overrideDrawable;
        if (drawable == null) {
            drawable = Theme.getCachedWallpaperNonBlocking();
        }
        if (Theme.wallpaperLoadTask != null) {
            invalidate();
        }
        if (drawable != this.backgroundDrawable && drawable != null) {
            if (Theme.isAnimatingColor()) {
                this.oldBackgroundDrawable = this.backgroundDrawable;
                this.oldBackgroundGradientDisposable = this.backgroundGradientDisposable;
            } else {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
            }
            this.backgroundDrawable = drawable;
        }
        float themeAnimationValue = this.parentLayout.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable2 = i == 0 ? this.oldBackgroundDrawable : this.backgroundDrawable;
            if (drawable2 != null) {
                int i2 = (i != 1 || this.oldBackgroundDrawable == null || this.parentLayout == null) ? 255 : (int) (255.0f * themeAnimationValue);
                if (i2 > 0) {
                    drawable2.setAlpha(i2);
                    if ((drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable) || (drawable2 instanceof MotionBackgroundDrawable)) {
                        drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable2 instanceof BackgroundGradientDrawable) {
                            this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable2).drawExactBoundsSize(canvas, this);
                        } else {
                            drawable2.draw(canvas);
                        }
                    } else if (drawable2 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable2;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / AndroidUtilities.density;
                            canvas.scale(f, f);
                            drawable2.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable2.getIntrinsicWidth(), measuredHeight / drawable2.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable2.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable2.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i3 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable2.setBounds(measuredWidth, i3, ceil + measuredWidth, ceil2 + i3);
                        }
                        drawable2.draw(canvas);
                        canvas.restore();
                    }
                    if (i == 0 && this.oldBackgroundDrawable != null && themeAnimationValue >= 1.0f) {
                        BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
                        if (disposable2 != null) {
                            disposable2.dispose();
                            this.oldBackgroundGradientDisposable = null;
                        }
                        this.oldBackgroundDrawable = null;
                        invalidate();
                    }
                }
            }
            i++;
        }
        this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.shadowDrawable.draw(canvas);
    }

    public boolean allowLoadingOnTouch() {
        int i = this.type;
        return i == 3 || i == 0;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
        if (disposable != null) {
            disposable.dispose();
            this.backgroundGradientDisposable = null;
        }
        BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
        if (disposable2 != null) {
            disposable2.dispose();
            this.oldBackgroundGradientDisposable = null;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.type == 2 || allowLoadingOnTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
