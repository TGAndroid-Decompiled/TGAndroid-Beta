package org.telegram.ui.Stories.recorder;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;

public final class CaptionContainerView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CaptionContainerView f$0;

    public CaptionContainerView$$ExternalSyntheticLambda0(CaptionContainerView captionContainerView, int i) {
        this.$r8$classId = i;
        this.f$0 = captionContainerView;
    }

    @Override
    public final void run() {
        CaptionContainerView captionContainerView = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                captionContainerView.onTextChange();
                break;
            default:
                boolean z = captionContainerView.toKeyboardShow;
                if (captionContainerView.keyboardShown != z) {
                    captionContainerView.keyboardShown = z;
                    ValueAnimator valueAnimator = captionContainerView.keyboardAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        captionContainerView.keyboardAnimator = null;
                    }
                    Utilities.Callback callback = captionContainerView.onKeyboardOpen;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z));
                    }
                    captionContainerView.beforeUpdateShownKeyboard(z);
                    CaptionContainerView.AnonymousClass3 anonymousClass3 = captionContainerView.editText;
                    if (z) {
                        ChatAttachAlert.AnonymousClass36 anonymousClass36 = captionContainerView.mentionContainer;
                        if (anonymousClass36 != null) {
                            anonymousClass36.setVisibility(0);
                        }
                        captionContainerView.applyButton.setVisibility(0);
                    } else {
                        anonymousClass3.getEditText().scrollBy(0, -anonymousClass3.getEditText().getScrollY());
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(captionContainerView.keyboardT, z ? 1.0f : 0.0f);
                    captionContainerView.keyboardAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(captionContainerView, 5));
                    if (!z) {
                        anonymousClass3.getEditText().setAllowDrawCursor(false);
                    }
                    captionContainerView.keyboardAnimator.addListener(new TodoItemMenu.AnonymousClass15(7, captionContainerView, z));
                    if (z) {
                        captionContainerView.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        captionContainerView.keyboardAnimator.setDuration(250L);
                    } else {
                        captionContainerView.keyboardAnimator.setInterpolator(new FastOutSlowInInterpolator());
                        captionContainerView.keyboardAnimator.setDuration(420L);
                    }
                    captionContainerView.keyboardAnimator.start();
                    EditTextCaption editText = anonymousClass3.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = captionContainerView.scrollAnimator;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        anonymousClass3.setSelection(z ? anonymousClass3.editText.length() : 0);
                        anonymousClass3.getEditText().setForceCursorEnd(false);
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        captionContainerView.scrollAnimator = objectAnimatorOfInt;
                        objectAnimatorOfInt.setDuration(360L);
                        captionContainerView.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        captionContainerView.scrollAnimator.start();
                    }
                    anonymousClass3.setSuggestionsEnabled(z);
                    if (!z) {
                        anonymousClass3.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (captionContainerView.blurBitmap == null) {
                            FrameLayout frameLayout = captionContainerView.rootView;
                            captionContainerView.blurBitmap = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        captionContainerView.ignoreDraw = true;
                        captionContainerView.drawBlurBitmap(captionContainerView.blurBitmap);
                        captionContainerView.ignoreDraw = false;
                        Bitmap bitmap = captionContainerView.blurBitmap;
                        if (bitmap == null || bitmap.isRecycled()) {
                            captionContainerView.blurBitmap = null;
                        } else {
                            Bitmap bitmap2 = captionContainerView.blurBitmap;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            captionContainerView.blurBitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = captionContainerView.blurBitmapMatrix;
                            if (matrix == null) {
                                captionContainerView.blurBitmapMatrix = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            captionContainerView.blurBitmapShader.setLocalMatrix(captionContainerView.blurBitmapMatrix);
                            if (captionContainerView.blurPaint == null) {
                                Paint paint = new Paint(3);
                                captionContainerView.blurPaint = paint;
                                paint.setColor(-1);
                            }
                            captionContainerView.blurPaint.setShader(captionContainerView.blurBitmapShader);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
