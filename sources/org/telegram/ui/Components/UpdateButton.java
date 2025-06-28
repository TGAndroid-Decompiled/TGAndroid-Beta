package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.IUpdateButton;

public class UpdateButton extends IUpdateButton {
    private AnimatorSet animator;
    private RadialProgress2 icon;
    private int lastGradientWidth;
    private Matrix matrix;
    private Utilities.Callback onTranslationUpdate;
    private Paint paint;
    private TextView textView;
    private LinearGradient updateGradient;

    public UpdateButton(Context context) {
        super(context);
        this.paint = new Paint();
        this.matrix = new Matrix();
        setWillNotDraw(false);
        setVisibility(4);
        setTranslationY(AndroidUtilities.dp(48.0f));
        if (Build.VERSION.SDK_INT >= 21) {
            setBackground(Theme.getSelectorDrawable(1090519039, false));
        }
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UpdateButton.this.lambda$new$0(view);
            }
        });
        RadialProgress2 radialProgress2 = new RadialProgress2(this);
        this.icon = radialProgress2;
        radialProgress2.setColors(-1, -1, -1, -1);
        this.icon.setCircleRadius(AndroidUtilities.dp(11.0f));
        this.icon.setAsMini();
        this.icon.setIcon(15, true, false);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 15.0f);
        this.textView.setTypeface(AndroidUtilities.bold());
        this.textView.setText(LocaleController.getString(2131690069).toUpperCase());
        this.textView.setTextColor(-1);
        this.textView.setPadding(AndroidUtilities.dp(30.0f), 0, 0, 0);
        addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void lambda$new$0(View view) {
        Activity findActivity;
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile == null || (findActivity = AndroidUtilities.findActivity(getContext())) == null) {
            return;
        }
        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.updateGradient != null) {
            this.paint.setColor(-1);
            this.paint.setShader(this.updateGradient);
            this.updateGradient.setLocalMatrix(this.matrix);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
            this.icon.setBackgroundGradientDrawable(this.updateGradient);
            this.icon.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.lastGradientWidth != size) {
            this.updateGradient = new LinearGradient(0.0f, 0.0f, size, 0.0f, new int[]{-9846926, -11291731}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.lastGradientWidth = size;
        }
        int measuredWidth = (getMeasuredWidth() - this.textView.getMeasuredWidth()) / 2;
        this.icon.setProgressRect(measuredWidth, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(22.0f) + measuredWidth, AndroidUtilities.dp(35.0f));
    }

    @Override
    public void onTranslationUpdate(Utilities.Callback<Float> callback) {
        this.onTranslationUpdate = callback;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        Utilities.Callback callback = this.onTranslationUpdate;
        if (callback != null) {
            callback.run(Float.valueOf(f));
        }
    }

    @Override
    public void update(boolean z) {
        AnimatorSet animatorSet;
        AnimatorListenerAdapter animatorListenerAdapter;
        if (ApplicationLoader.applicationLoaderInstance.getUpdate() == null || ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile() == null) {
            if (getTag() == null) {
                return;
            }
            setTag(null);
            if (!z) {
                setTranslationY(AndroidUtilities.dp(48.0f));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            animatorSet2.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.playTogether(ObjectAnimator.ofFloat(this, (Property<UpdateButton, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(48.0f)));
            animatorSet = this.animator;
            animatorListenerAdapter = new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (UpdateButton.this.getTag() == null) {
                        UpdateButton.this.setVisibility(4);
                    }
                    UpdateButton.this.animator = null;
                }
            };
        } else {
            if (getTag() != null) {
                return;
            }
            AnimatorSet animatorSet3 = this.animator;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            setVisibility(0);
            setTag(1);
            if (!z) {
                setTranslationY(0.0f);
                return;
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            this.animator = animatorSet4;
            animatorSet4.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.playTogether(ObjectAnimator.ofFloat(this, (Property<UpdateButton, Float>) View.TRANSLATION_Y, 0.0f));
            animatorSet = this.animator;
            animatorListenerAdapter = new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    UpdateButton.this.animator = null;
                }
            };
        }
        animatorSet.addListener(animatorListenerAdapter);
        this.animator.start();
    }
}
