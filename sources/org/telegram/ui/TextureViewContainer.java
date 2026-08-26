package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.Theme;

public final class TextureViewContainer extends FrameLayout {
    public final int $r8$classId;
    public final Object imageReceiver;
    public final Object textureView;

    public TextureViewContainer(Context context) {
        super(context);
        this.$r8$classId = 0;
        this.imageReceiver = new ImageReceiver(this);
        TextureView textureView = new TextureView(context);
        this.textureView = textureView;
        addView(textureView);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.$r8$classId) {
            case 0:
                ImageReceiver imageReceiver = (ImageReceiver) this.imageReceiver;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void invalidate() {
        switch (this.$r8$classId) {
            case 2:
                super.invalidate();
                QrActivity.AnonymousClass1 anonymousClass1 = ((ThemePreviewActivity) this.textureView).page2;
                if (anonymousClass1 != null) {
                    anonymousClass1.invalidate();
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.$r8$classId) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.imageReceiver).onAttachedToWindow();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.$r8$classId) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.imageReceiver).onDetachedFromWindow();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.$r8$classId) {
            case 1:
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                Paint paint = (Paint) this.imageReceiver;
                paint.setColor(((ThemePreviewActivity) this.textureView).getThemedColor(Theme.key_chat_messagePanelBackground));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                break;
            case 2:
                if (!AndroidUtilities.usingHardwareInput) {
                    int[] iArr = (int[]) this.imageReceiver;
                    getLocationInWindow(iArr);
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.textureView;
                    float translationY = themePreviewActivity.actionBar2.getTranslationY();
                    int i = iArr[1];
                    if (translationY != i) {
                        themePreviewActivity.actionBar2.setTranslationY(-i);
                        themePreviewActivity.page2.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < themePreviewActivity.watchForKeyboardEndTime) {
                        invalidate();
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    public TextureViewContainer(Context context, ThemePreviewActivity themePreviewActivity, int i) {
        super(context);
        this.$r8$classId = i;
        switch (i) {
            case 2:
                this.textureView = themePreviewActivity;
                super(context);
                this.imageReceiver = new int[2];
                break;
            default:
                this.textureView = themePreviewActivity;
                this.imageReceiver = new Paint();
                break;
        }
    }
}
