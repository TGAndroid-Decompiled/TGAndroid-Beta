package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TopicSeparator;

public abstract class BotAskCell extends View {
    private final TopicSeparator askBotForumSeparator;
    private int backgroundHeight;
    private final BotAskCellDrawable drawable;
    private final Theme.ResourcesProvider resourcesProvider;
    private float viewTop;

    public BotAskCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.drawable = new BotAskCellDrawable(context, i, resourcesProvider);
        TopicSeparator topicSeparator = new TopicSeparator(i, this, resourcesProvider, true);
        this.askBotForumSeparator = topicSeparator;
        topicSeparator.setText("");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = ((getMeasuredWidth() - this.drawable.width) + sideMenuWidth) / 2;
        int iDp = AndroidUtilities.dp(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f = sideMenuWidth;
        float f2 = f / 2.0f;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(measuredWidth2, this.backgroundHeight, f2, this.viewTop);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, measuredWidth2, this.backgroundHeight, f2, this.viewTop);
        }
        this.askBotForumSeparator.draw(canvas, getWidth(), f, 0.0f, 1.0f, 1.0f, false);
        BotAskCellDrawable botAskCellDrawable = this.drawable;
        botAskCellDrawable.setBounds(measuredWidth, iDp, botAskCellDrawable.width + measuredWidth, botAskCellDrawable.height + iDp);
        this.drawable.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(LayoutHelper.measureSpecExactly(View.MeasureSpec.getSize(i)), LayoutHelper.measureSpecExactly(AndroidUtilities.dp(40.0f) + this.drawable.height));
    }

    public void setDialogId(long j) {
        BotAskCellDrawable botAskCellDrawable = this.drawable;
        botAskCellDrawable.getClass();
        int i = (int) (AndroidUtilities.displaySize.x * 0.95f);
        TLRPC.User user = MessagesController.getInstance(botAskCellDrawable.currentAccount).getUser(Long.valueOf(j));
        Text text = botAskCellDrawable.text;
        text.multiline(1);
        text.setMaxWidth(9999.0f);
        text.setText(LocaleController.formatString(R.string.BotForumAskForStartNewChat, UserObject.getUserName(user)));
        float fCalculateRealWidth = (text.calculateRealWidth() / 2.0f) * 1.2f;
        text.multiline(4);
        float f = i;
        text.setMaxWidth(Math.min(f, fCalculateRealWidth));
        if (text.getLineCount() > 2) {
            text.setMaxWidth(Math.min(f, fCalculateRealWidth * 1.2f));
        }
        float fMax = Math.max(0.0f, text.calculateRealWidth());
        Text text2 = botAskCellDrawable.title;
        float fMin = Math.min(Math.max(fMax, text2.calculateRealWidth()) + AndroidUtilities.dp(32.0f), f);
        float height = text.getHeight() + text2.getHeight() + AndroidUtilities.dp(17.0f) + 0.0f + AndroidUtilities.dp(70.0f) + AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(5.0f);
        botAskCellDrawable.width = (int) fMin;
        botAskCellDrawable.height = (int) height;
    }

    public void setVisiblePart(float f, int i) {
        this.backgroundHeight = i;
        this.viewTop = f;
    }
}
