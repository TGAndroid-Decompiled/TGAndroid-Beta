package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
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
    private SimpleTextView updateTextView;

    public UpdateLayout(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(activity, viewGroup, viewGroup2);
        this.activity = activity;
        this.sideMenu = viewGroup;
        this.sideMenuContainer = viewGroup2;
    }

    @Override
    public void updateFileProgress(Object[] objArr) {
        if (this.updateTextView == null || !SharedConfig.isAppUpdateAvailable()) {
            return;
        }
        String str = (String) objArr[0];
        String attachFileName = FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document);
        if (attachFileName == null || !attachFileName.equals(str)) {
            return;
        }
        float longValue = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
        this.updateLayoutIcon.setProgress(longValue, true);
        this.updateTextView.setText(LocaleController.formatString("AppUpdateDownloading", R.string.AppUpdateDownloading, Integer.valueOf((int) (longValue * 100.0f))));
    }

    public void createUpdateUI(final int i) {
        if (this.sideMenuContainer == null) {
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
        SimpleTextView simpleTextView = new SimpleTextView(this.activity);
        this.updateTextView = simpleTextView;
        simpleTextView.setTextSize(15);
        this.updateTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.updateTextView.setText(LocaleController.getString("AppUpdate", R.string.AppUpdate));
        this.updateTextView.setTextColor(-1);
        this.updateTextView.setGravity(3);
        this.updateLayout.addView(this.updateTextView, LayoutHelper.createFrame(-2, -2.0f, 16, 74.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(this.activity);
        this.updateSizeTextView = textView;
        textView.setTextSize(1, 15.0f);
        this.updateSizeTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.updateSizeTextView.setGravity(5);
        this.updateSizeTextView.setTextColor(-1);
        this.updateLayout.addView(this.updateSizeTextView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    public void lambda$createUpdateUI$0(int i, View view) {
        if (SharedConfig.isAppUpdateAvailable()) {
            if (this.updateLayoutIcon.getIcon() == 2) {
                FileLoader.getInstance(i).loadFile(SharedConfig.pendingAppUpdate.document, "update", 1, 1);
                updateAppUpdateViews(i, true);
            } else if (this.updateLayoutIcon.getIcon() == 3) {
                FileLoader.getInstance(i).cancelLoadFile(SharedConfig.pendingAppUpdate.document);
                updateAppUpdateViews(i, true);
            } else {
                AndroidUtilities.openForView(SharedConfig.pendingAppUpdate.document, true, this.activity);
            }
        }
    }

    @Override
    public void updateAppUpdateViews(int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UpdateLayout.updateAppUpdateViews(int, boolean):void");
    }

    public static void lambda$updateAppUpdateViews$1(View view) {
        if (view != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
