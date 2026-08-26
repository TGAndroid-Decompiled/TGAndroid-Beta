package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.IUpdateLayout;

public final class UpdateLayout extends IUpdateLayout {
    public final Activity activity;
    public final ViewGroup sideMenuContainer;
    public FrameLayout updateLayout;
    public RadialProgress2 updateLayoutIcon;
    public AnonymousClass1 updateTextView;

    public UpdateLayout(Activity activity, ViewGroup viewGroup) {
        this.activity = activity;
        this.sideMenuContainer = viewGroup;
    }

    public final void createUpdateUI(int i) {
        ViewGroup viewGroup = this.sideMenuContainer;
        if (viewGroup == null || this.updateLayout != null) {
            return;
        }
        Activity activity = this.activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.updateLayout = frameLayout;
        frameLayout.setVisibility(4);
        this.updateLayout.setTranslationY(AndroidUtilities.dp(44.0f));
        this.updateLayout.setBackground(Theme.getSelectorDrawable(1090519039, false));
        viewGroup.addView(this.updateLayout, LayoutHelper.createFrame(-1, 44, 83));
        this.updateLayout.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i, 9));
        ?? r8 = new AnimatedTextView(activity) {
            @Override
            public final void onDraw(Canvas canvas) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - width()) / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(11.0f));
                UpdateLayout.this.updateLayoutIcon.draw(canvas);
                canvas.restore();
            }
        };
        this.updateTextView = r8;
        r8.setTextSize(AndroidUtilities.dp(15.0f));
        setTypeface(AndroidUtilities.bold());
        setTextColor(-1);
        setGravity(17);
        this.updateLayout.addView(this.updateTextView, LayoutHelper.createFrame(-1.0f, -1));
        setText(LocaleController.getString(2131690208), false);
        RadialProgress2 radialProgress2 = new RadialProgress2(this.updateTextView);
        this.updateLayoutIcon = radialProgress2;
        int i2 = Theme.key_featuredStickers_addButton;
        radialProgress2.setColors(-1, -1, Theme.getColor(null, i2, false), Theme.getColor(null, i2, false));
        this.updateLayoutIcon.setProgressRect(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        this.updateLayoutIcon.setCircleRadius(AndroidUtilities.dp(11.0f));
        MediaActionDrawable mediaActionDrawable = this.updateLayoutIcon.mediaActionDrawable;
        mediaActionDrawable.isMini = true;
        mediaActionDrawable.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void setUpdateText(String str, boolean z) {
        setText(str, z);
    }

    @Override
    public final void updateAppUpdateViews(int i, boolean z) {
        if (this.sideMenuContainer == null) {
            return;
        }
        if (ApplicationLoader.applicationLoaderInstance.getUpdate() == null) {
            FrameLayout frameLayout = this.updateLayout;
            if (frameLayout == null || frameLayout.getTag() == null) {
                return;
            }
            this.updateLayout.setTag(null);
            if (z) {
                this.updateLayout.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT).setListener(new Tooltip.AnonymousClass1(this, 17)).setDuration(180L).start();
                return;
            } else {
                this.updateLayout.setTranslationY(AndroidUtilities.dp(44.0f));
                this.updateLayout.setVisibility(4);
                return;
            }
        }
        createUpdateUI(i);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
            this.updateLayoutIcon.setIcon(15, true, z);
            setUpdateText(LocaleController.getString(2131690212), z);
        } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            this.updateLayoutIcon.setIcon(3, true, z);
            this.updateLayoutIcon.setProgress(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
            setUpdateText(LocaleController.formatString(2131690211, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z);
        } else {
            this.updateLayoutIcon.setIcon(2, true, z);
            setUpdateText(LocaleController.getString(2131690208), z);
        }
        if (this.updateLayout.getTag() != null) {
            return;
        }
        this.updateLayout.setVisibility(0);
        this.updateLayout.setTag(1);
        if (z) {
            this.updateLayout.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT).setListener(null).setDuration(180L).start();
        } else {
            this.updateLayout.setTranslationY(0.0f);
        }
    }

    @Override
    public final void updateFileProgress() {
        if (this.updateLayout == null || this.updateTextView == null || !ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            return;
        }
        float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
        this.updateLayoutIcon.setProgress(downloadingUpdateProgress, true);
        setText(LocaleController.formatString(2131690211, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
        this.updateLayout.invalidate();
    }
}
