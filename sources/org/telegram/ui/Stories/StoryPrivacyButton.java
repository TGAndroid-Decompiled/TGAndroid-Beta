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
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class StoryPrivacyButton extends View {
    public final Paint arrowPaint;
    public final Path arrowPath;
    public final Paint[] backgroundPaint;
    public int bottomColor;
    public final ButtonBounce bounce;
    public final AnimatedFloat crossfadeT;
    public boolean draw;
    public boolean drawArrow;
    public final Matrix gradientMatrix;
    public final Drawable[] icon;
    public int iconResId;
    public final float[] iconSize;
    public int topColor;

    public StoryPrivacyButton(Context context) {
        super(context);
        this.gradientMatrix = new Matrix();
        this.backgroundPaint = new Paint[]{new Paint(1), new Paint(1)};
        this.crossfadeT = new AnimatedFloat(this, 0L, 260L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.icon = new Drawable[2];
        this.iconSize = new float[2];
        Paint paint = new Paint(1);
        this.arrowPaint = paint;
        this.arrowPath = new Path();
        this.bounce = new ButtonBounce(this, 0.6f, 5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public float getCenterX() {
        return (getWidth() / 2.0f) + getX() + (this.drawArrow ? 0 : AndroidUtilities.dp(14.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float fCenterX;
        float fCenterX2;
        if (this.draw) {
            float fDpf2 = this.drawArrow ? 0.0f : AndroidUtilities.dpf2(7.0f);
            float fDpf3 = this.drawArrow ? AndroidUtilities.dpf2(43.0f) : AndroidUtilities.dpf2(23.66f);
            float fDpf4 = AndroidUtilities.dpf2(23.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(ImageReceiver$$ExternalSyntheticOutline0.m(getWidth(), fDpf3, 2.0f, fDpf2), (getHeight() - fDpf4) / 2.0f, AacUtil.m(getWidth(), fDpf3, 2.0f, fDpf2), (getHeight() + fDpf4) / 2.0f);
            float scale = this.bounce.getScale(0.075f);
            canvas.save();
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            float f3 = this.crossfadeT.set(0.0f);
            Paint[] paintArr = this.backgroundPaint;
            if (f3 > 0.0f) {
                paintArr[1].setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[1]);
            }
            if (f3 < 1.0f) {
                paintArr[0].setAlpha((int) ((1.0f - f3) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[0]);
            }
            float fAbs = Math.abs(f3 - 0.5f) + 0.5f;
            Drawable[] drawableArr = this.icon;
            Drawable drawable = drawableArr[1];
            float[] fArr = this.iconSize;
            if (drawable == null || f3 <= 0.5f) {
                f = 12.0f;
                f2 = 0.5f;
            } else {
                if (this.drawArrow) {
                    fCenterX2 = AndroidUtilities.dpf2(14.66f) + rectF.left;
                } else {
                    fCenterX2 = rectF.centerX();
                }
                Drawable drawable2 = drawableArr[1];
                int iM = (int) TextureRenderer$$ExternalSyntheticOutline0.m(fArr[1], 2.0f, fAbs, fCenterX2);
                float fCenterY = rectF.centerY();
                float f4 = (fArr[1] / 2.0f) * fAbs;
                f2 = 0.5f;
                f = 12.0f;
                drawable2.setBounds(iM, (int) (fCenterY - f4), (int) (f4 + fCenterX2), (int) zzir.m(fArr[1], 2.0f, fAbs, rectF.centerY()));
                drawableArr[1].draw(canvas);
            }
            if (drawableArr[0] != null && f3 <= f2) {
                if (this.drawArrow) {
                    fCenterX = AndroidUtilities.dpf2(14.66f) + rectF.left;
                } else {
                    fCenterX = rectF.centerX();
                }
                Drawable drawable3 = drawableArr[0];
                int iM2 = (int) TextureRenderer$$ExternalSyntheticOutline0.m(fArr[0], 2.0f, fAbs, fCenterX);
                float fCenterY2 = rectF.centerY();
                float f5 = (fArr[0] / 2.0f) * fAbs;
                drawable3.setBounds(iM2, (int) (fCenterY2 - f5), (int) (f5 + fCenterX), (int) zzir.m(fArr[0], 2.0f, fAbs, rectF.centerY()));
                drawableArr[0].draw(canvas);
            }
            if (this.drawArrow) {
                Path path = this.arrowPath;
                path.rewind();
                path.moveTo(rectF.right - AndroidUtilities.dpf2(15.66f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                path.lineTo(rectF.right - AndroidUtilities.dpf2(f), AndroidUtilities.dpf2(2.33f) + rectF.centerY());
                path.lineTo(rectF.right - AndroidUtilities.dpf2(8.16f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
                Paint paint = this.arrowPaint;
                paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public final void set(boolean z, TL_stories.StoryItem storyItem, boolean z2) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.drawArrow = z;
        this.draw = true;
        if (storyItem == null) {
            this.draw = false;
        } else {
            boolean z3 = storyItem.close_friends;
            AnimatedFloat animatedFloat = this.crossfadeT;
            if (z3) {
                setIcon(15.0f, R.drawable.msg_stories_closefriends);
                setupGradient(-7808710, -13781445);
                animatedFloat.set(z2, true);
            } else if (storyItem.contacts) {
                setIcon(17.33f, R.drawable.msg_folders_private);
                setupGradient(-3905294, -6923014);
                animatedFloat.set(z2, true);
            } else if (storyItem.selected_contacts || (z && ((arrayList = storyItem.privacy) == null || arrayList.isEmpty()))) {
                setIcon(17.33f, R.drawable.msg_folders_groups);
                setupGradient(-18621, -618956);
                animatedFloat.set(z2, true);
            } else if (z) {
                setIcon(17.33f, R.drawable.msg_folders_channels);
                setupGradient(-15292942, -15630089);
                animatedFloat.set(z2, true);
            } else {
                this.draw = false;
            }
        }
        setVisibility(this.draw ? 0 : 8);
        invalidate();
    }

    public final void setIcon(float f, int i) {
        if (i == R.drawable.msg_stories_closefriends) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends));
        } else if (i == R.drawable.msg_folders_private) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionContacts));
        } else if (i == R.drawable.msg_folders_groups) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts));
        } else if (i == R.drawable.msg_folders_channels) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionEveryone));
        }
        Drawable[] drawableArr = this.icon;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.iconSize;
        fArr[1] = fArr[0];
        if (drawable == null || i != this.iconResId) {
            Resources resources = getContext().getResources();
            this.iconResId = i;
            drawableArr[0] = resources.getDrawable(i).mutate();
            drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fArr[0] = AndroidUtilities.dpf2(f);
            invalidate();
        }
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.bounce.setPressed(z);
    }

    public final void setupGradient(int i, int i2) {
        Paint[] paintArr = this.backgroundPaint;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.topColor == i && this.bottomColor == i2) {
            return;
        }
        float fDp = AndroidUtilities.dp(23.0f);
        this.topColor = i;
        this.bottomColor = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, fDp, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.gradientMatrix;
        matrix.reset();
        matrix.postTranslate(0.0f, AndroidUtilities.dp(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public final void set(boolean z, StoriesController.UploadingStory uploadingStory, boolean z2) {
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
        this.drawArrow = z;
        this.draw = true;
        if (uploadingStory != null && (storyPrivacy = uploadingStory.entry.privacy) != null) {
            AnimatedFloat animatedFloat = this.crossfadeT;
            int i = storyPrivacy.type;
            if (i == 1) {
                setIcon(15.0f, R.drawable.msg_stories_closefriends);
                setupGradient(-7808710, -13781445);
                animatedFloat.set(z2, !z2);
            } else if (i == 2) {
                setIcon(17.33f, R.drawable.msg_folders_private);
                setupGradient(-3905294, -6923014);
                animatedFloat.set(z2, !z2);
            } else if (i == 3) {
                setIcon(17.33f, R.drawable.msg_folders_groups);
                setupGradient(-18621, -618956);
                animatedFloat.set(z2, !z2);
            } else if (z) {
                setIcon(17.33f, R.drawable.msg_folders_channels);
                setupGradient(-15292942, -15630089);
                animatedFloat.set(z2, !z2);
            } else {
                this.draw = false;
            }
        } else {
            this.draw = false;
        }
        setVisibility(this.draw ? 0 : 8);
        invalidate();
    }
}
