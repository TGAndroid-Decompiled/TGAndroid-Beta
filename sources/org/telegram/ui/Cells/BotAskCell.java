package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TopicSeparator;

public abstract class BotAskCell extends View {
    private final TopicSeparator askBotForumSeparator;
    private int backgroundHeight;
    private final BotAskCellDrawable drawable;
    private final Theme.ResourcesProvider resourcesProvider;
    private float viewTop;

    public int getSideMenuWidth() {
        return 0;
    }

    public BotAskCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.drawable = new BotAskCellDrawable(context, i, resourcesProvider);
        TopicSeparator topicSeparator = new TopicSeparator(i, this, resourcesProvider, true);
        this.askBotForumSeparator = topicSeparator;
        topicSeparator.setText("");
    }

    public void setDialogId(long j) {
        this.drawable.set(j);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(LayoutHelper.measureSpecExactly(View.MeasureSpec.getSize(i)), LayoutHelper.measureSpecExactly(this.drawable.getBubbleHeight() + AndroidUtilities.dp(40.0f)));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = ((getMeasuredWidth() - this.drawable.getBubbleWidth()) + sideMenuWidth) / 2;
        int iDp = AndroidUtilities.dp(34.0f);
        float f = sideMenuWidth;
        applyServiceShaderMatrix(getMeasuredWidth(), f / 2.0f);
        this.askBotForumSeparator.draw(canvas, getWidth(), f, 0.0f, 1.0f, 1.0f, false);
        BotAskCellDrawable botAskCellDrawable = this.drawable;
        botAskCellDrawable.setBounds(measuredWidth, iDp, botAskCellDrawable.getBubbleWidth() + measuredWidth, this.drawable.getBubbleHeight() + iDp);
        this.drawable.draw(canvas);
    }

    public void setVisiblePart(float f, int i) {
        this.backgroundHeight = i;
        this.viewTop = f;
    }

    private void applyServiceShaderMatrix(int i, float f) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(i, this.backgroundHeight, f, this.viewTop);
        } else {
            Theme.applyServiceShaderMatrix(i, this.backgroundHeight, f, this.viewTop);
        }
    }
}
