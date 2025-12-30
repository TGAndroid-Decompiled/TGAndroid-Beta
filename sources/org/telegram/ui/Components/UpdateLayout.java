package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.IUpdateLayout;

public class UpdateLayout extends IUpdateLayout {
    private final Activity activity;
    private final ViewGroup sideMenuContainer;
    private LinearLayout updateLayout;
    private RadialProgress2 updateLayoutIcon;
    private TextView updateSizeTextView;
    private AnimatorSet updateTextAnimator;
    private TextView[] updateTextViews;

    public UpdateLayout(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.activity = activity;
        this.sideMenuContainer = viewGroup;
    }

    @Override
    public void updateFileProgress(Object[] objArr) {
        TextView[] textViewArr;
        if (this.updateLayout == null || (textViewArr = this.updateTextViews) == null || textViewArr[0] == null || !ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            return;
        }
        float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
        this.updateLayoutIcon.setProgress(downloadingUpdateProgress, true);
        this.updateTextViews[0].setText(LocaleController.formatString(2131690091, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
        this.updateLayout.invalidate();
    }

    public void createUpdateUI(final int i) {
        if (this.sideMenuContainer == null || this.updateLayout != null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.activity);
        this.updateLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.updateLayout.setGravity(17);
        this.updateLayout.setVisibility(4);
        this.updateLayout.setTranslationY(AndroidUtilities.dp(44.0f));
        this.updateLayout.setBackground(Theme.getSelectorDrawable(1090519039, false));
        this.sideMenuContainer.addView(this.updateLayout, LayoutHelper.createFrame(-1, 44, 83));
        this.updateLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createUpdateUI$0(i, view);
            }
        });
        View view = new View(this.activity) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                UpdateLayout.this.updateLayoutIcon.draw(canvas);
            }
        };
        RadialProgress2 radialProgress2 = new RadialProgress2(view);
        this.updateLayoutIcon = radialProgress2;
        int i2 = Theme.key_featuredStickers_addButton;
        radialProgress2.setColors(-1, -1, Theme.getColor(i2), Theme.getColor(i2));
        this.updateLayoutIcon.setProgressRect(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        this.updateLayoutIcon.setCircleRadius(AndroidUtilities.dp(11.0f));
        this.updateLayoutIcon.setAsMini();
        this.updateLayout.addView(view, LayoutHelper.createLinear(22, 22, 16));
        FrameLayout frameLayout = new FrameLayout(this.activity);
        this.updateTextViews = new TextView[2];
        for (int i3 = 0; i3 < 2; i3++) {
            this.updateTextViews[i3] = new TextView(this.activity);
            this.updateTextViews[i3].setTextSize(1, 15.0f);
            this.updateTextViews[i3].setTypeface(AndroidUtilities.bold());
            this.updateTextViews[i3].setTextColor(-1);
            this.updateTextViews[i3].setGravity(3);
            frameLayout.addView(this.updateTextViews[i3], LayoutHelper.createFrame(-2, -2.0f));
        }
        this.updateLayout.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 16, 12, 0, 0, 0));
        this.updateTextViews[0].setText(LocaleController.getString(2131690088));
        this.updateTextViews[1].setAlpha(0.0f);
        this.updateTextViews[1].setVisibility(8);
        TextView textView = new TextView(this.activity);
        this.updateSizeTextView = textView;
        textView.setTextSize(1, 15.0f);
        this.updateSizeTextView.setTypeface(AndroidUtilities.bold());
        this.updateSizeTextView.setGravity(5);
        this.updateSizeTextView.setTextColor(-1);
        this.updateLayout.addView(this.updateSizeTextView, LayoutHelper.createLinear(-2, -2, 21, 12, 0, 0, 0));
    }

    public void lambda$createUpdateUI$0(int i, View view) {
        if (this.updateLayoutIcon.getIcon() == 2) {
            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
            updateAppUpdateViews(i, true);
        } else if (this.updateLayoutIcon.getIcon() == 3) {
            ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
            updateAppUpdateViews(i, true);
        } else {
            File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
            if (downloadedUpdateFile != null) {
                AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", this.activity, null, false);
            }
        }
    }

    @Override
    public void updateAppUpdateViews(int i, boolean z) {
        if (this.sideMenuContainer == null) {
            return;
        }
        if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
            createUpdateUI(i);
            this.updateSizeTextView.setText("");
            File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
            if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                this.updateLayoutIcon.setIcon(15, true, z);
                setUpdateText(LocaleController.getString(2131690092), z);
            } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                this.updateLayoutIcon.setIcon(3, true, z);
                this.updateLayoutIcon.setProgress(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                setUpdateText(LocaleController.formatString(2131690091, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z);
            } else {
                this.updateLayoutIcon.setIcon(2, true, z);
                setUpdateText(LocaleController.getString(2131690088), z);
            }
            if (this.updateSizeTextView.getTag() == null) {
                if (z) {
                    this.updateSizeTextView.setTag(1);
                    this.updateSizeTextView.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                } else {
                    this.updateSizeTextView.setAlpha(0.0f);
                    this.updateSizeTextView.setScaleX(0.0f);
                    this.updateSizeTextView.setScaleY(0.0f);
                }
            }
            if (this.updateLayout.getTag() != null) {
                return;
            }
            this.updateLayout.setVisibility(0);
            this.updateLayout.setTag(1);
            if (z) {
                this.updateLayout.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT).setListener(null).setDuration(180L).start();
                return;
            } else {
                this.updateLayout.setTranslationY(0.0f);
                return;
            }
        }
        LinearLayout linearLayout = this.updateLayout;
        if (linearLayout == null || linearLayout.getTag() == null) {
            return;
        }
        this.updateLayout.setTag(null);
        if (z) {
            this.updateLayout.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (UpdateLayout.this.updateLayout.getTag() == null) {
                        UpdateLayout.this.updateLayout.setVisibility(4);
                    }
                }
            }).setDuration(180L).start();
        } else {
            this.updateLayout.setTranslationY(AndroidUtilities.dp(44.0f));
            this.updateLayout.setVisibility(4);
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
        if (z) {
            TextView[] textViewArr = this.updateTextViews;
            textViewArr[1].setText(textViewArr[0].getText());
            this.updateTextViews[0].setText(str);
            this.updateTextViews[0].setAlpha(0.0f);
            this.updateTextViews[1].setAlpha(1.0f);
            this.updateTextViews[0].setVisibility(0);
            this.updateTextViews[1].setVisibility(0);
            ArrayList arrayList = new ArrayList();
            TextView textView = this.updateTextViews[1];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.updateTextViews[0], (Property<TextView, Float>) property, 1.0f));
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
            return;
        }
        this.updateTextViews[0].setText(str);
        this.updateTextViews[0].setAlpha(1.0f);
        this.updateTextViews[0].setVisibility(0);
        this.updateTextViews[1].setVisibility(8);
    }
}
