package org.telegram.ui.Stories;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
public class StoryPrivacyButton extends View {
    private final Paint arrowPaint;
    private final Path arrowPath;
    private final Paint[] backgroundPaint;
    private int bottomColor;
    private final ButtonBounce bounce;
    private final AnimatedFloat crossfadeT;
    public boolean draw;
    private boolean drawArrow;
    private final Matrix gradientMatrix;
    private final Drawable[] icon;
    private int iconResId;
    private final float[] iconSize;
    private int topColor;

    public StoryPrivacyButton(Context context) {
        super(context);
        this.gradientMatrix = new Matrix();
        this.backgroundPaint = r0;
        this.crossfadeT = new AnimatedFloat(this, 0L, 260L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.icon = new Drawable[2];
        this.iconSize = new float[2];
        Paint paint = new Paint(1);
        this.arrowPaint = paint;
        this.arrowPath = new Path();
        this.bounce = new ButtonBounce(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public boolean set(boolean z, TLRPC$StoryItem tLRPC$StoryItem, boolean z2) {
        this.drawArrow = z;
        this.draw = true;
        if (tLRPC$StoryItem == null) {
            this.draw = false;
        } else if (tLRPC$StoryItem.close_friends) {
            setIcon(R.drawable.msg_stories_closefriends, 15.0f);
            setupGradient(-7808710, -13781445);
            this.crossfadeT.set(z2, true);
        } else if (tLRPC$StoryItem.contacts) {
            setIcon(R.drawable.msg_folders_private, 17.33f);
            setupGradient(-3905294, -6923014);
            this.crossfadeT.set(z2, true);
        } else if (tLRPC$StoryItem.selected_contacts) {
            setIcon(R.drawable.msg_folders_groups, 17.33f);
            setupGradient(-18621, -618956);
            this.crossfadeT.set(z2, true);
        } else if (z) {
            setIcon(R.drawable.msg_folders_channels, 17.33f);
            setupGradient(-15292942, -15630089);
            this.crossfadeT.set(z2, true);
        } else {
            this.draw = false;
        }
        setVisibility(this.draw ? 0 : 8);
        invalidate();
        return this.draw;
    }

    public boolean set(boolean z, StoriesController.UploadingStory uploadingStory, boolean z2) {
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
        this.drawArrow = z;
        this.draw = true;
        if (uploadingStory == null || (storyPrivacy = uploadingStory.entry.privacy) == null) {
            this.draw = false;
        } else {
            int i = storyPrivacy.type;
            if (i == 1) {
                setIcon(R.drawable.msg_stories_closefriends, 15.0f);
                setupGradient(-7808710, -13781445);
                this.crossfadeT.set(z2, !z2);
            } else if (i == 2) {
                setIcon(R.drawable.msg_folders_private, 17.33f);
                setupGradient(-3905294, -6923014);
                this.crossfadeT.set(z2, !z2);
            } else if (i == 3) {
                setIcon(R.drawable.msg_folders_groups, 17.33f);
                setupGradient(-18621, -618956);
                this.crossfadeT.set(z2, !z2);
            } else if (z) {
                setIcon(R.drawable.msg_folders_channels, 17.33f);
                setupGradient(-15292942, -15630089);
                this.crossfadeT.set(z2, !z2);
            } else {
                this.draw = false;
            }
        }
        setVisibility(this.draw ? 0 : 8);
        invalidate();
        return this.draw;
    }

    private void setIcon(int i, float f) {
        Drawable[] drawableArr = this.icon;
        drawableArr[1] = drawableArr[0];
        float[] fArr = this.iconSize;
        fArr[1] = fArr[0];
        if (drawableArr[0] == null || i != this.iconResId) {
            Resources resources = getContext().getResources();
            this.iconResId = i;
            drawableArr[0] = resources.getDrawable(i).mutate();
            this.icon[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.iconSize[0] = AndroidUtilities.dpf2(f);
            invalidate();
        }
    }

    private void setupGradient(int i, int i2) {
        Paint[] paintArr = this.backgroundPaint;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.topColor == i && this.bottomColor == i2) {
            return;
        }
        this.topColor = i;
        this.bottomColor = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(23.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.gradientMatrix.reset();
        this.gradientMatrix.postTranslate(0.0f, AndroidUtilities.dp(8.0f));
        linearGradient.setLocalMatrix(this.gradientMatrix);
        this.backgroundPaint[0].setShader(linearGradient);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.draw) {
            float dpf2 = this.drawArrow ? 0.0f : AndroidUtilities.dpf2(7.0f);
            float dpf22 = this.drawArrow ? AndroidUtilities.dpf2(43.0f) : AndroidUtilities.dpf2(23.66f);
            float dpf23 = AndroidUtilities.dpf2(23.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((getWidth() - dpf22) / 2.0f) + dpf2, (getHeight() - dpf23) / 2.0f, dpf2 + ((getWidth() + dpf22) / 2.0f), (getHeight() + dpf23) / 2.0f);
            float scale = this.bounce.getScale(0.075f);
            canvas.save();
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            float f = this.crossfadeT.set(0.0f);
            if (f > 0.0f) {
                this.backgroundPaint[1].setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.backgroundPaint[1]);
            }
            if (f < 1.0f) {
                this.backgroundPaint[0].setAlpha((int) ((1.0f - f) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.backgroundPaint[0]);
            }
            float abs = Math.abs(f - 0.5f) + 0.5f;
            if (this.icon[1] != null && f > 0.5f) {
                float dpf24 = this.drawArrow ? rectF.left + AndroidUtilities.dpf2(14.66f) : rectF.centerX();
                float centerY = rectF.centerY();
                float[] fArr = this.iconSize;
                this.icon[1].setBounds((int) (dpf24 - ((this.iconSize[1] / 2.0f) * abs)), (int) (centerY - ((fArr[1] / 2.0f) * abs)), (int) (dpf24 + ((fArr[1] / 2.0f) * abs)), (int) (rectF.centerY() + ((this.iconSize[1] / 2.0f) * abs)));
                this.icon[1].draw(canvas);
            }
            if (this.icon[0] != null && f <= 0.5f) {
                float dpf25 = this.drawArrow ? rectF.left + AndroidUtilities.dpf2(14.66f) : rectF.centerX();
                float centerY2 = rectF.centerY();
                float[] fArr2 = this.iconSize;
                this.icon[0].setBounds((int) (dpf25 - ((this.iconSize[0] / 2.0f) * abs)), (int) (centerY2 - ((fArr2[0] / 2.0f) * abs)), (int) (dpf25 + ((fArr2[0] / 2.0f) * abs)), (int) (rectF.centerY() + ((this.iconSize[0] / 2.0f) * abs)));
                this.icon[0].draw(canvas);
            }
            if (this.drawArrow) {
                this.arrowPath.rewind();
                this.arrowPath.moveTo(rectF.right - AndroidUtilities.dpf2(15.66f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                this.arrowPath.lineTo(rectF.right - AndroidUtilities.dpf2(12.0f), rectF.centerY() + AndroidUtilities.dpf2(2.33f));
                this.arrowPath.lineTo(rectF.right - AndroidUtilities.dpf2(8.16f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
                canvas.drawPath(this.arrowPath, this.arrowPaint);
            }
            canvas.restore();
        }
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.bounce.setPressed(z);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public float getCenterX() {
        return getX() + (getWidth() / 2.0f) + (this.drawArrow ? 0 : AndroidUtilities.dp(14.0f));
    }
}
