package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.IUpdateLayout;

public class UpdateLayout extends IUpdateLayout {
    private Activity activity;
    private ViewGroup sideMenu;
    private ViewGroup sideMenuContainer;
    private FrameLayout updateLayout;
    private RadialProgress2 updateLayoutIcon;
    private TextView updateSizeTextView;
    private AnimatorSet updateTextAnimator;
    private SimpleTextView[] updateTextViews;

    public UpdateLayout(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(activity, viewGroup, viewGroup2);
        this.activity = activity;
        this.sideMenu = viewGroup;
        this.sideMenuContainer = viewGroup2;
    }

    public void lambda$createUpdateUI$0(int i, View view) {
        if (SharedConfig.isAppUpdateAvailable()) {
            if (this.updateLayoutIcon.getIcon() == 2) {
                FileLoader.getInstance(i).loadFile(SharedConfig.pendingAppUpdate.document, "update", 1, 1);
            } else {
                if (this.updateLayoutIcon.getIcon() != 3) {
                    AndroidUtilities.openForView(SharedConfig.pendingAppUpdate.document, true, this.activity);
                    return;
                }
                FileLoader.getInstance(i).cancelLoadFile(SharedConfig.pendingAppUpdate.document);
            }
            updateAppUpdateViews(i, true);
        }
    }

    private void setUpdateText(String str, boolean z) {
        if (TextUtils.equals(this.updateTextViews[0].getText(), str)) {
            return;
        }
        AnimatorSet animatorSet = this.updateTextAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.updateTextAnimator = null;
        }
        if (!z) {
            this.updateTextViews[0].setText(str);
            this.updateTextViews[0].setAlpha(1.0f);
            this.updateTextViews[0].setVisibility(0);
            this.updateTextViews[1].setVisibility(8);
            return;
        }
        SimpleTextView[] simpleTextViewArr = this.updateTextViews;
        simpleTextViewArr[1].setText(simpleTextViewArr[0].getText());
        this.updateTextViews[0].setText(str);
        this.updateTextViews[0].setAlpha(0.0f);
        this.updateTextViews[1].setAlpha(1.0f);
        this.updateTextViews[0].setVisibility(0);
        this.updateTextViews[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        SimpleTextView simpleTextView = this.updateTextViews[1];
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.updateTextViews[0], (Property<SimpleTextView, Float>) property, 1.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.updateTextAnimator = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.updateTextAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (UpdateLayout.this.updateTextAnimator == animator) {
                    UpdateLayout.this.updateTextViews[1].setVisibility(8);
                    UpdateLayout.this.updateTextAnimator = null;
                }
            }
        });
        this.updateTextAnimator.setDuration(320L);
        this.updateTextAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.updateTextAnimator.start();
    }

    public void createUpdateUI(final int i) {
        if (this.sideMenuContainer == null || this.updateLayout != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.activity) {
            private int lastGradientWidth;
            private LinearGradient updateGradient;
            private Paint paint = new Paint();
            private Matrix matrix = new Matrix();

            @Override
            public void draw(Canvas canvas) {
                if (this.updateGradient != null) {
                    this.paint.setColor(-1);
                    this.paint.setShader(this.updateGradient);
                    this.updateGradient.setLocalMatrix(this.matrix);
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                    UpdateLayout.this.updateLayoutIcon.setBackgroundGradientDrawable(this.updateGradient);
                    UpdateLayout.this.updateLayoutIcon.draw(canvas);
                }
                super.draw(canvas);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                int size = View.MeasureSpec.getSize(i2);
                if (this.lastGradientWidth != size) {
                    this.updateGradient = new LinearGradient(0.0f, 0.0f, size, 0.0f, new int[]{-9846926, -11291731}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.lastGradientWidth = size;
                }
            }
        };
        this.updateLayout = frameLayout;
        frameLayout.setWillNotDraw(false);
        this.updateLayout.setVisibility(4);
        this.updateLayout.setTranslationY(AndroidUtilities.dp(44.0f));
        if (Build.VERSION.SDK_INT >= 21) {
            this.updateLayout.setBackground(Theme.getSelectorDrawable(1090519039, false));
        }
        this.sideMenuContainer.addView(this.updateLayout, LayoutHelper.createFrame(-1, 44, 83));
        this.updateLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                UpdateLayout.this.lambda$createUpdateUI$0(i, view);
            }
        });
        RadialProgress2 radialProgress2 = new RadialProgress2(this.updateLayout);
        this.updateLayoutIcon = radialProgress2;
        radialProgress2.setColors(-1, -1, -1, -1);
        this.updateLayoutIcon.setProgressRect(AndroidUtilities.dp(22.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(33.0f));
        this.updateLayoutIcon.setCircleRadius(AndroidUtilities.dp(11.0f));
        this.updateLayoutIcon.setAsMini();
        this.updateTextViews = new SimpleTextView[2];
        for (int i2 = 0; i2 < 2; i2++) {
            this.updateTextViews[i2] = new SimpleTextView(this.activity);
            this.updateTextViews[i2].setTextSize(15);
            this.updateTextViews[i2].setTypeface(AndroidUtilities.bold());
            this.updateTextViews[i2].setTextColor(-1);
            this.updateTextViews[i2].setGravity(3);
            this.updateLayout.addView(this.updateTextViews[i2], LayoutHelper.createFrame(-2, -2.0f, 16, 74.0f, 0.0f, 0.0f, 0.0f));
        }
        this.updateTextViews[0].setText(LocaleController.getString(2131689986));
        this.updateTextViews[1].setAlpha(0.0f);
        this.updateTextViews[1].setVisibility(8);
        TextView textView = new TextView(this.activity);
        this.updateSizeTextView = textView;
        textView.setTextSize(1, 15.0f);
        this.updateSizeTextView.setTypeface(AndroidUtilities.bold());
        this.updateSizeTextView.setGravity(5);
        this.updateSizeTextView.setTextColor(-1);
        this.updateLayout.addView(this.updateSizeTextView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public void updateAppUpdateViews(int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UpdateLayout.updateAppUpdateViews(int, boolean):void");
    }

    @Override
    public void updateFileProgress(Object[] objArr) {
        SimpleTextView[] simpleTextViewArr = this.updateTextViews;
        if (simpleTextViewArr == null || objArr == null || simpleTextViewArr[0] == null || !SharedConfig.isAppUpdateAvailable()) {
            return;
        }
        String str = (String) objArr[0];
        String attachFileName = FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document);
        if (attachFileName == null || !attachFileName.equals(str)) {
            return;
        }
        float longValue = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
        this.updateLayoutIcon.setProgress(longValue, true);
        this.updateTextViews[0].setText(LocaleController.formatString("AppUpdateDownloading", 2131689989, Integer.valueOf((int) (longValue * 100.0f))));
    }
}
