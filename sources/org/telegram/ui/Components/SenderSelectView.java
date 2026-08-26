package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CameraScanActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.Cells.BaseCell;

public final class SenderSelectView extends View {
    public static final SimpleFloatPropertyCompat MENU_PROGRESS;
    public final AvatarDrawable avatarDrawable;
    public final ImageReceiver avatarImage;
    public final Paint backgroundPaint;
    public ValueAnimator menuAnimator;
    public final Paint menuPaint;
    public float menuProgress;
    public SpringAnimation menuSpring;
    public boolean scaleIn;
    public boolean scaleOut;
    public final BaseCell.RippleDrawableSafe selectorDrawable;

    static {
        SimpleFloatPropertyCompat simpleFloatPropertyCompat = new SimpleFloatPropertyCompat(new ShareAlert$$ExternalSyntheticLambda15(28), new ShareAlert$$ExternalSyntheticLambda15(29));
        simpleFloatPropertyCompat.multiplier = 100.0f;
        MENU_PROGRESS = simpleFloatPropertyCompat;
    }

    public SenderSelectView(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarImage = imageReceiver;
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.menuPaint = paint2;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(Theme.getColor(null, Theme.key_chat_messagePanelVoiceBackground, false));
        paint2.setColor(Theme.getColor(null, Theme.key_chat_messagePanelVoicePressed, false));
        int iDp = AndroidUtilities.dp(18.0f);
        int iMultAlpha = Theme.multAlpha(0.2f, Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, iMultAlpha, iMultAlpha);
        this.selectorDrawable = rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable;
        rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable.setCallback(this);
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, ""));
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.selectorDrawable.setState(getDrawableState());
    }

    public float getProgress() {
        return this.menuProgress;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.selectorDrawable.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarImage.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        float f = 1.0f;
        if (this.scaleOut) {
            f = 1.0f - this.menuProgress;
        } else if (this.scaleIn) {
            f = this.menuProgress;
        }
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.avatarImage.draw(canvas);
        int i = (int) (this.menuProgress * 255.0f);
        Paint paint = this.backgroundPaint;
        paint.setAlpha(i);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        Paint paint2 = this.menuPaint;
        paint2.setAlpha(i);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        int width = getWidth();
        int height = getHeight();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        rippleDrawableSafe.setBounds(0, 0, width, height);
        rippleDrawableSafe.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.avatarImage.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String firstName;
        if (tLObject instanceof TLRPC.User) {
            firstName = UserObject.getFirstName((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            firstName = ((TLRPC.Chat) tLObject).title;
        } else {
            firstName = tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : "";
        }
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, firstName));
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(tLObject);
        this.avatarImage.setForUserOrChat(tLObject, avatarDrawable);
    }

    public void setProgress(float f) {
        setProgress(true, f != 0.0f, f);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.selectorDrawable == drawable;
    }

    public final void setProgress(boolean z, boolean z2, float f) {
        int i = 2;
        if (!z) {
            this.menuProgress = f;
            invalidate();
            return;
        }
        SpringAnimation springAnimation = this.menuSpring;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        ValueAnimator valueAnimator = this.menuAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.scaleIn = false;
        this.scaleOut = false;
        if (!z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(this.menuProgress, f).setDuration(200L);
            this.menuAnimator = duration;
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.menuAnimator.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 15));
            this.menuAnimator.addListener(new Tooltip.AnonymousClass1(this, i));
            this.menuAnimator.start();
            return;
        }
        float f2 = this.menuProgress * 100.0f;
        SpringAnimation springAnimation2 = new SpringAnimation(this, MENU_PROGRESS);
        springAnimation2.mValue = f2;
        springAnimation2.mStartValueIsSet = true;
        this.menuSpring = springAnimation2;
        boolean z3 = f < this.menuProgress;
        float f3 = f * 100.0f;
        this.scaleIn = z3;
        this.scaleOut = !z3;
        SpringForce springForce = new SpringForce(f3);
        springForce.mFinalPosition = f3;
        springForce.setStiffness(450.0f);
        springForce.setDampingRatio(1.0f);
        springAnimation2.mSpring = springForce;
        this.menuSpring.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda50(this, z3, f2, f3));
        this.menuSpring.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(this, 5));
        this.menuSpring.start();
    }
}
