package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda379;

public final class EmojiColorPickerWindow extends PopupWindow {
    public static final ActionBarPopupWindow$$ExternalSyntheticLambda0 NOP = new ActionBarPopupWindow$$ExternalSyntheticLambda0(1);
    public static Field superListenerField;
    public final int emojiSize;
    public boolean isCompound;
    public ViewTreeObserver.OnScrollChangedListener mSuperScrollListener;
    public ViewTreeObserver mViewTreeObserver;
    public final EmojiColorPickerView pickerView;

    public final class EmojiColorPickerView extends View {
        public final Drawable arrowDrawable;
        public int arrowX;
        public final Drawable backgroundDrawable;
        public boolean both;
        public String currentEmoji;
        public long downStart;
        public final Drawable[] drawables;
        public final int emojiSize;
        public boolean ignore;
        public boolean isCompound;
        public final int[] lastSelection;
        public Utilities.Callback2 onSelectionUpdate;
        public final RectF rect;
        public final Paint rectPaint;
        public final Theme.ResourcesProvider resourcesProvider;
        public final int[] selection;
        public final AnimatedFloat selection1Animated;
        public final AnimatedFloat selection2Animated;
        public int touchY;

        public EmojiColorPickerView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.emojiSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
            this.drawables = new Drawable[11];
            this.selection = new int[]{0, 0};
            this.lastSelection = new int[]{0, 0};
            this.rectPaint = new Paint(1);
            this.rect = new RectF();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.selection1Animated = new AnimatedFloat(125L, this, cubicBezierInterpolator);
            this.selection2Animated = new AnimatedFloat(125L, this, cubicBezierInterpolator);
            this.touchY = -1;
            this.both = true;
            this.resourcesProvider = resourcesProvider;
            Drawable drawable = getResources().getDrawable(R.drawable.stickers_back_all);
            this.backgroundDrawable = drawable;
            Drawable drawable2 = getResources().getDrawable(R.drawable.stickers_back_arrow);
            this.arrowDrawable = drawable2;
            int i = Theme.key_dialogBackground;
            Theme.setDrawableColor(Theme.getColor(i, resourcesProvider), drawable);
            Theme.setDrawableColor(Theme.getColor(i, resourcesProvider), drawable2);
            CompoundEmoji.setPlaceholderColor(Theme.getColor(Theme.key_chat_emojiPanelIcon, resourcesProvider));
        }

        public String getEmoji() {
            return this.currentEmoji;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            EmojiColorPickerView emojiColorPickerView = this;
            int measuredWidth = emojiColorPickerView.getMeasuredWidth();
            int measuredHeight = emojiColorPickerView.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            Drawable drawable = emojiColorPickerView.backgroundDrawable;
            boolean z = false;
            drawable.setBounds(0, 0, measuredWidth, measuredHeight);
            drawable.draw(canvas);
            int iDp = emojiColorPickerView.arrowX - AndroidUtilities.dp(9.0f);
            int measuredHeight2 = emojiColorPickerView.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
            int iDp2 = AndroidUtilities.dp(9.0f) + emojiColorPickerView.arrowX;
            int measuredHeight3 = emojiColorPickerView.getMeasuredHeight();
            Drawable drawable2 = emojiColorPickerView.arrowDrawable;
            drawable2.setBounds(iDp, measuredHeight2, iDp2, measuredHeight3);
            drawable2.draw(canvas);
            if (emojiColorPickerView.currentEmoji != null) {
                boolean z2 = emojiColorPickerView.isCompound;
                Theme.ResourcesProvider resourcesProvider = emojiColorPickerView.resourcesProvider;
                int[] iArr = emojiColorPickerView.selection;
                AnimatedFloat animatedFloat = emojiColorPickerView.selection1Animated;
                Paint paint = emojiColorPickerView.rectPaint;
                Drawable[] drawableArr = emojiColorPickerView.drawables;
                RectF rectF = emojiColorPickerView.rect;
                float f = 1.0f;
                int i = emojiColorPickerView.emojiSize;
                if (!z2) {
                    float f2 = animatedFloat.set(iArr[0], false);
                    int iDp3 = (int) ((i * f2) + AndroidUtilities.dp((f2 * 4.0f) + 5.0f));
                    int iDp4 = AndroidUtilities.dp(5.0f);
                    float f3 = iDp4;
                    rectF.set(iDp3, f3, iDp3 + i, iDp4 + i);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
                    paint.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                    for (int i2 = 0; i2 < 6; i2++) {
                        Drawable drawable3 = drawableArr[i2];
                        if (drawable3 != null) {
                            int iDp5 = AndroidUtilities.dp((i2 * 4) + 5) + (i * i2);
                            float fMin = ((1.0f - (Math.min(0.5f, Math.abs(i2 - f2)) * 2.0f)) * 0.1f) + 0.9f;
                            canvas.save();
                            float f4 = i / 2.0f;
                            canvas.scale(fMin, fMin, iDp5 + f4, f4 + f3);
                            drawable3.setBounds(iDp5, iDp4, iDp5 + i, iDp4 + i);
                            drawable3.draw(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                int i3 = 0;
                while (i3 < 2) {
                    float f5 = (i3 == 0 ? animatedFloat : emojiColorPickerView.selection2Animated).set(iArr[i3], z);
                    float f6 = f5 + f;
                    int iDp6 = (int) ((i * f6) + AndroidUtilities.dp((f6 * 4.0f) + (Math.max(0.0f, Math.min(f, f6)) * 3.0f) + 5.0f));
                    float fMax = Math.max(0.0f, Math.min(f, -f5));
                    int iLerp = AndroidUtilities.lerp(((AndroidUtilities.dp(f) + i) * i3) + AndroidUtilities.dp(3.0f), (emojiColorPickerView.getMeasuredHeight() - i) / 2, fMax);
                    rectF.set(iDp6, iLerp, iDp6 + i, iLerp + i);
                    rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(fMax * (-2.0f)));
                    paint.setColor(Theme.multAlpha(AndroidUtilities.lerp(f, 0.5f, fMax), Theme.getColor(Theme.key_listSelector, resourcesProvider)));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                    int i4 = 0;
                    while (i4 < 5) {
                        i4++;
                        int i5 = (i3 * 5) + i4;
                        int iDp7 = AndroidUtilities.dp((i4 * 4) + 8) + (i * i4);
                        int iDp8 = ((AndroidUtilities.dp(f) + i) * i3) + AndroidUtilities.dp(3.0f);
                        drawableArr[i5].setBounds(iDp7, iDp8, iDp7 + i, iDp8 + i);
                        drawableArr[i5].draw(canvas);
                        f = 1.0f;
                    }
                    i3++;
                    f = 1.0f;
                    z = false;
                    emojiColorPickerView = this;
                }
                drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i) / 2, AndroidUtilities.dp(5.0f) + i, (getMeasuredHeight() + i) / 2);
                drawableArr[0].draw(canvas);
                canvas.drawRect(AndroidUtilities.dp(8.45f) + i, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), Theme.dividerPaint);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i;
            int i2;
            int i3;
            if (this.ignore) {
                this.ignore = false;
                return false;
            }
            if (!this.isCompound) {
                return super.onTouchEvent(motionEvent);
            }
            int i4 = 0;
            while (true) {
                Drawable[] drawableArr = this.drawables;
                if (i4 >= drawableArr.length) {
                    i4 = -1;
                    break;
                }
                if (drawableArr[i4].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i3 = this.touchY) != -1 && ((i4 == 0 || ((i3 == 0 && i4 >= 1 && i4 <= 5) || (i3 == 1 && i4 >= 6 && i4 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i4].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i4].getBounds().right))) {
                    break;
                }
                i4++;
            }
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
                return false;
            }
            int action = motionEvent.getAction();
            int[] iArr = this.selection;
            if (action == 0) {
                this.touchY = -1;
                this.downStart = System.currentTimeMillis();
                this.both = iArr[0] == iArr[1];
            }
            int i5 = iArr[0];
            int[] iArr2 = this.lastSelection;
            iArr2[0] = i5;
            iArr2[1] = iArr[1];
            boolean z = System.currentTimeMillis() - this.downStart > 300 && motionEvent.getAction() == 2;
            if (i4 == 0) {
                iArr[0] = -1;
                iArr[1] = -1;
            } else if (i4 >= 1 && i4 <= 5 && ((i2 = this.touchY) == -1 || i2 == 0)) {
                this.touchY = 0;
                int i6 = i4 - 1;
                iArr[0] = i6;
                if (iArr[1] == -1 || (this.both && z)) {
                    iArr[1] = i6;
                }
            } else if (i4 >= 6 && i4 <= 10 && ((i = this.touchY) == -1 || i == 1)) {
                this.touchY = 1;
                int i7 = i4 - 6;
                iArr[1] = i7;
                if (iArr[0] == -1 || (this.both && z)) {
                    iArr[0] = i7;
                }
            }
            if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
                AndroidUtilities.vibrateCursor(this);
                Utilities.Callback2 callback2 = this.onSelectionUpdate;
                if (callback2 != null) {
                    callback2.run(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                }
            }
            invalidate();
            if (motionEvent.getAction() == 1) {
                this.touchY = -1;
            }
            return true;
        }

        public void setArrowX(int i) {
            this.arrowX = i;
            invalidate();
        }

        public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
            this.onSelectionUpdate = callback2;
        }
    }

    public EmojiColorPickerWindow(EmojiColorPickerView emojiColorPickerView) {
        super(emojiColorPickerView);
        this.emojiSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        this.pickerView = emojiColorPickerView;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        emojiColorPickerView.setFocusableInTouchMode(true);
        emojiColorPickerView.setOnKeyListener(new ChatActivity$$ExternalSyntheticLambda379(this, 2));
    }

    @Override
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        setFocusable(false);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        if (this.mSuperScrollListener == null || (viewTreeObserver = this.mViewTreeObserver) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
        }
        this.mViewTreeObserver = null;
    }

    public final void registerListener(View view) {
        if (this.mSuperScrollListener != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.mViewTreeObserver;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
                }
                this.mViewTreeObserver = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.mSuperScrollListener);
                }
            }
        }
    }

    @Override
    public final void showAsDropDown(View view, int i, int i2) {
        try {
            super.showAsDropDown(view, i, i2);
            registerListener(view);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void showAtLocation(View view, int i, int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i, i2, i3);
        if (this.mSuperScrollListener == null || (viewTreeObserver = this.mViewTreeObserver) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
        }
        this.mViewTreeObserver = null;
    }

    @Override
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        registerListener(view);
    }

    @Override
    public final void update(View view, int i, int i2) {
        super.update(view, i, i2);
        registerListener(view);
    }
}
